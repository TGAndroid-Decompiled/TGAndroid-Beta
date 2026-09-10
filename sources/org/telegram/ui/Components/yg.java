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
public final class yg extends FrameLayout {
    public final org.telegram.ui.ActionBar.l5 f29319a;
    public final RectF f29320b;
    public final Paint f29321c;
    public final Drawable d;
    public boolean e;

    public yg(Activity activity) {
        super(activity);
        this.f29320b = new RectF();
        this.f29321c = new Paint(1);
        this.e = false;
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(activity);
        this.f29319a = l5Var;
        addView(l5Var, w7.a6.c(-1.0f, -1));
        setWillNotDraw(false);
        Drawable drawable = activity.getDrawable(R.drawable.msg_mini_close_tooltip);
        this.d = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        setClipToPadding(false);
        setClipChildren(false);
        w7.c6.a(this);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if ((view instanceof org.telegram.ui.ActionBar.l5) && this.e) {
            org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) view;
            canvas.save();
            canvas.scale(0.8f, 0.8f);
            canvas.translate(-AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            int color = l5Var.getTextPaint().getColor();
            l5Var.getTextPaint().setColor(-1);
            boolean drawChild = super.drawChild(canvas, view, j3);
            l5Var.getTextPaint().setColor(color);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.e) {
            canvas.save();
            int dp = AndroidUtilities.dp(26.0f);
            canvas.translate(AndroidUtilities.dp(5.0f), (getMeasuredHeight() - dp) / 2.0f);
            float f7 = dp;
            RectF rectF = this.f29320b;
            rectF.set(-AndroidUtilities.dp(5.0f), 0.0f, getMeasuredWidth() - getPaddingEnd(), f7);
            float f10 = f7 / 2.0f;
            canvas.drawRoundRect(rectF, f10, f10, this.f29321c);
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
        this.f29321c.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{-9071617, -5999873}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }
}
