package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.internal.mlkit_vision_common.zzkn;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Business.OpeningHoursActivity;
import org.telegram.ui.Components.BulletinFactory;

public final class LinkManager$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final ProfileActivity f$0;

    public LinkManager$$ExternalSyntheticLambda4(ProfileActivity profileActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = profileActivity;
    }

    @Override
    public final void run() {
        ProfileActivity.ListAdapter listAdapter;
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda4(this.f$0, 3), 200L);
                break;
            case 1:
                this.f$0.scrollToSharedMedia(true);
                break;
            case 2:
                this.f$0.scrollToSharedMedia(true);
                break;
            case 3:
                ProfileActivity profileActivity = this.f$0;
                ProfileActivity.AnonymousClass9 anonymousClass9 = profileActivity.sharedMediaLayout;
                if (anonymousClass9 != null) {
                    anonymousClass9.scrollToPage(14);
                    profileActivity.scrollToSharedMedia(false);
                }
                break;
            case 4:
                ProfileActivity profileActivity2 = this.f$0;
                ProfileActivity.AnonymousClass9 anonymousClass10 = profileActivity2.sharedMediaLayout;
                if (anonymousClass10 != null) {
                    anonymousClass10.scrollToPage(14);
                    profileActivity2.scrollToSharedMedia(false);
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda4(this.f$0, 4), 200L);
                break;
            case 6:
                ProfileActivity profileActivity3 = this.f$0;
                profileActivity3.getClass();
                profileActivity3.presentFragment(new ActionIntroActivity(3));
                break;
            case 7:
                ProfileActivity profileActivity4 = this.f$0;
                profileActivity4.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", profileActivity4.userId, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 8:
                ProfileActivity profileActivity5 = this.f$0;
                TLRPC.UserFull userFull = profileActivity5.userInfo;
                if (userFull != null) {
                    AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(userFull.note, false));
                    zzkn.m(R.string.TextCopied, BulletinFactory.of(profileActivity5));
                    break;
                }
                break;
            case 9:
                ProfileActivity profileActivity6 = this.f$0;
                profileActivity6.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", profileActivity6.userId);
                bundle.putBoolean("focus_notes", true);
                profileActivity6.presentFragment(new ContactAddActivity(bundle, profileActivity6.resourcesProvider));
                break;
            case 10:
                ProfileActivity profileActivity7 = this.f$0;
                profileActivity7.getClass();
                BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                bottomSheetParams.transitionFromLeft = true;
                profileActivity7.showAsSheet(new PrivacyControlActivity(11, false), bottomSheetParams);
                break;
            case 11:
                ProfileActivity profileActivity8 = this.f$0;
                profileActivity8.needLayout(true);
                if (profileActivity8.expandAnimator.isRunning()) {
                    profileActivity8.expandAnimator.cancel();
                }
                profileActivity8.setAvatarExpandProgress(1.0f);
                break;
            case 12:
                this.f$0.updateListAnimated(false, false);
                break;
            case 13:
                ProfileActivity profileActivity9 = this.f$0;
                profileActivity9.getMessagesController().reloadUser(profileActivity9.getDialogId());
                break;
            case 14:
                this.f$0.createBirthdayEffect();
                break;
            case 15:
                this.f$0.updateListAnimated(false, false);
                break;
            case 16:
                this.f$0.bottomButton2Container.setVisibility(8);
                break;
            case 17:
                ProfileActivity profileActivity10 = this.f$0;
                ProfileActivity.AnonymousClass9 anonymousClass11 = profileActivity10.sharedMediaLayout;
                if (anonymousClass11 != null) {
                    anonymousClass11.updateTabs(true);
                    profileActivity10.sharedMediaLayout.updateAdapters();
                }
                break;
            case 18:
                ProfileActivity profileActivity11 = this.f$0;
                if (!profileActivity11.listView.isComputingLayout() && (listAdapter = profileActivity11.listAdapter) != null) {
                    listAdapter.mObservable.notifyChanged();
                }
                break;
            case 19:
                ProfileActivity profileActivity12 = this.f$0;
                profileActivity12.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity12.chatId);
                bundle2.putLong("user_id", profileActivity12.userId);
                profileActivity12.presentFragment(new QrActivity(bundle2));
                break;
            case 20:
                ProfileActivity profileActivity13 = this.f$0;
                profileActivity13.getClass();
                profileActivity13.presentFragment(new ChangeUsernameActivity(null));
                break;
            case 21:
                this.f$0.lambda$onWriteButtonClick$56();
                break;
            case 22:
                this.f$0.openLocation(false);
                break;
            case 23:
                ProfileActivity profileActivity14 = this.f$0;
                profileActivity14.getClass();
                profileActivity14.presentFragment(new UserInfoActivity());
                break;
            case 24:
                ProfileActivity profileActivity15 = this.f$0;
                profileActivity15.getClass();
                profileActivity15.presentFragment(new UserInfoActivity());
                break;
            case 25:
                this.f$0.openLocation(true);
                break;
            case 26:
                ProfileActivity profileActivity16 = this.f$0;
                profileActivity16.getClass();
                profileActivity16.presentFragment(new OpeningHoursActivity());
                break;
            case 27:
                ProfileActivity profileActivity17 = this.f$0;
                profileActivity17.getClass();
                profileActivity17.presentFragment(new org.telegram.ui.Business.LocationActivity());
                break;
            default:
                ProfileActivity profileActivity18 = this.f$0;
                profileActivity18.getClass();
                profileActivity18.presentFragment(new ChangeUsernameActivity(null));
                break;
        }
    }
}
