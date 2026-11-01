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
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.ge;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.dq;
import org.telegram.ui.af;
import org.telegram.ui.d01;
import org.telegram.ui.i70;
import org.telegram.ui.pa0;
public final class e2 {
    public final int f34450a;
    public final k0 f34451b;
    public final HashSet f34452c = new HashSet();
    public final ArrayList d = new ArrayList();
    public int e;
    public final ConnectionsManager f34453f;
    public a2 f34454g;
    public boolean h;

    public e2(k0 k0Var) {
        this.e = -1;
        int i10 = k0Var.f34781a;
        this.f34450a = i10;
        this.f34451b = k0Var;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        this.f34453f = connectionsManager;
        if (this.e >= 0) {
            return;
        }
        this.e = connectionsManager.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new a3.b(1), new d(this, 4));
    }

    public static String C(String str) {
        if (TextUtils.isEmpty(str)) {
            return dd.L0(2131742998, null);
        }
        if (str.length() <= 10) {
            return str;
        }
        return str.substring(0, 4) + "…" + str.substring(str.length() - 4);
    }

    public static org.telegram.ui.Wallet.a3 D(android.content.Context r30, final int r31, final org.telegram.ui.Wallet.z1 r32, final org.telegram.tgnet.TLRPC.TL_urlAuthResultRequest r33, final org.telegram.ui.ActionBar.p6 r34, final org.telegram.ui.q70 r35, final java.lang.Runnable r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.e2.D(android.content.Context, int, org.telegram.ui.Wallet.z1, org.telegram.tgnet.TLRPC$TL_urlAuthResultRequest, org.telegram.ui.ActionBar.p6, org.telegram.ui.q70, java.lang.Runnable):org.telegram.ui.Wallet.a3");
    }

    public static LinearLayout F(Context context, String str, org.telegram.ui.ActionBar.p6 p6Var) {
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        int L = org.telegram.messenger.i0.L(16.0f);
        int i10 = org.telegram.ui.ActionBar.t6.f20930d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        f7.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(f7, d02, N, null, p6Var);
        org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context, p6Var);
        p4Var.setText(str);
        f7.addView(p4Var, w7.b6.o(-1, -2));
        return f7;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.e2.I(org.json.JSONObject, java.lang.String, int):void");
    }

    public static void a(e2 e2Var, TL_wallet.tonConnectSession tonconnectsession, String str, k kVar) {
        if (!e2Var.f34452c.remove(Long.valueOf(tonconnectsession.f20056id))) {
            return;
        }
        if (str == null) {
            Collection.EL.removeIf(e2Var.d, new a1(tonconnectsession, 0));
            e2Var.f34451b.L();
        }
        kVar.a(str);
    }

    public static SpannableStringBuilder b(long j10) {
        String o10 = k0.o(j10, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(o10);
        int indexOf = o10.indexOf(46);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6875f), indexOf, spannableStringBuilder.length(), 33);
        }
        if (spannableStringBuilder.length() == 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != 'x') {
            spannableStringBuilder.append((CharSequence) " x");
        }
        dq dqVar = new dq(2131232816, 2);
        dqVar.d = false;
        dqVar.c(org.telegram.messenger.i0.L(16.0f));
        spannableStringBuilder.setSpan(dqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static LinearLayout c(Context context, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, String str, org.telegram.ui.ActionBar.p6 p6Var) {
        int i10;
        boolean z10;
        LinearLayout.LayoutParams o10;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(5.0f));
        ImageView imageView = new ImageView(context);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{-14899731, -15431455});
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        imageView.setImageResource(2131231955);
        imageView.setPadding(org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f));
        linearLayout.addView(imageView, w7.b6.q(46, 46, 0.0f, 16, 0, 0, 12, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        if (charSequence2 == null && str == null) {
            i10 = 16;
        } else {
            i10 = 48;
        }
        linearLayout2.setGravity(i10);
        TextView textView = new TextView(context);
        a30.n(textView, 1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(textView, i11, p6Var);
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
            o10 = w7.b6.r(-1, org.telegram.messenger.i0.L(24.0f), 16);
        } else {
            o10 = w7.b6.o(-1, -2);
        }
        o10.weight = 0.0f;
        linearLayout2.addView(textView, o10);
        if (!TextUtils.isEmpty(charSequence2)) {
            TextView g10 = org.telegram.messenger.m5.g(context, 1, 14.0f);
            org.telegram.ui.ActionBar.a7.V(g10, org.telegram.ui.ActionBar.t6.f21331z6, p6Var);
            g10.setSingleLine(true);
            g10.setEllipsize(TextUtils.TruncateAt.END);
            g10.setText(charSequence2);
            linearLayout2.addView(g10, w7.b6.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView2 = new TextView(context);
            org.telegram.ui.ActionBar.c5 c5Var = new org.telegram.ui.ActionBar.c5(0, false, false, null);
            c5Var.f20230x = false;
            c5Var.f20229w = Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Xl, p6Var));
            textView2.setBackground(c5Var);
            textView2.setPadding(org.telegram.messenger.i0.L(19.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(8.0f));
            textView2.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.a7.V(textView2, i11, p6Var);
            textView2.setMaxLines(2);
            textView2.setText(str);
            linearLayout2.addView(textView2, w7.b6.k(0.0f, 6.0f, 0.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(linearLayout2, w7.b6.p(0, -2, 1.0f, 16));
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            TextView textView3 = new TextView(context);
            textView3.setTypeface(org.telegram.messenger.i0.o());
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(21);
            textView3.setText(spannableStringBuilder);
            if (spannableStringBuilder.toString().startsWith("+")) {
                i11 = org.telegram.ui.ActionBar.t6.ik;
            }
            org.telegram.ui.ActionBar.a7.V(textView3, i11, p6Var);
            linearLayout.addView(textView3, w7.b6.q(-2, -2, 0.0f, 16, 8, 0, 0, 0));
        }
        return linearLayout;
    }

    public static JSONObject g(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, byte[] bArr2, int i10) {
        if (tonconnectsession.client_id != null) {
            JSONObject jSONObject = new JSONObject(WalletEngine2.tonConnectCrypto(h0Var, tonconnectsession, str, bArr, new JSONObject().put("decrypt", Base64.encodeToString(bArr2, 2))).getString("plaintext"));
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
                            I(jSONObject3, str, i10);
                            jSONObject.put("transaction", jSONObject3);
                        } else {
                            throw new IllegalArgumentException("Expected one JSON transaction parameter");
                        }
                    }
                } catch (Exception e) {
                    jSONObject.put("errorCode", 1).put("errorMessage", e.getMessage());
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

    public static TextView h(Context context, String str, org.telegram.ui.ActionBar.p6 p6Var) {
        TextView textView = new TextView(context);
        a30.n(textView, 1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Ci, p6Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        textView.setText(spannableStringBuilder);
        return textView;
    }

    public static String i(String str, Exception exc) {
        org.telegram.messenger.f8.e("[gram-wallet] TON Connect ".concat(str), exc);
        String message = exc.getMessage();
        if (message != null && !message.isEmpty()) {
            return message;
        }
        return exc.getClass().getSimpleName();
    }

    public static SpannableStringBuilder k(long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        spannableString.setSpan(new dq(2131232815, 0), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) k0.o(-j10, true)).append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) dd.L0(2131749525, null));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-9577217), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static String l(long j10, long j11) {
        StringBuilder s10 = a1.g.s(j10, "tonconnect_reply.", ".");
        s10.append(j11);
        return s10.toString();
    }

    public static void m(String str, String str2) {
        if (str2 != null) {
            org.telegram.messenger.f8.d("[gram-wallet] TON Connect " + str + ": " + str2);
        }
    }

    public static String n(String str) {
        URI create = URI.create(str);
        if ("https".equalsIgnoreCase(create.getScheme()) && create.getHost() != null) {
            return create.getHost().toLowerCase(Locale.ROOT);
        }
        throw new IllegalArgumentException("Manifest URL must use HTTPS and include a host");
    }

    public static void q(Context context, int i10, long j10, int i11, org.telegram.ui.ActionBar.p6 p6Var, pa0 pa0Var) {
        k0 x10 = k0.x(i10);
        e2 e2Var = x10.f34785g;
        i70 i70Var = new i70(context, i10, x10, p6Var, pa0Var);
        if (!e2Var.h && e2Var.f34454g == null) {
            String string = wp.r1(e2Var.f34450a).f7.getString(l(j10, i11), null);
            if (string != null) {
                e2Var.h = true;
                d01 d01Var = new d01(12, e2Var, i70Var);
                try {
                    e2Var.E(j10, i11, new JSONObject(string), d01Var);
                    return;
                } catch (Exception e) {
                    d01Var.a(i("restore response", e));
                    return;
                }
            }
            e2Var.h = true;
            e2Var.f34451b.m0(new org.telegram.ui.z(e2Var, j10, i70Var, i11));
            return;
        }
        i70Var.a(null, "A TON Connect request is already open");
    }

    public static b2 r(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, String str2, String str3, String str4, TL_wallet.tonConnectChallenge tonconnectchallenge, int i10) {
        JSONObject jSONObject = new JSONObject(str2);
        if (str3.equals(jSONObject.getString("manifestUrl"))) {
            String n10 = n(str3);
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && n10.equals(n(tonconnectmanifest.url))) {
                return s(h0Var, tonconnectsession, str, bArr, jSONObject.getJSONArray("items"), n10, str4, tonconnectchallenge, i10);
            }
            throw new IllegalArgumentException("Manifest domain does not match the connection request");
        }
        throw new IllegalArgumentException("Manifest URL changed");
    }

    public static b2 s(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, String str2, String str3, TL_wallet.tonConnectChallenge tonconnectchallenge, int i10) {
        boolean z10;
        JSONObject jSONObject;
        String str4;
        int i11;
        String str5;
        String str6;
        h0 h0Var2 = h0Var;
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
            int i12 = 0;
            while (true) {
                String str8 = "ton_proof";
                String str9 = "ton_addr";
                if (i12 < jSONArray2.length()) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i12);
                    int i13 = i12;
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
                        i12 = i13 + 1;
                    } else {
                        throw new IllegalArgumentException("Duplicate connect item");
                    }
                } else if (hashSet.contains("ton_addr")) {
                    if (tonconnectchallenge != null) {
                        put.put("challenge", Base64.encodeToString(tonconnectchallenge.challenge, 2));
                    }
                    JSONObject jSONObject4 = WalletEngine2.tonConnectCrypto(h0Var2, tonconnectsession, str, bArr, put);
                    if (tonconnectchallenge == null) {
                        return new b2(jSONObject4);
                    }
                    if (tonconnectchallenge.event_id >= 0) {
                        JSONArray jSONArray3 = new JSONArray();
                        TL_wallet.walletOwnershipProof walletownershipproof = null;
                        int i14 = 0;
                        while (i14 < jSONArray2.length()) {
                            JSONObject jSONObject5 = jSONArray2.getJSONObject(i14);
                            String string = jSONObject5.getString("name");
                            if (str9.equals(string)) {
                                jSONArray3.put(jSONObject4.getJSONObject(str7));
                                jSONObject = jSONObject4;
                                str4 = str7;
                                i11 = i14;
                                str5 = str8;
                                str6 = str9;
                            } else if (str8.equals(string)) {
                                String string2 = jSONObject5.getString("payload");
                                str4 = str7;
                                i11 = i14;
                                JSONObject jSONObject6 = WalletEngine2.tonConnectCrypto(h0Var2, tonconnectsession, str, bArr, new JSONObject().put("proofDomain", str2).put("proofPayload", string2).put("timestamp", i10));
                                str5 = str8;
                                TL_wallet.walletOwnershipProof walletownershipproof2 = new TL_wallet.walletOwnershipProof();
                                walletownershipproof2.timestamp = i10;
                                str6 = str9;
                                jSONObject = jSONObject4;
                                walletownershipproof2.signature = Base64.decode(jSONObject6.getString("signature"), 2);
                                jSONArray3.put(new JSONObject().put("name", string).put("proof", new JSONObject().put("timestamp", i10).put("domain", new JSONObject().put("lengthBytes", str2.getBytes(StandardCharsets.UTF_8).length).put("value", str2)).put("payload", string2).put("signature", jSONObject6.getString("signature"))));
                                walletownershipproof = walletownershipproof2;
                            } else {
                                jSONObject = jSONObject4;
                                str4 = str7;
                                i11 = i14;
                                str5 = str8;
                                str6 = str9;
                                jSONArray3.put(new JSONObject().put("name", string).put("error", new JSONObject().put("code", 400).put("message", "Method is not supported")));
                            }
                            i14 = i11 + 1;
                            h0Var2 = h0Var;
                            jSONArray2 = jSONArray;
                            str7 = str4;
                            str8 = str5;
                            str9 = str6;
                            jSONObject4 = jSONObject;
                        }
                        JSONObject jSONObject7 = jSONObject4;
                        JSONObject put2 = new JSONObject().put("event", "connect").put("id", tonconnectchallenge.event_id).put("payload", new JSONObject().put("items", jSONArray3).put("device", new JSONObject().put("platform", "android").put("appName", "gramwallet").put("appVersion", org.telegram.messenger.v2.f18580c).put("maxProtocolVersion", 2).put("features", new JSONArray().put(new JSONObject().put("name", "SendTransaction").put("maxMessages", 255)).put(new JSONObject().put("name", "SignMessage").put("maxMessages", 255)).put(new JSONObject().put("name", "SignData").put("types", new JSONArray().put("text").put("binary").put("cell"))))));
                        if (str3 != null) {
                            put2.put("response", new JSONObject().put("error", new JSONObject().put("code", 400).put("message", "Embedded request is not supported")));
                        }
                        JSONObject jSONObject8 = WalletEngine2.tonConnectCrypto(h0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", put2));
                        jSONObject8.put("challengeAnswer", jSONObject7.getString("challengeAnswer"));
                        b2 b2Var = new b2(jSONObject8);
                        b2Var.d = walletownershipproof;
                        return b2Var;
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

    public static b2 t(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, long j10) {
        if (j10 >= 0 && tonconnectsession.client_id != null) {
            return new b2(WalletEngine2.tonConnectCrypto(h0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", new JSONObject().put("event", "disconnect").put("id", j10).put("payload", new JSONObject()))));
        }
        throw new IllegalArgumentException("Invalid disconnect session or event ID");
    }

    public static TextView v(int i10, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.p6 p6Var) {
        TextView textView = new TextView(context);
        textView.setText(charSequence);
        textView.setTextSize(1, i10);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
        textView.setGravity(17);
        return textView;
    }

    public static boolean w(z1 z1Var) {
        if (z1Var != null) {
            try {
                JSONArray jSONArray = new JSONObject(z1Var.f35451a).getJSONArray("items");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if ("ton_proof".equals(jSONArray.getJSONObject(i10).optString("name"))) {
                        return true;
                    }
                }
            } catch (Exception e) {
                i("read proof request", e);
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
        String p5;
        if (tL_error == null) {
            str2 = str.concat(" returned an empty or unsuccessful response");
        } else {
            str2 = tL_error.text;
            if (str2 == null) {
                str2 = "RPC error " + tL_error.code;
            }
        }
        StringBuilder u10 = a1.g.u("[gram-wallet] TON Connect ", str, ": ");
        if (tL_error == null) {
            p5 = "";
        } else {
            p5 = a1.g.p(new StringBuilder("code="), tL_error.code, " ");
        }
        u10.append(p5);
        u10.append(str2);
        org.telegram.messenger.f8.d(u10.toString());
        return str2;
    }

    public final boolean A(a2 a2Var) {
        if (!a2Var.f34182q) {
            String str = a2Var.h;
            k0 k0Var = this.f34451b;
            if (Objects.equals(str, k0Var.t()) && Arrays.equals(a2Var.f34173g, k0Var.y())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void B(a2 a2Var, h0 h0Var, r20 r20Var) {
        WalletEngine2 walletEngine2 = this.f34451b.f34782b;
        if (walletEngine2 != null) {
            boolean A = A(a2Var);
            int i10 = a2Var.f34170b;
            TL_wallet.tonConnectSession tonconnectsession = a2Var.f34169a;
            if (A && !j(a2Var)) {
                SharedPreferences sharedPreferences = wp.r1(this.f34450a).f7;
                String string = sharedPreferences.getString(l(tonconnectsession.f20056id, i10) + ".transfer", null);
                if (string != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        TL_wallet.sendTransfer sendtransfer = new TL_wallet.sendTransfer();
                        sendtransfer.user_id = new TLRPC.TL_inputUserEmpty();
                        sendtransfer.data_normal = Base64.decode(jSONObject.getString("boc"), 2);
                        sendtransfer.random_id = jSONObject.getLong("randomId");
                        this.f34453f.sendRequestTyped(sendtransfer, new a3.b(1), new af(this, r20Var, a2Var, h0Var, sendtransfer, 5));
                        return;
                    } catch (Exception e) {
                        r20Var.a(i("restore transfer", e));
                        return;
                    }
                }
                d2 d2Var = a2Var.f34172f;
                walletEngine2.prepareTonConnectTransfer(h0Var, d2Var, "ton-connect:" + tonconnectsession.f20056id + ":" + i10, new q(this, a2Var, h0Var, r20Var, 7));
                return;
            }
        }
        y(a2Var, h0Var, null, 0, "Wallet unavailable or request expired", r20Var);
    }

    public final void E(long j10, int i10, JSONObject jSONObject, r20 r20Var) {
        TL_wallet.tonConnectSubmitResponse tonconnectsubmitresponse = new TL_wallet.tonConnectSubmitResponse();
        tonconnectsubmitresponse.session_id = j10;
        tonconnectsubmitresponse.msg_id = i10;
        tonconnectsubmitresponse.trace_id = jSONObject.optString("traceId", null);
        tonconnectsubmitresponse.body = Base64.decode(jSONObject.optString("body"), 2);
        this.f34453f.sendRequestTyped(tonconnectsubmitresponse, new a3.b(1), new org.telegram.ui.Components.s2(this, r20Var, jSONObject, j10, i10));
    }

    public final boolean d(z1 z1Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectSession tonconnectsession2 = z1Var.e;
        if (!tonconnectsession2.closed && !tonconnectsession2.closing && tonconnectsession2.manifest_error == null && (tonconnectmanifest = tonconnectsession2.manifest) != null && Objects.equals(tonconnectmanifest.url, tonconnectsession.manifest.url) && Objects.equals(z1Var.e.manifest.name, tonconnectsession.manifest.name)) {
            TLRPC.WebDocument webDocument = z1Var.e.manifest.icon;
            TLRPC.WebDocument webDocument2 = tonconnectsession.manifest.icon;
            if ((webDocument == webDocument2 || (webDocument != null && webDocument2 != null && Objects.equals(webDocument.url, webDocument2.url))) && Arrays.equals(z1Var.e.nonce, tonconnectsession.nonce)) {
                k0 k0Var = this.f34451b;
                if (str.equals(k0Var.t()) && Arrays.equals(bArr, k0Var.y())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void e(int i10, long j10, r20 r20Var) {
        long j11;
        wp.r1(this.f34450a).f7.edit().remove(l(j10, i10)).remove(l(j10, j11) + ".transfer").apply();
        a2 a2Var = this.f34454g;
        if (a2Var != null && a2Var.f34169a.f20056id == j10 && a2Var.f34170b == i10) {
            a2Var.f34179n = true;
        }
        r20Var.a(null);
    }

    public final void f(a2 a2Var, boolean z10, r20 r20Var) {
        boolean z11 = a2Var.f34178m;
        TL_wallet.tonConnectSession tonconnectsession = a2Var.f34169a;
        if (z11) {
            return;
        }
        if (!a2Var.f34179n && !j(a2Var) && A(a2Var) && (z10 || a2Var.f34177l >= 0 || "disconnect".equals(a2Var.e) || a2Var.f34181p)) {
            a2Var.f34178m = true;
            m mVar = new m(this, a2Var, r20Var, 2);
            String string = wp.r1(this.f34450a).f7.getString(l(tonconnectsession.f20056id, a2Var.f34170b), null);
            if (string != null) {
                try {
                    try {
                        E(tonconnectsession.f20056id, a2Var.f34170b, new JSONObject(string), mVar);
                    } catch (Exception e) {
                        e = e;
                        mVar = mVar;
                        mVar.a(i("restore response", e));
                    }
                } catch (Exception e7) {
                    e = e7;
                }
            } else {
                this.f34451b.z(new v(this, mVar, a2Var, z10, 1), true, false);
            }
        } else {
            r20Var.a("Request expired, was processed, or the wallet changed");
        }
    }

    public final boolean j(a2 a2Var) {
        long currentTime = this.f34453f.getCurrentTime();
        if (a2Var.f34171c > currentTime) {
            d2 d2Var = a2Var.f34172f;
            if (d2Var != null) {
                long j10 = d2Var.f34373a;
                if (j10 == 0 || j10 > currentTime) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void o(int i10, long j10) {
        a2 a2Var = this.f34454g;
        if (a2Var != null && a2Var.f34169a.f20056id == j10 && a2Var.f34170b == i10 && !a2Var.f34178m) {
            a2Var.f34179n = true;
            Runnable runnable = a2Var.f34183r;
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
        a1 a1Var = new a1(tonconnectsession, 1);
        ArrayList arrayList = this.d;
        Collection.EL.removeIf(arrayList, a1Var);
        if (!tonconnectsession.closed) {
            arrayList.add(tonconnectsession);
        }
        a2 a2Var = this.f34454g;
        if (a2Var != null) {
            TL_wallet.tonConnectSession tonconnectsession2 = a2Var.f34169a;
            if (tonconnectsession2.f20056id == tonconnectsession.f20056id && (tonconnectsession.closed || tonconnectsession.closing || !Objects.equals(tonconnectsession.client_id, tonconnectsession2.client_id) || !Arrays.equals(tonconnectsession.nonce, tonconnectsession2.nonce) || (tonconnectmanifest = tonconnectsession.manifest) == null || (tonconnectmanifest2 = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectmanifest2.url) || !Objects.equals(tonconnectsession.manifest.name, tonconnectsession2.manifest.name) || ((webDocument = tonconnectsession.manifest.icon) != (webDocument2 = tonconnectsession2.manifest.icon) && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))))) {
                a2Var.f34182q = true;
                o(a2Var.f34170b, tonconnectsession.f20056id);
            }
        }
        at.f(this.f34450a).k(at.f14678a4, this.f34451b, tonconnectsession);
    }

    public final void u(a2 a2Var) {
        a2Var.f34183r = null;
        if (!a2Var.f34178m && this.f34454g == a2Var) {
            this.f34454g = null;
        }
    }

    public final void y(a2 a2Var, h0 h0Var, Object obj, int i10, String str, r20 r20Var) {
        Utilities.e.c(new ge(this, a2Var, i10, obj, str, h0Var, r20Var, 14));
    }
}
