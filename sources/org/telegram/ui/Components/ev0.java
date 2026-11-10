package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ev0 extends Drawable {
    public final int f33338a;
    public final int f33339b;
    public final h5[] f33340c;
    public final boolean f33341e;
    public int d = 255;
    public final RectF f33342f = new RectF();
    public boolean f33343g = false;

    public ev0(int i7, ArrayList arrayList, boolean z9) {
        int i10;
        this.f33341e = z9;
        int max = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.f33338a = max;
        int min = Math.min(max * max, arrayList.size());
        this.f33339b = min;
        this.f33340c = new h5[min];
        if (!arrayList.isEmpty()) {
            org.telegram.messenger.ij.H2((TLRPC.Document) arrayList.get(0));
        }
        if (max < 2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        for (int i11 = 0; i11 < this.f33339b; i11++) {
            this.f33340c[i11] = h5.l(i7, i10, (TLRPC.Document) arrayList.get(i11));
        }
    }

    public final void a(org.telegram.ui.Cells.q1 q1Var) {
        for (int i7 = 0; i7 < this.f33339b; i7++) {
            this.f33340c[i7].n(q1Var);
        }
    }

    public final boolean b() {
        return this.f33343g;
    }

    public final boolean c(ArrayList arrayList) {
        long j3;
        h5[] h5VarArr = this.f33340c;
        if (h5VarArr.length == arrayList.size()) {
            for (int i7 = 0; i7 < h5VarArr.length; i7++) {
                TLRPC.Document document = h5VarArr[i7].f34171e;
                if (document == null) {
                    j3 = 0;
                } else {
                    j3 = document.f26966id;
                }
                if (j3 == ((TLRPC.Document) arrayList.get(i7)).f26966id) {
                }
            }
            return true;
        }
        return false;
    }

    public final void d() {
        this.f33343g = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        h5 h5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.d <= 0) {
            return;
        }
        Rect bounds = getBounds();
        RectF rectF = this.f33342f;
        rectF.set(bounds);
        float centerX = rectF.centerX() - (org.telegram.messenger.g0.L(48.0f) / 2.0f);
        float centerY = rectF.centerY() - (org.telegram.messenger.g0.L(48.0f) / 2.0f);
        int L = org.telegram.messenger.g0.L(48.0f);
        int i7 = this.f33338a;
        float f10 = L / i7;
        float L2 = org.telegram.messenger.g0.L(48.0f) / i7;
        canvas.save();
        canvas.clipRect(centerX, centerY, org.telegram.messenger.g0.L(48.0f) + centerX, org.telegram.messenger.g0.L(48.0f) + centerY);
        for (int i10 = 0; i10 < i7; i10++) {
            for (int i11 = 0; i11 < i7; i11++) {
                int i12 = (i10 * i7) + i11;
                if (i12 >= 0) {
                    h5[] h5VarArr = this.f33340c;
                    if (i12 < h5VarArr.length && (h5Var = h5VarArr[i12]) != null) {
                        h5Var.setBounds((int) ((i11 * f10) + centerX), (int) ((i10 * L2) + centerY), (int) (((i11 + 1) * f10) + centerX), (int) (((i10 + 1) * L2) + centerY));
                        h5VarArr[i12].setAlpha(this.d);
                        h5 h5Var2 = h5VarArr[i12];
                        if (this.f33341e) {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.m6.f28241w3;
                        } else {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.m6.f28222v3;
                        }
                        h5Var2.setColorFilter(porterDuffColorFilter);
                        h5VarArr[i12].draw(canvas);
                    }
                }
            }
        }
        canvas.restore();
    }

    public final void e() {
        this.f33343g = true;
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
