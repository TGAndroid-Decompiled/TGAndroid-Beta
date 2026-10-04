package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jv extends org.telegram.ui.Components.cb {
    public final iv X;
    public final u6 Y;
    public final o0.a Z;
    public n6 f37768a0;
    public final org.telegram.ui.Components.xy0[] f37769b0;
    public final org.telegram.ui.Cells.a2[] f37770c0;
    public final LinearLayout f37771d0;
    public final k6 f37772e0;
    public final long f37773f0;
    public final zh.b f37774g0;

    public jv(a7 a7Var, u6 u6Var, zh.b bVar, o0.a aVar) {
        super((org.telegram.ui.ActionBar.n2) a7Var, false, !bVar.h(), (org.telegram.ui.ActionBar.d6) null);
        String string;
        int i10;
        long j3;
        long j10;
        this.f37769b0 = new org.telegram.ui.Components.xy0[8];
        this.f37770c0 = new org.telegram.ui.Cells.a2[8];
        this.Z = aVar;
        this.Y = u6Var;
        this.f37774g0 = bVar;
        this.f37773f0 = u6Var.f41066a;
        this.allowNestedScroll = false;
        L();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = a7Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f37771d0 = linearLayout;
        linearLayout.setOrientation(1);
        iv ivVar = new iv(getContext(), u6Var.f41066a, aVar);
        this.X = ivVar;
        linearLayout.addView(ivVar, w7.z5.t(-2, -2, 1, 0, 16, 0, 16));
        org.telegram.ui.Cells.a2 a2Var = null;
        int i11 = 0;
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
            v6 v6Var = (v6) u6Var.d.get(i11);
            if (v6Var != null) {
                j3 = 0;
                j10 = v6Var.f41565a;
            } else {
                j3 = 0;
                j10 = 0;
            }
            if (j10 > j3) {
                org.telegram.ui.Components.xy0[] xy0VarArr = this.f37769b0;
                ?? obj = new Object();
                Paint paint = new Paint(1);
                obj.f32997b = paint;
                obj.f32998c = true;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                xy0VarArr[i11] = obj;
                org.telegram.ui.Components.xy0 xy0Var = this.f37769b0[i11];
                xy0Var.f32999e = j10;
                xy0Var.f32996a = i13;
                org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(4, 21, parentActivity, null, false);
                a2Var2.setTag(Integer.valueOf(i11));
                a2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.K0(false));
                this.f37771d0.addView(a2Var2, w7.z5.n(-1, 50));
                a2Var2.e(str, AndroidUtilities.formatFileSize(j10), true, true, false);
                a2Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20926j5, false));
                int i14 = org.telegram.ui.ActionBar.i6.f20948k7;
                org.telegram.ui.Components.qp qpVar = a2Var2.f21781r;
                if (qpVar != null) {
                    qpVar.b(i13, i13, i14);
                }
                a2Var2.setOnClickListener(new org.telegram.ui.Components.gt(29, this, bVar));
                this.f37770c0[i11] = a2Var2;
                a2Var = a2Var2;
            } else {
                this.f37769b0[i11] = null;
                this.f37770c0[i11] = null;
            }
            i11++;
        }
        if (a2Var != null) {
            a2Var.setNeedDivider(false);
        }
        iv ivVar2 = this.X;
        org.telegram.ui.Components.xy0[] xy0VarArr2 = this.f37769b0;
        ivVar2.f33281b = xy0VarArr2;
        ivVar2.F = bVar;
        ivVar2.invalidate();
        ivVar2.f33282c = new float[xy0VarArr2.length];
        ivVar2.d = new float[xy0VarArr2.length];
        ivVar2.f33283e = new float[xy0VarArr2.length];
        ivVar2.c(false);
        if (ivVar2.f33290y > 1) {
            ivVar2.f33284f = 0.0f;
        } else {
            ivVar2.f33284f = 1.0f;
        }
        k6 k6Var = new k6(this, getContext(), a7Var);
        this.f37772e0 = k6Var;
        int dp = AndroidUtilities.dp(80.0f);
        if (k6Var.v == null) {
            k6Var.f41577s = dp;
            int i15 = 0;
            while (true) {
                org.telegram.ui.Components.g91 g91Var = k6Var.h;
                if (i15 >= g91Var.getViewPages().length) {
                    break;
                }
                org.telegram.ui.Components.zl0 c10 = v7.c(g91Var.getViewPages()[i15]);
                if (c10 != null) {
                    c10.setPadding(c10.getPaddingLeft(), 0, c10.getPaddingRight(), dp);
                }
                i15++;
            }
        }
        this.f37772e0.setCacheModel(bVar);
        this.f37772e0.setDelegate(new o0.a(this, bVar, false, 5));
        org.telegram.ui.Components.wa waVar = this.f25306s;
        if (waVar != null) {
            waVar.setChildLayout(this.f37772e0);
        } else {
            P();
            this.f37771d0.addView(this.f37768a0, w7.z5.q(-1, 72, 80));
        }
        if (this.f37768a0 != null) {
            this.f37768a0.a(this.X.a(), true);
        }
    }

    @Override
    public final void E(org.telegram.ui.Components.lw0 lw0Var) {
        this.d.j(new i3(this, 10));
        if (this.f25306s != null) {
            P();
            lw0Var.addView(this.f37768a0, w7.z5.e(-1, 72, 80));
        }
    }

    public final void P() {
        n6 n6Var = new n6(getContext());
        this.f37768a0 = n6Var;
        n6Var.f38824a.setOnClickListener(new a(this, 19));
        iv ivVar = this.X;
        if (ivVar != null) {
            this.f37768a0.a(ivVar.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.yl0 v(org.telegram.ui.Components.zl0 zl0Var) {
        return new hv(this);
    }

    @Override
    public final CharSequence y() {
        return this.f25304n.getMessagesController().getFullName(this.f37773f0);
    }
}
