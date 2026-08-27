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

public final class eb0 extends View {

    public final ArrayList f28004a;

    public float f28005b;

    public final Paint f28006c;
    public final int d;

    public final int f28007e;

    public Drawable f28008f;
    public float h;

    public float f28009n;

    public final RectF f28010r;

    public Utilities.Callback f28011s;

    public eb0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        int[] iArr;
        super(context);
        this.f28004a = new ArrayList();
        Paint paint = new Paint(1);
        this.f28006c = paint;
        this.h = AndroidUtilities.dp(14.0f);
        this.f28009n = AndroidUtilities.dp(0.0f);
        this.f28010r = new RectF();
        if (org.telegram.ui.ActionBar.g6.I.q()) {
            this.d = -1862270977;
            this.f28007e = -1325400065;
            paint.setColor(285212671);
            return;
        }
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Nd, c6Var);
        if (c6Var instanceof org.telegram.ui.pn) {
            org.telegram.ui.pn pnVar = (org.telegram.ui.pn) c6Var;
            if ((pnVar.d() instanceof nb0) && (iArr = ((nb0) pnVar.d()).f30917a) != null) {
                iV0 = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(iArr[0], iArr[1]), AndroidUtilities.getAverageColor(iArr[2], iArr[3]));
            }
        }
        this.d = org.telegram.ui.ActionBar.g6.c(-1606201797, iV0);
        this.f28007e = org.telegram.ui.ActionBar.g6.c(-448573893, iV0);
        paint.setColor(org.telegram.ui.ActionBar.g6.c(814980216, iV0));
    }

    public final void a(int i10, String str) {
        this.f28004a.add(new db0(i10, str));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f28004a;
        if (arrayList.size() <= 1) {
            return;
        }
        float f10 = this.f28005b;
        double d = f10;
        int iFloor = (int) Math.floor(d);
        boolean z10 = iFloor >= 0 && iFloor < arrayList.size();
        int iCeil = (int) Math.ceil(d);
        boolean z11 = iCeil >= 0 && iCeil < arrayList.size();
        RectF rectF = this.f28010r;
        if (z10 && z11) {
            AndroidUtilities.lerp(((db0) arrayList.get(iFloor)).f27705c, ((db0) arrayList.get(iCeil)).f27705c, f10 - iFloor, rectF);
        } else if (z10) {
            rectF.set(((db0) arrayList.get(iFloor)).f27705c);
        } else if (z11) {
            rectF.set(((db0) arrayList.get(iCeil)).f27705c);
        }
        Drawable drawable = this.f28008f;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        if (z10 || z11) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.f28006c);
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            db0 db0Var = (db0) arrayList.get(i10);
            db0Var.f27704b.c(db0Var.f27705c.left + this.h, getMeasuredHeight() / 2.0f, 1.0f, i0.b.d(1.0f - Math.abs(f10 - i10), this.d, this.f28007e), canvas);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        Utilities.Callback callback;
        ArrayList arrayList = this.f28004a;
        if (arrayList.size() > 1) {
            float x8 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    i10 = -1;
                    break;
                }
                if (((db0) arrayList.get(i11)).d.contains(x8, y10)) {
                    i10 = ((db0) arrayList.get(i11)).f27703a;
                    break;
                }
                i11++;
            }
            if (motionEvent.getAction() == 0) {
                if (i10 != -1) {
                    return true;
                }
            } else if (motionEvent.getAction() == 1 && i10 != -1 && (callback = this.f28011s) != null) {
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
        float fL = 0.0f;
        this.f28009n = AndroidUtilities.dp(0.0f);
        int i12 = 0;
        while (true) {
            arrayList = this.f28004a;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (i12 > 0) {
                fL += this.f28009n;
            }
            fL += ((db0) arrayList.get(i12)).f27704b.l() + this.h + this.h;
            i12++;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float fDp = (measuredHeight - AndroidUtilities.dp(26.0f)) / 2.0f;
        float fDp2 = (AndroidUtilities.dp(26.0f) + measuredHeight) / 2.0f;
        float f10 = measuredWidth;
        float f11 = (f10 - fL) / 2.0f;
        float f12 = f11;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            float fL2 = ((db0) arrayList.get(i13)).f27704b.l() + this.h + this.h;
            ((db0) arrayList.get(i13)).f27705c.set(f12, fDp, f12 + fL2, fDp2);
            ((db0) arrayList.get(i13)).d.set(((db0) arrayList.get(i13)).f27705c);
            ((db0) arrayList.get(i13)).d.inset((-this.f28009n) / 2.0f, -fDp);
            f12 += fL2 + this.f28009n;
        }
        Drawable drawable = this.f28008f;
        if (drawable != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            drawable.getPadding(rect);
            int i14 = measuredHeight / 2;
            this.f28008f.setBounds((((int) f11) - AndroidUtilities.dp(3.0f)) - rect.left, (i14 - AndroidUtilities.dp(16.0f)) - rect.top, AndroidUtilities.dp(3.0f) + ((int) ((f10 + fL) / 2.0f)) + rect.right, AndroidUtilities.dp(16.0f) + i14 + rect.bottom);
        }
    }

    @Override
    public void setBackground(Drawable drawable) {
        this.f28008f = drawable;
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.f28011s = callback;
    }

    public void setSelectedTab(float f10) {
        this.f28005b = f10;
        invalidate();
    }
}
