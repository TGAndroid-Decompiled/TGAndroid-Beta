package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fv extends org.telegram.ui.Components.bb {
    public final ev X;
    public final r6 Y;
    public final o0.a Z;
    public k6 f33765a0;
    public final org.telegram.ui.Components.my0[] f33766b0;
    public final org.telegram.ui.Cells.a2[] f33767c0;
    public final LinearLayout f33768d0;
    public final w6 f33769e0;
    public final long f33770f0;
    public final zh.b f33771g0;

    public fv(z6 z6Var, r6 r6Var, zh.b bVar, o0.a aVar) {
        super((org.telegram.ui.ActionBar.m2) z6Var, false, !bVar.h(), (org.telegram.ui.ActionBar.d6) null);
        String string;
        int i10;
        long j3;
        long j10;
        this.f33766b0 = new org.telegram.ui.Components.my0[8];
        this.f33767c0 = new org.telegram.ui.Cells.a2[8];
        this.Z = aVar;
        this.Y = r6Var;
        this.f33771g0 = bVar;
        this.f33770f0 = r6Var.f37187a;
        this.allowNestedScroll = false;
        N();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = z6Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f33768d0 = linearLayout;
        linearLayout.setOrientation(1);
        ev evVar = new ev(getContext(), r6Var.f37187a, aVar);
        this.X = evVar;
        linearLayout.addView(evVar, w7.y5.t(-2, -2, 1, 0, 16, 0, 16));
        org.telegram.ui.Cells.a2 a2Var = null;
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
            s6 s6Var = (s6) r6Var.d.get(i11);
            if (s6Var != null) {
                j3 = 0;
                j10 = s6Var.f37600a;
            } else {
                j3 = 0;
                j10 = 0;
            }
            if (j10 > j3) {
                org.telegram.ui.Components.my0[] my0VarArr = this.f33766b0;
                ?? obj = new Object();
                Paint paint = new Paint(1);
                obj.f26594b = paint;
                obj.f26595c = true;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                my0VarArr[i11] = obj;
                org.telegram.ui.Components.my0 my0Var = this.f33766b0[i11];
                my0Var.e = j10;
                my0Var.f26593a = i13;
                org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(4, 21, parentActivity, null, false);
                a2Var2.setTag(Integer.valueOf(i11));
                a2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(false));
                this.f33768d0.addView(a2Var2, w7.y5.n(-1, 50));
                a2Var2.e(str, AndroidUtilities.formatFileSize(j10), true, true, false);
                a2Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19166j5, false));
                int i14 = org.telegram.ui.ActionBar.h6.f19188k7;
                org.telegram.ui.Components.op opVar = a2Var2.f20011r;
                if (opVar != null) {
                    opVar.b(i13, i13, i14);
                }
                a2Var2.setOnClickListener(new org.telegram.ui.Components.et(29, this, bVar));
                this.f33767c0[i11] = a2Var2;
                a2Var = a2Var2;
            } else {
                this.f33766b0[i11] = null;
                this.f33767c0[i11] = null;
            }
            i11++;
        }
        if (a2Var != null) {
            a2Var.setNeedDivider(false);
        }
        ev evVar2 = this.X;
        org.telegram.ui.Components.my0[] my0VarArr2 = this.f33766b0;
        evVar2.f26826b = my0VarArr2;
        evVar2.F = bVar;
        evVar2.invalidate();
        evVar2.f26827c = new float[my0VarArr2.length];
        evVar2.d = new float[my0VarArr2.length];
        evVar2.e = new float[my0VarArr2.length];
        evVar2.c(false);
        if (evVar2.f26834y > 1) {
            evVar2.f26828f = 0.0f;
        } else {
            evVar2.f26828f = 1.0f;
        }
        w6 w6Var = new w6(this, getContext(), z6Var, 1);
        this.f33769e0 = w6Var;
        w6Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        w6Var.setCacheModel(bVar);
        w6Var.setDelegate(new o0.a(this, bVar, false, 5));
        org.telegram.ui.Components.va vaVar = this.f22960s;
        if (vaVar != null) {
            vaVar.setChildLayout(w6Var);
        } else {
            R();
            this.f33768d0.addView(this.f33765a0, w7.y5.q(-1, 72, 80));
        }
        if (this.f33765a0 != null) {
            this.f33765a0.a(this.X.a(), true);
        }
    }

    @Override
    public final void G(org.telegram.ui.Components.aw0 aw0Var) {
        this.d.j(new i3(this, 9));
        if (this.f22960s != null) {
            R();
            aw0Var.addView(this.f33765a0, w7.y5.e(-1, 72, 80));
        }
    }

    public final void R() {
        k6 k6Var = new k6(getContext());
        this.f33765a0 = k6Var;
        k6Var.f34946a.setOnClickListener(new a(this, 19));
        ev evVar = this.X;
        if (evVar != null) {
            this.f33765a0.a(evVar.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.vl0 v(org.telegram.ui.Components.wl0 wl0Var) {
        return new dv(this);
    }

    @Override
    public final CharSequence y() {
        return this.f22958n.getMessagesController().getFullName(this.f33770f0);
    }
}
