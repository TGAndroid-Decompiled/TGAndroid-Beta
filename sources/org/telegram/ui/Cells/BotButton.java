package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.ProgressButton;
import org.telegram.ui.Components.Text;

public final class BotButton {
    public AnimatedEmojiDrawable animatedEmojiDrawable;
    public TL_keyboard.KeyboardInlineButton button;
    public BotInlineKeyboard.ButtonCustom buttonCustom;
    public BotInlineKeyboard.Button buttonImpl;
    public int height;
    public Drawable iconDrawable;
    public final Runnable invalidateRunnable;
    public boolean isInviteButton;
    public boolean isLocked;
    public boolean isSeparator;
    public LoadingDrawable loadingDrawable;
    public int positionFlags;
    public ValueAnimator pressAnimator;
    public float pressT;
    public boolean pressed;
    public BaseCell.RippleDrawableSafe selectorDrawable;
    public Text title;
    public float width;
    public float x;
    public int y;
    public final Path path = new Path();
    public final Paint paint = new Paint(1);
    public final RectF loadingRect = new RectF();
    public final float[] radii = new float[8];

    public final class AnonymousClass1 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 7:
                    SharedPhotoVideoCell.PhotoVideoView photoVideoView = (SharedPhotoVideoCell.PhotoVideoView) this.this$0;
                    AnimatorSet animatorSet = photoVideoView.animator;
                    if (animatorSet != null && animatorSet.equals(animator)) {
                        photoVideoView.animator = null;
                        break;
                    }
                    break;
                default:
                    super.onAnimationCancel(animator);
                    break;
            }
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    super.onAnimationEnd(animator);
                    ((BotButton) this.this$0).pressAnimator = null;
                    break;
                case 1:
                    SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) this.this$0;
                    sharedPhotoVideoCell2.currentMessageObject.isMediaSpoilersRevealedInSharedMedia = true;
                    sharedPhotoVideoCell2.invalidate();
                    break;
                case 2:
                    AboutLinkCell aboutLinkCell = (AboutLinkCell) this.this$0;
                    aboutLinkCell.didResizeEnd();
                    if (aboutLinkCell.container.getBackground() == null) {
                        aboutLinkCell.container.setBackground(aboutLinkCell.rippleBackground);
                    }
                    aboutLinkCell.expanded = true;
                    break;
                case 3:
                    ArchivedStickerSetCell archivedStickerSetCell = (ArchivedStickerSetCell) this.this$0;
                    ProgressButton progressButton = archivedStickerSetCell.currentButton;
                    ProgressButton progressButton2 = archivedStickerSetCell.addButton;
                    if (progressButton != progressButton2) {
                        progressButton2.setVisibility(4);
                    } else {
                        archivedStickerSetCell.deleteButton.setVisibility(4);
                    }
                    break;
                case 4:
                    ((GroupCreateUserCell) this.this$0).animator = null;
                    break;
                case 5:
                    PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) this.this$0;
                    if (animator.equals(photoAttachPhotoCell.animatorSet)) {
                        photoAttachPhotoCell.animatorSet = null;
                    }
                    break;
                case 6:
                    SendLocationCell.AnonymousClass1 anonymousClass1 = (SendLocationCell.AnonymousClass1) this.this$0;
                    if (animator.equals(((PhotoEditToolCell) anonymousClass1.this$0).valueAnimation)) {
                        ((PhotoEditToolCell) anonymousClass1.this$0).valueAnimation = null;
                    }
                    break;
                case 7:
                    SharedPhotoVideoCell.PhotoVideoView photoVideoView = (SharedPhotoVideoCell.PhotoVideoView) this.this$0;
                    AnimatorSet animatorSet = photoVideoView.animator;
                    if (animatorSet != null && animatorSet.equals(animator)) {
                        photoVideoView.animator = null;
                        break;
                    }
                    break;
                default:
                    super.onAnimationEnd(animator);
                    ThemePreviewMessagesCell.AnonymousClass1.C00081.ViewTreeObserverOnPreDrawListenerC00091 viewTreeObserverOnPreDrawListenerC00091 = (ThemePreviewMessagesCell.AnonymousClass1.C00081.ViewTreeObserverOnPreDrawListenerC00091) this.this$0;
                    ThemePreviewMessagesCell.AnonymousClass1.this.getTransitionParams().resetAnimation();
                    ThemePreviewMessagesCell.AnonymousClass1.this.getTransitionParams().animateChange = false;
                    ThemePreviewMessagesCell.AnonymousClass1.this.getTransitionParams().animateChangeProgress = 1.0f;
                    break;
            }
        }

        @Override
        public void onAnimationStart(Animator animator) {
            switch (this.$r8$classId) {
                case 2:
                    ((AboutLinkCell) this.this$0).didResizeStart();
                    break;
                default:
                    super.onAnimationStart(animator);
                    break;
            }
        }
    }

    public abstract class AnonymousClass2 {
        public static final int[] $SwitchMap$org$telegram$messenger$BotInlineKeyboard$BackgroundColor;

        static {
            int[] iArr = new int[BotInlineKeyboard.BackgroundColor.values().length];
            $SwitchMap$org$telegram$messenger$BotInlineKeyboard$BackgroundColor = iArr;
            try {
                iArr[BotInlineKeyboard.BackgroundColor.DANGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$telegram$messenger$BotInlineKeyboard$BackgroundColor[BotInlineKeyboard.BackgroundColor.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$telegram$messenger$BotInlineKeyboard$BackgroundColor[BotInlineKeyboard.BackgroundColor.PRIMARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public BotButton(Runnable runnable) {
        this.invalidateRunnable = runnable;
    }

    public final float getPressScale() {
        if (this.pressed) {
            float f = this.pressT;
            if (f != 1.0f) {
                float fMin = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f;
                this.pressT = fMin;
                this.pressT = Utilities.clamp(fMin, 1.0f, 0.0f);
                this.invalidateRunnable.run();
            }
        }
        return DiffUtil.m(1.0f, this.pressT, 0.04f, 0.96f);
    }

    public final void setPressed(boolean z) {
        ValueAnimator valueAnimator;
        int i = 0;
        if (this.pressed != z) {
            this.pressed = z;
            this.invalidateRunnable.run();
            if (z && (valueAnimator = this.pressAnimator) != null) {
                valueAnimator.removeAllListeners();
                this.pressAnimator.cancel();
            }
            if (z) {
                return;
            }
            float f = this.pressT;
            if (f != 0.0f) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
                this.pressAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, i));
                this.pressAnimator.addListener(new AnonymousClass1(this, i));
                zzkk.m(2.0f, this.pressAnimator);
                this.pressAnimator.setDuration(350L);
                this.pressAnimator.start();
            }
        }
    }
}
