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
public final class xh extends jm0 {
    public final int V2;
    public final Paint W2;
    public final Paint X2;
    public boolean Y2;
    public boolean Z2;
    public final Object f32425a3;
    public final Object f32426b3;

    public xh(Context context, int i10) {
        super(context, null);
        this.V2 = i10;
        switch (i10) {
            case 1:
                super(context, null);
                Paint paint = new Paint(1);
                this.W2 = paint;
                Paint paint2 = new Paint(1);
                this.X2 = paint2;
                this.f32425a3 = new f6(this);
                this.f32426b3 = new f6(this);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode));
                paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode));
                return;
            default:
                bs bsVar = bs.h;
                this.f32425a3 = new ne.b(this, bsVar, 320L);
                this.f32426b3 = new ne.b(this, bsVar, 320L);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{0, -16777216}, (float[]) null, tileMode2);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{-16777216, 0}, (float[]) null, tileMode2);
                Paint paint3 = new Paint(1);
                this.W2 = paint3;
                Paint paint4 = new Paint(1);
                this.X2 = paint4;
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
        switch (this.V2) {
            case 0:
                this.Z2 = false;
                this.Y2 = false;
                super.dispatchDraw(canvas);
                ((ne.b) this.f32425a3).a(this.Y2, true);
                ((ne.b) this.f32426b3).a(this.Z2, true);
                return;
            default:
                super.dispatchDraw(canvas);
                f6 f6Var = (f6) this.f32425a3;
                float f10 = 1.0f;
                if (this.Y2) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                Paint paint = this.W2;
                paint.setAlpha((int) (f6Var.d(f7, false) * 255.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f), paint);
                f6 f6Var2 = (f6) this.f32426b3;
                if (!this.Z2) {
                    f10 = 0.0f;
                }
                int d = (int) (f6Var2.d(f10, false) * 255.0f);
                Paint paint2 = this.X2;
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
        switch (this.V2) {
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
                this.Y2 |= z10;
                this.Z2 |= z11;
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
                    canvas.translate(com.google.android.gms.internal.play_billing.k3.D(1.0f, ((ne.b) this.f32425a3).e, AndroidUtilities.dp(8.0f), dp), 0.0f);
                    canvas.drawPaint(this.W2);
                    canvas.restore();
                    canvas.restore();
                }
                if (z11) {
                    float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(19.0f);
                    canvas.saveLayer(measuredWidth, getPaddingTop(), getMeasuredWidth() - AndroidUtilities.dp(11.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j10);
                    canvas.save();
                    canvas.translate(com.google.android.gms.internal.play_billing.k3.y(1.0f, ((ne.b) this.f32426b3).e, AndroidUtilities.dp(8.0f), measuredWidth), 0.0f);
                    canvas.drawPaint(this.X2);
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
        switch (this.V2) {
            case 1:
                boolean canScrollVertically = canScrollVertically(-1);
                boolean canScrollVertically2 = canScrollVertically(1);
                if (canScrollVertically != this.Y2 || canScrollVertically2 != this.Z2) {
                    this.Y2 = canScrollVertically;
                    this.Z2 = canScrollVertically2;
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
        switch (this.V2) {
            case 0:
                int childCount = getChildCount();
                int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
                float f10 = 0.0f;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt instanceof oi) {
                        f10 = ((oi) childAt).f29055a.c() + f10;
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
                        ((oi) childAt2).f29055a.setAdditionalWidth(i12);
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
