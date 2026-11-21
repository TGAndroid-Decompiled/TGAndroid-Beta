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
public final class g9 extends Drawable {
    public final View f35459a;
    public final int f35460b;
    public boolean d;
    public final int f35462e;
    public final int f35463f;
    public final float f35464g;
    public final te.h f35461c = new te.h(new hi.w4(this, 29), nr.h, 380);
    public final ArrayList h = new ArrayList();
    public int f35465i = 255;

    public g9(int i7, View view, int i10, int i11, float f10) {
        this.f35460b = i7;
        this.f35459a = view;
        this.f35462e = i10;
        this.f35463f = i11;
        this.f35464g = f10;
    }

    public final void a() {
        if (!this.d) {
            this.d = true;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                f9 f9Var = (f9) obj;
                if (f9Var.f35160c != 0 && !f9Var.d) {
                    f9Var.d = true;
                    f9Var.f35158a.P();
                }
            }
        }
    }

    public final void b() {
        if (this.d) {
            this.d = false;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                f9 f9Var = (f9) obj;
                if (f9Var.d) {
                    f9Var.d = false;
                    f9Var.f35158a.R();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.f35465i != 0) {
            float f10 = bounds.left;
            float f11 = bounds.top;
            te.h hVar = this.f35461c;
            canvas.saveLayer(f10, f11, f10 + hVar.d.f57714f.f57722a, f11 + this.f35462e, null);
            for (int size = hVar.f57717b.size() - 1; size >= 0; size--) {
                te.e i7 = hVar.i(size);
                RectF b10 = i7.b();
                Object obj = i7.f57705a;
                float f12 = i7.f57709f.f57722a;
                float c10 = i7.c();
                float width = b10.width() - f12;
                float f13 = f10 + b10.left + f12;
                float f14 = width / 2.0f;
                float f15 = f13 + f14;
                float f16 = f11 + f14;
                canvas.save();
                canvas.scale(c10, c10, f15, f16);
                canvas.drawCircle(f15, f16, f14 + this.f35464g, org.telegram.ui.ActionBar.m6.Fm);
                f9 f9Var = (f9) obj;
                f9Var.f35158a.y0(f13, f11, width, width);
                f9Var.f35158a.setAlpha((this.f35465i / 255.0f) * i7.c());
                f9Var.f35158a.h(canvas, null);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void d(List list, boolean z10) {
        f9 f9Var;
        te.h hVar = this.f35461c;
        if (list != null && !list.isEmpty()) {
            if (!z10) {
                hVar.m(null, false);
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long o4 = org.telegram.messenger.n5.o((TLRPC.Peer) it.next());
                ArrayList arrayList2 = this.h;
                int size = arrayList2.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        Object obj = arrayList2.get(i7);
                        i7++;
                        f9Var = (f9) obj;
                        if (f9Var.f35160c == o4) {
                            break;
                        }
                    } else {
                        f9Var = null;
                        break;
                    }
                }
                if (f9Var == null) {
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            f9Var = (f9) obj2;
                            if (f9Var.f35160c == 0) {
                                break;
                            }
                        } else {
                            f9Var = null;
                            break;
                        }
                    }
                }
                if (f9Var == null) {
                    f9Var = new f9(this, this.f35459a);
                    arrayList2.add(f9Var);
                }
                f9 f9Var2 = f9Var;
                ImageReceiver imageReceiver = f9Var2.f35158a;
                b9 b9Var = f9Var2.f35159b;
                if (f9Var2.f35160c != o4) {
                    f9Var2.f35160c = o4;
                    TLObject g22 = org.telegram.messenger.mp.u1(this.f35460b).g2(o4);
                    if (g22 != null) {
                        b9Var.p(g22);
                        imageReceiver.i0(g22, b9Var, null);
                    } else {
                        b9Var.k(o4, "", "", null);
                        imageReceiver.f();
                    }
                }
                arrayList.add(f9Var2);
                if (this.d && !f9Var2.d) {
                    f9Var2.d = true;
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
        return this.f35465i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f35465i = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
