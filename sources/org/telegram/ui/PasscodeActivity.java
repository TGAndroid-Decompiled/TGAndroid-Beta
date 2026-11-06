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
    public final di0 S;
    public ei0 T;
    public l90 U;
    public org.telegram.ui.Wallet.n V;
    public org.telegram.ui.Components.ch0 f41321a;
    private int autoLockRow;
    public l4 f41322b;
    public org.telegram.ui.Components.pj0 f41323c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.wy0 f41324e;
    public org.telegram.ui.Components.lb0 f41325f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public lb0 f41326n;
    public TextView f41327r;
    public ImageView f41328s;
    public org.telegram.ui.Components.br f41329w;
    public org.telegram.ui.Components.p00 f41330x;
    public final int f41331y;

    public PasscodeActivity(int i7) {
        super(null);
        this.D = 0;
        this.E = 0;
        this.S = new di0(this, 5);
        this.f41331y = i7;
    }

    public static void Z(PasscodeActivity passcodeActivity, org.telegram.ui.Components.hb0 hb0Var, int i7) {
        int value = hb0Var.getValue();
        if (value == 0) {
            org.telegram.messenger.iz.f23430y = 0;
        } else if (value == 1) {
            org.telegram.messenger.iz.f23430y = 60;
        } else if (value == 2) {
            org.telegram.messenger.iz.f23430y = 300;
        } else if (value == 3) {
            org.telegram.messenger.iz.f23430y = 3600;
        } else if (value == 4) {
            org.telegram.messenger.iz.f23430y = 18000;
        }
        passcodeActivity.f41322b.g(i7);
        org.telegram.messenger.p10.i(passcodeActivity.currentAccount).v(false);
    }

    public static void a0(PasscodeActivity passcodeActivity, View view, int i7) {
        if (view.isEnabled()) {
            if (i7 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String M0 = org.telegram.messenger.hd.M0(2131751434, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.hd.M0(2131751433, null);
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751432, null), new wr(passcodeActivity, 29));
                u1Var.show();
                org.telegram.ui.ActionBar.r6.V((TextView) u1Var.d(-1), org.telegram.ui.ActionBar.k6.f28090q7, null);
            } else if (i7 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
            } else if (i7 == passcodeActivity.autoLockRow) {
                if (passcodeActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                    String M02 = org.telegram.messenger.hd.M0(2131753800, null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27293a;
                    u1Var2.R = M02;
                    org.telegram.ui.Components.hb0 hb0Var = new org.telegram.ui.Components.hb0(passcodeActivity.getParentActivity(), null);
                    hb0Var.setMinValue(0);
                    hb0Var.setMaxValue(4);
                    int i10 = org.telegram.messenger.iz.f23430y;
                    if (i10 == 0) {
                        hb0Var.setValue(0);
                    } else if (i10 == 60) {
                        hb0Var.setValue(1);
                    } else if (i10 == 300) {
                        hb0Var.setValue(2);
                    } else if (i10 == 3600) {
                        hb0Var.setValue(3);
                    } else if (i10 == 18000) {
                        hb0Var.setValue(4);
                    }
                    hb0Var.setFormatter(new org.telegram.ui.Components.il0(28));
                    alertDialog$Builder2.o(hb0Var);
                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131751355, null), new jg.a2(passcodeActivity, hb0Var, i7, 12));
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
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25032n0, Boolean.FALSE);
                if (!org.telegram.messenger.iz.A) {
                    org.telegram.ui.Components.v4.r0(passcodeActivity, null, org.telegram.messenger.hd.M0(2131745845, null), null);
                }
            } else if (i7 == passcodeActivity.J) {
                org.telegram.ui.Wallet.n0 x10 = org.telegram.ui.Wallet.n0.x(passcodeActivity.currentAccount);
                boolean z9 = !x10.K();
                if (x10.f42802m != z9) {
                    x10.f42802m = z9;
                    try {
                        org.telegram.ui.Wallet.n0.w().getSharedPreferences("gram_wallet", 0).edit().putBoolean("passcode", x10.f42802m).apply();
                    } catch (Exception e10) {
                        org.telegram.ui.Wallet.n0.k("failed to save prefs", e10);
                    }
                }
                org.telegram.messenger.p10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.r8) view).setChecked(x10.K());
            } else if (i7 == passcodeActivity.K) {
                org.telegram.ui.Wallet.n0 x11 = org.telegram.ui.Wallet.n0.x(passcodeActivity.currentAccount);
                boolean J = x11.J();
                boolean z10 = !J;
                bi.b9 b9Var = new bi.b9(7, view, J);
                org.telegram.ui.Wallet.r0 r0Var = x11.f42794c;
                if (r0Var == null) {
                    b9Var.a(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.Wallet.r0.h.execute(new org.telegram.messenger.video.n(r0Var, r0Var.l(), z10, new org.telegram.ui.Wallet.k(b9Var, 0), 3));
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
        if (!org.telegram.messenger.iz.f23413s.isEmpty()) {
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
            if (new android.support.v4.media.session.a0(new androidx.biometric.t(org.telegram.messenger.t0.f25563b, 0)).d(15) == 0) {
                Typeface typeface = org.telegram.messenger.g0.f22516a;
                if (((KeyguardManager) org.telegram.messenger.t0.f25563b.getSystemService("keyguard")).isKeyguardSecure()) {
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
        if (((org.telegram.messenger.h0) getMessagesController().f24935x7.f24442j0.f13889b).f22774c) {
            int i11 = this.P;
            this.I = i11;
            this.P = i11 + 2;
            this.J = i11 + 1;
            if (org.telegram.ui.Wallet.r0.i(org.telegram.messenger.t0.f25563b)) {
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28129s8));
    }

    @Override
    public final android.view.View createView(android.content.Context r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PasscodeActivity.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25032n0) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.f41331y == 0) {
                A0();
                l4 l4Var = this.f41322b;
                if (l4Var != null) {
                    l4Var.f();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f41323c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27793a7));
        if (this.f41331y != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28129s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27978k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27996l6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41323c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41323c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        return arrayList;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        if (this.f41331y != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        if (this.f41331y == 0) {
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
            lb0 lb0Var = this.f41326n;
            br[] brVarArr = lb0Var.f52309f;
            if (i7 < brVarArr.length) {
                br brVar = brVarArr[i7];
                brVar.postDelayed(new fi0(brVar, 0), i7 * 75);
                i7++;
            } else {
                lb0Var.postDelayed(new zc0(16, this, runnable), (brVarArr.length * 75) + 350);
                return;
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        br[] brVarArr;
        int i7;
        super.onConfigurationChanged(configuration);
        w0(q0(), false);
        org.telegram.ui.Components.ch0 ch0Var = this.f41321a;
        if (ch0Var != null) {
            if (!org.telegram.messenger.g0.O1()) {
                Point point = org.telegram.messenger.g0.f22544q;
                if (point.x < point.y) {
                    i7 = 0;
                    ch0Var.setVisibility(i7);
                }
            }
            i7 = 8;
            ch0Var.setVisibility(i7);
        }
        lb0 lb0Var = this.f41326n;
        if (lb0Var != null && (brVarArr = lb0Var.f52309f) != null) {
            for (br brVar : brVarArr) {
                brVar.setShowSoftInputOnFocusCompat(!q0());
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        A0();
        if (this.f41331y == 0) {
            org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25032n0);
            return true;
        }
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f41331y == 0) {
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25032n0);
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
        l4 l4Var = this.f41322b;
        if (l4Var != null) {
            l4Var.f();
        }
        if (this.f41331y != 0 && !q0()) {
            org.telegram.messenger.g0.i3(new di0(this, 6), 200L);
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
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.f27996l6, null);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9 && this.f41331y != 0) {
            y0();
        }
    }

    public final boolean q0() {
        if (s0() && this.f41331y != 0 && !org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.f22544q;
            if (point.x < point.y && !org.telegram.messenger.g0.C1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean r0() {
        int i7 = this.f41331y;
        if ((i7 == 1 && this.D == 1) || ((i7 == 2 || i7 == 3) && org.telegram.messenger.iz.f23410r == 1)) {
            return true;
        }
        return false;
    }

    public final boolean s0() {
        int i7 = this.f41331y;
        if ((i7 == 1 && this.D == 0) || ((i7 == 2 || i7 == 3) && org.telegram.messenger.iz.f23410r == 0)) {
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
            for (br brVar : this.f41326n.f52309f) {
                brVar.z(1.0f);
            }
        } else {
            this.f41325f.a(1.0f);
        }
        if (s0()) {
            view = this.f41326n;
        } else {
            view = this.f41325f;
        }
        if (s0()) {
            f10 = 10.0f;
        } else {
            f10 = 4.0f;
        }
        org.telegram.messenger.g0.G3(f10, view, new di0(this, 3));
    }

    public final void u0() {
        String obj;
        br[] brVarArr;
        br[] brVarArr2;
        if (r0() && this.h.getText().length() == 0) {
            t0();
            return;
        }
        if (s0()) {
            obj = this.f41326n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        int i7 = this.f41331y;
        if (i7 == 1) {
            if (!this.F.equals(obj)) {
                org.telegram.messenger.g0.X3(this.f41327r, true);
                for (br brVar : this.f41326n.f52309f) {
                    brVar.setText("");
                }
                if (s0()) {
                    this.f41326n.f52309f[0].requestFocus();
                }
                this.h.setText("");
                t0();
                this.f41326n.removeCallbacks(this.S);
                this.f41326n.post(new di0(this, 0));
                return;
            }
            boolean isEmpty = org.telegram.messenger.iz.f23413s.isEmpty();
            try {
                org.telegram.messenger.iz.f23424w = new byte[16];
                Utilities.f21331b.nextBytes(org.telegram.messenger.iz.f23424w);
                byte[] bytes = this.F.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(org.telegram.messenger.iz.f23424w, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(org.telegram.messenger.iz.f23424w, 0, bArr, bytes.length + 16, 16);
                org.telegram.messenger.iz.f23413s = Utilities.f(Utilities.o(length, bArr));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            org.telegram.messenger.iz.A = true;
            org.telegram.messenger.iz.f23410r = this.D;
            org.telegram.messenger.iz.y();
            this.h.clearFocus();
            org.telegram.messenger.g0.v1(this.h);
            for (br brVar2 : this.f41326n.f52309f) {
                brVar2.clearFocus();
                org.telegram.messenger.g0.v1(brVar2);
            }
            this.f41329w.setEditText(null);
            o0(new ei0(this, isEmpty, 0));
        } else if (i7 == 2 || i7 == 3) {
            long j3 = org.telegram.messenger.iz.f23416t;
            if (j3 > 0) {
                Toast.makeText(getParentActivity(), org.telegram.messenger.hd.a0("TooManyTries", null, 2131744037, org.telegram.messenger.hd.G(Math.max(1, (int) Math.ceil(j3 / 1000.0d)), "Seconds", new Object[0])), 0).show();
                for (br brVar3 : this.f41326n.f52309f) {
                    brVar3.setText("");
                }
                this.h.setText("");
                if (s0()) {
                    this.f41326n.f52309f[0].requestFocus();
                }
                t0();
            } else if (!org.telegram.messenger.iz.g(obj)) {
                org.telegram.messenger.iz.r();
                this.h.setText("");
                for (br brVar4 : this.f41326n.f52309f) {
                    brVar4.setText("");
                }
                if (s0()) {
                    this.f41326n.f52309f[0].requestFocus();
                }
                t0();
            } else {
                org.telegram.messenger.iz.v = 0;
                org.telegram.messenger.iz.y();
                this.h.clearFocus();
                org.telegram.messenger.g0.v1(this.h);
                for (br brVar5 : this.f41326n.f52309f) {
                    brVar5.clearFocus();
                    org.telegram.messenger.g0.v1(brVar5);
                }
                this.f41329w.setEditText(null);
                if (i7 == 3) {
                    o0(new di0(this, 1));
                } else {
                    o0(new di0(this, 2));
                }
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        if (this.f41331y == 0) {
            return true;
        }
        return false;
    }

    public final void v0() {
        String obj;
        if ((this.D == 1 && this.h.getText().length() == 0) || (this.D == 0 && this.f41326n.getCode().length() != 4)) {
            t0();
            return;
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.Q;
        if (r0Var != null) {
            r0Var.setVisibility(8);
        }
        this.d.setText(org.telegram.messenger.hd.M0(2131751815, null));
        this.f41324e.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747655, null)));
        if (s0()) {
            obj = this.f41326n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        this.F = obj;
        this.h.setText("");
        this.h.setInputType(524417);
        for (br brVar : this.f41326n.f52309f) {
            brVar.setText("");
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
            org.telegram.ui.Components.br brVar = this.f41329w;
            if (!z9) {
                i7 = 8;
            }
            brVar.setVisibility(i7);
            org.telegram.ui.Components.br brVar2 = this.f41329w;
            if (!z9) {
                f11 = 0.0f;
            }
            brVar2.setAlpha(f11);
            org.telegram.ui.Components.br brVar3 = this.f41329w;
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
            xqVar = org.telegram.ui.Components.xq.f40345f;
        } else {
            xqVar = org.telegram.ui.Components.ks.f35403e;
        }
        duration.setInterpolator(xqVar);
        duration.addUpdateListener(new a3(this, 17));
        duration.addListener(new z40(2, this, z9));
        duration.start();
    }

    public final void x0(Runnable runnable) {
        this.U = (l90) runnable;
    }

    public final void y0() {
        if (s0()) {
            this.f41326n.f52309f[0].requestFocus();
            if (!q0()) {
                org.telegram.messenger.g0.K3(this.f41326n.f52309f[0]);
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
        int i10 = 2131751707;
        int i11 = this.f41331y;
        if (i11 == 2) {
            charSequence = org.telegram.messenger.hd.M0(2131751112, null);
        } else if (i11 == 3) {
            charSequence = org.telegram.messenger.hd.M0(2131743194, null);
        } else if (this.E == 0) {
            if (this.D == 0) {
                i7 = 2131751708;
            } else {
                i7 = 2131751707;
            }
            charSequence = org.telegram.messenger.hd.M0(i7, null);
        } else {
            charSequence = this.f41324e.getCurrentView().getText().toString();
        }
        if (!this.f41324e.getCurrentView().getText().equals(charSequence) && !TextUtils.isEmpty(this.f41324e.getCurrentView().getText())) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i11 == 2) {
            this.f41324e.a(org.telegram.messenger.hd.M0(2131751112, null), z9, false);
        } else if (i11 == 3) {
            this.f41324e.setText(org.telegram.messenger.hd.M0(2131743194, null));
        } else if (this.E == 0) {
            org.telegram.ui.Components.wy0 wy0Var = this.f41324e;
            if (this.D == 0) {
                i10 = 2131751708;
            }
            wy0Var.a(org.telegram.messenger.hd.M0(i10, null), z9, false);
        }
        if (s0()) {
            org.telegram.messenger.g0.Z3(this.f41326n, true, 1.0f, true, z9);
            org.telegram.messenger.g0.Z3(this.f41325f, false, 1.0f, true, z9);
        } else if (r0()) {
            org.telegram.messenger.g0.Z3(this.f41326n, false, 1.0f, true, z9);
            org.telegram.messenger.g0.Z3(this.f41325f, true, 1.0f, true, z9);
        }
        if (r0()) {
            ei0 ei0Var = new ei0(this, z9, 1);
            this.T = ei0Var;
            org.telegram.messenger.g0.i3(ei0Var, 3000L);
        } else {
            this.f41330x.e(false, z9);
        }
        w0(q0(), z9);
        y0();
    }
}
