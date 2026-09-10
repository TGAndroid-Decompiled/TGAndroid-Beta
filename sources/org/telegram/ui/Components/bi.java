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
public final class bi extends vl0 {
    public final int X2;
    public final Paint Y2;
    public final Paint Z2;
    public boolean f21835a3;
    public boolean f21836b3;
    public final Object f21837c3;
    public final Object f21838d3;

    public bi(Context context, int i10) {
        super(context, null);
        this.X2 = i10;
        switch (i10) {
            case 1:
                super(context, null);
                Paint paint = new Paint(1);
                this.Y2 = paint;
                Paint paint2 = new Paint(1);
                this.Z2 = paint2;
                this.f21837c3 = new d6(this);
                this.f21838d3 = new d6(this);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode));
                paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode));
                return;
            default:
                wr wrVar = wr.h;
                this.f21837c3 = new le.b(this, wrVar, 320L);
                this.f21838d3 = new le.b(this, wrVar, 320L);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{0, -16777216}, (float[]) null, tileMode2);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{-16777216, 0}, (float[]) null, tileMode2);
                Paint paint3 = new Paint(1);
                this.Y2 = paint3;
                Paint paint4 = new Paint(1);
                this.Z2 = paint4;
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
        switch (this.X2) {
            case 0:
                this.f21836b3 = false;
                this.f21835a3 = false;
                super.dispatchDraw(canvas);
                ((le.b) this.f21837c3).a(this.f21835a3, true);
                ((le.b) this.f21838d3).a(this.f21836b3, true);
                return;
            default:
                super.dispatchDraw(canvas);
                d6 d6Var = (d6) this.f21837c3;
                float f10 = 1.0f;
                if (this.f21835a3) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                Paint paint = this.Y2;
                paint.setAlpha((int) (d6Var.d(f7, false) * 255.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f), paint);
                d6 d6Var2 = (d6) this.f21838d3;
                if (!this.f21836b3) {
                    f10 = 0.0f;
                }
                int d = (int) (d6Var2.d(f10, false) * 255.0f);
                Paint paint2 = this.Z2;
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
        switch (this.X2) {
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
                this.f21835a3 |= z10;
                this.f21836b3 |= z11;
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
                    canvas.translate(com.google.android.gms.internal.vision.e2.a(1.0f, ((le.b) this.f21837c3).e, AndroidUtilities.dp(8.0f), dp), 0.0f);
                    canvas.drawPaint(this.Y2);
                    canvas.restore();
                    canvas.restore();
                }
                if (z11) {
                    float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(19.0f);
                    canvas.saveLayer(measuredWidth, getPaddingTop(), getMeasuredWidth() - AndroidUtilities.dp(11.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j3);
                    canvas.save();
                    canvas.translate(com.google.android.gms.internal.vision.e2.z(1.0f, ((le.b) this.f21838d3).e, AndroidUtilities.dp(8.0f), measuredWidth), 0.0f);
                    canvas.drawPaint(this.Z2);
                    canvas.restore();
                    canvas.restore();
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void k0(int i10, int i11) {
        switch (this.X2) {
            case 1:
                boolean canScrollVertically = canScrollVertically(-1);
                boolean canScrollVertically2 = canScrollVertically(1);
                if (canScrollVertically != this.f21835a3 || canScrollVertically2 != this.f21836b3) {
                    this.f21835a3 = canScrollVertically;
                    this.f21836b3 = canScrollVertically2;
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
        switch (this.X2) {
            case 0:
                int childCount = getChildCount();
                int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
                float f10 = 0.0f;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt instanceof ti) {
                        f10 = ((ti) childAt).f27412a.c() + f10;
                    }
                }
                if (size > f10 && childCount > 0) {
                    i12 = (int) Math.floor((f7 - f10) / childCount);
                } else {
                    i12 = 0;
                }
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt2 = getChildAt(i14);
                    if (childAt2 instanceof ti) {
                        ((ti) childAt2).f27412a.setAdditionalWidth(i12);
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
