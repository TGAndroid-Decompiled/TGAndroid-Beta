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
public final class pg extends FrameLayout {
    public final org.telegram.ui.ActionBar.h5 f31670a;
    public final RectF f31671b;
    public final Paint f31672c;
    public final Drawable d;
    public boolean f31673e;

    public pg(Activity activity) {
        super(activity);
        this.f31671b = new RectF();
        this.f31672c = new Paint(1);
        this.f31673e = false;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(activity);
        this.f31670a = h5Var;
        addView(h5Var, i7.f6.c(-1.0f, -1));
        setWillNotDraw(false);
        Drawable drawable = activity.getDrawable(R.drawable.msg_mini_close_tooltip);
        this.d = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        setClipToPadding(false);
        setClipChildren(false);
        i7.h6.a(this);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if ((view instanceof org.telegram.ui.ActionBar.h5) && this.f31673e) {
            org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) view;
            canvas.save();
            canvas.scale(0.8f, 0.8f);
            canvas.translate(-AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            int color = h5Var.getTextPaint().getColor();
            h5Var.getTextPaint().setColor(-1);
            boolean drawChild = super.drawChild(canvas, view, j10);
            h5Var.getTextPaint().setColor(color);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f31673e) {
            canvas.save();
            int dp = AndroidUtilities.dp(26.0f);
            canvas.translate(AndroidUtilities.dp(5.0f), (getMeasuredHeight() - dp) / 2.0f);
            float f9 = dp;
            RectF rectF = this.f31671b;
            rectF.set(-AndroidUtilities.dp(5.0f), 0.0f, getMeasuredWidth() - getPaddingEnd(), f9);
            float f10 = f9 / 2.0f;
            canvas.drawRoundRect(rectF, f10, f10, this.f31672c);
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
        this.f31672c.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{-9071617, -5999873}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }
}
