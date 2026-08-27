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

public final class jh extends zk0 {
    public final int T2;
    public final Paint U2;
    public final Paint V2;
    public boolean W2;
    public boolean X2;
    public final Object Y2;
    public final Object Z2;

    public jh(Context context, int i10) {
        super(context, null);
        this.T2 = i10;
        switch (i10) {
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
                break;
            default:
                er erVar = er.h;
                this.Y2 = new ud.a(this, erVar, 320L);
                this.Z2 = new ud.a(this, erVar, 320L);
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
                break;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.T2) {
            case 0:
                this.X2 = false;
                this.W2 = false;
                super.dispatchDraw(canvas);
                ((ud.a) this.Y2).a(this.W2, true);
                ((ud.a) this.Z2).a(this.X2, true);
                break;
            default:
                super.dispatchDraw(canvas);
                int iD = (int) (((y5) this.Y2).d(this.W2 ? 1.0f : 0.0f, false) * 255.0f);
                Paint paint = this.U2;
                paint.setAlpha(iD);
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f), paint);
                int iD2 = (int) (((y5) this.Z2).d(this.X2 ? 1.0f : 0.0f, false) * 255.0f);
                Paint paint2 = this.V2;
                paint2.setAlpha(iD2);
                canvas.save();
                canvas.translate(0.0f, getHeight() - AndroidUtilities.dp(8.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f), paint2);
                canvas.restore();
                break;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.T2) {
            case 0:
                float x8 = view.getX();
                float width = view.getWidth() + x8;
                boolean z10 = true;
                boolean z11 = x8 < ((float) AndroidUtilities.dp(10.0f));
                boolean z12 = width > ((float) (getMeasuredWidth() - AndroidUtilities.dp(10.0f)));
                if (!z11 && !z12) {
                    z10 = false;
                }
                this.W2 |= z11;
                this.X2 |= z12;
                canvas.save();
                if (z10) {
                    canvas.clipRect(AndroidUtilities.dp(19.0f), 0, getMeasuredWidth() - AndroidUtilities.dp(19.0f), getMeasuredHeight());
                }
                boolean zDrawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                if (z11) {
                    float fDp = AndroidUtilities.dp(11.0f);
                    canvas.saveLayer(fDp, getPaddingTop(), AndroidUtilities.dp(19.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j10);
                    canvas.save();
                    canvas.translate(org.telegram.ui.Cells.pa.b(1.0f, ((ud.a) this.Y2).f48497e, AndroidUtilities.dp(8.0f), fDp), 0.0f);
                    canvas.drawPaint(this.U2);
                    canvas.restore();
                    canvas.restore();
                }
                if (z12) {
                    float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(19.0f);
                    canvas.saveLayer(measuredWidth, getPaddingTop(), getMeasuredWidth() - AndroidUtilities.dp(11.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j10);
                    canvas.save();
                    canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, ((ud.a) this.Z2).f48497e, AndroidUtilities.dp(8.0f), measuredWidth), 0.0f);
                    canvas.drawPaint(this.V2);
                    canvas.restore();
                    canvas.restore();
                }
                return zDrawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void k0(int i10, int i11) {
        switch (this.T2) {
            case 1:
                boolean zCanScrollVertically = canScrollVertically(-1);
                boolean zCanScrollVertically2 = canScrollVertically(1);
                if (zCanScrollVertically != this.W2 || zCanScrollVertically2 != this.X2) {
                    this.W2 = zCanScrollVertically;
                    this.X2 = zCanScrollVertically2;
                    invalidate();
                }
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.T2) {
            case 0:
                int childCount = getChildCount();
                int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
                float fC = 0.0f;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt instanceof bi) {
                        fC = ((bi) childAt).f27104a.c() + fC;
                    }
                }
                float f10 = size;
                int iFloor = (f10 <= fC || childCount <= 0) ? 0 : (int) Math.floor((f10 - fC) / childCount);
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt2 = getChildAt(i13);
                    if (childAt2 instanceof bi) {
                        ((bi) childAt2).f27104a.setAdditionalWidth(iFloor);
                    }
                }
                super.onMeasure(i10, i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }
}
