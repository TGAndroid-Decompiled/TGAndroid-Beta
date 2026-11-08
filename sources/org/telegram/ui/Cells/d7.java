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
import bi.md;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xq;
public class d7 extends FrameLayout implements ls {
    public final org.telegram.ui.ActionBar.f6 D;
    public final org.telegram.ui.Components.w5 E;
    public boolean F;
    public final org.telegram.ui.Components.w5 G;
    public long H;
    public ug.y0 I;
    public Drawable J;
    public final Paint K;
    public long L;
    public my0 M;
    public final org.telegram.ui.Components.l9 f29023a;
    public final md f29024b;
    public final org.telegram.ui.ActionBar.k5 f29025c;
    public final wo d;
    public final b7 f29026e;
    public c7 f29027f;
    public TLRPC.User h;
    public final int f29028n;
    public float f29029r;
    public long f29030s;
    public long f29031w;
    public boolean f29032x;
    public final int f29033y;

    public d7(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10;
        float f10;
        float f11;
        float f12;
        this.f29033y = p10.f24470s0;
        xq xqVar = xq.h;
        this.E = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar);
        this.G = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar);
        this.K = new Paint();
        this.D = f6Var;
        this.f29026e = new b7(this, f6Var, 0);
        setWillNotDraw(false);
        this.f29028n = i7;
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f29023a = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        if (i7 == 2) {
            addView(l9Var, c8.ha.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(l9Var, c8.ha.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        md mdVar = new md(context, 8);
        this.f29024b = mdVar;
        qs.i(mdVar);
        if (this.F) {
            i10 = org.telegram.ui.ActionBar.k6.C6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f27960j5;
        }
        org.telegram.ui.ActionBar.r6.V(mdVar, i10, f6Var);
        mdVar.setTextSize(1, 12.0f);
        mdVar.setMaxLines(2);
        mdVar.setGravity(49);
        mdVar.setLines(2);
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        if (i7 == 2) {
            f10 = 58.0f;
        } else {
            f10 = 66.0f;
        }
        addView(mdVar, c8.ha.d(-1, -2.0f, 51, 6.0f, f10, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f29025c = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.f27960j5, f6Var);
        k5Var.setTextSize(12);
        k5Var.setMaxLines(2);
        k5Var.setGravity(49);
        k5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        if (i7 == 2) {
            f11 = 58.0f;
        } else {
            f11 = 66.0f;
        }
        addView(k5Var, c8.ha.d(-1, -2.0f, 51, 6.0f, f11, 6.0f, 0.0f));
        wo woVar = new wo(21, context, f6Var);
        this.d = woVar;
        woVar.b(org.telegram.ui.ActionBar.k6.B5, org.telegram.ui.ActionBar.k6.f27925h5, org.telegram.ui.ActionBar.k6.C5);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(4);
        woVar.setProgressDelegate(new ca(this, 5));
        if (i7 == 2) {
            f12 = -40.0f;
        } else {
            f12 = 42.0f;
        }
        addView(woVar, c8.ha.d(24, 24.0f, 49, 19.0f, f12, 0.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.k6.f27944i6;
        Drawable a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i11, f6Var), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(this, a02, null, N, f6Var);
    }

    public String a() {
        return id.M0(2131750489, null);
    }

    public final void b(boolean z9, boolean z10) {
        this.d.a(z9, z10);
        if (!z9) {
            d(null, false, true);
        }
    }

    public final void c(long j3, boolean z9, CharSequence charSequence) {
        int L;
        int i7;
        boolean z10;
        b7 b7Var = this.f29026e;
        b7Var.f39870p = 1.0f;
        int i10 = (j3 > Long.MAX_VALUE ? 1 : (j3 == Long.MAX_VALUE ? 0 : -1));
        org.telegram.ui.Components.l9 l9Var = this.f29023a;
        md mdVar = this.f29024b;
        if (i10 == 0) {
            mdVar.setText(a());
            if (this.f29027f == null) {
                this.f29027f = new c7(getContext(), l9Var, true, 2131231615, this.D);
            }
            l9Var.j(null, null, this.f29027f, null);
        } else {
            boolean E = org.telegram.messenger.m5.E(j3);
            org.telegram.ui.Components.w5 w5Var = this.G;
            org.telegram.ui.Components.w5 w5Var2 = this.E;
            int i11 = this.f29033y;
            if (E) {
                this.h = qp.s1(i11).a2(Long.valueOf(j3));
                TL_account.RequirementToContact J2 = qp.s1(i11).J2(j3);
                this.F = J2 instanceof TL_account.requirementToContactPremium;
                this.H = org.telegram.messenger.m5.k(J2);
                if (this.F) {
                    i7 = org.telegram.ui.ActionBar.k6.C6;
                } else {
                    i7 = org.telegram.ui.ActionBar.k6.f27960j5;
                }
                org.telegram.ui.ActionBar.r6.V(mdVar, i7, this.D);
                w5Var2.a(this.F);
                if (this.H > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                w5Var.a(z10);
                invalidate();
                b7Var.r(this.h);
                int i12 = this.f29028n;
                if (i12 != 2 && t10.z(this.h)) {
                    mdVar.setText(id.M0(2131746267, null));
                    b7Var.g(12);
                    l9Var.j(null, null, b7Var, this.h);
                } else if (i12 != 2 && t10.B(this.h)) {
                    mdVar.setText(id.M0(2131745904, null));
                    b7Var.g(1);
                    l9Var.j(null, null, b7Var, this.h);
                } else {
                    if (charSequence != null) {
                        mdVar.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            mdVar.setText(org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                        } else {
                            mdVar.setText("");
                        }
                    }
                    l9Var.e(this.h, b7Var);
                }
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
            } else {
                this.h = null;
                this.F = false;
                w5Var2.e(true, 0.0f);
                this.H = qp.s1(i11).N1(j3);
                w5Var.getClass();
                w5Var.e(true, 0.0f);
                TLRPC.Chat M0 = qp.s1(i11).M0(Long.valueOf(-j3));
                if (charSequence != null) {
                    mdVar.setText(charSequence);
                } else if (M0 != null) {
                    if (M0.monoforum) {
                        mdVar.setText(qg.d.i(i11, M0, false));
                    } else {
                        mdVar.setText(M0.title);
                    }
                } else {
                    mdVar.setText("");
                }
                if (org.telegram.messenger.t3.p0(M0)) {
                    qg.d.o(i11, M0, b7Var, l9Var);
                } else {
                    b7Var.q(M0);
                    l9Var.e(M0, b7Var);
                }
                if (M0 != null && (M0.forum || M0.monoforum)) {
                    L = org.telegram.messenger.g0.L(16.0f);
                } else {
                    L = org.telegram.messenger.g0.L(28.0f);
                }
                l9Var.setRoundRadius(L);
            }
        }
        this.f29031w = j3;
        this.d.a(z9, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z9, boolean z10) {
        boolean z11;
        float f10;
        boolean z12 = this.f29032x;
        if (tL_forumTopic != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z12 == z11 && z10) {
            return;
        }
        org.telegram.ui.ActionBar.k5 k5Var = this.f29025c;
        r1.g gVar = (r1.g) k5Var.getTag(2131296663);
        if (gVar != null) {
            gVar.d();
        }
        if (z11) {
            if (z9) {
                k5Var.l(qp.s1(this.f29033y).B1(org.telegram.messenger.m5.o(tL_forumTopic.from_id), false), false);
            } else {
                k5Var.l(qg.d.j(tL_forumTopic, k5Var.getTextPaint(), null), false);
            }
            k5Var.requestLayout();
        }
        float f11 = 0.0f;
        if (z10) {
            if (z11) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            r1.g gVar2 = new r1.g(new r1.f(f10));
            if (z11) {
                f11 = 1000.0f;
            }
            r1.h hVar = new r1.h(f11);
            hVar.b(1500.0f);
            hVar.a(1.0f);
            gVar2.f54267m = hVar;
            gVar2.b(new r1.d() {
                @Override
                public final void a(r1.g gVar3, float f12, float f13) {
                    float f14 = f12 / 1000.0f;
                    d7 d7Var = d7.this;
                    org.telegram.ui.ActionBar.k5 k5Var2 = d7Var.f29025c;
                    k5Var2.setAlpha(f14);
                    md mdVar = d7Var.f29024b;
                    float f15 = 1.0f - f14;
                    mdVar.setAlpha(f15);
                    k5Var2.setTranslationX(f15 * (-org.telegram.messenger.g0.L(10.0f)));
                    mdVar.setTranslationX(f14 * org.telegram.messenger.g0.L(10.0f));
                }
            });
            gVar2.a(new r1.c() {
                @Override
                public final void a(r1.g gVar3, boolean z13, float f12, float f13) {
                    d7.this.f29025c.setTag(2131296663, null);
                }
            });
            k5Var.setTag(2131296663, gVar2);
            gVar2.h();
        } else {
            md mdVar = this.f29024b;
            if (z11) {
                k5Var.setAlpha(1.0f);
                mdVar.setAlpha(0.0f);
                k5Var.setTranslationX(0.0f);
                mdVar.setTranslationX(org.telegram.messenger.g0.L(10.0f));
            } else {
                k5Var.setAlpha(0.0f);
                mdVar.setAlpha(1.0f);
                k5Var.setTranslationX(-org.telegram.messenger.g0.L(10.0f));
                mdVar.setTranslationX(0.0f);
            }
        }
        this.f29032x = z11;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TL_account.RequirementToContact requirementToContact;
        long k10;
        int i11;
        if (i7 == qs.f25017i3) {
            TLRPC.User user = this.h;
            int i12 = this.f29033y;
            if (user != null) {
                requirementToContact = qp.s1(i12).J2(this.h.f27105id);
            } else {
                requirementToContact = null;
            }
            if (this.f29031w < 0) {
                k10 = qp.s1(i12).N1(this.f29031w);
            } else {
                k10 = org.telegram.messenger.m5.k(requirementToContact);
            }
            boolean z9 = requirementToContact instanceof TL_account.requirementToContactPremium;
            if (this.F != z9 || this.H != k10) {
                this.F = z9;
                this.H = k10;
                if (z9) {
                    i11 = org.telegram.ui.ActionBar.k6.C6;
                } else {
                    i11 = org.telegram.ui.ActionBar.k6.f27960j5;
                }
                org.telegram.ui.ActionBar.r6.V(this.f29024b, i11, this.D);
                invalidate();
            }
        }
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r27, android.view.View r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.d7.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getCurrentDialog() {
        return this.f29031w;
    }

    public org.telegram.ui.Components.l9 getImageView() {
        return this.f29023a;
    }

    public long getStarsPrice() {
        return this.H;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.f29033y).c(this, qs.f25017i3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.f29033y).n(this, qs.f25017i3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        org.telegram.ui.Components.l9 l9Var = this.f29023a;
        int measuredWidth = (l9Var.getMeasuredWidth() / 2) + l9Var.getLeft();
        int measuredHeight = (l9Var.getMeasuredHeight() / 2) + l9Var.getTop();
        org.telegram.ui.ActionBar.k6.f28047o0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B5, this.D));
        org.telegram.ui.ActionBar.k6.f28047o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        if (this.f29028n == 2) {
            f10 = 24.0f;
        } else {
            f10 = 28.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(measuredWidth - L, measuredHeight - L, measuredWidth + L, measuredHeight + L);
        canvas.drawRoundRect(rectF, l9Var.getRoundRadius()[0], l9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.k6.f28047o0);
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.d.f40008a.f31263q) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        if (this.f29028n == 2) {
            f10 = 95.0f;
        } else {
            f10 = 103.0f;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }
}
