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
public final class lf0 extends org.telegram.ui.Components.bx0 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f41107v0 = 0;
    public final TextView E;
    public final LinearLayout F;
    public final org.telegram.ui.Components.bk0 G;
    public Bundle H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final ImageView L;
    public final ImageView M;
    public int N;
    public int O;
    public final org.telegram.ui.Components.yj0 P;
    public final org.telegram.ui.Components.yj0 Q;
    public final org.telegram.ui.Components.yj0 R;
    public boolean S;
    public Timer T;
    public Timer U;
    public int V;
    public final Object W;
    public final org.telegram.ui.Components.yj0 f41108a;
    public int f41109a0;
    public String f41110b;
    public int f41111b0;
    public String f41112c;
    public double f41113c0;
    public String d;
    public double f41114d0;
    public String e;
    public boolean f41115e0;
    public final xr f41116f;
    public boolean f41117f0;
    public String f41118g0;
    public final fd0 h;
    public final int f41119h0;
    public int f41120i0;
    public int f41121j0;
    public boolean f41122k0;
    public String f41123l0;
    public String m0;
    public final TextView f41124n;
    public String f41125n0;
    public int f41126o0;
    public String f41127p0;
    public Bundle f41128q0;
    public final TextView f41129r;
    public TLRPC.TL_auth_sentCode f41130r0;
    public final org.telegram.ui.Components.bk0 f41131s;
    public boolean f41132s0;
    public final ye0 f41133t0;
    public final ig0 f41134u0;
    public final jf0 v;
    public final pd0 f41135w;
    public final jf0 f41136x;
    public final FrameLayout f41137y;

    public lf0(org.telegram.ui.ig0 r39, android.content.Context r40, int r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lf0.<init>(org.telegram.ui.ig0, android.content.Context, int):void");
    }

    public static void n(lf0 lf0Var, Context context) {
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
            sb2.append(lf0Var.e);
            sb2.append(" Android Registration/Login Issue ");
            sb2.append(str4);
            if (lf0Var.f41134u0.e) {
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
            sb3.append(lf0Var.d);
            sb3.append("\n");
            sb3.append("\n");
            try {
                SubscriptionManager from = SubscriptionManager.from(lf0Var.getContext());
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
            if (lf0Var.f41134u0.e) {
                str3 = "no_otp";
            } else {
                str3 = "no_otp_paid";
            }
            sb3.append(str3);
            sb3.append("\n");
            if (!TextUtils.isEmpty(lf0Var.f41118g0)) {
                sb3.append("Error: ");
                sb3.append(lf0Var.f41118g0);
                sb3.append("\n");
            }
            sb3.append("\n\n================================================\n");
            sb3.append("WRITE YOUR COMMENT HERE:\n");
            sb3.append("\n");
            sb3.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb3.toString());
            lf0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            lf0Var.f41134u0.q1(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
        }
    }

    public static void q(org.telegram.ui.Components.yj0 yj0Var) {
        if (yj0Var != null) {
            yj0Var.Q(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.P9, false), "Bubble");
            int i10 = org.telegram.ui.ActionBar.y6.G6;
            yj0Var.Q(org.telegram.ui.ActionBar.y6.x0(null, i10, false), "Phone");
            yj0Var.Q(org.telegram.ui.ActionBar.y6.x0(null, i10, false), "Note");
        }
    }

    public void setProblemTextVisible(boolean z10) {
        float f7;
        jf0 jf0Var = this.f41136x;
        if (jf0Var != null) {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (jf0Var.getAlpha() != f7) {
                jf0Var.animate().cancel();
                jf0Var.animate().alpha(f7).setDuration(150L).start();
            }
        }
    }

    @Override
    public final boolean a() {
        if (this.f41119h0 != 3) {
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
        ig0 ig0Var = this.f41134u0;
        if (ig0Var.F != 0) {
            ig0Var.finishFragment();
            return false;
        }
        int i11 = this.f41121j0;
        if (i11 != 0) {
            ig0Var.z1(i11, true, null, true);
            return false;
        } else if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
            String string = LocaleController.getString(R.string.EditNumber);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
            e2Var.R = string;
            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("EditNumberInfo", R.string.EditNumberInfo, this.f41110b));
            alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Edit), new af0(this, 0));
            ig0Var.showDialog(e2Var);
            return false;
        } else {
            this.f41117f0 = false;
            y(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.d;
            tL_auth_cancelCode.phone_code_hash = this.f41112c;
            i10 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_cancelCode, new di.d6(17), 10);
            v();
            t();
            this.H = null;
            int i12 = this.f41119h0;
            if (i12 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i12 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i12 == 3) {
                AndroidUtilities.setWaitingForCall(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.f41115e0 = false;
            return true;
        }
    }

    @Override
    public final void d() {
        this.f41117f0 = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (this.f41115e0) {
            xr xrVar = this.f41116f;
            if (xrVar.f45772f != null) {
                if (i10 == NotificationCenter.didReceiveSmsCode) {
                    xrVar.setText("" + objArr[0]);
                    h(null);
                } else if (i10 == NotificationCenter.didReceiveCall) {
                    String str = "" + objArr[0];
                    if (AndroidUtilities.checkPhonePattern(this.f41123l0, str)) {
                        if (!this.f41123l0.equals("*")) {
                            this.f41125n0 = str;
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
        int i10 = this.f41119h0;
        if (i10 == 15) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.f41115e0 = false;
        v();
        t();
    }

    @Override
    public final void g() {
        Bundle bundle;
        this.f41122k0 = false;
        this.f41117f0 = false;
        if (this.f41121j0 != 0 && (bundle = this.H) != null) {
            bundle.putInt("timeout", this.f41109a0);
        }
    }

    @Override
    public String getHeaderName() {
        int i10 = this.f41119h0;
        if (i10 != 3 && i10 != 11) {
            return LocaleController.getString("YourCode", R.string.YourCode);
        }
        return this.f41110b;
    }

    @Override
    public final void h(String str) {
        int i10;
        int i11;
        int i12;
        ig0 ig0Var = this.f41134u0;
        int i13 = ig0Var.f40140a;
        if (i13 == 11) {
            if (this.f41117f0) {
                return;
            }
        } else if (!this.f41117f0) {
            if ((i13 < 1 || i13 > 4) && i13 != 15) {
                return;
            }
        } else {
            return;
        }
        xr xrVar = this.f41116f;
        if (str == null) {
            str = xrVar.getCode();
        }
        int i14 = 0;
        if (TextUtils.isEmpty(str)) {
            ig0.X0(ig0Var, xrVar, false);
            return;
        }
        int i15 = ig0Var.f40140a;
        if (i15 < 1 || i15 > 4 || !xrVar.e) {
            this.f41117f0 = true;
            int i16 = this.f41119h0;
            if (i16 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 3) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.f41115e0 = false;
            int i17 = ig0Var.F;
            if (i17 != 1) {
                if (i17 != 2) {
                    TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                    tL_auth_signIn.phone_number = this.d;
                    tL_auth_signIn.phone_code = str;
                    tL_auth_signIn.phone_code_hash = this.f41112c;
                    tL_auth_signIn.flags |= 1;
                    v();
                    xrVar.e = true;
                    zr[] zrVarArr = xrVar.f45772f;
                    int length = zrVarArr.length;
                    while (i14 < length) {
                        zrVarArr[i14].j(0.0f);
                        i14++;
                    }
                    i12 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
                    z(ConnectionsManager.getInstance(i12).sendRequest(tL_auth_signIn, new ze0(this, tL_auth_signIn, 0), 10));
                    ig0Var.A1(true, true);
                    return;
                }
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.f41112c;
                v();
                xrVar.e = true;
                zr[] zrVarArr2 = xrVar.f45772f;
                int length2 = zrVarArr2.length;
                while (i14 < length2) {
                    zrVarArr2[i14].j(0.0f);
                    i14++;
                }
                i11 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
                z(ConnectionsManager.getInstance(i11).sendRequest(changephone, new l(this, 14), 2));
                ig0Var.A1(true, true);
                return;
            }
            this.d = ig0Var.G;
            TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
            confirmphone.phone_code = str;
            confirmphone.phone_code_hash = this.f41112c;
            v();
            xrVar.e = true;
            zr[] zrVarArr3 = xrVar.f45772f;
            int length3 = zrVarArr3.length;
            while (i14 < length3) {
                zrVarArr3[i14].j(0.0f);
                i14++;
            }
            i10 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
            z(ConnectionsManager.getInstance(i10).sendRequest(confirmphone, new l10(11, this, confirmphone), 2));
        }
    }

    @Override
    public final void j() {
        org.telegram.ui.Components.yj0 yj0Var = this.f41108a;
        if (yj0Var != null) {
            yj0Var.M(0);
        }
        AndroidUtilities.runOnUIThread(new ye0(this, 0), ig0.f40139y0);
    }

    @Override
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i10 = this.f41119h0;
        sb2.append(i10);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.H = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.f41125n0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i10);
        if (string2 != null) {
            xr xrVar = this.f41116f;
            if (xrVar.f45772f != null) {
                xrVar.setText(string2);
            }
        }
        int i11 = bundle.getInt("time");
        if (i11 != 0) {
            this.f41109a0 = i11;
        }
        int i12 = bundle.getInt("open");
        if (i12 != 0) {
            this.V = i12;
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f41116f.getCode();
        int length = code.length();
        int i10 = this.f41119h0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i10, code);
        }
        String str = this.f41125n0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.H != null) {
            bundle.putBundle(ic.a.i(i10, "smsview_params_"), this.H);
        }
        int i11 = this.f41109a0;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lf0.m(android.os.Bundle, boolean):void");
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        zr[] zrVarArr;
        boolean z10;
        super.onConfigurationChanged(configuration);
        xr xrVar = this.f41116f;
        if (xrVar != null && (zrVarArr = xrVar.f45772f) != null) {
            for (zr zrVar : zrVarArr) {
                if (a() && !AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                zrVar.setShowSoftInputOnFocusCompat(z10);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f41133t0);
    }

    public final void p(Runnable runnable) {
        if (this.f41119h0 == 3) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            xr xrVar = this.f41116f;
            zr[] zrVarArr = xrVar.f45772f;
            if (i10 < zrVarArr.length) {
                xrVar.postDelayed(new ef0(this, i10, 2), i10 * 75);
                i10++;
            } else {
                xrVar.postDelayed(new kb0(13, this, runnable), (zrVarArr.length * 75) + 400);
                return;
            }
        }
    }

    public final void r() {
        if (this.U != null) {
            return;
        }
        this.f41111b0 = 15000;
        int i10 = this.f41109a0;
        if (i10 > 15000) {
            this.f41111b0 = i10;
        }
        this.U = new Timer();
        this.f41114d0 = System.currentTimeMillis();
        this.U.schedule(new f6.r(this, 3), 0L, 1000L);
    }

    public final void s() {
        if (this.T != null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.y6.D6;
        jf0 jf0Var = this.v;
        org.telegram.ui.ActionBar.f7.V(jf0Var, i10, null);
        jf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        Timer timer = new Timer();
        this.T = timer;
        timer.schedule(new kf0(this), 0L, 1000L);
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
        if (this.f41134u0.n1()) {
            i10 = org.telegram.ui.ActionBar.y6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.D6;
        }
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        TextView textView = this.f41124n;
        textView.setTextColor(x02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.P9, false));
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        this.f41129r.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        int i12 = this.f41119h0;
        if (i12 == 11) {
            int i13 = org.telegram.ui.ActionBar.y6.f23749y6;
            this.J.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i13, false));
            this.K.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i13, false));
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23503l6, false);
            int i14 = this.N;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            ig0.h1(this.L, x03, i14, mode);
            this.N = x03;
            int x04 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
            ig0.h1(this.M, x04, this.O, mode);
            this.O = x04;
            this.I.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        }
        q(this.f41108a);
        q(this.P);
        q(this.Q);
        q(this.R);
        xr xrVar = this.f41116f;
        if (xrVar != null) {
            xrVar.invalidate();
        }
        jf0 jf0Var = this.v;
        Integer num = (Integer) jf0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.y6.D6);
        }
        jf0Var.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, num.intValue(), false));
        if (i12 != 15) {
            this.f41136x.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23598q6, false));
        }
        this.E.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23599q7, false));
    }

    public final void v() {
        jf0 jf0Var = this.v;
        int i10 = org.telegram.ui.ActionBar.y6.D6;
        org.telegram.ui.ActionBar.f7.V(jf0Var, i10, null);
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
        if (!this.f41117f0 && !this.f41122k0) {
            ig0 ig0Var = this.f41134u0;
            if (!ig0Var.f40159p0) {
                this.f41122k0 = true;
                this.v.invalidate();
                this.f41136x.invalidate();
                Bundle bundle = new Bundle();
                bundle.putString("phone", this.f41110b);
                bundle.putString("ephone", this.e);
                bundle.putString("phoneFormated", this.d);
                bundle.putInt("prevType", this.f41119h0);
                this.f41117f0 = true;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.d;
                tL_auth_resendCode.phone_code_hash = this.f41112c;
                i10 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
                z(ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new df0(this, bundle, 1), 10));
            }
        }
    }

    public final void x() {
        float f7;
        xr xrVar = this.f41116f;
        try {
            xrVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i10 = 0;
        while (true) {
            zr[] zrVarArr = xrVar.f45772f;
            if (i10 >= zrVarArr.length) {
                break;
            }
            zrVarArr[i10].setText("");
            xrVar.f45772f[i10].i(1.0f);
            i10++;
        }
        pd0 pd0Var = this.f41135w;
        if (pd0Var.getCurrentView() != this.E) {
            pd0Var.showNext();
        }
        xrVar.f45772f[0].requestFocus();
        if (this.f41119h0 == 11) {
            f7 = 3.5f;
        } else {
            f7 = 10.0f;
        }
        AndroidUtilities.shakeViewSpring(xrVar, f7, new ye0(this, 7));
        ye0 ye0Var = this.f41133t0;
        removeCallbacks(ye0Var);
        postDelayed(ye0Var, 5000L);
        this.f41132s0 = true;
    }

    public final void y(boolean z10) {
        if (this.P != null) {
            if (!this.S) {
                return;
            }
            this.S = false;
            this.f41131s.setAutoRepeat(false);
            org.telegram.ui.Components.yj0 yj0Var = this.Q;
            yj0Var.K(0);
            yj0Var.S(yj0Var.e[0] - 1, new ye0(this, 1));
            return;
        }
        this.f41134u0.p1(z10, true);
    }

    public final void z(int i10) {
        org.telegram.ui.Components.yj0 yj0Var = this.P;
        if (yj0Var != null) {
            if (this.S) {
                return;
            }
            this.S = true;
            org.telegram.ui.Components.yj0 yj0Var2 = this.f41108a;
            if (yj0Var2.f35067a0 != yj0Var2.e[0] - 1) {
                yj0Var2.f35091t0 = new ef0(this, i10, 0);
                return;
            }
            yj0Var.f35091t0 = new ye0(this, 3);
            org.telegram.ui.Components.bk0 bk0Var = this.f41131s;
            bk0Var.setAutoRepeat(false);
            yj0Var.N(0, false, false);
            bk0Var.setAnimation(yj0Var);
            bk0Var.d();
            return;
        }
        this.f41134u0.s1(i10, true);
    }
}
