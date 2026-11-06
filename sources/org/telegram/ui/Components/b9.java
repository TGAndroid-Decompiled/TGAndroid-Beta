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
public final class b9 extends Drawable {
    public final View f32082a;
    public final int f32083b;
    public boolean d;
    public final int f32085e;
    public final int f32086f;
    public final float f32087g;
    public final te.h f32084c = new te.h(new h9.f1(this, 28), xq.h, 380);
    public final ArrayList h = new ArrayList();
    public int f32088i = 255;

    public b9(int i7, View view, int i10, int i11, float f10) {
        this.f32083b = i7;
        this.f32082a = view;
        this.f32085e = i10;
        this.f32086f = i11;
        this.f32087g = f10;
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
                a9 a9Var = (a9) obj;
                if (a9Var.f31739c != 0 && !a9Var.d) {
                    a9Var.d = true;
                    a9Var.f31737a.P();
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
                a9 a9Var = (a9) obj;
                if (a9Var.d) {
                    a9Var.d = false;
                    a9Var.f31737a.R();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.f32088i != 0) {
            float f10 = bounds.left;
            float f11 = bounds.top;
            te.h hVar = this.f32084c;
            canvas.saveLayer(f10, f11, f10 + hVar.d.f55388f.f55396a, f11 + this.f32085e, null);
            for (int size = hVar.f55391b.size() - 1; size >= 0; size--) {
                te.e i7 = hVar.i(size);
                RectF b10 = i7.b();
                Object obj = i7.f55379a;
                float f12 = i7.f55383f.f55396a;
                float c10 = i7.c();
                float width = b10.width() - f12;
                float f13 = f10 + b10.left + f12;
                float f14 = width / 2.0f;
                float f15 = f13 + f14;
                float f16 = f11 + f14;
                canvas.save();
                canvas.scale(c10, c10, f15, f16);
                canvas.drawCircle(f15, f16, f14 + this.f32087g, org.telegram.ui.ActionBar.k6.Cm);
                a9 a9Var = (a9) obj;
                a9Var.f31737a.y0(f13, f11, width, width);
                a9Var.f31737a.setAlpha((this.f32088i / 255.0f) * i7.c());
                a9Var.f31737a.h(canvas, null);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void d(List list, boolean z9) {
        a9 a9Var;
        te.h hVar = this.f32084c;
        if (list != null && !list.isEmpty()) {
            if (!z9) {
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
                        a9Var = (a9) obj;
                        if (a9Var.f31739c == o4) {
                            break;
                        }
                    } else {
                        a9Var = null;
                        break;
                    }
                }
                if (a9Var == null) {
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            a9Var = (a9) obj2;
                            if (a9Var.f31739c == 0) {
                                break;
                            }
                        } else {
                            a9Var = null;
                            break;
                        }
                    }
                }
                if (a9Var == null) {
                    a9Var = new a9(this, this.f32082a);
                    arrayList2.add(a9Var);
                }
                a9 a9Var2 = a9Var;
                ImageReceiver imageReceiver = a9Var2.f31737a;
                w8 w8Var = a9Var2.f31738b;
                if (a9Var2.f31739c != o4) {
                    a9Var2.f31739c = o4;
                    TLObject e22 = org.telegram.messenger.qp.s1(this.f32083b).e2(o4);
                    if (e22 != null) {
                        w8Var.p(e22);
                        imageReceiver.i0(e22, w8Var, null);
                    } else {
                        w8Var.k(o4, "", "", null);
                        imageReceiver.f();
                    }
                }
                arrayList.add(a9Var2);
                if (this.d && !a9Var2.d) {
                    a9Var2.d = true;
                    imageReceiver.P();
                }
            }
            hVar.m(arrayList, z9);
            return;
        }
        hVar.m(null, z9);
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    @Override
    public final int getAlpha() {
        return this.f32088i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f32088i = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
