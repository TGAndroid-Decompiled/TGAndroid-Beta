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
public final class g01 {
    public final int f33764a;
    public final View f33765b;
    public final org.telegram.ui.ActionBar.f6 f33766c;
    public final boolean d;
    public my0 f33767e;
    public final ImageReceiver f33769g;
    public i5 h;
    public qg.c f33770i;
    public int f33772k;
    public int f33773l;
    public boolean f33774m;
    public boolean f33775n;
    public final Paint f33776o;
    public final Path f33777p;
    public final RectF f33778q;
    public final ic f33779r;
    public Runnable f33780s;
    public long f33781t;
    public final w8 f33768f = new w8((org.telegram.ui.ActionBar.f6) null);
    public final Path f33771j = new Path();

    public g01(int i7, View view, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        Paint paint = new Paint(1);
        this.f33776o = paint;
        Path path = new Path();
        this.f33777p = path;
        this.f33778q = new RectF();
        this.f33764a = i7;
        this.f33765b = view;
        this.f33766c = f6Var;
        this.d = z9;
        this.f33779r = new ic(view);
        this.f33769g = new ImageReceiver(view);
        path.rewind();
        path.moveTo(-org.telegram.messenger.g0.L(1.75f), -org.telegram.messenger.g0.L(4.0f));
        path.lineTo(org.telegram.messenger.g0.L(1.75f), 0.0f);
        path.lineTo(-org.telegram.messenger.g0.L(1.75f), org.telegram.messenger.g0.L(4.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a() {
        this.f33769g.P();
        i5 i5Var = this.h;
        if (i5Var != null) {
            i5Var.a(this.f33765b);
        }
    }

    public final void b() {
        this.f33769g.R();
        i5 i5Var = this.h;
        if (i5Var != null) {
            i5Var.n(this.f33765b);
        }
    }

    public final void c(Canvas canvas, int i7, float f10, float f11, float f12, float f13, boolean z9) {
        float f14;
        float f15;
        int i10;
        my0 my0Var = this.f33767e;
        if (my0Var != null) {
            my0Var.f36158p = i7 - org.telegram.messenger.g0.L(144.66f);
            float k10 = this.f33767e.k() + org.telegram.messenger.g0.L(48.66f);
            float f16 = i7;
            float f17 = (f16 - k10) / 2.0f;
            int i11 = this.f33773l;
            int i12 = (int) k10;
            boolean z10 = this.d;
            Path path = this.f33771j;
            if (i11 == i12 && this.f33772k == i7 && this.f33775n == z9 && this.f33774m == z10) {
                f15 = k10;
                f14 = 2.0f;
            } else {
                path.rewind();
                RectF rectF = org.telegram.messenger.g0.P;
                f14 = 2.0f;
                rectF.set(f17, org.telegram.messenger.g0.L(4.5f), f17 + k10, org.telegram.messenger.g0.L(28.5f));
                if (z9) {
                    path.addRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
                }
                if (z10) {
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
                this.f33773l = i12;
                this.f33772k = i7;
                this.f33774m = z10;
                this.f33775n = z9;
            }
            canvas.save();
            float f21 = f10 / f14;
            canvas.translate(f21, f11);
            org.telegram.ui.ActionBar.f6 f6Var = this.f33766c;
            Paint W0 = org.telegram.ui.ActionBar.k6.W0("paintChatActionBackground", f6Var);
            int alpha = W0.getAlpha();
            W0.setAlpha((int) (alpha * f13 * f12));
            canvas.drawPath(path, W0);
            W0.setAlpha(alpha);
            if (f6Var != null ? f6Var.g() : org.telegram.ui.ActionBar.k6.d1()) {
                Paint W02 = org.telegram.ui.ActionBar.k6.W0("paintChatActionBackgroundDarken", f6Var);
                int alpha2 = W02.getAlpha();
                W02.setAlpha((int) (alpha2 * f13 * f12));
                canvas.drawPath(path, W02);
                W02.setAlpha(alpha2);
            }
            canvas.restore();
            float f22 = f21 + f17;
            float f23 = f22 + f15;
            this.f33778q.set(f22 - org.telegram.messenger.g0.L(4.0f), f11 - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + f23, org.telegram.messenger.g0.L(32.0f) + f11);
            if (z9) {
                i5 i5Var = this.h;
                if (i5Var != null) {
                    i5Var.setBounds((int) (org.telegram.messenger.g0.L(2.66f) + f22), (int) (org.telegram.messenger.g0.L(6.5f) + f11), (int) (org.telegram.messenger.g0.L(22.66f) + f22), (int) (org.telegram.messenger.g0.L(26.5f) + f11));
                    this.h.setAlpha((int) (255.0f * f13));
                    this.h.draw(canvas);
                } else {
                    qg.c cVar = this.f33770i;
                    if (cVar != null) {
                        cVar.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28189v8, f6Var));
                    }
                    ImageReceiver imageReceiver = this.f33769g;
                    imageReceiver.y0(org.telegram.messenger.g0.L(2.66f) + f22, org.telegram.messenger.g0.L(6.5f) + f11, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
                    imageReceiver.setAlpha(f13);
                    imageReceiver.h(canvas, null);
                }
                if (org.telegram.ui.ActionBar.k6.i1(f6Var)) {
                    i10 = org.telegram.ui.ActionBar.k6.f28265za;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.Wc;
                }
                int w02 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
                this.f33767e.c(f22 + org.telegram.messenger.g0.L(27.66f), org.telegram.messenger.g0.L(16.5f) + f11, f13, w02, canvas);
                canvas.save();
                canvas.translate(f23 - org.telegram.messenger.g0.L(11.25f), org.telegram.messenger.g0.L(16.5f) + f11);
                int r12 = org.telegram.ui.ActionBar.k6.r1(0.75f * f13, w02);
                Paint paint = this.f33776o;
                paint.setColor(r12);
                paint.setStrokeWidth(org.telegram.messenger.g0.L(1.66f));
                canvas.drawPath(this.f33777p, paint);
                canvas.restore();
            }
        }
    }

    public final boolean d(android.view.MotionEvent r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g01.d(android.view.MotionEvent, boolean):boolean");
    }

    public final boolean e(org.telegram.messenger.ij ijVar) {
        i5 i5Var = this.h;
        View view = this.f33765b;
        if (i5Var != null) {
            i5Var.n(view);
            this.h = null;
        }
        this.f33773l = 0;
        this.f33781t = 0L;
        this.f33770i = null;
        if (ijVar == null) {
            this.f33767e = null;
            this.f33781t = 0L;
        } else {
            int i7 = this.f33764a;
            boolean p02 = org.telegram.messenger.t3.p0(org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-org.telegram.messenger.ij.B0(ijVar.f23262k))));
            ImageReceiver imageReceiver = this.f33769g;
            if (p02) {
                imageReceiver.J0(org.telegram.messenger.g0.L(10.0f));
                long v12 = org.telegram.messenger.ij.v1(ijVar.f23262k);
                TLObject e22 = org.telegram.messenger.qp.s1(i7).e2(v12);
                this.f33781t = v12;
                if (e22 == null) {
                    this.f33767e = null;
                    return false;
                }
                w8 w8Var = this.f33768f;
                w8Var.l(e22);
                imageReceiver.i0(e22, w8Var, null);
                this.f33767e = new my0(org.telegram.messenger.m5.m(e22), 14.0f, org.telegram.messenger.g0.o());
            } else {
                imageReceiver.J0(0);
                long Z1 = ijVar.Z1();
                this.f33781t = Z1;
                TLRPC.TL_forumTopic f10 = org.telegram.messenger.qp.s1(i7).f24877q7.f(-org.telegram.messenger.ij.B0(ijVar.f23262k), Z1);
                if (f10 == null) {
                    this.f33767e = null;
                    return false;
                }
                if (Z1 == 1) {
                    qg.c c10 = qg.d.c(view.getContext(), 0.75f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28189v8, this.f33766c), false);
                    this.f33770i = c10;
                    imageReceiver.w0(c10);
                } else if (f10.icon_emoji_id != 0) {
                    this.h = new i5(0, i7, f10.icon_emoji_id);
                    imageReceiver.R();
                    this.h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.w0(qg.d.e(f10));
                }
                this.f33767e = new my0(f10.title, 14.0f, org.telegram.messenger.g0.o());
            }
        }
        if (this.f33767e == null) {
            return false;
        }
        return true;
    }
}
