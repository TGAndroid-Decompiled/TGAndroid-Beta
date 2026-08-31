package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hv extends org.telegram.ui.Components.sa {
    public final gv U;
    public final u6 V;
    public final n7.qa W;
    public o6 X;
    public final org.telegram.ui.Components.fy0[] Y;
    public final org.telegram.ui.Cells.z1[] Z;
    public final LinearLayout f37636a0;
    public final y6 f37637b0;
    public final long f37638c0;
    public final nh.b f37639d0;

    public hv(b7 b7Var, u6 u6Var, nh.b bVar, n7.qa qaVar) {
        super(b7Var.getParentActivity(), b7Var, false, false, !bVar.h(), 1, null);
        String string;
        int i10;
        long j10;
        long j11;
        ?? r11 = 1;
        int i11 = 8;
        this.Y = new org.telegram.ui.Components.fy0[8];
        this.Z = new org.telegram.ui.Cells.z1[8];
        this.W = qaVar;
        this.V = u6Var;
        this.f37639d0 = bVar;
        this.f37638c0 = u6Var.f41797a;
        this.allowNestedScroll = false;
        N();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = b7Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f37636a0 = linearLayout;
        linearLayout.setOrientation(1);
        gv gvVar = new gv(getContext(), u6Var.f41797a, qaVar);
        this.U = gvVar;
        linearLayout.addView(gvVar, k7.c6.t(-2, -2, 1, 0, 16, 0, 16));
        org.telegram.ui.Cells.z1 z1Var = null;
        int i12 = 0;
        while (i12 < i11) {
            if (i12 == 0) {
                string = LocaleController.getString(R.string.LocalPhotoCache);
                i10 = org.telegram.ui.ActionBar.k6.lj;
            } else if (i12 == r11) {
                string = LocaleController.getString(R.string.LocalVideoCache);
                i10 = org.telegram.ui.ActionBar.k6.hj;
            } else if (i12 == 2) {
                string = LocaleController.getString(R.string.LocalDocumentCache);
                i10 = org.telegram.ui.ActionBar.k6.ij;
            } else if (i12 == 3) {
                string = LocaleController.getString(R.string.LocalMusicCache);
                i10 = org.telegram.ui.ActionBar.k6.jj;
            } else if (i12 == 4) {
                string = LocaleController.getString(R.string.LocalAudioCache);
                i10 = org.telegram.ui.ActionBar.k6.mj;
            } else if (i12 == 5) {
                string = LocaleController.getString(R.string.LocalStickersCache);
                i10 = org.telegram.ui.ActionBar.k6.nj;
            } else if (i12 == 7) {
                string = LocaleController.getString(R.string.LocalStoriesCache);
                i10 = org.telegram.ui.ActionBar.k6.oj;
            } else {
                string = LocaleController.getString(R.string.LocalMiscellaneousCache);
                i10 = org.telegram.ui.ActionBar.k6.pj;
            }
            v6 v6Var = (v6) u6Var.d.get(i12);
            if (v6Var != null) {
                j10 = 0;
                j11 = v6Var.f42133a;
            } else {
                j10 = 0;
                j11 = 0;
            }
            if (j11 > j10) {
                org.telegram.ui.Components.fy0[] fy0VarArr = this.Y;
                ?? obj = new Object();
                Paint paint = new Paint((int) r11);
                obj.f27037b = paint;
                obj.f27038c = r11;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                fy0VarArr[i12] = obj;
                org.telegram.ui.Components.fy0 fy0Var = this.Y[i12];
                fy0Var.f27039e = j11;
                fy0Var.f27036a = i10;
                org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(4, 21, parentActivity, null, false);
                z1Var2.setTag(Integer.valueOf(i12));
                z1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(false));
                this.f37636a0.addView(z1Var2, k7.c6.n(-1, 50));
                z1Var2.e(string, AndroidUtilities.formatFileSize(j11), true, true, false);
                z1Var2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21766j5, false));
                int i13 = org.telegram.ui.ActionBar.k6.f21786k7;
                org.telegram.ui.Components.np npVar = z1Var2.f24476r;
                if (npVar != null) {
                    npVar.b(i10, i10, i13);
                }
                z1Var2.setOnClickListener(new org.telegram.ui.Components.sx0(14, this, bVar));
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
        gv gvVar2 = this.U;
        org.telegram.ui.Components.fy0[] fy0VarArr2 = this.Y;
        gvVar2.f27325b = fy0VarArr2;
        gvVar2.C = bVar;
        gvVar2.invalidate();
        gvVar2.f27326c = new float[fy0VarArr2.length];
        gvVar2.d = new float[fy0VarArr2.length];
        gvVar2.f27327e = new float[fy0VarArr2.length];
        gvVar2.c(false);
        if (gvVar2.f27334y > 1) {
            gvVar2.f27328f = 0.0f;
        } else {
            gvVar2.f27328f = 1.0f;
        }
        y6 y6Var = new y6(this, getContext(), b7Var, 1);
        this.f37637b0 = y6Var;
        y6Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        y6Var.setCacheModel(bVar);
        y6Var.setDelegate(new n7.qa(this, bVar, false, 15));
        org.telegram.ui.Components.na naVar = this.f31019s;
        if (naVar != null) {
            naVar.setChildLayout(y6Var);
        } else {
            R();
            this.f37636a0.addView(this.X, k7.c6.q(-1, 72, 80));
        }
        if (this.X != null) {
            this.X.a(this.U.a(), true);
        }
    }

    @Override
    public final void F(org.telegram.ui.Components.qv0 qv0Var) {
        this.d.j(new l3(this, 9));
        if (this.f31019s != null) {
            R();
            qv0Var.addView(this.X, k7.c6.e(-1, 72, 80));
        }
    }

    public final void R() {
        o6 o6Var = new o6(getContext());
        this.X = o6Var;
        o6Var.f39601a.setOnClickListener(new a(this, 19));
        gv gvVar = this.U;
        if (gvVar != null) {
            this.X.a(gvVar.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.sl0 v(org.telegram.ui.Components.tl0 tl0Var) {
        return new fv(this);
    }

    @Override
    public final CharSequence y() {
        return this.f31017n.getMessagesController().getFullName(this.f37638c0);
    }
}
