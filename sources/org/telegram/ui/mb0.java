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
public final class mb0 {
    public final LaunchActivity f40513a;
    public final int f40514b;
    public final ye.c f40515c;
    public final boolean d;
    public org.telegram.ui.ActionBar.c2 f40516e;
    public boolean f40517f;
    public boolean f40518g;
    public int h = -1;

    public mb0(LaunchActivity launchActivity, int i10, ye.c cVar, boolean z10) {
        this.f40513a = launchActivity;
        this.f40514b = i10;
        this.f40515c = cVar;
        this.d = z10;
    }

    public static org.telegram.ui.Components.tc b() {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return org.telegram.ui.Components.tc.X();
        }
        return org.telegram.ui.Components.tc.a0(U);
    }

    public static boolean l(java.lang.String r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mb0.l(java.lang.String):boolean");
    }

    public final void a() {
        if (this.f40518g) {
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = this.f40516e;
        if (c2Var != null) {
            c2Var.dismiss();
        }
        ye.c cVar = this.f40515c;
        if (cVar != null) {
            cVar.b();
        }
        this.f40518g = true;
    }

    public final org.telegram.ui.ActionBar.b5 c() {
        return this.f40513a.O();
    }

    public final UserConfig d() {
        return UserConfig.getInstance(this.f40514b);
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
            LaunchActivity launchActivity = this.f40513a;
            if (equalsIgnoreCase) {
                ye.d.p(launchActivity, uri, true, true);
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
                                        n(new m60(new Bundle()), false);
                                        return true;
                                    } else if ("contact".equalsIgnoreCase(str2)) {
                                        new kj0(launchActivity, LaunchActivity.U()).show();
                                        return true;
                                    } else if ("channel".equalsIgnoreCase(str2)) {
                                        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                                        if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                                            n(new hd(a4.w.h(0, "step")), false);
                                            return true;
                                        }
                                        n(new i(0), false);
                                        globalMainSettings.edit().putBoolean("channel_intro", true).commit();
                                        return true;
                                    } else {
                                        n(new ContactsActivity(a4.w.i("destroyAfterSelect", true)), false);
                                        return true;
                                    }
                                } else if ("post".equalsIgnoreCase(str4)) {
                                    ?? r15 = "video".equalsIgnoreCase(str2);
                                    if ("live".equalsIgnoreCase(str2)) {
                                        r15 = -1;
                                    }
                                    nh.gb E = nh.gb.E(launchActivity, this.f40514b);
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
                                        nh.y yVar = E.E0;
                                        if (yVar != null) {
                                            yVar.a(false, true);
                                        }
                                        E.m0(false);
                                    }
                                    E.R(null);
                                    return true;
                                } else if ("contacts".equalsIgnoreCase(str4)) {
                                    if ("new".equalsIgnoreCase(str2)) {
                                        new kj0(launchActivity, LaunchActivity.U()).show();
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
                    Matcher matcher = LaunchActivity.f35560x1.matcher(host.toLowerCase());
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
        ConnectionsManager.getInstance(this.f40514b).sendRequestTyped(gettone, new Object(), new b5(this, 14));
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
        this.h = ConnectionsManager.getInstance(this.f40514b).sendRequest(tL_payments_getPaymentForm, new x9((Object) this, (TLObject) tL_inputInvoiceSlug, str, 18));
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
            MessagesController.getInstance(this.f40514b).getUserNameResolver().resolve(str, new eh(this, userArr, new n20(this, U, userArr, tL_requestPeerTypeCreateBot, 8), 3));
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
        ConnectionsManager.getInstance(this.f40514b).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new bh.v(22, this, tL_messages_requestUrlAuth));
        return true;
    }

    public final boolean j(java.util.List r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mb0.j(java.util.List):boolean");
    }

    public final void k() {
        if (!this.f40517f && !this.f40518g) {
            ye.c cVar = this.f40515c;
            if (cVar == null) {
                if (this.f40516e == null) {
                    this.f40516e = new org.telegram.ui.ActionBar.c2(this.f40513a, 3, null);
                }
                this.f40516e.setOnCancelListener(new cg(this, 3));
                this.f40516e.q(300L);
            } else {
                cVar.f50515b = new gb0(this, 0);
                cVar.d();
            }
            this.f40517f = true;
        }
    }

    public final void m(org.telegram.ui.ActionBar.o2 o2Var) {
        n(o2Var, false);
    }

    public final void n(org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        LaunchActivity launchActivity = this.f40513a;
        launchActivity.q0(o2Var, z10, false);
        if (AndroidUtilities.isTablet()) {
            launchActivity.m0.U(true, true);
            launchActivity.f35589o0.U(true, true);
        }
    }

    public final void o(String str) {
        AndroidUtilities.scrollToFragmentRow(this.f40513a.O(), str);
    }
}
