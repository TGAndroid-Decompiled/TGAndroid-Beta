package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.gms.internal.mlkit_language_id_common.zzhp;
import com.google.android.gms.internal.mlkit_language_id_common.zzig;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Adapters.PaddedListAdapter;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.Cells.ContextLinkCell;
import org.telegram.ui.Cells.MentionCell;
import org.telegram.ui.Cells.StickerCell;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.MuteButton;

public class MentionsContainerView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private MentionsAdapter adapter;
    private int animationIndex;
    private BlurredBackgroundDrawable backgroundDrawable;
    BaseFragment baseFragment;
    private PhotoViewer.PhotoViewerProvider botContextProvider;
    private ArrayList<Object> botContextResults;
    private final RectF clipBounds;
    private final Path clipPath;
    private Integer color;
    private float containerBottom;
    private float containerPadding;
    private float containerTop;
    private Delegate delegate;
    private ExtendedGridLayoutManager gridLayoutManager;
    private float hideT;
    private boolean ignoreLayout;
    private LinearLayoutManager linearLayoutManager;
    private MentionsListView listView;
    private boolean listViewHiding;
    private float listViewPadding;
    private SpringAnimation listViewTranslationAnimator;
    private RecyclerListView.OnItemClickListener mentionsOnItemClickListener;
    private PaddedListAdapter paddedAdapter;
    private Paint paint;
    private Path path;
    private Rect rect;
    private final Theme.ResourcesProvider resourcesProvider;
    private int scrollRangeUpdateTries;
    private boolean scrollToFirst;
    private boolean shouldLiftMentions;
    private boolean shown;
    private boolean switchLayoutManagerOnEnd;
    private Runnable updateVisibilityRunnable;

    public class MentionsListView extends RecyclerListView {
        private boolean isDragging;
        private boolean isScrolling;
        private int lastHeight;
        private int lastWidth;

        public MentionsListView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    MentionsListView.this.isScrolling = i != 0;
                    MentionsListView.this.isDragging = i == 1;
                }

                @Override
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    String str;
                    TLRPC.User user;
                    String str2;
                    int iFindLastVisibleItemPosition = MentionsListView.this.getLayoutManager() == MentionsContainerView.this.gridLayoutManager ? MentionsContainerView.this.gridLayoutManager.findLastVisibleItemPosition() : MentionsContainerView.this.linearLayoutManager.findLastVisibleItemPosition();
                    if ((iFindLastVisibleItemPosition == -1 ? 0 : iFindLastVisibleItemPosition) > 0 && iFindLastVisibleItemPosition > MentionsContainerView.this.adapter.lastItemCount - 5) {
                        MentionsAdapter mentionsAdapter = MentionsContainerView.this.adapter;
                        if (mentionsAdapter.contextQueryReqid == 0 && (str = mentionsAdapter.nextQueryOffset) != null && str.length() != 0 && (user = mentionsAdapter.foundContextBot) != null && (str2 = mentionsAdapter.searchingContextQuery) != null) {
                            mentionsAdapter.searchForContextBotResults(true, user, str2, mentionsAdapter.nextQueryOffset);
                        }
                    }
                    MentionsListView mentionsListView = MentionsListView.this;
                    MentionsContainerView.this.onScrolled(!mentionsListView.canScrollVertically(-1), !MentionsListView.this.canScrollVertically(1));
                    MentionsContainerView.this.checkBackgroundBounds();
                }
            });
            addItemDecoration(new RecyclerView.ItemDecoration() {
                @Override
                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    int childAdapterPosition;
                    rect.left = 0;
                    rect.right = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    if (recyclerView.getLayoutManager() != MentionsContainerView.this.gridLayoutManager || (childAdapterPosition = recyclerView.getChildAdapterPosition(view)) == 0 || MentionsContainerView.this.adapter.isStickers()) {
                        return;
                    }
                    if (MentionsContainerView.this.adapter.getBotContextSwitch() == null && MentionsContainerView.this.adapter.searchResultBotWebViewSwitch == null) {
                        rect.top = AndroidUtilities.dp(2.0f);
                    } else {
                        if (childAdapterPosition == 0) {
                            return;
                        }
                        childAdapterPosition--;
                        if (!MentionsContainerView.this.gridLayoutManager.isFirstRow(childAdapterPosition)) {
                            rect.top = AndroidUtilities.dp(2.0f);
                        }
                    }
                    rect.right = MentionsContainerView.this.gridLayoutManager.isLastInRow(childAdapterPosition) ? 0 : AndroidUtilities.dp(2.0f);
                }
            });
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            MotionEvent motionEvent2;
            final MentionsAdapter mentionsAdapter;
            if (!MentionsContainerView.this.linearLayoutManager.getReverseLayout() ? this.isDragging || MentionsContainerView.this.paddedAdapter == null || MentionsContainerView.this.paddedAdapter.paddingView == null || !MentionsContainerView.this.paddedAdapter.paddingViewAttached || motionEvent.getY() >= MentionsContainerView.this.paddedAdapter.paddingView.getBottom() : this.isDragging || MentionsContainerView.this.paddedAdapter == null || MentionsContainerView.this.paddedAdapter.paddingView == null || !MentionsContainerView.this.paddedAdapter.paddingViewAttached || motionEvent.getY() <= MentionsContainerView.this.paddedAdapter.paddingView.getTop()) {
                if (this.isScrolling) {
                    motionEvent2 = motionEvent;
                } else {
                    motionEvent2 = motionEvent;
                    boolean z = ContentPreviewViewer.getInstance().onInterceptTouchEvent(motionEvent2, MentionsContainerView.this.listView, 0, null, this.resourcesProvider);
                    if ((MentionsContainerView.this.adapter.isStickers() && motionEvent2.getAction() == 0) || motionEvent2.getAction() == 2) {
                        mentionsAdapter = MentionsContainerView.this.adapter;
                        if (mentionsAdapter.isStickers()) {
                            if (mentionsAdapter.mentionsStickersActionTracker == null) {
                                final int i = mentionsAdapter.currentAccount;
                                final long j = mentionsAdapter.dialog_id;
                                final long j2 = mentionsAdapter.threadMessageId;
                                ?? r5 = new EmojiView.ChooseStickerActionTracker(i, j, j2) {
                                    @Override
                                    public final boolean isShown() {
                                        return MentionsAdapter.this.isStickers();
                                    }
                                };
                                mentionsAdapter.mentionsStickersActionTracker = r5;
                                r5.checkVisibility();
                            }
                            mentionsAdapter.mentionsStickersActionTracker.doSomeAction();
                        }
                    }
                    if (!super.onInterceptTouchEvent(motionEvent2) || z) {
                        return true;
                    }
                }
                if (MentionsContainerView.this.adapter.isStickers()) {
                    mentionsAdapter = MentionsContainerView.this.adapter;
                    if (mentionsAdapter.isStickers()) {
                        if (mentionsAdapter.mentionsStickersActionTracker == null) {
                            final int i2 = mentionsAdapter.currentAccount;
                            final long j3 = mentionsAdapter.dialog_id;
                            final long j4 = mentionsAdapter.threadMessageId;
                            ?? r6 = new EmojiView.ChooseStickerActionTracker(i2, j3, j4) {
                                @Override
                                public final boolean isShown() {
                                    return MentionsAdapter.this.isStickers();
                                }
                            };
                            mentionsAdapter.mentionsStickersActionTracker = r6;
                            r6.checkVisibility();
                        }
                        mentionsAdapter.mentionsStickersActionTracker.doSomeAction();
                    }
                } else {
                    mentionsAdapter = MentionsContainerView.this.adapter;
                    if (mentionsAdapter.isStickers()) {
                        if (mentionsAdapter.mentionsStickersActionTracker == null) {
                            final int i3 = mentionsAdapter.currentAccount;
                            final long j5 = mentionsAdapter.dialog_id;
                            final long j6 = mentionsAdapter.threadMessageId;
                            ?? r7 = new EmojiView.ChooseStickerActionTracker(i3, j5, j6) {
                                @Override
                                public final boolean isShown() {
                                    return MentionsAdapter.this.isStickers();
                                }
                            };
                            mentionsAdapter.mentionsStickersActionTracker = r7;
                            r7.checkVisibility();
                        }
                        mentionsAdapter.mentionsStickersActionTracker.doSomeAction();
                    }
                }
                if (!super.onInterceptTouchEvent(motionEvent2)) {
                }
                return true;
            }
            return false;
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int top;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            boolean zIsReversed = MentionsContainerView.this.isReversed();
            LinearLayoutManager currentLayoutManager = MentionsContainerView.this.getCurrentLayoutManager();
            int iFindFirstVisibleItemPosition = zIsReversed ? currentLayoutManager.findFirstVisibleItemPosition() : currentLayoutManager.findLastVisibleItemPosition();
            View viewFindViewByPosition = currentLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
            if (viewFindViewByPosition != null) {
                top = viewFindViewByPosition.getTop() - (zIsReversed ? 0 : this.lastHeight - i6);
            } else {
                top = 0;
            }
            super.onLayout(z, i, i2, i3, i4);
            if (MentionsContainerView.this.scrollToFirst) {
                MentionsContainerView.this.ignoreLayout = true;
                currentLayoutManager.scrollToPositionWithOffset(0, 100000);
                super.onLayout(false, i, i2, i3, i4);
                MentionsContainerView.this.ignoreLayout = false;
                MentionsContainerView.this.scrollToFirst = false;
            } else if (iFindFirstVisibleItemPosition != -1 && i5 == this.lastWidth && i6 - this.lastHeight != 0) {
                MentionsContainerView.this.ignoreLayout = true;
                currentLayoutManager.scrollToPositionWithOffset(iFindFirstVisibleItemPosition, top, false);
                super.onLayout(false, i, i2, i3, i4);
                MentionsContainerView.this.ignoreLayout = false;
            }
            this.lastHeight = i6;
            this.lastWidth = i5;
        }

        @Override
        public void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i2);
            if (MentionsContainerView.this.paddedAdapter != null) {
                PaddedListAdapter paddedListAdapter = MentionsContainerView.this.paddedAdapter;
                paddedListAdapter.padding = Integer.valueOf(size);
                MuteButton.AnonymousClass1 anonymousClass1 = paddedListAdapter.paddingView;
                if (anonymousClass1 != null) {
                    anonymousClass1.requestLayout();
                }
            }
            MentionsContainerView.this.listViewPadding = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size + ((int) MentionsContainerView.this.listViewPadding), 1073741824));
        }

        @Override
        public void onScrolled(int i, int i2) {
            super.onScrolled(i, i2);
            MentionsContainerView.this.invalidate();
            MentionsContainerView.this.checkBackgroundBounds();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (MentionsContainerView.this.linearLayoutManager.getReverseLayout()) {
                if (!this.isDragging && MentionsContainerView.this.paddedAdapter != null && MentionsContainerView.this.paddedAdapter.paddingView != null && MentionsContainerView.this.paddedAdapter.paddingViewAttached && motionEvent.getY() > MentionsContainerView.this.paddedAdapter.paddingView.getTop()) {
                    return false;
                }
            } else if (!this.isDragging && MentionsContainerView.this.paddedAdapter != null && MentionsContainerView.this.paddedAdapter.paddingView != null && MentionsContainerView.this.paddedAdapter.paddingViewAttached && motionEvent.getY() < MentionsContainerView.this.paddedAdapter.paddingView.getBottom()) {
                return false;
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override
        public void requestLayout() {
            if (MentionsContainerView.this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        @Override
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            MentionsContainerView.this.invalidate();
            MentionsContainerView.this.checkBackgroundBounds();
        }
    }

    public MentionsContainerView(Context context, long j, long j2, final BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.shouldLiftMentions = false;
        this.rect = new Rect();
        this.ignoreLayout = false;
        this.scrollToFirst = false;
        this.shown = false;
        this.updateVisibilityRunnable = new GroupCallPip$$ExternalSyntheticLambda2(this, 19);
        this.animationIndex = -1;
        this.listViewHiding = false;
        this.hideT = 0.0f;
        this.switchLayoutManagerOnEnd = false;
        this.botContextProvider = new PhotoViewer.EmptyPhotoViewerProvider() {
            @Override
            public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
                ImageReceiver photoImage;
                if (i >= 0 && i < MentionsContainerView.this.botContextResults.size()) {
                    int childCount = MentionsContainerView.this.getListView().getChildCount();
                    Object obj = MentionsContainerView.this.botContextResults.get(i);
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = MentionsContainerView.this.getListView().getChildAt(i2);
                        if (childAt instanceof ContextLinkCell) {
                            ContextLinkCell contextLinkCell = (ContextLinkCell) childAt;
                            if (contextLinkCell.getResult() == obj) {
                                photoImage = contextLinkCell.getPhotoImage();
                            } else {
                                photoImage = null;
                            }
                        } else {
                            photoImage = null;
                        }
                        if (photoImage != null) {
                            int[] iArr = new int[2];
                            childAt.getLocationInWindow(iArr);
                            PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                            placeProviderObject.viewX = iArr[0];
                            placeProviderObject.viewY = iArr[1];
                            placeProviderObject.parentView = MentionsContainerView.this.getListView();
                            placeProviderObject.imageReceiver = photoImage;
                            placeProviderObject.thumb = photoImage.getBitmapSafe();
                            placeProviderObject.radius = photoImage.getRoundRadius(true);
                            return placeProviderObject;
                        }
                    }
                }
                return null;
            }

            @Override
            public void sendButtonPressed(int i, VideoEditedInfo videoEditedInfo, boolean z, int i2, int i3, boolean z2) {
                if (i < 0 || i >= MentionsContainerView.this.botContextResults.size()) {
                    return;
                }
                MentionsContainerView.this.delegate.sendBotInlineResult((TLRPC.BotInlineResult) MentionsContainerView.this.botContextResults.get(i), z, i2);
            }
        };
        this.clipPath = new Path();
        this.clipBounds = new RectF();
        this.baseFragment = baseFragment;
        this.resourcesProvider = resourcesProvider;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.listViewPadding = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        this.listView = new MentionsListView(context, resourcesProvider);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context) {
            {
                super(1, false);
            }

            @Override
            public void setReverseLayout(boolean z) {
                super.setReverseLayout(z);
                MentionsContainerView.this.listView.setTranslationY(AndroidUtilities.dp(6.0f) * (z ? -1 : 1));
            }

            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        };
        this.linearLayoutManager = linearLayoutManager;
        linearLayoutManager.setOrientation(1);
        ExtendedGridLayoutManager extendedGridLayoutManager = new ExtendedGridLayoutManager(context, 100, false, false) {
            private Size size = new Size();

            @Override
            public int getFlowItemCount() {
                return (MentionsContainerView.this.adapter.getBotContextSwitch() == null && MentionsContainerView.this.adapter.searchResultBotWebViewSwitch == null) ? super.getFlowItemCount() : getItemCount() - 1;
            }

            @Override
            public Size getSizeForItem(int i) {
                TLRPC.PhotoSize closestPhotoSizeWithSize;
                Size size = this.size;
                int i2 = 0;
                size.full = false;
                if (i == 0) {
                    size.width = getWidth();
                    this.size.height = MentionsContainerView.this.paddedAdapter.lastPadding;
                    Size size2 = this.size;
                    size2.full = true;
                    return size2;
                }
                int i3 = i - 1;
                if (MentionsContainerView.this.adapter.getBotContextSwitch() == null && MentionsContainerView.this.adapter.searchResultBotWebViewSwitch == null) {
                    i = i3;
                }
                Size size3 = this.size;
                size3.width = 0.0f;
                size3.height = 0.0f;
                Object item = MentionsContainerView.this.adapter.getItem(i);
                if (item instanceof TLRPC.BotInlineResult) {
                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) item;
                    TLRPC.Document document = botInlineResult.document;
                    if (document != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                        Size size4 = this.size;
                        size4.width = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.w : 100.0f;
                        size4.height = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.h : 100.0f;
                        while (i2 < botInlineResult.document.attributes.size()) {
                            TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i2);
                            if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                Size size5 = this.size;
                                size5.width = documentAttribute.w;
                                size5.height = documentAttribute.h;
                                break;
                            }
                            i2++;
                        }
                    } else if (botInlineResult.content != null) {
                        while (i2 < botInlineResult.content.attributes.size()) {
                            TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i2);
                            if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                                Size size6 = this.size;
                                size6.width = documentAttribute2.w;
                                size6.height = documentAttribute2.h;
                                break;
                            }
                            i2++;
                        }
                    } else if (botInlineResult.thumb != null) {
                        while (i2 < botInlineResult.thumb.attributes.size()) {
                            TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i2);
                            if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                                Size size7 = this.size;
                                size7.width = documentAttribute3.w;
                                size7.height = documentAttribute3.h;
                                break;
                            }
                            i2++;
                        }
                    } else {
                        TLRPC.Photo photo = botInlineResult.photo;
                        if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                            Size size8 = this.size;
                            size8.width = closestPhotoSizeWithSize.w;
                            size8.height = closestPhotoSizeWithSize.h;
                        }
                    }
                }
                return this.size;
            }
        };
        this.gridLayoutManager = extendedGridLayoutManager;
        extendedGridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i) {
                if (i == 0) {
                    return 100;
                }
                int i2 = i - 1;
                Object item = MentionsContainerView.this.adapter.getItem(i2);
                if (item instanceof TLRPC.TL_inlineBotSwitchPM) {
                    return 100;
                }
                if (item instanceof TLRPC.Document) {
                    return 20;
                }
                if (MentionsContainerView.this.adapter.getBotContextSwitch() != null || MentionsContainerView.this.adapter.searchResultBotWebViewSwitch != null) {
                    i = i2;
                }
                return MentionsContainerView.this.gridLayoutManager.getSpanSizeForItem(i);
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setAddDuration(150L);
        defaultItemAnimator.setMoveDuration(150L);
        defaultItemAnimator.setChangeDuration(150L);
        defaultItemAnimator.setRemoveDuration(150L);
        defaultItemAnimator.setTranslationInterpolator(CubicBezierInterpolator.DEFAULT);
        defaultItemAnimator.setDelayAnimations(false);
        this.listView.lambda$onCellEnter$52(defaultItemAnimator);
        this.listView.setClipToPadding(false);
        this.listView.setLayoutManager(this.linearLayoutManager);
        MentionsAdapter mentionsAdapter = new MentionsAdapter(context, j, j2, new MentionsAdapter.MentionsAdapterDelegate() {
            @Override
            public void needChangePanelVisibility(boolean z) {
                if (MentionsContainerView.this.getNeededLayoutManager() != MentionsContainerView.this.getCurrentLayoutManager() && MentionsContainerView.this.canOpen()) {
                    if (MentionsContainerView.this.adapter.lastItemCount > 0) {
                        MentionsContainerView.this.switchLayoutManagerOnEnd = true;
                        MentionsContainerView.this.updateVisibility(false);
                        return;
                    }
                    MentionsContainerView.this.listView.setLayoutManager(MentionsContainerView.this.getNeededLayoutManager());
                }
                if (z && !MentionsContainerView.this.canOpen()) {
                    z = false;
                }
                MentionsContainerView.this.updateVisibility((!z || MentionsContainerView.this.adapter.getItemCountInternal() > 0) ? z : false);
            }

            @Override
            public void onContextClick(TLRPC.BotInlineResult botInlineResult) {
                MentionsContainerView.this.onContextClick(botInlineResult);
            }

            @Override
            public void onContextSearch(boolean z) {
                MentionsContainerView.this.onContextSearch(z);
            }

            @Override
            public void onItemCountUpdate(int i, int i2) {
                if (MentionsContainerView.this.listView.getLayoutManager() == MentionsContainerView.this.gridLayoutManager || !MentionsContainerView.this.shown) {
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(MentionsContainerView.this.updateVisibilityRunnable);
                AndroidUtilities.runOnUIThread(MentionsContainerView.this.updateVisibilityRunnable, baseFragment.getFragmentBeginToShow() ? 0L : 100L);
            }
        }, resourcesProvider, isStories());
        this.adapter = mentionsAdapter;
        PaddedListAdapter paddedListAdapter = new PaddedListAdapter(mentionsAdapter);
        this.paddedAdapter = paddedListAdapter;
        this.listView.setAdapter(paddedListAdapter);
        this.listView.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        setReversed(false);
    }

    public void checkBackgroundBounds() {
        if (this.listView == null || this.linearLayoutManager == null) {
            return;
        }
        boolean zIsReversed = isReversed();
        this.containerPadding = 0.0f;
        if (zIsReversed) {
            PaddedListAdapter paddedListAdapter = this.paddedAdapter;
            float fMin = Math.min(Math.max(0.0f, this.listView.getTranslationY() + (paddedListAdapter.paddingViewAttached ? paddedListAdapter.paddingView.getTop() : getHeight())) + this.containerPadding, (1.0f - this.hideT) * getHeight());
            this.containerTop = 0.0f;
            this.containerBottom = fMin;
        } else {
            PaddedListAdapter paddedListAdapter2 = this.paddedAdapter;
            this.containerTop = Math.max(Math.max(0.0f, this.listView.getTranslationY() + (paddedListAdapter2.paddingViewAttached ? paddedListAdapter2.paddingView.getBottom() : 0)) - this.containerPadding, this.hideT * getHeight());
            this.containerBottom = getMeasuredHeight();
        }
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.setBounds(0, ((int) this.containerTop) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.containerBottom));
            this.clipPath.rewind();
            this.clipBounds.set(this.backgroundDrawable.boundProps.boundsWithPadding);
            if (isGif()) {
                this.clipBounds.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                this.clipPath.addRoundRect(this.clipBounds, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Path.Direction.CW);
            } else {
                this.clipPath.addRoundRect(this.clipBounds, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f), Path.Direction.CW);
            }
            this.clipPath.close();
            invalidate();
        }
    }

    private void checkListViewPadding() {
        if (this.listView == null || this.linearLayoutManager == null) {
            return;
        }
        boolean zIsGif = isGif();
        if (this.backgroundDrawable == null) {
            this.listView.setPadding(0, 0, 0, 0);
        } else {
            this.listView.setPadding(AndroidUtilities.dp(zIsGif ? 7.0f : 5.0f), zIsGif ? AndroidUtilities.dp(2.0f) : 0, AndroidUtilities.dp(zIsGif ? 7.0f : 5.0f), zIsGif ? AndroidUtilities.dp(2.0f) : 0);
        }
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    private Paint getThemedPaint(String str) {
        Paint paint = this.resourcesProvider.getPaint(str);
        return paint != null ? paint : Theme.getThemePaint(str);
    }

    private boolean isGif() {
        MentionsAdapter mentionsAdapter;
        MentionsListView mentionsListView = this.listView;
        return (mentionsListView == null || this.gridLayoutManager == null || mentionsListView.getLayoutManager() != this.gridLayoutManager || (mentionsAdapter = this.adapter) == null || mentionsAdapter.searchResultBotContext == null) ? false : true;
    }

    public static void lambda$didReceivedNotification$6(View view) {
        if (view instanceof MentionCell) {
            MentionCell mentionCell = (MentionCell) view;
            mentionCell.nameTextView.invalidate();
            mentionCell.usernameTextView.invalidate();
        } else if (view instanceof QuickRepliesActivity.QuickReplyView) {
            ((QuickRepliesActivity.QuickReplyView) view).textView.invalidate();
        } else {
            view.invalidate();
        }
    }

    public void lambda$new$0() {
        updateListViewTranslation(!this.shown, true);
    }

    public void lambda$updateListViewTranslation$1(float f, float f2, float f3, float f4, DynamicAnimation dynamicAnimation, float f5, float f6) {
        this.listView.setTranslationY(f5);
        onAnimationScroll();
        this.hideT = AndroidUtilities.lerp(f, f2, (f5 - f3) / (f4 - f3));
    }

    public void lambda$updateListViewTranslation$2(boolean z, DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
        if (z2) {
            return;
        }
        this.listViewTranslationAnimator = null;
        setVisibility(z ? 8 : 0);
        if (this.switchLayoutManagerOnEnd && z) {
            this.switchLayoutManagerOnEnd = false;
            this.listView.setLayoutManager(getNeededLayoutManager());
            this.shown = true;
            updateVisibility(true);
        }
    }

    public static void lambda$updateListViewTranslation$3(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
    }

    public void lambda$withDelegate$4(Delegate delegate, View view, int i) {
        int i2;
        int i3;
        if (i != 0) {
            MentionsAdapter adapter = getAdapter();
            if (adapter.foundContextBot == null || adapter.inlineMediaEnabled) {
                int i4 = i - 1;
                Object item = getAdapter().getItem(i4);
                int i5 = getAdapter().resultStartPosition;
                int i6 = getAdapter().resultLength;
                String str = "";
                if (getAdapter().hintHashtag != null && i4 == 1) {
                    TLRPC.Chat currentChat = getAdapter().chat;
                    if (currentChat == null && getAdapter().parentFragment != null) {
                        currentChat = getAdapter().parentFragment.getCurrentChat();
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(getAdapter().hintHashtag);
                    if (currentChat != null) {
                        str = "@" + ChatObject.getPublicUsername(currentChat);
                    }
                    delegate.replaceText(i5, i6, MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(sb, str, " "), false);
                    return;
                }
                if (getAdapter().hintHashtag != null && i4 == 0) {
                    delegate.replaceText(i5, i6, MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder(), getAdapter().hintHashtag, " "), false);
                    return;
                }
                Object obj = null;
                Paint.FontMetricsInt fontMetrics = null;
                obj = null;
                obj = null;
                obj = null;
                if (item instanceof TLRPC.TL_document) {
                    if (view instanceof StickerCell) {
                        ((StickerCell) view).getSendAnimationData();
                    }
                    TLRPC.TL_document tL_document = (TLRPC.TL_document) item;
                    MentionsAdapter adapter2 = getAdapter();
                    if (adapter2.hintHashtag != null) {
                        if (i4 >= 2) {
                            i3 = i - 3;
                        }
                        delegate.onStickerSelected(tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), obj);
                    } else {
                        i3 = i4;
                    }
                    ArrayList arrayList = adapter2.stickers;
                    if (arrayList != null && i3 >= 0 && i3 < arrayList.size()) {
                        obj = ((MentionsAdapter.StickerResult) adapter2.stickers.get(i3)).parent;
                    }
                    delegate.onStickerSelected(tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), obj);
                } else if (item instanceof TLRPC.Chat) {
                    String publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) item);
                    if (publicUsername != null) {
                        delegate.replaceText(i5, i6, zzig.m("@", publicUsername, " "), false);
                    }
                } else if (item instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) item;
                    if (UserObject.getPublicUsername(user) != null) {
                        delegate.replaceText(i5, i6, "@" + UserObject.getPublicUsername(user) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(zzhp.m(UserObject.getFirstName(user, false), " "));
                        spannableString.setSpan(new URLSpanUserMention("" + user.id, 3), 0, spannableString.length(), 33);
                        delegate.replaceText(i5, i6, spannableString, false);
                    }
                } else if (item instanceof String) {
                    delegate.replaceText(i5, i6, item + " ", false);
                } else if (item instanceof MediaDataController.KeywordResult) {
                    String str2 = ((MediaDataController.KeywordResult) item).emoji;
                    delegate.addEmojiToRecent(str2);
                    if (str2 != null) {
                        try {
                            if (str2.startsWith("animated_")) {
                                try {
                                    fontMetrics = delegate.getFontMetrics();
                                } catch (Exception e) {
                                    FileLog.e((Throwable) e, false);
                                }
                                long j = Long.parseLong(str2.substring(9));
                                TLRPC.Document documentFindDocument = AnimatedEmojiDrawable.findDocument(UserConfig.selectedAccount, j);
                                SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(documentFindDocument));
                                spannableString2.setSpan(documentFindDocument != null ? new AnimatedEmojiSpan(documentFindDocument, fontMetrics) : new AnimatedEmojiSpan(j, fontMetrics), 0, spannableString2.length(), 33);
                                delegate.replaceText(i5, i6, spannableString2, false);
                            } else {
                                delegate.replaceText(i5, i6, str2, true);
                            }
                        } catch (Exception unused) {
                            delegate.replaceText(i5, i6, str2, true);
                        }
                    } else {
                        delegate.replaceText(i5, i6, str2, true);
                    }
                    updateVisibility(false);
                }
                if (item instanceof TLRPC.BotInlineResult) {
                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) item;
                    if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals("video") || botInlineResult.document == null))) {
                        delegate.sendBotInlineResult(botInlineResult, true, 0);
                        return;
                    }
                    ArrayList<Object> arrayList2 = new ArrayList<>(getAdapter().searchResultBotContext);
                    this.botContextResults = arrayList2;
                    PhotoViewer.getInstance().setParentActivity(this.baseFragment, this.resourcesProvider);
                    PhotoViewer photoViewer = PhotoViewer.getInstance();
                    MentionsAdapter adapter3 = getAdapter();
                    if (adapter3.hintHashtag == null) {
                        if (adapter3.searchResultBotContext != null || (adapter3.searchResultBotContextSwitch == null && adapter3.searchResultBotWebViewSwitch == null)) {
                            i2 = i4;
                        } else {
                            i2 = i4 - 1;
                        }
                    } else if (i4 < 2) {
                        i2 = 0;
                    } else {
                        i4 = i - 3;
                        if (adapter3.searchResultBotContext != null) {
                            i2 = i4;
                        } else {
                            i2 = i4;
                        }
                    }
                    photoViewer.openPhotoForSelect(arrayList2, i2, 3, false, this.botContextProvider, null);
                }
            }
        }
    }

    public boolean lambda$withDelegate$5(View view, MotionEvent motionEvent) {
        return ContentPreviewViewer.getInstance().onTouch(motionEvent, getListView(), 0, this.mentionsOnItemClickListener, null, this.resourcesProvider);
    }

    private void updateListViewTranslation(final boolean z, boolean z2) {
        float fDp;
        int i;
        float fMax;
        SpringAnimation springAnimation;
        if (this.listView == null || this.paddedAdapter == null) {
            this.scrollRangeUpdateTries = 0;
            return;
        }
        if (this.listViewHiding && (springAnimation = this.listViewTranslationAnimator) != null && springAnimation.mRunning && z) {
            this.scrollRangeUpdateTries = 0;
            return;
        }
        boolean zIsReversed = isReversed();
        if (z) {
            fDp = (-this.containerPadding) - AndroidUtilities.dp(6.0f);
        } else {
            int iComputeVerticalScrollRange = this.listView.computeVerticalScrollRange();
            float f = (iComputeVerticalScrollRange - this.paddedAdapter.lastPadding) + this.containerPadding;
            if (iComputeVerticalScrollRange <= 0 && this.adapter.getItemCountInternal() > 0 && (i = this.scrollRangeUpdateTries) < 3) {
                this.scrollRangeUpdateTries = i + 1;
                updateVisibility(true);
                return;
            }
            fDp = f;
        }
        this.scrollRangeUpdateTries = 0;
        if (zIsReversed) {
            fMax = -Math.max(0.0f, this.listViewPadding - fDp);
        } else {
            float f2 = this.listViewPadding;
            fMax = Math.max(0.0f, f2 - fDp) + (-f2);
        }
        if (z && !zIsReversed) {
            fMax += this.listView.computeVerticalScrollOffset();
        }
        final float f3 = fMax;
        SpringAnimation springAnimation2 = this.listViewTranslationAnimator;
        if (springAnimation2 != null) {
            springAnimation2.cancel();
        }
        Integer numValueOf = null;
        if (z2) {
            this.listViewHiding = z;
            final float translationY = this.listView.getTranslationY();
            final float f4 = this.hideT;
            final float f5 = z ? 1.0f : 0.0f;
            if (translationY == f3) {
                this.listViewTranslationAnimator = null;
                numValueOf = Integer.valueOf(z ? 8 : 0);
                if (this.switchLayoutManagerOnEnd && z) {
                    this.switchLayoutManagerOnEnd = false;
                    this.listView.setLayoutManager(getNeededLayoutManager());
                    this.shown = true;
                    updateVisibility(true);
                }
            } else {
                SpringAnimation springAnimation3 = new SpringAnimation(new FloatValueHolder(translationY));
                SpringForce springForce = new SpringForce(f3);
                springForce.setDampingRatio(1.0f);
                springForce.setStiffness(550.0f);
                springAnimation3.mSpring = springForce;
                this.listViewTranslationAnimator = springAnimation3;
                springAnimation3.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f6, float f7) {
                        this.f$0.lambda$updateListViewTranslation$1(f4, f5, translationY, f3, dynamicAnimation, f6, f7);
                    }
                });
                if (z) {
                    this.listViewTranslationAnimator.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                        @Override
                        public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z3, float f6, float f7) {
                            this.f$0.lambda$updateListViewTranslation$2(z, dynamicAnimation, z3, f6, f7);
                        }
                    });
                }
                this.listViewTranslationAnimator.addEndListener(new MentionsContainerView$$ExternalSyntheticLambda6());
                this.listViewTranslationAnimator.start();
            }
        } else {
            this.hideT = z ? 1.0f : 0.0f;
            this.listView.setTranslationY(f3);
            if (z) {
                numValueOf = 8;
            }
        }
        if (numValueOf == null || getVisibility() == numValueOf.intValue()) {
            return;
        }
        setVisibility(numValueOf.intValue());
    }

    public boolean canOpen() {
        return true;
    }

    public float clipBottom() {
        if (getVisibility() == 0 && !isReversed()) {
            return getMeasuredHeight() - this.containerTop;
        }
        return 0.0f;
    }

    public float clipTop() {
        if (getVisibility() == 0 && isReversed()) {
            return this.containerBottom;
        }
        return 0.0f;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.listView, (Consumer) new StickersAlert$$ExternalSyntheticLambda31(2));
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z;
        float fMin;
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.draw(canvas);
            canvas.save();
            canvas.clipPath(this.clipPath);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean zIsReversed = isReversed();
        if (this.adapter.isStickers() || this.adapter.searchResultBotContext != null) {
            MentionsAdapter mentionsAdapter = this.adapter;
            if ((mentionsAdapter.contextMedia || mentionsAdapter.stickers != null) && mentionsAdapter.getBotContextSwitch() == null && this.adapter.searchResultBotWebViewSwitch == null) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.containerPadding = AndroidUtilities.dp((z ? 2 : 0) + 2);
        canvas.save();
        float fDp = AndroidUtilities.dp(6.0f);
        float f = this.containerTop;
        if (zIsReversed) {
            PaddedListAdapter paddedListAdapter = this.paddedAdapter;
            float fMin2 = Math.min(Math.max(0.0f, this.listView.getTranslationY() + (paddedListAdapter.paddingViewAttached ? paddedListAdapter.paddingView.getTop() : getHeight())) + this.containerPadding, (1.0f - this.hideT) * getHeight());
            Rect rect = this.rect;
            this.containerTop = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.containerBottom = fMin2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) fMin2);
            fMin = Math.min(fDp, Math.abs(getMeasuredHeight() - this.containerBottom));
            if (fMin > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                this.rect.top -= (int) fMin;
            }
        } else {
            if (this.listView.getLayoutManager() == this.gridLayoutManager) {
                this.containerPadding += AndroidUtilities.dp(2.0f);
                fDp += AndroidUtilities.dp(2.0f);
            }
            PaddedListAdapter paddedListAdapter2 = this.paddedAdapter;
            float fMax = Math.max(0.0f, this.listView.getTranslationY() + (paddedListAdapter2.paddingViewAttached ? paddedListAdapter2.paddingView.getBottom() : 0)) - this.containerPadding;
            this.containerTop = fMax;
            float fMax2 = Math.max(fMax, this.hideT * getHeight());
            Rect rect2 = this.rect;
            this.containerTop = fMax2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.containerBottom = measuredHeight;
            rect2.set(0, (int) fMax2, measuredWidth2, (int) measuredHeight);
            fMin = Math.min(fDp, Math.abs(this.containerTop));
            if (fMin > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                this.rect.bottom += (int) fMin;
            }
        }
        if (Math.abs(f - this.containerTop) > 0.1f) {
            onAnimationScroll();
        }
        if (this.paint == null) {
            Paint paint = new Paint(1);
            this.paint = paint;
            paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 503316480);
        }
        Paint paint2 = this.paint;
        Integer num = this.color;
        paint2.setColor(num != null ? num.intValue() : getThemedColor(Theme.key_chat_messagePanelBackground));
        drawRoundRect(canvas, this.rect, fMin);
        canvas.clipRect(this.rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public void drawRoundRect(Canvas canvas, Rect rect, float f) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f, f, this.paint);
    }

    public MentionsAdapter getAdapter() {
        return this.adapter;
    }

    public LinearLayoutManager getCurrentLayoutManager() {
        RecyclerView.LayoutManager layoutManager = this.listView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = this.linearLayoutManager;
        return layoutManager == linearLayoutManager ? linearLayoutManager : this.gridLayoutManager;
    }

    public MentionsListView getListView() {
        return this.listView;
    }

    public LinearLayoutManager getNeededLayoutManager() {
        if (this.adapter.isStickers() || this.adapter.searchResultBotContext != null) {
            MentionsAdapter mentionsAdapter = this.adapter;
            if (mentionsAdapter.contextMedia || mentionsAdapter.stickers != null) {
                return this.gridLayoutManager;
            }
        }
        return this.linearLayoutManager;
    }

    public boolean isOpen() {
        return this.shown;
    }

    public boolean isReversed() {
        RecyclerView.LayoutManager layoutManager = this.listView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = this.linearLayoutManager;
        return layoutManager == linearLayoutManager && linearLayoutManager.getReverseLayout();
    }

    public boolean isStories() {
        return false;
    }

    public void onAnimationScroll() {
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public void onClose() {
    }

    public void onContextClick(TLRPC.BotInlineResult botInlineResult) {
    }

    public void onContextSearch(boolean z) {
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        checkBackgroundBounds();
    }

    @Override
    public void onMeasure(int i, int i2) {
        checkListViewPadding();
        super.onMeasure(i, i2);
    }

    public void onOpen() {
    }

    public void onPanTransitionEnd() {
    }

    public void onPanTransitionStart() {
        this.shouldLiftMentions = isReversed();
    }

    public void onPanTransitionUpdate(float f) {
        if (this.shouldLiftMentions) {
            setTranslationY(f);
        }
    }

    public void onScrolled(boolean z, boolean z2) {
    }

    @Override
    public void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        this.backgroundDrawable = blurredBackgroundDrawable;
        blurredBackgroundDrawable.setRadius(AndroidUtilities.dp(22.0f));
        this.backgroundDrawable.setPadding(AndroidUtilities.dp(5.0f));
        checkListViewPadding();
    }

    public void setDialogId(long j) {
        MentionsAdapter mentionsAdapter = this.adapter;
        if (mentionsAdapter.dialog_id != j) {
            mentionsAdapter.dialog_id = j;
        }
    }

    public void setIgnoreLayout(boolean z) {
        this.ignoreLayout = z;
    }

    public void setOverrideColor(int i) {
        this.color = Integer.valueOf(i);
        invalidate();
    }

    public void setReversed(boolean z) {
        if (z != isReversed()) {
            this.scrollToFirst = true;
            this.linearLayoutManager.setReverseLayout(z);
            MentionsAdapter mentionsAdapter = this.adapter;
            if (mentionsAdapter.isReversed != z) {
                mentionsAdapter.isReversed = z;
                int i = mentionsAdapter.lastItemCount;
                if (i > 0) {
                    mentionsAdapter.lambda$onBindViewHolder$31(0);
                }
                if (i > 1) {
                    mentionsAdapter.lambda$onBindViewHolder$31(i - 1);
                }
            }
        }
    }

    public void updateVisibility(boolean z) {
        if (z) {
            boolean zIsReversed = isReversed();
            if (!this.shown) {
                this.scrollToFirst = true;
                RecyclerView.LayoutManager layoutManager = this.listView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = this.linearLayoutManager;
                if (layoutManager == linearLayoutManager) {
                    linearLayoutManager.scrollToPositionWithOffset(0, zIsReversed ? -100000 : 100000);
                }
                if (getVisibility() == 8) {
                    this.hideT = 1.0f;
                    MentionsListView mentionsListView = this.listView;
                    mentionsListView.setTranslationY(zIsReversed ? -(this.listViewPadding + AndroidUtilities.dp(12.0f)) : mentionsListView.computeVerticalScrollOffset() + this.listViewPadding);
                }
            }
            setVisibility(0);
        } else {
            this.scrollToFirst = false;
        }
        this.shown = z;
        AndroidUtilities.cancelRunOnUIThread(this.updateVisibilityRunnable);
        SpringAnimation springAnimation = this.listViewTranslationAnimator;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        Runnable runnable = this.updateVisibilityRunnable;
        BaseFragment baseFragment = this.baseFragment;
        AndroidUtilities.runOnUIThread(runnable, (baseFragment == null || !baseFragment.getFragmentBeginToShow()) ? 100L : 0L);
        if (z) {
            onOpen();
        } else {
            onClose();
        }
    }

    public void withDelegate(Delegate delegate) {
        this.delegate = delegate;
        MentionsListView listView = getListView();
        JoinCallAlert$$ExternalSyntheticLambda5 joinCallAlert$$ExternalSyntheticLambda5 = new JoinCallAlert$$ExternalSyntheticLambda5(this, delegate, 4);
        this.mentionsOnItemClickListener = joinCallAlert$$ExternalSyntheticLambda5;
        listView.setOnItemClickListener(joinCallAlert$$ExternalSyntheticLambda5);
        getListView().setOnTouchListener(new ItemOptions$$ExternalSyntheticLambda1(this, 3));
    }

    public interface Delegate {
        void addEmojiToRecent(String str);

        Paint.FontMetricsInt getFontMetrics();

        void onStickerSelected(TLRPC.TL_document tL_document, String str, Object obj);

        void replaceText(int i, int i2, CharSequence charSequence, boolean z);

        void sendBotInlineResult(TLRPC.BotInlineResult botInlineResult, boolean z, int i);

        public abstract class CC {
            public static void $default$addEmojiToRecent(Delegate delegate, String str) {
            }

            public static void $default$onStickerSelected(Delegate delegate, TLRPC.TL_document tL_document, String str, Object obj) {
            }

            public static void $default$sendBotInlineResult(Delegate delegate, TLRPC.BotInlineResult botInlineResult, boolean z, int i) {
            }
        }
    }
}
