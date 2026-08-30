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
public final class ng0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f36621q0;
    public boolean B;
    public int C;
    public String D;
    public Bundle E;
    public TLRPC.TL_auth_sentCode F;
    public int G;
    public final AnimatorSet[] H;
    public AnimatorSet I;
    public org.telegram.ui.Components.e31 J;
    public org.telegram.ui.Components.z10 K;
    public n7.qa L;
    public int M;
    public final boolean[] N;
    public org.telegram.ui.ActionBar.d2 O;
    public kh.j4 P;
    public cg0 Q;
    public ImageView R;
    public RadialProgressView S;
    public ImageView T;
    public org.telegram.ui.Components.mi0 U;
    public LinearLayout V;
    public l0 W;
    public boolean X;
    public bg0 Y;
    public boolean Z;
    public int f36622a;
    public Runnable f36623a0;
    public final org.telegram.ui.Components.vv0[] f36624b;
    public dw f36625b0;
    public org.telegram.ui.Components.sr f36626c;
    public TextView f36627c0;
    public ValueAnimator d;
    public boolean f36628d0;
    public boolean e;
    public boolean f36629e0;
    public boolean f36630f;
    public final boolean[] f36631f0;
    public final Runnable[] f36632g0;
    public Dialog h;
    public final boolean[] f36633h0;
    public boolean f36634i0;
    public View f36635j0;
    public boolean f36636k0;
    public boolean f36637l0;
    public TLRPC.TL_help_termsOfService m0;
    public Dialog f36638n;
    public int f36639n0;
    public boolean f36640o0;
    public cd0 f36641p0;
    public final ArrayList f36642r;
    public final ArrayList f36643s;
    public boolean v;
    public boolean f36644w;
    public boolean f36645x;
    public boolean f36646y;

    static {
        int i10;
        if (SharedConfig.getDevicePerformanceClass() <= 1) {
            i10 = 150;
        } else {
            i10 = 100;
        }
        f36621q0 = i10;
    }

    public ng0() {
        super(null);
        this.f36624b = new org.telegram.ui.Components.vv0[19];
        this.f36642r = new ArrayList();
        this.f36643s = new ArrayList();
        this.v = true;
        this.f36644w = true;
        this.f36646y = true;
        this.B = false;
        this.C = 0;
        this.H = new AnimatorSet[2];
        this.N = new boolean[]{true, false};
        this.X = false;
        this.f36631f0 = new boolean[2];
        this.f36632g0 = new Runnable[2];
        this.f36633h0 = new boolean[2];
    }

    public static boolean T0(ng0 ng0Var, View view) {
        if (!ng0Var.h1()) {
            return AndroidUtilities.showKeyboard(view);
        }
        return true;
    }

    public static void U(ng0 ng0Var, TLRPC.TL_error tL_error, String str, String str2, String str3) {
        ng0Var.k1(false, true);
        if (tL_error == null) {
            if (str != null && str2 != null && str3 != null) {
                Bundle bundle = new Bundle();
                bundle.putString("phoneFormated", str);
                bundle.putString("phoneHash", str2);
                bundle.putString("code", str3);
                ng0Var.u1(5, true, bundle, false);
                return;
            }
            ng0Var.u1(0, true, null, true);
        } else if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
            ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
        } else if (tL_error.text.startsWith("2FA_CONFIRM_WAIT_")) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("phoneFormated", str);
            bundle2.putString("phoneHash", str2);
            bundle2.putString("code", str3);
            bundle2.putInt("startTime", ConnectionsManager.getInstance(ng0Var.currentAccount).getCurrentTime());
            bundle2.putInt("waitTime", Utilities.parseInt((CharSequence) tL_error.text.replace("2FA_CONFIRM_WAIT_", "")).intValue());
            ng0Var.u1(8, true, bundle2, false);
        } else {
            ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
        }
    }

    public static void U0(ng0 ng0Var, View view, boolean z4) {
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(view, 3.5f);
        if (z4 && (view instanceof org.telegram.ui.Components.ad0)) {
            Runnable runnable = (Runnable) view.getTag(R.id.timeout_callback);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
            org.telegram.ui.Components.ad0 ad0Var = (org.telegram.ui.Components.ad0) view;
            AtomicReference atomicReference = new AtomicReference();
            EditText attachedEditText = ad0Var.getAttachedEditText();
            cg.b0 b0Var = new cg.b0(9, attachedEditText, atomicReference);
            ad0Var.a(1.0f);
            a30 a30Var = new a30(ad0Var, view, attachedEditText, b0Var, 8);
            atomicReference.set(a30Var);
            view.postDelayed(a30Var, 2000L);
            view.setTag(R.id.timeout_callback, a30Var);
            if (attachedEditText != null) {
                attachedEditText.addTextChangedListener(b0Var);
            }
        }
    }

    public static void V(ng0 ng0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z4, a8.d dVar) {
        String str2;
        a8.f fVar = ((p7.d) ((com.google.android.gms.common.api.q) dVar.f2215a)).f41057b;
        if (fVar == null) {
            str2 = null;
        } else {
            str2 = fVar.f135a;
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
                            ConnectionsManager.getInstance(ng0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new gd0(1, bundle, auth_sentcode, ng0Var, z4), 10);
                        } else if (!optBoolean && !optBoolean2) {
                            FileLog.d("{SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false and basicIntegrity = false");
                            ng0Var.s1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE");
                        } else if (!optBoolean) {
                            FileLog.d("{SAFETYNET_BASICINTEGRITY_FALSE} Resend firebase sms because basicIntegrity = false");
                            ng0Var.s1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_FALSE");
                        } else if (!optBoolean2) {
                            FileLog.d("{SAFETYNET_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false");
                            ng0Var.s1(bundle, auth_sentcode, "SAFETYNET_CTSPROFILEMATCH_FALSE");
                        }
                    } catch (JSONException e) {
                        e = e;
                        FileLog.e(e);
                        FileLog.d("{SAFETYNET_JSON_EXCEPTION} Resend firebase sms because of exception");
                        ng0Var.s1(bundle, auth_sentcode, "SAFETYNET_JSON_EXCEPTION");
                    }
                } catch (JSONException e6) {
                    e = e6;
                }
            } else {
                FileLog.d("{SAFETYNET_CANT_SPLIT} Resend firebase sms because can't split JWS token");
                ng0Var.s1(bundle, auth_sentcode, "SAFETYNET_CANT_SPLIT");
            }
        } else {
            FileLog.d("{SAFETYNET_NULL_JWS} Resend firebase sms because JWS = null");
            ng0Var.s1(bundle, auth_sentcode, "SAFETYNET_NULL_JWS");
        }
    }

    public static HashSet V0(ng0 ng0Var) {
        List<SubscriptionInfo> list;
        HashSet hashSet = new HashSet();
        try {
            String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                hashSet.add(line1Number);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 22) {
                SubscriptionManager from = SubscriptionManager.from(ng0Var.getParentActivity());
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
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        return hashSet;
    }

    public static void W(ng0 ng0Var, String str, String str2, String str3) {
        ng0Var.n1(0, true);
        TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
        deleteaccount.reason = "Forgot password";
        ConnectionsManager.getInstance(ng0Var.currentAccount).sendRequest(deleteaccount, new kh.b1(ng0Var, str, str2, str3, 11), 10);
    }

    public static int W0(ng0 ng0Var) {
        return ng0Var.currentAccount;
    }

    public static void X(ng0 ng0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z4, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            FileLog.d("Resend firebase sms because integrity token = null");
            ng0Var.s1(bundle, auth_sentcode, "PLAYINTEGRITY_TOKEN_NULL");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.play_integrity_token = str2;
        tL_auth_requestFirebaseSms.flags |= 4;
        ConnectionsManager.getInstance(ng0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new gd0(0, bundle, auth_sentcode, ng0Var, z4), 10);
    }

    public static int X0(ng0 ng0Var) {
        return ng0Var.currentAccount;
    }

    public static int Y0(ng0 ng0Var) {
        return ng0Var.currentAccount;
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
            StringBuilder l10 = e2.c.l(simpleName);
            l10.append(exc.getMessage());
            simpleName = l10.toString();
        }
        return simpleName.toUpperCase().replaceAll(" ", "_");
    }

    public static Bundle j1(int i10, boolean z4) {
        String str;
        try {
            Bundle bundle = new Bundle();
            Context context = ApplicationLoader.applicationContext;
            StringBuilder sb = new StringBuilder("logininfo2");
            if (z4) {
                str = "_" + i10;
            } else {
                str = "";
            }
            sb.append(str);
            for (Map.Entry<String, ?> entry : context.getSharedPreferences(sb.toString(), 0).getAll().entrySet()) {
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
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static void m1(org.telegram.ui.ActionBar.p2 p2Var, String str, l7.w0 w0Var, boolean z4) {
        List list;
        if (p2Var != null && p2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity());
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
            if (z4) {
                d2Var.O = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                d2Var.Q = LocaleController.getString("BannedPhoneNumber", R.string.BannedPhoneNumber);
            } else if (w0Var != null && (list = (List) w0Var.f11677c) != null && !list.isEmpty() && ((st) w0Var.f11676b) != null) {
                int i10 = Integer.MAX_VALUE;
                for (String str2 : (List) w0Var.f11677c) {
                    int length = str2.replace(" ", "").length();
                    if (length < i10) {
                        i10 = length;
                    }
                }
                if (se.b.d(str, false).length() - ((st) w0Var.f11676b).f38437c.length() < i10) {
                    d2Var.O = LocaleController.getString(R.string.WrongNumberFormat);
                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("ShortNumberInfo", R.string.ShortNumberInfo, ((st) w0Var.f11676b).f38435a, (String) w0Var.d));
                } else {
                    d2Var.O = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    d2Var.Q = LocaleController.getString(R.string.InvalidPhoneNumber);
                }
            } else {
                d2Var.O = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                d2Var.Q = LocaleController.getString(R.string.InvalidPhoneNumber);
            }
            alertDialog$Builder.i(LocaleController.getString("BotHelp", R.string.BotHelp), new com.google.firebase.messaging.i(str, p2Var, z4));
            alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
            p2Var.showDialog(d2Var);
        }
    }

    public static void n0(ng0 ng0Var, String str, String str2, String str3) {
        if (ng0Var.S.getTag() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ng0Var.getParentActivity());
        alertDialog$Builder.f19503a.Q = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
        alertDialog$Builder.f19503a.O = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
        alertDialog$Builder.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new a1.d(ng0Var, str, str2, str3, 14));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        ng0Var.showDialog(alertDialog$Builder.f19503a);
    }

    public static void r1(Bundle bundle, SharedPreferences.Editor editor, String str) {
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof String) {
                if (str != null) {
                    editor.putString(android.support.v4.media.a.z(str, "_|_", str2), (String) obj);
                } else {
                    editor.putString(str2, (String) obj);
                }
            } else if (obj instanceof Integer) {
                if (str != null) {
                    editor.putInt(android.support.v4.media.a.z(str, "_|_", str2), ((Integer) obj).intValue());
                } else {
                    editor.putInt(str2, ((Integer) obj).intValue());
                }
            } else if (obj instanceof Boolean) {
                if (str != null) {
                    editor.putBoolean(android.support.v4.media.a.z(str, "_|_", str2), ((Boolean) obj).booleanValue());
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
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (this.f36636k0) {
                this.f36635j0 = this.fragmentView;
            }
            this.fragmentView = null;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && !this.f36636k0) {
            ViewGroup viewGroup2 = (ViewGroup) kVar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
            this.actionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    @Override
    public final android.view.View createView(android.content.Context r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ng0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didUpdateConnectionState) {
            z1(true, false);
        } else if (i10 == NotificationCenter.newSuggestionsAvailable && this.f36629e0 && !getMessagesController().hasSetupEmailSuggestion()) {
            finishFragment();
        }
    }

    public final void e1() {
        String str;
        Context context = ApplicationLoader.applicationContext;
        StringBuilder sb = new StringBuilder("logininfo2");
        if (this.f36645x) {
            str = "_" + this.currentAccount;
        } else {
            str = "";
        }
        sb.append(str);
        SharedPreferences.Editor edit = context.getSharedPreferences(sb.toString(), 0).edit();
        edit.clear();
        edit.commit();
    }

    public final void g1(final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, boolean z4) {
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
        if ((auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms) && !auth_sentcodetype.verifiedFirebase && !this.f36637l0) {
            if (PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                TLRPC.TL_auth_sentCodeTypeFirebaseSms tL_auth_sentCodeTypeFirebaseSms = (TLRPC.TL_auth_sentCodeTypeFirebaseSms) auth_sentcode.type;
                n1(0, true);
                this.f36637l0 = true;
                String string = bundle.getString("phoneFormated");
                if (tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce != null) {
                    IntegrityManager create = IntegrityManagerFactory.create(getParentActivity());
                    String str = new String(Base64.encode(tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce, 8));
                    FileLog.d("getting classic integrity with nonce = ".concat(str));
                    create.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).setCloudProjectNumber(tL_auth_sentCodeTypeFirebaseSms.play_integrity_project_id).build()).addOnSuccessListener(new dd0(this, bundle, auth_sentcode, string, z4)).addOnFailureListener(new OnFailureListener(this) {
                        public final ng0 f33993b;

                        {
                            this.f33993b = this;
                        }

                        @Override
                        public final void onFailure(Exception exc) {
                            switch (r4) {
                                case 0:
                                    String str2 = "PLAYINTEGRITY_EXCEPTION_" + ng0.f1(exc);
                                    FileLog.e("{" + str2 + "} Resend firebase sms because integrity threw error", exc);
                                    this.f33993b.s1(bundle, auth_sentcode, str2);
                                    return;
                                default:
                                    FileLog.e(exc);
                                    String str3 = "SAFETYNET_EXCEPTION_" + ng0.f1(exc);
                                    FileLog.d("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                    this.f33993b.s1(bundle, auth_sentcode, str3);
                                    return;
                            }
                        }
                    });
                    return;
                }
                com.google.android.gms.common.api.j jVar = new com.google.android.gms.common.api.j(ApplicationLoader.applicationContext, a8.c.f133a, (com.google.android.gms.common.api.a) null, (com.google.android.gms.common.api.internal.t) new Object());
                byte[] bArr = auth_sentcode.type.nonce;
                String str2 = BuildVars.SAFETYNET_KEY;
                com.google.android.gms.common.api.internal.t0 t0Var = jVar.h;
                m8.i0 i0Var = new m8.i0(t0Var, bArr, str2);
                t0Var.f2877b.d(0, i0Var);
                b6.m.n(i0Var, new b6.n(new Object())).addOnSuccessListener(new dd0(this, string, auth_sentcode, bundle, z4)).addOnFailureListener(new OnFailureListener(this) {
                    public final ng0 f33993b;

                    {
                        this.f33993b = this;
                    }

                    @Override
                    public final void onFailure(Exception exc) {
                        switch (r4) {
                            case 0:
                                String str22 = "PLAYINTEGRITY_EXCEPTION_" + ng0.f1(exc);
                                FileLog.e("{" + str22 + "} Resend firebase sms because integrity threw error", exc);
                                this.f33993b.s1(bundle, auth_sentcode, str22);
                                return;
                            default:
                                FileLog.e(exc);
                                String str3 = "SAFETYNET_EXCEPTION_" + ng0.f1(exc);
                                FileLog.d("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                this.f33993b.s1(bundle, auth_sentcode, str3);
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
            u1(1, z4, bundle, false);
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
            u1(4, z4, bundle, false);
        } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", auth_sentcode.type.pattern);
            u1(3, z4, bundle, false);
        } else if (!(auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSms) && !(auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFragmentSms) {
                bundle.putInt("type", 15);
                bundle.putString("url", auth_sentcode.type.url);
                bundle.putInt("length", auth_sentcode.type.length);
                u1(15, z4, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeMissedCall) {
                bundle.putInt("type", 11);
                bundle.putInt("length", auth_sentcode.type.length);
                bundle.putString("prefix", auth_sentcode.type.prefix);
                u1(11, z4, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSetUpEmailRequired) {
                bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
                u1(12, z4, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
                bundle.putString("emailPattern", auth_sentcode.type.email_pattern);
                bundle.putInt("length", auth_sentcode.type.length);
                bundle.putInt("nextPhoneLoginDate", auth_sentcode.type.next_phone_login_date);
                bundle.putInt("resetAvailablePeriod", auth_sentcode.type.reset_available_period);
                bundle.putInt("resetPendingDate", auth_sentcode.type.reset_pending_date);
                u1(14, z4, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                String str3 = auth_sentcodetype2.beginning;
                if (str3 != null) {
                    bundle.putString("beginning", str3);
                }
                u1(16, z4, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                String str4 = auth_sentcodetype2.beginning;
                if (str4 != null) {
                    bundle.putString("beginning", str4);
                }
                u1(17, z4, bundle, false);
            }
        } else {
            bundle.putInt("type", 2);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putBoolean("firebase", auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms);
            u1(2, z4, bundle, false);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return k7.e6.a(new f(this, 22), org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.D6, org.telegram.ui.ActionBar.j6.H6, org.telegram.ui.ActionBar.j6.f19996i6, org.telegram.ui.ActionBar.j6.P9, org.telegram.ui.ActionBar.j6.O9, org.telegram.ui.ActionBar.j6.f20031k6, org.telegram.ui.ActionBar.j6.f20049l6, org.telegram.ui.ActionBar.j6.I6, org.telegram.ui.ActionBar.j6.f20141q7, org.telegram.ui.ActionBar.j6.f20281y6, org.telegram.ui.ActionBar.j6.f19997i7, org.telegram.ui.ActionBar.j6.f20140q6, org.telegram.ui.ActionBar.j6.Wh, org.telegram.ui.ActionBar.j6.Q9, org.telegram.ui.ActionBar.j6.f20122p7, org.telegram.ui.ActionBar.j6.J6, org.telegram.ui.ActionBar.j6.Y6, org.telegram.ui.ActionBar.j6.W6, org.telegram.ui.ActionBar.j6.X6, org.telegram.ui.ActionBar.j6.f19977h5, org.telegram.ui.ActionBar.j6.f20139q5, org.telegram.ui.ActionBar.j6.f20012j5);
    }

    public final boolean h1() {
        if (this.f36624b[this.f36622a].a() && !AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
            return true;
        }
        return false;
    }

    public final boolean i1() {
        if (this.C == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.f36629e0;
    }

    public final void k1(boolean z4, boolean z10) {
        org.telegram.ui.ActionBar.d2 d2Var;
        if (this.M != 0) {
            if (z4) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.M, true);
            }
            this.M = 0;
        }
        if (i1() && (d2Var = this.O) != null) {
            d2Var.dismiss();
            this.O = null;
        }
        w1(false, z10, false);
    }

    public final void l1(String str, String str2) {
        if (str2 != null && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
            d2Var.O = str;
            d2Var.Q = str2;
            alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
            showDialog(alertDialog$Builder.f19503a);
        }
    }

    public final void n1(int i10, boolean z4) {
        if (i1() && i10 == 0) {
            if (this.O == null && getParentActivity() != null && !getParentActivity().isFinishing()) {
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
                this.O = d2Var;
                d2Var.f19590d0 = false;
                d2Var.show();
                return;
            }
            return;
        }
        this.M = i10;
        w1(true, z4, false);
    }

    public final void o1(TLRPC.TL_auth_authorization tL_auth_authorization, boolean z4) {
        MessagesController.getInstance(this.currentAccount).cleanup();
        ConnectionsManager.getInstance(this.currentAccount).setUserId(tL_auth_authorization.user.f19331id);
        UserConfig.getInstance(this.currentAccount).clearConfig();
        MessagesController.getInstance(this.currentAccount).cleanup();
        UserConfig.getInstance(this.currentAccount).syncContacts = this.f36646y;
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
        if (z4) {
            MessagesController.getInstance(this.currentAccount).putDialogsEndReachedAfterRegistration();
        }
        MediaDataController.getInstance(this.currentAccount).loadStickersByEmojiOrName("tg_placeholders_android", false, true);
        boolean z10 = tL_auth_authorization.setup_password_required;
        int i10 = tL_auth_authorization.otherwise_relogin_days;
        if (getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(getParentActivity(), false);
        }
        e1();
        if (getParentActivity() instanceof LaunchActivity) {
            if (this.f36645x) {
                this.f36645x = false;
                this.f36636k0 = true;
                ((LaunchActivity) getParentActivity()).L0(this.currentAccount, new j3.x(3, z4));
                this.f36636k0 = false;
                finishFragment();
                return;
            }
            if (z4 && z10) {
                og1 og1Var = new og1(6, null);
                og1Var.D = i10;
                og1Var.E = true;
                presentFragment(og1Var, true);
            } else {
                Bundle i11 = android.support.v4.media.a.i("afterSignup", z4);
                vg0 vg0Var = new vg0();
                vg0Var.l0(i11);
                presentFragment(vg0Var, true);
            }
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
            n31.V(true);
        } else if (getParentActivity() instanceof ExternalActionActivity) {
            ExternalActionActivity externalActionActivity = (ExternalActionActivity) getParentActivity();
            externalActionActivity.d(externalActionActivity.h, externalActionActivity.f31593n, externalActionActivity.v, true, externalActionActivity.f31594r, externalActionActivity.f31595s);
            externalActionActivity.f31591c.X();
            ActionBarLayout actionBarLayout = externalActionActivity.d;
            if (actionBarLayout != null) {
                actionBarLayout.X();
            }
            org.telegram.ui.Components.qv0 qv0Var = externalActionActivity.e;
            if (qv0Var != null) {
                qv0Var.setVisibility(0);
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        ze0 ze0Var = (ze0) this.f36624b[5];
        if (ze0Var != null) {
            ze0Var.I.i(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (!this.f36629e0 || this.f36622a != 12) {
            int i10 = this.f36622a;
            org.telegram.ui.Components.vv0[] vv0VarArr = this.f36624b;
            if (i10 == 0 || (this.C == 3 && i10 == 12)) {
                if (z4) {
                    for (org.telegram.ui.Components.vv0 vv0Var : vv0VarArr) {
                        if (vv0Var != null) {
                            vv0Var.f();
                        }
                    }
                    e1();
                }
                return true;
            } else if (i10 == 6) {
                if (z4) {
                    vv0VarArr[i10].c(true);
                    u1(0, true, null, true);
                    return false;
                }
            } else if (i10 != 7 && i10 != 8) {
                if ((i10 < 1 || i10 > 4) && i10 != 11 && i10 != 15) {
                    if (i10 == 5) {
                        if (z4) {
                            ((ze0) vv0VarArr[i10]).f40785w.callOnClick();
                            return false;
                        }
                    } else if (i10 == 9) {
                        if (z4) {
                            vv0VarArr[i10].c(true);
                            u1(7, true, null, true);
                            return false;
                        }
                    } else if (i10 == 10) {
                        if (z4) {
                            vv0VarArr[i10].c(true);
                            u1(9, true, null, true);
                            return false;
                        }
                    } else if (i10 == 13) {
                        if (z4) {
                            vv0VarArr[i10].c(true);
                            u1(12, true, null, true);
                            return false;
                        }
                    } else if (z4 && vv0VarArr[i10].c(true)) {
                        u1(0, true, null, true);
                        return false;
                    }
                } else if (z4 && vv0VarArr[i10].c(false)) {
                    u1(0, true, null, true);
                    return false;
                }
            } else if (z4) {
                vv0VarArr[i10].c(true);
                u1(6, true, null, true);
            }
        }
        return false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        t1(this.f36624b[this.f36622a].a(), false);
        bg0 bg0Var = this.Y;
        if (bg0Var != null) {
            int i10 = bg0.B;
            bg0Var.a();
        }
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z4, Runnable runnable) {
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                if (dialog == this.h) {
                    ArrayList arrayList = this.f36642r;
                    if (!arrayList.isEmpty() && getParentActivity() != null) {
                        getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
                        return;
                    }
                }
                if (dialog == this.f36638n) {
                    ArrayList arrayList2 = this.f36643s;
                    if (!arrayList2.isEmpty() && getParentActivity() != null) {
                        AndroidUtilities.runOnUIThread(new cd0(this, 1), 200L);
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
            org.telegram.ui.Components.vv0[] vv0VarArr = this.f36624b;
            if (i10 >= vv0VarArr.length) {
                break;
            }
            org.telegram.ui.Components.vv0 vv0Var = vv0VarArr[i10];
            if (vv0Var != null) {
                vv0Var.f();
            }
            i10++;
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.O;
        if (d2Var != null) {
            d2Var.dismiss();
            this.O = null;
        }
        for (Runnable runnable : this.f36632g0) {
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
        if (this.f36645x) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(true, false);
        }
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        boolean z4;
        if (strArr.length != 0 && iArr.length != 0) {
            if (iArr[0] == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            org.telegram.ui.Components.vv0[] vv0VarArr = this.f36624b;
            if (i10 == 6) {
                this.v = false;
                int i11 = this.f36622a;
                if (i11 == 0) {
                    org.telegram.ui.Components.vv0 vv0Var = vv0VarArr[i11];
                    ((mg0) vv0Var).I = true;
                    vv0Var.h(null);
                }
            } else if (i10 == 7) {
                this.f36644w = false;
                int i12 = this.f36622a;
                if (i12 == 0) {
                    ((mg0) vv0VarArr[i12]).q();
                }
            } else if (i10 == 20) {
                if (z4) {
                    ((ze0) vv0VarArr[5]).I.m();
                }
            } else if (i10 == 151 && z4) {
                ze0 ze0Var = (ze0) vv0VarArr[5];
                ze0Var.post(new md0(ze0Var, 0));
            }
        }
    }

    @Override
    public final void onResume() {
        org.telegram.ui.Components.vv0 vv0Var;
        int i10;
        org.telegram.ui.Components.vv0[] vv0VarArr = this.f36624b;
        super.onResume();
        if (this.f36645x) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        View view = this.fragmentView;
        if (view != null) {
            view.requestLayout();
        }
        try {
            int i11 = this.f36622a;
            if (i11 >= 1 && i11 <= 4) {
                org.telegram.ui.Components.vv0 vv0Var2 = vv0VarArr[i11];
                if ((vv0Var2 instanceof rf0) && (i10 = ((rf0) vv0Var2).Q) != 0 && Math.abs((System.currentTimeMillis() / 1000) - i10) >= 86400) {
                    vv0VarArr[this.f36622a].c(true);
                    u1(0, false, null, true);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        int i12 = this.f36622a;
        if (i12 == 0 && !this.Z && (vv0Var = vv0VarArr[i12]) != null) {
            vv0Var.j();
        }
        if (h1()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
        int i13 = this.f36622a;
        if (i13 >= 0 && i13 < vv0VarArr.length) {
            vv0VarArr[i13].i();
        }
    }

    public final void p1() {
        if (this.N[this.G]) {
            if (this.S.getTag() != null) {
                if (getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f19503a.O = LocaleController.getString("StopLoadingTitle", R.string.StopLoadingTitle);
                alertDialog$Builder.f19503a.Q = LocaleController.getString("StopLoading", R.string.StopLoading);
                alertDialog$Builder.k(LocaleController.getString("WaitMore", R.string.WaitMore), null);
                alertDialog$Builder.h(LocaleController.getString("Stop", R.string.Stop), new hd0(this, 0));
                showDialog(alertDialog$Builder.f19503a);
                return;
            }
            this.f36624b[this.f36622a].h(null);
        }
    }

    public final void q1(String str, TLRPC.auth_SentCode auth_sentcode) {
        this.e = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + str);
        bundle.putString("ephone", "+" + str);
        bundle.putString("phoneFormated", str);
        g1(bundle, auth_sentcode, true);
    }

    public final void s1(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str) {
        if (!this.f36637l0) {
            return;
        }
        k1(false, true);
        this.f36637l0 = false;
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = bundle.getString("phoneFormated");
        tL_auth_resendCode.phone_code_hash = auth_sentcode.phone_code_hash;
        if (str != null) {
            tL_auth_resendCode.flags |= 1;
            tL_auth_resendCode.reason = str;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_resendCode, new sb0(1, this, bundle), 10);
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("currentViewNum", this.f36622a);
            bundle2.putInt("syncContacts", this.f36646y ? 1 : 0);
            for (int i10 = 0; i10 <= this.f36622a; i10++) {
                org.telegram.ui.Components.vv0 vv0Var = this.f36624b[i10];
                if (vv0Var != null) {
                    vv0Var.l(bundle2);
                }
            }
            Context context = ApplicationLoader.applicationContext;
            StringBuilder sb = new StringBuilder();
            sb.append("logininfo2");
            if (this.f36645x) {
                str = "_" + this.currentAccount;
            } else {
                str = "";
            }
            sb.append(str);
            SharedPreferences.Editor edit = context.getSharedPreferences(sb.toString(), 0).edit();
            edit.clear();
            r1(bundle2, edit, null);
            edit.commit();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void t1(boolean z4, boolean z10) {
        if (this.X == z4 && z10) {
            return;
        }
        this.X = z4;
        if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
            z4 = false;
        }
        if (z4) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
            if (z10) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                this.d = duration;
                duration.setInterpolator(org.telegram.ui.Components.nr.f27346f);
                this.d.addUpdateListener(new bd0(this, 0));
                this.d.addListener(new nd0(this, 0));
                this.d.start();
                return;
            }
            this.f36626c.setVisibility(0);
            return;
        }
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        if (z10) {
            ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
            this.d = duration2;
            duration2.setInterpolator(org.telegram.ui.Components.gt.e);
            this.d.addUpdateListener(new bd0(this, 1));
            this.d.addListener(new nd0(this, 1));
            this.d.start();
            return;
        }
        this.f36626c.setVisibility(8);
    }

    public final void u1(int i10, boolean z4, Bundle bundle, boolean z10) {
        boolean z11;
        int i11;
        int i12;
        if (i10 != 0 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 10 && i10 != 12 && i10 != 17 && i10 != 16) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i10 == this.f36622a) {
            z4 = false;
        }
        int i13 = 8;
        if (z11) {
            if (i10 == 0) {
                this.v = true;
                this.f36644w = true;
            }
            this.G = 1;
            v1(false, z4);
            w1(false, z4, false);
            this.G = 0;
            w1(false, z4, false);
            if (!z4) {
                v1(true, false);
            }
        } else {
            this.G = 0;
            v1(false, z4);
            w1(false, z4, false);
            if (i10 != 8) {
                this.G = 1;
            }
        }
        org.telegram.ui.Components.vv0[] vv0VarArr = this.f36624b;
        if (z4) {
            org.telegram.ui.Components.vv0 vv0Var = vv0VarArr[this.f36622a];
            org.telegram.ui.Components.vv0 vv0Var2 = vv0VarArr[i10];
            this.f36622a = i10;
            this.R.setVisibility((vv0Var2.b() || this.f36645x) ? 0 : 0);
            vv0Var2.m(bundle, false);
            setParentActivityTitle(vv0Var2.getHeaderName());
            vv0Var2.j();
            int i14 = AndroidUtilities.displaySize.x;
            if (z10) {
                i14 = -i14;
            }
            vv0Var2.setX(i14);
            vv0Var2.setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new androidx.fragment.app.g(this, z11, vv0Var, 9));
            Property property = View.TRANSLATION_X;
            if (z10) {
                i12 = AndroidUtilities.displaySize.x;
            } else {
                i12 = -AndroidUtilities.displaySize.x;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(vv0Var, property, i12), ObjectAnimator.ofFloat(vv0Var2, property, 0.0f));
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.start();
            t1(vv0Var2.a(), true);
            return;
        }
        ImageView imageView = this.R;
        if (!vv0VarArr[i10].b() && !this.f36645x) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        imageView.setVisibility(i11);
        vv0VarArr[this.f36622a].setVisibility(8);
        vv0VarArr[this.f36622a].g();
        this.f36622a = i10;
        vv0VarArr[i10].m(bundle, false);
        vv0VarArr[i10].setVisibility(0);
        setParentActivityTitle(vv0VarArr[i10].getHeaderName());
        vv0VarArr[i10].j();
        t1(vv0VarArr[i10].a(), false);
    }

    public final void v1(boolean z4, boolean z10) {
        boolean z11;
        TimeInterpolator timeInterpolator;
        int i10 = this.G;
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean[] zArr = this.N;
        if (zArr[i10] != z4) {
            AnimatorSet[] animatorSetArr = this.H;
            AnimatorSet animatorSet = animatorSetArr[i10];
            if (animatorSet != null) {
                if (z10) {
                    animatorSet.removeAllListeners();
                }
                animatorSetArr[this.G].cancel();
            }
            int i11 = this.G;
            zArr[i11] = z4;
            if (z10) {
                animatorSetArr[i11] = new AnimatorSet();
                if (z11) {
                    this.K.e(z4, z10);
                }
                animatorSetArr[this.G].addListener(new org.telegram.ui.ActionBar.g(this, z11, z4, 5));
                int i12 = 150;
                if (z11) {
                    if (z4) {
                        timeInterpolator = AndroidUtilities.decelerateInterpolator;
                        i12 = 200;
                    } else {
                        timeInterpolator = AndroidUtilities.accelerateInterpolator;
                    }
                } else {
                    timeInterpolator = null;
                }
                animatorSetArr[this.G].setDuration(i12);
                animatorSetArr[this.G].setInterpolator(timeInterpolator);
                animatorSetArr[this.G].start();
            } else if (z11) {
                this.K.e(z4, z10);
            }
        }
    }

    public final void w1(final boolean z4, final boolean z10, boolean z11) {
        boolean z12;
        float f10;
        boolean[] zArr = this.f36631f0;
        if (z10 && zArr[this.G] == z4 && !z11) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.tz(this, z4, z10, z11, 1));
            return;
        }
        final int i10 = this.G;
        if (i10 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean[] zArr2 = this.f36633h0;
        if (!z11 && !z12) {
            zArr[i10] = z4;
            if (z10) {
                boolean z13 = zArr2[i10];
                Runnable[] runnableArr = this.f36632g0;
                if (z13) {
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[i10]);
                    zArr2[this.G] = false;
                    return;
                } else if (z4) {
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            ng0 ng0Var = ng0.this;
                            int i11 = ng0Var.G;
                            ng0Var.G = i10;
                            ng0Var.w1(z4, z10, true);
                            ng0Var.G = i11;
                        }
                    };
                    runnableArr[i10] = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 2000L);
                    zArr2[this.G] = true;
                    return;
                }
            }
        } else {
            zArr2[i10] = false;
            zArr[i10] = z4;
        }
        AnimatorSet animatorSet = this.I;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z12) {
            this.K.f(z4, z10);
            return;
        }
        float f11 = 0.0f;
        if (z10) {
            this.I = new AnimatorSet();
            if (z4) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (z4) {
                f11 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
            ofFloat.addListener(new org.telegram.ui.Components.l00(23, this, z4));
            ofFloat.addUpdateListener(new bd0(this, 2));
            this.I.playTogether(ofFloat);
            this.I.setDuration(150L);
            this.I.start();
        } else if (z4) {
            this.S.setVisibility(0);
            this.S.setScaleX(1.0f);
            this.S.setScaleY(1.0f);
            this.S.setAlpha(1.0f);
        } else {
            this.S.setTag(null);
            this.S.setVisibility(4);
            this.S.setScaleX(0.1f);
            this.S.setScaleY(0.1f);
            this.S.setAlpha(0.0f);
        }
    }

    public final void x1(boolean z4, boolean z10) {
        if (z4 == this.f36640o0) {
            return;
        }
        cd0 cd0Var = this.f36641p0;
        if (cd0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(cd0Var);
            this.f36641p0 = null;
        }
        this.f36640o0 = z4;
        this.T.clearAnimation();
        float f10 = 0.0f;
        int i10 = 0;
        if (z10) {
            this.T.setVisibility(0);
            ViewPropertyAnimator animate = this.T.animate();
            if (z4) {
                f10 = 1.0f;
            }
            animate.alpha(f10).withEndAction(new org.telegram.ui.Components.kv0(5, this, z4)).start();
            return;
        }
        ImageView imageView = this.T;
        if (!z4) {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = this.T;
        if (z4) {
            f10 = 1.0f;
        }
        imageView2.setAlpha(f10);
    }

    public final void y1() {
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
        ImageView imageView = this.R;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        ImageView imageView2 = this.R;
        int i11 = org.telegram.ui.ActionBar.j6.f19996i6;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i11, false), 1, -1));
        this.U.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.T.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i11, false), 1, -1));
        RadialProgressView radialProgressView = this.S;
        int i12 = org.telegram.ui.ActionBar.j6.P9;
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.K.g();
        this.J.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.O9, false));
        this.J.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        for (org.telegram.ui.Components.vv0 vv0Var : this.f36624b) {
            vv0Var.n();
        }
        org.telegram.ui.Components.sr srVar = this.f36626c;
        srVar.f28802a.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        int i13 = 0;
        while (true) {
            View[] viewArr = srVar.f28804c;
            if (i13 >= viewArr.length) {
                break;
            }
            View view = viewArr[i13];
            if (view != null) {
                view.setBackground(org.telegram.ui.Components.sr.a(i13));
                if (view instanceof org.telegram.ui.Components.rr) {
                    org.telegram.ui.Components.rr rrVar = (org.telegram.ui.Components.rr) view;
                    rrVar.f28523a.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                    rrVar.f28524b.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
                }
            }
            i13++;
        }
        bg0 bg0Var = this.Y;
        if (bg0Var != null) {
            int i14 = bg0.B;
            bg0Var.b();
        }
    }

    public final void z1(boolean z4, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        if (this.U != null) {
            int connectionState = getConnectionsManager().getConnectionState();
            if (this.f36639n0 != connectionState || z10) {
                this.f36639n0 = connectionState;
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if (sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i10 = this.f36639n0;
                if (i10 != 3 && i10 != 5) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (i10 != 1 && i10 != 2 && i10 != 4) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z11) {
                    this.U.b(true, z12, z4);
                    x1(true, z4);
                } else if ((getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty()) || z13) {
                    this.U.b(true, z12, z4);
                    if (this.f36640o0) {
                        return;
                    }
                    cd0 cd0Var = this.f36641p0;
                    if (cd0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(cd0Var);
                    }
                    this.f36640o0 = true;
                    cd0 cd0Var2 = new cd0(this, 0);
                    this.f36641p0 = cd0Var2;
                    AndroidUtilities.runOnUIThread(cd0Var2, 5000L);
                } else {
                    x1(false, z4);
                }
            }
        }
    }

    public ng0(int i10) {
        super(null);
        this.f36624b = new org.telegram.ui.Components.vv0[19];
        this.f36642r = new ArrayList();
        this.f36643s = new ArrayList();
        this.v = true;
        this.f36644w = true;
        this.f36646y = true;
        this.B = false;
        this.C = 0;
        this.H = new AnimatorSet[2];
        this.N = new boolean[]{true, false};
        this.X = false;
        this.f36631f0 = new boolean[2];
        this.f36632g0 = new Runnable[2];
        this.f36633h0 = new boolean[2];
        this.currentAccount = i10;
        this.f36645x = true;
    }
}
