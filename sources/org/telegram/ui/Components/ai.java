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
public final class ai extends zl0 {
    public final int f22630e3;
    public final Paint f22631f3;
    public final Paint f22632g3;
    public boolean f22633h3;
    public boolean f22634i3;
    public final Object j3;
    public final Object f22635k3;

    public ai(Context context, int i10) {
        super(context, null);
        this.f22630e3 = i10;
        switch (i10) {
            case 1:
                super(context, null);
                Paint paint = new Paint(1);
                this.f22631f3 = paint;
                Paint paint2 = new Paint(1);
                this.f22632g3 = paint2;
                this.j3 = new e6(this);
                this.f22635k3 = new e6(this);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode));
                paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode));
                return;
            default:
                tr trVar = tr.h;
                this.j3 = new le.c(this, trVar, 320L);
                this.f22635k3 = new le.c(this, trVar, 320L);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{0, -16777216}, (float[]) null, tileMode2);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{-16777216, 0}, (float[]) null, tileMode2);
                Paint paint3 = new Paint(1);
                this.f22631f3 = paint3;
                Paint paint4 = new Paint(1);
                this.f22632g3 = paint4;
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
        switch (this.f22630e3) {
            case 0:
                this.f22634i3 = false;
                this.f22633h3 = false;
                super.dispatchDraw(canvas);
                ((le.c) this.j3).a(this.f22633h3, true);
                ((le.c) this.f22635k3).a(this.f22634i3, true);
                return;
            default:
                super.dispatchDraw(canvas);
                e6 e6Var = (e6) this.j3;
                float f10 = 1.0f;
                if (this.f22633h3) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                Paint paint = this.f22631f3;
                paint.setAlpha((int) (e6Var.d(f7, false) * 255.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f), paint);
                e6 e6Var2 = (e6) this.f22635k3;
                if (!this.f22634i3) {
                    f10 = 0.0f;
                }
                int d = (int) (e6Var2.d(f10, false) * 255.0f);
                Paint paint2 = this.f22632g3;
                paint2.setAlpha(d);
                canvas.save();
                canvas.translate(0.0f, getHeight() - AndroidUtilities.dp(8.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f), paint2);
                canvas.restore();
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        boolean z11;
        switch (this.f22630e3) {
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
                this.f22633h3 |= z10;
                this.f22634i3 |= z11;
                canvas.save();
                if (z12) {
                    canvas.clipRect(AndroidUtilities.dp(19.0f), 0, getMeasuredWidth() - AndroidUtilities.dp(19.0f), getMeasuredHeight());
                }
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                if (z10) {
                    float dp = AndroidUtilities.dp(11.0f);
                    canvas.saveLayer(dp, getPaddingTop(), AndroidUtilities.dp(19.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j3);
                    canvas.save();
                    canvas.translate(com.google.android.gms.internal.vision.e2.b(1.0f, ((le.c) this.j3).e, AndroidUtilities.dp(8.0f), dp), 0.0f);
                    canvas.drawPaint(this.f22631f3);
                    canvas.restore();
                    canvas.restore();
                }
                if (z11) {
                    float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(19.0f);
                    canvas.saveLayer(measuredWidth, getPaddingTop(), getMeasuredWidth() - AndroidUtilities.dp(11.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j3);
                    canvas.save();
                    canvas.translate(com.google.android.gms.internal.vision.e2.z(1.0f, ((le.c) this.f22635k3).e, AndroidUtilities.dp(8.0f), measuredWidth), 0.0f);
                    canvas.drawPaint(this.f22632g3);
                    canvas.restore();
                    canvas.restore();
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void l0(int i10, int i11) {
        switch (this.f22630e3) {
            case 1:
                boolean canScrollVertically = canScrollVertically(-1);
                boolean canScrollVertically2 = canScrollVertically(1);
                if (canScrollVertically != this.f22633h3 || canScrollVertically2 != this.f22634i3) {
                    this.f22633h3 = canScrollVertically;
                    this.f22634i3 = canScrollVertically2;
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
        switch (this.f22630e3) {
            case 0:
                int childCount = getChildCount();
                int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
                float f10 = 0.0f;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt instanceof si) {
                        f10 = ((si) childAt).f28263a.c() + f10;
                    }
                }
                if (size > f10 && childCount > 0) {
                    i12 = (int) Math.floor((f7 - f10) / childCount);
                } else {
                    i12 = 0;
                }
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt2 = getChildAt(i14);
                    if (childAt2 instanceof si) {
                        ((si) childAt2).f28263a.setAdditionalWidth(i12);
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
