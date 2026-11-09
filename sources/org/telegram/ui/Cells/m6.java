package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.xq;
public class m6 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final pa0 H;
    public static final pa0 I;
    public static final pa0 J;
    public static final pa0 K;
    public long D;
    public final k6 E;
    public float F;
    public ValueAnimator G;
    public boolean f29553a;
    public final int f29554b;
    public final l6 f29555c;
    public final di.e4 d;
    public final org.telegram.ui.ActionBar.l5 f29556e;
    public final org.telegram.ui.Components.l9 f29557f;
    public final org.telegram.ui.Components.l9 h;
    public int f29558n;
    public final org.telegram.ui.Components.w8 f29559r;
    public final View f29560s;
    public final pu0 f29561w;
    public final org.telegram.ui.ActionBar.g6 f29562x;
    public final int f29563y;

    static {
        int i7 = org.telegram.ui.ActionBar.l6.f28257y6;
        H = new pa0(2131232234, i7);
        pa0 pa0Var = new pa0(2131232323, i7);
        pa0Var.f36966g = 16;
        pa0Var.h = 16;
        pa0Var.f36967i = 5.66f;
        I = pa0Var;
        int i10 = org.telegram.ui.ActionBar.l6.Vk;
        J = new pa0(2131231971, i10);
        K = new pa0(2131231945, i10);
    }

    public m6(int i7, int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9, boolean z10) {
        super(context);
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        this.f29559r = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        this.F = 1.0f;
        this.f29563y = i7;
        this.f29554b = i10;
        this.f29562x = g6Var;
        this.E = new k6(this, g6Var);
        setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(50.0f)));
        if (i7 == 1) {
            i11 = 48;
        } else {
            i11 = 34;
        }
        l6 l6Var = new l6(this, context, i7);
        this.f29555c = l6Var;
        float f14 = i11;
        l6Var.setRoundRadius(org.telegram.messenger.g0.L(f14));
        addView(l6Var, c8.ha.i(f14, f14, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i7 == 1) {
            setClipChildren(false);
        }
        di.e4 e4Var = new di.e4(context, 2);
        this.d = e4Var;
        qs.i(e4Var);
        e4Var.setTextSize(16);
        org.telegram.ui.ActionBar.s6.X(e4Var, org.telegram.ui.ActionBar.l6.E8, g6Var);
        e4Var.setEllipsizeByGradient(true);
        e4Var.setImportantForAccessibility(2);
        e4Var.setRightPadding(org.telegram.messenger.g0.L(30.0f));
        if (id.f23157a0) {
            f10 = org.telegram.messenger.g0.L(30.0f);
        } else {
            f10 = 0.0f;
        }
        e4Var.setTranslationX(f10);
        e4Var.setRightDrawableOutside(true);
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
        addView(e4Var, c8.ha.i(-1.0f, -2.0f, 55, f16, f15, 12.0f, 0.0f));
        pu0 pu0Var = new pu0(this);
        this.f29561w = pu0Var;
        e4Var.setDrawablePadding(org.telegram.messenger.g0.L(3.0f));
        e4Var.i(pu0Var.f37095a);
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f29556e = l5Var;
        l5Var.setTextSize(13);
        org.telegram.ui.ActionBar.s6.X(l5Var, org.telegram.ui.ActionBar.l6.f28257y6, g6Var);
        l5Var.setEllipsizeByGradient(true);
        l5Var.setImportantForAccessibility(2);
        l5Var.setTranslationX(id.f23157a0 ? org.telegram.messenger.g0.L(30.0f) : 0.0f);
        if (i7 == 1) {
            f13 = 24.0f;
        } else {
            f13 = 19.0f;
        }
        addView(l5Var, c8.ha.i(-1.0f, -2.0f, 55, f16, f13, 20.0f, 0.0f));
        if (z10) {
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
            this.f29557f = l9Var;
            addView(l9Var, c8.ha.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.l9 l9Var2 = new org.telegram.ui.Components.l9(context);
            this.h = l9Var2;
            addView(l9Var2, c8.ha.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z9) {
            View view = new View(context);
            this.f29560s = view;
            view.setBackground(org.telegram.ui.ActionBar.l6.N0(false));
            addView(view, c8.ha.c(-1.0f, -1));
        }
    }

    public final void a(boolean z9, float f10) {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (z9) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, f10);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new r(this, 4));
            this.G.addListener(new org.telegram.ui.ActionBar.t0(this, f10, 2));
            this.G.setInterpolator(xq.h);
            this.G.setDuration(420L);
            this.G.start();
            return;
        }
        this.F = f10;
        invalidate();
    }

    public final void c(org.telegram.tgnet.TLRPC.User r20, org.telegram.tgnet.TLRPC.Chat r21, org.telegram.tgnet.TLRPC.Reaction r22, boolean r23, long r24, org.telegram.tgnet.tl.TL_stories.StoryItem r26, boolean r27, boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.m6.c(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$Reaction, boolean, long, org.telegram.tgnet.tl.TL_stories$StoryItem, boolean, boolean, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z9;
        float f10;
        if (this.F < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (this.F * 255.0f), 31);
            z9 = true;
        } else {
            z9 = false;
        }
        super.dispatchDraw(canvas);
        if (this.f29553a) {
            if (this.f29563y == 1) {
                f10 = 73.0f;
            } else {
                f10 = 55.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            boolean z10 = id.f23157a0;
            org.telegram.ui.ActionBar.g6 g6Var = this.f29562x;
            if (z10) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.l6.W0("paintDivider", g6Var));
            } else {
                canvas.drawLine(L, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.l6.W0("paintDivider", g6Var));
            }
        }
        if (z9) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.F;
    }

    public org.telegram.ui.ActionBar.g6 getResourcesProvider() {
        return this.f29562x;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29561w.f37095a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29561w.f37095a.b();
        this.E.g();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        if (this.f29563y == 0) {
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
        long B1 = ij.B1(messagePeerReaction.peer_id);
        int i7 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
        int i10 = this.f29554b;
        TLRPC.Chat chat = null;
        if (i7 > 0) {
            user = qp.s1(i10).a2(Long.valueOf(B1));
        } else {
            user = null;
            chat = qp.s1(i10).M0(Long.valueOf(-B1));
        }
        c(user, chat, messagePeerReaction.reaction, false, messagePeerReaction.date, null, false, messagePeerReaction.dateIsSeen, false);
    }

    @Override
    public final void updateColors() {
        boolean z9;
        int i7;
        pu0 pu0Var = this.f29561w;
        if (pu0Var != null) {
            try {
                org.telegram.ui.Components.g5 g5Var = pu0Var.f37095a;
                if (g5Var != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 && g5Var.F != null) {
                    if (this.f29563y == 1) {
                        i7 = org.telegram.ui.ActionBar.l6.G6;
                    } else {
                        i7 = org.telegram.ui.ActionBar.l6.z9;
                    }
                    g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(i7, this.f29562x)));
                    di.e4 e4Var = this.d;
                    if (e4Var != null) {
                        e4Var.invalidate();
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
