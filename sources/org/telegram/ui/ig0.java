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
public final class ig0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f38191x0;
    public boolean E;
    public int F;
    public String G;
    public Bundle H;
    public TLRPC.TL_auth_sentCode I;
    public int J;
    public final AnimatorSet[] K;
    public AnimatorSet L;
    public org.telegram.ui.Components.f41 M;
    public org.telegram.ui.Components.h20 N;
    public m.g3 O;
    public int P;
    public final boolean[] Q;
    public org.telegram.ui.ActionBar.c2 R;
    public y8 S;
    public xf0 T;
    public ImageView U;
    public RadialProgressView V;
    public ImageView W;
    public org.telegram.ui.Components.fj0 X;
    public LinearLayout Y;
    public l0 Z;
    public int f38192a;
    public boolean f38193a0;
    public final org.telegram.ui.Components.tw0[] f38194b;
    public wf0 f38195b0;
    public org.telegram.ui.Components.fs f38196c;
    public boolean f38197c0;
    public ValueAnimator d;
    public Runnable f38198d0;
    public boolean e;
    public uv f38199e0;
    public boolean f38200f;
    public TextView f38201f0;
    public boolean f38202g0;
    public Dialog h;
    public boolean f38203h0;
    public final boolean[] f38204i0;
    public final Runnable[] f38205j0;
    public final boolean[] f38206k0;
    public boolean f38207l0;
    public View m0;
    public Dialog f38208n;
    public boolean f38209n0;
    public boolean f38210o0;
    public TLRPC.TL_help_termsOfService f38211p0;
    public int f38212q0;
    public final ArrayList f38213r;
    public int f38214r0;
    public final ArrayList f38215s;
    public int f38216s0;
    public int f38217t0;
    public int f38218u0;
    public boolean v;
    public boolean f38219v0;
    public boolean f38220w;
    public tc0 f38221w0;
    public boolean f38222x;
    public boolean f38223y;

    static {
        int i10;
        if (SharedConfig.getDevicePerformanceClass() <= 1) {
            i10 = 150;
        } else {
            i10 = 100;
        }
        f38191x0 = i10;
    }

    public ig0() {
        super(null);
        this.f38194b = new org.telegram.ui.Components.tw0[19];
        this.f38213r = new ArrayList();
        this.f38215s = new ArrayList();
        this.v = true;
        this.f38220w = true;
        this.f38223y = true;
        this.E = false;
        this.F = 0;
        this.K = new AnimatorSet[2];
        this.Q = new boolean[]{true, false};
        this.f38193a0 = false;
        this.f38204i0 = new boolean[2];
        this.f38205j0 = new Runnable[2];
        this.f38206k0 = new boolean[2];
    }

    public static void U(ig0 ig0Var, TLRPC.TL_error tL_error, String str, String str2, String str3) {
        ig0Var.o1(false, true);
        if (tL_error == null) {
            if (str != null && str2 != null && str3 != null) {
                Bundle bundle = new Bundle();
                bundle.putString("phoneFormated", str);
                bundle.putString("phoneHash", str2);
                bundle.putString("code", str3);
                ig0Var.y1(5, true, bundle, false);
                return;
            }
            ig0Var.y1(0, true, null, true);
        } else if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
            ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
        } else if (tL_error.text.startsWith("2FA_CONFIRM_WAIT_")) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("phoneFormated", str);
            bundle2.putString("phoneHash", str2);
            bundle2.putString("code", str3);
            bundle2.putInt("startTime", ConnectionsManager.getInstance(ig0Var.currentAccount).getCurrentTime());
            bundle2.putInt("waitTime", Utilities.parseInt((CharSequence) tL_error.text.replace("2FA_CONFIRM_WAIT_", "")).intValue());
            ig0Var.y1(8, true, bundle2, false);
        } else {
            ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
        }
    }

    public static void V(ig0 ig0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10, m8.d dVar) {
        String str2;
        m8.e eVar = ((b8.f) ((com.google.android.gms.common.api.q) dVar.f1069a)).f4228b;
        if (eVar == null) {
            str2 = null;
        } else {
            str2 = eVar.f16866a;
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
                            ConnectionsManager.getInstance(ig0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new yc0(1, bundle, auth_sentcode, ig0Var, z10), 10);
                        } else if (!optBoolean && !optBoolean2) {
                            FileLog.d("{SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false and basicIntegrity = false");
                            ig0Var.w1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE");
                        } else if (!optBoolean) {
                            FileLog.d("{SAFETYNET_BASICINTEGRITY_FALSE} Resend firebase sms because basicIntegrity = false");
                            ig0Var.w1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_FALSE");
                        } else if (!optBoolean2) {
                            FileLog.d("{SAFETYNET_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false");
                            ig0Var.w1(bundle, auth_sentcode, "SAFETYNET_CTSPROFILEMATCH_FALSE");
                        }
                    } catch (JSONException e) {
                        e = e;
                        FileLog.e(e);
                        FileLog.d("{SAFETYNET_JSON_EXCEPTION} Resend firebase sms because of exception");
                        ig0Var.w1(bundle, auth_sentcode, "SAFETYNET_JSON_EXCEPTION");
                    }
                } catch (JSONException e7) {
                    e = e7;
                }
            } else {
                FileLog.d("{SAFETYNET_CANT_SPLIT} Resend firebase sms because can't split JWS token");
                ig0Var.w1(bundle, auth_sentcode, "SAFETYNET_CANT_SPLIT");
            }
        } else {
            FileLog.d("{SAFETYNET_NULL_JWS} Resend firebase sms because JWS = null");
            ig0Var.w1(bundle, auth_sentcode, "SAFETYNET_NULL_JWS");
        }
    }

    public static boolean V0(ig0 ig0Var, View view) {
        if (!ig0Var.l1()) {
            return AndroidUtilities.showKeyboard(view);
        }
        return true;
    }

    public static void W(ig0 ig0Var, String str, String str2, String str3) {
        ig0Var.r1(0, true);
        TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
        deleteaccount.reason = "Forgot password";
        ConnectionsManager.getInstance(ig0Var.currentAccount).sendRequest(deleteaccount, new ai.k2(ig0Var, str, str2, str3, 13), 10);
    }

    public static void W0(ig0 ig0Var, View view, boolean z10) {
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(view, 3.5f);
        if (z10 && (view instanceof org.telegram.ui.Components.vd0)) {
            Runnable runnable = (Runnable) view.getTag(R.id.timeout_callback);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
            org.telegram.ui.Components.vd0 vd0Var = (org.telegram.ui.Components.vd0) view;
            AtomicReference atomicReference = new AtomicReference();
            EditText attachedEditText = vd0Var.getAttachedEditText();
            org.telegram.ui.Components.ao aoVar = new org.telegram.ui.Components.ao(attachedEditText, atomicReference, false, 2);
            vd0Var.a(1.0f);
            org.telegram.ui.Components.j90 j90Var = new org.telegram.ui.Components.j90(vd0Var, view, attachedEditText, aoVar, 21);
            atomicReference.set(j90Var);
            view.postDelayed(j90Var, 2000L);
            view.setTag(R.id.timeout_callback, j90Var);
            if (attachedEditText != null) {
                attachedEditText.addTextChangedListener(aoVar);
            }
        }
    }

    public static void X(ig0 ig0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            FileLog.d("Resend firebase sms because integrity token = null");
            ig0Var.w1(bundle, auth_sentcode, "PLAYINTEGRITY_TOKEN_NULL");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.play_integrity_token = str2;
        tL_auth_requestFirebaseSms.flags |= 4;
        ConnectionsManager.getInstance(ig0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new yc0(0, bundle, auth_sentcode, ig0Var, z10), 10);
    }

    public static HashSet X0(ig0 ig0Var) {
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
            SubscriptionManager from = SubscriptionManager.from(ig0Var.getParentActivity());
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
            FileLog.e(e7);
        }
        return hashSet;
    }

    public static int Y0(ig0 ig0Var) {
        return ig0Var.currentAccount;
    }

    public static int Z0(ig0 ig0Var) {
        return ig0Var.currentAccount;
    }

    public static int a1(ig0 ig0Var) {
        return ig0Var.currentAccount;
    }

    public static void g1(ImageView imageView, int i10, int i11, PorterDuff.Mode mode) {
        if (imageView != null) {
            if (i10 != i11 || imageView.getColorFilter() == null) {
                imageView.setColorFilter(new PorterDuffColorFilter(i10, mode));
            }
        }
    }

    public static void h1(ImageView imageView, int i10, int i11) {
        if (imageView != null) {
            Drawable background = imageView.getBackground();
            if (background == null) {
                imageView.setBackground(org.telegram.ui.ActionBar.k6.g0(i10, 1, -1));
            } else if (i10 != i11) {
                org.telegram.ui.ActionBar.k6.E1(background, i10, true);
            }
        }
    }

    public static String j1(Exception exc) {
        if (exc == null) {
            return "NULL";
        }
        String simpleName = exc.getClass().getSimpleName();
        if (exc.getMessage() != null) {
            if (simpleName.length() > 0) {
                simpleName = simpleName.concat(" ");
            }
            StringBuilder u10 = a1.g.u(simpleName);
            u10.append(exc.getMessage());
            simpleName = u10.toString();
        }
        return simpleName.toUpperCase().replaceAll(" ", "_");
    }

    public static void n0(ig0 ig0Var, String str, String str2, String str3) {
        if (ig0Var.V.getTag() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
        alertDialog$Builder.f20678a.T = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
        alertDialog$Builder.f20678a.R = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
        alertDialog$Builder.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new a1.d(ig0Var, str, str2, str3, 15));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        ig0Var.showDialog(alertDialog$Builder.f20678a);
    }

    public static Bundle n1(int i10, boolean z10) {
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
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static void q1(org.telegram.ui.ActionBar.o2 o2Var, String str, m.g3 g3Var, boolean z10) {
        List list;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity());
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
            if (z10) {
                c2Var.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                c2Var.T = LocaleController.getString("BannedPhoneNumber", R.string.BannedPhoneNumber);
            } else if (g3Var != null && (list = (List) g3Var.f16266c) != null && !list.isEmpty() && ((lt) g3Var.f16265b) != null) {
                int i10 = Integer.MAX_VALUE;
                for (String str2 : (List) g3Var.f16266c) {
                    int length = str2.replace(" ", "").length();
                    if (length < i10) {
                        i10 = length;
                    }
                }
                if (jf.b.d(str, false).length() - ((lt) g3Var.f16265b).f39324c.length() < i10) {
                    c2Var.R = LocaleController.getString(R.string.WrongNumberFormat);
                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ShortNumberInfo", R.string.ShortNumberInfo, ((lt) g3Var.f16265b).f39322a, (String) g3Var.d));
                } else {
                    c2Var.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    c2Var.T = LocaleController.getString(R.string.InvalidPhoneNumber);
                }
            } else {
                c2Var.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                c2Var.T = LocaleController.getString(R.string.InvalidPhoneNumber);
            }
            alertDialog$Builder.i(LocaleController.getString("BotHelp", R.string.BotHelp), new ai.e4(str, o2Var, z10));
            alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
            o2Var.showDialog(c2Var);
        }
    }

    public static void v1(Bundle bundle, SharedPreferences.Editor editor, String str) {
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof String) {
                if (str != null) {
                    editor.putString(a1.g.D(str, "_|_", str2), (String) obj);
                } else {
                    editor.putString(str2, (String) obj);
                }
            } else if (obj instanceof Integer) {
                if (str != null) {
                    editor.putInt(a1.g.D(str, "_|_", str2), ((Integer) obj).intValue());
                } else {
                    editor.putInt(str2, ((Integer) obj).intValue());
                }
            } else if (obj instanceof Boolean) {
                if (str != null) {
                    editor.putBoolean(a1.g.D(str, "_|_", str2), ((Boolean) obj).booleanValue());
                } else {
                    editor.putBoolean(str2, ((Boolean) obj).booleanValue());
                }
            } else if (obj instanceof Bundle) {
                v1((Bundle) obj, editor, str2);
            }
        }
    }

    public final void A1(final boolean z10, final boolean z11, boolean z12) {
        boolean z13;
        float f7;
        boolean[] zArr = this.f38204i0;
        if (z11 && zArr[this.J] == z10 && !z12) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c00(this, z10, z11, z12, 1));
            return;
        }
        final int i10 = this.J;
        if (i10 == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        boolean[] zArr2 = this.f38206k0;
        if (!z12 && !z13) {
            zArr[i10] = z10;
            if (z11) {
                boolean z14 = zArr2[i10];
                Runnable[] runnableArr = this.f38205j0;
                if (z14) {
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[i10]);
                    zArr2[this.J] = false;
                    return;
                } else if (z10) {
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            ig0 ig0Var = ig0.this;
                            int i11 = ig0Var.J;
                            ig0Var.J = i10;
                            ig0Var.A1(z10, z11, true);
                            ig0Var.J = i11;
                        }
                    };
                    runnableArr[i10] = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 2000L);
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
            ofFloat.addListener(new o40(2, this, z10));
            ofFloat.addUpdateListener(new uc0(this, 1));
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

    public final void B1(boolean z10, boolean z11) {
        if (z10 == this.f38219v0) {
            return;
        }
        tc0 tc0Var = this.f38221w0;
        if (tc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(tc0Var);
            this.f38221w0 = null;
        }
        this.f38219v0 = z10;
        this.W.clearAnimation();
        float f7 = 0.0f;
        int i10 = 0;
        if (z11) {
            this.W.setVisibility(0);
            ViewPropertyAnimator animate = this.W.animate();
            if (z10) {
                f7 = 1.0f;
            }
            animate.alpha(f7).withEndAction(new org.telegram.ui.Components.b60(12, this, z10)).start();
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

    public final void C1() {
        boolean z10;
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false));
        ImageView imageView = this.U;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        g1(imageView, x02, this.f38212q0, PorterDuff.Mode.SRC_ATOP);
        this.f38212q0 = x02;
        ImageView imageView2 = this.U;
        int i11 = org.telegram.ui.ActionBar.k6.f21272i6;
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        h1(imageView2, x03, this.f38214r0);
        this.f38214r0 = x03;
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        if (x04 != this.f38216s0 || this.X.getColorFilter() == null) {
            this.X.setColorFilter(new PorterDuffColorFilter(x04, PorterDuff.Mode.SRC_IN));
            this.f38216s0 = x04;
        }
        ImageView imageView3 = this.W;
        int x05 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        h1(imageView3, x05, this.f38217t0);
        this.f38217t0 = x05;
        RadialProgressView radialProgressView = this.V;
        int i12 = org.telegram.ui.ActionBar.k6.P9;
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        this.N.updateColors();
        this.M.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false));
        this.M.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        for (org.telegram.ui.Components.tw0 tw0Var : this.f38194b) {
            tw0Var.updateColors();
        }
        org.telegram.ui.Components.fs fsVar = this.f38196c;
        org.telegram.ui.Components.ds dsVar = fsVar.f26444a;
        int x06 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
        if (x06 != fsVar.f26450s || dsVar.getColorFilter() == null) {
            fsVar.f26450s = x06;
            dsVar.setColorFilter(x06, PorterDuff.Mode.SRC_ATOP);
        }
        int x07 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21272i6, false);
        int o10 = i0.a.o(x07, 30);
        if (x07 != fsVar.v) {
            z10 = true;
        } else {
            z10 = false;
        }
        fsVar.v = x07;
        int i13 = 0;
        while (true) {
            View[] viewArr = fsVar.f26446c;
            if (i13 >= viewArr.length) {
                break;
            }
            View view = viewArr[i13];
            if (view != null) {
                if (view.getBackground() != null) {
                    if (z10) {
                        org.telegram.ui.ActionBar.k6.E1(view.getBackground(), x07, false);
                        org.telegram.ui.ActionBar.k6.E1(view.getBackground(), o10, true);
                    }
                } else {
                    org.telegram.ui.Components.fs.a(i13, view);
                }
                if (view instanceof org.telegram.ui.Components.es) {
                    ((org.telegram.ui.Components.es) view).updateColors();
                }
            }
            i13++;
        }
        wf0 wf0Var = this.f38195b0;
        if (wf0Var != null) {
            int i14 = wf0.F;
            wf0Var.b();
        }
    }

    public final void D1(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        if (this.X != null) {
            int connectionState = getConnectionsManager().getConnectionState();
            if (this.f38218u0 != connectionState || z11) {
                this.f38218u0 = connectionState;
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if (sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i10 = this.f38218u0;
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
                    B1(true, z10);
                } else if ((getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty()) || z14) {
                    this.X.b(true, z13, z10);
                    if (this.f38219v0) {
                        return;
                    }
                    tc0 tc0Var = this.f38221w0;
                    if (tc0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(tc0Var);
                    }
                    this.f38219v0 = true;
                    tc0 tc0Var2 = new tc0(this, 1);
                    this.f38221w0 = tc0Var2;
                    AndroidUtilities.runOnUIThread(tc0Var2, 5000L);
                } else {
                    B1(false, z10);
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
                    FileLog.e(e);
                }
            }
            if (this.f38209n0) {
                this.m0 = this.fragmentView;
            }
            this.fragmentView = null;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && !this.f38209n0) {
            ViewGroup viewGroup2 = (ViewGroup) kVar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            this.actionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    @Override
    public final android.view.View createView(android.content.Context r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ig0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didUpdateConnectionState) {
            D1(true, false);
        } else if (i10 == NotificationCenter.newSuggestionsAvailable && this.f38203h0 && !getMessagesController().hasSetupEmailSuggestion()) {
            finishFragment();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new i6(12, this), org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.D6, org.telegram.ui.ActionBar.k6.H6, org.telegram.ui.ActionBar.k6.f21272i6, org.telegram.ui.ActionBar.k6.P9, org.telegram.ui.ActionBar.k6.O9, org.telegram.ui.ActionBar.k6.f21310k6, org.telegram.ui.ActionBar.k6.f21327l6, org.telegram.ui.ActionBar.k6.I6, org.telegram.ui.ActionBar.k6.f21421q7, org.telegram.ui.ActionBar.k6.f21571y6, org.telegram.ui.ActionBar.k6.f21273i7, org.telegram.ui.ActionBar.k6.q6, org.telegram.ui.ActionBar.k6.Wh, org.telegram.ui.ActionBar.k6.Q9, org.telegram.ui.ActionBar.k6.f21404p7, org.telegram.ui.ActionBar.k6.J6, org.telegram.ui.ActionBar.k6.Y6, org.telegram.ui.ActionBar.k6.W6, org.telegram.ui.ActionBar.k6.X6, org.telegram.ui.ActionBar.k6.f21254h5, org.telegram.ui.ActionBar.k6.f21420q5, org.telegram.ui.ActionBar.k6.f21289j5);
    }

    public final void i1() {
        String str;
        Context context = ApplicationLoader.applicationContext;
        StringBuilder sb2 = new StringBuilder("logininfo2");
        if (this.f38222x) {
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
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.f38203h0;
    }

    public final void k1(final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, boolean z10) {
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
            y1(18, true, bundle, true);
            return;
        }
        TLRPC.auth_SentCodeType auth_sentcodetype = auth_sentcode.type;
        if ((auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms) && !auth_sentcodetype.verifiedFirebase && !this.f38210o0) {
            if (PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                TLRPC.TL_auth_sentCodeTypeFirebaseSms tL_auth_sentCodeTypeFirebaseSms = (TLRPC.TL_auth_sentCodeTypeFirebaseSms) auth_sentcode.type;
                r1(0, true);
                this.f38210o0 = true;
                String string = bundle.getString("phoneFormated");
                if (tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce != null) {
                    IntegrityManager create = IntegrityManagerFactory.create(getParentActivity());
                    String str = new String(Base64.encode(tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce, 8));
                    FileLog.d("getting classic integrity with nonce = ".concat(str));
                    create.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).setCloudProjectNumber(tL_auth_sentCodeTypeFirebaseSms.play_integrity_project_id).build()).addOnSuccessListener(new vc0(this, bundle, auth_sentcode, string, z10)).addOnFailureListener(new OnFailureListener(this) {
                        public final ig0 f43002b;

                        {
                            this.f43002b = this;
                        }

                        @Override
                        public final void onFailure(Exception exc) {
                            switch (r4) {
                                case 0:
                                    String str2 = "PLAYINTEGRITY_EXCEPTION_" + ig0.j1(exc);
                                    FileLog.e("{" + str2 + "} Resend firebase sms because integrity threw error", exc);
                                    this.f43002b.w1(bundle, auth_sentcode, str2);
                                    return;
                                default:
                                    FileLog.e(exc);
                                    String str3 = "SAFETYNET_EXCEPTION_" + ig0.j1(exc);
                                    FileLog.d("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                    this.f43002b.w1(bundle, auth_sentcode, str3);
                                    return;
                            }
                        }
                    });
                    return;
                }
                com.google.android.gms.common.api.j jVar = new com.google.android.gms.common.api.j(ApplicationLoader.applicationContext, m8.c.f16865a, (com.google.android.gms.common.api.a) null, (com.google.android.gms.common.api.internal.s) new Object());
                byte[] bArr = auth_sentcode.type.nonce;
                String str2 = BuildVars.SAFETYNET_KEY;
                com.google.android.gms.common.api.internal.s0 s0Var = jVar.h;
                b8.e eVar = new b8.e(s0Var, bArr, str2);
                s0Var.f6503b.d(0, eVar);
                n6.l.n(eVar, new n6.m(new Object())).addOnSuccessListener(new vc0(this, string, auth_sentcode, bundle, z10)).addOnFailureListener(new OnFailureListener(this) {
                    public final ig0 f43002b;

                    {
                        this.f43002b = this;
                    }

                    @Override
                    public final void onFailure(Exception exc) {
                        switch (r4) {
                            case 0:
                                String str22 = "PLAYINTEGRITY_EXCEPTION_" + ig0.j1(exc);
                                FileLog.e("{" + str22 + "} Resend firebase sms because integrity threw error", exc);
                                this.f43002b.w1(bundle, auth_sentcode, str22);
                                return;
                            default:
                                FileLog.e(exc);
                                String str3 = "SAFETYNET_EXCEPTION_" + ig0.j1(exc);
                                FileLog.d("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                this.f43002b.w1(bundle, auth_sentcode, str3);
                                return;
                        }
                    }
                });
                return;
            }
            FileLog.d("{GOOGLE_PLAY_SERVICES_NOT_AVAILABLE} Resend firebase sms because firebase is not available");
            w1(bundle, auth_sentcode, "GOOGLE_PLAY_SERVICES_NOT_AVAILABLE");
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
            y1(1, z10, bundle, false);
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
            y1(4, z10, bundle, false);
        } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", auth_sentcode.type.pattern);
            y1(3, z10, bundle, false);
        } else if (!(auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSms) && !(auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFragmentSms) {
                bundle.putInt("type", 15);
                bundle.putString("url", auth_sentcode.type.url);
                bundle.putInt("length", auth_sentcode.type.length);
                y1(15, z10, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeMissedCall) {
                bundle.putInt("type", 11);
                bundle.putInt("length", auth_sentcode.type.length);
                bundle.putString("prefix", auth_sentcode.type.prefix);
                y1(11, z10, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSetUpEmailRequired) {
                bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
                y1(12, z10, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
                bundle.putString("emailPattern", auth_sentcode.type.email_pattern);
                bundle.putInt("length", auth_sentcode.type.length);
                bundle.putInt("nextPhoneLoginDate", auth_sentcode.type.next_phone_login_date);
                bundle.putInt("resetAvailablePeriod", auth_sentcode.type.reset_available_period);
                bundle.putInt("resetPendingDate", auth_sentcode.type.reset_pending_date);
                y1(14, z10, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                String str3 = auth_sentcodetype2.beginning;
                if (str3 != null) {
                    bundle.putString("beginning", str3);
                }
                y1(16, z10, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                String str4 = auth_sentcodetype2.beginning;
                if (str4 != null) {
                    bundle.putString("beginning", str4);
                }
                y1(17, z10, bundle, false);
            }
        } else {
            bundle.putInt("type", 2);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putBoolean("firebase", auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms);
            y1(2, z10, bundle, false);
        }
    }

    public final boolean l1() {
        if (this.f38194b[this.f38192a].a() && !AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
            return true;
        }
        return false;
    }

    public final boolean m1() {
        if (this.F == 1) {
            return true;
        }
        return false;
    }

    public final void o1(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.c2 c2Var;
        if (this.P != 0) {
            if (z10) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.P, true);
            }
            this.P = 0;
        }
        if (m1() && (c2Var = this.R) != null) {
            c2Var.dismiss();
            this.R = null;
        }
        A1(false, z11, false);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        ue0 ue0Var = (ue0) this.f38194b[5];
        if (ue0Var != null) {
            ue0Var.L.h(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f38203h0 || this.f38192a != 12) {
            int i10 = this.f38192a;
            org.telegram.ui.Components.tw0[] tw0VarArr = this.f38194b;
            if (i10 == 0 || (this.F == 3 && i10 == 12)) {
                if (z10) {
                    for (org.telegram.ui.Components.tw0 tw0Var : tw0VarArr) {
                        if (tw0Var != null) {
                            tw0Var.f();
                        }
                    }
                    i1();
                }
                return true;
            } else if (i10 == 6) {
                if (z10) {
                    tw0VarArr[i10].c(true);
                    y1(0, true, null, true);
                    return false;
                }
            } else if (i10 != 7 && i10 != 8) {
                if ((i10 < 1 || i10 > 4) && i10 != 11 && i10 != 15) {
                    if (i10 == 5) {
                        if (z10) {
                            ((ue0) tw0VarArr[i10]).f42400w.callOnClick();
                            return false;
                        }
                    } else if (i10 == 9) {
                        if (z10) {
                            tw0VarArr[i10].c(true);
                            y1(7, true, null, true);
                            return false;
                        }
                    } else if (i10 == 10) {
                        if (z10) {
                            tw0VarArr[i10].c(true);
                            y1(9, true, null, true);
                            return false;
                        }
                    } else if (i10 == 13) {
                        if (z10) {
                            tw0VarArr[i10].c(true);
                            y1(12, true, null, true);
                            return false;
                        }
                    } else if (z10 && tw0VarArr[i10].c(true)) {
                        y1(0, true, null, true);
                        return false;
                    }
                } else if (z10 && tw0VarArr[i10].c(false)) {
                    y1(0, true, null, true);
                    return false;
                }
            } else if (z10) {
                tw0VarArr[i10].c(true);
                y1(6, true, null, true);
            }
        }
        return false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        x1(this.f38194b[this.f38192a].a(), false);
        wf0 wf0Var = this.f38195b0;
        if (wf0Var != null) {
            int i10 = wf0.F;
            wf0Var.a();
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
                ArrayList arrayList = this.f38213r;
                if (!arrayList.isEmpty() && getParentActivity() != null) {
                    getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
                    return;
                }
            }
            if (dialog == this.f38208n) {
                ArrayList arrayList2 = this.f38215s;
                if (!arrayList2.isEmpty() && getParentActivity() != null) {
                    AndroidUtilities.runOnUIThread(new tc0(this, 0), 200L);
                    getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
                }
            }
        } catch (Exception unused) {
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
            org.telegram.ui.Components.tw0[] tw0VarArr = this.f38194b;
            if (i10 >= tw0VarArr.length) {
                break;
            }
            org.telegram.ui.Components.tw0 tw0Var = tw0VarArr[i10];
            if (tw0Var != null) {
                tw0Var.f();
            }
            i10++;
        }
        org.telegram.ui.ActionBar.c2 c2Var = this.R;
        if (c2Var != null) {
            c2Var.dismiss();
            this.R = null;
        }
        for (Runnable runnable : this.f38205j0) {
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
        if (this.f38222x) {
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
            org.telegram.ui.Components.tw0[] tw0VarArr = this.f38194b;
            if (i10 == 6) {
                this.v = false;
                int i11 = this.f38192a;
                if (i11 == 0) {
                    org.telegram.ui.Components.tw0 tw0Var = tw0VarArr[i11];
                    ((hg0) tw0Var).N = true;
                    tw0Var.h(null);
                }
            } else if (i10 == 7) {
                this.f38220w = false;
                int i12 = this.f38192a;
                if (i12 == 0) {
                    ((hg0) tw0VarArr[i12]).o();
                }
            } else if (i10 == 20) {
                if (z10) {
                    ((ue0) tw0VarArr[5]).L.l();
                }
            } else if (i10 == 151 && z10) {
                ue0 ue0Var = (ue0) tw0VarArr[5];
                ue0Var.post(new ed0(ue0Var, 0));
            }
        }
    }

    @Override
    public final void onResume() {
        org.telegram.ui.Components.tw0 tw0Var;
        int i10;
        org.telegram.ui.Components.tw0[] tw0VarArr = this.f38194b;
        super.onResume();
        if (this.f38222x) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        View view = this.fragmentView;
        if (view != null) {
            view.requestLayout();
        }
        try {
            int i11 = this.f38192a;
            if (i11 >= 1 && i11 <= 4) {
                org.telegram.ui.Components.tw0 tw0Var2 = tw0VarArr[i11];
                if ((tw0Var2 instanceof mf0) && (i10 = ((mf0) tw0Var2).V) != 0 && Math.abs((System.currentTimeMillis() / 1000) - i10) >= 86400) {
                    tw0VarArr[this.f38192a].c(true);
                    y1(0, false, null, true);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        int i12 = this.f38192a;
        if (i12 == 0 && !this.f38197c0 && (tw0Var = tw0VarArr[i12]) != null) {
            tw0Var.j();
        }
        if (l1()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
        int i13 = this.f38192a;
        if (i13 >= 0 && i13 < tw0VarArr.length) {
            tw0VarArr[i13].i();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            if (this.fragmentView != null && this.U != null && this.X != null && this.W != null && this.V != null && this.N != null && this.M != null && this.f38196c != null) {
                for (org.telegram.ui.Components.tw0 tw0Var : this.f38194b) {
                    if (tw0Var == null) {
                        return;
                    }
                }
                C1();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p1(String str, String str2) {
        if (str2 != null && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
            c2Var.R = str;
            c2Var.T = str2;
            alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
            showDialog(alertDialog$Builder.f20678a);
        }
    }

    public final void r1(int i10, boolean z10) {
        if (m1() && i10 == 0) {
            if (this.R == null && getParentActivity() != null && !getParentActivity().isFinishing()) {
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
                this.R = c2Var;
                c2Var.f20762i0 = false;
                c2Var.show();
                return;
            }
            return;
        }
        this.P = i10;
        A1(true, z10, false);
    }

    public final void s1(TLRPC.TL_auth_authorization tL_auth_authorization, boolean z10) {
        MessagesController.getInstance(this.currentAccount).cleanup();
        ConnectionsManager.getInstance(this.currentAccount).setUserId(tL_auth_authorization.user.f20490id);
        UserConfig.getInstance(this.currentAccount).clearConfig();
        MessagesController.getInstance(this.currentAccount).cleanup();
        UserConfig.getInstance(this.currentAccount).syncContacts = this.f38223y;
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
        MessagesController.getInstance(this.currentAccount).lambda$removeWebBrowserException$517();
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
        i1();
        if (getParentActivity() instanceof LaunchActivity) {
            if (this.f38222x) {
                this.f38222x = false;
                this.f38209n0 = true;
                ((LaunchActivity) getParentActivity()).Q0(this.currentAccount, new i2.x(6, z10));
                this.f38209n0 = false;
                finishFragment();
                return;
            }
            if (z10 && z11) {
                bg1 bg1Var = new bg1(6, null);
                bg1Var.G = i10;
                bg1Var.H = true;
                presentFragment(bg1Var, true);
            } else {
                Bundle h = a1.g.h("afterSignup", z10);
                rg0 rg0Var = new rg0();
                rg0Var.l0(h);
                presentFragment(rg0Var, true);
            }
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
            v21.V(true);
        } else if (getParentActivity() instanceof ExternalActionActivity) {
            ExternalActionActivity externalActionActivity = (ExternalActionActivity) getParentActivity();
            externalActionActivity.d(externalActionActivity.h, externalActionActivity.f33438n, externalActionActivity.v, true, externalActionActivity.f33439r, externalActionActivity.f33440s);
            externalActionActivity.f33436c.Y();
            ActionBarLayout actionBarLayout = externalActionActivity.d;
            if (actionBarLayout != null) {
                actionBarLayout.Y();
            }
            org.telegram.ui.Components.ow0 ow0Var = externalActionActivity.e;
            if (ow0Var != null) {
                ow0Var.setVisibility(0);
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("currentViewNum", this.f38192a);
            bundle2.putInt("syncContacts", this.f38223y ? 1 : 0);
            for (int i10 = 0; i10 <= this.f38192a; i10++) {
                org.telegram.ui.Components.tw0 tw0Var = this.f38194b[i10];
                if (tw0Var != null) {
                    tw0Var.l(bundle2);
                }
            }
            Context context = ApplicationLoader.applicationContext;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("logininfo2");
            if (this.f38222x) {
                str = "_" + this.currentAccount;
            } else {
                str = "";
            }
            sb2.append(str);
            SharedPreferences.Editor edit = context.getSharedPreferences(sb2.toString(), 0).edit();
            edit.clear();
            v1(bundle2, edit, null);
            edit.commit();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void t1() {
        if (this.Q[this.J]) {
            if (this.V.getTag() != null) {
                if (getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20678a.R = LocaleController.getString("StopLoadingTitle", R.string.StopLoadingTitle);
                alertDialog$Builder.f20678a.T = LocaleController.getString("StopLoading", R.string.StopLoading);
                alertDialog$Builder.k(LocaleController.getString("WaitMore", R.string.WaitMore), null);
                alertDialog$Builder.h(LocaleController.getString("Stop", R.string.Stop), new zc0(this, 0));
                showDialog(alertDialog$Builder.f20678a);
                return;
            }
            this.f38194b[this.f38192a].h(null);
        }
    }

    public final void u1(String str, TLRPC.auth_SentCode auth_sentcode) {
        this.e = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + str);
        bundle.putString("ephone", "+" + str);
        bundle.putString("phoneFormated", str);
        k1(bundle, auth_sentcode, true);
    }

    public final void w1(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str) {
        if (!this.f38210o0) {
            return;
        }
        o1(false, true);
        this.f38210o0 = false;
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = bundle.getString("phoneFormated");
        tL_auth_resendCode.phone_code_hash = auth_sentcode.phone_code_hash;
        if (str != null) {
            tL_auth_resendCode.flags |= 1;
            tL_auth_resendCode.reason = str;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_resendCode, new a50(8, this, bundle), 10);
    }

    public final void x1(boolean z10, boolean z11) {
        if (this.f38193a0 == z10 && z11) {
            return;
        }
        this.f38193a0 = z10;
        if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
            z10 = false;
        }
        if (z10) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
            if (z11) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                this.d = duration;
                duration.setInterpolator(org.telegram.ui.Components.bs.f25133f);
                this.d.addUpdateListener(new uc0(this, 2));
                this.d.addListener(new fd0(this, 0));
                this.d.start();
                return;
            }
            this.f38196c.setVisibility(0);
            return;
        }
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        if (z11) {
            ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
            this.d = duration2;
            duration2.setInterpolator(org.telegram.ui.Components.st.e);
            this.d.addUpdateListener(new uc0(this, 0));
            this.d.addListener(new fd0(this, 1));
            this.d.start();
            return;
        }
        this.f38196c.setVisibility(8);
    }

    public final void y1(int i10, boolean z10, Bundle bundle, boolean z11) {
        boolean z12;
        int i11;
        int i12;
        if (i10 != 0 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 10 && i10 != 12 && i10 != 17 && i10 != 16) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (i10 == this.f38192a) {
            z10 = false;
        }
        int i13 = 8;
        if (z12) {
            if (i10 == 0) {
                this.v = true;
                this.f38220w = true;
            }
            this.J = 1;
            z1(false, z10);
            A1(false, z10, false);
            this.J = 0;
            A1(false, z10, false);
            if (!z10) {
                z1(true, false);
            }
        } else {
            this.J = 0;
            z1(false, z10);
            A1(false, z10, false);
            if (i10 != 8) {
                this.J = 1;
            }
        }
        org.telegram.ui.Components.tw0[] tw0VarArr = this.f38194b;
        if (z10) {
            org.telegram.ui.Components.tw0 tw0Var = tw0VarArr[this.f38192a];
            org.telegram.ui.Components.tw0 tw0Var2 = tw0VarArr[i10];
            this.f38192a = i10;
            ImageView imageView = this.U;
            if (tw0Var2.b() || this.f38222x) {
                i13 = 0;
            }
            imageView.setVisibility(i13);
            tw0Var2.m(bundle, false);
            setParentActivityTitle(tw0Var2.getHeaderName());
            tw0Var2.j();
            int i14 = AndroidUtilities.displaySize.x;
            if (z11) {
                i14 = -i14;
            }
            tw0Var2.setX(i14);
            tw0Var2.setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new ah.q0(this, z12, tw0Var, 9));
            Property property = View.TRANSLATION_X;
            if (z11) {
                i12 = AndroidUtilities.displaySize.x;
            } else {
                i12 = -AndroidUtilities.displaySize.x;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(tw0Var, property, i12), ObjectAnimator.ofFloat(tw0Var2, property, 0.0f));
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.start();
            x1(tw0Var2.a(), true);
            return;
        }
        ImageView imageView2 = this.U;
        if (!tw0VarArr[i10].b() && !this.f38222x) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        imageView2.setVisibility(i11);
        tw0VarArr[this.f38192a].setVisibility(8);
        tw0VarArr[this.f38192a].g();
        this.f38192a = i10;
        tw0VarArr[i10].m(bundle, false);
        tw0VarArr[i10].setVisibility(0);
        setParentActivityTitle(tw0VarArr[i10].getHeaderName());
        tw0VarArr[i10].j();
        x1(tw0VarArr[i10].a(), false);
    }

    public final void z1(boolean z10, boolean z11) {
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
                animatorSetArr[this.J].addListener(new org.telegram.ui.ActionBar.g(this, z12, z10, 5));
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
                animatorSetArr[this.J].setDuration(i12);
                animatorSetArr[this.J].setInterpolator(timeInterpolator);
                animatorSetArr[this.J].start();
            } else if (z12) {
                this.N.e(z10, z11);
            }
        }
    }

    public ig0(int i10) {
        super(null);
        this.f38194b = new org.telegram.ui.Components.tw0[19];
        this.f38213r = new ArrayList();
        this.f38215s = new ArrayList();
        this.v = true;
        this.f38220w = true;
        this.f38223y = true;
        this.E = false;
        this.F = 0;
        this.K = new AnimatorSet[2];
        this.Q = new boolean[]{true, false};
        this.f38193a0 = false;
        this.f38204i0 = new boolean[2];
        this.f38205j0 = new Runnable[2];
        this.f38206k0 = new boolean[2];
        this.currentAccount = i10;
        this.f38222x = true;
    }
}
