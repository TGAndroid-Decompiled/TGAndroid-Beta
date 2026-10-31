package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;
public final class bh extends tk0 {
    public final int f24642e3;
    public final Paint f24643f3;
    public final Paint f24644g3;
    public boolean f24645h3;
    public boolean f24646i3;
    public final Object f24647j3;
    public final Object f24648k3;

    public bh(Context context, int i10) {
        super(context, null);
        this.f24642e3 = i10;
        switch (i10) {
            case 1:
                super(context, null);
                Paint paint = new Paint(1);
                this.f24643f3 = paint;
                Paint paint2 = new Paint(1);
                this.f24644g3 = paint2;
                this.f24647j3 = new t5(this);
                this.f24648k3 = new t5(this);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode));
                paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode));
                return;
            default:
                gr grVar = gr.h;
                this.f24647j3 = new fe.b(this, grVar, 320L);
                this.f24648k3 = new fe.b(this, grVar, 320L);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(8.0f), 0.0f, new int[]{0, -16777216}, (float[]) null, tileMode2);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(8.0f), 0.0f, new int[]{-16777216, 0}, (float[]) null, tileMode2);
                Paint paint3 = new Paint(1);
                this.f24643f3 = paint3;
                Paint paint4 = new Paint(1);
                this.f24644g3 = paint4;
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
        float f7;
        switch (this.f24642e3) {
            case 0:
                this.f24646i3 = false;
                this.f24645h3 = false;
                super.dispatchDraw(canvas);
                ((fe.b) this.f24647j3).a(this.f24645h3, true);
                ((fe.b) this.f24648k3).a(this.f24646i3, true);
                return;
            default:
                super.dispatchDraw(canvas);
                t5 t5Var = (t5) this.f24647j3;
                float f10 = 1.0f;
                if (this.f24645h3) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                Paint paint = this.f24643f3;
                paint.setAlpha((int) (t5Var.e(false, f7) * 255.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.i0.L(8.0f), paint);
                t5 t5Var2 = (t5) this.f24648k3;
                if (!this.f24646i3) {
                    f10 = 0.0f;
                }
                int e = (int) (t5Var2.e(false, f10) * 255.0f);
                Paint paint2 = this.f24644g3;
                paint2.setAlpha(e);
                canvas.save();
                canvas.translate(0.0f, getHeight() - org.telegram.messenger.i0.L(8.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.i0.L(8.0f), paint2);
                canvas.restore();
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        boolean z11;
        switch (this.f24642e3) {
            case 0:
                float x10 = view.getX();
                float width = view.getWidth() + x10;
                boolean z12 = true;
                if (x10 < org.telegram.messenger.i0.L(10.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (width > getMeasuredWidth() - org.telegram.messenger.i0.L(10.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z10 && !z11) {
                    z12 = false;
                }
                this.f24645h3 |= z10;
                this.f24646i3 |= z11;
                canvas.save();
                if (z12) {
                    canvas.clipRect(org.telegram.messenger.i0.L(19.0f), 0, getMeasuredWidth() - org.telegram.messenger.i0.L(19.0f), getMeasuredHeight());
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                if (z10) {
                    float L = org.telegram.messenger.i0.L(11.0f);
                    canvas.saveLayer(L, getPaddingTop(), org.telegram.messenger.i0.L(19.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j10);
                    canvas.save();
                    canvas.translate(sc.e.z(1.0f, ((fe.b) this.f24647j3).e, org.telegram.messenger.i0.L(8.0f), L), 0.0f);
                    canvas.drawPaint(this.f24643f3);
                    canvas.restore();
                    canvas.restore();
                }
                if (z11) {
                    float measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(19.0f);
                    canvas.saveLayer(measuredWidth, getPaddingTop(), getMeasuredWidth() - org.telegram.messenger.i0.L(11.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j10);
                    canvas.save();
                    canvas.translate(c3.i0.z(1.0f, ((fe.b) this.f24648k3).e, org.telegram.messenger.i0.L(8.0f), measuredWidth), 0.0f);
                    canvas.drawPaint(this.f24644g3);
                    canvas.restore();
                    canvas.restore();
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void l0(int i10) {
        switch (this.f24642e3) {
            case 1:
                boolean canScrollVertically = canScrollVertically(-1);
                boolean canScrollVertically2 = canScrollVertically(1);
                if (canScrollVertically != this.f24645h3 || canScrollVertically2 != this.f24646i3) {
                    this.f24645h3 = canScrollVertically;
                    this.f24646i3 = canScrollVertically2;
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
        float f7;
        int i12;
        switch (this.f24642e3) {
            case 0:
                int childCount = getChildCount();
                int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
                float f10 = 0.0f;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt instanceof xh) {
                        f10 = ((xh) childAt).f32471a.d() + f10;
                    }
                }
                if (size > f10 && childCount > 0) {
                    i12 = (int) Math.floor((f7 - f10) / childCount);
                } else {
                    i12 = 0;
                }
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt2 = getChildAt(i14);
                    if (childAt2 instanceof xh) {
                        ((xh) childAt2).f32471a.setAdditionalWidth(i12);
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
