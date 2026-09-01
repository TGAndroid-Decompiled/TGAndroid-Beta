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
public final class nh extends tl0 {
    public final int U2;
    public final Paint V2;
    public final Paint W2;
    public boolean X2;
    public boolean Y2;
    public final Object Z2;
    public final Object f29506a3;

    public nh(Context context, int i10) {
        super(context, null);
        this.U2 = i10;
        switch (i10) {
            case 1:
                super(context, null);
                Paint paint = new Paint(1);
                this.V2 = paint;
                Paint paint2 = new Paint(1);
                this.W2 = paint2;
                this.Z2 = new z5(this);
                this.f29506a3 = new z5(this);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode));
                paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode));
                return;
            default:
                pr prVar = pr.h;
                this.Z2 = new xd.a(this, prVar, 320L);
                this.f29506a3 = new xd.a(this, prVar, 320L);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{0, -16777216}, (float[]) null, tileMode2);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{-16777216, 0}, (float[]) null, tileMode2);
                Paint paint3 = new Paint(1);
                this.V2 = paint3;
                Paint paint4 = new Paint(1);
                this.W2 = paint4;
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
        switch (this.U2) {
            case 0:
                this.Y2 = false;
                this.X2 = false;
                super.dispatchDraw(canvas);
                ((xd.a) this.Z2).a(this.X2, true);
                ((xd.a) this.f29506a3).a(this.Y2, true);
                return;
            default:
                super.dispatchDraw(canvas);
                z5 z5Var = (z5) this.Z2;
                float f11 = 1.0f;
                if (this.X2) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                Paint paint = this.V2;
                paint.setAlpha((int) (z5Var.d(f10, false) * 255.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f), paint);
                z5 z5Var2 = (z5) this.f29506a3;
                if (!this.Y2) {
                    f11 = 0.0f;
                }
                int d = (int) (z5Var2.d(f11, false) * 255.0f);
                Paint paint2 = this.W2;
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
        boolean z4;
        boolean z10;
        switch (this.U2) {
            case 0:
                float x10 = view.getX();
                float width = view.getWidth() + x10;
                boolean z11 = true;
                if (x10 < AndroidUtilities.dp(10.0f)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (width > getMeasuredWidth() - AndroidUtilities.dp(10.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z4 && !z10) {
                    z11 = false;
                }
                this.X2 |= z4;
                this.Y2 |= z10;
                canvas.save();
                if (z11) {
                    canvas.clipRect(AndroidUtilities.dp(19.0f), 0, getMeasuredWidth() - AndroidUtilities.dp(19.0f), getMeasuredHeight());
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                if (z4) {
                    float dp = AndroidUtilities.dp(11.0f);
                    canvas.saveLayer(dp, getPaddingTop(), AndroidUtilities.dp(19.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j10);
                    canvas.save();
                    canvas.translate(org.telegram.ui.yh.c(1.0f, ((xd.a) this.Z2).f50505e, AndroidUtilities.dp(8.0f), dp), 0.0f);
                    canvas.drawPaint(this.V2);
                    canvas.restore();
                    canvas.restore();
                }
                if (z10) {
                    float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(19.0f);
                    canvas.saveLayer(measuredWidth, getPaddingTop(), getMeasuredWidth() - AndroidUtilities.dp(11.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j10);
                    canvas.save();
                    canvas.translate(e2.c.w(1.0f, ((xd.a) this.f29506a3).f50505e, AndroidUtilities.dp(8.0f), measuredWidth), 0.0f);
                    canvas.drawPaint(this.W2);
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
        switch (this.U2) {
            case 1:
                boolean canScrollVertically = canScrollVertically(-1);
                boolean canScrollVertically2 = canScrollVertically(1);
                if (canScrollVertically != this.X2 || canScrollVertically2 != this.Y2) {
                    this.X2 = canScrollVertically;
                    this.Y2 = canScrollVertically2;
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
        float f10;
        int i12;
        switch (this.U2) {
            case 0:
                int childCount = getChildCount();
                int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
                float f11 = 0.0f;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt instanceof hi) {
                        f11 = ((hi) childAt).f27492a.c() + f11;
                    }
                }
                if (size > f11 && childCount > 0) {
                    i12 = (int) Math.floor((f10 - f11) / childCount);
                } else {
                    i12 = 0;
                }
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt2 = getChildAt(i14);
                    if (childAt2 instanceof hi) {
                        ((hi) childAt2).f27492a.setAdditionalWidth(i12);
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
