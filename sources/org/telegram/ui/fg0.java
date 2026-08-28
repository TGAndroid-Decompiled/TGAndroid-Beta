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
    public static final int f38258p0;
    public boolean A;
    public int B;
    public String C;
    public Bundle D;
    public TLRPC.TL_auth_sentCode E;
    public int F;
    public final AnimatorSet[] G;
    public AnimatorSet H;
    public org.telegram.ui.Components.j21 I;
    public org.telegram.ui.Components.j10 J;
    public org.telegram.ui.Cells.e3 K;
    public int L;
    public final boolean[] M;
    public org.telegram.ui.ActionBar.c2 N;
    public fh.x4 O;
    public uf0 P;
    public ImageView Q;
    public RadialProgressView R;
    public ImageView S;
    public org.telegram.ui.Components.rh0 T;
    public LinearLayout U;
    public m0 V;
    public boolean W;
    public tf0 X;
    public boolean Y;
    public Runnable Z;
    public int f38259a;
    public uv f38260a0;
    public final org.telegram.ui.Components.cv0[] f38261b;
    public TextView f38262b0;
    public org.telegram.ui.Components.kr f38263c;
    public boolean f38264c0;
    public ValueAnimator d;
    public boolean f38265d0;
    public boolean f38266e;
    public final boolean[] f38267e0;
    public boolean f38268f;
    public final Runnable[] f38269f0;
    public final boolean[] f38270g0;
    public Dialog h;
    public boolean f38271h0;
    public View f38272i0;
    public boolean f38273j0;
    public boolean f38274k0;
    public TLRPC.TL_help_termsOfService f38275l0;
    public int m0;
    public Dialog f38276n;
    public boolean f38277n0;
    public rc0 f38278o0;
    public final ArrayList f38279r;
    public final ArrayList f38280s;
    public boolean v;
    public boolean f38281w;
    public boolean f38282x;
    public boolean f38283y;

    static {
        int i9;
        if (SharedConfig.getDevicePerformanceClass() <= 1) {
            i9 = 150;
        } else {
            i9 = 100;
        }
        f38258p0 = i9;
    }

    public fg0() {
        super(null);
        this.f38261b = new org.telegram.ui.Components.cv0[19];
        this.f38279r = new ArrayList();
        this.f38280s = new ArrayList();
        this.v = true;
        this.f38281w = true;
        this.f38283y = true;
        this.A = false;
        this.B = 0;
        this.G = new AnimatorSet[2];
        this.M = new boolean[]{true, false};
        this.W = false;
        this.f38267e0 = new boolean[2];
        this.f38269f0 = new Runnable[2];
        this.f38270g0 = new boolean[2];
    }

    public static void T(fg0 fg0Var, TLRPC.TL_error tL_error, String str, String str2, String str3) {
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

    public static boolean T0(fg0 fg0Var, View view) {
        if (!fg0Var.h1()) {
            return AndroidUtilities.showKeyboard(view);
        }
        return true;
    }

    public static void U(fg0 fg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10, w7.d dVar) {
        String str2;
        w7.e eVar = ((l7.d) ((com.google.android.gms.common.api.q) dVar.f108a)).f16693b;
        if (eVar == null) {
            str2 = null;
        } else {
            str2 = eVar.f48774a;
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
                            ConnectionsManager.getInstance(fg0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new vc0(1, bundle, auth_sentcode, fg0Var, z10), 10);
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

    public static void U0(fg0 fg0Var, View view, boolean z10) {
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(view, 3.5f);
        if (z10 && (view instanceof org.telegram.ui.Components.fc0)) {
            Runnable runnable = (Runnable) view.getTag(R.id.timeout_callback);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
            org.telegram.ui.Components.fc0 fc0Var = (org.telegram.ui.Components.fc0) view;
            AtomicReference atomicReference = new AtomicReference();
            EditText attachedEditText = fc0Var.getAttachedEditText();
            fh.t4 t4Var = new fh.t4(8, attachedEditText, atomicReference);
            fc0Var.a(1.0f);
            org.telegram.ui.Components.no0 no0Var = new org.telegram.ui.Components.no0(fc0Var, view, attachedEditText, t4Var, 16);
            atomicReference.set(no0Var);
            view.postDelayed(no0Var, 2000L);
            view.setTag(R.id.timeout_callback, no0Var);
            if (attachedEditText != null) {
                attachedEditText.addTextChangedListener(t4Var);
            }
        }
    }

    public static void V(fg0 fg0Var, String str, String str2, String str3) {
        fg0Var.n1(0, true);
        TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
        deleteaccount.reason = "Forgot password";
        ConnectionsManager.getInstance(fg0Var.currentAccount).sendRequest(deleteaccount, new fh.h1(fg0Var, str, str2, str3, 14), 10);
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
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 22) {
                SubscriptionManager from = SubscriptionManager.from(fg0Var.getParentActivity());
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
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        String number = list.get(i10).getNumber();
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

    public static void W(fg0 fg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10, IntegrityTokenResponse integrityTokenResponse) {
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
        ConnectionsManager.getInstance(fg0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new vc0(0, bundle, auth_sentcode, fg0Var, z10), 10);
    }

    public static int W0(fg0 fg0Var) {
        return fg0Var.currentAccount;
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
            StringBuilder n10 = e2.c.n(simpleName);
            n10.append(exc.getMessage());
            simpleName = n10.toString();
        }
        return simpleName.toUpperCase().replaceAll(" ", "_");
    }

    public static Bundle j1(int i9, boolean z10) {
        String str;
        try {
            Bundle bundle = new Bundle();
            Context context = ApplicationLoader.applicationContext;
            StringBuilder sb2 = new StringBuilder("logininfo2");
            if (z10) {
                str = "_" + i9;
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

    public static void m0(fg0 fg0Var, String str, String str2, String str3) {
        if (fg0Var.R.getTag() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
        alertDialog$Builder.f22702a.P = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
        alertDialog$Builder.f22702a.N = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
        alertDialog$Builder.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new a1.d(fg0Var, str, str2, str3, 15));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        fg0Var.showDialog(alertDialog$Builder.f22702a);
    }

    public static void m1(org.telegram.ui.ActionBar.o2 o2Var, String str, j4.c cVar, boolean z10) {
        List list;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity());
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            if (z10) {
                c2Var.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                c2Var.P = LocaleController.getString("BannedPhoneNumber", R.string.BannedPhoneNumber);
            } else if (cVar != null && (list = (List) cVar.f13432c) != null && !list.isEmpty() && ((lt) cVar.f13431b) != null) {
                int i9 = Integer.MAX_VALUE;
                for (String str2 : (List) cVar.f13432c) {
                    int length = str2.replace(" ", "").length();
                    if (length < i9) {
                        i9 = length;
                    }
                }
                if (ne.b.d(str, false).length() - ((lt) cVar.f13431b).f40227c.length() < i9) {
                    c2Var.N = LocaleController.getString(R.string.WrongNumberFormat);
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("ShortNumberInfo", R.string.ShortNumberInfo, ((lt) cVar.f13431b).f40225a, (String) cVar.d));
                } else {
                    c2Var.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    c2Var.P = LocaleController.getString(R.string.InvalidPhoneNumber);
                }
            } else {
                c2Var.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                c2Var.P = LocaleController.getString(R.string.InvalidPhoneNumber);
            }
            alertDialog$Builder.i(LocaleController.getString("BotHelp", R.string.BotHelp), new b5.e(str, o2Var, z10));
            alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
            o2Var.showDialog(c2Var);
        }
    }

    public static void r1(Bundle bundle, SharedPreferences.Editor editor, String str) {
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof String) {
                if (str != null) {
                    editor.putString(aa.d.z(str, "_|_", str2), (String) obj);
                } else {
                    editor.putString(str2, (String) obj);
                }
            } else if (obj instanceof Integer) {
                if (str != null) {
                    editor.putInt(aa.d.z(str, "_|_", str2), ((Integer) obj).intValue());
                } else {
                    editor.putInt(str2, ((Integer) obj).intValue());
                }
            } else if (obj instanceof Boolean) {
                if (str != null) {
                    editor.putBoolean(aa.d.z(str, "_|_", str2), ((Boolean) obj).booleanValue());
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
            if (this.f38273j0) {
                this.f38272i0 = this.fragmentView;
            }
            this.fragmentView = null;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && !this.f38273j0) {
            ViewGroup viewGroup2 = (ViewGroup) kVar.getParent();
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
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.didUpdateConnectionState) {
            z1(true, false);
        } else if (i9 == NotificationCenter.newSuggestionsAvailable && this.f38265d0 && !getMessagesController().hasSetupEmailSuggestion()) {
            finishFragment();
        }
    }

    public final void e1() {
        String str;
        Context context = ApplicationLoader.applicationContext;
        StringBuilder sb2 = new StringBuilder("logininfo2");
        if (this.f38282x) {
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
        int i9;
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
        if ((auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms) && !auth_sentcodetype.verifiedFirebase && !this.f38274k0) {
            if (PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                TLRPC.TL_auth_sentCodeTypeFirebaseSms tL_auth_sentCodeTypeFirebaseSms = (TLRPC.TL_auth_sentCodeTypeFirebaseSms) auth_sentcode.type;
                n1(0, true);
                this.f38274k0 = true;
                String string = bundle.getString("phoneFormated");
                if (tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce != null) {
                    IntegrityManager create = IntegrityManagerFactory.create(getParentActivity());
                    String str = new String(Base64.encode(tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce, 8));
                    FileLog.d("getting classic integrity with nonce = ".concat(str));
                    create.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).setCloudProjectNumber(tL_auth_sentCodeTypeFirebaseSms.play_integrity_project_id).build()).addOnSuccessListener(new sc0(this, bundle, auth_sentcode, string, z10)).addOnFailureListener(new OnFailureListener(this) {
                        public final fg0 f42949b;

                        {
                            this.f42949b = this;
                        }

                        @Override
                        public final void onFailure(Exception exc) {
                            switch (r4) {
                                case 0:
                                    String str2 = "PLAYINTEGRITY_EXCEPTION_" + fg0.f1(exc);
                                    FileLog.e("{" + str2 + "} Resend firebase sms because integrity threw error", exc);
                                    this.f42949b.s1(bundle, auth_sentcode, str2);
                                    return;
                                default:
                                    FileLog.e(exc);
                                    String str3 = "SAFETYNET_EXCEPTION_" + fg0.f1(exc);
                                    FileLog.d("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                    this.f42949b.s1(bundle, auth_sentcode, str3);
                                    return;
                            }
                        }
                    });
                    return;
                }
                com.google.android.gms.common.api.j jVar = new com.google.android.gms.common.api.j(ApplicationLoader.applicationContext, w7.c.f48773a, (com.google.android.gms.common.api.a) null, (com.google.android.gms.common.api.internal.t) new Object());
                byte[] bArr = auth_sentcode.type.nonce;
                String str2 = BuildVars.SAFETYNET_KEY;
                com.google.android.gms.common.api.internal.t0 t0Var = jVar.h;
                i8.j0 j0Var = new i8.j0(t0Var, bArr, str2);
                t0Var.f2908b.d(0, j0Var);
                x5.l.n(j0Var, new x5.m(new Object())).addOnSuccessListener(new sc0(this, string, auth_sentcode, bundle, z10)).addOnFailureListener(new OnFailureListener(this) {
                    public final fg0 f42949b;

                    {
                        this.f42949b = this;
                    }

                    @Override
                    public final void onFailure(Exception exc) {
                        switch (r4) {
                            case 0:
                                String str22 = "PLAYINTEGRITY_EXCEPTION_" + fg0.f1(exc);
                                FileLog.e("{" + str22 + "} Resend firebase sms because integrity threw error", exc);
                                this.f42949b.s1(bundle, auth_sentcode, str22);
                                return;
                            default:
                                FileLog.e(exc);
                                String str3 = "SAFETYNET_EXCEPTION_" + fg0.f1(exc);
                                FileLog.d("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                this.f42949b.s1(bundle, auth_sentcode, str3);
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
                i9 = 5;
            } else {
                i9 = 60;
            }
            auth_sentcode.timeout = i9;
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
        return g7.h6.a(new e(this, 22), org.telegram.ui.ActionBar.f6.G6, org.telegram.ui.ActionBar.f6.D6, org.telegram.ui.ActionBar.f6.H6, org.telegram.ui.ActionBar.f6.f23092i6, org.telegram.ui.ActionBar.f6.P9, org.telegram.ui.ActionBar.f6.O9, org.telegram.ui.ActionBar.f6.f23127k6, org.telegram.ui.ActionBar.f6.f23144l6, org.telegram.ui.ActionBar.f6.I6, org.telegram.ui.ActionBar.f6.f23230q7, org.telegram.ui.ActionBar.f6.f23369y6, org.telegram.ui.ActionBar.f6.f23093i7, org.telegram.ui.ActionBar.f6.f23229q6, org.telegram.ui.ActionBar.f6.Wh, org.telegram.ui.ActionBar.f6.Q9, org.telegram.ui.ActionBar.f6.f23212p7, org.telegram.ui.ActionBar.f6.J6, org.telegram.ui.ActionBar.f6.Y6, org.telegram.ui.ActionBar.f6.W6, org.telegram.ui.ActionBar.f6.X6, org.telegram.ui.ActionBar.f6.f23072h5, org.telegram.ui.ActionBar.f6.f23228q5, org.telegram.ui.ActionBar.f6.f23108j5);
    }

    public final boolean h1() {
        if (this.f38261b[this.f38259a].a() && !AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
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
        if (i0.a.f(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.f38265d0;
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
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            c2Var.N = str;
            c2Var.P = str2;
            alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
            showDialog(alertDialog$Builder.f22702a);
        }
    }

    public final void n1(int i9, boolean z10) {
        if (i1() && i9 == 0) {
            if (this.N == null && getParentActivity() != null && !getParentActivity().isFinishing()) {
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
                this.N = c2Var;
                c2Var.f22766c0 = false;
                c2Var.show();
                return;
            }
            return;
        }
        this.L = i9;
        w1(true, z10, false);
    }

    public final void o1(TLRPC.TL_auth_authorization tL_auth_authorization, boolean z10) {
        MessagesController.getInstance(this.currentAccount).cleanup();
        ConnectionsManager.getInstance(this.currentAccount).setUserId(tL_auth_authorization.user.f22527id);
        UserConfig.getInstance(this.currentAccount).clearConfig();
        MessagesController.getInstance(this.currentAccount).cleanup();
        UserConfig.getInstance(this.currentAccount).syncContacts = this.f38283y;
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
        int i9 = tL_auth_authorization.otherwise_relogin_days;
        if (getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(getParentActivity(), false);
        }
        e1();
        if (getParentActivity() instanceof LaunchActivity) {
            if (this.f38282x) {
                this.f38282x = false;
                this.f38273j0 = true;
                ((LaunchActivity) getParentActivity()).L0(this.currentAccount, new h3.t(3, z10));
                this.f38273j0 = false;
                finishFragment();
                return;
            }
            if (z10 && z11) {
                ag1 ag1Var = new ag1(6, null);
                ag1Var.C = i9;
                ag1Var.D = true;
                presentFragment(ag1Var, true);
            } else {
                Bundle i10 = aa.d.i("afterSignup", z10);
                ng0 ng0Var = new ng0();
                ng0Var.k0(i10);
                presentFragment(ng0Var, true);
            }
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
            b31.U(true);
        } else if (getParentActivity() instanceof ExternalActionActivity) {
            ExternalActionActivity externalActionActivity = (ExternalActionActivity) getParentActivity();
            externalActionActivity.d(externalActionActivity.h, externalActionActivity.f35472n, externalActionActivity.v, true, externalActionActivity.f35473r, externalActionActivity.f35474s);
            externalActionActivity.f35469c.X();
            ActionBarLayout actionBarLayout = externalActionActivity.d;
            if (actionBarLayout != null) {
                actionBarLayout.X();
            }
            org.telegram.ui.Components.xu0 xu0Var = externalActionActivity.f35470e;
            if (xu0Var != null) {
                xu0Var.setVisibility(0);
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int i9, int i10, Intent intent) {
        qe0 qe0Var = (qe0) this.f38261b[5];
        if (qe0Var != null) {
            qe0Var.H.i(i9, i10, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f38265d0 || this.f38259a != 12) {
            int i9 = this.f38259a;
            org.telegram.ui.Components.cv0[] cv0VarArr = this.f38261b;
            if (i9 == 0 || (this.B == 3 && i9 == 12)) {
                if (z10) {
                    for (org.telegram.ui.Components.cv0 cv0Var : cv0VarArr) {
                        if (cv0Var != null) {
                            cv0Var.f();
                        }
                    }
                    e1();
                }
                return true;
            } else if (i9 == 6) {
                if (z10) {
                    cv0VarArr[i9].c(true);
                    u1(0, true, null, true);
                    return false;
                }
            } else if (i9 != 7 && i9 != 8) {
                if ((i9 < 1 || i9 > 4) && i9 != 11 && i9 != 15) {
                    if (i9 == 5) {
                        if (z10) {
                            ((qe0) cv0VarArr[i9]).f41779w.callOnClick();
                            return false;
                        }
                    } else if (i9 == 9) {
                        if (z10) {
                            cv0VarArr[i9].c(true);
                            u1(7, true, null, true);
                            return false;
                        }
                    } else if (i9 == 10) {
                        if (z10) {
                            cv0VarArr[i9].c(true);
                            u1(9, true, null, true);
                            return false;
                        }
                    } else if (i9 == 13) {
                        if (z10) {
                            cv0VarArr[i9].c(true);
                            u1(12, true, null, true);
                            return false;
                        }
                    } else if (z10 && cv0VarArr[i9].c(true)) {
                        u1(0, true, null, true);
                        return false;
                    }
                } else if (z10 && cv0VarArr[i9].c(false)) {
                    u1(0, true, null, true);
                    return false;
                }
            } else if (z10) {
                cv0VarArr[i9].c(true);
                u1(6, true, null, true);
            }
        }
        return false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        t1(this.f38261b[this.f38259a].a(), false);
        tf0 tf0Var = this.X;
        if (tf0Var != null) {
            int i9 = tf0.A;
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
                    ArrayList arrayList = this.f38279r;
                    if (!arrayList.isEmpty() && getParentActivity() != null) {
                        getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
                        return;
                    }
                }
                if (dialog == this.f38276n) {
                    ArrayList arrayList2 = this.f38280s;
                    if (!arrayList2.isEmpty() && getParentActivity() != null) {
                        AndroidUtilities.runOnUIThread(new rc0(this, 1), 200L);
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
        int i9 = 0;
        while (true) {
            org.telegram.ui.Components.cv0[] cv0VarArr = this.f38261b;
            if (i9 >= cv0VarArr.length) {
                break;
            }
            org.telegram.ui.Components.cv0 cv0Var = cv0VarArr[i9];
            if (cv0Var != null) {
                cv0Var.f();
            }
            i9++;
        }
        org.telegram.ui.ActionBar.c2 c2Var = this.N;
        if (c2Var != null) {
            c2Var.dismiss();
            this.N = null;
        }
        for (Runnable runnable : this.f38269f0) {
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
        if (this.f38282x) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(true, false);
        }
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i9, String[] strArr, int[] iArr) {
        boolean z10;
        if (strArr.length != 0 && iArr.length != 0) {
            if (iArr[0] == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.cv0[] cv0VarArr = this.f38261b;
            if (i9 == 6) {
                this.v = false;
                int i10 = this.f38259a;
                if (i10 == 0) {
                    org.telegram.ui.Components.cv0 cv0Var = cv0VarArr[i10];
                    ((eg0) cv0Var).H = true;
                    cv0Var.h(null);
                }
            } else if (i9 == 7) {
                this.f38281w = false;
                int i11 = this.f38259a;
                if (i11 == 0) {
                    ((eg0) cv0VarArr[i11]).q();
                }
            } else if (i9 == 20) {
                if (z10) {
                    ((qe0) cv0VarArr[5]).H.m();
                }
            } else if (i9 == 151 && z10) {
                qe0 qe0Var = (qe0) cv0VarArr[5];
                qe0Var.post(new bd0(qe0Var, 0));
            }
        }
    }

    @Override
    public final void onResume() {
        org.telegram.ui.Components.cv0 cv0Var;
        int i9;
        org.telegram.ui.Components.cv0[] cv0VarArr = this.f38261b;
        super.onResume();
        if (this.f38282x) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        View view = this.fragmentView;
        if (view != null) {
            view.requestLayout();
        }
        try {
            int i10 = this.f38259a;
            if (i10 >= 1 && i10 <= 4) {
                org.telegram.ui.Components.cv0 cv0Var2 = cv0VarArr[i10];
                if ((cv0Var2 instanceof jf0) && (i9 = ((jf0) cv0Var2).P) != 0 && Math.abs((System.currentTimeMillis() / 1000) - i9) >= 86400) {
                    cv0VarArr[this.f38259a].c(true);
                    u1(0, false, null, true);
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        int i11 = this.f38259a;
        if (i11 == 0 && !this.Y && (cv0Var = cv0VarArr[i11]) != null) {
            cv0Var.j();
        }
        if (h1()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
        int i12 = this.f38259a;
        if (i12 >= 0 && i12 < cv0VarArr.length) {
            cv0VarArr[i12].i();
        }
    }

    public final void p1() {
        if (this.M[this.F]) {
            if (this.R.getTag() != null) {
                if (getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22702a.N = LocaleController.getString("StopLoadingTitle", R.string.StopLoadingTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString("StopLoading", R.string.StopLoading);
                alertDialog$Builder.k(LocaleController.getString("WaitMore", R.string.WaitMore), null);
                alertDialog$Builder.h(LocaleController.getString("Stop", R.string.Stop), new wc0(this, 0));
                showDialog(alertDialog$Builder.f22702a);
                return;
            }
            this.f38261b[this.f38259a].h(null);
        }
    }

    public final void q1(String str, TLRPC.auth_SentCode auth_sentcode) {
        this.f38266e = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + str);
        bundle.putString("ephone", "+" + str);
        bundle.putString("phoneFormated", str);
        g1(bundle, auth_sentcode, true);
    }

    public final void s1(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str) {
        if (!this.f38274k0) {
            return;
        }
        k1(false, true);
        this.f38274k0 = false;
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = bundle.getString("phoneFormated");
        tL_auth_resendCode.phone_code_hash = auth_sentcode.phone_code_hash;
        if (str != null) {
            tL_auth_resendCode.flags |= 1;
            tL_auth_resendCode.reason = str;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_resendCode, new v40(8, this, bundle), 10);
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("currentViewNum", this.f38259a);
            bundle2.putInt("syncContacts", this.f38283y ? 1 : 0);
            for (int i9 = 0; i9 <= this.f38259a; i9++) {
                org.telegram.ui.Components.cv0 cv0Var = this.f38261b[i9];
                if (cv0Var != null) {
                    cv0Var.l(bundle2);
                }
            }
            Context context = ApplicationLoader.applicationContext;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("logininfo2");
            if (this.f38282x) {
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
                duration.setInterpolator(org.telegram.ui.Components.gr.f28844f);
                this.d.addUpdateListener(new qc0(this, 0));
                this.d.addListener(new dd0(this, 0));
                this.d.start();
                return;
            }
            this.f38263c.setVisibility(0);
            return;
        }
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        if (z11) {
            ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
            this.d = duration2;
            duration2.setInterpolator(org.telegram.ui.Components.xs.f34754e);
            this.d.addUpdateListener(new qc0(this, 1));
            this.d.addListener(new dd0(this, 1));
            this.d.start();
            return;
        }
        this.f38263c.setVisibility(8);
    }

    public final void u1(int i9, boolean z10, Bundle bundle, boolean z11) {
        boolean z12;
        int i10;
        int i11;
        if (i9 != 0 && i9 != 5 && i9 != 6 && i9 != 9 && i9 != 10 && i9 != 12 && i9 != 17 && i9 != 16) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (i9 == this.f38259a) {
            z10 = false;
        }
        int i12 = 8;
        if (z12) {
            if (i9 == 0) {
                this.v = true;
                this.f38281w = true;
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
            if (i9 != 8) {
                this.F = 1;
            }
        }
        org.telegram.ui.Components.cv0[] cv0VarArr = this.f38261b;
        if (z10) {
            org.telegram.ui.Components.cv0 cv0Var = cv0VarArr[this.f38259a];
            org.telegram.ui.Components.cv0 cv0Var2 = cv0VarArr[i9];
            this.f38259a = i9;
            this.Q.setVisibility((cv0Var2.b() || this.f38282x) ? 0 : 0);
            cv0Var2.m(bundle, false);
            setParentActivityTitle(cv0Var2.getHeaderName());
            cv0Var2.j();
            int i13 = AndroidUtilities.displaySize.x;
            if (z11) {
                i13 = -i13;
            }
            cv0Var2.setX(i13);
            cv0Var2.setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new androidx.fragment.app.g(this, z12, cv0Var, 9));
            Property property = View.TRANSLATION_X;
            if (z11) {
                i11 = AndroidUtilities.displaySize.x;
            } else {
                i11 = -AndroidUtilities.displaySize.x;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(cv0Var, property, i11), ObjectAnimator.ofFloat(cv0Var2, property, 0.0f));
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.start();
            t1(cv0Var2.a(), true);
            return;
        }
        ImageView imageView = this.Q;
        if (!cv0VarArr[i9].b() && !this.f38282x) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        imageView.setVisibility(i10);
        cv0VarArr[this.f38259a].setVisibility(8);
        cv0VarArr[this.f38259a].g();
        this.f38259a = i9;
        cv0VarArr[i9].m(bundle, false);
        cv0VarArr[i9].setVisibility(0);
        setParentActivityTitle(cv0VarArr[i9].getHeaderName());
        cv0VarArr[i9].j();
        t1(cv0VarArr[i9].a(), false);
    }

    public final void v1(boolean z10, boolean z11) {
        boolean z12;
        TimeInterpolator timeInterpolator;
        int i9 = this.F;
        if (i9 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean[] zArr = this.M;
        if (zArr[i9] != z10) {
            AnimatorSet[] animatorSetArr = this.G;
            AnimatorSet animatorSet = animatorSetArr[i9];
            if (animatorSet != null) {
                if (z11) {
                    animatorSet.removeAllListeners();
                }
                animatorSetArr[this.F].cancel();
            }
            int i10 = this.F;
            zArr[i10] = z10;
            if (z11) {
                animatorSetArr[i10] = new AnimatorSet();
                if (z12) {
                    this.J.e(z10, z11);
                }
                animatorSetArr[this.F].addListener(new org.telegram.ui.ActionBar.g(this, z12, z10, 5));
                int i11 = 150;
                if (z12) {
                    if (z10) {
                        timeInterpolator = AndroidUtilities.decelerateInterpolator;
                        i11 = 200;
                    } else {
                        timeInterpolator = AndroidUtilities.accelerateInterpolator;
                    }
                } else {
                    timeInterpolator = null;
                }
                animatorSetArr[this.F].setDuration(i11);
                animatorSetArr[this.F].setInterpolator(timeInterpolator);
                animatorSetArr[this.F].start();
            } else if (z12) {
                this.J.e(z10, z11);
            }
        }
    }

    public final void w1(final boolean z10, final boolean z11, boolean z12) {
        boolean z13;
        float f10;
        boolean[] zArr = this.f38267e0;
        if (z11 && zArr[this.F] == z10 && !z12) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fz(this, z10, z11, z12, 1));
            return;
        }
        final int i9 = this.F;
        if (i9 == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        boolean[] zArr2 = this.f38270g0;
        if (!z12 && !z13) {
            zArr[i9] = z10;
            if (z11) {
                boolean z14 = zArr2[i9];
                Runnable[] runnableArr = this.f38269f0;
                if (z14) {
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[i9]);
                    zArr2[this.F] = false;
                    return;
                } else if (z10) {
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            fg0 fg0Var = fg0.this;
                            int i10 = fg0Var.F;
                            fg0Var.F = i9;
                            fg0Var.w1(z10, z11, true);
                            fg0Var.F = i10;
                        }
                    };
                    runnableArr[i9] = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 2000L);
                    zArr2[this.F] = true;
                    return;
                }
            }
        } else {
            zArr2[i9] = false;
            zArr[i9] = z10;
        }
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z13) {
            this.J.f(z10, z11);
            return;
        }
        float f11 = 0.0f;
        if (z11) {
            this.H = new AnimatorSet();
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (z10) {
                f11 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
            ofFloat.addListener(new n60(1, this, z10));
            ofFloat.addUpdateListener(new qc0(this, 2));
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
        if (z10 == this.f38277n0) {
            return;
        }
        rc0 rc0Var = this.f38278o0;
        if (rc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(rc0Var);
            this.f38278o0 = null;
        }
        this.f38277n0 = z10;
        this.S.clearAnimation();
        float f10 = 0.0f;
        int i9 = 0;
        if (z11) {
            this.S.setVisibility(0);
            ViewPropertyAnimator animate = this.S.animate();
            if (z10) {
                f10 = 1.0f;
            }
            animate.alpha(f10).withEndAction(new org.telegram.ui.Components.a50(11, this, z10)).start();
            return;
        }
        ImageView imageView = this.S;
        if (!z10) {
            i9 = 8;
        }
        imageView.setVisibility(i9);
        ImageView imageView2 = this.S;
        if (z10) {
            f10 = 1.0f;
        }
        imageView2.setAlpha(f10);
    }

    public final void y1() {
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        ImageView imageView = this.Q;
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        imageView.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        ImageView imageView2 = this.Q;
        int i10 = org.telegram.ui.ActionBar.f6.f23092i6;
        imageView2.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i10, false), 1, -1));
        this.T.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i9, false), PorterDuff.Mode.SRC_IN));
        this.S.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i10, false), 1, -1));
        RadialProgressView radialProgressView = this.R;
        int i11 = org.telegram.ui.ActionBar.f6.P9;
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        this.J.g();
        this.I.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.O9, false));
        this.I.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        for (org.telegram.ui.Components.cv0 cv0Var : this.f38261b) {
            cv0Var.n();
        }
        org.telegram.ui.Components.kr krVar = this.f38263c;
        krVar.f30226a.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        int i12 = 0;
        while (true) {
            View[] viewArr = krVar.f30228c;
            if (i12 >= viewArr.length) {
                break;
            }
            View view = viewArr[i12];
            if (view != null) {
                view.setBackground(org.telegram.ui.Components.kr.a(i12));
                if (view instanceof org.telegram.ui.Components.jr) {
                    org.telegram.ui.Components.jr jrVar = (org.telegram.ui.Components.jr) view;
                    jrVar.f29828a.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
                    jrVar.f29829b.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.H6, false));
                }
            }
            i12++;
        }
        tf0 tf0Var = this.X;
        if (tf0Var != null) {
            int i13 = tf0.A;
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
                int i9 = this.m0;
                if (i9 != 3 && i9 != 5) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (i9 != 1 && i9 != 2 && i9 != 4) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if (z12) {
                    this.T.b(true, z13, z10);
                    x1(true, z10);
                } else if ((getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty()) || z14) {
                    this.T.b(true, z13, z10);
                    if (this.f38277n0) {
                        return;
                    }
                    rc0 rc0Var = this.f38278o0;
                    if (rc0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(rc0Var);
                    }
                    this.f38277n0 = true;
                    rc0 rc0Var2 = new rc0(this, 0);
                    this.f38278o0 = rc0Var2;
                    AndroidUtilities.runOnUIThread(rc0Var2, 5000L);
                } else {
                    x1(false, z10);
                }
            }
        }
    }

    public fg0(int i9) {
        super(null);
        this.f38261b = new org.telegram.ui.Components.cv0[19];
        this.f38279r = new ArrayList();
        this.f38280s = new ArrayList();
        this.v = true;
        this.f38281w = true;
        this.f38283y = true;
        this.A = false;
        this.B = 0;
        this.G = new AnimatorSet[2];
        this.M = new boolean[]{true, false};
        this.W = false;
        this.f38267e0 = new boolean[2];
        this.f38269f0 = new Runnable[2];
        this.f38270g0 = new boolean[2];
        this.currentAccount = i9;
        this.f38282x = true;
    }
}
