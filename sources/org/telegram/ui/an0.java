package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
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
public final class an0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout A0;
    public String A1;
    public ImageView B0;
    public qm0 B1;
    public TextView C0;
    public boolean C1;
    public TextView D0;
    public final zl0 D1;
    public final TLRPC.TL_secureRequiredType E;
    public TextView E0;
    public String E1;
    public TLRPC.TL_secureRequiredType F;
    public org.telegram.ui.Components.vz F0;
    public Runnable F1;
    public ArrayList G;
    public org.telegram.ui.Cells.e9 G0;
    public om0 G1;
    public final TLRPC.TL_secureValue H;
    public org.telegram.ui.Cells.e9 H0;
    public qm0 H1;
    public final TLRPC.TL_secureValue I;
    public ImageView I0;
    public int I1;
    public TL_account.Password J;
    public TextView J0;
    public final org.telegram.ui.Components.tw0[] J1;
    public TLRPC.TL_auth_sentCode K;
    public TextView K0;
    public org.telegram.ui.ActionBar.c2 K1;
    public org.telegram.ui.ActionBar.u0 L;
    public FrameLayout L0;
    public Dialog L1;
    public AnimatorSet M;
    public TextView M0;
    public final ArrayList M1;
    public org.telegram.ui.Components.cr N;
    public int N0;
    public int N1;
    public TextView O;
    public final byte[] O0;
    public int O1;
    public org.telegram.ui.Components.cr P;
    public final byte[] P0;
    public int P1;
    public FrameLayout Q;
    public String Q0;
    public org.telegram.ui.Cells.ca R;
    public org.telegram.ui.Components.ti R0;
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
    public org.telegram.ui.Cells.ca X;
    public final HashMap X0;
    public EditTextBoldCursor[] Y;
    public HashMap Y0;
    public ViewGroup[] Z;
    public boolean Z0;
    public String f35701a;
    public EditTextBoldCursor[] f35702a0;
    public boolean f35703a1;
    public final int f35704b;
    public ScrollView f35705b0;
    public long f35706b1;
    public long f35707c;
    public LinearLayout f35708c0;
    public byte[] f35709c1;
    public final String d;
    public LinearLayout f35710d0;
    public String f35711d1;
    public final String e;
    public LinearLayout f35712e0;
    public byte[] f35713e1;
    public boolean f35714f;
    public LinearLayout f35715f0;
    public boolean f35716f1;
    public LinearLayout f35717g0;
    public boolean f35718g1;
    public final String h;
    public LinearLayout f35719h0;
    public an0 f35720h1;
    public LinearLayout f35721i0;
    public final ArrayList f35722i1;
    public org.telegram.ui.Cells.l4 f35723j0;
    public SecureDocument f35724j1;
    public final ArrayList f35725k0;
    public final ArrayList f35726k1;
    public org.telegram.ui.Cells.b7 f35727l0;
    public SecureDocument l1;
    public org.telegram.ui.Cells.b7 m0;
    public SecureDocument f35728m1;
    public final String f35729n;
    public org.telegram.ui.Cells.e9 f35730n0;
    public final HashMap f35731n1;
    public org.telegram.ui.Cells.e9 f35732o0;
    public final HashMap f35733o1;
    public org.telegram.ui.Cells.e9 f35734p0;
    public final HashMap f35735p1;
    public org.telegram.ui.Cells.e9 f35736q0;
    public final HashMap f35737q1;
    public final String f35738r;
    public org.telegram.ui.Cells.ca f35739r0;
    public final HashMap f35740r1;
    public String f35741s;
    public int f35742s0;
    public final HashMap f35743s1;
    public final boolean[] f35744t0;
    public final HashMap f35745t1;
    public boolean f35746u0;
    public final HashMap f35747u1;
    public String v;
    public boolean f35748v0;
    public final HashMap f35749v1;
    public String f35750w;
    public TextView f35751w0;
    public HashMap f35752w1;
    public final int[] f35753x;
    public org.telegram.ui.Cells.ca f35754x0;
    public HashMap f35755x1;
    public TL_account.authorizationForm f35756y;
    public org.telegram.ui.Cells.ca f35757y0;
    public final HashMap f35758y1;
    public org.telegram.ui.Cells.b7 f35759z0;
    public String f35760z1;

    public an0(int i10, TL_account.authorizationForm authorizationform, TL_account.Password password, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureValue tL_secureValue, TLRPC.TL_secureRequiredType tL_secureRequiredType2, TLRPC.TL_secureValue tL_secureValue2, HashMap hashMap, HashMap hashMap2) {
        super(null);
        this.f35741s = "";
        this.v = "";
        this.f35753x = new int[3];
        this.f35725k0 = new ArrayList();
        this.f35744t0 = new boolean[3];
        this.f35746u0 = true;
        this.U0 = new ArrayList();
        this.V0 = new HashMap();
        this.W0 = new HashMap();
        this.X0 = new HashMap();
        this.f35722i1 = new ArrayList();
        this.f35726k1 = new ArrayList();
        this.f35731n1 = new HashMap();
        this.f35733o1 = new HashMap();
        this.f35735p1 = new HashMap();
        this.f35737q1 = new HashMap();
        this.f35740r1 = new HashMap();
        this.f35747u1 = new HashMap();
        this.f35749v1 = new HashMap();
        this.f35758y1 = new HashMap();
        this.D1 = new zl0(this);
        this.f35704b = i10;
        this.f35756y = authorizationform;
        this.E = tL_secureRequiredType;
        if (tL_secureRequiredType != null) {
            this.f35746u0 = tL_secureRequiredType.native_names;
        }
        this.H = tL_secureValue;
        this.F = tL_secureRequiredType2;
        this.I = tL_secureValue2;
        this.J = password;
        this.f35743s1 = hashMap;
        this.f35745t1 = hashMap2;
        if (i10 == 3) {
            this.M1 = new ArrayList();
        } else if (i10 == 7) {
            this.J1 = new org.telegram.ui.Components.tw0[3];
        }
        if (hashMap == null) {
            this.f35743s1 = new HashMap();
        }
        if (hashMap2 == null) {
            this.f35745t1 = new HashMap();
        }
        if (i10 == 5) {
            if (UserConfig.getInstance(this.currentAccount).savedPasswordHash != null && UserConfig.getInstance(this.currentAccount).savedSaltedPassword != null) {
                this.N0 = 1;
                this.O0 = UserConfig.getInstance(this.currentAccount).savedPasswordHash;
                this.P0 = UserConfig.getInstance(this.currentAccount).savedSaltedPassword;
            }
            TL_account.Password password2 = this.J;
            if (password2 == null) {
                v1();
            } else {
                TwoStepVerificationActivity.m0(password2);
                if (this.N0 == 1) {
                    A1(true);
                }
            }
            if (SharedConfig.isPassportConfigLoaded()) {
                return;
            }
            TLRPC.TL_help_getPassportConfig tL_help_getPassportConfig = new TLRPC.TL_help_getPassportConfig();
            tL_help_getPassportConfig.hash = SharedConfig.passportConfigHash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_help_getPassportConfig, new ci.d6(18));
        }
    }

    public static int B0(an0 an0Var, String str) {
        an0Var.getClass();
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

    public static boolean C0(org.telegram.ui.an0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an0.C0(org.telegram.ui.an0):boolean");
    }

    public static void I0(an0 an0Var, EditTextBoldCursor editTextBoldCursor, String str, Editable editable, boolean z10) {
        String str2;
        String str3;
        String str4;
        String str5;
        HashMap hashMap = an0Var.f35758y1;
        if (hashMap != null && (str3 = (String) hashMap.get(str)) != null) {
            if (TextUtils.equals(str3, editable)) {
                HashMap hashMap2 = an0Var.f35752w1;
                if (hashMap2 != null && (str5 = (String) hashMap2.get(str)) != null) {
                    editTextBoldCursor.setErrorText(str5);
                } else {
                    HashMap hashMap3 = an0Var.f35755x1;
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
            an0Var.Z0(false);
        }
    }

    public static void L0(an0 an0Var, int i10) {
        an0Var.currentAccount = i10;
    }

    public static int M0(an0 an0Var) {
        return an0Var.currentAccount;
    }

    public static void O1(EditTextBoldCursor[] editTextBoldCursorArr, boolean z10, boolean z11) {
        if (editTextBoldCursorArr != null) {
            for (EditTextBoldCursor editTextBoldCursor : editTextBoldCursorArr) {
                if (editTextBoldCursor != null) {
                    org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, null);
                    if (z10) {
                        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 34, org.telegram.ui.ActionBar.k6.H6, null);
                        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 35, org.telegram.ui.ActionBar.k6.L6, null);
                        if (z11) {
                            int paddingLeft = editTextBoldCursor.getPaddingLeft();
                            int paddingTop = editTextBoldCursor.getPaddingTop();
                            int paddingRight = editTextBoldCursor.getPaddingRight();
                            int paddingBottom = editTextBoldCursor.getPaddingBottom();
                            org.telegram.ui.ActionBar.r6.H(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f21310k6, org.telegram.ui.ActionBar.k6.f21327l6, org.telegram.ui.ActionBar.k6.f21404p7, null);
                            if (editTextBoldCursor.getPaddingLeft() != paddingLeft || editTextBoldCursor.getPaddingTop() != paddingTop || editTextBoldCursor.getPaddingRight() != paddingRight || editTextBoldCursor.getPaddingBottom() != paddingBottom) {
                                editTextBoldCursor.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void U(an0 an0Var, TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery) {
        TL_account.Password password = an0Var.J;
        password.email_unconfirmed_pattern = tL_auth_passwordRecovery.email_pattern;
        an0Var.presentFragment(new bg1(an0Var.currentAccount, 4, password));
    }

    public static void V(an0 an0Var) {
        ArrayList arrayList;
        int i10;
        int i11;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        HashMap hashMap = an0Var.f35740r1;
        HashMap hashMap2 = an0Var.f35737q1;
        String str = an0Var.f35738r;
        ArrayList arrayList2 = new ArrayList();
        int size = an0Var.f35756y.required_types.size();
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.SecureRequiredType secureRequiredType = an0Var.f35756y.required_types.get(i12);
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
                                        if (an0Var.q1(tL_secureRequiredType5, true) != null) {
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
            TLRPC.TL_secureValue q12 = an0Var.q1(tL_secureRequiredType, true);
            if (q12 == null) {
                Vibrator vibrator = (Vibrator) an0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                zm0 zm0Var = (zm0) hashMap2.get(tL_secureRequiredType);
                if (zm0Var == null && (tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    zm0Var = (zm0) hashMap2.get(tL_secureRequiredType2);
                }
                AndroidUtilities.shakeView(zm0Var);
                return;
            }
            HashMap hashMap3 = (HashMap) an0Var.f35747u1.get(n1(tL_secureRequiredType.type));
            if (hashMap3 != null && !hashMap3.isEmpty()) {
                Vibrator vibrator2 = (Vibrator) an0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                zm0 zm0Var2 = (zm0) hashMap2.get(tL_secureRequiredType);
                if (zm0Var2 == null && (tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    zm0Var2 = (zm0) hashMap2.get(tL_secureRequiredType3);
                }
                AndroidUtilities.shakeView(zm0Var2);
                return;
            }
            boolean z10 = tL_secureRequiredType.selfie_required;
            boolean z11 = tL_secureRequiredType.translation_required;
            ?? obj = new Object();
            obj.f35698a = q12;
            obj.f35699b = z10;
            obj.f35700c = z11;
            arrayList2.add(obj);
        }
        an0Var.M1(false, true);
        TL_account.acceptAuthorization acceptauthorization = new TL_account.acceptAuthorization();
        acceptauthorization.bot_id = an0Var.f35707c;
        acceptauthorization.scope = an0Var.h;
        acceptauthorization.public_key = str;
        JSONObject jSONObject = new JSONObject();
        int size3 = arrayList2.size();
        int i14 = 0;
        while (i14 < size3) {
            am0 am0Var = (am0) arrayList2.get(i14);
            TLRPC.TL_secureValue tL_secureValue = am0Var.f35698a;
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
                        byte[] h12 = an0Var.h1(tL_secureData.secret, tL_secureData.data_hash);
                        arrayList = arrayList2;
                        try {
                            jSONObject2.put("data_hash", Base64.encodeToString(tL_secureValue.data.data_hash, 2));
                            jSONObject2.put("secret", Base64.encodeToString(h12, 2));
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
                                    byte[] h13 = an0Var.h1(tL_secureFile.secret, tL_secureFile.file_hash);
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("file_hash", Base64.encodeToString(tL_secureFile.file_hash, 2));
                                    jSONObject4.put("secret", Base64.encodeToString(h13, 2));
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
                        byte[] h14 = an0Var.h1(tL_secureFile2.secret, tL_secureFile2.file_hash);
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("file_hash", Base64.encodeToString(tL_secureFile2.file_hash, 2));
                        jSONObject5.put("secret", Base64.encodeToString(h14, 2));
                        jSONObject3.put("front_side", jSONObject5);
                    }
                    TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile2;
                        byte[] h15 = an0Var.h1(tL_secureFile3.secret, tL_secureFile3.file_hash);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("file_hash", Base64.encodeToString(tL_secureFile3.file_hash, 2));
                        jSONObject6.put("secret", Base64.encodeToString(h15, 2));
                        jSONObject3.put("reverse_side", jSONObject6);
                    }
                    if (am0Var.f35699b) {
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile3;
                            byte[] h16 = an0Var.h1(tL_secureFile4.secret, tL_secureFile4.file_hash);
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("file_hash", Base64.encodeToString(tL_secureFile4.file_hash, 2));
                            jSONObject7.put("secret", Base64.encodeToString(h16, 2));
                            jSONObject3.put("selfie", jSONObject7);
                        }
                    }
                    if (am0Var.f35700c && !tL_secureValue.translation.isEmpty()) {
                        JSONArray jSONArray2 = new JSONArray();
                        int size5 = tL_secureValue.translation.size();
                        for (int i16 = 0; i16 < size5; i16++) {
                            TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) tL_secureValue.translation.get(i16);
                            byte[] h17 = an0Var.h1(tL_secureFile5.secret, tL_secureFile5.file_hash);
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("file_hash", Base64.encodeToString(tL_secureFile5.file_hash, 2));
                            jSONObject8.put("secret", Base64.encodeToString(h17, 2));
                            jSONArray2.put(jSONObject8);
                        }
                        jSONObject3.put("translation", jSONArray2);
                    }
                    jSONObject.put(n1(tL_secureValue.type), jSONObject3);
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
        Object obj2 = an0Var.d;
        if (obj2 != null) {
            try {
                jSONObject9.put("payload", obj2);
            } catch (Exception unused6) {
            }
        }
        Object obj3 = an0Var.e;
        if (obj3 != null) {
            try {
                jSONObject9.put("nonce", obj3);
            } catch (Exception unused7) {
            }
        }
        com.google.android.gms.internal.cast.z5 j12 = an0Var.j1(AndroidUtilities.getStringBytes(jSONObject9.toString()));
        TLRPC.TL_secureCredentialsEncrypted tL_secureCredentialsEncrypted = new TLRPC.TL_secureCredentialsEncrypted();
        acceptauthorization.credentials = tL_secureCredentialsEncrypted;
        tL_secureCredentialsEncrypted.hash = (byte[]) j12.d;
        tL_secureCredentialsEncrypted.data = (byte[]) j12.f6892a;
        try {
            String replace = str.replaceAll("\\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "");
            Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA1AndMGF1Padding");
            cipher.init(1, (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(replace, 0))));
            acceptauthorization.credentials.secret = cipher.doFinal((byte[]) j12.f6894c);
        } catch (Exception e) {
            FileLog.e(e);
        }
        ConnectionsManager.getInstance(an0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(an0Var.currentAccount).sendRequest(acceptauthorization, new ol0(an0Var, 1)), an0Var.classGuid);
    }

    public static void W(an0 an0Var, TLRPC.TL_error tL_error, String str, qm0 qm0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        if (tL_error == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("phone", str);
            an0 an0Var2 = new an0(7, an0Var.f35756y, an0Var.J, an0Var.E, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
            an0Var2.currentAccount = an0Var.currentAccount;
            an0Var2.f35713e1 = an0Var.f35713e1;
            an0Var2.f35709c1 = an0Var.f35709c1;
            an0Var2.B1 = qm0Var;
            an0Var2.K = (TLRPC.TL_auth_sentCode) tLObject;
            an0Var.presentFragment(an0Var2, true);
            return;
        }
        org.telegram.ui.Components.f5.f0(an0Var.currentAccount, tL_error, an0Var, sendverifyphonecode, str);
    }

    public static void X(an0 an0Var, SecureDocument secureDocument, int i10) {
        HashMap hashMap = an0Var.f35731n1;
        int i11 = an0Var.S0;
        if (i11 == 1) {
            SecureDocument secureDocument2 = an0Var.f35724j1;
            if (secureDocument2 != null) {
                ym0 ym0Var = (ym0) hashMap.remove(secureDocument2);
                if (ym0Var != null) {
                    an0Var.f35717g0.removeView(ym0Var);
                }
                an0Var.f35724j1 = null;
            }
        } else if (i11 == 4) {
            if (an0Var.f35726k1.size() >= 20) {
                return;
            }
        } else if (i11 == 2) {
            SecureDocument secureDocument3 = an0Var.l1;
            if (secureDocument3 != null) {
                ym0 ym0Var2 = (ym0) hashMap.remove(secureDocument3);
                if (ym0Var2 != null) {
                    an0Var.f35712e0.removeView(ym0Var2);
                }
                an0Var.l1 = null;
            }
        } else if (i11 == 3) {
            SecureDocument secureDocument4 = an0Var.f35728m1;
            if (secureDocument4 != null) {
                ym0 ym0Var3 = (ym0) hashMap.remove(secureDocument4);
                if (ym0Var3 != null) {
                    an0Var.f35715f0.removeView(ym0Var3);
                }
                an0Var.f35728m1 = null;
            }
        } else if (i11 == 0 && an0Var.f35722i1.size() >= 20) {
            return;
        }
        an0Var.f35733o1.put(secureDocument.path, secureDocument);
        an0Var.L.setEnabled(false);
        an0Var.L.setAlpha(0.5f);
        FileLoader.getInstance(an0Var.currentAccount).uploadFile(secureDocument.path, false, true, 16777216);
        an0Var.Q0(secureDocument, i10);
        an0Var.S1(i10);
    }

    public static void Y(org.telegram.ui.an0 r9, boolean r10, java.lang.String r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an0.Y(org.telegram.ui.an0, boolean, java.lang.String):void");
    }

    public static boolean Y0(byte[] bArr, Long l4) {
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

    public static void Z(int i10, String str, SecureDocument secureDocument, ym0 ym0Var, an0 an0Var) {
        HashMap hashMap = an0Var.f35733o1;
        an0Var.f35731n1.remove(secureDocument);
        if (i10 == 1) {
            an0Var.f35724j1 = null;
            an0Var.f35717g0.removeView(ym0Var);
        } else if (i10 == 4) {
            an0Var.f35726k1.remove(secureDocument);
            an0Var.f35719h0.removeView(ym0Var);
        } else if (i10 == 2) {
            an0Var.l1 = null;
            an0Var.f35712e0.removeView(ym0Var);
        } else if (i10 == 3) {
            an0Var.f35728m1 = null;
            an0Var.f35715f0.removeView(ym0Var);
        } else {
            an0Var.f35722i1.remove(secureDocument);
            an0Var.f35710d0.removeView(ym0Var);
        }
        if (str != null) {
            HashMap hashMap2 = an0Var.f35755x1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
            HashMap hashMap3 = an0Var.f35758y1;
            if (hashMap3 != null) {
                hashMap3.remove(str);
            }
        }
        an0Var.S1(i10);
        String str2 = secureDocument.path;
        if (str2 != null && hashMap.remove(str2) != null) {
            if (hashMap.isEmpty()) {
                an0Var.L.setEnabled(true);
                an0Var.L.setAlpha(1.0f);
            }
            FileLoader.getInstance(an0Var.currentAccount).cancelFileUpload(secureDocument.path, false);
        }
    }

    public static void a0(an0 an0Var) {
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        for (int i10 = 0; i10 < an0Var.f35756y.values.size(); i10++) {
            deletesecurevalue.types.add(an0Var.f35756y.values.get(i10).type);
        }
        an0Var.x1();
        ConnectionsManager.getInstance(an0Var.currentAccount).sendRequest(deletesecurevalue, new ol0(an0Var, 2));
    }

    public static void b0(an0 an0Var) {
        bg1 bg1Var = new bg1(an0Var.currentAccount, 0, an0Var.J);
        bg1Var.Y = true;
        an0Var.presentFragment(bg1Var);
    }

    public static void c0(an0 an0Var) {
        if (an0Var.J.has_recovery) {
            an0Var.x1();
            ConnectionsManager.getInstance(an0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(an0Var.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new ol0(an0Var, 0), 10), an0Var.classGuid);
        } else if (an0Var.getParentActivity() == null) {
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(an0Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.RestorePasswordResetAccount), new nl0(an0Var, 4));
            alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
            String string = LocaleController.getString(R.string.RestorePasswordNoEmailText);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
            c2Var.T = string;
            an0Var.showDialog(c2Var);
        }
    }

    public static void d0(an0 an0Var) {
        Activity parentActivity = an0Var.getParentActivity();
        pf.d.r(parentActivity, "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(an0Var.currentAccount).getClientPhone());
    }

    public static int e0(an0 an0Var) {
        return an0Var.currentAccount;
    }

    public static String g1(byte[] bArr, byte[] bArr2, byte[] bArr3) {
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

    public static int h0(an0 an0Var) {
        return an0Var.currentAccount;
    }

    public static String m1(SecureDocument secureDocument) {
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

    public static String n1(TLRPC.SecureValueType secureValueType) {
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

    public static byte[] o1() {
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

    public static String p1(TLRPC.SecureValueType secureValueType) {
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

    public static int q0(an0 an0Var) {
        return an0Var.currentAccount;
    }

    public static int r0(an0 an0Var) {
        return an0Var.currentAccount;
    }

    public static int s0(an0 an0Var) {
        return an0Var.currentAccount;
    }

    public static boolean s1(TLRPC.SecureValueType secureValueType) {
        if (!(secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) && !(secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) && !(secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) && !(secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) && !(secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement)) {
            return false;
        }
        return true;
    }

    public static int u0(an0 an0Var) {
        return an0Var.currentAccount;
    }

    public static boolean u1(TLRPC.SecureValueType secureValueType) {
        if (!(secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) && !(secureValueType instanceof TLRPC.TL_secureValueTypePassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
            return false;
        }
        return true;
    }

    public final void A1(boolean z10) {
        String obj;
        if (z10) {
            obj = null;
        } else {
            obj = this.Y[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                z1(false);
                return;
            }
            M1(true, true);
        }
        Utilities.globalQueue.postRunnable(new v90(this, z10, obj, 2));
    }

    public final void B1() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (r1(TLRPC.TL_secureValueTypePhone.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentPhone));
            arrayList2.add(TLRPC.TL_secureValueTypePhone.class);
        }
        if (r1(TLRPC.TL_secureValueTypeEmail.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentEmail));
            arrayList2.add(TLRPC.TL_secureValueTypeEmail.class);
        }
        if (r1(TLRPC.TL_secureValueTypePersonalDetails.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentIdentity));
            arrayList2.add(TLRPC.TL_secureValueTypePersonalDetails.class);
        }
        if (r1(TLRPC.TL_secureValueTypePassport.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentPassport));
            arrayList2.add(TLRPC.TL_secureValueTypePassport.class);
        }
        if (r1(TLRPC.TL_secureValueTypeInternalPassport.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentInternalPassport));
            arrayList2.add(TLRPC.TL_secureValueTypeInternalPassport.class);
        }
        if (r1(TLRPC.TL_secureValueTypePassportRegistration.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentPassportRegistration));
            arrayList2.add(TLRPC.TL_secureValueTypePassportRegistration.class);
        }
        if (r1(TLRPC.TL_secureValueTypeTemporaryRegistration.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentTemporaryRegistration));
            arrayList2.add(TLRPC.TL_secureValueTypeTemporaryRegistration.class);
        }
        if (r1(TLRPC.TL_secureValueTypeIdentityCard.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentIdentityCard));
            arrayList2.add(TLRPC.TL_secureValueTypeIdentityCard.class);
        }
        if (r1(TLRPC.TL_secureValueTypeDriverLicense.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentDriverLicence));
            arrayList2.add(TLRPC.TL_secureValueTypeDriverLicense.class);
        }
        if (r1(TLRPC.TL_secureValueTypeAddress.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentAddress));
            arrayList2.add(TLRPC.TL_secureValueTypeAddress.class);
        }
        if (r1(TLRPC.TL_secureValueTypeUtilityBill.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentUtilityBill));
            arrayList2.add(TLRPC.TL_secureValueTypeUtilityBill.class);
        }
        if (r1(TLRPC.TL_secureValueTypeBankStatement.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentBankStatement));
            arrayList2.add(TLRPC.TL_secureValueTypeBankStatement.class);
        }
        if (r1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentRentalAgreement));
            arrayList2.add(TLRPC.TL_secureValueTypeRentalAgreement.class);
        }
        if (getParentActivity() != null && !arrayList.isEmpty()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.PassportNoDocumentsAdd);
            alertDialog$Builder.f((CharSequence[]) arrayList.toArray(new CharSequence[0]), new mg.j(9, this, arrayList2));
            showDialog(alertDialog$Builder.f20678a);
        }
    }

    public final void C1() {
        boolean z10;
        int size;
        if (getParentActivity() == null) {
            return;
        }
        int i10 = this.S0;
        ArrayList arrayList = this.f35722i1;
        int i11 = 1;
        if (i10 == 0 && arrayList.size() >= 20) {
            L1(LocaleController.getString(R.string.AppName), LocaleController.formatString("PassportUploadMaxReached", R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", 20, new Object[0])));
            return;
        }
        b1();
        org.telegram.ui.Components.ti tiVar = this.R0;
        int i12 = this.S0;
        if (i12 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        tiVar.X1 = z10;
        if (i12 == 0) {
            size = arrayList.size();
        } else {
            if (i12 == 4) {
                size = this.f35726k1.size();
            }
            tiVar.R1(i11, false);
            this.R0.f30742j0.f0();
            this.R0.w1();
            showDialog(this.R0);
        }
        i11 = 20 - size;
        tiVar.R1(i11, false);
        this.R0.f30742j0.f0();
        this.R0.w1();
        showDialog(this.R0);
    }

    public final void D1(TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, boolean z10) {
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
            HashMap hashMap4 = this.f35747u1;
            if (!z10) {
                hashMap = (HashMap) hashMap4.get(n1(secureValueType2));
            } else {
                hashMap = null;
            }
            HashMap hashMap5 = (HashMap) hashMap4.get(n1(secureValueType));
            TLRPC.TL_secureValue q12 = q1(tL_secureRequiredType, false);
            TLRPC.TL_secureValue q13 = q1(tL_secureRequiredType2, false);
            HashMap hashMap6 = hashMap;
            TL_account.authorizationForm authorizationform = this.f35756y;
            int i12 = i11;
            TL_account.Password password = this.J;
            HashMap hashMap7 = this.f35735p1;
            HashMap hashMap8 = (HashMap) hashMap7.get(tL_secureRequiredType);
            if (tL_secureRequiredType2 != null) {
                hashMap2 = hashMap5;
                hashMap3 = (HashMap) hashMap7.get(tL_secureRequiredType2);
            } else {
                hashMap2 = hashMap5;
                hashMap3 = null;
            }
            an0 an0Var = new an0(i12, authorizationform, password, tL_secureRequiredType, q12, tL_secureRequiredType2, q13, hashMap8, hashMap3);
            an0Var.B1 = new dm0(this, secureValueType2, z10, i10);
            an0Var.currentAccount = this.currentAccount;
            an0Var.f35713e1 = this.f35713e1;
            an0Var.f35709c1 = this.f35709c1;
            an0Var.f35707c = this.f35707c;
            an0Var.f35752w1 = hashMap6;
            an0Var.f35748v0 = z10;
            an0Var.f35755x1 = hashMap2;
            an0Var.G = arrayList;
            if (i12 == 4) {
                an0Var.f35711d1 = this.f35711d1;
            }
            presentFragment(an0Var);
        }
    }

    public final void E1(int i10) {
        if (i10 == 0) {
            int i11 = Build.VERSION.SDK_INT;
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
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

    public final void F1(ArrayList arrayList) {
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
        Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.k0(this.S0, 7, this, arrayList, z10));
    }

    public final TLRPC.TL_secureValue G1(TLRPC.TL_secureRequiredType tL_secureRequiredType) {
        if (tL_secureRequiredType == null) {
            return null;
        }
        int size = this.f35756y.values.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (tL_secureRequiredType.type.getClass() == this.f35756y.values.get(i10).type.getClass()) {
                return this.f35756y.values.remove(i10);
            }
        }
        return null;
    }

    public final void H1(View view) {
        while (view != null && this.f35708c0.indexOfChild(view) < 0) {
            view = (View) view.getParent();
        }
        if (view != null) {
            this.f35705b0.smoothScrollTo(0, view.getTop() - ((this.f35705b0.getMeasuredHeight() - view.getMeasuredHeight()) / 2));
        }
    }

    public final void I1(HashMap hashMap, EditTextBoldCursor editTextBoldCursor, String str) {
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
                        this.f35750w = str2;
                        editTextBoldCursor.setText(LocaleController.getString(R.string.PassportMale));
                        break;
                    } else if ("female".equals(str2)) {
                        this.f35750w = str2;
                        editTextBoldCursor.setText(LocaleController.getString(R.string.PassportFemale));
                        break;
                    }
                    break;
                case 2:
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    int[] iArr = this.f35753x;
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
                    this.f35741s = str2;
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
        HashMap hashMap2 = this.f35752w1;
        HashMap hashMap3 = this.f35758y1;
        if (hashMap2 != null && (charSequence2 = (String) hashMap2.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence2);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
            return;
        }
        HashMap hashMap4 = this.f35755x1;
        if (hashMap4 != null && (charSequence = (String) hashMap4.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
        }
    }

    public final void J1(Bundle bundle, int i10, boolean z10) {
        if (i10 == 3) {
            this.L.setVisibility(8);
        }
        int i11 = this.I1;
        org.telegram.ui.Components.tw0[] tw0VarArr = this.J1;
        org.telegram.ui.Components.tw0 tw0Var = tw0VarArr[i11];
        org.telegram.ui.Components.tw0 tw0Var2 = tw0VarArr[i10];
        this.I1 = i10;
        tw0Var2.m(bundle, false);
        tw0Var2.j();
        if (z10) {
            tw0Var2.setTranslationX(AndroidUtilities.displaySize.x);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.setDuration(300L);
            animatorSet.playTogether(ObjectAnimator.ofFloat(tw0Var, "translationX", -AndroidUtilities.displaySize.x), ObjectAnimator.ofFloat(tw0Var2, "translationX", 0.0f));
            animatorSet.addListener(new org.telegram.ui.Components.ql0(tw0Var2, tw0Var, 9));
            animatorSet.start();
            return;
        }
        tw0Var2.setTranslationX(0.0f);
        tw0Var2.setVisibility(0);
        if (tw0Var != tw0Var2) {
            tw0Var.setVisibility(8);
        }
    }

    public final void K1(org.telegram.tgnet.TLRPC.TL_secureRequiredType r31, java.lang.String r32, java.lang.String r33, org.telegram.tgnet.TLRPC.TL_secureRequiredType r34, java.lang.String r35, boolean r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an0.K1(org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, boolean, int):void");
    }

    public final void L1(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
        c2Var.R = str;
        c2Var.T = str2;
        showDialog(c2Var);
    }

    public final void M1(boolean z10, boolean z11) {
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
                org.telegram.ui.Components.cr crVar = this.N;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(crVar, property4, 0.1f);
                org.telegram.ui.Components.cr crVar2 = this.N;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(crVar2, property5, 0.1f);
                org.telegram.ui.Components.cr crVar3 = this.N;
                Property property6 = View.ALPHA;
                animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(crVar3, property6, 0.0f), ObjectAnimator.ofFloat(this.L.getContentView(), property4, 1.0f), ObjectAnimator.ofFloat(this.L.getContentView(), property5, 1.0f), ObjectAnimator.ofFloat(this.L.getContentView(), property6, 1.0f));
            }
            this.M.addListener(new em0(this, z11, 0));
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
                org.telegram.ui.Components.cr crVar4 = this.P;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(crVar4, property10, 0.1f);
                org.telegram.ui.Components.cr crVar5 = this.P;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(crVar5, property11, 0.1f);
                org.telegram.ui.Components.cr crVar6 = this.P;
                Property property12 = View.ALPHA;
                animatorSet5.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(crVar6, property12, 0.0f), ObjectAnimator.ofFloat(this.O, property10, 1.0f), ObjectAnimator.ofFloat(this.O, property11, 1.0f), ObjectAnimator.ofFloat(this.O, property12, 1.0f));
            }
            this.M.addListener(new em0(this, z11, 1));
            this.M.setDuration(150L);
            this.M.start();
        }
    }

    public final void N1(boolean z10, String str, Runnable runnable, om0 om0Var, qm0 qm0Var) {
        boolean z11;
        boolean z12;
        boolean z13;
        TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
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
                        alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.AllowReadCall);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                        c2Var.T = string;
                        this.L1 = showDialog(c2Var);
                    } else {
                        getParentActivity().requestPermissions((String[]) this.M1.toArray(new String[0]), 6);
                    }
                    this.E1 = str;
                    this.G1 = om0Var;
                    this.F1 = runnable;
                    this.H1 = qm0Var;
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendverifyphonecode, new ai.k2(this, str, qm0Var, sendverifyphonecode, 14), 2);
    }

    public final void P1() {
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        if (tL_secureRequiredType != null) {
            this.actionBar.setTitle(p1(tL_secureRequiredType.type));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.PassportPersonal));
        }
        S1(2);
        S1(3);
        S1(1);
        S1(4);
    }

    public final void Q0(final SecureDocument secureDocument, final int i10) {
        String string;
        final String str;
        String formatDateForBan;
        HashMap hashMap;
        if (i10 == 1) {
            this.f35724j1 = secureDocument;
            if (this.f35717g0 == null) {
                return;
            }
        } else if (i10 == 4) {
            this.f35726k1.add(secureDocument);
            if (this.f35719h0 == null) {
                return;
            }
        } else if (i10 == 2) {
            this.l1 = secureDocument;
            if (this.f35712e0 == null) {
                return;
            }
        } else if (i10 == 3) {
            this.f35728m1 = secureDocument;
            if (this.f35715f0 == null) {
                return;
            }
        } else {
            this.f35722i1.add(secureDocument);
            if (this.f35710d0 == null) {
                return;
            }
        }
        if (getParentActivity() == null) {
            return;
        }
        final ym0 ym0Var = new ym0(this, getParentActivity());
        ym0Var.setTag(secureDocument);
        org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.k6.M0(true);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.f21183d6);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.f21272i6);
        ym0Var.setBackground(M0);
        org.telegram.ui.ActionBar.r6.k(ym0Var, M0, O, O2, null);
        this.f35731n1.put(secureDocument, ym0Var);
        String m12 = m1(secureDocument);
        if (i10 == 1) {
            string = LocaleController.getString(R.string.PassportSelfie);
            this.f35717g0.addView(ym0Var, w7.z5.n(-1, -2));
            str = "selfie" + m12;
        } else if (i10 == 4) {
            string = LocaleController.getString(R.string.AttachPhoto);
            this.f35719h0.addView(ym0Var, w7.z5.n(-1, -2));
            str = "translation" + m12;
        } else if (i10 == 2) {
            TLRPC.SecureValueType secureValueType = this.F.type;
            if (!(secureValueType instanceof TLRPC.TL_secureValueTypePassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                string = LocaleController.getString(R.string.PassportFrontSide);
            } else {
                string = LocaleController.getString(R.string.PassportMainPage);
            }
            this.f35712e0.addView(ym0Var, w7.z5.n(-1, -2));
            str = "front" + m12;
        } else if (i10 == 3) {
            string = LocaleController.getString(R.string.PassportReverseSide);
            this.f35715f0.addView(ym0Var, w7.z5.n(-1, -2));
            str = "reverse" + m12;
        } else {
            string = LocaleController.getString(R.string.AttachPhoto);
            this.f35710d0.addView(ym0Var, w7.z5.n(-1, -2));
            str = "files" + m12;
        }
        if (str != null && (hashMap = this.f35755x1) != null && (formatDateForBan = (String) hashMap.get(str)) != null) {
            org.telegram.ui.ActionBar.r6.W(ym0Var.f43903b, org.telegram.ui.ActionBar.k6.f21404p7, null);
            this.f35758y1.put(str, "");
        } else {
            formatDateForBan = LocaleController.formatDateForBan(secureDocument.secureFile.date);
        }
        ym0Var.f43902a.setText(string);
        ym0Var.f43903b.setText(formatDateForBan);
        org.telegram.ui.Components.w9 w9Var = ym0Var.f43904c;
        w9Var.getClass();
        w9Var.m(ImageLocation.getForSecureDocument(secureDocument), "48_48", null, null, null, null, 0, null);
        ym0Var.f43905f = secureDocument;
        ym0Var.a(false);
        ym0Var.setOnClickListener(new ai.n1(this, i10, 22));
        ym0Var.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                an0 an0Var = this;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(an0Var.getParentActivity());
                int i11 = i10;
                if (i11 == 1) {
                    alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.PassportDeleteSelfie);
                } else {
                    alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.PassportDeleteScan);
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ai.j6(an0Var, secureDocument, i11, ym0Var, str, 4));
                an0Var.showDialog(alertDialog$Builder.f20678a);
                return true;
            }
        });
    }

    public final void Q1() {
        if (this.f35756y.values.isEmpty()) {
            this.A0.setVisibility(0);
            this.f35727l0.setVisibility(8);
            this.f35723j0.setVisibility(8);
            this.f35754x0.setVisibility(8);
            this.f35757y0.setVisibility(8);
            this.f35759z0.setVisibility(8);
            return;
        }
        this.A0.setVisibility(8);
        this.f35727l0.setVisibility(0);
        this.f35723j0.setVisibility(0);
        this.f35757y0.setVisibility(0);
        this.f35759z0.setVisibility(0);
        if (!r1(TLRPC.TL_secureValueTypePhone.class) && !r1(TLRPC.TL_secureValueTypeEmail.class) && !r1(TLRPC.TL_secureValueTypePersonalDetails.class) && !r1(TLRPC.TL_secureValueTypePassport.class) && !r1(TLRPC.TL_secureValueTypeInternalPassport.class) && !r1(TLRPC.TL_secureValueTypeIdentityCard.class) && !r1(TLRPC.TL_secureValueTypeDriverLicense.class) && !r1(TLRPC.TL_secureValueTypeAddress.class) && !r1(TLRPC.TL_secureValueTypeUtilityBill.class) && !r1(TLRPC.TL_secureValueTypePassportRegistration.class) && !r1(TLRPC.TL_secureValueTypeTemporaryRegistration.class) && !r1(TLRPC.TL_secureValueTypeBankStatement.class) && !r1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            this.f35754x0.setVisibility(8);
        } else {
            this.f35754x0.setVisibility(0);
        }
    }

    public final void R0(TLRPC.TL_secureFile tL_secureFile, int i10) {
        byte[] bArr = tL_secureFile.secret;
        byte[] bArr2 = tL_secureFile.file_hash;
        byte[] computeSHA512 = Utilities.computeSHA512(h1(bArr, bArr2), bArr2);
        byte[] bArr3 = new byte[32];
        System.arraycopy(computeSHA512, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(computeSHA512, 32, bArr4, 0, 16);
        Q0(new SecureDocument(new SecureDocumentKey(bArr3, bArr4), tL_secureFile, null, null, null), i10);
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
                    this.G0.setLayoutParams(w7.z5.k(0.0f, 25.0f, 0.0f, 0.0f, -1, -2));
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
                this.G0.setLayoutParams(w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
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

    public final void S0(ArrayList arrayList) {
        this.f35722i1.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i10);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                R0((TLRPC.TL_secureFile) secureFile, 0);
            }
        }
    }

    public final void S1(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an0.S1(int):void");
    }

    public final org.telegram.ui.zm0 T0(android.content.Context r28, org.telegram.tgnet.TLRPC.TL_secureRequiredType r29, java.util.ArrayList r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an0.T0(android.content.Context, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.util.ArrayList, boolean, boolean):org.telegram.ui.zm0");
    }

    public final void U0(ArrayList arrayList) {
        this.f35726k1.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i10);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                R0((TLRPC.TL_secureFile) secureFile, 4);
            }
        }
    }

    public final void V0(boolean z10) {
        int i10;
        if (!this.f35718g1) {
            String str = this.f35729n;
            boolean isEmpty = TextUtils.isEmpty(str);
            int i11 = this.f35704b;
            if (!isEmpty) {
                if (z10) {
                    Activity parentActivity = getParentActivity();
                    pf.d.o(parentActivity, Uri.parse(str + "&tg_passport=success"), true, true);
                } else if (!this.f35716f1 && (i11 == 5 || i11 == 0)) {
                    Activity parentActivity2 = getParentActivity();
                    pf.d.o(parentActivity2, Uri.parse(str + "&tg_passport=cancel"), true, true);
                }
                this.f35718g1 = true;
            } else if (this.C1) {
                if (z10 || (!this.f35716f1 && (i11 == 5 || i11 == 0))) {
                    Activity parentActivity3 = getParentActivity();
                    if (z10) {
                        i10 = -1;
                    } else {
                        i10 = 0;
                    }
                    parentActivity3.setResult(i10);
                }
                this.f35718g1 = true;
            }
        }
    }

    public final boolean W0(boolean z10) {
        if (t1()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new nl0(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.DiscardChanges);
            String string = LocaleController.getString(R.string.PassportDiscardChanges);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
            c2Var.T = string;
            showDialog(c2Var);
            return true;
        }
        return true;
    }

    public final void X0(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.f35702a0 != null) {
            String str = (String) this.Y0.get(this.v);
            String str2 = SharedConfig.getCountryLangs().get(this.v);
            String str3 = null;
            int i10 = 0;
            if (this.E.native_names && !TextUtils.isEmpty(this.v) && !"EN".equals(str2)) {
                if (this.f35736q0.getVisibility() != 0) {
                    this.f35736q0.setVisibility(0);
                    this.f35723j0.setVisibility(0);
                    this.T.setVisibility(0);
                    int i11 = 0;
                    while (true) {
                        editTextBoldCursorArr = this.f35702a0;
                        if (i11 >= editTextBoldCursorArr.length) {
                            break;
                        }
                        ((View) editTextBoldCursorArr[i11].getParent()).setVisibility(0);
                        i11++;
                    }
                    if (editTextBoldCursorArr[0].length() == 0 && this.f35702a0[1].length() == 0 && this.f35702a0[2].length() == 0) {
                        int i12 = 0;
                        while (true) {
                            boolean[] zArr = this.f35744t0;
                            if (i12 >= zArr.length) {
                                break;
                            } else if (zArr[i12]) {
                                this.f35702a0[0].setText(this.Y[0].getText());
                                this.f35702a0[1].setText(this.Y[1].getText());
                                this.f35702a0[2].setText(this.Y[2].getText());
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider, org.telegram.ui.ActionBar.k6.f21145b7, getParentActivity(), this.m0, null);
                }
                this.f35736q0.setText(LocaleController.formatString("PassportNativeInfo", R.string.PassportNativeInfo, str));
                if (str2 != null) {
                    str3 = LocaleController.getServerString("PassportLanguage_".concat(str2));
                }
                if (str3 != null) {
                    this.f35723j0.setText(LocaleController.formatString("PassportNativeHeaderLang", R.string.PassportNativeHeaderLang, str3));
                } else {
                    this.f35723j0.setText(LocaleController.getString(R.string.PassportNativeHeader));
                }
                for (int i13 = 0; i13 < 3; i13++) {
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 == 2) {
                                if (str3 != null) {
                                    this.f35702a0[i13].setHintText(LocaleController.getString(R.string.PassportSurname));
                                } else {
                                    this.f35702a0[i13].setHintText(LocaleController.formatString("PassportSurnameCountry", R.string.PassportSurnameCountry, str));
                                }
                            }
                        } else if (str3 != null) {
                            this.f35702a0[i13].setHintText(LocaleController.getString(R.string.PassportMidname));
                        } else {
                            this.f35702a0[i13].setHintText(LocaleController.formatString("PassportMidnameCountry", R.string.PassportMidnameCountry, str));
                        }
                    } else if (str3 != null) {
                        this.f35702a0[i13].setHintText(LocaleController.getString(R.string.PassportName));
                    } else {
                        this.f35702a0[i13].setHintText(LocaleController.formatString("PassportNameCountry", R.string.PassportNameCountry, str));
                    }
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new kl0(this, 2));
                }
            } else if (this.f35736q0.getVisibility() != 8) {
                this.f35736q0.setVisibility(8);
                this.f35723j0.setVisibility(8);
                this.T.setVisibility(8);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.f35702a0;
                    if (i10 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    ((View) editTextBoldCursorArr2[i10].getParent()).setVisibility(8);
                    i10++;
                }
                if (((this.f35707c != 0 || this.F == null) && this.H != null && !this.f35748v0) || this.I != null) {
                    org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider, org.telegram.ui.ActionBar.k6.f21145b7, getParentActivity(), this.m0, null);
                    return;
                }
                org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21145b7, getParentActivity(), this.m0, null);
            }
        }
    }

    public final void Z0(boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        String str2;
        if (this.f35734p0 != null) {
            HashMap hashMap = this.f35752w1;
            HashMap hashMap2 = this.f35758y1;
            if (hashMap != null && ((z10 || hashMap2.containsKey("error_all")) && (str2 = (String) this.f35752w1.get("error_all")) != null)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
                if (z10) {
                    hashMap2.put("error_all", "");
                }
            } else {
                spannableStringBuilder = null;
            }
            if (this.f35755x1 != null && ((z10 || hashMap2.containsKey("error_document_all")) && (str = (String) this.f35755x1.get("error_all")) != null)) {
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
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.m10(org.telegram.ui.ActionBar.k6.f21404p7, null), 0, spannableStringBuilder.length(), 33);
                this.f35734p0.setText(spannableStringBuilder);
                this.f35734p0.setVisibility(0);
            } else if (this.f35734p0.getVisibility() != 8) {
                this.f35734p0.setVisibility(8);
            }
        }
    }

    public final void a1(Context context) {
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
            FileLog.e(e);
        }
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
        this.f35734p0 = e9Var;
        int i10 = R.drawable.greydivider_top;
        int i11 = org.telegram.ui.ActionBar.k6.f21145b7;
        org.telegram.ui.ActionBar.r6.b0(i10, i11, context, e9Var, null);
        this.f35734p0.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.f35708c0.addView(this.f35734p0, w7.z5.n(-1, -2));
        Z0(true);
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
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
            this.f35723j0 = l4Var;
            l4Var.setText(LocaleController.getString(R.string.PassportDocuments));
            org.telegram.ui.Cells.l4 l4Var2 = this.f35723j0;
            int i12 = org.telegram.ui.ActionBar.k6.f21183d6;
            org.telegram.ui.ActionBar.r6.i(i12, l4Var2, null);
            this.f35708c0.addView(this.f35723j0, w7.z5.n(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.f35710d0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f35708c0.addView(this.f35710d0, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context);
            this.R = caVar;
            org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.k6.M0(true);
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
            int i13 = org.telegram.ui.ActionBar.k6.f21272i6;
            j10 = 0;
            org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i13);
            caVar.setBackground(M0);
            org.telegram.ui.ActionBar.r6.k(caVar, M0, O, O2, null);
            this.f35708c0.addView(this.R, w7.z5.n(-1, -2));
            this.R.setOnClickListener(new ll0(this, 7));
            org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
            this.f35730n0 = e9Var2;
            org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider, i11, context, e9Var2, null);
            if (this.f35707c != 0) {
                this.f35760z1 = LocaleController.getString(R.string.PassportAddAddressUploadInfo);
            } else {
                TLRPC.SecureValueType secureValueType2 = this.F.type;
                if (secureValueType2 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                    this.f35760z1 = LocaleController.getString(R.string.PassportAddAgreementInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                    this.f35760z1 = LocaleController.getString(R.string.PassportAddBillInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                    this.f35760z1 = LocaleController.getString(R.string.PassportAddPassportRegistrationInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                    this.f35760z1 = LocaleController.getString(R.string.PassportAddTemporaryRegistrationInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                    this.f35760z1 = LocaleController.getString(R.string.PassportAddBankInfo);
                } else {
                    this.f35760z1 = "";
                }
            }
            String str2 = this.f35760z1;
            HashMap hashMap = this.f35755x1;
            HashMap hashMap2 = this.f35758y1;
            String str3 = str2;
            if (hashMap != null) {
                String str4 = (String) hashMap.get("files_all");
                str3 = str2;
                if (str4 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                    spannableStringBuilder.append((CharSequence) "\n\n");
                    spannableStringBuilder.append((CharSequence) this.f35760z1);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.m10(org.telegram.ui.ActionBar.k6.f21404p7, null), 0, str4.length(), 33);
                    hashMap2.put("files_all", "");
                    str3 = spannableStringBuilder;
                }
            }
            this.f35730n0.setText(str3);
            this.f35708c0.addView(this.f35730n0, w7.z5.n(-1, -2));
            if (this.F.translation_required) {
                org.telegram.ui.Cells.l4 l4Var3 = new org.telegram.ui.Cells.l4(context);
                this.f35723j0 = l4Var3;
                l4Var3.setText(LocaleController.getString(R.string.PassportTranslation));
                org.telegram.ui.ActionBar.r6.i(i12, this.f35723j0, null);
                this.f35708c0.addView(this.f35723j0, w7.z5.n(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.f35719h0 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.f35708c0.addView(this.f35719h0, w7.z5.n(-1, -2));
                org.telegram.ui.Cells.ca caVar2 = new org.telegram.ui.Cells.ca(context);
                this.X = caVar2;
                org.telegram.ui.Cells.y M02 = org.telegram.ui.ActionBar.k6.M0(true);
                org.telegram.ui.ActionBar.n6 O3 = org.telegram.ui.ActionBar.r6.O(i12);
                org.telegram.ui.ActionBar.n6 O4 = org.telegram.ui.ActionBar.r6.O(i13);
                caVar2.setBackground(M02);
                org.telegram.ui.ActionBar.r6.k(caVar2, M02, O3, O4, null);
                this.f35708c0.addView(this.X, w7.z5.n(-1, -2));
                this.X.setOnClickListener(new ll0(this, 8));
                org.telegram.ui.Cells.e9 e9Var3 = new org.telegram.ui.Cells.e9(context);
                this.f35732o0 = e9Var3;
                org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider, i11, context, e9Var3, null);
                if (this.f35707c != 0) {
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
                HashMap hashMap3 = this.f35755x1;
                String str6 = str5;
                if (hashMap3 != null) {
                    String str7 = (String) hashMap3.get("translation_all");
                    str6 = str5;
                    if (str7 != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str7);
                        spannableStringBuilder2.append((CharSequence) "\n\n");
                        spannableStringBuilder2.append((CharSequence) this.A1);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.m10(org.telegram.ui.ActionBar.k6.f21404p7, null), 0, str7.length(), 33);
                        hashMap2.put("translation_all", "");
                        str6 = spannableStringBuilder2;
                    }
                }
                this.f35732o0.setText(str6);
                this.f35708c0.addView(this.f35732o0, w7.z5.n(-1, -2));
            }
        } else {
            j10 = 0;
            this.actionBar.setTitle(LocaleController.getString(R.string.PassportAddress));
        }
        org.telegram.ui.Cells.l4 l4Var4 = new org.telegram.ui.Cells.l4(context);
        this.f35723j0 = l4Var4;
        l4Var4.setText(LocaleController.getString(R.string.PassportAddressHeader));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, this.f35723j0, null);
        this.f35708c0.addView(this.f35723j0, w7.z5.n(-1, -2));
        this.Y = new EditTextBoldCursor[6];
        for (int i14 = 0; i14 < 6; i14++) {
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.Y[i14] = editTextBoldCursor;
            ul0 ul0Var = new ul0(context, editTextBoldCursor, 0);
            ul0Var.setWillNotDraw(false);
            this.f35708c0.addView(ul0Var, w7.z5.n(-1, -2));
            int i15 = org.telegram.ui.ActionBar.k6.f21183d6;
            org.telegram.ui.ActionBar.r6.i(i15, ul0Var, null);
            int i16 = 5;
            if (i14 == 5) {
                View view = new View(context);
                this.S = view;
                org.telegram.ui.ActionBar.r6.i(i15, view, null);
                this.f35708c0.addView(this.S, w7.z5.n(-1, 6));
            }
            if (this.f35748v0 && this.F != null) {
                ul0Var.setVisibility(8);
                View view2 = this.S;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            this.Y[i14].setTag(Integer.valueOf(i14));
            this.Y[i14].setSupportRtlHint(true);
            this.Y[i14].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.C(this.Y[i14], org.telegram.ui.ActionBar.k6.H6, null);
            org.telegram.ui.ActionBar.r6.B(this.Y[i14], org.telegram.ui.ActionBar.k6.L6, null);
            this.Y[i14].setTransformHintToHeader(true);
            EditTextBoldCursor editTextBoldCursor2 = this.Y[i14];
            int i17 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.W(editTextBoldCursor2, i17, null);
            this.Y[i14].setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.r6.x(this.Y[i14], i17, null);
            this.Y[i14].setCursorSize(AndroidUtilities.dp(20.0f));
            this.Y[i14].setCursorWidth(1.5f);
            org.telegram.ui.ActionBar.r6.H(this.Y[i14], org.telegram.ui.ActionBar.k6.f21310k6, org.telegram.ui.ActionBar.k6.f21327l6, org.telegram.ui.ActionBar.k6.f21404p7, null);
            if (i14 == 5) {
                this.Y[i14].setOnTouchListener(new ml0(this, 2));
                this.Y[i14].setInputType(0);
                this.Y[i14].setFocusable(false);
            } else {
                this.Y[i14].setInputType(16385);
                this.Y[i14].setImeOptions(268435461);
            }
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 != 4) {
                                if (i14 == 5) {
                                    this.Y[i14].setHintText(LocaleController.getString(R.string.PassportCountry));
                                    str = "country_code";
                                }
                            } else {
                                this.Y[i14].setHintText(LocaleController.getString(R.string.PassportState));
                                str = "state";
                            }
                        } else {
                            this.Y[i14].setHintText(LocaleController.getString(R.string.PassportCity));
                            str = "city";
                        }
                    } else {
                        this.Y[i14].setHintText(LocaleController.getString(R.string.PassportPostcode));
                        str = "post_code";
                    }
                } else {
                    this.Y[i14].setHintText(LocaleController.getString(R.string.PassportStreet2));
                    str = "street_line2";
                }
            } else {
                this.Y[i14].setHintText(LocaleController.getString(R.string.PassportStreet1));
                str = "street_line1";
            }
            I1(this.f35743s1, this.Y[i14], str);
            if (i14 == 2) {
                this.Y[i14].addTextChangedListener(new vl0(this, editTextBoldCursor, str));
                this.Y[i14].setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            } else {
                this.Y[i14].addTextChangedListener(new wl0(this, editTextBoldCursor, str, 0));
            }
            EditTextBoldCursor editTextBoldCursor3 = this.Y[i14];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.Y[i14].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.Y[i14];
            if (!LocaleController.isRTL) {
                i16 = 3;
            }
            editTextBoldCursor4.setGravity(i16 | 16);
            ul0Var.addView(this.Y[i14], w7.z5.d(-1, 64.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
            this.Y[i14].setOnEditorActionListener(new jl0(this, 4));
        }
        org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
        this.f35727l0 = b7Var;
        this.f35708c0.addView(b7Var, w7.z5.n(-1, -2));
        if (this.f35748v0 && this.F != null) {
            this.f35723j0.setVisibility(8);
            this.f35727l0.setVisibility(8);
        }
        int i18 = (this.f35707c > j10 ? 1 : (this.f35707c == j10 ? 0 : -1));
        TLRPC.TL_secureValue tL_secureValue = this.I;
        if (((i18 != 0 || this.F == null) && this.H != null && !this.f35748v0) || tL_secureValue != null) {
            if (tL_secureValue != null) {
                S0(tL_secureValue.files);
                U0(tL_secureValue.translation);
            }
            org.telegram.ui.Cells.b7 b7Var2 = this.f35727l0;
            int i19 = R.drawable.greydivider;
            int i20 = org.telegram.ui.ActionBar.k6.f21145b7;
            org.telegram.ui.ActionBar.r6.b0(i19, i20, context, b7Var2, null);
            org.telegram.ui.Cells.ca caVar3 = new org.telegram.ui.Cells.ca(context);
            org.telegram.ui.ActionBar.r6.W(caVar3.getTextView(), org.telegram.ui.ActionBar.k6.f21404p7, null);
            org.telegram.ui.Cells.y M03 = org.telegram.ui.ActionBar.k6.M0(true);
            org.telegram.ui.ActionBar.n6 O5 = org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.f21183d6);
            org.telegram.ui.ActionBar.n6 O6 = org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.f21272i6);
            caVar3.setBackground(M03);
            org.telegram.ui.ActionBar.r6.k(caVar3, M03, O5, O6, null);
            if (this.F == null) {
                caVar3.b(LocaleController.getString(R.string.PassportDeleteInfo), false);
            } else {
                caVar3.b(LocaleController.getString(R.string.PassportDeleteDocument), false);
            }
            this.f35708c0.addView(caVar3, w7.z5.n(-1, -2));
            caVar3.setOnClickListener(new ll0(this, 9));
            org.telegram.ui.Cells.b7 b7Var3 = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
            this.f35727l0 = b7Var3;
            org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, i20, context, b7Var3, null);
            this.f35708c0.addView(this.f35727l0, w7.z5.n(-1, -2));
        } else {
            org.telegram.ui.Cells.b7 b7Var4 = this.f35727l0;
            int i21 = R.drawable.greydivider_bottom;
            int i22 = org.telegram.ui.ActionBar.k6.f21145b7;
            org.telegram.ui.ActionBar.r6.b0(i21, i22, context, b7Var4, null);
            if (this.f35748v0 && this.F != null) {
                org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, i22, context, this.f35730n0, null);
            }
        }
        S1(0);
        S1(4);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Mh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21481t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21518v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21462s8));
    }

    public final void b1() {
        if (getParentActivity() != null && this.R0 == null) {
            org.telegram.ui.Components.ti tiVar = new org.telegram.ui.Components.ti(getParentActivity(), this, false, false);
            this.R0 = tiVar;
            tiVar.f30722c2 = new fm0(this);
        }
    }

    public final void c1() {
        int dp;
        int dp2;
        boolean[] zArr = {true};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ks(28, this, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
        c2Var.R = string;
        boolean z10 = this.f35748v0;
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.E;
        if (z10 && this.F == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeAddress)) {
            c2Var.T = LocaleController.getString(R.string.PassportDeleteAddressAlert);
        } else if (z10 && this.F == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            c2Var.T = LocaleController.getString(R.string.PassportDeletePersonalAlert);
        } else {
            c2Var.T = LocaleController.getString(R.string.PassportDeleteDocumentAlert);
        }
        if (!this.f35748v0 && this.F != null) {
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(getParentActivity(), 1);
            org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.k6.M0(false);
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.f21272i6);
            z1Var.setBackground(M0);
            org.telegram.ui.ActionBar.r6.k(z1Var, M0, null, O, null);
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
            frameLayout.addView(z1Var, w7.z5.e(-1, 48, 51));
            z1Var.setOnClickListener(new o8(4, zArr));
            alertDialog$Builder.o(frameLayout);
        }
        showDialog(c2Var);
    }

    @Override
    public final android.view.View createView(android.content.Context r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an0.createView(android.content.Context):android.view.View");
    }

    public final void d1(Context context) {
        long j10;
        int i10;
        String str;
        int i11;
        String str2;
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
        this.f35734p0 = e9Var;
        int i12 = R.drawable.greydivider_top;
        int i13 = org.telegram.ui.ActionBar.k6.f21145b7;
        org.telegram.ui.ActionBar.r6.b0(i12, i13, context, e9Var, null);
        boolean z10 = false;
        this.f35734p0.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        int i14 = -1;
        this.f35708c0.addView(this.f35734p0, w7.z5.n(-1, -2));
        Z0(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.E;
        if (tL_secureRequiredType != null) {
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
            this.f35723j0 = l4Var;
            if (this.f35748v0) {
                l4Var.setText(LocaleController.getString(R.string.PassportDocuments));
            } else {
                l4Var.setText(LocaleController.getString(R.string.PassportRequiredDocuments));
            }
            org.telegram.ui.Cells.l4 l4Var2 = this.f35723j0;
            int i15 = org.telegram.ui.ActionBar.k6.f21183d6;
            org.telegram.ui.ActionBar.r6.i(i15, l4Var2, null);
            this.f35708c0.addView(this.f35723j0, w7.z5.n(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.f35712e0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f35708c0.addView(this.f35712e0, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context);
            this.U = d9Var;
            org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.k6.M0(true);
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i15);
            int i16 = org.telegram.ui.ActionBar.k6.f21272i6;
            j10 = 0;
            org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i16);
            d9Var.setBackground(M0);
            org.telegram.ui.ActionBar.r6.k(d9Var, M0, O, O2, null);
            this.f35708c0.addView(this.U, w7.z5.n(-1, -2));
            this.U.setOnClickListener(new ll0(this, 0));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.f35715f0 = linearLayout2;
            linearLayout2.setOrientation(1);
            this.f35708c0.addView(this.f35715f0, w7.z5.n(-1, -2));
            boolean z11 = this.F.selfie_required;
            org.telegram.ui.Cells.d9 d9Var2 = new org.telegram.ui.Cells.d9(context);
            this.V = d9Var2;
            org.telegram.ui.Cells.y M02 = org.telegram.ui.ActionBar.k6.M0(true);
            org.telegram.ui.ActionBar.n6 O3 = org.telegram.ui.ActionBar.r6.O(i15);
            org.telegram.ui.ActionBar.n6 O4 = org.telegram.ui.ActionBar.r6.O(i16);
            d9Var2.setBackground(M02);
            org.telegram.ui.ActionBar.r6.k(d9Var2, M02, O3, O4, null);
            this.V.a(LocaleController.getString(R.string.PassportReverseSide), LocaleController.getString(R.string.PassportReverseSideInfo), z11);
            this.f35708c0.addView(this.V, w7.z5.n(-1, -2));
            this.V.setOnClickListener(new ll0(this, 2));
            if (this.F.selfie_required) {
                LinearLayout linearLayout3 = new LinearLayout(context);
                this.f35717g0 = linearLayout3;
                linearLayout3.setOrientation(1);
                this.f35708c0.addView(this.f35717g0, w7.z5.n(-1, -2));
                org.telegram.ui.Cells.d9 d9Var3 = new org.telegram.ui.Cells.d9(context);
                this.W = d9Var3;
                org.telegram.ui.Cells.y M03 = org.telegram.ui.ActionBar.k6.M0(true);
                org.telegram.ui.ActionBar.n6 O5 = org.telegram.ui.ActionBar.r6.O(i15);
                org.telegram.ui.ActionBar.n6 O6 = org.telegram.ui.ActionBar.r6.O(i16);
                d9Var3.setBackground(M03);
                org.telegram.ui.ActionBar.r6.k(d9Var3, M03, O5, O6, null);
                this.W.a(LocaleController.getString(R.string.PassportSelfie), LocaleController.getString(R.string.PassportSelfieInfo), tL_secureRequiredType2.translation_required);
                this.f35708c0.addView(this.W, w7.z5.n(-1, -2));
                this.W.setOnClickListener(new ll0(this, 3));
            }
            org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
            this.f35730n0 = e9Var2;
            org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider, i13, context, e9Var2, null);
            this.f35730n0.setText(LocaleController.getString(R.string.PassportPersonalUploadInfo));
            this.f35708c0.addView(this.f35730n0, w7.z5.n(-1, -2));
            if (this.F.translation_required) {
                org.telegram.ui.Cells.l4 l4Var3 = new org.telegram.ui.Cells.l4(context);
                this.f35723j0 = l4Var3;
                l4Var3.setText(LocaleController.getString(R.string.PassportTranslation));
                org.telegram.ui.ActionBar.r6.i(i15, this.f35723j0, null);
                this.f35708c0.addView(this.f35723j0, w7.z5.n(-1, -2));
                LinearLayout linearLayout4 = new LinearLayout(context);
                this.f35719h0 = linearLayout4;
                linearLayout4.setOrientation(1);
                this.f35708c0.addView(this.f35719h0, w7.z5.n(-1, -2));
                org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context);
                this.X = caVar;
                org.telegram.ui.Cells.y M04 = org.telegram.ui.ActionBar.k6.M0(true);
                org.telegram.ui.ActionBar.n6 O7 = org.telegram.ui.ActionBar.r6.O(i15);
                org.telegram.ui.ActionBar.n6 O8 = org.telegram.ui.ActionBar.r6.O(i16);
                caVar.setBackground(M04);
                org.telegram.ui.ActionBar.r6.k(caVar, M04, O7, O8, null);
                this.f35708c0.addView(this.X, w7.z5.n(-1, -2));
                this.X.setOnClickListener(new ll0(this, 4));
                org.telegram.ui.Cells.e9 e9Var3 = new org.telegram.ui.Cells.e9(context);
                this.f35732o0 = e9Var3;
                org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider, i13, context, e9Var3, null);
                if (this.f35707c != 0) {
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
                HashMap hashMap = this.f35755x1;
                String str4 = str3;
                if (hashMap != null) {
                    String str5 = (String) hashMap.get("translation_all");
                    str4 = str3;
                    if (str5 != null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str5);
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) this.A1);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.m10(org.telegram.ui.ActionBar.k6.f21404p7, null), 0, str5.length(), 33);
                        this.f35758y1.put("translation_all", "");
                        str4 = spannableStringBuilder;
                    }
                }
                this.f35732o0.setText(str4);
                this.f35708c0.addView(this.f35732o0, w7.z5.n(-1, -2));
            }
        } else {
            j10 = 0;
            org.telegram.ui.Cells.ca caVar2 = new org.telegram.ui.Cells.ca(context);
            this.f35739r0 = caVar2;
            org.telegram.ui.Cells.y M05 = org.telegram.ui.ActionBar.k6.M0(true);
            org.telegram.ui.ActionBar.n6 O9 = org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.f21183d6);
            org.telegram.ui.ActionBar.n6 O10 = org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.f21272i6);
            caVar2.setBackground(M05);
            org.telegram.ui.ActionBar.r6.k(caVar2, M05, O9, O10, null);
            this.f35739r0.b(LocaleController.getString(R.string.PassportScanPassport), false);
            this.f35708c0.addView(this.f35739r0, w7.z5.n(-1, -2));
            this.f35739r0.setOnClickListener(new ll0(this, 5));
            org.telegram.ui.Cells.e9 e9Var4 = new org.telegram.ui.Cells.e9(context);
            this.f35730n0 = e9Var4;
            org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider, i13, context, e9Var4, null);
            this.f35730n0.setText(LocaleController.getString(R.string.PassportScanPassportInfo));
            this.f35708c0.addView(this.f35730n0, w7.z5.n(-1, -2));
        }
        org.telegram.ui.Cells.l4 l4Var4 = new org.telegram.ui.Cells.l4(context);
        this.f35723j0 = l4Var4;
        if (this.f35748v0) {
            l4Var4.setText(LocaleController.getString(R.string.PassportDocument));
        } else {
            l4Var4.setText(LocaleController.getString(R.string.PassportPersonal));
        }
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, this.f35723j0, null);
        this.f35708c0.addView(this.f35723j0, w7.z5.n(-1, -2));
        int i17 = 7;
        if (this.F != null) {
            i10 = 9;
        } else {
            i10 = 7;
        }
        this.Y = new EditTextBoldCursor[i10];
        int i18 = 0;
        while (true) {
            HashMap hashMap2 = this.f35743s1;
            if (i18 < i10) {
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.Y[i18] = editTextBoldCursor;
                ul0 ul0Var = new ul0(context, editTextBoldCursor, 1);
                ul0Var.setWillNotDraw(z10);
                this.f35708c0.addView(ul0Var, w7.z5.n(i14, 64));
                int i19 = org.telegram.ui.ActionBar.k6.f21183d6;
                org.telegram.ui.ActionBar.r6.i(i19, ul0Var, null);
                if (i18 == i10 - 1) {
                    View view = new View(context);
                    this.S = view;
                    org.telegram.ui.ActionBar.r6.i(i19, view, null);
                    this.f35708c0.addView(this.S, w7.z5.n(i14, 6));
                }
                if (this.f35748v0 && this.F != null && i18 < i17) {
                    ul0Var.setVisibility(8);
                    View view2 = this.S;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                }
                this.Y[i18].setTag(Integer.valueOf(i18));
                this.Y[i18].setSupportRtlHint(true);
                this.Y[i18].setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.r6.C(this.Y[i18], org.telegram.ui.ActionBar.k6.H6, null);
                EditTextBoldCursor editTextBoldCursor2 = this.Y[i18];
                int i20 = org.telegram.ui.ActionBar.k6.G6;
                org.telegram.ui.ActionBar.r6.W(editTextBoldCursor2, i20, null);
                org.telegram.ui.ActionBar.r6.B(this.Y[i18], org.telegram.ui.ActionBar.k6.L6, null);
                this.Y[i18].setTransformHintToHeader(true);
                this.Y[i18].setBackgroundDrawable(null);
                org.telegram.ui.ActionBar.r6.x(this.Y[i18], i20, null);
                this.Y[i18].setCursorSize(AndroidUtilities.dp(20.0f));
                this.Y[i18].setCursorWidth(1.5f);
                org.telegram.ui.ActionBar.r6.H(this.Y[i18], org.telegram.ui.ActionBar.k6.f21310k6, org.telegram.ui.ActionBar.k6.f21327l6, org.telegram.ui.ActionBar.k6.f21404p7, null);
                int i21 = 5;
                if (i18 != 5 && i18 != 6) {
                    if (i18 != 3 && i18 != 8) {
                        if (i18 == 4) {
                            this.Y[i18].setOnTouchListener(new ml0(this, 1));
                            this.Y[i18].setInputType(0);
                            this.Y[i18].setFocusable(false);
                        } else {
                            this.Y[i18].setInputType(16385);
                            this.Y[i18].setImeOptions(268435461);
                        }
                    } else {
                        this.Y[i18].setOnTouchListener(new ei.p1(7, this, context));
                        this.Y[i18].setInputType(0);
                        this.Y[i18].setFocusable(false);
                    }
                } else {
                    this.Y[i18].setOnTouchListener(new ml0(this, 0));
                    this.Y[i18].setInputType(0);
                }
                HashMap hashMap3 = this.f35745t1;
                switch (i18) {
                    case 0:
                        if (tL_secureRequiredType2.native_names) {
                            this.Y[i18].setHintText(LocaleController.getString(R.string.PassportNameLatin));
                        } else {
                            this.Y[i18].setHintText(LocaleController.getString(R.string.PassportName));
                        }
                        str2 = "first_name";
                        break;
                    case 1:
                        if (tL_secureRequiredType2.native_names) {
                            this.Y[i18].setHintText(LocaleController.getString(R.string.PassportMidnameLatin));
                        } else {
                            this.Y[i18].setHintText(LocaleController.getString(R.string.PassportMidname));
                        }
                        str2 = "middle_name";
                        break;
                    case 2:
                        if (tL_secureRequiredType2.native_names) {
                            this.Y[i18].setHintText(LocaleController.getString(R.string.PassportSurnameLatin));
                        } else {
                            this.Y[i18].setHintText(LocaleController.getString(R.string.PassportSurname));
                        }
                        str2 = "last_name";
                        break;
                    case 3:
                        this.Y[i18].setHintText(LocaleController.getString(R.string.PassportBirthdate));
                        str2 = "birth_date";
                        break;
                    case 4:
                        this.Y[i18].setHintText(LocaleController.getString(R.string.PassportGender));
                        str2 = "gender";
                        break;
                    case 5:
                        this.Y[i18].setHintText(LocaleController.getString(R.string.PassportCitizenship));
                        str2 = "country_code";
                        break;
                    case 6:
                        this.Y[i18].setHintText(LocaleController.getString(R.string.PassportResidence));
                        str2 = "residence_country_code";
                        break;
                    case 7:
                        this.Y[i18].setHintText(LocaleController.getString(R.string.PassportDocumentNumber));
                        str2 = "document_no";
                        hashMap2 = hashMap3;
                        break;
                    case 8:
                        this.Y[i18].setHintText(LocaleController.getString(R.string.PassportExpired));
                        str2 = "expiry_date";
                        hashMap2 = hashMap3;
                        break;
                    default:
                        i18++;
                        i17 = 7;
                        z10 = false;
                        i14 = -1;
                }
                I1(hashMap2, this.Y[i18], str2);
                EditTextBoldCursor editTextBoldCursor3 = this.Y[i18];
                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                if (i18 != 0 && i18 != 2 && i18 != 1) {
                    this.Y[i18].addTextChangedListener(new org.telegram.ui.Components.hy0(this, editTextBoldCursor, str2, hashMap2));
                } else {
                    this.Y[i18].addTextChangedListener(new yl0(this, editTextBoldCursor, str2));
                }
                this.Y[i18].setPadding(0, 0, 0, 0);
                EditTextBoldCursor editTextBoldCursor4 = this.Y[i18];
                if (!LocaleController.isRTL) {
                    i21 = 3;
                }
                editTextBoldCursor4.setGravity(i21 | 16);
                ul0Var.addView(this.Y[i18], w7.z5.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                this.Y[i18].setOnEditorActionListener(new jl0(this, 1));
                i18++;
                i17 = 7;
                z10 = false;
                i14 = -1;
            } else {
                org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
                this.m0 = b7Var;
                this.f35708c0.addView(b7Var, w7.z5.n(-1, -2));
                org.telegram.ui.Cells.l4 l4Var5 = new org.telegram.ui.Cells.l4(context);
                this.f35723j0 = l4Var5;
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, l4Var5, null);
                this.f35708c0.addView(this.f35723j0, w7.z5.n(-1, -2));
                this.f35702a0 = new EditTextBoldCursor[3];
                int i22 = 0;
                for (int i23 = 3; i22 < i23; i23 = 3) {
                    EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
                    this.f35702a0[i22] = editTextBoldCursor5;
                    ul0 ul0Var2 = new ul0(context, editTextBoldCursor5, 2);
                    ul0Var2.setWillNotDraw(false);
                    this.f35708c0.addView(ul0Var2, w7.z5.n(-1, 64));
                    int i24 = org.telegram.ui.ActionBar.k6.f21183d6;
                    org.telegram.ui.ActionBar.r6.i(i24, ul0Var2, null);
                    if (i22 == 2) {
                        View view3 = new View(context);
                        this.T = view3;
                        org.telegram.ui.ActionBar.r6.i(i24, view3, null);
                        this.f35708c0.addView(this.T, w7.z5.n(-1, 6));
                    }
                    this.f35702a0[i22].setTag(Integer.valueOf(i22));
                    this.f35702a0[i22].setSupportRtlHint(true);
                    this.f35702a0[i22].setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.r6.C(this.f35702a0[i22], org.telegram.ui.ActionBar.k6.H6, null);
                    EditTextBoldCursor editTextBoldCursor6 = this.f35702a0[i22];
                    int i25 = org.telegram.ui.ActionBar.k6.G6;
                    org.telegram.ui.ActionBar.r6.W(editTextBoldCursor6, i25, null);
                    org.telegram.ui.ActionBar.r6.B(this.f35702a0[i22], org.telegram.ui.ActionBar.k6.L6, null);
                    this.f35702a0[i22].setTransformHintToHeader(true);
                    this.f35702a0[i22].setBackgroundDrawable(null);
                    org.telegram.ui.ActionBar.r6.x(this.f35702a0[i22], i25, null);
                    this.f35702a0[i22].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.f35702a0[i22].setCursorWidth(1.5f);
                    org.telegram.ui.ActionBar.r6.H(this.f35702a0[i22], org.telegram.ui.ActionBar.k6.f21310k6, org.telegram.ui.ActionBar.k6.f21327l6, org.telegram.ui.ActionBar.k6.f21404p7, null);
                    this.f35702a0[i22].setInputType(16385);
                    this.f35702a0[i22].setImeOptions(268435461);
                    if (i22 != 0) {
                        if (i22 != 1) {
                            if (i22 == 2) {
                                str = "last_name_native";
                            } else {
                                i22++;
                            }
                        } else {
                            str = "middle_name_native";
                        }
                    } else {
                        str = "first_name_native";
                    }
                    I1(hashMap2, this.f35702a0[i22], str);
                    EditTextBoldCursor editTextBoldCursor7 = this.f35702a0[i22];
                    editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
                    if (i22 == 0 || i22 == 2 || i22 == 1) {
                        this.f35702a0[i22].addTextChangedListener(new wl0(this, editTextBoldCursor5, str, 1));
                    }
                    this.f35702a0[i22].setPadding(0, 0, 0, 0);
                    EditTextBoldCursor editTextBoldCursor8 = this.f35702a0[i22];
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    editTextBoldCursor8.setGravity(i11 | 16);
                    ul0Var2.addView(this.f35702a0[i22], w7.z5.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.f35702a0[i22].setOnEditorActionListener(new jl0(this, 2));
                    i22++;
                }
                org.telegram.ui.Cells.e9 e9Var5 = new org.telegram.ui.Cells.e9(context);
                this.f35736q0 = e9Var5;
                this.f35708c0.addView(e9Var5, w7.z5.n(-1, -2));
                int i26 = (this.f35707c > j10 ? 1 : (this.f35707c == j10 ? 0 : -1));
                TLRPC.TL_secureValue tL_secureValue = this.I;
                if (((i26 != 0 || this.F == null) && this.H != null && !this.f35748v0) || tL_secureValue != null) {
                    if (tL_secureValue != null) {
                        S0(tL_secureValue.files);
                        TLRPC.SecureFile secureFile = tL_secureValue.front_side;
                        if (secureFile instanceof TLRPC.TL_secureFile) {
                            R0((TLRPC.TL_secureFile) secureFile, 2);
                        }
                        TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                        if (secureFile2 instanceof TLRPC.TL_secureFile) {
                            R0((TLRPC.TL_secureFile) secureFile2, 3);
                        }
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            R0((TLRPC.TL_secureFile) secureFile3, 1);
                        }
                        U0(tL_secureValue.translation);
                    }
                    org.telegram.ui.Cells.ca caVar3 = new org.telegram.ui.Cells.ca(context);
                    org.telegram.ui.ActionBar.r6.W(caVar3.getTextView(), org.telegram.ui.ActionBar.k6.f21404p7, null);
                    org.telegram.ui.Cells.y M06 = org.telegram.ui.ActionBar.k6.M0(true);
                    org.telegram.ui.ActionBar.n6 O11 = org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.f21183d6);
                    org.telegram.ui.ActionBar.n6 O12 = org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.f21272i6);
                    caVar3.setBackground(M06);
                    org.telegram.ui.ActionBar.r6.k(caVar3, M06, O11, O12, null);
                    if (this.F == null) {
                        caVar3.b(LocaleController.getString(R.string.PassportDeleteInfo), false);
                    } else {
                        caVar3.b(LocaleController.getString(R.string.PassportDeleteDocument), false);
                    }
                    this.f35708c0.addView(caVar3, w7.z5.n(-1, -2));
                    caVar3.setOnClickListener(new ll0(this, 1));
                    org.telegram.ui.Cells.e9 e9Var6 = this.f35736q0;
                    int i27 = R.drawable.greydivider;
                    int i28 = org.telegram.ui.ActionBar.k6.f21145b7;
                    org.telegram.ui.ActionBar.r6.b0(i27, i28, context, e9Var6, null);
                    org.telegram.ui.Cells.b7 b7Var2 = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
                    this.f35727l0 = b7Var2;
                    org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, i28, context, b7Var2, null);
                    this.f35708c0.addView(this.f35727l0, w7.z5.n(-1, -2));
                } else {
                    org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21145b7, context, this.f35736q0, null);
                }
                P1();
                X0(false);
                return;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        EditTextBoldCursor editTextBoldCursor;
        ym0 ym0Var;
        org.telegram.ui.ActionBar.u0 u0Var;
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            HashMap hashMap = this.f35733o1;
            SecureDocument secureDocument = (SecureDocument) hashMap.get(str);
            if (secureDocument != null) {
                secureDocument.inputFile = (TLRPC.TL_inputFile) objArr[1];
                hashMap.remove(str);
                if (hashMap.isEmpty() && (u0Var = this.L) != null) {
                    u0Var.setEnabled(true);
                    this.L.setAlpha(1.0f);
                }
                HashMap hashMap2 = this.f35731n1;
                if (hashMap2 != null && (ym0Var = (ym0) hashMap2.get(secureDocument)) != null) {
                    ym0Var.a(true);
                }
                HashMap hashMap3 = this.f35758y1;
                if (hashMap3 != null && hashMap3.containsKey("error_document_all")) {
                    hashMap3.remove("error_document_all");
                    Z0(false);
                }
                int i12 = secureDocument.type;
                if (i12 == 0) {
                    if (this.f35730n0 != null && !TextUtils.isEmpty(this.f35760z1)) {
                        this.f35730n0.setText(this.f35760z1);
                    }
                    hashMap3.remove("files_all");
                } else if (i12 == 4) {
                    if (this.f35732o0 != null && !TextUtils.isEmpty(this.A1)) {
                        this.f35732o0.setText(this.A1);
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
                v1();
            }
            R1();
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.ti tiVar = this.R0;
        if (tiVar != null && this.visibleDialog == tiVar) {
            tiVar.f30742j0.a0(false);
            this.R0.dismissInternal();
            this.R0.f30742j0.d0(true);
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

    public final void e1(android.content.Context r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an0.e1(android.content.Context):void");
    }

    public final void f1(Context context) {
        String str;
        String str2;
        TelephonyManager telephonyManager;
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
        Collections.sort(this.U0, new o70(17));
        String str3 = UserConfig.getInstance(this.currentAccount).getCurrentUser().phone;
        org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context);
        org.telegram.ui.ActionBar.r6.W(caVar.getTextView(), org.telegram.ui.ActionBar.k6.q6, null);
        org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.k6.M0(true);
        int i10 = org.telegram.ui.ActionBar.k6.f21183d6;
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.f21272i6);
        caVar.setBackground(M0);
        org.telegram.ui.ActionBar.r6.k(caVar, M0, O, O2, null);
        caVar.b(LocaleController.formatString("PassportPhoneUseSame", R.string.PassportPhoneUseSame, jf.b.c().b("+" + str3)), false);
        this.f35708c0.addView(caVar, w7.z5.n(-1, -2));
        caVar.setOnClickListener(new ll0(this, 16));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
        this.f35730n0 = e9Var;
        org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21145b7, context, e9Var, null);
        this.f35730n0.setText(LocaleController.getString(R.string.PassportPhoneUseSameInfo));
        this.f35708c0.addView(this.f35730n0, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
        this.f35723j0 = l4Var;
        l4Var.setText(LocaleController.getString(R.string.PassportPhoneUseOther));
        org.telegram.ui.ActionBar.r6.i(i10, this.f35723j0, null);
        this.f35708c0.addView(this.f35723j0, w7.z5.n(-1, -2));
        this.Y = new EditTextBoldCursor[3];
        for (int i11 = 0; i11 < 3; i11++) {
            if (i11 == 2) {
                this.Y[i11] = new org.telegram.ui.Components.o40(context);
            } else {
                this.Y[i11] = new EditTextBoldCursor(context);
            }
            if (i11 == 1) {
                frameLayout = org.telegram.messenger.sl.e(context, 0);
                this.f35708c0.addView(frameLayout, w7.z5.n(-1, 50));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, frameLayout, null);
            } else if (i11 == 2) {
                frameLayout = (ViewGroup) this.Y[1].getParent();
            } else {
                frameLayout = new FrameLayout(context);
                this.f35708c0.addView(frameLayout, w7.z5.n(-1, 50));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, frameLayout, null);
            }
            this.Y[i11].setTag(Integer.valueOf(i11));
            this.Y[i11].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.F(this.Y[i11], org.telegram.ui.ActionBar.k6.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.Y[i11];
            int i12 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.W(editTextBoldCursor, i12, null);
            this.Y[i11].setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.r6.x(this.Y[i11], i12, null);
            this.Y[i11].setCursorSize(AndroidUtilities.dp(20.0f));
            this.Y[i11].setCursorWidth(1.5f);
            if (i11 == 0) {
                this.Y[i11].setOnTouchListener(new ml0(this, 3));
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
                this.f35751w0 = textView;
                textView.setText("+");
                org.telegram.ui.ActionBar.r6.W(this.f35751w0, i12, null);
                this.f35751w0.setTextSize(1, 16.0f);
                frameLayout.addView(this.f35751w0, w7.z5.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                this.Y[i11].setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
                this.Y[i11].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                this.Y[i11].setGravity(19);
                frameLayout.addView(this.Y[i11], w7.z5.k(0.0f, 12.0f, 16.0f, 6.0f, 55, -2));
                this.Y[i11].addTextChangedListener(new nm0(this));
            } else if (i11 == 2) {
                this.Y[i11].setPadding(0, 0, 0, 0);
                this.Y[i11].setGravity(19);
                this.Y[i11].setHintText(null);
                this.Y[i11].setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                frameLayout.addView(this.Y[i11], w7.z5.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                this.Y[i11].addTextChangedListener(new rr(this, 3));
            } else {
                this.Y[i11].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                EditTextBoldCursor editTextBoldCursor3 = this.Y[i11];
                if (!LocaleController.isRTL) {
                    i13 = 3;
                }
                editTextBoldCursor3.setGravity(i13);
                frameLayout.addView(this.Y[i11], w7.z5.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            }
            this.Y[i11].setOnEditorActionListener(new jl0(this, 0));
            if (i11 == 2) {
                this.Y[i11].setOnKeyListener(new lg(this, 1));
            }
            if (i11 == 0) {
                View view = new View(context);
                this.f35725k0.add(view);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d7, view, null);
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, 1, 83));
            }
        }
        try {
            telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (telephonyManager != null) {
            str = telephonyManager.getSimCountryIso().toUpperCase();
            if (str != null && (str2 = (String) this.Y0.get(str)) != null && this.U0.indexOf(str2) != -1) {
                this.Y[1].setText((CharSequence) this.V0.get(str2));
            }
            org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
            this.f35730n0 = e9Var2;
            org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21145b7, context, e9Var2, null);
            this.f35730n0.setText(LocaleController.getString(R.string.PassportPhoneUploadInfo));
            this.f35708c0.addView(this.f35730n0, w7.z5.n(-1, -2));
        }
        str = null;
        if (str != null) {
            this.Y[1].setText((CharSequence) this.V0.get(str2));
        }
        org.telegram.ui.Cells.e9 e9Var22 = new org.telegram.ui.Cells.e9(context);
        this.f35730n0 = e9Var22;
        org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21145b7, context, e9Var22, null);
        this.f35730n0.setText(LocaleController.getString(R.string.PassportPhoneUploadInfo));
        this.f35708c0.addView(this.f35730n0, w7.z5.n(-1, -2));
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f35705b0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21462s8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.f35725k0;
            if (i11 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) arrayList2.get(i11), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21184d7));
            i11++;
        }
        for (Map.Entry entry : this.f35731n1.entrySet()) {
            arrayList.add(new org.telegram.ui.ActionBar.t6((ym0) entry.getValue(), 268435456, new Class[]{ym0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21183d6));
        }
        int i12 = org.telegram.ui.ActionBar.k6.f21183d6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f35708c0, 268435456, new Class[]{org.telegram.ui.Cells.d9.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f35708c0, 268435456, new Class[]{org.telegram.ui.Cells.ca.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f35708c0, 268435456, new Class[]{zm0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        if (this.Y != null) {
            int i13 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.Y;
                if (i13 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) editTextBoldCursorArr[i13].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21183d6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y[i13], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y[i13], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21310k6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y[i13], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21327l6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y[i13], 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21404p7));
                i13++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21310k6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21327l6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21404p7));
        }
        if (this.f35702a0 != null) {
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.f35702a0;
                if (i10 >= editTextBoldCursorArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) editTextBoldCursorArr2[i10].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21183d6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.f35702a0[i10], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.f35702a0[i10], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21310k6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.f35702a0[i10], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21327l6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.f35702a0[i10], 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21404p7));
                i10++;
            }
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.F0, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21255h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Q, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21451rh));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Q, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21470sh));
        return arrayList;
    }

    public final byte[] h1(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32 || bArr2 == null || bArr2.length != 32) {
            return null;
        }
        byte[] bArr3 = new byte[32];
        System.arraycopy(this.f35713e1, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(this.f35713e1, 32, bArr4, 0, 16);
        byte[] bArr5 = new byte[32];
        System.arraycopy(this.f35709c1, 0, bArr5, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr5, bArr3, bArr4, 0, 32, 0, 0);
        if (!Y0(bArr5, null)) {
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

    public final void i1(final TLRPC.TL_secureRequiredType tL_secureRequiredType, final TLRPC.TL_secureRequiredType tL_secureRequiredType2, final ArrayList arrayList, final boolean z10, final kl0 kl0Var, final nl0 nl0Var, final boolean z11) {
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
                final an0 an0Var = an0.this;
                final om0 om0Var = nl0Var;
                final boolean z12 = z11;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType3 = tL_secureRequiredType2;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                final boolean z13 = z10;
                final ArrayList arrayList2 = arrayList;
                final Runnable runnable = kl0Var;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        TLRPC.TL_secureData tL_secureData;
                        String str2;
                        LinearLayout linearLayout;
                        an0 an0Var2 = an0.this;
                        TLRPC.TL_error tL_error2 = tL_error;
                        String str3 = null;
                        if (tL_error2 != null) {
                            om0 om0Var2 = om0Var;
                            if (om0Var2 != null) {
                                om0Var2.a(tL_error2.text, null);
                            }
                            an0Var2.L1(LocaleController.getString(R.string.AppName), tL_error2.text);
                            return;
                        }
                        boolean z14 = z12;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType3;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType4;
                        boolean z15 = z13;
                        if (z14) {
                            if (tL_secureRequiredType5 != null) {
                                an0Var2.G1(tL_secureRequiredType5);
                            } else {
                                an0Var2.G1(tL_secureRequiredType6);
                            }
                        } else {
                            if (z15) {
                                an0Var2.G1(tL_secureRequiredType6);
                            }
                            an0Var2.G1(tL_secureRequiredType5);
                        }
                        int i10 = 0;
                        if (an0Var2.f35704b == 8) {
                            zm0 zm0Var = (zm0) an0Var2.f35737q1.remove(tL_secureRequiredType6);
                            if (zm0Var != null) {
                                an0Var2.f35708c0.removeView(zm0Var);
                                View childAt = an0Var2.f35708c0.getChildAt(linearLayout.getChildCount() - 6);
                                if (childAt instanceof zm0) {
                                    ((zm0) childAt).setNeedDivider(false);
                                }
                            }
                            an0Var2.Q1();
                        } else {
                            ArrayList arrayList3 = arrayList2;
                            if (tL_secureRequiredType5 != null && arrayList3 != null && arrayList3.size() > 1) {
                                int size = arrayList3.size();
                                int i11 = 0;
                                while (true) {
                                    if (i11 < size) {
                                        TLRPC.TL_secureRequiredType tL_secureRequiredType7 = (TLRPC.TL_secureRequiredType) arrayList3.get(i11);
                                        TLRPC.TL_secureValue q12 = an0Var2.q1(tL_secureRequiredType7, false);
                                        if (q12 != null) {
                                            TLRPC.TL_secureData tL_secureData2 = q12.data;
                                            if (tL_secureData2 != null) {
                                                str2 = an0.g1(tL_secureData2.data, an0Var2.h1(tL_secureData2.secret, tL_secureData2.data_hash), q12.data.data_hash);
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
                                an0Var2.K1(tL_secureRequiredType6, null, null, tL_secureRequiredType5, str, z14, i10);
                            } else {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType8 = tL_secureRequiredType5;
                                String str4 = str;
                                TLRPC.TL_secureValue q13 = an0Var2.q1(tL_secureRequiredType6, false);
                                if (q13 != null && (tL_secureData = q13.data) != null) {
                                    str3 = an0.g1(tL_secureData.data, an0Var2.h1(tL_secureData.secret, tL_secureData.data_hash), q13.data.data_hash);
                                }
                                if (arrayList3 != null) {
                                    i10 = arrayList3.size();
                                }
                                an0Var2.K1(tL_secureRequiredType6, null, str3, tL_secureRequiredType8, str4, z14, i10);
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

    public final com.google.android.gms.internal.cast.z5 j1(byte[] bArr) {
        byte[] o12 = o1();
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
        byte[] computeSHA512 = Utilities.computeSHA512(o12, computeSHA256);
        byte[] bArr4 = new byte[32];
        System.arraycopy(computeSHA512, 0, bArr4, 0, 32);
        byte[] bArr5 = new byte[16];
        System.arraycopy(computeSHA512, 32, bArr5, 0, 16);
        Utilities.aesCbcEncryptionByteArraySafe(bArr3, bArr4, bArr5, 0, length, 0, 1);
        byte[] bArr6 = new byte[32];
        System.arraycopy(this.f35713e1, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(this.f35713e1, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(this.f35709c1, 0, bArr8, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        byte[] computeSHA5122 = Utilities.computeSHA512(bArr8, computeSHA256);
        byte[] bArr9 = new byte[32];
        System.arraycopy(computeSHA5122, 0, bArr9, 0, 32);
        byte[] bArr10 = new byte[16];
        System.arraycopy(computeSHA5122, 32, bArr10, 0, 16);
        byte[] bArr11 = new byte[32];
        System.arraycopy(o12, 0, bArr11, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr11, bArr9, bArr10, 0, 32, 0, 1);
        ?? obj = new Object();
        obj.f6892a = bArr3;
        obj.f6893b = bArr11;
        obj.d = computeSHA256;
        obj.f6894c = o12;
        obj.e = new SecureDocumentKey(bArr4, bArr5);
        return obj;
    }

    public final void k1(Bundle bundle, TLRPC.TL_auth_sentCode tL_auth_sentCode, boolean z10) {
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
            J1(bundle, 2, z10);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", tL_auth_sentCode.type.pattern);
            J1(bundle, 1, z10);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSms) {
            bundle.putInt("type", 2);
            bundle.putInt("length", tL_auth_sentCode.type.length);
            J1(bundle, 0, z10);
        }
    }

    public final String l1() {
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
        if (this.f35702a0 != null) {
            int i11 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.f35702a0;
                if (i11 >= editTextBoldCursorArr2.length) {
                    break;
                }
                sb2.append((CharSequence) editTextBoldCursorArr2[i11].getText());
                sb2.append(",");
                i11++;
            }
        }
        ArrayList arrayList = this.f35722i1;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            sb2.append(((SecureDocument) arrayList.get(i12)).secureFile.f20478id);
        }
        SecureDocument secureDocument = this.l1;
        if (secureDocument != null) {
            sb2.append(secureDocument.secureFile.f20478id);
        }
        SecureDocument secureDocument2 = this.f35728m1;
        if (secureDocument2 != null) {
            sb2.append(secureDocument2.secureFile.f20478id);
        }
        SecureDocument secureDocument3 = this.f35724j1;
        if (secureDocument3 != null) {
            sb2.append(secureDocument3.secureFile.f20478id);
        }
        ArrayList arrayList2 = this.f35726k1;
        int size2 = arrayList2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            sb2.append(((SecureDocument) arrayList2.get(i13)).secureFile.f20478id);
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
                        F1(arrayList);
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
            b1();
            org.telegram.ui.Components.ti tiVar = this.R0;
            if (tiVar != null) {
                tiVar.f30742j0.g0(i10, intent, this.Q0);
            }
            this.Q0 = null;
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i10 = this.f35704b;
        if (i10 == 7) {
            if (z10) {
                int i11 = this.I1;
                org.telegram.ui.Components.tw0[] tw0VarArr = this.J1;
                tw0VarArr[i11].c(true);
                for (org.telegram.ui.Components.tw0 tw0Var : tw0VarArr) {
                    if (tw0Var != null) {
                        tw0Var.f();
                    }
                }
            }
        } else if (i10 != 0 && i10 != 5) {
            if (i10 == 1 || i10 == 2) {
                return !W0(z10);
            }
        } else if (z10) {
            V0(false);
        }
        return true;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        if (this.f35704b == 3 && dialog == this.L1) {
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
        V0(false);
        org.telegram.ui.Components.ti tiVar = this.R0;
        if (tiVar != null) {
            tiVar.dismissInternal();
            this.R0.B1();
        }
        if (this.f35704b == 7) {
            while (true) {
                org.telegram.ui.Components.tw0[] tw0VarArr = this.J1;
                if (i10 >= tw0VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.tw0 tw0Var = tw0VarArr[i10];
                if (tw0Var != null) {
                    tw0Var.f();
                }
                i10++;
            }
            org.telegram.ui.ActionBar.c2 c2Var = this.K1;
            if (c2Var != null) {
                try {
                    c2Var.dismiss();
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
        org.telegram.ui.Components.ti tiVar = this.R0;
        if (tiVar != null) {
            tiVar.D1();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.ti tiVar;
        org.telegram.ui.Cells.ca caVar;
        int i11 = this.f35704b;
        if ((i11 == 1 || i11 == 2) && (tiVar = this.R0) != null) {
            if (i10 == 17) {
                tiVar.f30742j0.U(false);
            } else if (i10 == 21) {
                if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.PermissionNoAudioVideoWithHint);
                    alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new nl0(this, 0));
                    org.telegram.messenger.v0.o(R.string.OK, alertDialog$Builder, null);
                }
            } else if (i10 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                E1(0);
            } else if (i10 == 22 && iArr != null && iArr.length > 0 && iArr[0] == 0 && (caVar = this.f35739r0) != null) {
                caVar.callOnClick();
            }
        } else if (i11 == 3 && i10 == 6) {
            N1(false, this.E1, this.F1, this.G1, this.H1);
        }
    }

    @Override
    public final void onResume() {
        ViewGroup[] viewGroupArr;
        ViewGroup viewGroup;
        super.onResume();
        org.telegram.ui.Components.ti tiVar = this.R0;
        if (tiVar != null) {
            tiVar.E1();
        }
        if (this.f35704b == 5 && (viewGroupArr = this.Z) != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
            this.Y[0].requestFocus();
            AndroidUtilities.showKeyboard(this.Y[0]);
            AndroidUtilities.runOnUIThread(new kl0(this, 0), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an0.onThemeColorsChanged():void");
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (this.f35720h1 != null) {
            AndroidUtilities.runOnUIThread(new kl0(this, 1));
        }
        int i10 = this.f35704b;
        if (i10 == 5) {
            if (z10) {
                if (this.Z[0].getVisibility() == 0) {
                    this.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(this.Y[0]);
                }
                if (this.N0 == 2) {
                    A1(false);
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
            b1();
        }
    }

    public final TLRPC.TL_secureValue q1(TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z10) {
        String[] strArr;
        if (tL_secureRequiredType != null) {
            int size = this.f35756y.values.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.TL_secureValue tL_secureValue = this.f35756y.values.get(i10);
                if (tL_secureRequiredType.type.getClass() == tL_secureValue.type.getClass()) {
                    if (z10) {
                        if (!tL_secureRequiredType.selfie_required || (tL_secureValue.selfie instanceof TLRPC.TL_secureFile)) {
                            if (!tL_secureRequiredType.translation_required || !tL_secureValue.translation.isEmpty()) {
                                if (!s1(tL_secureRequiredType.type) || !tL_secureValue.files.isEmpty()) {
                                    if (!u1(tL_secureRequiredType.type) || (tL_secureValue.front_side instanceof TLRPC.TL_secureFile)) {
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
                                                    JSONObject jSONObject = new JSONObject(g1(tL_secureData.data, h1(tL_secureData.secret, tL_secureData.data_hash), tL_secureValue.data.data_hash));
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

    public final boolean r1(Class cls) {
        int size = this.f35756y.values.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f35756y.values.get(i10).type.getClass() == cls) {
                return false;
            }
        }
        return true;
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

    public final boolean t1() {
        String str = this.f35701a;
        if (str != null && !str.equals(l1())) {
            return false;
        }
        return true;
    }

    public final void v1() {
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ol0(this, 3)), this.classGuid);
    }

    public final void w1() {
        org.telegram.ui.ActionBar.c2 c2Var = this.K1;
        if (c2Var == null) {
            return;
        }
        try {
            c2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.K1 = null;
    }

    public final void x1() {
        if (getParentActivity() != null && !getParentActivity().isFinishing() && this.K1 == null) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
            this.K1 = c2Var;
            c2Var.f20762i0 = false;
            c2Var.show();
        }
    }

    public final void y1(View view) {
        if (view == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        AndroidUtilities.shakeView(view);
        H1(view);
    }

    public final void z1(boolean z10) {
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

    public an0(int i10, long j10, String str, String str2, String str3, String str4, String str5, TL_account.authorizationForm authorizationform, TL_account.Password password) {
        this(i10, authorizationform, password, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (HashMap) null, (HashMap) null);
        int i11;
        String n12;
        String str6;
        String str7;
        String str8;
        String str9;
        this.f35707c = j10;
        this.d = str3;
        this.e = str4;
        this.h = str;
        this.f35738r = str2;
        this.f35729n = str5;
        if (i10 != 0 || authorizationform.errors.isEmpty()) {
            return;
        }
        try {
            Collections.sort(authorizationform.errors, new gm0(this));
            int size = authorizationform.errors.size();
            int i12 = 0;
            while (i12 < size) {
                TLRPC.SecureValueError secureValueError = authorizationform.errors.get(i12);
                byte[] bArr = null;
                if (secureValueError instanceof TLRPC.TL_secureValueErrorFrontSide) {
                    TLRPC.TL_secureValueErrorFrontSide tL_secureValueErrorFrontSide = (TLRPC.TL_secureValueErrorFrontSide) secureValueError;
                    n12 = n1(tL_secureValueErrorFrontSide.type);
                    str6 = tL_secureValueErrorFrontSide.text;
                    bArr = tL_secureValueErrorFrontSide.file_hash;
                    str7 = null;
                    str8 = "front";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorReverseSide) {
                    TLRPC.TL_secureValueErrorReverseSide tL_secureValueErrorReverseSide = (TLRPC.TL_secureValueErrorReverseSide) secureValueError;
                    n12 = n1(tL_secureValueErrorReverseSide.type);
                    str6 = tL_secureValueErrorReverseSide.text;
                    bArr = tL_secureValueErrorReverseSide.file_hash;
                    str7 = null;
                    str8 = "reverse";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorSelfie) {
                    TLRPC.TL_secureValueErrorSelfie tL_secureValueErrorSelfie = (TLRPC.TL_secureValueErrorSelfie) secureValueError;
                    n12 = n1(tL_secureValueErrorSelfie.type);
                    str6 = tL_secureValueErrorSelfie.text;
                    bArr = tL_secureValueErrorSelfie.file_hash;
                    str7 = null;
                    str8 = "selfie";
                } else {
                    if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFile) {
                        TLRPC.TL_secureValueErrorTranslationFile tL_secureValueErrorTranslationFile = (TLRPC.TL_secureValueErrorTranslationFile) secureValueError;
                        n12 = n1(tL_secureValueErrorTranslationFile.type);
                        str6 = tL_secureValueErrorTranslationFile.text;
                        bArr = tL_secureValueErrorTranslationFile.file_hash;
                        str7 = null;
                    } else if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFiles) {
                        TLRPC.TL_secureValueErrorTranslationFiles tL_secureValueErrorTranslationFiles = (TLRPC.TL_secureValueErrorTranslationFiles) secureValueError;
                        n12 = n1(tL_secureValueErrorTranslationFiles.type);
                        str6 = tL_secureValueErrorTranslationFiles.text;
                        str7 = null;
                    } else {
                        if (secureValueError instanceof TLRPC.TL_secureValueErrorFile) {
                            TLRPC.TL_secureValueErrorFile tL_secureValueErrorFile = (TLRPC.TL_secureValueErrorFile) secureValueError;
                            n12 = n1(tL_secureValueErrorFile.type);
                            str6 = tL_secureValueErrorFile.text;
                            bArr = tL_secureValueErrorFile.file_hash;
                            str7 = null;
                        } else if (secureValueError instanceof TLRPC.TL_secureValueErrorFiles) {
                            TLRPC.TL_secureValueErrorFiles tL_secureValueErrorFiles = (TLRPC.TL_secureValueErrorFiles) secureValueError;
                            n12 = n1(tL_secureValueErrorFiles.type);
                            str6 = tL_secureValueErrorFiles.text;
                            str7 = null;
                        } else if (secureValueError instanceof TLRPC.TL_secureValueError) {
                            TLRPC.TL_secureValueError tL_secureValueError = (TLRPC.TL_secureValueError) secureValueError;
                            n12 = n1(tL_secureValueError.type);
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
                                        n12 = n1(tL_secureValueErrorData.type);
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
                HashMap hashMap = (HashMap) this.f35747u1.get(n12);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    i11 = size;
                    this.f35747u1.put(n12, hashMap);
                    this.f35749v1.put(n12, str6);
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
