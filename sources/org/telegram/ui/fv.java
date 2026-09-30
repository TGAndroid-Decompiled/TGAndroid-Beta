package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fv extends org.telegram.ui.Components.cb {
    public final ev X;
    public final r6 Y;
    public final o0.a Z;
    public k6 f33905a0;
    public final org.telegram.ui.Components.py0[] f33906b0;
    public final org.telegram.ui.Cells.a2[] f33907c0;
    public final LinearLayout f33908d0;
    public final w6 f33909e0;
    public final long f33910f0;
    public final zh.b f33911g0;

    public fv(z6 z6Var, r6 r6Var, zh.b bVar, o0.a aVar) {
        super((org.telegram.ui.ActionBar.m2) z6Var, false, !bVar.h(), (org.telegram.ui.ActionBar.d6) null);
        String string;
        int i10;
        long j3;
        long j10;
        this.f33906b0 = new org.telegram.ui.Components.py0[8];
        this.f33907c0 = new org.telegram.ui.Cells.a2[8];
        this.Z = aVar;
        this.Y = r6Var;
        this.f33911g0 = bVar;
        this.f33910f0 = r6Var.f37288a;
        this.allowNestedScroll = false;
        N();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = z6Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f33908d0 = linearLayout;
        linearLayout.setOrientation(1);
        ev evVar = new ev(getContext(), r6Var.f37288a, aVar);
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
                j10 = s6Var.f37695a;
            } else {
                j3 = 0;
                j10 = 0;
            }
            if (j10 > j3) {
                org.telegram.ui.Components.py0[] py0VarArr = this.f33906b0;
                ?? obj = new Object();
                Paint paint = new Paint(1);
                obj.f27487b = paint;
                obj.f27488c = true;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                py0VarArr[i11] = obj;
                org.telegram.ui.Components.py0 py0Var = this.f33906b0[i11];
                py0Var.e = j10;
                py0Var.f27486a = i13;
                org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(4, 21, parentActivity, null, false);
                a2Var2.setTag(Integer.valueOf(i11));
                a2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(false));
                this.f33908d0.addView(a2Var2, w7.y5.n(-1, 50));
                a2Var2.e(str, AndroidUtilities.formatFileSize(j10), true, true, false);
                a2Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19182j5, false));
                int i14 = org.telegram.ui.ActionBar.h6.f19204k7;
                org.telegram.ui.Components.qp qpVar = a2Var2.f20027r;
                if (qpVar != null) {
                    qpVar.b(i13, i13, i14);
                }
                a2Var2.setOnClickListener(new org.telegram.ui.Components.gt(29, this, bVar));
                this.f33907c0[i11] = a2Var2;
                a2Var = a2Var2;
            } else {
                this.f33906b0[i11] = null;
                this.f33907c0[i11] = null;
            }
            i11++;
        }
        if (a2Var != null) {
            a2Var.setNeedDivider(false);
        }
        ev evVar2 = this.X;
        org.telegram.ui.Components.py0[] py0VarArr2 = this.f33906b0;
        evVar2.f27759b = py0VarArr2;
        evVar2.F = bVar;
        evVar2.invalidate();
        evVar2.f27760c = new float[py0VarArr2.length];
        evVar2.d = new float[py0VarArr2.length];
        evVar2.e = new float[py0VarArr2.length];
        evVar2.c(false);
        if (evVar2.f27767y > 1) {
            evVar2.f27761f = 0.0f;
        } else {
            evVar2.f27761f = 1.0f;
        }
        w6 w6Var = new w6(this, getContext(), z6Var, 1);
        this.f33909e0 = w6Var;
        w6Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        w6Var.setCacheModel(bVar);
        w6Var.setDelegate(new o0.a(this, bVar, false, 5));
        org.telegram.ui.Components.wa waVar = this.f23243s;
        if (waVar != null) {
            waVar.setChildLayout(w6Var);
        } else {
            R();
            this.f33908d0.addView(this.f33905a0, w7.y5.q(-1, 72, 80));
        }
        if (this.f33905a0 != null) {
            this.f33905a0.a(this.X.a(), true);
        }
    }

    @Override
    public final void G(org.telegram.ui.Components.dw0 dw0Var) {
        this.d.j(new i3(this, 9));
        if (this.f23243s != null) {
            R();
            dw0Var.addView(this.f33905a0, w7.y5.e(-1, 72, 80));
        }
    }

    public final void R() {
        k6 k6Var = new k6(getContext());
        this.f33905a0 = k6Var;
        k6Var.f35035a.setOnClickListener(new a(this, 19));
        ev evVar = this.X;
        if (evVar != null) {
            this.f33905a0.a(evVar.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.yl0 v(org.telegram.ui.Components.zl0 zl0Var) {
        return new dv(this);
    }

    @Override
    public final CharSequence y() {
        return this.f23241n.getMessagesController().getFullName(this.f33910f0);
    }
}
