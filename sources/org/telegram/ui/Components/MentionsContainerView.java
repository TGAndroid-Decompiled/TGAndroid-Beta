package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.BaseMenuWrapper;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Adapters.PaddedListAdapter;
import org.telegram.ui.BoostsActivity$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.ContextLinkCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda151;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.QrActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda4;

public abstract class MentionsContainerView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int $r8$clinit = 0;
    public final MentionsAdapter adapter;
    public BlurredBackgroundDrawable backgroundDrawable;
    public final BaseFragment baseFragment;
    public final AnonymousClass5 botContextProvider;
    public ArrayList botContextResults;
    public final RectF clipBounds;
    public final Path clipPath;
    public Integer color;
    public float containerBottom;
    public float containerPadding;
    public float containerTop;
    public Delegate delegate;
    public final AnonymousClass2 gridLayoutManager;
    public float hideT;
    public boolean ignoreLayout;
    public final StickersActivity.AnonymousClass2 linearLayoutManager;
    public final MentionsListView listView;
    public boolean listViewHiding;
    public float listViewPadding;
    public SpringAnimation listViewTranslationAnimator;
    public BoostsActivity$$ExternalSyntheticLambda0 mentionsOnItemClickListener;
    public final PaddedListAdapter paddedAdapter;
    public Paint paint;
    public final Rect rect;
    public final Theme.ResourcesProvider resourcesProvider;
    public int scrollRangeUpdateTries;
    public boolean scrollToFirst;
    public boolean shown;
    public boolean switchLayoutManagerOnEnd;
    public final HintView$1$$ExternalSyntheticLambda0 updateVisibilityRunnable;

    public final class AnonymousClass4 {
        public final BaseFragment val$baseFragment;

        public AnonymousClass4(BaseFragment baseFragment) {
            this.val$baseFragment = baseFragment;
        }

        public final void needChangePanelVisibility(boolean z) {
            MentionsContainerView mentionsContainerView = MentionsContainerView.this;
            if (mentionsContainerView.getNeededLayoutManager() != mentionsContainerView.getCurrentLayoutManager() && mentionsContainerView.canOpen()) {
                if (mentionsContainerView.adapter.lastItemCount > 0) {
                    mentionsContainerView.switchLayoutManagerOnEnd = true;
                    mentionsContainerView.updateVisibility(false);
                    return;
                }
                mentionsContainerView.listView.setLayoutManager(mentionsContainerView.getNeededLayoutManager());
            }
            if (z && !mentionsContainerView.canOpen()) {
                z = false;
            }
            mentionsContainerView.updateVisibility((!z || mentionsContainerView.adapter.getItemCountInternal() > 0) ? z : false);
        }

        public final void onItemCountUpdate() {
            MentionsContainerView mentionsContainerView = MentionsContainerView.this;
            if (mentionsContainerView.listView.getLayoutManager() == mentionsContainerView.gridLayoutManager || !mentionsContainerView.shown) {
                return;
            }
            HintView$1$$ExternalSyntheticLambda0 hintView$1$$ExternalSyntheticLambda0 = mentionsContainerView.updateVisibilityRunnable;
            AndroidUtilities.cancelRunOnUIThread(hintView$1$$ExternalSyntheticLambda0);
            AndroidUtilities.runOnUIThread(hintView$1$$ExternalSyntheticLambda0, this.val$baseFragment.getFragmentBeginToShow() ? 0L : 100L);
        }
    }

    public interface Delegate {
        void addEmojiToRecent(String str);

        Paint.FontMetricsInt getFontMetrics();

        void onStickerSelected(TLRPC.TL_document tL_document, String str, Object obj);

        void replaceText(int i, int i2, CharSequence charSequence, boolean z);

        void sendBotInlineResult(TLRPC.BotInlineResult botInlineResult, boolean z, int i);
    }

    public final class MentionsListView extends RecyclerListView {
        public boolean isDragging;
        public boolean isScrolling;
        public int lastHeight;
        public int lastWidth;

        public MentionsListView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            setOnScrollListener(new ChatActivity.AnonymousClass53(this, 27));
            addItemDecoration(new RecyclerView.ItemDecoration() {
                @Override
                public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    int childAdapterPosition;
                    rect.left = 0;
                    rect.right = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    MentionsListView mentionsListView = MentionsListView.this;
                    if (layoutManager != MentionsContainerView.this.gridLayoutManager || (childAdapterPosition = RecyclerView.getChildAdapterPosition(view)) == 0 || MentionsContainerView.this.adapter.isStickers()) {
                        return;
                    }
                    if (MentionsContainerView.this.adapter.getBotContextSwitch() == null && MentionsContainerView.this.adapter.searchResultBotWebViewSwitch == null) {
                        rect.top = AndroidUtilities.dp(2.0f);
                    } else {
                        if (childAdapterPosition == 0) {
                            return;
                        }
                        childAdapterPosition--;
                        AnonymousClass2 anonymousClass2 = MentionsContainerView.this.gridLayoutManager;
                        anonymousClass2.checkLayout();
                        if (childAdapterPosition > anonymousClass2.firstRowMax) {
                            rect.top = AndroidUtilities.dp(2.0f);
                        }
                    }
                    AnonymousClass2 anonymousClass3 = MentionsContainerView.this.gridLayoutManager;
                    anonymousClass3.checkLayout();
                    rect.right = anonymousClass3.itemsToRow.get(childAdapterPosition, Integer.MAX_VALUE) == Integer.MAX_VALUE ? AndroidUtilities.dp(2.0f) : 0;
                }
            });
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            boolean z;
            MentionsContainerView mentionsContainerView = MentionsContainerView.this;
            boolean z2 = mentionsContainerView.linearLayoutManager.mReverseLayout;
            PaddedListAdapter paddedListAdapter = mentionsContainerView.paddedAdapter;
            if (!z2 ? this.isDragging || paddedListAdapter == null || paddedListAdapter.paddingView == null || !paddedListAdapter.paddingViewAttached || motionEvent.getY() >= paddedListAdapter.paddingView.getBottom() : this.isDragging || paddedListAdapter == null || paddedListAdapter.paddingView == null || !paddedListAdapter.paddingViewAttached || motionEvent.getY() <= paddedListAdapter.paddingView.getTop()) {
                if (this.isScrolling) {
                    z = false;
                } else {
                    if (ContentPreviewViewer.getInstance().onInterceptTouchEvent(motionEvent, mentionsContainerView.listView, null, this.resourcesProvider)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                MentionsAdapter mentionsAdapter = mentionsContainerView.adapter;
                if (((mentionsAdapter.isStickers() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && mentionsAdapter.isStickers()) {
                    if (mentionsAdapter.mentionsStickersActionTracker == null) {
                        EmojiView.AnonymousClass29 anonymousClass29 = new EmojiView.AnonymousClass29(mentionsAdapter, mentionsAdapter.currentAccount, mentionsAdapter.dialog_id, mentionsAdapter.threadMessageId, 1);
                        mentionsAdapter.mentionsStickersActionTracker = anonymousClass29;
                        anonymousClass29.checkVisibility();
                    }
                    mentionsAdapter.mentionsStickersActionTracker.doSomeAction();
                }
                if (super.onInterceptTouchEvent(motionEvent) || z) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int top;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            MentionsContainerView mentionsContainerView = MentionsContainerView.this;
            boolean zIsReversed = mentionsContainerView.isReversed();
            LinearLayoutManager currentLayoutManager = mentionsContainerView.getCurrentLayoutManager();
            int iFindFirstVisibleItemPosition = zIsReversed ? currentLayoutManager.findFirstVisibleItemPosition() : currentLayoutManager.findLastVisibleItemPosition();
            View viewFindViewByPosition = currentLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
            if (viewFindViewByPosition != null) {
                top = viewFindViewByPosition.getTop() - (zIsReversed ? 0 : this.lastHeight - i6);
            } else {
                top = 0;
            }
            super.onLayout(z, i, i2, i3, i4);
            if (mentionsContainerView.scrollToFirst) {
                mentionsContainerView.ignoreLayout = true;
                currentLayoutManager.scrollToPositionWithOffset(0, 100000);
                super.onLayout(false, i, i2, i3, i4);
                mentionsContainerView.ignoreLayout = false;
                mentionsContainerView.scrollToFirst = false;
            } else if (iFindFirstVisibleItemPosition != -1 && i5 == this.lastWidth && i6 - this.lastHeight != 0) {
                mentionsContainerView.ignoreLayout = true;
                currentLayoutManager.scrollToPositionWithOffset(iFindFirstVisibleItemPosition, top, false);
                super.onLayout(false, i, i2, i3, i4);
                mentionsContainerView.ignoreLayout = false;
            }
            this.lastHeight = i6;
            this.lastWidth = i5;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i2);
            MentionsContainerView mentionsContainerView = MentionsContainerView.this;
            PaddedListAdapter paddedListAdapter = mentionsContainerView.paddedAdapter;
            if (paddedListAdapter != null) {
                paddedListAdapter.padding = Integer.valueOf(size);
                QrActivity.AnonymousClass2 anonymousClass2 = paddedListAdapter.paddingView;
                if (anonymousClass2 != null) {
                    anonymousClass2.requestLayout();
                }
            }
            mentionsContainerView.listViewPadding = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size + ((int) mentionsContainerView.listViewPadding), 1073741824));
        }

        @Override
        public final void onScrolled(int i, int i2) {
            MentionsContainerView mentionsContainerView = MentionsContainerView.this;
            mentionsContainerView.invalidate();
            mentionsContainerView.checkBackgroundBounds();
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            MentionsContainerView mentionsContainerView = MentionsContainerView.this;
            boolean z = mentionsContainerView.linearLayoutManager.mReverseLayout;
            PaddedListAdapter paddedListAdapter = mentionsContainerView.paddedAdapter;
            if (z) {
                if (!this.isDragging && paddedListAdapter != null && paddedListAdapter.paddingView != null && paddedListAdapter.paddingViewAttached && motionEvent.getY() > paddedListAdapter.paddingView.getTop()) {
                    return false;
                }
            } else if (!this.isDragging && paddedListAdapter != null && paddedListAdapter.paddingView != null && paddedListAdapter.paddingViewAttached && motionEvent.getY() < paddedListAdapter.paddingView.getBottom()) {
                return false;
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override
        public final void requestLayout() {
            if (MentionsContainerView.this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        @Override
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            MentionsContainerView mentionsContainerView = MentionsContainerView.this;
            mentionsContainerView.invalidate();
            mentionsContainerView.checkBackgroundBounds();
        }
    }

    public MentionsContainerView(Context context, long j, long j2, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.rect = new Rect();
        this.ignoreLayout = false;
        this.scrollToFirst = false;
        this.shown = false;
        this.updateVisibilityRunnable = new HintView$1$$ExternalSyntheticLambda0(this, 19);
        this.listViewHiding = false;
        this.hideT = 0.0f;
        this.switchLayoutManagerOnEnd = false;
        this.botContextProvider = new PhotoViewer.EmptyPhotoViewerProvider() {
            @Override
            public final PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
                ImageReceiver photoImage;
                if (i >= 0) {
                    MentionsContainerView mentionsContainerView = MentionsContainerView.this;
                    if (i < mentionsContainerView.botContextResults.size()) {
                        int childCount = mentionsContainerView.getListView().getChildCount();
                        Object obj = mentionsContainerView.botContextResults.get(i);
                        for (int i2 = 0; i2 < childCount; i2++) {
                            View childAt = mentionsContainerView.getListView().getChildAt(i2);
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
                                placeProviderObject.parentView = mentionsContainerView.getListView();
                                placeProviderObject.imageReceiver = photoImage;
                                placeProviderObject.thumb = photoImage.getBitmapSafe();
                                placeProviderObject.radius = photoImage.getRoundRadius(true);
                                return placeProviderObject;
                            }
                        }
                    }
                }
                return null;
            }

            @Override
            public final void sendButtonPressed(int i, VideoEditedInfo videoEditedInfo, boolean z, int i2, int i3, boolean z2) {
                if (i >= 0) {
                    MentionsContainerView mentionsContainerView = MentionsContainerView.this;
                    if (i >= mentionsContainerView.botContextResults.size()) {
                        return;
                    }
                    mentionsContainerView.delegate.sendBotInlineResult((TLRPC.BotInlineResult) mentionsContainerView.botContextResults.get(i), z, i2);
                }
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
        MentionsListView mentionsListView = new MentionsListView(context, resourcesProvider);
        this.listView = mentionsListView;
        StickersActivity.AnonymousClass2 anonymousClass2 = new StickersActivity.AnonymousClass2((Object) this, 5);
        this.linearLayoutManager = anonymousClass2;
        anonymousClass2.setOrientation(1);
        ?? r1 = new ExtendedGridLayoutManager() {
            public final Size size = new Size();

            @Override
            public final int getFlowItemCount() {
                MentionsContainerView mentionsContainerView = MentionsContainerView.this;
                return (mentionsContainerView.adapter.getBotContextSwitch() == null && mentionsContainerView.adapter.searchResultBotWebViewSwitch == null) ? getItemCount() : getItemCount() - 1;
            }

            @Override
            public final Size getSizeForItem(int i) {
                TLRPC.PhotoSize closestPhotoSizeWithSize;
                Size size = this.size;
                int i2 = 0;
                size.full = false;
                MentionsContainerView mentionsContainerView = MentionsContainerView.this;
                if (i == 0) {
                    size.width = this.mWidth;
                    size.height = mentionsContainerView.paddedAdapter.lastPadding;
                    size.full = true;
                    return size;
                }
                int i3 = i - 1;
                if (mentionsContainerView.adapter.getBotContextSwitch() == null && mentionsContainerView.adapter.searchResultBotWebViewSwitch == null) {
                    i = i3;
                }
                size.width = 0.0f;
                size.height = 0.0f;
                Object item = mentionsContainerView.adapter.getItem(i);
                if (item instanceof TLRPC.BotInlineResult) {
                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) item;
                    TLRPC.Document document = botInlineResult.document;
                    if (document != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                        size.width = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.w : 100.0f;
                        size.height = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.h : 100.0f;
                        while (i2 < botInlineResult.document.attributes.size()) {
                            TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i2);
                            if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                size.width = documentAttribute.w;
                                size.height = documentAttribute.h;
                                break;
                            }
                            i2++;
                        }
                    } else if (botInlineResult.content != null) {
                        while (i2 < botInlineResult.content.attributes.size()) {
                            TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i2);
                            if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                                size.width = documentAttribute2.w;
                                size.height = documentAttribute2.h;
                                break;
                            }
                            i2++;
                        }
                    } else if (botInlineResult.thumb != null) {
                        while (i2 < botInlineResult.thumb.attributes.size()) {
                            TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i2);
                            if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                                size.width = documentAttribute3.w;
                                size.height = documentAttribute3.h;
                                break;
                            }
                            i2++;
                        }
                    } else {
                        TLRPC.Photo photo = botInlineResult.photo;
                        if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                            size.width = closestPhotoSizeWithSize.w;
                            size.height = closestPhotoSizeWithSize.h;
                        }
                    }
                }
                return size;
            }
        };
        this.gridLayoutManager = r1;
        r1.mSpanSizeLookup = new BaseMenuWrapper() {
            @Override
            public final int getSpanSize(int i) {
                if (i == 0) {
                    return 100;
                }
                int i2 = i - 1;
                MentionsContainerView mentionsContainerView = MentionsContainerView.this;
                Object item = mentionsContainerView.adapter.getItem(i2);
                if (item instanceof TLRPC.TL_inlineBotSwitchPM) {
                    return 100;
                }
                if (item instanceof TLRPC.Document) {
                    return 20;
                }
                if (mentionsContainerView.adapter.getBotContextSwitch() != null || mentionsContainerView.adapter.searchResultBotWebViewSwitch != null) {
                    i = i2;
                }
                AnonymousClass2 anonymousClass3 = mentionsContainerView.gridLayoutManager;
                anonymousClass3.checkLayout();
                return anonymousClass3.itemSpans.get(i);
            }
        };
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.mAddDuration = 150L;
        defaultItemAnimator.mMoveDuration = 150L;
        defaultItemAnimator.mChangeAddDuration = 150L;
        defaultItemAnimator.mChangeRemoveDuration = 150L;
        defaultItemAnimator.mRemoveDuration = 150L;
        defaultItemAnimator.translationInterpolator = CubicBezierInterpolator.DEFAULT;
        defaultItemAnimator.delayAnimations = false;
        mentionsListView.setItemAnimator(defaultItemAnimator);
        mentionsListView.setClipToPadding(false);
        mentionsListView.setLayoutManager(anonymousClass2);
        MentionsAdapter mentionsAdapter = new MentionsAdapter(context, j, j2, new AnonymousClass4(baseFragment), resourcesProvider, isStories());
        this.adapter = mentionsAdapter;
        PaddedListAdapter paddedListAdapter = new PaddedListAdapter(mentionsAdapter);
        this.paddedAdapter = paddedListAdapter;
        mentionsListView.setAdapter(paddedListAdapter);
        mentionsListView.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(mentionsListView, LayoutHelper.createFrame(-1.0f, -1));
        setReversed(false);
    }

    public boolean canOpen() {
        return true;
    }

    public final void checkBackgroundBounds() {
        MentionsAdapter mentionsAdapter;
        MentionsListView mentionsListView = this.listView;
        if (mentionsListView == null || this.linearLayoutManager == null) {
            return;
        }
        boolean zIsReversed = isReversed();
        this.containerPadding = 0.0f;
        PaddedListAdapter paddedListAdapter = this.paddedAdapter;
        if (zIsReversed) {
            float fMin = Math.min(Math.max(0.0f, mentionsListView.getTranslationY() + (paddedListAdapter.paddingViewAttached ? paddedListAdapter.paddingView.getTop() : getHeight())) + this.containerPadding, (1.0f - this.hideT) * getHeight());
            this.containerTop = 0.0f;
            this.containerBottom = fMin;
        } else {
            this.containerTop = Math.max(Math.max(0.0f, mentionsListView.getTranslationY() + (paddedListAdapter.paddingViewAttached ? paddedListAdapter.paddingView.getBottom() : 0)) - this.containerPadding, this.hideT * getHeight());
            this.containerBottom = getMeasuredHeight();
        }
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.setBounds(0, ((int) this.containerTop) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.containerBottom));
            Path path = this.clipPath;
            path.rewind();
            RectF rectF = this.clipBounds;
            rectF.set(this.backgroundDrawable.boundProps.boundsWithPadding);
            AnonymousClass2 anonymousClass2 = this.gridLayoutManager;
            if (anonymousClass2 == null || mentionsListView.getLayoutManager() != anonymousClass2 || (mentionsAdapter = this.adapter) == null || mentionsAdapter.searchResultBotContext == null) {
                path.addRoundRect(rectF, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f), Path.Direction.CW);
            } else {
                rectF.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                path.addRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Path.Direction.CW);
            }
            path.close();
            invalidate();
        }
    }

    public final void checkListViewPadding() {
        MentionsAdapter mentionsAdapter;
        MentionsListView mentionsListView = this.listView;
        if (mentionsListView == null || this.linearLayoutManager == null) {
            return;
        }
        AnonymousClass2 anonymousClass2 = this.gridLayoutManager;
        boolean z = (anonymousClass2 == null || mentionsListView.getLayoutManager() != anonymousClass2 || (mentionsAdapter = this.adapter) == null || mentionsAdapter.searchResultBotContext == null) ? false : true;
        if (this.backgroundDrawable == null) {
            mentionsListView.setPadding(0, 0, 0, 0);
        } else {
            mentionsListView.setPadding(AndroidUtilities.dp(z ? 7.0f : 5.0f), z ? AndroidUtilities.dp(2.0f) : 0, AndroidUtilities.dp(z ? 7.0f : 5.0f), z ? AndroidUtilities.dp(2.0f) : 0);
        }
    }

    public final float clipBottom() {
        if (getVisibility() == 0 && !isReversed()) {
            return getMeasuredHeight() - this.containerTop;
        }
        return 0.0f;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.listView, (Consumer) new ChatActivity$$ExternalSyntheticLambda151(7));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
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
        MentionsAdapter mentionsAdapter = this.adapter;
        this.containerPadding = AndroidUtilities.dp(((mentionsAdapter.isStickers() || mentionsAdapter.searchResultBotContext != null) && ((mentionsAdapter.contextMedia || mentionsAdapter.stickers != null) && mentionsAdapter.getBotContextSwitch() == null && mentionsAdapter.searchResultBotWebViewSwitch == null) ? 2 : 0) + 2);
        canvas.save();
        float fDp = AndroidUtilities.dp(6.0f);
        float f = this.containerTop;
        PaddedListAdapter paddedListAdapter = this.paddedAdapter;
        MentionsListView mentionsListView = this.listView;
        Rect rect = this.rect;
        if (zIsReversed) {
            float fMin2 = Math.min(Math.max(0.0f, mentionsListView.getTranslationY() + (paddedListAdapter.paddingViewAttached ? paddedListAdapter.paddingView.getTop() : getHeight())) + this.containerPadding, (1.0f - this.hideT) * getHeight());
            this.containerTop = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.containerBottom = fMin2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) fMin2);
            fMin = Math.min(fDp, Math.abs(getMeasuredHeight() - this.containerBottom));
            if (fMin > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) fMin;
            }
        } else {
            if (mentionsListView.getLayoutManager() == this.gridLayoutManager) {
                this.containerPadding += AndroidUtilities.dp(2.0f);
                fDp += AndroidUtilities.dp(2.0f);
            }
            float fMax = Math.max(0.0f, mentionsListView.getTranslationY() + (paddedListAdapter.paddingViewAttached ? paddedListAdapter.paddingView.getBottom() : 0)) - this.containerPadding;
            this.containerTop = fMax;
            float fMax2 = Math.max(fMax, this.hideT * getHeight());
            this.containerTop = fMax2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.containerBottom = measuredHeight;
            rect.set(0, (int) fMax2, measuredWidth2, (int) measuredHeight);
            fMin = Math.min(fDp, Math.abs(this.containerTop));
            if (fMin > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) fMin;
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
        paint2.setColor(num != null ? num.intValue() : Theme.getColor(Theme.key_chat_messagePanelBackground, this.resourcesProvider));
        drawRoundRect(canvas, rect, fMin);
        canvas.clipRect(rect);
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
        StickersActivity.AnonymousClass2 anonymousClass2 = this.linearLayoutManager;
        return layoutManager == anonymousClass2 ? anonymousClass2 : this.gridLayoutManager;
    }

    public MentionsListView getListView() {
        return this.listView;
    }

    public LinearLayoutManager getNeededLayoutManager() {
        MentionsAdapter mentionsAdapter = this.adapter;
        return ((mentionsAdapter.isStickers() || mentionsAdapter.searchResultBotContext != null) && (mentionsAdapter.contextMedia || mentionsAdapter.stickers != null)) ? this.gridLayoutManager : this.linearLayoutManager;
    }

    public final boolean isReversed() {
        RecyclerView.LayoutManager layoutManager = this.listView.getLayoutManager();
        StickersActivity.AnonymousClass2 anonymousClass2 = this.linearLayoutManager;
        return layoutManager == anonymousClass2 && anonymousClass2.mReverseLayout;
    }

    public boolean isStories() {
        return this instanceof PeerStoriesView.AnonymousClass21;
    }

    public void onAnimationScroll() {
    }

    @Override
    public final void onAttachedToWindow() {
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
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        checkBackgroundBounds();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        checkListViewPadding();
        super.onMeasure(i, i2);
    }

    public void onOpen() {
    }

    public void onScrolled(boolean z) {
    }

    @Override
    public final void requestLayout() {
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
                    mentionsAdapter.notifyItemChanged(0);
                }
                if (i > 1) {
                    mentionsAdapter.notifyItemChanged(i - 1);
                }
            }
        }
    }

    public final void updateVisibility(boolean z) {
        if (z) {
            boolean zIsReversed = isReversed();
            if (!this.shown) {
                this.scrollToFirst = true;
                MentionsListView mentionsListView = this.listView;
                RecyclerView.LayoutManager layoutManager = mentionsListView.getLayoutManager();
                StickersActivity.AnonymousClass2 anonymousClass2 = this.linearLayoutManager;
                if (layoutManager == anonymousClass2) {
                    anonymousClass2.scrollToPositionWithOffset(0, zIsReversed ? -100000 : 100000, anonymousClass2.mShouldReverseLayout);
                }
                if (getVisibility() == 8) {
                    this.hideT = 1.0f;
                    mentionsListView.setTranslationY(zIsReversed ? -(this.listViewPadding + AndroidUtilities.dp(12.0f)) : mentionsListView.computeVerticalScrollOffset() + this.listViewPadding);
                }
            }
            setVisibility(0);
        } else {
            this.scrollToFirst = false;
        }
        this.shown = z;
        HintView$1$$ExternalSyntheticLambda0 hintView$1$$ExternalSyntheticLambda0 = this.updateVisibilityRunnable;
        AndroidUtilities.cancelRunOnUIThread(hintView$1$$ExternalSyntheticLambda0);
        SpringAnimation springAnimation = this.listViewTranslationAnimator;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        BaseFragment baseFragment = this.baseFragment;
        AndroidUtilities.runOnUIThread(hintView$1$$ExternalSyntheticLambda0, (baseFragment == null || !baseFragment.getFragmentBeginToShow()) ? 100L : 0L);
        if (z) {
            onOpen();
        } else {
            onClose();
        }
    }

    public final void withDelegate(Delegate delegate) {
        this.delegate = delegate;
        MentionsListView listView = getListView();
        BoostsActivity$$ExternalSyntheticLambda0 boostsActivity$$ExternalSyntheticLambda0 = new BoostsActivity$$ExternalSyntheticLambda0(9, this, delegate);
        this.mentionsOnItemClickListener = boostsActivity$$ExternalSyntheticLambda0;
        listView.setOnItemClickListener(boostsActivity$$ExternalSyntheticLambda0);
        getListView().setOnTouchListener(new TodoItemMenu$$ExternalSyntheticLambda4(this, 5));
    }
}
