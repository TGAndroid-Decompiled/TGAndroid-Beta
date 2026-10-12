package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lv extends org.telegram.ui.Components.db {
    public final kv X;
    public final u6 Y;
    public final n6.k Z;
    public n6 f39848a0;
    public final org.telegram.ui.Components.jz0[] f39849b0;
    public final org.telegram.ui.Cells.a2[] f39850c0;
    public final LinearLayout f39851d0;
    public final y6 f39852e0;
    public final long f39853f0;
    public final zh.b f39854g0;

    public lv(b7 b7Var, u6 u6Var, zh.b bVar, n6.k kVar) {
        super((org.telegram.ui.ActionBar.m2) b7Var, false, !bVar.h(), (org.telegram.ui.ActionBar.c6) null);
        String string;
        int i10;
        long j3;
        long j10;
        this.f39849b0 = new org.telegram.ui.Components.jz0[8];
        this.f39850c0 = new org.telegram.ui.Cells.a2[8];
        this.Z = kVar;
        this.Y = u6Var;
        this.f39854g0 = bVar;
        this.f39853f0 = u6Var.f42373a;
        this.allowNestedScroll = false;
        O();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = b7Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f39851d0 = linearLayout;
        linearLayout.setOrientation(1);
        kv kvVar = new kv(getContext(), u6Var.f42373a, kVar);
        this.X = kvVar;
        linearLayout.addView(kvVar, w7.w5.t(-2, -2, 1, 0, 16, 0, 16));
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
            v6 v6Var = (v6) u6Var.d.get(i11);
            if (v6Var != null) {
                j3 = 0;
                j10 = v6Var.f42690a;
            } else {
                j3 = 0;
                j10 = 0;
            }
            if (j10 > j3) {
                org.telegram.ui.Components.jz0[] jz0VarArr = this.f39849b0;
                ?? obj = new Object();
                Paint paint = new Paint(1);
                obj.f27686e = paint;
                obj.f27685c = true;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                jz0VarArr[i11] = obj;
                org.telegram.ui.Components.jz0 jz0Var = this.f39849b0[i11];
                jz0Var.f27683a = j10;
                jz0Var.f27684b = i13;
                org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(4, 21, parentActivity, null, false);
                a2Var2.setTag(Integer.valueOf(i11));
                a2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(false));
                this.f39851d0.addView(a2Var2, w7.w5.n(-1, 50));
                a2Var2.e(str, AndroidUtilities.formatFileSize(j10), true, true, false);
                a2Var2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20668j5, false));
                int i14 = org.telegram.ui.ActionBar.h6.f20689k7;
                org.telegram.ui.Components.fq fqVar = a2Var2.f21553r;
                if (fqVar != null) {
                    fqVar.b(i13, i13, i14);
                }
                a2Var2.setOnClickListener(new org.telegram.ui.Components.xt(29, this, bVar));
                this.f39850c0[i11] = a2Var2;
                a2Var = a2Var2;
            } else {
                this.f39849b0[i11] = null;
                this.f39850c0[i11] = null;
            }
            i11++;
        }
        if (a2Var != null) {
            a2Var.setNeedDivider(false);
        }
        kv kvVar2 = this.X;
        org.telegram.ui.Components.jz0[] jz0VarArr2 = this.f39849b0;
        kvVar2.f27953b = jz0VarArr2;
        kvVar2.F = bVar;
        kvVar2.invalidate();
        kvVar2.f27954c = new float[jz0VarArr2.length];
        kvVar2.d = new float[jz0VarArr2.length];
        kvVar2.f27955e = new float[jz0VarArr2.length];
        kvVar2.c(false);
        if (kvVar2.f27962y > 1) {
            kvVar2.f27956f = 0.0f;
        } else {
            kvVar2.f27956f = 1.0f;
        }
        y6 y6Var = new y6(this, getContext(), b7Var, 1);
        this.f39852e0 = y6Var;
        y6Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        y6Var.setCacheModel(bVar);
        y6Var.setDelegate(new n7.z0(this, bVar, false, 5));
        org.telegram.ui.Components.xa xaVar = this.f25291s;
        if (xaVar != null) {
            xaVar.setChildLayout(y6Var);
        } else {
            S();
            this.f39851d0.addView(this.f39848a0, w7.w5.q(-1, 72, 80));
        }
        if (this.f39848a0 != null) {
            this.f39848a0.a(this.X.a(), true);
        }
    }

    @Override
    public final CharSequence A() {
        return this.f25289n.getMessagesController().getFullName(this.f39853f0);
    }

    @Override
    public final void H(org.telegram.ui.Components.yw0 yw0Var) {
        this.d.j(new i3(this, 9));
        if (this.f25291s != null) {
            S();
            yw0Var.addView(this.f39848a0, w7.w5.e(-1, 72, 80));
        }
    }

    public final void S() {
        n6 n6Var = new n6(getContext());
        this.f39848a0 = n6Var;
        n6Var.f40235a.setOnClickListener(new a(this, 18));
        kv kvVar = this.X;
        if (kvVar != null) {
            this.f39848a0.a(kvVar.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.vm0 x(org.telegram.ui.Components.wm0 wm0Var) {
        return new jv(this);
    }
}
