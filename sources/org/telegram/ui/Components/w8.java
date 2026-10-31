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
    public final View f32099a;
    public final int f32100b;
    public boolean d;
    public final int e;
    public final int f32102f;
    public final float f32103g;
    public final fe.k f32101c = new fe.k(new n2.u(this, 9), gr.h, 380);
    public final ArrayList h = new ArrayList();
    public int f32104i = 255;

    public w8(int i10, View view, int i11, int i12, float f7) {
        this.f32100b = i10;
        this.f32099a = view;
        this.e = i11;
        this.f32102f = i12;
        this.f32103g = f7;
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
                if (v8Var.f31189c != 0 && !v8Var.d) {
                    v8Var.d = true;
                    v8Var.f31187a.P();
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
                    v8Var.f31187a.R();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.f32104i != 0) {
            float f7 = bounds.left;
            float f10 = bounds.top;
            fe.k kVar = this.f32101c;
            canvas.saveLayer(f7, f10, f7 + kVar.d.f7041f.f7048a, f10 + this.e, null);
            for (int size = kVar.f7044b.size() - 1; size >= 0; size--) {
                fe.h m10 = kVar.m(size);
                RectF b10 = m10.b();
                Object obj = m10.f7034a;
                float f11 = m10.f7037f.f7048a;
                float c10 = m10.c();
                float width = b10.width() - f11;
                float f12 = f7 + b10.left + f11;
                float f13 = width / 2.0f;
                float f14 = f12 + f13;
                float f15 = f10 + f13;
                canvas.save();
                canvas.scale(c10, c10, f14, f15);
                canvas.drawCircle(f14, f15, f13 + this.f32103g, org.telegram.ui.ActionBar.t6.Cm);
                v8 v8Var = (v8) obj;
                v8Var.f31187a.y0(f12, f10, width, width);
                v8Var.f31187a.setAlpha((this.f32104i / 255.0f) * m10.c());
                v8Var.f31187a.h(canvas, null);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void d(List list, boolean z10) {
        v8 v8Var;
        fe.k kVar = this.f32101c;
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
                        if (v8Var.f31189c == o10) {
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
                            if (v8Var.f31189c == 0) {
                                break;
                            }
                        } else {
                            v8Var = null;
                            break;
                        }
                    }
                }
                if (v8Var == null) {
                    v8Var = new v8(this, this.f32099a);
                    arrayList2.add(v8Var);
                }
                v8 v8Var2 = v8Var;
                ImageReceiver imageReceiver = v8Var2.f31187a;
                r8 r8Var = v8Var2.f31188b;
                if (v8Var2.f31189c != o10) {
                    v8Var2.f31189c = o10;
                    TLObject d22 = org.telegram.messenger.vp.r1(this.f32100b).d2(o10);
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
        return this.f32104i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f32104i = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
