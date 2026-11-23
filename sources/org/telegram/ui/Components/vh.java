package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;
public final class vh extends ek0 {
    public final int f40826f3;
    public final Paint f40827g3;
    public final Paint f40828h3;
    public boolean f40829i3;
    public boolean j3;
    public final Object f40830k3;
    public final Object f40831l3;

    public vh(Context context, int i7) {
        super(context, null);
        this.f40826f3 = i7;
        switch (i7) {
            case 1:
                super(context, null);
                Paint paint = new Paint(1);
                this.f40827g3 = paint;
                Paint paint2 = new Paint(1);
                this.f40828h3 = paint2;
                this.f40830k3 = new d6(this);
                this.f40831l3 = new d6(this);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode));
                paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode));
                return;
            default:
                nr nrVar = nr.h;
                this.f40830k3 = new te.a(this, nrVar, 320L);
                this.f40831l3 = new te.a(this, nrVar, 320L);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), 0.0f, new int[]{0, -16777216}, (float[]) null, tileMode2);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), 0.0f, new int[]{-16777216, 0}, (float[]) null, tileMode2);
                Paint paint3 = new Paint(1);
                this.f40827g3 = paint3;
                Paint paint4 = new Paint(1);
                this.f40828h3 = paint4;
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
        switch (this.f40826f3) {
            case 0:
                this.j3 = false;
                this.f40829i3 = false;
                super.dispatchDraw(canvas);
                ((te.a) this.f40830k3).a(this.f40829i3, true);
                ((te.a) this.f40831l3).a(this.j3, true);
                return;
            default:
                super.dispatchDraw(canvas);
                d6 d6Var = (d6) this.f40830k3;
                float f11 = 1.0f;
                if (this.f40829i3) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                Paint paint = this.f40827g3;
                paint.setAlpha((int) (d6Var.e(false, f10) * 255.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(8.0f), paint);
                d6 d6Var2 = (d6) this.f40831l3;
                if (!this.j3) {
                    f11 = 0.0f;
                }
                int e10 = (int) (d6Var2.e(false, f11) * 255.0f);
                Paint paint2 = this.f40828h3;
                paint2.setAlpha(e10);
                canvas.save();
                canvas.translate(0.0f, getHeight() - org.telegram.messenger.g0.L(8.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(8.0f), paint2);
                canvas.restore();
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        boolean z11;
        switch (this.f40826f3) {
            case 0:
                float x10 = view.getX();
                float width = view.getWidth() + x10;
                boolean z12 = true;
                if (x10 < org.telegram.messenger.g0.L(10.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (width > getMeasuredWidth() - org.telegram.messenger.g0.L(10.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z10 && !z11) {
                    z12 = false;
                }
                this.f40829i3 |= z10;
                this.j3 |= z11;
                canvas.save();
                if (z12) {
                    canvas.clipRect(org.telegram.messenger.g0.L(19.0f), 0, getMeasuredWidth() - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight());
                }
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                if (z10) {
                    float L = org.telegram.messenger.g0.L(11.0f);
                    canvas.saveLayer(L, getPaddingTop(), org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j3);
                    canvas.save();
                    canvas.translate(com.google.android.gms.internal.vision.e2.t(1.0f, ((te.a) this.f40830k3).f57700e, org.telegram.messenger.g0.L(8.0f), L), 0.0f);
                    canvas.drawPaint(this.f40827g3);
                    canvas.restore();
                    canvas.restore();
                }
                if (z11) {
                    float measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(19.0f);
                    canvas.saveLayer(measuredWidth, getPaddingTop(), getMeasuredWidth() - org.telegram.messenger.g0.L(11.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j3);
                    canvas.save();
                    canvas.translate(com.google.android.gms.internal.vision.e2.z(1.0f, ((te.a) this.f40831l3).f57700e, org.telegram.messenger.g0.L(8.0f), measuredWidth), 0.0f);
                    canvas.drawPaint(this.f40828h3);
                    canvas.restore();
                    canvas.restore();
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void l0(int i7) {
        switch (this.f40826f3) {
            case 1:
                boolean canScrollVertically = canScrollVertically(-1);
                boolean canScrollVertically2 = canScrollVertically(1);
                if (canScrollVertically != this.f40829i3 || canScrollVertically2 != this.j3) {
                    this.f40829i3 = canScrollVertically;
                    this.j3 = canScrollVertically2;
                    invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        float f10;
        int i11;
        switch (this.f40826f3) {
            case 0:
                int childCount = getChildCount();
                int size = (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight();
                float f11 = 0.0f;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt instanceof pi) {
                        f11 = ((pi) childAt).f38602a.d() + f11;
                    }
                }
                if (size > f11 && childCount > 0) {
                    i11 = (int) Math.floor((f10 - f11) / childCount);
                } else {
                    i11 = 0;
                }
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt2 = getChildAt(i13);
                    if (childAt2 instanceof pi) {
                        ((pi) childAt2).f38602a.setAdditionalWidth(i11);
                    }
                }
                super.onMeasure(i7, i10);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }
}
