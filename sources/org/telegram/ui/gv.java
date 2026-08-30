package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gv extends org.telegram.ui.Components.sa {
    public final fv U;
    public final u6 V;
    public final n7.qa W;
    public o6 X;
    public final org.telegram.ui.Components.ey0[] Y;
    public final org.telegram.ui.Cells.z1[] Z;
    public final LinearLayout f34685a0;
    public final y6 f34686b0;
    public final long f34687c0;
    public final mh.b f34688d0;

    public gv(b7 b7Var, u6 u6Var, mh.b bVar, n7.qa qaVar) {
        super(b7Var.getParentActivity(), b7Var, false, false, !bVar.h(), 1, null);
        String string;
        int i10;
        long j10;
        long j11;
        ?? r11 = 1;
        int i11 = 8;
        this.Y = new org.telegram.ui.Components.ey0[8];
        this.Z = new org.telegram.ui.Cells.z1[8];
        this.W = qaVar;
        this.V = u6Var;
        this.f34688d0 = bVar;
        this.f34687c0 = u6Var.f38849a;
        this.allowNestedScroll = false;
        N();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = b7Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f34685a0 = linearLayout;
        linearLayout.setOrientation(1);
        fv fvVar = new fv(getContext(), u6Var.f38849a, qaVar);
        this.U = fvVar;
        linearLayout.addView(fvVar, k7.b6.t(-2, -2, 1, 0, 16, 0, 16));
        org.telegram.ui.Cells.z1 z1Var = null;
        int i12 = 0;
        while (i12 < i11) {
            if (i12 == 0) {
                string = LocaleController.getString(R.string.LocalPhotoCache);
                i10 = org.telegram.ui.ActionBar.j6.lj;
            } else if (i12 == r11) {
                string = LocaleController.getString(R.string.LocalVideoCache);
                i10 = org.telegram.ui.ActionBar.j6.hj;
            } else if (i12 == 2) {
                string = LocaleController.getString(R.string.LocalDocumentCache);
                i10 = org.telegram.ui.ActionBar.j6.ij;
            } else if (i12 == 3) {
                string = LocaleController.getString(R.string.LocalMusicCache);
                i10 = org.telegram.ui.ActionBar.j6.jj;
            } else if (i12 == 4) {
                string = LocaleController.getString(R.string.LocalAudioCache);
                i10 = org.telegram.ui.ActionBar.j6.mj;
            } else if (i12 == 5) {
                string = LocaleController.getString(R.string.LocalStickersCache);
                i10 = org.telegram.ui.ActionBar.j6.nj;
            } else if (i12 == 7) {
                string = LocaleController.getString(R.string.LocalStoriesCache);
                i10 = org.telegram.ui.ActionBar.j6.oj;
            } else {
                string = LocaleController.getString(R.string.LocalMiscellaneousCache);
                i10 = org.telegram.ui.ActionBar.j6.pj;
            }
            v6 v6Var = (v6) u6Var.d.get(i12);
            if (v6Var != null) {
                j10 = 0;
                j11 = v6Var.f39085a;
            } else {
                j10 = 0;
                j11 = 0;
            }
            if (j11 > j10) {
                org.telegram.ui.Components.ey0[] ey0VarArr = this.Y;
                ?? obj = new Object();
                Paint paint = new Paint((int) r11);
                obj.f24702b = paint;
                obj.f24703c = r11;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                ey0VarArr[i12] = obj;
                org.telegram.ui.Components.ey0 ey0Var = this.Y[i12];
                ey0Var.e = j11;
                ey0Var.f24701a = i10;
                org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(4, 21, parentActivity, null, false);
                z1Var2.setTag(Integer.valueOf(i12));
                z1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                this.f34685a0.addView(z1Var2, k7.b6.n(-1, 50));
                z1Var2.e(string, AndroidUtilities.formatFileSize(j11), true, true, false);
                z1Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20012j5, false));
                int i13 = org.telegram.ui.ActionBar.j6.f20032k7;
                org.telegram.ui.Components.lp lpVar = z1Var2.f22644r;
                if (lpVar != null) {
                    lpVar.b(i10, i10, i13);
                }
                z1Var2.setOnClickListener(new org.telegram.ui.Components.rx0(14, this, bVar));
                this.Z[i12] = z1Var2;
                z1Var = z1Var2;
            } else {
                this.Y[i12] = null;
                this.Z[i12] = null;
            }
            i12++;
            i11 = 8;
            r11 = 1;
        }
        if (z1Var != null) {
            z1Var.setNeedDivider(false);
        }
        fv fvVar2 = this.U;
        org.telegram.ui.Components.ey0[] ey0VarArr2 = this.Y;
        fvVar2.f24983b = ey0VarArr2;
        fvVar2.C = bVar;
        fvVar2.invalidate();
        fvVar2.f24984c = new float[ey0VarArr2.length];
        fvVar2.d = new float[ey0VarArr2.length];
        fvVar2.e = new float[ey0VarArr2.length];
        fvVar2.c(false);
        if (fvVar2.f24991y > 1) {
            fvVar2.f24985f = 0.0f;
        } else {
            fvVar2.f24985f = 1.0f;
        }
        y6 y6Var = new y6(this, getContext(), b7Var, 1);
        this.f34686b0 = y6Var;
        y6Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        y6Var.setCacheModel(bVar);
        y6Var.setDelegate(new n7.qa(15, this, bVar));
        org.telegram.ui.Components.na naVar = this.f28680s;
        if (naVar != null) {
            naVar.setChildLayout(y6Var);
        } else {
            R();
            this.f34685a0.addView(this.X, k7.b6.q(-1, 72, 80));
        }
        if (this.X != null) {
            this.X.a(this.U.a(), true);
        }
    }

    @Override
    public final void F(org.telegram.ui.Components.qv0 qv0Var) {
        this.d.j(new l3(this, 9));
        if (this.f28680s != null) {
            R();
            qv0Var.addView(this.X, k7.b6.e(-1, 72, 80));
        }
    }

    public final void R() {
        o6 o6Var = new o6(getContext());
        this.X = o6Var;
        o6Var.f36796a.setOnClickListener(new a(this, 19));
        fv fvVar = this.U;
        if (fvVar != null) {
            this.X.a(fvVar.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.rl0 v(org.telegram.ui.Components.sl0 sl0Var) {
        return new ev(this);
    }

    @Override
    public final CharSequence y() {
        return this.f28678n.getMessagesController().getFullName(this.f34687c0);
    }
}
