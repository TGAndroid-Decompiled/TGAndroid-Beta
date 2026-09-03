package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class vb0 extends View {
    public final ArrayList f29447a;
    public float f29448b;
    public final Paint f29449c;
    public final int d;
    public final int e;
    public Drawable f29450f;
    public float h;
    public float f29451n;
    public final RectF f29452r;
    public Utilities.Callback f29453s;

    public vb0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int[] iArr;
        this.f29447a = new ArrayList();
        Paint paint = new Paint(1);
        this.f29449c = paint;
        this.h = AndroidUtilities.dp(14.0f);
        this.f29451n = AndroidUtilities.dp(0.0f);
        this.f29452r = new RectF();
        if (org.telegram.ui.ActionBar.j6.I.q()) {
            this.d = -1862270977;
            this.e = -1325400065;
            paint.setColor(285212671);
            return;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Nd, f6Var);
        if (f6Var instanceof org.telegram.ui.xn) {
            org.telegram.ui.xn xnVar = (org.telegram.ui.xn) f6Var;
            if ((xnVar.d() instanceof ec0) && (iArr = ((ec0) xnVar.d()).f24569a) != null) {
                v02 = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(iArr[0], iArr[1]), AndroidUtilities.getAverageColor(iArr[2], iArr[3]));
            }
        }
        this.d = org.telegram.ui.ActionBar.j6.c(-1606201797, v02);
        this.e = org.telegram.ui.ActionBar.j6.c(-448573893, v02);
        paint.setColor(org.telegram.ui.ActionBar.j6.c(814980216, v02));
    }

    public final void a(int i10, String str) {
        this.f29447a.add(new ub0(i10, str));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        ArrayList arrayList = this.f29447a;
        boolean z10 = true;
        if (arrayList.size() > 1) {
            float f10 = this.f29448b;
            double d = f10;
            int floor = (int) Math.floor(d);
            if (floor >= 0 && floor < arrayList.size()) {
                z4 = true;
            } else {
                z4 = false;
            }
            int ceil = (int) Math.ceil(d);
            z10 = (ceil < 0 || ceil >= arrayList.size()) ? false : false;
            RectF rectF = this.f29452r;
            if (z4 && z10) {
                AndroidUtilities.lerp(((ub0) arrayList.get(floor)).f29171c, ((ub0) arrayList.get(ceil)).f29171c, f10 - floor, rectF);
            } else if (z4) {
                rectF.set(((ub0) arrayList.get(floor)).f29171c);
            } else if (z10) {
                rectF.set(((ub0) arrayList.get(ceil)).f29171c);
            }
            Drawable drawable = this.f29450f;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            if (z4 || z10) {
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.f29449c);
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ub0 ub0Var = (ub0) arrayList.get(i10);
                ub0Var.f29170b.c(ub0Var.f29171c.left + this.h, getMeasuredHeight() / 2.0f, 1.0f, i0.a.d(1.0f - Math.abs(f10 - i10), this.d, this.e), canvas);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        Utilities.Callback callback;
        ArrayList arrayList = this.f29447a;
        if (arrayList.size() > 1) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int i11 = 0;
            while (true) {
                if (i11 < arrayList.size()) {
                    if (((ub0) arrayList.get(i11)).d.contains(x10, y10)) {
                        i10 = ((ub0) arrayList.get(i11)).f29169a;
                        break;
                    }
                    i11++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (motionEvent.getAction() == 0) {
                if (i10 != -1) {
                    return true;
                }
            } else if (motionEvent.getAction() == 1 && i10 != -1 && (callback = this.f29453s) != null) {
                callback.run(Integer.valueOf(i10));
            }
        }
        return false;
    }

    public int getColor() {
        return this.d;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList;
        super.onMeasure(i10, i11);
        this.h = AndroidUtilities.dp(14.0f);
        float f10 = 0.0f;
        this.f29451n = AndroidUtilities.dp(0.0f);
        int i12 = 0;
        while (true) {
            arrayList = this.f29447a;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (i12 > 0) {
                f10 += this.f29451n;
            }
            f10 += ((ub0) arrayList.get(i12)).f29170b.l() + this.h + this.h;
            i12++;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float dp = (measuredHeight - AndroidUtilities.dp(26.0f)) / 2.0f;
        float dp2 = (AndroidUtilities.dp(26.0f) + measuredHeight) / 2.0f;
        float f11 = measuredWidth;
        float f12 = (f11 - f10) / 2.0f;
        float f13 = f12;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            float l10 = ((ub0) arrayList.get(i13)).f29170b.l() + this.h + this.h;
            ((ub0) arrayList.get(i13)).f29171c.set(f13, dp, f13 + l10, dp2);
            ((ub0) arrayList.get(i13)).d.set(((ub0) arrayList.get(i13)).f29171c);
            ((ub0) arrayList.get(i13)).d.inset((-this.f29451n) / 2.0f, -dp);
            f13 += l10 + this.f29451n;
        }
        Drawable drawable = this.f29450f;
        if (drawable != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            drawable.getPadding(rect);
            int i14 = measuredHeight / 2;
            this.f29450f.setBounds((((int) f12) - AndroidUtilities.dp(3.0f)) - rect.left, (i14 - AndroidUtilities.dp(16.0f)) - rect.top, AndroidUtilities.dp(3.0f) + ((int) ((f11 + f10) / 2.0f)) + rect.right, AndroidUtilities.dp(16.0f) + i14 + rect.bottom);
        }
    }

    @Override
    public void setBackground(Drawable drawable) {
        this.f29450f = drawable;
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.f29453s = callback;
    }

    public void setSelectedTab(float f10) {
        this.f29448b = f10;
        invalidate();
    }
}
