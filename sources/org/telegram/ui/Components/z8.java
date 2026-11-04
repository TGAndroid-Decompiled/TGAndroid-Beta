package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z8 extends Drawable {
    public final View f40984a;
    public final int f40985b;
    public boolean d;
    public final int f40987e;
    public final int f40988f;
    public final float f40989g;
    public final qe.h f40986c = new qe.h(new hi.d(this, 29), xq.h, 380);
    public final ArrayList h = new ArrayList();
    public int f40990i = 255;

    public z8(int i3, View view, int i10, int i11, float f10) {
        this.f40985b = i3;
        this.f40984a = view;
        this.f40987e = i10;
        this.f40988f = i11;
        this.f40989g = f10;
    }

    public final void a() {
        if (!this.d) {
            this.d = true;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                y8 y8Var = (y8) obj;
                if (y8Var.f40653c != 0 && !y8Var.d) {
                    y8Var.d = true;
                    y8Var.f40651a.P();
                }
            }
        }
    }

    public final void b() {
        if (this.d) {
            this.d = false;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                y8 y8Var = (y8) obj;
                if (y8Var.d) {
                    y8Var.d = false;
                    y8Var.f40651a.R();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.f40990i != 0) {
            float f10 = bounds.left;
            float f11 = bounds.top;
            qe.h hVar = this.f40986c;
            canvas.saveLayer(f10, f11, f10 + hVar.d.f53858f.f53866a, f11 + this.f40987e, null);
            for (int size = hVar.f53861b.size() - 1; size >= 0; size--) {
                qe.e i3 = hVar.i(size);
                RectF b10 = i3.b();
                Object obj = i3.f53849a;
                float f12 = i3.f53853f.f53866a;
                float c2 = i3.c();
                float width = b10.width() - f12;
                float f13 = f10 + b10.left + f12;
                float f14 = width / 2.0f;
                float f15 = f13 + f14;
                float f16 = f11 + f14;
                canvas.save();
                canvas.scale(c2, c2, f15, f16);
                canvas.drawCircle(f15, f16, f14 + this.f40989g, org.telegram.ui.ActionBar.k6.Cm);
                y8 y8Var = (y8) obj;
                y8Var.f40651a.y0(f13, f11, width, width);
                y8Var.f40651a.setAlpha((this.f40990i / 255.0f) * i3.c());
                y8Var.f40651a.h(canvas, null);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void d(List list, boolean z10) {
        y8 y8Var;
        qe.h hVar = this.f40986c;
        if (list != null && !list.isEmpty()) {
            if (!z10) {
                hVar.m(null, false);
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long o10 = org.telegram.messenger.m5.o((TLRPC.Peer) it.next());
                ArrayList arrayList2 = this.h;
                int size = arrayList2.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        Object obj = arrayList2.get(i3);
                        i3++;
                        y8Var = (y8) obj;
                        if (y8Var.f40653c == o10) {
                            break;
                        }
                    } else {
                        y8Var = null;
                        break;
                    }
                }
                if (y8Var == null) {
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            y8Var = (y8) obj2;
                            if (y8Var.f40653c == 0) {
                                break;
                            }
                        } else {
                            y8Var = null;
                            break;
                        }
                    }
                }
                if (y8Var == null) {
                    y8Var = new y8(this, this.f40984a);
                    arrayList2.add(y8Var);
                }
                y8 y8Var2 = y8Var;
                ImageReceiver imageReceiver = y8Var2.f40651a;
                u8 u8Var = y8Var2.f40652b;
                if (y8Var2.f40653c != o10) {
                    y8Var2.f40653c = o10;
                    TLObject e22 = org.telegram.messenger.hp.s1(this.f40985b).e2(o10);
                    if (e22 != null) {
                        u8Var.p(e22);
                        imageReceiver.i0(e22, u8Var, null);
                    } else {
                        u8Var.k(o10, "", "", null);
                        imageReceiver.f();
                    }
                }
                arrayList.add(y8Var2);
                if (this.d && !y8Var2.d) {
                    y8Var2.d = true;
                    imageReceiver.P();
                }
            }
            hVar.m(arrayList, z10);
            return;
        }
        hVar.m(null, z10);
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    @Override
    public final int getAlpha() {
        return this.f40990i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i3) {
        this.f40990i = i3;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
