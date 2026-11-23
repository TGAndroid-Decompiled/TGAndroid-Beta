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
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.wy0;
public class d7 extends FrameLayout implements fs {
    public final org.telegram.ui.ActionBar.i6 E;
    public final org.telegram.ui.Components.c6 F;
    public boolean G;
    public final org.telegram.ui.Components.c6 H;
    public long I;
    public ug.a1 J;
    public Drawable K;
    public final Paint L;
    public long M;
    public wy0 N;
    public final org.telegram.ui.Components.p9 f30631a;
    public final xb f30632b;
    public final org.telegram.ui.ActionBar.n5 f30633c;
    public final lp d;
    public final b7 f30634e;
    public c7 f30635f;
    public TLRPC.User h;
    public final int f30636n;
    public float f30637r;
    public long f30638s;
    public long f30639w;
    public boolean f30640x;
    public final int f30641y;

    public d7(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int i10;
        float f10;
        float f11;
        float f12;
        this.f30641y = i10.f24637t0;
        kr krVar = kr.h;
        this.F = new org.telegram.ui.Components.c6(this, 0L, 350L, krVar);
        this.H = new org.telegram.ui.Components.c6(this, 0L, 350L, krVar);
        this.L = new Paint();
        this.E = i6Var;
        this.f30634e = new b7(this, i6Var, 0);
        setWillNotDraw(false);
        this.f30636n = i7;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f30631a = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        if (i7 == 2) {
            addView(p9Var, c8.na.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(p9Var, c8.na.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        xb xbVar = new xb(context, 8);
        this.f30632b = xbVar;
        ks.i(xbVar);
        if (this.G) {
            i10 = org.telegram.ui.ActionBar.n6.C6;
        } else {
            i10 = org.telegram.ui.ActionBar.n6.f29559j5;
        }
        org.telegram.ui.ActionBar.u6.U(xbVar, i10, i6Var);
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
        addView(xbVar, c8.na.d(-1, -2.0f, 51, 6.0f, f10, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f30633c = n5Var;
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.f29559j5, i6Var);
        n5Var.setTextSize(12);
        n5Var.setMaxLines(2);
        n5Var.setGravity(49);
        n5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        if (i7 == 2) {
            f11 = 58.0f;
        } else {
            f11 = 66.0f;
        }
        addView(n5Var, c8.na.d(-1, -2.0f, 51, 6.0f, f11, 6.0f, 0.0f));
        lp lpVar = new lp(21, context, i6Var);
        this.d = lpVar;
        lpVar.b(org.telegram.ui.ActionBar.n6.B5, org.telegram.ui.ActionBar.n6.f29524h5, org.telegram.ui.ActionBar.n6.C5);
        lpVar.setDrawUnchecked(false);
        lpVar.setDrawBackgroundAsArc(4);
        lpVar.setProgressDelegate(new ea(this, 5));
        if (i7 == 2) {
            f12 = -40.0f;
        } else {
            f12 = 42.0f;
        }
        addView(lpVar, c8.na.d(24, 24.0f, 49, 19.0f, f12, 0.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.n6.f29543i6;
        Drawable a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        setBackground(a02);
        org.telegram.ui.ActionBar.u6.j(this, a02, null, M, i6Var);
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
        b7 b7Var = this.f30634e;
        b7Var.f33433p = 1.0f;
        int i10 = (j3 > Long.MAX_VALUE ? 1 : (j3 == Long.MAX_VALUE ? 0 : -1));
        org.telegram.ui.Components.p9 p9Var = this.f30631a;
        xb xbVar = this.f30632b;
        if (i10 == 0) {
            xbVar.setText(a());
            if (this.f30635f == null) {
                this.f30635f = new c7(getContext(), p9Var, true, 2131231619, this.E);
            }
            p9Var.j(null, null, this.f30635f, null);
        } else {
            boolean E = org.telegram.messenger.n5.E(j3);
            org.telegram.ui.Components.c6 c6Var = this.H;
            org.telegram.ui.Components.c6 c6Var2 = this.F;
            int i11 = this.f30641y;
            if (E) {
                this.h = mp.u1(i11).c2(Long.valueOf(j3));
                TL_account.RequirementToContact P2 = mp.u1(i11).P2(j3);
                this.G = P2 instanceof TL_account.requirementToContactPremium;
                this.I = org.telegram.messenger.n5.k(P2);
                if (this.G) {
                    i7 = org.telegram.ui.ActionBar.n6.C6;
                } else {
                    i7 = org.telegram.ui.ActionBar.n6.f29559j5;
                }
                org.telegram.ui.ActionBar.u6.U(xbVar, i7, this.E);
                c6Var2.a(this.G);
                if (this.I > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c6Var.a(z11);
                invalidate();
                b7Var.r(this.h);
                int i12 = this.f30636n;
                if (i12 != 2 && n10.A(this.h)) {
                    xbVar.setText(gd.N0(2131746070, null));
                    b7Var.g(12);
                    p9Var.j(null, null, b7Var, this.h);
                } else if (i12 != 2 && n10.C(this.h)) {
                    xbVar.setText(gd.N0(2131745705, null));
                    b7Var.g(1);
                    p9Var.j(null, null, b7Var, this.h);
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
                    p9Var.f(this.h, b7Var);
                }
                p9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
            } else {
                this.h = null;
                this.G = false;
                c6Var2.e(true, 0.0f);
                this.I = mp.u1(i11).P1(j3);
                c6Var.getClass();
                c6Var.e(true, 0.0f);
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
                    qg.c.p(i11, O0, b7Var, p9Var);
                } else {
                    b7Var.q(O0);
                    p9Var.f(O0, b7Var);
                }
                if (O0 != null && (O0.forum || O0.monoforum)) {
                    L = org.telegram.messenger.g0.L(16.0f);
                } else {
                    L = org.telegram.messenger.g0.L(28.0f);
                }
                p9Var.setRoundRadius(L);
            }
        }
        this.f30639w = j3;
        this.d.a(z10, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11) {
        boolean z12;
        float f10;
        boolean z13 = this.f30640x;
        if (tL_forumTopic != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z13 == z12 && z11) {
            return;
        }
        org.telegram.ui.ActionBar.n5 n5Var = this.f30633c;
        r1.g gVar = (r1.g) n5Var.getTag(2131296665);
        if (gVar != null) {
            gVar.d();
        }
        if (z12) {
            if (z10) {
                n5Var.l(mp.u1(this.f30641y).D1(org.telegram.messenger.n5.o(tL_forumTopic.from_id), false), false);
            } else {
                n5Var.l(qg.c.k(tL_forumTopic, n5Var.getTextPaint(), null), false);
            }
            n5Var.requestLayout();
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
            gVar2.f56446m = hVar;
            gVar2.b(new r1.d() {
                @Override
                public final void a(r1.g gVar3, float f12, float f13) {
                    float f14 = f12 / 1000.0f;
                    d7 d7Var = d7.this;
                    org.telegram.ui.ActionBar.n5 n5Var2 = d7Var.f30633c;
                    n5Var2.setAlpha(f14);
                    xb xbVar = d7Var.f30632b;
                    float f15 = 1.0f - f14;
                    xbVar.setAlpha(f15);
                    n5Var2.setTranslationX(f15 * (-org.telegram.messenger.g0.L(10.0f)));
                    xbVar.setTranslationX(f14 * org.telegram.messenger.g0.L(10.0f));
                }
            });
            gVar2.a(new r1.c() {
                @Override
                public final void a(r1.g gVar3, boolean z14, float f12, float f13) {
                    d7.this.f30633c.setTag(2131296665, null);
                }
            });
            n5Var.setTag(2131296665, gVar2);
            gVar2.h();
        } else {
            xb xbVar = this.f30632b;
            if (z12) {
                n5Var.setAlpha(1.0f);
                xbVar.setAlpha(0.0f);
                n5Var.setTranslationX(0.0f);
                xbVar.setTranslationX(org.telegram.messenger.g0.L(10.0f));
            } else {
                n5Var.setAlpha(0.0f);
                xbVar.setAlpha(1.0f);
                n5Var.setTranslationX(-org.telegram.messenger.g0.L(10.0f));
                xbVar.setTranslationX(0.0f);
            }
        }
        this.f30640x = z12;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TL_account.RequirementToContact requirementToContact;
        long k10;
        int i11;
        if (i7 == ks.f25241k3) {
            TLRPC.User user = this.h;
            int i12 = this.f30641y;
            if (user != null) {
                requirementToContact = mp.u1(i12).P2(this.h.f28641id);
            } else {
                requirementToContact = null;
            }
            if (this.f30639w < 0) {
                k10 = mp.u1(i12).P1(this.f30639w);
            } else {
                k10 = org.telegram.messenger.n5.k(requirementToContact);
            }
            boolean z10 = requirementToContact instanceof TL_account.requirementToContactPremium;
            if (this.G != z10 || this.I != k10) {
                this.G = z10;
                this.I = k10;
                if (z10) {
                    i11 = org.telegram.ui.ActionBar.n6.C6;
                } else {
                    i11 = org.telegram.ui.ActionBar.n6.f29559j5;
                }
                org.telegram.ui.ActionBar.u6.U(this.f30632b, i11, this.E);
                invalidate();
            }
        }
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r27, android.view.View r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.d7.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getCurrentDialog() {
        return this.f30639w;
    }

    public org.telegram.ui.Components.p9 getImageView() {
        return this.f30631a;
    }

    public long getStarsPrice() {
        return this.I;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.f30641y).c(this, ks.f25241k3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.f30641y).n(this, ks.f25241k3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        org.telegram.ui.Components.p9 p9Var = this.f30631a;
        int measuredWidth = (p9Var.getMeasuredWidth() / 2) + p9Var.getLeft();
        int measuredHeight = (p9Var.getMeasuredHeight() / 2) + p9Var.getTop();
        org.telegram.ui.ActionBar.n6.f29646o0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.B5, this.E));
        org.telegram.ui.ActionBar.n6.f29646o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        if (this.f30636n == 2) {
            f10 = 24.0f;
        } else {
            f10 = 28.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(measuredWidth - L, measuredHeight - L, measuredWidth + L, measuredHeight + L);
        canvas.drawRoundRect(rectF, p9Var.getRoundRadius()[0], p9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.n6.f29646o0);
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.d.f37189a.f32938q) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        if (this.f30636n == 2) {
            f10 = 95.0f;
        } else {
            f10 = 103.0f;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }
}
