package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qv0 extends Drawable {
    public final int f38996a;
    public final int f38997b;
    public final p5[] f38998c;
    public final boolean f38999e;
    public int d = 255;
    public final RectF f39000f = new RectF();
    public boolean f39001g = false;

    public qv0(int i7, ArrayList arrayList, boolean z10) {
        int i10;
        this.f38999e = z10;
        int max = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.f38996a = max;
        int min = Math.min(max * max, arrayList.size());
        this.f38997b = min;
        this.f38998c = new p5[min];
        if (!arrayList.isEmpty()) {
            org.telegram.messenger.gj.H2((TLRPC.Document) arrayList.get(0));
        }
        if (max < 2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        for (int i11 = 0; i11 < this.f38997b; i11++) {
            this.f38998c[i11] = p5.l(i7, i10, (TLRPC.Document) arrayList.get(i11));
        }
    }

    public final void a(org.telegram.ui.Cells.r1 r1Var) {
        for (int i7 = 0; i7 < this.f38997b; i7++) {
            this.f38998c[i7].n(r1Var);
        }
    }

    public final boolean b() {
        return this.f39001g;
    }

    public final boolean c(ArrayList arrayList) {
        long j3;
        p5[] p5VarArr = this.f38998c;
        if (p5VarArr.length == arrayList.size()) {
            for (int i7 = 0; i7 < p5VarArr.length; i7++) {
                TLRPC.Document document = p5VarArr[i7].f38494e;
                if (document == null) {
                    j3 = 0;
                } else {
                    j3 = document.f28440id;
                }
                if (j3 == ((TLRPC.Document) arrayList.get(i7)).f28440id) {
                }
            }
            return true;
        }
        return false;
    }

    public final void d() {
        this.f39001g = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        p5 p5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.d <= 0) {
            return;
        }
        Rect bounds = getBounds();
        RectF rectF = this.f39000f;
        rectF.set(bounds);
        float centerX = rectF.centerX() - (org.telegram.messenger.g0.L(48.0f) / 2.0f);
        float centerY = rectF.centerY() - (org.telegram.messenger.g0.L(48.0f) / 2.0f);
        int L = org.telegram.messenger.g0.L(48.0f);
        int i7 = this.f38996a;
        float f10 = L / i7;
        float L2 = org.telegram.messenger.g0.L(48.0f) / i7;
        canvas.save();
        canvas.clipRect(centerX, centerY, org.telegram.messenger.g0.L(48.0f) + centerX, org.telegram.messenger.g0.L(48.0f) + centerY);
        for (int i10 = 0; i10 < i7; i10++) {
            for (int i11 = 0; i11 < i7; i11++) {
                int i12 = (i10 * i7) + i11;
                if (i12 >= 0) {
                    p5[] p5VarArr = this.f38998c;
                    if (i12 < p5VarArr.length && (p5Var = p5VarArr[i12]) != null) {
                        p5Var.setBounds((int) ((i11 * f10) + centerX), (int) ((i10 * L2) + centerY), (int) (((i11 + 1) * f10) + centerX), (int) (((i10 + 1) * L2) + centerY));
                        p5VarArr[i12].setAlpha(this.d);
                        p5 p5Var2 = p5VarArr[i12];
                        if (this.f38999e) {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.m6.f29732w3;
                        } else {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.m6.f29713v3;
                        }
                        p5Var2.setColorFilter(porterDuffColorFilter);
                        p5VarArr[i12].draw(canvas);
                    }
                }
            }
        }
        canvas.restore();
    }

    public final void e() {
        this.f39001g = true;
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
