package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.nr;
public class n6 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final ab0 I;
    public static final ab0 J;
    public static final ab0 K;
    public static final ab0 L;
    public long E;
    public final l6 F;
    public float G;
    public ValueAnimator H;
    public boolean f31144a;
    public final int f31145b;
    public final m6 f31146c;
    public final fi.u3 d;
    public final org.telegram.ui.ActionBar.m5 f31147e;
    public final org.telegram.ui.Components.q9 f31148f;
    public final org.telegram.ui.Components.q9 h;
    public int f31149n;
    public final org.telegram.ui.Components.b9 f31150r;
    public final View f31151s;
    public final av0 f31152w;
    public final org.telegram.ui.ActionBar.h6 f31153x;
    public final int f31154y;

    static {
        int i7 = org.telegram.ui.ActionBar.m6.f29770y6;
        I = new ab0(2131232236, i7);
        ab0 ab0Var = new ab0(2131232325, i7);
        ab0Var.f33471g = 16;
        ab0Var.h = 16;
        ab0Var.f33472i = 5.66f;
        J = ab0Var;
        int i10 = org.telegram.ui.ActionBar.m6.Yk;
        K = new ab0(2131231972, i10);
        L = new ab0(2131231946, i10);
    }

    public n6(int i7, int i10, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, boolean z11) {
        super(context);
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        this.f31150r = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        this.G = 1.0f;
        this.f31154y = i7;
        this.f31145b = i10;
        this.f31153x = h6Var;
        this.F = new l6(this, h6Var);
        setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(50.0f)));
        if (i7 == 1) {
            i11 = 48;
        } else {
            i11 = 34;
        }
        m6 m6Var = new m6(this, context, i7);
        this.f31146c = m6Var;
        float f14 = i11;
        m6Var.setRoundRadius(org.telegram.messenger.g0.L(f14));
        addView(m6Var, c8.ma.i(f14, f14, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i7 == 1) {
            setClipChildren(false);
        }
        fi.u3 u3Var = new fi.u3(context, 2);
        this.d = u3Var;
        ks.i(u3Var);
        u3Var.setTextSize(16);
        org.telegram.ui.ActionBar.t6.X(u3Var, org.telegram.ui.ActionBar.m6.E8, h6Var);
        u3Var.setEllipsizeByGradient(true);
        u3Var.setImportantForAccessibility(2);
        u3Var.setRightPadding(org.telegram.messenger.g0.L(30.0f));
        if (gd.f24241a0) {
            f10 = org.telegram.messenger.g0.L(30.0f);
        } else {
            f10 = 0.0f;
        }
        u3Var.setTranslationX(f10);
        u3Var.setRightDrawableOutside(true);
        if (i7 == 1) {
            f11 = 7.66f;
        } else {
            f11 = 5.33f;
        }
        float f15 = f11;
        if (i7 == 1) {
            f12 = 73.0f;
        } else {
            f12 = 55.0f;
        }
        float f16 = f12;
        addView(u3Var, c8.ma.i(-1.0f, -2.0f, 55, f16, f15, 12.0f, 0.0f));
        av0 av0Var = new av0(this);
        this.f31152w = av0Var;
        u3Var.setDrawablePadding(org.telegram.messenger.g0.L(3.0f));
        u3Var.i(av0Var.f33637a);
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f31147e = m5Var;
        m5Var.setTextSize(13);
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.f29770y6, h6Var);
        m5Var.setEllipsizeByGradient(true);
        m5Var.setImportantForAccessibility(2);
        m5Var.setTranslationX(gd.f24241a0 ? org.telegram.messenger.g0.L(30.0f) : 0.0f);
        if (i7 == 1) {
            f13 = 24.0f;
        } else {
            f13 = 19.0f;
        }
        addView(m5Var, c8.ma.i(-1.0f, -2.0f, 55, f16, f13, 20.0f, 0.0f));
        if (z11) {
            org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
            this.f31148f = q9Var;
            addView(q9Var, c8.ma.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.q9 q9Var2 = new org.telegram.ui.Components.q9(context);
            this.h = q9Var2;
            addView(q9Var2, c8.ma.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z10) {
            View view = new View(context);
            this.f31151s = view;
            view.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
            addView(view, c8.ma.c(-1.0f, -1));
        }
    }

    public final void a(boolean z10, float f10) {
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.H = null;
        }
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, f10);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new r(this, 4));
            this.H.addListener(new org.telegram.ui.ActionBar.s0(this, f10, 2));
            this.H.setInterpolator(nr.h);
            this.H.setDuration(420L);
            this.H.start();
            return;
        }
        this.G = f10;
        invalidate();
    }

    public final void c(org.telegram.tgnet.TLRPC.User r20, org.telegram.tgnet.TLRPC.Chat r21, org.telegram.tgnet.TLRPC.Reaction r22, boolean r23, long r24, org.telegram.tgnet.tl.TL_stories.StoryItem r26, boolean r27, boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n6.c(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$Reaction, boolean, long, org.telegram.tgnet.tl.TL_stories$StoryItem, boolean, boolean, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f10;
        if (this.G < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (this.G * 255.0f), 31);
            z10 = true;
        } else {
            z10 = false;
        }
        super.dispatchDraw(canvas);
        if (this.f31144a) {
            if (this.f31154y == 1) {
                f10 = 73.0f;
            } else {
                f10 = 55.0f;
            }
            float L2 = org.telegram.messenger.g0.L(f10);
            boolean z11 = gd.f24241a0;
            org.telegram.ui.ActionBar.h6 h6Var = this.f31153x;
            if (z11) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L2, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.W0("paintDivider", h6Var));
            } else {
                canvas.drawLine(L2, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.W0("paintDivider", h6Var));
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.G;
    }

    public org.telegram.ui.ActionBar.h6 getResourcesProvider() {
        return this.f31153x;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31152w.f33637a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31152w.f33637a.b();
        this.F.g();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        if (this.f31154y == 0) {
            i11 = 50;
        } else {
            i11 = 58;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11), 1073741824));
    }

    public void setUserReaction(TLRPC.MessagePeerReaction messagePeerReaction) {
        TLRPC.User user;
        if (messagePeerReaction == null) {
            return;
        }
        long B1 = fj.B1(messagePeerReaction.peer_id);
        int i7 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
        int i10 = this.f31145b;
        TLRPC.Chat chat = null;
        if (i7 > 0) {
            user = mp.u1(i10).c2(Long.valueOf(B1));
        } else {
            user = null;
            chat = mp.u1(i10).O0(Long.valueOf(-B1));
        }
        c(user, chat, messagePeerReaction.reaction, false, messagePeerReaction.date, null, false, messagePeerReaction.dateIsSeen, false);
    }

    @Override
    public final void updateColors() {
        boolean z10;
        int i7;
        av0 av0Var = this.f31152w;
        if (av0Var != null) {
            try {
                org.telegram.ui.Components.n5 n5Var = av0Var.f33637a;
                if (n5Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && n5Var.G != null) {
                    if (this.f31154y == 1) {
                        i7 = org.telegram.ui.ActionBar.m6.G6;
                    } else {
                        i7 = org.telegram.ui.ActionBar.m6.f29792z9;
                    }
                    n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(i7, this.f31153x)));
                    fi.u3 u3Var = this.d;
                    if (u3Var != null) {
                        u3Var.invalidate();
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(long j3) {
    }
}
