package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class mg extends FrameLayout {
    public final org.telegram.ui.ActionBar.l5 f29042a;
    public final RectF f29043b;
    public final Paint f29044c;
    public final Drawable d;
    public boolean f29045e;

    public mg(Activity activity) {
        super(activity);
        this.f29043b = new RectF();
        this.f29044c = new Paint(1);
        this.f29045e = false;
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(activity);
        this.f29042a = l5Var;
        addView(l5Var, k7.c6.c(-1.0f, -1));
        setWillNotDraw(false);
        Drawable drawable = activity.getDrawable(R.drawable.msg_mini_close_tooltip);
        this.d = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        setClipToPadding(false);
        setClipChildren(false);
        k7.e6.a(this);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if ((view instanceof org.telegram.ui.ActionBar.l5) && this.f29045e) {
            org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) view;
            canvas.save();
            canvas.scale(0.8f, 0.8f);
            canvas.translate(-AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            int color = l5Var.getTextPaint().getColor();
            l5Var.getTextPaint().setColor(-1);
            boolean drawChild = super.drawChild(canvas, view, j10);
            l5Var.getTextPaint().setColor(color);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f29045e) {
            canvas.save();
            int dp = AndroidUtilities.dp(26.0f);
            canvas.translate(AndroidUtilities.dp(5.0f), (getMeasuredHeight() - dp) / 2.0f);
            float f10 = dp;
            RectF rectF = this.f29043b;
            rectF.set(-AndroidUtilities.dp(5.0f), 0.0f, getMeasuredWidth() - getPaddingEnd(), f10);
            float f11 = f10 / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, this.f29044c);
            int measuredWidth = (getMeasuredWidth() - getPaddingEnd()) - AndroidUtilities.dp(6.0f);
            Drawable drawable = this.d;
            canvas.translate(measuredWidth - drawable.getIntrinsicWidth(), AndroidUtilities.dp(5.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.f29044c.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{-9071617, -5999873}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }
}
