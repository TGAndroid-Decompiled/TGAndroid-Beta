package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.Stripe;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.boosts.ReassignBoostBottomSheet;
import org.telegram.ui.Components.RLottieDiceDrawable;
import org.telegram.ui.Components.Reactions.BackSpaceButtonView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.TranslateAlert3;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.WebPlayerView;
import org.telegram.ui.Components.emojiview.FoundEmojiPacksRecyclerView;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.recorder.CaptionStory$$ExternalSyntheticLambda4;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda0;

public final class OAuthSheet$$ExternalSyntheticLambda17 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public OAuthSheet$$ExternalSyntheticLambda17(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        TLObject tLObject;
        int i;
        int i2;
        int i3 = 3;
        Object obj = this.f$0;
        int i4 = this.f$1;
        switch (this.$r8$classId) {
            case 0:
                ((OAuthSheet$$ExternalSyntheticLambda5) obj).run(Integer.valueOf(i4));
                break;
            case 1:
                LinkSpanDrawable.LinksTextView linksTextView = ((ReassignBoostBottomSheet.TopCell) obj).description;
                try {
                    if (linksTextView.getLayout().getLineForOffset(i4) == 0) {
                        linksTextView.getEditableText().insert(i4, "\n");
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 2:
                RLottieDiceDrawable rLottieDiceDrawable = (RLottieDiceDrawable) obj;
                rLottieDiceDrawable.secondLoadingInBackground = false;
                if (rLottieDiceDrawable.destroyAfterLoading) {
                    rLottieDiceDrawable.recycle(true);
                } else {
                    rLottieDiceDrawable.secondFramesCount = i4;
                    rLottieDiceDrawable.scheduleNextGetFrame();
                    rLottieDiceDrawable.invalidateInternal();
                }
                break;
            case 3:
                BackSpaceButtonView backSpaceButtonView = (BackSpaceButtonView) obj;
                if (backSpaceButtonView.backspacePressed) {
                    Utilities.Callback callback = backSpaceButtonView.onBackspace;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(i4 < 300));
                        try {
                            backSpaceButtonView.backspaceButton.performHapticFeedback(3);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                    backSpaceButtonView.backspaceOnce = true;
                    int iMax = Math.max(50, i4 - 100);
                    AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda17(backSpaceButtonView, iMax, i3), iMax);
                    break;
                }
                break;
            case 4:
                ((SharedMediaLayout) obj).startAlbumsReorder(i4);
                break;
            case 5:
                ((SharedMediaLayout.MediaPage) obj).listView.scrollBy(0, i4);
                break;
            case 6:
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                if (sharedMediaLayout.profileActivity != null) {
                    boolean z = sharedMediaLayout.info instanceof TLRPC.TL_channelFull;
                    BaseFragment baseFragment = sharedMediaLayout.profileActivity;
                    if (z) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = SharedMediaLayout.getTab(i4, true);
                        tL_channels_setMainProfileTab.channel = baseFragment.getMessagesController().getInputChannel(sharedMediaLayout.info.id);
                        TLRPC.ChatFull chatFull = sharedMediaLayout.info;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tLObject = tL_channels_setMainProfileTab;
                    } else {
                        tL_account_setMainProfileTab = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab tab = SharedMediaLayout.getTab(i4, true);
                        tL_account_setMainProfileTab.tab = tab;
                        TLRPC.UserFull userFull = sharedMediaLayout.userInfo;
                        if (userFull != null) {
                            tLObject = tL_account_setMainProfileTab;
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = tab;
                            baseFragment.getMessagesStorage().updateUserInfo(sharedMediaLayout.userInfo, true);
                            tLObject = tL_account_setMainProfileTab;
                        }
                    }
                    tLObject = tL_account_setMainProfileTab;
                    baseFragment.getConnectionsManager().sendRequest(tLObject, null);
                    sharedMediaLayout.updateTabs(true);
                    break;
                }
                break;
            case 7:
                ((EmojiBottomSheet.SearchField.AnonymousClass5) obj).onScrolled(i4, 0);
                break;
            case 8:
                ((TranslateAlert3) obj).lambda$onToLangMenu$4(i4);
                break;
            case 9:
                ((ViewPagerFixed.TabsView) obj).listView.smoothScrollToPosition(i4);
                break;
            case 10:
                WebPlayerView webPlayerView = (WebPlayerView) obj;
                VideoPlayer videoPlayer = webPlayerView.videoPlayer;
                if (i4 == -1) {
                    if (videoPlayer.isPlaying()) {
                        videoPlayer.pause();
                        webPlayerView.updatePlayButton();
                    }
                    webPlayerView.hasAudioFocus = false;
                } else if (i4 == 1) {
                    if (webPlayerView.resumeAudioOnFocusGain) {
                        webPlayerView.resumeAudioOnFocusGain = false;
                        videoPlayer.play();
                    }
                } else if (i4 != -3 && i4 == -2 && videoPlayer.isPlaying()) {
                    webPlayerView.resumeAudioOnFocusGain = true;
                    videoPlayer.pause();
                    webPlayerView.updatePlayButton();
                }
                break;
            case 11:
                Stripe stripe = (Stripe) obj;
                stripe.getClass();
                try {
                    ((ChatActivity.AnonymousClass21) stripe.tokenCreator).scrollBy(0, i4);
                } catch (Throwable th) {
                    FileLog.e(th);
                    return;
                }
                break;
            case 12:
                ((FoundEmojiPacksRecyclerView) obj).smoothScrollBy(i4, 0, null);
                break;
            case 13:
                GroupCallActivity groupCallActivity = (GroupCallActivity) obj;
                groupCallActivity.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i4);
                    groupCallActivity.cacheAudioOutputValue = Integer.valueOf(i4);
                }
                BulletinFactory bulletinFactory = new BulletinFactory(groupCallActivity.topBulletinContainer, new ShareAlert.AnonymousClass3());
                Resources resources = groupCallActivity.getContext().getResources();
                if (i4 == 2) {
                    i = R.drawable.msg_voice_bluetooth;
                } else if (i4 == 0) {
                    i = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                bulletinFactory.createSimpleBulletin(resources.getDrawable(i).mutate(), GroupCallActivity.getAudioOutputToastText(i4)).show(groupCallActivity.isBulletinTop());
                break;
            case 14:
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                groupCallActivity2.getClass();
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i4);
                    groupCallActivity2.cacheAudioOutputValue = Integer.valueOf(i4);
                }
                BulletinFactory bulletinFactory2 = new BulletinFactory(groupCallActivity2.topBulletinContainer, new ShareAlert.AnonymousClass3());
                Resources resources2 = groupCallActivity2.getContext().getResources();
                if (i4 == 2) {
                    i2 = R.drawable.msg_voice_bluetooth;
                } else if (i4 == 0) {
                    i2 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    i2 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                bulletinFactory2.createSimpleBulletin(resources2.getDrawable(i2).mutate(), GroupCallActivity.getAudioOutputToastText(i4)).show(groupCallActivity2.isBulletinTop());
                break;
            case 15:
                GroupCreateActivity groupCreateActivity = (GroupCreateActivity) obj;
                groupCreateActivity.getClass();
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = groupCreateActivity.listView.getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = groupCreateActivity.listView.getChildAt(i5);
                    groupCreateActivity.listView.getClass();
                    if (RecyclerView.getChildAdapterPosition(childAt) >= i4) {
                        childAt.setAlpha(0.0f);
                        int iMin = (int) ((Math.min(groupCreateActivity.listView.getMeasuredHeight(), Math.max(0, childAt.getTop())) / groupCreateActivity.listView.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        objectAnimatorOfFloat.setStartDelay(iMin);
                        objectAnimatorOfFloat.setDuration(200L);
                        animatorSet.playTogether(objectAnimatorOfFloat);
                    }
                }
                animatorSet.start();
                break;
            case 16:
                LocationActivity locationActivity = (LocationActivity) obj;
                LinearLayoutManager linearLayoutManager = locationActivity.layoutManager;
                linearLayoutManager.scrollToPositionWithOffset(0, -AndroidUtilities.dp(i4), linearLayoutManager.mShouldReverseLayout);
                locationActivity.updateClipView(false);
                break;
            case 17:
                ((LoginActivity.LoginActivityEmailCodeView) obj).codeFieldContainer.codeField[i4].animateSuccessProgress(1.0f);
                break;
            case 18:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.updateVibrate = true;
                notificationsSettingsActivity.adapter.notifyItemChanged(i4);
                break;
            case 19:
                PeerColorActivity.this.viewPager.scrollToPosition$1(1 - i4);
                break;
            case 20:
                int i6 = i4 + 1;
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (i6 < 6) {
                    PhotoViewer.FrameLayoutDrawer frameLayoutDrawer = photoViewer.containerView;
                    if (frameLayoutDrawer != null) {
                        frameLayoutDrawer.invalidate();
                        AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda17(photoViewer, i6, 20), 100L);
                    }
                } else {
                    photoViewer.getClass();
                }
                break;
            case 21:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog.Builder builder = new AlertDialog.Builder(profileActivity.getParentActivity(), 0, profileActivity.resourcesProvider);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                alertDialog.message = LocaleController.getString(R.string.ProfileNotesRemoveText);
                builder.setPositiveButton(LocaleController.getString(R.string.Delete), new LaunchActivity$$ExternalSyntheticLambda9(profileActivity, i4, 16));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                builder.makeRed(-1);
                builder.show();
                break;
            case 22:
                ProfileActivity.ListAdapter.AnonymousClass9 anonymousClass9 = (ProfileActivity.ListAdapter.AnonymousClass9) obj;
                ProfileActivity.ListAdapter listAdapter = ProfileActivity.ListAdapter.this;
                NotificationCenter notificationCenter = ProfileActivity.this.getNotificationCenter();
                int i7 = NotificationCenter.newSuggestionsAvailable;
                ProfileActivity profileActivity2 = ProfileActivity.this;
                notificationCenter.removeObserver(profileActivity2, i7);
                if (i4 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    Browser.openUrl(anonymousClass9.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    profileActivity2.getMessagesController().removeSuggestion(0L, i4 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i7);
                profileActivity2.updateListAnimated(false, false);
                break;
            case 23:
                QrActivity.ThemeListViewController themeListViewController = (QrActivity.ThemeListViewController) obj;
                RecyclerView.LayoutManager layoutManager = themeListViewController.recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    int iMin2 = themeListViewController.prevIsPortrait ? i4 > themeListViewController.prevSelectedPosition ? Math.min(i4 + 1, themeListViewController.adapter.items.size() - 1) : Math.max(i4 - 1, 0) : i4;
                    QrActivity.ThemeListViewController.AnonymousClass1 anonymousClass1 = themeListViewController.scroller;
                    anonymousClass1.mTargetPosition = iMin2;
                    layoutManager.startSmoothScroll(anonymousClass1);
                }
                themeListViewController.prevSelectedPosition = i4;
                break;
            case 24:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.bots.remove(i4);
                sessionsActivity.updateRows$17();
                SessionsActivity.ListAdapter listAdapter2 = sessionsActivity.listAdapter;
                if (listAdapter2 != null) {
                    listAdapter2.mObservable.notifyChanged();
                }
                break;
            case 25:
                Browser.openUrl(((BotStarsActivity) obj).getParentActivity(), LocaleController.getString(i4));
                break;
            case 26:
                ConnectionsManager.getInstance(((StarsController) obj).currentAccount).cancelRequest(i4, true);
                break;
            case 27:
                StoriesController storiesController = (StoriesController) obj;
                ArrayList arrayList = storiesController.dialogListStories;
                storiesController.fixDeletedAndNonContactsStories(arrayList);
                TableModel$$ExternalSyntheticLambda0 tableModel$$ExternalSyntheticLambda0 = storiesController.peerStoriesComparator;
                Collections.sort(arrayList, tableModel$$ExternalSyntheticLambda0);
                ArrayList arrayList2 = storiesController.hiddenListStories;
                storiesController.fixDeletedAndNonContactsStories(arrayList2);
                Collections.sort(arrayList2, tableModel$$ExternalSyntheticLambda0);
                NotificationCenter.getInstance(i4).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                break;
            case 28:
                ((CaptionStory$$ExternalSyntheticLambda4) obj).run(Integer.valueOf(i4));
                break;
            default:
                ((CaptionStory$$ExternalSyntheticLambda4) obj).run(Integer.valueOf(i4));
                break;
        }
    }
}
