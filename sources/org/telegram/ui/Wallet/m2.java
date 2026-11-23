package org.telegram.ui.Wallet;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Base64;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.Objects;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.kq;
import org.telegram.ui.a31;
import org.telegram.ui.k90;
import org.telegram.ui.m60;
import org.telegram.ui.ne;
public final class m2 {
    public final int f44648a;
    public final v0 f44649b;
    public final HashSet f44650c = new HashSet();
    public final ArrayList d = new ArrayList();
    public int f44651e;
    public final ConnectionsManager f44652f;
    public i2 f44653g;
    public boolean h;

    public m2(v0 v0Var) {
        this.f44651e = -1;
        int i7 = v0Var.f45255a;
        this.f44648a = i7;
        this.f44649b = v0Var;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
        this.f44652f = connectionsManager;
        if (this.f44651e >= 0) {
            return;
        }
        this.f44651e = connectionsManager.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new d3.b(1), new e(this, 4));
    }

    public static String C(String str) {
        if (TextUtils.isEmpty(str)) {
            return gd.N0(2131742701, null);
        }
        if (str.length() <= 10) {
            return str;
        }
        return str.substring(0, 4) + "…" + str.substring(str.length() - 4);
    }

    public static org.telegram.ui.Wallet.f3 D(android.content.Context r30, final int r31, final org.telegram.ui.Wallet.h2 r32, final org.telegram.tgnet.TLRPC.TL_urlAuthResultRequest r33, final org.telegram.ui.ActionBar.i6 r34, final org.telegram.ui.t60 r35, final java.lang.Runnable r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.m2.D(android.content.Context, int, org.telegram.ui.Wallet.h2, org.telegram.tgnet.TLRPC$TL_urlAuthResultRequest, org.telegram.ui.ActionBar.i6, org.telegram.ui.t60, java.lang.Runnable):org.telegram.ui.Wallet.f3");
    }

    public static LinearLayout F(Context context, String str, org.telegram.ui.ActionBar.i6 i6Var) {
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i7 = org.telegram.ui.ActionBar.n6.f29451d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        g10.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(g10, d02, M, null, i6Var);
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context, i6Var);
        o4Var.setText(str);
        g10.addView(o4Var, c8.na.o(-1, -2));
        return g10;
    }

    public static void G(String str, JSONObject jSONObject) {
        H(str, jSONObject);
        String x10 = x("type", jSONObject);
        char c10 = 65535;
        switch (x10.hashCode()) {
            case -1388966911:
                if (x10.equals("binary")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3049826:
                if (x10.equals("cell")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3556653:
                if (x10.equals("text")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                String x11 = x("bytes", jSONObject);
                if (x11.matches("[A-Za-z0-9+/]*={0,2}") && Base64.encodeToString(Base64.decode(x11, 2), 2).replace("=", "").equals(x11.replace("=", ""))) {
                    return;
                }
                throw new IllegalArgumentException("Invalid base64 data");
            case 1:
                x("schema", jSONObject);
                if (!WalletEngine2.isValidCellBoc(x("cell", jSONObject))) {
                    throw new IllegalArgumentException("Invalid data cell");
                }
                return;
            case 2:
                x("text", jSONObject);
                return;
            default:
                throw new IllegalArgumentException("Unknown signing data type");
        }
    }

    public static void H(String str, JSONObject jSONObject) {
        if (jSONObject.has("network") && !"-239".equals(x("network", jSONObject))) {
            throw new IllegalArgumentException("Wrong network");
        }
        if (jSONObject.has("from") && !WalletEngine2.sameTonConnectAddress(x("from", jSONObject), str)) {
            throw new IllegalArgumentException("Wrong signer");
        }
    }

    public static void I(org.json.JSONObject r10, java.lang.String r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.m2.I(org.json.JSONObject, java.lang.String, int):void");
    }

    public static void a(m2 m2Var, TL_wallet.tonConnectSession tonconnectsession, String str, k kVar) {
        if (!m2Var.f44650c.remove(Long.valueOf(tonconnectsession.f28754id))) {
            return;
        }
        if (str == null) {
            Collection.EL.removeIf(m2Var.d, new n1(tonconnectsession, 1));
            m2Var.f44649b.T();
        }
        kVar.a(str);
    }

    public static SpannableStringBuilder b(long j3) {
        String t6 = v0.t(j3, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(t6);
        int indexOf = t6.indexOf(46);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6875f), indexOf, spannableStringBuilder.length(), 33);
        }
        if (spannableStringBuilder.length() == 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != 'x') {
            spannableStringBuilder.append((CharSequence) " x");
        }
        kq kqVar = new kq(2131232824, 2);
        kqVar.d = false;
        kqVar.c(org.telegram.messenger.g0.L(16.0f));
        spannableStringBuilder.setSpan(kqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static LinearLayout c(Context context, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, String str, org.telegram.ui.ActionBar.i6 i6Var) {
        int i7;
        boolean z10;
        LinearLayout.LayoutParams o4;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f));
        ImageView imageView = new ImageView(context);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{-14899731, -15431455});
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        imageView.setImageResource(2131231960);
        imageView.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        linearLayout.addView(imageView, c8.na.q(46, 46, 0.0f, 16, 0, 0, 12, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        if (charSequence2 == null && str == null) {
            i7 = 16;
        } else {
            i7 = 48;
        }
        linearLayout2.setGravity(i7);
        TextView textView = new TextView(context);
        m10.p(textView, 1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
        if (charSequence2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        textView.setSingleLine(z10);
        if (charSequence2 == null) {
            textView.setGravity(16);
        }
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setText(charSequence);
        if (charSequence2 == null) {
            o4 = c8.na.r(-1, org.telegram.messenger.g0.L(24.0f), 16);
        } else {
            o4 = c8.na.o(-1, -2);
        }
        o4.weight = 0.0f;
        linearLayout2.addView(textView, o4);
        if (!TextUtils.isEmpty(charSequence2)) {
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29862z6, i6Var);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(charSequence2);
            linearLayout2.addView(textView2, c8.na.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView3 = new TextView(context);
            org.telegram.ui.ActionBar.u4 u4Var = new org.telegram.ui.ActionBar.u4(0, false, false, null);
            u4Var.f30160x = false;
            u4Var.f30159w = Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.am, i6Var));
            textView3.setBackground(u4Var);
            textView3.setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(8.0f));
            textView3.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.u6.U(textView3, i10, i6Var);
            textView3.setMaxLines(2);
            textView3.setText(str);
            linearLayout2.addView(textView3, c8.na.k(0.0f, 6.0f, 0.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(linearLayout2, c8.na.p(0, -2, 1.0f, 16));
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            TextView textView4 = new TextView(context);
            textView4.setTypeface(org.telegram.messenger.g0.o());
            textView4.setTextSize(1, 14.0f);
            textView4.setGravity(21);
            textView4.setText(spannableStringBuilder);
            if (spannableStringBuilder.toString().startsWith("+")) {
                i10 = org.telegram.ui.ActionBar.n6.lk;
            }
            org.telegram.ui.ActionBar.u6.U(textView4, i10, i6Var);
            linearLayout.addView(textView4, c8.na.q(-2, -2, 0.0f, 16, 8, 0, 0, 0));
        }
        return linearLayout;
    }

    public static JSONObject g(s0 s0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, byte[] bArr2, int i7) {
        if (tonconnectsession.client_id != null) {
            JSONObject jSONObject = new JSONObject(WalletEngine2.tonConnectCrypto(s0Var, tonconnectsession, str, bArr, new JSONObject().put("decrypt", Base64.encodeToString(bArr2, 2))).getString("plaintext"));
            Object obj = jSONObject.get("id");
            if ((obj instanceof String) && ((String) obj).matches("[\\x20-\\x7e]{1,100}")) {
                try {
                    String string = jSONObject.getString("method");
                    JSONArray jSONArray = jSONObject.getJSONArray("params");
                    if ("disconnect".equals(string)) {
                        if (jSONArray.length() != 0) {
                            throw new IllegalArgumentException("Disconnect takes no parameters");
                        }
                    } else {
                        if (!"sendTransaction".equals(string) && !"signMessage".equals(string)) {
                            if ("signData".equals(string)) {
                                if (jSONArray.length() == 1 && (jSONArray.get(0) instanceof String)) {
                                    JSONObject jSONObject2 = new JSONObject(jSONArray.getString(0));
                                    G(str, jSONObject2);
                                    jSONObject.put("data", jSONObject2);
                                } else {
                                    throw new IllegalArgumentException("Expected one JSON data parameter");
                                }
                            } else {
                                jSONObject.put("errorCode", 400).put("errorMessage", "Method is not supported");
                            }
                        }
                        if (jSONArray.length() == 1 && (jSONArray.get(0) instanceof String)) {
                            JSONObject jSONObject3 = new JSONObject(jSONArray.getString(0));
                            I(jSONObject3, str, i7);
                            jSONObject.put("transaction", jSONObject3);
                        } else {
                            throw new IllegalArgumentException("Expected one JSON transaction parameter");
                        }
                    }
                } catch (Exception e10) {
                    jSONObject.put("errorCode", 1).put("errorMessage", e10.getMessage());
                }
                if (tonconnectsession.closed || tonconnectsession.closing || tonconnectsession.pending || tonconnectsession.manifest == null) {
                    jSONObject.put("errorCode", 100).put("errorMessage", "Unknown app");
                }
                return jSONObject;
            }
            throw new IllegalArgumentException("Request ID must contain 1–100 printable ASCII characters");
        }
        throw new IllegalArgumentException("Missing registered session key");
    }

    public static TextView h(Context context, String str, org.telegram.ui.ActionBar.i6 i6Var) {
        TextView textView = new TextView(context);
        m10.p(textView, 1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Fi, i6Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        textView.setText(spannableStringBuilder);
        return textView;
    }

    public static String i(String str, Exception exc) {
        org.telegram.messenger.a8.e("[gram-wallet] TON Connect ".concat(str), exc);
        String message = exc.getMessage();
        if (message != null && !message.isEmpty()) {
            return message;
        }
        return exc.getClass().getSimpleName();
    }

    public static SpannableStringBuilder k(long j3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        spannableString.setSpan(new kq(2131232823, 0), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) v0.t(-j3, true)).append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) gd.N0(2131749340, null));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-9577217), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static String l(long j3, long j10) {
        StringBuilder t6 = a8.p0.t(j3, "tonconnect_reply.", ".");
        t6.append(j10);
        return t6.toString();
    }

    public static void m(String str, String str2) {
        if (str2 != null) {
            org.telegram.messenger.a8.d("[gram-wallet] TON Connect " + str + ": " + str2);
        }
    }

    public static String n(String str) {
        URI create = URI.create(str);
        if ("https".equalsIgnoreCase(create.getScheme()) && create.getHost() != null) {
            return create.getHost().toLowerCase(Locale.ROOT);
        }
        throw new IllegalArgumentException("Manifest URL must use HTTPS and include a host");
    }

    public static void q(Context context, int i7, long j3, int i10, org.telegram.ui.ActionBar.i6 i6Var, k90 k90Var) {
        v0 D = v0.D(i7);
        m2 m2Var = D.f45260g;
        m60 m60Var = new m60(context, i7, D, i6Var, k90Var);
        if (!m2Var.h && m2Var.f44653g == null) {
            String string = mp.u1(m2Var.f44648a).h7.getString(l(j3, i10), null);
            if (string != null) {
                m2Var.h = true;
                a31 a31Var = new a31(9, m2Var, m60Var);
                try {
                    m2Var.E(j3, i10, new JSONObject(string), a31Var);
                    return;
                } catch (Exception e10) {
                    a31Var.a(i("restore response", e10));
                    return;
                }
            }
            m2Var.h = true;
            m2Var.f44649b.x0(new bi.w3(m2Var, j3, m60Var, i10));
            return;
        }
        m60Var.a(null, "A TON Connect request is already open");
    }

    public static j2 r(s0 s0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, String str2, String str3, String str4, TL_wallet.tonConnectChallenge tonconnectchallenge, int i7) {
        JSONObject jSONObject = new JSONObject(str2);
        if (str3.equals(jSONObject.getString("manifestUrl"))) {
            String n10 = n(str3);
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && n10.equals(n(tonconnectmanifest.url))) {
                return s(s0Var, tonconnectsession, str, bArr, jSONObject.getJSONArray("items"), n10, str4, tonconnectchallenge, i7);
            }
            throw new IllegalArgumentException("Manifest domain does not match the connection request");
        }
        throw new IllegalArgumentException("Manifest URL changed");
    }

    public static j2 s(s0 s0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, String str2, String str3, TL_wallet.tonConnectChallenge tonconnectchallenge, int i7) {
        boolean z10;
        JSONObject jSONObject;
        String str4;
        int i10;
        String str5;
        String str6;
        s0 s0Var2 = s0Var;
        JSONArray jSONArray2 = jSONArray;
        if (jSONArray2.length() != 0) {
            JSONObject jSONObject2 = new JSONObject();
            if (tonconnectchallenge != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            String str7 = "account";
            JSONObject put = jSONObject2.put("account", z10);
            HashSet hashSet = new HashSet();
            int i11 = 0;
            while (true) {
                String str8 = "ton_proof";
                String str9 = "ton_addr";
                if (i11 < jSONArray2.length()) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i11);
                    int i12 = i11;
                    if (hashSet.add(jSONObject3.getString("name"))) {
                        if ("ton_addr".equals(jSONObject3.getString("name")) && jSONObject3.has("network") && !"-239".equals(jSONObject3.getString("network"))) {
                            throw new IllegalArgumentException("Requested network does not match the wallet network");
                        }
                        if ("ton_proof".equals(jSONObject3.getString("name"))) {
                            if (!str2.replaceFirst("\\.$", "").equals("telegram.org")) {
                                jSONObject3.getString("payload");
                            } else {
                                throw new IllegalArgumentException("The telegram.org proof domain is reserved for wallet import");
                            }
                        }
                        i11 = i12 + 1;
                    } else {
                        throw new IllegalArgumentException("Duplicate connect item");
                    }
                } else if (hashSet.contains("ton_addr")) {
                    if (tonconnectchallenge != null) {
                        put.put("challenge", Base64.encodeToString(tonconnectchallenge.challenge, 2));
                    }
                    JSONObject jSONObject4 = WalletEngine2.tonConnectCrypto(s0Var2, tonconnectsession, str, bArr, put);
                    if (tonconnectchallenge == null) {
                        return new j2(jSONObject4);
                    }
                    if (tonconnectchallenge.event_id >= 0) {
                        JSONArray jSONArray3 = new JSONArray();
                        TL_wallet.walletOwnershipProof walletownershipproof = null;
                        int i13 = 0;
                        while (i13 < jSONArray2.length()) {
                            JSONObject jSONObject5 = jSONArray2.getJSONObject(i13);
                            String string = jSONObject5.getString("name");
                            if (str9.equals(string)) {
                                jSONArray3.put(jSONObject4.getJSONObject(str7));
                                jSONObject = jSONObject4;
                                str4 = str7;
                                i10 = i13;
                                str5 = str8;
                                str6 = str9;
                            } else if (str8.equals(string)) {
                                String string2 = jSONObject5.getString("payload");
                                str4 = str7;
                                i10 = i13;
                                JSONObject jSONObject6 = WalletEngine2.tonConnectCrypto(s0Var2, tonconnectsession, str, bArr, new JSONObject().put("proofDomain", str2).put("proofPayload", string2).put("timestamp", i7));
                                str5 = str8;
                                TL_wallet.walletOwnershipProof walletownershipproof2 = new TL_wallet.walletOwnershipProof();
                                walletownershipproof2.timestamp = i7;
                                str6 = str9;
                                jSONObject = jSONObject4;
                                walletownershipproof2.signature = Base64.decode(jSONObject6.getString("signature"), 2);
                                jSONArray3.put(new JSONObject().put("name", string).put("proof", new JSONObject().put("timestamp", i7).put("domain", new JSONObject().put("lengthBytes", str2.getBytes(StandardCharsets.UTF_8).length).put("value", str2)).put("payload", string2).put("signature", jSONObject6.getString("signature"))));
                                walletownershipproof = walletownershipproof2;
                            } else {
                                jSONObject = jSONObject4;
                                str4 = str7;
                                i10 = i13;
                                str5 = str8;
                                str6 = str9;
                                jSONArray3.put(new JSONObject().put("name", string).put("error", new JSONObject().put("code", 400).put("message", "Method is not supported")));
                            }
                            i13 = i10 + 1;
                            s0Var2 = s0Var;
                            jSONArray2 = jSONArray;
                            str7 = str4;
                            str8 = str5;
                            str9 = str6;
                            jSONObject4 = jSONObject;
                        }
                        JSONObject jSONObject7 = jSONObject4;
                        JSONObject put2 = new JSONObject().put("event", "connect").put("id", tonconnectchallenge.event_id).put("payload", new JSONObject().put("items", jSONArray3).put("device", new JSONObject().put("platform", "android").put("appName", "telegram").put("appVersion", org.telegram.messenger.s2.f26831c).put("maxProtocolVersion", 2).put("features", new JSONArray().put(new JSONObject().put("name", "SendTransaction").put("maxMessages", 255)).put(new JSONObject().put("name", "SignMessage").put("maxMessages", 255)).put(new JSONObject().put("name", "SignData").put("types", new JSONArray().put("text").put("binary").put("cell"))))));
                        if (str3 != null) {
                            put2.put("response", new JSONObject().put("error", new JSONObject().put("code", 400).put("message", "Embedded request is not supported")));
                        }
                        JSONObject jSONObject8 = WalletEngine2.tonConnectCrypto(s0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", put2));
                        jSONObject8.put("challengeAnswer", jSONObject7.getString("challengeAnswer"));
                        j2 j2Var = new j2(jSONObject8);
                        j2Var.d = walletownershipproof;
                        return j2Var;
                    }
                    throw new IllegalArgumentException("Invalid connect event ID");
                } else {
                    throw new IllegalArgumentException("Missing ton_addr item");
                }
            }
        } else {
            throw new IllegalArgumentException("Empty connect request");
        }
    }

    public static j2 t(s0 s0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, long j3) {
        if (j3 >= 0 && tonconnectsession.client_id != null) {
            return new j2(WalletEngine2.tonConnectCrypto(s0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", new JSONObject().put("event", "disconnect").put("id", j3).put("payload", new JSONObject()))));
        }
        throw new IllegalArgumentException("Invalid disconnect session or event ID");
    }

    public static TextView v(int i7, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.i6 i6Var) {
        TextView textView = new TextView(context);
        textView.setText(charSequence);
        textView.setTextSize(1, i7);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, i6Var);
        textView.setGravity(17);
        return textView;
    }

    public static boolean w(h2 h2Var) {
        if (h2Var != null) {
            try {
                JSONArray jSONArray = new JSONObject(h2Var.f44419a).getJSONArray("items");
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    if ("ton_proof".equals(jSONArray.getJSONObject(i7).optString("name"))) {
                        return true;
                    }
                }
            } catch (Exception e10) {
                i("read proof request", e10);
            }
        }
        return false;
    }

    public static String x(String str, JSONObject jSONObject) {
        Object obj = jSONObject.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new IllegalArgumentException(str.concat(" must be a string"));
    }

    public static String z(TLRPC.TL_error tL_error, String str) {
        String str2;
        String n10;
        if (tL_error == null) {
            str2 = str.concat(" returned an empty or unsuccessful response");
        } else {
            str2 = tL_error.text;
            if (str2 == null) {
                str2 = "RPC error " + tL_error.code;
            }
        }
        StringBuilder u10 = a8.p0.u("[gram-wallet] TON Connect ", str, ": ");
        if (tL_error == null) {
            n10 = "";
        } else {
            n10 = a8.p0.n(tL_error.code, " ", new StringBuilder("code="));
        }
        u10.append(n10);
        u10.append(str2);
        org.telegram.messenger.a8.d(u10.toString());
        return str2;
    }

    public final boolean A(i2 i2Var) {
        if (!i2Var.f44475q) {
            String str = i2Var.h;
            v0 v0Var = this.f44649b;
            if (Objects.equals(str, v0Var.y()) && Arrays.equals(i2Var.f44466g, v0Var.E())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void B(i2 i2Var, s0 s0Var, w10 w10Var) {
        WalletEngine2 walletEngine2 = this.f44649b.f45256b;
        if (walletEngine2 != null) {
            boolean A = A(i2Var);
            int i7 = i2Var.f44462b;
            TL_wallet.tonConnectSession tonconnectsession = i2Var.f44461a;
            if (A && !j(i2Var)) {
                SharedPreferences sharedPreferences = mp.u1(this.f44648a).h7;
                String string = sharedPreferences.getString(l(tonconnectsession.f28754id, i7) + ".transfer", null);
                if (string != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        TL_wallet.sendTransfer sendtransfer = new TL_wallet.sendTransfer();
                        sendtransfer.user_id = new TLRPC.TL_inputUserEmpty();
                        sendtransfer.data_normal = Base64.decode(jSONObject.getString("boc"), 2);
                        sendtransfer.random_id = jSONObject.getLong("randomId");
                        this.f44652f.sendRequestTyped(sendtransfer, new d3.b(1), new ne(this, w10Var, i2Var, s0Var, sendtransfer, 6));
                        return;
                    } catch (Exception e10) {
                        w10Var.a(i("restore transfer", e10));
                        return;
                    }
                }
                l2 l2Var = i2Var.f44465f;
                walletEngine2.prepareTonConnectTransfer(s0Var, l2Var, "ton-connect:" + tonconnectsession.f28754id + ":" + i7, new t(this, i2Var, s0Var, w10Var, 7));
                return;
            }
        }
        y(i2Var, s0Var, null, 0, "Wallet unavailable or request expired", w10Var);
    }

    public final void E(long j3, int i7, JSONObject jSONObject, w10 w10Var) {
        TL_wallet.tonConnectSubmitResponse tonconnectsubmitresponse = new TL_wallet.tonConnectSubmitResponse();
        tonconnectsubmitresponse.session_id = j3;
        tonconnectsubmitresponse.msg_id = i7;
        tonconnectsubmitresponse.trace_id = jSONObject.optString("traceId", null);
        tonconnectsubmitresponse.body = Base64.decode(jSONObject.optString("body"), 2);
        this.f44652f.sendRequestTyped(tonconnectsubmitresponse, new d3.b(1), new bi.z(this, w10Var, jSONObject, j3, i7));
    }

    public final boolean d(h2 h2Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectSession tonconnectsession2 = h2Var.f44422e;
        if (!tonconnectsession2.closed && !tonconnectsession2.closing && tonconnectsession2.manifest_error == null && (tonconnectmanifest = tonconnectsession2.manifest) != null && Objects.equals(tonconnectmanifest.url, tonconnectsession.manifest.url) && Objects.equals(h2Var.f44422e.manifest.name, tonconnectsession.manifest.name)) {
            TLRPC.WebDocument webDocument = h2Var.f44422e.manifest.icon;
            TLRPC.WebDocument webDocument2 = tonconnectsession.manifest.icon;
            if ((webDocument == webDocument2 || (webDocument != null && webDocument2 != null && Objects.equals(webDocument.url, webDocument2.url))) && Arrays.equals(h2Var.f44422e.nonce, tonconnectsession.nonce)) {
                v0 v0Var = this.f44649b;
                if (str.equals(v0Var.y()) && Arrays.equals(bArr, v0Var.E())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void e(int i7, long j3, w10 w10Var) {
        long j10;
        mp.u1(this.f44648a).h7.edit().remove(l(j3, i7)).remove(l(j3, j10) + ".transfer").apply();
        i2 i2Var = this.f44653g;
        if (i2Var != null && i2Var.f44461a.f28754id == j3 && i2Var.f44462b == i7) {
            i2Var.f44472n = true;
        }
        w10Var.a(null);
    }

    public final void f(i2 i2Var, boolean z10, w10 w10Var) {
        boolean z11 = i2Var.f44471m;
        TL_wallet.tonConnectSession tonconnectsession = i2Var.f44461a;
        if (z11) {
            return;
        }
        if (!i2Var.f44472n && !j(i2Var) && A(i2Var) && (z10 || i2Var.f44470l >= 0 || "disconnect".equals(i2Var.f44464e) || i2Var.f44474p)) {
            i2Var.f44471m = true;
            o oVar = new o(this, i2Var, w10Var, 3);
            String string = mp.u1(this.f44648a).h7.getString(l(tonconnectsession.f28754id, i2Var.f44462b), null);
            if (string != null) {
                try {
                    try {
                        E(tonconnectsession.f28754id, i2Var.f44462b, new JSONObject(string), oVar);
                    } catch (Exception e10) {
                        e = e10;
                        oVar = oVar;
                        oVar.a(i("restore response", e));
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } else {
                this.f44649b.F(true, false, false, new d0(this, oVar, i2Var, z10, 1));
            }
        } else {
            w10Var.a("Request expired, was processed, or the wallet changed");
        }
    }

    public final boolean j(i2 i2Var) {
        long currentTime = this.f44652f.getCurrentTime();
        if (i2Var.f44463c > currentTime) {
            l2 l2Var = i2Var.f44465f;
            if (l2Var != null) {
                long j3 = l2Var.f44606a;
                if (j3 == 0 || j3 > currentTime) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void o(int i7, long j3) {
        i2 i2Var = this.f44653g;
        if (i2Var != null && i2Var.f44461a.f28754id == j3 && i2Var.f44462b == i7 && !i2Var.f44471m) {
            i2Var.f44472n = true;
            Runnable runnable = i2Var.f44476r;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void p(TL_wallet.tonConnectSession tonconnectsession) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectManifest tonconnectmanifest2;
        TLRPC.WebDocument webDocument;
        TLRPC.WebDocument webDocument2;
        n1 n1Var = new n1(tonconnectsession, 0);
        ArrayList arrayList = this.d;
        Collection.EL.removeIf(arrayList, n1Var);
        if (!tonconnectsession.closed) {
            arrayList.add(tonconnectsession);
        }
        i2 i2Var = this.f44653g;
        if (i2Var != null) {
            TL_wallet.tonConnectSession tonconnectsession2 = i2Var.f44461a;
            if (tonconnectsession2.f28754id == tonconnectsession.f28754id && (tonconnectsession.closed || tonconnectsession.closing || !Objects.equals(tonconnectsession.client_id, tonconnectsession2.client_id) || !Arrays.equals(tonconnectsession.nonce, tonconnectsession2.nonce) || (tonconnectmanifest = tonconnectsession.manifest) == null || (tonconnectmanifest2 = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectmanifest2.url) || !Objects.equals(tonconnectsession.manifest.name, tonconnectsession2.manifest.name) || ((webDocument = tonconnectsession.manifest.icon) != (webDocument2 = tonconnectsession2.manifest.icon) && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))))) {
                i2Var.f44475q = true;
                o(i2Var.f44462b, tonconnectsession.f28754id);
            }
        }
        ks.f(this.f44648a).k(ks.f25201d4, this.f44649b, tonconnectsession);
    }

    public final void u(i2 i2Var) {
        i2Var.f44476r = null;
        if (!i2Var.f44471m && this.f44653g == i2Var) {
            this.f44653g = null;
        }
    }

    public final void y(i2 i2Var, s0 s0Var, Object obj, int i7, String str, w10 w10Var) {
        Utilities.f22877e.c(new bi.i5(this, i2Var, i7, obj, str, s0Var, w10Var));
    }
}
