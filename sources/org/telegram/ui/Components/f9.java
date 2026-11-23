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
public final class f9 extends Drawable {
    public final View f35056a;
    public final int f35057b;
    public boolean d;
    public final int f35059e;
    public final int f35060f;
    public final float f35061g;
    public final te.h f35058c = new te.h(new org.telegram.ui.Cells.aa(this, 1), kr.h, 380);
    public final ArrayList h = new ArrayList();
    public int f35062i = 255;

    public f9(int i7, View view, int i10, int i11, float f10) {
        this.f35057b = i7;
        this.f35056a = view;
        this.f35059e = i10;
        this.f35060f = i11;
        this.f35061g = f10;
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
                e9 e9Var = (e9) obj;
                if (e9Var.f34670c != 0 && !e9Var.d) {
                    e9Var.d = true;
                    e9Var.f34668a.Q();
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
                e9 e9Var = (e9) obj;
                if (e9Var.d) {
                    e9Var.d = false;
                    e9Var.f34668a.S();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.f35062i != 0) {
            float f10 = bounds.left;
            float f11 = bounds.top;
            te.h hVar = this.f35058c;
            canvas.saveLayer(f10, f11, f10 + hVar.d.f57797f.f57805a, f11 + this.f35059e, null);
            for (int size = hVar.f57800b.size() - 1; size >= 0; size--) {
                te.e i7 = hVar.i(size);
                RectF b10 = i7.b();
                Object obj = i7.f57788a;
                float f12 = i7.f57792f.f57805a;
                float c10 = i7.c();
                float width = b10.width() - f12;
                float f13 = f10 + b10.left + f12;
                float f14 = width / 2.0f;
                float f15 = f13 + f14;
                float f16 = f11 + f14;
                canvas.save();
                canvas.scale(c10, c10, f15, f16);
                canvas.drawCircle(f15, f16, f14 + this.f35061g, org.telegram.ui.ActionBar.n6.Fm);
                e9 e9Var = (e9) obj;
                e9Var.f34668a.z0(f13, f11, width, width);
                e9Var.f34668a.setAlpha((this.f35062i / 255.0f) * i7.c());
                e9Var.f34668a.h(canvas, null);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void d(List list, boolean z10) {
        e9 e9Var;
        te.h hVar = this.f35058c;
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
                        e9Var = (e9) obj;
                        if (e9Var.f34670c == o4) {
                            break;
                        }
                    } else {
                        e9Var = null;
                        break;
                    }
                }
                if (e9Var == null) {
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            e9Var = (e9) obj2;
                            if (e9Var.f34670c == 0) {
                                break;
                            }
                        } else {
                            e9Var = null;
                            break;
                        }
                    }
                }
                if (e9Var == null) {
                    e9Var = new e9(this, this.f35056a);
                    arrayList2.add(e9Var);
                }
                e9 e9Var2 = e9Var;
                ImageReceiver imageReceiver = e9Var2.f34668a;
                a9 a9Var = e9Var2.f34669b;
                if (e9Var2.f34670c != o4) {
                    e9Var2.f34670c = o4;
                    TLObject g22 = org.telegram.messenger.mp.u1(this.f35057b).g2(o4);
                    if (g22 != null) {
                        a9Var.p(g22);
                        imageReceiver.j0(g22, a9Var, null);
                    } else {
                        a9Var.k(o4, "", "", null);
                        imageReceiver.f();
                    }
                }
                arrayList.add(e9Var2);
                if (this.d && !e9Var2.d) {
                    e9Var2.d = true;
                    imageReceiver.Q();
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
        return this.f35062i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f35062i = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
