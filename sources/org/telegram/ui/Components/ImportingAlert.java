package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;

public final class ImportingAlert extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    public final BottomSheetCell cell;
    public boolean completed;
    public final RLottieDrawable completedDrawable;
    public final RLottieImageView imageView;
    public final TextView[] importCountTextView;
    public final TextView[] infoTextView;
    public final LineProgressView lineProgressView;
    public final ChatActivity parentFragment;
    public final TextView percentTextView;
    public final String stickersShortName;

    public final class BottomSheetCell extends FrameLayout {
        public final View background;
        public final RLottieImageView imageView;
        public final LinearLayout linearLayout;
        public final TextView textView;

        public BottomSheetCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            View view = new View(context);
            this.background = view;
            int iDp = AndroidUtilities.dp(4.0f);
            int i = Theme.key_featuredStickers_addButton;
            int color = Theme.getColor(i, resourcesProvider);
            int color2 = Theme.getColor(Theme.key_featuredStickers_addButtonPressed, resourcesProvider);
            view.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, color2, color2));
            addView(view, LayoutHelper.createFrame(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(0);
            addView(linearLayout, LayoutHelper.createFrame(-2, -2, 17));
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.imageView = rLottieImageView;
            int iDp2 = AndroidUtilities.dp(20.0f);
            int i2 = Theme.key_featuredStickers_buttonText;
            rLottieImageView.setBackground(Theme.createCircleDrawable(iDp2, Theme.getColor(i2, resourcesProvider)));
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            rLottieImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            rLottieImageView.setAnimation(R.raw.import_check, 26, 26, null);
            rLottieImageView.setScaleX(0.8f);
            rLottieImageView.setScaleY(0.8f);
            linearLayout.addView(rLottieImageView, LayoutHelper.createLinear(20, 20, 16));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setLines(1);
            textView.setSingleLine(true);
            textView.setGravity(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity(17);
            textView.setTextColor(Theme.getColor(i2, resourcesProvider));
            zzkk.m(14.0f, 1, textView);
            linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 16, 10, 0, 0, 0));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
        }

        public void setGravity(int i) {
            this.textView.setGravity(i);
        }

        public void setText(CharSequence charSequence) {
            this.textView.setText(charSequence);
        }

        public void setTextColor(int i) {
            this.textView.setTextColor(i);
        }
    }

    public ImportingAlert(Context context, String str, ChatActivity chatActivity, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider, false, false);
        this.importCountTextView = new TextView[2];
        this.infoTextView = new TextView[2];
        HintView$1$$ExternalSyntheticLambda0 hintView$1$$ExternalSyntheticLambda0 = new HintView$1$$ExternalSyntheticLambda0(this, 15);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.parentFragment = chatActivity;
        this.stickersShortName = str;
        FrameLayout frameLayout = new FrameLayout(context);
        setCustomView(frameLayout);
        TextView textView = new TextView(context);
        zzkh.m(20.0f, textView);
        int i = Theme.key_dialogTextBlack;
        textView.setTextColor(getThemedColor(i));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        int i2 = R.raw.import_finish;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i2, SurfaceContainer$$ExternalSyntheticOutline0.m(i2, ""), AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), false, null);
        this.completedDrawable = rLottieDrawable;
        rLottieDrawable.decodeSingleFrame = true;
        rLottieDrawable.scheduleNextGetFrame();
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        rLottieImageView.setAutoRepeat(true);
        rLottieImageView.setAnimation(R.raw.import_loop, 120, 120, null);
        rLottieImageView.playAnimation();
        frameLayout.addView(rLottieImageView, LayoutHelper.createFrame(160, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        rLottieImageView.getAnimatedDrawable().setOnFinishCallback(178, hintView$1$$ExternalSyntheticLambda0);
        TextView textView2 = new TextView(context);
        this.percentTextView = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 24.0f);
        textView2.setTextColor(getThemedColor(i));
        frameLayout.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        LineProgressView lineProgressView = new LineProgressView(getContext());
        this.lineProgressView = lineProgressView;
        lineProgressView.setProgressColor(getThemedColor(Theme.key_featuredStickers_addButton));
        lineProgressView.setBackColor(getThemedColor(Theme.key_dialogLineProgressBackground));
        frameLayout.addView(lineProgressView, LayoutHelper.createFrame(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        BottomSheetCell bottomSheetCell = new BottomSheetCell(context, resourcesProvider);
        this.cell = bottomSheetCell;
        bottomSheetCell.setBackground(null);
        bottomSheetCell.setText(LocaleController.getString(R.string.ImportDone));
        bottomSheetCell.setVisibility(4);
        View view = bottomSheetCell.background;
        view.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 1));
        view.setPivotY(AndroidUtilities.dp(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView(bottomSheetCell, LayoutHelper.createFrame(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i3 = 0; i3 < 2; i3++) {
            this.importCountTextView[i3] = new TextView(context);
            this.importCountTextView[i3].setTextSize(1, 16.0f);
            this.importCountTextView[i3].setTypeface(AndroidUtilities.bold());
            this.importCountTextView[i3].setTextColor(getThemedColor(Theme.key_dialogTextBlack));
            frameLayout.addView(this.importCountTextView[i3], LayoutHelper.createFrame(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.infoTextView[i3] = new TextView(context);
            this.infoTextView[i3].setTextSize(1, 14.0f);
            this.infoTextView[i3].setTextColor(getThemedColor(Theme.key_dialogTextGray3));
            this.infoTextView[i3].setGravity(1);
            frameLayout.addView(this.infoTextView[i3], LayoutHelper.createFrame(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            if (i3 == 0) {
                this.infoTextView[i3].setText(LocaleController.getString(R.string.ImportImportingInfo));
            } else {
                this.infoTextView[i3].setAlpha(0.0f);
                this.infoTextView[i3].setTranslationY(AndroidUtilities.dp(10.0f));
                this.importCountTextView[i3].setAlpha(0.0f);
                this.importCountTextView[i3].setTranslationY(AndroidUtilities.dp(10.0f));
            }
        }
        if (this.parentFragment != null) {
            textView.setText(LocaleController.getString(R.string.ImportImportingTitle));
            SendMessagesHelper.ImportingHistory importingHistory = this.parentFragment.getSendMessagesHelper().getImportingHistory(this.parentFragment.getDialogId());
            this.percentTextView.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            this.lineProgressView.setProgress(importingHistory.uploadProgress / 100.0f, false);
            this.importCountTextView[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            this.infoTextView[1].setText(LocaleController.getString(R.string.ImportDoneInfo));
            this.importCountTextView[1].setText(LocaleController.getString(R.string.ImportDoneTitle));
            this.parentFragment.getNotificationCenter().addObserver(this, NotificationCenter.historyImportProgressChanged);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersImportingTitle));
        SendMessagesHelper.ImportingStickers importingStickers = SendMessagesHelper.getInstance(this.currentAccount).getImportingStickers(str);
        this.percentTextView.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
        this.lineProgressView.setProgress(importingStickers.uploadProgress / 100.0f, false);
        this.importCountTextView[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
        this.infoTextView[1].setText(LocaleController.getString(R.string.ImportStickersDoneInfo));
        this.importCountTextView[1].setText(LocaleController.getString(R.string.ImportStickersDoneTitle));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersImportProgressChanged);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = NotificationCenter.historyImportProgressChanged;
        TextView textView = this.percentTextView;
        RLottieImageView rLottieImageView = this.imageView;
        LineProgressView lineProgressView = this.lineProgressView;
        TextView[] textViewArr = this.importCountTextView;
        if (i == i3) {
            if (objArr.length > 1) {
                lambda$showGiftOfferSheet$15();
                return;
            }
            ChatActivity chatActivity = this.parentFragment;
            SendMessagesHelper.ImportingHistory importingHistory = chatActivity.getSendMessagesHelper().getImportingHistory(chatActivity.getDialogId());
            if (importingHistory == null) {
                setCompleted();
                return;
            }
            if (!this.completed && (((double) (180 - rLottieImageView.getAnimatedDrawable().currentFrame)) * 16.6d) + 3000.0d >= importingHistory.timeUntilFinish) {
                rLottieImageView.setAutoRepeat(false);
                this.completed = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            lineProgressView.setProgress(importingHistory.uploadProgress / 100.0f, true);
            return;
        }
        if (i == NotificationCenter.stickersImportProgressChanged) {
            if (objArr.length > 1) {
                lambda$showGiftOfferSheet$15();
                return;
            }
            SendMessagesHelper.ImportingStickers importingStickers = SendMessagesHelper.getInstance(this.currentAccount).getImportingStickers(this.stickersShortName);
            if (importingStickers == null) {
                setCompleted();
                return;
            }
            if (!this.completed && (((double) (180 - rLottieImageView.getAnimatedDrawable().currentFrame)) * 16.6d) + 3000.0d >= importingStickers.timeUntilFinish) {
                rLottieImageView.setAutoRepeat(false);
                this.completed = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
            lineProgressView.setProgress(importingStickers.uploadProgress / 100.0f, true);
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity != null) {
            chatActivity.getNotificationCenter().removeObserver(this, NotificationCenter.historyImportProgressChanged);
        } else {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersImportProgressChanged);
        }
    }

    public final void setCompleted() {
        this.completed = true;
        this.imageView.setAutoRepeat(false);
        BottomSheetCell bottomSheetCell = this.cell;
        bottomSheetCell.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        TextView textView = this.percentTextView;
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr = this.infoTextView;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property, 0.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr2 = this.importCountTextView;
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, ObjectAnimator.ofFloat(textViewArr2[0], (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], (Property<TextView, Float>) property2, -AndroidUtilities.dp(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], (Property<TextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.lineProgressView, (Property<LineProgressView, Float>) property, 0.0f), ObjectAnimator.ofFloat(bottomSheetCell.linearLayout, (Property<LinearLayout, Float>) property2, AndroidUtilities.dp(8.0f), 0.0f));
        bottomSheetCell.background.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        bottomSheetCell.imageView.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        bottomSheetCell.imageView.playAnimation();
        animatorSet.start();
    }
}
