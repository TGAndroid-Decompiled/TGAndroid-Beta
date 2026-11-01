package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
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
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jl0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public LinearLayout A0;
    public String A1;
    public ImageView B0;
    public zk0 B1;
    public TextView C0;
    public boolean C1;
    public TL_account.authorizationForm D;
    public TextView D0;
    public final jk0 D1;
    public final TLRPC.TL_secureRequiredType E;
    public TextView E0;
    public String E1;
    public TLRPC.TL_secureRequiredType F;
    public org.telegram.ui.Components.xy F0;
    public Runnable F1;
    public ArrayList G;
    public org.telegram.ui.Cells.b9 G0;
    public xk0 G1;
    public final TLRPC.TL_secureValue H;
    public org.telegram.ui.Cells.b9 H0;
    public zk0 H1;
    public final TLRPC.TL_secureValue I;
    public ImageView I0;
    public int I1;
    public TL_account.Password J;
    public TextView J0;
    public final org.telegram.ui.Components.av0[] J1;
    public TLRPC.TL_auth_sentCode K;
    public TextView K0;
    public org.telegram.ui.ActionBar.x1 K1;
    public org.telegram.ui.ActionBar.t0 L;
    public FrameLayout L0;
    public Dialog L1;
    public AnimatorSet M;
    public TextView M0;
    public final ArrayList M1;
    public org.telegram.ui.Components.iq N;
    public int N0;
    public int N1;
    public TextView O;
    public final byte[] O0;
    public int O1;
    public org.telegram.ui.Components.iq P;
    public final byte[] P0;
    public int P1;
    public FrameLayout Q;
    public String Q0;
    public org.telegram.ui.Cells.x9 R;
    public org.telegram.ui.Components.bi R0;
    public View S;
    public int S0;
    public View T;
    public int T0;
    public org.telegram.ui.Cells.a9 U;
    public final ArrayList U0;
    public org.telegram.ui.Cells.a9 V;
    public final HashMap V0;
    public org.telegram.ui.Cells.a9 W;
    public final HashMap W0;
    public org.telegram.ui.Cells.x9 X;
    public final HashMap X0;
    public EditTextBoldCursor[] Y;
    public HashMap Y0;
    public ViewGroup[] Z;
    public boolean Z0;
    public String f38409a;
    public EditTextBoldCursor[] f38410a0;
    public boolean f38411a1;
    public final int f38412b;
    public ScrollView f38413b0;
    public long f38414b1;
    public long f38415c;
    public LinearLayout f38416c0;
    public byte[] f38417c1;
    public final String d;
    public LinearLayout f38418d0;
    public String f38419d1;
    public final String e;
    public LinearLayout f38420e0;
    public byte[] f38421e1;
    public boolean f38422f;
    public LinearLayout f38423f0;
    public boolean f38424f1;
    public LinearLayout f38425g0;
    public boolean f38426g1;
    public final String h;
    public LinearLayout f38427h0;
    public jl0 f38428h1;
    public LinearLayout f38429i0;
    public final ArrayList f38430i1;
    public org.telegram.ui.Cells.p4 f38431j0;
    public org.telegram.messenger.qw f38432j1;
    public final ArrayList f38433k0;
    public final ArrayList f38434k1;
    public org.telegram.ui.Cells.c7 f38435l0;
    public org.telegram.messenger.qw l1;
    public org.telegram.ui.Cells.c7 m0;
    public org.telegram.messenger.qw f38436m1;
    public final String f38437n;
    public org.telegram.ui.Cells.b9 f38438n0;
    public final HashMap f38439n1;
    public org.telegram.ui.Cells.b9 f38440o0;
    public final HashMap f38441o1;
    public org.telegram.ui.Cells.b9 f38442p0;
    public final HashMap f38443p1;
    public org.telegram.ui.Cells.b9 f38444q0;
    public final HashMap f38445q1;
    public final String f38446r;
    public org.telegram.ui.Cells.x9 f38447r0;
    public final HashMap f38448r1;
    public String f38449s;
    public int f38450s0;
    public final HashMap f38451s1;
    public final boolean[] f38452t0;
    public final HashMap f38453t1;
    public boolean f38454u0;
    public final HashMap f38455u1;
    public boolean f38456v0;
    public final HashMap f38457v1;
    public String f38458w;
    public TextView f38459w0;
    public HashMap f38460w1;
    public String f38461x;
    public org.telegram.ui.Cells.x9 f38462x0;
    public HashMap f38463x1;
    public final int[] f38464y;
    public org.telegram.ui.Cells.x9 f38465y0;
    public final HashMap f38466y1;
    public org.telegram.ui.Cells.c7 f38467z0;
    public String f38468z1;

    public jl0(int i10, TL_account.authorizationForm authorizationform, TL_account.Password password, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureValue tL_secureValue, TLRPC.TL_secureRequiredType tL_secureRequiredType2, TLRPC.TL_secureValue tL_secureValue2, HashMap hashMap, HashMap hashMap2) {
        super(null);
        this.f38449s = "";
        this.f38458w = "";
        this.f38464y = new int[3];
        this.f38433k0 = new ArrayList();
        this.f38452t0 = new boolean[3];
        this.f38454u0 = true;
        this.U0 = new ArrayList();
        this.V0 = new HashMap();
        this.W0 = new HashMap();
        this.X0 = new HashMap();
        this.f38430i1 = new ArrayList();
        this.f38434k1 = new ArrayList();
        this.f38439n1 = new HashMap();
        this.f38441o1 = new HashMap();
        this.f38443p1 = new HashMap();
        this.f38445q1 = new HashMap();
        this.f38448r1 = new HashMap();
        this.f38455u1 = new HashMap();
        this.f38457v1 = new HashMap();
        this.f38466y1 = new HashMap();
        this.D1 = new jk0(this);
        this.f38412b = i10;
        this.D = authorizationform;
        this.E = tL_secureRequiredType;
        if (tL_secureRequiredType != null) {
            this.f38454u0 = tL_secureRequiredType.native_names;
        }
        this.H = tL_secureValue;
        this.F = tL_secureRequiredType2;
        this.I = tL_secureValue2;
        this.J = password;
        this.f38451s1 = hashMap;
        this.f38453t1 = hashMap2;
        if (i10 == 3) {
            this.M1 = new ArrayList();
        } else if (i10 == 7) {
            this.J1 = new org.telegram.ui.Components.av0[3];
        }
        if (hashMap == null) {
            this.f38451s1 = new HashMap();
        }
        if (hashMap2 == null) {
            this.f38453t1 = new HashMap();
        }
        if (i10 == 5) {
            if (org.telegram.messenger.e20.i(this.currentAccount).f15521j0 != null && org.telegram.messenger.e20.i(this.currentAccount).f15522k0 != null) {
                this.N0 = 1;
                this.O0 = org.telegram.messenger.e20.i(this.currentAccount).f15521j0;
                this.P0 = org.telegram.messenger.e20.i(this.currentAccount).f15522k0;
            }
            TL_account.Password password2 = this.J;
            if (password2 == null) {
                A1();
            } else {
                TwoStepVerificationActivity.r0(password2);
                if (this.N0 == 1) {
                    F1(true);
                }
            }
            if (org.telegram.messenger.uz.f18525j0 != null) {
                return;
            }
            TLRPC.TL_help_getPassportConfig tL_help_getPassportConfig = new TLRPC.TL_help_getPassportConfig();
            tL_help_getPassportConfig.hash = org.telegram.messenger.uz.f18528k0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_help_getPassportConfig, new ag.c3(19));
        }
    }

    public static int G0(jl0 jl0Var, String str) {
        jl0Var.getClass();
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

    public static boolean H0(org.telegram.ui.jl0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jl0.H0(org.telegram.ui.jl0):boolean");
    }

    public static int M0(jl0 jl0Var) {
        return jl0Var.currentAccount;
    }

    public static void N0(jl0 jl0Var, EditTextBoldCursor editTextBoldCursor, String str, Editable editable, boolean z10) {
        String str2;
        String str3;
        String str4;
        String str5;
        HashMap hashMap = jl0Var.f38466y1;
        if (hashMap != null && (str3 = (String) hashMap.get(str)) != null) {
            if (TextUtils.equals(str3, editable)) {
                HashMap hashMap2 = jl0Var.f38460w1;
                if (hashMap2 != null && (str5 = (String) hashMap2.get(str)) != null) {
                    editTextBoldCursor.setErrorText(str5);
                } else {
                    HashMap hashMap3 = jl0Var.f38463x1;
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
            jl0Var.e1(false);
        }
    }

    public static void T1(EditTextBoldCursor[] editTextBoldCursorArr, boolean z10, boolean z11) {
        if (editTextBoldCursorArr != null) {
            for (EditTextBoldCursor editTextBoldCursor : editTextBoldCursorArr) {
                if (editTextBoldCursor != null) {
                    org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.t6.G6, null);
                    if (z10) {
                        org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 34, org.telegram.ui.ActionBar.t6.H6, null);
                        org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 35, org.telegram.ui.ActionBar.t6.L6, null);
                        if (z11) {
                            int paddingLeft = editTextBoldCursor.getPaddingLeft();
                            int paddingTop = editTextBoldCursor.getPaddingTop();
                            int paddingRight = editTextBoldCursor.getPaddingRight();
                            int paddingBottom = editTextBoldCursor.getPaddingBottom();
                            org.telegram.ui.ActionBar.a7.G(editTextBoldCursor, org.telegram.ui.ActionBar.t6.f21059k6, org.telegram.ui.ActionBar.t6.f21077l6, org.telegram.ui.ActionBar.t6.f21154p7, null);
                            if (editTextBoldCursor.getPaddingLeft() != paddingLeft || editTextBoldCursor.getPaddingTop() != paddingTop || editTextBoldCursor.getPaddingRight() != paddingRight || editTextBoldCursor.getPaddingBottom() != paddingBottom) {
                                editTextBoldCursor.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void Z(jl0 jl0Var, TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery) {
        TL_account.Password password = jl0Var.J;
        password.email_unconfirmed_pattern = tL_auth_passwordRecovery.email_pattern;
        jl0Var.presentFragment(new rc1(jl0Var.currentAccount, 4, password));
    }

    public static void a0(jl0 jl0Var) {
        ArrayList arrayList;
        int i10;
        int i11;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        HashMap hashMap = jl0Var.f38448r1;
        HashMap hashMap2 = jl0Var.f38445q1;
        String str = jl0Var.f38446r;
        ArrayList arrayList2 = new ArrayList();
        int size = jl0Var.D.required_types.size();
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.SecureRequiredType secureRequiredType = jl0Var.D.required_types.get(i12);
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
                                        if (jl0Var.v1(tL_secureRequiredType5, true) != null) {
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
            TLRPC.TL_secureValue v12 = jl0Var.v1(tL_secureRequiredType, true);
            if (v12 == null) {
                Vibrator vibrator = (Vibrator) jl0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                il0 il0Var = (il0) hashMap2.get(tL_secureRequiredType);
                if (il0Var == null && (tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    il0Var = (il0) hashMap2.get(tL_secureRequiredType2);
                }
                org.telegram.messenger.i0.E3(il0Var);
                return;
            }
            HashMap hashMap3 = (HashMap) jl0Var.f38455u1.get(s1(tL_secureRequiredType.type));
            if (hashMap3 != null && !hashMap3.isEmpty()) {
                Vibrator vibrator2 = (Vibrator) jl0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                il0 il0Var2 = (il0) hashMap2.get(tL_secureRequiredType);
                if (il0Var2 == null && (tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    il0Var2 = (il0) hashMap2.get(tL_secureRequiredType3);
                }
                org.telegram.messenger.i0.E3(il0Var2);
                return;
            }
            boolean z10 = tL_secureRequiredType.selfie_required;
            boolean z11 = tL_secureRequiredType.translation_required;
            ?? obj = new Object();
            obj.f38905a = v12;
            obj.f38906b = z10;
            obj.f38907c = z11;
            arrayList2.add(obj);
        }
        jl0Var.R1(false, true);
        TL_account.acceptAuthorization acceptauthorization = new TL_account.acceptAuthorization();
        acceptauthorization.bot_id = jl0Var.f38415c;
        acceptauthorization.scope = jl0Var.h;
        acceptauthorization.public_key = str;
        JSONObject jSONObject = new JSONObject();
        int size3 = arrayList2.size();
        int i14 = 0;
        while (i14 < size3) {
            kk0 kk0Var = (kk0) arrayList2.get(i14);
            TLRPC.TL_secureValue tL_secureValue = kk0Var.f38905a;
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
                        byte[] m12 = jl0Var.m1(tL_secureData.secret, tL_secureData.data_hash);
                        arrayList = arrayList2;
                        try {
                            jSONObject2.put("data_hash", Base64.encodeToString(tL_secureValue.data.data_hash, 2));
                            jSONObject2.put("secret", Base64.encodeToString(m12, 2));
                            jSONObject3.put("data", jSONObject2);
                        } catch (Exception unused) {
                        }
                    } else {
                        arrayList = arrayList2;
                    }
                    if (!tL_secureValue.files.isEmpty()) {
                        JSONArray jSONArray = new JSONArray();
                        int i15 = 0;
                        for (int size4 = tL_secureValue.files.size(); i15 < size4; size4 = size4) {
                            TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) tL_secureValue.files.get(i15);
                            i10 = size3;
                            try {
                                i11 = i14;
                                try {
                                    byte[] m13 = jl0Var.m1(tL_secureFile.secret, tL_secureFile.file_hash);
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("file_hash", Base64.encodeToString(tL_secureFile.file_hash, 2));
                                    jSONObject4.put("secret", Base64.encodeToString(m13, 2));
                                    jSONArray.put(jSONObject4);
                                    i15++;
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
                        byte[] m14 = jl0Var.m1(tL_secureFile2.secret, tL_secureFile2.file_hash);
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("file_hash", Base64.encodeToString(tL_secureFile2.file_hash, 2));
                        jSONObject5.put("secret", Base64.encodeToString(m14, 2));
                        jSONObject3.put("front_side", jSONObject5);
                    }
                    TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile2;
                        byte[] m15 = jl0Var.m1(tL_secureFile3.secret, tL_secureFile3.file_hash);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("file_hash", Base64.encodeToString(tL_secureFile3.file_hash, 2));
                        jSONObject6.put("secret", Base64.encodeToString(m15, 2));
                        jSONObject3.put("reverse_side", jSONObject6);
                    }
                    if (kk0Var.f38906b) {
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile3;
                            byte[] m16 = jl0Var.m1(tL_secureFile4.secret, tL_secureFile4.file_hash);
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("file_hash", Base64.encodeToString(tL_secureFile4.file_hash, 2));
                            jSONObject7.put("secret", Base64.encodeToString(m16, 2));
                            jSONObject3.put("selfie", jSONObject7);
                        }
                    }
                    if (kk0Var.f38907c && !tL_secureValue.translation.isEmpty()) {
                        JSONArray jSONArray2 = new JSONArray();
                        int size5 = tL_secureValue.translation.size();
                        for (int i16 = 0; i16 < size5; i16++) {
                            TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) tL_secureValue.translation.get(i16);
                            byte[] m17 = jl0Var.m1(tL_secureFile5.secret, tL_secureFile5.file_hash);
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("file_hash", Base64.encodeToString(tL_secureFile5.file_hash, 2));
                            jSONObject8.put("secret", Base64.encodeToString(m17, 2));
                            jSONArray2.put(jSONObject8);
                        }
                        jSONObject3.put("translation", jSONArray2);
                    }
                    jSONObject.put(s1(tL_secureValue.type), jSONObject3);
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
        Object obj2 = jl0Var.d;
        if (obj2 != null) {
            try {
                jSONObject9.put("payload", obj2);
            } catch (Exception unused6) {
            }
        }
        Object obj3 = jl0Var.e;
        if (obj3 != null) {
            try {
                jSONObject9.put("nonce", obj3);
            } catch (Exception unused7) {
            }
        }
        bh.d o12 = jl0Var.o1(org.telegram.messenger.i0.h1(jSONObject9.toString()));
        TLRPC.TL_secureCredentialsEncrypted tL_secureCredentialsEncrypted = new TLRPC.TL_secureCredentialsEncrypted();
        acceptauthorization.credentials = tL_secureCredentialsEncrypted;
        tL_secureCredentialsEncrypted.hash = (byte[]) o12.d;
        tL_secureCredentialsEncrypted.data = (byte[]) o12.f2779c;
        try {
            String replace = str.replaceAll("\\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "");
            Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA1AndMGF1Padding");
            cipher.init(1, (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(replace, 0))));
            acceptauthorization.credentials.secret = cipher.doFinal((byte[]) o12.f2778b);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        ConnectionsManager.getInstance(jl0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(jl0Var.currentAccount).sendRequest(acceptauthorization, new ak0(jl0Var, 1)), jl0Var.classGuid);
    }

    public static void b0(jl0 jl0Var, TLRPC.TL_error tL_error, String str, zk0 zk0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        if (tL_error == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("phone", str);
            jl0 jl0Var2 = new jl0(7, jl0Var.D, jl0Var.J, jl0Var.E, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
            jl0Var2.currentAccount = jl0Var.currentAccount;
            jl0Var2.f38421e1 = jl0Var.f38421e1;
            jl0Var2.f38417c1 = jl0Var.f38417c1;
            jl0Var2.B1 = zk0Var;
            jl0Var2.K = (TLRPC.TL_auth_sentCode) tLObject;
            jl0Var.presentFragment(jl0Var2, true);
            return;
        }
        org.telegram.ui.Components.s4.e0(jl0Var.currentAccount, tL_error, jl0Var, sendverifyphonecode, str);
    }

    public static void c0(jl0 jl0Var, org.telegram.messenger.qw qwVar, int i10) {
        String str = qwVar.f17825c;
        HashMap hashMap = jl0Var.f38439n1;
        int i11 = jl0Var.S0;
        if (i11 == 1) {
            org.telegram.messenger.qw qwVar2 = jl0Var.f38432j1;
            if (qwVar2 != null) {
                hl0 hl0Var = (hl0) hashMap.remove(qwVar2);
                if (hl0Var != null) {
                    jl0Var.f38425g0.removeView(hl0Var);
                }
                jl0Var.f38432j1 = null;
            }
        } else if (i11 == 4) {
            if (jl0Var.f38434k1.size() >= 20) {
                return;
            }
        } else if (i11 == 2) {
            org.telegram.messenger.qw qwVar3 = jl0Var.l1;
            if (qwVar3 != null) {
                hl0 hl0Var2 = (hl0) hashMap.remove(qwVar3);
                if (hl0Var2 != null) {
                    jl0Var.f38420e0.removeView(hl0Var2);
                }
                jl0Var.l1 = null;
            }
        } else if (i11 == 3) {
            org.telegram.messenger.qw qwVar4 = jl0Var.f38436m1;
            if (qwVar4 != null) {
                hl0 hl0Var3 = (hl0) hashMap.remove(qwVar4);
                if (hl0Var3 != null) {
                    jl0Var.f38423f0.removeView(hl0Var3);
                }
                jl0Var.f38436m1 = null;
            }
        } else if (i11 == 0 && jl0Var.f38430i1.size() >= 20) {
            return;
        }
        jl0Var.f38441o1.put(str, qwVar);
        jl0Var.L.setEnabled(false);
        jl0Var.L.setAlpha(0.5f);
        org.telegram.messenger.b8.G(jl0Var.currentAccount).i0(false, 16777216, str, true);
        jl0Var.V0(qwVar, i10);
        jl0Var.X1(i10);
    }

    public static void d0(org.telegram.ui.jl0 r9, boolean r10, java.lang.String r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jl0.d0(org.telegram.ui.jl0, boolean, java.lang.String):void");
    }

    public static boolean d1(byte[] bArr, Long l4) {
        if (bArr != null && bArr.length == 32) {
            int i10 = 0;
            for (byte b10 : bArr) {
                i10 += b10 & 255;
            }
            if (i10 % 255 == 239 && (l4 == null || Utilities.g(Utilities.o(bArr.length, bArr)) == l4.longValue())) {
                return true;
            }
        }
        return false;
    }

    public static void e0(int i10, String str, org.telegram.messenger.qw qwVar, hl0 hl0Var, jl0 jl0Var) {
        String str2 = qwVar.f17825c;
        HashMap hashMap = jl0Var.f38441o1;
        jl0Var.f38439n1.remove(qwVar);
        if (i10 == 1) {
            jl0Var.f38432j1 = null;
            jl0Var.f38425g0.removeView(hl0Var);
        } else if (i10 == 4) {
            jl0Var.f38434k1.remove(qwVar);
            jl0Var.f38427h0.removeView(hl0Var);
        } else if (i10 == 2) {
            jl0Var.l1 = null;
            jl0Var.f38420e0.removeView(hl0Var);
        } else if (i10 == 3) {
            jl0Var.f38436m1 = null;
            jl0Var.f38423f0.removeView(hl0Var);
        } else {
            jl0Var.f38430i1.remove(qwVar);
            jl0Var.f38418d0.removeView(hl0Var);
        }
        if (str != null) {
            HashMap hashMap2 = jl0Var.f38463x1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
            HashMap hashMap3 = jl0Var.f38466y1;
            if (hashMap3 != null) {
                hashMap3.remove(str);
            }
        }
        jl0Var.X1(i10);
        if (str2 != null && hashMap.remove(str2) != null) {
            if (hashMap.isEmpty()) {
                jl0Var.L.setEnabled(true);
                jl0Var.L.setAlpha(1.0f);
            }
            org.telegram.messenger.b8.G(jl0Var.currentAccount).b(str2, false);
        }
    }

    public static void f0(jl0 jl0Var) {
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        for (int i10 = 0; i10 < jl0Var.D.values.size(); i10++) {
            deletesecurevalue.types.add(jl0Var.D.values.get(i10).type);
        }
        jl0Var.C1();
        ConnectionsManager.getInstance(jl0Var.currentAccount).sendRequest(deletesecurevalue, new ak0(jl0Var, 2));
    }

    public static void g0(jl0 jl0Var) {
        rc1 rc1Var = new rc1(jl0Var.currentAccount, 0, jl0Var.J);
        rc1Var.Y = true;
        jl0Var.presentFragment(rc1Var);
    }

    public static void h0(jl0 jl0Var) {
        if (jl0Var.J.has_recovery) {
            jl0Var.C1();
            ConnectionsManager.getInstance(jl0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(jl0Var.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new ak0(jl0Var, 0), 10), jl0Var.classGuid);
        } else if (jl0Var.getParentActivity() == null) {
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jl0Var.getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131746087, null), new yj0(jl0Var, 4));
            String L0 = org.telegram.messenger.dd.L0(2131746088, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.dd.L0(2131746090, null);
            jl0Var.showDialog(x1Var);
        }
    }

    public static void i0(jl0 jl0Var) {
        Activity parentActivity = jl0Var.getParentActivity();
        gf.f.r(parentActivity, "https://telegram.org/deactivate?phone=" + org.telegram.messenger.e20.i(jl0Var.currentAccount).d());
    }

    public static int j0(jl0 jl0Var) {
        return jl0Var.currentAccount;
    }

    public static String l1(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr != null && bArr2 != null && bArr2.length == 32 && bArr3 != null && bArr3.length == 32) {
            byte[] r10 = Utilities.r(bArr2, bArr3);
            byte[] bArr4 = new byte[32];
            System.arraycopy(r10, 0, bArr4, 0, 32);
            byte[] bArr5 = new byte[16];
            System.arraycopy(r10, 32, bArr5, 0, 16);
            int length = bArr.length;
            byte[] bArr6 = new byte[length];
            System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
            Utilities.b(bArr6, bArr4, bArr5, 0, length, 0, 0);
            if (Arrays.equals(Utilities.o(length, bArr6), bArr3)) {
                int i10 = bArr6[0] & 255;
                return new String(bArr6, i10, length - i10);
            }
            return null;
        }
        return null;
    }

    public static int m0(jl0 jl0Var) {
        return jl0Var.currentAccount;
    }

    public static int n0(jl0 jl0Var) {
        return jl0Var.currentAccount;
    }

    public static String r1(org.telegram.messenger.qw qwVar) {
        byte[] bArr;
        if (qwVar != null) {
            TLRPC.TL_secureFile tL_secureFile = qwVar.f17824b;
            if (tL_secureFile != null && (bArr = tL_secureFile.file_hash) != null) {
                return Base64.encodeToString(bArr, 2);
            }
            byte[] bArr2 = qwVar.f17826f;
            if (bArr2 != null) {
                return Base64.encodeToString(bArr2, 2);
            }
            return "";
        }
        return "";
    }

    public static String s1(TLRPC.SecureValueType secureValueType) {
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

    public static byte[] t1() {
        byte[] bArr = new byte[32];
        Utilities.f14520b.nextBytes(bArr);
        int i10 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
            i10 += 255 & bArr[i11];
        }
        int i12 = i10 % 255;
        if (i12 != 239) {
            int nextInt = Utilities.f14520b.nextInt(32);
            int i13 = (bArr[nextInt] & 255) + (239 - i12);
            if (i13 < 255) {
                i13 += 255;
            }
            bArr[nextInt] = (byte) (i13 % 255);
        }
        return bArr;
    }

    public static String u1(TLRPC.SecureValueType secureValueType) {
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
            return org.telegram.messenger.dd.L0(2131754676, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
            return org.telegram.messenger.dd.L0(2131754681, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
            return org.telegram.messenger.dd.L0(2131754678, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
            return org.telegram.messenger.dd.L0(2131754671, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
            return org.telegram.messenger.dd.L0(2131754682, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
            return org.telegram.messenger.dd.L0(2131754673, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
            return org.telegram.messenger.dd.L0(2131754677, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
            return org.telegram.messenger.dd.L0(2131754675, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
            return org.telegram.messenger.dd.L0(2131754672, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
            return org.telegram.messenger.dd.L0(2131754674, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
            return org.telegram.messenger.dd.L0(2131754680, null);
        }
        return "";
    }

    public static int v0(jl0 jl0Var) {
        return jl0Var.currentAccount;
    }

    public static boolean x1(TLRPC.SecureValueType secureValueType) {
        if (!(secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) && !(secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) && !(secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) && !(secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) && !(secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement)) {
            return false;
        }
        return true;
    }

    public static int z0(jl0 jl0Var) {
        return jl0Var.currentAccount;
    }

    public static boolean z1(TLRPC.SecureValueType secureValueType) {
        if (!(secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) && !(secureValueType instanceof TLRPC.TL_secureValueTypePassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
            return false;
        }
        return true;
    }

    public final void A1() {
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ak0(this, 3)), this.classGuid);
    }

    public final void B1() {
        org.telegram.ui.ActionBar.x1 x1Var = this.K1;
        if (x1Var == null) {
            return;
        }
        try {
            x1Var.dismiss();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        this.K1 = null;
    }

    public final void C1() {
        if (getParentActivity() != null && !getParentActivity().isFinishing() && this.K1 == null) {
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), null);
            this.K1 = x1Var;
            x1Var.f21489i0 = false;
            x1Var.show();
        }
    }

    public final void D1(View view) {
        if (view == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        org.telegram.messenger.i0.E3(view);
        M1(view);
    }

    public final void E1(boolean z10) {
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
        org.telegram.messenger.i0.E3(this.Y[0]);
    }

    public final void F1(boolean z10) {
        String obj;
        if (z10) {
            obj = null;
        } else {
            obj = this.Y[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                E1(false);
                return;
            }
            R1(true, true);
        }
        Utilities.e.c(new zj0(this, z10, obj, 0));
    }

    public final void G1() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (w1(TLRPC.TL_secureValueTypePhone.class)) {
            arrayList.add(org.telegram.messenger.dd.L0(2131754674, null));
            arrayList2.add(TLRPC.TL_secureValueTypePhone.class);
        }
        if (w1(TLRPC.TL_secureValueTypeEmail.class)) {
            arrayList.add(org.telegram.messenger.dd.L0(2131754680, null));
            arrayList2.add(TLRPC.TL_secureValueTypeEmail.class);
        }
        if (w1(TLRPC.TL_secureValueTypePersonalDetails.class)) {
            arrayList.add(org.telegram.messenger.dd.L0(2131754679, null));
            arrayList2.add(TLRPC.TL_secureValueTypePersonalDetails.class);
        }
        if (w1(TLRPC.TL_secureValueTypePassport.class)) {
            arrayList.add(org.telegram.messenger.dd.L0(2131754676, null));
            arrayList2.add(TLRPC.TL_secureValueTypePassport.class);
        }
        if (w1(TLRPC.TL_secureValueTypeInternalPassport.class)) {
            arrayList.add(org.telegram.messenger.dd.L0(2131754677, null));
            arrayList2.add(TLRPC.TL_secureValueTypeInternalPassport.class);
        }
        if (w1(TLRPC.TL_secureValueTypePassportRegistration.class)) {
            arrayList.add(org.telegram.messenger.dd.L0(2131754675, null));
            arrayList2.add(TLRPC.TL_secureValueTypePassportRegistration.class);
        }
        if (w1(TLRPC.TL_secureValueTypeTemporaryRegistration.class)) {
            arrayList.add(org.telegram.messenger.dd.L0(2131754672, null));
            arrayList2.add(TLRPC.TL_secureValueTypeTemporaryRegistration.class);
        }
        if (w1(TLRPC.TL_secureValueTypeIdentityCard.class)) {
            arrayList.add(org.telegram.messenger.dd.L0(2131754678, null));
            arrayList2.add(TLRPC.TL_secureValueTypeIdentityCard.class);
        }
        if (w1(TLRPC.TL_secureValueTypeDriverLicense.class)) {
            arrayList.add(org.telegram.messenger.dd.L0(2131754681, null));
            arrayList2.add(TLRPC.TL_secureValueTypeDriverLicense.class);
        }
        if (w1(TLRPC.TL_secureValueTypeAddress.class)) {
            arrayList.add(org.telegram.messenger.dd.L0(2131754683, null));
            arrayList2.add(TLRPC.TL_secureValueTypeAddress.class);
        }
        if (w1(TLRPC.TL_secureValueTypeUtilityBill.class)) {
            arrayList.add(org.telegram.messenger.dd.L0(2131754671, null));
            arrayList2.add(TLRPC.TL_secureValueTypeUtilityBill.class);
        }
        if (w1(TLRPC.TL_secureValueTypeBankStatement.class)) {
            arrayList.add(org.telegram.messenger.dd.L0(2131754682, null));
            arrayList2.add(TLRPC.TL_secureValueTypeBankStatement.class);
        }
        if (w1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            arrayList.add(org.telegram.messenger.dd.L0(2131754673, null));
            arrayList2.add(TLRPC.TL_secureValueTypeRentalAgreement.class);
        }
        if (getParentActivity() != null && !arrayList.isEmpty()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String L0 = org.telegram.messenger.dd.L0(2131747512, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = L0;
            alertDialog$Builder.f((CharSequence[]) arrayList.toArray(new CharSequence[0]), new eg.j(10, this, arrayList2));
            showDialog(x1Var);
        }
    }

    public final void H1() {
        boolean z10;
        int size;
        if (getParentActivity() == null) {
            return;
        }
        int i10 = this.S0;
        ArrayList arrayList = this.f38430i1;
        int i11 = 1;
        if (i10 == 0 && arrayList.size() >= 20) {
            Q1(org.telegram.messenger.dd.L0(2131689472, null), org.telegram.messenger.dd.a0("PassportUploadMaxReached", null, 2131747467, org.telegram.messenger.dd.G(20, "Files", new Object[0])));
            return;
        }
        g1();
        org.telegram.ui.Components.bi biVar = this.R0;
        int i12 = this.S0;
        if (i12 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        biVar.O3 = z10;
        if (i12 == 0) {
            size = arrayList.size();
        } else {
            if (i12 == 4) {
                size = this.f38434k1.size();
            }
            biVar.x1(i11, false);
            this.R0.a2.g0();
            this.R0.d1();
            showDialog(this.R0);
        }
        i11 = 20 - size;
        biVar.x1(i11, false);
        this.R0.a2.g0();
        this.R0.d1();
        showDialog(this.R0);
    }

    public final void I1(TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, boolean z10) {
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
            HashMap hashMap4 = this.f38455u1;
            if (!z10) {
                hashMap = (HashMap) hashMap4.get(s1(secureValueType2));
            } else {
                hashMap = null;
            }
            HashMap hashMap5 = (HashMap) hashMap4.get(s1(secureValueType));
            TLRPC.TL_secureValue v12 = v1(tL_secureRequiredType, false);
            TLRPC.TL_secureValue v13 = v1(tL_secureRequiredType2, false);
            HashMap hashMap6 = hashMap;
            TL_account.authorizationForm authorizationform = this.D;
            int i12 = i11;
            TL_account.Password password = this.J;
            HashMap hashMap7 = this.f38443p1;
            HashMap hashMap8 = (HashMap) hashMap7.get(tL_secureRequiredType);
            if (tL_secureRequiredType2 != null) {
                hashMap2 = hashMap5;
                hashMap3 = (HashMap) hashMap7.get(tL_secureRequiredType2);
            } else {
                hashMap2 = hashMap5;
                hashMap3 = null;
            }
            jl0 jl0Var = new jl0(i12, authorizationform, password, tL_secureRequiredType, v12, tL_secureRequiredType2, v13, hashMap8, hashMap3);
            jl0Var.B1 = new nk0(this, secureValueType2, z10, i10);
            jl0Var.currentAccount = this.currentAccount;
            jl0Var.f38421e1 = this.f38421e1;
            jl0Var.f38417c1 = this.f38417c1;
            jl0Var.f38415c = this.f38415c;
            jl0Var.f38460w1 = hashMap6;
            jl0Var.f38456v0 = z10;
            jl0Var.f38463x1 = hashMap2;
            jl0Var.G = arrayList;
            if (i12 == 4) {
                jl0Var.f38419d1 = this.f38419d1;
            }
            presentFragment(jl0Var);
        }
    }

    public final void J1(int i10) {
        if (i10 == 0) {
            int i11 = Build.VERSION.SDK_INT;
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                return;
            }
            try {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File q02 = org.telegram.messenger.i0.q0(null, false);
                if (q02 != null) {
                    if (i11 >= 24) {
                        Activity parentActivity = getParentActivity();
                        org.telegram.messenger.w0.d();
                        intent.putExtra("output", FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", q02));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(q02));
                    }
                    this.Q0 = q02.getAbsolutePath();
                }
                startActivityForResult(intent, 0);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public final void K1(ArrayList arrayList) {
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
        Utilities.e.c(new org.telegram.messenger.voip.p0(this.S0, 7, this, arrayList, z10));
    }

    public final TLRPC.TL_secureValue L1(TLRPC.TL_secureRequiredType tL_secureRequiredType) {
        if (tL_secureRequiredType == null) {
            return null;
        }
        int size = this.D.values.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (tL_secureRequiredType.type.getClass() == this.D.values.get(i10).type.getClass()) {
                return this.D.values.remove(i10);
            }
        }
        return null;
    }

    public final void M1(View view) {
        while (view != null && this.f38416c0.indexOfChild(view) < 0) {
            view = (View) view.getParent();
        }
        if (view != null) {
            this.f38413b0.smoothScrollTo(0, view.getTop() - ((this.f38413b0.getMeasuredHeight() - view.getMeasuredHeight()) / 2));
        }
    }

    public final void N1(HashMap hashMap, EditTextBoldCursor editTextBoldCursor, String str) {
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
                    this.f38458w = str2;
                    CharSequence charSequence3 = (String) this.Y0.get(str2);
                    if (charSequence3 != null) {
                        editTextBoldCursor.setText(charSequence3);
                        break;
                    }
                    break;
                case 1:
                    if ("male".equals(str2)) {
                        this.f38461x = str2;
                        editTextBoldCursor.setText(org.telegram.messenger.dd.L0(2131747524, null));
                        break;
                    } else if ("female".equals(str2)) {
                        this.f38461x = str2;
                        editTextBoldCursor.setText(org.telegram.messenger.dd.L0(2131747585, null));
                        break;
                    }
                    break;
                case 2:
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    int[] iArr = this.f38464y;
                    if (!isEmpty) {
                        String[] split = str2.split("\\.");
                        if (split.length == 3) {
                            iArr[0] = Utilities.z(split[2]).intValue();
                            iArr[1] = Utilities.z(split[1]).intValue();
                            iArr[2] = Utilities.z(split[0]).intValue();
                            editTextBoldCursor.setText(str2);
                            break;
                        }
                    }
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    editTextBoldCursor.setText(org.telegram.messenger.dd.L0(2131747510, null));
                    break;
                case 3:
                    this.f38449s = str2;
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
        HashMap hashMap2 = this.f38460w1;
        HashMap hashMap3 = this.f38466y1;
        if (hashMap2 != null && (charSequence2 = (String) hashMap2.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence2);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
            return;
        }
        HashMap hashMap4 = this.f38463x1;
        if (hashMap4 != null && (charSequence = (String) hashMap4.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
        }
    }

    public final void O1(Bundle bundle, int i10, boolean z10) {
        if (i10 == 3) {
            this.L.setVisibility(8);
        }
        int i11 = this.I1;
        org.telegram.ui.Components.av0[] av0VarArr = this.J1;
        org.telegram.ui.Components.av0 av0Var = av0VarArr[i11];
        org.telegram.ui.Components.av0 av0Var2 = av0VarArr[i10];
        this.I1 = i10;
        av0Var2.m(bundle, false);
        av0Var2.j();
        if (z10) {
            Point point = org.telegram.messenger.i0.f16172q;
            av0Var2.setTranslationX(point.x);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.setDuration(300L);
            animatorSet.playTogether(ObjectAnimator.ofFloat(av0Var, "translationX", -point.x), ObjectAnimator.ofFloat(av0Var2, "translationX", 0.0f));
            animatorSet.addListener(new org.telegram.ui.Components.jw0(5, (View) av0Var, (Object) av0Var2));
            animatorSet.start();
            return;
        }
        av0Var2.setTranslationX(0.0f);
        av0Var2.setVisibility(0);
        if (av0Var != av0Var2) {
            av0Var.setVisibility(8);
        }
    }

    public final void P1(org.telegram.tgnet.TLRPC.TL_secureRequiredType r31, java.lang.String r32, java.lang.String r33, org.telegram.tgnet.TLRPC.TL_secureRequiredType r34, java.lang.String r35, boolean r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jl0.P1(org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, boolean, int):void");
    }

    public final void Q1(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = str;
        x1Var.T = str2;
        showDialog(x1Var);
    }

    public final void R1(boolean z10, boolean z11) {
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
                org.telegram.ui.Components.iq iqVar = this.N;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(iqVar, property4, 0.1f);
                org.telegram.ui.Components.iq iqVar2 = this.N;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(iqVar2, property5, 0.1f);
                org.telegram.ui.Components.iq iqVar3 = this.N;
                Property property6 = View.ALPHA;
                animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(iqVar3, property6, 0.0f), ObjectAnimator.ofFloat(this.L.getContentView(), property4, 1.0f), ObjectAnimator.ofFloat(this.L.getContentView(), property5, 1.0f), ObjectAnimator.ofFloat(this.L.getContentView(), property6, 1.0f));
            }
            this.M.addListener(new ok0(this, z11, 0));
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
                org.telegram.ui.Components.iq iqVar4 = this.P;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(iqVar4, property10, 0.1f);
                org.telegram.ui.Components.iq iqVar5 = this.P;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(iqVar5, property11, 0.1f);
                org.telegram.ui.Components.iq iqVar6 = this.P;
                Property property12 = View.ALPHA;
                animatorSet5.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(iqVar6, property12, 0.0f), ObjectAnimator.ofFloat(this.O, property10, 1.0f), ObjectAnimator.ofFloat(this.O, property11, 1.0f), ObjectAnimator.ofFloat(this.O, property12, 1.0f));
            }
            this.M.addListener(new ok0(this, z11, 1));
            this.M.setDuration(150L);
            this.M.start();
        }
    }

    public final void S1(boolean z10, String str, Runnable runnable, xk0 xk0Var, zk0 zk0Var) {
        boolean z11;
        boolean z12;
        boolean z13;
        TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.w0.f18945b.getSystemService("phone");
        if (telephonyManager.getSimState() != 1 && telephonyManager.getPhoneType() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (getParentActivity() != null && z11) {
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
                        alertDialog$Builder.f20135a.R = org.telegram.messenger.dd.L0(2131689472, null);
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                        String L0 = org.telegram.messenger.dd.L0(2131754275, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                        x1Var.T = L0;
                        this.L1 = showDialog(x1Var);
                    } else {
                        getParentActivity().requestPermissions((String[]) this.M1.toArray(new String[0]), 6);
                    }
                    this.E1 = str;
                    this.G1 = xk0Var;
                    this.F1 = runnable;
                    this.H1 = zk0Var;
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
        tL_codeSettings.allow_app_hash = org.telegram.messenger.fu.f15792b.hasServices();
        SharedPreferences sharedPreferences = org.telegram.messenger.w0.f18945b.getSharedPreferences("mainconfig", 0);
        if (sendverifyphonecode.settings.allow_app_hash) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            boolean z14 = org.telegram.messenger.v2.f18578a;
            org.telegram.messenger.w0.u();
            edit.putString("sms_hash", "O2P2z+/jBpJ").commit();
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
                org.telegram.messenger.f8.g(e, true);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendverifyphonecode, new mb(this, str, zk0Var, sendverifyphonecode, 5), 2);
    }

    public final void U1() {
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        if (tL_secureRequiredType != null) {
            this.actionBar.setTitle(u1(tL_secureRequiredType.type));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131747508, null));
        }
        X1(2);
        X1(3);
        X1(1);
        X1(4);
    }

    public final void V0(final org.telegram.messenger.qw qwVar, final int i10) {
        String L0;
        final String str;
        String v;
        HashMap hashMap;
        if (i10 == 1) {
            this.f38432j1 = qwVar;
            if (this.f38425g0 == null) {
                return;
            }
        } else if (i10 == 4) {
            this.f38434k1.add(qwVar);
            if (this.f38427h0 == null) {
                return;
            }
        } else if (i10 == 2) {
            this.l1 = qwVar;
            if (this.f38420e0 == null) {
                return;
            }
        } else if (i10 == 3) {
            this.f38436m1 = qwVar;
            if (this.f38423f0 == null) {
                return;
            }
        } else {
            this.f38430i1.add(qwVar);
            if (this.f38418d0 == null) {
                return;
            }
        }
        if (getParentActivity() == null) {
            return;
        }
        final hl0 hl0Var = new hl0(this, getParentActivity());
        hl0Var.setTag(qwVar);
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.t6.N0(true);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f20930d6);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f21021i6);
        hl0Var.setBackground(N0);
        org.telegram.ui.ActionBar.a7.k(hl0Var, N0, N, N2, null);
        this.f38439n1.put(qwVar, hl0Var);
        String r12 = r1(qwVar);
        if (i10 == 1) {
            L0 = org.telegram.messenger.dd.L0(2131747479, null);
            this.f38425g0.addView(hl0Var, w7.b6.o(-1, -2));
            str = "selfie" + r12;
        } else if (i10 == 4) {
            L0 = org.telegram.messenger.dd.L0(2131753948, null);
            this.f38427h0.addView(hl0Var, w7.b6.o(-1, -2));
            str = "translation" + r12;
        } else if (i10 == 2) {
            TLRPC.SecureValueType secureValueType = this.F.type;
            if (!(secureValueType instanceof TLRPC.TL_secureValueTypePassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                L0 = org.telegram.messenger.dd.L0(2131747584, null);
            } else {
                L0 = org.telegram.messenger.dd.L0(2131747526, null);
            }
            this.f38420e0.addView(hl0Var, w7.b6.o(-1, -2));
            str = "front" + r12;
        } else if (i10 == 3) {
            L0 = org.telegram.messenger.dd.L0(2131747488, null);
            this.f38423f0.addView(hl0Var, w7.b6.o(-1, -2));
            str = "reverse" + r12;
        } else {
            L0 = org.telegram.messenger.dd.L0(2131753948, null);
            this.f38418d0.addView(hl0Var, w7.b6.o(-1, -2));
            str = "files" + r12;
        }
        TextView textView = hl0Var.f37830b;
        if (str != null && (hashMap = this.f38463x1) != null && (v = (String) hashMap.get(str)) != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21154p7, null);
            this.f38466y1.put(str, "");
        } else {
            v = org.telegram.messenger.dd.v(qwVar.f17824b.date);
        }
        hl0Var.f37829a.setText(L0);
        textView.setText(v);
        org.telegram.ui.Components.g9 g9Var = hl0Var.f37831c;
        g9Var.getClass();
        ?? obj = new Object();
        obj.h = qwVar;
        g9Var.n(obj, "48_48", null, null, null, null, 0, null);
        hl0Var.f37832f = qwVar;
        hl0Var.a(false);
        hl0Var.setOnClickListener(new bh.f(this, i10, 21));
        hl0Var.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                jl0 jl0Var = this;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jl0Var.getParentActivity());
                int i11 = i10;
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                if (i11 == 1) {
                    x1Var.T = org.telegram.messenger.dd.L0(2131747598, null);
                } else {
                    x1Var.T = org.telegram.messenger.dd.L0(2131747600, null);
                }
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                x1Var.R = org.telegram.messenger.dd.L0(2131689472, null);
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), new jg.q2(jl0Var, qwVar, i11, hl0Var, str, 4));
                jl0Var.showDialog(x1Var);
                return true;
            }
        });
    }

    public final void V1() {
        if (this.D.values.isEmpty()) {
            this.A0.setVisibility(0);
            this.f38435l0.setVisibility(8);
            this.f38431j0.setVisibility(8);
            this.f38462x0.setVisibility(8);
            this.f38465y0.setVisibility(8);
            this.f38467z0.setVisibility(8);
            return;
        }
        this.A0.setVisibility(8);
        this.f38435l0.setVisibility(0);
        this.f38431j0.setVisibility(0);
        this.f38465y0.setVisibility(0);
        this.f38467z0.setVisibility(0);
        if (!w1(TLRPC.TL_secureValueTypePhone.class) && !w1(TLRPC.TL_secureValueTypeEmail.class) && !w1(TLRPC.TL_secureValueTypePersonalDetails.class) && !w1(TLRPC.TL_secureValueTypePassport.class) && !w1(TLRPC.TL_secureValueTypeInternalPassport.class) && !w1(TLRPC.TL_secureValueTypeIdentityCard.class) && !w1(TLRPC.TL_secureValueTypeDriverLicense.class) && !w1(TLRPC.TL_secureValueTypeAddress.class) && !w1(TLRPC.TL_secureValueTypeUtilityBill.class) && !w1(TLRPC.TL_secureValueTypePassportRegistration.class) && !w1(TLRPC.TL_secureValueTypeTemporaryRegistration.class) && !w1(TLRPC.TL_secureValueTypeBankStatement.class) && !w1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            this.f38462x0.setVisibility(8);
        } else {
            this.f38462x0.setVisibility(0);
        }
    }

    public final void W0(TLRPC.TL_secureFile tL_secureFile, int i10) {
        byte[] bArr = tL_secureFile.secret;
        byte[] bArr2 = tL_secureFile.file_hash;
        byte[] r10 = Utilities.r(m1(bArr, bArr2), bArr2);
        byte[] bArr3 = new byte[32];
        System.arraycopy(r10, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(r10, 32, bArr4, 0, 16);
        V0(new org.telegram.messenger.qw(new org.telegram.messenger.rw(bArr3, bArr4), tL_secureFile, null, null, null), i10);
    }

    public final void W1() {
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
                    this.G0.setLayoutParams(w7.b6.k(0.0f, 25.0f, 0.0f, 0.0f, -1, -2));
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
                this.G0.setLayoutParams(w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                if (this.Y != null) {
                    TL_account.Password password2 = this.J;
                    if (password2 != null && !TextUtils.isEmpty(password2.hint)) {
                        this.Y[0].setHint(this.J.hint);
                        return;
                    } else {
                        this.Y[0].setHint(org.telegram.messenger.dd.L0(2131748737, null));
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

    public final void X0(ArrayList arrayList) {
        this.f38430i1.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i10);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                W0((TLRPC.TL_secureFile) secureFile, 0);
            }
        }
    }

    public final void X1(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jl0.X1(int):void");
    }

    public final org.telegram.ui.il0 Y0(android.content.Context r28, org.telegram.tgnet.TLRPC.TL_secureRequiredType r29, java.util.ArrayList r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jl0.Y0(android.content.Context, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.util.ArrayList, boolean, boolean):org.telegram.ui.il0");
    }

    public final void Z0(ArrayList arrayList) {
        this.f38434k1.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i10);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                W0((TLRPC.TL_secureFile) secureFile, 4);
            }
        }
    }

    public final void a1(boolean z10) {
        int i10;
        if (!this.f38426g1) {
            String str = this.f38437n;
            boolean isEmpty = TextUtils.isEmpty(str);
            int i11 = this.f38412b;
            if (!isEmpty) {
                if (z10) {
                    Activity parentActivity = getParentActivity();
                    gf.f.o(parentActivity, Uri.parse(str + "&tg_passport=success"));
                } else if (!this.f38424f1 && (i11 == 5 || i11 == 0)) {
                    Activity parentActivity2 = getParentActivity();
                    gf.f.o(parentActivity2, Uri.parse(str + "&tg_passport=cancel"));
                }
                this.f38426g1 = true;
            } else if (this.C1) {
                if (z10 || (!this.f38424f1 && (i11 == 5 || i11 == 0))) {
                    Activity parentActivity3 = getParentActivity();
                    if (z10) {
                        i10 = -1;
                    } else {
                        i10 = 0;
                    }
                    parentActivity3.setResult(i10);
                }
                this.f38426g1 = true;
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
    }

    public final boolean b1(boolean z10) {
        if (y1()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747596, null), new yj0(this, 1));
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
            String L0 = org.telegram.messenger.dd.L0(2131751406, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.dd.L0(2131747595, null);
            showDialog(x1Var);
        }
        return true;
    }

    public final void c1(boolean z10) {
        String str;
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.f38410a0 != null) {
            String str2 = (String) this.Y0.get(this.f38458w);
            String str3 = (String) org.telegram.messenger.uz.n().get(this.f38458w);
            int i10 = 0;
            if (this.E.native_names && !TextUtils.isEmpty(this.f38458w) && !"EN".equals(str3)) {
                if (this.f38444q0.getVisibility() != 0) {
                    this.f38444q0.setVisibility(0);
                    this.f38431j0.setVisibility(0);
                    this.T.setVisibility(0);
                    int i11 = 0;
                    while (true) {
                        editTextBoldCursorArr = this.f38410a0;
                        if (i11 >= editTextBoldCursorArr.length) {
                            break;
                        }
                        ((View) editTextBoldCursorArr[i11].getParent()).setVisibility(0);
                        i11++;
                    }
                    if (editTextBoldCursorArr[0].length() == 0 && this.f38410a0[1].length() == 0 && this.f38410a0[2].length() == 0) {
                        int i12 = 0;
                        while (true) {
                            boolean[] zArr = this.f38452t0;
                            if (i12 >= zArr.length) {
                                break;
                            } else if (zArr[i12]) {
                                this.f38410a0[0].setText(this.Y[0].getText());
                                this.f38410a0[1].setText(this.Y[1].getText());
                                this.f38410a0[2].setText(this.Y[2].getText());
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    org.telegram.ui.ActionBar.a7.a0(this.m0, getParentActivity(), 2131231230, org.telegram.ui.ActionBar.t6.f20893b7);
                }
                this.f38444q0.setText(org.telegram.messenger.dd.a0("PassportNativeInfo", null, 2131747514, str2));
                if (str3 != null) {
                    String concat = "PassportLanguage_".concat(str3);
                    str = org.telegram.messenger.dd.D0().V.b(concat);
                    if (str == null) {
                        org.telegram.messenger.dd D0 = org.telegram.messenger.dd.D0();
                        D0.i();
                        str = D0.T.b(concat);
                    }
                } else {
                    str = null;
                }
                if (str != null) {
                    this.f38431j0.setText(org.telegram.messenger.dd.a0("PassportNativeHeaderLang", null, 2131747515, str));
                } else {
                    this.f38431j0.setText(org.telegram.messenger.dd.L0(2131747516, null));
                }
                for (int i13 = 0; i13 < 3; i13++) {
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 == 2) {
                                if (str != null) {
                                    this.f38410a0[i13].setHintText(org.telegram.messenger.dd.L0(2131747474, null));
                                } else {
                                    this.f38410a0[i13].setHintText(org.telegram.messenger.dd.a0("PassportSurnameCountry", null, 2131747473, str2));
                                }
                            }
                        } else if (str != null) {
                            this.f38410a0[i13].setHintText(org.telegram.messenger.dd.L0(2131747523, null));
                        } else {
                            this.f38410a0[i13].setHintText(org.telegram.messenger.dd.a0("PassportMidnameCountry", null, 2131747522, str2));
                        }
                    } else if (str != null) {
                        this.f38410a0[i13].setHintText(org.telegram.messenger.dd.L0(2131747520, null));
                    } else {
                        this.f38410a0[i13].setHintText(org.telegram.messenger.dd.a0("PassportNameCountry", null, 2131747518, str2));
                    }
                }
                if (z10) {
                    org.telegram.messenger.i0.g3(new vj0(this, 2));
                }
            } else if (this.f38444q0.getVisibility() != 8) {
                this.f38444q0.setVisibility(8);
                this.f38431j0.setVisibility(8);
                this.T.setVisibility(8);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.f38410a0;
                    if (i10 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    ((View) editTextBoldCursorArr2[i10].getParent()).setVisibility(8);
                    i10++;
                }
                if (((this.f38415c != 0 || this.F == null) && this.H != null && !this.f38456v0) || this.I != null) {
                    org.telegram.ui.ActionBar.a7.a0(this.m0, getParentActivity(), 2131231230, org.telegram.ui.ActionBar.t6.f20893b7);
                } else {
                    org.telegram.ui.ActionBar.a7.a0(this.m0, getParentActivity(), 2131231231, org.telegram.ui.ActionBar.t6.f20893b7);
                }
            }
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jl0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        EditTextBoldCursor editTextBoldCursor;
        hl0 hl0Var;
        org.telegram.ui.ActionBar.t0 t0Var;
        if (i10 == org.telegram.messenger.at.U1) {
            String str = (String) objArr[0];
            HashMap hashMap = this.f38441o1;
            org.telegram.messenger.qw qwVar = (org.telegram.messenger.qw) hashMap.get(str);
            if (qwVar != null) {
                qwVar.d = (TLRPC.TL_inputFile) objArr[1];
                hashMap.remove(str);
                if (hashMap.isEmpty() && (t0Var = this.L) != null) {
                    t0Var.setEnabled(true);
                    this.L.setAlpha(1.0f);
                }
                HashMap hashMap2 = this.f38439n1;
                if (hashMap2 != null && (hl0Var = (hl0) hashMap2.get(qwVar)) != null) {
                    hl0Var.a(true);
                }
                HashMap hashMap3 = this.f38466y1;
                if (hashMap3 != null && hashMap3.containsKey("error_document_all")) {
                    hashMap3.remove("error_document_all");
                    e1(false);
                }
                int i12 = qwVar.f17827i;
                if (i12 == 0) {
                    if (this.f38438n0 != null && !TextUtils.isEmpty(this.f38468z1)) {
                        this.f38438n0.setText(this.f38468z1);
                    }
                    hashMap3.remove("files_all");
                } else if (i12 == 4) {
                    if (this.f38440o0 != null && !TextUtils.isEmpty(this.A1)) {
                        this.f38440o0.setText(this.A1);
                    }
                    hashMap3.remove("translation_all");
                }
            }
        } else if (i10 != org.telegram.messenger.at.V1 && i10 == org.telegram.messenger.at.f14761p0) {
            if (objArr.length > 0) {
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
                    Utilities.f14520b.nextBytes(bArr);
                    EditTextBoldCursor editTextBoldCursor2 = this.Y[0];
                    if (editTextBoldCursor2 != null && editTextBoldCursor2.length() > 0) {
                        this.N0 = 2;
                    }
                }
            } else {
                this.J = null;
                A1();
            }
            W1();
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.bi biVar = this.R0;
        if (biVar != null && this.visibleDialog == biVar) {
            biVar.a2.b0(false);
            this.R0.L();
            this.R0.a2.e0(true);
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

    public final void e1(boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        String str2;
        if (this.f38442p0 != null) {
            HashMap hashMap = this.f38460w1;
            HashMap hashMap2 = this.f38466y1;
            if (hashMap != null && ((z10 || hashMap2.containsKey("error_all")) && (str2 = (String) this.f38460w1.get("error_all")) != null)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
                if (z10) {
                    hashMap2.put("error_all", "");
                }
            } else {
                spannableStringBuilder = null;
            }
            if (this.f38463x1 != null && ((z10 || hashMap2.containsKey("error_document_all")) && (str = (String) this.f38463x1.get("error_all")) != null)) {
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
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.f21154p7, null), 0, spannableStringBuilder.length(), 33);
                this.f38442p0.setText(spannableStringBuilder);
                this.f38442p0.setVisibility(0);
            } else if (this.f38442p0.getVisibility() != 8) {
                this.f38442p0.setVisibility(8);
            }
        }
    }

    public final void f1(Context context) {
        long j10;
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
            org.telegram.messenger.f8.g(e, true);
        }
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
        this.f38442p0 = b9Var;
        int i10 = org.telegram.ui.ActionBar.t6.f20893b7;
        org.telegram.ui.ActionBar.a7.a0(b9Var, context, 2131231232, i10);
        this.f38442p0.setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, 0);
        this.f38416c0.addView(this.f38442p0, w7.b6.o(-1, -2));
        e1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        if (tL_secureRequiredType != null) {
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131754673, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
                this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131754682, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131754671, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131754675, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131754672, null));
            }
            org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context);
            this.f38431j0 = p4Var;
            p4Var.setText(org.telegram.messenger.dd.L0(2131747592, null));
            org.telegram.ui.Cells.p4 p4Var2 = this.f38431j0;
            int i11 = org.telegram.ui.ActionBar.t6.f20930d6;
            org.telegram.ui.ActionBar.a7.i(i11, p4Var2, null);
            j10 = 0;
            this.f38416c0.addView(this.f38431j0, w7.b6.o(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.f38418d0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f38416c0.addView(this.f38418d0, w7.b6.o(-1, -2));
            org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
            this.R = x9Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.t6.N0(true);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
            int i12 = org.telegram.ui.ActionBar.t6.f21021i6;
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i12);
            x9Var.setBackground(N0);
            org.telegram.ui.ActionBar.a7.k(x9Var, N0, N, N2, null);
            this.f38416c0.addView(this.R, w7.b6.o(-1, -2));
            this.R.setOnClickListener(new wj0(this, 7));
            org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context);
            this.f38438n0 = b9Var2;
            org.telegram.ui.ActionBar.a7.a0(b9Var2, context, 2131231230, i10);
            if (this.f38415c != 0) {
                this.f38468z1 = org.telegram.messenger.dd.L0(2131747643, null);
            } else {
                TLRPC.SecureValueType secureValueType2 = this.F.type;
                if (secureValueType2 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                    this.f38468z1 = org.telegram.messenger.dd.L0(2131747641, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                    this.f38468z1 = org.telegram.messenger.dd.L0(2131747637, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                    this.f38468z1 = org.telegram.messenger.dd.L0(2131747627, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                    this.f38468z1 = org.telegram.messenger.dd.L0(2131747625, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                    this.f38468z1 = org.telegram.messenger.dd.L0(2131747639, null);
                } else {
                    this.f38468z1 = "";
                }
            }
            String str2 = this.f38468z1;
            HashMap hashMap = this.f38463x1;
            HashMap hashMap2 = this.f38466y1;
            String str3 = str2;
            if (hashMap != null) {
                String str4 = (String) hashMap.get("files_all");
                str3 = str2;
                if (str4 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                    spannableStringBuilder.append((CharSequence) "\n\n");
                    spannableStringBuilder.append((CharSequence) this.f38468z1);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.f21154p7, null), 0, str4.length(), 33);
                    hashMap2.put("files_all", "");
                    str3 = spannableStringBuilder;
                }
            }
            this.f38438n0.setText(str3);
            this.f38416c0.addView(this.f38438n0, w7.b6.o(-1, -2));
            if (this.F.translation_required) {
                org.telegram.ui.Cells.p4 p4Var3 = new org.telegram.ui.Cells.p4(context);
                this.f38431j0 = p4Var3;
                p4Var3.setText(org.telegram.messenger.dd.L0(2131747471, null));
                org.telegram.ui.ActionBar.a7.i(i11, this.f38431j0, null);
                this.f38416c0.addView(this.f38431j0, w7.b6.o(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.f38427h0 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.f38416c0.addView(this.f38427h0, w7.b6.o(-1, -2));
                org.telegram.ui.Cells.x9 x9Var2 = new org.telegram.ui.Cells.x9(context);
                this.X = x9Var2;
                org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.t6.N0(true);
                org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i11);
                org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i12);
                x9Var2.setBackground(N02);
                org.telegram.ui.ActionBar.a7.k(x9Var2, N02, N3, N4, null);
                this.f38416c0.addView(this.X, w7.b6.o(-1, -2));
                this.X.setOnClickListener(new wj0(this, 8));
                org.telegram.ui.Cells.b9 b9Var3 = new org.telegram.ui.Cells.b9(context);
                this.f38440o0 = b9Var3;
                org.telegram.ui.ActionBar.a7.a0(b9Var3, context, 2131231230, i10);
                if (this.f38415c != 0) {
                    this.A1 = org.telegram.messenger.dd.L0(2131747619, null);
                } else {
                    TLRPC.SecureValueType secureValueType3 = this.F.type;
                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                        this.A1 = org.telegram.messenger.dd.L0(2131747624, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                        this.A1 = org.telegram.messenger.dd.L0(2131747622, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                        this.A1 = org.telegram.messenger.dd.L0(2131747621, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                        this.A1 = org.telegram.messenger.dd.L0(2131747620, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                        this.A1 = org.telegram.messenger.dd.L0(2131747623, null);
                    } else {
                        this.A1 = "";
                    }
                }
                String str5 = this.A1;
                HashMap hashMap3 = this.f38463x1;
                String str6 = str5;
                if (hashMap3 != null) {
                    String str7 = (String) hashMap3.get("translation_all");
                    str6 = str5;
                    if (str7 != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str7);
                        spannableStringBuilder2.append((CharSequence) "\n\n");
                        spannableStringBuilder2.append((CharSequence) this.A1);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.f21154p7, null), 0, str7.length(), 33);
                        hashMap2.put("translation_all", "");
                        str6 = spannableStringBuilder2;
                    }
                }
                this.f38440o0.setText(str6);
                this.f38416c0.addView(this.f38440o0, w7.b6.o(-1, -2));
            }
        } else {
            j10 = 0;
            this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131747618, null));
        }
        org.telegram.ui.Cells.p4 p4Var4 = new org.telegram.ui.Cells.p4(context);
        this.f38431j0 = p4Var4;
        p4Var4.setText(org.telegram.messenger.dd.L0(2131747617, null));
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, this.f38431j0, null);
        this.f38416c0.addView(this.f38431j0, w7.b6.o(-1, -2));
        this.Y = new EditTextBoldCursor[6];
        for (int i13 = 0; i13 < 6; i13++) {
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.Y[i13] = editTextBoldCursor;
            fk0 fk0Var = new fk0(context, editTextBoldCursor, 0);
            fk0Var.setWillNotDraw(false);
            this.f38416c0.addView(fk0Var, w7.b6.o(-1, -2));
            int i14 = org.telegram.ui.ActionBar.t6.f20930d6;
            org.telegram.ui.ActionBar.a7.i(i14, fk0Var, null);
            int i15 = 5;
            if (i13 == 5) {
                View view = new View(context);
                this.S = view;
                org.telegram.ui.ActionBar.a7.i(i14, view, null);
                this.f38416c0.addView(this.S, w7.b6.o(-1, 6));
            }
            if (this.f38456v0 && this.F != null) {
                fk0Var.setVisibility(8);
                View view2 = this.S;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            this.Y[i13].setTag(Integer.valueOf(i13));
            this.Y[i13].setSupportRtlHint(true);
            this.Y[i13].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.a7.B(this.Y[i13], org.telegram.ui.ActionBar.t6.H6, null);
            org.telegram.ui.ActionBar.a7.A(this.Y[i13], org.telegram.ui.ActionBar.t6.L6, null);
            this.Y[i13].setTransformHintToHeader(true);
            EditTextBoldCursor editTextBoldCursor2 = this.Y[i13];
            int i16 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.a7.V(editTextBoldCursor2, i16, null);
            this.Y[i13].setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.a7.w(this.Y[i13], i16, null);
            this.Y[i13].setCursorSize(org.telegram.messenger.i0.L(20.0f));
            this.Y[i13].setCursorWidth(1.5f);
            org.telegram.ui.ActionBar.a7.G(this.Y[i13], org.telegram.ui.ActionBar.t6.f21059k6, org.telegram.ui.ActionBar.t6.f21077l6, org.telegram.ui.ActionBar.t6.f21154p7, null);
            if (i13 == 5) {
                this.Y[i13].setOnTouchListener(new xj0(this, 2));
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
                                    this.Y[i13].setHintText(org.telegram.messenger.dd.L0(2131747610, null));
                                    str = "country_code";
                                }
                            } else {
                                this.Y[i13].setHintText(org.telegram.messenger.dd.L0(2131747477, null));
                                str = "state";
                            }
                        } else {
                            this.Y[i13].setHintText(org.telegram.messenger.dd.L0(2131747611, null));
                            str = "city";
                        }
                    } else {
                        this.Y[i13].setHintText(org.telegram.messenger.dd.L0(2131747496, null));
                        str = "post_code";
                    }
                } else {
                    this.Y[i13].setHintText(org.telegram.messenger.dd.L0(2131747475, null));
                    str = "street_line2";
                }
            } else {
                this.Y[i13].setHintText(org.telegram.messenger.dd.L0(2131747476, null));
                str = "street_line1";
            }
            N1(this.f38451s1, this.Y[i13], str);
            if (i13 == 2) {
                this.Y[i13].addTextChangedListener(new gk0(this, editTextBoldCursor, str));
                this.Y[i13].setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            } else {
                this.Y[i13].addTextChangedListener(new hk0(this, editTextBoldCursor, str, 0));
            }
            EditTextBoldCursor editTextBoldCursor3 = this.Y[i13];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.Y[i13].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.Y[i13];
            if (!org.telegram.messenger.dd.X) {
                i15 = 3;
            }
            editTextBoldCursor4.setGravity(i15 | 16);
            fk0Var.addView(this.Y[i13], w7.b6.d(-1, 64.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
            this.Y[i13].setOnEditorActionListener(new uj0(this, 4));
        }
        org.telegram.ui.Cells.c7 c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
        this.f38435l0 = c7Var;
        this.f38416c0.addView(c7Var, w7.b6.o(-1, -2));
        if (this.f38456v0 && this.F != null) {
            this.f38431j0.setVisibility(8);
            this.f38435l0.setVisibility(8);
        }
        int i17 = (this.f38415c > j10 ? 1 : (this.f38415c == j10 ? 0 : -1));
        TLRPC.TL_secureValue tL_secureValue = this.I;
        if (((i17 != 0 || this.F == null) && this.H != null && !this.f38456v0) || tL_secureValue != null) {
            if (tL_secureValue != null) {
                X0(tL_secureValue.files);
                Z0(tL_secureValue.translation);
            }
            org.telegram.ui.Cells.c7 c7Var2 = this.f38435l0;
            int i18 = org.telegram.ui.ActionBar.t6.f20893b7;
            org.telegram.ui.ActionBar.a7.a0(c7Var2, context, 2131231230, i18);
            org.telegram.ui.Cells.x9 x9Var3 = new org.telegram.ui.Cells.x9(context);
            org.telegram.ui.ActionBar.a7.V(x9Var3.getTextView(), org.telegram.ui.ActionBar.t6.f21154p7, null);
            org.telegram.ui.Cells.y N03 = org.telegram.ui.ActionBar.t6.N0(true);
            org.telegram.ui.ActionBar.w6 N5 = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f20930d6);
            org.telegram.ui.ActionBar.w6 N6 = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f21021i6);
            x9Var3.setBackground(N03);
            org.telegram.ui.ActionBar.a7.k(x9Var3, N03, N5, N6, null);
            if (this.F == null) {
                x9Var3.b(org.telegram.messenger.dd.L0(2131747603, null), false);
            } else {
                x9Var3.b(org.telegram.messenger.dd.L0(2131747608, null), false);
            }
            this.f38416c0.addView(x9Var3, w7.b6.o(-1, -2));
            x9Var3.setOnClickListener(new wj0(this, 9));
            org.telegram.ui.Cells.c7 c7Var3 = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
            this.f38435l0 = c7Var3;
            org.telegram.ui.ActionBar.a7.a0(c7Var3, context, 2131231231, i18);
            this.f38416c0.addView(this.f38435l0, w7.b6.o(-1, -2));
        } else {
            org.telegram.ui.Cells.c7 c7Var4 = this.f38435l0;
            int i19 = org.telegram.ui.ActionBar.t6.f20893b7;
            org.telegram.ui.ActionBar.a7.a0(c7Var4, context, 2131231231, i19);
            if (this.f38456v0 && this.F != null) {
                org.telegram.ui.ActionBar.a7.a0(this.f38438n0, context, 2131231231, i19);
            }
        }
        X1(0);
        X1(4);
    }

    public final void g1() {
        if (getParentActivity() != null && this.R0 == null) {
            org.telegram.ui.Components.bi biVar = new org.telegram.ui.Components.bi(getParentActivity(), this, false, false);
            this.R0 = biVar;
            biVar.T3 = new ik0(this);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38413b0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21207s8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D8));
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.f38433k0;
            if (i11 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) arrayList2.get(i11), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20931d7));
            i11++;
        }
        for (Map.Entry entry : this.f38439n1.entrySet()) {
            arrayList.add(new org.telegram.ui.ActionBar.c7((hl0) entry.getValue(), 268435456, new Class[]{hl0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20930d6));
        }
        int i12 = org.telegram.ui.ActionBar.t6.f20930d6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38416c0, 268435456, new Class[]{org.telegram.ui.Cells.a9.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38416c0, 268435456, new Class[]{org.telegram.ui.Cells.x9.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38416c0, 268435456, new Class[]{il0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        if (this.Y != null) {
            int i13 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.Y;
                if (i13 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.c7((View) editTextBoldCursorArr[i13].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20930d6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.Y[i13], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.Y[i13], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21059k6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.Y[i13], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21077l6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.Y[i13], 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21154p7));
                i13++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.H6));
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.L6));
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21059k6));
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21077l6));
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21154p7));
        }
        if (this.f38410a0 != null) {
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.f38410a0;
                if (i10 >= editTextBoldCursorArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.c7((View) editTextBoldCursorArr2[i10].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20930d6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38410a0[i10], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38410a0[i10], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21059k6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38410a0[i10], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21077l6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38410a0[i10], 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21154p7));
                i10++;
            }
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.F0, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21003h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.Q, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20978fi));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.Q, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20996gi));
        return arrayList;
    }

    public final void h1() {
        int L;
        int L2;
        boolean[] zArr = {true};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), new qv(25, this, zArr));
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
        String L0 = org.telegram.messenger.dd.L0(2131689472, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = L0;
        boolean z10 = this.f38456v0;
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.E;
        if (z10 && this.F == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeAddress)) {
            x1Var.T = org.telegram.messenger.dd.L0(2131747609, null);
        } else if (z10 && this.F == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            x1Var.T = org.telegram.messenger.dd.L0(2131747602, null);
        } else {
            x1Var.T = org.telegram.messenger.dd.L0(2131747606, null);
        }
        if (!this.f38456v0 && this.F != null) {
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(getParentActivity(), 1);
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.t6.N0(false);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f21021i6);
            c2Var.setBackground(N0);
            org.telegram.ui.ActionBar.a7.k(c2Var, N0, null, N, null);
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                c2Var.e(org.telegram.messenger.dd.L0(2131747607, null), "", true, false, false);
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                c2Var.e(org.telegram.messenger.dd.L0(2131747605, null), "", true, false, false);
            }
            if (org.telegram.messenger.dd.X) {
                L = org.telegram.messenger.i0.L(16.0f);
            } else {
                L = org.telegram.messenger.i0.L(8.0f);
            }
            if (org.telegram.messenger.dd.X) {
                L2 = org.telegram.messenger.i0.L(8.0f);
            } else {
                L2 = org.telegram.messenger.i0.L(16.0f);
            }
            c2Var.setPadding(L, 0, L2, 0);
            frameLayout.addView(c2Var, w7.b6.e(-1, 48, 51));
            c2Var.setOnClickListener(new j8(4, zArr));
            alertDialog$Builder.o(frameLayout);
        }
        showDialog(x1Var);
    }

    public final void i1(Context context) {
        int i10;
        String str;
        int i11;
        String str2;
        String str3;
        int i12;
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
            org.telegram.messenger.f8.g(e, true);
        }
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
        this.f38442p0 = b9Var;
        int i13 = org.telegram.ui.ActionBar.t6.f20893b7;
        org.telegram.ui.ActionBar.a7.a0(b9Var, context, 2131231232, i13);
        this.f38442p0.setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, 0);
        int i14 = -1;
        this.f38416c0.addView(this.f38442p0, w7.b6.o(-1, -2));
        e1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.E;
        org.telegram.ui.ActionBar.p6 p6Var = null;
        if (tL_secureRequiredType != null) {
            org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context);
            this.f38431j0 = p4Var;
            if (this.f38456v0) {
                p4Var.setText(org.telegram.messenger.dd.L0(2131747592, null));
            } else {
                p4Var.setText(org.telegram.messenger.dd.L0(2131747491, null));
            }
            org.telegram.ui.Cells.p4 p4Var2 = this.f38431j0;
            int i15 = org.telegram.ui.ActionBar.t6.f20930d6;
            org.telegram.ui.ActionBar.a7.i(i15, p4Var2, null);
            this.f38416c0.addView(this.f38431j0, w7.b6.o(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.f38420e0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f38416c0.addView(this.f38420e0, w7.b6.o(-1, -2));
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            this.U = a9Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.t6.N0(true);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i15);
            int i16 = org.telegram.ui.ActionBar.t6.f21021i6;
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i16);
            a9Var.setBackground(N0);
            org.telegram.ui.ActionBar.a7.k(a9Var, N0, N, N2, null);
            this.f38416c0.addView(this.U, w7.b6.o(-1, -2));
            this.U.setOnClickListener(new wj0(this, 0));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.f38423f0 = linearLayout2;
            linearLayout2.setOrientation(1);
            this.f38416c0.addView(this.f38423f0, w7.b6.o(-1, -2));
            boolean z10 = this.F.selfie_required;
            org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context);
            this.V = a9Var2;
            org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.t6.N0(true);
            org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i15);
            org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i16);
            a9Var2.setBackground(N02);
            org.telegram.ui.ActionBar.a7.k(a9Var2, N02, N3, N4, null);
            this.V.a(org.telegram.messenger.dd.L0(2131747488, null), org.telegram.messenger.dd.L0(2131747487, null), z10);
            this.f38416c0.addView(this.V, w7.b6.o(-1, -2));
            this.V.setOnClickListener(new wj0(this, 2));
            if (this.F.selfie_required) {
                LinearLayout linearLayout3 = new LinearLayout(context);
                this.f38425g0 = linearLayout3;
                linearLayout3.setOrientation(1);
                this.f38416c0.addView(this.f38425g0, w7.b6.o(-1, -2));
                org.telegram.ui.Cells.a9 a9Var3 = new org.telegram.ui.Cells.a9(context);
                this.W = a9Var3;
                org.telegram.ui.Cells.y N03 = org.telegram.ui.ActionBar.t6.N0(true);
                org.telegram.ui.ActionBar.w6 N5 = org.telegram.ui.ActionBar.a7.N(i15);
                org.telegram.ui.ActionBar.w6 N6 = org.telegram.ui.ActionBar.a7.N(i16);
                a9Var3.setBackground(N03);
                org.telegram.ui.ActionBar.a7.k(a9Var3, N03, N5, N6, null);
                this.W.a(org.telegram.messenger.dd.L0(2131747479, null), org.telegram.messenger.dd.L0(2131747478, null), tL_secureRequiredType2.translation_required);
                this.f38416c0.addView(this.W, w7.b6.o(-1, -2));
                this.W.setOnClickListener(new wj0(this, 3));
            }
            org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context);
            this.f38438n0 = b9Var2;
            org.telegram.ui.ActionBar.a7.a0(b9Var2, context, 2131231230, i13);
            this.f38438n0.setText(org.telegram.messenger.dd.L0(2131747505, null));
            this.f38416c0.addView(this.f38438n0, w7.b6.o(-1, -2));
            if (this.F.translation_required) {
                org.telegram.ui.Cells.p4 p4Var3 = new org.telegram.ui.Cells.p4(context);
                this.f38431j0 = p4Var3;
                p4Var3.setText(org.telegram.messenger.dd.L0(2131747471, null));
                org.telegram.ui.ActionBar.a7.i(i15, this.f38431j0, null);
                this.f38416c0.addView(this.f38431j0, w7.b6.o(-1, -2));
                LinearLayout linearLayout4 = new LinearLayout(context);
                this.f38427h0 = linearLayout4;
                linearLayout4.setOrientation(1);
                this.f38416c0.addView(this.f38427h0, w7.b6.o(-1, -2));
                org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
                this.X = x9Var;
                org.telegram.ui.Cells.y N04 = org.telegram.ui.ActionBar.t6.N0(true);
                org.telegram.ui.ActionBar.w6 N7 = org.telegram.ui.ActionBar.a7.N(i15);
                org.telegram.ui.ActionBar.w6 N8 = org.telegram.ui.ActionBar.a7.N(i16);
                x9Var.setBackground(N04);
                org.telegram.ui.ActionBar.a7.k(x9Var, N04, N7, N8, null);
                this.f38416c0.addView(this.X, w7.b6.o(-1, -2));
                this.X.setOnClickListener(new wj0(this, 4));
                org.telegram.ui.Cells.b9 b9Var3 = new org.telegram.ui.Cells.b9(context);
                this.f38440o0 = b9Var3;
                org.telegram.ui.ActionBar.a7.a0(b9Var3, context, 2131231230, i13);
                if (this.f38415c != 0) {
                    this.A1 = org.telegram.messenger.dd.L0(2131747619, null);
                } else {
                    TLRPC.SecureValueType secureValueType = this.F.type;
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
                        this.A1 = org.telegram.messenger.dd.L0(2131747629, null);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                        this.A1 = org.telegram.messenger.dd.L0(2131747632, null);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                        this.A1 = org.telegram.messenger.dd.L0(2131747634, null);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                        this.A1 = org.telegram.messenger.dd.L0(2131747635, null);
                    } else {
                        this.A1 = "";
                    }
                }
                String str4 = this.A1;
                HashMap hashMap = this.f38463x1;
                String str5 = str4;
                if (hashMap != null) {
                    String str6 = (String) hashMap.get("translation_all");
                    str5 = str4;
                    if (str6 != null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str6);
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) this.A1);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.f21154p7, null), 0, str6.length(), 33);
                        this.f38466y1.put("translation_all", "");
                        str5 = spannableStringBuilder;
                    }
                }
                this.f38440o0.setText(str5);
                this.f38416c0.addView(this.f38440o0, w7.b6.o(-1, -2));
            }
        } else {
            org.telegram.ui.Cells.x9 x9Var2 = new org.telegram.ui.Cells.x9(context);
            this.f38447r0 = x9Var2;
            org.telegram.ui.Cells.y N05 = org.telegram.ui.ActionBar.t6.N0(true);
            org.telegram.ui.ActionBar.w6 N9 = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f20930d6);
            org.telegram.ui.ActionBar.w6 N10 = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f21021i6);
            x9Var2.setBackground(N05);
            org.telegram.ui.ActionBar.a7.k(x9Var2, N05, N9, N10, null);
            this.f38447r0.b(org.telegram.messenger.dd.L0(2131747486, null), false);
            this.f38416c0.addView(this.f38447r0, w7.b6.o(-1, -2));
            this.f38447r0.setOnClickListener(new wj0(this, 5));
            org.telegram.ui.Cells.b9 b9Var4 = new org.telegram.ui.Cells.b9(context);
            this.f38438n0 = b9Var4;
            org.telegram.ui.ActionBar.a7.a0(b9Var4, context, 2131231230, i13);
            this.f38438n0.setText(org.telegram.messenger.dd.L0(2131747485, null));
            this.f38416c0.addView(this.f38438n0, w7.b6.o(-1, -2));
        }
        org.telegram.ui.Cells.p4 p4Var4 = new org.telegram.ui.Cells.p4(context);
        this.f38431j0 = p4Var4;
        if (this.f38456v0) {
            p4Var4.setText(org.telegram.messenger.dd.L0(2131747594, null));
        } else {
            p4Var4.setText(org.telegram.messenger.dd.L0(2131747508, null));
        }
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, this.f38431j0, null);
        this.f38416c0.addView(this.f38431j0, w7.b6.o(-1, -2));
        int i17 = 7;
        if (this.F != null) {
            i10 = 9;
        } else {
            i10 = 7;
        }
        this.Y = new EditTextBoldCursor[i10];
        int i18 = 0;
        while (true) {
            int i19 = 6;
            HashMap hashMap2 = this.f38451s1;
            if (i18 < i10) {
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.Y[i18] = editTextBoldCursor;
                fk0 fk0Var = new fk0(context, editTextBoldCursor, 1);
                fk0Var.setWillNotDraw(false);
                this.f38416c0.addView(fk0Var, w7.b6.o(i14, 64));
                int i20 = org.telegram.ui.ActionBar.t6.f20930d6;
                org.telegram.ui.ActionBar.a7.i(i20, fk0Var, p6Var);
                if (i18 == i10 - 1) {
                    View view = new View(context);
                    this.S = view;
                    org.telegram.ui.ActionBar.a7.i(i20, view, p6Var);
                    this.f38416c0.addView(this.S, w7.b6.o(i14, 6));
                }
                if (this.f38456v0 && this.F != null && i18 < i17) {
                    fk0Var.setVisibility(8);
                    View view2 = this.S;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                }
                this.Y[i18].setTag(Integer.valueOf(i18));
                this.Y[i18].setSupportRtlHint(true);
                this.Y[i18].setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.a7.B(this.Y[i18], org.telegram.ui.ActionBar.t6.H6, null);
                EditTextBoldCursor editTextBoldCursor2 = this.Y[i18];
                int i21 = org.telegram.ui.ActionBar.t6.G6;
                org.telegram.ui.ActionBar.a7.V(editTextBoldCursor2, i21, null);
                org.telegram.ui.ActionBar.a7.A(this.Y[i18], org.telegram.ui.ActionBar.t6.L6, null);
                this.Y[i18].setTransformHintToHeader(true);
                this.Y[i18].setBackgroundDrawable(null);
                org.telegram.ui.ActionBar.a7.w(this.Y[i18], i21, null);
                this.Y[i18].setCursorSize(org.telegram.messenger.i0.L(20.0f));
                this.Y[i18].setCursorWidth(1.5f);
                org.telegram.ui.ActionBar.a7.G(this.Y[i18], org.telegram.ui.ActionBar.t6.f21059k6, org.telegram.ui.ActionBar.t6.f21077l6, org.telegram.ui.ActionBar.t6.f21154p7, null);
                if (i18 != 5 && i18 != 6) {
                    if (i18 != 3 && i18 != 8) {
                        if (i18 == 4) {
                            this.Y[i18].setOnTouchListener(new xj0(this, 1));
                            this.Y[i18].setInputType(0);
                            this.Y[i18].setFocusable(false);
                        } else {
                            this.Y[i18].setInputType(16385);
                            this.Y[i18].setImeOptions(268435461);
                        }
                    } else {
                        this.Y[i18].setOnTouchListener(new org.telegram.ui.ActionBar.d1(6, this, context));
                        this.Y[i18].setInputType(0);
                        this.Y[i18].setFocusable(false);
                    }
                } else {
                    this.Y[i18].setOnTouchListener(new xj0(this, 0));
                    this.Y[i18].setInputType(0);
                }
                HashMap hashMap3 = this.f38453t1;
                switch (i18) {
                    case 0:
                        if (tL_secureRequiredType2.native_names) {
                            this.Y[i18].setHintText(org.telegram.messenger.dd.L0(2131747517, null));
                        } else {
                            this.Y[i18].setHintText(org.telegram.messenger.dd.L0(2131747520, null));
                        }
                        str2 = "first_name";
                        break;
                    case 1:
                        if (tL_secureRequiredType2.native_names) {
                            this.Y[i18].setHintText(org.telegram.messenger.dd.L0(2131747521, null));
                        } else {
                            this.Y[i18].setHintText(org.telegram.messenger.dd.L0(2131747523, null));
                        }
                        str2 = "middle_name";
                        break;
                    case 2:
                        if (tL_secureRequiredType2.native_names) {
                            this.Y[i18].setHintText(org.telegram.messenger.dd.L0(2131747472, null));
                        } else {
                            this.Y[i18].setHintText(org.telegram.messenger.dd.L0(2131747474, null));
                        }
                        str2 = "last_name";
                        break;
                    case 3:
                        this.Y[i18].setHintText(org.telegram.messenger.dd.L0(2131747613, null));
                        str2 = "birth_date";
                        break;
                    case 4:
                        this.Y[i18].setHintText(org.telegram.messenger.dd.L0(2131747582, null));
                        str2 = "gender";
                        break;
                    case 5:
                        this.Y[i18].setHintText(org.telegram.messenger.dd.L0(2131747612, null));
                        str2 = "country_code";
                        break;
                    case 6:
                        this.Y[i18].setHintText(org.telegram.messenger.dd.L0(2131747490, null));
                        str2 = "residence_country_code";
                        break;
                    case 7:
                        this.Y[i18].setHintText(org.telegram.messenger.dd.L0(2131747593, null));
                        str3 = "document_no";
                        String str7 = str3;
                        hashMap2 = hashMap3;
                        str2 = str7;
                        break;
                    case 8:
                        this.Y[i18].setHintText(org.telegram.messenger.dd.L0(2131747586, null));
                        str3 = "expiry_date";
                        String str72 = str3;
                        hashMap2 = hashMap3;
                        str2 = str72;
                        break;
                    default:
                        i18++;
                        i17 = 7;
                        i14 = -1;
                        p6Var = null;
                }
                N1(hashMap2, this.Y[i18], str2);
                EditTextBoldCursor editTextBoldCursor3 = this.Y[i18];
                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                if (i18 != 0 && i18 != 2 && i18 != 1) {
                    this.Y[i18].addTextChangedListener(new org.telegram.ui.Components.qw0(this, editTextBoldCursor, str2, hashMap2));
                } else {
                    this.Y[i18].addTextChangedListener(new hk0(this, editTextBoldCursor, str2, 1));
                }
                this.Y[i18].setPadding(0, 0, 0, 0);
                EditTextBoldCursor editTextBoldCursor4 = this.Y[i18];
                if (org.telegram.messenger.dd.X) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                editTextBoldCursor4.setGravity(i12 | 16);
                fk0Var.addView(this.Y[i18], w7.b6.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                this.Y[i18].setOnEditorActionListener(new uj0(this, 1));
                i18++;
                i17 = 7;
                i14 = -1;
                p6Var = null;
            } else {
                org.telegram.ui.Cells.c7 c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                this.m0 = c7Var;
                this.f38416c0.addView(c7Var, w7.b6.o(-1, -2));
                org.telegram.ui.Cells.p4 p4Var5 = new org.telegram.ui.Cells.p4(context);
                this.f38431j0 = p4Var5;
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, p4Var5, null);
                this.f38416c0.addView(this.f38431j0, w7.b6.o(-1, -2));
                this.f38410a0 = new EditTextBoldCursor[3];
                int i22 = 0;
                for (int i23 = 3; i22 < i23; i23 = 3) {
                    EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
                    this.f38410a0[i22] = editTextBoldCursor5;
                    fk0 fk0Var2 = new fk0(context, editTextBoldCursor5, 2);
                    fk0Var2.setWillNotDraw(false);
                    this.f38416c0.addView(fk0Var2, w7.b6.o(-1, 64));
                    int i24 = org.telegram.ui.ActionBar.t6.f20930d6;
                    org.telegram.ui.ActionBar.a7.i(i24, fk0Var2, null);
                    if (i22 == 2) {
                        View view3 = new View(context);
                        this.T = view3;
                        org.telegram.ui.ActionBar.a7.i(i24, view3, null);
                        this.f38416c0.addView(this.T, w7.b6.o(-1, i19));
                    }
                    this.f38410a0[i22].setTag(Integer.valueOf(i22));
                    this.f38410a0[i22].setSupportRtlHint(true);
                    this.f38410a0[i22].setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.a7.B(this.f38410a0[i22], org.telegram.ui.ActionBar.t6.H6, null);
                    EditTextBoldCursor editTextBoldCursor6 = this.f38410a0[i22];
                    int i25 = org.telegram.ui.ActionBar.t6.G6;
                    org.telegram.ui.ActionBar.a7.V(editTextBoldCursor6, i25, null);
                    org.telegram.ui.ActionBar.a7.A(this.f38410a0[i22], org.telegram.ui.ActionBar.t6.L6, null);
                    this.f38410a0[i22].setTransformHintToHeader(true);
                    this.f38410a0[i22].setBackgroundDrawable(null);
                    org.telegram.ui.ActionBar.a7.w(this.f38410a0[i22], i25, null);
                    this.f38410a0[i22].setCursorSize(org.telegram.messenger.i0.L(20.0f));
                    this.f38410a0[i22].setCursorWidth(1.5f);
                    org.telegram.ui.ActionBar.a7.G(this.f38410a0[i22], org.telegram.ui.ActionBar.t6.f21059k6, org.telegram.ui.ActionBar.t6.f21077l6, org.telegram.ui.ActionBar.t6.f21154p7, null);
                    this.f38410a0[i22].setInputType(16385);
                    this.f38410a0[i22].setImeOptions(268435461);
                    if (i22 != 0) {
                        if (i22 != 1) {
                            if (i22 == 2) {
                                str = "last_name_native";
                            } else {
                                i22++;
                                i19 = 6;
                            }
                        } else {
                            str = "middle_name_native";
                        }
                    } else {
                        str = "first_name_native";
                    }
                    N1(hashMap2, this.f38410a0[i22], str);
                    EditTextBoldCursor editTextBoldCursor7 = this.f38410a0[i22];
                    editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
                    if (i22 == 0 || i22 == 2 || i22 == 1) {
                        this.f38410a0[i22].addTextChangedListener(new hk0(this, editTextBoldCursor5, str, 2));
                    }
                    this.f38410a0[i22].setPadding(0, 0, 0, 0);
                    EditTextBoldCursor editTextBoldCursor8 = this.f38410a0[i22];
                    if (org.telegram.messenger.dd.X) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    editTextBoldCursor8.setGravity(i11 | 16);
                    fk0Var2.addView(this.f38410a0[i22], w7.b6.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.f38410a0[i22].setOnEditorActionListener(new uj0(this, 2));
                    i22++;
                    i19 = 6;
                }
                org.telegram.ui.Cells.b9 b9Var5 = new org.telegram.ui.Cells.b9(context);
                this.f38444q0 = b9Var5;
                this.f38416c0.addView(b9Var5, w7.b6.o(-1, -2));
                int i26 = (this.f38415c > 0L ? 1 : (this.f38415c == 0L ? 0 : -1));
                TLRPC.TL_secureValue tL_secureValue = this.I;
                if (((i26 != 0 || this.F == null) && this.H != null && !this.f38456v0) || tL_secureValue != null) {
                    if (tL_secureValue != null) {
                        X0(tL_secureValue.files);
                        TLRPC.SecureFile secureFile = tL_secureValue.front_side;
                        if (secureFile instanceof TLRPC.TL_secureFile) {
                            W0((TLRPC.TL_secureFile) secureFile, 2);
                        }
                        TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                        if (secureFile2 instanceof TLRPC.TL_secureFile) {
                            W0((TLRPC.TL_secureFile) secureFile2, 3);
                        }
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            W0((TLRPC.TL_secureFile) secureFile3, 1);
                        }
                        Z0(tL_secureValue.translation);
                    }
                    org.telegram.ui.Cells.x9 x9Var3 = new org.telegram.ui.Cells.x9(context);
                    org.telegram.ui.ActionBar.a7.V(x9Var3.getTextView(), org.telegram.ui.ActionBar.t6.f21154p7, null);
                    org.telegram.ui.Cells.y N06 = org.telegram.ui.ActionBar.t6.N0(true);
                    org.telegram.ui.ActionBar.w6 N11 = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f20930d6);
                    org.telegram.ui.ActionBar.w6 N12 = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f21021i6);
                    x9Var3.setBackground(N06);
                    org.telegram.ui.ActionBar.a7.k(x9Var3, N06, N11, N12, null);
                    if (this.F == null) {
                        x9Var3.b(org.telegram.messenger.dd.L0(2131747603, null), false);
                    } else {
                        x9Var3.b(org.telegram.messenger.dd.L0(2131747608, null), false);
                    }
                    this.f38416c0.addView(x9Var3, w7.b6.o(-1, -2));
                    x9Var3.setOnClickListener(new wj0(this, 1));
                    org.telegram.ui.Cells.b9 b9Var6 = this.f38444q0;
                    int i27 = org.telegram.ui.ActionBar.t6.f20893b7;
                    org.telegram.ui.ActionBar.a7.a0(b9Var6, context, 2131231230, i27);
                    org.telegram.ui.Cells.c7 c7Var2 = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                    this.f38435l0 = c7Var2;
                    org.telegram.ui.ActionBar.a7.a0(c7Var2, context, 2131231231, i27);
                    this.f38416c0.addView(this.f38435l0, w7.b6.o(-1, -2));
                } else {
                    org.telegram.ui.ActionBar.a7.a0(this.f38444q0, context, 2131231231, org.telegram.ui.ActionBar.t6.f20893b7);
                }
                U1();
                c1(false);
                return;
            }
        }
    }

    public final void j1(android.content.Context r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jl0.j1(android.content.Context):void");
    }

    public final void k1(Context context) {
        String str;
        String str2;
        TelephonyManager telephonyManager;
        ViewGroup frameLayout;
        this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131747504, null));
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
            org.telegram.messenger.f8.g(e, true);
        }
        Collections.sort(this.U0, new a4.d(11));
        String str3 = org.telegram.messenger.e20.i(this.currentAccount).f().phone;
        org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
        org.telegram.ui.ActionBar.a7.V(x9Var.getTextView(), org.telegram.ui.ActionBar.t6.q6, null);
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.t6.N0(true);
        int i10 = org.telegram.ui.ActionBar.t6.f20930d6;
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f21021i6);
        x9Var.setBackground(N0);
        org.telegram.ui.ActionBar.a7.k(x9Var, N0, N, N2, null);
        x9Var.b(org.telegram.messenger.dd.a0("PassportPhoneUseSame", null, 2131747500, af.b.c().b("+" + str3)), false);
        this.f38416c0.addView(x9Var, w7.b6.o(-1, -2));
        x9Var.setOnClickListener(new wj0(this, 16));
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
        this.f38438n0 = b9Var;
        org.telegram.ui.ActionBar.a7.a0(b9Var, context, 2131231231, org.telegram.ui.ActionBar.t6.f20893b7);
        this.f38438n0.setText(org.telegram.messenger.dd.L0(2131747498, null));
        this.f38416c0.addView(this.f38438n0, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context);
        this.f38431j0 = p4Var;
        p4Var.setText(org.telegram.messenger.dd.L0(2131747501, null));
        org.telegram.ui.ActionBar.a7.i(i10, this.f38431j0, null);
        this.f38416c0.addView(this.f38431j0, w7.b6.o(-1, -2));
        this.Y = new EditTextBoldCursor[3];
        for (int i11 = 0; i11 < 3; i11++) {
            if (i11 == 2) {
                this.Y[i11] = new org.telegram.ui.Components.n30(context);
            } else {
                this.Y[i11] = new EditTextBoldCursor(context);
            }
            if (i11 == 1) {
                frameLayout = org.telegram.messenger.m5.f(context, 0);
                this.f38416c0.addView(frameLayout, w7.b6.o(-1, 50));
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, frameLayout, null);
            } else if (i11 == 2) {
                frameLayout = (ViewGroup) this.Y[1].getParent();
            } else {
                frameLayout = new FrameLayout(context);
                this.f38416c0.addView(frameLayout, w7.b6.o(-1, 50));
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, frameLayout, null);
            }
            this.Y[i11].setTag(Integer.valueOf(i11));
            this.Y[i11].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.a7.E(this.Y[i11], org.telegram.ui.ActionBar.t6.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.Y[i11];
            int i12 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i12, null);
            this.Y[i11].setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.a7.w(this.Y[i11], i12, null);
            this.Y[i11].setCursorSize(org.telegram.messenger.i0.L(20.0f));
            this.Y[i11].setCursorWidth(1.5f);
            if (i11 == 0) {
                this.Y[i11].setOnTouchListener(new xj0(this, 3));
                this.Y[i11].setText(org.telegram.messenger.dd.L0(2131752134, null));
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
                this.f38459w0 = textView;
                textView.setText("+");
                org.telegram.ui.ActionBar.a7.V(this.f38459w0, i12, null);
                this.f38459w0.setTextSize(1, 16.0f);
                frameLayout.addView(this.f38459w0, w7.b6.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                this.Y[i11].setPadding(org.telegram.messenger.i0.L(10.0f), 0, 0, 0);
                this.Y[i11].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                this.Y[i11].setGravity(19);
                frameLayout.addView(this.Y[i11], w7.b6.k(0.0f, 12.0f, 16.0f, 6.0f, 55, -2));
                this.Y[i11].addTextChangedListener(new sk0(this, 1));
            } else if (i11 == 2) {
                this.Y[i11].setPadding(0, 0, 0, 0);
                this.Y[i11].setGravity(19);
                this.Y[i11].setHintText(null);
                this.Y[i11].setHint(org.telegram.messenger.dd.L0(2131747388, null));
                frameLayout.addView(this.Y[i11], w7.b6.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                this.Y[i11].addTextChangedListener(new yr(this, 3));
            } else {
                this.Y[i11].setPadding(0, 0, 0, org.telegram.messenger.i0.L(6.0f));
                EditTextBoldCursor editTextBoldCursor3 = this.Y[i11];
                if (!org.telegram.messenger.dd.X) {
                    i13 = 3;
                }
                editTextBoldCursor3.setGravity(i13);
                frameLayout.addView(this.Y[i11], w7.b6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            }
            this.Y[i11].setOnEditorActionListener(new uj0(this, 0));
            if (i11 == 2) {
                this.Y[i11].setOnKeyListener(new og(this, 1));
            }
            if (i11 == 0) {
                View view = new View(context);
                this.f38433k0.add(view);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20931d7, view, null);
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, 1, 83));
            }
        }
        try {
            telephonyManager = (TelephonyManager) org.telegram.messenger.w0.f18945b.getSystemService("phone");
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
        if (telephonyManager != null) {
            str = telephonyManager.getSimCountryIso().toUpperCase();
            if (str != null && (str2 = (String) this.Y0.get(str)) != null && this.U0.indexOf(str2) != -1) {
                this.Y[1].setText((CharSequence) this.V0.get(str2));
            }
            org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context);
            this.f38438n0 = b9Var2;
            org.telegram.ui.ActionBar.a7.a0(b9Var2, context, 2131231231, org.telegram.ui.ActionBar.t6.f20893b7);
            this.f38438n0.setText(org.telegram.messenger.dd.L0(2131747502, null));
            this.f38416c0.addView(this.f38438n0, w7.b6.o(-1, -2));
        }
        str = null;
        if (str != null) {
            this.Y[1].setText((CharSequence) this.V0.get(str2));
        }
        org.telegram.ui.Cells.b9 b9Var22 = new org.telegram.ui.Cells.b9(context);
        this.f38438n0 = b9Var22;
        org.telegram.ui.ActionBar.a7.a0(b9Var22, context, 2131231231, org.telegram.ui.ActionBar.t6.f20893b7);
        this.f38438n0.setText(org.telegram.messenger.dd.L0(2131747502, null));
        this.f38416c0.addView(this.f38438n0, w7.b6.o(-1, -2));
    }

    public final byte[] m1(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32 || bArr2 == null || bArr2.length != 32) {
            return null;
        }
        byte[] bArr3 = new byte[32];
        System.arraycopy(this.f38421e1, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(this.f38421e1, 32, bArr4, 0, 16);
        byte[] bArr5 = new byte[32];
        System.arraycopy(this.f38417c1, 0, bArr5, 0, 32);
        Utilities.b(bArr5, bArr3, bArr4, 0, 32, 0, 0);
        if (!d1(bArr5, null)) {
            return null;
        }
        byte[] r10 = Utilities.r(bArr5, bArr2);
        byte[] bArr6 = new byte[32];
        System.arraycopy(r10, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(r10, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(bArr, 0, bArr8, 0, 32);
        Utilities.b(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        return bArr8;
    }

    public final void n1(final TLRPC.TL_secureRequiredType tL_secureRequiredType, final TLRPC.TL_secureRequiredType tL_secureRequiredType2, final ArrayList arrayList, final boolean z10, final vj0 vj0Var, final yj0 yj0Var, final boolean z11) {
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
                final jl0 jl0Var = jl0.this;
                final xk0 xk0Var = yj0Var;
                final boolean z12 = z11;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType3 = tL_secureRequiredType2;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                final boolean z13 = z10;
                final ArrayList arrayList2 = arrayList;
                final Runnable runnable = vj0Var;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        TLRPC.TL_secureData tL_secureData;
                        String str2;
                        LinearLayout linearLayout;
                        jl0 jl0Var2 = jl0.this;
                        TLRPC.TL_error tL_error2 = tL_error;
                        String str3 = null;
                        if (tL_error2 != null) {
                            xk0 xk0Var2 = xk0Var;
                            if (xk0Var2 != null) {
                                xk0Var2.d(tL_error2.text, null);
                            }
                            jl0Var2.Q1(org.telegram.messenger.dd.L0(2131689472, null), tL_error2.text);
                            return;
                        }
                        boolean z14 = z12;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType3;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType4;
                        boolean z15 = z13;
                        if (z14) {
                            if (tL_secureRequiredType5 != null) {
                                jl0Var2.L1(tL_secureRequiredType5);
                            } else {
                                jl0Var2.L1(tL_secureRequiredType6);
                            }
                        } else {
                            if (z15) {
                                jl0Var2.L1(tL_secureRequiredType6);
                            }
                            jl0Var2.L1(tL_secureRequiredType5);
                        }
                        int i10 = 0;
                        if (jl0Var2.f38412b == 8) {
                            il0 il0Var = (il0) jl0Var2.f38445q1.remove(tL_secureRequiredType6);
                            if (il0Var != null) {
                                jl0Var2.f38416c0.removeView(il0Var);
                                View childAt = jl0Var2.f38416c0.getChildAt(linearLayout.getChildCount() - 6);
                                if (childAt instanceof il0) {
                                    ((il0) childAt).setNeedDivider(false);
                                }
                            }
                            jl0Var2.V1();
                        } else {
                            ArrayList arrayList3 = arrayList2;
                            if (tL_secureRequiredType5 != null && arrayList3 != null && arrayList3.size() > 1) {
                                int size = arrayList3.size();
                                int i11 = 0;
                                while (true) {
                                    if (i11 < size) {
                                        TLRPC.TL_secureRequiredType tL_secureRequiredType7 = (TLRPC.TL_secureRequiredType) arrayList3.get(i11);
                                        TLRPC.TL_secureValue v12 = jl0Var2.v1(tL_secureRequiredType7, false);
                                        if (v12 != null) {
                                            TLRPC.TL_secureData tL_secureData2 = v12.data;
                                            if (tL_secureData2 != null) {
                                                str2 = jl0.l1(tL_secureData2.data, jl0Var2.m1(tL_secureData2.secret, tL_secureData2.data_hash), v12.data.data_hash);
                                            } else {
                                                str2 = null;
                                            }
                                            str = str2;
                                            tL_secureRequiredType5 = tL_secureRequiredType7;
                                        } else {
                                            i11++;
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
                                    i10 = arrayList3.size();
                                }
                                jl0Var2.P1(tL_secureRequiredType6, null, null, tL_secureRequiredType5, str, z14, i10);
                            } else {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType8 = tL_secureRequiredType5;
                                String str4 = str;
                                TLRPC.TL_secureValue v13 = jl0Var2.v1(tL_secureRequiredType6, false);
                                if (v13 != null && (tL_secureData = v13.data) != null) {
                                    str3 = jl0.l1(tL_secureData.data, jl0Var2.m1(tL_secureData.secret, tL_secureData.data_hash), v13.data.data_hash);
                                }
                                if (arrayList3 != null) {
                                    i10 = arrayList3.size();
                                }
                                jl0Var2.P1(tL_secureRequiredType6, null, str3, tL_secureRequiredType8, str4, z14, i10);
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

    public final bh.d o1(byte[] bArr) {
        byte[] t12 = t1();
        int nextInt = Utilities.f14520b.nextInt(208) + 32;
        while ((bArr.length + nextInt) % 16 != 0) {
            nextInt++;
        }
        byte[] bArr2 = new byte[nextInt];
        Utilities.f14520b.nextBytes(bArr2);
        bArr2[0] = (byte) nextInt;
        int length = nextInt + bArr.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, nextInt);
        System.arraycopy(bArr, 0, bArr3, nextInt, bArr.length);
        byte[] o10 = Utilities.o(length, bArr3);
        byte[] r10 = Utilities.r(t12, o10);
        byte[] bArr4 = new byte[32];
        System.arraycopy(r10, 0, bArr4, 0, 32);
        byte[] bArr5 = new byte[16];
        System.arraycopy(r10, 32, bArr5, 0, 16);
        Utilities.b(bArr3, bArr4, bArr5, 0, length, 0, 1);
        byte[] bArr6 = new byte[32];
        System.arraycopy(this.f38421e1, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(this.f38421e1, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(this.f38417c1, 0, bArr8, 0, 32);
        Utilities.b(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        byte[] r11 = Utilities.r(bArr8, o10);
        byte[] bArr9 = new byte[32];
        System.arraycopy(r11, 0, bArr9, 0, 32);
        byte[] bArr10 = new byte[16];
        System.arraycopy(r11, 32, bArr10, 0, 16);
        byte[] bArr11 = new byte[32];
        System.arraycopy(t12, 0, bArr11, 0, 32);
        Utilities.b(bArr11, bArr9, bArr10, 0, 32, 0, 1);
        ?? obj = new Object();
        obj.f2779c = bArr3;
        obj.f2777a = bArr11;
        obj.d = o10;
        obj.f2778b = t12;
        obj.e = new org.telegram.messenger.rw(bArr4, bArr5);
        return obj;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i11 == -1) {
            if (i10 != 0 && i10 != 2) {
                if (i10 == 1) {
                    if (intent != null && intent.getData() != null) {
                        ArrayList arrayList = new ArrayList();
                        ?? obj = new Object();
                        obj.f17848a = intent.getData();
                        arrayList.add(obj);
                        K1(arrayList);
                        return;
                    } else if (getParentActivity() != null) {
                        Toast.makeText(getParentActivity(), org.telegram.messenger.dd.L0(2131743858, null), 0).show();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            g1();
            org.telegram.ui.Components.bi biVar = this.R0;
            if (biVar != null) {
                biVar.a2.h0(i10, intent, this.Q0);
            }
            this.Q0 = null;
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i10 = this.f38412b;
        if (i10 == 7) {
            if (z10) {
                int i11 = this.I1;
                org.telegram.ui.Components.av0[] av0VarArr = this.J1;
                av0VarArr[i11].c(true);
                for (org.telegram.ui.Components.av0 av0Var : av0VarArr) {
                    if (av0Var != null) {
                        av0Var.f();
                    }
                }
            }
        } else if (i10 != 0 && i10 != 5) {
            if (i10 == 1 || i10 == 2) {
                return !b1(z10);
            }
        } else if (z10) {
            a1(false);
        }
        return true;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        if (this.f38412b == 3 && dialog == this.L1) {
            ArrayList arrayList = this.M1;
            if (!arrayList.isEmpty()) {
                getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.U1);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.V1);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14761p0);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14773r0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.U1);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.V1);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14761p0);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14773r0);
        int i10 = 0;
        a1(false);
        org.telegram.ui.Components.bi biVar = this.R0;
        if (biVar != null) {
            biVar.L();
            this.R0.i1();
        }
        if (this.f38412b == 7) {
            while (true) {
                org.telegram.ui.Components.av0[] av0VarArr = this.J1;
                if (i10 >= av0VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.av0 av0Var = av0VarArr[i10];
                if (av0Var != null) {
                    av0Var.f();
                }
                i10++;
            }
            org.telegram.ui.ActionBar.x1 x1Var = this.K1;
            if (x1Var != null) {
                try {
                    x1Var.dismiss();
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                this.K1 = null;
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.bi biVar = this.R0;
        if (biVar != null) {
            biVar.k1();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.bi biVar;
        org.telegram.ui.Cells.x9 x9Var;
        int i11 = this.f38412b;
        if ((i11 == 1 || i11 == 2) && (biVar = this.R0) != null) {
            if (i10 == 17) {
                biVar.a2.V(false);
            } else if (i10 == 21) {
                if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String L0 = org.telegram.messenger.dd.L0(2131689472, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    x1Var.R = L0;
                    x1Var.T = org.telegram.messenger.dd.L0(2131747328, null);
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131747316, null), new yj0(this, 0));
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                    alertDialog$Builder.p();
                }
            } else if (i10 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                J1(0);
            } else if (i10 == 22 && iArr != null && iArr.length > 0 && iArr[0] == 0 && (x9Var = this.f38447r0) != null) {
                x9Var.callOnClick();
            }
        } else if (i11 == 3 && i10 == 6) {
            S1(false, this.E1, this.F1, this.G1, this.H1);
        }
    }

    @Override
    public final void onResume() {
        ViewGroup[] viewGroupArr;
        ViewGroup viewGroup;
        super.onResume();
        org.telegram.ui.Components.bi biVar = this.R0;
        if (biVar != null) {
            biVar.l1();
        }
        if (this.f38412b == 5 && (viewGroupArr = this.Z) != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
            this.Y[0].requestFocus();
            org.telegram.messenger.i0.J3(this.Y[0]);
            org.telegram.messenger.i0.h3(new vj0(this, 0), 200L);
        }
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jl0.onThemeColorsChanged():void");
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (this.f38428h1 != null) {
            org.telegram.messenger.i0.g3(new vj0(this, 1));
        }
        int i10 = this.f38412b;
        if (i10 == 5) {
            if (z10) {
                if (this.Z[0].getVisibility() == 0) {
                    this.Y[0].requestFocus();
                    org.telegram.messenger.i0.J3(this.Y[0]);
                }
                if (this.N0 == 2) {
                    F1(false);
                }
            }
        } else if (i10 == 7) {
            if (z10) {
                this.J1[this.I1].j();
            }
        } else if (i10 == 4) {
            if (z10) {
                this.Y[0].requestFocus();
                org.telegram.messenger.i0.J3(this.Y[0]);
            }
        } else if (i10 == 6) {
            if (z10) {
                this.Y[0].requestFocus();
                org.telegram.messenger.i0.J3(this.Y[0]);
            }
        } else if (i10 != 2 && i10 != 1) {
        } else {
            g1();
        }
    }

    public final void p1(Bundle bundle, TLRPC.TL_auth_sentCode tL_auth_sentCode, boolean z10) {
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
            O1(bundle, 2, z10);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", tL_auth_sentCode.type.pattern);
            O1(bundle, 1, z10);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSms) {
            bundle.putInt("type", 2);
            bundle.putInt("length", tL_auth_sentCode.type.length);
            O1(bundle, 0, z10);
        }
    }

    public final String q1() {
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
        if (this.f38410a0 != null) {
            int i11 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.f38410a0;
                if (i11 >= editTextBoldCursorArr2.length) {
                    break;
                }
                sb2.append((CharSequence) editTextBoldCursorArr2[i11].getText());
                sb2.append(",");
                i11++;
            }
        }
        ArrayList arrayList = this.f38430i1;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            sb2.append(((org.telegram.messenger.qw) arrayList.get(i12)).f17824b.f19931id);
        }
        org.telegram.messenger.qw qwVar = this.l1;
        if (qwVar != null) {
            sb2.append(qwVar.f17824b.f19931id);
        }
        org.telegram.messenger.qw qwVar2 = this.f38436m1;
        if (qwVar2 != null) {
            sb2.append(qwVar2.f17824b.f19931id);
        }
        org.telegram.messenger.qw qwVar3 = this.f38432j1;
        if (qwVar3 != null) {
            sb2.append(qwVar3.f17824b.f19931id);
        }
        ArrayList arrayList2 = this.f38434k1;
        int size2 = arrayList2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            sb2.append(((org.telegram.messenger.qw) arrayList2.get(i13)).f17824b.f19931id);
        }
        return sb2.toString();
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.Q0 = bundle.getString("path");
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.Q0;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final TLRPC.TL_secureValue v1(TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z10) {
        String[] strArr;
        if (tL_secureRequiredType != null) {
            int size = this.D.values.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.TL_secureValue tL_secureValue = this.D.values.get(i10);
                if (tL_secureRequiredType.type.getClass() == tL_secureValue.type.getClass()) {
                    if (z10) {
                        if (!tL_secureRequiredType.selfie_required || (tL_secureValue.selfie instanceof TLRPC.TL_secureFile)) {
                            if (!tL_secureRequiredType.translation_required || !tL_secureValue.translation.isEmpty()) {
                                if (!x1(tL_secureRequiredType.type) || !tL_secureValue.files.isEmpty()) {
                                    if (!z1(tL_secureRequiredType.type) || (tL_secureValue.front_side instanceof TLRPC.TL_secureFile)) {
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
                                                    JSONObject jSONObject = new JSONObject(l1(tL_secureData.data, m1(tL_secureData.secret, tL_secureData.data_hash), tL_secureValue.data.data_hash));
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

    public final boolean w1(Class cls) {
        int size = this.D.values.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.D.values.get(i10).type.getClass() == cls) {
                return false;
            }
        }
        return true;
    }

    public final boolean y1() {
        String str = this.f38409a;
        if (str != null && !str.equals(q1())) {
            return false;
        }
        return true;
    }

    public jl0(int i10, long j10, String str, String str2, String str3, String str4, String str5, TL_account.authorizationForm authorizationform, TL_account.Password password) {
        this(i10, authorizationform, password, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (HashMap) null, (HashMap) null);
        int i11;
        String s12;
        String str6;
        String str7;
        String str8;
        String str9;
        this.f38415c = j10;
        this.d = str3;
        this.e = str4;
        this.h = str;
        this.f38446r = str2;
        this.f38437n = str5;
        if (i10 != 0 || authorizationform.errors.isEmpty()) {
            return;
        }
        try {
            Collections.sort(authorizationform.errors, new pk0(this));
            int size = authorizationform.errors.size();
            int i12 = 0;
            while (i12 < size) {
                TLRPC.SecureValueError secureValueError = authorizationform.errors.get(i12);
                byte[] bArr = null;
                if (secureValueError instanceof TLRPC.TL_secureValueErrorFrontSide) {
                    TLRPC.TL_secureValueErrorFrontSide tL_secureValueErrorFrontSide = (TLRPC.TL_secureValueErrorFrontSide) secureValueError;
                    s12 = s1(tL_secureValueErrorFrontSide.type);
                    str6 = tL_secureValueErrorFrontSide.text;
                    bArr = tL_secureValueErrorFrontSide.file_hash;
                    str7 = null;
                    str8 = "front";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorReverseSide) {
                    TLRPC.TL_secureValueErrorReverseSide tL_secureValueErrorReverseSide = (TLRPC.TL_secureValueErrorReverseSide) secureValueError;
                    s12 = s1(tL_secureValueErrorReverseSide.type);
                    str6 = tL_secureValueErrorReverseSide.text;
                    bArr = tL_secureValueErrorReverseSide.file_hash;
                    str7 = null;
                    str8 = "reverse";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorSelfie) {
                    TLRPC.TL_secureValueErrorSelfie tL_secureValueErrorSelfie = (TLRPC.TL_secureValueErrorSelfie) secureValueError;
                    s12 = s1(tL_secureValueErrorSelfie.type);
                    str6 = tL_secureValueErrorSelfie.text;
                    bArr = tL_secureValueErrorSelfie.file_hash;
                    str7 = null;
                    str8 = "selfie";
                } else {
                    if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFile) {
                        TLRPC.TL_secureValueErrorTranslationFile tL_secureValueErrorTranslationFile = (TLRPC.TL_secureValueErrorTranslationFile) secureValueError;
                        s12 = s1(tL_secureValueErrorTranslationFile.type);
                        str6 = tL_secureValueErrorTranslationFile.text;
                        bArr = tL_secureValueErrorTranslationFile.file_hash;
                        str7 = null;
                    } else if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFiles) {
                        TLRPC.TL_secureValueErrorTranslationFiles tL_secureValueErrorTranslationFiles = (TLRPC.TL_secureValueErrorTranslationFiles) secureValueError;
                        s12 = s1(tL_secureValueErrorTranslationFiles.type);
                        str6 = tL_secureValueErrorTranslationFiles.text;
                        str7 = null;
                    } else {
                        if (secureValueError instanceof TLRPC.TL_secureValueErrorFile) {
                            TLRPC.TL_secureValueErrorFile tL_secureValueErrorFile = (TLRPC.TL_secureValueErrorFile) secureValueError;
                            s12 = s1(tL_secureValueErrorFile.type);
                            str6 = tL_secureValueErrorFile.text;
                            bArr = tL_secureValueErrorFile.file_hash;
                            str7 = null;
                        } else if (secureValueError instanceof TLRPC.TL_secureValueErrorFiles) {
                            TLRPC.TL_secureValueErrorFiles tL_secureValueErrorFiles = (TLRPC.TL_secureValueErrorFiles) secureValueError;
                            s12 = s1(tL_secureValueErrorFiles.type);
                            str6 = tL_secureValueErrorFiles.text;
                            str7 = null;
                        } else if (secureValueError instanceof TLRPC.TL_secureValueError) {
                            TLRPC.TL_secureValueError tL_secureValueError = (TLRPC.TL_secureValueError) secureValueError;
                            s12 = s1(tL_secureValueError.type);
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
                                        s12 = s1(tL_secureValueErrorData.type);
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
                HashMap hashMap = (HashMap) this.f38455u1.get(s12);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    i11 = size;
                    this.f38455u1.put(s12, hashMap);
                    this.f38457v1.put(s12, str6);
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
