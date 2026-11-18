package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.fc;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.mp;
public final class x extends FrameLayout {
    public final org.telegram.ui.ActionBar.n5 f32274a;
    public final org.telegram.ui.Components.q9 f32275b;
    public final Switch f32276c;
    public final mp d;
    public final View f32277e;
    public TLRPC.TL_availableReaction f32278f;
    public final boolean h;
    public boolean f32279n;

    public x(Context context, boolean z10, boolean z11) {
        super(context);
        this.h = z11;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f32274a = n5Var;
        ks.i(n5Var);
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.G6, null);
        n5Var.setTextSize(16);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        n5Var.setMaxLines(1);
        n5Var.setMaxLines(1);
        n5Var.setGravity(16 | c8.ma.y());
        addView(n5Var, c8.ma.i(-2.0f, -2.0f, 8388627, 81.0f, 0.0f, 61.0f, 0.0f));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f32275b = q9Var;
        q9Var.setAspectFit(true);
        q9Var.setLayerNum(1);
        addView(q9Var, c8.ma.i(32.0f, 32.0f, 8388627, 23.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            mp mpVar = new mp(26, context, null);
            this.d = mpVar;
            mpVar.setDrawUnchecked(false);
            mpVar.b(-1, -1, org.telegram.ui.ActionBar.n6.h7);
            mpVar.setDrawBackgroundAsArc(-1);
            addView(mpVar, c8.ma.i(26.0f, 26.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        } else {
            Switch r14 = new Switch(context, null);
            this.f32276c = r14;
            r14.d(org.telegram.ui.ActionBar.n6.M6, org.telegram.ui.ActionBar.n6.N6, org.telegram.ui.ActionBar.n6.Q6, org.telegram.ui.ActionBar.n6.R6);
            addView(r14, c8.ma.i(37.0f, 20.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        }
        View view = new View(context);
        this.f32277e = view;
        view.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
        addView(view, c8.ma.c(-1.0f, -1));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_availableReaction tL_availableReaction, boolean z10, int i7) {
        boolean z11;
        TLRPC.TL_availableReaction tL_availableReaction2 = this.f32278f;
        boolean z12 = true;
        if (tL_availableReaction2 != null && tL_availableReaction.reaction.equals(tL_availableReaction2.reaction)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f32278f = tL_availableReaction;
        String str = tL_availableReaction.title;
        org.telegram.ui.ActionBar.n5 n5Var = this.f32274a;
        n5Var.l(org.telegram.messenger.j6.m(str, n5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        this.f32275b.k(fc.b(tL_availableReaction.activate_animation), "30_30_pcache", "tgs", org.telegram.messenger.u5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.n6.f29337a7, 1.0f, null), tL_availableReaction);
        if (!this.h || !tL_availableReaction.premium || j10.i(i7).q()) {
            z12 = false;
        }
        this.f32279n = z12;
        if (z12) {
            Drawable drawable = getContext().getDrawable(2131232476);
            org.telegram.ui.ActionBar.u6.x(this, drawable, org.telegram.ui.ActionBar.n6.Li, null, PorterDuff.Mode.MULTIPLY);
            n5Var.i(drawable);
        } else {
            n5Var.i(null);
        }
        Switch r02 = this.f32276c;
        if (r02 != null) {
            r02.c(z10, z11);
        }
        mp mpVar = this.d;
        if (mpVar != null) {
            mpVar.a(z10, z11);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float strokeWidth = org.telegram.ui.ActionBar.n6.f29517k0.getStrokeWidth();
        int L = org.telegram.messenger.g0.L(81.0f);
        int i7 = 0;
        if (gd.f24213a0) {
            i7 = L;
            L = 0;
        }
        canvas.drawLine(getPaddingLeft() + L, getHeight() - strokeWidth, (getWidth() - getPaddingRight()) - i7, getHeight() - strokeWidth, org.telegram.ui.ActionBar.n6.f29517k0);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(true);
        boolean z10 = false;
        mp mpVar = this.d;
        Switch r32 = this.f32276c;
        if (r32 != null) {
            accessibilityNodeInfo.setCheckable(true);
            if (r32 != null) {
                z10 = r32.h;
            } else if (mpVar != null) {
                z10 = mpVar.f37598a.f32838q;
            }
            accessibilityNodeInfo.setChecked(z10);
            accessibilityNodeInfo.setClassName("android.widget.Switch");
        } else {
            if (r32 != null) {
                z10 = r32.h;
            } else if (mpVar != null) {
                z10 = mpVar.f37598a.f32838q;
            }
            if (z10) {
                accessibilityNodeInfo.setSelected(true);
            }
        }
        accessibilityNodeInfo.setContentDescription(this.f32274a.getText());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (org.telegram.ui.ActionBar.n6.f29517k0.getStrokeWidth() + org.telegram.messenger.g0.L(58.0f)), 1073741824));
    }

    public void setChecked(boolean z10) {
        Switch r12 = this.f32276c;
        if (r12 != null) {
            r12.c(z10, false);
        }
        mp mpVar = this.d;
        if (mpVar != null) {
            mpVar.a(z10, false);
        }
    }
}
