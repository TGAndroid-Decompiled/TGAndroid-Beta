package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hv extends org.telegram.ui.Components.db {
    public final gv X;
    public final q6 Y;
    public final n6.k Z;
    public j6 f38545a0;
    public final org.telegram.ui.Components.ez0[] f38546b0;
    public final org.telegram.ui.Cells.a2[] f38547c0;
    public final LinearLayout f38548d0;
    public final u6 f38549e0;
    public final long f38550f0;
    public final zh.b f38551g0;

    public hv(x6 x6Var, q6 q6Var, zh.b bVar, n6.k kVar) {
        super((org.telegram.ui.ActionBar.m2) x6Var, false, !bVar.h(), (org.telegram.ui.ActionBar.d6) null);
        String string;
        int i10;
        long j3;
        long j10;
        this.f38546b0 = new org.telegram.ui.Components.ez0[8];
        this.f38547c0 = new org.telegram.ui.Cells.a2[8];
        this.Z = kVar;
        this.Y = q6Var;
        this.f38551g0 = bVar;
        this.f38550f0 = q6Var.f41080a;
        this.allowNestedScroll = false;
        O();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = x6Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f38548d0 = linearLayout;
        linearLayout.setOrientation(1);
        gv gvVar = new gv(getContext(), q6Var.f41080a, kVar);
        this.X = gvVar;
        linearLayout.addView(gvVar, w7.x5.t(-2, -2, 1, 0, 16, 0, 16));
        int i11 = 0;
        org.telegram.ui.Cells.a2 a2Var = null;
        for (int i12 = 8; i11 < i12; i12 = 8) {
            if (i11 == 0) {
                string = LocaleController.getString(R.string.LocalPhotoCache);
                i10 = org.telegram.ui.ActionBar.h6.lj;
            } else if (i11 == 1) {
                string = LocaleController.getString(R.string.LocalVideoCache);
                i10 = org.telegram.ui.ActionBar.h6.hj;
            } else if (i11 == 2) {
                string = LocaleController.getString(R.string.LocalDocumentCache);
                i10 = org.telegram.ui.ActionBar.h6.ij;
            } else if (i11 == 3) {
                string = LocaleController.getString(R.string.LocalMusicCache);
                i10 = org.telegram.ui.ActionBar.h6.jj;
            } else if (i11 == 4) {
                string = LocaleController.getString(R.string.LocalAudioCache);
                i10 = org.telegram.ui.ActionBar.h6.mj;
            } else if (i11 == 5) {
                string = LocaleController.getString(R.string.LocalStickersCache);
                i10 = org.telegram.ui.ActionBar.h6.nj;
            } else if (i11 == 7) {
                string = LocaleController.getString(R.string.LocalStoriesCache);
                i10 = org.telegram.ui.ActionBar.h6.oj;
            } else {
                string = LocaleController.getString(R.string.LocalMiscellaneousCache);
                i10 = org.telegram.ui.ActionBar.h6.pj;
            }
            String str = string;
            int i13 = i10;
            r6 r6Var = (r6) q6Var.d.get(i11);
            if (r6Var != null) {
                j3 = 0;
                j10 = r6Var.f41370a;
            } else {
                j3 = 0;
                j10 = 0;
            }
            if (j10 > j3) {
                org.telegram.ui.Components.ez0[] ez0VarArr = this.f38546b0;
                ?? obj = new Object();
                Paint paint = new Paint(1);
                obj.f26255e = paint;
                obj.f26254c = true;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                ez0VarArr[i11] = obj;
                org.telegram.ui.Components.ez0 ez0Var = this.f38546b0[i11];
                ez0Var.f26252a = j10;
                ez0Var.f26253b = i13;
                org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(4, 21, parentActivity, null, false);
                a2Var2.setTag(Integer.valueOf(i11));
                a2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(false));
                this.f38548d0.addView(a2Var2, w7.x5.n(-1, 50));
                a2Var2.e(str, AndroidUtilities.formatFileSize(j10), true, true, false);
                a2Var2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20930j5, false));
                int i14 = org.telegram.ui.ActionBar.h6.f20951k7;
                org.telegram.ui.Components.dq dqVar = a2Var2.f21814r;
                if (dqVar != null) {
                    dqVar.b(i13, i13, i14);
                }
                a2Var2.setOnClickListener(new org.telegram.ui.Components.vt(29, this, bVar));
                this.f38547c0[i11] = a2Var2;
                a2Var = a2Var2;
            } else {
                this.f38546b0[i11] = null;
                this.f38547c0[i11] = null;
            }
            i11++;
        }
        if (a2Var != null) {
            a2Var.setNeedDivider(false);
        }
        gv gvVar2 = this.X;
        org.telegram.ui.Components.ez0[] ez0VarArr2 = this.f38546b0;
        gvVar2.f26595b = ez0VarArr2;
        gvVar2.F = bVar;
        gvVar2.invalidate();
        gvVar2.f26596c = new float[ez0VarArr2.length];
        gvVar2.d = new float[ez0VarArr2.length];
        gvVar2.f26597e = new float[ez0VarArr2.length];
        gvVar2.c(false);
        if (gvVar2.f26604y > 1) {
            gvVar2.f26598f = 0.0f;
        } else {
            gvVar2.f26598f = 1.0f;
        }
        u6 u6Var = new u6(this, getContext(), x6Var, 1);
        this.f38549e0 = u6Var;
        u6Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        u6Var.setCacheModel(bVar);
        u6Var.setDelegate(new n7.z0(this, bVar, false, 5));
        org.telegram.ui.Components.xa xaVar = this.f25738s;
        if (xaVar != null) {
            xaVar.setChildLayout(u6Var);
        } else {
            S();
            this.f38548d0.addView(this.f38545a0, w7.x5.q(-1, 72, 80));
        }
        if (this.f38545a0 != null) {
            this.f38545a0.a(this.X.a(), true);
        }
    }

    @Override
    public final CharSequence B() {
        return this.f25736n.getMessagesController().getFullName(this.f38550f0);
    }

    @Override
    public final void H(org.telegram.ui.Components.tw0 tw0Var) {
        this.d.j(new h3(this, 9));
        if (this.f25738s != null) {
            S();
            tw0Var.addView(this.f38545a0, w7.x5.e(-1, 72, 80));
        }
    }

    public final void S() {
        j6 j6Var = new j6(getContext());
        this.f38545a0 = j6Var;
        j6Var.f38891a.setOnClickListener(new a(this, 18));
        gv gvVar = this.X;
        if (gvVar != null) {
            this.f38545a0.a(gvVar.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.qm0 x(org.telegram.ui.Components.rm0 rm0Var) {
        return new fv(this);
    }
}
