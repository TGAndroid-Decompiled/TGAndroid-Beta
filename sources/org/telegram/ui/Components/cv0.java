package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cv0 extends Drawable {
    public final int f32840a;
    public final int f32841b;
    public final g5[] f32842c;
    public final boolean f32843e;
    public int d = 255;
    public final RectF f32844f = new RectF();
    public boolean f32845g = false;

    public cv0(int i3, ArrayList arrayList, boolean z10) {
        int i10;
        this.f32843e = z10;
        int max = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.f32840a = max;
        int min = Math.min(max * max, arrayList.size());
        this.f32841b = min;
        this.f32842c = new g5[min];
        if (!arrayList.isEmpty()) {
            org.telegram.messenger.zi.I2((TLRPC.Document) arrayList.get(0));
        }
        if (max < 2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        for (int i11 = 0; i11 < this.f32841b; i11++) {
            this.f32842c[i11] = g5.l(i3, i10, (TLRPC.Document) arrayList.get(i11));
        }
    }

    public final void a(org.telegram.ui.Cells.q1 q1Var) {
        for (int i3 = 0; i3 < this.f32841b; i3++) {
            this.f32842c[i3].n(q1Var);
        }
    }

    public final boolean b() {
        return this.f32845g;
    }

    public final boolean c(ArrayList arrayList) {
        long j10;
        g5[] g5VarArr = this.f32842c;
        if (g5VarArr.length == arrayList.size()) {
            for (int i3 = 0; i3 < g5VarArr.length; i3++) {
                TLRPC.Document document = g5VarArr[i3].f33966e;
                if (document == null) {
                    j10 = 0;
                } else {
                    j10 = document.f27007id;
                }
                if (j10 == ((TLRPC.Document) arrayList.get(i3)).f27007id) {
                }
            }
            return true;
        }
        return false;
    }

    public final void d() {
        this.f32845g = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        g5 g5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.d <= 0) {
            return;
        }
        Rect bounds = getBounds();
        RectF rectF = this.f32844f;
        rectF.set(bounds);
        float centerX = rectF.centerX() - (org.telegram.messenger.g0.L(48.0f) / 2.0f);
        float centerY = rectF.centerY() - (org.telegram.messenger.g0.L(48.0f) / 2.0f);
        int L = org.telegram.messenger.g0.L(48.0f);
        int i3 = this.f32840a;
        float f10 = L / i3;
        float L2 = org.telegram.messenger.g0.L(48.0f) / i3;
        canvas.save();
        canvas.clipRect(centerX, centerY, org.telegram.messenger.g0.L(48.0f) + centerX, org.telegram.messenger.g0.L(48.0f) + centerY);
        for (int i10 = 0; i10 < i3; i10++) {
            for (int i11 = 0; i11 < i3; i11++) {
                int i12 = (i10 * i3) + i11;
                if (i12 >= 0) {
                    g5[] g5VarArr = this.f32842c;
                    if (i12 < g5VarArr.length && (g5Var = g5VarArr[i12]) != null) {
                        g5Var.setBounds((int) ((i11 * f10) + centerX), (int) ((i10 * L2) + centerY), (int) (((i11 + 1) * f10) + centerX), (int) (((i10 + 1) * L2) + centerY));
                        g5VarArr[i12].setAlpha(this.d);
                        g5 g5Var2 = g5VarArr[i12];
                        if (this.f32843e) {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.k6.f28231w3;
                        } else {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.k6.f28211v3;
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
        this.f32845g = true;
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
    public final void setAlpha(int i3) {
        this.d = i3;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
