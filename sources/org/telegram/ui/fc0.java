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
public final class fc0 {
    public final LaunchActivity f36367a;
    public final int f36368b;
    public final of.e f36369c;
    public final boolean d;
    public org.telegram.ui.ActionBar.b2 f36370e;
    public boolean f36371f;
    public boolean f36372g;
    public int h = -1;

    public fc0(LaunchActivity launchActivity, int i10, of.e eVar, boolean z10) {
        this.f36367a = launchActivity;
        this.f36368b = i10;
        this.f36369c = eVar;
        this.d = z10;
    }

    public static org.telegram.ui.Components.yc b() {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return org.telegram.ui.Components.yc.X();
        }
        return org.telegram.ui.Components.yc.a0(U);
    }

    public static boolean l(java.lang.String r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fc0.l(java.lang.String):boolean");
    }

    public final void a() {
        if (this.f36372g) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = this.f36370e;
        if (b2Var != null) {
            b2Var.dismiss();
        }
        of.e eVar = this.f36369c;
        if (eVar != null) {
            eVar.b();
        }
        this.f36372g = true;
    }

    public final org.telegram.ui.ActionBar.d5 c() {
        return this.f36367a.O();
    }

    public final UserConfig d() {
        return UserConfig.getInstance(this.f36368b);
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
            LaunchActivity launchActivity = this.f36367a;
            if (equalsIgnoreCase) {
                of.f.p(launchActivity, uri, true, true);
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
                                        n(new f70(new Bundle()), false);
                                        return true;
                                    } else if ("contact".equalsIgnoreCase(str2)) {
                                        new ek0(launchActivity, LaunchActivity.U()).show();
                                        return true;
                                    } else if ("channel".equalsIgnoreCase(str2)) {
                                        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                                        if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                                            n(new md(org.telegram.ui.Cells.p6.e(0, "step")), false);
                                            return true;
                                        }
                                        n(new h(0), false);
                                        globalMainSettings.edit().putBoolean("channel_intro", true).commit();
                                        return true;
                                    } else {
                                        n(new ContactsActivity(a4.a.i("destroyAfterSelect", true)), false);
                                        return true;
                                    }
                                } else if ("post".equalsIgnoreCase(str4)) {
                                    ?? r15 = "video".equalsIgnoreCase(str2);
                                    if ("live".equalsIgnoreCase(str2)) {
                                        r15 = -1;
                                    }
                                    di.pc E = di.pc.E(launchActivity, this.f36368b);
                                    if (E.O1 != r15) {
                                        E.O1 = r15;
                                        ?? r22 = E.Q0;
                                        if (r22 != 0) {
                                            r22.a(r15);
                                        }
                                        if (r15 == 1) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        E.i0(z10, true);
                                        di.y yVar = E.I0;
                                        if (yVar != null) {
                                            yVar.a(false, true);
                                        }
                                        E.m0(false);
                                    }
                                    E.R(null);
                                    return true;
                                } else if ("contacts".equalsIgnoreCase(str4)) {
                                    if ("new".equalsIgnoreCase(str2)) {
                                        new ek0(launchActivity, LaunchActivity.U()).show();
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
                    Matcher matcher = LaunchActivity.B1.matcher(host.toLowerCase());
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
        ConnectionsManager.getInstance(this.f36368b).sendRequestTyped(gettone, new Object(), new b5(this, 14));
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
        this.h = ConnectionsManager.getInstance(this.f36368b).sendRequest(tL_payments_getPaymentForm, new aa((Object) this, (TLObject) tL_inputInvoiceSlug, str, 18));
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
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null && U.getContext() != null) {
            k();
            TLRPC.User[] userArr = {null};
            MessagesController.getInstance(this.f36368b).getUserNameResolver().resolve(str, new qh(this, userArr, new org.telegram.ui.Components.in0(this, U, userArr, tL_requestPeerTypeCreateBot, 15), 3));
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
        ConnectionsManager.getInstance(this.f36368b).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new bi.f0(16, this, tL_messages_requestUrlAuth));
        return true;
    }

    public final boolean j(java.util.List r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fc0.j(java.util.List):boolean");
    }

    public final void k() {
        if (!this.f36371f && !this.f36372g) {
            of.e eVar = this.f36369c;
            if (eVar == null) {
                if (this.f36370e == null) {
                    this.f36370e = new org.telegram.ui.ActionBar.b2(this.f36367a, 3, null);
                }
                this.f36370e.setOnCancelListener(new pg(this, 3));
                this.f36370e.q(300L);
            } else {
                eVar.f17004b = new zb0(this, 0);
                eVar.d();
            }
            this.f36371f = true;
        }
    }

    public final void m(org.telegram.ui.ActionBar.n2 n2Var) {
        n(n2Var, false);
    }

    public final void n(org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        LaunchActivity launchActivity = this.f36367a;
        launchActivity.q0(n2Var, z10, false);
        if (AndroidUtilities.isTablet()) {
            launchActivity.f33453q0.U(true, true);
            launchActivity.f33457s0.U(true, true);
        }
    }

    public final void o(String str) {
        AndroidUtilities.scrollToFragmentRow(this.f36367a.O(), str);
    }
}
