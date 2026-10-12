package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class hs extends LinearLayout {
    public final Paint f36946a;
    public final Paint f36947b;
    public float f36948c;
    public boolean d;
    public boolean e;
    public ks[] f36949f;

    public hs(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f36946a = paint;
        this.f36947b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    public final void b(int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hs.b(int, int):void");
    }

    public final void c(String str, boolean z10) {
        if (this.f36949f != null) {
            int i10 = 0;
            if (z10) {
                int i11 = 0;
                while (true) {
                    ks[] ksVarArr = this.f36949f;
                    if (i11 >= ksVarArr.length) {
                        break;
                    } else if (ksVarArr[i11].isFocused()) {
                        i10 = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            for (int i12 = i10; i12 < Math.min(this.f36949f.length, str.length() + i10); i12++) {
                this.f36949f[i12].setText(Character.toString(str.charAt(i12 - i10)));
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ks) {
                ks ksVar = (ks) childAt;
                if (!this.e) {
                    if (childAt.isFocused()) {
                        ksVar.j(1.0f);
                    } else if (!childAt.isFocused()) {
                        ksVar.j(0.0f);
                    }
                }
                float successProgress = ksVar.getSuccessProgress();
                int d = i0.a.d(successProgress, i0.a.d(ksVar.getErrorProgress(), i0.a.d(ksVar.getFocusedProgress(), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20028k6, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20045l6, false)), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false)), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19991i7, false));
                Paint paint = this.f36946a;
                paint.setColor(d);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f7 = this.f36948c;
                rectF.inset(f7, f7);
                if (successProgress != 0.0f) {
                    float f10 = -Math.max(0.0f, (ksVar.getSuccessScaleProgress() - 1.0f) * this.f36948c);
                    rectF.inset(f10, f10);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof ks) {
            ks ksVar = (ks) view;
            canvas.save();
            float f7 = ksVar.v;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
            float f10 = this.f36948c;
            rectF.inset(f10, f10);
            canvas.clipRect(rectF);
            if (ksVar.f37723x) {
                float f11 = (f7 * 0.5f) + 0.5f;
                view.setAlpha(f7);
                canvas.scale(f11, f11, (ksVar.getMeasuredWidth() / 2.0f) + ksVar.getX(), (ksVar.getMeasuredHeight() / 2.0f) + ksVar.getY());
            } else {
                view.setAlpha(1.0f);
                canvas.translate(0.0f, (1.0f - f7) * view.getMeasuredHeight());
            }
            super.drawChild(canvas, view, j10);
            canvas.restore();
            float f12 = ksVar.f37722w;
            if (f12 < 1.0f) {
                canvas.save();
                float f13 = 1.0f - f12;
                float f14 = (f13 * 0.5f) + 0.5f;
                canvas.scale(f14, f14, (ksVar.getMeasuredWidth() / 2.0f) + ksVar.getX(), (ksVar.getMeasuredHeight() / 2.0f) + ksVar.getY());
                Paint paint = this.f36947b;
                paint.setAlpha((int) (f13 * 255.0f));
                canvas.drawBitmap(ksVar.f37724y, ksVar.getX(), ksVar.getY(), paint);
                canvas.restore();
                return true;
            }
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public String getCode() {
        if (this.f36949f == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            ks[] ksVarArr = this.f36949f;
            if (i10 < ksVarArr.length) {
                sb2.append(jf.b.d(ksVarArr[i10].getText().toString(), false));
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
        this.f36948c = dp;
        this.f36946a.setStrokeWidth(dp);
    }

    public void setCode(String str) {
        this.f36949f[0].setText(str);
    }

    public void setText(String str) {
        c(str, false);
    }
}
