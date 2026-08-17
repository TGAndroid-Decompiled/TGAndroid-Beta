package org.telegram.ui.Stars;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Gifts.GiftMessageDrawable;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stars.StarsReactionsSheet;

public class StarGiftUniqueActionLayout {
    TLRPC.TL_messageActionStarGiftUnique action;
    private final FactorAnimator animatorVisualWidth;
    private boolean attached;
    private TL_stars.starGiftAttributeBackdrop backdrop;
    private final ButtonBounce bounce;
    private boolean burned;
    private final Paint buttonBackgroundPaint;
    private final ButtonBounce buttonBounce;
    private float buttonHeight;
    private final StarsReactionsSheet.Particles buttonParticles;
    private final Path buttonPath;
    private final RectF buttonRect;
    private Text buttonText;
    private float buttonY;
    private final int currentAccount;
    MessageObject currentMessageObject;
    private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emoji;
    private RadialGradient gradient;
    private int gradientRadius;
    int height;
    public final ImageReceiver imageReceiver;
    private final GiftMessageDrawable messageDrawable;
    private float messageY;
    private TL_stars.starGiftAttributeModel model;
    private float nameWidth;
    private Runnable onButtonClick;
    private TL_stars.starGiftAttributePattern pattern;
    public boolean repost;
    private final Theme.ResourcesProvider resourcesProvider;
    private final GiftSheet.RibbonDrawable ribbon;
    private Text subtitle;
    private float subtitleY;
    private Text title;
    private float titleY;
    private float valueWidth;
    private final View view;
    int width;
    private boolean widthExpanded;
    private final Paint backgroundPaint = new Paint(1);
    private final Matrix matrix = new Matrix();
    private final RectF backgroundRect = new RectF();
    private final Path backgroundPath = new Path();
    private final ArrayList table = new ArrayList();

    private static final class Row {
        public final Text name;
        public final Text value;
        public final float y;

        public Row(float f, CharSequence charSequence, CharSequence charSequence2) {
            this.name = new Text(charSequence, 12.0f);
            this.value = new Text(charSequence2, 12.0f, AndroidUtilities.bold());
            this.y = f + (getHeight() / 2.0f);
        }

        public float getHeight() {
            return Math.max(this.name.getHeight(), this.value.getHeight());
        }
    }

    public StarGiftUniqueActionLayout(int i, View view, Theme.ResourcesProvider resourcesProvider) {
        GiftMessageDrawable giftMessageDrawable = new GiftMessageDrawable();
        this.messageDrawable = giftMessageDrawable;
        this.buttonRect = new RectF();
        this.buttonPath = new Path();
        this.buttonBackgroundPaint = new Paint();
        this.buttonParticles = new StarsReactionsSheet.Particles(1, 25);
        this.animatorVisualWidth = new FactorAnimator(0, new FactorAnimator.Target() {
            @Override
            public void onFactorChangeFinished(int i2, float f, FactorAnimator factorAnimator) {
                FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i2, f, factorAnimator);
            }

            @Override
            public final void onFactorChanged(int i2, float f, float f2, FactorAnimator factorAnimator) {
                this.f$0.lambda$new$0(i2, f, f2, factorAnimator);
            }
        }, CubicBezierInterpolator.EASE_OUT_QUINT, 320L);
        this.currentAccount = i;
        this.view = view;
        this.resourcesProvider = resourcesProvider;
        this.ribbon = new GiftSheet.RibbonDrawable(view, 1.0f);
        this.buttonBounce = new ButtonBounce(view);
        this.bounce = new ButtonBounce(view);
        this.imageReceiver = new ImageReceiver(view);
        this.emoji = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(view, AndroidUtilities.dp(28.0f));
        giftMessageDrawable.setParentView(view);
    }

    public GiftMessageDrawable getMessageDrawable() {
        return this.messageDrawable;
    }

    public void set(org.telegram.messenger.MessageObject r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.StarGiftUniqueActionLayout.set(org.telegram.messenger.MessageObject, boolean):void");
    }

    private void setInternal(org.telegram.messenger.MessageObject r23, org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique r24, org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.StarGiftUniqueActionLayout.setInternal(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$TL_messageActionStarGiftUnique, org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique, boolean):void");
    }

    public void set(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z) {
        this.widthExpanded = false;
        this.action = null;
        this.currentMessageObject = null;
        this.repost = false;
        if (tL_starGiftUnique == null) {
            return;
        }
        this.backdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.pattern = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = this.model;
        this.model = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = this.backgroundPaint;
        this.gradient = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = this.pattern;
        if (stargiftattributepattern != null) {
            this.emoji.set(stargiftattributepattern.document, false);
        } else {
            this.emoji.set((Drawable) null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = this.model;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.id != stargiftattributemodel2.document.id)) {
            this.imageReceiver.setAutoRepeatCount(0);
            this.imageReceiver.clearDecorators();
            this.imageReceiver.setAutoRepeat(0);
            StarsIntroActivity.setGiftImage(this.imageReceiver, this.model.document, 110);
        }
        boolean z2 = tL_starGiftUnique.burned;
        this.burned = z2;
        if (z2) {
            this.ribbon.setColor(Theme.getColor(Theme.key_text_RedBold, this.resourcesProvider));
            this.ribbon.setText(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            this.ribbon.setBackdrop(this.backdrop, true, false);
            this.ribbon.setText(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (this.attached) {
            this.imageReceiver.onAttachedToWindow();
            this.emoji.attach();
            this.messageDrawable.attach();
        }
        this.width = Math.min((int) (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() * 0.6f : (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f)), ((AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
        if (!AndroidUtilities.isTablet()) {
            this.width = (int) (this.width * 1.2f);
        }
        this.width -= AndroidUtilities.dp(8.0f);
        setInternal2(tL_starGiftUnique, j, tL_textWithEntities, str);
        checkAnimatedWidth(z);
    }

    private void setInternal2(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
        Spanned spannedReplaceAnimatedEmoji;
        float f = this.width;
        float fDp = AndroidUtilities.dp(10.0f) + 0.0f + AndroidUtilities.dp(110.0f) + AndroidUtilities.dp(9.33f);
        Text text = new Text(LocaleController.formatString(R.string.Gift2UniqueTitle, DialogObject.getShortName(j)), 14.0f, AndroidUtilities.bold());
        this.title = text;
        this.titleY = (text.getHeight() / 2.0f) + fDp;
        float height = fDp + this.title.getHeight() + AndroidUtilities.dp(3.0f);
        Text text2 = new Text(tL_starGiftUnique.title + " #" + LocaleController.formatNumber(tL_starGiftUnique.num, ','), 12.0f);
        this.subtitle = text2;
        this.subtitleY = (text2.getHeight() / 2.0f) + height;
        float height2 = height + this.subtitle.getHeight() + ((float) AndroidUtilities.dp(11.0f));
        this.table.clear();
        this.nameWidth = 0.0f;
        this.valueWidth = 0.0f;
        TextPaint textPaint = this.messageDrawable.getTextPaint();
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            MessageObject.addEntitiesToText(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false);
            spannedReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint.getFontMetricsInt());
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.GiftMessageHint));
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(-1593835521), 0, spannableStringBuilder2.length(), 33);
            spannedReplaceAnimatedEmoji = spannableStringBuilder2;
        }
        this.messageDrawable.setUser(j != 0 ? MessagesController.getInstance(this.currentAccount).getUserOrChat(j) : null);
        this.messageDrawable.setMessage(spannedReplaceAnimatedEmoji);
        this.messageDrawable.measure(((int) f) - AndroidUtilities.dp(24.0f));
        if (!this.widthExpanded && this.messageDrawable.getLineCount() > 3) {
            this.widthExpanded = true;
            this.width = (int) (this.width * (Math.min(0.4f, (this.messageDrawable.getLineCount() - 3) * 0.1f) + 1.0f));
            setInternal2(tL_starGiftUnique, j, tL_textWithEntities, str);
            return;
        }
        float fDp2 = height2 + AndroidUtilities.dp(4.0f);
        this.messageY = fDp2;
        float minimumHeight = fDp2 + this.messageDrawable.getMinimumHeight() + AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(11.66f);
        this.buttonY = minimumHeight;
        this.buttonText = new Text(str, 14.0f, AndroidUtilities.bold());
        float fDp3 = AndroidUtilities.dp(30.0f);
        this.buttonHeight = fDp3;
        this.height = (int) (minimumHeight + fDp3 + AndroidUtilities.dp(11.0f));
    }

    public boolean has() {
        return this.action != null;
    }

    public float getWidth() {
        return this.animatorVisualWidth.getFactor();
    }

    public float getHeight() {
        return this.height;
    }

    public void attach() {
        this.attached = true;
        if (this.action != null) {
            this.imageReceiver.onAttachedToWindow();
            this.emoji.attach();
            this.messageDrawable.attach();
        }
    }

    public void detach() {
        this.attached = false;
        this.imageReceiver.onDetachedFromWindow();
        this.emoji.detach();
        this.messageDrawable.detach();
    }

    public void draw(Canvas canvas) {
        float width = getWidth() / 2.0f;
        this.backgroundRect.set(0.0f, 0.0f, getWidth(), getHeight());
        int iWidth = ((int) (this.backgroundRect.width() + this.backgroundRect.height())) / 2;
        if (this.backdrop != null && (this.gradient == null || this.gradientRadius != iWidth)) {
            this.gradientRadius = iWidth;
            float f = iWidth;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.backdrop;
            this.gradient = new RadialGradient(0.0f, 0.0f, f, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        if (this.gradient != null) {
            this.matrix.reset();
            this.matrix.postTranslate(width, width);
            this.gradient.setLocalMatrix(this.matrix);
            this.backgroundPaint.setShader(this.gradient);
        }
        this.backgroundPath.rewind();
        this.backgroundPath.addRoundRect(this.backgroundRect, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
        canvas.save();
        float scale = this.bounce.getScale(0.0125f);
        canvas.scale(scale, scale, this.backgroundRect.centerX(), this.backgroundRect.centerY());
        canvas.save();
        canvas.clipPath(this.backgroundPath);
        canvas.drawPaint(this.backgroundPaint);
        canvas.save();
        canvas.translate(width, AndroidUtilities.dp(65.0f));
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.backdrop;
        if (stargiftattributebackdrop2 != null) {
            this.emoji.setColor(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        StarGiftPatterns.drawPattern(canvas, 1, this.emoji, this.backgroundRect.width(), this.backgroundRect.height(), 1.0f, 1.1f);
        canvas.restore();
        this.imageReceiver.setImageCoords(width - (AndroidUtilities.dp(110.0f) / 2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(110.0f), AndroidUtilities.dp(110.0f));
        this.imageReceiver.draw(canvas);
        int iMultAlpha = Theme.multAlpha(-1, 0.6f);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.backdrop;
        if (stargiftattributebackdrop3 != null) {
            iMultAlpha = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i = iMultAlpha;
        this.title.ellipsize(getWidth() - AndroidUtilities.dp(12.0f));
        Text text = this.title;
        text.draw(canvas, width - (text.getCurrentWidth() / 2.0f), this.titleY, -1, 1.0f);
        this.subtitle.ellipsize(getWidth() - AndroidUtilities.dp(12.0f));
        Text text2 = this.subtitle;
        text2.draw(canvas, width - (text2.getCurrentWidth() / 2.0f), this.subtitleY, i, 1.0f);
        if (this.messageDrawable.getMinimumHeight() > 0) {
            int minimumWidth = this.messageDrawable.getMinimumWidth();
            int minimumHeight = this.messageDrawable.getMinimumHeight();
            int i2 = (int) (width - (minimumWidth / 2.0f));
            GiftMessageDrawable giftMessageDrawable = this.messageDrawable;
            int i3 = (int) this.messageY;
            giftMessageDrawable.setBounds(i2, i3, minimumWidth + i2, minimumHeight + i3);
            this.messageDrawable.draw(canvas);
        } else {
            float fDp = this.nameWidth + AndroidUtilities.dp(9.0f) + this.valueWidth;
            Iterator it = this.table.iterator();
            while (it.hasNext()) {
                Row row = (Row) it.next();
                Text text3 = row.name;
                float f2 = width - (fDp / 2.0f);
                text3.draw(canvas, (f2 + this.nameWidth) - text3.getCurrentWidth(), row.y, i, 1.0f);
                row.value.draw(canvas, f2 + this.nameWidth + AndroidUtilities.dp(9.0f), row.y, -1, 1.0f);
            }
        }
        if (!this.repost) {
            this.buttonRect.set(width - ((this.buttonText.getCurrentWidth() + AndroidUtilities.dp(30.0f)) / 2.0f), this.buttonY, width + ((this.buttonText.getCurrentWidth() + AndroidUtilities.dp(30.0f)) / 2.0f), this.buttonY + this.buttonHeight);
            this.buttonPath.rewind();
            Path path = this.buttonPath;
            RectF rectF = this.buttonRect;
            float f3 = this.buttonHeight / 2.0f;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
            this.buttonBackgroundPaint.setColor(Theme.multAlpha(-16777216, 0.13f));
            float scale2 = this.buttonBounce.getScale(0.075f);
            canvas.scale(scale2, scale2, this.buttonRect.centerX(), this.buttonRect.centerY());
            canvas.drawPath(this.buttonPath, this.buttonBackgroundPaint);
            canvas.restore();
            this.ribbon.setBounds(((int) this.backgroundRect.right) - AndroidUtilities.dp(46.67f), ((int) this.backgroundRect.top) - AndroidUtilities.dp(1.33f), ((int) this.backgroundRect.right) + AndroidUtilities.dp(1.33f), ((int) this.backgroundRect.top) + AndroidUtilities.dp(46.67f));
            this.ribbon.setTextColor(i);
            this.ribbon.draw(canvas);
        }
        canvas.restore();
    }

    public void drawOutbounds(Canvas canvas) {
        if (this.repost) {
            return;
        }
        canvas.save();
        float scale = this.bounce.getScale(0.0125f);
        canvas.scale(scale, scale, this.backgroundRect.centerX(), this.backgroundRect.centerY());
        float scale2 = this.buttonBounce.getScale(0.075f);
        canvas.scale(scale2, scale2, this.buttonRect.centerX(), this.buttonRect.centerY());
        canvas.clipPath(this.buttonPath);
        this.buttonParticles.setBounds(this.buttonRect);
        this.buttonParticles.process();
        this.buttonParticles.draw(canvas, Theme.multAlpha(-1, 0.7f));
        this.buttonText.draw(canvas, this.buttonRect.left + AndroidUtilities.dp(15.0f), this.buttonRect.centerY(), -1, 1.0f);
        canvas.restore();
        invalidate();
    }

    private void invalidate() {
        View view = this.view;
        if (view instanceof ChatActionCell) {
            ((ChatActionCell) view).invalidateOutbounds();
        } else {
            view.invalidate();
        }
    }

    public void lambda$new$0(int i, float f, float f2, FactorAnimator factorAnimator) {
        invalidate();
    }

    private void checkAnimatedWidth(boolean z) {
        if (z) {
            int iRound = Math.round(this.animatorVisualWidth.getToFactor());
            int i = this.width;
            if (iRound != i) {
                this.animatorVisualWidth.animateTo(i);
                return;
            }
            return;
        }
        this.animatorVisualWidth.forceFactor(this.width);
    }

    public boolean onTouchEvent(float f, float f2, MotionEvent motionEvent) {
        boolean zContains = this.buttonRect.contains(motionEvent.getX() - f, motionEvent.getY() - f2);
        boolean zContains2 = this.backgroundRect.contains(motionEvent.getX() - f, motionEvent.getY() - f2);
        if (motionEvent.getAction() == 0) {
            this.bounce.setPressed(zContains2 && !zContains);
            this.buttonBounce.setPressed(zContains);
        } else if (motionEvent.getAction() == 2) {
            if (this.buttonBounce.isPressed() && !zContains) {
                this.buttonBounce.setPressed(false);
            } else if (this.bounce.isPressed() && !zContains2) {
                this.bounce.setPressed(false);
            }
        } else {
            if (motionEvent.getAction() == 1 && (this.buttonBounce.isPressed() || this.bounce.isPressed())) {
                if (this.onButtonClick != null) {
                    if (this.buttonBounce.isPressed()) {
                        this.onButtonClick.run();
                    }
                } else if (this.burned) {
                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    if (safeLastFragment != null) {
                        BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.fire_on, LocaleController.getString(R.string.UniqueGiftNotFoundBurned)).show();
                    }
                } else {
                    new StarGiftSheet(this.view.getContext(), this.currentAccount, this.currentMessageObject.getDialogId(), this.resourcesProvider).set(this.currentMessageObject).show();
                }
                this.buttonBounce.setPressed(false);
                this.bounce.setPressed(false);
                return true;
            }
            if (motionEvent.getAction() == 3 && (this.buttonBounce.isPressed() || this.bounce.isPressed())) {
                this.buttonBounce.setPressed(false);
                this.bounce.setPressed(false);
                return true;
            }
        }
        return this.buttonBounce.isPressed() || this.bounce.isPressed();
    }

    public void setOnButtonClickListener(Runnable runnable) {
        this.onButtonClick = runnable;
    }
}
