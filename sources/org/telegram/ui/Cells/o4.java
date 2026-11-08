package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import bi.md;
import java.util.HashSet;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xq;
public final class o4 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.Components.w5 D;
    public boolean E;
    public final org.telegram.ui.Components.w5 F;
    public long G;
    public int H;
    public ug.y0 I;
    public Drawable J;
    public final org.telegram.ui.Components.l9 f29646a;
    public final md f29647b;
    public final org.telegram.ui.Components.w8 f29648c;
    public int d;
    public TLRPC.User f29649e;
    public long f29650f;
    public final int h;
    public float f29651n;
    public boolean f29652r;
    public final cq f29653s;
    public final wo f29654w;
    public final boolean f29655x;
    public boolean f29656y;

    public o4(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        this.f29648c = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        new RectF();
        this.h = p10.f24470s0;
        xq xqVar = xq.h;
        this.D = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar);
        this.F = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar);
        this.H = org.telegram.ui.ActionBar.k6.f27852d6;
        this.f29655x = z9;
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f29646a = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(27.0f));
        addView(l9Var, c8.ha.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        md mdVar = new md(context, 6);
        this.f29647b = mdVar;
        qs.i(mdVar);
        org.telegram.ui.ActionBar.r6.V(mdVar, org.telegram.ui.ActionBar.k6.G6, f6Var);
        mdVar.setTextSize(1, 12.0f);
        mdVar.setMaxLines(1);
        mdVar.setGravity(49);
        mdVar.setLines(1);
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(mdVar, c8.ha.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        cq cqVar = new cq(context, f6Var);
        this.f29653s = cqVar;
        addView(cqVar, c8.ha.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i7 = org.telegram.ui.ActionBar.k6.W8;
        int i10 = org.telegram.ui.ActionBar.k6.U8;
        bq bqVar = cqVar.f32663a;
        bqVar.v = i7;
        bqVar.f32324w = i10;
        cqVar.setGravity(5);
        if (z9) {
            wo woVar = new wo(21, context, f6Var);
            this.f29654w = woVar;
            woVar.b(org.telegram.ui.ActionBar.k6.B5, org.telegram.ui.ActionBar.k6.f27925h5, org.telegram.ui.ActionBar.k6.C5);
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(4);
            woVar.setProgressDelegate(new ca(this, 4));
            addView(woVar, c8.ha.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            woVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j3, boolean z9, CharSequence charSequence) {
        if (this.f29650f != j3) {
            this.f29652r = false;
            invalidate();
        }
        this.f29650f = j3;
        boolean E = org.telegram.messenger.m5.E(j3);
        org.telegram.ui.Components.l9 l9Var = this.f29646a;
        org.telegram.ui.Components.w8 w8Var = this.f29648c;
        int i7 = this.h;
        md mdVar = this.f29647b;
        if (E) {
            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(j3));
            this.f29649e = a22;
            if (charSequence != null) {
                mdVar.setText(charSequence);
            } else if (a22 != null) {
                mdVar.setText(t10.j(a22, true));
            } else {
                mdVar.setText("");
            }
            w8Var.r(this.f29649e);
            l9Var.e(this.f29649e, w8Var);
        } else {
            TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
            if (charSequence != null) {
                mdVar.setText(charSequence);
            } else if (M0 != null) {
                mdVar.setText(M0.title);
            } else {
                mdVar.setText("");
            }
            w8Var.q(M0);
            this.f29649e = null;
            l9Var.e(M0, w8Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i7) {
        int i10;
        int i11 = qp.C8;
        int i12 = i7 & 4;
        int i13 = this.h;
        if (i12 != 0 && this.f29649e != null) {
            this.f29649e = qp.s1(i13).a2(Long.valueOf(this.f29649e.f27105id));
            this.f29646a.invalidate();
            invalidate();
        }
        if (i7 == 0 || (i7 & 256) != 0 || (i7 & 2048) != 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) qp.s1(i13).Q.f(this.f29650f);
            cq cqVar = this.f29653s;
            if (dialog != null && (i10 = dialog.unread_count) != 0) {
                if (this.d != i10) {
                    this.d = i10;
                    cqVar.f32663a.c(i10, this.f29652r);
                    return;
                }
                return;
            }
            this.d = 0;
            cqVar.f32663a.c(0, this.f29652r);
        }
    }

    public final void c(boolean z9) {
        TL_account.RequirementToContact requirementToContact;
        boolean z10;
        if (this.f29656y && this.f29649e != null) {
            requirementToContact = qp.s1(this.h).J2(this.f29649e.f27105id);
        } else {
            requirementToContact = null;
        }
        boolean z11 = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.E == z11 && this.G == org.telegram.messenger.m5.k(requirementToContact)) {
            return;
        }
        this.E = z11;
        this.G = org.telegram.messenger.m5.k(requirementToContact);
        if (!z9) {
            this.D.f(this.E, true);
            if (this.G > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.F.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r20, android.view.View r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o4.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getDialogId() {
        return this.f29650f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f29655x) {
            org.telegram.ui.Components.l9 l9Var = this.f29646a;
            int measuredWidth = (l9Var.getMeasuredWidth() / 2) + l9Var.getLeft();
            int measuredHeight = (l9Var.getMeasuredHeight() / 2) + l9Var.getTop();
            org.telegram.ui.ActionBar.k6.f28047o0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B5, false));
            org.telegram.ui.ActionBar.k6.f28047o0.setAlpha((int) (this.f29654w.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(28.0f), org.telegram.ui.ActionBar.k6.f28047o0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(86.0f), 1073741824));
        this.f29653s.f32663a.E = org.telegram.messenger.g0.L(13.0f);
    }

    @Override
    public final void updateColors() {
        try {
            cq cqVar = this.f29653s;
            if (cqVar != null) {
                cqVar.invalidate();
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
