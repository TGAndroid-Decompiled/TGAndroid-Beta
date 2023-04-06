package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
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
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$StickerSetCovered;
import org.telegram.tgnet.TLRPC$TL_emojiList;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_stickerSetFullCovered;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarConstructorFragment;
public class AvatarConstructorPreviewCell extends FrameLayout {
    private AnimatedEmojiDrawable animatedEmojiDrawable;
    int backgroundIndex;
    private final int currentAccount;
    GradientTools currentBackgroundDrawable;
    BackupImageView currentImage;
    int emojiIndex;
    TLRPC$TL_emojiList emojiList;
    public final boolean forUser;
    GradientTools nextBackgroundDrawable;
    BackupImageView nextImage;
    float progressToNext;
    Runnable scheduleSwitchToNextRunnable;
    TextView textView;

    public AvatarConstructorPreviewCell(Context context, boolean z) {
        super(context);
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        this.backgroundIndex = 0;
        this.emojiIndex = 0;
        this.progressToNext = 1.0f;
        this.scheduleSwitchToNextRunnable = new Runnable() {
            @Override
            public void run() {
                AndroidUtilities.runOnUIThread(AvatarConstructorPreviewCell.this.scheduleSwitchToNextRunnable, 1000L);
                TLRPC$TL_emojiList tLRPC$TL_emojiList = AvatarConstructorPreviewCell.this.emojiList;
                if (tLRPC$TL_emojiList == null || tLRPC$TL_emojiList.document_id.isEmpty()) {
                    return;
                }
                AvatarConstructorPreviewCell avatarConstructorPreviewCell = AvatarConstructorPreviewCell.this;
                if (avatarConstructorPreviewCell.progressToNext != 1.0f) {
                    return;
                }
                int i2 = avatarConstructorPreviewCell.emojiIndex + 1;
                avatarConstructorPreviewCell.emojiIndex = i2;
                avatarConstructorPreviewCell.backgroundIndex++;
                if (i2 > avatarConstructorPreviewCell.emojiList.document_id.size() - 1) {
                    AvatarConstructorPreviewCell.this.emojiIndex = 0;
                }
                AvatarConstructorPreviewCell avatarConstructorPreviewCell2 = AvatarConstructorPreviewCell.this;
                int i3 = avatarConstructorPreviewCell2.backgroundIndex;
                int[][] iArr = AvatarConstructorFragment.defaultColors;
                if (i3 > iArr.length - 1) {
                    avatarConstructorPreviewCell2.backgroundIndex = 0;
                }
                int i4 = AvatarConstructorPreviewCell.this.currentAccount;
                AvatarConstructorPreviewCell avatarConstructorPreviewCell3 = AvatarConstructorPreviewCell.this;
                avatarConstructorPreviewCell2.animatedEmojiDrawable = new AnimatedEmojiDrawable(4, i4, avatarConstructorPreviewCell3.emojiList.document_id.get(avatarConstructorPreviewCell3.emojiIndex).longValue());
                AvatarConstructorPreviewCell avatarConstructorPreviewCell4 = AvatarConstructorPreviewCell.this;
                avatarConstructorPreviewCell4.nextImage.setAnimatedEmojiDrawable(avatarConstructorPreviewCell4.animatedEmojiDrawable);
                AvatarConstructorPreviewCell avatarConstructorPreviewCell5 = AvatarConstructorPreviewCell.this;
                int i5 = avatarConstructorPreviewCell5.backgroundIndex;
                int i6 = iArr[i5][0];
                int i7 = iArr[i5][1];
                int i8 = iArr[i5][2];
                int i9 = iArr[i5][3];
                avatarConstructorPreviewCell5.nextBackgroundDrawable = new GradientTools();
                AvatarConstructorPreviewCell.this.nextBackgroundDrawable.setColors(i6, i7, i8, i9);
                AvatarConstructorPreviewCell avatarConstructorPreviewCell6 = AvatarConstructorPreviewCell.this;
                avatarConstructorPreviewCell6.progressToNext = 0.0f;
                avatarConstructorPreviewCell6.invalidate();
            }
        };
        this.forUser = z;
        if (z) {
            this.emojiList = MediaDataController.getInstance(i).profileAvatarConstructorDefault;
        } else {
            this.emojiList = MediaDataController.getInstance(i).groupAvatarConstructorDefault;
        }
        TLRPC$TL_emojiList tLRPC$TL_emojiList = this.emojiList;
        if (tLRPC$TL_emojiList == null || tLRPC$TL_emojiList.document_id.isEmpty()) {
            ArrayList<TLRPC$TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i).getStickerSets(5);
            this.emojiList = new TLRPC$TL_emojiList();
            if (stickerSets.isEmpty()) {
                ArrayList<TLRPC$StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i).getFeaturedEmojiSets();
                for (int i2 = 0; i2 < featuredEmojiSets.size(); i2++) {
                    TLRPC$StickerSetCovered tLRPC$StickerSetCovered = featuredEmojiSets.get(i2);
                    TLRPC$Document tLRPC$Document = tLRPC$StickerSetCovered.cover;
                    if (tLRPC$Document != null) {
                        this.emojiList.document_id.add(Long.valueOf(tLRPC$Document.id));
                    } else if (tLRPC$StickerSetCovered instanceof TLRPC$TL_stickerSetFullCovered) {
                        TLRPC$TL_stickerSetFullCovered tLRPC$TL_stickerSetFullCovered = (TLRPC$TL_stickerSetFullCovered) tLRPC$StickerSetCovered;
                        if (!tLRPC$TL_stickerSetFullCovered.documents.isEmpty()) {
                            this.emojiList.document_id.add(Long.valueOf(tLRPC$TL_stickerSetFullCovered.documents.get(0).id));
                        }
                    }
                }
            } else {
                for (int i3 = 0; i3 < stickerSets.size(); i3++) {
                    TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = stickerSets.get(i3);
                    if (!tLRPC$TL_messages_stickerSet.documents.isEmpty()) {
                        this.emojiList.document_id.add(Long.valueOf(tLRPC$TL_messages_stickerSet.documents.get(Math.abs(Utilities.fastRandom.nextInt() % tLRPC$TL_messages_stickerSet.documents.size())).id));
                    }
                }
            }
        }
        this.currentImage = new BackupImageView(context);
        this.nextImage = new BackupImageView(context);
        addView(this.currentImage, LayoutHelper.createFrame(50, 50, 1));
        addView(this.nextImage, LayoutHelper.createFrame(50, 50, 1));
        TLRPC$TL_emojiList tLRPC$TL_emojiList2 = this.emojiList;
        if (tLRPC$TL_emojiList2 != null && !tLRPC$TL_emojiList2.document_id.isEmpty()) {
            AnimatedEmojiDrawable animatedEmojiDrawable = new AnimatedEmojiDrawable(4, this.currentAccount, this.emojiList.document_id.get(0).longValue());
            this.animatedEmojiDrawable = animatedEmojiDrawable;
            this.currentImage.setAnimatedEmojiDrawable(animatedEmojiDrawable);
        }
        int[][] iArr = AvatarConstructorFragment.defaultColors;
        int i4 = this.backgroundIndex;
        int i5 = iArr[i4][0];
        int i6 = iArr[i4][1];
        int i7 = iArr[i4][2];
        int i8 = iArr[i4][3];
        GradientTools gradientTools = new GradientTools();
        this.currentBackgroundDrawable = gradientTools;
        gradientTools.setColors(i5, i6, i7, i8);
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextSize(1, 12.0f);
        this.textView.setTextColor(Theme.getColor("avatar_text"));
        this.textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.textView.setGravity(17);
        this.textView.setText(LocaleController.getString("UseEmoji", R.string.UseEmoji));
        addView(this.textView, LayoutHelper.createFrame(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
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

    @Override
    protected void dispatchDraw(Canvas canvas) {
        BackupImageView backupImageView;
        GradientTools gradientTools = this.currentBackgroundDrawable;
        if (gradientTools != null) {
            gradientTools.setBounds(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        GradientTools gradientTools2 = this.nextBackgroundDrawable;
        if (gradientTools2 != null) {
            gradientTools2.setBounds(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
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
            this.nextImage.setPivotY(backupImageView.getMeasuredHeight());
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

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.scheduleSwitchToNextRunnable, 1000L);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.scheduleSwitchToNextRunnable);
    }

    public AvatarConstructorFragment.BackgroundGradient getBackgroundGradient() {
        AvatarConstructorFragment.BackgroundGradient backgroundGradient = new AvatarConstructorFragment.BackgroundGradient();
        int[][] iArr = AvatarConstructorFragment.defaultColors;
        int i = this.backgroundIndex;
        backgroundGradient.color1 = iArr[i][0];
        backgroundGradient.color2 = iArr[i][1];
        backgroundGradient.color3 = iArr[i][2];
        backgroundGradient.color4 = iArr[i][3];
        return backgroundGradient;
    }

    public AnimatedEmojiDrawable getAnimatedEmoji() {
        return this.animatedEmojiDrawable;
    }
}
