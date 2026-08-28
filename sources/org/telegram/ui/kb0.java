package org.telegram.ui;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
public final class kb0 {
    public final LaunchActivity f39790a;
    public final int f39791b;
    public final ve.d f39792c;
    public final boolean d;
    public org.telegram.ui.ActionBar.c2 f39793e;
    public boolean f39794f;
    public boolean f39795g;
    public int h = -1;

    public kb0(LaunchActivity launchActivity, int i9, ve.d dVar, boolean z10) {
        this.f39790a = launchActivity;
        this.f39791b = i9;
        this.f39792c = dVar;
        this.d = z10;
    }

    public static org.telegram.ui.Components.oc b() {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return org.telegram.ui.Components.oc.X();
        }
        return org.telegram.ui.Components.oc.a0(U);
    }

    public static boolean l(java.lang.String r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kb0.l(java.lang.String):boolean");
    }

    public final void a() {
        if (this.f39795g) {
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = this.f39793e;
        if (c2Var != null) {
            c2Var.dismiss();
        }
        ve.d dVar = this.f39792c;
        if (dVar != null) {
            dVar.b();
        }
        this.f39795g = true;
    }

    public final org.telegram.ui.ActionBar.b5 c() {
        return this.f39790a.O();
    }

    public final UserConfig d() {
        return UserConfig.getInstance(this.f39791b);
    }

    public final boolean e(Uri uri) {
        String str;
        String path;
        String str2;
        boolean z10;
        String scheme;
        String schemeSpecificPart;
        if (uri != null) {
            String scheme2 = uri.getScheme();
            boolean equalsIgnoreCase = "tonsite".equalsIgnoreCase(scheme2);
            LaunchActivity launchActivity = this.f39790a;
            if (equalsIgnoreCase) {
                ve.e.p(launchActivity, uri, true, true);
                return true;
            }
            String str3 = null;
            if (!"http".equalsIgnoreCase(scheme2) && !"https".equalsIgnoreCase(scheme2)) {
                if ("tg".equalsIgnoreCase(scheme2)) {
                    if (uri.isOpaque() && (scheme = uri.getScheme()) != null && uri.getAuthority() == null && (schemeSpecificPart = uri.getSchemeSpecificPart()) != null) {
                        uri = Uri.parse(scheme + "://" + schemeSpecificPart);
                    }
                    List<String> pathSegments = uri.getPathSegments();
                    if (pathSegments != null) {
                        ArrayList arrayList = new ArrayList(pathSegments);
                        String authority = uri.getAuthority();
                        if (!TextUtils.isEmpty(authority)) {
                            arrayList.add(0, authority);
                        }
                        if (!arrayList.isEmpty()) {
                            String str4 = (String) arrayList.get(0);
                            if (arrayList.size() > 1) {
                                str2 = (String) arrayList.get(1);
                            } else {
                                str2 = null;
                            }
                            if ("newbot".equalsIgnoreCase(str4)) {
                                h(uri.getQueryParameter("manager"), uri.getQueryParameter("username"), uri.getQueryParameter("name"));
                                return true;
                            } else if ("resolve".equalsIgnoreCase(str4)) {
                                List<String> pathSegments2 = uri.getPathSegments();
                                if (pathSegments2 != null) {
                                    ArrayList arrayList2 = new ArrayList(pathSegments2);
                                    String authority2 = uri.getAuthority();
                                    if (!TextUtils.isEmpty(authority2)) {
                                        arrayList2.add(0, authority2);
                                    }
                                    if (!arrayList2.isEmpty()) {
                                        arrayList2.remove(0);
                                        String queryParameter = uri.getQueryParameter("domain");
                                        String queryParameter2 = uri.getQueryParameter("startapp");
                                        if ("oauth".equalsIgnoreCase(queryParameter) && !TextUtils.isEmpty(queryParameter2)) {
                                            return i(uri, queryParameter2);
                                        }
                                    }
                                }
                            } else if ("invoice".equalsIgnoreCase(str4)) {
                                return g(uri.getQueryParameter("slug"));
                            } else {
                                if ("oauth".equalsIgnoreCase(str4)) {
                                    return i(uri, uri.getQueryParameter("token"));
                                }
                                if ("settings".equalsIgnoreCase(str4)) {
                                    return j(arrayList.subList(1, arrayList.size()));
                                }
                                if ("chats".equalsIgnoreCase(str4)) {
                                    "search".equalsIgnoreCase(str2);
                                    "edit".equalsIgnoreCase(str2);
                                    "emoji-status".equalsIgnoreCase(str2);
                                }
                                if ("new".equalsIgnoreCase(str4)) {
                                    if ("group".equalsIgnoreCase(str2)) {
                                        n(new k60(new Bundle()), false);
                                        return true;
                                    } else if ("contact".equalsIgnoreCase(str2)) {
                                        new nj0(launchActivity, LaunchActivity.U()).show();
                                        return true;
                                    } else if ("channel".equalsIgnoreCase(str2)) {
                                        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                                        if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                                            n(new id(aa.d.h(0, "step")), false);
                                            return true;
                                        }
                                        n(new h(0), false);
                                        globalMainSettings.edit().putBoolean("channel_intro", true).commit();
                                        return true;
                                    } else {
                                        n(new ContactsActivity(aa.d.i("destroyAfterSelect", true)), false);
                                        return true;
                                    }
                                } else if ("post".equalsIgnoreCase(str4)) {
                                    ?? r15 = "video".equalsIgnoreCase(str2);
                                    if ("live".equalsIgnoreCase(str2)) {
                                        r15 = -1;
                                    }
                                    kh.wb E = kh.wb.E(launchActivity, this.f39791b);
                                    if (E.K1 != r15) {
                                        E.K1 = r15;
                                        ?? r22 = E.M0;
                                        if (r22 != 0) {
                                            r22.a(r15);
                                        }
                                        if (r15 == 1) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        E.i0(z10, true);
                                        kh.z zVar = E.E0;
                                        if (zVar != null) {
                                            zVar.a(false, true);
                                        }
                                        E.m0(false);
                                    }
                                    E.R(null);
                                    return true;
                                } else if ("contacts".equalsIgnoreCase(str4)) {
                                    if ("new".equalsIgnoreCase(str2)) {
                                        new nj0(launchActivity, LaunchActivity.U()).show();
                                        return true;
                                    }
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("needPhonebook", true);
                                    bundle.putBoolean("needFinishFragment", true);
                                    n(new ContactsActivity(bundle), false);
                                    "search".equalsIgnoreCase(str2);
                                    "sort".equalsIgnoreCase(str2);
                                    if ("invite".equalsIgnoreCase(str2)) {
                                        o("phonebookRow");
                                        return true;
                                    }
                                    return true;
                                } else if ("addstyle".equalsIgnoreCase(str4)) {
                                    return f(uri.getQueryParameter("slug"));
                                }
                            }
                        }
                    }
                }
            } else {
                String host = uri.getHost();
                if (host != null) {
                    Matcher matcher = LaunchActivity.f35493x1.matcher(host.toLowerCase());
                    boolean find = matcher.find();
                    if ("telegram.me".equalsIgnoreCase(host) || "t.me".equalsIgnoreCase(host) || "telegram.dog".equalsIgnoreCase(host) || find) {
                        if (find) {
                            StringBuilder sb2 = new StringBuilder("https://t.me/");
                            sb2.append(matcher.group(1));
                            String str5 = "";
                            if (TextUtils.isEmpty(uri.getPath())) {
                                path = "";
                            } else {
                                path = uri.getPath();
                            }
                            sb2.append(path);
                            if (!TextUtils.isEmpty(uri.getQuery())) {
                                str5 = "?" + uri.getQuery();
                            }
                            sb2.append(str5);
                            uri = Uri.parse(sb2.toString());
                        }
                        String path2 = uri.getPath();
                        if (path2 != null && path2.length() > 1) {
                            String substring = path2.substring(1);
                            List<String> pathSegments3 = uri.getPathSegments();
                            if (pathSegments3 != null && !pathSegments3.isEmpty()) {
                                String str6 = pathSegments3.get(0);
                                if (pathSegments3.size() > 1) {
                                    str = pathSegments3.get(1);
                                } else {
                                    str = null;
                                }
                                if ("$".equalsIgnoreCase(str6)) {
                                    return g(substring.substring(1));
                                }
                                if ("invoice".equalsIgnoreCase(str6)) {
                                    return g(str);
                                }
                                if ("addstyle".equalsIgnoreCase(str6)) {
                                    return f(str);
                                }
                                if ("oauth".equalsIgnoreCase(str6)) {
                                    return i(uri, uri.getQueryParameter("startapp"));
                                }
                                if ("newbot".equalsIgnoreCase(str6)) {
                                    if (pathSegments3.size() >= 2) {
                                        if (pathSegments3.size() >= 3) {
                                            str3 = pathSegments3.get(2);
                                        }
                                        h(str, str3, uri.getQueryParameter("name"));
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

    public final boolean f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        TL_aicompose.getTone gettone = new TL_aicompose.getTone();
        TL_aicompose.inputAiComposeToneSlug inputaicomposetoneslug = new TL_aicompose.inputAiComposeToneSlug();
        inputaicomposetoneslug.slug = str;
        gettone.tone = inputaicomposetoneslug;
        k();
        ConnectionsManager.getInstance(this.f39791b).sendRequestTyped(gettone, new Object(), new a5(this, 14));
        return true;
    }

    public final boolean g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        k();
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
        tL_inputInvoiceSlug.slug = str;
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
        this.h = ConnectionsManager.getInstance(this.f39791b).sendRequest(tL_payments_getPaymentForm, new y9((Object) this, (TLObject) tL_inputInvoiceSlug, str, 18));
        return true;
    }

    public final void h(String str, String str2, String str3) {
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
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null && U.getContext() != null) {
            k();
            TLRPC.User[] userArr = {null};
            MessagesController.getInstance(this.f39791b).getUserNameResolver().resolve(str, new eh(this, userArr, new org.telegram.ui.Components.no0(this, U, userArr, tL_requestPeerTypeCreateBot, 14), 3));
        }
    }

    public final boolean i(Uri uri, String str) {
        if (!this.d) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        k();
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
        tL_messages_requestUrlAuth.flags |= 4;
        tL_messages_requestUrlAuth.url = uri.toString();
        ConnectionsManager.getInstance(this.f39791b).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new bg.y0(22, this, tL_messages_requestUrlAuth));
        return true;
    }

    public final boolean j(java.util.List r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kb0.j(java.util.List):boolean");
    }

    public final void k() {
        if (!this.f39794f && !this.f39795g) {
            ve.d dVar = this.f39792c;
            if (dVar == null) {
                if (this.f39793e == null) {
                    this.f39793e = new org.telegram.ui.ActionBar.c2(this.f39790a, 3, null);
                }
                this.f39793e.setOnCancelListener(new eg(this, 3));
                this.f39793e.q(300L);
            } else {
                dVar.f48382b = new db0(this, 0);
                dVar.d();
            }
            this.f39794f = true;
        }
    }

    public final void m(org.telegram.ui.ActionBar.o2 o2Var) {
        n(o2Var, false);
    }

    public final void n(org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        LaunchActivity launchActivity = this.f39790a;
        launchActivity.q0(o2Var, z10, false);
        if (AndroidUtilities.isTablet()) {
            launchActivity.m0.U(true, true);
            launchActivity.f35522o0.U(true, true);
        }
    }

    public final void o(String str) {
        AndroidUtilities.scrollToFragmentRow(this.f39790a.O(), str);
    }
}
