package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.at;
import org.telegram.messenger.e20;
import org.telegram.messenger.i20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.lq;
public final class q4 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Components.t5 D;
    public boolean E;
    public final org.telegram.ui.Components.t5 F;
    public long G;
    public int H;
    public kg.k1 I;
    public Drawable J;
    public final org.telegram.ui.Components.g9 f22822a;
    public final ag.j3 f22823b;
    public final org.telegram.ui.Components.r8 f22824c;
    public int d;
    public TLRPC.User e;
    public long f22825f;
    public final int h;
    public float f22826n;
    public boolean f22827r;
    public final lq f22828s;
    public final ep f22829w;
    public final boolean f22830x;
    public boolean f22831y;

    public q4(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        this.f22824c = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        new RectF();
        this.h = e20.f15506s0;
        gr grVar = gr.h;
        this.D = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        this.F = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        this.H = org.telegram.ui.ActionBar.t6.f20930d6;
        this.f22830x = z10;
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f22822a = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(27.0f));
        addView(g9Var, w7.b6.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        ag.j3 j3Var = new ag.j3(context, 3);
        this.f22823b = j3Var;
        at.i(j3Var);
        org.telegram.ui.ActionBar.a7.V(j3Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        j3Var.setTextSize(1, 12.0f);
        j3Var.setMaxLines(1);
        j3Var.setGravity(49);
        j3Var.setLines(1);
        j3Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(j3Var, w7.b6.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        lq lqVar = new lq(context, p6Var);
        this.f22828s = lqVar;
        addView(lqVar, w7.b6.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.t6.W8;
        int i11 = org.telegram.ui.ActionBar.t6.U8;
        kq kqVar = lqVar.f28240a;
        kqVar.v = i10;
        kqVar.f27938w = i11;
        lqVar.setGravity(5);
        if (z10) {
            ep epVar = new ep(21, context, p6Var);
            this.f22829w = epVar;
            epVar.b(org.telegram.ui.ActionBar.t6.B5, org.telegram.ui.ActionBar.t6.f21002h5, org.telegram.ui.ActionBar.t6.C5);
            epVar.setDrawUnchecked(false);
            epVar.setDrawBackgroundAsArc(4);
            epVar.setProgressDelegate(new ca(this, 4));
            addView(epVar, w7.b6.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            epVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j10, boolean z10, CharSequence charSequence) {
        if (this.f22825f != j10) {
            this.f22827r = false;
            invalidate();
        }
        this.f22825f = j10;
        boolean E = org.telegram.messenger.o5.E(j10);
        org.telegram.ui.Components.g9 g9Var = this.f22822a;
        org.telegram.ui.Components.r8 r8Var = this.f22824c;
        int i10 = this.h;
        ag.j3 j3Var = this.f22823b;
        if (E) {
            TLRPC.User Z1 = wp.r1(i10).Z1(Long.valueOf(j10));
            this.e = Z1;
            if (charSequence != null) {
                j3Var.setText(charSequence);
            } else if (Z1 != null) {
                j3Var.setText(i20.j(Z1, true));
            } else {
                j3Var.setText("");
            }
            r8Var.r(this.e);
            g9Var.e(this.e, r8Var);
        } else {
            TLRPC.Chat L0 = wp.r1(i10).L0(Long.valueOf(-j10));
            if (charSequence != null) {
                j3Var.setText(charSequence);
            } else if (L0 != null) {
                j3Var.setText(L0.title);
            } else {
                j3Var.setText("");
            }
            r8Var.q(L0);
            this.e = null;
            g9Var.e(L0, r8Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i10) {
        int i11;
        int i12 = wp.D8;
        int i13 = i10 & 4;
        int i14 = this.h;
        if (i13 != 0 && this.e != null) {
            this.e = wp.r1(i14).Z1(Long.valueOf(this.e.f19943id));
            this.f22822a.invalidate();
            invalidate();
        }
        if (i10 == 0 || (i10 & 256) != 0 || (i10 & 2048) != 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) wp.r1(i14).Q.f(this.f22825f);
            lq lqVar = this.f22828s;
            if (dialog != null && (i11 = dialog.unread_count) != 0) {
                if (this.d != i11) {
                    this.d = i11;
                    lqVar.f28240a.c(i11, this.f22827r);
                    return;
                }
                return;
            }
            this.d = 0;
            lqVar.f28240a.c(0, this.f22827r);
        }
    }

    public final void c(boolean z10) {
        TL_account.RequirementToContact requirementToContact;
        boolean z11;
        if (this.f22831y && this.e != null) {
            requirementToContact = wp.r1(this.h).H2(this.e.f19943id);
        } else {
            requirementToContact = null;
        }
        boolean z12 = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.E == z12 && this.G == org.telegram.messenger.o5.k(requirementToContact)) {
            return;
        }
        this.E = z12;
        this.G = org.telegram.messenger.o5.k(requirementToContact);
        if (!z10) {
            this.D.f(this.E, true);
            if (this.G > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.F.f(z11, true);
        }
        invalidate();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r20, android.view.View r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q4.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getDialogId() {
        return this.f22825f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f22830x) {
            org.telegram.ui.Components.g9 g9Var = this.f22822a;
            int measuredWidth = (g9Var.getMeasuredWidth() / 2) + g9Var.getLeft();
            int measuredHeight = (g9Var.getMeasuredHeight() / 2) + g9Var.getTop();
            org.telegram.ui.ActionBar.t6.f21129o0.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.B5, false));
            org.telegram.ui.ActionBar.t6.f21129o0.setAlpha((int) (this.f22829w.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.i0.L(28.0f), org.telegram.ui.ActionBar.t6.f21129o0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(86.0f), 1073741824));
        this.f22828s.f28240a.E = org.telegram.messenger.i0.L(13.0f);
    }

    @Override
    public final void updateColors() {
        try {
            lq lqVar = this.f22828s;
            if (lqVar != null) {
                lqVar.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
