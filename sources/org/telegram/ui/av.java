package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class av extends org.telegram.ui.Components.qa {
    public final zu T;
    public final s6 U;
    public final i6 V;
    public l6 W;
    public final org.telegram.ui.Components.lx0[] X;
    public final org.telegram.ui.Cells.y1[] Y;
    public final LinearLayout Z;

    public final w6 f36637a0;

    public final long f36638b0;

    public final ih.b f36639c0;

    public av(z6 z6Var, s6 s6Var, ih.b bVar, i6 i6Var) {
        String string;
        int i10;
        long j10;
        long j11;
        super(z6Var.getParentActivity(), z6Var, false, false, !bVar.h(), 1, null);
        ?? r11 = 1;
        int i11 = 8;
        this.X = new org.telegram.ui.Components.lx0[8];
        this.Y = new org.telegram.ui.Cells.y1[8];
        this.V = i6Var;
        this.U = s6Var;
        this.f36639c0 = bVar;
        this.f36638b0 = s6Var.f42522a;
        this.allowNestedScroll = false;
        N();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = z6Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.Z = linearLayout;
        linearLayout.setOrientation(1);
        zu zuVar = new zu(getContext(), s6Var.f42522a, i6Var);
        this.T = zuVar;
        linearLayout.addView(zuVar, h7.z5.t(-2, -2, 1, 0, 16, 0, 16));
        org.telegram.ui.Cells.y1 y1Var = null;
        int i12 = 0;
        while (i12 < i11) {
            if (i12 == 0) {
                string = LocaleController.getString(R.string.LocalPhotoCache);
                i10 = org.telegram.ui.ActionBar.g6.lj;
            } else if (i12 == r11) {
                string = LocaleController.getString(R.string.LocalVideoCache);
                i10 = org.telegram.ui.ActionBar.g6.hj;
            } else if (i12 == 2) {
                string = LocaleController.getString(R.string.LocalDocumentCache);
                i10 = org.telegram.ui.ActionBar.g6.ij;
            } else if (i12 == 3) {
                string = LocaleController.getString(R.string.LocalMusicCache);
                i10 = org.telegram.ui.ActionBar.g6.jj;
            } else if (i12 == 4) {
                string = LocaleController.getString(R.string.LocalAudioCache);
                i10 = org.telegram.ui.ActionBar.g6.mj;
            } else if (i12 == 5) {
                string = LocaleController.getString(R.string.LocalStickersCache);
                i10 = org.telegram.ui.ActionBar.g6.nj;
            } else if (i12 == 7) {
                string = LocaleController.getString(R.string.LocalStoriesCache);
                i10 = org.telegram.ui.ActionBar.g6.oj;
            } else {
                string = LocaleController.getString(R.string.LocalMiscellaneousCache);
                i10 = org.telegram.ui.ActionBar.g6.pj;
            }
            t6 t6Var = (t6) s6Var.d.get(i12);
            if (t6Var != null) {
                j10 = 0;
                j11 = t6Var.f42787a;
            } else {
                j10 = 0;
                j11 = 0;
            }
            if (j11 > j10) {
                org.telegram.ui.Components.lx0[] lx0VarArr = this.X;
                org.telegram.ui.Components.lx0 lx0Var = new org.telegram.ui.Components.lx0();
                Paint paint = new Paint((int) r11);
                lx0Var.f30484b = paint;
                lx0Var.f30485c = r11;
                lx0Var.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                lx0VarArr[i12] = lx0Var;
                org.telegram.ui.Components.lx0 lx0Var2 = this.X[i12];
                lx0Var2.f30486e = j11;
                lx0Var2.f30483a = i10;
                org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(4, 21, parentActivity, null, false);
                y1Var2.setTag(Integer.valueOf(i12));
                y1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                this.Z.addView(y1Var2, h7.z5.n(-1, 50));
                y1Var2.e(string, AndroidUtilities.formatFileSize(j11), true, true, false);
                y1Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false));
                int i13 = org.telegram.ui.ActionBar.g6.f23182k7;
                org.telegram.ui.Components.bp bpVar = y1Var2.f25981r;
                if (bpVar != null) {
                    bpVar.b(i10, i10, i13);
                }
                y1Var2.setOnClickListener(new org.telegram.ui.Components.xh0(17, this, bVar));
                this.Y[i12] = y1Var2;
                y1Var = y1Var2;
            } else {
                this.X[i12] = null;
                this.Y[i12] = null;
            }
            i12++;
            i11 = 8;
            r11 = 1;
        }
        if (y1Var != null) {
            y1Var.setNeedDivider(false);
        }
        zu zuVar2 = this.T;
        org.telegram.ui.Components.lx0[] lx0VarArr2 = this.X;
        zuVar2.f30766b = lx0VarArr2;
        zuVar2.B = bVar;
        zuVar2.invalidate();
        zuVar2.f30767c = new float[lx0VarArr2.length];
        zuVar2.d = new float[lx0VarArr2.length];
        zuVar2.f30768e = new float[lx0VarArr2.length];
        zuVar2.c(false);
        if (zuVar2.f30775y > 1) {
            zuVar2.f30769f = 0.0f;
        } else {
            zuVar2.f30769f = 1.0f;
        }
        w6 w6Var = new w6(this, getContext(), z6Var, 1);
        this.f36637a0 = w6Var;
        w6Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        w6Var.setCacheModel(bVar);
        w6Var.setDelegate(new i6(6, this, bVar));
        org.telegram.ui.Components.la laVar = this.f31857s;
        if (laVar != null) {
            laVar.setChildLayout(w6Var);
        } else {
            R();
            this.Z.addView(this.W, h7.z5.q(-1, 72, 80));
        }
        if (this.W != null) {
            this.W.a(this.T.a(), true);
        }
    }

    @Override
    public final void G(org.telegram.ui.Components.zu0 zu0Var) {
        this.d.j(new m3(this, 9));
        if (this.f31857s != null) {
            R();
            zu0Var.addView(this.W, h7.z5.e(-1, 72, 80));
        }
    }

    public final void R() {
        l6 l6Var = new l6(getContext());
        this.W = l6Var;
        l6Var.f39953a.setOnClickListener(new a(this, 19));
        zu zuVar = this.T;
        if (zuVar != null) {
            this.W.a(zuVar.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.yk0 w(org.telegram.ui.Components.zk0 zk0Var) {
        return new yu(this);
    }

    @Override
    public final CharSequence z() {
        return this.f31855n.getMessagesController().getFullName(this.f36638b0);
    }
}
