package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nv0 extends Drawable {
    public final int f37860a;
    public final int f37861b;
    public final o5[] f37862c;
    public final boolean f37863e;
    public int d = 255;
    public final RectF f37864f = new RectF();
    public boolean f37865g = false;

    public nv0(int i7, ArrayList arrayList, boolean z10) {
        int i10;
        this.f37863e = z10;
        int max = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.f37860a = max;
        int min = Math.min(max * max, arrayList.size());
        this.f37861b = min;
        this.f37862c = new o5[min];
        if (!arrayList.isEmpty()) {
            org.telegram.messenger.fj.H2((TLRPC.Document) arrayList.get(0));
        }
        if (max < 2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        for (int i11 = 0; i11 < this.f37861b; i11++) {
            this.f37862c[i11] = o5.l(i7, i10, (TLRPC.Document) arrayList.get(i11));
        }
    }

    public final void a(org.telegram.ui.Cells.r1 r1Var) {
        for (int i7 = 0; i7 < this.f37861b; i7++) {
            this.f37862c[i7].n(r1Var);
        }
    }

    public final boolean b() {
        return this.f37865g;
    }

    public final boolean c(ArrayList arrayList) {
        long j3;
        o5[] o5VarArr = this.f37862c;
        if (o5VarArr.length == arrayList.size()) {
            for (int i7 = 0; i7 < o5VarArr.length; i7++) {
                TLRPC.Document document = o5VarArr[i7].f37971e;
                if (document == null) {
                    j3 = 0;
                } else {
                    j3 = document.f28409id;
                }
                if (j3 == ((TLRPC.Document) arrayList.get(i7)).f28409id) {
                }
            }
            return true;
        }
        return false;
    }

    public final void d() {
        this.f37865g = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        o5 o5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.d <= 0) {
            return;
        }
        Rect bounds = getBounds();
        RectF rectF = this.f37864f;
        rectF.set(bounds);
        float centerX = rectF.centerX() - (org.telegram.messenger.g0.L(48.0f) / 2.0f);
        float centerY = rectF.centerY() - (org.telegram.messenger.g0.L(48.0f) / 2.0f);
        int L = org.telegram.messenger.g0.L(48.0f);
        int i7 = this.f37860a;
        float f10 = L / i7;
        float L2 = org.telegram.messenger.g0.L(48.0f) / i7;
        canvas.save();
        canvas.clipRect(centerX, centerY, org.telegram.messenger.g0.L(48.0f) + centerX, org.telegram.messenger.g0.L(48.0f) + centerY);
        for (int i10 = 0; i10 < i7; i10++) {
            for (int i11 = 0; i11 < i7; i11++) {
                int i12 = (i10 * i7) + i11;
                if (i12 >= 0) {
                    o5[] o5VarArr = this.f37862c;
                    if (i12 < o5VarArr.length && (o5Var = o5VarArr[i12]) != null) {
                        o5Var.setBounds((int) ((i11 * f10) + centerX), (int) ((i10 * L2) + centerY), (int) (((i11 + 1) * f10) + centerX), (int) (((i10 + 1) * L2) + centerY));
                        o5VarArr[i12].setAlpha(this.d);
                        o5 o5Var2 = o5VarArr[i12];
                        if (this.f37863e) {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.n6.f29745w3;
                        } else {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.n6.f29726v3;
                        }
                        o5Var2.setColorFilter(porterDuffColorFilter);
                        o5VarArr[i12].draw(canvas);
                    }
                }
            }
        }
        canvas.restore();
    }

    public final void e() {
        this.f37865g = true;
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
