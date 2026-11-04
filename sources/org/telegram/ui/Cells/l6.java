package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.xq;
public class l6 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final ja0 I;
    public static final ja0 J;
    public static final ja0 K;
    public static final ja0 L;
    public long E;
    public final j6 F;
    public float G;
    public ValueAnimator H;
    public boolean f29574a;
    public final int f29575b;
    public final k6 f29576c;
    public final ei.e4 d;
    public final org.telegram.ui.ActionBar.k5 f29577e;
    public final org.telegram.ui.Components.k9 f29578f;
    public final org.telegram.ui.Components.k9 h;
    public int f29579n;
    public final org.telegram.ui.Components.u8 f29580r;
    public final View f29581s;
    public final mu0 f29582w;
    public final org.telegram.ui.ActionBar.e6 f29583x;
    public final int f29584y;

    static {
        int i3 = org.telegram.ui.ActionBar.k6.f28273y6;
        I = new ja0(2131232234, i3);
        ja0 ja0Var = new ja0(2131232323, i3);
        ja0Var.f35011g = 16;
        ja0Var.h = 16;
        ja0Var.f35012i = 5.66f;
        J = ja0Var;
        int i10 = org.telegram.ui.ActionBar.k6.Vk;
        K = new ja0(2131231971, i10);
        L = new ja0(2131231945, i10);
    }

    public l6(int i3, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context);
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        this.f29580r = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.G = 1.0f;
        this.f29584y = i3;
        this.f29575b = i10;
        this.f29583x = e6Var;
        this.F = new j6(this, e6Var);
        setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(50.0f)));
        if (i3 == 1) {
            i11 = 48;
        } else {
            i11 = 34;
        }
        k6 k6Var = new k6(this, context, i3);
        this.f29576c = k6Var;
        float f14 = i11;
        k6Var.setRoundRadius(org.telegram.messenger.g0.L(f14));
        addView(k6Var, mf.i(f14, f14, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i3 == 1) {
            setClipChildren(false);
        }
        ei.e4 e4Var = new ei.e4(context, 2);
        this.d = e4Var;
        hs.i(e4Var);
        e4Var.setTextSize(16);
        org.telegram.ui.ActionBar.r6.Y(e4Var, org.telegram.ui.ActionBar.k6.E8, e6Var);
        e4Var.setEllipsizeByGradient(true);
        e4Var.setImportantForAccessibility(2);
        e4Var.setRightPadding(org.telegram.messenger.g0.L(30.0f));
        if (bd.f21784a0) {
            f10 = org.telegram.messenger.g0.L(30.0f);
        } else {
            f10 = 0.0f;
        }
        e4Var.setTranslationX(f10);
        e4Var.setRightDrawableOutside(true);
        if (i3 == 1) {
            f11 = 7.66f;
        } else {
            f11 = 5.33f;
        }
        float f15 = f11;
        if (i3 == 1) {
            f12 = 73.0f;
        } else {
            f12 = 55.0f;
        }
        float f16 = f12;
        addView(e4Var, mf.i(-1.0f, -2.0f, 55, f16, f15, 12.0f, 0.0f));
        mu0 mu0Var = new mu0(this);
        this.f29582w = mu0Var;
        e4Var.setDrawablePadding(org.telegram.messenger.g0.L(3.0f));
        e4Var.i(mu0Var.f36254a);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f29577e = k5Var;
        k5Var.setTextSize(13);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.f28273y6, e6Var);
        k5Var.setEllipsizeByGradient(true);
        k5Var.setImportantForAccessibility(2);
        k5Var.setTranslationX(bd.f21784a0 ? org.telegram.messenger.g0.L(30.0f) : 0.0f);
        if (i3 == 1) {
            f13 = 24.0f;
        } else {
            f13 = 19.0f;
        }
        addView(k5Var, mf.i(-1.0f, -2.0f, 55, f16, f13, 20.0f, 0.0f));
        if (z11) {
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
            this.f29578f = k9Var;
            addView(k9Var, mf.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.k9 k9Var2 = new org.telegram.ui.Components.k9(context);
            this.h = k9Var2;
            addView(k9Var2, mf.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z10) {
            View view = new View(context);
            this.f29581s = view;
            view.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
            addView(view, mf.c(-1.0f, -1));
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
            this.H.setInterpolator(xq.h);
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
        if (this.f29574a) {
            if (this.f29584y == 1) {
                f10 = 73.0f;
            } else {
                f10 = 55.0f;
            }
            float L2 = org.telegram.messenger.g0.L(f10);
            boolean z11 = bd.f21784a0;
            org.telegram.ui.ActionBar.e6 e6Var = this.f29583x;
            if (z11) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L2, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.W0("paintDivider", e6Var));
            } else {
                canvas.drawLine(L2, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.W0("paintDivider", e6Var));
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
        return this.f29583x;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29582w.f36254a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29582w.f36254a.b();
        this.F.g();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        if (this.f29584y == 0) {
            i11 = 50;
        } else {
            i11 = 58;
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11), 1073741824));
    }

    public void setUserReaction(TLRPC.MessagePeerReaction messagePeerReaction) {
        TLRPC.User user;
        if (messagePeerReaction == null) {
            return;
        }
        long C1 = zi.C1(messagePeerReaction.peer_id);
        int i3 = (C1 > 0L ? 1 : (C1 == 0L ? 0 : -1));
        int i10 = this.f29575b;
        TLRPC.Chat chat = null;
        if (i3 > 0) {
            user = hp.s1(i10).a2(Long.valueOf(C1));
        } else {
            user = null;
            chat = hp.s1(i10).M0(Long.valueOf(-C1));
        }
        c(user, chat, messagePeerReaction.reaction, false, messagePeerReaction.date, null, false, messagePeerReaction.dateIsSeen, false);
    }

    @Override
    public final void updateColors() {
        boolean z10;
        int i3;
        mu0 mu0Var = this.f29582w;
        if (mu0Var != null) {
            try {
                org.telegram.ui.Components.e5 e5Var = mu0Var.f36254a;
                if (e5Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && e5Var.G != null) {
                    if (this.f29584y == 1) {
                        i3 = org.telegram.ui.ActionBar.k6.G6;
                    } else {
                        i3 = org.telegram.ui.ActionBar.k6.f28293z9;
                    }
                    e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i3, this.f29583x)));
                    ei.e4 e4Var = this.d;
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

    public void b(long j10) {
    }
}
