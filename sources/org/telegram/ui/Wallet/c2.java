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
import b8.mf;
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
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.wp;
import org.telegram.ui.e51;
import org.telegram.ui.f60;
import org.telegram.ui.i90;
public final class c2 {
    public final int f42377a;
    public final k0 f42378b;
    public final HashSet f42379c = new HashSet();
    public final ArrayList d = new ArrayList();
    public int f42380e;
    public final ConnectionsManager f42381f;
    public y1 f42382g;
    public boolean h;

    public c2(k0 k0Var) {
        this.f42380e = -1;
        int i3 = k0Var.f42718a;
        this.f42377a = i3;
        this.f42378b = k0Var;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
        this.f42381f = connectionsManager;
        if (this.f42380e >= 0) {
            return;
        }
        this.f42380e = connectionsManager.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new c3.b(1), new d(this, 4));
    }

    public static String C(String str) {
        if (TextUtils.isEmpty(str)) {
            return bd.M0(2131742982, null);
        }
        if (str.length() <= 10) {
            return str;
        }
        return str.substring(0, 4) + "…" + str.substring(str.length() - 4);
    }

    public static org.telegram.ui.Wallet.y2 D(android.content.Context r30, final int r31, final org.telegram.ui.Wallet.x1 r32, final org.telegram.tgnet.TLRPC.TL_urlAuthResultRequest r33, final org.telegram.ui.ActionBar.e6 r34, final org.telegram.ui.n60 r35, final java.lang.Runnable r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.c2.D(android.content.Context, int, org.telegram.ui.Wallet.x1, org.telegram.tgnet.TLRPC$TL_urlAuthResultRequest, org.telegram.ui.ActionBar.e6, org.telegram.ui.n60, java.lang.Runnable):org.telegram.ui.Wallet.y2");
    }

    public static LinearLayout F(Context context, String str, org.telegram.ui.ActionBar.e6 e6Var) {
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i3 = org.telegram.ui.ActionBar.k6.f27878d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        f10.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(f10, d02, N, null, e6Var);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, e6Var);
        n4Var.setText(str);
        f10.addView(n4Var, mf.o(-1, -2));
        return f10;
    }

    public static void G(String str, JSONObject jSONObject) {
        H(str, jSONObject);
        String x10 = x("type", jSONObject);
        char c2 = 65535;
        switch (x10.hashCode()) {
            case -1388966911:
                if (x10.equals("binary")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3049826:
                if (x10.equals("cell")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3556653:
                if (x10.equals("text")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.c2.I(org.json.JSONObject, java.lang.String, int):void");
    }

    public static void a(c2 c2Var, TL_wallet.tonConnectSession tonconnectsession, String str, k kVar) {
        if (!c2Var.f42379c.remove(Long.valueOf(tonconnectsession.f27264id))) {
            return;
        }
        if (str == null) {
            Collection.EL.removeIf(c2Var.d, new y0(tonconnectsession, 0));
            c2Var.f42378b.L();
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
        wp wpVar = new wp(2131232816, 2);
        wpVar.d = false;
        wpVar.c(org.telegram.messenger.g0.L(16.0f));
        spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static LinearLayout c(Context context, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, String str, org.telegram.ui.ActionBar.e6 e6Var) {
        int i3;
        boolean z10;
        LinearLayout.LayoutParams o10;
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
        linearLayout.addView(imageView, mf.q(46, 46, 0.0f, 16, 0, 0, 12, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        if (charSequence2 == null && str == null) {
            i3 = 16;
        } else {
            i3 = 48;
        }
        linearLayout2.setGravity(i3);
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i10, e6Var);
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
            o10 = mf.r(-1, org.telegram.messenger.g0.L(24.0f), 16);
        } else {
            o10 = mf.o(-1, -2);
        }
        o10.weight = 0.0f;
        linearLayout2.addView(textView, o10);
        if (!TextUtils.isEmpty(charSequence2)) {
            TextView g7 = org.telegram.messenger.k5.g(context, 1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(g7, org.telegram.ui.ActionBar.k6.f28290z6, e6Var);
            g7.setSingleLine(true);
            g7.setEllipsize(TextUtils.TruncateAt.END);
            g7.setText(charSequence2);
            linearLayout2.addView(g7, mf.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView2 = new TextView(context);
            org.telegram.ui.ActionBar.t4 t4Var = new org.telegram.ui.ActionBar.t4(0, false, false, null);
            t4Var.f28653x = false;
            t4Var.f28652w = Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Xl, e6Var));
            textView2.setBackground(t4Var);
            textView2.setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(8.0f));
            textView2.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.r6.V(textView2, i10, e6Var);
            textView2.setMaxLines(2);
            textView2.setText(str);
            linearLayout2.addView(textView2, mf.k(0.0f, 6.0f, 0.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(linearLayout2, mf.p(0, -2, 1.0f, 16));
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            TextView textView3 = new TextView(context);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(21);
            textView3.setText(spannableStringBuilder);
            if (spannableStringBuilder.toString().startsWith("+")) {
                i10 = org.telegram.ui.ActionBar.k6.ik;
            }
            org.telegram.ui.ActionBar.r6.V(textView3, i10, e6Var);
            linearLayout.addView(textView3, mf.q(-2, -2, 0.0f, 16, 8, 0, 0, 0));
        }
        return linearLayout;
    }

    public static JSONObject g(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, byte[] bArr2, int i3) {
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
                            I(jSONObject3, str, i3);
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

    public static TextView h(Context context, String str, org.telegram.ui.ActionBar.e6 e6Var) {
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Ci, e6Var);
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

    public static SpannableStringBuilder k(long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        spannableString.setSpan(new wp(2131232815, 0), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) k0.o(-j10, true)).append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) bd.M0(2131749524, null));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-9577217), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static String l(long j10, long j11) {
        StringBuilder t10 = a1.g.t(j10, "tonconnect_reply.", ".");
        t10.append(j11);
        return t10.toString();
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

    public static void q(Context context, int i3, long j10, int i10, org.telegram.ui.ActionBar.e6 e6Var, i90 i90Var) {
        k0 x10 = k0.x(i3);
        c2 c2Var = x10.f42723g;
        f60 f60Var = new f60(context, i3, x10, e6Var, i90Var);
        if (!c2Var.h && c2Var.f42382g == null) {
            String string = hp.s1(c2Var.f42377a).f22999e7.getString(l(j10, i10), null);
            if (string != null) {
                c2Var.h = true;
                e51 e51Var = new e51(8, c2Var, f60Var);
                try {
                    c2Var.E(j10, i10, new JSONObject(string), e51Var);
                    return;
                } catch (Exception e10) {
                    e51Var.a(i("restore response", e10));
                    return;
                }
            }
            c2Var.h = true;
            c2Var.f42378b.m0(new ci.f8(c2Var, j10, f60Var, i10));
            return;
        }
        f60Var.a(null, "A TON Connect request is already open");
    }

    public static z1 r(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, String str2, String str3, String str4, TL_wallet.tonConnectChallenge tonconnectchallenge, int i3) {
        JSONObject jSONObject = new JSONObject(str2);
        if (str3.equals(jSONObject.getString("manifestUrl"))) {
            String n4 = n(str3);
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && n4.equals(n(tonconnectmanifest.url))) {
                return s(h0Var, tonconnectsession, str, bArr, jSONObject.getJSONArray("items"), n4, str4, tonconnectchallenge, i3);
            }
            throw new IllegalArgumentException("Manifest domain does not match the connection request");
        }
        throw new IllegalArgumentException("Manifest URL changed");
    }

    public static z1 s(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, String str2, String str3, TL_wallet.tonConnectChallenge tonconnectchallenge, int i3) {
        boolean z10;
        JSONObject jSONObject;
        String str4;
        int i10;
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
                    JSONObject jSONObject4 = WalletEngine2.tonConnectCrypto(h0Var2, tonconnectsession, str, bArr, put);
                    if (tonconnectchallenge == null) {
                        return new z1(jSONObject4);
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
                                JSONObject jSONObject6 = WalletEngine2.tonConnectCrypto(h0Var2, tonconnectsession, str, bArr, new JSONObject().put("proofDomain", str2).put("proofPayload", string2).put("timestamp", i3));
                                str5 = str8;
                                TL_wallet.walletOwnershipProof walletownershipproof2 = new TL_wallet.walletOwnershipProof();
                                walletownershipproof2.timestamp = i3;
                                str6 = str9;
                                jSONObject = jSONObject4;
                                walletownershipproof2.signature = Base64.decode(jSONObject6.getString("signature"), 2);
                                jSONArray3.put(new JSONObject().put("name", string).put("proof", new JSONObject().put("timestamp", i3).put("domain", new JSONObject().put("lengthBytes", str2.getBytes(StandardCharsets.UTF_8).length).put("value", str2)).put("payload", string2).put("signature", jSONObject6.getString("signature"))));
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
                            h0Var2 = h0Var;
                            jSONArray2 = jSONArray;
                            str7 = str4;
                            str8 = str5;
                            str9 = str6;
                            jSONObject4 = jSONObject;
                        }
                        JSONObject jSONObject7 = jSONObject4;
                        JSONObject put2 = new JSONObject().put("event", "connect").put("id", tonconnectchallenge.event_id).put("payload", new JSONObject().put("items", jSONArray3).put("device", new JSONObject().put("platform", "android").put("appName", "gramwallet").put("appVersion", org.telegram.messenger.r2.f25042c).put("maxProtocolVersion", 2).put("features", new JSONArray().put(new JSONObject().put("name", "SendTransaction").put("maxMessages", 255)).put(new JSONObject().put("name", "SignMessage").put("maxMessages", 255)).put(new JSONObject().put("name", "SignData").put("types", new JSONArray().put("text").put("binary").put("cell"))))));
                        if (str3 != null) {
                            put2.put("response", new JSONObject().put("error", new JSONObject().put("code", 400).put("message", "Embedded request is not supported")));
                        }
                        JSONObject jSONObject8 = WalletEngine2.tonConnectCrypto(h0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", put2));
                        jSONObject8.put("challengeAnswer", jSONObject7.getString("challengeAnswer"));
                        z1 z1Var = new z1(jSONObject8);
                        z1Var.d = walletownershipproof;
                        return z1Var;
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

    public static z1 t(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, long j10) {
        if (j10 >= 0 && tonconnectsession.client_id != null) {
            return new z1(WalletEngine2.tonConnectCrypto(h0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", new JSONObject().put("event", "disconnect").put("id", j10).put("payload", new JSONObject()))));
        }
        throw new IllegalArgumentException("Invalid disconnect session or event ID");
    }

    public static TextView v(int i3, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.e6 e6Var) {
        TextView textView = new TextView(context);
        textView.setText(charSequence);
        textView.setTextSize(1, i3);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, e6Var);
        textView.setGravity(17);
        return textView;
    }

    public static boolean w(x1 x1Var) {
        if (x1Var != null) {
            try {
                JSONArray jSONArray = new JSONObject(x1Var.f43384a).getJSONArray("items");
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    if ("ton_proof".equals(jSONArray.getJSONObject(i3).optString("name"))) {
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
        String o10;
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
            o10 = "";
        } else {
            o10 = a1.g.o(tL_error.code, " ", new StringBuilder("code="));
        }
        u10.append(o10);
        u10.append(str2);
        org.telegram.messenger.a8.d(u10.toString());
        return str2;
    }

    public final boolean A(y1 y1Var) {
        if (!y1Var.f43470q) {
            String str = y1Var.h;
            k0 k0Var = this.f42378b;
            if (Objects.equals(str, k0Var.t()) && Arrays.equals(y1Var.f43461g, k0Var.y())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void B(y1 y1Var, h0 h0Var, u10 u10Var) {
        WalletEngine2 walletEngine2 = this.f42378b.f42719b;
        if (walletEngine2 != null) {
            boolean A = A(y1Var);
            int i3 = y1Var.f43457b;
            TL_wallet.tonConnectSession tonconnectsession = y1Var.f43456a;
            if (A && !j(y1Var)) {
                SharedPreferences sharedPreferences = hp.s1(this.f42377a).f22999e7;
                String string = sharedPreferences.getString(l(tonconnectsession.f27264id, i3) + ".transfer", null);
                if (string != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        TL_wallet.sendTransfer sendtransfer = new TL_wallet.sendTransfer();
                        sendtransfer.user_id = new TLRPC.TL_inputUserEmpty();
                        sendtransfer.data_normal = Base64.decode(jSONObject.getString("boc"), 2);
                        sendtransfer.random_id = jSONObject.getLong("randomId");
                        this.f42381f.sendRequestTyped(sendtransfer, new c3.b(1), new ci.g3(this, u10Var, y1Var, h0Var, sendtransfer, 6));
                        return;
                    } catch (Exception e10) {
                        u10Var.a(i("restore transfer", e10));
                        return;
                    }
                }
                b2 b2Var = y1Var.f43460f;
                walletEngine2.prepareTonConnectTransfer(h0Var, b2Var, "ton-connect:" + tonconnectsession.f27264id + ":" + i3, new q(this, y1Var, h0Var, u10Var, 7));
                return;
            }
        }
        y(y1Var, h0Var, null, 0, "Wallet unavailable or request expired", u10Var);
    }

    public final void E(long j10, int i3, JSONObject jSONObject, u10 u10Var) {
        TL_wallet.tonConnectSubmitResponse tonconnectsubmitresponse = new TL_wallet.tonConnectSubmitResponse();
        tonconnectsubmitresponse.session_id = j10;
        tonconnectsubmitresponse.msg_id = i3;
        tonconnectsubmitresponse.trace_id = jSONObject.optString("traceId", null);
        tonconnectsubmitresponse.body = Base64.decode(jSONObject.optString("body"), 2);
        this.f42381f.sendRequestTyped(tonconnectsubmitresponse, new c3.b(1), new ai.f0(this, u10Var, jSONObject, j10, i3));
    }

    public final boolean d(x1 x1Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectSession tonconnectsession2 = x1Var.f43387e;
        if (!tonconnectsession2.closed && !tonconnectsession2.closing && tonconnectsession2.manifest_error == null && (tonconnectmanifest = tonconnectsession2.manifest) != null && Objects.equals(tonconnectmanifest.url, tonconnectsession.manifest.url) && Objects.equals(x1Var.f43387e.manifest.name, tonconnectsession.manifest.name)) {
            TLRPC.WebDocument webDocument = x1Var.f43387e.manifest.icon;
            TLRPC.WebDocument webDocument2 = tonconnectsession.manifest.icon;
            if ((webDocument == webDocument2 || (webDocument != null && webDocument2 != null && Objects.equals(webDocument.url, webDocument2.url))) && Arrays.equals(x1Var.f43387e.nonce, tonconnectsession.nonce)) {
                k0 k0Var = this.f42378b;
                if (str.equals(k0Var.t()) && Arrays.equals(bArr, k0Var.y())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void e(int i3, long j10, u10 u10Var) {
        long j11;
        hp.s1(this.f42377a).f22999e7.edit().remove(l(j10, i3)).remove(l(j10, j11) + ".transfer").apply();
        y1 y1Var = this.f42382g;
        if (y1Var != null && y1Var.f43456a.f27264id == j10 && y1Var.f43457b == i3) {
            y1Var.f43467n = true;
        }
        u10Var.a(null);
    }

    public final void f(y1 y1Var, boolean z10, u10 u10Var) {
        boolean z11 = y1Var.f43466m;
        TL_wallet.tonConnectSession tonconnectsession = y1Var.f43456a;
        if (z11) {
            return;
        }
        if (!y1Var.f43467n && !j(y1Var) && A(y1Var) && (z10 || y1Var.f43465l >= 0 || "disconnect".equals(y1Var.f43459e) || y1Var.f43469p)) {
            y1Var.f43466m = true;
            m mVar = new m(this, y1Var, u10Var, 2);
            String string = hp.s1(this.f42377a).f22999e7.getString(l(tonconnectsession.f27264id, y1Var.f43457b), null);
            if (string != null) {
                try {
                    try {
                        E(tonconnectsession.f27264id, y1Var.f43457b, new JSONObject(string), mVar);
                    } catch (Exception e10) {
                        e = e10;
                        mVar = mVar;
                        mVar.a(i("restore response", e));
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } else {
                this.f42378b.z(new v(this, mVar, y1Var, z10, 1), true, false);
            }
        } else {
            u10Var.a("Request expired, was processed, or the wallet changed");
        }
    }

    public final boolean j(y1 y1Var) {
        long currentTime = this.f42381f.getCurrentTime();
        if (y1Var.f43458c > currentTime) {
            b2 b2Var = y1Var.f43460f;
            if (b2Var != null) {
                long j10 = b2Var.f42222a;
                if (j10 == 0 || j10 > currentTime) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void o(int i3, long j10) {
        y1 y1Var = this.f42382g;
        if (y1Var != null && y1Var.f43456a.f27264id == j10 && y1Var.f43457b == i3 && !y1Var.f43466m) {
            y1Var.f43467n = true;
            Runnable runnable = y1Var.f43471r;
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
        y0 y0Var = new y0(tonconnectsession, 1);
        ArrayList arrayList = this.d;
        Collection.EL.removeIf(arrayList, y0Var);
        if (!tonconnectsession.closed) {
            arrayList.add(tonconnectsession);
        }
        y1 y1Var = this.f42382g;
        if (y1Var != null) {
            TL_wallet.tonConnectSession tonconnectsession2 = y1Var.f43456a;
            if (tonconnectsession2.f27264id == tonconnectsession.f27264id && (tonconnectsession.closed || tonconnectsession.closing || !Objects.equals(tonconnectsession.client_id, tonconnectsession2.client_id) || !Arrays.equals(tonconnectsession.nonce, tonconnectsession2.nonce) || (tonconnectmanifest = tonconnectsession.manifest) == null || (tonconnectmanifest2 = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectmanifest2.url) || !Objects.equals(tonconnectsession.manifest.name, tonconnectsession2.manifest.name) || ((webDocument = tonconnectsession.manifest.icon) != (webDocument2 = tonconnectsession2.manifest.icon) && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))))) {
                y1Var.f43470q = true;
                o(y1Var.f43457b, tonconnectsession.f27264id);
            }
        }
        hs.f(this.f42377a).k(hs.f23200a4, this.f42378b, tonconnectsession);
    }

    public final void u(y1 y1Var) {
        y1Var.f43471r = null;
        if (!y1Var.f43466m && this.f42382g == y1Var) {
            this.f42382g = null;
        }
    }

    public final void y(y1 y1Var, h0 h0Var, Object obj, int i3, String str, u10 u10Var) {
        Utilities.f21387e.c(new ai.d3(this, y1Var, i3, obj, str, h0Var, u10Var));
    }
}
