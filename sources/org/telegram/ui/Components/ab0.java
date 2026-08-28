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
public final class ab0 extends View {
    public final ArrayList f26746a;
    public float f26747b;
    public final Paint f26748c;
    public final int d;
    public final int f26749e;
    public Drawable f26750f;
    public float h;
    public float f26751n;
    public final RectF f26752r;
    public Utilities.Callback f26753s;

    public ab0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int[] iArr;
        this.f26746a = new ArrayList();
        Paint paint = new Paint(1);
        this.f26748c = paint;
        this.h = AndroidUtilities.dp(14.0f);
        this.f26751n = AndroidUtilities.dp(0.0f);
        this.f26752r = new RectF();
        if (org.telegram.ui.ActionBar.f6.I.q()) {
            this.d = -1862270977;
            this.f26749e = -1325400065;
            paint.setColor(285212671);
            return;
        }
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Nd, b6Var);
        if (b6Var instanceof org.telegram.ui.on) {
            org.telegram.ui.on onVar = (org.telegram.ui.on) b6Var;
            if ((onVar.d() instanceof jb0) && (iArr = ((jb0) onVar.d()).f29686a) != null) {
                v02 = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(iArr[0], iArr[1]), AndroidUtilities.getAverageColor(iArr[2], iArr[3]));
            }
        }
        this.d = org.telegram.ui.ActionBar.f6.c(-1606201797, v02);
        this.f26749e = org.telegram.ui.ActionBar.f6.c(-448573893, v02);
        paint.setColor(org.telegram.ui.ActionBar.f6.c(814980216, v02));
    }

    public final void a(int i9, String str) {
        this.f26746a.add(new za0(i9, str));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        ArrayList arrayList = this.f26746a;
        boolean z11 = true;
        if (arrayList.size() > 1) {
            float f10 = this.f26747b;
            double d = f10;
            int floor = (int) Math.floor(d);
            if (floor >= 0 && floor < arrayList.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int ceil = (int) Math.ceil(d);
            z11 = (ceil < 0 || ceil >= arrayList.size()) ? false : false;
            RectF rectF = this.f26752r;
            if (z10 && z11) {
                AndroidUtilities.lerp(((za0) arrayList.get(floor)).f35266c, ((za0) arrayList.get(ceil)).f35266c, f10 - floor, rectF);
            } else if (z10) {
                rectF.set(((za0) arrayList.get(floor)).f35266c);
            } else if (z11) {
                rectF.set(((za0) arrayList.get(ceil)).f35266c);
            }
            Drawable drawable = this.f26750f;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            if (z10 || z11) {
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.f26748c);
            }
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                za0 za0Var = (za0) arrayList.get(i9);
                za0Var.f35265b.c(za0Var.f35266c.left + this.h, getMeasuredHeight() / 2.0f, 1.0f, i0.a.d(1.0f - Math.abs(f10 - i9), this.d, this.f26749e), canvas);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i9;
        Utilities.Callback callback;
        ArrayList arrayList = this.f26746a;
        if (arrayList.size() > 1) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    if (((za0) arrayList.get(i10)).d.contains(x10, y10)) {
                        i9 = ((za0) arrayList.get(i10)).f35264a;
                        break;
                    }
                    i10++;
                } else {
                    i9 = -1;
                    break;
                }
            }
            if (motionEvent.getAction() == 0) {
                if (i9 != -1) {
                    return true;
                }
            } else if (motionEvent.getAction() == 1 && i9 != -1 && (callback = this.f26753s) != null) {
                callback.run(Integer.valueOf(i9));
            }
        }
        return false;
    }

    public int getColor() {
        return this.d;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        ArrayList arrayList;
        super.onMeasure(i9, i10);
        this.h = AndroidUtilities.dp(14.0f);
        float f10 = 0.0f;
        this.f26751n = AndroidUtilities.dp(0.0f);
        int i11 = 0;
        while (true) {
            arrayList = this.f26746a;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 > 0) {
                f10 += this.f26751n;
            }
            f10 += ((za0) arrayList.get(i11)).f35265b.l() + this.h + this.h;
            i11++;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float dp = (measuredHeight - AndroidUtilities.dp(26.0f)) / 2.0f;
        float dp2 = (AndroidUtilities.dp(26.0f) + measuredHeight) / 2.0f;
        float f11 = measuredWidth;
        float f12 = (f11 - f10) / 2.0f;
        float f13 = f12;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            float l10 = ((za0) arrayList.get(i12)).f35265b.l() + this.h + this.h;
            ((za0) arrayList.get(i12)).f35266c.set(f13, dp, f13 + l10, dp2);
            ((za0) arrayList.get(i12)).d.set(((za0) arrayList.get(i12)).f35266c);
            ((za0) arrayList.get(i12)).d.inset((-this.f26751n) / 2.0f, -dp);
            f13 += l10 + this.f26751n;
        }
        Drawable drawable = this.f26750f;
        if (drawable != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            drawable.getPadding(rect);
            int i13 = measuredHeight / 2;
            this.f26750f.setBounds((((int) f12) - AndroidUtilities.dp(3.0f)) - rect.left, (i13 - AndroidUtilities.dp(16.0f)) - rect.top, AndroidUtilities.dp(3.0f) + ((int) ((f11 + f10) / 2.0f)) + rect.right, AndroidUtilities.dp(16.0f) + i13 + rect.bottom);
        }
    }

    @Override
    public void setBackground(Drawable drawable) {
        this.f26750f = drawable;
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.f26753s = callback;
    }

    public void setSelectedTab(float f10) {
        this.f26747b = f10;
        invalidate();
    }
}
