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
import b8.mf;
import ci.ec;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xq;
public class c7 extends FrameLayout implements cs {
    public final org.telegram.ui.ActionBar.e6 E;
    public final org.telegram.ui.Components.u5 F;
    public boolean G;
    public final org.telegram.ui.Components.u5 H;
    public long I;
    public vg.x0 J;
    public Drawable K;
    public final Paint L;
    public long M;
    public ly0 N;
    public final org.telegram.ui.Components.k9 f29052a;
    public final ec f29053b;
    public final org.telegram.ui.ActionBar.k5 f29054c;
    public final wo d;
    public final a7 f29055e;
    public b7 f29056f;
    public TLRPC.User h;
    public final int f29057n;
    public float f29058r;
    public long f29059s;
    public long f29060w;
    public boolean f29061x;
    public final int f29062y;

    public c7(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        float f10;
        float f11;
        float f12;
        this.f29062y = h10.f22829t0;
        xq xqVar = xq.h;
        this.F = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
        this.H = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
        this.L = new Paint();
        this.E = e6Var;
        this.f29055e = new a7(this, e6Var, 0);
        setWillNotDraw(false);
        this.f29057n = i3;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f29052a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        if (i3 == 2) {
            addView(k9Var, mf.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(k9Var, mf.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        ec ecVar = new ec(context, 8);
        this.f29053b = ecVar;
        hs.i(ecVar);
        if (this.G) {
            i10 = org.telegram.ui.ActionBar.k6.C6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f27988j5;
        }
        org.telegram.ui.ActionBar.r6.V(ecVar, i10, e6Var);
        ecVar.setTextSize(1, 12.0f);
        ecVar.setMaxLines(2);
        ecVar.setGravity(49);
        ecVar.setLines(2);
        ecVar.setEllipsize(TextUtils.TruncateAt.END);
        if (i3 == 2) {
            f10 = 58.0f;
        } else {
            f10 = 66.0f;
        }
        addView(ecVar, mf.d(-1, -2.0f, 51, 6.0f, f10, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f29054c = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.f27988j5, e6Var);
        k5Var.setTextSize(12);
        k5Var.setMaxLines(2);
        k5Var.setGravity(49);
        k5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        if (i3 == 2) {
            f11 = 58.0f;
        } else {
            f11 = 66.0f;
        }
        addView(k5Var, mf.d(-1, -2.0f, 51, 6.0f, f11, 6.0f, 0.0f));
        wo woVar = new wo(21, context, e6Var);
        this.d = woVar;
        woVar.b(org.telegram.ui.ActionBar.k6.B5, org.telegram.ui.ActionBar.k6.f27954h5, org.telegram.ui.ActionBar.k6.C5);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(4);
        woVar.setProgressDelegate(new ca(this, 5));
        if (i3 == 2) {
            f12 = -40.0f;
        } else {
            f12 = 42.0f;
        }
        addView(woVar, mf.d(24, 24.0f, 49, 19.0f, f12, 0.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.k6.f27972i6;
        Drawable a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i11, e6Var), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(this, a02, null, N, e6Var);
    }

    public String a() {
        return bd.M0(2131750496, null);
    }

    public final void b(boolean z10, boolean z11) {
        this.d.a(z10, z11);
        if (!z10) {
            d(null, false, true);
        }
    }

    public final void c(long j10, boolean z10, CharSequence charSequence) {
        int L;
        int i3;
        boolean z11;
        a7 a7Var = this.f29055e;
        a7Var.f38691p = 1.0f;
        int i10 = (j10 > Long.MAX_VALUE ? 1 : (j10 == Long.MAX_VALUE ? 0 : -1));
        org.telegram.ui.Components.k9 k9Var = this.f29052a;
        ec ecVar = this.f29053b;
        if (i10 == 0) {
            ecVar.setText(a());
            if (this.f29056f == null) {
                this.f29056f = new b7(getContext(), k9Var, true, 2131231615, this.E);
            }
            k9Var.j(null, null, this.f29056f, null);
        } else {
            boolean E = org.telegram.messenger.m5.E(j10);
            org.telegram.ui.Components.u5 u5Var = this.H;
            org.telegram.ui.Components.u5 u5Var2 = this.F;
            int i11 = this.f29062y;
            if (E) {
                this.h = hp.s1(i11).a2(Long.valueOf(j10));
                TL_account.RequirementToContact J2 = hp.s1(i11).J2(j10);
                this.G = J2 instanceof TL_account.requirementToContactPremium;
                this.I = org.telegram.messenger.m5.k(J2);
                if (this.G) {
                    i3 = org.telegram.ui.ActionBar.k6.C6;
                } else {
                    i3 = org.telegram.ui.ActionBar.k6.f27988j5;
                }
                org.telegram.ui.ActionBar.r6.V(ecVar, i3, this.E);
                u5Var2.a(this.G);
                if (this.I > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                u5Var.a(z11);
                invalidate();
                a7Var.r(this.h);
                int i12 = this.f29057n;
                if (i12 != 2 && l10.z(this.h)) {
                    ecVar.setText(bd.M0(2131746274, null));
                    a7Var.g(12);
                    k9Var.j(null, null, a7Var, this.h);
                } else if (i12 != 2 && l10.B(this.h)) {
                    ecVar.setText(bd.M0(2131745911, null));
                    a7Var.g(1);
                    k9Var.j(null, null, a7Var, this.h);
                } else {
                    if (charSequence != null) {
                        ecVar.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            ecVar.setText(org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                        } else {
                            ecVar.setText("");
                        }
                    }
                    k9Var.e(this.h, a7Var);
                }
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
            } else {
                this.h = null;
                this.G = false;
                u5Var2.e(true, 0.0f);
                this.I = hp.s1(i11).N1(j10);
                u5Var.getClass();
                u5Var.e(true, 0.0f);
                TLRPC.Chat M0 = hp.s1(i11).M0(Long.valueOf(-j10));
                if (charSequence != null) {
                    ecVar.setText(charSequence);
                } else if (M0 != null) {
                    if (M0.monoforum) {
                        ecVar.setText(rg.c.i(i11, M0, false));
                    } else {
                        ecVar.setText(M0.title);
                    }
                } else {
                    ecVar.setText("");
                }
                if (org.telegram.messenger.t3.p0(M0)) {
                    rg.c.o(i11, M0, a7Var, k9Var);
                } else {
                    a7Var.q(M0);
                    k9Var.e(M0, a7Var);
                }
                if (M0 != null && (M0.forum || M0.monoforum)) {
                    L = org.telegram.messenger.g0.L(16.0f);
                } else {
                    L = org.telegram.messenger.g0.L(28.0f);
                }
                k9Var.setRoundRadius(L);
            }
        }
        this.f29060w = j10;
        this.d.a(z10, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11) {
        boolean z12;
        float f10;
        boolean z13 = this.f29061x;
        if (tL_forumTopic != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z13 == z12 && z11) {
            return;
        }
        org.telegram.ui.ActionBar.k5 k5Var = this.f29054c;
        q1.g gVar = (q1.g) k5Var.getTag(2131296663);
        if (gVar != null) {
            gVar.d();
        }
        if (z12) {
            if (z10) {
                k5Var.l(hp.s1(this.f29062y).B1(org.telegram.messenger.m5.o(tL_forumTopic.from_id), false), false);
            } else {
                k5Var.l(rg.c.j(tL_forumTopic, k5Var.getTextPaint(), null), false);
            }
            k5Var.requestLayout();
        }
        float f11 = 0.0f;
        if (z11) {
            if (z12) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            q1.g gVar2 = new q1.g(new q1.f(f10));
            if (z12) {
                f11 = 1000.0f;
            }
            q1.h hVar = new q1.h(f11);
            hVar.b(1500.0f);
            hVar.a(1.0f);
            gVar2.f53653m = hVar;
            gVar2.b(new q1.d() {
                @Override
                public final void a(q1.g gVar3, float f12, float f13) {
                    float f14 = f12 / 1000.0f;
                    c7 c7Var = c7.this;
                    org.telegram.ui.ActionBar.k5 k5Var2 = c7Var.f29054c;
                    k5Var2.setAlpha(f14);
                    ec ecVar = c7Var.f29053b;
                    float f15 = 1.0f - f14;
                    ecVar.setAlpha(f15);
                    k5Var2.setTranslationX(f15 * (-org.telegram.messenger.g0.L(10.0f)));
                    ecVar.setTranslationX(f14 * org.telegram.messenger.g0.L(10.0f));
                }
            });
            gVar2.a(new q1.c() {
                @Override
                public final void a(q1.g gVar3, boolean z14, float f12, float f13) {
                    c7.this.f29054c.setTag(2131296663, null);
                }
            });
            k5Var.setTag(2131296663, gVar2);
            gVar2.h();
        } else {
            ec ecVar = this.f29053b;
            if (z12) {
                k5Var.setAlpha(1.0f);
                ecVar.setAlpha(0.0f);
                k5Var.setTranslationX(0.0f);
                ecVar.setTranslationX(org.telegram.messenger.g0.L(10.0f));
            } else {
                k5Var.setAlpha(0.0f);
                ecVar.setAlpha(1.0f);
                k5Var.setTranslationX(-org.telegram.messenger.g0.L(10.0f));
                ecVar.setTranslationX(0.0f);
            }
        }
        this.f29061x = z12;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TL_account.RequirementToContact requirementToContact;
        long k10;
        int i11;
        if (i3 == hs.i3) {
            TLRPC.User user = this.h;
            int i12 = this.f29062y;
            if (user != null) {
                requirementToContact = hp.s1(i12).J2(this.h.f27150id);
            } else {
                requirementToContact = null;
            }
            if (this.f29060w < 0) {
                k10 = hp.s1(i12).N1(this.f29060w);
            } else {
                k10 = org.telegram.messenger.m5.k(requirementToContact);
            }
            boolean z10 = requirementToContact instanceof TL_account.requirementToContactPremium;
            if (this.G != z10 || this.I != k10) {
                this.G = z10;
                this.I = k10;
                if (z10) {
                    i11 = org.telegram.ui.ActionBar.k6.C6;
                } else {
                    i11 = org.telegram.ui.ActionBar.k6.f27988j5;
                }
                org.telegram.ui.ActionBar.r6.V(this.f29053b, i11, this.E);
                invalidate();
            }
        }
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r27, android.view.View r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.c7.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getCurrentDialog() {
        return this.f29060w;
    }

    public org.telegram.ui.Components.k9 getImageView() {
        return this.f29052a;
    }

    public long getStarsPrice() {
        return this.I;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.f29062y).c(this, hs.i3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.f29062y).n(this, hs.i3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        org.telegram.ui.Components.k9 k9Var = this.f29052a;
        int measuredWidth = (k9Var.getMeasuredWidth() / 2) + k9Var.getLeft();
        int measuredHeight = (k9Var.getMeasuredHeight() / 2) + k9Var.getTop();
        org.telegram.ui.ActionBar.k6.f28075o0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B5, this.E));
        org.telegram.ui.ActionBar.k6.f28075o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        if (this.f29057n == 2) {
            f10 = 24.0f;
        } else {
            f10 = 28.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(measuredWidth - L, measuredHeight - L, measuredWidth + L, measuredHeight + L);
        canvas.drawRoundRect(rectF, k9Var.getRoundRadius()[0], k9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.k6.f28075o0);
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.d.f40035a.f31334q) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        if (this.f29057n == 2) {
            f10 = 95.0f;
        } else {
            f10 = 103.0f;
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }
}
