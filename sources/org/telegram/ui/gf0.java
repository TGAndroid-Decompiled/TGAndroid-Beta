package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gf0 extends org.telegram.ui.Components.pw0 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f37310t0 = 0;
    public final TextView E;
    public final LinearLayout F;
    public final org.telegram.ui.Components.xj0 G;
    public Bundle H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final ImageView L;
    public final ImageView M;
    public final org.telegram.ui.Components.uj0 N;
    public final org.telegram.ui.Components.uj0 O;
    public final org.telegram.ui.Components.uj0 P;
    public boolean Q;
    public Timer R;
    public Timer S;
    public int T;
    public final Object U;
    public int V;
    public int W;
    public final org.telegram.ui.Components.uj0 f37311a;
    public double f37312a0;
    public String f37313b;
    public double f37314b0;
    public String f37315c;
    public boolean f37316c0;
    public String d;
    public boolean f37317d0;
    public String e;
    public String f37318e0;
    public final qr f37319f;
    public final int f37320f0;
    public int f37321g0;
    public final org.telegram.ui.Components.voip.l2 h;
    public int f37322h0;
    public boolean f37323i0;
    public String f37324j0;
    public String f37325k0;
    public String f37326l0;
    public int m0;
    public final TextView f37327n;
    public String f37328n0;
    public Bundle f37329o0;
    public TLRPC.TL_auth_sentCode f37330p0;
    public boolean f37331q0;
    public final TextView f37332r;
    public final se0 f37333r0;
    public final org.telegram.ui.Components.xj0 f37334s;
    public final cg0 f37335s0;
    public final ef0 v;
    public final ld0 f37336w;
    public final ef0 f37337x;
    public final FrameLayout f37338y;

    public gf0(org.telegram.ui.cg0 r38, android.content.Context r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gf0.<init>(org.telegram.ui.cg0, android.content.Context, int):void");
    }

    public static void o(gf0 gf0Var, Context context) {
        String str;
        String str2;
        String str3;
        List<SubscriptionInfo> list;
        CharSequence carrierName;
        try {
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            Locale locale = Locale.US;
            String str4 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
            StringBuilder sb2 = new StringBuilder();
            sb2.append(gf0Var.e);
            sb2.append(" Android Registration/Login Issue ");
            sb2.append(str4);
            if (gf0Var.f37335s0.e) {
                str = " #paidauth";
            } else {
                str = "";
            }
            sb2.append(str);
            intent.putExtra("android.intent.extra.SUBJECT", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Technical Details (PLEASE DO NOT EDIT OR REMOVE)\n");
            sb3.append("Device: ");
            sb3.append(Build.MANUFACTURER);
            sb3.append(" ");
            sb3.append(Build.MODEL);
            sb3.append("\n");
            sb3.append("OS version: SDK ");
            int i10 = Build.VERSION.SDK_INT;
            sb3.append(i10);
            sb3.append("\n");
            sb3.append("Locale: ");
            sb3.append(Locale.getDefault());
            sb3.append("\n");
            sb3.append("\n");
            sb3.append("Target Phone: +");
            sb3.append(gf0Var.d);
            sb3.append("\n");
            sb3.append("\n");
            try {
                SubscriptionManager from = SubscriptionManager.from(gf0Var.getContext());
                if (i10 >= 30) {
                    list = from.getCompleteActiveSubscriptionInfoList();
                } else {
                    list = null;
                }
                if ((list == null || list.isEmpty()) && i10 >= 28) {
                    list = from.getAccessibleSubscriptionInfoList();
                }
                if (list == null || list.isEmpty()) {
                    list = from.getActiveSubscriptionInfoList();
                }
                if (list != null) {
                    for (SubscriptionInfo subscriptionInfo : list) {
                        String number = subscriptionInfo.getNumber();
                        if (!TextUtils.isEmpty(number)) {
                            String str5 = "SIM" + subscriptionInfo.getSimSlotIndex();
                            sb3.append(str5);
                            sb3.append(".Phone: ");
                            sb3.append(number);
                            sb3.append("\n");
                            sb3.append(str5);
                            sb3.append(".MCC: ");
                            sb3.append(subscriptionInfo.getMcc());
                            sb3.append("\n");
                            sb3.append(str5);
                            sb3.append(".MNC: ");
                            sb3.append(subscriptionInfo.getMnc());
                            sb3.append("\n");
                            sb3.append(str5);
                            sb3.append(".Carrier: ");
                            if (TextUtils.isEmpty(subscriptionInfo.getCarrierName())) {
                                carrierName = "unknown";
                            } else {
                                carrierName = subscriptionInfo.getCarrierName();
                            }
                            sb3.append(carrierName);
                            sb3.append("\n\n");
                        }
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                    SignalStrength signalStrength = ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSignalStrength();
                    if (signalStrength != null) {
                        sb3.append("Signal: ");
                        sb3.append(signalStrength.getLevel());
                        sb3.append("/4\n");
                    } else {
                        sb3.append("Signal: unknown\n");
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            } else {
                sb3.append("Signal: unknown\n");
            }
            sb3.append("Wi-Fi: ");
            sb3.append(AndroidUtilities.isWifiEnabled(context));
            sb3.append("\n");
            sb3.append("Airplane Mode: ");
            sb3.append(AndroidUtilities.isInAirplaneMode(context));
            sb3.append("\n");
            sb3.append("\n");
            sb3.append("App: ");
            sb3.append(BuildVars.APP_ID);
            sb3.append("\n");
            int i11 = packageInfo.versionCode % 10;
            if (i11 != 1 && i11 != 2) {
                if (ApplicationLoader.isStandaloneBuild()) {
                    str2 = "direct";
                } else if (ApplicationLoader.isBetaBuild()) {
                    str2 = "beta";
                } else if (ApplicationLoader.isHuaweiStoreBuild()) {
                    str2 = "huawei";
                } else {
                    str2 = "universal";
                }
            } else {
                str2 = "store";
            }
            sb3.append("App version: ");
            sb3.append(str4);
            sb3.append(" ");
            sb3.append(str2);
            sb3.append("\n");
            sb3.append("\n");
            sb3.append("Issue: ");
            if (gf0Var.f37335s0.e) {
                str3 = "no_otp";
            } else {
                str3 = "no_otp_paid";
            }
            sb3.append(str3);
            sb3.append("\n");
            if (!TextUtils.isEmpty(gf0Var.f37318e0)) {
                sb3.append("Error: ");
                sb3.append(gf0Var.f37318e0);
                sb3.append("\n");
            }
            sb3.append("\n\n================================================\n");
            sb3.append("WRITE YOUR COMMENT HERE:\n");
            sb3.append("\n");
            sb3.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb3.toString());
            gf0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            gf0Var.f37335s0.l1(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
        }
    }

    public static void r(org.telegram.ui.Components.uj0 uj0Var) {
        if (uj0Var != null) {
            uj0Var.Q(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.P9, false), "Bubble");
            int i10 = org.telegram.ui.ActionBar.h6.G6;
            uj0Var.Q(org.telegram.ui.ActionBar.h6.x0(null, i10, false), "Phone");
            uj0Var.Q(org.telegram.ui.ActionBar.h6.x0(null, i10, false), "Note");
        }
    }

    public void setProblemTextVisible(boolean z10) {
        float f7;
        ef0 ef0Var = this.f37337x;
        if (ef0Var != null) {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (ef0Var.getAlpha() != f7) {
                ef0Var.animate().cancel();
                ef0Var.animate().alpha(f7).setDuration(150L).start();
            }
        }
    }

    public final void A(int i10) {
        org.telegram.ui.Components.uj0 uj0Var = this.N;
        if (uj0Var != null) {
            if (this.Q) {
                return;
            }
            this.Q = true;
            org.telegram.ui.Components.uj0 uj0Var2 = this.f37311a;
            if (uj0Var2.f30976a0 != uj0Var2.e[0] - 1) {
                uj0Var2.f31000t0 = new ye0(this, i10, 0);
                return;
            }
            uj0Var.f31000t0 = new se0(this, 3);
            org.telegram.ui.Components.xj0 xj0Var = this.f37334s;
            xj0Var.setAutoRepeat(false);
            uj0Var.N(0, false, false);
            xj0Var.setAnimation(uj0Var);
            xj0Var.d();
            return;
        }
        this.f37335s0.n1(i10, true);
    }

    @Override
    public final boolean a() {
        if (this.f37320f0 != 3) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        int i10;
        cg0 cg0Var = this.f37335s0;
        if (cg0Var.F != 0) {
            cg0Var.finishFragment();
            return false;
        }
        int i11 = this.f37322h0;
        if (i11 != 0) {
            cg0Var.u1(i11, true, null, true);
            return false;
        } else if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cg0Var.getParentActivity());
            String string = LocaleController.getString(R.string.EditNumber);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
            b2Var.R = string;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("EditNumberInfo", R.string.EditNumberInfo, this.f37313b));
            alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Edit), new ue0(this, 0));
            cg0Var.showDialog(b2Var);
            return false;
        } else {
            this.f37317d0 = false;
            z(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.d;
            tL_auth_cancelCode.phone_code_hash = this.f37315c;
            i10 = ((org.telegram.ui.ActionBar.n2) cg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_cancelCode, new ci.e6(17), 10);
            w();
            u();
            this.H = null;
            int i12 = this.f37320f0;
            if (i12 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i12 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i12 == 3) {
                AndroidUtilities.setWaitingForCall(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.f37316c0 = false;
            return true;
        }
    }

    @Override
    public final void d() {
        this.f37317d0 = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (this.f37316c0) {
            qr qrVar = this.f37319f;
            if (qrVar.f40961f != null) {
                if (i10 == NotificationCenter.didReceiveSmsCode) {
                    qrVar.setText("" + objArr[0]);
                    h(null);
                } else if (i10 == NotificationCenter.didReceiveCall) {
                    String str = "" + objArr[0];
                    if (AndroidUtilities.checkPhonePattern(this.f37324j0, str)) {
                        if (!this.f37324j0.equals("*")) {
                            this.f37326l0 = str;
                            AndroidUtilities.endIncomingCall();
                        }
                        h(str);
                        CallReceiver.clearLastCall();
                    }
                }
            }
        }
    }

    @Override
    public final void f() {
        int i10 = this.f37320f0;
        if (i10 == 15) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.f37316c0 = false;
        w();
        u();
    }

    @Override
    public final void g() {
        Bundle bundle;
        this.f37323i0 = false;
        this.f37317d0 = false;
        if (this.f37322h0 != 0 && (bundle = this.H) != null) {
            bundle.putInt("timeout", this.V);
        }
    }

    @Override
    public String getHeaderName() {
        int i10 = this.f37320f0;
        if (i10 != 3 && i10 != 11) {
            return LocaleController.getString("YourCode", R.string.YourCode);
        }
        return this.f37313b;
    }

    @Override
    public final void h(String str) {
        int i10;
        int i11;
        int i12;
        cg0 cg0Var = this.f37335s0;
        int i13 = cg0Var.f35964a;
        if (i13 == 11) {
            if (this.f37317d0) {
                return;
            }
        } else if (!this.f37317d0) {
            if ((i13 < 1 || i13 > 4) && i13 != 15) {
                return;
            }
        } else {
            return;
        }
        qr qrVar = this.f37319f;
        if (str == null) {
            str = qrVar.getCode();
        }
        int i14 = 0;
        if (TextUtils.isEmpty(str)) {
            cg0.U0(cg0Var, qrVar, false);
            return;
        }
        int i15 = cg0Var.f35964a;
        if (i15 < 1 || i15 > 4 || !qrVar.e) {
            this.f37317d0 = true;
            int i16 = this.f37320f0;
            if (i16 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 3) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.f37316c0 = false;
            int i17 = cg0Var.F;
            if (i17 != 1) {
                if (i17 != 2) {
                    TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                    tL_auth_signIn.phone_number = this.d;
                    tL_auth_signIn.phone_code = str;
                    tL_auth_signIn.phone_code_hash = this.f37315c;
                    tL_auth_signIn.flags |= 1;
                    w();
                    qrVar.e = true;
                    tr[] trVarArr = qrVar.f40961f;
                    int length = trVarArr.length;
                    while (i14 < length) {
                        trVarArr[i14].j(0.0f);
                        i14++;
                    }
                    i12 = ((org.telegram.ui.ActionBar.n2) cg0Var).currentAccount;
                    A(ConnectionsManager.getInstance(i12).sendRequest(tL_auth_signIn, new te0(this, tL_auth_signIn, 0), 10));
                    cg0Var.v1(true, true);
                    return;
                }
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.f37315c;
                w();
                qrVar.e = true;
                tr[] trVarArr2 = qrVar.f40961f;
                int length2 = trVarArr2.length;
                while (i14 < length2) {
                    trVarArr2[i14].j(0.0f);
                    i14++;
                }
                i11 = ((org.telegram.ui.ActionBar.n2) cg0Var).currentAccount;
                A(ConnectionsManager.getInstance(i11).sendRequest(changephone, new m(this, 13), 2));
                cg0Var.v1(true, true);
                return;
            }
            this.d = cg0Var.G;
            TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
            confirmphone.phone_code = str;
            confirmphone.phone_code_hash = this.f37315c;
            w();
            qrVar.e = true;
            tr[] trVarArr3 = qrVar.f40961f;
            int length3 = trVarArr3.length;
            while (i14 < length3) {
                trVarArr3[i14].j(0.0f);
                i14++;
            }
            i10 = ((org.telegram.ui.ActionBar.n2) cg0Var).currentAccount;
            A(ConnectionsManager.getInstance(i10).sendRequest(confirmphone, new x40(10, this, confirmphone), 2));
        }
    }

    @Override
    public final void j() {
        org.telegram.ui.Components.uj0 uj0Var = this.f37311a;
        if (uj0Var != null) {
            uj0Var.M(0);
        }
        AndroidUtilities.runOnUIThread(new se0(this, 0), cg0.f35963t0);
    }

    @Override
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i10 = this.f37320f0;
        sb2.append(i10);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.H = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.f37326l0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i10);
        if (string2 != null) {
            qr qrVar = this.f37319f;
            if (qrVar.f40961f != null) {
                qrVar.setText(string2);
            }
        }
        int i11 = bundle.getInt("time");
        if (i11 != 0) {
            this.V = i11;
        }
        int i12 = bundle.getInt("open");
        if (i12 != 0) {
            this.T = i12;
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f37319f.getCode();
        int length = code.length();
        int i10 = this.f37320f0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i10, code);
        }
        String str = this.f37326l0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.H != null) {
            bundle.putBundle(i2.e.j(i10, "smsview_params_"), this.H);
        }
        int i11 = this.V;
        if (i11 != 0) {
            bundle.putInt("time", i11);
        }
        int i12 = this.T;
        if (i12 != 0) {
            bundle.putInt("open", i12);
        }
    }

    @Override
    public final void m(android.os.Bundle r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gf0.m(android.os.Bundle, boolean):void");
    }

    @Override
    public final void n() {
        int i10;
        if (this.f37335s0.i1()) {
            i10 = org.telegram.ui.ActionBar.h6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.D6;
        }
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        TextView textView = this.f37327n;
        textView.setTextColor(x02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.P9, false));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        this.f37332r.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        int i12 = this.f37320f0;
        if (i12 == 11) {
            int i13 = org.telegram.ui.ActionBar.h6.f21377y6;
            this.J.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
            this.K.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
            int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21133l6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.L.setColorFilter(new PorterDuffColorFilter(x03, mode));
            this.M.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i11, false), mode));
            this.I.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        }
        r(this.f37311a);
        r(this.N);
        r(this.O);
        r(this.P);
        qr qrVar = this.f37319f;
        if (qrVar != null) {
            qrVar.invalidate();
        }
        ef0 ef0Var = this.v;
        Integer num = (Integer) ef0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.h6.D6);
        }
        ef0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, num.intValue(), false));
        if (i12 != 15) {
            this.f37337x.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false));
        }
        this.E.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21227q7, false));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        tr[] trVarArr;
        boolean z10;
        super.onConfigurationChanged(configuration);
        qr qrVar = this.f37319f;
        if (qrVar != null && (trVarArr = qrVar.f40961f) != null) {
            for (tr trVar : trVarArr) {
                if (a() && !AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                trVar.setShowSoftInputOnFocusCompat(z10);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f37333r0);
    }

    public final void q(Runnable runnable) {
        if (this.f37320f0 == 3) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            qr qrVar = this.f37319f;
            tr[] trVarArr = qrVar.f40961f;
            if (i10 < trVarArr.length) {
                qrVar.postDelayed(new ye0(this, i10, 2), i10 * 75);
                i10++;
            } else {
                qrVar.postDelayed(new z70(25, this, runnable), (trVarArr.length * 75) + 400);
                return;
            }
        }
    }

    public final void s() {
        if (this.S != null) {
            return;
        }
        this.W = 15000;
        int i10 = this.V;
        if (i10 > 15000) {
            this.W = i10;
        }
        this.S = new Timer();
        this.f37314b0 = System.currentTimeMillis();
        this.S.schedule(new e6.r(this, 3), 0L, 1000L);
    }

    public final void t() {
        if (this.R != null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.h6.D6;
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        ef0 ef0Var = this.v;
        ef0Var.setTextColor(x02);
        ef0Var.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        Timer timer = new Timer();
        this.R = timer;
        timer.schedule(new ff0(this), 0L, 1000L);
    }

    public final void u() {
        try {
            synchronized (this.U) {
                Timer timer = this.S;
                if (timer != null) {
                    timer.cancel();
                    this.S = null;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void w() {
        ef0 ef0Var = this.v;
        int i10 = org.telegram.ui.ActionBar.h6.D6;
        ef0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.v.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        try {
            synchronized (this.U) {
                Timer timer = this.R;
                if (timer != null) {
                    timer.cancel();
                    this.R = null;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void x() {
        int i10;
        if (!this.f37317d0 && !this.f37323i0) {
            cg0 cg0Var = this.f37335s0;
            if (!cg0Var.f35982o0) {
                this.f37323i0 = true;
                this.v.invalidate();
                this.f37337x.invalidate();
                Bundle bundle = new Bundle();
                bundle.putString("phone", this.f37313b);
                bundle.putString("ephone", this.e);
                bundle.putString("phoneFormated", this.d);
                bundle.putInt("prevType", this.f37320f0);
                this.f37317d0 = true;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.d;
                tL_auth_resendCode.phone_code_hash = this.f37315c;
                i10 = ((org.telegram.ui.ActionBar.n2) cg0Var).currentAccount;
                A(ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new xe0(this, bundle, 1), 10));
            }
        }
    }

    public final void y() {
        float f7;
        qr qrVar = this.f37319f;
        try {
            qrVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i10 = 0;
        while (true) {
            tr[] trVarArr = qrVar.f40961f;
            if (i10 >= trVarArr.length) {
                break;
            }
            trVarArr[i10].setText("");
            qrVar.f40961f[i10].i(1.0f);
            i10++;
        }
        ld0 ld0Var = this.f37336w;
        if (ld0Var.getCurrentView() != this.E) {
            ld0Var.showNext();
        }
        qrVar.f40961f[0].requestFocus();
        if (this.f37320f0 == 11) {
            f7 = 3.5f;
        } else {
            f7 = 10.0f;
        }
        AndroidUtilities.shakeViewSpring(qrVar, f7, new se0(this, 7));
        se0 se0Var = this.f37333r0;
        removeCallbacks(se0Var);
        postDelayed(se0Var, 5000L);
        this.f37331q0 = true;
    }

    public final void z(boolean z10) {
        if (this.N != null) {
            if (!this.Q) {
                return;
            }
            this.Q = false;
            this.f37334s.setAutoRepeat(false);
            org.telegram.ui.Components.uj0 uj0Var = this.O;
            uj0Var.K(0);
            uj0Var.S(uj0Var.e[0] - 1, new se0(this, 1));
            return;
        }
        this.f37335s0.k1(z10, true);
    }
}
