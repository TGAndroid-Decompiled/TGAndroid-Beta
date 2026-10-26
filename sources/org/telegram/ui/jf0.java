package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
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
public final class jf0 extends org.telegram.ui.Components.ax0 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f40592v0 = 0;
    public final TextView E;
    public final LinearLayout F;
    public final org.telegram.ui.Components.ak0 G;
    public Bundle H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final ImageView L;
    public final ImageView M;
    public int N;
    public int O;
    public final org.telegram.ui.Components.xj0 P;
    public final org.telegram.ui.Components.xj0 Q;
    public final org.telegram.ui.Components.xj0 R;
    public boolean S;
    public Timer T;
    public Timer U;
    public int V;
    public final Object W;
    public final org.telegram.ui.Components.xj0 f40593a;
    public int f40594a0;
    public String f40595b;
    public int f40596b0;
    public String f40597c;
    public double f40598c0;
    public String d;
    public double f40599d0;
    public String e;
    public boolean f40600e0;
    public final vr f40601f;
    public boolean f40602f0;
    public String f40603g0;
    public final dd0 h;
    public final int f40604h0;
    public int f40605i0;
    public int f40606j0;
    public boolean f40607k0;
    public String f40608l0;
    public String m0;
    public final TextView f40609n;
    public String f40610n0;
    public int f40611o0;
    public String f40612p0;
    public Bundle f40613q0;
    public final TextView f40614r;
    public TLRPC.TL_auth_sentCode f40615r0;
    public final org.telegram.ui.Components.ak0 f40616s;
    public boolean f40617s0;
    public final we0 f40618t0;
    public final gg0 f40619u0;
    public final hf0 v;
    public final nd0 f40620w;
    public final hf0 f40621x;
    public final FrameLayout f40622y;

    public jf0(org.telegram.ui.gg0 r39, android.content.Context r40, int r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jf0.<init>(org.telegram.ui.gg0, android.content.Context, int):void");
    }

    public static void n(jf0 jf0Var, Context context) {
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
            sb2.append(jf0Var.e);
            sb2.append(" Android Registration/Login Issue ");
            sb2.append(str4);
            if (jf0Var.f40619u0.e) {
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
            sb3.append(jf0Var.d);
            sb3.append("\n");
            sb3.append("\n");
            try {
                SubscriptionManager from = SubscriptionManager.from(jf0Var.getContext());
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
                } catch (Exception e10) {
                    FileLog.e(e10);
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
            if (jf0Var.f40619u0.e) {
                str3 = "no_otp";
            } else {
                str3 = "no_otp_paid";
            }
            sb3.append(str3);
            sb3.append("\n");
            if (!TextUtils.isEmpty(jf0Var.f40603g0)) {
                sb3.append("Error: ");
                sb3.append(jf0Var.f40603g0);
                sb3.append("\n");
            }
            sb3.append("\n\n================================================\n");
            sb3.append("WRITE YOUR COMMENT HERE:\n");
            sb3.append("\n");
            sb3.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb3.toString());
            jf0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            jf0Var.f40619u0.q1(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
        }
    }

    public static void q(org.telegram.ui.Components.xj0 xj0Var) {
        if (xj0Var != null) {
            xj0Var.Q(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.P9, false), "Bubble");
            int i10 = org.telegram.ui.ActionBar.y6.G6;
            xj0Var.Q(org.telegram.ui.ActionBar.y6.x0(null, i10, false), "Phone");
            xj0Var.Q(org.telegram.ui.ActionBar.y6.x0(null, i10, false), "Note");
        }
    }

    public void setProblemTextVisible(boolean z10) {
        float f7;
        hf0 hf0Var = this.f40621x;
        if (hf0Var != null) {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (hf0Var.getAlpha() != f7) {
                hf0Var.animate().cancel();
                hf0Var.animate().alpha(f7).setDuration(150L).start();
            }
        }
    }

    @Override
    public final boolean a() {
        if (this.f40604h0 != 3) {
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
        gg0 gg0Var = this.f40619u0;
        if (gg0Var.F != 0) {
            gg0Var.finishFragment();
            return false;
        }
        int i11 = this.f40606j0;
        if (i11 != 0) {
            gg0Var.z1(i11, true, null, true);
            return false;
        } else if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gg0Var.getParentActivity());
            String string = LocaleController.getString(R.string.EditNumber);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
            e2Var.R = string;
            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("EditNumberInfo", R.string.EditNumberInfo, this.f40595b));
            alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Edit), new ye0(this, 0));
            gg0Var.showDialog(e2Var);
            return false;
        } else {
            this.f40602f0 = false;
            y(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.d;
            tL_auth_cancelCode.phone_code_hash = this.f40597c;
            i10 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_cancelCode, new di.d6(17), 10);
            v();
            t();
            this.H = null;
            int i12 = this.f40604h0;
            if (i12 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i12 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i12 == 3) {
                AndroidUtilities.setWaitingForCall(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.f40600e0 = false;
            return true;
        }
    }

    @Override
    public final void d() {
        this.f40602f0 = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (this.f40600e0) {
            vr vrVar = this.f40601f;
            if (vrVar.f44897f != null) {
                if (i10 == NotificationCenter.didReceiveSmsCode) {
                    vrVar.setText("" + objArr[0]);
                    h(null);
                } else if (i10 == NotificationCenter.didReceiveCall) {
                    String str = "" + objArr[0];
                    if (AndroidUtilities.checkPhonePattern(this.f40608l0, str)) {
                        if (!this.f40608l0.equals("*")) {
                            this.f40610n0 = str;
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
        int i10 = this.f40604h0;
        if (i10 == 15) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.f40600e0 = false;
        v();
        t();
    }

    @Override
    public final void g() {
        Bundle bundle;
        this.f40607k0 = false;
        this.f40602f0 = false;
        if (this.f40606j0 != 0 && (bundle = this.H) != null) {
            bundle.putInt("timeout", this.f40594a0);
        }
    }

    @Override
    public String getHeaderName() {
        int i10 = this.f40604h0;
        if (i10 != 3 && i10 != 11) {
            return LocaleController.getString("YourCode", R.string.YourCode);
        }
        return this.f40595b;
    }

    @Override
    public final void h(String str) {
        int i10;
        int i11;
        int i12;
        gg0 gg0Var = this.f40619u0;
        int i13 = gg0Var.f39651a;
        if (i13 == 11) {
            if (this.f40602f0) {
                return;
            }
        } else if (!this.f40602f0) {
            if ((i13 < 1 || i13 > 4) && i13 != 15) {
                return;
            }
        } else {
            return;
        }
        vr vrVar = this.f40601f;
        if (str == null) {
            str = vrVar.getCode();
        }
        int i14 = 0;
        if (TextUtils.isEmpty(str)) {
            gg0.X0(gg0Var, vrVar, false);
            return;
        }
        int i15 = gg0Var.f39651a;
        if (i15 < 1 || i15 > 4 || !vrVar.e) {
            this.f40602f0 = true;
            int i16 = this.f40604h0;
            if (i16 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 3) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.f40600e0 = false;
            int i17 = gg0Var.F;
            if (i17 != 1) {
                if (i17 != 2) {
                    TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                    tL_auth_signIn.phone_number = this.d;
                    tL_auth_signIn.phone_code = str;
                    tL_auth_signIn.phone_code_hash = this.f40597c;
                    tL_auth_signIn.flags |= 1;
                    v();
                    vrVar.e = true;
                    xr[] xrVarArr = vrVar.f44897f;
                    int length = xrVarArr.length;
                    while (i14 < length) {
                        xrVarArr[i14].j(0.0f);
                        i14++;
                    }
                    i12 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
                    z(ConnectionsManager.getInstance(i12).sendRequest(tL_auth_signIn, new xe0(this, tL_auth_signIn, 0), 10));
                    gg0Var.A1(true, true);
                    return;
                }
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.f40597c;
                v();
                vrVar.e = true;
                xr[] xrVarArr2 = vrVar.f44897f;
                int length2 = xrVarArr2.length;
                while (i14 < length2) {
                    xrVarArr2[i14].j(0.0f);
                    i14++;
                }
                i11 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
                z(ConnectionsManager.getInstance(i11).sendRequest(changephone, new l(this, 14), 2));
                gg0Var.A1(true, true);
                return;
            }
            this.d = gg0Var.G;
            TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
            confirmphone.phone_code = str;
            confirmphone.phone_code_hash = this.f40597c;
            v();
            vrVar.e = true;
            xr[] xrVarArr3 = vrVar.f44897f;
            int length3 = xrVarArr3.length;
            while (i14 < length3) {
                xrVarArr3[i14].j(0.0f);
                i14++;
            }
            i10 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
            z(ConnectionsManager.getInstance(i10).sendRequest(confirmphone, new j10(11, this, confirmphone), 2));
        }
    }

    @Override
    public final void j() {
        org.telegram.ui.Components.xj0 xj0Var = this.f40593a;
        if (xj0Var != null) {
            xj0Var.M(0);
        }
        AndroidUtilities.runOnUIThread(new we0(this, 0), gg0.f39650x0);
    }

    @Override
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i10 = this.f40604h0;
        sb2.append(i10);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.H = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.f40610n0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i10);
        if (string2 != null) {
            vr vrVar = this.f40601f;
            if (vrVar.f44897f != null) {
                vrVar.setText(string2);
            }
        }
        int i11 = bundle.getInt("time");
        if (i11 != 0) {
            this.f40594a0 = i11;
        }
        int i12 = bundle.getInt("open");
        if (i12 != 0) {
            this.V = i12;
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f40601f.getCode();
        int length = code.length();
        int i10 = this.f40604h0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i10, code);
        }
        String str = this.f40610n0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.H != null) {
            bundle.putBundle(ic.a.i(i10, "smsview_params_"), this.H);
        }
        int i11 = this.f40594a0;
        if (i11 != 0) {
            bundle.putInt("time", i11);
        }
        int i12 = this.V;
        if (i12 != 0) {
            bundle.putInt("open", i12);
        }
    }

    @Override
    public final void m(android.os.Bundle r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jf0.m(android.os.Bundle, boolean):void");
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        xr[] xrVarArr;
        boolean z10;
        super.onConfigurationChanged(configuration);
        vr vrVar = this.f40601f;
        if (vrVar != null && (xrVarArr = vrVar.f44897f) != null) {
            for (xr xrVar : xrVarArr) {
                if (a() && !AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                xrVar.setShowSoftInputOnFocusCompat(z10);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f40618t0);
    }

    public final void p(Runnable runnable) {
        if (this.f40604h0 == 3) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            vr vrVar = this.f40601f;
            xr[] xrVarArr = vrVar.f44897f;
            if (i10 < xrVarArr.length) {
                vrVar.postDelayed(new cf0(this, i10, 2), i10 * 75);
                i10++;
            } else {
                vrVar.postDelayed(new wb0(12, this, runnable), (xrVarArr.length * 75) + 400);
                return;
            }
        }
    }

    public final void r() {
        if (this.U != null) {
            return;
        }
        this.f40596b0 = 15000;
        int i10 = this.f40594a0;
        if (i10 > 15000) {
            this.f40596b0 = i10;
        }
        this.U = new Timer();
        this.f40599d0 = System.currentTimeMillis();
        this.U.schedule(new f6.r(this, 3), 0L, 1000L);
    }

    public final void s() {
        if (this.T != null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.y6.D6;
        hf0 hf0Var = this.v;
        org.telegram.ui.ActionBar.f7.V(hf0Var, i10, null);
        hf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        Timer timer = new Timer();
        this.T = timer;
        timer.schedule(new if0(this), 0L, 1000L);
    }

    public final void t() {
        try {
            synchronized (this.W) {
                Timer timer = this.U;
                if (timer != null) {
                    timer.cancel();
                    this.U = null;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void updateColors() {
        int i10;
        if (this.f40619u0.n1()) {
            i10 = org.telegram.ui.ActionBar.y6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.D6;
        }
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        TextView textView = this.f40609n;
        textView.setTextColor(x02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.P9, false));
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        this.f40614r.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        int i12 = this.f40604h0;
        if (i12 == 11) {
            int i13 = org.telegram.ui.ActionBar.y6.f23748y6;
            this.J.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i13, false));
            this.K.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i13, false));
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23502l6, false);
            int i14 = this.N;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            gg0.h1(this.L, x03, i14, mode);
            this.N = x03;
            int x04 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
            gg0.h1(this.M, x04, this.O, mode);
            this.O = x04;
            this.I.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        }
        q(this.f40593a);
        q(this.P);
        q(this.Q);
        q(this.R);
        vr vrVar = this.f40601f;
        if (vrVar != null) {
            vrVar.invalidate();
        }
        hf0 hf0Var = this.v;
        Integer num = (Integer) hf0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.y6.D6);
        }
        hf0Var.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, num.intValue(), false));
        if (i12 != 15) {
            this.f40621x.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23597q6, false));
        }
        this.E.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23598q7, false));
    }

    public final void v() {
        hf0 hf0Var = this.v;
        int i10 = org.telegram.ui.ActionBar.y6.D6;
        org.telegram.ui.ActionBar.f7.V(hf0Var, i10, null);
        this.v.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        try {
            synchronized (this.W) {
                Timer timer = this.T;
                if (timer != null) {
                    timer.cancel();
                    this.T = null;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void w() {
        int i10;
        if (!this.f40602f0 && !this.f40607k0) {
            gg0 gg0Var = this.f40619u0;
            if (!gg0Var.f39669o0) {
                this.f40607k0 = true;
                this.v.invalidate();
                this.f40621x.invalidate();
                Bundle bundle = new Bundle();
                bundle.putString("phone", this.f40595b);
                bundle.putString("ephone", this.e);
                bundle.putString("phoneFormated", this.d);
                bundle.putInt("prevType", this.f40604h0);
                this.f40602f0 = true;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.d;
                tL_auth_resendCode.phone_code_hash = this.f40597c;
                i10 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
                z(ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new bf0(this, bundle, 1), 10));
            }
        }
    }

    public final void x() {
        float f7;
        vr vrVar = this.f40601f;
        try {
            vrVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i10 = 0;
        while (true) {
            xr[] xrVarArr = vrVar.f44897f;
            if (i10 >= xrVarArr.length) {
                break;
            }
            xrVarArr[i10].setText("");
            vrVar.f44897f[i10].i(1.0f);
            i10++;
        }
        nd0 nd0Var = this.f40620w;
        if (nd0Var.getCurrentView() != this.E) {
            nd0Var.showNext();
        }
        vrVar.f44897f[0].requestFocus();
        if (this.f40604h0 == 11) {
            f7 = 3.5f;
        } else {
            f7 = 10.0f;
        }
        AndroidUtilities.shakeViewSpring(vrVar, f7, new we0(this, 7));
        we0 we0Var = this.f40618t0;
        removeCallbacks(we0Var);
        postDelayed(we0Var, 5000L);
        this.f40617s0 = true;
    }

    public final void y(boolean z10) {
        if (this.P != null) {
            if (!this.S) {
                return;
            }
            this.S = false;
            this.f40616s.setAutoRepeat(false);
            org.telegram.ui.Components.xj0 xj0Var = this.Q;
            xj0Var.K(0);
            xj0Var.S(xj0Var.e[0] - 1, new we0(this, 1));
            return;
        }
        this.f40619u0.p1(z10, true);
    }

    public final void z(int i10) {
        org.telegram.ui.Components.xj0 xj0Var = this.P;
        if (xj0Var != null) {
            if (this.S) {
                return;
            }
            this.S = true;
            org.telegram.ui.Components.xj0 xj0Var2 = this.f40593a;
            if (xj0Var2.f34736a0 != xj0Var2.e[0] - 1) {
                xj0Var2.f34760t0 = new cf0(this, i10, 0);
                return;
            }
            xj0Var.f34760t0 = new we0(this, 3);
            org.telegram.ui.Components.ak0 ak0Var = this.f40616s;
            ak0Var.setAutoRepeat(false);
            xj0Var.N(0, false, false);
            ak0Var.setAnimation(xj0Var);
            ak0Var.d();
            return;
        }
        this.f40619u0.s1(i10, true);
    }
}
