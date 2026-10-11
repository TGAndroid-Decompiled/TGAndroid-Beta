package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class bs extends LinearLayout {
    public final Paint f36446a;
    public final Paint f36447b;
    public float f36448c;
    public boolean d;
    public boolean f36449e;
    public ds[] f36450f;

    public bs(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f36446a = paint;
        this.f36447b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    public final void b(int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bs.b(int, int):void");
    }

    public final void c(String str, boolean z10) {
        if (this.f36450f != null) {
            int i10 = 0;
            if (z10) {
                int i11 = 0;
                while (true) {
                    ds[] dsVarArr = this.f36450f;
                    if (i11 >= dsVarArr.length) {
                        break;
                    } else if (dsVarArr[i11].isFocused()) {
                        i10 = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            for (int i12 = i10; i12 < Math.min(this.f36450f.length, str.length() + i10); i12++) {
                this.f36450f[i12].setText(Character.toString(str.charAt(i12 - i10)));
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ds) {
                ds dsVar = (ds) childAt;
                if (!this.f36449e) {
                    if (childAt.isFocused()) {
                        dsVar.j(1.0f);
                    } else if (!childAt.isFocused()) {
                        dsVar.j(0.0f);
                    }
                }
                float successProgress = dsVar.getSuccessProgress();
                int d = i0.a.d(successProgress, i0.a.d(dsVar.getErrorProgress(), i0.a.d(dsVar.getFocusedProgress(), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20914k6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20932l6, false)), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21026q7, false)), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20878i7, false));
                Paint paint = this.f36446a;
                paint.setColor(d);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f7 = this.f36448c;
                rectF.inset(f7, f7);
                if (successProgress != 0.0f) {
                    float f10 = -Math.max(0.0f, (dsVar.getSuccessScaleProgress() - 1.0f) * this.f36448c);
                    rectF.inset(f10, f10);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof ds) {
            ds dsVar = (ds) view;
            canvas.save();
            float f7 = dsVar.v;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
            float f10 = this.f36448c;
            rectF.inset(f10, f10);
            canvas.clipRect(rectF);
            if (dsVar.f37085x) {
                float f11 = (f7 * 0.5f) + 0.5f;
                view.setAlpha(f7);
                canvas.scale(f11, f11, (dsVar.getMeasuredWidth() / 2.0f) + dsVar.getX(), (dsVar.getMeasuredHeight() / 2.0f) + dsVar.getY());
            } else {
                view.setAlpha(1.0f);
                canvas.translate(0.0f, (1.0f - f7) * view.getMeasuredHeight());
            }
            super.drawChild(canvas, view, j3);
            canvas.restore();
            float f12 = dsVar.f37084w;
            if (f12 < 1.0f) {
                canvas.save();
                float f13 = 1.0f - f12;
                float f14 = (f13 * 0.5f) + 0.5f;
                canvas.scale(f14, f14, (dsVar.getMeasuredWidth() / 2.0f) + dsVar.getX(), (dsVar.getMeasuredHeight() / 2.0f) + dsVar.getY());
                Paint paint = this.f36447b;
                paint.setAlpha((int) (f13 * 255.0f));
                canvas.drawBitmap(dsVar.f37086y, dsVar.getX(), dsVar.getY(), paint);
                canvas.restore();
                return true;
            }
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public String getCode() {
        if (this.f36450f == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            ds[] dsVarArr = this.f36450f;
            if (i10 < dsVarArr.length) {
                sb2.append(hf.b.d(dsVarArr[i10].getText().toString(), false));
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
        this.f36448c = dp;
        this.f36446a.setStrokeWidth(dp);
    }

    public void setCode(String str) {
        this.f36450f[0].setText(str);
    }

    public void setText(String str) {
        c(str, false);
    }
}
