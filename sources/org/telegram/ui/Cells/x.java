package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.fp;
public final class x extends FrameLayout {
    public final org.telegram.ui.ActionBar.j5 f31906a;
    public final org.telegram.ui.Components.i9 f31907b;
    public final Switch f31908c;
    public final fp d;
    public final View f31909e;
    public TLRPC.TL_availableReaction f31910f;
    public final boolean h;
    public boolean f31911n;

    public x(Context context, boolean z10, boolean z11) {
        super(context);
        this.h = z11;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f31906a = j5Var;
        ns.i(j5Var);
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.G6, null);
        j5Var.setTextSize(16);
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        j5Var.setMaxLines(1);
        j5Var.setMaxLines(1);
        j5Var.setGravity(16 | c8.ja.y());
        addView(j5Var, c8.ja.i(-2.0f, -2.0f, 8388627, 81.0f, 0.0f, 61.0f, 0.0f));
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f31907b = i9Var;
        i9Var.setAspectFit(true);
        i9Var.setLayerNum(1);
        addView(i9Var, c8.ja.i(32.0f, 32.0f, 8388627, 23.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            fp fpVar = new fp(26, context, null);
            this.d = fpVar;
            fpVar.setDrawUnchecked(false);
            fpVar.b(-1, -1, org.telegram.ui.ActionBar.j6.h7);
            fpVar.setDrawBackgroundAsArc(-1);
            addView(fpVar, c8.ja.i(26.0f, 26.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        } else {
            Switch r14 = new Switch(context, null);
            this.f31908c = r14;
            r14.d(org.telegram.ui.ActionBar.j6.M6, org.telegram.ui.ActionBar.j6.N6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
            addView(r14, c8.ja.i(37.0f, 20.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        }
        View view = new View(context);
        this.f31909e = view;
        view.setBackground(org.telegram.ui.ActionBar.j6.N0(false));
        addView(view, c8.ja.c(-1.0f, -1));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_availableReaction tL_availableReaction, boolean z10, int i7) {
        boolean z11;
        TLRPC.TL_availableReaction tL_availableReaction2 = this.f31910f;
        boolean z12 = true;
        if (tL_availableReaction2 != null && tL_availableReaction.reaction.equals(tL_availableReaction2.reaction)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f31910f = tL_availableReaction;
        String str = tL_availableReaction.title;
        org.telegram.ui.ActionBar.j5 j5Var = this.f31906a;
        j5Var.l(org.telegram.messenger.j6.m(str, j5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        this.f31907b.k(gc.b(tL_availableReaction.activate_animation), "30_30_pcache", "tgs", org.telegram.messenger.t5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.j6.f28792a7, 1.0f, null), tL_availableReaction);
        if (!this.h || !tL_availableReaction.premium || m10.i(i7).q()) {
            z12 = false;
        }
        this.f31911n = z12;
        if (z12) {
            Drawable drawable = getContext().getDrawable(2131232475);
            org.telegram.ui.ActionBar.q6.x(this, drawable, org.telegram.ui.ActionBar.j6.Li, null, PorterDuff.Mode.MULTIPLY);
            j5Var.i(drawable);
        } else {
            j5Var.i(null);
        }
        Switch r02 = this.f31908c;
        if (r02 != null) {
            r02.c(z10, z11);
        }
        fp fpVar = this.d;
        if (fpVar != null) {
            fpVar.a(z10, z11);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float strokeWidth = org.telegram.ui.ActionBar.j6.f28972k0.getStrokeWidth();
        int L = org.telegram.messenger.g0.L(81.0f);
        int i7 = 0;
        if (hd.f24104a0) {
            i7 = L;
            L = 0;
        }
        canvas.drawLine(getPaddingLeft() + L, getHeight() - strokeWidth, (getWidth() - getPaddingRight()) - i7, getHeight() - strokeWidth, org.telegram.ui.ActionBar.j6.f28972k0);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(true);
        boolean z10 = false;
        fp fpVar = this.d;
        Switch r32 = this.f31908c;
        if (r32 != null) {
            accessibilityNodeInfo.setCheckable(true);
            if (r32 != null) {
                z10 = r32.h;
            } else if (fpVar != null) {
                z10 = fpVar.f34667a.f32441q;
            }
            accessibilityNodeInfo.setChecked(z10);
            accessibilityNodeInfo.setClassName("android.widget.Switch");
        } else {
            if (r32 != null) {
                z10 = r32.h;
            } else if (fpVar != null) {
                z10 = fpVar.f34667a.f32441q;
            }
            if (z10) {
                accessibilityNodeInfo.setSelected(true);
            }
        }
        accessibilityNodeInfo.setContentDescription(this.f31906a.getText());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (org.telegram.ui.ActionBar.j6.f28972k0.getStrokeWidth() + org.telegram.messenger.g0.L(58.0f)), 1073741824));
    }

    public void setChecked(boolean z10) {
        Switch r12 = this.f31908c;
        if (r12 != null) {
            r12.c(z10, false);
        }
        fp fpVar = this.d;
        if (fpVar != null) {
            fpVar.a(z10, false);
        }
    }
}
