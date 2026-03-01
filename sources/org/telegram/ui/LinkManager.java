package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotForumHelper$$ExternalSyntheticLambda2;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public class LinkManager {
    private final LaunchActivity activity;
    private final int currentAccount;
    private int currentRequestId = -1;
    private boolean done;
    private boolean inited;
    private final boolean isExternalIntent;
    private final Browser.Progress progress;
    private AlertDialog progressDialog;

    public LinkManager(LaunchActivity launchActivity, int i, Browser.Progress progress, boolean z) {
        this.activity = launchActivity;
        this.currentAccount = i;
        this.progress = progress;
        this.isExternalIntent = z;
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

    private boolean handleTonsite(Uri uri) {
        Browser.openUrl(this.activity, uri);
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
            StringBuilder sb = new StringBuilder();
            sb.append("https://t.me/");
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
                if ("oauth".equalsIgnoreCase(str2)) {
                    return handleOAuth(uri, uri.getQueryParameter("startapp"));
                }
            }
        }
        return false;
    }

    private Uri normalizeTgUri(Uri uri) {
        String scheme;
        String schemeSpecificPart;
        if (uri == null || !uri.isOpaque() || (scheme = uri.getScheme()) == null || uri.getAuthority() != null || (schemeSpecificPart = uri.getSchemeSpecificPart()) == null) {
            return uri;
        }
        return Uri.parse(scheme + "://" + schemeSpecificPart);
    }

    private boolean handleTg(Uri uri) {
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
            if ("channel".equalsIgnoreCase(str2)) {
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 0);
                    presentFragment(new ChannelCreateActivity(bundle));
                } else {
                    presentFragment(new ActionIntroActivity(0));
                    globalMainSettings.edit().putBoolean("channel_intro", true).commit();
                }
                return true;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("destroyAfterSelect", true);
            presentFragment(new ContactsActivity(bundle2));
            return true;
        }
        if ("post".equalsIgnoreCase(str)) {
            ?? EqualsIgnoreCase = "video".equalsIgnoreCase(str2);
            if ("live".equalsIgnoreCase(str2)) {
                EqualsIgnoreCase = -1;
            }
            StoryRecorder.getInstance(this.activity, this.currentAccount).setMode(EqualsIgnoreCase).open(null);
            return true;
        }
        if (!"contacts".equalsIgnoreCase(str)) {
            return false;
        }
        if ("new".equalsIgnoreCase(str2)) {
            new NewContactBottomSheet(getLastFragment(), this.activity).show();
            return true;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean("needPhonebook", true);
        bundle3.putBoolean("needFinishFragment", true);
        presentFragment(new ContactsActivity(bundle3));
        "search".equalsIgnoreCase(str2);
        "sort".equalsIgnoreCase(str2);
        if ("invite".equalsIgnoreCase(str2)) {
            scrollTo("phonebookRow");
        }
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

    private boolean handleSettings(java.util.List r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LinkManager.handleSettings(java.util.List):boolean");
    }

    public void lambda$handleSettings$0(FiltersSetupActivity filtersSetupActivity) {
        filtersSetupActivity.createFolder(getParentLayout());
    }

    public void lambda$handleSettings$2(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$handleSettings$1(tLObject);
            }
        });
    }

    public void lambda$handleSettings$1(TLObject tLObject) {
        lambda$handleInvoiceSlug$13();
        if (tLObject != null) {
            this.activity.lambda$handleIntent$19((TL_account.Password) tLObject);
        }
    }

    class AnonymousClass1 extends GroupCreateActivity {
        AnonymousClass1(Bundle bundle) {
            super(bundle);
        }

        @Override
        protected void onCallUsersSelected(final HashSet hashSet, final boolean z) {
            if (hashSet.size() == 1) {
                final TLRPC.User user = getMessagesController().getUser((Long) hashSet.iterator().next());
                TLRPC.UserFull userFull = getMessagesController().getUserFull(user.id);
                if (userFull == null) {
                    TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                    tL_users_getFullUser.id = getMessagesController().getInputUser(user.id);
                    getConnectionsManager().sendRequest(tL_users_getFullUser, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            this.f$0.lambda$onCallUsersSelected$1(user, z, tLObject, tL_error);
                        }
                    });
                    return;
                }
                VoIPHelper.startCall(user, z, userFull.video_calls_available, getParentActivity(), userFull, getAccountInstance());
            } else {
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$onCallUsersSelected$3(z, hashSet, tLObject, tL_error);
                    }
                });
            }
            finishFragment();
        }

        public void lambda$onCallUsersSelected$1(final TLRPC.User user, final boolean z, final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onCallUsersSelected$0(tLObject, user, z);
                }
            });
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

        public void lambda$onCallUsersSelected$3(final boolean z, final HashSet hashSet, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onCallUsersSelected$2(tLObject, z, hashSet, tL_error);
                }
            });
        }

        public void lambda$onCallUsersSelected$2(TLObject tLObject, boolean z, HashSet hashSet, TLRPC.TL_error tL_error) {
            if (tLObject instanceof TLRPC.Updates) {
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                MessagesController.getInstance(this.currentAccount).putUsers(updates.users, false);
                MessagesController.getInstance(this.currentAccount).putChats(updates.chats, false);
                Iterator it = MessagesController.findUpdatesAndRemove(updates, TLRPC.TL_updateGroupCall.class).iterator();
                TLRPC.GroupCall groupCall = null;
                while (it.hasNext()) {
                    groupCall = ((TLRPC.TL_updateGroupCall) it.next()).call;
                }
                if (LaunchActivity.instance == null || groupCall == null) {
                    return;
                }
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.id = groupCall.id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                VoIPHelper.joinConference(LaunchActivity.instance, this.currentAccount, tL_inputGroupCall, z, groupCall, hashSet);
                return;
            }
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
            TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall2 = groupcall.call;
            tL_inputGroupCall2.id = groupCall2.id;
            tL_inputGroupCall2.access_hash = groupCall2.access_hash;
            VoIPHelper.joinConference(LaunchActivity.instance, this.currentAccount, tL_inputGroupCall2, z, groupCall2, hashSet);
        }
    }

    public static void lambda$handleSettings$4(final ProfileActivity profileActivity) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LinkManager.lambda$handleSettings$3(profileActivity);
            }
        }, 200L);
    }

    public static void lambda$handleSettings$3(ProfileActivity profileActivity) {
        SharedMediaLayout sharedMediaLayout = profileActivity.sharedMediaLayout;
        if (sharedMediaLayout != null) {
            sharedMediaLayout.scrollToPage(14);
            profileActivity.scrollToSharedMedia();
        }
    }

    public static void lambda$handleSettings$6(final ProfileActivity profileActivity) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LinkManager.lambda$handleSettings$5(profileActivity);
            }
        }, 200L);
    }

    public static void lambda$handleSettings$5(ProfileActivity profileActivity) {
        SharedMediaLayout sharedMediaLayout = profileActivity.sharedMediaLayout;
        if (sharedMediaLayout != null) {
            sharedMediaLayout.scrollToPage(14);
            profileActivity.scrollToSharedMedia();
        }
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

    public void lambda$handleSettings$11(final String str, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$handleSettings$10(tLObject, str);
            }
        });
    }

    public void lambda$handleSettings$10(TLObject tLObject, final String str) {
        lambda$handleInvoiceSlug$13();
        if (tLObject == null) {
            return;
        }
        TL_account.Password password = (TL_account.Password) tLObject;
        if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, false)) {
            AlertsCreator.showUpdateAppAlert(this.activity, LocaleController.getString(R.string.UpdateAppAlert), true);
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$handleSettings$9(str);
            }
        };
        if (password.has_password) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            twoStepVerificationActivity.setPassword(password);
            presentFragment(twoStepVerificationActivity);
            runnable.run();
            return;
        }
        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
        twoStepVerificationSetupActivity.setOnOpenedSettings(runnable);
        presentFragment(twoStepVerificationSetupActivity);
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

    private boolean handleInvoiceSlug(final String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        init();
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        final TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
        tL_inputInvoiceSlug.slug = str;
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
        setRequestId(getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$handleInvoiceSlug$17(tL_inputInvoiceSlug, str, tLObject, tL_error);
            }
        }));
        return true;
    }

    public void lambda$handleInvoiceSlug$17(final TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$handleInvoiceSlug$16(tL_error, tLObject, tL_inputInvoiceSlug, str);
            }
        });
    }

    public void lambda$handleInvoiceSlug$16(TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, String str) {
        PaymentFormActivity paymentFormActivity;
        if (tL_error != null) {
            if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error.text)) {
                getBulletinFactory().createErrorBulletin(LocaleController.getString(R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid)).show();
            } else {
                getBulletinFactory().createErrorBulletin(LocaleController.getString(R.string.PaymentInvoiceLinkInvalid)).show();
            }
        } else if (!this.activity.isFinishing()) {
            if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
                LaunchActivity launchActivity = this.activity;
                final Runnable runnable = launchActivity.navigateToPremiumGiftCallback;
                launchActivity.navigateToPremiumGiftCallback = null;
                StarsController.getInstance(this.currentAccount).openPaymentForm(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$handleInvoiceSlug$13();
                    }
                }, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        LinkManager.lambda$handleInvoiceSlug$14(runnable, (String) obj);
                    }
                });
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
                final Runnable runnable2 = launchActivity2.navigateToPremiumGiftCallback;
                if (runnable2 != null) {
                    launchActivity2.navigateToPremiumGiftCallback = null;
                    paymentFormActivity.setPaymentFormCallback(new PaymentFormActivity.PaymentFormCallback() {
                        @Override
                        public final void onInvoiceStatusChanged(PaymentFormActivity.InvoiceStatus invoiceStatus) {
                            LinkManager.lambda$handleInvoiceSlug$15(runnable2, invoiceStatus);
                        }
                    });
                }
                presentFragment(paymentFormActivity);
            }
        }
        lambda$handleInvoiceSlug$13();
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

    private boolean handleOAuth(Uri uri, String str) {
        if (!this.isExternalIntent) {
            return true;
        }
        if (isEmpty(str)) {
            return false;
        }
        init();
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
        tL_messages_requestUrlAuth.flags |= 4;
        tL_messages_requestUrlAuth.url = uri.toString();
        getConnectionsManager().sendRequestTyped(tL_messages_requestUrlAuth, new BotForumHelper$$ExternalSyntheticLambda2(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$handleOAuth$18(tL_messages_requestUrlAuth, (TLRPC.UrlAuthResult) obj, (TLRPC.TL_error) obj2);
            }
        });
        return true;
    }

    public void lambda$handleOAuth$18(TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, TLRPC.UrlAuthResult urlAuthResult, TLRPC.TL_error tL_error) {
        lambda$handleInvoiceSlug$13();
        if (tL_error != null) {
            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                getBulletinFactory().createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.BotAuthLoggedInFailTitle), LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain)).show();
                return;
            } else {
                getBulletinFactory().showForError(tL_error);
                return;
            }
        }
        OAuthSheet.handle(this.isExternalIntent, this.currentAccount, tL_messages_requestUrlAuth, urlAuthResult);
    }

    private void setRequestId(int i) {
        this.currentRequestId = i;
    }

    private void presentFragment(BaseFragment baseFragment) {
        presentFragment(baseFragment, false);
    }

    private void presentFragment(BaseFragment baseFragment, boolean z) {
        this.activity.presentFragment(baseFragment, z, false);
        if (AndroidUtilities.isTablet()) {
            this.activity.actionBarLayout.rebuildFragments(1);
            this.activity.rightActionBarLayout.rebuildFragments(1);
        }
    }

    private INavigationLayout getParentLayout() {
        return this.activity.getActionBarLayout();
    }

    private void scrollTo(String str) {
        AndroidUtilities.scrollToFragmentRow(getParentLayout(), str);
    }

    private BaseFragment getLastFragment() {
        return LaunchActivity.getSafeLastFragment();
    }

    public BulletinFactory getBulletinFactory() {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return BulletinFactory.global();
        }
        return BulletinFactory.of(safeLastFragment);
    }

    public UserConfig getUserConfig() {
        return UserConfig.getInstance(this.currentAccount);
    }

    public ConnectionsManager getConnectionsManager() {
        return ConnectionsManager.getInstance(this.currentAccount);
    }

    private void init() {
        if (this.inited || this.done) {
            return;
        }
        Browser.Progress progress = this.progress;
        if (progress == null) {
            if (this.progressDialog == null) {
                this.progressDialog = new AlertDialog(this.activity, 3);
            }
            this.progressDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f$0.lambda$init$19(dialogInterface);
                }
            });
            this.progressDialog.showDelayed(300L);
        } else {
            progress.onCancel(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.cancel();
                }
            });
            this.progress.init();
        }
        this.inited = true;
    }

    public void lambda$init$19(DialogInterface dialogInterface) {
        cancel();
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

    private static boolean isEmpty(String str) {
        return TextUtils.isEmpty(str);
    }

    public static boolean isWebAppLink(java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LinkManager.isWebAppLink(java.lang.String):boolean");
    }
}
