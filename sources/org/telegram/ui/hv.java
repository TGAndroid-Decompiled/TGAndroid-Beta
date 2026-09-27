package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hv extends org.telegram.ui.Components.bb {
    public final gv X;
    public final u6 Y;
    public final o0.a Z;
    public n6 f34288a0;
    public final org.telegram.ui.Components.oy0[] f34289b0;
    public final org.telegram.ui.Cells.a2[] f34290c0;
    public final LinearLayout f34291d0;
    public final y6 f34292e0;
    public final long f34293f0;
    public final zh.b f34294g0;

    public hv(b7 b7Var, u6 u6Var, zh.b bVar, o0.a aVar) {
        super((org.telegram.ui.ActionBar.o2) b7Var, false, !bVar.h(), (org.telegram.ui.ActionBar.e6) null);
        String string;
        int i10;
        long j3;
        long j10;
        this.f34289b0 = new org.telegram.ui.Components.oy0[8];
        this.f34290c0 = new org.telegram.ui.Cells.a2[8];
        this.Z = aVar;
        this.Y = u6Var;
        this.f34294g0 = bVar;
        this.f34293f0 = u6Var.f38128a;
        this.allowNestedScroll = false;
        N();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = b7Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f34291d0 = linearLayout;
        linearLayout.setOrientation(1);
        gv gvVar = new gv(getContext(), u6Var.f38128a, aVar);
        this.X = gvVar;
        linearLayout.addView(gvVar, w7.y5.t(-2, -2, 1, 0, 16, 0, 16));
        org.telegram.ui.Cells.a2 a2Var = null;
        int i11 = 0;
        for (int i12 = 8; i11 < i12; i12 = 8) {
            if (i11 == 0) {
                string = LocaleController.getString(R.string.LocalPhotoCache);
                i10 = org.telegram.ui.ActionBar.i6.lj;
            } else if (i11 == 1) {
                string = LocaleController.getString(R.string.LocalVideoCache);
                i10 = org.telegram.ui.ActionBar.i6.hj;
            } else if (i11 == 2) {
                string = LocaleController.getString(R.string.LocalDocumentCache);
                i10 = org.telegram.ui.ActionBar.i6.ij;
            } else if (i11 == 3) {
                string = LocaleController.getString(R.string.LocalMusicCache);
                i10 = org.telegram.ui.ActionBar.i6.jj;
            } else if (i11 == 4) {
                string = LocaleController.getString(R.string.LocalAudioCache);
                i10 = org.telegram.ui.ActionBar.i6.mj;
            } else if (i11 == 5) {
                string = LocaleController.getString(R.string.LocalStickersCache);
                i10 = org.telegram.ui.ActionBar.i6.nj;
            } else if (i11 == 7) {
                string = LocaleController.getString(R.string.LocalStoriesCache);
                i10 = org.telegram.ui.ActionBar.i6.oj;
            } else {
                string = LocaleController.getString(R.string.LocalMiscellaneousCache);
                i10 = org.telegram.ui.ActionBar.i6.pj;
            }
            String str = string;
            int i13 = i10;
            v6 v6Var = (v6) u6Var.d.get(i11);
            if (v6Var != null) {
                j3 = 0;
                j10 = v6Var.f38456a;
            } else {
                j3 = 0;
                j10 = 0;
            }
            if (j10 > j3) {
                org.telegram.ui.Components.oy0[] oy0VarArr = this.f34289b0;
                ?? obj = new Object();
                Paint paint = new Paint(1);
                obj.f27222b = paint;
                obj.f27223c = true;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                oy0VarArr[i11] = obj;
                org.telegram.ui.Components.oy0 oy0Var = this.f34289b0[i11];
                oy0Var.e = j10;
                oy0Var.f27221a = i13;
                org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(4, 21, parentActivity, null, false);
                a2Var2.setTag(Integer.valueOf(i11));
                a2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.K0(false));
                this.f34291d0.addView(a2Var2, w7.y5.n(-1, 50));
                a2Var2.e(str, AndroidUtilities.formatFileSize(j10), true, true, false);
                a2Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19164j5, false));
                int i14 = org.telegram.ui.ActionBar.i6.f19186k7;
                org.telegram.ui.Components.pp ppVar = a2Var2.f20012r;
                if (ppVar != null) {
                    ppVar.b(i13, i13, i14);
                }
                a2Var2.setOnClickListener(new org.telegram.ui.Components.ft(29, this, bVar));
                this.f34290c0[i11] = a2Var2;
                a2Var = a2Var2;
            } else {
                this.f34289b0[i11] = null;
                this.f34290c0[i11] = null;
            }
            i11++;
        }
        if (a2Var != null) {
            a2Var.setNeedDivider(false);
        }
        gv gvVar2 = this.X;
        org.telegram.ui.Components.oy0[] oy0VarArr2 = this.f34289b0;
        gvVar2.f27496b = oy0VarArr2;
        gvVar2.F = bVar;
        gvVar2.invalidate();
        gvVar2.f27497c = new float[oy0VarArr2.length];
        gvVar2.d = new float[oy0VarArr2.length];
        gvVar2.e = new float[oy0VarArr2.length];
        gvVar2.c(false);
        if (gvVar2.f27504y > 1) {
            gvVar2.f27498f = 0.0f;
        } else {
            gvVar2.f27498f = 1.0f;
        }
        y6 y6Var = new y6(this, getContext(), b7Var);
        this.f34292e0 = y6Var;
        y6Var.c(0, AndroidUtilities.dp(80.0f));
        y6Var.setCacheModel(bVar);
        y6Var.setDelegate(new o0.a(this, bVar, false, 5));
        org.telegram.ui.Components.va vaVar = this.f22966s;
        if (vaVar != null) {
            vaVar.setChildLayout(y6Var);
        } else {
            R();
            this.f34291d0.addView(this.f34288a0, w7.y5.q(-1, 72, 80));
        }
        if (this.f34288a0 != null) {
            this.f34288a0.a(this.X.a(), true);
        }
    }

    @Override
    public final void G(org.telegram.ui.Components.cw0 cw0Var) {
        this.d.j(new j3(this, 9));
        if (this.f22966s != null) {
            R();
            cw0Var.addView(this.f34288a0, w7.y5.e(-1, 72, 80));
        }
    }

    public final void R() {
        n6 n6Var = new n6(getContext());
        this.f34288a0 = n6Var;
        n6Var.f35826a.setOnClickListener(new a(this, 19));
        gv gvVar = this.X;
        if (gvVar != null) {
            this.f34288a0.a(gvVar.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.xl0 v(org.telegram.ui.Components.yl0 yl0Var) {
        return new fv(this);
    }

    @Override
    public final CharSequence y() {
        return this.f22964n.getMessagesController().getFullName(this.f34293f0);
    }
}
