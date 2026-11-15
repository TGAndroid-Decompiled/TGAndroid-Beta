package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.pu0;
public class l6 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final pa0 I;
    public static final pa0 J;
    public static final pa0 K;
    public static final pa0 L;
    public long E;
    public final j6 F;
    public float G;
    public ValueAnimator H;
    public boolean f30635a;
    public final int f30636b;
    public final k6 f30637c;
    public final fi.w3 d;
    public final org.telegram.ui.ActionBar.j5 f30638e;
    public final org.telegram.ui.Components.i9 f30639f;
    public final org.telegram.ui.Components.i9 h;
    public int f30640n;
    public final org.telegram.ui.Components.t8 f30641r;
    public final View f30642s;
    public final pu0 f30643w;
    public final org.telegram.ui.ActionBar.e6 f30644x;
    public final int f30645y;

    static {
        int i7 = org.telegram.ui.ActionBar.j6.f29241y6;
        I = new pa0(2131232235, i7);
        pa0 pa0Var = new pa0(2131232324, i7);
        pa0Var.f38259g = 16;
        pa0Var.h = 16;
        pa0Var.f38260i = 5.66f;
        J = pa0Var;
        int i10 = org.telegram.ui.ActionBar.j6.Yk;
        K = new pa0(2131231971, i10);
        L = new pa0(2131231945, i10);
    }

    public l6(int i7, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context);
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        this.f30641r = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.G = 1.0f;
        this.f30645y = i7;
        this.f30636b = i10;
        this.f30644x = e6Var;
        this.F = new j6(this, e6Var);
        setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(50.0f)));
        if (i7 == 1) {
            i11 = 48;
        } else {
            i11 = 34;
        }
        k6 k6Var = new k6(this, context, i7);
        this.f30637c = k6Var;
        float f14 = i11;
        k6Var.setRoundRadius(org.telegram.messenger.g0.L(f14));
        addView(k6Var, c8.ja.i(f14, f14, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i7 == 1) {
            setClipChildren(false);
        }
        fi.w3 w3Var = new fi.w3(context, 2);
        this.d = w3Var;
        ns.i(w3Var);
        w3Var.setTextSize(16);
        org.telegram.ui.ActionBar.q6.X(w3Var, org.telegram.ui.ActionBar.j6.E8, e6Var);
        w3Var.setEllipsizeByGradient(true);
        w3Var.setImportantForAccessibility(2);
        w3Var.setRightPadding(org.telegram.messenger.g0.L(30.0f));
        if (hd.f24101a0) {
            f10 = org.telegram.messenger.g0.L(30.0f);
        } else {
            f10 = 0.0f;
        }
        w3Var.setTranslationX(f10);
        w3Var.setRightDrawableOutside(true);
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
        addView(w3Var, c8.ja.i(-1.0f, -2.0f, 55, f16, f15, 12.0f, 0.0f));
        pu0 pu0Var = new pu0(this);
        this.f30643w = pu0Var;
        w3Var.setDrawablePadding(org.telegram.messenger.g0.L(3.0f));
        w3Var.i(pu0Var.f38413a);
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f30638e = j5Var;
        j5Var.setTextSize(13);
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.f29241y6, e6Var);
        j5Var.setEllipsizeByGradient(true);
        j5Var.setImportantForAccessibility(2);
        j5Var.setTranslationX(hd.f24101a0 ? org.telegram.messenger.g0.L(30.0f) : 0.0f);
        if (i7 == 1) {
            f13 = 24.0f;
        } else {
            f13 = 19.0f;
        }
        addView(j5Var, c8.ja.i(-1.0f, -2.0f, 55, f16, f13, 20.0f, 0.0f));
        if (z11) {
            org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
            this.f30639f = i9Var;
            addView(i9Var, c8.ja.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.i9 i9Var2 = new org.telegram.ui.Components.i9(context);
            this.h = i9Var2;
            addView(i9Var2, c8.ja.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z10) {
            View view = new View(context);
            this.f30642s = view;
            view.setBackground(org.telegram.ui.ActionBar.j6.N0(false));
            addView(view, c8.ja.c(-1.0f, -1));
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
            this.H.addListener(new org.telegram.ui.ActionBar.t0(this, f10, 2));
            this.H.setInterpolator(er.h);
            this.H.setDuration(420L);
            this.H.start();
            return;
        }
        this.G = f10;
        invalidate();
    }

    public final void c(org.telegram.tgnet.TLRPC.User r20, org.telegram.tgnet.TLRPC.Chat r21, org.telegram.tgnet.TLRPC.Reaction r22, boolean r23, long r24, org.telegram.tgnet.tl.TL_stories.StoryItem r26, boolean r27, boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l6.c(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$Reaction, boolean, long, org.telegram.tgnet.tl.TL_stories$StoryItem, boolean, boolean, boolean):void");
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
        if (this.f30635a) {
            if (this.f30645y == 1) {
                f10 = 73.0f;
            } else {
                f10 = 55.0f;
            }
            float L2 = org.telegram.messenger.g0.L(f10);
            boolean z11 = hd.f24101a0;
            org.telegram.ui.ActionBar.e6 e6Var = this.f30644x;
            if (z11) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L2, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.W0("paintDivider", e6Var));
            } else {
                canvas.drawLine(L2, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.W0("paintDivider", e6Var));
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.G;
    }

    public org.telegram.ui.ActionBar.e6 getResourcesProvider() {
        return this.f30644x;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30643w.f38413a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30643w.f38413a.b();
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
        if (this.f30645y == 0) {
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
        long B1 = gj.B1(messagePeerReaction.peer_id);
        int i7 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
        int i10 = this.f30636b;
        TLRPC.Chat chat = null;
        if (i7 > 0) {
            user = np.s1(i10).a2(Long.valueOf(B1));
        } else {
            user = null;
            chat = np.s1(i10).M0(Long.valueOf(-B1));
        }
        c(user, chat, messagePeerReaction.reaction, false, messagePeerReaction.date, null, false, messagePeerReaction.dateIsSeen, false);
    }

    @Override
    public final void updateColors() {
        boolean z10;
        int i7;
        pu0 pu0Var = this.f30643w;
        if (pu0Var != null) {
            try {
                org.telegram.ui.Components.e5 e5Var = pu0Var.f38413a;
                if (e5Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && e5Var.G != null) {
                    if (this.f30645y == 1) {
                        i7 = org.telegram.ui.ActionBar.j6.G6;
                    } else {
                        i7 = org.telegram.ui.ActionBar.j6.f29263z9;
                    }
                    e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(i7, this.f30644x)));
                    fi.w3 w3Var = this.d;
                    if (w3Var != null) {
                        w3Var.invalidate();
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
