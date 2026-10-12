package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class fs extends LinearLayout {
    public final Paint f37830a;
    public final Paint f37831b;
    public float f37832c;
    public boolean d;
    public boolean f37833e;
    public hs[] f37834f;

    public fs(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f37830a = paint;
        this.f37831b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    public final void b(int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fs.b(int, int):void");
    }

    public final void c(String str, boolean z10) {
        if (this.f37834f != null) {
            int i10 = 0;
            if (z10) {
                int i11 = 0;
                while (true) {
                    hs[] hsVarArr = this.f37834f;
                    if (i11 >= hsVarArr.length) {
                        break;
                    } else if (hsVarArr[i11].isFocused()) {
                        i10 = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            for (int i12 = i10; i12 < Math.min(this.f37834f.length, str.length() + i10); i12++) {
                this.f37834f[i12].setText(Character.toString(str.charAt(i12 - i10)));
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof hs) {
                hs hsVar = (hs) childAt;
                if (!this.f37833e) {
                    if (childAt.isFocused()) {
                        hsVar.j(1.0f);
                    } else if (!childAt.isFocused()) {
                        hsVar.j(0.0f);
                    }
                }
                float successProgress = hsVar.getSuccessProgress();
                int d = i0.a.d(successProgress, i0.a.d(hsVar.getErrorProgress(), i0.a.d(hsVar.getFocusedProgress(), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20688k6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20706l6, false)), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20800q7, false)), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20652i7, false));
                Paint paint = this.f37830a;
                paint.setColor(d);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f7 = this.f37832c;
                rectF.inset(f7, f7);
                if (successProgress != 0.0f) {
                    float f10 = -Math.max(0.0f, (hsVar.getSuccessScaleProgress() - 1.0f) * this.f37832c);
                    rectF.inset(f10, f10);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof hs) {
            hs hsVar = (hs) view;
            canvas.save();
            float f7 = hsVar.v;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
            float f10 = this.f37832c;
            rectF.inset(f10, f10);
            canvas.clipRect(rectF);
            if (hsVar.f38510x) {
                float f11 = (f7 * 0.5f) + 0.5f;
                view.setAlpha(f7);
                canvas.scale(f11, f11, (hsVar.getMeasuredWidth() / 2.0f) + hsVar.getX(), (hsVar.getMeasuredHeight() / 2.0f) + hsVar.getY());
            } else {
                view.setAlpha(1.0f);
                canvas.translate(0.0f, (1.0f - f7) * view.getMeasuredHeight());
            }
            super.drawChild(canvas, view, j3);
            canvas.restore();
            float f12 = hsVar.f38509w;
            if (f12 < 1.0f) {
                canvas.save();
                float f13 = 1.0f - f12;
                float f14 = (f13 * 0.5f) + 0.5f;
                canvas.scale(f14, f14, (hsVar.getMeasuredWidth() / 2.0f) + hsVar.getX(), (hsVar.getMeasuredHeight() / 2.0f) + hsVar.getY());
                Paint paint = this.f37831b;
                paint.setAlpha((int) (f13 * 255.0f));
                canvas.drawBitmap(hsVar.f38511y, hsVar.getX(), hsVar.getY(), paint);
                canvas.restore();
                return true;
            }
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public String getCode() {
        if (this.f37834f == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            hs[] hsVarArr = this.f37834f;
            if (i10 < hsVarArr.length) {
                sb2.append(hf.b.d(hsVarArr[i10].getText().toString(), false));
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
        this.f37832c = dp;
        this.f37830a.setStrokeWidth(dp);
    }

    public void setCode(String str) {
        this.f37834f[0].setText(str);
    }

    public void setText(String str) {
        c(str, false);
    }
}
