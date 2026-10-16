package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ov extends org.telegram.ui.Components.db {
    public final nv X;
    public final w6 Y;
    public final n3.b Z;
    public o6 f38751a0;
    public final org.telegram.ui.Components.az0[] f38752b0;
    public final org.telegram.ui.Cells.a2[] f38753c0;
    public final LinearLayout f38754d0;
    public final a7 f38755e0;
    public final long f38756f0;
    public final ai.c f38757g0;

    public ov(d7 d7Var, w6 w6Var, ai.c cVar, n3.b bVar) {
        super((org.telegram.ui.ActionBar.m2) d7Var, false, !cVar.h(), (org.telegram.ui.ActionBar.c6) null);
        String string;
        int i10;
        long j10;
        long j11;
        this.f38752b0 = new org.telegram.ui.Components.az0[8];
        this.f38753c0 = new org.telegram.ui.Cells.a2[8];
        this.Z = bVar;
        this.Y = w6Var;
        this.f38757g0 = cVar;
        this.f38756f0 = w6Var.f40870a;
        this.allowNestedScroll = false;
        O();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = d7Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f38754d0 = linearLayout;
        linearLayout.setOrientation(1);
        nv nvVar = new nv(getContext(), w6Var.f40870a, bVar);
        this.X = nvVar;
        linearLayout.addView(nvVar, w7.z5.t(-2, -2, 1, 0, 16, 0, 16));
        int i11 = 0;
        org.telegram.ui.Cells.a2 a2Var = null;
        for (int i12 = 8; i11 < i12; i12 = 8) {
            if (i11 == 0) {
                string = LocaleController.getString(R.string.LocalPhotoCache);
                i10 = org.telegram.ui.ActionBar.g6.lj;
            } else if (i11 == 1) {
                string = LocaleController.getString(R.string.LocalVideoCache);
                i10 = org.telegram.ui.ActionBar.g6.hj;
            } else if (i11 == 2) {
                string = LocaleController.getString(R.string.LocalDocumentCache);
                i10 = org.telegram.ui.ActionBar.g6.ij;
            } else if (i11 == 3) {
                string = LocaleController.getString(R.string.LocalMusicCache);
                i10 = org.telegram.ui.ActionBar.g6.jj;
            } else if (i11 == 4) {
                string = LocaleController.getString(R.string.LocalAudioCache);
                i10 = org.telegram.ui.ActionBar.g6.mj;
            } else if (i11 == 5) {
                string = LocaleController.getString(R.string.LocalStickersCache);
                i10 = org.telegram.ui.ActionBar.g6.nj;
            } else if (i11 == 7) {
                string = LocaleController.getString(R.string.LocalStoriesCache);
                i10 = org.telegram.ui.ActionBar.g6.oj;
            } else {
                string = LocaleController.getString(R.string.LocalMiscellaneousCache);
                i10 = org.telegram.ui.ActionBar.g6.pj;
            }
            String str = string;
            int i13 = i10;
            x6 x6Var = (x6) w6Var.d.get(i11);
            if (x6Var != null) {
                j10 = 0;
                j11 = x6Var.f41444a;
            } else {
                j10 = 0;
                j11 = 0;
            }
            if (j11 > j10) {
                org.telegram.ui.Components.az0[] az0VarArr = this.f38752b0;
                ?? obj = new Object();
                Paint paint = new Paint(1);
                obj.e = paint;
                obj.f23328c = true;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                az0VarArr[i11] = obj;
                org.telegram.ui.Components.az0 az0Var = this.f38752b0[i11];
                az0Var.f23326a = j11;
                az0Var.f23327b = i13;
                org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(4, 21, parentActivity, null, false);
                a2Var2.setTag(Integer.valueOf(i11));
                a2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(false));
                this.f38754d0.addView(a2Var2, w7.z5.n(-1, 50));
                a2Var2.e(str, AndroidUtilities.formatFileSize(j11), true, true, false);
                a2Var2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19707j5, false));
                int i14 = org.telegram.ui.ActionBar.g6.f19729k7;
                org.telegram.ui.Components.aq aqVar = a2Var2.f20599r;
                if (aqVar != null) {
                    aqVar.b(i13, i13, i14);
                }
                a2Var2.setOnClickListener(new org.telegram.ui.Components.rt(29, this, cVar));
                this.f38753c0[i11] = a2Var2;
                a2Var = a2Var2;
            } else {
                this.f38752b0[i11] = null;
                this.f38753c0[i11] = null;
            }
            i11++;
        }
        if (a2Var != null) {
            a2Var.setNeedDivider(false);
        }
        nv nvVar2 = this.X;
        org.telegram.ui.Components.az0[] az0VarArr2 = this.f38752b0;
        nvVar2.f23577b = az0VarArr2;
        nvVar2.F = cVar;
        nvVar2.invalidate();
        nvVar2.f23578c = new float[az0VarArr2.length];
        nvVar2.d = new float[az0VarArr2.length];
        nvVar2.e = new float[az0VarArr2.length];
        nvVar2.c(false);
        if (nvVar2.f23585y > 1) {
            nvVar2.f23579f = 0.0f;
        } else {
            nvVar2.f23579f = 1.0f;
        }
        a7 a7Var = new a7(this, getContext(), d7Var, 1);
        this.f38755e0 = a7Var;
        a7Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        a7Var.setCacheModel(cVar);
        a7Var.setDelegate(new m2.t(this, cVar, false, 13));
        org.telegram.ui.Components.xa xaVar = this.f24072s;
        if (xaVar != null) {
            xaVar.setChildLayout(a7Var);
        } else {
            S();
            this.f38754d0.addView(this.f38751a0, w7.z5.q(-1, 72, 80));
        }
        if (this.f38751a0 != null) {
            this.f38751a0.a(this.X.a(), true);
        }
    }

    @Override
    public final CharSequence B() {
        return this.f24070n.getMessagesController().getFullName(this.f38756f0);
    }

    @Override
    public final void H(org.telegram.ui.Components.ow0 ow0Var) {
        this.d.j(new k3(this, 9));
        if (this.f24072s != null) {
            S();
            ow0Var.addView(this.f38751a0, w7.z5.e(-1, 72, 80));
        }
    }

    public final void S() {
        o6 o6Var = new o6(getContext());
        this.f38751a0 = o6Var;
        o6Var.f38553a.setOnClickListener(new a(this, 18));
        nv nvVar = this.X;
        if (nvVar != null) {
            this.f38751a0.a(nvVar.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.lm0 x(org.telegram.ui.Components.mm0 mm0Var) {
        return new mv(this);
    }
}
