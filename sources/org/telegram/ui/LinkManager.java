package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserObject;
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
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AIEditorAlert;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CreateBotAlert;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.SharedMediaLayout;
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

public class LinkManager {
    private final LaunchActivity activity;
    private final int currentAccount;
    private int currentRequestId = -1;
    private boolean done;
    private boolean inited;
    private final boolean isExternalIntent;
    private final Browser.Progress progress;
    private AlertDialog progressDialog;

    public class AnonymousClass1 extends GroupCreateActivity {
        public AnonymousClass1(Bundle bundle) {
            super(bundle);
        }

        public void lambda$onCallUsersSelected$0(TLObject tLObject, TLRPC.User user, boolean z) {
            TLRPC.UserFull userFull;
            if (tLObject instanceof TLRPC.TL_users_userFull) {
                TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
                getMessagesController().putUsers(tL_users_userFull.users, false);
                getMessagesController().putChats(tL_users_userFull.chats, false);
                userFull = tL_users_userFull.full_user;
            } else {
                userFull = null;
            }
            TLRPC.UserFull userFull2 = userFull;
            VoIPHelper.startCall(user, z, userFull2 != null && userFull2.video_calls_available, getParentActivity(), userFull2, getAccountInstance());
        }

        public void lambda$onCallUsersSelected$1(TLRPC.User user, boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda3(this, tLObject, user, z, 2));
        }

        public void lambda$onCallUsersSelected$2(TLObject tLObject, boolean z, HashSet hashSet, TLRPC.TL_error tL_error) {
            int i = 0;
            if (!(tLObject instanceof TLRPC.Updates)) {
                if (!(tLObject instanceof TL_phone.groupCall)) {
                    if (tL_error != null) {
                        LinkManager.this.getBulletinFactory().showForError(tL_error);
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
                VoIPHelper.joinConference(LaunchActivity.instance, this.currentAccount, tL_inputGroupCall, z, groupCall, hashSet);
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
            VoIPHelper.joinConference(LaunchActivity.instance, this.currentAccount, tL_inputGroupCall2, z, groupCall2, hashSet);
        }

        public void lambda$onCallUsersSelected$3(boolean z, HashSet hashSet, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LinkManager$1$$ExternalSyntheticLambda0(this, tLObject, z, hashSet, tL_error, 0));
        }

        @Override
        public void onCallUsersSelected(HashSet<Long> hashSet, boolean z) {
            if (hashSet.size() == 1) {
                TLRPC.User user = getMessagesController().getUser(hashSet.iterator().next());
                TLRPC.UserFull userFull = getMessagesController().getUserFull(user.id);
                if (userFull == null) {
                    TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                    tL_users_getFullUser.id = getMessagesController().getInputUser(user.id);
                    getConnectionsManager().sendRequest(tL_users_getFullUser, new LinkManager$1$$ExternalSyntheticLambda2(this, user, z, 0));
                    return;
                }
                VoIPHelper.startCall(user, z, userFull.video_calls_available, getParentActivity(), userFull, getAccountInstance());
            } else {
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new LinkManager$1$$ExternalSyntheticLambda2(this, z, hashSet, 4));
            }
            finishFragment();
        }
    }

    public class AnonymousClass3 extends ChatActivity {
        private boolean shownToast;
        final TLRPC.User[] val$manager;
        final long val$managerId;
        final TLRPC.User val$newBot;

        public AnonymousClass3(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j) {
            super(bundle);
            this.val$newBot = user;
            this.val$manager = userArr;
            this.val$managerId = j;
        }

        public void lambda$onBecomeFullyVisible$0(long j) {
            presentFragment(ChatActivity.of(j));
        }

        @Override
        public void onBecomeFullyVisible() {
            int i = 0;
            super.onBecomeFullyVisible();
            if (this.shownToast) {
                return;
            }
            this.shownToast = true;
            BulletinFactory.of(this).createSimpleBulletin(R.raw.contact_check, LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.val$newBot)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.val$manager[0])), new LinkManager$3$$ExternalSyntheticLambda0(this, this.val$managerId, i))).show();
        }
    }

    public LinkManager(LaunchActivity launchActivity, int i, Browser.Progress progress, boolean z) {
        this.activity = launchActivity;
        this.currentAccount = i;
        this.progress = progress;
        this.isExternalIntent = z;
    }

    public void cancel() {
        if (this.currentRequestId >= 0) {
            getConnectionsManager().cancelRequest(this.currentRequestId, true);
            this.currentRequestId = -1;
        }
    }

    public void lambda$handleInvoiceSlug$13() {
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

    public BulletinFactory getBulletinFactory() {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        return safeLastFragment == null ? BulletinFactory.global() : BulletinFactory.of(safeLastFragment);
    }

    private BaseFragment getLastFragment() {
        return LaunchActivity.getSafeLastFragment();
    }

    private INavigationLayout getParentLayout() {
        return this.activity.getActionBarLayout();
    }

    private boolean handleAiStyle(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        TL_aicompose.getTone gettone = new TL_aicompose.getTone();
        TL_aicompose.inputAiComposeToneSlug inputaicomposetoneslug = new TL_aicompose.inputAiComposeToneSlug();
        inputaicomposetoneslug.slug = str;
        gettone.tone = inputaicomposetoneslug;
        init();
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(gettone, new AiTonesController$$ExternalSyntheticLambda0(), new LinkManager$$ExternalSyntheticLambda6(this, 0));
        return true;
    }

    private boolean handleHttp(Uri uri) {
        String host = uri.getHost();
        if (host == null) {
            return false;
        }
        Matcher matcher = LaunchActivity.PREFIX_T_ME_PATTERN.matcher(host.toLowerCase());
        boolean zFind = matcher.find();
        if (!"telegram.me".equalsIgnoreCase(host) && !"t.me".equalsIgnoreCase(host) && !"telegram.dog".equalsIgnoreCase(host) && !zFind) {
            return false;
        }
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
                    if (pathSegments.size() < 2) {
                        return true;
                    }
                    return handleNewBot(str3, pathSegments.size() >= 3 ? pathSegments.get(2) : null, uri.getQueryParameter("name"));
                }
            }
        }
        return false;
    }

    private boolean handleInvoiceSlug(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        init();
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
        tL_inputInvoiceSlug.slug = str;
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
        setRequestId(getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new LinkManager$$ExternalSyntheticLambda0(this, tL_inputInvoiceSlug, str, 0)));
        return true;
    }

    private boolean handleNewBot(String str, String str2, String str3) {
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
        if (safeLastFragment != null && safeLastFragment.getContext() != null) {
            init();
            TLRPC.User[] userArr = {null};
            MessagesController.getInstance(this.currentAccount).getUserNameResolver().resolve(str, new LinkManager$$ExternalSyntheticLambda24(this, userArr, new LinkManager$$ExternalSyntheticLambda23(0, this, safeLastFragment, userArr, tL_requestPeerTypeCreateBot), i));
        }
        return true;
    }

    private boolean handleOAuth(Uri uri, String str) {
        if (!this.isExternalIntent) {
            return true;
        }
        if (isEmpty(str)) {
            return false;
        }
        init();
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
        tL_messages_requestUrlAuth.flags |= 4;
        tL_messages_requestUrlAuth.url = uri.toString();
        getConnectionsManager().sendRequestTyped(tL_messages_requestUrlAuth, new AiTonesController$$ExternalSyntheticLambda0(), new OAuthSheet$$ExternalSyntheticLambda19(8, this, tL_messages_requestUrlAuth));
        return true;
    }

    private boolean handleSettings(List<String> list) {
        boolean z;
        int i;
        int i2;
        int i3;
        BaseFragment lastFragment;
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
        String str = list.get(0);
        String str2 = list.size() > 1 ? list.get(1) : null;
        String str3 = list.size() > 2 ? list.get(2) : null;
        String str4 = list.size() > 3 ? list.get(3) : null;
        String str5 = list.size() > 4 ? list.get(4) : null;
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
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda2(25, this, filtersSetupActivity), 300L);
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
            if ("language".equalsIgnoreCase(str)) {
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
            } else {
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
                if ("login_email".equalsIgnoreCase(str)) {
                    init();
                    setRequestId(getConnectionsManager().sendRequest(new TL_account.getPassword(), new LinkManager$$ExternalSyntheticLambda10(this, 0), 10));
                    return true;
                }
                if ("chats".equalsIgnoreCase(str)) {
                    ActionBarLayout actionBarLayout = (ActionBarLayout) getParentLayout();
                    int iM = Theme.ResourcesProvider.CC.m(actionBarLayout, 1);
                    while (true) {
                        z = true;
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
                        mainTabsActivity.viewPager.scrollToPosition(2);
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
                        presentFragment(new AnonymousClass1(CallLogActivity$$ExternalSyntheticOutline0.m("isCall", true)));
                        return true;
                    }
                    presentFragment(new CallLogActivity());
                    return true;
                }
                if ("qr-code".equalsIgnoreCase(str)) {
                    if ("scan".equalsIgnoreCase(str2) && (lastFragment = getLastFragment()) != null) {
                        QrActivity.openCameraScanActivity(lastFragment);
                        return true;
                    }
                    if ("share".equalsIgnoreCase(str2)) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", getUserConfig().getClientUserId());
                        presentFragment(new QrActivity(bundle) {
                            @Override
                            public void onBecomeFullyVisible() {
                                super.onBecomeFullyVisible();
                                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda60(this, 2));
                            }
                        });
                        return true;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", getUserConfig().getClientUserId());
                    presentFragment(new QrActivity(bundle2));
                    return true;
                }
                if (!"chat".equalsIgnoreCase(str) || !"browser".equalsIgnoreCase(str2)) {
                    String str6 = str5;
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
                                profileActivity.whenFullyVisible(new LinkManager$$ExternalSyntheticLambda1(profileActivity, 1));
                            }
                            if ("posts".equalsIgnoreCase(str2)) {
                                profileActivity.whenFullyVisible(new LinkManager$$ExternalSyntheticLambda1(profileActivity, 2));
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
                                notificationsSettingsActivity.loadExceptions(new OAuthSheet$$ExternalSyntheticLambda9(this, notificationsSettingsActivity, i3, str7, 13));
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
                                LinkManager$$ExternalSyntheticLambda8 linkManager$$ExternalSyntheticLambda8 = new LinkManager$$ExternalSyntheticLambda8(this, str7, 1);
                                BaseFragment baseFragmentDetermineOpenFragment = PasscodeActivity.determineOpenFragment();
                                presentFragment(baseFragmentDetermineOpenFragment);
                                if (baseFragmentDetermineOpenFragment instanceof ActionIntroActivity) {
                                    ((ActionIntroActivity) baseFragmentDetermineOpenFragment).setOnOpenedSettings(linkManager$$ExternalSyntheticLambda8);
                                    return true;
                                }
                                if (baseFragmentDetermineOpenFragment instanceof PasscodeActivity) {
                                    ((PasscodeActivity) baseFragmentDetermineOpenFragment).setOnOpenedSettings(linkManager$$ExternalSyntheticLambda8);
                                    return true;
                                }
                            } else {
                                if (!TextUtils.isEmpty(str7) && "2sv".equalsIgnoreCase(str2)) {
                                    init();
                                    setRequestId(getConnectionsManager().sendRequest(new TL_account.getPassword(), new LinkManager$$ExternalSyntheticLambda15(0, this, str7), 10));
                                    return true;
                                }
                                if (!TextUtils.isEmpty(str7) && "passkey".equalsIgnoreCase(str2) && Build.VERSION.SDK_INT >= 28) {
                                    init();
                                    setRequestId(getConnectionsManager().sendRequestTyped(new TL_account.getPasskeys(), new LinkManager$$ExternalSyntheticLambda16(), new OAuthSheet$$ExternalSyntheticLambda19(7, this, str7)));
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
                                } else if (MessagesController.getInstance(this.currentAccount).autoarchiveAvailable || !"archive-and-mute".equalsIgnoreCase(str2)) {
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
                                    dataUsage2Activity.selectTab(1);
                                }
                                if ("wifi".equalsIgnoreCase(str7)) {
                                    dataUsage2Activity.selectTab(2);
                                }
                                if ("roaming".equalsIgnoreCase(str7)) {
                                    dataUsage2Activity.selectTab(3);
                                }
                                if ("reset".equalsIgnoreCase(str7)) {
                                    dataUsage2Activity.scrollToReset();
                                    return true;
                                }
                            } else {
                                int i4 = 2;
                                if ("auto-download".equalsIgnoreCase(str2)) {
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
                                    if (!"groups".equalsIgnoreCase(str7)) {
                                        i4 = "channels".equalsIgnoreCase(str7) ? 4 : 1;
                                    }
                                    presentFragment(new SaveToGallerySettingsActivity(NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(i4, "type")));
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
                            }
                        } else if ("appearance".equalsIgnoreCase(str)) {
                            if ("themes".equalsIgnoreCase(str2) || "theme".equalsIgnoreCase(str2)) {
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
                                    presentFragment(new PeerColorActivity(0L));
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
                        } else {
                            if (!"power-saving".equalsIgnoreCase(str)) {
                                if ("stars".equalsIgnoreCase(str)) {
                                    if ("top-up".equalsIgnoreCase(str2)) {
                                        new StarsIntroActivity.StarsOptionsSheet(this.activity, null).show();
                                        return true;
                                    }
                                    if ("stats".equalsIgnoreCase(str2)) {
                                        presentFragment(new BotStarsActivity(0, getUserConfig().getClientUserId()));
                                        return true;
                                    }
                                    if ("gift".equalsIgnoreCase(str2)) {
                                        StarsController.getInstance(this.currentAccount).getGiftOptions();
                                        UserSelectorBottomSheet.open(1, BirthdayController.getInstance(this.currentAccount).getState());
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
                                    presentFragment(new PremiumPreviewFragment("link"));
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
                                    UserSelectorBottomSheet.open(0, BirthdayController.getInstance(this.currentAccount).getState());
                                    return true;
                                }
                                if ("ask-question".equalsIgnoreCase(str) || "ask-a-question".equalsIgnoreCase(str)) {
                                    AlertsCreator.createSupportAlert(getLastFragment(), null).show();
                                    return true;
                                }
                                if ("faq".equalsIgnoreCase(str)) {
                                    Browser.openUrl(this.activity, LocaleController.getString(R.string.TelegramFaqUrl));
                                    return true;
                                }
                                if ("features".equalsIgnoreCase(str)) {
                                    Browser.openUrl(this.activity, LocaleController.getString(R.string.TelegramFeaturesUrl));
                                    return true;
                                }
                                if ("privacy-policy".equalsIgnoreCase(str)) {
                                    Browser.openUrl(this.activity, LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                                liteModeSettingsActivity.scrollToType(1);
                                return true;
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
            }
        }
        return true;
    }

    private boolean handleTg(Uri uri) {
        ?? r10;
        Uri uriNormalizeTgUri = normalizeTgUri(uri);
        List<String> pathSegments = uriNormalizeTgUri.getPathSegments();
        if (pathSegments == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList(pathSegments);
        String authority = uriNormalizeTgUri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            arrayList.add(0, authority);
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        String str = (String) arrayList.get(0);
        String str2 = arrayList.size() > 1 ? (String) arrayList.get(1) : null;
        if ("newbot".equalsIgnoreCase(str)) {
            return handleNewBot(uriNormalizeTgUri.getQueryParameter("manager"), uriNormalizeTgUri.getQueryParameter("username"), uriNormalizeTgUri.getQueryParameter("name"));
        }
        if ("resolve".equalsIgnoreCase(str)) {
            return handleTgResolve(uriNormalizeTgUri);
        }
        if ("invoice".equalsIgnoreCase(str)) {
            return handleInvoiceSlug(uriNormalizeTgUri.getQueryParameter("slug"));
        }
        if ("oauth".equalsIgnoreCase(str)) {
            return handleOAuth(uriNormalizeTgUri, uriNormalizeTgUri.getQueryParameter("token"));
        }
        if ("settings".equalsIgnoreCase(str)) {
            return handleSettings(arrayList.subList(1, arrayList.size()));
        }
        if ("chats".equalsIgnoreCase(str)) {
            "search".equalsIgnoreCase(str2);
            "edit".equalsIgnoreCase(str2);
            "emoji-status".equalsIgnoreCase(str2);
        }
        if ("new".equalsIgnoreCase(str)) {
            if ("group".equalsIgnoreCase(str2)) {
                presentFragment(new GroupCreateActivity(new Bundle()), false);
                return true;
            }
            if ("contact".equalsIgnoreCase(str2)) {
                new NewContactBottomSheet(getLastFragment(), this.activity).show();
                return true;
            }
            if (!"channel".equalsIgnoreCase(str2)) {
                presentFragment(new ContactsActivity(CallLogActivity$$ExternalSyntheticOutline0.m("destroyAfterSelect", true)));
                return true;
            }
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (BuildVars.DEBUG_VERSION || !globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new ActionIntroActivity(0));
                globalMainSettings.edit().putBoolean("channel_intro", true).commit();
            } else {
                presentFragment(new ChannelCreateActivity(NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(0, "step")));
            }
            return true;
        }
        if (!"post".equalsIgnoreCase(str)) {
            if (!"contacts".equalsIgnoreCase(str)) {
                if ("addstyle".equalsIgnoreCase(str)) {
                    return handleAiStyle(uriNormalizeTgUri.getQueryParameter("slug"));
                }
                return false;
            }
            if ("new".equalsIgnoreCase(str2)) {
                new NewContactBottomSheet(getLastFragment(), this.activity).show();
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("needPhonebook", true);
            bundle.putBoolean("needFinishFragment", true);
            presentFragment(new ContactsActivity(bundle));
            "search".equalsIgnoreCase(str2);
            "sort".equalsIgnoreCase(str2);
            if ("invite".equalsIgnoreCase(str2)) {
                scrollTo("phonebookRow");
            }
            return true;
        }
        boolean zEqualsIgnoreCase = "video".equalsIgnoreCase(str2);
        if ("live".equalsIgnoreCase(str2)) {
            r10 = zEqualsIgnoreCase;
            r10 = -1;
        }
        r10 = zEqualsIgnoreCase;
        StoryRecorder storyRecorder = StoryRecorder.getInstance(this.activity, this.currentAccount);
        if (storyRecorder.mode != r10) {
            storyRecorder.mode = r10;
            ?? r2 = storyRecorder.modeSwitcherView;
            if (r2 != 0) {
                r2.switchMode(r10);
            }
            storyRecorder.showVideoTimer(r10 == 1, true);
            CollageLayoutButton.CollageLayoutListView collageLayoutListView = storyRecorder.collageListView;
            if (collageLayoutListView != null) {
                collageLayoutListView.setVisible(false, true);
            }
            storyRecorder.updateActionBarButtons(false);
        }
        storyRecorder.open(null);
        return true;
    }

    private boolean handleTgResolve(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList(pathSegments);
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            arrayList.add(0, authority);
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        arrayList.remove(0);
        String queryParameter = uri.getQueryParameter("domain");
        String queryParameter2 = uri.getQueryParameter("startapp");
        if (!"oauth".equalsIgnoreCase(queryParameter) || isEmpty(queryParameter2)) {
            return false;
        }
        return handleOAuth(uri, queryParameter2);
    }

    private boolean handleTonsite(Uri uri) {
        Browser.openUrl(this.activity, uri, true, true);
        return true;
    }

    private void init() {
        if (this.inited || this.done) {
            return;
        }
        Browser.Progress progress = this.progress;
        if (progress == null) {
            if (this.progressDialog == null) {
                this.progressDialog = new AlertDialog(this.activity, 3, null);
            }
            this.progressDialog.setOnCancelListener(new LinkManager$$ExternalSyntheticLambda4(this, 0));
            this.progressDialog.showDelayed(300L);
        } else {
            progress.onCancel(new LinkManager$$ExternalSyntheticLambda5(this, 0));
            this.progress.init();
        }
        this.inited = true;
    }

    private static boolean isEmpty(String str) {
        return TextUtils.isEmpty(str);
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

    public void lambda$handleAiStyle$22(TL_aicompose.Tones tones, TLRPC.TL_error tL_error) {
        lambda$handleInvoiceSlug$13();
        if (tones instanceof TL_aicompose.TL_tones) {
            TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_tones.users, false);
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment == null || tL_tones.tones.isEmpty()) {
                return;
            }
            new AIEditorAlert.AiStyleAlert(safeLastFragment.getContext(), tL_tones.tones.get(0), safeLastFragment.getResourceProvider()).show();
            return;
        }
        if (tL_error != null) {
            if (!"AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error.text)) {
                getBulletinFactory().showForError(tL_error);
                return;
            }
            FactCheckController$$ExternalSyntheticOutline0.m(R.string.AIEditorStyleNotFound, getBulletinFactory(), R.raw.error);
        }
    }

    public static void lambda$handleInvoiceSlug$14(Runnable runnable, String str) {
        if (runnable == null || !"paid".equals(str)) {
            return;
        }
        runnable.run();
    }

    public static void lambda$handleInvoiceSlug$15(Runnable runnable, PaymentFormActivity.InvoiceStatus invoiceStatus) {
        if (invoiceStatus == PaymentFormActivity.InvoiceStatus.PAID) {
            runnable.run();
        }
    }

    public void lambda$handleInvoiceSlug$16(TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, String str) {
        PaymentFormActivity paymentFormActivity;
        if (tL_error != null) {
            if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error.text)) {
                UserNameResolver$$ExternalSyntheticOutline0.m(getBulletinFactory(), R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid);
            } else {
                UserNameResolver$$ExternalSyntheticOutline0.m(getBulletinFactory(), R.string.PaymentInvoiceLinkInvalid);
            }
        } else if (!this.activity.isFinishing()) {
            if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
                LaunchActivity launchActivity = this.activity;
                Runnable runnable = launchActivity.navigateToPremiumGiftCallback;
                launchActivity.navigateToPremiumGiftCallback = null;
                StarsController.getInstance(this.currentAccount, false).openPaymentForm(new LinkManager$$ExternalSyntheticLambda5(this, 1), null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject, new LinkManager$$ExternalSyntheticLambda19(0, runnable));
                return;
            }
            if (tLObject instanceof TLRPC.PaymentForm) {
                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                MessagesController.getInstance(this.currentAccount).putUsers(paymentForm.users, false);
                paymentFormActivity = new PaymentFormActivity(paymentForm, str, getLastFragment());
            } else {
                paymentFormActivity = tLObject instanceof TLRPC.PaymentReceipt ? new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject) : null;
            }
            if (paymentFormActivity != null) {
                LaunchActivity launchActivity2 = this.activity;
                Runnable runnable2 = launchActivity2.navigateToPremiumGiftCallback;
                if (runnable2 != null) {
                    launchActivity2.navigateToPremiumGiftCallback = null;
                    paymentFormActivity.setPaymentFormCallback(new LinkManager$$ExternalSyntheticLambda20(0, runnable2));
                }
                presentFragment(paymentFormActivity);
            }
        }
        lambda$handleInvoiceSlug$13();
    }

    public void lambda$handleInvoiceSlug$17(TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda22(this, tL_error, tLObject, tL_inputInvoiceSlug, str, 0));
    }

    public void lambda$handleNewBot$19(TLRPC.User[] userArr, TLRPC.User user) {
        lambda$handleInvoiceSlug$13();
        if (user == null) {
            return;
        }
        long j = userArr[0].id;
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        presentFragment(new AnonymousClass3(bundle, user, userArr, j));
    }

    public void lambda$handleNewBot$20(BaseFragment baseFragment, TLRPC.User[] userArr, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot) {
        CreateBotAlert.show(baseFragment.getContext(), this.currentAccount, userArr[0], tL_requestPeerTypeCreateBot, true, new OAuthSheet$$ExternalSyntheticLambda1(22, this, userArr), baseFragment.getResourceProvider(), getBulletinFactory(), false);
    }

    public void lambda$handleNewBot$21(TLRPC.User[] userArr, Runnable runnable, Long l) {
        TLRPC.User user = l == null ? null : MessagesController.getInstance(this.currentAccount).getUser(l);
        userArr[0] = user;
        if (user != null) {
            runnable.run();
        } else {
            lambda$handleInvoiceSlug$13();
            UserNameResolver$$ExternalSyntheticOutline0.m(getBulletinFactory(), R.string.NoUsernameFound);
        }
    }

    public void lambda$handleOAuth$18(TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, TLRPC.UrlAuthResult urlAuthResult, TLRPC.TL_error tL_error) {
        lambda$handleInvoiceSlug$13();
        if (tL_error == null) {
            OAuthSheet.handle(this.isExternalIntent, this.currentAccount, tL_messages_requestUrlAuth, urlAuthResult);
        } else if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
            getBulletinFactory().createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.BotAuthLoggedInFailTitle), LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain)).show();
        } else {
            getBulletinFactory().showForError(tL_error);
        }
    }

    public void lambda$handleSettings$0(FiltersSetupActivity filtersSetupActivity) {
        filtersSetupActivity.createFolder(getParentLayout());
    }

    public void lambda$handleSettings$1(TLObject tLObject) {
        lambda$handleInvoiceSlug$13();
        if (tLObject != null) {
            this.activity.lambda$handleIntent$19((TL_account.Password) tLObject);
        }
    }

    public void lambda$handleSettings$10(TLObject tLObject, String str) {
        lambda$handleInvoiceSlug$13();
        if (tLObject == null) {
            return;
        }
        TL_account.Password password = (TL_account.Password) tLObject;
        if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, false)) {
            AlertsCreator.showUpdateAppAlert(this.activity, LocaleController.getString(R.string.UpdateAppAlert), true);
        }
        LinkManager$$ExternalSyntheticLambda8 linkManager$$ExternalSyntheticLambda8 = new LinkManager$$ExternalSyntheticLambda8(this, str, 0);
        if (!password.has_password) {
            TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
            twoStepVerificationSetupActivity.setOnOpenedSettings(linkManager$$ExternalSyntheticLambda8);
            presentFragment(twoStepVerificationSetupActivity);
        } else {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            twoStepVerificationActivity.setPassword(password);
            presentFragment(twoStepVerificationActivity);
            linkManager$$ExternalSyntheticLambda8.run();
        }
    }

    public void lambda$handleSettings$11(String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda25(this, tLObject, str, 0));
    }

    public void lambda$handleSettings$12(String str, TL_account.Passkeys passkeys, TLRPC.TL_error tL_error) {
        lambda$handleInvoiceSlug$13();
        if (passkeys == null) {
            return;
        }
        presentFragment(new PasskeysActivity(passkeys.passkeys));
        if ("create".equalsIgnoreCase(str)) {
            scrollTo("addPasskeyRow");
        }
    }

    public void lambda$handleSettings$2(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda2(0, this, tLObject));
    }

    public static void lambda$handleSettings$3(ProfileActivity profileActivity) {
        SharedMediaLayout sharedMediaLayout = profileActivity.sharedMediaLayout;
        if (sharedMediaLayout != null) {
            sharedMediaLayout.scrollToPage(14);
            profileActivity.scrollToSharedMedia();
        }
    }

    public static void lambda$handleSettings$4(ProfileActivity profileActivity) {
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda1(profileActivity, 0), 200L);
    }

    public static void lambda$handleSettings$5(ProfileActivity profileActivity) {
        SharedMediaLayout sharedMediaLayout = profileActivity.sharedMediaLayout;
        if (sharedMediaLayout != null) {
            sharedMediaLayout.scrollToPage(14);
            profileActivity.scrollToSharedMedia();
        }
    }

    public static void lambda$handleSettings$6(ProfileActivity profileActivity) {
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda1(profileActivity, 3), 200L);
    }

    public void lambda$handleSettings$7(NotificationsSettingsActivity notificationsSettingsActivity, int i, String str) {
        lambda$handleInvoiceSlug$13();
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivityMakeNotificationsCustomSettingsActivity = notificationsSettingsActivity.makeNotificationsCustomSettingsActivity(i);
        notificationsCustomSettingsActivityMakeNotificationsCustomSettingsActivity.expanded = true;
        notificationsCustomSettingsActivityMakeNotificationsCustomSettingsActivity.updateRows(false);
        presentFragment(notificationsCustomSettingsActivityMakeNotificationsCustomSettingsActivity);
        if ("show".equalsIgnoreCase(str)) {
            scrollTo("showRow");
        }
        if ("new".equalsIgnoreCase(str)) {
            scrollTo("newRow");
        }
        if ("important".equalsIgnoreCase(str)) {
            scrollTo("importantRow");
        }
        if ("messages".equalsIgnoreCase(str)) {
            scrollTo("messagesRow");
        }
        if ("stories".equalsIgnoreCase(str)) {
            scrollTo("storiesRow");
        }
        if ("preview".equalsIgnoreCase(str)) {
            scrollTo("previewRow");
        }
        if ("show-sender".equalsIgnoreCase(str)) {
            scrollTo("showSenderRow");
        }
        if ("sound".equalsIgnoreCase(str)) {
            scrollTo("soundRow");
        }
        if ("add-exception".equalsIgnoreCase(str)) {
            scrollTo("addExceptionRow");
        }
        if ("delete-exceptions".equalsIgnoreCase(str)) {
            scrollTo("deleteExceptionsRow");
        }
        if ("light-color".equalsIgnoreCase(str)) {
            scrollTo("lightColorRow");
        }
        if ("vibrate".equalsIgnoreCase(str)) {
            scrollTo("vibrateRow");
        }
        if ("popup".equalsIgnoreCase(str)) {
            scrollTo("popupRow");
        }
        if ("priority".equalsIgnoreCase(str)) {
            scrollTo("priorityRow");
        }
    }

    public void lambda$handleSettings$8(String str) {
        if ("disable".equalsIgnoreCase(str)) {
            scrollTo("disablePasscodeRow");
        }
        if ("change".equalsIgnoreCase(str)) {
            scrollTo("changePasscodeRow");
        }
        if ("auto-lock".equalsIgnoreCase(str)) {
            scrollTo("autoLockRow");
        }
        if ("fingerprint".equalsIgnoreCase(str)) {
            scrollTo("fingerprintRow");
        }
    }

    public void lambda$handleSettings$9(String str) {
        if ("disable".equalsIgnoreCase(str)) {
            scrollTo("turnPasswordOffRow");
        }
        if ("change".equalsIgnoreCase(str)) {
            scrollTo("changePasswordRow");
        }
        if ("change-email".equalsIgnoreCase(str)) {
            scrollTo("emailRow");
        }
    }

    public void lambda$init$23(DialogInterface dialogInterface) {
        cancel();
    }

    private Uri normalizeTgUri(Uri uri) {
        String scheme;
        String schemeSpecificPart;
        if (uri == null || !uri.isOpaque() || (scheme = uri.getScheme()) == null || uri.getAuthority() != null || (schemeSpecificPart = uri.getSchemeSpecificPart()) == null) {
            return uri;
        }
        return Uri.parse(scheme + "://" + schemeSpecificPart);
    }

    private void presentFragment(BaseFragment baseFragment) {
        presentFragment(baseFragment, false);
    }

    private void scrollTo(String str) {
        AndroidUtilities.scrollToFragmentRow(getParentLayout(), str);
    }

    private void setRequestId(int i) {
        this.currentRequestId = i;
    }

    public ConnectionsManager getConnectionsManager() {
        return ConnectionsManager.getInstance(this.currentAccount);
    }

    public MessagesController getMessagesController() {
        return MessagesController.getInstance(this.currentAccount);
    }

    public UserConfig getUserConfig() {
        return UserConfig.getInstance(this.currentAccount);
    }

    public boolean handle(Uri uri) {
        if (uri == null) {
            return false;
        }
        String scheme = uri.getScheme();
        if ("tonsite".equalsIgnoreCase(scheme)) {
            return handleTonsite(uri);
        }
        if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
            return handleHttp(uri);
        }
        if ("tg".equalsIgnoreCase(scheme)) {
            return handleTg(uri);
        }
        return false;
    }

    private void presentFragment(BaseFragment baseFragment, boolean z) {
        this.activity.presentFragment(baseFragment, z, false);
        if (AndroidUtilities.isTablet()) {
            ActionBarLayout actionBarLayout = this.activity.actionBarLayout;
            actionBarLayout.getClass();
            actionBarLayout.rebuildAllFragmentViews(true, true);
            ActionBarLayout actionBarLayout2 = this.activity.rightActionBarLayout;
            actionBarLayout2.getClass();
            actionBarLayout2.rebuildAllFragmentViews(true, true);
        }
    }
}
