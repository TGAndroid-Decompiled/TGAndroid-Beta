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
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.vy0;
public class d7 extends FrameLayout implements fs {
    public final org.telegram.ui.ActionBar.i6 E;
    public final org.telegram.ui.Components.c6 F;
    public boolean G;
    public final org.telegram.ui.Components.c6 H;
    public long I;
    public ug.b1 J;
    public Drawable K;
    public final Paint L;
    public long M;
    public vy0 N;
    public final org.telegram.ui.Components.q9 f30528a;
    public final xb f30529b;
    public final org.telegram.ui.ActionBar.n5 f30530c;
    public final mp d;
    public final b7 f30531e;
    public c7 f30532f;
    public TLRPC.User h;
    public final int f30533n;
    public float f30534r;
    public long f30535s;
    public long f30536w;
    public boolean f30537x;
    public final int f30538y;

    public d7(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int i10;
        float f10;
        float f11;
        float f12;
        this.f30538y = j10.f24773t0;
        lr lrVar = lr.h;
        this.F = new org.telegram.ui.Components.c6(this, 0L, 350L, lrVar);
        this.H = new org.telegram.ui.Components.c6(this, 0L, 350L, lrVar);
        this.L = new Paint();
        this.E = i6Var;
        this.f30531e = new b7(this, i6Var, 0);
        setWillNotDraw(false);
        this.f30533n = i7;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f30528a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        if (i7 == 2) {
            addView(q9Var, c8.ma.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(q9Var, c8.ma.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        xb xbVar = new xb(context, 8);
        this.f30529b = xbVar;
        ks.i(xbVar);
        if (this.G) {
            i10 = org.telegram.ui.ActionBar.n6.C6;
        } else {
            i10 = org.telegram.ui.ActionBar.n6.f29504j5;
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
        addView(xbVar, c8.ma.d(-1, -2.0f, 51, 6.0f, f10, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f30530c = n5Var;
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.f29504j5, i6Var);
        n5Var.setTextSize(12);
        n5Var.setMaxLines(2);
        n5Var.setGravity(49);
        n5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        if (i7 == 2) {
            f11 = 58.0f;
        } else {
            f11 = 66.0f;
        }
        addView(n5Var, c8.ma.d(-1, -2.0f, 51, 6.0f, f11, 6.0f, 0.0f));
        mp mpVar = new mp(21, context, i6Var);
        this.d = mpVar;
        mpVar.b(org.telegram.ui.ActionBar.n6.B5, org.telegram.ui.ActionBar.n6.f29469h5, org.telegram.ui.ActionBar.n6.C5);
        mpVar.setDrawUnchecked(false);
        mpVar.setDrawBackgroundAsArc(4);
        mpVar.setProgressDelegate(new da(this, 5));
        if (i7 == 2) {
            f12 = -40.0f;
        } else {
            f12 = 42.0f;
        }
        addView(mpVar, c8.ma.d(24, 24.0f, 49, 19.0f, f12, 0.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.n6.f29488i6;
        Drawable a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        setBackground(a02);
        org.telegram.ui.ActionBar.u6.j(this, a02, null, M, i6Var);
    }

    public String a() {
        return gd.M0(2131750472, null);
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
        b7 b7Var = this.f30531e;
        b7Var.f33601p = 1.0f;
        int i10 = (j3 > Long.MAX_VALUE ? 1 : (j3 == Long.MAX_VALUE ? 0 : -1));
        org.telegram.ui.Components.q9 q9Var = this.f30528a;
        xb xbVar = this.f30529b;
        if (i10 == 0) {
            xbVar.setText(a());
            if (this.f30532f == null) {
                this.f30532f = new c7(getContext(), q9Var, true, 2131231616, this.E);
            }
            q9Var.j(null, null, this.f30532f, null);
        } else {
            boolean E = org.telegram.messenger.n5.E(j3);
            org.telegram.ui.Components.c6 c6Var = this.H;
            org.telegram.ui.Components.c6 c6Var2 = this.F;
            int i11 = this.f30538y;
            if (E) {
                this.h = org.telegram.messenger.mp.u1(i11).c2(Long.valueOf(j3));
                TL_account.RequirementToContact P2 = org.telegram.messenger.mp.u1(i11).P2(j3);
                this.G = P2 instanceof TL_account.requirementToContactPremium;
                this.I = org.telegram.messenger.n5.k(P2);
                if (this.G) {
                    i7 = org.telegram.ui.ActionBar.n6.C6;
                } else {
                    i7 = org.telegram.ui.ActionBar.n6.f29504j5;
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
                int i12 = this.f30533n;
                if (i12 != 2 && o10.A(this.h)) {
                    xbVar.setText(gd.M0(2131746071, null));
                    b7Var.g(12);
                    q9Var.j(null, null, b7Var, this.h);
                } else if (i12 != 2 && o10.C(this.h)) {
                    xbVar.setText(gd.M0(2131745706, null));
                    b7Var.g(1);
                    q9Var.j(null, null, b7Var, this.h);
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
                    q9Var.f(this.h, b7Var);
                }
                q9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
            } else {
                this.h = null;
                this.G = false;
                c6Var2.e(true, 0.0f);
                this.I = org.telegram.messenger.mp.u1(i11).P1(j3);
                c6Var.getClass();
                c6Var.e(true, 0.0f);
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i11).O0(Long.valueOf(-j3));
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
                    qg.c.p(i11, O0, b7Var, q9Var);
                } else {
                    b7Var.q(O0);
                    q9Var.f(O0, b7Var);
                }
                if (O0 != null && (O0.forum || O0.monoforum)) {
                    L = org.telegram.messenger.g0.L(16.0f);
                } else {
                    L = org.telegram.messenger.g0.L(28.0f);
                }
                q9Var.setRoundRadius(L);
            }
        }
        this.f30536w = j3;
        this.d.a(z10, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11) {
        boolean z12;
        float f10;
        boolean z13 = this.f30537x;
        if (tL_forumTopic != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z13 == z12 && z11) {
            return;
        }
        org.telegram.ui.ActionBar.n5 n5Var = this.f30530c;
        r1.g gVar = (r1.g) n5Var.getTag(2131296663);
        if (gVar != null) {
            gVar.d();
        }
        if (z12) {
            if (z10) {
                n5Var.l(org.telegram.messenger.mp.u1(this.f30538y).D1(org.telegram.messenger.n5.o(tL_forumTopic.from_id), false), false);
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
            gVar2.f56323m = hVar;
            gVar2.b(new r1.d() {
                @Override
                public final void a(r1.g gVar3, float f12, float f13) {
                    float f14 = f12 / 1000.0f;
                    d7 d7Var = d7.this;
                    org.telegram.ui.ActionBar.n5 n5Var2 = d7Var.f30530c;
                    n5Var2.setAlpha(f14);
                    xb xbVar = d7Var.f30529b;
                    float f15 = 1.0f - f14;
                    xbVar.setAlpha(f15);
                    n5Var2.setTranslationX(f15 * (-org.telegram.messenger.g0.L(10.0f)));
                    xbVar.setTranslationX(f14 * org.telegram.messenger.g0.L(10.0f));
                }
            });
            gVar2.a(new r1.c() {
                @Override
                public final void a(r1.g gVar3, boolean z14, float f12, float f13) {
                    d7.this.f30530c.setTag(2131296663, null);
                }
            });
            n5Var.setTag(2131296663, gVar2);
            gVar2.h();
        } else {
            xb xbVar = this.f30529b;
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
        this.f30537x = z12;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TL_account.RequirementToContact requirementToContact;
        long k10;
        int i11;
        if (i7 == ks.f25144k3) {
            TLRPC.User user = this.h;
            int i12 = this.f30538y;
            if (user != null) {
                requirementToContact = org.telegram.messenger.mp.u1(i12).P2(this.h.f28554id);
            } else {
                requirementToContact = null;
            }
            if (this.f30536w < 0) {
                k10 = org.telegram.messenger.mp.u1(i12).P1(this.f30536w);
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
                    i11 = org.telegram.ui.ActionBar.n6.f29504j5;
                }
                org.telegram.ui.ActionBar.u6.U(this.f30529b, i11, this.E);
                invalidate();
            }
        }
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r27, android.view.View r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.d7.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getCurrentDialog() {
        return this.f30536w;
    }

    public org.telegram.ui.Components.q9 getImageView() {
        return this.f30528a;
    }

    public long getStarsPrice() {
        return this.I;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.f30538y).c(this, ks.f25144k3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.f30538y).n(this, ks.f25144k3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        org.telegram.ui.Components.q9 q9Var = this.f30528a;
        int measuredWidth = (q9Var.getMeasuredWidth() / 2) + q9Var.getLeft();
        int measuredHeight = (q9Var.getMeasuredHeight() / 2) + q9Var.getTop();
        org.telegram.ui.ActionBar.n6.f29591o0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.B5, this.E));
        org.telegram.ui.ActionBar.n6.f29591o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        if (this.f30533n == 2) {
            f10 = 24.0f;
        } else {
            f10 = 28.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(measuredWidth - L, measuredHeight - L, measuredWidth + L, measuredHeight + L);
        canvas.drawRoundRect(rectF, q9Var.getRoundRadius()[0], q9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.n6.f29591o0);
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.d.f37598a.f32838q) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        if (this.f30533n == 2) {
            f10 = 95.0f;
        } else {
            f10 = 103.0f;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }
}
