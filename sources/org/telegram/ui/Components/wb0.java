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
public final class wb0 extends View {
    public final ArrayList f32714a;
    public float f32715b;
    public final Paint f32716c;
    public final int d;
    public final int f32717e;
    public Drawable f32718f;
    public float h;
    public float f32719n;
    public final RectF f32720r;
    public Utilities.Callback f32721s;

    public wb0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int[] iArr;
        this.f32714a = new ArrayList();
        Paint paint = new Paint(1);
        this.f32716c = paint;
        this.h = AndroidUtilities.dp(14.0f);
        this.f32719n = AndroidUtilities.dp(0.0f);
        this.f32720r = new RectF();
        if (org.telegram.ui.ActionBar.k6.I.q()) {
            this.d = -1862270977;
            this.f32717e = -1325400065;
            paint.setColor(285212671);
            return;
        }
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Nd, g6Var);
        if (g6Var instanceof org.telegram.ui.vn) {
            org.telegram.ui.vn vnVar = (org.telegram.ui.vn) g6Var;
            if ((vnVar.d() instanceof fc0) && (iArr = ((fc0) vnVar.d()).f26867a) != null) {
                v02 = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(iArr[0], iArr[1]), AndroidUtilities.getAverageColor(iArr[2], iArr[3]));
            }
        }
        this.d = org.telegram.ui.ActionBar.k6.c(-1606201797, v02);
        this.f32717e = org.telegram.ui.ActionBar.k6.c(-448573893, v02);
        paint.setColor(org.telegram.ui.ActionBar.k6.c(814980216, v02));
    }

    public final void a(int i10, String str) {
        this.f32714a.add(new vb0(i10, str));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        ArrayList arrayList = this.f32714a;
        boolean z10 = true;
        if (arrayList.size() > 1) {
            float f10 = this.f32715b;
            double d = f10;
            int floor = (int) Math.floor(d);
            if (floor >= 0 && floor < arrayList.size()) {
                z4 = true;
            } else {
                z4 = false;
            }
            int ceil = (int) Math.ceil(d);
            z10 = (ceil < 0 || ceil >= arrayList.size()) ? false : false;
            RectF rectF = this.f32720r;
            if (z4 && z10) {
                AndroidUtilities.lerp(((vb0) arrayList.get(floor)).f31879c, ((vb0) arrayList.get(ceil)).f31879c, f10 - floor, rectF);
            } else if (z4) {
                rectF.set(((vb0) arrayList.get(floor)).f31879c);
            } else if (z10) {
                rectF.set(((vb0) arrayList.get(ceil)).f31879c);
            }
            Drawable drawable = this.f32718f;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            if (z4 || z10) {
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.f32716c);
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                vb0 vb0Var = (vb0) arrayList.get(i10);
                vb0Var.f31878b.c(vb0Var.f31879c.left + this.h, getMeasuredHeight() / 2.0f, 1.0f, i0.a.d(1.0f - Math.abs(f10 - i10), this.d, this.f32717e), canvas);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        Utilities.Callback callback;
        ArrayList arrayList = this.f32714a;
        if (arrayList.size() > 1) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int i11 = 0;
            while (true) {
                if (i11 < arrayList.size()) {
                    if (((vb0) arrayList.get(i11)).d.contains(x10, y10)) {
                        i10 = ((vb0) arrayList.get(i11)).f31877a;
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
            } else if (motionEvent.getAction() == 1 && i10 != -1 && (callback = this.f32721s) != null) {
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
        this.f32719n = AndroidUtilities.dp(0.0f);
        int i12 = 0;
        while (true) {
            arrayList = this.f32714a;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (i12 > 0) {
                f10 += this.f32719n;
            }
            f10 += ((vb0) arrayList.get(i12)).f31878b.l() + this.h + this.h;
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
            float l10 = ((vb0) arrayList.get(i13)).f31878b.l() + this.h + this.h;
            ((vb0) arrayList.get(i13)).f31879c.set(f13, dp, f13 + l10, dp2);
            ((vb0) arrayList.get(i13)).d.set(((vb0) arrayList.get(i13)).f31879c);
            ((vb0) arrayList.get(i13)).d.inset((-this.f32719n) / 2.0f, -dp);
            f13 += l10 + this.f32719n;
        }
        Drawable drawable = this.f32718f;
        if (drawable != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            drawable.getPadding(rect);
            int i14 = measuredHeight / 2;
            this.f32718f.setBounds((((int) f12) - AndroidUtilities.dp(3.0f)) - rect.left, (i14 - AndroidUtilities.dp(16.0f)) - rect.top, AndroidUtilities.dp(3.0f) + ((int) ((f11 + f10) / 2.0f)) + rect.right, AndroidUtilities.dp(16.0f) + i14 + rect.bottom);
        }
    }

    @Override
    public void setBackground(Drawable drawable) {
        this.f32718f = drawable;
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.f32721s = callback;
    }

    public void setSelectedTab(float f10) {
        this.f32715b = f10;
        invalidate();
    }
}
