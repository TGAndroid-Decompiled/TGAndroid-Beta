package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.PhotoViewer;

public abstract class AvatarConstructorPreviewCell extends FrameLayout {
    public AnimatedEmojiDrawable animatedEmojiDrawable;
    public int backgroundIndex;
    public final int currentAccount;
    public GradientTools currentBackgroundDrawable;
    public BackupImageView currentImage;
    public int emojiIndex;
    public final TLRPC.TL_emojiList emojiList;
    public boolean isAllEmojiDrawablesLoaded;
    public AnimatedEmojiDrawable nextAnimatedEmojiDrawable;
    public GradientTools nextBackgroundDrawable;
    public BackupImageView nextImage;
    public float progressToNext;
    public final AnonymousClass1 scheduleSwitchToNextRunnable;
    public final TextView textView;

    public AvatarConstructorPreviewCell(Context context) {
        super(context);
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        this.backgroundIndex = 0;
        this.emojiIndex = 0;
        this.progressToNext = 1.0f;
        final ChatAttachAlertPhotoLayout.PhotoAttachAdapter.AnonymousClass3 anonymousClass3 = (ChatAttachAlertPhotoLayout.PhotoAttachAdapter.AnonymousClass3) this;
        this.scheduleSwitchToNextRunnable = new Runnable() {
            @Override
            public final void run() {
                PhotoViewer.AnonymousClass11 anonymousClass11;
                ChatAttachAlertPhotoLayout.PhotoAttachAdapter.AnonymousClass3 anonymousClass4 = anonymousClass3;
                AndroidUtilities.runOnUIThread(anonymousClass4.scheduleSwitchToNextRunnable, 1000L);
                TLRPC.TL_emojiList tL_emojiList = anonymousClass4.emojiList;
                if (tL_emojiList == null || tL_emojiList.document_id.isEmpty() || anonymousClass4.progressToNext != 1.0f) {
                    return;
                }
                if (anonymousClass4.isAllEmojiDrawablesLoaded || ((anonymousClass11 = anonymousClass4.nextAnimatedEmojiDrawable.imageReceiver) != null && anonymousClass11.hasImageLoaded())) {
                    int i2 = anonymousClass4.emojiIndex + 1;
                    anonymousClass4.emojiIndex = i2;
                    anonymousClass4.backgroundIndex++;
                    if (i2 > tL_emojiList.document_id.size() - 1) {
                        anonymousClass4.emojiIndex = 0;
                    }
                    int i3 = anonymousClass4.backgroundIndex;
                    int[][] iArr = AvatarConstructorFragment.defaultColors;
                    if (i3 > 6) {
                        anonymousClass4.backgroundIndex = 0;
                    }
                    AnimatedEmojiDrawable animatedEmojiDrawable = new AnimatedEmojiDrawable(4, anonymousClass4.currentAccount, tL_emojiList.document_id.get(anonymousClass4.emojiIndex).longValue());
                    anonymousClass4.animatedEmojiDrawable = animatedEmojiDrawable;
                    anonymousClass4.nextImage.setAnimatedEmojiDrawable(animatedEmojiDrawable);
                    int[] iArr2 = iArr[anonymousClass4.backgroundIndex];
                    int i4 = iArr2[0];
                    int i5 = iArr2[1];
                    int i6 = iArr2[2];
                    int i7 = iArr2[3];
                    GradientTools gradientTools = new GradientTools();
                    anonymousClass4.nextBackgroundDrawable = gradientTools;
                    gradientTools.setColors(i4, i5, i6, i7);
                    anonymousClass4.progressToNext = 0.0f;
                    anonymousClass4.preloadNextEmojiDrawable();
                    anonymousClass4.invalidate();
                }
            }
        };
        TLRPC.TL_emojiList orCreateEmojiList = getOrCreateEmojiList(i);
        this.emojiList = orCreateEmojiList;
        this.currentImage = new BackupImageView(context);
        this.nextImage = new BackupImageView(context);
        addView(this.currentImage, LayoutHelper.createFrame(50, 50, 1));
        addView(this.nextImage, LayoutHelper.createFrame(50, 50, 1));
        if (!orCreateEmojiList.document_id.isEmpty()) {
            AnimatedEmojiDrawable animatedEmojiDrawable = new AnimatedEmojiDrawable(4, i, orCreateEmojiList.document_id.get(0).longValue());
            this.animatedEmojiDrawable = animatedEmojiDrawable;
            this.currentImage.setAnimatedEmojiDrawable(animatedEmojiDrawable);
            preloadNextEmojiDrawable();
        }
        int[] iArr = AvatarConstructorFragment.defaultColors[this.backgroundIndex];
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        GradientTools gradientTools = new GradientTools();
        this.currentBackgroundDrawable = gradientTools;
        gradientTools.setColors(i2, i3, i4, i5);
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(Theme.getColor(null, Theme.key_avatar_text, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.UseEmoji));
        addView(textView, LayoutHelper.createFrame(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
    }

    public static TLRPC.TL_emojiList getOrCreateEmojiList(int i) {
        TLRPC.TL_emojiList tL_emojiList = MediaDataController.getInstance(i).groupAvatarConstructorDefault;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty()) {
            return tL_emojiList;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i).getStickerSets(5);
        TLRPC.TL_emojiList tL_emojiList2 = new TLRPC.TL_emojiList();
        if (stickerSets.isEmpty()) {
            ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i).getFeaturedEmojiSets();
            for (int i2 = 0; i2 < featuredEmojiSets.size(); i2++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i2);
                TLRPC.Document document = stickerSetCovered.cover;
                if (document != null) {
                    tL_emojiList2.document_id.add(Long.valueOf(document.id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).id));
                    }
                }
            }
        } else {
            for (int i3 = 0; i3 < stickerSets.size(); i3++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i3);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(Utilities.fastRandom.nextInt() % tL_messages_stickerSet.documents.size())).id));
                }
            }
        }
        return tL_emojiList2;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        GradientTools gradientTools = this.currentBackgroundDrawable;
        if (gradientTools != null) {
            float measuredWidth = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
            gradientTools.setBounds(rectF);
        }
        GradientTools gradientTools2 = this.nextBackgroundDrawable;
        if (gradientTools2 != null) {
            float measuredWidth2 = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
            gradientTools2.setBounds(rectF2);
        }
        float f = this.progressToNext;
        if (f == 1.0f) {
            this.currentBackgroundDrawable.paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.currentBackgroundDrawable.paint);
            this.currentImage.setAlpha(1.0f);
            this.currentImage.setScaleX(1.0f);
            this.currentImage.setScaleY(1.0f);
            this.nextImage.setAlpha(0.0f);
        } else {
            float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(f);
            this.currentBackgroundDrawable.paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.currentBackgroundDrawable.paint);
            this.nextBackgroundDrawable.paint.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.nextBackgroundDrawable.paint);
            this.progressToNext += 0.064f;
            float f2 = 1.0f - interpolation;
            this.currentImage.setAlpha(f2);
            this.currentImage.setScaleX(f2);
            this.currentImage.setScaleY(f2);
            this.currentImage.setPivotY(0.0f);
            this.nextImage.setAlpha(interpolation);
            this.nextImage.setScaleX(interpolation);
            this.nextImage.setScaleY(interpolation);
            BackupImageView backupImageView = this.nextImage;
            backupImageView.setPivotY(backupImageView.getMeasuredHeight());
            if (this.progressToNext > 1.0f) {
                this.progressToNext = 1.0f;
                this.currentBackgroundDrawable = this.nextBackgroundDrawable;
                BackupImageView backupImageView2 = this.currentImage;
                this.currentImage = this.nextImage;
                this.nextImage = backupImageView2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public AnimatedEmojiDrawable getAnimatedEmoji() {
        return this.animatedEmojiDrawable;
    }

    public AvatarConstructorFragment.BackgroundGradient getBackgroundGradient() {
        AvatarConstructorFragment.BackgroundGradient backgroundGradient = new AvatarConstructorFragment.BackgroundGradient();
        int[] iArr = AvatarConstructorFragment.defaultColors[this.backgroundIndex];
        backgroundGradient.color1 = iArr[0];
        backgroundGradient.color2 = iArr[1];
        backgroundGradient.color3 = iArr[2];
        backgroundGradient.color4 = iArr[3];
        return backgroundGradient;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.scheduleSwitchToNextRunnable, 1000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.scheduleSwitchToNextRunnable);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int top = this.textView.getTop();
        int i3 = (int) (top * 0.7f);
        int i4 = (int) ((top - i3) * 0.7f);
        ViewGroup.LayoutParams layoutParams = this.currentImage.getLayoutParams();
        this.currentImage.getLayoutParams().height = i3;
        layoutParams.width = i3;
        ViewGroup.LayoutParams layoutParams2 = this.nextImage.getLayoutParams();
        this.nextImage.getLayoutParams().height = i3;
        layoutParams2.width = i3;
        ((FrameLayout.LayoutParams) this.currentImage.getLayoutParams()).topMargin = i4;
        ((FrameLayout.LayoutParams) this.nextImage.getLayoutParams()).topMargin = i4;
    }

    public final void preloadNextEmojiDrawable() {
        if (this.isAllEmojiDrawablesLoaded) {
            return;
        }
        int i = this.emojiIndex + 1;
        TLRPC.TL_emojiList tL_emojiList = this.emojiList;
        if (i > tL_emojiList.document_id.size() - 1) {
            this.isAllEmojiDrawablesLoaded = true;
            return;
        }
        AnimatedEmojiDrawable animatedEmojiDrawable = new AnimatedEmojiDrawable(4, this.currentAccount, tL_emojiList.document_id.get(i).longValue());
        this.nextAnimatedEmojiDrawable = animatedEmojiDrawable;
        animatedEmojiDrawable.preloading = true;
        animatedEmojiDrawable.updateAttachState();
    }
}
