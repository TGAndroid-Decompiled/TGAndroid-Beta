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
import org.telegram.ui.l60;
import org.telegram.ui.l90;
public final class e2 {
    public final int f42427a;
    public final m0 f42428b;
    public final HashSet f42429c = new HashSet();
    public final ArrayList d = new ArrayList();
    public int f42430e;
    public final ConnectionsManager f42431f;
    public a2 f42432g;
    public boolean h;

    public e2(m0 m0Var) {
        this.f42430e = -1;
        int i7 = m0Var.f42762a;
        this.f42427a = i7;
        this.f42428b = m0Var;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
        this.f42431f = connectionsManager;
        if (this.f42430e >= 0) {
            return;
        }
        this.f42430e = connectionsManager.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new d3.b(1), new d(this, 4));
    }

    public static String C(String str) {
        if (TextUtils.isEmpty(str)) {
            return id.M0(2131742975, null);
        }
        if (str.length() <= 10) {
            return str;
        }
        return str.substring(0, 4) + "…" + str.substring(str.length() - 4);
    }

    public static org.telegram.ui.Wallet.z2 D(android.content.Context r29, final int r30, final org.telegram.ui.Wallet.z1 r31, final org.telegram.tgnet.TLRPC.TL_urlAuthResultRequest r32, final org.telegram.ui.ActionBar.f6 r33, final org.telegram.ui.t60 r34, final java.lang.Runnable r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.e2.D(android.content.Context, int, org.telegram.ui.Wallet.z1, org.telegram.tgnet.TLRPC$TL_urlAuthResultRequest, org.telegram.ui.ActionBar.f6, org.telegram.ui.t60, java.lang.Runnable):org.telegram.ui.Wallet.z2");
    }

    public static LinearLayout F(Context context, String str, org.telegram.ui.ActionBar.f6 f6Var) {
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i7 = org.telegram.ui.ActionBar.k6.f27852d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        f10.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(f10, d02, N, null, f6Var);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, f6Var);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.e2.I(org.json.JSONObject, java.lang.String, int):void");
    }

    public static void a(e2 e2Var, TL_wallet.tonConnectSession tonconnectsession, String str, k kVar) {
        if (!e2Var.f42429c.remove(Long.valueOf(tonconnectsession.f27218id))) {
            return;
        }
        if (str == null) {
            Collection.EL.removeIf(e2Var.d, new a1(tonconnectsession, 0));
            e2Var.f42428b.L();
        }
        kVar.a(str);
    }

    public static SpannableStringBuilder b(long j3) {
        String o4 = m0.o(j3, true);
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

    public static LinearLayout c(Context context, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, String str, org.telegram.ui.ActionBar.f6 f6Var) {
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
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i10, f6Var);
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
            org.telegram.ui.ActionBar.r6.V(g10, org.telegram.ui.ActionBar.k6.f28262z6, f6Var);
            g10.setSingleLine(true);
            g10.setEllipsize(TextUtils.TruncateAt.END);
            g10.setText(charSequence2);
            linearLayout2.addView(g10, c8.ha.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView2 = new TextView(context);
            org.telegram.ui.ActionBar.t4 t4Var = new org.telegram.ui.ActionBar.t4(0, false, false, null);
            t4Var.f28530x = false;
            t4Var.f28529w = Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Xl, f6Var));
            textView2.setBackground(t4Var);
            textView2.setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(8.0f));
            textView2.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.r6.V(textView2, i10, f6Var);
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
                i10 = org.telegram.ui.ActionBar.k6.ik;
            }
            org.telegram.ui.ActionBar.r6.V(textView3, i10, f6Var);
            linearLayout.addView(textView3, c8.ha.q(-2, -2, 0.0f, 16, 8, 0, 0, 0));
        }
        return linearLayout;
    }

    public static JSONObject g(j0 j0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, byte[] bArr2, int i7) {
        if (tonconnectsession.client_id != null) {
            JSONObject jSONObject = new JSONObject(WalletEngine2.tonConnectCrypto(j0Var, tonconnectsession, str, bArr, new JSONObject().put("decrypt", Base64.encodeToString(bArr2, 2))).getString("plaintext"));
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

    public static TextView h(Context context, String str, org.telegram.ui.ActionBar.f6 f6Var) {
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Ci, f6Var);
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
        spannableStringBuilder.append((CharSequence) m0.o(-j3, true)).append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) id.M0(2131749517, null));
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

    public static void q(Context context, int i7, long j3, int i10, org.telegram.ui.ActionBar.f6 f6Var, l90 l90Var) {
        m0 x10 = m0.x(i7);
        e2 e2Var = x10.f42767g;
        l60 l60Var = new l60(context, i7, x10, f6Var, l90Var);
        if (!e2Var.h && e2Var.f42432g == null) {
            String string = qp.s1(e2Var.f42427a).f24774e7.getString(l(j3, i10), null);
            if (string != null) {
                e2Var.h = true;
                t tVar = new t(5, e2Var, l60Var);
                try {
                    e2Var.E(j3, i10, new JSONObject(string), tVar);
                    return;
                } catch (Exception e10) {
                    tVar.a(i("restore response", e10));
                    return;
                }
            }
            e2Var.h = true;
            e2Var.f42428b.m0(new bi.f9(e2Var, j3, l60Var, i10));
            return;
        }
        l60Var.a(null, "A TON Connect request is already open");
    }

    public static b2 r(j0 j0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, String str2, String str3, String str4, TL_wallet.tonConnectChallenge tonconnectchallenge, int i7) {
        JSONObject jSONObject = new JSONObject(str2);
        if (str3.equals(jSONObject.getString("manifestUrl"))) {
            String n10 = n(str3);
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && n10.equals(n(tonconnectmanifest.url))) {
                return s(j0Var, tonconnectsession, str, bArr, jSONObject.getJSONArray("items"), n10, str4, tonconnectchallenge, i7);
            }
            throw new IllegalArgumentException("Manifest domain does not match the connection request");
        }
        throw new IllegalArgumentException("Manifest URL changed");
    }

    public static b2 s(j0 j0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, String str2, String str3, TL_wallet.tonConnectChallenge tonconnectchallenge, int i7) {
        boolean z9;
        JSONObject jSONObject;
        String str4;
        int i10;
        String str5;
        String str6;
        j0 j0Var2 = j0Var;
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
                    JSONObject jSONObject4 = WalletEngine2.tonConnectCrypto(j0Var2, tonconnectsession, str, bArr, put);
                    if (tonconnectchallenge == null) {
                        return new b2(jSONObject4);
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
                                JSONObject jSONObject6 = WalletEngine2.tonConnectCrypto(j0Var2, tonconnectsession, str, bArr, new JSONObject().put("proofDomain", str2).put("proofPayload", string2).put("timestamp", i7));
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
                            j0Var2 = j0Var;
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
                        JSONObject jSONObject8 = WalletEngine2.tonConnectCrypto(j0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", put2));
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

    public static b2 t(j0 j0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, long j3) {
        if (j3 >= 0 && tonconnectsession.client_id != null) {
            return new b2(WalletEngine2.tonConnectCrypto(j0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", new JSONObject().put("event", "disconnect").put("id", j3).put("payload", new JSONObject()))));
        }
        throw new IllegalArgumentException("Invalid disconnect session or event ID");
    }

    public static TextView v(int i7, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.f6 f6Var) {
        TextView textView = new TextView(context);
        textView.setText(charSequence);
        textView.setTextSize(1, i7);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, f6Var);
        textView.setGravity(17);
        return textView;
    }

    public static boolean w(z1 z1Var) {
        if (z1Var != null) {
            try {
                JSONArray jSONArray = new JSONObject(z1Var.f43462a).getJSONArray("items");
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

    public final boolean A(a2 a2Var) {
        if (!a2Var.f42107q) {
            String str = a2Var.h;
            m0 m0Var = this.f42428b;
            if (Objects.equals(str, m0Var.t()) && Arrays.equals(a2Var.f42098g, m0Var.y())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void B(a2 a2Var, j0 j0Var, c20 c20Var) {
        WalletEngine2 walletEngine2 = this.f42428b.f42763b;
        if (walletEngine2 != null) {
            boolean A = A(a2Var);
            int i7 = a2Var.f42094b;
            TL_wallet.tonConnectSession tonconnectsession = a2Var.f42093a;
            if (A && !j(a2Var)) {
                SharedPreferences sharedPreferences = qp.s1(this.f42427a).f24774e7;
                String string = sharedPreferences.getString(l(tonconnectsession.f27218id, i7) + ".transfer", null);
                if (string != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        TL_wallet.sendTransfer sendtransfer = new TL_wallet.sendTransfer();
                        sendtransfer.user_id = new TLRPC.TL_inputUserEmpty();
                        sendtransfer.data_normal = Base64.decode(jSONObject.getString("boc"), 2);
                        sendtransfer.random_id = jSONObject.getLong("randomId");
                        this.f42431f.sendRequestTyped(sendtransfer, new d3.b(1), new bi.t3(this, c20Var, a2Var, j0Var, sendtransfer, 6));
                        return;
                    } catch (Exception e10) {
                        c20Var.a(i("restore transfer", e10));
                        return;
                    }
                }
                d2 d2Var = a2Var.f42097f;
                walletEngine2.prepareTonConnectTransfer(j0Var, d2Var, "ton-connect:" + tonconnectsession.f27218id + ":" + i7, new r(this, a2Var, j0Var, c20Var, 7));
                return;
            }
        }
        y(a2Var, j0Var, null, 0, "Wallet unavailable or request expired", c20Var);
    }

    public final void E(long j3, int i7, JSONObject jSONObject, c20 c20Var) {
        TL_wallet.tonConnectSubmitResponse tonconnectsubmitresponse = new TL_wallet.tonConnectSubmitResponse();
        tonconnectsubmitresponse.session_id = j3;
        tonconnectsubmitresponse.msg_id = i7;
        tonconnectsubmitresponse.trace_id = jSONObject.optString("traceId", null);
        tonconnectsubmitresponse.body = Base64.decode(jSONObject.optString("body"), 2);
        this.f42431f.sendRequestTyped(tonconnectsubmitresponse, new d3.b(1), new ai.v0(this, c20Var, jSONObject, j3, i7));
    }

    public final boolean d(z1 z1Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectSession tonconnectsession2 = z1Var.f43465e;
        if (!tonconnectsession2.closed && !tonconnectsession2.closing && tonconnectsession2.manifest_error == null && (tonconnectmanifest = tonconnectsession2.manifest) != null && Objects.equals(tonconnectmanifest.url, tonconnectsession.manifest.url) && Objects.equals(z1Var.f43465e.manifest.name, tonconnectsession.manifest.name)) {
            TLRPC.WebDocument webDocument = z1Var.f43465e.manifest.icon;
            TLRPC.WebDocument webDocument2 = tonconnectsession.manifest.icon;
            if ((webDocument == webDocument2 || (webDocument != null && webDocument2 != null && Objects.equals(webDocument.url, webDocument2.url))) && Arrays.equals(z1Var.f43465e.nonce, tonconnectsession.nonce)) {
                m0 m0Var = this.f42428b;
                if (str.equals(m0Var.t()) && Arrays.equals(bArr, m0Var.y())) {
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
        qp.s1(this.f42427a).f24774e7.edit().remove(l(j3, i7)).remove(l(j3, j10) + ".transfer").apply();
        a2 a2Var = this.f42432g;
        if (a2Var != null && a2Var.f42093a.f27218id == j3 && a2Var.f42094b == i7) {
            a2Var.f42104n = true;
        }
        c20Var.a(null);
    }

    public final void f(a2 a2Var, boolean z9, c20 c20Var) {
        boolean z10 = a2Var.f42103m;
        TL_wallet.tonConnectSession tonconnectsession = a2Var.f42093a;
        if (z10) {
            return;
        }
        if (!a2Var.f42104n && !j(a2Var) && A(a2Var) && (z9 || a2Var.f42102l >= 0 || "disconnect".equals(a2Var.f42096e) || a2Var.f42106p)) {
            a2Var.f42103m = true;
            m mVar = new m(this, a2Var, c20Var, 2);
            String string = qp.s1(this.f42427a).f24774e7.getString(l(tonconnectsession.f27218id, a2Var.f42094b), null);
            if (string != null) {
                try {
                    try {
                        E(tonconnectsession.f27218id, a2Var.f42094b, new JSONObject(string), mVar);
                    } catch (Exception e10) {
                        e = e10;
                        mVar = mVar;
                        mVar.a(i("restore response", e));
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } else {
                this.f42428b.z(new x(this, mVar, a2Var, z9, 1), true, false);
            }
        } else {
            c20Var.a("Request expired, was processed, or the wallet changed");
        }
    }

    public final boolean j(a2 a2Var) {
        long currentTime = this.f42431f.getCurrentTime();
        if (a2Var.f42095c > currentTime) {
            d2 d2Var = a2Var.f42097f;
            if (d2Var != null) {
                long j3 = d2Var.f42384a;
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
        a2 a2Var = this.f42432g;
        if (a2Var != null && a2Var.f42093a.f27218id == j3 && a2Var.f42094b == i7 && !a2Var.f42103m) {
            a2Var.f42104n = true;
            Runnable runnable = a2Var.f42108r;
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
        a2 a2Var = this.f42432g;
        if (a2Var != null) {
            TL_wallet.tonConnectSession tonconnectsession2 = a2Var.f42093a;
            if (tonconnectsession2.f27218id == tonconnectsession.f27218id && (tonconnectsession.closed || tonconnectsession.closing || !Objects.equals(tonconnectsession.client_id, tonconnectsession2.client_id) || !Arrays.equals(tonconnectsession.nonce, tonconnectsession2.nonce) || (tonconnectmanifest = tonconnectsession.manifest) == null || (tonconnectmanifest2 = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectmanifest2.url) || !Objects.equals(tonconnectsession.manifest.name, tonconnectsession2.manifest.name) || ((webDocument = tonconnectsession.manifest.icon) != (webDocument2 = tonconnectsession2.manifest.icon) && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))))) {
                a2Var.f42107q = true;
                o(a2Var.f42094b, tonconnectsession.f27218id);
            }
        }
        qs.f(this.f42427a).k(qs.f24971a4, this.f42428b, tonconnectsession);
    }

    public final void u(a2 a2Var) {
        a2Var.f42108r = null;
        if (!a2Var.f42103m && this.f42432g == a2Var) {
            this.f42432g = null;
        }
    }

    public final void y(a2 a2Var, j0 j0Var, Object obj, int i7, String str, c20 c20Var) {
        Utilities.f21336e.c(new jg.c1(this, a2Var, i7, obj, str, j0Var, c20Var, 15));
    }
}
