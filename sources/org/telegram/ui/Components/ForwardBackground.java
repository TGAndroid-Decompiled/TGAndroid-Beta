package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.view.View;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.internal.mlkit_language_id_common.zzir;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.Theme;

public class ForwardBackground {
    public final ButtonBounce bounce;
    private LoadingDrawable loadingDrawable;
    private Drawable rippleDrawable;
    private int rippleDrawableColor;
    private final View view;
    public final Path path = new Path();
    public final Rect bounds = new Rect();
    private final RectF r = new RectF();

    public ForwardBackground(View view) {
        this.view = view;
        this.bounce = new ButtonBounce(view, 0.8f, 1.4f);
    }

    public void draw(Canvas canvas, boolean z) {
        canvas.save();
        canvas.clipPath(this.path);
        Drawable drawable = this.rippleDrawable;
        if (drawable != null) {
            drawable.setBounds(this.bounds);
            this.rippleDrawable.draw(canvas);
        }
        if (z) {
            LoadingDrawable loadingDrawable = this.loadingDrawable;
            if (loadingDrawable == null) {
                LoadingDrawable loadingDrawable2 = new LoadingDrawable();
                this.loadingDrawable = loadingDrawable2;
                loadingDrawable2.setAppearByGradient(true);
            } else if (loadingDrawable.isDisappeared() || this.loadingDrawable.isDisappearing()) {
                this.loadingDrawable.reset();
                this.loadingDrawable.resetDisappear();
            }
        } else {
            LoadingDrawable loadingDrawable3 = this.loadingDrawable;
            if (loadingDrawable3 != null && !loadingDrawable3.isDisappearing() && !this.loadingDrawable.isDisappeared()) {
                this.loadingDrawable.disappear();
            }
        }
        canvas.restore();
        LoadingDrawable loadingDrawable4 = this.loadingDrawable;
        if (loadingDrawable4 == null || loadingDrawable4.isDisappeared()) {
            return;
        }
        this.loadingDrawable.usePath(this.path);
        this.loadingDrawable.setColors(Theme.multAlpha(0.7f, this.rippleDrawableColor), Theme.multAlpha(1.3f, this.rippleDrawableColor), Theme.multAlpha(1.5f, this.rippleDrawableColor), Theme.multAlpha(2.0f, this.rippleDrawableColor));
        this.loadingDrawable.setBounds(this.bounds);
        canvas.save();
        this.loadingDrawable.draw(canvas);
        canvas.restore();
        this.view.invalidate();
    }

    public void set(StaticLayout[] staticLayoutArr, boolean z) {
        float fDp;
        int textSize = (((int) Theme.chat_forwardNamePaint.getTextSize()) * 2) + AndroidUtilities.dp(4.0f);
        float fMax = Math.max(0, Math.min(6, SharedConfig.bubbleRadius) - 1);
        float fMin = Math.min(9, SharedConfig.bubbleRadius);
        float fMin2 = Math.min(3, SharedConfig.bubbleRadius);
        float fM = zzir.m(fMin, 9.0f, 2.66f, 4.0f);
        float f = -AndroidUtilities.dp(fM);
        float f2 = -AndroidUtilities.dp(3.0f);
        float fDp2 = AndroidUtilities.dp(5.0f) + textSize;
        float lineWidth = staticLayoutArr[0].getLineWidth(0) + AndroidUtilities.dp(fM);
        float lineWidth2 = staticLayoutArr[1].getLineWidth(0) + AndroidUtilities.dp(fM);
        this.path.rewind();
        if (!z) {
            fMax = SharedConfig.bubbleRadius / 2.0f;
        }
        float fDp3 = AndroidUtilities.dp(fMax) * 2;
        this.r.set(f, f2, f + fDp3, fDp3 + f2);
        this.path.arcTo(this.r, 180.0f, 90.0f);
        float f3 = lineWidth - lineWidth2;
        float f4 = fMin2 + fMin;
        float fMax2 = Math.abs(f3) < ((float) AndroidUtilities.dp(f4)) ? Math.max(lineWidth, lineWidth2) : lineWidth;
        if (Math.abs(f3) > AndroidUtilities.dp(f4)) {
            float fDp4 = AndroidUtilities.dp(fMin2) * 2;
            if (lineWidth < lineWidth2) {
                float fM2 = DiffUtil.m(fDp2, f2, 0.45f, f2);
                fDp = AndroidUtilities.dp(fMin) * 2;
                this.r.set(fMax2 - fDp, f2, fMax2, f2 + fDp);
                this.path.arcTo(this.r, 270.0f, 90.0f);
                this.r.set(lineWidth, fM2 - fDp4, fDp4 + lineWidth, fM2);
                this.path.arcTo(this.r, 180.0f, -90.0f);
                float f5 = lineWidth2 - (fDp2 - fM2);
                this.r.set(f5, fM2, lineWidth2, fDp2);
                this.path.arcTo(this.r, 270.0f, 90.0f);
                this.r.set(f5, fM2, lineWidth2, fDp2);
                this.path.arcTo(this.r, 0.0f, 90.0f);
            } else {
                float fM3 = DiffUtil.m(fDp2, f2, 0.55f, f2);
                float f6 = fM3 - f2;
                this.r.set(fMax2 - f6, f2, fMax2, fM3);
                this.path.arcTo(this.r, 270.0f, 90.0f);
                fDp = AndroidUtilities.dp(fMin) * 2;
                this.r.set(lineWidth - f6, f2, lineWidth, fM3);
                this.path.arcTo(this.r, 0.0f, 90.0f);
                this.r.set(lineWidth2, fM3, lineWidth2 + fDp4, fDp4 + fM3);
                this.path.arcTo(this.r, 270.0f, -90.0f);
                this.r.set(lineWidth2 - fDp, fDp2 - fDp, lineWidth2, fDp2);
                this.path.arcTo(this.r, 0.0f, 90.0f);
            }
        } else {
            fDp = AndroidUtilities.dp(fMin) * 2;
            float f7 = fMax2 - fDp;
            this.r.set(f7, f2, fMax2, f2 + fDp);
            this.path.arcTo(this.r, 270.0f, 90.0f);
            this.r.set(f7, fDp2 - fDp, fMax2, fDp2);
            this.path.arcTo(this.r, 0.0f, 90.0f);
        }
        this.r.set(f, fDp2 - fDp, fDp + f, fDp2);
        this.path.arcTo(this.r, 90.0f, 90.0f);
        this.path.close();
        this.bounds.set((int) f, (int) f2, (int) Math.max(lineWidth, lineWidth2), (int) fDp2);
    }

    public void setColor(int i) {
        if (this.rippleDrawableColor != i) {
            Drawable drawable = this.rippleDrawable;
            if (drawable == null) {
                this.rippleDrawable = Theme.createSelectorDrawable(i, 2, -1);
            } else {
                Theme.setSelectorDrawableColor(drawable, i, true);
            }
            this.rippleDrawable.setCallback(this.view);
            this.rippleDrawableColor = i;
        }
    }

    public void setPressed(boolean z) {
        setPressed(z, this.bounds.centerX(), this.bounds.centerY());
    }

    public void setPressed(boolean z, float f, float f2) {
        Drawable drawable;
        this.bounce.setPressed(z);
        if (z && (drawable = this.rippleDrawable) != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.rippleDrawable;
        if (drawable2 != null) {
            drawable2.setState(z ? new int[]{16842910, 16842919} : new int[0]);
        }
        this.view.invalidate();
    }
}
