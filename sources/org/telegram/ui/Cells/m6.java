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
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.Components.zu0;
public class m6 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public static final xa0 I;
    public static final xa0 J;
    public static final xa0 K;
    public static final xa0 L;
    public long E;
    public final k6 F;
    public float G;
    public ValueAnimator H;
    public boolean f31155a;
    public final int f31156b;
    public final l6 f31157c;
    public final fi.u3 d;
    public final org.telegram.ui.ActionBar.n5 f31158e;
    public final org.telegram.ui.Components.p9 f31159f;
    public final org.telegram.ui.Components.p9 h;
    public int f31160n;
    public final org.telegram.ui.Components.a9 f31161r;
    public final View f31162s;
    public final zu0 f31163w;
    public final org.telegram.ui.ActionBar.i6 f31164x;
    public final int f31165y;

    static {
        int i7 = org.telegram.ui.ActionBar.n6.f29843y6;
        I = new xa0(2131232239, i7);
        xa0 xa0Var = new xa0(2131232328, i7);
        xa0Var.f41964g = 16;
        xa0Var.h = 16;
        xa0Var.f41965i = 5.66f;
        J = xa0Var;
        int i10 = org.telegram.ui.ActionBar.n6.Yk;
        K = new xa0(2131231975, i10);
        L = new xa0(2131231949, i10);
    }

    public m6(int i7, int i10, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, boolean z11) {
        super(context);
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        this.f31161r = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        this.G = 1.0f;
        this.f31165y = i7;
        this.f31156b = i10;
        this.f31164x = i6Var;
        this.F = new k6(this, i6Var);
        setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(50.0f)));
        if (i7 == 1) {
            i11 = 48;
        } else {
            i11 = 34;
        }
        l6 l6Var = new l6(this, context, i7);
        this.f31157c = l6Var;
        float f14 = i11;
        l6Var.setRoundRadius(org.telegram.messenger.g0.L(f14));
        addView(l6Var, c8.na.i(f14, f14, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i7 == 1) {
            setClipChildren(false);
        }
        fi.u3 u3Var = new fi.u3(context, 2);
        this.d = u3Var;
        ks.i(u3Var);
        u3Var.setTextSize(16);
        org.telegram.ui.ActionBar.u6.X(u3Var, org.telegram.ui.ActionBar.n6.E8, i6Var);
        u3Var.setEllipsizeByGradient(true);
        u3Var.setImportantForAccessibility(2);
        u3Var.setRightPadding(org.telegram.messenger.g0.L(30.0f));
        if (gd.f24314a0) {
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
        addView(u3Var, c8.na.i(-1.0f, -2.0f, 55, f16, f15, 12.0f, 0.0f));
        zu0 zu0Var = new zu0(this);
        this.f31163w = zu0Var;
        u3Var.setDrawablePadding(org.telegram.messenger.g0.L(3.0f));
        u3Var.i(zu0Var.f43047a);
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f31158e = n5Var;
        n5Var.setTextSize(13);
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.f29843y6, i6Var);
        n5Var.setEllipsizeByGradient(true);
        n5Var.setImportantForAccessibility(2);
        n5Var.setTranslationX(gd.f24314a0 ? org.telegram.messenger.g0.L(30.0f) : 0.0f);
        if (i7 == 1) {
            f13 = 24.0f;
        } else {
            f13 = 19.0f;
        }
        addView(n5Var, c8.na.i(-1.0f, -2.0f, 55, f16, f13, 20.0f, 0.0f));
        if (z11) {
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
            this.f31159f = p9Var;
            addView(p9Var, c8.na.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(context);
            this.h = p9Var2;
            addView(p9Var2, c8.na.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z10) {
            View view = new View(context);
            this.f31162s = view;
            view.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
            addView(view, c8.na.c(-1.0f, -1));
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
            this.H.setInterpolator(kr.h);
            this.H.setDuration(420L);
            this.H.start();
            return;
        }
        this.G = f10;
        invalidate();
    }

    public final void c(org.telegram.tgnet.TLRPC.User r20, org.telegram.tgnet.TLRPC.Chat r21, org.telegram.tgnet.TLRPC.Reaction r22, boolean r23, long r24, org.telegram.tgnet.tl.TL_stories.StoryItem r26, boolean r27, boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.m6.c(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$Reaction, boolean, long, org.telegram.tgnet.tl.TL_stories$StoryItem, boolean, boolean, boolean):void");
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
        if (this.f31155a) {
            if (this.f31165y == 1) {
                f10 = 73.0f;
            } else {
                f10 = 55.0f;
            }
            float L2 = org.telegram.messenger.g0.L(f10);
            boolean z11 = gd.f24314a0;
            org.telegram.ui.ActionBar.i6 i6Var = this.f31164x;
            if (z11) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L2, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.W0("paintDivider", i6Var));
            } else {
                canvas.drawLine(L2, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.W0("paintDivider", i6Var));
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.G;
    }

    public org.telegram.ui.ActionBar.i6 getResourcesProvider() {
        return this.f31164x;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31163w.f43047a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31163w.f43047a.b();
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
        if (this.f31165y == 0) {
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
        int i10 = this.f31156b;
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
        zu0 zu0Var = this.f31163w;
        if (zu0Var != null) {
            try {
                org.telegram.ui.Components.m5 m5Var = zu0Var.f43047a;
                if (m5Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && m5Var.G != null) {
                    if (this.f31165y == 1) {
                        i7 = org.telegram.ui.ActionBar.n6.G6;
                    } else {
                        i7 = org.telegram.ui.ActionBar.n6.f29865z9;
                    }
                    m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(i7, this.f31164x)));
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
