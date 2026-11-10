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
public final class a9 extends Drawable {
    public final View f31795a;
    public final int f31796b;
    public boolean d;
    public final int f31798e;
    public final int f31799f;
    public final float f31800g;
    public final te.h f31797c = new te.h(new h9.f1(this, 28), wq.h, 380);
    public final ArrayList h = new ArrayList();
    public int f31801i = 255;

    public a9(int i7, View view, int i10, int i11, float f10) {
        this.f31796b = i7;
        this.f31795a = view;
        this.f31798e = i10;
        this.f31799f = i11;
        this.f31800g = f10;
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
                z8 z8Var = (z8) obj;
                if (z8Var.f40895c != 0 && !z8Var.d) {
                    z8Var.d = true;
                    z8Var.f40893a.P();
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
                z8 z8Var = (z8) obj;
                if (z8Var.d) {
                    z8Var.d = false;
                    z8Var.f40893a.R();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.f31801i != 0) {
            float f10 = bounds.left;
            float f11 = bounds.top;
            te.h hVar = this.f31797c;
            canvas.saveLayer(f10, f11, f10 + hVar.d.f55516f.f55524a, f11 + this.f31798e, null);
            for (int size = hVar.f55519b.size() - 1; size >= 0; size--) {
                te.e i7 = hVar.i(size);
                RectF b10 = i7.b();
                Object obj = i7.f55507a;
                float f12 = i7.f55511f.f55524a;
                float c10 = i7.c();
                float width = b10.width() - f12;
                float f13 = f10 + b10.left + f12;
                float f14 = width / 2.0f;
                float f15 = f13 + f14;
                float f16 = f11 + f14;
                canvas.save();
                canvas.scale(c10, c10, f15, f16);
                canvas.drawCircle(f15, f16, f14 + this.f31800g, org.telegram.ui.ActionBar.m6.Cm);
                z8 z8Var = (z8) obj;
                z8Var.f40893a.y0(f13, f11, width, width);
                z8Var.f40893a.setAlpha((this.f31801i / 255.0f) * i7.c());
                z8Var.f40893a.h(canvas, null);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void d(List list, boolean z9) {
        z8 z8Var;
        te.h hVar = this.f31797c;
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
                        z8Var = (z8) obj;
                        if (z8Var.f40895c == o4) {
                            break;
                        }
                    } else {
                        z8Var = null;
                        break;
                    }
                }
                if (z8Var == null) {
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            z8Var = (z8) obj2;
                            if (z8Var.f40895c == 0) {
                                break;
                            }
                        } else {
                            z8Var = null;
                            break;
                        }
                    }
                }
                if (z8Var == null) {
                    z8Var = new z8(this, this.f31795a);
                    arrayList2.add(z8Var);
                }
                z8 z8Var2 = z8Var;
                ImageReceiver imageReceiver = z8Var2.f40893a;
                v8 v8Var = z8Var2.f40894b;
                if (z8Var2.f40895c != o4) {
                    z8Var2.f40895c = o4;
                    TLObject e22 = org.telegram.messenger.qp.s1(this.f31796b).e2(o4);
                    if (e22 != null) {
                        v8Var.p(e22);
                        imageReceiver.i0(e22, v8Var, null);
                    } else {
                        v8Var.k(o4, "", "", null);
                        imageReceiver.f();
                    }
                }
                arrayList.add(z8Var2);
                if (this.d && !z8Var2.d) {
                    z8Var2.d = true;
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
        return this.f31801i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f31801i = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
