package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$DialogFilter$$ExternalSyntheticOutline0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugController$DebugItem;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugProvider;
import org.telegram.ui.Components.Paint.ShapeDetector;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class MediaActivity extends BaseFragment implements SharedMediaLayout.SharedMediaPreloaderDelegate, FloatingDebugProvider, NotificationCenter.NotificationCenterDelegate {
    public static final int TYPE_ARCHIVED_CHANNEL_STORIES = 2;
    public static final int TYPE_MEDIA = 0;
    public static final int TYPE_STORIES = 1;
    public static final int TYPE_STORIES_SEARCH = 3;
    private SparseArray<MessageObject> actionModeMessageObjects;
    private Runnable applyBulletin;
    ProfileActivity.AvatarImageView avatarImageView;
    private BackDrawable backDrawable;
    private ButtonWithCounterView button;
    private FrameLayout buttonContainer;
    private ActionBarMenuSubItem calendarItem;
    private TLRPC.ChatFull currentChatInfo;
    private TLRPC.UserFull currentUserInfo;
    private ActionBarMenuItem deleteItem;
    private long dialogId;
    private boolean filterPhotos;
    private boolean filterVideos;
    private final boolean[] firstSubtitleCheck;
    private String hashtag;
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
    private int storiesCount;
    private final ValueAnimator[] subtitleAnimator;
    private final boolean[] subtitleShown;
    private final float[] subtitleT;
    private AnimatedTextView[] subtitleTextView;
    private StoriesTabsView tabsView;
    private FrameLayout[] titles;
    private FrameLayout titlesContainer;
    private long topicId;
    private int type;
    private String username;
    private ActionBarMenuSubItem zoomInItem;
    private ActionBarMenuSubItem zoomOutItem;

    public class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        public AnonymousClass1() {
        }

        public void lambda$onItemClick$0(ArrayList arrayList, AlertDialog alertDialog, int i) {
            MediaActivity.this.getMessagesController().getStoriesController().deleteStories(MediaActivity.this.dialogId, arrayList);
            MediaActivity.this.sharedMediaLayout.closeActionMode(false);
        }

        @Override
        public void onItemClick(int i) {
            if (i == -1) {
                if (MediaActivity.this.sharedMediaLayout.closeActionMode(true)) {
                    return;
                }
                MediaActivity.this.finishFragment();
                return;
            }
            if (i != 2) {
                if (i == 10) {
                    SharedMediaLayout sharedMediaLayout = MediaActivity.this.sharedMediaLayout;
                    sharedMediaLayout.showMediaCalendar(sharedMediaLayout.getClosestTab(), false);
                    return;
                } else {
                    if (i == 11) {
                        MediaActivity.this.sharedMediaLayout.closeActionMode(true);
                        MediaActivity.this.sharedMediaLayout.getSearchItem().openSearch(false);
                        return;
                    }
                    return;
                }
            }
            if (MediaActivity.this.actionModeMessageObjects != null) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < MediaActivity.this.actionModeMessageObjects.size(); i2++) {
                    TL_stories.StoryItem storyItem = ((MessageObject) MediaActivity.this.actionModeMessageObjects.valueAt(i2)).storyItem;
                    if (storyItem != null) {
                        arrayList.add(storyItem);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(MediaActivity.this.getContext(), 0, MediaActivity.this.getResourceProvider());
                builder.setTitle(LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle));
                builder.setMessage(LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]));
                builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AIEditorAlert$$ExternalSyntheticLambda34(6, this, arrayList));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AIEditorAlert$$ExternalSyntheticLambda20(4));
                AlertDialog alertDialogCreate = builder.create();
                alertDialogCreate.show();
                alertDialogCreate.redPositive();
            }
        }
    }

    public class StoriesTabsView extends BottomPagerTabs {
        public StoriesTabsView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
        }

        @Override
        public BottomPagerTabs.Tab[] createTabs() {
            return new BottomPagerTabs.Tab[]{new BottomPagerTabs.Tab(0, R.raw.msg_stories_saved, 20, 40, LocaleController.getString(R.string.ProfileMyStoriesTab)), new BottomPagerTabs.Tab(1, R.raw.msg_stories_archive, 0, 0, LocaleController.getString(R.string.ProfileStoriesArchiveTab))};
        }
    }

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

    public void lambda$createView$1(View view) {
        this.optionsItem.toggleSubMenu();
    }

    public void lambda$createView$10(View view) {
        int i;
        int i2 = 0;
        Runnable runnable = this.applyBulletin;
        if (runnable != null) {
            runnable.run();
            this.applyBulletin = null;
        }
        Bulletin.hideVisible();
        boolean z = this.sharedMediaLayout.getClosestTab() == 9;
        ArrayList arrayList = new ArrayList();
        if (this.actionModeMessageObjects != null) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.actionModeMessageObjects.size(); i4++) {
                TL_stories.StoryItem storyItem = this.actionModeMessageObjects.valueAt(i4).storyItem;
                if (storyItem != null) {
                    arrayList.add(storyItem);
                    i3++;
                }
            }
            i = i3;
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
        boolean[] zArr = new boolean[arrayList.size()];
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i5);
            zArr[i5] = storyItem2.pinned;
            storyItem2.pinned = z;
        }
        getMessagesController().getStoriesController().updateStoriesInLists(this.dialogId, arrayList, false);
        boolean[] zArr2 = {false};
        this.applyBulletin = new MediaActivity$$ExternalSyntheticLambda0(this, arrayList, z, i2);
        ShareAlert$$ExternalSyntheticLambda1 shareAlert$$ExternalSyntheticLambda1 = new ShareAlert$$ExternalSyntheticLambda1(14, this, zArr2, arrayList, zArr);
        (z ? BulletinFactory.of(this).createSimpleBulletin(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), shareAlert$$ExternalSyntheticLambda1).show() : BulletinFactory.of(this).createSimpleBulletin(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i, new Object[0]), LocaleController.getString("Undo"), 5000, shareAlert$$ExternalSyntheticLambda1).show()).setOnHideListener(new UndoView$$ExternalSyntheticLambda3(3, this, zArr2));
    }

    public void lambda$createView$2(View view) {
        Boolean boolZoomIn = this.sharedMediaLayout.zoomIn();
        if (boolZoomIn == null) {
            return;
        }
        boolean zBooleanValue = boolZoomIn.booleanValue();
        this.zoomOutItem.setEnabled(true);
        this.zoomOutItem.animate().alpha(this.zoomOutItem.isEnabled() ? 1.0f : 0.5f).start();
        this.zoomInItem.setEnabled(zBooleanValue);
        this.zoomInItem.animate().alpha(this.zoomInItem.isEnabled() ? 1.0f : 0.5f).start();
    }

    public void lambda$createView$3(View view) {
        Boolean boolZoomOut = this.sharedMediaLayout.zoomOut();
        if (boolZoomOut == null) {
            return;
        }
        this.zoomOutItem.setEnabled(boolZoomOut.booleanValue());
        this.zoomOutItem.animate().alpha(this.zoomOutItem.isEnabled() ? 1.0f : 0.5f).start();
        this.zoomInItem.setEnabled(true);
        this.zoomInItem.animate().alpha(this.zoomInItem.isEnabled() ? 1.0f : 0.5f).start();
    }

    public void lambda$createView$4(View view) {
        boolean z = this.filterPhotos;
        if (!z || this.filterVideos) {
            ActionBarMenuSubItem actionBarMenuSubItem = this.showPhotosItem;
            boolean z2 = !z;
            this.filterPhotos = z2;
            actionBarMenuSubItem.setChecked(z2);
            this.sharedMediaLayout.setStoriesFilter(this.filterPhotos, this.filterVideos);
            return;
        }
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        ActionBarMenuSubItem actionBarMenuSubItem2 = this.showPhotosItem;
        int i = -this.shiftDp;
        this.shiftDp = i;
        AndroidUtilities.shakeViewSpring(actionBarMenuSubItem2, i);
    }

    public void lambda$createView$5(View view) {
        boolean z = this.filterVideos;
        if (!z || this.filterPhotos) {
            ActionBarMenuSubItem actionBarMenuSubItem = this.showVideosItem;
            boolean z2 = !z;
            this.filterVideos = z2;
            actionBarMenuSubItem.setChecked(z2);
            this.sharedMediaLayout.setStoriesFilter(this.filterPhotos, this.filterVideos);
            return;
        }
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        ActionBarMenuSubItem actionBarMenuSubItem2 = this.showVideosItem;
        int i = -this.shiftDp;
        this.shiftDp = i;
        AndroidUtilities.shakeViewSpring(actionBarMenuSubItem2, i);
    }

    public void lambda$createView$6(Integer num) {
        this.sharedMediaLayout.scrollToPage(num.intValue() + 8);
    }

    public void lambda$createView$7(ArrayList arrayList, boolean z) {
        getMessagesController().getStoriesController().updateStoriesPinned(this.dialogId, arrayList, z, null);
    }

    public void lambda$createView$8(boolean[] zArr, ArrayList arrayList, boolean[] zArr2) {
        zArr[0] = true;
        AndroidUtilities.cancelRunOnUIThread(this.applyBulletin);
        for (int i = 0; i < arrayList.size(); i++) {
            ((TL_stories.StoryItem) arrayList.get(i)).pinned = zArr2[i];
        }
        getMessagesController().getStoriesController().updateStoriesInLists(this.dialogId, arrayList, false);
    }

    public void lambda$createView$9(boolean[] zArr) {
        Runnable runnable;
        if (!zArr[0] && (runnable = this.applyBulletin) != null) {
            runnable.run();
        }
        this.applyBulletin = null;
    }

    public void lambda$onGetDebugItems$13() {
        Context context = getContext();
        Context context2 = getContext();
        DispatchQueue dispatchQueue = ShapeDetector.queue;
        boolean z = context2.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("shapedetector_conf", 0).edit();
        if (z) {
            editorEdit.clear();
        } else {
            editorEdit.putBoolean("learning", true);
        }
        editorEdit.apply();
    }

    public void lambda$showSubtitle$12(int i, ValueAnimator valueAnimator) {
        this.subtitleT[i] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.nameTextView[i].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, this.subtitleT[i]));
        this.nameTextView[i].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, this.subtitleT[i]));
        this.nameTextView[i].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, this.subtitleT[i]));
        this.subtitleTextView[i].setAlpha(this.subtitleT[i]);
    }

    public void lambda$updateMediaCount$11(boolean z) {
        if (z) {
            this.optionsItem.setVisibility(8);
        }
    }

    private void showSubtitle(final int i, final boolean z, boolean z2) {
        int i2 = this.type;
        int i3 = 3;
        if (i2 == 3) {
            return;
        }
        if (i == 1 && i2 == 2) {
            return;
        }
        boolean[] zArr = this.subtitleShown;
        if (zArr[i] != z || this.firstSubtitleCheck[i]) {
            boolean[] zArr2 = this.firstSubtitleCheck;
            boolean z3 = !zArr2[i] && z2;
            zArr2[i] = false;
            zArr[i] = z;
            ValueAnimator valueAnimator = this.subtitleAnimator[i];
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.subtitleAnimator[i] = null;
            }
            if (!z3) {
                this.subtitleT[i] = z ? 1.0f : 0.0f;
                this.nameTextView[i].setScaleX(z ? 1.0f : 1.111f);
                this.nameTextView[i].setScaleY(z ? 1.0f : 1.111f);
                this.nameTextView[i].setTranslationY(z ? 0.0f : AndroidUtilities.dp(8.0f));
                this.subtitleTextView[i].setAlpha(z ? 1.0f : 0.0f);
                this.subtitleTextView[i].setVisibility(z ? 0 : 8);
                return;
            }
            this.subtitleTextView[i].setVisibility(0);
            this.subtitleAnimator[i] = ValueAnimator.ofFloat(this.subtitleT[i], z ? 1.0f : 0.0f);
            this.subtitleAnimator[i].addUpdateListener(new EmojiView$$ExternalSyntheticLambda7(this, i, i3));
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
        }
    }

    public void updateColors() {
        if (this.sharedMediaLayout.getSearchOptionsItem() != null) {
            this.sharedMediaLayout.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_windowBackgroundWhiteBlackText), PorterDuff.Mode.SRC_IN));
        }
        this.actionBar.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        actionBar.setItemsColor(Theme.getColor(null, i, false), false);
        this.actionBar.setItemsColor(Theme.getColor(null, i, false), true);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_actionBarActionModeDefaultSelector, false), false);
        this.actionBar.setTitleColor(Theme.getColor(null, i, false));
        SimpleTextView simpleTextView = this.nameTextView[0];
        if (simpleTextView != null) {
            simpleTextView.setTextColor(Theme.getColor(null, i, false));
        }
        SimpleTextView simpleTextView2 = this.nameTextView[1];
        if (simpleTextView2 != null) {
            simpleTextView2.setTextColor(Theme.getColor(null, i, false));
        }
    }

    public void updateMediaCount() {
        SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
        if (sharedMediaLayout != null) {
            if (this.subtitleTextView[0] == null) {
                return;
            }
            int closestTab = sharedMediaLayout.getClosestTab();
            if (this.type != 3 || closestTab == 8) {
                int[] lastMediaCount = this.sharedMediaPreloader.getLastMediaCount();
                boolean z = LocaleController.isRTL;
                boolean z2 = !z;
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
                    if (storiesCount <= 0) {
                        showSubtitle(0, false, true);
                    } else if (this.type != 3) {
                        showSubtitle(0, true, true);
                        this.subtitleTextView[0].setText(LocaleController.formatPluralString("ProfileMyStoriesCount", storiesCount, new Object[0]), z2);
                    } else if (TextUtils.isEmpty(this.subtitleTextView[0].getText())) {
                        showSubtitle(0, true, true);
                        this.subtitleTextView[0].setText(LocaleController.formatPluralStringSpaced("FoundStories", storiesCount), z2);
                    }
                    if (this.type == 1) {
                        int storiesCount2 = this.sharedMediaLayout.getStoriesCount(9);
                        if (storiesCount2 > 0) {
                            showSubtitle(1, true, true);
                            this.subtitleTextView[1].setText(LocaleController.formatPluralString("ProfileStoriesArchiveCount", storiesCount2, new Object[0]), z2);
                        } else {
                            showSubtitle(1, false, true);
                        }
                    }
                    if (this.optionsItem != null) {
                        SharedMediaLayout sharedMediaLayout2 = this.sharedMediaLayout;
                        boolean z3 = sharedMediaLayout2.getStoriesCount(sharedMediaLayout2.getClosestTab()) <= 0;
                        if (!z3) {
                            this.optionsItem.setVisibility(0);
                        }
                        this.optionsItem.animate().alpha(z3 ? 0.0f : 1.0f).withEndAction(new MediaActivity$$ExternalSyntheticLambda5(this, z3, 0)).setDuration(220L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                    }
                    ButtonWithCounterView buttonWithCounterView = this.button;
                    if (buttonWithCounterView != null) {
                        boolean z4 = !z && this.lastTab == closestTab;
                        if (closestTab == 8) {
                            SparseArray<MessageObject> sparseArray = this.actionModeMessageObjects;
                            buttonWithCounterView.setText(LocaleController.formatPluralString("ArchiveStories", sparseArray == null ? 0 : sparseArray.size(), new Object[0]), z4);
                        } else {
                            buttonWithCounterView.setText(LocaleController.getString(R.string.SaveToProfile), z4);
                        }
                        this.lastTab = closestTab;
                    }
                    if (this.calendarItem != null) {
                        boolean z5 = this.sharedMediaLayout.getStoriesCount(closestTab) > 0;
                        this.calendarItem.setEnabled(z5);
                        this.calendarItem.setAlpha(z5 ? 1.0f : 0.5f);
                        return;
                    }
                    return;
                }
                if (closestTab == 11) {
                    showSubtitle(i, true, true);
                    this.subtitleTextView[i].setText(LocaleController.formatPluralString("SavedDialogsTabCount", getMessagesController().getSavedMessagesController().getAllCount(), new Object[0]), z2);
                    return;
                }
                if (closestTab >= 0) {
                    if (closestTab >= lastMediaCount.length || lastMediaCount[closestTab] >= 0) {
                        if (closestTab == 0) {
                            showSubtitle(i, true, true);
                            if (this.sharedMediaLayout.getPhotosVideosTypeFilter() == 1) {
                                this.subtitleTextView[i].setText(LocaleController.formatPluralString("Photos", lastMediaCount[6], new Object[0]), z2);
                                return;
                            } else if (this.sharedMediaLayout.getPhotosVideosTypeFilter() == 2) {
                                this.subtitleTextView[i].setText(LocaleController.formatPluralString("Videos", lastMediaCount[7], new Object[0]), z2);
                                return;
                            } else {
                                this.subtitleTextView[i].setText(LocaleController.formatPluralString("Media", lastMediaCount[0], new Object[0]), z2);
                                return;
                            }
                        }
                        if (closestTab == 1) {
                            showSubtitle(i, true, true);
                            this.subtitleTextView[i].setText(LocaleController.formatPluralString("Files", lastMediaCount[1], new Object[0]), z2);
                            return;
                        }
                        if (closestTab == 2) {
                            showSubtitle(i, true, true);
                            this.subtitleTextView[i].setText(LocaleController.formatPluralString("Voice", lastMediaCount[2], new Object[0]), z2);
                            return;
                        }
                        if (closestTab == 3) {
                            showSubtitle(i, true, true);
                            this.subtitleTextView[i].setText(LocaleController.formatPluralString("Links", lastMediaCount[3], new Object[0]), z2);
                            return;
                        }
                        if (closestTab == 4) {
                            showSubtitle(i, true, true);
                            this.subtitleTextView[i].setText(LocaleController.formatPluralString("MusicFiles", lastMediaCount[4], new Object[0]), z2);
                        } else if (closestTab == 5) {
                            showSubtitle(i, true, true);
                            this.subtitleTextView[i].setText(LocaleController.formatPluralString("GIFs", lastMediaCount[5], new Object[0]), z2);
                        } else if (closestTab == 10) {
                            showSubtitle(i, true, true);
                            MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(this.dialogId);
                            this.subtitleTextView[i].setText(LocaleController.formatPluralString("Channels", channelRecommendations == null ? 0 : channelRecommendations.chats.size() + channelRecommendations.more, new Object[0]), z2);
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean canBeginSlide() {
        if (this.sharedMediaLayout.isSwipeBackEnabled()) {
            return super.canBeginSlide();
        }
        return false;
    }

    @Override
    public View createView(Context context) {
        int i;
        AvatarDrawable avatarDrawable;
        TLRPC.User user;
        AvatarDrawable avatarDrawable2;
        TLRPC.User user2;
        SimpleTextView simpleTextView;
        ActionBarMenuItem actionBarMenuItem;
        AvatarDrawable avatarDrawable3;
        Context context2 = context;
        ActionBar actionBar = this.actionBar;
        BackDrawable backDrawable = new BackDrawable(false);
        this.backDrawable = backDrawable;
        actionBar.setBackButtonDrawable(backDrawable);
        this.backDrawable.animationTime = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass1());
        final FrameLayout frameLayout = new FrameLayout(context2);
        final SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context2) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                SharedMediaLayout sharedMediaLayout = MediaActivity.this.sharedMediaLayout;
                if (sharedMediaLayout != null && sharedMediaLayout.isInFastScroll()) {
                    return MediaActivity.this.sharedMediaLayout.dispatchFastScrollEvent(motionEvent);
                }
                SharedMediaLayout sharedMediaLayout2 = MediaActivity.this.sharedMediaLayout;
                if (sharedMediaLayout2 == null || !sharedMediaLayout2.checkPinchToZoom(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            }

            @Override
            public void drawList(Canvas canvas, boolean z, ArrayList<SizeNotifierFrameLayout.IViewWithInvalidateCallback> arrayList) {
                MediaActivity.this.sharedMediaLayout.drawListForBlur(canvas, arrayList);
            }

            @Override
            public void onMeasure(int i2, int i3) {
                ((FrameLayout.LayoutParams) MediaActivity.this.sharedMediaLayout.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight() + (((BaseFragment) MediaActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                layoutParams.topMargin = ((BaseFragment) MediaActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
                layoutParams.height = ActionBar.getCurrentActionBarHeight();
                for (int i4 = 0; i4 < 2; i4++) {
                    if (MediaActivity.this.nameTextView[i4] != null) {
                        ((FrameLayout.LayoutParams) MediaActivity.this.nameTextView[i4].getLayoutParams()).topMargin = AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 5.0f : 4.0f) + OKLCH.m$2(22.0f, ActionBar.getCurrentActionBarHeight() / 2, 2);
                    }
                    if (MediaActivity.this.subtitleTextView[i4] != null) {
                        ((FrameLayout.LayoutParams) MediaActivity.this.subtitleTextView[i4].getLayoutParams()).topMargin = ((((ActionBar.getCurrentActionBarHeight() / 2) - AndroidUtilities.dp(19.0f)) / 2) + (ActionBar.getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(7.0f);
                    }
                }
                ((FrameLayout.LayoutParams) MediaActivity.this.avatarImageView.getLayoutParams()).topMargin = OKLCH.m$2(42.0f, ActionBar.getCurrentActionBarHeight(), 2);
                super.onMeasure(i2, i3);
            }
        };
        sizeNotifierFrameLayout.needBlur = true;
        this.fragmentView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        int i2 = this.type;
        if (i2 == 1 || i2 == 2) {
            FrameLayout frameLayout2 = new FrameLayout(context2);
            this.actionBar.addView(frameLayout2, LayoutHelper.createFrame(56, 56, 85));
            int i3 = Theme.key_actionBarActionModeDefaultSelector;
            int themedColor = getThemedColor(i3);
            int i4 = Theme.key_windowBackgroundWhiteBlackText;
            ActionBarMenuItem actionBarMenuItem2 = new ActionBarMenuItem(context2, actionBarMenuCreateMenu, themedColor, getThemedColor(i4), false, null);
            this.deleteItem = actionBarMenuItem2;
            actionBarMenuItem2.setIcon(R.drawable.msg_delete);
            this.deleteItem.setVisibility(8);
            this.deleteItem.setAlpha(0.0f);
            this.deleteItem.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(actionBarMenuCreateMenu, 4));
            frameLayout2.addView(this.deleteItem);
            context2 = context;
            ActionBarMenuItem actionBarMenuItem3 = new ActionBarMenuItem(context2, actionBarMenuCreateMenu, getThemedColor(i3), getThemedColor(i4), false, null);
            this.optionsItem = actionBarMenuItem3;
            actionBarMenuItem3.setIcon(R.drawable.ic_ab_other);
            final int i5 = 0;
            this.optionsItem.setOnClickListener(new View.OnClickListener(this) {
                public final MediaActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i5) {
                        case 0:
                            this.f$0.lambda$createView$1(view);
                            break;
                        case 1:
                            this.f$0.lambda$createView$3(view);
                            break;
                        case 2:
                            this.f$0.lambda$createView$4(view);
                            break;
                        case 3:
                            this.f$0.lambda$createView$5(view);
                            break;
                        case 4:
                            this.f$0.lambda$createView$10(view);
                            break;
                        default:
                            this.f$0.lambda$createView$2(view);
                            break;
                    }
                }
            });
            this.optionsItem.setVisibility(8);
            this.optionsItem.setAlpha(0.0f);
            frameLayout2.addView(this.optionsItem);
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem = this.optionsItem.addSubItem(8, R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn));
            this.zoomInItem = actionBarMenuSubItemAddSubItem;
            final int i6 = 5;
            actionBarMenuSubItemAddSubItem.setOnClickListener(new View.OnClickListener(this) {
                public final MediaActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i6) {
                        case 0:
                            this.f$0.lambda$createView$1(view);
                            break;
                        case 1:
                            this.f$0.lambda$createView$3(view);
                            break;
                        case 2:
                            this.f$0.lambda$createView$4(view);
                            break;
                        case 3:
                            this.f$0.lambda$createView$5(view);
                            break;
                        case 4:
                            this.f$0.lambda$createView$10(view);
                            break;
                        default:
                            this.f$0.lambda$createView$2(view);
                            break;
                    }
                }
            });
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem2 = this.optionsItem.addSubItem(9, R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut));
            this.zoomOutItem = actionBarMenuSubItemAddSubItem2;
            final int i7 = 1;
            actionBarMenuSubItemAddSubItem2.setOnClickListener(new View.OnClickListener(this) {
                public final MediaActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f$0.lambda$createView$1(view);
                            break;
                        case 1:
                            this.f$0.lambda$createView$3(view);
                            break;
                        case 2:
                            this.f$0.lambda$createView$4(view);
                            break;
                        case 3:
                            this.f$0.lambda$createView$5(view);
                            break;
                        case 4:
                            this.f$0.lambda$createView$10(view);
                            break;
                        default:
                            this.f$0.lambda$createView$2(view);
                            break;
                    }
                }
            });
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem3 = this.optionsItem.addSubItem(10, R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar));
            this.calendarItem = actionBarMenuSubItemAddSubItem3;
            actionBarMenuSubItemAddSubItem3.setEnabled(false);
            this.calendarItem.setAlpha(0.5f);
            this.optionsItem.addColoredGap();
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem4 = this.optionsItem.addSubItem(6, 0, (CharSequence) LocaleController.getString(R.string.MediaShowPhotos), true);
            this.showPhotosItem = actionBarMenuSubItemAddSubItem4;
            actionBarMenuSubItemAddSubItem4.setChecked(this.filterPhotos);
            final int i8 = 2;
            this.showPhotosItem.setOnClickListener(new View.OnClickListener(this) {
                public final MediaActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i8) {
                        case 0:
                            this.f$0.lambda$createView$1(view);
                            break;
                        case 1:
                            this.f$0.lambda$createView$3(view);
                            break;
                        case 2:
                            this.f$0.lambda$createView$4(view);
                            break;
                        case 3:
                            this.f$0.lambda$createView$5(view);
                            break;
                        case 4:
                            this.f$0.lambda$createView$10(view);
                            break;
                        default:
                            this.f$0.lambda$createView$2(view);
                            break;
                    }
                }
            });
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem5 = this.optionsItem.addSubItem(7, 0, (CharSequence) LocaleController.getString(R.string.MediaShowVideos), true);
            this.showVideosItem = actionBarMenuSubItemAddSubItem5;
            actionBarMenuSubItemAddSubItem5.setChecked(this.filterVideos);
            final int i9 = 3;
            this.showVideosItem.setOnClickListener(new View.OnClickListener(this) {
                public final MediaActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i9) {
                        case 0:
                            this.f$0.lambda$createView$1(view);
                            break;
                        case 1:
                            this.f$0.lambda$createView$3(view);
                            break;
                        case 2:
                            this.f$0.lambda$createView$4(view);
                            break;
                        case 3:
                            this.f$0.lambda$createView$5(view);
                            break;
                        case 4:
                            this.f$0.lambda$createView$10(view);
                            break;
                        default:
                            this.f$0.lambda$createView$2(view);
                            break;
                    }
                }
            });
        }
        boolean z = this.type == 0;
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.titlesContainer = frameLayout3;
        int i10 = -1;
        frameLayout.addView(frameLayout3, LayoutHelper.createFrame(-1, -1, 119));
        int i11 = 0;
        while (true) {
            if (i11 >= (this.type == 1 ? 2 : 1)) {
                break;
            }
            this.titles[i11] = new FrameLayout(context2);
            this.titlesContainer.addView(this.titles[i11], LayoutHelper.createFrame(i10, i10, 119));
            this.nameTextView[i11] = new SimpleTextView(context2);
            this.nameTextView[i11].setPivotX(0.0f);
            this.nameTextView[i11].setPivotY(AndroidUtilities.dp(9.0f));
            this.nameTextView[i11].setTextSize(18);
            this.nameTextView[i11].setGravity(3);
            this.nameTextView[i11].setTypeface(AndroidUtilities.bold());
            this.nameTextView[i11].setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            this.nameTextView[i11].setScrollNonFitText(true);
            this.nameTextView[i11].setImportantForAccessibility(2);
            this.titles[i11].addView(this.nameTextView[i11], LayoutHelper.createFrame(-2, -2.0f, 51, z ? 118.0f : 72.0f, 0.0f, 56.0f, 0.0f));
            this.subtitleTextView[i11] = new AnimatedTextView(context2, true, true, true);
            this.subtitleTextView[i11].setAnimationProperties(0.4f, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.subtitleTextView[i11].setTextSize(AndroidUtilities.dp(14.0f));
            this.subtitleTextView[i11].setTextColor(Theme.getColor(null, Theme.key_player_actionBarSubtitle, false));
            this.titles[i11].addView(this.subtitleTextView[i11], LayoutHelper.createFrame(-2, -2.0f, 51, z ? 118.0f : 72.0f, 0.0f, 56.0f, 0.0f));
            if (i11 != 0) {
                this.titles[i11].setAlpha(0.0f);
            }
            i11++;
            i10 = -1;
        }
        ProfileActivity.AvatarImageView avatarImageView = new ProfileActivity.AvatarImageView(context2) {
            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (!getImageReceiver().hasNotThumb()) {
                    accessibilityNodeInfo.setVisibleToUser(false);
                    return;
                }
                accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrProfilePicture));
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.Open)));
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenInPhotoViewer)));
            }
        };
        this.avatarImageView = avatarImageView;
        avatarImageView.getImageReceiver().setAllowDecodeSingleFrame(true);
        this.avatarImageView.setRoundRadius(AndroidUtilities.dp((getDialogId() == getUserConfig().getClientUserId() && this.topicId == 0 && getMessagesController().savedViewAsChats) ? 13.0f : 21.0f));
        this.avatarImageView.setPivotX(0.0f);
        this.avatarImageView.setPivotY(0.0f);
        AvatarDrawable avatarDrawable4 = new AvatarDrawable();
        avatarDrawable4.setProfile(true);
        this.avatarImageView.setVisibility(z ? 0 : 8);
        this.avatarImageView.setImageDrawable(avatarDrawable4);
        frameLayout.addView(this.avatarImageView, LayoutHelper.createFrame(42, 42.0f, 51, 64.0f, 0.0f, 0.0f, 0.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(context2, true, true, true);
        this.selectedTextView = animatedTextView;
        animatedTextView.setAnimationProperties(0.4f, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.selectedTextView.setTextSize(AndroidUtilities.dp(20.0f));
        this.selectedTextView.setGravity(3);
        AnimatedTextView animatedTextView2 = this.selectedTextView;
        int i12 = Theme.key_windowBackgroundWhiteBlackText;
        animatedTextView2.setTextColor(getThemedColor(i12));
        this.selectedTextView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(this.selectedTextView, LayoutHelper.createFrame(-2, -1.0f, 23, (z ? 48 : 0) + 72, -2.0f, 72.0f, 0.0f));
        if (this.type == 1) {
            StoriesTabsView storiesTabsView = new StoriesTabsView(context2, getResourceProvider());
            this.tabsView = storiesTabsView;
            storiesTabsView.setOnTabClick(new PasscodeView$$ExternalSyntheticLambda8(this, 7));
            FrameLayout frameLayout4 = new FrameLayout(context2);
            this.buttonContainer = frameLayout4;
            frameLayout4.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
            this.buttonContainer.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context2, true, getResourceProvider());
            this.button = buttonWithCounterView;
            buttonWithCounterView.setText(LocaleController.getString(R.string.SaveToProfile), false);
            this.button.setShowZero(true);
            this.button.setCount(0, false);
            this.button.setEnabled(false);
            final int i13 = 4;
            this.button.setOnClickListener(new View.OnClickListener(this) {
                public final MediaActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            this.f$0.lambda$createView$1(view);
                            break;
                        case 1:
                            this.f$0.lambda$createView$3(view);
                            break;
                        case 2:
                            this.f$0.lambda$createView$4(view);
                            break;
                        case 3:
                            this.f$0.lambda$createView$5(view);
                            break;
                        case 4:
                            this.f$0.lambda$createView$10(view);
                            break;
                        default:
                            this.f$0.lambda$createView$2(view);
                            break;
                    }
                }
            });
            this.buttonContainer.addView(this.button);
            this.buttonContainer.setAlpha(0.0f);
            this.buttonContainer.setTranslationY(AndroidUtilities.dp(100.0f));
            Bulletin.addDelegate(this, new Bulletin.Delegate() {
                @Override
                public final boolean allowLayoutChanges() {
                    return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
                }

                @Override
                public final boolean bottomOffsetAnimated() {
                    return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
                }

                @Override
                public final boolean clipWithGradient(int i14) {
                    return Bulletin.Delegate.CC.$default$clipWithGradient(this, i14);
                }

                @Override
                public int getBottomOffset(int i14) {
                    return AndroidUtilities.dp(64.0f);
                }

                @Override
                public final int getLeftPadding() {
                    return Bulletin.Delegate.CC.$default$getLeftPadding(this);
                }

                @Override
                public final int getRightPadding() {
                    return Bulletin.Delegate.CC.$default$getRightPadding(this);
                }

                @Override
                public final int getTopOffset(int i14) {
                    return Bulletin.Delegate.CC.$default$getTopOffset(this, i14);
                }

                @Override
                public final void onBottomOffsetChange(float f) {
                    Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
                }

                @Override
                public final void onHide(Bulletin bulletin) {
                    Bulletin.Delegate.CC.$default$onHide(this, bulletin);
                }

                @Override
                public final void onShow(Bulletin bulletin) {
                    Bulletin.Delegate.CC.$default$onShow(this, bulletin);
                }
            });
        }
        if (this.type == 0 && this.dialogId == getUserConfig().getClientUserId() && this.topicId == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().hasDialogs()) {
            this.initialTab = 11;
        }
        SharedMediaLayout sharedMediaLayout = new SharedMediaLayout(context, this.dialogId, this.sharedMediaPreloader, 0, null, this.currentChatInfo, this.currentUserInfo, this.initialTab, 0, this, new SharedMediaLayout.Delegate() {
            @Override
            public boolean canSearchMembers() {
                return false;
            }

            @Override
            public TLRPC.Chat getCurrentChat() {
                return null;
            }

            @Override
            public RecyclerListView getListView() {
                return null;
            }

            @Override
            public boolean isFragmentOpened() {
                return true;
            }

            @Override
            public boolean onMemberClick(TLRPC.ChatParticipant chatParticipant, boolean z2, boolean z3, View view) {
                return false;
            }

            @Override
            public void scrollToSharedMedia() {
            }

            @Override
            public void updateSelectedMediaTabText() {
                MediaActivity.this.updateMediaCount();
            }
        }, 0, getResourceProvider()) {
            private AnimatorSet actionModeAnimation;

            @Override
            public boolean canShowSearchItem() {
                return (MediaActivity.this.type == 1 || MediaActivity.this.type == 2) ? false : true;
            }

            @Override
            public boolean customTabs() {
                return MediaActivity.this.type == 1 || MediaActivity.this.type == 2 || MediaActivity.this.type == 3;
            }

            @Override
            public void drawBackgroundWithBlur(Canvas canvas, float f, Rect rect, Paint paint) {
                sizeNotifierFrameLayout.drawBlurRect(canvas, getY() + f, rect, paint, true);
            }

            @Override
            public int getInitialTab() {
                return MediaActivity.this.initialTab;
            }

            @Override
            public String getStoriesHashtag() {
                return MediaActivity.this.hashtag;
            }

            @Override
            public String getStoriesHashtagUsername() {
                return MediaActivity.this.username;
            }

            @Override
            public boolean includeSavedDialogs() {
                return MediaActivity.this.type == 0 && MediaActivity.this.dialogId == MediaActivity.this.getUserConfig().getClientUserId() && MediaActivity.this.topicId == 0;
            }

            @Override
            public boolean includeStories() {
                return MediaActivity.this.type == 1 || MediaActivity.this.type == 2;
            }

            @Override
            public void invalidateBlur() {
                sizeNotifierFrameLayout.invalidateBlur();
            }

            @Override
            public boolean isArchivedOnlyStoriesView() {
                return MediaActivity.this.type == 2;
            }

            @Override
            public boolean isStoriesView() {
                return MediaActivity.this.type == 1 || MediaActivity.this.type == 2;
            }

            @Override
            public void onActionModeSelectedUpdate(SparseArray<MessageObject> sparseArray) {
                int size = sparseArray.size();
                MediaActivity.this.actionModeMessageObjects = sparseArray;
                if (MediaActivity.this.type == 1 || MediaActivity.this.type == 2) {
                    MediaActivity.this.selectedTextView.cancelAnimation();
                    MediaActivity.this.selectedTextView.setText(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL);
                    if (MediaActivity.this.button != null) {
                        MediaActivity.this.button.setEnabled(size > 0);
                        MediaActivity.this.button.setCount(size, true);
                        if (MediaActivity.this.sharedMediaLayout.getClosestTab() == 8) {
                            MediaActivity.this.button.setText(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true);
                        }
                    }
                }
            }

            @Override
            public void onSearchStateChanged(boolean z2) {
                AndroidUtilities.removeAdjustResize(MediaActivity.this.getParentActivity(), ((BaseFragment) MediaActivity.this).classGuid);
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, !z2, 0.95f, true);
            }

            @Override
            public void onSelectedTabChanged() {
                super.onSelectedTabChanged();
                MediaActivity.this.updateMediaCount();
            }

            @Override
            public void onTabProgress(float f) {
                if (MediaActivity.this.type != 1) {
                    return;
                }
                float f2 = f - 8.0f;
                if (MediaActivity.this.tabsView != null) {
                    MediaActivity.this.tabsView.setProgress(f2);
                }
                float f3 = 1.0f - f2;
                MediaActivity.this.titles[0].setAlpha(f3);
                MediaActivity.this.titles[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f2);
                MediaActivity.this.titles[1].setAlpha(f2);
                MediaActivity.this.titles[1].setTranslationX(AndroidUtilities.dp(12.0f) * f3);
            }

            @Override
            public void onTabScroll(boolean z2) {
                if (MediaActivity.this.tabsView != null) {
                    MediaActivity.this.tabsView.setScrolling(z2);
                }
            }

            @Override
            public void showActionMode(final boolean z2) {
                if (MediaActivity.this.type == 0) {
                    super.showActionMode(z2);
                    return;
                }
                if (this.isActionModeShowed == z2) {
                    return;
                }
                this.isActionModeShowed = z2;
                AnimatorSet animatorSet = this.actionModeAnimation;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                if (MediaActivity.this.type == 1 || MediaActivity.this.type == 2) {
                    disableScroll(z2);
                }
                if (z2) {
                    MediaActivity.this.selectedTextView.setVisibility(0);
                    if (MediaActivity.this.buttonContainer != null) {
                        MediaActivity.this.buttonContainer.setVisibility(0);
                    }
                } else {
                    MediaActivity.this.titlesContainer.setVisibility(0);
                }
                float f = 0.0f;
                MediaActivity.this.backDrawable.setRotation(z2 ? 1.0f : 0.0f, true);
                this.actionModeAnimation = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                AnimatedTextView animatedTextView3 = MediaActivity.this.selectedTextView;
                float[] fArr = {z2 ? 1.0f : 0.0f};
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(animatedTextView3, (Property<AnimatedTextView, Float>) property, fArr));
                arrayList.add(ObjectAnimator.ofFloat(MediaActivity.this.titlesContainer, (Property<FrameLayout, Float>) property, z2 ? 0.0f : 1.0f));
                if (MediaActivity.this.buttonContainer != null) {
                    arrayList.add(ObjectAnimator.ofFloat(MediaActivity.this.buttonContainer, (Property<FrameLayout, Float>) property, z2 ? 1.0f : 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(MediaActivity.this.buttonContainer, (Property<FrameLayout, Float>) View.TRANSLATION_Y, z2 ? 0.0f : MediaActivity.this.buttonContainer.getMeasuredHeight()));
                }
                if (MediaActivity.this.deleteItem != null) {
                    MediaActivity.this.deleteItem.setVisibility(0);
                    arrayList.add(ObjectAnimator.ofFloat(MediaActivity.this.deleteItem, (Property<ActionBarMenuItem, Float>) property, z2 ? 1.0f : 0.0f));
                }
                final boolean z3 = getStoriesCount(getClosestTab()) == 0;
                if (MediaActivity.this.optionsItem != null) {
                    MediaActivity.this.optionsItem.setVisibility(0);
                    ActionBarMenuItem actionBarMenuItem4 = MediaActivity.this.optionsItem;
                    if (!z2 && !z3) {
                        f = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem4, (Property<ActionBarMenuItem, Float>) property, f));
                }
                if (MediaActivity.this.tabsView != null) {
                    arrayList.add(ObjectAnimator.ofFloat(MediaActivity.this.tabsView, (Property<StoriesTabsView, Float>) property, z2 ? 0.4f : 1.0f));
                }
                this.actionModeAnimation.playTogether(arrayList);
                this.actionModeAnimation.setDuration(300L);
                this.actionModeAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.actionModeAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationCancel(Animator animator) {
                        AnonymousClass6.this.actionModeAnimation = null;
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (AnonymousClass6.this.actionModeAnimation == null) {
                            return;
                        }
                        AnonymousClass6.this.actionModeAnimation = null;
                        if (z2) {
                            MediaActivity.this.titlesContainer.setVisibility(4);
                            if (MediaActivity.this.optionsItem != null) {
                                MediaActivity.this.optionsItem.setVisibility(8);
                                return;
                            }
                            return;
                        }
                        MediaActivity.this.selectedTextView.setVisibility(4);
                        if (MediaActivity.this.buttonContainer != null) {
                            MediaActivity.this.buttonContainer.setVisibility(4);
                        }
                        if (MediaActivity.this.deleteItem != null) {
                            MediaActivity.this.deleteItem.setVisibility(8);
                        }
                        if (!z3 || MediaActivity.this.optionsItem == null) {
                            return;
                        }
                        MediaActivity.this.optionsItem.setVisibility(8);
                    }
                });
                this.actionModeAnimation.start();
            }
        };
        this.sharedMediaLayout = sharedMediaLayout;
        sharedMediaLayout.scrollSlidingTextTabStrip.setOpen(true);
        if (this.sharedMediaLayout.getSearchOptionsItem() != null) {
            this.sharedMediaLayout.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), PorterDuff.Mode.SRC_IN));
        }
        this.sharedMediaLayout.setPinnedToTop(true);
        this.sharedMediaLayout.getSearchItem().setTranslationY(0.0f);
        this.sharedMediaLayout.photoVideoOptionsItem.setTranslationY(0.0f);
        if (this.sharedMediaLayout.getSearchOptionsItem() != null) {
            this.sharedMediaLayout.getSearchOptionsItem().setTranslationY(0.0f);
        }
        int i14 = this.type;
        if (i14 == 1 || i14 == 2) {
            sizeNotifierFrameLayout.addView(this.sharedMediaLayout, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 64.0f));
        } else {
            sizeNotifierFrameLayout.addView(this.sharedMediaLayout);
        }
        sizeNotifierFrameLayout.addView(this.actionBar);
        sizeNotifierFrameLayout.addView(frameLayout);
        sizeNotifierFrameLayout.blurBehindViews.add(this.sharedMediaLayout);
        if (this.type == 1) {
            showSubtitle(0, false, false);
            showSubtitle(1, false, false);
        }
        StoriesTabsView storiesTabsView2 = this.tabsView;
        if (storiesTabsView2 != null) {
            i = -1;
            sizeNotifierFrameLayout.addView(storiesTabsView2, LayoutHelper.createFrame(-1, -2, 87));
        } else {
            i = -1;
        }
        FrameLayout frameLayout5 = this.buttonContainer;
        if (frameLayout5 != null) {
            sizeNotifierFrameLayout.addView(frameLayout5, LayoutHelper.createFrame(i, 64, 87));
        }
        long j = this.dialogId;
        if (this.topicId != 0 && j == getUserConfig().getClientUserId()) {
            j = this.topicId;
        }
        int i15 = this.type;
        if (i15 == 3) {
            this.nameTextView[0].setText(this.hashtag);
            int i16 = this.storiesCount;
            if (i16 != i) {
                this.subtitleTextView[0].setText(LocaleController.formatPluralStringSpaced("FoundStories", i16));
            }
        } else {
            if (i15 != 2) {
                if (i15 == 1) {
                    this.nameTextView[0].setText(LocaleController.getString(R.string.ProfileMyStories));
                    this.nameTextView[1].setText(LocaleController.getString(R.string.ProfileStoriesArchive));
                } else {
                    if (j == 2666000) {
                        this.nameTextView[0].setText(LocaleController.getString(R.string.AnonymousForward));
                        AvatarDrawable avatarDrawable5 = avatarDrawable4;
                        avatarDrawable5.setAvatarType(21);
                        avatarDrawable5.setScaleSize(0.75f);
                        avatarDrawable3 = avatarDrawable5;
                    } else {
                        avatarDrawable = avatarDrawable4;
                        if (this.topicId != 0 && j == getUserConfig().getClientUserId()) {
                            this.nameTextView[0].setText(LocaleController.getString(R.string.MyNotes));
                            avatarDrawable.setAvatarType(22);
                            avatarDrawable.setScaleSize(0.75f);
                            avatarDrawable3 = avatarDrawable;
                        } else if (DialogObject.isEncryptedDialog(j)) {
                            TLRPC.EncryptedChat encryptedChatM = MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(getMessagesController(), j);
                            if (encryptedChatM != null && (user = getMessagesController().getUser(Long.valueOf(encryptedChatM.user_id))) != null) {
                                avatarDrawable3 = avatarDrawable;
                                avatarDrawable3 = avatarDrawable;
                                this.nameTextView[0].setText(ContactsController.formatName(user.first_name, user.last_name));
                                avatarDrawable.setInfo(this.currentAccount, user);
                                user2 = user;
                                avatarDrawable2 = avatarDrawable;
                            }
                        } else if (DialogObject.isUserDialog(j)) {
                            TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
                            if (user3 != null) {
                                if (user3.self) {
                                    avatarDrawable3 = avatarDrawable;
                                    this.nameTextView[0].setText(LocaleController.getString(R.string.SavedMessages));
                                    avatarDrawable.setAvatarType(1);
                                    avatarDrawable.setScaleSize(0.8f);
                                    avatarDrawable3 = avatarDrawable;
                                } else {
                                    avatarDrawable3 = avatarDrawable;
                                    this.nameTextView[0].setText(ContactsController.formatName(user3.first_name, user3.last_name));
                                    avatarDrawable.setInfo(this.currentAccount, user3);
                                    user2 = user3;
                                    avatarDrawable2 = avatarDrawable;
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
                            if (chat != null) {
                                avatarDrawable3 = avatarDrawable;
                                this.nameTextView[0].setText(chat.title);
                                avatarDrawable.setInfo(this.currentAccount, chat);
                                user2 = chat;
                                avatarDrawable2 = avatarDrawable;
                            }
                        }
                    }
                    avatarDrawable3 = avatarDrawable;
                    avatarDrawable3 = avatarDrawable;
                    avatarDrawable3 = avatarDrawable;
                    avatarDrawable3 = avatarDrawable;
                    avatarDrawable3 = avatarDrawable;
                    user2 = null;
                    avatarDrawable2 = avatarDrawable3;
                }
                this.avatarImageView.setImage(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", avatarDrawable2, user2);
                simpleTextView = this.nameTextView[0];
                if (simpleTextView != null && TextUtils.isEmpty(simpleTextView.getText())) {
                    this.nameTextView[0].setText(LocaleController.getString(R.string.SharedContentTitle));
                }
                if (this.sharedMediaLayout.isSearchItemVisible() && this.type != 1) {
                    this.sharedMediaLayout.getSearchItem().setVisibility(0);
                }
                actionBarMenuItem = this.sharedMediaLayout.searchItemIcon;
                if (actionBarMenuItem != null && this.initialTab != 11) {
                    actionBarMenuItem.setVisibility(8);
                }
                if (this.sharedMediaLayout.getSearchOptionsItem() != null && this.type != 1) {
                    SharedMediaLayout sharedMediaLayout2 = this.sharedMediaLayout;
                    sharedMediaLayout2.animateSearchToOptions(!sharedMediaLayout2.isSearchItemVisible(), false);
                    this.sharedMediaLayout.getSearchOptionsItem().setVisibility(0);
                }
                if (this.sharedMediaLayout.isCalendarItemVisible() || this.type == 1) {
                    this.sharedMediaLayout.photoVideoOptionsItem.setVisibility(4);
                } else {
                    this.sharedMediaLayout.photoVideoOptionsItem.setVisibility(0);
                }
                this.actionBar.setDrawBlurBackground(sizeNotifierFrameLayout);
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, false);
                updateMediaCount();
                updateColors();
                if (this.type == 1 && this.initialTab == 9) {
                    this.sharedMediaLayout.onTabProgress(9.0f);
                }
                return sizeNotifierFrameLayout;
            }
            this.nameTextView[0].setText(LocaleController.getString(R.string.ProfileStoriesArchive));
        }
        avatarDrawable3 = avatarDrawable4;
        avatarDrawable3 = avatarDrawable;
        avatarDrawable3 = avatarDrawable;
        avatarDrawable3 = avatarDrawable;
        avatarDrawable3 = avatarDrawable;
        avatarDrawable3 = avatarDrawable;
        user2 = null;
        avatarDrawable2 = avatarDrawable3;
        this.avatarImageView.setImage(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", avatarDrawable2, user2);
        simpleTextView = this.nameTextView[0];
        if (simpleTextView != null) {
            this.nameTextView[0].setText(LocaleController.getString(R.string.SharedContentTitle));
        }
        if (this.sharedMediaLayout.isSearchItemVisible()) {
            this.sharedMediaLayout.getSearchItem().setVisibility(0);
        }
        actionBarMenuItem = this.sharedMediaLayout.searchItemIcon;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setVisibility(8);
        }
        if (this.sharedMediaLayout.getSearchOptionsItem() != null) {
            SharedMediaLayout sharedMediaLayout3 = this.sharedMediaLayout;
            sharedMediaLayout3.animateSearchToOptions(!sharedMediaLayout3.isSearchItemVisible(), false);
            this.sharedMediaLayout.getSearchOptionsItem().setVisibility(0);
        }
        if (this.sharedMediaLayout.isCalendarItemVisible()) {
            this.sharedMediaLayout.photoVideoOptionsItem.setVisibility(4);
        } else {
            this.sharedMediaLayout.photoVideoOptionsItem.setVisibility(4);
        }
        this.actionBar.setDrawBlurBackground(sizeNotifierFrameLayout);
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, false);
        updateMediaCount();
        updateColors();
        if (this.type == 1) {
            this.sharedMediaLayout.onTabProgress(9.0f);
        }
        return sizeNotifierFrameLayout;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.userInfoDidLoad && ((Long) objArr[0]).longValue() == this.dialogId) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.currentUserInfo = userFull;
            SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
            if (sharedMediaLayout != null) {
                sharedMediaLayout.setUserInfo(userFull);
            }
        }
    }

    public long getDialogId() {
        return this.dialogId;
    }

    @Override
    public int getNavigationBarColor() {
        int themedColor = getThemedColor(Theme.key_windowBackgroundWhite);
        if (getLastStoryViewer() == null || !getLastStoryViewer().attachedToParent()) {
            return themedColor;
        }
        StoryViewer lastStoryViewer = getLastStoryViewer();
        return ColorUtils.blendARGB((((1.0f - lastStoryViewer.progressToDismiss) * 0.5f) + 0.5f) * lastStoryViewer.progressToOpen, themedColor, -16777216);
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ColorPicker$$ExternalSyntheticLambda7 colorPicker$$ExternalSyntheticLambda7 = new ColorPicker$$ExternalSyntheticLambda7(this, 4);
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(null, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, Theme.key_actionBarActionModeDefaultSelector));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.addAll(this.sharedMediaLayout.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().isClosed) {
            int color = Theme.getColor(null, Theme.key_windowBackgroundWhite, false);
            if (this.actionBar.isActionModeShowed()) {
                color = Theme.getColor(null, Theme.key_actionBarActionModeDefault, false);
            }
            if (ColorUtils.calculateLuminance(color) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.sharedMediaLayout.isSwipeBackEnabled()) {
            return this.sharedMediaLayout.isCurrentTabFirst();
        }
        return false;
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

    @Override
    public boolean onBackPressed(boolean z) {
        if (hasShownSheet()) {
            if (z) {
                closeSheet();
            }
            return false;
        }
        if (!this.sharedMediaLayout.isActionModeShown()) {
            return super.onBackPressed(z);
        }
        if (z) {
            this.sharedMediaLayout.closeActionMode(false);
        }
        return false;
    }

    @Override
    public boolean onFragmentCreate() {
        int i;
        this.type = getArguments().getInt("type", 0);
        this.dialogId = getArguments().getLong("dialog_id");
        this.topicId = getArguments().getLong("topic_id", 0L);
        this.hashtag = getArguments().getString("hashtag", "");
        this.username = getArguments().getString("username", "");
        this.storiesCount = getArguments().getInt("storiesCount", -1);
        int i2 = this.type;
        if (i2 == 2) {
            i = 9;
        } else {
            i = i2 == 1 ? 8 : 0;
        }
        this.initialTab = getArguments().getInt("start_from", i);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesEnabledUpdate);
        if (DialogObject.isUserDialog(this.dialogId) && this.topicId == 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.dialogId));
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
    public List<FloatingDebugController$DebugItem> onGetDebugItems() {
        Context context = getContext();
        DispatchQueue dispatchQueue = ShapeDetector.queue;
        return Arrays.asList(new FloatingDebugController$DebugItem(new GroupCallPip$$ExternalSyntheticLambda2(this, 18), (context.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false) ? "Disable" : "Enable").concat(" shape detector learning debug")));
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
        if (sharedMediaLayout != null) {
            sharedMediaLayout.setPagesPaddingBottom(i4);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.currentChatInfo = chatFull;
    }
}
