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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class lc0 extends View implements org.telegram.ui.ActionBar.p6 {
    public final ArrayList f30163a;
    public float f30164b;
    public final org.telegram.ui.ActionBar.u6 f30165c;
    public final Paint d;
    public int e;
    public int f30166f;
    public Drawable h;
    public float f30167n;
    public float f30168r;
    public final RectF f30169s;
    public Utilities.Callback v;

    public lc0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f30163a = new ArrayList();
        this.d = new Paint(1);
        this.f30167n = AndroidUtilities.dp(14.0f);
        this.f30168r = AndroidUtilities.dp(0.0f);
        this.f30169s = new RectF();
        this.f30165c = u6Var;
        b();
    }

    public final void a(int i10, String str) {
        this.f30163a.add(new kc0(i10, str));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Nd));
    }

    public final void b() {
        int[] iArr;
        boolean q5 = org.telegram.ui.ActionBar.y6.I.q();
        Paint paint = this.d;
        if (q5) {
            this.e = -1862270977;
            this.f30166f = -1325400065;
            paint.setColor(285212671);
            return;
        }
        int i10 = org.telegram.ui.ActionBar.y6.Nd;
        org.telegram.ui.ActionBar.u6 u6Var = this.f30165c;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        if ((u6Var instanceof org.telegram.ui.sn) && (((org.telegram.ui.sn) u6Var).l() instanceof uc0) && (iArr = ((uc0) ((org.telegram.ui.sn) u6Var).l()).f33350a) != null) {
            w02 = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(iArr[0], iArr[1]), AndroidUtilities.getAverageColor(iArr[2], iArr[3]));
        }
        this.e = org.telegram.ui.ActionBar.y6.c(-1606201797, w02);
        this.f30166f = org.telegram.ui.ActionBar.y6.c(-448573893, w02);
        paint.setColor(org.telegram.ui.ActionBar.y6.c(814980216, w02));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        ArrayList arrayList = this.f30163a;
        boolean z11 = true;
        if (arrayList.size() > 1) {
            float f7 = this.f30164b;
            double d = f7;
            int floor = (int) Math.floor(d);
            if (floor >= 0 && floor < arrayList.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int ceil = (int) Math.ceil(d);
            z11 = (ceil < 0 || ceil >= arrayList.size()) ? false : false;
            RectF rectF = this.f30169s;
            if (z10 && z11) {
                AndroidUtilities.lerp(((kc0) arrayList.get(floor)).f29901c, ((kc0) arrayList.get(ceil)).f29901c, f7 - floor, rectF);
            } else if (z10) {
                rectF.set(((kc0) arrayList.get(floor)).f29901c);
            } else if (z11) {
                rectF.set(((kc0) arrayList.get(ceil)).f29901c);
            }
            Drawable drawable = this.h;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            if (z10 || z11) {
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.d);
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                kc0 kc0Var = (kc0) arrayList.get(i10);
                kc0Var.f29900b.c(kc0Var.f29901c.left + this.f30167n, getMeasuredHeight() / 2.0f, 1.0f, i0.a.f(1.0f - Math.abs(f7 - i10), this.e, this.f30166f), canvas);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        Utilities.Callback callback;
        ArrayList arrayList = this.f30163a;
        if (arrayList.size() > 1) {
            float x9 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int i11 = 0;
            while (true) {
                if (i11 < arrayList.size()) {
                    if (((kc0) arrayList.get(i11)).d.contains(x9, y3)) {
                        i10 = ((kc0) arrayList.get(i11)).f29899a;
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
            } else if (motionEvent.getAction() == 1 && i10 != -1 && (callback = this.v) != null) {
                callback.run(Integer.valueOf(i10));
            }
        }
        return false;
    }

    public int getColor() {
        return this.e;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList;
        super.onMeasure(i10, i11);
        this.f30167n = AndroidUtilities.dp(14.0f);
        float f7 = 0.0f;
        this.f30168r = AndroidUtilities.dp(0.0f);
        int i12 = 0;
        while (true) {
            arrayList = this.f30163a;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (i12 > 0) {
                f7 += this.f30168r;
            }
            f7 += ((kc0) arrayList.get(i12)).f29900b.l() + this.f30167n + this.f30167n;
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
            float l4 = ((kc0) arrayList.get(i13)).f29900b.l() + this.f30167n + this.f30167n;
            ((kc0) arrayList.get(i13)).f29901c.set(f12, dp, f12 + l4, dp2);
            ((kc0) arrayList.get(i13)).d.set(((kc0) arrayList.get(i13)).f29901c);
            ((kc0) arrayList.get(i13)).d.inset((-this.f30168r) / 2.0f, -dp);
            f12 += l4 + this.f30168r;
        }
        Drawable drawable = this.h;
        if (drawable != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            drawable.getPadding(rect);
            int i14 = measuredHeight / 2;
            this.h.setBounds((((int) f11) - AndroidUtilities.dp(3.0f)) - rect.left, (i14 - AndroidUtilities.dp(16.0f)) - rect.top, AndroidUtilities.dp(3.0f) + ((int) ((f10 + f7) / 2.0f)) + rect.right, AndroidUtilities.dp(16.0f) + i14 + rect.bottom);
        }
    }

    @Override
    public void setBackground(Drawable drawable) {
        this.h = drawable;
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.v = callback;
    }

    public void setSelectedTab(float f7) {
        this.f30164b = f7;
        invalidate();
    }

    @Override
    public final void updateColors() {
        try {
            b();
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
