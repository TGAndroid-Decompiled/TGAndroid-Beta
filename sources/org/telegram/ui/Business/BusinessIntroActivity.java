package org.telegram.ui.Business;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatGreetingsView;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalFragment;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;
import org.telegram.ui.Stories.recorder.PreviewView;

public class BusinessIntroActivity extends UniversalFragment implements NotificationCenter.NotificationCenterDelegate {
    private ChatAttachAlert chatAttachAlert;
    private String currentMessage;
    private long currentSticker;
    private String currentTitle;
    private ActionBarMenuItem doneButton;
    private CrossfadeDrawable doneButtonDrawable;
    private ChatGreetingsView greetingsView;
    private Drawable greetingsViewBackground;
    private TLRPC.InputDocument inputSticker;
    private String inputStickerPath;
    private boolean keyboardVisible;
    private EditTextCell messageEdit;
    private FrameLayout previewContainer;
    private EditTextCell titleEdit;
    private boolean valueSet;
    private final Runnable updateRandomStickerRunnable = new Runnable() {
        @Override
        public final void run() {
            this.f$0.updateRandomSticker();
        }
    };
    private boolean stickerRandom = true;
    private TLRPC.Document sticker = getMediaDataController().getGreetingsSticker();
    private boolean clearVisible = isEmpty();
    private int shiftDp = -4;

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    protected boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
        return false;
    }

    @Override
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        MediaDataController.getInstance(this.currentAccount).checkStickers(0);
        MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    public void updateRandomSticker() {
        ChatGreetingsView chatGreetingsView = this.greetingsView;
        if (chatGreetingsView != null && chatGreetingsView.isAttachedToWindow() && this.stickerRandom) {
            this.greetingsView.setNextSticker(MediaDataController.getInstance(this.currentAccount).getGreetingsSticker(), new Runnable() {
                @Override
                public final void run() {
                    BusinessIntroActivity.$r8$lambda$PbARWy0eIoa8MmB0N1zQfcVqoSc(this.f$0);
                }
            });
        }
    }

    public static void $r8$lambda$PbARWy0eIoa8MmB0N1zQfcVqoSc(BusinessIntroActivity businessIntroActivity) {
        AndroidUtilities.cancelRunOnUIThread(businessIntroActivity.updateRandomStickerRunnable);
        AndroidUtilities.runOnUIThread(businessIntroActivity.updateRandomStickerRunnable, 5000L);
    }

    @Override
    protected CharSequence getTitle() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override
    public View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        this.greetingsView = new ChatGreetingsView(context, getUserConfig().getCurrentUser(), this.currentAccount, this.sticker, getResourceProvider()) {
            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                setPivotX(getMeasuredWidth() / 2.0f);
                setPivotY(getMeasuredHeight());
            }
        };
        FrameLayout frameLayout = new FrameLayout(context) {
            int minHeight = -1;
            private final Rect bg = new Rect();
            private final AnimatedFloat width = new AnimatedFloat(this, 220, CubicBezierInterpolator.EASE_OUT_QUINT);

            @Override
            protected void onMeasure(int i, int i2) {
                BusinessIntroActivity.this.greetingsView.measure(i, i2);
                invalidate();
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(this.minHeight, BusinessIntroActivity.this.greetingsView.getMeasuredHeight() + AndroidUtilities.dp(36.0f)), 1073741824));
                if (this.minHeight < 0) {
                    this.minHeight = getMeasuredHeight();
                }
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                float width = getWidth() / 2.0f;
                float f = this.width.set(BusinessIntroActivity.this.greetingsView.getWidth()) / 2.0f;
                this.bg.set((int) (width - (BusinessIntroActivity.this.greetingsView.getScaleX() * f)), (int) (BusinessIntroActivity.this.greetingsView.getY() + (BusinessIntroActivity.this.greetingsView.getHeight() * (1.0f - BusinessIntroActivity.this.greetingsView.getScaleY()))), (int) (width + (f * BusinessIntroActivity.this.greetingsView.getScaleX())), (int) (BusinessIntroActivity.this.greetingsView.getY() + BusinessIntroActivity.this.greetingsView.getHeight()));
                BusinessIntroActivity.this.greetingsViewBackground.setBounds(this.bg);
                BusinessIntroActivity.this.greetingsViewBackground.draw(canvas);
                return super.drawChild(canvas, view, j);
            }
        };
        this.previewContainer = frameLayout;
        frameLayout.setWillNotDraw(false);
        this.greetingsViewBackground = Theme.createServiceDrawable(AndroidUtilities.dp(16.0f), this.greetingsView, this.previewContainer, getThemedPaint("paintChatActionBackground"));
        this.greetingsView.setBackground(new ColorDrawable(0));
        ImageView imageView = new ImageView(context) {
            @Override
            protected void onMeasure(int i, int i2) {
                float f;
                float f2;
                super.onMeasure(i, i2);
                Matrix imageMatrix = getImageMatrix();
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                int intrinsicWidth = getDrawable().getIntrinsicWidth();
                int intrinsicHeight = getDrawable().getIntrinsicHeight();
                if (intrinsicWidth * measuredHeight > intrinsicHeight * measuredWidth) {
                    f = measuredHeight;
                    f2 = intrinsicHeight;
                } else {
                    f = measuredWidth;
                    f2 = intrinsicWidth;
                }
                float f3 = f / f2;
                imageMatrix.setScale(f3, f3);
                setImageMatrix(imageMatrix);
            }
        };
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        imageView.setImageDrawable(PreviewView.getBackgroundDrawable((Drawable) null, this.currentAccount, getUserConfig().getClientUserId(), Theme.isCurrentThemeDark()));
        this.previewContainer.addView(imageView, LayoutHelper.createFrame(-1, -1, 119));
        this.previewContainer.addView(this.greetingsView, LayoutHelper.createFrame(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        boolean z = false;
        EditTextCell editTextCell = new EditTextCell(context, LocaleController.getString(R.string.BusinessIntroTitleHint), false, z, getMessagesController().introTitleLengthLimit, this.resourceProvider) {
            @Override
            protected void onTextChanged(CharSequence charSequence) {
                BusinessIntroActivity.this.greetingsView.setPreview(BusinessIntroActivity.this.titleEdit.getText().toString(), BusinessIntroActivity.this.messageEdit.getText().toString());
                BusinessIntroActivity.this.checkDone(true, true);
            }

            @Override
            protected void onFocusChanged(boolean z2) {
                UniversalRecyclerView universalRecyclerView;
                if (!z2 || (universalRecyclerView = BusinessIntroActivity.this.listView) == null) {
                    return;
                }
                universalRecyclerView.smoothScrollToPosition(2);
            }
        };
        this.titleEdit = editTextCell;
        editTextCell.autofocused = true;
        editTextCell.setShowLimitOnFocus(true);
        EditTextCell editTextCell2 = this.titleEdit;
        int i = Theme.key_windowBackgroundWhite;
        editTextCell2.setBackgroundColor(getThemedColor(i));
        this.titleEdit.setDivider(true);
        this.titleEdit.hideKeyboardOnEnter();
        EditTextCell editTextCell3 = new EditTextCell(context, LocaleController.getString(R.string.BusinessIntroMessageHint), true, z, getMessagesController().introDescriptionLengthLimit, this.resourceProvider) {
            @Override
            protected void onTextChanged(CharSequence charSequence) {
                BusinessIntroActivity.this.greetingsView.setPreview(BusinessIntroActivity.this.titleEdit.getText().toString(), BusinessIntroActivity.this.messageEdit.getText().toString());
                BusinessIntroActivity.this.checkDone(true, true);
            }

            @Override
            protected void onFocusChanged(boolean z2) {
                UniversalRecyclerView universalRecyclerView;
                if (!z2 || (universalRecyclerView = BusinessIntroActivity.this.listView) == null) {
                    return;
                }
                universalRecyclerView.smoothScrollToPosition(3);
            }
        };
        this.messageEdit = editTextCell3;
        editTextCell3.setShowLimitOnFocus(true);
        this.messageEdit.setBackgroundColor(getThemedColor(i));
        this.messageEdit.setDivider(true);
        this.messageEdit.hideKeyboardOnEnter();
        this.greetingsView.setPreview("", "");
        super.createView(context);
        this.listView.setSections();
        this.listView.adapter.setApplyBackground(false);
        this.actionBar.setAdaptiveBackground(this.listView);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    if (BusinessIntroActivity.this.onBackPressed(true)) {
                        BusinessIntroActivity.this.finishFragment();
                    }
                } else if (i2 == 1) {
                    BusinessIntroActivity.this.processDone();
                }
            }
        });
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i2 = Theme.key_actionBarDefaultIcon;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2), PorterDuff.Mode.MULTIPLY));
        this.doneButtonDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(i2)));
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(1, this.doneButtonDrawable, AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done));
        checkDone(false, true);
        this.listView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                BusinessIntroActivity.this.updateGreetingScale();
            }
        });
        this.listView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                BusinessIntroActivity.this.updateGreetingScale();
            }
        });
        this.listView.doNotDetachViews();
        this.listView.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        setValue();
        new KeyboardNotifier(this.fragmentView, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                BusinessIntroActivity.$r8$lambda$oceY_pMzncPnCVtICOzUUsN2CSo(this.f$0, (Integer) obj);
            }
        });
        return this.fragmentView;
    }

    public static void $r8$lambda$oceY_pMzncPnCVtICOzUUsN2CSo(BusinessIntroActivity businessIntroActivity, Integer num) {
        businessIntroActivity.getClass();
        boolean z = num.intValue() > AndroidUtilities.dp(20.0f);
        if (businessIntroActivity.keyboardVisible == z) {
            return;
        }
        businessIntroActivity.keyboardVisible = z;
        if (z) {
            return;
        }
        businessIntroActivity.listView.smoothScrollToPosition(0);
    }

    public void updateGreetingScale() {
        if (this.previewContainer.getParent() instanceof View) {
            int top = ((View) this.previewContainer.getParent()).getTop();
            int measuredHeight = this.previewContainer.getMeasuredHeight() - AndroidUtilities.dp(36.0f);
            float fClamp = Utilities.clamp((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
            this.greetingsView.setScaleX(fClamp);
            this.greetingsView.setScaleY(fClamp);
            this.greetingsView.setAlpha(Utilities.clamp(fClamp * 2.0f, 1.0f, 0.0f));
            this.previewContainer.invalidate();
        }
    }

    @Override
    protected void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asCustom(this.previewContainer));
        arrayList.add(UItem.asHeader(LocaleController.getString(R.string.BusinessIntroHeader)));
        arrayList.add(UItem.asCustom(this.titleEdit));
        arrayList.add(UItem.asCustom(this.messageEdit));
        if (this.stickerRandom) {
            arrayList.add(UItem.asButton(1, LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom)));
        } else if (this.inputStickerPath != null) {
            arrayList.add(UItem.asStickerButton(1, LocaleController.getString(R.string.BusinessIntroSticker), this.inputStickerPath));
        } else {
            arrayList.add(UItem.asStickerButton(1, LocaleController.getString(R.string.BusinessIntroSticker), this.sticker));
        }
        arrayList.add(UItem.asShadow(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean zIsEmpty = isEmpty();
        this.clearVisible = !zIsEmpty;
        if (!zIsEmpty) {
            arrayList.add(UItem.asShadow(null));
            arrayList.add(UItem.asButton(2, LocaleController.getString(R.string.BusinessIntroReset)).red());
        }
        arrayList.add(UItem.asLargeShadow(null));
    }

    public boolean isEmpty() {
        EditTextCell editTextCell = this.titleEdit;
        if (editTextCell == null || this.messageEdit == null) {
            return true;
        }
        return TextUtils.isEmpty(editTextCell.getText()) && TextUtils.isEmpty(this.messageEdit.getText()) && this.stickerRandom;
    }

    private void setValue() {
        UniversalAdapter universalAdapter;
        if (this.valueSet) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessIntro tL_businessIntro = userFull.business_intro;
        if (tL_businessIntro != null) {
            EditTextCell editTextCell = this.titleEdit;
            String str = tL_businessIntro.title;
            this.currentTitle = str;
            editTextCell.setText(str);
            EditTextCell editTextCell2 = this.messageEdit;
            String str2 = userFull.business_intro.description;
            this.currentMessage = str2;
            editTextCell2.setText(str2);
            this.sticker = userFull.business_intro.sticker;
        } else {
            EditTextCell editTextCell3 = this.titleEdit;
            this.currentTitle = "";
            editTextCell3.setText("");
            EditTextCell editTextCell4 = this.messageEdit;
            this.currentMessage = "";
            editTextCell4.setText("");
            this.inputSticker = null;
            this.sticker = null;
        }
        TLRPC.Document document = this.sticker;
        this.currentSticker = document == null ? 0L : document.id;
        this.stickerRandom = document == null;
        ChatGreetingsView chatGreetingsView = this.greetingsView;
        if (chatGreetingsView != null) {
            chatGreetingsView.setPreview(this.titleEdit.getText().toString(), this.messageEdit.getText().toString());
            ChatGreetingsView chatGreetingsView2 = this.greetingsView;
            TLRPC.Document greetingsSticker = this.sticker;
            if (greetingsSticker == null || this.stickerRandom) {
                greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            chatGreetingsView2.setSticker(greetingsSticker);
        }
        if (this.stickerRandom) {
            AndroidUtilities.cancelRunOnUIThread(this.updateRandomStickerRunnable);
            AndroidUtilities.runOnUIThread(this.updateRandomStickerRunnable, 5000L);
        }
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
            universalAdapter.update(true);
        }
        this.valueSet = true;
    }

    @Override
    protected void onClick(UItem uItem, final View view, int i, float f, float f2) {
        int i2 = uItem.id;
        if (i2 == 1) {
            EmojiBottomSheet emojiBottomSheet = new EmojiBottomSheet(getContext(), true, getResourceProvider(), true);
            emojiBottomSheet.whenDocumentSelected(new Utilities.Callback3Return() {
                @Override
                public final Object run(Object obj, Object obj2, Object obj3) {
                    return BusinessIntroActivity.m1363$r8$lambda$bFjW5sE_ZIngwHbbmJAdGFzbA(this.f$0, view, obj, (TLRPC.Document) obj2, (Boolean) obj3);
                }
            });
            emojiBottomSheet.whenPlusSelected(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.openCustomStickerEditor();
                }
            });
            showDialog(emojiBottomSheet);
            return;
        }
        if (i2 == 2) {
            this.titleEdit.setText("");
            this.messageEdit.setText("");
            AndroidUtilities.hideKeyboard(this.titleEdit.editText);
            AndroidUtilities.hideKeyboard(this.messageEdit.editText);
            this.stickerRandom = true;
            this.greetingsView.setPreview("", "");
            ChatGreetingsView chatGreetingsView = this.greetingsView;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.sticker = greetingsSticker;
            chatGreetingsView.setSticker(greetingsSticker);
            AndroidUtilities.cancelRunOnUIThread(this.updateRandomStickerRunnable);
            AndroidUtilities.runOnUIThread(this.updateRandomStickerRunnable, 5000L);
            checkDone(true, false);
        }
    }

    public static Boolean m1363$r8$lambda$bFjW5sE_ZIngwHbbmJAdGFzbA(BusinessIntroActivity businessIntroActivity, View view, Object obj, TLRPC.Document document, Boolean bool) {
        businessIntroActivity.stickerRandom = false;
        AndroidUtilities.cancelRunOnUIThread(businessIntroActivity.updateRandomStickerRunnable);
        ChatGreetingsView chatGreetingsView = businessIntroActivity.greetingsView;
        businessIntroActivity.sticker = document;
        chatGreetingsView.setSticker(document);
        ((TextCell) view).setValueSticker(document);
        businessIntroActivity.checkDone(true, false);
        return Boolean.TRUE;
    }

    public boolean hasChanges() {
        TLRPC.Document document;
        String string = this.titleEdit.getText().toString();
        String str = this.currentTitle;
        if (str == null) {
            str = "";
        }
        if (!TextUtils.equals(string, str)) {
            return true;
        }
        String string2 = this.messageEdit.getText().toString();
        String str2 = this.currentMessage;
        if (!TextUtils.equals(string2, str2 != null ? str2 : "")) {
            return true;
        }
        boolean z = this.stickerRandom;
        if (((z || (document = this.sticker) == null) ? 0L : document.id) == this.currentSticker) {
            return (z || this.inputSticker == null) ? false : true;
        }
        return true;
    }

    public void checkDone(boolean z, boolean z2) {
        if (this.doneButton == null) {
            return;
        }
        boolean zHasChanges = hasChanges();
        this.doneButton.setEnabled(zHasChanges);
        if (z) {
            this.doneButton.animate().alpha(zHasChanges ? 1.0f : 0.0f).scaleX(zHasChanges ? 1.0f : 0.0f).scaleY(zHasChanges ? 1.0f : 0.0f).setDuration(180L).start();
        } else {
            this.doneButton.setAlpha(zHasChanges ? 1.0f : 0.0f);
            this.doneButton.setScaleX(zHasChanges ? 1.0f : 0.0f);
            this.doneButton.setScaleY(zHasChanges ? 1.0f : 0.0f);
        }
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView == null || universalRecyclerView.adapter == null || this.clearVisible == (!isEmpty())) {
            return;
        }
        saveScrollPosition();
        this.listView.adapter.update(true);
        applyScrolledPosition();
    }

    public void processDone() {
        TLRPC.Document document;
        if (this.doneButtonDrawable.getProgress() > 0.0f) {
            return;
        }
        this.doneButtonDrawable.animateToProgress(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!isEmpty()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.titleEdit.getText().toString();
            updatebusinessintro.intro.description = this.messageEdit.getText().toString();
            if (!this.stickerRandom && (this.sticker != null || this.inputSticker != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.inputSticker;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.sticker);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.stickerRandom && (document = this.sticker) != null) {
                    tL_businessIntro.flags |= 1;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -17;
            userFull.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                BusinessIntroActivity.$r8$lambda$vwouftzYVBIlVfqbZuUV7PUPODo(this.f$0, tLObject, tL_error);
            }
        });
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public static void $r8$lambda$vwouftzYVBIlVfqbZuUV7PUPODo(final BusinessIntroActivity businessIntroActivity, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        businessIntroActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BusinessIntroActivity.$r8$lambda$IJseFU17Pg78EA8NqjhDvfk6D1o(this.f$0, tL_error, tLObject);
            }
        });
    }

    public static void $r8$lambda$IJseFU17Pg78EA8NqjhDvfk6D1o(BusinessIntroActivity businessIntroActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            businessIntroActivity.doneButtonDrawable.animateToProgress(0.0f);
            BulletinFactory.showError(tL_error);
            return;
        }
        businessIntroActivity.getClass();
        if (tLObject instanceof TLRPC.TL_boolFalse) {
            businessIntroActivity.doneButtonDrawable.animateToProgress(0.0f);
            BulletinFactory.of(businessIntroActivity).createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show();
        } else {
            if (businessIntroActivity.inputSticker != null) {
                businessIntroActivity.getMessagesController().loadFullUser(businessIntroActivity.getUserConfig().getCurrentUser(), 0, true);
            }
            businessIntroActivity.finishFragment();
        }
    }

    @Override
    public boolean onBackPressed(boolean z) {
        if (!hasChanges()) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.UnsavedChanges));
        builder.setMessage(LocaleController.getString(R.string.BusinessIntroUnsavedChanges));
        builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.processDone();
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.PassportDiscard), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.finishFragment();
            }
        });
        showDialog(builder.create());
        return false;
    }

    public void openCustomStickerEditor() {
        ContentPreviewViewer.getInstance().setStickerSetForCustomSticker(null);
        if (getParentActivity() == null) {
            return;
        }
        createChatAttachView();
        this.chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
        this.chatAttachAlert.setMaxSelectedPhotos(1, false);
        this.chatAttachAlert.setOpenWithFrontFaceCamera(true);
        this.chatAttachAlert.enableStickerMode(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.setCustomSticker((String) obj, (TLRPC.InputDocument) obj2);
            }
        });
        this.chatAttachAlert.init();
        ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
        chatAttachAlert.parentThemeDelegate = null;
        if (this.visibleDialog != null) {
            chatAttachAlert.show();
        } else {
            showDialog(chatAttachAlert);
        }
    }

    private void createChatAttachView() {
        if (getParentActivity() == null || getContext() == null || this.chatAttachAlert != null) {
            return;
        }
        boolean z = false;
        ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getParentActivity(), this, z, false, true, this.resourceProvider) {
            @Override
            public void dismissInternal() {
                if (BusinessIntroActivity.this.chatAttachAlert != null && BusinessIntroActivity.this.chatAttachAlert.isShowing()) {
                    AndroidUtilities.requestAdjustResize(BusinessIntroActivity.this.getParentActivity(), ((BaseFragment) BusinessIntroActivity.this).classGuid);
                }
                super.dismissInternal();
            }

            @Override
            public void onDismissAnimationStart() {
                if (BusinessIntroActivity.this.chatAttachAlert != null) {
                    BusinessIntroActivity.this.chatAttachAlert.setFocusable(false);
                }
                if (BusinessIntroActivity.this.chatAttachAlert == null || !BusinessIntroActivity.this.chatAttachAlert.isShowing()) {
                    return;
                }
                AndroidUtilities.requestAdjustResize(BusinessIntroActivity.this.getParentActivity(), ((BaseFragment) BusinessIntroActivity.this).classGuid);
            }
        };
        this.chatAttachAlert = chatAttachAlert;
        chatAttachAlert.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() {
            @Override
            public void didPressedButton(int i, boolean z2, boolean z3, int i2, int i3, long j, boolean z4, boolean z5, long j2) {
            }

            @Override
            public void didSelectBot(TLRPC.User user) {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$didSelectBot(this, user);
            }

            @Override
            public boolean needEnterComment() {
                return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$needEnterComment(this);
            }

            @Override
            public void onCameraOpened() {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onCameraOpened(this);
            }

            @Override
            public void onWallpaperSelected(Object obj) {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onWallpaperSelected(this, obj);
            }

            @Override
            public void openAvatarsSearch() {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$openAvatarsSearch(this);
            }

            @Override
            public boolean selectItemOnClicking() {
                return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$selectItemOnClicking(this);
            }

            @Override
            public void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z2, int i, int i2, long j, boolean z3, long j2) {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$sendAudio(this, arrayList, charSequence, z2, i, i2, j, z3, j2);
            }

            @Override
            public void doOnIdle(Runnable runnable) {
                NotificationCenter.getInstance(((BaseFragment) BusinessIntroActivity.this).currentAccount).doOnIdle(runnable);
            }
        });
    }

    public void setCustomSticker(String str, TLRPC.InputDocument inputDocument) {
        UniversalAdapter universalAdapter;
        this.chatAttachAlert.dismiss();
        this.inputStickerPath = str;
        this.inputSticker = inputDocument;
        this.stickerRandom = false;
        AndroidUtilities.cancelRunOnUIThread(this.updateRandomStickerRunnable);
        this.greetingsView.setSticker(this.inputStickerPath);
        checkDone(true, false);
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView == null || (universalAdapter = universalRecyclerView.adapter) == null) {
            return;
        }
        universalAdapter.update(true);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.userInfoDidLoad) {
            setValue();
        }
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }
}
