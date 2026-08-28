package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class nh extends wk0 {
    public final int T2;
    public final Paint U2;
    public final Paint V2;
    public boolean W2;
    public boolean X2;
    public final Object Y2;
    public final Object Z2;

    public nh(Context context, int i9) {
        super(context, null);
        this.T2 = i9;
        switch (i9) {
            case 1:
                super(context, null);
                Paint paint = new Paint(1);
                this.U2 = paint;
                Paint paint2 = new Paint(1);
                this.V2 = paint2;
                this.Y2 = new y5(this);
                this.Z2 = new y5(this);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode));
                paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode));
                return;
            default:
                gr grVar = gr.h;
                this.Y2 = new td.a(this, grVar, 320L);
                this.Z2 = new td.a(this, grVar, 320L);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{0, -16777216}, (float[]) null, tileMode2);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{-16777216, 0}, (float[]) null, tileMode2);
                Paint paint3 = new Paint(1);
                this.U2 = paint3;
                Paint paint4 = new Paint(1);
                this.V2 = paint4;
                paint3.setShader(linearGradient);
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint3.setXfermode(new PorterDuffXfermode(mode));
                paint4.setShader(linearGradient2);
                paint4.setXfermode(new PorterDuffXfermode(mode));
                return;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        switch (this.T2) {
            case 0:
                this.X2 = false;
                this.W2 = false;
                super.dispatchDraw(canvas);
                ((td.a) this.Y2).a(this.W2, true);
                ((td.a) this.Z2).a(this.X2, true);
                return;
            default:
                super.dispatchDraw(canvas);
                y5 y5Var = (y5) this.Y2;
                float f11 = 1.0f;
                if (this.W2) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                Paint paint = this.U2;
                paint.setAlpha((int) (y5Var.d(f10, false) * 255.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f), paint);
                y5 y5Var2 = (y5) this.Z2;
                if (!this.X2) {
                    f11 = 0.0f;
                }
                int d = (int) (y5Var2.d(f11, false) * 255.0f);
                Paint paint2 = this.V2;
                paint2.setAlpha(d);
                canvas.save();
                canvas.translate(0.0f, getHeight() - AndroidUtilities.dp(8.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f), paint2);
                canvas.restore();
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        boolean z11;
        switch (this.T2) {
            case 0:
                float x10 = view.getX();
                float width = view.getWidth() + x10;
                boolean z12 = true;
                if (x10 < AndroidUtilities.dp(10.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (width > getMeasuredWidth() - AndroidUtilities.dp(10.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z10 && !z11) {
                    z12 = false;
                }
                this.W2 |= z10;
                this.X2 |= z11;
                canvas.save();
                if (z12) {
                    canvas.clipRect(AndroidUtilities.dp(19.0f), 0, getMeasuredWidth() - AndroidUtilities.dp(19.0f), getMeasuredHeight());
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                if (z10) {
                    float dp = AndroidUtilities.dp(11.0f);
                    canvas.saveLayer(dp, getPaddingTop(), AndroidUtilities.dp(19.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j10);
                    canvas.save();
                    canvas.translate(j3.r0.C(1.0f, ((td.a) this.Y2).f47775e, AndroidUtilities.dp(8.0f), dp), 0.0f);
                    canvas.drawPaint(this.U2);
                    canvas.restore();
                    canvas.restore();
                }
                if (z11) {
                    float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(19.0f);
                    canvas.saveLayer(measuredWidth, getPaddingTop(), getMeasuredWidth() - AndroidUtilities.dp(11.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j10);
                    canvas.save();
                    canvas.translate(e2.c.z(1.0f, ((td.a) this.Z2).f47775e, AndroidUtilities.dp(8.0f), measuredWidth), 0.0f);
                    canvas.drawPaint(this.V2);
                    canvas.restore();
                    canvas.restore();
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void k0(int i9, int i10) {
        switch (this.T2) {
            case 1:
                boolean canScrollVertically = canScrollVertically(-1);
                boolean canScrollVertically2 = canScrollVertically(1);
                if (canScrollVertically != this.W2 || canScrollVertically2 != this.X2) {
                    this.W2 = canScrollVertically;
                    this.X2 = canScrollVertically2;
                    invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        float f10;
        int i11;
        switch (this.T2) {
            case 0:
                int childCount = getChildCount();
                int size = (View.MeasureSpec.getSize(i9) - getPaddingLeft()) - getPaddingRight();
                float f11 = 0.0f;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt instanceof fi) {
                        f11 = ((fi) childAt).f28435a.c() + f11;
                    }
                }
                if (size > f11 && childCount > 0) {
                    i11 = (int) Math.floor((f10 - f11) / childCount);
                } else {
                    i11 = 0;
                }
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt2 = getChildAt(i13);
                    if (childAt2 instanceof fi) {
                        ((fi) childAt2).f28435a.setAdditionalWidth(i11);
                    }
                }
                super.onMeasure(i9, i10);
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }
}
