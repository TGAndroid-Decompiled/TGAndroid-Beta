package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class o30 extends il0 {
    public final Context f31245c;
    public final rf.k1 d;
    public m30 f31246e;
    public int f31247f;
    public boolean h;
    public int f31248n;
    public int f31249r;
    public int f31250s;
    public int v;
    public final p30 f31251w;

    public o30(p30 p30Var, Context context) {
        this.f31251w = p30Var;
        this.f31245c = context;
        rf.k1 k1Var = new rf.k1(true);
        this.d = k1Var;
        k1Var.f47277a = new n30(this);
    }

    @Override
    public final void A(f2.n1 n1Var) {
        View view = n1Var.f6432a;
        if (view instanceof org.telegram.ui.Cells.z4) {
            ((org.telegram.ui.Cells.z4) view).a();
        }
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        View view = n1Var.f6432a;
        if ((!(view instanceof org.telegram.ui.Cells.z4) || !this.f31251w.f31564b0.contains(Long.valueOf(((org.telegram.ui.Cells.z4) view).getUserId()))) && n1Var.f6436f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f31247f;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f31249r) {
            return 3;
        }
        if (i10 != this.v && i10 != this.f31250s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        this.f31247f = 1;
        rf.k1 k1Var = this.d;
        int size = k1Var.f47282g.size();
        if (size != 0) {
            int i10 = this.f31247f;
            this.f31250s = i10;
            this.f31247f = size + 1 + i10;
        } else {
            this.f31250s = -1;
        }
        int size2 = k1Var.f47280e.size();
        if (size2 != 0) {
            int i11 = this.f31247f;
            this.v = i11;
            this.f31247f = size2 + 1 + i11;
        } else {
            this.v = -1;
        }
        int i12 = this.f31247f;
        this.f31247f = i12 + 1;
        this.f31249r = i12;
        super.l();
    }

    @Override
    public final void v(f2.n1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o30.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        if (i10 != 0) {
            Context context = this.f31245c;
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                } else {
                    view = new View(context);
                    view.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
                }
            } else {
                org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(context, null);
                s3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23180jg, false));
                s3Var.setTextColor(org.telegram.ui.ActionBar.g6.Qg);
                view = s3Var;
            }
        } else {
            org.telegram.ui.Cells.z4 z4Var = new org.telegram.ui.Cells.z4(2, 2, this.f31245c, null, false);
            z4Var.setCustomRightImage(R.drawable.msg_invited);
            z4Var.setNameColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23251ng, false));
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23215lg, false);
            int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23286pg, false);
            z4Var.D = w02;
            z4Var.E = w03;
            z4Var.setDividerColor(org.telegram.ui.ActionBar.g6.f23356tg);
            view = z4Var;
        }
        return new f2.n1(view);
    }
}
