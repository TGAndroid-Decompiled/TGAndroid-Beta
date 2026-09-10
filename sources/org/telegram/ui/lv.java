package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lv extends org.telegram.ui.Components.ab {
    public final kv X;
    public final r6 Y;
    public final n7.a1 Z;
    public l6 f34779a0;
    public final org.telegram.ui.Components.oy0[] f34780b0;
    public final org.telegram.ui.Cells.z1[] f34781c0;
    public final LinearLayout f34782d0;
    public final v6 f34783e0;
    public final long f34784f0;
    public final yh.b f34785g0;

    public lv(y6 y6Var, r6 r6Var, yh.b bVar, n7.a1 a1Var) {
        super((org.telegram.ui.ActionBar.p2) y6Var, false, !bVar.h(), (org.telegram.ui.ActionBar.f6) null);
        String string;
        int i10;
        long j3;
        long j10;
        this.f34780b0 = new org.telegram.ui.Components.oy0[8];
        this.f34781c0 = new org.telegram.ui.Cells.z1[8];
        this.Z = a1Var;
        this.Y = r6Var;
        this.f34785g0 = bVar;
        this.f34784f0 = r6Var.f36238a;
        this.allowNestedScroll = false;
        N();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = y6Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f34782d0 = linearLayout;
        linearLayout.setOrientation(1);
        kv kvVar = new kv(getContext(), r6Var.f36238a, a1Var);
        this.X = kvVar;
        linearLayout.addView(kvVar, w7.a6.t(-2, -2, 1, 0, 16, 0, 16));
        org.telegram.ui.Cells.z1 z1Var = null;
        int i11 = 0;
        for (int i12 = 8; i11 < i12; i12 = 8) {
            if (i11 == 0) {
                string = LocaleController.getString(R.string.LocalPhotoCache);
                i10 = org.telegram.ui.ActionBar.j6.lj;
            } else if (i11 == 1) {
                string = LocaleController.getString(R.string.LocalVideoCache);
                i10 = org.telegram.ui.ActionBar.j6.hj;
            } else if (i11 == 2) {
                string = LocaleController.getString(R.string.LocalDocumentCache);
                i10 = org.telegram.ui.ActionBar.j6.ij;
            } else if (i11 == 3) {
                string = LocaleController.getString(R.string.LocalMusicCache);
                i10 = org.telegram.ui.ActionBar.j6.jj;
            } else if (i11 == 4) {
                string = LocaleController.getString(R.string.LocalAudioCache);
                i10 = org.telegram.ui.ActionBar.j6.mj;
            } else if (i11 == 5) {
                string = LocaleController.getString(R.string.LocalStickersCache);
                i10 = org.telegram.ui.ActionBar.j6.nj;
            } else if (i11 == 7) {
                string = LocaleController.getString(R.string.LocalStoriesCache);
                i10 = org.telegram.ui.ActionBar.j6.oj;
            } else {
                string = LocaleController.getString(R.string.LocalMiscellaneousCache);
                i10 = org.telegram.ui.ActionBar.j6.pj;
            }
            String str = string;
            int i13 = i10;
            s6 s6Var = (s6) r6Var.d.get(i11);
            if (s6Var != null) {
                j3 = 0;
                j10 = s6Var.f36559a;
            } else {
                j3 = 0;
                j10 = 0;
            }
            if (j10 > j3) {
                org.telegram.ui.Components.oy0[] oy0VarArr = this.f34780b0;
                ?? obj = new Object();
                Paint paint = new Paint(1);
                obj.f25941b = paint;
                obj.f25942c = true;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                oy0VarArr[i11] = obj;
                org.telegram.ui.Components.oy0 oy0Var = this.f34780b0[i11];
                oy0Var.e = j10;
                oy0Var.f25940a = i13;
                org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(4, 21, parentActivity, null, false);
                z1Var2.setTag(Integer.valueOf(i11));
                z1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                this.f34782d0.addView(z1Var2, w7.a6.n(-1, 50));
                z1Var2.e(str, AndroidUtilities.formatFileSize(j10), true, true, false);
                z1Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false));
                int i14 = org.telegram.ui.ActionBar.j6.f18056k7;
                org.telegram.ui.Components.tp tpVar = z1Var2.f20773r;
                if (tpVar != null) {
                    tpVar.b(i13, i13, i14);
                }
                z1Var2.setOnClickListener(new org.telegram.ui.Components.u10(26, this, bVar));
                this.f34781c0[i11] = z1Var2;
                z1Var = z1Var2;
            } else {
                this.f34780b0[i11] = null;
                this.f34781c0[i11] = null;
            }
            i11++;
        }
        if (z1Var != null) {
            z1Var.setNeedDivider(false);
        }
        kv kvVar2 = this.X;
        org.telegram.ui.Components.oy0[] oy0VarArr2 = this.f34780b0;
        kvVar2.f26264b = oy0VarArr2;
        kvVar2.F = bVar;
        kvVar2.invalidate();
        kvVar2.f26265c = new float[oy0VarArr2.length];
        kvVar2.d = new float[oy0VarArr2.length];
        kvVar2.e = new float[oy0VarArr2.length];
        kvVar2.c(false);
        if (kvVar2.f26272y > 1) {
            kvVar2.f26266f = 0.0f;
        } else {
            kvVar2.f26266f = 1.0f;
        }
        v6 v6Var = new v6(this, getContext(), y6Var, 1);
        this.f34783e0 = v6Var;
        v6Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        v6Var.setCacheModel(bVar);
        v6Var.setDelegate(new n7.a1(this, bVar, false, 7));
        org.telegram.ui.Components.ua uaVar = this.f21454s;
        if (uaVar != null) {
            uaVar.setChildLayout(v6Var);
        } else {
            R();
            this.f34782d0.addView(this.f34779a0, w7.a6.q(-1, 72, 80));
        }
        if (this.f34779a0 != null) {
            this.f34779a0.a(this.X.a(), true);
        }
    }

    @Override
    public final void F(org.telegram.ui.Components.aw0 aw0Var) {
        this.d.j(new j3(this, 9));
        if (this.f21454s != null) {
            R();
            aw0Var.addView(this.f34779a0, w7.a6.e(-1, 72, 80));
        }
    }

    public final void R() {
        l6 l6Var = new l6(getContext());
        this.f34779a0 = l6Var;
        l6Var.f34543a.setOnClickListener(new a(this, 19));
        kv kvVar = this.X;
        if (kvVar != null) {
            this.f34779a0.a(kvVar.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.ul0 v(org.telegram.ui.Components.vl0 vl0Var) {
        return new jv(this);
    }

    @Override
    public final CharSequence y() {
        return this.f21452n.getMessagesController().getFullName(this.f34784f0);
    }
}
