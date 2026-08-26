package org.telegram.ui.Stories;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda17;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda16;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.DraftsController;
import org.telegram.ui.Stories.recorder.DraftsController$$ExternalSyntheticLambda1;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda6;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda8;

public final class PeerStoriesView$$ExternalSyntheticLambda18 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public PeerStoriesView$$ExternalSyntheticLambda18(FrameLayout frameLayout, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = frameLayout;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
    }

    @Override
    public final void onClick(View view) throws Throwable {
        Object obj;
        boolean z;
        boolean z2;
        TLRPC.Chat chat;
        boolean z3;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        Object obj2 = this.f$4;
        Object obj3 = this.f$2;
        Object obj4 = this.f$3;
        boolean zRelease = false;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        int i = 1;
        switch (this.$r8$classId) {
            case 0:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = (StoriesViewPager.AnonymousClass2.AnonymousClass1) obj6;
                ((StoryViewer.AnonymousClass5) ((PeerStoriesView) anonymousClass1).delegate).setPopupIsVisible(true);
                anonymousClass1.editStoryItem = null;
                boolean[] zArr = {false};
                if (anonymousClass1.isSelf) {
                    StoriesController storiesController = MessagesController.getInstance(anonymousClass1.currentAccount).getStoriesController();
                    if (storiesController.lastBlocklistRequested == 0) {
                        storiesController.loadBlocklist();
                    }
                    MessagesController.getInstance(anonymousClass1.currentAccount).getStoriesController().loadSendAs();
                    DraftsController draftsController = MessagesController.getInstance(anonymousClass1.currentAccount).getStoriesController().draftsController;
                    if (!draftsController.loaded && !draftsController.loading) {
                        draftsController.loading = true;
                        DraftsController$$ExternalSyntheticLambda1 draftsController$$ExternalSyntheticLambda1 = new DraftsController$$ExternalSyntheticLambda1(draftsController, i);
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(draftsController.currentAccount);
                        messagesStorage.getStorageQueue().postRunnable(new EglRenderer$$ExternalSyntheticLambda8(messagesStorage, zRelease, draftsController$$ExternalSyntheticLambda1, 11));
                    }
                }
                boolean z4 = anonymousClass1.isSelf;
                PeerStoriesView.StoryItemHolder storyItemHolder = anonymousClass1.currentStory;
                if (!z4) {
                    StoriesController storiesController2 = MessagesController.getInstance(anonymousClass1.currentAccount).getStoriesController();
                    TL_stories.StoryItem storyItem = storyItemHolder.storyItem;
                    storiesController2.getClass();
                    if (storyItem != null) {
                        long j = storyItem.dialogId;
                        int i2 = storiesController2.currentAccount;
                        if (j != UserConfig.getInstance(i2).getClientUserId()) {
                            if (storyItem.dialogId > 0) {
                                obj = obj5;
                                TLRPC.User user = MessagesController.getInstance(i2).getUser(Long.valueOf(storyItem.dialogId));
                                if (user == null || !user.bot || !user.bot_can_edit) {
                                }
                            } else {
                                obj = obj5;
                            }
                            if (storyItem.dialogId >= 0 || (chat = MessagesController.getInstance(i2).getChat(Long.valueOf(-storyItem.dialogId))) == null || (!chat.creator && ((!(z3 = storyItem.out) || (tL_chatAdminRights2 = chat.admin_rights) == null || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories)) && (z3 || (tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.edit_stories)))) {
                            }
                            if (!anonymousClass1.isSelf || ((anonymousClass1.isChannel || anonymousClass1.isBotsPreview()) && z)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            DarkThemeResourceProvider darkThemeResourceProvider = (DarkThemeResourceProvider) obj;
                            PeerStoriesView.AnonymousClass8 anonymousClass8 = new PeerStoriesView.AnonymousClass8(anonymousClass1, anonymousClass1.getContext(), darkThemeResourceProvider, darkThemeResourceProvider, (StoryViewer) obj3, storyItemHolder.isVideo, z2, z, (Context) obj4, (PeerStoriesView.SharedResources) obj2, zArr);
                            anonymousClass1.popupMenu = anonymousClass8;
                            anonymousClass8.show(anonymousClass1.optionsIconView, 0, AndroidUtilities.dp(6.0f) + (-ActionBar.getCurrentActionBarHeight()));
                        } else {
                            obj = obj5;
                        }
                    } else {
                        obj = obj5;
                    }
                    z = false;
                    if (anonymousClass1.isSelf) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    DarkThemeResourceProvider darkThemeResourceProvider2 = (DarkThemeResourceProvider) obj;
                    PeerStoriesView.AnonymousClass8 anonymousClass9 = new PeerStoriesView.AnonymousClass8(anonymousClass1, anonymousClass1.getContext(), darkThemeResourceProvider2, darkThemeResourceProvider2, (StoryViewer) obj3, storyItemHolder.isVideo, z2, z, (Context) obj4, (PeerStoriesView.SharedResources) obj2, zArr);
                    anonymousClass1.popupMenu = anonymousClass9;
                    anonymousClass9.show(anonymousClass1.optionsIconView, 0, AndroidUtilities.dp(6.0f) + (-ActionBar.getCurrentActionBarHeight()));
                } else {
                    obj = obj5;
                }
                z = true;
                if (anonymousClass1.isSelf) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                DarkThemeResourceProvider darkThemeResourceProvider3 = (DarkThemeResourceProvider) obj;
                PeerStoriesView.AnonymousClass8 anonymousClass10 = new PeerStoriesView.AnonymousClass8(anonymousClass1, anonymousClass1.getContext(), darkThemeResourceProvider3, darkThemeResourceProvider3, (StoryViewer) obj3, storyItemHolder.isVideo, z2, z, (Context) obj4, (PeerStoriesView.SharedResources) obj2, zArr);
                anonymousClass1.popupMenu = anonymousClass10;
                anonymousClass10.show(anonymousClass1.optionsIconView, 0, AndroidUtilities.dp(6.0f) + (-ActionBar.getCurrentActionBarHeight()));
                break;
            case 1:
                ((BotBiometry$$ExternalSyntheticLambda6) obj4).run(Boolean.valueOf(((CheckBoxCell) obj6).isChecked()), Boolean.valueOf(((CheckBoxCell) obj5).isChecked()), Boolean.valueOf(((CheckBoxCell) obj3).isChecked()));
                ((BottomSheet) obj2).lambda$showGiftOfferSheet$15();
                break;
            case 2:
                PeerStoriesView.AnonymousClass8 anonymousClass11 = (PeerStoriesView.AnonymousClass8) obj6;
                float alpha = view.getAlpha();
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = anonymousClass11.this$0;
                if (alpha < 1.0f) {
                    int i3 = -anonymousClass2.shiftDp;
                    anonymousClass2.shiftDp = i3;
                    AndroidUtilities.shakeViewSpring(view, i3);
                    BulletinFactory.of(anonymousClass2.storyContainer, (DarkThemeResourceProvider) obj5).createErrorBulletin("Wait until current upload is complete").show();
                    break;
                } else {
                    Activity activityFindActivity = AndroidUtilities.findActivity((Context) obj4);
                    if (activityFindActivity != null) {
                        anonymousClass11.edit = true;
                        PeerStoriesView.AnonymousClass8 anonymousClass12 = anonymousClass2.popupMenu;
                        if (anonymousClass12 != null) {
                            anonymousClass12.dismiss();
                        }
                        Theme$$ExternalSyntheticLambda17 theme$$ExternalSyntheticLambda17 = new Theme$$ExternalSyntheticLambda17(27, anonymousClass11, activityFindActivity, (StoryViewer) obj3, (PeerStoriesView.SharedResources) obj2);
                        StoryViewer.AnonymousClass5 anonymousClass5 = (StoryViewer.AnonymousClass5) ((PeerStoriesView) anonymousClass2).delegate;
                        StoryViewer.VideoPlayerHolder videoPlayerHolder = StoryViewer.this.playerHolder;
                        if (videoPlayerHolder != null) {
                            zRelease = videoPlayerHolder.release(theme$$ExternalSyntheticLambda17);
                            StoryViewer.this.playerHolder = null;
                        }
                        if (!zRelease) {
                            theme$$ExternalSyntheticLambda17.run();
                        }
                        break;
                    }
                }
                break;
            case 3:
                PeerStoriesView.AnonymousClass8 anonymousClass13 = (PeerStoriesView.AnonymousClass8) obj6;
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass3 = anonymousClass13.this$0;
                File path = anonymousClass3.currentStory.getPath();
                if (path == null || !path.exists()) {
                    anonymousClass3.showDownloadAlert();
                    break;
                } else {
                    Activity activityFindActivity2 = AndroidUtilities.findActivity((Context) obj4);
                    if (activityFindActivity2 != null) {
                        anonymousClass13.edit = true;
                        PeerStoriesView.AnonymousClass8 anonymousClass14 = anonymousClass3.popupMenu;
                        if (anonymousClass14 != null) {
                            anonymousClass14.dismiss();
                        }
                        SendGiftSheet$$ExternalSyntheticLambda16 sendGiftSheet$$ExternalSyntheticLambda16 = new SendGiftSheet$$ExternalSyntheticLambda16((Object) anonymousClass13, (Object) activityFindActivity2, obj5, obj3, obj2, 20);
                        StoryViewer.AnonymousClass5 anonymousClass6 = (StoryViewer.AnonymousClass5) ((PeerStoriesView) anonymousClass3).delegate;
                        StoryViewer.VideoPlayerHolder videoPlayerHolder2 = StoryViewer.this.playerHolder;
                        if (videoPlayerHolder2 != null) {
                            zRelease = videoPlayerHolder2.release(sendGiftSheet$$ExternalSyntheticLambda16);
                            StoryViewer.this.playerHolder = null;
                        }
                        if (!zRelease) {
                            sendGiftSheet$$ExternalSyntheticLambda16.run();
                        }
                        break;
                    }
                }
                break;
            default:
                if (((ButtonWithCounterView) obj6).isEnabled()) {
                    boolean[] zArr2 = (boolean[]) obj5;
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        ((Utilities.Callback) obj3).run(((String[]) obj4)[0]);
                    }
                    ((BottomSheet) obj2).lambda$showGiftOfferSheet$15();
                    break;
                }
                break;
        }
    }

    public PeerStoriesView$$ExternalSyntheticLambda18(PeerStoriesView.AnonymousClass8 anonymousClass8, Context context, TL_stories.StoryItem storyItem, StoryViewer storyViewer, PeerStoriesView.SharedResources sharedResources) {
        this.$r8$classId = 3;
        this.f$0 = anonymousClass8;
        this.f$3 = context;
        this.f$1 = storyItem;
        this.f$2 = storyViewer;
        this.f$4 = sharedResources;
    }

    public PeerStoriesView$$ExternalSyntheticLambda18(PeerStoriesView.AnonymousClass8 anonymousClass8, DarkThemeResourceProvider darkThemeResourceProvider, Context context, StoryViewer storyViewer, PeerStoriesView.SharedResources sharedResources) {
        this.$r8$classId = 2;
        this.f$0 = anonymousClass8;
        this.f$1 = darkThemeResourceProvider;
        this.f$3 = context;
        this.f$2 = storyViewer;
        this.f$4 = sharedResources;
    }
}
