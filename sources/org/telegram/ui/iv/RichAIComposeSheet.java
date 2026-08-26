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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
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
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.BotDownloads$$ExternalSyntheticLambda0;
import org.telegram.ui.bots.BotSensors$1$$ExternalSyntheticLambda0;

public final class RichAIComposeSheet extends BottomSheetWithRecyclerListView {
    public UniversalAdapter adapter;
    public final ButtonWithCounterView button;
    public final int currentAccount;
    public boolean loading;
    public final Utilities.Callback onAddToPage;
    public final FrameLayout previewBox;
    public final RichMessageLayout.PreviewView previewView;
    public final FrameLayout promptBox;
    public final EditTextCell promptCell;
    public int reqId;
    public TL_iv.RichMessage result;
    public final FrameLayout topView;

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
        textView.setText(LocaleController.getString(R.string.ArticleAICreate));
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
        final int i4 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final RichAIComposeSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        this.f$0.lambda$new$0$20(view);
                        break;
                    default:
                        RichAIComposeSheet richAIComposeSheet = this.f$0;
                        if (!richAIComposeSheet.loading) {
                            TL_iv.RichMessage richMessage = richAIComposeSheet.result;
                            if (richMessage == null) {
                                EditTextCell editTextCell = richAIComposeSheet.promptCell;
                                String strTrim = editTextCell.editText.getText().toString().trim();
                                if (!TextUtils.isEmpty(strTrim)) {
                                    richAIComposeSheet.loading = true;
                                    richAIComposeSheet.button.setLoading(true);
                                    TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                    inputaicomposetonesingleuse.custom_prompt = strTrim;
                                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                    richAIComposeSheet.reqId = ConnectionsManager.getInstance(richAIComposeSheet.currentAccount).sendRequest(tL_messages_composeRichMessageWithAI, new RichMediaUploader$$ExternalSyntheticLambda0(richAIComposeSheet, 27));
                                    AndroidUtilities.hideKeyboard(editTextCell.editText);
                                    break;
                                }
                            } else {
                                Utilities.Callback callback2 = richAIComposeSheet.onAddToPage;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                richAIComposeSheet.lambda$showGiftOfferSheet$15();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        frameLayout.addView(imageView, LayoutHelper.createFrame(48, 48.0f, 53, 0.0f, 10.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.previewBox = frameLayout2;
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, i, resourcesProvider);
        this.previewView = previewView;
        previewView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
        int iDp = AndroidUtilities.dp(12.0f);
        int i5 = Theme.key_windowBackgroundWhite;
        previewView.setBackground(Theme.createRoundRectDrawable(iDp, Theme.getColor(i5, resourcesProvider)));
        frameLayout2.addView(previewView, LayoutHelper.createFrame(-1, -2.0f));
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.promptBox = frameLayout3;
        EditTextCell editTextCell = new EditTextCell(context, LocaleController.getString(R.string.ArticleAIPrompt), true, false, MessagesController.getInstance(i).config.aicomposeTonePromptLengthMax.get(), resourcesProvider);
        this.promptCell = editTextCell;
        editTextCell.editText.setImeOptions(6);
        editTextCell.editText.setMaxLines(5);
        editTextCell.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(20.0f), Theme.getColor(i5, resourcesProvider)));
        editTextCell.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                RichAIComposeSheet richAIComposeSheet = RichAIComposeSheet.this;
                if (richAIComposeSheet.result != null) {
                    richAIComposeSheet.result = null;
                    richAIComposeSheet.button.setText(LocaleController.getString(R.string.ArticleAIGenerate), true);
                    UniversalAdapter universalAdapter = richAIComposeSheet.adapter;
                    if (universalAdapter != null) {
                        universalAdapter.update(true);
                    }
                }
                richAIComposeSheet.updateButtonEnabled();
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            }
        });
        frameLayout3.addView(editTextCell, LayoutHelper.createFrame(-1, -2.0f));
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        ButtonWithCounterView round = new ButtonWithCounterView(context, true, resourcesProvider).setRound();
        this.button = round;
        round.setText(LocaleController.getString(R.string.ArticleAIGenerate), false);
        final int i6 = 1;
        round.setOnClickListener(new View.OnClickListener(this) {
            public final RichAIComposeSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i6) {
                    case 0:
                        this.f$0.lambda$new$0$20(view);
                        break;
                    default:
                        RichAIComposeSheet richAIComposeSheet = this.f$0;
                        if (!richAIComposeSheet.loading) {
                            TL_iv.RichMessage richMessage = richAIComposeSheet.result;
                            if (richMessage == null) {
                                EditTextCell editTextCell2 = richAIComposeSheet.promptCell;
                                String strTrim = editTextCell2.editText.getText().toString().trim();
                                if (!TextUtils.isEmpty(strTrim)) {
                                    richAIComposeSheet.loading = true;
                                    richAIComposeSheet.button.setLoading(true);
                                    TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                    inputaicomposetonesingleuse.custom_prompt = strTrim;
                                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                    richAIComposeSheet.reqId = ConnectionsManager.getInstance(richAIComposeSheet.currentAccount).sendRequest(tL_messages_composeRichMessageWithAI, new RichMediaUploader$$ExternalSyntheticLambda0(richAIComposeSheet, 27));
                                    AndroidUtilities.hideKeyboard(editTextCell2.editText);
                                    break;
                                }
                            } else {
                                Utilities.Callback callback2 = richAIComposeSheet.onAddToPage;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                richAIComposeSheet.lambda$showGiftOfferSheet$15();
                                break;
                            }
                        }
                        break;
                }
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
        this.recyclerListView.lambda$onCellEnter$52(defaultItemAnimator);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i7 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i7, 0, i7, AndroidUtilities.dp(72.0f));
        this.recyclerListView.setClipToPadding(false);
        this.adapter.update(false);
        updateButtonEnabled();
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new BotDownloads$$ExternalSyntheticLambda0(this, 18), this.resourcesProvider);
        this.adapter = universalAdapter;
        return universalAdapter;
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        if (this.reqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
            this.reqId = 0;
        }
        AndroidUtilities.hideKeyboard(this.promptCell.editText);
        super.lambda$showGiftOfferSheet$15();
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.ArticleAICreate);
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new BotSensors$1$$ExternalSyntheticLambda0(this, 26), 200L);
    }

    public final void updateButtonEnabled() {
        TL_iv.RichMessage richMessage = this.result;
        ButtonWithCounterView buttonWithCounterView = this.button;
        if (richMessage != null) {
            buttonWithCounterView.setEnabled(true);
        } else {
            buttonWithCounterView.setEnabled(!TextUtils.isEmpty(this.promptCell.editText.getText().toString().trim()));
        }
    }
}
