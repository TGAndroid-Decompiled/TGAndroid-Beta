package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class RichAIComposeSheet extends BottomSheetWithRecyclerListView {
    private UniversalAdapter adapter;
    private final ButtonWithCounterView button;
    private final int currentAccount;
    private boolean loading;
    private final Utilities.Callback onAddToPage;
    private final FrameLayout previewBox;
    private final RichMessageLayout.PreviewView previewView;
    private final FrameLayout promptBox;
    private final EditTextCell promptCell;
    private int reqId;
    private TL_iv.RichMessage result;
    private final FrameLayout topView;

    public RichAIComposeSheet(Context context, int i, Theme.ResourcesProvider resourcesProvider, Utilities.Callback callback) {
        super(context, null, true, false, false, resourcesProvider);
        this.currentAccount = i;
        this.onAddToPage = callback;
        int i2 = Theme.key_windowBackgroundGray;
        setBackgroundColor(Theme.getColor(i2, resourcesProvider));
        fixNavigationBar(Theme.getColor(i2, resourcesProvider));
        FrameLayout frameLayout = new FrameLayout(context);
        this.topView = frameLayout;
        TextView textView = new TextView(context);
        textView.setText("Create with AI");
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i3, resourcesProvider));
        textView.setGravity(19);
        frameLayout.addView(textView, LayoutHelper.createFrame(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.headerPaddingTop = AndroidUtilities.dp(-8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i3, resourcesProvider), PorterDuff.Mode.SRC_IN));
        ScaleStateListAnimator.apply(imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$0(view);
            }
        });
        frameLayout.addView(imageView, LayoutHelper.createFrame(48, 48.0f, 53, 0.0f, 10.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.previewBox = frameLayout2;
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, i, resourcesProvider);
        this.previewView = previewView;
        previewView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
        int iDp = AndroidUtilities.dp(12.0f);
        int i4 = Theme.key_windowBackgroundWhite;
        previewView.setBackground(Theme.createRoundRectDrawable(iDp, Theme.getColor(i4, resourcesProvider)));
        frameLayout2.addView(previewView, LayoutHelper.createFrame(-1, -2.0f));
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.promptBox = frameLayout3;
        EditTextCell editTextCell = new EditTextCell(context, "Write a prompt...", true, false, -1, resourcesProvider);
        this.promptCell = editTextCell;
        editTextCell.editText.setImeOptions(6);
        editTextCell.editText.setMaxLines(5);
        editTextCell.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(20.0f), Theme.getColor(i4, resourcesProvider)));
        editTextCell.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (RichAIComposeSheet.this.result != null) {
                    RichAIComposeSheet.this.resetResult();
                }
                RichAIComposeSheet.this.updateButtonEnabled();
            }
        });
        frameLayout3.addView(editTextCell, LayoutHelper.createFrame(-1, -2.0f));
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        ButtonWithCounterView round = new ButtonWithCounterView(context, resourcesProvider).setRound();
        this.button = round;
        round.setText("Generate", false);
        round.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$1(view);
            }
        });
        this.containerView.addView(round, LayoutHelper.createFrame(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ((ViewGroup.MarginLayoutParams) round.getLayoutParams()).leftMargin += this.backgroundPaddingLeft;
        ((ViewGroup.MarginLayoutParams) round.getLayoutParams()).rightMargin += this.backgroundPaddingLeft;
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i5 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i5, 0, i5, AndroidUtilities.dp(72.0f));
        this.adapter.update(false);
        updateButtonEnabled();
    }

    public void lambda$new$0(View view) {
        lambda$new$0();
    }

    public void lambda$new$1(View view) {
        onButtonClick();
    }

    @Override
    public void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$show$2();
            }
        }, 150L);
    }

    public void lambda$show$2() {
        AndroidUtilities.showKeyboard(this.promptCell.editText);
    }

    @Override
    protected CharSequence getTitle() {
        return "Create with AI";
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        return universalAdapter;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asCustom(1, this.topView));
        if (this.result != null) {
            arrayList.add(UItem.asCustom(2, this.previewBox));
        }
        arrayList.add(UItem.asCustom(3, this.promptBox));
    }

    public void updateButtonEnabled() {
        if (this.result != null) {
            this.button.setEnabled(true);
        } else {
            this.button.setEnabled(true ^ TextUtils.isEmpty(this.promptCell.editText.getText().toString().trim()));
        }
    }

    private void onButtonClick() {
        if (this.loading) {
            return;
        }
        TL_iv.RichMessage richMessage = this.result;
        if (richMessage != null) {
            Utilities.Callback callback = this.onAddToPage;
            if (callback != null) {
                callback.run(richMessage);
            }
            lambda$new$0();
            return;
        }
        String strTrim = this.promptCell.editText.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        this.loading = true;
        this.button.setLoading(true);
        TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
        TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
        inputaicomposetonesingleuse.custom_prompt = strTrim;
        tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
        this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_composeRichMessageWithAI, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$onButtonClick$4(tLObject, tL_error);
            }
        });
    }

    public void lambda$onButtonClick$4(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onButtonClick$3(tLObject);
            }
        });
    }

    public void lambda$onButtonClick$3(TLObject tLObject) {
        this.loading = false;
        this.reqId = 0;
        this.button.setLoading(false);
        if (tLObject instanceof TLRPC.TL_composedRichMessageWithAI) {
            showResult(((TLRPC.TL_composedRichMessageWithAI) tLObject).result);
        } else {
            AndroidUtilities.shakeViewSpring(this.button, 4.0f);
        }
    }

    private void showResult(TL_iv.RichMessage richMessage) {
        if (richMessage == null) {
            AndroidUtilities.shakeViewSpring(this.button, 4.0f);
            return;
        }
        this.result = richMessage;
        this.previewView.set(richMessage);
        this.button.setText("Add to page", true);
        updateButtonEnabled();
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter != null) {
            universalAdapter.update(true);
        }
    }

    public void resetResult() {
        if (this.result == null) {
            return;
        }
        this.result = null;
        this.button.setText("Generate", true);
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter != null) {
            universalAdapter.update(true);
        }
    }

    @Override
    public void lambda$new$0() {
        if (this.reqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
            this.reqId = 0;
        }
        AndroidUtilities.hideKeyboard(this.promptCell.editText);
        super.lambda$new$0();
    }
}
