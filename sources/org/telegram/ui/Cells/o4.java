package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import di.tb;
import java.util.HashSet;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.kq;
public final class o4 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.u5 E;
    public boolean F;
    public final org.telegram.ui.Components.u5 G;
    public long H;
    public int I;
    public ug.z0 J;
    public Drawable K;
    public final org.telegram.ui.Components.i9 f30798a;
    public final tb f30799b;
    public final org.telegram.ui.Components.t8 f30800c;
    public int d;
    public TLRPC.User f30801e;
    public long f30802f;
    public final int h;
    public float f30803n;
    public boolean f30804r;
    public final kq f30805s;
    public final fp f30806w;
    public final boolean f30807x;
    public boolean f30808y;

    public o4(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.f30800c = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        new RectF();
        this.h = m10.f24940t0;
        er erVar = er.h;
        this.E = new org.telegram.ui.Components.u5(this, 0L, 350L, erVar);
        this.G = new org.telegram.ui.Components.u5(this, 0L, 350L, erVar);
        this.I = org.telegram.ui.ActionBar.j6.f28849d6;
        this.f30807x = z10;
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f30798a = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(27.0f));
        addView(i9Var, c8.ja.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        tb tbVar = new tb(context, 6);
        this.f30799b = tbVar;
        ns.i(tbVar);
        org.telegram.ui.ActionBar.q6.U(tbVar, org.telegram.ui.ActionBar.j6.G6, e6Var);
        tbVar.setTextSize(1, 12.0f);
        tbVar.setMaxLines(1);
        tbVar.setGravity(49);
        tbVar.setLines(1);
        tbVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(tbVar, c8.ja.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        kq kqVar = new kq(context, e6Var);
        this.f30805s = kqVar;
        addView(kqVar, c8.ja.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i7 = org.telegram.ui.ActionBar.j6.W8;
        int i10 = org.telegram.ui.ActionBar.j6.U8;
        jq jqVar = kqVar.f36574a;
        jqVar.v = i7;
        jqVar.f36148w = i10;
        kqVar.setGravity(5);
        if (z10) {
            fp fpVar = new fp(21, context, e6Var);
            this.f30806w = fpVar;
            fpVar.b(org.telegram.ui.ActionBar.j6.B5, org.telegram.ui.ActionBar.j6.f28922h5, org.telegram.ui.ActionBar.j6.C5);
            fpVar.setDrawUnchecked(false);
            fpVar.setDrawBackgroundAsArc(4);
            fpVar.setProgressDelegate(new ca(this, 4));
            addView(fpVar, c8.ja.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            fpVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j3, boolean z10, CharSequence charSequence) {
        if (this.f30802f != j3) {
            this.f30804r = false;
            invalidate();
        }
        this.f30802f = j3;
        boolean E = org.telegram.messenger.m5.E(j3);
        org.telegram.ui.Components.i9 i9Var = this.f30798a;
        org.telegram.ui.Components.t8 t8Var = this.f30800c;
        int i7 = this.h;
        tb tbVar = this.f30799b;
        if (E) {
            TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(j3));
            this.f30801e = a22;
            if (charSequence != null) {
                tbVar.setText(charSequence);
            } else if (a22 != null) {
                tbVar.setText(q10.j(a22, true));
            } else {
                tbVar.setText("");
            }
            t8Var.r(this.f30801e);
            i9Var.f(this.f30801e, t8Var);
        } else {
            TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-j3));
            if (charSequence != null) {
                tbVar.setText(charSequence);
            } else if (M0 != null) {
                tbVar.setText(M0.title);
            } else {
                tbVar.setText("");
            }
            t8Var.q(M0);
            this.f30801e = null;
            i9Var.f(M0, t8Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i7) {
        int i10;
        int i11 = np.D8;
        int i12 = i7 & 4;
        int i13 = this.h;
        if (i12 != 0 && this.f30801e != null) {
            this.f30801e = np.s1(i13).a2(Long.valueOf(this.f30801e.f28200id));
            this.f30798a.invalidate();
            invalidate();
        }
        if (i7 == 0 || (i7 & 256) != 0 || (i7 & 2048) != 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) np.s1(i13).R.f(this.f30802f);
            kq kqVar = this.f30805s;
            if (dialog != null && (i10 = dialog.unread_count) != 0) {
                if (this.d != i10) {
                    this.d = i10;
                    kqVar.f36574a.c(i10, this.f30804r);
                    return;
                }
                return;
            }
            this.d = 0;
            kqVar.f36574a.c(0, this.f30804r);
        }
    }

    public final void c(boolean z10) {
        TL_account.RequirementToContact requirementToContact;
        boolean z11;
        if (this.f30808y && this.f30801e != null) {
            requirementToContact = np.s1(this.h).J2(this.f30801e.f28200id);
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
        return this.f30802f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f30807x) {
            org.telegram.ui.Components.i9 i9Var = this.f30798a;
            int measuredWidth = (i9Var.getMeasuredWidth() / 2) + i9Var.getLeft();
            int measuredHeight = (i9Var.getMeasuredHeight() / 2) + i9Var.getTop();
            org.telegram.ui.ActionBar.j6.f29044o0.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.B5, false));
            org.telegram.ui.ActionBar.j6.f29044o0.setAlpha((int) (this.f30806w.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(28.0f), org.telegram.ui.ActionBar.j6.f29044o0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(86.0f), 1073741824));
        this.f30805s.f36574a.E = org.telegram.messenger.g0.L(13.0f);
    }

    @Override
    public final void updateColors() {
        try {
            kq kqVar = this.f30805s;
            if (kqVar != null) {
                kqVar.invalidate();
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
