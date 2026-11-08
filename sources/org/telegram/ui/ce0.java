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
import android.graphics.drawable.Drawable;
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
import org.telegram.messenger.BackupAgent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgressView;
public final class ce0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public static final int f44760y0;
    public boolean D;
    public boolean E;
    public int F;
    public String G;
    public Bundle H;
    public TLRPC.TL_auth_sentCode I;
    public int J;
    public final AnimatorSet[] K;
    public AnimatorSet L;
    public org.telegram.ui.Components.t11 M;
    public org.telegram.ui.Components.q00 N;
    public h6.m O;
    public int P;
    public final boolean[] Q;
    public org.telegram.ui.ActionBar.u1 R;
    public v8 S;
    public qd0 T;
    public ImageView U;
    public RadialProgressView V;
    public ImageView W;
    public org.telegram.ui.Components.ig0 X;
    public LinearLayout Y;
    public k0 Z;
    public int f44761a;
    public boolean f44762a0;
    public final org.telegram.ui.Components.wt0[] f44763b;
    public pd0 f44764b0;
    public org.telegram.ui.Components.br f44765c;
    public boolean f44766c0;
    public ValueAnimator d;
    public Runnable f44767d0;
    public boolean f44768e;
    public cu f44769e0;
    public boolean f44770f;
    public TextView f44771f0;
    public boolean f44772g0;
    public Dialog h;
    public boolean f44773h0;
    public final boolean[] f44774i0;
    public final Runnable[] f44775j0;
    public final boolean[] f44776k0;
    public boolean f44777l0;
    public View m0;
    public Dialog f44778n;
    public boolean f44779n0;
    public rp f44780o0;
    public boolean f44781p0;
    public TLRPC.TL_help_termsOfService f44782q0;
    public final ArrayList f44783r;
    public int f44784r0;
    public final ArrayList f44785s;
    public int f44786s0;
    public int f44787t0;
    public int f44788u0;
    public int f44789v0;
    public boolean f44790w;
    public boolean f44791w0;
    public boolean f44792x;
    public qa0 f44793x0;
    public boolean f44794y;

    static {
        int i7;
        if (org.telegram.messenger.iz.o() <= 1) {
            i7 = 150;
        } else {
            i7 = 100;
        }
        f44760y0 = i7;
    }

    public ce0() {
        super(null);
        this.f44763b = new org.telegram.ui.Components.wt0[19];
        this.f44783r = new ArrayList();
        this.f44785s = new ArrayList();
        this.f44790w = true;
        this.f44792x = true;
        this.D = true;
        this.E = false;
        this.F = 0;
        this.K = new AnimatorSet[2];
        this.Q = new boolean[]{true, false};
        this.f44762a0 = false;
        this.f44774i0 = new boolean[2];
        this.f44775j0 = new Runnable[2];
        this.f44776k0 = new boolean[2];
    }

    public static Bundle B1(int i7, boolean z9) {
        String str;
        try {
            Bundle bundle = new Bundle();
            Context context = org.telegram.messenger.t0.f25566b;
            StringBuilder sb2 = new StringBuilder("logininfo2");
            if (z9) {
                str = "_" + i7;
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
            org.telegram.messenger.a8.g(e10, true);
            return null;
        }
    }

    public static void E1(org.telegram.ui.ActionBar.f2 f2Var, String str, h6.m mVar, boolean z9) {
        List list;
        if (f2Var != null && f2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f2Var.getParentActivity());
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            if (z9) {
                u1Var.R = org.telegram.messenger.id.M0(2131746074, null);
                u1Var.T = org.telegram.messenger.id.M0(2131753725, "BannedPhoneNumber");
            } else if (mVar != null && (list = (List) mVar.f14265c) != null && !list.isEmpty() && ((ms) mVar.f14264b) != null) {
                int i7 = Integer.MAX_VALUE;
                for (String str2 : (List) mVar.f14265c) {
                    int length = str2.replace(" ", "").length();
                    if (length < i7) {
                        i7 = length;
                    }
                }
                if (pf.b.d(str, false).length() - ((ms) mVar.f14264b).f47871c.length() < i7) {
                    u1Var.R = org.telegram.messenger.id.M0(2131742860, null);
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("ShortNumberInfo", null, 2131745359, ((ms) mVar.f14264b).f47869a, (String) mVar.d));
                } else {
                    u1Var.R = org.telegram.messenger.id.M0(2131746074, null);
                    u1Var.T = org.telegram.messenger.id.M0(2131749180, null);
                }
            } else {
                u1Var.R = org.telegram.messenger.id.M0(2131746074, null);
                u1Var.T = org.telegram.messenger.id.M0(2131749180, null);
            }
            alertDialog$Builder.i(org.telegram.messenger.id.M0(2131753061, "BotHelp"), new ab.j(str, f2Var, z9));
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, "OK"), null);
            f2Var.showDialog(u1Var);
        }
    }

    public static void J1(Bundle bundle, SharedPreferences.Editor editor, String str) {
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof String) {
                if (str != null) {
                    editor.putString(a8.p0.D(str, "_|_", str2), (String) obj);
                } else {
                    editor.putString(str2, (String) obj);
                }
            } else if (obj instanceof Integer) {
                if (str != null) {
                    editor.putInt(a8.p0.D(str, "_|_", str2), ((Integer) obj).intValue());
                } else {
                    editor.putInt(str2, ((Integer) obj).intValue());
                }
            } else if (obj instanceof Boolean) {
                if (str != null) {
                    editor.putBoolean(a8.p0.D(str, "_|_", str2), ((Boolean) obj).booleanValue());
                } else {
                    editor.putBoolean(str2, ((Boolean) obj).booleanValue());
                }
            } else if (obj instanceof Bundle) {
                J1((Bundle) obj, editor, str2);
            }
        }
    }

    public static void Z(ce0 ce0Var, String str, String str2, String str3) {
        ce0Var.F1(0, true);
        TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
        deleteaccount.reason = "Forgot password";
        ConnectionsManager.getInstance(ce0Var.currentAccount).sendRequest(deleteaccount, new bi.g2(ce0Var, str, str2, str3, 13), 10);
    }

    public static void a0(ce0 ce0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z9, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            org.telegram.messenger.a8.b("Resend firebase sms because integrity token = null");
            ce0Var.K1(bundle, auth_sentcode, "PLAYINTEGRITY_TOKEN_NULL");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.play_integrity_token = str2;
        tL_auth_requestFirebaseSms.flags |= 4;
        ConnectionsManager.getInstance(ce0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new wa0(1, bundle, auth_sentcode, ce0Var, z9), 10);
    }

    public static void b0(ce0 ce0Var, TLRPC.TL_error tL_error, String str, String str2, String str3) {
        ce0Var.C1(false, true);
        if (tL_error == null) {
            if (str != null && str2 != null && str3 != null) {
                Bundle bundle = new Bundle();
                bundle.putString("phoneFormated", str);
                bundle.putString("phoneHash", str2);
                bundle.putString("code", str3);
                ce0Var.M1(5, true, bundle, false);
                return;
            }
            ce0Var.M1(0, true, null, true);
        } else if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
            ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131746118, "ResetAccountCancelledAlert"));
        } else if (tL_error.text.startsWith("2FA_CONFIRM_WAIT_")) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("phoneFormated", str);
            bundle2.putString("phoneHash", str2);
            bundle2.putString("code", str3);
            bundle2.putInt("startTime", ConnectionsManager.getInstance(ce0Var.currentAccount).getCurrentTime());
            bundle2.putInt("waitTime", Utilities.z(tL_error.text.replace("2FA_CONFIRM_WAIT_", "")).intValue());
            ce0Var.M1(8, true, bundle2, false);
        } else {
            ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), tL_error.text);
        }
    }

    public static boolean b1(ce0 ce0Var, View view) {
        if (!ce0Var.z1()) {
            return org.telegram.messenger.g0.K3(view);
        }
        return true;
    }

    public static void c0(ce0 ce0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z9, p8.d dVar) {
        String str2;
        p8.e eVar = ((e8.d) ((com.google.android.gms.common.api.q) dVar.f3500a)).f10722b;
        if (eVar == null) {
            str2 = null;
        } else {
            str2 = eVar.f53500a;
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
                            ConnectionsManager.getInstance(ce0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new wa0(0, bundle, auth_sentcode, ce0Var, z9), 10);
                        } else if (!optBoolean && !optBoolean2) {
                            org.telegram.messenger.a8.b("{SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false and basicIntegrity = false");
                            ce0Var.K1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE");
                        } else if (!optBoolean) {
                            org.telegram.messenger.a8.b("{SAFETYNET_BASICINTEGRITY_FALSE} Resend firebase sms because basicIntegrity = false");
                            ce0Var.K1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_FALSE");
                        } else if (!optBoolean2) {
                            org.telegram.messenger.a8.b("{SAFETYNET_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false");
                            ce0Var.K1(bundle, auth_sentcode, "SAFETYNET_CTSPROFILEMATCH_FALSE");
                        }
                    } catch (JSONException e10) {
                        e = e10;
                        org.telegram.messenger.a8.g(e, true);
                        org.telegram.messenger.a8.b("{SAFETYNET_JSON_EXCEPTION} Resend firebase sms because of exception");
                        ce0Var.K1(bundle, auth_sentcode, "SAFETYNET_JSON_EXCEPTION");
                    }
                } catch (JSONException e11) {
                    e = e11;
                }
            } else {
                org.telegram.messenger.a8.b("{SAFETYNET_CANT_SPLIT} Resend firebase sms because can't split JWS token");
                ce0Var.K1(bundle, auth_sentcode, "SAFETYNET_CANT_SPLIT");
            }
        } else {
            org.telegram.messenger.a8.b("{SAFETYNET_NULL_JWS} Resend firebase sms because JWS = null");
            ce0Var.K1(bundle, auth_sentcode, "SAFETYNET_NULL_JWS");
        }
    }

    public static void c1(ce0 ce0Var, View view, boolean z9) {
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        org.telegram.messenger.g0.G3(3.5f, view, null);
        if (z9 && (view instanceof org.telegram.ui.Components.lb0)) {
            Runnable runnable = (Runnable) view.getTag(2131296713);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
            org.telegram.ui.Components.lb0 lb0Var = (org.telegram.ui.Components.lb0) view;
            AtomicReference atomicReference = new AtomicReference();
            EditText attachedEditText = lb0Var.getAttachedEditText();
            fi.h7 h7Var = new fi.h7(attachedEditText, atomicReference, false, 5);
            lb0Var.a(1.0f);
            org.telegram.ui.Components.kn0 kn0Var = new org.telegram.ui.Components.kn0(lb0Var, view, attachedEditText, h7Var, 16);
            atomicReference.set(kn0Var);
            view.postDelayed(kn0Var, 2000L);
            view.setTag(2131296713, kn0Var);
            if (attachedEditText != null) {
                attachedEditText.addTextChangedListener(h7Var);
            }
        }
    }

    public static HashSet d1(ce0 ce0Var) {
        List<SubscriptionInfo> list;
        HashSet hashSet = new HashSet();
        try {
            String line1Number = ((TelephonyManager) org.telegram.messenger.t0.f25566b.getSystemService("phone")).getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                hashSet.add(line1Number);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            int i7 = Build.VERSION.SDK_INT;
            SubscriptionManager from = SubscriptionManager.from(ce0Var.getParentActivity());
            if (i7 >= 30) {
                list = from.getCompleteActiveSubscriptionInfoList();
            } else {
                list = null;
            }
            if ((list == null || list.isEmpty()) && i7 >= 28) {
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
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        return hashSet;
    }

    public static int s0(ce0 ce0Var) {
        return ce0Var.currentAccount;
    }

    public static void t0(ce0 ce0Var, String str, String str2, String str3) {
        if (ce0Var.V.getTag() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131746100, "ResetMyAccountWarningText");
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.T = M0;
        u1Var.R = org.telegram.messenger.id.M0(2131746102, "ResetMyAccountWarning");
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746101, "ResetMyAccountWarningReset"), new a1.d(ce0Var, str, str2, str3, 16));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
        ce0Var.showDialog(u1Var);
    }

    public static void u1(ImageView imageView, int i7, int i10, PorterDuff.Mode mode) {
        if (imageView != null) {
            if (i7 != i10 || imageView.getColorFilter() == null) {
                imageView.setColorFilter(new PorterDuffColorFilter(i7, mode));
            }
        }
    }

    public static int v0(ce0 ce0Var) {
        return ce0Var.currentAccount;
    }

    public static void v1(ImageView imageView, int i7, int i10) {
        if (imageView != null) {
            Drawable background = imageView.getBackground();
            if (background == null) {
                imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(i7, 1, -1));
            } else if (i7 != i10) {
                org.telegram.ui.ActionBar.k6.H1(background, i7, true);
            }
        }
    }

    public static String x1(Exception exc) {
        if (exc == null) {
            return "NULL";
        }
        String simpleName = exc.getClass().getSimpleName();
        if (exc.getMessage() != null) {
            if (simpleName.length() > 0) {
                simpleName = simpleName.concat(" ");
            }
            StringBuilder m10 = com.google.android.recaptcha.internal.a.m(simpleName);
            m10.append(exc.getMessage());
            simpleName = m10.toString();
        }
        return simpleName.toUpperCase().replaceAll(" ", "_");
    }

    public final boolean A1() {
        if (this.F == 1) {
            return true;
        }
        return false;
    }

    public final void C1(boolean z9, boolean z10) {
        org.telegram.ui.ActionBar.u1 u1Var;
        if (this.P != 0) {
            if (z9) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.P, true);
            }
            this.P = 0;
        }
        if (A1() && (u1Var = this.R) != null) {
            u1Var.dismiss();
            this.R = null;
        }
        O1(false, z10, false);
    }

    public final void D1(String str, String str2) {
        if (str2 != null && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = str;
            u1Var.T = str2;
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, "OK"), null);
            showDialog(u1Var);
        }
    }

    public final void F1(int i7, boolean z9) {
        if (A1() && i7 == 0) {
            if (this.R == null && getParentActivity() != null && !getParentActivity().isFinishing()) {
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
                this.R = u1Var;
                u1Var.f28572i0 = false;
                u1Var.show();
                return;
            }
            return;
        }
        this.P = i7;
        O1(true, z9, false);
    }

    public final void G1(TLRPC.TL_auth_authorization tL_auth_authorization, boolean z9) {
        org.telegram.messenger.qp.s1(this.currentAccount).Q();
        ConnectionsManager.getInstance(this.currentAccount).setUserId(tL_auth_authorization.user.f27105id);
        org.telegram.messenger.p10.i(this.currentAccount).b();
        org.telegram.messenger.qp.s1(this.currentAccount).Q();
        org.telegram.messenger.p10.i(this.currentAccount).U = this.D;
        org.telegram.messenger.p10.i(this.currentAccount).w(tL_auth_authorization.user);
        org.telegram.messenger.p10.i(this.currentAccount).v(true);
        org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(this.currentAccount);
        a02.f26719a.c(new org.telegram.messenger.dr(a02, true, 1));
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_auth_authorization.user);
        org.telegram.messenger.yr.a0(this.currentAccount).m1(arrayList, null, true, true);
        org.telegram.messenger.qp.s1(this.currentAccount).X3(tL_auth_authorization.user, false, false);
        org.telegram.messenger.g5 r10 = org.telegram.messenger.g5.r(this.currentAccount);
        r10.f22600a = null;
        Utilities.f21336e.c(new org.telegram.messenger.k4(r10, 0));
        Utilities.d.c(new org.telegram.messenger.vj(org.telegram.messenger.qp.s1(this.currentAccount), 27));
        ConnectionsManager.getInstance(this.currentAccount).updateDcSettings();
        org.telegram.messenger.qp.s1(this.currentAccount).R2(true);
        org.telegram.messenger.qp.s1(this.currentAccount).h3();
        org.telegram.messenger.qp.s1(this.currentAccount).M(false);
        byte[] bArr = tL_auth_authorization.future_auth_token;
        if (bArr != null) {
            boolean z10 = org.telegram.messenger.r2.f25212a;
            org.telegram.messenger.a8.b("saveLogInToken ".concat(new String(bArr, StandardCharsets.UTF_8)));
            ArrayList b10 = org.telegram.messenger.v0.b();
            if (b10 == null) {
                b10 = new ArrayList();
            }
            b10.add(0, tL_auth_authorization);
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25566b.getSharedPreferences("saved_tokens_login", 0);
            ArrayList arrayList2 = new ArrayList();
            sharedPreferences.edit().clear().apply();
            for (int i7 = 0; i7 < Math.min(20, b10.size()); i7++) {
                arrayList2.add((TLRPC.TL_auth_authorization) b10.get(i7));
            }
            if (arrayList2.size() > 0) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("count", arrayList2.size());
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    SerializedData serializedData = new SerializedData(((TLRPC.TL_auth_authorization) arrayList2.get(i10)).getObjectSize());
                    ((TLRPC.TL_auth_authorization) arrayList2.get(i10)).serializeToStream(serializedData);
                    edit.putString("log_in_token_" + i10, Utilities.f(serializedData.toByteArray()));
                }
                edit.apply();
                BackupAgent.a();
            }
        } else {
            org.telegram.messenger.a8.b("onAuthSuccess future_auth_token is empty");
        }
        if (z9) {
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.currentAccount);
            s12.f24741b2.put(0, true);
            s12.f24751c2.put(0, true);
        }
        org.telegram.messenger.ui.b0(this.currentAccount).c1("tg_placeholders_android", false, true);
        boolean z11 = tL_auth_authorization.setup_password_required;
        int i11 = tL_auth_authorization.otherwise_relogin_days;
        if (getParentActivity() != null) {
            org.telegram.messenger.g0.p3(getParentActivity(), false);
        }
        w1();
        if (getParentActivity() instanceof LaunchActivity) {
            if (this.f44794y) {
                this.f44794y = false;
                this.f44779n0 = true;
                ((LaunchActivity) getParentActivity()).P0(this.currentAccount, new l2.x(3, z9));
                this.f44779n0 = false;
                finishFragment();
                return;
            }
            if (z9 && z11) {
                za1 za1Var = new za1(6, null);
                za1Var.G = i11;
                za1Var.H = true;
                presentFragment(za1Var, true);
            } else {
                Bundle k10 = a8.p0.k("afterSignup", z9);
                je0 je0Var = new je0();
                je0Var.r0(k10);
                presentFragment(je0Var, true);
            }
            org.telegram.messenger.qs.f(this.currentAccount).k(org.telegram.messenger.qs.f25020j0, new Object[0]);
            org.telegram.messenger.id.E0().V0(this.currentAccount, true);
            qy0.a0(true);
        } else if (getParentActivity() instanceof ExternalActionActivity) {
            ExternalActionActivity externalActionActivity = (ExternalActionActivity) getParentActivity();
            externalActionActivity.d(externalActionActivity.h, externalActionActivity.f41231n, externalActionActivity.f41234w, true, externalActionActivity.f41232r, externalActionActivity.f41233s);
            externalActionActivity.f41228c.a0();
            ActionBarLayout actionBarLayout = externalActionActivity.d;
            if (actionBarLayout != null) {
                actionBarLayout.a0();
            }
            org.telegram.ui.Components.rt0 rt0Var = externalActionActivity.f41229e;
            if (rt0Var != null) {
                rt0Var.setVisibility(0);
            }
        }
    }

    public final void H1() {
        if (this.Q[this.J]) {
            if (this.V.getTag() != null) {
                if (getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131744835, "StopLoadingTitle");
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131744836, "StopLoading");
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131743216, "WaitMore"), null);
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131744844, "Stop"), new ta0(this, 0));
                showDialog(u1Var);
                return;
            }
            this.f44763b[this.f44761a].h(null);
        }
    }

    public final void I1(String str, TLRPC.auth_SentCode auth_sentcode) {
        if (this.fragmentView == null) {
            this.f44780o0 = new rp(this, str, auth_sentcode, 26);
            return;
        }
        this.f44768e = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + str);
        bundle.putString("ephone", "+" + str);
        bundle.putString("phoneFormated", str);
        y1(bundle, auth_sentcode, true);
    }

    public final void K1(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str) {
        if (!this.f44781p0) {
            return;
        }
        C1(false, true);
        this.f44781p0 = false;
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = bundle.getString("phoneFormated");
        tL_auth_resendCode.phone_code_hash = auth_sentcode.phone_code_hash;
        if (str != null) {
            tL_auth_resendCode.flags |= 1;
            tL_auth_resendCode.reason = str;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_resendCode, new h50(7, this, bundle), 10);
    }

    public final void L1(boolean z9, boolean z10) {
        if (this.f44762a0 == z9 && z10) {
            return;
        }
        this.f44762a0 = z9;
        if (org.telegram.messenger.g0.C1()) {
            z9 = false;
        }
        if (z9) {
            org.telegram.messenger.g0.v1(this.fragmentView);
            org.telegram.messenger.g0.b3(getParentActivity(), this.classGuid);
            if (z10) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                this.d = duration;
                duration.setInterpolator(org.telegram.ui.Components.xq.f40366f);
                this.d.addUpdateListener(new ra0(this, 2));
                this.d.addListener(new cb0(this, 0));
                this.d.start();
                return;
            }
            this.f44765c.setVisibility(0);
            return;
        }
        org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
        if (z10) {
            ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
            this.d = duration2;
            duration2.setInterpolator(org.telegram.ui.Components.ks.f35429e);
            this.d.addUpdateListener(new ra0(this, 0));
            this.d.addListener(new cb0(this, 1));
            this.d.start();
            return;
        }
        this.f44765c.setVisibility(8);
    }

    public final void M1(int i7, boolean z9, Bundle bundle, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        if (i7 != 0 && i7 != 5 && i7 != 6 && i7 != 9 && i7 != 10 && i7 != 12 && i7 != 17 && i7 != 16) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i7 == this.f44761a) {
            z9 = false;
        }
        int i12 = 8;
        if (z11) {
            if (i7 == 0) {
                this.f44790w = true;
                this.f44792x = true;
            }
            this.J = 1;
            N1(false, z9);
            O1(false, z9, false);
            this.J = 0;
            O1(false, z9, false);
            if (!z9) {
                N1(true, false);
            }
        } else {
            this.J = 0;
            N1(false, z9);
            O1(false, z9, false);
            if (i7 != 8) {
                this.J = 1;
            }
        }
        org.telegram.ui.Components.wt0[] wt0VarArr = this.f44763b;
        if (z9) {
            org.telegram.ui.Components.wt0 wt0Var = wt0VarArr[this.f44761a];
            org.telegram.ui.Components.wt0 wt0Var2 = wt0VarArr[i7];
            this.f44761a = i7;
            ImageView imageView = this.U;
            if (wt0Var2.b() || this.f44794y) {
                i12 = 0;
            }
            imageView.setVisibility(i12);
            wt0Var2.m(bundle, false);
            setParentActivityTitle(wt0Var2.getHeaderName());
            wt0Var2.j();
            int i13 = org.telegram.messenger.g0.f22563q.x;
            if (z10) {
                i13 = -i13;
            }
            wt0Var2.setX(i13);
            wt0Var2.setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new ai.g0(this, z11, wt0Var, 11));
            Property property = View.TRANSLATION_X;
            if (z10) {
                i11 = org.telegram.messenger.g0.f22563q.x;
            } else {
                i11 = -org.telegram.messenger.g0.f22563q.x;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(wt0Var, property, i11), ObjectAnimator.ofFloat(wt0Var2, property, 0.0f));
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.start();
            L1(wt0Var2.a(), true);
            return;
        }
        ImageView imageView2 = this.U;
        if (!wt0VarArr[i7].b() && !this.f44794y) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        imageView2.setVisibility(i10);
        wt0VarArr[this.f44761a].setVisibility(8);
        wt0VarArr[this.f44761a].g();
        this.f44761a = i7;
        wt0VarArr[i7].m(bundle, false);
        wt0VarArr[i7].setVisibility(0);
        setParentActivityTitle(wt0VarArr[i7].getHeaderName());
        wt0VarArr[i7].j();
        L1(wt0VarArr[i7].a(), false);
    }

    public final void N1(boolean z9, boolean z10) {
        boolean z11;
        TimeInterpolator timeInterpolator;
        int i7 = this.J;
        if (i7 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean[] zArr = this.Q;
        if (zArr[i7] != z9) {
            AnimatorSet[] animatorSetArr = this.K;
            AnimatorSet animatorSet = animatorSetArr[i7];
            if (animatorSet != null) {
                if (z10) {
                    animatorSet.removeAllListeners();
                }
                animatorSetArr[this.J].cancel();
            }
            int i10 = this.J;
            zArr[i10] = z9;
            if (z10) {
                animatorSetArr[i10] = new AnimatorSet();
                if (z11) {
                    this.N.e(z9, z10);
                }
                animatorSetArr[this.J].addListener(new org.telegram.ui.ActionBar.g(this, z11, z9, 4));
                int i11 = 150;
                if (z11) {
                    if (z9) {
                        timeInterpolator = org.telegram.messenger.g0.F;
                        i11 = 200;
                    } else {
                        timeInterpolator = org.telegram.messenger.g0.G;
                    }
                } else {
                    timeInterpolator = null;
                }
                animatorSetArr[this.J].setDuration(i11);
                animatorSetArr[this.J].setInterpolator(timeInterpolator);
                animatorSetArr[this.J].start();
            } else if (z11) {
                this.N.e(z9, z10);
            }
        }
    }

    public final void O1(final boolean z9, final boolean z10, boolean z11) {
        boolean z12;
        float f10;
        boolean[] zArr = this.f44774i0;
        if (z10 && zArr[this.J] == z9 && !z11) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.qy(this, z9, z10, z11, 1));
            return;
        }
        final int i7 = this.J;
        if (i7 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean[] zArr2 = this.f44776k0;
        if (!z11 && !z12) {
            zArr[i7] = z9;
            if (z10) {
                boolean z13 = zArr2[i7];
                Runnable[] runnableArr = this.f44775j0;
                if (z13) {
                    org.telegram.messenger.g0.r(runnableArr[i7]);
                    zArr2[this.J] = false;
                    return;
                } else if (z9) {
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            ce0 ce0Var = ce0.this;
                            int i10 = ce0Var.J;
                            ce0Var.J = i7;
                            ce0Var.O1(z9, z10, true);
                            ce0Var.J = i10;
                        }
                    };
                    runnableArr[i7] = runnable;
                    org.telegram.messenger.g0.i3(runnable, 2000L);
                    zArr2[this.J] = true;
                    return;
                }
            }
        } else {
            zArr2[i7] = false;
            zArr[i7] = z9;
        }
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z12) {
            this.N.f(z9, z10);
            return;
        }
        float f11 = 0.0f;
        if (z10) {
            this.L = new AnimatorSet();
            if (z9) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (z9) {
                f11 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
            ofFloat.addListener(new z40(1, this, z9));
            ofFloat.addUpdateListener(new ra0(this, 1));
            this.L.playTogether(ofFloat);
            this.L.setDuration(150L);
            this.L.start();
        } else if (z9) {
            this.V.setVisibility(0);
            this.V.setScaleX(1.0f);
            this.V.setScaleY(1.0f);
            this.V.setAlpha(1.0f);
        } else {
            this.V.setTag(null);
            this.V.setVisibility(4);
            this.V.setScaleX(0.1f);
            this.V.setScaleY(0.1f);
            this.V.setAlpha(0.0f);
        }
    }

    public final void P1(boolean z9, boolean z10) {
        if (z9 == this.f44791w0) {
            return;
        }
        qa0 qa0Var = this.f44793x0;
        if (qa0Var != null) {
            org.telegram.messenger.g0.r(qa0Var);
            this.f44793x0 = null;
        }
        this.f44791w0 = z9;
        this.W.clearAnimation();
        float f10 = 0.0f;
        int i7 = 0;
        if (z10) {
            this.W.setVisibility(0);
            ViewPropertyAnimator animate = this.W.animate();
            if (z9) {
                f10 = 1.0f;
            }
            animate.alpha(f10).withEndAction(new org.telegram.ui.Components.tp0(9, this, z9)).start();
            return;
        }
        ImageView imageView = this.W;
        if (!z9) {
            i7 = 8;
        }
        imageView.setVisibility(i7);
        ImageView imageView2 = this.W;
        if (z9) {
            f10 = 1.0f;
        }
        imageView2.setAlpha(f10);
    }

    public final void Q1() {
        boolean z9;
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27852d6, false));
        ImageView imageView = this.U;
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        u1(imageView, x02, this.f44784r0, PorterDuff.Mode.SRC_ATOP);
        this.f44784r0 = x02;
        ImageView imageView2 = this.U;
        int i10 = org.telegram.ui.ActionBar.k6.f27944i6;
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        v1(imageView2, x03, this.f44786s0);
        this.f44786s0 = x03;
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        if (x04 != this.f44787t0 || this.X.getColorFilter() == null) {
            this.X.setColorFilter(new PorterDuffColorFilter(x04, PorterDuff.Mode.SRC_IN));
            this.f44787t0 = x04;
        }
        ImageView imageView3 = this.W;
        int x05 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        v1(imageView3, x05, this.f44788u0);
        this.f44788u0 = x05;
        RadialProgressView radialProgressView = this.V;
        int i11 = org.telegram.ui.ActionBar.k6.P9;
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        this.N.updateColors();
        this.M.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false));
        this.M.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        for (org.telegram.ui.Components.wt0 wt0Var : this.f44763b) {
            wt0Var.updateColors();
        }
        org.telegram.ui.Components.br brVar = this.f44765c;
        org.telegram.ui.Components.zq zqVar = brVar.f32330a;
        int x06 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
        if (x06 != brVar.f32337s || zqVar.getColorFilter() == null) {
            brVar.f32337s = x06;
            zqVar.setColorFilter(x06, PorterDuff.Mode.SRC_ATOP);
        }
        int x07 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27944i6, false);
        int o4 = i0.a.o(x07, 30);
        if (x07 != brVar.f32338w) {
            z9 = true;
        } else {
            z9 = false;
        }
        brVar.f32338w = x07;
        int i12 = 0;
        while (true) {
            View[] viewArr = brVar.f32332c;
            if (i12 >= viewArr.length) {
                break;
            }
            View view = viewArr[i12];
            if (view != null) {
                if (view.getBackground() != null) {
                    if (z9) {
                        org.telegram.ui.ActionBar.k6.H1(view.getBackground(), x07, false);
                        org.telegram.ui.ActionBar.k6.H1(view.getBackground(), o4, true);
                    }
                } else {
                    org.telegram.ui.Components.br.a(i12, view);
                }
                if (view instanceof org.telegram.ui.Components.ar) {
                    ((org.telegram.ui.Components.ar) view).updateColors();
                }
            }
            i12++;
        }
        pd0 pd0Var = this.f44764b0;
        if (pd0Var != null) {
            int i13 = pd0.F;
            pd0Var.b();
        }
    }

    public final void R1(boolean z9, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        if (this.X != null) {
            int connectionState = getConnectionsManager().getConnectionState();
            if (this.f44789v0 != connectionState || z10) {
                this.f44789v0 = connectionState;
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25566b.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if (sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i7 = this.f44789v0;
                if (i7 != 3 && i7 != 5) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (i7 != 1 && i7 != 2 && i7 != 4) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z11) {
                    this.X.b(true, z12, z9);
                    P1(true, z9);
                } else if ((getMessagesController().f24948y3 && !org.telegram.messenger.iz.f23456z1.isEmpty()) || z13) {
                    this.X.b(true, z12, z9);
                    if (this.f44791w0) {
                        return;
                    }
                    qa0 qa0Var = this.f44793x0;
                    if (qa0Var != null) {
                        org.telegram.messenger.g0.r(qa0Var);
                    }
                    this.f44791w0 = true;
                    qa0 qa0Var2 = new qa0(this, 1);
                    this.f44793x0 = qa0Var2;
                    org.telegram.messenger.g0.i3(qa0Var2, 5000L);
                } else {
                    P1(false, z9);
                }
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
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            if (this.f44779n0) {
                this.m0 = this.fragmentView;
            }
            this.fragmentView = null;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && !this.f44779n0) {
            ViewGroup viewGroup2 = (ViewGroup) kVar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
            this.actionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    @Override
    public final android.view.View createView(android.content.Context r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ce0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.T1) {
            R1(true, false);
        } else if (i7 == org.telegram.messenger.qs.f25072s1 && this.f44773h0) {
            org.telegram.messenger.qp messagesController = getMessagesController();
            if (!messagesController.S3.contains("SETUP_LOGIN_EMAIL") && !messagesController.S3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
                finishFragment();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.ma.a(new f6(11, this), org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.D6, org.telegram.ui.ActionBar.k6.H6, org.telegram.ui.ActionBar.k6.f27944i6, org.telegram.ui.ActionBar.k6.P9, org.telegram.ui.ActionBar.k6.O9, org.telegram.ui.ActionBar.k6.f27981k6, org.telegram.ui.ActionBar.k6.f27999l6, org.telegram.ui.ActionBar.k6.I6, org.telegram.ui.ActionBar.k6.f28093q7, org.telegram.ui.ActionBar.k6.f28244y6, org.telegram.ui.ActionBar.k6.i7, org.telegram.ui.ActionBar.k6.f28092q6, org.telegram.ui.ActionBar.k6.Ki, org.telegram.ui.ActionBar.k6.Q9, org.telegram.ui.ActionBar.k6.f28073p7, org.telegram.ui.ActionBar.k6.J6, org.telegram.ui.ActionBar.k6.Y6, org.telegram.ui.ActionBar.k6.W6, org.telegram.ui.ActionBar.k6.X6, org.telegram.ui.ActionBar.k6.f27925h5, org.telegram.ui.ActionBar.k6.f28091q5, org.telegram.ui.ActionBar.k6.f27960j5);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27852d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.f44773h0;
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        pc0 pc0Var = (pc0) this.f44763b[5];
        if (pc0Var != null) {
            pc0Var.M.h(i7, i10, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        if (!this.f44773h0 || this.f44761a != 12) {
            int i7 = this.f44761a;
            org.telegram.ui.Components.wt0[] wt0VarArr = this.f44763b;
            if (i7 == 0 || (this.F == 3 && i7 == 12)) {
                if (z9) {
                    for (org.telegram.ui.Components.wt0 wt0Var : wt0VarArr) {
                        if (wt0Var != null) {
                            wt0Var.f();
                        }
                    }
                    w1();
                }
                return true;
            } else if (i7 == 6) {
                if (z9) {
                    wt0VarArr[i7].c(true);
                    M1(0, true, null, true);
                    return false;
                }
            } else if (i7 != 7 && i7 != 8) {
                if ((i7 < 1 || i7 > 4) && i7 != 11 && i7 != 15) {
                    if (i7 == 5) {
                        if (z9) {
                            ((pc0) wt0VarArr[i7]).f48791x.callOnClick();
                            return false;
                        }
                    } else if (i7 == 9) {
                        if (z9) {
                            wt0VarArr[i7].c(true);
                            M1(7, true, null, true);
                            return false;
                        }
                    } else if (i7 == 10) {
                        if (z9) {
                            wt0VarArr[i7].c(true);
                            M1(9, true, null, true);
                            return false;
                        }
                    } else if (i7 == 13) {
                        if (z9) {
                            wt0VarArr[i7].c(true);
                            M1(12, true, null, true);
                            return false;
                        }
                    } else if (z9 && wt0VarArr[i7].c(true)) {
                        M1(0, true, null, true);
                        return false;
                    }
                } else if (z9 && wt0VarArr[i7].c(false)) {
                    M1(0, true, null, true);
                    return false;
                }
            } else if (z9) {
                wt0VarArr[i7].c(true);
                M1(6, true, null, true);
            }
        }
        return false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        L1(this.f44763b[this.f44761a].a(), false);
        pd0 pd0Var = this.f44764b0;
        if (pd0Var != null) {
            int i7 = pd0.F;
            pd0Var.a();
        }
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z9, Runnable runnable) {
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        try {
            if (dialog == this.h) {
                ArrayList arrayList = this.f44783r;
                if (!arrayList.isEmpty() && getParentActivity() != null) {
                    getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
                    return;
                }
            }
            if (dialog == this.f44778n) {
                ArrayList arrayList2 = this.f44785s;
                if (!arrayList2.isEmpty() && getParentActivity() != null) {
                    org.telegram.messenger.g0.i3(new qa0(this, 0), 200L);
                    getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.qs.T1);
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25072s1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        Runnable[] runnableArr;
        super.onFragmentDestroy();
        int i7 = 0;
        while (true) {
            org.telegram.ui.Components.wt0[] wt0VarArr = this.f44763b;
            if (i7 >= wt0VarArr.length) {
                break;
            }
            org.telegram.ui.Components.wt0 wt0Var = wt0VarArr[i7];
            if (wt0Var != null) {
                wt0Var.f();
            }
            i7++;
        }
        org.telegram.ui.ActionBar.u1 u1Var = this.R;
        if (u1Var != null) {
            u1Var.dismiss();
            this.R = null;
        }
        for (Runnable runnable : this.f44775j0) {
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
            }
        }
        getNotificationCenter().n(this, org.telegram.messenger.qs.T1);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25072s1);
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.f44794y) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(true, false);
        }
        org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        boolean z9;
        if (strArr.length != 0 && iArr.length != 0) {
            if (iArr[0] == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            org.telegram.ui.Components.wt0[] wt0VarArr = this.f44763b;
            if (i7 == 6) {
                this.f44790w = false;
                int i10 = this.f44761a;
                if (i10 == 0) {
                    org.telegram.ui.Components.wt0 wt0Var = wt0VarArr[i10];
                    ((be0) wt0Var).N = true;
                    wt0Var.h(null);
                }
            } else if (i7 == 7) {
                this.f44792x = false;
                int i11 = this.f44761a;
                if (i11 == 0) {
                    ((be0) wt0VarArr[i11]).p();
                }
            } else if (i7 == 20) {
                if (z9) {
                    ((pc0) wt0VarArr[5]).M.l();
                }
            } else if (i7 == 151 && z9) {
                pc0 pc0Var = (pc0) wt0VarArr[5];
                pc0Var.post(new bb0(pc0Var, 0));
            }
        }
    }

    @Override
    public final void onResume() {
        org.telegram.ui.Components.wt0 wt0Var;
        int i7;
        org.telegram.ui.Components.wt0[] wt0VarArr = this.f44763b;
        super.onResume();
        if (this.f44794y) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        View view = this.fragmentView;
        if (view != null) {
            view.requestLayout();
        }
        try {
            int i10 = this.f44761a;
            if (i10 >= 1 && i10 <= 4) {
                org.telegram.ui.Components.wt0 wt0Var2 = wt0VarArr[i10];
                if ((wt0Var2 instanceof gd0) && (i7 = ((gd0) wt0Var2).V) != 0 && Math.abs((System.currentTimeMillis() / 1000) - i7) >= 86400) {
                    wt0VarArr[this.f44761a].c(true);
                    M1(0, false, null, true);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        int i11 = this.f44761a;
        if (i11 == 0 && !this.f44766c0 && (wt0Var = wt0VarArr[i11]) != null) {
            wt0Var.j();
        }
        if (z1()) {
            org.telegram.messenger.g0.v1(this.fragmentView);
            org.telegram.messenger.g0.b3(getParentActivity(), this.classGuid);
        }
        int i12 = this.f44761a;
        if (i12 >= 0 && i12 < wt0VarArr.length) {
            wt0VarArr[i12].i();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            if (this.fragmentView != null && this.U != null && this.X != null && this.W != null && this.V != null && this.N != null && this.M != null && this.f44765c != null) {
                for (org.telegram.ui.Components.wt0 wt0Var : this.f44763b) {
                    if (wt0Var == null) {
                        return;
                    }
                }
                Q1();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("currentViewNum", this.f44761a);
            bundle2.putInt("syncContacts", this.D ? 1 : 0);
            for (int i7 = 0; i7 <= this.f44761a; i7++) {
                org.telegram.ui.Components.wt0 wt0Var = this.f44763b[i7];
                if (wt0Var != null) {
                    wt0Var.l(bundle2);
                }
            }
            Context context = org.telegram.messenger.t0.f25566b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("logininfo2");
            if (this.f44794y) {
                str = "_" + this.currentAccount;
            } else {
                str = "";
            }
            sb2.append(str);
            SharedPreferences.Editor edit = context.getSharedPreferences(sb2.toString(), 0).edit();
            edit.clear();
            J1(bundle2, edit, null);
            edit.commit();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void w1() {
        String str;
        Context context = org.telegram.messenger.t0.f25566b;
        StringBuilder sb2 = new StringBuilder("logininfo2");
        if (this.f44794y) {
            str = "_" + this.currentAccount;
        } else {
            str = "";
        }
        sb2.append(str);
        SharedPreferences.Editor edit = context.getSharedPreferences(sb2.toString(), 0).edit();
        edit.clear();
        edit.commit();
    }

    public final void y1(final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, boolean z9) {
        if (auth_sentcode instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
            TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) auth_sentcode;
            bundle.putString("product", tL_auth_sentCodePaymentRequired.store_product);
            bundle.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
            bundle.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
            bundle.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
            bundle.putString("currency", tL_auth_sentCodePaymentRequired.currency);
            bundle.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
            bundle.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
            M1(18, true, bundle, true);
            return;
        }
        TLRPC.auth_SentCodeType auth_sentcodetype = auth_sentcode.type;
        if ((auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms) && !auth_sentcodetype.verifiedFirebase && !this.f44781p0) {
            if (org.telegram.messenger.tt.f25661b.hasServices()) {
                TLRPC.TL_auth_sentCodeTypeFirebaseSms tL_auth_sentCodeTypeFirebaseSms = (TLRPC.TL_auth_sentCodeTypeFirebaseSms) auth_sentcode.type;
                F1(0, true);
                this.f44781p0 = true;
                String string = bundle.getString("phoneFormated");
                if (tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce != null) {
                    IntegrityManager create = IntegrityManagerFactory.create(getParentActivity());
                    String str = new String(Base64.encode(tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce, 8));
                    org.telegram.messenger.a8.b("getting classic integrity with nonce = ".concat(str));
                    create.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).setCloudProjectNumber(tL_auth_sentCodeTypeFirebaseSms.play_integrity_project_id).build()).addOnSuccessListener(new ua0(this, bundle, auth_sentcode, string, z9)).addOnFailureListener(new OnFailureListener(this) {
                        public final ce0 f50623b;

                        {
                            this.f50623b = this;
                        }

                        @Override
                        public final void onFailure(Exception exc) {
                            switch (r4) {
                                case 0:
                                    String str2 = "PLAYINTEGRITY_EXCEPTION_" + ce0.x1(exc);
                                    org.telegram.messenger.a8.e("{" + str2 + "} Resend firebase sms because integrity threw error", exc);
                                    this.f50623b.K1(bundle, auth_sentcode, str2);
                                    return;
                                default:
                                    org.telegram.messenger.a8.g(exc, true);
                                    String str3 = "SAFETYNET_EXCEPTION_" + ce0.x1(exc);
                                    org.telegram.messenger.a8.b("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                    this.f50623b.K1(bundle, auth_sentcode, str3);
                                    return;
                            }
                        }
                    });
                    return;
                }
                com.google.android.gms.common.api.j jVar = new com.google.android.gms.common.api.j(org.telegram.messenger.t0.f25566b, p8.c.f53499a, (com.google.android.gms.common.api.a) null, new sa.d(6));
                byte[] bArr = auth_sentcode.type.nonce;
                String str2 = org.telegram.messenger.r2.f25216f;
                com.google.android.gms.common.api.internal.n0 n0Var = jVar.f6721i;
                b9.g0 g0Var = new b9.g0(n0Var, bArr, str2);
                n0Var.f6669b.d(0, g0Var);
                q6.m.m(g0Var, new q6.n(new Object())).addOnSuccessListener(new ua0(this, string, auth_sentcode, bundle, z9)).addOnFailureListener(new OnFailureListener(this) {
                    public final ce0 f50623b;

                    {
                        this.f50623b = this;
                    }

                    @Override
                    public final void onFailure(Exception exc) {
                        switch (r4) {
                            case 0:
                                String str22 = "PLAYINTEGRITY_EXCEPTION_" + ce0.x1(exc);
                                org.telegram.messenger.a8.e("{" + str22 + "} Resend firebase sms because integrity threw error", exc);
                                this.f50623b.K1(bundle, auth_sentcode, str22);
                                return;
                            default:
                                org.telegram.messenger.a8.g(exc, true);
                                String str3 = "SAFETYNET_EXCEPTION_" + ce0.x1(exc);
                                org.telegram.messenger.a8.b("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                this.f50623b.K1(bundle, auth_sentcode, str3);
                                return;
                        }
                    }
                });
                return;
            }
            org.telegram.messenger.a8.b("{GOOGLE_PLAY_SERVICES_NOT_AVAILABLE} Resend firebase sms because firebase is not available");
            K1(bundle, auth_sentcode, "GOOGLE_PLAY_SERVICES_NOT_AVAILABLE");
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
            M1(1, z9, bundle, false);
            return;
        }
        if (auth_sentcode.timeout == 0) {
            boolean z10 = org.telegram.messenger.r2.f25212a;
            auth_sentcode.timeout = 60;
        }
        bundle.putInt("timeout", auth_sentcode.timeout * 1000);
        TLRPC.auth_SentCodeType auth_sentcodetype2 = auth_sentcode.type;
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt("type", 4);
            bundle.putInt("length", auth_sentcode.type.length);
            M1(4, z9, bundle, false);
        } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", auth_sentcode.type.pattern);
            M1(3, z9, bundle, false);
        } else if (!(auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSms) && !(auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFragmentSms) {
                bundle.putInt("type", 15);
                bundle.putString("url", auth_sentcode.type.url);
                bundle.putInt("length", auth_sentcode.type.length);
                M1(15, z9, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeMissedCall) {
                bundle.putInt("type", 11);
                bundle.putInt("length", auth_sentcode.type.length);
                bundle.putString("prefix", auth_sentcode.type.prefix);
                M1(11, z9, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSetUpEmailRequired) {
                bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
                M1(12, z9, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
                bundle.putString("emailPattern", auth_sentcode.type.email_pattern);
                bundle.putInt("length", auth_sentcode.type.length);
                bundle.putInt("nextPhoneLoginDate", auth_sentcode.type.next_phone_login_date);
                bundle.putInt("resetAvailablePeriod", auth_sentcode.type.reset_available_period);
                bundle.putInt("resetPendingDate", auth_sentcode.type.reset_pending_date);
                M1(14, z9, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                String str3 = auth_sentcodetype2.beginning;
                if (str3 != null) {
                    bundle.putString("beginning", str3);
                }
                M1(16, z9, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                String str4 = auth_sentcodetype2.beginning;
                if (str4 != null) {
                    bundle.putString("beginning", str4);
                }
                M1(17, z9, bundle, false);
            }
        } else {
            bundle.putInt("type", 2);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putBoolean("firebase", auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms);
            M1(2, z9, bundle, false);
        }
    }

    public final boolean z1() {
        if (this.f44763b[this.f44761a].a() && !org.telegram.messenger.g0.C1()) {
            return true;
        }
        return false;
    }

    public ce0(int i7) {
        super(null);
        this.f44763b = new org.telegram.ui.Components.wt0[19];
        this.f44783r = new ArrayList();
        this.f44785s = new ArrayList();
        this.f44790w = true;
        this.f44792x = true;
        this.D = true;
        this.E = false;
        this.F = 0;
        this.K = new AnimatorSet[2];
        this.Q = new boolean[]{true, false};
        this.f44762a0 = false;
        this.f44774i0 = new boolean[2];
        this.f44775j0 = new Runnable[2];
        this.f44776k0 = new boolean[2];
        this.currentAccount = i7;
        this.f44794y = true;
    }
}
