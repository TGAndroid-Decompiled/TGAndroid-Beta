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

public final class ig extends FrameLayout {

    public final org.telegram.ui.ActionBar.h5 f29359a;

    public final RectF f29360b;

    public final Paint f29361c;
    public final Drawable d;

    public boolean f29362e;

    public ig(Activity activity) {
        super(activity);
        this.f29360b = new RectF();
        this.f29361c = new Paint(1);
        this.f29362e = false;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(activity);
        this.f29359a = h5Var;
        addView(h5Var, h7.z5.c(-1.0f, -1));
        setWillNotDraw(false);
        Drawable drawable = activity.getDrawable(R.drawable.msg_mini_close_tooltip);
        this.d = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        setClipToPadding(false);
        setClipChildren(false);
        h7.b6.a(this);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!(view instanceof org.telegram.ui.ActionBar.h5) || !this.f29362e) {
            return super.drawChild(canvas, view, j10);
        }
        org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) view;
        canvas.save();
        canvas.scale(0.8f, 0.8f);
        canvas.translate(-AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
        int color = h5Var.getTextPaint().getColor();
        h5Var.getTextPaint().setColor(-1);
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        h5Var.getTextPaint().setColor(color);
        canvas.restore();
        return zDrawChild;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f29362e) {
            canvas.save();
            int iDp = AndroidUtilities.dp(26.0f);
            canvas.translate(AndroidUtilities.dp(5.0f), (getMeasuredHeight() - iDp) / 2.0f);
            float f10 = -AndroidUtilities.dp(5.0f);
            float measuredWidth = getMeasuredWidth() - getPaddingEnd();
            float f11 = iDp;
            RectF rectF = this.f29360b;
            rectF.set(f10, 0.0f, measuredWidth, f11);
            float f12 = f11 / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, this.f29361c);
            int measuredWidth2 = (getMeasuredWidth() - getPaddingEnd()) - AndroidUtilities.dp(6.0f);
            Drawable drawable = this.d;
            canvas.translate(measuredWidth2 - drawable.getIntrinsicWidth(), AndroidUtilities.dp(5.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f29361c.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{-9071617, -5999873}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }
}
