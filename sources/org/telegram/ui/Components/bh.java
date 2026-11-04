package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;
public final class bh extends tj0 {
    public final int f32204f3;
    public final Paint f32205g3;
    public final Paint f32206h3;
    public boolean i3;
    public boolean f32207j3;
    public final Object f32208k3;
    public final Object f32209l3;

    public bh(Context context, int i3) {
        super(context, null);
        this.f32204f3 = i3;
        switch (i3) {
            case 1:
                super(context, null);
                Paint paint = new Paint(1);
                this.f32205g3 = paint;
                Paint paint2 = new Paint(1);
                this.f32206h3 = paint2;
                this.f32208k3 = new u5(this);
                this.f32209l3 = new u5(this);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode));
                paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode));
                return;
            default:
                xq xqVar = xq.h;
                this.f32208k3 = new qe.a(this, xqVar, 320L);
                this.f32209l3 = new qe.a(this, xqVar, 320L);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), 0.0f, new int[]{0, -16777216}, (float[]) null, tileMode2);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), 0.0f, new int[]{-16777216, 0}, (float[]) null, tileMode2);
                Paint paint3 = new Paint(1);
                this.f32205g3 = paint3;
                Paint paint4 = new Paint(1);
                this.f32206h3 = paint4;
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
        switch (this.f32204f3) {
            case 0:
                this.f32207j3 = false;
                this.i3 = false;
                super.dispatchDraw(canvas);
                ((qe.a) this.f32208k3).a(this.i3, true);
                ((qe.a) this.f32209l3).a(this.f32207j3, true);
                return;
            default:
                super.dispatchDraw(canvas);
                u5 u5Var = (u5) this.f32208k3;
                float f11 = 1.0f;
                if (this.i3) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                Paint paint = this.f32205g3;
                paint.setAlpha((int) (u5Var.e(false, f10) * 255.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(8.0f), paint);
                u5 u5Var2 = (u5) this.f32209l3;
                if (!this.f32207j3) {
                    f11 = 0.0f;
                }
                int e10 = (int) (u5Var2.e(false, f11) * 255.0f);
                Paint paint2 = this.f32206h3;
                paint2.setAlpha(e10);
                canvas.save();
                canvas.translate(0.0f, getHeight() - org.telegram.messenger.g0.L(8.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(8.0f), paint2);
                canvas.restore();
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        boolean z11;
        switch (this.f32204f3) {
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
                this.i3 |= z10;
                this.f32207j3 |= z11;
                canvas.save();
                if (z12) {
                    canvas.clipRect(org.telegram.messenger.g0.L(19.0f), 0, getMeasuredWidth() - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight());
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                if (z10) {
                    float L = org.telegram.messenger.g0.L(11.0f);
                    canvas.saveLayer(L, getPaddingTop(), org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j10);
                    canvas.save();
                    canvas.translate(a1.g.D(1.0f, ((qe.a) this.f32208k3).f53840e, org.telegram.messenger.g0.L(8.0f), L), 0.0f);
                    canvas.drawPaint(this.f32205g3);
                    canvas.restore();
                    canvas.restore();
                }
                if (z11) {
                    float measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(19.0f);
                    canvas.saveLayer(measuredWidth, getPaddingTop(), getMeasuredWidth() - org.telegram.messenger.g0.L(11.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j10);
                    canvas.save();
                    canvas.translate(com.google.android.recaptcha.internal.a.y(1.0f, ((qe.a) this.f32209l3).f53840e, org.telegram.messenger.g0.L(8.0f), measuredWidth), 0.0f);
                    canvas.drawPaint(this.f32206h3);
                    canvas.restore();
                    canvas.restore();
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void l0(int i3) {
        switch (this.f32204f3) {
            case 1:
                boolean canScrollVertically = canScrollVertically(-1);
                boolean canScrollVertically2 = canScrollVertically(1);
                if (canScrollVertically != this.i3 || canScrollVertically2 != this.f32207j3) {
                    this.i3 = canScrollVertically;
                    this.f32207j3 = canScrollVertically2;
                    invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        float f10;
        int i11;
        switch (this.f32204f3) {
            case 0:
                int childCount = getChildCount();
                int size = (View.MeasureSpec.getSize(i3) - getPaddingLeft()) - getPaddingRight();
                float f11 = 0.0f;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt instanceof wh) {
                        f11 = ((wh) childAt).f40008a.d() + f11;
                    }
                }
                if (size > f11 && childCount > 0) {
                    i11 = (int) Math.floor((f10 - f11) / childCount);
                } else {
                    i11 = 0;
                }
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt2 = getChildAt(i13);
                    if (childAt2 instanceof wh) {
                        ((wh) childAt2).f40008a.setAdditionalWidth(i11);
                    }
                }
                super.onMeasure(i3, i10);
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }
}
