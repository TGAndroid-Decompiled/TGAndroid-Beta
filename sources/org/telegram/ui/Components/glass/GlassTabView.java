package org.telegram.ui.Components.glass;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
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
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
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

public class GlassTabView extends FrameLayout implements MainTabsLayout.Tab, FactorAnimator.Target {
    private static final RectF tmpRectF = new RectF();
    private int additionalWidth;
    public float attachScale;
    private AvatarDrawable avatarDrawable;
    private BackupImageView backupImageView;
    private int colorDefault;
    private int colorSelected;
    private int colorSelectedText;
    private final AnimatedTextView.AnimatedTextDrawable counter;
    private final TextPaint defaultTextPaint;
    private float gestureSelectedOverride;
    private boolean hasGestureSelectedOverride;
    private boolean hasVisualWidth;
    private final RLottieImageView imageView;
    private final BoolAnimator isHasCounterAnimator;
    private final BoolAnimator isHasCounterErrorAnimator;
    private final BoolAnimator isSelectedAnimator;
    private long lastBotIconId;
    private int lastIconAnimationRaw;
    private boolean lastIsSelected;
    private boolean needUpdateBackupViewColor;
    private final Paint paintCounterBackground;
    private Drawable premiumStarDrawable;
    private Theme.ResourcesProvider resourcesProvider;
    private boolean selfMeasure;
    private TabAnimation tabAnimation;
    private TLRPC.TL_attachMenuBot tabAnimationBot;
    private final TextView textView;
    private boolean usePremiumCounter;
    private float visualWidth;

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    public void onPreBind() {
    }

    public GlassTabView(Context context) {
        super(context);
        this.paintCounterBackground = new Paint(1);
        this.isSelectedAnimator = new BoolAnimator(0, this, AnimatorUtils.DECELERATE_INTERPOLATOR, 320L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.isHasCounterAnimator = new BoolAnimator(1, this, cubicBezierInterpolator, 380L);
        this.isHasCounterErrorAnimator = new BoolAnimator(2, this, cubicBezierInterpolator, 380L);
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
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable();
        this.counter = animatedTextDrawable;
        animatedTextDrawable.setTypeface(AndroidUtilities.bold());
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.setGravity(17);
        animatedTextDrawable.setTextColor(-1);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(10.0f));
    }

    public void setVisualWidth(float f) {
        this.hasVisualWidth = true;
        if (this.visualWidth != f) {
            this.visualWidth = f;
            checkVisualWidth();
            invalidate();
        }
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        checkVisualWidth();
    }

    private void checkVisualWidth() {
        if (this.hasVisualWidth) {
            float measuredWidth = (this.visualWidth - getMeasuredWidth()) / 2.0f;
            this.imageView.setTranslationX(measuredWidth);
            this.textView.setTranslationX(measuredWidth);
        }
    }

    public void setGestureSelectedOverride(float f, boolean z) {
        this.gestureSelectedOverride = f;
        this.hasGestureSelectedOverride = z;
        invalidate();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        float width = this.hasVisualWidth ? this.visualWidth : getWidth();
        float floatValue = this.hasGestureSelectedOverride ? this.gestureSelectedOverride : this.isSelectedAnimator.getFloatValue();
        if (floatValue > 0.0f) {
            this.paintCounterBackground.setColor(Theme.multAlpha(this.colorSelected, AnimatorUtils.DECELERATE_INTERPOLATOR.getInterpolation(floatValue) * 0.09f));
            RectF rectF = tmpRectF;
            rectF.set(0.0f, 0.0f, width, getHeight());
            float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float fLerp = AndroidUtilities.lerp(0.6f, 1.0f, floatValue) * MathUtils.clamp(this.attachScale, 0.0f, 1.0f);
            canvas.save();
            canvas.scale(fLerp, fLerp, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, fMin, fMin, this.paintCounterBackground);
            canvas.restore();
        }
        float floatValue2 = (this.usePremiumCounter ? 1.0f : this.isHasCounterAnimator.getFloatValue()) * this.attachScale;
        boolean z = floatValue2 > 0.0f;
        if (z) {
            canvas.saveLayer(0.0f, 0.0f, width, getHeight(), null);
        }
        super.dispatchDraw(canvas);
        if (floatValue2 > 0.0f) {
            canvas.save();
            float fDpf2 = AndroidUtilities.dpf2(1.33f);
            float fDpf22 = (width / 2.0f) + AndroidUtilities.dpf2(11.0f);
            float fDpf23 = AndroidUtilities.dpf2(10.0f);
            float fDpf24 = AndroidUtilities.dpf2(16.0f);
            float fMax = Math.max(fDpf24, this.counter.getCurrentWidth() + AndroidUtilities.dp(8.0f));
            float fDpf25 = AndroidUtilities.dpf2(9.333f);
            float fDpf26 = AndroidUtilities.dpf2(8.0f);
            RectF rectF2 = tmpRectF;
            float f = fMax / 2.0f;
            float f2 = fDpf24 / 2.0f;
            rectF2.set((fDpf22 - f) - fDpf2, (fDpf23 - f2) - fDpf2, f + fDpf22 + fDpf2, f2 + fDpf23 + fDpf2);
            canvas.scale(floatValue2, floatValue2, fDpf22, fDpf23);
            canvas.drawRoundRect(rectF2, fDpf25, fDpf25, Theme.PAINT_CLEAR);
            rectF2.inset(fDpf2, fDpf2);
            if (this.usePremiumCounter) {
                if (this.premiumStarDrawable == null) {
                    this.premiumStarDrawable = getContext().getResources().getDrawable(R.drawable.star).mutate();
                }
                PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(16.0f), 0.0f, 0.0f);
                canvas.drawRoundRect(rectF2, fDpf26, fDpf26, PremiumGradient.getInstance().getMainGradientPaint());
                int iDpf2 = (int) (fDpf22 - AndroidUtilities.dpf2(7.0f));
                int iDpf22 = (int) (fDpf23 - AndroidUtilities.dpf2(7.0f));
                this.premiumStarDrawable.setBounds(iDpf2, iDpf22, AndroidUtilities.dp(14.0f) + iDpf2, AndroidUtilities.dp(14.0f) + iDpf22);
                this.premiumStarDrawable.draw(canvas);
            } else {
                this.paintCounterBackground.setColor(ColorUtils.blendARGB(Theme.getColor(Theme.key_telegram_color), Theme.getColor(Theme.key_fill_RedNormal), this.isHasCounterErrorAnimator.getFloatValue()));
                canvas.drawRoundRect(rectF2, fDpf26, fDpf26, this.paintCounterBackground);
                this.counter.setBounds(rectF2);
                this.counter.draw(canvas);
            }
            canvas.restore();
        }
        if (z) {
            canvas.restore();
        }
    }

    public void setCounter(String str, boolean z, boolean z2) {
        this.counter.setText(str, z2);
        this.isHasCounterAnimator.setValue(!TextUtils.isEmpty(str), z2);
        this.isHasCounterErrorAnimator.setValue(z, z2);
    }

    public void setPremiumBadge(boolean z) {
        this.usePremiumCounter = z;
    }

    public void setSelected(boolean z, boolean z2) {
        this.isSelectedAnimator.setValue(z, z2);
        checkPlayAnimation(z2);
        this.textView.setTypeface(z ? AndroidUtilities.getTypeface("fonts/rextrabold.ttf") : AndroidUtilities.bold());
    }

    @Override
    public boolean isSelected() {
        return this.isSelectedAnimator.getValue();
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            updateColors();
        }
        invalidate();
    }

    private void updateColors() {
        int iBlendARGB = ColorUtils.blendARGB(this.colorDefault, this.colorSelected, this.isSelectedAnimator.getFloatValue());
        int iBlendARGB2 = ColorUtils.blendARGB(this.colorDefault, this.colorSelectedText, this.isSelectedAnimator.getFloatValue());
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(iBlendARGB, PorterDuff.Mode.SRC_IN);
        BackupImageView backupImageView = this.backupImageView;
        if (backupImageView != null && this.needUpdateBackupViewColor) {
            backupImageView.setColorFilter(porterDuffColorFilter);
            this.backupImageView.invalidate();
        }
        this.imageView.setColorFilter(porterDuffColorFilter);
        this.textView.setTextColor(iBlendARGB2);
    }

    public void updateColorsLottie() {
        this.colorDefault = Theme.getColor(Theme.key_glass_tabUnselected, this.resourcesProvider);
        this.colorSelected = Theme.getColor(Theme.key_glass_tabSelected, this.resourcesProvider);
        this.colorSelectedText = Theme.getColor(Theme.key_glass_tabSelectedText, this.resourcesProvider);
        updateColors();
        invalidate();
    }

    private void checkPlayAnimation(boolean z) {
        TLRPC.Document document;
        boolean value = this.isSelectedAnimator.getValue();
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.tabAnimationBot;
        boolean z2 = true;
        if (tL_attachMenuBot != null) {
            TLRPC.TL_attachMenuBotIcon animatedAttachMenuBotIcon = MediaDataController.getAnimatedAttachMenuBotIcon(tL_attachMenuBot, value);
            if (animatedAttachMenuBotIcon == null) {
                animatedAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(this.tabAnimationBot);
                z2 = false;
            }
            if (animatedAttachMenuBotIcon == null || (document = animatedAttachMenuBotIcon.icon) == null) {
                this.backupImageView.clearImage();
            } else if (this.lastBotIconId != document.id) {
                String str = "24_24_lastframe";
                this.backupImageView.setImage(ImageLocation.getForDocument(document), str, ImageLocation.getForDocument(document), str, z2 ? null : DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 1.0f), this.tabAnimationBot);
                this.lastBotIconId = document.id;
            }
            updateColors();
            return;
        }
        TabAnimation tabAnimation = this.tabAnimation;
        if (tabAnimation == null) {
            return;
        }
        int i = value ? tabAnimation.iconToFilled : tabAnimation.iconToOutline;
        if (tabAnimation.endFrameMid != -1) {
            boolean z3 = this.lastIsSelected != value;
            if (this.lastIconAnimationRaw != i) {
                this.lastIconAnimationRaw = i;
                this.imageView.setAnimation(i, 24, 24);
                z3 = true;
            }
            if (z3) {
                RLottieDrawable animatedDrawable = this.imageView.getAnimatedDrawable();
                if (animatedDrawable == null) {
                    return;
                }
                if (value) {
                    animatedDrawable.setCustomEndFrame(this.tabAnimation.endFrameMid);
                    if (animatedDrawable.getCurrentFrame() >= this.tabAnimation.endFrameEnd - 2) {
                        animatedDrawable.setCurrentFrame(0, false);
                    }
                    int currentFrame = animatedDrawable.getCurrentFrame();
                    int i2 = this.tabAnimation.endFrameMid;
                    if (currentFrame <= i2) {
                        animatedDrawable.start();
                    } else {
                        animatedDrawable.setCurrentFrame(i2);
                    }
                } else {
                    int currentFrame2 = animatedDrawable.getCurrentFrame();
                    TabAnimation tabAnimation2 = this.tabAnimation;
                    if (currentFrame2 >= tabAnimation2.endFrameMid - 1) {
                        animatedDrawable.setCustomEndFrame(tabAnimation2.endFrameEnd - 1);
                        animatedDrawable.start();
                    } else {
                        animatedDrawable.setCustomEndFrame(0);
                        animatedDrawable.setCurrentFrame(0);
                    }
                }
            }
            this.lastIsSelected = value;
            return;
        }
        if (tabAnimation.iconToFilled != tabAnimation.iconToOutline) {
            if (this.lastIconAnimationRaw != i) {
                this.lastIconAnimationRaw = i;
                this.imageView.setAnimation(i, 24, 24);
                this.imageView.getAnimatedDrawable().setPlayInDirectionOfCustomEndFrame(false);
                if (z) {
                    this.imageView.getAnimatedDrawable().setCurrentFrame(0);
                    this.imageView.playAnimation();
                    return;
                } else {
                    this.imageView.getAnimatedDrawable().setProgress(0.99f);
                    return;
                }
            }
            return;
        }
        if (this.imageView.getAnimatedDrawable() == null) {
            this.imageView.setAnimation(this.tabAnimation.iconToFilled, 24, 24);
        }
        RLottieDrawable animatedDrawable2 = this.imageView.getAnimatedDrawable();
        if (animatedDrawable2 == null || this.lastIsSelected == value) {
            return;
        }
        this.lastIsSelected = value;
        if (value) {
            animatedDrawable2.setPlayInDirectionOfCustomEndFrame(false);
            animatedDrawable2.setCurrentFrame(0);
            animatedDrawable2.setCustomEndFrame(animatedDrawable2.getFramesCount());
        } else {
            animatedDrawable2.setPlayInDirectionOfCustomEndFrame(true);
            animatedDrawable2.setCurrentFrame(animatedDrawable2.getFramesCount());
            animatedDrawable2.setCustomEndFrame(0);
        }
        this.imageView.playAnimation();
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
        glassTabView.updateColors();
        return glassTabView;
    }

    public static GlassTabView createAvatar(Context context, Theme.ResourcesProvider resourcesProvider, int i, int i2) {
        GlassTabView glassTabView = new GlassTabView(context);
        glassTabView.textView.setText(LocaleController.getString(i2));
        glassTabView.imageView.setVisibility(8);
        TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(UserConfig.getInstance(i).getClientUserId()));
        AvatarDrawable avatarDrawable = new AvatarDrawable(user);
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setForUserOrChat(user, avatarDrawable);
        backupImageView.setRoundRadius(AndroidUtilities.dp(11.0f));
        glassTabView.backupImageView = backupImageView;
        glassTabView.addView(backupImageView, LayoutHelper.createFrame(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        glassTabView.colorDefault = Theme.getColor(Theme.key_glass_tabUnselected, resourcesProvider);
        glassTabView.colorSelected = Theme.getColor(Theme.key_glass_tabSelected, resourcesProvider);
        glassTabView.colorSelectedText = Theme.getColor(Theme.key_glass_tabSelectedText, resourcesProvider);
        glassTabView.updateColors();
        return glassTabView;
    }

    public void updateUserAvatar(int i) {
        TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(UserConfig.getInstance(i).getClientUserId()));
        this.backupImageView.setForUserOrChat(user, new AvatarDrawable(user));
    }

    public static GlassTabView createAttachTab(Context context, Theme.ResourcesProvider resourcesProvider) {
        GlassTabView glassTabView = new GlassTabView(context);
        glassTabView.resourcesProvider = resourcesProvider;
        glassTabView.selfMeasure = true;
        glassTabView.textView.setTextSize(1, 11.0f);
        glassTabView.textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        glassTabView.checkPlayAnimation(false);
        glassTabView.imageView.setLayoutParams(LayoutHelper.createFrame(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        glassTabView.colorDefault = Theme.getColor(Theme.key_glass_tabUnselected, resourcesProvider);
        glassTabView.colorSelected = Theme.getColor(Theme.key_glass_tabSelected, resourcesProvider);
        glassTabView.colorSelectedText = Theme.getColor(Theme.key_glass_tabSelectedText, resourcesProvider);
        glassTabView.updateColors();
        return glassTabView;
    }

    public static GlassTabView createAttachBotTab(Context context, Theme.ResourcesProvider resourcesProvider) {
        GlassTabView glassTabView = new GlassTabView(context);
        glassTabView.resourcesProvider = resourcesProvider;
        glassTabView.selfMeasure = true;
        glassTabView.textView.setTextSize(1, 11.0f);
        glassTabView.textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        glassTabView.imageView.setVisibility(8);
        glassTabView.checkPlayAnimation(false);
        BackupImageView backupImageView = new BackupImageView(context);
        glassTabView.backupImageView = backupImageView;
        glassTabView.addView(backupImageView, LayoutHelper.createFrame(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        glassTabView.colorDefault = Theme.getColor(Theme.key_glass_tabUnselected, resourcesProvider);
        glassTabView.colorSelected = Theme.getColor(Theme.key_glass_tabSelected, resourcesProvider);
        glassTabView.colorSelectedText = Theme.getColor(Theme.key_glass_tabSelectedText, resourcesProvider);
        glassTabView.updateColors();
        return glassTabView;
    }

    public BackupImageView getBackupImageView() {
        return this.backupImageView;
    }

    public void setAdditionalWidth(int i) {
        this.additionalWidth = i;
        this.selfMeasure = true;
    }

    public float measureAttachTabWidth() {
        float fMeasureTextWidth = measureTextWidth();
        return Math.min(AndroidUtilities.dp(84.0f), (int) (fMeasureTextWidth + (AndroidUtilities.lerp(AndroidUtilities.dpf2(16.0f), AndroidUtilities.dp(8.0f), MathUtils.clamp((fMeasureTextWidth - AndroidUtilities.dp(40.0f)) / AndroidUtilities.dp(16.0f), 0.0f, 1.0f)) * 2.0f)));
    }

    public void setAttachScale(float f) {
        this.textView.setScaleX(f);
        this.textView.setScaleY(f);
        this.imageView.setScaleX(f);
        this.imageView.setScaleY(f);
        BackupImageView backupImageView = this.backupImageView;
        if (backupImageView != null) {
            backupImageView.setScaleX(f);
            this.backupImageView.setScaleY(f);
        }
        this.attachScale = f;
        invalidate();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        if (this.selfMeasure) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) measureAttachTabWidth()) + this.additionalWidth, 1073741824), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override
    public float measureTextWidth() {
        return this.defaultTextPaint.measureText(this.textView.getText().toString());
    }

    public enum TabAnimation {
        CONTACTS(R.raw.tab_contacts),
        CALLS(R.raw.tab_calls),
        CHATS(R.raw.tab_chats),
        SETTINGS(R.raw.tab_settings),
        CHECKLIST(R.raw.tab_checklist, R.raw.tab_checklist_reverse),
        COLORS(R.raw.tab_colors, R.raw.tab_colors_reverse),
        FILES(R.raw.tab_files, R.raw.tab_files_reverse),
        GALLERY(R.raw.tab_gallery, R.raw.tab_gallery_reverse),
        GIFT(R.raw.tab_gift, R.raw.tab_gift_reverse),
        LOCATION(R.raw.tab_location, R.raw.tab_location_reverse),
        STICKER(R.raw.tab_sticker, R.raw.tab_sticker_reverse),
        EMOJI(R.raw.tab_emoji, R.raw.tab_emoji_reverse),
        MODELS(R.raw.tab_models, R.raw.tab_models_reverse),
        MUSIC(R.raw.tab_music, R.raw.tab_music_reverse),
        POLL(R.raw.tab_poll, R.raw.tab_poll_reverse),
        SYMBOLS(R.raw.tab_symbols, R.raw.tab_symbols_reverse),
        REPLIES(R.raw.tab_reply, R.raw.tab_reply_reverse),
        WALLET(R.raw.tab_wallet, R.raw.tab_wallet_reverse),
        BOOSTS(R.raw.boosts, 25, 49),
        MONETIZATION(R.raw.monetize, 19, 45);

        public final int endFrameEnd;
        public final int endFrameMid;
        public final int iconToFilled;
        public final int iconToOutline;

        TabAnimation(int i, int i2, int i3) {
            this.iconToFilled = i;
            this.iconToOutline = i;
            this.endFrameMid = i2;
            this.endFrameEnd = i3;
        }

        TabAnimation(int i) {
            this.iconToFilled = i;
            this.iconToOutline = i;
            this.endFrameMid = -1;
            this.endFrameEnd = -1;
        }

        TabAnimation(int i, int i2) {
            this.iconToFilled = i;
            this.iconToOutline = i2;
            this.endFrameMid = -1;
            this.endFrameEnd = -1;
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

    public void setAttachBot(TLRPC.User user, TLRPC.TL_attachMenuBot tL_attachMenuBot, int i) {
        if (user == null || tL_attachMenuBot == null) {
            return;
        }
        this.tabAnimation = null;
        this.tabAnimationBot = tL_attachMenuBot;
        this.lastIconAnimationRaw = 0;
        this.lastBotIconId = 0L;
        this.textView.setText(tL_attachMenuBot.short_name);
        this.backupImageView.setRoundRadius(0);
        this.backupImageView.setSize(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        this.backupImageView.setLayoutParams(LayoutHelper.createFrame(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.needUpdateBackupViewColor = true;
        checkPlayAnimation(false);
        updateColors();
        invalidate();
    }

    public void setAttachBotUser(TLRPC.User user, int i) {
        if (user == null) {
            return;
        }
        this.tabAnimation = null;
        this.tabAnimationBot = null;
        this.lastIconAnimationRaw = 0;
        this.lastBotIconId = 0L;
        this.textView.setText(ContactsController.formatName(user.first_name, user.last_name));
        if (this.avatarDrawable == null) {
            this.avatarDrawable = new AvatarDrawable();
        }
        this.avatarDrawable.setInfo(i, user);
        this.backupImageView.setForUserOrChat(user, this.avatarDrawable);
        this.backupImageView.setSize(-1, -1);
        this.backupImageView.setRoundRadius(AndroidUtilities.dp(11.33f));
        this.backupImageView.setLayoutParams(LayoutHelper.createFrame(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        this.backupImageView.setColorFilter(null);
        this.needUpdateBackupViewColor = false;
        invalidate();
    }
}
