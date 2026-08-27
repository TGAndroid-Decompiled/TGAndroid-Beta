package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AuthTokensHelper;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgressView;

public final class ig0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {

    public static final int f39078p0;
    public boolean A;
    public int B;
    public String C;
    public Bundle D;
    public TLRPC.TL_auth_sentCode E;
    public int F;
    public final AnimatorSet[] G;
    public AnimatorSet H;
    public org.telegram.ui.Components.l21 I;
    public org.telegram.ui.Components.m10 J;
    public i6 K;
    public int L;
    public final boolean[] M;
    public org.telegram.ui.ActionBar.b2 N;
    public gh.q4 O;
    public xf0 P;
    public ImageView Q;
    public RadialProgressView R;
    public ImageView S;
    public org.telegram.ui.Components.th0 T;
    public LinearLayout U;
    public n0 V;
    public boolean W;
    public wf0 X;
    public boolean Y;
    public Runnable Z;

    public int f39079a;

    public xv f39080a0;

    public final org.telegram.ui.Components.ev0[] f39081b;

    public TextView f39082b0;

    public org.telegram.ui.Components.ir f39083c;

    public boolean f39084c0;
    public ValueAnimator d;

    public boolean f39085d0;

    public boolean f39086e;

    public final boolean[] f39087e0;

    public boolean f39088f;

    public final Runnable[] f39089f0;

    public final boolean[] f39090g0;
    public Dialog h;

    public boolean f39091h0;

    public View f39092i0;

    public boolean f39093j0;

    public boolean f39094k0;

    public TLRPC.TL_help_termsOfService f39095l0;
    public int m0;

    public Dialog f39096n;

    public boolean f39097n0;

    public vc0 f39098o0;

    public final ArrayList f39099r;

    public final ArrayList f39100s;
    public boolean v;

    public boolean f39101w;

    public boolean f39102x;

    public boolean f39103y;

    static {
        f39078p0 = SharedConfig.getDevicePerformanceClass() <= 1 ? 150 : 100;
    }

    public ig0() {
        super(null);
        this.f39081b = new org.telegram.ui.Components.ev0[19];
        this.f39099r = new ArrayList();
        this.f39100s = new ArrayList();
        this.v = true;
        this.f39101w = true;
        this.f39103y = true;
        this.A = false;
        this.B = 0;
        this.G = new AnimatorSet[2];
        this.M = new boolean[]{true, false};
        this.W = false;
        this.f39087e0 = new boolean[2];
        this.f39089f0 = new Runnable[2];
        this.f39090g0 = new boolean[2];
    }

    public static boolean T0(ig0 ig0Var, View view) {
        if (ig0Var.h1()) {
            return true;
        }
        return AndroidUtilities.showKeyboard(view);
    }

    public static void U(ig0 ig0Var, TLRPC.TL_error tL_error, String str, String str2, String str3) {
        ig0Var.k1(false, true);
        if (tL_error == null) {
            if (str == null || str2 == null || str3 == null) {
                ig0Var.u1(0, true, null, true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("phoneFormated", str);
            bundle.putString("phoneHash", str2);
            bundle.putString("code", str3);
            ig0Var.u1(5, true, bundle, false);
            return;
        }
        if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
            ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
            return;
        }
        if (!tL_error.text.startsWith("2FA_CONFIRM_WAIT_")) {
            ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("phoneFormated", str);
        bundle2.putString("phoneHash", str2);
        bundle2.putString("code", str3);
        bundle2.putInt("startTime", ConnectionsManager.getInstance(ig0Var.currentAccount).getCurrentTime());
        bundle2.putInt("waitTime", Utilities.parseInt((CharSequence) tL_error.text.replace("2FA_CONFIRM_WAIT_", "")).intValue());
        ig0Var.u1(8, true, bundle2, false);
    }

    public static void U0(ig0 ig0Var, View view, boolean z10) {
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(view, 3.5f);
        if (z10 && (view instanceof org.telegram.ui.Components.jc0)) {
            Runnable runnable = (Runnable) view.getTag(R.id.timeout_callback);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
            org.telegram.ui.Components.jc0 jc0Var = (org.telegram.ui.Components.jc0) view;
            AtomicReference atomicReference = new AtomicReference();
            EditText attachedEditText = jc0Var.getAttachedEditText();
            gh.n4 n4Var = new gh.n4(8, attachedEditText, atomicReference);
            jc0Var.a(1.0f);
            org.telegram.ui.Components.l11 l11Var = new org.telegram.ui.Components.l11(jc0Var, view, attachedEditText, n4Var, 12);
            atomicReference.set(l11Var);
            view.postDelayed(l11Var, 2000L);
            view.setTag(R.id.timeout_callback, l11Var);
            if (attachedEditText != null) {
                attachedEditText.addTextChangedListener(n4Var);
            }
        }
    }

    public static void V(ig0 ig0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10, x7.d dVar) {
        x7.e eVar = ((m7.d) ((com.google.android.gms.common.api.q) dVar.f2040a)).f17877b;
        String str2 = eVar == null ? null : eVar.f49374a;
        if (str2 == null) {
            FileLog.d("{SAFETYNET_NULL_JWS} Resend firebase sms because JWS = null");
            ig0Var.s1(bundle, auth_sentcode, "SAFETYNET_NULL_JWS");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.safety_net_token = str2;
        tL_auth_requestFirebaseSms.flags |= 1;
        String[] strArrSplit = str2.split("\\.");
        if (strArrSplit.length <= 0) {
            FileLog.d("{SAFETYNET_CANT_SPLIT} Resend firebase sms because can't split JWS token");
            ig0Var.s1(bundle, auth_sentcode, "SAFETYNET_CANT_SPLIT");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(strArrSplit[1].getBytes(StandardCharsets.UTF_8), 0)));
            boolean zOptBoolean = jSONObject.optBoolean("basicIntegrity");
            boolean zOptBoolean2 = jSONObject.optBoolean("ctsProfileMatch");
            try {
                if (zOptBoolean && zOptBoolean2) {
                    ConnectionsManager.getInstance(ig0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new zc0(1, bundle, auth_sentcode, ig0Var, z10), 10);
                    return;
                }
                if (!zOptBoolean && !zOptBoolean2) {
                    FileLog.d("{SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false and basicIntegrity = false");
                    ig0Var.s1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE");
                    return;
                } else if (!zOptBoolean) {
                    FileLog.d("{SAFETYNET_BASICINTEGRITY_FALSE} Resend firebase sms because basicIntegrity = false");
                    ig0Var.s1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_FALSE");
                    return;
                } else {
                    if (zOptBoolean2) {
                        return;
                    }
                    FileLog.d("{SAFETYNET_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false");
                    ig0Var.s1(bundle, auth_sentcode, "SAFETYNET_CTSPROFILEMATCH_FALSE");
                    return;
                }
            } catch (JSONException e9) {
                e = e9;
            }
        } catch (JSONException e10) {
            e = e10;
        }
        FileLog.e(e);
        FileLog.d("{SAFETYNET_JSON_EXCEPTION} Resend firebase sms because of exception");
        ig0Var.s1(bundle, auth_sentcode, "SAFETYNET_JSON_EXCEPTION");
    }

    public static HashSet V0(ig0 ig0Var) {
        HashSet hashSet = new HashSet();
        try {
            String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                hashSet.add(line1Number);
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 22) {
                SubscriptionManager subscriptionManagerFrom = SubscriptionManager.from(ig0Var.getParentActivity());
                List<SubscriptionInfo> completeActiveSubscriptionInfoList = i10 >= 30 ? subscriptionManagerFrom.getCompleteActiveSubscriptionInfoList() : null;
                if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i10 >= 28) {
                    completeActiveSubscriptionInfoList = subscriptionManagerFrom.getAccessibleSubscriptionInfoList();
                }
                if (completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) {
                    completeActiveSubscriptionInfoList = subscriptionManagerFrom.getActiveSubscriptionInfoList();
                }
                if (completeActiveSubscriptionInfoList != null) {
                    for (int i11 = 0; i11 < completeActiveSubscriptionInfoList.size(); i11++) {
                        String number = completeActiveSubscriptionInfoList.get(i11).getNumber();
                        if (!TextUtils.isEmpty(number)) {
                            hashSet.add(number);
                        }
                    }
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        return hashSet;
    }

    public static void W(ig0 ig0Var, String str, String str2, String str3) {
        ig0Var.n1(0, true);
        TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
        deleteaccount.reason = "Forgot password";
        ConnectionsManager.getInstance(ig0Var.currentAccount).sendRequest(deleteaccount, new gh.f1(ig0Var, str, str2, str3, 12), 10);
    }

    public static void X(ig0 ig0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            FileLog.d("Resend firebase sms because integrity token = null");
            ig0Var.s1(bundle, auth_sentcode, "PLAYINTEGRITY_TOKEN_NULL");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.play_integrity_token = str2;
        tL_auth_requestFirebaseSms.flags |= 4;
        ConnectionsManager.getInstance(ig0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new zc0(0, bundle, auth_sentcode, ig0Var, z10), 10);
    }

    public static String f1(Exception exc) {
        if (exc == null) {
            return "NULL";
        }
        String simpleName = exc.getClass().getSimpleName();
        if (exc.getMessage() != null) {
            if (simpleName.length() > 0) {
                simpleName = simpleName.concat(" ");
            }
            StringBuilder sbO = com.google.android.recaptcha.internal.a.o(simpleName);
            sbO.append(exc.getMessage());
            simpleName = sbO.toString();
        }
        return simpleName.toUpperCase().replaceAll(" ", "_");
    }

    public static Bundle j1(int i10, boolean z10) {
        try {
            Bundle bundle = new Bundle();
            Context context = ApplicationLoader.applicationContext;
            StringBuilder sb2 = new StringBuilder("logininfo2");
            sb2.append(z10 ? "_" + i10 : "");
            for (Map.Entry<String, ?> entry : context.getSharedPreferences(sb2.toString(), 0).getAll().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                String[] strArrSplit = key.split("_\\|_");
                if (strArrSplit.length == 1) {
                    if (value instanceof String) {
                        bundle.putString(key, (String) value);
                    } else if (value instanceof Integer) {
                        bundle.putInt(key, ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        bundle.putBoolean(key, ((Boolean) value).booleanValue());
                    }
                } else if (strArrSplit.length == 2) {
                    Bundle bundle2 = bundle.getBundle(strArrSplit[0]);
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        bundle.putBundle(strArrSplit[0], bundle2);
                    }
                    if (value instanceof String) {
                        bundle2.putString(strArrSplit[1], (String) value);
                    } else if (value instanceof Integer) {
                        bundle2.putInt(strArrSplit[1], ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        bundle2.putBoolean(strArrSplit[1], ((Boolean) value).booleanValue());
                    }
                }
            }
            return bundle;
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    public static void m1(org.telegram.ui.ActionBar.n2 n2Var, String str, j9.a aVar, boolean z10) {
        List list;
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        if (z10) {
            b2Var.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
            b2Var.P = LocaleController.getString("BannedPhoneNumber", R.string.BannedPhoneNumber);
        } else if (aVar == null || (list = (List) aVar.d) == null || list.isEmpty() || ((nt) aVar.f12864c) == null) {
            b2Var.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
            b2Var.P = LocaleController.getString(R.string.InvalidPhoneNumber);
        } else {
            Iterator it = ((List) aVar.d).iterator();
            int i10 = Integer.MAX_VALUE;
            while (it.hasNext()) {
                int length = ((String) it.next()).replace(" ", "").length();
                if (length < i10) {
                    i10 = length;
                }
            }
            if (oe.b.d(str, false).length() - ((nt) aVar.f12864c).f40917c.length() < i10) {
                b2Var.N = LocaleController.getString(R.string.WrongNumberFormat);
                b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("ShortNumberInfo", R.string.ShortNumberInfo, ((nt) aVar.f12864c).f40915a, (String) aVar.f12863b));
            } else {
                b2Var.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                b2Var.P = LocaleController.getString(R.string.InvalidPhoneNumber);
            }
        }
        alertDialog$Builder.i(LocaleController.getString("BotHelp", R.string.BotHelp), new b5.d(str, n2Var, z10));
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        n2Var.showDialog(b2Var);
    }

    public static void n0(ig0 ig0Var, String str, String str2, String str3) {
        if (ig0Var.R.getTag() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
        alertDialog$Builder.f22702a.P = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
        alertDialog$Builder.f22702a.N = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
        alertDialog$Builder.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new a1.d(ig0Var, str, str2, str3, 15));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        ig0Var.showDialog(alertDialog$Builder.f22702a);
    }

    public static void r1(Bundle bundle, SharedPreferences.Editor editor, String str) {
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof String) {
                if (str != null) {
                    editor.putString(a9.p.w(str, "_|_", str2), (String) obj);
                } else {
                    editor.putString(str2, (String) obj);
                }
            } else if (obj instanceof Integer) {
                if (str != null) {
                    editor.putInt(a9.p.w(str, "_|_", str2), ((Integer) obj).intValue());
                } else {
                    editor.putInt(str2, ((Integer) obj).intValue());
                }
            } else if (obj instanceof Boolean) {
                if (str != null) {
                    editor.putBoolean(a9.p.w(str, "_|_", str2), ((Boolean) obj).booleanValue());
                } else {
                    editor.putBoolean(str2, ((Boolean) obj).booleanValue());
                }
            } else if (obj instanceof Bundle) {
                r1((Bundle) obj, editor, str2);
            }
        }
    }

    @Override
    public final void clearViews() {
        View view = this.fragmentView;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                try {
                    onRemoveFromParent();
                    viewGroup.removeViewInLayout(this.fragmentView);
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
            if (this.f39093j0) {
                this.f39092i0 = this.fragmentView;
            }
            this.fragmentView = null;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && !this.f39093j0) {
            ViewGroup viewGroup2 = (ViewGroup) kVar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            this.actionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        int i10;
        View view = this.f39092i0;
        if (view != null) {
            this.fragmentView = view;
            this.f39092i0 = null;
            return view;
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 1));
        this.F = 0;
        boolean[] zArr = this.M;
        zArr[0] = true;
        zArr[1] = false;
        gh.q4 q4Var = new gh.q4(this, context, 6);
        this.O = q4Var;
        q4Var.setDelegate(new cd0(0, this));
        this.fragmentView = this.O;
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 4);
        v1Var.setFillViewport(true);
        this.O.addView(v1Var, h7.z5.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        v1Var.addView(this.U, h7.z5.x(-1, -2, 51));
        Space space = new Space(context);
        space.setMinimumHeight(AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight);
        this.U.addView(space);
        n0 n0Var = new n0(this, context, 12);
        this.V = n0Var;
        this.U.addView(n0Var, h7.z5.l(1.0f, -1, 0));
        org.telegram.ui.Components.ir irVar = new org.telegram.ui.Components.ir(context);
        this.f39083c = irVar;
        irVar.setViewToFindFocus(this.V);
        this.U.addView(this.f39083c, h7.z5.n(-1, 230));
        hg0 hg0Var = new hg0(this, context);
        org.telegram.ui.Components.ev0[] ev0VarArr = this.f39081b;
        ev0VarArr[0] = hg0Var;
        ev0VarArr[1] = new mf0(this, context, 1);
        ev0VarArr[2] = new mf0(this, context, 2);
        ev0VarArr[3] = new mf0(this, context, 3);
        ev0VarArr[4] = new mf0(this, context, 4);
        ev0VarArr[5] = new te0(this, context);
        ev0VarArr[6] = new be0(this, context);
        ev0VarArr[7] = new me0(this, context);
        int i11 = 8;
        ev0VarArr[8] = new ue0(this, context);
        ev0VarArr[9] = new yd0(this, context, 0);
        ev0VarArr[10] = new yd0(this, context, 1);
        ev0VarArr[11] = new mf0(this, context, 11);
        ev0VarArr[12] = new xe0(this, context);
        ev0VarArr[13] = new sd0(this, context, true);
        ev0VarArr[14] = new sd0(this, context, false);
        ev0VarArr[15] = new mf0(this, context, 15);
        ev0VarArr[16] = new je0(this, context, 16);
        ev0VarArr[17] = new je0(this, context, 17);
        int i12 = 18;
        ev0VarArr[18] = new rf0(this, context);
        int i13 = 0;
        while (i13 < ev0VarArr.length) {
            org.telegram.ui.Components.ev0 ev0Var = ev0VarArr[i13];
            if (i13 == 0) {
                i11 = 0;
            }
            ev0Var.setVisibility(i11);
            this.V.addView(ev0VarArr[i13], h7.z5.d(-1, -1.0f, 17, AndroidUtilities.isTablet() ? 26.0f : 18.0f, i13 != i12 ? 30.0f : 0.0f, AndroidUtilities.isTablet() ? 26.0f : 18.0f, 0.0f));
            i13++;
            i12 = 18;
            i11 = 8;
        }
        Bundle bundleJ1 = this.B == 0 ? j1(this.currentAccount, this.f39102x) : null;
        if (bundleJ1 != null && ((i10 = bundleJ1.getInt("currentViewNum", 0)) < 0 || i10 >= ev0VarArr.length)) {
            bundleJ1 = null;
        }
        if (bundleJ1 != null) {
            this.f39079a = bundleJ1.getInt("currentViewNum", 0);
            this.f39103y = bundleJ1.getInt("syncContacts", 1) == 1;
            int i14 = this.f39079a;
            if (i14 >= 1 && i14 <= 4) {
                int i15 = bundleJ1.getInt("open");
                if (i15 != 0 && Math.abs((System.currentTimeMillis() / 1000) - ((long) i15)) >= 86400) {
                    this.f39079a = 0;
                    e1();
                    bundleJ1 = null;
                }
            } else if (i14 == 6) {
                if (((be0) ev0VarArr[6]).f36798n == null) {
                    this.f39079a = 0;
                    e1();
                    bundleJ1 = null;
                }
            } else if (i14 == 7 && ((me0) ev0VarArr[7]).h == null) {
                this.f39079a = 0;
                e1();
                bundleJ1 = null;
            }
        }
        org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(context, this.resourceProvider, false);
        this.J = m10Var;
        m10Var.e(zArr[0], false);
        this.K = new i6(this.J);
        this.O.addView(this.J, h7.z5.d(56, 56.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
        final int i16 = 0;
        this.J.setOnClickListener(new View.OnClickListener(this) {

            public final ig0 f37362b;

            {
                this.f37362b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        this.f37362b.p1();
                        break;
                    case 1:
                        ig0 ig0Var = this.f37362b;
                        if (ig0Var.onBackPressed(true)) {
                            ig0Var.finishFragment();
                        }
                        break;
                    case 2:
                        ig0 ig0Var2 = this.f37362b;
                        xv xvVar = ig0Var2.f39080a0;
                        if (xvVar != null) {
                            xvVar.run();
                        }
                        ig0Var2.finishFragment();
                        break;
                    default:
                        ig0 ig0Var3 = this.f37362b;
                        ig0Var3.getClass();
                        ig0Var3.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        ((o1.j) this.K.f38985c).b(new ed0(this, i16));
        ImageView imageView = new ImageView(context);
        this.Q = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        final int i17 = 1;
        this.Q.setOnClickListener(new View.OnClickListener(this) {

            public final ig0 f37362b;

            {
                this.f37362b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        this.f37362b.p1();
                        break;
                    case 1:
                        ig0 ig0Var = this.f37362b;
                        if (ig0Var.onBackPressed(true)) {
                            ig0Var.finishFragment();
                        }
                        break;
                    case 2:
                        ig0 ig0Var2 = this.f37362b;
                        xv xvVar = ig0Var2.f39080a0;
                        if (xvVar != null) {
                            xvVar.run();
                        }
                        ig0Var2.finishFragment();
                        break;
                    default:
                        ig0 ig0Var3 = this.f37362b;
                        ig0Var3.getClass();
                        ig0Var3.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        this.Q.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        int iDp = AndroidUtilities.dp(4.0f);
        this.Q.setPadding(iDp, iDp, iDp, iDp);
        this.O.addView(this.Q, h7.z5.d(32, 32.0f, 51, 16.0f, 16.0f, 0.0f, 0.0f));
        if (this.f39080a0 != null && !this.f39084c0 && this.f39085d0) {
            TextView textView = new TextView(context);
            this.f39082b0 = textView;
            textView.setGravity(19);
            this.f39082b0.setTextSize(1, 15.0f);
            this.f39082b0.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.f39082b0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            this.f39082b0.setText(LocaleController.getString(R.string.YourEmailSkip));
            this.f39082b0.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
            this.O.addView(this.f39082b0, h7.z5.d(-2, 30.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
            final int i18 = 2;
            this.f39082b0.setOnClickListener(new View.OnClickListener(this) {

                public final ig0 f37362b;

                {
                    this.f37362b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i18) {
                        case 0:
                            this.f37362b.p1();
                            break;
                        case 1:
                            ig0 ig0Var = this.f37362b;
                            if (ig0Var.onBackPressed(true)) {
                                ig0Var.finishFragment();
                            }
                            break;
                        case 2:
                            ig0 ig0Var2 = this.f37362b;
                            xv xvVar = ig0Var2.f39080a0;
                            if (xvVar != null) {
                                xvVar.run();
                            }
                            ig0Var2.finishFragment();
                            break;
                        default:
                            ig0 ig0Var3 = this.f37362b;
                            ig0Var3.getClass();
                            ig0Var3.presentFragment(new ProxyListActivity());
                            break;
                    }
                }
            });
        }
        ImageView imageView2 = new ImageView(context);
        this.S = imageView2;
        org.telegram.ui.Components.th0 th0Var = new org.telegram.ui.Components.th0(context);
        this.T = th0Var;
        imageView2.setImageDrawable(th0Var);
        final int i19 = 3;
        this.S.setOnClickListener(new View.OnClickListener(this) {

            public final ig0 f37362b;

            {
                this.f37362b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i19) {
                    case 0:
                        this.f37362b.p1();
                        break;
                    case 1:
                        ig0 ig0Var = this.f37362b;
                        if (ig0Var.onBackPressed(true)) {
                            ig0Var.finishFragment();
                        }
                        break;
                    case 2:
                        ig0 ig0Var2 = this.f37362b;
                        xv xvVar = ig0Var2.f39080a0;
                        if (xvVar != null) {
                            xvVar.run();
                        }
                        ig0Var2.finishFragment();
                        break;
                    default:
                        ig0 ig0Var3 = this.f37362b;
                        ig0Var3.getClass();
                        ig0Var3.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        this.S.setAlpha(0.0f);
        this.S.setVisibility(8);
        this.O.addView(this.S, h7.z5.d(32, 32.0f, 53, 16.0f, 16.0f, 16.0f, 16.0f));
        z1(false, true);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.R = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(20.0f));
        this.R.setAlpha(0.0f);
        this.R.setScaleX(0.1f);
        this.R.setScaleY(0.1f);
        this.O.addView(this.R, h7.z5.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
        org.telegram.ui.Components.l21 l21Var = new org.telegram.ui.Components.l21(context);
        this.I = l21Var;
        l21Var.setTransformType(0);
        this.I.setProgress(1.0f);
        this.I.setDrawBackground(false);
        this.J.setContentDescription(LocaleController.getString(R.string.Done));
        this.J.addView(this.I, h7.z5.e(56, 56, 17));
        this.J.a(this.I);
        if (bundleJ1 != null) {
            this.f39088f = true;
        }
        for (int i20 = 0; i20 < ev0VarArr.length; i20++) {
            org.telegram.ui.Components.ev0 ev0Var2 = ev0VarArr[i20];
            if (bundleJ1 != null && (i20 < 1 || i20 > 4 || i20 == this.f39079a)) {
                ev0Var2.k(bundleJ1);
            }
            if (this.f39079a == i20) {
                this.Q.setVisibility((ev0Var2.b() || this.f39102x || this.B == 2) ? 0 : 8);
                ev0Var2.setVisibility(0);
                ev0Var2.j();
                t1(ev0Var2.a(), false);
                this.F = 0;
                if (i20 != 0 && i20 != 5 && i20 != 6) {
                    if (i20 != 9) {
                        if (i20 != 10 && i20 != 12) {
                            z10 = false;
                        }
                        v1(z10, false);
                        if (i20 == 1 && i20 != 2) {
                            if (i20 == 3 || i20 == 4) {
                            }
                        }
                        this.F = 1;
                    }
                    z10 = true;
                    v1(z10, false);
                    if (i20 == 1) {
                        this.F = 1;
                    } else {
                        this.F = 1;
                    }
                }
                z10 = true;
                v1(z10, false);
                if (i20 == 1) {
                    this.F = 1;
                } else {
                    this.F = 1;
                }
            } else if (ev0Var2.getVisibility() != 8) {
                ev0Var2.setVisibility(8);
                ev0Var2.g();
            }
        }
        this.f39088f = false;
        y1();
        if (i1()) {
            g1(this.D, this.E, false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didUpdateConnectionState) {
            z1(true, false);
        } else if (i10 == NotificationCenter.newSuggestionsAvailable && this.f39085d0 && !getMessagesController().hasSetupEmailSuggestion()) {
            finishFragment();
        }
    }

    public final void e1() {
        String str;
        Context context = ApplicationLoader.applicationContext;
        StringBuilder sb2 = new StringBuilder("logininfo2");
        if (this.f39102x) {
            str = "_" + this.currentAccount;
        } else {
            str = "";
        }
        sb2.append(str);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(sb2.toString(), 0).edit();
        editorEdit.clear();
        editorEdit.commit();
    }

    public final void g1(final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, boolean z10) {
        if (auth_sentcode instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
            TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) auth_sentcode;
            bundle.putString("product", tL_auth_sentCodePaymentRequired.store_product);
            bundle.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
            bundle.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
            bundle.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
            bundle.putString("currency", tL_auth_sentCodePaymentRequired.currency);
            bundle.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
            bundle.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
            u1(18, true, bundle, true);
            return;
        }
        TLRPC.auth_SentCodeType auth_sentcodetype = auth_sentcode.type;
        if ((auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms) && !auth_sentcodetype.verifiedFirebase && !this.f39094k0) {
            if (!PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                FileLog.d("{GOOGLE_PLAY_SERVICES_NOT_AVAILABLE} Resend firebase sms because firebase is not available");
                s1(bundle, auth_sentcode, "GOOGLE_PLAY_SERVICES_NOT_AVAILABLE");
                return;
            }
            TLRPC.TL_auth_sentCodeTypeFirebaseSms tL_auth_sentCodeTypeFirebaseSms = (TLRPC.TL_auth_sentCodeTypeFirebaseSms) auth_sentcode.type;
            n1(0, true);
            this.f39094k0 = true;
            String string = bundle.getString("phoneFormated");
            if (tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce != null) {
                IntegrityManager integrityManagerCreate = IntegrityManagerFactory.create(getParentActivity());
                String str = new String(Base64.encode(tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce, 8));
                FileLog.d("getting classic integrity with nonce = ".concat(str));
                Task<IntegrityTokenResponse> taskAddOnSuccessListener = integrityManagerCreate.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).setCloudProjectNumber(tL_auth_sentCodeTypeFirebaseSms.play_integrity_project_id).build()).addOnSuccessListener(new wc0(this, bundle, auth_sentcode, string, z10));
                final int i10 = 0;
                taskAddOnSuccessListener.addOnFailureListener(new OnFailureListener(this) {

                    public final ig0 f44412b;

                    {
                        this.f44412b = this;
                    }

                    @Override
                    public final void onFailure(Exception exc) {
                        switch (i10) {
                            case 0:
                                String str2 = "PLAYINTEGRITY_EXCEPTION_" + ig0.f1(exc);
                                FileLog.e("{" + str2 + "} Resend firebase sms because integrity threw error", exc);
                                this.f44412b.s1(bundle, auth_sentcode, str2);
                                break;
                            default:
                                FileLog.e(exc);
                                String str3 = "SAFETYNET_EXCEPTION_" + ig0.f1(exc);
                                FileLog.d("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                this.f44412b.s1(bundle, auth_sentcode, str3);
                                break;
                        }
                    }
                });
                return;
            }
            com.google.android.gms.internal.clearcut.v0 v0Var = new com.google.android.gms.internal.clearcut.v0(ApplicationLoader.applicationContext, x7.c.f49373a, null, new com.google.android.gms.common.api.internal.a());
            byte[] bArr = auth_sentcode.type.nonce;
            String str2 = BuildVars.SAFETYNET_KEY;
            com.google.android.gms.common.api.internal.t0 t0Var = v0Var.h;
            j8.i0 i0Var = new j8.i0(t0Var, bArr, str2);
            t0Var.f3353b.d(0, i0Var);
            Task taskAddOnSuccessListener2 = y5.l.n(i0Var, new y5.m(new x7.d())).addOnSuccessListener(new wc0(this, string, auth_sentcode, bundle, z10));
            final int i11 = 1;
            taskAddOnSuccessListener2.addOnFailureListener(new OnFailureListener(this) {

                public final ig0 f44412b;

                {
                    this.f44412b = this;
                }

                @Override
                public final void onFailure(Exception exc) {
                    switch (i11) {
                        case 0:
                            String str3 = "PLAYINTEGRITY_EXCEPTION_" + ig0.f1(exc);
                            FileLog.e("{" + str3 + "} Resend firebase sms because integrity threw error", exc);
                            this.f44412b.s1(bundle, auth_sentcode, str3);
                            break;
                        default:
                            FileLog.e(exc);
                            String str4 = "SAFETYNET_EXCEPTION_" + ig0.f1(exc);
                            FileLog.d("{" + str4 + "} Resend firebase sms because of safetynet exception");
                            this.f44412b.s1(bundle, auth_sentcode, str4);
                            break;
                    }
                }
            });
            return;
        }
        bundle.putString("phoneHash", auth_sentcode.phone_code_hash);
        TLRPC.auth_CodeType auth_codetype = auth_sentcode.next_type;
        if (auth_codetype instanceof TLRPC.TL_auth_codeTypeCall) {
            bundle.putInt("nextType", 4);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeFlashCall) {
            bundle.putInt("nextType", 3);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeSms) {
            bundle.putInt("nextType", 2);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeMissedCall) {
            bundle.putInt("nextType", 11);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeFragmentSms) {
            bundle.putInt("nextType", 15);
        }
        if (auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeApp) {
            bundle.putInt("type", 1);
            bundle.putInt("length", auth_sentcode.type.length);
            u1(1, z10, bundle, false);
            return;
        }
        if (auth_sentcode.timeout == 0) {
            auth_sentcode.timeout = BuildVars.DEBUG_PRIVATE_VERSION ? 5 : 60;
        }
        bundle.putInt("timeout", auth_sentcode.timeout * 1000);
        TLRPC.auth_SentCodeType auth_sentcodetype2 = auth_sentcode.type;
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt("type", 4);
            bundle.putInt("length", auth_sentcode.type.length);
            u1(4, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", auth_sentcode.type.pattern);
            u1(3, z10, bundle, false);
            return;
        }
        if ((auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSms) || (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            bundle.putInt("type", 2);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putBoolean("firebase", auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms);
            u1(2, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFragmentSms) {
            bundle.putInt("type", 15);
            bundle.putString("url", auth_sentcode.type.url);
            bundle.putInt("length", auth_sentcode.type.length);
            u1(15, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeMissedCall) {
            bundle.putInt("type", 11);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putString("prefix", auth_sentcode.type.prefix);
            u1(11, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSetUpEmailRequired) {
            bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
            u1(12, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
            bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
            bundle.putString("emailPattern", auth_sentcode.type.email_pattern);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putInt("nextPhoneLoginDate", auth_sentcode.type.next_phone_login_date);
            bundle.putInt("resetAvailablePeriod", auth_sentcode.type.reset_available_period);
            bundle.putInt("resetPendingDate", auth_sentcode.type.reset_pending_date);
            u1(14, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
            String str3 = auth_sentcodetype2.beginning;
            if (str3 != null) {
                bundle.putString("beginning", str3);
            }
            u1(16, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
            String str4 = auth_sentcodetype2.beginning;
            if (str4 != null) {
                bundle.putString("beginning", str4);
            }
            u1(17, z10, bundle, false);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return h7.c6.a(new e(this, 22), org.telegram.ui.ActionBar.g6.G6, org.telegram.ui.ActionBar.g6.D6, org.telegram.ui.ActionBar.g6.H6, org.telegram.ui.ActionBar.g6.f23144i6, org.telegram.ui.ActionBar.g6.P9, org.telegram.ui.ActionBar.g6.O9, org.telegram.ui.ActionBar.g6.f23181k6, org.telegram.ui.ActionBar.g6.f23198l6, org.telegram.ui.ActionBar.g6.I6, org.telegram.ui.ActionBar.g6.f23284q7, org.telegram.ui.ActionBar.g6.f23423y6, org.telegram.ui.ActionBar.g6.f23145i7, org.telegram.ui.ActionBar.g6.q6, org.telegram.ui.ActionBar.g6.Wh, org.telegram.ui.ActionBar.g6.Q9, org.telegram.ui.ActionBar.g6.f23269p7, org.telegram.ui.ActionBar.g6.J6, org.telegram.ui.ActionBar.g6.Y6, org.telegram.ui.ActionBar.g6.W6, org.telegram.ui.ActionBar.g6.X6, org.telegram.ui.ActionBar.g6.f23124h5, org.telegram.ui.ActionBar.g6.f23283q5, org.telegram.ui.ActionBar.g6.f23161j5);
    }

    public final boolean h1() {
        return this.f39081b[this.f39079a].a() && !AndroidUtilities.isAccessibilityTouchExplorationEnabled();
    }

    public final boolean i1() {
        return this.B == 1;
    }

    @Override
    public final boolean isLightStatusBar() {
        return i0.b.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, true)) > 0.699999988079071d;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.f39085d0;
    }

    public final void k1(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.b2 b2Var;
        if (this.L != 0) {
            if (z10) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.L, true);
            }
            this.L = 0;
        }
        if (i1() && (b2Var = this.N) != null) {
            b2Var.dismiss();
            this.N = null;
        }
        w1(false, z11, false);
    }

    public final void l1(String str, String str2) {
        if (str2 == null || getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = str;
        b2Var.P = str2;
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        showDialog(alertDialog$Builder.f22702a);
    }

    public final void n1(int i10, boolean z10) {
        if (!i1() || i10 != 0) {
            this.L = i10;
            w1(true, z10, false);
        } else {
            if (this.N != null || getParentActivity() == null || getParentActivity().isFinishing()) {
                return;
            }
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
            this.N = b2Var;
            b2Var.f22747c0 = false;
            b2Var.show();
        }
    }

    public final void o1(TLRPC.TL_auth_authorization tL_auth_authorization, boolean z10) {
        MessagesController.getInstance(this.currentAccount).cleanup();
        ConnectionsManager.getInstance(this.currentAccount).setUserId(tL_auth_authorization.user.f22527id);
        UserConfig.getInstance(this.currentAccount).clearConfig();
        MessagesController.getInstance(this.currentAccount).cleanup();
        UserConfig.getInstance(this.currentAccount).syncContacts = this.f39103y;
        UserConfig.getInstance(this.currentAccount).setCurrentUser(tL_auth_authorization.user);
        UserConfig.getInstance(this.currentAccount).saveConfig(true);
        MessagesStorage.getInstance(this.currentAccount).cleanup(true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_auth_authorization.user);
        MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(arrayList, null, true, true);
        MessagesController.getInstance(this.currentAccount).putUser(tL_auth_authorization.user, false);
        ContactsController.getInstance(this.currentAccount).checkAppAccount();
        MessagesController.getInstance(this.currentAccount).checkPromoInfo(true);
        ConnectionsManager.getInstance(this.currentAccount).updateDcSettings();
        MessagesController.getInstance(this.currentAccount).loadAppConfig();
        MessagesController.getInstance(this.currentAccount).lambda$removeWebBrowserException$514();
        MessagesController.getInstance(this.currentAccount).checkPeerColors(false);
        if (tL_auth_authorization.future_auth_token != null) {
            AuthTokensHelper.saveLogInToken(tL_auth_authorization);
        } else {
            FileLog.d("onAuthSuccess future_auth_token is empty");
        }
        if (z10) {
            MessagesController.getInstance(this.currentAccount).putDialogsEndReachedAfterRegistration();
        }
        MediaDataController.getInstance(this.currentAccount).loadStickersByEmojiOrName("tg_placeholders_android", false, true);
        boolean z11 = tL_auth_authorization.setup_password_required;
        int i10 = tL_auth_authorization.otherwise_relogin_days;
        if (getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(getParentActivity(), false);
        }
        e1();
        if (!(getParentActivity() instanceof LaunchActivity)) {
            if (getParentActivity() instanceof ExternalActionActivity) {
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) getParentActivity();
                externalActionActivity.d(externalActionActivity.h, externalActionActivity.f35475n, externalActionActivity.v, true, externalActionActivity.f35476r, externalActionActivity.f35477s);
                externalActionActivity.f35472c.X();
                ActionBarLayout actionBarLayout = externalActionActivity.d;
                if (actionBarLayout != null) {
                    actionBarLayout.X();
                }
                org.telegram.ui.Components.zu0 zu0Var = externalActionActivity.f35473e;
                if (zu0Var != null) {
                    zu0Var.setVisibility(0);
                    return;
                }
                return;
            }
            return;
        }
        if (this.f39102x) {
            this.f39102x = false;
            this.f39093j0 = true;
            ((LaunchActivity) getParentActivity()).L0(this.currentAccount, new h3.t(3, z10));
            this.f39093j0 = false;
            finishFragment();
            return;
        }
        if (z10 && z11) {
            zf1 zf1Var = new zf1(6, null);
            zf1Var.C = i10;
            zf1Var.D = true;
            presentFragment(zf1Var, true);
        } else {
            Bundle bundleH = a9.p.h("afterSignup", z10);
            qg0 qg0Var = new qg0();
            qg0Var.l0(bundleH);
            presentFragment(qg0Var, true);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
        a31.V(true);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        te0 te0Var = (te0) this.f39081b[5];
        if (te0Var != null) {
            te0Var.H.i(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f39085d0 || this.f39079a != 12) {
            int i10 = this.f39079a;
            org.telegram.ui.Components.ev0[] ev0VarArr = this.f39081b;
            if (i10 == 0 || (this.B == 3 && i10 == 12)) {
                if (z10) {
                    for (org.telegram.ui.Components.ev0 ev0Var : ev0VarArr) {
                        if (ev0Var != null) {
                            ev0Var.f();
                        }
                    }
                    e1();
                }
                return true;
            }
            if (i10 == 6) {
                if (z10) {
                    ev0VarArr[i10].c(true);
                    u1(0, true, null, true);
                    return false;
                }
            } else if (i10 == 7 || i10 == 8) {
                if (z10) {
                    ev0VarArr[i10].c(true);
                    u1(6, true, null, true);
                }
            } else if ((i10 >= 1 && i10 <= 4) || i10 == 11 || i10 == 15) {
                if (z10 && ev0VarArr[i10].c(false)) {
                    u1(0, true, null, true);
                    return false;
                }
            } else if (i10 == 5) {
                if (z10) {
                    ((te0) ev0VarArr[i10]).f42923w.callOnClick();
                    return false;
                }
            } else if (i10 == 9) {
                if (z10) {
                    ev0VarArr[i10].c(true);
                    u1(7, true, null, true);
                    return false;
                }
            } else if (i10 == 10) {
                if (z10) {
                    ev0VarArr[i10].c(true);
                    u1(9, true, null, true);
                    return false;
                }
            } else if (i10 == 13) {
                if (z10) {
                    ev0VarArr[i10].c(true);
                    u1(12, true, null, true);
                    return false;
                }
            } else if (z10 && ev0VarArr[i10].c(true)) {
                u1(0, true, null, true);
                return false;
            }
        }
        return false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        t1(this.f39081b[this.f39079a].a(), false);
        wf0 wf0Var = this.X;
        if (wf0Var != null) {
            int i10 = wf0.A;
            wf0Var.a();
        }
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                if (dialog == this.h) {
                    ArrayList arrayList = this.f39099r;
                    if (!arrayList.isEmpty() && getParentActivity() != null) {
                        getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
                        return;
                    }
                }
                if (dialog == this.f39096n) {
                    ArrayList arrayList2 = this.f39100s;
                    if (arrayList2.isEmpty() || getParentActivity() == null) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(new vc0(this, 1), 200L);
                    getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.didUpdateConnectionState);
        getNotificationCenter().addObserver(this, NotificationCenter.newSuggestionsAvailable);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.ev0[] ev0VarArr = this.f39081b;
            if (i10 >= ev0VarArr.length) {
                break;
            }
            org.telegram.ui.Components.ev0 ev0Var = ev0VarArr[i10];
            if (ev0Var != null) {
                ev0Var.f();
            }
            i10++;
        }
        org.telegram.ui.ActionBar.b2 b2Var = this.N;
        if (b2Var != null) {
            b2Var.dismiss();
            this.N = null;
        }
        for (Runnable runnable : this.f39089f0) {
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.didUpdateConnectionState);
        getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.f39102x) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(true, false);
        }
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (strArr.length == 0 || iArr.length == 0) {
            return;
        }
        boolean z10 = iArr[0] == 0;
        org.telegram.ui.Components.ev0[] ev0VarArr = this.f39081b;
        if (i10 == 6) {
            this.v = false;
            int i11 = this.f39079a;
            if (i11 == 0) {
                org.telegram.ui.Components.ev0 ev0Var = ev0VarArr[i11];
                ((hg0) ev0Var).H = true;
                ev0Var.h(null);
                return;
            }
            return;
        }
        if (i10 == 7) {
            this.f39101w = false;
            int i12 = this.f39079a;
            if (i12 == 0) {
                ((hg0) ev0VarArr[i12]).q();
                return;
            }
            return;
        }
        if (i10 == 20) {
            if (z10) {
                ((te0) ev0VarArr[5]).H.m();
            }
        } else if (i10 == 151 && z10) {
            te0 te0Var = (te0) ev0VarArr[5];
            te0Var.post(new fd0(te0Var, 0));
        }
    }

    @Override
    public final void onResume() {
        org.telegram.ui.Components.ev0 ev0Var;
        int i10;
        org.telegram.ui.Components.ev0[] ev0VarArr = this.f39081b;
        super.onResume();
        if (this.f39102x) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        View view = this.fragmentView;
        if (view != null) {
            view.requestLayout();
        }
        try {
            int i11 = this.f39079a;
            if (i11 >= 1 && i11 <= 4) {
                org.telegram.ui.Components.ev0 ev0Var2 = ev0VarArr[i11];
                if ((ev0Var2 instanceof mf0) && (i10 = ((mf0) ev0Var2).P) != 0 && Math.abs((System.currentTimeMillis() / 1000) - ((long) i10)) >= 86400) {
                    ev0VarArr[this.f39079a].c(true);
                    u1(0, false, null, true);
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        int i12 = this.f39079a;
        if (i12 == 0 && !this.Y && (ev0Var = ev0VarArr[i12]) != null) {
            ev0Var.j();
        }
        if (h1()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
        int i13 = this.f39079a;
        if (i13 < 0 || i13 >= ev0VarArr.length) {
            return;
        }
        ev0VarArr[i13].i();
    }

    public final void p1() {
        if (this.M[this.F]) {
            if (this.R.getTag() == null) {
                this.f39081b[this.f39079a].h(null);
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f22702a.N = LocaleController.getString("StopLoadingTitle", R.string.StopLoadingTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString("StopLoading", R.string.StopLoading);
            alertDialog$Builder.k(LocaleController.getString("WaitMore", R.string.WaitMore), null);
            alertDialog$Builder.h(LocaleController.getString("Stop", R.string.Stop), new ad0(this, 0));
            showDialog(alertDialog$Builder.f22702a);
        }
    }

    public final void q1(String str, TLRPC.auth_SentCode auth_sentcode) {
        this.f39086e = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + str);
        bundle.putString("ephone", "+" + str);
        bundle.putString("phoneFormated", str);
        g1(bundle, auth_sentcode, true);
    }

    public final void s1(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str) {
        if (this.f39094k0) {
            k1(false, true);
            this.f39094k0 = false;
            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
            tL_auth_resendCode.phone_number = bundle.getString("phoneFormated");
            tL_auth_resendCode.phone_code_hash = auth_sentcode.phone_code_hash;
            if (str != null) {
                tL_auth_resendCode.flags |= 1;
                tL_auth_resendCode.reason = str;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_resendCode, new v80(5, this, bundle), 10);
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("currentViewNum", this.f39079a);
            bundle2.putInt("syncContacts", this.f39103y ? 1 : 0);
            for (int i10 = 0; i10 <= this.f39079a; i10++) {
                org.telegram.ui.Components.ev0 ev0Var = this.f39081b[i10];
                if (ev0Var != null) {
                    ev0Var.l(bundle2);
                }
            }
            Context context = ApplicationLoader.applicationContext;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("logininfo2");
            sb2.append(this.f39102x ? "_" + this.currentAccount : "");
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(sb2.toString(), 0).edit();
            editorEdit.clear();
            r1(bundle2, editorEdit, null);
            editorEdit.commit();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final void t1(boolean z10, boolean z11) {
        if (this.W == z10 && z11) {
            return;
        }
        this.W = z10;
        int i10 = 0;
        if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
            z10 = false;
        }
        if (z10) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
            if (!z11) {
                this.f39083c.setVisibility(0);
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.d = duration;
            duration.setInterpolator(org.telegram.ui.Components.er.f28122f);
            this.d.addUpdateListener(new uc0(this, i10));
            this.d.addListener(new gd0(this, i10));
            this.d.start();
            return;
        }
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        if (!z11) {
            this.f39083c.setVisibility(8);
            return;
        }
        ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
        this.d = duration2;
        duration2.setInterpolator(org.telegram.ui.Components.ws.f34319e);
        int i11 = 1;
        this.d.addUpdateListener(new uc0(this, i11));
        this.d.addListener(new gd0(this, i11));
        this.d.start();
    }

    public final void u1(int i10, boolean z10, Bundle bundle, boolean z11) {
        int i11 = 9;
        boolean z12 = i10 == 0 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 10 || i10 == 12 || i10 == 17 || i10 == 16;
        if (i10 == this.f39079a) {
            z10 = false;
        }
        if (z12) {
            if (i10 == 0) {
                this.v = true;
                this.f39101w = true;
            }
            this.F = 1;
            v1(false, z10);
            w1(false, z10, false);
            this.F = 0;
            w1(false, z10, false);
            if (!z10) {
                v1(true, false);
            }
        } else {
            this.F = 0;
            v1(false, z10);
            w1(false, z10, false);
            if (i10 != 8) {
                this.F = 1;
            }
        }
        org.telegram.ui.Components.ev0[] ev0VarArr = this.f39081b;
        if (!z10) {
            this.Q.setVisibility((ev0VarArr[i10].b() || this.f39102x) ? 0 : 8);
            ev0VarArr[this.f39079a].setVisibility(8);
            ev0VarArr[this.f39079a].g();
            this.f39079a = i10;
            ev0VarArr[i10].m(bundle, false);
            ev0VarArr[i10].setVisibility(0);
            setParentActivityTitle(ev0VarArr[i10].getHeaderName());
            ev0VarArr[i10].j();
            t1(ev0VarArr[i10].a(), false);
            return;
        }
        org.telegram.ui.Components.ev0 ev0Var = ev0VarArr[this.f39079a];
        org.telegram.ui.Components.ev0 ev0Var2 = ev0VarArr[i10];
        this.f39079a = i10;
        this.Q.setVisibility((ev0Var2.b() || this.f39102x) ? 0 : 8);
        ev0Var2.m(bundle, false);
        setParentActivityTitle(ev0Var2.getHeaderName());
        ev0Var2.j();
        int i12 = AndroidUtilities.displaySize.x;
        if (z11) {
            i12 = -i12;
        }
        ev0Var2.setX(i12);
        ev0Var2.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new androidx.fragment.app.g(this, z12, ev0Var, i11));
        Property property = View.TRANSLATION_X;
        animatorSet.playTogether(ObjectAnimator.ofFloat(ev0Var, (Property<org.telegram.ui.Components.ev0, Float>) property, z11 ? AndroidUtilities.displaySize.x : -AndroidUtilities.displaySize.x), ObjectAnimator.ofFloat(ev0Var2, (Property<org.telegram.ui.Components.ev0, Float>) property, 0.0f));
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.start();
        t1(ev0Var2.a(), true);
    }

    public final void v1(boolean z10, boolean z11) {
        TimeInterpolator timeInterpolator;
        int i10 = this.F;
        boolean z12 = i10 == 0;
        boolean[] zArr = this.M;
        if (zArr[i10] == z10) {
            return;
        }
        AnimatorSet[] animatorSetArr = this.G;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet != null) {
            if (z11) {
                animatorSet.removeAllListeners();
            }
            animatorSetArr[this.F].cancel();
        }
        int i11 = this.F;
        zArr[i11] = z10;
        if (!z11) {
            if (z12) {
                this.J.e(z10, z11);
                return;
            }
            return;
        }
        animatorSetArr[i11] = new AnimatorSet();
        if (z12) {
            this.J.e(z10, z11);
        }
        animatorSetArr[this.F].addListener(new org.telegram.ui.ActionBar.g(this, z12, z10, 5));
        int i12 = 150;
        if (!z12) {
            timeInterpolator = null;
        } else if (z10) {
            timeInterpolator = AndroidUtilities.decelerateInterpolator;
            i12 = 200;
        } else {
            timeInterpolator = AndroidUtilities.accelerateInterpolator;
        }
        animatorSetArr[this.F].setDuration(i12);
        animatorSetArr[this.F].setInterpolator(timeInterpolator);
        animatorSetArr[this.F].start();
    }

    public final void w1(final boolean z10, final boolean z11, boolean z12) {
        boolean[] zArr = this.f39087e0;
        if (z11 && zArr[this.F] == z10 && !z12) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.hz(this, z10, z11, z12, 1));
            return;
        }
        final int i10 = this.F;
        boolean z13 = i10 == 0;
        boolean[] zArr2 = this.f39090g0;
        if (z12 || z13) {
            zArr2[i10] = false;
            zArr[i10] = z10;
        } else {
            zArr[i10] = z10;
            if (z11) {
                boolean z14 = zArr2[i10];
                Runnable[] runnableArr = this.f39089f0;
                if (z14) {
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[i10]);
                    zArr2[this.F] = false;
                    return;
                } else if (z10) {
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            ig0 ig0Var = this.f44768a;
                            int i11 = ig0Var.F;
                            ig0Var.F = i10;
                            ig0Var.w1(z10, z11, true);
                            ig0Var.F = i11;
                        }
                    };
                    runnableArr[i10] = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 2000L);
                    zArr2[this.F] = true;
                    return;
                }
            }
        }
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z13) {
            this.J.f(z10, z11);
            return;
        }
        if (z11) {
            this.H = new AnimatorSet();
            int i11 = 2;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            valueAnimatorOfFloat.addListener(new n40(i11, this, z10));
            valueAnimatorOfFloat.addUpdateListener(new uc0(this, i11));
            this.H.playTogether(valueAnimatorOfFloat);
            this.H.setDuration(150L);
            this.H.start();
            return;
        }
        if (z10) {
            this.R.setVisibility(0);
            this.R.setScaleX(1.0f);
            this.R.setScaleY(1.0f);
            this.R.setAlpha(1.0f);
            return;
        }
        this.R.setTag(null);
        this.R.setVisibility(4);
        this.R.setScaleX(0.1f);
        this.R.setScaleY(0.1f);
        this.R.setAlpha(0.0f);
    }

    public final void x1(boolean z10, boolean z11) {
        if (z10 == this.f39097n0) {
            return;
        }
        vc0 vc0Var = this.f39098o0;
        if (vc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(vc0Var);
            this.f39098o0 = null;
        }
        this.f39097n0 = z10;
        this.S.clearAnimation();
        if (z11) {
            this.S.setVisibility(0);
            this.S.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new org.telegram.ui.Components.f50(11, this, z10)).start();
        } else {
            this.S.setVisibility(z10 ? 0 : 8);
            this.S.setAlpha(z10 ? 1.0f : 0.0f);
        }
    }

    public final void y1() {
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        ImageView imageView = this.Q;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        imageView.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        ImageView imageView2 = this.Q;
        int i11 = org.telegram.ui.ActionBar.g6.f23144i6;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i11, false), 1, -1));
        this.T.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.S.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i11, false), 1, -1));
        RadialProgressView radialProgressView = this.R;
        int i12 = org.telegram.ui.ActionBar.g6.P9;
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.J.g();
        this.I.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.O9, false));
        this.I.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        for (org.telegram.ui.Components.ev0 ev0Var : this.f39081b) {
            ev0Var.n();
        }
        org.telegram.ui.Components.ir irVar = this.f39083c;
        irVar.f29469a.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        int i13 = 0;
        while (true) {
            View[] viewArr = irVar.f29471c;
            if (i13 >= viewArr.length) {
                break;
            }
            View view = viewArr[i13];
            if (view != null) {
                view.setBackground(org.telegram.ui.Components.ir.a(i13));
                if (view instanceof org.telegram.ui.Components.hr) {
                    org.telegram.ui.Components.hr hrVar = (org.telegram.ui.Components.hr) view;
                    hrVar.f29088a.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
                    hrVar.f29089b.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
                }
            }
            i13++;
        }
        wf0 wf0Var = this.X;
        if (wf0Var != null) {
            int i14 = wf0.A;
            wf0Var.b();
        }
    }

    public final void z1(boolean z10, boolean z11) {
        if (this.T == null) {
            return;
        }
        int connectionState = getConnectionsManager().getConnectionState();
        if (this.m0 != connectionState || z11) {
            this.m0 = connectionState;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            boolean z12 = sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(sharedPreferences.getString("proxy_ip", ""));
            int i10 = this.m0;
            boolean z13 = i10 == 3 || i10 == 5;
            boolean z14 = i10 == 1 || i10 == 2 || i10 == 4;
            if (z12) {
                this.T.b(true, z13, z10);
                x1(true, z10);
                return;
            }
            if ((!getMessagesController().blockedCountry || SharedConfig.proxyList.isEmpty()) && !z14) {
                x1(false, z10);
                return;
            }
            this.T.b(true, z13, z10);
            if (this.f39097n0) {
                return;
            }
            vc0 vc0Var = this.f39098o0;
            if (vc0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(vc0Var);
            }
            this.f39097n0 = true;
            vc0 vc0Var2 = new vc0(this, 0);
            this.f39098o0 = vc0Var2;
            AndroidUtilities.runOnUIThread(vc0Var2, 5000L);
        }
    }

    public ig0(int i10) {
        super(null);
        this.f39081b = new org.telegram.ui.Components.ev0[19];
        this.f39099r = new ArrayList();
        this.f39100s = new ArrayList();
        this.v = true;
        this.f39101w = true;
        this.f39103y = true;
        this.A = false;
        this.B = 0;
        this.G = new AnimatorSet[2];
        this.M = new boolean[]{true, false};
        this.W = false;
        this.f39087e0 = new boolean[2];
        this.f39089f0 = new Runnable[2];
        this.f39090g0 = new boolean[2];
        this.currentAccount = i10;
        this.f39102x = true;
    }
}
