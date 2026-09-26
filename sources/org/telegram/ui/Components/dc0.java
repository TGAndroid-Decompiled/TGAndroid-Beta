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
public final class dc0 extends View {
    public final ArrayList f23585a;
    public float f23586b;
    public final Paint f23587c;
    public final int d;
    public final int e;
    public Drawable f23588f;
    public float h;
    public float f23589n;
    public final RectF f23590r;
    public Utilities.Callback f23591s;

    public dc0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int[] iArr;
        this.f23585a = new ArrayList();
        Paint paint = new Paint(1);
        this.f23587c = paint;
        this.h = AndroidUtilities.dp(14.0f);
        this.f23589n = AndroidUtilities.dp(0.0f);
        this.f23590r = new RectF();
        if (org.telegram.ui.ActionBar.h6.I.q()) {
            this.d = -1862270977;
            this.e = -1325400065;
            paint.setColor(285212671);
            return;
        }
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Nd, d6Var);
        if (d6Var instanceof org.telegram.ui.un) {
            org.telegram.ui.un unVar = (org.telegram.ui.un) d6Var;
            if ((unVar.d() instanceof mc0) && (iArr = ((mc0) unVar.d()).f26431a) != null) {
                v02 = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(iArr[0], iArr[1]), AndroidUtilities.getAverageColor(iArr[2], iArr[3]));
            }
        }
        this.d = org.telegram.ui.ActionBar.h6.c(-1606201797, v02);
        this.e = org.telegram.ui.ActionBar.h6.c(-448573893, v02);
        paint.setColor(org.telegram.ui.ActionBar.h6.c(814980216, v02));
    }

    public final void a(int i10, String str) {
        this.f23585a.add(new cc0(i10, str));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        ArrayList arrayList = this.f23585a;
        boolean z11 = true;
        if (arrayList.size() > 1) {
            float f7 = this.f23586b;
            double d = f7;
            int floor = (int) Math.floor(d);
            if (floor >= 0 && floor < arrayList.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int ceil = (int) Math.ceil(d);
            z11 = (ceil < 0 || ceil >= arrayList.size()) ? false : false;
            RectF rectF = this.f23590r;
            if (z10 && z11) {
                AndroidUtilities.lerp(((cc0) arrayList.get(floor)).f23310c, ((cc0) arrayList.get(ceil)).f23310c, f7 - floor, rectF);
            } else if (z10) {
                rectF.set(((cc0) arrayList.get(floor)).f23310c);
            } else if (z11) {
                rectF.set(((cc0) arrayList.get(ceil)).f23310c);
            }
            Drawable drawable = this.f23588f;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            if (z10 || z11) {
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.f23587c);
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                cc0 cc0Var = (cc0) arrayList.get(i10);
                cc0Var.f23309b.c(cc0Var.f23310c.left + this.h, getMeasuredHeight() / 2.0f, 1.0f, i0.a.d(1.0f - Math.abs(f7 - i10), this.d, this.e), canvas);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        Utilities.Callback callback;
        ArrayList arrayList = this.f23585a;
        if (arrayList.size() > 1) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int i11 = 0;
            while (true) {
                if (i11 < arrayList.size()) {
                    if (((cc0) arrayList.get(i11)).d.contains(x10, y3)) {
                        i10 = ((cc0) arrayList.get(i11)).f23308a;
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
            } else if (motionEvent.getAction() == 1 && i10 != -1 && (callback = this.f23591s) != null) {
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
        this.f23589n = AndroidUtilities.dp(0.0f);
        int i12 = 0;
        while (true) {
            arrayList = this.f23585a;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (i12 > 0) {
                f7 += this.f23589n;
            }
            f7 += ((cc0) arrayList.get(i12)).f23309b.l() + this.h + this.h;
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
            float l4 = ((cc0) arrayList.get(i13)).f23309b.l() + this.h + this.h;
            ((cc0) arrayList.get(i13)).f23310c.set(f12, dp, f12 + l4, dp2);
            ((cc0) arrayList.get(i13)).d.set(((cc0) arrayList.get(i13)).f23310c);
            ((cc0) arrayList.get(i13)).d.inset((-this.f23589n) / 2.0f, -dp);
            f12 += l4 + this.f23589n;
        }
        Drawable drawable = this.f23588f;
        if (drawable != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            drawable.getPadding(rect);
            int i14 = measuredHeight / 2;
            this.f23588f.setBounds((((int) f11) - AndroidUtilities.dp(3.0f)) - rect.left, (i14 - AndroidUtilities.dp(16.0f)) - rect.top, AndroidUtilities.dp(3.0f) + ((int) ((f10 + f7) / 2.0f)) + rect.right, AndroidUtilities.dp(16.0f) + i14 + rect.bottom);
        }
    }

    @Override
    public void setBackground(Drawable drawable) {
        this.f23588f = drawable;
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.f23591s = callback;
    }

    public void setSelectedTab(float f7) {
        this.f23586b = f7;
        invalidate();
    }
}
