package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fv0 extends Drawable {
    public final int f33740a;
    public final int f33741b;
    public final i5[] f33742c;
    public final boolean f33743e;
    public int d = 255;
    public final RectF f33744f = new RectF();
    public boolean f33745g = false;

    public fv0(int i7, ArrayList arrayList, boolean z9) {
        int i10;
        this.f33743e = z9;
        int max = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.f33740a = max;
        int min = Math.min(max * max, arrayList.size());
        this.f33741b = min;
        this.f33742c = new i5[min];
        if (!arrayList.isEmpty()) {
            org.telegram.messenger.ij.H2((TLRPC.Document) arrayList.get(0));
        }
        if (max < 2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        for (int i11 = 0; i11 < this.f33741b; i11++) {
            this.f33742c[i11] = i5.l(i7, i10, (TLRPC.Document) arrayList.get(i11));
        }
    }

    public final void a(org.telegram.ui.Cells.q1 q1Var) {
        for (int i7 = 0; i7 < this.f33741b; i7++) {
            this.f33742c[i7].n(q1Var);
        }
    }

    public final boolean b() {
        return this.f33745g;
    }

    public final boolean c(ArrayList arrayList) {
        long j3;
        i5[] i5VarArr = this.f33742c;
        if (i5VarArr.length == arrayList.size()) {
            for (int i7 = 0; i7 < i5VarArr.length; i7++) {
                TLRPC.Document document = i5VarArr[i7].f34563e;
                if (document == null) {
                    j3 = 0;
                } else {
                    j3 = document.f26962id;
                }
                if (j3 == ((TLRPC.Document) arrayList.get(i7)).f26962id) {
                }
            }
            return true;
        }
        return false;
    }

    public final void d() {
        this.f33745g = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        i5 i5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.d <= 0) {
            return;
        }
        Rect bounds = getBounds();
        RectF rectF = this.f33744f;
        rectF.set(bounds);
        float centerX = rectF.centerX() - (org.telegram.messenger.g0.L(48.0f) / 2.0f);
        float centerY = rectF.centerY() - (org.telegram.messenger.g0.L(48.0f) / 2.0f);
        int L = org.telegram.messenger.g0.L(48.0f);
        int i7 = this.f33740a;
        float f10 = L / i7;
        float L2 = org.telegram.messenger.g0.L(48.0f) / i7;
        canvas.save();
        canvas.clipRect(centerX, centerY, org.telegram.messenger.g0.L(48.0f) + centerX, org.telegram.messenger.g0.L(48.0f) + centerY);
        for (int i10 = 0; i10 < i7; i10++) {
            for (int i11 = 0; i11 < i7; i11++) {
                int i12 = (i10 * i7) + i11;
                if (i12 >= 0) {
                    i5[] i5VarArr = this.f33742c;
                    if (i12 < i5VarArr.length && (i5Var = i5VarArr[i12]) != null) {
                        i5Var.setBounds((int) ((i11 * f10) + centerX), (int) ((i10 * L2) + centerY), (int) (((i11 + 1) * f10) + centerX), (int) (((i10 + 1) * L2) + centerY));
                        i5VarArr[i12].setAlpha(this.d);
                        i5 i5Var2 = i5VarArr[i12];
                        if (this.f33743e) {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.l6.f28216w3;
                        } else {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.l6.f28197v3;
                        }
                        i5Var2.setColorFilter(porterDuffColorFilter);
                        i5VarArr[i12].draw(canvas);
                    }
                }
            }
        }
        canvas.restore();
    }

    public final void e() {
        this.f33745g = true;
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.d = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
