package org.telegram.ui.Stories.bots;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.zzcv;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline1;
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
import org.telegram.ui.ActionBar.BottomSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.SharedPhotoVideoCell;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ExtendedGridLayoutManager;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.Size;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stories.SelfStoryViewsPage$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.StoryViewer$5$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.StoryRecorder$$ExternalSyntheticLambda5;
import org.telegram.ui.TON.TONIntroActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda2;
import org.telegram.ui.bots.BotDownloads$$ExternalSyntheticLambda0;
import org.telegram.ui.bots.BotSensors$1$$ExternalSyntheticLambda0;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda53;
import org.telegram.ui.iv.RichEditor$3$$ExternalSyntheticLambda0;
import org.telegram.ui.iv.RichMediaCell$$ExternalSyntheticLambda1;
import org.telegram.ui.iv.RichTextCell;

public abstract class BotPreviewsEditContainer extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private static LongSparseArray<LongSparseArray<BotPreviewsEditContainer>> attachedContainers;
    private static LongSparseArray<LongSparseArray<StoriesController.BotPreviewsList>> cachedLists;
    private final long bot_id;
    private final int currentAccount;
    private final BaseFragment fragment;
    private final ArrayList<StoriesController.BotPreviewsList> langLists;
    private final ArrayList<String> localLangs;
    private final StoriesController.BotPreviewsList mainList;
    private final Theme.ResourcesProvider resourcesProvider;
    private int setColumnsCount;
    private Boolean shownTabs;
    private float tabsAlpha;
    private ValueAnimator tabsAnimator;
    private final ViewPagerFixed.TabsView tabsView;
    private final ViewPagerFixed viewPager;
    private int visibleHeight;

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
        public final RichTextCell.AnonymousClass1 emptyViewOr;
        public final FooterView footer;
        public boolean isInPinchToZoomTouchMode;
        public final DefaultItemAnimator itemAnimator;
        public final AnonymousClass1 layoutManager;
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
        public final AnonymousClass5 supportingLayoutManager;
        public final SharedMediaLayout.InternalListView supportingListView;

        public final class AnonymousClass2 extends GridLayoutManager.SpanSizeLookup {
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
                    stickerEmptyView.showProgress(botPreviewsList != null && botPreviewsList.loading);
                }
            }
        }

        public final class FooterView extends LinearLayout {
            public final ButtonWithCounterView button2View;
            public final BotStarsActivity.AnonymousClass6 buttonView;
            public final RichTextCell.AnonymousClass1 orTextView;
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
                addView(textView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 19.0f));
                BotStarsActivity.AnonymousClass6 anonymousClass6 = new BotStarsActivity.AnonymousClass6(context, 1, resourcesProvider, true);
                this.buttonView = anonymousClass6;
                anonymousClass6.setMinWidth(AndroidUtilities.dp(200.0f));
                anonymousClass6.setText(LocaleController.getString(R.string.ProfileBotAddPreview), false);
                addView(anonymousClass6, LayoutHelper.createLinear(-2, 44, 17));
                RichTextCell.AnonymousClass1 anonymousClass1 = new RichTextCell.AnonymousClass1(context, resourcesProvider);
                this.orTextView = anonymousClass1;
                anonymousClass1.setTextColor(Theme.getColor(i, resourcesProvider));
                anonymousClass1.setText(LocaleController.getString(R.string.ProfileBotOr));
                anonymousClass1.setTextSize(1, 14.0f);
                anonymousClass1.setTextAlignment(4);
                anonymousClass1.setGravity(17);
                anonymousClass1.setTypeface(AndroidUtilities.bold());
                addView(anonymousClass1, LayoutHelper.createLinear(165, -2, 17, 0, 17, 0, 12));
                ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, false, resourcesProvider);
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
                checkColumns();
            }

            public final boolean canReorder(int i) {
                if (this.storiesList == null) {
                    return false;
                }
                BotPreviewsEditLangContainer botPreviewsEditLangContainer = BotPreviewsEditLangContainer.this;
                TLRPC.User user = MessagesController.getInstance(BotPreviewsEditContainer.this.currentAccount).getUser(Long.valueOf(BotPreviewsEditContainer.this.bot_id));
                return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
            }

            public final void checkColumns() {
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
                    ArrayList arrayList2 = (ArrayList) MessagesController.getInstance(this.storiesList.currentAccount).getStoriesController().uploadingStoriesByDialogId.get(BotPreviewsEditContainer.this.bot_id);
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
                super.notifyDataSetChanged();
                StoriesAdapter storiesAdapter = this.supportingAdapter;
                if (storiesAdapter != null) {
                    storiesAdapter.notifyDataSetChanged();
                }
                if (this != botPreviewsEditLangContainer.supportingAdapter) {
                    checkColumns();
                    botPreviewsEditLangContainer.updateFooter();
                }
            }

            @Override
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                if (this.storiesList == null) {
                    return;
                }
                viewHolder.getItemViewType();
                View view = viewHolder.itemView;
                if (view instanceof SharedPhotoVideoCell2) {
                    SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
                    sharedPhotoVideoCell2.isStory = true;
                    ArrayList arrayList = this.uploadingStories;
                    BotPreviewsEditLangContainer botPreviewsEditLangContainer = BotPreviewsEditLangContainer.this;
                    if (i < 0 || i >= arrayList.size()) {
                        int size = i - arrayList.size();
                        if (size < 0 || size >= this.storiesList.messageObjects.size()) {
                            sharedPhotoVideoCell2.isStoryPinned = false;
                            sharedPhotoVideoCell2.setMessageObject(null, this == this.supportingAdapter ? botPreviewsEditLangContainer.animateToColumnsCount : botPreviewsEditLangContainer.columnsCount);
                            sharedPhotoVideoCell2.isStory = true;
                            return;
                        }
                        MessageObject messageObject = (MessageObject) this.storiesList.messageObjects.get(size);
                        sharedPhotoVideoCell2.isStoryPinned = messageObject != null && this.storiesList.isPinned(messageObject.getId());
                        sharedPhotoVideoCell2.setReorder(true);
                        sharedPhotoVideoCell2.setMessageObject(messageObject, this == this.supportingAdapter ? botPreviewsEditLangContainer.animateToColumnsCount : botPreviewsEditLangContainer.columnsCount);
                        if (!BotPreviewsEditContainer.this.isActionModeShowed() || messageObject == null) {
                            sharedPhotoVideoCell2.setChecked(false, false);
                            return;
                        } else {
                            sharedPhotoVideoCell2.setChecked(BotPreviewsEditContainer.this.isSelected(messageObject), true);
                            return;
                        }
                    }
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
                    sharedPhotoVideoCell2.setMessageObject(uploadingStory.sharedMessageObject, this == this.supportingAdapter ? botPreviewsEditLangContainer.animateToColumnsCount : botPreviewsEditLangContainer.columnsCount);
                    sharedPhotoVideoCell2.isStory = true;
                    sharedPhotoVideoCell2.setReorder(false);
                    sharedPhotoVideoCell2.setChecked(false, false);
                }
            }

            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                SharedPhotoVideoCell2.SharedResources sharedResources = this.sharedResources;
                BotPreviewsEditLangContainer botPreviewsEditLangContainer = BotPreviewsEditLangContainer.this;
                if (sharedResources == null) {
                    this.sharedResources = new SharedPhotoVideoCell2.SharedResources(viewGroup.getContext(), BotPreviewsEditContainer.this.resourcesProvider);
                }
                SharedPhotoVideoCell2 sharedPhotoVideoCell2 = new SharedPhotoVideoCell2(this.context, this.sharedResources, BotPreviewsEditContainer.this.currentAccount);
                sharedPhotoVideoCell2.setCheck2();
                sharedPhotoVideoCell2.setGradientView(null);
                sharedPhotoVideoCell2.isStory = true;
                return new RecyclerListView.Holder(sharedPhotoVideoCell2);
            }

            @Override
            public final void onFastScrollSingleTap() {
            }
        }

        public BotPreviewsEditLangContainer(Context context) {
            super(context);
            this.columnsCount = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
            this.animateToColumnsCount = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
            this.allowStoriesSingleColumn = false;
            this.storiesColumnsCountSet = false;
            this.rect = new Rect();
            ?? r4 = new ExtendedGridLayoutManager(context) {
                public final Size size = new Size();

                @Override
                public final void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
                    super.calculateExtraLayoutSpace(state, iArr);
                    iArr[1] = Math.max(iArr[1], SharedPhotoVideoCell.getItemSize(1) * 2);
                }

                @Override
                public final int getFlowItemCount() {
                    return 0;
                }

                @Override
                public final Size getSizeForItem(int i) {
                    Size size = this.size;
                    size.height = 100.0f;
                    size.width = 100.0f;
                    return size;
                }

                @Override
                public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfoForItem(recycler, state, view, accessibilityNodeInfoCompat);
                    AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfoCompat.mInfo.getCollectionItemInfo();
                    zzcv zzcvVar = collectionItemInfo != null ? new zzcv(collectionItemInfo, 8) : null;
                    if (zzcvVar != null) {
                        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo2 = (AccessibilityNodeInfo.CollectionItemInfo) zzcvVar.zza;
                        if (collectionItemInfo2.isHeading()) {
                            accessibilityNodeInfoCompat.mInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo2.getRowIndex(), collectionItemInfo2.getRowSpan(), collectionItemInfo2.getColumnIndex(), collectionItemInfo2.getColumnSpan(), false));
                        }
                    }
                }

                @Override
                public final boolean supportsPredictiveItemAnimations() {
                    return false;
                }
            };
            this.layoutManager = r4;
            r4.setSpanSizeLookup(new AnonymousClass2(this, 0));
            r4.setSpanCount(this.columnsCount);
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            this.itemAnimator = defaultItemAnimator;
            defaultItemAnimator.setDurations(280L);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setSupportsChangeAnimations(false);
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
                    if (!botPreviewsEditLangContainer.reorder.isIdle() || BotPreviewsEditContainer.this.isActionModeShowed()) {
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
            r6.lambda$onCellEnter$52(null);
            r6.setClipToPadding(false);
            r6.setSectionsType(2);
            r6.setLayoutManager(r4);
            addView((View) r6, LayoutHelper.createFrame(-1, -1.0f));
            r6.addItemDecoration(new RecyclerView.ItemDecoration() {
                @Override
                public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    if (!(view instanceof SharedPhotoVideoCell2)) {
                        rect.left = 0;
                        rect.top = 0;
                        rect.bottom = 0;
                        rect.right = 0;
                        return;
                    }
                    SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
                    BotPreviewsEditLangContainer botPreviewsEditLangContainer = BotPreviewsEditLangContainer.this;
                    int childAdapterPosition = botPreviewsEditLangContainer.listView.getChildAdapterPosition(sharedPhotoVideoCell2);
                    int spanCount = botPreviewsEditLangContainer.layoutManager.getSpanCount();
                    sharedPhotoVideoCell2.isTop = childAdapterPosition < spanCount;
                    int i = childAdapterPosition % spanCount;
                    sharedPhotoVideoCell2.isFirst = i == 0;
                    sharedPhotoVideoCell2.isLast = i == spanCount - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                }
            });
            r6.setOnItemClickListener(new TONIntroActivity$$ExternalSyntheticLambda3(this, 15));
            r6.setOnItemLongClickListener(new RichEditor$3$$ExternalSyntheticLambda0(this, 3));
            SharedMediaLayout.InternalListView internalListView = new SharedMediaLayout.InternalListView(context);
            this.supportingListView = internalListView;
            ?? r10 = new GridLayoutManager() {
                @Override
                public final int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
                    if (BotPreviewsEditLangContainer.this.columnsAnimation) {
                        i = 0;
                    }
                    return super.scrollVerticallyBy(i, recycler, state);
                }

                @Override
                public final boolean supportsPredictiveItemAnimations() {
                    return false;
                }
            };
            this.supportingLayoutManager = r10;
            internalListView.setLayoutManager(r10);
            internalListView.addItemDecoration(new RecyclerView.ItemDecoration() {
                @Override
                public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    if (!(view instanceof SharedPhotoVideoCell2)) {
                        rect.left = 0;
                        rect.top = 0;
                        rect.bottom = 0;
                        rect.right = 0;
                        return;
                    }
                    SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
                    BotPreviewsEditLangContainer botPreviewsEditLangContainer = BotPreviewsEditLangContainer.this;
                    int childAdapterPosition = botPreviewsEditLangContainer.supportingListView.getChildAdapterPosition(sharedPhotoVideoCell2);
                    int spanCount = botPreviewsEditLangContainer.supportingLayoutManager.getSpanCount();
                    sharedPhotoVideoCell2.isTop = childAdapterPosition < spanCount;
                    int i = childAdapterPosition % spanCount;
                    sharedPhotoVideoCell2.isFirst = i == 0;
                    sharedPhotoVideoCell2.isLast = i == spanCount - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                }
            });
            r10.setSpanCount(this.animateToColumnsCount);
            internalListView.setVisibility(8);
            addView(internalListView, LayoutHelper.createFrame(-1, -1.0f));
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(context);
            this.adapter = anonymousClass7;
            r6.setAdapter(anonymousClass7);
            StoriesAdapter storiesAdapter = new StoriesAdapter(getContext());
            anonymousClass7.supportingAdapter = storiesAdapter;
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
                    paint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, BotPreviewsEditContainer.this.resourcesProvider));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
                    super.onDraw(canvas);
                }
            };
            this.progressView = r9;
            r9.showDate(false);
            StickerEmptyView stickerEmptyView = new StickerEmptyView(context, r9, 1);
            this.emptyView = stickerEmptyView;
            stickerEmptyView.setVisibility(8);
            stickerEmptyView.setAnimateLayoutChange(true);
            addView(stickerEmptyView, LayoutHelper.createFrame(-1, -1.0f));
            stickerEmptyView.setOnTouchListener(new BottomSheet$$ExternalSyntheticLambda6(3));
            stickerEmptyView.showProgress(true, false);
            stickerEmptyView.stickerView.setVisibility(8);
            stickerEmptyView.title.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            stickerEmptyView.subtitle.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(BotPreviewsEditContainer.this.currentAccount).botPreviewMediasMax, new Object[0]));
            stickerEmptyView.button.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false);
            stickerEmptyView.button.setVisibility(0);
            stickerEmptyView.button.setOnClickListener(new BotPreviewsEditContainer$BotPreviewsEditLangContainer$$ExternalSyntheticLambda3(this, 0));
            RichTextCell.AnonymousClass1 anonymousClass1 = new RichTextCell.AnonymousClass1(this, context);
            this.emptyViewOr = anonymousClass1;
            anonymousClass1.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, BotPreviewsEditContainer.this.resourcesProvider));
            anonymousClass1.setText(LocaleController.getString(R.string.ProfileBotOr));
            anonymousClass1.setTextSize(1, 14.0f);
            anonymousClass1.setTextAlignment(4);
            anonymousClass1.setGravity(17);
            anonymousClass1.setTypeface(AndroidUtilities.bold());
            stickerEmptyView.linearLayout.addView(anonymousClass1, LayoutHelper.createLinear(165, -2, 17, 0, 17, 0, 12));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, false, BotPreviewsEditContainer.this.resourcesProvider);
            this.emptyViewButton2 = buttonWithCounterView;
            buttonWithCounterView.setMinWidth(AndroidUtilities.dp(200.0f));
            stickerEmptyView.linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-2, 44, 17));
            stickerEmptyView.addView((View) r9, 0, LayoutHelper.createFrame(-1, -1.0f));
            r6.setEmptyView(stickerEmptyView);
            r6.setAnimateEmptyView(true, 0);
            new RecyclerAnimationScrollHelper(r6, r4);
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ItemTouchHelper.Callback() {
                @Override
                public final void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                    super.clearView(recyclerView, viewHolder);
                    viewHolder.itemView.setPressed(false);
                }

                @Override
                public final int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                    BotPreviewsEditLangContainer botPreviewsEditLangContainer = BotPreviewsEditLangContainer.this;
                    if (!BotPreviewsEditContainer.this.isActionModeShowed() || !botPreviewsEditLangContainer.adapter.canReorder(viewHolder.getAdapterPosition())) {
                        return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
                    }
                    botPreviewsEditLangContainer.listView.lambda$onCellEnter$52(botPreviewsEditLangContainer.itemAnimator);
                    return ItemTouchHelper.Callback.makeMovementFlags(15, 0);
                }

                @Override
                public final boolean isLongPressDragEnabled() {
                    return BotPreviewsEditContainer.this.isActionModeShowed();
                }

                @Override
                public final boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                    ArrayList arrayList;
                    BotPreviewsEditLangContainer botPreviewsEditLangContainer = BotPreviewsEditLangContainer.this;
                    if (botPreviewsEditLangContainer.adapter.canReorder(viewHolder.getAdapterPosition())) {
                        int adapterPosition = viewHolder2.getAdapterPosition();
                        AnonymousClass7 anonymousClass8 = botPreviewsEditLangContainer.adapter;
                        if (anonymousClass8.canReorder(adapterPosition)) {
                            int adapterPosition2 = viewHolder.getAdapterPosition();
                            int adapterPosition3 = viewHolder2.getAdapterPosition();
                            StoriesController.BotPreviewsList botPreviewsList = anonymousClass8.storiesList;
                            if (botPreviewsList != null && adapterPosition2 >= 0 && adapterPosition2 < botPreviewsList.messageObjects.size() && adapterPosition3 >= 0 && adapterPosition3 < anonymousClass8.storiesList.messageObjects.size()) {
                                if (anonymousClass8.storiesList != null) {
                                    arrayList = new ArrayList();
                                    for (int i = 0; i < anonymousClass8.storiesList.messageObjects.size(); i++) {
                                        arrayList.add(Integer.valueOf(((MessageObject) anonymousClass8.storiesList.messageObjects.get(i)).getId()));
                                    }
                                } else {
                                    arrayList = new ArrayList(anonymousClass8.storiesList.pinnedIds);
                                }
                                if (!anonymousClass8.applyingReorder) {
                                    ArrayList arrayList2 = anonymousClass8.lastPinnedIds;
                                    arrayList2.clear();
                                    arrayList2.addAll(arrayList);
                                    anonymousClass8.applyingReorder = true;
                                }
                                MessageObject messageObject = (MessageObject) anonymousClass8.storiesList.messageObjects.get(adapterPosition2);
                                arrayList.remove(Integer.valueOf(messageObject.getId()));
                                arrayList.add(Utilities.clamp(adapterPosition3, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
                                anonymousClass8.storiesList.updatePinnedOrder(arrayList, false);
                                anonymousClass8.notifyItemMoved(adapterPosition2, adapterPosition3);
                            }
                            return true;
                        }
                    }
                    return false;
                }

                @Override
                public final void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
                    BotPreviewsEditLangContainer botPreviewsEditLangContainer = BotPreviewsEditLangContainer.this;
                    if (viewHolder != null) {
                        botPreviewsEditLangContainer.listView.hideSelector(false);
                    }
                    if (i == 0) {
                        AnonymousClass7 anonymousClass8 = botPreviewsEditLangContainer.adapter;
                        if (anonymousClass8.storiesList != null && anonymousClass8.applyingReorder) {
                            ArrayList arrayList = new ArrayList();
                            for (int i2 = 0; i2 < anonymousClass8.storiesList.messageObjects.size(); i2++) {
                                arrayList.add(Integer.valueOf(((MessageObject) anonymousClass8.storiesList.messageObjects.get(i2)).getId()));
                            }
                            ArrayList arrayList2 = anonymousClass8.lastPinnedIds;
                            boolean z = arrayList2.size() != arrayList.size();
                            if (!z) {
                                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                                    if (arrayList2.get(i3) != arrayList.get(i3)) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                            if (z) {
                                anonymousClass8.storiesList.updatePinnedOrder(arrayList, true);
                            }
                            anonymousClass8.applyingReorder = false;
                        }
                        botPreviewsEditLangContainer.listView.lambda$onCellEnter$52(null);
                    } else {
                        botPreviewsEditLangContainer.listView.cancelClickRunnables(false);
                        if (viewHolder != null) {
                            viewHolder.itemView.setPressed(true);
                        }
                    }
                    super.onSelectedChanged(viewHolder, i);
                }

                @Override
                public final void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
                }
            });
            this.reorder = itemTouchHelper;
            itemTouchHelper.attachToRecyclerView(r6);
            FooterView footerView = new FooterView(context, BotPreviewsEditContainer.this.resourcesProvider);
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
                    final boolean z = f > 0.2f;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            BotPreviewsEditLangContainer botPreviewsEditLangContainer = BotPreviewsEditLangContainer.this;
                            botPreviewsEditLangContainer.columnsAnimationProgress = fFloatValue;
                            botPreviewsEditLangContainer.listView.invalidate();
                        }
                    });
                    valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public final void onAnimationEnd(Animator animator) {
                            View viewFindViewByPosition;
                            BotPreviewsEditLangContainer botPreviewsEditLangContainer = BotPreviewsEditLangContainer.this;
                            botPreviewsEditLangContainer.columnsAnimation = false;
                            boolean z2 = z;
                            if (z2) {
                                int i = botPreviewsEditLangContainer.animateToColumnsCount;
                                botPreviewsEditLangContainer.columnsCount = i;
                                BotPreviewsEditContainer.this.setColumnsCount = i;
                                SharedConfig.setStoriesColumnsCount(botPreviewsEditLangContainer.animateToColumnsCount);
                            }
                            int itemCount = botPreviewsEditLangContainer.adapter.getItemCount();
                            if (z2) {
                                botPreviewsEditLangContainer.layoutManager.setSpanCount(botPreviewsEditLangContainer.columnsCount);
                                botPreviewsEditLangContainer.listView.invalidateItemDecorations();
                                if (botPreviewsEditLangContainer.adapter.getItemCount() == itemCount) {
                                    AndroidUtilities.updateVisibleRows(botPreviewsEditLangContainer.listView);
                                } else {
                                    botPreviewsEditLangContainer.adapter.notifyDataSetChanged();
                                }
                            }
                            botPreviewsEditLangContainer.supportingListView.setVisibility(8);
                            int i2 = botPreviewsEditLangContainer.pinchCenterPosition;
                            if (i2 >= 0) {
                                if (z2 && (viewFindViewByPosition = botPreviewsEditLangContainer.supportingLayoutManager.findViewByPosition(i2)) != null) {
                                    botPreviewsEditLangContainer.pinchCenterOffset = viewFindViewByPosition.getTop();
                                }
                                botPreviewsEditLangContainer.layoutManager.scrollToPositionWithOffset(botPreviewsEditLangContainer.pinchCenterPosition, (-botPreviewsEditLangContainer.listView.getPaddingTop()) + botPreviewsEditLangContainer.pinchCenterOffset);
                            }
                            super.onAnimationEnd(animator);
                        }
                    });
                    valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    valueAnimatorOfFloat.setDuration(200L);
                    valueAnimatorOfFloat.start();
                    return;
                }
                this.columnsAnimation = false;
                int i = this.animateToColumnsCount;
                this.columnsCount = i;
                BotPreviewsEditContainer.this.setColumnsCount = i;
                SharedConfig.setStoriesColumnsCount(this.animateToColumnsCount);
                AnonymousClass7 anonymousClass7 = this.adapter;
                int itemCount = anonymousClass7.getItemCount();
                internalListView.setVisibility(8);
                int i2 = this.columnsCount;
                AnonymousClass1 anonymousClass1 = this.layoutManager;
                anonymousClass1.setSpanCount(i2);
                anonymousClass3.invalidateItemDecorations();
                anonymousClass3.invalidate();
                if (anonymousClass7.getItemCount() == itemCount) {
                    AndroidUtilities.updateVisibleRows(anonymousClass3);
                } else {
                    anonymousClass7.notifyDataSetChanged();
                }
                int i3 = this.pinchCenterPosition;
                if (i3 >= 0) {
                    View viewFindViewByPosition = findViewByPosition(i3);
                    if (viewFindViewByPosition != null) {
                        this.pinchCenterOffset = viewFindViewByPosition.getTop();
                    }
                    anonymousClass1.scrollToPositionWithOffset(this.pinchCenterPosition, (-anonymousClass3.getPaddingTop()) + this.pinchCenterOffset);
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
                this.columnsCount = BotPreviewsEditContainer.this.setColumnsCount;
            }
            this.list = botPreviewsList;
            AnonymousClass7 anonymousClass7 = this.adapter;
            anonymousClass7.storiesList = botPreviewsList;
            if (anonymousClass7 != BotPreviewsEditLangContainer.this.supportingAdapter) {
                anonymousClass7.checkColumns();
            }
            anonymousClass7.notifyDataSetChanged();
            StoriesAdapter storiesAdapter = this.supportingAdapter;
            storiesAdapter.storiesList = botPreviewsList;
            if (storiesAdapter != BotPreviewsEditLangContainer.this.supportingAdapter) {
                storiesAdapter.checkColumns();
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
            if (this.columnsAnimation || BotPreviewsEditContainer.this.isActionModeShowed()) {
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
            AnonymousClass5 anonymousClass5 = this.supportingLayoutManager;
            anonymousClass5.setSpanCount(iClamp);
            internalListView.invalidateItemDecorations();
            anonymousClass5.setSpanSizeLookup(new AnonymousClass2(this, 1));
            AndroidUtilities.updateVisibleRows(this.listView);
            this.columnsAnimation = true;
            this.columnsAnimationProgress = 0.0f;
            int i2 = this.pinchCenterPosition;
            if (i2 >= 0) {
                anonymousClass5.scrollToPositionWithOffset(i2, this.pinchCenterOffset - internalListView.getPaddingTop());
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
            String string2 = z ? LocaleController.getString(R.string.ProfileBotPreviewFooterGeneral) : LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, TranslateAlert2.languageName(this.list.lang_code));
            String string3 = LocaleController.getString(R.string.ProfileBotAddPreview);
            BotSensors$1$$ExternalSyntheticLambda0 botSensors$1$$ExternalSyntheticLambda0 = new BotSensors$1$$ExternalSyntheticLambda0(this, 15);
            if (z || size <= 0) {
                string = LocaleController.getString(z ? R.string.ProfileBotPreviewFooterCreateTranslation : R.string.ProfileBotPreviewFooterDeleteTranslation);
            } else {
                string = null;
            }
            FileLoader$$ExternalSyntheticLambda1 fileLoader$$ExternalSyntheticLambda1 = (z || size <= 0) ? new FileLoader$$ExternalSyntheticLambda1(this, z, 16) : null;
            footerView.textView.setText(string2);
            BotStarsActivity.AnonymousClass6 anonymousClass6 = footerView.buttonView;
            anonymousClass6.setText(string3, false);
            anonymousClass6.setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(botSensors$1$$ExternalSyntheticLambda0, 19));
            ButtonWithCounterView buttonWithCounterView = footerView.button2View;
            RichTextCell.AnonymousClass1 anonymousClass1 = footerView.orTextView;
            if (string == null) {
                anonymousClass1.setVisibility(8);
                buttonWithCounterView.setVisibility(8);
            } else {
                anonymousClass1.setVisibility(0);
                buttonWithCounterView.setVisibility(0);
                buttonWithCounterView.setText(string, false);
                buttonWithCounterView.setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(fileLoader$$ExternalSyntheticLambda1, 20));
            }
            BotPreviewsEditContainer botPreviewsEditContainer = BotPreviewsEditContainer.this;
            ButtonWithCounterView buttonWithCounterView2 = this.emptyViewButton2;
            StickerEmptyView stickerEmptyView = this.emptyView;
            RichTextCell.AnonymousClass1 anonymousClass2 = this.emptyViewOr;
            if (z) {
                stickerEmptyView.title.setVisibility(0);
                stickerEmptyView.title.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
                stickerEmptyView.subtitle.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(botPreviewsEditContainer.currentAccount).botPreviewMediasMax, new Object[0]));
                stickerEmptyView.button.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false);
                anonymousClass2.setVisibility(8);
                buttonWithCounterView2.setVisibility(8);
            } else {
                stickerEmptyView.title.setVisibility(8);
                stickerEmptyView.subtitle.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, TranslateAlert2.languageName(this.list.lang_code)));
                stickerEmptyView.button.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false);
                anonymousClass2.setVisibility(0);
                buttonWithCounterView2.setVisibility(0);
                buttonWithCounterView2.setText(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false);
                buttonWithCounterView2.setOnClickListener(new BotPreviewsEditContainer$BotPreviewsEditLangContainer$$ExternalSyntheticLambda3(this, i));
            }
            stickerEmptyView.button.setVisibility(this.adapter.getItemCount() >= MessagesController.getInstance(botPreviewsEditContainer.currentAccount).botPreviewMediasMax ? 8 : 0);
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

        public ChooseLanguageSheet(BaseFragment baseFragment, String str, RichEditor$$ExternalSyntheticLambda53 richEditor$$ExternalSyntheticLambda53) {
            super(baseFragment, true, false, false, baseFragment.getResourceProvider());
            new FrameLayout(getContext());
            new ImageView(getContext());
            this.currentAccount = baseFragment.getCurrentAccount();
            this.title = str;
            updateTitle();
            this.topPadding = 0.6f;
            setShowHandle(true);
            this.handleOffset = true;
            fixNavigationBar();
            setSlidingActionBar();
            RecyclerListView recyclerListView = this.recyclerListView;
            int i = this.backgroundPaddingLeft;
            recyclerListView.setPadding(i, 0, i, 0);
            this.recyclerListView.setOnItemClickListener(new SelfStoryViewsPage$$ExternalSyntheticLambda0(3, this, richEditor$$ExternalSyntheticLambda53));
        }

        @Override
        public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
            UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, new BotDownloads$$ExternalSyntheticLambda0(this, 5), this.resourcesProvider);
            this.adapter = universalAdapter;
            universalAdapter.setApplyBackground(false);
            return this.adapter;
        }

        @Override
        public final CharSequence getTitle() {
            return this.title;
        }
    }

    public BotPreviewsEditContainer(final Context context, BaseFragment baseFragment, long j) {
        super(context);
        this.langLists = new ArrayList<>();
        this.localLangs = new ArrayList<>();
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
            cachedLists = new LongSparseArray<>();
        }
        long j2 = currentAccount;
        LongSparseArray<StoriesController.BotPreviewsList> longSparseArray = cachedLists.get(j2);
        if (longSparseArray == null) {
            LongSparseArray<LongSparseArray<StoriesController.BotPreviewsList>> longSparseArray2 = cachedLists;
            LongSparseArray<StoriesController.BotPreviewsList> longSparseArray3 = new LongSparseArray<>();
            longSparseArray2.put(j2, longSparseArray3);
            longSparseArray = longSparseArray3;
        }
        StoriesController.BotPreviewsList botPreviewsList = longSparseArray.get(j);
        if (botPreviewsList == null) {
            StoriesController.BotPreviewsList botPreviewsList2 = new StoriesController.BotPreviewsList(currentAccount, j, "", null);
            longSparseArray.put(j, botPreviewsList2);
            botPreviewsList = botPreviewsList2;
        }
        this.mainList = botPreviewsList;
        ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context) {
            public String lastLang;

            @Override
            public final boolean canScroll(MotionEvent motionEvent) {
                if (BotPreviewsEditContainer.this.isActionModeShowed()) {
                    return false;
                }
                return super.canScroll(motionEvent);
            }

            @Override
            public final void onTabAnimationUpdate(boolean z) {
                BotPreviewsEditContainer botPreviewsEditContainer = BotPreviewsEditContainer.this;
                String currentLang = botPreviewsEditContainer.getCurrentLang();
                if (TextUtils.equals(this.lastLang, currentLang)) {
                    return;
                }
                this.lastLang = currentLang;
                botPreviewsEditContainer.onSelectedTabChanged();
            }

            @Override
            public final void onTabPageSelected(int i) {
                BotPreviewsEditContainer botPreviewsEditContainer = BotPreviewsEditContainer.this;
                String currentLang = botPreviewsEditContainer.getCurrentLang();
                if (TextUtils.equals(this.lastLang, currentLang)) {
                    return;
                }
                this.lastLang = currentLang;
                botPreviewsEditContainer.onSelectedTabChanged();
            }

            @Override
            public final void onTabScrollEnd(int i) {
                super.onTabScrollEnd(i);
                BotPreviewsEditContainer botPreviewsEditContainer = BotPreviewsEditContainer.this;
                String currentLang = botPreviewsEditContainer.getCurrentLang();
                if (TextUtils.equals(this.lastLang, currentLang)) {
                    return;
                }
                this.lastLang = currentLang;
                botPreviewsEditContainer.onSelectedTabChanged();
            }
        };
        this.viewPager = viewPagerFixed;
        viewPagerFixed.setAllowDisallowInterceptTouch(true);
        viewPagerFixed.setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public final void bindView(View view, int i, int i2) {
                BotPreviewsEditLangContainer botPreviewsEditLangContainer = (BotPreviewsEditLangContainer) view;
                BotPreviewsEditContainer botPreviewsEditContainer = BotPreviewsEditContainer.this;
                StoriesController.BotPreviewsList botPreviewsList3 = i == 0 ? botPreviewsEditContainer.mainList : (StoriesController.BotPreviewsList) botPreviewsEditContainer.langLists.get(i - 1);
                botPreviewsList3.loadInternal(null);
                botPreviewsEditLangContainer.setList(botPreviewsList3);
                botPreviewsEditLangContainer.setVisibleHeight(botPreviewsEditContainer.visibleHeight);
            }

            @Override
            public final View createView(int i) {
                return BotPreviewsEditContainer.this.new BotPreviewsEditLangContainer(context);
            }

            @Override
            public final int getItemCount() {
                return BotPreviewsEditContainer.this.langLists.size() + 1;
            }

            @Override
            public final int getItemId(int i) {
                if (i == 0) {
                    return 0;
                }
                return ((StoriesController.BotPreviewsList) BotPreviewsEditContainer.this.langLists.get(i - 1)).lang_code.hashCode();
            }

            @Override
            public final CharSequence getItemTitle(int i) {
                return i == 0 ? LocaleController.getString(R.string.ProfileBotLanguageGeneral) : TranslateAlert2.languageNameCapital(((StoriesController.BotPreviewsList) BotPreviewsEditContainer.this.langLists.get(i - 1)).lang_code);
            }
        });
        addView(viewPagerFixed, LayoutHelper.createFrame(-1, -1, 119));
        ViewPagerFixed.TabsView tabsViewCreateTabsView = viewPagerFixed.createTabsView(true, 9);
        this.tabsView = tabsViewCreateTabsView;
        tabsViewCreateTabsView.tabMarginDp = 12;
        tabsViewCreateTabsView.setPreTabClick(new RichEditor$3$$ExternalSyntheticLambda0(this, 2));
        addView(tabsViewCreateTabsView, LayoutHelper.createFrame(-1, 42, 48));
        updateLangs(false);
    }

    public static void edit(int i, long j, String str, TLRPC.InputMedia inputMedia, TL_bots.botPreviewMedia botpreviewmedia) {
        LongSparseArray<BotPreviewsEditContainer> longSparseArray;
        BotPreviewsEditContainer botPreviewsEditContainer;
        LongSparseArray<StoriesController.BotPreviewsList> longSparseArray2;
        LongSparseArray<LongSparseArray<StoriesController.BotPreviewsList>> longSparseArray3 = cachedLists;
        if (longSparseArray3 != null && (longSparseArray2 = longSparseArray3.get(i)) != null) {
            StoriesController.BotPreviewsList botPreviewsList = longSparseArray2.get(j);
            if (botPreviewsList.currentAccount == i) {
                if (TextUtils.equals(botPreviewsList.lang_code, str)) {
                    botPreviewsList.edit(inputMedia, botpreviewmedia);
                } else if (!TextUtils.isEmpty(str)) {
                    ArrayList arrayList = botPreviewsList.lang_codes;
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                        StoriesController$StoriesList$$ExternalSyntheticLambda1 storiesController$StoriesList$$ExternalSyntheticLambda1 = botPreviewsList.notify;
                        AndroidUtilities.cancelRunOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda1);
                        AndroidUtilities.runOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda1);
                    }
                }
            }
        }
        LongSparseArray<LongSparseArray<BotPreviewsEditContainer>> longSparseArray4 = attachedContainers;
        if (longSparseArray4 == null || (longSparseArray = longSparseArray4.get(i)) == null || (botPreviewsEditContainer = longSparseArray.get(j)) == null) {
            return;
        }
        for (int i2 = 0; i2 < botPreviewsEditContainer.langLists.size(); i2++) {
            StoriesController.BotPreviewsList botPreviewsList2 = botPreviewsEditContainer.langLists.get(i2);
            if (botPreviewsList2.currentAccount == i && TextUtils.equals(botPreviewsList2.lang_code, str)) {
                botPreviewsList2.edit(inputMedia, botpreviewmedia);
            }
        }
    }

    public static void push(int i, long j, String str, TL_bots.botPreviewMedia botpreviewmedia) {
        LongSparseArray<BotPreviewsEditContainer> longSparseArray;
        BotPreviewsEditContainer botPreviewsEditContainer;
        LongSparseArray<StoriesController.BotPreviewsList> longSparseArray2;
        LongSparseArray<LongSparseArray<StoriesController.BotPreviewsList>> longSparseArray3 = cachedLists;
        if (longSparseArray3 != null && (longSparseArray2 = longSparseArray3.get(i)) != null) {
            StoriesController.BotPreviewsList botPreviewsList = longSparseArray2.get(j);
            if (botPreviewsList.currentAccount == i) {
                if (TextUtils.equals(botPreviewsList.lang_code, str)) {
                    botPreviewsList.push(botpreviewmedia);
                } else if (!TextUtils.isEmpty(str)) {
                    ArrayList arrayList = botPreviewsList.lang_codes;
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                        StoriesController$StoriesList$$ExternalSyntheticLambda1 storiesController$StoriesList$$ExternalSyntheticLambda1 = botPreviewsList.notify;
                        AndroidUtilities.cancelRunOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda1);
                        AndroidUtilities.runOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda1);
                    }
                }
            }
        }
        LongSparseArray<LongSparseArray<BotPreviewsEditContainer>> longSparseArray4 = attachedContainers;
        if (longSparseArray4 == null || (longSparseArray = longSparseArray4.get(i)) == null || (botPreviewsEditContainer = longSparseArray.get(j)) == null) {
            return;
        }
        for (int i2 = 0; i2 < botPreviewsEditContainer.langLists.size(); i2++) {
            StoriesController.BotPreviewsList botPreviewsList2 = botPreviewsEditContainer.langLists.get(i2);
            if (botPreviewsList2.currentAccount == i && TextUtils.equals(botPreviewsList2.lang_code, str)) {
                botPreviewsList2.push(botpreviewmedia);
            }
        }
    }

    public void addTranslation() {
        new ChooseLanguageSheet(this.fragment, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new RichEditor$$ExternalSyntheticLambda53(this, 7)).show();
    }

    public boolean canScroll(boolean z) {
        if (z) {
            return this.viewPager.getCurrentPosition() == this.langLists.size();
        }
        return this.viewPager.getCurrentPosition() == 0;
    }

    public boolean checkPinchToZoom(MotionEvent motionEvent) {
        View currentView = this.viewPager.getCurrentView();
        if (currentView instanceof BotPreviewsEditLangContainer) {
            BotPreviewsEditLangContainer botPreviewsEditLangContainer = (BotPreviewsEditLangContainer) currentView;
            if (botPreviewsEditLangContainer.list != null && botPreviewsEditLangContainer.getParent() != null) {
                if (botPreviewsEditLangContainer.columnsAnimation && !botPreviewsEditLangContainer.isInPinchToZoomTouchMode) {
                    return true;
                }
                int actionMasked = motionEvent.getActionMasked();
                BotPreviewsEditLangContainer.AnonymousClass3 anonymousClass3 = botPreviewsEditLangContainer.listView;
                if (actionMasked == 0 || motionEvent.getActionMasked() == 5) {
                    if (botPreviewsEditLangContainer.maybePinchToZoomTouchMode && !botPreviewsEditLangContainer.isInPinchToZoomTouchMode && motionEvent.getPointerCount() == 2) {
                        botPreviewsEditLangContainer.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        botPreviewsEditLangContainer.pinchScale = 1.0f;
                        botPreviewsEditLangContainer.pointerId1 = motionEvent.getPointerId(0);
                        botPreviewsEditLangContainer.pointerId2 = motionEvent.getPointerId(1);
                        anonymousClass3.cancelClickRunnables(false);
                        anonymousClass3.cancelLongPress();
                        anonymousClass3.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view = (View) botPreviewsEditLangContainer.getParent();
                        botPreviewsEditLangContainer.pinchCenterX = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - botPreviewsEditLangContainer.getX());
                        int y = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - botPreviewsEditLangContainer.getY());
                        int i = botPreviewsEditLangContainer.pinchCenterX;
                        botPreviewsEditLangContainer.pinchCenterPosition = -1;
                        int i2 = y + anonymousClass3.blurTopPadding;
                        for (int i3 = 0; i3 < anonymousClass3.getChildCount(); i3++) {
                            View childAt = anonymousClass3.getChildAt(i3);
                            Rect rect = botPreviewsEditLangContainer.rect;
                            childAt.getHitRect(rect);
                            if (rect.contains(i, i2)) {
                                botPreviewsEditLangContainer.pinchCenterPosition = anonymousClass3.getChildLayoutPosition(childAt);
                                botPreviewsEditLangContainer.pinchCenterOffset = childAt.getTop();
                            }
                        }
                        botPreviewsEditLangContainer.maybePinchToZoomTouchMode2 = true;
                    }
                    if (motionEvent.getActionMasked() == 0) {
                        if ((motionEvent.getY() - ((View) botPreviewsEditLangContainer.getParent()).getY()) - botPreviewsEditLangContainer.getY() > 0.0f) {
                            botPreviewsEditLangContainer.maybePinchToZoomTouchMode = true;
                        }
                    }
                } else if (motionEvent.getActionMasked() == 2 && (botPreviewsEditLangContainer.isInPinchToZoomTouchMode || botPreviewsEditLangContainer.maybePinchToZoomTouchMode2)) {
                    int i4 = -1;
                    int i5 = -1;
                    for (int i6 = 0; i6 < motionEvent.getPointerCount(); i6++) {
                        if (botPreviewsEditLangContainer.pointerId1 == motionEvent.getPointerId(i6)) {
                            i4 = i6;
                        }
                        if (botPreviewsEditLangContainer.pointerId2 == motionEvent.getPointerId(i6)) {
                            i5 = i6;
                        }
                    }
                    if (i4 == -1 || i5 == -1) {
                        botPreviewsEditLangContainer.maybePinchToZoomTouchMode = false;
                        botPreviewsEditLangContainer.maybePinchToZoomTouchMode2 = false;
                        botPreviewsEditLangContainer.isInPinchToZoomTouchMode = false;
                        botPreviewsEditLangContainer.finishPinchToMediaColumnsCount();
                        return false;
                    }
                    float fHypot = ((float) Math.hypot(motionEvent.getX(i5) - motionEvent.getX(i4), motionEvent.getY(i5) - motionEvent.getY(i4))) / botPreviewsEditLangContainer.pinchStartDistance;
                    botPreviewsEditLangContainer.pinchScale = fHypot;
                    if (!botPreviewsEditLangContainer.isInPinchToZoomTouchMode && (fHypot > 1.01f || fHypot < 0.99f)) {
                        botPreviewsEditLangContainer.isInPinchToZoomTouchMode = true;
                        boolean z = fHypot > 1.0f;
                        botPreviewsEditLangContainer.pinchScaleUp = z;
                        botPreviewsEditLangContainer.startPinchToMediaColumnsCount(z);
                    }
                    if (botPreviewsEditLangContainer.isInPinchToZoomTouchMode) {
                        boolean z2 = botPreviewsEditLangContainer.pinchScaleUp;
                        if ((!z2 || botPreviewsEditLangContainer.pinchScale >= 1.0f) && (z2 || botPreviewsEditLangContainer.pinchScale <= 1.0f)) {
                            botPreviewsEditLangContainer.columnsAnimationProgress = Math.max(0.0f, Math.min(1.0f, z2 ? ImageReceiver$$ExternalSyntheticOutline1.m(2.0f, botPreviewsEditLangContainer.pinchScale, 1.0f, 1.0f) : (1.0f - botPreviewsEditLangContainer.pinchScale) / 0.5f));
                        } else {
                            botPreviewsEditLangContainer.columnsAnimationProgress = 0.0f;
                        }
                        float f = botPreviewsEditLangContainer.columnsAnimationProgress;
                        if (f == 1.0f || f == 0.0f) {
                            if (f == 1.0f) {
                                int iCeil = (int) Math.ceil(botPreviewsEditLangContainer.pinchCenterPosition / botPreviewsEditLangContainer.animateToColumnsCount);
                                float startedTrackingX = BotPreviewsEditContainer.this.getStartedTrackingX() / (anonymousClass3.getMeasuredWidth() - ((int) (anonymousClass3.getMeasuredWidth() / botPreviewsEditLangContainer.animateToColumnsCount)));
                                int i7 = botPreviewsEditLangContainer.animateToColumnsCount;
                                int itemCount = (iCeil * i7) + ((int) (startedTrackingX * (i7 - 1)));
                                BotPreviewsEditLangContainer.AnonymousClass7 anonymousClass7 = botPreviewsEditLangContainer.adapter;
                                if (itemCount >= anonymousClass7.getItemCount()) {
                                    itemCount = anonymousClass7.getItemCount() - 1;
                                }
                                botPreviewsEditLangContainer.pinchCenterPosition = itemCount;
                            }
                            botPreviewsEditLangContainer.finishPinchToMediaColumnsCount();
                            if (botPreviewsEditLangContainer.columnsAnimationProgress == 0.0f) {
                                botPreviewsEditLangContainer.pinchScaleUp = !botPreviewsEditLangContainer.pinchScaleUp;
                            }
                            botPreviewsEditLangContainer.startPinchToMediaColumnsCount(botPreviewsEditLangContainer.pinchScaleUp);
                            botPreviewsEditLangContainer.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        }
                        anonymousClass3.invalidate();
                    }
                } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((botPreviewsEditLangContainer.pointerId1 == motionEvent.getPointerId(0) && botPreviewsEditLangContainer.pointerId2 == motionEvent.getPointerId(1)) || (botPreviewsEditLangContainer.pointerId1 == motionEvent.getPointerId(1) && botPreviewsEditLangContainer.pointerId2 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && botPreviewsEditLangContainer.isInPinchToZoomTouchMode) {
                    botPreviewsEditLangContainer.maybePinchToZoomTouchMode2 = false;
                    botPreviewsEditLangContainer.maybePinchToZoomTouchMode = false;
                    botPreviewsEditLangContainer.isInPinchToZoomTouchMode = false;
                    botPreviewsEditLangContainer.finishPinchToMediaColumnsCount();
                }
                return botPreviewsEditLangContainer.isInPinchToZoomTouchMode;
            }
        }
        return false;
    }

    public void createStory(final String str) {
        BaseFragment baseFragment = this.fragment;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        final ChatAttachAlert chatAttachAlert = new ChatAttachAlert(this.fragment.getParentActivity(), this.fragment, false, false, false, this.resourcesProvider);
        chatAttachAlert.setMaxSelectedPhotos(1, false);
        chatAttachAlert.setStoryMediaPicker();
        chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
        int i = Build.VERSION.SDK_INT;
        if (i == 21 || i == 22) {
            AndroidUtilities.hideKeyboard(this.fragment.getFragmentView().findFocus());
        }
        chatAttachAlert.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() {
            @Override
            public final void didPressedButton(int i2, boolean z, boolean z2, int i3, int i4, long j, boolean z3, boolean z4, long j2) {
                StoryRecorder.WindowView windowView;
                ChatAttachAlert chatAttachAlert2 = chatAttachAlert;
                if (chatAttachAlert2.getPhotoLayout().getSelectedPhotos().isEmpty()) {
                    return;
                }
                HashMap<Object, Object> selectedPhotos = chatAttachAlert2.getPhotoLayout().getSelectedPhotos();
                chatAttachAlert2.getPhotoLayout().getSelectedPhotosOrder();
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
                    long j3 = botPreviewsEditContainer.bot_id;
                    if (!storyRecorder.isShown) {
                        int i5 = storyRecorder.currentAccount;
                        if (MessagesController.getInstance(i5).isFrozen()) {
                            AccountFrozenAlert.show(i5);
                        } else {
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
                            StoryRecorder.AnonymousClass3 anonymousClass3 = storyRecorder.previewContainer;
                            int i6 = storyRecorder.openType;
                            anonymousClass3.setBackgroundColor((i6 == 1 || i6 == 0) ? 0 : -14737633);
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
                            storyRecorder.animateOpenTo(1.0f, true, new StoryRecorder$$ExternalSyntheticLambda5(storyRecorder, 8));
                            storyRecorder.addNotificationObservers();
                        }
                    }
                    AndroidUtilities.runOnUIThread(new BotSensors$1$$ExternalSyntheticLambda0(chatAttachAlert2, 14), 400L);
                }
            }

            @Override
            public final void didSelectBot(TLRPC.User user) {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$didSelectBot(this, user);
            }

            @Override
            public final void doOnIdle(Runnable runnable) {
                runnable.run();
            }

            @Override
            public final View getRevealView() {
                return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$getRevealView(this);
            }

            @Override
            public final boolean needEnterComment() {
                return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$needEnterComment(this);
            }

            @Override
            public final void onCameraOpened() {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onCameraOpened(this);
            }

            @Override
            public final void onWallpaperSelected(Object obj) {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onWallpaperSelected(this, obj);
            }

            @Override
            public final void openAvatarsSearch() {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$openAvatarsSearch(this);
            }

            @Override
            public final boolean selectItemOnClicking() {
                return true;
            }

            @Override
            public final void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i2, int i3, long j, boolean z2, long j2) {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$sendAudio(this, arrayList, charSequence, z, i2, i3, j, z2, j2);
            }
        });
        chatAttachAlert.init();
        chatAttachAlert.show();
    }

    public void deleteLang(String str) {
        StoriesController.BotPreviewsList botPreviewsList;
        TLRPC.MessageMedia messageMedia;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mainList.lang_codes.remove(str);
        this.localLangs.remove(str);
        int i = 0;
        while (true) {
            if (i >= this.langLists.size()) {
                botPreviewsList = null;
                break;
            }
            botPreviewsList = this.langLists.get(i);
            if (botPreviewsList != null && TextUtils.equals(botPreviewsList.lang_code, str)) {
                break;
            } else {
                i++;
            }
        }
        if (botPreviewsList != null) {
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            deletepreviewmedia.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.bot_id);
            deletepreviewmedia.lang_code = str;
            int i2 = 0;
            while (true) {
                ArrayList arrayList = botPreviewsList.messageObjects;
                if (i2 >= arrayList.size()) {
                    break;
                }
                TL_stories.StoryItem storyItem = ((MessageObject) arrayList.get(i2)).storyItem;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    deletepreviewmedia.media.add(MessagesController.toInputMedia(messageMedia));
                }
                i2++;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(deletepreviewmedia, null);
        }
        updateLangs(true);
        this.tabsView.scrollToTab(-1, 0);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = 0;
        if (i != NotificationCenter.storiesListUpdated) {
            if (i == NotificationCenter.storiesUpdated) {
                updateLangs(true);
                View[] viewPages = this.viewPager.getViewPages();
                int length = viewPages.length;
                while (i3 < length) {
                    View view = viewPages[i3];
                    if ((view instanceof BotPreviewsEditLangContainer) && ((BotPreviewsEditLangContainer) view) != null) {
                        ((BotPreviewsEditLangContainer) view).adapter.notifyDataSetChanged();
                    }
                    i3++;
                }
                return;
            }
            return;
        }
        Object obj = objArr[0];
        if (obj == this.mainList) {
            updateLangs(true);
            View[] viewPages2 = this.viewPager.getViewPages();
            int length2 = viewPages2.length;
            while (i3 < length2) {
                View view2 = viewPages2[i3];
                if (view2 instanceof BotPreviewsEditLangContainer) {
                    BotPreviewsEditLangContainer botPreviewsEditLangContainer = (BotPreviewsEditLangContainer) view2;
                    if (botPreviewsEditLangContainer.list == this.mainList) {
                        botPreviewsEditLangContainer.adapter.notifyDataSetChanged();
                    }
                }
                i3++;
            }
            return;
        }
        if (this.langLists.indexOf(obj) >= 0) {
            for (View view3 : this.viewPager.getViewPages()) {
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
        View[] viewPages = this.viewPager.getViewPages();
        if (Math.abs(this.viewPager.getCurrentPosition() - this.viewPager.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
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

    public abstract boolean isActionModeShowed();

    public abstract boolean isSelected(MessageObject messageObject);

    public boolean isSelectedAll() {
        StoriesController.BotPreviewsList botPreviewsList;
        View currentView = this.viewPager.getCurrentView();
        if ((currentView instanceof BotPreviewsEditLangContainer) && (botPreviewsList = ((BotPreviewsEditLangContainer) currentView).list) != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = botPreviewsList.messageObjects;
                if (i >= arrayList.size()) {
                    break;
                }
                if (!isSelected((MessageObject) arrayList.get(i))) {
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    public final void lambda$addTranslation$1(String str) {
        int i = 0;
        while (true) {
            if (i >= this.langLists.size()) {
                i = -1;
                break;
            } else if (TextUtils.equals(this.langLists.get(i).lang_code, str)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            this.tabsView.scrollToTab(str.hashCode(), i + 1);
        }
    }

    public final void lambda$addTranslation$2(String str) {
        if (!this.localLangs.contains(str)) {
            this.localLangs.add(str);
            updateLangs(true);
        }
        AndroidUtilities.runOnUIThread(new StoryViewer$5$$ExternalSyntheticLambda0(17, this, str), 120L);
    }

    public final Boolean lambda$new$0(Integer num, Integer num2) {
        if (num.intValue() != -1) {
            return Boolean.FALSE;
        }
        addTranslation();
        return Boolean.TRUE;
    }

    public final void lambda$updateTabs$3(ValueAnimator valueAnimator) {
        this.tabsAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.tabsView.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, this.tabsAlpha));
        this.viewPager.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), this.tabsAlpha));
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (attachedContainers == null) {
            attachedContainers = new LongSparseArray<>();
        }
        LongSparseArray<BotPreviewsEditContainer> longSparseArray = attachedContainers.get(this.currentAccount);
        if (longSparseArray == null) {
            LongSparseArray<LongSparseArray<BotPreviewsEditContainer>> longSparseArray2 = attachedContainers;
            long j = this.currentAccount;
            LongSparseArray<BotPreviewsEditContainer> longSparseArray3 = new LongSparseArray<>();
            longSparseArray2.put(j, longSparseArray3);
            longSparseArray = longSparseArray3;
        }
        longSparseArray.put(this.bot_id, this);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesUpdated);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (attachedContainers == null) {
            attachedContainers = new LongSparseArray<>();
        }
        LongSparseArray<BotPreviewsEditContainer> longSparseArray = attachedContainers.get(this.currentAccount);
        if (longSparseArray != null) {
            longSparseArray.remove(this.bot_id);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesUpdated);
    }

    public abstract void onSelectedTabChanged();

    public abstract boolean select(MessageObject messageObject);

    public void selectAll() {
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

    public void unselectAll() {
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
        ArrayList arrayList = new ArrayList(this.mainList.lang_codes);
        ArrayList<String> arrayList2 = this.localLangs;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            String str = arrayList2.get(i);
            i++;
            String str2 = str;
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        ArrayList arrayList3 = (ArrayList) MessagesController.getInstance(this.currentAccount).getStoriesController().uploadingStoriesByDialogId.get(this.bot_id);
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj = arrayList3.get(i2);
                i2++;
                StoriesController.UploadingStory uploadingStory = (StoriesController.UploadingStory) obj;
                if (uploadingStory != null && (storyEntry = uploadingStory.entry) != null && storyEntry.botId == this.bot_id && !TextUtils.isEmpty(storyEntry.botLang) && !arrayList.contains(storyEntry.botLang)) {
                    arrayList.add(storyEntry.botLang);
                }
            }
        }
        ArrayList arrayList4 = new ArrayList(this.langLists);
        this.langLists.clear();
        int size3 = arrayList.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj2 = arrayList.get(i3);
            i3++;
            String str3 = (String) obj2;
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList4.size()) {
                    botPreviewsList = null;
                    break;
                } else {
                    if (TextUtils.equals(((StoriesController.BotPreviewsList) arrayList4.get(i4)).lang_code, str3)) {
                        botPreviewsList = (StoriesController.BotPreviewsList) arrayList4.get(i4);
                        break;
                    }
                    i4++;
                }
            }
            if (botPreviewsList == null) {
                StoriesController.BotPreviewsList botPreviewsList2 = new StoriesController.BotPreviewsList(this.currentAccount, this.bot_id, str3, null);
                botPreviewsList2.loadInternal(null);
                botPreviewsList = botPreviewsList2;
            }
            this.langLists.add(botPreviewsList);
        }
        this.viewPager.fillTabs(true);
        SpannableString spannableString = new SpannableString(NotificationsController$$ExternalSyntheticOutline1.m(new StringBuilder("+ "), R.string.ProfileBotLanguageAdd));
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_filled_plus);
        coloredImageSpan.setScale(0.9f, 0.9f);
        coloredImageSpan.spaceScaleX = 0.85f;
        spannableString.setSpan(coloredImageSpan, 0, 1, 33);
        this.tabsView.addTab(-1, spannableString);
        this.tabsView.finishAddingTabs();
        updateTabs(this.langLists.size() + 1 > 1, z);
    }

    public void updateSelection(boolean z) {
        View currentView = this.viewPager.getCurrentView();
        if (currentView instanceof BotPreviewsEditLangContainer) {
            BotPreviewsEditLangContainer botPreviewsEditLangContainer = (BotPreviewsEditLangContainer) currentView;
            for (int i = 0; i < botPreviewsEditLangContainer.listView.getChildCount(); i++) {
                View childAt = botPreviewsEditLangContainer.listView.getChildAt(i);
                if (childAt instanceof SharedPhotoVideoCell2) {
                    SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) childAt;
                    sharedPhotoVideoCell2.setChecked(BotPreviewsEditContainer.this.isSelected(sharedPhotoVideoCell2.getMessageObject()), z);
                }
            }
        }
    }

    public final void updateTabs(final boolean z, boolean z2) {
        Boolean bool = this.shownTabs;
        if (bool == null || bool.booleanValue() != z) {
            ValueAnimator valueAnimator = this.tabsAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.shownTabs = Boolean.valueOf(z);
            if (!z2) {
                this.tabsAlpha = z ? 1.0f : 0.0f;
                this.tabsView.setTranslationY(AndroidUtilities.dp(z ? 0.0f : -42.0f));
                this.viewPager.setTranslationY(AndroidUtilities.dp(z ? 42.0f : 0.0f));
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.tabsAlpha, z ? 1.0f : 0.0f);
            this.tabsAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new RichMediaCell$$ExternalSyntheticLambda1(this, 16));
            this.tabsAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public final void onAnimationEnd(Animator animator) {
                    boolean z3 = z;
                    float f = z3 ? 1.0f : 0.0f;
                    BotPreviewsEditContainer botPreviewsEditContainer = BotPreviewsEditContainer.this;
                    botPreviewsEditContainer.tabsAlpha = f;
                    botPreviewsEditContainer.tabsView.setTranslationY(AndroidUtilities.dp(z3 ? 0.0f : -42.0f));
                    botPreviewsEditContainer.viewPager.setTranslationY(AndroidUtilities.dp(z3 ? 42.0f : 0.0f));
                }
            });
            this.tabsAnimator.setDuration(320L);
            this.tabsAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.tabsAnimator.start();
        }
    }
}
