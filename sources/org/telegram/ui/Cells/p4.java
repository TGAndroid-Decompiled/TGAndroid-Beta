package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import di.xb;
import java.util.HashSet;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.tq;
public final class p4 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.d6 E;
    public boolean F;
    public final org.telegram.ui.Components.d6 G;
    public long H;
    public int I;
    public ug.a1 J;
    public Drawable K;
    public final org.telegram.ui.Components.q9 f31237a;
    public final xb f31238b;
    public final org.telegram.ui.Components.b9 f31239c;
    public int d;
    public TLRPC.User f31240e;
    public long f31241f;
    public final int h;
    public float f31242n;
    public boolean f31243r;
    public final tq f31244s;
    public final op f31245w;
    public final boolean f31246x;
    public boolean f31247y;

    public p4(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context);
        this.f31239c = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        new RectF();
        this.h = k10.f24968t0;
        nr nrVar = nr.h;
        this.E = new org.telegram.ui.Components.d6(this, 0L, 350L, nrVar);
        this.G = new org.telegram.ui.Components.d6(this, 0L, 350L, nrVar);
        this.I = org.telegram.ui.ActionBar.m6.f29381d6;
        this.f31246x = z10;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f31237a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(27.0f));
        addView(q9Var, c8.ma.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        xb xbVar = new xb(context, 6);
        this.f31238b = xbVar;
        ls.i(xbVar);
        org.telegram.ui.ActionBar.t6.U(xbVar, org.telegram.ui.ActionBar.m6.G6, h6Var);
        xbVar.setTextSize(1, 12.0f);
        xbVar.setMaxLines(1);
        xbVar.setGravity(49);
        xbVar.setLines(1);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(xbVar, c8.ma.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        tq tqVar = new tq(context, h6Var);
        this.f31244s = tqVar;
        addView(tqVar, c8.ma.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i7 = org.telegram.ui.ActionBar.m6.W8;
        int i10 = org.telegram.ui.ActionBar.m6.U8;
        sq sqVar = tqVar.f40016a;
        sqVar.v = i7;
        sqVar.f39671w = i10;
        tqVar.setGravity(5);
        if (z10) {
            op opVar = new op(21, context, h6Var);
            this.f31245w = opVar;
            opVar.b(org.telegram.ui.ActionBar.m6.B5, org.telegram.ui.ActionBar.m6.f29454h5, org.telegram.ui.ActionBar.m6.C5);
            opVar.setDrawUnchecked(false);
            opVar.setDrawBackgroundAsArc(4);
            opVar.setProgressDelegate(new ea(this, 4));
            addView(opVar, c8.ma.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            opVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j3, boolean z10, CharSequence charSequence) {
        if (this.f31241f != j3) {
            this.f31243r = false;
            invalidate();
        }
        this.f31241f = j3;
        boolean E = org.telegram.messenger.n5.E(j3);
        org.telegram.ui.Components.q9 q9Var = this.f31237a;
        org.telegram.ui.Components.b9 b9Var = this.f31239c;
        int i7 = this.h;
        xb xbVar = this.f31238b;
        if (E) {
            TLRPC.User c22 = np.u1(i7).c2(Long.valueOf(j3));
            this.f31240e = c22;
            if (charSequence != null) {
                xbVar.setText(charSequence);
            } else if (c22 != null) {
                xbVar.setText(p10.k(c22, true));
            } else {
                xbVar.setText("");
            }
            b9Var.r(this.f31240e);
            q9Var.f(this.f31240e, b9Var);
        } else {
            TLRPC.Chat O0 = np.u1(i7).O0(Long.valueOf(-j3));
            if (charSequence != null) {
                xbVar.setText(charSequence);
            } else if (O0 != null) {
                xbVar.setText(O0.title);
            } else {
                xbVar.setText("");
            }
            b9Var.q(O0);
            this.f31240e = null;
            q9Var.f(O0, b9Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i7) {
        int i10;
        int i11 = np.I8;
        int i12 = i7 & 4;
        int i13 = this.h;
        if (i12 != 0 && this.f31240e != null) {
            this.f31240e = np.u1(i13).c2(Long.valueOf(this.f31240e.f28583id));
            this.f31237a.invalidate();
            invalidate();
        }
        if (i7 == 0 || (i7 & 256) != 0 || (i7 & 2048) != 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) np.u1(i13).R.f(this.f31241f);
            tq tqVar = this.f31244s;
            if (dialog != null && (i10 = dialog.unread_count) != 0) {
                if (this.d != i10) {
                    this.d = i10;
                    tqVar.f40016a.c(i10, this.f31243r);
                    return;
                }
                return;
            }
            this.d = 0;
            tqVar.f40016a.c(0, this.f31243r);
        }
    }

    public final void c(boolean z10) {
        TL_account.RequirementToContact requirementToContact;
        boolean z11;
        if (this.f31247y && this.f31240e != null) {
            requirementToContact = np.u1(this.h).P2(this.f31240e.f28583id);
        } else {
            requirementToContact = null;
        }
        boolean z12 = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.F == z12 && this.H == org.telegram.messenger.n5.k(requirementToContact)) {
            return;
        }
        this.F = z12;
        this.H = org.telegram.messenger.n5.k(requirementToContact);
        if (!z10) {
            this.E.f(this.F, true);
            if (this.H > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.G.f(z11, true);
        }
        invalidate();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r20, android.view.View r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p4.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getDialogId() {
        return this.f31241f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f31246x) {
            org.telegram.ui.Components.q9 q9Var = this.f31237a;
            int measuredWidth = (q9Var.getMeasuredWidth() / 2) + q9Var.getLeft();
            int measuredHeight = (q9Var.getMeasuredHeight() / 2) + q9Var.getTop();
            org.telegram.ui.ActionBar.m6.f29576o0.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.B5, false));
            org.telegram.ui.ActionBar.m6.f29576o0.setAlpha((int) (this.f31245w.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(28.0f), org.telegram.ui.ActionBar.m6.f29576o0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(86.0f), 1073741824));
        this.f31244s.f40016a.E = org.telegram.messenger.g0.L(13.0f);
    }

    @Override
    public final void updateColors() {
        try {
            tq tqVar = this.f31244s;
            if (tqVar != null) {
                tqVar.invalidate();
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
