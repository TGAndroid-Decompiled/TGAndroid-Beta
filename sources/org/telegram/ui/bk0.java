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
public final class bk0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public LinearLayout A0;
    public String A1;
    public ImageView B0;
    public sj0 B1;
    public TextView C0;
    public boolean C1;
    public TL_account.authorizationForm D;
    public TextView D0;
    public final cj0 D1;
    public final TLRPC.TL_secureRequiredType E;
    public TextView E0;
    public String E1;
    public TLRPC.TL_secureRequiredType F;
    public org.telegram.ui.Components.iy F0;
    public Runnable F1;
    public ArrayList G;
    public org.telegram.ui.Cells.z8 G0;
    public qj0 G1;
    public final TLRPC.TL_secureValue H;
    public org.telegram.ui.Cells.z8 H0;
    public sj0 H1;
    public final TLRPC.TL_secureValue I;
    public ImageView I0;
    public int I1;
    public TL_account.Password J;
    public TextView J0;
    public final org.telegram.ui.Components.wt0[] J1;
    public TLRPC.TL_auth_sentCode K;
    public TextView K0;
    public org.telegram.ui.ActionBar.u1 K1;
    public org.telegram.ui.ActionBar.r0 L;
    public FrameLayout L0;
    public Dialog L1;
    public AnimatorSet M;
    public TextView M0;
    public final ArrayList M1;
    public org.telegram.ui.Components.zp N;
    public int N0;
    public int N1;
    public TextView O;
    public final byte[] O0;
    public int O1;
    public org.telegram.ui.Components.zp P;
    public final byte[] P0;
    public int P1;
    public FrameLayout Q;
    public String Q0;
    public org.telegram.ui.Cells.w9 R;
    public org.telegram.ui.Components.di R0;
    public View S;
    public int S0;
    public View T;
    public int T0;
    public org.telegram.ui.Cells.y8 U;
    public final ArrayList U0;
    public org.telegram.ui.Cells.y8 V;
    public final HashMap V0;
    public org.telegram.ui.Cells.y8 W;
    public final HashMap W0;
    public org.telegram.ui.Cells.w9 X;
    public final HashMap X0;
    public EditTextBoldCursor[] Y;
    public HashMap Y0;
    public ViewGroup[] Z;
    public boolean Z0;
    public String f44344a;
    public EditTextBoldCursor[] f44345a0;
    public boolean f44346a1;
    public final int f44347b;
    public ScrollView f44348b0;
    public long f44349b1;
    public long f44350c;
    public LinearLayout f44351c0;
    public byte[] f44352c1;
    public final String d;
    public LinearLayout f44353d0;
    public String f44354d1;
    public final String f44355e;
    public LinearLayout f44356e0;
    public byte[] f44357e1;
    public boolean f44358f;
    public LinearLayout f44359f0;
    public boolean f44360f1;
    public LinearLayout f44361g0;
    public boolean f44362g1;
    public final String h;
    public LinearLayout f44363h0;
    public bk0 f44364h1;
    public LinearLayout f44365i0;
    public final ArrayList f44366i1;
    public org.telegram.ui.Cells.n4 f44367j0;
    public org.telegram.messenger.ew f44368j1;
    public final ArrayList f44369k0;
    public final ArrayList f44370k1;
    public org.telegram.ui.Cells.y6 f44371l0;
    public org.telegram.messenger.ew l1;
    public org.telegram.ui.Cells.y6 m0;
    public org.telegram.messenger.ew f44372m1;
    public final String f44373n;
    public org.telegram.ui.Cells.z8 f44374n0;
    public final HashMap n1;
    public org.telegram.ui.Cells.z8 f44375o0;
    public final HashMap f44376o1;
    public org.telegram.ui.Cells.z8 f44377p0;
    public final HashMap f44378p1;
    public org.telegram.ui.Cells.z8 f44379q0;
    public final HashMap f44380q1;
    public final String f44381r;
    public org.telegram.ui.Cells.w9 f44382r0;
    public final HashMap f44383r1;
    public String f44384s;
    public int f44385s0;
    public final HashMap f44386s1;
    public final boolean[] f44387t0;
    public final HashMap f44388t1;
    public boolean f44389u0;
    public final HashMap f44390u1;
    public boolean f44391v0;
    public final HashMap f44392v1;
    public String f44393w;
    public TextView f44394w0;
    public HashMap f44395w1;
    public String f44396x;
    public org.telegram.ui.Cells.w9 f44397x0;
    public HashMap f44398x1;
    public final int[] f44399y;
    public org.telegram.ui.Cells.w9 f44400y0;
    public final HashMap f44401y1;
    public org.telegram.ui.Cells.y6 f44402z0;
    public String f44403z1;

    public bk0(int i7, TL_account.authorizationForm authorizationform, TL_account.Password password, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureValue tL_secureValue, TLRPC.TL_secureRequiredType tL_secureRequiredType2, TLRPC.TL_secureValue tL_secureValue2, HashMap hashMap, HashMap hashMap2) {
        super(null);
        this.f44384s = "";
        this.f44393w = "";
        this.f44399y = new int[3];
        this.f44369k0 = new ArrayList();
        this.f44387t0 = new boolean[3];
        this.f44389u0 = true;
        this.U0 = new ArrayList();
        this.V0 = new HashMap();
        this.W0 = new HashMap();
        this.X0 = new HashMap();
        this.f44366i1 = new ArrayList();
        this.f44370k1 = new ArrayList();
        this.n1 = new HashMap();
        this.f44376o1 = new HashMap();
        this.f44378p1 = new HashMap();
        this.f44380q1 = new HashMap();
        this.f44383r1 = new HashMap();
        this.f44390u1 = new HashMap();
        this.f44392v1 = new HashMap();
        this.f44401y1 = new HashMap();
        this.D1 = new cj0(this);
        this.f44347b = i7;
        this.D = authorizationform;
        this.E = tL_secureRequiredType;
        if (tL_secureRequiredType != null) {
            this.f44389u0 = tL_secureRequiredType.native_names;
        }
        this.H = tL_secureValue;
        this.F = tL_secureRequiredType2;
        this.I = tL_secureValue2;
        this.J = password;
        this.f44386s1 = hashMap;
        this.f44388t1 = hashMap2;
        if (i7 == 3) {
            this.M1 = new ArrayList();
        } else if (i7 == 7) {
            this.J1 = new org.telegram.ui.Components.wt0[3];
        }
        if (hashMap == null) {
            this.f44386s1 = new HashMap();
        }
        if (hashMap2 == null) {
            this.f44388t1 = new HashMap();
        }
        if (i7 == 5) {
            if (org.telegram.messenger.p10.i(this.currentAccount).f24475j0 != null && org.telegram.messenger.p10.i(this.currentAccount).f24476k0 != null) {
                this.N0 = 1;
                this.O0 = org.telegram.messenger.p10.i(this.currentAccount).f24475j0;
                this.P0 = org.telegram.messenger.p10.i(this.currentAccount).f24476k0;
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
            if (org.telegram.messenger.iz.f23383j0 != null) {
                return;
            }
            TLRPC.TL_help_getPassportConfig tL_help_getPassportConfig = new TLRPC.TL_help_getPassportConfig();
            tL_help_getPassportConfig.hash = org.telegram.messenger.iz.f23386k0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_help_getPassportConfig, new di.u5(24));
        }
    }

    public static int G0(bk0 bk0Var, String str) {
        bk0Var.getClass();
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

    public static boolean H0(org.telegram.ui.bk0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bk0.H0(org.telegram.ui.bk0):boolean");
    }

    public static int M0(bk0 bk0Var) {
        return bk0Var.currentAccount;
    }

    public static void N0(bk0 bk0Var, EditTextBoldCursor editTextBoldCursor, String str, Editable editable, boolean z9) {
        String str2;
        String str3;
        String str4;
        String str5;
        HashMap hashMap = bk0Var.f44401y1;
        if (hashMap != null && (str3 = (String) hashMap.get(str)) != null) {
            if (TextUtils.equals(str3, editable)) {
                HashMap hashMap2 = bk0Var.f44395w1;
                if (hashMap2 != null && (str5 = (String) hashMap2.get(str)) != null) {
                    editTextBoldCursor.setErrorText(str5);
                } else {
                    HashMap hashMap3 = bk0Var.f44398x1;
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
        if (z9) {
            str2 = "error_document_all";
        } else {
            str2 = "error_all";
        }
        if (hashMap != null && hashMap.containsKey(str2)) {
            hashMap.remove(str2);
            bk0Var.e1(false);
        }
    }

    public static void Q0(bk0 bk0Var, int i7) {
        bk0Var.currentAccount = i7;
    }

    public static int R0(bk0 bk0Var) {
        return bk0Var.currentAccount;
    }

    public static void T1(EditTextBoldCursor[] editTextBoldCursorArr, boolean z9, boolean z10) {
        if (editTextBoldCursorArr != null) {
            for (EditTextBoldCursor editTextBoldCursor : editTextBoldCursorArr) {
                if (editTextBoldCursor != null) {
                    org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, null);
                    if (z9) {
                        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 34, org.telegram.ui.ActionBar.k6.H6, null);
                        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 35, org.telegram.ui.ActionBar.k6.L6, null);
                        if (z10) {
                            int paddingLeft = editTextBoldCursor.getPaddingLeft();
                            int paddingTop = editTextBoldCursor.getPaddingTop();
                            int paddingRight = editTextBoldCursor.getPaddingRight();
                            int paddingBottom = editTextBoldCursor.getPaddingBottom();
                            org.telegram.ui.ActionBar.r6.G(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f27977k6, org.telegram.ui.ActionBar.k6.f27995l6, org.telegram.ui.ActionBar.k6.f28069p7, null);
                            if (editTextBoldCursor.getPaddingLeft() != paddingLeft || editTextBoldCursor.getPaddingTop() != paddingTop || editTextBoldCursor.getPaddingRight() != paddingRight || editTextBoldCursor.getPaddingBottom() != paddingBottom) {
                                editTextBoldCursor.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void Z(bk0 bk0Var, TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery) {
        TL_account.Password password = bk0Var.J;
        password.email_unconfirmed_pattern = tL_auth_passwordRecovery.email_pattern;
        bk0Var.presentFragment(new ya1(bk0Var.currentAccount, 4, password));
    }

    public static void a0(bk0 bk0Var) {
        ArrayList arrayList;
        int i7;
        int i10;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        HashMap hashMap = bk0Var.f44383r1;
        HashMap hashMap2 = bk0Var.f44380q1;
        String str = bk0Var.f44381r;
        ArrayList arrayList2 = new ArrayList();
        int size = bk0Var.D.required_types.size();
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.SecureRequiredType secureRequiredType = bk0Var.D.required_types.get(i11);
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
                            int i12 = 0;
                            while (true) {
                                if (i12 < size2) {
                                    TLRPC.SecureRequiredType secureRequiredType3 = tL_secureRequiredTypeOneOf.types.get(i12);
                                    if (secureRequiredType3 instanceof TLRPC.TL_secureRequiredType) {
                                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) secureRequiredType3;
                                        if (bk0Var.v1(tL_secureRequiredType5, true) != null) {
                                            tL_secureRequiredType = tL_secureRequiredType5;
                                            break;
                                        }
                                    }
                                    i12++;
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
            TLRPC.TL_secureValue v12 = bk0Var.v1(tL_secureRequiredType, true);
            if (v12 == null) {
                Vibrator vibrator = (Vibrator) bk0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                ak0 ak0Var = (ak0) hashMap2.get(tL_secureRequiredType);
                if (ak0Var == null && (tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    ak0Var = (ak0) hashMap2.get(tL_secureRequiredType2);
                }
                org.telegram.messenger.g0.F3(ak0Var);
                return;
            }
            HashMap hashMap3 = (HashMap) bk0Var.f44390u1.get(s1(tL_secureRequiredType.type));
            if (hashMap3 != null && !hashMap3.isEmpty()) {
                Vibrator vibrator2 = (Vibrator) bk0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                ak0 ak0Var2 = (ak0) hashMap2.get(tL_secureRequiredType);
                if (ak0Var2 == null && (tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    ak0Var2 = (ak0) hashMap2.get(tL_secureRequiredType3);
                }
                org.telegram.messenger.g0.F3(ak0Var2);
                return;
            }
            boolean z9 = tL_secureRequiredType.selfie_required;
            boolean z10 = tL_secureRequiredType.translation_required;
            ?? obj = new Object();
            obj.f45058a = v12;
            obj.f45059b = z9;
            obj.f45060c = z10;
            arrayList2.add(obj);
        }
        bk0Var.R1(false, true);
        TL_account.acceptAuthorization acceptauthorization = new TL_account.acceptAuthorization();
        acceptauthorization.bot_id = bk0Var.f44350c;
        acceptauthorization.scope = bk0Var.h;
        acceptauthorization.public_key = str;
        JSONObject jSONObject = new JSONObject();
        int size3 = arrayList2.size();
        int i13 = 0;
        while (i13 < size3) {
            dj0 dj0Var = (dj0) arrayList2.get(i13);
            TLRPC.TL_secureValue tL_secureValue = dj0Var.f45058a;
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
                        byte[] m12 = bk0Var.m1(tL_secureData.secret, tL_secureData.data_hash);
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
                        int i14 = 0;
                        for (int size4 = tL_secureValue.files.size(); i14 < size4; size4 = size4) {
                            TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) tL_secureValue.files.get(i14);
                            i7 = size3;
                            try {
                                i10 = i13;
                                try {
                                    byte[] m13 = bk0Var.m1(tL_secureFile.secret, tL_secureFile.file_hash);
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("file_hash", Base64.encodeToString(tL_secureFile.file_hash, 2));
                                    jSONObject4.put("secret", Base64.encodeToString(m13, 2));
                                    jSONArray.put(jSONObject4);
                                    i14++;
                                    size3 = i7;
                                    i13 = i10;
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                            }
                        }
                        i7 = size3;
                        i10 = i13;
                        jSONObject3.put("files", jSONArray);
                    } else {
                        i7 = size3;
                        i10 = i13;
                    }
                    TLRPC.SecureFile secureFile = tL_secureValue.front_side;
                    if (secureFile instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile;
                        byte[] m14 = bk0Var.m1(tL_secureFile2.secret, tL_secureFile2.file_hash);
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("file_hash", Base64.encodeToString(tL_secureFile2.file_hash, 2));
                        jSONObject5.put("secret", Base64.encodeToString(m14, 2));
                        jSONObject3.put("front_side", jSONObject5);
                    }
                    TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile2;
                        byte[] m15 = bk0Var.m1(tL_secureFile3.secret, tL_secureFile3.file_hash);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("file_hash", Base64.encodeToString(tL_secureFile3.file_hash, 2));
                        jSONObject6.put("secret", Base64.encodeToString(m15, 2));
                        jSONObject3.put("reverse_side", jSONObject6);
                    }
                    if (dj0Var.f45059b) {
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile3;
                            byte[] m16 = bk0Var.m1(tL_secureFile4.secret, tL_secureFile4.file_hash);
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("file_hash", Base64.encodeToString(tL_secureFile4.file_hash, 2));
                            jSONObject7.put("secret", Base64.encodeToString(m16, 2));
                            jSONObject3.put("selfie", jSONObject7);
                        }
                    }
                    if (dj0Var.f45060c && !tL_secureValue.translation.isEmpty()) {
                        JSONArray jSONArray2 = new JSONArray();
                        int size5 = tL_secureValue.translation.size();
                        for (int i15 = 0; i15 < size5; i15++) {
                            TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) tL_secureValue.translation.get(i15);
                            byte[] m17 = bk0Var.m1(tL_secureFile5.secret, tL_secureFile5.file_hash);
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
                i13 = i10 + 1;
                arrayList2 = arrayList;
                size3 = i7;
            }
            arrayList = arrayList2;
            i7 = size3;
            i10 = i13;
            TLRPC.TL_secureValueHash tL_secureValueHash2 = new TLRPC.TL_secureValueHash();
            tL_secureValueHash2.type = tL_secureValue.type;
            tL_secureValueHash2.hash = tL_secureValue.hash;
            acceptauthorization.value_hashes.add(tL_secureValueHash2);
            i13 = i10 + 1;
            arrayList2 = arrayList;
            size3 = i7;
        }
        JSONObject jSONObject9 = new JSONObject();
        try {
            jSONObject9.put("secure_data", jSONObject);
        } catch (Exception unused5) {
        }
        Object obj2 = bk0Var.d;
        if (obj2 != null) {
            try {
                jSONObject9.put("payload", obj2);
            } catch (Exception unused6) {
            }
        }
        Object obj3 = bk0Var.f44355e;
        if (obj3 != null) {
            try {
                jSONObject9.put("nonce", obj3);
            } catch (Exception unused7) {
            }
        }
        a8.r7 o12 = bk0Var.o1(org.telegram.messenger.g0.h1(jSONObject9.toString()));
        TLRPC.TL_secureCredentialsEncrypted tL_secureCredentialsEncrypted = new TLRPC.TL_secureCredentialsEncrypted();
        acceptauthorization.credentials = tL_secureCredentialsEncrypted;
        tL_secureCredentialsEncrypted.hash = (byte[]) o12.f616e;
        tL_secureCredentialsEncrypted.data = (byte[]) o12.d;
        try {
            String replace = str.replaceAll("\\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "");
            Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA1AndMGF1Padding");
            cipher.init(1, (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(replace, 0))));
            acceptauthorization.credentials.secret = cipher.doFinal((byte[]) o12.f615c);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ConnectionsManager.getInstance(bk0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(bk0Var.currentAccount).sendRequest(acceptauthorization, new ti0(bk0Var, 1)), bk0Var.classGuid);
    }

    public static void b0(bk0 bk0Var, TLRPC.TL_error tL_error, String str, sj0 sj0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        if (tL_error == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("phone", str);
            bk0 bk0Var2 = new bk0(7, bk0Var.D, bk0Var.J, bk0Var.E, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
            bk0Var2.currentAccount = bk0Var.currentAccount;
            bk0Var2.f44357e1 = bk0Var.f44357e1;
            bk0Var2.f44352c1 = bk0Var.f44352c1;
            bk0Var2.B1 = sj0Var;
            bk0Var2.K = (TLRPC.TL_auth_sentCode) tLObject;
            bk0Var.presentFragment(bk0Var2, true);
            return;
        }
        org.telegram.ui.Components.v4.c0(bk0Var.currentAccount, tL_error, bk0Var, sendverifyphonecode, str);
    }

    public static void c0(bk0 bk0Var, org.telegram.messenger.ew ewVar, int i7) {
        String str = ewVar.f22260c;
        HashMap hashMap = bk0Var.n1;
        int i10 = bk0Var.S0;
        if (i10 == 1) {
            org.telegram.messenger.ew ewVar2 = bk0Var.f44368j1;
            if (ewVar2 != null) {
                zj0 zj0Var = (zj0) hashMap.remove(ewVar2);
                if (zj0Var != null) {
                    bk0Var.f44361g0.removeView(zj0Var);
                }
                bk0Var.f44368j1 = null;
            }
        } else if (i10 == 4) {
            if (bk0Var.f44370k1.size() >= 20) {
                return;
            }
        } else if (i10 == 2) {
            org.telegram.messenger.ew ewVar3 = bk0Var.l1;
            if (ewVar3 != null) {
                zj0 zj0Var2 = (zj0) hashMap.remove(ewVar3);
                if (zj0Var2 != null) {
                    bk0Var.f44356e0.removeView(zj0Var2);
                }
                bk0Var.l1 = null;
            }
        } else if (i10 == 3) {
            org.telegram.messenger.ew ewVar4 = bk0Var.f44372m1;
            if (ewVar4 != null) {
                zj0 zj0Var3 = (zj0) hashMap.remove(ewVar4);
                if (zj0Var3 != null) {
                    bk0Var.f44359f0.removeView(zj0Var3);
                }
                bk0Var.f44372m1 = null;
            }
        } else if (i10 == 0 && bk0Var.f44366i1.size() >= 20) {
            return;
        }
        bk0Var.f44376o1.put(str, ewVar);
        bk0Var.L.setEnabled(false);
        bk0Var.L.setAlpha(0.5f);
        org.telegram.messenger.w7.G(bk0Var.currentAccount).i0(false, 16777216, str, true);
        bk0Var.V0(ewVar, i7);
        bk0Var.X1(i7);
    }

    public static void d0(org.telegram.ui.bk0 r9, boolean r10, java.lang.String r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bk0.d0(org.telegram.ui.bk0, boolean, java.lang.String):void");
    }

    public static boolean d1(byte[] bArr, Long l10) {
        if (bArr != null && bArr.length == 32) {
            int i7 = 0;
            for (byte b10 : bArr) {
                i7 += b10 & 255;
            }
            if (i7 % 255 == 239 && (l10 == null || Utilities.g(Utilities.o(bArr.length, bArr)) == l10.longValue())) {
                return true;
            }
        }
        return false;
    }

    public static void e0(int i7, String str, org.telegram.messenger.ew ewVar, zj0 zj0Var, bk0 bk0Var) {
        String str2 = ewVar.f22260c;
        HashMap hashMap = bk0Var.f44376o1;
        bk0Var.n1.remove(ewVar);
        if (i7 == 1) {
            bk0Var.f44368j1 = null;
            bk0Var.f44361g0.removeView(zj0Var);
        } else if (i7 == 4) {
            bk0Var.f44370k1.remove(ewVar);
            bk0Var.f44363h0.removeView(zj0Var);
        } else if (i7 == 2) {
            bk0Var.l1 = null;
            bk0Var.f44356e0.removeView(zj0Var);
        } else if (i7 == 3) {
            bk0Var.f44372m1 = null;
            bk0Var.f44359f0.removeView(zj0Var);
        } else {
            bk0Var.f44366i1.remove(ewVar);
            bk0Var.f44353d0.removeView(zj0Var);
        }
        if (str != null) {
            HashMap hashMap2 = bk0Var.f44398x1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
            HashMap hashMap3 = bk0Var.f44401y1;
            if (hashMap3 != null) {
                hashMap3.remove(str);
            }
        }
        bk0Var.X1(i7);
        if (str2 != null && hashMap.remove(str2) != null) {
            if (hashMap.isEmpty()) {
                bk0Var.L.setEnabled(true);
                bk0Var.L.setAlpha(1.0f);
            }
            org.telegram.messenger.w7.G(bk0Var.currentAccount).b(str2, false);
        }
    }

    public static void f0(bk0 bk0Var) {
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        for (int i7 = 0; i7 < bk0Var.D.values.size(); i7++) {
            deletesecurevalue.types.add(bk0Var.D.values.get(i7).type);
        }
        bk0Var.C1();
        ConnectionsManager.getInstance(bk0Var.currentAccount).sendRequest(deletesecurevalue, new ti0(bk0Var, 2));
    }

    public static void g0(bk0 bk0Var) {
        ya1 ya1Var = new ya1(bk0Var.currentAccount, 0, bk0Var.J);
        ya1Var.Y = true;
        bk0Var.presentFragment(ya1Var);
    }

    public static void h0(bk0 bk0Var) {
        if (bk0Var.J.has_recovery) {
            bk0Var.C1();
            ConnectionsManager.getInstance(bk0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(bk0Var.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new ti0(bk0Var, 0), 10), bk0Var.classGuid);
        } else if (bk0Var.getParentActivity() == null) {
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bk0Var.getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131746071, null), new si0(bk0Var, 4));
            String M0 = org.telegram.messenger.hd.M0(2131746072, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.hd.M0(2131746074, null);
            bk0Var.showDialog(u1Var);
        }
    }

    public static void i0(bk0 bk0Var) {
        Activity parentActivity = bk0Var.getParentActivity();
        vf.c.t(parentActivity, "https://telegram.org/deactivate?phone=" + org.telegram.messenger.p10.i(bk0Var.currentAccount).d());
    }

    public static int j0(bk0 bk0Var) {
        return bk0Var.currentAccount;
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
                int i7 = bArr6[0] & 255;
                return new String(bArr6, i7, length - i7);
            }
            return null;
        }
        return null;
    }

    public static int m0(bk0 bk0Var) {
        return bk0Var.currentAccount;
    }

    public static int n0(bk0 bk0Var) {
        return bk0Var.currentAccount;
    }

    public static String r1(org.telegram.messenger.ew ewVar) {
        byte[] bArr;
        if (ewVar != null) {
            TLRPC.TL_secureFile tL_secureFile = ewVar.f22259b;
            if (tL_secureFile != null && (bArr = tL_secureFile.file_hash) != null) {
                return Base64.encodeToString(bArr, 2);
            }
            byte[] bArr2 = ewVar.f22262f;
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
        Utilities.f21331b.nextBytes(bArr);
        int i7 = 0;
        for (int i10 = 0; i10 < 32; i10++) {
            i7 += 255 & bArr[i10];
        }
        int i11 = i7 % 255;
        if (i11 != 239) {
            int nextInt = Utilities.f21331b.nextInt(32);
            int i12 = (bArr[nextInt] & 255) + (239 - i11);
            if (i12 < 255) {
                i12 += 255;
            }
            bArr[nextInt] = (byte) (i12 % 255);
        }
        return bArr;
    }

    public static String u1(TLRPC.SecureValueType secureValueType) {
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
            return org.telegram.messenger.hd.M0(2131754676, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
            return org.telegram.messenger.hd.M0(2131754681, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
            return org.telegram.messenger.hd.M0(2131754678, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
            return org.telegram.messenger.hd.M0(2131754671, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
            return org.telegram.messenger.hd.M0(2131754682, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
            return org.telegram.messenger.hd.M0(2131754673, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
            return org.telegram.messenger.hd.M0(2131754677, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
            return org.telegram.messenger.hd.M0(2131754675, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
            return org.telegram.messenger.hd.M0(2131754672, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
            return org.telegram.messenger.hd.M0(2131754674, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
            return org.telegram.messenger.hd.M0(2131754680, null);
        }
        return "";
    }

    public static int v0(bk0 bk0Var) {
        return bk0Var.currentAccount;
    }

    public static int w0(bk0 bk0Var) {
        return bk0Var.currentAccount;
    }

    public static int x0(bk0 bk0Var) {
        return bk0Var.currentAccount;
    }

    public static boolean x1(TLRPC.SecureValueType secureValueType) {
        if (!(secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) && !(secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) && !(secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) && !(secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) && !(secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement)) {
            return false;
        }
        return true;
    }

    public static int z0(bk0 bk0Var) {
        return bk0Var.currentAccount;
    }

    public static boolean z1(TLRPC.SecureValueType secureValueType) {
        if (!(secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) && !(secureValueType instanceof TLRPC.TL_secureValueTypePassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
            return false;
        }
        return true;
    }

    public final void A1() {
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ti0(this, 3)), this.classGuid);
    }

    public final void B1() {
        org.telegram.ui.ActionBar.u1 u1Var = this.K1;
        if (u1Var == null) {
            return;
        }
        try {
            u1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.K1 = null;
    }

    public final void C1() {
        if (getParentActivity() != null && !getParentActivity().isFinishing() && this.K1 == null) {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
            this.K1 = u1Var;
            u1Var.f28568i0 = false;
            u1Var.show();
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
        org.telegram.messenger.g0.F3(view);
        M1(view);
    }

    public final void E1(boolean z9) {
        if (getParentActivity() == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        if (z9) {
            this.Y[0].setText("");
        }
        org.telegram.messenger.g0.F3(this.Y[0]);
    }

    public final void F1(boolean z9) {
        String obj;
        if (z9) {
            obj = null;
        } else {
            obj = this.Y[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                E1(false);
                return;
            }
            R1(true, true);
        }
        Utilities.f21333e.c(new g60(this, z9, obj, 3));
    }

    public final void G1() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (w1(TLRPC.TL_secureValueTypePhone.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754674, null));
            arrayList2.add(TLRPC.TL_secureValueTypePhone.class);
        }
        if (w1(TLRPC.TL_secureValueTypeEmail.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754680, null));
            arrayList2.add(TLRPC.TL_secureValueTypeEmail.class);
        }
        if (w1(TLRPC.TL_secureValueTypePersonalDetails.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754679, null));
            arrayList2.add(TLRPC.TL_secureValueTypePersonalDetails.class);
        }
        if (w1(TLRPC.TL_secureValueTypePassport.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754676, null));
            arrayList2.add(TLRPC.TL_secureValueTypePassport.class);
        }
        if (w1(TLRPC.TL_secureValueTypeInternalPassport.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754677, null));
            arrayList2.add(TLRPC.TL_secureValueTypeInternalPassport.class);
        }
        if (w1(TLRPC.TL_secureValueTypePassportRegistration.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754675, null));
            arrayList2.add(TLRPC.TL_secureValueTypePassportRegistration.class);
        }
        if (w1(TLRPC.TL_secureValueTypeTemporaryRegistration.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754672, null));
            arrayList2.add(TLRPC.TL_secureValueTypeTemporaryRegistration.class);
        }
        if (w1(TLRPC.TL_secureValueTypeIdentityCard.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754678, null));
            arrayList2.add(TLRPC.TL_secureValueTypeIdentityCard.class);
        }
        if (w1(TLRPC.TL_secureValueTypeDriverLicense.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754681, null));
            arrayList2.add(TLRPC.TL_secureValueTypeDriverLicense.class);
        }
        if (w1(TLRPC.TL_secureValueTypeAddress.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754683, null));
            arrayList2.add(TLRPC.TL_secureValueTypeAddress.class);
        }
        if (w1(TLRPC.TL_secureValueTypeUtilityBill.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754671, null));
            arrayList2.add(TLRPC.TL_secureValueTypeUtilityBill.class);
        }
        if (w1(TLRPC.TL_secureValueTypeBankStatement.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754682, null));
            arrayList2.add(TLRPC.TL_secureValueTypeBankStatement.class);
        }
        if (w1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754673, null));
            arrayList2.add(TLRPC.TL_secureValueTypeRentalAgreement.class);
        }
        if (getParentActivity() != null && !arrayList.isEmpty()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(2131747495, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
            u1Var.R = M0;
            alertDialog$Builder.f((CharSequence[]) arrayList.toArray(new CharSequence[0]), new og.j(9, this, arrayList2));
            showDialog(u1Var);
        }
    }

    public final void H1() {
        boolean z9;
        int size;
        if (getParentActivity() == null) {
            return;
        }
        int i7 = this.S0;
        ArrayList arrayList = this.f44366i1;
        int i10 = 1;
        if (i7 == 0 && arrayList.size() >= 20) {
            Q1(org.telegram.messenger.hd.M0(2131689472, null), org.telegram.messenger.hd.a0("PassportUploadMaxReached", null, 2131747450, org.telegram.messenger.hd.G(20, "Files", new Object[0])));
            return;
        }
        g1();
        org.telegram.ui.Components.di diVar = this.R0;
        int i11 = this.S0;
        if (i11 == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        diVar.O3 = z9;
        if (i11 == 0) {
            size = arrayList.size();
        } else {
            if (i11 == 4) {
                size = this.f44370k1.size();
            }
            diVar.y1(i10, false);
            this.R0.f32882a2.i0();
            this.R0.e1();
            showDialog(this.R0);
        }
        i10 = 20 - size;
        diVar.y1(i10, false);
        this.R0.f32882a2.i0();
        this.R0.e1();
        showDialog(this.R0);
    }

    public final void I1(TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, boolean z9) {
        int i7;
        TLRPC.SecureValueType secureValueType;
        int i10;
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        if (arrayList != null) {
            i7 = arrayList.size();
        } else {
            i7 = 0;
        }
        TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType.type;
        if (tL_secureRequiredType2 != null) {
            secureValueType = tL_secureRequiredType2.type;
        } else {
            secureValueType = null;
        }
        if (secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
            i10 = 1;
        } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
            i10 = 2;
        } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePhone) {
            i10 = 3;
        } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail) {
            i10 = 4;
        } else {
            i10 = -1;
        }
        if (i10 != -1) {
            HashMap hashMap4 = this.f44390u1;
            if (!z9) {
                hashMap = (HashMap) hashMap4.get(s1(secureValueType2));
            } else {
                hashMap = null;
            }
            HashMap hashMap5 = (HashMap) hashMap4.get(s1(secureValueType));
            TLRPC.TL_secureValue v12 = v1(tL_secureRequiredType, false);
            TLRPC.TL_secureValue v13 = v1(tL_secureRequiredType2, false);
            HashMap hashMap6 = hashMap;
            TL_account.authorizationForm authorizationform = this.D;
            int i11 = i10;
            TL_account.Password password = this.J;
            HashMap hashMap7 = this.f44378p1;
            HashMap hashMap8 = (HashMap) hashMap7.get(tL_secureRequiredType);
            if (tL_secureRequiredType2 != null) {
                hashMap2 = hashMap5;
                hashMap3 = (HashMap) hashMap7.get(tL_secureRequiredType2);
            } else {
                hashMap2 = hashMap5;
                hashMap3 = null;
            }
            bk0 bk0Var = new bk0(i11, authorizationform, password, tL_secureRequiredType, v12, tL_secureRequiredType2, v13, hashMap8, hashMap3);
            bk0Var.B1 = new gj0(this, secureValueType2, z9, i7);
            bk0Var.currentAccount = this.currentAccount;
            bk0Var.f44357e1 = this.f44357e1;
            bk0Var.f44352c1 = this.f44352c1;
            bk0Var.f44350c = this.f44350c;
            bk0Var.f44395w1 = hashMap6;
            bk0Var.f44391v0 = z9;
            bk0Var.f44398x1 = hashMap2;
            bk0Var.G = arrayList;
            if (i11 == 4) {
                bk0Var.f44354d1 = this.f44354d1;
            }
            presentFragment(bk0Var);
        }
    }

    public final void J1(int i7) {
        if (i7 == 0) {
            int i10 = Build.VERSION.SDK_INT;
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                return;
            }
            try {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File q02 = org.telegram.messenger.g0.q0(null, false);
                if (q02 != null) {
                    if (i10 >= 24) {
                        Activity parentActivity = getParentActivity();
                        org.telegram.messenger.t0.d();
                        intent.putExtra("output", FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", q02));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(q02));
                    }
                    this.Q0 = q02.getAbsolutePath();
                }
                startActivityForResult(intent, 0);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void K1(ArrayList arrayList) {
        boolean z9;
        if (arrayList.isEmpty()) {
            return;
        }
        int i7 = this.S0;
        boolean z10 = true;
        if (i7 != 1 && i7 != 4 && (this.E.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.Y;
                if (i10 < editTextBoldCursorArr.length) {
                    if (i10 != 5 && i10 != 8 && i10 != 4 && i10 != 6 && editTextBoldCursorArr[i10].length() > 0) {
                        z10 = false;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            z9 = z10;
        } else {
            z9 = false;
        }
        Utilities.f21333e.c(new org.telegram.messenger.voip.k0(this.S0, 7, this, arrayList, z9));
    }

    public final TLRPC.TL_secureValue L1(TLRPC.TL_secureRequiredType tL_secureRequiredType) {
        if (tL_secureRequiredType == null) {
            return null;
        }
        int size = this.D.values.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (tL_secureRequiredType.type.getClass() == this.D.values.get(i7).type.getClass()) {
                return this.D.values.remove(i7);
            }
        }
        return null;
    }

    public final void M1(View view) {
        while (view != null && this.f44351c0.indexOfChild(view) < 0) {
            view = (View) view.getParent();
        }
        if (view != null) {
            this.f44348b0.smoothScrollTo(0, view.getTop() - ((this.f44348b0.getMeasuredHeight() - view.getMeasuredHeight()) / 2));
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
                    this.f44393w = str2;
                    CharSequence charSequence3 = (String) this.Y0.get(str2);
                    if (charSequence3 != null) {
                        editTextBoldCursor.setText(charSequence3);
                        break;
                    }
                    break;
                case 1:
                    if ("male".equals(str2)) {
                        this.f44396x = str2;
                        editTextBoldCursor.setText(org.telegram.messenger.hd.M0(2131747507, null));
                        break;
                    } else if ("female".equals(str2)) {
                        this.f44396x = str2;
                        editTextBoldCursor.setText(org.telegram.messenger.hd.M0(2131747568, null));
                        break;
                    }
                    break;
                case 2:
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    int[] iArr = this.f44399y;
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
                    editTextBoldCursor.setText(org.telegram.messenger.hd.M0(2131747493, null));
                    break;
                case 3:
                    this.f44384s = str2;
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
        HashMap hashMap2 = this.f44395w1;
        HashMap hashMap3 = this.f44401y1;
        if (hashMap2 != null && (charSequence2 = (String) hashMap2.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence2);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
            return;
        }
        HashMap hashMap4 = this.f44398x1;
        if (hashMap4 != null && (charSequence = (String) hashMap4.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
        }
    }

    public final void O1(Bundle bundle, int i7, boolean z9) {
        if (i7 == 3) {
            this.L.setVisibility(8);
        }
        int i10 = this.I1;
        org.telegram.ui.Components.wt0[] wt0VarArr = this.J1;
        org.telegram.ui.Components.wt0 wt0Var = wt0VarArr[i10];
        org.telegram.ui.Components.wt0 wt0Var2 = wt0VarArr[i7];
        this.I1 = i7;
        wt0Var2.m(bundle, false);
        wt0Var2.j();
        if (z9) {
            Point point = org.telegram.messenger.g0.f22537q;
            wt0Var2.setTranslationX(point.x);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.setDuration(300L);
            animatorSet.playTogether(ObjectAnimator.ofFloat(wt0Var, "translationX", -point.x), ObjectAnimator.ofFloat(wt0Var2, "translationX", 0.0f));
            animatorSet.addListener(new org.telegram.ui.Components.v50(wt0Var2, wt0Var, 10));
            animatorSet.start();
            return;
        }
        wt0Var2.setTranslationX(0.0f);
        wt0Var2.setVisibility(0);
        if (wt0Var != wt0Var2) {
            wt0Var.setVisibility(8);
        }
    }

    public final void P1(org.telegram.tgnet.TLRPC.TL_secureRequiredType r31, java.lang.String r32, java.lang.String r33, org.telegram.tgnet.TLRPC.TL_secureRequiredType r34, java.lang.String r35, boolean r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bk0.P1(org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, boolean, int):void");
    }

    public final void Q1(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.R = str;
        u1Var.T = str2;
        showDialog(u1Var);
    }

    public final void R1(boolean z9, boolean z10) {
        AnimatorSet animatorSet = this.M;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z9 && this.L != null) {
            this.M = new AnimatorSet();
            if (z10) {
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
                org.telegram.ui.Components.zp zpVar = this.N;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(zpVar, property4, 0.1f);
                org.telegram.ui.Components.zp zpVar2 = this.N;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(zpVar2, property5, 0.1f);
                org.telegram.ui.Components.zp zpVar3 = this.N;
                Property property6 = View.ALPHA;
                animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(zpVar3, property6, 0.0f), ObjectAnimator.ofFloat(this.L.getContentView(), property4, 1.0f), ObjectAnimator.ofFloat(this.L.getContentView(), property5, 1.0f), ObjectAnimator.ofFloat(this.L.getContentView(), property6, 1.0f));
            }
            this.M.addListener(new hj0(this, z10, 0));
            this.M.setDuration(150L);
            this.M.start();
        } else if (this.O != null) {
            this.M = new AnimatorSet();
            if (z10) {
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
                org.telegram.ui.Components.zp zpVar4 = this.P;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(zpVar4, property10, 0.1f);
                org.telegram.ui.Components.zp zpVar5 = this.P;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(zpVar5, property11, 0.1f);
                org.telegram.ui.Components.zp zpVar6 = this.P;
                Property property12 = View.ALPHA;
                animatorSet5.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(zpVar6, property12, 0.0f), ObjectAnimator.ofFloat(this.O, property10, 1.0f), ObjectAnimator.ofFloat(this.O, property11, 1.0f), ObjectAnimator.ofFloat(this.O, property12, 1.0f));
            }
            this.M.addListener(new hj0(this, z10, 1));
            this.M.setDuration(150L);
            this.M.start();
        }
    }

    public final void S1(boolean z9, String str, Runnable runnable, qj0 qj0Var, sj0 sj0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.t0.f25555b.getSystemService("phone");
        if (telephonyManager.getSimState() != 1 && telephonyManager.getPhoneType() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getParentActivity() != null && z10) {
            if (getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z9) {
                this.M1.clear();
                if (!z11) {
                    this.M1.add("android.permission.READ_PHONE_STATE");
                }
                if (!this.M1.isEmpty()) {
                    if (getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.f27292a.R = org.telegram.messenger.hd.M0(2131689472, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                        String M0 = org.telegram.messenger.hd.M0(2131754275, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                        u1Var.T = M0;
                        this.L1 = showDialog(u1Var);
                    } else {
                        getParentActivity().requestPermissions((String[]) this.M1.toArray(new String[0]), 6);
                    }
                    this.E1 = str;
                    this.G1 = qj0Var;
                    this.F1 = runnable;
                    this.H1 = sj0Var;
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
        tL_codeSettings.allow_app_hash = org.telegram.messenger.tt.f25652b.hasServices();
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25555b.getSharedPreferences("mainconfig", 0);
        if (sendverifyphonecode.settings.allow_app_hash) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            boolean z13 = org.telegram.messenger.r2.f25191a;
            org.telegram.messenger.t0.u();
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
            } catch (Exception e10) {
                sendverifyphonecode.settings.allow_flashcall = false;
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendverifyphonecode, new bi.g2(this, str, sj0Var, sendverifyphonecode, 14), 2);
    }

    public final void U1() {
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        if (tL_secureRequiredType != null) {
            this.actionBar.setTitle(u1(tL_secureRequiredType.type));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131747491, null));
        }
        X1(2);
        X1(3);
        X1(1);
        X1(4);
    }

    public final void V0(final org.telegram.messenger.ew ewVar, final int i7) {
        String M0;
        final String str;
        String v;
        HashMap hashMap;
        if (i7 == 1) {
            this.f44368j1 = ewVar;
            if (this.f44361g0 == null) {
                return;
            }
        } else if (i7 == 4) {
            this.f44370k1.add(ewVar);
            if (this.f44363h0 == null) {
                return;
            }
        } else if (i7 == 2) {
            this.l1 = ewVar;
            if (this.f44356e0 == null) {
                return;
            }
        } else if (i7 == 3) {
            this.f44372m1 = ewVar;
            if (this.f44359f0 == null) {
                return;
            }
        } else {
            this.f44366i1.add(ewVar);
            if (this.f44353d0 == null) {
                return;
            }
        }
        if (getParentActivity() == null) {
            return;
        }
        final zj0 zj0Var = new zj0(this, getParentActivity());
        zj0Var.setTag(ewVar);
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27848d6);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27940i6);
        zj0Var.setBackground(N0);
        org.telegram.ui.ActionBar.r6.k(zj0Var, N0, N, N2, null);
        this.n1.put(ewVar, zj0Var);
        String r12 = r1(ewVar);
        if (i7 == 1) {
            M0 = org.telegram.messenger.hd.M0(2131747462, null);
            this.f44361g0.addView(zj0Var, c8.ha.o(-1, -2));
            str = "selfie" + r12;
        } else if (i7 == 4) {
            M0 = org.telegram.messenger.hd.M0(2131753948, null);
            this.f44363h0.addView(zj0Var, c8.ha.o(-1, -2));
            str = "translation" + r12;
        } else if (i7 == 2) {
            TLRPC.SecureValueType secureValueType = this.F.type;
            if (!(secureValueType instanceof TLRPC.TL_secureValueTypePassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                M0 = org.telegram.messenger.hd.M0(2131747567, null);
            } else {
                M0 = org.telegram.messenger.hd.M0(2131747509, null);
            }
            this.f44356e0.addView(zj0Var, c8.ha.o(-1, -2));
            str = "front" + r12;
        } else if (i7 == 3) {
            M0 = org.telegram.messenger.hd.M0(2131747471, null);
            this.f44359f0.addView(zj0Var, c8.ha.o(-1, -2));
            str = "reverse" + r12;
        } else {
            M0 = org.telegram.messenger.hd.M0(2131753948, null);
            this.f44353d0.addView(zj0Var, c8.ha.o(-1, -2));
            str = "files" + r12;
        }
        TextView textView = zj0Var.f52593b;
        if (str != null && (hashMap = this.f44398x1) != null && (v = (String) hashMap.get(str)) != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28069p7, null);
            this.f44401y1.put(str, "");
        } else {
            v = org.telegram.messenger.hd.v(ewVar.f22259b.date);
        }
        zj0Var.f52592a.setText(M0);
        textView.setText(v);
        org.telegram.ui.Components.l9 l9Var = zj0Var.f52594c;
        l9Var.getClass();
        ?? obj = new Object();
        obj.h = ewVar;
        l9Var.n(obj, "48_48", null, null, null, null, 0, null);
        zj0Var.f52596f = ewVar;
        zj0Var.a(false);
        zj0Var.setOnClickListener(new ai.v(this, i7, 26));
        zj0Var.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                bk0 bk0Var = this;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bk0Var.getParentActivity());
                int i10 = i7;
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                if (i10 == 1) {
                    u1Var.T = org.telegram.messenger.hd.M0(2131747581, null);
                } else {
                    u1Var.T = org.telegram.messenger.hd.M0(2131747583, null);
                }
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                u1Var.R = org.telegram.messenger.hd.M0(2131689472, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), new bi.i6(bk0Var, ewVar, i10, zj0Var, str, 4));
                bk0Var.showDialog(u1Var);
                return true;
            }
        });
    }

    public final void V1() {
        if (this.D.values.isEmpty()) {
            this.A0.setVisibility(0);
            this.f44371l0.setVisibility(8);
            this.f44367j0.setVisibility(8);
            this.f44397x0.setVisibility(8);
            this.f44400y0.setVisibility(8);
            this.f44402z0.setVisibility(8);
            return;
        }
        this.A0.setVisibility(8);
        this.f44371l0.setVisibility(0);
        this.f44367j0.setVisibility(0);
        this.f44400y0.setVisibility(0);
        this.f44402z0.setVisibility(0);
        if (!w1(TLRPC.TL_secureValueTypePhone.class) && !w1(TLRPC.TL_secureValueTypeEmail.class) && !w1(TLRPC.TL_secureValueTypePersonalDetails.class) && !w1(TLRPC.TL_secureValueTypePassport.class) && !w1(TLRPC.TL_secureValueTypeInternalPassport.class) && !w1(TLRPC.TL_secureValueTypeIdentityCard.class) && !w1(TLRPC.TL_secureValueTypeDriverLicense.class) && !w1(TLRPC.TL_secureValueTypeAddress.class) && !w1(TLRPC.TL_secureValueTypeUtilityBill.class) && !w1(TLRPC.TL_secureValueTypePassportRegistration.class) && !w1(TLRPC.TL_secureValueTypeTemporaryRegistration.class) && !w1(TLRPC.TL_secureValueTypeBankStatement.class) && !w1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            this.f44397x0.setVisibility(8);
        } else {
            this.f44397x0.setVisibility(0);
        }
    }

    public final void W0(TLRPC.TL_secureFile tL_secureFile, int i7) {
        byte[] bArr = tL_secureFile.secret;
        byte[] bArr2 = tL_secureFile.file_hash;
        byte[] r10 = Utilities.r(m1(bArr, bArr2), bArr2);
        byte[] bArr3 = new byte[32];
        System.arraycopy(r10, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(r10, 32, bArr4, 0, 16);
        V0(new org.telegram.messenger.ew(new org.telegram.messenger.fw(bArr3, bArr4), tL_secureFile, null, null, null), i7);
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
                    this.G0.setLayoutParams(c8.ha.k(0.0f, 25.0f, 0.0f, 0.0f, -1, -2));
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
                this.G0.setLayoutParams(c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                if (this.Y != null) {
                    TL_account.Password password2 = this.J;
                    if (password2 != null && !TextUtils.isEmpty(password2.hint)) {
                        this.Y[0].setHint(this.J.hint);
                        return;
                    } else {
                        this.Y[0].setHint(org.telegram.messenger.hd.M0(2131748725, null));
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
        this.f44366i1.clear();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i7);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                W0((TLRPC.TL_secureFile) secureFile, 0);
            }
        }
    }

    public final void X1(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bk0.X1(int):void");
    }

    public final org.telegram.ui.ak0 Y0(android.content.Context r28, org.telegram.tgnet.TLRPC.TL_secureRequiredType r29, java.util.ArrayList r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bk0.Y0(android.content.Context, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.util.ArrayList, boolean, boolean):org.telegram.ui.ak0");
    }

    public final void Z0(ArrayList arrayList) {
        this.f44370k1.clear();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i7);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                W0((TLRPC.TL_secureFile) secureFile, 4);
            }
        }
    }

    public final void a1(boolean z9) {
        int i7;
        if (!this.f44362g1) {
            String str = this.f44373n;
            boolean isEmpty = TextUtils.isEmpty(str);
            int i10 = this.f44347b;
            if (!isEmpty) {
                if (z9) {
                    Activity parentActivity = getParentActivity();
                    vf.c.q(parentActivity, Uri.parse(str + "&tg_passport=success"), true, true);
                } else if (!this.f44360f1 && (i10 == 5 || i10 == 0)) {
                    Activity parentActivity2 = getParentActivity();
                    vf.c.q(parentActivity2, Uri.parse(str + "&tg_passport=cancel"), true, true);
                }
                this.f44362g1 = true;
            } else if (this.C1) {
                if (z9 || (!this.f44360f1 && (i10 == 5 || i10 == 0))) {
                    Activity parentActivity3 = getParentActivity();
                    if (z9) {
                        i7 = -1;
                    } else {
                        i7 = 0;
                    }
                    parentActivity3.setResult(i7);
                }
                this.f44362g1 = true;
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28146t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28185v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28128s8));
    }

    public final boolean b1(boolean z9) {
        if (y1()) {
            return false;
        }
        if (z9) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747579, null), new si0(this, 1));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            String M0 = org.telegram.messenger.hd.M0(2131751406, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.hd.M0(2131747578, null);
            showDialog(u1Var);
        }
        return true;
    }

    public final void c1(boolean z9) {
        String str;
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.f44345a0 != null) {
            String str2 = (String) this.Y0.get(this.f44393w);
            String str3 = (String) org.telegram.messenger.iz.n().get(this.f44393w);
            int i7 = 0;
            if (this.E.native_names && !TextUtils.isEmpty(this.f44393w) && !"EN".equals(str3)) {
                if (this.f44379q0.getVisibility() != 0) {
                    this.f44379q0.setVisibility(0);
                    this.f44367j0.setVisibility(0);
                    this.T.setVisibility(0);
                    int i10 = 0;
                    while (true) {
                        editTextBoldCursorArr = this.f44345a0;
                        if (i10 >= editTextBoldCursorArr.length) {
                            break;
                        }
                        ((View) editTextBoldCursorArr[i10].getParent()).setVisibility(0);
                        i10++;
                    }
                    if (editTextBoldCursorArr[0].length() == 0 && this.f44345a0[1].length() == 0 && this.f44345a0[2].length() == 0) {
                        int i11 = 0;
                        while (true) {
                            boolean[] zArr = this.f44387t0;
                            if (i11 >= zArr.length) {
                                break;
                            } else if (zArr[i11]) {
                                this.f44345a0[0].setText(this.Y[0].getText());
                                this.f44345a0[1].setText(this.Y[1].getText());
                                this.f44345a0[2].setText(this.Y[2].getText());
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                    org.telegram.ui.ActionBar.r6.a0(this.m0, getParentActivity(), 2131231229, org.telegram.ui.ActionBar.k6.f27812b7);
                }
                this.f44379q0.setText(org.telegram.messenger.hd.a0("PassportNativeInfo", null, 2131747497, str2));
                if (str3 != null) {
                    String concat = "PassportLanguage_".concat(str3);
                    str = org.telegram.messenger.hd.E0().Y.b(concat);
                    if (str == null) {
                        org.telegram.messenger.hd E0 = org.telegram.messenger.hd.E0();
                        E0.i();
                        str = E0.W.b(concat);
                    }
                } else {
                    str = null;
                }
                if (str != null) {
                    this.f44367j0.setText(org.telegram.messenger.hd.a0("PassportNativeHeaderLang", null, 2131747498, str));
                } else {
                    this.f44367j0.setText(org.telegram.messenger.hd.M0(2131747499, null));
                }
                for (int i12 = 0; i12 < 3; i12++) {
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 == 2) {
                                if (str != null) {
                                    this.f44345a0[i12].setHintText(org.telegram.messenger.hd.M0(2131747457, null));
                                } else {
                                    this.f44345a0[i12].setHintText(org.telegram.messenger.hd.a0("PassportSurnameCountry", null, 2131747456, str2));
                                }
                            }
                        } else if (str != null) {
                            this.f44345a0[i12].setHintText(org.telegram.messenger.hd.M0(2131747506, null));
                        } else {
                            this.f44345a0[i12].setHintText(org.telegram.messenger.hd.a0("PassportMidnameCountry", null, 2131747505, str2));
                        }
                    } else if (str != null) {
                        this.f44345a0[i12].setHintText(org.telegram.messenger.hd.M0(2131747503, null));
                    } else {
                        this.f44345a0[i12].setHintText(org.telegram.messenger.hd.a0("PassportNameCountry", null, 2131747501, str2));
                    }
                }
                if (z9) {
                    org.telegram.messenger.g0.h3(new pi0(this, 2));
                }
            } else if (this.f44379q0.getVisibility() != 8) {
                this.f44379q0.setVisibility(8);
                this.f44367j0.setVisibility(8);
                this.T.setVisibility(8);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.f44345a0;
                    if (i7 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    ((View) editTextBoldCursorArr2[i7].getParent()).setVisibility(8);
                    i7++;
                }
                if (((this.f44350c != 0 || this.F == null) && this.H != null && !this.f44391v0) || this.I != null) {
                    org.telegram.ui.ActionBar.r6.a0(this.m0, getParentActivity(), 2131231229, org.telegram.ui.ActionBar.k6.f27812b7);
                } else {
                    org.telegram.ui.ActionBar.r6.a0(this.m0, getParentActivity(), 2131231230, org.telegram.ui.ActionBar.k6.f27812b7);
                }
            }
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bk0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        EditTextBoldCursor editTextBoldCursor;
        zj0 zj0Var;
        org.telegram.ui.ActionBar.r0 r0Var;
        if (i7 == org.telegram.messenger.qs.U1) {
            String str = (String) objArr[0];
            HashMap hashMap = this.f44376o1;
            org.telegram.messenger.ew ewVar = (org.telegram.messenger.ew) hashMap.get(str);
            if (ewVar != null) {
                ewVar.d = (TLRPC.TL_inputFile) objArr[1];
                hashMap.remove(str);
                if (hashMap.isEmpty() && (r0Var = this.L) != null) {
                    r0Var.setEnabled(true);
                    this.L.setAlpha(1.0f);
                }
                HashMap hashMap2 = this.n1;
                if (hashMap2 != null && (zj0Var = (zj0) hashMap2.get(ewVar)) != null) {
                    zj0Var.a(true);
                }
                HashMap hashMap3 = this.f44401y1;
                if (hashMap3 != null && hashMap3.containsKey("error_document_all")) {
                    hashMap3.remove("error_document_all");
                    e1(false);
                }
                int i11 = ewVar.f22263i;
                if (i11 == 0) {
                    if (this.f44374n0 != null && !TextUtils.isEmpty(this.f44403z1)) {
                        this.f44374n0.setText(this.f44403z1);
                    }
                    hashMap3.remove("files_all");
                } else if (i11 == 4) {
                    if (this.f44375o0 != null && !TextUtils.isEmpty(this.A1)) {
                        this.f44375o0.setText(this.A1);
                    }
                    hashMap3.remove("translation_all");
                }
            }
        } else if (i7 != org.telegram.messenger.qs.V1 && i7 == org.telegram.messenger.qs.f25034p0) {
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
                    Utilities.f21331b.nextBytes(bArr);
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
        org.telegram.ui.Components.di diVar = this.R0;
        if (diVar != null && this.visibleDialog == diVar) {
            diVar.f32882a2.d0(false);
            this.R0.K();
            this.R0.f32882a2.g0(true);
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

    public final void e1(boolean z9) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        String str2;
        if (this.f44377p0 != null) {
            HashMap hashMap = this.f44395w1;
            HashMap hashMap2 = this.f44401y1;
            if (hashMap != null && ((z9 || hashMap2.containsKey("error_all")) && (str2 = (String) this.f44395w1.get("error_all")) != null)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
                if (z9) {
                    hashMap2.put("error_all", "");
                }
            } else {
                spannableStringBuilder = null;
            }
            if (this.f44398x1 != null && ((z9 || hashMap2.containsKey("error_document_all")) && (str = (String) this.f44398x1.get("error_all")) != null)) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder(str);
                } else {
                    spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) str);
                }
                if (z9) {
                    hashMap2.put("error_document_all", "");
                }
            }
            if (spannableStringBuilder != null) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.k6.f28069p7, null), 0, spannableStringBuilder.length(), 33);
                this.f44377p0.setText(spannableStringBuilder);
                this.f44377p0.setVisibility(0);
            } else if (this.f44377p0.getVisibility() != 8) {
                this.f44377p0.setVisibility(8);
            }
        }
    }

    public final void f1(Context context) {
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
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
        this.f44377p0 = z8Var;
        int i7 = org.telegram.ui.ActionBar.k6.f27812b7;
        org.telegram.ui.ActionBar.r6.a0(z8Var, context, 2131231231, i7);
        this.f44377p0.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        this.f44351c0.addView(this.f44377p0, c8.ha.o(-1, -2));
        e1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        if (tL_secureRequiredType != null) {
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131754673, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
                this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131754682, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131754671, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131754675, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131754672, null));
            }
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
            this.f44367j0 = n4Var;
            n4Var.setText(org.telegram.messenger.hd.M0(2131747575, null));
            org.telegram.ui.Cells.n4 n4Var2 = this.f44367j0;
            int i10 = org.telegram.ui.ActionBar.k6.f27848d6;
            org.telegram.ui.ActionBar.r6.i(i10, n4Var2, null);
            j3 = 0;
            this.f44351c0.addView(this.f44367j0, c8.ha.o(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.f44353d0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f44351c0.addView(this.f44353d0, c8.ha.o(-1, -2));
            org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
            this.R = w9Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
            int i11 = org.telegram.ui.ActionBar.k6.f27940i6;
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
            w9Var.setBackground(N0);
            org.telegram.ui.ActionBar.r6.k(w9Var, N0, N, N2, null);
            this.f44351c0.addView(this.R, c8.ha.o(-1, -2));
            this.R.setOnClickListener(new qi0(this, 7));
            org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
            this.f44374n0 = z8Var2;
            org.telegram.ui.ActionBar.r6.a0(z8Var2, context, 2131231229, i7);
            if (this.f44350c != 0) {
                this.f44403z1 = org.telegram.messenger.hd.M0(2131747626, null);
            } else {
                TLRPC.SecureValueType secureValueType2 = this.F.type;
                if (secureValueType2 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                    this.f44403z1 = org.telegram.messenger.hd.M0(2131747624, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                    this.f44403z1 = org.telegram.messenger.hd.M0(2131747620, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                    this.f44403z1 = org.telegram.messenger.hd.M0(2131747610, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                    this.f44403z1 = org.telegram.messenger.hd.M0(2131747608, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                    this.f44403z1 = org.telegram.messenger.hd.M0(2131747622, null);
                } else {
                    this.f44403z1 = "";
                }
            }
            String str2 = this.f44403z1;
            HashMap hashMap = this.f44398x1;
            HashMap hashMap2 = this.f44401y1;
            String str3 = str2;
            if (hashMap != null) {
                String str4 = (String) hashMap.get("files_all");
                str3 = str2;
                if (str4 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                    spannableStringBuilder.append((CharSequence) "\n\n");
                    spannableStringBuilder.append((CharSequence) this.f44403z1);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.k6.f28069p7, null), 0, str4.length(), 33);
                    hashMap2.put("files_all", "");
                    str3 = spannableStringBuilder;
                }
            }
            this.f44374n0.setText(str3);
            this.f44351c0.addView(this.f44374n0, c8.ha.o(-1, -2));
            if (this.F.translation_required) {
                org.telegram.ui.Cells.n4 n4Var3 = new org.telegram.ui.Cells.n4(context);
                this.f44367j0 = n4Var3;
                n4Var3.setText(org.telegram.messenger.hd.M0(2131747454, null));
                org.telegram.ui.ActionBar.r6.i(i10, this.f44367j0, null);
                this.f44351c0.addView(this.f44367j0, c8.ha.o(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.f44363h0 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.f44351c0.addView(this.f44363h0, c8.ha.o(-1, -2));
                org.telegram.ui.Cells.w9 w9Var2 = new org.telegram.ui.Cells.w9(context);
                this.X = w9Var2;
                org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.k6.N0(true);
                org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i10);
                org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i11);
                w9Var2.setBackground(N02);
                org.telegram.ui.ActionBar.r6.k(w9Var2, N02, N3, N4, null);
                this.f44351c0.addView(this.X, c8.ha.o(-1, -2));
                this.X.setOnClickListener(new qi0(this, 8));
                org.telegram.ui.Cells.z8 z8Var3 = new org.telegram.ui.Cells.z8(context);
                this.f44375o0 = z8Var3;
                org.telegram.ui.ActionBar.r6.a0(z8Var3, context, 2131231229, i7);
                if (this.f44350c != 0) {
                    this.A1 = org.telegram.messenger.hd.M0(2131747602, null);
                } else {
                    TLRPC.SecureValueType secureValueType3 = this.F.type;
                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                        this.A1 = org.telegram.messenger.hd.M0(2131747607, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                        this.A1 = org.telegram.messenger.hd.M0(2131747605, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                        this.A1 = org.telegram.messenger.hd.M0(2131747604, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                        this.A1 = org.telegram.messenger.hd.M0(2131747603, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                        this.A1 = org.telegram.messenger.hd.M0(2131747606, null);
                    } else {
                        this.A1 = "";
                    }
                }
                String str5 = this.A1;
                HashMap hashMap3 = this.f44398x1;
                String str6 = str5;
                if (hashMap3 != null) {
                    String str7 = (String) hashMap3.get("translation_all");
                    str6 = str5;
                    if (str7 != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str7);
                        spannableStringBuilder2.append((CharSequence) "\n\n");
                        spannableStringBuilder2.append((CharSequence) this.A1);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.k6.f28069p7, null), 0, str7.length(), 33);
                        hashMap2.put("translation_all", "");
                        str6 = spannableStringBuilder2;
                    }
                }
                this.f44375o0.setText(str6);
                this.f44351c0.addView(this.f44375o0, c8.ha.o(-1, -2));
            }
        } else {
            j3 = 0;
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131747601, null));
        }
        org.telegram.ui.Cells.n4 n4Var4 = new org.telegram.ui.Cells.n4(context);
        this.f44367j0 = n4Var4;
        n4Var4.setText(org.telegram.messenger.hd.M0(2131747600, null));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, this.f44367j0, null);
        this.f44351c0.addView(this.f44367j0, c8.ha.o(-1, -2));
        this.Y = new EditTextBoldCursor[6];
        for (int i12 = 0; i12 < 6; i12++) {
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.Y[i12] = editTextBoldCursor;
            yi0 yi0Var = new yi0(context, editTextBoldCursor, 0);
            yi0Var.setWillNotDraw(false);
            this.f44351c0.addView(yi0Var, c8.ha.o(-1, -2));
            int i13 = org.telegram.ui.ActionBar.k6.f27848d6;
            org.telegram.ui.ActionBar.r6.i(i13, yi0Var, null);
            int i14 = 5;
            if (i12 == 5) {
                View view = new View(context);
                this.S = view;
                org.telegram.ui.ActionBar.r6.i(i13, view, null);
                this.f44351c0.addView(this.S, c8.ha.o(-1, 6));
            }
            if (this.f44391v0 && this.F != null) {
                yi0Var.setVisibility(8);
                View view2 = this.S;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            this.Y[i12].setTag(Integer.valueOf(i12));
            this.Y[i12].setSupportRtlHint(true);
            this.Y[i12].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.B(this.Y[i12], org.telegram.ui.ActionBar.k6.H6, null);
            org.telegram.ui.ActionBar.r6.A(this.Y[i12], org.telegram.ui.ActionBar.k6.L6, null);
            this.Y[i12].setTransformHintToHeader(true);
            EditTextBoldCursor editTextBoldCursor2 = this.Y[i12];
            int i15 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor2, i15, null);
            this.Y[i12].setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.r6.w(this.Y[i12], i15, null);
            this.Y[i12].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.Y[i12].setCursorWidth(1.5f);
            org.telegram.ui.ActionBar.r6.G(this.Y[i12], org.telegram.ui.ActionBar.k6.f27977k6, org.telegram.ui.ActionBar.k6.f27995l6, org.telegram.ui.ActionBar.k6.f28069p7, null);
            if (i12 == 5) {
                this.Y[i12].setOnTouchListener(new ri0(this, 2));
                this.Y[i12].setInputType(0);
                this.Y[i12].setFocusable(false);
            } else {
                this.Y[i12].setInputType(16385);
                this.Y[i12].setImeOptions(268435461);
            }
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                if (i12 == 5) {
                                    this.Y[i12].setHintText(org.telegram.messenger.hd.M0(2131747593, null));
                                    str = "country_code";
                                }
                            } else {
                                this.Y[i12].setHintText(org.telegram.messenger.hd.M0(2131747460, null));
                                str = "state";
                            }
                        } else {
                            this.Y[i12].setHintText(org.telegram.messenger.hd.M0(2131747594, null));
                            str = "city";
                        }
                    } else {
                        this.Y[i12].setHintText(org.telegram.messenger.hd.M0(2131747479, null));
                        str = "post_code";
                    }
                } else {
                    this.Y[i12].setHintText(org.telegram.messenger.hd.M0(2131747458, null));
                    str = "street_line2";
                }
            } else {
                this.Y[i12].setHintText(org.telegram.messenger.hd.M0(2131747459, null));
                str = "street_line1";
            }
            N1(this.f44386s1, this.Y[i12], str);
            if (i12 == 2) {
                this.Y[i12].addTextChangedListener(new zi0(this, editTextBoldCursor, str));
                this.Y[i12].setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            } else {
                this.Y[i12].addTextChangedListener(new aj0(this, editTextBoldCursor, str, 0));
            }
            EditTextBoldCursor editTextBoldCursor3 = this.Y[i12];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.Y[i12].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.Y[i12];
            if (!org.telegram.messenger.hd.f22871a0) {
                i14 = 3;
            }
            editTextBoldCursor4.setGravity(i14 | 16);
            yi0Var.addView(this.Y[i12], c8.ha.d(-1, 64.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
            this.Y[i12].setOnEditorActionListener(new oi0(this, 4));
        }
        org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
        this.f44371l0 = y6Var;
        this.f44351c0.addView(y6Var, c8.ha.o(-1, -2));
        if (this.f44391v0 && this.F != null) {
            this.f44367j0.setVisibility(8);
            this.f44371l0.setVisibility(8);
        }
        int i16 = (this.f44350c > j3 ? 1 : (this.f44350c == j3 ? 0 : -1));
        TLRPC.TL_secureValue tL_secureValue = this.I;
        if (((i16 != 0 || this.F == null) && this.H != null && !this.f44391v0) || tL_secureValue != null) {
            if (tL_secureValue != null) {
                X0(tL_secureValue.files);
                Z0(tL_secureValue.translation);
            }
            org.telegram.ui.Cells.y6 y6Var2 = this.f44371l0;
            int i17 = org.telegram.ui.ActionBar.k6.f27812b7;
            org.telegram.ui.ActionBar.r6.a0(y6Var2, context, 2131231229, i17);
            org.telegram.ui.Cells.w9 w9Var3 = new org.telegram.ui.Cells.w9(context);
            org.telegram.ui.ActionBar.r6.V(w9Var3.getTextView(), org.telegram.ui.ActionBar.k6.f28069p7, null);
            org.telegram.ui.Cells.y N03 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27848d6);
            org.telegram.ui.ActionBar.n6 N6 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27940i6);
            w9Var3.setBackground(N03);
            org.telegram.ui.ActionBar.r6.k(w9Var3, N03, N5, N6, null);
            if (this.F == null) {
                w9Var3.b(org.telegram.messenger.hd.M0(2131747586, null), false);
            } else {
                w9Var3.b(org.telegram.messenger.hd.M0(2131747591, null), false);
            }
            this.f44351c0.addView(w9Var3, c8.ha.o(-1, -2));
            w9Var3.setOnClickListener(new qi0(this, 9));
            org.telegram.ui.Cells.y6 y6Var3 = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
            this.f44371l0 = y6Var3;
            org.telegram.ui.ActionBar.r6.a0(y6Var3, context, 2131231230, i17);
            this.f44351c0.addView(this.f44371l0, c8.ha.o(-1, -2));
        } else {
            org.telegram.ui.Cells.y6 y6Var4 = this.f44371l0;
            int i18 = org.telegram.ui.ActionBar.k6.f27812b7;
            org.telegram.ui.ActionBar.r6.a0(y6Var4, context, 2131231230, i18);
            if (this.f44391v0 && this.F != null) {
                org.telegram.ui.ActionBar.r6.a0(this.f44374n0, context, 2131231230, i18);
            }
        }
        X1(0);
        X1(4);
    }

    public final void g1() {
        if (getParentActivity() != null && this.R0 == null) {
            org.telegram.ui.Components.di diVar = new org.telegram.ui.Components.di(getParentActivity(), this, false, false);
            this.R0 = diVar;
            diVar.T3 = new bj0(this);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44348b0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28128s8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f44369k0;
            if (i10 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) arrayList2.get(i10), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27849d7));
            i10++;
        }
        for (Map.Entry entry : this.n1.entrySet()) {
            arrayList.add(new org.telegram.ui.ActionBar.t6((zj0) entry.getValue(), 268435456, new Class[]{zj0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27848d6));
        }
        int i11 = org.telegram.ui.ActionBar.k6.f27848d6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44351c0, 268435456, new Class[]{org.telegram.ui.Cells.y8.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44351c0, 268435456, new Class[]{org.telegram.ui.Cells.w9.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44351c0, 268435456, new Class[]{ak0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        if (this.Y != null) {
            int i12 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.Y;
                if (i12 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) editTextBoldCursorArr[i12].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27848d6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y[i12], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y[i12], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27977k6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y[i12], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27995l6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y[i12], 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28069p7));
                i12++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27977k6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27995l6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28069p7));
        }
        if (this.f44345a0 != null) {
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.f44345a0;
                if (i7 >= editTextBoldCursorArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) editTextBoldCursorArr2[i7].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27848d6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44345a0[i7], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44345a0[i7], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27977k6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44345a0[i7], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27995l6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44345a0[i7], 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28069p7));
                i7++;
            }
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.F0, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27922h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Q, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27895fi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Q, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27915gi));
        return arrayList;
    }

    public final void h1() {
        int L;
        int L2;
        boolean[] zArr = {true};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), new pu(26, this, zArr));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        String M0 = org.telegram.messenger.hd.M0(2131689472, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.R = M0;
        boolean z9 = this.f44391v0;
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.E;
        if (z9 && this.F == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeAddress)) {
            u1Var.T = org.telegram.messenger.hd.M0(2131747592, null);
        } else if (z9 && this.F == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            u1Var.T = org.telegram.messenger.hd.M0(2131747585, null);
        } else {
            u1Var.T = org.telegram.messenger.hd.M0(2131747589, null);
        }
        if (!this.f44391v0 && this.F != null) {
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(getParentActivity(), 1);
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(false);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27940i6);
            c2Var.setBackground(N0);
            org.telegram.ui.ActionBar.r6.k(c2Var, N0, null, N, null);
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                c2Var.e(org.telegram.messenger.hd.M0(2131747590, null), "", true, false, false);
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                c2Var.e(org.telegram.messenger.hd.M0(2131747588, null), "", true, false, false);
            }
            if (org.telegram.messenger.hd.f22871a0) {
                L = org.telegram.messenger.g0.L(16.0f);
            } else {
                L = org.telegram.messenger.g0.L(8.0f);
            }
            if (org.telegram.messenger.hd.f22871a0) {
                L2 = org.telegram.messenger.g0.L(8.0f);
            } else {
                L2 = org.telegram.messenger.g0.L(16.0f);
            }
            c2Var.setPadding(L, 0, L2, 0);
            frameLayout.addView(c2Var, c8.ha.e(-1, 48, 51));
            c2Var.setOnClickListener(new j8(4, zArr));
            alertDialog$Builder.o(frameLayout);
        }
        showDialog(u1Var);
    }

    public final void i1(Context context) {
        int i7;
        String str;
        int i10;
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
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
        this.f44377p0 = z8Var;
        int i13 = org.telegram.ui.ActionBar.k6.f27812b7;
        org.telegram.ui.ActionBar.r6.a0(z8Var, context, 2131231231, i13);
        this.f44377p0.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        int i14 = -1;
        this.f44351c0.addView(this.f44377p0, c8.ha.o(-1, -2));
        e1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.E;
        org.telegram.ui.ActionBar.f6 f6Var = null;
        if (tL_secureRequiredType != null) {
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
            this.f44367j0 = n4Var;
            if (this.f44391v0) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131747575, null));
            } else {
                n4Var.setText(org.telegram.messenger.hd.M0(2131747474, null));
            }
            org.telegram.ui.Cells.n4 n4Var2 = this.f44367j0;
            int i15 = org.telegram.ui.ActionBar.k6.f27848d6;
            org.telegram.ui.ActionBar.r6.i(i15, n4Var2, null);
            this.f44351c0.addView(this.f44367j0, c8.ha.o(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.f44356e0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f44351c0.addView(this.f44356e0, c8.ha.o(-1, -2));
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            this.U = y8Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i15);
            int i16 = org.telegram.ui.ActionBar.k6.f27940i6;
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i16);
            y8Var.setBackground(N0);
            org.telegram.ui.ActionBar.r6.k(y8Var, N0, N, N2, null);
            this.f44351c0.addView(this.U, c8.ha.o(-1, -2));
            this.U.setOnClickListener(new qi0(this, 0));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.f44359f0 = linearLayout2;
            linearLayout2.setOrientation(1);
            this.f44351c0.addView(this.f44359f0, c8.ha.o(-1, -2));
            boolean z9 = this.F.selfie_required;
            org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context);
            this.V = y8Var2;
            org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i15);
            org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i16);
            y8Var2.setBackground(N02);
            org.telegram.ui.ActionBar.r6.k(y8Var2, N02, N3, N4, null);
            this.V.a(org.telegram.messenger.hd.M0(2131747471, null), org.telegram.messenger.hd.M0(2131747470, null), z9);
            this.f44351c0.addView(this.V, c8.ha.o(-1, -2));
            this.V.setOnClickListener(new qi0(this, 2));
            if (this.F.selfie_required) {
                LinearLayout linearLayout3 = new LinearLayout(context);
                this.f44361g0 = linearLayout3;
                linearLayout3.setOrientation(1);
                this.f44351c0.addView(this.f44361g0, c8.ha.o(-1, -2));
                org.telegram.ui.Cells.y8 y8Var3 = new org.telegram.ui.Cells.y8(context);
                this.W = y8Var3;
                org.telegram.ui.Cells.y N03 = org.telegram.ui.ActionBar.k6.N0(true);
                org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i15);
                org.telegram.ui.ActionBar.n6 N6 = org.telegram.ui.ActionBar.r6.N(i16);
                y8Var3.setBackground(N03);
                org.telegram.ui.ActionBar.r6.k(y8Var3, N03, N5, N6, null);
                this.W.a(org.telegram.messenger.hd.M0(2131747462, null), org.telegram.messenger.hd.M0(2131747461, null), tL_secureRequiredType2.translation_required);
                this.f44351c0.addView(this.W, c8.ha.o(-1, -2));
                this.W.setOnClickListener(new qi0(this, 3));
            }
            org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
            this.f44374n0 = z8Var2;
            org.telegram.ui.ActionBar.r6.a0(z8Var2, context, 2131231229, i13);
            this.f44374n0.setText(org.telegram.messenger.hd.M0(2131747488, null));
            this.f44351c0.addView(this.f44374n0, c8.ha.o(-1, -2));
            if (this.F.translation_required) {
                org.telegram.ui.Cells.n4 n4Var3 = new org.telegram.ui.Cells.n4(context);
                this.f44367j0 = n4Var3;
                n4Var3.setText(org.telegram.messenger.hd.M0(2131747454, null));
                org.telegram.ui.ActionBar.r6.i(i15, this.f44367j0, null);
                this.f44351c0.addView(this.f44367j0, c8.ha.o(-1, -2));
                LinearLayout linearLayout4 = new LinearLayout(context);
                this.f44363h0 = linearLayout4;
                linearLayout4.setOrientation(1);
                this.f44351c0.addView(this.f44363h0, c8.ha.o(-1, -2));
                org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
                this.X = w9Var;
                org.telegram.ui.Cells.y N04 = org.telegram.ui.ActionBar.k6.N0(true);
                org.telegram.ui.ActionBar.n6 N7 = org.telegram.ui.ActionBar.r6.N(i15);
                org.telegram.ui.ActionBar.n6 N8 = org.telegram.ui.ActionBar.r6.N(i16);
                w9Var.setBackground(N04);
                org.telegram.ui.ActionBar.r6.k(w9Var, N04, N7, N8, null);
                this.f44351c0.addView(this.X, c8.ha.o(-1, -2));
                this.X.setOnClickListener(new qi0(this, 4));
                org.telegram.ui.Cells.z8 z8Var3 = new org.telegram.ui.Cells.z8(context);
                this.f44375o0 = z8Var3;
                org.telegram.ui.ActionBar.r6.a0(z8Var3, context, 2131231229, i13);
                if (this.f44350c != 0) {
                    this.A1 = org.telegram.messenger.hd.M0(2131747602, null);
                } else {
                    TLRPC.SecureValueType secureValueType = this.F.type;
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
                        this.A1 = org.telegram.messenger.hd.M0(2131747612, null);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                        this.A1 = org.telegram.messenger.hd.M0(2131747615, null);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                        this.A1 = org.telegram.messenger.hd.M0(2131747617, null);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                        this.A1 = org.telegram.messenger.hd.M0(2131747618, null);
                    } else {
                        this.A1 = "";
                    }
                }
                String str4 = this.A1;
                HashMap hashMap = this.f44398x1;
                String str5 = str4;
                if (hashMap != null) {
                    String str6 = (String) hashMap.get("translation_all");
                    str5 = str4;
                    if (str6 != null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str6);
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) this.A1);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.k6.f28069p7, null), 0, str6.length(), 33);
                        this.f44401y1.put("translation_all", "");
                        str5 = spannableStringBuilder;
                    }
                }
                this.f44375o0.setText(str5);
                this.f44351c0.addView(this.f44375o0, c8.ha.o(-1, -2));
            }
        } else {
            org.telegram.ui.Cells.w9 w9Var2 = new org.telegram.ui.Cells.w9(context);
            this.f44382r0 = w9Var2;
            org.telegram.ui.Cells.y N05 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N9 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27848d6);
            org.telegram.ui.ActionBar.n6 N10 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27940i6);
            w9Var2.setBackground(N05);
            org.telegram.ui.ActionBar.r6.k(w9Var2, N05, N9, N10, null);
            this.f44382r0.b(org.telegram.messenger.hd.M0(2131747469, null), false);
            this.f44351c0.addView(this.f44382r0, c8.ha.o(-1, -2));
            this.f44382r0.setOnClickListener(new qi0(this, 5));
            org.telegram.ui.Cells.z8 z8Var4 = new org.telegram.ui.Cells.z8(context);
            this.f44374n0 = z8Var4;
            org.telegram.ui.ActionBar.r6.a0(z8Var4, context, 2131231229, i13);
            this.f44374n0.setText(org.telegram.messenger.hd.M0(2131747468, null));
            this.f44351c0.addView(this.f44374n0, c8.ha.o(-1, -2));
        }
        org.telegram.ui.Cells.n4 n4Var4 = new org.telegram.ui.Cells.n4(context);
        this.f44367j0 = n4Var4;
        if (this.f44391v0) {
            n4Var4.setText(org.telegram.messenger.hd.M0(2131747577, null));
        } else {
            n4Var4.setText(org.telegram.messenger.hd.M0(2131747491, null));
        }
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, this.f44367j0, null);
        this.f44351c0.addView(this.f44367j0, c8.ha.o(-1, -2));
        int i17 = 7;
        if (this.F != null) {
            i7 = 9;
        } else {
            i7 = 7;
        }
        this.Y = new EditTextBoldCursor[i7];
        int i18 = 0;
        while (true) {
            int i19 = 6;
            HashMap hashMap2 = this.f44386s1;
            if (i18 < i7) {
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.Y[i18] = editTextBoldCursor;
                yi0 yi0Var = new yi0(context, editTextBoldCursor, 1);
                yi0Var.setWillNotDraw(false);
                this.f44351c0.addView(yi0Var, c8.ha.o(i14, 64));
                int i20 = org.telegram.ui.ActionBar.k6.f27848d6;
                org.telegram.ui.ActionBar.r6.i(i20, yi0Var, f6Var);
                if (i18 == i7 - 1) {
                    View view = new View(context);
                    this.S = view;
                    org.telegram.ui.ActionBar.r6.i(i20, view, f6Var);
                    this.f44351c0.addView(this.S, c8.ha.o(i14, 6));
                }
                if (this.f44391v0 && this.F != null && i18 < i17) {
                    yi0Var.setVisibility(8);
                    View view2 = this.S;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                }
                this.Y[i18].setTag(Integer.valueOf(i18));
                this.Y[i18].setSupportRtlHint(true);
                this.Y[i18].setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.r6.B(this.Y[i18], org.telegram.ui.ActionBar.k6.H6, null);
                EditTextBoldCursor editTextBoldCursor2 = this.Y[i18];
                int i21 = org.telegram.ui.ActionBar.k6.G6;
                org.telegram.ui.ActionBar.r6.V(editTextBoldCursor2, i21, null);
                org.telegram.ui.ActionBar.r6.A(this.Y[i18], org.telegram.ui.ActionBar.k6.L6, null);
                this.Y[i18].setTransformHintToHeader(true);
                this.Y[i18].setBackgroundDrawable(null);
                org.telegram.ui.ActionBar.r6.w(this.Y[i18], i21, null);
                this.Y[i18].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                this.Y[i18].setCursorWidth(1.5f);
                org.telegram.ui.ActionBar.r6.G(this.Y[i18], org.telegram.ui.ActionBar.k6.f27977k6, org.telegram.ui.ActionBar.k6.f27995l6, org.telegram.ui.ActionBar.k6.f28069p7, null);
                if (i18 == 5 || i18 == 6) {
                    i11 = 7;
                    this.Y[i18].setOnTouchListener(new ri0(this, 0));
                    this.Y[i18].setInputType(0);
                } else if (i18 != 3 && i18 != 8) {
                    if (i18 == 4) {
                        this.Y[i18].setOnTouchListener(new ri0(this, 1));
                        this.Y[i18].setInputType(0);
                        this.Y[i18].setFocusable(false);
                    } else {
                        this.Y[i18].setInputType(16385);
                        this.Y[i18].setImeOptions(268435461);
                    }
                    i11 = 7;
                } else {
                    i11 = 7;
                    this.Y[i18].setOnTouchListener(new fi.n1(7, this, context));
                    this.Y[i18].setInputType(0);
                    this.Y[i18].setFocusable(false);
                }
                HashMap hashMap3 = this.f44388t1;
                switch (i18) {
                    case 0:
                        if (tL_secureRequiredType2.native_names) {
                            this.Y[i18].setHintText(org.telegram.messenger.hd.M0(2131747500, null));
                        } else {
                            this.Y[i18].setHintText(org.telegram.messenger.hd.M0(2131747503, null));
                        }
                        str2 = "first_name";
                        break;
                    case 1:
                        if (tL_secureRequiredType2.native_names) {
                            this.Y[i18].setHintText(org.telegram.messenger.hd.M0(2131747504, null));
                        } else {
                            this.Y[i18].setHintText(org.telegram.messenger.hd.M0(2131747506, null));
                        }
                        str2 = "middle_name";
                        break;
                    case 2:
                        if (tL_secureRequiredType2.native_names) {
                            this.Y[i18].setHintText(org.telegram.messenger.hd.M0(2131747455, null));
                        } else {
                            this.Y[i18].setHintText(org.telegram.messenger.hd.M0(2131747457, null));
                        }
                        str2 = "last_name";
                        break;
                    case 3:
                        this.Y[i18].setHintText(org.telegram.messenger.hd.M0(2131747596, null));
                        str2 = "birth_date";
                        break;
                    case 4:
                        this.Y[i18].setHintText(org.telegram.messenger.hd.M0(2131747565, null));
                        str2 = "gender";
                        break;
                    case 5:
                        this.Y[i18].setHintText(org.telegram.messenger.hd.M0(2131747595, null));
                        str2 = "country_code";
                        break;
                    case 6:
                        this.Y[i18].setHintText(org.telegram.messenger.hd.M0(2131747473, null));
                        str2 = "residence_country_code";
                        break;
                    case 7:
                        this.Y[i18].setHintText(org.telegram.messenger.hd.M0(2131747576, null));
                        str3 = "document_no";
                        String str7 = str3;
                        hashMap2 = hashMap3;
                        str2 = str7;
                        break;
                    case 8:
                        this.Y[i18].setHintText(org.telegram.messenger.hd.M0(2131747569, null));
                        str3 = "expiry_date";
                        String str72 = str3;
                        hashMap2 = hashMap3;
                        str2 = str72;
                        break;
                    default:
                        i18++;
                        i17 = i11;
                        i14 = -1;
                        f6Var = null;
                }
                N1(hashMap2, this.Y[i18], str2);
                EditTextBoldCursor editTextBoldCursor3 = this.Y[i18];
                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                if (i18 != 0 && i18 != 2 && i18 != 1) {
                    this.Y[i18].addTextChangedListener(new org.telegram.ui.Components.lv0(this, editTextBoldCursor, str2, hashMap2));
                } else {
                    this.Y[i18].addTextChangedListener(new aj0(this, editTextBoldCursor, str2, 1));
                }
                this.Y[i18].setPadding(0, 0, 0, 0);
                EditTextBoldCursor editTextBoldCursor4 = this.Y[i18];
                if (org.telegram.messenger.hd.f22871a0) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                editTextBoldCursor4.setGravity(i12 | 16);
                yi0Var.addView(this.Y[i18], c8.ha.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                this.Y[i18].setOnEditorActionListener(new oi0(this, 1));
                i18++;
                i17 = i11;
                i14 = -1;
                f6Var = null;
            } else {
                org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                this.m0 = y6Var;
                this.f44351c0.addView(y6Var, c8.ha.o(-1, -2));
                org.telegram.ui.Cells.n4 n4Var5 = new org.telegram.ui.Cells.n4(context);
                this.f44367j0 = n4Var5;
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, n4Var5, null);
                this.f44351c0.addView(this.f44367j0, c8.ha.o(-1, -2));
                int i22 = 3;
                this.f44345a0 = new EditTextBoldCursor[3];
                int i23 = 0;
                while (i23 < i22) {
                    EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
                    this.f44345a0[i23] = editTextBoldCursor5;
                    yi0 yi0Var2 = new yi0(context, editTextBoldCursor5, 2);
                    yi0Var2.setWillNotDraw(false);
                    this.f44351c0.addView(yi0Var2, c8.ha.o(-1, 64));
                    int i24 = org.telegram.ui.ActionBar.k6.f27848d6;
                    org.telegram.ui.ActionBar.r6.i(i24, yi0Var2, null);
                    if (i23 == 2) {
                        View view3 = new View(context);
                        this.T = view3;
                        org.telegram.ui.ActionBar.r6.i(i24, view3, null);
                        this.f44351c0.addView(this.T, c8.ha.o(-1, i19));
                    }
                    this.f44345a0[i23].setTag(Integer.valueOf(i23));
                    this.f44345a0[i23].setSupportRtlHint(true);
                    this.f44345a0[i23].setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.r6.B(this.f44345a0[i23], org.telegram.ui.ActionBar.k6.H6, null);
                    EditTextBoldCursor editTextBoldCursor6 = this.f44345a0[i23];
                    int i25 = org.telegram.ui.ActionBar.k6.G6;
                    org.telegram.ui.ActionBar.r6.V(editTextBoldCursor6, i25, null);
                    org.telegram.ui.ActionBar.r6.A(this.f44345a0[i23], org.telegram.ui.ActionBar.k6.L6, null);
                    this.f44345a0[i23].setTransformHintToHeader(true);
                    this.f44345a0[i23].setBackgroundDrawable(null);
                    org.telegram.ui.ActionBar.r6.w(this.f44345a0[i23], i25, null);
                    this.f44345a0[i23].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                    this.f44345a0[i23].setCursorWidth(1.5f);
                    org.telegram.ui.ActionBar.r6.G(this.f44345a0[i23], org.telegram.ui.ActionBar.k6.f27977k6, org.telegram.ui.ActionBar.k6.f27995l6, org.telegram.ui.ActionBar.k6.f28069p7, null);
                    this.f44345a0[i23].setInputType(16385);
                    this.f44345a0[i23].setImeOptions(268435461);
                    if (i23 != 0) {
                        if (i23 != 1) {
                            if (i23 == 2) {
                                str = "last_name_native";
                            } else {
                                i23++;
                                i22 = 3;
                                i19 = 6;
                            }
                        } else {
                            str = "middle_name_native";
                        }
                    } else {
                        str = "first_name_native";
                    }
                    N1(hashMap2, this.f44345a0[i23], str);
                    EditTextBoldCursor editTextBoldCursor7 = this.f44345a0[i23];
                    editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
                    if (i23 == 0 || i23 == 2 || i23 == 1) {
                        this.f44345a0[i23].addTextChangedListener(new aj0(this, editTextBoldCursor5, str, 2));
                    }
                    this.f44345a0[i23].setPadding(0, 0, 0, 0);
                    EditTextBoldCursor editTextBoldCursor8 = this.f44345a0[i23];
                    if (org.telegram.messenger.hd.f22871a0) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    editTextBoldCursor8.setGravity(i10 | 16);
                    yi0Var2.addView(this.f44345a0[i23], c8.ha.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.f44345a0[i23].setOnEditorActionListener(new oi0(this, 2));
                    i23++;
                    i22 = 3;
                    i19 = 6;
                }
                org.telegram.ui.Cells.z8 z8Var5 = new org.telegram.ui.Cells.z8(context);
                this.f44379q0 = z8Var5;
                this.f44351c0.addView(z8Var5, c8.ha.o(-1, -2));
                int i26 = (this.f44350c > 0L ? 1 : (this.f44350c == 0L ? 0 : -1));
                TLRPC.TL_secureValue tL_secureValue = this.I;
                if (((i26 != 0 || this.F == null) && this.H != null && !this.f44391v0) || tL_secureValue != null) {
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
                    org.telegram.ui.Cells.w9 w9Var3 = new org.telegram.ui.Cells.w9(context);
                    org.telegram.ui.ActionBar.r6.V(w9Var3.getTextView(), org.telegram.ui.ActionBar.k6.f28069p7, null);
                    org.telegram.ui.Cells.y N06 = org.telegram.ui.ActionBar.k6.N0(true);
                    org.telegram.ui.ActionBar.n6 N11 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27848d6);
                    org.telegram.ui.ActionBar.n6 N12 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27940i6);
                    w9Var3.setBackground(N06);
                    org.telegram.ui.ActionBar.r6.k(w9Var3, N06, N11, N12, null);
                    if (this.F == null) {
                        w9Var3.b(org.telegram.messenger.hd.M0(2131747586, null), false);
                    } else {
                        w9Var3.b(org.telegram.messenger.hd.M0(2131747591, null), false);
                    }
                    this.f44351c0.addView(w9Var3, c8.ha.o(-1, -2));
                    w9Var3.setOnClickListener(new qi0(this, 1));
                    org.telegram.ui.Cells.z8 z8Var6 = this.f44379q0;
                    int i27 = org.telegram.ui.ActionBar.k6.f27812b7;
                    org.telegram.ui.ActionBar.r6.a0(z8Var6, context, 2131231229, i27);
                    org.telegram.ui.Cells.y6 y6Var2 = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                    this.f44371l0 = y6Var2;
                    org.telegram.ui.ActionBar.r6.a0(y6Var2, context, 2131231230, i27);
                    this.f44351c0.addView(this.f44371l0, c8.ha.o(-1, -2));
                } else {
                    org.telegram.ui.ActionBar.r6.a0(this.f44379q0, context, 2131231230, org.telegram.ui.ActionBar.k6.f27812b7);
                }
                U1();
                c1(false);
                return;
            }
        }
    }

    public final void j1(android.content.Context r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bk0.j1(android.content.Context):void");
    }

    public final void k1(Context context) {
        String str;
        String str2;
        TelephonyManager telephonyManager;
        ViewGroup frameLayout;
        this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131747487, null));
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
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        Collections.sort(this.U0, new rv0(13));
        String str3 = org.telegram.messenger.p10.i(this.currentAccount).f().phone;
        org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
        org.telegram.ui.ActionBar.r6.V(w9Var.getTextView(), org.telegram.ui.ActionBar.k6.f28088q6, null);
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
        int i7 = org.telegram.ui.ActionBar.k6.f27848d6;
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27940i6);
        w9Var.setBackground(N0);
        org.telegram.ui.ActionBar.r6.k(w9Var, N0, N, N2, null);
        w9Var.b(org.telegram.messenger.hd.a0("PassportPhoneUseSame", null, 2131747483, pf.b.c().b("+" + str3)), false);
        this.f44351c0.addView(w9Var, c8.ha.o(-1, -2));
        w9Var.setOnClickListener(new qi0(this, 16));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
        this.f44374n0 = z8Var;
        org.telegram.ui.ActionBar.r6.a0(z8Var, context, 2131231230, org.telegram.ui.ActionBar.k6.f27812b7);
        this.f44374n0.setText(org.telegram.messenger.hd.M0(2131747481, null));
        this.f44351c0.addView(this.f44374n0, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        this.f44367j0 = n4Var;
        n4Var.setText(org.telegram.messenger.hd.M0(2131747484, null));
        org.telegram.ui.ActionBar.r6.i(i7, this.f44367j0, null);
        this.f44351c0.addView(this.f44367j0, c8.ha.o(-1, -2));
        this.Y = new EditTextBoldCursor[3];
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 2) {
                this.Y[i10] = new org.telegram.ui.Components.v20(context);
            } else {
                this.Y[i10] = new EditTextBoldCursor(context);
            }
            if (i10 == 1) {
                frameLayout = org.telegram.messenger.k5.f(context, 0);
                this.f44351c0.addView(frameLayout, c8.ha.o(-1, 50));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, frameLayout, null);
            } else if (i10 == 2) {
                frameLayout = (ViewGroup) this.Y[1].getParent();
            } else {
                frameLayout = new FrameLayout(context);
                this.f44351c0.addView(frameLayout, c8.ha.o(-1, 50));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, frameLayout, null);
            }
            this.Y[i10].setTag(Integer.valueOf(i10));
            this.Y[i10].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.E(this.Y[i10], org.telegram.ui.ActionBar.k6.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.Y[i10];
            int i11 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i11, null);
            this.Y[i10].setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.r6.w(this.Y[i10], i11, null);
            this.Y[i10].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.Y[i10].setCursorWidth(1.5f);
            if (i10 == 0) {
                this.Y[i10].setOnTouchListener(new ri0(this, 3));
                this.Y[i10].setText(org.telegram.messenger.hd.M0(2131752134, null));
                this.Y[i10].setInputType(0);
                this.Y[i10].setFocusable(false);
            } else {
                this.Y[i10].setInputType(3);
                if (i10 == 2) {
                    this.Y[i10].setImeOptions(268435462);
                } else {
                    this.Y[i10].setImeOptions(268435461);
                }
            }
            EditTextBoldCursor editTextBoldCursor2 = this.Y[i10];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            int i12 = 5;
            if (i10 == 1) {
                TextView textView = new TextView(context);
                this.f44394w0 = textView;
                textView.setText("+");
                org.telegram.ui.ActionBar.r6.V(this.f44394w0, i11, null);
                this.f44394w0.setTextSize(1, 16.0f);
                frameLayout.addView(this.f44394w0, c8.ha.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                this.Y[i10].setPadding(org.telegram.messenger.g0.L(10.0f), 0, 0, 0);
                this.Y[i10].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                this.Y[i10].setGravity(19);
                frameLayout.addView(this.Y[i10], c8.ha.k(0.0f, 12.0f, 16.0f, 6.0f, 55, -2));
                this.Y[i10].addTextChangedListener(new lj0(this, 1));
            } else if (i10 == 2) {
                this.Y[i10].setPadding(0, 0, 0, 0);
                this.Y[i10].setGravity(19);
                this.Y[i10].setHintText(null);
                this.Y[i10].setHint(org.telegram.messenger.hd.M0(2131747371, null));
                frameLayout.addView(this.Y[i10], c8.ha.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                this.Y[i10].addTextChangedListener(new xq(this, 3));
            } else {
                this.Y[i10].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
                EditTextBoldCursor editTextBoldCursor3 = this.Y[i10];
                if (!org.telegram.messenger.hd.f22871a0) {
                    i12 = 3;
                }
                editTextBoldCursor3.setGravity(i12);
                frameLayout.addView(this.Y[i10], c8.ha.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            }
            this.Y[i10].setOnEditorActionListener(new oi0(this, 0));
            if (i10 == 2) {
                this.Y[i10].setOnKeyListener(new zf(this, 1));
            }
            if (i10 == 0) {
                View view = new View(context);
                this.f44369k0.add(view);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d7, view, null);
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, 1, 83));
            }
        }
        try {
            telephonyManager = (TelephonyManager) org.telegram.messenger.t0.f25555b.getSystemService("phone");
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        if (telephonyManager != null) {
            str = telephonyManager.getSimCountryIso().toUpperCase();
            if (str != null && (str2 = (String) this.Y0.get(str)) != null && this.U0.indexOf(str2) != -1) {
                this.Y[1].setText((CharSequence) this.V0.get(str2));
            }
            org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
            this.f44374n0 = z8Var2;
            org.telegram.ui.ActionBar.r6.a0(z8Var2, context, 2131231230, org.telegram.ui.ActionBar.k6.f27812b7);
            this.f44374n0.setText(org.telegram.messenger.hd.M0(2131747485, null));
            this.f44351c0.addView(this.f44374n0, c8.ha.o(-1, -2));
        }
        str = null;
        if (str != null) {
            this.Y[1].setText((CharSequence) this.V0.get(str2));
        }
        org.telegram.ui.Cells.z8 z8Var22 = new org.telegram.ui.Cells.z8(context);
        this.f44374n0 = z8Var22;
        org.telegram.ui.ActionBar.r6.a0(z8Var22, context, 2131231230, org.telegram.ui.ActionBar.k6.f27812b7);
        this.f44374n0.setText(org.telegram.messenger.hd.M0(2131747485, null));
        this.f44351c0.addView(this.f44374n0, c8.ha.o(-1, -2));
    }

    public final byte[] m1(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32 || bArr2 == null || bArr2.length != 32) {
            return null;
        }
        byte[] bArr3 = new byte[32];
        System.arraycopy(this.f44357e1, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(this.f44357e1, 32, bArr4, 0, 16);
        byte[] bArr5 = new byte[32];
        System.arraycopy(this.f44352c1, 0, bArr5, 0, 32);
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

    public final void n1(final TLRPC.TL_secureRequiredType tL_secureRequiredType, final TLRPC.TL_secureRequiredType tL_secureRequiredType2, final ArrayList arrayList, final boolean z9, final pi0 pi0Var, final si0 si0Var, final boolean z10) {
        if (tL_secureRequiredType == null) {
            return;
        }
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        if (z10 && tL_secureRequiredType2 != null) {
            deletesecurevalue.types.add(tL_secureRequiredType2.type);
        } else {
            if (z9) {
                deletesecurevalue.types.add(tL_secureRequiredType.type);
            }
            if (tL_secureRequiredType2 != null) {
                deletesecurevalue.types.add(tL_secureRequiredType2.type);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(deletesecurevalue, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                final bk0 bk0Var = bk0.this;
                final qj0 qj0Var = si0Var;
                final boolean z11 = z10;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType3 = tL_secureRequiredType2;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                final boolean z12 = z9;
                final ArrayList arrayList2 = arrayList;
                final Runnable runnable = pi0Var;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        TLRPC.TL_secureData tL_secureData;
                        String str2;
                        LinearLayout linearLayout;
                        bk0 bk0Var2 = bk0.this;
                        TLRPC.TL_error tL_error2 = tL_error;
                        String str3 = null;
                        if (tL_error2 != null) {
                            qj0 qj0Var2 = qj0Var;
                            if (qj0Var2 != null) {
                                qj0Var2.a(tL_error2.text, null);
                            }
                            bk0Var2.Q1(org.telegram.messenger.hd.M0(2131689472, null), tL_error2.text);
                            return;
                        }
                        boolean z13 = z11;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType3;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType4;
                        boolean z14 = z12;
                        if (z13) {
                            if (tL_secureRequiredType5 != null) {
                                bk0Var2.L1(tL_secureRequiredType5);
                            } else {
                                bk0Var2.L1(tL_secureRequiredType6);
                            }
                        } else {
                            if (z14) {
                                bk0Var2.L1(tL_secureRequiredType6);
                            }
                            bk0Var2.L1(tL_secureRequiredType5);
                        }
                        int i7 = 0;
                        if (bk0Var2.f44347b == 8) {
                            ak0 ak0Var = (ak0) bk0Var2.f44380q1.remove(tL_secureRequiredType6);
                            if (ak0Var != null) {
                                bk0Var2.f44351c0.removeView(ak0Var);
                                View childAt = bk0Var2.f44351c0.getChildAt(linearLayout.getChildCount() - 6);
                                if (childAt instanceof ak0) {
                                    ((ak0) childAt).setNeedDivider(false);
                                }
                            }
                            bk0Var2.V1();
                        } else {
                            ArrayList arrayList3 = arrayList2;
                            if (tL_secureRequiredType5 != null && arrayList3 != null && arrayList3.size() > 1) {
                                int size = arrayList3.size();
                                int i10 = 0;
                                while (true) {
                                    if (i10 < size) {
                                        TLRPC.TL_secureRequiredType tL_secureRequiredType7 = (TLRPC.TL_secureRequiredType) arrayList3.get(i10);
                                        TLRPC.TL_secureValue v12 = bk0Var2.v1(tL_secureRequiredType7, false);
                                        if (v12 != null) {
                                            TLRPC.TL_secureData tL_secureData2 = v12.data;
                                            if (tL_secureData2 != null) {
                                                str2 = bk0.l1(tL_secureData2.data, bk0Var2.m1(tL_secureData2.secret, tL_secureData2.data_hash), v12.data.data_hash);
                                            } else {
                                                str2 = null;
                                            }
                                            str = str2;
                                            tL_secureRequiredType5 = tL_secureRequiredType7;
                                        } else {
                                            i10++;
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
                                    i7 = arrayList3.size();
                                }
                                bk0Var2.P1(tL_secureRequiredType6, null, null, tL_secureRequiredType5, str, z13, i7);
                            } else {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType8 = tL_secureRequiredType5;
                                String str4 = str;
                                TLRPC.TL_secureValue v13 = bk0Var2.v1(tL_secureRequiredType6, false);
                                if (v13 != null && (tL_secureData = v13.data) != null) {
                                    str3 = bk0.l1(tL_secureData.data, bk0Var2.m1(tL_secureData.secret, tL_secureData.data_hash), v13.data.data_hash);
                                }
                                if (arrayList3 != null) {
                                    i7 = arrayList3.size();
                                }
                                bk0Var2.P1(tL_secureRequiredType6, null, str3, tL_secureRequiredType8, str4, z13, i7);
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

    public final a8.r7 o1(byte[] bArr) {
        byte[] t12 = t1();
        int nextInt = Utilities.f21331b.nextInt(208) + 32;
        while ((bArr.length + nextInt) % 16 != 0) {
            nextInt++;
        }
        byte[] bArr2 = new byte[nextInt];
        Utilities.f21331b.nextBytes(bArr2);
        bArr2[0] = (byte) nextInt;
        int length = nextInt + bArr.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, nextInt);
        System.arraycopy(bArr, 0, bArr3, nextInt, bArr.length);
        byte[] o4 = Utilities.o(length, bArr3);
        byte[] r10 = Utilities.r(t12, o4);
        byte[] bArr4 = new byte[32];
        System.arraycopy(r10, 0, bArr4, 0, 32);
        byte[] bArr5 = new byte[16];
        System.arraycopy(r10, 32, bArr5, 0, 16);
        Utilities.b(bArr3, bArr4, bArr5, 0, length, 0, 1);
        byte[] bArr6 = new byte[32];
        System.arraycopy(this.f44357e1, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(this.f44357e1, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(this.f44352c1, 0, bArr8, 0, 32);
        Utilities.b(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        byte[] r11 = Utilities.r(bArr8, o4);
        byte[] bArr9 = new byte[32];
        System.arraycopy(r11, 0, bArr9, 0, 32);
        byte[] bArr10 = new byte[16];
        System.arraycopy(r11, 32, bArr10, 0, 16);
        byte[] bArr11 = new byte[32];
        System.arraycopy(t12, 0, bArr11, 0, 32);
        Utilities.b(bArr11, bArr9, bArr10, 0, 32, 0, 1);
        a8.r7 r7Var = new a8.r7(17);
        r7Var.d = bArr3;
        r7Var.f614b = bArr11;
        r7Var.f616e = o4;
        r7Var.f615c = t12;
        r7Var.f617f = new org.telegram.messenger.fw(bArr4, bArr5);
        return r7Var;
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        if (i10 == -1) {
            if (i7 != 0 && i7 != 2) {
                if (i7 == 1) {
                    if (intent != null && intent.getData() != null) {
                        ArrayList arrayList = new ArrayList();
                        ?? obj = new Object();
                        obj.f22484a = intent.getData();
                        arrayList.add(obj);
                        K1(arrayList);
                        return;
                    } else if (getParentActivity() != null) {
                        Toast.makeText(getParentActivity(), org.telegram.messenger.hd.M0(2131743834, null), 0).show();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            g1();
            org.telegram.ui.Components.di diVar = this.R0;
            if (diVar != null) {
                diVar.f32882a2.j0(i7, intent, this.Q0);
            }
            this.Q0 = null;
        }
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        int i7 = this.f44347b;
        if (i7 == 7) {
            if (z9) {
                int i10 = this.I1;
                org.telegram.ui.Components.wt0[] wt0VarArr = this.J1;
                wt0VarArr[i10].c(true);
                for (org.telegram.ui.Components.wt0 wt0Var : wt0VarArr) {
                    if (wt0Var != null) {
                        wt0Var.f();
                    }
                }
            }
        } else if (i7 != 0 && i7 != 5) {
            if (i7 == 1 || i7 == 2) {
                return !b1(z9);
            }
        } else if (z9) {
            a1(false);
        }
        return true;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        if (this.f44347b == 3 && dialog == this.L1) {
            ArrayList arrayList = this.M1;
            if (!arrayList.isEmpty()) {
                getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.U1);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.V1);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25034p0);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25047r0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.U1);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.V1);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25034p0);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25047r0);
        int i7 = 0;
        a1(false);
        org.telegram.ui.Components.di diVar = this.R0;
        if (diVar != null) {
            diVar.K();
            this.R0.j1();
        }
        if (this.f44347b == 7) {
            while (true) {
                org.telegram.ui.Components.wt0[] wt0VarArr = this.J1;
                if (i7 >= wt0VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.wt0 wt0Var = wt0VarArr[i7];
                if (wt0Var != null) {
                    wt0Var.f();
                }
                i7++;
            }
            org.telegram.ui.ActionBar.u1 u1Var = this.K1;
            if (u1Var != null) {
                try {
                    u1Var.dismiss();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                this.K1 = null;
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.di diVar = this.R0;
        if (diVar != null) {
            diVar.l1();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.di diVar;
        org.telegram.ui.Cells.w9 w9Var;
        int i10 = this.f44347b;
        if ((i10 == 1 || i10 == 2) && (diVar = this.R0) != null) {
            if (i7 == 17) {
                diVar.f32882a2.W(false);
            } else if (i7 == 21) {
                if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = org.telegram.messenger.hd.M0(2131689472, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.hd.M0(2131747311, null);
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747299, null), new si0(this, 0));
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                    alertDialog$Builder.p();
                }
            } else if (i7 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                J1(0);
            } else if (i7 == 22 && iArr != null && iArr.length > 0 && iArr[0] == 0 && (w9Var = this.f44382r0) != null) {
                w9Var.callOnClick();
            }
        } else if (i10 == 3 && i7 == 6) {
            S1(false, this.E1, this.F1, this.G1, this.H1);
        }
    }

    @Override
    public final void onResume() {
        ViewGroup[] viewGroupArr;
        ViewGroup viewGroup;
        super.onResume();
        org.telegram.ui.Components.di diVar = this.R0;
        if (diVar != null) {
            diVar.m1();
        }
        if (this.f44347b == 5 && (viewGroupArr = this.Z) != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
            this.Y[0].requestFocus();
            org.telegram.messenger.g0.K3(this.Y[0]);
            org.telegram.messenger.g0.i3(new pi0(this, 0), 200L);
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bk0.onThemeColorsChanged():void");
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (this.f44364h1 != null) {
            org.telegram.messenger.g0.h3(new pi0(this, 1));
        }
        int i7 = this.f44347b;
        if (i7 == 5) {
            if (z9) {
                if (this.Z[0].getVisibility() == 0) {
                    this.Y[0].requestFocus();
                    org.telegram.messenger.g0.K3(this.Y[0]);
                }
                if (this.N0 == 2) {
                    F1(false);
                }
            }
        } else if (i7 == 7) {
            if (z9) {
                this.J1[this.I1].j();
            }
        } else if (i7 == 4) {
            if (z9) {
                this.Y[0].requestFocus();
                org.telegram.messenger.g0.K3(this.Y[0]);
            }
        } else if (i7 == 6) {
            if (z9) {
                this.Y[0].requestFocus();
                org.telegram.messenger.g0.K3(this.Y[0]);
            }
        } else if (i7 != 2 && i7 != 1) {
        } else {
            g1();
        }
    }

    public final void p1(Bundle bundle, TLRPC.TL_auth_sentCode tL_auth_sentCode, boolean z9) {
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
            O1(bundle, 2, z9);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", tL_auth_sentCode.type.pattern);
            O1(bundle, 1, z9);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSms) {
            bundle.putInt("type", 2);
            bundle.putInt("length", tL_auth_sentCode.type.length);
            O1(bundle, 0, z9);
        }
    }

    public final String q1() {
        StringBuilder sb2 = new StringBuilder();
        int i7 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.Y;
            if (i7 >= editTextBoldCursorArr.length) {
                break;
            }
            sb2.append((CharSequence) editTextBoldCursorArr[i7].getText());
            sb2.append(",");
            i7++;
        }
        if (this.f44345a0 != null) {
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.f44345a0;
                if (i10 >= editTextBoldCursorArr2.length) {
                    break;
                }
                sb2.append((CharSequence) editTextBoldCursorArr2[i10].getText());
                sb2.append(",");
                i10++;
            }
        }
        ArrayList arrayList = this.f44366i1;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            sb2.append(((org.telegram.messenger.ew) arrayList.get(i11)).f22259b.f27089id);
        }
        org.telegram.messenger.ew ewVar = this.l1;
        if (ewVar != null) {
            sb2.append(ewVar.f22259b.f27089id);
        }
        org.telegram.messenger.ew ewVar2 = this.f44372m1;
        if (ewVar2 != null) {
            sb2.append(ewVar2.f22259b.f27089id);
        }
        org.telegram.messenger.ew ewVar3 = this.f44368j1;
        if (ewVar3 != null) {
            sb2.append(ewVar3.f22259b.f27089id);
        }
        ArrayList arrayList2 = this.f44370k1;
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            sb2.append(((org.telegram.messenger.ew) arrayList2.get(i12)).f22259b.f27089id);
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

    public final TLRPC.TL_secureValue v1(TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z9) {
        String[] strArr;
        if (tL_secureRequiredType != null) {
            int size = this.D.values.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.TL_secureValue tL_secureValue = this.D.values.get(i7);
                if (tL_secureRequiredType.type.getClass() == tL_secureValue.type.getClass()) {
                    if (z9) {
                        if (!tL_secureRequiredType.selfie_required || (tL_secureValue.selfie instanceof TLRPC.TL_secureFile)) {
                            if (!tL_secureRequiredType.translation_required || !tL_secureValue.translation.isEmpty()) {
                                if (!x1(tL_secureRequiredType.type) || !tL_secureValue.files.isEmpty()) {
                                    if (!z1(tL_secureRequiredType.type) || (tL_secureValue.front_side instanceof TLRPC.TL_secureFile)) {
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
                                                    JSONObject jSONObject = new JSONObject(l1(tL_secureData.data, m1(tL_secureData.secret, tL_secureData.data_hash), tL_secureValue.data.data_hash));
                                                    for (int i10 = 0; i10 < strArr.length; i10++) {
                                                        if (!jSONObject.has(strArr[i10]) || TextUtils.isEmpty(jSONObject.getString(strArr[i10]))) {
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
        for (int i7 = 0; i7 < size; i7++) {
            if (this.D.values.get(i7).type.getClass() == cls) {
                return false;
            }
        }
        return true;
    }

    public final boolean y1() {
        String str = this.f44344a;
        if (str != null && !str.equals(q1())) {
            return false;
        }
        return true;
    }

    public bk0(int i7, long j3, String str, String str2, String str3, String str4, String str5, TL_account.authorizationForm authorizationform, TL_account.Password password) {
        this(i7, authorizationform, password, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (HashMap) null, (HashMap) null);
        int i10;
        String s12;
        String str6;
        String str7;
        String str8;
        String str9;
        this.f44350c = j3;
        this.d = str3;
        this.f44355e = str4;
        this.h = str;
        this.f44381r = str2;
        this.f44373n = str5;
        if (i7 != 0 || authorizationform.errors.isEmpty()) {
            return;
        }
        try {
            Collections.sort(authorizationform.errors, new ij0(this));
            int size = authorizationform.errors.size();
            int i11 = 0;
            while (i11 < size) {
                TLRPC.SecureValueError secureValueError = authorizationform.errors.get(i11);
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
                                int i12 = 0;
                                while (i12 < authorizationform.values.size()) {
                                    TLRPC.TL_secureData tL_secureData = authorizationform.values.get(i12).data;
                                    if (tL_secureData == null || !Arrays.equals(tL_secureData.data_hash, tL_secureValueErrorData.data_hash)) {
                                        i12++;
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
                            i10 = size;
                            i11++;
                            size = i10;
                        }
                        str8 = "files";
                    }
                    str8 = "translation";
                }
                HashMap hashMap = (HashMap) this.f44390u1.get(s12);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    i10 = size;
                    this.f44390u1.put(s12, hashMap);
                    this.f44392v1.put(s12, str6);
                } else {
                    i10 = size;
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
                i11++;
                size = i10;
            }
        } catch (Exception unused) {
        }
    }
}
