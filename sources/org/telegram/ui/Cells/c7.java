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
import di.tb;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.oy0;
public class c7 extends FrameLayout implements is {
    public final org.telegram.ui.ActionBar.e6 E;
    public final org.telegram.ui.Components.u5 F;
    public boolean G;
    public final org.telegram.ui.Components.u5 H;
    public long I;
    public ug.z0 J;
    public Drawable K;
    public final Paint L;
    public long M;
    public oy0 N;
    public final org.telegram.ui.Components.i9 f30109a;
    public final tb f30110b;
    public final org.telegram.ui.ActionBar.j5 f30111c;
    public final fp d;
    public final a7 f30112e;
    public b7 f30113f;
    public TLRPC.User h;
    public final int f30114n;
    public float f30115r;
    public long f30116s;
    public long f30117w;
    public boolean f30118x;
    public final int f30119y;

    public c7(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        float f10;
        float f11;
        float f12;
        this.f30119y = m10.f24940t0;
        er erVar = er.h;
        this.F = new org.telegram.ui.Components.u5(this, 0L, 350L, erVar);
        this.H = new org.telegram.ui.Components.u5(this, 0L, 350L, erVar);
        this.L = new Paint();
        this.E = e6Var;
        this.f30112e = new a7(this, e6Var, 0);
        setWillNotDraw(false);
        this.f30114n = i7;
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f30109a = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        if (i7 == 2) {
            addView(i9Var, c8.ja.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(i9Var, c8.ja.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        tb tbVar = new tb(context, 8);
        this.f30110b = tbVar;
        ns.i(tbVar);
        if (this.G) {
            i10 = org.telegram.ui.ActionBar.j6.C6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f28957j5;
        }
        org.telegram.ui.ActionBar.q6.U(tbVar, i10, e6Var);
        tbVar.setTextSize(1, 12.0f);
        tbVar.setMaxLines(2);
        tbVar.setGravity(49);
        tbVar.setLines(2);
        tbVar.setEllipsize(TextUtils.TruncateAt.END);
        if (i7 == 2) {
            f10 = 58.0f;
        } else {
            f10 = 66.0f;
        }
        addView(tbVar, c8.ja.d(-1, -2.0f, 51, 6.0f, f10, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f30111c = j5Var;
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
        j5Var.setTextSize(12);
        j5Var.setMaxLines(2);
        j5Var.setGravity(49);
        j5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        if (i7 == 2) {
            f11 = 58.0f;
        } else {
            f11 = 66.0f;
        }
        addView(j5Var, c8.ja.d(-1, -2.0f, 51, 6.0f, f11, 6.0f, 0.0f));
        fp fpVar = new fp(21, context, e6Var);
        this.d = fpVar;
        fpVar.b(org.telegram.ui.ActionBar.j6.B5, org.telegram.ui.ActionBar.j6.f28922h5, org.telegram.ui.ActionBar.j6.C5);
        fpVar.setDrawUnchecked(false);
        fpVar.setDrawBackgroundAsArc(4);
        fpVar.setProgressDelegate(new ca(this, 5));
        if (i7 == 2) {
            f12 = -40.0f;
        } else {
            f12 = 42.0f;
        }
        addView(fpVar, c8.ja.d(24, 24.0f, 49, 19.0f, f12, 0.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.j6.f28941i6;
        Drawable a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i11, e6Var), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
        setBackground(a02);
        org.telegram.ui.ActionBar.q6.j(this, a02, null, M, e6Var);
    }

    public String a() {
        return hd.M0(2131750488, null);
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
        a7 a7Var = this.f30112e;
        a7Var.f39598p = 1.0f;
        int i10 = (j3 > Long.MAX_VALUE ? 1 : (j3 == Long.MAX_VALUE ? 0 : -1));
        org.telegram.ui.Components.i9 i9Var = this.f30109a;
        tb tbVar = this.f30110b;
        if (i10 == 0) {
            tbVar.setText(a());
            if (this.f30113f == null) {
                this.f30113f = new b7(getContext(), i9Var, true, 2131231615, this.E);
            }
            i9Var.j(null, null, this.f30113f, null);
        } else {
            boolean E = org.telegram.messenger.m5.E(j3);
            org.telegram.ui.Components.u5 u5Var = this.H;
            org.telegram.ui.Components.u5 u5Var2 = this.F;
            int i11 = this.f30119y;
            if (E) {
                this.h = np.s1(i11).a2(Long.valueOf(j3));
                TL_account.RequirementToContact J2 = np.s1(i11).J2(j3);
                this.G = J2 instanceof TL_account.requirementToContactPremium;
                this.I = org.telegram.messenger.m5.k(J2);
                if (this.G) {
                    i7 = org.telegram.ui.ActionBar.j6.C6;
                } else {
                    i7 = org.telegram.ui.ActionBar.j6.f28957j5;
                }
                org.telegram.ui.ActionBar.q6.U(tbVar, i7, this.E);
                u5Var2.a(this.G);
                if (this.I > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                u5Var.a(z11);
                invalidate();
                a7Var.r(this.h);
                int i12 = this.f30114n;
                if (i12 != 2 && q10.z(this.h)) {
                    tbVar.setText(hd.M0(2131746266, null));
                    a7Var.g(12);
                    i9Var.j(null, null, a7Var, this.h);
                } else if (i12 != 2 && q10.B(this.h)) {
                    tbVar.setText(hd.M0(2131745901, null));
                    a7Var.g(1);
                    i9Var.j(null, null, a7Var, this.h);
                } else {
                    if (charSequence != null) {
                        tbVar.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            tbVar.setText(org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                        } else {
                            tbVar.setText("");
                        }
                    }
                    i9Var.f(this.h, a7Var);
                }
                i9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
            } else {
                this.h = null;
                this.G = false;
                u5Var2.e(true, 0.0f);
                this.I = np.s1(i11).N1(j3);
                u5Var.getClass();
                u5Var.e(true, 0.0f);
                TLRPC.Chat M0 = np.s1(i11).M0(Long.valueOf(-j3));
                if (charSequence != null) {
                    tbVar.setText(charSequence);
                } else if (M0 != null) {
                    if (M0.monoforum) {
                        tbVar.setText(qg.c.i(i11, M0, false));
                    } else {
                        tbVar.setText(M0.title);
                    }
                } else {
                    tbVar.setText("");
                }
                if (org.telegram.messenger.t3.p0(M0)) {
                    qg.c.o(i11, M0, a7Var, i9Var);
                } else {
                    a7Var.q(M0);
                    i9Var.f(M0, a7Var);
                }
                if (M0 != null && (M0.forum || M0.monoforum)) {
                    L = org.telegram.messenger.g0.L(16.0f);
                } else {
                    L = org.telegram.messenger.g0.L(28.0f);
                }
                i9Var.setRoundRadius(L);
            }
        }
        this.f30117w = j3;
        this.d.a(z10, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11) {
        boolean z12;
        float f10;
        boolean z13 = this.f30118x;
        if (tL_forumTopic != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z13 == z12 && z11) {
            return;
        }
        org.telegram.ui.ActionBar.j5 j5Var = this.f30111c;
        r1.g gVar = (r1.g) j5Var.getTag(2131296663);
        if (gVar != null) {
            gVar.d();
        }
        if (z12) {
            if (z10) {
                j5Var.l(np.s1(this.f30119y).B1(org.telegram.messenger.m5.o(tL_forumTopic.from_id), false), false);
            } else {
                j5Var.l(qg.c.j(tL_forumTopic, j5Var.getTextPaint(), null), false);
            }
            j5Var.requestLayout();
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
            gVar2.f55748m = hVar;
            gVar2.b(new r1.d() {
                @Override
                public final void a(r1.g gVar3, float f12, float f13) {
                    float f14 = f12 / 1000.0f;
                    c7 c7Var = c7.this;
                    org.telegram.ui.ActionBar.j5 j5Var2 = c7Var.f30111c;
                    j5Var2.setAlpha(f14);
                    tb tbVar = c7Var.f30110b;
                    float f15 = 1.0f - f14;
                    tbVar.setAlpha(f15);
                    j5Var2.setTranslationX(f15 * (-org.telegram.messenger.g0.L(10.0f)));
                    tbVar.setTranslationX(f14 * org.telegram.messenger.g0.L(10.0f));
                }
            });
            gVar2.a(new r1.c() {
                @Override
                public final void a(r1.g gVar3, boolean z14, float f12, float f13) {
                    c7.this.f30111c.setTag(2131296663, null);
                }
            });
            j5Var.setTag(2131296663, gVar2);
            gVar2.h();
        } else {
            tb tbVar = this.f30110b;
            if (z12) {
                j5Var.setAlpha(1.0f);
                tbVar.setAlpha(0.0f);
                j5Var.setTranslationX(0.0f);
                tbVar.setTranslationX(org.telegram.messenger.g0.L(10.0f));
            } else {
                j5Var.setAlpha(0.0f);
                tbVar.setAlpha(1.0f);
                j5Var.setTranslationX(-org.telegram.messenger.g0.L(10.0f));
                tbVar.setTranslationX(0.0f);
            }
        }
        this.f30118x = z12;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TL_account.RequirementToContact requirementToContact;
        long k10;
        int i11;
        if (i7 == ns.f25514i3) {
            TLRPC.User user = this.h;
            int i12 = this.f30119y;
            if (user != null) {
                requirementToContact = np.s1(i12).J2(this.h.f28200id);
            } else {
                requirementToContact = null;
            }
            if (this.f30117w < 0) {
                k10 = np.s1(i12).N1(this.f30117w);
            } else {
                k10 = org.telegram.messenger.m5.k(requirementToContact);
            }
            boolean z10 = requirementToContact instanceof TL_account.requirementToContactPremium;
            if (this.G != z10 || this.I != k10) {
                this.G = z10;
                this.I = k10;
                if (z10) {
                    i11 = org.telegram.ui.ActionBar.j6.C6;
                } else {
                    i11 = org.telegram.ui.ActionBar.j6.f28957j5;
                }
                org.telegram.ui.ActionBar.q6.U(this.f30110b, i11, this.E);
                invalidate();
            }
        }
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r27, android.view.View r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.c7.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getCurrentDialog() {
        return this.f30117w;
    }

    public org.telegram.ui.Components.i9 getImageView() {
        return this.f30109a;
    }

    public long getStarsPrice() {
        return this.I;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ns.f(this.f30119y).c(this, ns.f25514i3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(this.f30119y).n(this, ns.f25514i3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        org.telegram.ui.Components.i9 i9Var = this.f30109a;
        int measuredWidth = (i9Var.getMeasuredWidth() / 2) + i9Var.getLeft();
        int measuredHeight = (i9Var.getMeasuredHeight() / 2) + i9Var.getTop();
        org.telegram.ui.ActionBar.j6.f29044o0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.B5, this.E));
        org.telegram.ui.ActionBar.j6.f29044o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        if (this.f30114n == 2) {
            f10 = 24.0f;
        } else {
            f10 = 28.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(measuredWidth - L, measuredHeight - L, measuredWidth + L, measuredHeight + L);
        canvas.drawRoundRect(rectF, i9Var.getRoundRadius()[0], i9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.j6.f29044o0);
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.d.f34667a.f32441q) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        if (this.f30114n == 2) {
            f10 = 95.0f;
        } else {
            f10 = 103.0f;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }
}
