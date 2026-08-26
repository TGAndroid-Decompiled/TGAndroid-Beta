package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.MessagesSearchAdapter;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivityContainer;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoryViewer;

public class HashtagActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private ChatActivityContainer chatContainer;
    private FrameLayout contentView;
    private ValueAnimator contentViewAnimator;
    private float contentViewValue;
    private final String hashtag;
    private final String query;
    private SharedMediaLayout sharedMediaLayout;
    private FrameLayout sharedMediaLayoutContainer;
    private final StoriesController.SearchStoriesList storiesList;
    private FrameLayout storiesTotal;
    private TextView storiesTotalTextView;
    private MessagesSearchAdapter.StoriesView storiesView;
    private boolean storiesVisible;
    private ValueAnimator transitAnimator;
    private float transitValue;
    private final String username;

    public HashtagActivity(String str) {
        this(str, null);
    }

    public void lambda$createView$0(View view) {
        int i = 2;
        transit(!this.storiesVisible, true);
        final MessagesSearchAdapter.StoriesView storiesView = this.storiesView;
        boolean z = this.storiesVisible;
        ValueAnimator valueAnimator = storiesView.transitionAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(storiesView.transitValue, z ? 1.0f : 0.0f);
        storiesView.transitionAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public AnonymousClass1() {
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                StoriesView storiesView2 = StoriesView.this;
                storiesView2.transitValue = fFloatValue;
                storiesView2.invalidate();
                int i2 = 0;
                while (i2 < 2) {
                    storiesView2.titleTextView[i2].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), storiesView2.transitValue));
                    storiesView2.titleTextView[i2].setVisibility(0);
                    float f = 0.0f;
                    storiesView2.titleTextView[i2].setAlpha(AndroidUtilities.lerp(i2 == 0 ? 1.0f : 0.0f, i2 == 1 ? 1.0f : 0.0f, storiesView2.transitValue));
                    storiesView2.subtitleTextView[i2].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), storiesView2.transitValue));
                    storiesView2.subtitleTextView[i2].setVisibility(0);
                    TextView textView = storiesView2.subtitleTextView[i2];
                    float f2 = i2 == 0 ? 1.0f : 0.0f;
                    if (i2 == 1) {
                        f = 1.0f;
                    }
                    textView.setAlpha(AndroidUtilities.lerp(f2, f, storiesView2.transitValue));
                    i2++;
                }
            }
        });
        storiesView.transitionAnimator.addListener(new StoryViewer.AnonymousClass7(storiesView, z, i));
        storiesView.transitionAnimator.setDuration(320L);
        storiesView.transitionAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        storiesView.transitionAnimator.start();
    }

    public void lambda$updateStoriesVisible$1(boolean z) {
        if (z) {
            return;
        }
        this.storiesView.setVisibility(8);
    }

    private void transit(final boolean z, boolean z2) {
        ChatActivity chatActivity;
        RecyclerListView recyclerListView;
        ValueAnimator valueAnimator = this.transitAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z2) {
            if (this.storiesVisible == z) {
                return;
            }
            this.storiesVisible = z;
            this.sharedMediaLayoutContainer.setVisibility(0);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.transitValue, z ? 1.0f : 0.0f);
            this.transitAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    HashtagActivity.this.transitValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    HashtagActivity.this.sharedMediaLayout.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, HashtagActivity.this.transitValue));
                    HashtagActivity.this.sharedMediaLayout.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, HashtagActivity.this.transitValue));
                    if (HashtagActivity.this.chatContainer != null && HashtagActivity.this.chatContainer.chatActivity != null && HashtagActivity.this.chatContainer.chatActivity.messagesSearchListView != null) {
                        HashtagActivity.this.chatContainer.chatActivity.messagesSearchListView.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, HashtagActivity.this.transitValue));
                        HashtagActivity.this.chatContainer.chatActivity.messagesSearchListView.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, HashtagActivity.this.transitValue));
                    }
                    HashtagActivity.this.sharedMediaLayoutContainer.setAlpha(HashtagActivity.this.transitValue);
                }
            });
            this.transitAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    HashtagActivity.this.transitValue = z ? 1.0f : 0.0f;
                    HashtagActivity.this.sharedMediaLayout.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, HashtagActivity.this.transitValue));
                    HashtagActivity.this.sharedMediaLayout.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, HashtagActivity.this.transitValue));
                    if (HashtagActivity.this.chatContainer != null && HashtagActivity.this.chatContainer.chatActivity != null && HashtagActivity.this.chatContainer.chatActivity.messagesSearchListView != null) {
                        HashtagActivity.this.chatContainer.chatActivity.messagesSearchListView.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, HashtagActivity.this.transitValue));
                        HashtagActivity.this.chatContainer.chatActivity.messagesSearchListView.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, HashtagActivity.this.transitValue));
                    }
                    HashtagActivity.this.sharedMediaLayoutContainer.setAlpha(HashtagActivity.this.transitValue);
                    if (z) {
                        return;
                    }
                    HashtagActivity.this.sharedMediaLayoutContainer.setVisibility(8);
                }
            });
            this.transitAnimator.setDuration(320L);
            this.transitAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.transitAnimator.start();
            return;
        }
        this.storiesVisible = z;
        this.transitValue = z ? 1.0f : 0.0f;
        this.sharedMediaLayout.setScaleX(z ? 1.0f : 0.95f);
        this.sharedMediaLayout.setScaleY(z ? 1.0f : 0.95f);
        this.sharedMediaLayoutContainer.setAlpha(z ? 1.0f : 0.0f);
        this.sharedMediaLayoutContainer.setVisibility(z ? 0 : 8);
        ChatActivityContainer chatActivityContainer = this.chatContainer;
        if (chatActivityContainer == null || (chatActivity = chatActivityContainer.chatActivity) == null || (recyclerListView = chatActivity.messagesSearchListView) == null) {
            return;
        }
        recyclerListView.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.transitValue));
        this.chatContainer.chatActivity.messagesSearchListView.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.transitValue));
    }

    private void updateStoriesVisible(final boolean z, boolean z2) {
        int i = 8;
        this.storiesView.animate().cancel();
        ValueAnimator valueAnimator = this.contentViewAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z2) {
            this.storiesView.setVisibility(z ? 0 : 8);
            this.storiesView.setTranslationY(z ? 0.0f : -AndroidUtilities.dp(48.0f));
            this.contentView.setTranslationY(z ? AndroidUtilities.dp(48.0f) : 0.0f);
            this.contentView.setPadding(0, 0, 0, z ? AndroidUtilities.dp(48.0f) : 0);
            return;
        }
        this.storiesView.setVisibility(0);
        ViewPropertyAnimator duration = this.storiesView.animate().translationY(z ? 0.0f : -AndroidUtilities.dp(48.0f)).withEndAction(new MediaActivity$$ExternalSyntheticLambda5(this, z, i)).setDuration(320L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        duration.setInterpolator(cubicBezierInterpolator).start();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.contentViewValue, z ? 1.0f : 0.0f);
        this.contentViewAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                HashtagActivity.this.contentViewValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                HashtagActivity.this.contentView.setTranslationY(HashtagActivity.this.contentViewValue * AndroidUtilities.dp(48.0f));
                HashtagActivity.this.contentView.setPadding(0, 0, 0, (int) (HashtagActivity.this.contentViewValue * AndroidUtilities.dp(48.0f)));
            }
        });
        this.contentViewAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                HashtagActivity.this.contentViewValue = z ? 1.0f : 0.0f;
                HashtagActivity.this.contentView.setTranslationY(HashtagActivity.this.contentViewValue * AndroidUtilities.dp(48.0f));
                HashtagActivity.this.contentView.setPadding(0, 0, 0, (int) (HashtagActivity.this.contentViewValue * AndroidUtilities.dp(48.0f)));
            }
        });
        this.contentViewAnimator.setDuration(320L);
        this.contentViewAnimator.setInterpolator(cubicBezierInterpolator);
        this.contentViewAnimator.start();
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.query);
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_windowBackgroundWhite;
        actionBar.setBackgroundColor(getThemedColor(i));
        ActionBar actionBar2 = this.actionBar;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        actionBar2.setItemsColor(getThemedColor(i2), false);
        this.actionBar.setItemsBackgroundColor(getThemedColor(Theme.key_actionBarWhiteSelector), false);
        this.actionBar.setTitleColor(getThemedColor(i2));
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i3) {
                if (i3 == -1) {
                    HashtagActivity.this.finishFragment();
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i));
        FrameLayout frameLayout2 = new FrameLayout(context) {
            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                setPadding(0, 0, (int) f, 0);
            }
        };
        this.contentView = frameLayout2;
        frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, -1, 119));
        HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", this.query);
        ChatActivityContainer chatActivityContainer = new ChatActivityContainer(context, getParentLayout(), bundle) {
            boolean activityCreated = false;

            @Override
            public void initChatActivity() {
                if (this.activityCreated) {
                    return;
                }
                this.activityCreated = true;
                super.initChatActivity();
            }
        };
        this.chatContainer = chatActivityContainer;
        this.contentView.addView(chatActivityContainer, LayoutHelper.createFrame(-1, -1, 119));
        long j = 0;
        int i3 = 0;
        ArrayList arrayList = null;
        TLRPC.ChatFull chatFull = null;
        SharedMediaLayout sharedMediaLayout = new SharedMediaLayout(context, j, new SharedMediaLayout.SharedMediaPreloader(null), i3, arrayList, chatFull, null, 8, 0, this, new SharedMediaLayout.Delegate() {
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
            public boolean onMemberClick(TLRPC.ChatParticipant chatParticipant, boolean z, boolean z2, View view) {
                return false;
            }

            @Override
            public void scrollToSharedMedia() {
            }

            @Override
            public void updateSelectedMediaTabText() {
            }
        }, 0, this.resourceProvider) {
            @Override
            public boolean addActionButtons() {
                return false;
            }

            @Override
            public boolean canShowSearchItem() {
                return false;
            }

            @Override
            public boolean customTabs() {
                return true;
            }

            @Override
            public void drawBackgroundWithBlur(Canvas canvas, float f, Rect rect, Paint paint) {
            }

            @Override
            public int getInitialTab() {
                return 8;
            }

            @Override
            public String getStoriesHashtag() {
                return HashtagActivity.this.hashtag;
            }

            @Override
            public String getStoriesHashtagUsername() {
                return HashtagActivity.this.username;
            }

            @Override
            public boolean includeSavedDialogs() {
                return false;
            }

            @Override
            public boolean includeStories() {
                return false;
            }

            @Override
            public void invalidateBlur() {
            }

            @Override
            public boolean isArchivedOnlyStoriesView() {
                return false;
            }

            @Override
            public boolean isSearchingStories() {
                return true;
            }

            @Override
            public boolean isStoriesView() {
                return false;
            }

            @Override
            public void onActionModeSelectedUpdate(SparseArray<MessageObject> sparseArray) {
            }

            @Override
            public void onSearchStateChanged(boolean z) {
            }

            @Override
            public void onTabProgress(float f) {
            }

            @Override
            public void onTabScroll(boolean z) {
            }

            @Override
            public void showActionMode(boolean z) {
            }
        };
        this.sharedMediaLayout = sharedMediaLayout;
        if (sharedMediaLayout.getSearchOptionsItem() != null) {
            this.sharedMediaLayout.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        }
        this.sharedMediaLayout.setPinnedToTop(true);
        this.sharedMediaLayout.photoVideoOptionsItem.setTranslationY(0.0f);
        if (this.sharedMediaLayout.getSearchOptionsItem() != null) {
            this.sharedMediaLayout.getSearchOptionsItem().setTranslationY(0.0f);
        }
        this.sharedMediaLayout.setBackgroundColor(getThemedColor(i));
        this.sharedMediaLayout.updateStoriesList(this.storiesList);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.sharedMediaLayoutContainer = frameLayout3;
        frameLayout3.setBackgroundColor(getThemedColor(i));
        this.sharedMediaLayoutContainer.addView(this.sharedMediaLayout, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.storiesTotal = frameLayout4;
        frameLayout4.setBackgroundColor(getThemedColor(i));
        TextView textView = new TextView(context);
        this.storiesTotalTextView = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.storiesTotalTextView.setTextSize(1, 15.0f);
        this.storiesTotalTextView.setTextColor(getThemedColor(Theme.key_chat_searchPanelText));
        this.storiesTotalTextView.setText(LocaleController.formatPluralString("FoundStories", this.storiesList.count, new Object[0]));
        this.storiesTotal.addView(this.storiesTotalTextView, LayoutHelper.createFrame(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        view.setBackgroundColor(Theme.getColor(Theme.key_divider, this.resourceProvider));
        this.storiesTotal.addView(view, LayoutHelper.createFrame(-1.0f, 1.0f / AndroidUtilities.density, 55));
        this.sharedMediaLayoutContainer.addView(this.storiesTotal, LayoutHelper.createFrame(-1, 49, 87));
        this.contentView.addView(this.sharedMediaLayoutContainer, LayoutHelper.createFrame(-1, -1, 119));
        MessagesSearchAdapter.StoriesView storiesView = new MessagesSearchAdapter.StoriesView(context, this.resourceProvider);
        this.storiesView = storiesView;
        storiesView.setBackground(Theme.createSelectorWithBackgroundDrawable(getThemedColor(i), getThemedColor(Theme.key_listSelector)));
        this.storiesView.setOnClickListener(new HintView$$ExternalSyntheticLambda0(this, 28));
        updateStoriesVisible(this.storiesView.set(this.storiesList), false);
        this.storiesView.setMessages(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.hashtag, this.username);
        frameLayout.addView(this.storiesView, LayoutHelper.createFrame(-1, 48, 55));
        transit(false, false);
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        ChatActivityContainer chatActivityContainer;
        if (i != NotificationCenter.storiesListUpdated) {
            if (i != NotificationCenter.hashtagSearchUpdated || (chatActivityContainer = this.chatContainer) == null || chatActivityContainer.chatActivity == null || ((Integer) objArr[0]).intValue() != this.chatContainer.chatActivity.getClassGuid()) {
                return;
            }
            int iIntValue = ((Integer) objArr[1]).intValue();
            MessagesSearchAdapter.StoriesView storiesView = this.storiesView;
            if (storiesView != null) {
                storiesView.setMessages(iIntValue, this.hashtag, this.username);
                return;
            }
            return;
        }
        Object obj = objArr[0];
        StoriesController.SearchStoriesList searchStoriesList = this.storiesList;
        if (obj == searchStoriesList) {
            MessagesSearchAdapter.StoriesView storiesView2 = this.storiesView;
            if (storiesView2 != null) {
                updateStoriesVisible(storiesView2.set(searchStoriesList), true);
            }
            TextView textView = this.storiesTotalTextView;
            if (textView != null) {
                textView.setText(LocaleController.formatPluralString("FoundStories", this.storiesList.count, new Object[0]));
            }
        }
    }

    @Override
    public boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(null, Theme.key_windowBackgroundWhite, true)) > 0.699999988079071d;
    }

    @Override
    public boolean onFragmentCreate() {
        getMessagesController().getStoriesController().attachedSearchLists.add(this.storiesList);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.hashtagSearchUpdated);
        StoriesController.SearchStoriesList searchStoriesList = this.storiesList;
        searchStoriesList.getClass();
        searchStoriesList.load(18, Collections.EMPTY_LIST, true);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        getMessagesController().getStoriesController().attachedSearchLists.remove(this.storiesList);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.hashtagSearchUpdated);
        super.onFragmentDestroy();
    }

    public HashtagActivity(String str, Theme.ResourcesProvider resourcesProvider) {
        super(null);
        setResourceProvider(resourcesProvider);
        String str2 = "";
        String strTrim = (str == null ? "" : str).trim();
        if (!strTrim.startsWith("#") && !strTrim.startsWith("$")) {
            strTrim = "#".concat(strTrim);
        }
        int iIndexOf = strTrim.indexOf("@");
        if (iIndexOf > 0) {
            this.hashtag = strTrim.substring(0, iIndexOf);
            this.username = strTrim.substring(iIndexOf + 1);
        } else {
            this.hashtag = strTrim;
            this.username = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.hashtag);
        if (!TextUtils.isEmpty(this.username)) {
            str2 = "@" + this.username;
        }
        sb.append(str2);
        this.query = sb.toString();
        this.storiesList = new StoriesController.SearchStoriesList(this.currentAccount, this.username, this.hashtag);
    }
}
