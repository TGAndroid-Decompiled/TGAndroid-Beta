package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jv extends org.telegram.ui.Components.za {
    public final iv X;
    public final s6 Y;
    public final o0.a Z;
    public l6 f34990a0;
    public final org.telegram.ui.Components.cy0[] f34991b0;
    public final org.telegram.ui.Cells.z1[] f34992c0;
    public final LinearLayout f34993d0;
    public final w6 f34994e0;
    public final long f34995f0;
    public final zh.b f34996g0;

    public jv(z6 z6Var, s6 s6Var, zh.b bVar, o0.a aVar) {
        super((org.telegram.ui.ActionBar.n2) z6Var, false, !bVar.h(), (org.telegram.ui.ActionBar.e6) null);
        String string;
        int i10;
        long j3;
        long j10;
        this.f34991b0 = new org.telegram.ui.Components.cy0[8];
        this.f34992c0 = new org.telegram.ui.Cells.z1[8];
        this.Z = aVar;
        this.Y = s6Var;
        this.f34996g0 = bVar;
        this.f34995f0 = s6Var.f37274a;
        this.allowNestedScroll = false;
        N();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = z6Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f34993d0 = linearLayout;
        linearLayout.setOrientation(1);
        iv ivVar = new iv(getContext(), s6Var.f37274a, aVar);
        this.X = ivVar;
        linearLayout.addView(ivVar, w7.x5.t(-2, -2, 1, 0, 16, 0, 16));
        org.telegram.ui.Cells.z1 z1Var = null;
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
            t6 t6Var = (t6) s6Var.d.get(i11);
            if (t6Var != null) {
                j3 = 0;
                j10 = t6Var.f37576a;
            } else {
                j3 = 0;
                j10 = 0;
            }
            if (j10 > j3) {
                org.telegram.ui.Components.cy0[] cy0VarArr = this.f34991b0;
                ?? obj = new Object();
                Paint paint = new Paint(1);
                obj.f23163b = paint;
                obj.f23164c = true;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                cy0VarArr[i11] = obj;
                org.telegram.ui.Components.cy0 cy0Var = this.f34991b0[i11];
                cy0Var.e = j10;
                cy0Var.f23162a = i13;
                org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(4, 21, parentActivity, null, false);
                z1Var2.setTag(Integer.valueOf(i11));
                z1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.K0(false));
                this.f34993d0.addView(z1Var2, w7.x5.n(-1, 50));
                z1Var2.e(str, AndroidUtilities.formatFileSize(j10), true, true, false);
                z1Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18940j5, false));
                int i14 = org.telegram.ui.ActionBar.i6.f18962k7;
                org.telegram.ui.Components.np npVar = z1Var2.f21672r;
                if (npVar != null) {
                    npVar.b(i13, i13, i14);
                }
                z1Var2.setOnClickListener(new org.telegram.ui.Components.dt(29, this, bVar));
                this.f34992c0[i11] = z1Var2;
                z1Var = z1Var2;
            } else {
                this.f34991b0[i11] = null;
                this.f34992c0[i11] = null;
            }
            i11++;
        }
        if (z1Var != null) {
            z1Var.setNeedDivider(false);
        }
        iv ivVar2 = this.X;
        org.telegram.ui.Components.cy0[] cy0VarArr2 = this.f34991b0;
        ivVar2.f23416b = cy0VarArr2;
        ivVar2.F = bVar;
        ivVar2.invalidate();
        ivVar2.f23417c = new float[cy0VarArr2.length];
        ivVar2.d = new float[cy0VarArr2.length];
        ivVar2.e = new float[cy0VarArr2.length];
        ivVar2.c(false);
        if (ivVar2.f23424y > 1) {
            ivVar2.f23418f = 0.0f;
        } else {
            ivVar2.f23418f = 1.0f;
        }
        w6 w6Var = new w6(this, getContext(), z6Var, 1);
        this.f34994e0 = w6Var;
        w6Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        w6Var.setCacheModel(bVar);
        w6Var.setDelegate(new o0.a(this, bVar, false, 5));
        org.telegram.ui.Components.ta taVar = this.f30527s;
        if (taVar != null) {
            taVar.setChildLayout(w6Var);
        } else {
            R();
            this.f34993d0.addView(this.f34990a0, w7.x5.q(-1, 72, 80));
        }
        if (this.f34990a0 != null) {
            this.f34990a0.a(this.X.a(), true);
        }
    }

    @Override
    public final void G(org.telegram.ui.Components.pv0 pv0Var) {
        this.d.j(new h3(this, 9));
        if (this.f30527s != null) {
            R();
            pv0Var.addView(this.f34990a0, w7.x5.e(-1, 72, 80));
        }
    }

    public final void R() {
        l6 l6Var = new l6(getContext());
        this.f34990a0 = l6Var;
        l6Var.f35328a.setOnClickListener(new a(this, 19));
        iv ivVar = this.X;
        if (ivVar != null) {
            this.f34990a0.a(ivVar.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.kl0 v(org.telegram.ui.Components.ll0 ll0Var) {
        return new hv(this);
    }

    @Override
    public final CharSequence y() {
        return this.f30525n.getMessagesController().getFullName(this.f34995f0);
    }
}
