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
public final class ec0 extends View {
    public final ArrayList f23928a;
    public float f23929b;
    public final Paint f23930c;
    public final int d;
    public final int e;
    public Drawable f23931f;
    public float h;
    public float f23932n;
    public final RectF f23933r;
    public Utilities.Callback f23934s;

    public ec0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int[] iArr;
        this.f23928a = new ArrayList();
        Paint paint = new Paint(1);
        this.f23930c = paint;
        this.h = AndroidUtilities.dp(14.0f);
        this.f23932n = AndroidUtilities.dp(0.0f);
        this.f23933r = new RectF();
        if (org.telegram.ui.ActionBar.j6.I.q()) {
            this.d = -1862270977;
            this.e = -1325400065;
            paint.setColor(285212671);
            return;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Nd, f6Var);
        if (f6Var instanceof org.telegram.ui.xn) {
            org.telegram.ui.xn xnVar = (org.telegram.ui.xn) f6Var;
            if ((xnVar.d() instanceof nc0) && (iArr = ((nc0) xnVar.d()).f26725a) != null) {
                v02 = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(iArr[0], iArr[1]), AndroidUtilities.getAverageColor(iArr[2], iArr[3]));
            }
        }
        this.d = org.telegram.ui.ActionBar.j6.c(-1606201797, v02);
        this.e = org.telegram.ui.ActionBar.j6.c(-448573893, v02);
        paint.setColor(org.telegram.ui.ActionBar.j6.c(814980216, v02));
    }

    public final void a(int i10, String str) {
        this.f23928a.add(new dc0(i10, str));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        ArrayList arrayList = this.f23928a;
        boolean z11 = true;
        if (arrayList.size() > 1) {
            float f7 = this.f23929b;
            double d = f7;
            int floor = (int) Math.floor(d);
            if (floor >= 0 && floor < arrayList.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int ceil = (int) Math.ceil(d);
            z11 = (ceil < 0 || ceil >= arrayList.size()) ? false : false;
            RectF rectF = this.f23933r;
            if (z10 && z11) {
                AndroidUtilities.lerp(((dc0) arrayList.get(floor)).f23648c, ((dc0) arrayList.get(ceil)).f23648c, f7 - floor, rectF);
            } else if (z10) {
                rectF.set(((dc0) arrayList.get(floor)).f23648c);
            } else if (z11) {
                rectF.set(((dc0) arrayList.get(ceil)).f23648c);
            }
            Drawable drawable = this.f23931f;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            if (z10 || z11) {
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.f23930c);
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                dc0 dc0Var = (dc0) arrayList.get(i10);
                dc0Var.f23647b.c(dc0Var.f23648c.left + this.h, getMeasuredHeight() / 2.0f, 1.0f, i0.a.d(1.0f - Math.abs(f7 - i10), this.d, this.e), canvas);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        Utilities.Callback callback;
        ArrayList arrayList = this.f23928a;
        if (arrayList.size() > 1) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int i11 = 0;
            while (true) {
                if (i11 < arrayList.size()) {
                    if (((dc0) arrayList.get(i11)).d.contains(x10, y3)) {
                        i10 = ((dc0) arrayList.get(i11)).f23646a;
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
            } else if (motionEvent.getAction() == 1 && i10 != -1 && (callback = this.f23934s) != null) {
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
        this.f23932n = AndroidUtilities.dp(0.0f);
        int i12 = 0;
        while (true) {
            arrayList = this.f23928a;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (i12 > 0) {
                f7 += this.f23932n;
            }
            f7 += ((dc0) arrayList.get(i12)).f23647b.l() + this.h + this.h;
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
            float l4 = ((dc0) arrayList.get(i13)).f23647b.l() + this.h + this.h;
            ((dc0) arrayList.get(i13)).f23648c.set(f12, dp, f12 + l4, dp2);
            ((dc0) arrayList.get(i13)).d.set(((dc0) arrayList.get(i13)).f23648c);
            ((dc0) arrayList.get(i13)).d.inset((-this.f23932n) / 2.0f, -dp);
            f12 += l4 + this.f23932n;
        }
        Drawable drawable = this.f23931f;
        if (drawable != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            drawable.getPadding(rect);
            int i14 = measuredHeight / 2;
            this.f23931f.setBounds((((int) f11) - AndroidUtilities.dp(3.0f)) - rect.left, (i14 - AndroidUtilities.dp(16.0f)) - rect.top, AndroidUtilities.dp(3.0f) + ((int) ((f10 + f7) / 2.0f)) + rect.right, AndroidUtilities.dp(16.0f) + i14 + rect.bottom);
        }
    }

    @Override
    public void setBackground(Drawable drawable) {
        this.f23931f = drawable;
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.f23934s = callback;
    }

    public void setSelectedTab(float f7) {
        this.f23929b = f7;
        invalidate();
    }
}
