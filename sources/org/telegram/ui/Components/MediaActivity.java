package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.tgnet.tl.TL_stories$StoryItem;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.BottomPagerTabs;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugController;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugProvider;
import org.telegram.ui.Components.Paint.ShapeDetector;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
public class MediaActivity extends BaseFragment implements SharedMediaLayout.SharedMediaPreloaderDelegate, FloatingDebugProvider, NotificationCenter.NotificationCenterDelegate {
    private SparseArray<MessageObject> actionModeMessageObjects;
    private Runnable applyBulletin;
    ProfileActivity.AvatarImageView avatarImageView;
    private BackDrawable backDrawable;
    private ButtonWithCounterView button;
    private FrameLayout buttonContainer;
    private ActionBarMenuSubItem calendarItem;
    private TLRPC$ChatFull currentChatInfo;
    private TLRPC$UserFull currentUserInfo;
    private ActionBarMenuItem deleteItem;
    private long dialogId;
    private boolean filterPhotos;
    private boolean filterVideos;
    private final boolean[] firstSubtitleCheck;
    private int initialTab;
    private int lastTab;
    private SimpleTextView[] nameTextView;
    private ActionBarMenuItem optionsItem;
    private AnimatedTextView selectedTextView;
    SharedMediaLayout sharedMediaLayout;
    private SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader;
    private int shiftDp;
    private ActionBarMenuSubItem showPhotosItem;
    private ActionBarMenuSubItem showVideosItem;
    private final ValueAnimator[] subtitleAnimator;
    private final boolean[] subtitleShown;
    private final float[] subtitleT;
    private AnimatedTextView[] subtitleTextView;
    private StoriesTabsView tabsView;
    private FrameLayout[] titles;
    private FrameLayout titlesContainer;
    private long topicId;
    private int type;
    private ActionBarMenuSubItem zoomInItem;
    private ActionBarMenuSubItem zoomOutItem;

    public MediaActivity(Bundle bundle, SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader) {
        super(bundle);
        this.titles = new FrameLayout[2];
        this.nameTextView = new SimpleTextView[2];
        this.subtitleTextView = new AnimatedTextView[2];
        this.filterPhotos = true;
        this.filterVideos = true;
        this.shiftDp = -12;
        this.subtitleShown = new boolean[2];
        this.subtitleT = new float[2];
        this.firstSubtitleCheck = new boolean[]{true, true};
        this.subtitleAnimator = new ValueAnimator[2];
        this.sharedMediaPreloader = sharedMediaPreloader;
    }

    @Override
    public boolean onFragmentCreate() {
        this.type = getArguments().getInt("type", 0);
        this.dialogId = getArguments().getLong("dialog_id");
        this.topicId = getArguments().getLong("topic_id", 0L);
        int i = this.type;
        this.initialTab = getArguments().getInt("start_from", i == 2 ? 9 : i == 1 ? 8 : 0);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesEnabledUpdate);
        if (DialogObject.isUserDialog(this.dialogId) && this.topicId == 0) {
            TLRPC$User user = getMessagesController().getUser(Long.valueOf(this.dialogId));
            if (UserObject.isUserSelf(user)) {
                getMessagesController().loadUserInfo(user, false, this.classGuid);
                this.currentUserInfo = getMessagesController().getUserFull(this.dialogId);
            }
        }
        if (this.sharedMediaPreloader == null) {
            this.sharedMediaPreloader = new SharedMediaLayout.SharedMediaPreloader(this);
        }
        this.sharedMediaPreloader.addDelegate(this);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesEnabledUpdate);
        Runnable runnable = this.applyBulletin;
        if (runnable != null) {
            this.applyBulletin = null;
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.userInfoDidLoad) {
            if (((Long) objArr[0]).longValue() == this.dialogId) {
                TLRPC$UserFull tLRPC$UserFull = (TLRPC$UserFull) objArr[1];
                this.currentUserInfo = tLRPC$UserFull;
                SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
                if (sharedMediaLayout != null) {
                    sharedMediaLayout.setUserInfo(tLRPC$UserFull);
                }
            }
        } else if (i != NotificationCenter.currentUserPremiumStatusChanged) {
            int i3 = NotificationCenter.storiesEnabledUpdate;
        }
    }

    @Override
    public android.view.View createView(android.content.Context r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.MediaActivity.createView(android.content.Context):android.view.View");
    }

    class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        AnonymousClass1() {
        }

        @Override
        public void onItemClick(int i) {
            int i2;
            String str;
            if (i == -1) {
                if (MediaActivity.this.sharedMediaLayout.closeActionMode(true)) {
                    return;
                }
                MediaActivity.this.finishFragment();
            } else if (i != 2) {
                if (i == 10) {
                    SharedMediaLayout sharedMediaLayout = MediaActivity.this.sharedMediaLayout;
                    sharedMediaLayout.showMediaCalendar(sharedMediaLayout.getClosestTab(), false);
                } else if (i == 11) {
                    MediaActivity.this.sharedMediaLayout.closeActionMode(true);
                    MediaActivity.this.sharedMediaLayout.getSearchItem().openSearch(false);
                }
            } else if (MediaActivity.this.actionModeMessageObjects != null) {
                final ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < MediaActivity.this.actionModeMessageObjects.size(); i3++) {
                    TL_stories$StoryItem tL_stories$StoryItem = ((MessageObject) MediaActivity.this.actionModeMessageObjects.valueAt(i3)).storyItem;
                    if (tL_stories$StoryItem != null) {
                        arrayList.add(tL_stories$StoryItem);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(MediaActivity.this.getContext(), MediaActivity.this.getResourceProvider());
                if (arrayList.size() > 1) {
                    i2 = R.string.DeleteStoriesTitle;
                    str = "DeleteStoriesTitle";
                } else {
                    i2 = R.string.DeleteStoryTitle;
                    str = "DeleteStoryTitle";
                }
                builder.setTitle(LocaleController.getString(str, i2));
                builder.setMessage(LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]));
                builder.setPositiveButton(LocaleController.getString("Delete", R.string.Delete), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i4) {
                        MediaActivity.this.getMessagesController().getStoriesController().deleteStories(MediaActivity.this.dialogId, arrayList);
                        MediaActivity.this.sharedMediaLayout.closeActionMode(false);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog create = builder.create();
                create.show();
                create.redPositive();
            }
        }
    }

    public void lambda$createView$1(View view) {
        this.optionsItem.toggleSubMenu();
    }

    public void lambda$createView$2(View view) {
        Boolean zoomIn = this.sharedMediaLayout.zoomIn();
        if (zoomIn == null) {
            return;
        }
        boolean booleanValue = zoomIn.booleanValue();
        this.zoomOutItem.setEnabled(true);
        this.zoomOutItem.animate().alpha(this.zoomOutItem.isEnabled() ? 1.0f : 0.5f).start();
        this.zoomInItem.setEnabled(booleanValue);
        this.zoomInItem.animate().alpha(this.zoomInItem.isEnabled() ? 1.0f : 0.5f).start();
    }

    public void lambda$createView$3(View view) {
        Boolean zoomOut = this.sharedMediaLayout.zoomOut();
        if (zoomOut == null) {
            return;
        }
        this.zoomOutItem.setEnabled(zoomOut.booleanValue());
        this.zoomOutItem.animate().alpha(this.zoomOutItem.isEnabled() ? 1.0f : 0.5f).start();
        this.zoomInItem.setEnabled(true);
        this.zoomInItem.animate().alpha(this.zoomInItem.isEnabled() ? 1.0f : 0.5f).start();
    }

    public void lambda$createView$4(View view) {
        boolean z = this.filterPhotos;
        if (z && !this.filterVideos) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            ActionBarMenuSubItem actionBarMenuSubItem = this.showPhotosItem;
            int i = -this.shiftDp;
            this.shiftDp = i;
            AndroidUtilities.shakeViewSpring(actionBarMenuSubItem, i);
            return;
        }
        ActionBarMenuSubItem actionBarMenuSubItem2 = this.showPhotosItem;
        boolean z2 = !z;
        this.filterPhotos = z2;
        actionBarMenuSubItem2.setChecked(z2);
        this.sharedMediaLayout.setStoriesFilter(this.filterPhotos, this.filterVideos);
    }

    public void lambda$createView$5(View view) {
        boolean z = this.filterVideos;
        if (z && !this.filterPhotos) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            ActionBarMenuSubItem actionBarMenuSubItem = this.showVideosItem;
            int i = -this.shiftDp;
            this.shiftDp = i;
            AndroidUtilities.shakeViewSpring(actionBarMenuSubItem, i);
            return;
        }
        ActionBarMenuSubItem actionBarMenuSubItem2 = this.showVideosItem;
        boolean z2 = !z;
        this.filterVideos = z2;
        actionBarMenuSubItem2.setChecked(z2);
        this.sharedMediaLayout.setStoriesFilter(this.filterPhotos, this.filterVideos);
    }

    public void lambda$createView$6(Integer num) {
        this.sharedMediaLayout.scrollToPage(num.intValue() + 8);
    }

    public void lambda$createView$10(View view) {
        int i;
        Bulletin show;
        Runnable runnable = this.applyBulletin;
        if (runnable != null) {
            runnable.run();
            this.applyBulletin = null;
        }
        Bulletin.hideVisible();
        final boolean z = this.sharedMediaLayout.getClosestTab() == 9;
        final ArrayList arrayList = new ArrayList();
        if (this.actionModeMessageObjects != null) {
            i = 0;
            for (int i2 = 0; i2 < this.actionModeMessageObjects.size(); i2++) {
                TL_stories$StoryItem tL_stories$StoryItem = this.actionModeMessageObjects.valueAt(i2).storyItem;
                if (tL_stories$StoryItem != null) {
                    arrayList.add(tL_stories$StoryItem);
                    i++;
                }
            }
        } else {
            i = 0;
        }
        this.sharedMediaLayout.closeActionMode(false);
        if (z) {
            this.sharedMediaLayout.scrollToPage(8);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        final boolean[] zArr = new boolean[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TL_stories$StoryItem tL_stories$StoryItem2 = (TL_stories$StoryItem) arrayList.get(i3);
            zArr[i3] = tL_stories$StoryItem2.pinned;
            tL_stories$StoryItem2.pinned = z;
        }
        getMessagesController().getStoriesController().updateStoriesInLists(this.dialogId, arrayList);
        final boolean[] zArr2 = {false};
        this.applyBulletin = new Runnable() {
            @Override
            public final void run() {
                MediaActivity.this.lambda$createView$7(arrayList, z);
            }
        };
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                MediaActivity.this.lambda$createView$8(zArr2, arrayList, zArr);
            }
        };
        if (z) {
            show = BulletinFactory.of(this).createSimpleBulletin(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), runnable2).show();
        } else {
            show = BulletinFactory.of(this).createSimpleBulletin(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i, new Object[0]), LocaleController.getString("Undo"), 5000, runnable2).show();
        }
        show.setOnHideListener(new Runnable() {
            @Override
            public final void run() {
                MediaActivity.this.lambda$createView$9(zArr2);
            }
        });
    }

    public void lambda$createView$7(ArrayList arrayList, boolean z) {
        getMessagesController().getStoriesController().updateStoriesPinned(this.dialogId, arrayList, z, null);
    }

    public void lambda$createView$8(boolean[] zArr, ArrayList arrayList, boolean[] zArr2) {
        zArr[0] = true;
        AndroidUtilities.cancelRunOnUIThread(this.applyBulletin);
        for (int i = 0; i < arrayList.size(); i++) {
            ((TL_stories$StoryItem) arrayList.get(i)).pinned = zArr2[i];
        }
        getMessagesController().getStoriesController().updateStoriesInLists(this.dialogId, arrayList);
    }

    public void lambda$createView$9(boolean[] zArr) {
        Runnable runnable;
        if (!zArr[0] && (runnable = this.applyBulletin) != null) {
            runnable.run();
        }
        this.applyBulletin = null;
    }

    @Override
    public boolean onBackPressed() {
        if (closeStoryViewer()) {
            return false;
        }
        if (this.sharedMediaLayout.isActionModeShown()) {
            this.sharedMediaLayout.closeActionMode(false);
            return false;
        }
        return super.onBackPressed();
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.sharedMediaLayout.isSwipeBackEnabled()) {
            return this.sharedMediaLayout.isCurrentTabFirst();
        }
        return false;
    }

    @Override
    public boolean canBeginSlide() {
        if (this.sharedMediaLayout.isSwipeBackEnabled()) {
            return super.canBeginSlide();
        }
        return false;
    }

    public void updateMediaCount() {
        SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
        if (sharedMediaLayout == null) {
            return;
        }
        int closestTab = sharedMediaLayout.getClosestTab();
        int[] lastMediaCount = this.sharedMediaPreloader.getLastMediaCount();
        boolean z = !LocaleController.isRTL;
        int i = (this.type == 1 && closestTab != 8) ? 1 : 0;
        if (closestTab == 8 || closestTab == 9) {
            ActionBarMenuSubItem actionBarMenuSubItem = this.zoomOutItem;
            if (actionBarMenuSubItem != null) {
                actionBarMenuSubItem.setEnabled(this.sharedMediaLayout.canZoomOut());
                ActionBarMenuSubItem actionBarMenuSubItem2 = this.zoomOutItem;
                actionBarMenuSubItem2.setAlpha(actionBarMenuSubItem2.isEnabled() ? 1.0f : 0.5f);
            }
            ActionBarMenuSubItem actionBarMenuSubItem3 = this.zoomInItem;
            if (actionBarMenuSubItem3 != null) {
                actionBarMenuSubItem3.setEnabled(this.sharedMediaLayout.canZoomIn());
                ActionBarMenuSubItem actionBarMenuSubItem4 = this.zoomInItem;
                actionBarMenuSubItem4.setAlpha(actionBarMenuSubItem4.isEnabled() ? 1.0f : 0.5f);
            }
            int storiesCount = this.sharedMediaLayout.getStoriesCount(8);
            if (storiesCount > 0) {
                showSubtitle(0, true, true);
                this.subtitleTextView[0].setText(LocaleController.formatPluralString("ProfileMyStoriesCount", storiesCount, new Object[0]), z);
            } else {
                showSubtitle(0, false, true);
            }
            if (this.type == 1) {
                int storiesCount2 = this.sharedMediaLayout.getStoriesCount(9);
                if (storiesCount2 > 0) {
                    showSubtitle(1, true, true);
                    this.subtitleTextView[1].setText(LocaleController.formatPluralString("ProfileStoriesArchiveCount", storiesCount2, new Object[0]), z);
                } else {
                    showSubtitle(1, false, true);
                }
            }
            if (this.optionsItem != null) {
                SharedMediaLayout sharedMediaLayout2 = this.sharedMediaLayout;
                final boolean z2 = sharedMediaLayout2.getStoriesCount(sharedMediaLayout2.getClosestTab()) <= 0;
                if (!z2) {
                    this.optionsItem.setVisibility(0);
                }
                this.optionsItem.animate().alpha(z2 ? 0.0f : 1.0f).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        MediaActivity.this.lambda$updateMediaCount$11(z2);
                    }
                }).setDuration(220L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            }
            ButtonWithCounterView buttonWithCounterView = this.button;
            if (buttonWithCounterView != null) {
                boolean z3 = z && this.lastTab == closestTab;
                if (closestTab == 8) {
                    SparseArray<MessageObject> sparseArray = this.actionModeMessageObjects;
                    buttonWithCounterView.setText(LocaleController.formatPluralString("ArchiveStories", sparseArray == null ? 0 : sparseArray.size(), new Object[0]), z3);
                } else {
                    buttonWithCounterView.setText(LocaleController.getString("SaveToProfile", R.string.SaveToProfile), z3);
                }
                this.lastTab = closestTab;
            }
            if (this.calendarItem != null) {
                boolean z4 = this.sharedMediaLayout.getStoriesCount(closestTab) > 0;
                this.calendarItem.setEnabled(z4);
                this.calendarItem.setAlpha(z4 ? 1.0f : 0.5f);
            }
        } else if (closestTab == 11) {
            showSubtitle(i, true, true);
            this.subtitleTextView[i].setText(LocaleController.formatPluralString("SavedDialogsTabCount", getMessagesController().getSavedMessagesController().getAllCount(), new Object[0]), z);
        } else if (closestTab >= 0) {
            if (closestTab >= lastMediaCount.length || lastMediaCount[closestTab] >= 0) {
                if (closestTab == 0) {
                    showSubtitle(i, true, true);
                    if (this.sharedMediaLayout.getPhotosVideosTypeFilter() == 1) {
                        this.subtitleTextView[i].setText(LocaleController.formatPluralString("Photos", lastMediaCount[6], new Object[0]), z);
                    } else if (this.sharedMediaLayout.getPhotosVideosTypeFilter() == 2) {
                        this.subtitleTextView[i].setText(LocaleController.formatPluralString("Videos", lastMediaCount[7], new Object[0]), z);
                    } else {
                        this.subtitleTextView[i].setText(LocaleController.formatPluralString("Media", lastMediaCount[0], new Object[0]), z);
                    }
                } else if (closestTab == 1) {
                    showSubtitle(i, true, true);
                    this.subtitleTextView[i].setText(LocaleController.formatPluralString("Files", lastMediaCount[1], new Object[0]), z);
                } else if (closestTab == 2) {
                    showSubtitle(i, true, true);
                    this.subtitleTextView[i].setText(LocaleController.formatPluralString("Voice", lastMediaCount[2], new Object[0]), z);
                } else if (closestTab == 3) {
                    showSubtitle(i, true, true);
                    this.subtitleTextView[i].setText(LocaleController.formatPluralString("Links", lastMediaCount[3], new Object[0]), z);
                } else if (closestTab == 4) {
                    showSubtitle(i, true, true);
                    this.subtitleTextView[i].setText(LocaleController.formatPluralString("MusicFiles", lastMediaCount[4], new Object[0]), z);
                } else if (closestTab == 5) {
                    showSubtitle(i, true, true);
                    this.subtitleTextView[i].setText(LocaleController.formatPluralString("GIFs", lastMediaCount[5], new Object[0]), z);
                } else if (closestTab == 10) {
                    showSubtitle(i, true, true);
                    MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(-this.dialogId);
                    this.subtitleTextView[i].setText(LocaleController.formatPluralString("Channels", channelRecommendations == null ? 0 : channelRecommendations.more + channelRecommendations.chats.size(), new Object[0]), z);
                }
            }
        }
    }

    public void lambda$updateMediaCount$11(boolean z) {
        if (z) {
            this.optionsItem.setVisibility(8);
        }
    }

    public void setChatInfo(TLRPC$ChatFull tLRPC$ChatFull) {
        this.currentChatInfo = tLRPC$ChatFull;
    }

    public long getDialogId() {
        return this.dialogId;
    }

    private void showSubtitle(final int i, final boolean z, boolean z2) {
        if (i == 1 && this.type == 2) {
            return;
        }
        boolean[] zArr = this.subtitleShown;
        if (zArr[i] != z || this.firstSubtitleCheck[i]) {
            boolean[] zArr2 = this.firstSubtitleCheck;
            boolean z3 = !zArr2[i] && z2;
            zArr2[i] = false;
            zArr[i] = z;
            ValueAnimator[] valueAnimatorArr = this.subtitleAnimator;
            if (valueAnimatorArr[i] != null) {
                valueAnimatorArr[i].cancel();
                this.subtitleAnimator[i] = null;
            }
            if (z3) {
                this.subtitleTextView[i].setVisibility(0);
                ValueAnimator[] valueAnimatorArr2 = this.subtitleAnimator;
                float[] fArr = new float[2];
                fArr[0] = this.subtitleT[i];
                fArr[1] = z ? 1.0f : 0.0f;
                valueAnimatorArr2[i] = ValueAnimator.ofFloat(fArr);
                this.subtitleAnimator[i].addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        MediaActivity.this.lambda$showSubtitle$12(i, valueAnimator);
                    }
                });
                this.subtitleAnimator[i].addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        MediaActivity.this.subtitleT[i] = z ? 1.0f : 0.0f;
                        MediaActivity.this.nameTextView[i].setScaleX(z ? 1.0f : 1.111f);
                        MediaActivity.this.nameTextView[i].setScaleY(z ? 1.0f : 1.111f);
                        MediaActivity.this.nameTextView[i].setTranslationY(z ? 0.0f : AndroidUtilities.dp(8.0f));
                        MediaActivity.this.subtitleTextView[i].setAlpha(z ? 1.0f : 0.0f);
                        if (z) {
                            return;
                        }
                        MediaActivity.this.subtitleTextView[i].setVisibility(8);
                    }
                });
                this.subtitleAnimator[i].setDuration(320L);
                this.subtitleAnimator[i].setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.subtitleAnimator[i].start();
                return;
            }
            this.subtitleT[i] = z ? 1.0f : 0.0f;
            this.nameTextView[i].setScaleX(z ? 1.0f : 1.111f);
            this.nameTextView[i].setScaleY(z ? 1.0f : 1.111f);
            this.nameTextView[i].setTranslationY(z ? 0.0f : AndroidUtilities.dp(8.0f));
            this.subtitleTextView[i].setAlpha(z ? 1.0f : 0.0f);
            this.subtitleTextView[i].setVisibility(z ? 0 : 8);
        }
    }

    public void lambda$showSubtitle$12(int i, ValueAnimator valueAnimator) {
        this.subtitleT[i] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.nameTextView[i].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, this.subtitleT[i]));
        this.nameTextView[i].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, this.subtitleT[i]));
        this.nameTextView[i].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, this.subtitleT[i]));
        this.subtitleTextView[i].setAlpha(this.subtitleT[i]);
    }

    @Override
    public void mediaCountUpdated() {
        SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader;
        SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
        if (sharedMediaLayout != null && (sharedMediaPreloader = this.sharedMediaPreloader) != null) {
            sharedMediaLayout.setNewMediaCounts(sharedMediaPreloader.getLastMediaCount());
        }
        updateMediaCount();
    }

    public void updateColors() {
        if (this.sharedMediaLayout.getSearchOptionsItem() != null) {
            this.sharedMediaLayout.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_windowBackgroundWhiteBlackText), PorterDuff.Mode.MULTIPLY));
        }
        this.actionBar.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        actionBar.setItemsColor(Theme.getColor(i), false);
        this.actionBar.setItemsColor(Theme.getColor(i), true);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_actionBarActionModeDefaultSelector), false);
        this.actionBar.setTitleColor(Theme.getColor(i));
        this.nameTextView[0].setTextColor(Theme.getColor(i));
        SimpleTextView[] simpleTextViewArr = this.nameTextView;
        if (simpleTextViewArr[1] != null) {
            simpleTextViewArr[1].setTextColor(Theme.getColor(i));
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                MediaActivity.this.updateColors();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_actionBarActionModeDefaultSelector));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.addAll(this.sharedMediaLayout.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || !getLastStoryViewer().isShown()) {
            int color = Theme.getColor(Theme.key_windowBackgroundWhite);
            if (this.actionBar.isActionModeShowed()) {
                color = Theme.getColor(Theme.key_actionBarActionModeDefault);
            }
            return ColorUtils.calculateLuminance(color) > 0.699999988079071d;
        }
        return false;
    }

    @Override
    public List<FloatingDebugController.DebugItem> onGetDebugItems() {
        FloatingDebugController.DebugItem[] debugItemArr = new FloatingDebugController.DebugItem[1];
        StringBuilder sb = new StringBuilder();
        sb.append(ShapeDetector.isLearning(getContext()) ? "Disable" : "Enable");
        sb.append(" shape detector learning debug");
        debugItemArr[0] = new FloatingDebugController.DebugItem(sb.toString(), new Runnable() {
            @Override
            public final void run() {
                MediaActivity.this.lambda$onGetDebugItems$13();
            }
        });
        return Arrays.asList(debugItemArr);
    }

    public void lambda$onGetDebugItems$13() {
        ShapeDetector.setLearning(getContext(), !ShapeDetector.isLearning(getContext()));
    }

    private class StoriesTabsView extends BottomPagerTabs {
        public StoriesTabsView(MediaActivity mediaActivity, Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
        }

        @Override
        public BottomPagerTabs.Tab[] createTabs() {
            return new BottomPagerTabs.Tab[]{new BottomPagerTabs.Tab(0, R.raw.msg_stories_saved, 20, 40, LocaleController.getString("ProfileMyStoriesTab", R.string.ProfileMyStoriesTab)), new BottomPagerTabs.Tab(1, R.raw.msg_stories_archive, 0, 0, LocaleController.getString("ProfileStoriesArchiveTab", R.string.ProfileStoriesArchiveTab))};
        }
    }

    @Override
    public int getNavigationBarColor() {
        int themedColor = getThemedColor(Theme.key_windowBackgroundWhite);
        return (getLastStoryViewer() == null || !getLastStoryViewer().attachedToParent()) ? themedColor : getLastStoryViewer().getNavigationBarColor(themedColor);
    }
}
