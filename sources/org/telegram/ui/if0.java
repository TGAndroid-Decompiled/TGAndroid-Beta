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
public final class if0 extends org.telegram.ui.Components.mv0 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f39229p0 = 0;
    public final TextView A;
    public final LinearLayout B;
    public final org.telegram.ui.Components.aj0 C;
    public Bundle D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final ImageView H;
    public final ImageView I;
    public final org.telegram.ui.Components.xi0 J;
    public final org.telegram.ui.Components.xi0 K;
    public final org.telegram.ui.Components.xi0 L;
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
    public final org.telegram.ui.Components.xi0 f39230a;
    public String f39231a0;
    public String f39232b;
    public final int f39233b0;
    public String f39234c;
    public int f39235c0;
    public String d;
    public int f39236d0;
    public String f39237e;
    public boolean f39238e0;
    public final sr f39239f;
    public String f39240f0;
    public String f39241g0;
    public final org.telegram.ui.Components.voip.p2 h;
    public String f39242h0;
    public int f39243i0;
    public String f39244j0;
    public Bundle f39245k0;
    public TLRPC.TL_auth_sentCode f39246l0;
    public boolean m0;
    public final TextView f39247n;
    public final ue0 f39248n0;
    public final fg0 f39249o0;
    public final TextView f39250r;
    public final org.telegram.ui.Components.aj0 f39251s;
    public final gf0 v;
    public final od0 f39252w;
    public final gf0 f39253x;
    public final FrameLayout f39254y;

    public if0(org.telegram.ui.fg0 r39, android.content.Context r40, int r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.if0.<init>(org.telegram.ui.fg0, android.content.Context, int):void");
    }

    public static void o(if0 if0Var, Context context) {
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
            sb2.append(if0Var.f39237e);
            sb2.append(" Android Registration/Login Issue ");
            sb2.append(str4);
            if (if0Var.f39249o0.f38158e) {
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
            sb3.append(if0Var.d);
            sb3.append("\n");
            sb3.append("\n");
            try {
                if (i10 >= 22) {
                    SubscriptionManager from = SubscriptionManager.from(if0Var.getContext());
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
            if (if0Var.f39249o0.f38158e) {
                str3 = "no_otp";
            } else {
                str3 = "no_otp_paid";
            }
            sb3.append(str3);
            sb3.append("\n");
            if (!TextUtils.isEmpty(if0Var.f39231a0)) {
                sb3.append("Error: ");
                sb3.append(if0Var.f39231a0);
                sb3.append("\n");
            }
            sb3.append("\n\n================================================\n");
            sb3.append("WRITE YOUR COMMENT HERE:\n");
            sb3.append("\n");
            sb3.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb3.toString());
            if0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            if0Var.f39249o0.l1(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
        }
    }

    public static void r(org.telegram.ui.Components.xi0 xi0Var) {
        if (xi0Var != null) {
            xi0Var.O(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.P9, false), "Bubble");
            int i10 = org.telegram.ui.ActionBar.g6.G6;
            xi0Var.O(org.telegram.ui.ActionBar.g6.w0(null, i10, false), "Phone");
            xi0Var.O(org.telegram.ui.ActionBar.g6.w0(null, i10, false), "Note");
        }
    }

    public void setProblemTextVisible(boolean z10) {
        float f9;
        gf0 gf0Var = this.f39253x;
        if (gf0Var != null) {
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            if (gf0Var.getAlpha() != f9) {
                gf0Var.animate().cancel();
                gf0Var.animate().alpha(f9).setDuration(150L).start();
            }
        }
    }

    public final void A(int i10) {
        org.telegram.ui.Components.xi0 xi0Var = this.J;
        if (xi0Var != null) {
            if (this.M) {
                return;
            }
            this.M = true;
            org.telegram.ui.Components.xi0 xi0Var2 = this.f39230a;
            if (xi0Var2.X != xi0Var2.f34737e[0] - 1) {
                xi0Var2.f34751q0 = new af0(this, i10, 0);
                return;
            }
            xi0Var.f34751q0 = new ue0(this, 3);
            org.telegram.ui.Components.aj0 aj0Var = this.f39251s;
            aj0Var.setAutoRepeat(false);
            xi0Var.L(0, false, false);
            aj0Var.setAnimation(xi0Var);
            aj0Var.d();
            return;
        }
        this.f39249o0.n1(i10, true);
    }

    @Override
    public final boolean a() {
        if (this.f39233b0 != 3) {
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
        fg0 fg0Var = this.f39249o0;
        if (fg0Var.B != 0) {
            fg0Var.finishFragment();
            return false;
        }
        int i11 = this.f39236d0;
        if (i11 != 0) {
            fg0Var.u1(i11, true, null, true);
            return false;
        } else if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
            String string = LocaleController.getString(R.string.EditNumber);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.N = string;
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("EditNumberInfo", R.string.EditNumberInfo, this.f39232b));
            alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Edit), new we0(this, 0));
            fg0Var.showDialog(c2Var);
            return false;
        } else {
            this.W = false;
            z(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.d;
            tL_auth_cancelCode.phone_code_hash = this.f39234c;
            i10 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_cancelCode, new lh.o5(14), 10);
            w();
            v();
            this.D = null;
            int i12 = this.f39233b0;
            if (i12 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i12 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i12 == 3) {
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
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (this.V) {
            sr srVar = this.f39239f;
            if (srVar.f42455f != null) {
                if (i10 == NotificationCenter.didReceiveSmsCode) {
                    srVar.setText("" + objArr[0]);
                    h(null);
                } else if (i10 == NotificationCenter.didReceiveCall) {
                    String str = "" + objArr[0];
                    if (AndroidUtilities.checkPhonePattern(this.f39240f0, str)) {
                        if (!this.f39240f0.equals("*")) {
                            this.f39242h0 = str;
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
        int i10 = this.f39233b0;
        if (i10 == 15) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 3) {
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
        this.f39238e0 = false;
        this.W = false;
        if (this.f39236d0 != 0 && (bundle = this.D) != null) {
            bundle.putInt("timeout", this.R);
        }
    }

    @Override
    public String getHeaderName() {
        int i10 = this.f39233b0;
        if (i10 != 3 && i10 != 11) {
            return LocaleController.getString("YourCode", R.string.YourCode);
        }
        return this.f39232b;
    }

    @Override
    public final void h(String str) {
        int i10;
        int i11;
        int i12;
        fg0 fg0Var = this.f39249o0;
        int i13 = fg0Var.f38151a;
        if (i13 == 11) {
            if (this.W) {
                return;
            }
        } else if (!this.W) {
            if ((i13 < 1 || i13 > 4) && i13 != 15) {
                return;
            }
        } else {
            return;
        }
        sr srVar = this.f39239f;
        if (str == null) {
            str = srVar.getCode();
        }
        int i14 = 0;
        if (TextUtils.isEmpty(str)) {
            fg0.U0(fg0Var, srVar, false);
            return;
        }
        int i15 = fg0Var.f38151a;
        if (i15 < 1 || i15 > 4 || !srVar.f42454e) {
            this.W = true;
            int i16 = this.f39233b0;
            if (i16 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 3) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.V = false;
            int i17 = fg0Var.B;
            if (i17 != 1) {
                if (i17 != 2) {
                    TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                    tL_auth_signIn.phone_number = this.d;
                    tL_auth_signIn.phone_code = str;
                    tL_auth_signIn.phone_code_hash = this.f39234c;
                    tL_auth_signIn.flags |= 1;
                    w();
                    srVar.f42454e = true;
                    ur[] urVarArr = srVar.f42455f;
                    int length = urVarArr.length;
                    while (i14 < length) {
                        urVarArr[i14].j(0.0f);
                        i14++;
                    }
                    i12 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                    A(ConnectionsManager.getInstance(i12).sendRequest(tL_auth_signIn, new ve0(this, tL_auth_signIn, 0), 10));
                    fg0Var.v1(true, true);
                    return;
                }
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.f39234c;
                w();
                srVar.f42454e = true;
                ur[] urVarArr2 = srVar.f42455f;
                int length2 = urVarArr2.length;
                while (i14 < length2) {
                    urVarArr2[i14].j(0.0f);
                    i14++;
                }
                i11 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                A(ConnectionsManager.getInstance(i11).sendRequest(changephone, new o(this, 13), 2));
                fg0Var.v1(true, true);
                return;
            }
            this.d = fg0Var.C;
            TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
            confirmphone.phone_code = str;
            confirmphone.phone_code_hash = this.f39234c;
            w();
            srVar.f42454e = true;
            ur[] urVarArr3 = srVar.f42455f;
            int length3 = urVarArr3.length;
            while (i14 < length3) {
                urVarArr3[i14].j(0.0f);
                i14++;
            }
            i10 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
            A(ConnectionsManager.getInstance(i10).sendRequest(confirmphone, new u80(6, this, confirmphone), 2));
        }
    }

    @Override
    public final void j() {
        org.telegram.ui.Components.xi0 xi0Var = this.f39230a;
        if (xi0Var != null) {
            xi0Var.K(0);
        }
        AndroidUtilities.runOnUIThread(new ue0(this, 0), fg0.f38150p0);
    }

    @Override
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i10 = this.f39233b0;
        sb2.append(i10);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.D = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.f39242h0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i10);
        if (string2 != null) {
            sr srVar = this.f39239f;
            if (srVar.f42455f != null) {
                srVar.setText(string2);
            }
        }
        int i11 = bundle.getInt("time");
        if (i11 != 0) {
            this.R = i11;
        }
        int i12 = bundle.getInt("open");
        if (i12 != 0) {
            this.P = i12;
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f39239f.getCode();
        int length = code.length();
        int i10 = this.f39233b0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i10, code);
        }
        String str = this.f39242h0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.D != null) {
            bundle.putBundle(j7.l1.k(i10, "smsview_params_"), this.D);
        }
        int i11 = this.R;
        if (i11 != 0) {
            bundle.putInt("time", i11);
        }
        int i12 = this.P;
        if (i12 != 0) {
            bundle.putInt("open", i12);
        }
    }

    @Override
    public final void m(android.os.Bundle r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.if0.m(android.os.Bundle, boolean):void");
    }

    @Override
    public final void n() {
        int i10;
        if (this.f39249o0.i1()) {
            i10 = org.telegram.ui.ActionBar.g6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.D6;
        }
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        TextView textView = this.f39247n;
        textView.setTextColor(w02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.P9, false));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        this.f39250r.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        int i12 = this.f39233b0;
        if (i12 == 11) {
            int i13 = org.telegram.ui.ActionBar.g6.f23433y6;
            this.F.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            this.G.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23206l6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.H.setColorFilter(new PorterDuffColorFilter(w03, mode));
            this.I.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), mode));
            this.E.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        }
        r(this.f39230a);
        r(this.J);
        r(this.K);
        r(this.L);
        sr srVar = this.f39239f;
        if (srVar != null) {
            srVar.invalidate();
        }
        gf0 gf0Var = this.v;
        Integer num = (Integer) gf0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.g6.D6);
        }
        gf0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, num.intValue(), false));
        if (i12 != 15) {
            this.f39253x.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
        }
        this.A.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ur[] urVarArr;
        boolean z10;
        super.onConfigurationChanged(configuration);
        sr srVar = this.f39239f;
        if (srVar != null && (urVarArr = srVar.f42455f) != null) {
            for (ur urVar : urVarArr) {
                if (a() && !AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                urVar.setShowSoftInputOnFocusCompat(z10);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f39248n0);
    }

    public final void q(Runnable runnable) {
        if (this.f39233b0 == 3) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            sr srVar = this.f39239f;
            ur[] urVarArr = srVar.f42455f;
            if (i10 < urVarArr.length) {
                srVar.postDelayed(new af0(this, i10, 2), i10 * 75);
                i10++;
            } else {
                srVar.postDelayed(new x60(29, this, runnable), (urVarArr.length * 75) + 400);
                return;
            }
        }
    }

    public final void s() {
        if (this.O != null) {
            return;
        }
        this.S = 15000;
        int i10 = this.R;
        if (i10 > 15000) {
            this.S = i10;
        }
        this.O = new Timer();
        this.U = System.currentTimeMillis();
        this.O.schedule(new nh.g2(this, 2), 0L, 1000L);
    }

    public final void t() {
        if (this.N != null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.g6.D6;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        gf0 gf0Var = this.v;
        gf0Var.setTextColor(w02);
        gf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        Timer timer = new Timer();
        this.N = timer;
        timer.schedule(new hf0(this), 0L, 1000L);
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
        gf0 gf0Var = this.v;
        int i10 = org.telegram.ui.ActionBar.g6.D6;
        gf0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.v.setTag(R.id.color_key_tag, Integer.valueOf(i10));
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
        int i10;
        if (!this.W && !this.f39238e0) {
            fg0 fg0Var = this.f39249o0;
            if (!fg0Var.f38166k0) {
                this.f39238e0 = true;
                this.v.invalidate();
                this.f39253x.invalidate();
                Bundle bundle = new Bundle();
                bundle.putString("phone", this.f39232b);
                bundle.putString("ephone", this.f39237e);
                bundle.putString("phoneFormated", this.d);
                bundle.putInt("prevType", this.f39233b0);
                this.W = true;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.d;
                tL_auth_resendCode.phone_code_hash = this.f39234c;
                i10 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                A(ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new ze0(this, bundle, 1), 10));
            }
        }
    }

    public final void y() {
        float f9;
        sr srVar = this.f39239f;
        try {
            srVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i10 = 0;
        while (true) {
            ur[] urVarArr = srVar.f42455f;
            if (i10 >= urVarArr.length) {
                break;
            }
            urVarArr[i10].setText("");
            srVar.f42455f[i10].i(1.0f);
            i10++;
        }
        od0 od0Var = this.f39252w;
        if (od0Var.getCurrentView() != this.A) {
            od0Var.showNext();
        }
        srVar.f42455f[0].requestFocus();
        if (this.f39233b0 == 11) {
            f9 = 3.5f;
        } else {
            f9 = 10.0f;
        }
        AndroidUtilities.shakeViewSpring(srVar, f9, new ue0(this, 7));
        ue0 ue0Var = this.f39248n0;
        removeCallbacks(ue0Var);
        postDelayed(ue0Var, 5000L);
        this.m0 = true;
    }

    public final void z(boolean z10) {
        if (this.J != null) {
            if (!this.M) {
                return;
            }
            this.M = false;
            this.f39251s.setAutoRepeat(false);
            org.telegram.ui.Components.xi0 xi0Var = this.K;
            xi0Var.I(0);
            xi0Var.P(xi0Var.f34737e[0] - 1, new ue0(this, 1));
            return;
        }
        this.f39249o0.k1(z10, true);
    }
}
