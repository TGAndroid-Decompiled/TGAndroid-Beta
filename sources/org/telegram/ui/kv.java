package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kv extends org.telegram.ui.Components.bb {
    public final jv X;
    public final s6 Y;
    public final o0.a Z;
    public l6 f38134a0;
    public final org.telegram.ui.Components.by0[] f38135b0;
    public final org.telegram.ui.Cells.z1[] f38136c0;
    public final LinearLayout f38137d0;
    public final w6 f38138e0;
    public final long f38139f0;
    public final ai.c f38140g0;

    public kv(z6 z6Var, s6 s6Var, ai.c cVar, o0.a aVar) {
        super((org.telegram.ui.ActionBar.n2) z6Var, false, !cVar.h(), (org.telegram.ui.ActionBar.f6) null);
        String string;
        int i10;
        long j3;
        long j10;
        this.f38135b0 = new org.telegram.ui.Components.by0[8];
        this.f38136c0 = new org.telegram.ui.Cells.z1[8];
        this.Z = aVar;
        this.Y = s6Var;
        this.f38140g0 = cVar;
        this.f38139f0 = s6Var.f40312a;
        this.allowNestedScroll = false;
        N();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = z6Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f38137d0 = linearLayout;
        linearLayout.setOrientation(1);
        jv jvVar = new jv(getContext(), s6Var.f40312a, aVar);
        this.X = jvVar;
        linearLayout.addView(jvVar, w7.x5.t(-2, -2, 1, 0, 16, 0, 16));
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
            t6 t6Var = (t6) s6Var.d.get(i11);
            if (t6Var != null) {
                j3 = 0;
                j10 = t6Var.f40632a;
            } else {
                j3 = 0;
                j10 = 0;
            }
            if (j10 > j3) {
                org.telegram.ui.Components.by0[] by0VarArr = this.f38135b0;
                ?? obj = new Object();
                Paint paint = new Paint(1);
                obj.f24821b = paint;
                obj.f24822c = true;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                by0VarArr[i11] = obj;
                org.telegram.ui.Components.by0 by0Var = this.f38135b0[i11];
                by0Var.f24823e = j10;
                by0Var.f24820a = i13;
                org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(4, 21, parentActivity, null, false);
                z1Var2.setTag(Integer.valueOf(i11));
                z1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                this.f38137d0.addView(z1Var2, w7.x5.n(-1, 50));
                z1Var2.e(str, AndroidUtilities.formatFileSize(j10), true, true, false);
                z1Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20770j5, false));
                int i14 = org.telegram.ui.ActionBar.j6.f20792k7;
                org.telegram.ui.Components.mp mpVar = z1Var2.f23597r;
                if (mpVar != null) {
                    mpVar.b(i13, i13, i14);
                }
                z1Var2.setOnClickListener(new org.telegram.ui.Components.ct(29, this, cVar));
                this.f38136c0[i11] = z1Var2;
                z1Var = z1Var2;
            } else {
                this.f38135b0[i11] = null;
                this.f38136c0[i11] = null;
            }
            i11++;
        }
        if (z1Var != null) {
            z1Var.setNeedDivider(false);
        }
        jv jvVar2 = this.X;
        org.telegram.ui.Components.by0[] by0VarArr2 = this.f38135b0;
        jvVar2.f25129b = by0VarArr2;
        jvVar2.F = cVar;
        jvVar2.invalidate();
        jvVar2.f25130c = new float[by0VarArr2.length];
        jvVar2.d = new float[by0VarArr2.length];
        jvVar2.f25131e = new float[by0VarArr2.length];
        jvVar2.c(false);
        if (jvVar2.f25138y > 1) {
            jvVar2.f25132f = 0.0f;
        } else {
            jvVar2.f25132f = 1.0f;
        }
        w6 w6Var = new w6(this, getContext(), z6Var, 1);
        this.f38138e0 = w6Var;
        w6Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        w6Var.setCacheModel(cVar);
        w6Var.setDelegate(new o0.a(this, cVar, false, 5));
        org.telegram.ui.Components.va vaVar = this.f24651s;
        if (vaVar != null) {
            vaVar.setChildLayout(w6Var);
        } else {
            R();
            this.f38137d0.addView(this.f38134a0, w7.x5.q(-1, 72, 80));
        }
        if (this.f38134a0 != null) {
            this.f38134a0.a(this.X.a(), true);
        }
    }

    @Override
    public final void G(org.telegram.ui.Components.ov0 ov0Var) {
        this.d.j(new i3(this, 9));
        if (this.f24651s != null) {
            R();
            ov0Var.addView(this.f38134a0, w7.x5.e(-1, 72, 80));
        }
    }

    public final void R() {
        l6 l6Var = new l6(getContext());
        this.f38134a0 = l6Var;
        l6Var.f38195a.setOnClickListener(new a(this, 19));
        jv jvVar = this.X;
        if (jvVar != null) {
            this.f38134a0.a(jvVar.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.kl0 v(org.telegram.ui.Components.ll0 ll0Var) {
        return new iv(this);
    }

    @Override
    public final CharSequence y() {
        return this.f24649n.getMessagesController().getFullName(this.f38139f0);
    }
}
