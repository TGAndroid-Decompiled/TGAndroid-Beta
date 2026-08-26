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
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.MessagesSearchAdapter;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$16$$ExternalSyntheticLambda4;
import org.telegram.ui.ChatActivityContainer;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.Stories.StoriesController;

public final class HashtagActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public ChatActivity.AnonymousClass37.AnonymousClass1 chatContainer;
    public AnonymousClass2 contentView;
    public ValueAnimator contentViewAnimator;
    public float contentViewValue;
    public final String hashtag;
    public final String query;
    public AnonymousClass5 sharedMediaLayout;
    public FrameLayout sharedMediaLayoutContainer;
    public final StoriesController.SearchStoriesList storiesList;
    public FrameLayout storiesTotal;
    public TextView storiesTotalTextView;
    public MessagesSearchAdapter.StoriesView storiesView;
    public boolean storiesVisible;
    public ValueAnimator transitAnimator;
    public float transitValue;
    public final String username;

    public final class AnonymousClass2 extends FrameLayout {
        @Override
        public final void setTranslationY(float f) {
            super.setTranslationY(f);
            setPadding(0, 0, (int) f, 0);
        }
    }

    public final class AnonymousClass4 implements SharedMediaLayout.Delegate {
        @Override
        public final boolean canSearchMembers() {
            return false;
        }

        @Override
        public final TLRPC.Chat getCurrentChat() {
            return null;
        }

        @Override
        public final RecyclerListView getListView() {
            return null;
        }

        @Override
        public final boolean isFragmentOpened() {
            return true;
        }

        @Override
        public final boolean onMemberClick(TLRPC.ChatParticipant chatParticipant, boolean z, boolean z2, View view) {
            return false;
        }

        @Override
        public final void scrollToSharedMedia() {
        }

        @Override
        public final void updateSelectedMediaTabText() {
        }
    }

    public final class AnonymousClass6 implements ValueAnimator.AnimatorUpdateListener {
        public final int $r8$classId;
        public final HashtagActivity this$0;

        public AnonymousClass6(HashtagActivity hashtagActivity, int i) {
            this.$r8$classId = i;
            this.this$0 = hashtagActivity;
        }

        @Override
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ChatActivityContainer.AnonymousClass1 anonymousClass1;
            ChatActivity.AnonymousClass34 anonymousClass34;
            switch (this.$r8$classId) {
                case 0:
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    HashtagActivity hashtagActivity = this.this$0;
                    hashtagActivity.contentViewValue = fFloatValue;
                    hashtagActivity.contentView.setTranslationY(hashtagActivity.contentViewValue * AndroidUtilities.dp(48.0f));
                    hashtagActivity.contentView.setPadding(0, 0, 0, (int) (hashtagActivity.contentViewValue * AndroidUtilities.dp(48.0f)));
                    break;
                default:
                    float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    HashtagActivity hashtagActivity2 = this.this$0;
                    hashtagActivity2.transitValue = fFloatValue2;
                    hashtagActivity2.sharedMediaLayout.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, hashtagActivity2.transitValue));
                    hashtagActivity2.sharedMediaLayout.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, hashtagActivity2.transitValue));
                    ChatActivity.AnonymousClass37.AnonymousClass1 anonymousClass2 = hashtagActivity2.chatContainer;
                    if (anonymousClass2 != null && (anonymousClass1 = anonymousClass2.chatActivity) != null && (anonymousClass34 = anonymousClass1.messagesSearchListView) != null) {
                        anonymousClass34.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, hashtagActivity2.transitValue));
                        hashtagActivity2.chatContainer.chatActivity.messagesSearchListView.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, hashtagActivity2.transitValue));
                    }
                    hashtagActivity2.sharedMediaLayoutContainer.setAlpha(hashtagActivity2.transitValue);
                    break;
            }
        }
    }

    public final class AnonymousClass7 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final HashtagActivity this$0;
        public final boolean val$visible;

        public AnonymousClass7(HashtagActivity hashtagActivity, boolean z, int i) {
            this.$r8$classId = i;
            this.this$0 = hashtagActivity;
            this.val$visible = z;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            ChatActivityContainer.AnonymousClass1 anonymousClass1;
            ChatActivity.AnonymousClass34 anonymousClass34;
            switch (this.$r8$classId) {
                case 0:
                    float f = this.val$visible ? 1.0f : 0.0f;
                    HashtagActivity hashtagActivity = this.this$0;
                    hashtagActivity.contentViewValue = f;
                    hashtagActivity.contentView.setTranslationY(f * AndroidUtilities.dp(48.0f));
                    hashtagActivity.contentView.setPadding(0, 0, 0, (int) (hashtagActivity.contentViewValue * AndroidUtilities.dp(48.0f)));
                    break;
                default:
                    boolean z = this.val$visible;
                    float f2 = z ? 1.0f : 0.0f;
                    HashtagActivity hashtagActivity2 = this.this$0;
                    hashtagActivity2.transitValue = f2;
                    hashtagActivity2.sharedMediaLayout.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f2));
                    hashtagActivity2.sharedMediaLayout.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, hashtagActivity2.transitValue));
                    ChatActivity.AnonymousClass37.AnonymousClass1 anonymousClass2 = hashtagActivity2.chatContainer;
                    if (anonymousClass2 != null && (anonymousClass1 = anonymousClass2.chatActivity) != null && (anonymousClass34 = anonymousClass1.messagesSearchListView) != null) {
                        anonymousClass34.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, hashtagActivity2.transitValue));
                        hashtagActivity2.chatContainer.chatActivity.messagesSearchListView.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, hashtagActivity2.transitValue));
                    }
                    hashtagActivity2.sharedMediaLayoutContainer.setAlpha(hashtagActivity2.transitValue);
                    if (!z) {
                        hashtagActivity2.sharedMediaLayoutContainer.setVisibility(8);
                    }
                    break;
            }
        }
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

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        ActionBar actionBar = this.actionBar;
        String str = this.query;
        actionBar.setTitle(str);
        ActionBar actionBar2 = this.actionBar;
        int i = Theme.key_windowBackgroundWhite;
        actionBar2.setBackgroundColor(getThemedColor(i));
        ActionBar actionBar3 = this.actionBar;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        actionBar3.setItemsColor(getThemedColor(i2), false);
        this.actionBar.setItemsBackgroundColor(getThemedColor(Theme.key_actionBarWhiteSelector), false);
        this.actionBar.setTitleColor(getThemedColor(i2));
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(context);
        this.contentView = anonymousClass2;
        frameLayout.addView(anonymousClass2, LayoutHelper.createFrame(-1, -1, 119));
        HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        ChatActivity.AnonymousClass37.AnonymousClass1 anonymousClass1 = new ChatActivity.AnonymousClass37.AnonymousClass1(context, getParentLayout(), bundle, 1);
        anonymousClass1.activityCreated = false;
        this.chatContainer = anonymousClass1;
        this.contentView.addView(anonymousClass1, LayoutHelper.createFrame(-1, -1, 119));
        ?? r0 = new SharedMediaLayout(context, new SharedMediaLayout.SharedMediaPreloader(null), this, new AnonymousClass4(), this.resourceProvider) {
            @Override
            public final void drawBackgroundWithBlur(Canvas canvas, float f, Rect rect, Paint paint) {
            }

            @Override
            public final int getInitialTab() {
                return 8;
            }

            @Override
            public final String getStoriesHashtag() {
                return HashtagActivity.this.hashtag;
            }

            @Override
            public final String getStoriesHashtagUsername() {
                return HashtagActivity.this.username;
            }

            @Override
            public final void invalidateBlur() {
            }

            @Override
            public final boolean isSearchingStories() {
                return true;
            }

            @Override
            public final void onActionModeSelectedUpdate(SparseArray sparseArray) {
            }

            @Override
            public final void onSearchStateChanged(boolean z) {
            }

            @Override
            public final void onTabProgress(float f) {
            }

            @Override
            public final void onTabScroll(boolean z) {
            }

            @Override
            public final void showActionMode$1(boolean z) {
            }
        };
        this.sharedMediaLayout = r0;
        if (r0.getSearchOptionsItem() != null) {
            getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        }
        setPinnedToTop(true);
        this.sharedMediaLayout.photoVideoOptionsItem.setTranslationY(0.0f);
        if (getSearchOptionsItem() != null) {
            getSearchOptionsItem().setTranslationY(0.0f);
        }
        setBackgroundColor(getThemedColor(i));
        AnonymousClass5 anonymousClass5 = this.sharedMediaLayout;
        StoriesController.SearchStoriesList searchStoriesList = this.storiesList;
        anonymousClass5.searchStoriesList = searchStoriesList;
        SharedMediaLayout.AnonymousClass9 anonymousClass9 = anonymousClass5.storiesAdapter;
        anonymousClass9.storiesList = searchStoriesList;
        anonymousClass9.notifyDataSetChanged();
        SharedMediaLayout.StoriesAdapter storiesAdapter = anonymousClass5.animationSupportingStoriesAdapter;
        storiesAdapter.storiesList = searchStoriesList;
        storiesAdapter.notifyDataSetChanged();
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.sharedMediaLayoutContainer = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i));
        this.sharedMediaLayoutContainer.addView(this.sharedMediaLayout, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.storiesTotal = frameLayout3;
        frameLayout3.setBackgroundColor(getThemedColor(i));
        TextView textView = new TextView(context);
        this.storiesTotalTextView = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.storiesTotalTextView.setTextSize(1, 15.0f);
        this.storiesTotalTextView.setTextColor(getThemedColor(Theme.key_chat_searchPanelText));
        this.storiesTotalTextView.setText(LocaleController.formatPluralString("FoundStories", searchStoriesList.count, new Object[0]));
        this.storiesTotal.addView(this.storiesTotalTextView, LayoutHelper.createFrame(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        view.setBackgroundColor(Theme.getColor(Theme.key_divider, this.resourceProvider));
        this.storiesTotal.addView(view, new FrameLayout.LayoutParams(LayoutHelper.getSize(-1.0f), LayoutHelper.getSize(1.0f / AndroidUtilities.density), 55));
        this.sharedMediaLayoutContainer.addView(this.storiesTotal, LayoutHelper.createFrame(-1, 49, 87));
        this.contentView.addView(this.sharedMediaLayoutContainer, LayoutHelper.createFrame(-1, -1, 119));
        MessagesSearchAdapter.StoriesView storiesView = new MessagesSearchAdapter.StoriesView(context, this.resourceProvider);
        this.storiesView = storiesView;
        storiesView.setBackground(Theme.createSelectorWithBackgroundDrawable(getThemedColor(i), getThemedColor(Theme.key_listSelector)));
        this.storiesView.setOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(this, 28));
        updateStoriesVisible(this.storiesView.set(searchStoriesList), false);
        this.storiesView.setMessages(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.hashtag, this.username);
        frameLayout.addView(this.storiesView, LayoutHelper.createFrame(-1, 48, 55));
        transit(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ChatActivity.AnonymousClass37.AnonymousClass1 anonymousClass1;
        if (i != NotificationCenter.storiesListUpdated) {
            if (i != NotificationCenter.hashtagSearchUpdated || (anonymousClass1 = this.chatContainer) == null || anonymousClass1.chatActivity == null || ((Integer) objArr[0]).intValue() != this.chatContainer.chatActivity.getClassGuid()) {
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
                textView.setText(LocaleController.formatPluralString("FoundStories", searchStoriesList.count, new Object[0]));
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(null, Theme.key_windowBackgroundWhite, true)) > 0.699999988079071d;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().getStoriesController().attachedSearchLists;
        StoriesController.SearchStoriesList searchStoriesList = this.storiesList;
        arrayList.add(searchStoriesList);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.hashtagSearchUpdated);
        searchStoriesList.getClass();
        searchStoriesList.load(18, Collections.EMPTY_LIST, true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getMessagesController().getStoriesController().attachedSearchLists.remove(this.storiesList);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.hashtagSearchUpdated);
        super.onFragmentDestroy();
    }

    public final void transit(boolean z, boolean z2) {
        ChatActivityContainer.AnonymousClass1 anonymousClass1;
        ChatActivity.AnonymousClass34 anonymousClass34;
        int i = 1;
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
            valueAnimatorOfFloat.addUpdateListener(new AnonymousClass6(this, i));
            this.transitAnimator.addListener(new AnonymousClass7(this, z, i));
            this.transitAnimator.setDuration(320L);
            this.transitAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.transitAnimator.start();
            return;
        }
        this.storiesVisible = z;
        this.transitValue = z ? 1.0f : 0.0f;
        setScaleX(z ? 1.0f : 0.95f);
        setScaleY(z ? 1.0f : 0.95f);
        this.sharedMediaLayoutContainer.setAlpha(z ? 1.0f : 0.0f);
        this.sharedMediaLayoutContainer.setVisibility(z ? 0 : 8);
        ChatActivity.AnonymousClass37.AnonymousClass1 anonymousClass2 = this.chatContainer;
        if (anonymousClass2 == null || (anonymousClass1 = anonymousClass2.chatActivity) == null || (anonymousClass34 = anonymousClass1.messagesSearchListView) == null) {
            return;
        }
        anonymousClass34.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.transitValue));
        this.chatContainer.chatActivity.messagesSearchListView.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.transitValue));
    }

    public final void updateStoriesVisible(boolean z, boolean z2) {
        int i = 0;
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
        ViewPropertyAnimator duration = this.storiesView.animate().translationY(z ? 0.0f : -AndroidUtilities.dp(48.0f)).withEndAction(new FileLoader$$ExternalSyntheticLambda1(17, this, z)).setDuration(320L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        duration.setInterpolator(cubicBezierInterpolator).start();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.contentViewValue, z ? 1.0f : 0.0f);
        this.contentViewAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new AnonymousClass6(this, i));
        this.contentViewAnimator.addListener(new AnonymousClass7(this, z, i));
        this.contentViewAnimator.setDuration(320L);
        this.contentViewAnimator.setInterpolator(cubicBezierInterpolator);
        this.contentViewAnimator.start();
    }
}
