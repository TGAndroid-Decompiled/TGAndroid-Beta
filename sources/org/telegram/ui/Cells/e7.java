package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import di.xb;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.xy0;
public class e7 extends FrameLayout implements fs {
    public final org.telegram.ui.ActionBar.h6 E;
    public final org.telegram.ui.Components.d6 F;
    public boolean G;
    public final org.telegram.ui.Components.d6 H;
    public long I;
    public ug.a1 J;
    public Drawable K;
    public final Paint L;
    public long M;
    public xy0 N;
    public final org.telegram.ui.Components.q9 f30602a;
    public final xb f30603b;
    public final org.telegram.ui.ActionBar.m5 f30604c;
    public final op d;
    public final c7 f30605e;
    public d7 f30606f;
    public TLRPC.User h;
    public final int f30607n;
    public float f30608r;
    public long f30609s;
    public long f30610w;
    public boolean f30611x;
    public final int f30612y;

    public e7(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i10;
        float f10;
        float f11;
        float f12;
        this.f30612y = j10.f24798t0;
        nr nrVar = nr.h;
        this.F = new org.telegram.ui.Components.d6(this, 0L, 350L, nrVar);
        this.H = new org.telegram.ui.Components.d6(this, 0L, 350L, nrVar);
        this.L = new Paint();
        this.E = h6Var;
        this.f30605e = new c7(this, h6Var, 0);
        setWillNotDraw(false);
        this.f30607n = i7;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f30602a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        if (i7 == 2) {
            addView(q9Var, c8.ma.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(q9Var, c8.ma.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        xb xbVar = new xb(context, 8);
        this.f30603b = xbVar;
        ks.i(xbVar);
        if (this.G) {
            i10 = org.telegram.ui.ActionBar.m6.C6;
        } else {
            i10 = org.telegram.ui.ActionBar.m6.f29486j5;
        }
        org.telegram.ui.ActionBar.t6.U(xbVar, i10, h6Var);
        xbVar.setTextSize(1, 12.0f);
        xbVar.setMaxLines(2);
        xbVar.setGravity(49);
        xbVar.setLines(2);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        if (i7 == 2) {
            f10 = 58.0f;
        } else {
            f10 = 66.0f;
        }
        addView(xbVar, c8.ma.d(-1, -2.0f, 51, 6.0f, f10, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f30604c = m5Var;
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.f29486j5, h6Var);
        m5Var.setTextSize(12);
        m5Var.setMaxLines(2);
        m5Var.setGravity(49);
        m5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        if (i7 == 2) {
            f11 = 58.0f;
        } else {
            f11 = 66.0f;
        }
        addView(m5Var, c8.ma.d(-1, -2.0f, 51, 6.0f, f11, 6.0f, 0.0f));
        op opVar = new op(21, context, h6Var);
        this.d = opVar;
        opVar.b(org.telegram.ui.ActionBar.m6.B5, org.telegram.ui.ActionBar.m6.f29451h5, org.telegram.ui.ActionBar.m6.C5);
        opVar.setDrawUnchecked(false);
        opVar.setDrawBackgroundAsArc(4);
        opVar.setProgressDelegate(new ea(this, 5));
        if (i7 == 2) {
            f12 = -40.0f;
        } else {
            f12 = 42.0f;
        }
        addView(opVar, c8.ma.d(24, 24.0f, 49, 19.0f, f12, 0.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.m6.f29470i6;
        Drawable a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i11, h6Var), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        setBackground(a02);
        org.telegram.ui.ActionBar.t6.j(this, a02, null, M, h6Var);
    }

    public String a() {
        return gd.N0(2131750471, null);
    }

    public final void b(boolean z10, boolean z11) {
        this.d.a(z10, z11);
        if (!z10) {
            d(null, false, true);
        }
    }

    public final void c(long j3, boolean z10, CharSequence charSequence) {
        int L;
        int i7;
        boolean z11;
        c7 c7Var = this.f30605e;
        c7Var.f33809p = 1.0f;
        int i10 = (j3 > Long.MAX_VALUE ? 1 : (j3 == Long.MAX_VALUE ? 0 : -1));
        org.telegram.ui.Components.q9 q9Var = this.f30602a;
        xb xbVar = this.f30603b;
        if (i10 == 0) {
            xbVar.setText(a());
            if (this.f30606f == null) {
                this.f30606f = new d7(getContext(), q9Var, true, 2131231616, this.E);
            }
            q9Var.j(null, null, this.f30606f, null);
        } else {
            boolean E = org.telegram.messenger.n5.E(j3);
            org.telegram.ui.Components.d6 d6Var = this.H;
            org.telegram.ui.Components.d6 d6Var2 = this.F;
            int i11 = this.f30612y;
            if (E) {
                this.h = mp.u1(i11).c2(Long.valueOf(j3));
                TL_account.RequirementToContact P2 = mp.u1(i11).P2(j3);
                this.G = P2 instanceof TL_account.requirementToContactPremium;
                this.I = org.telegram.messenger.n5.k(P2);
                if (this.G) {
                    i7 = org.telegram.ui.ActionBar.m6.C6;
                } else {
                    i7 = org.telegram.ui.ActionBar.m6.f29486j5;
                }
                org.telegram.ui.ActionBar.t6.U(xbVar, i7, this.E);
                d6Var2.a(this.G);
                if (this.I > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                d6Var.a(z11);
                invalidate();
                c7Var.r(this.h);
                int i12 = this.f30607n;
                if (i12 != 2 && o10.A(this.h)) {
                    xbVar.setText(gd.N0(2131746070, null));
                    c7Var.g(12);
                    q9Var.j(null, null, c7Var, this.h);
                } else if (i12 != 2 && o10.C(this.h)) {
                    xbVar.setText(gd.N0(2131745705, null));
                    c7Var.g(1);
                    q9Var.j(null, null, c7Var, this.h);
                } else {
                    if (charSequence != null) {
                        xbVar.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            xbVar.setText(org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                        } else {
                            xbVar.setText("");
                        }
                    }
                    q9Var.f(this.h, c7Var);
                }
                q9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
            } else {
                this.h = null;
                this.G = false;
                d6Var2.e(true, 0.0f);
                this.I = mp.u1(i11).P1(j3);
                d6Var.getClass();
                d6Var.e(true, 0.0f);
                TLRPC.Chat O0 = mp.u1(i11).O0(Long.valueOf(-j3));
                if (charSequence != null) {
                    xbVar.setText(charSequence);
                } else if (O0 != null) {
                    if (O0.monoforum) {
                        xbVar.setText(qg.c.j(i11, O0, false));
                    } else {
                        xbVar.setText(O0.title);
                    }
                } else {
                    xbVar.setText("");
                }
                if (org.telegram.messenger.v3.p0(O0)) {
                    qg.c.p(i11, O0, c7Var, q9Var);
                } else {
                    c7Var.q(O0);
                    q9Var.f(O0, c7Var);
                }
                if (O0 != null && (O0.forum || O0.monoforum)) {
                    L = org.telegram.messenger.g0.L(16.0f);
                } else {
                    L = org.telegram.messenger.g0.L(28.0f);
                }
                q9Var.setRoundRadius(L);
            }
        }
        this.f30610w = j3;
        this.d.a(z10, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11) {
        boolean z12;
        float f10;
        boolean z13 = this.f30611x;
        if (tL_forumTopic != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z13 == z12 && z11) {
            return;
        }
        org.telegram.ui.ActionBar.m5 m5Var = this.f30604c;
        r1.g gVar = (r1.g) m5Var.getTag(2131296665);
        if (gVar != null) {
            gVar.d();
        }
        if (z12) {
            if (z10) {
                m5Var.l(mp.u1(this.f30612y).D1(org.telegram.messenger.n5.o(tL_forumTopic.from_id), false), false);
            } else {
                m5Var.l(qg.c.k(tL_forumTopic, m5Var.getTextPaint(), null), false);
            }
            m5Var.requestLayout();
        }
        float f11 = 0.0f;
        if (z11) {
            if (z12) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            r1.g gVar2 = new r1.g(new r1.f(f10));
            if (z12) {
                f11 = 1000.0f;
            }
            r1.h hVar = new r1.h(f11);
            hVar.b(1500.0f);
            hVar.a(1.0f);
            gVar2.f56364m = hVar;
            gVar2.b(new r1.d() {
                @Override
                public final void a(r1.g gVar3, float f12, float f13) {
                    float f14 = f12 / 1000.0f;
                    e7 e7Var = e7.this;
                    org.telegram.ui.ActionBar.m5 m5Var2 = e7Var.f30604c;
                    m5Var2.setAlpha(f14);
                    xb xbVar = e7Var.f30603b;
                    float f15 = 1.0f - f14;
                    xbVar.setAlpha(f15);
                    m5Var2.setTranslationX(f15 * (-org.telegram.messenger.g0.L(10.0f)));
                    xbVar.setTranslationX(f14 * org.telegram.messenger.g0.L(10.0f));
                }
            });
            gVar2.a(new r1.c() {
                @Override
                public final void a(r1.g gVar3, boolean z14, float f12, float f13) {
                    e7.this.f30604c.setTag(2131296665, null);
                }
            });
            m5Var.setTag(2131296665, gVar2);
            gVar2.h();
        } else {
            xb xbVar = this.f30603b;
            if (z12) {
                m5Var.setAlpha(1.0f);
                xbVar.setAlpha(0.0f);
                m5Var.setTranslationX(0.0f);
                xbVar.setTranslationX(org.telegram.messenger.g0.L(10.0f));
            } else {
                m5Var.setAlpha(0.0f);
                xbVar.setAlpha(1.0f);
                m5Var.setTranslationX(-org.telegram.messenger.g0.L(10.0f));
                xbVar.setTranslationX(0.0f);
            }
        }
        this.f30611x = z12;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TL_account.RequirementToContact requirementToContact;
        long k10;
        int i11;
        if (i7 == ks.f25170k3) {
            TLRPC.User user = this.h;
            int i12 = this.f30612y;
            if (user != null) {
                requirementToContact = mp.u1(i12).P2(this.h.f28580id);
            } else {
                requirementToContact = null;
            }
            if (this.f30610w < 0) {
                k10 = mp.u1(i12).P1(this.f30610w);
            } else {
                k10 = org.telegram.messenger.n5.k(requirementToContact);
            }
            boolean z10 = requirementToContact instanceof TL_account.requirementToContactPremium;
            if (this.G != z10 || this.I != k10) {
                this.G = z10;
                this.I = k10;
                if (z10) {
                    i11 = org.telegram.ui.ActionBar.m6.C6;
                } else {
                    i11 = org.telegram.ui.ActionBar.m6.f29486j5;
                }
                org.telegram.ui.ActionBar.t6.U(this.f30603b, i11, this.E);
                invalidate();
            }
        }
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r27, android.view.View r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.e7.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getCurrentDialog() {
        return this.f30610w;
    }

    public org.telegram.ui.Components.q9 getImageView() {
        return this.f30602a;
    }

    public long getStarsPrice() {
        return this.I;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.f30612y).c(this, ks.f25170k3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.f30612y).n(this, ks.f25170k3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        org.telegram.ui.Components.q9 q9Var = this.f30602a;
        int measuredWidth = (q9Var.getMeasuredWidth() / 2) + q9Var.getLeft();
        int measuredHeight = (q9Var.getMeasuredHeight() / 2) + q9Var.getTop();
        org.telegram.ui.ActionBar.m6.f29573o0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B5, this.E));
        org.telegram.ui.ActionBar.m6.f29573o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        if (this.f30607n == 2) {
            f10 = 24.0f;
        } else {
            f10 = 28.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(measuredWidth - L, measuredHeight - L, measuredWidth + L, measuredHeight + L);
        canvas.drawRoundRect(rectF, q9Var.getRoundRadius()[0], q9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.m6.f29573o0);
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.d.f38327a.f32871q) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        if (this.f30607n == 2) {
            f10 = 95.0f;
        } else {
            f10 = 103.0f;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }
}
