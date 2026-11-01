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
public final class gf0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public static final int f37470y0;
    public boolean D;
    public boolean E;
    public int F;
    public String G;
    public Bundle H;
    public TLRPC.TL_auth_sentCode I;
    public int J;
    public final AnimatorSet[] K;
    public AnimatorSet L;
    public org.telegram.ui.Components.w21 M;
    public org.telegram.ui.Components.f10 N;
    public li.k O;
    public int P;
    public final boolean[] Q;
    public org.telegram.ui.ActionBar.x1 R;
    public w8 S;
    public we0 T;
    public ImageView U;
    public RadialProgressView V;
    public ImageView W;
    public org.telegram.ui.Components.lh0 X;
    public LinearLayout Y;
    public l0 Z;
    public int f37471a;
    public boolean f37472a0;
    public final org.telegram.ui.Components.av0[] f37473b;
    public ve0 f37474b0;
    public org.telegram.ui.Components.lr f37475c;
    public boolean f37476c0;
    public ValueAnimator d;
    public Runnable f37477d0;
    public boolean e;
    public ev f37478e0;
    public boolean f37479f;
    public TextView f37480f0;
    public boolean f37481g0;
    public Dialog h;
    public boolean f37482h0;
    public final boolean[] f37483i0;
    public final Runnable[] f37484j0;
    public final boolean[] f37485k0;
    public boolean f37486l0;
    public View m0;
    public Dialog f37487n;
    public boolean f37488n0;
    public qq f37489o0;
    public boolean f37490p0;
    public TLRPC.TL_help_termsOfService f37491q0;
    public final ArrayList f37492r;
    public int f37493r0;
    public final ArrayList f37494s;
    public int f37495s0;
    public int f37496t0;
    public int f37497u0;
    public int f37498v0;
    public boolean f37499w;
    public boolean f37500w0;
    public boolean f37501x;
    public yb0 f37502x0;
    public boolean f37503y;

    static {
        int i10;
        if (org.telegram.messenger.uz.o() <= 1) {
            i10 = 150;
        } else {
            i10 = 100;
        }
        f37470y0 = i10;
    }

    public gf0() {
        super(null);
        this.f37473b = new org.telegram.ui.Components.av0[19];
        this.f37492r = new ArrayList();
        this.f37494s = new ArrayList();
        this.f37499w = true;
        this.f37501x = true;
        this.D = true;
        this.E = false;
        this.F = 0;
        this.K = new AnimatorSet[2];
        this.Q = new boolean[]{true, false};
        this.f37472a0 = false;
        this.f37483i0 = new boolean[2];
        this.f37484j0 = new Runnable[2];
        this.f37485k0 = new boolean[2];
    }

    public static void A1(Bundle bundle, SharedPreferences.Editor editor, String str) {
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof String) {
                if (str != null) {
                    editor.putString(a1.g.C(str, "_|_", str2), (String) obj);
                } else {
                    editor.putString(str2, (String) obj);
                }
            } else if (obj instanceof Integer) {
                if (str != null) {
                    editor.putInt(a1.g.C(str, "_|_", str2), ((Integer) obj).intValue());
                } else {
                    editor.putInt(str2, ((Integer) obj).intValue());
                }
            } else if (obj instanceof Boolean) {
                if (str != null) {
                    editor.putBoolean(a1.g.C(str, "_|_", str2), ((Boolean) obj).booleanValue());
                } else {
                    editor.putBoolean(str2, ((Boolean) obj).booleanValue());
                }
            } else if (obj instanceof Bundle) {
                A1((Bundle) obj, editor, str2);
            }
        }
    }

    public static int D0(gf0 gf0Var) {
        return gf0Var.currentAccount;
    }

    public static int W0(gf0 gf0Var) {
        return gf0Var.currentAccount;
    }

    public static void Z(gf0 gf0Var, String str, String str2, String str3) {
        gf0Var.w1(0, true);
        TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
        deleteaccount.reason = "Forgot password";
        ConnectionsManager.getInstance(gf0Var.currentAccount).sendRequest(deleteaccount, new mb(gf0Var, str, str2, str3, 4), 10);
    }

    public static void a0(gf0 gf0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            org.telegram.messenger.f8.b("Resend firebase sms because integrity token = null");
            gf0Var.B1(bundle, auth_sentcode, "PLAYINTEGRITY_TOKEN_NULL");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.play_integrity_token = str2;
        tL_auth_requestFirebaseSms.flags |= 4;
        ConnectionsManager.getInstance(gf0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new ec0(1, bundle, auth_sentcode, gf0Var, z10), 10);
    }

    public static boolean a1(gf0 gf0Var, View view) {
        if (!gf0Var.q1()) {
            return org.telegram.messenger.i0.J3(view);
        }
        return true;
    }

    public static void b0(gf0 gf0Var, TLRPC.TL_error tL_error, String str, String str2, String str3) {
        gf0Var.t1(false, true);
        if (tL_error == null) {
            if (str != null && str2 != null && str3 != null) {
                Bundle bundle = new Bundle();
                bundle.putString("phoneFormated", str);
                bundle.putString("phoneHash", str2);
                bundle.putString("code", str3);
                gf0Var.D1(5, true, bundle, false);
                return;
            }
            gf0Var.D1(0, true, null, true);
        } else if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
            gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131746132, "ResetAccountCancelledAlert"));
        } else if (tL_error.text.startsWith("2FA_CONFIRM_WAIT_")) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("phoneFormated", str);
            bundle2.putString("phoneHash", str2);
            bundle2.putString("code", str3);
            bundle2.putInt("startTime", ConnectionsManager.getInstance(gf0Var.currentAccount).getCurrentTime());
            bundle2.putInt("waitTime", Utilities.z(tL_error.text.replace("2FA_CONFIRM_WAIT_", "")).intValue());
            gf0Var.D1(8, true, bundle2, false);
        } else {
            gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error.text);
        }
    }

    public static void b1(gf0 gf0Var, View view, boolean z10) {
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        org.telegram.messenger.i0.F3(3.5f, view, null);
        if (z10 && (view instanceof org.telegram.ui.Components.ec0)) {
            Runnable runnable = (Runnable) view.getTag(2131296713);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
            org.telegram.ui.Components.ec0 ec0Var = (org.telegram.ui.Components.ec0) view;
            AtomicReference atomicReference = new AtomicReference();
            EditText attachedEditText = ec0Var.getAttachedEditText();
            ag.u2 u2Var = new ag.u2(5, attachedEditText, atomicReference);
            ec0Var.a(1.0f);
            v50 v50Var = new v50(ec0Var, view, attachedEditText, u2Var, 6);
            atomicReference.set(v50Var);
            view.postDelayed(v50Var, 2000L);
            view.setTag(2131296713, v50Var);
            if (attachedEditText != null) {
                attachedEditText.addTextChangedListener(u2Var);
            }
        }
    }

    public static void c0(gf0 gf0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10, m8.d dVar) {
        String str2;
        m8.e eVar = ((b8.f) ((com.google.android.gms.common.api.q) dVar.f2047a)).f2513b;
        if (eVar == null) {
            str2 = null;
        } else {
            str2 = eVar.f13026a;
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
                            ConnectionsManager.getInstance(gf0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new ec0(0, bundle, auth_sentcode, gf0Var, z10), 10);
                        } else if (!optBoolean && !optBoolean2) {
                            org.telegram.messenger.f8.b("{SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false and basicIntegrity = false");
                            gf0Var.B1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE");
                        } else if (!optBoolean) {
                            org.telegram.messenger.f8.b("{SAFETYNET_BASICINTEGRITY_FALSE} Resend firebase sms because basicIntegrity = false");
                            gf0Var.B1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_FALSE");
                        } else if (!optBoolean2) {
                            org.telegram.messenger.f8.b("{SAFETYNET_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false");
                            gf0Var.B1(bundle, auth_sentcode, "SAFETYNET_CTSPROFILEMATCH_FALSE");
                        }
                    } catch (JSONException e) {
                        e = e;
                        org.telegram.messenger.f8.g(e, true);
                        org.telegram.messenger.f8.b("{SAFETYNET_JSON_EXCEPTION} Resend firebase sms because of exception");
                        gf0Var.B1(bundle, auth_sentcode, "SAFETYNET_JSON_EXCEPTION");
                    }
                } catch (JSONException e7) {
                    e = e7;
                }
            } else {
                org.telegram.messenger.f8.b("{SAFETYNET_CANT_SPLIT} Resend firebase sms because can't split JWS token");
                gf0Var.B1(bundle, auth_sentcode, "SAFETYNET_CANT_SPLIT");
            }
        } else {
            org.telegram.messenger.f8.b("{SAFETYNET_NULL_JWS} Resend firebase sms because JWS = null");
            gf0Var.B1(bundle, auth_sentcode, "SAFETYNET_NULL_JWS");
        }
    }

    public static HashSet c1(gf0 gf0Var) {
        List<SubscriptionInfo> list;
        HashSet hashSet = new HashSet();
        try {
            String line1Number = ((TelephonyManager) org.telegram.messenger.w0.f18945b.getSystemService("phone")).getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                hashSet.add(line1Number);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            SubscriptionManager from = SubscriptionManager.from(gf0Var.getParentActivity());
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
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
        return hashSet;
    }

    public static void l1(ImageView imageView, int i10, int i11, PorterDuff.Mode mode) {
        if (imageView != null) {
            if (i10 != i11 || imageView.getColorFilter() == null) {
                imageView.setColorFilter(new PorterDuffColorFilter(i10, mode));
            }
        }
    }

    public static void m1(ImageView imageView, int i10, int i11) {
        if (imageView != null) {
            Drawable background = imageView.getBackground();
            if (background == null) {
                imageView.setBackground(org.telegram.ui.ActionBar.t6.h0(i10, 1, -1));
            } else if (i10 != i11) {
                org.telegram.ui.ActionBar.t6.H1(background, i10, true);
            }
        }
    }

    public static String o1(Exception exc) {
        if (exc == null) {
            return "NULL";
        }
        String simpleName = exc.getClass().getSimpleName();
        if (exc.getMessage() != null) {
            if (simpleName.length() > 0) {
                simpleName = simpleName.concat(" ");
            }
            StringBuilder t10 = a1.g.t(simpleName);
            t10.append(exc.getMessage());
            simpleName = t10.toString();
        }
        return simpleName.toUpperCase().replaceAll(" ", "_");
    }

    public static void s0(gf0 gf0Var, String str, String str2, String str3) {
        if (gf0Var.V.getTag() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gf0Var.getParentActivity());
        String L0 = org.telegram.messenger.dd.L0(2131746114, "ResetMyAccountWarningText");
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.T = L0;
        x1Var.R = org.telegram.messenger.dd.L0(2131746116, "ResetMyAccountWarning");
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131746115, "ResetMyAccountWarningReset"), new a1.d(gf0Var, str, str2, str3, 12));
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, "Cancel"), null);
        gf0Var.showDialog(x1Var);
    }

    public static Bundle s1(int i10, boolean z10) {
        String str;
        try {
            Bundle bundle = new Bundle();
            Context context = org.telegram.messenger.w0.f18945b;
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
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            return null;
        }
    }

    public static int u0(gf0 gf0Var) {
        return gf0Var.currentAccount;
    }

    public static void v1(org.telegram.ui.ActionBar.k2 k2Var, String str, li.k kVar, boolean z10) {
        List list;
        if (k2Var != null && k2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k2Var.getParentActivity());
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            if (z10) {
                x1Var.R = org.telegram.messenger.dd.L0(2131746088, null);
                x1Var.T = org.telegram.messenger.dd.L0(2131753725, "BannedPhoneNumber");
            } else if (kVar != null && (list = (List) kVar.f12102c) != null && !list.isEmpty() && ((mt) kVar.f12101b) != null) {
                int i10 = Integer.MAX_VALUE;
                for (String str2 : (List) kVar.f12102c) {
                    int length = str2.replace(" ", "").length();
                    if (length < i10) {
                        i10 = length;
                    }
                }
                if (af.b.d(str, false).length() - ((mt) kVar.f12101b).f39613c.length() < i10) {
                    x1Var.R = org.telegram.messenger.dd.L0(2131742882, null);
                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("ShortNumberInfo", null, 2131745374, ((mt) kVar.f12101b).f39611a, (String) kVar.d));
                } else {
                    x1Var.R = org.telegram.messenger.dd.L0(2131746088, null);
                    x1Var.T = org.telegram.messenger.dd.L0(2131749189, null);
                }
            } else {
                x1Var.R = org.telegram.messenger.dd.L0(2131746088, null);
                x1Var.T = org.telegram.messenger.dd.L0(2131749189, null);
            }
            alertDialog$Builder.i(org.telegram.messenger.dd.L0(2131753061, "BotHelp"), new ag.v0(str, k2Var, z10));
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, "OK"), null);
            k2Var.showDialog(x1Var);
        }
    }

    public static int x0(gf0 gf0Var) {
        return gf0Var.currentAccount;
    }

    public static int y0(gf0 gf0Var) {
        return gf0Var.currentAccount;
    }

    public final void B1(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str) {
        if (!this.f37490p0) {
            return;
        }
        t1(false, true);
        this.f37490p0 = false;
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = bundle.getString("phoneFormated");
        tL_auth_resendCode.phone_code_hash = auth_sentcode.phone_code_hash;
        if (str != null) {
            tL_auth_resendCode.flags |= 1;
            tL_auth_resendCode.reason = str;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_resendCode, new org.telegram.ui.Components.t20(21, this, bundle), 10);
    }

    public final void C1(boolean z10, boolean z11) {
        if (this.f37472a0 == z10 && z11) {
            return;
        }
        this.f37472a0 = z10;
        if (org.telegram.messenger.i0.C1()) {
            z10 = false;
        }
        if (z10) {
            org.telegram.messenger.i0.v1(this.fragmentView);
            org.telegram.messenger.i0.a3(getParentActivity(), this.classGuid);
            if (z11) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                this.d = duration;
                duration.setInterpolator(org.telegram.ui.Components.gr.f26523f);
                this.d.addUpdateListener(new zb0(this, 2));
                this.d.addListener(new kc0(this, 0));
                this.d.start();
                return;
            }
            this.f37475c.setVisibility(0);
            return;
        }
        org.telegram.messenger.i0.C2(getParentActivity(), this.classGuid);
        if (z11) {
            ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
            this.d = duration2;
            duration2.setInterpolator(org.telegram.ui.Components.vs.e);
            this.d.addUpdateListener(new zb0(this, 0));
            this.d.addListener(new kc0(this, 1));
            this.d.start();
            return;
        }
        this.f37475c.setVisibility(8);
    }

    public final void D1(int i10, boolean z10, Bundle bundle, boolean z11) {
        boolean z12;
        int i11;
        int i12;
        int i13;
        if (i10 != 0 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 10 && i10 != 12 && i10 != 17 && i10 != 16) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (i10 == this.f37471a) {
            z10 = false;
        }
        if (z12) {
            if (i10 == 0) {
                this.f37499w = true;
                this.f37501x = true;
            }
            this.J = 1;
            E1(false, z10);
            F1(false, z10, false);
            this.J = 0;
            F1(false, z10, false);
            if (!z10) {
                E1(true, false);
            }
        } else {
            this.J = 0;
            E1(false, z10);
            F1(false, z10, false);
            if (i10 != 8) {
                this.J = 1;
            }
        }
        org.telegram.ui.Components.av0[] av0VarArr = this.f37473b;
        if (z10) {
            org.telegram.ui.Components.av0 av0Var = av0VarArr[this.f37471a];
            org.telegram.ui.Components.av0 av0Var2 = av0VarArr[i10];
            this.f37471a = i10;
            ImageView imageView = this.U;
            if (!av0Var2.b() && !this.f37503y) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            imageView.setVisibility(i12);
            av0Var2.m(bundle, false);
            setParentActivityTitle(av0Var2.getHeaderName());
            av0Var2.j();
            int i14 = org.telegram.messenger.i0.f16172q.x;
            if (z11) {
                i14 = -i14;
            }
            av0Var2.setX(i14);
            av0Var2.setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new androidx.fragment.app.g(this, z12, av0Var, 8));
            Property property = View.TRANSLATION_X;
            if (z11) {
                i13 = org.telegram.messenger.i0.f16172q.x;
            } else {
                i13 = -org.telegram.messenger.i0.f16172q.x;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(av0Var, property, i13), ObjectAnimator.ofFloat(av0Var2, property, 0.0f));
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.start();
            C1(av0Var2.a(), true);
            return;
        }
        ImageView imageView2 = this.U;
        if (!av0VarArr[i10].b() && !this.f37503y) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        imageView2.setVisibility(i11);
        av0VarArr[this.f37471a].setVisibility(8);
        av0VarArr[this.f37471a].g();
        this.f37471a = i10;
        av0VarArr[i10].m(bundle, false);
        av0VarArr[i10].setVisibility(0);
        setParentActivityTitle(av0VarArr[i10].getHeaderName());
        av0VarArr[i10].j();
        C1(av0VarArr[i10].a(), false);
    }

    public final void E1(boolean z10, boolean z11) {
        boolean z12;
        TimeInterpolator timeInterpolator;
        int i10 = this.J;
        if (i10 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean[] zArr = this.Q;
        if (zArr[i10] != z10) {
            AnimatorSet[] animatorSetArr = this.K;
            AnimatorSet animatorSet = animatorSetArr[i10];
            if (animatorSet != null) {
                if (z11) {
                    animatorSet.removeAllListeners();
                }
                animatorSetArr[this.J].cancel();
            }
            int i11 = this.J;
            zArr[i11] = z10;
            if (z11) {
                animatorSetArr[i11] = new AnimatorSet();
                if (z12) {
                    this.N.e(z10, z11);
                }
                animatorSetArr[this.J].addListener(new org.telegram.ui.ActionBar.g(this, z12, z10, 4));
                int i12 = 150;
                if (z12) {
                    if (z10) {
                        timeInterpolator = org.telegram.messenger.i0.F;
                        i12 = 200;
                    } else {
                        timeInterpolator = org.telegram.messenger.i0.G;
                    }
                } else {
                    timeInterpolator = null;
                }
                animatorSetArr[this.J].setDuration(i12);
                animatorSetArr[this.J].setInterpolator(timeInterpolator);
                animatorSetArr[this.J].start();
            } else if (z12) {
                this.N.e(z10, z11);
            }
        }
    }

    public final void F1(final boolean z10, final boolean z11, boolean z12) {
        boolean z13;
        float f7;
        boolean[] zArr = this.f37483i0;
        if (z11 && zArr[this.J] == z10 && !z12) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.i0.g3(new org.telegram.ui.Components.ez(this, z10, z11, z12, 1));
            return;
        }
        final int i10 = this.J;
        if (i10 == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        boolean[] zArr2 = this.f37485k0;
        if (!z12 && !z13) {
            zArr[i10] = z10;
            if (z11) {
                boolean z14 = zArr2[i10];
                Runnable[] runnableArr = this.f37484j0;
                if (z14) {
                    org.telegram.messenger.i0.r(runnableArr[i10]);
                    zArr2[this.J] = false;
                    return;
                } else if (z10) {
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            gf0 gf0Var = gf0.this;
                            int i11 = gf0Var.J;
                            gf0Var.J = i10;
                            gf0Var.F1(z10, z11, true);
                            gf0Var.J = i11;
                        }
                    };
                    runnableArr[i10] = runnable;
                    org.telegram.messenger.i0.h3(runnable, 2000L);
                    zArr2[this.J] = true;
                    return;
                }
            }
        } else {
            zArr2[i10] = false;
            zArr[i10] = z10;
        }
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z13) {
            this.N.f(z10, z11);
            return;
        }
        float f10 = 0.0f;
        if (z11) {
            this.L = new AnimatorSet();
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
            ofFloat.addListener(new org.telegram.ui.Components.ha0(17, this, z10));
            ofFloat.addUpdateListener(new zb0(this, 1));
            this.L.playTogether(ofFloat);
            this.L.setDuration(150L);
            this.L.start();
        } else if (z10) {
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

    public final void G1(boolean z10, boolean z11) {
        if (z10 == this.f37500w0) {
            return;
        }
        yb0 yb0Var = this.f37502x0;
        if (yb0Var != null) {
            org.telegram.messenger.i0.r(yb0Var);
            this.f37502x0 = null;
        }
        this.f37500w0 = z10;
        this.W.clearAnimation();
        float f7 = 0.0f;
        int i10 = 0;
        if (z11) {
            this.W.setVisibility(0);
            ViewPropertyAnimator animate = this.W.animate();
            if (z10) {
                f7 = 1.0f;
            }
            animate.alpha(f7).withEndAction(new k2.v(28, this, z10)).start();
            return;
        }
        ImageView imageView = this.W;
        if (!z10) {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = this.W;
        if (z10) {
            f7 = 1.0f;
        }
        imageView2.setAlpha(f7);
    }

    public final void H1() {
        boolean z10;
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false));
        ImageView imageView = this.U;
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        l1(imageView, x02, this.f37493r0, PorterDuff.Mode.SRC_ATOP);
        this.f37493r0 = x02;
        ImageView imageView2 = this.U;
        int i11 = org.telegram.ui.ActionBar.t6.f21021i6;
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        m1(imageView2, x03, this.f37495s0);
        this.f37495s0 = x03;
        int x04 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        if (x04 != this.f37496t0 || this.X.getColorFilter() == null) {
            this.X.setColorFilter(new PorterDuffColorFilter(x04, PorterDuff.Mode.SRC_IN));
            this.f37496t0 = x04;
        }
        ImageView imageView3 = this.W;
        int x05 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        m1(imageView3, x05, this.f37497u0);
        this.f37497u0 = x05;
        RadialProgressView radialProgressView = this.V;
        int i12 = org.telegram.ui.ActionBar.t6.P9;
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, i12, false));
        this.N.updateColors();
        this.M.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.O9, false));
        this.M.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, i12, false));
        for (org.telegram.ui.Components.av0 av0Var : this.f37473b) {
            av0Var.updateColors();
        }
        org.telegram.ui.Components.lr lrVar = this.f37475c;
        org.telegram.ui.Components.ir irVar = lrVar.f28245a;
        int x06 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
        if (x06 != lrVar.f28251s || irVar.getColorFilter() == null) {
            lrVar.f28251s = x06;
            irVar.setColorFilter(x06, PorterDuff.Mode.SRC_ATOP);
        }
        int x07 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21021i6, false);
        int o10 = i0.b.o(x07, 30);
        if (x07 != lrVar.f28252w) {
            z10 = true;
        } else {
            z10 = false;
        }
        lrVar.f28252w = x07;
        int i13 = 0;
        while (true) {
            View[] viewArr = lrVar.f28247c;
            if (i13 >= viewArr.length) {
                break;
            }
            View view = viewArr[i13];
            if (view != null) {
                if (view.getBackground() != null) {
                    if (z10) {
                        org.telegram.ui.ActionBar.t6.H1(view.getBackground(), x07, false);
                        org.telegram.ui.ActionBar.t6.H1(view.getBackground(), o10, true);
                    }
                } else {
                    org.telegram.ui.Components.lr.a(i13, view);
                }
                if (view instanceof org.telegram.ui.Components.kr) {
                    ((org.telegram.ui.Components.kr) view).updateColors();
                }
            }
            i13++;
        }
        ve0 ve0Var = this.f37474b0;
        if (ve0Var != null) {
            int i14 = ve0.F;
            ve0Var.b();
        }
    }

    public final void I1(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        if (this.X != null) {
            int connectionState = getConnectionsManager().getConnectionState();
            if (this.f37498v0 != connectionState || z11) {
                this.f37498v0 = connectionState;
                SharedPreferences sharedPreferences = org.telegram.messenger.w0.f18945b.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if (sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i10 = this.f37498v0;
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
                    this.X.b(true, z13, z10);
                    G1(true, z10);
                } else if ((getMessagesController().y3 && !org.telegram.messenger.uz.f18571z1.isEmpty()) || z14) {
                    this.X.b(true, z13, z10);
                    if (this.f37500w0) {
                        return;
                    }
                    yb0 yb0Var = this.f37502x0;
                    if (yb0Var != null) {
                        org.telegram.messenger.i0.r(yb0Var);
                    }
                    this.f37500w0 = true;
                    yb0 yb0Var2 = new yb0(this, 1);
                    this.f37502x0 = yb0Var2;
                    org.telegram.messenger.i0.h3(yb0Var2, 5000L);
                } else {
                    G1(false, z10);
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
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
            if (this.f37488n0) {
                this.m0 = this.fragmentView;
            }
            this.fragmentView = null;
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null && !this.f37488n0) {
            ViewGroup viewGroup2 = (ViewGroup) lVar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                }
            }
            this.actionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    @Override
    public final android.view.View createView(android.content.Context r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gf0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.T1) {
            I1(true, false);
        } else if (i10 == org.telegram.messenger.at.f14781s1 && this.f37482h0) {
            org.telegram.messenger.wp messagesController = getMessagesController();
            if (!messagesController.U3.contains("SETUP_LOGIN_EMAIL") && !messagesController.U3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
                finishFragment();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.f6.a(new g6(11, this), org.telegram.ui.ActionBar.t6.G6, org.telegram.ui.ActionBar.t6.D6, org.telegram.ui.ActionBar.t6.H6, org.telegram.ui.ActionBar.t6.f21021i6, org.telegram.ui.ActionBar.t6.P9, org.telegram.ui.ActionBar.t6.O9, org.telegram.ui.ActionBar.t6.f21059k6, org.telegram.ui.ActionBar.t6.f21077l6, org.telegram.ui.ActionBar.t6.I6, org.telegram.ui.ActionBar.t6.f21171q7, org.telegram.ui.ActionBar.t6.f21312y6, org.telegram.ui.ActionBar.t6.f21022i7, org.telegram.ui.ActionBar.t6.q6, org.telegram.ui.ActionBar.t6.Ki, org.telegram.ui.ActionBar.t6.Q9, org.telegram.ui.ActionBar.t6.f21154p7, org.telegram.ui.ActionBar.t6.J6, org.telegram.ui.ActionBar.t6.Y6, org.telegram.ui.ActionBar.t6.W6, org.telegram.ui.ActionBar.t6.X6, org.telegram.ui.ActionBar.t6.f21002h5, org.telegram.ui.ActionBar.t6.f21170q5, org.telegram.ui.ActionBar.t6.f21038j5);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.b.h(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.f37482h0;
    }

    public final void n1() {
        String str;
        Context context = org.telegram.messenger.w0.f18945b;
        StringBuilder sb2 = new StringBuilder("logininfo2");
        if (this.f37503y) {
            str = "_" + this.currentAccount;
        } else {
            str = "";
        }
        sb2.append(str);
        SharedPreferences.Editor edit = context.getSharedPreferences(sb2.toString(), 0).edit();
        edit.clear();
        edit.commit();
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        vd0 vd0Var = (vd0) this.f37473b[5];
        if (vd0Var != null) {
            vd0Var.L.h(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f37482h0 || this.f37471a != 12) {
            int i10 = this.f37471a;
            org.telegram.ui.Components.av0[] av0VarArr = this.f37473b;
            if (i10 == 0 || (this.F == 3 && i10 == 12)) {
                if (z10) {
                    for (org.telegram.ui.Components.av0 av0Var : av0VarArr) {
                        if (av0Var != null) {
                            av0Var.f();
                        }
                    }
                    n1();
                }
                return true;
            } else if (i10 == 6) {
                if (z10) {
                    av0VarArr[i10].c(true);
                    D1(0, true, null, true);
                    return false;
                }
            } else if (i10 != 7 && i10 != 8) {
                if ((i10 < 1 || i10 > 4) && i10 != 11 && i10 != 15) {
                    if (i10 == 5) {
                        if (z10) {
                            ((vd0) av0VarArr[i10]).f42501x.callOnClick();
                            return false;
                        }
                    } else if (i10 == 9) {
                        if (z10) {
                            av0VarArr[i10].c(true);
                            D1(7, true, null, true);
                            return false;
                        }
                    } else if (i10 == 10) {
                        if (z10) {
                            av0VarArr[i10].c(true);
                            D1(9, true, null, true);
                            return false;
                        }
                    } else if (i10 == 13) {
                        if (z10) {
                            av0VarArr[i10].c(true);
                            D1(12, true, null, true);
                            return false;
                        }
                    } else if (z10 && av0VarArr[i10].c(true)) {
                        D1(0, true, null, true);
                        return false;
                    }
                } else if (z10 && av0VarArr[i10].c(false)) {
                    D1(0, true, null, true);
                    return false;
                }
            } else if (z10) {
                av0VarArr[i10].c(true);
                D1(6, true, null, true);
            }
        }
        return false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        C1(this.f37473b[this.f37471a].a(), false);
        ve0 ve0Var = this.f37474b0;
        if (ve0Var != null) {
            int i10 = ve0.F;
            ve0Var.a();
        }
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        try {
            if (dialog == this.h) {
                ArrayList arrayList = this.f37492r;
                if (!arrayList.isEmpty() && getParentActivity() != null) {
                    getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
                    return;
                }
            }
            if (dialog == this.f37487n) {
                ArrayList arrayList2 = this.f37494s;
                if (!arrayList2.isEmpty() && getParentActivity() != null) {
                    org.telegram.messenger.i0.h3(new yb0(this, 0), 200L);
                    getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.at.T1);
        getNotificationCenter().c(this, org.telegram.messenger.at.f14781s1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        Runnable[] runnableArr;
        super.onFragmentDestroy();
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.av0[] av0VarArr = this.f37473b;
            if (i10 >= av0VarArr.length) {
                break;
            }
            org.telegram.ui.Components.av0 av0Var = av0VarArr[i10];
            if (av0Var != null) {
                av0Var.f();
            }
            i10++;
        }
        org.telegram.ui.ActionBar.x1 x1Var = this.R;
        if (x1Var != null) {
            x1Var.dismiss();
            this.R = null;
        }
        for (Runnable runnable : this.f37484j0) {
            if (runnable != null) {
                org.telegram.messenger.i0.r(runnable);
            }
        }
        getNotificationCenter().n(this, org.telegram.messenger.at.T1);
        getNotificationCenter().n(this, org.telegram.messenger.at.f14781s1);
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.f37503y) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(true, false);
        }
        org.telegram.messenger.i0.C2(getParentActivity(), this.classGuid);
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
            org.telegram.ui.Components.av0[] av0VarArr = this.f37473b;
            if (i10 == 6) {
                this.f37499w = false;
                int i11 = this.f37471a;
                if (i11 == 0) {
                    org.telegram.ui.Components.av0 av0Var = av0VarArr[i11];
                    ((ff0) av0Var).N = true;
                    av0Var.h(null);
                }
            } else if (i10 == 7) {
                this.f37501x = false;
                int i12 = this.f37471a;
                if (i12 == 0) {
                    ((ff0) av0VarArr[i12]).o();
                }
            } else if (i10 == 20) {
                if (z10) {
                    ((vd0) av0VarArr[5]).L.l();
                }
            } else if (i10 == 151 && z10) {
                vd0 vd0Var = (vd0) av0VarArr[5];
                vd0Var.post(new jc0(vd0Var, 0));
            }
        }
    }

    @Override
    public final void onResume() {
        org.telegram.ui.Components.av0 av0Var;
        int i10;
        org.telegram.ui.Components.av0[] av0VarArr = this.f37473b;
        super.onResume();
        if (this.f37503y) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
        }
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        View view = this.fragmentView;
        if (view != null) {
            view.requestLayout();
        }
        try {
            int i11 = this.f37471a;
            if (i11 >= 1 && i11 <= 4) {
                org.telegram.ui.Components.av0 av0Var2 = av0VarArr[i11];
                if ((av0Var2 instanceof le0) && (i10 = ((le0) av0Var2).V) != 0 && Math.abs((System.currentTimeMillis() / 1000) - i10) >= 86400) {
                    av0VarArr[this.f37471a].c(true);
                    D1(0, false, null, true);
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        int i12 = this.f37471a;
        if (i12 == 0 && !this.f37476c0 && (av0Var = av0VarArr[i12]) != null) {
            av0Var.j();
        }
        if (q1()) {
            org.telegram.messenger.i0.v1(this.fragmentView);
            org.telegram.messenger.i0.a3(getParentActivity(), this.classGuid);
        }
        int i13 = this.f37471a;
        if (i13 >= 0 && i13 < av0VarArr.length) {
            av0VarArr[i13].i();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            if (this.fragmentView != null && this.U != null && this.X != null && this.W != null && this.V != null && this.N != null && this.M != null && this.f37475c != null) {
                for (org.telegram.ui.Components.av0 av0Var : this.f37473b) {
                    if (av0Var == null) {
                        return;
                    }
                }
                H1();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void p1(final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, boolean z10) {
        if (auth_sentcode instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
            TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) auth_sentcode;
            bundle.putString("product", tL_auth_sentCodePaymentRequired.store_product);
            bundle.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
            bundle.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
            bundle.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
            bundle.putString("currency", tL_auth_sentCodePaymentRequired.currency);
            bundle.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
            bundle.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
            D1(18, true, bundle, true);
            return;
        }
        TLRPC.auth_SentCodeType auth_sentcodetype = auth_sentcode.type;
        if ((auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms) && !auth_sentcodetype.verifiedFirebase && !this.f37490p0) {
            if (org.telegram.messenger.fu.f15792b.hasServices()) {
                TLRPC.TL_auth_sentCodeTypeFirebaseSms tL_auth_sentCodeTypeFirebaseSms = (TLRPC.TL_auth_sentCodeTypeFirebaseSms) auth_sentcode.type;
                w1(0, true);
                this.f37490p0 = true;
                String string = bundle.getString("phoneFormated");
                if (tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce != null) {
                    IntegrityManager create = IntegrityManagerFactory.create(getParentActivity());
                    String str = new String(Base64.encode(tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce, 8));
                    org.telegram.messenger.f8.b("getting classic integrity with nonce = ".concat(str));
                    create.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).setCloudProjectNumber(tL_auth_sentCodeTypeFirebaseSms.play_integrity_project_id).build()).addOnSuccessListener(new cc0(this, bundle, auth_sentcode, string, z10)).addOnFailureListener(new OnFailureListener(this) {
                        public final gf0 f36556b;

                        {
                            this.f36556b = this;
                        }

                        @Override
                        public final void onFailure(Exception exc) {
                            switch (r4) {
                                case 0:
                                    String str2 = "PLAYINTEGRITY_EXCEPTION_" + gf0.o1(exc);
                                    org.telegram.messenger.f8.e("{" + str2 + "} Resend firebase sms because integrity threw error", exc);
                                    this.f36556b.B1(bundle, auth_sentcode, str2);
                                    return;
                                default:
                                    org.telegram.messenger.f8.g(exc, true);
                                    String str3 = "SAFETYNET_EXCEPTION_" + gf0.o1(exc);
                                    org.telegram.messenger.f8.b("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                    this.f36556b.B1(bundle, auth_sentcode, str3);
                                    return;
                            }
                        }
                    });
                    return;
                }
                com.google.android.gms.common.api.j jVar = new com.google.android.gms.common.api.j(org.telegram.messenger.w0.f18945b, m8.c.f13025a, (com.google.android.gms.common.api.a) null, (com.google.android.gms.common.api.internal.t) new Object());
                byte[] bArr = auth_sentcode.type.nonce;
                String str2 = org.telegram.messenger.v2.f18581f;
                com.google.android.gms.common.api.internal.u0 u0Var = jVar.h;
                b8.e eVar = new b8.e(u0Var, bArr, str2);
                u0Var.f4493b.d(0, eVar);
                n6.l.m(eVar, new n6.m(new Object())).addOnSuccessListener(new cc0(this, string, auth_sentcode, bundle, z10)).addOnFailureListener(new OnFailureListener(this) {
                    public final gf0 f36556b;

                    {
                        this.f36556b = this;
                    }

                    @Override
                    public final void onFailure(Exception exc) {
                        switch (r4) {
                            case 0:
                                String str22 = "PLAYINTEGRITY_EXCEPTION_" + gf0.o1(exc);
                                org.telegram.messenger.f8.e("{" + str22 + "} Resend firebase sms because integrity threw error", exc);
                                this.f36556b.B1(bundle, auth_sentcode, str22);
                                return;
                            default:
                                org.telegram.messenger.f8.g(exc, true);
                                String str3 = "SAFETYNET_EXCEPTION_" + gf0.o1(exc);
                                org.telegram.messenger.f8.b("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                this.f36556b.B1(bundle, auth_sentcode, str3);
                                return;
                        }
                    }
                });
                return;
            }
            org.telegram.messenger.f8.b("{GOOGLE_PLAY_SERVICES_NOT_AVAILABLE} Resend firebase sms because firebase is not available");
            B1(bundle, auth_sentcode, "GOOGLE_PLAY_SERVICES_NOT_AVAILABLE");
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
            D1(1, z10, bundle, false);
            return;
        }
        if (auth_sentcode.timeout == 0) {
            boolean z11 = org.telegram.messenger.v2.f18578a;
            auth_sentcode.timeout = 60;
        }
        bundle.putInt("timeout", auth_sentcode.timeout * 1000);
        TLRPC.auth_SentCodeType auth_sentcodetype2 = auth_sentcode.type;
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt("type", 4);
            bundle.putInt("length", auth_sentcode.type.length);
            D1(4, z10, bundle, false);
        } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", auth_sentcode.type.pattern);
            D1(3, z10, bundle, false);
        } else if (!(auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSms) && !(auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFragmentSms) {
                bundle.putInt("type", 15);
                bundle.putString("url", auth_sentcode.type.url);
                bundle.putInt("length", auth_sentcode.type.length);
                D1(15, z10, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeMissedCall) {
                bundle.putInt("type", 11);
                bundle.putInt("length", auth_sentcode.type.length);
                bundle.putString("prefix", auth_sentcode.type.prefix);
                D1(11, z10, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSetUpEmailRequired) {
                bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
                D1(12, z10, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
                bundle.putString("emailPattern", auth_sentcode.type.email_pattern);
                bundle.putInt("length", auth_sentcode.type.length);
                bundle.putInt("nextPhoneLoginDate", auth_sentcode.type.next_phone_login_date);
                bundle.putInt("resetAvailablePeriod", auth_sentcode.type.reset_available_period);
                bundle.putInt("resetPendingDate", auth_sentcode.type.reset_pending_date);
                D1(14, z10, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                String str3 = auth_sentcodetype2.beginning;
                if (str3 != null) {
                    bundle.putString("beginning", str3);
                }
                D1(16, z10, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                String str4 = auth_sentcodetype2.beginning;
                if (str4 != null) {
                    bundle.putString("beginning", str4);
                }
                D1(17, z10, bundle, false);
            }
        } else {
            bundle.putInt("type", 2);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putBoolean("firebase", auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms);
            D1(2, z10, bundle, false);
        }
    }

    public final boolean q1() {
        if (this.f37473b[this.f37471a].a() && !org.telegram.messenger.i0.C1()) {
            return true;
        }
        return false;
    }

    public final boolean r1() {
        if (this.F == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("currentViewNum", this.f37471a);
            bundle2.putInt("syncContacts", this.D ? 1 : 0);
            for (int i10 = 0; i10 <= this.f37471a; i10++) {
                org.telegram.ui.Components.av0 av0Var = this.f37473b[i10];
                if (av0Var != null) {
                    av0Var.l(bundle2);
                }
            }
            Context context = org.telegram.messenger.w0.f18945b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("logininfo2");
            if (this.f37503y) {
                str = "_" + this.currentAccount;
            } else {
                str = "";
            }
            sb2.append(str);
            SharedPreferences.Editor edit = context.getSharedPreferences(sb2.toString(), 0).edit();
            edit.clear();
            A1(bundle2, edit, null);
            edit.commit();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void t1(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.x1 x1Var;
        if (this.P != 0) {
            if (z10) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.P, true);
            }
            this.P = 0;
        }
        if (r1() && (x1Var = this.R) != null) {
            x1Var.dismiss();
            this.R = null;
        }
        F1(false, z11, false);
    }

    public final void u1(String str, String str2) {
        if (str2 != null && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = str;
            x1Var.T = str2;
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, "OK"), null);
            showDialog(x1Var);
        }
    }

    public final void w1(int i10, boolean z10) {
        if (r1() && i10 == 0) {
            if (this.R == null && getParentActivity() != null && !getParentActivity().isFinishing()) {
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), null);
                this.R = x1Var;
                x1Var.f21489i0 = false;
                x1Var.show();
                return;
            }
            return;
        }
        this.P = i10;
        F1(true, z10, false);
    }

    public final void x1(TLRPC.TL_auth_authorization tL_auth_authorization, boolean z10) {
        org.telegram.messenger.wp.r1(this.currentAccount).Q();
        ConnectionsManager.getInstance(this.currentAccount).setUserId(tL_auth_authorization.user.f19943id);
        org.telegram.messenger.e20.i(this.currentAccount).b();
        org.telegram.messenger.wp.r1(this.currentAccount).Q();
        org.telegram.messenger.e20.i(this.currentAccount).U = this.D;
        org.telegram.messenger.e20.i(this.currentAccount).w(tL_auth_authorization.user);
        org.telegram.messenger.e20.i(this.currentAccount).v(true);
        org.telegram.messenger.is a02 = org.telegram.messenger.is.a0(this.currentAccount);
        a02.f16331a.c(new org.telegram.messenger.lr(a02, true, 1));
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_auth_authorization.user);
        org.telegram.messenger.is.a0(this.currentAccount).m1(arrayList, null, true, true);
        org.telegram.messenger.wp.r1(this.currentAccount).U3(tL_auth_authorization.user, false, false);
        org.telegram.messenger.i5 r10 = org.telegram.messenger.i5.r(this.currentAccount);
        r10.f16211a = null;
        Utilities.e.c(new org.telegram.messenger.a5(r10, 0));
        Utilities.d.c(new org.telegram.messenger.ak(org.telegram.messenger.wp.r1(this.currentAccount), 25));
        ConnectionsManager.getInstance(this.currentAccount).updateDcSettings();
        org.telegram.messenger.wp.r1(this.currentAccount).P2(true);
        org.telegram.messenger.wp.r1(this.currentAccount).f3();
        org.telegram.messenger.wp.r1(this.currentAccount).M(false);
        byte[] bArr = tL_auth_authorization.future_auth_token;
        if (bArr != null) {
            boolean z11 = org.telegram.messenger.v2.f18578a;
            org.telegram.messenger.f8.b("saveLogInToken ".concat(new String(bArr, StandardCharsets.UTF_8)));
            ArrayList b10 = org.telegram.messenger.y0.b();
            if (b10 == null) {
                b10 = new ArrayList();
            }
            b10.add(0, tL_auth_authorization);
            SharedPreferences sharedPreferences = org.telegram.messenger.w0.f18945b.getSharedPreferences("saved_tokens_login", 0);
            ArrayList arrayList2 = new ArrayList();
            sharedPreferences.edit().clear().apply();
            for (int i10 = 0; i10 < Math.min(20, b10.size()); i10++) {
                arrayList2.add((TLRPC.TL_auth_authorization) b10.get(i10));
            }
            if (arrayList2.size() > 0) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("count", arrayList2.size());
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    SerializedData serializedData = new SerializedData(((TLRPC.TL_auth_authorization) arrayList2.get(i11)).getObjectSize());
                    ((TLRPC.TL_auth_authorization) arrayList2.get(i11)).serializeToStream(serializedData);
                    edit.putString("log_in_token_" + i11, Utilities.f(serializedData.toByteArray()));
                }
                edit.apply();
                BackupAgent.a();
            }
        } else {
            org.telegram.messenger.f8.b("onAuthSuccess future_auth_token is empty");
        }
        if (z10) {
            org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(this.currentAccount);
            r12.f19088b2.put(0, true);
            r12.f19098c2.put(0, true);
        }
        org.telegram.messenger.vi.b0(this.currentAccount).c1("tg_placeholders_android", false, true);
        boolean z12 = tL_auth_authorization.setup_password_required;
        int i12 = tL_auth_authorization.otherwise_relogin_days;
        if (getParentActivity() != null) {
            org.telegram.messenger.i0.o3(getParentActivity(), false);
        }
        n1();
        if (getParentActivity() instanceof LaunchActivity) {
            if (this.f37503y) {
                this.f37503y = false;
                this.f37488n0 = true;
                ((LaunchActivity) getParentActivity()).P0(this.currentAccount, new i2.y(6, z10));
                this.f37488n0 = false;
                finishFragment();
                return;
            }
            if (z10 && z12) {
                rc1 rc1Var = new rc1(6, null);
                rc1Var.G = i12;
                rc1Var.H = true;
                presentFragment(rc1Var, true);
            } else {
                Bundle g10 = a1.g.g("afterSignup", z10);
                of0 of0Var = new of0();
                of0Var.r0(g10);
                presentFragment(of0Var, true);
            }
            org.telegram.messenger.at.f(this.currentAccount).k(org.telegram.messenger.at.f14728j0, new Object[0]);
            org.telegram.messenger.dd.D0().S0(this.currentAccount, true);
            e01.a0(true);
        } else if (getParentActivity() instanceof ExternalActionActivity) {
            ExternalActionActivity externalActionActivity = (ExternalActionActivity) getParentActivity();
            externalActionActivity.d(externalActionActivity.h, externalActionActivity.f33333n, externalActionActivity.f33336w, true, externalActionActivity.f33334r, externalActionActivity.f33335s);
            externalActionActivity.f33331c.Z();
            ActionBarLayout actionBarLayout = externalActionActivity.d;
            if (actionBarLayout != null) {
                actionBarLayout.Z();
            }
            org.telegram.ui.Components.vu0 vu0Var = externalActionActivity.e;
            if (vu0Var != null) {
                vu0Var.setVisibility(0);
            }
        }
    }

    public final void y1() {
        if (this.Q[this.J]) {
            if (this.V.getTag() != null) {
                if (getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String L0 = org.telegram.messenger.dd.L0(2131744850, "StopLoadingTitle");
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.dd.L0(2131744851, "StopLoading");
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131743239, "WaitMore"), null);
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131744859, "Stop"), new bc0(this, 0));
                showDialog(x1Var);
                return;
            }
            this.f37473b[this.f37471a].h(null);
        }
    }

    public final void z1(String str, TLRPC.auth_SentCode auth_sentcode) {
        if (this.fragmentView == null) {
            this.f37489o0 = new qq(this, str, auth_sentcode, 26);
            return;
        }
        this.e = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + str);
        bundle.putString("ephone", "+" + str);
        bundle.putString("phoneFormated", str);
        p1(bundle, auth_sentcode, true);
    }

    public gf0(int i10) {
        super(null);
        this.f37473b = new org.telegram.ui.Components.av0[19];
        this.f37492r = new ArrayList();
        this.f37494s = new ArrayList();
        this.f37499w = true;
        this.f37501x = true;
        this.D = true;
        this.E = false;
        this.F = 0;
        this.K = new AnimatorSet[2];
        this.Q = new boolean[]{true, false};
        this.f37472a0 = false;
        this.f37483i0 = new boolean[2];
        this.f37484j0 = new Runnable[2];
        this.f37485k0 = new boolean[2];
        this.currentAccount = i10;
        this.f37503y = true;
    }
}
