package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.KeyguardManager;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public class PasscodeActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public int D;
    public int E;
    public String F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public org.telegram.ui.ActionBar.t0 Q;
    public boolean R;
    public final lj0 S;
    public mj0 T;
    public qa0 U;
    public t11 V;
    public org.telegram.ui.Components.ei0 f33417a;
    private int autoLockRow;
    public fg.j f33418b;
    public org.telegram.ui.Components.tk0 f33419c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.a01 e;
    public org.telegram.ui.Components.ec0 f33420f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public uc0 f33421n;
    public TextView f33422r;
    public ImageView f33423s;
    public org.telegram.ui.Components.lr f33424w;
    public org.telegram.ui.Components.f10 f33425x;
    public final int f33426y;

    public PasscodeActivity(int i10) {
        super(null);
        this.D = 0;
        this.E = 0;
        this.S = new lj0(this, 5);
        this.f33426y = i10;
    }

    public static void Y(PasscodeActivity passcodeActivity, org.telegram.ui.Components.ac0 ac0Var, int i10) {
        int value = ac0Var.getValue();
        if (value == 0) {
            org.telegram.messenger.tz.f18197y = 0;
        } else if (value == 1) {
            org.telegram.messenger.tz.f18197y = 60;
        } else if (value == 2) {
            org.telegram.messenger.tz.f18197y = 300;
        } else if (value == 3) {
            org.telegram.messenger.tz.f18197y = 3600;
        } else if (value == 4) {
            org.telegram.messenger.tz.f18197y = 18000;
        }
        passcodeActivity.f33418b.g(i10);
        org.telegram.messenger.d20.i(passcodeActivity.currentAccount).v(false);
    }

    public static void Z(PasscodeActivity passcodeActivity, View view, int i10) {
        if (view.isEnabled()) {
            if (i10 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String L0 = org.telegram.messenger.cd.L0(2131751434, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.cd.L0(2131751433, null);
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751432, null), new tt(passcodeActivity, 29));
                x1Var.show();
                org.telegram.ui.ActionBar.a7.V((TextView) x1Var.d(-1), org.telegram.ui.ActionBar.t6.f21170q7, null);
            } else if (i10 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
            } else if (i10 == passcodeActivity.autoLockRow) {
                if (passcodeActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                    String L02 = org.telegram.messenger.cd.L0(2131753800, null);
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                    x1Var2.R = L02;
                    org.telegram.ui.Components.ac0 ac0Var = new org.telegram.ui.Components.ac0(passcodeActivity.getParentActivity(), null);
                    ac0Var.setMinValue(0);
                    ac0Var.setMaxValue(4);
                    int i11 = org.telegram.messenger.tz.f18197y;
                    if (i11 == 0) {
                        ac0Var.setValue(0);
                    } else if (i11 == 60) {
                        ac0Var.setValue(1);
                    } else if (i11 == 300) {
                        ac0Var.setValue(2);
                    } else if (i11 == 3600) {
                        ac0Var.setValue(3);
                    } else if (i11 == 18000) {
                        ac0Var.setValue(4);
                    }
                    ac0Var.setFormatter(new org.telegram.ui.Components.z11(18));
                    alertDialog$Builder2.o(ac0Var);
                    alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131751355, null), new ag.b0(passcodeActivity, ac0Var, i10, 13));
                    passcodeActivity.showDialog(x1Var2);
                }
            } else if (i10 == passcodeActivity.fingerprintRow) {
                org.telegram.messenger.tz.D = !org.telegram.messenger.tz.D;
                org.telegram.messenger.d20.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.tz.D);
            } else if (i10 == passcodeActivity.N) {
                org.telegram.messenger.tz.A = !org.telegram.messenger.tz.A;
                org.telegram.messenger.d20.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.tz.A);
                org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19653n0, Boolean.FALSE);
                if (!org.telegram.messenger.tz.A) {
                    org.telegram.ui.Components.s4.t0(passcodeActivity, null, org.telegram.messenger.cd.L0(2131745861, null), null);
                }
            } else if (i10 == passcodeActivity.J) {
                org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(passcodeActivity.currentAccount);
                boolean z10 = !x10.K();
                if (x10.f34785m != z10) {
                    x10.f34785m = z10;
                    try {
                        org.telegram.ui.Wallet.k0.w().getSharedPreferences("gram_wallet", 0).edit().putBoolean("passcode", x10.f34785m).apply();
                    } catch (Exception e) {
                        org.telegram.ui.Wallet.k0.k("failed to save prefs", e);
                    }
                }
                org.telegram.messenger.d20.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.t8) view).setChecked(x10.K());
            } else if (i10 == passcodeActivity.K) {
                org.telegram.ui.Wallet.k0 x11 = org.telegram.ui.Wallet.k0.x(passcodeActivity.currentAccount);
                boolean J = x11.J();
                boolean z11 = !J;
                nc ncVar = new nc(3, view, J);
                org.telegram.ui.Wallet.p0 p0Var = x11.f34778c;
                if (p0Var == null) {
                    ncVar.a(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.Wallet.p0.h.execute(new org.telegram.messenger.video.o(p0Var, p0Var.l(), z11, new org.telegram.ui.Wallet.k(ncVar, 0), 3));
            }
        }
    }

    public static int b0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.fingerprintRow;
    }

    public static int c0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.autoLockRow;
    }

    public static int d0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.changePasscodeRow;
    }

    public static int e0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.disablePasscodeRow;
    }

    public static int g0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.currentAccount;
    }

    public static int h0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.currentAccount;
    }

    public static int i0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.currentAccount;
    }

    public static org.telegram.ui.ActionBar.k2 o0() {
        if (!org.telegram.messenger.tz.f18180s.isEmpty()) {
            return new PasscodeActivity(2);
        }
        return new f(6);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
    }

    @Override
    public final android.view.View createView(android.content.Context r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PasscodeActivity.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19653n0) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.f33426y == 0) {
                z0();
                fg.j jVar = this.f33418b;
                if (jVar != null) {
                    jVar.f();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f33419c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20872a7));
        if (this.f33426y != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21206s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21058k6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21076l6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33419c, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33419c, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
        return arrayList;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        if (this.f33426y != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        if (this.f33426y == 0) {
            return true;
        }
        return false;
    }

    public final void n0(Runnable runnable) {
        if (!r0()) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            uc0 uc0Var = this.f33421n;
            bs[] bsVarArr = uc0Var.f44219f;
            if (i10 < bsVarArr.length) {
                bs bsVar = bsVarArr[i10];
                bsVar.postDelayed(new nj0(bsVar, 0), i10 * 75);
                i10++;
            } else {
                uc0Var.postDelayed(new uf0(8, this, runnable), (bsVarArr.length * 75) + 350);
                return;
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        bs[] bsVarArr;
        int i10;
        super.onConfigurationChanged(configuration);
        v0(p0(), false);
        org.telegram.ui.Components.ei0 ei0Var = this.f33417a;
        if (ei0Var != null) {
            if (!org.telegram.messenger.i0.O1()) {
                Point point = org.telegram.messenger.i0.f16026q;
                if (point.x < point.y) {
                    i10 = 0;
                    ei0Var.setVisibility(i10);
                }
            }
            i10 = 8;
            ei0Var.setVisibility(i10);
        }
        uc0 uc0Var = this.f33421n;
        if (uc0Var != null && (bsVarArr = uc0Var.f44219f) != null) {
            for (bs bsVar : bsVarArr) {
                bsVar.setShowSoftInputOnFocusCompat(!p0());
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        z0();
        if (this.f33426y == 0) {
            org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19653n0);
            return true;
        }
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f33426y == 0) {
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19653n0);
        }
        org.telegram.messenger.i0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.i0.C2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onResume() {
        super.onResume();
        fg.j jVar = this.f33418b;
        if (jVar != null) {
            jVar.f();
        }
        if (this.f33426y != 0 && !p0()) {
            org.telegram.messenger.i0.h3(new lj0(this, 6), 200L);
        }
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        if (p0()) {
            org.telegram.messenger.i0.v1(this.fragmentView);
            org.telegram.messenger.i0.a3(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            EditTextBoldCursor editTextBoldCursor = this.h;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.t6.f21076l6, null);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f33426y != 0) {
            x0();
        }
    }

    public final boolean p0() {
        if (r0() && this.f33426y != 0 && !org.telegram.messenger.i0.Q1()) {
            Point point = org.telegram.messenger.i0.f16026q;
            if (point.x < point.y && !org.telegram.messenger.i0.C1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean q0() {
        int i10 = this.f33426y;
        if ((i10 == 1 && this.D == 1) || ((i10 == 2 || i10 == 3) && org.telegram.messenger.tz.f18177r == 1)) {
            return true;
        }
        return false;
    }

    public final boolean r0() {
        int i10 = this.f33426y;
        if ((i10 == 1 && this.D == 0) || ((i10 == 2 || i10 == 3) && org.telegram.messenger.tz.f18177r == 0)) {
            return true;
        }
        return false;
    }

    public final void s0() {
        View view;
        float f7;
        if (getParentActivity() == null) {
            return;
        }
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (r0()) {
            for (bs bsVar : this.f33421n.f44219f) {
                bsVar.z(1.0f);
            }
        } else {
            this.f33420f.a(1.0f);
        }
        if (r0()) {
            view = this.f33421n;
        } else {
            view = this.f33420f;
        }
        if (r0()) {
            f7 = 10.0f;
        } else {
            f7 = 4.0f;
        }
        org.telegram.messenger.i0.F3(f7, view, new lj0(this, 3));
    }

    public final void t0() {
        String obj;
        bs[] bsVarArr;
        bs[] bsVarArr2;
        if (q0() && this.h.getText().length() == 0) {
            s0();
            return;
        }
        if (r0()) {
            obj = this.f33421n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        int i10 = this.f33426y;
        if (i10 == 1) {
            if (!this.F.equals(obj)) {
                org.telegram.messenger.i0.W3(this.f33422r, true);
                for (bs bsVar : this.f33421n.f44219f) {
                    bsVar.setText("");
                }
                if (r0()) {
                    this.f33421n.f44219f[0].requestFocus();
                }
                this.h.setText("");
                s0();
                this.f33421n.removeCallbacks(this.S);
                this.f33421n.post(new lj0(this, 0));
                return;
            }
            boolean isEmpty = org.telegram.messenger.tz.f18180s.isEmpty();
            try {
                org.telegram.messenger.tz.f18191w = new byte[16];
                Utilities.f14519b.nextBytes(org.telegram.messenger.tz.f18191w);
                byte[] bytes = this.F.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(org.telegram.messenger.tz.f18191w, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(org.telegram.messenger.tz.f18191w, 0, bArr, bytes.length + 16, 16);
                org.telegram.messenger.tz.f18180s = Utilities.f(Utilities.o(length, bArr));
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            org.telegram.messenger.tz.A = true;
            org.telegram.messenger.tz.f18177r = this.D;
            org.telegram.messenger.tz.y();
            this.h.clearFocus();
            org.telegram.messenger.i0.v1(this.h);
            for (bs bsVar2 : this.f33421n.f44219f) {
                bsVar2.clearFocus();
                org.telegram.messenger.i0.v1(bsVar2);
            }
            this.f33424w.setEditText(null);
            n0(new mj0(this, isEmpty, 0));
        } else if (i10 == 2 || i10 == 3) {
            long j10 = org.telegram.messenger.tz.f18183t;
            if (j10 > 0) {
                Toast.makeText(getParentActivity(), org.telegram.messenger.cd.a0("TooManyTries", null, 2131744061, org.telegram.messenger.cd.G(Math.max(1, (int) Math.ceil(j10 / 1000.0d)), "Seconds", new Object[0])), 0).show();
                for (bs bsVar3 : this.f33421n.f44219f) {
                    bsVar3.setText("");
                }
                this.h.setText("");
                if (r0()) {
                    this.f33421n.f44219f[0].requestFocus();
                }
                s0();
            } else if (!org.telegram.messenger.tz.g(obj)) {
                org.telegram.messenger.tz.r();
                this.h.setText("");
                for (bs bsVar4 : this.f33421n.f44219f) {
                    bsVar4.setText("");
                }
                if (r0()) {
                    this.f33421n.f44219f[0].requestFocus();
                }
                s0();
            } else {
                org.telegram.messenger.tz.v = 0;
                org.telegram.messenger.tz.y();
                this.h.clearFocus();
                org.telegram.messenger.i0.v1(this.h);
                for (bs bsVar5 : this.f33421n.f44219f) {
                    bsVar5.clearFocus();
                    org.telegram.messenger.i0.v1(bsVar5);
                }
                this.f33424w.setEditText(null);
                if (i10 == 3) {
                    n0(new lj0(this, 1));
                } else {
                    n0(new lj0(this, 2));
                }
            }
        }
    }

    public final void u0() {
        String obj;
        if ((this.D == 1 && this.h.getText().length() == 0) || (this.D == 0 && this.f33421n.getCode().length() != 4)) {
            s0();
            return;
        }
        org.telegram.ui.ActionBar.t0 t0Var = this.Q;
        if (t0Var != null) {
            t0Var.setVisibility(8);
        }
        this.d.setText(org.telegram.messenger.cd.L0(2131751815, null));
        this.e.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131747672, null)));
        if (r0()) {
            obj = this.f33421n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        this.F = obj;
        this.h.setText("");
        this.h.setInputType(524417);
        for (bs bsVar : this.f33421n.f44219f) {
            bsVar.setText("");
        }
        x0();
        this.E = 1;
    }

    @Override
    public final boolean useSimpleActionBar() {
        if (this.f33426y == 0) {
            return true;
        }
        return false;
    }

    public final void v0(boolean z10, boolean z11) {
        float f7;
        org.telegram.ui.Components.gr grVar;
        if (z10) {
            org.telegram.messenger.i0.v1(this.fragmentView);
            org.telegram.messenger.i0.a3(getParentActivity(), this.classGuid);
        } else {
            org.telegram.messenger.i0.C2(getParentActivity(), this.classGuid);
        }
        int i10 = 0;
        float f10 = 1.0f;
        float f11 = 0.0f;
        if (!z11) {
            org.telegram.ui.Components.lr lrVar = this.f33424w;
            if (!z10) {
                i10 = 8;
            }
            lrVar.setVisibility(i10);
            org.telegram.ui.Components.lr lrVar2 = this.f33424w;
            if (!z10) {
                f10 = 0.0f;
            }
            lrVar2.setAlpha(f10);
            org.telegram.ui.Components.lr lrVar3 = this.f33424w;
            if (!z10) {
                f11 = org.telegram.messenger.i0.L(230.0f);
            }
            lrVar3.setTranslationY(f11);
            this.fragmentView.requestLayout();
            return;
        }
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10) {
            f10 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration(150L);
        if (z10) {
            grVar = org.telegram.ui.Components.gr.f26495f;
        } else {
            grVar = org.telegram.ui.Components.vs.e;
        }
        duration.setInterpolator(grVar);
        duration.addUpdateListener(new a3(this, 17));
        duration.addListener(new org.telegram.ui.Components.ha0(18, this, z10));
        duration.start();
    }

    public final void w0(Runnable runnable) {
        this.U = (qa0) runnable;
    }

    public final void x0() {
        if (r0()) {
            this.f33421n.f44219f[0].requestFocus();
            if (!p0()) {
                org.telegram.messenger.i0.J3(this.f33421n.f44219f[0]);
            }
        } else if (q0()) {
            this.h.requestFocus();
            org.telegram.messenger.i0.J3(this.h);
        }
    }

    public final void y0() {
        String charSequence;
        int i10;
        boolean z10;
        int i11 = 2131751707;
        int i12 = this.f33426y;
        if (i12 == 2) {
            charSequence = org.telegram.messenger.cd.L0(2131751112, null);
        } else if (i12 == 3) {
            charSequence = org.telegram.messenger.cd.L0(2131743219, null);
        } else if (this.E == 0) {
            if (this.D == 0) {
                i10 = 2131751708;
            } else {
                i10 = 2131751707;
            }
            charSequence = org.telegram.messenger.cd.L0(i10, null);
        } else {
            charSequence = this.e.getCurrentView().getText().toString();
        }
        if (!this.e.getCurrentView().getText().equals(charSequence) && !TextUtils.isEmpty(this.e.getCurrentView().getText())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 == 2) {
            this.e.a(org.telegram.messenger.cd.L0(2131751112, null), z10, false);
        } else if (i12 == 3) {
            this.e.setText(org.telegram.messenger.cd.L0(2131743219, null));
        } else if (this.E == 0) {
            org.telegram.ui.Components.a01 a01Var = this.e;
            if (this.D == 0) {
                i11 = 2131751708;
            }
            a01Var.a(org.telegram.messenger.cd.L0(i11, null), z10, false);
        }
        if (r0()) {
            org.telegram.messenger.i0.Y3(this.f33421n, true, 1.0f, true, z10);
            org.telegram.messenger.i0.Y3(this.f33420f, false, 1.0f, true, z10);
        } else if (q0()) {
            org.telegram.messenger.i0.Y3(this.f33421n, false, 1.0f, true, z10);
            org.telegram.messenger.i0.Y3(this.f33420f, true, 1.0f, true, z10);
        }
        if (q0()) {
            mj0 mj0Var = new mj0(this, z10, 1);
            this.T = mj0Var;
            org.telegram.messenger.i0.h3(mj0Var, 3000L);
        } else {
            this.f33425x.e(false, z10);
        }
        v0(p0(), z10);
        x0();
    }

    public final void z0() {
        this.I = -1;
        this.J = -1;
        this.fingerprintRow = -1;
        this.K = -1;
        this.L = -1;
        this.G = 1;
        this.P = 3;
        this.changePasscodeRow = 2;
        try {
            if (new android.support.v4.media.session.a0(new androidx.biometric.s(org.telegram.messenger.w0.f19025b, 0)).h(15) == 0) {
                Typeface typeface = org.telegram.messenger.i0.f15999a;
                if (((KeyguardManager) org.telegram.messenger.w0.f19025b.getSystemService("keyguard")).isKeyguardSecure()) {
                    int i10 = this.P;
                    this.P = i10 + 1;
                    this.fingerprintRow = i10;
                }
            }
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
        }
        int i11 = this.P;
        this.autoLockRow = i11;
        this.P = i11 + 2;
        this.H = i11 + 1;
        if (((org.telegram.messenger.j0) getMessagesController().f18957y7.f17841j0.f11587b).f16204c) {
            int i12 = this.P;
            this.I = i12;
            this.P = i12 + 2;
            this.J = i12 + 1;
            if (org.telegram.ui.Wallet.p0.i(org.telegram.messenger.w0.f19025b)) {
                int i13 = this.P;
                this.P = i13 + 1;
                this.K = i13;
            }
            int i14 = this.P;
            this.P = i14 + 1;
            this.L = i14;
        }
        int i15 = this.P;
        this.M = i15;
        this.N = i15 + 1;
        this.O = i15 + 2;
        this.P = i15 + 4;
        this.disablePasscodeRow = i15 + 3;
    }
}
