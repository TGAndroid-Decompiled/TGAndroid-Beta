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
public final class y8 extends Drawable {
    public final View f41924a;
    public final int f41925b;
    public boolean d;
    public final int f41927e;
    public final int f41928f;
    public final float f41929g;
    public final te.h f41926c = new te.h(new org.telegram.messenger.ou(this, 4), er.h, 380);
    public final ArrayList h = new ArrayList();
    public int f41930i = 255;

    public y8(int i7, View view, int i10, int i11, float f10) {
        this.f41925b = i7;
        this.f41924a = view;
        this.f41927e = i10;
        this.f41928f = i11;
        this.f41929g = f10;
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
                x8 x8Var = (x8) obj;
                if (x8Var.f41617c != 0 && !x8Var.d) {
                    x8Var.d = true;
                    x8Var.f41615a.P();
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
                x8 x8Var = (x8) obj;
                if (x8Var.d) {
                    x8Var.d = false;
                    x8Var.f41615a.R();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.f41930i != 0) {
            float f10 = bounds.left;
            float f11 = bounds.top;
            te.h hVar = this.f41926c;
            canvas.saveLayer(f10, f11, f10 + hVar.d.f57103f.f57111a, f11 + this.f41927e, null);
            for (int size = hVar.f57106b.size() - 1; size >= 0; size--) {
                te.e i7 = hVar.i(size);
                RectF b10 = i7.b();
                Object obj = i7.f57094a;
                float f12 = i7.f57098f.f57111a;
                float c10 = i7.c();
                float width = b10.width() - f12;
                float f13 = f10 + b10.left + f12;
                float f14 = width / 2.0f;
                float f15 = f13 + f14;
                float f16 = f11 + f14;
                canvas.save();
                canvas.scale(c10, c10, f15, f16);
                canvas.drawCircle(f15, f16, f14 + this.f41929g, org.telegram.ui.ActionBar.j6.Fm);
                x8 x8Var = (x8) obj;
                x8Var.f41615a.y0(f13, f11, width, width);
                x8Var.f41615a.setAlpha((this.f41930i / 255.0f) * i7.c());
                x8Var.f41615a.h(canvas, null);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void d(List list, boolean z10) {
        x8 x8Var;
        te.h hVar = this.f41926c;
        if (list != null && !list.isEmpty()) {
            if (!z10) {
                hVar.m(null, false);
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long o4 = org.telegram.messenger.m5.o((TLRPC.Peer) it.next());
                ArrayList arrayList2 = this.h;
                int size = arrayList2.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        Object obj = arrayList2.get(i7);
                        i7++;
                        x8Var = (x8) obj;
                        if (x8Var.f41617c == o4) {
                            break;
                        }
                    } else {
                        x8Var = null;
                        break;
                    }
                }
                if (x8Var == null) {
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            x8Var = (x8) obj2;
                            if (x8Var.f41617c == 0) {
                                break;
                            }
                        } else {
                            x8Var = null;
                            break;
                        }
                    }
                }
                if (x8Var == null) {
                    x8Var = new x8(this, this.f41924a);
                    arrayList2.add(x8Var);
                }
                x8 x8Var2 = x8Var;
                ImageReceiver imageReceiver = x8Var2.f41615a;
                t8 t8Var = x8Var2.f41616b;
                if (x8Var2.f41617c != o4) {
                    x8Var2.f41617c = o4;
                    TLObject e22 = org.telegram.messenger.np.s1(this.f41925b).e2(o4);
                    if (e22 != null) {
                        t8Var.p(e22);
                        imageReceiver.i0(e22, t8Var, null);
                    } else {
                        t8Var.k(o4, "", "", null);
                        imageReceiver.f();
                    }
                }
                arrayList.add(x8Var2);
                if (this.d && !x8Var2.d) {
                    x8Var2.d = true;
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
        return this.f41930i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f41930i = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
