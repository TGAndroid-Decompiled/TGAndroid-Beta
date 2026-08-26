package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.gms.internal.mlkit_language_id_common.zzhr;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.GroupCallSheet$$ExternalSyntheticLambda5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class StickerEmptyView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean animateLayoutChange;
    public final ButtonWithCounterView button;
    public int colorKey1;
    public final int currentAccount;
    public int keyboardSize;
    public int lastH;
    public final AnonymousClass2 linearLayout;
    public boolean preventMoving;
    public final RadialProgressView progressBar;
    public boolean progressShowing;
    public final View progressView;
    public final Theme.ResourcesProvider resourcesProvider;
    public final LaunchActivity.AnonymousClass18 showProgressRunnable;
    public int stickerType;
    public final BackupImageView stickerView;
    public final LinkSpanDrawable.LinksTextView subtitle;
    public final SpoilersTextView title;
    public ValueAnimator visibilityAnimator;
    public float visibilityFactor;
    public boolean visibilityValue;

    public final class AnonymousClass4 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final StickerEmptyView this$0;

        public AnonymousClass4(StickerEmptyView stickerEmptyView, int i) {
            this.$r8$classId = i;
            this.this$0 = stickerEmptyView;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    this.this$0.progressView.setVisibility(8);
                    break;
                case 1:
                    this.this$0.progressView.setVisibility(8);
                    break;
                default:
                    this.this$0.progressView.setVisibility(8);
                    break;
            }
        }
    }

    public StickerEmptyView(Context context) {
        this(1, null, context, null);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.diceStickersDidLoad && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            setSticker$1$1();
        }
    }

    public float getVisibilityFactor() {
        return this.visibilityFactor;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            setSticker$1$1();
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if ((this.animateLayoutChange || this.preventMoving) && (i5 = this.lastH) > 0 && i5 != getMeasuredHeight()) {
            float measuredHeight = (this.lastH - getMeasuredHeight()) / 2.0f;
            AnonymousClass2 anonymousClass2 = this.linearLayout;
            anonymousClass2.setTranslationY(anonymousClass2.getTranslationY() + measuredHeight);
            if (!this.preventMoving) {
                anonymousClass2.animate().translationY(0.0f).setInterpolator(CubicBezierInterpolator.DEFAULT).setDuration(250L);
            }
            RadialProgressView radialProgressView = this.progressBar;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(radialProgressView.getTranslationY() + measuredHeight);
                if (!this.preventMoving) {
                    radialProgressView.animate().translationY(0.0f).setInterpolator(CubicBezierInterpolator.DEFAULT).setDuration(250L);
                }
            }
        }
        this.lastH = getMeasuredHeight();
    }

    public void onVisibilityChange() {
        invalidate();
    }

    public void setAnimateLayoutChange(boolean z) {
        this.animateLayoutChange = z;
    }

    public final void setKeyboardHeight(int i, boolean z) {
        if (this.keyboardSize != i) {
            if (getVisibility() != 0) {
                z = false;
            }
            this.keyboardSize = i;
            float fDp = (-(i >> 1)) + (i > 0 ? AndroidUtilities.dp(20.0f) : 0);
            RadialProgressView radialProgressView = this.progressBar;
            AnonymousClass2 anonymousClass2 = this.linearLayout;
            if (!z) {
                anonymousClass2.setTranslationY(fDp);
                if (radialProgressView != null) {
                    radialProgressView.setTranslationY(fDp);
                    return;
                }
                return;
            }
            ViewPropertyAnimator viewPropertyAnimatorTranslationY = anonymousClass2.animate().translationY(fDp);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            viewPropertyAnimatorTranslationY.setInterpolator(cubicBezierInterpolator).setDuration(250L);
            if (radialProgressView != null) {
                radialProgressView.animate().translationY(fDp).setInterpolator(cubicBezierInterpolator).setDuration(250L);
            }
        }
    }

    public void setPreventMoving(boolean z) {
        this.preventMoving = z;
        if (z) {
            return;
        }
        setTranslationY(0.0f);
        RadialProgressView radialProgressView = this.progressBar;
        if (radialProgressView != null) {
            radialProgressView.setTranslationY(0.0f);
        }
    }

    public final void setSticker$1$1() {
        Object obj;
        TLRPC.Document emojiAnimatedSticker;
        int i;
        int i2 = this.stickerType;
        BackupImageView backupImageView = this.stickerView;
        if (i2 != 0) {
            if (i2 != 1) {
                TLRPC.Document document = null;
                String strM = null;
                document = null;
                document = null;
                int i3 = this.currentAccount;
                if (i2 == 16) {
                    emojiAnimatedSticker = MediaDataController.getInstance(i3).getEmojiAnimatedSticker("👍");
                    obj = null;
                } else {
                    TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i3).getStickerSetByName("tg_placeholders_android");
                    if (stickerSetByName == null) {
                        stickerSetByName = MediaDataController.getInstance(i3).getStickerSetByEmojiOrName("tg_placeholders_android");
                    }
                    if (stickerSetByName != null && (i = this.stickerType) >= 0 && i < stickerSetByName.documents.size()) {
                        document = stickerSetByName.documents.get(this.stickerType);
                    }
                    obj = stickerSetByName;
                    emojiAnimatedSticker = document;
                    strM = "130_130";
                }
                if (!LiteMode.isEnabled(3)) {
                    strM = zzhr.m(strM, "_firstframe");
                }
                if (emojiAnimatedSticker == null) {
                    MediaDataController.getInstance(i3).loadStickersByEmojiOrName("tg_placeholders_android", false, obj == null);
                    backupImageView.getImageReceiver().clearImage();
                    return;
                }
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(emojiAnimatedSticker.thumbs, this.colorKey1, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                backupImageView.setImage(ImageLocation.getForDocument(emojiAnimatedSticker), strM, null, null, svgThumb, "tgs", 0, obj);
                int i4 = this.stickerType;
                if (i4 == 9 || i4 == 0) {
                    backupImageView.getImageReceiver().setAutoRepeat(1);
                    return;
                } else {
                    backupImageView.getImageReceiver().setAutoRepeat(2);
                    return;
                }
            }
        }
        backupImageView.setImageDrawable(new RLottieDrawable(R.raw.utyan_empty, "utyan_empty", AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f), true, null));
    }

    public void setStickerType(int i) {
        if (this.stickerType != i) {
            this.stickerType = i;
            setSticker$1$1();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (Character.isWhitespace(charSequence.charAt(i2))) {
                i++;
            }
        }
        if (i > 4 && charSequence.length() > 20) {
            int length = charSequence.length() >> 1;
            int i3 = -1;
            int i4 = 0;
            for (int i5 = 0; i5 < charSequence.length(); i5++) {
                if (Character.isWhitespace(charSequence.charAt(i5))) {
                    int iAbs = Math.abs(length - i5);
                    if (i3 == -1 || iAbs < i4) {
                        i3 = i5;
                        i4 = iAbs;
                    }
                }
            }
            if (i3 > 0) {
                charSequence = ((Object) charSequence.subSequence(0, i3)) + "\n" + ((Object) charSequence.subSequence(i3 + 1, charSequence.length()));
            }
        }
        this.subtitle.setText(charSequence);
    }

    @Override
    public void setVisibility(int i) {
        setVisibility(i, true);
    }

    public void showProgress(boolean z, boolean z2) {
        if (this.progressShowing != z) {
            this.progressShowing = z;
            if (getVisibility() != 0) {
                return;
            }
            RadialProgressView radialProgressView = this.progressBar;
            View view = this.progressView;
            AnonymousClass2 anonymousClass2 = this.linearLayout;
            if (z2) {
                if (z) {
                    anonymousClass2.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                    this.showProgressRunnable.run();
                    return;
                }
                anonymousClass2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new AnonymousClass4(this, 2)).alpha(0.0f).setDuration(150L).start();
                } else {
                    radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                }
                this.stickerView.getImageReceiver().startAnimation();
                return;
            }
            if (!z) {
                anonymousClass2.animate().cancel();
                anonymousClass2.setAlpha(1.0f);
                anonymousClass2.setScaleX(1.0f);
                anonymousClass2.setScaleY(1.0f);
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.setVisibility(8);
                    return;
                } else {
                    radialProgressView.setAlpha(0.0f);
                    radialProgressView.setScaleX(0.5f);
                    radialProgressView.setScaleY(0.5f);
                    return;
                }
            }
            anonymousClass2.animate().cancel();
            anonymousClass2.setAlpha(0.0f);
            anonymousClass2.setScaleX(0.8f);
            anonymousClass2.setScaleY(0.8f);
            if (view != null) {
                view.animate().setListener(null).cancel();
                view.setAlpha(1.0f);
                view.setVisibility(0);
            } else {
                radialProgressView.setAlpha(1.0f);
                radialProgressView.setScaleX(1.0f);
                radialProgressView.setScaleY(1.0f);
            }
        }
    }

    public StickerEmptyView(int i, Theme.ResourcesProvider resourcesProvider, Context context, View view) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        this.showProgressRunnable = new LaunchActivity.AnonymousClass18(this, 5);
        this.colorKey1 = Theme.key_emptyListPlaceholder;
        this.resourcesProvider = resourcesProvider;
        this.progressView = view;
        this.stickerType = i;
        ?? r4 = new LinearLayout(context) {
            @Override
            public final void setVisibility(int i2) {
                int visibility = getVisibility();
                StickerEmptyView stickerEmptyView = StickerEmptyView.this;
                if (visibility == 8 && i2 == 0) {
                    stickerEmptyView.setSticker$1$1();
                    if (LiteMode.isEnabled(3)) {
                        stickerEmptyView.stickerView.getImageReceiver().startAnimation();
                    }
                } else if (i2 == 8) {
                    stickerEmptyView.stickerView.getImageReceiver().clearImage();
                }
                super.setVisibility(i2);
            }
        };
        this.linearLayout = r4;
        r4.setOrientation(1);
        BackupImageView backupImageView = new BackupImageView(context);
        this.stickerView = backupImageView;
        backupImageView.setOnClickListener(new GroupCallSheet$$ExternalSyntheticLambda5(this, 2));
        SpoilersTextView spoilersTextView = new SpoilersTextView(context, null, true);
        this.title = spoilersTextView;
        spoilersTextView.setTypeface(AndroidUtilities.bold());
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        spoilersTextView.setTag(Integer.valueOf(i2));
        spoilersTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
        spoilersTextView.setTextSize(1, 20.0f);
        spoilersTextView.setGravity(17);
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
        this.subtitle = linksTextView;
        int i3 = Theme.key_windowBackgroundWhiteGrayText;
        linksTextView.setTag(Integer.valueOf(i3));
        linksTextView.setTextColor(Theme.getColor(i3, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText, resourcesProvider));
        linksTextView.setTextSize(1, 14.0f);
        linksTextView.setGravity(17);
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, true);
        buttonWithCounterView.setRoundRadius(24);
        this.button = buttonWithCounterView;
        buttonWithCounterView.setVisibility(8);
        r4.addView(backupImageView, LayoutHelper.createLinear(117, 117, 1));
        r4.addView(spoilersTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 12, 0, 0));
        r4.addView(linksTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 8, 0, 0));
        r4.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 1, 28, 16, 28, 0));
        addView((View) r4, LayoutHelper.createFrame(-2, -2.0f, 17, 46.0f, 0.0f, 46.0f, 30.0f));
        if (view == null) {
            RadialProgressView radialProgressView = new RadialProgressView(context, resourcesProvider);
            this.progressBar = radialProgressView;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleY(0.5f);
            radialProgressView.setScaleX(0.5f);
            addView(radialProgressView, LayoutHelper.createFrame(-2, -2, 17));
        }
    }

    public final void setVisibility(int i, boolean z) {
        int i2 = 1;
        int i3 = 0;
        boolean z2 = i == 0;
        if (this.visibilityValue != z2) {
            this.visibilityValue = z2;
            setEnabled(z2);
            ValueAnimator valueAnimator = this.visibilityAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.visibilityAnimator = null;
            }
            if (z) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.visibilityFactor, z2 ? 1.0f : 0.0f);
                this.visibilityAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.setDuration(480L);
                this.visibilityAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.visibilityAnimator.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(this, 23));
                this.visibilityAnimator.start();
            } else {
                this.visibilityFactor = z2 ? 1.0f : 0.0f;
                onVisibilityChange();
            }
        }
        int visibility = getVisibility();
        BackupImageView backupImageView = this.stickerView;
        RadialProgressView radialProgressView = this.progressBar;
        AnonymousClass2 anonymousClass2 = this.linearLayout;
        View view = this.progressView;
        if (visibility != i && i == 0) {
            if (this.progressShowing) {
                anonymousClass2.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                view.animate().setListener(null).cancel();
                view.setVisibility(0);
                view.setAlpha(1.0f);
            } else {
                anonymousClass2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new AnonymousClass4(this, i3)).alpha(0.0f).setDuration(150L).start();
                } else {
                    radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                }
                backupImageView.getImageReceiver().startAnimation();
            }
        }
        super.setVisibility(i);
        if (getVisibility() == 0) {
            setSticker$1$1();
            return;
        }
        this.lastH = 0;
        anonymousClass2.setAlpha(0.0f);
        anonymousClass2.setScaleX(0.8f);
        anonymousClass2.setScaleY(0.8f);
        if (view != null) {
            view.animate().setListener(null).cancel();
            view.animate().setListener(new AnonymousClass4(this, i2)).alpha(0.0f).setDuration(150L).start();
        } else {
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.5f);
            radialProgressView.setScaleY(0.5f);
        }
        backupImageView.getImageReceiver().stopAnimation();
        backupImageView.getImageReceiver().clearImage();
    }
}
