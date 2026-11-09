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
public class PasscodeActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
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
    public org.telegram.ui.ActionBar.r0 Q;
    public boolean R;
    public final fi0 S;
    public gi0 T;
    public n90 U;
    public wb1 V;
    public org.telegram.ui.Components.dh0 f41332a;
    private int autoLockRow;
    public l4 f41333b;
    public org.telegram.ui.Components.qj0 f41334c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.xy0 f41335e;
    public org.telegram.ui.Components.mb0 f41336f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public nb0 f41337n;
    public TextView f41338r;
    public ImageView f41339s;
    public org.telegram.ui.Components.br f41340w;
    public org.telegram.ui.Components.q00 f41341x;
    public final int f41342y;

    public PasscodeActivity(int i7) {
        super(null);
        this.D = 0;
        this.E = 0;
        this.S = new fi0(this, 5);
        this.f41342y = i7;
    }

    public static void Z(PasscodeActivity passcodeActivity, org.telegram.ui.Components.ib0 ib0Var, int i7) {
        int value = ib0Var.getValue();
        if (value == 0) {
            org.telegram.messenger.iz.f23451y = 0;
        } else if (value == 1) {
            org.telegram.messenger.iz.f23451y = 60;
        } else if (value == 2) {
            org.telegram.messenger.iz.f23451y = 300;
        } else if (value == 3) {
            org.telegram.messenger.iz.f23451y = 3600;
        } else if (value == 4) {
            org.telegram.messenger.iz.f23451y = 18000;
        }
        passcodeActivity.f41333b.g(i7);
        org.telegram.messenger.p10.i(passcodeActivity.currentAccount).v(false);
    }

    public static void a0(PasscodeActivity passcodeActivity, View view, int i7) {
        if (view.isEnabled()) {
            if (i7 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131751433, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131751432, null);
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751431, null), new yr(passcodeActivity, 29));
                u1Var.show();
                org.telegram.ui.ActionBar.s6.U((TextView) u1Var.d(-1), org.telegram.ui.ActionBar.l6.f28106q7, null);
            } else if (i7 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
            } else if (i7 == passcodeActivity.autoLockRow) {
                if (passcodeActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                    String M02 = org.telegram.messenger.id.M0(2131753800, null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                    u1Var2.R = M02;
                    org.telegram.ui.Components.ib0 ib0Var = new org.telegram.ui.Components.ib0(passcodeActivity.getParentActivity(), null);
                    ib0Var.setMinValue(0);
                    ib0Var.setMaxValue(4);
                    int i10 = org.telegram.messenger.iz.f23451y;
                    if (i10 == 0) {
                        ib0Var.setValue(0);
                    } else if (i10 == 60) {
                        ib0Var.setValue(1);
                    } else if (i10 == 300) {
                        ib0Var.setValue(2);
                    } else if (i10 == 3600) {
                        ib0Var.setValue(3);
                    } else if (i10 == 18000) {
                        ib0Var.setValue(4);
                    }
                    ib0Var.setFormatter(new org.telegram.ui.Components.jl0(28));
                    alertDialog$Builder2.o(ib0Var);
                    alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131751354, null), new jg.a2(passcodeActivity, ib0Var, i7, 12));
                    passcodeActivity.showDialog(u1Var2);
                }
            } else if (i7 == passcodeActivity.fingerprintRow) {
                org.telegram.messenger.iz.D = !org.telegram.messenger.iz.D;
                org.telegram.messenger.p10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.D);
            } else if (i7 == passcodeActivity.N) {
                org.telegram.messenger.iz.A = !org.telegram.messenger.iz.A;
                org.telegram.messenger.p10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.A);
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25041n0, Boolean.FALSE);
                if (!org.telegram.messenger.iz.A) {
                    org.telegram.ui.Components.v4.r0(passcodeActivity, null, org.telegram.messenger.id.M0(2131745844, null), null);
                }
            } else if (i7 == passcodeActivity.J) {
                org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(passcodeActivity.currentAccount);
                boolean z9 = !x10.K();
                if (x10.f42690m != z9) {
                    x10.f42690m = z9;
                    try {
                        org.telegram.ui.Wallet.l0.w().getSharedPreferences("gram_wallet", 0).edit().putBoolean("passcode", x10.f42690m).apply();
                    } catch (Exception e10) {
                        org.telegram.ui.Wallet.l0.k("failed to save prefs", e10);
                    }
                }
                org.telegram.messenger.p10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.r8) view).setChecked(x10.K());
            } else if (i7 == passcodeActivity.K) {
                org.telegram.ui.Wallet.l0 x11 = org.telegram.ui.Wallet.l0.x(passcodeActivity.currentAccount);
                boolean J = x11.J();
                boolean z10 = !J;
                bi.b9 b9Var = new bi.b9(7, view, J);
                org.telegram.ui.Wallet.p0 p0Var = x11.f42682c;
                if (p0Var == null) {
                    b9Var.a(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.Wallet.p0.h.execute(new org.telegram.messenger.video.n(p0Var, p0Var.l(), z10, new org.telegram.ui.Wallet.k(b9Var, 0), 3));
            }
        }
    }

    public static int c0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.fingerprintRow;
    }

    public static int d0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.autoLockRow;
    }

    public static int e0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.changePasscodeRow;
    }

    public static int f0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.disablePasscodeRow;
    }

    public static int h0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.currentAccount;
    }

    public static int i0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.currentAccount;
    }

    public static int j0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.currentAccount;
    }

    public static org.telegram.ui.ActionBar.f2 p0() {
        if (!org.telegram.messenger.iz.f23434s.isEmpty()) {
            return new PasscodeActivity(2);
        }
        return new g(6);
    }

    public final void A0() {
        this.I = -1;
        this.J = -1;
        this.fingerprintRow = -1;
        this.K = -1;
        this.L = -1;
        this.G = 1;
        this.P = 3;
        this.changePasscodeRow = 2;
        try {
            if (new android.support.v4.media.session.a0(new androidx.biometric.t(org.telegram.messenger.t0.f25566b, 0)).d(15) == 0) {
                Typeface typeface = org.telegram.messenger.g0.f22535a;
                if (((KeyguardManager) org.telegram.messenger.t0.f25566b.getSystemService("keyguard")).isKeyguardSecure()) {
                    int i7 = this.P;
                    this.P = i7 + 1;
                    this.fingerprintRow = i7;
                }
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        int i10 = this.P;
        this.autoLockRow = i10;
        this.P = i10 + 2;
        this.H = i10 + 1;
        if (((org.telegram.messenger.h0) getMessagesController().f24942x7.f24446j0.f13889b).f22780c) {
            int i11 = this.P;
            this.I = i11;
            this.P = i11 + 2;
            this.J = i11 + 1;
            if (org.telegram.ui.Wallet.p0.i(org.telegram.messenger.t0.f25566b)) {
                int i12 = this.P;
                this.P = i12 + 1;
                this.K = i12;
            }
            int i13 = this.P;
            this.P = i13 + 1;
            this.L = i13;
        }
        int i14 = this.P;
        this.M = i14;
        this.N = i14 + 1;
        this.O = i14 + 2;
        this.P = i14 + 4;
        this.disablePasscodeRow = i14 + 3;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27866d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28202v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
    }

    @Override
    public final android.view.View createView(android.content.Context r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PasscodeActivity.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25041n0) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.f41342y == 0) {
                A0();
                l4 l4Var = this.f41333b;
                if (l4Var != null) {
                    l4Var.f();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.f41334c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27809a7));
        if (this.f41342y != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28145s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.h, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27994k6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.h, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28012l6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41334c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41334c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.N6));
        return arrayList;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        if (this.f41342y != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        if (this.f41342y == 0) {
            return true;
        }
        return false;
    }

    public final void o0(Runnable runnable) {
        if (!s0()) {
            runnable.run();
            return;
        }
        int i7 = 0;
        while (true) {
            nb0 nb0Var = this.f41337n;
            dr[] drVarArr = nb0Var.f43768f;
            if (i7 < drVarArr.length) {
                dr drVar = drVarArr[i7];
                drVar.postDelayed(new hi0(drVar, 0), i7 * 75);
                i7++;
            } else {
                nb0Var.postDelayed(new bd0(16, this, runnable), (drVarArr.length * 75) + 350);
                return;
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        dr[] drVarArr;
        int i7;
        super.onConfigurationChanged(configuration);
        w0(q0(), false);
        org.telegram.ui.Components.dh0 dh0Var = this.f41332a;
        if (dh0Var != null) {
            if (!org.telegram.messenger.g0.O1()) {
                Point point = org.telegram.messenger.g0.f22563q;
                if (point.x < point.y) {
                    i7 = 0;
                    dh0Var.setVisibility(i7);
                }
            }
            i7 = 8;
            dh0Var.setVisibility(i7);
        }
        nb0 nb0Var = this.f41337n;
        if (nb0Var != null && (drVarArr = nb0Var.f43768f) != null) {
            for (dr drVar : drVarArr) {
                drVar.setShowSoftInputOnFocusCompat(!q0());
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        A0();
        if (this.f41342y == 0) {
            org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25041n0);
            return true;
        }
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f41342y == 0) {
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25041n0);
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f41333b;
        if (l4Var != null) {
            l4Var.f();
        }
        if (this.f41342y != 0 && !q0()) {
            org.telegram.messenger.g0.i3(new fi0(this, 6), 200L);
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        if (q0()) {
            org.telegram.messenger.g0.v1(this.fragmentView);
            org.telegram.messenger.g0.b3(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            EditTextBoldCursor editTextBoldCursor = this.h;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.s6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.l6.f28012l6, null);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9 && this.f41342y != 0) {
            y0();
        }
    }

    public final boolean q0() {
        if (s0() && this.f41342y != 0 && !org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.f22563q;
            if (point.x < point.y && !org.telegram.messenger.g0.C1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean r0() {
        int i7 = this.f41342y;
        if ((i7 == 1 && this.D == 1) || ((i7 == 2 || i7 == 3) && org.telegram.messenger.iz.f23431r == 1)) {
            return true;
        }
        return false;
    }

    public final boolean s0() {
        int i7 = this.f41342y;
        if ((i7 == 1 && this.D == 0) || ((i7 == 2 || i7 == 3) && org.telegram.messenger.iz.f23431r == 0)) {
            return true;
        }
        return false;
    }

    public final void t0() {
        View view;
        float f10;
        if (getParentActivity() == null) {
            return;
        }
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (s0()) {
            for (dr drVar : this.f41337n.f43768f) {
                drVar.z(1.0f);
            }
        } else {
            this.f41336f.a(1.0f);
        }
        if (s0()) {
            view = this.f41337n;
        } else {
            view = this.f41336f;
        }
        if (s0()) {
            f10 = 10.0f;
        } else {
            f10 = 4.0f;
        }
        org.telegram.messenger.g0.G3(f10, view, new fi0(this, 3));
    }

    public final void u0() {
        String obj;
        dr[] drVarArr;
        dr[] drVarArr2;
        if (r0() && this.h.getText().length() == 0) {
            t0();
            return;
        }
        if (s0()) {
            obj = this.f41337n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        int i7 = this.f41342y;
        if (i7 == 1) {
            if (!this.F.equals(obj)) {
                org.telegram.messenger.g0.X3(this.f41338r, true);
                for (dr drVar : this.f41337n.f43768f) {
                    drVar.setText("");
                }
                if (s0()) {
                    this.f41337n.f43768f[0].requestFocus();
                }
                this.h.setText("");
                t0();
                this.f41337n.removeCallbacks(this.S);
                this.f41337n.post(new fi0(this, 0));
                return;
            }
            boolean isEmpty = org.telegram.messenger.iz.f23434s.isEmpty();
            try {
                org.telegram.messenger.iz.f23445w = new byte[16];
                Utilities.f21334b.nextBytes(org.telegram.messenger.iz.f23445w);
                byte[] bytes = this.F.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(org.telegram.messenger.iz.f23445w, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(org.telegram.messenger.iz.f23445w, 0, bArr, bytes.length + 16, 16);
                org.telegram.messenger.iz.f23434s = Utilities.f(Utilities.o(length, bArr));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            org.telegram.messenger.iz.A = true;
            org.telegram.messenger.iz.f23431r = this.D;
            org.telegram.messenger.iz.y();
            this.h.clearFocus();
            org.telegram.messenger.g0.v1(this.h);
            for (dr drVar2 : this.f41337n.f43768f) {
                drVar2.clearFocus();
                org.telegram.messenger.g0.v1(drVar2);
            }
            this.f41340w.setEditText(null);
            o0(new gi0(this, isEmpty, 0));
        } else if (i7 == 2 || i7 == 3) {
            long j3 = org.telegram.messenger.iz.f23437t;
            if (j3 > 0) {
                Toast.makeText(getParentActivity(), org.telegram.messenger.id.a0("TooManyTries", null, 2131744036, org.telegram.messenger.id.G(Math.max(1, (int) Math.ceil(j3 / 1000.0d)), "Seconds", new Object[0])), 0).show();
                for (dr drVar3 : this.f41337n.f43768f) {
                    drVar3.setText("");
                }
                this.h.setText("");
                if (s0()) {
                    this.f41337n.f43768f[0].requestFocus();
                }
                t0();
            } else if (!org.telegram.messenger.iz.g(obj)) {
                org.telegram.messenger.iz.r();
                this.h.setText("");
                for (dr drVar4 : this.f41337n.f43768f) {
                    drVar4.setText("");
                }
                if (s0()) {
                    this.f41337n.f43768f[0].requestFocus();
                }
                t0();
            } else {
                org.telegram.messenger.iz.v = 0;
                org.telegram.messenger.iz.y();
                this.h.clearFocus();
                org.telegram.messenger.g0.v1(this.h);
                for (dr drVar5 : this.f41337n.f43768f) {
                    drVar5.clearFocus();
                    org.telegram.messenger.g0.v1(drVar5);
                }
                this.f41340w.setEditText(null);
                if (i7 == 3) {
                    o0(new fi0(this, 1));
                } else {
                    o0(new fi0(this, 2));
                }
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        if (this.f41342y == 0) {
            return true;
        }
        return false;
    }

    public final void v0() {
        String obj;
        if ((this.D == 1 && this.h.getText().length() == 0) || (this.D == 0 && this.f41337n.getCode().length() != 4)) {
            t0();
            return;
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.Q;
        if (r0Var != null) {
            r0Var.setVisibility(8);
        }
        this.d.setText(org.telegram.messenger.id.M0(2131751815, null));
        this.f41335e.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131747656, null)));
        if (s0()) {
            obj = this.f41337n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        this.F = obj;
        this.h.setText("");
        this.h.setInputType(524417);
        for (dr drVar : this.f41337n.f43768f) {
            drVar.setText("");
        }
        y0();
        this.E = 1;
    }

    public final void w0(boolean z9, boolean z10) {
        float f10;
        org.telegram.ui.Components.xq xqVar;
        if (z9) {
            org.telegram.messenger.g0.v1(this.fragmentView);
            org.telegram.messenger.g0.b3(getParentActivity(), this.classGuid);
        } else {
            org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
        }
        int i7 = 0;
        float f11 = 1.0f;
        float f12 = 0.0f;
        if (!z10) {
            org.telegram.ui.Components.br brVar = this.f41340w;
            if (!z9) {
                i7 = 8;
            }
            brVar.setVisibility(i7);
            org.telegram.ui.Components.br brVar2 = this.f41340w;
            if (!z9) {
                f11 = 0.0f;
            }
            brVar2.setAlpha(f11);
            org.telegram.ui.Components.br brVar3 = this.f41340w;
            if (!z9) {
                f12 = org.telegram.messenger.g0.L(230.0f);
            }
            brVar3.setTranslationY(f12);
            this.fragmentView.requestLayout();
            return;
        }
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z9) {
            f11 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration(150L);
        if (z9) {
            xqVar = org.telegram.ui.Components.xq.f40458f;
        } else {
            xqVar = org.telegram.ui.Components.ks.f35469e;
        }
        duration.setInterpolator(xqVar);
        duration.addUpdateListener(new a3(this, 17));
        duration.addListener(new b50(2, this, z9));
        duration.start();
    }

    public final void x0(Runnable runnable) {
        this.U = (n90) runnable;
    }

    public final void y0() {
        if (s0()) {
            this.f41337n.f43768f[0].requestFocus();
            if (!q0()) {
                org.telegram.messenger.g0.K3(this.f41337n.f43768f[0]);
            }
        } else if (r0()) {
            this.h.requestFocus();
            org.telegram.messenger.g0.K3(this.h);
        }
    }

    public final void z0() {
        String charSequence;
        int i7;
        boolean z9;
        int i10 = 2131751706;
        int i11 = this.f41342y;
        if (i11 == 2) {
            charSequence = org.telegram.messenger.id.M0(2131751111, null);
        } else if (i11 == 3) {
            charSequence = org.telegram.messenger.id.M0(2131743193, null);
        } else if (this.E == 0) {
            if (this.D == 0) {
                i7 = 2131751707;
            } else {
                i7 = 2131751706;
            }
            charSequence = org.telegram.messenger.id.M0(i7, null);
        } else {
            charSequence = this.f41335e.getCurrentView().getText().toString();
        }
        if (!this.f41335e.getCurrentView().getText().equals(charSequence) && !TextUtils.isEmpty(this.f41335e.getCurrentView().getText())) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i11 == 2) {
            this.f41335e.a(org.telegram.messenger.id.M0(2131751111, null), z9, false);
        } else if (i11 == 3) {
            this.f41335e.setText(org.telegram.messenger.id.M0(2131743193, null));
        } else if (this.E == 0) {
            org.telegram.ui.Components.xy0 xy0Var = this.f41335e;
            if (this.D == 0) {
                i10 = 2131751707;
            }
            xy0Var.a(org.telegram.messenger.id.M0(i10, null), z9, false);
        }
        if (s0()) {
            org.telegram.messenger.g0.Z3(this.f41337n, true, 1.0f, true, z9);
            org.telegram.messenger.g0.Z3(this.f41336f, false, 1.0f, true, z9);
        } else if (r0()) {
            org.telegram.messenger.g0.Z3(this.f41337n, false, 1.0f, true, z9);
            org.telegram.messenger.g0.Z3(this.f41336f, true, 1.0f, true, z9);
        }
        if (r0()) {
            gi0 gi0Var = new gi0(this, z9, 1);
            this.T = gi0Var;
            org.telegram.messenger.g0.i3(gi0Var, 3000L);
        } else {
            this.f41341x.e(false, z9);
        }
        w0(q0(), z9);
        y0();
    }
}
