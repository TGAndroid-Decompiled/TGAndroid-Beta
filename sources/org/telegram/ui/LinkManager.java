package org.telegram.ui;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.CollageLayoutButton;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;
import org.telegram.ui.web.WebBrowserSettings;

public final class LinkManager {
    public final LaunchActivity activity;
    public final int currentAccount;
    public int currentRequestId = -1;
    public boolean done;
    public boolean inited;
    public final boolean isExternalIntent;
    public final Browser.Progress progress;
    public AlertDialog progressDialog;

    public final class AnonymousClass1 extends GroupCreateActivity {
        public AnonymousClass1(Bundle bundle) {
            super(bundle);
        }

        public final void lambda$onCallUsersSelected$2(TLObject tLObject, HashSet hashSet, TLRPC.TL_error tL_error) {
            int i = 0;
            if (!(tLObject instanceof TLRPC.Updates)) {
                if (!(tLObject instanceof TL_phone.groupCall)) {
                    if (tL_error != null) {
                        LinkManager.this.getClass();
                        LinkManager.getBulletinFactory().showForError(false, tL_error);
                        return;
                    }
                    return;
                }
                TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                MessagesController.getInstance(this.currentAccount).putUsers(groupcall.users, false);
                MessagesController.getInstance(this.currentAccount).putChats(groupcall.chats, false);
                if (LaunchActivity.instance == null) {
                    return;
                }
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                TLRPC.GroupCall groupCall = groupcall.call;
                tL_inputGroupCall.id = groupCall.id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                VoIPHelper.joinConference(LaunchActivity.instance, this.currentAccount, tL_inputGroupCall, false, groupCall, hashSet);
                return;
            }
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(updates.chats, false);
            ArrayList arrayListFindUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
            int size = arrayListFindUpdatesAndRemove.size();
            TLRPC.GroupCall groupCall2 = null;
            while (i < size) {
                Object obj = arrayListFindUpdatesAndRemove.get(i);
                i++;
                groupCall2 = ((TL_update.TL_updateGroupCall) obj).call;
            }
            if (LaunchActivity.instance == null || groupCall2 == null) {
                return;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
            tL_inputGroupCall2.id = groupCall2.id;
            tL_inputGroupCall2.access_hash = groupCall2.access_hash;
            VoIPHelper.joinConference(LaunchActivity.instance, this.currentAccount, tL_inputGroupCall2, false, groupCall2, hashSet);
        }

        @Override
        public final void onCallUsersSelected(HashSet hashSet) {
            if (hashSet.size() == 1) {
                TLRPC.User user = getMessagesController().getUser((Long) hashSet.iterator().next());
                TLRPC.UserFull userFull = getMessagesController().getUserFull(user.id);
                if (userFull == null) {
                    TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                    tL_users_getFullUser.id = getMessagesController().getInputUser(user.id);
                    getConnectionsManager().sendRequest(tL_users_getFullUser, new LinkManager$$ExternalSyntheticLambda8(24, this, user));
                    return;
                }
                VoIPHelper.startCall(user, false, userFull.video_calls_available, getParentActivity(), userFull, getAccountInstance());
            } else {
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new LinkManager$$ExternalSyntheticLambda8(25, this, hashSet));
            }
            finishFragment();
        }
    }

    public LinkManager(LaunchActivity launchActivity, int i, Browser.Progress progress, boolean z) {
        this.activity = launchActivity;
        this.currentAccount = i;
        this.progress = progress;
        this.isExternalIntent = z;
    }

    public static BulletinFactory getBulletinFactory() {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        return safeLastFragment == null ? BulletinFactory.global() : BulletinFactory.of(safeLastFragment);
    }

    public static boolean isWebAppLink(String str) {
        String path;
        byte b;
        if (str == null) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (scheme == null || (path = uri.getPath()) == null) {
                return false;
            }
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3699) {
                if (iHashCode != 3213448) {
                    if (iHashCode == 99617003 && scheme.equals("https")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (scheme.equals("http")) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (scheme.equals("tg")) {
                b = 2;
            } else {
                b = -1;
            }
            if (b == 0 || b == 1) {
                if (path.isEmpty()) {
                    return false;
                }
                String lowerCase = uri.getHost().toLowerCase();
                boolean zFind = LaunchActivity.PREFIX_T_ME_PATTERN.matcher(lowerCase).find();
                if (lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog") || zFind) {
                    ArrayList arrayList = new ArrayList(uri.getPathSegments());
                    if (arrayList.size() > 0 && ((String) arrayList.get(0)).equals("s")) {
                        arrayList.remove(0);
                    }
                    if (arrayList.size() <= 0 || (arrayList.size() >= 3 && "s".equals(arrayList.get(1)))) {
                        return false;
                    }
                    if (arrayList.size() > 1) {
                        String str2 = (String) arrayList.get(0);
                        if (TextUtils.isEmpty(str2)) {
                            return false;
                        }
                        switch (str2) {
                            case "joinchat":
                            case "login":
                            case "addstickers":
                            case "addemoji":
                            case "msg":
                            case "share":
                            case "confirmphone":
                            case "setlanguage":
                            case "addtheme":
                            case "boost":
                            case "c":
                            case "contact":
                            case "folder":
                            case "addlist":
                                return false;
                            default:
                                String str3 = (String) arrayList.get(1);
                                return (TextUtils.isEmpty(str3) || str3.matches("^\\d+$")) ? false : true;
                        }
                    }
                    if (arrayList.size() == 1) {
                        return !TextUtils.isEmpty(uri.getQueryParameter("startapp"));
                    }
                }
            } else if (b == 2 && (str.startsWith("tg:resolve") || str.startsWith("tg://resolve"))) {
                return !TextUtils.isEmpty(uri.getQueryParameter("appname"));
            }
            return false;
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void done() {
        if (this.done) {
            return;
        }
        AlertDialog alertDialog = this.progressDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        Browser.Progress progress = this.progress;
        if (progress != null) {
            progress.end();
        }
        this.done = true;
    }

    public final INavigationLayout getParentLayout() {
        return this.activity.getActionBarLayout();
    }

    public final UserConfig getUserConfig() {
        return UserConfig.getInstance(this.currentAccount);
    }

    public final boolean handle(Uri uri) {
        ?? r15;
        String scheme;
        String schemeSpecificPart;
        if (uri != null) {
            String scheme2 = uri.getScheme();
            boolean zEqualsIgnoreCase = "tonsite".equalsIgnoreCase(scheme2);
            LaunchActivity launchActivity = this.activity;
            if (zEqualsIgnoreCase) {
                Browser.openUrl(launchActivity, uri, true, true);
                return true;
            }
            if ("http".equalsIgnoreCase(scheme2) || "https".equalsIgnoreCase(scheme2)) {
                String host = uri.getHost();
                if (host != null) {
                    Matcher matcher = LaunchActivity.PREFIX_T_ME_PATTERN.matcher(host.toLowerCase());
                    boolean zFind = matcher.find();
                    if ("telegram.me".equalsIgnoreCase(host) || "t.me".equalsIgnoreCase(host) || "telegram.dog".equalsIgnoreCase(host) || zFind) {
                        if (zFind) {
                            StringBuilder sb = new StringBuilder("https://t.me/");
                            sb.append(matcher.group(1));
                            String str = "";
                            sb.append(TextUtils.isEmpty(uri.getPath()) ? "" : uri.getPath());
                            if (!TextUtils.isEmpty(uri.getQuery())) {
                                str = "?" + uri.getQuery();
                            }
                            sb.append(str);
                            uri = Uri.parse(sb.toString());
                        }
                        String path = uri.getPath();
                        if (path != null && path.length() > 1) {
                            String strSubstring = path.substring(1);
                            List<String> pathSegments = uri.getPathSegments();
                            if (pathSegments != null && !pathSegments.isEmpty()) {
                                String str2 = pathSegments.get(0);
                                String str3 = pathSegments.size() > 1 ? pathSegments.get(1) : null;
                                if ("$".equalsIgnoreCase(str2)) {
                                    return handleInvoiceSlug(strSubstring.substring(1));
                                }
                                if ("invoice".equalsIgnoreCase(str2)) {
                                    return handleInvoiceSlug(str3);
                                }
                                if ("addstyle".equalsIgnoreCase(str2)) {
                                    return handleAiStyle(str3);
                                }
                                if ("oauth".equalsIgnoreCase(str2)) {
                                    return handleOAuth(uri, uri.getQueryParameter("startapp"));
                                }
                                if ("newbot".equalsIgnoreCase(str2)) {
                                    if (pathSegments.size() >= 2) {
                                        handleNewBot(str3, pathSegments.size() >= 3 ? pathSegments.get(2) : null, uri.getQueryParameter("name"));
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
                            handleNewBot(uri.getQueryParameter("manager"), uri.getQueryParameter("username"), uri.getQueryParameter("name"));
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
                                        return handleOAuth(uri, queryParameter2);
                                    }
                                }
                            }
                        } else {
                            if ("invoice".equalsIgnoreCase(str4)) {
                                return handleInvoiceSlug(uri.getQueryParameter("slug"));
                            }
                            if ("oauth".equalsIgnoreCase(str4)) {
                                return handleOAuth(uri, uri.getQueryParameter("token"));
                            }
                            if ("settings".equalsIgnoreCase(str4)) {
                                return handleSettings(arrayList.subList(1, arrayList.size()));
                            }
                            if ("chats".equalsIgnoreCase(str4)) {
                                "search".equalsIgnoreCase(str5);
                                "edit".equalsIgnoreCase(str5);
                                "emoji-status".equalsIgnoreCase(str5);
                            }
                            if ("new".equalsIgnoreCase(str4)) {
                                if ("group".equalsIgnoreCase(str5)) {
                                    presentFragment(new GroupCreateActivity(new Bundle()), false);
                                    return true;
                                }
                                if ("contact".equalsIgnoreCase(str5)) {
                                    new NewContactBottomSheet(launchActivity, LaunchActivity.getSafeLastFragment()).show();
                                    return true;
                                }
                                if (!"channel".equalsIgnoreCase(str5)) {
                                    presentFragment(new ContactsActivity(zzkw.m("destroyAfterSelect", true)), false);
                                    return true;
                                }
                                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                                if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                                    presentFragment(new ChannelCreateActivity(NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(0, "step")), false);
                                    return true;
                                }
                                presentFragment(new ActionIntroActivity(0), false);
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
                                StoryRecorder storyRecorder = StoryRecorder.getInstance(launchActivity, this.currentAccount);
                                if (storyRecorder.mode != r15) {
                                    storyRecorder.mode = r15;
                                    ?? r2 = storyRecorder.modeSwitcherView;
                                    if (r2 != 0) {
                                        r2.switchMode(r15);
                                    }
                                    storyRecorder.showVideoTimer(r15 == 1, true);
                                    CollageLayoutButton.CollageLayoutListView collageLayoutListView = storyRecorder.collageListView;
                                    if (collageLayoutListView != null) {
                                        collageLayoutListView.setVisible(false, true);
                                    }
                                    storyRecorder.updateActionBarButtons(false);
                                }
                                storyRecorder.open(null);
                                return true;
                            }
                            if ("contacts".equalsIgnoreCase(str4)) {
                                if ("new".equalsIgnoreCase(str5)) {
                                    new NewContactBottomSheet(launchActivity, LaunchActivity.getSafeLastFragment()).show();
                                    return true;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("needPhonebook", true);
                                bundle.putBoolean("needFinishFragment", true);
                                presentFragment(new ContactsActivity(bundle), false);
                                "search".equalsIgnoreCase(str5);
                                "sort".equalsIgnoreCase(str5);
                                if ("invite".equalsIgnoreCase(str5)) {
                                    scrollTo("phonebookRow");
                                    return true;
                                }
                                return true;
                            }
                            if ("addstyle".equalsIgnoreCase(str4)) {
                                return handleAiStyle(uri.getQueryParameter("slug"));
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean handleAiStyle(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        TL_aicompose.getTone gettone = new TL_aicompose.getTone();
        TL_aicompose.inputAiComposeToneSlug inputaicomposetoneslug = new TL_aicompose.inputAiComposeToneSlug();
        inputaicomposetoneslug.slug = str;
        gettone.tone = inputaicomposetoneslug;
        init();
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(gettone, new AiTonesController$$ExternalSyntheticLambda0(), new LinkManager$$ExternalSyntheticLambda1(this, 0));
        return true;
    }

    public final boolean handleInvoiceSlug(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        init();
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
        tL_inputInvoiceSlug.slug = str;
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
        this.currentRequestId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new LinkManager$$ExternalSyntheticLambda0(this, tL_inputInvoiceSlug, str, 0));
        return true;
    }

    public final void handleNewBot(String str, String str2, String str3) {
        int i = 0;
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
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null || safeLastFragment.getContext() == null) {
            return;
        }
        init();
        TLRPC.User[] userArr = {null};
        MessagesController.getInstance(this.currentAccount).getUserNameResolver().resolve(str, new LinkManager$$ExternalSyntheticLambda13(this, userArr, new LinkManager$$ExternalSyntheticLambda12(this, safeLastFragment, userArr, tL_requestPeerTypeCreateBot, 0), i));
    }

    public final boolean handleOAuth(Uri uri, String str) {
        if (!this.isExternalIntent) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        init();
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
        tL_messages_requestUrlAuth.flags |= 4;
        tL_messages_requestUrlAuth.url = uri.toString();
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_requestUrlAuth, new AiTonesController$$ExternalSyntheticLambda0(), new OAuthSheet$$ExternalSyntheticLambda18(17, this, tL_messages_requestUrlAuth));
        return true;
    }

    public final boolean handleSettings(List list) {
        boolean z;
        int i;
        int i2;
        int i3;
        BaseFragment safeLastFragment;
        MainTabsActivity mainTabsActivity;
        ApplicationLoader applicationLoader;
        BaseFragment baseFragmentOpenSettings;
        if (list == null) {
            return false;
        }
        if (list.isEmpty()) {
            presentFragment(new SettingsActivity());
            return true;
        }
        String str = (String) list.get(0);
        String str2 = list.size() > 1 ? (String) list.get(1) : null;
        String str3 = list.size() > 2 ? (String) list.get(2) : null;
        String str4 = list.size() > 3 ? (String) list.get(3) : null;
        String str5 = list.size() > 4 ? (String) list.get(4) : null;
        if ("theme".equalsIgnoreCase(str) || "themes".equalsIgnoreCase(str)) {
            presentFragment(new ThemeActivity(0));
            return true;
        }
        if ("devices".equalsIgnoreCase(str)) {
            SessionsActivity sessionsActivity = new SessionsActivity(0);
            if ("link-desktop".equalsIgnoreCase(str2)) {
                sessionsActivity.setHighlightLinkDesktopDevice();
            }
            presentFragment(sessionsActivity);
            if ("terminate-sessions".equalsIgnoreCase(str2)) {
                scrollTo("terminateAllSessionsRow");
            }
            if ("auto-terminate".equalsIgnoreCase(str2)) {
                scrollTo("ttlRow");
                return true;
            }
        } else if ("folders".equalsIgnoreCase(str)) {
            FiltersSetupActivity filtersSetupActivity = new FiltersSetupActivity();
            presentFragment(new FiltersSetupActivity());
            if ("create".equalsIgnoreCase(str2)) {
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda2(0, this, filtersSetupActivity), 300L);
            }
            if ("show-tags".equalsIgnoreCase(str2)) {
                scrollTo("showTagsRow");
                return true;
            }
        } else {
            if ("change_number".equalsIgnoreCase(str)) {
                presentFragment(new ActionIntroActivity(3), true);
                return true;
            }
            if (!"language".equalsIgnoreCase(str)) {
                if ("auto_delete".equalsIgnoreCase(str)) {
                    presentFragment(new AutoDeleteMessagesActivity());
                    return true;
                }
                if ("phone_privacy".equalsIgnoreCase(str)) {
                    presentFragment(new PrivacyControlActivity(6));
                    return true;
                }
                if ("premium_sms".equalsIgnoreCase(str) && (applicationLoader = ApplicationLoader.applicationLoaderInstance) != null && (baseFragmentOpenSettings = applicationLoader.openSettings(13)) != null) {
                    presentFragment(baseFragmentOpenSettings);
                    return true;
                }
                boolean zEqualsIgnoreCase = "login_email".equalsIgnoreCase(str);
                int i4 = this.currentAccount;
                if (zEqualsIgnoreCase) {
                    init();
                    this.currentRequestId = ConnectionsManager.getInstance(i4).sendRequest(new TL_account.getPassword(), new LinkManager$$ExternalSyntheticLambda3(this, 0), 10);
                    return true;
                }
                if ("chats".equalsIgnoreCase(str)) {
                    ActionBarLayout actionBarLayout = (ActionBarLayout) getParentLayout();
                    int iM = ArticleViewer.IBlock.CC.m(actionBarLayout, 1);
                    z = true;
                    while (true) {
                        if (iM < 0) {
                            mainTabsActivity = null;
                            break;
                        }
                        if (actionBarLayout.getFragmentStack().get(iM) instanceof MainTabsActivity) {
                            mainTabsActivity = (MainTabsActivity) actionBarLayout.getFragmentStack().get(iM);
                            break;
                        }
                        if (iM > 0) {
                            actionBarLayout.removeFragmentFromStack(iM);
                        }
                        iM++;
                    }
                    if (mainTabsActivity != null && "search".equalsIgnoreCase(str2)) {
                        mainTabsActivity.viewPager.scrollToPosition$1(2);
                        return true;
                    }
                } else {
                    z = true;
                }
                if ("saved-messages".equalsIgnoreCase(str)) {
                    presentFragment(ChatActivity.of(getUserConfig().getClientUserId()));
                    return z;
                }
                if ("calls".equalsIgnoreCase(str)) {
                    if ("start-call".equalsIgnoreCase(str2)) {
                        presentFragment(new AnonymousClass1(zzkw.m("isCall", true)));
                        return true;
                    }
                    presentFragment(new CallLogActivity());
                    return true;
                }
                if ("qr-code".equalsIgnoreCase(str)) {
                    if ("scan".equalsIgnoreCase(str2) && (safeLastFragment = LaunchActivity.getSafeLastFragment()) != null) {
                        QrActivity.openCameraScanActivity(safeLastFragment);
                        return true;
                    }
                    if ("share".equalsIgnoreCase(str2)) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", getUserConfig().getClientUserId());
                        presentFragment(new QrActivity(bundle) {
                            @Override
                            public final void onBecomeFullyVisible() {
                                super.onBecomeFullyVisible();
                                AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda6(this, 14));
                            }
                        });
                        return true;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", getUserConfig().getClientUserId());
                    presentFragment(new QrActivity(bundle2));
                    return true;
                }
                String str6 = str5;
                if (!"chat".equalsIgnoreCase(str) || !"browser".equalsIgnoreCase(str2)) {
                    String str7 = str3;
                    if ("edit".equalsIgnoreCase(str)) {
                        presentFragment(new UserInfoActivity());
                        if ("first-name".equalsIgnoreCase(str2)) {
                            scrollTo("firstNameRow");
                        }
                        if ("last-name".equalsIgnoreCase(str2)) {
                            scrollTo("lastNameRow");
                        }
                        if ("bio".equalsIgnoreCase(str2)) {
                            scrollTo("bioRow");
                        }
                        if ("birthday".equalsIgnoreCase(str2)) {
                            scrollTo("birthdayRow");
                        }
                        if ("change-number".equalsIgnoreCase(str2)) {
                            scrollTo("numberRow");
                        }
                        if ("username".equalsIgnoreCase(str2)) {
                            scrollTo("usernameRow");
                        }
                        if ("channel".equalsIgnoreCase(str2)) {
                            scrollTo("channelRow");
                        }
                        if ("add-account".equalsIgnoreCase(str2)) {
                            scrollTo("addAccountRow");
                        }
                        if ("log-out".equalsIgnoreCase(str2)) {
                            scrollTo("logoutRow");
                            return true;
                        }
                    } else {
                        if ("my-profile".equalsIgnoreCase(str)) {
                            if ("edit".equalsIgnoreCase(str2)) {
                                presentFragment(new UserInfoActivity());
                                return true;
                            }
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("user_id", getUserConfig().getClientUserId());
                            bundle3.putBoolean("my_profile", true);
                            if ("gifts".equalsIgnoreCase(str2)) {
                                bundle3.putBoolean("open_gifts", true);
                            }
                            ProfileActivity profileActivity = new ProfileActivity(bundle3);
                            if ("gifts".equalsIgnoreCase(str2)) {
                                profileActivity.whenFullyVisible(new LinkManager$$ExternalSyntheticLambda4(profileActivity, 0));
                            }
                            if ("posts".equalsIgnoreCase(str2)) {
                                profileActivity.whenFullyVisible(new LinkManager$$ExternalSyntheticLambda4(profileActivity, 5));
                            }
                            presentFragment(profileActivity);
                            return true;
                        }
                        if ("notifications".equalsIgnoreCase(str)) {
                            if (!TextUtils.isEmpty(str7) && ("private-chats".equalsIgnoreCase(str2) || "groups".equalsIgnoreCase(str2) || "channels".equalsIgnoreCase(str2) || "stories".equalsIgnoreCase(str2) || "reactions".equalsIgnoreCase(str2))) {
                                if ("private-chats".equalsIgnoreCase(str2)) {
                                    i3 = 1;
                                } else if ("groups".equalsIgnoreCase(str2)) {
                                    i3 = 0;
                                } else if ("channels".equalsIgnoreCase(str2)) {
                                    i3 = 2;
                                } else if ("stories".equalsIgnoreCase(str2)) {
                                    i3 = 3;
                                } else if ("reactions".equalsIgnoreCase(str2)) {
                                    i3 = 4;
                                } else {
                                    i3 = 0;
                                }
                                NotificationsSettingsActivity notificationsSettingsActivity = new NotificationsSettingsActivity();
                                init();
                                notificationsSettingsActivity.loadExceptions(new OAuthSheet$$ExternalSyntheticLambda2(this, notificationsSettingsActivity, i3, str7, 5));
                                return true;
                            }
                            presentFragment(new NotificationsSettingsActivity());
                            if ("accounts".equalsIgnoreCase(str2)) {
                                scrollTo("accountsAllRow");
                            }
                            if ("private-chats".equalsIgnoreCase(str2)) {
                                scrollTo("privateRow");
                            }
                            if ("groups".equalsIgnoreCase(str2)) {
                                scrollTo("groupRow");
                            }
                            if ("channels".equalsIgnoreCase(str2)) {
                                scrollTo("channelsRow");
                            }
                            if ("stories".equalsIgnoreCase(str2)) {
                                scrollTo("storiesRow");
                            }
                            if ("reactions".equalsIgnoreCase(str2)) {
                                scrollTo("reactionsRow");
                            }
                            if ("in-app-sounds".equalsIgnoreCase(str2)) {
                                scrollTo("inappSoundRow");
                            }
                            if ("in-app-vibrate".equalsIgnoreCase(str2)) {
                                scrollTo("inappVibrateRow");
                            }
                            if ("in-app-preview".equalsIgnoreCase(str2)) {
                                scrollTo("inappPreviewRow");
                            }
                            if ("in-chat-sounds".equalsIgnoreCase(str2)) {
                                scrollTo("inchatSoundRow");
                            }
                            if ("in-app-popup".equalsIgnoreCase(str2)) {
                                scrollTo("inappPriorityRow");
                            }
                            if ("show-badge-icon".equalsIgnoreCase(str2)) {
                                scrollTo("badgeNumberShowRow");
                            }
                            if ("include-muted-chats".equalsIgnoreCase(str2)) {
                                scrollTo("badgeNumberMutedRow");
                            }
                            if ("count-unread-messages".equalsIgnoreCase(str2)) {
                                scrollTo("badgeNumberMessagesRow");
                            }
                            if ("new-contacts".equalsIgnoreCase(str2)) {
                                scrollTo("contactJoinedRow");
                            }
                            if ("pinned-messages".equalsIgnoreCase(str2)) {
                                scrollTo("pinnedMessageRow");
                            }
                            if ("reset".equalsIgnoreCase(str2)) {
                                scrollTo("resetNotificationsRow");
                                return true;
                            }
                        } else if ("privacy".equalsIgnoreCase(str)) {
                            if ("data-settings".equalsIgnoreCase(str2) && "delete-cloud-drafts".equalsIgnoreCase(str7)) {
                                presentFragment(new DataSettingsActivity());
                                scrollTo("clearDraftsRow");
                                return true;
                            }
                            if (!TextUtils.isEmpty(str7) && "blocked".equalsIgnoreCase(str2)) {
                                presentFragment(new PrivacyUsersActivity());
                                return true;
                            }
                            if (!TextUtils.isEmpty(str7) && "active-websites".equalsIgnoreCase(str2)) {
                                presentFragment(new SessionsActivity(1));
                                if (!"disconnect-all".equalsIgnoreCase(str7)) {
                                    return true;
                                }
                                scrollTo("terminateAllSessionsRow");
                                return true;
                            }
                            if (!TextUtils.isEmpty(str7) && "passcode".equalsIgnoreCase(str2)) {
                                LinkManager$$ExternalSyntheticLambda7 linkManager$$ExternalSyntheticLambda7 = new LinkManager$$ExternalSyntheticLambda7(this, str7, 0);
                                BaseFragment baseFragmentDetermineOpenFragment = PasscodeActivity.determineOpenFragment();
                                presentFragment(baseFragmentDetermineOpenFragment);
                                if (baseFragmentDetermineOpenFragment instanceof ActionIntroActivity) {
                                    ((ActionIntroActivity) baseFragmentDetermineOpenFragment).setOnOpenedSettings(linkManager$$ExternalSyntheticLambda7);
                                    return true;
                                }
                                if (baseFragmentDetermineOpenFragment instanceof PasscodeActivity) {
                                    ((PasscodeActivity) baseFragmentDetermineOpenFragment).setOnOpenedSettings(linkManager$$ExternalSyntheticLambda7);
                                    return true;
                                }
                            } else {
                                if (!TextUtils.isEmpty(str7) && "2sv".equalsIgnoreCase(str2)) {
                                    init();
                                    this.currentRequestId = ConnectionsManager.getInstance(i4).sendRequest(new TL_account.getPassword(), new LinkManager$$ExternalSyntheticLambda8(0, this, str7), 10);
                                    return true;
                                }
                                if (!TextUtils.isEmpty(str7) && "passkey".equalsIgnoreCase(str2) && Build.VERSION.SDK_INT >= 28) {
                                    init();
                                    this.currentRequestId = ConnectionsManager.getInstance(i4).sendRequestTyped(new TL_account.getPasskeys(), new LinkManager$$ExternalSyntheticLambda9(0), new OAuthSheet$$ExternalSyntheticLambda18(16, this, str7));
                                    return true;
                                }
                                if (!TextUtils.isEmpty(str7) && "auto-delete".equalsIgnoreCase(str2) && getUserConfig().getGlobalTTl() >= 0) {
                                    presentFragment(new AutoDeleteMessagesActivity());
                                    return true;
                                }
                                if (!TextUtils.isEmpty(str7) && ("phone-number".equalsIgnoreCase(str2) || "last-seen".equalsIgnoreCase(str2) || "profile-photos".equalsIgnoreCase(str2) || "bio".equalsIgnoreCase(str2) || "gifts".equalsIgnoreCase(str2) || "birthday".equalsIgnoreCase(str2) || "saved-music".equalsIgnoreCase(str2) || "forwards".equalsIgnoreCase(str2) || "calls".equalsIgnoreCase(str2) || "voice".equalsIgnoreCase(str2) || "messages".equalsIgnoreCase(str2) || "invites".equalsIgnoreCase(str2))) {
                                    if ("phone-number".equalsIgnoreCase(str2)) {
                                        i2 = 6;
                                    } else if ("last-seen".equalsIgnoreCase(str2)) {
                                        i2 = 0;
                                    } else if ("profile-photos".equalsIgnoreCase(str2)) {
                                        i2 = 4;
                                    } else if ("bio".equalsIgnoreCase(str2)) {
                                        i2 = 9;
                                    } else if ("gifts".equalsIgnoreCase(str2)) {
                                        i2 = 12;
                                    } else if ("birthday".equalsIgnoreCase(str2)) {
                                        i2 = 11;
                                    } else if ("saved-music".equalsIgnoreCase(str2)) {
                                        i2 = 14;
                                    } else if ("forwards".equalsIgnoreCase(str2)) {
                                        i2 = 5;
                                    } else if ("calls".equalsIgnoreCase(str2)) {
                                        i2 = "p2p".equalsIgnoreCase(str7) ? 3 : 2;
                                    } else if ("voice".equalsIgnoreCase(str2)) {
                                        i2 = 8;
                                    } else if ("messages".equalsIgnoreCase(str2)) {
                                        i2 = 10;
                                    } else if ("invites".equalsIgnoreCase(str2)) {
                                        i2 = 1;
                                    } else {
                                        i2 = 0;
                                    }
                                    presentFragment(new PrivacyControlActivity(i2));
                                    if ("birthday".equalsIgnoreCase(str2) && "add".equalsIgnoreCase(str7)) {
                                        scrollTo("setBirthdayRow");
                                    }
                                    if ("always-share".equalsIgnoreCase(str7) || "always-share".equalsIgnoreCase(str4) || "always".equalsIgnoreCase(str7) || "always".equalsIgnoreCase(str4)) {
                                        scrollTo("everybodyRow");
                                    }
                                    if ("never-share".equalsIgnoreCase(str7) || "never-share".equalsIgnoreCase(str4) || "never".equalsIgnoreCase(str7) || "never".equalsIgnoreCase(str4)) {
                                        scrollTo("nobodyRow");
                                    }
                                    if ("gifts".equalsIgnoreCase(str2) && "show-icon".equalsIgnoreCase(str7)) {
                                        scrollTo("showGiftIconRow");
                                    }
                                    if ("gifts".equalsIgnoreCase(str2) && "accepted-types".equalsIgnoreCase(str7)) {
                                        scrollTo("giftTypesHeaderRow");
                                    }
                                    if ("messages".equalsIgnoreCase(str2) && "set-price".equalsIgnoreCase(str7)) {
                                        scrollTo("priceRow");
                                    }
                                    if ("messages".equalsIgnoreCase(str2) && "remove-fee".equalsIgnoreCase(str7)) {
                                        scrollTo("alwaysShareRow");
                                    }
                                    if ("last-seen".equalsIgnoreCase(str2) && "hide-read-time".equalsIgnoreCase(str7)) {
                                        scrollTo("readRow");
                                    }
                                    if ("profile-photos".equalsIgnoreCase(str2)) {
                                        if ("set-public".equalsIgnoreCase(str7)) {
                                            scrollTo("photoForRestRow");
                                        }
                                        if ("update-public".equalsIgnoreCase(str7)) {
                                            scrollTo("photoForRestRow");
                                        }
                                        if ("remove-public".equalsIgnoreCase(str7)) {
                                            scrollTo("currentPhotoForRestRow");
                                            return true;
                                        }
                                    }
                                } else if (MessagesController.getInstance(i4).autoarchiveAvailable || !"archive-and-mute".equalsIgnoreCase(str2)) {
                                    presentFragment(new PrivacySettingsActivity());
                                    if ("blocked".equalsIgnoreCase(str2)) {
                                        scrollTo("blockedRow");
                                    }
                                    if ("active-websites".equalsIgnoreCase(str2)) {
                                        scrollTo("webSessionsRow");
                                    }
                                    if ("passcode".equalsIgnoreCase(str2)) {
                                        scrollTo("passcodeRow");
                                    }
                                    if ("2sv".equalsIgnoreCase(str2)) {
                                        scrollTo("passwordRow");
                                    }
                                    if ("passkey".equalsIgnoreCase(str2)) {
                                        scrollTo("passkeysRow");
                                    }
                                    if ("auto-delete".equalsIgnoreCase(str2)) {
                                        scrollTo("autoDeleteMesages");
                                    }
                                    if ("login-email".equalsIgnoreCase(str2)) {
                                        scrollTo("emailLoginRow");
                                    }
                                    if ("phone-number".equalsIgnoreCase(str2)) {
                                        scrollTo("phoneNumberRow");
                                    }
                                    if ("last-seen".equalsIgnoreCase(str2)) {
                                        scrollTo("lastSeenRow");
                                    }
                                    if ("profile-photos".equalsIgnoreCase(str2)) {
                                        scrollTo("profilePhotoRow");
                                    }
                                    if ("bio".equalsIgnoreCase(str2)) {
                                        scrollTo("bioRow");
                                    }
                                    if ("gifts".equalsIgnoreCase(str2)) {
                                        scrollTo("giftsRow");
                                    }
                                    if ("birthday".equalsIgnoreCase(str2)) {
                                        scrollTo("birthdayRow");
                                    }
                                    if ("saved-music".equalsIgnoreCase(str2)) {
                                        scrollTo("musicRow");
                                    }
                                    if ("forwards".equalsIgnoreCase(str2)) {
                                        scrollTo("forwardsRow");
                                    }
                                    if ("calls".equalsIgnoreCase(str2)) {
                                        scrollTo("callsRow");
                                    }
                                    if ("voice".equalsIgnoreCase(str2)) {
                                        scrollTo("voicesRow");
                                    }
                                    if ("messages".equalsIgnoreCase(str2)) {
                                        scrollTo("noncontactsRow");
                                    }
                                    if ("invites".equalsIgnoreCase(str2)) {
                                        scrollTo("groupsRow");
                                    }
                                    if ("self-destruct".equalsIgnoreCase(str2)) {
                                        scrollTo("deleteAccountRow");
                                    }
                                    if ("archive-and-mute".equalsIgnoreCase(str2)) {
                                        scrollTo("newChatsRow");
                                    }
                                    if ("data-settings".equalsIgnoreCase(str2)) {
                                        if ("sync-contacts".equalsIgnoreCase(str7)) {
                                            scrollTo("contactsSyncRow");
                                        }
                                        if ("delete-synced".equalsIgnoreCase(str7)) {
                                            scrollTo("contactsDeleteRow");
                                        }
                                        if ("suggest-contacts".equalsIgnoreCase(str7)) {
                                            scrollTo("contactsSuggestRow");
                                        }
                                        if ("clear-payment-info".equalsIgnoreCase(str7)) {
                                            scrollTo("paymentsClearRow");
                                        }
                                        if ("link-previews".equalsIgnoreCase(str7)) {
                                            scrollTo("secretWebpageRow");
                                        }
                                        if ("map-provider".equalsIgnoreCase(str7)) {
                                            scrollTo("secretMapRow");
                                            return true;
                                        }
                                    }
                                }
                            }
                        } else if ("data".equalsIgnoreCase(str)) {
                            if ("storage".equalsIgnoreCase(str2)) {
                                "clear-cache".equalsIgnoreCase(str7);
                                presentFragment(new CacheControlActivity());
                                return true;
                            }
                            if ("usage".equalsIgnoreCase(str2)) {
                                DataUsage2Activity dataUsage2Activity = new DataUsage2Activity();
                                presentFragment(dataUsage2Activity);
                                if ("mobile".equalsIgnoreCase(str7)) {
                                    dataUsage2Activity.tabsView.scrollToTab(1, 1);
                                }
                                if ("wifi".equalsIgnoreCase(str7)) {
                                    dataUsage2Activity.tabsView.scrollToTab(2, 2);
                                }
                                if ("roaming".equalsIgnoreCase(str7)) {
                                    dataUsage2Activity.tabsView.scrollToTab(3, 3);
                                }
                                if ("reset".equalsIgnoreCase(str7)) {
                                    dataUsage2Activity.scrollToReset();
                                    return true;
                                }
                            } else if ("auto-download".equalsIgnoreCase(str2)) {
                                if ("mobile".equalsIgnoreCase(str7) || "wifi".equalsIgnoreCase(str7) || "roaming".equalsIgnoreCase(str7)) {
                                    if ("mobile".equalsIgnoreCase(str7)) {
                                        i = 0;
                                    } else if ("wifi".equalsIgnoreCase(str7)) {
                                        i = 1;
                                    } else if ("roaming".equalsIgnoreCase(str7)) {
                                        i = 2;
                                    } else {
                                        i = 0;
                                    }
                                    presentFragment(new DataAutoDownloadActivity(i));
                                    if ("enable".equalsIgnoreCase(str4)) {
                                        scrollTo("autoDownloadRow");
                                    }
                                    if ("usage".equalsIgnoreCase(str4)) {
                                        scrollTo("usageProgressRow");
                                    }
                                    if ("photos".equalsIgnoreCase(str4)) {
                                        scrollTo("photosRow");
                                    }
                                    if ("stories".equalsIgnoreCase(str4)) {
                                        scrollTo("storiesRow");
                                    }
                                    if ("videos".equalsIgnoreCase(str4)) {
                                        scrollTo("videosRow");
                                    }
                                    if ("files".equalsIgnoreCase(str4)) {
                                        scrollTo("filesRow");
                                        return true;
                                    }
                                } else {
                                    if ("reset".equalsIgnoreCase(str7)) {
                                        presentFragment(new DataSettingsActivity());
                                        scrollTo("resetDownloadRow");
                                        return true;
                                    }
                                    if (!TextUtils.isEmpty(str4)) {
                                        if (!TextUtils.isEmpty(str7)) {
                                            if ("pause-music".equalsIgnoreCase(str2)) {
                                                presentFragment(new ThemeActivity(0));
                                                scrollTo("pauseOnMediaRow");
                                                return true;
                                            }
                                            if ("pause-music-on-record".equalsIgnoreCase(str2)) {
                                                presentFragment(new ThemeActivity(0));
                                                scrollTo("pauseOnRecordRow");
                                                return true;
                                            }
                                            if ("raise-to-listen".equalsIgnoreCase(str2)) {
                                                presentFragment(new ThemeActivity(0));
                                                scrollTo("raiseToListenRow");
                                                return true;
                                            }
                                            if ("raise-to-speak".equalsIgnoreCase(str2)) {
                                                presentFragment(new ThemeActivity(0));
                                                scrollTo("raiseToSpeakRow");
                                                return true;
                                            }
                                            if ("show-18-contnet".equalsIgnoreCase(str2)) {
                                                presentFragment(new ThemeActivity(0));
                                                scrollTo("sensitiveContentRow");
                                                return true;
                                            }
                                            presentFragment(new DataSettingsActivity());
                                            if ("save-to-photos".equalsIgnoreCase(str2)) {
                                                if ("chats".equalsIgnoreCase(str7)) {
                                                    scrollTo("saveToGalleryPeerRow");
                                                }
                                                if ("groups".equalsIgnoreCase(str7)) {
                                                    scrollTo("saveToGalleryGroupsRow");
                                                }
                                                if ("channels".equalsIgnoreCase(str7)) {
                                                    scrollTo("saveToGalleryChannelsRow");
                                                }
                                            }
                                            if ("use-less-data".equalsIgnoreCase(str2)) {
                                                scrollTo("useLessDataForCallsRow");
                                            }
                                            if ("proxy".equalsIgnoreCase(str2)) {
                                                scrollTo("proxyRow");
                                                return true;
                                            }
                                        } else {
                                            if ("pause-music".equalsIgnoreCase(str2)) {
                                                presentFragment(new ThemeActivity(0));
                                                scrollTo("pauseOnMediaRow");
                                                return true;
                                            }
                                            if ("pause-music-on-record".equalsIgnoreCase(str2)) {
                                                presentFragment(new ThemeActivity(0));
                                                scrollTo("pauseOnRecordRow");
                                                return true;
                                            }
                                            if ("raise-to-listen".equalsIgnoreCase(str2)) {
                                                presentFragment(new ThemeActivity(0));
                                                scrollTo("raiseToListenRow");
                                                return true;
                                            }
                                            if ("raise-to-speak".equalsIgnoreCase(str2)) {
                                                presentFragment(new ThemeActivity(0));
                                                scrollTo("raiseToSpeakRow");
                                                return true;
                                            }
                                            if ("show-18-contnet".equalsIgnoreCase(str2)) {
                                                presentFragment(new ThemeActivity(0));
                                                scrollTo("sensitiveContentRow");
                                                return true;
                                            }
                                            presentFragment(new DataSettingsActivity());
                                            if ("save-to-photos".equalsIgnoreCase(str2)) {
                                                if ("chats".equalsIgnoreCase(str7)) {
                                                    scrollTo("saveToGalleryPeerRow");
                                                }
                                                if ("groups".equalsIgnoreCase(str7)) {
                                                    scrollTo("saveToGalleryGroupsRow");
                                                }
                                                if ("channels".equalsIgnoreCase(str7)) {
                                                    scrollTo("saveToGalleryChannelsRow");
                                                }
                                            }
                                            if ("use-less-data".equalsIgnoreCase(str2)) {
                                                scrollTo("useLessDataForCallsRow");
                                            }
                                            if ("proxy".equalsIgnoreCase(str2)) {
                                                scrollTo("proxyRow");
                                                return true;
                                            }
                                        }
                                    } else if (!TextUtils.isEmpty(str7)) {
                                        if ("pause-music".equalsIgnoreCase(str2)) {
                                            presentFragment(new ThemeActivity(0));
                                            scrollTo("pauseOnMediaRow");
                                            return true;
                                        }
                                        if ("pause-music-on-record".equalsIgnoreCase(str2)) {
                                            presentFragment(new ThemeActivity(0));
                                            scrollTo("pauseOnRecordRow");
                                            return true;
                                        }
                                        if ("raise-to-listen".equalsIgnoreCase(str2)) {
                                            presentFragment(new ThemeActivity(0));
                                            scrollTo("raiseToListenRow");
                                            return true;
                                        }
                                        if ("raise-to-speak".equalsIgnoreCase(str2)) {
                                            presentFragment(new ThemeActivity(0));
                                            scrollTo("raiseToSpeakRow");
                                            return true;
                                        }
                                        if ("show-18-contnet".equalsIgnoreCase(str2)) {
                                            presentFragment(new ThemeActivity(0));
                                            scrollTo("sensitiveContentRow");
                                            return true;
                                        }
                                        presentFragment(new DataSettingsActivity());
                                        if ("save-to-photos".equalsIgnoreCase(str2)) {
                                            if ("chats".equalsIgnoreCase(str7)) {
                                                scrollTo("saveToGalleryPeerRow");
                                            }
                                            if ("groups".equalsIgnoreCase(str7)) {
                                                scrollTo("saveToGalleryGroupsRow");
                                            }
                                            if ("channels".equalsIgnoreCase(str7)) {
                                                scrollTo("saveToGalleryChannelsRow");
                                            }
                                        }
                                        if ("use-less-data".equalsIgnoreCase(str2)) {
                                            scrollTo("useLessDataForCallsRow");
                                        }
                                        if ("proxy".equalsIgnoreCase(str2)) {
                                            scrollTo("proxyRow");
                                            return true;
                                        }
                                    } else {
                                        if ("pause-music".equalsIgnoreCase(str2)) {
                                            presentFragment(new ThemeActivity(0));
                                            scrollTo("pauseOnMediaRow");
                                            return true;
                                        }
                                        if ("pause-music-on-record".equalsIgnoreCase(str2)) {
                                            presentFragment(new ThemeActivity(0));
                                            scrollTo("pauseOnRecordRow");
                                            return true;
                                        }
                                        if ("raise-to-listen".equalsIgnoreCase(str2)) {
                                            presentFragment(new ThemeActivity(0));
                                            scrollTo("raiseToListenRow");
                                            return true;
                                        }
                                        if ("raise-to-speak".equalsIgnoreCase(str2)) {
                                            presentFragment(new ThemeActivity(0));
                                            scrollTo("raiseToSpeakRow");
                                            return true;
                                        }
                                        if ("show-18-contnet".equalsIgnoreCase(str2)) {
                                            presentFragment(new ThemeActivity(0));
                                            scrollTo("sensitiveContentRow");
                                            return true;
                                        }
                                        presentFragment(new DataSettingsActivity());
                                        if ("save-to-photos".equalsIgnoreCase(str2)) {
                                            if ("chats".equalsIgnoreCase(str7)) {
                                                scrollTo("saveToGalleryPeerRow");
                                            }
                                            if ("groups".equalsIgnoreCase(str7)) {
                                                scrollTo("saveToGalleryGroupsRow");
                                            }
                                            if ("channels".equalsIgnoreCase(str7)) {
                                                scrollTo("saveToGalleryChannelsRow");
                                            }
                                        }
                                        if ("use-less-data".equalsIgnoreCase(str2)) {
                                            scrollTo("useLessDataForCallsRow");
                                        }
                                        if ("proxy".equalsIgnoreCase(str2)) {
                                            scrollTo("proxyRow");
                                            return true;
                                        }
                                    }
                                }
                            } else if (!TextUtils.isEmpty(str4) && "save-to-photos".equalsIgnoreCase(str2)) {
                                presentFragment(new SaveToGallerySettingsActivity(NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m("groups".equalsIgnoreCase(str7) ? 2 : "channels".equalsIgnoreCase(str7) ? 4 : 1, "type")));
                                if ("max-video-size".equalsIgnoreCase(str4)) {
                                    scrollTo("maxVideoSizeRow");
                                }
                                if ("add-exception".equalsIgnoreCase(str4)) {
                                    scrollTo("addExceptionRow");
                                }
                                if ("delete-all".equalsIgnoreCase(str4)) {
                                    scrollTo("deleteAllExceptionsRow");
                                    return true;
                                }
                            } else if (!TextUtils.isEmpty(str7) && "proxy".equalsIgnoreCase(str2)) {
                                presentFragment(new ProxyListActivity());
                                if ("use-proxy".equalsIgnoreCase(str7)) {
                                    scrollTo("useProxyRow");
                                }
                                if ("add-proxy".equalsIgnoreCase(str7)) {
                                    scrollTo("proxyAddRow");
                                }
                                if ("use-for-calls".equalsIgnoreCase(str7)) {
                                    scrollTo("callsRow");
                                    return true;
                                }
                            } else {
                                if ("pause-music".equalsIgnoreCase(str2)) {
                                    presentFragment(new ThemeActivity(0));
                                    scrollTo("pauseOnMediaRow");
                                    return true;
                                }
                                if ("pause-music-on-record".equalsIgnoreCase(str2)) {
                                    presentFragment(new ThemeActivity(0));
                                    scrollTo("pauseOnRecordRow");
                                    return true;
                                }
                                if ("raise-to-listen".equalsIgnoreCase(str2)) {
                                    presentFragment(new ThemeActivity(0));
                                    scrollTo("raiseToListenRow");
                                    return true;
                                }
                                if ("raise-to-speak".equalsIgnoreCase(str2)) {
                                    presentFragment(new ThemeActivity(0));
                                    scrollTo("raiseToSpeakRow");
                                    return true;
                                }
                                if ("show-18-contnet".equalsIgnoreCase(str2)) {
                                    presentFragment(new ThemeActivity(0));
                                    scrollTo("sensitiveContentRow");
                                    return true;
                                }
                                presentFragment(new DataSettingsActivity());
                                if ("save-to-photos".equalsIgnoreCase(str2)) {
                                    if ("chats".equalsIgnoreCase(str7)) {
                                        scrollTo("saveToGalleryPeerRow");
                                    }
                                    if ("groups".equalsIgnoreCase(str7)) {
                                        scrollTo("saveToGalleryGroupsRow");
                                    }
                                    if ("channels".equalsIgnoreCase(str7)) {
                                        scrollTo("saveToGalleryChannelsRow");
                                    }
                                }
                                if ("use-less-data".equalsIgnoreCase(str2)) {
                                    scrollTo("useLessDataForCallsRow");
                                }
                                if ("proxy".equalsIgnoreCase(str2)) {
                                    scrollTo("proxyRow");
                                    return true;
                                }
                            }
                        } else if (!"appearance".equalsIgnoreCase(str)) {
                            if (!"power-saving".equalsIgnoreCase(str)) {
                                boolean zEqualsIgnoreCase2 = "stars".equalsIgnoreCase(str);
                                LaunchActivity launchActivity = this.activity;
                                if (zEqualsIgnoreCase2) {
                                    if ("top-up".equalsIgnoreCase(str2)) {
                                        new StarsIntroActivity.StarsOptionsSheet(launchActivity, null).show();
                                        return true;
                                    }
                                    if ("stats".equalsIgnoreCase(str2)) {
                                        presentFragment(new BotStarsActivity(0, getUserConfig().getClientUserId()));
                                        return true;
                                    }
                                    if ("gift".equalsIgnoreCase(str2)) {
                                        StarsController.getInstance(i4).getGiftOptions();
                                        UserSelectorBottomSheet.open(1, BirthdayController.getInstance(i4).getState());
                                        return true;
                                    }
                                    if ("earn".equalsIgnoreCase(str2)) {
                                        presentFragment(new ChannelAffiliateProgramsFragment(getUserConfig().getClientUserId()));
                                        return true;
                                    }
                                    presentFragment(new StarsIntroActivity());
                                    return true;
                                }
                                if ("premium".equalsIgnoreCase(str)) {
                                    presentFragment(new PremiumPreviewFragment());
                                    return true;
                                }
                                if ("business".equalsIgnoreCase(str)) {
                                    presentFragment(new PremiumPreviewFragment(1, "link"));
                                    if (!"do-not-hide-ads".equalsIgnoreCase(str2)) {
                                        return true;
                                    }
                                    scrollTo("showAdsRow");
                                    return true;
                                }
                                if ("ton".equalsIgnoreCase(str)) {
                                    presentFragment(new TONIntroActivity());
                                    return true;
                                }
                                if ("send-gift".equalsIgnoreCase(str)) {
                                    if ("self".equalsIgnoreCase(str2)) {
                                        new GiftSheet(this.activity, this.currentAccount, getUserConfig().getClientUserId(), null, null).show();
                                        return true;
                                    }
                                    UserSelectorBottomSheet.open(0, BirthdayController.getInstance(i4).getState());
                                    return true;
                                }
                                if ("ask-question".equalsIgnoreCase(str) || "ask-a-question".equalsIgnoreCase(str)) {
                                    AlertsCreator.createSupportAlert(LaunchActivity.getSafeLastFragment(), null).show();
                                    return true;
                                }
                                if ("faq".equalsIgnoreCase(str)) {
                                    Browser.openUrl(launchActivity, LocaleController.getString(R.string.TelegramFaqUrl));
                                    return true;
                                }
                                if ("features".equalsIgnoreCase(str)) {
                                    Browser.openUrl(launchActivity, LocaleController.getString(R.string.TelegramFeaturesUrl));
                                    return true;
                                }
                                if ("privacy-policy".equalsIgnoreCase(str)) {
                                    Browser.openUrl(launchActivity, LocaleController.getString(R.string.PrivacyPolicyUrl));
                                    return true;
                                }
                                presentFragment(new SettingsActivity());
                                return true;
                            }
                            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
                            presentFragment(liteModeSettingsActivity);
                            if ("videos".equalsIgnoreCase(str2)) {
                                liteModeSettingsActivity.scrollToFlags(1024);
                            }
                            if ("gifs".equalsIgnoreCase(str2)) {
                                liteModeSettingsActivity.scrollToFlags(2048);
                            }
                            if ("stickers".equalsIgnoreCase(str2)) {
                                liteModeSettingsActivity.scrollToFlags(3);
                            }
                            if ("emoji".equalsIgnoreCase(str2)) {
                                liteModeSettingsActivity.scrollToFlags(28700);
                            }
                            if ("effects".equalsIgnoreCase(str2)) {
                                liteModeSettingsActivity.scrollToFlags(360928);
                            }
                            if ("call-animations".equalsIgnoreCase(str2)) {
                                liteModeSettingsActivity.scrollToFlags(512);
                            }
                            if ("particles".equalsIgnoreCase(str2)) {
                                liteModeSettingsActivity.scrollToFlags(131072);
                            }
                            if ("transitions".equalsIgnoreCase(str2)) {
                                for (int i5 = 0; i5 < liteModeSettingsActivity.items.size(); i5++) {
                                    if (((LiteModeSettingsActivity.Item) liteModeSettingsActivity.items.get(i5)).type == 1) {
                                        liteModeSettingsActivity.listView.highlightRowInternal(new LaunchActivity$$ExternalSyntheticLambda9(liteModeSettingsActivity, i5, 11), 700, true);
                                        return true;
                                    }
                                }
                            }
                        } else if ("themes".equalsIgnoreCase(str2) || "theme".equalsIgnoreCase(str2)) {
                            presentFragment(new ThemeActivity(3));
                            if ("create".equalsIgnoreCase(str7)) {
                                scrollTo("createNewThemeRow");
                                return true;
                            }
                        } else if (!TextUtils.isEmpty(str7) && ("wallpaper".equalsIgnoreCase(str2) || "wallpapers".equalsIgnoreCase(str2))) {
                            presentFragment(new WallpapersListActivity(0));
                            if ("set".equalsIgnoreCase(str7) || "choose-photo".equalsIgnoreCase(str7)) {
                                scrollTo("uploadImageRow");
                                return true;
                            }
                        } else {
                            if (!TextUtils.isEmpty(str7) && ("your-color".equalsIgnoreCase(str2) || "color".equalsIgnoreCase(str2))) {
                                presentFragment(new PeerColorActivity());
                                return true;
                            }
                            if (TextUtils.isEmpty(str7) || !"stickers-and-emoji".equalsIgnoreCase(str2)) {
                                presentFragment(new ThemeActivity(0));
                                if ("wallpaper".equalsIgnoreCase(str2) || "wallpapers".equalsIgnoreCase(str2)) {
                                    scrollTo("backgroundRow");
                                }
                                if ("your-color".equalsIgnoreCase(str2) || "color".equalsIgnoreCase(str2)) {
                                    scrollTo("changeUserColor");
                                }
                                if ("auto-night-mode".equalsIgnoreCase(str2)) {
                                    scrollTo("nightThemeRow");
                                }
                                if ("text-size".equalsIgnoreCase(str2)) {
                                    scrollTo("textSizeRow");
                                }
                                if ("message-corners".equalsIgnoreCase(str2)) {
                                    scrollTo("bubbleRadiusRow");
                                }
                                if ("animations".equalsIgnoreCase(str2)) {
                                    scrollTo("liteModeRow");
                                }
                                if ("stickers-and-emoji".equalsIgnoreCase(str2)) {
                                    scrollTo("stickersRow");
                                }
                                if ("app-icon".equalsIgnoreCase(str2)) {
                                    scrollTo("appIconSelectorRow");
                                }
                                if ("tap-for-next-media".equalsIgnoreCase(str2)) {
                                    scrollTo("nextMediaTapRow");
                                    return true;
                                }
                            } else {
                                if (!TextUtils.isEmpty(str4) && "archived".equalsIgnoreCase(str7)) {
                                    presentFragment(new ArchivedStickersActivity(0));
                                    return true;
                                }
                                if (!"emoji".equalsIgnoreCase(str7) || TextUtils.isEmpty(str4) || "large".equalsIgnoreCase(str4) || "dynamic-order".equalsIgnoreCase(str4)) {
                                    presentFragment(new StickersActivity(0, null));
                                    if ("trending".equalsIgnoreCase(str7)) {
                                        scrollTo("featuredRow");
                                    }
                                    if ("archived".equalsIgnoreCase(str7)) {
                                        scrollTo("archivedRow");
                                    }
                                    if ("emoji".equalsIgnoreCase(str7) && "large".equalsIgnoreCase(str4)) {
                                        scrollTo("largeEmojiRow");
                                        return true;
                                    }
                                    if ("emoji".equalsIgnoreCase(str7) && "dynamic-order".equalsIgnoreCase(str4)) {
                                        scrollTo("dynamicPackOrder");
                                        return true;
                                    }
                                    if ("emoji".equalsIgnoreCase(str7)) {
                                        scrollTo("emojiPacksRow");
                                        return true;
                                    }
                                } else {
                                    if (!TextUtils.isEmpty(str6) && "archived".equalsIgnoreCase(str4)) {
                                        presentFragment(new ArchivedStickersActivity(5));
                                        return true;
                                    }
                                    presentFragment(new StickersActivity(5, null));
                                    if ("suggest".equalsIgnoreCase(str4)) {
                                        scrollTo("suggestRow");
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                    return true;
                }
                if (TextUtils.isEmpty(str3)) {
                    presentFragment(new ThemeActivity(0));
                    scrollTo("browserRow");
                    return true;
                }
                presentFragment(new WebBrowserSettings(null));
                if ("enable-browser".equalsIgnoreCase(str3)) {
                    scrollTo("enableRow");
                }
                if ("clear-cookies".equalsIgnoreCase(str3)) {
                    scrollTo("clearCookiesRow");
                }
                if ("clear-cache".equalsIgnoreCase(str3)) {
                    scrollTo("clearCacheRow");
                }
                if ("history".equalsIgnoreCase(str3)) {
                    scrollTo("historyRow");
                }
                if ("clear-history".equalsIgnoreCase(str3)) {
                    scrollTo("clearHistoryRow");
                }
                if ("never-open".equalsIgnoreCase(str3)) {
                    scrollTo("neverOpenRow");
                }
                if ("clear-list".equalsIgnoreCase(str3)) {
                    scrollTo("clearListRow");
                }
                if ("search".equalsIgnoreCase(str3)) {
                    scrollTo("searchRow");
                    return true;
                }
                return true;
            }
            if ("do-not-translate".equalsIgnoreCase(str2)) {
                presentFragment(new RestrictedLanguagesSelectActivity());
                return true;
            }
            presentFragment(new LanguageSelectActivity());
            if ("show-button".equalsIgnoreCase(str2)) {
                scrollTo("manualTranslationPosition");
            }
            if ("translate-chats".equalsIgnoreCase(str2)) {
                scrollTo("autoTranslationPosition");
                return true;
            }
        }
        return true;
    }

    public final void init() {
        if (this.inited || this.done) {
            return;
        }
        Browser.Progress progress = this.progress;
        if (progress == null) {
            if (this.progressDialog == null) {
                this.progressDialog = new AlertDialog(this.activity, 3, null);
            }
            this.progressDialog.setOnCancelListener(new LinkManager$$ExternalSyntheticLambda17(this, 0));
            AlertDialog alertDialog = this.progressDialog;
            AndroidUtilities.cancelRunOnUIThread(alertDialog.showRunnable);
            AndroidUtilities.runOnUIThread(alertDialog.showRunnable, 300L);
        } else {
            progress.onCancelListener = new LinkManager$$ExternalSyntheticLambda18(this, 0);
            progress.init();
        }
        this.inited = true;
    }

    public final void presentFragment(BaseFragment baseFragment) {
        presentFragment(baseFragment, false);
    }

    public final void scrollTo(String str) {
        AndroidUtilities.scrollToFragmentRow(this.activity.getActionBarLayout(), str);
    }

    public final void presentFragment(BaseFragment baseFragment, boolean z) {
        LaunchActivity launchActivity = this.activity;
        ((ActionBarLayout) launchActivity.getActionBarLayout()).presentFragment$1(baseFragment, z, false);
        if (AndroidUtilities.isTablet()) {
            ActionBarLayout actionBarLayout = launchActivity.actionBarLayout;
            actionBarLayout.getClass();
            actionBarLayout.rebuildAllFragmentViews(true, true);
            ActionBarLayout actionBarLayout2 = launchActivity.rightActionBarLayout;
            actionBarLayout2.getClass();
            actionBarLayout2.rebuildAllFragmentViews(true, true);
        }
    }
}
