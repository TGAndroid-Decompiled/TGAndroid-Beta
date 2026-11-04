package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f01 {
    public final int f33620a;
    public final View f33621b;
    public final org.telegram.ui.ActionBar.e6 f33622c;
    public final boolean d;
    public ly0 f33623e;
    public final ImageReceiver f33625g;
    public g5 h;
    public rg.b f33626i;
    public int f33628k;
    public int f33629l;
    public boolean f33630m;
    public boolean f33631n;
    public final Paint f33632o;
    public final Path f33633p;
    public final RectF f33634q;
    public final gc f33635r;
    public Runnable f33636s;
    public long f33637t;
    public final u8 f33624f = new u8((org.telegram.ui.ActionBar.e6) null);
    public final Path f33627j = new Path();

    public f01(int i3, View view, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f33632o = paint;
        Path path = new Path();
        this.f33633p = path;
        this.f33634q = new RectF();
        this.f33620a = i3;
        this.f33621b = view;
        this.f33622c = e6Var;
        this.d = z10;
        this.f33635r = new gc(view);
        this.f33625g = new ImageReceiver(view);
        path.rewind();
        path.moveTo(-org.telegram.messenger.g0.L(1.75f), -org.telegram.messenger.g0.L(4.0f));
        path.lineTo(org.telegram.messenger.g0.L(1.75f), 0.0f);
        path.lineTo(-org.telegram.messenger.g0.L(1.75f), org.telegram.messenger.g0.L(4.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a() {
        this.f33625g.P();
        g5 g5Var = this.h;
        if (g5Var != null) {
            g5Var.a(this.f33621b);
        }
    }

    public final void b() {
        this.f33625g.R();
        g5 g5Var = this.h;
        if (g5Var != null) {
            g5Var.n(this.f33621b);
        }
    }

    public final void c(Canvas canvas, int i3, float f10, float f11, float f12, float f13, boolean z10) {
        float f14;
        float f15;
        int i10;
        ly0 ly0Var = this.f33623e;
        if (ly0Var != null) {
            ly0Var.f35929p = i3 - org.telegram.messenger.g0.L(144.66f);
            float k10 = this.f33623e.k() + org.telegram.messenger.g0.L(48.66f);
            float f16 = i3;
            float f17 = (f16 - k10) / 2.0f;
            int i11 = this.f33629l;
            int i12 = (int) k10;
            boolean z11 = this.d;
            Path path = this.f33627j;
            if (i11 == i12 && this.f33628k == i3 && this.f33631n == z10 && this.f33630m == z11) {
                f15 = k10;
                f14 = 2.0f;
            } else {
                path.rewind();
                RectF rectF = org.telegram.messenger.g0.P;
                f14 = 2.0f;
                rectF.set(f17, org.telegram.messenger.g0.L(4.5f), f17 + k10, org.telegram.messenger.g0.L(28.5f));
                if (z10) {
                    path.addRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
                }
                if (z11) {
                    float f18 = f16 / 2.0f;
                    float f19 = 1.833f;
                    float L = f18 - org.telegram.messenger.g0.L(1.833f);
                    while (L > 0.0f) {
                        RectF rectF2 = org.telegram.messenger.g0.P;
                        rectF2.set(L - org.telegram.messenger.g0.L(3.66f), org.telegram.messenger.g0.L(15.5f), L, org.telegram.messenger.g0.L(17.5f));
                        path.addRoundRect(rectF2, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), Path.Direction.CW);
                        L -= org.telegram.messenger.g0.L(8.33f);
                        f19 = f19;
                        f16 = f16;
                        k10 = k10;
                    }
                    float f20 = f16;
                    f15 = k10;
                    int L2 = org.telegram.messenger.g0.L(f19);
                    while (true) {
                        f18 += L2;
                        if (f18 >= f20) {
                            break;
                        }
                        RectF rectF3 = org.telegram.messenger.g0.P;
                        rectF3.set(f18, org.telegram.messenger.g0.L(15.5f), org.telegram.messenger.g0.L(3.66f) + f18, org.telegram.messenger.g0.L(17.5f));
                        path.addRoundRect(rectF3, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), Path.Direction.CW);
                        L2 = org.telegram.messenger.g0.L(8.33f);
                    }
                } else {
                    f15 = k10;
                }
                this.f33629l = i12;
                this.f33628k = i3;
                this.f33630m = z11;
                this.f33631n = z10;
            }
            canvas.save();
            float f21 = f10 / f14;
            canvas.translate(f21, f11);
            org.telegram.ui.ActionBar.e6 e6Var = this.f33622c;
            Paint W0 = org.telegram.ui.ActionBar.k6.W0("paintChatActionBackground", e6Var);
            int alpha = W0.getAlpha();
            W0.setAlpha((int) (alpha * f13 * f12));
            canvas.drawPath(path, W0);
            W0.setAlpha(alpha);
            if (e6Var != null ? e6Var.g() : org.telegram.ui.ActionBar.k6.d1()) {
                Paint W02 = org.telegram.ui.ActionBar.k6.W0("paintChatActionBackgroundDarken", e6Var);
                int alpha2 = W02.getAlpha();
                W02.setAlpha((int) (alpha2 * f13 * f12));
                canvas.drawPath(path, W02);
                W02.setAlpha(alpha2);
            }
            canvas.restore();
            float f22 = f21 + f17;
            float f23 = f22 + f15;
            this.f33634q.set(f22 - org.telegram.messenger.g0.L(4.0f), f11 - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + f23, org.telegram.messenger.g0.L(32.0f) + f11);
            if (z10) {
                g5 g5Var = this.h;
                if (g5Var != null) {
                    g5Var.setBounds((int) (org.telegram.messenger.g0.L(2.66f) + f22), (int) (org.telegram.messenger.g0.L(6.5f) + f11), (int) (org.telegram.messenger.g0.L(22.66f) + f22), (int) (org.telegram.messenger.g0.L(26.5f) + f11));
                    this.h.setAlpha((int) (255.0f * f13));
                    this.h.draw(canvas);
                } else {
                    rg.b bVar = this.f33626i;
                    if (bVar != null) {
                        bVar.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28216v8, e6Var));
                    }
                    ImageReceiver imageReceiver = this.f33625g;
                    imageReceiver.y0(org.telegram.messenger.g0.L(2.66f) + f22, org.telegram.messenger.g0.L(6.5f) + f11, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
                    imageReceiver.setAlpha(f13);
                    imageReceiver.h(canvas, null);
                }
                if (org.telegram.ui.ActionBar.k6.i1(e6Var)) {
                    i10 = org.telegram.ui.ActionBar.k6.f28294za;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.Wc;
                }
                int w02 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
                this.f33623e.c(f22 + org.telegram.messenger.g0.L(27.66f), org.telegram.messenger.g0.L(16.5f) + f11, f13, w02, canvas);
                canvas.save();
                canvas.translate(f23 - org.telegram.messenger.g0.L(11.25f), org.telegram.messenger.g0.L(16.5f) + f11);
                int r12 = org.telegram.ui.ActionBar.k6.r1(0.75f * f13, w02);
                Paint paint = this.f33632o;
                paint.setColor(r12);
                paint.setStrokeWidth(org.telegram.messenger.g0.L(1.66f));
                canvas.drawPath(this.f33633p, paint);
                canvas.restore();
            }
        }
    }

    public final boolean d(android.view.MotionEvent r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f01.d(android.view.MotionEvent, boolean):boolean");
    }

    public final boolean e(org.telegram.messenger.zi ziVar) {
        g5 g5Var = this.h;
        View view = this.f33621b;
        if (g5Var != null) {
            g5Var.n(view);
            this.h = null;
        }
        this.f33629l = 0;
        this.f33637t = 0L;
        this.f33626i = null;
        if (ziVar == null) {
            this.f33623e = null;
            this.f33637t = 0L;
        } else {
            int i3 = this.f33620a;
            boolean p02 = org.telegram.messenger.t3.p0(org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-org.telegram.messenger.zi.B0(ziVar.f26868k))));
            ImageReceiver imageReceiver = this.f33625g;
            if (p02) {
                imageReceiver.J0(org.telegram.messenger.g0.L(10.0f));
                long v12 = org.telegram.messenger.zi.v1(ziVar.f26868k);
                TLObject e22 = org.telegram.messenger.hp.s1(i3).e2(v12);
                this.f33637t = v12;
                if (e22 == null) {
                    this.f33623e = null;
                    return false;
                }
                u8 u8Var = this.f33624f;
                u8Var.l(e22);
                imageReceiver.i0(e22, u8Var, null);
                this.f33623e = new ly0(org.telegram.messenger.m5.m(e22), 14.0f, org.telegram.messenger.g0.o());
            } else {
                imageReceiver.J0(0);
                long Z1 = ziVar.Z1();
                this.f33637t = Z1;
                TLRPC.TL_forumTopic f10 = org.telegram.messenger.hp.s1(i3).f23102q7.f(-org.telegram.messenger.zi.B0(ziVar.f26868k), Z1);
                if (f10 == null) {
                    this.f33623e = null;
                    return false;
                }
                if (Z1 == 1) {
                    rg.b c2 = rg.c.c(view.getContext(), 0.75f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28216v8, this.f33622c), false);
                    this.f33626i = c2;
                    imageReceiver.w0(c2);
                } else if (f10.icon_emoji_id != 0) {
                    this.h = new g5(0, i3, f10.icon_emoji_id);
                    imageReceiver.R();
                    this.h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.w0(rg.c.e(f10));
                }
                this.f33623e = new ly0(f10.title, 14.0f, org.telegram.messenger.g0.o());
            }
        }
        if (this.f33623e == null) {
            return false;
        }
        return true;
    }
}
