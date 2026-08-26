package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.AvatarsImageView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;

public class GroupCallSheet {

    public static class UserView extends FrameLayout {
        private final AvatarDrawable avatarDrawable;
        private final int currentAccount;
        private final BackupImageView imageView;
        private final LinkSpanDrawable.LinksTextView textView;

        public static class Factory extends UItem.UItemFactory<UserView> {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            public static UItem asUser(long j) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.dialogId = j;
                return uItemOfFactory;
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((UserView) view).set(uItem.dialogId);
            }

            @Override
            public UserView createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new UserView(context, i, resourcesProvider);
            }
        }

        public UserView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.avatarDrawable = new AvatarDrawable();
            this.currentAccount = i;
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(28.0f));
            addView(backupImageView, LayoutHelper.createFrame(56, 56.0f, 49, 0.0f, 17.0f, 0.0f, 0.0f));
            LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView = TextHelper.makeLinkTextView(context, 12.0f, Theme.key_windowBackgroundWhiteBlackText, false, resourcesProvider);
            this.textView = linksTextViewMakeLinkTextView;
            linksTextViewMakeLinkTextView.setGravity(17);
            addView(linksTextViewMakeLinkTextView, LayoutHelper.createFrame(-2, -2.0f, 49, 6.0f, 77.66f, 6.0f, 0.0f));
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(82.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        }

        public void set(long j) {
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(j);
            this.avatarDrawable.setInfo(userOrChat);
            this.imageView.setForUserOrChat(userOrChat, this.avatarDrawable);
            this.textView.setText(DialogObject.getName(userOrChat));
            this.textView.setMaxWidth(Math.max(AndroidUtilities.dp(41.0f), HintView2.cutInFancyHalf(this.textView.getText(), this.textView.getPaint())));
        }
    }

    public static void lambda$show$0(AlertDialog alertDialog, Browser.Progress progress, TLObject tLObject, int i, Context context, long j, TLRPC.InputGroupCall inputGroupCall, TLRPC.TL_error tL_error) {
        BaseFragment safeLastFragment;
        ConferenceCall conferenceCall;
        TLRPC.GroupCall groupCall;
        LaunchActivity launchActivity;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        if (progress != null) {
            progress.end();
        }
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(i).putUsers(groupcall.users, false);
            MessagesController.getInstance(i).putChats(groupcall.chats, false);
            if (VoIPService.getSharedInstance() == null || (conferenceCall = VoIPService.getSharedInstance().conference) == null || (groupCall = conferenceCall.groupCall) == null || groupcall.call.id != groupCall.id || (launchActivity = LaunchActivity.instance) == null) {
                show(context, i, j, inputGroupCall, groupcall.call, groupcall.participants);
                return;
            } else {
                GroupCallActivity.create(launchActivity, AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            }
        }
        if (tL_error == null || !"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            if (tL_error == null || (safeLastFragment = LaunchActivity.getSafeLastFragment()) == null) {
                return;
            }
            BulletinFactory.of(safeLastFragment).showForError(tL_error);
            return;
        }
        BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment2 != null) {
            FactCheckController$$ExternalSyntheticOutline0.m(R.string.LinkIsNoActive, BulletinFactory.of(safeLastFragment2), R.raw.error);
        }
    }

    public static void lambda$show$1(AlertDialog alertDialog, Browser.Progress progress, int i, Context context, long j, TLRPC.InputGroupCall inputGroupCall, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new GroupCallSheet$$ExternalSyntheticLambda6(alertDialog, progress, i, context, j, inputGroupCall, tLObject, tL_error));
    }

    public static void lambda$show$2(int i, int i2) {
        ConnectionsManager.getInstance(i).cancelRequest(i2, true);
    }

    public static Long lambda$show$3(TLRPC.GroupCallParticipant groupCallParticipant) {
        return Long.valueOf(DialogObject.getPeerDialogId(groupCallParticipant.peer));
    }

    public static boolean lambda$show$4(int i, long j, Long l) {
        return (l.longValue() == UserConfig.getInstance(i).getClientUserId() || l.longValue() == j) ? false : true;
    }

    public static void lambda$show$5(CheckBox2 checkBox2, View view) {
        checkBox2.setChecked(!checkBox2.isChecked(), true);
        MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", checkBox2.isChecked()).apply();
    }

    public static void lambda$show$6(BottomSheet bottomSheet, Context context, CheckBox2 checkBox2, int i, TLRPC.InputGroupCall inputGroupCall, View view) {
        bottomSheet.lambda$showGiftOfferSheet$15();
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        if (activityFindActivity == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", checkBox2.isChecked()).apply();
        VoIPHelper.joinConference(activityFindActivity, i, inputGroupCall, false, null, null);
    }

    public static void show(Context context, int i, long j, String str, Browser.Progress progress) {
        TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
        tL_inputGroupCallSlug.slug = str;
        show(context, i, j, tL_inputGroupCallSlug, progress);
    }

    public static void show(final Context context, final int i, final long j, final TLRPC.InputGroupCall inputGroupCall, final Browser.Progress progress) {
        final AlertDialog alertDialog;
        ConferenceCall conferenceCall;
        LaunchActivity launchActivity;
        if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null) {
            if (inputGroupCall instanceof TLRPC.TL_inputGroupCall) {
                TLRPC.GroupCall groupCall = conferenceCall.groupCall;
                if (groupCall == null || inputGroupCall.id != groupCall.id) {
                    TLRPC.InputGroupCall inputGroupCall2 = conferenceCall.inputGroupCall;
                    if (!(inputGroupCall2 instanceof TLRPC.TL_inputGroupCall) || inputGroupCall.id != inputGroupCall2.id) {
                    }
                }
                launchActivity = LaunchActivity.instance;
                if (launchActivity != null) {
                    GroupCallActivity.create(launchActivity, AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                    return;
                }
            } else if (inputGroupCall instanceof TLRPC.TL_inputGroupCallSlug) {
                TLRPC.InputGroupCall inputGroupCall3 = conferenceCall.inputGroupCall;
                if ((inputGroupCall3 instanceof TLRPC.TL_inputGroupCallSlug) && TextUtils.equals(inputGroupCall3.slug, inputGroupCall.slug)) {
                    launchActivity = LaunchActivity.instance;
                    if (launchActivity != null) {
                        GroupCallActivity.create(launchActivity, AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                        return;
                    }
                }
            }
        }
        if (progress == null) {
            AlertDialog alertDialog2 = new AlertDialog(context, 3, null);
            AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog2.showRunnable;
            AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
            AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 300L);
            alertDialog = alertDialog2;
        } else {
            alertDialog = null;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = inputGroupCall;
        getgroupcall.limit = 10;
        int iSendRequest = ConnectionsManager.getInstance(i).sendRequest(getgroupcall, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                GroupCallSheet.lambda$show$1(alertDialog, progress, i, context, j, inputGroupCall, tLObject, tL_error);
            }
        });
        if (progress != null) {
            progress.onCancel(new GroupCallSheet$$ExternalSyntheticLambda5(i, iSendRequest, 0));
            progress.init();
        }
    }

    public static void show(final Context context, final int i, final long j, final TLRPC.InputGroupCall inputGroupCall, TLRPC.GroupCall groupCall, ArrayList<TLRPC.GroupCallParticipant> arrayList) {
        float f;
        DarkThemeResourceProvider darkThemeResourceProvider = new DarkThemeResourceProvider();
        final BottomSheet bottomSheet = new BottomSheet(context, false, false, darkThemeResourceProvider);
        bottomSheet.fixNavigationBar();
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        linearLayoutM.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), darkThemeResourceProvider.getColor(Theme.key_featuredStickers_addButton)));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.filled_calls_users);
        frameLayout.addView(imageView, LayoutHelper.createFrame(56, 56, 17));
        linearLayoutM.addView(frameLayout, LayoutHelper.createLinear(80, 80, 1, 2, 21, 2, 13));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView = TextHelper.makeLinkTextView(context, 20.0f, i2, true, (Theme.ResourcesProvider) darkThemeResourceProvider);
        linksTextViewMakeLinkTextView.setText(LocaleController.getString(R.string.GroupCallLinkTitle));
        linksTextViewMakeLinkTextView.setGravity(17);
        linearLayoutM.addView(linksTextViewMakeLinkTextView, LayoutHelper.createLinear(-1, -2, 1, 2, 0, 2, 4));
        List list = (List) Collection.EL.stream(arrayList).map(new GroupCallSheet$$ExternalSyntheticLambda0(0)).filter(new Predicate() {
            public final Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public final Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override
            public final boolean test(Object obj) {
                return GroupCallSheet.lambda$show$4(i, j, (Long) obj);
            }
        }).collect(Collectors.toList());
        boolean zIsEmpty = list.isEmpty();
        LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView2 = TextHelper.makeLinkTextView(context, 14.0f, i2, false, (Theme.ResourcesProvider) darkThemeResourceProvider);
        linksTextViewMakeLinkTextView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallLinkText)));
        linksTextViewMakeLinkTextView2.setGravity(17);
        linksTextViewMakeLinkTextView2.setMaxWidth(HintView2.cutInFancyHalf(linksTextViewMakeLinkTextView2.getText(), linksTextViewMakeLinkTextView2.getPaint()));
        linearLayoutM.addView(linksTextViewMakeLinkTextView2, LayoutHelper.createLinear(-1, -2, 1, 2, 0, 2, 23));
        if (zIsEmpty) {
            f = 8.0f;
        } else {
            View view = new View(context);
            view.setBackgroundColor(-14012362);
            linearLayoutM.addView(view, LayoutHelper.createLinear(-1, 0.66f, 7, 0, 0, 0, 0));
            AvatarsImageView avatarsImageView = new AvatarsImageView(context, false);
            avatarsImageView.setCentered(true);
            avatarsImageView.setSize(AndroidUtilities.dp(38.0f));
            int iMin = Math.min(3, list.size());
            avatarsImageView.setCount(iMin);
            for (int i3 = 0; i3 < iMin; i3++) {
                avatarsImageView.setObject(i3, i, MessagesController.getInstance(i).getUser((Long) list.get(i3)));
            }
            f = 8.0f;
            avatarsImageView.commitTransition(false);
            linearLayoutM.addView(avatarsImageView, LayoutHelper.createLinear(-1, 58, 2.0f, 11.0f, 5.0f, 0.0f));
            LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView3 = TextHelper.makeLinkTextView(context, 14.0f, Theme.key_windowBackgroundWhiteBlackText, false, (Theme.ResourcesProvider) darkThemeResourceProvider);
            linksTextViewMakeLinkTextView3.setGravity(17);
            if (list.size() == 1) {
                linksTextViewMakeLinkTextView3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GroupCallLinkText2One, DialogObject.getShortName(i, ((Long) list.get(0)).longValue()))));
            } else if (list.size() == 2) {
                linksTextViewMakeLinkTextView3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GroupCallLinkText2Two, DialogObject.getShortName(i, ((Long) list.get(0)).longValue()), DialogObject.getShortName(i, ((Long) list.get(1)).longValue()))));
            } else {
                linksTextViewMakeLinkTextView3.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GroupCallLinkText2Many", arrayList.size() - 2, DialogObject.getShortName(i, ((Long) list.get(0)).longValue()), DialogObject.getShortName(i, ((Long) list.get(1)).longValue()))));
            }
            linksTextViewMakeLinkTextView3.setMaxWidth(HintView2.cutInFancyHalf(linksTextViewMakeLinkTextView3.getText(), linksTextViewMakeLinkTextView3.getPaint()));
            linearLayoutM.addView(linksTextViewMakeLinkTextView3, LayoutHelper.createLinear(-1, -2, 1, 2, 0, 2, 25));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(Theme.createRadSelectorDrawable(darkThemeResourceProvider.getColor(Theme.key_listSelector), 20, 20));
        final CheckBox2 checkBox2 = new CheckBox2(context, 24, darkThemeResourceProvider);
        checkBox2.setColor(Theme.key_radioBackgroundChecked, Theme.key_checkboxDisabled, Theme.key_checkboxCheck);
        checkBox2.setDrawUnchecked(true);
        checkBox2.setChecked(MessagesController.getGlobalMainSettings().getBoolean("callmiconstart", true), false);
        checkBox2.setDrawBackgroundAsArc(10);
        linearLayout.addView(checkBox2, LayoutHelper.createLinear(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(darkThemeResourceProvider.getColor(Theme.key_dialogTextBlack));
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.GroupCallLinkMicrophone));
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 16, 9, 0, 0, 0));
        linearLayoutM.addView(linearLayout, LayoutHelper.createLinear(-2, 38, 1, 0, 4, 0, 12));
        ScaleStateListAnimator.apply(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda11(checkBox2, 16));
        ButtonWithCounterView round = new ButtonWithCounterView(context, true, darkThemeResourceProvider).setRound();
        round.setText(LocaleController.getString(R.string.GroupCallLinkJoin), false);
        linearLayoutM.addView(round, LayoutHelper.createLinear(-1, 48, 2.0f, 0.0f, 2.0f, 0.0f));
        bottomSheet.customView = linearLayoutM;
        round.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                GroupCallSheet.lambda$show$6(bottomSheet, context, checkBox2, i, inputGroupCall, view2);
            }
        });
        bottomSheet.fixNavigationBar();
        bottomSheet.show();
    }
}
