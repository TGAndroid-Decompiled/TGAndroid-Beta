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
public final class ob0 {
    public static final Pattern f42049k = Pattern.compile("^[a-z0-9_]{1,32}$");
    public final LaunchActivity f42050a;
    public final int f42051b;
    public final qf.c f42052c;
    public final boolean d;
    public org.telegram.ui.ActionBar.e2 e;
    public boolean f42053f;
    public boolean f42054g;
    public int h = -1;
    public bi.sb f42055i;
    public boolean f42056j;

    public ob0(LaunchActivity launchActivity, int i10, qf.c cVar, boolean z10) {
        this.f42050a = launchActivity;
        this.f42051b = i10;
        this.f42052c = cVar;
        this.d = z10;
    }

    public static org.telegram.ui.Components.wc d() {
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U == null) {
            return org.telegram.ui.Components.wc.Y();
        }
        return org.telegram.ui.Components.wc.b0(U);
    }

    public static boolean p(java.lang.String r2) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ob0.p(java.lang.String):boolean");
    }

    public static boolean q(java.lang.String r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ob0.q(java.lang.String):boolean");
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
        if (!this.f42056j) {
            LaunchActivity launchActivity = this.f42050a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed() && LaunchActivity.G1 && !SharedConfig.appLocked && !SharedConfig.isWaitingForPasscodeEnter && UserConfig.selectedAccount == this.f42051b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void b() {
        this.f42056j = true;
        bi.sb sbVar = this.f42055i;
        if (sbVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sbVar);
        }
        if (this.h >= 0) {
            ConnectionsManager.getInstance(this.f42051b).cancelRequest(this.h, true);
            this.h = -1;
        }
    }

    public final void c() {
        if (this.f42054g) {
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = this.e;
        if (e2Var != null) {
            e2Var.dismiss();
        }
        qf.c cVar = this.f42052c;
        if (cVar != null) {
            cVar.b();
        }
        this.f42054g = true;
    }

    public final org.telegram.ui.ActionBar.j5 e() {
        return this.f42050a.O();
    }

    public final UserConfig f() {
        return UserConfig.getInstance(this.f42051b);
    }

    public final boolean g(Uri uri) {
        String str;
        String str2;
        String str3;
        String path;
        Uri s10;
        List<String> pathSegments;
        String str4;
        Long l4;
        String str5;
        boolean z10;
        Uri uri2 = uri;
        if (uri2 != null) {
            FileLog.d("link manager handle " + uri2);
            String scheme = uri2.getScheme();
            boolean equalsIgnoreCase = "tonsite".equalsIgnoreCase(scheme);
            LaunchActivity launchActivity = this.f42050a;
            if (equalsIgnoreCase) {
                qf.d.o(launchActivity, uri2, true, true);
                return true;
            } else if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                boolean equalsIgnoreCase2 = "tg".equalsIgnoreCase(scheme);
                int i10 = this.f42051b;
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
                            String str6 = (String) arrayList.get(0);
                            if (arrayList.size() > 1) {
                                str5 = (String) arrayList.get(1);
                            } else {
                                str5 = null;
                            }
                            if ("sendgrams".equalsIgnoreCase(str6)) {
                                return l(s11);
                            }
                            if ("newbot".equalsIgnoreCase(str6)) {
                                j(s11.getQueryParameter("manager"), s11.getQueryParameter("username"), s11.getQueryParameter("name"));
                                return true;
                            } else if ("resolve".equalsIgnoreCase(str6)) {
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
                            } else if ("invoice".equalsIgnoreCase(str6)) {
                                return i(s11.getQueryParameter("slug"));
                            } else {
                                if ("oauth".equalsIgnoreCase(str6)) {
                                    return k(s11, s11.getQueryParameter("token"));
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
                                        u(new t60(new Bundle()), false);
                                        return true;
                                    } else if ("contact".equalsIgnoreCase(str5)) {
                                        new qj0(launchActivity, LaunchActivity.U()).show();
                                        return true;
                                    } else if ("channel".equalsIgnoreCase(str5)) {
                                        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                                        if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                                            u(new nd(org.telegram.ui.Components.b10.g(0, "step")), false);
                                            return true;
                                        }
                                        u(new g(0), false);
                                        globalMainSettings.edit().putBoolean("channel_intro", true).commit();
                                        return true;
                                    } else {
                                        u(new ContactsActivity(a1.g.i("destroyAfterSelect", true)), false);
                                        return true;
                                    }
                                } else if ("post".equalsIgnoreCase(str6)) {
                                    ?? r02 = "video".equalsIgnoreCase(str5);
                                    if ("live".equalsIgnoreCase(str5)) {
                                        r02 = -1;
                                    }
                                    fi.sb D = fi.sb.D(launchActivity, i10);
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
                                        new qj0(launchActivity, LaunchActivity.U()).show();
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
                                    l4 = Long.valueOf(Long.parseLong(s10.getQueryParameter("amount")));
                                } catch (Throwable unused) {
                                    l4 = null;
                                }
                                String queryParameter3 = s10.getQueryParameter("text");
                                if (TextUtils.isEmpty(queryParameter3)) {
                                    queryParameter3 = s10.getQueryParameter("comment");
                                }
                                String r6 = r(queryParameter3);
                                boolean booleanQueryParameter = s10.getBooleanQueryParameter("encrypted", false);
                                try {
                                    org.telegram.ui.Wallet.i9 i9Var = new org.telegram.ui.Wallet.i9(str4);
                                    if (l4 != null && l4.longValue() > 0) {
                                        i9Var.f36736s = l4.longValue();
                                    }
                                    if (!TextUtils.isEmpty(r6)) {
                                        i9Var.f36723g0 = r6;
                                        i9Var.f36724h0 = booleanQueryParameter;
                                    }
                                    i9Var.f36722f0 = true;
                                    u(i9Var, false);
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
                    Matcher matcher = LaunchActivity.D1.matcher(host.toLowerCase());
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
                                        if (f42049k.matcher(lowerCase).matches()) {
                                            str3 = org.telegram.ui.Components.b10.j("tme_getpremium_", lowerCase);
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
        ConnectionsManager.getInstance(this.f42051b).sendRequestTyped(gettone, new Object(), new e5(this, 14));
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
        this.h = ConnectionsManager.getInstance(this.f42051b).sendRequest(tL_payments_getPaymentForm, new ea((Object) this, (TLObject) tL_inputInvoiceSlug, str, 18));
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
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U != null && U.getContext() != null) {
            o();
            TLRPC.User[] userArr = {null};
            MessagesController.getInstance(this.f42051b).getUserNameResolver().resolve(str, new y(this, userArr, new org.telegram.ui.Components.e10(this, U, userArr, tL_requestPeerTypeCreateBot), 10));
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
        ConnectionsManager.getInstance(this.f42051b).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new bi.m5(19, this, tL_messages_requestUrlAuth));
        return true;
    }

    public final boolean l(Uri uri) {
        Uri uri2;
        long j10;
        int i10 = this.f42051b;
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
        String r6 = r(queryParameter4);
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("encrypted", false);
        if (queryParameter3 != null) {
            if (!TextUtils.isEmpty(queryParameter2) && queryParameter3.matches("[0-9]+(?:\\.[0-9]+)?")) {
                try {
                    j10 = new BigDecimal(queryParameter3).movePointRight(9).longValueExact();
                } catch (ArithmeticException | NumberFormatException unused) {
                }
            }
            return true;
        }
        j10 = 0;
        long j11 = j10;
        if (TextUtils.isEmpty(queryParameter2)) {
            u(new org.telegram.ui.Wallet.m5(), false);
            return true;
        }
        if (!queryParameter2.startsWith("@") && !queryParameter2.matches("[a-zA-Z0-9_]{1,32}")) {
            if (WalletEngine2.isValidRecipientAddress(queryParameter2)) {
                org.telegram.ui.Wallet.i9 i9Var = new org.telegram.ui.Wallet.i9(queryParameter2);
                i9Var.f36736s = j11;
                i9Var.f36723g0 = r6;
                i9Var.f36724h0 = booleanQueryParameter;
                i9Var.f36722f0 = true;
                u(i9Var, false);
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
                this.h = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new bi.m(this, j11, r6, booleanQueryParameter));
                return true;
            }
        }
        return true;
    }

    public final boolean m(java.util.List r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ob0.m(java.util.List):boolean");
    }

    public final boolean n(android.net.Uri r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ob0.n(android.net.Uri):boolean");
    }

    public final void o() {
        if (!this.f42053f && !this.f42054g) {
            qf.c cVar = this.f42052c;
            if (cVar == null) {
                if (this.e == null) {
                    this.e = new org.telegram.ui.ActionBar.e2(this.f42050a, 3, null);
                }
                this.e.setOnCancelListener(new kg(this, 3));
                this.e.r(300L);
            } else {
                cVar.f47069b = new ib0(this, 0);
                cVar.d();
            }
            this.f42053f = true;
        }
    }

    public final void t(org.telegram.ui.ActionBar.r2 r2Var) {
        u(r2Var, false);
    }

    public final void u(org.telegram.ui.ActionBar.r2 r2Var, boolean z10) {
        LaunchActivity launchActivity = this.f42050a;
        launchActivity.v0(r2Var, z10, false);
        if (AndroidUtilities.isTablet()) {
            launchActivity.f35577q0.W(true, true);
            launchActivity.f35581s0.W(true, true);
        }
    }

    public final void v(String str, int i10, String str2, String str3) {
        if (!this.f42056j) {
            LaunchActivity launchActivity = this.f42050a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TL_wallet.tonConnectGetPending tonconnectgetpending = new TL_wallet.tonConnectGetPending();
                tonconnectgetpending.dapp_client_id = str;
                this.h = ConnectionsManager.getInstance(this.f42051b).sendRequestTyped(tonconnectgetpending, new Object(), new org.telegram.messenger.kh(this, str, str2, str3, i10, 2));
                return;
            }
        }
        c();
    }

    public final void w(String str) {
        LaunchActivity launchActivity = this.f42050a;
        if (!launchActivity.isFinishing() && !launchActivity.isDestroyed() && !"none".equals(str)) {
            if ("back".equals(str)) {
                if (this.d) {
                    launchActivity.moveTaskToBack(true);
                    return;
                }
                return;
            }
            qf.d.t(launchActivity, str);
        }
    }

    public final void x(String str) {
        AndroidUtilities.scrollToFragmentRow(this.f42050a.O(), str);
    }
}
