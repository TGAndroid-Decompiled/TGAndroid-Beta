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
public class PasscodeActivity extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public int E;
    public int F;
    public String G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public org.telegram.ui.ActionBar.r0 R;
    public boolean S;
    public final ii0 T;
    public ji0 U;
    public l90 V;
    public b31 W;
    public org.telegram.ui.Components.ph0 f43138a;
    private int autoLockRow;
    public l4 f43139b;
    public org.telegram.ui.Components.ck0 f43140c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.fz0 f43141e;
    public org.telegram.ui.Components.xb0 f43142f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public mb0 f43143n;
    public TextView f43144r;
    public ImageView f43145s;
    public org.telegram.ui.Components.pr f43146w;
    public org.telegram.ui.Components.a10 f43147x;
    public final int f43148y;

    public PasscodeActivity(int i7) {
        super(null);
        this.E = 0;
        this.F = 0;
        this.T = new ii0(this, 5);
        this.f43148y = i7;
    }

    public static void Z(PasscodeActivity passcodeActivity, org.telegram.ui.Components.sb0 sb0Var, int i7) {
        int value = sb0Var.getValue();
        if (value == 0) {
            org.telegram.messenger.bz.f23211y = 0;
        } else if (value == 1) {
            org.telegram.messenger.bz.f23211y = 60;
        } else if (value == 2) {
            org.telegram.messenger.bz.f23211y = 300;
        } else if (value == 3) {
            org.telegram.messenger.bz.f23211y = 3600;
        } else if (value == 4) {
            org.telegram.messenger.bz.f23211y = 18000;
        }
        passcodeActivity.f43139b.g(i7);
        org.telegram.messenger.j10.i(passcodeActivity.currentAccount).v(false);
    }

    public static void a0(PasscodeActivity passcodeActivity, View view, int i7) {
        if (view.isEnabled()) {
            if (i7 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String M0 = org.telegram.messenger.gd.M0(2131751422, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                u1Var.S = M0;
                u1Var.U = org.telegram.messenger.gd.M0(2131751421, null);
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751420, null), new zr(passcodeActivity, 29));
                u1Var.show();
                org.telegram.ui.ActionBar.u6.U((TextView) u1Var.d(-1), org.telegram.ui.ActionBar.n6.f29635q7, null);
            } else if (i7 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
            } else if (i7 == passcodeActivity.autoLockRow) {
                if (passcodeActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                    String M02 = org.telegram.messenger.gd.M0(2131753798, null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f28744a;
                    u1Var2.S = M02;
                    org.telegram.ui.Components.sb0 sb0Var = new org.telegram.ui.Components.sb0(passcodeActivity.getParentActivity(), null);
                    sb0Var.setMinValue(0);
                    sb0Var.setMaxValue(4);
                    int i10 = org.telegram.messenger.bz.f23211y;
                    if (i10 == 0) {
                        sb0Var.setValue(0);
                    } else if (i10 == 60) {
                        sb0Var.setValue(1);
                    } else if (i10 == 300) {
                        sb0Var.setValue(2);
                    } else if (i10 == 3600) {
                        sb0Var.setValue(3);
                    } else if (i10 == 18000) {
                        sb0Var.setValue(4);
                    }
                    sb0Var.setFormatter(new l60(5));
                    alertDialog$Builder2.o(sb0Var);
                    alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131751343, null), new ai.r1(passcodeActivity, sb0Var, i7, 14));
                    passcodeActivity.showDialog(u1Var2);
                }
            } else if (i7 == passcodeActivity.fingerprintRow) {
                org.telegram.messenger.bz.D = !org.telegram.messenger.bz.D;
                org.telegram.messenger.j10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.s8) view).setChecked(org.telegram.messenger.bz.D);
            } else if (i7 == passcodeActivity.O) {
                org.telegram.messenger.bz.A = !org.telegram.messenger.bz.A;
                org.telegram.messenger.j10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.s8) view).setChecked(org.telegram.messenger.bz.A);
                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25155n0, Boolean.FALSE);
                if (!org.telegram.messenger.bz.A) {
                    org.telegram.ui.Components.b5.r0(passcodeActivity, null, org.telegram.messenger.gd.M0(2131745649, null), null);
                }
            } else if (i7 == passcodeActivity.K) {
                org.telegram.ui.Wallet.u0 D = org.telegram.ui.Wallet.u0.D(passcodeActivity.currentAccount);
                boolean z10 = !D.S();
                if (D.f45093m != z10) {
                    D.f45093m = z10;
                    try {
                        org.telegram.ui.Wallet.u0.C().getSharedPreferences("gram_wallet", 0).edit().putBoolean("passcode", D.f45093m).apply();
                    } catch (Exception e10) {
                        org.telegram.ui.Wallet.u0.o("failed to save prefs", e10);
                    }
                }
                org.telegram.messenger.j10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.s8) view).setChecked(D.S());
            } else if (i7 == passcodeActivity.L) {
                org.telegram.ui.Wallet.u0 D2 = org.telegram.ui.Wallet.u0.D(passcodeActivity.currentAccount);
                boolean R = D2.R();
                boolean z11 = !R;
                ai.u2 u2Var = new ai.u2(8, view, R);
                org.telegram.ui.Wallet.z0 z0Var = D2.f45085c;
                if (z0Var == null) {
                    u2Var.a(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.Wallet.z0.f45333i.execute(new ai.l2(z0Var, z0Var.l(), z11, new org.telegram.ui.Wallet.k(u2Var, 0), 4));
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

    public static org.telegram.ui.ActionBar.h2 p0() {
        if (!org.telegram.messenger.bz.f23194s.isEmpty()) {
            return new PasscodeActivity(2);
        }
        return new g(6);
    }

    public final void A0() {
        this.J = -1;
        this.K = -1;
        this.fingerprintRow = -1;
        this.L = -1;
        this.M = -1;
        this.H = 1;
        this.Q = 3;
        this.changePasscodeRow = 2;
        try {
            if (new android.support.v4.media.session.a0(new androidx.biometric.t(org.telegram.messenger.t0.f26913b, 0)).c(15) == 0) {
                Typeface typeface = org.telegram.messenger.g0.f24090a;
                if (((KeyguardManager) org.telegram.messenger.t0.f26913b.getSystemService("keyguard")).isKeyguardSecure()) {
                    int i7 = this.Q;
                    this.Q = i7 + 1;
                    this.fingerprintRow = i7;
                }
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        int i10 = this.Q;
        this.autoLockRow = i10;
        this.Q = i10 + 2;
        this.I = i10 + 1;
        if (((org.telegram.messenger.h0) getMessagesController().A7.f26159p0.f13998b).f24336c) {
            int i11 = this.Q;
            this.J = i11;
            this.Q = i11 + 2;
            this.K = i11 + 1;
            if (org.telegram.ui.Wallet.z0.i(org.telegram.messenger.t0.f26913b)) {
                int i12 = this.Q;
                this.Q = i12 + 1;
                this.L = i12;
            }
            int i13 = this.Q;
            this.Q = i13 + 1;
            this.M = i13;
        }
        int i14 = this.Q;
        this.N = i14;
        this.O = i14 + 1;
        this.P = i14 + 2;
        this.Q = i14 + 4;
        this.disablePasscodeRow = i14 + 3;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29395d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29692t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29674s8));
    }

    @Override
    public final android.view.View createView(android.content.Context r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PasscodeActivity.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25155n0) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.f43148y == 0) {
                A0();
                l4 l4Var = this.f43139b;
                if (l4Var != null) {
                    l4Var.f();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f43140c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29337a7));
        if (this.f43148y != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29674s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29523k6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29541l6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43140c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43140c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.N6));
        return arrayList;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        if (this.f43148y != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        if (this.f43148y == 0) {
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
            mb0 mb0Var = this.f43143n;
            er[] erVarArr = mb0Var.f46274f;
            if (i7 < erVarArr.length) {
                er erVar = erVarArr[i7];
                erVar.postDelayed(new ki0(erVar, 0), i7 * 75);
                i7++;
            } else {
                mb0Var.postDelayed(new we0(7, this, runnable), (erVarArr.length * 75) + 350);
                return;
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        er[] erVarArr;
        int i7;
        super.onConfigurationChanged(configuration);
        w0(q0(), false);
        org.telegram.ui.Components.ph0 ph0Var = this.f43138a;
        if (ph0Var != null) {
            if (!org.telegram.messenger.g0.O1()) {
                Point point = org.telegram.messenger.g0.f24118q;
                if (point.x < point.y) {
                    i7 = 0;
                    ph0Var.setVisibility(i7);
                }
            }
            i7 = 8;
            ph0Var.setVisibility(i7);
        }
        mb0 mb0Var = this.f43143n;
        if (mb0Var != null && (erVarArr = mb0Var.f46274f) != null) {
            for (er erVar : erVarArr) {
                erVar.setShowSoftInputOnFocusCompat(!q0());
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        A0();
        if (this.f43148y == 0) {
            org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25155n0);
            return true;
        }
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f43148y == 0) {
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25155n0);
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
        l4 l4Var = this.f43139b;
        if (l4Var != null) {
            l4Var.f();
        }
        if (this.f43148y != 0 && !q0()) {
            org.telegram.messenger.g0.h3(new ii0(this, 6), 200L);
        }
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        if (q0()) {
            org.telegram.messenger.g0.v1(this.fragmentView);
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            EditTextBoldCursor editTextBoldCursor = this.h;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.u6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.n6.f29541l6, null);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f43148y != 0) {
            y0();
        }
    }

    public final boolean q0() {
        if (s0() && this.f43148y != 0 && !org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.f24118q;
            if (point.x < point.y && !org.telegram.messenger.g0.C1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean r0() {
        int i7 = this.f43148y;
        if ((i7 == 1 && this.E == 1) || ((i7 == 2 || i7 == 3) && org.telegram.messenger.bz.f23191r == 1)) {
            return true;
        }
        return false;
    }

    public final boolean s0() {
        int i7 = this.f43148y;
        if ((i7 == 1 && this.E == 0) || ((i7 == 2 || i7 == 3) && org.telegram.messenger.bz.f23191r == 0)) {
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
            for (er erVar : this.f43143n.f46274f) {
                erVar.A(1.0f);
            }
        } else {
            this.f43142f.a(1.0f);
        }
        if (s0()) {
            view = this.f43143n;
        } else {
            view = this.f43142f;
        }
        if (s0()) {
            f10 = 10.0f;
        } else {
            f10 = 4.0f;
        }
        org.telegram.messenger.g0.E3(f10, view, new ii0(this, 3));
    }

    public final void u0() {
        String obj;
        er[] erVarArr;
        er[] erVarArr2;
        if (r0() && this.h.getText().length() == 0) {
            t0();
            return;
        }
        if (s0()) {
            obj = this.f43143n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        int i7 = this.f43148y;
        if (i7 == 1) {
            if (!this.G.equals(obj)) {
                org.telegram.messenger.g0.V3(this.f43144r, true);
                for (er erVar : this.f43143n.f46274f) {
                    erVar.setText("");
                }
                if (s0()) {
                    this.f43143n.f46274f[0].requestFocus();
                }
                this.h.setText("");
                t0();
                this.f43143n.removeCallbacks(this.T);
                this.f43143n.post(new ii0(this, 0));
                return;
            }
            boolean isEmpty = org.telegram.messenger.bz.f23194s.isEmpty();
            try {
                org.telegram.messenger.bz.f23205w = new byte[16];
                Utilities.f22777b.nextBytes(org.telegram.messenger.bz.f23205w);
                byte[] bytes = this.G.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(org.telegram.messenger.bz.f23205w, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(org.telegram.messenger.bz.f23205w, 0, bArr, bytes.length + 16, 16);
                org.telegram.messenger.bz.f23194s = Utilities.f(Utilities.o(length, bArr));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            org.telegram.messenger.bz.A = true;
            org.telegram.messenger.bz.f23191r = this.E;
            org.telegram.messenger.bz.y();
            this.h.clearFocus();
            org.telegram.messenger.g0.v1(this.h);
            for (er erVar2 : this.f43143n.f46274f) {
                erVar2.clearFocus();
                org.telegram.messenger.g0.v1(erVar2);
            }
            this.f43146w.setEditText(null);
            o0(new ji0(this, isEmpty, 0));
        } else if (i7 == 2 || i7 == 3) {
            long j3 = org.telegram.messenger.bz.f23197t;
            if (j3 > 0) {
                Toast.makeText(getParentActivity(), org.telegram.messenger.gd.a0("TooManyTries", null, 2131743801, org.telegram.messenger.gd.G(Math.max(1, (int) Math.ceil(j3 / 1000.0d)), "Seconds", new Object[0])), 0).show();
                for (er erVar3 : this.f43143n.f46274f) {
                    erVar3.setText("");
                }
                this.h.setText("");
                if (s0()) {
                    this.f43143n.f46274f[0].requestFocus();
                }
                t0();
            } else if (!org.telegram.messenger.bz.g(obj)) {
                org.telegram.messenger.bz.r();
                this.h.setText("");
                for (er erVar4 : this.f43143n.f46274f) {
                    erVar4.setText("");
                }
                if (s0()) {
                    this.f43143n.f46274f[0].requestFocus();
                }
                t0();
            } else {
                org.telegram.messenger.bz.v = 0;
                org.telegram.messenger.bz.y();
                this.h.clearFocus();
                org.telegram.messenger.g0.v1(this.h);
                for (er erVar5 : this.f43143n.f46274f) {
                    erVar5.clearFocus();
                    org.telegram.messenger.g0.v1(erVar5);
                }
                this.f43146w.setEditText(null);
                if (i7 == 3) {
                    o0(new ii0(this, 1));
                } else {
                    o0(new ii0(this, 2));
                }
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        if (this.f43148y == 0) {
            return true;
        }
        return false;
    }

    public final void v0() {
        String obj;
        if ((this.E == 1 && this.h.getText().length() == 0) || (this.E == 0 && this.f43143n.getCode().length() != 4)) {
            t0();
            return;
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.R;
        if (r0Var != null) {
            r0Var.setVisibility(8);
        }
        this.d.setText(org.telegram.messenger.gd.M0(2131751804, null));
        this.f43141e.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131747463, null)));
        if (s0()) {
            obj = this.f43143n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        this.G = obj;
        this.h.setText("");
        this.h.setInputType(524417);
        for (er erVar : this.f43143n.f46274f) {
            erVar.setText("");
        }
        y0();
        this.F = 1;
    }

    public final void w0(boolean z10, boolean z11) {
        float f10;
        org.telegram.ui.Components.lr lrVar;
        if (z10) {
            org.telegram.messenger.g0.v1(this.fragmentView);
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        } else {
            org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
        }
        int i7 = 0;
        float f11 = 1.0f;
        float f12 = 0.0f;
        if (!z11) {
            org.telegram.ui.Components.pr prVar = this.f43146w;
            if (!z10) {
                i7 = 8;
            }
            prVar.setVisibility(i7);
            org.telegram.ui.Components.pr prVar2 = this.f43146w;
            if (!z10) {
                f11 = 0.0f;
            }
            prVar2.setAlpha(f11);
            org.telegram.ui.Components.pr prVar3 = this.f43146w;
            if (!z10) {
                f12 = org.telegram.messenger.g0.L(230.0f);
            }
            prVar3.setTranslationY(f12);
            this.fragmentView.requestLayout();
            return;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z10) {
            f11 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration(150L);
        if (z10) {
            lrVar = org.telegram.ui.Components.lr.f37208f;
        } else {
            lrVar = org.telegram.ui.Components.xs.f42178e;
        }
        duration.setInterpolator(lrVar);
        duration.addUpdateListener(new a3(this, 17));
        duration.addListener(new c30(3, this, z10));
        duration.start();
    }

    public final void x0(Runnable runnable) {
        this.V = (l90) runnable;
    }

    public final void y0() {
        if (s0()) {
            this.f43143n.f46274f[0].requestFocus();
            if (!q0()) {
                org.telegram.messenger.g0.I3(this.f43143n.f46274f[0]);
            }
        } else if (r0()) {
            this.h.requestFocus();
            org.telegram.messenger.g0.I3(this.h);
        }
    }

    public final void z0() {
        String charSequence;
        int i7;
        boolean z10;
        int i10 = 2131751695;
        int i11 = this.f43148y;
        if (i11 == 2) {
            charSequence = org.telegram.messenger.gd.M0(2131751100, null);
        } else if (i11 == 3) {
            charSequence = org.telegram.messenger.gd.M0(2131742955, null);
        } else if (this.F == 0) {
            if (this.E == 0) {
                i7 = 2131751696;
            } else {
                i7 = 2131751695;
            }
            charSequence = org.telegram.messenger.gd.M0(i7, null);
        } else {
            charSequence = this.f43141e.getCurrentView().getText().toString();
        }
        if (!this.f43141e.getCurrentView().getText().equals(charSequence) && !TextUtils.isEmpty(this.f43141e.getCurrentView().getText())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == 2) {
            this.f43141e.a(org.telegram.messenger.gd.M0(2131751100, null), z10, false);
        } else if (i11 == 3) {
            this.f43141e.setText(org.telegram.messenger.gd.M0(2131742955, null));
        } else if (this.F == 0) {
            org.telegram.ui.Components.fz0 fz0Var = this.f43141e;
            if (this.E == 0) {
                i10 = 2131751696;
            }
            fz0Var.a(org.telegram.messenger.gd.M0(i10, null), z10, false);
        }
        if (s0()) {
            org.telegram.messenger.g0.X3(this.f43143n, true, 1.0f, true, z10);
            org.telegram.messenger.g0.X3(this.f43142f, false, 1.0f, true, z10);
        } else if (r0()) {
            org.telegram.messenger.g0.X3(this.f43143n, false, 1.0f, true, z10);
            org.telegram.messenger.g0.X3(this.f43142f, true, 1.0f, true, z10);
        }
        if (r0()) {
            ji0 ji0Var = new ji0(this, z10, 1);
            this.U = ji0Var;
            org.telegram.messenger.g0.h3(ji0Var, 3000L);
        } else {
            this.f43147x.e(false, z10);
        }
        w0(q0(), z10);
        y0();
    }
}
