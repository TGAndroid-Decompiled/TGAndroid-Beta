package org.telegram.ui;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
public final class ec0 {
    public final LaunchActivity f37221a;
    public final int f37222b;
    public final of.e f37223c;
    public final boolean d;
    public org.telegram.ui.ActionBar.b2 f37224e;
    public boolean f37225f;
    public boolean f37226g;
    public int h = -1;
    public ei.l3 f37227i;
    public boolean f37228j;

    public ec0(LaunchActivity launchActivity, int i10, of.e eVar, boolean z10) {
        this.f37221a = launchActivity;
        this.f37222b = i10;
        this.f37223c = eVar;
        this.d = z10;
    }

    public static org.telegram.ui.Components.ad d() {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return org.telegram.ui.Components.ad.X();
        }
        return org.telegram.ui.Components.ad.a0(U);
    }

    public static boolean p(java.lang.String r2) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ec0.p(java.lang.String):boolean");
    }

    public static boolean q(java.lang.String r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ec0.q(java.lang.String):boolean");
    }

    public static String r(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int i10 = 960;
        if (bytes.length <= 960) {
            return str;
        }
        while ((bytes[i10] & 192) == 128) {
            i10--;
        }
        return new String(bytes, 0, i10, StandardCharsets.UTF_8);
    }

    public static Uri s(Uri uri) {
        String schemeSpecificPart;
        if (uri != null && uri.isOpaque()) {
            String scheme = uri.getScheme();
            if (scheme == null || uri.getAuthority() != null || (schemeSpecificPart = uri.getSchemeSpecificPart()) == null) {
                return uri;
            }
            return Uri.parse(scheme + "://" + schemeSpecificPart);
        }
        return uri;
    }

    public final boolean a() {
        if (!this.f37228j) {
            LaunchActivity launchActivity = this.f37221a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed() && LaunchActivity.E1 && !SharedConfig.appLocked && !SharedConfig.isWaitingForPasscodeEnter && UserConfig.selectedAccount == this.f37222b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void b() {
        this.f37228j = true;
        ei.l3 l3Var = this.f37227i;
        if (l3Var != null) {
            AndroidUtilities.cancelRunOnUIThread(l3Var);
        }
        if (this.h >= 0) {
            ConnectionsManager.getInstance(this.f37222b).cancelRequest(this.h, true);
            this.h = -1;
        }
    }

    public final void c() {
        if (this.f37226g) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = this.f37224e;
        if (b2Var != null) {
            b2Var.dismiss();
        }
        of.e eVar = this.f37223c;
        if (eVar != null) {
            eVar.b();
        }
        this.f37226g = true;
    }

    public final org.telegram.ui.ActionBar.d5 e() {
        return this.f37221a.O();
    }

    public final UserConfig f() {
        return UserConfig.getInstance(this.f37222b);
    }

    public final boolean g(Uri uri) {
        String str;
        String str2;
        String path;
        Uri s10;
        List<String> pathSegments;
        String str3;
        Long l4;
        String str4;
        boolean z10;
        Uri uri2 = uri;
        if (uri2 != null) {
            FileLog.d("link manager handle " + uri2);
            String scheme = uri2.getScheme();
            boolean equalsIgnoreCase = "tonsite".equalsIgnoreCase(scheme);
            LaunchActivity launchActivity = this.f37221a;
            if (equalsIgnoreCase) {
                of.f.p(launchActivity, uri2, true, true);
                return true;
            } else if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                boolean equalsIgnoreCase2 = "tg".equalsIgnoreCase(scheme);
                int i10 = this.f37222b;
                if (equalsIgnoreCase2) {
                    Uri s11 = s(Uri.parse(uri2.toString().replaceFirst("(?i)^tg:(//)?sendgrams&", "tg://sendgrams?")));
                    List<String> pathSegments2 = s11.getPathSegments();
                    if (pathSegments2 != null) {
                        ArrayList arrayList = new ArrayList(pathSegments2);
                        String authority = s11.getAuthority();
                        if (!TextUtils.isEmpty(authority)) {
                            arrayList.add(0, authority);
                        }
                        if (!arrayList.isEmpty()) {
                            String str5 = (String) arrayList.get(0);
                            if (arrayList.size() > 1) {
                                str4 = (String) arrayList.get(1);
                            } else {
                                str4 = null;
                            }
                            if ("sendgrams".equalsIgnoreCase(str5)) {
                                return l(s11);
                            }
                            if ("newbot".equalsIgnoreCase(str5)) {
                                j(s11.getQueryParameter("manager"), s11.getQueryParameter("username"), s11.getQueryParameter("name"));
                                return true;
                            } else if ("resolve".equalsIgnoreCase(str5)) {
                                List<String> pathSegments3 = s11.getPathSegments();
                                if (pathSegments3 != null) {
                                    ArrayList arrayList2 = new ArrayList(pathSegments3);
                                    String authority2 = s11.getAuthority();
                                    if (!TextUtils.isEmpty(authority2)) {
                                        arrayList2.add(0, authority2);
                                    }
                                    if (!arrayList2.isEmpty()) {
                                        arrayList2.remove(0);
                                        String queryParameter = s11.getQueryParameter("domain");
                                        String queryParameter2 = s11.getQueryParameter("startapp");
                                        if ("sendgrams".equalsIgnoreCase(queryParameter)) {
                                            return l(s11);
                                        }
                                        if ("oauth".equalsIgnoreCase(queryParameter) && !TextUtils.isEmpty(queryParameter2)) {
                                            return k(s11, queryParameter2);
                                        }
                                    }
                                }
                            } else if ("invoice".equalsIgnoreCase(str5)) {
                                return i(s11.getQueryParameter("slug"));
                            } else {
                                if ("oauth".equalsIgnoreCase(str5)) {
                                    return k(s11, s11.getQueryParameter("token"));
                                }
                                if ("settings".equalsIgnoreCase(str5)) {
                                    return m(arrayList.subList(1, arrayList.size()));
                                }
                                if ("chats".equalsIgnoreCase(str5)) {
                                    "search".equalsIgnoreCase(str4);
                                    "edit".equalsIgnoreCase(str4);
                                    "emoji-status".equalsIgnoreCase(str4);
                                }
                                if ("new".equalsIgnoreCase(str5)) {
                                    if ("group".equalsIgnoreCase(str4)) {
                                        u(new c70(new Bundle()), false);
                                        return true;
                                    } else if ("contact".equalsIgnoreCase(str4)) {
                                        new dk0(launchActivity, LaunchActivity.U()).show();
                                        return true;
                                    } else if ("channel".equalsIgnoreCase(str4)) {
                                        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                                        if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                                            u(new md(org.telegram.ui.Cells.c1.f(0, "step")), false);
                                            return true;
                                        }
                                        u(new h(0), false);
                                        globalMainSettings.edit().putBoolean("channel_intro", true).commit();
                                        return true;
                                    } else {
                                        u(new ContactsActivity(a1.g.i("destroyAfterSelect", true)), false);
                                        return true;
                                    }
                                } else if ("post".equalsIgnoreCase(str5)) {
                                    ?? r02 = "video".equalsIgnoreCase(str4);
                                    if ("live".equalsIgnoreCase(str4)) {
                                        r02 = -1;
                                    }
                                    ci.lc D = ci.lc.D(launchActivity, i10);
                                    if (D.O1 != r02) {
                                        D.O1 = r02;
                                        ?? r42 = D.Q0;
                                        if (r42 != 0) {
                                            r42.a(r02);
                                        }
                                        if (r02 == 1) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        D.h0(z10, true);
                                        ci.y yVar = D.I0;
                                        if (yVar != null) {
                                            yVar.a(false, true);
                                        }
                                        D.l0(false);
                                    }
                                    D.Q(null);
                                    return true;
                                } else if ("contacts".equalsIgnoreCase(str5)) {
                                    if ("new".equalsIgnoreCase(str4)) {
                                        new dk0(launchActivity, LaunchActivity.U()).show();
                                        return true;
                                    }
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("needPhonebook", true);
                                    bundle.putBoolean("needFinishFragment", true);
                                    u(new ContactsActivity(bundle), false);
                                    "search".equalsIgnoreCase(str4);
                                    "sort".equalsIgnoreCase(str4);
                                    if ("invite".equalsIgnoreCase(str4)) {
                                        x("phonebookRow");
                                        return true;
                                    }
                                    return true;
                                } else if ("addstyle".equalsIgnoreCase(str5)) {
                                    return h(s11.getQueryParameter("slug"));
                                }
                            }
                        }
                    }
                } else if ("ton".equalsIgnoreCase(scheme)) {
                    if (MessagesController.getInstance(i10).config.walletAvailable.get() && (pathSegments = (s10 = s(uri2)).getPathSegments()) != null) {
                        ArrayList arrayList3 = new ArrayList(pathSegments);
                        String authority3 = s10.getAuthority();
                        if (!TextUtils.isEmpty(authority3)) {
                            arrayList3.add(0, authority3);
                        }
                        if (!arrayList3.isEmpty()) {
                            String str6 = (String) arrayList3.get(0);
                            if (arrayList3.size() > 1) {
                                str3 = (String) arrayList3.get(1);
                            } else {
                                str3 = null;
                            }
                            if (!"transfer".equalsIgnoreCase(str6)) {
                                return false;
                            }
                            if (arrayList3.size() == 2 && WalletEngine2.isValidRecipientAddress(str3)) {
                                try {
                                    l4 = Long.valueOf(Long.parseLong(s10.getQueryParameter("amount")));
                                } catch (Throwable unused) {
                                    l4 = null;
                                }
                                String queryParameter3 = s10.getQueryParameter("text");
                                if (TextUtils.isEmpty(queryParameter3)) {
                                    queryParameter3 = s10.getQueryParameter("comment");
                                }
                                String r10 = r(queryParameter3);
                                boolean booleanQueryParameter = s10.getBooleanQueryParameter("encrypted", false);
                                try {
                                    org.telegram.ui.Wallet.j8 j8Var = new org.telegram.ui.Wallet.j8(str3);
                                    if (l4 != null && l4.longValue() > 0) {
                                        j8Var.f35108r = l4.longValue();
                                    }
                                    if (!TextUtils.isEmpty(r10)) {
                                        j8Var.f35092d0 = r10;
                                        j8Var.f35094e0 = booleanQueryParameter;
                                    }
                                    j8Var.f35091c0 = true;
                                    u(j8Var, false);
                                    return true;
                                } catch (Throwable th2) {
                                    FileLog.e(th2);
                                    return false;
                                }
                            }
                            return true;
                        }
                    }
                } else if ("tc".equalsIgnoreCase(scheme)) {
                    return n(uri);
                }
            } else {
                String host = uri2.getHost();
                if (host != null) {
                    Matcher matcher = LaunchActivity.B1.matcher(host.toLowerCase());
                    boolean find = matcher.find();
                    if ("telegram.me".equalsIgnoreCase(host) || "t.me".equalsIgnoreCase(host) || "telegram.dog".equalsIgnoreCase(host) || find) {
                        if (find) {
                            StringBuilder sb2 = new StringBuilder("https://t.me/");
                            sb2.append(matcher.group(1));
                            String str7 = "";
                            if (TextUtils.isEmpty(uri2.getPath())) {
                                path = "";
                            } else {
                                path = uri2.getPath();
                            }
                            sb2.append(path);
                            if (!TextUtils.isEmpty(uri2.getQuery())) {
                                str7 = "?" + uri2.getQuery();
                            }
                            sb2.append(str7);
                            uri2 = Uri.parse(sb2.toString());
                        }
                        String path2 = uri2.getPath();
                        if (path2 != null && path2.length() > 1) {
                            String substring = path2.substring(1);
                            List<String> pathSegments4 = uri2.getPathSegments();
                            if (pathSegments4 != null && !pathSegments4.isEmpty()) {
                                String str8 = pathSegments4.get(0);
                                if (pathSegments4.size() > 1) {
                                    str = pathSegments4.get(1);
                                } else {
                                    str = null;
                                }
                                if ("sendgrams".equalsIgnoreCase(str8)) {
                                    return l(uri2);
                                }
                                if ("$".equalsIgnoreCase(str8)) {
                                    return i(substring.substring(1));
                                }
                                if ("invoice".equalsIgnoreCase(str8)) {
                                    return i(str);
                                }
                                if ("addstyle".equalsIgnoreCase(str8)) {
                                    return h(str);
                                }
                                if ("oauth".equalsIgnoreCase(str8)) {
                                    return k(uri2, uri2.getQueryParameter("startapp"));
                                }
                                if ("newbot".equalsIgnoreCase(str8)) {
                                    if (pathSegments4.size() >= 2) {
                                        if (pathSegments4.size() >= 3) {
                                            str2 = pathSegments4.get(2);
                                        } else {
                                            str2 = null;
                                        }
                                        j(str, str2, uri2.getQueryParameter("name"));
                                        return true;
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        TL_aicompose.getTone gettone = new TL_aicompose.getTone();
        TL_aicompose.inputAiComposeToneSlug inputaicomposetoneslug = new TL_aicompose.inputAiComposeToneSlug();
        inputaicomposetoneslug.slug = str;
        gettone.tone = inputaicomposetoneslug;
        o();
        ConnectionsManager.getInstance(this.f37222b).sendRequestTyped(gettone, new Object(), new b5(this, 14));
        return true;
    }

    public final boolean i(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        o();
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
        tL_inputInvoiceSlug.slug = str;
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
        this.h = ConnectionsManager.getInstance(this.f37222b).sendRequest(tL_payments_getPaymentForm, new ba((Object) this, (TLObject) tL_inputInvoiceSlug, str, 18));
        return true;
    }

    public final void j(String str, String str2, String str3) {
        TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot = new TLRPC.TL_requestPeerTypeCreateBot();
        tL_requestPeerTypeCreateBot.bot_managed = true;
        if (!TextUtils.isEmpty(str3)) {
            tL_requestPeerTypeCreateBot.flags |= 2;
            tL_requestPeerTypeCreateBot.suggested_name = str3;
        }
        if (!TextUtils.isEmpty(str2)) {
            tL_requestPeerTypeCreateBot.flags |= 4;
            tL_requestPeerTypeCreateBot.suggested_username = str2;
        }
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null && U.getContext() != null) {
            o();
            TLRPC.User[] userArr = {null};
            MessagesController.getInstance(this.f37222b).getUserNameResolver().resolve(str, new z(this, userArr, new org.telegram.ui.Components.oo0(this, U, userArr, tL_requestPeerTypeCreateBot, 16), 10));
        }
    }

    public final boolean k(Uri uri, String str) {
        if (!this.d) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        o();
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
        tL_messages_requestUrlAuth.flags |= 4;
        tL_messages_requestUrlAuth.url = uri.toString();
        ConnectionsManager.getInstance(this.f37222b).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new ai.m0(15, this, tL_messages_requestUrlAuth));
        return true;
    }

    public final boolean l(Uri uri) {
        Uri uri2;
        long j3;
        int i10 = this.f37222b;
        if (!MessagesController.getInstance(i10).config.walletAvailable.get()) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("startapp");
        if (queryParameter != null && queryParameter.startsWith("tonconnect-")) {
            String replace = queryParameter.substring(11).replace("--", "%").replace("__", "=").replace("-", "&").replace("%5F", "_").replace("%2D", "-").replace("%2E", ".");
            uri2 = Uri.parse("tc://connect?" + replace);
        } else {
            uri2 = null;
        }
        if (uri2 != null) {
            n(uri2);
            return true;
        }
        String queryParameter2 = uri.getQueryParameter("to");
        String queryParameter3 = uri.getQueryParameter("amount");
        String queryParameter4 = uri.getQueryParameter("text");
        if (TextUtils.isEmpty(queryParameter4)) {
            queryParameter4 = uri.getQueryParameter("comment");
        }
        String r10 = r(queryParameter4);
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("encrypted", false);
        if (queryParameter3 != null) {
            if (!TextUtils.isEmpty(queryParameter2) && queryParameter3.matches("[0-9]+(?:\\.[0-9]+)?")) {
                try {
                    j3 = new BigDecimal(queryParameter3).movePointRight(9).longValueExact();
                } catch (ArithmeticException | NumberFormatException unused) {
                }
            }
            return true;
        }
        j3 = 0;
        long j10 = j3;
        if (TextUtils.isEmpty(queryParameter2)) {
            u(new org.telegram.ui.Wallet.a5(), false);
            return true;
        }
        if (!queryParameter2.startsWith("@") && !queryParameter2.matches("[a-zA-Z0-9_]{1,32}")) {
            if (WalletEngine2.isValidRecipientAddress(queryParameter2)) {
                org.telegram.ui.Wallet.j8 j8Var = new org.telegram.ui.Wallet.j8(queryParameter2);
                j8Var.f35108r = j10;
                j8Var.f35092d0 = r10;
                j8Var.f35094e0 = booleanQueryParameter;
                j8Var.f35091c0 = true;
                u(j8Var, false);
                return true;
            }
        } else {
            if (queryParameter2.startsWith("@")) {
                queryParameter2 = queryParameter2.substring(1);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = queryParameter2;
                o();
                this.h = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new org.telegram.messenger.y9(this, j10, r10, booleanQueryParameter));
                return true;
            }
        }
        return true;
    }

    public final boolean m(java.util.List r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ec0.m(java.util.List):boolean");
    }

    public final boolean n(android.net.Uri r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ec0.n(android.net.Uri):boolean");
    }

    public final void o() {
        if (!this.f37225f && !this.f37226g) {
            of.e eVar = this.f37223c;
            if (eVar == null) {
                if (this.f37224e == null) {
                    this.f37224e = new org.telegram.ui.ActionBar.b2(this.f37221a, 3, null);
                }
                this.f37224e.setOnCancelListener(new pg(this, 3));
                this.f37224e.q(300L);
            } else {
                eVar.f17118b = new yb0(this, 0);
                eVar.d();
            }
            this.f37225f = true;
        }
    }

    public final void t(org.telegram.ui.ActionBar.n2 n2Var) {
        u(n2Var, false);
    }

    public final void u(org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        LaunchActivity launchActivity = this.f37221a;
        launchActivity.q0(n2Var, z10, false);
        if (AndroidUtilities.isTablet()) {
            launchActivity.f33807q0.U(true, true);
            launchActivity.f33811s0.U(true, true);
        }
    }

    public final void v(String str, int i10, String str2, String str3) {
        if (!this.f37228j) {
            LaunchActivity launchActivity = this.f37221a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TL_wallet.tonConnectGetPending tonconnectgetpending = new TL_wallet.tonConnectGetPending();
                tonconnectgetpending.dapp_client_id = str;
                this.h = ConnectionsManager.getInstance(this.f37222b).sendRequestTyped(tonconnectgetpending, new Object(), new org.telegram.messenger.jh(this, str, str2, str3, i10, 1));
                return;
            }
        }
        c();
    }

    public final void w(String str) {
        LaunchActivity launchActivity = this.f37221a;
        if (!launchActivity.isFinishing() && !launchActivity.isDestroyed() && !"none".equals(str)) {
            if ("back".equals(str)) {
                if (this.d) {
                    launchActivity.moveTaskToBack(true);
                    return;
                }
                return;
            }
            of.f.u(launchActivity, str);
        }
    }

    public final void x(String str) {
        AndroidUtilities.scrollToFragmentRow(this.f37221a.O(), str);
    }
}
