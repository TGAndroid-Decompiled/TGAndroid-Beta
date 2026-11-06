package org.telegram.ui;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
public final class p90 {
    public static final Pattern f48716k = Pattern.compile("^[a-z0-9_]{1,32}$");
    public final LaunchActivity f48717a;
    public final int f48718b;
    public final vf.b f48719c;
    public final boolean d;
    public org.telegram.ui.ActionBar.u1 f48720e;
    public boolean f48721f;
    public boolean f48722g;
    public int h = -1;
    public bi.ub f48723i;
    public boolean f48724j;

    public p90(LaunchActivity launchActivity, int i7, vf.b bVar, boolean z9) {
        this.f48717a = launchActivity;
        this.f48718b = i7;
        this.f48719c = bVar;
        this.d = z9;
    }

    public static org.telegram.ui.Components.hc d() {
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T == null) {
            return org.telegram.ui.Components.hc.X();
        }
        return org.telegram.ui.Components.hc.a0(T);
    }

    public static boolean p(java.lang.String r2) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p90.p(java.lang.String):boolean");
    }

    public static boolean q(java.lang.String r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p90.q(java.lang.String):boolean");
    }

    public static String r(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int i7 = 960;
        if (bytes.length <= 960) {
            return str;
        }
        while ((bytes[i7] & 192) == 128) {
            i7--;
        }
        return new String(bytes, 0, i7, StandardCharsets.UTF_8);
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
        if (!this.f48724j) {
            LaunchActivity launchActivity = this.f48717a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed() && LaunchActivity.F1 && !org.telegram.messenger.iz.f23427x && !org.telegram.messenger.iz.C && org.telegram.messenger.p10.f24467s0 == this.f48718b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void b() {
        this.f48724j = true;
        bi.ub ubVar = this.f48723i;
        if (ubVar != null) {
            org.telegram.messenger.g0.r(ubVar);
        }
        if (this.h >= 0) {
            ConnectionsManager.getInstance(this.f48718b).cancelRequest(this.h, true);
            this.h = -1;
        }
    }

    public final void c() {
        if (this.f48722g) {
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = this.f48720e;
        if (u1Var != null) {
            u1Var.dismiss();
        }
        vf.b bVar = this.f48719c;
        if (bVar != null) {
            bVar.b();
        }
        this.f48722g = true;
    }

    public final org.telegram.ui.ActionBar.q4 e() {
        return this.f48717a.M();
    }

    public final org.telegram.messenger.p10 f() {
        return org.telegram.messenger.p10.i(this.f48718b);
    }

    public final boolean g(Uri uri) {
        String str;
        String str2;
        String str3;
        String path;
        Uri s5;
        List<String> pathSegments;
        String str4;
        Long l10;
        String str5;
        boolean z9;
        Uri uri2 = uri;
        if (uri2 != null) {
            org.telegram.messenger.a8.b("link manager handle " + uri2);
            String scheme = uri2.getScheme();
            boolean equalsIgnoreCase = "tonsite".equalsIgnoreCase(scheme);
            LaunchActivity launchActivity = this.f48717a;
            if (equalsIgnoreCase) {
                vf.c.q(launchActivity, uri2, true, true);
                return true;
            } else if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                boolean equalsIgnoreCase2 = "tg".equalsIgnoreCase(scheme);
                int i7 = this.f48718b;
                if (equalsIgnoreCase2) {
                    Uri s9 = s(Uri.parse(uri2.toString().replaceFirst("(?i)^tg:(//)?sendgrams&", "tg://sendgrams?")));
                    List<String> pathSegments2 = s9.getPathSegments();
                    if (pathSegments2 != null) {
                        ArrayList arrayList = new ArrayList(pathSegments2);
                        String authority = s9.getAuthority();
                        if (!TextUtils.isEmpty(authority)) {
                            arrayList.add(0, authority);
                        }
                        if (!arrayList.isEmpty()) {
                            String str6 = (String) arrayList.get(0);
                            if (arrayList.size() > 1) {
                                str5 = (String) arrayList.get(1);
                            } else {
                                str5 = null;
                            }
                            if ("sendgrams".equalsIgnoreCase(str6)) {
                                return l(s9);
                            }
                            if ("newbot".equalsIgnoreCase(str6)) {
                                j(s9.getQueryParameter("manager"), s9.getQueryParameter("username"), s9.getQueryParameter("name"));
                                return true;
                            } else if ("resolve".equalsIgnoreCase(str6)) {
                                List<String> pathSegments3 = s9.getPathSegments();
                                if (pathSegments3 != null) {
                                    ArrayList arrayList2 = new ArrayList(pathSegments3);
                                    String authority2 = s9.getAuthority();
                                    if (!TextUtils.isEmpty(authority2)) {
                                        arrayList2.add(0, authority2);
                                    }
                                    if (!arrayList2.isEmpty()) {
                                        arrayList2.remove(0);
                                        String queryParameter = s9.getQueryParameter("domain");
                                        String queryParameter2 = s9.getQueryParameter("startapp");
                                        if ("sendgrams".equalsIgnoreCase(queryParameter)) {
                                            return l(s9);
                                        }
                                        if ("oauth".equalsIgnoreCase(queryParameter) && !TextUtils.isEmpty(queryParameter2)) {
                                            return k(s9, queryParameter2);
                                        }
                                    }
                                }
                            } else if ("invoice".equalsIgnoreCase(str6)) {
                                return i(s9.getQueryParameter("slug"));
                            } else {
                                if ("oauth".equalsIgnoreCase(str6)) {
                                    return k(s9, s9.getQueryParameter("token"));
                                }
                                if ("settings".equalsIgnoreCase(str6)) {
                                    return m(arrayList.subList(1, arrayList.size()));
                                }
                                if ("chats".equalsIgnoreCase(str6)) {
                                    "search".equalsIgnoreCase(str5);
                                    "edit".equalsIgnoreCase(str5);
                                    "emoji-status".equalsIgnoreCase(str5);
                                }
                                if ("new".equalsIgnoreCase(str6)) {
                                    if ("group".equalsIgnoreCase(str5)) {
                                        u(new w40(new Bundle()), false);
                                        return true;
                                    } else if ("contact".equalsIgnoreCase(str5)) {
                                        new ah0(launchActivity, LaunchActivity.T()).show();
                                        return true;
                                    } else if ("channel".equalsIgnoreCase(str5)) {
                                        SharedPreferences e12 = org.telegram.messenger.qp.e1();
                                        boolean z10 = org.telegram.messenger.r2.f25199a;
                                        u(new g(0), false);
                                        e12.edit().putBoolean("channel_intro", true).commit();
                                        return true;
                                    } else {
                                        u(new ContactsActivity(a8.p0.k("destroyAfterSelect", true)), false);
                                        return true;
                                    }
                                } else if ("post".equalsIgnoreCase(str6)) {
                                    ?? r02 = "video".equalsIgnoreCase(str5);
                                    if ("live".equalsIgnoreCase(str5)) {
                                        r02 = -1;
                                    }
                                    fi.va D = fi.va.D(launchActivity, i7);
                                    if (D.O1 != r02) {
                                        D.O1 = r02;
                                        ?? r42 = D.Q0;
                                        if (r42 != 0) {
                                            r42.a(r02);
                                        }
                                        if (r02 == 1) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        D.h0(z9, true);
                                        fi.y yVar = D.I0;
                                        if (yVar != null) {
                                            yVar.a(false, true);
                                        }
                                        D.l0(false);
                                    }
                                    D.Q(null);
                                    return true;
                                } else if ("contacts".equalsIgnoreCase(str6)) {
                                    if ("new".equalsIgnoreCase(str5)) {
                                        new ah0(launchActivity, LaunchActivity.T()).show();
                                        return true;
                                    }
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("needPhonebook", true);
                                    bundle.putBoolean("needFinishFragment", true);
                                    u(new ContactsActivity(bundle), false);
                                    "search".equalsIgnoreCase(str5);
                                    "sort".equalsIgnoreCase(str5);
                                    if ("invite".equalsIgnoreCase(str5)) {
                                        x("phonebookRow");
                                        return true;
                                    }
                                    return true;
                                } else if ("addstyle".equalsIgnoreCase(str6)) {
                                    return h(s9.getQueryParameter("slug"));
                                }
                            }
                        }
                    }
                } else if ("ton".equalsIgnoreCase(scheme)) {
                    if (((org.telegram.messenger.h0) org.telegram.messenger.qp.s1(i7).f24935x7.f24442j0.f13889b).f22774c && (pathSegments = (s5 = s(uri2)).getPathSegments()) != null) {
                        ArrayList arrayList3 = new ArrayList(pathSegments);
                        String authority3 = s5.getAuthority();
                        if (!TextUtils.isEmpty(authority3)) {
                            arrayList3.add(0, authority3);
                        }
                        if (!arrayList3.isEmpty()) {
                            String str7 = (String) arrayList3.get(0);
                            if (arrayList3.size() > 1) {
                                str4 = (String) arrayList3.get(1);
                            } else {
                                str4 = null;
                            }
                            if (!"transfer".equalsIgnoreCase(str7)) {
                                return false;
                            }
                            if (arrayList3.size() == 2 && WalletEngine2.isValidRecipientAddress(str4)) {
                                try {
                                    l10 = Long.valueOf(Long.parseLong(s5.getQueryParameter("amount")));
                                } catch (Throwable unused) {
                                    l10 = null;
                                }
                                String queryParameter3 = s5.getQueryParameter("text");
                                if (TextUtils.isEmpty(queryParameter3)) {
                                    queryParameter3 = s5.getQueryParameter("comment");
                                }
                                String r10 = r(queryParameter3);
                                boolean booleanQueryParameter = s5.getBooleanQueryParameter("encrypted", false);
                                try {
                                    org.telegram.ui.Wallet.n9 n9Var = new org.telegram.ui.Wallet.n9(str4);
                                    if (l10 != null && l10.longValue() > 0) {
                                        n9Var.f42865s = l10.longValue();
                                    }
                                    if (!TextUtils.isEmpty(r10)) {
                                        n9Var.f42852g0 = r10;
                                        n9Var.f42853h0 = booleanQueryParameter;
                                    }
                                    n9Var.f42851f0 = true;
                                    u(n9Var, false);
                                    return true;
                                } catch (Throwable th2) {
                                    org.telegram.messenger.a8.g(th2, true);
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
                    Matcher matcher = LaunchActivity.C1.matcher(host.toLowerCase());
                    boolean find = matcher.find();
                    if ("telegram.me".equalsIgnoreCase(host) || "t.me".equalsIgnoreCase(host) || "telegram.dog".equalsIgnoreCase(host) || find) {
                        if (find) {
                            StringBuilder sb2 = new StringBuilder("https://t.me/");
                            sb2.append(matcher.group(1));
                            String str8 = "";
                            if (TextUtils.isEmpty(uri2.getPath())) {
                                path = "";
                            } else {
                                path = uri2.getPath();
                            }
                            sb2.append(path);
                            if (!TextUtils.isEmpty(uri2.getQuery())) {
                                str8 = "?" + uri2.getQuery();
                            }
                            sb2.append(str8);
                            uri2 = Uri.parse(sb2.toString());
                        }
                        String path2 = uri2.getPath();
                        if (path2 != null && path2.length() > 1) {
                            String substring = path2.substring(1);
                            List<String> pathSegments4 = uri2.getPathSegments();
                            if (pathSegments4 != null && !pathSegments4.isEmpty()) {
                                String str9 = pathSegments4.get(0);
                                if (pathSegments4.size() > 1) {
                                    str = pathSegments4.get(1);
                                } else {
                                    str = null;
                                }
                                if ("sendgrams".equalsIgnoreCase(str9)) {
                                    return l(uri2);
                                }
                                if ("getpremium".equalsIgnoreCase(str9)) {
                                    String queryParameter4 = uri2.getQueryParameter("ref");
                                    if (queryParameter4 != null) {
                                        String lowerCase = queryParameter4.toLowerCase(Locale.ROOT);
                                        if (f48716k.matcher(lowerCase).matches()) {
                                            str3 = rf.b.i("tme_getpremium_", lowerCase);
                                            u(new PremiumPreviewFragment(0, str3), false);
                                            return true;
                                        }
                                    }
                                    str3 = "tme_getpremium";
                                    u(new PremiumPreviewFragment(0, str3), false);
                                    return true;
                                } else if ("$".equalsIgnoreCase(str9)) {
                                    return i(substring.substring(1));
                                } else {
                                    if ("invoice".equalsIgnoreCase(str9)) {
                                        return i(str);
                                    }
                                    if ("addstyle".equalsIgnoreCase(str9)) {
                                        return h(str);
                                    }
                                    if ("oauth".equalsIgnoreCase(str9)) {
                                        return k(uri2, uri2.getQueryParameter("startapp"));
                                    }
                                    if ("newbot".equalsIgnoreCase(str9)) {
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
        ConnectionsManager.getInstance(this.f48718b).sendRequestTyped(gettone, new d3.b(1), new a5(this, 14));
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
        this.h = ConnectionsManager.getInstance(this.f48718b).sendRequest(tL_payments_getPaymentForm, new z9((Object) this, (TLObject) tL_inputInvoiceSlug, str, 18));
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
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T != null && T.getContext() != null) {
            o();
            TLRPC.User[] userArr = {null};
            org.telegram.messenger.qp.s1(this.f48718b).d2().a(str, null, new y(this, userArr, new org.telegram.ui.Components.kn0(this, T, userArr, tL_requestPeerTypeCreateBot, 14), 10));
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
        ConnectionsManager.getInstance(this.f48718b).sendRequestTyped(tL_messages_requestUrlAuth, new d3.b(1), new bi.p5(18, this, tL_messages_requestUrlAuth));
        return true;
    }

    public final boolean l(Uri uri) {
        Uri uri2;
        long j3;
        int i7 = this.f48718b;
        if (!((org.telegram.messenger.h0) org.telegram.messenger.qp.s1(i7).f24935x7.f24442j0.f13889b).f22774c) {
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
            u(new org.telegram.ui.Wallet.y5(), false);
            return true;
        }
        if (!queryParameter2.startsWith("@") && !queryParameter2.matches("[a-zA-Z0-9_]{1,32}")) {
            if (WalletEngine2.isValidRecipientAddress(queryParameter2)) {
                org.telegram.ui.Wallet.n9 n9Var = new org.telegram.ui.Wallet.n9(queryParameter2);
                n9Var.f42865s = j10;
                n9Var.f42852g0 = r10;
                n9Var.f42853h0 = booleanQueryParameter;
                n9Var.f42851f0 = true;
                u(n9Var, false);
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
                this.h = ConnectionsManager.getInstance(i7).sendRequest(tL_contacts_resolveUsername, new bi.m(this, j10, r10, booleanQueryParameter));
                return true;
            }
        }
        return true;
    }

    public final boolean m(java.util.List r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p90.m(java.util.List):boolean");
    }

    public final boolean n(android.net.Uri r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p90.n(android.net.Uri):boolean");
    }

    public final void o() {
        if (!this.f48721f && !this.f48722g) {
            vf.b bVar = this.f48719c;
            if (bVar == null) {
                if (this.f48720e == null) {
                    this.f48720e = new org.telegram.ui.ActionBar.u1(3, this.f48717a, null);
                }
                this.f48720e.setOnCancelListener(new vf(this, 3));
                this.f48720e.r(300L);
            } else {
                bVar.f57231b = new k90(this, 0);
                bVar.d();
            }
            this.f48721f = true;
        }
    }

    public final void t(org.telegram.ui.ActionBar.f2 f2Var) {
        u(f2Var, false);
    }

    public final void u(org.telegram.ui.ActionBar.f2 f2Var, boolean z9) {
        LaunchActivity launchActivity = this.f48717a;
        launchActivity.u0(f2Var, z9, false);
        if (org.telegram.messenger.g0.Q1()) {
            launchActivity.f41275o0.X(true, true);
            launchActivity.f41279q0.X(true, true);
        }
    }

    public final void v(String str, int i7, String str2, String str3) {
        if (!this.f48724j) {
            LaunchActivity launchActivity = this.f48717a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TL_wallet.tonConnectGetPending tonconnectgetpending = new TL_wallet.tonConnectGetPending();
                tonconnectgetpending.dapp_client_id = str;
                this.h = ConnectionsManager.getInstance(this.f48718b).sendRequestTyped(tonconnectgetpending, new d3.b(1), new l60(this, str, str2, str3, i7));
                return;
            }
        }
        c();
    }

    public final void w(String str) {
        LaunchActivity launchActivity = this.f48717a;
        if (!launchActivity.isFinishing() && !launchActivity.isDestroyed() && !"none".equals(str)) {
            if ("back".equals(str)) {
                if (this.d) {
                    launchActivity.moveTaskToBack(true);
                    return;
                }
                return;
            }
            vf.c.v(launchActivity, str, false);
        }
    }

    public final void x(String str) {
        org.telegram.messenger.g0.k3(this.f48717a.M(), str);
    }
}
