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
import java.lang.reflect.InvocationTargetException;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;

public class PollAddButtonDrawable extends PollButtonDrawableBase implements FactorAnimator.Target {
    private int addAnOptionLastWidth;
    private StaticLayout addAnOptionText;
    private final TextPaint addAnOptionTextPaint;
    private final Drawable addDrawable;
    private final BoolAnimator animatorIsEnabled;
    private final int[] pressedState;
    private int textLastColor;

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    public PollAddButtonDrawable(Context context, Theme.ResourcesProvider resourcesProvider) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super(resourcesProvider);
        this.animatorIsEnabled = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 320L);
        this.pressedState = new int[]{16842910, 16842919};
        this.addDrawable = context.getResources().getDrawable(R.drawable.outline_poll_add_24).mutate();
        this.addAnOptionTextPaint = new TextPaint(Theme.chat_audioPerformerPaint);
        setSelectorsColor(Theme.getColor(Theme.key_listSelector, resourcesProvider));
        checkIconsAlpha();
        checkTextAlpha();
    }

    public void setIsEditEnabled(boolean z, boolean z2) {
        this.animatorIsEnabled.setValue(z, z2);
    }

    @Override
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        getSelectorDrawable().draw(canvas);
        DrawableUtils.drawWithScale(canvas, this.addDrawable, 1.0f - this.animatorIsEnabled.getFloatValue());
        if (this.addAnOptionText != null) {
            canvas.save();
            canvas.translate(bounds.left + AndroidUtilities.dp(44.0f), bounds.top + AndroidUtilities.dp(13.66f));
            this.addAnOptionText.draw(canvas);
            canvas.restore();
        }
    }

    public void setTextColor(int i) {
        if (this.textLastColor != i) {
            this.textLastColor = i;
            this.addAnOptionTextPaint.setColor(i);
            this.addDrawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            checkTextAlpha();
        }
    }

    @Override
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float fExactCenterY = rect.exactCenterY();
        float fDp = rect.left + AndroidUtilities.dp(22.33f);
        AndroidUtilities.dp(27.0f);
        AndroidUtilities.dp(44.0f);
        DrawableUtils.setBounds(this.addDrawable, fDp, fExactCenterY, 17);
        int iWidth = rect.width() - AndroidUtilities.dp(56.0f);
        if (this.addAnOptionText == null || this.addAnOptionLastWidth != iWidth) {
            this.addAnOptionLastWidth = iWidth;
            this.addAnOptionText = new StaticLayout(LocaleController.getString(R.string.PollAddAnOption), this.addAnOptionTextPaint, iWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
    }

    private void checkTextAlpha() {
        this.addAnOptionTextPaint.setAlpha((int) (getAlpha() * (1.0f - this.animatorIsEnabled.getFloatValue())));
    }

    private void checkIconsAlpha() {
        this.addDrawable.setAlpha((int) (getAlpha() * (1.0f - this.animatorIsEnabled.getFloatValue())));
    }

    @Override
    protected void onAlphaChanged(int i) {
        super.onAlphaChanged(i);
        checkIconsAlpha();
        checkTextAlpha();
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        checkIconsAlpha();
        checkTextAlpha();
        invalidateSelf();
    }

    public int checkMotionPressed(int i, int i2) {
        if (!getBounds().contains(i, i2)) {
            return -1;
        }
        getSelectorDrawable().setHotspot(i, i2);
        getSelectorDrawable().setState(this.pressedState);
        return 0;
    }
}
