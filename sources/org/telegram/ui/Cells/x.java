package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ic;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.ep;
public final class x extends FrameLayout {
    public final org.telegram.ui.ActionBar.u5 f23448a;
    public final org.telegram.ui.Components.g9 f23449b;
    public final Switch f23450c;
    public final ep d;
    public final View e;
    public TLRPC.TL_availableReaction f23451f;
    public final boolean h;
    public boolean f23452n;

    public x(Context context, boolean z10, boolean z11) {
        super(context);
        this.h = z11;
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.f23448a = u5Var;
        zs.i(u5Var);
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, null);
        u5Var.setTextSize(16);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        u5Var.setMaxLines(1);
        u5Var.setMaxLines(1);
        u5Var.setGravity(16 | w7.b6.y());
        addView(u5Var, w7.b6.i(-2.0f, -2.0f, 8388627, 81.0f, 0.0f, 61.0f, 0.0f));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f23449b = g9Var;
        g9Var.setAspectFit(true);
        g9Var.setLayerNum(1);
        addView(g9Var, w7.b6.i(32.0f, 32.0f, 8388627, 23.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            ep epVar = new ep(26, context, null);
            this.d = epVar;
            epVar.setDrawUnchecked(false);
            epVar.b(-1, -1, org.telegram.ui.ActionBar.t6.f21003h7);
            epVar.setDrawBackgroundAsArc(-1);
            addView(epVar, w7.b6.i(26.0f, 26.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        } else {
            Switch r14 = new Switch(context, null);
            this.f23450c = r14;
            r14.d(org.telegram.ui.ActionBar.t6.M6, org.telegram.ui.ActionBar.t6.N6, org.telegram.ui.ActionBar.t6.Q6, org.telegram.ui.ActionBar.t6.R6);
            addView(r14, w7.b6.i(37.0f, 20.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        }
        View view = new View(context);
        this.e = view;
        view.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
        addView(view, w7.b6.c(-1.0f, -1));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_availableReaction tL_availableReaction, boolean z10, int i10) {
        boolean z11;
        TLRPC.TL_availableReaction tL_availableReaction2 = this.f23451f;
        boolean z12 = true;
        if (tL_availableReaction2 != null && tL_availableReaction.reaction.equals(tL_availableReaction2.reaction)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f23451f = tL_availableReaction;
        String str = tL_availableReaction.title;
        org.telegram.ui.ActionBar.u5 u5Var = this.f23448a;
        u5Var.l(org.telegram.messenger.k6.m(str, u5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        this.f23449b.k(ic.b(tL_availableReaction.activate_animation), "30_30_pcache", "tgs", org.telegram.messenger.v5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.t6.f20872a7, 1.0f, null), tL_availableReaction);
        if (!this.h || !tL_availableReaction.premium || d20.i(i10).q()) {
            z12 = false;
        }
        this.f23452n = z12;
        if (z12) {
            Drawable drawable = getContext().getDrawable(2131232473);
            org.telegram.ui.ActionBar.a7.y(this, drawable, org.telegram.ui.ActionBar.t6.Ii, null, PorterDuff.Mode.MULTIPLY);
            u5Var.i(drawable);
        } else {
            u5Var.i(null);
        }
        Switch r02 = this.f23450c;
        if (r02 != null) {
            r02.c(z10, z11);
        }
        ep epVar = this.d;
        if (epVar != null) {
            epVar.a(z10, z11);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float strokeWidth = org.telegram.ui.ActionBar.t6.f21052k0.getStrokeWidth();
        int L = org.telegram.messenger.i0.L(81.0f);
        int i10 = 0;
        if (cd.X) {
            i10 = L;
            L = 0;
        }
        canvas.drawLine(getPaddingLeft() + L, getHeight() - strokeWidth, (getWidth() - getPaddingRight()) - i10, getHeight() - strokeWidth, org.telegram.ui.ActionBar.t6.f21052k0);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(true);
        boolean z10 = false;
        ep epVar = this.d;
        Switch r32 = this.f23450c;
        if (r32 != null) {
            accessibilityNodeInfo.setCheckable(true);
            if (r32 != null) {
                z10 = r32.h;
            } else if (epVar != null) {
                z10 = epVar.f25836a.f23919q;
            }
            accessibilityNodeInfo.setChecked(z10);
            accessibilityNodeInfo.setClassName("android.widget.Switch");
        } else {
            if (r32 != null) {
                z10 = r32.h;
            } else if (epVar != null) {
                z10 = epVar.f25836a.f23919q;
            }
            if (z10) {
                accessibilityNodeInfo.setSelected(true);
            }
        }
        accessibilityNodeInfo.setContentDescription(this.f23448a.getText());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (org.telegram.ui.ActionBar.t6.f21052k0.getStrokeWidth() + org.telegram.messenger.i0.L(58.0f)), 1073741824));
    }

    public void setChecked(boolean z10) {
        Switch r12 = this.f23450c;
        if (r12 != null) {
            r12.c(z10, false);
        }
        ep epVar = this.d;
        if (epVar != null) {
            epVar.a(z10, false);
        }
    }
}
