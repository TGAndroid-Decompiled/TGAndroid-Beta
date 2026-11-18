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
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.rq;
public final class o4 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.c6 E;
    public boolean F;
    public final org.telegram.ui.Components.c6 G;
    public long H;
    public int I;
    public ug.b1 J;
    public Drawable K;
    public final org.telegram.ui.Components.q9 f31159a;
    public final xb f31160b;
    public final org.telegram.ui.Components.b9 f31161c;
    public int d;
    public TLRPC.User f31162e;
    public long f31163f;
    public final int h;
    public float f31164n;
    public boolean f31165r;
    public final rq f31166s;
    public final mp f31167w;
    public final boolean f31168x;
    public boolean f31169y;

    public o4(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        this.f31161c = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        new RectF();
        this.h = j10.f24773t0;
        lr lrVar = lr.h;
        this.E = new org.telegram.ui.Components.c6(this, 0L, 350L, lrVar);
        this.G = new org.telegram.ui.Components.c6(this, 0L, 350L, lrVar);
        this.I = org.telegram.ui.ActionBar.n6.f29396d6;
        this.f31168x = z10;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f31159a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(27.0f));
        addView(q9Var, c8.ma.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        xb xbVar = new xb(context, 6);
        this.f31160b = xbVar;
        ks.i(xbVar);
        org.telegram.ui.ActionBar.u6.U(xbVar, org.telegram.ui.ActionBar.n6.G6, i6Var);
        xbVar.setTextSize(1, 12.0f);
        xbVar.setMaxLines(1);
        xbVar.setGravity(49);
        xbVar.setLines(1);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(xbVar, c8.ma.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        rq rqVar = new rq(context, i6Var);
        this.f31166s = rqVar;
        addView(rqVar, c8.ma.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i7 = org.telegram.ui.ActionBar.n6.W8;
        int i10 = org.telegram.ui.ActionBar.n6.U8;
        qq qqVar = rqVar.f39274a;
        qqVar.v = i7;
        qqVar.f38882w = i10;
        rqVar.setGravity(5);
        if (z10) {
            mp mpVar = new mp(21, context, i6Var);
            this.f31167w = mpVar;
            mpVar.b(org.telegram.ui.ActionBar.n6.B5, org.telegram.ui.ActionBar.n6.f29469h5, org.telegram.ui.ActionBar.n6.C5);
            mpVar.setDrawUnchecked(false);
            mpVar.setDrawBackgroundAsArc(4);
            mpVar.setProgressDelegate(new da(this, 4));
            addView(mpVar, c8.ma.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            mpVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j3, boolean z10, CharSequence charSequence) {
        if (this.f31163f != j3) {
            this.f31165r = false;
            invalidate();
        }
        this.f31163f = j3;
        boolean E = org.telegram.messenger.n5.E(j3);
        org.telegram.ui.Components.q9 q9Var = this.f31159a;
        org.telegram.ui.Components.b9 b9Var = this.f31161c;
        int i7 = this.h;
        xb xbVar = this.f31160b;
        if (E) {
            TLRPC.User c22 = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(j3));
            this.f31162e = c22;
            if (charSequence != null) {
                xbVar.setText(charSequence);
            } else if (c22 != null) {
                xbVar.setText(o10.k(c22, true));
            } else {
                xbVar.setText("");
            }
            b9Var.r(this.f31162e);
            q9Var.f(this.f31162e, b9Var);
        } else {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-j3));
            if (charSequence != null) {
                xbVar.setText(charSequence);
            } else if (O0 != null) {
                xbVar.setText(O0.title);
            } else {
                xbVar.setText("");
            }
            b9Var.q(O0);
            this.f31162e = null;
            q9Var.f(O0, b9Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i7) {
        int i10;
        int i11 = org.telegram.messenger.mp.I8;
        int i12 = i7 & 4;
        int i13 = this.h;
        if (i12 != 0 && this.f31162e != null) {
            this.f31162e = org.telegram.messenger.mp.u1(i13).c2(Long.valueOf(this.f31162e.f28554id));
            this.f31159a.invalidate();
            invalidate();
        }
        if (i7 == 0 || (i7 & 256) != 0 || (i7 & 2048) != 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) org.telegram.messenger.mp.u1(i13).R.f(this.f31163f);
            rq rqVar = this.f31166s;
            if (dialog != null && (i10 = dialog.unread_count) != 0) {
                if (this.d != i10) {
                    this.d = i10;
                    rqVar.f39274a.c(i10, this.f31165r);
                    return;
                }
                return;
            }
            this.d = 0;
            rqVar.f39274a.c(0, this.f31165r);
        }
    }

    public final void c(boolean z10) {
        TL_account.RequirementToContact requirementToContact;
        boolean z11;
        if (this.f31169y && this.f31162e != null) {
            requirementToContact = org.telegram.messenger.mp.u1(this.h).P2(this.f31162e.f28554id);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o4.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getDialogId() {
        return this.f31163f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f31168x) {
            org.telegram.ui.Components.q9 q9Var = this.f31159a;
            int measuredWidth = (q9Var.getMeasuredWidth() / 2) + q9Var.getLeft();
            int measuredHeight = (q9Var.getMeasuredHeight() / 2) + q9Var.getTop();
            org.telegram.ui.ActionBar.n6.f29591o0.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.B5, false));
            org.telegram.ui.ActionBar.n6.f29591o0.setAlpha((int) (this.f31167w.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(28.0f), org.telegram.ui.ActionBar.n6.f29591o0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(86.0f), 1073741824));
        this.f31166s.f39274a.E = org.telegram.messenger.g0.L(13.0f);
    }

    @Override
    public final void updateColors() {
        try {
            rq rqVar = this.f31166s;
            if (rqVar != null) {
                rqVar.invalidate();
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
