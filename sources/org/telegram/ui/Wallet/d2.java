package org.telegram.ui.Wallet;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.GradientDrawable;
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
import org.telegram.messenger.bi;
import org.telegram.messenger.jh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.df;
import org.telegram.ui.ft;
import org.telegram.ui.zb0;
public final class d2 {
    public final int f34787a;
    public final k0 f34788b;
    public final HashSet f34789c = new HashSet();
    public final ArrayList d = new ArrayList();
    public int f34790e;
    public final ConnectionsManager f34791f;
    public z1 f34792g;
    public boolean h;

    public d2(k0 k0Var) {
        this.f34790e = -1;
        int i10 = k0Var.f35093a;
        this.f34787a = i10;
        this.f34788b = k0Var;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        this.f34791f = connectionsManager;
        if (this.f34790e >= 0) {
            return;
        }
        this.f34790e = connectionsManager.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new Object(), new d(this, 5));
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

    public static org.telegram.ui.Wallet.i2 B(android.content.Context r26, final int r27, final org.telegram.ui.Wallet.y1 r28, final org.telegram.tgnet.TLRPC.TL_urlAuthResultRequest r29, final org.telegram.ui.ActionBar.e6 r30, final org.telegram.ui.e90 r31, final java.lang.Runnable r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.d2.B(android.content.Context, int, org.telegram.ui.Wallet.y1, org.telegram.tgnet.TLRPC$TL_urlAuthResultRequest, org.telegram.ui.ActionBar.e6, org.telegram.ui.e90, java.lang.Runnable):org.telegram.ui.Wallet.i2");
    }

    public static LinearLayout D(Context context, String str, org.telegram.ui.ActionBar.e6 e6Var) {
        LinearLayout e7 = bi.e(context, 1);
        e7.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, e6Var)));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, e6Var);
        m4Var.setText(str);
        e7.addView(m4Var, w7.x5.n(-1, -2));
        return e7;
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
                String v9 = v("bytes", jSONObject);
                if (v9.matches("[A-Za-z0-9+/]*={0,2}") && Base64.encodeToString(Base64.decode(v9, 2), 2).replace("=", "").equals(v9.replace("=", ""))) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.d2.G(org.json.JSONObject, java.lang.String, int):void");
    }

    public static void a(d2 d2Var, TL_wallet.tonConnectSession tonconnectsession, String str, j jVar) {
        if (!d2Var.f34789c.remove(Long.valueOf(tonconnectsession.f20299id))) {
            return;
        }
        if (str == null) {
            Collection.EL.removeIf(d2Var.d, new a1(tonconnectsession, 0));
            d2Var.f34788b.I();
        }
        jVar.run(str);
    }

    public static LinearLayout b(Context context, int i10, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, String str, org.telegram.ui.ActionBar.e6 e6Var) {
        int i11;
        boolean z10;
        LinearLayout.LayoutParams n10;
        int w02;
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
        linearLayout.addView(imageView, w7.x5.p(46, 46, 0.0f, 16, 0, 0, 12, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        if (charSequence2 == null && str == null) {
            i11 = 16;
        } else {
            i11 = 48;
        }
        linearLayout2.setGravity(i11);
        TextView textView = new TextView(context);
        bi.k(16.0f, 1, textView);
        int i12 = org.telegram.ui.ActionBar.i6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
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
            n10 = w7.x5.q(-1, AndroidUtilities.dp(24.0f), 16);
        } else {
            n10 = w7.x5.n(-1, -2);
        }
        n10.weight = 0.0f;
        linearLayout2.addView(textView, n10);
        if (!TextUtils.isEmpty(charSequence2)) {
            TextView f7 = org.telegram.messenger.q.f(context, 1, 14.0f);
            f7.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21199z6, e6Var));
            f7.setSingleLine(true);
            f7.setEllipsize(TextUtils.TruncateAt.END);
            f7.setText(charSequence2);
            linearLayout2.addView(f7, w7.x5.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView2 = new TextView(context);
            org.telegram.ui.ActionBar.f5 f5Var = new org.telegram.ui.ActionBar.f5(0, false, false, null);
            f5Var.f20619x = false;
            f5Var.f20618w = Integer.valueOf(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.jl, e6Var));
            textView2.setBackground(f5Var);
            textView2.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f));
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
            textView2.setMaxLines(2);
            textView2.setText(str);
            linearLayout2.addView(textView2, w7.x5.k(0.0f, 6.0f, 0.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(linearLayout2, w7.x5.o(0, -2, 1.0f, 16));
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            TextView textView3 = new TextView(context);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(21);
            textView3.setText(spannableStringBuilder);
            if (spannableStringBuilder.toString().startsWith("+")) {
                w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.uj, e6Var);
            } else {
                w02 = org.telegram.ui.ActionBar.i6.w0(i12, e6Var);
            }
            textView3.setTextColor(w02);
            linearLayout.addView(textView3, w7.x5.p(-2, -2, 0.0f, 16, 8, 0, 0, 0));
        }
        return linearLayout;
    }

    public static JSONObject f(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, byte[] bArr2, int i10) {
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
                } catch (Exception e7) {
                    jSONObject.put("errorCode", 1).put("errorMessage", e7.getMessage());
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

    public static TextView g(Context context, String str, org.telegram.ui.ActionBar.e6 e6Var) {
        TextView textView = new TextView(context);
        bi.k(14.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var));
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

    public static String j(long j3, long j10) {
        StringBuilder u10 = a1.g.u(j3, "tonconnect_reply.", ".");
        u10.append(j10);
        return u10.toString();
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

    public static void o(Context context, int i10, long j3, int i11, org.telegram.ui.ActionBar.e6 e6Var, zb0 zb0Var) {
        k0 v = k0.v(i10);
        d2 d2Var = v.f35098g;
        jh jhVar = new jh(context, i10, v, e6Var, zb0Var);
        if (!d2Var.h && d2Var.f34792g == null) {
            String string = MessagesController.getMainSettings(d2Var.f34787a).getString(j(j3, i11), null);
            if (string != null) {
                d2Var.h = true;
                ft ftVar = new ft(24, d2Var, jhVar);
                try {
                    d2Var.C(j3, i11, new JSONObject(string), ftVar);
                    return;
                } catch (Exception e7) {
                    ftVar.run(h("restore response", e7));
                    return;
                }
            }
            d2Var.h = true;
            d2Var.f34788b.h0(new org.telegram.messenger.h7(d2Var, j3, jhVar, i11, 16));
            return;
        }
        jhVar.run(null, "A TON Connect request is already open");
    }

    public static a2 p(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, String str2, String str3, String str4, TL_wallet.tonConnectChallenge tonconnectchallenge, int i10) {
        JSONObject jSONObject = new JSONObject(str2);
        if (str3.equals(jSONObject.getString("manifestUrl"))) {
            String l4 = l(str3);
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && l4.equals(l(tonconnectmanifest.url))) {
                return q(h0Var, tonconnectsession, str, bArr, jSONObject.getJSONArray("items"), l4, str4, tonconnectchallenge, i10);
            }
            throw new IllegalArgumentException("Manifest domain does not match the connection request");
        }
        throw new IllegalArgumentException("Manifest URL changed");
    }

    public static a2 q(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, String str2, String str3, TL_wallet.tonConnectChallenge tonconnectchallenge, int i10) {
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
                        return new a2(jSONObject4);
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
                        JSONObject put2 = new JSONObject().put("event", "connect").put("id", tonconnectchallenge.event_id).put("payload", new JSONObject().put("items", jSONArray3).put("device", new JSONObject().put("platform", "android").put("appName", "gramwallet").put("appVersion", BuildVars.BUILD_VERSION_STRING).put("maxProtocolVersion", 2).put("features", new JSONArray().put(new JSONObject().put("name", "SendTransaction").put("maxMessages", 255)).put(new JSONObject().put("name", "SignMessage").put("maxMessages", 255)).put(new JSONObject().put("name", "SignData").put("types", new JSONArray().put("text").put("binary").put("cell"))))));
                        if (str3 != null) {
                            put2.put("response", new JSONObject().put("error", new JSONObject().put("code", 400).put("message", "Embedded request is not supported")));
                        }
                        JSONObject jSONObject8 = WalletEngine2.tonConnectCrypto(h0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", put2));
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

    public static a2 r(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, long j3) {
        if (j3 >= 0 && tonconnectsession.client_id != null) {
            return new a2(WalletEngine2.tonConnectCrypto(h0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", new JSONObject().put("event", "disconnect").put("id", j3).put("payload", new JSONObject()))));
        }
        throw new IllegalArgumentException("Invalid disconnect session or event ID");
    }

    public static TextView t(int i10, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.e6 e6Var) {
        TextView textView = new TextView(context);
        textView.setText(charSequence);
        textView.setTextSize(1, i10);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        textView.setGravity(17);
        return textView;
    }

    public static boolean u(y1 y1Var) {
        if (y1Var != null) {
            try {
                JSONArray jSONArray = new JSONObject(y1Var.f35646a).getJSONArray("items");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if ("ton_proof".equals(jSONArray.getJSONObject(i10).optString("name"))) {
                        return true;
                    }
                }
            } catch (Exception e7) {
                h("read proof request", e7);
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
        String o9;
        if (tL_error == null) {
            str2 = str.concat(" returned an empty or unsuccessful response");
        } else {
            str2 = tL_error.text;
            if (str2 == null) {
                str2 = "RPC error " + tL_error.code;
            }
        }
        StringBuilder w10 = a1.g.w("[gram-wallet] TON Connect ", str, ": ");
        if (tL_error == null) {
            o9 = "";
        } else {
            o9 = a1.g.o(tL_error.code, " ", new StringBuilder("code="));
        }
        w10.append(o9);
        w10.append(str2);
        FileLog.e(w10.toString());
        return str2;
    }

    public final void C(long j3, int i10, JSONObject jSONObject, Utilities.Callback callback) {
        TL_wallet.tonConnectSubmitResponse tonconnectsubmitresponse = new TL_wallet.tonConnectSubmitResponse();
        tonconnectsubmitresponse.session_id = j3;
        tonconnectsubmitresponse.msg_id = i10;
        tonconnectsubmitresponse.trace_id = jSONObject.optString("traceId", null);
        tonconnectsubmitresponse.body = Base64.decode(jSONObject.optString("body"), 2);
        this.f34791f.sendRequestTyped(tonconnectsubmitresponse, new Object(), new org.telegram.ui.Components.b3(this, callback, jSONObject, j3, i10));
    }

    public final boolean c(y1 y1Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectSession tonconnectsession2 = y1Var.f35649e;
        if (!tonconnectsession2.closed && !tonconnectsession2.closing && tonconnectsession2.manifest_error == null && (tonconnectmanifest = tonconnectsession2.manifest) != null && Objects.equals(tonconnectmanifest.url, tonconnectsession.manifest.url) && Objects.equals(y1Var.f35649e.manifest.name, tonconnectsession.manifest.name)) {
            TLRPC.WebDocument webDocument = y1Var.f35649e.manifest.icon;
            TLRPC.WebDocument webDocument2 = tonconnectsession.manifest.icon;
            if ((webDocument == webDocument2 || (webDocument != null && webDocument2 != null && Objects.equals(webDocument.url, webDocument2.url))) && Arrays.equals(y1Var.f35649e.nonce, tonconnectsession.nonce)) {
                k0 k0Var = this.f34788b;
                if (str.equals(k0Var.r()) && Arrays.equals(bArr, k0Var.w())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void d(long j3, int i10, Utilities.Callback callback) {
        long j10;
        MessagesController.getMainSettings(this.f34787a).edit().remove(j(j3, i10)).remove(j(j3, j10) + ".transfer").apply();
        z1 z1Var = this.f34792g;
        if (z1Var != null && z1Var.f35693a.f20299id == j3 && z1Var.f35694b == i10) {
            z1Var.f35704n = true;
        }
        callback.run(null);
    }

    public final void e(z1 z1Var, boolean z10, Utilities.Callback callback) {
        boolean z11 = z1Var.f35703m;
        TL_wallet.tonConnectSession tonconnectsession = z1Var.f35693a;
        if (z11) {
            return;
        }
        if (!z1Var.f35704n && !i(z1Var) && y(z1Var) && (z10 || z1Var.f35702l >= 0 || "disconnect".equals(z1Var.f35696e) || z1Var.f35706p)) {
            z1Var.f35703m = true;
            o oVar = new o(this, z1Var, callback, 2);
            String string = MessagesController.getMainSettings(this.f34787a).getString(j(tonconnectsession.f20299id, z1Var.f35694b), null);
            if (string != null) {
                try {
                } catch (Exception e7) {
                    e = e7;
                }
                try {
                    C(tonconnectsession.f20299id, z1Var.f35694b, new JSONObject(string), oVar);
                    return;
                } catch (Exception e10) {
                    e = e10;
                    oVar = oVar;
                    oVar.run(h("restore response", e));
                    return;
                }
            }
            this.f34788b.x(new v(this, oVar, z1Var, z10, 1), true, false);
            return;
        }
        callback.run("Request expired, was processed, or the wallet changed");
    }

    public final boolean i(z1 z1Var) {
        long currentTime = this.f34791f.getCurrentTime();
        if (z1Var.f35695c > currentTime) {
            c2 c2Var = z1Var.f35697f;
            if (c2Var != null) {
                long j3 = c2Var.f34705a;
                if (j3 == 0 || j3 > currentTime) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void m(int i10, long j3) {
        z1 z1Var = this.f34792g;
        if (z1Var != null && z1Var.f35693a.f20299id == j3 && z1Var.f35694b == i10 && !z1Var.f35703m) {
            z1Var.f35704n = true;
            Runnable runnable = z1Var.f35708r;
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
        z1 z1Var = this.f34792g;
        if (z1Var != null) {
            TL_wallet.tonConnectSession tonconnectsession2 = z1Var.f35693a;
            if (tonconnectsession2.f20299id == tonconnectsession.f20299id && (tonconnectsession.closed || tonconnectsession.closing || !Objects.equals(tonconnectsession.client_id, tonconnectsession2.client_id) || !Arrays.equals(tonconnectsession.nonce, tonconnectsession2.nonce) || (tonconnectmanifest = tonconnectsession.manifest) == null || (tonconnectmanifest2 = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectmanifest2.url) || !Objects.equals(tonconnectsession.manifest.name, tonconnectsession2.manifest.name) || ((webDocument = tonconnectsession.manifest.icon) != (webDocument2 = tonconnectsession2.manifest.icon) && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))))) {
                z1Var.f35707q = true;
                m(z1Var.f35694b, tonconnectsession.f20299id);
            }
        }
        NotificationCenter.getInstance(this.f34787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.walletUpdate, this.f34788b, tonconnectsession);
    }

    public final void s(z1 z1Var) {
        z1Var.f35708r = null;
        if (!z1Var.f35703m && this.f34792g == z1Var) {
            this.f34792g = null;
        }
    }

    public final void w(z1 z1Var, h0 h0Var, Object obj, int i10, String str, Utilities.Callback callback) {
        Utilities.globalQueue.postRunnable(new gg.d1(this, z1Var, i10, obj, str, h0Var, callback));
    }

    public final boolean y(z1 z1Var) {
        if (!z1Var.f35707q) {
            String str = z1Var.h;
            k0 k0Var = this.f34788b;
            if (Objects.equals(str, k0Var.r()) && Arrays.equals(z1Var.f35698g, k0Var.w())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void z(z1 z1Var, h0 h0Var, Utilities.Callback callback) {
        WalletEngine2 walletEngine2 = this.f34788b.f35094b;
        if (walletEngine2 != null) {
            boolean y3 = y(z1Var);
            int i10 = z1Var.f35694b;
            TL_wallet.tonConnectSession tonconnectsession = z1Var.f35693a;
            if (y3 && !i(z1Var)) {
                SharedPreferences mainSettings = MessagesController.getMainSettings(this.f34787a);
                String string = mainSettings.getString(j(tonconnectsession.f20299id, i10) + ".transfer", null);
                if (string != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        TL_wallet.sendTransfer sendtransfer = new TL_wallet.sendTransfer();
                        sendtransfer.user_id = new TLRPC.TL_inputUserEmpty();
                        sendtransfer.data_normal = Base64.decode(jSONObject.getString("boc"), 2);
                        sendtransfer.random_id = jSONObject.getLong("randomId");
                        this.f34791f.sendRequestTyped(sendtransfer, new Object(), new df(this, callback, z1Var, h0Var, sendtransfer, 5));
                        return;
                    } catch (Exception e7) {
                        callback.run(h("restore transfer", e7));
                        return;
                    }
                }
                c2 c2Var = z1Var.f35697f;
                walletEngine2.prepareTonConnectTransfer(h0Var, c2Var, "ton-connect:" + tonconnectsession.f20299id + ":" + i10, new n(this, z1Var, h0Var, callback, 7));
                return;
            }
        }
        w(z1Var, h0Var, null, 0, "Wallet unavailable or request expired", callback);
    }
}
