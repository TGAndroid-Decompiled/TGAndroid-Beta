package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.HashSet;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ProfileActionsView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.StarRatingView;

public final class ProfileActivity$$ExternalSyntheticLambda7 implements StarRatingView.Delegate, AlertDialog.OnButtonClickListener, MessagesStorage.BooleanCallback, OnApplyWindowInsetsListener, ProfileActionsView.OnActionClickListener, RecyclerListView.OnItemLongClickListener, FlagSecureReason.FlagSecureCondition, GroupCreateActivity.ContactsAddActivityDelegate, FactorAnimator.Target {
    public final int $r8$classId;
    public final ProfileActivity f$0;

    public ProfileActivity$$ExternalSyntheticLambda7(ProfileActivity profileActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = profileActivity;
    }

    @Override
    public void didSelectUsers(int i, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        ProfileActivity profileActivity = this.f$0;
        profileActivity.getClass();
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.ChatFull chatFull = profileActivity.chatInfo;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i2 = 0; i2 < profileActivity.chatInfo.participants.participants.size(); i2++) {
                hashSet.add(Long.valueOf(profileActivity.chatInfo.participants.participants.get(i2).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.currentChat, profileActivity, arrayList, i, new ChatActivity$$ExternalSyntheticLambda211(arrayList2, 10), new ChatActivity$$ExternalSyntheticLambda211(profileActivity, 11), new PollItemMenu$$ExternalSyntheticLambda8(profileActivity, arrayList2, hashSet, 10));
    }

    @Override
    public void needAddBot(TLRPC.User user) {
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        ProfileActivity profileActivity = this.f$0;
        profileActivity.navigationBarHeight = windowInsetsCompat.mImpl.getInsets(519).bottom;
        FrameLayout frameLayout = profileActivity.bottomButtonsContainer;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i = profileActivity.navigationBarHeight + profileActivity.additionFloatingButtonOffset;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i) {
                marginLayoutParams.bottomMargin = i;
                profileActivity.bottomButtonsContainer.setLayoutParams(marginLayoutParams);
            }
        }
        ProfileActivity.AnonymousClass9 anonymousClass9 = profileActivity.sharedMediaLayout;
        if (anonymousClass9 != null) {
            anonymousClass9.setPagesPaddingBottom(profileActivity.navigationBarHeight + profileActivity.additionNavigationBarHeight);
            SharedMediaLayout.AnonymousClass13 anonymousClass13 = profileActivity.sharedMediaLayout.giftsContainer;
            if (anonymousClass13 != null) {
                anonymousClass13.setButtonOffset(profileActivity.navigationBarHeight + profileActivity.additionFloatingButtonOffset);
            }
        }
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 2:
                ProfileActivity profileActivity = this.f$0;
                profileActivity.getMessagesController().blockPeer(profileActivity.userId);
                if (BulletinFactory.canShowBulletin(profileActivity)) {
                    BulletinFactory.createBanBulletin(profileActivity, true).show();
                }
                break;
            case 7:
                ProfileActivity.SearchAdapter searchAdapter = this.f$0.searchAdapter;
                searchAdapter.recentSearches.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                searchAdapter.notifyDataSetChanged();
                break;
            default:
                ProfileActivity profileActivity2 = this.f$0;
                profileActivity2.getClass();
                SharedConfig.pushAuthKey = null;
                SharedConfig.pushAuthKeyId = null;
                SharedConfig.saveConfig();
                profileActivity2.getConnectionsManager().switchBackend(true);
                break;
        }
    }

    @Override
    public void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        this.f$0.updateBottomButtonY();
    }

    @Override
    public boolean onItemClick(int i, View view) {
        ProfileActivity profileActivity = this.f$0;
        ProfileActivity.SearchAdapter searchAdapter = profileActivity.searchAdapter;
        if (searchAdapter.searchWas || searchAdapter.recentSearches.isEmpty()) {
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(profileActivity.getParentActivity(), 0, profileActivity.resourcesProvider);
        String string = LocaleController.getString(R.string.ClearSearchAlertTitle);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.getString(R.string.ClearSearchAlert);
        builder.setPositiveButton(LocaleController.getString(R.string.ClearButton), new ProfileActivity$$ExternalSyntheticLambda7(profileActivity, 7));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        profileActivity.showDialog(alertDialog);
        TextView textView = (TextView) alertDialog.getButton(-1);
        if (textView == null) {
            return true;
        }
        textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        return true;
    }

    @Override
    public void run(boolean z) {
        ProfileActivity profileActivity = this.f$0;
        profileActivity.playProfileAnimation = 0;
        NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
        int i = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.currentChat.id), null, profileActivity.currentChat, Boolean.valueOf(z));
    }

    @Override
    public boolean run() {
        boolean zIsUserNoForwards;
        ProfileActivity profileActivity = this.f$0;
        if (profileActivity.currentEncryptedChat != null) {
            return true;
        }
        if (profileActivity.currentChat != null) {
            zIsUserNoForwards = profileActivity.getMessagesController().isChatNoForwards(profileActivity.currentChat);
        } else {
            zIsUserNoForwards = profileActivity.getMessagesController().isUserNoForwards(profileActivity.userInfo);
        }
        return zIsUserNoForwards;
    }
}
