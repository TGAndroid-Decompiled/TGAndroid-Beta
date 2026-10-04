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
public final class xg extends FrameLayout {
    public final org.telegram.ui.ActionBar.i5 f32781a;
    public final RectF f32782b;
    public final Paint f32783c;
    public final Drawable d;
    public boolean f32784e;

    public xg(Activity activity) {
        super(activity);
        this.f32782b = new RectF();
        this.f32783c = new Paint(1);
        this.f32784e = false;
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(activity);
        this.f32781a = i5Var;
        addView(i5Var, w7.z5.c(-1.0f, -1));
        setWillNotDraw(false);
        Drawable drawable = activity.getDrawable(R.drawable.msg_mini_close_tooltip);
        this.d = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        setClipToPadding(false);
        setClipChildren(false);
        w7.b6.a(this);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if ((view instanceof org.telegram.ui.ActionBar.i5) && this.f32784e) {
            org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) view;
            canvas.save();
            canvas.scale(0.8f, 0.8f);
            canvas.translate(-AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            int color = i5Var.getTextPaint().getColor();
            i5Var.getTextPaint().setColor(-1);
            boolean drawChild = super.drawChild(canvas, view, j3);
            i5Var.getTextPaint().setColor(color);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f32784e) {
            canvas.save();
            int dp = AndroidUtilities.dp(26.0f);
            canvas.translate(AndroidUtilities.dp(5.0f), (getMeasuredHeight() - dp) / 2.0f);
            float f7 = dp;
            RectF rectF = this.f32782b;
            rectF.set(-AndroidUtilities.dp(5.0f), 0.0f, getMeasuredWidth() - getPaddingEnd(), f7);
            float f10 = f7 / 2.0f;
            canvas.drawRoundRect(rectF, f10, f10, this.f32783c);
            int measuredWidth = (getMeasuredWidth() - getPaddingEnd()) - AndroidUtilities.dp(6.0f);
            Drawable drawable = this.d;
            canvas.translate(measuredWidth - drawable.getIntrinsicWidth(), AndroidUtilities.dp(5.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f32783c.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{-9071617, -5999873}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }
}
