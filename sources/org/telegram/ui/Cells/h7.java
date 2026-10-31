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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
public class h7 extends FrameLayout implements us {
    public final org.telegram.ui.ActionBar.p6 D;
    public final org.telegram.ui.Components.t5 E;
    public boolean F;
    public final org.telegram.ui.Components.t5 G;
    public long H;
    public kg.k1 I;
    public Drawable J;
    public final Paint K;
    public long L;
    public qz0 M;
    public final org.telegram.ui.Components.g9 f21991a;
    public final ag.j3 f21992b;
    public final org.telegram.ui.ActionBar.u5 f21993c;
    public final ep d;
    public final f7 e;
    public g7 f21994f;
    public TLRPC.User h;
    public final int f21995n;
    public float f21996r;
    public long f21997s;
    public long f21998w;
    public boolean f21999x;
    public final int f22000y;

    public h7(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i11;
        float f7;
        float f10;
        float f11;
        this.f22000y = d20.f15147s0;
        gr grVar = gr.h;
        this.E = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        this.G = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        this.K = new Paint();
        this.D = p6Var;
        this.e = new f7(this, p6Var, 0);
        setWillNotDraw(false);
        this.f21995n = i10;
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f21991a = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(28.0f));
        if (i10 == 2) {
            addView(g9Var, w7.b6.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(g9Var, w7.b6.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        ag.j3 j3Var = new ag.j3(context, 5);
        this.f21992b = j3Var;
        zs.i(j3Var);
        if (this.F) {
            i11 = org.telegram.ui.ActionBar.t6.C6;
        } else {
            i11 = org.telegram.ui.ActionBar.t6.f21037j5;
        }
        org.telegram.ui.ActionBar.a7.V(j3Var, i11, p6Var);
        j3Var.setTextSize(1, 12.0f);
        j3Var.setMaxLines(2);
        j3Var.setGravity(49);
        j3Var.setLines(2);
        j3Var.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 2) {
            f7 = 58.0f;
        } else {
            f7 = 66.0f;
        }
        addView(j3Var, w7.b6.d(-1, -2.0f, 51, 6.0f, f7, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.f21993c = u5Var;
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.f21037j5, p6Var);
        u5Var.setTextSize(12);
        u5Var.setMaxLines(2);
        u5Var.setGravity(49);
        u5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        if (i10 == 2) {
            f10 = 58.0f;
        } else {
            f10 = 66.0f;
        }
        addView(u5Var, w7.b6.d(-1, -2.0f, 51, 6.0f, f10, 6.0f, 0.0f));
        ep epVar = new ep(21, context, p6Var);
        this.d = epVar;
        epVar.b(org.telegram.ui.ActionBar.t6.B5, org.telegram.ui.ActionBar.t6.f21001h5, org.telegram.ui.ActionBar.t6.C5);
        epVar.setDrawUnchecked(false);
        epVar.setDrawBackgroundAsArc(4);
        epVar.setProgressDelegate(new ca(this, 5));
        if (i10 == 2) {
            f11 = -40.0f;
        } else {
            f11 = 42.0f;
        }
        addView(epVar, w7.b6.d(24, 24.0f, 49, 19.0f, f11, 0.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.t6.f21020i6;
        Drawable a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        setBackground(a02);
        org.telegram.ui.ActionBar.a7.k(this, a02, null, N, p6Var);
    }

    public String a() {
        return cd.L0(2131750497, null);
    }

    public final void b(boolean z10, boolean z11) {
        this.d.a(z10, z11);
        if (!z10) {
            d(null, false, true);
        }
    }

    public final void c(long j10, boolean z10, CharSequence charSequence) {
        int L;
        int i10;
        boolean z11;
        f7 f7Var = this.e;
        f7Var.f29871p = 1.0f;
        int i11 = (j10 > Long.MAX_VALUE ? 1 : (j10 == Long.MAX_VALUE ? 0 : -1));
        org.telegram.ui.Components.g9 g9Var = this.f21991a;
        ag.j3 j3Var = this.f21992b;
        if (i11 == 0) {
            j3Var.setText(a());
            if (this.f21994f == null) {
                this.f21994f = new g7(getContext(), g9Var, true, 2131231616, this.D);
            }
            g9Var.j(null, null, this.f21994f, null);
        } else {
            boolean E = org.telegram.messenger.o5.E(j10);
            org.telegram.ui.Components.t5 t5Var = this.G;
            org.telegram.ui.Components.t5 t5Var2 = this.E;
            int i12 = this.f22000y;
            if (E) {
                this.h = vp.r1(i12).Z1(Long.valueOf(j10));
                TL_account.RequirementToContact H2 = vp.r1(i12).H2(j10);
                this.F = H2 instanceof TL_account.requirementToContactPremium;
                this.H = org.telegram.messenger.o5.k(H2);
                if (this.F) {
                    i10 = org.telegram.ui.ActionBar.t6.C6;
                } else {
                    i10 = org.telegram.ui.ActionBar.t6.f21037j5;
                }
                org.telegram.ui.ActionBar.a7.V(j3Var, i10, this.D);
                t5Var2.a(this.F);
                if (this.H > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                t5Var.a(z11);
                invalidate();
                f7Var.r(this.h);
                int i13 = this.f21995n;
                if (i13 != 2 && h20.z(this.h)) {
                    j3Var.setText(cd.L0(2131746281, null));
                    f7Var.g(12);
                    g9Var.j(null, null, f7Var, this.h);
                } else if (i13 != 2 && h20.B(this.h)) {
                    j3Var.setText(cd.L0(2131745918, null));
                    f7Var.g(1);
                    g9Var.j(null, null, f7Var, this.h);
                } else {
                    if (charSequence != null) {
                        j3Var.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            j3Var.setText(org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                        } else {
                            j3Var.setText("");
                        }
                    }
                    g9Var.e(this.h, f7Var);
                }
                g9Var.setRoundRadius(org.telegram.messenger.i0.L(28.0f));
            } else {
                this.h = null;
                this.F = false;
                t5Var2.e(true, 0.0f);
                this.H = vp.r1(i12).M1(j10);
                t5Var.getClass();
                t5Var.e(true, 0.0f);
                TLRPC.Chat L0 = vp.r1(i12).L0(Long.valueOf(-j10));
                if (charSequence != null) {
                    j3Var.setText(charSequence);
                } else if (L0 != null) {
                    if (L0.monoforum) {
                        j3Var.setText(gg.e.i(i12, L0, false));
                    } else {
                        j3Var.setText(L0.title);
                    }
                } else {
                    j3Var.setText("");
                }
                if (org.telegram.messenger.w3.p0(L0)) {
                    gg.e.o(i12, L0, f7Var, g9Var);
                } else {
                    f7Var.q(L0);
                    g9Var.e(L0, f7Var);
                }
                if (L0 != null && (L0.forum || L0.monoforum)) {
                    L = org.telegram.messenger.i0.L(16.0f);
                } else {
                    L = org.telegram.messenger.i0.L(28.0f);
                }
                g9Var.setRoundRadius(L);
            }
        }
        this.f21998w = j10;
        this.d.a(z10, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11) {
        boolean z12;
        float f7;
        boolean z13 = this.f21999x;
        if (tL_forumTopic != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z13 == z12 && z11) {
            return;
        }
        org.telegram.ui.ActionBar.u5 u5Var = this.f21993c;
        o1.j jVar = (o1.j) u5Var.getTag(2131296663);
        if (jVar != null) {
            jVar.d();
        }
        if (z12) {
            if (z10) {
                u5Var.l(vp.r1(this.f22000y).A1(org.telegram.messenger.o5.o(tL_forumTopic.from_id), false), false);
            } else {
                u5Var.l(gg.e.j(tL_forumTopic, u5Var.getTextPaint(), null), false);
            }
            u5Var.requestLayout();
        }
        float f10 = 0.0f;
        if (z11) {
            if (z12) {
                f7 = 0.0f;
            } else {
                f7 = 1000.0f;
            }
            o1.j jVar2 = new o1.j(new o1.i(f7));
            if (z12) {
                f10 = 1000.0f;
            }
            o1.k kVar = new o1.k(f10);
            kVar.b(1500.0f);
            kVar.a(1.0f);
            jVar2.f13957m = kVar;
            jVar2.b(new o1.g() {
                @Override
                public final void a(o1.j jVar3, float f11, float f12) {
                    float f13 = f11 / 1000.0f;
                    h7 h7Var = h7.this;
                    org.telegram.ui.ActionBar.u5 u5Var2 = h7Var.f21993c;
                    u5Var2.setAlpha(f13);
                    ag.j3 j3Var = h7Var.f21992b;
                    float f14 = 1.0f - f13;
                    j3Var.setAlpha(f14);
                    u5Var2.setTranslationX(f14 * (-org.telegram.messenger.i0.L(10.0f)));
                    j3Var.setTranslationX(f13 * org.telegram.messenger.i0.L(10.0f));
                }
            });
            jVar2.a(new o1.f() {
                @Override
                public final void a(o1.j jVar3, boolean z14, float f11, float f12) {
                    h7.this.f21993c.setTag(2131296663, null);
                }
            });
            u5Var.setTag(2131296663, jVar2);
            jVar2.h();
        } else {
            ag.j3 j3Var = this.f21992b;
            if (z12) {
                u5Var.setAlpha(1.0f);
                j3Var.setAlpha(0.0f);
                u5Var.setTranslationX(0.0f);
                j3Var.setTranslationX(org.telegram.messenger.i0.L(10.0f));
            } else {
                u5Var.setAlpha(0.0f);
                j3Var.setAlpha(1.0f);
                u5Var.setTranslationX(-org.telegram.messenger.i0.L(10.0f));
                j3Var.setTranslationX(0.0f);
            }
        }
        this.f21999x = z12;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TL_account.RequirementToContact requirementToContact;
        long k10;
        int i12;
        if (i10 == zs.f19629i3) {
            TLRPC.User user = this.h;
            int i13 = this.f22000y;
            if (user != null) {
                requirementToContact = vp.r1(i13).H2(this.h.f19942id);
            } else {
                requirementToContact = null;
            }
            if (this.f21998w < 0) {
                k10 = vp.r1(i13).M1(this.f21998w);
            } else {
                k10 = org.telegram.messenger.o5.k(requirementToContact);
            }
            boolean z10 = requirementToContact instanceof TL_account.requirementToContactPremium;
            if (this.F != z10 || this.H != k10) {
                this.F = z10;
                this.H = k10;
                if (z10) {
                    i12 = org.telegram.ui.ActionBar.t6.C6;
                } else {
                    i12 = org.telegram.ui.ActionBar.t6.f21037j5;
                }
                org.telegram.ui.ActionBar.a7.V(this.f21992b, i12, this.D);
                invalidate();
            }
        }
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r27, android.view.View r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h7.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getCurrentDialog() {
        return this.f21998w;
    }

    public org.telegram.ui.Components.g9 getImageView() {
        return this.f21991a;
    }

    public long getStarsPrice() {
        return this.H;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.f(this.f22000y).c(this, zs.f19629i3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(this.f22000y).n(this, zs.f19629i3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.Components.g9 g9Var = this.f21991a;
        int measuredWidth = (g9Var.getMeasuredWidth() / 2) + g9Var.getLeft();
        int measuredHeight = (g9Var.getMeasuredHeight() / 2) + g9Var.getTop();
        org.telegram.ui.ActionBar.t6.f21128o0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B5, this.D));
        org.telegram.ui.ActionBar.t6.f21128o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        if (this.f21995n == 2) {
            f7 = 24.0f;
        } else {
            f7 = 28.0f;
        }
        int L = org.telegram.messenger.i0.L(f7);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(measuredWidth - L, measuredHeight - L, measuredWidth + L, measuredHeight + L);
        canvas.drawRoundRect(rectF, g9Var.getRoundRadius()[0], g9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.t6.f21128o0);
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.d.f25836a.f23919q) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.f21995n == 2) {
            f7 = 95.0f;
        } else {
            f7 = 103.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f7), 1073741824));
    }
}
