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
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.lq;
import org.telegram.ui.l90;
import org.telegram.ui.m60;
import org.telegram.ui.ne;
import org.telegram.ui.p51;
public final class l2 {
    public final int f44479a;
    public final u0 f44480b;
    public final HashSet f44481c = new HashSet();
    public final ArrayList d = new ArrayList();
    public int f44482e;
    public final ConnectionsManager f44483f;
    public h2 f44484g;
    public boolean h;

    public l2(u0 u0Var) {
        this.f44482e = -1;
        int i7 = u0Var.f45083a;
        this.f44479a = i7;
        this.f44480b = u0Var;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
        this.f44483f = connectionsManager;
        if (this.f44482e >= 0) {
            return;
        }
        this.f44482e = connectionsManager.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new d3.b(1), new e(this, 4));
    }

    public static String C(String str) {
        if (TextUtils.isEmpty(str)) {
            return gd.M0(2131742714, null);
        }
        if (str.length() <= 10) {
            return str;
        }
        return str.substring(0, 4) + "…" + str.substring(str.length() - 4);
    }

    public static org.telegram.ui.Wallet.e3 D(android.content.Context r30, final int r31, final org.telegram.ui.Wallet.g2 r32, final org.telegram.tgnet.TLRPC.TL_urlAuthResultRequest r33, final org.telegram.ui.ActionBar.i6 r34, final org.telegram.ui.u60 r35, final java.lang.Runnable r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.l2.D(android.content.Context, int, org.telegram.ui.Wallet.g2, org.telegram.tgnet.TLRPC$TL_urlAuthResultRequest, org.telegram.ui.ActionBar.i6, org.telegram.ui.u60, java.lang.Runnable):org.telegram.ui.Wallet.e3");
    }

    public static LinearLayout F(Context context, String str, org.telegram.ui.ActionBar.i6 i6Var) {
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i7 = org.telegram.ui.ActionBar.n6.f29394d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        g10.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(g10, d02, M, null, i6Var);
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context, i6Var);
        o4Var.setText(str);
        g10.addView(o4Var, c8.ma.o(-1, -2));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.l2.I(org.json.JSONObject, java.lang.String, int):void");
    }

    public static void a(l2 l2Var, TL_wallet.tonConnectSession tonconnectsession, String str, k kVar) {
        if (!l2Var.f44481c.remove(Long.valueOf(tonconnectsession.f28665id))) {
            return;
        }
        if (str == null) {
            Collection.EL.removeIf(l2Var.d, new m1(tonconnectsession, 1));
            l2Var.f44480b.T();
        }
        kVar.a(str);
    }

    public static SpannableStringBuilder b(long j3) {
        String t6 = u0.t(j3, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(t6);
        int indexOf = t6.indexOf(46);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6875f), indexOf, spannableStringBuilder.length(), 33);
        }
        if (spannableStringBuilder.length() == 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != 'x') {
            spannableStringBuilder.append((CharSequence) " x");
        }
        lq lqVar = new lq(2131232821, 2);
        lqVar.d = false;
        lqVar.c(org.telegram.messenger.g0.L(16.0f));
        spannableStringBuilder.setSpan(lqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
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
        imageView.setImageResource(2131231957);
        imageView.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        linearLayout.addView(imageView, c8.ma.q(46, 46, 0.0f, 16, 0, 0, 12, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        if (charSequence2 == null && str == null) {
            i7 = 16;
        } else {
            i7 = 48;
        }
        linearLayout2.setGravity(i7);
        TextView textView = new TextView(context);
        n10.p(textView, 1, 16.0f);
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
            o4 = c8.ma.r(-1, org.telegram.messenger.g0.L(24.0f), 16);
        } else {
            o4 = c8.ma.o(-1, -2);
        }
        o4.weight = 0.0f;
        linearLayout2.addView(textView, o4);
        if (!TextUtils.isEmpty(charSequence2)) {
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29805z6, i6Var);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(charSequence2);
            linearLayout2.addView(textView2, c8.ma.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView3 = new TextView(context);
            org.telegram.ui.ActionBar.v4 v4Var = new org.telegram.ui.ActionBar.v4(0, false, false, null);
            v4Var.f30115x = false;
            v4Var.f30114w = Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.am, i6Var));
            textView3.setBackground(v4Var);
            textView3.setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(8.0f));
            textView3.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.u6.U(textView3, i10, i6Var);
            textView3.setMaxLines(2);
            textView3.setText(str);
            linearLayout2.addView(textView3, c8.ma.k(0.0f, 6.0f, 0.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(linearLayout2, c8.ma.p(0, -2, 1.0f, 16));
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
            linearLayout.addView(textView4, c8.ma.q(-2, -2, 0.0f, 16, 8, 0, 0, 0));
        }
        return linearLayout;
    }

    public static JSONObject g(r0 r0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, byte[] bArr2, int i7) {
        if (tonconnectsession.client_id != null) {
            JSONObject jSONObject = new JSONObject(WalletEngine2.tonConnectCrypto(r0Var, tonconnectsession, str, bArr, new JSONObject().put("decrypt", Base64.encodeToString(bArr2, 2))).getString("plaintext"));
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
        n10.p(textView, 1, 14.0f);
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
        spannableString.setSpan(new lq(2131232820, 0), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) u0.t(-j3, true)).append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) gd.M0(2131749341, null));
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

    public static void q(Context context, int i7, long j3, int i10, org.telegram.ui.ActionBar.i6 i6Var, l90 l90Var) {
        u0 D = u0.D(i7);
        l2 l2Var = D.f45088g;
        m60 m60Var = new m60(context, i7, D, i6Var, l90Var);
        if (!l2Var.h && l2Var.f44484g == null) {
            String string = mp.u1(l2Var.f44479a).h7.getString(l(j3, i10), null);
            if (string != null) {
                l2Var.h = true;
                p51 p51Var = new p51(8, l2Var, m60Var);
                try {
                    l2Var.E(j3, i10, new JSONObject(string), p51Var);
                    return;
                } catch (Exception e10) {
                    p51Var.a(i("restore response", e10));
                    return;
                }
            }
            l2Var.h = true;
            l2Var.f44480b.x0(new bi.q3(l2Var, j3, m60Var, i10));
            return;
        }
        m60Var.a(null, "A TON Connect request is already open");
    }

    public static i2 r(r0 r0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, String str2, String str3, String str4, TL_wallet.tonConnectChallenge tonconnectchallenge, int i7) {
        JSONObject jSONObject = new JSONObject(str2);
        if (str3.equals(jSONObject.getString("manifestUrl"))) {
            String n10 = n(str3);
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && n10.equals(n(tonconnectmanifest.url))) {
                return s(r0Var, tonconnectsession, str, bArr, jSONObject.getJSONArray("items"), n10, str4, tonconnectchallenge, i7);
            }
            throw new IllegalArgumentException("Manifest domain does not match the connection request");
        }
        throw new IllegalArgumentException("Manifest URL changed");
    }

    public static i2 s(r0 r0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, String str2, String str3, TL_wallet.tonConnectChallenge tonconnectchallenge, int i7) {
        boolean z10;
        JSONObject jSONObject;
        String str4;
        int i10;
        String str5;
        String str6;
        r0 r0Var2 = r0Var;
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
                    JSONObject jSONObject4 = WalletEngine2.tonConnectCrypto(r0Var2, tonconnectsession, str, bArr, put);
                    if (tonconnectchallenge == null) {
                        return new i2(jSONObject4);
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
                                JSONObject jSONObject6 = WalletEngine2.tonConnectCrypto(r0Var2, tonconnectsession, str, bArr, new JSONObject().put("proofDomain", str2).put("proofPayload", string2).put("timestamp", i7));
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
                            r0Var2 = r0Var;
                            jSONArray2 = jSONArray;
                            str7 = str4;
                            str8 = str5;
                            str9 = str6;
                            jSONObject4 = jSONObject;
                        }
                        JSONObject jSONObject7 = jSONObject4;
                        JSONObject put2 = new JSONObject().put("event", "connect").put("id", tonconnectchallenge.event_id).put("payload", new JSONObject().put("items", jSONArray3).put("device", new JSONObject().put("platform", "android").put("appName", "telegram").put("appVersion", org.telegram.messenger.s2.f26723c).put("maxProtocolVersion", 2).put("features", new JSONArray().put(new JSONObject().put("name", "SendTransaction").put("maxMessages", 255)).put(new JSONObject().put("name", "SignMessage").put("maxMessages", 255)).put(new JSONObject().put("name", "SignData").put("types", new JSONArray().put("text").put("binary").put("cell"))))));
                        if (str3 != null) {
                            put2.put("response", new JSONObject().put("error", new JSONObject().put("code", 400).put("message", "Embedded request is not supported")));
                        }
                        JSONObject jSONObject8 = WalletEngine2.tonConnectCrypto(r0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", put2));
                        jSONObject8.put("challengeAnswer", jSONObject7.getString("challengeAnswer"));
                        i2 i2Var = new i2(jSONObject8);
                        i2Var.d = walletownershipproof;
                        return i2Var;
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

    public static i2 t(r0 r0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, long j3) {
        if (j3 >= 0 && tonconnectsession.client_id != null) {
            return new i2(WalletEngine2.tonConnectCrypto(r0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", new JSONObject().put("event", "disconnect").put("id", j3).put("payload", new JSONObject()))));
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

    public static boolean w(g2 g2Var) {
        if (g2Var != null) {
            try {
                JSONArray jSONArray = new JSONObject(g2Var.f44247a).getJSONArray("items");
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

    public final boolean A(h2 h2Var) {
        if (!h2Var.f44303q) {
            String str = h2Var.h;
            u0 u0Var = this.f44480b;
            if (Objects.equals(str, u0Var.y()) && Arrays.equals(h2Var.f44294g, u0Var.E())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void B(h2 h2Var, r0 r0Var, x10 x10Var) {
        WalletEngine2 walletEngine2 = this.f44480b.f45084b;
        if (walletEngine2 != null) {
            boolean A = A(h2Var);
            int i7 = h2Var.f44290b;
            TL_wallet.tonConnectSession tonconnectsession = h2Var.f44289a;
            if (A && !j(h2Var)) {
                SharedPreferences sharedPreferences = mp.u1(this.f44479a).h7;
                String string = sharedPreferences.getString(l(tonconnectsession.f28665id, i7) + ".transfer", null);
                if (string != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        TL_wallet.sendTransfer sendtransfer = new TL_wallet.sendTransfer();
                        sendtransfer.user_id = new TLRPC.TL_inputUserEmpty();
                        sendtransfer.data_normal = Base64.decode(jSONObject.getString("boc"), 2);
                        sendtransfer.random_id = jSONObject.getLong("randomId");
                        this.f44483f.sendRequestTyped(sendtransfer, new d3.b(1), new ne(this, x10Var, h2Var, r0Var, sendtransfer, 6));
                        return;
                    } catch (Exception e10) {
                        x10Var.a(i("restore transfer", e10));
                        return;
                    }
                }
                k2 k2Var = h2Var.f44293f;
                walletEngine2.prepareTonConnectTransfer(r0Var, k2Var, "ton-connect:" + tonconnectsession.f28665id + ":" + i7, new s(this, h2Var, r0Var, x10Var, 7));
                return;
            }
        }
        y(h2Var, r0Var, null, 0, "Wallet unavailable or request expired", x10Var);
    }

    public final void E(long j3, int i7, JSONObject jSONObject, x10 x10Var) {
        TL_wallet.tonConnectSubmitResponse tonconnectsubmitresponse = new TL_wallet.tonConnectSubmitResponse();
        tonconnectsubmitresponse.session_id = j3;
        tonconnectsubmitresponse.msg_id = i7;
        tonconnectsubmitresponse.trace_id = jSONObject.optString("traceId", null);
        tonconnectsubmitresponse.body = Base64.decode(jSONObject.optString("body"), 2);
        this.f44483f.sendRequestTyped(tonconnectsubmitresponse, new d3.b(1), new bi.z(this, x10Var, jSONObject, j3, i7));
    }

    public final boolean d(g2 g2Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectSession tonconnectsession2 = g2Var.f44250e;
        if (!tonconnectsession2.closed && !tonconnectsession2.closing && tonconnectsession2.manifest_error == null && (tonconnectmanifest = tonconnectsession2.manifest) != null && Objects.equals(tonconnectmanifest.url, tonconnectsession.manifest.url) && Objects.equals(g2Var.f44250e.manifest.name, tonconnectsession.manifest.name)) {
            TLRPC.WebDocument webDocument = g2Var.f44250e.manifest.icon;
            TLRPC.WebDocument webDocument2 = tonconnectsession.manifest.icon;
            if ((webDocument == webDocument2 || (webDocument != null && webDocument2 != null && Objects.equals(webDocument.url, webDocument2.url))) && Arrays.equals(g2Var.f44250e.nonce, tonconnectsession.nonce)) {
                u0 u0Var = this.f44480b;
                if (str.equals(u0Var.y()) && Arrays.equals(bArr, u0Var.E())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void e(int i7, long j3, x10 x10Var) {
        long j10;
        mp.u1(this.f44479a).h7.edit().remove(l(j3, i7)).remove(l(j3, j10) + ".transfer").apply();
        h2 h2Var = this.f44484g;
        if (h2Var != null && h2Var.f44289a.f28665id == j3 && h2Var.f44290b == i7) {
            h2Var.f44300n = true;
        }
        x10Var.a(null);
    }

    public final void f(h2 h2Var, boolean z10, x10 x10Var) {
        boolean z11 = h2Var.f44299m;
        TL_wallet.tonConnectSession tonconnectsession = h2Var.f44289a;
        if (z11) {
            return;
        }
        if (!h2Var.f44300n && !j(h2Var) && A(h2Var) && (z10 || h2Var.f44298l >= 0 || "disconnect".equals(h2Var.f44292e) || h2Var.f44302p)) {
            h2Var.f44299m = true;
            o oVar = new o(this, h2Var, x10Var, 3);
            String string = mp.u1(this.f44479a).h7.getString(l(tonconnectsession.f28665id, h2Var.f44290b), null);
            if (string != null) {
                try {
                    try {
                        E(tonconnectsession.f28665id, h2Var.f44290b, new JSONObject(string), oVar);
                    } catch (Exception e10) {
                        e = e10;
                        oVar = oVar;
                        oVar.a(i("restore response", e));
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } else {
                this.f44480b.F(true, false, false, new c0(this, oVar, h2Var, z10, 1));
            }
        } else {
            x10Var.a("Request expired, was processed, or the wallet changed");
        }
    }

    public final boolean j(h2 h2Var) {
        long currentTime = this.f44483f.getCurrentTime();
        if (h2Var.f44291c > currentTime) {
            k2 k2Var = h2Var.f44293f;
            if (k2Var != null) {
                long j3 = k2Var.f44435a;
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
        h2 h2Var = this.f44484g;
        if (h2Var != null && h2Var.f44289a.f28665id == j3 && h2Var.f44290b == i7 && !h2Var.f44299m) {
            h2Var.f44300n = true;
            Runnable runnable = h2Var.f44304r;
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
        m1 m1Var = new m1(tonconnectsession, 0);
        ArrayList arrayList = this.d;
        Collection.EL.removeIf(arrayList, m1Var);
        if (!tonconnectsession.closed) {
            arrayList.add(tonconnectsession);
        }
        h2 h2Var = this.f44484g;
        if (h2Var != null) {
            TL_wallet.tonConnectSession tonconnectsession2 = h2Var.f44289a;
            if (tonconnectsession2.f28665id == tonconnectsession.f28665id && (tonconnectsession.closed || tonconnectsession.closing || !Objects.equals(tonconnectsession.client_id, tonconnectsession2.client_id) || !Arrays.equals(tonconnectsession.nonce, tonconnectsession2.nonce) || (tonconnectmanifest = tonconnectsession.manifest) == null || (tonconnectmanifest2 = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectmanifest2.url) || !Objects.equals(tonconnectsession.manifest.name, tonconnectsession2.manifest.name) || ((webDocument = tonconnectsession.manifest.icon) != (webDocument2 = tonconnectsession2.manifest.icon) && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))))) {
                h2Var.f44303q = true;
                o(h2Var.f44290b, tonconnectsession.f28665id);
            }
        }
        ks.f(this.f44479a).k(ks.f25102d4, this.f44480b, tonconnectsession);
    }

    public final void u(h2 h2Var) {
        h2Var.f44304r = null;
        if (!h2Var.f44299m && this.f44484g == h2Var) {
            this.f44484g = null;
        }
    }

    public final void y(h2 h2Var, r0 r0Var, Object obj, int i7, String str, x10 x10Var) {
        Utilities.f22779e.c(new bi.c5(this, h2Var, i7, obj, str, r0Var, x10Var));
    }
}
