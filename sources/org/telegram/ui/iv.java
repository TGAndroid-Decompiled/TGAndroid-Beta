package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class iv extends org.telegram.ui.Components.sa {
    public final hv U;
    public final w6 V;
    public final n7.qa W;
    public q6 X;
    public final org.telegram.ui.Components.ey0[] Y;
    public final org.telegram.ui.Cells.y1[] Z;
    public final LinearLayout f35031a0;
    public final a7 f35032b0;
    public final long f35033c0;
    public final mh.b f35034d0;

    public iv(d7 d7Var, w6 w6Var, mh.b bVar, n7.qa qaVar) {
        super(d7Var.getParentActivity(), d7Var, false, false, !bVar.h(), 1, null);
        String string;
        int i10;
        long j10;
        long j11;
        ?? r11 = 1;
        int i11 = 8;
        this.Y = new org.telegram.ui.Components.ey0[8];
        this.Z = new org.telegram.ui.Cells.y1[8];
        this.W = qaVar;
        this.V = w6Var;
        this.f35034d0 = bVar;
        this.f35033c0 = w6Var.f39277a;
        this.allowNestedScroll = false;
        N();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = d7Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f35031a0 = linearLayout;
        linearLayout.setOrientation(1);
        hv hvVar = new hv(getContext(), w6Var.f39277a, qaVar);
        this.U = hvVar;
        linearLayout.addView(hvVar, k7.b6.t(-2, -2, 1, 0, 16, 0, 16));
        org.telegram.ui.Cells.y1 y1Var = null;
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
            x6 x6Var = (x6) w6Var.d.get(i12);
            if (x6Var != null) {
                j10 = 0;
                j11 = x6Var.f39846a;
            } else {
                j10 = 0;
                j11 = 0;
            }
            if (j11 > j10) {
                org.telegram.ui.Components.ey0[] ey0VarArr = this.Y;
                ?? obj = new Object();
                Paint paint = new Paint((int) r11);
                obj.f24721b = paint;
                obj.f24722c = r11;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                ey0VarArr[i12] = obj;
                org.telegram.ui.Components.ey0 ey0Var = this.Y[i12];
                ey0Var.e = j11;
                ey0Var.f24720a = i10;
                org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(4, 21, parentActivity, null, false);
                y1Var2.setTag(Integer.valueOf(i12));
                y1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                this.f35031a0.addView(y1Var2, k7.b6.n(-1, 50));
                y1Var2.e(string, AndroidUtilities.formatFileSize(j11), true, true, false);
                y1Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19987j5, false));
                int i13 = org.telegram.ui.ActionBar.j6.f20007k7;
                org.telegram.ui.Components.kp kpVar = y1Var2.f22580r;
                if (kpVar != null) {
                    kpVar.b(i10, i10, i13);
                }
                y1Var2.setOnClickListener(new org.telegram.ui.Components.rx0(14, this, bVar));
                this.Z[i12] = y1Var2;
                y1Var = y1Var2;
            } else {
                this.Y[i12] = null;
                this.Z[i12] = null;
            }
            i12++;
            i11 = 8;
            r11 = 1;
        }
        if (y1Var != null) {
            y1Var.setNeedDivider(false);
        }
        hv hvVar2 = this.U;
        org.telegram.ui.Components.ey0[] ey0VarArr2 = this.Y;
        hvVar2.f24989b = ey0VarArr2;
        hvVar2.C = bVar;
        hvVar2.invalidate();
        hvVar2.f24990c = new float[ey0VarArr2.length];
        hvVar2.d = new float[ey0VarArr2.length];
        hvVar2.e = new float[ey0VarArr2.length];
        hvVar2.c(false);
        if (hvVar2.f24997y > 1) {
            hvVar2.f24991f = 0.0f;
        } else {
            hvVar2.f24991f = 1.0f;
        }
        a7 a7Var = new a7(this, getContext(), d7Var, 1);
        this.f35032b0 = a7Var;
        a7Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        a7Var.setCacheModel(bVar);
        a7Var.setDelegate(new n7.qa(15, this, bVar));
        org.telegram.ui.Components.na naVar = this.f28703s;
        if (naVar != null) {
            naVar.setChildLayout(a7Var);
        } else {
            R();
            this.f35031a0.addView(this.X, k7.b6.q(-1, 72, 80));
        }
        if (this.X != null) {
            this.X.a(this.U.a(), true);
        }
    }

    @Override
    public final void F(org.telegram.ui.Components.qv0 qv0Var) {
        this.d.j(new n3(this, 9));
        if (this.f28703s != null) {
            R();
            qv0Var.addView(this.X, k7.b6.e(-1, 72, 80));
        }
    }

    public final void R() {
        q6 q6Var = new q6(getContext());
        this.X = q6Var;
        q6Var.f37313a.setOnClickListener(new a(this, 19));
        hv hvVar = this.U;
        if (hvVar != null) {
            this.X.a(hvVar.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.ql0 v(org.telegram.ui.Components.rl0 rl0Var) {
        return new gv(this);
    }

    @Override
    public final CharSequence y() {
        return this.f28701n.getMessagesController().getFullName(this.f35033c0);
    }
}
