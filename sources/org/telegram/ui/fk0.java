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
public final class fk0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public org.telegram.ui.Cells.y6 A0;
    public String A1;
    public LinearLayout B0;
    public String B1;
    public ImageView C0;
    public wj0 C1;
    public TextView D0;
    public boolean D1;
    public TL_account.authorizationForm E;
    public TextView E0;
    public final gj0 E1;
    public final TLRPC.TL_secureRequiredType F;
    public TextView F0;
    public String F1;
    public TLRPC.TL_secureRequiredType G;
    public org.telegram.ui.Components.sy G0;
    public Runnable G1;
    public ArrayList H;
    public org.telegram.ui.Cells.z8 H0;
    public uj0 H1;
    public final TLRPC.TL_secureValue I;
    public org.telegram.ui.Cells.z8 I0;
    public wj0 I1;
    public final TLRPC.TL_secureValue J;
    public ImageView J0;
    public int J1;
    public TL_account.Password K;
    public TextView K0;
    public final org.telegram.ui.Components.hu0[] K1;
    public TLRPC.TL_auth_sentCode L;
    public TextView L0;
    public org.telegram.ui.ActionBar.t1 L1;
    public org.telegram.ui.ActionBar.q0 M;
    public FrameLayout M0;
    public Dialog M1;
    public AnimatorSet N;
    public TextView N0;
    public final ArrayList N1;
    public org.telegram.ui.Components.nq O;
    public int O0;
    public int O1;
    public TextView P;
    public final byte[] P0;
    public int P1;
    public org.telegram.ui.Components.nq Q;
    public final byte[] Q0;
    public int Q1;
    public FrameLayout R;
    public String R0;
    public org.telegram.ui.Cells.w9 S;
    public org.telegram.ui.Components.ti S0;
    public View T;
    public int T0;
    public View U;
    public int U0;
    public org.telegram.ui.Cells.y8 V;
    public final ArrayList V0;
    public org.telegram.ui.Cells.y8 W;
    public final HashMap W0;
    public org.telegram.ui.Cells.y8 X;
    public final HashMap X0;
    public org.telegram.ui.Cells.w9 Y;
    public final HashMap Y0;
    public EditTextBoldCursor[] Z;
    public HashMap Z0;
    public String f47851a;
    public ViewGroup[] f47852a0;
    public boolean f47853a1;
    public final int f47854b;
    public EditTextBoldCursor[] f47855b0;
    public boolean f47856b1;
    public long f47857c;
    public ScrollView f47858c0;
    public long f47859c1;
    public final String d;
    public LinearLayout f47860d0;
    public byte[] f47861d1;
    public final String f47862e;
    public LinearLayout f47863e0;
    public String f47864e1;
    public boolean f47865f;
    public LinearLayout f47866f0;
    public byte[] f47867f1;
    public LinearLayout f47868g0;
    public boolean f47869g1;
    public final String h;
    public LinearLayout f47870h0;
    public boolean f47871h1;
    public LinearLayout f47872i0;
    public fk0 f47873i1;
    public LinearLayout f47874j0;
    public final ArrayList f47875j1;
    public org.telegram.ui.Cells.o4 f47876k0;
    public org.telegram.messenger.yv f47877k1;
    public final ArrayList f47878l0;
    public final ArrayList l1;
    public org.telegram.ui.Cells.y6 m0;
    public org.telegram.messenger.yv f47879m1;
    public final String f47880n;
    public org.telegram.ui.Cells.y6 f47881n0;
    public org.telegram.messenger.yv n1;
    public org.telegram.ui.Cells.z8 f47882o0;
    public final HashMap f47883o1;
    public org.telegram.ui.Cells.z8 f47884p0;
    public final HashMap f47885p1;
    public org.telegram.ui.Cells.z8 f47886q0;
    public final HashMap f47887q1;
    public final String f47888r;
    public org.telegram.ui.Cells.z8 f47889r0;
    public final HashMap f47890r1;
    public String f47891s;
    public org.telegram.ui.Cells.w9 f47892s0;
    public final HashMap f47893s1;
    public int f47894t0;
    public final HashMap f47895t1;
    public final boolean[] f47896u0;
    public final HashMap f47897u1;
    public boolean f47898v0;
    public final HashMap f47899v1;
    public String f47900w;
    public boolean f47901w0;
    public final HashMap f47902w1;
    public String f47903x;
    public TextView f47904x0;
    public HashMap f47905x1;
    public final int[] f47906y;
    public org.telegram.ui.Cells.w9 f47907y0;
    public HashMap f47908y1;
    public org.telegram.ui.Cells.w9 f47909z0;
    public final HashMap f47910z1;

    public fk0(int i7, TL_account.authorizationForm authorizationform, TL_account.Password password, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureValue tL_secureValue, TLRPC.TL_secureRequiredType tL_secureRequiredType2, TLRPC.TL_secureValue tL_secureValue2, HashMap hashMap, HashMap hashMap2) {
        super(null);
        this.f47891s = "";
        this.f47900w = "";
        this.f47906y = new int[3];
        this.f47878l0 = new ArrayList();
        this.f47896u0 = new boolean[3];
        this.f47898v0 = true;
        this.V0 = new ArrayList();
        this.W0 = new HashMap();
        this.X0 = new HashMap();
        this.Y0 = new HashMap();
        this.f47875j1 = new ArrayList();
        this.l1 = new ArrayList();
        this.f47883o1 = new HashMap();
        this.f47885p1 = new HashMap();
        this.f47887q1 = new HashMap();
        this.f47890r1 = new HashMap();
        this.f47893s1 = new HashMap();
        this.f47899v1 = new HashMap();
        this.f47902w1 = new HashMap();
        this.f47910z1 = new HashMap();
        this.E1 = new gj0(this);
        this.f47854b = i7;
        this.E = authorizationform;
        this.F = tL_secureRequiredType;
        if (tL_secureRequiredType != null) {
            this.f47898v0 = tL_secureRequiredType.native_names;
        }
        this.I = tL_secureValue;
        this.G = tL_secureRequiredType2;
        this.J = tL_secureValue2;
        this.K = password;
        this.f47895t1 = hashMap;
        this.f47897u1 = hashMap2;
        if (i7 == 3) {
            this.N1 = new ArrayList();
        } else if (i7 == 7) {
            this.K1 = new org.telegram.ui.Components.hu0[3];
        }
        if (hashMap == null) {
            this.f47895t1 = new HashMap();
        }
        if (hashMap2 == null) {
            this.f47897u1 = new HashMap();
        }
        if (i7 == 5) {
            if (org.telegram.messenger.i10.i(this.currentAccount).f24654k0 != null && org.telegram.messenger.i10.i(this.currentAccount).f24655l0 != null) {
                this.O0 = 1;
                this.P0 = org.telegram.messenger.i10.i(this.currentAccount).f24654k0;
                this.Q0 = org.telegram.messenger.i10.i(this.currentAccount).f24655l0;
            }
            TL_account.Password password2 = this.K;
            if (password2 == null) {
                A1();
            } else {
                TwoStepVerificationActivity.r0(password2);
                if (this.O0 == 1) {
                    F1(true);
                }
            }
            if (org.telegram.messenger.bz.f23296j0 != null) {
                return;
            }
            TLRPC.TL_help_getPassportConfig tL_help_getPassportConfig = new TLRPC.TL_help_getPassportConfig();
            tL_help_getPassportConfig.hash = org.telegram.messenger.bz.f23299k0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_help_getPassportConfig, new fi.l5(24));
        }
    }

    public static int G0(fk0 fk0Var, String str) {
        fk0Var.getClass();
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

    public static boolean H0(org.telegram.ui.fk0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fk0.H0(org.telegram.ui.fk0):boolean");
    }

    public static int M0(fk0 fk0Var) {
        return fk0Var.currentAccount;
    }

    public static void N0(fk0 fk0Var, EditTextBoldCursor editTextBoldCursor, String str, Editable editable, boolean z10) {
        String str2;
        String str3;
        String str4;
        String str5;
        HashMap hashMap = fk0Var.f47910z1;
        if (hashMap != null && (str3 = (String) hashMap.get(str)) != null) {
            if (TextUtils.equals(str3, editable)) {
                HashMap hashMap2 = fk0Var.f47905x1;
                if (hashMap2 != null && (str5 = (String) hashMap2.get(str)) != null) {
                    editTextBoldCursor.setErrorText(str5);
                } else {
                    HashMap hashMap3 = fk0Var.f47908y1;
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
            fk0Var.e1(false);
        }
    }

    public static void Q0(fk0 fk0Var, int i7) {
        fk0Var.currentAccount = i7;
    }

    public static int R0(fk0 fk0Var) {
        return fk0Var.currentAccount;
    }

    public static void T1(EditTextBoldCursor[] editTextBoldCursorArr, boolean z10, boolean z11) {
        if (editTextBoldCursorArr != null) {
            for (EditTextBoldCursor editTextBoldCursor : editTextBoldCursorArr) {
                if (editTextBoldCursor != null) {
                    org.telegram.ui.ActionBar.u6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.n6.G6, null);
                    if (z10) {
                        org.telegram.ui.ActionBar.u6.l(editTextBoldCursor, 34, org.telegram.ui.ActionBar.n6.H6, null);
                        org.telegram.ui.ActionBar.u6.l(editTextBoldCursor, 35, org.telegram.ui.ActionBar.n6.L6, null);
                        if (z11) {
                            int paddingLeft = editTextBoldCursor.getPaddingLeft();
                            int paddingTop = editTextBoldCursor.getPaddingTop();
                            int paddingRight = editTextBoldCursor.getPaddingRight();
                            int paddingBottom = editTextBoldCursor.getPaddingBottom();
                            org.telegram.ui.ActionBar.u6.F(editTextBoldCursor, org.telegram.ui.ActionBar.n6.f29580k6, org.telegram.ui.ActionBar.n6.f29598l6, org.telegram.ui.ActionBar.n6.f29672p7, null);
                            if (editTextBoldCursor.getPaddingLeft() != paddingLeft || editTextBoldCursor.getPaddingTop() != paddingTop || editTextBoldCursor.getPaddingRight() != paddingRight || editTextBoldCursor.getPaddingBottom() != paddingBottom) {
                                editTextBoldCursor.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void Z(fk0 fk0Var, TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery) {
        TL_account.Password password = fk0Var.K;
        password.email_unconfirmed_pattern = tL_auth_passwordRecovery.email_pattern;
        fk0Var.presentFragment(new za1(fk0Var.currentAccount, 4, password));
    }

    public static void a0(fk0 fk0Var) {
        ArrayList arrayList;
        int i7;
        int i10;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        HashMap hashMap = fk0Var.f47893s1;
        HashMap hashMap2 = fk0Var.f47890r1;
        String str = fk0Var.f47888r;
        ArrayList arrayList2 = new ArrayList();
        int size = fk0Var.E.required_types.size();
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.SecureRequiredType secureRequiredType = fk0Var.E.required_types.get(i11);
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
                                        if (fk0Var.v1(tL_secureRequiredType5, true) != null) {
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
            TLRPC.TL_secureValue v12 = fk0Var.v1(tL_secureRequiredType, true);
            if (v12 == null) {
                Vibrator vibrator = (Vibrator) fk0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                ek0 ek0Var = (ek0) hashMap2.get(tL_secureRequiredType);
                if (ek0Var == null && (tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    ek0Var = (ek0) hashMap2.get(tL_secureRequiredType2);
                }
                org.telegram.messenger.g0.D3(ek0Var);
                return;
            }
            HashMap hashMap3 = (HashMap) fk0Var.f47899v1.get(s1(tL_secureRequiredType.type));
            if (hashMap3 != null && !hashMap3.isEmpty()) {
                Vibrator vibrator2 = (Vibrator) fk0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                ek0 ek0Var2 = (ek0) hashMap2.get(tL_secureRequiredType);
                if (ek0Var2 == null && (tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    ek0Var2 = (ek0) hashMap2.get(tL_secureRequiredType3);
                }
                org.telegram.messenger.g0.D3(ek0Var2);
                return;
            }
            boolean z10 = tL_secureRequiredType.selfie_required;
            boolean z11 = tL_secureRequiredType.translation_required;
            ?? obj = new Object();
            obj.f48564a = v12;
            obj.f48565b = z10;
            obj.f48566c = z11;
            arrayList2.add(obj);
        }
        fk0Var.R1(false, true);
        TL_account.acceptAuthorization acceptauthorization = new TL_account.acceptAuthorization();
        acceptauthorization.bot_id = fk0Var.f47857c;
        acceptauthorization.scope = fk0Var.h;
        acceptauthorization.public_key = str;
        JSONObject jSONObject = new JSONObject();
        int size3 = arrayList2.size();
        int i13 = 0;
        while (i13 < size3) {
            hj0 hj0Var = (hj0) arrayList2.get(i13);
            TLRPC.TL_secureValue tL_secureValue = hj0Var.f48564a;
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
                        byte[] m12 = fk0Var.m1(tL_secureData.secret, tL_secureData.data_hash);
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
                                    byte[] m13 = fk0Var.m1(tL_secureFile.secret, tL_secureFile.file_hash);
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
                        byte[] m14 = fk0Var.m1(tL_secureFile2.secret, tL_secureFile2.file_hash);
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("file_hash", Base64.encodeToString(tL_secureFile2.file_hash, 2));
                        jSONObject5.put("secret", Base64.encodeToString(m14, 2));
                        jSONObject3.put("front_side", jSONObject5);
                    }
                    TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile2;
                        byte[] m15 = fk0Var.m1(tL_secureFile3.secret, tL_secureFile3.file_hash);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("file_hash", Base64.encodeToString(tL_secureFile3.file_hash, 2));
                        jSONObject6.put("secret", Base64.encodeToString(m15, 2));
                        jSONObject3.put("reverse_side", jSONObject6);
                    }
                    if (hj0Var.f48565b) {
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile3;
                            byte[] m16 = fk0Var.m1(tL_secureFile4.secret, tL_secureFile4.file_hash);
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("file_hash", Base64.encodeToString(tL_secureFile4.file_hash, 2));
                            jSONObject7.put("secret", Base64.encodeToString(m16, 2));
                            jSONObject3.put("selfie", jSONObject7);
                        }
                    }
                    if (hj0Var.f48566c && !tL_secureValue.translation.isEmpty()) {
                        JSONArray jSONArray2 = new JSONArray();
                        int size5 = tL_secureValue.translation.size();
                        for (int i15 = 0; i15 < size5; i15++) {
                            TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) tL_secureValue.translation.get(i15);
                            byte[] m17 = fk0Var.m1(tL_secureFile5.secret, tL_secureFile5.file_hash);
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
        Object obj2 = fk0Var.d;
        if (obj2 != null) {
            try {
                jSONObject9.put("payload", obj2);
            } catch (Exception unused6) {
            }
        }
        Object obj3 = fk0Var.f47862e;
        if (obj3 != null) {
            try {
                jSONObject9.put("nonce", obj3);
            } catch (Exception unused7) {
            }
        }
        a8.r7 o12 = fk0Var.o1(org.telegram.messenger.g0.h1(jSONObject9.toString()));
        TLRPC.TL_secureCredentialsEncrypted tL_secureCredentialsEncrypted = new TLRPC.TL_secureCredentialsEncrypted();
        acceptauthorization.credentials = tL_secureCredentialsEncrypted;
        tL_secureCredentialsEncrypted.hash = (byte[]) o12.f618e;
        tL_secureCredentialsEncrypted.data = (byte[]) o12.d;
        try {
            String replace = str.replaceAll("\\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "");
            Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA1AndMGF1Padding");
            cipher.init(1, (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(replace, 0))));
            acceptauthorization.credentials.secret = cipher.doFinal((byte[]) o12.f617c);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ConnectionsManager.getInstance(fk0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(fk0Var.currentAccount).sendRequest(acceptauthorization, new wi0(fk0Var, 1)), fk0Var.classGuid);
    }

    public static void b0(fk0 fk0Var, TLRPC.TL_error tL_error, String str, wj0 wj0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        if (tL_error == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("phone", str);
            fk0 fk0Var2 = new fk0(7, fk0Var.E, fk0Var.K, fk0Var.F, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
            fk0Var2.currentAccount = fk0Var.currentAccount;
            fk0Var2.f47867f1 = fk0Var.f47867f1;
            fk0Var2.f47861d1 = fk0Var.f47861d1;
            fk0Var2.C1 = wj0Var;
            fk0Var2.L = (TLRPC.TL_auth_sentCode) tLObject;
            fk0Var.presentFragment(fk0Var2, true);
            return;
        }
        org.telegram.ui.Components.b5.c0(fk0Var.currentAccount, tL_error, fk0Var, sendverifyphonecode, str);
    }

    public static void c0(fk0 fk0Var, org.telegram.messenger.yv yvVar, int i7) {
        String str = yvVar.f28289c;
        HashMap hashMap = fk0Var.f47883o1;
        int i10 = fk0Var.T0;
        if (i10 == 1) {
            org.telegram.messenger.yv yvVar2 = fk0Var.f47877k1;
            if (yvVar2 != null) {
                dk0 dk0Var = (dk0) hashMap.remove(yvVar2);
                if (dk0Var != null) {
                    fk0Var.f47870h0.removeView(dk0Var);
                }
                fk0Var.f47877k1 = null;
            }
        } else if (i10 == 4) {
            if (fk0Var.l1.size() >= 20) {
                return;
            }
        } else if (i10 == 2) {
            org.telegram.messenger.yv yvVar3 = fk0Var.f47879m1;
            if (yvVar3 != null) {
                dk0 dk0Var2 = (dk0) hashMap.remove(yvVar3);
                if (dk0Var2 != null) {
                    fk0Var.f47866f0.removeView(dk0Var2);
                }
                fk0Var.f47879m1 = null;
            }
        } else if (i10 == 3) {
            org.telegram.messenger.yv yvVar4 = fk0Var.n1;
            if (yvVar4 != null) {
                dk0 dk0Var3 = (dk0) hashMap.remove(yvVar4);
                if (dk0Var3 != null) {
                    fk0Var.f47868g0.removeView(dk0Var3);
                }
                fk0Var.n1 = null;
            }
        } else if (i10 == 0 && fk0Var.f47875j1.size() >= 20) {
            return;
        }
        fk0Var.f47885p1.put(str, yvVar);
        fk0Var.M.setEnabled(false);
        fk0Var.M.setAlpha(0.5f);
        org.telegram.messenger.w7.G(fk0Var.currentAccount).h0(false, 16777216, str, true);
        fk0Var.V0(yvVar, i7);
        fk0Var.X1(i7);
    }

    public static void d0(org.telegram.ui.fk0 r9, boolean r10, java.lang.String r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fk0.d0(org.telegram.ui.fk0, boolean, java.lang.String):void");
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

    public static void e0(int i7, String str, org.telegram.messenger.yv yvVar, dk0 dk0Var, fk0 fk0Var) {
        String str2 = yvVar.f28289c;
        HashMap hashMap = fk0Var.f47885p1;
        fk0Var.f47883o1.remove(yvVar);
        if (i7 == 1) {
            fk0Var.f47877k1 = null;
            fk0Var.f47870h0.removeView(dk0Var);
        } else if (i7 == 4) {
            fk0Var.l1.remove(yvVar);
            fk0Var.f47872i0.removeView(dk0Var);
        } else if (i7 == 2) {
            fk0Var.f47879m1 = null;
            fk0Var.f47866f0.removeView(dk0Var);
        } else if (i7 == 3) {
            fk0Var.n1 = null;
            fk0Var.f47868g0.removeView(dk0Var);
        } else {
            fk0Var.f47875j1.remove(yvVar);
            fk0Var.f47863e0.removeView(dk0Var);
        }
        if (str != null) {
            HashMap hashMap2 = fk0Var.f47908y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
            HashMap hashMap3 = fk0Var.f47910z1;
            if (hashMap3 != null) {
                hashMap3.remove(str);
            }
        }
        fk0Var.X1(i7);
        if (str2 != null && hashMap.remove(str2) != null) {
            if (hashMap.isEmpty()) {
                fk0Var.M.setEnabled(true);
                fk0Var.M.setAlpha(1.0f);
            }
            org.telegram.messenger.w7.G(fk0Var.currentAccount).b(str2, false);
        }
    }

    public static void f0(fk0 fk0Var) {
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        for (int i7 = 0; i7 < fk0Var.E.values.size(); i7++) {
            deletesecurevalue.types.add(fk0Var.E.values.get(i7).type);
        }
        fk0Var.C1();
        ConnectionsManager.getInstance(fk0Var.currentAccount).sendRequest(deletesecurevalue, new wi0(fk0Var, 2));
    }

    public static void g0(fk0 fk0Var) {
        za1 za1Var = new za1(fk0Var.currentAccount, 0, fk0Var.K);
        za1Var.Z = true;
        fk0Var.presentFragment(za1Var);
    }

    public static void h0(fk0 fk0Var) {
        if (fk0Var.K.has_recovery) {
            fk0Var.C1();
            ConnectionsManager.getInstance(fk0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(fk0Var.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new wi0(fk0Var, 0), 10), fk0Var.classGuid);
        } else if (fk0Var.getParentActivity() == null) {
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fk0Var.getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131745874, null), new vi0(fk0Var, 4));
            String N0 = org.telegram.messenger.gd.N0(2131745875, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.gd.N0(2131745877, null);
            fk0Var.showDialog(t1Var);
        }
    }

    public static void i0(fk0 fk0Var) {
        Activity parentActivity = fk0Var.getParentActivity();
        vf.c.t(parentActivity, "https://telegram.org/deactivate?phone=" + org.telegram.messenger.i10.i(fk0Var.currentAccount).d());
    }

    public static int j0(fk0 fk0Var) {
        return fk0Var.currentAccount;
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

    public static int m0(fk0 fk0Var) {
        return fk0Var.currentAccount;
    }

    public static int n0(fk0 fk0Var) {
        return fk0Var.currentAccount;
    }

    public static String r1(org.telegram.messenger.yv yvVar) {
        byte[] bArr;
        if (yvVar != null) {
            TLRPC.TL_secureFile tL_secureFile = yvVar.f28288b;
            if (tL_secureFile != null && (bArr = tL_secureFile.file_hash) != null) {
                return Base64.encodeToString(bArr, 2);
            }
            byte[] bArr2 = yvVar.f28291f;
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
        Utilities.f22875b.nextBytes(bArr);
        int i7 = 0;
        for (int i10 = 0; i10 < 32; i10++) {
            i7 += 255 & bArr[i10];
        }
        int i11 = i7 % 255;
        if (i11 != 239) {
            int nextInt = Utilities.f22875b.nextInt(32);
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
            return org.telegram.messenger.gd.N0(2131754675, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
            return org.telegram.messenger.gd.N0(2131754680, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
            return org.telegram.messenger.gd.N0(2131754677, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
            return org.telegram.messenger.gd.N0(2131754670, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
            return org.telegram.messenger.gd.N0(2131754681, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
            return org.telegram.messenger.gd.N0(2131754672, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
            return org.telegram.messenger.gd.N0(2131754676, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
            return org.telegram.messenger.gd.N0(2131754674, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
            return org.telegram.messenger.gd.N0(2131754671, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
            return org.telegram.messenger.gd.N0(2131754673, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
            return org.telegram.messenger.gd.N0(2131754679, null);
        }
        return "";
    }

    public static boolean x1(TLRPC.SecureValueType secureValueType) {
        if (!(secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) && !(secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) && !(secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) && !(secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) && !(secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement)) {
            return false;
        }
        return true;
    }

    public static int z0(fk0 fk0Var) {
        return fk0Var.currentAccount;
    }

    public static boolean z1(TLRPC.SecureValueType secureValueType) {
        if (!(secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) && !(secureValueType instanceof TLRPC.TL_secureValueTypePassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
            return false;
        }
        return true;
    }

    public final void A1() {
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new wi0(this, 3)), this.classGuid);
    }

    public final void B1() {
        org.telegram.ui.ActionBar.t1 t1Var = this.L1;
        if (t1Var == null) {
            return;
        }
        try {
            t1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.L1 = null;
    }

    public final void C1() {
        if (getParentActivity() != null && !getParentActivity().isFinishing() && this.L1 == null) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
            this.L1 = t1Var;
            t1Var.f30091j0 = false;
            t1Var.show();
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
        org.telegram.messenger.g0.D3(view);
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
            this.Z[0].setText("");
        }
        org.telegram.messenger.g0.D3(this.Z[0]);
    }

    public final void F1(boolean z10) {
        String obj;
        if (z10) {
            obj = null;
        } else {
            obj = this.Z[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                E1(false);
                return;
            }
            R1(true, true);
        }
        Utilities.f22877e.c(new a80(this, z10, obj, 2));
    }

    public final void G1() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (w1(TLRPC.TL_secureValueTypePhone.class)) {
            arrayList.add(org.telegram.messenger.gd.N0(2131754673, null));
            arrayList2.add(TLRPC.TL_secureValueTypePhone.class);
        }
        if (w1(TLRPC.TL_secureValueTypeEmail.class)) {
            arrayList.add(org.telegram.messenger.gd.N0(2131754679, null));
            arrayList2.add(TLRPC.TL_secureValueTypeEmail.class);
        }
        if (w1(TLRPC.TL_secureValueTypePersonalDetails.class)) {
            arrayList.add(org.telegram.messenger.gd.N0(2131754678, null));
            arrayList2.add(TLRPC.TL_secureValueTypePersonalDetails.class);
        }
        if (w1(TLRPC.TL_secureValueTypePassport.class)) {
            arrayList.add(org.telegram.messenger.gd.N0(2131754675, null));
            arrayList2.add(TLRPC.TL_secureValueTypePassport.class);
        }
        if (w1(TLRPC.TL_secureValueTypeInternalPassport.class)) {
            arrayList.add(org.telegram.messenger.gd.N0(2131754676, null));
            arrayList2.add(TLRPC.TL_secureValueTypeInternalPassport.class);
        }
        if (w1(TLRPC.TL_secureValueTypePassportRegistration.class)) {
            arrayList.add(org.telegram.messenger.gd.N0(2131754674, null));
            arrayList2.add(TLRPC.TL_secureValueTypePassportRegistration.class);
        }
        if (w1(TLRPC.TL_secureValueTypeTemporaryRegistration.class)) {
            arrayList.add(org.telegram.messenger.gd.N0(2131754671, null));
            arrayList2.add(TLRPC.TL_secureValueTypeTemporaryRegistration.class);
        }
        if (w1(TLRPC.TL_secureValueTypeIdentityCard.class)) {
            arrayList.add(org.telegram.messenger.gd.N0(2131754677, null));
            arrayList2.add(TLRPC.TL_secureValueTypeIdentityCard.class);
        }
        if (w1(TLRPC.TL_secureValueTypeDriverLicense.class)) {
            arrayList.add(org.telegram.messenger.gd.N0(2131754680, null));
            arrayList2.add(TLRPC.TL_secureValueTypeDriverLicense.class);
        }
        if (w1(TLRPC.TL_secureValueTypeAddress.class)) {
            arrayList.add(org.telegram.messenger.gd.N0(2131754682, null));
            arrayList2.add(TLRPC.TL_secureValueTypeAddress.class);
        }
        if (w1(TLRPC.TL_secureValueTypeUtilityBill.class)) {
            arrayList.add(org.telegram.messenger.gd.N0(2131754670, null));
            arrayList2.add(TLRPC.TL_secureValueTypeUtilityBill.class);
        }
        if (w1(TLRPC.TL_secureValueTypeBankStatement.class)) {
            arrayList.add(org.telegram.messenger.gd.N0(2131754681, null));
            arrayList2.add(TLRPC.TL_secureValueTypeBankStatement.class);
        }
        if (w1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            arrayList.add(org.telegram.messenger.gd.N0(2131754672, null));
            arrayList2.add(TLRPC.TL_secureValueTypeRentalAgreement.class);
        }
        if (getParentActivity() != null && !arrayList.isEmpty()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String N0 = org.telegram.messenger.gd.N0(2131747302, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            alertDialog$Builder.f((CharSequence[]) arrayList.toArray(new CharSequence[0]), new og.j(9, this, arrayList2));
            showDialog(t1Var);
        }
    }

    public final void H1() {
        boolean z10;
        int size;
        if (getParentActivity() == null) {
            return;
        }
        int i7 = this.T0;
        ArrayList arrayList = this.f47875j1;
        int i10 = 1;
        if (i7 == 0 && arrayList.size() >= 20) {
            Q1(org.telegram.messenger.gd.N0(2131689472, null), org.telegram.messenger.gd.a0("PassportUploadMaxReached", null, 2131747257, org.telegram.messenger.gd.G(20, "Files", new Object[0])));
            return;
        }
        g1();
        org.telegram.ui.Components.ti tiVar = this.S0;
        int i11 = this.T0;
        if (i11 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        tiVar.S3 = z10;
        if (i11 == 0) {
            size = arrayList.size();
        } else {
            if (i11 == 4) {
                size = this.l1.size();
            }
            tiVar.z1(i10, false);
            this.S0.f39967e2.i0();
            this.S0.f1();
            showDialog(this.S0);
        }
        i10 = 20 - size;
        tiVar.z1(i10, false);
        this.S0.f39967e2.i0();
        this.S0.f1();
        showDialog(this.S0);
    }

    public final void I1(TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, boolean z10) {
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
            HashMap hashMap4 = this.f47899v1;
            if (!z10) {
                hashMap = (HashMap) hashMap4.get(s1(secureValueType2));
            } else {
                hashMap = null;
            }
            HashMap hashMap5 = (HashMap) hashMap4.get(s1(secureValueType));
            TLRPC.TL_secureValue v12 = v1(tL_secureRequiredType, false);
            TLRPC.TL_secureValue v13 = v1(tL_secureRequiredType2, false);
            HashMap hashMap6 = hashMap;
            TL_account.authorizationForm authorizationform = this.E;
            int i11 = i10;
            TL_account.Password password = this.K;
            HashMap hashMap7 = this.f47887q1;
            HashMap hashMap8 = (HashMap) hashMap7.get(tL_secureRequiredType);
            if (tL_secureRequiredType2 != null) {
                hashMap2 = hashMap5;
                hashMap3 = (HashMap) hashMap7.get(tL_secureRequiredType2);
            } else {
                hashMap2 = hashMap5;
                hashMap3 = null;
            }
            fk0 fk0Var = new fk0(i11, authorizationform, password, tL_secureRequiredType, v12, tL_secureRequiredType2, v13, hashMap8, hashMap3);
            fk0Var.C1 = new kj0(this, secureValueType2, z10, i7);
            fk0Var.currentAccount = this.currentAccount;
            fk0Var.f47867f1 = this.f47867f1;
            fk0Var.f47861d1 = this.f47861d1;
            fk0Var.f47857c = this.f47857c;
            fk0Var.f47905x1 = hashMap6;
            fk0Var.f47901w0 = z10;
            fk0Var.f47908y1 = hashMap2;
            fk0Var.H = arrayList;
            if (i11 == 4) {
                fk0Var.f47864e1 = this.f47864e1;
            }
            presentFragment(fk0Var);
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
                    this.R0 = q02.getAbsolutePath();
                }
                startActivityForResult(intent, 0);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void K1(ArrayList arrayList) {
        boolean z10;
        if (arrayList.isEmpty()) {
            return;
        }
        int i7 = this.T0;
        boolean z11 = true;
        if (i7 != 1 && i7 != 4 && (this.F.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.Z;
                if (i10 < editTextBoldCursorArr.length) {
                    if (i10 != 5 && i10 != 8 && i10 != 4 && i10 != 6 && editTextBoldCursorArr[i10].length() > 0) {
                        z11 = false;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            z10 = z11;
        } else {
            z10 = false;
        }
        Utilities.f22877e.c(new org.telegram.messenger.voip.l0(this.T0, 7, this, arrayList, z10));
    }

    public final TLRPC.TL_secureValue L1(TLRPC.TL_secureRequiredType tL_secureRequiredType) {
        if (tL_secureRequiredType == null) {
            return null;
        }
        int size = this.E.values.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (tL_secureRequiredType.type.getClass() == this.E.values.get(i7).type.getClass()) {
                return this.E.values.remove(i7);
            }
        }
        return null;
    }

    public final void M1(View view) {
        while (view != null && this.f47860d0.indexOfChild(view) < 0) {
            view = (View) view.getParent();
        }
        if (view != null) {
            this.f47858c0.smoothScrollTo(0, view.getTop() - ((this.f47858c0.getMeasuredHeight() - view.getMeasuredHeight()) / 2));
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
                    this.f47900w = str2;
                    CharSequence charSequence3 = (String) this.Z0.get(str2);
                    if (charSequence3 != null) {
                        editTextBoldCursor.setText(charSequence3);
                        break;
                    }
                    break;
                case 1:
                    if ("male".equals(str2)) {
                        this.f47903x = str2;
                        editTextBoldCursor.setText(org.telegram.messenger.gd.N0(2131747314, null));
                        break;
                    } else if ("female".equals(str2)) {
                        this.f47903x = str2;
                        editTextBoldCursor.setText(org.telegram.messenger.gd.N0(2131747375, null));
                        break;
                    }
                    break;
                case 2:
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    int[] iArr = this.f47906y;
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
                    editTextBoldCursor.setText(org.telegram.messenger.gd.N0(2131747300, null));
                    break;
                case 3:
                    this.f47891s = str2;
                    CharSequence charSequence4 = (String) this.Z0.get(str2);
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
        HashMap hashMap2 = this.f47905x1;
        HashMap hashMap3 = this.f47910z1;
        if (hashMap2 != null && (charSequence2 = (String) hashMap2.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence2);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
            return;
        }
        HashMap hashMap4 = this.f47908y1;
        if (hashMap4 != null && (charSequence = (String) hashMap4.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
        }
    }

    public final void O1(Bundle bundle, int i7, boolean z10) {
        if (i7 == 3) {
            this.M.setVisibility(8);
        }
        int i10 = this.J1;
        org.telegram.ui.Components.hu0[] hu0VarArr = this.K1;
        org.telegram.ui.Components.hu0 hu0Var = hu0VarArr[i10];
        org.telegram.ui.Components.hu0 hu0Var2 = hu0VarArr[i7];
        this.J1 = i7;
        hu0Var2.m(bundle, false);
        hu0Var2.j();
        if (z10) {
            Point point = org.telegram.messenger.g0.f24226q;
            hu0Var2.setTranslationX(point.x);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.setDuration(300L);
            animatorSet.playTogether(ObjectAnimator.ofFloat(hu0Var, "translationX", -point.x), ObjectAnimator.ofFloat(hu0Var2, "translationX", 0.0f));
            animatorSet.addListener(new org.telegram.ui.Components.f10(hu0Var2, hu0Var, 11));
            animatorSet.start();
            return;
        }
        hu0Var2.setTranslationX(0.0f);
        hu0Var2.setVisibility(0);
        if (hu0Var != hu0Var2) {
            hu0Var.setVisibility(8);
        }
    }

    public final void P1(org.telegram.tgnet.TLRPC.TL_secureRequiredType r31, java.lang.String r32, java.lang.String r33, org.telegram.tgnet.TLRPC.TL_secureRequiredType r34, java.lang.String r35, boolean r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fk0.P1(org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, boolean, int):void");
    }

    public final void Q1(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = str;
        t1Var.U = str2;
        showDialog(t1Var);
    }

    public final void R1(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.N;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10 && this.M != null) {
            this.N = new AnimatorSet();
            if (z11) {
                this.O.setVisibility(0);
                this.M.setEnabled(false);
                AnimatorSet animatorSet2 = this.N;
                View contentView = this.M.getContentView();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(contentView, property, 0.1f);
                View contentView2 = this.M.getContentView();
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(contentView2, property2, 0.1f);
                View contentView3 = this.M.getContentView();
                Property property3 = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(contentView3, property3, 0.0f), ObjectAnimator.ofFloat(this.O, property, 1.0f), ObjectAnimator.ofFloat(this.O, property2, 1.0f), ObjectAnimator.ofFloat(this.O, property3, 1.0f));
            } else {
                this.M.getContentView().setVisibility(0);
                this.M.setEnabled(true);
                AnimatorSet animatorSet3 = this.N;
                org.telegram.ui.Components.nq nqVar = this.O;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(nqVar, property4, 0.1f);
                org.telegram.ui.Components.nq nqVar2 = this.O;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(nqVar2, property5, 0.1f);
                org.telegram.ui.Components.nq nqVar3 = this.O;
                Property property6 = View.ALPHA;
                animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(nqVar3, property6, 0.0f), ObjectAnimator.ofFloat(this.M.getContentView(), property4, 1.0f), ObjectAnimator.ofFloat(this.M.getContentView(), property5, 1.0f), ObjectAnimator.ofFloat(this.M.getContentView(), property6, 1.0f));
            }
            this.N.addListener(new lj0(this, z11, 0));
            this.N.setDuration(150L);
            this.N.start();
        } else if (this.P != null) {
            this.N = new AnimatorSet();
            if (z11) {
                this.Q.setVisibility(0);
                this.R.setEnabled(false);
                AnimatorSet animatorSet4 = this.N;
                TextView textView = this.P;
                Property property7 = View.SCALE_X;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView, property7, 0.1f);
                TextView textView2 = this.P;
                Property property8 = View.SCALE_Y;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textView2, property8, 0.1f);
                TextView textView3 = this.P;
                Property property9 = View.ALPHA;
                animatorSet4.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(textView3, property9, 0.0f), ObjectAnimator.ofFloat(this.Q, property7, 1.0f), ObjectAnimator.ofFloat(this.Q, property8, 1.0f), ObjectAnimator.ofFloat(this.Q, property9, 1.0f));
            } else {
                this.P.setVisibility(0);
                this.R.setEnabled(true);
                AnimatorSet animatorSet5 = this.N;
                org.telegram.ui.Components.nq nqVar4 = this.Q;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(nqVar4, property10, 0.1f);
                org.telegram.ui.Components.nq nqVar5 = this.Q;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(nqVar5, property11, 0.1f);
                org.telegram.ui.Components.nq nqVar6 = this.Q;
                Property property12 = View.ALPHA;
                animatorSet5.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(nqVar6, property12, 0.0f), ObjectAnimator.ofFloat(this.P, property10, 1.0f), ObjectAnimator.ofFloat(this.P, property11, 1.0f), ObjectAnimator.ofFloat(this.P, property12, 1.0f));
            }
            this.N.addListener(new lj0(this, z11, 1));
            this.N.setDuration(150L);
            this.N.start();
        }
    }

    public final void S1(boolean z10, String str, Runnable runnable, uj0 uj0Var, wj0 wj0Var) {
        boolean z11;
        boolean z12;
        boolean z13;
        TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.t0.f27013b.getSystemService("phone");
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
                this.N1.clear();
                if (!z12) {
                    this.N1.add("android.permission.READ_PHONE_STATE");
                }
                if (!this.N1.isEmpty()) {
                    if (getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.f28835a.S = org.telegram.messenger.gd.N0(2131689472, null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                        String N0 = org.telegram.messenger.gd.N0(2131754272, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                        t1Var.U = N0;
                        this.M1 = showDialog(t1Var);
                    } else {
                        getParentActivity().requestPermissions((String[]) this.N1.toArray(new String[0]), 6);
                    }
                    this.F1 = str;
                    this.H1 = uj0Var;
                    this.G1 = runnable;
                    this.I1 = wj0Var;
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
        tL_codeSettings.allow_app_hash = org.telegram.messenger.nt.f26062b.hasServices();
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f27013b.getSharedPreferences("mainconfig", 0);
        if (sendverifyphonecode.settings.allow_app_hash) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            boolean z14 = org.telegram.messenger.s2.f26829a;
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendverifyphonecode, new bi.m2(this, str, wj0Var, sendverifyphonecode, 15), 2);
    }

    public final void U1() {
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.G;
        if (tL_secureRequiredType != null) {
            this.actionBar.setTitle(u1(tL_secureRequiredType.type));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131747298, null));
        }
        X1(2);
        X1(3);
        X1(1);
        X1(4);
    }

    public final void V0(final org.telegram.messenger.yv yvVar, final int i7) {
        String N0;
        final String str;
        String v;
        HashMap hashMap;
        if (i7 == 1) {
            this.f47877k1 = yvVar;
            if (this.f47870h0 == null) {
                return;
            }
        } else if (i7 == 4) {
            this.l1.add(yvVar);
            if (this.f47872i0 == null) {
                return;
            }
        } else if (i7 == 2) {
            this.f47879m1 = yvVar;
            if (this.f47866f0 == null) {
                return;
            }
        } else if (i7 == 3) {
            this.n1 = yvVar;
            if (this.f47868g0 == null) {
                return;
            }
        } else {
            this.f47875j1.add(yvVar);
            if (this.f47863e0 == null) {
                return;
            }
        }
        if (getParentActivity() == null) {
            return;
        }
        final dk0 dk0Var = new dk0(this, getParentActivity());
        dk0Var.setTag(yvVar);
        org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.n6.N0(true);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.f29451d6);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.f29543i6);
        dk0Var.setBackground(N02);
        org.telegram.ui.ActionBar.u6.j(dk0Var, N02, M, M2, null);
        this.f47883o1.put(yvVar, dk0Var);
        String r12 = r1(yvVar);
        if (i7 == 1) {
            N0 = org.telegram.messenger.gd.N0(2131747269, null);
            this.f47870h0.addView(dk0Var, c8.na.o(-1, -2));
            str = "selfie" + r12;
        } else if (i7 == 4) {
            N0 = org.telegram.messenger.gd.N0(2131753945, null);
            this.f47872i0.addView(dk0Var, c8.na.o(-1, -2));
            str = "translation" + r12;
        } else if (i7 == 2) {
            TLRPC.SecureValueType secureValueType = this.G.type;
            if (!(secureValueType instanceof TLRPC.TL_secureValueTypePassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                N0 = org.telegram.messenger.gd.N0(2131747374, null);
            } else {
                N0 = org.telegram.messenger.gd.N0(2131747316, null);
            }
            this.f47866f0.addView(dk0Var, c8.na.o(-1, -2));
            str = "front" + r12;
        } else if (i7 == 3) {
            N0 = org.telegram.messenger.gd.N0(2131747278, null);
            this.f47868g0.addView(dk0Var, c8.na.o(-1, -2));
            str = "reverse" + r12;
        } else {
            N0 = org.telegram.messenger.gd.N0(2131753945, null);
            this.f47863e0.addView(dk0Var, c8.na.o(-1, -2));
            str = "files" + r12;
        }
        TextView textView = dk0Var.f47155b;
        if (str != null && (hashMap = this.f47908y1) != null && (v = (String) hashMap.get(str)) != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29672p7, null);
            this.f47910z1.put(str, "");
        } else {
            v = org.telegram.messenger.gd.v(yvVar.f28288b.date);
        }
        dk0Var.f47154a.setText(N0);
        textView.setText(v);
        org.telegram.ui.Components.p9 p9Var = dk0Var.f47156c;
        p9Var.getClass();
        ?? obj = new Object();
        obj.h = yvVar;
        p9Var.n(obj, "48_48", null, null, null, null, 0, null);
        dk0Var.f47158f = yvVar;
        dk0Var.a(false);
        dk0Var.setOnClickListener(new ci.q(this, i7, 28));
        dk0Var.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                fk0 fk0Var = this;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fk0Var.getParentActivity());
                int i10 = i7;
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                if (i10 == 1) {
                    t1Var.U = org.telegram.messenger.gd.N0(2131747388, null);
                } else {
                    t1Var.U = org.telegram.messenger.gd.N0(2131747390, null);
                }
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                t1Var.S = org.telegram.messenger.gd.N0(2131689472, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), new bi.o5(fk0Var, yvVar, i10, dk0Var, str, 5));
                fk0Var.showDialog(t1Var);
                return true;
            }
        });
    }

    public final void V1() {
        if (this.E.values.isEmpty()) {
            this.B0.setVisibility(0);
            this.m0.setVisibility(8);
            this.f47876k0.setVisibility(8);
            this.f47907y0.setVisibility(8);
            this.f47909z0.setVisibility(8);
            this.A0.setVisibility(8);
            return;
        }
        this.B0.setVisibility(8);
        this.m0.setVisibility(0);
        this.f47876k0.setVisibility(0);
        this.f47909z0.setVisibility(0);
        this.A0.setVisibility(0);
        if (!w1(TLRPC.TL_secureValueTypePhone.class) && !w1(TLRPC.TL_secureValueTypeEmail.class) && !w1(TLRPC.TL_secureValueTypePersonalDetails.class) && !w1(TLRPC.TL_secureValueTypePassport.class) && !w1(TLRPC.TL_secureValueTypeInternalPassport.class) && !w1(TLRPC.TL_secureValueTypeIdentityCard.class) && !w1(TLRPC.TL_secureValueTypeDriverLicense.class) && !w1(TLRPC.TL_secureValueTypeAddress.class) && !w1(TLRPC.TL_secureValueTypeUtilityBill.class) && !w1(TLRPC.TL_secureValueTypePassportRegistration.class) && !w1(TLRPC.TL_secureValueTypeTemporaryRegistration.class) && !w1(TLRPC.TL_secureValueTypeBankStatement.class) && !w1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            this.f47907y0.setVisibility(8);
        } else {
            this.f47907y0.setVisibility(0);
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
        V0(new org.telegram.messenger.yv(new org.telegram.messenger.zv(bArr3, bArr4), tL_secureFile, null, null, null), i7);
    }

    public final void W1() {
        ImageView imageView = this.J0;
        if (imageView != null) {
            TL_account.Password password = this.K;
            if (password != null && this.O0 == 0) {
                if (!password.has_password) {
                    this.H0.setVisibility(0);
                    this.J0.setVisibility(0);
                    this.K0.setVisibility(0);
                    this.L0.setVisibility(0);
                    this.M0.setVisibility(8);
                    this.f47852a0[0].setVisibility(8);
                    this.M.setVisibility(8);
                    this.N0.setVisibility(8);
                    this.I0.setVisibility(8);
                    this.H0.setLayoutParams(c8.na.k(0.0f, 25.0f, 0.0f, 0.0f, -1, -2));
                    this.G0.setVisibility(8);
                    return;
                }
                this.H0.setVisibility(0);
                this.J0.setVisibility(8);
                this.K0.setVisibility(8);
                this.L0.setVisibility(8);
                this.G0.setVisibility(8);
                this.M0.setVisibility(0);
                this.f47852a0[0].setVisibility(0);
                this.M.setVisibility(0);
                this.N0.setVisibility(0);
                this.I0.setVisibility(0);
                this.H0.setLayoutParams(c8.na.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                if (this.Z != null) {
                    TL_account.Password password2 = this.K;
                    if (password2 != null && !TextUtils.isEmpty(password2.hint)) {
                        this.Z[0].setHint(this.K.hint);
                        return;
                    } else {
                        this.Z[0].setHint(org.telegram.messenger.gd.N0(2131748533, null));
                        return;
                    }
                }
                return;
            }
            imageView.setVisibility(8);
            this.K0.setVisibility(8);
            this.L0.setVisibility(8);
            this.M0.setVisibility(8);
            this.f47852a0[0].setVisibility(8);
            this.M.setVisibility(8);
            this.N0.setVisibility(8);
            this.I0.setVisibility(8);
            this.H0.setVisibility(8);
            this.G0.setVisibility(0);
        }
    }

    public final void X0(ArrayList arrayList) {
        this.f47875j1.clear();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i7);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                W0((TLRPC.TL_secureFile) secureFile, 0);
            }
        }
    }

    public final void X1(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fk0.X1(int):void");
    }

    public final org.telegram.ui.ek0 Y0(android.content.Context r28, org.telegram.tgnet.TLRPC.TL_secureRequiredType r29, java.util.ArrayList r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fk0.Y0(android.content.Context, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.util.ArrayList, boolean, boolean):org.telegram.ui.ek0");
    }

    public final void Z0(ArrayList arrayList) {
        this.l1.clear();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i7);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                W0((TLRPC.TL_secureFile) secureFile, 4);
            }
        }
    }

    public final void a1(boolean z10) {
        int i7;
        if (!this.f47871h1) {
            String str = this.f47880n;
            boolean isEmpty = TextUtils.isEmpty(str);
            int i10 = this.f47854b;
            if (!isEmpty) {
                if (z10) {
                    Activity parentActivity = getParentActivity();
                    vf.c.q(parentActivity, Uri.parse(str + "&tg_passport=success"), true, true);
                } else if (!this.f47869g1 && (i10 == 5 || i10 == 0)) {
                    Activity parentActivity2 = getParentActivity();
                    vf.c.q(parentActivity2, Uri.parse(str + "&tg_passport=cancel"), true, true);
                }
                this.f47871h1 = true;
            } else if (this.D1) {
                if (z10 || (!this.f47869g1 && (i10 == 5 || i10 == 0))) {
                    Activity parentActivity3 = getParentActivity();
                    if (z10) {
                        i7 = -1;
                    } else {
                        i7 = 0;
                    }
                    parentActivity3.setResult(i7);
                }
                this.f47871h1 = true;
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Di));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
    }

    public final boolean b1(boolean z10) {
        if (y1()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747386, null), new vi0(this, 1));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            String N0 = org.telegram.messenger.gd.N0(2131751393, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.gd.N0(2131747385, null);
            showDialog(t1Var);
        }
        return true;
    }

    public final void c1(boolean z10) {
        String str;
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.f47855b0 != null) {
            String str2 = (String) this.Z0.get(this.f47900w);
            String str3 = (String) org.telegram.messenger.bz.n().get(this.f47900w);
            int i7 = 0;
            if (this.F.native_names && !TextUtils.isEmpty(this.f47900w) && !"EN".equals(str3)) {
                if (this.f47889r0.getVisibility() != 0) {
                    this.f47889r0.setVisibility(0);
                    this.f47876k0.setVisibility(0);
                    this.U.setVisibility(0);
                    int i10 = 0;
                    while (true) {
                        editTextBoldCursorArr = this.f47855b0;
                        if (i10 >= editTextBoldCursorArr.length) {
                            break;
                        }
                        ((View) editTextBoldCursorArr[i10].getParent()).setVisibility(0);
                        i10++;
                    }
                    if (editTextBoldCursorArr[0].length() == 0 && this.f47855b0[1].length() == 0 && this.f47855b0[2].length() == 0) {
                        int i11 = 0;
                        while (true) {
                            boolean[] zArr = this.f47896u0;
                            if (i11 >= zArr.length) {
                                break;
                            } else if (zArr[i11]) {
                                this.f47855b0[0].setText(this.Z[0].getText());
                                this.f47855b0[1].setText(this.Z[1].getText());
                                this.f47855b0[2].setText(this.Z[2].getText());
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                    org.telegram.ui.ActionBar.u6.Z(this.f47881n0, getParentActivity(), 2131231232, org.telegram.ui.ActionBar.n6.f29415b7);
                }
                this.f47889r0.setText(org.telegram.messenger.gd.a0("PassportNativeInfo", null, 2131747304, str2));
                if (str3 != null) {
                    str = org.telegram.messenger.gd.L0("PassportLanguage_".concat(str3));
                } else {
                    str = null;
                }
                if (str != null) {
                    this.f47876k0.setText(org.telegram.messenger.gd.a0("PassportNativeHeaderLang", null, 2131747305, str));
                } else {
                    this.f47876k0.setText(org.telegram.messenger.gd.N0(2131747306, null));
                }
                for (int i12 = 0; i12 < 3; i12++) {
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 == 2) {
                                if (str != null) {
                                    this.f47855b0[i12].setHintText(org.telegram.messenger.gd.N0(2131747264, null));
                                } else {
                                    this.f47855b0[i12].setHintText(org.telegram.messenger.gd.a0("PassportSurnameCountry", null, 2131747263, str2));
                                }
                            }
                        } else if (str != null) {
                            this.f47855b0[i12].setHintText(org.telegram.messenger.gd.N0(2131747313, null));
                        } else {
                            this.f47855b0[i12].setHintText(org.telegram.messenger.gd.a0("PassportMidnameCountry", null, 2131747312, str2));
                        }
                    } else if (str != null) {
                        this.f47855b0[i12].setHintText(org.telegram.messenger.gd.N0(2131747310, null));
                    } else {
                        this.f47855b0[i12].setHintText(org.telegram.messenger.gd.a0("PassportNameCountry", null, 2131747308, str2));
                    }
                }
                if (z10) {
                    org.telegram.messenger.g0.g3(new si0(this, 2));
                }
            } else if (this.f47889r0.getVisibility() != 8) {
                this.f47889r0.setVisibility(8);
                this.f47876k0.setVisibility(8);
                this.U.setVisibility(8);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.f47855b0;
                    if (i7 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    ((View) editTextBoldCursorArr2[i7].getParent()).setVisibility(8);
                    i7++;
                }
                if (((this.f47857c != 0 || this.G == null) && this.I != null && !this.f47901w0) || this.J != null) {
                    org.telegram.ui.ActionBar.u6.Z(this.f47881n0, getParentActivity(), 2131231232, org.telegram.ui.ActionBar.n6.f29415b7);
                } else {
                    org.telegram.ui.ActionBar.u6.Z(this.f47881n0, getParentActivity(), 2131231233, org.telegram.ui.ActionBar.n6.f29415b7);
                }
            }
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fk0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        EditTextBoldCursor editTextBoldCursor;
        dk0 dk0Var;
        org.telegram.ui.ActionBar.q0 q0Var;
        if (i7 == org.telegram.messenger.ks.U1) {
            String str = (String) objArr[0];
            HashMap hashMap = this.f47885p1;
            org.telegram.messenger.yv yvVar = (org.telegram.messenger.yv) hashMap.get(str);
            if (yvVar != null) {
                yvVar.d = (TLRPC.TL_inputFile) objArr[1];
                hashMap.remove(str);
                if (hashMap.isEmpty() && (q0Var = this.M) != null) {
                    q0Var.setEnabled(true);
                    this.M.setAlpha(1.0f);
                }
                HashMap hashMap2 = this.f47883o1;
                if (hashMap2 != null && (dk0Var = (dk0) hashMap2.get(yvVar)) != null) {
                    dk0Var.a(true);
                }
                HashMap hashMap3 = this.f47910z1;
                if (hashMap3 != null && hashMap3.containsKey("error_document_all")) {
                    hashMap3.remove("error_document_all");
                    e1(false);
                }
                int i11 = yvVar.f28292i;
                if (i11 == 0) {
                    if (this.f47882o0 != null && !TextUtils.isEmpty(this.A1)) {
                        this.f47882o0.setText(this.A1);
                    }
                    hashMap3.remove("files_all");
                } else if (i11 == 4) {
                    if (this.f47884p0 != null && !TextUtils.isEmpty(this.B1)) {
                        this.f47884p0.setText(this.B1);
                    }
                    hashMap3.remove("translation_all");
                }
            }
        } else if (i7 != org.telegram.messenger.ks.V1 && i7 == org.telegram.messenger.ks.f25264p0) {
            if (objArr.length > 0) {
                Object obj = objArr[7];
                if (obj != null && (editTextBoldCursor = this.Z[0]) != null) {
                    editTextBoldCursor.setText((String) obj);
                }
                if (objArr[6] == null) {
                    TL_account.TL_password tL_password = new TL_account.TL_password();
                    this.K = tL_password;
                    tL_password.current_algo = (TLRPC.PasswordKdfAlgo) objArr[1];
                    tL_password.new_secure_algo = (TLRPC.SecurePasswordKdfAlgo) objArr[2];
                    tL_password.secure_random = (byte[]) objArr[3];
                    tL_password.has_recovery = !TextUtils.isEmpty((String) objArr[4]);
                    TL_account.Password password = this.K;
                    password.hint = (String) objArr[5];
                    password.srp_id = -1L;
                    byte[] bArr = new byte[256];
                    password.srp_B = bArr;
                    Utilities.f22875b.nextBytes(bArr);
                    EditTextBoldCursor editTextBoldCursor2 = this.Z[0];
                    if (editTextBoldCursor2 != null && editTextBoldCursor2.length() > 0) {
                        this.O0 = 2;
                    }
                }
            } else {
                this.K = null;
                A1();
            }
            W1();
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.ti tiVar = this.S0;
        if (tiVar != null && this.visibleDialog == tiVar) {
            tiVar.f39967e2.d0(false);
            this.S0.L();
            this.S0.f39967e2.g0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.S0 && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    public final void e1(boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        String str2;
        if (this.f47886q0 != null) {
            HashMap hashMap = this.f47905x1;
            HashMap hashMap2 = this.f47910z1;
            if (hashMap != null && ((z10 || hashMap2.containsKey("error_all")) && (str2 = (String) this.f47905x1.get("error_all")) != null)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
                if (z10) {
                    hashMap2.put("error_all", "");
                }
            } else {
                spannableStringBuilder = null;
            }
            if (this.f47908y1 != null && ((z10 || hashMap2.containsKey("error_document_all")) && (str = (String) this.f47908y1.get("error_all")) != null)) {
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
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.i00(org.telegram.ui.ActionBar.n6.f29672p7, null), 0, spannableStringBuilder.length(), 33);
                this.f47886q0.setText(spannableStringBuilder);
                this.f47886q0.setVisibility(0);
            } else if (this.f47886q0.getVisibility() != 8) {
                this.f47886q0.setVisibility(8);
            }
        }
    }

    public final void f1(Context context) {
        long j3;
        String str;
        this.Z0 = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.Z0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
        this.f47886q0 = z8Var;
        int i7 = org.telegram.ui.ActionBar.n6.f29415b7;
        org.telegram.ui.ActionBar.u6.Z(z8Var, context, 2131231234, i7);
        this.f47886q0.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        this.f47860d0.addView(this.f47886q0, c8.na.o(-1, -2));
        e1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.G;
        if (tL_secureRequiredType != null) {
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131754672, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
                this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131754681, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131754670, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131754674, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131754671, null));
            }
            org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context);
            this.f47876k0 = o4Var;
            o4Var.setText(org.telegram.messenger.gd.N0(2131747382, null));
            org.telegram.ui.Cells.o4 o4Var2 = this.f47876k0;
            int i10 = org.telegram.ui.ActionBar.n6.f29451d6;
            org.telegram.ui.ActionBar.u6.h(i10, o4Var2, null);
            j3 = 0;
            this.f47860d0.addView(this.f47876k0, c8.na.o(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.f47863e0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f47860d0.addView(this.f47863e0, c8.na.o(-1, -2));
            org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
            this.S = w9Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.n6.N0(true);
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
            int i11 = org.telegram.ui.ActionBar.n6.f29543i6;
            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i11);
            w9Var.setBackground(N0);
            org.telegram.ui.ActionBar.u6.j(w9Var, N0, M, M2, null);
            this.f47860d0.addView(this.S, c8.na.o(-1, -2));
            this.S.setOnClickListener(new ti0(this, 7));
            org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
            this.f47882o0 = z8Var2;
            org.telegram.ui.ActionBar.u6.Z(z8Var2, context, 2131231232, i7);
            if (this.f47857c != 0) {
                this.A1 = org.telegram.messenger.gd.N0(2131747433, null);
            } else {
                TLRPC.SecureValueType secureValueType2 = this.G.type;
                if (secureValueType2 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                    this.A1 = org.telegram.messenger.gd.N0(2131747431, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                    this.A1 = org.telegram.messenger.gd.N0(2131747427, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                    this.A1 = org.telegram.messenger.gd.N0(2131747417, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                    this.A1 = org.telegram.messenger.gd.N0(2131747415, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                    this.A1 = org.telegram.messenger.gd.N0(2131747429, null);
                } else {
                    this.A1 = "";
                }
            }
            String str2 = this.A1;
            HashMap hashMap = this.f47908y1;
            HashMap hashMap2 = this.f47910z1;
            String str3 = str2;
            if (hashMap != null) {
                String str4 = (String) hashMap.get("files_all");
                str3 = str2;
                if (str4 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                    spannableStringBuilder.append((CharSequence) "\n\n");
                    spannableStringBuilder.append((CharSequence) this.A1);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.i00(org.telegram.ui.ActionBar.n6.f29672p7, null), 0, str4.length(), 33);
                    hashMap2.put("files_all", "");
                    str3 = spannableStringBuilder;
                }
            }
            this.f47882o0.setText(str3);
            this.f47860d0.addView(this.f47882o0, c8.na.o(-1, -2));
            if (this.G.translation_required) {
                org.telegram.ui.Cells.o4 o4Var3 = new org.telegram.ui.Cells.o4(context);
                this.f47876k0 = o4Var3;
                o4Var3.setText(org.telegram.messenger.gd.N0(2131747261, null));
                org.telegram.ui.ActionBar.u6.h(i10, this.f47876k0, null);
                this.f47860d0.addView(this.f47876k0, c8.na.o(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.f47872i0 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.f47860d0.addView(this.f47872i0, c8.na.o(-1, -2));
                org.telegram.ui.Cells.w9 w9Var2 = new org.telegram.ui.Cells.w9(context);
                this.Y = w9Var2;
                org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.n6.N0(true);
                org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i10);
                org.telegram.ui.ActionBar.q6 M4 = org.telegram.ui.ActionBar.u6.M(i11);
                w9Var2.setBackground(N02);
                org.telegram.ui.ActionBar.u6.j(w9Var2, N02, M3, M4, null);
                this.f47860d0.addView(this.Y, c8.na.o(-1, -2));
                this.Y.setOnClickListener(new ti0(this, 8));
                org.telegram.ui.Cells.z8 z8Var3 = new org.telegram.ui.Cells.z8(context);
                this.f47884p0 = z8Var3;
                org.telegram.ui.ActionBar.u6.Z(z8Var3, context, 2131231232, i7);
                if (this.f47857c != 0) {
                    this.B1 = org.telegram.messenger.gd.N0(2131747409, null);
                } else {
                    TLRPC.SecureValueType secureValueType3 = this.G.type;
                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                        this.B1 = org.telegram.messenger.gd.N0(2131747414, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                        this.B1 = org.telegram.messenger.gd.N0(2131747412, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                        this.B1 = org.telegram.messenger.gd.N0(2131747411, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                        this.B1 = org.telegram.messenger.gd.N0(2131747410, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                        this.B1 = org.telegram.messenger.gd.N0(2131747413, null);
                    } else {
                        this.B1 = "";
                    }
                }
                String str5 = this.B1;
                HashMap hashMap3 = this.f47908y1;
                String str6 = str5;
                if (hashMap3 != null) {
                    String str7 = (String) hashMap3.get("translation_all");
                    str6 = str5;
                    if (str7 != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str7);
                        spannableStringBuilder2.append((CharSequence) "\n\n");
                        spannableStringBuilder2.append((CharSequence) this.B1);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.i00(org.telegram.ui.ActionBar.n6.f29672p7, null), 0, str7.length(), 33);
                        hashMap2.put("translation_all", "");
                        str6 = spannableStringBuilder2;
                    }
                }
                this.f47884p0.setText(str6);
                this.f47860d0.addView(this.f47884p0, c8.na.o(-1, -2));
            }
        } else {
            j3 = 0;
            this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131747408, null));
        }
        org.telegram.ui.Cells.o4 o4Var4 = new org.telegram.ui.Cells.o4(context);
        this.f47876k0 = o4Var4;
        o4Var4.setText(org.telegram.messenger.gd.N0(2131747407, null));
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, this.f47876k0, null);
        this.f47860d0.addView(this.f47876k0, c8.na.o(-1, -2));
        this.Z = new EditTextBoldCursor[6];
        for (int i12 = 0; i12 < 6; i12++) {
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.Z[i12] = editTextBoldCursor;
            cj0 cj0Var = new cj0(context, editTextBoldCursor, 0);
            cj0Var.setWillNotDraw(false);
            this.f47860d0.addView(cj0Var, c8.na.o(-1, -2));
            int i13 = org.telegram.ui.ActionBar.n6.f29451d6;
            org.telegram.ui.ActionBar.u6.h(i13, cj0Var, null);
            int i14 = 5;
            if (i12 == 5) {
                View view = new View(context);
                this.T = view;
                org.telegram.ui.ActionBar.u6.h(i13, view, null);
                this.f47860d0.addView(this.T, c8.na.o(-1, 6));
            }
            if (this.f47901w0 && this.G != null) {
                cj0Var.setVisibility(8);
                View view2 = this.T;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            this.Z[i12].setTag(Integer.valueOf(i12));
            this.Z[i12].setSupportRtlHint(true);
            this.Z[i12].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.u6.A(this.Z[i12], org.telegram.ui.ActionBar.n6.H6, null);
            org.telegram.ui.ActionBar.u6.z(this.Z[i12], org.telegram.ui.ActionBar.n6.L6, null);
            this.Z[i12].setTransformHintToHeader(true);
            EditTextBoldCursor editTextBoldCursor2 = this.Z[i12];
            int i15 = org.telegram.ui.ActionBar.n6.G6;
            org.telegram.ui.ActionBar.u6.U(editTextBoldCursor2, i15, null);
            this.Z[i12].setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.u6.v(this.Z[i12], i15, null);
            this.Z[i12].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.Z[i12].setCursorWidth(1.5f);
            org.telegram.ui.ActionBar.u6.F(this.Z[i12], org.telegram.ui.ActionBar.n6.f29580k6, org.telegram.ui.ActionBar.n6.f29598l6, org.telegram.ui.ActionBar.n6.f29672p7, null);
            if (i12 == 5) {
                this.Z[i12].setOnTouchListener(new ui0(this, 2));
                this.Z[i12].setInputType(0);
                this.Z[i12].setFocusable(false);
            } else {
                this.Z[i12].setInputType(16385);
                this.Z[i12].setImeOptions(268435461);
            }
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                if (i12 == 5) {
                                    this.Z[i12].setHintText(org.telegram.messenger.gd.N0(2131747400, null));
                                    str = "country_code";
                                }
                            } else {
                                this.Z[i12].setHintText(org.telegram.messenger.gd.N0(2131747267, null));
                                str = "state";
                            }
                        } else {
                            this.Z[i12].setHintText(org.telegram.messenger.gd.N0(2131747401, null));
                            str = "city";
                        }
                    } else {
                        this.Z[i12].setHintText(org.telegram.messenger.gd.N0(2131747286, null));
                        str = "post_code";
                    }
                } else {
                    this.Z[i12].setHintText(org.telegram.messenger.gd.N0(2131747265, null));
                    str = "street_line2";
                }
            } else {
                this.Z[i12].setHintText(org.telegram.messenger.gd.N0(2131747266, null));
                str = "street_line1";
            }
            N1(this.f47895t1, this.Z[i12], str);
            if (i12 == 2) {
                this.Z[i12].addTextChangedListener(new dj0(this, editTextBoldCursor, str));
                this.Z[i12].setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            } else {
                this.Z[i12].addTextChangedListener(new ej0(this, editTextBoldCursor, str, 0));
            }
            EditTextBoldCursor editTextBoldCursor3 = this.Z[i12];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.Z[i12].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.Z[i12];
            if (!org.telegram.messenger.gd.f24314a0) {
                i14 = 3;
            }
            editTextBoldCursor4.setGravity(i14 | 16);
            cj0Var.addView(this.Z[i12], c8.na.d(-1, 64.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
            this.Z[i12].setOnEditorActionListener(new ri0(this, 4));
        }
        org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
        this.m0 = y6Var;
        this.f47860d0.addView(y6Var, c8.na.o(-1, -2));
        if (this.f47901w0 && this.G != null) {
            this.f47876k0.setVisibility(8);
            this.m0.setVisibility(8);
        }
        int i16 = (this.f47857c > j3 ? 1 : (this.f47857c == j3 ? 0 : -1));
        TLRPC.TL_secureValue tL_secureValue = this.J;
        if (((i16 != 0 || this.G == null) && this.I != null && !this.f47901w0) || tL_secureValue != null) {
            if (tL_secureValue != null) {
                X0(tL_secureValue.files);
                Z0(tL_secureValue.translation);
            }
            org.telegram.ui.Cells.y6 y6Var2 = this.m0;
            int i17 = org.telegram.ui.ActionBar.n6.f29415b7;
            org.telegram.ui.ActionBar.u6.Z(y6Var2, context, 2131231232, i17);
            org.telegram.ui.Cells.w9 w9Var3 = new org.telegram.ui.Cells.w9(context);
            org.telegram.ui.ActionBar.u6.U(w9Var3.getTextView(), org.telegram.ui.ActionBar.n6.f29672p7, null);
            org.telegram.ui.Cells.y N03 = org.telegram.ui.ActionBar.n6.N0(true);
            org.telegram.ui.ActionBar.q6 M5 = org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.f29451d6);
            org.telegram.ui.ActionBar.q6 M6 = org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.f29543i6);
            w9Var3.setBackground(N03);
            org.telegram.ui.ActionBar.u6.j(w9Var3, N03, M5, M6, null);
            if (this.G == null) {
                w9Var3.b(org.telegram.messenger.gd.N0(2131747393, null), false);
            } else {
                w9Var3.b(org.telegram.messenger.gd.N0(2131747398, null), false);
            }
            this.f47860d0.addView(w9Var3, c8.na.o(-1, -2));
            w9Var3.setOnClickListener(new ti0(this, 9));
            org.telegram.ui.Cells.y6 y6Var3 = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
            this.m0 = y6Var3;
            org.telegram.ui.ActionBar.u6.Z(y6Var3, context, 2131231233, i17);
            this.f47860d0.addView(this.m0, c8.na.o(-1, -2));
        } else {
            org.telegram.ui.Cells.y6 y6Var4 = this.m0;
            int i18 = org.telegram.ui.ActionBar.n6.f29415b7;
            org.telegram.ui.ActionBar.u6.Z(y6Var4, context, 2131231233, i18);
            if (this.f47901w0 && this.G != null) {
                org.telegram.ui.ActionBar.u6.Z(this.f47882o0, context, 2131231233, i18);
            }
        }
        X1(0);
        X1(4);
    }

    public final void g1() {
        if (getParentActivity() != null && this.S0 == null) {
            org.telegram.ui.Components.ti tiVar = new org.telegram.ui.Components.ti(getParentActivity(), this, false, false);
            this.S0 = tiVar;
            tiVar.X3 = new fj0(this);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f47858c0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29731s8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.D8));
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f47878l0;
            if (i10 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.w6((View) arrayList2.get(i10), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29452d7));
            i10++;
        }
        for (Map.Entry entry : this.f47883o1.entrySet()) {
            arrayList.add(new org.telegram.ui.ActionBar.w6((dk0) entry.getValue(), 268435456, new Class[]{dk0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29451d6));
        }
        int i11 = org.telegram.ui.ActionBar.n6.f29451d6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f47860d0, 268435456, new Class[]{org.telegram.ui.Cells.y8.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f47860d0, 268435456, new Class[]{org.telegram.ui.Cells.w9.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f47860d0, 268435456, new Class[]{ek0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        if (this.Z != null) {
            int i12 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.Z;
                if (i12 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.w6((View) editTextBoldCursorArr[i12].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29451d6));
                arrayList.add(new org.telegram.ui.ActionBar.w6(this.Z[i12], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.w6(this.Z[i12], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29580k6));
                arrayList.add(new org.telegram.ui.ActionBar.w6(this.Z[i12], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29598l6));
                arrayList.add(new org.telegram.ui.ActionBar.w6(this.Z[i12], 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29672p7));
                i12++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.H6));
            arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.L6));
            arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29580k6));
            arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29598l6));
            arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29672p7));
        }
        if (this.f47855b0 != null) {
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.f47855b0;
                if (i7 >= editTextBoldCursorArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.w6((View) editTextBoldCursorArr2[i7].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29451d6));
                arrayList.add(new org.telegram.ui.ActionBar.w6(this.f47855b0[i7], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.w6(this.f47855b0[i7], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29580k6));
                arrayList.add(new org.telegram.ui.ActionBar.w6(this.f47855b0[i7], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29598l6));
                arrayList.add(new org.telegram.ui.ActionBar.w6(this.f47855b0[i7], 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29672p7));
                i7++;
            }
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.G0, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29525h6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.R, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29553ii));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.R, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29572ji));
        return arrayList;
    }

    public final void h1() {
        int L;
        int L2;
        boolean[] zArr = {true};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), new zs(29, this, zArr));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        String N0 = org.telegram.messenger.gd.N0(2131689472, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        boolean z10 = this.f47901w0;
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        if (z10 && this.G == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeAddress)) {
            t1Var.U = org.telegram.messenger.gd.N0(2131747399, null);
        } else if (z10 && this.G == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            t1Var.U = org.telegram.messenger.gd.N0(2131747392, null);
        } else {
            t1Var.U = org.telegram.messenger.gd.N0(2131747396, null);
        }
        if (!this.f47901w0 && this.G != null) {
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(getParentActivity(), 1);
            org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.n6.N0(false);
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.f29543i6);
            d2Var.setBackground(N02);
            org.telegram.ui.ActionBar.u6.j(d2Var, N02, null, M, null);
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                d2Var.e(org.telegram.messenger.gd.N0(2131747397, null), "", true, false, false);
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                d2Var.e(org.telegram.messenger.gd.N0(2131747395, null), "", true, false, false);
            }
            if (org.telegram.messenger.gd.f24314a0) {
                L = org.telegram.messenger.g0.L(16.0f);
            } else {
                L = org.telegram.messenger.g0.L(8.0f);
            }
            if (org.telegram.messenger.gd.f24314a0) {
                L2 = org.telegram.messenger.g0.L(8.0f);
            } else {
                L2 = org.telegram.messenger.g0.L(16.0f);
            }
            d2Var.setPadding(L, 0, L2, 0);
            frameLayout.addView(d2Var, c8.na.e(-1, 48, 51));
            d2Var.setOnClickListener(new l8(4, zArr));
            alertDialog$Builder.o(frameLayout);
        }
        showDialog(t1Var);
    }

    public final void i1(Context context) {
        int i7;
        String str;
        int i10;
        String str2;
        String str3;
        int i11;
        this.Z0 = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.Z0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
        this.f47886q0 = z8Var;
        int i12 = org.telegram.ui.ActionBar.n6.f29415b7;
        org.telegram.ui.ActionBar.u6.Z(z8Var, context, 2131231234, i12);
        this.f47886q0.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        int i13 = -1;
        this.f47860d0.addView(this.f47886q0, c8.na.o(-1, -2));
        e1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.G;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.F;
        org.telegram.ui.ActionBar.i6 i6Var = null;
        if (tL_secureRequiredType != null) {
            org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context);
            this.f47876k0 = o4Var;
            if (this.f47901w0) {
                o4Var.setText(org.telegram.messenger.gd.N0(2131747382, null));
            } else {
                o4Var.setText(org.telegram.messenger.gd.N0(2131747281, null));
            }
            org.telegram.ui.Cells.o4 o4Var2 = this.f47876k0;
            int i14 = org.telegram.ui.ActionBar.n6.f29451d6;
            org.telegram.ui.ActionBar.u6.h(i14, o4Var2, null);
            this.f47860d0.addView(this.f47876k0, c8.na.o(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.f47866f0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f47860d0.addView(this.f47866f0, c8.na.o(-1, -2));
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            this.V = y8Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.n6.N0(true);
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i14);
            int i15 = org.telegram.ui.ActionBar.n6.f29543i6;
            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i15);
            y8Var.setBackground(N0);
            org.telegram.ui.ActionBar.u6.j(y8Var, N0, M, M2, null);
            this.f47860d0.addView(this.V, c8.na.o(-1, -2));
            this.V.setOnClickListener(new ti0(this, 0));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.f47868g0 = linearLayout2;
            linearLayout2.setOrientation(1);
            this.f47860d0.addView(this.f47868g0, c8.na.o(-1, -2));
            boolean z10 = this.G.selfie_required;
            org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context);
            this.W = y8Var2;
            org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.n6.N0(true);
            org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i14);
            org.telegram.ui.ActionBar.q6 M4 = org.telegram.ui.ActionBar.u6.M(i15);
            y8Var2.setBackground(N02);
            org.telegram.ui.ActionBar.u6.j(y8Var2, N02, M3, M4, null);
            this.W.a(org.telegram.messenger.gd.N0(2131747278, null), org.telegram.messenger.gd.N0(2131747277, null), z10);
            this.f47860d0.addView(this.W, c8.na.o(-1, -2));
            this.W.setOnClickListener(new ti0(this, 2));
            if (this.G.selfie_required) {
                LinearLayout linearLayout3 = new LinearLayout(context);
                this.f47870h0 = linearLayout3;
                linearLayout3.setOrientation(1);
                this.f47860d0.addView(this.f47870h0, c8.na.o(-1, -2));
                org.telegram.ui.Cells.y8 y8Var3 = new org.telegram.ui.Cells.y8(context);
                this.X = y8Var3;
                org.telegram.ui.Cells.y N03 = org.telegram.ui.ActionBar.n6.N0(true);
                org.telegram.ui.ActionBar.q6 M5 = org.telegram.ui.ActionBar.u6.M(i14);
                org.telegram.ui.ActionBar.q6 M6 = org.telegram.ui.ActionBar.u6.M(i15);
                y8Var3.setBackground(N03);
                org.telegram.ui.ActionBar.u6.j(y8Var3, N03, M5, M6, null);
                this.X.a(org.telegram.messenger.gd.N0(2131747269, null), org.telegram.messenger.gd.N0(2131747268, null), tL_secureRequiredType2.translation_required);
                this.f47860d0.addView(this.X, c8.na.o(-1, -2));
                this.X.setOnClickListener(new ti0(this, 3));
            }
            org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
            this.f47882o0 = z8Var2;
            org.telegram.ui.ActionBar.u6.Z(z8Var2, context, 2131231232, i12);
            this.f47882o0.setText(org.telegram.messenger.gd.N0(2131747295, null));
            this.f47860d0.addView(this.f47882o0, c8.na.o(-1, -2));
            if (this.G.translation_required) {
                org.telegram.ui.Cells.o4 o4Var3 = new org.telegram.ui.Cells.o4(context);
                this.f47876k0 = o4Var3;
                o4Var3.setText(org.telegram.messenger.gd.N0(2131747261, null));
                org.telegram.ui.ActionBar.u6.h(i14, this.f47876k0, null);
                this.f47860d0.addView(this.f47876k0, c8.na.o(-1, -2));
                LinearLayout linearLayout4 = new LinearLayout(context);
                this.f47872i0 = linearLayout4;
                linearLayout4.setOrientation(1);
                this.f47860d0.addView(this.f47872i0, c8.na.o(-1, -2));
                org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
                this.Y = w9Var;
                org.telegram.ui.Cells.y N04 = org.telegram.ui.ActionBar.n6.N0(true);
                org.telegram.ui.ActionBar.q6 M7 = org.telegram.ui.ActionBar.u6.M(i14);
                org.telegram.ui.ActionBar.q6 M8 = org.telegram.ui.ActionBar.u6.M(i15);
                w9Var.setBackground(N04);
                org.telegram.ui.ActionBar.u6.j(w9Var, N04, M7, M8, null);
                this.f47860d0.addView(this.Y, c8.na.o(-1, -2));
                this.Y.setOnClickListener(new ti0(this, 4));
                org.telegram.ui.Cells.z8 z8Var3 = new org.telegram.ui.Cells.z8(context);
                this.f47884p0 = z8Var3;
                org.telegram.ui.ActionBar.u6.Z(z8Var3, context, 2131231232, i12);
                if (this.f47857c != 0) {
                    this.B1 = org.telegram.messenger.gd.N0(2131747409, null);
                } else {
                    TLRPC.SecureValueType secureValueType = this.G.type;
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
                        this.B1 = org.telegram.messenger.gd.N0(2131747419, null);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                        this.B1 = org.telegram.messenger.gd.N0(2131747422, null);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                        this.B1 = org.telegram.messenger.gd.N0(2131747424, null);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                        this.B1 = org.telegram.messenger.gd.N0(2131747425, null);
                    } else {
                        this.B1 = "";
                    }
                }
                String str4 = this.B1;
                HashMap hashMap = this.f47908y1;
                String str5 = str4;
                if (hashMap != null) {
                    String str6 = (String) hashMap.get("translation_all");
                    str5 = str4;
                    if (str6 != null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str6);
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) this.B1);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.i00(org.telegram.ui.ActionBar.n6.f29672p7, null), 0, str6.length(), 33);
                        this.f47910z1.put("translation_all", "");
                        str5 = spannableStringBuilder;
                    }
                }
                this.f47884p0.setText(str5);
                this.f47860d0.addView(this.f47884p0, c8.na.o(-1, -2));
            }
        } else {
            org.telegram.ui.Cells.w9 w9Var2 = new org.telegram.ui.Cells.w9(context);
            this.f47892s0 = w9Var2;
            org.telegram.ui.Cells.y N05 = org.telegram.ui.ActionBar.n6.N0(true);
            org.telegram.ui.ActionBar.q6 M9 = org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.f29451d6);
            org.telegram.ui.ActionBar.q6 M10 = org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.f29543i6);
            w9Var2.setBackground(N05);
            org.telegram.ui.ActionBar.u6.j(w9Var2, N05, M9, M10, null);
            this.f47892s0.b(org.telegram.messenger.gd.N0(2131747276, null), false);
            this.f47860d0.addView(this.f47892s0, c8.na.o(-1, -2));
            this.f47892s0.setOnClickListener(new ti0(this, 5));
            org.telegram.ui.Cells.z8 z8Var4 = new org.telegram.ui.Cells.z8(context);
            this.f47882o0 = z8Var4;
            org.telegram.ui.ActionBar.u6.Z(z8Var4, context, 2131231232, i12);
            this.f47882o0.setText(org.telegram.messenger.gd.N0(2131747275, null));
            this.f47860d0.addView(this.f47882o0, c8.na.o(-1, -2));
        }
        org.telegram.ui.Cells.o4 o4Var4 = new org.telegram.ui.Cells.o4(context);
        this.f47876k0 = o4Var4;
        if (this.f47901w0) {
            o4Var4.setText(org.telegram.messenger.gd.N0(2131747384, null));
        } else {
            o4Var4.setText(org.telegram.messenger.gd.N0(2131747298, null));
        }
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, this.f47876k0, null);
        this.f47860d0.addView(this.f47876k0, c8.na.o(-1, -2));
        int i16 = 7;
        if (this.G != null) {
            i7 = 9;
        } else {
            i7 = 7;
        }
        this.Z = new EditTextBoldCursor[i7];
        int i17 = 0;
        while (true) {
            int i18 = 6;
            HashMap hashMap2 = this.f47895t1;
            if (i17 < i7) {
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.Z[i17] = editTextBoldCursor;
                cj0 cj0Var = new cj0(context, editTextBoldCursor, 1);
                cj0Var.setWillNotDraw(false);
                this.f47860d0.addView(cj0Var, c8.na.o(i13, 64));
                int i19 = org.telegram.ui.ActionBar.n6.f29451d6;
                org.telegram.ui.ActionBar.u6.h(i19, cj0Var, i6Var);
                if (i17 == i7 - 1) {
                    View view = new View(context);
                    this.T = view;
                    org.telegram.ui.ActionBar.u6.h(i19, view, i6Var);
                    this.f47860d0.addView(this.T, c8.na.o(i13, 6));
                }
                if (this.f47901w0 && this.G != null && i17 < i16) {
                    cj0Var.setVisibility(8);
                    View view2 = this.T;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                }
                this.Z[i17].setTag(Integer.valueOf(i17));
                this.Z[i17].setSupportRtlHint(true);
                this.Z[i17].setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.u6.A(this.Z[i17], org.telegram.ui.ActionBar.n6.H6, null);
                EditTextBoldCursor editTextBoldCursor2 = this.Z[i17];
                int i20 = org.telegram.ui.ActionBar.n6.G6;
                org.telegram.ui.ActionBar.u6.U(editTextBoldCursor2, i20, null);
                org.telegram.ui.ActionBar.u6.z(this.Z[i17], org.telegram.ui.ActionBar.n6.L6, null);
                this.Z[i17].setTransformHintToHeader(true);
                this.Z[i17].setBackgroundDrawable(null);
                org.telegram.ui.ActionBar.u6.v(this.Z[i17], i20, null);
                this.Z[i17].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                this.Z[i17].setCursorWidth(1.5f);
                org.telegram.ui.ActionBar.u6.F(this.Z[i17], org.telegram.ui.ActionBar.n6.f29580k6, org.telegram.ui.ActionBar.n6.f29598l6, org.telegram.ui.ActionBar.n6.f29672p7, null);
                if (i17 != 5 && i17 != 6) {
                    if (i17 != 3 && i17 != 8) {
                        if (i17 == 4) {
                            this.Z[i17].setOnTouchListener(new ui0(this, 1));
                            this.Z[i17].setInputType(0);
                            this.Z[i17].setFocusable(false);
                        } else {
                            this.Z[i17].setInputType(16385);
                            this.Z[i17].setImeOptions(268435461);
                        }
                    } else {
                        this.Z[i17].setOnTouchListener(new hi.x1(6, this, context));
                        this.Z[i17].setInputType(0);
                        this.Z[i17].setFocusable(false);
                    }
                } else {
                    this.Z[i17].setOnTouchListener(new ui0(this, 0));
                    this.Z[i17].setInputType(0);
                }
                HashMap hashMap3 = this.f47897u1;
                switch (i17) {
                    case 0:
                        if (tL_secureRequiredType2.native_names) {
                            this.Z[i17].setHintText(org.telegram.messenger.gd.N0(2131747307, null));
                        } else {
                            this.Z[i17].setHintText(org.telegram.messenger.gd.N0(2131747310, null));
                        }
                        str2 = "first_name";
                        break;
                    case 1:
                        if (tL_secureRequiredType2.native_names) {
                            this.Z[i17].setHintText(org.telegram.messenger.gd.N0(2131747311, null));
                        } else {
                            this.Z[i17].setHintText(org.telegram.messenger.gd.N0(2131747313, null));
                        }
                        str2 = "middle_name";
                        break;
                    case 2:
                        if (tL_secureRequiredType2.native_names) {
                            this.Z[i17].setHintText(org.telegram.messenger.gd.N0(2131747262, null));
                        } else {
                            this.Z[i17].setHintText(org.telegram.messenger.gd.N0(2131747264, null));
                        }
                        str2 = "last_name";
                        break;
                    case 3:
                        this.Z[i17].setHintText(org.telegram.messenger.gd.N0(2131747403, null));
                        str2 = "birth_date";
                        break;
                    case 4:
                        this.Z[i17].setHintText(org.telegram.messenger.gd.N0(2131747372, null));
                        str2 = "gender";
                        break;
                    case 5:
                        this.Z[i17].setHintText(org.telegram.messenger.gd.N0(2131747402, null));
                        str2 = "country_code";
                        break;
                    case 6:
                        this.Z[i17].setHintText(org.telegram.messenger.gd.N0(2131747280, null));
                        str2 = "residence_country_code";
                        break;
                    case 7:
                        this.Z[i17].setHintText(org.telegram.messenger.gd.N0(2131747383, null));
                        str3 = "document_no";
                        String str7 = str3;
                        hashMap2 = hashMap3;
                        str2 = str7;
                        break;
                    case 8:
                        this.Z[i17].setHintText(org.telegram.messenger.gd.N0(2131747376, null));
                        str3 = "expiry_date";
                        String str72 = str3;
                        hashMap2 = hashMap3;
                        str2 = str72;
                        break;
                    default:
                        i17++;
                        i16 = 7;
                        i13 = -1;
                        i6Var = null;
                }
                N1(hashMap2, this.Z[i17], str2);
                EditTextBoldCursor editTextBoldCursor3 = this.Z[i17];
                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                if (i17 != 0 && i17 != 2 && i17 != 1) {
                    this.Z[i17].addTextChangedListener(new org.telegram.ui.Components.wv0(this, editTextBoldCursor, str2, hashMap2));
                } else {
                    this.Z[i17].addTextChangedListener(new ej0(this, editTextBoldCursor, str2, 1));
                }
                this.Z[i17].setPadding(0, 0, 0, 0);
                EditTextBoldCursor editTextBoldCursor4 = this.Z[i17];
                if (org.telegram.messenger.gd.f24314a0) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                editTextBoldCursor4.setGravity(i11 | 16);
                cj0Var.addView(this.Z[i17], c8.na.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                this.Z[i17].setOnEditorActionListener(new ri0(this, 1));
                i17++;
                i16 = 7;
                i13 = -1;
                i6Var = null;
            } else {
                org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
                this.f47881n0 = y6Var;
                this.f47860d0.addView(y6Var, c8.na.o(-1, -2));
                org.telegram.ui.Cells.o4 o4Var5 = new org.telegram.ui.Cells.o4(context);
                this.f47876k0 = o4Var5;
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, o4Var5, null);
                this.f47860d0.addView(this.f47876k0, c8.na.o(-1, -2));
                this.f47855b0 = new EditTextBoldCursor[3];
                int i21 = 0;
                for (int i22 = 3; i21 < i22; i22 = 3) {
                    EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
                    this.f47855b0[i21] = editTextBoldCursor5;
                    cj0 cj0Var2 = new cj0(context, editTextBoldCursor5, 2);
                    cj0Var2.setWillNotDraw(false);
                    this.f47860d0.addView(cj0Var2, c8.na.o(-1, 64));
                    int i23 = org.telegram.ui.ActionBar.n6.f29451d6;
                    org.telegram.ui.ActionBar.u6.h(i23, cj0Var2, null);
                    if (i21 == 2) {
                        View view3 = new View(context);
                        this.U = view3;
                        org.telegram.ui.ActionBar.u6.h(i23, view3, null);
                        this.f47860d0.addView(this.U, c8.na.o(-1, i18));
                    }
                    this.f47855b0[i21].setTag(Integer.valueOf(i21));
                    this.f47855b0[i21].setSupportRtlHint(true);
                    this.f47855b0[i21].setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.u6.A(this.f47855b0[i21], org.telegram.ui.ActionBar.n6.H6, null);
                    EditTextBoldCursor editTextBoldCursor6 = this.f47855b0[i21];
                    int i24 = org.telegram.ui.ActionBar.n6.G6;
                    org.telegram.ui.ActionBar.u6.U(editTextBoldCursor6, i24, null);
                    org.telegram.ui.ActionBar.u6.z(this.f47855b0[i21], org.telegram.ui.ActionBar.n6.L6, null);
                    this.f47855b0[i21].setTransformHintToHeader(true);
                    this.f47855b0[i21].setBackgroundDrawable(null);
                    org.telegram.ui.ActionBar.u6.v(this.f47855b0[i21], i24, null);
                    this.f47855b0[i21].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                    this.f47855b0[i21].setCursorWidth(1.5f);
                    org.telegram.ui.ActionBar.u6.F(this.f47855b0[i21], org.telegram.ui.ActionBar.n6.f29580k6, org.telegram.ui.ActionBar.n6.f29598l6, org.telegram.ui.ActionBar.n6.f29672p7, null);
                    this.f47855b0[i21].setInputType(16385);
                    this.f47855b0[i21].setImeOptions(268435461);
                    if (i21 != 0) {
                        if (i21 != 1) {
                            if (i21 == 2) {
                                str = "last_name_native";
                            } else {
                                i21++;
                                i18 = 6;
                            }
                        } else {
                            str = "middle_name_native";
                        }
                    } else {
                        str = "first_name_native";
                    }
                    N1(hashMap2, this.f47855b0[i21], str);
                    EditTextBoldCursor editTextBoldCursor7 = this.f47855b0[i21];
                    editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
                    if (i21 == 0 || i21 == 2 || i21 == 1) {
                        this.f47855b0[i21].addTextChangedListener(new ej0(this, editTextBoldCursor5, str, 2));
                    }
                    this.f47855b0[i21].setPadding(0, 0, 0, 0);
                    EditTextBoldCursor editTextBoldCursor8 = this.f47855b0[i21];
                    if (org.telegram.messenger.gd.f24314a0) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    editTextBoldCursor8.setGravity(i10 | 16);
                    cj0Var2.addView(this.f47855b0[i21], c8.na.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.f47855b0[i21].setOnEditorActionListener(new ri0(this, 2));
                    i21++;
                    i18 = 6;
                }
                org.telegram.ui.Cells.z8 z8Var5 = new org.telegram.ui.Cells.z8(context);
                this.f47889r0 = z8Var5;
                this.f47860d0.addView(z8Var5, c8.na.o(-1, -2));
                int i25 = (this.f47857c > 0L ? 1 : (this.f47857c == 0L ? 0 : -1));
                TLRPC.TL_secureValue tL_secureValue = this.J;
                if (((i25 != 0 || this.G == null) && this.I != null && !this.f47901w0) || tL_secureValue != null) {
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
                    org.telegram.ui.ActionBar.u6.U(w9Var3.getTextView(), org.telegram.ui.ActionBar.n6.f29672p7, null);
                    org.telegram.ui.Cells.y N06 = org.telegram.ui.ActionBar.n6.N0(true);
                    org.telegram.ui.ActionBar.q6 M11 = org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.f29451d6);
                    org.telegram.ui.ActionBar.q6 M12 = org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.f29543i6);
                    w9Var3.setBackground(N06);
                    org.telegram.ui.ActionBar.u6.j(w9Var3, N06, M11, M12, null);
                    if (this.G == null) {
                        w9Var3.b(org.telegram.messenger.gd.N0(2131747393, null), false);
                    } else {
                        w9Var3.b(org.telegram.messenger.gd.N0(2131747398, null), false);
                    }
                    this.f47860d0.addView(w9Var3, c8.na.o(-1, -2));
                    w9Var3.setOnClickListener(new ti0(this, 1));
                    org.telegram.ui.Cells.z8 z8Var6 = this.f47889r0;
                    int i26 = org.telegram.ui.ActionBar.n6.f29415b7;
                    org.telegram.ui.ActionBar.u6.Z(z8Var6, context, 2131231232, i26);
                    org.telegram.ui.Cells.y6 y6Var2 = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
                    this.m0 = y6Var2;
                    org.telegram.ui.ActionBar.u6.Z(y6Var2, context, 2131231233, i26);
                    this.f47860d0.addView(this.m0, c8.na.o(-1, -2));
                } else {
                    org.telegram.ui.ActionBar.u6.Z(this.f47889r0, context, 2131231233, org.telegram.ui.ActionBar.n6.f29415b7);
                }
                U1();
                c1(false);
                return;
            }
        }
    }

    public final void j1(android.content.Context r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fk0.j1(android.content.Context):void");
    }

    public final void k1(Context context) {
        String str;
        String str2;
        TelephonyManager telephonyManager;
        ViewGroup frameLayout;
        this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131747294, null));
        this.Z0 = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.V0.add(0, split[2]);
                this.W0.put(split[2], split[0]);
                this.X0.put(split[0], split[2]);
                if (split.length > 3) {
                    this.Y0.put(split[0], split[3]);
                }
                this.Z0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        Collections.sort(this.V0, new ow0(13));
        String str3 = org.telegram.messenger.i10.i(this.currentAccount).f().phone;
        org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
        org.telegram.ui.ActionBar.u6.U(w9Var.getTextView(), org.telegram.ui.ActionBar.n6.f29691q6, null);
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.n6.N0(true);
        int i7 = org.telegram.ui.ActionBar.n6.f29451d6;
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.f29543i6);
        w9Var.setBackground(N0);
        org.telegram.ui.ActionBar.u6.j(w9Var, N0, M, M2, null);
        w9Var.b(org.telegram.messenger.gd.a0("PassportPhoneUseSame", null, 2131747290, pf.b.c().b("+" + str3)), false);
        this.f47860d0.addView(w9Var, c8.na.o(-1, -2));
        w9Var.setOnClickListener(new ti0(this, 16));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
        this.f47882o0 = z8Var;
        org.telegram.ui.ActionBar.u6.Z(z8Var, context, 2131231233, org.telegram.ui.ActionBar.n6.f29415b7);
        this.f47882o0.setText(org.telegram.messenger.gd.N0(2131747288, null));
        this.f47860d0.addView(this.f47882o0, c8.na.o(-1, -2));
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context);
        this.f47876k0 = o4Var;
        o4Var.setText(org.telegram.messenger.gd.N0(2131747291, null));
        org.telegram.ui.ActionBar.u6.h(i7, this.f47876k0, null);
        this.f47860d0.addView(this.f47876k0, c8.na.o(-1, -2));
        this.Z = new EditTextBoldCursor[3];
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 2) {
                this.Z[i10] = new org.telegram.ui.Components.g30(context);
            } else {
                this.Z[i10] = new EditTextBoldCursor(context);
            }
            if (i10 == 1) {
                frameLayout = org.telegram.messenger.f3.g(context, 0);
                this.f47860d0.addView(frameLayout, c8.na.o(-1, 50));
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, frameLayout, null);
            } else if (i10 == 2) {
                frameLayout = (ViewGroup) this.Z[1].getParent();
            } else {
                frameLayout = new FrameLayout(context);
                this.f47860d0.addView(frameLayout, c8.na.o(-1, 50));
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, frameLayout, null);
            }
            this.Z[i10].setTag(Integer.valueOf(i10));
            this.Z[i10].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.u6.D(this.Z[i10], org.telegram.ui.ActionBar.n6.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.Z[i10];
            int i11 = org.telegram.ui.ActionBar.n6.G6;
            org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i11, null);
            this.Z[i10].setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.u6.v(this.Z[i10], i11, null);
            this.Z[i10].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.Z[i10].setCursorWidth(1.5f);
            if (i10 == 0) {
                this.Z[i10].setOnTouchListener(new ui0(this, 3));
                this.Z[i10].setText(org.telegram.messenger.gd.N0(2131752122, null));
                this.Z[i10].setInputType(0);
                this.Z[i10].setFocusable(false);
            } else {
                this.Z[i10].setInputType(3);
                if (i10 == 2) {
                    this.Z[i10].setImeOptions(268435462);
                } else {
                    this.Z[i10].setImeOptions(268435461);
                }
            }
            EditTextBoldCursor editTextBoldCursor2 = this.Z[i10];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            int i12 = 5;
            if (i10 == 1) {
                TextView textView = new TextView(context);
                this.f47904x0 = textView;
                textView.setText("+");
                org.telegram.ui.ActionBar.u6.U(this.f47904x0, i11, null);
                this.f47904x0.setTextSize(1, 16.0f);
                frameLayout.addView(this.f47904x0, c8.na.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                this.Z[i10].setPadding(org.telegram.messenger.g0.L(10.0f), 0, 0, 0);
                this.Z[i10].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                this.Z[i10].setGravity(19);
                frameLayout.addView(this.Z[i10], c8.na.k(0.0f, 12.0f, 16.0f, 6.0f, 55, -2));
                this.Z[i10].addTextChangedListener(new pj0(this, 1));
            } else if (i10 == 2) {
                this.Z[i10].setPadding(0, 0, 0, 0);
                this.Z[i10].setGravity(19);
                this.Z[i10].setHintText(null);
                this.Z[i10].setHint(org.telegram.messenger.gd.N0(2131747178, null));
                frameLayout.addView(this.Z[i10], c8.na.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                this.Z[i10].addTextChangedListener(new ar(this, 3));
            } else {
                this.Z[i10].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
                EditTextBoldCursor editTextBoldCursor3 = this.Z[i10];
                if (!org.telegram.messenger.gd.f24314a0) {
                    i12 = 3;
                }
                editTextBoldCursor3.setGravity(i12);
                frameLayout.addView(this.Z[i10], c8.na.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            }
            this.Z[i10].setOnEditorActionListener(new ri0(this, 0));
            if (i10 == 2) {
                this.Z[i10].setOnKeyListener(new uf(this, 1));
            }
            if (i10 == 0) {
                View view = new View(context);
                this.f47878l0.add(view);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29452d7, view, null);
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, 1, 83));
            }
        }
        try {
            telephonyManager = (TelephonyManager) org.telegram.messenger.t0.f27013b.getSystemService("phone");
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        if (telephonyManager != null) {
            str = telephonyManager.getSimCountryIso().toUpperCase();
            if (str != null && (str2 = (String) this.Z0.get(str)) != null && this.V0.indexOf(str2) != -1) {
                this.Z[1].setText((CharSequence) this.W0.get(str2));
            }
            org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
            this.f47882o0 = z8Var2;
            org.telegram.ui.ActionBar.u6.Z(z8Var2, context, 2131231233, org.telegram.ui.ActionBar.n6.f29415b7);
            this.f47882o0.setText(org.telegram.messenger.gd.N0(2131747292, null));
            this.f47860d0.addView(this.f47882o0, c8.na.o(-1, -2));
        }
        str = null;
        if (str != null) {
            this.Z[1].setText((CharSequence) this.W0.get(str2));
        }
        org.telegram.ui.Cells.z8 z8Var22 = new org.telegram.ui.Cells.z8(context);
        this.f47882o0 = z8Var22;
        org.telegram.ui.ActionBar.u6.Z(z8Var22, context, 2131231233, org.telegram.ui.ActionBar.n6.f29415b7);
        this.f47882o0.setText(org.telegram.messenger.gd.N0(2131747292, null));
        this.f47860d0.addView(this.f47882o0, c8.na.o(-1, -2));
    }

    public final byte[] m1(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32 || bArr2 == null || bArr2.length != 32) {
            return null;
        }
        byte[] bArr3 = new byte[32];
        System.arraycopy(this.f47867f1, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(this.f47867f1, 32, bArr4, 0, 16);
        byte[] bArr5 = new byte[32];
        System.arraycopy(this.f47861d1, 0, bArr5, 0, 32);
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

    public final void n1(final TLRPC.TL_secureRequiredType tL_secureRequiredType, final TLRPC.TL_secureRequiredType tL_secureRequiredType2, final ArrayList arrayList, final boolean z10, final si0 si0Var, final vi0 vi0Var, final boolean z11) {
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
                final fk0 fk0Var = fk0.this;
                final uj0 uj0Var = vi0Var;
                final boolean z12 = z11;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType3 = tL_secureRequiredType2;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                final boolean z13 = z10;
                final ArrayList arrayList2 = arrayList;
                final Runnable runnable = si0Var;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        TLRPC.TL_secureData tL_secureData;
                        String str2;
                        LinearLayout linearLayout;
                        fk0 fk0Var2 = fk0.this;
                        TLRPC.TL_error tL_error2 = tL_error;
                        String str3 = null;
                        if (tL_error2 != null) {
                            uj0 uj0Var2 = uj0Var;
                            if (uj0Var2 != null) {
                                uj0Var2.f(tL_error2.text, null);
                            }
                            fk0Var2.Q1(org.telegram.messenger.gd.N0(2131689472, null), tL_error2.text);
                            return;
                        }
                        boolean z14 = z12;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType3;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType4;
                        boolean z15 = z13;
                        if (z14) {
                            if (tL_secureRequiredType5 != null) {
                                fk0Var2.L1(tL_secureRequiredType5);
                            } else {
                                fk0Var2.L1(tL_secureRequiredType6);
                            }
                        } else {
                            if (z15) {
                                fk0Var2.L1(tL_secureRequiredType6);
                            }
                            fk0Var2.L1(tL_secureRequiredType5);
                        }
                        int i7 = 0;
                        if (fk0Var2.f47854b == 8) {
                            ek0 ek0Var = (ek0) fk0Var2.f47890r1.remove(tL_secureRequiredType6);
                            if (ek0Var != null) {
                                fk0Var2.f47860d0.removeView(ek0Var);
                                View childAt = fk0Var2.f47860d0.getChildAt(linearLayout.getChildCount() - 6);
                                if (childAt instanceof ek0) {
                                    ((ek0) childAt).setNeedDivider(false);
                                }
                            }
                            fk0Var2.V1();
                        } else {
                            ArrayList arrayList3 = arrayList2;
                            if (tL_secureRequiredType5 != null && arrayList3 != null && arrayList3.size() > 1) {
                                int size = arrayList3.size();
                                int i10 = 0;
                                while (true) {
                                    if (i10 < size) {
                                        TLRPC.TL_secureRequiredType tL_secureRequiredType7 = (TLRPC.TL_secureRequiredType) arrayList3.get(i10);
                                        TLRPC.TL_secureValue v12 = fk0Var2.v1(tL_secureRequiredType7, false);
                                        if (v12 != null) {
                                            TLRPC.TL_secureData tL_secureData2 = v12.data;
                                            if (tL_secureData2 != null) {
                                                str2 = fk0.l1(tL_secureData2.data, fk0Var2.m1(tL_secureData2.secret, tL_secureData2.data_hash), v12.data.data_hash);
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
                            if (z15) {
                                if (arrayList3 != null) {
                                    i7 = arrayList3.size();
                                }
                                fk0Var2.P1(tL_secureRequiredType6, null, null, tL_secureRequiredType5, str, z14, i7);
                            } else {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType8 = tL_secureRequiredType5;
                                String str4 = str;
                                TLRPC.TL_secureValue v13 = fk0Var2.v1(tL_secureRequiredType6, false);
                                if (v13 != null && (tL_secureData = v13.data) != null) {
                                    str3 = fk0.l1(tL_secureData.data, fk0Var2.m1(tL_secureData.secret, tL_secureData.data_hash), v13.data.data_hash);
                                }
                                if (arrayList3 != null) {
                                    i7 = arrayList3.size();
                                }
                                fk0Var2.P1(tL_secureRequiredType6, null, str3, tL_secureRequiredType8, str4, z14, i7);
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
        int nextInt = Utilities.f22875b.nextInt(208) + 32;
        while ((bArr.length + nextInt) % 16 != 0) {
            nextInt++;
        }
        byte[] bArr2 = new byte[nextInt];
        Utilities.f22875b.nextBytes(bArr2);
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
        System.arraycopy(this.f47867f1, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(this.f47867f1, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(this.f47861d1, 0, bArr8, 0, 32);
        Utilities.b(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        byte[] r11 = Utilities.r(bArr8, o4);
        byte[] bArr9 = new byte[32];
        System.arraycopy(r11, 0, bArr9, 0, 32);
        byte[] bArr10 = new byte[16];
        System.arraycopy(r11, 32, bArr10, 0, 16);
        byte[] bArr11 = new byte[32];
        System.arraycopy(t12, 0, bArr11, 0, 32);
        Utilities.b(bArr11, bArr9, bArr10, 0, 32, 0, 1);
        a8.r7 r7Var = new a8.r7(17, (byte) 0);
        r7Var.d = bArr3;
        r7Var.f616b = bArr11;
        r7Var.f618e = o4;
        r7Var.f617c = t12;
        r7Var.f619f = new org.telegram.messenger.zv(bArr4, bArr5);
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
                        obj.f28309a = intent.getData();
                        arrayList.add(obj);
                        K1(arrayList);
                        return;
                    } else if (getParentActivity() != null) {
                        Toast.makeText(getParentActivity(), org.telegram.messenger.gd.N0(2131743586, null), 0).show();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            g1();
            org.telegram.ui.Components.ti tiVar = this.S0;
            if (tiVar != null) {
                tiVar.f39967e2.j0(i7, intent, this.R0);
            }
            this.R0 = null;
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i7 = this.f47854b;
        if (i7 == 7) {
            if (z10) {
                int i10 = this.J1;
                org.telegram.ui.Components.hu0[] hu0VarArr = this.K1;
                hu0VarArr[i10].c(true);
                for (org.telegram.ui.Components.hu0 hu0Var : hu0VarArr) {
                    if (hu0Var != null) {
                        hu0Var.e();
                    }
                }
            }
        } else if (i7 != 0 && i7 != 5) {
            if (i7 == 1 || i7 == 2) {
                return !b1(z10);
            }
        } else if (z10) {
            a1(false);
        }
        return true;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        if (this.f47854b == 3 && dialog == this.M1) {
            ArrayList arrayList = this.N1;
            if (!arrayList.isEmpty()) {
                getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.U1);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.V1);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25264p0);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25277r0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.U1);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.V1);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25264p0);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25277r0);
        int i7 = 0;
        a1(false);
        org.telegram.ui.Components.ti tiVar = this.S0;
        if (tiVar != null) {
            tiVar.L();
            this.S0.k1();
        }
        if (this.f47854b == 7) {
            while (true) {
                org.telegram.ui.Components.hu0[] hu0VarArr = this.K1;
                if (i7 >= hu0VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.hu0 hu0Var = hu0VarArr[i7];
                if (hu0Var != null) {
                    hu0Var.e();
                }
                i7++;
            }
            org.telegram.ui.ActionBar.t1 t1Var = this.L1;
            if (t1Var != null) {
                try {
                    t1Var.dismiss();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                this.L1 = null;
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.ti tiVar = this.S0;
        if (tiVar != null) {
            tiVar.m1();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.ti tiVar;
        org.telegram.ui.Cells.w9 w9Var;
        int i10 = this.f47854b;
        if ((i10 == 1 || i10 == 2) && (tiVar = this.S0) != null) {
            if (i7 == 17) {
                tiVar.f39967e2.X(false);
            } else if (i7 == 21) {
                if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String N0 = org.telegram.messenger.gd.N0(2131689472, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                    t1Var.S = N0;
                    t1Var.U = org.telegram.messenger.gd.N0(2131747118, null);
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131747106, null), new vi0(this, 0));
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                    alertDialog$Builder.p();
                }
            } else if (i7 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                J1(0);
            } else if (i7 == 22 && iArr != null && iArr.length > 0 && iArr[0] == 0 && (w9Var = this.f47892s0) != null) {
                w9Var.callOnClick();
            }
        } else if (i10 == 3 && i7 == 6) {
            S1(false, this.F1, this.G1, this.H1, this.I1);
        }
    }

    @Override
    public final void onResume() {
        ViewGroup[] viewGroupArr;
        ViewGroup viewGroup;
        super.onResume();
        org.telegram.ui.Components.ti tiVar = this.S0;
        if (tiVar != null) {
            tiVar.n1();
        }
        if (this.f47854b == 5 && (viewGroupArr = this.f47852a0) != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
            this.Z[0].requestFocus();
            org.telegram.messenger.g0.I3(this.Z[0]);
            org.telegram.messenger.g0.h3(new si0(this, 0), 200L);
        }
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fk0.onThemeColorsChanged():void");
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (this.f47873i1 != null) {
            org.telegram.messenger.g0.g3(new si0(this, 1));
        }
        int i7 = this.f47854b;
        if (i7 == 5) {
            if (z10) {
                if (this.f47852a0[0].getVisibility() == 0) {
                    this.Z[0].requestFocus();
                    org.telegram.messenger.g0.I3(this.Z[0]);
                }
                if (this.O0 == 2) {
                    F1(false);
                }
            }
        } else if (i7 == 7) {
            if (z10) {
                this.K1[this.J1].j();
            }
        } else if (i7 == 4) {
            if (z10) {
                this.Z[0].requestFocus();
                org.telegram.messenger.g0.I3(this.Z[0]);
            }
        } else if (i7 == 6) {
            if (z10) {
                this.Z[0].requestFocus();
                org.telegram.messenger.g0.I3(this.Z[0]);
            }
        } else if (i7 != 2 && i7 != 1) {
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
        int i7 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.Z;
            if (i7 >= editTextBoldCursorArr.length) {
                break;
            }
            sb2.append((CharSequence) editTextBoldCursorArr[i7].getText());
            sb2.append(",");
            i7++;
        }
        if (this.f47855b0 != null) {
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.f47855b0;
                if (i10 >= editTextBoldCursorArr2.length) {
                    break;
                }
                sb2.append((CharSequence) editTextBoldCursorArr2[i10].getText());
                sb2.append(",");
                i10++;
            }
        }
        ArrayList arrayList = this.f47875j1;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            sb2.append(((org.telegram.messenger.yv) arrayList.get(i11)).f28288b.f28629id);
        }
        org.telegram.messenger.yv yvVar = this.f47879m1;
        if (yvVar != null) {
            sb2.append(yvVar.f28288b.f28629id);
        }
        org.telegram.messenger.yv yvVar2 = this.n1;
        if (yvVar2 != null) {
            sb2.append(yvVar2.f28288b.f28629id);
        }
        org.telegram.messenger.yv yvVar3 = this.f47877k1;
        if (yvVar3 != null) {
            sb2.append(yvVar3.f28288b.f28629id);
        }
        ArrayList arrayList2 = this.l1;
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            sb2.append(((org.telegram.messenger.yv) arrayList2.get(i12)).f28288b.f28629id);
        }
        return sb2.toString();
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.R0 = bundle.getString("path");
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.R0;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final TLRPC.TL_secureValue v1(TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z10) {
        String[] strArr;
        if (tL_secureRequiredType != null) {
            int size = this.E.values.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.TL_secureValue tL_secureValue = this.E.values.get(i7);
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
        int size = this.E.values.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.E.values.get(i7).type.getClass() == cls) {
                return false;
            }
        }
        return true;
    }

    public final boolean y1() {
        String str = this.f47851a;
        if (str != null && !str.equals(q1())) {
            return false;
        }
        return true;
    }

    public fk0(int i7, long j3, String str, String str2, String str3, String str4, String str5, TL_account.authorizationForm authorizationform, TL_account.Password password) {
        this(i7, authorizationform, password, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (HashMap) null, (HashMap) null);
        int i10;
        String s12;
        String str6;
        String str7;
        String str8;
        String str9;
        this.f47857c = j3;
        this.d = str3;
        this.f47862e = str4;
        this.h = str;
        this.f47888r = str2;
        this.f47880n = str5;
        if (i7 != 0 || authorizationform.errors.isEmpty()) {
            return;
        }
        try {
            Collections.sort(authorizationform.errors, new mj0(this));
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
                HashMap hashMap = (HashMap) this.f47899v1.get(s12);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    i10 = size;
                    this.f47899v1.put(s12, hashMap);
                    this.f47902w1.put(s12, str6);
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
