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
public final class r01 {
    public final int f39029a;
    public final View f39030b;
    public final org.telegram.ui.ActionBar.h6 f39031c;
    public final boolean d;
    public xy0 f39032e;
    public final ImageReceiver f39034g;
    public p5 h;
    public qg.b f39035i;
    public int f39037k;
    public int f39038l;
    public boolean f39039m;
    public boolean f39040n;
    public final Paint f39041o;
    public final Path f39042p;
    public final RectF f39043q;
    public final mc f39044r;
    public Runnable f39045s;
    public long f39046t;
    public final b9 f39033f = new b9((org.telegram.ui.ActionBar.h6) null);
    public final Path f39036j = new Path();

    public r01(int i7, View view, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f39041o = paint;
        Path path = new Path();
        this.f39042p = path;
        this.f39043q = new RectF();
        this.f39029a = i7;
        this.f39030b = view;
        this.f39031c = h6Var;
        this.d = z10;
        this.f39044r = new mc(view);
        this.f39034g = new ImageReceiver(view);
        path.rewind();
        path.moveTo(-org.telegram.messenger.g0.L(1.75f), -org.telegram.messenger.g0.L(4.0f));
        path.lineTo(org.telegram.messenger.g0.L(1.75f), 0.0f);
        path.lineTo(-org.telegram.messenger.g0.L(1.75f), org.telegram.messenger.g0.L(4.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a() {
        this.f39034g.P();
        p5 p5Var = this.h;
        if (p5Var != null) {
            p5Var.a(this.f39030b);
        }
    }

    public final void b() {
        this.f39034g.R();
        p5 p5Var = this.h;
        if (p5Var != null) {
            p5Var.n(this.f39030b);
        }
    }

    public final void c(Canvas canvas, int i7, float f10, float f11, float f12, float f13, boolean z10) {
        float f14;
        float f15;
        int i10;
        xy0 xy0Var = this.f39032e;
        if (xy0Var != null) {
            xy0Var.f42257p = i7 - org.telegram.messenger.g0.L(144.66f);
            float k10 = this.f39032e.k() + org.telegram.messenger.g0.L(48.66f);
            float f16 = i7;
            float f17 = (f16 - k10) / 2.0f;
            int i11 = this.f39038l;
            int i12 = (int) k10;
            boolean z11 = this.d;
            Path path = this.f39036j;
            if (i11 == i12 && this.f39037k == i7 && this.f39040n == z10 && this.f39039m == z11) {
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
                this.f39038l = i12;
                this.f39037k = i7;
                this.f39039m = z11;
                this.f39040n = z10;
            }
            canvas.save();
            float f21 = f10 / f14;
            canvas.translate(f21, f11);
            org.telegram.ui.ActionBar.h6 h6Var = this.f39031c;
            Paint W0 = org.telegram.ui.ActionBar.m6.W0("paintChatActionBackground", h6Var);
            int alpha = W0.getAlpha();
            W0.setAlpha((int) (alpha * f13 * f12));
            canvas.drawPath(path, W0);
            W0.setAlpha(alpha);
            if (h6Var != null ? h6Var.j() : org.telegram.ui.ActionBar.m6.d1()) {
                Paint W02 = org.telegram.ui.ActionBar.m6.W0("paintChatActionBackgroundDarken", h6Var);
                int alpha2 = W02.getAlpha();
                W02.setAlpha((int) (alpha2 * f13 * f12));
                canvas.drawPath(path, W02);
                W02.setAlpha(alpha2);
            }
            canvas.restore();
            float f22 = f21 + f17;
            float f23 = f22 + f15;
            this.f39043q.set(f22 - org.telegram.messenger.g0.L(4.0f), f11 - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + f23, org.telegram.messenger.g0.L(32.0f) + f11);
            if (z10) {
                p5 p5Var = this.h;
                if (p5Var != null) {
                    p5Var.setBounds((int) (org.telegram.messenger.g0.L(2.66f) + f22), (int) (org.telegram.messenger.g0.L(6.5f) + f11), (int) (org.telegram.messenger.g0.L(22.66f) + f22), (int) (org.telegram.messenger.g0.L(26.5f) + f11));
                    this.h.setAlpha((int) (255.0f * f13));
                    this.h.draw(canvas);
                } else {
                    qg.b bVar = this.f39035i;
                    if (bVar != null) {
                        bVar.a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29718v8, h6Var));
                    }
                    ImageReceiver imageReceiver = this.f39034g;
                    imageReceiver.y0(org.telegram.messenger.g0.L(2.66f) + f22, org.telegram.messenger.g0.L(6.5f) + f11, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
                    imageReceiver.setAlpha(f13);
                    imageReceiver.h(canvas, null);
                }
                if (org.telegram.ui.ActionBar.m6.i1(h6Var)) {
                    i10 = org.telegram.ui.ActionBar.m6.f29796za;
                } else {
                    i10 = org.telegram.ui.ActionBar.m6.Zc;
                }
                int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
                this.f39032e.c(f22 + org.telegram.messenger.g0.L(27.66f), org.telegram.messenger.g0.L(16.5f) + f11, f13, w02, canvas);
                canvas.save();
                canvas.translate(f23 - org.telegram.messenger.g0.L(11.25f), org.telegram.messenger.g0.L(16.5f) + f11);
                int r12 = org.telegram.ui.ActionBar.m6.r1(0.75f * f13, w02);
                Paint paint = this.f39041o;
                paint.setColor(r12);
                paint.setStrokeWidth(org.telegram.messenger.g0.L(1.66f));
                canvas.drawPath(this.f39042p, paint);
                canvas.restore();
            }
        }
    }

    public final boolean d(android.view.MotionEvent r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r01.d(android.view.MotionEvent, boolean):boolean");
    }

    public final boolean e(org.telegram.messenger.gj gjVar) {
        p5 p5Var = this.h;
        View view = this.f39030b;
        if (p5Var != null) {
            p5Var.n(view);
            this.h = null;
        }
        this.f39038l = 0;
        this.f39046t = 0L;
        this.f39035i = null;
        if (gjVar == null) {
            this.f39032e = null;
            this.f39046t = 0L;
        } else {
            int i7 = this.f39029a;
            boolean p02 = org.telegram.messenger.v3.p0(org.telegram.messenger.np.u1(i7).O0(Long.valueOf(-org.telegram.messenger.gj.B0(gjVar.f24213k))));
            ImageReceiver imageReceiver = this.f39034g;
            if (p02) {
                imageReceiver.J0(org.telegram.messenger.g0.L(10.0f));
                long u12 = org.telegram.messenger.gj.u1(gjVar.f24213k);
                TLObject g22 = org.telegram.messenger.np.u1(i7).g2(u12);
                this.f39046t = u12;
                if (g22 == null) {
                    this.f39032e = null;
                    return false;
                }
                b9 b9Var = this.f39033f;
                b9Var.l(g22);
                imageReceiver.i0(g22, b9Var, null);
                this.f39032e = new xy0(org.telegram.messenger.n5.m(g22), 14.0f, org.telegram.messenger.g0.o());
            } else {
                imageReceiver.J0(0);
                long Y1 = gjVar.Y1();
                this.f39046t = Y1;
                TLRPC.TL_forumTopic f10 = org.telegram.messenger.np.u1(i7).f25968t7.f(-org.telegram.messenger.gj.B0(gjVar.f24213k), Y1);
                if (f10 == null) {
                    this.f39032e = null;
                    return false;
                }
                if (Y1 == 1) {
                    qg.b d = qg.c.d(view.getContext(), 0.75f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29718v8, this.f39031c), false);
                    this.f39035i = d;
                    imageReceiver.w0(d);
                } else if (f10.icon_emoji_id != 0) {
                    this.h = new p5(0, i7, f10.icon_emoji_id);
                    imageReceiver.R();
                    this.h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.w0(qg.c.f(f10));
                }
                this.f39032e = new xy0(f10.title, 14.0f, org.telegram.messenger.g0.o());
            }
        }
        if (this.f39032e == null) {
            return false;
        }
        return true;
    }
}
