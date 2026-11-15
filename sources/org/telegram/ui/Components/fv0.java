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
    public final int f34705a;
    public final int f34706b;
    public final g5[] f34707c;
    public final boolean f34708e;
    public int d = 255;
    public final RectF f34709f = new RectF();
    public boolean f34710g = false;

    public fv0(int i7, ArrayList arrayList, boolean z10) {
        int i10;
        this.f34708e = z10;
        int max = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.f34705a = max;
        int min = Math.min(max * max, arrayList.size());
        this.f34706b = min;
        this.f34707c = new g5[min];
        if (!arrayList.isEmpty()) {
            org.telegram.messenger.gj.H2((TLRPC.Document) arrayList.get(0));
        }
        if (max < 2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        for (int i11 = 0; i11 < this.f34706b; i11++) {
            this.f34707c[i11] = g5.l(i7, i10, (TLRPC.Document) arrayList.get(i11));
        }
    }

    public final void a(org.telegram.ui.Cells.q1 q1Var) {
        for (int i7 = 0; i7 < this.f34706b; i7++) {
            this.f34707c[i7].n(q1Var);
        }
    }

    public final boolean b() {
        return this.f34710g;
    }

    public final boolean c(ArrayList arrayList) {
        long j3;
        g5[] g5VarArr = this.f34707c;
        if (g5VarArr.length == arrayList.size()) {
            for (int i7 = 0; i7 < g5VarArr.length; i7++) {
                TLRPC.Document document = g5VarArr[i7].f34804e;
                if (document == null) {
                    j3 = 0;
                } else {
                    j3 = document.f28057id;
                }
                if (j3 == ((TLRPC.Document) arrayList.get(i7)).f28057id) {
                }
            }
            return true;
        }
        return false;
    }

    public final void d() {
        this.f34710g = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        g5 g5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.d <= 0) {
            return;
        }
        Rect bounds = getBounds();
        RectF rectF = this.f34709f;
        rectF.set(bounds);
        float centerX = rectF.centerX() - (org.telegram.messenger.g0.L(48.0f) / 2.0f);
        float centerY = rectF.centerY() - (org.telegram.messenger.g0.L(48.0f) / 2.0f);
        int L = org.telegram.messenger.g0.L(48.0f);
        int i7 = this.f34705a;
        float f10 = L / i7;
        float L2 = org.telegram.messenger.g0.L(48.0f) / i7;
        canvas.save();
        canvas.clipRect(centerX, centerY, org.telegram.messenger.g0.L(48.0f) + centerX, org.telegram.messenger.g0.L(48.0f) + centerY);
        for (int i10 = 0; i10 < i7; i10++) {
            for (int i11 = 0; i11 < i7; i11++) {
                int i12 = (i10 * i7) + i11;
                if (i12 >= 0) {
                    g5[] g5VarArr = this.f34707c;
                    if (i12 < g5VarArr.length && (g5Var = g5VarArr[i12]) != null) {
                        g5Var.setBounds((int) ((i11 * f10) + centerX), (int) ((i10 * L2) + centerY), (int) (((i11 + 1) * f10) + centerX), (int) (((i10 + 1) * L2) + centerY));
                        g5VarArr[i12].setAlpha(this.d);
                        g5 g5Var2 = g5VarArr[i12];
                        if (this.f34708e) {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.j6.f29200w3;
                        } else {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.j6.f29181v3;
                        }
                        g5Var2.setColorFilter(porterDuffColorFilter);
                        g5VarArr[i12].draw(canvas);
                    }
                }
            }
        }
        canvas.restore();
    }

    public final void e() {
        this.f34710g = true;
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
