package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import ci.ec;
import java.util.HashSet;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xq;
public final class o4 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.u5 E;
    public boolean F;
    public final org.telegram.ui.Components.u5 G;
    public long H;
    public int I;
    public vg.x0 J;
    public Drawable K;
    public final org.telegram.ui.Components.k9 f29737a;
    public final ec f29738b;
    public final org.telegram.ui.Components.u8 f29739c;
    public int d;
    public TLRPC.User f29740e;
    public long f29741f;
    public final int h;
    public float f29742n;
    public boolean f29743r;
    public final dq f29744s;
    public final wo f29745w;
    public final boolean f29746x;
    public boolean f29747y;

    public o4(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.f29739c = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        new RectF();
        this.h = h10.f22829t0;
        xq xqVar = xq.h;
        this.E = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
        this.G = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
        this.I = org.telegram.ui.ActionBar.k6.f27878d6;
        this.f29746x = z10;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f29737a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(27.0f));
        addView(k9Var, mf.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        ec ecVar = new ec(context, 6);
        this.f29738b = ecVar;
        hs.i(ecVar);
        org.telegram.ui.ActionBar.r6.V(ecVar, org.telegram.ui.ActionBar.k6.G6, e6Var);
        ecVar.setTextSize(1, 12.0f);
        ecVar.setMaxLines(1);
        ecVar.setGravity(49);
        ecVar.setLines(1);
        ecVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(ecVar, mf.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        dq dqVar = new dq(context, e6Var);
        this.f29744s = dqVar;
        addView(dqVar, mf.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i3 = org.telegram.ui.ActionBar.k6.W8;
        int i10 = org.telegram.ui.ActionBar.k6.U8;
        cq cqVar = dqVar.f33180a;
        cqVar.v = i3;
        cqVar.f32815w = i10;
        dqVar.setGravity(5);
        if (z10) {
            wo woVar = new wo(21, context, e6Var);
            this.f29745w = woVar;
            woVar.b(org.telegram.ui.ActionBar.k6.B5, org.telegram.ui.ActionBar.k6.f27954h5, org.telegram.ui.ActionBar.k6.C5);
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(4);
            woVar.setProgressDelegate(new ca(this, 4));
            addView(woVar, mf.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            woVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j10, boolean z10, CharSequence charSequence) {
        if (this.f29741f != j10) {
            this.f29743r = false;
            invalidate();
        }
        this.f29741f = j10;
        boolean E = org.telegram.messenger.m5.E(j10);
        org.telegram.ui.Components.k9 k9Var = this.f29737a;
        org.telegram.ui.Components.u8 u8Var = this.f29739c;
        int i3 = this.h;
        ec ecVar = this.f29738b;
        if (E) {
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(j10));
            this.f29740e = a22;
            if (charSequence != null) {
                ecVar.setText(charSequence);
            } else if (a22 != null) {
                ecVar.setText(l10.j(a22, true));
            } else {
                ecVar.setText("");
            }
            u8Var.r(this.f29740e);
            k9Var.e(this.f29740e, u8Var);
        } else {
            TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j10));
            if (charSequence != null) {
                ecVar.setText(charSequence);
            } else if (M0 != null) {
                ecVar.setText(M0.title);
            } else {
                ecVar.setText("");
            }
            u8Var.q(M0);
            this.f29740e = null;
            k9Var.e(M0, u8Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i3) {
        int i10;
        int i11 = hp.C8;
        int i12 = i3 & 4;
        int i13 = this.h;
        if (i12 != 0 && this.f29740e != null) {
            this.f29740e = hp.s1(i13).a2(Long.valueOf(this.f29740e.f27150id));
            this.f29737a.invalidate();
            invalidate();
        }
        if (i3 == 0 || (i3 & 256) != 0 || (i3 & 2048) != 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) hp.s1(i13).R.f(this.f29741f);
            dq dqVar = this.f29744s;
            if (dialog != null && (i10 = dialog.unread_count) != 0) {
                if (this.d != i10) {
                    this.d = i10;
                    dqVar.f33180a.c(i10, this.f29743r);
                    return;
                }
                return;
            }
            this.d = 0;
            dqVar.f33180a.c(0, this.f29743r);
        }
    }

    public final void c(boolean z10) {
        TL_account.RequirementToContact requirementToContact;
        boolean z11;
        if (this.f29747y && this.f29740e != null) {
            requirementToContact = hp.s1(this.h).J2(this.f29740e.f27150id);
        } else {
            requirementToContact = null;
        }
        boolean z12 = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.F == z12 && this.H == org.telegram.messenger.m5.k(requirementToContact)) {
            return;
        }
        this.F = z12;
        this.H = org.telegram.messenger.m5.k(requirementToContact);
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
        return this.f29741f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f29746x) {
            org.telegram.ui.Components.k9 k9Var = this.f29737a;
            int measuredWidth = (k9Var.getMeasuredWidth() / 2) + k9Var.getLeft();
            int measuredHeight = (k9Var.getMeasuredHeight() / 2) + k9Var.getTop();
            org.telegram.ui.ActionBar.k6.f28075o0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B5, false));
            org.telegram.ui.ActionBar.k6.f28075o0.setAlpha((int) (this.f29745w.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(28.0f), org.telegram.ui.ActionBar.k6.f28075o0);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(86.0f), 1073741824));
        this.f29744s.f33180a.E = org.telegram.messenger.g0.L(13.0f);
    }

    @Override
    public final void updateColors() {
        try {
            dq dqVar = this.f29744s;
            if (dqVar != null) {
                dqVar.invalidate();
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
