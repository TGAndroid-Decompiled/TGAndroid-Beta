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
public final class dg0 extends org.telegram.ui.Components.tw0 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f34985t0 = 0;
    public final TextView E;
    public final LinearLayout F;
    public final org.telegram.ui.Components.bk0 G;
    public Bundle H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final ImageView L;
    public final ImageView M;
    public final org.telegram.ui.Components.yj0 N;
    public final org.telegram.ui.Components.yj0 O;
    public final org.telegram.ui.Components.yj0 P;
    public boolean Q;
    public Timer R;
    public Timer S;
    public int T;
    public final Object U;
    public int V;
    public int W;
    public final org.telegram.ui.Components.yj0 f34986a;
    public double f34987a0;
    public String f34988b;
    public double f34989b0;
    public String f34990c;
    public boolean f34991c0;
    public String d;
    public boolean f34992d0;
    public String e;
    public String f34993e0;
    public final hs f34994f;
    public final int f34995f0;
    public int f34996g0;
    public final org.telegram.ui.Components.voip.l2 h;
    public int f34997h0;
    public boolean f34998i0;
    public String f34999j0;
    public String f35000k0;
    public String f35001l0;
    public int m0;
    public final TextView f35002n;
    public String f35003n0;
    public Bundle f35004o0;
    public TLRPC.TL_auth_sentCode f35005p0;
    public boolean f35006q0;
    public final TextView f35007r;
    public final qf0 f35008r0;
    public final org.telegram.ui.Components.bk0 f35009s;
    public final ah0 f35010s0;
    public final bg0 v;
    public final ie0 f35011w;
    public final bg0 f35012x;
    public final FrameLayout f35013y;

    public dg0(org.telegram.ui.ah0 r38, android.content.Context r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dg0.<init>(org.telegram.ui.ah0, android.content.Context, int):void");
    }

    public static void o(dg0 dg0Var, Context context) {
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
            sb2.append(dg0Var.e);
            sb2.append(" Android Registration/Login Issue ");
            sb2.append(str4);
            if (dg0Var.f35010s0.e) {
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
            sb3.append(dg0Var.d);
            sb3.append("\n");
            sb3.append("\n");
            try {
                SubscriptionManager from = SubscriptionManager.from(dg0Var.getContext());
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
            if (dg0Var.f35010s0.e) {
                str3 = "no_otp";
            } else {
                str3 = "no_otp_paid";
            }
            sb3.append(str3);
            sb3.append("\n");
            if (!TextUtils.isEmpty(dg0Var.f34993e0)) {
                sb3.append("Error: ");
                sb3.append(dg0Var.f34993e0);
                sb3.append("\n");
            }
            sb3.append("\n\n================================================\n");
            sb3.append("WRITE YOUR COMMENT HERE:\n");
            sb3.append("\n");
            sb3.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb3.toString());
            dg0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            dg0Var.f35010s0.l1(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
        }
    }

    public static void r(org.telegram.ui.Components.yj0 yj0Var) {
        if (yj0Var != null) {
            yj0Var.Q(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.P9, false), "Bubble");
            int i10 = org.telegram.ui.ActionBar.g6.G6;
            yj0Var.Q(org.telegram.ui.ActionBar.g6.x0(null, i10, false), "Phone");
            yj0Var.Q(org.telegram.ui.ActionBar.g6.x0(null, i10, false), "Note");
        }
    }

    public void setProblemTextVisible(boolean z10) {
        float f7;
        bg0 bg0Var = this.f35012x;
        if (bg0Var != null) {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (bg0Var.getAlpha() != f7) {
                bg0Var.animate().cancel();
                bg0Var.animate().alpha(f7).setDuration(150L).start();
            }
        }
    }

    public final void A(int i10) {
        org.telegram.ui.Components.yj0 yj0Var = this.N;
        if (yj0Var != null) {
            if (this.Q) {
                return;
            }
            this.Q = true;
            org.telegram.ui.Components.yj0 yj0Var2 = this.f34986a;
            if (yj0Var2.f31285a0 != yj0Var2.e[0] - 1) {
                yj0Var2.f31309t0 = new wf0(this, i10, 0);
                return;
            }
            yj0Var.f31309t0 = new qf0(this, 3);
            org.telegram.ui.Components.bk0 bk0Var = this.f35009s;
            bk0Var.setAutoRepeat(false);
            yj0Var.N(0, false, false);
            bk0Var.setAnimation(yj0Var);
            bk0Var.d();
            return;
        }
        this.f35010s0.n1(i10, true);
    }

    @Override
    public final boolean a() {
        if (this.f34995f0 != 3) {
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
        ah0 ah0Var = this.f35010s0;
        if (ah0Var.F != 0) {
            ah0Var.finishFragment();
            return false;
        }
        int i11 = this.f34997h0;
        if (i11 != 0) {
            ah0Var.u1(i11, true, null, true);
            return false;
        } else if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ah0Var.getParentActivity());
            String string = LocaleController.getString(R.string.EditNumber);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
            a2Var.R = string;
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("EditNumberInfo", R.string.EditNumberInfo, this.f34988b));
            alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Edit), new sf0(this, 0));
            ah0Var.showDialog(a2Var);
            return false;
        } else {
            this.f34992d0 = false;
            z(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.d;
            tL_auth_cancelCode.phone_code_hash = this.f34990c;
            i10 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_cancelCode, new bi.g7(17), 10);
            w();
            u();
            this.H = null;
            int i12 = this.f34995f0;
            if (i12 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i12 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i12 == 3) {
                AndroidUtilities.setWaitingForCall(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.f34991c0 = false;
            return true;
        }
    }

    @Override
    public final void d() {
        this.f34992d0 = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (this.f34991c0) {
            hs hsVar = this.f34994f;
            if (hsVar.f36645f != null) {
                if (i10 == NotificationCenter.didReceiveSmsCode) {
                    hsVar.setText("" + objArr[0]);
                    h(null);
                } else if (i10 == NotificationCenter.didReceiveCall) {
                    String str = "" + objArr[0];
                    if (AndroidUtilities.checkPhonePattern(this.f34999j0, str)) {
                        if (!this.f34999j0.equals("*")) {
                            this.f35001l0 = str;
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
        int i10 = this.f34995f0;
        if (i10 == 15) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.f34991c0 = false;
        w();
        u();
    }

    @Override
    public final void g() {
        Bundle bundle;
        this.f34998i0 = false;
        this.f34992d0 = false;
        if (this.f34997h0 != 0 && (bundle = this.H) != null) {
            bundle.putInt("timeout", this.V);
        }
    }

    @Override
    public String getHeaderName() {
        int i10 = this.f34995f0;
        if (i10 != 3 && i10 != 11) {
            return LocaleController.getString("YourCode", R.string.YourCode);
        }
        return this.f34988b;
    }

    @Override
    public final void h(String str) {
        int i10;
        int i11;
        int i12;
        ah0 ah0Var = this.f35010s0;
        int i13 = ah0Var.f33905a;
        if (i13 == 11) {
            if (this.f34992d0) {
                return;
            }
        } else if (!this.f34992d0) {
            if ((i13 < 1 || i13 > 4) && i13 != 15) {
                return;
            }
        } else {
            return;
        }
        hs hsVar = this.f34994f;
        if (str == null) {
            str = hsVar.getCode();
        }
        int i14 = 0;
        if (TextUtils.isEmpty(str)) {
            ah0.U0(ah0Var, hsVar, false);
            return;
        }
        int i15 = ah0Var.f33905a;
        if (i15 < 1 || i15 > 4 || !hsVar.e) {
            this.f34992d0 = true;
            int i16 = this.f34995f0;
            if (i16 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 3) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.f34991c0 = false;
            int i17 = ah0Var.F;
            if (i17 != 1) {
                if (i17 != 2) {
                    TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                    tL_auth_signIn.phone_number = this.d;
                    tL_auth_signIn.phone_code = str;
                    tL_auth_signIn.phone_code_hash = this.f34990c;
                    tL_auth_signIn.flags |= 1;
                    w();
                    hsVar.e = true;
                    ks[] ksVarArr = hsVar.f36645f;
                    int length = ksVarArr.length;
                    while (i14 < length) {
                        ksVarArr[i14].j(0.0f);
                        i14++;
                    }
                    i12 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
                    A(ConnectionsManager.getInstance(i12).sendRequest(tL_auth_signIn, new rf0(this, tL_auth_signIn, 0), 10));
                    ah0Var.v1(true, true);
                    return;
                }
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.f34990c;
                w();
                hsVar.e = true;
                ks[] ksVarArr2 = hsVar.f36645f;
                int length2 = ksVarArr2.length;
                while (i14 < length2) {
                    ksVarArr2[i14].j(0.0f);
                    i14++;
                }
                i11 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
                A(ConnectionsManager.getInstance(i11).sendRequest(changephone, new m(this, 13), 2));
                ah0Var.v1(true, true);
                return;
            }
            this.d = ah0Var.G;
            TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
            confirmphone.phone_code = str;
            confirmphone.phone_code_hash = this.f34990c;
            w();
            hsVar.e = true;
            ks[] ksVarArr3 = hsVar.f36645f;
            int length3 = ksVarArr3.length;
            while (i14 < length3) {
                ksVarArr3[i14].j(0.0f);
                i14++;
            }
            i10 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
            A(ConnectionsManager.getInstance(i10).sendRequest(confirmphone, new ec0(3, this, confirmphone), 2));
        }
    }

    @Override
    public final void j() {
        org.telegram.ui.Components.yj0 yj0Var = this.f34986a;
        if (yj0Var != null) {
            yj0Var.M(0);
        }
        AndroidUtilities.runOnUIThread(new qf0(this, 0), ah0.f33904t0);
    }

    @Override
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i10 = this.f34995f0;
        sb2.append(i10);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.H = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.f35001l0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i10);
        if (string2 != null) {
            hs hsVar = this.f34994f;
            if (hsVar.f36645f != null) {
                hsVar.setText(string2);
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
        String code = this.f34994f.getCode();
        int length = code.length();
        int i10 = this.f34995f0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i10, code);
        }
        String str = this.f35001l0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.H != null) {
            bundle.putBundle(i2.d.j(i10, "smsview_params_"), this.H);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dg0.m(android.os.Bundle, boolean):void");
    }

    @Override
    public final void n() {
        int i10;
        if (this.f35010s0.i1()) {
            i10 = org.telegram.ui.ActionBar.g6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.D6;
        }
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        TextView textView = this.f35002n;
        textView.setTextColor(x02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.P9, false));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        this.f35007r.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        int i12 = this.f34995f0;
        if (i12 == 11) {
            int i13 = org.telegram.ui.ActionBar.g6.f19988y6;
            this.J.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
            this.K.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
            int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19745l6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.L.setColorFilter(new PorterDuffColorFilter(x03, mode));
            this.M.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i11, false), mode));
            this.I.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        }
        r(this.f34986a);
        r(this.N);
        r(this.O);
        r(this.P);
        hs hsVar = this.f34994f;
        if (hsVar != null) {
            hsVar.invalidate();
        }
        bg0 bg0Var = this.v;
        Integer num = (Integer) bg0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.g6.D6);
        }
        bg0Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, num.intValue(), false));
        if (i12 != 15) {
            this.f35012x.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q6, false));
        }
        this.E.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ks[] ksVarArr;
        boolean z10;
        super.onConfigurationChanged(configuration);
        hs hsVar = this.f34994f;
        if (hsVar != null && (ksVarArr = hsVar.f36645f) != null) {
            for (ks ksVar : ksVarArr) {
                if (a() && !AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                ksVar.setShowSoftInputOnFocusCompat(z10);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f35008r0);
    }

    public final void q(Runnable runnable) {
        if (this.f34995f0 == 3) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            hs hsVar = this.f34994f;
            ks[] ksVarArr = hsVar.f36645f;
            if (i10 < ksVarArr.length) {
                hsVar.postDelayed(new wf0(this, i10, 2), i10 * 75);
                i10++;
            } else {
                hsVar.postDelayed(new se0(7, this, runnable), (ksVarArr.length * 75) + 400);
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
        this.f34989b0 = System.currentTimeMillis();
        this.S.schedule(new di.n2(this, 3), 0L, 1000L);
    }

    public final void t() {
        if (this.R != null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.g6.D6;
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        bg0 bg0Var = this.v;
        bg0Var.setTextColor(x02);
        bg0Var.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        Timer timer = new Timer();
        this.R = timer;
        timer.schedule(new cg0(this), 0L, 1000L);
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
        bg0 bg0Var = this.v;
        int i10 = org.telegram.ui.ActionBar.g6.D6;
        bg0Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
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
        if (!this.f34992d0 && !this.f34998i0) {
            ah0 ah0Var = this.f35010s0;
            if (!ah0Var.f33923o0) {
                this.f34998i0 = true;
                this.v.invalidate();
                this.f35012x.invalidate();
                Bundle bundle = new Bundle();
                bundle.putString("phone", this.f34988b);
                bundle.putString("ephone", this.e);
                bundle.putString("phoneFormated", this.d);
                bundle.putInt("prevType", this.f34995f0);
                this.f34992d0 = true;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.d;
                tL_auth_resendCode.phone_code_hash = this.f34990c;
                i10 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
                A(ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new vf0(this, bundle, 1), 10));
            }
        }
    }

    public final void y() {
        float f7;
        hs hsVar = this.f34994f;
        try {
            hsVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i10 = 0;
        while (true) {
            ks[] ksVarArr = hsVar.f36645f;
            if (i10 >= ksVarArr.length) {
                break;
            }
            ksVarArr[i10].setText("");
            hsVar.f36645f[i10].i(1.0f);
            i10++;
        }
        ie0 ie0Var = this.f35011w;
        if (ie0Var.getCurrentView() != this.E) {
            ie0Var.showNext();
        }
        hsVar.f36645f[0].requestFocus();
        if (this.f34995f0 == 11) {
            f7 = 3.5f;
        } else {
            f7 = 10.0f;
        }
        AndroidUtilities.shakeViewSpring(hsVar, f7, new qf0(this, 7));
        qf0 qf0Var = this.f35008r0;
        removeCallbacks(qf0Var);
        postDelayed(qf0Var, 5000L);
        this.f35006q0 = true;
    }

    public final void z(boolean z10) {
        if (this.N != null) {
            if (!this.Q) {
                return;
            }
            this.Q = false;
            this.f35009s.setAutoRepeat(false);
            org.telegram.ui.Components.yj0 yj0Var = this.O;
            yj0Var.K(0);
            yj0Var.S(yj0Var.e[0] - 1, new qf0(this, 1));
            return;
        }
        this.f35010s0.k1(z10, true);
    }
}
