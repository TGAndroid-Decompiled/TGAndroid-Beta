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
public final class ll0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public LinearLayout A0;
    public String A1;
    public ImageView B0;
    public bl0 B1;
    public TextView C0;
    public boolean C1;
    public TL_account.authorizationForm D;
    public TextView D0;
    public final lk0 D1;
    public final TLRPC.TL_secureRequiredType E;
    public TextView E0;
    public String E1;
    public TLRPC.TL_secureRequiredType F;
    public org.telegram.ui.Components.xy F0;
    public Runnable F1;
    public ArrayList G;
    public org.telegram.ui.Cells.b9 G0;
    public zk0 G1;
    public final TLRPC.TL_secureValue H;
    public org.telegram.ui.Cells.b9 H0;
    public bl0 H1;
    public final TLRPC.TL_secureValue I;
    public ImageView I0;
    public int I1;
    public TL_account.Password J;
    public TextView J0;
    public final org.telegram.ui.Components.zu0[] J1;
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
    public String f39257a;
    public EditTextBoldCursor[] f39258a0;
    public boolean f39259a1;
    public final int f39260b;
    public ScrollView f39261b0;
    public long f39262b1;
    public long f39263c;
    public LinearLayout f39264c0;
    public byte[] f39265c1;
    public final String d;
    public LinearLayout f39266d0;
    public String f39267d1;
    public final String e;
    public LinearLayout f39268e0;
    public byte[] f39269e1;
    public boolean f39270f;
    public LinearLayout f39271f0;
    public boolean f39272f1;
    public LinearLayout f39273g0;
    public boolean f39274g1;
    public final String h;
    public LinearLayout f39275h0;
    public ll0 f39276h1;
    public LinearLayout f39277i0;
    public final ArrayList f39278i1;
    public org.telegram.ui.Cells.p4 f39279j0;
    public org.telegram.messenger.pw f39280j1;
    public final ArrayList f39281k0;
    public final ArrayList f39282k1;
    public org.telegram.ui.Cells.c7 f39283l0;
    public org.telegram.messenger.pw l1;
    public org.telegram.ui.Cells.c7 m0;
    public org.telegram.messenger.pw f39284m1;
    public final String f39285n;
    public org.telegram.ui.Cells.b9 f39286n0;
    public final HashMap f39287n1;
    public org.telegram.ui.Cells.b9 f39288o0;
    public final HashMap f39289o1;
    public org.telegram.ui.Cells.b9 f39290p0;
    public final HashMap f39291p1;
    public org.telegram.ui.Cells.b9 f39292q0;
    public final HashMap f39293q1;
    public final String f39294r;
    public org.telegram.ui.Cells.x9 f39295r0;
    public final HashMap f39296r1;
    public String f39297s;
    public int f39298s0;
    public final HashMap f39299s1;
    public final boolean[] f39300t0;
    public final HashMap f39301t1;
    public boolean f39302u0;
    public final HashMap f39303u1;
    public boolean f39304v0;
    public final HashMap f39305v1;
    public String f39306w;
    public TextView f39307w0;
    public HashMap f39308w1;
    public String f39309x;
    public org.telegram.ui.Cells.x9 f39310x0;
    public HashMap f39311x1;
    public final int[] f39312y;
    public org.telegram.ui.Cells.x9 f39313y0;
    public final HashMap f39314y1;
    public org.telegram.ui.Cells.c7 f39315z0;
    public String f39316z1;

    public ll0(int i10, TL_account.authorizationForm authorizationform, TL_account.Password password, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureValue tL_secureValue, TLRPC.TL_secureRequiredType tL_secureRequiredType2, TLRPC.TL_secureValue tL_secureValue2, HashMap hashMap, HashMap hashMap2) {
        super(null);
        this.f39297s = "";
        this.f39306w = "";
        this.f39312y = new int[3];
        this.f39281k0 = new ArrayList();
        this.f39300t0 = new boolean[3];
        this.f39302u0 = true;
        this.U0 = new ArrayList();
        this.V0 = new HashMap();
        this.W0 = new HashMap();
        this.X0 = new HashMap();
        this.f39278i1 = new ArrayList();
        this.f39282k1 = new ArrayList();
        this.f39287n1 = new HashMap();
        this.f39289o1 = new HashMap();
        this.f39291p1 = new HashMap();
        this.f39293q1 = new HashMap();
        this.f39296r1 = new HashMap();
        this.f39303u1 = new HashMap();
        this.f39305v1 = new HashMap();
        this.f39314y1 = new HashMap();
        this.D1 = new lk0(this);
        this.f39260b = i10;
        this.D = authorizationform;
        this.E = tL_secureRequiredType;
        if (tL_secureRequiredType != null) {
            this.f39302u0 = tL_secureRequiredType.native_names;
        }
        this.H = tL_secureValue;
        this.F = tL_secureRequiredType2;
        this.I = tL_secureValue2;
        this.J = password;
        this.f39299s1 = hashMap;
        this.f39301t1 = hashMap2;
        if (i10 == 3) {
            this.M1 = new ArrayList();
        } else if (i10 == 7) {
            this.J1 = new org.telegram.ui.Components.zu0[3];
        }
        if (hashMap == null) {
            this.f39299s1 = new HashMap();
        }
        if (hashMap2 == null) {
            this.f39301t1 = new HashMap();
        }
        if (i10 == 5) {
            if (org.telegram.messenger.d20.i(this.currentAccount).f15162j0 != null && org.telegram.messenger.d20.i(this.currentAccount).f15163k0 != null) {
                this.N0 = 1;
                this.O0 = org.telegram.messenger.d20.i(this.currentAccount).f15162j0;
                this.P0 = org.telegram.messenger.d20.i(this.currentAccount).f15163k0;
            }
            TL_account.Password password2 = this.J;
            if (password2 == null) {
                z1();
            } else {
                TwoStepVerificationActivity.q0(password2);
                if (this.N0 == 1) {
                    E1(true);
                }
            }
            if (org.telegram.messenger.tz.f18156j0 != null) {
                return;
            }
            TLRPC.TL_help_getPassportConfig tL_help_getPassportConfig = new TLRPC.TL_help_getPassportConfig();
            tL_help_getPassportConfig.hash = org.telegram.messenger.tz.f18159k0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_help_getPassportConfig, new ag.c3(19));
        }
    }

    public static int F0(ll0 ll0Var, String str) {
        ll0Var.getClass();
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

    public static boolean G0(org.telegram.ui.ll0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ll0.G0(org.telegram.ui.ll0):boolean");
    }

    public static int L0(ll0 ll0Var) {
        return ll0Var.currentAccount;
    }

    public static void M0(ll0 ll0Var, EditTextBoldCursor editTextBoldCursor, String str, Editable editable, boolean z10) {
        String str2;
        String str3;
        String str4;
        String str5;
        HashMap hashMap = ll0Var.f39314y1;
        if (hashMap != null && (str3 = (String) hashMap.get(str)) != null) {
            if (TextUtils.equals(str3, editable)) {
                HashMap hashMap2 = ll0Var.f39308w1;
                if (hashMap2 != null && (str5 = (String) hashMap2.get(str)) != null) {
                    editTextBoldCursor.setErrorText(str5);
                } else {
                    HashMap hashMap3 = ll0Var.f39311x1;
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
            ll0Var.d1(false);
        }
    }

    public static void S1(EditTextBoldCursor[] editTextBoldCursorArr, boolean z10, boolean z11) {
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
                            org.telegram.ui.ActionBar.a7.G(editTextBoldCursor, org.telegram.ui.ActionBar.t6.f21058k6, org.telegram.ui.ActionBar.t6.f21076l6, org.telegram.ui.ActionBar.t6.f21153p7, null);
                            if (editTextBoldCursor.getPaddingLeft() != paddingLeft || editTextBoldCursor.getPaddingTop() != paddingTop || editTextBoldCursor.getPaddingRight() != paddingRight || editTextBoldCursor.getPaddingBottom() != paddingBottom) {
                                editTextBoldCursor.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void Y(ll0 ll0Var, TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery) {
        TL_account.Password password = ll0Var.J;
        password.email_unconfirmed_pattern = tL_auth_passwordRecovery.email_pattern;
        ll0Var.presentFragment(new tc1(ll0Var.currentAccount, 4, password));
    }

    public static void Z(ll0 ll0Var) {
        ArrayList arrayList;
        int i10;
        int i11;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        HashMap hashMap = ll0Var.f39296r1;
        HashMap hashMap2 = ll0Var.f39293q1;
        String str = ll0Var.f39294r;
        ArrayList arrayList2 = new ArrayList();
        int size = ll0Var.D.required_types.size();
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.SecureRequiredType secureRequiredType = ll0Var.D.required_types.get(i12);
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
                                        if (ll0Var.u1(tL_secureRequiredType5, true) != null) {
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
            TLRPC.TL_secureValue u12 = ll0Var.u1(tL_secureRequiredType, true);
            if (u12 == null) {
                Vibrator vibrator = (Vibrator) ll0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                kl0 kl0Var = (kl0) hashMap2.get(tL_secureRequiredType);
                if (kl0Var == null && (tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    kl0Var = (kl0) hashMap2.get(tL_secureRequiredType2);
                }
                org.telegram.messenger.i0.E3(kl0Var);
                return;
            }
            HashMap hashMap3 = (HashMap) ll0Var.f39303u1.get(r1(tL_secureRequiredType.type));
            if (hashMap3 != null && !hashMap3.isEmpty()) {
                Vibrator vibrator2 = (Vibrator) ll0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                kl0 kl0Var2 = (kl0) hashMap2.get(tL_secureRequiredType);
                if (kl0Var2 == null && (tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    kl0Var2 = (kl0) hashMap2.get(tL_secureRequiredType3);
                }
                org.telegram.messenger.i0.E3(kl0Var2);
                return;
            }
            boolean z10 = tL_secureRequiredType.selfie_required;
            boolean z11 = tL_secureRequiredType.translation_required;
            ?? obj = new Object();
            obj.f39720a = u12;
            obj.f39721b = z10;
            obj.f39722c = z11;
            arrayList2.add(obj);
        }
        ll0Var.Q1(false, true);
        TL_account.acceptAuthorization acceptauthorization = new TL_account.acceptAuthorization();
        acceptauthorization.bot_id = ll0Var.f39263c;
        acceptauthorization.scope = ll0Var.h;
        acceptauthorization.public_key = str;
        JSONObject jSONObject = new JSONObject();
        int size3 = arrayList2.size();
        int i14 = 0;
        while (i14 < size3) {
            mk0 mk0Var = (mk0) arrayList2.get(i14);
            TLRPC.TL_secureValue tL_secureValue = mk0Var.f39720a;
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
                        byte[] l1 = ll0Var.l1(tL_secureData.secret, tL_secureData.data_hash);
                        arrayList = arrayList2;
                        try {
                            jSONObject2.put("data_hash", Base64.encodeToString(tL_secureValue.data.data_hash, 2));
                            jSONObject2.put("secret", Base64.encodeToString(l1, 2));
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
                                    byte[] l12 = ll0Var.l1(tL_secureFile.secret, tL_secureFile.file_hash);
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("file_hash", Base64.encodeToString(tL_secureFile.file_hash, 2));
                                    jSONObject4.put("secret", Base64.encodeToString(l12, 2));
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
                        byte[] l13 = ll0Var.l1(tL_secureFile2.secret, tL_secureFile2.file_hash);
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("file_hash", Base64.encodeToString(tL_secureFile2.file_hash, 2));
                        jSONObject5.put("secret", Base64.encodeToString(l13, 2));
                        jSONObject3.put("front_side", jSONObject5);
                    }
                    TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile2;
                        byte[] l14 = ll0Var.l1(tL_secureFile3.secret, tL_secureFile3.file_hash);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("file_hash", Base64.encodeToString(tL_secureFile3.file_hash, 2));
                        jSONObject6.put("secret", Base64.encodeToString(l14, 2));
                        jSONObject3.put("reverse_side", jSONObject6);
                    }
                    if (mk0Var.f39721b) {
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile3;
                            byte[] l15 = ll0Var.l1(tL_secureFile4.secret, tL_secureFile4.file_hash);
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("file_hash", Base64.encodeToString(tL_secureFile4.file_hash, 2));
                            jSONObject7.put("secret", Base64.encodeToString(l15, 2));
                            jSONObject3.put("selfie", jSONObject7);
                        }
                    }
                    if (mk0Var.f39722c && !tL_secureValue.translation.isEmpty()) {
                        JSONArray jSONArray2 = new JSONArray();
                        int size5 = tL_secureValue.translation.size();
                        for (int i16 = 0; i16 < size5; i16++) {
                            TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) tL_secureValue.translation.get(i16);
                            byte[] l16 = ll0Var.l1(tL_secureFile5.secret, tL_secureFile5.file_hash);
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("file_hash", Base64.encodeToString(tL_secureFile5.file_hash, 2));
                            jSONObject8.put("secret", Base64.encodeToString(l16, 2));
                            jSONArray2.put(jSONObject8);
                        }
                        jSONObject3.put("translation", jSONArray2);
                    }
                    jSONObject.put(r1(tL_secureValue.type), jSONObject3);
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
        Object obj2 = ll0Var.d;
        if (obj2 != null) {
            try {
                jSONObject9.put("payload", obj2);
            } catch (Exception unused6) {
            }
        }
        Object obj3 = ll0Var.e;
        if (obj3 != null) {
            try {
                jSONObject9.put("nonce", obj3);
            } catch (Exception unused7) {
            }
        }
        bh.d n12 = ll0Var.n1(org.telegram.messenger.i0.h1(jSONObject9.toString()));
        TLRPC.TL_secureCredentialsEncrypted tL_secureCredentialsEncrypted = new TLRPC.TL_secureCredentialsEncrypted();
        acceptauthorization.credentials = tL_secureCredentialsEncrypted;
        tL_secureCredentialsEncrypted.hash = (byte[]) n12.d;
        tL_secureCredentialsEncrypted.data = (byte[]) n12.f2779c;
        try {
            String replace = str.replaceAll("\\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "");
            Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA1AndMGF1Padding");
            cipher.init(1, (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(replace, 0))));
            acceptauthorization.credentials.secret = cipher.doFinal((byte[]) n12.f2778b);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        ConnectionsManager.getInstance(ll0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(ll0Var.currentAccount).sendRequest(acceptauthorization, new ck0(ll0Var, 1)), ll0Var.classGuid);
    }

    public static void a0(ll0 ll0Var, TLRPC.TL_error tL_error, String str, bl0 bl0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        if (tL_error == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("phone", str);
            ll0 ll0Var2 = new ll0(7, ll0Var.D, ll0Var.J, ll0Var.E, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
            ll0Var2.currentAccount = ll0Var.currentAccount;
            ll0Var2.f39269e1 = ll0Var.f39269e1;
            ll0Var2.f39265c1 = ll0Var.f39265c1;
            ll0Var2.B1 = bl0Var;
            ll0Var2.K = (TLRPC.TL_auth_sentCode) tLObject;
            ll0Var.presentFragment(ll0Var2, true);
            return;
        }
        org.telegram.ui.Components.s4.e0(ll0Var.currentAccount, tL_error, ll0Var, sendverifyphonecode, str);
    }

    public static void b0(ll0 ll0Var, org.telegram.messenger.pw pwVar, int i10) {
        String str = pwVar.f17490c;
        HashMap hashMap = ll0Var.f39287n1;
        int i11 = ll0Var.S0;
        if (i11 == 1) {
            org.telegram.messenger.pw pwVar2 = ll0Var.f39280j1;
            if (pwVar2 != null) {
                jl0 jl0Var = (jl0) hashMap.remove(pwVar2);
                if (jl0Var != null) {
                    ll0Var.f39273g0.removeView(jl0Var);
                }
                ll0Var.f39280j1 = null;
            }
        } else if (i11 == 4) {
            if (ll0Var.f39282k1.size() >= 20) {
                return;
            }
        } else if (i11 == 2) {
            org.telegram.messenger.pw pwVar3 = ll0Var.l1;
            if (pwVar3 != null) {
                jl0 jl0Var2 = (jl0) hashMap.remove(pwVar3);
                if (jl0Var2 != null) {
                    ll0Var.f39268e0.removeView(jl0Var2);
                }
                ll0Var.l1 = null;
            }
        } else if (i11 == 3) {
            org.telegram.messenger.pw pwVar4 = ll0Var.f39284m1;
            if (pwVar4 != null) {
                jl0 jl0Var3 = (jl0) hashMap.remove(pwVar4);
                if (jl0Var3 != null) {
                    ll0Var.f39271f0.removeView(jl0Var3);
                }
                ll0Var.f39284m1 = null;
            }
        } else if (i11 == 0 && ll0Var.f39278i1.size() >= 20) {
            return;
        }
        ll0Var.f39289o1.put(str, pwVar);
        ll0Var.L.setEnabled(false);
        ll0Var.L.setAlpha(0.5f);
        org.telegram.messenger.b8.G(ll0Var.currentAccount).i0(false, 16777216, str, true);
        ll0Var.U0(pwVar, i10);
        ll0Var.W1(i10);
    }

    public static void c0(org.telegram.ui.ll0 r9, boolean r10, java.lang.String r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ll0.c0(org.telegram.ui.ll0, boolean, java.lang.String):void");
    }

    public static boolean c1(byte[] bArr, Long l4) {
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

    public static void d0(int i10, String str, org.telegram.messenger.pw pwVar, jl0 jl0Var, ll0 ll0Var) {
        String str2 = pwVar.f17490c;
        HashMap hashMap = ll0Var.f39289o1;
        ll0Var.f39287n1.remove(pwVar);
        if (i10 == 1) {
            ll0Var.f39280j1 = null;
            ll0Var.f39273g0.removeView(jl0Var);
        } else if (i10 == 4) {
            ll0Var.f39282k1.remove(pwVar);
            ll0Var.f39275h0.removeView(jl0Var);
        } else if (i10 == 2) {
            ll0Var.l1 = null;
            ll0Var.f39268e0.removeView(jl0Var);
        } else if (i10 == 3) {
            ll0Var.f39284m1 = null;
            ll0Var.f39271f0.removeView(jl0Var);
        } else {
            ll0Var.f39278i1.remove(pwVar);
            ll0Var.f39266d0.removeView(jl0Var);
        }
        if (str != null) {
            HashMap hashMap2 = ll0Var.f39311x1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
            HashMap hashMap3 = ll0Var.f39314y1;
            if (hashMap3 != null) {
                hashMap3.remove(str);
            }
        }
        ll0Var.W1(i10);
        if (str2 != null && hashMap.remove(str2) != null) {
            if (hashMap.isEmpty()) {
                ll0Var.L.setEnabled(true);
                ll0Var.L.setAlpha(1.0f);
            }
            org.telegram.messenger.b8.G(ll0Var.currentAccount).b(str2, false);
        }
    }

    public static void e0(ll0 ll0Var) {
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        for (int i10 = 0; i10 < ll0Var.D.values.size(); i10++) {
            deletesecurevalue.types.add(ll0Var.D.values.get(i10).type);
        }
        ll0Var.B1();
        ConnectionsManager.getInstance(ll0Var.currentAccount).sendRequest(deletesecurevalue, new ck0(ll0Var, 2));
    }

    public static void f0(ll0 ll0Var) {
        tc1 tc1Var = new tc1(ll0Var.currentAccount, 0, ll0Var.J);
        tc1Var.Y = true;
        ll0Var.presentFragment(tc1Var);
    }

    public static void g0(ll0 ll0Var) {
        if (ll0Var.J.has_recovery) {
            ll0Var.B1();
            ConnectionsManager.getInstance(ll0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(ll0Var.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new ck0(ll0Var, 0), 10), ll0Var.classGuid);
        } else if (ll0Var.getParentActivity() == null) {
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ll0Var.getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131746087, null), new ak0(ll0Var, 4));
            String L0 = org.telegram.messenger.cd.L0(2131746088, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.L0(2131746090, null);
            ll0Var.showDialog(x1Var);
        }
    }

    public static void h0(ll0 ll0Var) {
        Activity parentActivity = ll0Var.getParentActivity();
        gf.f.r(parentActivity, "https://telegram.org/deactivate?phone=" + org.telegram.messenger.d20.i(ll0Var.currentAccount).d());
    }

    public static int i0(ll0 ll0Var) {
        return ll0Var.currentAccount;
    }

    public static String k1(byte[] bArr, byte[] bArr2, byte[] bArr3) {
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

    public static int l0(ll0 ll0Var) {
        return ll0Var.currentAccount;
    }

    public static int m0(ll0 ll0Var) {
        return ll0Var.currentAccount;
    }

    public static String q1(org.telegram.messenger.pw pwVar) {
        byte[] bArr;
        if (pwVar != null) {
            TLRPC.TL_secureFile tL_secureFile = pwVar.f17489b;
            if (tL_secureFile != null && (bArr = tL_secureFile.file_hash) != null) {
                return Base64.encodeToString(bArr, 2);
            }
            byte[] bArr2 = pwVar.f17491f;
            if (bArr2 != null) {
                return Base64.encodeToString(bArr2, 2);
            }
            return "";
        }
        return "";
    }

    public static String r1(TLRPC.SecureValueType secureValueType) {
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

    public static byte[] s1() {
        byte[] bArr = new byte[32];
        Utilities.f14519b.nextBytes(bArr);
        int i10 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
            i10 += 255 & bArr[i11];
        }
        int i12 = i10 % 255;
        if (i12 != 239) {
            int nextInt = Utilities.f14519b.nextInt(32);
            int i13 = (bArr[nextInt] & 255) + (239 - i12);
            if (i13 < 255) {
                i13 += 255;
            }
            bArr[nextInt] = (byte) (i13 % 255);
        }
        return bArr;
    }

    public static String t1(TLRPC.SecureValueType secureValueType) {
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
            return org.telegram.messenger.cd.L0(2131754676, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
            return org.telegram.messenger.cd.L0(2131754681, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
            return org.telegram.messenger.cd.L0(2131754678, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
            return org.telegram.messenger.cd.L0(2131754671, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
            return org.telegram.messenger.cd.L0(2131754682, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
            return org.telegram.messenger.cd.L0(2131754673, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
            return org.telegram.messenger.cd.L0(2131754677, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
            return org.telegram.messenger.cd.L0(2131754675, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
            return org.telegram.messenger.cd.L0(2131754672, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
            return org.telegram.messenger.cd.L0(2131754674, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
            return org.telegram.messenger.cd.L0(2131754680, null);
        }
        return "";
    }

    public static int u0(ll0 ll0Var) {
        return ll0Var.currentAccount;
    }

    public static boolean w1(TLRPC.SecureValueType secureValueType) {
        if (!(secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) && !(secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) && !(secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) && !(secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) && !(secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement)) {
            return false;
        }
        return true;
    }

    public static int y0(ll0 ll0Var) {
        return ll0Var.currentAccount;
    }

    public static boolean y1(TLRPC.SecureValueType secureValueType) {
        if (!(secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) && !(secureValueType instanceof TLRPC.TL_secureValueTypePassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
            return false;
        }
        return true;
    }

    public final void A1() {
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

    public final void B1() {
        if (getParentActivity() != null && !getParentActivity().isFinishing() && this.K1 == null) {
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), null);
            this.K1 = x1Var;
            x1Var.f21488i0 = false;
            x1Var.show();
        }
    }

    public final void C1(View view) {
        if (view == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        org.telegram.messenger.i0.E3(view);
        L1(view);
    }

    public final void D1(boolean z10) {
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

    public final void E1(boolean z10) {
        String obj;
        if (z10) {
            obj = null;
        } else {
            obj = this.Y[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                D1(false);
                return;
            }
            Q1(true, true);
        }
        Utilities.e.c(new bk0(this, z10, obj, 0));
    }

    public final void F1() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (v1(TLRPC.TL_secureValueTypePhone.class)) {
            arrayList.add(org.telegram.messenger.cd.L0(2131754674, null));
            arrayList2.add(TLRPC.TL_secureValueTypePhone.class);
        }
        if (v1(TLRPC.TL_secureValueTypeEmail.class)) {
            arrayList.add(org.telegram.messenger.cd.L0(2131754680, null));
            arrayList2.add(TLRPC.TL_secureValueTypeEmail.class);
        }
        if (v1(TLRPC.TL_secureValueTypePersonalDetails.class)) {
            arrayList.add(org.telegram.messenger.cd.L0(2131754679, null));
            arrayList2.add(TLRPC.TL_secureValueTypePersonalDetails.class);
        }
        if (v1(TLRPC.TL_secureValueTypePassport.class)) {
            arrayList.add(org.telegram.messenger.cd.L0(2131754676, null));
            arrayList2.add(TLRPC.TL_secureValueTypePassport.class);
        }
        if (v1(TLRPC.TL_secureValueTypeInternalPassport.class)) {
            arrayList.add(org.telegram.messenger.cd.L0(2131754677, null));
            arrayList2.add(TLRPC.TL_secureValueTypeInternalPassport.class);
        }
        if (v1(TLRPC.TL_secureValueTypePassportRegistration.class)) {
            arrayList.add(org.telegram.messenger.cd.L0(2131754675, null));
            arrayList2.add(TLRPC.TL_secureValueTypePassportRegistration.class);
        }
        if (v1(TLRPC.TL_secureValueTypeTemporaryRegistration.class)) {
            arrayList.add(org.telegram.messenger.cd.L0(2131754672, null));
            arrayList2.add(TLRPC.TL_secureValueTypeTemporaryRegistration.class);
        }
        if (v1(TLRPC.TL_secureValueTypeIdentityCard.class)) {
            arrayList.add(org.telegram.messenger.cd.L0(2131754678, null));
            arrayList2.add(TLRPC.TL_secureValueTypeIdentityCard.class);
        }
        if (v1(TLRPC.TL_secureValueTypeDriverLicense.class)) {
            arrayList.add(org.telegram.messenger.cd.L0(2131754681, null));
            arrayList2.add(TLRPC.TL_secureValueTypeDriverLicense.class);
        }
        if (v1(TLRPC.TL_secureValueTypeAddress.class)) {
            arrayList.add(org.telegram.messenger.cd.L0(2131754683, null));
            arrayList2.add(TLRPC.TL_secureValueTypeAddress.class);
        }
        if (v1(TLRPC.TL_secureValueTypeUtilityBill.class)) {
            arrayList.add(org.telegram.messenger.cd.L0(2131754671, null));
            arrayList2.add(TLRPC.TL_secureValueTypeUtilityBill.class);
        }
        if (v1(TLRPC.TL_secureValueTypeBankStatement.class)) {
            arrayList.add(org.telegram.messenger.cd.L0(2131754682, null));
            arrayList2.add(TLRPC.TL_secureValueTypeBankStatement.class);
        }
        if (v1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            arrayList.add(org.telegram.messenger.cd.L0(2131754673, null));
            arrayList2.add(TLRPC.TL_secureValueTypeRentalAgreement.class);
        }
        if (getParentActivity() != null && !arrayList.isEmpty()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String L0 = org.telegram.messenger.cd.L0(2131747512, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            alertDialog$Builder.f((CharSequence[]) arrayList.toArray(new CharSequence[0]), new eg.j(10, this, arrayList2));
            showDialog(x1Var);
        }
    }

    public final void G1() {
        boolean z10;
        int size;
        if (getParentActivity() == null) {
            return;
        }
        int i10 = this.S0;
        ArrayList arrayList = this.f39278i1;
        int i11 = 1;
        if (i10 == 0 && arrayList.size() >= 20) {
            P1(org.telegram.messenger.cd.L0(2131689472, null), org.telegram.messenger.cd.a0("PassportUploadMaxReached", null, 2131747467, org.telegram.messenger.cd.G(20, "Files", new Object[0])));
            return;
        }
        f1();
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
                size = this.f39282k1.size();
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

    public final void H1(TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, boolean z10) {
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
            HashMap hashMap4 = this.f39303u1;
            if (!z10) {
                hashMap = (HashMap) hashMap4.get(r1(secureValueType2));
            } else {
                hashMap = null;
            }
            HashMap hashMap5 = (HashMap) hashMap4.get(r1(secureValueType));
            TLRPC.TL_secureValue u12 = u1(tL_secureRequiredType, false);
            TLRPC.TL_secureValue u13 = u1(tL_secureRequiredType2, false);
            HashMap hashMap6 = hashMap;
            TL_account.authorizationForm authorizationform = this.D;
            int i12 = i11;
            TL_account.Password password = this.J;
            HashMap hashMap7 = this.f39291p1;
            HashMap hashMap8 = (HashMap) hashMap7.get(tL_secureRequiredType);
            if (tL_secureRequiredType2 != null) {
                hashMap2 = hashMap5;
                hashMap3 = (HashMap) hashMap7.get(tL_secureRequiredType2);
            } else {
                hashMap2 = hashMap5;
                hashMap3 = null;
            }
            ll0 ll0Var = new ll0(i12, authorizationform, password, tL_secureRequiredType, u12, tL_secureRequiredType2, u13, hashMap8, hashMap3);
            ll0Var.B1 = new pk0(this, secureValueType2, z10, i10);
            ll0Var.currentAccount = this.currentAccount;
            ll0Var.f39269e1 = this.f39269e1;
            ll0Var.f39265c1 = this.f39265c1;
            ll0Var.f39263c = this.f39263c;
            ll0Var.f39308w1 = hashMap6;
            ll0Var.f39304v0 = z10;
            ll0Var.f39311x1 = hashMap2;
            ll0Var.G = arrayList;
            if (i12 == 4) {
                ll0Var.f39267d1 = this.f39267d1;
            }
            presentFragment(ll0Var);
        }
    }

    public final void I1(int i10) {
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

    public final void J1(ArrayList arrayList) {
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

    public final TLRPC.TL_secureValue K1(TLRPC.TL_secureRequiredType tL_secureRequiredType) {
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

    public final void L1(View view) {
        while (view != null && this.f39264c0.indexOfChild(view) < 0) {
            view = (View) view.getParent();
        }
        if (view != null) {
            this.f39261b0.smoothScrollTo(0, view.getTop() - ((this.f39261b0.getMeasuredHeight() - view.getMeasuredHeight()) / 2));
        }
    }

    public final void M1(HashMap hashMap, EditTextBoldCursor editTextBoldCursor, String str) {
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
                    this.f39306w = str2;
                    CharSequence charSequence3 = (String) this.Y0.get(str2);
                    if (charSequence3 != null) {
                        editTextBoldCursor.setText(charSequence3);
                        break;
                    }
                    break;
                case 1:
                    if ("male".equals(str2)) {
                        this.f39309x = str2;
                        editTextBoldCursor.setText(org.telegram.messenger.cd.L0(2131747524, null));
                        break;
                    } else if ("female".equals(str2)) {
                        this.f39309x = str2;
                        editTextBoldCursor.setText(org.telegram.messenger.cd.L0(2131747585, null));
                        break;
                    }
                    break;
                case 2:
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    int[] iArr = this.f39312y;
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
                    editTextBoldCursor.setText(org.telegram.messenger.cd.L0(2131747510, null));
                    break;
                case 3:
                    this.f39297s = str2;
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
        HashMap hashMap2 = this.f39308w1;
        HashMap hashMap3 = this.f39314y1;
        if (hashMap2 != null && (charSequence2 = (String) hashMap2.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence2);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
            return;
        }
        HashMap hashMap4 = this.f39311x1;
        if (hashMap4 != null && (charSequence = (String) hashMap4.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
        }
    }

    public final void N1(Bundle bundle, int i10, boolean z10) {
        if (i10 == 3) {
            this.L.setVisibility(8);
        }
        int i11 = this.I1;
        org.telegram.ui.Components.zu0[] zu0VarArr = this.J1;
        org.telegram.ui.Components.zu0 zu0Var = zu0VarArr[i11];
        org.telegram.ui.Components.zu0 zu0Var2 = zu0VarArr[i10];
        this.I1 = i10;
        zu0Var2.m(bundle, false);
        zu0Var2.j();
        if (z10) {
            Point point = org.telegram.messenger.i0.f16026q;
            zu0Var2.setTranslationX(point.x);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.setDuration(300L);
            animatorSet.playTogether(ObjectAnimator.ofFloat(zu0Var, "translationX", -point.x), ObjectAnimator.ofFloat(zu0Var2, "translationX", 0.0f));
            animatorSet.addListener(new org.telegram.ui.Components.iw0(5, (View) zu0Var, (Object) zu0Var2));
            animatorSet.start();
            return;
        }
        zu0Var2.setTranslationX(0.0f);
        zu0Var2.setVisibility(0);
        if (zu0Var != zu0Var2) {
            zu0Var.setVisibility(8);
        }
    }

    public final void O1(org.telegram.tgnet.TLRPC.TL_secureRequiredType r31, java.lang.String r32, java.lang.String r33, org.telegram.tgnet.TLRPC.TL_secureRequiredType r34, java.lang.String r35, boolean r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ll0.O1(org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, boolean, int):void");
    }

    public final void P1(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = str;
        x1Var.T = str2;
        showDialog(x1Var);
    }

    public final void Q1(boolean z10, boolean z11) {
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
            this.M.addListener(new qk0(this, z11, 0));
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
            this.M.addListener(new qk0(this, z11, 1));
            this.M.setDuration(150L);
            this.M.start();
        }
    }

    public final void R1(boolean z10, String str, Runnable runnable, zk0 zk0Var, bl0 bl0Var) {
        boolean z11;
        boolean z12;
        boolean z13;
        TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.w0.f19025b.getSystemService("phone");
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
                        alertDialog$Builder.f20134a.R = org.telegram.messenger.cd.L0(2131689472, null);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                        String L0 = org.telegram.messenger.cd.L0(2131754275, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                        x1Var.T = L0;
                        this.L1 = showDialog(x1Var);
                    } else {
                        getParentActivity().requestPermissions((String[]) this.M1.toArray(new String[0]), 6);
                    }
                    this.E1 = str;
                    this.G1 = zk0Var;
                    this.F1 = runnable;
                    this.H1 = bl0Var;
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
        tL_codeSettings.allow_app_hash = org.telegram.messenger.eu.f15451b.hasServices();
        SharedPreferences sharedPreferences = org.telegram.messenger.w0.f19025b.getSharedPreferences("mainconfig", 0);
        if (sendverifyphonecode.settings.allow_app_hash) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            boolean z14 = org.telegram.messenger.v2.f18448a;
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendverifyphonecode, new mb(this, str, bl0Var, sendverifyphonecode, 5), 2);
    }

    public final void T1() {
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        if (tL_secureRequiredType != null) {
            this.actionBar.setTitle(t1(tL_secureRequiredType.type));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131747508, null));
        }
        W1(2);
        W1(3);
        W1(1);
        W1(4);
    }

    public final void U0(final org.telegram.messenger.pw pwVar, final int i10) {
        String L0;
        final String str;
        String v;
        HashMap hashMap;
        if (i10 == 1) {
            this.f39280j1 = pwVar;
            if (this.f39273g0 == null) {
                return;
            }
        } else if (i10 == 4) {
            this.f39282k1.add(pwVar);
            if (this.f39275h0 == null) {
                return;
            }
        } else if (i10 == 2) {
            this.l1 = pwVar;
            if (this.f39268e0 == null) {
                return;
            }
        } else if (i10 == 3) {
            this.f39284m1 = pwVar;
            if (this.f39271f0 == null) {
                return;
            }
        } else {
            this.f39278i1.add(pwVar);
            if (this.f39266d0 == null) {
                return;
            }
        }
        if (getParentActivity() == null) {
            return;
        }
        final jl0 jl0Var = new jl0(this, getParentActivity());
        jl0Var.setTag(pwVar);
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.t6.N0(true);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f20929d6);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f21020i6);
        jl0Var.setBackground(N0);
        org.telegram.ui.ActionBar.a7.k(jl0Var, N0, N, N2, null);
        this.f39287n1.put(pwVar, jl0Var);
        String q12 = q1(pwVar);
        if (i10 == 1) {
            L0 = org.telegram.messenger.cd.L0(2131747479, null);
            this.f39273g0.addView(jl0Var, w7.b6.o(-1, -2));
            str = "selfie" + q12;
        } else if (i10 == 4) {
            L0 = org.telegram.messenger.cd.L0(2131753948, null);
            this.f39275h0.addView(jl0Var, w7.b6.o(-1, -2));
            str = "translation" + q12;
        } else if (i10 == 2) {
            TLRPC.SecureValueType secureValueType = this.F.type;
            if (!(secureValueType instanceof TLRPC.TL_secureValueTypePassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                L0 = org.telegram.messenger.cd.L0(2131747584, null);
            } else {
                L0 = org.telegram.messenger.cd.L0(2131747526, null);
            }
            this.f39268e0.addView(jl0Var, w7.b6.o(-1, -2));
            str = "front" + q12;
        } else if (i10 == 3) {
            L0 = org.telegram.messenger.cd.L0(2131747488, null);
            this.f39271f0.addView(jl0Var, w7.b6.o(-1, -2));
            str = "reverse" + q12;
        } else {
            L0 = org.telegram.messenger.cd.L0(2131753948, null);
            this.f39266d0.addView(jl0Var, w7.b6.o(-1, -2));
            str = "files" + q12;
        }
        TextView textView = jl0Var.f38545b;
        if (str != null && (hashMap = this.f39311x1) != null && (v = (String) hashMap.get(str)) != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21153p7, null);
            this.f39314y1.put(str, "");
        } else {
            v = org.telegram.messenger.cd.v(pwVar.f17489b.date);
        }
        jl0Var.f38544a.setText(L0);
        textView.setText(v);
        org.telegram.ui.Components.g9 g9Var = jl0Var.f38546c;
        g9Var.getClass();
        ?? obj = new Object();
        obj.h = pwVar;
        g9Var.o(obj, "48_48", null, null, null, null, 0, null);
        jl0Var.f38547f = pwVar;
        jl0Var.a(false);
        jl0Var.setOnClickListener(new bh.f(this, i10, 21));
        jl0Var.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                ll0 ll0Var = this;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ll0Var.getParentActivity());
                int i11 = i10;
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                if (i11 == 1) {
                    x1Var.T = org.telegram.messenger.cd.L0(2131747598, null);
                } else {
                    x1Var.T = org.telegram.messenger.cd.L0(2131747600, null);
                }
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                x1Var.R = org.telegram.messenger.cd.L0(2131689472, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), new jg.q2(ll0Var, pwVar, i11, jl0Var, str, 4));
                ll0Var.showDialog(x1Var);
                return true;
            }
        });
    }

    public final void U1() {
        if (this.D.values.isEmpty()) {
            this.A0.setVisibility(0);
            this.f39283l0.setVisibility(8);
            this.f39279j0.setVisibility(8);
            this.f39310x0.setVisibility(8);
            this.f39313y0.setVisibility(8);
            this.f39315z0.setVisibility(8);
            return;
        }
        this.A0.setVisibility(8);
        this.f39283l0.setVisibility(0);
        this.f39279j0.setVisibility(0);
        this.f39313y0.setVisibility(0);
        this.f39315z0.setVisibility(0);
        if (!v1(TLRPC.TL_secureValueTypePhone.class) && !v1(TLRPC.TL_secureValueTypeEmail.class) && !v1(TLRPC.TL_secureValueTypePersonalDetails.class) && !v1(TLRPC.TL_secureValueTypePassport.class) && !v1(TLRPC.TL_secureValueTypeInternalPassport.class) && !v1(TLRPC.TL_secureValueTypeIdentityCard.class) && !v1(TLRPC.TL_secureValueTypeDriverLicense.class) && !v1(TLRPC.TL_secureValueTypeAddress.class) && !v1(TLRPC.TL_secureValueTypeUtilityBill.class) && !v1(TLRPC.TL_secureValueTypePassportRegistration.class) && !v1(TLRPC.TL_secureValueTypeTemporaryRegistration.class) && !v1(TLRPC.TL_secureValueTypeBankStatement.class) && !v1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            this.f39310x0.setVisibility(8);
        } else {
            this.f39310x0.setVisibility(0);
        }
    }

    public final void V0(TLRPC.TL_secureFile tL_secureFile, int i10) {
        byte[] bArr = tL_secureFile.secret;
        byte[] bArr2 = tL_secureFile.file_hash;
        byte[] r10 = Utilities.r(l1(bArr, bArr2), bArr2);
        byte[] bArr3 = new byte[32];
        System.arraycopy(r10, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(r10, 32, bArr4, 0, 16);
        U0(new org.telegram.messenger.pw(new org.telegram.messenger.qw(bArr3, bArr4), tL_secureFile, null, null, null), i10);
    }

    public final void V1() {
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
                        this.Y[0].setHint(org.telegram.messenger.cd.L0(2131748737, null));
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

    public final void W0(ArrayList arrayList) {
        this.f39278i1.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i10);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                V0((TLRPC.TL_secureFile) secureFile, 0);
            }
        }
    }

    public final void W1(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ll0.W1(int):void");
    }

    public final org.telegram.ui.kl0 X0(android.content.Context r28, org.telegram.tgnet.TLRPC.TL_secureRequiredType r29, java.util.ArrayList r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ll0.X0(android.content.Context, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.util.ArrayList, boolean, boolean):org.telegram.ui.kl0");
    }

    public final void Y0(ArrayList arrayList) {
        this.f39282k1.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i10);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                V0((TLRPC.TL_secureFile) secureFile, 4);
            }
        }
    }

    public final void Z0(boolean z10) {
        int i10;
        if (!this.f39274g1) {
            String str = this.f39285n;
            boolean isEmpty = TextUtils.isEmpty(str);
            int i11 = this.f39260b;
            if (!isEmpty) {
                if (z10) {
                    Activity parentActivity = getParentActivity();
                    gf.f.o(parentActivity, Uri.parse(str + "&tg_passport=success"));
                } else if (!this.f39272f1 && (i11 == 5 || i11 == 0)) {
                    Activity parentActivity2 = getParentActivity();
                    gf.f.o(parentActivity2, Uri.parse(str + "&tg_passport=cancel"));
                }
                this.f39274g1 = true;
            } else if (this.C1) {
                if (z10 || (!this.f39272f1 && (i11 == 5 || i11 == 0))) {
                    Activity parentActivity3 = getParentActivity();
                    if (z10) {
                        i10 = -1;
                    } else {
                        i10 = 0;
                    }
                    parentActivity3.setResult(i10);
                }
                this.f39274g1 = true;
            }
        }
    }

    public final boolean a1(boolean z10) {
        if (x1()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747596, null), new ak0(this, 1));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            String L0 = org.telegram.messenger.cd.L0(2131751406, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.L0(2131747595, null);
            showDialog(x1Var);
        }
        return true;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
    }

    public final void b1(boolean z10) {
        String str;
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.f39258a0 != null) {
            String str2 = (String) this.Y0.get(this.f39306w);
            String str3 = (String) org.telegram.messenger.tz.n().get(this.f39306w);
            int i10 = 0;
            if (this.E.native_names && !TextUtils.isEmpty(this.f39306w) && !"EN".equals(str3)) {
                if (this.f39292q0.getVisibility() != 0) {
                    this.f39292q0.setVisibility(0);
                    this.f39279j0.setVisibility(0);
                    this.T.setVisibility(0);
                    int i11 = 0;
                    while (true) {
                        editTextBoldCursorArr = this.f39258a0;
                        if (i11 >= editTextBoldCursorArr.length) {
                            break;
                        }
                        ((View) editTextBoldCursorArr[i11].getParent()).setVisibility(0);
                        i11++;
                    }
                    if (editTextBoldCursorArr[0].length() == 0 && this.f39258a0[1].length() == 0 && this.f39258a0[2].length() == 0) {
                        int i12 = 0;
                        while (true) {
                            boolean[] zArr = this.f39300t0;
                            if (i12 >= zArr.length) {
                                break;
                            } else if (zArr[i12]) {
                                this.f39258a0[0].setText(this.Y[0].getText());
                                this.f39258a0[1].setText(this.Y[1].getText());
                                this.f39258a0[2].setText(this.Y[2].getText());
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    org.telegram.ui.ActionBar.a7.a0(this.m0, getParentActivity(), 2131231230, org.telegram.ui.ActionBar.t6.f20892b7);
                }
                this.f39292q0.setText(org.telegram.messenger.cd.a0("PassportNativeInfo", null, 2131747514, str2));
                if (str3 != null) {
                    String concat = "PassportLanguage_".concat(str3);
                    str = org.telegram.messenger.cd.D0().V.b(concat);
                    if (str == null) {
                        org.telegram.messenger.cd D0 = org.telegram.messenger.cd.D0();
                        D0.i();
                        str = D0.T.b(concat);
                    }
                } else {
                    str = null;
                }
                if (str != null) {
                    this.f39279j0.setText(org.telegram.messenger.cd.a0("PassportNativeHeaderLang", null, 2131747515, str));
                } else {
                    this.f39279j0.setText(org.telegram.messenger.cd.L0(2131747516, null));
                }
                for (int i13 = 0; i13 < 3; i13++) {
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 == 2) {
                                if (str != null) {
                                    this.f39258a0[i13].setHintText(org.telegram.messenger.cd.L0(2131747474, null));
                                } else {
                                    this.f39258a0[i13].setHintText(org.telegram.messenger.cd.a0("PassportSurnameCountry", null, 2131747473, str2));
                                }
                            }
                        } else if (str != null) {
                            this.f39258a0[i13].setHintText(org.telegram.messenger.cd.L0(2131747523, null));
                        } else {
                            this.f39258a0[i13].setHintText(org.telegram.messenger.cd.a0("PassportMidnameCountry", null, 2131747522, str2));
                        }
                    } else if (str != null) {
                        this.f39258a0[i13].setHintText(org.telegram.messenger.cd.L0(2131747520, null));
                    } else {
                        this.f39258a0[i13].setHintText(org.telegram.messenger.cd.a0("PassportNameCountry", null, 2131747518, str2));
                    }
                }
                if (z10) {
                    org.telegram.messenger.i0.g3(new xj0(this, 2));
                }
            } else if (this.f39292q0.getVisibility() != 8) {
                this.f39292q0.setVisibility(8);
                this.f39279j0.setVisibility(8);
                this.T.setVisibility(8);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.f39258a0;
                    if (i10 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    ((View) editTextBoldCursorArr2[i10].getParent()).setVisibility(8);
                    i10++;
                }
                if (((this.f39263c != 0 || this.F == null) && this.H != null && !this.f39304v0) || this.I != null) {
                    org.telegram.ui.ActionBar.a7.a0(this.m0, getParentActivity(), 2131231230, org.telegram.ui.ActionBar.t6.f20892b7);
                } else {
                    org.telegram.ui.ActionBar.a7.a0(this.m0, getParentActivity(), 2131231231, org.telegram.ui.ActionBar.t6.f20892b7);
                }
            }
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ll0.createView(android.content.Context):android.view.View");
    }

    public final void d1(boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        String str2;
        if (this.f39290p0 != null) {
            HashMap hashMap = this.f39308w1;
            HashMap hashMap2 = this.f39314y1;
            if (hashMap != null && ((z10 || hashMap2.containsKey("error_all")) && (str2 = (String) this.f39308w1.get("error_all")) != null)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
                if (z10) {
                    hashMap2.put("error_all", "");
                }
            } else {
                spannableStringBuilder = null;
            }
            if (this.f39311x1 != null && ((z10 || hashMap2.containsKey("error_document_all")) && (str = (String) this.f39311x1.get("error_all")) != null)) {
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
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.f21153p7, null), 0, spannableStringBuilder.length(), 33);
                this.f39290p0.setText(spannableStringBuilder);
                this.f39290p0.setVisibility(0);
            } else if (this.f39290p0.getVisibility() != 8) {
                this.f39290p0.setVisibility(8);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        EditTextBoldCursor editTextBoldCursor;
        jl0 jl0Var;
        org.telegram.ui.ActionBar.t0 t0Var;
        if (i10 == org.telegram.messenger.zs.U1) {
            String str = (String) objArr[0];
            HashMap hashMap = this.f39289o1;
            org.telegram.messenger.pw pwVar = (org.telegram.messenger.pw) hashMap.get(str);
            if (pwVar != null) {
                pwVar.d = (TLRPC.TL_inputFile) objArr[1];
                hashMap.remove(str);
                if (hashMap.isEmpty() && (t0Var = this.L) != null) {
                    t0Var.setEnabled(true);
                    this.L.setAlpha(1.0f);
                }
                HashMap hashMap2 = this.f39287n1;
                if (hashMap2 != null && (jl0Var = (jl0) hashMap2.get(pwVar)) != null) {
                    jl0Var.a(true);
                }
                HashMap hashMap3 = this.f39314y1;
                if (hashMap3 != null && hashMap3.containsKey("error_document_all")) {
                    hashMap3.remove("error_document_all");
                    d1(false);
                }
                int i12 = pwVar.f17492i;
                if (i12 == 0) {
                    if (this.f39286n0 != null && !TextUtils.isEmpty(this.f39316z1)) {
                        this.f39286n0.setText(this.f39316z1);
                    }
                    hashMap3.remove("files_all");
                } else if (i12 == 4) {
                    if (this.f39288o0 != null && !TextUtils.isEmpty(this.A1)) {
                        this.f39288o0.setText(this.A1);
                    }
                    hashMap3.remove("translation_all");
                }
            }
        } else if (i10 != org.telegram.messenger.zs.V1 && i10 == org.telegram.messenger.zs.f19665p0) {
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
                    Utilities.f14519b.nextBytes(bArr);
                    EditTextBoldCursor editTextBoldCursor2 = this.Y[0];
                    if (editTextBoldCursor2 != null && editTextBoldCursor2.length() > 0) {
                        this.N0 = 2;
                    }
                }
            } else {
                this.J = null;
                z1();
            }
            V1();
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

    public final void e1(Context context) {
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
        this.f39290p0 = b9Var;
        int i10 = org.telegram.ui.ActionBar.t6.f20892b7;
        org.telegram.ui.ActionBar.a7.a0(b9Var, context, 2131231232, i10);
        this.f39290p0.setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, 0);
        this.f39264c0.addView(this.f39290p0, w7.b6.o(-1, -2));
        d1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        if (tL_secureRequiredType != null) {
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131754673, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
                this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131754682, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131754671, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131754675, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131754672, null));
            }
            org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context);
            this.f39279j0 = p4Var;
            p4Var.setText(org.telegram.messenger.cd.L0(2131747592, null));
            org.telegram.ui.Cells.p4 p4Var2 = this.f39279j0;
            int i11 = org.telegram.ui.ActionBar.t6.f20929d6;
            org.telegram.ui.ActionBar.a7.i(i11, p4Var2, null);
            j10 = 0;
            this.f39264c0.addView(this.f39279j0, w7.b6.o(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.f39266d0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f39264c0.addView(this.f39266d0, w7.b6.o(-1, -2));
            org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
            this.R = x9Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.t6.N0(true);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
            int i12 = org.telegram.ui.ActionBar.t6.f21020i6;
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i12);
            x9Var.setBackground(N0);
            org.telegram.ui.ActionBar.a7.k(x9Var, N0, N, N2, null);
            this.f39264c0.addView(this.R, w7.b6.o(-1, -2));
            this.R.setOnClickListener(new yj0(this, 7));
            org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context);
            this.f39286n0 = b9Var2;
            org.telegram.ui.ActionBar.a7.a0(b9Var2, context, 2131231230, i10);
            if (this.f39263c != 0) {
                this.f39316z1 = org.telegram.messenger.cd.L0(2131747643, null);
            } else {
                TLRPC.SecureValueType secureValueType2 = this.F.type;
                if (secureValueType2 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                    this.f39316z1 = org.telegram.messenger.cd.L0(2131747641, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                    this.f39316z1 = org.telegram.messenger.cd.L0(2131747637, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                    this.f39316z1 = org.telegram.messenger.cd.L0(2131747627, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                    this.f39316z1 = org.telegram.messenger.cd.L0(2131747625, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                    this.f39316z1 = org.telegram.messenger.cd.L0(2131747639, null);
                } else {
                    this.f39316z1 = "";
                }
            }
            String str2 = this.f39316z1;
            HashMap hashMap = this.f39311x1;
            HashMap hashMap2 = this.f39314y1;
            String str3 = str2;
            if (hashMap != null) {
                String str4 = (String) hashMap.get("files_all");
                str3 = str2;
                if (str4 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                    spannableStringBuilder.append((CharSequence) "\n\n");
                    spannableStringBuilder.append((CharSequence) this.f39316z1);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.f21153p7, null), 0, str4.length(), 33);
                    hashMap2.put("files_all", "");
                    str3 = spannableStringBuilder;
                }
            }
            this.f39286n0.setText(str3);
            this.f39264c0.addView(this.f39286n0, w7.b6.o(-1, -2));
            if (this.F.translation_required) {
                org.telegram.ui.Cells.p4 p4Var3 = new org.telegram.ui.Cells.p4(context);
                this.f39279j0 = p4Var3;
                p4Var3.setText(org.telegram.messenger.cd.L0(2131747471, null));
                org.telegram.ui.ActionBar.a7.i(i11, this.f39279j0, null);
                this.f39264c0.addView(this.f39279j0, w7.b6.o(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.f39275h0 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.f39264c0.addView(this.f39275h0, w7.b6.o(-1, -2));
                org.telegram.ui.Cells.x9 x9Var2 = new org.telegram.ui.Cells.x9(context);
                this.X = x9Var2;
                org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.t6.N0(true);
                org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i11);
                org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i12);
                x9Var2.setBackground(N02);
                org.telegram.ui.ActionBar.a7.k(x9Var2, N02, N3, N4, null);
                this.f39264c0.addView(this.X, w7.b6.o(-1, -2));
                this.X.setOnClickListener(new yj0(this, 8));
                org.telegram.ui.Cells.b9 b9Var3 = new org.telegram.ui.Cells.b9(context);
                this.f39288o0 = b9Var3;
                org.telegram.ui.ActionBar.a7.a0(b9Var3, context, 2131231230, i10);
                if (this.f39263c != 0) {
                    this.A1 = org.telegram.messenger.cd.L0(2131747619, null);
                } else {
                    TLRPC.SecureValueType secureValueType3 = this.F.type;
                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                        this.A1 = org.telegram.messenger.cd.L0(2131747624, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                        this.A1 = org.telegram.messenger.cd.L0(2131747622, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                        this.A1 = org.telegram.messenger.cd.L0(2131747621, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                        this.A1 = org.telegram.messenger.cd.L0(2131747620, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                        this.A1 = org.telegram.messenger.cd.L0(2131747623, null);
                    } else {
                        this.A1 = "";
                    }
                }
                String str5 = this.A1;
                HashMap hashMap3 = this.f39311x1;
                String str6 = str5;
                if (hashMap3 != null) {
                    String str7 = (String) hashMap3.get("translation_all");
                    str6 = str5;
                    if (str7 != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str7);
                        spannableStringBuilder2.append((CharSequence) "\n\n");
                        spannableStringBuilder2.append((CharSequence) this.A1);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.f21153p7, null), 0, str7.length(), 33);
                        hashMap2.put("translation_all", "");
                        str6 = spannableStringBuilder2;
                    }
                }
                this.f39288o0.setText(str6);
                this.f39264c0.addView(this.f39288o0, w7.b6.o(-1, -2));
            }
        } else {
            j10 = 0;
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131747618, null));
        }
        org.telegram.ui.Cells.p4 p4Var4 = new org.telegram.ui.Cells.p4(context);
        this.f39279j0 = p4Var4;
        p4Var4.setText(org.telegram.messenger.cd.L0(2131747617, null));
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, this.f39279j0, null);
        this.f39264c0.addView(this.f39279j0, w7.b6.o(-1, -2));
        this.Y = new EditTextBoldCursor[6];
        for (int i13 = 0; i13 < 6; i13++) {
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.Y[i13] = editTextBoldCursor;
            hk0 hk0Var = new hk0(context, editTextBoldCursor, 0);
            hk0Var.setWillNotDraw(false);
            this.f39264c0.addView(hk0Var, w7.b6.o(-1, -2));
            int i14 = org.telegram.ui.ActionBar.t6.f20929d6;
            org.telegram.ui.ActionBar.a7.i(i14, hk0Var, null);
            int i15 = 5;
            if (i13 == 5) {
                View view = new View(context);
                this.S = view;
                org.telegram.ui.ActionBar.a7.i(i14, view, null);
                this.f39264c0.addView(this.S, w7.b6.o(-1, 6));
            }
            if (this.f39304v0 && this.F != null) {
                hk0Var.setVisibility(8);
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
            org.telegram.ui.ActionBar.a7.G(this.Y[i13], org.telegram.ui.ActionBar.t6.f21058k6, org.telegram.ui.ActionBar.t6.f21076l6, org.telegram.ui.ActionBar.t6.f21153p7, null);
            if (i13 == 5) {
                this.Y[i13].setOnTouchListener(new zj0(this, 2));
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
                                    this.Y[i13].setHintText(org.telegram.messenger.cd.L0(2131747610, null));
                                    str = "country_code";
                                }
                            } else {
                                this.Y[i13].setHintText(org.telegram.messenger.cd.L0(2131747477, null));
                                str = "state";
                            }
                        } else {
                            this.Y[i13].setHintText(org.telegram.messenger.cd.L0(2131747611, null));
                            str = "city";
                        }
                    } else {
                        this.Y[i13].setHintText(org.telegram.messenger.cd.L0(2131747496, null));
                        str = "post_code";
                    }
                } else {
                    this.Y[i13].setHintText(org.telegram.messenger.cd.L0(2131747475, null));
                    str = "street_line2";
                }
            } else {
                this.Y[i13].setHintText(org.telegram.messenger.cd.L0(2131747476, null));
                str = "street_line1";
            }
            M1(this.f39299s1, this.Y[i13], str);
            if (i13 == 2) {
                this.Y[i13].addTextChangedListener(new ik0(this, editTextBoldCursor, str));
                this.Y[i13].setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            } else {
                this.Y[i13].addTextChangedListener(new jk0(this, editTextBoldCursor, str, 0));
            }
            EditTextBoldCursor editTextBoldCursor3 = this.Y[i13];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.Y[i13].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.Y[i13];
            if (!org.telegram.messenger.cd.X) {
                i15 = 3;
            }
            editTextBoldCursor4.setGravity(i15 | 16);
            hk0Var.addView(this.Y[i13], w7.b6.d(-1, 64.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
            this.Y[i13].setOnEditorActionListener(new wj0(this, 4));
        }
        org.telegram.ui.Cells.c7 c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
        this.f39283l0 = c7Var;
        this.f39264c0.addView(c7Var, w7.b6.o(-1, -2));
        if (this.f39304v0 && this.F != null) {
            this.f39279j0.setVisibility(8);
            this.f39283l0.setVisibility(8);
        }
        int i17 = (this.f39263c > j10 ? 1 : (this.f39263c == j10 ? 0 : -1));
        TLRPC.TL_secureValue tL_secureValue = this.I;
        if (((i17 != 0 || this.F == null) && this.H != null && !this.f39304v0) || tL_secureValue != null) {
            if (tL_secureValue != null) {
                W0(tL_secureValue.files);
                Y0(tL_secureValue.translation);
            }
            org.telegram.ui.Cells.c7 c7Var2 = this.f39283l0;
            int i18 = org.telegram.ui.ActionBar.t6.f20892b7;
            org.telegram.ui.ActionBar.a7.a0(c7Var2, context, 2131231230, i18);
            org.telegram.ui.Cells.x9 x9Var3 = new org.telegram.ui.Cells.x9(context);
            org.telegram.ui.ActionBar.a7.V(x9Var3.getTextView(), org.telegram.ui.ActionBar.t6.f21153p7, null);
            org.telegram.ui.Cells.y N03 = org.telegram.ui.ActionBar.t6.N0(true);
            org.telegram.ui.ActionBar.w6 N5 = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f20929d6);
            org.telegram.ui.ActionBar.w6 N6 = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f21020i6);
            x9Var3.setBackground(N03);
            org.telegram.ui.ActionBar.a7.k(x9Var3, N03, N5, N6, null);
            if (this.F == null) {
                x9Var3.b(org.telegram.messenger.cd.L0(2131747603, null), false);
            } else {
                x9Var3.b(org.telegram.messenger.cd.L0(2131747608, null), false);
            }
            this.f39264c0.addView(x9Var3, w7.b6.o(-1, -2));
            x9Var3.setOnClickListener(new yj0(this, 9));
            org.telegram.ui.Cells.c7 c7Var3 = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
            this.f39283l0 = c7Var3;
            org.telegram.ui.ActionBar.a7.a0(c7Var3, context, 2131231231, i18);
            this.f39264c0.addView(this.f39283l0, w7.b6.o(-1, -2));
        } else {
            org.telegram.ui.Cells.c7 c7Var4 = this.f39283l0;
            int i19 = org.telegram.ui.ActionBar.t6.f20892b7;
            org.telegram.ui.ActionBar.a7.a0(c7Var4, context, 2131231231, i19);
            if (this.f39304v0 && this.F != null) {
                org.telegram.ui.ActionBar.a7.a0(this.f39286n0, context, 2131231231, i19);
            }
        }
        W1(0);
        W1(4);
    }

    public final void f1() {
        if (getParentActivity() != null && this.R0 == null) {
            org.telegram.ui.Components.bi biVar = new org.telegram.ui.Components.bi(getParentActivity(), this, false, false);
            this.R0 = biVar;
            biVar.T3 = new kk0(this);
        }
    }

    public final void g1() {
        int L;
        int L2;
        boolean[] zArr = {true};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), new rv(25, this, zArr));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        String L0 = org.telegram.messenger.cd.L0(2131689472, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        boolean z10 = this.f39304v0;
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.E;
        if (z10 && this.F == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeAddress)) {
            x1Var.T = org.telegram.messenger.cd.L0(2131747609, null);
        } else if (z10 && this.F == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            x1Var.T = org.telegram.messenger.cd.L0(2131747602, null);
        } else {
            x1Var.T = org.telegram.messenger.cd.L0(2131747606, null);
        }
        if (!this.f39304v0 && this.F != null) {
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(getParentActivity(), 1);
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.t6.N0(false);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f21020i6);
            c2Var.setBackground(N0);
            org.telegram.ui.ActionBar.a7.k(c2Var, N0, null, N, null);
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                c2Var.e(org.telegram.messenger.cd.L0(2131747607, null), "", true, false, false);
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                c2Var.e(org.telegram.messenger.cd.L0(2131747605, null), "", true, false, false);
            }
            if (org.telegram.messenger.cd.X) {
                L = org.telegram.messenger.i0.L(16.0f);
            } else {
                L = org.telegram.messenger.i0.L(8.0f);
            }
            if (org.telegram.messenger.cd.X) {
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

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39261b0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21206s8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D8));
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.f39281k0;
            if (i11 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) arrayList2.get(i11), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20930d7));
            i11++;
        }
        for (Map.Entry entry : this.f39287n1.entrySet()) {
            arrayList.add(new org.telegram.ui.ActionBar.c7((jl0) entry.getValue(), 268435456, new Class[]{jl0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20929d6));
        }
        int i12 = org.telegram.ui.ActionBar.t6.f20929d6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39264c0, 268435456, new Class[]{org.telegram.ui.Cells.a9.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39264c0, 268435456, new Class[]{org.telegram.ui.Cells.x9.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39264c0, 268435456, new Class[]{kl0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        if (this.Y != null) {
            int i13 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.Y;
                if (i13 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.c7((View) editTextBoldCursorArr[i13].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20929d6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.Y[i13], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.Y[i13], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21058k6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.Y[i13], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21076l6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.Y[i13], 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21153p7));
                i13++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.H6));
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.L6));
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21058k6));
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21076l6));
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21153p7));
        }
        if (this.f39258a0 != null) {
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.f39258a0;
                if (i10 >= editTextBoldCursorArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.c7((View) editTextBoldCursorArr2[i10].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20929d6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39258a0[i10], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39258a0[i10], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21058k6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39258a0[i10], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21076l6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39258a0[i10], 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21153p7));
                i10++;
            }
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.F0, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21002h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.Q, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20977fi));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.Q, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20995gi));
        return arrayList;
    }

    public final void h1(Context context) {
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
        this.f39290p0 = b9Var;
        int i13 = org.telegram.ui.ActionBar.t6.f20892b7;
        org.telegram.ui.ActionBar.a7.a0(b9Var, context, 2131231232, i13);
        this.f39290p0.setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, 0);
        int i14 = -1;
        this.f39264c0.addView(this.f39290p0, w7.b6.o(-1, -2));
        d1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.E;
        org.telegram.ui.ActionBar.p6 p6Var = null;
        if (tL_secureRequiredType != null) {
            org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context);
            this.f39279j0 = p4Var;
            if (this.f39304v0) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131747592, null));
            } else {
                p4Var.setText(org.telegram.messenger.cd.L0(2131747491, null));
            }
            org.telegram.ui.Cells.p4 p4Var2 = this.f39279j0;
            int i15 = org.telegram.ui.ActionBar.t6.f20929d6;
            org.telegram.ui.ActionBar.a7.i(i15, p4Var2, null);
            this.f39264c0.addView(this.f39279j0, w7.b6.o(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.f39268e0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f39264c0.addView(this.f39268e0, w7.b6.o(-1, -2));
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            this.U = a9Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.t6.N0(true);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i15);
            int i16 = org.telegram.ui.ActionBar.t6.f21020i6;
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i16);
            a9Var.setBackground(N0);
            org.telegram.ui.ActionBar.a7.k(a9Var, N0, N, N2, null);
            this.f39264c0.addView(this.U, w7.b6.o(-1, -2));
            this.U.setOnClickListener(new yj0(this, 0));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.f39271f0 = linearLayout2;
            linearLayout2.setOrientation(1);
            this.f39264c0.addView(this.f39271f0, w7.b6.o(-1, -2));
            boolean z10 = this.F.selfie_required;
            org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context);
            this.V = a9Var2;
            org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.t6.N0(true);
            org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i15);
            org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i16);
            a9Var2.setBackground(N02);
            org.telegram.ui.ActionBar.a7.k(a9Var2, N02, N3, N4, null);
            this.V.a(org.telegram.messenger.cd.L0(2131747488, null), org.telegram.messenger.cd.L0(2131747487, null), z10);
            this.f39264c0.addView(this.V, w7.b6.o(-1, -2));
            this.V.setOnClickListener(new yj0(this, 2));
            if (this.F.selfie_required) {
                LinearLayout linearLayout3 = new LinearLayout(context);
                this.f39273g0 = linearLayout3;
                linearLayout3.setOrientation(1);
                this.f39264c0.addView(this.f39273g0, w7.b6.o(-1, -2));
                org.telegram.ui.Cells.a9 a9Var3 = new org.telegram.ui.Cells.a9(context);
                this.W = a9Var3;
                org.telegram.ui.Cells.y N03 = org.telegram.ui.ActionBar.t6.N0(true);
                org.telegram.ui.ActionBar.w6 N5 = org.telegram.ui.ActionBar.a7.N(i15);
                org.telegram.ui.ActionBar.w6 N6 = org.telegram.ui.ActionBar.a7.N(i16);
                a9Var3.setBackground(N03);
                org.telegram.ui.ActionBar.a7.k(a9Var3, N03, N5, N6, null);
                this.W.a(org.telegram.messenger.cd.L0(2131747479, null), org.telegram.messenger.cd.L0(2131747478, null), tL_secureRequiredType2.translation_required);
                this.f39264c0.addView(this.W, w7.b6.o(-1, -2));
                this.W.setOnClickListener(new yj0(this, 3));
            }
            org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context);
            this.f39286n0 = b9Var2;
            org.telegram.ui.ActionBar.a7.a0(b9Var2, context, 2131231230, i13);
            this.f39286n0.setText(org.telegram.messenger.cd.L0(2131747505, null));
            this.f39264c0.addView(this.f39286n0, w7.b6.o(-1, -2));
            if (this.F.translation_required) {
                org.telegram.ui.Cells.p4 p4Var3 = new org.telegram.ui.Cells.p4(context);
                this.f39279j0 = p4Var3;
                p4Var3.setText(org.telegram.messenger.cd.L0(2131747471, null));
                org.telegram.ui.ActionBar.a7.i(i15, this.f39279j0, null);
                this.f39264c0.addView(this.f39279j0, w7.b6.o(-1, -2));
                LinearLayout linearLayout4 = new LinearLayout(context);
                this.f39275h0 = linearLayout4;
                linearLayout4.setOrientation(1);
                this.f39264c0.addView(this.f39275h0, w7.b6.o(-1, -2));
                org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
                this.X = x9Var;
                org.telegram.ui.Cells.y N04 = org.telegram.ui.ActionBar.t6.N0(true);
                org.telegram.ui.ActionBar.w6 N7 = org.telegram.ui.ActionBar.a7.N(i15);
                org.telegram.ui.ActionBar.w6 N8 = org.telegram.ui.ActionBar.a7.N(i16);
                x9Var.setBackground(N04);
                org.telegram.ui.ActionBar.a7.k(x9Var, N04, N7, N8, null);
                this.f39264c0.addView(this.X, w7.b6.o(-1, -2));
                this.X.setOnClickListener(new yj0(this, 4));
                org.telegram.ui.Cells.b9 b9Var3 = new org.telegram.ui.Cells.b9(context);
                this.f39288o0 = b9Var3;
                org.telegram.ui.ActionBar.a7.a0(b9Var3, context, 2131231230, i13);
                if (this.f39263c != 0) {
                    this.A1 = org.telegram.messenger.cd.L0(2131747619, null);
                } else {
                    TLRPC.SecureValueType secureValueType = this.F.type;
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
                        this.A1 = org.telegram.messenger.cd.L0(2131747629, null);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                        this.A1 = org.telegram.messenger.cd.L0(2131747632, null);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                        this.A1 = org.telegram.messenger.cd.L0(2131747634, null);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                        this.A1 = org.telegram.messenger.cd.L0(2131747635, null);
                    } else {
                        this.A1 = "";
                    }
                }
                String str4 = this.A1;
                HashMap hashMap = this.f39311x1;
                String str5 = str4;
                if (hashMap != null) {
                    String str6 = (String) hashMap.get("translation_all");
                    str5 = str4;
                    if (str6 != null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str6);
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) this.A1);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.f21153p7, null), 0, str6.length(), 33);
                        this.f39314y1.put("translation_all", "");
                        str5 = spannableStringBuilder;
                    }
                }
                this.f39288o0.setText(str5);
                this.f39264c0.addView(this.f39288o0, w7.b6.o(-1, -2));
            }
        } else {
            org.telegram.ui.Cells.x9 x9Var2 = new org.telegram.ui.Cells.x9(context);
            this.f39295r0 = x9Var2;
            org.telegram.ui.Cells.y N05 = org.telegram.ui.ActionBar.t6.N0(true);
            org.telegram.ui.ActionBar.w6 N9 = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f20929d6);
            org.telegram.ui.ActionBar.w6 N10 = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f21020i6);
            x9Var2.setBackground(N05);
            org.telegram.ui.ActionBar.a7.k(x9Var2, N05, N9, N10, null);
            this.f39295r0.b(org.telegram.messenger.cd.L0(2131747486, null), false);
            this.f39264c0.addView(this.f39295r0, w7.b6.o(-1, -2));
            this.f39295r0.setOnClickListener(new yj0(this, 5));
            org.telegram.ui.Cells.b9 b9Var4 = new org.telegram.ui.Cells.b9(context);
            this.f39286n0 = b9Var4;
            org.telegram.ui.ActionBar.a7.a0(b9Var4, context, 2131231230, i13);
            this.f39286n0.setText(org.telegram.messenger.cd.L0(2131747485, null));
            this.f39264c0.addView(this.f39286n0, w7.b6.o(-1, -2));
        }
        org.telegram.ui.Cells.p4 p4Var4 = new org.telegram.ui.Cells.p4(context);
        this.f39279j0 = p4Var4;
        if (this.f39304v0) {
            p4Var4.setText(org.telegram.messenger.cd.L0(2131747594, null));
        } else {
            p4Var4.setText(org.telegram.messenger.cd.L0(2131747508, null));
        }
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, this.f39279j0, null);
        this.f39264c0.addView(this.f39279j0, w7.b6.o(-1, -2));
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
            HashMap hashMap2 = this.f39299s1;
            if (i18 < i10) {
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.Y[i18] = editTextBoldCursor;
                hk0 hk0Var = new hk0(context, editTextBoldCursor, 1);
                hk0Var.setWillNotDraw(false);
                this.f39264c0.addView(hk0Var, w7.b6.o(i14, 64));
                int i20 = org.telegram.ui.ActionBar.t6.f20929d6;
                org.telegram.ui.ActionBar.a7.i(i20, hk0Var, p6Var);
                if (i18 == i10 - 1) {
                    View view = new View(context);
                    this.S = view;
                    org.telegram.ui.ActionBar.a7.i(i20, view, p6Var);
                    this.f39264c0.addView(this.S, w7.b6.o(i14, 6));
                }
                if (this.f39304v0 && this.F != null && i18 < i17) {
                    hk0Var.setVisibility(8);
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
                org.telegram.ui.ActionBar.a7.G(this.Y[i18], org.telegram.ui.ActionBar.t6.f21058k6, org.telegram.ui.ActionBar.t6.f21076l6, org.telegram.ui.ActionBar.t6.f21153p7, null);
                if (i18 != 5 && i18 != 6) {
                    if (i18 != 3 && i18 != 8) {
                        if (i18 == 4) {
                            this.Y[i18].setOnTouchListener(new zj0(this, 1));
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
                    this.Y[i18].setOnTouchListener(new zj0(this, 0));
                    this.Y[i18].setInputType(0);
                }
                HashMap hashMap3 = this.f39301t1;
                switch (i18) {
                    case 0:
                        if (tL_secureRequiredType2.native_names) {
                            this.Y[i18].setHintText(org.telegram.messenger.cd.L0(2131747517, null));
                        } else {
                            this.Y[i18].setHintText(org.telegram.messenger.cd.L0(2131747520, null));
                        }
                        str2 = "first_name";
                        break;
                    case 1:
                        if (tL_secureRequiredType2.native_names) {
                            this.Y[i18].setHintText(org.telegram.messenger.cd.L0(2131747521, null));
                        } else {
                            this.Y[i18].setHintText(org.telegram.messenger.cd.L0(2131747523, null));
                        }
                        str2 = "middle_name";
                        break;
                    case 2:
                        if (tL_secureRequiredType2.native_names) {
                            this.Y[i18].setHintText(org.telegram.messenger.cd.L0(2131747472, null));
                        } else {
                            this.Y[i18].setHintText(org.telegram.messenger.cd.L0(2131747474, null));
                        }
                        str2 = "last_name";
                        break;
                    case 3:
                        this.Y[i18].setHintText(org.telegram.messenger.cd.L0(2131747613, null));
                        str2 = "birth_date";
                        break;
                    case 4:
                        this.Y[i18].setHintText(org.telegram.messenger.cd.L0(2131747582, null));
                        str2 = "gender";
                        break;
                    case 5:
                        this.Y[i18].setHintText(org.telegram.messenger.cd.L0(2131747612, null));
                        str2 = "country_code";
                        break;
                    case 6:
                        this.Y[i18].setHintText(org.telegram.messenger.cd.L0(2131747490, null));
                        str2 = "residence_country_code";
                        break;
                    case 7:
                        this.Y[i18].setHintText(org.telegram.messenger.cd.L0(2131747593, null));
                        str3 = "document_no";
                        String str7 = str3;
                        hashMap2 = hashMap3;
                        str2 = str7;
                        break;
                    case 8:
                        this.Y[i18].setHintText(org.telegram.messenger.cd.L0(2131747586, null));
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
                M1(hashMap2, this.Y[i18], str2);
                EditTextBoldCursor editTextBoldCursor3 = this.Y[i18];
                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                if (i18 != 0 && i18 != 2 && i18 != 1) {
                    this.Y[i18].addTextChangedListener(new org.telegram.ui.Components.pw0(this, editTextBoldCursor, str2, hashMap2));
                } else {
                    this.Y[i18].addTextChangedListener(new jk0(this, editTextBoldCursor, str2, 1));
                }
                this.Y[i18].setPadding(0, 0, 0, 0);
                EditTextBoldCursor editTextBoldCursor4 = this.Y[i18];
                if (org.telegram.messenger.cd.X) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                editTextBoldCursor4.setGravity(i12 | 16);
                hk0Var.addView(this.Y[i18], w7.b6.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                this.Y[i18].setOnEditorActionListener(new wj0(this, 1));
                i18++;
                i17 = 7;
                i14 = -1;
                p6Var = null;
            } else {
                org.telegram.ui.Cells.c7 c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                this.m0 = c7Var;
                this.f39264c0.addView(c7Var, w7.b6.o(-1, -2));
                org.telegram.ui.Cells.p4 p4Var5 = new org.telegram.ui.Cells.p4(context);
                this.f39279j0 = p4Var5;
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, p4Var5, null);
                this.f39264c0.addView(this.f39279j0, w7.b6.o(-1, -2));
                this.f39258a0 = new EditTextBoldCursor[3];
                int i22 = 0;
                for (int i23 = 3; i22 < i23; i23 = 3) {
                    EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
                    this.f39258a0[i22] = editTextBoldCursor5;
                    hk0 hk0Var2 = new hk0(context, editTextBoldCursor5, 2);
                    hk0Var2.setWillNotDraw(false);
                    this.f39264c0.addView(hk0Var2, w7.b6.o(-1, 64));
                    int i24 = org.telegram.ui.ActionBar.t6.f20929d6;
                    org.telegram.ui.ActionBar.a7.i(i24, hk0Var2, null);
                    if (i22 == 2) {
                        View view3 = new View(context);
                        this.T = view3;
                        org.telegram.ui.ActionBar.a7.i(i24, view3, null);
                        this.f39264c0.addView(this.T, w7.b6.o(-1, i19));
                    }
                    this.f39258a0[i22].setTag(Integer.valueOf(i22));
                    this.f39258a0[i22].setSupportRtlHint(true);
                    this.f39258a0[i22].setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.a7.B(this.f39258a0[i22], org.telegram.ui.ActionBar.t6.H6, null);
                    EditTextBoldCursor editTextBoldCursor6 = this.f39258a0[i22];
                    int i25 = org.telegram.ui.ActionBar.t6.G6;
                    org.telegram.ui.ActionBar.a7.V(editTextBoldCursor6, i25, null);
                    org.telegram.ui.ActionBar.a7.A(this.f39258a0[i22], org.telegram.ui.ActionBar.t6.L6, null);
                    this.f39258a0[i22].setTransformHintToHeader(true);
                    this.f39258a0[i22].setBackgroundDrawable(null);
                    org.telegram.ui.ActionBar.a7.w(this.f39258a0[i22], i25, null);
                    this.f39258a0[i22].setCursorSize(org.telegram.messenger.i0.L(20.0f));
                    this.f39258a0[i22].setCursorWidth(1.5f);
                    org.telegram.ui.ActionBar.a7.G(this.f39258a0[i22], org.telegram.ui.ActionBar.t6.f21058k6, org.telegram.ui.ActionBar.t6.f21076l6, org.telegram.ui.ActionBar.t6.f21153p7, null);
                    this.f39258a0[i22].setInputType(16385);
                    this.f39258a0[i22].setImeOptions(268435461);
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
                    M1(hashMap2, this.f39258a0[i22], str);
                    EditTextBoldCursor editTextBoldCursor7 = this.f39258a0[i22];
                    editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
                    if (i22 == 0 || i22 == 2 || i22 == 1) {
                        this.f39258a0[i22].addTextChangedListener(new jk0(this, editTextBoldCursor5, str, 2));
                    }
                    this.f39258a0[i22].setPadding(0, 0, 0, 0);
                    EditTextBoldCursor editTextBoldCursor8 = this.f39258a0[i22];
                    if (org.telegram.messenger.cd.X) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    editTextBoldCursor8.setGravity(i11 | 16);
                    hk0Var2.addView(this.f39258a0[i22], w7.b6.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.f39258a0[i22].setOnEditorActionListener(new wj0(this, 2));
                    i22++;
                    i19 = 6;
                }
                org.telegram.ui.Cells.b9 b9Var5 = new org.telegram.ui.Cells.b9(context);
                this.f39292q0 = b9Var5;
                this.f39264c0.addView(b9Var5, w7.b6.o(-1, -2));
                int i26 = (this.f39263c > 0L ? 1 : (this.f39263c == 0L ? 0 : -1));
                TLRPC.TL_secureValue tL_secureValue = this.I;
                if (((i26 != 0 || this.F == null) && this.H != null && !this.f39304v0) || tL_secureValue != null) {
                    if (tL_secureValue != null) {
                        W0(tL_secureValue.files);
                        TLRPC.SecureFile secureFile = tL_secureValue.front_side;
                        if (secureFile instanceof TLRPC.TL_secureFile) {
                            V0((TLRPC.TL_secureFile) secureFile, 2);
                        }
                        TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                        if (secureFile2 instanceof TLRPC.TL_secureFile) {
                            V0((TLRPC.TL_secureFile) secureFile2, 3);
                        }
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            V0((TLRPC.TL_secureFile) secureFile3, 1);
                        }
                        Y0(tL_secureValue.translation);
                    }
                    org.telegram.ui.Cells.x9 x9Var3 = new org.telegram.ui.Cells.x9(context);
                    org.telegram.ui.ActionBar.a7.V(x9Var3.getTextView(), org.telegram.ui.ActionBar.t6.f21153p7, null);
                    org.telegram.ui.Cells.y N06 = org.telegram.ui.ActionBar.t6.N0(true);
                    org.telegram.ui.ActionBar.w6 N11 = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f20929d6);
                    org.telegram.ui.ActionBar.w6 N12 = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f21020i6);
                    x9Var3.setBackground(N06);
                    org.telegram.ui.ActionBar.a7.k(x9Var3, N06, N11, N12, null);
                    if (this.F == null) {
                        x9Var3.b(org.telegram.messenger.cd.L0(2131747603, null), false);
                    } else {
                        x9Var3.b(org.telegram.messenger.cd.L0(2131747608, null), false);
                    }
                    this.f39264c0.addView(x9Var3, w7.b6.o(-1, -2));
                    x9Var3.setOnClickListener(new yj0(this, 1));
                    org.telegram.ui.Cells.b9 b9Var6 = this.f39292q0;
                    int i27 = org.telegram.ui.ActionBar.t6.f20892b7;
                    org.telegram.ui.ActionBar.a7.a0(b9Var6, context, 2131231230, i27);
                    org.telegram.ui.Cells.c7 c7Var2 = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                    this.f39283l0 = c7Var2;
                    org.telegram.ui.ActionBar.a7.a0(c7Var2, context, 2131231231, i27);
                    this.f39264c0.addView(this.f39283l0, w7.b6.o(-1, -2));
                } else {
                    org.telegram.ui.ActionBar.a7.a0(this.f39292q0, context, 2131231231, org.telegram.ui.ActionBar.t6.f20892b7);
                }
                T1();
                b1(false);
                return;
            }
        }
    }

    public final void i1(android.content.Context r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ll0.i1(android.content.Context):void");
    }

    public final void j1(Context context) {
        String str;
        String str2;
        TelephonyManager telephonyManager;
        ViewGroup frameLayout;
        this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131747504, null));
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
        String str3 = org.telegram.messenger.d20.i(this.currentAccount).f().phone;
        org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
        org.telegram.ui.ActionBar.a7.V(x9Var.getTextView(), org.telegram.ui.ActionBar.t6.q6, null);
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.t6.N0(true);
        int i10 = org.telegram.ui.ActionBar.t6.f20929d6;
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f21020i6);
        x9Var.setBackground(N0);
        org.telegram.ui.ActionBar.a7.k(x9Var, N0, N, N2, null);
        x9Var.b(org.telegram.messenger.cd.a0("PassportPhoneUseSame", null, 2131747500, af.b.c().b("+" + str3)), false);
        this.f39264c0.addView(x9Var, w7.b6.o(-1, -2));
        x9Var.setOnClickListener(new yj0(this, 16));
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
        this.f39286n0 = b9Var;
        org.telegram.ui.ActionBar.a7.a0(b9Var, context, 2131231231, org.telegram.ui.ActionBar.t6.f20892b7);
        this.f39286n0.setText(org.telegram.messenger.cd.L0(2131747498, null));
        this.f39264c0.addView(this.f39286n0, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context);
        this.f39279j0 = p4Var;
        p4Var.setText(org.telegram.messenger.cd.L0(2131747501, null));
        org.telegram.ui.ActionBar.a7.i(i10, this.f39279j0, null);
        this.f39264c0.addView(this.f39279j0, w7.b6.o(-1, -2));
        this.Y = new EditTextBoldCursor[3];
        for (int i11 = 0; i11 < 3; i11++) {
            if (i11 == 2) {
                this.Y[i11] = new org.telegram.ui.Components.n30(context);
            } else {
                this.Y[i11] = new EditTextBoldCursor(context);
            }
            if (i11 == 1) {
                frameLayout = org.telegram.messenger.m5.f(context, 0);
                this.f39264c0.addView(frameLayout, w7.b6.o(-1, 50));
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, frameLayout, null);
            } else if (i11 == 2) {
                frameLayout = (ViewGroup) this.Y[1].getParent();
            } else {
                frameLayout = new FrameLayout(context);
                this.f39264c0.addView(frameLayout, w7.b6.o(-1, 50));
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, frameLayout, null);
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
                this.Y[i11].setOnTouchListener(new zj0(this, 3));
                this.Y[i11].setText(org.telegram.messenger.cd.L0(2131752134, null));
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
                this.f39307w0 = textView;
                textView.setText("+");
                org.telegram.ui.ActionBar.a7.V(this.f39307w0, i12, null);
                this.f39307w0.setTextSize(1, 16.0f);
                frameLayout.addView(this.f39307w0, w7.b6.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                this.Y[i11].setPadding(org.telegram.messenger.i0.L(10.0f), 0, 0, 0);
                this.Y[i11].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                this.Y[i11].setGravity(19);
                frameLayout.addView(this.Y[i11], w7.b6.k(0.0f, 12.0f, 16.0f, 6.0f, 55, -2));
                this.Y[i11].addTextChangedListener(new uk0(this, 1));
            } else if (i11 == 2) {
                this.Y[i11].setPadding(0, 0, 0, 0);
                this.Y[i11].setGravity(19);
                this.Y[i11].setHintText(null);
                this.Y[i11].setHint(org.telegram.messenger.cd.L0(2131747388, null));
                frameLayout.addView(this.Y[i11], w7.b6.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                this.Y[i11].addTextChangedListener(new yr(this, 3));
            } else {
                this.Y[i11].setPadding(0, 0, 0, org.telegram.messenger.i0.L(6.0f));
                EditTextBoldCursor editTextBoldCursor3 = this.Y[i11];
                if (!org.telegram.messenger.cd.X) {
                    i13 = 3;
                }
                editTextBoldCursor3.setGravity(i13);
                frameLayout.addView(this.Y[i11], w7.b6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            }
            this.Y[i11].setOnEditorActionListener(new wj0(this, 0));
            if (i11 == 2) {
                this.Y[i11].setOnKeyListener(new mg(this, 1));
            }
            if (i11 == 0) {
                View view = new View(context);
                this.f39281k0.add(view);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d7, view, null);
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, 1, 83));
            }
        }
        try {
            telephonyManager = (TelephonyManager) org.telegram.messenger.w0.f19025b.getSystemService("phone");
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
        if (telephonyManager != null) {
            str = telephonyManager.getSimCountryIso().toUpperCase();
            if (str != null && (str2 = (String) this.Y0.get(str)) != null && this.U0.indexOf(str2) != -1) {
                this.Y[1].setText((CharSequence) this.V0.get(str2));
            }
            org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context);
            this.f39286n0 = b9Var2;
            org.telegram.ui.ActionBar.a7.a0(b9Var2, context, 2131231231, org.telegram.ui.ActionBar.t6.f20892b7);
            this.f39286n0.setText(org.telegram.messenger.cd.L0(2131747502, null));
            this.f39264c0.addView(this.f39286n0, w7.b6.o(-1, -2));
        }
        str = null;
        if (str != null) {
            this.Y[1].setText((CharSequence) this.V0.get(str2));
        }
        org.telegram.ui.Cells.b9 b9Var22 = new org.telegram.ui.Cells.b9(context);
        this.f39286n0 = b9Var22;
        org.telegram.ui.ActionBar.a7.a0(b9Var22, context, 2131231231, org.telegram.ui.ActionBar.t6.f20892b7);
        this.f39286n0.setText(org.telegram.messenger.cd.L0(2131747502, null));
        this.f39264c0.addView(this.f39286n0, w7.b6.o(-1, -2));
    }

    public final byte[] l1(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32 || bArr2 == null || bArr2.length != 32) {
            return null;
        }
        byte[] bArr3 = new byte[32];
        System.arraycopy(this.f39269e1, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(this.f39269e1, 32, bArr4, 0, 16);
        byte[] bArr5 = new byte[32];
        System.arraycopy(this.f39265c1, 0, bArr5, 0, 32);
        Utilities.b(bArr5, bArr3, bArr4, 0, 32, 0, 0);
        if (!c1(bArr5, null)) {
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

    public final void m1(final TLRPC.TL_secureRequiredType tL_secureRequiredType, final TLRPC.TL_secureRequiredType tL_secureRequiredType2, final ArrayList arrayList, final boolean z10, final xj0 xj0Var, final ak0 ak0Var, final boolean z11) {
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
                final ll0 ll0Var = ll0.this;
                final zk0 zk0Var = ak0Var;
                final boolean z12 = z11;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType3 = tL_secureRequiredType2;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                final boolean z13 = z10;
                final ArrayList arrayList2 = arrayList;
                final Runnable runnable = xj0Var;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        TLRPC.TL_secureData tL_secureData;
                        String str2;
                        LinearLayout linearLayout;
                        ll0 ll0Var2 = ll0.this;
                        TLRPC.TL_error tL_error2 = tL_error;
                        String str3 = null;
                        if (tL_error2 != null) {
                            zk0 zk0Var2 = zk0Var;
                            if (zk0Var2 != null) {
                                zk0Var2.d(tL_error2.text, null);
                            }
                            ll0Var2.P1(org.telegram.messenger.cd.L0(2131689472, null), tL_error2.text);
                            return;
                        }
                        boolean z14 = z12;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType3;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType4;
                        boolean z15 = z13;
                        if (z14) {
                            if (tL_secureRequiredType5 != null) {
                                ll0Var2.K1(tL_secureRequiredType5);
                            } else {
                                ll0Var2.K1(tL_secureRequiredType6);
                            }
                        } else {
                            if (z15) {
                                ll0Var2.K1(tL_secureRequiredType6);
                            }
                            ll0Var2.K1(tL_secureRequiredType5);
                        }
                        int i10 = 0;
                        if (ll0Var2.f39260b == 8) {
                            kl0 kl0Var = (kl0) ll0Var2.f39293q1.remove(tL_secureRequiredType6);
                            if (kl0Var != null) {
                                ll0Var2.f39264c0.removeView(kl0Var);
                                View childAt = ll0Var2.f39264c0.getChildAt(linearLayout.getChildCount() - 6);
                                if (childAt instanceof kl0) {
                                    ((kl0) childAt).setNeedDivider(false);
                                }
                            }
                            ll0Var2.U1();
                        } else {
                            ArrayList arrayList3 = arrayList2;
                            if (tL_secureRequiredType5 != null && arrayList3 != null && arrayList3.size() > 1) {
                                int size = arrayList3.size();
                                int i11 = 0;
                                while (true) {
                                    if (i11 < size) {
                                        TLRPC.TL_secureRequiredType tL_secureRequiredType7 = (TLRPC.TL_secureRequiredType) arrayList3.get(i11);
                                        TLRPC.TL_secureValue u12 = ll0Var2.u1(tL_secureRequiredType7, false);
                                        if (u12 != null) {
                                            TLRPC.TL_secureData tL_secureData2 = u12.data;
                                            if (tL_secureData2 != null) {
                                                str2 = ll0.k1(tL_secureData2.data, ll0Var2.l1(tL_secureData2.secret, tL_secureData2.data_hash), u12.data.data_hash);
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
                                ll0Var2.O1(tL_secureRequiredType6, null, null, tL_secureRequiredType5, str, z14, i10);
                            } else {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType8 = tL_secureRequiredType5;
                                String str4 = str;
                                TLRPC.TL_secureValue u13 = ll0Var2.u1(tL_secureRequiredType6, false);
                                if (u13 != null && (tL_secureData = u13.data) != null) {
                                    str3 = ll0.k1(tL_secureData.data, ll0Var2.l1(tL_secureData.secret, tL_secureData.data_hash), u13.data.data_hash);
                                }
                                if (arrayList3 != null) {
                                    i10 = arrayList3.size();
                                }
                                ll0Var2.O1(tL_secureRequiredType6, null, str3, tL_secureRequiredType8, str4, z14, i10);
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

    public final bh.d n1(byte[] bArr) {
        byte[] s12 = s1();
        int nextInt = Utilities.f14519b.nextInt(208) + 32;
        while ((bArr.length + nextInt) % 16 != 0) {
            nextInt++;
        }
        byte[] bArr2 = new byte[nextInt];
        Utilities.f14519b.nextBytes(bArr2);
        bArr2[0] = (byte) nextInt;
        int length = nextInt + bArr.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, nextInt);
        System.arraycopy(bArr, 0, bArr3, nextInt, bArr.length);
        byte[] o10 = Utilities.o(length, bArr3);
        byte[] r10 = Utilities.r(s12, o10);
        byte[] bArr4 = new byte[32];
        System.arraycopy(r10, 0, bArr4, 0, 32);
        byte[] bArr5 = new byte[16];
        System.arraycopy(r10, 32, bArr5, 0, 16);
        Utilities.b(bArr3, bArr4, bArr5, 0, length, 0, 1);
        byte[] bArr6 = new byte[32];
        System.arraycopy(this.f39269e1, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(this.f39269e1, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(this.f39265c1, 0, bArr8, 0, 32);
        Utilities.b(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        byte[] r11 = Utilities.r(bArr8, o10);
        byte[] bArr9 = new byte[32];
        System.arraycopy(r11, 0, bArr9, 0, 32);
        byte[] bArr10 = new byte[16];
        System.arraycopy(r11, 32, bArr10, 0, 16);
        byte[] bArr11 = new byte[32];
        System.arraycopy(s12, 0, bArr11, 0, 32);
        Utilities.b(bArr11, bArr9, bArr10, 0, 32, 0, 1);
        ?? obj = new Object();
        obj.f2779c = bArr3;
        obj.f2777a = bArr11;
        obj.d = o10;
        obj.f2778b = s12;
        obj.e = new org.telegram.messenger.qw(bArr4, bArr5);
        return obj;
    }

    public final void o1(Bundle bundle, TLRPC.TL_auth_sentCode tL_auth_sentCode, boolean z10) {
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
            N1(bundle, 2, z10);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", tL_auth_sentCode.type.pattern);
            N1(bundle, 1, z10);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSms) {
            bundle.putInt("type", 2);
            bundle.putInt("length", tL_auth_sentCode.type.length);
            N1(bundle, 0, z10);
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i11 == -1) {
            if (i10 != 0 && i10 != 2) {
                if (i10 == 1) {
                    if (intent != null && intent.getData() != null) {
                        ArrayList arrayList = new ArrayList();
                        ?? obj = new Object();
                        obj.f17513a = intent.getData();
                        arrayList.add(obj);
                        J1(arrayList);
                        return;
                    } else if (getParentActivity() != null) {
                        Toast.makeText(getParentActivity(), org.telegram.messenger.cd.L0(2131743858, null), 0).show();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            f1();
            org.telegram.ui.Components.bi biVar = this.R0;
            if (biVar != null) {
                biVar.a2.h0(i10, intent, this.Q0);
            }
            this.Q0 = null;
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i10 = this.f39260b;
        if (i10 == 7) {
            if (z10) {
                int i11 = this.I1;
                org.telegram.ui.Components.zu0[] zu0VarArr = this.J1;
                zu0VarArr[i11].c(true);
                for (org.telegram.ui.Components.zu0 zu0Var : zu0VarArr) {
                    if (zu0Var != null) {
                        zu0Var.f();
                    }
                }
            }
        } else if (i10 != 0 && i10 != 5) {
            if (i10 == 1 || i10 == 2) {
                return !a1(z10);
            }
        } else if (z10) {
            Z0(false);
        }
        return true;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        if (this.f39260b == 3 && dialog == this.L1) {
            ArrayList arrayList = this.M1;
            if (!arrayList.isEmpty()) {
                getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.U1);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.V1);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19665p0);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19677r0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.U1);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.V1);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19665p0);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19677r0);
        int i10 = 0;
        Z0(false);
        org.telegram.ui.Components.bi biVar = this.R0;
        if (biVar != null) {
            biVar.L();
            this.R0.i1();
        }
        if (this.f39260b == 7) {
            while (true) {
                org.telegram.ui.Components.zu0[] zu0VarArr = this.J1;
                if (i10 >= zu0VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.zu0 zu0Var = zu0VarArr[i10];
                if (zu0Var != null) {
                    zu0Var.f();
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
        int i11 = this.f39260b;
        if ((i11 == 1 || i11 == 2) && (biVar = this.R0) != null) {
            if (i10 == 17) {
                biVar.a2.V(false);
            } else if (i10 == 21) {
                if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String L0 = org.telegram.messenger.cd.L0(2131689472, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.R = L0;
                    x1Var.T = org.telegram.messenger.cd.L0(2131747328, null);
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747316, null), new ak0(this, 0));
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                    alertDialog$Builder.p();
                }
            } else if (i10 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                I1(0);
            } else if (i10 == 22 && iArr != null && iArr.length > 0 && iArr[0] == 0 && (x9Var = this.f39295r0) != null) {
                x9Var.callOnClick();
            }
        } else if (i11 == 3 && i10 == 6) {
            R1(false, this.E1, this.F1, this.G1, this.H1);
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
        if (this.f39260b == 5 && (viewGroupArr = this.Z) != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
            this.Y[0].requestFocus();
            org.telegram.messenger.i0.J3(this.Y[0]);
            org.telegram.messenger.i0.h3(new xj0(this, 0), 200L);
        }
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ll0.onThemeColorsChanged():void");
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (this.f39276h1 != null) {
            org.telegram.messenger.i0.g3(new xj0(this, 1));
        }
        int i10 = this.f39260b;
        if (i10 == 5) {
            if (z10) {
                if (this.Z[0].getVisibility() == 0) {
                    this.Y[0].requestFocus();
                    org.telegram.messenger.i0.J3(this.Y[0]);
                }
                if (this.N0 == 2) {
                    E1(false);
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
            f1();
        }
    }

    public final String p1() {
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
        if (this.f39258a0 != null) {
            int i11 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.f39258a0;
                if (i11 >= editTextBoldCursorArr2.length) {
                    break;
                }
                sb2.append((CharSequence) editTextBoldCursorArr2[i11].getText());
                sb2.append(",");
                i11++;
            }
        }
        ArrayList arrayList = this.f39278i1;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            sb2.append(((org.telegram.messenger.pw) arrayList.get(i12)).f17489b.f19930id);
        }
        org.telegram.messenger.pw pwVar = this.l1;
        if (pwVar != null) {
            sb2.append(pwVar.f17489b.f19930id);
        }
        org.telegram.messenger.pw pwVar2 = this.f39284m1;
        if (pwVar2 != null) {
            sb2.append(pwVar2.f17489b.f19930id);
        }
        org.telegram.messenger.pw pwVar3 = this.f39280j1;
        if (pwVar3 != null) {
            sb2.append(pwVar3.f17489b.f19930id);
        }
        ArrayList arrayList2 = this.f39282k1;
        int size2 = arrayList2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            sb2.append(((org.telegram.messenger.pw) arrayList2.get(i13)).f17489b.f19930id);
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

    public final TLRPC.TL_secureValue u1(TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z10) {
        String[] strArr;
        if (tL_secureRequiredType != null) {
            int size = this.D.values.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.TL_secureValue tL_secureValue = this.D.values.get(i10);
                if (tL_secureRequiredType.type.getClass() == tL_secureValue.type.getClass()) {
                    if (z10) {
                        if (!tL_secureRequiredType.selfie_required || (tL_secureValue.selfie instanceof TLRPC.TL_secureFile)) {
                            if (!tL_secureRequiredType.translation_required || !tL_secureValue.translation.isEmpty()) {
                                if (!w1(tL_secureRequiredType.type) || !tL_secureValue.files.isEmpty()) {
                                    if (!y1(tL_secureRequiredType.type) || (tL_secureValue.front_side instanceof TLRPC.TL_secureFile)) {
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
                                                    JSONObject jSONObject = new JSONObject(k1(tL_secureData.data, l1(tL_secureData.secret, tL_secureData.data_hash), tL_secureValue.data.data_hash));
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

    public final boolean v1(Class cls) {
        int size = this.D.values.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.D.values.get(i10).type.getClass() == cls) {
                return false;
            }
        }
        return true;
    }

    public final boolean x1() {
        String str = this.f39257a;
        if (str != null && !str.equals(p1())) {
            return false;
        }
        return true;
    }

    public final void z1() {
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ck0(this, 3)), this.classGuid);
    }

    public ll0(int i10, long j10, String str, String str2, String str3, String str4, String str5, TL_account.authorizationForm authorizationform, TL_account.Password password) {
        this(i10, authorizationform, password, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (HashMap) null, (HashMap) null);
        int i11;
        String r12;
        String str6;
        String str7;
        String str8;
        String str9;
        this.f39263c = j10;
        this.d = str3;
        this.e = str4;
        this.h = str;
        this.f39294r = str2;
        this.f39285n = str5;
        if (i10 != 0 || authorizationform.errors.isEmpty()) {
            return;
        }
        try {
            Collections.sort(authorizationform.errors, new rk0(this));
            int size = authorizationform.errors.size();
            int i12 = 0;
            while (i12 < size) {
                TLRPC.SecureValueError secureValueError = authorizationform.errors.get(i12);
                byte[] bArr = null;
                if (secureValueError instanceof TLRPC.TL_secureValueErrorFrontSide) {
                    TLRPC.TL_secureValueErrorFrontSide tL_secureValueErrorFrontSide = (TLRPC.TL_secureValueErrorFrontSide) secureValueError;
                    r12 = r1(tL_secureValueErrorFrontSide.type);
                    str6 = tL_secureValueErrorFrontSide.text;
                    bArr = tL_secureValueErrorFrontSide.file_hash;
                    str7 = null;
                    str8 = "front";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorReverseSide) {
                    TLRPC.TL_secureValueErrorReverseSide tL_secureValueErrorReverseSide = (TLRPC.TL_secureValueErrorReverseSide) secureValueError;
                    r12 = r1(tL_secureValueErrorReverseSide.type);
                    str6 = tL_secureValueErrorReverseSide.text;
                    bArr = tL_secureValueErrorReverseSide.file_hash;
                    str7 = null;
                    str8 = "reverse";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorSelfie) {
                    TLRPC.TL_secureValueErrorSelfie tL_secureValueErrorSelfie = (TLRPC.TL_secureValueErrorSelfie) secureValueError;
                    r12 = r1(tL_secureValueErrorSelfie.type);
                    str6 = tL_secureValueErrorSelfie.text;
                    bArr = tL_secureValueErrorSelfie.file_hash;
                    str7 = null;
                    str8 = "selfie";
                } else {
                    if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFile) {
                        TLRPC.TL_secureValueErrorTranslationFile tL_secureValueErrorTranslationFile = (TLRPC.TL_secureValueErrorTranslationFile) secureValueError;
                        r12 = r1(tL_secureValueErrorTranslationFile.type);
                        str6 = tL_secureValueErrorTranslationFile.text;
                        bArr = tL_secureValueErrorTranslationFile.file_hash;
                        str7 = null;
                    } else if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFiles) {
                        TLRPC.TL_secureValueErrorTranslationFiles tL_secureValueErrorTranslationFiles = (TLRPC.TL_secureValueErrorTranslationFiles) secureValueError;
                        r12 = r1(tL_secureValueErrorTranslationFiles.type);
                        str6 = tL_secureValueErrorTranslationFiles.text;
                        str7 = null;
                    } else {
                        if (secureValueError instanceof TLRPC.TL_secureValueErrorFile) {
                            TLRPC.TL_secureValueErrorFile tL_secureValueErrorFile = (TLRPC.TL_secureValueErrorFile) secureValueError;
                            r12 = r1(tL_secureValueErrorFile.type);
                            str6 = tL_secureValueErrorFile.text;
                            bArr = tL_secureValueErrorFile.file_hash;
                            str7 = null;
                        } else if (secureValueError instanceof TLRPC.TL_secureValueErrorFiles) {
                            TLRPC.TL_secureValueErrorFiles tL_secureValueErrorFiles = (TLRPC.TL_secureValueErrorFiles) secureValueError;
                            r12 = r1(tL_secureValueErrorFiles.type);
                            str6 = tL_secureValueErrorFiles.text;
                            str7 = null;
                        } else if (secureValueError instanceof TLRPC.TL_secureValueError) {
                            TLRPC.TL_secureValueError tL_secureValueError = (TLRPC.TL_secureValueError) secureValueError;
                            r12 = r1(tL_secureValueError.type);
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
                                        r12 = r1(tL_secureValueErrorData.type);
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
                HashMap hashMap = (HashMap) this.f39303u1.get(r12);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    i11 = size;
                    this.f39303u1.put(r12, hashMap);
                    this.f39305v1.put(r12, str6);
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
