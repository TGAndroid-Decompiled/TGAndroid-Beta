package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gw0 extends Drawable {
    public final int f26526a;
    public final int f26527b;
    public final f5[] f26528c;
    public final boolean e;
    public int d = 255;
    public final RectF f26529f = new RectF();
    public boolean f26530g = false;

    public gw0(int i10, ArrayList arrayList, boolean z10) {
        int i11;
        this.e = z10;
        int max = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.f26526a = max;
        int min = Math.min(max * max, arrayList.size());
        this.f26527b = min;
        this.f26528c = new f5[min];
        if (!arrayList.isEmpty()) {
            org.telegram.messenger.jj.H2((TLRPC.Document) arrayList.get(0));
        }
        if (max < 2) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        for (int i12 = 0; i12 < this.f26527b; i12++) {
            this.f26528c[i12] = f5.l(i10, i11, (TLRPC.Document) arrayList.get(i12));
        }
    }

    public final void a(org.telegram.ui.Cells.q1 q1Var) {
        for (int i10 = 0; i10 < this.f26527b; i10++) {
            this.f26528c[i10].n(q1Var);
        }
    }

    public final boolean b() {
        return this.f26530g;
    }

    public final boolean c(ArrayList arrayList) {
        long j10;
        f5[] f5VarArr = this.f26528c;
        if (f5VarArr.length == arrayList.size()) {
            for (int i10 = 0; i10 < f5VarArr.length; i10++) {
                TLRPC.Document document = f5VarArr[i10].e;
                if (document == null) {
                    j10 = 0;
                } else {
                    j10 = document.f19799id;
                }
                if (j10 == ((TLRPC.Document) arrayList.get(i10)).f19799id) {
                }
            }
            return true;
        }
        return false;
    }

    public final void d() {
        this.f26530g = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        f5 f5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.d <= 0) {
            return;
        }
        Rect bounds = getBounds();
        RectF rectF = this.f26529f;
        rectF.set(bounds);
        float centerX = rectF.centerX() - (org.telegram.messenger.i0.L(48.0f) / 2.0f);
        float centerY = rectF.centerY() - (org.telegram.messenger.i0.L(48.0f) / 2.0f);
        int L = org.telegram.messenger.i0.L(48.0f);
        int i10 = this.f26526a;
        float f7 = L / i10;
        float L2 = org.telegram.messenger.i0.L(48.0f) / i10;
        canvas.save();
        canvas.clipRect(centerX, centerY, org.telegram.messenger.i0.L(48.0f) + centerX, org.telegram.messenger.i0.L(48.0f) + centerY);
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = (i11 * i10) + i12;
                if (i13 >= 0) {
                    f5[] f5VarArr = this.f26528c;
                    if (i13 < f5VarArr.length && (f5Var = f5VarArr[i13]) != null) {
                        f5Var.setBounds((int) ((i12 * f7) + centerX), (int) ((i11 * L2) + centerY), (int) (((i12 + 1) * f7) + centerX), (int) (((i11 + 1) * L2) + centerY));
                        f5VarArr[i13].setAlpha(this.d);
                        f5 f5Var2 = f5VarArr[i13];
                        if (this.e) {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.t6.f21274w3;
                        } else {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.t6.f21256v3;
                        }
                        f5Var2.setColorFilter(porterDuffColorFilter);
                        f5VarArr[i13].draw(canvas);
                    }
                }
            }
        }
        canvas.restore();
    }

    public final void e() {
        this.f26530g = true;
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(48.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(48.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
