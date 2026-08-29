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
public final class qh extends jl0 {
    public final int T2;
    public final Paint U2;
    public final Paint V2;
    public boolean W2;
    public boolean X2;
    public final Object Y2;
    public final Object Z2;

    public qh(Context context, int i10) {
        super(context, null);
        this.T2 = i10;
        switch (i10) {
            case 1:
                super(context, null);
                Paint paint = new Paint(1);
                this.U2 = paint;
                Paint paint2 = new Paint(1);
                this.V2 = paint2;
                this.Y2 = new d6(this);
                this.Z2 = new d6(this);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode));
                paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode));
                return;
            default:
                jr jrVar = jr.h;
                this.Y2 = new vd.a(this, jrVar, 320L);
                this.Z2 = new vd.a(this, jrVar, 320L);
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
        float f9;
        switch (this.T2) {
            case 0:
                this.X2 = false;
                this.W2 = false;
                super.dispatchDraw(canvas);
                ((vd.a) this.Y2).a(this.W2, true);
                ((vd.a) this.Z2).a(this.X2, true);
                return;
            default:
                super.dispatchDraw(canvas);
                d6 d6Var = (d6) this.Y2;
                float f10 = 1.0f;
                if (this.W2) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                Paint paint = this.U2;
                paint.setAlpha((int) (d6Var.d(f9, false) * 255.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f), paint);
                d6 d6Var2 = (d6) this.Z2;
                if (!this.X2) {
                    f10 = 0.0f;
                }
                int d = (int) (d6Var2.d(f10, false) * 255.0f);
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
                float x4 = view.getX();
                float width = view.getWidth() + x4;
                boolean z12 = true;
                if (x4 < AndroidUtilities.dp(10.0f)) {
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
                    canvas.translate(org.telegram.ui.th.b(1.0f, ((vd.a) this.Y2).f49505e, AndroidUtilities.dp(8.0f), dp), 0.0f);
                    canvas.drawPaint(this.U2);
                    canvas.restore();
                    canvas.restore();
                }
                if (z11) {
                    float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(19.0f);
                    canvas.saveLayer(measuredWidth, getPaddingTop(), getMeasuredWidth() - AndroidUtilities.dp(11.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j10);
                    canvas.save();
                    canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, ((vd.a) this.Z2).f49505e, AndroidUtilities.dp(8.0f), measuredWidth), 0.0f);
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
    public void k0(int i10, int i11) {
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
    public void onMeasure(int i10, int i11) {
        float f9;
        int i12;
        switch (this.T2) {
            case 0:
                int childCount = getChildCount();
                int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
                float f10 = 0.0f;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt instanceof ii) {
                        f10 = ((ii) childAt).f29393a.c() + f10;
                    }
                }
                if (size > f10 && childCount > 0) {
                    i12 = (int) Math.floor((f9 - f10) / childCount);
                } else {
                    i12 = 0;
                }
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt2 = getChildAt(i14);
                    if (childAt2 instanceof ii) {
                        ((ii) childAt2).f29393a.setAdditionalWidth(i12);
                    }
                }
                super.onMeasure(i10, i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
