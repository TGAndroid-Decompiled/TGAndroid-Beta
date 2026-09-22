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
public final class tb0 extends View {
    public final ArrayList f28085a;
    public float f28086b;
    public final Paint f28087c;
    public final int d;
    public final int e;
    public Drawable f28088f;
    public float h;
    public float f28089n;
    public final RectF f28090r;
    public Utilities.Callback f28091s;

    public tb0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int[] iArr;
        this.f28085a = new ArrayList();
        Paint paint = new Paint(1);
        this.f28087c = paint;
        this.h = AndroidUtilities.dp(14.0f);
        this.f28089n = AndroidUtilities.dp(0.0f);
        this.f28090r = new RectF();
        if (org.telegram.ui.ActionBar.i6.I.q()) {
            this.d = -1862270977;
            this.e = -1325400065;
            paint.setColor(285212671);
            return;
        }
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Nd, e6Var);
        if (e6Var instanceof org.telegram.ui.zn) {
            org.telegram.ui.zn znVar = (org.telegram.ui.zn) e6Var;
            if ((znVar.d() instanceof cc0) && (iArr = ((cc0) znVar.d()).f23043a) != null) {
                v02 = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(iArr[0], iArr[1]), AndroidUtilities.getAverageColor(iArr[2], iArr[3]));
            }
        }
        this.d = org.telegram.ui.ActionBar.i6.c(-1606201797, v02);
        this.e = org.telegram.ui.ActionBar.i6.c(-448573893, v02);
        paint.setColor(org.telegram.ui.ActionBar.i6.c(814980216, v02));
    }

    public final void a(int i10, String str) {
        this.f28085a.add(new sb0(i10, str));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        ArrayList arrayList = this.f28085a;
        boolean z11 = true;
        if (arrayList.size() > 1) {
            float f7 = this.f28086b;
            double d = f7;
            int floor = (int) Math.floor(d);
            if (floor >= 0 && floor < arrayList.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int ceil = (int) Math.ceil(d);
            z11 = (ceil < 0 || ceil >= arrayList.size()) ? false : false;
            RectF rectF = this.f28090r;
            if (z10 && z11) {
                AndroidUtilities.lerp(((sb0) arrayList.get(floor)).f27823c, ((sb0) arrayList.get(ceil)).f27823c, f7 - floor, rectF);
            } else if (z10) {
                rectF.set(((sb0) arrayList.get(floor)).f27823c);
            } else if (z11) {
                rectF.set(((sb0) arrayList.get(ceil)).f27823c);
            }
            Drawable drawable = this.f28088f;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            if (z10 || z11) {
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.f28087c);
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                sb0 sb0Var = (sb0) arrayList.get(i10);
                sb0Var.f27822b.c(sb0Var.f27823c.left + this.h, getMeasuredHeight() / 2.0f, 1.0f, i0.a.d(1.0f - Math.abs(f7 - i10), this.d, this.e), canvas);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        Utilities.Callback callback;
        ArrayList arrayList = this.f28085a;
        if (arrayList.size() > 1) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int i11 = 0;
            while (true) {
                if (i11 < arrayList.size()) {
                    if (((sb0) arrayList.get(i11)).d.contains(x10, y3)) {
                        i10 = ((sb0) arrayList.get(i11)).f27821a;
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
            } else if (motionEvent.getAction() == 1 && i10 != -1 && (callback = this.f28091s) != null) {
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
        float f7 = 0.0f;
        this.f28089n = AndroidUtilities.dp(0.0f);
        int i12 = 0;
        while (true) {
            arrayList = this.f28085a;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (i12 > 0) {
                f7 += this.f28089n;
            }
            f7 += ((sb0) arrayList.get(i12)).f27822b.l() + this.h + this.h;
            i12++;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float dp = (measuredHeight - AndroidUtilities.dp(26.0f)) / 2.0f;
        float dp2 = (AndroidUtilities.dp(26.0f) + measuredHeight) / 2.0f;
        float f10 = measuredWidth;
        float f11 = (f10 - f7) / 2.0f;
        float f12 = f11;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            float l4 = ((sb0) arrayList.get(i13)).f27822b.l() + this.h + this.h;
            ((sb0) arrayList.get(i13)).f27823c.set(f12, dp, f12 + l4, dp2);
            ((sb0) arrayList.get(i13)).d.set(((sb0) arrayList.get(i13)).f27823c);
            ((sb0) arrayList.get(i13)).d.inset((-this.f28089n) / 2.0f, -dp);
            f12 += l4 + this.f28089n;
        }
        Drawable drawable = this.f28088f;
        if (drawable != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            drawable.getPadding(rect);
            int i14 = measuredHeight / 2;
            this.f28088f.setBounds((((int) f11) - AndroidUtilities.dp(3.0f)) - rect.left, (i14 - AndroidUtilities.dp(16.0f)) - rect.top, AndroidUtilities.dp(3.0f) + ((int) ((f10 + f7) / 2.0f)) + rect.right, AndroidUtilities.dp(16.0f) + i14 + rect.bottom);
        }
    }

    @Override
    public void setBackground(Drawable drawable) {
        this.f28088f = drawable;
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.f28091s = callback;
    }

    public void setSelectedTab(float f7) {
        this.f28086b = f7;
        invalidate();
    }
}
