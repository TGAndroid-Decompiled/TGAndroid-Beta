package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lv extends org.telegram.ui.Components.za {
    public final kv X;
    public final t6 Y;
    public final o0.a Z;
    public m6 f35633a0;
    public final org.telegram.ui.Components.dy0[] f35634b0;
    public final org.telegram.ui.Cells.z1[] f35635c0;
    public final LinearLayout f35636d0;
    public final x6 f35637e0;
    public final long f35638f0;
    public final zh.b f35639g0;

    public lv(a7 a7Var, t6 t6Var, zh.b bVar, o0.a aVar) {
        super((org.telegram.ui.ActionBar.o2) a7Var, false, !bVar.h(), (org.telegram.ui.ActionBar.f6) null);
        String string;
        int i10;
        long j3;
        long j10;
        this.f35634b0 = new org.telegram.ui.Components.dy0[8];
        this.f35635c0 = new org.telegram.ui.Cells.z1[8];
        this.Z = aVar;
        this.Y = t6Var;
        this.f35639g0 = bVar;
        this.f35638f0 = t6Var.f37672a;
        this.allowNestedScroll = false;
        N();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = a7Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f35636d0 = linearLayout;
        linearLayout.setOrientation(1);
        kv kvVar = new kv(getContext(), t6Var.f37672a, aVar);
        this.X = kvVar;
        linearLayout.addView(kvVar, w7.x5.t(-2, -2, 1, 0, 16, 0, 16));
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
            u6 u6Var = (u6) t6Var.d.get(i11);
            if (u6Var != null) {
                j3 = 0;
                j10 = u6Var.f37948a;
            } else {
                j3 = 0;
                j10 = 0;
            }
            if (j10 > j3) {
                org.telegram.ui.Components.dy0[] dy0VarArr = this.f35634b0;
                ?? obj = new Object();
                Paint paint = new Paint(1);
                obj.f23406b = paint;
                obj.f23407c = true;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                dy0VarArr[i11] = obj;
                org.telegram.ui.Components.dy0 dy0Var = this.f35634b0[i11];
                dy0Var.e = j10;
                dy0Var.f23405a = i13;
                org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(4, 21, parentActivity, null, false);
                z1Var2.setTag(Integer.valueOf(i11));
                z1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                this.f35636d0.addView(z1Var2, w7.x5.n(-1, 50));
                z1Var2.e(str, AndroidUtilities.formatFileSize(j10), true, true, false);
                z1Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18970j5, false));
                int i14 = org.telegram.ui.ActionBar.j6.f18992k7;
                org.telegram.ui.Components.np npVar = z1Var2.f21688r;
                if (npVar != null) {
                    npVar.b(i13, i13, i14);
                }
                z1Var2.setOnClickListener(new org.telegram.ui.Components.dt(29, this, bVar));
                this.f35635c0[i11] = z1Var2;
                z1Var = z1Var2;
            } else {
                this.f35634b0[i11] = null;
                this.f35635c0[i11] = null;
            }
            i11++;
        }
        if (z1Var != null) {
            z1Var.setNeedDivider(false);
        }
        kv kvVar2 = this.X;
        org.telegram.ui.Components.dy0[] dy0VarArr2 = this.f35634b0;
        kvVar2.f23695b = dy0VarArr2;
        kvVar2.F = bVar;
        kvVar2.invalidate();
        kvVar2.f23696c = new float[dy0VarArr2.length];
        kvVar2.d = new float[dy0VarArr2.length];
        kvVar2.e = new float[dy0VarArr2.length];
        kvVar2.c(false);
        if (kvVar2.f23703y > 1) {
            kvVar2.f23697f = 0.0f;
        } else {
            kvVar2.f23697f = 1.0f;
        }
        x6 x6Var = new x6(this, getContext(), a7Var);
        this.f35637e0 = x6Var;
        x6Var.c(0, AndroidUtilities.dp(80.0f));
        x6Var.setCacheModel(bVar);
        x6Var.setDelegate(new o0.a(this, bVar, false, 5));
        org.telegram.ui.Components.ta taVar = this.f30456s;
        if (taVar != null) {
            taVar.setChildLayout(x6Var);
        } else {
            R();
            this.f35636d0.addView(this.f35633a0, w7.x5.q(-1, 72, 80));
        }
        if (this.f35633a0 != null) {
            this.f35633a0.a(this.X.a(), true);
        }
    }

    @Override
    public final void G(org.telegram.ui.Components.qv0 qv0Var) {
        this.d.j(new h3(this, 9));
        if (this.f30456s != null) {
            R();
            qv0Var.addView(this.f35633a0, w7.x5.e(-1, 72, 80));
        }
    }

    public final void R() {
        m6 m6Var = new m6(getContext());
        this.f35633a0 = m6Var;
        m6Var.f35695a.setOnClickListener(new a(this, 19));
        kv kvVar = this.X;
        if (kvVar != null) {
            this.f35633a0.a(kvVar.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.ll0 v(org.telegram.ui.Components.ml0 ml0Var) {
        return new jv(this);
    }

    @Override
    public final CharSequence y() {
        return this.f30454n.getMessagesController().getFullName(this.f35638f0);
    }
}
