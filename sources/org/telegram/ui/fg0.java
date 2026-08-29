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
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
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
public final class fg0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f38150p0;
    public boolean A;
    public int B;
    public String C;
    public Bundle D;
    public TLRPC.TL_auth_sentCode E;
    public int F;
    public final AnimatorSet[] G;
    public AnimatorSet H;
    public org.telegram.ui.Components.u21 I;
    public org.telegram.ui.Components.u10 J;
    public oc.i K;
    public int L;
    public final boolean[] M;
    public org.telegram.ui.ActionBar.c2 N;
    public ih.j4 O;
    public uf0 P;
    public ImageView Q;
    public RadialProgressView R;
    public ImageView S;
    public org.telegram.ui.Components.bi0 T;
    public LinearLayout U;
    public n0 V;
    public boolean W;
    public tf0 X;
    public boolean Y;
    public Runnable Z;
    public int f38151a;
    public vv f38152a0;
    public final org.telegram.ui.Components.mv0[] f38153b;
    public TextView f38154b0;
    public org.telegram.ui.Components.or f38155c;
    public boolean f38156c0;
    public ValueAnimator d;
    public boolean f38157d0;
    public boolean f38158e;
    public final boolean[] f38159e0;
    public boolean f38160f;
    public final Runnable[] f38161f0;
    public final boolean[] f38162g0;
    public Dialog h;
    public boolean f38163h0;
    public View f38164i0;
    public boolean f38165j0;
    public boolean f38166k0;
    public TLRPC.TL_help_termsOfService f38167l0;
    public int m0;
    public Dialog f38168n;
    public boolean f38169n0;
    public tc0 f38170o0;
    public final ArrayList f38171r;
    public final ArrayList f38172s;
    public boolean v;
    public boolean f38173w;
    public boolean f38174x;
    public boolean f38175y;

    static {
        int i10;
        if (SharedConfig.getDevicePerformanceClass() <= 1) {
            i10 = 150;
        } else {
            i10 = 100;
        }
        f38150p0 = i10;
    }

    public fg0() {
        super(null);
        this.f38153b = new org.telegram.ui.Components.mv0[19];
        this.f38171r = new ArrayList();
        this.f38172s = new ArrayList();
        this.v = true;
        this.f38173w = true;
        this.f38175y = true;
        this.A = false;
        this.B = 0;
        this.G = new AnimatorSet[2];
        this.M = new boolean[]{true, false};
        this.W = false;
        this.f38159e0 = new boolean[2];
        this.f38161f0 = new Runnable[2];
        this.f38162g0 = new boolean[2];
    }

    public static boolean T0(fg0 fg0Var, View view) {
        if (!fg0Var.h1()) {
            return AndroidUtilities.showKeyboard(view);
        }
        return true;
    }

    public static void U(fg0 fg0Var, TLRPC.TL_error tL_error, String str, String str2, String str3) {
        fg0Var.k1(false, true);
        if (tL_error == null) {
            if (str != null && str2 != null && str3 != null) {
                Bundle bundle = new Bundle();
                bundle.putString("phoneFormated", str);
                bundle.putString("phoneHash", str2);
                bundle.putString("code", str3);
                fg0Var.u1(5, true, bundle, false);
                return;
            }
            fg0Var.u1(0, true, null, true);
        } else if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
            fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
        } else if (tL_error.text.startsWith("2FA_CONFIRM_WAIT_")) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("phoneFormated", str);
            bundle2.putString("phoneHash", str2);
            bundle2.putString("code", str3);
            bundle2.putInt("startTime", ConnectionsManager.getInstance(fg0Var.currentAccount).getCurrentTime());
            bundle2.putInt("waitTime", Utilities.parseInt((CharSequence) tL_error.text.replace("2FA_CONFIRM_WAIT_", "")).intValue());
            fg0Var.u1(8, true, bundle2, false);
        } else {
            fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
        }
    }

    public static void U0(fg0 fg0Var, View view, boolean z10) {
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(view, 3.5f);
        if (z10 && (view instanceof org.telegram.ui.Components.uc0)) {
            Runnable runnable = (Runnable) view.getTag(R.id.timeout_callback);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
            org.telegram.ui.Components.uc0 uc0Var = (org.telegram.ui.Components.uc0) view;
            AtomicReference atomicReference = new AtomicReference();
            EditText attachedEditText = uc0Var.getAttachedEditText();
            ag.c0 c0Var = new ag.c0(9, attachedEditText, atomicReference);
            uc0Var.a(1.0f);
            n20 n20Var = new n20(uc0Var, view, attachedEditText, c0Var, 10);
            atomicReference.set(n20Var);
            view.postDelayed(n20Var, 2000L);
            view.setTag(R.id.timeout_callback, n20Var);
            if (attachedEditText != null) {
                attachedEditText.addTextChangedListener(c0Var);
            }
        }
    }

    public static void V(fg0 fg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10, y7.d dVar) {
        String str2;
        y7.e eVar = ((n7.d) ((com.google.android.gms.common.api.q) dVar.f306a)).f17160b;
        if (eVar == null) {
            str2 = null;
        } else {
            str2 = eVar.f50504a;
        }
        if (str2 != null) {
            TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
            tL_auth_requestFirebaseSms.phone_number = str;
            tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
            tL_auth_requestFirebaseSms.safety_net_token = str2;
            tL_auth_requestFirebaseSms.flags |= 1;
            String[] split = str2.split("\\.");
            if (split.length > 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(Base64.decode(split[1].getBytes(StandardCharsets.UTF_8), 0)));
                    boolean optBoolean = jSONObject.optBoolean("basicIntegrity");
                    boolean optBoolean2 = jSONObject.optBoolean("ctsProfileMatch");
                    try {
                        if (optBoolean && optBoolean2) {
                            ConnectionsManager.getInstance(fg0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new xc0(1, bundle, auth_sentcode, fg0Var, z10), 10);
                        } else if (!optBoolean && !optBoolean2) {
                            FileLog.d("{SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false and basicIntegrity = false");
                            fg0Var.s1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE");
                        } else if (!optBoolean) {
                            FileLog.d("{SAFETYNET_BASICINTEGRITY_FALSE} Resend firebase sms because basicIntegrity = false");
                            fg0Var.s1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_FALSE");
                        } else if (!optBoolean2) {
                            FileLog.d("{SAFETYNET_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false");
                            fg0Var.s1(bundle, auth_sentcode, "SAFETYNET_CTSPROFILEMATCH_FALSE");
                        }
                    } catch (JSONException e10) {
                        e = e10;
                        FileLog.e(e);
                        FileLog.d("{SAFETYNET_JSON_EXCEPTION} Resend firebase sms because of exception");
                        fg0Var.s1(bundle, auth_sentcode, "SAFETYNET_JSON_EXCEPTION");
                    }
                } catch (JSONException e11) {
                    e = e11;
                }
            } else {
                FileLog.d("{SAFETYNET_CANT_SPLIT} Resend firebase sms because can't split JWS token");
                fg0Var.s1(bundle, auth_sentcode, "SAFETYNET_CANT_SPLIT");
            }
        } else {
            FileLog.d("{SAFETYNET_NULL_JWS} Resend firebase sms because JWS = null");
            fg0Var.s1(bundle, auth_sentcode, "SAFETYNET_NULL_JWS");
        }
    }

    public static HashSet V0(fg0 fg0Var) {
        List<SubscriptionInfo> list;
        HashSet hashSet = new HashSet();
        try {
            String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                hashSet.add(line1Number);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 22) {
                SubscriptionManager from = SubscriptionManager.from(fg0Var.getParentActivity());
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
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        String number = list.get(i11).getNumber();
                        if (!TextUtils.isEmpty(number)) {
                            hashSet.add(number);
                        }
                    }
                }
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        return hashSet;
    }

    public static void W(fg0 fg0Var, String str, String str2, String str3) {
        fg0Var.n1(0, true);
        TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
        deleteaccount.reason = "Forgot password";
        ConnectionsManager.getInstance(fg0Var.currentAccount).sendRequest(deleteaccount, new ih.c1(fg0Var, str, str2, str3, 12), 10);
    }

    public static int W0(fg0 fg0Var) {
        return fg0Var.currentAccount;
    }

    public static void X(fg0 fg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            FileLog.d("Resend firebase sms because integrity token = null");
            fg0Var.s1(bundle, auth_sentcode, "PLAYINTEGRITY_TOKEN_NULL");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.play_integrity_token = str2;
        tL_auth_requestFirebaseSms.flags |= 4;
        ConnectionsManager.getInstance(fg0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new xc0(0, bundle, auth_sentcode, fg0Var, z10), 10);
    }

    public static int X0(fg0 fg0Var) {
        return fg0Var.currentAccount;
    }

    public static int Y0(fg0 fg0Var) {
        return fg0Var.currentAccount;
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
            StringBuilder n10 = com.google.android.recaptcha.internal.a.n(simpleName);
            n10.append(exc.getMessage());
            simpleName = n10.toString();
        }
        return simpleName.toUpperCase().replaceAll(" ", "_");
    }

    public static Bundle j1(int i10, boolean z10) {
        String str;
        try {
            Bundle bundle = new Bundle();
            Context context = ApplicationLoader.applicationContext;
            StringBuilder sb2 = new StringBuilder("logininfo2");
            if (z10) {
                str = "_" + i10;
            } else {
                str = "";
            }
            sb2.append(str);
            for (Map.Entry<String, ?> entry : context.getSharedPreferences(sb2.toString(), 0).getAll().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                String[] split = key.split("_\\|_");
                if (split.length == 1) {
                    if (value instanceof String) {
                        bundle.putString(key, (String) value);
                    } else if (value instanceof Integer) {
                        bundle.putInt(key, ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        bundle.putBoolean(key, ((Boolean) value).booleanValue());
                    }
                } else if (split.length == 2) {
                    Bundle bundle2 = bundle.getBundle(split[0]);
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        bundle.putBundle(split[0], bundle2);
                    }
                    if (value instanceof String) {
                        bundle2.putString(split[1], (String) value);
                    } else if (value instanceof Integer) {
                        bundle2.putInt(split[1], ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        bundle2.putBoolean(split[1], ((Boolean) value).booleanValue());
                    }
                }
            }
            return bundle;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static void m1(org.telegram.ui.ActionBar.o2 o2Var, String str, l3.g0 g0Var, boolean z10) {
        List list;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity());
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            if (z10) {
                c2Var.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                c2Var.P = LocaleController.getString("BannedPhoneNumber", R.string.BannedPhoneNumber);
            } else if (g0Var != null && (list = (List) g0Var.f14097c) != null && !list.isEmpty() && ((lt) g0Var.f14096b) != null) {
                int i10 = Integer.MAX_VALUE;
                for (String str2 : (List) g0Var.f14097c) {
                    int length = str2.replace(" ", "").length();
                    if (length < i10) {
                        i10 = length;
                    }
                }
                if (qe.b.d(str, false).length() - ((lt) g0Var.f14096b).f40274c.length() < i10) {
                    c2Var.N = LocaleController.getString(R.string.WrongNumberFormat);
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("ShortNumberInfo", R.string.ShortNumberInfo, ((lt) g0Var.f14096b).f40272a, (String) g0Var.d));
                } else {
                    c2Var.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    c2Var.P = LocaleController.getString(R.string.InvalidPhoneNumber);
                }
            } else {
                c2Var.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                c2Var.P = LocaleController.getString(R.string.InvalidPhoneNumber);
            }
            alertDialog$Builder.i(LocaleController.getString("BotHelp", R.string.BotHelp), new com.google.firebase.messaging.i(str, o2Var, z10));
            alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
            o2Var.showDialog(c2Var);
        }
    }

    public static void n0(fg0 fg0Var, String str, String str2, String str3) {
        if (fg0Var.R.getTag() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
        alertDialog$Builder.f22714a.P = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
        alertDialog$Builder.f22714a.N = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
        alertDialog$Builder.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new a1.d(fg0Var, str, str2, str3, 14));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        fg0Var.showDialog(alertDialog$Builder.f22714a);
    }

    public static void r1(Bundle bundle, SharedPreferences.Editor editor, String str) {
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof String) {
                if (str != null) {
                    editor.putString(a4.w.y(str, "_|_", str2), (String) obj);
                } else {
                    editor.putString(str2, (String) obj);
                }
            } else if (obj instanceof Integer) {
                if (str != null) {
                    editor.putInt(a4.w.y(str, "_|_", str2), ((Integer) obj).intValue());
                } else {
                    editor.putInt(str2, ((Integer) obj).intValue());
                }
            } else if (obj instanceof Boolean) {
                if (str != null) {
                    editor.putBoolean(a4.w.y(str, "_|_", str2), ((Boolean) obj).booleanValue());
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            if (this.f38165j0) {
                this.f38164i0 = this.fragmentView;
            }
            this.fragmentView = null;
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null && !this.f38165j0) {
            ViewGroup viewGroup2 = (ViewGroup) lVar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            this.actionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    @Override
    public final android.view.View createView(android.content.Context r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fg0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didUpdateConnectionState) {
            z1(true, false);
        } else if (i10 == NotificationCenter.newSuggestionsAvailable && this.f38157d0 && !getMessagesController().hasSetupEmailSuggestion()) {
            finishFragment();
        }
    }

    public final void e1() {
        String str;
        Context context = ApplicationLoader.applicationContext;
        StringBuilder sb2 = new StringBuilder("logininfo2");
        if (this.f38174x) {
            str = "_" + this.currentAccount;
        } else {
            str = "";
        }
        sb2.append(str);
        SharedPreferences.Editor edit = context.getSharedPreferences(sb2.toString(), 0).edit();
        edit.clear();
        edit.commit();
    }

    public final void g1(final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, boolean z10) {
        int i10;
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
        if ((auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms) && !auth_sentcodetype.verifiedFirebase && !this.f38166k0) {
            if (PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                TLRPC.TL_auth_sentCodeTypeFirebaseSms tL_auth_sentCodeTypeFirebaseSms = (TLRPC.TL_auth_sentCodeTypeFirebaseSms) auth_sentcode.type;
                n1(0, true);
                this.f38166k0 = true;
                String string = bundle.getString("phoneFormated");
                if (tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce != null) {
                    IntegrityManager create = IntegrityManagerFactory.create(getParentActivity());
                    String str = new String(Base64.encode(tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce, 8));
                    FileLog.d("getting classic integrity with nonce = ".concat(str));
                    create.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).setCloudProjectNumber(tL_auth_sentCodeTypeFirebaseSms.play_integrity_project_id).build()).addOnSuccessListener(new uc0(this, bundle, auth_sentcode, string, z10)).addOnFailureListener(new OnFailureListener(this) {
                        public final fg0 f43534b;

                        {
                            this.f43534b = this;
                        }

                        @Override
                        public final void onFailure(Exception exc) {
                            switch (r4) {
                                case 0:
                                    String str2 = "PLAYINTEGRITY_EXCEPTION_" + fg0.f1(exc);
                                    FileLog.e("{" + str2 + "} Resend firebase sms because integrity threw error", exc);
                                    this.f43534b.s1(bundle, auth_sentcode, str2);
                                    return;
                                default:
                                    FileLog.e(exc);
                                    String str3 = "SAFETYNET_EXCEPTION_" + fg0.f1(exc);
                                    FileLog.d("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                    this.f43534b.s1(bundle, auth_sentcode, str3);
                                    return;
                            }
                        }
                    });
                    return;
                }
                com.google.android.gms.common.api.j jVar = new com.google.android.gms.common.api.j(ApplicationLoader.applicationContext, y7.c.f50503a, (com.google.android.gms.common.api.a) null, (com.google.android.gms.common.api.internal.t) new Object());
                byte[] bArr = auth_sentcode.type.nonce;
                String str2 = BuildVars.SAFETYNET_KEY;
                com.google.android.gms.common.api.internal.t0 t0Var = jVar.h;
                k8.j0 j0Var = new k8.j0(t0Var, bArr, str2);
                t0Var.f3922b.d(0, j0Var);
                z5.l.n(j0Var, new z5.m(new Object())).addOnSuccessListener(new uc0(this, string, auth_sentcode, bundle, z10)).addOnFailureListener(new OnFailureListener(this) {
                    public final fg0 f43534b;

                    {
                        this.f43534b = this;
                    }

                    @Override
                    public final void onFailure(Exception exc) {
                        switch (r4) {
                            case 0:
                                String str22 = "PLAYINTEGRITY_EXCEPTION_" + fg0.f1(exc);
                                FileLog.e("{" + str22 + "} Resend firebase sms because integrity threw error", exc);
                                this.f43534b.s1(bundle, auth_sentcode, str22);
                                return;
                            default:
                                FileLog.e(exc);
                                String str3 = "SAFETYNET_EXCEPTION_" + fg0.f1(exc);
                                FileLog.d("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                this.f43534b.s1(bundle, auth_sentcode, str3);
                                return;
                        }
                    }
                });
                return;
            }
            FileLog.d("{GOOGLE_PLAY_SERVICES_NOT_AVAILABLE} Resend firebase sms because firebase is not available");
            s1(bundle, auth_sentcode, "GOOGLE_PLAY_SERVICES_NOT_AVAILABLE");
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
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                i10 = 5;
            } else {
                i10 = 60;
            }
            auth_sentcode.timeout = i10;
        }
        bundle.putInt("timeout", auth_sentcode.timeout * 1000);
        TLRPC.auth_SentCodeType auth_sentcodetype2 = auth_sentcode.type;
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt("type", 4);
            bundle.putInt("length", auth_sentcode.type.length);
            u1(4, z10, bundle, false);
        } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", auth_sentcode.type.pattern);
            u1(3, z10, bundle, false);
        } else if (!(auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSms) && !(auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFragmentSms) {
                bundle.putInt("type", 15);
                bundle.putString("url", auth_sentcode.type.url);
                bundle.putInt("length", auth_sentcode.type.length);
                u1(15, z10, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeMissedCall) {
                bundle.putInt("type", 11);
                bundle.putInt("length", auth_sentcode.type.length);
                bundle.putString("prefix", auth_sentcode.type.prefix);
                u1(11, z10, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSetUpEmailRequired) {
                bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
                u1(12, z10, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
                bundle.putString("emailPattern", auth_sentcode.type.email_pattern);
                bundle.putInt("length", auth_sentcode.type.length);
                bundle.putInt("nextPhoneLoginDate", auth_sentcode.type.next_phone_login_date);
                bundle.putInt("resetAvailablePeriod", auth_sentcode.type.reset_available_period);
                bundle.putInt("resetPendingDate", auth_sentcode.type.reset_pending_date);
                u1(14, z10, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                String str3 = auth_sentcodetype2.beginning;
                if (str3 != null) {
                    bundle.putString("beginning", str3);
                }
                u1(16, z10, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                String str4 = auth_sentcodetype2.beginning;
                if (str4 != null) {
                    bundle.putString("beginning", str4);
                }
                u1(17, z10, bundle, false);
            }
        } else {
            bundle.putInt("type", 2);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putBoolean("firebase", auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms);
            u1(2, z10, bundle, false);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return i7.i6.a(new f(this, 22), org.telegram.ui.ActionBar.g6.G6, org.telegram.ui.ActionBar.g6.D6, org.telegram.ui.ActionBar.g6.H6, org.telegram.ui.ActionBar.g6.f23152i6, org.telegram.ui.ActionBar.g6.P9, org.telegram.ui.ActionBar.g6.O9, org.telegram.ui.ActionBar.g6.f23189k6, org.telegram.ui.ActionBar.g6.f23206l6, org.telegram.ui.ActionBar.g6.I6, org.telegram.ui.ActionBar.g6.f23295q7, org.telegram.ui.ActionBar.g6.f23433y6, org.telegram.ui.ActionBar.g6.f23153i7, org.telegram.ui.ActionBar.g6.q6, org.telegram.ui.ActionBar.g6.Wh, org.telegram.ui.ActionBar.g6.Q9, org.telegram.ui.ActionBar.g6.f23279p7, org.telegram.ui.ActionBar.g6.J6, org.telegram.ui.ActionBar.g6.Y6, org.telegram.ui.ActionBar.g6.W6, org.telegram.ui.ActionBar.g6.X6, org.telegram.ui.ActionBar.g6.f23133h5, org.telegram.ui.ActionBar.g6.f23294q5, org.telegram.ui.ActionBar.g6.f23169j5);
    }

    public final boolean h1() {
        if (this.f38153b[this.f38151a].a() && !AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
            return true;
        }
        return false;
    }

    public final boolean i1() {
        if (this.B == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.f38157d0;
    }

    public final void k1(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.c2 c2Var;
        if (this.L != 0) {
            if (z10) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.L, true);
            }
            this.L = 0;
        }
        if (i1() && (c2Var = this.N) != null) {
            c2Var.dismiss();
            this.N = null;
        }
        w1(false, z11, false);
    }

    public final void l1(String str, String str2) {
        if (str2 != null && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.N = str;
            c2Var.P = str2;
            alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
            showDialog(alertDialog$Builder.f22714a);
        }
    }

    public final void n1(int i10, boolean z10) {
        if (i1() && i10 == 0) {
            if (this.N == null && getParentActivity() != null && !getParentActivity().isFinishing()) {
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
                this.N = c2Var;
                c2Var.f22783c0 = false;
                c2Var.show();
                return;
            }
            return;
        }
        this.L = i10;
        w1(true, z10, false);
    }

    public final void o1(TLRPC.TL_auth_authorization tL_auth_authorization, boolean z10) {
        MessagesController.getInstance(this.currentAccount).cleanup();
        ConnectionsManager.getInstance(this.currentAccount).setUserId(tL_auth_authorization.user.f22539id);
        UserConfig.getInstance(this.currentAccount).clearConfig();
        MessagesController.getInstance(this.currentAccount).cleanup();
        UserConfig.getInstance(this.currentAccount).syncContacts = this.f38175y;
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
        if (getParentActivity() instanceof LaunchActivity) {
            if (this.f38174x) {
                this.f38174x = false;
                this.f38165j0 = true;
                ((LaunchActivity) getParentActivity()).L0(this.currentAccount, new j3.t(3, z10));
                this.f38165j0 = false;
                finishFragment();
                return;
            }
            if (z10 && z11) {
                cg1 cg1Var = new cg1(6, null);
                cg1Var.C = i10;
                cg1Var.D = true;
                presentFragment(cg1Var, true);
            } else {
                Bundle i11 = a4.w.i("afterSignup", z10);
                ng0 ng0Var = new ng0();
                ng0Var.l0(i11);
                presentFragment(ng0Var, true);
            }
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
            b31.V(true);
        } else if (getParentActivity() instanceof ExternalActionActivity) {
            ExternalActionActivity externalActionActivity = (ExternalActionActivity) getParentActivity();
            externalActionActivity.d(externalActionActivity.h, externalActionActivity.f35539n, externalActionActivity.v, true, externalActionActivity.f35540r, externalActionActivity.f35541s);
            externalActionActivity.f35536c.X();
            ActionBarLayout actionBarLayout = externalActionActivity.d;
            if (actionBarLayout != null) {
                actionBarLayout.X();
            }
            org.telegram.ui.Components.hv0 hv0Var = externalActionActivity.f35537e;
            if (hv0Var != null) {
                hv0Var.setVisibility(0);
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        pe0 pe0Var = (pe0) this.f38153b[5];
        if (pe0Var != null) {
            pe0Var.H.i(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f38157d0 || this.f38151a != 12) {
            int i10 = this.f38151a;
            org.telegram.ui.Components.mv0[] mv0VarArr = this.f38153b;
            if (i10 == 0 || (this.B == 3 && i10 == 12)) {
                if (z10) {
                    for (org.telegram.ui.Components.mv0 mv0Var : mv0VarArr) {
                        if (mv0Var != null) {
                            mv0Var.f();
                        }
                    }
                    e1();
                }
                return true;
            } else if (i10 == 6) {
                if (z10) {
                    mv0VarArr[i10].c(true);
                    u1(0, true, null, true);
                    return false;
                }
            } else if (i10 != 7 && i10 != 8) {
                if ((i10 < 1 || i10 > 4) && i10 != 11 && i10 != 15) {
                    if (i10 == 5) {
                        if (z10) {
                            ((pe0) mv0VarArr[i10]).f41393w.callOnClick();
                            return false;
                        }
                    } else if (i10 == 9) {
                        if (z10) {
                            mv0VarArr[i10].c(true);
                            u1(7, true, null, true);
                            return false;
                        }
                    } else if (i10 == 10) {
                        if (z10) {
                            mv0VarArr[i10].c(true);
                            u1(9, true, null, true);
                            return false;
                        }
                    } else if (i10 == 13) {
                        if (z10) {
                            mv0VarArr[i10].c(true);
                            u1(12, true, null, true);
                            return false;
                        }
                    } else if (z10 && mv0VarArr[i10].c(true)) {
                        u1(0, true, null, true);
                        return false;
                    }
                } else if (z10 && mv0VarArr[i10].c(false)) {
                    u1(0, true, null, true);
                    return false;
                }
            } else if (z10) {
                mv0VarArr[i10].c(true);
                u1(6, true, null, true);
            }
        }
        return false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        t1(this.f38153b[this.f38151a].a(), false);
        tf0 tf0Var = this.X;
        if (tf0Var != null) {
            int i10 = tf0.A;
            tf0Var.a();
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
                    ArrayList arrayList = this.f38171r;
                    if (!arrayList.isEmpty() && getParentActivity() != null) {
                        getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
                        return;
                    }
                }
                if (dialog == this.f38168n) {
                    ArrayList arrayList2 = this.f38172s;
                    if (!arrayList2.isEmpty() && getParentActivity() != null) {
                        AndroidUtilities.runOnUIThread(new tc0(this, 1), 200L);
                        getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
                    }
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
        Runnable[] runnableArr;
        super.onFragmentDestroy();
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.mv0[] mv0VarArr = this.f38153b;
            if (i10 >= mv0VarArr.length) {
                break;
            }
            org.telegram.ui.Components.mv0 mv0Var = mv0VarArr[i10];
            if (mv0Var != null) {
                mv0Var.f();
            }
            i10++;
        }
        org.telegram.ui.ActionBar.c2 c2Var = this.N;
        if (c2Var != null) {
            c2Var.dismiss();
            this.N = null;
        }
        for (Runnable runnable : this.f38161f0) {
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
        if (this.f38174x) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(true, false);
        }
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        boolean z10;
        if (strArr.length != 0 && iArr.length != 0) {
            if (iArr[0] == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.mv0[] mv0VarArr = this.f38153b;
            if (i10 == 6) {
                this.v = false;
                int i11 = this.f38151a;
                if (i11 == 0) {
                    org.telegram.ui.Components.mv0 mv0Var = mv0VarArr[i11];
                    ((eg0) mv0Var).H = true;
                    mv0Var.h(null);
                }
            } else if (i10 == 7) {
                this.f38173w = false;
                int i12 = this.f38151a;
                if (i12 == 0) {
                    ((eg0) mv0VarArr[i12]).q();
                }
            } else if (i10 == 20) {
                if (z10) {
                    ((pe0) mv0VarArr[5]).H.m();
                }
            } else if (i10 == 151 && z10) {
                pe0 pe0Var = (pe0) mv0VarArr[5];
                pe0Var.post(new dd0(pe0Var, 0));
            }
        }
    }

    @Override
    public final void onResume() {
        org.telegram.ui.Components.mv0 mv0Var;
        int i10;
        org.telegram.ui.Components.mv0[] mv0VarArr = this.f38153b;
        super.onResume();
        if (this.f38174x) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        View view = this.fragmentView;
        if (view != null) {
            view.requestLayout();
        }
        try {
            int i11 = this.f38151a;
            if (i11 >= 1 && i11 <= 4) {
                org.telegram.ui.Components.mv0 mv0Var2 = mv0VarArr[i11];
                if ((mv0Var2 instanceof if0) && (i10 = ((if0) mv0Var2).P) != 0 && Math.abs((System.currentTimeMillis() / 1000) - i10) >= 86400) {
                    mv0VarArr[this.f38151a].c(true);
                    u1(0, false, null, true);
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        int i12 = this.f38151a;
        if (i12 == 0 && !this.Y && (mv0Var = mv0VarArr[i12]) != null) {
            mv0Var.j();
        }
        if (h1()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
        int i13 = this.f38151a;
        if (i13 >= 0 && i13 < mv0VarArr.length) {
            mv0VarArr[i13].i();
        }
    }

    public final void p1() {
        if (this.M[this.F]) {
            if (this.R.getTag() != null) {
                if (getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22714a.N = LocaleController.getString("StopLoadingTitle", R.string.StopLoadingTitle);
                alertDialog$Builder.f22714a.P = LocaleController.getString("StopLoading", R.string.StopLoading);
                alertDialog$Builder.k(LocaleController.getString("WaitMore", R.string.WaitMore), null);
                alertDialog$Builder.h(LocaleController.getString("Stop", R.string.Stop), new yc0(this, 0));
                showDialog(alertDialog$Builder.f22714a);
                return;
            }
            this.f38153b[this.f38151a].h(null);
        }
    }

    public final void q1(String str, TLRPC.auth_SentCode auth_sentcode) {
        this.f38158e = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + str);
        bundle.putString("ephone", "+" + str);
        bundle.putString("phoneFormated", str);
        g1(bundle, auth_sentcode, true);
    }

    public final void s1(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str) {
        if (!this.f38166k0) {
            return;
        }
        k1(false, true);
        this.f38166k0 = false;
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = bundle.getString("phoneFormated");
        tL_auth_resendCode.phone_code_hash = auth_sentcode.phone_code_hash;
        if (str != null) {
            tL_auth_resendCode.flags |= 1;
            tL_auth_resendCode.reason = str;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_resendCode, new u80(4, this, bundle), 10);
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("currentViewNum", this.f38151a);
            bundle2.putInt("syncContacts", this.f38175y ? 1 : 0);
            for (int i10 = 0; i10 <= this.f38151a; i10++) {
                org.telegram.ui.Components.mv0 mv0Var = this.f38153b[i10];
                if (mv0Var != null) {
                    mv0Var.l(bundle2);
                }
            }
            Context context = ApplicationLoader.applicationContext;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("logininfo2");
            if (this.f38174x) {
                str = "_" + this.currentAccount;
            } else {
                str = "";
            }
            sb2.append(str);
            SharedPreferences.Editor edit = context.getSharedPreferences(sb2.toString(), 0).edit();
            edit.clear();
            r1(bundle2, edit, null);
            edit.commit();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void t1(boolean z10, boolean z11) {
        if (this.W == z10 && z11) {
            return;
        }
        this.W = z10;
        if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
            z10 = false;
        }
        if (z10) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
            if (z11) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                this.d = duration;
                duration.setInterpolator(org.telegram.ui.Components.jr.f29800f);
                this.d.addUpdateListener(new sc0(this, 0));
                this.d.addListener(new ed0(this, 0));
                this.d.start();
                return;
            }
            this.f38155c.setVisibility(0);
            return;
        }
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        if (z11) {
            ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
            this.d = duration2;
            duration2.setInterpolator(org.telegram.ui.Components.ct.f27567e);
            this.d.addUpdateListener(new sc0(this, 1));
            this.d.addListener(new ed0(this, 1));
            this.d.start();
            return;
        }
        this.f38155c.setVisibility(8);
    }

    public final void u1(int i10, boolean z10, Bundle bundle, boolean z11) {
        boolean z12;
        int i11;
        int i12;
        if (i10 != 0 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 10 && i10 != 12 && i10 != 17 && i10 != 16) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (i10 == this.f38151a) {
            z10 = false;
        }
        int i13 = 8;
        if (z12) {
            if (i10 == 0) {
                this.v = true;
                this.f38173w = true;
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
        org.telegram.ui.Components.mv0[] mv0VarArr = this.f38153b;
        if (z10) {
            org.telegram.ui.Components.mv0 mv0Var = mv0VarArr[this.f38151a];
            org.telegram.ui.Components.mv0 mv0Var2 = mv0VarArr[i10];
            this.f38151a = i10;
            this.Q.setVisibility((mv0Var2.b() || this.f38174x) ? 0 : 0);
            mv0Var2.m(bundle, false);
            setParentActivityTitle(mv0Var2.getHeaderName());
            mv0Var2.j();
            int i14 = AndroidUtilities.displaySize.x;
            if (z11) {
                i14 = -i14;
            }
            mv0Var2.setX(i14);
            mv0Var2.setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new androidx.fragment.app.g(this, z12, mv0Var, 10));
            Property property = View.TRANSLATION_X;
            if (z11) {
                i12 = AndroidUtilities.displaySize.x;
            } else {
                i12 = -AndroidUtilities.displaySize.x;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(mv0Var, property, i12), ObjectAnimator.ofFloat(mv0Var2, property, 0.0f));
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.start();
            t1(mv0Var2.a(), true);
            return;
        }
        ImageView imageView = this.Q;
        if (!mv0VarArr[i10].b() && !this.f38174x) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        imageView.setVisibility(i11);
        mv0VarArr[this.f38151a].setVisibility(8);
        mv0VarArr[this.f38151a].g();
        this.f38151a = i10;
        mv0VarArr[i10].m(bundle, false);
        mv0VarArr[i10].setVisibility(0);
        setParentActivityTitle(mv0VarArr[i10].getHeaderName());
        mv0VarArr[i10].j();
        t1(mv0VarArr[i10].a(), false);
    }

    public final void v1(boolean z10, boolean z11) {
        boolean z12;
        TimeInterpolator timeInterpolator;
        int i10 = this.F;
        if (i10 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean[] zArr = this.M;
        if (zArr[i10] != z10) {
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
            if (z11) {
                animatorSetArr[i11] = new AnimatorSet();
                if (z12) {
                    this.J.e(z10, z11);
                }
                animatorSetArr[this.F].addListener(new org.telegram.ui.ActionBar.h(this, z12, z10, 5));
                int i12 = 150;
                if (z12) {
                    if (z10) {
                        timeInterpolator = AndroidUtilities.decelerateInterpolator;
                        i12 = 200;
                    } else {
                        timeInterpolator = AndroidUtilities.accelerateInterpolator;
                    }
                } else {
                    timeInterpolator = null;
                }
                animatorSetArr[this.F].setDuration(i12);
                animatorSetArr[this.F].setInterpolator(timeInterpolator);
                animatorSetArr[this.F].start();
            } else if (z12) {
                this.J.e(z10, z11);
            }
        }
    }

    public final void w1(final boolean z10, final boolean z11, boolean z12) {
        boolean z13;
        float f9;
        boolean[] zArr = this.f38159e0;
        if (z11 && zArr[this.F] == z10 && !z12) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.oz(this, z10, z11, z12, 1));
            return;
        }
        final int i10 = this.F;
        if (i10 == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        boolean[] zArr2 = this.f38162g0;
        if (!z12 && !z13) {
            zArr[i10] = z10;
            if (z11) {
                boolean z14 = zArr2[i10];
                Runnable[] runnableArr = this.f38161f0;
                if (z14) {
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[i10]);
                    zArr2[this.F] = false;
                    return;
                } else if (z10) {
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            fg0 fg0Var = fg0.this;
                            int i11 = fg0Var.F;
                            fg0Var.F = i10;
                            fg0Var.w1(z10, z11, true);
                            fg0Var.F = i11;
                        }
                    };
                    runnableArr[i10] = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 2000L);
                    zArr2[this.F] = true;
                    return;
                }
            }
        } else {
            zArr2[i10] = false;
            zArr[i10] = z10;
        }
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z13) {
            this.J.f(z10, z11);
            return;
        }
        float f10 = 0.0f;
        if (z11) {
            this.H = new AnimatorSet();
            if (z10) {
                f9 = 0.0f;
            } else {
                f9 = 1.0f;
            }
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, f10);
            ofFloat.addListener(new p60(1, this, z10));
            ofFloat.addUpdateListener(new sc0(this, 2));
            this.H.playTogether(ofFloat);
            this.H.setDuration(150L);
            this.H.start();
        } else if (z10) {
            this.R.setVisibility(0);
            this.R.setScaleX(1.0f);
            this.R.setScaleY(1.0f);
            this.R.setAlpha(1.0f);
        } else {
            this.R.setTag(null);
            this.R.setVisibility(4);
            this.R.setScaleX(0.1f);
            this.R.setScaleY(0.1f);
            this.R.setAlpha(0.0f);
        }
    }

    public final void x1(boolean z10, boolean z11) {
        if (z10 == this.f38169n0) {
            return;
        }
        tc0 tc0Var = this.f38170o0;
        if (tc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(tc0Var);
            this.f38170o0 = null;
        }
        this.f38169n0 = z10;
        this.S.clearAnimation();
        float f9 = 0.0f;
        int i10 = 0;
        if (z11) {
            this.S.setVisibility(0);
            ViewPropertyAnimator animate = this.S.animate();
            if (z10) {
                f9 = 1.0f;
            }
            animate.alpha(f9).withEndAction(new org.telegram.ui.Components.p90(10, this, z10)).start();
            return;
        }
        ImageView imageView = this.S;
        if (!z10) {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = this.S;
        if (z10) {
            f9 = 1.0f;
        }
        imageView2.setAlpha(f9);
    }

    public final void y1() {
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        ImageView imageView = this.Q;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        imageView.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        ImageView imageView2 = this.Q;
        int i11 = org.telegram.ui.ActionBar.g6.f23152i6;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i11, false), 1, -1));
        this.T.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.S.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i11, false), 1, -1));
        RadialProgressView radialProgressView = this.R;
        int i12 = org.telegram.ui.ActionBar.g6.P9;
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.J.g();
        this.I.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.O9, false));
        this.I.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        for (org.telegram.ui.Components.mv0 mv0Var : this.f38153b) {
            mv0Var.n();
        }
        org.telegram.ui.Components.or orVar = this.f38155c;
        orVar.f31457a.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        int i13 = 0;
        while (true) {
            View[] viewArr = orVar.f31459c;
            if (i13 >= viewArr.length) {
                break;
            }
            View view = viewArr[i13];
            if (view != null) {
                view.setBackground(org.telegram.ui.Components.or.a(i13));
                if (view instanceof org.telegram.ui.Components.nr) {
                    org.telegram.ui.Components.nr nrVar = (org.telegram.ui.Components.nr) view;
                    nrVar.f31126a.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
                    nrVar.f31127b.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
                }
            }
            i13++;
        }
        tf0 tf0Var = this.X;
        if (tf0Var != null) {
            int i14 = tf0.A;
            tf0Var.b();
        }
    }

    public final void z1(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        if (this.T != null) {
            int connectionState = getConnectionsManager().getConnectionState();
            if (this.m0 != connectionState || z11) {
                this.m0 = connectionState;
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if (sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i10 = this.m0;
                if (i10 != 3 && i10 != 5) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (i10 != 1 && i10 != 2 && i10 != 4) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if (z12) {
                    this.T.b(true, z13, z10);
                    x1(true, z10);
                } else if ((getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty()) || z14) {
                    this.T.b(true, z13, z10);
                    if (this.f38169n0) {
                        return;
                    }
                    tc0 tc0Var = this.f38170o0;
                    if (tc0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(tc0Var);
                    }
                    this.f38169n0 = true;
                    tc0 tc0Var2 = new tc0(this, 0);
                    this.f38170o0 = tc0Var2;
                    AndroidUtilities.runOnUIThread(tc0Var2, 5000L);
                } else {
                    x1(false, z10);
                }
            }
        }
    }

    public fg0(int i10) {
        super(null);
        this.f38153b = new org.telegram.ui.Components.mv0[19];
        this.f38171r = new ArrayList();
        this.f38172s = new ArrayList();
        this.v = true;
        this.f38173w = true;
        this.f38175y = true;
        this.A = false;
        this.B = 0;
        this.G = new AnimatorSet[2];
        this.M = new boolean[]{true, false};
        this.W = false;
        this.f38159e0 = new boolean[2];
        this.f38161f0 = new Runnable[2];
        this.f38162g0 = new boolean[2];
        this.currentAccount = i10;
        this.f38174x = true;
    }
}
