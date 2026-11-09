package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
public abstract class ar extends LinearLayout {
    public final Paint f43764a;
    public final Paint f43765b;
    public float f43766c;
    public boolean d;
    public boolean f43767e;
    public dr[] f43768f;

    public ar(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f43764a = paint;
        this.f43765b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    public final void b(int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ar.b(int, int):void");
    }

    public final void c(String str, boolean z9) {
        if (this.f43768f != null) {
            int i7 = 0;
            if (z9) {
                int i10 = 0;
                while (true) {
                    dr[] drVarArr = this.f43768f;
                    if (i10 >= drVarArr.length) {
                        break;
                    } else if (drVarArr[i10].isFocused()) {
                        i7 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            for (int i11 = i7; i11 < Math.min(this.f43768f.length, str.length() + i7); i11++) {
                this.f43768f[i11].setText(Character.toString(str.charAt(i11 - i7)));
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof dr) {
                dr drVar = (dr) childAt;
                if (!this.f43767e) {
                    if (childAt.isFocused()) {
                        drVar.A(1.0f);
                    } else if (!childAt.isFocused()) {
                        drVar.A(0.0f);
                    }
                }
                float successProgress = drVar.getSuccessProgress();
                int f10 = i0.a.f(successProgress, i0.a.f(drVar.getErrorProgress(), i0.a.f(drVar.getFocusedProgress(), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27994k6, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28012l6, false)), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28106q7, false)), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.i7, false));
                Paint paint = this.f43764a;
                paint.setColor(f10);
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f11 = this.f43766c;
                rectF.inset(f11, f11);
                if (successProgress != 0.0f) {
                    float f12 = -Math.max(0.0f, (drVar.getSuccessScaleProgress() - 1.0f) * this.f43766c);
                    rectF.inset(f12, f12);
                }
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof dr) {
            dr drVar = (dr) view;
            canvas.save();
            float f10 = drVar.P1;
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
            float f11 = this.f43766c;
            rectF.inset(f11, f11);
            canvas.clipRect(rectF);
            if (drVar.R1) {
                float f12 = (f10 * 0.5f) + 0.5f;
                view.setAlpha(f10);
                canvas.scale(f12, f12, (drVar.getMeasuredWidth() / 2.0f) + drVar.getX(), (drVar.getMeasuredHeight() / 2.0f) + drVar.getY());
            } else {
                view.setAlpha(1.0f);
                canvas.translate(0.0f, (1.0f - f10) * view.getMeasuredHeight());
            }
            super.drawChild(canvas, view, j3);
            canvas.restore();
            float f13 = drVar.Q1;
            if (f13 < 1.0f) {
                canvas.save();
                float f14 = 1.0f - f13;
                float f15 = (f14 * 0.5f) + 0.5f;
                canvas.scale(f15, f15, (drVar.getMeasuredWidth() / 2.0f) + drVar.getX(), (drVar.getMeasuredHeight() / 2.0f) + drVar.getY());
                Paint paint = this.f43765b;
                paint.setAlpha((int) (f14 * 255.0f));
                canvas.drawBitmap(drVar.S1, drVar.getX(), drVar.getY(), paint);
                canvas.restore();
                return true;
            }
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public String getCode() {
        if (this.f43768f == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i7 = 0;
        while (true) {
            dr[] drVarArr = this.f43768f;
            if (i7 < drVarArr.length) {
                sb2.append(pf.b.d(drVarArr[i7].getText().toString(), false));
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
        this.f43766c = L;
        this.f43764a.setStrokeWidth(L);
    }

    public void setCode(String str) {
        this.f43768f[0].setText(str);
    }

    public void setText(String str) {
        c(str, false);
    }
}
