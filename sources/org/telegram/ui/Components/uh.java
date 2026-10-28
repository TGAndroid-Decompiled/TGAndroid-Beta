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
public final class uh extends nm0 {
    public final int f33403f3;
    public final Paint f33404g3;
    public final Paint f33405h3;
    public boolean f33406i3;
    public boolean f33407j3;
    public final Object f33408k3;
    public final Object f33409l3;

    public uh(Context context, int i10) {
        super(context, null);
        this.f33403f3 = i10;
        switch (i10) {
            case 1:
                super(context, null);
                Paint paint = new Paint(1);
                this.f33404g3 = paint;
                Paint paint2 = new Paint(1);
                this.f33405h3 = paint2;
                this.f33408k3 = new h6(this);
                this.f33409l3 = new h6(this);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode));
                paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode));
                return;
            default:
                ds dsVar = ds.h;
                this.f33408k3 = new oe.b(this, dsVar, 320L);
                this.f33409l3 = new oe.b(this, dsVar, 320L);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{0, -16777216}, (float[]) null, tileMode2);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{-16777216, 0}, (float[]) null, tileMode2);
                Paint paint3 = new Paint(1);
                this.f33404g3 = paint3;
                Paint paint4 = new Paint(1);
                this.f33405h3 = paint4;
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
        switch (this.f33403f3) {
            case 0:
                this.f33407j3 = false;
                this.f33406i3 = false;
                super.dispatchDraw(canvas);
                ((oe.b) this.f33408k3).a(this.f33406i3, true);
                ((oe.b) this.f33409l3).a(this.f33407j3, true);
                return;
            default:
                super.dispatchDraw(canvas);
                h6 h6Var = (h6) this.f33408k3;
                float f10 = 1.0f;
                if (this.f33406i3) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                Paint paint = this.f33404g3;
                paint.setAlpha((int) (h6Var.d(f7, false) * 255.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f), paint);
                h6 h6Var2 = (h6) this.f33409l3;
                if (!this.f33407j3) {
                    f10 = 0.0f;
                }
                int d = (int) (h6Var2.d(f10, false) * 255.0f);
                Paint paint2 = this.f33405h3;
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
        switch (this.f33403f3) {
            case 0:
                float x9 = view.getX();
                float width = view.getWidth() + x9;
                boolean z12 = true;
                if (x9 < AndroidUtilities.dp(10.0f)) {
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
                this.f33406i3 |= z10;
                this.f33407j3 |= z11;
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
                    canvas.translate(ic.a.d(1.0f, ((oe.b) this.f33408k3).e, AndroidUtilities.dp(8.0f), dp), 0.0f);
                    canvas.drawPaint(this.f33404g3);
                    canvas.restore();
                    canvas.restore();
                }
                if (z11) {
                    float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(19.0f);
                    canvas.saveLayer(measuredWidth, getPaddingTop(), getMeasuredWidth() - AndroidUtilities.dp(11.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j10);
                    canvas.save();
                    canvas.translate(c3.h0.z(1.0f, ((oe.b) this.f33409l3).e, AndroidUtilities.dp(8.0f), measuredWidth), 0.0f);
                    canvas.drawPaint(this.f33405h3);
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
        switch (this.f33403f3) {
            case 1:
                boolean canScrollVertically = canScrollVertically(-1);
                boolean canScrollVertically2 = canScrollVertically(1);
                if (canScrollVertically != this.f33406i3 || canScrollVertically2 != this.f33407j3) {
                    this.f33406i3 = canScrollVertically;
                    this.f33407j3 = canScrollVertically2;
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
        switch (this.f33403f3) {
            case 0:
                int childCount = getChildCount();
                int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
                float f10 = 0.0f;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt instanceof oi) {
                        f10 = ((oi) childAt).f31294a.d() + f10;
                    }
                }
                if (size > f10 && childCount > 0) {
                    i12 = (int) Math.floor((f7 - f10) / childCount);
                } else {
                    i12 = 0;
                }
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt2 = getChildAt(i14);
                    if (childAt2 instanceof oi) {
                        ((oi) childAt2).f31294a.setAdditionalWidth(i12);
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
