package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.graphics.ColorUtils;
import me.vkryl.android.util.ClickHelper;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.PhotoViewer;

public final class UnsupportedBlockDrawable extends Drawable {
    public final Drawable bubbleDrawable;
    public final Paint buttonBackgroundPaint;
    public final ButtonBounce buttonBounce;
    public final int buttonGap;
    public final int buttonHeight;
    public StaticLayout buttonLayout;
    public final int buttonPaddingH;
    public final int buttonRadius;
    public final RectF buttonRect;
    public String buttonText;
    public final TextPaint buttonTextPaint;
    public final ClickHelper clickHelper;
    public int measuredHeight;
    public int measuredWidth;
    public Runnable onClickListener;
    public final int paddingV;
    public final Drawable planeDrawable;
    public String subtitle;
    public StaticLayout subtitleLayout;
    public final TextPaint subtitlePaint;
    public final int textLeft;
    public String title;
    public StaticLayout titleLayout;
    public final TextPaint titlePaint;
    public final int titleSubtitleGap;

    public UnsupportedBlockDrawable() {
        TextPaint textPaint = new TextPaint(1);
        this.titlePaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.subtitlePaint = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.buttonTextPaint = textPaint3;
        this.buttonBackgroundPaint = new Paint(1);
        this.buttonRect = new RectF();
        ButtonBounce buttonBounce = new ButtonBounce(null, 1.0f, 5.0f);
        this.buttonBounce = buttonBounce;
        this.clickHelper = new ClickHelper(new PhotoViewer.AnonymousClass49(this, 2));
        this.textLeft = AndroidUtilities.dp(62.33f);
        this.buttonPaddingH = AndroidUtilities.dp(12.0f);
        this.buttonHeight = AndroidUtilities.dp(30.0f);
        this.buttonRadius = AndroidUtilities.dp(15.0f);
        this.paddingV = AndroidUtilities.dp(7.0f);
        this.buttonGap = AndroidUtilities.dp(12.0f);
        this.titleSubtitleGap = AndroidUtilities.dp(2.0f);
        this.planeDrawable = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.bubbleDrawable = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        buttonBounce.additionalInvalidate = new Tooltip$$ExternalSyntheticLambda0(this, 9);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        updateColors();
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.titleLayout == null || this.subtitleLayout == null || this.buttonLayout == null) {
            return;
        }
        int i = getBounds().left;
        int i2 = getBounds().right;
        int iCenterY = getBounds().centerY();
        int height = this.titleLayout.getHeight();
        int i3 = this.titleSubtitleGap;
        int height2 = iCenterY - ((this.subtitleLayout.getHeight() + (height + i3)) / 2);
        canvas.save();
        canvas.translate(this.textLeft + i, height2);
        this.titleLayout.draw(canvas);
        canvas.translate(0.0f, this.titleLayout.getHeight() + i3);
        this.subtitleLayout.draw(canvas);
        canvas.restore();
        float width = this.buttonLayout.getWidth();
        int i4 = this.buttonPaddingH;
        int iDp = i2 - AndroidUtilities.dp(11.0f);
        int i5 = iDp - ((int) (width + (i4 * 2)));
        int i6 = this.buttonHeight;
        int i7 = iCenterY - (i6 / 2);
        RectF rectF = this.buttonRect;
        float f = i7;
        rectF.set(i5, f, iDp, i7 + i6);
        float scale = this.buttonBounce.getScale(0.05f);
        canvas.save();
        canvas.scale(scale, scale, rectF.centerX(), rectF.centerY());
        Theme.multAlpha(0.18f, -1);
        float f2 = this.buttonRadius;
        canvas.drawRoundRect(rectF, f2, f2, this.buttonBackgroundPaint);
        canvas.save();
        canvas.translate(i5 + i4, ((i6 - this.buttonLayout.getHeight()) / 2.0f) + f);
        this.buttonLayout.draw(canvas);
        canvas.restore();
        canvas.restore();
        float fDp = AndroidUtilities.dp(29.66f) + i;
        float f3 = iCenterY + 1;
        Drawable drawable = this.bubbleDrawable;
        DrawableUtils.setBounds(drawable, fDp, f3, 17);
        drawable.draw(canvas);
        float fDp2 = AndroidUtilities.dp(29.66f) + i;
        Drawable drawable2 = this.planeDrawable;
        DrawableUtils.setBounds(drawable2, fDp2, f3, 17);
        drawable2.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    public final int measure(int i) {
        this.measuredWidth = i;
        String str = this.buttonText;
        float fMeasureText = this.buttonTextPaint.measureText((CharSequence) str, 0, str.length());
        int i2 = (int) ((this.buttonPaddingH * 2) + fMeasureText);
        String str2 = this.buttonText;
        int iCeil = (int) Math.ceil(fMeasureText);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.buttonLayout = new StaticLayout(str2, this.buttonTextPaint, iCeil, alignment, 1.0f, 0.0f, false);
        int iDp = (((i - this.textLeft) - i2) - this.buttonGap) - AndroidUtilities.dp(11.0f);
        this.titleLayout = new StaticLayout(TextUtils.ellipsize(this.title, this.titlePaint, iDp, TextUtils.TruncateAt.END), this.titlePaint, iDp, alignment, 1.0f, 0.0f, false);
        this.subtitleLayout = new StaticLayout(this.subtitle, this.subtitlePaint, iDp, alignment, 1.0f, 0.0f, false);
        int iMax = (this.paddingV * 2) + Math.max(this.subtitleLayout.getHeight() + this.titleLayout.getHeight() + this.titleSubtitleGap, this.buttonHeight);
        this.measuredHeight = iMax;
        setBounds(0, 0, this.measuredWidth, iMax);
        return this.measuredHeight;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void updateColors() {
        int color = Theme.getColor(null, Theme.key_chat_serviceText, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.planeDrawable.setColorFilter(new PorterDuffColorFilter(color, mode));
        this.bubbleDrawable.setColorFilter(new PorterDuffColorFilter(Theme.multAlpha(0.11f, -16777216), mode));
        this.titlePaint.setColor(color);
        this.subtitlePaint.setColor(ColorUtils.setAlphaComponent(color, 179));
        this.buttonTextPaint.setColor(color);
        this.buttonBackgroundPaint.setColor(Theme.multAlpha(0.11f, -16777216));
    }
}
