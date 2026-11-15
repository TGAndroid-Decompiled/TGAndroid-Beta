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
public final class i01 {
    public final int f35385a;
    public final View f35386b;
    public final org.telegram.ui.ActionBar.e6 f35387c;
    public final boolean d;
    public oy0 f35388e;
    public final ImageReceiver f35390g;
    public g5 h;
    public qg.b f35391i;
    public int f35393k;
    public int f35394l;
    public boolean f35395m;
    public boolean f35396n;
    public final Paint f35397o;
    public final Path f35398p;
    public final RectF f35399q;
    public final dc f35400r;
    public Runnable f35401s;
    public long f35402t;
    public final t8 f35389f = new t8((org.telegram.ui.ActionBar.e6) null);
    public final Path f35392j = new Path();

    public i01(int i7, View view, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f35397o = paint;
        Path path = new Path();
        this.f35398p = path;
        this.f35399q = new RectF();
        this.f35385a = i7;
        this.f35386b = view;
        this.f35387c = e6Var;
        this.d = z10;
        this.f35400r = new dc(view);
        this.f35390g = new ImageReceiver(view);
        path.rewind();
        path.moveTo(-org.telegram.messenger.g0.L(1.75f), -org.telegram.messenger.g0.L(4.0f));
        path.lineTo(org.telegram.messenger.g0.L(1.75f), 0.0f);
        path.lineTo(-org.telegram.messenger.g0.L(1.75f), org.telegram.messenger.g0.L(4.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a() {
        this.f35390g.P();
        g5 g5Var = this.h;
        if (g5Var != null) {
            g5Var.a(this.f35386b);
        }
    }

    public final void b() {
        this.f35390g.R();
        g5 g5Var = this.h;
        if (g5Var != null) {
            g5Var.n(this.f35386b);
        }
    }

    public final void c(Canvas canvas, int i7, float f10, float f11, float f12, float f13, boolean z10) {
        float f14;
        float f15;
        int i10;
        oy0 oy0Var = this.f35388e;
        if (oy0Var != null) {
            oy0Var.f38114p = i7 - org.telegram.messenger.g0.L(144.66f);
            float k10 = this.f35388e.k() + org.telegram.messenger.g0.L(48.66f);
            float f16 = i7;
            float f17 = (f16 - k10) / 2.0f;
            int i11 = this.f35394l;
            int i12 = (int) k10;
            boolean z11 = this.d;
            Path path = this.f35392j;
            if (i11 == i12 && this.f35393k == i7 && this.f35396n == z10 && this.f35395m == z11) {
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
                this.f35394l = i12;
                this.f35393k = i7;
                this.f35395m = z11;
                this.f35396n = z10;
            }
            canvas.save();
            float f21 = f10 / f14;
            canvas.translate(f21, f11);
            org.telegram.ui.ActionBar.e6 e6Var = this.f35387c;
            Paint W0 = org.telegram.ui.ActionBar.j6.W0("paintChatActionBackground", e6Var);
            int alpha = W0.getAlpha();
            W0.setAlpha((int) (alpha * f13 * f12));
            canvas.drawPath(path, W0);
            W0.setAlpha(alpha);
            if (e6Var != null ? e6Var.g() : org.telegram.ui.ActionBar.j6.d1()) {
                Paint W02 = org.telegram.ui.ActionBar.j6.W0("paintChatActionBackgroundDarken", e6Var);
                int alpha2 = W02.getAlpha();
                W02.setAlpha((int) (alpha2 * f13 * f12));
                canvas.drawPath(path, W02);
                W02.setAlpha(alpha2);
            }
            canvas.restore();
            float f22 = f21 + f17;
            float f23 = f22 + f15;
            this.f35399q.set(f22 - org.telegram.messenger.g0.L(4.0f), f11 - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + f23, org.telegram.messenger.g0.L(32.0f) + f11);
            if (z10) {
                g5 g5Var = this.h;
                if (g5Var != null) {
                    g5Var.setBounds((int) (org.telegram.messenger.g0.L(2.66f) + f22), (int) (org.telegram.messenger.g0.L(6.5f) + f11), (int) (org.telegram.messenger.g0.L(22.66f) + f22), (int) (org.telegram.messenger.g0.L(26.5f) + f11));
                    this.h.setAlpha((int) (255.0f * f13));
                    this.h.draw(canvas);
                } else {
                    qg.b bVar = this.f35391i;
                    if (bVar != null) {
                        bVar.a(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29186v8, e6Var));
                    }
                    ImageReceiver imageReceiver = this.f35390g;
                    imageReceiver.y0(org.telegram.messenger.g0.L(2.66f) + f22, org.telegram.messenger.g0.L(6.5f) + f11, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
                    imageReceiver.setAlpha(f13);
                    imageReceiver.h(canvas, null);
                }
                if (org.telegram.ui.ActionBar.j6.i1(e6Var)) {
                    i10 = org.telegram.ui.ActionBar.j6.f29264za;
                } else {
                    i10 = org.telegram.ui.ActionBar.j6.Zc;
                }
                int w02 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
                this.f35388e.c(f22 + org.telegram.messenger.g0.L(27.66f), org.telegram.messenger.g0.L(16.5f) + f11, f13, w02, canvas);
                canvas.save();
                canvas.translate(f23 - org.telegram.messenger.g0.L(11.25f), org.telegram.messenger.g0.L(16.5f) + f11);
                int r12 = org.telegram.ui.ActionBar.j6.r1(0.75f * f13, w02);
                Paint paint = this.f35397o;
                paint.setColor(r12);
                paint.setStrokeWidth(org.telegram.messenger.g0.L(1.66f));
                canvas.drawPath(this.f35398p, paint);
                canvas.restore();
            }
        }
    }

    public final boolean d(android.view.MotionEvent r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i01.d(android.view.MotionEvent, boolean):boolean");
    }

    public final boolean e(org.telegram.messenger.gj gjVar) {
        g5 g5Var = this.h;
        View view = this.f35386b;
        if (g5Var != null) {
            g5Var.n(view);
            this.h = null;
        }
        this.f35394l = 0;
        this.f35402t = 0L;
        this.f35391i = null;
        if (gjVar == null) {
            this.f35388e = null;
            this.f35402t = 0L;
        } else {
            int i7 = this.f35385a;
            boolean p02 = org.telegram.messenger.t3.p0(org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-org.telegram.messenger.gj.B0(gjVar.f23819k))));
            ImageReceiver imageReceiver = this.f35390g;
            if (p02) {
                imageReceiver.J0(org.telegram.messenger.g0.L(10.0f));
                long u12 = org.telegram.messenger.gj.u1(gjVar.f23819k);
                TLObject e22 = org.telegram.messenger.np.s1(i7).e2(u12);
                this.f35402t = u12;
                if (e22 == null) {
                    this.f35388e = null;
                    return false;
                }
                t8 t8Var = this.f35389f;
                t8Var.l(e22);
                imageReceiver.i0(e22, t8Var, null);
                this.f35388e = new oy0(org.telegram.messenger.m5.m(e22), 14.0f, org.telegram.messenger.g0.o());
            } else {
                imageReceiver.J0(0);
                long Y1 = gjVar.Y1();
                this.f35402t = Y1;
                TLRPC.TL_forumTopic f10 = org.telegram.messenger.np.s1(i7).f25386r7.f(-org.telegram.messenger.gj.B0(gjVar.f23819k), Y1);
                if (f10 == null) {
                    this.f35388e = null;
                    return false;
                }
                if (Y1 == 1) {
                    qg.b c10 = qg.c.c(view.getContext(), 0.75f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29186v8, this.f35387c), false);
                    this.f35391i = c10;
                    imageReceiver.w0(c10);
                } else if (f10.icon_emoji_id != 0) {
                    this.h = new g5(0, i7, f10.icon_emoji_id);
                    imageReceiver.R();
                    this.h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.w0(qg.c.e(f10));
                }
                this.f35388e = new oy0(f10.title, 14.0f, org.telegram.messenger.g0.o());
            }
        }
        if (this.f35388e == null) {
            return false;
        }
        return true;
    }
}
