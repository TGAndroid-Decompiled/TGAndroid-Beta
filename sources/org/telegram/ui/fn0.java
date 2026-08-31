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
public final class fn0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public TextView A0;
    public final em0 A1;
    public final TLRPC.TL_secureRequiredType B;
    public TextView B0;
    public String B1;
    public TLRPC.TL_secureRequiredType C;
    public org.telegram.ui.Components.oz C0;
    public Runnable C1;
    public ArrayList D;
    public org.telegram.ui.Cells.a9 D0;
    public tm0 D1;
    public final TLRPC.TL_secureValue E;
    public org.telegram.ui.Cells.a9 E0;
    public vm0 E1;
    public final TLRPC.TL_secureValue F;
    public ImageView F0;
    public int F1;
    public TL_account.Password G;
    public TextView G0;
    public final org.telegram.ui.Components.wv0[] G1;
    public TLRPC.TL_auth_sentCode H;
    public TextView H0;
    public org.telegram.ui.ActionBar.d2 H1;
    public org.telegram.ui.ActionBar.w0 I;
    public FrameLayout I0;
    public Dialog I1;
    public AnimatorSet J;
    public TextView J0;
    public final ArrayList J1;
    public org.telegram.ui.Components.tq K;
    public int K0;
    public TextView L;
    public final byte[] L0;
    public org.telegram.ui.Components.tq M;
    public final byte[] M0;
    public FrameLayout N;
    public String N0;
    public org.telegram.ui.Cells.aa O;
    public org.telegram.ui.Components.mi O0;
    public View P;
    public int P0;
    public View Q;
    public int Q0;
    public org.telegram.ui.Cells.z8 R;
    public final ArrayList R0;
    public org.telegram.ui.Cells.z8 S;
    public final HashMap S0;
    public org.telegram.ui.Cells.z8 T;
    public final HashMap T0;
    public org.telegram.ui.Cells.aa U;
    public final HashMap U0;
    public EditTextBoldCursor[] V;
    public HashMap V0;
    public ViewGroup[] W;
    public boolean W0;
    public EditTextBoldCursor[] X;
    public boolean X0;
    public ScrollView Y;
    public long Y0;
    public LinearLayout Z;
    public byte[] Z0;
    public String f36917a;
    public LinearLayout f36918a0;
    public String f36919a1;
    public final int f36920b;
    public LinearLayout f36921b0;
    public byte[] f36922b1;
    public long f36923c;
    public LinearLayout f36924c0;
    public boolean f36925c1;
    public final String d;
    public LinearLayout f36926d0;
    public boolean f36927d1;
    public final String f36928e;
    public LinearLayout f36929e0;
    public fn0 f36930e1;
    public boolean f36931f;
    public LinearLayout f36932f0;
    public final ArrayList f36933f1;
    public org.telegram.ui.Cells.m4 f36934g0;
    public SecureDocument f36935g1;
    public final String h;
    public final ArrayList f36936h0;
    public final ArrayList f36937h1;
    public org.telegram.ui.Cells.z6 f36938i0;
    public SecureDocument f36939i1;
    public org.telegram.ui.Cells.z6 f36940j0;
    public SecureDocument f36941j1;
    public org.telegram.ui.Cells.a9 f36942k0;
    public final HashMap f36943k1;
    public org.telegram.ui.Cells.a9 f36944l0;
    public final HashMap l1;
    public org.telegram.ui.Cells.a9 m0;
    public final HashMap f36945m1;
    public final String f36946n;
    public org.telegram.ui.Cells.a9 f36947n0;
    public final HashMap f36948n1;
    public org.telegram.ui.Cells.aa f36949o0;
    public final HashMap f36950o1;
    public int f36951p0;
    public final HashMap f36952p1;
    public final boolean[] f36953q0;
    public final HashMap f36954q1;
    public final String f36955r;
    public boolean f36956r0;
    public final HashMap f36957r1;
    public String f36958s;
    public boolean f36959s0;
    public final HashMap f36960s1;
    public TextView f36961t0;
    public HashMap f36962t1;
    public org.telegram.ui.Cells.aa f36963u0;
    public HashMap f36964u1;
    public String v;
    public org.telegram.ui.Cells.aa f36965v0;
    public final HashMap f36966v1;
    public String f36967w;
    public org.telegram.ui.Cells.z6 f36968w0;
    public String f36969w1;
    public final int[] f36970x;
    public LinearLayout f36971x0;
    public String f36972x1;
    public TL_account.authorizationForm f36973y;
    public ImageView f36974y0;
    public vm0 f36975y1;
    public TextView f36976z0;
    public boolean f36977z1;

    public fn0(int i10, TL_account.authorizationForm authorizationform, TL_account.Password password, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureValue tL_secureValue, TLRPC.TL_secureRequiredType tL_secureRequiredType2, TLRPC.TL_secureValue tL_secureValue2, HashMap hashMap, HashMap hashMap2) {
        super(null);
        this.f36958s = "";
        this.v = "";
        this.f36970x = new int[3];
        this.f36936h0 = new ArrayList();
        this.f36953q0 = new boolean[3];
        this.f36956r0 = true;
        this.R0 = new ArrayList();
        this.S0 = new HashMap();
        this.T0 = new HashMap();
        this.U0 = new HashMap();
        this.f36933f1 = new ArrayList();
        this.f36937h1 = new ArrayList();
        this.f36943k1 = new HashMap();
        this.l1 = new HashMap();
        this.f36945m1 = new HashMap();
        this.f36948n1 = new HashMap();
        this.f36950o1 = new HashMap();
        this.f36957r1 = new HashMap();
        this.f36960s1 = new HashMap();
        this.f36966v1 = new HashMap();
        this.A1 = new em0(this);
        this.f36920b = i10;
        this.f36973y = authorizationform;
        this.B = tL_secureRequiredType;
        if (tL_secureRequiredType != null) {
            this.f36956r0 = tL_secureRequiredType.native_names;
        }
        this.E = tL_secureValue;
        this.C = tL_secureRequiredType2;
        this.F = tL_secureValue2;
        this.G = password;
        this.f36952p1 = hashMap;
        this.f36954q1 = hashMap2;
        if (i10 == 3) {
            this.J1 = new ArrayList();
        } else if (i10 == 7) {
            this.G1 = new org.telegram.ui.Components.wv0[3];
        }
        if (hashMap == null) {
            this.f36952p1 = new HashMap();
        }
        if (hashMap2 == null) {
            this.f36954q1 = new HashMap();
        }
        if (i10 == 5) {
            if (UserConfig.getInstance(this.currentAccount).savedPasswordHash != null && UserConfig.getInstance(this.currentAccount).savedSaltedPassword != null) {
                this.K0 = 1;
                this.L0 = UserConfig.getInstance(this.currentAccount).savedPasswordHash;
                this.M0 = UserConfig.getInstance(this.currentAccount).savedSaltedPassword;
            }
            TL_account.Password password2 = this.G;
            if (password2 == null) {
                w1();
            } else {
                TwoStepVerificationActivity.m0(password2);
                if (this.K0 == 1) {
                    B1(true);
                }
            }
            if (SharedConfig.isPassportConfigLoaded()) {
                return;
            }
            TLRPC.TL_help_getPassportConfig tL_help_getPassportConfig = new TLRPC.TL_help_getPassportConfig();
            tL_help_getPassportConfig.hash = SharedConfig.passportConfigHash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_help_getPassportConfig, new oh.p5(14));
        }
    }

    public static int C0(fn0 fn0Var, String str) {
        fn0Var.getClass();
        str.getClass();
        char c3 = 65535;
        switch (str.hashCode()) {
            case -2006252145:
                if (str.equals("residence_country_code")) {
                    c3 = 0;
                    break;
                }
                break;
            case -1537298398:
                if (str.equals("last_name_native")) {
                    c3 = 1;
                    break;
                }
                break;
            case -1249512767:
                if (str.equals("gender")) {
                    c3 = 2;
                    break;
                }
                break;
            case -796150911:
                if (str.equals("street_line1")) {
                    c3 = 3;
                    break;
                }
                break;
            case -796150910:
                if (str.equals("street_line2")) {
                    c3 = 4;
                    break;
                }
                break;
            case -160985414:
                if (str.equals("first_name")) {
                    c3 = 5;
                    break;
                }
                break;
            case 3053931:
                if (str.equals("city")) {
                    c3 = 6;
                    break;
                }
                break;
            case 109757585:
                if (str.equals("state")) {
                    c3 = 7;
                    break;
                }
                break;
            case 421072629:
                if (str.equals("middle_name")) {
                    c3 = '\b';
                    break;
                }
                break;
            case 451516732:
                if (str.equals("first_name_native")) {
                    c3 = '\t';
                    break;
                }
                break;
            case 475919162:
                if (str.equals("expiry_date")) {
                    c3 = '\n';
                    break;
                }
                break;
            case 506677093:
                if (str.equals("document_no")) {
                    c3 = 11;
                    break;
                }
                break;
            case 1168724782:
                if (str.equals("birth_date")) {
                    c3 = '\f';
                    break;
                }
                break;
            case 1181577377:
                if (str.equals("middle_name_native")) {
                    c3 = '\r';
                    break;
                }
                break;
            case 1481071862:
                if (str.equals("country_code")) {
                    c3 = 14;
                    break;
                }
                break;
            case 2002465324:
                if (str.equals("post_code")) {
                    c3 = 15;
                    break;
                }
                break;
            case 2013122196:
                if (str.equals("last_name")) {
                    c3 = 16;
                    break;
                }
                break;
        }
        switch (c3) {
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

    public static boolean D0(org.telegram.ui.fn0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fn0.D0(org.telegram.ui.fn0):boolean");
    }

    public static void J0(fn0 fn0Var, EditTextBoldCursor editTextBoldCursor, String str, Editable editable, boolean z4) {
        String str2;
        String str3;
        String str4;
        String str5;
        HashMap hashMap = fn0Var.f36966v1;
        if (hashMap != null && (str3 = (String) hashMap.get(str)) != null) {
            if (TextUtils.equals(str3, editable)) {
                HashMap hashMap2 = fn0Var.f36962t1;
                if (hashMap2 != null && (str5 = (String) hashMap2.get(str)) != null) {
                    editTextBoldCursor.setErrorText(str5);
                } else {
                    HashMap hashMap3 = fn0Var.f36964u1;
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
        if (z4) {
            str2 = "error_document_all";
        } else {
            str2 = "error_all";
        }
        if (hashMap != null && hashMap.containsKey(str2)) {
            hashMap.remove(str2);
            fn0Var.a1(false);
        }
    }

    public static void U(fn0 fn0Var, TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery) {
        TL_account.Password password = fn0Var.G;
        password.email_unconfirmed_pattern = tL_auth_passwordRecovery.email_pattern;
        fn0Var.presentFragment(new qg1(fn0Var.currentAccount, 4, password));
    }

    public static void V(fn0 fn0Var) {
        ArrayList arrayList;
        int i10;
        int i11;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        HashMap hashMap = fn0Var.f36950o1;
        HashMap hashMap2 = fn0Var.f36948n1;
        String str = fn0Var.f36955r;
        ArrayList arrayList2 = new ArrayList();
        int size = fn0Var.f36973y.required_types.size();
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.SecureRequiredType secureRequiredType = fn0Var.f36973y.required_types.get(i12);
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
                                        if (fn0Var.r1(tL_secureRequiredType5, true) != null) {
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
            TLRPC.TL_secureValue r12 = fn0Var.r1(tL_secureRequiredType, true);
            if (r12 == null) {
                Vibrator vibrator = (Vibrator) fn0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                en0 en0Var = (en0) hashMap2.get(tL_secureRequiredType);
                if (en0Var == null && (tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    en0Var = (en0) hashMap2.get(tL_secureRequiredType2);
                }
                AndroidUtilities.shakeView(en0Var);
                return;
            }
            HashMap hashMap3 = (HashMap) fn0Var.f36957r1.get(o1(tL_secureRequiredType.type));
            if (hashMap3 != null && !hashMap3.isEmpty()) {
                Vibrator vibrator2 = (Vibrator) fn0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                en0 en0Var2 = (en0) hashMap2.get(tL_secureRequiredType);
                if (en0Var2 == null && (tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    en0Var2 = (en0) hashMap2.get(tL_secureRequiredType3);
                }
                AndroidUtilities.shakeView(en0Var2);
                return;
            }
            boolean z4 = tL_secureRequiredType.selfie_required;
            boolean z10 = tL_secureRequiredType.translation_required;
            ?? obj = new Object();
            obj.f36913a = r12;
            obj.f36914b = z4;
            obj.f36915c = z10;
            arrayList2.add(obj);
        }
        fn0Var.N1(false, true);
        TL_account.acceptAuthorization acceptauthorization = new TL_account.acceptAuthorization();
        acceptauthorization.bot_id = fn0Var.f36923c;
        acceptauthorization.scope = fn0Var.h;
        acceptauthorization.public_key = str;
        JSONObject jSONObject = new JSONObject();
        int size3 = arrayList2.size();
        int i14 = 0;
        while (i14 < size3) {
            fm0 fm0Var = (fm0) arrayList2.get(i14);
            TLRPC.TL_secureValue tL_secureValue = fm0Var.f36913a;
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
                        byte[] i15 = fn0Var.i1(tL_secureData.secret, tL_secureData.data_hash);
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
                                    byte[] i17 = fn0Var.i1(tL_secureFile.secret, tL_secureFile.file_hash);
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
                        byte[] i18 = fn0Var.i1(tL_secureFile2.secret, tL_secureFile2.file_hash);
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("file_hash", Base64.encodeToString(tL_secureFile2.file_hash, 2));
                        jSONObject5.put("secret", Base64.encodeToString(i18, 2));
                        jSONObject3.put("front_side", jSONObject5);
                    }
                    TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile2;
                        byte[] i19 = fn0Var.i1(tL_secureFile3.secret, tL_secureFile3.file_hash);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("file_hash", Base64.encodeToString(tL_secureFile3.file_hash, 2));
                        jSONObject6.put("secret", Base64.encodeToString(i19, 2));
                        jSONObject3.put("reverse_side", jSONObject6);
                    }
                    if (fm0Var.f36914b) {
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile3;
                            byte[] i110 = fn0Var.i1(tL_secureFile4.secret, tL_secureFile4.file_hash);
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("file_hash", Base64.encodeToString(tL_secureFile4.file_hash, 2));
                            jSONObject7.put("secret", Base64.encodeToString(i110, 2));
                            jSONObject3.put("selfie", jSONObject7);
                        }
                    }
                    if (fm0Var.f36915c && !tL_secureValue.translation.isEmpty()) {
                        JSONArray jSONArray2 = new JSONArray();
                        int size5 = tL_secureValue.translation.size();
                        for (int i20 = 0; i20 < size5; i20++) {
                            TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) tL_secureValue.translation.get(i20);
                            byte[] i111 = fn0Var.i1(tL_secureFile5.secret, tL_secureFile5.file_hash);
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
        Object obj2 = fn0Var.d;
        if (obj2 != null) {
            try {
                jSONObject9.put("payload", obj2);
            } catch (Exception unused6) {
            }
        }
        Object obj3 = fn0Var.f36928e;
        if (obj3 != null) {
            try {
                jSONObject9.put("nonce", obj3);
            } catch (Exception unused7) {
            }
        }
        c5.j k12 = fn0Var.k1(AndroidUtilities.getStringBytes(jSONObject9.toString()));
        TLRPC.TL_secureCredentialsEncrypted tL_secureCredentialsEncrypted = new TLRPC.TL_secureCredentialsEncrypted();
        acceptauthorization.credentials = tL_secureCredentialsEncrypted;
        tL_secureCredentialsEncrypted.hash = (byte[]) k12.d;
        tL_secureCredentialsEncrypted.data = (byte[]) k12.f2317c;
        try {
            String replace = str.replaceAll("\\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "");
            Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA1AndMGF1Padding");
            cipher.init(1, (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(replace, 0))));
            acceptauthorization.credentials.secret = cipher.doFinal((byte[]) k12.f2316b);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        ConnectionsManager.getInstance(fn0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(fn0Var.currentAccount).sendRequest(acceptauthorization, new tl0(fn0Var, 1)), fn0Var.classGuid);
    }

    public static void W(fn0 fn0Var, TLRPC.TL_error tL_error, String str, vm0 vm0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        if (tL_error == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("phone", str);
            fn0 fn0Var2 = new fn0(7, fn0Var.f36973y, fn0Var.G, fn0Var.B, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
            fn0Var2.currentAccount = fn0Var.currentAccount;
            fn0Var2.f36922b1 = fn0Var.f36922b1;
            fn0Var2.Z0 = fn0Var.Z0;
            fn0Var2.f36975y1 = vm0Var;
            fn0Var2.H = (TLRPC.TL_auth_sentCode) tLObject;
            fn0Var.presentFragment(fn0Var2, true);
            return;
        }
        org.telegram.ui.Components.z4.f0(fn0Var.currentAccount, tL_error, fn0Var, sendverifyphonecode, str);
    }

    public static void X(fn0 fn0Var, SecureDocument secureDocument, int i10) {
        HashMap hashMap = fn0Var.f36943k1;
        int i11 = fn0Var.P0;
        if (i11 == 1) {
            SecureDocument secureDocument2 = fn0Var.f36935g1;
            if (secureDocument2 != null) {
                dn0 dn0Var = (dn0) hashMap.remove(secureDocument2);
                if (dn0Var != null) {
                    fn0Var.f36926d0.removeView(dn0Var);
                }
                fn0Var.f36935g1 = null;
            }
        } else if (i11 == 4) {
            if (fn0Var.f36937h1.size() >= 20) {
                return;
            }
        } else if (i11 == 2) {
            SecureDocument secureDocument3 = fn0Var.f36939i1;
            if (secureDocument3 != null) {
                dn0 dn0Var2 = (dn0) hashMap.remove(secureDocument3);
                if (dn0Var2 != null) {
                    fn0Var.f36921b0.removeView(dn0Var2);
                }
                fn0Var.f36939i1 = null;
            }
        } else if (i11 == 3) {
            SecureDocument secureDocument4 = fn0Var.f36941j1;
            if (secureDocument4 != null) {
                dn0 dn0Var3 = (dn0) hashMap.remove(secureDocument4);
                if (dn0Var3 != null) {
                    fn0Var.f36924c0.removeView(dn0Var3);
                }
                fn0Var.f36941j1 = null;
            }
        } else if (i11 == 0 && fn0Var.f36933f1.size() >= 20) {
            return;
        }
        fn0Var.l1.put(secureDocument.path, secureDocument);
        fn0Var.I.setEnabled(false);
        fn0Var.I.setAlpha(0.5f);
        FileLoader.getInstance(fn0Var.currentAccount).uploadFile(secureDocument.path, false, true, 16777216);
        fn0Var.R0(secureDocument, i10);
        fn0Var.S1(i10);
    }

    public static void Y(org.telegram.ui.fn0 r9, boolean r10, java.lang.String r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fn0.Y(org.telegram.ui.fn0, boolean, java.lang.String):void");
    }

    public static void Z(int i10, String str, SecureDocument secureDocument, dn0 dn0Var, fn0 fn0Var) {
        HashMap hashMap = fn0Var.l1;
        fn0Var.f36943k1.remove(secureDocument);
        if (i10 == 1) {
            fn0Var.f36935g1 = null;
            fn0Var.f36926d0.removeView(dn0Var);
        } else if (i10 == 4) {
            fn0Var.f36937h1.remove(secureDocument);
            fn0Var.f36929e0.removeView(dn0Var);
        } else if (i10 == 2) {
            fn0Var.f36939i1 = null;
            fn0Var.f36921b0.removeView(dn0Var);
        } else if (i10 == 3) {
            fn0Var.f36941j1 = null;
            fn0Var.f36924c0.removeView(dn0Var);
        } else {
            fn0Var.f36933f1.remove(secureDocument);
            fn0Var.f36918a0.removeView(dn0Var);
        }
        if (str != null) {
            HashMap hashMap2 = fn0Var.f36964u1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
            HashMap hashMap3 = fn0Var.f36966v1;
            if (hashMap3 != null) {
                hashMap3.remove(str);
            }
        }
        fn0Var.S1(i10);
        String str2 = secureDocument.path;
        if (str2 != null && hashMap.remove(str2) != null) {
            if (hashMap.isEmpty()) {
                fn0Var.I.setEnabled(true);
                fn0Var.I.setAlpha(1.0f);
            }
            FileLoader.getInstance(fn0Var.currentAccount).cancelFileUpload(secureDocument.path, false);
        }
    }

    public static boolean Z0(byte[] bArr, Long l10) {
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
        if (l10 != null && Utilities.bytesToLong(Utilities.computeSHA256(bArr)) != l10.longValue()) {
            return false;
        }
        return true;
    }

    public static void a0(fn0 fn0Var) {
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        for (int i10 = 0; i10 < fn0Var.f36973y.values.size(); i10++) {
            deletesecurevalue.types.add(fn0Var.f36973y.values.get(i10).type);
        }
        fn0Var.y1();
        ConnectionsManager.getInstance(fn0Var.currentAccount).sendRequest(deletesecurevalue, new tl0(fn0Var, 2));
    }

    public static void b0(fn0 fn0Var) {
        qg1 qg1Var = new qg1(fn0Var.currentAccount, 0, fn0Var.G);
        qg1Var.V = true;
        fn0Var.presentFragment(qg1Var);
    }

    public static void c0(fn0 fn0Var) {
        if (fn0Var.G.has_recovery) {
            fn0Var.y1();
            ConnectionsManager.getInstance(fn0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(fn0Var.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new tl0(fn0Var, 0), 10), fn0Var.classGuid);
        } else if (fn0Var.getParentActivity() == null) {
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fn0Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.RestorePasswordResetAccount), new sl0(fn0Var, 4));
            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
            String string = LocaleController.getString(R.string.RestorePasswordNoEmailText);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
            d2Var.Q = string;
            fn0Var.showDialog(d2Var);
        }
    }

    public static void d0(fn0 fn0Var) {
        Activity parentActivity = fn0Var.getParentActivity();
        af.g.s(parentActivity, "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(fn0Var.currentAccount).getClientPhone());
    }

    public static void e0(fn0 fn0Var) {
        if (Build.VERSION.SDK_INT >= 23 && fn0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            fn0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
            return;
        }
        v9 v9Var = new v9(0);
        v9Var.I = new cm0(fn0Var);
        fn0Var.presentFragment(v9Var);
    }

    public static int f0(fn0 fn0Var) {
        return fn0Var.currentAccount;
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

    public static int r0(fn0 fn0Var) {
        return fn0Var.currentAccount;
    }

    public static int s0(fn0 fn0Var) {
        return fn0Var.currentAccount;
    }

    public static int t0(fn0 fn0Var) {
        return fn0Var.currentAccount;
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

    public final void A1(boolean z4) {
        if (getParentActivity() == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        if (z4) {
            this.V[0].setText("");
        }
        AndroidUtilities.shakeView(this.V[0]);
    }

    public final void B1(boolean z4) {
        String obj;
        if (z4) {
            obj = null;
        } else {
            obj = this.V[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                A1(false);
                return;
            }
            N1(true, true);
        }
        Utilities.globalQueue.postRunnable(new mh.r5(this, z4, obj, 26));
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
            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.PassportNoDocumentsAdd);
            alertDialog$Builder.f((CharSequence[]) arrayList.toArray(new CharSequence[0]), new dg.t1(9, this, arrayList2));
            showDialog(alertDialog$Builder.f21166a);
        }
    }

    public final void D1() {
        boolean z4;
        int size;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        int i11 = this.P0;
        ArrayList arrayList = this.f36933f1;
        int i12 = 1;
        if (i11 == 0 && arrayList.size() >= 20) {
            M1(LocaleController.getString(R.string.AppName), LocaleController.formatString("PassportUploadMaxReached", R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", 20, new Object[0])));
            return;
        }
        c1();
        org.telegram.ui.Components.mi miVar = this.O0;
        int i13 = this.P0;
        if (i13 == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        miVar.R1 = z4;
        if (i13 == 0) {
            size = arrayList.size();
        } else {
            if (i13 == 4) {
                size = this.f36937h1.size();
            }
            miVar.J1(i12, false);
            this.O0.f29054g0.f0();
            i10 = Build.VERSION.SDK_INT;
            if (i10 != 21 || i10 == 22) {
                AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            }
            this.O0.r1();
            showDialog(this.O0);
        }
        i12 = 20 - size;
        miVar.J1(i12, false);
        this.O0.f29054g0.f0();
        i10 = Build.VERSION.SDK_INT;
        if (i10 != 21) {
        }
        AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
        this.O0.r1();
        showDialog(this.O0);
    }

    public final void E1(TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, boolean z4) {
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
            HashMap hashMap4 = this.f36957r1;
            if (!z4) {
                hashMap = (HashMap) hashMap4.get(o1(secureValueType2));
            } else {
                hashMap = null;
            }
            HashMap hashMap5 = (HashMap) hashMap4.get(o1(secureValueType));
            TLRPC.TL_secureValue r12 = r1(tL_secureRequiredType, false);
            TLRPC.TL_secureValue r13 = r1(tL_secureRequiredType2, false);
            HashMap hashMap6 = hashMap;
            TL_account.authorizationForm authorizationform = this.f36973y;
            int i12 = i11;
            TL_account.Password password = this.G;
            HashMap hashMap7 = this.f36945m1;
            HashMap hashMap8 = (HashMap) hashMap7.get(tL_secureRequiredType);
            if (tL_secureRequiredType2 != null) {
                hashMap2 = hashMap5;
                hashMap3 = (HashMap) hashMap7.get(tL_secureRequiredType2);
            } else {
                hashMap2 = hashMap5;
                hashMap3 = null;
            }
            fn0 fn0Var = new fn0(i12, authorizationform, password, tL_secureRequiredType, r12, tL_secureRequiredType2, r13, hashMap8, hashMap3);
            fn0Var.f36975y1 = new im0(this, secureValueType2, z4, i10);
            fn0Var.currentAccount = this.currentAccount;
            fn0Var.f36922b1 = this.f36922b1;
            fn0Var.Z0 = this.Z0;
            fn0Var.f36923c = this.f36923c;
            fn0Var.f36962t1 = hashMap6;
            fn0Var.f36959s0 = z4;
            fn0Var.f36964u1 = hashMap2;
            fn0Var.D = arrayList;
            if (i12 == 4) {
                fn0Var.f36919a1 = this.f36919a1;
            }
            presentFragment(fn0Var);
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
                    this.N0 = generatePicturePath.getAbsolutePath();
                }
                startActivityForResult(intent, 0);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }

    public final void G1(ArrayList arrayList) {
        boolean z4;
        if (arrayList.isEmpty()) {
            return;
        }
        int i10 = this.P0;
        boolean z10 = true;
        if (i10 != 1 && i10 != 4 && (this.B.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            int i11 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.V;
                if (i11 < editTextBoldCursorArr.length) {
                    if (i11 != 5 && i11 != 8 && i11 != 4 && i11 != 6 && editTextBoldCursorArr[i11].length() > 0) {
                        z10 = false;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            z4 = z10;
        } else {
            z4 = false;
        }
        Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.l0(this.P0, 7, this, arrayList, z4));
    }

    public final TLRPC.TL_secureValue H1(TLRPC.TL_secureRequiredType tL_secureRequiredType) {
        if (tL_secureRequiredType == null) {
            return null;
        }
        int size = this.f36973y.values.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (tL_secureRequiredType.type.getClass() == this.f36973y.values.get(i10).type.getClass()) {
                return this.f36973y.values.remove(i10);
            }
        }
        return null;
    }

    public final void I1(View view) {
        while (view != null && this.Z.indexOfChild(view) < 0) {
            view = (View) view.getParent();
        }
        if (view != null) {
            this.Y.smoothScrollTo(0, view.getTop() - ((this.Y.getMeasuredHeight() - view.getMeasuredHeight()) / 2));
        }
    }

    public final void J1(HashMap hashMap, EditTextBoldCursor editTextBoldCursor, String str) {
        CharSequence charSequence;
        CharSequence charSequence2;
        String str2 = (String) hashMap.get(str);
        if (str2 != null) {
            char c3 = 65535;
            switch (str.hashCode()) {
                case -2006252145:
                    if (str.equals("residence_country_code")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case -1249512767:
                    if (str.equals("gender")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 475919162:
                    if (str.equals("expiry_date")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 1481071862:
                    if (str.equals("country_code")) {
                        c3 = 3;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    this.v = str2;
                    CharSequence charSequence3 = (String) this.V0.get(str2);
                    if (charSequence3 != null) {
                        editTextBoldCursor.setText(charSequence3);
                        break;
                    }
                    break;
                case 1:
                    if ("male".equals(str2)) {
                        this.f36967w = str2;
                        editTextBoldCursor.setText(LocaleController.getString(R.string.PassportMale));
                        break;
                    } else if ("female".equals(str2)) {
                        this.f36967w = str2;
                        editTextBoldCursor.setText(LocaleController.getString(R.string.PassportFemale));
                        break;
                    }
                    break;
                case 2:
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    int[] iArr = this.f36970x;
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
                    this.f36958s = str2;
                    CharSequence charSequence4 = (String) this.V0.get(str2);
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
        HashMap hashMap2 = this.f36962t1;
        HashMap hashMap3 = this.f36966v1;
        if (hashMap2 != null && (charSequence2 = (String) hashMap2.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence2);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
            return;
        }
        HashMap hashMap4 = this.f36964u1;
        if (hashMap4 != null && (charSequence = (String) hashMap4.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
        }
    }

    public final void K1(Bundle bundle, int i10, boolean z4) {
        if (i10 == 3) {
            this.I.setVisibility(8);
        }
        int i11 = this.F1;
        org.telegram.ui.Components.wv0[] wv0VarArr = this.G1;
        org.telegram.ui.Components.wv0 wv0Var = wv0VarArr[i11];
        org.telegram.ui.Components.wv0 wv0Var2 = wv0VarArr[i10];
        this.F1 = i10;
        wv0Var2.m(bundle, false);
        wv0Var2.j();
        if (z4) {
            wv0Var2.setTranslationX(AndroidUtilities.displaySize.x);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.setDuration(300L);
            animatorSet.playTogether(ObjectAnimator.ofFloat(wv0Var, "translationX", -AndroidUtilities.displaySize.x), ObjectAnimator.ofFloat(wv0Var2, "translationX", 0.0f));
            animatorSet.addListener(new org.telegram.ui.Components.fx0(wv0Var2, wv0Var, 5));
            animatorSet.start();
            return;
        }
        wv0Var2.setTranslationX(0.0f);
        wv0Var2.setVisibility(0);
        if (wv0Var != wv0Var2) {
            wv0Var.setVisibility(8);
        }
    }

    public final void L1(org.telegram.tgnet.TLRPC.TL_secureRequiredType r31, java.lang.String r32, java.lang.String r33, org.telegram.tgnet.TLRPC.TL_secureRequiredType r34, java.lang.String r35, boolean r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fn0.L1(org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, boolean, int):void");
    }

    public final void M1(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        d2Var.O = str;
        d2Var.Q = str2;
        showDialog(d2Var);
    }

    public final void N1(boolean z4, boolean z10) {
        AnimatorSet animatorSet = this.J;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z4 && this.I != null) {
            this.J = new AnimatorSet();
            if (z10) {
                this.K.setVisibility(0);
                this.I.setEnabled(false);
                AnimatorSet animatorSet2 = this.J;
                View contentView = this.I.getContentView();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(contentView, property, 0.1f);
                View contentView2 = this.I.getContentView();
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(contentView2, property2, 0.1f);
                View contentView3 = this.I.getContentView();
                Property property3 = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(contentView3, property3, 0.0f), ObjectAnimator.ofFloat(this.K, property, 1.0f), ObjectAnimator.ofFloat(this.K, property2, 1.0f), ObjectAnimator.ofFloat(this.K, property3, 1.0f));
            } else {
                this.I.getContentView().setVisibility(0);
                this.I.setEnabled(true);
                AnimatorSet animatorSet3 = this.J;
                org.telegram.ui.Components.tq tqVar = this.K;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(tqVar, property4, 0.1f);
                org.telegram.ui.Components.tq tqVar2 = this.K;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(tqVar2, property5, 0.1f);
                org.telegram.ui.Components.tq tqVar3 = this.K;
                Property property6 = View.ALPHA;
                animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(tqVar3, property6, 0.0f), ObjectAnimator.ofFloat(this.I.getContentView(), property4, 1.0f), ObjectAnimator.ofFloat(this.I.getContentView(), property5, 1.0f), ObjectAnimator.ofFloat(this.I.getContentView(), property6, 1.0f));
            }
            this.J.addListener(new jm0(this, z10, 0));
            this.J.setDuration(150L);
            this.J.start();
        } else if (this.L != null) {
            this.J = new AnimatorSet();
            if (z10) {
                this.M.setVisibility(0);
                this.N.setEnabled(false);
                AnimatorSet animatorSet4 = this.J;
                TextView textView = this.L;
                Property property7 = View.SCALE_X;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView, property7, 0.1f);
                TextView textView2 = this.L;
                Property property8 = View.SCALE_Y;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textView2, property8, 0.1f);
                TextView textView3 = this.L;
                Property property9 = View.ALPHA;
                animatorSet4.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(textView3, property9, 0.0f), ObjectAnimator.ofFloat(this.M, property7, 1.0f), ObjectAnimator.ofFloat(this.M, property8, 1.0f), ObjectAnimator.ofFloat(this.M, property9, 1.0f));
            } else {
                this.L.setVisibility(0);
                this.N.setEnabled(true);
                AnimatorSet animatorSet5 = this.J;
                org.telegram.ui.Components.tq tqVar4 = this.M;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(tqVar4, property10, 0.1f);
                org.telegram.ui.Components.tq tqVar5 = this.M;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(tqVar5, property11, 0.1f);
                org.telegram.ui.Components.tq tqVar6 = this.M;
                Property property12 = View.ALPHA;
                animatorSet5.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(tqVar6, property12, 0.0f), ObjectAnimator.ofFloat(this.L, property10, 1.0f), ObjectAnimator.ofFloat(this.L, property11, 1.0f), ObjectAnimator.ofFloat(this.L, property12, 1.0f));
            }
            this.J.addListener(new jm0(this, z10, 1));
            this.J.setDuration(150L);
            this.J.start();
        }
    }

    public final void O1(boolean z4, String str, Runnable runnable, tm0 tm0Var, vm0 vm0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        if (telephonyManager.getSimState() != 1 && telephonyManager.getPhoneType() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getParentActivity() != null && Build.VERSION.SDK_INT >= 23 && z10) {
            if (getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z4) {
                this.J1.clear();
                if (!z11) {
                    this.J1.add("android.permission.READ_PHONE_STATE");
                }
                if (!this.J1.isEmpty()) {
                    if (getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.AllowReadCall);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                        d2Var.Q = string;
                        this.I1 = showDialog(d2Var);
                    } else {
                        getParentActivity().requestPermissions((String[]) this.J1.toArray(new String[0]), 6);
                    }
                    this.B1 = str;
                    this.D1 = tm0Var;
                    this.C1 = runnable;
                    this.E1 = vm0Var;
                    return;
                }
            }
        } else {
            z11 = true;
        }
        TL_account.sendVerifyPhoneCode sendverifyphonecode = new TL_account.sendVerifyPhoneCode();
        sendverifyphonecode.phone_number = str;
        TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
        sendverifyphonecode.settings = tL_codeSettings;
        if (z10 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        tL_codeSettings.allow_flashcall = z12;
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
            } catch (Exception e6) {
                sendverifyphonecode.settings.allow_flashcall = false;
                FileLog.e(e6);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendverifyphonecode, new lh.b1(this, str, vm0Var, sendverifyphonecode, 12), 2);
    }

    public final void P1() {
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.C;
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
        if (this.f36973y.values.isEmpty()) {
            this.f36971x0.setVisibility(0);
            this.f36938i0.setVisibility(8);
            this.f36934g0.setVisibility(8);
            this.f36963u0.setVisibility(8);
            this.f36965v0.setVisibility(8);
            this.f36968w0.setVisibility(8);
            return;
        }
        this.f36971x0.setVisibility(8);
        this.f36938i0.setVisibility(0);
        this.f36934g0.setVisibility(0);
        this.f36965v0.setVisibility(0);
        this.f36968w0.setVisibility(0);
        if (!s1(TLRPC.TL_secureValueTypePhone.class) && !s1(TLRPC.TL_secureValueTypeEmail.class) && !s1(TLRPC.TL_secureValueTypePersonalDetails.class) && !s1(TLRPC.TL_secureValueTypePassport.class) && !s1(TLRPC.TL_secureValueTypeInternalPassport.class) && !s1(TLRPC.TL_secureValueTypeIdentityCard.class) && !s1(TLRPC.TL_secureValueTypeDriverLicense.class) && !s1(TLRPC.TL_secureValueTypeAddress.class) && !s1(TLRPC.TL_secureValueTypeUtilityBill.class) && !s1(TLRPC.TL_secureValueTypePassportRegistration.class) && !s1(TLRPC.TL_secureValueTypeTemporaryRegistration.class) && !s1(TLRPC.TL_secureValueTypeBankStatement.class) && !s1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            this.f36963u0.setVisibility(8);
        } else {
            this.f36963u0.setVisibility(0);
        }
    }

    public final void R0(final SecureDocument secureDocument, final int i10) {
        String string;
        final String str;
        String formatDateForBan;
        HashMap hashMap;
        if (i10 == 1) {
            this.f36935g1 = secureDocument;
            if (this.f36926d0 == null) {
                return;
            }
        } else if (i10 == 4) {
            this.f36937h1.add(secureDocument);
            if (this.f36929e0 == null) {
                return;
            }
        } else if (i10 == 2) {
            this.f36939i1 = secureDocument;
            if (this.f36921b0 == null) {
                return;
            }
        } else if (i10 == 3) {
            this.f36941j1 = secureDocument;
            if (this.f36924c0 == null) {
                return;
            }
        } else {
            this.f36933f1.add(secureDocument);
            if (this.f36918a0 == null) {
                return;
            }
        }
        if (getParentActivity() == null) {
            return;
        }
        final dn0 dn0Var = new dn0(this, getParentActivity());
        dn0Var.setTag(secureDocument);
        dn0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
        this.f36943k1.put(secureDocument, dn0Var);
        String n12 = n1(secureDocument);
        if (i10 == 1) {
            string = LocaleController.getString(R.string.PassportSelfie);
            this.f36926d0.addView(dn0Var, k7.c6.n(-1, -2));
            str = "selfie" + n12;
        } else if (i10 == 4) {
            string = LocaleController.getString(R.string.AttachPhoto);
            this.f36929e0.addView(dn0Var, k7.c6.n(-1, -2));
            str = "translation" + n12;
        } else if (i10 == 2) {
            TLRPC.SecureValueType secureValueType = this.C.type;
            if (!(secureValueType instanceof TLRPC.TL_secureValueTypePassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                string = LocaleController.getString(R.string.PassportFrontSide);
            } else {
                string = LocaleController.getString(R.string.PassportMainPage);
            }
            this.f36921b0.addView(dn0Var, k7.c6.n(-1, -2));
            str = "front" + n12;
        } else if (i10 == 3) {
            string = LocaleController.getString(R.string.PassportReverseSide);
            this.f36924c0.addView(dn0Var, k7.c6.n(-1, -2));
            str = "reverse" + n12;
        } else {
            string = LocaleController.getString(R.string.AttachPhoto);
            this.f36918a0.addView(dn0Var, k7.c6.n(-1, -2));
            str = "files" + n12;
        }
        if (str != null && (hashMap = this.f36964u1) != null && (formatDateForBan = (String) hashMap.get(str)) != null) {
            dn0Var.f36265b.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21876p7, false));
            this.f36966v1.put(str, "");
        } else {
            formatDateForBan = LocaleController.formatDateForBan(secureDocument.secureFile.date);
        }
        dn0Var.f36264a.setText(string);
        dn0Var.f36265b.setText(formatDateForBan);
        org.telegram.ui.Components.p9 p9Var = dn0Var.f36266c;
        p9Var.getClass();
        p9Var.m(ImageLocation.getForSecureDocument(secureDocument), "48_48", null, null, null, null, 0, null);
        dn0Var.f36268f = secureDocument;
        dn0Var.a(false);
        dn0Var.setOnClickListener(new mh.x0(this, i10, 17));
        dn0Var.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                fn0 fn0Var = this;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fn0Var.getParentActivity());
                int i11 = i10;
                if (i11 == 1) {
                    alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.PassportDeleteSelfie);
                } else {
                    alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.PassportDeleteScan);
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new eg.j3(fn0Var, secureDocument, i11, dn0Var, str, 6));
                fn0Var.showDialog(alertDialog$Builder.f21166a);
                return true;
            }
        });
    }

    public final void R1() {
        ImageView imageView = this.F0;
        if (imageView != null) {
            TL_account.Password password = this.G;
            if (password != null && this.K0 == 0) {
                if (!password.has_password) {
                    this.D0.setVisibility(0);
                    this.F0.setVisibility(0);
                    this.G0.setVisibility(0);
                    this.H0.setVisibility(0);
                    this.I0.setVisibility(8);
                    this.W[0].setVisibility(8);
                    this.I.setVisibility(8);
                    this.J0.setVisibility(8);
                    this.E0.setVisibility(8);
                    this.D0.setLayoutParams(k7.c6.k(0.0f, 25.0f, 0.0f, 0.0f, -1, -2));
                    this.C0.setVisibility(8);
                    return;
                }
                this.D0.setVisibility(0);
                this.F0.setVisibility(8);
                this.G0.setVisibility(8);
                this.H0.setVisibility(8);
                this.C0.setVisibility(8);
                this.I0.setVisibility(0);
                this.W[0].setVisibility(0);
                this.I.setVisibility(0);
                this.J0.setVisibility(0);
                this.E0.setVisibility(0);
                this.D0.setLayoutParams(k7.c6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                if (this.V != null) {
                    TL_account.Password password2 = this.G;
                    if (password2 != null && !TextUtils.isEmpty(password2.hint)) {
                        this.V[0].setHint(this.G.hint);
                        return;
                    } else {
                        this.V[0].setHint(LocaleController.getString(R.string.LoginPassword));
                        return;
                    }
                }
                return;
            }
            imageView.setVisibility(8);
            this.G0.setVisibility(8);
            this.H0.setVisibility(8);
            this.I0.setVisibility(8);
            this.W[0].setVisibility(8);
            this.I.setVisibility(8);
            this.J0.setVisibility(8);
            this.E0.setVisibility(8);
            this.D0.setVisibility(8);
            this.C0.setVisibility(0);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fn0.S1(int):void");
    }

    public final void T0(ArrayList arrayList) {
        this.f36933f1.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i10);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                S0((TLRPC.TL_secureFile) secureFile, 0);
            }
        }
    }

    public final org.telegram.ui.en0 U0(android.content.Context r28, org.telegram.tgnet.TLRPC.TL_secureRequiredType r29, java.util.ArrayList r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fn0.U0(android.content.Context, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.util.ArrayList, boolean, boolean):org.telegram.ui.en0");
    }

    public final void V0(ArrayList arrayList) {
        this.f36937h1.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i10);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                S0((TLRPC.TL_secureFile) secureFile, 4);
            }
        }
    }

    public final void W0(boolean z4) {
        int i10;
        if (!this.f36927d1) {
            String str = this.f36946n;
            boolean isEmpty = TextUtils.isEmpty(str);
            int i11 = this.f36920b;
            if (!isEmpty) {
                if (z4) {
                    Activity parentActivity = getParentActivity();
                    af.g.p(parentActivity, Uri.parse(str + "&tg_passport=success"), true, true);
                } else if (!this.f36925c1 && (i11 == 5 || i11 == 0)) {
                    Activity parentActivity2 = getParentActivity();
                    af.g.p(parentActivity2, Uri.parse(str + "&tg_passport=cancel"), true, true);
                }
                this.f36927d1 = true;
            } else if (this.f36977z1) {
                if (z4 || (!this.f36925c1 && (i11 == 5 || i11 == 0))) {
                    Activity parentActivity3 = getParentActivity();
                    if (z4) {
                        i10 = -1;
                    } else {
                        i10 = 0;
                    }
                    parentActivity3.setResult(i10);
                }
                this.f36927d1 = true;
            }
        }
    }

    public final boolean X0(boolean z4) {
        if (u1()) {
            return false;
        }
        if (z4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new sl0(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.DiscardChanges);
            String string = LocaleController.getString(R.string.PassportDiscardChanges);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
            d2Var.Q = string;
            showDialog(d2Var);
            return true;
        }
        return true;
    }

    public final void Y0(boolean z4) {
        String str;
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.X != null) {
            String str2 = (String) this.V0.get(this.v);
            String str3 = SharedConfig.getCountryLangs().get(this.v);
            int i10 = 0;
            if (this.B.native_names && !TextUtils.isEmpty(this.v) && !"EN".equals(str3)) {
                if (this.f36947n0.getVisibility() != 0) {
                    this.f36947n0.setVisibility(0);
                    this.f36934g0.setVisibility(0);
                    this.Q.setVisibility(0);
                    int i11 = 0;
                    while (true) {
                        editTextBoldCursorArr = this.X;
                        if (i11 >= editTextBoldCursorArr.length) {
                            break;
                        }
                        ((View) editTextBoldCursorArr[i11].getParent()).setVisibility(0);
                        i11++;
                    }
                    if (editTextBoldCursorArr[0].length() == 0 && this.X[1].length() == 0 && this.X[2].length() == 0) {
                        int i12 = 0;
                        while (true) {
                            boolean[] zArr = this.f36953q0;
                            if (i12 >= zArr.length) {
                                break;
                            } else if (zArr[i12]) {
                                this.X[0].setText(this.V[0].getText());
                                this.X[1].setText(this.V[1].getText());
                                this.X[2].setText(this.V[2].getText());
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    this.f36940j0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.f21624b7));
                }
                this.f36947n0.setText(LocaleController.formatString("PassportNativeInfo", R.string.PassportNativeInfo, str2));
                if (str3 != null) {
                    str = LocaleController.getServerString("PassportLanguage_".concat(str3));
                } else {
                    str = null;
                }
                if (str != null) {
                    this.f36934g0.setText(LocaleController.formatString("PassportNativeHeaderLang", R.string.PassportNativeHeaderLang, str));
                } else {
                    this.f36934g0.setText(LocaleController.getString(R.string.PassportNativeHeader));
                }
                for (int i13 = 0; i13 < 3; i13++) {
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 == 2) {
                                if (str != null) {
                                    this.X[i13].setHintText(LocaleController.getString(R.string.PassportSurname));
                                } else {
                                    this.X[i13].setHintText(LocaleController.formatString("PassportSurnameCountry", R.string.PassportSurnameCountry, str2));
                                }
                            }
                        } else if (str != null) {
                            this.X[i13].setHintText(LocaleController.getString(R.string.PassportMidname));
                        } else {
                            this.X[i13].setHintText(LocaleController.formatString("PassportMidnameCountry", R.string.PassportMidnameCountry, str2));
                        }
                    } else if (str != null) {
                        this.X[i13].setHintText(LocaleController.getString(R.string.PassportName));
                    } else {
                        this.X[i13].setHintText(LocaleController.formatString("PassportNameCountry", R.string.PassportNameCountry, str2));
                    }
                }
                if (z4) {
                    AndroidUtilities.runOnUIThread(new pl0(this, 2));
                }
            } else if (this.f36947n0.getVisibility() != 8) {
                this.f36947n0.setVisibility(8);
                this.f36934g0.setVisibility(8);
                this.Q.setVisibility(8);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.X;
                    if (i10 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    ((View) editTextBoldCursorArr2[i10].getParent()).setVisibility(8);
                    i10++;
                }
                if (((this.f36923c != 0 || this.C == null) && this.E != null && !this.f36959s0) || this.F != null) {
                    this.f36940j0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.f21624b7));
                } else {
                    this.f36940j0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21624b7));
                }
            }
        }
    }

    public final void a1(boolean z4) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        String str2;
        if (this.m0 != null) {
            HashMap hashMap = this.f36962t1;
            HashMap hashMap2 = this.f36966v1;
            if (hashMap != null && ((z4 || hashMap2.containsKey("error_all")) && (str2 = (String) this.f36962t1.get("error_all")) != null)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
                if (z4) {
                    hashMap2.put("error_all", "");
                }
            } else {
                spannableStringBuilder = null;
            }
            if (this.f36964u1 != null && ((z4 || hashMap2.containsKey("error_document_all")) && (str = (String) this.f36964u1.get("error_all")) != null)) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder(str);
                } else {
                    spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) str);
                }
                if (z4) {
                    hashMap2.put("error_document_all", "");
                }
            }
            if (spannableStringBuilder != null) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21876p7, false)), 0, spannableStringBuilder.length(), 33);
                this.m0.setText(spannableStringBuilder);
                this.m0.setVisibility(0);
            } else if (this.m0.getVisibility() != 8) {
                this.m0.setVisibility(8);
            }
        }
    }

    public final void b1(Context context) {
        long j10;
        String str;
        this.V0 = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.V0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
        this.m0 = a9Var;
        int i10 = R.drawable.greydivider_top;
        int i11 = org.telegram.ui.ActionBar.k6.f21624b7;
        a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, i10, i11));
        this.m0.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.Z.addView(this.m0, k7.c6.n(-1, -2));
        a1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.C;
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
            this.f36934g0 = m4Var;
            m4Var.setText(LocaleController.getString(R.string.PassportDocuments));
            org.telegram.ui.Cells.m4 m4Var2 = this.f36934g0;
            int i12 = org.telegram.ui.ActionBar.k6.f21659d6;
            m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
            this.Z.addView(this.f36934g0, k7.c6.n(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.f36918a0 = linearLayout;
            linearLayout.setOrientation(1);
            this.Z.addView(this.f36918a0, k7.c6.n(-1, -2));
            org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context);
            this.O = aaVar;
            aaVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
            this.Z.addView(this.O, k7.c6.n(-1, -2));
            this.O.setOnClickListener(new ql0(this, 7));
            org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context);
            this.f36942k0 = a9Var2;
            a9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider, i11));
            if (this.f36923c != 0) {
                this.f36969w1 = LocaleController.getString(R.string.PassportAddAddressUploadInfo);
            } else {
                TLRPC.SecureValueType secureValueType2 = this.C.type;
                if (secureValueType2 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                    this.f36969w1 = LocaleController.getString(R.string.PassportAddAgreementInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                    this.f36969w1 = LocaleController.getString(R.string.PassportAddBillInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                    this.f36969w1 = LocaleController.getString(R.string.PassportAddPassportRegistrationInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                    this.f36969w1 = LocaleController.getString(R.string.PassportAddTemporaryRegistrationInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                    this.f36969w1 = LocaleController.getString(R.string.PassportAddBankInfo);
                } else {
                    this.f36969w1 = "";
                }
            }
            String str2 = this.f36969w1;
            HashMap hashMap = this.f36964u1;
            j10 = 0;
            HashMap hashMap2 = this.f36966v1;
            String str3 = str2;
            if (hashMap != null) {
                String str4 = (String) hashMap.get("files_all");
                str3 = str2;
                if (str4 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                    spannableStringBuilder.append((CharSequence) "\n\n");
                    spannableStringBuilder.append((CharSequence) this.f36969w1);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21876p7, false)), 0, str4.length(), 33);
                    hashMap2.put("files_all", "");
                    str3 = spannableStringBuilder;
                }
            }
            this.f36942k0.setText(str3);
            this.Z.addView(this.f36942k0, k7.c6.n(-1, -2));
            if (this.C.translation_required) {
                org.telegram.ui.Cells.m4 m4Var3 = new org.telegram.ui.Cells.m4(context);
                this.f36934g0 = m4Var3;
                m4Var3.setText(LocaleController.getString(R.string.PassportTranslation));
                this.f36934g0.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
                this.Z.addView(this.f36934g0, k7.c6.n(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.f36929e0 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.Z.addView(this.f36929e0, k7.c6.n(-1, -2));
                org.telegram.ui.Cells.aa aaVar2 = new org.telegram.ui.Cells.aa(context);
                this.U = aaVar2;
                aaVar2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
                this.Z.addView(this.U, k7.c6.n(-1, -2));
                this.U.setOnClickListener(new ql0(this, 8));
                org.telegram.ui.Cells.a9 a9Var3 = new org.telegram.ui.Cells.a9(context);
                this.f36944l0 = a9Var3;
                a9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider, i11));
                if (this.f36923c != 0) {
                    this.f36972x1 = LocaleController.getString(R.string.PassportAddTranslationUploadInfo);
                } else {
                    TLRPC.SecureValueType secureValueType3 = this.C.type;
                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                        this.f36972x1 = LocaleController.getString(R.string.PassportAddTranslationAgreementInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                        this.f36972x1 = LocaleController.getString(R.string.PassportAddTranslationBillInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                        this.f36972x1 = LocaleController.getString(R.string.PassportAddTranslationPassportRegistrationInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                        this.f36972x1 = LocaleController.getString(R.string.PassportAddTranslationTemporaryRegistrationInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                        this.f36972x1 = LocaleController.getString(R.string.PassportAddTranslationBankInfo);
                    } else {
                        this.f36972x1 = "";
                    }
                }
                String str5 = this.f36972x1;
                HashMap hashMap3 = this.f36964u1;
                String str6 = str5;
                if (hashMap3 != null) {
                    String str7 = (String) hashMap3.get("translation_all");
                    str6 = str5;
                    if (str7 != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str7);
                        spannableStringBuilder2.append((CharSequence) "\n\n");
                        spannableStringBuilder2.append((CharSequence) this.f36972x1);
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21876p7, false)), 0, str7.length(), 33);
                        hashMap2.put("translation_all", "");
                        str6 = spannableStringBuilder2;
                    }
                }
                this.f36944l0.setText(str6);
                this.Z.addView(this.f36944l0, k7.c6.n(-1, -2));
            }
        } else {
            j10 = 0;
            this.actionBar.setTitle(LocaleController.getString(R.string.PassportAddress));
        }
        org.telegram.ui.Cells.m4 m4Var4 = new org.telegram.ui.Cells.m4(context);
        this.f36934g0 = m4Var4;
        m4Var4.setText(LocaleController.getString(R.string.PassportAddressHeader));
        this.f36934g0.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
        this.Z.addView(this.f36934g0, k7.c6.n(-1, -2));
        this.V = new EditTextBoldCursor[6];
        for (int i13 = 0; i13 < 6; i13++) {
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.V[i13] = editTextBoldCursor;
            zl0 zl0Var = new zl0(context, editTextBoldCursor, 0);
            zl0Var.setWillNotDraw(false);
            this.Z.addView(zl0Var, k7.c6.n(-1, -2));
            int i14 = org.telegram.ui.ActionBar.k6.f21659d6;
            zl0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
            int i15 = 5;
            if (i13 == 5) {
                View view = new View(context);
                this.P = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
                this.Z.addView(this.P, k7.c6.n(-1, 6));
            }
            if (this.f36959s0 && this.C != null) {
                zl0Var.setVisibility(8);
                View view2 = this.P;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            this.V[i13].setTag(Integer.valueOf(i13));
            this.V[i13].setSupportRtlHint(true);
            this.V[i13].setTextSize(1, 16.0f);
            this.V[i13].setHintColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.H6, false));
            this.V[i13].setHeaderHintColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.L6, false));
            this.V[i13].setTransformHintToHeader(true);
            EditTextBoldCursor editTextBoldCursor2 = this.V[i13];
            int i16 = org.telegram.ui.ActionBar.k6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
            this.V[i13].setBackgroundDrawable(null);
            this.V[i13].setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
            this.V[i13].setCursorSize(AndroidUtilities.dp(20.0f));
            this.V[i13].setCursorWidth(1.5f);
            this.V[i13].setLineColors(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21785k6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21803l6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21876p7, false));
            if (i13 == 5) {
                this.V[i13].setOnTouchListener(new rl0(this, 2));
                this.V[i13].setInputType(0);
                this.V[i13].setFocusable(false);
            } else {
                this.V[i13].setInputType(16385);
                this.V[i13].setImeOptions(268435461);
            }
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 != 4) {
                                if (i13 == 5) {
                                    this.V[i13].setHintText(LocaleController.getString(R.string.PassportCountry));
                                    str = "country_code";
                                }
                            } else {
                                this.V[i13].setHintText(LocaleController.getString(R.string.PassportState));
                                str = "state";
                            }
                        } else {
                            this.V[i13].setHintText(LocaleController.getString(R.string.PassportCity));
                            str = "city";
                        }
                    } else {
                        this.V[i13].setHintText(LocaleController.getString(R.string.PassportPostcode));
                        str = "post_code";
                    }
                } else {
                    this.V[i13].setHintText(LocaleController.getString(R.string.PassportStreet2));
                    str = "street_line2";
                }
            } else {
                this.V[i13].setHintText(LocaleController.getString(R.string.PassportStreet1));
                str = "street_line1";
            }
            J1(this.f36952p1, this.V[i13], str);
            if (i13 == 2) {
                this.V[i13].addTextChangedListener(new am0(this, editTextBoldCursor, str));
                this.V[i13].setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            } else {
                this.V[i13].addTextChangedListener(new bm0(this, editTextBoldCursor, str, 0));
            }
            EditTextBoldCursor editTextBoldCursor3 = this.V[i13];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.V[i13].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.V[i13];
            if (!LocaleController.isRTL) {
                i15 = 3;
            }
            editTextBoldCursor4.setGravity(i15 | 16);
            zl0Var.addView(this.V[i13], k7.c6.d(-1, 64.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
            this.V[i13].setOnEditorActionListener(new ol0(this, 4));
        }
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (b) null);
        this.f36938i0 = z6Var;
        this.Z.addView(z6Var, k7.c6.n(-1, -2));
        if (this.f36959s0 && this.C != null) {
            this.f36934g0.setVisibility(8);
            this.f36938i0.setVisibility(8);
        }
        long j11 = this.f36923c;
        TLRPC.TL_secureValue tL_secureValue = this.F;
        if (((j11 != j10 || this.C == null) && this.E != null && !this.f36959s0) || tL_secureValue != null) {
            if (tL_secureValue != null) {
                T0(tL_secureValue.files);
                V0(tL_secureValue.translation);
            }
            org.telegram.ui.Cells.z6 z6Var2 = this.f36938i0;
            int i17 = R.drawable.greydivider;
            int i18 = org.telegram.ui.ActionBar.k6.f21624b7;
            z6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, i17, i18));
            org.telegram.ui.Cells.aa aaVar3 = new org.telegram.ui.Cells.aa(context);
            aaVar3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21876p7, false));
            aaVar3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
            if (this.C == null) {
                aaVar3.b(LocaleController.getString(R.string.PassportDeleteInfo), false);
            } else {
                aaVar3.b(LocaleController.getString(R.string.PassportDeleteDocument), false);
            }
            this.Z.addView(aaVar3, k7.c6.n(-1, -2));
            aaVar3.setOnClickListener(new ql0(this, 9));
            org.telegram.ui.Cells.z6 z6Var3 = new org.telegram.ui.Cells.z6(context, (b) null);
            this.f36938i0 = z6Var3;
            z6Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, i18));
            this.Z.addView(this.f36938i0, k7.c6.n(-1, -2));
        } else {
            org.telegram.ui.Cells.z6 z6Var4 = this.f36938i0;
            int i19 = R.drawable.greydivider_bottom;
            int i20 = org.telegram.ui.ActionBar.k6.f21624b7;
            z6Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, i19, i20));
            if (this.f36959s0 && this.C != null) {
                this.f36942k0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, i20));
            }
        }
        S1(0);
        S1(4);
    }

    public final void c1() {
        if (getParentActivity() != null && this.O0 == null) {
            org.telegram.ui.Components.mi miVar = new org.telegram.ui.Components.mi(getParentActivity(), this, false, false);
            this.O0 = miVar;
            miVar.W1 = new km0(this);
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fn0.createView(android.content.Context):android.view.View");
    }

    public final void d1() {
        int dp;
        int dp2;
        boolean[] zArr = {true};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new rs(29, this, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        d2Var.O = string;
        boolean z4 = this.f36959s0;
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.B;
        if (z4 && this.C == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeAddress)) {
            d2Var.Q = LocaleController.getString(R.string.PassportDeleteAddressAlert);
        } else if (z4 && this.C == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            d2Var.Q = LocaleController.getString(R.string.PassportDeletePersonalAlert);
        } else {
            d2Var.Q = LocaleController.getString(R.string.PassportDeleteDocumentAlert);
        }
        if (!this.f36959s0 && this.C != null) {
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(getParentActivity(), 1);
            z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(false));
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                z1Var.e(LocaleController.getString(R.string.PassportDeleteDocumentAddress), "", true, false, false);
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                z1Var.e(LocaleController.getString(R.string.PassportDeleteDocumentPersonal), "", true, false, false);
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
            z1Var.setPadding(dp, 0, dp2, 0);
            frameLayout.addView(z1Var, k7.c6.e(-1, 48, 51));
            z1Var.setOnClickListener(new o8(4, zArr));
            alertDialog$Builder.n(frameLayout);
        }
        showDialog(d2Var);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        EditTextBoldCursor editTextBoldCursor;
        dn0 dn0Var;
        org.telegram.ui.ActionBar.w0 w0Var;
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            HashMap hashMap = this.l1;
            SecureDocument secureDocument = (SecureDocument) hashMap.get(str);
            if (secureDocument != null) {
                secureDocument.inputFile = (TLRPC.TL_inputFile) objArr[1];
                hashMap.remove(str);
                if (hashMap.isEmpty() && (w0Var = this.I) != null) {
                    w0Var.setEnabled(true);
                    this.I.setAlpha(1.0f);
                }
                HashMap hashMap2 = this.f36943k1;
                if (hashMap2 != null && (dn0Var = (dn0) hashMap2.get(secureDocument)) != null) {
                    dn0Var.a(true);
                }
                HashMap hashMap3 = this.f36966v1;
                if (hashMap3 != null && hashMap3.containsKey("error_document_all")) {
                    hashMap3.remove("error_document_all");
                    a1(false);
                }
                int i12 = secureDocument.type;
                if (i12 == 0) {
                    if (this.f36942k0 != null && !TextUtils.isEmpty(this.f36969w1)) {
                        this.f36942k0.setText(this.f36969w1);
                    }
                    hashMap3.remove("files_all");
                } else if (i12 == 4) {
                    if (this.f36944l0 != null && !TextUtils.isEmpty(this.f36972x1)) {
                        this.f36944l0.setText(this.f36972x1);
                    }
                    hashMap3.remove("translation_all");
                }
            }
        } else if (i10 != NotificationCenter.fileUploadFailed && i10 == NotificationCenter.twoStepPasswordChanged) {
            if (objArr != null && objArr.length > 0) {
                Object obj = objArr[7];
                if (obj != null && (editTextBoldCursor = this.V[0]) != null) {
                    editTextBoldCursor.setText((String) obj);
                }
                if (objArr[6] == null) {
                    TL_account.TL_password tL_password = new TL_account.TL_password();
                    this.G = tL_password;
                    tL_password.current_algo = (TLRPC.PasswordKdfAlgo) objArr[1];
                    tL_password.new_secure_algo = (TLRPC.SecurePasswordKdfAlgo) objArr[2];
                    tL_password.secure_random = (byte[]) objArr[3];
                    tL_password.has_recovery = !TextUtils.isEmpty((String) objArr[4]);
                    TL_account.Password password = this.G;
                    password.hint = (String) objArr[5];
                    password.srp_id = -1L;
                    byte[] bArr = new byte[256];
                    password.srp_B = bArr;
                    Utilities.random.nextBytes(bArr);
                    EditTextBoldCursor editTextBoldCursor2 = this.V[0];
                    if (editTextBoldCursor2 != null && editTextBoldCursor2.length() > 0) {
                        this.K0 = 2;
                    }
                }
            } else {
                this.G = null;
                w1();
            }
            R1();
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.mi miVar = this.O0;
        if (miVar != null && this.visibleDialog == miVar) {
            miVar.f29054g0.a0(false);
            this.O0.dismissInternal();
            this.O0.f29054g0.d0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.O0 && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    public final void e1(Context context) {
        long j10;
        int i10;
        String str;
        int i11;
        String str2;
        this.V0 = new HashMap();
        ?? r42 = 1;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.V0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
        this.m0 = a9Var;
        int i12 = R.drawable.greydivider_top;
        int i13 = org.telegram.ui.ActionBar.k6.f21624b7;
        a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, i12, i13));
        boolean z4 = false;
        this.m0.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        int i14 = -1;
        this.Z.addView(this.m0, k7.c6.n(-1, -2));
        a1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.C;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.B;
        if (tL_secureRequiredType != null) {
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
            this.f36934g0 = m4Var;
            if (this.f36959s0) {
                m4Var.setText(LocaleController.getString(R.string.PassportDocuments));
            } else {
                m4Var.setText(LocaleController.getString(R.string.PassportRequiredDocuments));
            }
            org.telegram.ui.Cells.m4 m4Var2 = this.f36934g0;
            int i15 = org.telegram.ui.ActionBar.k6.f21659d6;
            m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
            this.Z.addView(this.f36934g0, k7.c6.n(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.f36921b0 = linearLayout;
            linearLayout.setOrientation(1);
            this.Z.addView(this.f36921b0, k7.c6.n(-1, -2));
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            this.R = z8Var;
            z8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
            this.Z.addView(this.R, k7.c6.n(-1, -2));
            this.R.setOnClickListener(new ql0(this, 0));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.f36924c0 = linearLayout2;
            linearLayout2.setOrientation(1);
            this.Z.addView(this.f36924c0, k7.c6.n(-1, -2));
            boolean z10 = this.C.selfie_required;
            org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
            this.S = z8Var2;
            z8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
            j10 = 0;
            this.S.a(LocaleController.getString(R.string.PassportReverseSide), LocaleController.getString(R.string.PassportReverseSideInfo), z10);
            this.Z.addView(this.S, k7.c6.n(-1, -2));
            this.S.setOnClickListener(new ql0(this, 2));
            if (this.C.selfie_required) {
                LinearLayout linearLayout3 = new LinearLayout(context);
                this.f36926d0 = linearLayout3;
                linearLayout3.setOrientation(1);
                this.Z.addView(this.f36926d0, k7.c6.n(-1, -2));
                org.telegram.ui.Cells.z8 z8Var3 = new org.telegram.ui.Cells.z8(context);
                this.T = z8Var3;
                z8Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
                this.T.a(LocaleController.getString(R.string.PassportSelfie), LocaleController.getString(R.string.PassportSelfieInfo), tL_secureRequiredType2.translation_required);
                this.Z.addView(this.T, k7.c6.n(-1, -2));
                this.T.setOnClickListener(new ql0(this, 3));
            }
            org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context);
            this.f36942k0 = a9Var2;
            a9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider, i13));
            this.f36942k0.setText(LocaleController.getString(R.string.PassportPersonalUploadInfo));
            this.Z.addView(this.f36942k0, k7.c6.n(-1, -2));
            if (this.C.translation_required) {
                org.telegram.ui.Cells.m4 m4Var3 = new org.telegram.ui.Cells.m4(context);
                this.f36934g0 = m4Var3;
                m4Var3.setText(LocaleController.getString(R.string.PassportTranslation));
                this.f36934g0.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
                this.Z.addView(this.f36934g0, k7.c6.n(-1, -2));
                LinearLayout linearLayout4 = new LinearLayout(context);
                this.f36929e0 = linearLayout4;
                linearLayout4.setOrientation(1);
                this.Z.addView(this.f36929e0, k7.c6.n(-1, -2));
                org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context);
                this.U = aaVar;
                aaVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
                this.Z.addView(this.U, k7.c6.n(-1, -2));
                this.U.setOnClickListener(new ql0(this, 4));
                org.telegram.ui.Cells.a9 a9Var3 = new org.telegram.ui.Cells.a9(context);
                this.f36944l0 = a9Var3;
                a9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider, i13));
                if (this.f36923c != 0) {
                    this.f36972x1 = LocaleController.getString(R.string.PassportAddTranslationUploadInfo);
                } else {
                    TLRPC.SecureValueType secureValueType = this.C.type;
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
                        this.f36972x1 = LocaleController.getString(R.string.PassportAddPassportInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                        this.f36972x1 = LocaleController.getString(R.string.PassportAddInternalPassportInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                        this.f36972x1 = LocaleController.getString(R.string.PassportAddIdentityCardInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                        this.f36972x1 = LocaleController.getString(R.string.PassportAddDriverLicenceInfo);
                    } else {
                        this.f36972x1 = "";
                    }
                }
                String str3 = this.f36972x1;
                HashMap hashMap = this.f36964u1;
                String str4 = str3;
                if (hashMap != null) {
                    String str5 = (String) hashMap.get("translation_all");
                    str4 = str3;
                    if (str5 != null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str5);
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) this.f36972x1);
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21876p7, false)), 0, str5.length(), 33);
                        this.f36966v1.put("translation_all", "");
                        str4 = spannableStringBuilder;
                    }
                }
                this.f36944l0.setText(str4);
                this.Z.addView(this.f36944l0, k7.c6.n(-1, -2));
            }
        } else {
            j10 = 0;
            org.telegram.ui.Cells.aa aaVar2 = new org.telegram.ui.Cells.aa(context);
            this.f36949o0 = aaVar2;
            aaVar2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
            this.f36949o0.b(LocaleController.getString(R.string.PassportScanPassport), false);
            this.Z.addView(this.f36949o0, k7.c6.n(-1, -2));
            this.f36949o0.setOnClickListener(new ql0(this, 5));
            org.telegram.ui.Cells.a9 a9Var4 = new org.telegram.ui.Cells.a9(context);
            this.f36942k0 = a9Var4;
            a9Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider, i13));
            this.f36942k0.setText(LocaleController.getString(R.string.PassportScanPassportInfo));
            this.Z.addView(this.f36942k0, k7.c6.n(-1, -2));
        }
        org.telegram.ui.Cells.m4 m4Var4 = new org.telegram.ui.Cells.m4(context);
        this.f36934g0 = m4Var4;
        if (this.f36959s0) {
            m4Var4.setText(LocaleController.getString(R.string.PassportDocument));
        } else {
            m4Var4.setText(LocaleController.getString(R.string.PassportPersonal));
        }
        this.f36934g0.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
        this.Z.addView(this.f36934g0, k7.c6.n(-1, -2));
        int i16 = 7;
        if (this.C != null) {
            i10 = 9;
        } else {
            i10 = 7;
        }
        this.V = new EditTextBoldCursor[i10];
        int i17 = 0;
        while (true) {
            HashMap hashMap2 = this.f36952p1;
            if (i17 < i10) {
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.V[i17] = editTextBoldCursor;
                zl0 zl0Var = new zl0(context, editTextBoldCursor, 1);
                zl0Var.setWillNotDraw(z4);
                this.Z.addView(zl0Var, k7.c6.n(i14, 64));
                int i18 = org.telegram.ui.ActionBar.k6.f21659d6;
                zl0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i18, z4));
                if (i17 == i10 - 1) {
                    View view = new View(context);
                    this.P = view;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i18, z4));
                    this.Z.addView(this.P, k7.c6.n(i14, 6));
                }
                if (this.f36959s0 && this.C != null && i17 < i16) {
                    zl0Var.setVisibility(8);
                    View view2 = this.P;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                }
                this.V[i17].setTag(Integer.valueOf(i17));
                this.V[i17].setSupportRtlHint(r42);
                this.V[i17].setTextSize(r42, 16.0f);
                this.V[i17].setHintColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.H6, false));
                EditTextBoldCursor editTextBoldCursor2 = this.V[i17];
                int i19 = org.telegram.ui.ActionBar.k6.G6;
                editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i19, false));
                this.V[i17].setHeaderHintColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.L6, false));
                this.V[i17].setTransformHintToHeader(r42);
                this.V[i17].setBackgroundDrawable(null);
                this.V[i17].setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i19, false));
                this.V[i17].setCursorSize(AndroidUtilities.dp(20.0f));
                this.V[i17].setCursorWidth(1.5f);
                this.V[i17].setLineColors(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21785k6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21803l6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21876p7, false));
                int i20 = 5;
                if (i17 != 5 && i17 != 6) {
                    if (i17 != 3 && i17 != 8) {
                        if (i17 == 4) {
                            this.V[i17].setOnTouchListener(new rl0(this, 1));
                            this.V[i17].setInputType(0);
                            this.V[i17].setFocusable(false);
                        } else {
                            this.V[i17].setInputType(16385);
                            this.V[i17].setImeOptions(268435461);
                        }
                    } else {
                        this.V[i17].setOnTouchListener(new org.telegram.ui.ActionBar.i1(6, this, context));
                        this.V[i17].setInputType(0);
                        this.V[i17].setFocusable(false);
                    }
                } else {
                    this.V[i17].setOnTouchListener(new rl0(this, 0));
                    this.V[i17].setInputType(0);
                }
                HashMap hashMap3 = this.f36954q1;
                switch (i17) {
                    case 0:
                        if (tL_secureRequiredType2.native_names) {
                            this.V[i17].setHintText(LocaleController.getString(R.string.PassportNameLatin));
                        } else {
                            this.V[i17].setHintText(LocaleController.getString(R.string.PassportName));
                        }
                        str2 = "first_name";
                        break;
                    case 1:
                        if (tL_secureRequiredType2.native_names) {
                            this.V[i17].setHintText(LocaleController.getString(R.string.PassportMidnameLatin));
                        } else {
                            this.V[i17].setHintText(LocaleController.getString(R.string.PassportMidname));
                        }
                        str2 = "middle_name";
                        break;
                    case 2:
                        if (tL_secureRequiredType2.native_names) {
                            this.V[i17].setHintText(LocaleController.getString(R.string.PassportSurnameLatin));
                        } else {
                            this.V[i17].setHintText(LocaleController.getString(R.string.PassportSurname));
                        }
                        str2 = "last_name";
                        break;
                    case 3:
                        this.V[i17].setHintText(LocaleController.getString(R.string.PassportBirthdate));
                        str2 = "birth_date";
                        break;
                    case 4:
                        this.V[i17].setHintText(LocaleController.getString(R.string.PassportGender));
                        str2 = "gender";
                        break;
                    case 5:
                        this.V[i17].setHintText(LocaleController.getString(R.string.PassportCitizenship));
                        str2 = "country_code";
                        break;
                    case 6:
                        this.V[i17].setHintText(LocaleController.getString(R.string.PassportResidence));
                        str2 = "residence_country_code";
                        break;
                    case 7:
                        this.V[i17].setHintText(LocaleController.getString(R.string.PassportDocumentNumber));
                        str2 = "document_no";
                        hashMap2 = hashMap3;
                        break;
                    case 8:
                        this.V[i17].setHintText(LocaleController.getString(R.string.PassportExpired));
                        str2 = "expiry_date";
                        hashMap2 = hashMap3;
                        break;
                    default:
                        i17++;
                        r42 = 1;
                        i16 = 7;
                        z4 = false;
                        i14 = -1;
                }
                J1(hashMap2, this.V[i17], str2);
                EditTextBoldCursor editTextBoldCursor3 = this.V[i17];
                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                if (i17 != 0 && i17 != 2 && i17 != 1) {
                    this.V[i17].addTextChangedListener(new org.telegram.ui.Components.lx0(this, editTextBoldCursor, str2, hashMap2));
                } else {
                    this.V[i17].addTextChangedListener(new dm0(this, editTextBoldCursor, str2));
                }
                this.V[i17].setPadding(0, 0, 0, 0);
                EditTextBoldCursor editTextBoldCursor4 = this.V[i17];
                if (!LocaleController.isRTL) {
                    i20 = 3;
                }
                editTextBoldCursor4.setGravity(i20 | 16);
                zl0Var.addView(this.V[i17], k7.c6.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                this.V[i17].setOnEditorActionListener(new ol0(this, 1));
                i17++;
                r42 = 1;
                i16 = 7;
                z4 = false;
                i14 = -1;
            } else {
                org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (b) null);
                this.f36940j0 = z6Var;
                this.Z.addView(z6Var, k7.c6.n(-1, -2));
                org.telegram.ui.Cells.m4 m4Var5 = new org.telegram.ui.Cells.m4(context);
                this.f36934g0 = m4Var5;
                m4Var5.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
                this.Z.addView(this.f36934g0, k7.c6.n(-1, -2));
                this.X = new EditTextBoldCursor[3];
                int i21 = 0;
                for (int i22 = 3; i21 < i22; i22 = 3) {
                    EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
                    this.X[i21] = editTextBoldCursor5;
                    zl0 zl0Var2 = new zl0(context, editTextBoldCursor5, 2);
                    zl0Var2.setWillNotDraw(false);
                    this.Z.addView(zl0Var2, k7.c6.n(-1, 64));
                    int i23 = org.telegram.ui.ActionBar.k6.f21659d6;
                    zl0Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i23, false));
                    if (i21 == 2) {
                        View view3 = new View(context);
                        this.Q = view3;
                        view3.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i23, false));
                        this.Z.addView(this.Q, k7.c6.n(-1, 6));
                    }
                    this.X[i21].setTag(Integer.valueOf(i21));
                    this.X[i21].setSupportRtlHint(true);
                    this.X[i21].setTextSize(1, 16.0f);
                    this.X[i21].setHintColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.H6, false));
                    EditTextBoldCursor editTextBoldCursor6 = this.X[i21];
                    int i24 = org.telegram.ui.ActionBar.k6.G6;
                    editTextBoldCursor6.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i24, false));
                    this.X[i21].setHeaderHintColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.L6, false));
                    this.X[i21].setTransformHintToHeader(true);
                    this.X[i21].setBackgroundDrawable(null);
                    this.X[i21].setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i24, false));
                    this.X[i21].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.X[i21].setCursorWidth(1.5f);
                    this.X[i21].setLineColors(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21785k6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21803l6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21876p7, false));
                    this.X[i21].setInputType(16385);
                    this.X[i21].setImeOptions(268435461);
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
                    J1(hashMap2, this.X[i21], str);
                    EditTextBoldCursor editTextBoldCursor7 = this.X[i21];
                    editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
                    if (i21 == 0 || i21 == 2 || i21 == 1) {
                        this.X[i21].addTextChangedListener(new bm0(this, editTextBoldCursor5, str, 1));
                    }
                    this.X[i21].setPadding(0, 0, 0, 0);
                    EditTextBoldCursor editTextBoldCursor8 = this.X[i21];
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    editTextBoldCursor8.setGravity(i11 | 16);
                    zl0Var2.addView(this.X[i21], k7.c6.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.X[i21].setOnEditorActionListener(new ol0(this, 2));
                    i21++;
                }
                org.telegram.ui.Cells.a9 a9Var5 = new org.telegram.ui.Cells.a9(context);
                this.f36947n0 = a9Var5;
                this.Z.addView(a9Var5, k7.c6.n(-1, -2));
                long j11 = this.f36923c;
                TLRPC.TL_secureValue tL_secureValue = this.F;
                if (((j11 != j10 || this.C == null) && this.E != null && !this.f36959s0) || tL_secureValue != null) {
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
                    org.telegram.ui.Cells.aa aaVar3 = new org.telegram.ui.Cells.aa(context);
                    aaVar3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21876p7, false));
                    aaVar3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
                    if (this.C == null) {
                        aaVar3.b(LocaleController.getString(R.string.PassportDeleteInfo), false);
                    } else {
                        aaVar3.b(LocaleController.getString(R.string.PassportDeleteDocument), false);
                    }
                    this.Z.addView(aaVar3, k7.c6.n(-1, -2));
                    aaVar3.setOnClickListener(new ql0(this, 1));
                    org.telegram.ui.Cells.a9 a9Var6 = this.f36947n0;
                    int i25 = R.drawable.greydivider;
                    int i26 = org.telegram.ui.ActionBar.k6.f21624b7;
                    a9Var6.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, i25, i26));
                    org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(context, (b) null);
                    this.f36938i0 = z6Var2;
                    z6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, i26));
                    this.Z.addView(this.f36938i0, k7.c6.n(-1, -2));
                } else {
                    this.f36947n0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21624b7));
                }
                P1();
                Y0(false);
                return;
            }
        }
    }

    public final void f1(android.content.Context r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fn0.f1(android.content.Context):void");
    }

    public final void g1(Context context) {
        String str;
        ViewGroup frameLayout;
        this.actionBar.setTitle(LocaleController.getString(R.string.PassportPhone));
        this.V0 = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.R0.add(0, split[2]);
                this.S0.put(split[2], split[0]);
                this.T0.put(split[0], split[2]);
                if (split.length > 3) {
                    this.U0.put(split[0], split[3]);
                }
                this.V0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        Collections.sort(this.R0, new e5.f(13));
        String str2 = UserConfig.getInstance(this.currentAccount).getCurrentUser().phone;
        org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context);
        String str3 = null;
        aaVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21894q6, false));
        aaVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
        int i10 = R.string.PassportPhoneUseSame;
        se.b c3 = se.b.c();
        aaVar.b(LocaleController.formatString("PassportPhoneUseSame", i10, c3.b("+" + str2)), false);
        this.Z.addView(aaVar, k7.c6.n(-1, -2));
        aaVar.setOnClickListener(new ql0(this, 16));
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
        this.f36942k0 = a9Var;
        a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21624b7));
        this.f36942k0.setText(LocaleController.getString(R.string.PassportPhoneUseSameInfo));
        this.Z.addView(this.f36942k0, k7.c6.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        this.f36934g0 = m4Var;
        m4Var.setText(LocaleController.getString(R.string.PassportPhoneUseOther));
        this.f36934g0.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
        this.Z.addView(this.f36934g0, k7.c6.n(-1, -2));
        this.V = new EditTextBoldCursor[3];
        for (int i11 = 0; i11 < 3; i11++) {
            if (i11 == 2) {
                this.V[i11] = new org.telegram.ui.Components.j40(context);
            } else {
                this.V[i11] = new EditTextBoldCursor(context);
            }
            if (i11 == 1) {
                frameLayout = org.telegram.messenger.y3.f(context, 0);
                this.Z.addView(frameLayout, k7.c6.n(-1, 50));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
            } else if (i11 == 2) {
                frameLayout = (ViewGroup) this.V[1].getParent();
            } else {
                frameLayout = new FrameLayout(context);
                this.Z.addView(frameLayout, k7.c6.n(-1, 50));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
            }
            this.V[i11].setTag(Integer.valueOf(i11));
            this.V[i11].setTextSize(1, 16.0f);
            this.V[i11].setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.V[i11];
            int i12 = org.telegram.ui.ActionBar.k6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
            this.V[i11].setBackgroundDrawable(null);
            this.V[i11].setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
            this.V[i11].setCursorSize(AndroidUtilities.dp(20.0f));
            this.V[i11].setCursorWidth(1.5f);
            if (i11 == 0) {
                this.V[i11].setOnTouchListener(new rl0(this, 3));
                this.V[i11].setText(LocaleController.getString(R.string.ChooseCountry));
                this.V[i11].setInputType(0);
                this.V[i11].setFocusable(false);
            } else {
                this.V[i11].setInputType(3);
                if (i11 == 2) {
                    this.V[i11].setImeOptions(268435462);
                } else {
                    this.V[i11].setImeOptions(268435461);
                }
            }
            EditTextBoldCursor editTextBoldCursor2 = this.V[i11];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            int i13 = 5;
            if (i11 == 1) {
                TextView textView = new TextView(context);
                this.f36961t0 = textView;
                textView.setText("+");
                this.f36961t0.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
                this.f36961t0.setTextSize(1, 16.0f);
                frameLayout.addView(this.f36961t0, k7.c6.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                this.V[i11].setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
                this.V[i11].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                this.V[i11].setGravity(19);
                frameLayout.addView(this.V[i11], k7.c6.k(0.0f, 12.0f, 16.0f, 6.0f, 55, -2));
                this.V[i11].addTextChangedListener(new sm0(this));
            } else if (i11 == 2) {
                this.V[i11].setPadding(0, 0, 0, 0);
                this.V[i11].setGravity(19);
                this.V[i11].setHintText(null);
                this.V[i11].setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                frameLayout.addView(this.V[i11], k7.c6.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                this.V[i11].addTextChangedListener(new yr(this, 3));
            } else {
                this.V[i11].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                EditTextBoldCursor editTextBoldCursor3 = this.V[i11];
                if (!LocaleController.isRTL) {
                    i13 = 3;
                }
                editTextBoldCursor3.setGravity(i13);
                frameLayout.addView(this.V[i11], k7.c6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            }
            this.V[i11].setOnEditorActionListener(new ol0(this, 0));
            if (i11 == 2) {
                this.V[i11].setOnKeyListener(new og(this, 1));
            }
            if (i11 == 0) {
                View view = new View(context);
                this.f36936h0.add(view);
                view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21660d7, false));
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, 1, 83));
            }
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (telephonyManager != null) {
                str3 = telephonyManager.getSimCountryIso().toUpperCase();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (str3 != null && (str = (String) this.V0.get(str3)) != null && this.R0.indexOf(str) != -1) {
            this.V[1].setText((CharSequence) this.S0.get(str));
        }
        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context);
        this.f36942k0 = a9Var2;
        a9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21624b7));
        this.f36942k0.setText(LocaleController.getString(R.string.PassportPhoneUploadInfo));
        this.Z.addView(this.f36942k0, k7.c6.n(-1, -2));
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21605a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21930s8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Y, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21981v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21946t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.k6.D8));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21779k0, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
        View view = this.P;
        int i12 = org.telegram.ui.ActionBar.k6.f21659d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(view, 1, null, null, null, null, i12));
        View view2 = this.Q;
        if (view2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(view2, 1, null, null, null, null, i12));
        }
        int i13 = 0;
        while (true) {
            ArrayList arrayList2 = this.f36936h0;
            if (i13 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.m6((View) arrayList2.get(i13), 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
            i13++;
        }
        for (Map.Entry entry : this.f36943k1.entrySet()) {
            dn0 dn0Var = (dn0) entry.getValue();
            arrayList.add(new org.telegram.ui.ActionBar.m6(dn0Var, 268435456, new Class[]{dn0.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21659d6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(dn0Var, 0, new Class[]{dn0.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(dn0Var, 0, new Class[]{dn0.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22053z6));
        }
        int i14 = org.telegram.ui.ActionBar.k6.f21659d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 268435456, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.k6.f22053z6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"valueTextView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 268435456, new Class[]{org.telegram.ui.Cells.aa.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.I6));
        int i17 = org.telegram.ui.ActionBar.k6.f21624b7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 268435456, new Class[]{en0.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 4, new Class[]{en0.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 4, new Class[]{en0.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 4, new Class[]{en0.class}, new String[]{"valueTextView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 8, new Class[]{en0.class}, new String[]{"checkImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 16, new Class[]{org.telegram.ui.Cells.m4.class}, null, null, null, i14));
        int i18 = org.telegram.ui.ActionBar.k6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        if (this.V != null) {
            int i19 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.V;
                if (i19 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.m6((View) editTextBoldCursorArr[i19].getParent(), 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21659d6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.V[i19], 16777220, null, null, null, null, org.telegram.ui.ActionBar.k6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.V[i19], 8388608, null, null, null, null, org.telegram.ui.ActionBar.k6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.V[i19], 8390656, null, null, null, null, org.telegram.ui.ActionBar.k6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.V[i19], 32, null, null, null, null, org.telegram.ui.ActionBar.k6.f21785k6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.V[i19], 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.f21803l6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.V[i19], 2080, null, null, null, null, org.telegram.ui.ActionBar.k6.f21876p7));
                i19++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 4, null, null, null, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 8388608, null, null, null, null, org.telegram.ui.ActionBar.k6.H6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 8390656, null, null, null, null, i18));
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.f21785k6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.f21803l6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 2080, null, null, null, null, org.telegram.ui.ActionBar.k6.f21876p7));
        }
        if (this.X != null) {
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.X;
                if (i11 >= editTextBoldCursorArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.m6((View) editTextBoldCursorArr2[i11].getParent(), 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21659d6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.X[i11], 16777220, null, null, null, null, org.telegram.ui.ActionBar.k6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.X[i11], 8388608, null, null, null, null, org.telegram.ui.ActionBar.k6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.X[i11], 8390656, null, null, null, null, org.telegram.ui.ActionBar.k6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.X[i11], 32, null, null, null, null, org.telegram.ui.ActionBar.k6.f21785k6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.X[i11], 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.f21803l6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.X[i11], 2080, null, null, null, null, org.telegram.ui.ActionBar.k6.f21876p7));
                i11++;
            }
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.C0, 2048, null, null, null, null, org.telegram.ui.ActionBar.k6.f21732h6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.F0, 8, null, null, null, null, org.telegram.ui.ActionBar.k6.Xd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.G0, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.H0, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.f21912r6));
        TextView textView = this.J0;
        int i20 = org.telegram.ui.ActionBar.k6.f21894q6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(textView, 4, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36961t0, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.L, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.f21953th));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.N, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.f21921rh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.N, 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.f21937sh));
        org.telegram.ui.Components.tq tqVar = this.K;
        int i21 = org.telegram.ui.ActionBar.k6.D7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(tqVar, 0, null, null, null, null, i21));
        org.telegram.ui.Components.tq tqVar2 = this.K;
        int i22 = org.telegram.ui.ActionBar.k6.E7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(tqVar2, 0, null, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.M, 0, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.M, 0, null, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36974y0, 8, null, null, null, null, org.telegram.ui.ActionBar.k6.Ci));
        TextView textView2 = this.f36976z0;
        int i23 = org.telegram.ui.ActionBar.k6.f22053z6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(textView2, 4, null, null, null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.A0, 4, null, null, null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B0, 4, null, null, null, null, i20));
        return arrayList;
    }

    public final byte[] i1(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32 || bArr2 == null || bArr2.length != 32) {
            return null;
        }
        byte[] bArr3 = new byte[32];
        System.arraycopy(this.f36922b1, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(this.f36922b1, 32, bArr4, 0, 16);
        byte[] bArr5 = new byte[32];
        System.arraycopy(this.Z0, 0, bArr5, 0, 32);
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

    public final void j1(final TLRPC.TL_secureRequiredType tL_secureRequiredType, final TLRPC.TL_secureRequiredType tL_secureRequiredType2, final ArrayList arrayList, final boolean z4, final pl0 pl0Var, final sl0 sl0Var, final boolean z10) {
        if (tL_secureRequiredType == null) {
            return;
        }
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        if (z10 && tL_secureRequiredType2 != null) {
            deletesecurevalue.types.add(tL_secureRequiredType2.type);
        } else {
            if (z4) {
                deletesecurevalue.types.add(tL_secureRequiredType.type);
            }
            if (tL_secureRequiredType2 != null) {
                deletesecurevalue.types.add(tL_secureRequiredType2.type);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(deletesecurevalue, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                final fn0 fn0Var = fn0.this;
                final tm0 tm0Var = sl0Var;
                final boolean z11 = z10;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType3 = tL_secureRequiredType2;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                final boolean z12 = z4;
                final ArrayList arrayList2 = arrayList;
                final Runnable runnable = pl0Var;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        int i10;
                        TLRPC.TL_secureData tL_secureData;
                        String str2;
                        LinearLayout linearLayout;
                        fn0 fn0Var2 = fn0.this;
                        TLRPC.TL_error tL_error2 = tL_error;
                        String str3 = null;
                        if (tL_error2 != null) {
                            tm0 tm0Var2 = tm0Var;
                            if (tm0Var2 != null) {
                                tm0Var2.C(tL_error2.text, null);
                            }
                            fn0Var2.M1(LocaleController.getString(R.string.AppName), tL_error2.text);
                            return;
                        }
                        boolean z13 = z11;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType3;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType4;
                        boolean z14 = z12;
                        if (z13) {
                            if (tL_secureRequiredType5 != null) {
                                fn0Var2.H1(tL_secureRequiredType5);
                            } else {
                                fn0Var2.H1(tL_secureRequiredType6);
                            }
                        } else {
                            if (z14) {
                                fn0Var2.H1(tL_secureRequiredType6);
                            }
                            fn0Var2.H1(tL_secureRequiredType5);
                        }
                        int i11 = 0;
                        if (fn0Var2.f36920b == 8) {
                            en0 en0Var = (en0) fn0Var2.f36948n1.remove(tL_secureRequiredType6);
                            if (en0Var != null) {
                                fn0Var2.Z.removeView(en0Var);
                                View childAt = fn0Var2.Z.getChildAt(linearLayout.getChildCount() - 6);
                                if (childAt instanceof en0) {
                                    ((en0) childAt).setNeedDivider(false);
                                }
                            }
                            fn0Var2.Q1();
                        } else {
                            ArrayList arrayList3 = arrayList2;
                            if (tL_secureRequiredType5 != null && arrayList3 != null && arrayList3.size() > 1) {
                                int size = arrayList3.size();
                                int i12 = 0;
                                while (true) {
                                    if (i12 < size) {
                                        TLRPC.TL_secureRequiredType tL_secureRequiredType7 = (TLRPC.TL_secureRequiredType) arrayList3.get(i12);
                                        TLRPC.TL_secureValue r12 = fn0Var2.r1(tL_secureRequiredType7, false);
                                        if (r12 != null) {
                                            TLRPC.TL_secureData tL_secureData2 = r12.data;
                                            if (tL_secureData2 != null) {
                                                str2 = fn0.h1(tL_secureData2.data, fn0Var2.i1(tL_secureData2.secret, tL_secureData2.data_hash), r12.data.data_hash);
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
                            if (z14) {
                                if (arrayList3 != null) {
                                    i11 = arrayList3.size();
                                }
                                fn0Var2.L1(tL_secureRequiredType6, null, null, tL_secureRequiredType5, str, z13, i11);
                            } else {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType8 = tL_secureRequiredType5;
                                String str4 = str;
                                TLRPC.TL_secureValue r13 = fn0Var2.r1(tL_secureRequiredType6, false);
                                if (r13 != null && (tL_secureData = r13.data) != null) {
                                    str3 = fn0.h1(tL_secureData.data, fn0Var2.i1(tL_secureData.secret, tL_secureData.data_hash), r13.data.data_hash);
                                }
                                if (arrayList3 != null) {
                                    i10 = arrayList3.size();
                                } else {
                                    i10 = 0;
                                }
                                fn0Var2.L1(tL_secureRequiredType6, null, str3, tL_secureRequiredType8, str4, z13, i10);
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

    public final c5.j k1(byte[] bArr) {
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
        System.arraycopy(this.f36922b1, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(this.f36922b1, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(this.Z0, 0, bArr8, 0, 32);
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
        obj.f2317c = bArr3;
        obj.f2315a = bArr11;
        obj.d = computeSHA256;
        obj.f2316b = p12;
        obj.f2318e = new SecureDocumentKey(bArr4, bArr5);
        return obj;
    }

    public final void l1(Bundle bundle, TLRPC.TL_auth_sentCode tL_auth_sentCode, boolean z4) {
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
            K1(bundle, 2, z4);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", tL_auth_sentCode.type.pattern);
            K1(bundle, 1, z4);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSms) {
            bundle.putInt("type", 2);
            bundle.putInt("length", tL_auth_sentCode.type.length);
            K1(bundle, 0, z4);
        }
    }

    public final String m1() {
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.V;
            if (i10 >= editTextBoldCursorArr.length) {
                break;
            }
            sb.append((CharSequence) editTextBoldCursorArr[i10].getText());
            sb.append(",");
            i10++;
        }
        if (this.X != null) {
            int i11 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.X;
                if (i11 >= editTextBoldCursorArr2.length) {
                    break;
                }
                sb.append((CharSequence) editTextBoldCursorArr2[i11].getText());
                sb.append(",");
                i11++;
            }
        }
        ArrayList arrayList = this.f36933f1;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            sb.append(((SecureDocument) arrayList.get(i12)).secureFile.f20978id);
        }
        SecureDocument secureDocument = this.f36939i1;
        if (secureDocument != null) {
            sb.append(secureDocument.secureFile.f20978id);
        }
        SecureDocument secureDocument2 = this.f36941j1;
        if (secureDocument2 != null) {
            sb.append(secureDocument2.secureFile.f20978id);
        }
        SecureDocument secureDocument3 = this.f36935g1;
        if (secureDocument3 != null) {
            sb.append(secureDocument3.secureFile.f20978id);
        }
        ArrayList arrayList2 = this.f36937h1;
        int size2 = arrayList2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            sb.append(((SecureDocument) arrayList2.get(i13)).secureFile.f20978id);
        }
        return sb.toString();
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
            org.telegram.ui.Components.mi miVar = this.O0;
            if (miVar != null) {
                miVar.f29054g0.g0(i10, intent, this.N0);
            }
            this.N0 = null;
        }
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        int i10 = this.f36920b;
        if (i10 == 7) {
            if (z4) {
                int i11 = this.F1;
                org.telegram.ui.Components.wv0[] wv0VarArr = this.G1;
                wv0VarArr[i11].c(true);
                for (org.telegram.ui.Components.wv0 wv0Var : wv0VarArr) {
                    if (wv0Var != null) {
                        wv0Var.f();
                    }
                }
            }
        } else if (i10 != 0 && i10 != 5) {
            if (i10 == 1 || i10 == 2) {
                return !X0(z4);
            }
        } else if (z4) {
            W0(false);
        }
        return true;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        if (this.f36920b == 3 && Build.VERSION.SDK_INT >= 23 && dialog == this.I1) {
            ArrayList arrayList = this.J1;
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
        org.telegram.ui.Components.mi miVar = this.O0;
        if (miVar != null) {
            miVar.dismissInternal();
            this.O0.v1();
        }
        if (this.f36920b == 7) {
            while (true) {
                org.telegram.ui.Components.wv0[] wv0VarArr = this.G1;
                if (i10 >= wv0VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.wv0 wv0Var = wv0VarArr[i10];
                if (wv0Var != null) {
                    wv0Var.f();
                }
                i10++;
            }
            org.telegram.ui.ActionBar.d2 d2Var = this.H1;
            if (d2Var != null) {
                try {
                    d2Var.dismiss();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                this.H1 = null;
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.mi miVar = this.O0;
        if (miVar != null) {
            miVar.x1();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.mi miVar;
        org.telegram.ui.Cells.aa aaVar;
        int i11 = this.f36920b;
        if ((i11 == 1 || i11 == 2) && (miVar = this.O0) != null) {
            if (i10 == 17) {
                miVar.f29054g0.U(false);
            } else if (i10 == 21) {
                if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.PermissionNoAudioVideoWithHint);
                    alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new sl0(this, 0));
                    l.d.C(R.string.OK, alertDialog$Builder, null);
                }
            } else if (i10 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                F1(0);
            } else if (i10 == 22 && iArr != null && iArr.length > 0 && iArr[0] == 0 && (aaVar = this.f36949o0) != null) {
                aaVar.callOnClick();
            }
        } else if (i11 == 3 && i10 == 6) {
            O1(false, this.B1, this.C1, this.D1, this.E1);
        }
    }

    @Override
    public final void onResume() {
        ViewGroup[] viewGroupArr;
        ViewGroup viewGroup;
        super.onResume();
        org.telegram.ui.Components.mi miVar = this.O0;
        if (miVar != null) {
            miVar.y1();
        }
        if (this.f36920b == 5 && (viewGroupArr = this.W) != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
            this.V[0].requestFocus();
            AndroidUtilities.showKeyboard(this.V[0]);
            AndroidUtilities.runOnUIThread(new pl0(this, 0), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (this.f36930e1 != null) {
            AndroidUtilities.runOnUIThread(new pl0(this, 1));
        }
        int i10 = this.f36920b;
        if (i10 == 5) {
            if (z4) {
                if (this.W[0].getVisibility() == 0) {
                    this.V[0].requestFocus();
                    AndroidUtilities.showKeyboard(this.V[0]);
                }
                if (this.K0 == 2) {
                    B1(false);
                }
            }
        } else if (i10 == 7) {
            if (z4) {
                this.G1[this.F1].j();
            }
        } else if (i10 == 4) {
            if (z4) {
                this.V[0].requestFocus();
                AndroidUtilities.showKeyboard(this.V[0]);
            }
        } else if (i10 == 6) {
            if (z4) {
                this.V[0].requestFocus();
                AndroidUtilities.showKeyboard(this.V[0]);
            }
        } else if (i10 != 2 && i10 != 1) {
        } else {
            c1();
        }
    }

    public final TLRPC.TL_secureValue r1(TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z4) {
        String[] strArr;
        if (tL_secureRequiredType != null) {
            int size = this.f36973y.values.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.TL_secureValue tL_secureValue = this.f36973y.values.get(i10);
                if (tL_secureRequiredType.type.getClass() == tL_secureValue.type.getClass()) {
                    if (z4) {
                        if (!tL_secureRequiredType.selfie_required || (tL_secureValue.selfie instanceof TLRPC.TL_secureFile)) {
                            if (!tL_secureRequiredType.translation_required || !tL_secureValue.translation.isEmpty()) {
                                if (!t1(tL_secureRequiredType.type) || !tL_secureValue.files.isEmpty()) {
                                    if (!v1(tL_secureRequiredType.type) || (tL_secureValue.front_side instanceof TLRPC.TL_secureFile)) {
                                        TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
                                        if ((!(secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) && !(secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard)) || (tL_secureValue.reverse_side instanceof TLRPC.TL_secureFile)) {
                                            boolean z10 = secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails;
                                            if (z10 || (secureValueType instanceof TLRPC.TL_secureValueTypeAddress)) {
                                                if (z10) {
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
        this.N0 = bundle.getString("path");
    }

    public final boolean s1(Class cls) {
        int size = this.f36973y.values.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f36973y.values.get(i10).type.getClass() == cls) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.N0;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final boolean u1() {
        String str = this.f36917a;
        if (str != null && !str.equals(m1())) {
            return false;
        }
        return true;
    }

    public final void w1() {
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new tl0(this, 3)), this.classGuid);
    }

    public final void x1() {
        org.telegram.ui.ActionBar.d2 d2Var = this.H1;
        if (d2Var == null) {
            return;
        }
        try {
            d2Var.dismiss();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        this.H1 = null;
    }

    public final void y1() {
        if (getParentActivity() != null && !getParentActivity().isFinishing() && this.H1 == null) {
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
            this.H1 = d2Var;
            d2Var.f21241d0 = false;
            d2Var.show();
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

    public fn0(int i10, long j10, String str, String str2, String str3, String str4, String str5, TL_account.authorizationForm authorizationform, TL_account.Password password) {
        this(i10, authorizationform, password, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (HashMap) null, (HashMap) null);
        int i11;
        String o12;
        String str6;
        String str7;
        String str8;
        String str9;
        this.f36923c = j10;
        this.d = str3;
        this.f36928e = str4;
        this.h = str;
        this.f36955r = str2;
        this.f36946n = str5;
        if (i10 != 0 || authorizationform.errors.isEmpty()) {
            return;
        }
        try {
            Collections.sort(authorizationform.errors, new lm0(this));
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
                HashMap hashMap = (HashMap) this.f36957r1.get(o12);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    i11 = size;
                    this.f36957r1.put(o12, hashMap);
                    this.f36960s1.put(o12, str6);
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
