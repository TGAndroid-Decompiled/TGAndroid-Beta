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
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.wp;
import org.telegram.ui.n60;
import org.telegram.ui.n90;
public final class d2 {
    public final int f42345a;
    public final l0 f42346b;
    public final HashSet f42347c = new HashSet();
    public final ArrayList d = new ArrayList();
    public int f42348e;
    public final ConnectionsManager f42349f;
    public z1 f42350g;
    public boolean h;

    public d2(l0 l0Var) {
        this.f42348e = -1;
        int i7 = l0Var.f42680a;
        this.f42345a = i7;
        this.f42346b = l0Var;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
        this.f42349f = connectionsManager;
        if (this.f42348e >= 0) {
            return;
        }
        this.f42348e = connectionsManager.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new d3.b(1), new d(this, 4));
    }

    public static String C(String str) {
        if (TextUtils.isEmpty(str)) {
            return id.M0(2131742972, null);
        }
        if (str.length() <= 10) {
            return str;
        }
        return str.substring(0, 4) + "…" + str.substring(str.length() - 4);
    }

    public static org.telegram.ui.Wallet.y2 D(android.content.Context r29, final int r30, final org.telegram.ui.Wallet.y1 r31, final org.telegram.tgnet.TLRPC.TL_urlAuthResultRequest r32, final org.telegram.ui.ActionBar.g6 r33, final org.telegram.ui.v60 r34, final java.lang.Runnable r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.d2.D(android.content.Context, int, org.telegram.ui.Wallet.y1, org.telegram.tgnet.TLRPC$TL_urlAuthResultRequest, org.telegram.ui.ActionBar.g6, org.telegram.ui.v60, java.lang.Runnable):org.telegram.ui.Wallet.y2");
    }

    public static LinearLayout F(Context context, String str, org.telegram.ui.ActionBar.g6 g6Var) {
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i7 = org.telegram.ui.ActionBar.l6.f27865d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(L, org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i7);
        f10.setBackground(d02);
        org.telegram.ui.ActionBar.s6.j(f10, d02, M, null, g6Var);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, g6Var);
        n4Var.setText(str);
        f10.addView(n4Var, c8.ha.o(-1, -2));
        return f10;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.d2.I(org.json.JSONObject, java.lang.String, int):void");
    }

    public static void a(d2 d2Var, TL_wallet.tonConnectSession tonconnectsession, String str, k kVar) {
        if (!d2Var.f42347c.remove(Long.valueOf(tonconnectsession.f27218id))) {
            return;
        }
        if (str == null) {
            Collection.EL.removeIf(d2Var.d, new z0(tonconnectsession, 0));
            d2Var.f42346b.L();
        }
        kVar.a(str);
    }

    public static SpannableStringBuilder b(long j3) {
        String o4 = l0.o(j3, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(o4);
        int indexOf = o4.indexOf(46);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6875f), indexOf, spannableStringBuilder.length(), 33);
        }
        if (spannableStringBuilder.length() == 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != 'x') {
            spannableStringBuilder.append((CharSequence) " x");
        }
        wp wpVar = new wp(2131232818, 2);
        wpVar.d = false;
        wpVar.c(org.telegram.messenger.g0.L(16.0f));
        spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static LinearLayout c(Context context, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, String str, org.telegram.ui.ActionBar.g6 g6Var) {
        int i7;
        boolean z9;
        LinearLayout.LayoutParams o4;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f));
        ImageView imageView = new ImageView(context);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{-14899731, -15431455});
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        imageView.setImageResource(2131231956);
        imageView.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        linearLayout.addView(imageView, c8.ha.q(46, 46, 0.0f, 16, 0, 0, 12, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        if (charSequence2 == null && str == null) {
            i7 = 16;
        } else {
            i7 = 48;
        }
        linearLayout2.setGravity(i7);
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.s6.U(textView, i10, g6Var);
        if (charSequence2 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        textView.setSingleLine(z9);
        if (charSequence2 == null) {
            textView.setGravity(16);
        }
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setText(charSequence);
        if (charSequence2 == null) {
            o4 = c8.ha.r(-1, org.telegram.messenger.g0.L(24.0f), 16);
        } else {
            o4 = c8.ha.o(-1, -2);
        }
        o4.weight = 0.0f;
        linearLayout2.addView(textView, o4);
        if (!TextUtils.isEmpty(charSequence2)) {
            TextView g10 = org.telegram.messenger.k5.g(context, 1, 14.0f);
            org.telegram.ui.ActionBar.s6.U(g10, org.telegram.ui.ActionBar.l6.f28275z6, g6Var);
            g10.setSingleLine(true);
            g10.setEllipsize(TextUtils.TruncateAt.END);
            g10.setText(charSequence2);
            linearLayout2.addView(g10, c8.ha.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView2 = new TextView(context);
            org.telegram.ui.ActionBar.t4 t4Var = new org.telegram.ui.ActionBar.t4(0, false, false, null);
            t4Var.f28535x = false;
            t4Var.f28534w = Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Xl, g6Var));
            textView2.setBackground(t4Var);
            textView2.setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(8.0f));
            textView2.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.s6.U(textView2, i10, g6Var);
            textView2.setMaxLines(2);
            textView2.setText(str);
            linearLayout2.addView(textView2, c8.ha.k(0.0f, 6.0f, 0.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(linearLayout2, c8.ha.p(0, -2, 1.0f, 16));
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            TextView textView3 = new TextView(context);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(21);
            textView3.setText(spannableStringBuilder);
            if (spannableStringBuilder.toString().startsWith("+")) {
                i10 = org.telegram.ui.ActionBar.l6.ik;
            }
            org.telegram.ui.ActionBar.s6.U(textView3, i10, g6Var);
            linearLayout.addView(textView3, c8.ha.q(-2, -2, 0.0f, 16, 8, 0, 0, 0));
        }
        return linearLayout;
    }

    public static JSONObject g(i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, byte[] bArr2, int i7) {
        if (tonconnectsession.client_id != null) {
            JSONObject jSONObject = new JSONObject(WalletEngine2.tonConnectCrypto(i0Var, tonconnectsession, str, bArr, new JSONObject().put("decrypt", Base64.encodeToString(bArr2, 2))).getString("plaintext"));
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

    public static TextView h(Context context, String str, org.telegram.ui.ActionBar.g6 g6Var) {
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 14.0f);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.Ci, g6Var);
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
        spannableString.setSpan(new wp(2131232817, 0), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) l0.o(-j3, true)).append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) id.M0(2131749516, null));
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

    public static void q(Context context, int i7, long j3, int i10, org.telegram.ui.ActionBar.g6 g6Var, n90 n90Var) {
        l0 x10 = l0.x(i7);
        d2 d2Var = x10.f42685g;
        n60 n60Var = new n60(context, i7, x10, g6Var, n90Var);
        if (!d2Var.h && d2Var.f42350g == null) {
            String string = qp.s1(d2Var.f42345a).f24774e7.getString(l(j3, i10), null);
            if (string != null) {
                d2Var.h = true;
                s sVar = new s(5, d2Var, n60Var);
                try {
                    d2Var.E(j3, i10, new JSONObject(string), sVar);
                    return;
                } catch (Exception e10) {
                    sVar.a(i("restore response", e10));
                    return;
                }
            }
            d2Var.h = true;
            d2Var.f42346b.m0(new bi.f9(d2Var, j3, n60Var, i10));
            return;
        }
        n60Var.a(null, "A TON Connect request is already open");
    }

    public static a2 r(i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, String str2, String str3, String str4, TL_wallet.tonConnectChallenge tonconnectchallenge, int i7) {
        JSONObject jSONObject = new JSONObject(str2);
        if (str3.equals(jSONObject.getString("manifestUrl"))) {
            String n10 = n(str3);
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && n10.equals(n(tonconnectmanifest.url))) {
                return s(i0Var, tonconnectsession, str, bArr, jSONObject.getJSONArray("items"), n10, str4, tonconnectchallenge, i7);
            }
            throw new IllegalArgumentException("Manifest domain does not match the connection request");
        }
        throw new IllegalArgumentException("Manifest URL changed");
    }

    public static a2 s(i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, String str2, String str3, TL_wallet.tonConnectChallenge tonconnectchallenge, int i7) {
        boolean z9;
        JSONObject jSONObject;
        String str4;
        int i10;
        String str5;
        String str6;
        i0 i0Var2 = i0Var;
        JSONArray jSONArray2 = jSONArray;
        if (jSONArray2.length() != 0) {
            JSONObject jSONObject2 = new JSONObject();
            if (tonconnectchallenge != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            String str7 = "account";
            JSONObject put = jSONObject2.put("account", z9);
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
                    JSONObject jSONObject4 = WalletEngine2.tonConnectCrypto(i0Var2, tonconnectsession, str, bArr, put);
                    if (tonconnectchallenge == null) {
                        return new a2(jSONObject4);
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
                                JSONObject jSONObject6 = WalletEngine2.tonConnectCrypto(i0Var2, tonconnectsession, str, bArr, new JSONObject().put("proofDomain", str2).put("proofPayload", string2).put("timestamp", i7));
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
                            i0Var2 = i0Var;
                            jSONArray2 = jSONArray;
                            str7 = str4;
                            str8 = str5;
                            str9 = str6;
                            jSONObject4 = jSONObject;
                        }
                        JSONObject jSONObject7 = jSONObject4;
                        JSONObject put2 = new JSONObject().put("event", "connect").put("id", tonconnectchallenge.event_id).put("payload", new JSONObject().put("items", jSONArray3).put("device", new JSONObject().put("platform", "android").put("appName", "gramwallet").put("appVersion", org.telegram.messenger.r2.f25214c).put("maxProtocolVersion", 2).put("features", new JSONArray().put(new JSONObject().put("name", "SendTransaction").put("maxMessages", 255)).put(new JSONObject().put("name", "SignMessage").put("maxMessages", 255)).put(new JSONObject().put("name", "SignData").put("types", new JSONArray().put("text").put("binary").put("cell"))))));
                        if (str3 != null) {
                            put2.put("response", new JSONObject().put("error", new JSONObject().put("code", 400).put("message", "Embedded request is not supported")));
                        }
                        JSONObject jSONObject8 = WalletEngine2.tonConnectCrypto(i0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", put2));
                        jSONObject8.put("challengeAnswer", jSONObject7.getString("challengeAnswer"));
                        a2 a2Var = new a2(jSONObject8);
                        a2Var.d = walletownershipproof;
                        return a2Var;
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

    public static a2 t(i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, long j3) {
        if (j3 >= 0 && tonconnectsession.client_id != null) {
            return new a2(WalletEngine2.tonConnectCrypto(i0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", new JSONObject().put("event", "disconnect").put("id", j3).put("payload", new JSONObject()))));
        }
        throw new IllegalArgumentException("Invalid disconnect session or event ID");
    }

    public static TextView v(int i7, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.g6 g6Var) {
        TextView textView = new TextView(context);
        textView.setText(charSequence);
        textView.setTextSize(1, i7);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.G6, g6Var);
        textView.setGravity(17);
        return textView;
    }

    public static boolean w(y1 y1Var) {
        if (y1Var != null) {
            try {
                JSONArray jSONArray = new JSONObject(y1Var.f43380a).getJSONArray("items");
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

    public final boolean A(z1 z1Var) {
        if (!z1Var.f43419q) {
            String str = z1Var.h;
            l0 l0Var = this.f42346b;
            if (Objects.equals(str, l0Var.t()) && Arrays.equals(z1Var.f43410g, l0Var.y())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void B(z1 z1Var, i0 i0Var, c20 c20Var) {
        WalletEngine2 walletEngine2 = this.f42346b.f42681b;
        if (walletEngine2 != null) {
            boolean A = A(z1Var);
            int i7 = z1Var.f43406b;
            TL_wallet.tonConnectSession tonconnectsession = z1Var.f43405a;
            if (A && !j(z1Var)) {
                SharedPreferences sharedPreferences = qp.s1(this.f42345a).f24774e7;
                String string = sharedPreferences.getString(l(tonconnectsession.f27218id, i7) + ".transfer", null);
                if (string != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        TL_wallet.sendTransfer sendtransfer = new TL_wallet.sendTransfer();
                        sendtransfer.user_id = new TLRPC.TL_inputUserEmpty();
                        sendtransfer.data_normal = Base64.decode(jSONObject.getString("boc"), 2);
                        sendtransfer.random_id = jSONObject.getLong("randomId");
                        this.f42349f.sendRequestTyped(sendtransfer, new d3.b(1), new bi.t3(this, c20Var, z1Var, i0Var, sendtransfer, 6));
                        return;
                    } catch (Exception e10) {
                        c20Var.a(i("restore transfer", e10));
                        return;
                    }
                }
                c2 c2Var = z1Var.f43409f;
                walletEngine2.prepareTonConnectTransfer(i0Var, c2Var, "ton-connect:" + tonconnectsession.f27218id + ":" + i7, new q(this, z1Var, i0Var, c20Var, 7));
                return;
            }
        }
        y(z1Var, i0Var, null, 0, "Wallet unavailable or request expired", c20Var);
    }

    public final void E(long j3, int i7, JSONObject jSONObject, c20 c20Var) {
        TL_wallet.tonConnectSubmitResponse tonconnectsubmitresponse = new TL_wallet.tonConnectSubmitResponse();
        tonconnectsubmitresponse.session_id = j3;
        tonconnectsubmitresponse.msg_id = i7;
        tonconnectsubmitresponse.trace_id = jSONObject.optString("traceId", null);
        tonconnectsubmitresponse.body = Base64.decode(jSONObject.optString("body"), 2);
        this.f42349f.sendRequestTyped(tonconnectsubmitresponse, new d3.b(1), new ai.v0(this, c20Var, jSONObject, j3, i7));
    }

    public final boolean d(y1 y1Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectSession tonconnectsession2 = y1Var.f43383e;
        if (!tonconnectsession2.closed && !tonconnectsession2.closing && tonconnectsession2.manifest_error == null && (tonconnectmanifest = tonconnectsession2.manifest) != null && Objects.equals(tonconnectmanifest.url, tonconnectsession.manifest.url) && Objects.equals(y1Var.f43383e.manifest.name, tonconnectsession.manifest.name)) {
            TLRPC.WebDocument webDocument = y1Var.f43383e.manifest.icon;
            TLRPC.WebDocument webDocument2 = tonconnectsession.manifest.icon;
            if ((webDocument == webDocument2 || (webDocument != null && webDocument2 != null && Objects.equals(webDocument.url, webDocument2.url))) && Arrays.equals(y1Var.f43383e.nonce, tonconnectsession.nonce)) {
                l0 l0Var = this.f42346b;
                if (str.equals(l0Var.t()) && Arrays.equals(bArr, l0Var.y())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void e(int i7, long j3, c20 c20Var) {
        long j10;
        qp.s1(this.f42345a).f24774e7.edit().remove(l(j3, i7)).remove(l(j3, j10) + ".transfer").apply();
        z1 z1Var = this.f42350g;
        if (z1Var != null && z1Var.f43405a.f27218id == j3 && z1Var.f43406b == i7) {
            z1Var.f43416n = true;
        }
        c20Var.a(null);
    }

    public final void f(z1 z1Var, boolean z9, c20 c20Var) {
        boolean z10 = z1Var.f43415m;
        TL_wallet.tonConnectSession tonconnectsession = z1Var.f43405a;
        if (z10) {
            return;
        }
        if (!z1Var.f43416n && !j(z1Var) && A(z1Var) && (z9 || z1Var.f43414l >= 0 || "disconnect".equals(z1Var.f43408e) || z1Var.f43418p)) {
            z1Var.f43415m = true;
            m mVar = new m(this, z1Var, c20Var, 2);
            String string = qp.s1(this.f42345a).f24774e7.getString(l(tonconnectsession.f27218id, z1Var.f43406b), null);
            if (string != null) {
                try {
                    try {
                        E(tonconnectsession.f27218id, z1Var.f43406b, new JSONObject(string), mVar);
                    } catch (Exception e10) {
                        e = e10;
                        mVar = mVar;
                        mVar.a(i("restore response", e));
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } else {
                this.f42346b.z(new w(this, mVar, z1Var, z9, 1), true, false);
            }
        } else {
            c20Var.a("Request expired, was processed, or the wallet changed");
        }
    }

    public final boolean j(z1 z1Var) {
        long currentTime = this.f42349f.getCurrentTime();
        if (z1Var.f43407c > currentTime) {
            c2 c2Var = z1Var.f43409f;
            if (c2Var != null) {
                long j3 = c2Var.f42303a;
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
        z1 z1Var = this.f42350g;
        if (z1Var != null && z1Var.f43405a.f27218id == j3 && z1Var.f43406b == i7 && !z1Var.f43415m) {
            z1Var.f43416n = true;
            Runnable runnable = z1Var.f43420r;
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
        z0 z0Var = new z0(tonconnectsession, 1);
        ArrayList arrayList = this.d;
        Collection.EL.removeIf(arrayList, z0Var);
        if (!tonconnectsession.closed) {
            arrayList.add(tonconnectsession);
        }
        z1 z1Var = this.f42350g;
        if (z1Var != null) {
            TL_wallet.tonConnectSession tonconnectsession2 = z1Var.f43405a;
            if (tonconnectsession2.f27218id == tonconnectsession.f27218id && (tonconnectsession.closed || tonconnectsession.closing || !Objects.equals(tonconnectsession.client_id, tonconnectsession2.client_id) || !Arrays.equals(tonconnectsession.nonce, tonconnectsession2.nonce) || (tonconnectmanifest = tonconnectsession.manifest) == null || (tonconnectmanifest2 = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectmanifest2.url) || !Objects.equals(tonconnectsession.manifest.name, tonconnectsession2.manifest.name) || ((webDocument = tonconnectsession.manifest.icon) != (webDocument2 = tonconnectsession2.manifest.icon) && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))))) {
                z1Var.f43419q = true;
                o(z1Var.f43406b, tonconnectsession.f27218id);
            }
        }
        qs.f(this.f42345a).k(qs.f24971a4, this.f42346b, tonconnectsession);
    }

    public final void u(z1 z1Var) {
        z1Var.f43420r = null;
        if (!z1Var.f43415m && this.f42350g == z1Var) {
            this.f42350g = null;
        }
    }

    public final void y(z1 z1Var, i0 i0Var, Object obj, int i7, String str, c20 c20Var) {
        Utilities.f21336e.c(new jg.c1(this, z1Var, i7, obj, str, i0Var, c20Var, 15));
    }
}
