package org.telegram.ui.Stories.bots;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.BaseMenuWrapper;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline1;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.AccountFrozenAlert;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda23;
import org.telegram.ui.BoostsActivity$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda7;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda1;
import org.telegram.ui.ProfileStoriesCollectionTabs;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stories.LivePlayer$1$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesViewPager$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.StoryRecorder$$ExternalSyntheticLambda7;
import org.telegram.ui.ThemePreviewActivity;
import org.telegram.ui.TodoItemMenu;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda13;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda5;
import org.telegram.ui.TopicsFragment$$ExternalSyntheticLambda9;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda4;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda7;

public abstract class BotPreviewsEditContainer extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static LongSparseArray attachedContainers;
    public static LongSparseArray cachedLists;
    public final long bot_id;
    public final int currentAccount;
    public final BaseFragment fragment;
    public final ArrayList langLists;
    public final ArrayList localLangs;
    public final StoriesController.BotPreviewsList mainList;
    public final Theme.ResourcesProvider resourcesProvider;
    public int setColumnsCount;
    public Boolean shownTabs;
    public float tabsAlpha;
    public ValueAnimator tabsAnimator;
    public final ViewPagerFixed.AnonymousClass3 tabsView;
    public final ProfileStoriesCollectionTabs.AnonymousClass1 viewPager;
    public int visibleHeight;

    public final class BotPreviewsEditLangContainer extends FrameLayout {
        public static final int $r8$clinit = 0;
        public final AnonymousClass7 adapter;
        public boolean allowStoriesSingleColumn;
        public int animateToColumnsCount;
        public boolean columnsAnimation;
        public float columnsAnimationProgress;
        public int columnsCount;
        public final StickerEmptyView emptyView;
        public final ButtonWithCounterView emptyViewButton2;
        public final IntroActivity.AnonymousClass4 emptyViewOr;
        public final FooterView footer;
        public boolean isInPinchToZoomTouchMode;
        public final DefaultItemAnimator itemAnimator;
        public final UniversalRecyclerView.AnonymousClass6 layoutManager;
        public StoriesController.BotPreviewsList list;
        public final AnonymousClass3 listView;
        public boolean maybePinchToZoomTouchMode;
        public boolean maybePinchToZoomTouchMode2;
        public int pinchCenterOffset;
        public int pinchCenterPosition;
        public int pinchCenterX;
        public float pinchScale;
        public boolean pinchScaleUp;
        public float pinchStartDistance;
        public int pointerId1;
        public int pointerId2;
        public final AnonymousClass8 progressView;
        public final Rect rect;
        public final ItemTouchHelper reorder;
        public boolean storiesColumnsCountSet;
        public final StoriesAdapter supportingAdapter;
        public final StickersAlert.AnonymousClass7 supportingLayoutManager;
        public final SharedMediaLayout.InternalListView supportingListView;
        public final SharedMediaLayout.AnonymousClass12 this$0;

        public final class AnonymousClass2 extends BaseMenuWrapper {
            public final int $r8$classId;
            public final BotPreviewsEditLangContainer this$1;

            public AnonymousClass2(BotPreviewsEditLangContainer botPreviewsEditLangContainer, int i) {
                this.$r8$classId = i;
                this.this$1 = botPreviewsEditLangContainer;
            }

            @Override
            public final int getSpanSize(int i) {
                switch (this.$r8$classId) {
                    case 0:
                        this.this$1.adapter.getClass();
                        break;
                    default:
                        this.this$1.adapter.getClass();
                        break;
                }
                return 1;
            }
        }

        public final class AnonymousClass7 extends StoriesAdapter {
            public AnonymousClass7(Context context) {
                super(context);
            }

            @Override
            public final void notifyDataSetChanged() {
                super.notifyDataSetChanged();
                BotPreviewsEditLangContainer botPreviewsEditLangContainer = BotPreviewsEditLangContainer.this;
                if (botPreviewsEditLangContainer.supportingListView.getVisibility() == 0) {
                    botPreviewsEditLangContainer.supportingAdapter.notifyDataSetChanged();
                }
                StickerEmptyView stickerEmptyView = botPreviewsEditLangContainer.emptyView;
                if (stickerEmptyView != null) {
                    StoriesController.BotPreviewsList botPreviewsList = this.storiesList;
                    stickerEmptyView.showProgress(botPreviewsList != null && botPreviewsList.loading, true);
                }
            }
        }

        public final class FooterView extends LinearLayout {
            public final ButtonWithCounterView button2View;
            public final BotStarsActivity.AnonymousClass6 buttonView;
            public final IntroActivity.AnonymousClass4 orTextView;
            public final TextView textView;

            public FooterView(Context context, Theme.ResourcesProvider resourcesProvider) {
                super(context);
                setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f));
                setOrientation(1);
                TextView textView = new TextView(context);
                this.textView = textView;
                int i = Theme.key_windowBackgroundWhiteGrayText;
                OKLCH.m(i, resourcesProvider, textView, 14.0f);
                textView.setGravity(17);
                textView.setTextAlignment(4);
                addView(textView, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
                BotStarsActivity.AnonymousClass6 anonymousClass6 = new BotStarsActivity.AnonymousClass6(1, context, resourcesProvider, true);
                this.buttonView = anonymousClass6;
                anonymousClass6.setMinWidth(AndroidUtilities.dp(200.0f));
                anonymousClass6.setText(LocaleController.getString(R.string.ProfileBotAddPreview), false, true);
                addView(anonymousClass6, LayoutHelper.createLinear(-2, 44, 17));
                IntroActivity.AnonymousClass4 anonymousClass4 = new IntroActivity.AnonymousClass4(context, resourcesProvider);
                this.orTextView = anonymousClass4;
                anonymousClass4.setTextColor(Theme.getColor(i, resourcesProvider));
                anonymousClass4.setText(LocaleController.getString(R.string.ProfileBotOr));
                anonymousClass4.setTextSize(1, 14.0f);
                anonymousClass4.setTextAlignment(4);
                anonymousClass4.setGravity(17);
                anonymousClass4.setTypeface(AndroidUtilities.bold());
                addView(anonymousClass4, LayoutHelper.createLinear(165, -2, 17, 0, 17, 0, 12));
                ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, false);
                this.button2View = buttonWithCounterView;
                buttonWithCounterView.setMinWidth(AndroidUtilities.dp(200.0f));
                addView(buttonWithCounterView, LayoutHelper.createLinear(-2, 44, 17));
            }
        }

        public class StoriesAdapter extends RecyclerListView.FastScrollAdapter {
            public boolean applyingReorder;
            public final Context context;
            public SharedPhotoVideoCell2.SharedResources sharedResources;
            public StoriesController.BotPreviewsList storiesList;
            public StoriesAdapter supportingAdapter;
            public final ArrayList uploadingStories = new ArrayList();
            public final ArrayList lastPinnedIds = new ArrayList();

            public final class AnonymousClass1 extends MessageObject {
                @Override
                public final float getProgress() {
                    return this.uploadingStory.progress;
                }
            }

            public StoriesAdapter(Context context) {
                this.context = context;
                checkColumns$1();
            }

            public final boolean canReorder(int i) {
                if (this.storiesList == null) {
                    return false;
                }
                BotPreviewsEditLangContainer botPreviewsEditLangContainer = BotPreviewsEditLangContainer.this;
                TLRPC.User user = MessagesController.getInstance(botPreviewsEditLangContainer.this$0.currentAccount).getUser(Long.valueOf(botPreviewsEditLangContainer.this$0.bot_id));
                return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
            }

            public final void checkColumns$1() {
                if (this.storiesList == null) {
                    return;
                }
                BotPreviewsEditLangContainer botPreviewsEditLangContainer = BotPreviewsEditLangContainer.this;
                if ((!botPreviewsEditLangContainer.storiesColumnsCountSet || (botPreviewsEditLangContainer.allowStoriesSingleColumn && getItemCount() > 1)) && getItemCount() > 0) {
                    if (getItemCount() < 5) {
                        int iMax = Math.max(1, getItemCount());
                        botPreviewsEditLangContainer.columnsCount = iMax;
                        botPreviewsEditLangContainer.allowStoriesSingleColumn = iMax == 1;
                    } else if (botPreviewsEditLangContainer.allowStoriesSingleColumn || botPreviewsEditLangContainer.columnsCount == 1) {
                        botPreviewsEditLangContainer.allowStoriesSingleColumn = false;
                        botPreviewsEditLangContainer.columnsCount = Math.max(2, SharedConfig.storiesColumnsCount);
                    }
                    botPreviewsEditLangContainer.layoutManager.setSpanCount(botPreviewsEditLangContainer.columnsCount);
                    botPreviewsEditLangContainer.storiesColumnsCountSet = true;
                }
            }

            @Override
            public final int getItemCount() {
                if (this.storiesList == null) {
                    return 0;
                }
                return this.storiesList.messageObjects.size() + this.uploadingStories.size();
            }

            @Override
            public final int getItemViewType(int i) {
                return 19;
            }

            @Override
            public final String getLetter(int i) {
                MessageObject messageObject;
                TL_stories.StoryItem storyItem;
                StoriesController.BotPreviewsList botPreviewsList = this.storiesList;
                if (botPreviewsList == null || i < 0 || i >= botPreviewsList.messageObjects.size() || (messageObject = (MessageObject) this.storiesList.messageObjects.get(i)) == null || (storyItem = messageObject.storyItem) == null) {
                    return null;
                }
                return LocaleController.formatYearMont(storyItem.date, true);
            }

            @Override
            public final void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
                int measuredHeight = recyclerListView.getChildAt(0).getMeasuredHeight();
                StoriesAdapter storiesAdapter = this.supportingAdapter;
                BotPreviewsEditLangContainer botPreviewsEditLangContainer = BotPreviewsEditLangContainer.this;
                int i = this == storiesAdapter ? botPreviewsEditLangContainer.animateToColumnsCount : botPreviewsEditLangContainer.columnsCount;
                int iCeil = (int) (Math.ceil(getItemCount() / i) * ((double) measuredHeight));
                int measuredHeight2 = recyclerListView.getMeasuredHeight() - recyclerListView.getPaddingTop();
                if (measuredHeight == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                } else {
                    float f2 = f * (iCeil - measuredHeight2);
                    iArr[0] = ((int) (f2 / measuredHeight)) * i;
                    iArr[1] = ((int) f2) % measuredHeight;
                }
            }

            @Override
            public final int getTotalItemsCount() {
                return getItemCount();
            }

            @Override
            public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return false;
            }

            @Override
            public void notifyDataSetChanged() {
                StoriesController.BotPreviewsList botPreviewsList = this.storiesList;
                boolean z = botPreviewsList != null;
                BotPreviewsEditLangContainer botPreviewsEditLangContainer = BotPreviewsEditLangContainer.this;
                if (z) {
                    ArrayList arrayList = this.uploadingStories;
                    arrayList.clear();
                    ArrayList arrayList2 = (ArrayList) MessagesController.getInstance(this.storiesList.currentAccount).getStoriesController().uploadingStoriesByDialogId.get(botPreviewsEditLangContainer.this$0.bot_id);
                    if (arrayList2 != null) {
                        for (int i = 0; i < arrayList2.size(); i++) {
                            StoriesController.UploadingStory uploadingStory = (StoriesController.UploadingStory) arrayList2.get(i);
                            StoryEntry storyEntry = uploadingStory.entry;
                            if (storyEntry != null && !storyEntry.isEdit && TextUtils.equals(storyEntry.botLang, botPreviewsList.lang_code)) {
                                arrayList.add(uploadingStory);
                            }
                        }
                    }
                }
                this.mObservable.notifyChanged();
                StoriesAdapter storiesAdapter = this.supportingAdapter;
                if (storiesAdapter != null) {
                    storiesAdapter.notifyDataSetChanged();
                }
                if (this != botPreviewsEditLangContainer.supportingAdapter) {
                    checkColumns$1();
                    botPreviewsEditLangContainer.updateFooter();
                }
            }

            @Override
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                if (this.storiesList == null) {
                    return;
                }
                View view = viewHolder.itemView;
                if (view instanceof SharedPhotoVideoCell2) {
                    SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
                    sharedPhotoVideoCell2.isStory = true;
                    ArrayList arrayList = this.uploadingStories;
                    BotPreviewsEditLangContainer botPreviewsEditLangContainer = BotPreviewsEditLangContainer.this;
                    if (i >= 0 && i < arrayList.size()) {
                        StoriesController.UploadingStory uploadingStory = (StoriesController.UploadingStory) arrayList.get(i);
                        sharedPhotoVideoCell2.isStoryPinned = false;
                        if (uploadingStory.sharedMessageObject == null) {
                            TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                            long j = uploadingStory.random_id;
                            int i2 = (int) (j ^ (j >>> 32));
                            tL_storyItem.messageId = i2;
                            tL_storyItem.id = i2;
                            tL_storyItem.attachPath = uploadingStory.firstFramePath;
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.storiesList.currentAccount, tL_storyItem);
                            uploadingStory.sharedMessageObject = anonymousClass1;
                            anonymousClass1.uploadingStory = uploadingStory;
                        }
                        sharedPhotoVideoCell2.setMessageObject(uploadingStory.sharedMessageObject, this == this.supportingAdapter ? botPreviewsEditLangContainer.animateToColumnsCount : botPreviewsEditLangContainer.columnsCount, false);
                        sharedPhotoVideoCell2.isStory = true;
                        sharedPhotoVideoCell2.setReorder(false);
                        sharedPhotoVideoCell2.setChecked(false, false);
                        return;
                    }
                    int size = i - arrayList.size();
                    if (size < 0 || size >= this.storiesList.messageObjects.size()) {
                        sharedPhotoVideoCell2.isStoryPinned = false;
                        sharedPhotoVideoCell2.setMessageObject(null, this == this.supportingAdapter ? botPreviewsEditLangContainer.animateToColumnsCount : botPreviewsEditLangContainer.columnsCount, false);
                        sharedPhotoVideoCell2.isStory = true;
                        return;
                    }
                    MessageObject messageObject = (MessageObject) this.storiesList.messageObjects.get(size);
                    sharedPhotoVideoCell2.isStoryPinned = messageObject != null && this.storiesList.isPinned(messageObject.getId());
                    sharedPhotoVideoCell2.setReorder(true);
                    sharedPhotoVideoCell2.setMessageObject(messageObject, this == this.supportingAdapter ? botPreviewsEditLangContainer.animateToColumnsCount : botPreviewsEditLangContainer.columnsCount, false);
                    SharedMediaLayout.AnonymousClass12 anonymousClass12 = botPreviewsEditLangContainer.this$0;
                    if (!SharedMediaLayout.this.isActionModeShowed || messageObject == null) {
                        sharedPhotoVideoCell2.setChecked(false, false);
                    } else {
                        sharedPhotoVideoCell2.setChecked(anonymousClass12.isSelected(messageObject), true);
                    }
                }
            }

            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                SharedPhotoVideoCell2.SharedResources sharedResources = this.sharedResources;
                BotPreviewsEditLangContainer botPreviewsEditLangContainer = BotPreviewsEditLangContainer.this;
                if (sharedResources == null) {
                    this.sharedResources = new SharedPhotoVideoCell2.SharedResources(viewGroup.getContext(), botPreviewsEditLangContainer.this$0.resourcesProvider);
                }
                SharedPhotoVideoCell2 sharedPhotoVideoCell2 = new SharedPhotoVideoCell2(this.context, this.sharedResources, botPreviewsEditLangContainer.this$0.currentAccount);
                sharedPhotoVideoCell2.check2 = true;
                sharedPhotoVideoCell2.setGradientView(null);
                sharedPhotoVideoCell2.isStory = true;
                return new RecyclerListView.Holder(sharedPhotoVideoCell2);
            }

            @Override
            public final void onFastScrollSingleTap() {
            }
        }

        public BotPreviewsEditLangContainer(SharedMediaLayout.AnonymousClass12 anonymousClass12, Context context) {
            super(context);
            this.this$0 = anonymousClass12;
            this.columnsCount = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
            this.animateToColumnsCount = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
            this.allowStoriesSingleColumn = false;
            this.storiesColumnsCountSet = false;
            this.rect = new Rect();
            UniversalRecyclerView.AnonymousClass6 anonymousClass6 = new UniversalRecyclerView.AnonymousClass6();
            this.layoutManager = anonymousClass6;
            anonymousClass6.mSpanSizeLookup = new AnonymousClass2(this, 0);
            anonymousClass6.setSpanCount(this.columnsCount);
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            this.itemAnimator = defaultItemAnimator;
            defaultItemAnimator.setDurations(280L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mSupportsChangeAnimations = false;
            ?? r6 = new SharedMediaLayout.SharedMediaListView(context) {
                @Override
                public final void dispatchDraw(Canvas canvas) {
                    super.dispatchDraw(canvas);
                    int i = 0;
                    for (int i2 = 0; i2 < getChildCount(); i2++) {
                        int bottom = getChildAt(i2).getBottom() - getPaddingTop();
                        if (bottom > i) {
                            i = bottom;
                        }
                    }
                    float fLerp = i;
                    BotPreviewsEditLangContainer botPreviewsEditLangContainer = BotPreviewsEditLangContainer.this;
                    if (botPreviewsEditLangContainer.columnsAnimation) {
                        SharedMediaLayout.InternalListView internalListView = botPreviewsEditLangContainer.supportingListView;
                        int i3 = 0;
                        for (int i4 = 0; i4 < internalListView.getChildCount(); i4++) {
                            int bottom2 = internalListView.getChildAt(i4).getBottom() - internalListView.getPaddingTop();
                            if (bottom2 > i3) {
                                i3 = bottom2;
                            }
                        }
                        fLerp = AndroidUtilities.lerp(fLerp, i3, botPreviewsEditLangContainer.columnsAnimationProgress);
                    }
                    int i5 = botPreviewsEditLangContainer.adapter.getItemCount() <= 0 ? 8 : 0;
                    FooterView footerView = botPreviewsEditLangContainer.footer;
                    footerView.setVisibility(i5);
                    footerView.setTranslationY(fLerp);
                }

                @Override
                public final int getAnimateToColumnsCount() {
                    return BotPreviewsEditLangContainer.this.animateToColumnsCount;
                }

                @Override
                public final float getChangeColumnsProgress() {
                    return BotPreviewsEditLangContainer.this.columnsAnimationProgress;
                }

                @Override
                public final int getColumnsCount() {
                    return BotPreviewsEditLangContainer.this.columnsCount;
                }

                @Override
                public final RecyclerListView.FastScrollAdapter getMovingAdapter() {
                    BotPreviewsEditLangContainer botPreviewsEditLangContainer = BotPreviewsEditLangContainer.this;
                    if (botPreviewsEditLangContainer.reorder.mActionState != 0 || SharedMediaLayout.this.isActionModeShowed) {
                        return null;
                    }
                    return botPreviewsEditLangContainer.adapter;
                }

                @Override
                public final RecyclerListView.FastScrollAdapter getSupportingAdapter() {
                    return BotPreviewsEditLangContainer.this.supportingAdapter;
                }

                @Override
                public final SharedMediaLayout.InternalListView getSupportingListView() {
                    return BotPreviewsEditLangContainer.this.supportingListView;
                }

                @Override
                public final boolean isChangeColumnsAnimation() {
                    return BotPreviewsEditLangContainer.this.columnsAnimation;
                }

                @Override
                public final boolean isStories() {
                    return true;
                }
            };
            this.listView = r6;
            r6.setScrollingTouchSlop(1);
            r6.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
            r6.setPadding(0, 0, 0, 0);
            r6.setItemAnimator(null);
            r6.setClipToPadding(false);
            r6.setSectionsType(2);
            r6.setLayoutManager(anonymousClass6);
            addView((View) r6, LayoutHelper.createFrame(-1.0f, -1));
            final int i = 0;
            r6.addItemDecoration(new RecyclerView.ItemDecoration(this) {
                public final BotPreviewsEditLangContainer this$1;

                {
                    this.this$1 = this;
                }

                @Override
                public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    switch (i) {
                        case 0:
                            if (!(view instanceof SharedPhotoVideoCell2)) {
                                rect.left = 0;
                                rect.top = 0;
                                rect.bottom = 0;
                                rect.right = 0;
                            } else {
                                SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
                                BotPreviewsEditLangContainer botPreviewsEditLangContainer = this.this$1;
                                botPreviewsEditLangContainer.listView.getClass();
                                int childAdapterPosition = RecyclerView.getChildAdapterPosition(sharedPhotoVideoCell2);
                                int i2 = botPreviewsEditLangContainer.layoutManager.mSpanCount;
                                sharedPhotoVideoCell2.isTop = childAdapterPosition < i2;
                                int i3 = childAdapterPosition % i2;
                                sharedPhotoVideoCell2.isFirst = i3 == 0;
                                sharedPhotoVideoCell2.isLast = i3 == i2 - 1;
                                rect.left = 0;
                                rect.top = 0;
                                rect.bottom = 0;
                                rect.right = 0;
                            }
                            break;
                        default:
                            if (!(view instanceof SharedPhotoVideoCell2)) {
                                rect.left = 0;
                                rect.top = 0;
                                rect.bottom = 0;
                                rect.right = 0;
                            } else {
                                SharedPhotoVideoCell2 sharedPhotoVideoCell3 = (SharedPhotoVideoCell2) view;
                                BotPreviewsEditLangContainer botPreviewsEditLangContainer2 = this.this$1;
                                botPreviewsEditLangContainer2.supportingListView.getClass();
                                int childAdapterPosition2 = RecyclerView.getChildAdapterPosition(sharedPhotoVideoCell3);
                                int i4 = botPreviewsEditLangContainer2.supportingLayoutManager.mSpanCount;
                                sharedPhotoVideoCell3.isTop = childAdapterPosition2 < i4;
                                int i5 = childAdapterPosition2 % i4;
                                sharedPhotoVideoCell3.isFirst = i5 == 0;
                                sharedPhotoVideoCell3.isLast = i5 == i4 - 1;
                                rect.left = 0;
                                rect.top = 0;
                                rect.bottom = 0;
                                rect.right = 0;
                            }
                            break;
                    }
                }
            });
            r6.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, 14));
            r6.setOnItemLongClickListener(new StoriesViewPager$$ExternalSyntheticLambda0(this, 22));
            SharedMediaLayout.InternalListView internalListView = new SharedMediaLayout.InternalListView(context, null);
            this.supportingListView = internalListView;
            StickersAlert.AnonymousClass7 anonymousClass7 = new StickersAlert.AnonymousClass7(this);
            this.supportingLayoutManager = anonymousClass7;
            internalListView.setLayoutManager(anonymousClass7);
            final int i2 = 1;
            internalListView.addItemDecoration(new RecyclerView.ItemDecoration(this) {
                public final BotPreviewsEditLangContainer this$1;

                {
                    this.this$1 = this;
                }

                @Override
                public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    switch (i2) {
                        case 0:
                            if (!(view instanceof SharedPhotoVideoCell2)) {
                                rect.left = 0;
                                rect.top = 0;
                                rect.bottom = 0;
                                rect.right = 0;
                            } else {
                                SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
                                BotPreviewsEditLangContainer botPreviewsEditLangContainer = this.this$1;
                                botPreviewsEditLangContainer.listView.getClass();
                                int childAdapterPosition = RecyclerView.getChildAdapterPosition(sharedPhotoVideoCell2);
                                int i3 = botPreviewsEditLangContainer.layoutManager.mSpanCount;
                                sharedPhotoVideoCell2.isTop = childAdapterPosition < i3;
                                int i4 = childAdapterPosition % i3;
                                sharedPhotoVideoCell2.isFirst = i4 == 0;
                                sharedPhotoVideoCell2.isLast = i4 == i3 - 1;
                                rect.left = 0;
                                rect.top = 0;
                                rect.bottom = 0;
                                rect.right = 0;
                            }
                            break;
                        default:
                            if (!(view instanceof SharedPhotoVideoCell2)) {
                                rect.left = 0;
                                rect.top = 0;
                                rect.bottom = 0;
                                rect.right = 0;
                            } else {
                                SharedPhotoVideoCell2 sharedPhotoVideoCell3 = (SharedPhotoVideoCell2) view;
                                BotPreviewsEditLangContainer botPreviewsEditLangContainer2 = this.this$1;
                                botPreviewsEditLangContainer2.supportingListView.getClass();
                                int childAdapterPosition2 = RecyclerView.getChildAdapterPosition(sharedPhotoVideoCell3);
                                int i5 = botPreviewsEditLangContainer2.supportingLayoutManager.mSpanCount;
                                sharedPhotoVideoCell3.isTop = childAdapterPosition2 < i5;
                                int i6 = childAdapterPosition2 % i5;
                                sharedPhotoVideoCell3.isFirst = i6 == 0;
                                sharedPhotoVideoCell3.isLast = i6 == i5 - 1;
                                rect.left = 0;
                                rect.top = 0;
                                rect.bottom = 0;
                                rect.right = 0;
                            }
                            break;
                    }
                }
            });
            anonymousClass7.setSpanCount(this.animateToColumnsCount);
            internalListView.setVisibility(8);
            addView(internalListView, LayoutHelper.createFrame(-1.0f, -1));
            AnonymousClass7 anonymousClass8 = new AnonymousClass7(context);
            this.adapter = anonymousClass8;
            r6.setAdapter(anonymousClass8);
            StoriesAdapter storiesAdapter = new StoriesAdapter(getContext());
            anonymousClass8.supportingAdapter = storiesAdapter;
            this.supportingAdapter = storiesAdapter;
            internalListView.setAdapter(storiesAdapter);
            ?? r9 = new FlickerLoadingView(context) {
                public final Paint backgroundPaint = new Paint();

                @Override
                public final int getColumnsCount() {
                    return BotPreviewsEditLangContainer.this.columnsCount;
                }

                @Override
                public final int getViewType() {
                    setIsSingleCell(false);
                    return 27;
                }

                @Override
                public final void onDraw(Canvas canvas) {
                    Paint paint = this.backgroundPaint;
                    paint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, BotPreviewsEditLangContainer.this.this$0.resourcesProvider));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
                    super.onDraw(canvas);
                }
            };
            this.progressView = r9;
            r9.showDate = false;
            StickerEmptyView stickerEmptyView = new StickerEmptyView(1, null, context, r9);
            this.emptyView = stickerEmptyView;
            stickerEmptyView.setVisibility(8);
            stickerEmptyView.setAnimateLayoutChange(true);
            addView(stickerEmptyView, LayoutHelper.createFrame(-1.0f, -1));
            stickerEmptyView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(29));
            stickerEmptyView.showProgress(true, false);
            stickerEmptyView.stickerView.setVisibility(8);
            stickerEmptyView.title.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            stickerEmptyView.subtitle.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(anonymousClass12.currentAccount).botPreviewMediasMax, new Object[0]));
            ButtonWithCounterView buttonWithCounterView = stickerEmptyView.button;
            buttonWithCounterView.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            buttonWithCounterView.setVisibility(0);
            buttonWithCounterView.setOnClickListener(new BotPreviewsEditContainer$BotPreviewsEditLangContainer$$ExternalSyntheticLambda3(this, 0));
            IntroActivity.AnonymousClass4 anonymousClass4 = new IntroActivity.AnonymousClass4(this, context);
            this.emptyViewOr = anonymousClass4;
            int i3 = Theme.key_windowBackgroundWhiteGrayText;
            Theme.ResourcesProvider resourcesProvider = anonymousClass12.resourcesProvider;
            anonymousClass4.setTextColor(Theme.getColor(i3, resourcesProvider));
            anonymousClass4.setText(LocaleController.getString(R.string.ProfileBotOr));
            anonymousClass4.setTextSize(1, 14.0f);
            anonymousClass4.setTextAlignment(4);
            anonymousClass4.setGravity(17);
            anonymousClass4.setTypeface(AndroidUtilities.bold());
            LinearLayout.LayoutParams layoutParamsCreateLinear = LayoutHelper.createLinear(165, -2, 17, 0, 17, 0, 12);
            StickerEmptyView.AnonymousClass2 anonymousClass2 = stickerEmptyView.linearLayout;
            anonymousClass2.addView(anonymousClass4, layoutParamsCreateLinear);
            ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, resourcesProvider, false);
            this.emptyViewButton2 = buttonWithCounterView2;
            buttonWithCounterView2.setMinWidth(AndroidUtilities.dp(200.0f));
            anonymousClass2.addView(buttonWithCounterView2, LayoutHelper.createLinear(-2, 44, 17));
            stickerEmptyView.addView((View) r9, 0, LayoutHelper.createFrame(-1.0f, -1));
            r6.setEmptyView(stickerEmptyView);
            r6.animateEmptyView = true;
            r6.emptyViewAnimationType = 0;
            new SparseArray();
            new HashMap();
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ViewPagerFixed.TabsView.AnonymousClass6(this, 6));
            this.reorder = itemTouchHelper;
            itemTouchHelper.attachToRecyclerView(r6);
            FooterView footerView = new FooterView(context, resourcesProvider);
            this.footer = footerView;
            addView(footerView, LayoutHelper.createFrame(-1, -2, 48));
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            if (view == this.supportingListView) {
                return true;
            }
            return super.drawChild(canvas, view, j);
        }

        public final void finishPinchToMediaColumnsCount() {
            if (this.columnsAnimation) {
                float f = this.columnsAnimationProgress;
                SharedMediaLayout.InternalListView internalListView = this.supportingListView;
                AnonymousClass3 anonymousClass3 = this.listView;
                if (f != 1.0f) {
                    if (f == 0.0f) {
                        this.columnsAnimation = false;
                        internalListView.setVisibility(8);
                        anonymousClass3.invalidate();
                        return;
                    }
                    boolean z = f > 0.2f;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
                    valueAnimatorOfFloat.addUpdateListener(new ChatActivity.AnonymousClass133(this, 14));
                    valueAnimatorOfFloat.addListener(new TodoItemMenu.AnonymousClass15(5, this, z));
                    valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    valueAnimatorOfFloat.setDuration(200L);
                    valueAnimatorOfFloat.start();
                    return;
                }
                this.columnsAnimation = false;
                int i = this.animateToColumnsCount;
                this.columnsCount = i;
                this.this$0.setColumnsCount = i;
                SharedConfig.setStoriesColumnsCount(i);
                AnonymousClass7 anonymousClass7 = this.adapter;
                int itemCount = anonymousClass7.getItemCount();
                internalListView.setVisibility(8);
                int i2 = this.columnsCount;
                UniversalRecyclerView.AnonymousClass6 anonymousClass6 = this.layoutManager;
                anonymousClass6.setSpanCount(i2);
                anonymousClass3.invalidateItemDecorations();
                anonymousClass3.invalidate();
                if (anonymousClass7.getItemCount() == itemCount) {
                    AndroidUtilities.updateVisibleRows(anonymousClass3);
                } else {
                    anonymousClass7.notifyDataSetChanged();
                }
                int i3 = this.pinchCenterPosition;
                if (i3 >= 0) {
                    View viewFindViewByPosition = this.supportingLayoutManager.findViewByPosition(i3);
                    if (viewFindViewByPosition != null) {
                        this.pinchCenterOffset = viewFindViewByPosition.getTop();
                    }
                    anonymousClass6.scrollToPositionWithOffset(this.pinchCenterPosition, (-anonymousClass3.getPaddingTop()) + this.pinchCenterOffset, anonymousClass6.mShouldReverseLayout);
                }
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            AnonymousClass3 anonymousClass3 = this.listView;
            anonymousClass3.setPadding(anonymousClass3.getPaddingLeft(), anonymousClass3.topPadding, anonymousClass3.getPaddingRight(), this.footer.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
        }

        public void setList(StoriesController.BotPreviewsList botPreviewsList) {
            if (this.list != botPreviewsList) {
                this.allowStoriesSingleColumn = false;
                this.storiesColumnsCountSet = false;
                this.columnsCount = this.this$0.setColumnsCount;
            }
            this.list = botPreviewsList;
            AnonymousClass7 anonymousClass7 = this.adapter;
            anonymousClass7.storiesList = botPreviewsList;
            if (anonymousClass7 != BotPreviewsEditLangContainer.this.supportingAdapter) {
                anonymousClass7.checkColumns$1();
            }
            anonymousClass7.notifyDataSetChanged();
            StoriesAdapter storiesAdapter = this.supportingAdapter;
            storiesAdapter.storiesList = botPreviewsList;
            if (storiesAdapter != BotPreviewsEditLangContainer.this.supportingAdapter) {
                storiesAdapter.checkColumns$1();
            }
            storiesAdapter.notifyDataSetChanged();
            updateFooter();
        }

        public void setVisibleHeight(int i) {
            float f = (-(getMeasuredHeight() - Math.max(i, AndroidUtilities.dp(280.0f)))) / 2.0f;
            this.emptyView.setTranslationY(f);
            setTranslationY(-f);
        }

        public final void startPinchToMediaColumnsCount(boolean z) {
            if (this.columnsAnimation || SharedMediaLayout.this.isActionModeShowed) {
                return;
            }
            int i = this.columnsCount + (!z ? 1 : -1);
            if (i > 6) {
                i = !z ? 9 : 6;
            }
            int iClamp = Utilities.clamp(i, 6, this.allowStoriesSingleColumn ? 1 : 2);
            this.animateToColumnsCount = iClamp;
            if (iClamp == this.columnsCount || this.allowStoriesSingleColumn) {
                return;
            }
            SharedMediaLayout.InternalListView internalListView = this.supportingListView;
            internalListView.setVisibility(0);
            internalListView.setAdapter(this.supportingAdapter);
            internalListView.setPadding(internalListView.getPaddingLeft(), 0, internalListView.getPaddingRight(), this.footer.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
            StickersAlert.AnonymousClass7 anonymousClass7 = this.supportingLayoutManager;
            anonymousClass7.setSpanCount(iClamp);
            internalListView.invalidateItemDecorations();
            anonymousClass7.mSpanSizeLookup = new AnonymousClass2(this, 1);
            AndroidUtilities.updateVisibleRows(this.listView);
            this.columnsAnimation = true;
            this.columnsAnimationProgress = 0.0f;
            int i2 = this.pinchCenterPosition;
            if (i2 >= 0) {
                anonymousClass7.scrollToPositionWithOffset(i2, this.pinchCenterOffset - internalListView.getPaddingTop(), anonymousClass7.mShouldReverseLayout);
            }
        }

        public final void updateFooter() {
            String string;
            int i = 1;
            StoriesController.BotPreviewsList botPreviewsList = this.list;
            int size = botPreviewsList == null ? 0 : botPreviewsList.messageObjects.size();
            StoriesController.BotPreviewsList botPreviewsList2 = this.list;
            boolean z = botPreviewsList2 == null || TextUtils.isEmpty(botPreviewsList2.lang_code);
            int i2 = size > 0 ? 0 : 8;
            FooterView footerView = this.footer;
            footerView.setVisibility(i2);
            String string2 = z ? LocaleController.getString(R.string.ProfileBotPreviewFooterGeneral) : LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, TranslateAlert2.languageName(this.list.lang_code, null, null));
            String string3 = LocaleController.getString(R.string.ProfileBotAddPreview);
            LivePlayer$1$$ExternalSyntheticLambda0 livePlayer$1$$ExternalSyntheticLambda0 = new LivePlayer$1$$ExternalSyntheticLambda0(this, 27);
            if (z || size <= 0) {
                string = LocaleController.getString(z ? R.string.ProfileBotPreviewFooterCreateTranslation : R.string.ProfileBotPreviewFooterDeleteTranslation);
            } else {
                string = null;
            }
            TodoItemMenu$$ExternalSyntheticLambda5 todoItemMenu$$ExternalSyntheticLambda5 = (z || size <= 0) ? new TodoItemMenu$$ExternalSyntheticLambda5(10, this, z) : null;
            footerView.textView.setText(string2);
            BotStarsActivity.AnonymousClass6 anonymousClass6 = footerView.buttonView;
            anonymousClass6.setText(string3, false, true);
            anonymousClass6.setOnClickListener(new TodoItemMenu$$ExternalSyntheticLambda13(livePlayer$1$$ExternalSyntheticLambda0, 21));
            ButtonWithCounterView buttonWithCounterView = footerView.button2View;
            IntroActivity.AnonymousClass4 anonymousClass4 = footerView.orTextView;
            if (string == null) {
                anonymousClass4.setVisibility(8);
                buttonWithCounterView.setVisibility(8);
            } else {
                anonymousClass4.setVisibility(0);
                buttonWithCounterView.setVisibility(0);
                buttonWithCounterView.setText(string, false, true);
                buttonWithCounterView.setOnClickListener(new TodoItemMenu$$ExternalSyntheticLambda13(todoItemMenu$$ExternalSyntheticLambda5, 22));
            }
            SharedMediaLayout.AnonymousClass12 anonymousClass12 = this.this$0;
            ButtonWithCounterView buttonWithCounterView2 = this.emptyViewButton2;
            StickerEmptyView stickerEmptyView = this.emptyView;
            IntroActivity.AnonymousClass4 anonymousClass5 = this.emptyViewOr;
            int i3 = anonymousClass12.currentAccount;
            if (z) {
                stickerEmptyView.title.setVisibility(0);
                stickerEmptyView.title.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
                stickerEmptyView.subtitle.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i3).botPreviewMediasMax, new Object[0]));
                stickerEmptyView.button.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
                anonymousClass5.setVisibility(8);
                buttonWithCounterView2.setVisibility(8);
            } else {
                stickerEmptyView.title.setVisibility(8);
                stickerEmptyView.subtitle.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, TranslateAlert2.languageName(this.list.lang_code, null, null)));
                stickerEmptyView.button.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
                anonymousClass5.setVisibility(0);
                buttonWithCounterView2.setVisibility(0);
                buttonWithCounterView2.setText(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
                buttonWithCounterView2.setOnClickListener(new BotPreviewsEditContainer$BotPreviewsEditLangContainer$$ExternalSyntheticLambda3(this, i));
            }
            stickerEmptyView.button.setVisibility(this.adapter.getItemCount() >= MessagesController.getInstance(i3).botPreviewMediasMax ? 8 : 0);
        }
    }

    public final class ChooseLanguageSheet extends BottomSheetWithRecyclerListView {
        public UniversalAdapter adapter;
        public final int currentAccount;
        public final String title;

        public final class LanguageView extends LinearLayout {
            public boolean needDivider;
            public final TextView subtitle;
            public final TextView title;

            public final class Factory extends UItem.UItemFactory {
                public static final int $r8$clinit = 0;

                static {
                    UItem.UItemFactory.setup(new Factory());
                }

                @Override
                public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                    LanguageView languageView = (LanguageView) view;
                    TranslateController.Language language = (TranslateController.Language) uItem.object;
                    languageView.title.setText(language.displayName);
                    languageView.subtitle.setText(language.ownDisplayName);
                    if (languageView.needDivider != z) {
                        languageView.invalidate();
                    }
                    languageView.needDivider = z;
                    languageView.setWillNotDraw(!z);
                }

                @Override
                public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                    return new LanguageView(context);
                }
            }

            public LanguageView(Context context) {
                super(context);
                setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                setOrientation(1);
                TextView textView = new TextView(context);
                this.title = textView;
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                addView(textView, LayoutHelper.createLinear(-1, -2, 51, 0, 7, 0, 0));
                TextView textView2 = new TextView(context);
                this.subtitle = textView2;
                textView2.setTextSize(1, 13.0f);
                textView2.setTextColor(Theme.getColor(null, Theme.key_dialogTextGray2, false));
                textView2.setGravity(LocaleController.isRTL ? 5 : 3);
                addView(textView2, LayoutHelper.createLinear(-1, -2, 51, 0, 4, 0, 0));
            }

            @Override
            public final void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                if (this.needDivider) {
                    canvas.drawRect(getPaddingLeft(), getHeight() - 1, getWidth(), getHeight(), Theme.dividerPaint);
                }
            }

            @Override
            public final void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
            }
        }

        public ChooseLanguageSheet(BaseFragment baseFragment, String str, VoIPFragment$$ExternalSyntheticLambda7 voIPFragment$$ExternalSyntheticLambda7) {
            super(baseFragment.getParentActivity(), baseFragment, true, false, false, baseFragment.getResourceProvider());
            new FrameLayout(getContext());
            new ImageView(getContext());
            this.currentAccount = baseFragment.getCurrentAccount();
            this.title = str;
            updateTitle$1();
            this.topPadding = 0.6f;
            this.showHandle = true;
            this.handleOffset = true;
            fixNavigationBar();
            setSlidingActionBar();
            RecyclerListView recyclerListView = this.recyclerListView;
            int i = this.backgroundPaddingLeft;
            recyclerListView.setPadding(i, 0, i, 0);
            this.recyclerListView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda0(22, this, voIPFragment$$ExternalSyntheticLambda7));
        }

        @Override
        public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
            UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, false, new LinkManager$$ExternalSyntheticLambda1(this, 25), this.resourcesProvider);
            this.adapter = universalAdapter;
            universalAdapter.applyBackground = false;
            return universalAdapter;
        }

        @Override
        public final CharSequence getTitle() {
            return this.title;
        }
    }

    public BotPreviewsEditContainer(final Context context, BaseFragment baseFragment, long j) {
        super(context);
        this.langLists = new ArrayList();
        this.localLangs = new ArrayList();
        this.shownTabs = null;
        this.visibleHeight = AndroidUtilities.displaySize.y;
        this.setColumnsCount = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.fragment = baseFragment;
        int currentAccount = baseFragment.getCurrentAccount();
        this.currentAccount = currentAccount;
        Theme.ResourcesProvider resourceProvider = baseFragment.getResourceProvider();
        this.resourcesProvider = resourceProvider;
        this.bot_id = j;
        setBackgroundColor(Theme.blendOver(Theme.getColor(Theme.key_windowBackgroundWhite, resourceProvider), Theme.multAlpha(0.04f, Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourceProvider))));
        if (cachedLists == null) {
            cachedLists = new LongSparseArray();
        }
        long j2 = currentAccount;
        LongSparseArray longSparseArray = (LongSparseArray) cachedLists.get(j2);
        if (longSparseArray == null) {
            LongSparseArray longSparseArray2 = cachedLists;
            LongSparseArray longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j2, longSparseArray3);
            longSparseArray = longSparseArray3;
        }
        StoriesController.BotPreviewsList botPreviewsList = (StoriesController.BotPreviewsList) longSparseArray.get(j);
        if (botPreviewsList == null) {
            StoriesController.BotPreviewsList botPreviewsList2 = new StoriesController.BotPreviewsList(currentAccount, j, "", null);
            longSparseArray.put(j, botPreviewsList2);
            botPreviewsList = botPreviewsList2;
        }
        this.mainList = botPreviewsList;
        final SharedMediaLayout.AnonymousClass12 anonymousClass12 = (SharedMediaLayout.AnonymousClass12) this;
        ProfileStoriesCollectionTabs.AnonymousClass1 anonymousClass1 = new ProfileStoriesCollectionTabs.AnonymousClass1(anonymousClass12, context);
        this.viewPager = anonymousClass1;
        anonymousClass1.setAllowDisallowInterceptTouch(true);
        anonymousClass1.setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public final void bindView(View view, int i, int i2) {
                BotPreviewsEditLangContainer botPreviewsEditLangContainer = (BotPreviewsEditLangContainer) view;
                SharedMediaLayout.AnonymousClass12 anonymousClass13 = anonymousClass12;
                StoriesController.BotPreviewsList botPreviewsList3 = i == 0 ? anonymousClass13.mainList : (StoriesController.BotPreviewsList) anonymousClass13.langLists.get(i - 1);
                botPreviewsList3.loadInternal(null);
                botPreviewsEditLangContainer.setList(botPreviewsList3);
                botPreviewsEditLangContainer.setVisibleHeight(anonymousClass13.visibleHeight);
            }

            @Override
            public final View createView(int i) {
                return new BotPreviewsEditLangContainer(anonymousClass12, context);
            }

            @Override
            public final int getItemCount() {
                return anonymousClass12.langLists.size() + 1;
            }

            @Override
            public final int getItemId(int i) {
                if (i == 0) {
                    return 0;
                }
                return ((StoriesController.BotPreviewsList) anonymousClass12.langLists.get(i - 1)).lang_code.hashCode();
            }

            @Override
            public final CharSequence getItemTitle(int i) {
                if (i == 0) {
                    return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
                }
                String strLanguageName = TranslateAlert2.languageName(((StoriesController.BotPreviewsList) anonymousClass12.langLists.get(i - 1)).lang_code, null, null);
                if (strLanguageName == null) {
                    return null;
                }
                return strLanguageName.substring(0, 1).toUpperCase() + strLanguageName.substring(1);
            }
        });
        addView(anonymousClass1, LayoutHelper.createFrame(-1, -1, 119));
        ViewPagerFixed.AnonymousClass3 anonymousClass3CreateTabsView = anonymousClass1.createTabsView(9, true);
        this.tabsView = anonymousClass3CreateTabsView;
        anonymousClass3CreateTabsView.tabMarginDp = 12;
        anonymousClass3CreateTabsView.setPreTabClick(new StoriesViewPager$$ExternalSyntheticLambda0((SharedMediaLayout.AnonymousClass12) this, 21));
        addView(anonymousClass3CreateTabsView, LayoutHelper.createFrame(-1, 42, 48));
        updateLangs(false);
    }

    public final void createStory(final String str) {
        BaseFragment baseFragment = this.fragment;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        final ChatAttachAlert chatAttachAlert = new ChatAttachAlert(baseFragment.getParentActivity(), baseFragment, false, false, false, this.resourcesProvider);
        chatAttachAlert.setMaxSelectedPhotos(1, false);
        chatAttachAlert.storyMediaPicker = true;
        chatAttachAlert.typeButtonsAvailable = false;
        chatAttachAlert.selectedTextView.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
        chatAttachAlert.photoLayout.loadGalleryPhotos();
        int i = Build.VERSION.SDK_INT;
        if (i == 21 || i == 22) {
            AndroidUtilities.hideKeyboard(baseFragment.getFragmentView().findFocus());
        }
        chatAttachAlert.delegate = new ChatAttachAlert.ChatAttachViewDelegate() {
            @Override
            public final void didPressedButton(int i2, boolean z, boolean z2, int i3, int i4, long j, boolean z3, boolean z4, long j2) {
                StoryRecorder.WindowView windowView;
                ChatAttachAlert chatAttachAlert2 = chatAttachAlert;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = chatAttachAlert2.photoLayout;
                if (chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
                    return;
                }
                HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
                chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                if (selectedPhotos.size() != 1) {
                    return;
                }
                Object next = selectedPhotos.values().iterator().next();
                if (next instanceof MediaController.PhotoEntry) {
                    StoryEntry storyEntryFromPhotoEntry = StoryEntry.fromPhotoEntry((MediaController.PhotoEntry) next);
                    BotPreviewsEditContainer botPreviewsEditContainer = BotPreviewsEditContainer.this;
                    storyEntryFromPhotoEntry.botId = botPreviewsEditContainer.bot_id;
                    String str2 = str;
                    storyEntryFromPhotoEntry.botLang = str2;
                    storyEntryFromPhotoEntry.setupMatrix();
                    StoryRecorder storyRecorder = StoryRecorder.getInstance(botPreviewsEditContainer.fragment.getParentActivity(), botPreviewsEditContainer.currentAccount);
                    if (!storyRecorder.isShown) {
                        int i5 = storyRecorder.currentAccount;
                        if (MessagesController.getInstance(i5).isFrozen()) {
                            AccountFrozenAlert.show(i5);
                        } else {
                            long j3 = botPreviewsEditContainer.bot_id;
                            storyRecorder.botId = j3;
                            storyRecorder.botLang = str2;
                            storyRecorder.isReposting = false;
                            storyRecorder.prepareClosing = false;
                            storyRecorder.forceBackgroundVisible = false;
                            WindowManager windowManager = storyRecorder.windowManager;
                            if (windowManager != null && (windowView = storyRecorder.windowView) != null && windowView.getParent() == null) {
                                StoryRecorder.WindowView windowView2 = storyRecorder.windowView;
                                WindowManager.LayoutParams layoutParams = storyRecorder.windowLayoutParams;
                                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, windowView2, layoutParams);
                                windowManager.addView(storyRecorder.windowView, layoutParams);
                                storyRecorder.setupBackDispatcher();
                            }
                            storyRecorder.outputEntry = storyEntryFromPhotoEntry;
                            storyEntryFromPhotoEntry.botId = j3;
                            storyEntryFromPhotoEntry.botLang = str2;
                            storyRecorder.mode = storyEntryFromPhotoEntry.isVideo ? 1 : 0;
                            storyRecorder.videoTextureHolder.active = false;
                            storyRecorder.openType = 0;
                            storyRecorder.fromRect.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            storyRecorder.fromRounding = AndroidUtilities.dp(8.0f);
                            storyRecorder.containerView.updateBackground();
                            ThemePreviewActivity.AnonymousClass14 anonymousClass14 = storyRecorder.previewContainer;
                            int i6 = storyRecorder.openType;
                            anonymousClass14.setBackgroundColor((i6 == 1 || i6 == 0) ? 0 : -14737633);
                            storyRecorder.containerView.setTranslationX(0.0f);
                            storyRecorder.containerView.setTranslationY(0.0f);
                            storyRecorder.containerView.setTranslationY2(0.0f);
                            storyRecorder.containerView.setScaleX(1.0f);
                            storyRecorder.containerView.setScaleY(1.0f);
                            storyRecorder.dismissProgress = 0.0f;
                            AndroidUtilities.lockOrientation(storyRecorder.activity, 1);
                            StoryEntry storyEntry = storyRecorder.outputEntry;
                            if (storyEntry != null) {
                                storyRecorder.captionEdit.setText(storyEntry.caption);
                            }
                            storyRecorder.navigateTo(1, false);
                            storyRecorder.switchToEditMode(-1, false, false);
                            storyRecorder.previewButtons.appear(false, false);
                            storyRecorder.previewButtons.appear(true, true);
                            storyRecorder.animateOpenTo(1.0f, true, new StoryRecorder$$ExternalSyntheticLambda7(storyRecorder, 10));
                            storyRecorder.addNotificationObservers();
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ChatAttachAlert$$ExternalSyntheticLambda7(chatAttachAlert2, 4), 400L);
                }
            }

            @Override
            public final void didSelectBot(TLRPC.User user) {
            }

            @Override
            public final void doOnIdle(ChatAttachAlert$$ExternalSyntheticLambda7 chatAttachAlert$$ExternalSyntheticLambda7) {
                chatAttachAlert$$ExternalSyntheticLambda7.run();
            }

            @Override
            public final boolean needEnterComment() {
                return false;
            }

            @Override
            public final void onCameraOpened() {
            }

            @Override
            public final void onWallpaperSelected(Object obj) {
            }

            @Override
            public final void openAvatarsSearch() {
            }

            @Override
            public final boolean selectItemOnClicking() {
                return true;
            }

            @Override
            public final void sendAudio(ArrayList arrayList, Editable editable, boolean z, int i2, int i3, long j, boolean z2, long j2) {
            }
        };
        chatAttachAlert.init();
        chatAttachAlert.show();
    }

    public final void deleteLang(String str) {
        StoriesController.BotPreviewsList botPreviewsList;
        TLRPC.MessageMedia messageMedia;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mainList.lang_codes.remove(str);
        this.localLangs.remove(str);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.langLists;
            if (i >= arrayList.size()) {
                botPreviewsList = null;
                break;
            }
            botPreviewsList = (StoriesController.BotPreviewsList) arrayList.get(i);
            if (botPreviewsList != null && TextUtils.equals(botPreviewsList.lang_code, str)) {
                break;
            } else {
                i++;
            }
        }
        if (botPreviewsList != null) {
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i2 = this.currentAccount;
            deletepreviewmedia.bot = MessagesController.getInstance(i2).getInputUser(this.bot_id);
            deletepreviewmedia.lang_code = str;
            int i3 = 0;
            while (true) {
                ArrayList arrayList2 = botPreviewsList.messageObjects;
                if (i3 >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryItem storyItem = ((MessageObject) arrayList2.get(i3)).storyItem;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    deletepreviewmedia.media.add(MessagesController.toInputMedia(messageMedia));
                }
                i3++;
            }
            ConnectionsManager.getInstance(i2).sendRequest(deletepreviewmedia, null);
        }
        updateLangs(true);
        this.tabsView.scrollToTab(-1, 0);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = NotificationCenter.storiesListUpdated;
        ProfileStoriesCollectionTabs.AnonymousClass1 anonymousClass1 = this.viewPager;
        int i4 = 0;
        if (i != i3) {
            if (i == NotificationCenter.storiesUpdated) {
                updateLangs(true);
                View[] viewPages = anonymousClass1.getViewPages();
                int length = viewPages.length;
                while (i4 < length) {
                    View view = viewPages[i4];
                    if ((view instanceof BotPreviewsEditLangContainer) && ((BotPreviewsEditLangContainer) view) != null) {
                        ((BotPreviewsEditLangContainer) view).adapter.notifyDataSetChanged();
                    }
                    i4++;
                }
                return;
            }
            return;
        }
        Object obj = objArr[0];
        StoriesController.BotPreviewsList botPreviewsList = this.mainList;
        if (obj == botPreviewsList) {
            updateLangs(true);
            View[] viewPages2 = anonymousClass1.getViewPages();
            int length2 = viewPages2.length;
            while (i4 < length2) {
                View view2 = viewPages2[i4];
                if (view2 instanceof BotPreviewsEditLangContainer) {
                    BotPreviewsEditLangContainer botPreviewsEditLangContainer = (BotPreviewsEditLangContainer) view2;
                    if (botPreviewsEditLangContainer.list == botPreviewsList) {
                        botPreviewsEditLangContainer.adapter.notifyDataSetChanged();
                    }
                }
                i4++;
            }
            return;
        }
        if (this.langLists.indexOf(obj) >= 0) {
            View[] viewPages3 = anonymousClass1.getViewPages();
            for (View view3 : viewPages3) {
                if (view3 instanceof BotPreviewsEditLangContainer) {
                    BotPreviewsEditLangContainer botPreviewsEditLangContainer2 = (BotPreviewsEditLangContainer) view3;
                    if (botPreviewsEditLangContainer2.list == objArr[0]) {
                        botPreviewsEditLangContainer2.adapter.notifyDataSetChanged();
                    }
                }
            }
        }
    }

    public String getBotPreviewsSubtitle() {
        int i;
        int i2;
        TLRPC.MessageMedia messageMedia;
        StringBuilder sb = new StringBuilder();
        View currentView = this.viewPager.getCurrentView();
        if (currentView instanceof BotPreviewsEditLangContainer) {
            StoriesController.BotPreviewsList botPreviewsList = ((BotPreviewsEditLangContainer) currentView).list;
            if (botPreviewsList != null) {
                int i3 = 0;
                i = 0;
                i2 = 0;
                while (true) {
                    ArrayList arrayList = botPreviewsList.messageObjects;
                    if (i3 >= arrayList.size()) {
                        break;
                    }
                    MessageObject messageObject = (MessageObject) arrayList.get(i3);
                    TL_stories.StoryItem storyItem = messageObject.storyItem;
                    if (storyItem != null && (messageMedia = storyItem.media) != null) {
                        if (MessageObject.isVideoDocument(messageMedia.document)) {
                            i2++;
                        } else if (messageObject.storyItem.media.photo != null) {
                            i++;
                        }
                    }
                    i3++;
                }
            } else {
                i = 0;
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return LocaleController.getString(R.string.BotPreviewEmpty);
            }
            if (i > 0) {
                sb.append(LocaleController.formatPluralString("Images", i, new Object[0]));
            }
            if (i2 > 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(LocaleController.formatPluralString("Videos", i2, new Object[0]));
            }
        }
        return sb.toString();
    }

    public String getCurrentLang() {
        View view;
        StoriesController.BotPreviewsList botPreviewsList;
        ProfileStoriesCollectionTabs.AnonymousClass1 anonymousClass1 = this.viewPager;
        View[] viewPages = anonymousClass1.getViewPages();
        if (Math.abs(anonymousClass1.getCurrentPosition() - anonymousClass1.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if (!(view instanceof BotPreviewsEditLangContainer) || (botPreviewsList = ((BotPreviewsEditLangContainer) view).list) == null) {
            return null;
        }
        return botPreviewsList.lang_code;
    }

    public StoriesController.BotPreviewsList getCurrentList() {
        StoriesController.BotPreviewsList botPreviewsList;
        View currentView = this.viewPager.getCurrentView();
        if (!(currentView instanceof BotPreviewsEditLangContainer) || (botPreviewsList = ((BotPreviewsEditLangContainer) currentView).list) == null) {
            return null;
        }
        return botPreviewsList;
    }

    public RecyclerListView getCurrentListView() {
        View currentView = this.viewPager.getCurrentView();
        if (currentView instanceof BotPreviewsEditLangContainer) {
            return ((BotPreviewsEditLangContainer) currentView).listView;
        }
        return null;
    }

    public int getItemsCount() {
        StoriesController.BotPreviewsList botPreviewsList;
        View currentView = this.viewPager.getCurrentView();
        if (!(currentView instanceof BotPreviewsEditLangContainer) || (botPreviewsList = ((BotPreviewsEditLangContainer) currentView).list) == null) {
            return 0;
        }
        return botPreviewsList.messageObjects.size();
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public abstract boolean isSelected(MessageObject messageObject);

    public final boolean isSelectedAll() {
        StoriesController.BotPreviewsList botPreviewsList;
        View currentView = this.viewPager.getCurrentView();
        if (!(currentView instanceof BotPreviewsEditLangContainer) || (botPreviewsList = ((BotPreviewsEditLangContainer) currentView).list) == null) {
            return true;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = botPreviewsList.messageObjects;
            if (i >= arrayList.size()) {
                return true;
            }
            if (!isSelected((MessageObject) arrayList.get(i))) {
                return false;
            }
            i++;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (attachedContainers == null) {
            attachedContainers = new LongSparseArray();
        }
        LongSparseArray longSparseArray = attachedContainers;
        int i = this.currentAccount;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i);
        if (longSparseArray2 == null) {
            LongSparseArray longSparseArray3 = new LongSparseArray();
            attachedContainers.put(i, longSparseArray3);
            longSparseArray2 = longSparseArray3;
        }
        longSparseArray2.put(this.bot_id, this);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.storiesUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (attachedContainers == null) {
            attachedContainers = new LongSparseArray();
        }
        LongSparseArray longSparseArray = attachedContainers;
        int i = this.currentAccount;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.bot_id);
        }
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.storiesUpdated);
    }

    public abstract boolean select(MessageObject messageObject);

    public final void selectAll() {
        StoriesController.BotPreviewsList botPreviewsList;
        View currentView = this.viewPager.getCurrentView();
        if (!(currentView instanceof BotPreviewsEditLangContainer) || (botPreviewsList = ((BotPreviewsEditLangContainer) currentView).list) == null) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = botPreviewsList.messageObjects;
            if (i >= arrayList.size()) {
                return;
            }
            if (!isSelected((MessageObject) arrayList.get(i))) {
                select((MessageObject) arrayList.get(i));
            }
            i++;
        }
    }

    public void setVisibleHeight(int i) {
        this.visibleHeight = i;
        View[] viewPages = this.viewPager.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view instanceof BotPreviewsEditLangContainer) {
                    ((BotPreviewsEditLangContainer) view).setVisibleHeight(i);
                }
            }
        }
    }

    public abstract boolean unselect(MessageObject messageObject);

    public final void unselectAll() {
        StoriesController.BotPreviewsList botPreviewsList;
        View currentView = this.viewPager.getCurrentView();
        if (!(currentView instanceof BotPreviewsEditLangContainer) || (botPreviewsList = ((BotPreviewsEditLangContainer) currentView).list) == null) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = botPreviewsList.messageObjects;
            if (i >= arrayList.size()) {
                return;
            }
            if (isSelected((MessageObject) arrayList.get(i))) {
                unselect((MessageObject) arrayList.get(i));
            }
            i++;
        }
    }

    public final void updateLangs(boolean z) {
        StoriesController.BotPreviewsList botPreviewsList;
        StoryEntry storyEntry;
        int i = 4;
        ArrayList arrayList = new ArrayList(this.mainList.lang_codes);
        ArrayList arrayList2 = this.localLangs;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            String str = (String) obj;
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        androidx.collection.LongSparseArray longSparseArray = MessagesController.getInstance(this.currentAccount).getStoriesController().uploadingStoriesByDialogId;
        long j = this.bot_id;
        ArrayList arrayList3 = (ArrayList) longSparseArray.get(j);
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList3.get(i3);
                i3++;
                StoriesController.UploadingStory uploadingStory = (StoriesController.UploadingStory) obj2;
                if (uploadingStory != null && (storyEntry = uploadingStory.entry) != null && storyEntry.botId == j && !TextUtils.isEmpty(storyEntry.botLang) && !arrayList.contains(storyEntry.botLang)) {
                    arrayList.add(storyEntry.botLang);
                }
            }
        }
        ArrayList arrayList4 = this.langLists;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int size3 = arrayList.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList.get(i4);
            i4++;
            String str2 = (String) obj3;
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList5.size()) {
                    botPreviewsList = null;
                    break;
                } else {
                    if (TextUtils.equals(((StoriesController.BotPreviewsList) arrayList5.get(i5)).lang_code, str2)) {
                        botPreviewsList = (StoriesController.BotPreviewsList) arrayList5.get(i5);
                        break;
                    }
                    i5++;
                }
            }
            if (botPreviewsList == null) {
                StoriesController.BotPreviewsList botPreviewsList2 = new StoriesController.BotPreviewsList(this.currentAccount, this.bot_id, str2, null);
                botPreviewsList2.loadInternal(null);
                botPreviewsList = botPreviewsList2;
            }
            arrayList4.add(botPreviewsList);
        }
        ProfileStoriesCollectionTabs.AnonymousClass1 anonymousClass1 = this.viewPager;
        anonymousClass1.fillTabs$1(true);
        SpannableString spannableString = new SpannableString(NotificationsController$$ExternalSyntheticOutline1.m(new StringBuilder("+ "), R.string.ProfileBotLanguageAdd));
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_filled_plus);
        coloredImageSpan.setScale(0.9f, 0.9f);
        coloredImageSpan.spaceScaleX = 0.85f;
        spannableString.setSpan(coloredImageSpan, 0, 1, 33);
        ViewPagerFixed.AnonymousClass3 anonymousClass3 = this.tabsView;
        anonymousClass3.addTab(-1, spannableString);
        anonymousClass3.adapter.mObservable.notifyChanged();
        boolean z2 = arrayList4.size() + 1 > 1;
        Boolean bool = this.shownTabs;
        if (bool == null || bool.booleanValue() != z2) {
            ValueAnimator valueAnimator = this.tabsAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.shownTabs = Boolean.valueOf(z2);
            if (!z) {
                this.tabsAlpha = z2 ? 1.0f : 0.0f;
                anonymousClass3.setTranslationY(AndroidUtilities.dp(z2 ? 0.0f : -42.0f));
                anonymousClass1.setTranslationY(AndroidUtilities.dp(z2 ? 42.0f : 0.0f));
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.tabsAlpha, z2 ? 1.0f : 0.0f);
            this.tabsAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda4(this, i));
            this.tabsAnimator.addListener(new TodoItemMenu.AnonymousClass15(4, this, z2));
            this.tabsAnimator.setDuration(320L);
            this.tabsAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.tabsAnimator.start();
        }
    }

    public final void updateSelection() {
        View currentView = this.viewPager.getCurrentView();
        if (currentView instanceof BotPreviewsEditLangContainer) {
            BotPreviewsEditLangContainer botPreviewsEditLangContainer = (BotPreviewsEditLangContainer) currentView;
            for (int i = 0; i < botPreviewsEditLangContainer.listView.getChildCount(); i++) {
                View childAt = botPreviewsEditLangContainer.listView.getChildAt(i);
                if (childAt instanceof SharedPhotoVideoCell2) {
                    SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) childAt;
                    sharedPhotoVideoCell2.setChecked(botPreviewsEditLangContainer.this$0.isSelected(sharedPhotoVideoCell2.getMessageObject()), true);
                }
            }
        }
    }
}
