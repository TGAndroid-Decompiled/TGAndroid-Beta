package org.telegram.ui.Wallet;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.kh;
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.hb0;
public final class e2 {
    public final int f36506a;
    public final l0 f36507b;
    public final HashSet f36508c = new HashSet();
    public final ArrayList d = new ArrayList();
    public int e;
    public final ConnectionsManager f36509f;
    public a2 f36510g;
    public boolean h;

    public e2(l0 l0Var) {
        this.e = -1;
        int i10 = l0Var.f36807a;
        this.f36506a = i10;
        this.f36507b = l0Var;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        this.f36509f = connectionsManager;
        if (this.e >= 0) {
            return;
        }
        this.e = connectionsManager.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new Object(), new d(this, 4));
    }

    public static String A(String str) {
        if (TextUtils.isEmpty(str)) {
            return LocaleController.getString(R.string.WalletUnknownAddress);
        }
        if (str.length() <= 10) {
            return str;
        }
        return str.substring(0, 4) + "…" + str.substring(str.length() - 4);
    }

    public static org.telegram.ui.Wallet.j2 B(android.content.Context r27, final int r28, final org.telegram.ui.Wallet.z1 r29, final org.telegram.tgnet.TLRPC.TL_urlAuthResultRequest r30, final org.telegram.ui.ActionBar.u6 r31, final org.telegram.ui.q80 r32, final java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.e2.B(android.content.Context, int, org.telegram.ui.Wallet.z1, org.telegram.tgnet.TLRPC$TL_urlAuthResultRequest, org.telegram.ui.ActionBar.u6, org.telegram.ui.q80, java.lang.Runnable):org.telegram.ui.Wallet.j2");
    }

    public static LinearLayout D(Context context, String str, org.telegram.ui.ActionBar.u6 u6Var) {
        LinearLayout d = vh.d(context, 1);
        int dp = AndroidUtilities.dp(16.0f);
        int i10 = org.telegram.ui.ActionBar.y6.f23356d6;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        d.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(d, c02, N, null, u6Var);
        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context, u6Var);
        q4Var.setText(str);
        d.addView(q4Var, gb1.r(-1, -2));
        return d;
    }

    public static void E(String str, JSONObject jSONObject) {
        F(str, jSONObject);
        String v = v("type", jSONObject);
        char c10 = 65535;
        switch (v.hashCode()) {
            case -1388966911:
                if (v.equals("binary")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3049826:
                if (v.equals("cell")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3556653:
                if (v.equals("text")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                String v10 = v("bytes", jSONObject);
                if (v10.matches("[A-Za-z0-9+/]*={0,2}") && Base64.encodeToString(Base64.decode(v10, 2), 2).replace("=", "").equals(v10.replace("=", ""))) {
                    return;
                }
                throw new IllegalArgumentException("Invalid base64 data");
            case 1:
                v("schema", jSONObject);
                if (!WalletEngine2.isValidCellBoc(v("cell", jSONObject))) {
                    throw new IllegalArgumentException("Invalid data cell");
                }
                return;
            case 2:
                v("text", jSONObject);
                return;
            default:
                throw new IllegalArgumentException("Unknown signing data type");
        }
    }

    public static void F(String str, JSONObject jSONObject) {
        if (jSONObject.has("network") && !"-239".equals(v("network", jSONObject))) {
            throw new IllegalArgumentException("Wrong network");
        }
        if (jSONObject.has("from") && !WalletEngine2.sameTonConnectAddress(v("from", jSONObject), str)) {
            throw new IllegalArgumentException("Wrong signer");
        }
    }

    public static void G(org.json.JSONObject r10, java.lang.String r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.e2.G(org.json.JSONObject, java.lang.String, int):void");
    }

    public static void a(e2 e2Var, TL_wallet.tonConnectSession tonconnectsession, String str, k kVar) {
        if (!e2Var.f36508c.remove(Long.valueOf(tonconnectsession.f22290id))) {
            return;
        }
        if (str == null) {
            Collection.EL.removeIf(e2Var.d, new a1(tonconnectsession, 0));
            e2Var.f36507b.J();
        }
        kVar.run(str);
    }

    public static LinearLayout b(Context context, int i10, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, String str, org.telegram.ui.ActionBar.u6 u6Var) {
        int i11;
        boolean z10;
        LinearLayout.LayoutParams r6;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
        ImageView imageView = new ImageView(context);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{-14899731, -15431455});
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        imageView.setImageResource(i10);
        imageView.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        linearLayout.addView(imageView, gb1.t(46, 46, 0.0f, 16, 0, 0, 12, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        if (charSequence2 == null && str == null) {
            i11 = 16;
        } else {
            i11 = 48;
        }
        linearLayout2.setGravity(i11);
        TextView textView = new TextView(context);
        vh.j(16.0f, 1, textView);
        int i12 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(textView, i12, u6Var);
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
            r6 = gb1.u(-1, AndroidUtilities.dp(24.0f), 16);
        } else {
            r6 = gb1.r(-1, -2);
        }
        r6.weight = 0.0f;
        linearLayout2.addView(textView, r6);
        if (!TextUtils.isEmpty(charSequence2)) {
            TextView g7 = org.telegram.messenger.t.g(context, 1, 14.0f);
            org.telegram.ui.ActionBar.f7.V(g7, org.telegram.ui.ActionBar.y6.f23767z6, u6Var);
            g7.setSingleLine(true);
            g7.setEllipsize(TextUtils.TruncateAt.END);
            g7.setText(charSequence2);
            linearLayout2.addView(g7, gb1.o(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView2 = new TextView(context);
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(0, false, false, null);
            l5Var.f22851x = false;
            l5Var.f22850w = Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.jl, u6Var));
            textView2.setBackground(l5Var);
            textView2.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f));
            textView2.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.f7.V(textView2, i12, u6Var);
            textView2.setMaxLines(2);
            textView2.setText(str);
            linearLayout2.addView(textView2, gb1.o(0.0f, 6.0f, 0.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(linearLayout2, gb1.s(0, -2, 1.0f, 16));
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            TextView textView3 = new TextView(context);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(21);
            textView3.setText(spannableStringBuilder);
            if (spannableStringBuilder.toString().startsWith("+")) {
                i12 = org.telegram.ui.ActionBar.y6.uj;
            }
            org.telegram.ui.ActionBar.f7.V(textView3, i12, u6Var);
            linearLayout.addView(textView3, gb1.t(-2, -2, 0.0f, 16, 8, 0, 0, 0));
        }
        return linearLayout;
    }

    public static JSONObject f(i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, byte[] bArr2, int i10) {
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
                                    E(str, jSONObject2);
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
                            G(jSONObject3, str, i10);
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

    public static TextView g(Context context, String str, org.telegram.ui.ActionBar.u6 u6Var) {
        TextView textView = new TextView(context);
        vh.j(14.0f, 1, textView);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Oh, u6Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        textView.setText(spannableStringBuilder);
        return textView;
    }

    public static String h(String str, Exception exc) {
        FileLog.e("[gram-wallet] TON Connect ".concat(str), exc);
        String message = exc.getMessage();
        if (message != null && !message.isEmpty()) {
            return message;
        }
        return exc.getClass().getSimpleName();
    }

    public static String j(long j10, long j11) {
        StringBuilder t10 = a1.g.t(j10, "tonconnect_reply.", ".");
        t10.append(j11);
        return t10.toString();
    }

    public static void k(String str, String str2) {
        if (str2 != null) {
            FileLog.e("[gram-wallet] TON Connect " + str + ": " + str2);
        }
    }

    public static String l(String str) {
        URI create = URI.create(str);
        if ("https".equalsIgnoreCase(create.getScheme()) && create.getHost() != null) {
            return create.getHost().toLowerCase(Locale.ROOT);
        }
        throw new IllegalArgumentException("Manifest URL must use HTTPS and include a host");
    }

    public static void o(Context context, int i10, long j10, int i11, org.telegram.ui.ActionBar.u6 u6Var, hb0 hb0Var) {
        l0 w10 = l0.w(i10);
        e2 e2Var = w10.f36811g;
        kh khVar = new kh(context, i10, w10, u6Var, hb0Var);
        if (!e2Var.h && e2Var.f36510g == null) {
            String string = MessagesController.getMainSettings(e2Var.f36506a).getString(j(j10, i11), null);
            if (string != null) {
                e2Var.h = true;
                s sVar = new s(3, e2Var, khVar);
                try {
                    e2Var.C(j10, i11, new JSONObject(string), sVar);
                    return;
                } catch (Exception e) {
                    sVar.run(h("restore response", e));
                    return;
                }
            }
            e2Var.h = true;
            e2Var.f36507b.j0(new bi.da(e2Var, j10, khVar, i11, 18));
            return;
        }
        khVar.run(null, "A TON Connect request is already open");
    }

    public static b2 p(i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, String str2, String str3, String str4, TL_wallet.tonConnectChallenge tonconnectchallenge, int i10) {
        JSONObject jSONObject = new JSONObject(str2);
        if (str3.equals(jSONObject.getString("manifestUrl"))) {
            String l4 = l(str3);
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && l4.equals(l(tonconnectmanifest.url))) {
                return q(i0Var, tonconnectsession, str, bArr, jSONObject.getJSONArray("items"), l4, str4, tonconnectchallenge, i10);
            }
            throw new IllegalArgumentException("Manifest domain does not match the connection request");
        }
        throw new IllegalArgumentException("Manifest URL changed");
    }

    public static b2 q(i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, String str2, String str3, TL_wallet.tonConnectChallenge tonconnectchallenge, int i10) {
        boolean z10;
        JSONObject jSONObject;
        String str4;
        int i11;
        String str5;
        String str6;
        i0 i0Var2 = i0Var;
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
                    JSONObject jSONObject4 = WalletEngine2.tonConnectCrypto(i0Var2, tonconnectsession, str, bArr, put);
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
                                JSONObject jSONObject6 = WalletEngine2.tonConnectCrypto(i0Var2, tonconnectsession, str, bArr, new JSONObject().put("proofDomain", str2).put("proofPayload", string2).put("timestamp", i10));
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
                            i0Var2 = i0Var;
                            jSONArray2 = jSONArray;
                            str7 = str4;
                            str8 = str5;
                            str9 = str6;
                            jSONObject4 = jSONObject;
                        }
                        JSONObject jSONObject7 = jSONObject4;
                        JSONObject put2 = new JSONObject().put("event", "connect").put("id", tonconnectchallenge.event_id).put("payload", new JSONObject().put("items", jSONArray3).put("device", new JSONObject().put("platform", "android").put("appName", "gramwallet").put("appVersion", BuildVars.BUILD_VERSION_STRING).put("maxProtocolVersion", 2).put("features", new JSONArray().put(new JSONObject().put("name", "SendTransaction").put("maxMessages", 255)).put(new JSONObject().put("name", "SignMessage").put("maxMessages", 255)).put(new JSONObject().put("name", "SignData").put("types", new JSONArray().put("text").put("binary").put("cell"))))));
                        if (str3 != null) {
                            put2.put("response", new JSONObject().put("error", new JSONObject().put("code", 400).put("message", "Embedded request is not supported")));
                        }
                        JSONObject jSONObject8 = WalletEngine2.tonConnectCrypto(i0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", put2));
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

    public static b2 r(i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, long j10) {
        if (j10 >= 0 && tonconnectsession.client_id != null) {
            return new b2(WalletEngine2.tonConnectCrypto(i0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", new JSONObject().put("event", "disconnect").put("id", j10).put("payload", new JSONObject()))));
        }
        throw new IllegalArgumentException("Invalid disconnect session or event ID");
    }

    public static TextView t(int i10, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.u6 u6Var) {
        TextView textView = new TextView(context);
        textView.setText(charSequence);
        textView.setTextSize(1, i10);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, u6Var);
        textView.setGravity(17);
        return textView;
    }

    public static boolean u(z1 z1Var) {
        if (z1Var != null) {
            try {
                JSONArray jSONArray = new JSONObject(z1Var.f37550a).getJSONArray("items");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if ("ton_proof".equals(jSONArray.getJSONObject(i10).optString("name"))) {
                        return true;
                    }
                }
            } catch (Exception e) {
                h("read proof request", e);
            }
        }
        return false;
    }

    public static String v(String str, JSONObject jSONObject) {
        Object obj = jSONObject.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new IllegalArgumentException(str.concat(" must be a string"));
    }

    public static String x(TLRPC.TL_error tL_error, String str) {
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
        StringBuilder v = a1.g.v("[gram-wallet] TON Connect ", str, ": ");
        if (tL_error == null) {
            n10 = "";
        } else {
            n10 = a1.g.n(tL_error.code, " ", new StringBuilder("code="));
        }
        v.append(n10);
        v.append(str2);
        FileLog.e(v.toString());
        return str2;
    }

    public final void C(long j10, int i10, JSONObject jSONObject, Utilities.Callback callback) {
        TL_wallet.tonConnectSubmitResponse tonconnectsubmitresponse = new TL_wallet.tonConnectSubmitResponse();
        tonconnectsubmitresponse.session_id = j10;
        tonconnectsubmitresponse.msg_id = i10;
        tonconnectsubmitresponse.trace_id = jSONObject.optString("traceId", null);
        tonconnectsubmitresponse.body = Base64.decode(jSONObject.optString("body"), 2);
        this.f36509f.sendRequestTyped(tonconnectsubmitresponse, new Object(), new ai.c1(this, callback, jSONObject, j10, i10));
    }

    public final boolean c(z1 z1Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectSession tonconnectsession2 = z1Var.e;
        if (!tonconnectsession2.closed && !tonconnectsession2.closing && tonconnectsession2.manifest_error == null && (tonconnectmanifest = tonconnectsession2.manifest) != null && Objects.equals(tonconnectmanifest.url, tonconnectsession.manifest.url) && Objects.equals(z1Var.e.manifest.name, tonconnectsession.manifest.name)) {
            TLRPC.WebDocument webDocument = z1Var.e.manifest.icon;
            TLRPC.WebDocument webDocument2 = tonconnectsession.manifest.icon;
            if ((webDocument == webDocument2 || (webDocument != null && webDocument2 != null && Objects.equals(webDocument.url, webDocument2.url))) && Arrays.equals(z1Var.e.nonce, tonconnectsession.nonce)) {
                l0 l0Var = this.f36507b;
                if (str.equals(l0Var.s()) && Arrays.equals(bArr, l0Var.x())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void d(long j10, int i10, Utilities.Callback callback) {
        long j11;
        MessagesController.getMainSettings(this.f36506a).edit().remove(j(j10, i10)).remove(j(j10, j11) + ".transfer").apply();
        a2 a2Var = this.f36510g;
        if (a2Var != null && a2Var.f36337a.f22290id == j10 && a2Var.f36338b == i10) {
            a2Var.f36347n = true;
        }
        callback.run(null);
    }

    public final void e(a2 a2Var, boolean z10, Utilities.Callback callback) {
        boolean z11 = a2Var.f36346m;
        TL_wallet.tonConnectSession tonconnectsession = a2Var.f36337a;
        if (z11) {
            return;
        }
        if (!a2Var.f36347n && !i(a2Var) && y(a2Var) && (z10 || a2Var.f36345l >= 0 || "disconnect".equals(a2Var.e) || a2Var.f36349p)) {
            a2Var.f36346m = true;
            o oVar = new o(this, a2Var, callback, 2);
            String string = MessagesController.getMainSettings(this.f36506a).getString(j(tonconnectsession.f22290id, a2Var.f36338b), null);
            if (string != null) {
                try {
                } catch (Exception e) {
                    e = e;
                }
                try {
                    C(tonconnectsession.f22290id, a2Var.f36338b, new JSONObject(string), oVar);
                    return;
                } catch (Exception e10) {
                    e = e10;
                    oVar = oVar;
                    oVar.run(h("restore response", e));
                    return;
                }
            }
            this.f36507b.y(new w(this, oVar, a2Var, z10, 1), true, false);
            return;
        }
        callback.run("Request expired, was processed, or the wallet changed");
    }

    public final boolean i(a2 a2Var) {
        long currentTime = this.f36509f.getCurrentTime();
        if (a2Var.f36339c > currentTime) {
            d2 d2Var = a2Var.f36340f;
            if (d2Var != null) {
                long j10 = d2Var.f36455a;
                if (j10 == 0 || j10 > currentTime) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void m(int i10, long j10) {
        a2 a2Var = this.f36510g;
        if (a2Var != null && a2Var.f36337a.f22290id == j10 && a2Var.f36338b == i10 && !a2Var.f36346m) {
            a2Var.f36347n = true;
            Runnable runnable = a2Var.f36351r;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void n(TL_wallet.tonConnectSession tonconnectsession) {
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
        a2 a2Var = this.f36510g;
        if (a2Var != null) {
            TL_wallet.tonConnectSession tonconnectsession2 = a2Var.f36337a;
            if (tonconnectsession2.f22290id == tonconnectsession.f22290id && (tonconnectsession.closed || tonconnectsession.closing || !Objects.equals(tonconnectsession.client_id, tonconnectsession2.client_id) || !Arrays.equals(tonconnectsession.nonce, tonconnectsession2.nonce) || (tonconnectmanifest = tonconnectsession.manifest) == null || (tonconnectmanifest2 = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectmanifest2.url) || !Objects.equals(tonconnectsession.manifest.name, tonconnectsession2.manifest.name) || ((webDocument = tonconnectsession.manifest.icon) != (webDocument2 = tonconnectsession2.manifest.icon) && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))))) {
                a2Var.f36350q = true;
                m(a2Var.f36338b, tonconnectsession.f22290id);
            }
        }
        NotificationCenter.getInstance(this.f36506a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.walletUpdate, this.f36507b, tonconnectsession);
    }

    public final void s(a2 a2Var) {
        a2Var.f36351r = null;
        if (!a2Var.f36346m && this.f36510g == a2Var) {
            this.f36510g = null;
        }
    }

    public final void w(a2 a2Var, i0 i0Var, Object obj, int i10, String str, Utilities.Callback callback) {
        Utilities.globalQueue.postRunnable(new ig.d1(this, a2Var, i10, obj, str, i0Var, callback));
    }

    public final boolean y(a2 a2Var) {
        if (!a2Var.f36350q) {
            String str = a2Var.h;
            l0 l0Var = this.f36507b;
            if (Objects.equals(str, l0Var.s()) && Arrays.equals(a2Var.f36341g, l0Var.x())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void z(a2 a2Var, i0 i0Var, Utilities.Callback callback) {
        WalletEngine2 walletEngine2 = this.f36507b.f36808b;
        if (walletEngine2 != null) {
            boolean y3 = y(a2Var);
            int i10 = a2Var.f36338b;
            TL_wallet.tonConnectSession tonconnectsession = a2Var.f36337a;
            if (y3 && !i(a2Var)) {
                SharedPreferences mainSettings = MessagesController.getMainSettings(this.f36506a);
                String string = mainSettings.getString(j(tonconnectsession.f22290id, i10) + ".transfer", null);
                if (string != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        TL_wallet.sendTransfer sendtransfer = new TL_wallet.sendTransfer();
                        sendtransfer.user_id = new TLRPC.TL_inputUserEmpty();
                        sendtransfer.data_normal = Base64.decode(jSONObject.getString("boc"), 2);
                        sendtransfer.random_id = jSONObject.getLong("randomId");
                        this.f36509f.sendRequestTyped(sendtransfer, new Object(), new bi.t3(this, callback, a2Var, i0Var, sendtransfer, 6));
                        return;
                    } catch (Exception e) {
                        callback.run(h("restore transfer", e));
                        return;
                    }
                }
                d2 d2Var = a2Var.f36340f;
                walletEngine2.prepareTonConnectTransfer(i0Var, d2Var, "ton-connect:" + tonconnectsession.f22290id + ":" + i10, new p(this, a2Var, i0Var, callback, 7));
                return;
            }
        }
        w(a2Var, i0Var, null, 0, "Wallet unavailable or request expired", callback);
    }
}
