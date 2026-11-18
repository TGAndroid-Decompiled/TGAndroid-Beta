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
public final class q01 {
    public final int f38659a;
    public final View f38660b;
    public final org.telegram.ui.ActionBar.i6 f38661c;
    public final boolean d;
    public vy0 f38662e;
    public final ImageReceiver f38664g;
    public o5 h;
    public qg.b f38665i;
    public int f38667k;
    public int f38668l;
    public boolean f38669m;
    public boolean f38670n;
    public final Paint f38671o;
    public final Path f38672p;
    public final RectF f38673q;
    public final mc f38674r;
    public Runnable f38675s;
    public long f38676t;
    public final b9 f38663f = new b9((org.telegram.ui.ActionBar.i6) null);
    public final Path f38666j = new Path();

    public q01(int i7, View view, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f38671o = paint;
        Path path = new Path();
        this.f38672p = path;
        this.f38673q = new RectF();
        this.f38659a = i7;
        this.f38660b = view;
        this.f38661c = i6Var;
        this.d = z10;
        this.f38674r = new mc(view);
        this.f38664g = new ImageReceiver(view);
        path.rewind();
        path.moveTo(-org.telegram.messenger.g0.L(1.75f), -org.telegram.messenger.g0.L(4.0f));
        path.lineTo(org.telegram.messenger.g0.L(1.75f), 0.0f);
        path.lineTo(-org.telegram.messenger.g0.L(1.75f), org.telegram.messenger.g0.L(4.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a() {
        this.f38664g.P();
        o5 o5Var = this.h;
        if (o5Var != null) {
            o5Var.a(this.f38660b);
        }
    }

    public final void b() {
        this.f38664g.R();
        o5 o5Var = this.h;
        if (o5Var != null) {
            o5Var.n(this.f38660b);
        }
    }

    public final void c(Canvas canvas, int i7, float f10, float f11, float f12, float f13, boolean z10) {
        float f14;
        float f15;
        int i10;
        vy0 vy0Var = this.f38662e;
        if (vy0Var != null) {
            vy0Var.f41493p = i7 - org.telegram.messenger.g0.L(144.66f);
            float k10 = this.f38662e.k() + org.telegram.messenger.g0.L(48.66f);
            float f16 = i7;
            float f17 = (f16 - k10) / 2.0f;
            int i11 = this.f38668l;
            int i12 = (int) k10;
            boolean z11 = this.d;
            Path path = this.f38666j;
            if (i11 == i12 && this.f38667k == i7 && this.f38670n == z10 && this.f38669m == z11) {
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
                this.f38668l = i12;
                this.f38667k = i7;
                this.f38669m = z11;
                this.f38670n = z10;
            }
            canvas.save();
            float f21 = f10 / f14;
            canvas.translate(f21, f11);
            org.telegram.ui.ActionBar.i6 i6Var = this.f38661c;
            Paint W0 = org.telegram.ui.ActionBar.n6.W0("paintChatActionBackground", i6Var);
            int alpha = W0.getAlpha();
            W0.setAlpha((int) (alpha * f13 * f12));
            canvas.drawPath(path, W0);
            W0.setAlpha(alpha);
            if (i6Var != null ? i6Var.j() : org.telegram.ui.ActionBar.n6.d1()) {
                Paint W02 = org.telegram.ui.ActionBar.n6.W0("paintChatActionBackgroundDarken", i6Var);
                int alpha2 = W02.getAlpha();
                W02.setAlpha((int) (alpha2 * f13 * f12));
                canvas.drawPath(path, W02);
                W02.setAlpha(alpha2);
            }
            canvas.restore();
            float f22 = f21 + f17;
            float f23 = f22 + f15;
            this.f38673q.set(f22 - org.telegram.messenger.g0.L(4.0f), f11 - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + f23, org.telegram.messenger.g0.L(32.0f) + f11);
            if (z10) {
                o5 o5Var = this.h;
                if (o5Var != null) {
                    o5Var.setBounds((int) (org.telegram.messenger.g0.L(2.66f) + f22), (int) (org.telegram.messenger.g0.L(6.5f) + f11), (int) (org.telegram.messenger.g0.L(22.66f) + f22), (int) (org.telegram.messenger.g0.L(26.5f) + f11));
                    this.h.setAlpha((int) (255.0f * f13));
                    this.h.draw(canvas);
                } else {
                    qg.b bVar = this.f38665i;
                    if (bVar != null) {
                        bVar.a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29733v8, i6Var));
                    }
                    ImageReceiver imageReceiver = this.f38664g;
                    imageReceiver.y0(org.telegram.messenger.g0.L(2.66f) + f22, org.telegram.messenger.g0.L(6.5f) + f11, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
                    imageReceiver.setAlpha(f13);
                    imageReceiver.h(canvas, null);
                }
                if (org.telegram.ui.ActionBar.n6.i1(i6Var)) {
                    i10 = org.telegram.ui.ActionBar.n6.f29811za;
                } else {
                    i10 = org.telegram.ui.ActionBar.n6.Zc;
                }
                int w02 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
                this.f38662e.c(f22 + org.telegram.messenger.g0.L(27.66f), org.telegram.messenger.g0.L(16.5f) + f11, f13, w02, canvas);
                canvas.save();
                canvas.translate(f23 - org.telegram.messenger.g0.L(11.25f), org.telegram.messenger.g0.L(16.5f) + f11);
                int r12 = org.telegram.ui.ActionBar.n6.r1(0.75f * f13, w02);
                Paint paint = this.f38671o;
                paint.setColor(r12);
                paint.setStrokeWidth(org.telegram.messenger.g0.L(1.66f));
                canvas.drawPath(this.f38672p, paint);
                canvas.restore();
            }
        }
    }

    public final boolean d(android.view.MotionEvent r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q01.d(android.view.MotionEvent, boolean):boolean");
    }

    public final boolean e(org.telegram.messenger.fj fjVar) {
        o5 o5Var = this.h;
        View view = this.f38660b;
        if (o5Var != null) {
            o5Var.n(view);
            this.h = null;
        }
        this.f38668l = 0;
        this.f38676t = 0L;
        this.f38665i = null;
        if (fjVar == null) {
            this.f38662e = null;
            this.f38676t = 0L;
        } else {
            int i7 = this.f38659a;
            boolean p02 = org.telegram.messenger.v3.p0(org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-org.telegram.messenger.fj.B0(fjVar.f23968k))));
            ImageReceiver imageReceiver = this.f38664g;
            if (p02) {
                imageReceiver.J0(org.telegram.messenger.g0.L(10.0f));
                long u12 = org.telegram.messenger.fj.u1(fjVar.f23968k);
                TLObject g22 = org.telegram.messenger.mp.u1(i7).g2(u12);
                this.f38676t = u12;
                if (g22 == null) {
                    this.f38662e = null;
                    return false;
                }
                b9 b9Var = this.f38663f;
                b9Var.l(g22);
                imageReceiver.i0(g22, b9Var, null);
                this.f38662e = new vy0(org.telegram.messenger.n5.m(g22), 14.0f, org.telegram.messenger.g0.o());
            } else {
                imageReceiver.J0(0);
                long Y1 = fjVar.Y1();
                this.f38676t = Y1;
                TLRPC.TL_forumTopic f10 = org.telegram.messenger.mp.u1(i7).f25771t7.f(-org.telegram.messenger.fj.B0(fjVar.f23968k), Y1);
                if (f10 == null) {
                    this.f38662e = null;
                    return false;
                }
                if (Y1 == 1) {
                    qg.b d = qg.c.d(view.getContext(), 0.75f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29733v8, this.f38661c), false);
                    this.f38665i = d;
                    imageReceiver.w0(d);
                } else if (f10.icon_emoji_id != 0) {
                    this.h = new o5(0, i7, f10.icon_emoji_id);
                    imageReceiver.R();
                    this.h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.w0(qg.c.f(f10));
                }
                this.f38662e = new vy0(f10.title, 14.0f, org.telegram.messenger.g0.o());
            }
        }
        if (this.f38662e == null) {
            return false;
        }
        return true;
    }
}
