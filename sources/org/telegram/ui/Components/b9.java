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
    public final View f32110a;
    public final int f32111b;
    public boolean d;
    public final int f32113e;
    public final int f32114f;
    public final float f32115g;
    public final te.h f32112c = new te.h(new h9.f1(this, 28), xq.h, 380);
    public final ArrayList h = new ArrayList();
    public int f32116i = 255;

    public b9(int i7, View view, int i10, int i11, float f10) {
        this.f32111b = i7;
        this.f32110a = view;
        this.f32113e = i10;
        this.f32114f = i11;
        this.f32115g = f10;
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
                if (a9Var.f31747c != 0 && !a9Var.d) {
                    a9Var.d = true;
                    a9Var.f31745a.P();
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
                    a9Var.f31745a.R();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.f32116i != 0) {
            float f10 = bounds.left;
            float f11 = bounds.top;
            te.h hVar = this.f32112c;
            canvas.saveLayer(f10, f11, f10 + hVar.d.f55412f.f55420a, f11 + this.f32113e, null);
            for (int size = hVar.f55415b.size() - 1; size >= 0; size--) {
                te.e i7 = hVar.i(size);
                RectF b10 = i7.b();
                Object obj = i7.f55403a;
                float f12 = i7.f55407f.f55420a;
                float c10 = i7.c();
                float width = b10.width() - f12;
                float f13 = f10 + b10.left + f12;
                float f14 = width / 2.0f;
                float f15 = f13 + f14;
                float f16 = f11 + f14;
                canvas.save();
                canvas.scale(c10, c10, f15, f16);
                canvas.drawCircle(f15, f16, f14 + this.f32115g, org.telegram.ui.ActionBar.k6.Cm);
                a9 a9Var = (a9) obj;
                a9Var.f31745a.y0(f13, f11, width, width);
                a9Var.f31745a.setAlpha((this.f32116i / 255.0f) * i7.c());
                a9Var.f31745a.h(canvas, null);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void d(List list, boolean z9) {
        a9 a9Var;
        te.h hVar = this.f32112c;
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
                        if (a9Var.f31747c == o4) {
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
                            if (a9Var.f31747c == 0) {
                                break;
                            }
                        } else {
                            a9Var = null;
                            break;
                        }
                    }
                }
                if (a9Var == null) {
                    a9Var = new a9(this, this.f32110a);
                    arrayList2.add(a9Var);
                }
                a9 a9Var2 = a9Var;
                ImageReceiver imageReceiver = a9Var2.f31745a;
                w8 w8Var = a9Var2.f31746b;
                if (a9Var2.f31747c != o4) {
                    a9Var2.f31747c = o4;
                    TLObject e22 = org.telegram.messenger.qp.s1(this.f32111b).e2(o4);
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
        return this.f32116i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f32116i = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
