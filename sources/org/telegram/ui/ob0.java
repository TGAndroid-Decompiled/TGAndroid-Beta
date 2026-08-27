package org.telegram.ui;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.ActionBarLayout;

public final class ob0 {

    public final LaunchActivity f41050a;

    public final int f41051b;

    public final we.d f41052c;
    public final boolean d;

    public org.telegram.ui.ActionBar.b2 f41053e;

    public boolean f41054f;

    public boolean f41055g;
    public int h = -1;

    public ob0(LaunchActivity launchActivity, int i10, we.d dVar, boolean z10) {
        this.f41050a = launchActivity;
        this.f41051b = i10;
        this.f41052c = dVar;
        this.d = z10;
    }

    public static org.telegram.ui.Components.mc b() {
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        return n2VarU == null ? org.telegram.ui.Components.mc.X() : org.telegram.ui.Components.mc.a0(n2VarU);
    }

    public static boolean l(java.lang.String r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ob0.l(java.lang.String):boolean");
    }

    public final void a() {
        if (this.f41055g) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = this.f41053e;
        if (b2Var != null) {
            b2Var.dismiss();
        }
        we.d dVar = this.f41052c;
        if (dVar != null) {
            dVar.b();
        }
        this.f41055g = true;
    }

    public final org.telegram.ui.ActionBar.b5 c() {
        return this.f41050a.O();
    }

    public final UserConfig d() {
        return UserConfig.getInstance(this.f41051b);
    }

    public final boolean e(Uri uri) {
        ?? r15;
        String scheme;
        String schemeSpecificPart;
        if (uri != null) {
            String scheme2 = uri.getScheme();
            boolean zEqualsIgnoreCase = "tonsite".equalsIgnoreCase(scheme2);
            LaunchActivity launchActivity = this.f41050a;
            if (zEqualsIgnoreCase) {
                we.e.p(launchActivity, uri, true, true);
                return true;
            }
            if ("http".equalsIgnoreCase(scheme2) || "https".equalsIgnoreCase(scheme2)) {
                String host = uri.getHost();
                if (host != null) {
                    Matcher matcher = LaunchActivity.f35496x1.matcher(host.toLowerCase());
                    boolean zFind = matcher.find();
                    if ("telegram.me".equalsIgnoreCase(host) || "t.me".equalsIgnoreCase(host) || "telegram.dog".equalsIgnoreCase(host) || zFind) {
                        if (zFind) {
                            StringBuilder sb2 = new StringBuilder("https://t.me/");
                            sb2.append(matcher.group(1));
                            String str = "";
                            sb2.append(TextUtils.isEmpty(uri.getPath()) ? "" : uri.getPath());
                            if (!TextUtils.isEmpty(uri.getQuery())) {
                                str = "?" + uri.getQuery();
                            }
                            sb2.append(str);
                            uri = Uri.parse(sb2.toString());
                        }
                        String path = uri.getPath();
                        if (path != null && path.length() > 1) {
                            String strSubstring = path.substring(1);
                            List<String> pathSegments = uri.getPathSegments();
                            if (pathSegments != null && !pathSegments.isEmpty()) {
                                String str2 = pathSegments.get(0);
                                String str3 = pathSegments.size() > 1 ? pathSegments.get(1) : null;
                                if ("$".equalsIgnoreCase(str2)) {
                                    return g(strSubstring.substring(1));
                                }
                                if ("invoice".equalsIgnoreCase(str2)) {
                                    return g(str3);
                                }
                                if ("addstyle".equalsIgnoreCase(str2)) {
                                    return f(str3);
                                }
                                if ("oauth".equalsIgnoreCase(str2)) {
                                    return i(uri, uri.getQueryParameter("startapp"));
                                }
                                if ("newbot".equalsIgnoreCase(str2)) {
                                    if (pathSegments.size() >= 2) {
                                        h(str3, pathSegments.size() >= 3 ? pathSegments.get(2) : null, uri.getQueryParameter("name"));
                                        return true;
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
            } else if ("tg".equalsIgnoreCase(scheme2)) {
                if (uri.isOpaque() && (scheme = uri.getScheme()) != null && uri.getAuthority() == null && (schemeSpecificPart = uri.getSchemeSpecificPart()) != null) {
                    uri = Uri.parse(scheme + "://" + schemeSpecificPart);
                }
                List<String> pathSegments2 = uri.getPathSegments();
                if (pathSegments2 != null) {
                    ArrayList arrayList = new ArrayList(pathSegments2);
                    String authority = uri.getAuthority();
                    if (!TextUtils.isEmpty(authority)) {
                        arrayList.add(0, authority);
                    }
                    if (!arrayList.isEmpty()) {
                        String str4 = (String) arrayList.get(0);
                        String str5 = arrayList.size() > 1 ? (String) arrayList.get(1) : null;
                        if ("newbot".equalsIgnoreCase(str4)) {
                            h(uri.getQueryParameter("manager"), uri.getQueryParameter("username"), uri.getQueryParameter("name"));
                            return true;
                        }
                        if ("resolve".equalsIgnoreCase(str4)) {
                            List<String> pathSegments3 = uri.getPathSegments();
                            if (pathSegments3 != null) {
                                ArrayList arrayList2 = new ArrayList(pathSegments3);
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
                        } else {
                            if ("invoice".equalsIgnoreCase(str4)) {
                                return g(uri.getQueryParameter("slug"));
                            }
                            if ("oauth".equalsIgnoreCase(str4)) {
                                return i(uri, uri.getQueryParameter("token"));
                            }
                            if ("settings".equalsIgnoreCase(str4)) {
                                return j(arrayList.subList(1, arrayList.size()));
                            }
                            if ("chats".equalsIgnoreCase(str4)) {
                                "search".equalsIgnoreCase(str5);
                                "edit".equalsIgnoreCase(str5);
                                "emoji-status".equalsIgnoreCase(str5);
                            }
                            if ("new".equalsIgnoreCase(str4)) {
                                if ("group".equalsIgnoreCase(str5)) {
                                    n(new o60(new Bundle()), false);
                                    return true;
                                }
                                if ("contact".equalsIgnoreCase(str5)) {
                                    new oj0(launchActivity, LaunchActivity.U()).show();
                                    return true;
                                }
                                if (!"channel".equalsIgnoreCase(str5)) {
                                    n(new ContactsActivity(a9.p.h("destroyAfterSelect", true)), false);
                                    return true;
                                }
                                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                                if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                                    n(new id(a9.p.g(0, "step")), false);
                                    return true;
                                }
                                n(new h(0), false);
                                globalMainSettings.edit().putBoolean("channel_intro", true).commit();
                                return true;
                            }
                            if ("post".equalsIgnoreCase(str4)) {
                                boolean zEqualsIgnoreCase2 = "video".equalsIgnoreCase(str5);
                                if ("live".equalsIgnoreCase(str5)) {
                                    r15 = zEqualsIgnoreCase2;
                                    r15 = -1;
                                }
                                r15 = zEqualsIgnoreCase2;
                                lh.sb sbVarE = lh.sb.E(launchActivity, this.f41051b);
                                if (sbVarE.K1 != r15) {
                                    sbVarE.K1 = r15;
                                    ?? r10 = sbVarE.M0;
                                    if (r10 != 0) {
                                        r10.a(r15);
                                    }
                                    sbVarE.i0(r15 == 1, true);
                                    lh.z zVar = sbVarE.E0;
                                    if (zVar != null) {
                                        zVar.a(false, true);
                                    }
                                    sbVarE.m0(false);
                                }
                                sbVarE.R(null);
                                return true;
                            }
                            if ("contacts".equalsIgnoreCase(str4)) {
                                if ("new".equalsIgnoreCase(str5)) {
                                    new oj0(launchActivity, LaunchActivity.U()).show();
                                    return true;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("needPhonebook", true);
                                bundle.putBoolean("needFinishFragment", true);
                                n(new ContactsActivity(bundle), false);
                                "search".equalsIgnoreCase(str5);
                                "sort".equalsIgnoreCase(str5);
                                if ("invite".equalsIgnoreCase(str5)) {
                                    o("phonebookRow");
                                    return true;
                                }
                                return true;
                            }
                            if ("addstyle".equalsIgnoreCase(str4)) {
                                return f(uri.getQueryParameter("slug"));
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
        ConnectionsManager.getInstance(this.f41051b).sendRequestTyped(gettone, new org.telegram.messenger.a(), new b5(this, 14));
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
        this.h = ConnectionsManager.getInstance(this.f41051b).sendRequest(tL_payments_getPaymentForm, new z9((Object) this, (TLObject) tL_inputInvoiceSlug, str, 18));
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
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (n2VarU == null || n2VarU.getContext() == null) {
            return;
        }
        k();
        TLRPC.User[] userArr = {null};
        MessagesController.getInstance(this.f41051b).getUserNameResolver().resolve(str, new gh(this, userArr, new org.telegram.ui.Components.l11(this, n2VarU, userArr, tL_requestPeerTypeCreateBot, 10), 3));
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
        ConnectionsManager.getInstance(this.f41051b).sendRequestTyped(tL_messages_requestUrlAuth, new org.telegram.messenger.a(), new cg.u0(22, this, tL_messages_requestUrlAuth));
        return true;
    }

    public final boolean j(List list) {
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.n2 n2VarU;
        qg0 qg0Var;
        ApplicationLoader applicationLoader;
        org.telegram.ui.ActionBar.n2 n2VarOpenSettings;
        if (list == null) {
            return false;
        }
        if (list.isEmpty()) {
            m(new x71());
            return true;
        }
        String str = (String) list.get(0);
        String str2 = list.size() > 1 ? (String) list.get(1) : null;
        String str3 = list.size() > 2 ? (String) list.get(2) : null;
        String str4 = list.size() > 3 ? (String) list.get(3) : null;
        String str5 = list.size() > 4 ? (String) list.get(4) : null;
        if ("theme".equalsIgnoreCase(str) || "themes".equalsIgnoreCase(str)) {
            m(new ThemeActivity(0));
            return true;
        }
        if ("devices".equalsIgnoreCase(str)) {
            SessionsActivity sessionsActivity = new SessionsActivity(0);
            if ("link-desktop".equalsIgnoreCase(str2)) {
                sessionsActivity.l0();
            }
            m(sessionsActivity);
            if ("terminate-sessions".equalsIgnoreCase(str2)) {
                o("terminateAllSessionsRow");
            }
            if ("auto-terminate".equalsIgnoreCase(str2)) {
                o("ttlRow");
                return true;
            }
        } else if ("folders".equalsIgnoreCase(str)) {
            FiltersSetupActivity filtersSetupActivity = new FiltersSetupActivity();
            m(new FiltersSetupActivity());
            if ("create".equalsIgnoreCase(str2)) {
                AndroidUtilities.runOnUIThread(new a30(19, this, filtersSetupActivity), 300L);
            }
            if ("show-tags".equalsIgnoreCase(str2)) {
                o("showTagsRow");
                return true;
            }
        } else {
            if ("change_number".equalsIgnoreCase(str)) {
                n(new h(3), true);
                return true;
            }
            if ("language".equalsIgnoreCase(str)) {
                if ("do-not-translate".equalsIgnoreCase(str2)) {
                    m(new a31());
                    return true;
                }
                m(new LanguageSelectActivity());
                if ("show-button".equalsIgnoreCase(str2)) {
                    o("manualTranslationPosition");
                }
                if ("translate-chats".equalsIgnoreCase(str2)) {
                    o("autoTranslationPosition");
                    return true;
                }
            } else {
                if ("auto_delete".equalsIgnoreCase(str)) {
                    m(new q4());
                    return true;
                }
                if ("phone_privacy".equalsIgnoreCase(str)) {
                    m(new PrivacyControlActivity(6));
                    return true;
                }
                if ("premium_sms".equalsIgnoreCase(str) && (applicationLoader = ApplicationLoader.applicationLoaderInstance) != null && (n2VarOpenSettings = applicationLoader.openSettings(13)) != null) {
                    m(n2VarOpenSettings);
                    return true;
                }
                boolean zEqualsIgnoreCase = "login_email".equalsIgnoreCase(str);
                int i14 = this.f41051b;
                if (zEqualsIgnoreCase) {
                    k();
                    this.h = ConnectionsManager.getInstance(i14).sendRequest(new TL_account.getPassword(), new n(this, 10), 10);
                    return true;
                }
                if ("chats".equalsIgnoreCase(str)) {
                    org.telegram.ui.ActionBar.b5 b5VarC = c();
                    int size = b5VarC.getFragmentStack().size() - 1;
                    while (true) {
                        if (size < 0) {
                            qg0Var = null;
                            break;
                        }
                        if (b5VarC.getFragmentStack().get(size) instanceof qg0) {
                            qg0Var = (qg0) b5VarC.getFragmentStack().get(size);
                            break;
                        }
                        if (size > 0) {
                            ((ActionBarLayout) b5VarC).Y(size);
                        }
                        size++;
                    }
                    if (qg0Var != null && "search".equalsIgnoreCase(str2)) {
                        qg0Var.f42640c.D(2);
                        return true;
                    }
                }
                if ("saved-messages".equalsIgnoreCase(str)) {
                    m(rn.R9(d().getClientUserId()));
                    return true;
                }
                if ("calls".equalsIgnoreCase(str)) {
                    if ("start-call".equalsIgnoreCase(str2)) {
                        m(new lb0(this, a9.p.h("isCall", true)));
                        return true;
                    }
                    m(new j9());
                    return true;
                }
                if ("qr-code".equalsIgnoreCase(str)) {
                    if ("scan".equalsIgnoreCase(str2) && (n2VarU = LaunchActivity.U()) != null) {
                        y11.f0(n2VarU);
                        return true;
                    }
                    if ("share".equalsIgnoreCase(str2)) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", d().getClientUserId());
                        m(new mb0(bundle));
                        return true;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", d().getClientUserId());
                    m(new y11(bundle2));
                    return true;
                }
                if (!"chat".equalsIgnoreCase(str) || !"browser".equalsIgnoreCase(str2)) {
                    String str6 = str5;
                    if ("edit".equalsIgnoreCase(str)) {
                        m(new UserInfoActivity());
                        if ("first-name".equalsIgnoreCase(str2)) {
                            o("firstNameRow");
                        }
                        if ("last-name".equalsIgnoreCase(str2)) {
                            o("lastNameRow");
                        }
                        if ("bio".equalsIgnoreCase(str2)) {
                            o("bioRow");
                        }
                        if ("birthday".equalsIgnoreCase(str2)) {
                            o("birthdayRow");
                        }
                        if ("change-number".equalsIgnoreCase(str2)) {
                            o("numberRow");
                        }
                        if ("username".equalsIgnoreCase(str2)) {
                            o("usernameRow");
                        }
                        if ("channel".equalsIgnoreCase(str2)) {
                            o("channelRow");
                        }
                        if ("add-account".equalsIgnoreCase(str2)) {
                            o("addAccountRow");
                        }
                        if ("log-out".equalsIgnoreCase(str2)) {
                            o("logoutRow");
                            return true;
                        }
                    } else {
                        if ("my-profile".equalsIgnoreCase(str)) {
                            if ("edit".equalsIgnoreCase(str2)) {
                                m(new UserInfoActivity());
                                return true;
                            }
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("user_id", d().getClientUserId());
                            bundle3.putBoolean("my_profile", true);
                            if ("gifts".equalsIgnoreCase(str2)) {
                                bundle3.putBoolean("open_gifts", true);
                            }
                            ProfileActivity profileActivity = new ProfileActivity(bundle3);
                            if ("gifts".equalsIgnoreCase(str2)) {
                                profileActivity.whenFullyVisible(new gb0(profileActivity, 2));
                            }
                            if ("posts".equalsIgnoreCase(str2)) {
                                profileActivity.whenFullyVisible(new gb0(profileActivity, 3));
                            }
                            m(profileActivity);
                            return true;
                        }
                        String str7 = str3;
                        if ("notifications".equalsIgnoreCase(str)) {
                            if (!TextUtils.isEmpty(str7) && ("private-chats".equalsIgnoreCase(str2) || "groups".equalsIgnoreCase(str2) || "channels".equalsIgnoreCase(str2) || "stories".equalsIgnoreCase(str2) || "reactions".equalsIgnoreCase(str2))) {
                                if ("private-chats".equalsIgnoreCase(str2)) {
                                    i13 = 1;
                                } else if ("groups".equalsIgnoreCase(str2)) {
                                    i13 = 0;
                                } else if ("channels".equalsIgnoreCase(str2)) {
                                    i13 = 2;
                                } else if ("stories".equalsIgnoreCase(str2)) {
                                    i13 = 3;
                                } else if ("reactions".equalsIgnoreCase(str2)) {
                                    i13 = 4;
                                } else {
                                    i13 = 0;
                                }
                                NotificationsSettingsActivity notificationsSettingsActivity = new NotificationsSettingsActivity();
                                k();
                                notificationsSettingsActivity.A0(new xs(this, notificationsSettingsActivity, i13, str7, 3));
                                return true;
                            }
                            m(new NotificationsSettingsActivity());
                            if ("accounts".equalsIgnoreCase(str2)) {
                                o("accountsAllRow");
                            }
                            if ("private-chats".equalsIgnoreCase(str2)) {
                                o("privateRow");
                            }
                            if ("groups".equalsIgnoreCase(str2)) {
                                o("groupRow");
                            }
                            if ("channels".equalsIgnoreCase(str2)) {
                                o("channelsRow");
                            }
                            if ("stories".equalsIgnoreCase(str2)) {
                                o("storiesRow");
                            }
                            if ("reactions".equalsIgnoreCase(str2)) {
                                o("reactionsRow");
                            }
                            if ("in-app-sounds".equalsIgnoreCase(str2)) {
                                o("inappSoundRow");
                            }
                            if ("in-app-vibrate".equalsIgnoreCase(str2)) {
                                o("inappVibrateRow");
                            }
                            if ("in-app-preview".equalsIgnoreCase(str2)) {
                                o("inappPreviewRow");
                            }
                            if ("in-chat-sounds".equalsIgnoreCase(str2)) {
                                o("inchatSoundRow");
                            }
                            if ("in-app-popup".equalsIgnoreCase(str2)) {
                                o("inappPriorityRow");
                            }
                            if ("show-badge-icon".equalsIgnoreCase(str2)) {
                                o("badgeNumberShowRow");
                            }
                            if ("include-muted-chats".equalsIgnoreCase(str2)) {
                                o("badgeNumberMutedRow");
                            }
                            if ("count-unread-messages".equalsIgnoreCase(str2)) {
                                o("badgeNumberMessagesRow");
                            }
                            if ("new-contacts".equalsIgnoreCase(str2)) {
                                o("contactJoinedRow");
                            }
                            if ("pinned-messages".equalsIgnoreCase(str2)) {
                                o("pinnedMessageRow");
                            }
                            if ("reset".equalsIgnoreCase(str2)) {
                                o("resetNotificationsRow");
                                return true;
                            }
                        } else if ("privacy".equalsIgnoreCase(str)) {
                            if ("data-settings".equalsIgnoreCase(str2) && "delete-cloud-drafts".equalsIgnoreCase(str7)) {
                                m(new DataSettingsActivity());
                                o("clearDraftsRow");
                                return true;
                            }
                            if (!TextUtils.isEmpty(str7) && "blocked".equalsIgnoreCase(str2)) {
                                m(new cx0());
                                return true;
                            }
                            if (!TextUtils.isEmpty(str7) && "active-websites".equalsIgnoreCase(str2)) {
                                m(new SessionsActivity(1));
                                if ("disconnect-all".equalsIgnoreCase(str7)) {
                                    o("terminateAllSessionsRow");
                                    return true;
                                }
                            } else if (!TextUtils.isEmpty(str7) && "passcode".equalsIgnoreCase(str2)) {
                                jb0 jb0Var = new jb0(this, str7, 1);
                                org.telegram.ui.ActionBar.n2 n2VarB0 = PasscodeActivity.b0();
                                m(n2VarB0);
                                if (n2VarB0 instanceof h) {
                                    ((h) n2VarB0).a0(jb0Var);
                                    return true;
                                }
                                if (n2VarB0 instanceof PasscodeActivity) {
                                    ((PasscodeActivity) n2VarB0).j0(jb0Var);
                                    return true;
                                }
                            } else {
                                if (!TextUtils.isEmpty(str7) && "2sv".equalsIgnoreCase(str2)) {
                                    k();
                                    this.h = ConnectionsManager.getInstance(i14).sendRequest(new TL_account.getPassword(), new v80(2, this, str7), 10);
                                    return true;
                                }
                                if (!TextUtils.isEmpty(str7) && "passkey".equalsIgnoreCase(str2) && Build.VERSION.SDK_INT >= 28) {
                                    k();
                                    this.h = ConnectionsManager.getInstance(i14).sendRequestTyped(new TL_account.getPasskeys(), new kb0(0), new cg.u0(21, this, str7));
                                    return true;
                                }
                                if (!TextUtils.isEmpty(str7) && "auto-delete".equalsIgnoreCase(str2) && d().getGlobalTTl() >= 0) {
                                    m(new q4());
                                    return true;
                                }
                                if (!TextUtils.isEmpty(str7) && ("phone-number".equalsIgnoreCase(str2) || "last-seen".equalsIgnoreCase(str2) || "profile-photos".equalsIgnoreCase(str2) || "bio".equalsIgnoreCase(str2) || "gifts".equalsIgnoreCase(str2) || "birthday".equalsIgnoreCase(str2) || "saved-music".equalsIgnoreCase(str2) || "forwards".equalsIgnoreCase(str2) || "calls".equalsIgnoreCase(str2) || "voice".equalsIgnoreCase(str2) || "messages".equalsIgnoreCase(str2) || "invites".equalsIgnoreCase(str2))) {
                                    if ("phone-number".equalsIgnoreCase(str2)) {
                                        i12 = 6;
                                    } else if ("last-seen".equalsIgnoreCase(str2)) {
                                        i12 = 0;
                                    } else if ("profile-photos".equalsIgnoreCase(str2)) {
                                        i12 = 4;
                                    } else if ("bio".equalsIgnoreCase(str2)) {
                                        i12 = 9;
                                    } else if ("gifts".equalsIgnoreCase(str2)) {
                                        i12 = 12;
                                    } else if ("birthday".equalsIgnoreCase(str2)) {
                                        i12 = 11;
                                    } else if ("saved-music".equalsIgnoreCase(str2)) {
                                        i12 = 14;
                                    } else if ("forwards".equalsIgnoreCase(str2)) {
                                        i12 = 5;
                                    } else if ("calls".equalsIgnoreCase(str2)) {
                                        i12 = "p2p".equalsIgnoreCase(str7) ? 3 : 2;
                                    } else if ("voice".equalsIgnoreCase(str2)) {
                                        i12 = 8;
                                    } else if ("messages".equalsIgnoreCase(str2)) {
                                        i12 = 10;
                                    } else if ("invites".equalsIgnoreCase(str2)) {
                                        i12 = 1;
                                    } else {
                                        i12 = 0;
                                    }
                                    m(new PrivacyControlActivity(i12));
                                    if ("birthday".equalsIgnoreCase(str2) && "add".equalsIgnoreCase(str7)) {
                                        o("setBirthdayRow");
                                    }
                                    if ("always-share".equalsIgnoreCase(str7) || "always-share".equalsIgnoreCase(str4) || "always".equalsIgnoreCase(str7) || "always".equalsIgnoreCase(str4)) {
                                        o("everybodyRow");
                                    }
                                    if ("never-share".equalsIgnoreCase(str7) || "never-share".equalsIgnoreCase(str4) || "never".equalsIgnoreCase(str7) || "never".equalsIgnoreCase(str4)) {
                                        o("nobodyRow");
                                    }
                                    if ("gifts".equalsIgnoreCase(str2) && "show-icon".equalsIgnoreCase(str7)) {
                                        o("showGiftIconRow");
                                    }
                                    if ("gifts".equalsIgnoreCase(str2) && "accepted-types".equalsIgnoreCase(str7)) {
                                        o("giftTypesHeaderRow");
                                    }
                                    if ("messages".equalsIgnoreCase(str2) && "set-price".equalsIgnoreCase(str7)) {
                                        o("priceRow");
                                    }
                                    if ("messages".equalsIgnoreCase(str2) && "remove-fee".equalsIgnoreCase(str7)) {
                                        o("alwaysShareRow");
                                    }
                                    if ("last-seen".equalsIgnoreCase(str2) && "hide-read-time".equalsIgnoreCase(str7)) {
                                        o("readRow");
                                    }
                                    if ("profile-photos".equalsIgnoreCase(str2)) {
                                        if ("set-public".equalsIgnoreCase(str7)) {
                                            o("photoForRestRow");
                                        }
                                        if ("update-public".equalsIgnoreCase(str7)) {
                                            o("photoForRestRow");
                                        }
                                        if ("remove-public".equalsIgnoreCase(str7)) {
                                            o("currentPhotoForRestRow");
                                            return true;
                                        }
                                    }
                                } else if (MessagesController.getInstance(i14).autoarchiveAvailable || !"archive-and-mute".equalsIgnoreCase(str2)) {
                                    m(new PrivacySettingsActivity());
                                    if ("blocked".equalsIgnoreCase(str2)) {
                                        o("blockedRow");
                                    }
                                    if ("active-websites".equalsIgnoreCase(str2)) {
                                        o("webSessionsRow");
                                    }
                                    if ("passcode".equalsIgnoreCase(str2)) {
                                        o("passcodeRow");
                                    }
                                    if ("2sv".equalsIgnoreCase(str2)) {
                                        o("passwordRow");
                                    }
                                    if ("passkey".equalsIgnoreCase(str2)) {
                                        o("passkeysRow");
                                    }
                                    if ("auto-delete".equalsIgnoreCase(str2)) {
                                        o("autoDeleteMesages");
                                    }
                                    if ("login-email".equalsIgnoreCase(str2)) {
                                        o("emailLoginRow");
                                    }
                                    if ("phone-number".equalsIgnoreCase(str2)) {
                                        o("phoneNumberRow");
                                    }
                                    if ("last-seen".equalsIgnoreCase(str2)) {
                                        o("lastSeenRow");
                                    }
                                    if ("profile-photos".equalsIgnoreCase(str2)) {
                                        o("profilePhotoRow");
                                    }
                                    if ("bio".equalsIgnoreCase(str2)) {
                                        o("bioRow");
                                    }
                                    if ("gifts".equalsIgnoreCase(str2)) {
                                        o("giftsRow");
                                    }
                                    if ("birthday".equalsIgnoreCase(str2)) {
                                        o("birthdayRow");
                                    }
                                    if ("saved-music".equalsIgnoreCase(str2)) {
                                        o("musicRow");
                                    }
                                    if ("forwards".equalsIgnoreCase(str2)) {
                                        o("forwardsRow");
                                    }
                                    if ("calls".equalsIgnoreCase(str2)) {
                                        o("callsRow");
                                    }
                                    if ("voice".equalsIgnoreCase(str2)) {
                                        o("voicesRow");
                                    }
                                    if ("messages".equalsIgnoreCase(str2)) {
                                        o("noncontactsRow");
                                    }
                                    if ("invites".equalsIgnoreCase(str2)) {
                                        o("groupsRow");
                                    }
                                    if ("self-destruct".equalsIgnoreCase(str2)) {
                                        o("deleteAccountRow");
                                    }
                                    if ("archive-and-mute".equalsIgnoreCase(str2)) {
                                        o("newChatsRow");
                                    }
                                    if ("data-settings".equalsIgnoreCase(str2)) {
                                        if ("sync-contacts".equalsIgnoreCase(str7)) {
                                            o("contactsSyncRow");
                                        }
                                        if ("delete-synced".equalsIgnoreCase(str7)) {
                                            o("contactsDeleteRow");
                                        }
                                        if ("suggest-contacts".equalsIgnoreCase(str7)) {
                                            o("contactsSuggestRow");
                                        }
                                        if ("clear-payment-info".equalsIgnoreCase(str7)) {
                                            o("paymentsClearRow");
                                        }
                                        if ("link-previews".equalsIgnoreCase(str7)) {
                                            o("secretWebpageRow");
                                        }
                                        if ("map-provider".equalsIgnoreCase(str7)) {
                                            o("secretMapRow");
                                            return true;
                                        }
                                    }
                                }
                            }
                        } else if ("data".equalsIgnoreCase(str)) {
                            if ("storage".equalsIgnoreCase(str2)) {
                                "clear-cache".equalsIgnoreCase(str7);
                                m(new z6());
                                return true;
                            }
                            if ("usage".equalsIgnoreCase(str2)) {
                                ru ruVar = new ru();
                                m(ruVar);
                                if ("mobile".equalsIgnoreCase(str7)) {
                                    ruVar.f42339b.d(1, 1);
                                }
                                if ("wifi".equalsIgnoreCase(str7)) {
                                    ruVar.f42339b.d(2, 2);
                                }
                                if ("roaming".equalsIgnoreCase(str7)) {
                                    ruVar.f42339b.d(3, 3);
                                }
                                if ("reset".equalsIgnoreCase(str7)) {
                                    ruVar.r0();
                                    return true;
                                }
                            } else if ("auto-download".equalsIgnoreCase(str2)) {
                                if ("mobile".equalsIgnoreCase(str7) || "wifi".equalsIgnoreCase(str7) || "roaming".equalsIgnoreCase(str7)) {
                                    if ("mobile".equalsIgnoreCase(str7)) {
                                        i11 = 0;
                                    } else if ("wifi".equalsIgnoreCase(str7)) {
                                        i11 = 1;
                                    } else if ("roaming".equalsIgnoreCase(str7)) {
                                        i11 = 2;
                                    } else {
                                        i11 = 0;
                                    }
                                    m(new DataAutoDownloadActivity(i11));
                                    if ("enable".equalsIgnoreCase(str4)) {
                                        o("autoDownloadRow");
                                    }
                                    if ("usage".equalsIgnoreCase(str4)) {
                                        o("usageProgressRow");
                                    }
                                    if ("photos".equalsIgnoreCase(str4)) {
                                        o("photosRow");
                                    }
                                    if ("stories".equalsIgnoreCase(str4)) {
                                        o("storiesRow");
                                    }
                                    if ("videos".equalsIgnoreCase(str4)) {
                                        o("videosRow");
                                    }
                                    if ("files".equalsIgnoreCase(str4)) {
                                        o("filesRow");
                                        return true;
                                    }
                                } else {
                                    if ("reset".equalsIgnoreCase(str7)) {
                                        m(new DataSettingsActivity());
                                        o("resetDownloadRow");
                                        return true;
                                    }
                                    if (!TextUtils.isEmpty(str4)) {
                                        if (!TextUtils.isEmpty(str7)) {
                                            if ("pause-music".equalsIgnoreCase(str2)) {
                                                m(new ThemeActivity(0));
                                                o("pauseOnMediaRow");
                                                return true;
                                            }
                                            if ("pause-music-on-record".equalsIgnoreCase(str2)) {
                                                m(new ThemeActivity(0));
                                                o("pauseOnRecordRow");
                                                return true;
                                            }
                                            if ("raise-to-listen".equalsIgnoreCase(str2)) {
                                                m(new ThemeActivity(0));
                                                o("raiseToListenRow");
                                                return true;
                                            }
                                            if ("raise-to-speak".equalsIgnoreCase(str2)) {
                                                m(new ThemeActivity(0));
                                                o("raiseToSpeakRow");
                                                return true;
                                            }
                                            if ("show-18-contnet".equalsIgnoreCase(str2)) {
                                                m(new ThemeActivity(0));
                                                o("sensitiveContentRow");
                                                return true;
                                            }
                                            m(new DataSettingsActivity());
                                            if ("save-to-photos".equalsIgnoreCase(str2)) {
                                                if ("chats".equalsIgnoreCase(str7)) {
                                                    o("saveToGalleryPeerRow");
                                                }
                                                if ("groups".equalsIgnoreCase(str7)) {
                                                    o("saveToGalleryGroupsRow");
                                                }
                                                if ("channels".equalsIgnoreCase(str7)) {
                                                    o("saveToGalleryChannelsRow");
                                                }
                                            }
                                            if ("use-less-data".equalsIgnoreCase(str2)) {
                                                o("useLessDataForCallsRow");
                                            }
                                            if ("proxy".equalsIgnoreCase(str2)) {
                                                o("proxyRow");
                                                return true;
                                            }
                                        } else {
                                            if ("pause-music".equalsIgnoreCase(str2)) {
                                                m(new ThemeActivity(0));
                                                o("pauseOnMediaRow");
                                                return true;
                                            }
                                            if ("pause-music-on-record".equalsIgnoreCase(str2)) {
                                                m(new ThemeActivity(0));
                                                o("pauseOnRecordRow");
                                                return true;
                                            }
                                            if ("raise-to-listen".equalsIgnoreCase(str2)) {
                                                m(new ThemeActivity(0));
                                                o("raiseToListenRow");
                                                return true;
                                            }
                                            if ("raise-to-speak".equalsIgnoreCase(str2)) {
                                                m(new ThemeActivity(0));
                                                o("raiseToSpeakRow");
                                                return true;
                                            }
                                            if ("show-18-contnet".equalsIgnoreCase(str2)) {
                                                m(new ThemeActivity(0));
                                                o("sensitiveContentRow");
                                                return true;
                                            }
                                            m(new DataSettingsActivity());
                                            if ("save-to-photos".equalsIgnoreCase(str2)) {
                                                if ("chats".equalsIgnoreCase(str7)) {
                                                    o("saveToGalleryPeerRow");
                                                }
                                                if ("groups".equalsIgnoreCase(str7)) {
                                                    o("saveToGalleryGroupsRow");
                                                }
                                                if ("channels".equalsIgnoreCase(str7)) {
                                                    o("saveToGalleryChannelsRow");
                                                }
                                            }
                                            if ("use-less-data".equalsIgnoreCase(str2)) {
                                                o("useLessDataForCallsRow");
                                            }
                                            if ("proxy".equalsIgnoreCase(str2)) {
                                                o("proxyRow");
                                                return true;
                                            }
                                        }
                                    } else if (!TextUtils.isEmpty(str7)) {
                                        if ("pause-music".equalsIgnoreCase(str2)) {
                                            m(new ThemeActivity(0));
                                            o("pauseOnMediaRow");
                                            return true;
                                        }
                                        if ("pause-music-on-record".equalsIgnoreCase(str2)) {
                                            m(new ThemeActivity(0));
                                            o("pauseOnRecordRow");
                                            return true;
                                        }
                                        if ("raise-to-listen".equalsIgnoreCase(str2)) {
                                            m(new ThemeActivity(0));
                                            o("raiseToListenRow");
                                            return true;
                                        }
                                        if ("raise-to-speak".equalsIgnoreCase(str2)) {
                                            m(new ThemeActivity(0));
                                            o("raiseToSpeakRow");
                                            return true;
                                        }
                                        if ("show-18-contnet".equalsIgnoreCase(str2)) {
                                            m(new ThemeActivity(0));
                                            o("sensitiveContentRow");
                                            return true;
                                        }
                                        m(new DataSettingsActivity());
                                        if ("save-to-photos".equalsIgnoreCase(str2)) {
                                            if ("chats".equalsIgnoreCase(str7)) {
                                                o("saveToGalleryPeerRow");
                                            }
                                            if ("groups".equalsIgnoreCase(str7)) {
                                                o("saveToGalleryGroupsRow");
                                            }
                                            if ("channels".equalsIgnoreCase(str7)) {
                                                o("saveToGalleryChannelsRow");
                                            }
                                        }
                                        if ("use-less-data".equalsIgnoreCase(str2)) {
                                            o("useLessDataForCallsRow");
                                        }
                                        if ("proxy".equalsIgnoreCase(str2)) {
                                            o("proxyRow");
                                            return true;
                                        }
                                    } else {
                                        if ("pause-music".equalsIgnoreCase(str2)) {
                                            m(new ThemeActivity(0));
                                            o("pauseOnMediaRow");
                                            return true;
                                        }
                                        if ("pause-music-on-record".equalsIgnoreCase(str2)) {
                                            m(new ThemeActivity(0));
                                            o("pauseOnRecordRow");
                                            return true;
                                        }
                                        if ("raise-to-listen".equalsIgnoreCase(str2)) {
                                            m(new ThemeActivity(0));
                                            o("raiseToListenRow");
                                            return true;
                                        }
                                        if ("raise-to-speak".equalsIgnoreCase(str2)) {
                                            m(new ThemeActivity(0));
                                            o("raiseToSpeakRow");
                                            return true;
                                        }
                                        if ("show-18-contnet".equalsIgnoreCase(str2)) {
                                            m(new ThemeActivity(0));
                                            o("sensitiveContentRow");
                                            return true;
                                        }
                                        m(new DataSettingsActivity());
                                        if ("save-to-photos".equalsIgnoreCase(str2)) {
                                            if ("chats".equalsIgnoreCase(str7)) {
                                                o("saveToGalleryPeerRow");
                                            }
                                            if ("groups".equalsIgnoreCase(str7)) {
                                                o("saveToGalleryGroupsRow");
                                            }
                                            if ("channels".equalsIgnoreCase(str7)) {
                                                o("saveToGalleryChannelsRow");
                                            }
                                        }
                                        if ("use-less-data".equalsIgnoreCase(str2)) {
                                            o("useLessDataForCallsRow");
                                        }
                                        if ("proxy".equalsIgnoreCase(str2)) {
                                            o("proxyRow");
                                            return true;
                                        }
                                    }
                                }
                            } else if (!TextUtils.isEmpty(str4) && "save-to-photos".equalsIgnoreCase(str2)) {
                                if ("groups".equalsIgnoreCase(str7)) {
                                    i10 = 2;
                                } else {
                                    i10 = "channels".equalsIgnoreCase(str7) ? 4 : 1;
                                }
                                m(new SaveToGallerySettingsActivity(a9.p.g(i10, "type")));
                                if ("max-video-size".equalsIgnoreCase(str4)) {
                                    o("maxVideoSizeRow");
                                }
                                if ("add-exception".equalsIgnoreCase(str4)) {
                                    o("addExceptionRow");
                                }
                                if ("delete-all".equalsIgnoreCase(str4)) {
                                    o("deleteAllExceptionsRow");
                                    return true;
                                }
                            } else if (!TextUtils.isEmpty(str7) && "proxy".equalsIgnoreCase(str2)) {
                                m(new ProxyListActivity());
                                if ("use-proxy".equalsIgnoreCase(str7)) {
                                    o("useProxyRow");
                                }
                                if ("add-proxy".equalsIgnoreCase(str7)) {
                                    o("proxyAddRow");
                                }
                                if ("use-for-calls".equalsIgnoreCase(str7)) {
                                    o("callsRow");
                                    return true;
                                }
                            } else {
                                if ("pause-music".equalsIgnoreCase(str2)) {
                                    m(new ThemeActivity(0));
                                    o("pauseOnMediaRow");
                                    return true;
                                }
                                if ("pause-music-on-record".equalsIgnoreCase(str2)) {
                                    m(new ThemeActivity(0));
                                    o("pauseOnRecordRow");
                                    return true;
                                }
                                if ("raise-to-listen".equalsIgnoreCase(str2)) {
                                    m(new ThemeActivity(0));
                                    o("raiseToListenRow");
                                    return true;
                                }
                                if ("raise-to-speak".equalsIgnoreCase(str2)) {
                                    m(new ThemeActivity(0));
                                    o("raiseToSpeakRow");
                                    return true;
                                }
                                if ("show-18-contnet".equalsIgnoreCase(str2)) {
                                    m(new ThemeActivity(0));
                                    o("sensitiveContentRow");
                                    return true;
                                }
                                m(new DataSettingsActivity());
                                if ("save-to-photos".equalsIgnoreCase(str2)) {
                                    if ("chats".equalsIgnoreCase(str7)) {
                                        o("saveToGalleryPeerRow");
                                    }
                                    if ("groups".equalsIgnoreCase(str7)) {
                                        o("saveToGalleryGroupsRow");
                                    }
                                    if ("channels".equalsIgnoreCase(str7)) {
                                        o("saveToGalleryChannelsRow");
                                    }
                                }
                                if ("use-less-data".equalsIgnoreCase(str2)) {
                                    o("useLessDataForCallsRow");
                                }
                                if ("proxy".equalsIgnoreCase(str2)) {
                                    o("proxyRow");
                                    return true;
                                }
                            }
                        } else if ("appearance".equalsIgnoreCase(str)) {
                            if ("themes".equalsIgnoreCase(str2) || "theme".equalsIgnoreCase(str2)) {
                                m(new ThemeActivity(3));
                                if ("create".equalsIgnoreCase(str7)) {
                                    o("createNewThemeRow");
                                    return true;
                                }
                            } else if (!TextUtils.isEmpty(str7) && ("wallpaper".equalsIgnoreCase(str2) || "wallpapers".equalsIgnoreCase(str2))) {
                                m(new WallpapersListActivity(0));
                                if ("set".equalsIgnoreCase(str7) || "choose-photo".equalsIgnoreCase(str7)) {
                                    o("uploadImageRow");
                                    return true;
                                }
                            } else {
                                if (!TextUtils.isEmpty(str7) && ("your-color".equalsIgnoreCase(str2) || "color".equalsIgnoreCase(str2))) {
                                    m(new ap0());
                                    return true;
                                }
                                if (TextUtils.isEmpty(str7) || !"stickers-and-emoji".equalsIgnoreCase(str2)) {
                                    m(new ThemeActivity(0));
                                    if ("wallpaper".equalsIgnoreCase(str2) || "wallpapers".equalsIgnoreCase(str2)) {
                                        o("backgroundRow");
                                    }
                                    if ("your-color".equalsIgnoreCase(str2) || "color".equalsIgnoreCase(str2)) {
                                        o("changeUserColor");
                                    }
                                    if ("auto-night-mode".equalsIgnoreCase(str2)) {
                                        o("nightThemeRow");
                                    }
                                    if ("text-size".equalsIgnoreCase(str2)) {
                                        o("textSizeRow");
                                    }
                                    if ("message-corners".equalsIgnoreCase(str2)) {
                                        o("bubbleRadiusRow");
                                    }
                                    if ("animations".equalsIgnoreCase(str2)) {
                                        o("liteModeRow");
                                    }
                                    if ("stickers-and-emoji".equalsIgnoreCase(str2)) {
                                        o("stickersRow");
                                    }
                                    if ("app-icon".equalsIgnoreCase(str2)) {
                                        o("appIconSelectorRow");
                                    }
                                    if ("tap-for-next-media".equalsIgnoreCase(str2)) {
                                        o("nextMediaTapRow");
                                        return true;
                                    }
                                } else {
                                    if (!TextUtils.isEmpty(str4) && "archived".equalsIgnoreCase(str7)) {
                                        m(new q(0));
                                        return true;
                                    }
                                    if (!"emoji".equalsIgnoreCase(str7) || TextUtils.isEmpty(str4) || "large".equalsIgnoreCase(str4) || "dynamic-order".equalsIgnoreCase(str4)) {
                                        m(new StickersActivity(0, null));
                                        if ("trending".equalsIgnoreCase(str7)) {
                                            o("featuredRow");
                                        }
                                        if ("archived".equalsIgnoreCase(str7)) {
                                            o("archivedRow");
                                        }
                                        if ("emoji".equalsIgnoreCase(str7) && "large".equalsIgnoreCase(str4)) {
                                            o("largeEmojiRow");
                                            return true;
                                        }
                                        if ("emoji".equalsIgnoreCase(str7) && "dynamic-order".equalsIgnoreCase(str4)) {
                                            o("dynamicPackOrder");
                                            return true;
                                        }
                                        if ("emoji".equalsIgnoreCase(str7)) {
                                            o("emojiPacksRow");
                                            return true;
                                        }
                                    } else {
                                        if (!TextUtils.isEmpty(str6) && "archived".equalsIgnoreCase(str4)) {
                                            m(new q(5));
                                            return true;
                                        }
                                        m(new StickersActivity(5, null));
                                        if ("suggest".equalsIgnoreCase(str4)) {
                                            o("suggestRow");
                                            return true;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (!"power-saving".equalsIgnoreCase(str)) {
                                boolean zEqualsIgnoreCase2 = "stars".equalsIgnoreCase(str);
                                LaunchActivity launchActivity = this.f41050a;
                                if (zEqualsIgnoreCase2) {
                                    if ("top-up".equalsIgnoreCase(str2)) {
                                        new hh.fa(launchActivity, null).show();
                                        return true;
                                    }
                                    if ("stats".equalsIgnoreCase(str2)) {
                                        m(new hh.r(0, d().getClientUserId()));
                                        return true;
                                    }
                                    if ("gift".equalsIgnoreCase(str2)) {
                                        hh.u7.w(i14).u();
                                        cg.y2.e0(1, BirthdayController.getInstance(i14).getState());
                                        return true;
                                    }
                                    if ("earn".equalsIgnoreCase(str2)) {
                                        m(new nh.s3(d().getClientUserId()));
                                        return true;
                                    }
                                    m(new hh.oa());
                                    return true;
                                }
                                if ("premium".equalsIgnoreCase(str)) {
                                    m(new PremiumPreviewFragment());
                                    return true;
                                }
                                if ("business".equalsIgnoreCase(str)) {
                                    m(new PremiumPreviewFragment(1, "link"));
                                    if (!"do-not-hide-ads".equalsIgnoreCase(str2)) {
                                        return true;
                                    }
                                    o("showAdsRow");
                                    return true;
                                }
                                if ("ton".equalsIgnoreCase(str)) {
                                    m(new mh.g());
                                    return true;
                                }
                                if ("send-gift".equalsIgnoreCase(str)) {
                                    if ("self".equalsIgnoreCase(str2)) {
                                        new gh.k2(launchActivity, this.f41051b, d().getClientUserId(), null, null).show();
                                        return true;
                                    }
                                    cg.y2.e0(0, BirthdayController.getInstance(i14).getState());
                                    return true;
                                }
                                if ("ask-question".equalsIgnoreCase(str) || "ask-a-question".equalsIgnoreCase(str)) {
                                    org.telegram.ui.Components.y4.U(LaunchActivity.U(), null).show();
                                    return true;
                                }
                                if ("faq".equalsIgnoreCase(str)) {
                                    we.e.s(launchActivity, LocaleController.getString(R.string.TelegramFaqUrl));
                                    return true;
                                }
                                if ("features".equalsIgnoreCase(str)) {
                                    we.e.s(launchActivity, LocaleController.getString(R.string.TelegramFeaturesUrl));
                                    return true;
                                }
                                if ("privacy-policy".equalsIgnoreCase(str)) {
                                    we.e.s(launchActivity, LocaleController.getString(R.string.PrivacyPolicyUrl));
                                    return true;
                                }
                                m(new x71());
                                return true;
                            }
                            xb0 xb0Var = new xb0();
                            m(xb0Var);
                            if ("videos".equalsIgnoreCase(str2)) {
                                xb0Var.V(1024);
                            }
                            if ("gifs".equalsIgnoreCase(str2)) {
                                xb0Var.V(2048);
                            }
                            if ("stickers".equalsIgnoreCase(str2)) {
                                xb0Var.V(3);
                            }
                            if ("emoji".equalsIgnoreCase(str2)) {
                                xb0Var.V(28700);
                            }
                            if ("effects".equalsIgnoreCase(str2)) {
                                xb0Var.V(360928);
                            }
                            if ("call-animations".equalsIgnoreCase(str2)) {
                                xb0Var.V(512);
                            }
                            if ("particles".equalsIgnoreCase(str2)) {
                                xb0Var.V(131072);
                            }
                            if ("transitions".equalsIgnoreCase(str2)) {
                                int i15 = 0;
                                while (true) {
                                    ArrayList arrayList = xb0Var.f44379s;
                                    if (i15 >= arrayList.size()) {
                                        break;
                                    }
                                    if (((rb0) arrayList.get(i15)).f41895f == 1) {
                                        xb0Var.f44373b.e1(new cg.p2(xb0Var, i15, 11), 700, true);
                                        return true;
                                    }
                                    i15++;
                                }
                            }
                        }
                    }
                    return true;
                }
                if (TextUtils.isEmpty(str3)) {
                    m(new ThemeActivity(0));
                    o("browserRow");
                    return true;
                }
                m(new org.telegram.ui.web.v1(null));
                if ("enable-browser".equalsIgnoreCase(str3)) {
                    o("enableRow");
                }
                if ("clear-cookies".equalsIgnoreCase(str3)) {
                    o("clearCookiesRow");
                }
                if ("clear-cache".equalsIgnoreCase(str3)) {
                    o("clearCacheRow");
                }
                if ("history".equalsIgnoreCase(str3)) {
                    o("historyRow");
                }
                if ("clear-history".equalsIgnoreCase(str3)) {
                    o("clearHistoryRow");
                }
                if ("never-open".equalsIgnoreCase(str3)) {
                    o("neverOpenRow");
                }
                if ("clear-list".equalsIgnoreCase(str3)) {
                    o("clearListRow");
                }
                if ("search".equalsIgnoreCase(str3)) {
                    o("searchRow");
                    return true;
                }
            }
        }
        return true;
    }

    public final void k() {
        if (this.f41054f || this.f41055g) {
            return;
        }
        we.d dVar = this.f41052c;
        if (dVar == null) {
            if (this.f41053e == null) {
                this.f41053e = new org.telegram.ui.ActionBar.b2(this.f41050a, 3, null);
            }
            this.f41053e.setOnCancelListener(new fg(this, 3));
            this.f41053e.q(300L);
        } else {
            dVar.f49293b = new hb0(this, 0);
            dVar.d();
        }
        this.f41054f = true;
    }

    public final void m(org.telegram.ui.ActionBar.n2 n2Var) {
        n(n2Var, false);
    }

    public final void n(org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        LaunchActivity launchActivity = this.f41050a;
        launchActivity.q0(n2Var, z10, false);
        if (AndroidUtilities.isTablet()) {
            launchActivity.m0.U(true, true);
            launchActivity.f35525o0.U(true, true);
        }
    }

    public final void o(String str) {
        AndroidUtilities.scrollToFragmentRow(this.f41050a.O(), str);
    }
}
