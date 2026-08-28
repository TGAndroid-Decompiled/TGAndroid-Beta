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
public final class jf0 extends org.telegram.ui.Components.cv0 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f39468p0 = 0;
    public final TextView A;
    public final LinearLayout B;
    public final org.telegram.ui.Components.pi0 C;
    public Bundle D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final ImageView H;
    public final ImageView I;
    public final org.telegram.ui.Components.mi0 J;
    public final org.telegram.ui.Components.mi0 K;
    public final org.telegram.ui.Components.mi0 L;
    public boolean M;
    public Timer N;
    public Timer O;
    public int P;
    public final Object Q;
    public int R;
    public int S;
    public double T;
    public double U;
    public boolean V;
    public boolean W;
    public final org.telegram.ui.Components.mi0 f39469a;
    public String f39470a0;
    public String f39471b;
    public final int f39472b0;
    public String f39473c;
    public int f39474c0;
    public String d;
    public int f39475d0;
    public String f39476e;
    public boolean f39477e0;
    public final sr f39478f;
    public String f39479f0;
    public String f39480g0;
    public final org.telegram.ui.Components.voip.m2 h;
    public String f39481h0;
    public int f39482i0;
    public String f39483j0;
    public Bundle f39484k0;
    public TLRPC.TL_auth_sentCode f39485l0;
    public boolean m0;
    public final TextView f39486n;
    public final ve0 f39487n0;
    public final fg0 f39488o0;
    public final TextView f39489r;
    public final org.telegram.ui.Components.pi0 f39490s;
    public final hf0 v;
    public final od0 f39491w;
    public final hf0 f39492x;
    public final FrameLayout f39493y;

    public jf0(org.telegram.ui.fg0 r39, android.content.Context r40, int r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jf0.<init>(org.telegram.ui.fg0, android.content.Context, int):void");
    }

    public static void o(jf0 jf0Var, Context context) {
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
            sb2.append(jf0Var.f39476e);
            sb2.append(" Android Registration/Login Issue ");
            sb2.append(str4);
            if (jf0Var.f39488o0.f38266e) {
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
            int i9 = Build.VERSION.SDK_INT;
            sb3.append(i9);
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
                if (i9 >= 22) {
                    SubscriptionManager from = SubscriptionManager.from(jf0Var.getContext());
                    if (i9 >= 30) {
                        list = from.getCompleteActiveSubscriptionInfoList();
                    } else {
                        list = null;
                    }
                    if ((list == null || list.isEmpty()) && i9 >= 28) {
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
                } else {
                    try {
                        String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
                        if (!TextUtils.isEmpty(line1Number)) {
                            sb3.append("SIM0.Phone: ");
                            sb3.append(line1Number);
                            sb3.append("\n");
                            sb3.append("SIM0.MCC: unknown\n");
                            sb3.append("SIM0.MNC: unknown\n");
                            sb3.append("SIM0.Carrier: unknown\n\n");
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
            } catch (Exception e11) {
                FileLog.e(e11);
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
                } catch (Exception e12) {
                    FileLog.e(e12);
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
            int i10 = packageInfo.versionCode % 10;
            if (i10 != 1 && i10 != 2) {
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
            if (jf0Var.f39488o0.f38266e) {
                str3 = "no_otp";
            } else {
                str3 = "no_otp_paid";
            }
            sb3.append(str3);
            sb3.append("\n");
            if (!TextUtils.isEmpty(jf0Var.f39470a0)) {
                sb3.append("Error: ");
                sb3.append(jf0Var.f39470a0);
                sb3.append("\n");
            }
            sb3.append("\n\n================================================\n");
            sb3.append("WRITE YOUR COMMENT HERE:\n");
            sb3.append("\n");
            sb3.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb3.toString());
            jf0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            jf0Var.f39488o0.l1(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
        }
    }

    public static void r(org.telegram.ui.Components.mi0 mi0Var) {
        if (mi0Var != null) {
            mi0Var.O(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.P9, false), "Bubble");
            int i9 = org.telegram.ui.ActionBar.f6.G6;
            mi0Var.O(org.telegram.ui.ActionBar.f6.w0(null, i9, false), "Phone");
            mi0Var.O(org.telegram.ui.ActionBar.f6.w0(null, i9, false), "Note");
        }
    }

    public void setProblemTextVisible(boolean z10) {
        float f10;
        hf0 hf0Var = this.f39492x;
        if (hf0Var != null) {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (hf0Var.getAlpha() != f10) {
                hf0Var.animate().cancel();
                hf0Var.animate().alpha(f10).setDuration(150L).start();
            }
        }
    }

    public final void A(int i9) {
        org.telegram.ui.Components.mi0 mi0Var = this.J;
        if (mi0Var != null) {
            if (this.M) {
                return;
            }
            this.M = true;
            org.telegram.ui.Components.mi0 mi0Var2 = this.f39469a;
            if (mi0Var2.X != mi0Var2.f30847e[0] - 1) {
                mi0Var2.f30861q0 = new bf0(this, i9, 0);
                return;
            }
            mi0Var.f30861q0 = new ve0(this, 3);
            org.telegram.ui.Components.pi0 pi0Var = this.f39490s;
            pi0Var.setAutoRepeat(false);
            mi0Var.L(0, false, false);
            pi0Var.setAnimation(mi0Var);
            pi0Var.d();
            return;
        }
        this.f39488o0.n1(i9, true);
    }

    @Override
    public final boolean a() {
        if (this.f39472b0 != 3) {
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
        int i9;
        fg0 fg0Var = this.f39488o0;
        if (fg0Var.B != 0) {
            fg0Var.finishFragment();
            return false;
        }
        int i10 = this.f39475d0;
        if (i10 != 0) {
            fg0Var.u1(i10, true, null, true);
            return false;
        } else if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
            String string = LocaleController.getString(R.string.EditNumber);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            c2Var.N = string;
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("EditNumberInfo", R.string.EditNumberInfo, this.f39471b));
            alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Edit), new xe0(this, 0));
            fg0Var.showDialog(c2Var);
            return false;
        } else {
            this.W = false;
            z(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.d;
            tL_auth_cancelCode.phone_code_hash = this.f39473c;
            i9 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
            ConnectionsManager.getInstance(i9).sendRequest(tL_auth_cancelCode, new ih.q5(14), 10);
            w();
            v();
            this.D = null;
            int i11 = this.f39472b0;
            if (i11 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i11 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i11 == 3) {
                AndroidUtilities.setWaitingForCall(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.V = false;
            return true;
        }
    }

    @Override
    public final void d() {
        this.W = false;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (this.V) {
            sr srVar = this.f39478f;
            if (srVar.f42755f != null) {
                if (i9 == NotificationCenter.didReceiveSmsCode) {
                    srVar.setText("" + objArr[0]);
                    h(null);
                } else if (i9 == NotificationCenter.didReceiveCall) {
                    String str = "" + objArr[0];
                    if (AndroidUtilities.checkPhonePattern(this.f39479f0, str)) {
                        if (!this.f39479f0.equals("*")) {
                            this.f39481h0 = str;
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
        int i9 = this.f39472b0;
        if (i9 == 15) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i9 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i9 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.V = false;
        w();
        v();
    }

    @Override
    public final void g() {
        Bundle bundle;
        this.f39477e0 = false;
        this.W = false;
        if (this.f39475d0 != 0 && (bundle = this.D) != null) {
            bundle.putInt("timeout", this.R);
        }
    }

    @Override
    public String getHeaderName() {
        int i9 = this.f39472b0;
        if (i9 != 3 && i9 != 11) {
            return LocaleController.getString("YourCode", R.string.YourCode);
        }
        return this.f39471b;
    }

    @Override
    public final void h(String str) {
        int i9;
        int i10;
        int i11;
        fg0 fg0Var = this.f39488o0;
        int i12 = fg0Var.f38259a;
        if (i12 == 11) {
            if (this.W) {
                return;
            }
        } else if (!this.W) {
            if ((i12 < 1 || i12 > 4) && i12 != 15) {
                return;
            }
        } else {
            return;
        }
        sr srVar = this.f39478f;
        if (str == null) {
            str = srVar.getCode();
        }
        int i13 = 0;
        if (TextUtils.isEmpty(str)) {
            fg0.U0(fg0Var, srVar, false);
            return;
        }
        int i14 = fg0Var.f38259a;
        if (i14 < 1 || i14 > 4 || !srVar.f42754e) {
            this.W = true;
            int i15 = this.f39472b0;
            if (i15 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i15 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i15 == 3) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.V = false;
            int i16 = fg0Var.B;
            if (i16 != 1) {
                if (i16 != 2) {
                    TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                    tL_auth_signIn.phone_number = this.d;
                    tL_auth_signIn.phone_code = str;
                    tL_auth_signIn.phone_code_hash = this.f39473c;
                    tL_auth_signIn.flags |= 1;
                    w();
                    srVar.f42754e = true;
                    vr[] vrVarArr = srVar.f42755f;
                    int length = vrVarArr.length;
                    while (i13 < length) {
                        vrVarArr[i13].j(0.0f);
                        i13++;
                    }
                    i11 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                    A(ConnectionsManager.getInstance(i11).sendRequest(tL_auth_signIn, new we0(this, tL_auth_signIn, 0), 10));
                    fg0Var.v1(true, true);
                    return;
                }
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.f39473c;
                w();
                srVar.f42754e = true;
                vr[] vrVarArr2 = srVar.f42755f;
                int length2 = vrVarArr2.length;
                while (i13 < length2) {
                    vrVarArr2[i13].j(0.0f);
                    i13++;
                }
                i10 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                A(ConnectionsManager.getInstance(i10).sendRequest(changephone, new m(this, 13), 2));
                fg0Var.v1(true, true);
                return;
            }
            this.d = fg0Var.C;
            TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
            confirmphone.phone_code = str;
            confirmphone.phone_code_hash = this.f39473c;
            w();
            srVar.f42754e = true;
            vr[] vrVarArr3 = srVar.f42755f;
            int length3 = vrVarArr3.length;
            while (i13 < length3) {
                vrVarArr3[i13].j(0.0f);
                i13++;
            }
            i9 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
            A(ConnectionsManager.getInstance(i9).sendRequest(confirmphone, new v40(10, this, confirmphone), 2));
        }
    }

    @Override
    public final void j() {
        org.telegram.ui.Components.mi0 mi0Var = this.f39469a;
        if (mi0Var != null) {
            mi0Var.K(0);
        }
        AndroidUtilities.runOnUIThread(new ve0(this, 0), fg0.f38258p0);
    }

    @Override
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i9 = this.f39472b0;
        sb2.append(i9);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.D = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.f39481h0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i9);
        if (string2 != null) {
            sr srVar = this.f39478f;
            if (srVar.f42755f != null) {
                srVar.setText(string2);
            }
        }
        int i10 = bundle.getInt("time");
        if (i10 != 0) {
            this.R = i10;
        }
        int i11 = bundle.getInt("open");
        if (i11 != 0) {
            this.P = i11;
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f39478f.getCode();
        int length = code.length();
        int i9 = this.f39472b0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i9, code);
        }
        String str = this.f39481h0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.D != null) {
            bundle.putBundle(j3.r0.l(i9, "smsview_params_"), this.D);
        }
        int i10 = this.R;
        if (i10 != 0) {
            bundle.putInt("time", i10);
        }
        int i11 = this.P;
        if (i11 != 0) {
            bundle.putInt("open", i11);
        }
    }

    @Override
    public final void m(android.os.Bundle r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jf0.m(android.os.Bundle, boolean):void");
    }

    @Override
    public final void n() {
        int i9;
        if (this.f39488o0.i1()) {
            i9 = org.telegram.ui.ActionBar.f6.G6;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.D6;
        }
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        TextView textView = this.f39486n;
        textView.setTextColor(w02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.P9, false));
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        this.f39489r.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        int i11 = this.f39472b0;
        if (i11 == 11) {
            int i12 = org.telegram.ui.ActionBar.f6.f23369y6;
            this.F.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
            this.G.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
            int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23144l6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.H.setColorFilter(new PorterDuffColorFilter(w03, mode));
            this.I.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i10, false), mode));
            this.E.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        }
        r(this.f39469a);
        r(this.J);
        r(this.K);
        r(this.L);
        sr srVar = this.f39478f;
        if (srVar != null) {
            srVar.invalidate();
        }
        hf0 hf0Var = this.v;
        Integer num = (Integer) hf0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.f6.D6);
        }
        hf0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, num.intValue(), false));
        if (i11 != 15) {
            this.f39492x.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23229q6, false));
        }
        this.A.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        vr[] vrVarArr;
        boolean z10;
        super.onConfigurationChanged(configuration);
        sr srVar = this.f39478f;
        if (srVar != null && (vrVarArr = srVar.f42755f) != null) {
            for (vr vrVar : vrVarArr) {
                if (a() && !AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                vrVar.setShowSoftInputOnFocusCompat(z10);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f39487n0);
    }

    public final void q(Runnable runnable) {
        if (this.f39472b0 == 3) {
            runnable.run();
            return;
        }
        int i9 = 0;
        while (true) {
            sr srVar = this.f39478f;
            vr[] vrVarArr = srVar.f42755f;
            if (i9 < vrVarArr.length) {
                srVar.postDelayed(new bf0(this, i9, 2), i9 * 75);
                i9++;
            } else {
                srVar.postDelayed(new cf0(2, this, runnable), (vrVarArr.length * 75) + 400);
                return;
            }
        }
    }

    public final void s() {
        if (this.O != null) {
            return;
        }
        this.S = 15000;
        int i9 = this.R;
        if (i9 > 15000) {
            this.S = i9;
        }
        this.O = new Timer();
        this.U = System.currentTimeMillis();
        this.O.schedule(new kh.j2(this, 3), 0L, 1000L);
    }

    public final void t() {
        if (this.N != null) {
            return;
        }
        int i9 = org.telegram.ui.ActionBar.f6.D6;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        hf0 hf0Var = this.v;
        hf0Var.setTextColor(w02);
        hf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i9));
        Timer timer = new Timer();
        this.N = timer;
        timer.schedule(new if0(this), 0L, 1000L);
    }

    public final void v() {
        try {
            synchronized (this.Q) {
                Timer timer = this.O;
                if (timer != null) {
                    timer.cancel();
                    this.O = null;
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void w() {
        hf0 hf0Var = this.v;
        int i9 = org.telegram.ui.ActionBar.f6.D6;
        hf0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.v.setTag(R.id.color_key_tag, Integer.valueOf(i9));
        try {
            synchronized (this.Q) {
                Timer timer = this.N;
                if (timer != null) {
                    timer.cancel();
                    this.N = null;
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void x() {
        int i9;
        if (!this.W && !this.f39477e0) {
            fg0 fg0Var = this.f39488o0;
            if (!fg0Var.f38274k0) {
                this.f39477e0 = true;
                this.v.invalidate();
                this.f39492x.invalidate();
                Bundle bundle = new Bundle();
                bundle.putString("phone", this.f39471b);
                bundle.putString("ephone", this.f39476e);
                bundle.putString("phoneFormated", this.d);
                bundle.putInt("prevType", this.f39472b0);
                this.W = true;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.d;
                tL_auth_resendCode.phone_code_hash = this.f39473c;
                i9 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                A(ConnectionsManager.getInstance(i9).sendRequest(tL_auth_resendCode, new af0(this, bundle, 1), 10));
            }
        }
    }

    public final void y() {
        float f10;
        sr srVar = this.f39478f;
        try {
            srVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i9 = 0;
        while (true) {
            vr[] vrVarArr = srVar.f42755f;
            if (i9 >= vrVarArr.length) {
                break;
            }
            vrVarArr[i9].setText("");
            srVar.f42755f[i9].i(1.0f);
            i9++;
        }
        od0 od0Var = this.f39491w;
        if (od0Var.getCurrentView() != this.A) {
            od0Var.showNext();
        }
        srVar.f42755f[0].requestFocus();
        if (this.f39472b0 == 11) {
            f10 = 3.5f;
        } else {
            f10 = 10.0f;
        }
        AndroidUtilities.shakeViewSpring(srVar, f10, new ve0(this, 7));
        ve0 ve0Var = this.f39487n0;
        removeCallbacks(ve0Var);
        postDelayed(ve0Var, 5000L);
        this.m0 = true;
    }

    public final void z(boolean z10) {
        if (this.J != null) {
            if (!this.M) {
                return;
            }
            this.M = false;
            this.f39490s.setAutoRepeat(false);
            org.telegram.ui.Components.mi0 mi0Var = this.K;
            mi0Var.I(0);
            mi0Var.P(mi0Var.f30847e[0] - 1, new ve0(this, 1));
            return;
        }
        this.f39488o0.k1(z10, true);
    }
}
