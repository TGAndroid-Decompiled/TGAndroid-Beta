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
public final class pb0 extends View {
    public final ArrayList f31633a;
    public float f31634b;
    public final Paint f31635c;
    public final int d;
    public final int f31636e;
    public Drawable f31637f;
    public float h;
    public float f31638n;
    public final RectF f31639r;
    public Utilities.Callback f31640s;

    public pb0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int[] iArr;
        this.f31633a = new ArrayList();
        Paint paint = new Paint(1);
        this.f31635c = paint;
        this.h = AndroidUtilities.dp(14.0f);
        this.f31638n = AndroidUtilities.dp(0.0f);
        this.f31639r = new RectF();
        if (org.telegram.ui.ActionBar.g6.I.q()) {
            this.d = -1862270977;
            this.f31636e = -1325400065;
            paint.setColor(285212671);
            return;
        }
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Nd, c6Var);
        if (c6Var instanceof org.telegram.ui.rn) {
            org.telegram.ui.rn rnVar = (org.telegram.ui.rn) c6Var;
            if ((rnVar.d() instanceof yb0) && (iArr = ((yb0) rnVar.d()).f35014a) != null) {
                v02 = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(iArr[0], iArr[1]), AndroidUtilities.getAverageColor(iArr[2], iArr[3]));
            }
        }
        this.d = org.telegram.ui.ActionBar.g6.c(-1606201797, v02);
        this.f31636e = org.telegram.ui.ActionBar.g6.c(-448573893, v02);
        paint.setColor(org.telegram.ui.ActionBar.g6.c(814980216, v02));
    }

    public final void a(int i10, String str) {
        this.f31633a.add(new ob0(i10, str));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        ArrayList arrayList = this.f31633a;
        boolean z11 = true;
        if (arrayList.size() > 1) {
            float f9 = this.f31634b;
            double d = f9;
            int floor = (int) Math.floor(d);
            if (floor >= 0 && floor < arrayList.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int ceil = (int) Math.ceil(d);
            z11 = (ceil < 0 || ceil >= arrayList.size()) ? false : false;
            RectF rectF = this.f31639r;
            if (z10 && z11) {
                AndroidUtilities.lerp(((ob0) arrayList.get(floor)).f31333c, ((ob0) arrayList.get(ceil)).f31333c, f9 - floor, rectF);
            } else if (z10) {
                rectF.set(((ob0) arrayList.get(floor)).f31333c);
            } else if (z11) {
                rectF.set(((ob0) arrayList.get(ceil)).f31333c);
            }
            Drawable drawable = this.f31637f;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            if (z10 || z11) {
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.f31635c);
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ob0 ob0Var = (ob0) arrayList.get(i10);
                ob0Var.f31332b.c(ob0Var.f31333c.left + this.h, getMeasuredHeight() / 2.0f, 1.0f, i0.a.d(1.0f - Math.abs(f9 - i10), this.d, this.f31636e), canvas);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        Utilities.Callback callback;
        ArrayList arrayList = this.f31633a;
        if (arrayList.size() > 1) {
            float x4 = motionEvent.getX();
            float y8 = motionEvent.getY();
            int i11 = 0;
            while (true) {
                if (i11 < arrayList.size()) {
                    if (((ob0) arrayList.get(i11)).d.contains(x4, y8)) {
                        i10 = ((ob0) arrayList.get(i11)).f31331a;
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
            } else if (motionEvent.getAction() == 1 && i10 != -1 && (callback = this.f31640s) != null) {
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
        float f9 = 0.0f;
        this.f31638n = AndroidUtilities.dp(0.0f);
        int i12 = 0;
        while (true) {
            arrayList = this.f31633a;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (i12 > 0) {
                f9 += this.f31638n;
            }
            f9 += ((ob0) arrayList.get(i12)).f31332b.l() + this.h + this.h;
            i12++;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float dp = (measuredHeight - AndroidUtilities.dp(26.0f)) / 2.0f;
        float dp2 = (AndroidUtilities.dp(26.0f) + measuredHeight) / 2.0f;
        float f10 = measuredWidth;
        float f11 = (f10 - f9) / 2.0f;
        float f12 = f11;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            float l10 = ((ob0) arrayList.get(i13)).f31332b.l() + this.h + this.h;
            ((ob0) arrayList.get(i13)).f31333c.set(f12, dp, f12 + l10, dp2);
            ((ob0) arrayList.get(i13)).d.set(((ob0) arrayList.get(i13)).f31333c);
            ((ob0) arrayList.get(i13)).d.inset((-this.f31638n) / 2.0f, -dp);
            f12 += l10 + this.f31638n;
        }
        Drawable drawable = this.f31637f;
        if (drawable != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            drawable.getPadding(rect);
            int i14 = measuredHeight / 2;
            this.f31637f.setBounds((((int) f11) - AndroidUtilities.dp(3.0f)) - rect.left, (i14 - AndroidUtilities.dp(16.0f)) - rect.top, AndroidUtilities.dp(3.0f) + ((int) ((f10 + f9) / 2.0f)) + rect.right, AndroidUtilities.dp(16.0f) + i14 + rect.bottom);
        }
    }

    @Override
    public void setBackground(Drawable drawable) {
        this.f31637f = drawable;
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.f31640s = callback;
    }

    public void setSelectedTab(float f9) {
        this.f31634b = f9;
        invalidate();
    }
}
