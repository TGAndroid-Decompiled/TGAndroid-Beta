package org.telegram.ui.Components.glass;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import me.vkryl.android.AnimatorUtils;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.MainTabsLayout;

public final class GlassTabView extends FrameLayout implements MainTabsLayout.Tab, FactorAnimator.Target {
    public static final RectF tmpRectF = new RectF();
    public int additionalWidth;
    public float attachScale;
    public AvatarDrawable avatarDrawable;
    public BackupImageView backupImageView;
    public int colorDefault;
    public int colorSelected;
    public int colorSelectedText;
    public final AnimatedTextView.AnimatedTextDrawable counter;
    public final TextPaint defaultTextPaint;
    public float gestureSelectedOverride;
    public boolean hasGestureSelectedOverride;
    public boolean hasVisualWidth;
    public final RLottieImageView imageView;
    public final BoolAnimator isHasCounterAnimator;
    public final BoolAnimator isHasCounterErrorAnimator;
    public final BoolAnimator isSelectedAnimator;
    public long lastBotIconId;
    public int lastIconAnimationRaw;
    public boolean lastIsSelected;
    public boolean needUpdateBackupViewColor;
    public final Paint paintCounterBackground;
    public Drawable premiumStarDrawable;
    public Theme.ResourcesProvider resourcesProvider;
    public TextPaint scaledTextPaint;
    public boolean selfMeasure;
    public boolean skipDrawSelector;
    public TabAnimation tabAnimation;
    public TLRPC.TL_attachMenuBot tabAnimationBot;
    public final TextView textView;
    public boolean usePremiumCounter;
    public float visualWidth;

    public GlassTabView(Context context) {
        super(context);
        this.paintCounterBackground = new Paint(1);
        this.isSelectedAnimator = new BoolAnimator(0, this, AnimatorUtils.DECELERATE_INTERPOLATOR, 320L, false);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.isHasCounterAnimator = new BoolAnimator(1, this, cubicBezierInterpolator, 380L, false);
        this.isHasCounterErrorAnimator = new BoolAnimator(2, this, cubicBezierInterpolator, 380L, false);
        this.attachScale = 1.0f;
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        addView(rLottieImageView, LayoutHelper.createFrame(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        this.defaultTextPaint = new TextPaint(textView.getPaint());
        addView(textView, LayoutHelper.createFrame(-1, -2.0f, 49, 0.0f, 28.33f, 0.0f, 0.0f));
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, false, false, false);
        this.counter = animatedTextDrawable;
        Typeface typefaceBold = AndroidUtilities.bold();
        TextPaint textPaint = animatedTextDrawable.textPaint;
        textPaint.setTypeface(typefaceBold);
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.gravity = 17;
        textPaint.setColor(-1);
        animatedTextDrawable.alpha = Color.alpha(-1);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(10.0f));
    }

    public static GlassTabView createMainTab(Context context, Theme.ResourcesProvider resourcesProvider, TabAnimation tabAnimation, int i) {
        GlassTabView glassTabView = new GlassTabView(context);
        glassTabView.resourcesProvider = resourcesProvider;
        glassTabView.tabAnimation = tabAnimation;
        glassTabView.textView.setText(LocaleController.getString(i));
        glassTabView.checkPlayAnimation(false);
        glassTabView.imageView.setLayoutParams(LayoutHelper.createFrame(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        glassTabView.colorDefault = Theme.getColor(Theme.key_glass_tabUnselected, resourcesProvider);
        glassTabView.colorSelected = Theme.getColor(Theme.key_glass_tabSelected, resourcesProvider);
        glassTabView.colorSelectedText = Theme.getColor(Theme.key_glass_tabSelectedText, resourcesProvider);
        glassTabView.updateColors$11();
        return glassTabView;
    }

    public final void checkPlayAnimation(boolean z) {
        TLRPC.Document document;
        boolean z2 = this.isSelectedAnimator.value;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.tabAnimationBot;
        boolean z3 = true;
        if (tL_attachMenuBot != null) {
            TLRPC.TL_attachMenuBotIcon animatedAttachMenuBotIcon = MediaDataController.getAnimatedAttachMenuBotIcon(tL_attachMenuBot, z2);
            if (animatedAttachMenuBotIcon == null) {
                animatedAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(this.tabAnimationBot);
                z3 = false;
            }
            if (animatedAttachMenuBotIcon == null || (document = animatedAttachMenuBotIcon.icon) == null) {
                this.backupImageView.imageReceiver.clearImage();
            } else if (this.lastBotIconId != document.id) {
                this.backupImageView.setImage(ImageLocation.getForDocument(document), "24_24_lastframe", ImageLocation.getForDocument(document), "24_24_lastframe", z3 ? null : DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 1.0f), this.tabAnimationBot);
                this.lastBotIconId = document.id;
            }
            updateColors$11();
            return;
        }
        TabAnimation tabAnimation = this.tabAnimation;
        if (tabAnimation == null) {
            return;
        }
        RLottieImageView rLottieImageView = this.imageView;
        int i = tabAnimation.iconStatic;
        if (i != -1) {
            rLottieImageView.setImageResource(i);
            updateColors$11();
            return;
        }
        int i2 = tabAnimation.iconToOutline;
        int i3 = tabAnimation.iconToFilled;
        int i4 = z2 ? i3 : i2;
        if (tabAnimation.endFrameMid != -1) {
            boolean z4 = this.lastIsSelected != z2;
            if (this.lastIconAnimationRaw != i4) {
                this.lastIconAnimationRaw = i4;
                rLottieImageView.setAnimation(i4, 24, 24, null);
                z4 = true;
            }
            if (z4) {
                RLottieDrawable animatedDrawable = rLottieImageView.getAnimatedDrawable();
                if (animatedDrawable == null) {
                    return;
                }
                if (z2) {
                    animatedDrawable.setCustomEndFrame(this.tabAnimation.endFrameMid);
                    if (animatedDrawable.currentFrame >= this.tabAnimation.endFrameEnd - 2) {
                        animatedDrawable.setCurrentFrame(0, false, false);
                    }
                    int i5 = animatedDrawable.currentFrame;
                    int i6 = this.tabAnimation.endFrameMid;
                    if (i5 <= i6) {
                        animatedDrawable.start();
                    } else {
                        animatedDrawable.setCurrentFrame(i6, true, false);
                    }
                } else {
                    int i7 = animatedDrawable.currentFrame;
                    TabAnimation tabAnimation2 = this.tabAnimation;
                    if (i7 >= tabAnimation2.endFrameMid - 1) {
                        animatedDrawable.setCustomEndFrame(tabAnimation2.endFrameEnd - 1);
                        animatedDrawable.start();
                    } else {
                        animatedDrawable.setCustomEndFrame(0);
                        animatedDrawable.setCurrentFrame(0, true, false);
                    }
                }
            }
            this.lastIsSelected = z2;
            return;
        }
        if (i3 != i2) {
            if (this.lastIconAnimationRaw != i4) {
                this.lastIconAnimationRaw = i4;
                rLottieImageView.setAnimation(i4, 24, 24, null);
                rLottieImageView.getAnimatedDrawable().playInDirectionOfCustomEndFrame = false;
                if (!z) {
                    rLottieImageView.getAnimatedDrawable().setProgress(0.99f, true);
                    return;
                } else {
                    rLottieImageView.getAnimatedDrawable().setCurrentFrame(0, true, false);
                    rLottieImageView.playAnimation();
                    return;
                }
            }
            return;
        }
        if (rLottieImageView.getAnimatedDrawable() == null) {
            rLottieImageView.setAnimation(this.tabAnimation.iconToFilled, 24, 24, null);
        }
        RLottieDrawable animatedDrawable2 = rLottieImageView.getAnimatedDrawable();
        if (animatedDrawable2 == null || this.lastIsSelected == z2) {
            return;
        }
        this.lastIsSelected = z2;
        int[] iArr = animatedDrawable2.metaData;
        if (z2) {
            animatedDrawable2.playInDirectionOfCustomEndFrame = false;
            animatedDrawable2.setCurrentFrame(0, true, false);
            animatedDrawable2.setCustomEndFrame(iArr[0]);
        } else {
            animatedDrawable2.playInDirectionOfCustomEndFrame = true;
            animatedDrawable2.setCurrentFrame(iArr[0], true, false);
            animatedDrawable2.setCustomEndFrame(0);
        }
        rLottieImageView.playAnimation();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = this.hasVisualWidth ? this.visualWidth : getWidth();
        float f = this.hasGestureSelectedOverride ? this.gestureSelectedOverride : this.isSelectedAnimator.floatValue;
        RectF rectF = tmpRectF;
        Paint paint = this.paintCounterBackground;
        if (f > 0.0f && !this.skipDrawSelector) {
            paint.setColor(Theme.multAlpha(AnimatorUtils.DECELERATE_INTERPOLATOR.getInterpolation(f) * 0.09f, this.colorSelected));
            rectF.set(0.0f, 0.0f, width, getHeight());
            float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float fClamp = MathUtils.clamp(this.attachScale, 0.0f, 1.0f) * AndroidUtilities.lerp(0.6f, 1.0f, f);
            canvas.save();
            canvas.scale(fClamp, fClamp, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
            canvas.restore();
        }
        float f2 = (this.usePremiumCounter ? 1.0f : this.isHasCounterAnimator.floatValue) * this.attachScale;
        boolean z = f2 > 0.0f;
        if (z) {
            canvas.saveLayer(0.0f, 0.0f, width, getHeight(), null);
        }
        super.dispatchDraw(canvas);
        if (f2 > 0.0f) {
            canvas.save();
            float fDpf2 = AndroidUtilities.dpf2(1.33f);
            float fDpf3 = AndroidUtilities.dpf2(11.0f) + (width / 2.0f);
            float fDpf4 = AndroidUtilities.dpf2(10.0f);
            float fDpf5 = AndroidUtilities.dpf2(16.0f);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.counter;
            float fMax = Math.max(fDpf5, animatedTextDrawable.getCurrentWidth() + AndroidUtilities.dp(8.0f));
            float fDpf6 = AndroidUtilities.dpf2(9.333f);
            float fDpf7 = AndroidUtilities.dpf2(8.0f);
            float f3 = fMax / 2.0f;
            float f4 = fDpf5 / 2.0f;
            rectF.set((fDpf3 - f3) - fDpf2, (fDpf4 - f4) - fDpf2, f3 + fDpf3 + fDpf2, f4 + fDpf4 + fDpf2);
            canvas.scale(f2, f2, fDpf3, fDpf4);
            canvas.drawRoundRect(rectF, fDpf6, fDpf6, Theme.PAINT_CLEAR);
            rectF.inset(fDpf2, fDpf2);
            if (this.usePremiumCounter) {
                if (this.premiumStarDrawable == null) {
                    this.premiumStarDrawable = getContext().getResources().getDrawable(R.drawable.star).mutate();
                }
                PremiumGradient.getInstance().mainGradient.gradientMatrix(0, 0.0f, 0, AndroidUtilities.dp(96.0f), 0.0f, AndroidUtilities.dp(16.0f));
                canvas.drawRoundRect(rectF, fDpf7, fDpf7, PremiumGradient.getInstance().getMainGradientPaint());
                int iDpf2 = (int) (fDpf3 - AndroidUtilities.dpf2(7.0f));
                int iDpf3 = (int) (fDpf4 - AndroidUtilities.dpf2(7.0f));
                this.premiumStarDrawable.setBounds(iDpf2, iDpf3, AndroidUtilities.dp(14.0f) + iDpf2, AndroidUtilities.dp(14.0f) + iDpf3);
                this.premiumStarDrawable.draw(canvas);
            } else {
                paint.setColor(ColorUtils.blendARGB(this.isHasCounterErrorAnimator.floatValue, Theme.getColor(null, Theme.key_telegram_color, false), Theme.getColor(null, Theme.key_fill_RedNormal, false)));
                canvas.drawRoundRect(rectF, fDpf7, fDpf7, paint);
                animatedTextDrawable.setBounds(rectF);
                animatedTextDrawable.draw(canvas);
            }
            canvas.restore();
        }
        if (z) {
            canvas.restore();
        }
    }

    public BackupImageView getBackupImageView() {
        return this.backupImageView;
    }

    public final float measureAttachTabWidth() {
        float fMeasureText = this.defaultTextPaint.measureText(this.textView.getText().toString());
        return Math.min(AndroidUtilities.dp(84.0f), (int) ((AndroidUtilities.lerp(AndroidUtilities.dpf2(16.0f), AndroidUtilities.dp(8.0f), MathUtils.clamp((fMeasureText - AndroidUtilities.dp(40.0f)) / AndroidUtilities.dp(16.0f), 0.0f, 1.0f)) * 2.0f) + fMeasureText));
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            updateColors$11();
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (this.selfMeasure) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) measureAttachTabWidth()) + this.additionalWidth, 1073741824), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.hasVisualWidth) {
            float measuredWidth = (this.visualWidth - getMeasuredWidth()) / 2.0f;
            this.imageView.setTranslationX(measuredWidth);
            this.textView.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i) {
        this.additionalWidth = i;
        this.selfMeasure = true;
    }

    public void setAttachScale(float f) {
        TextView textView = this.textView;
        textView.setScaleX(f);
        textView.setScaleY(f);
        RLottieImageView rLottieImageView = this.imageView;
        rLottieImageView.setScaleX(f);
        rLottieImageView.setScaleY(f);
        BackupImageView backupImageView = this.backupImageView;
        if (backupImageView != null) {
            backupImageView.setScaleX(f);
            this.backupImageView.setScaleY(f);
        }
        this.attachScale = f;
        invalidate();
    }

    public final void setCounter(String str, boolean z, boolean z2) {
        this.counter.setText(str, z2, true);
        this.isHasCounterAnimator.setValue(!TextUtils.isEmpty(str), z2);
        this.isHasCounterErrorAnimator.setValue(z, z2);
    }

    public void setPremiumBadge(boolean z) {
        this.usePremiumCounter = z;
    }

    public final void setSelected(boolean z, boolean z2) {
        this.isSelectedAnimator.setValue(z, z2);
        checkPlayAnimation(z2);
        this.textView.setTypeface(z ? AndroidUtilities.getTypeface("fonts/rextrabold.ttf") : AndroidUtilities.bold());
    }

    public void setSkipDrawSelector(boolean z) {
        if (this.skipDrawSelector != z) {
            this.skipDrawSelector = z;
            invalidate();
        }
    }

    public void setTabAnimation(TabAnimation tabAnimation) {
        this.tabAnimation = tabAnimation;
        this.tabAnimationBot = null;
        this.lastIconAnimationRaw = 0;
        this.lastBotIconId = 0L;
        this.imageView.clearAnimationDrawable();
        checkPlayAnimation(false);
    }

    public void setText(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public void setTextSizeDp(float f) {
        float fDp = AndroidUtilities.dp(f);
        TextView textView = this.textView;
        if (textView.getTextSize() != fDp) {
            textView.setTextSize(1, f);
            this.defaultTextPaint.setTextSize(fDp);
        }
    }

    public void setVisualWidth(float f) {
        this.hasVisualWidth = true;
        if (this.visualWidth != f) {
            this.visualWidth = f;
            float measuredWidth = (f - getMeasuredWidth()) / 2.0f;
            this.imageView.setTranslationX(measuredWidth);
            this.textView.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    public final void updateColors$11() {
        int i = this.colorDefault;
        int i2 = this.colorSelected;
        BoolAnimator boolAnimator = this.isSelectedAnimator;
        int iBlendARGB = ColorUtils.blendARGB(boolAnimator.floatValue, i, i2);
        int iBlendARGB2 = ColorUtils.blendARGB(boolAnimator.floatValue, this.colorDefault, this.colorSelectedText);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(iBlendARGB, PorterDuff.Mode.SRC_IN);
        BackupImageView backupImageView = this.backupImageView;
        if (backupImageView != null && this.needUpdateBackupViewColor) {
            backupImageView.setColorFilter(porterDuffColorFilter);
            this.backupImageView.invalidate();
        }
        this.imageView.setColorFilter(porterDuffColorFilter);
        this.textView.setTextColor(iBlendARGB2);
    }

    public enum TabAnimation {
        CONTACTS(R.raw.tab_contacts),
        CALLS(R.raw.tab_calls),
        CHATS(R.raw.tab_chats),
        SETTINGS(R.raw.tab_settings),
        CHECKLIST("CHECKLIST", R.raw.tab_checklist_reverse),
        COLORS("COLORS", R.raw.tab_colors_reverse),
        FILES("FILES", R.raw.tab_files_reverse),
        GALLERY("GALLERY", R.raw.tab_gallery_reverse),
        EF7("GIFT", R.raw.tab_gift_reverse),
        LOCATION("LOCATION", R.raw.tab_location_reverse),
        STICKER("STICKER", R.raw.tab_sticker_reverse),
        EMOJI("EMOJI", R.raw.tab_emoji_reverse),
        MODELS("MODELS", R.raw.tab_models_reverse),
        MUSIC("MUSIC", R.raw.tab_music_reverse),
        POLL("POLL", R.raw.tab_poll_reverse),
        SYMBOLS("SYMBOLS", R.raw.tab_symbols_reverse),
        REPLIES("REPLIES", R.raw.tab_reply_reverse),
        EF0("WALLET", R.raw.tab_wallet_reverse),
        LINK,
        ARTICLE("ARTICLE", R.raw.tab_article_reverse),
        BOOSTS(R.raw.boosts, 25, 49),
        MONETIZATION(R.raw.monetize, 19, 45);

        public final int endFrameEnd;
        public final int endFrameMid;
        public final int iconStatic;
        public final int iconToFilled;
        public final int iconToOutline;

        TabAnimation(int i, int i2, int i3) {
            this.iconToFilled = i;
            this.iconToOutline = i;
            this.endFrameMid = i2;
            this.endFrameEnd = i3;
            this.iconStatic = -1;
        }

        TabAnimation() {
            this.iconStatic = i;
            this.iconToFilled = -1;
            this.iconToOutline = -1;
            this.endFrameMid = -1;
            this.endFrameEnd = -1;
        }

        TabAnimation(int i) {
            this.iconToFilled = i;
            this.iconToOutline = i;
            this.endFrameMid = -1;
            this.endFrameEnd = -1;
            this.iconStatic = -1;
        }

        TabAnimation(String str, int i) {
            this.iconToFilled = i;
            this.iconToOutline = i;
            this.endFrameMid = -1;
            this.endFrameEnd = -1;
            this.iconStatic = -1;
        }
    }
}
