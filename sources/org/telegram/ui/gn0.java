package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Base64;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SecureDocumentKey;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class gn0 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout A0;
    public String A1;
    public ImageView B0;
    public wm0 B1;
    public TextView C0;
    public boolean C1;
    public TextView D0;
    public final fm0 D1;
    public final TLRPC.TL_secureRequiredType E;
    public TextView E0;
    public String E1;
    public TLRPC.TL_secureRequiredType F;
    public org.telegram.ui.Components.nz F0;
    public Runnable F1;
    public ArrayList G;
    public org.telegram.ui.Cells.e9 G0;
    public um0 G1;
    public final TLRPC.TL_secureValue H;
    public org.telegram.ui.Cells.e9 H0;
    public wm0 H1;
    public final TLRPC.TL_secureValue I;
    public ImageView I0;
    public int I1;
    public TL_account.Password J;
    public TextView J0;
    public final org.telegram.ui.Components.fw0[] J1;
    public TLRPC.TL_auth_sentCode K;
    public TextView K0;
    public org.telegram.ui.ActionBar.a2 K1;
    public org.telegram.ui.ActionBar.u0 L;
    public FrameLayout L0;
    public Dialog L1;
    public AnimatorSet M;
    public TextView M0;
    public final ArrayList M1;
    public org.telegram.ui.Components.uq N;
    public int N0;
    public TextView O;
    public final byte[] O0;
    public org.telegram.ui.Components.uq P;
    public final byte[] P0;
    public FrameLayout Q;
    public String Q0;
    public org.telegram.ui.Cells.ea R;
    public org.telegram.ui.Components.wi R0;
    public View S;
    public int S0;
    public View T;
    public int T0;
    public org.telegram.ui.Cells.d9 U;
    public final ArrayList U0;
    public org.telegram.ui.Cells.d9 V;
    public final HashMap V0;
    public org.telegram.ui.Cells.d9 W;
    public final HashMap W0;
    public org.telegram.ui.Cells.ea X;
    public final HashMap X0;
    public EditTextBoldCursor[] Y;
    public HashMap Y0;
    public ViewGroup[] Z;
    public boolean Z0;
    public String f33970a;
    public EditTextBoldCursor[] f33971a0;
    public boolean f33972a1;
    public final int f33973b;
    public ScrollView f33974b0;
    public long f33975b1;
    public long f33976c;
    public LinearLayout f33977c0;
    public byte[] f33978c1;
    public final String d;
    public LinearLayout f33979d0;
    public String f33980d1;
    public final String e;
    public LinearLayout f33981e0;
    public byte[] f33982e1;
    public boolean f33983f;
    public LinearLayout f33984f0;
    public boolean f33985f1;
    public LinearLayout f33986g0;
    public boolean f33987g1;
    public final String h;
    public LinearLayout f33988h0;
    public gn0 f33989h1;
    public LinearLayout f33990i0;
    public final ArrayList f33991i1;
    public org.telegram.ui.Cells.m4 f33992j0;
    public SecureDocument f33993j1;
    public final ArrayList f33994k0;
    public final ArrayList f33995k1;
    public org.telegram.ui.Cells.b7 f33996l0;
    public SecureDocument l1;
    public org.telegram.ui.Cells.b7 m0;
    public SecureDocument f33997m1;
    public final String f33998n;
    public org.telegram.ui.Cells.e9 f33999n0;
    public final HashMap f34000n1;
    public org.telegram.ui.Cells.e9 f34001o0;
    public final HashMap f34002o1;
    public org.telegram.ui.Cells.e9 f34003p0;
    public final HashMap f34004p1;
    public org.telegram.ui.Cells.e9 f34005q0;
    public final HashMap f34006q1;
    public final String f34007r;
    public org.telegram.ui.Cells.ea f34008r0;
    public final HashMap f34009r1;
    public String f34010s;
    public int f34011s0;
    public final HashMap f34012s1;
    public final boolean[] f34013t0;
    public final HashMap f34014t1;
    public boolean f34015u0;
    public final HashMap f34016u1;
    public String v;
    public boolean f34017v0;
    public final HashMap f34018v1;
    public String f34019w;
    public TextView f34020w0;
    public HashMap f34021w1;
    public final int[] f34022x;
    public org.telegram.ui.Cells.ea f34023x0;
    public HashMap f34024x1;
    public TL_account.authorizationForm f34025y;
    public org.telegram.ui.Cells.ea f34026y0;
    public final HashMap f34027y1;
    public org.telegram.ui.Cells.b7 f34028z0;
    public String f34029z1;

    public gn0(int i10, TL_account.authorizationForm authorizationform, TL_account.Password password, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureValue tL_secureValue, TLRPC.TL_secureRequiredType tL_secureRequiredType2, TLRPC.TL_secureValue tL_secureValue2, HashMap hashMap, HashMap hashMap2) {
        super(null);
        this.f34010s = "";
        this.v = "";
        this.f34022x = new int[3];
        this.f33994k0 = new ArrayList();
        this.f34013t0 = new boolean[3];
        this.f34015u0 = true;
        this.U0 = new ArrayList();
        this.V0 = new HashMap();
        this.W0 = new HashMap();
        this.X0 = new HashMap();
        this.f33991i1 = new ArrayList();
        this.f33995k1 = new ArrayList();
        this.f34000n1 = new HashMap();
        this.f34002o1 = new HashMap();
        this.f34004p1 = new HashMap();
        this.f34006q1 = new HashMap();
        this.f34009r1 = new HashMap();
        this.f34016u1 = new HashMap();
        this.f34018v1 = new HashMap();
        this.f34027y1 = new HashMap();
        this.D1 = new fm0(this);
        this.f33973b = i10;
        this.f34025y = authorizationform;
        this.E = tL_secureRequiredType;
        if (tL_secureRequiredType != null) {
            this.f34015u0 = tL_secureRequiredType.native_names;
        }
        this.H = tL_secureValue;
        this.F = tL_secureRequiredType2;
        this.I = tL_secureValue2;
        this.J = password;
        this.f34012s1 = hashMap;
        this.f34014t1 = hashMap2;
        if (i10 == 3) {
            this.M1 = new ArrayList();
        } else if (i10 == 7) {
            this.J1 = new org.telegram.ui.Components.fw0[3];
        }
        if (hashMap == null) {
            this.f34012s1 = new HashMap();
        }
        if (hashMap2 == null) {
            this.f34014t1 = new HashMap();
        }
        if (i10 == 5) {
            if (UserConfig.getInstance(this.currentAccount).savedPasswordHash != null && UserConfig.getInstance(this.currentAccount).savedSaltedPassword != null) {
                this.N0 = 1;
                this.O0 = UserConfig.getInstance(this.currentAccount).savedPasswordHash;
                this.P0 = UserConfig.getInstance(this.currentAccount).savedSaltedPassword;
            }
            TL_account.Password password2 = this.J;
            if (password2 == null) {
                w1();
            } else {
                TwoStepVerificationActivity.m0(password2);
                if (this.N0 == 1) {
                    B1(true);
                }
            }
            if (SharedConfig.isPassportConfigLoaded()) {
                return;
            }
            TLRPC.TL_help_getPassportConfig tL_help_getPassportConfig = new TLRPC.TL_help_getPassportConfig();
            tL_help_getPassportConfig.hash = SharedConfig.passportConfigHash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_help_getPassportConfig, new ai.u7(18));
        }
    }

    public static int C0(gn0 gn0Var, String str) {
        gn0Var.getClass();
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2006252145:
                if (str.equals("residence_country_code")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1537298398:
                if (str.equals("last_name_native")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1249512767:
                if (str.equals("gender")) {
                    c10 = 2;
                    break;
                }
                break;
            case -796150911:
                if (str.equals("street_line1")) {
                    c10 = 3;
                    break;
                }
                break;
            case -796150910:
                if (str.equals("street_line2")) {
                    c10 = 4;
                    break;
                }
                break;
            case -160985414:
                if (str.equals("first_name")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3053931:
                if (str.equals("city")) {
                    c10 = 6;
                    break;
                }
                break;
            case 109757585:
                if (str.equals("state")) {
                    c10 = 7;
                    break;
                }
                break;
            case 421072629:
                if (str.equals("middle_name")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 451516732:
                if (str.equals("first_name_native")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 475919162:
                if (str.equals("expiry_date")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 506677093:
                if (str.equals("document_no")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1168724782:
                if (str.equals("birth_date")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 1181577377:
                if (str.equals("middle_name_native")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 1481071862:
                if (str.equals("country_code")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2002465324:
                if (str.equals("post_code")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2013122196:
                if (str.equals("last_name")) {
                    c10 = 16;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 26;
            case 1:
            case 16:
                return 22;
            case 2:
                return 24;
            case 3:
                return 29;
            case 4:
                return 30;
            case 5:
            case '\t':
                return 20;
            case 6:
                return 32;
            case 7:
                return 33;
            case '\b':
            case '\r':
                return 21;
            case '\n':
                return 28;
            case 11:
                return 27;
            case '\f':
                return 23;
            case 14:
                return 25;
            case 15:
                return 31;
            default:
                return 100;
        }
    }

    public static boolean D0(org.telegram.ui.gn0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gn0.D0(org.telegram.ui.gn0):boolean");
    }

    public static void J0(gn0 gn0Var, EditTextBoldCursor editTextBoldCursor, String str, Editable editable, boolean z10) {
        String str2;
        String str3;
        String str4;
        String str5;
        HashMap hashMap = gn0Var.f34027y1;
        if (hashMap != null && (str3 = (String) hashMap.get(str)) != null) {
            if (TextUtils.equals(str3, editable)) {
                HashMap hashMap2 = gn0Var.f34021w1;
                if (hashMap2 != null && (str5 = (String) hashMap2.get(str)) != null) {
                    editTextBoldCursor.setErrorText(str5);
                } else {
                    HashMap hashMap3 = gn0Var.f34024x1;
                    if (hashMap3 != null && (str4 = (String) hashMap3.get(str)) != null) {
                        editTextBoldCursor.setErrorText(str4);
                    }
                }
            } else {
                editTextBoldCursor.setErrorText(null);
            }
        } else {
            editTextBoldCursor.setErrorText(null);
        }
        if (z10) {
            str2 = "error_document_all";
        } else {
            str2 = "error_all";
        }
        if (hashMap != null && hashMap.containsKey(str2)) {
            hashMap.remove(str2);
            gn0Var.a1(false);
        }
    }

    public static void U(gn0 gn0Var, TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery) {
        TL_account.Password password = gn0Var.J;
        password.email_unconfirmed_pattern = tL_auth_passwordRecovery.email_pattern;
        gn0Var.presentFragment(new zg1(gn0Var.currentAccount, 4, password));
    }

    public static void V(gn0 gn0Var) {
        ArrayList arrayList;
        int i10;
        int i11;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        HashMap hashMap = gn0Var.f34009r1;
        HashMap hashMap2 = gn0Var.f34006q1;
        String str = gn0Var.f34007r;
        ArrayList arrayList2 = new ArrayList();
        int size = gn0Var.f34025y.required_types.size();
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.SecureRequiredType secureRequiredType = gn0Var.f34025y.required_types.get(i12);
            if (secureRequiredType instanceof TLRPC.TL_secureRequiredType) {
                tL_secureRequiredType = (TLRPC.TL_secureRequiredType) secureRequiredType;
            } else {
                if (secureRequiredType instanceof TLRPC.TL_secureRequiredTypeOneOf) {
                    TLRPC.TL_secureRequiredTypeOneOf tL_secureRequiredTypeOneOf = (TLRPC.TL_secureRequiredTypeOneOf) secureRequiredType;
                    if (!tL_secureRequiredTypeOneOf.types.isEmpty()) {
                        TLRPC.SecureRequiredType secureRequiredType2 = tL_secureRequiredTypeOneOf.types.get(0);
                        if (secureRequiredType2 instanceof TLRPC.TL_secureRequiredType) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) secureRequiredType2;
                            int size2 = tL_secureRequiredTypeOneOf.types.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 < size2) {
                                    TLRPC.SecureRequiredType secureRequiredType3 = tL_secureRequiredTypeOneOf.types.get(i13);
                                    if (secureRequiredType3 instanceof TLRPC.TL_secureRequiredType) {
                                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) secureRequiredType3;
                                        if (gn0Var.r1(tL_secureRequiredType5, true) != null) {
                                            tL_secureRequiredType = tL_secureRequiredType5;
                                            break;
                                        }
                                    }
                                    i13++;
                                } else {
                                    tL_secureRequiredType = tL_secureRequiredType4;
                                    break;
                                }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            TLRPC.TL_secureValue r12 = gn0Var.r1(tL_secureRequiredType, true);
            if (r12 == null) {
                Vibrator vibrator = (Vibrator) gn0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                fn0 fn0Var = (fn0) hashMap2.get(tL_secureRequiredType);
                if (fn0Var == null && (tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    fn0Var = (fn0) hashMap2.get(tL_secureRequiredType2);
                }
                AndroidUtilities.shakeView(fn0Var);
                return;
            }
            HashMap hashMap3 = (HashMap) gn0Var.f34016u1.get(o1(tL_secureRequiredType.type));
            if (hashMap3 != null && !hashMap3.isEmpty()) {
                Vibrator vibrator2 = (Vibrator) gn0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                fn0 fn0Var2 = (fn0) hashMap2.get(tL_secureRequiredType);
                if (fn0Var2 == null && (tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    fn0Var2 = (fn0) hashMap2.get(tL_secureRequiredType3);
                }
                AndroidUtilities.shakeView(fn0Var2);
                return;
            }
            boolean z10 = tL_secureRequiredType.selfie_required;
            boolean z11 = tL_secureRequiredType.translation_required;
            ?? obj = new Object();
            obj.f33964a = r12;
            obj.f33965b = z10;
            obj.f33966c = z11;
            arrayList2.add(obj);
        }
        gn0Var.N1(false, true);
        TL_account.acceptAuthorization acceptauthorization = new TL_account.acceptAuthorization();
        acceptauthorization.bot_id = gn0Var.f33976c;
        acceptauthorization.scope = gn0Var.h;
        acceptauthorization.public_key = str;
        JSONObject jSONObject = new JSONObject();
        int size3 = arrayList2.size();
        int i14 = 0;
        while (i14 < size3) {
            gm0 gm0Var = (gm0) arrayList2.get(i14);
            TLRPC.TL_secureValue tL_secureValue = gm0Var.f33964a;
            JSONObject jSONObject2 = new JSONObject();
            TLRPC.SecurePlainData securePlainData = tL_secureValue.plain_data;
            if (securePlainData != null) {
                if (securePlainData instanceof TLRPC.TL_securePlainEmail) {
                    TLRPC.TL_securePlainEmail tL_securePlainEmail = (TLRPC.TL_securePlainEmail) securePlainData;
                } else if (securePlainData instanceof TLRPC.TL_securePlainPhone) {
                    TLRPC.TL_securePlainPhone tL_securePlainPhone = (TLRPC.TL_securePlainPhone) securePlainData;
                }
            } else {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    TLRPC.TL_secureData tL_secureData = tL_secureValue.data;
                    if (tL_secureData != null) {
                        byte[] i15 = gn0Var.i1(tL_secureData.secret, tL_secureData.data_hash);
                        arrayList = arrayList2;
                        try {
                            jSONObject2.put("data_hash", Base64.encodeToString(tL_secureValue.data.data_hash, 2));
                            jSONObject2.put("secret", Base64.encodeToString(i15, 2));
                            jSONObject3.put("data", jSONObject2);
                        } catch (Exception unused) {
                        }
                    } else {
                        arrayList = arrayList2;
                    }
                    if (!tL_secureValue.files.isEmpty()) {
                        JSONArray jSONArray = new JSONArray();
                        int i16 = 0;
                        for (int size4 = tL_secureValue.files.size(); i16 < size4; size4 = size4) {
                            TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) tL_secureValue.files.get(i16);
                            i10 = size3;
                            try {
                                i11 = i14;
                                try {
                                    byte[] i17 = gn0Var.i1(tL_secureFile.secret, tL_secureFile.file_hash);
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("file_hash", Base64.encodeToString(tL_secureFile.file_hash, 2));
                                    jSONObject4.put("secret", Base64.encodeToString(i17, 2));
                                    jSONArray.put(jSONObject4);
                                    i16++;
                                    size3 = i10;
                                    i14 = i11;
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                            }
                        }
                        i10 = size3;
                        i11 = i14;
                        jSONObject3.put("files", jSONArray);
                    } else {
                        i10 = size3;
                        i11 = i14;
                    }
                    TLRPC.SecureFile secureFile = tL_secureValue.front_side;
                    if (secureFile instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile;
                        byte[] i18 = gn0Var.i1(tL_secureFile2.secret, tL_secureFile2.file_hash);
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("file_hash", Base64.encodeToString(tL_secureFile2.file_hash, 2));
                        jSONObject5.put("secret", Base64.encodeToString(i18, 2));
                        jSONObject3.put("front_side", jSONObject5);
                    }
                    TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile2;
                        byte[] i19 = gn0Var.i1(tL_secureFile3.secret, tL_secureFile3.file_hash);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("file_hash", Base64.encodeToString(tL_secureFile3.file_hash, 2));
                        jSONObject6.put("secret", Base64.encodeToString(i19, 2));
                        jSONObject3.put("reverse_side", jSONObject6);
                    }
                    if (gm0Var.f33965b) {
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile3;
                            byte[] i110 = gn0Var.i1(tL_secureFile4.secret, tL_secureFile4.file_hash);
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("file_hash", Base64.encodeToString(tL_secureFile4.file_hash, 2));
                            jSONObject7.put("secret", Base64.encodeToString(i110, 2));
                            jSONObject3.put("selfie", jSONObject7);
                        }
                    }
                    if (gm0Var.f33966c && !tL_secureValue.translation.isEmpty()) {
                        JSONArray jSONArray2 = new JSONArray();
                        int size5 = tL_secureValue.translation.size();
                        for (int i20 = 0; i20 < size5; i20++) {
                            TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) tL_secureValue.translation.get(i20);
                            byte[] i111 = gn0Var.i1(tL_secureFile5.secret, tL_secureFile5.file_hash);
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("file_hash", Base64.encodeToString(tL_secureFile5.file_hash, 2));
                            jSONObject8.put("secret", Base64.encodeToString(i111, 2));
                            jSONArray2.put(jSONObject8);
                        }
                        jSONObject3.put("translation", jSONArray2);
                    }
                    jSONObject.put(o1(tL_secureValue.type), jSONObject3);
                } catch (Exception unused4) {
                }
                TLRPC.TL_secureValueHash tL_secureValueHash = new TLRPC.TL_secureValueHash();
                tL_secureValueHash.type = tL_secureValue.type;
                tL_secureValueHash.hash = tL_secureValue.hash;
                acceptauthorization.value_hashes.add(tL_secureValueHash);
                i14 = i11 + 1;
                arrayList2 = arrayList;
                size3 = i10;
            }
            arrayList = arrayList2;
            i10 = size3;
            i11 = i14;
            TLRPC.TL_secureValueHash tL_secureValueHash2 = new TLRPC.TL_secureValueHash();
            tL_secureValueHash2.type = tL_secureValue.type;
            tL_secureValueHash2.hash = tL_secureValue.hash;
            acceptauthorization.value_hashes.add(tL_secureValueHash2);
            i14 = i11 + 1;
            arrayList2 = arrayList;
            size3 = i10;
        }
        JSONObject jSONObject9 = new JSONObject();
        try {
            jSONObject9.put("secure_data", jSONObject);
        } catch (Exception unused5) {
        }
        Object obj2 = gn0Var.d;
        if (obj2 != null) {
            try {
                jSONObject9.put("payload", obj2);
            } catch (Exception unused6) {
            }
        }
        Object obj3 = gn0Var.e;
        if (obj3 != null) {
            try {
                jSONObject9.put("nonce", obj3);
            } catch (Exception unused7) {
            }
        }
        cf.c k12 = gn0Var.k1(AndroidUtilities.getStringBytes(jSONObject9.toString()));
        TLRPC.TL_secureCredentialsEncrypted tL_secureCredentialsEncrypted = new TLRPC.TL_secureCredentialsEncrypted();
        acceptauthorization.credentials = tL_secureCredentialsEncrypted;
        tL_secureCredentialsEncrypted.hash = (byte[]) k12.d;
        tL_secureCredentialsEncrypted.data = (byte[]) k12.f4254c;
        try {
            String replace = str.replaceAll("\\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "");
            Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA1AndMGF1Padding");
            cipher.init(1, (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(replace, 0))));
            acceptauthorization.credentials.secret = cipher.doFinal((byte[]) k12.f4253b);
        } catch (Exception e) {
            FileLog.e(e);
        }
        ConnectionsManager.getInstance(gn0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(gn0Var.currentAccount).sendRequest(acceptauthorization, new ul0(gn0Var, 1)), gn0Var.classGuid);
    }

    public static void W(gn0 gn0Var, TLRPC.TL_error tL_error, String str, wm0 wm0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        if (tL_error == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("phone", str);
            gn0 gn0Var2 = new gn0(7, gn0Var.f34025y, gn0Var.J, gn0Var.E, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
            gn0Var2.currentAccount = gn0Var.currentAccount;
            gn0Var2.f33982e1 = gn0Var.f33982e1;
            gn0Var2.f33978c1 = gn0Var.f33978c1;
            gn0Var2.B1 = wm0Var;
            gn0Var2.K = (TLRPC.TL_auth_sentCode) tLObject;
            gn0Var.presentFragment(gn0Var2, true);
            return;
        }
        org.telegram.ui.Components.e5.f0(gn0Var.currentAccount, tL_error, gn0Var, sendverifyphonecode, str);
    }

    public static void X(gn0 gn0Var, SecureDocument secureDocument, int i10) {
        HashMap hashMap = gn0Var.f34000n1;
        int i11 = gn0Var.S0;
        if (i11 == 1) {
            SecureDocument secureDocument2 = gn0Var.f33993j1;
            if (secureDocument2 != null) {
                en0 en0Var = (en0) hashMap.remove(secureDocument2);
                if (en0Var != null) {
                    gn0Var.f33986g0.removeView(en0Var);
                }
                gn0Var.f33993j1 = null;
            }
        } else if (i11 == 4) {
            if (gn0Var.f33995k1.size() >= 20) {
                return;
            }
        } else if (i11 == 2) {
            SecureDocument secureDocument3 = gn0Var.l1;
            if (secureDocument3 != null) {
                en0 en0Var2 = (en0) hashMap.remove(secureDocument3);
                if (en0Var2 != null) {
                    gn0Var.f33981e0.removeView(en0Var2);
                }
                gn0Var.l1 = null;
            }
        } else if (i11 == 3) {
            SecureDocument secureDocument4 = gn0Var.f33997m1;
            if (secureDocument4 != null) {
                en0 en0Var3 = (en0) hashMap.remove(secureDocument4);
                if (en0Var3 != null) {
                    gn0Var.f33984f0.removeView(en0Var3);
                }
                gn0Var.f33997m1 = null;
            }
        } else if (i11 == 0 && gn0Var.f33991i1.size() >= 20) {
            return;
        }
        gn0Var.f34002o1.put(secureDocument.path, secureDocument);
        gn0Var.L.setEnabled(false);
        gn0Var.L.setAlpha(0.5f);
        FileLoader.getInstance(gn0Var.currentAccount).uploadFile(secureDocument.path, false, true, 16777216);
        gn0Var.R0(secureDocument, i10);
        gn0Var.S1(i10);
    }

    public static void Y(org.telegram.ui.gn0 r9, boolean r10, java.lang.String r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gn0.Y(org.telegram.ui.gn0, boolean, java.lang.String):void");
    }

    public static void Z(int i10, String str, SecureDocument secureDocument, en0 en0Var, gn0 gn0Var) {
        HashMap hashMap = gn0Var.f34002o1;
        gn0Var.f34000n1.remove(secureDocument);
        if (i10 == 1) {
            gn0Var.f33993j1 = null;
            gn0Var.f33986g0.removeView(en0Var);
        } else if (i10 == 4) {
            gn0Var.f33995k1.remove(secureDocument);
            gn0Var.f33988h0.removeView(en0Var);
        } else if (i10 == 2) {
            gn0Var.l1 = null;
            gn0Var.f33981e0.removeView(en0Var);
        } else if (i10 == 3) {
            gn0Var.f33997m1 = null;
            gn0Var.f33984f0.removeView(en0Var);
        } else {
            gn0Var.f33991i1.remove(secureDocument);
            gn0Var.f33979d0.removeView(en0Var);
        }
        if (str != null) {
            HashMap hashMap2 = gn0Var.f34024x1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
            HashMap hashMap3 = gn0Var.f34027y1;
            if (hashMap3 != null) {
                hashMap3.remove(str);
            }
        }
        gn0Var.S1(i10);
        String str2 = secureDocument.path;
        if (str2 != null && hashMap.remove(str2) != null) {
            if (hashMap.isEmpty()) {
                gn0Var.L.setEnabled(true);
                gn0Var.L.setAlpha(1.0f);
            }
            FileLoader.getInstance(gn0Var.currentAccount).cancelFileUpload(secureDocument.path, false);
        }
    }

    public static boolean Z0(byte[] bArr, Long l4) {
        if (bArr == null || bArr.length != 32) {
            return false;
        }
        int i10 = 0;
        for (byte b10 : bArr) {
            i10 += b10 & 255;
        }
        if (i10 % 255 != 239) {
            return false;
        }
        if (l4 != null && Utilities.bytesToLong(Utilities.computeSHA256(bArr)) != l4.longValue()) {
            return false;
        }
        return true;
    }

    public static void a0(gn0 gn0Var) {
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        for (int i10 = 0; i10 < gn0Var.f34025y.values.size(); i10++) {
            deletesecurevalue.types.add(gn0Var.f34025y.values.get(i10).type);
        }
        gn0Var.y1();
        ConnectionsManager.getInstance(gn0Var.currentAccount).sendRequest(deletesecurevalue, new ul0(gn0Var, 2));
    }

    public static void b0(gn0 gn0Var) {
        zg1 zg1Var = new zg1(gn0Var.currentAccount, 0, gn0Var.J);
        zg1Var.Y = true;
        gn0Var.presentFragment(zg1Var);
    }

    public static void c0(gn0 gn0Var) {
        if (gn0Var.J.has_recovery) {
            gn0Var.y1();
            ConnectionsManager.getInstance(gn0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(gn0Var.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new ul0(gn0Var, 0), 10), gn0Var.classGuid);
        } else if (gn0Var.getParentActivity() == null) {
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gn0Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.RestorePasswordResetAccount), new tl0(gn0Var, 4));
            alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
            String string = LocaleController.getString(R.string.RestorePasswordNoEmailText);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18662a;
            a2Var.T = string;
            gn0Var.showDialog(a2Var);
        }
    }

    public static void d0(gn0 gn0Var) {
        Activity parentActivity = gn0Var.getParentActivity();
        nf.f.s(parentActivity, "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(gn0Var.currentAccount).getClientPhone());
    }

    public static void e0(gn0 gn0Var) {
        if (Build.VERSION.SDK_INT >= 23 && gn0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            gn0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
            return;
        }
        u9 u9Var = new u9(0);
        u9Var.L = new dm0(gn0Var);
        gn0Var.presentFragment(u9Var);
    }

    public static String h1(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr != null && bArr2 != null && bArr2.length == 32 && bArr3 != null && bArr3.length == 32) {
            byte[] computeSHA512 = Utilities.computeSHA512(bArr2, bArr3);
            byte[] bArr4 = new byte[32];
            System.arraycopy(computeSHA512, 0, bArr4, 0, 32);
            byte[] bArr5 = new byte[16];
            System.arraycopy(computeSHA512, 32, bArr5, 0, 16);
            int length = bArr.length;
            byte[] bArr6 = new byte[length];
            System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
            Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, length, 0, 0);
            if (Arrays.equals(Utilities.computeSHA256(bArr6), bArr3)) {
                int i10 = bArr6[0] & 255;
                return new String(bArr6, i10, length - i10);
            }
            return null;
        }
        return null;
    }

    public static String n1(SecureDocument secureDocument) {
        byte[] bArr;
        if (secureDocument != null) {
            TLRPC.TL_secureFile tL_secureFile = secureDocument.secureFile;
            if (tL_secureFile != null && (bArr = tL_secureFile.file_hash) != null) {
                return Base64.encodeToString(bArr, 2);
            }
            byte[] bArr2 = secureDocument.fileHash;
            if (bArr2 != null) {
                return Base64.encodeToString(bArr2, 2);
            }
            return "";
        }
        return "";
    }

    public static String o1(TLRPC.SecureValueType secureValueType) {
        if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
            return "personal_details";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
            return "passport";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
            return "internal_passport";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
            return "driver_license";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
            return "identity_card";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
            return "utility_bill";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
            return "address";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
            return "bank_statement";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
            return "rental_agreement";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
            return "temporary_registration";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
            return "passport_registration";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
            return "email";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
            return "phone";
        }
        return "";
    }

    public static byte[] p1() {
        byte[] bArr = new byte[32];
        Utilities.random.nextBytes(bArr);
        int i10 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
            i10 += 255 & bArr[i11];
        }
        int i12 = i10 % 255;
        if (i12 != 239) {
            int nextInt = Utilities.random.nextInt(32);
            int i13 = (bArr[nextInt] & 255) + (239 - i12);
            if (i13 < 255) {
                i13 += 255;
            }
            bArr[nextInt] = (byte) (i13 % 255);
        }
        return bArr;
    }

    public static String q1(TLRPC.SecureValueType secureValueType) {
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
            return LocaleController.getString(R.string.ActionBotDocumentPassport);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
            return LocaleController.getString(R.string.ActionBotDocumentDriverLicence);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
            return LocaleController.getString(R.string.ActionBotDocumentIdentityCard);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
            return LocaleController.getString(R.string.ActionBotDocumentUtilityBill);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
            return LocaleController.getString(R.string.ActionBotDocumentBankStatement);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
            return LocaleController.getString(R.string.ActionBotDocumentRentalAgreement);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
            return LocaleController.getString(R.string.ActionBotDocumentInternalPassport);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
            return LocaleController.getString(R.string.ActionBotDocumentPassportRegistration);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
            return LocaleController.getString(R.string.ActionBotDocumentTemporaryRegistration);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
            return LocaleController.getString(R.string.ActionBotDocumentPhone);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
            return LocaleController.getString(R.string.ActionBotDocumentEmail);
        }
        return "";
    }

    public static int s0(gn0 gn0Var) {
        return gn0Var.currentAccount;
    }

    public static int t0(gn0 gn0Var) {
        return gn0Var.currentAccount;
    }

    public static boolean t1(TLRPC.SecureValueType secureValueType) {
        if (!(secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) && !(secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) && !(secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) && !(secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) && !(secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement)) {
            return false;
        }
        return true;
    }

    public static boolean v1(TLRPC.SecureValueType secureValueType) {
        if (!(secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) && !(secureValueType instanceof TLRPC.TL_secureValueTypePassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
            return false;
        }
        return true;
    }

    public final void A1(boolean z10) {
        if (getParentActivity() == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        if (z10) {
            this.Y[0].setText("");
        }
        AndroidUtilities.shakeView(this.Y[0]);
    }

    public final void B1(boolean z10) {
        String obj;
        if (z10) {
            obj = null;
        } else {
            obj = this.Y[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                A1(false);
                return;
            }
            N1(true, true);
        }
        Utilities.globalQueue.postRunnable(new da0(this, z10, obj, 1));
    }

    public final void C1() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (s1(TLRPC.TL_secureValueTypePhone.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentPhone));
            arrayList2.add(TLRPC.TL_secureValueTypePhone.class);
        }
        if (s1(TLRPC.TL_secureValueTypeEmail.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentEmail));
            arrayList2.add(TLRPC.TL_secureValueTypeEmail.class);
        }
        if (s1(TLRPC.TL_secureValueTypePersonalDetails.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentIdentity));
            arrayList2.add(TLRPC.TL_secureValueTypePersonalDetails.class);
        }
        if (s1(TLRPC.TL_secureValueTypePassport.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentPassport));
            arrayList2.add(TLRPC.TL_secureValueTypePassport.class);
        }
        if (s1(TLRPC.TL_secureValueTypeInternalPassport.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentInternalPassport));
            arrayList2.add(TLRPC.TL_secureValueTypeInternalPassport.class);
        }
        if (s1(TLRPC.TL_secureValueTypePassportRegistration.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentPassportRegistration));
            arrayList2.add(TLRPC.TL_secureValueTypePassportRegistration.class);
        }
        if (s1(TLRPC.TL_secureValueTypeTemporaryRegistration.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentTemporaryRegistration));
            arrayList2.add(TLRPC.TL_secureValueTypeTemporaryRegistration.class);
        }
        if (s1(TLRPC.TL_secureValueTypeIdentityCard.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentIdentityCard));
            arrayList2.add(TLRPC.TL_secureValueTypeIdentityCard.class);
        }
        if (s1(TLRPC.TL_secureValueTypeDriverLicense.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentDriverLicence));
            arrayList2.add(TLRPC.TL_secureValueTypeDriverLicense.class);
        }
        if (s1(TLRPC.TL_secureValueTypeAddress.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentAddress));
            arrayList2.add(TLRPC.TL_secureValueTypeAddress.class);
        }
        if (s1(TLRPC.TL_secureValueTypeUtilityBill.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentUtilityBill));
            arrayList2.add(TLRPC.TL_secureValueTypeUtilityBill.class);
        }
        if (s1(TLRPC.TL_secureValueTypeBankStatement.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentBankStatement));
            arrayList2.add(TLRPC.TL_secureValueTypeBankStatement.class);
        }
        if (s1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentRentalAgreement));
            arrayList2.add(TLRPC.TL_secureValueTypeRentalAgreement.class);
        }
        if (getParentActivity() != null && !arrayList.isEmpty()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.PassportNoDocumentsAdd);
            alertDialog$Builder.f((CharSequence[]) arrayList.toArray(new CharSequence[0]), new lg.j(9, this, arrayList2));
            showDialog(alertDialog$Builder.f18662a);
        }
    }

    public final void D1() {
        boolean z10;
        int size;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        int i11 = this.S0;
        ArrayList arrayList = this.f33991i1;
        int i12 = 1;
        if (i11 == 0 && arrayList.size() >= 20) {
            M1(LocaleController.getString(R.string.AppName), LocaleController.formatString("PassportUploadMaxReached", R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", 20, new Object[0])));
            return;
        }
        c1();
        org.telegram.ui.Components.wi wiVar = this.R0;
        int i13 = this.S0;
        if (i13 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        wiVar.U1 = z10;
        if (i13 == 0) {
            size = arrayList.size();
        } else {
            if (i13 == 4) {
                size = this.f33995k1.size();
            }
            wiVar.J1(i12, false);
            this.R0.f30018j0.f0();
            i10 = Build.VERSION.SDK_INT;
            if (i10 != 21 || i10 == 22) {
                AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            }
            this.R0.r1();
            showDialog(this.R0);
        }
        i12 = 20 - size;
        wiVar.J1(i12, false);
        this.R0.f30018j0.f0();
        i10 = Build.VERSION.SDK_INT;
        if (i10 != 21) {
        }
        AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
        this.R0.r1();
        showDialog(this.R0);
    }

    public final void E1(TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, boolean z10) {
        int i10;
        TLRPC.SecureValueType secureValueType;
        int i11;
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType.type;
        if (tL_secureRequiredType2 != null) {
            secureValueType = tL_secureRequiredType2.type;
        } else {
            secureValueType = null;
        }
        if (secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
            i11 = 1;
        } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
            i11 = 2;
        } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePhone) {
            i11 = 3;
        } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail) {
            i11 = 4;
        } else {
            i11 = -1;
        }
        if (i11 != -1) {
            HashMap hashMap4 = this.f34016u1;
            if (!z10) {
                hashMap = (HashMap) hashMap4.get(o1(secureValueType2));
            } else {
                hashMap = null;
            }
            HashMap hashMap5 = (HashMap) hashMap4.get(o1(secureValueType));
            TLRPC.TL_secureValue r12 = r1(tL_secureRequiredType, false);
            TLRPC.TL_secureValue r13 = r1(tL_secureRequiredType2, false);
            HashMap hashMap6 = hashMap;
            TL_account.authorizationForm authorizationform = this.f34025y;
            int i12 = i11;
            TL_account.Password password = this.J;
            HashMap hashMap7 = this.f34004p1;
            HashMap hashMap8 = (HashMap) hashMap7.get(tL_secureRequiredType);
            if (tL_secureRequiredType2 != null) {
                hashMap2 = hashMap5;
                hashMap3 = (HashMap) hashMap7.get(tL_secureRequiredType2);
            } else {
                hashMap2 = hashMap5;
                hashMap3 = null;
            }
            gn0 gn0Var = new gn0(i12, authorizationform, password, tL_secureRequiredType, r12, tL_secureRequiredType2, r13, hashMap8, hashMap3);
            gn0Var.B1 = new jm0(this, secureValueType2, z10, i10);
            gn0Var.currentAccount = this.currentAccount;
            gn0Var.f33982e1 = this.f33982e1;
            gn0Var.f33978c1 = this.f33978c1;
            gn0Var.f33976c = this.f33976c;
            gn0Var.f34021w1 = hashMap6;
            gn0Var.f34017v0 = z10;
            gn0Var.f34024x1 = hashMap2;
            gn0Var.G = arrayList;
            if (i12 == 4) {
                gn0Var.f33980d1 = this.f33980d1;
            }
            presentFragment(gn0Var);
        }
    }

    public final void F1(int i10) {
        if (i10 == 0) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23 && getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                return;
            }
            try {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File generatePicturePath = AndroidUtilities.generatePicturePath();
                if (generatePicturePath != null) {
                    if (i11 >= 24) {
                        Activity parentActivity = getParentActivity();
                        intent.putExtra("output", FileProvider.d(parentActivity, ApplicationLoader.getApplicationId() + ".provider", generatePicturePath));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(generatePicturePath));
                    }
                    this.Q0 = generatePicturePath.getAbsolutePath();
                }
                startActivityForResult(intent, 0);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void G1(ArrayList arrayList) {
        boolean z10;
        if (arrayList.isEmpty()) {
            return;
        }
        int i10 = this.S0;
        boolean z11 = true;
        if (i10 != 1 && i10 != 4 && (this.E.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            int i11 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.Y;
                if (i11 < editTextBoldCursorArr.length) {
                    if (i11 != 5 && i11 != 8 && i11 != 4 && i11 != 6 && editTextBoldCursorArr[i11].length() > 0) {
                        z11 = false;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            z10 = z11;
        } else {
            z10 = false;
        }
        Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.l0(this.S0, 7, this, arrayList, z10));
    }

    public final TLRPC.TL_secureValue H1(TLRPC.TL_secureRequiredType tL_secureRequiredType) {
        if (tL_secureRequiredType == null) {
            return null;
        }
        int size = this.f34025y.values.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (tL_secureRequiredType.type.getClass() == this.f34025y.values.get(i10).type.getClass()) {
                return this.f34025y.values.remove(i10);
            }
        }
        return null;
    }

    public final void I1(View view) {
        while (view != null && this.f33977c0.indexOfChild(view) < 0) {
            view = (View) view.getParent();
        }
        if (view != null) {
            this.f33974b0.smoothScrollTo(0, view.getTop() - ((this.f33974b0.getMeasuredHeight() - view.getMeasuredHeight()) / 2));
        }
    }

    public final void J1(HashMap hashMap, EditTextBoldCursor editTextBoldCursor, String str) {
        CharSequence charSequence;
        CharSequence charSequence2;
        String str2 = (String) hashMap.get(str);
        if (str2 != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -2006252145:
                    if (str.equals("residence_country_code")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1249512767:
                    if (str.equals("gender")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 475919162:
                    if (str.equals("expiry_date")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1481071862:
                    if (str.equals("country_code")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    this.v = str2;
                    CharSequence charSequence3 = (String) this.Y0.get(str2);
                    if (charSequence3 != null) {
                        editTextBoldCursor.setText(charSequence3);
                        break;
                    }
                    break;
                case 1:
                    if ("male".equals(str2)) {
                        this.f34019w = str2;
                        editTextBoldCursor.setText(LocaleController.getString(R.string.PassportMale));
                        break;
                    } else if ("female".equals(str2)) {
                        this.f34019w = str2;
                        editTextBoldCursor.setText(LocaleController.getString(R.string.PassportFemale));
                        break;
                    }
                    break;
                case 2:
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    int[] iArr = this.f34022x;
                    if (!isEmpty) {
                        String[] split = str2.split("\\.");
                        if (split.length == 3) {
                            iArr[0] = Utilities.parseInt((CharSequence) split[2]).intValue();
                            iArr[1] = Utilities.parseInt((CharSequence) split[1]).intValue();
                            iArr[2] = Utilities.parseInt((CharSequence) split[0]).intValue();
                            editTextBoldCursor.setText(str2);
                            break;
                        }
                    }
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    editTextBoldCursor.setText(LocaleController.getString(R.string.PassportNoExpireDate));
                    break;
                case 3:
                    this.f34010s = str2;
                    CharSequence charSequence4 = (String) this.Y0.get(str2);
                    if (charSequence4 != null) {
                        editTextBoldCursor.setText(charSequence4);
                        break;
                    }
                    break;
                default:
                    editTextBoldCursor.setText(str2);
                    break;
            }
        }
        HashMap hashMap2 = this.f34021w1;
        HashMap hashMap3 = this.f34027y1;
        if (hashMap2 != null && (charSequence2 = (String) hashMap2.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence2);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
            return;
        }
        HashMap hashMap4 = this.f34024x1;
        if (hashMap4 != null && (charSequence = (String) hashMap4.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
        }
    }

    public final void K1(Bundle bundle, int i10, boolean z10) {
        if (i10 == 3) {
            this.L.setVisibility(8);
        }
        int i11 = this.I1;
        org.telegram.ui.Components.fw0[] fw0VarArr = this.J1;
        org.telegram.ui.Components.fw0 fw0Var = fw0VarArr[i11];
        org.telegram.ui.Components.fw0 fw0Var2 = fw0VarArr[i10];
        this.I1 = i10;
        fw0Var2.m(bundle, false);
        fw0Var2.j();
        if (z10) {
            fw0Var2.setTranslationX(AndroidUtilities.displaySize.x);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.setDuration(300L);
            animatorSet.playTogether(ObjectAnimator.ofFloat(fw0Var, "translationX", -AndroidUtilities.displaySize.x), ObjectAnimator.ofFloat(fw0Var2, "translationX", 0.0f));
            animatorSet.addListener(new org.telegram.ui.Components.al0(fw0Var2, fw0Var, 8));
            animatorSet.start();
            return;
        }
        fw0Var2.setTranslationX(0.0f);
        fw0Var2.setVisibility(0);
        if (fw0Var != fw0Var2) {
            fw0Var.setVisibility(8);
        }
    }

    public final void L1(org.telegram.tgnet.TLRPC.TL_secureRequiredType r31, java.lang.String r32, java.lang.String r33, org.telegram.tgnet.TLRPC.TL_secureRequiredType r34, java.lang.String r35, boolean r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gn0.L1(org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, boolean, int):void");
    }

    public final void M1(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18662a;
        a2Var.R = str;
        a2Var.T = str2;
        showDialog(a2Var);
    }

    public final void N1(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.M;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10 && this.L != null) {
            this.M = new AnimatorSet();
            if (z11) {
                this.N.setVisibility(0);
                this.L.setEnabled(false);
                AnimatorSet animatorSet2 = this.M;
                View contentView = this.L.getContentView();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(contentView, property, 0.1f);
                View contentView2 = this.L.getContentView();
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(contentView2, property2, 0.1f);
                View contentView3 = this.L.getContentView();
                Property property3 = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(contentView3, property3, 0.0f), ObjectAnimator.ofFloat(this.N, property, 1.0f), ObjectAnimator.ofFloat(this.N, property2, 1.0f), ObjectAnimator.ofFloat(this.N, property3, 1.0f));
            } else {
                this.L.getContentView().setVisibility(0);
                this.L.setEnabled(true);
                AnimatorSet animatorSet3 = this.M;
                org.telegram.ui.Components.uq uqVar = this.N;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(uqVar, property4, 0.1f);
                org.telegram.ui.Components.uq uqVar2 = this.N;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(uqVar2, property5, 0.1f);
                org.telegram.ui.Components.uq uqVar3 = this.N;
                Property property6 = View.ALPHA;
                animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(uqVar3, property6, 0.0f), ObjectAnimator.ofFloat(this.L.getContentView(), property4, 1.0f), ObjectAnimator.ofFloat(this.L.getContentView(), property5, 1.0f), ObjectAnimator.ofFloat(this.L.getContentView(), property6, 1.0f));
            }
            this.M.addListener(new km0(this, z11, 0));
            this.M.setDuration(150L);
            this.M.start();
        } else if (this.O != null) {
            this.M = new AnimatorSet();
            if (z11) {
                this.P.setVisibility(0);
                this.Q.setEnabled(false);
                AnimatorSet animatorSet4 = this.M;
                TextView textView = this.O;
                Property property7 = View.SCALE_X;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView, property7, 0.1f);
                TextView textView2 = this.O;
                Property property8 = View.SCALE_Y;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textView2, property8, 0.1f);
                TextView textView3 = this.O;
                Property property9 = View.ALPHA;
                animatorSet4.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(textView3, property9, 0.0f), ObjectAnimator.ofFloat(this.P, property7, 1.0f), ObjectAnimator.ofFloat(this.P, property8, 1.0f), ObjectAnimator.ofFloat(this.P, property9, 1.0f));
            } else {
                this.O.setVisibility(0);
                this.Q.setEnabled(true);
                AnimatorSet animatorSet5 = this.M;
                org.telegram.ui.Components.uq uqVar4 = this.P;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(uqVar4, property10, 0.1f);
                org.telegram.ui.Components.uq uqVar5 = this.P;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(uqVar5, property11, 0.1f);
                org.telegram.ui.Components.uq uqVar6 = this.P;
                Property property12 = View.ALPHA;
                animatorSet5.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(uqVar6, property12, 0.0f), ObjectAnimator.ofFloat(this.O, property10, 1.0f), ObjectAnimator.ofFloat(this.O, property11, 1.0f), ObjectAnimator.ofFloat(this.O, property12, 1.0f));
            }
            this.M.addListener(new km0(this, z11, 1));
            this.M.setDuration(150L);
            this.M.start();
        }
    }

    public final void O1(boolean z10, String str, Runnable runnable, um0 um0Var, wm0 wm0Var) {
        boolean z11;
        boolean z12;
        boolean z13;
        TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        if (telephonyManager.getSimState() != 1 && telephonyManager.getPhoneType() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (getParentActivity() != null && Build.VERSION.SDK_INT >= 23 && z11) {
            if (getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10) {
                this.M1.clear();
                if (!z12) {
                    this.M1.add("android.permission.READ_PHONE_STATE");
                }
                if (!this.M1.isEmpty()) {
                    if (getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.AllowReadCall);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18662a;
                        a2Var.T = string;
                        this.L1 = showDialog(a2Var);
                    } else {
                        getParentActivity().requestPermissions((String[]) this.M1.toArray(new String[0]), 6);
                    }
                    this.E1 = str;
                    this.G1 = um0Var;
                    this.F1 = runnable;
                    this.H1 = wm0Var;
                    return;
                }
            }
        } else {
            z12 = true;
        }
        TL_account.sendVerifyPhoneCode sendverifyphonecode = new TL_account.sendVerifyPhoneCode();
        sendverifyphonecode.phone_number = str;
        TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
        sendverifyphonecode.settings = tL_codeSettings;
        if (z11 && z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        tL_codeSettings.allow_flashcall = z13;
        tL_codeSettings.allow_app_hash = PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices();
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
        if (sendverifyphonecode.settings.allow_app_hash) {
            sharedPreferences.edit().putString("sms_hash", BuildVars.getSmsHash()).commit();
        } else {
            sharedPreferences.edit().remove("sms_hash").commit();
        }
        if (sendverifyphonecode.settings.allow_flashcall) {
            try {
                String line1Number = telephonyManager.getLine1Number();
                if (!TextUtils.isEmpty(line1Number)) {
                    sendverifyphonecode.settings.current_number = PhoneNumberUtils.compare(str, line1Number);
                    TLRPC.TL_codeSettings tL_codeSettings2 = sendverifyphonecode.settings;
                    if (!tL_codeSettings2.current_number) {
                        tL_codeSettings2.allow_flashcall = false;
                    }
                } else {
                    TLRPC.TL_codeSettings tL_codeSettings3 = sendverifyphonecode.settings;
                    tL_codeSettings3.unknown_number = true;
                    tL_codeSettings3.current_number = false;
                }
            } catch (Exception e) {
                sendverifyphonecode.settings.allow_flashcall = false;
                FileLog.e(e);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendverifyphonecode, new ai.p3(this, str, wm0Var, sendverifyphonecode, 9), 2);
    }

    public final void P1() {
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        if (tL_secureRequiredType != null) {
            this.actionBar.setTitle(q1(tL_secureRequiredType.type));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.PassportPersonal));
        }
        S1(2);
        S1(3);
        S1(1);
        S1(4);
    }

    public final void Q1() {
        if (this.f34025y.values.isEmpty()) {
            this.A0.setVisibility(0);
            this.f33996l0.setVisibility(8);
            this.f33992j0.setVisibility(8);
            this.f34023x0.setVisibility(8);
            this.f34026y0.setVisibility(8);
            this.f34028z0.setVisibility(8);
            return;
        }
        this.A0.setVisibility(8);
        this.f33996l0.setVisibility(0);
        this.f33992j0.setVisibility(0);
        this.f34026y0.setVisibility(0);
        this.f34028z0.setVisibility(0);
        if (!s1(TLRPC.TL_secureValueTypePhone.class) && !s1(TLRPC.TL_secureValueTypeEmail.class) && !s1(TLRPC.TL_secureValueTypePersonalDetails.class) && !s1(TLRPC.TL_secureValueTypePassport.class) && !s1(TLRPC.TL_secureValueTypeInternalPassport.class) && !s1(TLRPC.TL_secureValueTypeIdentityCard.class) && !s1(TLRPC.TL_secureValueTypeDriverLicense.class) && !s1(TLRPC.TL_secureValueTypeAddress.class) && !s1(TLRPC.TL_secureValueTypeUtilityBill.class) && !s1(TLRPC.TL_secureValueTypePassportRegistration.class) && !s1(TLRPC.TL_secureValueTypeTemporaryRegistration.class) && !s1(TLRPC.TL_secureValueTypeBankStatement.class) && !s1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            this.f34023x0.setVisibility(8);
        } else {
            this.f34023x0.setVisibility(0);
        }
    }

    public final void R0(final SecureDocument secureDocument, final int i10) {
        String string;
        final String str;
        String formatDateForBan;
        HashMap hashMap;
        if (i10 == 1) {
            this.f33993j1 = secureDocument;
            if (this.f33986g0 == null) {
                return;
            }
        } else if (i10 == 4) {
            this.f33995k1.add(secureDocument);
            if (this.f33988h0 == null) {
                return;
            }
        } else if (i10 == 2) {
            this.l1 = secureDocument;
            if (this.f33981e0 == null) {
                return;
            }
        } else if (i10 == 3) {
            this.f33997m1 = secureDocument;
            if (this.f33984f0 == null) {
                return;
            }
        } else {
            this.f33991i1.add(secureDocument);
            if (this.f33979d0 == null) {
                return;
            }
        }
        if (getParentActivity() == null) {
            return;
        }
        final en0 en0Var = new en0(this, getParentActivity());
        en0Var.setTag(secureDocument);
        en0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
        this.f34000n1.put(secureDocument, en0Var);
        String n12 = n1(secureDocument);
        if (i10 == 1) {
            string = LocaleController.getString(R.string.PassportSelfie);
            this.f33986g0.addView(en0Var, w7.y5.n(-1, -2));
            str = "selfie" + n12;
        } else if (i10 == 4) {
            string = LocaleController.getString(R.string.AttachPhoto);
            this.f33988h0.addView(en0Var, w7.y5.n(-1, -2));
            str = "translation" + n12;
        } else if (i10 == 2) {
            TLRPC.SecureValueType secureValueType = this.F.type;
            if (!(secureValueType instanceof TLRPC.TL_secureValueTypePassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                string = LocaleController.getString(R.string.PassportFrontSide);
            } else {
                string = LocaleController.getString(R.string.PassportMainPage);
            }
            this.f33981e0.addView(en0Var, w7.y5.n(-1, -2));
            str = "front" + n12;
        } else if (i10 == 3) {
            string = LocaleController.getString(R.string.PassportReverseSide);
            this.f33984f0.addView(en0Var, w7.y5.n(-1, -2));
            str = "reverse" + n12;
        } else {
            string = LocaleController.getString(R.string.AttachPhoto);
            this.f33979d0.addView(en0Var, w7.y5.n(-1, -2));
            str = "files" + n12;
        }
        if (str != null && (hashMap = this.f34024x1) != null && (formatDateForBan = (String) hashMap.get(str)) != null) {
            en0Var.f33446b.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19280p7, false));
            this.f34027y1.put(str, "");
        } else {
            formatDateForBan = LocaleController.formatDateForBan(secureDocument.secureFile.date);
        }
        en0Var.f33445a.setText(string);
        en0Var.f33446b.setText(formatDateForBan);
        org.telegram.ui.Components.w9 w9Var = en0Var.f33447c;
        w9Var.getClass();
        w9Var.m(ImageLocation.getForSecureDocument(secureDocument), "48_48", null, null, null, null, 0, null);
        en0Var.f33448f = secureDocument;
        en0Var.a(false);
        en0Var.setOnClickListener(new ci.n4(this, i10, 20));
        en0Var.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                gn0 gn0Var = this;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gn0Var.getParentActivity());
                int i11 = i10;
                if (i11 == 1) {
                    alertDialog$Builder.f18662a.T = LocaleController.getString(R.string.PassportDeleteSelfie);
                } else {
                    alertDialog$Builder.f18662a.T = LocaleController.getString(R.string.PassportDeleteScan);
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.Components.e2(gn0Var, secureDocument, i11, en0Var, str, 3));
                gn0Var.showDialog(alertDialog$Builder.f18662a);
                return true;
            }
        });
    }

    public final void R1() {
        ImageView imageView = this.I0;
        if (imageView != null) {
            TL_account.Password password = this.J;
            if (password != null && this.N0 == 0) {
                if (!password.has_password) {
                    this.G0.setVisibility(0);
                    this.I0.setVisibility(0);
                    this.J0.setVisibility(0);
                    this.K0.setVisibility(0);
                    this.L0.setVisibility(8);
                    this.Z[0].setVisibility(8);
                    this.L.setVisibility(8);
                    this.M0.setVisibility(8);
                    this.H0.setVisibility(8);
                    this.G0.setLayoutParams(w7.y5.k(0.0f, 25.0f, 0.0f, 0.0f, -1, -2));
                    this.F0.setVisibility(8);
                    return;
                }
                this.G0.setVisibility(0);
                this.I0.setVisibility(8);
                this.J0.setVisibility(8);
                this.K0.setVisibility(8);
                this.F0.setVisibility(8);
                this.L0.setVisibility(0);
                this.Z[0].setVisibility(0);
                this.L.setVisibility(0);
                this.M0.setVisibility(0);
                this.H0.setVisibility(0);
                this.G0.setLayoutParams(w7.y5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                if (this.Y != null) {
                    TL_account.Password password2 = this.J;
                    if (password2 != null && !TextUtils.isEmpty(password2.hint)) {
                        this.Y[0].setHint(this.J.hint);
                        return;
                    } else {
                        this.Y[0].setHint(LocaleController.getString(R.string.LoginPassword));
                        return;
                    }
                }
                return;
            }
            imageView.setVisibility(8);
            this.J0.setVisibility(8);
            this.K0.setVisibility(8);
            this.L0.setVisibility(8);
            this.Z[0].setVisibility(8);
            this.L.setVisibility(8);
            this.M0.setVisibility(8);
            this.H0.setVisibility(8);
            this.G0.setVisibility(8);
            this.F0.setVisibility(0);
        }
    }

    public final void S0(TLRPC.TL_secureFile tL_secureFile, int i10) {
        byte[] bArr = tL_secureFile.secret;
        byte[] bArr2 = tL_secureFile.file_hash;
        byte[] computeSHA512 = Utilities.computeSHA512(i1(bArr, bArr2), bArr2);
        byte[] bArr3 = new byte[32];
        System.arraycopy(computeSHA512, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(computeSHA512, 32, bArr4, 0, 16);
        R0(new SecureDocument(new SecureDocumentKey(bArr3, bArr4), tL_secureFile, null, null, null), i10);
    }

    public final void S1(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gn0.S1(int):void");
    }

    public final void T0(ArrayList arrayList) {
        this.f33991i1.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i10);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                S0((TLRPC.TL_secureFile) secureFile, 0);
            }
        }
    }

    public final org.telegram.ui.fn0 U0(android.content.Context r28, org.telegram.tgnet.TLRPC.TL_secureRequiredType r29, java.util.ArrayList r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gn0.U0(android.content.Context, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.util.ArrayList, boolean, boolean):org.telegram.ui.fn0");
    }

    public final void V0(ArrayList arrayList) {
        this.f33995k1.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i10);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                S0((TLRPC.TL_secureFile) secureFile, 4);
            }
        }
    }

    public final void W0(boolean z10) {
        int i10;
        if (!this.f33987g1) {
            String str = this.f33998n;
            boolean isEmpty = TextUtils.isEmpty(str);
            int i11 = this.f33973b;
            if (!isEmpty) {
                if (z10) {
                    Activity parentActivity = getParentActivity();
                    nf.f.p(parentActivity, Uri.parse(str + "&tg_passport=success"), true, true);
                } else if (!this.f33985f1 && (i11 == 5 || i11 == 0)) {
                    Activity parentActivity2 = getParentActivity();
                    nf.f.p(parentActivity2, Uri.parse(str + "&tg_passport=cancel"), true, true);
                }
                this.f33987g1 = true;
            } else if (this.C1) {
                if (z10 || (!this.f33985f1 && (i11 == 5 || i11 == 0))) {
                    Activity parentActivity3 = getParentActivity();
                    if (z10) {
                        i10 = -1;
                    } else {
                        i10 = 0;
                    }
                    parentActivity3.setResult(i10);
                }
                this.f33987g1 = true;
            }
        }
    }

    public final boolean X0(boolean z10) {
        if (u1()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new tl0(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.DiscardChanges);
            String string = LocaleController.getString(R.string.PassportDiscardChanges);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18662a;
            a2Var.T = string;
            showDialog(a2Var);
            return true;
        }
        return true;
    }

    public final void Y0(boolean z10) {
        String str;
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.f33971a0 != null) {
            String str2 = (String) this.Y0.get(this.v);
            String str3 = SharedConfig.getCountryLangs().get(this.v);
            int i10 = 0;
            if (this.E.native_names && !TextUtils.isEmpty(this.v) && !"EN".equals(str3)) {
                if (this.f34005q0.getVisibility() != 0) {
                    this.f34005q0.setVisibility(0);
                    this.f33992j0.setVisibility(0);
                    this.T.setVisibility(0);
                    int i11 = 0;
                    while (true) {
                        editTextBoldCursorArr = this.f33971a0;
                        if (i11 >= editTextBoldCursorArr.length) {
                            break;
                        }
                        ((View) editTextBoldCursorArr[i11].getParent()).setVisibility(0);
                        i11++;
                    }
                    if (editTextBoldCursorArr[0].length() == 0 && this.f33971a0[1].length() == 0 && this.f33971a0[2].length() == 0) {
                        int i12 = 0;
                        while (true) {
                            boolean[] zArr = this.f34013t0;
                            if (i12 >= zArr.length) {
                                break;
                            } else if (zArr[i12]) {
                                this.f33971a0[0].setText(this.Y[0].getText());
                                this.f33971a0[1].setText(this.Y[1].getText());
                                this.f33971a0[2].setText(this.Y[2].getText());
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    this.m0.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.h6.f19024b7));
                }
                this.f34005q0.setText(LocaleController.formatString("PassportNativeInfo", R.string.PassportNativeInfo, str2));
                if (str3 != null) {
                    str = LocaleController.getServerString("PassportLanguage_".concat(str3));
                } else {
                    str = null;
                }
                if (str != null) {
                    this.f33992j0.setText(LocaleController.formatString("PassportNativeHeaderLang", R.string.PassportNativeHeaderLang, str));
                } else {
                    this.f33992j0.setText(LocaleController.getString(R.string.PassportNativeHeader));
                }
                for (int i13 = 0; i13 < 3; i13++) {
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 == 2) {
                                if (str != null) {
                                    this.f33971a0[i13].setHintText(LocaleController.getString(R.string.PassportSurname));
                                } else {
                                    this.f33971a0[i13].setHintText(LocaleController.formatString("PassportSurnameCountry", R.string.PassportSurnameCountry, str2));
                                }
                            }
                        } else if (str != null) {
                            this.f33971a0[i13].setHintText(LocaleController.getString(R.string.PassportMidname));
                        } else {
                            this.f33971a0[i13].setHintText(LocaleController.formatString("PassportMidnameCountry", R.string.PassportMidnameCountry, str2));
                        }
                    } else if (str != null) {
                        this.f33971a0[i13].setHintText(LocaleController.getString(R.string.PassportName));
                    } else {
                        this.f33971a0[i13].setHintText(LocaleController.formatString("PassportNameCountry", R.string.PassportNameCountry, str2));
                    }
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new ql0(this, 2));
                }
            } else if (this.f34005q0.getVisibility() != 8) {
                this.f34005q0.setVisibility(8);
                this.f33992j0.setVisibility(8);
                this.T.setVisibility(8);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.f33971a0;
                    if (i10 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    ((View) editTextBoldCursorArr2[i10].getParent()).setVisibility(8);
                    i10++;
                }
                if (((this.f33976c != 0 || this.F == null) && this.H != null && !this.f34017v0) || this.I != null) {
                    this.m0.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.h6.f19024b7));
                } else {
                    this.m0.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f19024b7));
                }
            }
        }
    }

    public final void a1(boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        String str2;
        if (this.f34003p0 != null) {
            HashMap hashMap = this.f34021w1;
            HashMap hashMap2 = this.f34027y1;
            if (hashMap != null && ((z10 || hashMap2.containsKey("error_all")) && (str2 = (String) this.f34021w1.get("error_all")) != null)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
                if (z10) {
                    hashMap2.put("error_all", "");
                }
            } else {
                spannableStringBuilder = null;
            }
            if (this.f34024x1 != null && ((z10 || hashMap2.containsKey("error_document_all")) && (str = (String) this.f34024x1.get("error_all")) != null)) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder(str);
                } else {
                    spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) str);
                }
                if (z10) {
                    hashMap2.put("error_document_all", "");
                }
            }
            if (spannableStringBuilder != null) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19280p7, false)), 0, spannableStringBuilder.length(), 33);
                this.f34003p0.setText(spannableStringBuilder);
                this.f34003p0.setVisibility(0);
            } else if (this.f34003p0.getVisibility() != 8) {
                this.f34003p0.setVisibility(8);
            }
        }
    }

    public final void b1(Context context) {
        long j3;
        String str;
        this.Y0 = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.Y0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
        this.f34003p0 = e9Var;
        int i10 = R.drawable.greydivider_top;
        int i11 = org.telegram.ui.ActionBar.h6.f19024b7;
        e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, i10, i11));
        this.f34003p0.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.f33977c0.addView(this.f34003p0, w7.y5.n(-1, -2));
        a1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        if (tL_secureRequiredType != null) {
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ActionBotDocumentRentalAgreement));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ActionBotDocumentBankStatement));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ActionBotDocumentUtilityBill));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ActionBotDocumentPassportRegistration));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ActionBotDocumentTemporaryRegistration));
            }
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
            this.f33992j0 = m4Var;
            m4Var.setText(LocaleController.getString(R.string.PassportDocuments));
            org.telegram.ui.Cells.m4 m4Var2 = this.f33992j0;
            int i12 = org.telegram.ui.ActionBar.h6.f19060d6;
            m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
            this.f33977c0.addView(this.f33992j0, w7.y5.n(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.f33979d0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f33977c0.addView(this.f33979d0, w7.y5.n(-1, -2));
            org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context);
            this.R = eaVar;
            eaVar.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
            this.f33977c0.addView(this.R, w7.y5.n(-1, -2));
            this.R.setOnClickListener(new rl0(this, 7));
            org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
            this.f33999n0 = e9Var2;
            e9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider, i11));
            if (this.f33976c != 0) {
                this.f34029z1 = LocaleController.getString(R.string.PassportAddAddressUploadInfo);
            } else {
                TLRPC.SecureValueType secureValueType2 = this.F.type;
                if (secureValueType2 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                    this.f34029z1 = LocaleController.getString(R.string.PassportAddAgreementInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                    this.f34029z1 = LocaleController.getString(R.string.PassportAddBillInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                    this.f34029z1 = LocaleController.getString(R.string.PassportAddPassportRegistrationInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                    this.f34029z1 = LocaleController.getString(R.string.PassportAddTemporaryRegistrationInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                    this.f34029z1 = LocaleController.getString(R.string.PassportAddBankInfo);
                } else {
                    this.f34029z1 = "";
                }
            }
            String str2 = this.f34029z1;
            HashMap hashMap = this.f34024x1;
            j3 = 0;
            HashMap hashMap2 = this.f34027y1;
            String str3 = str2;
            if (hashMap != null) {
                String str4 = (String) hashMap.get("files_all");
                str3 = str2;
                if (str4 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                    spannableStringBuilder.append((CharSequence) "\n\n");
                    spannableStringBuilder.append((CharSequence) this.f34029z1);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19280p7, false)), 0, str4.length(), 33);
                    hashMap2.put("files_all", "");
                    str3 = spannableStringBuilder;
                }
            }
            this.f33999n0.setText(str3);
            this.f33977c0.addView(this.f33999n0, w7.y5.n(-1, -2));
            if (this.F.translation_required) {
                org.telegram.ui.Cells.m4 m4Var3 = new org.telegram.ui.Cells.m4(context);
                this.f33992j0 = m4Var3;
                m4Var3.setText(LocaleController.getString(R.string.PassportTranslation));
                this.f33992j0.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
                this.f33977c0.addView(this.f33992j0, w7.y5.n(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.f33988h0 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.f33977c0.addView(this.f33988h0, w7.y5.n(-1, -2));
                org.telegram.ui.Cells.ea eaVar2 = new org.telegram.ui.Cells.ea(context);
                this.X = eaVar2;
                eaVar2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
                this.f33977c0.addView(this.X, w7.y5.n(-1, -2));
                this.X.setOnClickListener(new rl0(this, 8));
                org.telegram.ui.Cells.e9 e9Var3 = new org.telegram.ui.Cells.e9(context);
                this.f34001o0 = e9Var3;
                e9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider, i11));
                if (this.f33976c != 0) {
                    this.A1 = LocaleController.getString(R.string.PassportAddTranslationUploadInfo);
                } else {
                    TLRPC.SecureValueType secureValueType3 = this.F.type;
                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                        this.A1 = LocaleController.getString(R.string.PassportAddTranslationAgreementInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                        this.A1 = LocaleController.getString(R.string.PassportAddTranslationBillInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                        this.A1 = LocaleController.getString(R.string.PassportAddTranslationPassportRegistrationInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                        this.A1 = LocaleController.getString(R.string.PassportAddTranslationTemporaryRegistrationInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                        this.A1 = LocaleController.getString(R.string.PassportAddTranslationBankInfo);
                    } else {
                        this.A1 = "";
                    }
                }
                String str5 = this.A1;
                HashMap hashMap3 = this.f34024x1;
                String str6 = str5;
                if (hashMap3 != null) {
                    String str7 = (String) hashMap3.get("translation_all");
                    str6 = str5;
                    if (str7 != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str7);
                        spannableStringBuilder2.append((CharSequence) "\n\n");
                        spannableStringBuilder2.append((CharSequence) this.A1);
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19280p7, false)), 0, str7.length(), 33);
                        hashMap2.put("translation_all", "");
                        str6 = spannableStringBuilder2;
                    }
                }
                this.f34001o0.setText(str6);
                this.f33977c0.addView(this.f34001o0, w7.y5.n(-1, -2));
            }
        } else {
            j3 = 0;
            this.actionBar.setTitle(LocaleController.getString(R.string.PassportAddress));
        }
        org.telegram.ui.Cells.m4 m4Var4 = new org.telegram.ui.Cells.m4(context);
        this.f33992j0 = m4Var4;
        m4Var4.setText(LocaleController.getString(R.string.PassportAddressHeader));
        this.f33992j0.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d6, false));
        this.f33977c0.addView(this.f33992j0, w7.y5.n(-1, -2));
        this.Y = new EditTextBoldCursor[6];
        for (int i13 = 0; i13 < 6; i13++) {
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.Y[i13] = editTextBoldCursor;
            am0 am0Var = new am0(context, editTextBoldCursor, 0);
            am0Var.setWillNotDraw(false);
            this.f33977c0.addView(am0Var, w7.y5.n(-1, -2));
            int i14 = org.telegram.ui.ActionBar.h6.f19060d6;
            am0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
            int i15 = 5;
            if (i13 == 5) {
                View view = new View(context);
                this.S = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
                this.f33977c0.addView(this.S, w7.y5.n(-1, 6));
            }
            if (this.f34017v0 && this.F != null) {
                am0Var.setVisibility(8);
                View view2 = this.S;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            this.Y[i13].setTag(Integer.valueOf(i13));
            this.Y[i13].setSupportRtlHint(true);
            this.Y[i13].setTextSize(1, 16.0f);
            this.Y[i13].setHintColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.H6, false));
            this.Y[i13].setHeaderHintColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.L6, false));
            this.Y[i13].setTransformHintToHeader(true);
            EditTextBoldCursor editTextBoldCursor2 = this.Y[i13];
            int i16 = org.telegram.ui.ActionBar.h6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i16, false));
            this.Y[i13].setBackgroundDrawable(null);
            this.Y[i13].setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i16, false));
            this.Y[i13].setCursorSize(AndroidUtilities.dp(20.0f));
            this.Y[i13].setCursorWidth(1.5f);
            this.Y[i13].setLineColors(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19187k6, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19205l6, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19280p7, false));
            if (i13 == 5) {
                this.Y[i13].setOnTouchListener(new sl0(this, 2));
                this.Y[i13].setInputType(0);
                this.Y[i13].setFocusable(false);
            } else {
                this.Y[i13].setInputType(16385);
                this.Y[i13].setImeOptions(268435461);
            }
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 != 4) {
                                if (i13 == 5) {
                                    this.Y[i13].setHintText(LocaleController.getString(R.string.PassportCountry));
                                    str = "country_code";
                                }
                            } else {
                                this.Y[i13].setHintText(LocaleController.getString(R.string.PassportState));
                                str = "state";
                            }
                        } else {
                            this.Y[i13].setHintText(LocaleController.getString(R.string.PassportCity));
                            str = "city";
                        }
                    } else {
                        this.Y[i13].setHintText(LocaleController.getString(R.string.PassportPostcode));
                        str = "post_code";
                    }
                } else {
                    this.Y[i13].setHintText(LocaleController.getString(R.string.PassportStreet2));
                    str = "street_line2";
                }
            } else {
                this.Y[i13].setHintText(LocaleController.getString(R.string.PassportStreet1));
                str = "street_line1";
            }
            J1(this.f34012s1, this.Y[i13], str);
            if (i13 == 2) {
                this.Y[i13].addTextChangedListener(new bm0(this, editTextBoldCursor, str));
                this.Y[i13].setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            } else {
                this.Y[i13].addTextChangedListener(new cm0(this, editTextBoldCursor, str, 0));
            }
            EditTextBoldCursor editTextBoldCursor3 = this.Y[i13];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.Y[i13].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.Y[i13];
            if (!LocaleController.isRTL) {
                i15 = 3;
            }
            editTextBoldCursor4.setGravity(i15 | 16);
            am0Var.addView(this.Y[i13], w7.y5.d(-1, 64.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
            this.Y[i13].setOnEditorActionListener(new pl0(this, 4));
        }
        org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
        this.f33996l0 = b7Var;
        this.f33977c0.addView(b7Var, w7.y5.n(-1, -2));
        if (this.f34017v0 && this.F != null) {
            this.f33992j0.setVisibility(8);
            this.f33996l0.setVisibility(8);
        }
        long j10 = this.f33976c;
        TLRPC.TL_secureValue tL_secureValue = this.I;
        if (((j10 != j3 || this.F == null) && this.H != null && !this.f34017v0) || tL_secureValue != null) {
            if (tL_secureValue != null) {
                T0(tL_secureValue.files);
                V0(tL_secureValue.translation);
            }
            org.telegram.ui.Cells.b7 b7Var2 = this.f33996l0;
            int i17 = R.drawable.greydivider;
            int i18 = org.telegram.ui.ActionBar.h6.f19024b7;
            b7Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, i17, i18));
            org.telegram.ui.Cells.ea eaVar3 = new org.telegram.ui.Cells.ea(context);
            eaVar3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19280p7, false));
            eaVar3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
            if (this.F == null) {
                eaVar3.b(LocaleController.getString(R.string.PassportDeleteInfo), false);
            } else {
                eaVar3.b(LocaleController.getString(R.string.PassportDeleteDocument), false);
            }
            this.f33977c0.addView(eaVar3, w7.y5.n(-1, -2));
            eaVar3.setOnClickListener(new rl0(this, 9));
            org.telegram.ui.Cells.b7 b7Var3 = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
            this.f33996l0 = b7Var3;
            b7Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, i18));
            this.f33977c0.addView(this.f33996l0, w7.y5.n(-1, -2));
        } else {
            org.telegram.ui.Cells.b7 b7Var4 = this.f33996l0;
            int i19 = R.drawable.greydivider_bottom;
            int i20 = org.telegram.ui.ActionBar.h6.f19024b7;
            b7Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, i19, i20));
            if (this.f34017v0 && this.F != null) {
                this.f33999n0.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, i20));
            }
        }
        S1(0);
        S1(4);
    }

    public final void c1() {
        if (getParentActivity() != null && this.R0 == null) {
            org.telegram.ui.Components.wi wiVar = new org.telegram.ui.Components.wi(getParentActivity(), this, false, false);
            this.R0 = wiVar;
            wiVar.Z1 = new lm0(this);
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gn0.createView(android.content.Context):android.view.View");
    }

    public final void d1() {
        int dp;
        int dp2;
        boolean[] zArr = {true};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ow(22, this, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18662a;
        a2Var.R = string;
        boolean z10 = this.f34017v0;
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.E;
        if (z10 && this.F == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeAddress)) {
            a2Var.T = LocaleController.getString(R.string.PassportDeleteAddressAlert);
        } else if (z10 && this.F == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            a2Var.T = LocaleController.getString(R.string.PassportDeletePersonalAlert);
        } else {
            a2Var.T = LocaleController.getString(R.string.PassportDeleteDocumentAlert);
        }
        if (!this.f34017v0 && this.F != null) {
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(getParentActivity(), 1);
            a2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(false));
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                a2Var2.e(LocaleController.getString(R.string.PassportDeleteDocumentAddress), "", true, false, false);
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                a2Var2.e(LocaleController.getString(R.string.PassportDeleteDocumentPersonal), "", true, false, false);
            }
            if (LocaleController.isRTL) {
                dp = AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(8.0f);
            }
            if (LocaleController.isRTL) {
                dp2 = AndroidUtilities.dp(8.0f);
            } else {
                dp2 = AndroidUtilities.dp(16.0f);
            }
            a2Var2.setPadding(dp, 0, dp2, 0);
            frameLayout.addView(a2Var2, w7.y5.e(-1, 48, 51));
            a2Var2.setOnClickListener(new m8(4, zArr));
            alertDialog$Builder.n(frameLayout);
        }
        showDialog(a2Var);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        EditTextBoldCursor editTextBoldCursor;
        en0 en0Var;
        org.telegram.ui.ActionBar.u0 u0Var;
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            HashMap hashMap = this.f34002o1;
            SecureDocument secureDocument = (SecureDocument) hashMap.get(str);
            if (secureDocument != null) {
                secureDocument.inputFile = (TLRPC.TL_inputFile) objArr[1];
                hashMap.remove(str);
                if (hashMap.isEmpty() && (u0Var = this.L) != null) {
                    u0Var.setEnabled(true);
                    this.L.setAlpha(1.0f);
                }
                HashMap hashMap2 = this.f34000n1;
                if (hashMap2 != null && (en0Var = (en0) hashMap2.get(secureDocument)) != null) {
                    en0Var.a(true);
                }
                HashMap hashMap3 = this.f34027y1;
                if (hashMap3 != null && hashMap3.containsKey("error_document_all")) {
                    hashMap3.remove("error_document_all");
                    a1(false);
                }
                int i12 = secureDocument.type;
                if (i12 == 0) {
                    if (this.f33999n0 != null && !TextUtils.isEmpty(this.f34029z1)) {
                        this.f33999n0.setText(this.f34029z1);
                    }
                    hashMap3.remove("files_all");
                } else if (i12 == 4) {
                    if (this.f34001o0 != null && !TextUtils.isEmpty(this.A1)) {
                        this.f34001o0.setText(this.A1);
                    }
                    hashMap3.remove("translation_all");
                }
            }
        } else if (i10 != NotificationCenter.fileUploadFailed && i10 == NotificationCenter.twoStepPasswordChanged) {
            if (objArr != null && objArr.length > 0) {
                Object obj = objArr[7];
                if (obj != null && (editTextBoldCursor = this.Y[0]) != null) {
                    editTextBoldCursor.setText((String) obj);
                }
                if (objArr[6] == null) {
                    TL_account.TL_password tL_password = new TL_account.TL_password();
                    this.J = tL_password;
                    tL_password.current_algo = (TLRPC.PasswordKdfAlgo) objArr[1];
                    tL_password.new_secure_algo = (TLRPC.SecurePasswordKdfAlgo) objArr[2];
                    tL_password.secure_random = (byte[]) objArr[3];
                    tL_password.has_recovery = !TextUtils.isEmpty((String) objArr[4]);
                    TL_account.Password password = this.J;
                    password.hint = (String) objArr[5];
                    password.srp_id = -1L;
                    byte[] bArr = new byte[256];
                    password.srp_B = bArr;
                    Utilities.random.nextBytes(bArr);
                    EditTextBoldCursor editTextBoldCursor2 = this.Y[0];
                    if (editTextBoldCursor2 != null && editTextBoldCursor2.length() > 0) {
                        this.N0 = 2;
                    }
                }
            } else {
                this.J = null;
                w1();
            }
            R1();
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.wi wiVar = this.R0;
        if (wiVar != null && this.visibleDialog == wiVar) {
            wiVar.f30018j0.a0(false);
            this.R0.dismissInternal();
            this.R0.f30018j0.d0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.R0 && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    public final void e1(Context context) {
        long j3;
        int i10;
        String str;
        int i11;
        String str2;
        this.Y0 = new HashMap();
        ?? r42 = 1;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.Y0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
        this.f34003p0 = e9Var;
        int i12 = R.drawable.greydivider_top;
        int i13 = org.telegram.ui.ActionBar.h6.f19024b7;
        e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, i12, i13));
        boolean z10 = false;
        this.f34003p0.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        int i14 = -1;
        this.f33977c0.addView(this.f34003p0, w7.y5.n(-1, -2));
        a1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.E;
        if (tL_secureRequiredType != null) {
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
            this.f33992j0 = m4Var;
            if (this.f34017v0) {
                m4Var.setText(LocaleController.getString(R.string.PassportDocuments));
            } else {
                m4Var.setText(LocaleController.getString(R.string.PassportRequiredDocuments));
            }
            org.telegram.ui.Cells.m4 m4Var2 = this.f33992j0;
            int i15 = org.telegram.ui.ActionBar.h6.f19060d6;
            m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i15, false));
            this.f33977c0.addView(this.f33992j0, w7.y5.n(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.f33981e0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f33977c0.addView(this.f33981e0, w7.y5.n(-1, -2));
            org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context);
            this.U = d9Var;
            d9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
            this.f33977c0.addView(this.U, w7.y5.n(-1, -2));
            this.U.setOnClickListener(new rl0(this, 0));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.f33984f0 = linearLayout2;
            linearLayout2.setOrientation(1);
            this.f33977c0.addView(this.f33984f0, w7.y5.n(-1, -2));
            boolean z11 = this.F.selfie_required;
            org.telegram.ui.Cells.d9 d9Var2 = new org.telegram.ui.Cells.d9(context);
            this.V = d9Var2;
            d9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
            j3 = 0;
            this.V.a(LocaleController.getString(R.string.PassportReverseSide), LocaleController.getString(R.string.PassportReverseSideInfo), z11);
            this.f33977c0.addView(this.V, w7.y5.n(-1, -2));
            this.V.setOnClickListener(new rl0(this, 2));
            if (this.F.selfie_required) {
                LinearLayout linearLayout3 = new LinearLayout(context);
                this.f33986g0 = linearLayout3;
                linearLayout3.setOrientation(1);
                this.f33977c0.addView(this.f33986g0, w7.y5.n(-1, -2));
                org.telegram.ui.Cells.d9 d9Var3 = new org.telegram.ui.Cells.d9(context);
                this.W = d9Var3;
                d9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
                this.W.a(LocaleController.getString(R.string.PassportSelfie), LocaleController.getString(R.string.PassportSelfieInfo), tL_secureRequiredType2.translation_required);
                this.f33977c0.addView(this.W, w7.y5.n(-1, -2));
                this.W.setOnClickListener(new rl0(this, 3));
            }
            org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
            this.f33999n0 = e9Var2;
            e9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider, i13));
            this.f33999n0.setText(LocaleController.getString(R.string.PassportPersonalUploadInfo));
            this.f33977c0.addView(this.f33999n0, w7.y5.n(-1, -2));
            if (this.F.translation_required) {
                org.telegram.ui.Cells.m4 m4Var3 = new org.telegram.ui.Cells.m4(context);
                this.f33992j0 = m4Var3;
                m4Var3.setText(LocaleController.getString(R.string.PassportTranslation));
                this.f33992j0.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i15, false));
                this.f33977c0.addView(this.f33992j0, w7.y5.n(-1, -2));
                LinearLayout linearLayout4 = new LinearLayout(context);
                this.f33988h0 = linearLayout4;
                linearLayout4.setOrientation(1);
                this.f33977c0.addView(this.f33988h0, w7.y5.n(-1, -2));
                org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context);
                this.X = eaVar;
                eaVar.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
                this.f33977c0.addView(this.X, w7.y5.n(-1, -2));
                this.X.setOnClickListener(new rl0(this, 4));
                org.telegram.ui.Cells.e9 e9Var3 = new org.telegram.ui.Cells.e9(context);
                this.f34001o0 = e9Var3;
                e9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider, i13));
                if (this.f33976c != 0) {
                    this.A1 = LocaleController.getString(R.string.PassportAddTranslationUploadInfo);
                } else {
                    TLRPC.SecureValueType secureValueType = this.F.type;
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
                        this.A1 = LocaleController.getString(R.string.PassportAddPassportInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                        this.A1 = LocaleController.getString(R.string.PassportAddInternalPassportInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                        this.A1 = LocaleController.getString(R.string.PassportAddIdentityCardInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                        this.A1 = LocaleController.getString(R.string.PassportAddDriverLicenceInfo);
                    } else {
                        this.A1 = "";
                    }
                }
                String str3 = this.A1;
                HashMap hashMap = this.f34024x1;
                String str4 = str3;
                if (hashMap != null) {
                    String str5 = (String) hashMap.get("translation_all");
                    str4 = str3;
                    if (str5 != null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str5);
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) this.A1);
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19280p7, false)), 0, str5.length(), 33);
                        this.f34027y1.put("translation_all", "");
                        str4 = spannableStringBuilder;
                    }
                }
                this.f34001o0.setText(str4);
                this.f33977c0.addView(this.f34001o0, w7.y5.n(-1, -2));
            }
        } else {
            j3 = 0;
            org.telegram.ui.Cells.ea eaVar2 = new org.telegram.ui.Cells.ea(context);
            this.f34008r0 = eaVar2;
            eaVar2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
            this.f34008r0.b(LocaleController.getString(R.string.PassportScanPassport), false);
            this.f33977c0.addView(this.f34008r0, w7.y5.n(-1, -2));
            this.f34008r0.setOnClickListener(new rl0(this, 5));
            org.telegram.ui.Cells.e9 e9Var4 = new org.telegram.ui.Cells.e9(context);
            this.f33999n0 = e9Var4;
            e9Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider, i13));
            this.f33999n0.setText(LocaleController.getString(R.string.PassportScanPassportInfo));
            this.f33977c0.addView(this.f33999n0, w7.y5.n(-1, -2));
        }
        org.telegram.ui.Cells.m4 m4Var4 = new org.telegram.ui.Cells.m4(context);
        this.f33992j0 = m4Var4;
        if (this.f34017v0) {
            m4Var4.setText(LocaleController.getString(R.string.PassportDocument));
        } else {
            m4Var4.setText(LocaleController.getString(R.string.PassportPersonal));
        }
        this.f33992j0.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d6, false));
        this.f33977c0.addView(this.f33992j0, w7.y5.n(-1, -2));
        int i16 = 7;
        if (this.F != null) {
            i10 = 9;
        } else {
            i10 = 7;
        }
        this.Y = new EditTextBoldCursor[i10];
        int i17 = 0;
        while (true) {
            HashMap hashMap2 = this.f34012s1;
            if (i17 < i10) {
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.Y[i17] = editTextBoldCursor;
                am0 am0Var = new am0(context, editTextBoldCursor, 1);
                am0Var.setWillNotDraw(z10);
                this.f33977c0.addView(am0Var, w7.y5.n(i14, 64));
                int i18 = org.telegram.ui.ActionBar.h6.f19060d6;
                am0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i18, z10));
                if (i17 == i10 - 1) {
                    View view = new View(context);
                    this.S = view;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i18, z10));
                    this.f33977c0.addView(this.S, w7.y5.n(i14, 6));
                }
                if (this.f34017v0 && this.F != null && i17 < i16) {
                    am0Var.setVisibility(8);
                    View view2 = this.S;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                }
                this.Y[i17].setTag(Integer.valueOf(i17));
                this.Y[i17].setSupportRtlHint(r42);
                this.Y[i17].setTextSize(r42, 16.0f);
                this.Y[i17].setHintColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.H6, false));
                EditTextBoldCursor editTextBoldCursor2 = this.Y[i17];
                int i19 = org.telegram.ui.ActionBar.h6.G6;
                editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i19, false));
                this.Y[i17].setHeaderHintColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.L6, false));
                this.Y[i17].setTransformHintToHeader(r42);
                this.Y[i17].setBackgroundDrawable(null);
                this.Y[i17].setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i19, false));
                this.Y[i17].setCursorSize(AndroidUtilities.dp(20.0f));
                this.Y[i17].setCursorWidth(1.5f);
                this.Y[i17].setLineColors(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19187k6, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19205l6, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19280p7, false));
                int i20 = 5;
                if (i17 != 5 && i17 != 6) {
                    if (i17 != 3 && i17 != 8) {
                        if (i17 == 4) {
                            this.Y[i17].setOnTouchListener(new sl0(this, 1));
                            this.Y[i17].setInputType(0);
                            this.Y[i17].setFocusable(false);
                        } else {
                            this.Y[i17].setInputType(16385);
                            this.Y[i17].setImeOptions(268435461);
                        }
                    } else {
                        this.Y[i17].setOnTouchListener(new ci.q1(7, this, context));
                        this.Y[i17].setInputType(0);
                        this.Y[i17].setFocusable(false);
                    }
                } else {
                    this.Y[i17].setOnTouchListener(new sl0(this, 0));
                    this.Y[i17].setInputType(0);
                }
                HashMap hashMap3 = this.f34014t1;
                switch (i17) {
                    case 0:
                        if (tL_secureRequiredType2.native_names) {
                            this.Y[i17].setHintText(LocaleController.getString(R.string.PassportNameLatin));
                        } else {
                            this.Y[i17].setHintText(LocaleController.getString(R.string.PassportName));
                        }
                        str2 = "first_name";
                        break;
                    case 1:
                        if (tL_secureRequiredType2.native_names) {
                            this.Y[i17].setHintText(LocaleController.getString(R.string.PassportMidnameLatin));
                        } else {
                            this.Y[i17].setHintText(LocaleController.getString(R.string.PassportMidname));
                        }
                        str2 = "middle_name";
                        break;
                    case 2:
                        if (tL_secureRequiredType2.native_names) {
                            this.Y[i17].setHintText(LocaleController.getString(R.string.PassportSurnameLatin));
                        } else {
                            this.Y[i17].setHintText(LocaleController.getString(R.string.PassportSurname));
                        }
                        str2 = "last_name";
                        break;
                    case 3:
                        this.Y[i17].setHintText(LocaleController.getString(R.string.PassportBirthdate));
                        str2 = "birth_date";
                        break;
                    case 4:
                        this.Y[i17].setHintText(LocaleController.getString(R.string.PassportGender));
                        str2 = "gender";
                        break;
                    case 5:
                        this.Y[i17].setHintText(LocaleController.getString(R.string.PassportCitizenship));
                        str2 = "country_code";
                        break;
                    case 6:
                        this.Y[i17].setHintText(LocaleController.getString(R.string.PassportResidence));
                        str2 = "residence_country_code";
                        break;
                    case 7:
                        this.Y[i17].setHintText(LocaleController.getString(R.string.PassportDocumentNumber));
                        str2 = "document_no";
                        hashMap2 = hashMap3;
                        break;
                    case 8:
                        this.Y[i17].setHintText(LocaleController.getString(R.string.PassportExpired));
                        str2 = "expiry_date";
                        hashMap2 = hashMap3;
                        break;
                    default:
                        i17++;
                        r42 = 1;
                        i16 = 7;
                        z10 = false;
                        i14 = -1;
                }
                J1(hashMap2, this.Y[i17], str2);
                EditTextBoldCursor editTextBoldCursor3 = this.Y[i17];
                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                if (i17 != 0 && i17 != 2 && i17 != 1) {
                    this.Y[i17].addTextChangedListener(new org.telegram.ui.Components.tx0(this, editTextBoldCursor, str2, hashMap2));
                } else {
                    this.Y[i17].addTextChangedListener(new em0(this, editTextBoldCursor, str2));
                }
                this.Y[i17].setPadding(0, 0, 0, 0);
                EditTextBoldCursor editTextBoldCursor4 = this.Y[i17];
                if (!LocaleController.isRTL) {
                    i20 = 3;
                }
                editTextBoldCursor4.setGravity(i20 | 16);
                am0Var.addView(this.Y[i17], w7.y5.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                this.Y[i17].setOnEditorActionListener(new pl0(this, 1));
                i17++;
                r42 = 1;
                i16 = 7;
                z10 = false;
                i14 = -1;
            } else {
                org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                this.m0 = b7Var;
                this.f33977c0.addView(b7Var, w7.y5.n(-1, -2));
                org.telegram.ui.Cells.m4 m4Var5 = new org.telegram.ui.Cells.m4(context);
                this.f33992j0 = m4Var5;
                m4Var5.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d6, false));
                this.f33977c0.addView(this.f33992j0, w7.y5.n(-1, -2));
                this.f33971a0 = new EditTextBoldCursor[3];
                int i21 = 0;
                for (int i22 = 3; i21 < i22; i22 = 3) {
                    EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
                    this.f33971a0[i21] = editTextBoldCursor5;
                    am0 am0Var2 = new am0(context, editTextBoldCursor5, 2);
                    am0Var2.setWillNotDraw(false);
                    this.f33977c0.addView(am0Var2, w7.y5.n(-1, 64));
                    int i23 = org.telegram.ui.ActionBar.h6.f19060d6;
                    am0Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i23, false));
                    if (i21 == 2) {
                        View view3 = new View(context);
                        this.T = view3;
                        view3.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i23, false));
                        this.f33977c0.addView(this.T, w7.y5.n(-1, 6));
                    }
                    this.f33971a0[i21].setTag(Integer.valueOf(i21));
                    this.f33971a0[i21].setSupportRtlHint(true);
                    this.f33971a0[i21].setTextSize(1, 16.0f);
                    this.f33971a0[i21].setHintColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.H6, false));
                    EditTextBoldCursor editTextBoldCursor6 = this.f33971a0[i21];
                    int i24 = org.telegram.ui.ActionBar.h6.G6;
                    editTextBoldCursor6.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i24, false));
                    this.f33971a0[i21].setHeaderHintColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.L6, false));
                    this.f33971a0[i21].setTransformHintToHeader(true);
                    this.f33971a0[i21].setBackgroundDrawable(null);
                    this.f33971a0[i21].setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i24, false));
                    this.f33971a0[i21].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.f33971a0[i21].setCursorWidth(1.5f);
                    this.f33971a0[i21].setLineColors(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19187k6, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19205l6, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19280p7, false));
                    this.f33971a0[i21].setInputType(16385);
                    this.f33971a0[i21].setImeOptions(268435461);
                    if (i21 != 0) {
                        if (i21 != 1) {
                            if (i21 == 2) {
                                str = "last_name_native";
                            } else {
                                i21++;
                            }
                        } else {
                            str = "middle_name_native";
                        }
                    } else {
                        str = "first_name_native";
                    }
                    J1(hashMap2, this.f33971a0[i21], str);
                    EditTextBoldCursor editTextBoldCursor7 = this.f33971a0[i21];
                    editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
                    if (i21 == 0 || i21 == 2 || i21 == 1) {
                        this.f33971a0[i21].addTextChangedListener(new cm0(this, editTextBoldCursor5, str, 1));
                    }
                    this.f33971a0[i21].setPadding(0, 0, 0, 0);
                    EditTextBoldCursor editTextBoldCursor8 = this.f33971a0[i21];
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    editTextBoldCursor8.setGravity(i11 | 16);
                    am0Var2.addView(this.f33971a0[i21], w7.y5.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.f33971a0[i21].setOnEditorActionListener(new pl0(this, 2));
                    i21++;
                }
                org.telegram.ui.Cells.e9 e9Var5 = new org.telegram.ui.Cells.e9(context);
                this.f34005q0 = e9Var5;
                this.f33977c0.addView(e9Var5, w7.y5.n(-1, -2));
                long j10 = this.f33976c;
                TLRPC.TL_secureValue tL_secureValue = this.I;
                if (((j10 != j3 || this.F == null) && this.H != null && !this.f34017v0) || tL_secureValue != null) {
                    if (tL_secureValue != null) {
                        T0(tL_secureValue.files);
                        TLRPC.SecureFile secureFile = tL_secureValue.front_side;
                        if (secureFile instanceof TLRPC.TL_secureFile) {
                            S0((TLRPC.TL_secureFile) secureFile, 2);
                        }
                        TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                        if (secureFile2 instanceof TLRPC.TL_secureFile) {
                            S0((TLRPC.TL_secureFile) secureFile2, 3);
                        }
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            S0((TLRPC.TL_secureFile) secureFile3, 1);
                        }
                        V0(tL_secureValue.translation);
                    }
                    org.telegram.ui.Cells.ea eaVar3 = new org.telegram.ui.Cells.ea(context);
                    eaVar3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19280p7, false));
                    eaVar3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
                    if (this.F == null) {
                        eaVar3.b(LocaleController.getString(R.string.PassportDeleteInfo), false);
                    } else {
                        eaVar3.b(LocaleController.getString(R.string.PassportDeleteDocument), false);
                    }
                    this.f33977c0.addView(eaVar3, w7.y5.n(-1, -2));
                    eaVar3.setOnClickListener(new rl0(this, 1));
                    org.telegram.ui.Cells.e9 e9Var6 = this.f34005q0;
                    int i25 = R.drawable.greydivider;
                    int i26 = org.telegram.ui.ActionBar.h6.f19024b7;
                    e9Var6.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, i25, i26));
                    org.telegram.ui.Cells.b7 b7Var2 = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                    this.f33996l0 = b7Var2;
                    b7Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, i26));
                    this.f33977c0.addView(this.f33996l0, w7.y5.n(-1, -2));
                } else {
                    this.f34005q0.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f19024b7));
                }
                P1();
                Y0(false);
                return;
            }
        }
    }

    public final void f1(android.content.Context r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gn0.f1(android.content.Context):void");
    }

    public final void g1(Context context) {
        String str;
        ViewGroup frameLayout;
        this.actionBar.setTitle(LocaleController.getString(R.string.PassportPhone));
        this.Y0 = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.U0.add(0, split[2]);
                this.V0.put(split[2], split[0]);
                this.W0.put(split[0], split[2]);
                if (split.length > 3) {
                    this.X0.put(split[0], split[3]);
                }
                this.Y0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        Collections.sort(this.U0, new db1(7));
        String str2 = UserConfig.getInstance(this.currentAccount).getCurrentUser().phone;
        org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context);
        String str3 = null;
        eaVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q6, false));
        eaVar.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
        int i10 = R.string.PassportPhoneUseSame;
        gf.b c10 = gf.b.c();
        eaVar.b(LocaleController.formatString("PassportPhoneUseSame", i10, c10.b("+" + str2)), false);
        this.f33977c0.addView(eaVar, w7.y5.n(-1, -2));
        eaVar.setOnClickListener(new rl0(this, 16));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
        this.f33999n0 = e9Var;
        e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f19024b7));
        this.f33999n0.setText(LocaleController.getString(R.string.PassportPhoneUseSameInfo));
        this.f33977c0.addView(this.f33999n0, w7.y5.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        this.f33992j0 = m4Var;
        m4Var.setText(LocaleController.getString(R.string.PassportPhoneUseOther));
        this.f33992j0.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d6, false));
        this.f33977c0.addView(this.f33992j0, w7.y5.n(-1, -2));
        this.Y = new EditTextBoldCursor[3];
        for (int i11 = 0; i11 < 3; i11++) {
            if (i11 == 2) {
                this.Y[i11] = new org.telegram.ui.Components.g40(context);
            } else {
                this.Y[i11] = new EditTextBoldCursor(context);
            }
            if (i11 == 1) {
                frameLayout = org.telegram.messenger.ok.f(context, 0);
                this.f33977c0.addView(frameLayout, w7.y5.n(-1, 50));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d6, false));
            } else if (i11 == 2) {
                frameLayout = (ViewGroup) this.Y[1].getParent();
            } else {
                frameLayout = new FrameLayout(context);
                this.f33977c0.addView(frameLayout, w7.y5.n(-1, 50));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d6, false));
            }
            this.Y[i11].setTag(Integer.valueOf(i11));
            this.Y[i11].setTextSize(1, 16.0f);
            this.Y[i11].setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.Y[i11];
            int i12 = org.telegram.ui.ActionBar.h6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
            this.Y[i11].setBackgroundDrawable(null);
            this.Y[i11].setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
            this.Y[i11].setCursorSize(AndroidUtilities.dp(20.0f));
            this.Y[i11].setCursorWidth(1.5f);
            if (i11 == 0) {
                this.Y[i11].setOnTouchListener(new sl0(this, 3));
                this.Y[i11].setText(LocaleController.getString(R.string.ChooseCountry));
                this.Y[i11].setInputType(0);
                this.Y[i11].setFocusable(false);
            } else {
                this.Y[i11].setInputType(3);
                if (i11 == 2) {
                    this.Y[i11].setImeOptions(268435462);
                } else {
                    this.Y[i11].setImeOptions(268435461);
                }
            }
            EditTextBoldCursor editTextBoldCursor2 = this.Y[i11];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            int i13 = 5;
            if (i11 == 1) {
                TextView textView = new TextView(context);
                this.f34020w0 = textView;
                textView.setText("+");
                this.f34020w0.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
                this.f34020w0.setTextSize(1, 16.0f);
                frameLayout.addView(this.f34020w0, w7.y5.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                this.Y[i11].setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
                this.Y[i11].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                this.Y[i11].setGravity(19);
                frameLayout.addView(this.Y[i11], w7.y5.k(0.0f, 12.0f, 16.0f, 6.0f, 55, -2));
                this.Y[i11].addTextChangedListener(new tm0(this));
            } else if (i11 == 2) {
                this.Y[i11].setPadding(0, 0, 0, 0);
                this.Y[i11].setGravity(19);
                this.Y[i11].setHintText(null);
                this.Y[i11].setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                frameLayout.addView(this.Y[i11], w7.y5.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                this.Y[i11].addTextChangedListener(new xr(this, 3));
            } else {
                this.Y[i11].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                EditTextBoldCursor editTextBoldCursor3 = this.Y[i11];
                if (!LocaleController.isRTL) {
                    i13 = 3;
                }
                editTextBoldCursor3.setGravity(i13);
                frameLayout.addView(this.Y[i11], w7.y5.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            }
            this.Y[i11].setOnEditorActionListener(new pl0(this, 0));
            if (i11 == 2) {
                this.Y[i11].setOnKeyListener(new sg(this, 1));
            }
            if (i11 == 0) {
                View view = new View(context);
                this.f33994k0.add(view);
                view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19061d7, false));
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, 1, 83));
            }
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (telephonyManager != null) {
                str3 = telephonyManager.getSimCountryIso().toUpperCase();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (str3 != null && (str = (String) this.Y0.get(str3)) != null && this.U0.indexOf(str) != -1) {
            this.Y[1].setText((CharSequence) this.V0.get(str));
        }
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
        this.f33999n0 = e9Var2;
        e9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f19024b7));
        this.f33999n0.setText(LocaleController.getString(R.string.PassportPhoneUploadInfo));
        this.f33977c0.addView(this.f33999n0, w7.y5.n(-1, -2));
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19004a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f19338s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33974b0, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19393v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19357t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.h6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.D8));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33977c0, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f19181k0, null, null, org.telegram.ui.ActionBar.h6.f19061d7));
        View view = this.S;
        int i12 = org.telegram.ui.ActionBar.h6.f19060d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i12));
        View view2 = this.T;
        if (view2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(view2, 1, null, null, null, null, i12));
        }
        int i13 = 0;
        while (true) {
            ArrayList arrayList2 = this.f33994k0;
            if (i13 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.j6((View) arrayList2.get(i13), 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19061d7));
            i13++;
        }
        for (Map.Entry entry : this.f34000n1.entrySet()) {
            en0 en0Var = (en0) entry.getValue();
            arrayList.add(new org.telegram.ui.ActionBar.j6(en0Var, 268435456, new Class[]{en0.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19060d6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(en0Var, 0, new Class[]{en0.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(en0Var, 0, new Class[]{en0.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19462z6));
        }
        int i14 = org.telegram.ui.ActionBar.h6.f19060d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33977c0, 268435456, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33977c0, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.h6.f19462z6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33977c0, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"valueTextView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33977c0, 268435456, new Class[]{org.telegram.ui.Cells.ea.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33977c0, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33977c0, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        int i17 = org.telegram.ui.ActionBar.h6.f19024b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33977c0, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33977c0, 268435456, new Class[]{fn0.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33977c0, 4, new Class[]{fn0.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33977c0, 4, new Class[]{fn0.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19061d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33977c0, 4, new Class[]{fn0.class}, new String[]{"valueTextView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33977c0, 8, new Class[]{fn0.class}, new String[]{"checkImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33977c0, 16, new Class[]{org.telegram.ui.Cells.m4.class}, null, null, null, i14));
        int i18 = org.telegram.ui.ActionBar.h6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33977c0, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33977c0, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33977c0, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        if (this.Y != null) {
            int i19 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.Y;
                if (i19 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.j6((View) editTextBoldCursorArr[i19].getParent(), 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19060d6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y[i19], 16777220, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y[i19], 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y[i19], 8390656, null, null, null, null, org.telegram.ui.ActionBar.h6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y[i19], 32, null, null, null, null, org.telegram.ui.ActionBar.h6.f19187k6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y[i19], 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.f19205l6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y[i19], 2080, null, null, null, null, org.telegram.ui.ActionBar.h6.f19280p7));
                i19++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4, null, null, null, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.H6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 8390656, null, null, null, null, i18));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.f19187k6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.f19205l6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 2080, null, null, null, null, org.telegram.ui.ActionBar.h6.f19280p7));
        }
        if (this.f33971a0 != null) {
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.f33971a0;
                if (i11 >= editTextBoldCursorArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.j6((View) editTextBoldCursorArr2[i11].getParent(), 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19060d6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33971a0[i11], 16777220, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33971a0[i11], 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33971a0[i11], 8390656, null, null, null, null, org.telegram.ui.ActionBar.h6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33971a0[i11], 32, null, null, null, null, org.telegram.ui.ActionBar.h6.f19187k6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33971a0[i11], 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.f19205l6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33971a0[i11], 2080, null, null, null, null, org.telegram.ui.ActionBar.h6.f19280p7));
                i11++;
            }
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F0, 2048, null, null, null, null, org.telegram.ui.ActionBar.h6.f19131h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I0, 8, null, null, null, null, org.telegram.ui.ActionBar.h6.Xd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.J0, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.K0, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f19317r6));
        TextView textView = this.M0;
        int i20 = org.telegram.ui.ActionBar.h6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(textView, 4, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34020w0, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.O, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f19365th));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.f19328rh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.f19347sh));
        org.telegram.ui.Components.uq uqVar = this.N;
        int i21 = org.telegram.ui.ActionBar.h6.D7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(uqVar, 0, null, null, null, null, i21));
        org.telegram.ui.Components.uq uqVar2 = this.N;
        int i22 = org.telegram.ui.ActionBar.h6.E7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(uqVar2, 0, null, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.P, 0, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.P, 0, null, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.B0, 8, null, null, null, null, org.telegram.ui.ActionBar.h6.Ci));
        TextView textView2 = this.C0;
        int i23 = org.telegram.ui.ActionBar.h6.f19462z6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(textView2, 4, null, null, null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.D0, 4, null, null, null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E0, 4, null, null, null, null, i20));
        return arrayList;
    }

    public final byte[] i1(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32 || bArr2 == null || bArr2.length != 32) {
            return null;
        }
        byte[] bArr3 = new byte[32];
        System.arraycopy(this.f33982e1, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(this.f33982e1, 32, bArr4, 0, 16);
        byte[] bArr5 = new byte[32];
        System.arraycopy(this.f33978c1, 0, bArr5, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr5, bArr3, bArr4, 0, 32, 0, 0);
        if (!Z0(bArr5, null)) {
            return null;
        }
        byte[] computeSHA512 = Utilities.computeSHA512(bArr5, bArr2);
        byte[] bArr6 = new byte[32];
        System.arraycopy(computeSHA512, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(computeSHA512, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(bArr, 0, bArr8, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        return bArr8;
    }

    public final void j1(final TLRPC.TL_secureRequiredType tL_secureRequiredType, final TLRPC.TL_secureRequiredType tL_secureRequiredType2, final ArrayList arrayList, final boolean z10, final ql0 ql0Var, final tl0 tl0Var, final boolean z11) {
        if (tL_secureRequiredType == null) {
            return;
        }
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        if (z11 && tL_secureRequiredType2 != null) {
            deletesecurevalue.types.add(tL_secureRequiredType2.type);
        } else {
            if (z10) {
                deletesecurevalue.types.add(tL_secureRequiredType.type);
            }
            if (tL_secureRequiredType2 != null) {
                deletesecurevalue.types.add(tL_secureRequiredType2.type);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(deletesecurevalue, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                final gn0 gn0Var = gn0.this;
                final um0 um0Var = tl0Var;
                final boolean z12 = z11;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType3 = tL_secureRequiredType2;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                final boolean z13 = z10;
                final ArrayList arrayList2 = arrayList;
                final Runnable runnable = ql0Var;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        int i10;
                        TLRPC.TL_secureData tL_secureData;
                        String str2;
                        LinearLayout linearLayout;
                        gn0 gn0Var2 = gn0.this;
                        TLRPC.TL_error tL_error2 = tL_error;
                        String str3 = null;
                        if (tL_error2 != null) {
                            um0 um0Var2 = um0Var;
                            if (um0Var2 != null) {
                                um0Var2.c(tL_error2.text, null);
                            }
                            gn0Var2.M1(LocaleController.getString(R.string.AppName), tL_error2.text);
                            return;
                        }
                        boolean z14 = z12;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType3;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType4;
                        boolean z15 = z13;
                        if (z14) {
                            if (tL_secureRequiredType5 != null) {
                                gn0Var2.H1(tL_secureRequiredType5);
                            } else {
                                gn0Var2.H1(tL_secureRequiredType6);
                            }
                        } else {
                            if (z15) {
                                gn0Var2.H1(tL_secureRequiredType6);
                            }
                            gn0Var2.H1(tL_secureRequiredType5);
                        }
                        int i11 = 0;
                        if (gn0Var2.f33973b == 8) {
                            fn0 fn0Var = (fn0) gn0Var2.f34006q1.remove(tL_secureRequiredType6);
                            if (fn0Var != null) {
                                gn0Var2.f33977c0.removeView(fn0Var);
                                View childAt = gn0Var2.f33977c0.getChildAt(linearLayout.getChildCount() - 6);
                                if (childAt instanceof fn0) {
                                    ((fn0) childAt).setNeedDivider(false);
                                }
                            }
                            gn0Var2.Q1();
                        } else {
                            ArrayList arrayList3 = arrayList2;
                            if (tL_secureRequiredType5 != null && arrayList3 != null && arrayList3.size() > 1) {
                                int size = arrayList3.size();
                                int i12 = 0;
                                while (true) {
                                    if (i12 < size) {
                                        TLRPC.TL_secureRequiredType tL_secureRequiredType7 = (TLRPC.TL_secureRequiredType) arrayList3.get(i12);
                                        TLRPC.TL_secureValue r12 = gn0Var2.r1(tL_secureRequiredType7, false);
                                        if (r12 != null) {
                                            TLRPC.TL_secureData tL_secureData2 = r12.data;
                                            if (tL_secureData2 != null) {
                                                str2 = gn0.h1(tL_secureData2.data, gn0Var2.i1(tL_secureData2.secret, tL_secureData2.data_hash), r12.data.data_hash);
                                            } else {
                                                str2 = null;
                                            }
                                            str = str2;
                                            tL_secureRequiredType5 = tL_secureRequiredType7;
                                        } else {
                                            i12++;
                                        }
                                    } else {
                                        str = null;
                                        break;
                                    }
                                }
                                if (tL_secureRequiredType5 == null) {
                                    tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) arrayList3.get(0);
                                }
                            } else {
                                str = null;
                            }
                            if (z15) {
                                if (arrayList3 != null) {
                                    i11 = arrayList3.size();
                                }
                                gn0Var2.L1(tL_secureRequiredType6, null, null, tL_secureRequiredType5, str, z14, i11);
                            } else {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType8 = tL_secureRequiredType5;
                                String str4 = str;
                                TLRPC.TL_secureValue r13 = gn0Var2.r1(tL_secureRequiredType6, false);
                                if (r13 != null && (tL_secureData = r13.data) != null) {
                                    str3 = gn0.h1(tL_secureData.data, gn0Var2.i1(tL_secureData.secret, tL_secureData.data_hash), r13.data.data_hash);
                                }
                                if (arrayList3 != null) {
                                    i10 = arrayList3.size();
                                } else {
                                    i10 = 0;
                                }
                                gn0Var2.L1(tL_secureRequiredType6, null, str3, tL_secureRequiredType8, str4, z14, i10);
                            }
                        }
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                });
            }
        });
    }

    public final cf.c k1(byte[] bArr) {
        byte[] p12 = p1();
        int nextInt = Utilities.random.nextInt(208) + 32;
        while ((bArr.length + nextInt) % 16 != 0) {
            nextInt++;
        }
        byte[] bArr2 = new byte[nextInt];
        Utilities.random.nextBytes(bArr2);
        bArr2[0] = (byte) nextInt;
        int length = nextInt + bArr.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, nextInt);
        System.arraycopy(bArr, 0, bArr3, nextInt, bArr.length);
        byte[] computeSHA256 = Utilities.computeSHA256(bArr3);
        byte[] computeSHA512 = Utilities.computeSHA512(p12, computeSHA256);
        byte[] bArr4 = new byte[32];
        System.arraycopy(computeSHA512, 0, bArr4, 0, 32);
        byte[] bArr5 = new byte[16];
        System.arraycopy(computeSHA512, 32, bArr5, 0, 16);
        Utilities.aesCbcEncryptionByteArraySafe(bArr3, bArr4, bArr5, 0, length, 0, 1);
        byte[] bArr6 = new byte[32];
        System.arraycopy(this.f33982e1, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(this.f33982e1, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(this.f33978c1, 0, bArr8, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        byte[] computeSHA5122 = Utilities.computeSHA512(bArr8, computeSHA256);
        byte[] bArr9 = new byte[32];
        System.arraycopy(computeSHA5122, 0, bArr9, 0, 32);
        byte[] bArr10 = new byte[16];
        System.arraycopy(computeSHA5122, 32, bArr10, 0, 16);
        byte[] bArr11 = new byte[32];
        System.arraycopy(p12, 0, bArr11, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr11, bArr9, bArr10, 0, 32, 0, 1);
        ?? obj = new Object();
        obj.f4254c = bArr3;
        obj.f4252a = bArr11;
        obj.d = computeSHA256;
        obj.f4253b = p12;
        obj.e = new SecureDocumentKey(bArr4, bArr5);
        return obj;
    }

    public final void l1(Bundle bundle, TLRPC.TL_auth_sentCode tL_auth_sentCode, boolean z10) {
        bundle.putString("phoneHash", tL_auth_sentCode.phone_code_hash);
        TLRPC.auth_CodeType auth_codetype = tL_auth_sentCode.next_type;
        if (auth_codetype instanceof TLRPC.TL_auth_codeTypeCall) {
            bundle.putInt("nextType", 4);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeFlashCall) {
            bundle.putInt("nextType", 3);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeSms) {
            bundle.putInt("nextType", 2);
        }
        if (tL_auth_sentCode.timeout == 0) {
            tL_auth_sentCode.timeout = 60;
        }
        bundle.putInt("timeout", tL_auth_sentCode.timeout * 1000);
        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt("type", 4);
            bundle.putInt("length", tL_auth_sentCode.type.length);
            K1(bundle, 2, z10);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", tL_auth_sentCode.type.pattern);
            K1(bundle, 1, z10);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSms) {
            bundle.putInt("type", 2);
            bundle.putInt("length", tL_auth_sentCode.type.length);
            K1(bundle, 0, z10);
        }
    }

    public final String m1() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.Y;
            if (i10 >= editTextBoldCursorArr.length) {
                break;
            }
            sb2.append((CharSequence) editTextBoldCursorArr[i10].getText());
            sb2.append(",");
            i10++;
        }
        if (this.f33971a0 != null) {
            int i11 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.f33971a0;
                if (i11 >= editTextBoldCursorArr2.length) {
                    break;
                }
                sb2.append((CharSequence) editTextBoldCursorArr2[i11].getText());
                sb2.append(",");
                i11++;
            }
        }
        ArrayList arrayList = this.f33991i1;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            sb2.append(((SecureDocument) arrayList.get(i12)).secureFile.f18471id);
        }
        SecureDocument secureDocument = this.l1;
        if (secureDocument != null) {
            sb2.append(secureDocument.secureFile.f18471id);
        }
        SecureDocument secureDocument2 = this.f33997m1;
        if (secureDocument2 != null) {
            sb2.append(secureDocument2.secureFile.f18471id);
        }
        SecureDocument secureDocument3 = this.f33993j1;
        if (secureDocument3 != null) {
            sb2.append(secureDocument3.secureFile.f18471id);
        }
        ArrayList arrayList2 = this.f33995k1;
        int size2 = arrayList2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            sb2.append(((SecureDocument) arrayList2.get(i13)).secureFile.f18471id);
        }
        return sb2.toString();
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i11 == -1) {
            if (i10 != 0 && i10 != 2) {
                if (i10 == 1) {
                    if (intent != null && intent.getData() != null) {
                        ArrayList arrayList = new ArrayList();
                        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                        sendingMediaInfo.uri = intent.getData();
                        arrayList.add(sendingMediaInfo);
                        G1(arrayList);
                        return;
                    } else if (getParentActivity() != null) {
                        Toast.makeText(getParentActivity(), LocaleController.getString(R.string.UnsupportedAttachment), 0).show();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            c1();
            org.telegram.ui.Components.wi wiVar = this.R0;
            if (wiVar != null) {
                wiVar.f30018j0.g0(i10, intent, this.Q0);
            }
            this.Q0 = null;
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i10 = this.f33973b;
        if (i10 == 7) {
            if (z10) {
                int i11 = this.I1;
                org.telegram.ui.Components.fw0[] fw0VarArr = this.J1;
                fw0VarArr[i11].c(true);
                for (org.telegram.ui.Components.fw0 fw0Var : fw0VarArr) {
                    if (fw0Var != null) {
                        fw0Var.f();
                    }
                }
            }
        } else if (i10 != 0 && i10 != 5) {
            if (i10 == 1 || i10 == 2) {
                return !X0(z10);
            }
        } else if (z10) {
            W0(false);
        }
        return true;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        if (this.f33973b == 3 && Build.VERSION.SDK_INT >= 23 && dialog == this.L1) {
            ArrayList arrayList = this.M1;
            if (!arrayList.isEmpty()) {
                getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        int i10 = 0;
        W0(false);
        org.telegram.ui.Components.wi wiVar = this.R0;
        if (wiVar != null) {
            wiVar.dismissInternal();
            this.R0.v1();
        }
        if (this.f33973b == 7) {
            while (true) {
                org.telegram.ui.Components.fw0[] fw0VarArr = this.J1;
                if (i10 >= fw0VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.fw0 fw0Var = fw0VarArr[i10];
                if (fw0Var != null) {
                    fw0Var.f();
                }
                i10++;
            }
            org.telegram.ui.ActionBar.a2 a2Var = this.K1;
            if (a2Var != null) {
                try {
                    a2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.K1 = null;
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.wi wiVar = this.R0;
        if (wiVar != null) {
            wiVar.x1();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.wi wiVar;
        org.telegram.ui.Cells.ea eaVar;
        int i11 = this.f33973b;
        if ((i11 == 1 || i11 == 2) && (wiVar = this.R0) != null) {
            if (i10 == 17) {
                wiVar.f30018j0.U(false);
            } else if (i10 == 21) {
                if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.f18662a.T = LocaleController.getString(R.string.PermissionNoAudioVideoWithHint);
                    alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new tl0(this, 0));
                    org.telegram.messenger.f0.o(R.string.OK, alertDialog$Builder, null);
                }
            } else if (i10 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                F1(0);
            } else if (i10 == 22 && iArr != null && iArr.length > 0 && iArr[0] == 0 && (eaVar = this.f34008r0) != null) {
                eaVar.callOnClick();
            }
        } else if (i11 == 3 && i10 == 6) {
            O1(false, this.E1, this.F1, this.G1, this.H1);
        }
    }

    @Override
    public final void onResume() {
        ViewGroup[] viewGroupArr;
        ViewGroup viewGroup;
        super.onResume();
        org.telegram.ui.Components.wi wiVar = this.R0;
        if (wiVar != null) {
            wiVar.y1();
        }
        if (this.f33973b == 5 && (viewGroupArr = this.Z) != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
            this.Y[0].requestFocus();
            AndroidUtilities.showKeyboard(this.Y[0]);
            AndroidUtilities.runOnUIThread(new ql0(this, 0), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (this.f33989h1 != null) {
            AndroidUtilities.runOnUIThread(new ql0(this, 1));
        }
        int i10 = this.f33973b;
        if (i10 == 5) {
            if (z10) {
                if (this.Z[0].getVisibility() == 0) {
                    this.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(this.Y[0]);
                }
                if (this.N0 == 2) {
                    B1(false);
                }
            }
        } else if (i10 == 7) {
            if (z10) {
                this.J1[this.I1].j();
            }
        } else if (i10 == 4) {
            if (z10) {
                this.Y[0].requestFocus();
                AndroidUtilities.showKeyboard(this.Y[0]);
            }
        } else if (i10 == 6) {
            if (z10) {
                this.Y[0].requestFocus();
                AndroidUtilities.showKeyboard(this.Y[0]);
            }
        } else if (i10 != 2 && i10 != 1) {
        } else {
            c1();
        }
    }

    public final TLRPC.TL_secureValue r1(TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z10) {
        String[] strArr;
        if (tL_secureRequiredType != null) {
            int size = this.f34025y.values.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.TL_secureValue tL_secureValue = this.f34025y.values.get(i10);
                if (tL_secureRequiredType.type.getClass() == tL_secureValue.type.getClass()) {
                    if (z10) {
                        if (!tL_secureRequiredType.selfie_required || (tL_secureValue.selfie instanceof TLRPC.TL_secureFile)) {
                            if (!tL_secureRequiredType.translation_required || !tL_secureValue.translation.isEmpty()) {
                                if (!t1(tL_secureRequiredType.type) || !tL_secureValue.files.isEmpty()) {
                                    if (!v1(tL_secureRequiredType.type) || (tL_secureValue.front_side instanceof TLRPC.TL_secureFile)) {
                                        TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
                                        if ((!(secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) && !(secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard)) || (tL_secureValue.reverse_side instanceof TLRPC.TL_secureFile)) {
                                            boolean z11 = secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails;
                                            if (z11 || (secureValueType instanceof TLRPC.TL_secureValueTypeAddress)) {
                                                if (z11) {
                                                    strArr = tL_secureRequiredType.native_names ? new String[]{"first_name_native", "last_name_native", "birth_date", "gender", "country_code", "residence_country_code"} : new String[]{"first_name", "last_name", "birth_date", "gender", "country_code", "residence_country_code"};
                                                } else {
                                                    strArr = new String[]{"street_line1", "street_line2", "post_code", "city", "state", "country_code"};
                                                }
                                                try {
                                                    TLRPC.TL_secureData tL_secureData = tL_secureValue.data;
                                                    JSONObject jSONObject = new JSONObject(h1(tL_secureData.data, i1(tL_secureData.secret, tL_secureData.data_hash), tL_secureValue.data.data_hash));
                                                    for (int i11 = 0; i11 < strArr.length; i11++) {
                                                        if (!jSONObject.has(strArr[i11]) || TextUtils.isEmpty(jSONObject.getString(strArr[i11]))) {
                                                            return null;
                                                        }
                                                    }
                                                } catch (Throwable unused) {
                                                    return null;
                                                }
                                            }
                                        } else {
                                            return null;
                                        }
                                    } else {
                                        return null;
                                    }
                                } else {
                                    return null;
                                }
                            } else {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    return tL_secureValue;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.Q0 = bundle.getString("path");
    }

    public final boolean s1(Class cls) {
        int size = this.f34025y.values.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f34025y.values.get(i10).type.getClass() == cls) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.Q0;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final boolean u1() {
        String str = this.f33970a;
        if (str != null && !str.equals(m1())) {
            return false;
        }
        return true;
    }

    public final void w1() {
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ul0(this, 3)), this.classGuid);
    }

    public final void x1() {
        org.telegram.ui.ActionBar.a2 a2Var = this.K1;
        if (a2Var == null) {
            return;
        }
        try {
            a2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.K1 = null;
    }

    public final void y1() {
        if (getParentActivity() != null && !getParentActivity().isFinishing() && this.K1 == null) {
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(getParentActivity(), 3, null);
            this.K1 = a2Var;
            a2Var.f18683g0 = false;
            a2Var.show();
        }
    }

    public final void z1(View view) {
        if (view == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        AndroidUtilities.shakeView(view);
        I1(view);
    }

    public gn0(int i10, long j3, String str, String str2, String str3, String str4, String str5, TL_account.authorizationForm authorizationform, TL_account.Password password) {
        this(i10, authorizationform, password, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (HashMap) null, (HashMap) null);
        int i11;
        String o12;
        String str6;
        String str7;
        String str8;
        String str9;
        this.f33976c = j3;
        this.d = str3;
        this.e = str4;
        this.h = str;
        this.f34007r = str2;
        this.f33998n = str5;
        if (i10 != 0 || authorizationform.errors.isEmpty()) {
            return;
        }
        try {
            Collections.sort(authorizationform.errors, new mm0(this));
            int size = authorizationform.errors.size();
            int i12 = 0;
            while (i12 < size) {
                TLRPC.SecureValueError secureValueError = authorizationform.errors.get(i12);
                byte[] bArr = null;
                if (secureValueError instanceof TLRPC.TL_secureValueErrorFrontSide) {
                    TLRPC.TL_secureValueErrorFrontSide tL_secureValueErrorFrontSide = (TLRPC.TL_secureValueErrorFrontSide) secureValueError;
                    o12 = o1(tL_secureValueErrorFrontSide.type);
                    str6 = tL_secureValueErrorFrontSide.text;
                    bArr = tL_secureValueErrorFrontSide.file_hash;
                    str7 = null;
                    str8 = "front";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorReverseSide) {
                    TLRPC.TL_secureValueErrorReverseSide tL_secureValueErrorReverseSide = (TLRPC.TL_secureValueErrorReverseSide) secureValueError;
                    o12 = o1(tL_secureValueErrorReverseSide.type);
                    str6 = tL_secureValueErrorReverseSide.text;
                    bArr = tL_secureValueErrorReverseSide.file_hash;
                    str7 = null;
                    str8 = "reverse";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorSelfie) {
                    TLRPC.TL_secureValueErrorSelfie tL_secureValueErrorSelfie = (TLRPC.TL_secureValueErrorSelfie) secureValueError;
                    o12 = o1(tL_secureValueErrorSelfie.type);
                    str6 = tL_secureValueErrorSelfie.text;
                    bArr = tL_secureValueErrorSelfie.file_hash;
                    str7 = null;
                    str8 = "selfie";
                } else {
                    if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFile) {
                        TLRPC.TL_secureValueErrorTranslationFile tL_secureValueErrorTranslationFile = (TLRPC.TL_secureValueErrorTranslationFile) secureValueError;
                        o12 = o1(tL_secureValueErrorTranslationFile.type);
                        str6 = tL_secureValueErrorTranslationFile.text;
                        bArr = tL_secureValueErrorTranslationFile.file_hash;
                        str7 = null;
                    } else if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFiles) {
                        TLRPC.TL_secureValueErrorTranslationFiles tL_secureValueErrorTranslationFiles = (TLRPC.TL_secureValueErrorTranslationFiles) secureValueError;
                        o12 = o1(tL_secureValueErrorTranslationFiles.type);
                        str6 = tL_secureValueErrorTranslationFiles.text;
                        str7 = null;
                    } else {
                        if (secureValueError instanceof TLRPC.TL_secureValueErrorFile) {
                            TLRPC.TL_secureValueErrorFile tL_secureValueErrorFile = (TLRPC.TL_secureValueErrorFile) secureValueError;
                            o12 = o1(tL_secureValueErrorFile.type);
                            str6 = tL_secureValueErrorFile.text;
                            bArr = tL_secureValueErrorFile.file_hash;
                            str7 = null;
                        } else if (secureValueError instanceof TLRPC.TL_secureValueErrorFiles) {
                            TLRPC.TL_secureValueErrorFiles tL_secureValueErrorFiles = (TLRPC.TL_secureValueErrorFiles) secureValueError;
                            o12 = o1(tL_secureValueErrorFiles.type);
                            str6 = tL_secureValueErrorFiles.text;
                            str7 = null;
                        } else if (secureValueError instanceof TLRPC.TL_secureValueError) {
                            TLRPC.TL_secureValueError tL_secureValueError = (TLRPC.TL_secureValueError) secureValueError;
                            o12 = o1(tL_secureValueError.type);
                            str6 = tL_secureValueError.text;
                            bArr = tL_secureValueError.hash;
                            str7 = null;
                            str8 = "error_all";
                        } else {
                            if (secureValueError instanceof TLRPC.TL_secureValueErrorData) {
                                TLRPC.TL_secureValueErrorData tL_secureValueErrorData = (TLRPC.TL_secureValueErrorData) secureValueError;
                                int i13 = 0;
                                while (i13 < authorizationform.values.size()) {
                                    TLRPC.TL_secureData tL_secureData = authorizationform.values.get(i13).data;
                                    if (tL_secureData == null || !Arrays.equals(tL_secureData.data_hash, tL_secureValueErrorData.data_hash)) {
                                        i13++;
                                        size = size;
                                    } else {
                                        o12 = o1(tL_secureValueErrorData.type);
                                        str6 = tL_secureValueErrorData.text;
                                        String str10 = tL_secureValueErrorData.field;
                                        bArr = tL_secureValueErrorData.data_hash;
                                        str7 = str10;
                                        str8 = "data";
                                    }
                                }
                            }
                            i11 = size;
                            i12++;
                            size = i11;
                        }
                        str8 = "files";
                    }
                    str8 = "translation";
                }
                HashMap hashMap = (HashMap) this.f34016u1.get(o12);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    i11 = size;
                    this.f34016u1.put(o12, hashMap);
                    this.f34018v1.put(o12, str6);
                } else {
                    i11 = size;
                }
                if (bArr != null) {
                    str9 = Base64.encodeToString(bArr, 2);
                } else {
                    str9 = "";
                }
                switch (str8.hashCode()) {
                    case -1840647503:
                        if (!str8.equals("translation")) {
                            continue;
                        } else if (bArr != null) {
                            hashMap.put("translation" + str9, str6);
                            break;
                        } else {
                            hashMap.put("translation_all", str6);
                            break;
                        }
                    case -906020504:
                        if (str8.equals("selfie")) {
                            hashMap.put("selfie" + str9, str6);
                            break;
                        } else {
                            continue;
                        }
                    case 3076010:
                        if (!str8.equals("data")) {
                            continue;
                        } else if (str7 == null) {
                            break;
                        } else {
                            hashMap.put(str7, str6);
                            break;
                        }
                    case 97434231:
                        if (!str8.equals("files")) {
                            continue;
                        } else if (bArr != null) {
                            hashMap.put("files" + str9, str6);
                            break;
                        } else {
                            hashMap.put("files_all", str6);
                            break;
                        }
                    case 97705513:
                        if (str8.equals("front")) {
                            hashMap.put("front" + str9, str6);
                            break;
                        } else {
                            continue;
                        }
                    case 329856746:
                        if (str8.equals("error_all")) {
                            hashMap.put("error_all", str6);
                            break;
                        } else {
                            continue;
                        }
                    case 1099846370:
                        if (str8.equals("reverse")) {
                            hashMap.put("reverse" + str9, str6);
                            break;
                        } else {
                            continue;
                        }
                    default:
                        continue;
                }
                i12++;
                size = i11;
            }
        } catch (Exception unused) {
        }
    }
}
