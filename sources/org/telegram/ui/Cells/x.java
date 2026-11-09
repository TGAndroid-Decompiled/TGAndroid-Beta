package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.wo;
public final class x extends FrameLayout {
    public final org.telegram.ui.ActionBar.l5 f30761a;
    public final org.telegram.ui.Components.l9 f30762b;
    public final Switch f30763c;
    public final wo d;
    public final View f30764e;
    public TLRPC.TL_availableReaction f30765f;
    public final boolean h;
    public boolean f30766n;

    public x(Context context, boolean z9, boolean z10) {
        super(context);
        this.h = z10;
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f30761a = l5Var;
        qs.i(l5Var);
        org.telegram.ui.ActionBar.s6.X(l5Var, org.telegram.ui.ActionBar.l6.G6, null);
        l5Var.setTextSize(16);
        l5Var.setTypeface(org.telegram.messenger.g0.o());
        l5Var.setMaxLines(1);
        l5Var.setMaxLines(1);
        l5Var.setGravity(16 | c8.ha.y());
        addView(l5Var, c8.ha.i(-2.0f, -2.0f, 8388627, 81.0f, 0.0f, 61.0f, 0.0f));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f30762b = l9Var;
        l9Var.setAspectFit(true);
        l9Var.setLayerNum(1);
        addView(l9Var, c8.ha.i(32.0f, 32.0f, 8388627, 23.0f, 0.0f, 0.0f, 0.0f));
        if (z9) {
            wo woVar = new wo(26, context, null);
            this.d = woVar;
            woVar.setDrawUnchecked(false);
            woVar.b(-1, -1, org.telegram.ui.ActionBar.l6.h7);
            woVar.setDrawBackgroundAsArc(-1);
            addView(woVar, c8.ha.i(26.0f, 26.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        } else {
            Switch r14 = new Switch(context, null);
            this.f30763c = r14;
            r14.d(org.telegram.ui.ActionBar.l6.M6, org.telegram.ui.ActionBar.l6.N6, org.telegram.ui.ActionBar.l6.Q6, org.telegram.ui.ActionBar.l6.R6);
            addView(r14, c8.ha.i(37.0f, 20.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        }
        View view = new View(context);
        this.f30764e = view;
        view.setBackground(org.telegram.ui.ActionBar.l6.N0(false));
        addView(view, c8.ha.c(-1.0f, -1));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_availableReaction tL_availableReaction, boolean z9, int i7) {
        boolean z10;
        TLRPC.TL_availableReaction tL_availableReaction2 = this.f30765f;
        boolean z11 = true;
        if (tL_availableReaction2 != null && tL_availableReaction.reaction.equals(tL_availableReaction2.reaction)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30765f = tL_availableReaction;
        String str = tL_availableReaction.title;
        org.telegram.ui.ActionBar.l5 l5Var = this.f30761a;
        l5Var.l(org.telegram.messenger.i6.m(str, l5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        this.f30762b.k(hc.b(tL_availableReaction.activate_animation), "30_30_pcache", "tgs", org.telegram.messenger.t5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.l6.f27809a7, 1.0f, null), tL_availableReaction);
        if (!this.h || !tL_availableReaction.premium || p10.i(i7).q()) {
            z11 = false;
        }
        this.f30766n = z11;
        if (z11) {
            Drawable drawable = getContext().getDrawable(2131232474);
            org.telegram.ui.ActionBar.s6.x(this, drawable, org.telegram.ui.ActionBar.l6.Ii, null, PorterDuff.Mode.MULTIPLY);
            l5Var.i(drawable);
        } else {
            l5Var.i(null);
        }
        Switch r02 = this.f30763c;
        if (r02 != null) {
            r02.c(z9, z10);
        }
        wo woVar = this.d;
        if (woVar != null) {
            woVar.a(z9, z10);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float strokeWidth = org.telegram.ui.ActionBar.l6.f27988k0.getStrokeWidth();
        int L = org.telegram.messenger.g0.L(81.0f);
        int i7 = 0;
        if (id.f23157a0) {
            i7 = L;
            L = 0;
        }
        canvas.drawLine(getPaddingLeft() + L, getHeight() - strokeWidth, (getWidth() - getPaddingRight()) - i7, getHeight() - strokeWidth, org.telegram.ui.ActionBar.l6.f27988k0);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(true);
        boolean z9 = false;
        wo woVar = this.d;
        Switch r32 = this.f30763c;
        if (r32 != null) {
            accessibilityNodeInfo.setCheckable(true);
            if (r32 != null) {
                z9 = r32.h;
            } else if (woVar != null) {
                z9 = woVar.f40108a.f31268q;
            }
            accessibilityNodeInfo.setChecked(z9);
            accessibilityNodeInfo.setClassName("android.widget.Switch");
        } else {
            if (r32 != null) {
                z9 = r32.h;
            } else if (woVar != null) {
                z9 = woVar.f40108a.f31268q;
            }
            if (z9) {
                accessibilityNodeInfo.setSelected(true);
            }
        }
        accessibilityNodeInfo.setContentDescription(this.f30761a.getText());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (org.telegram.ui.ActionBar.l6.f27988k0.getStrokeWidth() + org.telegram.messenger.g0.L(58.0f)), 1073741824));
    }

    public void setChecked(boolean z9) {
        Switch r12 = this.f30763c;
        if (r12 != null) {
            r12.c(z9, false);
        }
        wo woVar = this.d;
        if (woVar != null) {
            woVar.a(z9, false);
        }
    }
}
