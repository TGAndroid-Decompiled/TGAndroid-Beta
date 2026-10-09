package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class cs extends LinearLayout {
    public final Paint f36728a;
    public final Paint f36729b;
    public float f36730c;
    public boolean d;
    public boolean f36731e;
    public es[] f36732f;

    public cs(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f36728a = paint;
        this.f36729b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    public final void b(int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cs.b(int, int):void");
    }

    public final void c(String str, boolean z10) {
        if (this.f36732f != null) {
            int i10 = 0;
            if (z10) {
                int i11 = 0;
                while (true) {
                    es[] esVarArr = this.f36732f;
                    if (i11 >= esVarArr.length) {
                        break;
                    } else if (esVarArr[i11].isFocused()) {
                        i10 = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            for (int i12 = i10; i12 < Math.min(this.f36732f.length, str.length() + i10); i12++) {
                this.f36732f[i12].setText(Character.toString(str.charAt(i12 - i10)));
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof es) {
                es esVar = (es) childAt;
                if (!this.f36731e) {
                    if (childAt.isFocused()) {
                        esVar.j(1.0f);
                    } else if (!childAt.isFocused()) {
                        esVar.j(0.0f);
                    }
                }
                float successProgress = esVar.getSuccessProgress();
                int d = i0.a.d(successProgress, i0.a.d(esVar.getErrorProgress(), i0.a.d(esVar.getFocusedProgress(), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20925k6, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20943l6, false)), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21037q7, false)), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20889i7, false));
                Paint paint = this.f36728a;
                paint.setColor(d);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f7 = this.f36730c;
                rectF.inset(f7, f7);
                if (successProgress != 0.0f) {
                    float f10 = -Math.max(0.0f, (esVar.getSuccessScaleProgress() - 1.0f) * this.f36730c);
                    rectF.inset(f10, f10);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof es) {
            es esVar = (es) view;
            canvas.save();
            float f7 = esVar.v;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
            float f10 = this.f36730c;
            rectF.inset(f10, f10);
            canvas.clipRect(rectF);
            if (esVar.f37325x) {
                float f11 = (f7 * 0.5f) + 0.5f;
                view.setAlpha(f7);
                canvas.scale(f11, f11, (esVar.getMeasuredWidth() / 2.0f) + esVar.getX(), (esVar.getMeasuredHeight() / 2.0f) + esVar.getY());
            } else {
                view.setAlpha(1.0f);
                canvas.translate(0.0f, (1.0f - f7) * view.getMeasuredHeight());
            }
            super.drawChild(canvas, view, j3);
            canvas.restore();
            float f12 = esVar.f37324w;
            if (f12 < 1.0f) {
                canvas.save();
                float f13 = 1.0f - f12;
                float f14 = (f13 * 0.5f) + 0.5f;
                canvas.scale(f14, f14, (esVar.getMeasuredWidth() / 2.0f) + esVar.getX(), (esVar.getMeasuredHeight() / 2.0f) + esVar.getY());
                Paint paint = this.f36729b;
                paint.setAlpha((int) (f13 * 255.0f));
                canvas.drawBitmap(esVar.f37326y, esVar.getX(), esVar.getY(), paint);
                canvas.restore();
                return true;
            }
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public String getCode() {
        if (this.f36732f == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            es[] esVarArr = this.f36732f;
            if (i10 < esVarArr.length) {
                sb2.append(hf.b.d(esVarArr[i10].getText().toString(), false));
                i10++;
            } else {
                return sb2.toString();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float dp = AndroidUtilities.dp(1.5f);
        this.f36730c = dp;
        this.f36728a.setStrokeWidth(dp);
    }

    public void setCode(String str) {
        this.f36732f[0].setText(str);
    }

    public void setText(String str) {
        c(str, false);
    }
}
