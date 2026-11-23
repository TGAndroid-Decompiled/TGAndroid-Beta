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
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qq;
public final class p4 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.c6 E;
    public boolean F;
    public final org.telegram.ui.Components.c6 G;
    public long H;
    public int I;
    public ug.a1 J;
    public Drawable K;
    public final org.telegram.ui.Components.p9 f31314a;
    public final xb f31315b;
    public final org.telegram.ui.Components.a9 f31316c;
    public int d;
    public TLRPC.User f31317e;
    public long f31318f;
    public final int h;
    public float f31319n;
    public boolean f31320r;
    public final qq f31321s;
    public final lp f31322w;
    public final boolean f31323x;
    public boolean f31324y;

    public p4(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        this.f31316c = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        new RectF();
        this.h = i10.f24637t0;
        kr krVar = kr.h;
        this.E = new org.telegram.ui.Components.c6(this, 0L, 350L, krVar);
        this.G = new org.telegram.ui.Components.c6(this, 0L, 350L, krVar);
        this.I = org.telegram.ui.ActionBar.n6.f29451d6;
        this.f31323x = z10;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f31314a = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(27.0f));
        addView(p9Var, c8.na.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        xb xbVar = new xb(context, 6);
        this.f31315b = xbVar;
        ks.i(xbVar);
        org.telegram.ui.ActionBar.u6.U(xbVar, org.telegram.ui.ActionBar.n6.G6, i6Var);
        xbVar.setTextSize(1, 12.0f);
        xbVar.setMaxLines(1);
        xbVar.setGravity(49);
        xbVar.setLines(1);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(xbVar, c8.na.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        qq qqVar = new qq(context, i6Var);
        this.f31321s = qqVar;
        addView(qqVar, c8.na.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i7 = org.telegram.ui.ActionBar.n6.W8;
        int i10 = org.telegram.ui.ActionBar.n6.U8;
        pq pqVar = qqVar.f38979a;
        pqVar.v = i7;
        pqVar.f38560w = i10;
        qqVar.setGravity(5);
        if (z10) {
            lp lpVar = new lp(21, context, i6Var);
            this.f31322w = lpVar;
            lpVar.b(org.telegram.ui.ActionBar.n6.B5, org.telegram.ui.ActionBar.n6.f29524h5, org.telegram.ui.ActionBar.n6.C5);
            lpVar.setDrawUnchecked(false);
            lpVar.setDrawBackgroundAsArc(4);
            lpVar.setProgressDelegate(new ea(this, 4));
            addView(lpVar, c8.na.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            lpVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j3, boolean z10, CharSequence charSequence) {
        if (this.f31318f != j3) {
            this.f31320r = false;
            invalidate();
        }
        this.f31318f = j3;
        boolean E = org.telegram.messenger.n5.E(j3);
        org.telegram.ui.Components.p9 p9Var = this.f31314a;
        org.telegram.ui.Components.a9 a9Var = this.f31316c;
        int i7 = this.h;
        xb xbVar = this.f31315b;
        if (E) {
            TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(j3));
            this.f31317e = c22;
            if (charSequence != null) {
                xbVar.setText(charSequence);
            } else if (c22 != null) {
                xbVar.setText(n10.k(c22, true));
            } else {
                xbVar.setText("");
            }
            a9Var.r(this.f31317e);
            p9Var.f(this.f31317e, a9Var);
        } else {
            TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-j3));
            if (charSequence != null) {
                xbVar.setText(charSequence);
            } else if (O0 != null) {
                xbVar.setText(O0.title);
            } else {
                xbVar.setText("");
            }
            a9Var.q(O0);
            this.f31317e = null;
            p9Var.f(O0, a9Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i7) {
        int i10;
        int i11 = mp.I8;
        int i12 = i7 & 4;
        int i13 = this.h;
        if (i12 != 0 && this.f31317e != null) {
            this.f31317e = mp.u1(i13).c2(Long.valueOf(this.f31317e.f28641id));
            this.f31314a.invalidate();
            invalidate();
        }
        if (i7 == 0 || (i7 & 256) != 0 || (i7 & 2048) != 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) mp.u1(i13).R.f(this.f31318f);
            qq qqVar = this.f31321s;
            if (dialog != null && (i10 = dialog.unread_count) != 0) {
                if (this.d != i10) {
                    this.d = i10;
                    qqVar.f38979a.c(i10, this.f31320r);
                    return;
                }
                return;
            }
            this.d = 0;
            qqVar.f38979a.c(0, this.f31320r);
        }
    }

    public final void c(boolean z10) {
        TL_account.RequirementToContact requirementToContact;
        boolean z11;
        if (this.f31324y && this.f31317e != null) {
            requirementToContact = mp.u1(this.h).P2(this.f31317e.f28641id);
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
        return this.f31318f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f31323x) {
            org.telegram.ui.Components.p9 p9Var = this.f31314a;
            int measuredWidth = (p9Var.getMeasuredWidth() / 2) + p9Var.getLeft();
            int measuredHeight = (p9Var.getMeasuredHeight() / 2) + p9Var.getTop();
            org.telegram.ui.ActionBar.n6.f29646o0.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.B5, false));
            org.telegram.ui.ActionBar.n6.f29646o0.setAlpha((int) (this.f31322w.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(28.0f), org.telegram.ui.ActionBar.n6.f29646o0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(86.0f), 1073741824));
        this.f31321s.f38979a.E = org.telegram.messenger.g0.L(13.0f);
    }

    @Override
    public final void updateColors() {
        try {
            qq qqVar = this.f31321s;
            if (qqVar != null) {
                qqVar.invalidate();
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
