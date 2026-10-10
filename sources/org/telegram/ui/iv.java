package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class iv extends org.telegram.ui.Components.eb {
    public final hv X;
    public final r6 Y;
    public final n6.t Z;
    public k6 f38805a0;
    public final org.telegram.ui.Components.ez0[] f38806b0;
    public final org.telegram.ui.Cells.a2[] f38807c0;
    public final LinearLayout f38808d0;
    public final v6 f38809e0;
    public final long f38810f0;
    public final zh.b f38811g0;

    public iv(y6 y6Var, r6 r6Var, zh.b bVar, n6.t tVar) {
        super((org.telegram.ui.ActionBar.n2) y6Var, false, !bVar.h(), (org.telegram.ui.ActionBar.e6) null);
        String string;
        int i10;
        long j3;
        long j10;
        this.f38806b0 = new org.telegram.ui.Components.ez0[8];
        this.f38807c0 = new org.telegram.ui.Cells.a2[8];
        this.Z = tVar;
        this.Y = r6Var;
        this.f38811g0 = bVar;
        this.f38810f0 = r6Var.f41325a;
        this.allowNestedScroll = false;
        O();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = y6Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f38808d0 = linearLayout;
        linearLayout.setOrientation(1);
        hv hvVar = new hv(getContext(), r6Var.f41325a, tVar);
        this.X = hvVar;
        linearLayout.addView(hvVar, w7.x5.t(-2, -2, 1, 0, 16, 0, 16));
        int i11 = 0;
        org.telegram.ui.Cells.a2 a2Var = null;
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
            s6 s6Var = (s6) r6Var.d.get(i11);
            if (s6Var != null) {
                j3 = 0;
                j10 = s6Var.f41631a;
            } else {
                j3 = 0;
                j10 = 0;
            }
            if (j10 > j3) {
                org.telegram.ui.Components.ez0[] ez0VarArr = this.f38806b0;
                ?? obj = new Object();
                Paint paint = new Paint(1);
                obj.f26217e = paint;
                obj.f26216c = true;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                ez0VarArr[i11] = obj;
                org.telegram.ui.Components.ez0 ez0Var = this.f38806b0[i11];
                ez0Var.f26214a = j10;
                ez0Var.f26215b = i13;
                org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(4, 21, parentActivity, null, false);
                a2Var2.setTag(Integer.valueOf(i11));
                a2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.L0(false));
                this.f38808d0.addView(a2Var2, w7.x5.n(-1, 50));
                a2Var2.e(str, AndroidUtilities.formatFileSize(j10), true, true, false);
                a2Var2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20909j5, false));
                int i14 = org.telegram.ui.ActionBar.i6.f20930k7;
                org.telegram.ui.Components.dq dqVar = a2Var2.f21790r;
                if (dqVar != null) {
                    dqVar.b(i13, i13, i14);
                }
                a2Var2.setOnClickListener(new org.telegram.ui.Components.vt(29, this, bVar));
                this.f38807c0[i11] = a2Var2;
                a2Var = a2Var2;
            } else {
                this.f38806b0[i11] = null;
                this.f38807c0[i11] = null;
            }
            i11++;
        }
        if (a2Var != null) {
            a2Var.setNeedDivider(false);
        }
        hv hvVar2 = this.X;
        org.telegram.ui.Components.ez0[] ez0VarArr2 = this.f38806b0;
        hvVar2.f26546b = ez0VarArr2;
        hvVar2.F = bVar;
        hvVar2.invalidate();
        hvVar2.f26547c = new float[ez0VarArr2.length];
        hvVar2.d = new float[ez0VarArr2.length];
        hvVar2.f26548e = new float[ez0VarArr2.length];
        hvVar2.c(false);
        if (hvVar2.f26555y > 1) {
            hvVar2.f26549f = 0.0f;
        } else {
            hvVar2.f26549f = 1.0f;
        }
        v6 v6Var = new v6(this, getContext(), y6Var, 1);
        this.f38809e0 = v6Var;
        v6Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        v6Var.setCacheModel(bVar);
        v6Var.setDelegate(new org.telegram.ui.ActionBar.b5(4, this, bVar));
        org.telegram.ui.Components.ya yaVar = this.f25987s;
        if (yaVar != null) {
            yaVar.setChildLayout(v6Var);
        } else {
            S();
            this.f38808d0.addView(this.f38805a0, w7.x5.q(-1, 72, 80));
        }
        if (this.f38805a0 != null) {
            this.f38805a0.a(this.X.a(), true);
        }
    }

    @Override
    public final CharSequence B() {
        return this.f25985n.getMessagesController().getFullName(this.f38810f0);
    }

    @Override
    public final void H(org.telegram.ui.Components.tw0 tw0Var) {
        this.d.j(new i3(this, 9));
        if (this.f25987s != null) {
            S();
            tw0Var.addView(this.f38805a0, w7.x5.e(-1, 72, 80));
        }
    }

    public final void S() {
        k6 k6Var = new k6(getContext());
        this.f38805a0 = k6Var;
        k6Var.f39147a.setOnClickListener(new a(this, 18));
        hv hvVar = this.X;
        if (hvVar != null) {
            this.f38805a0.a(hvVar.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.qm0 x(org.telegram.ui.Components.rm0 rm0Var) {
        return new gv(this);
    }
}
