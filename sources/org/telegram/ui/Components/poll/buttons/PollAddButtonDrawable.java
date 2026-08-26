package org.telegram.ui.Components.poll.buttons;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;

public final class PollAddButtonDrawable extends PollButtonDrawableBase implements FactorAnimator.Target {
    public int addAnOptionLastWidth;
    public StaticLayout addAnOptionText;
    public final TextPaint addAnOptionTextPaint;
    public final Drawable addDrawable;
    public final BoolAnimator animatorIsEnabled;
    public final int[] pressedState;
    public int textLastColor;

    public PollAddButtonDrawable(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(resourcesProvider);
        BoolAnimator boolAnimator = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 320L, false);
        this.animatorIsEnabled = boolAnimator;
        this.pressedState = new int[]{16842910, 16842919};
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.outline_poll_add_24).mutate();
        this.addDrawable = drawableMutate;
        this.addAnOptionTextPaint = new TextPaint(Theme.chat_audioPerformerPaint);
        int color = Theme.getColor(Theme.key_listSelector, resourcesProvider);
        if (this.selectorDrawableColor != color) {
            Theme.setSelectorDrawableColor(this.selectorDrawable, color, false);
            this.selectorDrawableColor = color;
        }
        drawableMutate.setAlpha((int) ((1.0f - boolAnimator.floatValue) * this.alpha));
        checkTextAlpha();
    }

    public final void checkTextAlpha() {
        this.addAnOptionTextPaint.setAlpha((int) ((1.0f - this.animatorIsEnabled.floatValue) * this.alpha));
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.selectorDrawable.draw(canvas);
        DrawableUtils.drawWithScale(canvas, this.addDrawable, 1.0f - this.animatorIsEnabled.floatValue);
        if (this.addAnOptionText != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(44.0f) + bounds.left, AndroidUtilities.dp(13.66f) + bounds.top);
            this.addAnOptionText.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onAlphaChanged(int i) {
        this.selectorDrawable.setAlpha(i);
        this.addDrawable.setAlpha((int) ((1.0f - this.animatorIsEnabled.floatValue) * this.alpha));
        checkTextAlpha();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float fExactCenterY = rect.exactCenterY();
        float fDp = AndroidUtilities.dp(22.33f) + rect.left;
        AndroidUtilities.dp(27.0f);
        AndroidUtilities.dp(44.0f);
        DrawableUtils.setBounds(this.addDrawable, fDp, fExactCenterY, 17);
        int iWidth = rect.width() - AndroidUtilities.dp(56.0f);
        if (this.addAnOptionText == null || this.addAnOptionLastWidth != iWidth) {
            this.addAnOptionLastWidth = iWidth;
            this.addAnOptionText = new StaticLayout(LocaleController.getString(R.string.PollAddAnOption), this.addAnOptionTextPaint, iWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
    }

    @Override
    public final void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        this.addDrawable.setAlpha((int) ((1.0f - this.animatorIsEnabled.floatValue) * this.alpha));
        checkTextAlpha();
        invalidateSelf();
    }

    public final void setIsEditEnabled(boolean z, boolean z2) {
        this.animatorIsEnabled.setValue(z, z2);
    }

    public final void setTextColor(int i) {
        if (this.textLastColor != i) {
            this.textLastColor = i;
            this.addAnOptionTextPaint.setColor(i);
            this.addDrawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            checkTextAlpha();
        }
    }
}
