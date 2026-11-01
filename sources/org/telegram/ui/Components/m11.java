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
public final class m11 {
    public final int f28323a;
    public final View f28324b;
    public final org.telegram.ui.ActionBar.p6 f28325c;
    public final boolean d;
    public rz0 e;
    public final ImageReceiver f28327g;
    public f5 h;
    public gg.d f28328i;
    public int f28330k;
    public int f28331l;
    public boolean f28332m;
    public boolean f28333n;
    public final Paint f28334o;
    public final Path f28335p;
    public final RectF f28336q;
    public final dc f28337r;
    public Runnable f28338s;
    public long f28339t;
    public final r8 f28326f = new r8((org.telegram.ui.ActionBar.p6) null);
    public final Path f28329j = new Path();

    public m11(int i10, View view, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f28334o = paint;
        Path path = new Path();
        this.f28335p = path;
        this.f28336q = new RectF();
        this.f28323a = i10;
        this.f28324b = view;
        this.f28325c = p6Var;
        this.d = z10;
        this.f28337r = new dc(view);
        this.f28327g = new ImageReceiver(view);
        path.rewind();
        path.moveTo(-org.telegram.messenger.i0.L(1.75f), -org.telegram.messenger.i0.L(4.0f));
        path.lineTo(org.telegram.messenger.i0.L(1.75f), 0.0f);
        path.lineTo(-org.telegram.messenger.i0.L(1.75f), org.telegram.messenger.i0.L(4.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a() {
        this.f28327g.P();
        f5 f5Var = this.h;
        if (f5Var != null) {
            f5Var.a(this.f28324b);
        }
    }

    public final void b() {
        this.f28327g.R();
        f5 f5Var = this.h;
        if (f5Var != null) {
            f5Var.n(this.f28324b);
        }
    }

    public final void c(Canvas canvas, int i10, float f7, float f10, float f11, float f12, boolean z10) {
        float f13;
        float f14;
        int i11;
        rz0 rz0Var = this.e;
        if (rz0Var != null) {
            rz0Var.f30136p = i10 - org.telegram.messenger.i0.L(144.66f);
            float k10 = this.e.k() + org.telegram.messenger.i0.L(48.66f);
            float f15 = i10;
            float f16 = (f15 - k10) / 2.0f;
            int i12 = this.f28331l;
            int i13 = (int) k10;
            boolean z11 = this.d;
            Path path = this.f28329j;
            if (i12 == i13 && this.f28330k == i10 && this.f28333n == z10 && this.f28332m == z11) {
                f14 = k10;
                f13 = 2.0f;
            } else {
                path.rewind();
                RectF rectF = org.telegram.messenger.i0.P;
                f13 = 2.0f;
                rectF.set(f16, org.telegram.messenger.i0.L(4.5f), f16 + k10, org.telegram.messenger.i0.L(28.5f));
                if (z10) {
                    path.addRoundRect(rectF, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), Path.Direction.CW);
                }
                if (z11) {
                    float f17 = f15 / 2.0f;
                    float f18 = 1.833f;
                    float L = f17 - org.telegram.messenger.i0.L(1.833f);
                    while (L > 0.0f) {
                        RectF rectF2 = org.telegram.messenger.i0.P;
                        rectF2.set(L - org.telegram.messenger.i0.L(3.66f), org.telegram.messenger.i0.L(15.5f), L, org.telegram.messenger.i0.L(17.5f));
                        path.addRoundRect(rectF2, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), Path.Direction.CW);
                        L -= org.telegram.messenger.i0.L(8.33f);
                        f18 = f18;
                        f15 = f15;
                        k10 = k10;
                    }
                    float f19 = f15;
                    f14 = k10;
                    int L2 = org.telegram.messenger.i0.L(f18);
                    while (true) {
                        f17 += L2;
                        if (f17 >= f19) {
                            break;
                        }
                        RectF rectF3 = org.telegram.messenger.i0.P;
                        rectF3.set(f17, org.telegram.messenger.i0.L(15.5f), org.telegram.messenger.i0.L(3.66f) + f17, org.telegram.messenger.i0.L(17.5f));
                        path.addRoundRect(rectF3, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), Path.Direction.CW);
                        L2 = org.telegram.messenger.i0.L(8.33f);
                    }
                } else {
                    f14 = k10;
                }
                this.f28331l = i13;
                this.f28330k = i10;
                this.f28332m = z11;
                this.f28333n = z10;
            }
            canvas.save();
            float f20 = f7 / f13;
            canvas.translate(f20, f10);
            org.telegram.ui.ActionBar.p6 p6Var = this.f28325c;
            Paint W0 = org.telegram.ui.ActionBar.t6.W0("paintChatActionBackground", p6Var);
            int alpha = W0.getAlpha();
            W0.setAlpha((int) (alpha * f12 * f11));
            canvas.drawPath(path, W0);
            W0.setAlpha(alpha);
            if (p6Var != null ? p6Var.g() : org.telegram.ui.ActionBar.t6.d1()) {
                Paint W02 = org.telegram.ui.ActionBar.t6.W0("paintChatActionBackgroundDarken", p6Var);
                int alpha2 = W02.getAlpha();
                W02.setAlpha((int) (alpha2 * f12 * f11));
                canvas.drawPath(path, W02);
                W02.setAlpha(alpha2);
            }
            canvas.restore();
            float f21 = f20 + f16;
            float f22 = f21 + f14;
            this.f28336q.set(f21 - org.telegram.messenger.i0.L(4.0f), f10 - org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f) + f22, org.telegram.messenger.i0.L(32.0f) + f10);
            if (z10) {
                f5 f5Var = this.h;
                if (f5Var != null) {
                    f5Var.setBounds((int) (org.telegram.messenger.i0.L(2.66f) + f21), (int) (org.telegram.messenger.i0.L(6.5f) + f10), (int) (org.telegram.messenger.i0.L(22.66f) + f21), (int) (org.telegram.messenger.i0.L(26.5f) + f10));
                    this.h.setAlpha((int) (255.0f * f12));
                    this.h.draw(canvas);
                } else {
                    gg.d dVar = this.f28328i;
                    if (dVar != null) {
                        dVar.a(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21262v8, p6Var));
                    }
                    ImageReceiver imageReceiver = this.f28327g;
                    imageReceiver.y0(org.telegram.messenger.i0.L(2.66f) + f21, org.telegram.messenger.i0.L(6.5f) + f10, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f));
                    imageReceiver.setAlpha(f12);
                    imageReceiver.h(canvas, null);
                }
                if (org.telegram.ui.ActionBar.t6.i1(p6Var)) {
                    i11 = org.telegram.ui.ActionBar.t6.f21335za;
                } else {
                    i11 = org.telegram.ui.ActionBar.t6.Wc;
                }
                int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
                this.e.c(f21 + org.telegram.messenger.i0.L(27.66f), org.telegram.messenger.i0.L(16.5f) + f10, f12, w02, canvas);
                canvas.save();
                canvas.translate(f22 - org.telegram.messenger.i0.L(11.25f), org.telegram.messenger.i0.L(16.5f) + f10);
                int r12 = org.telegram.ui.ActionBar.t6.r1(0.75f * f12, w02);
                Paint paint = this.f28334o;
                paint.setColor(r12);
                paint.setStrokeWidth(org.telegram.messenger.i0.L(1.66f));
                canvas.drawPath(this.f28335p, paint);
                canvas.restore();
            }
        }
    }

    public final boolean d(android.view.MotionEvent r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m11.d(android.view.MotionEvent, boolean):boolean");
    }

    public final boolean e(org.telegram.messenger.kj kjVar) {
        f5 f5Var = this.h;
        View view = this.f28324b;
        if (f5Var != null) {
            f5Var.n(view);
            this.h = null;
        }
        this.f28331l = 0;
        this.f28339t = 0L;
        this.f28328i = null;
        if (kjVar == null) {
            this.e = null;
            this.f28339t = 0L;
        } else {
            int i10 = this.f28323a;
            boolean p02 = org.telegram.messenger.w3.p0(org.telegram.messenger.wp.r1(i10).L0(Long.valueOf(-org.telegram.messenger.kj.B0(kjVar.f16690k))));
            ImageReceiver imageReceiver = this.f28327g;
            if (p02) {
                imageReceiver.J0(org.telegram.messenger.i0.L(10.0f));
                long v12 = org.telegram.messenger.kj.v1(kjVar.f16690k);
                TLObject d22 = org.telegram.messenger.wp.r1(i10).d2(v12);
                this.f28339t = v12;
                if (d22 == null) {
                    this.e = null;
                    return false;
                }
                r8 r8Var = this.f28326f;
                r8Var.l(d22);
                imageReceiver.i0(d22, r8Var, null);
                this.e = new rz0(org.telegram.messenger.o5.m(d22), 14.0f, org.telegram.messenger.i0.o());
            } else {
                imageReceiver.J0(0);
                long Z1 = kjVar.Z1();
                this.f28339t = Z1;
                TLRPC.TL_forumTopic f7 = org.telegram.messenger.wp.r1(i10).f19234r7.f(-org.telegram.messenger.kj.B0(kjVar.f16690k), Z1);
                if (f7 == null) {
                    this.e = null;
                    return false;
                }
                if (Z1 == 1) {
                    gg.d c10 = gg.e.c(view.getContext(), 0.75f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21262v8, this.f28325c), false);
                    this.f28328i = c10;
                    imageReceiver.w0(c10);
                } else if (f7.icon_emoji_id != 0) {
                    this.h = new f5(0, i10, f7.icon_emoji_id);
                    imageReceiver.R();
                    this.h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.w0(gg.e.e(f7));
                }
                this.e = new rz0(f7.title, 14.0f, org.telegram.messenger.i0.o());
            }
        }
        if (this.e == null) {
            return false;
        }
        return true;
    }
}
