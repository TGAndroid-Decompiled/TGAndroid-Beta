package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.pv0;
public class q6 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public static final hb0 H;
    public static final hb0 I;
    public static final hb0 J;
    public static final hb0 K;
    public long D;
    public final o6 E;
    public float F;
    public ValueAnimator G;
    public boolean f22834a;
    public final int f22835b;
    public final p6 f22836c;
    public final og.c d;
    public final org.telegram.ui.ActionBar.u5 e;
    public final org.telegram.ui.Components.g9 f22837f;
    public final org.telegram.ui.Components.g9 h;
    public int f22838n;
    public final org.telegram.ui.Components.r8 f22839r;
    public final View f22840s;
    public final pv0 f22841w;
    public final org.telegram.ui.ActionBar.p6 f22842x;
    public final int f22843y;

    static {
        int i10 = org.telegram.ui.ActionBar.t6.f21311y6;
        H = new hb0(2131232233, i10);
        hb0 hb0Var = new hb0(2131232322, i10);
        hb0Var.f26690g = 16;
        hb0Var.h = 16;
        hb0Var.f26691i = 5.66f;
        I = hb0Var;
        int i11 = org.telegram.ui.ActionBar.t6.Vk;
        J = new hb0(2131231970, i11);
        K = new hb0(2131231944, i11);
    }

    public q6(int i10, int i11, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11) {
        super(context);
        int i12;
        float f7;
        float f10;
        float f11;
        float f12;
        this.f22839r = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.F = 1.0f;
        this.f22843y = i10;
        this.f22835b = i11;
        this.f22842x = p6Var;
        this.E = new o6(this, p6Var);
        setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(50.0f)));
        if (i10 == 1) {
            i12 = 48;
        } else {
            i12 = 34;
        }
        p6 p6Var2 = new p6(this, context, i10);
        this.f22836c = p6Var2;
        float f13 = i12;
        p6Var2.setRoundRadius(org.telegram.messenger.i0.L(f13));
        addView(p6Var2, w7.b6.i(f13, f13, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i10 == 1) {
            setClipChildren(false);
        }
        og.c cVar = new og.c(context, 2);
        this.d = cVar;
        zs.i(cVar);
        cVar.setTextSize(16);
        org.telegram.ui.ActionBar.a7.Y(cVar, org.telegram.ui.ActionBar.t6.E8, p6Var);
        cVar.setEllipsizeByGradient(true);
        cVar.setImportantForAccessibility(2);
        cVar.setRightPadding(org.telegram.messenger.i0.L(30.0f));
        if (cd.X) {
            f7 = org.telegram.messenger.i0.L(30.0f);
        } else {
            f7 = 0.0f;
        }
        cVar.setTranslationX(f7);
        cVar.setRightDrawableOutside(true);
        if (i10 == 1) {
            f10 = 7.66f;
        } else {
            f10 = 5.33f;
        }
        float f14 = f10;
        if (i10 == 1) {
            f11 = 73.0f;
        } else {
            f11 = 55.0f;
        }
        float f15 = f11;
        addView(cVar, w7.b6.i(-1.0f, -2.0f, 55, f15, f14, 12.0f, 0.0f));
        pv0 pv0Var = new pv0(this);
        this.f22841w = pv0Var;
        cVar.setDrawablePadding(org.telegram.messenger.i0.L(3.0f));
        cVar.i(pv0Var.f29441a);
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.e = u5Var;
        u5Var.setTextSize(13);
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.f21311y6, p6Var);
        u5Var.setEllipsizeByGradient(true);
        u5Var.setImportantForAccessibility(2);
        u5Var.setTranslationX(cd.X ? org.telegram.messenger.i0.L(30.0f) : 0.0f);
        if (i10 == 1) {
            f12 = 24.0f;
        } else {
            f12 = 19.0f;
        }
        addView(u5Var, w7.b6.i(-1.0f, -2.0f, 55, f15, f12, 20.0f, 0.0f));
        if (z11) {
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
            this.f22837f = g9Var;
            addView(g9Var, w7.b6.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.g9 g9Var2 = new org.telegram.ui.Components.g9(context);
            this.h = g9Var2;
            addView(g9Var2, w7.b6.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z10) {
            View view = new View(context);
            this.f22840s = view;
            view.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
            addView(view, w7.b6.c(-1.0f, -1));
        }
    }

    public final void a(boolean z10, float f7) {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, f7);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new r(this, 4));
            this.G.addListener(new org.telegram.ui.ActionBar.v0(this, f7, 2));
            this.G.setInterpolator(gr.h);
            this.G.setDuration(420L);
            this.G.start();
            return;
        }
        this.F = f7;
        invalidate();
    }

    public final void c(org.telegram.tgnet.TLRPC.User r20, org.telegram.tgnet.TLRPC.Chat r21, org.telegram.tgnet.TLRPC.Reaction r22, boolean r23, long r24, org.telegram.tgnet.tl.TL_stories.StoryItem r26, boolean r27, boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q6.c(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$Reaction, boolean, long, org.telegram.tgnet.tl.TL_stories$StoryItem, boolean, boolean, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f7;
        if (this.F < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (this.F * 255.0f), 31);
            z10 = true;
        } else {
            z10 = false;
        }
        super.dispatchDraw(canvas);
        if (this.f22834a) {
            if (this.f22843y == 1) {
                f7 = 73.0f;
            } else {
                f7 = 55.0f;
            }
            float L = org.telegram.messenger.i0.L(f7);
            boolean z11 = cd.X;
            org.telegram.ui.ActionBar.p6 p6Var = this.f22842x;
            if (z11) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.W0("paintDivider", p6Var));
            } else {
                canvas.drawLine(L, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.W0("paintDivider", p6Var));
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.F;
    }

    public org.telegram.ui.ActionBar.p6 getResourcesProvider() {
        return this.f22842x;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22841w.f29441a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22841w.f29441a.b();
        this.E.g();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f22843y == 0) {
            i12 = 50;
        } else {
            i12 = 58;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(i12), 1073741824));
    }

    public void setUserReaction(TLRPC.MessagePeerReaction messagePeerReaction) {
        TLRPC.User user;
        if (messagePeerReaction == null) {
            return;
        }
        long C1 = jj.C1(messagePeerReaction.peer_id);
        int i10 = (C1 > 0L ? 1 : (C1 == 0L ? 0 : -1));
        int i11 = this.f22835b;
        TLRPC.Chat chat = null;
        if (i10 > 0) {
            user = vp.r1(i11).Z1(Long.valueOf(C1));
        } else {
            user = null;
            chat = vp.r1(i11).L0(Long.valueOf(-C1));
        }
        c(user, chat, messagePeerReaction.reaction, false, messagePeerReaction.date, null, false, messagePeerReaction.dateIsSeen, false);
    }

    @Override
    public final void updateColors() {
        boolean z10;
        int i10;
        pv0 pv0Var = this.f22841w;
        if (pv0Var != null) {
            try {
                org.telegram.ui.Components.d5 d5Var = pv0Var.f29441a;
                if (d5Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && d5Var.F != null) {
                    if (this.f22843y == 1) {
                        i10 = org.telegram.ui.ActionBar.t6.G6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.t6.f21333z9;
                    }
                    d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(i10, this.f22842x)));
                    og.c cVar = this.d;
                    if (cVar != null) {
                        cVar.invalidate();
                    }
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(long j10) {
    }
}
