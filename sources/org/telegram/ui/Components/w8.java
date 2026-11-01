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
public final class w8 extends Drawable {
    public final View f32165a;
    public final int f32166b;
    public boolean d;
    public final int e;
    public final int f32168f;
    public final float f32169g;
    public final fe.k f32167c = new fe.k(new n2.u(this, 9), gr.h, 380);
    public final ArrayList h = new ArrayList();
    public int f32170i = 255;

    public w8(int i10, View view, int i11, int i12, float f7) {
        this.f32166b = i10;
        this.f32165a = view;
        this.e = i11;
        this.f32168f = i12;
        this.f32169g = f7;
    }

    public final void a() {
        if (!this.d) {
            this.d = true;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                v8 v8Var = (v8) obj;
                if (v8Var.f31224c != 0 && !v8Var.d) {
                    v8Var.d = true;
                    v8Var.f31222a.P();
                }
            }
        }
    }

    public final void b() {
        if (this.d) {
            this.d = false;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                v8 v8Var = (v8) obj;
                if (v8Var.d) {
                    v8Var.d = false;
                    v8Var.f31222a.R();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.f32170i != 0) {
            float f7 = bounds.left;
            float f10 = bounds.top;
            fe.k kVar = this.f32167c;
            canvas.saveLayer(f7, f10, f7 + kVar.d.f7042f.f7049a, f10 + this.e, null);
            for (int size = kVar.f7045b.size() - 1; size >= 0; size--) {
                fe.h m10 = kVar.m(size);
                RectF b10 = m10.b();
                Object obj = m10.f7035a;
                float f11 = m10.f7038f.f7049a;
                float c10 = m10.c();
                float width = b10.width() - f11;
                float f12 = f7 + b10.left + f11;
                float f13 = width / 2.0f;
                float f14 = f12 + f13;
                float f15 = f10 + f13;
                canvas.save();
                canvas.scale(c10, c10, f14, f15);
                canvas.drawCircle(f14, f15, f13 + this.f32169g, org.telegram.ui.ActionBar.t6.Cm);
                v8 v8Var = (v8) obj;
                v8Var.f31222a.y0(f12, f10, width, width);
                v8Var.f31222a.setAlpha((this.f32170i / 255.0f) * m10.c());
                v8Var.f31222a.h(canvas, null);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void d(List list, boolean z10) {
        v8 v8Var;
        fe.k kVar = this.f32167c;
        if (list != null && !list.isEmpty()) {
            if (!z10) {
                kVar.q(null, false);
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long o10 = org.telegram.messenger.o5.o((TLRPC.Peer) it.next());
                ArrayList arrayList2 = this.h;
                int size = arrayList2.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        v8Var = (v8) obj;
                        if (v8Var.f31224c == o10) {
                            break;
                        }
                    } else {
                        v8Var = null;
                        break;
                    }
                }
                if (v8Var == null) {
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size2) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            v8Var = (v8) obj2;
                            if (v8Var.f31224c == 0) {
                                break;
                            }
                        } else {
                            v8Var = null;
                            break;
                        }
                    }
                }
                if (v8Var == null) {
                    v8Var = new v8(this, this.f32165a);
                    arrayList2.add(v8Var);
                }
                v8 v8Var2 = v8Var;
                ImageReceiver imageReceiver = v8Var2.f31222a;
                r8 r8Var = v8Var2.f31223b;
                if (v8Var2.f31224c != o10) {
                    v8Var2.f31224c = o10;
                    TLObject d22 = org.telegram.messenger.wp.r1(this.f32166b).d2(o10);
                    if (d22 != null) {
                        r8Var.p(d22);
                        imageReceiver.i0(d22, r8Var, null);
                    } else {
                        r8Var.k(o10, "", "", null);
                        imageReceiver.f();
                    }
                }
                arrayList.add(v8Var2);
                if (this.d && !v8Var2.d) {
                    v8Var2.d = true;
                    imageReceiver.P();
                }
            }
            kVar.q(arrayList, z10);
            return;
        }
        kVar.q(null, z10);
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    @Override
    public final int getAlpha() {
        return this.f32170i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f32170i = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
