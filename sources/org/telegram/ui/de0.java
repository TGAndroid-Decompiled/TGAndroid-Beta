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
import android.widget.Space;
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
public final class de0 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public static final int A0;
    public boolean E;
    public boolean F;
    public int G;
    public String H;
    public Bundle I;
    public TLRPC.TL_auth_sentCode J;
    public int K;
    public final AnimatorSet[] L;
    public AnimatorSet M;
    public org.telegram.ui.Components.h21 N;
    public org.telegram.ui.Components.a10 O;
    public h6.m P;
    public int Q;
    public final boolean[] R;
    public org.telegram.ui.ActionBar.u1 S;
    public v8 T;
    public rd0 U;
    public ImageView V;
    public RadialProgressView W;
    public ImageView X;
    public org.telegram.ui.Components.vg0 Y;
    public LinearLayout Z;
    public int f46933a;
    public k0 f46934a0;
    public final org.telegram.ui.Components.fu0[] f46935b;
    public boolean f46936b0;
    public org.telegram.ui.Components.pr f46937c;
    public qd0 f46938c0;
    public ValueAnimator d;
    public boolean f46939d0;
    public boolean f46940e;
    public Runnable f46941e0;
    public boolean f46942f;
    public zu f46943f0;
    public TextView f46944g0;
    public Dialog h;
    public boolean f46945h0;
    public boolean f46946i0;
    public final boolean[] f46947j0;
    public final Runnable[] f46948k0;
    public final boolean[] f46949l0;
    public boolean m0;
    public Dialog f46950n;
    public Space f46951n0;
    public View f46952o0;
    public boolean f46953p0;
    public up f46954q0;
    public final ArrayList f46955r;
    public boolean f46956r0;
    public final ArrayList f46957s;
    public TLRPC.TL_help_termsOfService f46958s0;
    public int f46959t0;
    public int f46960u0;
    public int f46961v0;
    public boolean f46962w;
    public int f46963w0;
    public boolean f46964x;
    public int f46965x0;
    public boolean f46966y;
    public boolean f46967y0;
    public qa0 f46968z0;

    static {
        int i7;
        if (org.telegram.messenger.bz.o() <= 1) {
            i7 = 150;
        } else {
            i7 = 100;
        }
        A0 = i7;
    }

    public de0() {
        super(null);
        this.f46935b = new org.telegram.ui.Components.fu0[19];
        this.f46955r = new ArrayList();
        this.f46957s = new ArrayList();
        this.f46962w = true;
        this.f46964x = true;
        this.E = true;
        this.F = false;
        this.G = 0;
        this.L = new AnimatorSet[2];
        this.R = new boolean[]{true, false};
        this.f46936b0 = false;
        this.f46947j0 = new boolean[2];
        this.f46948k0 = new Runnable[2];
        this.f46949l0 = new boolean[2];
    }

    public static Bundle B1(int i7, boolean z10) {
        String str;
        try {
            Bundle bundle = new Bundle();
            Context context = org.telegram.messenger.t0.f26915b;
            StringBuilder sb2 = new StringBuilder("logininfo2");
            if (z10) {
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

    public static void E1(org.telegram.ui.ActionBar.h2 h2Var, String str, md0 md0Var, boolean z10) {
        List list;
        if (h2Var != null && h2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h2Var.getParentActivity());
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
            if (z10) {
                u1Var.S = org.telegram.messenger.gd.M0(2131745876, null);
                u1Var.U = org.telegram.messenger.gd.M0(2131753723, "BannedPhoneNumber");
            } else if (md0Var != null && (list = (List) md0Var.f49839c) != null && !list.isEmpty() && ((ps) md0Var.f49838b) != null) {
                int i7 = Integer.MAX_VALUE;
                for (String str2 : (List) md0Var.f49839c) {
                    int length = str2.replace(" ", "").length();
                    if (length < i7) {
                        i7 = length;
                    }
                }
                if (pf.b.d(str, false).length() - ((ps) md0Var.f49838b).f51001c.length() < i7) {
                    u1Var.S = org.telegram.messenger.gd.M0(2131742599, null);
                    u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("ShortNumberInfo", null, 2131745161, ((ps) md0Var.f49838b).f50999a, (String) md0Var.d));
                } else {
                    u1Var.S = org.telegram.messenger.gd.M0(2131745876, null);
                    u1Var.U = org.telegram.messenger.gd.M0(2131748987, null);
                }
            } else {
                u1Var.S = org.telegram.messenger.gd.M0(2131745876, null);
                u1Var.U = org.telegram.messenger.gd.M0(2131748987, null);
            }
            alertDialog$Builder.i(org.telegram.messenger.gd.M0(2131753059, "BotHelp"), new ab.j(str, h2Var, z10));
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, "OK"), null);
            h2Var.showDialog(u1Var);
        }
    }

    public static void J1(Bundle bundle, SharedPreferences.Editor editor, String str) {
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof String) {
                if (str != null) {
                    editor.putString(a8.p0.E(str, "_|_", str2), (String) obj);
                } else {
                    editor.putString(str2, (String) obj);
                }
            } else if (obj instanceof Integer) {
                if (str != null) {
                    editor.putInt(a8.p0.E(str, "_|_", str2), ((Integer) obj).intValue());
                } else {
                    editor.putInt(str2, ((Integer) obj).intValue());
                }
            } else if (obj instanceof Boolean) {
                if (str != null) {
                    editor.putBoolean(a8.p0.E(str, "_|_", str2), ((Boolean) obj).booleanValue());
                } else {
                    editor.putBoolean(str2, ((Boolean) obj).booleanValue());
                }
            } else if (obj instanceof Bundle) {
                J1((Bundle) obj, editor, str2);
            }
        }
    }

    public static void Z(de0 de0Var, String str, String str2, String str3) {
        de0Var.F1(0, true);
        TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
        deleteaccount.reason = "Forgot password";
        ConnectionsManager.getInstance(de0Var.currentAccount).sendRequest(deleteaccount, new bi.g2(de0Var, str, str2, str3, 14), 10);
    }

    public static void a0(de0 de0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            org.telegram.messenger.a8.b("Resend firebase sms because integrity token = null");
            de0Var.K1(bundle, auth_sentcode, "PLAYINTEGRITY_TOKEN_NULL");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.play_integrity_token = str2;
        tL_auth_requestFirebaseSms.flags |= 4;
        ConnectionsManager.getInstance(de0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new wa0(1, bundle, auth_sentcode, de0Var, z10), 10);
    }

    public static void b0(de0 de0Var, TLRPC.TL_error tL_error, String str, String str2, String str3) {
        de0Var.C1(false, true);
        if (tL_error == null) {
            if (str != null && str2 != null && str3 != null) {
                Bundle bundle = new Bundle();
                bundle.putString("phoneFormated", str);
                bundle.putString("phoneHash", str2);
                bundle.putString("code", str3);
                de0Var.M1(5, true, bundle, false);
                return;
            }
            de0Var.M1(0, true, null, true);
        } else if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
            de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131745920, "ResetAccountCancelledAlert"));
        } else if (tL_error.text.startsWith("2FA_CONFIRM_WAIT_")) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("phoneFormated", str);
            bundle2.putString("phoneHash", str2);
            bundle2.putString("code", str3);
            bundle2.putInt("startTime", ConnectionsManager.getInstance(de0Var.currentAccount).getCurrentTime());
            bundle2.putInt("waitTime", Utilities.z(tL_error.text.replace("2FA_CONFIRM_WAIT_", "")).intValue());
            de0Var.M1(8, true, bundle2, false);
        } else {
            de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), tL_error.text);
        }
    }

    public static boolean b1(de0 de0Var, View view) {
        if (!de0Var.z1()) {
            return org.telegram.messenger.g0.I3(view);
        }
        return true;
    }

    public static void c0(de0 de0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10, p8.d dVar) {
        String str2;
        p8.e eVar = ((e8.d) ((com.google.android.gms.common.api.r) dVar.f6398a)).f10876b;
        if (eVar == null) {
            str2 = null;
        } else {
            str2 = eVar.f55493a;
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
                            ConnectionsManager.getInstance(de0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new wa0(0, bundle, auth_sentcode, de0Var, z10), 10);
                        } else if (!optBoolean && !optBoolean2) {
                            org.telegram.messenger.a8.b("{SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false and basicIntegrity = false");
                            de0Var.K1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE");
                        } else if (!optBoolean) {
                            org.telegram.messenger.a8.b("{SAFETYNET_BASICINTEGRITY_FALSE} Resend firebase sms because basicIntegrity = false");
                            de0Var.K1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_FALSE");
                        } else if (!optBoolean2) {
                            org.telegram.messenger.a8.b("{SAFETYNET_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false");
                            de0Var.K1(bundle, auth_sentcode, "SAFETYNET_CTSPROFILEMATCH_FALSE");
                        }
                    } catch (JSONException e10) {
                        e = e10;
                        org.telegram.messenger.a8.g(e, true);
                        org.telegram.messenger.a8.b("{SAFETYNET_JSON_EXCEPTION} Resend firebase sms because of exception");
                        de0Var.K1(bundle, auth_sentcode, "SAFETYNET_JSON_EXCEPTION");
                    }
                } catch (JSONException e11) {
                    e = e11;
                }
            } else {
                org.telegram.messenger.a8.b("{SAFETYNET_CANT_SPLIT} Resend firebase sms because can't split JWS token");
                de0Var.K1(bundle, auth_sentcode, "SAFETYNET_CANT_SPLIT");
            }
        } else {
            org.telegram.messenger.a8.b("{SAFETYNET_NULL_JWS} Resend firebase sms because JWS = null");
            de0Var.K1(bundle, auth_sentcode, "SAFETYNET_NULL_JWS");
        }
    }

    public static void c1(de0 de0Var, View view, boolean z10) {
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        org.telegram.messenger.g0.E3(3.5f, view, null);
        if (z10 && (view instanceof org.telegram.ui.Components.xb0)) {
            Runnable runnable = (Runnable) view.getTag(2131296713);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
            org.telegram.ui.Components.xb0 xb0Var = (org.telegram.ui.Components.xb0) view;
            AtomicReference atomicReference = new AtomicReference();
            EditText attachedEditText = xb0Var.getAttachedEditText();
            bi.v vVar = new bi.v(attachedEditText, atomicReference, false, 12);
            xb0Var.a(1.0f);
            org.telegram.ui.Components.n20 n20Var = new org.telegram.ui.Components.n20(xb0Var, view, attachedEditText, vVar, 23);
            atomicReference.set(n20Var);
            view.postDelayed(n20Var, 2000L);
            view.setTag(2131296713, n20Var);
            if (attachedEditText != null) {
                attachedEditText.addTextChangedListener(vVar);
            }
        }
    }

    public static HashSet d1(de0 de0Var) {
        List<SubscriptionInfo> list;
        HashSet hashSet = new HashSet();
        try {
            String line1Number = ((TelephonyManager) org.telegram.messenger.t0.f26915b.getSystemService("phone")).getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                hashSet.add(line1Number);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            int i7 = Build.VERSION.SDK_INT;
            SubscriptionManager from = SubscriptionManager.from(de0Var.getParentActivity());
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

    public static int m1(de0 de0Var) {
        return de0Var.currentAccount;
    }

    public static int s0(de0 de0Var) {
        return de0Var.currentAccount;
    }

    public static void t0(de0 de0Var, String str, String str2, String str3) {
        if (de0Var.W.getTag() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
        String M0 = org.telegram.messenger.gd.M0(2131745902, "ResetMyAccountWarningText");
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.U = M0;
        u1Var.S = org.telegram.messenger.gd.M0(2131745904, "ResetMyAccountWarning");
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745903, "ResetMyAccountWarningReset"), new a1.d(de0Var, str, str2, str3, 16));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, "Cancel"), null);
        de0Var.showDialog(u1Var);
    }

    public static void u1(ImageView imageView, int i7, int i10, PorterDuff.Mode mode) {
        if (imageView != null) {
            if (i7 != i10 || imageView.getColorFilter() == null) {
                imageView.setColorFilter(new PorterDuffColorFilter(i7, mode));
            }
        }
    }

    public static int v0(de0 de0Var) {
        return de0Var.currentAccount;
    }

    public static void v1(ImageView imageView, int i7, int i10) {
        if (imageView != null) {
            Drawable background = imageView.getBackground();
            if (background == null) {
                imageView.setBackground(org.telegram.ui.ActionBar.n6.h0(i7, 1, -1));
            } else if (i7 != i10) {
                org.telegram.ui.ActionBar.n6.H1(background, i7, true);
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
            StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(simpleName);
            m10.append(exc.getMessage());
            simpleName = m10.toString();
        }
        return simpleName.toUpperCase().replaceAll(" ", "_");
    }

    public final boolean A1() {
        if (this.G == 1) {
            return true;
        }
        return false;
    }

    public final void C1(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.u1 u1Var;
        if (this.Q != 0) {
            if (z10) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.Q, true);
            }
            this.Q = 0;
        }
        if (A1() && (u1Var = this.S) != null) {
            u1Var.dismiss();
            this.S = null;
        }
        O1(false, z11, false);
    }

    public final void D1(String str, String str2) {
        if (str2 != null && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
            u1Var.S = str;
            u1Var.U = str2;
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, "OK"), null);
            showDialog(u1Var);
        }
    }

    public final void F1(int i7, boolean z10) {
        if (A1() && i7 == 0) {
            if (this.S == null && getParentActivity() != null && !getParentActivity().isFinishing()) {
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
                this.S = u1Var;
                u1Var.f30049j0 = false;
                u1Var.show();
                return;
            }
            return;
        }
        this.Q = i7;
        O1(true, z10, false);
    }

    public final void G1(TLRPC.TL_auth_authorization tL_auth_authorization, boolean z10) {
        org.telegram.messenger.mp.u1(this.currentAccount).Q();
        ConnectionsManager.getInstance(this.currentAccount).setUserId(tL_auth_authorization.user.f28554id);
        org.telegram.messenger.j10.i(this.currentAccount).b();
        org.telegram.messenger.mp.u1(this.currentAccount).Q();
        org.telegram.messenger.j10.i(this.currentAccount).V = this.E;
        org.telegram.messenger.j10.i(this.currentAccount).w(tL_auth_authorization.user);
        org.telegram.messenger.j10.i(this.currentAccount).v(true);
        org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(this.currentAccount);
        a02.f27054a.c(new org.telegram.messenger.yq(a02, true, 1));
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_auth_authorization.user);
        org.telegram.messenger.tr.a0(this.currentAccount).m1(arrayList, null, true, true);
        org.telegram.messenger.mp.u1(this.currentAccount).e4(tL_auth_authorization.user, false, false);
        org.telegram.messenger.i5 r10 = org.telegram.messenger.i5.r(this.currentAccount);
        r10.f24560a = null;
        Utilities.f22782e.c(new org.telegram.messenger.m4(r10, 0));
        Utilities.d.c(new org.telegram.messenger.rj(org.telegram.messenger.mp.u1(this.currentAccount), 28));
        ConnectionsManager.getInstance(this.currentAccount).updateDcSettings();
        org.telegram.messenger.mp.u1(this.currentAccount).X2(true);
        org.telegram.messenger.mp.u1(this.currentAccount).o3();
        org.telegram.messenger.mp.u1(this.currentAccount).M(false);
        byte[] bArr = tL_auth_authorization.future_auth_token;
        if (bArr != null) {
            boolean z11 = org.telegram.messenger.s2.f26723a;
            org.telegram.messenger.a8.b("saveLogInToken ".concat(new String(bArr, StandardCharsets.UTF_8)));
            ArrayList b10 = org.telegram.messenger.v0.b();
            if (b10 == null) {
                b10 = new ArrayList();
            }
            b10.add(0, tL_auth_authorization);
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26915b.getSharedPreferences("saved_tokens_login", 0);
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
        if (z10) {
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(this.currentAccount);
            u12.f25636e2.put(0, true);
            u12.f25646f2.put(0, true);
        }
        org.telegram.messenger.ri.d0(this.currentAccount).f1("tg_placeholders_android", false, true);
        boolean z12 = tL_auth_authorization.setup_password_required;
        int i11 = tL_auth_authorization.otherwise_relogin_days;
        if (getParentActivity() != null) {
            org.telegram.messenger.g0.o3(getParentActivity(), false);
        }
        w1();
        if (getParentActivity() instanceof LaunchActivity) {
            if (this.f46966y) {
                this.f46966y = false;
                this.f46953p0 = true;
                ((LaunchActivity) getParentActivity()).P0(this.currentAccount, new l2.v(3, z10));
                this.f46953p0 = false;
                finishFragment();
                return;
            }
            if (z10 && z12) {
                bb1 bb1Var = new bb1(6, null);
                bb1Var.H = i11;
                bb1Var.I = true;
                presentFragment(bb1Var, true);
            } else {
                Bundle k10 = a8.p0.k("afterSignup", z10);
                le0 le0Var = new le0();
                le0Var.r0(k10);
                presentFragment(le0Var, true);
            }
            org.telegram.messenger.ks.f(this.currentAccount).k(org.telegram.messenger.ks.f25136j0, new Object[0]);
            org.telegram.messenger.gd.E0().V0(this.currentAccount, true);
            sy0.a0(true);
        } else if (getParentActivity() instanceof ExternalActionActivity) {
            ExternalActionActivity externalActionActivity = (ExternalActionActivity) getParentActivity();
            externalActionActivity.e(externalActionActivity.h, externalActionActivity.f43044n, externalActionActivity.f43047w, true, externalActionActivity.f43045r, externalActionActivity.f43046s);
            externalActionActivity.f43041c.a0();
            ActionBarLayout actionBarLayout = externalActionActivity.d;
            if (actionBarLayout != null) {
                actionBarLayout.a0();
            }
            org.telegram.ui.Components.au0 au0Var = externalActionActivity.f43042e;
            if (au0Var != null) {
                au0Var.setVisibility(0);
            }
        }
    }

    public final void H1() {
        if (this.R[this.K]) {
            if (this.W.getTag() != null) {
                if (getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = org.telegram.messenger.gd.M0(2131744597, "StopLoadingTitle");
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                u1Var.S = M0;
                u1Var.U = org.telegram.messenger.gd.M0(2131744598, "StopLoading");
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131742976, "WaitMore"), null);
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131744606, "Stop"), new ta0(this, 0));
                showDialog(u1Var);
                return;
            }
            this.f46935b[this.f46933a].h(null);
        }
    }

    public final void I1(String str, TLRPC.auth_SentCode auth_sentcode) {
        if (this.fragmentView == null) {
            this.f46954q0 = new up(this, str, auth_sentcode, 26);
            return;
        }
        this.f46940e = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + str);
        bundle.putString("ephone", "+" + str);
        bundle.putString("phoneFormated", str);
        y1(bundle, auth_sentcode, true);
    }

    public final void K1(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str) {
        if (!this.f46956r0) {
            return;
        }
        C1(false, true);
        this.f46956r0 = false;
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = bundle.getString("phoneFormated");
        tL_auth_resendCode.phone_code_hash = auth_sentcode.phone_code_hash;
        if (str != null) {
            tL_auth_resendCode.flags |= 1;
            tL_auth_resendCode.reason = str;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_resendCode, new e00(9, this, bundle), 10);
    }

    public final void L1(boolean z10, boolean z11) {
        if (this.f46936b0 == z10 && z11) {
            return;
        }
        this.f46936b0 = z10;
        if (org.telegram.messenger.g0.C1()) {
            z10 = false;
        }
        if (z10) {
            org.telegram.messenger.g0.v1(this.fragmentView);
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
            if (z11) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                this.d = duration;
                duration.setInterpolator(org.telegram.ui.Components.lr.f37208f);
                this.d.addUpdateListener(new ra0(this, 2));
                this.d.addListener(new cb0(this, 0));
                this.d.start();
                return;
            }
            this.f46937c.setVisibility(0);
            return;
        }
        org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
        if (z11) {
            ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
            this.d = duration2;
            duration2.setInterpolator(org.telegram.ui.Components.xs.f42178e);
            this.d.addUpdateListener(new ra0(this, 0));
            this.d.addListener(new cb0(this, 1));
            this.d.start();
            return;
        }
        this.f46937c.setVisibility(8);
    }

    public final void M1(int i7, boolean z10, Bundle bundle, boolean z11) {
        boolean z12;
        int i10;
        int i11;
        if (i7 != 0 && i7 != 5 && i7 != 6 && i7 != 9 && i7 != 10 && i7 != 12 && i7 != 17 && i7 != 16) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (i7 == this.f46933a) {
            z10 = false;
        }
        int i12 = 8;
        if (z12) {
            if (i7 == 0) {
                this.f46962w = true;
                this.f46964x = true;
            }
            this.K = 1;
            N1(false, z10);
            O1(false, z10, false);
            this.K = 0;
            O1(false, z10, false);
            if (!z10) {
                N1(true, false);
            }
        } else {
            this.K = 0;
            N1(false, z10);
            O1(false, z10, false);
            if (i7 != 8) {
                this.K = 1;
            }
        }
        org.telegram.ui.Components.fu0[] fu0VarArr = this.f46935b;
        if (z10) {
            org.telegram.ui.Components.fu0 fu0Var = fu0VarArr[this.f46933a];
            org.telegram.ui.Components.fu0 fu0Var2 = fu0VarArr[i7];
            this.f46933a = i7;
            ImageView imageView = this.V;
            if (fu0Var2.b() || this.f46966y) {
                i12 = 0;
            }
            imageView.setVisibility(i12);
            fu0Var2.m(bundle, false);
            setParentActivityTitle(fu0Var2.getHeaderName());
            fu0Var2.j();
            int i13 = org.telegram.messenger.g0.f24121q.x;
            if (z11) {
                i13 = -i13;
            }
            fu0Var2.setX(i13);
            fu0Var2.setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new androidx.fragment.app.g(this, z12, fu0Var, 11));
            Property property = View.TRANSLATION_X;
            if (z11) {
                i11 = org.telegram.messenger.g0.f24121q.x;
            } else {
                i11 = -org.telegram.messenger.g0.f24121q.x;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(fu0Var, property, i11), ObjectAnimator.ofFloat(fu0Var2, property, 0.0f));
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.start();
            L1(fu0Var2.a(), true);
            return;
        }
        ImageView imageView2 = this.V;
        if (!fu0VarArr[i7].b() && !this.f46966y) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        imageView2.setVisibility(i10);
        fu0VarArr[this.f46933a].setVisibility(8);
        fu0VarArr[this.f46933a].g();
        this.f46933a = i7;
        fu0VarArr[i7].m(bundle, false);
        fu0VarArr[i7].setVisibility(0);
        setParentActivityTitle(fu0VarArr[i7].getHeaderName());
        fu0VarArr[i7].j();
        L1(fu0VarArr[i7].a(), false);
    }

    public final void N1(boolean z10, boolean z11) {
        boolean z12;
        TimeInterpolator timeInterpolator;
        int i7 = this.K;
        if (i7 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean[] zArr = this.R;
        if (zArr[i7] != z10) {
            AnimatorSet[] animatorSetArr = this.L;
            AnimatorSet animatorSet = animatorSetArr[i7];
            if (animatorSet != null) {
                if (z11) {
                    animatorSet.removeAllListeners();
                }
                animatorSetArr[this.K].cancel();
            }
            int i10 = this.K;
            zArr[i10] = z10;
            if (z11) {
                animatorSetArr[i10] = new AnimatorSet();
                if (z12) {
                    this.O.e(z10, z11);
                }
                animatorSetArr[this.K].addListener(new org.telegram.ui.ActionBar.g(this, z12, z10, 4));
                int i11 = 150;
                if (z12) {
                    if (z10) {
                        timeInterpolator = org.telegram.messenger.g0.F;
                        i11 = 200;
                    } else {
                        timeInterpolator = org.telegram.messenger.g0.G;
                    }
                } else {
                    timeInterpolator = null;
                }
                animatorSetArr[this.K].setDuration(i11);
                animatorSetArr[this.K].setInterpolator(timeInterpolator);
                animatorSetArr[this.K].start();
            } else if (z12) {
                this.O.e(z10, z11);
            }
        }
    }

    public final void O1(final boolean z10, final boolean z11, boolean z12) {
        boolean z13;
        float f10;
        boolean[] zArr = this.f46947j0;
        if (z11 && zArr[this.K] == z10 && !z12) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.g3(new org.telegram.ui.Components.az(this, z10, z11, z12, 1));
            return;
        }
        final int i7 = this.K;
        if (i7 == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        boolean[] zArr2 = this.f46949l0;
        if (!z12 && !z13) {
            zArr[i7] = z10;
            if (z11) {
                boolean z14 = zArr2[i7];
                Runnable[] runnableArr = this.f46948k0;
                if (z14) {
                    org.telegram.messenger.g0.r(runnableArr[i7]);
                    zArr2[this.K] = false;
                    return;
                } else if (z10) {
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            de0 de0Var = de0.this;
                            int i10 = de0Var.K;
                            de0Var.K = i7;
                            de0Var.O1(z10, z11, true);
                            de0Var.K = i10;
                        }
                    };
                    runnableArr[i7] = runnable;
                    org.telegram.messenger.g0.h3(runnable, 2000L);
                    zArr2[this.K] = true;
                    return;
                }
            }
        } else {
            zArr2[i7] = false;
            zArr[i7] = z10;
        }
        AnimatorSet animatorSet = this.M;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z13) {
            this.O.f(z10, z11);
            return;
        }
        float f11 = 0.0f;
        if (z11) {
            this.M = new AnimatorSet();
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (z10) {
                f11 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
            ofFloat.addListener(new c30(2, this, z10));
            ofFloat.addUpdateListener(new ra0(this, 1));
            this.M.playTogether(ofFloat);
            this.M.setDuration(150L);
            this.M.start();
        } else if (z10) {
            this.W.setVisibility(0);
            this.W.setScaleX(1.0f);
            this.W.setScaleY(1.0f);
            this.W.setAlpha(1.0f);
        } else {
            this.W.setTag(null);
            this.W.setVisibility(4);
            this.W.setScaleX(0.1f);
            this.W.setScaleY(0.1f);
            this.W.setAlpha(0.0f);
        }
    }

    public final void P1(boolean z10, boolean z11) {
        if (z10 == this.f46967y0) {
            return;
        }
        qa0 qa0Var = this.f46968z0;
        if (qa0Var != null) {
            org.telegram.messenger.g0.r(qa0Var);
            this.f46968z0 = null;
        }
        this.f46967y0 = z10;
        this.X.clearAnimation();
        float f10 = 0.0f;
        int i7 = 0;
        if (z11) {
            this.X.setVisibility(0);
            ViewPropertyAnimator animate = this.X.animate();
            if (z10) {
                f10 = 1.0f;
            }
            animate.alpha(f10).withEndAction(new org.telegram.ui.Components.pp0(10, this, z10)).start();
            return;
        }
        ImageView imageView = this.X;
        if (!z10) {
            i7 = 8;
        }
        imageView.setVisibility(i7);
        ImageView imageView2 = this.X;
        if (z10) {
            f10 = 1.0f;
        }
        imageView2.setAlpha(f10);
    }

    public final void Q1() {
        boolean z10;
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29396d6, false));
        ImageView imageView = this.V;
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        u1(imageView, x02, this.f46959t0, PorterDuff.Mode.SRC_ATOP);
        this.f46959t0 = x02;
        ImageView imageView2 = this.V;
        int i10 = org.telegram.ui.ActionBar.n6.f29488i6;
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        v1(imageView2, x03, this.f46960u0);
        this.f46960u0 = x03;
        int x04 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        if (x04 != this.f46961v0 || this.Y.getColorFilter() == null) {
            this.Y.setColorFilter(new PorterDuffColorFilter(x04, PorterDuff.Mode.SRC_IN));
            this.f46961v0 = x04;
        }
        ImageView imageView3 = this.X;
        int x05 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        v1(imageView3, x05, this.f46963w0);
        this.f46963w0 = x05;
        RadialProgressView radialProgressView = this.W;
        int i11 = org.telegram.ui.ActionBar.n6.P9;
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, i11, false));
        this.O.updateColors();
        this.N.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.O9, false));
        this.N.setBackgroundColor(org.telegram.ui.ActionBar.n6.x0(null, i11, false));
        for (org.telegram.ui.Components.fu0 fu0Var : this.f46935b) {
            fu0Var.updateColors();
        }
        org.telegram.ui.Components.pr prVar = this.f46937c;
        org.telegram.ui.Components.nr nrVar = prVar.f38529a;
        int x06 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false);
        if (x06 != prVar.f38536s || nrVar.getColorFilter() == null) {
            prVar.f38536s = x06;
            nrVar.setColorFilter(x06, PorterDuff.Mode.SRC_ATOP);
        }
        int x07 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29488i6, false);
        int o4 = i0.a.o(x07, 30);
        if (x07 != prVar.f38537w) {
            z10 = true;
        } else {
            z10 = false;
        }
        prVar.f38537w = x07;
        int i12 = 0;
        while (true) {
            View[] viewArr = prVar.f38531c;
            if (i12 >= viewArr.length) {
                break;
            }
            View view = viewArr[i12];
            if (view != null) {
                if (view.getBackground() != null) {
                    if (z10) {
                        org.telegram.ui.ActionBar.n6.H1(view.getBackground(), x07, false);
                        org.telegram.ui.ActionBar.n6.H1(view.getBackground(), o4, true);
                    }
                } else {
                    org.telegram.ui.Components.pr.a(i12, view);
                }
                if (view instanceof org.telegram.ui.Components.or) {
                    ((org.telegram.ui.Components.or) view).updateColors();
                }
            }
            i12++;
        }
        qd0 qd0Var = this.f46938c0;
        if (qd0Var != null) {
            int i13 = qd0.G;
            qd0Var.b();
        }
    }

    public final void R1(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        if (this.Y != null) {
            int connectionState = getConnectionsManager().getConnectionState();
            if (this.f46965x0 != connectionState || z11) {
                this.f46965x0 = connectionState;
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26915b.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if (sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i7 = this.f46965x0;
                if (i7 != 3 && i7 != 5) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (i7 != 1 && i7 != 2 && i7 != 4) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if (z12) {
                    this.Y.b(true, z13, z10);
                    P1(true, z10);
                } else if ((getMessagesController().B3 && !org.telegram.messenger.bz.f23219z1.isEmpty()) || z14) {
                    this.Y.b(true, z13, z10);
                    if (this.f46967y0) {
                        return;
                    }
                    qa0 qa0Var = this.f46968z0;
                    if (qa0Var != null) {
                        org.telegram.messenger.g0.r(qa0Var);
                    }
                    this.f46967y0 = true;
                    qa0 qa0Var2 = new qa0(this, 1);
                    this.f46968z0 = qa0Var2;
                    org.telegram.messenger.g0.h3(qa0Var2, 5000L);
                } else {
                    P1(false, z10);
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
            if (this.f46953p0) {
                this.f46952o0 = this.fragmentView;
            }
            this.fragmentView = null;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && !this.f46953p0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.de0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.T1) {
            R1(true, false);
        } else if (i7 == org.telegram.messenger.ks.f25188s1 && this.f46946i0) {
            org.telegram.messenger.mp messagesController = getMessagesController();
            if (!messagesController.V3.contains("SETUP_LOGIN_EMAIL") && !messagesController.V3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
                finishFragment();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.sa.a(new f6(11, this), org.telegram.ui.ActionBar.n6.G6, org.telegram.ui.ActionBar.n6.D6, org.telegram.ui.ActionBar.n6.H6, org.telegram.ui.ActionBar.n6.f29488i6, org.telegram.ui.ActionBar.n6.P9, org.telegram.ui.ActionBar.n6.O9, org.telegram.ui.ActionBar.n6.f29525k6, org.telegram.ui.ActionBar.n6.f29543l6, org.telegram.ui.ActionBar.n6.I6, org.telegram.ui.ActionBar.n6.f29637q7, org.telegram.ui.ActionBar.n6.f29788y6, org.telegram.ui.ActionBar.n6.i7, org.telegram.ui.ActionBar.n6.f29636q6, org.telegram.ui.ActionBar.n6.Ni, org.telegram.ui.ActionBar.n6.Q9, org.telegram.ui.ActionBar.n6.f29617p7, org.telegram.ui.ActionBar.n6.J6, org.telegram.ui.ActionBar.n6.Y6, org.telegram.ui.ActionBar.n6.W6, org.telegram.ui.ActionBar.n6.X6, org.telegram.ui.ActionBar.n6.f29469h5, org.telegram.ui.ActionBar.n6.f29635q5, org.telegram.ui.ActionBar.n6.f29504j5);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29396d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.f46946i0;
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        oc0 oc0Var = (oc0) this.f46935b[5];
        if (oc0Var != null) {
            oc0Var.N.h(i7, i10, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f46946i0 || this.f46933a != 12) {
            int i7 = this.f46933a;
            org.telegram.ui.Components.fu0[] fu0VarArr = this.f46935b;
            if (i7 == 0 || (this.G == 3 && i7 == 12)) {
                if (z10) {
                    for (org.telegram.ui.Components.fu0 fu0Var : fu0VarArr) {
                        if (fu0Var != null) {
                            fu0Var.f();
                        }
                    }
                    w1();
                }
                return true;
            } else if (i7 == 6) {
                if (z10) {
                    fu0VarArr[i7].c(true);
                    M1(0, true, null, true);
                    return false;
                }
            } else if (i7 != 7 && i7 != 8) {
                if ((i7 < 1 || i7 > 4) && i7 != 11 && i7 != 15) {
                    if (i7 == 5) {
                        if (z10) {
                            ((oc0) fu0VarArr[i7]).f50585x.callOnClick();
                            return false;
                        }
                    } else if (i7 == 9) {
                        if (z10) {
                            fu0VarArr[i7].c(true);
                            M1(7, true, null, true);
                            return false;
                        }
                    } else if (i7 == 10) {
                        if (z10) {
                            fu0VarArr[i7].c(true);
                            M1(9, true, null, true);
                            return false;
                        }
                    } else if (i7 == 13) {
                        if (z10) {
                            fu0VarArr[i7].c(true);
                            M1(12, true, null, true);
                            return false;
                        }
                    } else if (z10 && fu0VarArr[i7].c(true)) {
                        M1(0, true, null, true);
                        return false;
                    }
                } else if (z10 && fu0VarArr[i7].c(false)) {
                    M1(0, true, null, true);
                    return false;
                }
            } else if (z10) {
                fu0VarArr[i7].c(true);
                M1(6, true, null, true);
            }
        }
        return false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        L1(this.f46935b[this.f46933a].a(), false);
        qd0 qd0Var = this.f46938c0;
        if (qd0Var != null) {
            int i7 = qd0.G;
            qd0Var.a();
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
                ArrayList arrayList = this.f46955r;
                if (!arrayList.isEmpty() && getParentActivity() != null) {
                    getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
                    return;
                }
            }
            if (dialog == this.f46950n) {
                ArrayList arrayList2 = this.f46957s;
                if (!arrayList2.isEmpty() && getParentActivity() != null) {
                    org.telegram.messenger.g0.h3(new qa0(this, 0), 200L);
                    getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ks.T1);
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25188s1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        Runnable[] runnableArr;
        super.onFragmentDestroy();
        int i7 = 0;
        while (true) {
            org.telegram.ui.Components.fu0[] fu0VarArr = this.f46935b;
            if (i7 >= fu0VarArr.length) {
                break;
            }
            org.telegram.ui.Components.fu0 fu0Var = fu0VarArr[i7];
            if (fu0Var != null) {
                fu0Var.f();
            }
            i7++;
        }
        org.telegram.ui.ActionBar.u1 u1Var = this.S;
        if (u1Var != null) {
            u1Var.dismiss();
            this.S = null;
        }
        for (Runnable runnable : this.f46948k0) {
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
            }
        }
        getNotificationCenter().n(this, org.telegram.messenger.ks.T1);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25188s1);
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.f46966y) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(true, false);
        }
        org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        boolean z10;
        if (strArr.length != 0 && iArr.length != 0) {
            if (iArr[0] == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.fu0[] fu0VarArr = this.f46935b;
            if (i7 == 6) {
                this.f46962w = false;
                int i10 = this.f46933a;
                if (i10 == 0) {
                    org.telegram.ui.Components.fu0 fu0Var = fu0VarArr[i10];
                    ((ce0) fu0Var).O = true;
                    fu0Var.h(null);
                }
            } else if (i7 == 7) {
                this.f46964x = false;
                int i11 = this.f46933a;
                if (i11 == 0) {
                    ((ce0) fu0VarArr[i11]).p();
                }
            } else if (i7 == 20) {
                if (z10) {
                    ((oc0) fu0VarArr[5]).N.l();
                }
            } else if (i7 == 151 && z10) {
                oc0 oc0Var = (oc0) fu0VarArr[5];
                oc0Var.post(new bb0(oc0Var, 0));
            }
        }
    }

    @Override
    public final void onResume() {
        org.telegram.ui.Components.fu0 fu0Var;
        int i7;
        org.telegram.ui.Components.fu0[] fu0VarArr = this.f46935b;
        super.onResume();
        if (this.f46966y) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
        }
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        View view = this.fragmentView;
        if (view != null) {
            view.requestLayout();
        }
        try {
            int i10 = this.f46933a;
            if (i10 >= 1 && i10 <= 4) {
                org.telegram.ui.Components.fu0 fu0Var2 = fu0VarArr[i10];
                if ((fu0Var2 instanceof gd0) && (i7 = ((gd0) fu0Var2).W) != 0 && Math.abs((System.currentTimeMillis() / 1000) - i7) >= 86400) {
                    fu0VarArr[this.f46933a].c(true);
                    M1(0, false, null, true);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        int i11 = this.f46933a;
        if (i11 == 0 && !this.f46939d0 && (fu0Var = fu0VarArr[i11]) != null) {
            fu0Var.j();
        }
        if (z1()) {
            org.telegram.messenger.g0.v1(this.fragmentView);
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        }
        int i12 = this.f46933a;
        if (i12 >= 0 && i12 < fu0VarArr.length) {
            fu0VarArr[i12].i();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            if (this.fragmentView != null && this.V != null && this.Y != null && this.X != null && this.W != null && this.O != null && this.N != null && this.f46937c != null) {
                for (org.telegram.ui.Components.fu0 fu0Var : this.f46935b) {
                    if (fu0Var == null) {
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
            bundle2.putInt("currentViewNum", this.f46933a);
            bundle2.putInt("syncContacts", this.E ? 1 : 0);
            for (int i7 = 0; i7 <= this.f46933a; i7++) {
                org.telegram.ui.Components.fu0 fu0Var = this.f46935b[i7];
                if (fu0Var != null) {
                    fu0Var.l(bundle2);
                }
            }
            Context context = org.telegram.messenger.t0.f26915b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("logininfo2");
            if (this.f46966y) {
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
        Context context = org.telegram.messenger.t0.f26915b;
        StringBuilder sb2 = new StringBuilder("logininfo2");
        if (this.f46966y) {
            str = "_" + this.currentAccount;
        } else {
            str = "";
        }
        sb2.append(str);
        SharedPreferences.Editor edit = context.getSharedPreferences(sb2.toString(), 0).edit();
        edit.clear();
        edit.commit();
    }

    public final void y1(final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, boolean z10) {
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
        if ((auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms) && !auth_sentcodetype.verifiedFirebase && !this.f46956r0) {
            if (org.telegram.messenger.nt.f25968b.hasServices()) {
                TLRPC.TL_auth_sentCodeTypeFirebaseSms tL_auth_sentCodeTypeFirebaseSms = (TLRPC.TL_auth_sentCodeTypeFirebaseSms) auth_sentcode.type;
                F1(0, true);
                this.f46956r0 = true;
                String string = bundle.getString("phoneFormated");
                if (tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce != null) {
                    IntegrityManager create = IntegrityManagerFactory.create(getParentActivity());
                    String str = new String(Base64.encode(tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce, 8));
                    org.telegram.messenger.a8.b("getting classic integrity with nonce = ".concat(str));
                    create.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).setCloudProjectNumber(tL_auth_sentCodeTypeFirebaseSms.play_integrity_project_id).build()).addOnSuccessListener(new ua0(this, bundle, auth_sentcode, string, z10)).addOnFailureListener(new OnFailureListener(this) {
                        public final de0 f52750b;

                        {
                            this.f52750b = this;
                        }

                        @Override
                        public final void onFailure(Exception exc) {
                            switch (r4) {
                                case 0:
                                    String str2 = "PLAYINTEGRITY_EXCEPTION_" + de0.x1(exc);
                                    org.telegram.messenger.a8.e("{" + str2 + "} Resend firebase sms because integrity threw error", exc);
                                    this.f52750b.K1(bundle, auth_sentcode, str2);
                                    return;
                                default:
                                    org.telegram.messenger.a8.g(exc, true);
                                    String str3 = "SAFETYNET_EXCEPTION_" + de0.x1(exc);
                                    org.telegram.messenger.a8.b("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                    this.f52750b.K1(bundle, auth_sentcode, str3);
                                    return;
                            }
                        }
                    });
                    return;
                }
                com.google.android.gms.common.api.j jVar = new com.google.android.gms.common.api.j(org.telegram.messenger.t0.f26915b, p8.c.f55492a, (com.google.android.gms.common.api.a) null, new w7.s(6));
                byte[] bArr = auth_sentcode.type.nonce;
                String str2 = org.telegram.messenger.s2.f26727f;
                com.google.android.gms.common.api.internal.p0 p0Var = jVar.f6394i;
                b9.h0 h0Var = new b9.h0(p0Var, bArr, str2);
                p0Var.f6349b.d(0, h0Var);
                q6.m.n(h0Var, new q6.n(new Object())).addOnSuccessListener(new ua0(this, string, auth_sentcode, bundle, z10)).addOnFailureListener(new OnFailureListener(this) {
                    public final de0 f52750b;

                    {
                        this.f52750b = this;
                    }

                    @Override
                    public final void onFailure(Exception exc) {
                        switch (r4) {
                            case 0:
                                String str22 = "PLAYINTEGRITY_EXCEPTION_" + de0.x1(exc);
                                org.telegram.messenger.a8.e("{" + str22 + "} Resend firebase sms because integrity threw error", exc);
                                this.f52750b.K1(bundle, auth_sentcode, str22);
                                return;
                            default:
                                org.telegram.messenger.a8.g(exc, true);
                                String str3 = "SAFETYNET_EXCEPTION_" + de0.x1(exc);
                                org.telegram.messenger.a8.b("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                this.f52750b.K1(bundle, auth_sentcode, str3);
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
            M1(1, z10, bundle, false);
            return;
        }
        if (auth_sentcode.timeout == 0) {
            boolean z11 = org.telegram.messenger.s2.f26723a;
            auth_sentcode.timeout = 60;
        }
        bundle.putInt("timeout", auth_sentcode.timeout * 1000);
        TLRPC.auth_SentCodeType auth_sentcodetype2 = auth_sentcode.type;
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt("type", 4);
            bundle.putInt("length", auth_sentcode.type.length);
            M1(4, z10, bundle, false);
        } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", auth_sentcode.type.pattern);
            M1(3, z10, bundle, false);
        } else if (!(auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSms) && !(auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFragmentSms) {
                bundle.putInt("type", 15);
                bundle.putString("url", auth_sentcode.type.url);
                bundle.putInt("length", auth_sentcode.type.length);
                M1(15, z10, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeMissedCall) {
                bundle.putInt("type", 11);
                bundle.putInt("length", auth_sentcode.type.length);
                bundle.putString("prefix", auth_sentcode.type.prefix);
                M1(11, z10, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSetUpEmailRequired) {
                bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
                M1(12, z10, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
                bundle.putString("emailPattern", auth_sentcode.type.email_pattern);
                bundle.putInt("length", auth_sentcode.type.length);
                bundle.putInt("nextPhoneLoginDate", auth_sentcode.type.next_phone_login_date);
                bundle.putInt("resetAvailablePeriod", auth_sentcode.type.reset_available_period);
                bundle.putInt("resetPendingDate", auth_sentcode.type.reset_pending_date);
                M1(14, z10, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                String str3 = auth_sentcodetype2.beginning;
                if (str3 != null) {
                    bundle.putString("beginning", str3);
                }
                M1(16, z10, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                String str4 = auth_sentcodetype2.beginning;
                if (str4 != null) {
                    bundle.putString("beginning", str4);
                }
                M1(17, z10, bundle, false);
            }
        } else {
            bundle.putInt("type", 2);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putBoolean("firebase", auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms);
            M1(2, z10, bundle, false);
        }
    }

    public final boolean z1() {
        if (this.f46935b[this.f46933a].a() && !org.telegram.messenger.g0.C1()) {
            return true;
        }
        return false;
    }

    public de0(int i7) {
        super(null);
        this.f46935b = new org.telegram.ui.Components.fu0[19];
        this.f46955r = new ArrayList();
        this.f46957s = new ArrayList();
        this.f46962w = true;
        this.f46964x = true;
        this.E = true;
        this.F = false;
        this.G = 0;
        this.L = new AnimatorSet[2];
        this.R = new boolean[]{true, false};
        this.f46936b0 = false;
        this.f46947j0 = new boolean[2];
        this.f46948k0 = new Runnable[2];
        this.f46949l0 = new boolean[2];
        this.currentAccount = i7;
        this.f46966y = true;
    }
}
