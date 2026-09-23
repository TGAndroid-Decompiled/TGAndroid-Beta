package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gv extends org.telegram.ui.Components.bb {
    public final fv X;
    public final s6 Y;
    public final o0.a Z;
    public l6 f33660a0;
    public final org.telegram.ui.Components.by0[] f33661b0;
    public final org.telegram.ui.Cells.z1[] f33662c0;
    public final LinearLayout f33663d0;
    public final w6 f33664e0;
    public final long f33665f0;
    public final zh.b f33666g0;

    public gv(z6 z6Var, s6 s6Var, zh.b bVar, o0.a aVar) {
        super((org.telegram.ui.ActionBar.n2) z6Var, false, !bVar.h(), (org.telegram.ui.ActionBar.d6) null);
        String string;
        int i10;
        long j3;
        long j10;
        this.f33661b0 = new org.telegram.ui.Components.by0[8];
        this.f33662c0 = new org.telegram.ui.Cells.z1[8];
        this.Z = aVar;
        this.Y = s6Var;
        this.f33666g0 = bVar;
        this.f33665f0 = s6Var.f37130a;
        this.allowNestedScroll = false;
        N();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = z6Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f33663d0 = linearLayout;
        linearLayout.setOrientation(1);
        fv fvVar = new fv(getContext(), s6Var.f37130a, aVar);
        this.X = fvVar;
        linearLayout.addView(fvVar, w7.x5.t(-2, -2, 1, 0, 16, 0, 16));
        org.telegram.ui.Cells.z1 z1Var = null;
        int i11 = 0;
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
            t6 t6Var = (t6) s6Var.d.get(i11);
            if (t6Var != null) {
                j3 = 0;
                j10 = t6Var.f37537a;
            } else {
                j3 = 0;
                j10 = 0;
            }
            if (j10 > j3) {
                org.telegram.ui.Components.by0[] by0VarArr = this.f33661b0;
                ?? obj = new Object();
                Paint paint = new Paint(1);
                obj.f22861b = paint;
                obj.f22862c = true;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                by0VarArr[i11] = obj;
                org.telegram.ui.Components.by0 by0Var = this.f33661b0[i11];
                by0Var.e = j10;
                by0Var.f22860a = i13;
                org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(4, 21, parentActivity, null, false);
                z1Var2.setTag(Integer.valueOf(i11));
                z1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(false));
                this.f33663d0.addView(z1Var2, w7.x5.n(-1, 50));
                z1Var2.e(str, AndroidUtilities.formatFileSize(j10), true, true, false);
                z1Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18895j5, false));
                int i14 = org.telegram.ui.ActionBar.h6.f18917k7;
                org.telegram.ui.Components.op opVar = z1Var2.f21659r;
                if (opVar != null) {
                    opVar.b(i13, i13, i14);
                }
                z1Var2.setOnClickListener(new org.telegram.ui.Components.et(29, this, bVar));
                this.f33662c0[i11] = z1Var2;
                z1Var = z1Var2;
            } else {
                this.f33661b0[i11] = null;
                this.f33662c0[i11] = null;
            }
            i11++;
        }
        if (z1Var != null) {
            z1Var.setNeedDivider(false);
        }
        fv fvVar2 = this.X;
        org.telegram.ui.Components.by0[] by0VarArr2 = this.f33661b0;
        fvVar2.f23138b = by0VarArr2;
        fvVar2.F = bVar;
        fvVar2.invalidate();
        fvVar2.f23139c = new float[by0VarArr2.length];
        fvVar2.d = new float[by0VarArr2.length];
        fvVar2.e = new float[by0VarArr2.length];
        fvVar2.c(false);
        if (fvVar2.f23146y > 1) {
            fvVar2.f23140f = 0.0f;
        } else {
            fvVar2.f23140f = 1.0f;
        }
        w6 w6Var = new w6(this, getContext(), z6Var, 1);
        this.f33664e0 = w6Var;
        w6Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        w6Var.setCacheModel(bVar);
        w6Var.setDelegate(new o0.a(this, bVar, false, 5));
        org.telegram.ui.Components.va vaVar = this.f22663s;
        if (vaVar != null) {
            vaVar.setChildLayout(w6Var);
        } else {
            R();
            this.f33663d0.addView(this.f33660a0, w7.x5.q(-1, 72, 80));
        }
        if (this.f33660a0 != null) {
            this.f33660a0.a(this.X.a(), true);
        }
    }

    @Override
    public final void G(org.telegram.ui.Components.pv0 pv0Var) {
        this.d.j(new i3(this, 9));
        if (this.f22663s != null) {
            R();
            pv0Var.addView(this.f33660a0, w7.x5.e(-1, 72, 80));
        }
    }

    public final void R() {
        l6 l6Var = new l6(getContext());
        this.f33660a0 = l6Var;
        l6Var.f34865a.setOnClickListener(new a(this, 19));
        fv fvVar = this.X;
        if (fvVar != null) {
            this.f33660a0.a(fvVar.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.ll0 v(org.telegram.ui.Components.ml0 ml0Var) {
        return new ev(this);
    }

    @Override
    public final CharSequence y() {
        return this.f22661n.getMessagesController().getFullName(this.f33665f0);
    }
}
