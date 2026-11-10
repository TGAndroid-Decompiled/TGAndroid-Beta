package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
public abstract class br extends LinearLayout {
    public final Paint f44114a;
    public final Paint f44115b;
    public float f44116c;
    public boolean d;
    public boolean f44117e;
    public er[] f44118f;

    public br(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f44114a = paint;
        this.f44115b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    public final void b(int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.br.b(int, int):void");
    }

    public final void c(String str, boolean z9) {
        if (this.f44118f != null) {
            int i7 = 0;
            if (z9) {
                int i10 = 0;
                while (true) {
                    er[] erVarArr = this.f44118f;
                    if (i10 >= erVarArr.length) {
                        break;
                    } else if (erVarArr[i10].isFocused()) {
                        i7 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            for (int i11 = i7; i11 < Math.min(this.f44118f.length, str.length() + i7); i11++) {
                this.f44118f[i11].setText(Character.toString(str.charAt(i11 - i7)));
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof er) {
                er erVar = (er) childAt;
                if (!this.f44117e) {
                    if (childAt.isFocused()) {
                        erVar.A(1.0f);
                    } else if (!childAt.isFocused()) {
                        erVar.A(0.0f);
                    }
                }
                float successProgress = erVar.getSuccessProgress();
                int f10 = i0.a.f(successProgress, i0.a.f(erVar.getErrorProgress(), i0.a.f(erVar.getFocusedProgress(), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28019k6, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28037l6, false)), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28131q7, false)), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.i7, false));
                Paint paint = this.f44114a;
                paint.setColor(f10);
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f11 = this.f44116c;
                rectF.inset(f11, f11);
                if (successProgress != 0.0f) {
                    float f12 = -Math.max(0.0f, (erVar.getSuccessScaleProgress() - 1.0f) * this.f44116c);
                    rectF.inset(f12, f12);
                }
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof er) {
            er erVar = (er) view;
            canvas.save();
            float f10 = erVar.P1;
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
            float f11 = this.f44116c;
            rectF.inset(f11, f11);
            canvas.clipRect(rectF);
            if (erVar.R1) {
                float f12 = (f10 * 0.5f) + 0.5f;
                view.setAlpha(f10);
                canvas.scale(f12, f12, (erVar.getMeasuredWidth() / 2.0f) + erVar.getX(), (erVar.getMeasuredHeight() / 2.0f) + erVar.getY());
            } else {
                view.setAlpha(1.0f);
                canvas.translate(0.0f, (1.0f - f10) * view.getMeasuredHeight());
            }
            super.drawChild(canvas, view, j3);
            canvas.restore();
            float f13 = erVar.Q1;
            if (f13 < 1.0f) {
                canvas.save();
                float f14 = 1.0f - f13;
                float f15 = (f14 * 0.5f) + 0.5f;
                canvas.scale(f15, f15, (erVar.getMeasuredWidth() / 2.0f) + erVar.getX(), (erVar.getMeasuredHeight() / 2.0f) + erVar.getY());
                Paint paint = this.f44115b;
                paint.setAlpha((int) (f14 * 255.0f));
                canvas.drawBitmap(erVar.S1, erVar.getX(), erVar.getY(), paint);
                canvas.restore();
                return true;
            }
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public String getCode() {
        if (this.f44118f == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i7 = 0;
        while (true) {
            er[] erVarArr = this.f44118f;
            if (i7 < erVarArr.length) {
                sb2.append(pf.b.d(erVarArr[i7].getText().toString(), false));
                i7++;
            } else {
                return sb2.toString();
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        float L = org.telegram.messenger.g0.L(1.5f);
        this.f44116c = L;
        this.f44114a.setStrokeWidth(L);
    }

    public void setCode(String str) {
        this.f44118f[0].setText(str);
    }

    public void setText(String str) {
        c(str, false);
    }
}
