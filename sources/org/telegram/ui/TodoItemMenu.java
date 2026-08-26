package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MessagePreviewView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.ScrimOptions;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Stories.LivePlayer;
import org.telegram.ui.Stories.LiveStoryPipOverlay;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.CaptionContainerView;
import org.telegram.ui.Stories.recorder.CollageLayoutButton;
import org.telegram.ui.Stories.recorder.GalleryListView;
import org.telegram.ui.Stories.recorder.LivePlayerView;
import org.telegram.ui.Stories.recorder.MultipleStoriesSelector;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.community.CommunityEditActivity;
import org.telegram.ui.web.WebActionBar;
import org.webrtc.TextureViewRenderer;

public final class TodoItemMenu extends Dialog {
    public Bitmap blurBitmap;
    public Paint blurBitmapPaint;
    public BitmapShader blurBitmapShader;
    public Matrix blurMatrix;
    public ChatMessageCell cell;
    public float clipBottom;
    public float clipTop;
    public final AnonymousClass1 containerView;
    public ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda8 dismissListener;
    public boolean dismissing;
    public boolean dismissingWithAlpha;
    public float dty1;
    public float dty2;
    public boolean hasDestTranslation;
    public boolean hasTranslation;
    public final TextView hintTextView;
    public final BlurredBackgroundDrawableViewFactory iBlur3Factory;
    public final BlurredBackgroundSourceBitmap iBlur3SourceBitmap;
    public Insets insets;
    public boolean isOut;
    public final AnonymousClass1 menuContainer;
    public MessageObject messageObject;
    public ViewGroup messageOptionsView;
    public float messageOptionsViewMaxWidth;
    public AnonymousClass9 myCell;
    public AnonymousClass7 myTaskCell;
    public ValueAnimator open2Animator;
    public ValueAnimator openAnimator;
    public float openProgress;
    public float openProgress2;
    public ReactionsContainerLayout reactionsView;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean setTaskInvisible;
    public final MessagePreviewView.TabsView tabsView;
    public int taskId;
    public ViewGroup taskOptionsView;
    public float taskOptionsViewMaxWidth;
    public float tx;
    public float ty;
    public final PollItemMenu.AnonymousClass3 viewPager;
    public final AnonymousClass1 windowView;

    public final class AnonymousClass15 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final Object this$0;
        public final boolean val$open;

        public AnonymousClass15(int i, Object obj, boolean z) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.val$open = z;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 14:
                    TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = (TwoStepVerificationSetupActivity) this.this$0;
                    AnimatorSet animatorSet = twoStepVerificationSetupActivity.buttonAnimation;
                    if (animatorSet != null && animatorSet.equals(animator)) {
                        twoStepVerificationSetupActivity.buttonAnimation = null;
                        break;
                    }
                    break;
                case 15:
                default:
                    super.onAnimationCancel(animator);
                    break;
                case 16:
                    ((CommunityEditActivity) this.this$0).avatarAnimation = null;
                    break;
            }
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            LivePlayer livePlayer;
            View viewFindViewByPosition;
            RadialProgressView radialProgressView;
            switch (this.$r8$classId) {
                case 0:
                    ((TodoItemMenu) this.this$0).openProgress2 = this.val$open ? 1.0f : 0.0f;
                    break;
                case 1:
                    PeerStoriesView.AnonymousClass10 anonymousClass10 = (PeerStoriesView.AnonymousClass10) this.this$0;
                    ChatActivity.AnonymousClass34 anonymousClass34 = anonymousClass10.listView;
                    boolean z = this.val$open;
                    anonymousClass34.setAlpha(z ? 0.0f : 1.0f);
                    anonymousClass10.shadowView.setAlpha(z ? 0.0f : 0.5f);
                    anonymousClass10.invalidate();
                    break;
                case 2:
                    LiveStoryPipOverlay liveStoryPipOverlay = (LiveStoryPipOverlay) this.this$0;
                    liveStoryPipOverlay.windowManager.removeViewImmediate(liveStoryPipOverlay.contentView);
                    LivePlayerView livePlayerView = liveStoryPipOverlay.textureView;
                    TextureViewRenderer textureViewRenderer = livePlayerView.textureView;
                    if (textureViewRenderer != null) {
                        textureViewRenderer.release();
                    }
                    livePlayerView.firstFrameRendered = false;
                    livePlayerView.setTextureVisible(false, false);
                    if (this.val$open && (livePlayer = liveStoryPipOverlay.livePlayer) != null && livePlayer != LivePlayer.recording) {
                        livePlayer.destroy();
                    }
                    liveStoryPipOverlay.livePlayer = null;
                    liveStoryPipOverlay.placeholderShown = true;
                    liveStoryPipOverlay.consumingChild = null;
                    liveStoryPipOverlay.isScrolling = false;
                    break;
                case 3:
                    StoryViewer storyViewer = (StoryViewer) this.this$0;
                    storyViewer.locker.unlock();
                    storyViewer.selfStoriesViewsOffset = this.val$open ? storyViewer.selfStoryViewsView.maxSelfStoriesViewsOffset : 0.0f;
                    PeerStoriesView currentPeerView = storyViewer.storiesViewPager.getCurrentPeerView();
                    if (currentPeerView != null) {
                        currentPeerView.invalidate();
                    }
                    storyViewer.containerView.invalidate();
                    storyViewer.swipeToViewsAnimator = null;
                    break;
                case 4:
                    boolean z2 = this.val$open;
                    float f = z2 ? 1.0f : 0.0f;
                    BotPreviewsEditContainer botPreviewsEditContainer = (BotPreviewsEditContainer) this.this$0;
                    botPreviewsEditContainer.tabsAlpha = f;
                    botPreviewsEditContainer.tabsView.setTranslationY(AndroidUtilities.dp(z2 ? 0.0f : -42.0f));
                    botPreviewsEditContainer.viewPager.setTranslationY(AndroidUtilities.dp(z2 ? 42.0f : 0.0f));
                    break;
                case 5:
                    BotPreviewsEditContainer.BotPreviewsEditLangContainer botPreviewsEditLangContainer = (BotPreviewsEditContainer.BotPreviewsEditLangContainer) this.this$0;
                    botPreviewsEditLangContainer.columnsAnimation = false;
                    boolean z3 = this.val$open;
                    if (z3) {
                        int i = botPreviewsEditLangContainer.animateToColumnsCount;
                        botPreviewsEditLangContainer.columnsCount = i;
                        botPreviewsEditLangContainer.this$0.setColumnsCount = i;
                        SharedConfig.setStoriesColumnsCount(i);
                    }
                    int itemCount = botPreviewsEditLangContainer.adapter.getItemCount();
                    if (z3) {
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
                        if (z3 && (viewFindViewByPosition = botPreviewsEditLangContainer.supportingLayoutManager.findViewByPosition(i2)) != null) {
                            botPreviewsEditLangContainer.pinchCenterOffset = viewFindViewByPosition.getTop();
                        }
                        UniversalRecyclerView.AnonymousClass6 anonymousClass6 = botPreviewsEditLangContainer.layoutManager;
                        anonymousClass6.scrollToPositionWithOffset(botPreviewsEditLangContainer.pinchCenterPosition, (-botPreviewsEditLangContainer.listView.getPaddingTop()) + botPreviewsEditLangContainer.pinchCenterOffset, anonymousClass6.mShouldReverseLayout);
                    }
                    super.onAnimationEnd(animator);
                    break;
                case 6:
                    float f2 = this.val$open ? 1.0f : 0.0f;
                    ButtonWithCounterView buttonWithCounterView = (ButtonWithCounterView) this.this$0;
                    buttonWithCounterView.loadingT = f2;
                    buttonWithCounterView.invalidate();
                    break;
                case 7:
                    CaptionContainerView captionContainerView = (CaptionContainerView) this.this$0;
                    boolean z4 = this.val$open;
                    if (!z4) {
                        captionContainerView.applyButton.setVisibility(8);
                        ChatAttachAlert.AnonymousClass36 anonymousClass36 = captionContainerView.mentionContainer;
                        if (anonymousClass36 != null) {
                            anonymousClass36.setVisibility(8);
                        }
                    }
                    if (z4) {
                        captionContainerView.editText.getEditText().setAllowDrawCursor(true);
                    }
                    captionContainerView.afterUpdateShownKeyboard(z4);
                    break;
                case 8:
                    boolean z5 = this.val$open;
                    float f3 = z5 ? 1.0f : 0.0f;
                    CollageLayoutButton.CollageLayoutListView collageLayoutListView = (CollageLayoutButton.CollageLayoutListView) this.this$0;
                    collageLayoutListView.visibleProgress = f3;
                    collageLayoutListView.listView.invalidate();
                    collageLayoutListView.listView.setVisibility(z5 ? 0 : 8);
                    break;
                case 9:
                    if (!this.val$open) {
                        ((GalleryListView) this.this$0).buttonsLayout.setVisibility(8);
                    }
                    break;
                case 10:
                    if (!this.val$open) {
                        ((MultipleStoriesSelector) this.this$0).listView.setVisibility(8);
                    }
                    break;
                case 11:
                    if (!this.val$open) {
                        PaintView paintView = (PaintView) this.this$0;
                        paintView.reactionLayout.setVisibility(8);
                        paintView.reactionLayout.reset();
                    }
                    break;
                case 12:
                    boolean z6 = this.val$open;
                    StoryPrivacyBottomSheet.Page.ButtonContainer buttonContainer = (StoryPrivacyBottomSheet.Page.ButtonContainer) this.this$0;
                    if (z6) {
                        buttonContainer.setVisibility(8);
                    }
                    buttonContainer.hideAnimator = null;
                    break;
                case 13:
                    boolean z7 = this.val$open;
                    StoryRecorder storyRecorder = (StoryRecorder) this.this$0;
                    if (!z7) {
                        storyRecorder.zoomControlView.setVisibility(8);
                    }
                    storyRecorder.zoomControlAnimation = null;
                    break;
                case 14:
                    TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = (TwoStepVerificationSetupActivity) this.this$0;
                    AnimatorSet animatorSet = twoStepVerificationSetupActivity.buttonAnimation;
                    if (animatorSet != null && animatorSet.equals(animator)) {
                        if (!this.val$open) {
                            twoStepVerificationSetupActivity.buttonTextView.setVisibility(4);
                        } else {
                            twoStepVerificationSetupActivity.descriptionText2.setVisibility(4);
                        }
                        break;
                    }
                    break;
                case 15:
                    float f4 = this.val$open ? 1.0f : 0.0f;
                    BotWebViewSheet botWebViewSheet = (BotWebViewSheet) this.this$0;
                    botWebViewSheet.openedProgress = f4;
                    botWebViewSheet.checkNavBarColor();
                    break;
                case 16:
                    CommunityEditActivity communityEditActivity = (CommunityEditActivity) this.this$0;
                    if (communityEditActivity.avatarAnimation != null && (radialProgressView = communityEditActivity.avatarProgressView) != null) {
                        if (!this.val$open) {
                            radialProgressView.setVisibility(4);
                            communityEditActivity.avatarOverlay.setVisibility(4);
                        }
                        communityEditActivity.avatarAnimation = null;
                        break;
                    }
                    break;
                case 17:
                    WebActionBar webActionBar = (WebActionBar) this.this$0;
                    boolean z8 = webActionBar.searching;
                    WebActionBar.AnonymousClass4 anonymousClass4 = webActionBar.searchEditText;
                    if (!z8) {
                        anonymousClass4.setVisibility(8);
                        anonymousClass4.setText("");
                    }
                    float f5 = this.val$open ? 1.0f : 0.0f;
                    webActionBar.searchingProgress = f5;
                    anonymousClass4.setAlpha(f5);
                    webActionBar.invalidate();
                    if (!webActionBar.searching) {
                        anonymousClass4.clearFocus();
                        AndroidUtilities.hideKeyboard(anonymousClass4);
                    } else {
                        anonymousClass4.requestFocus();
                        AndroidUtilities.showKeyboard(anonymousClass4);
                    }
                    break;
                default:
                    ArticleViewer.AnonymousClass15 anonymousClass15 = (ArticleViewer.AnonymousClass15) this.this$0;
                    boolean z9 = anonymousClass15.addressing;
                    WebActionBar.AnonymousClass4 anonymousClass5 = anonymousClass15.addressEditText;
                    if (!z9) {
                        anonymousClass5.setVisibility(8);
                    }
                    float f6 = this.val$open ? 1.0f : 0.0f;
                    anonymousClass15.addressingProgress = f6;
                    anonymousClass5.setAlpha(f6);
                    anonymousClass15.onAddressingProgress(anonymousClass15.addressingProgress);
                    anonymousClass15.menuButton.setTranslationX(AndroidUtilities.dp(56.0f) * anonymousClass15.addressingProgress);
                    anonymousClass15.forwardButton.setTranslationX(AndroidUtilities.dp(112.0f) * anonymousClass15.addressingProgress);
                    anonymousClass15.invalidate();
                    break;
            }
        }
    }

    public TodoItemMenu(Activity activity, Theme.ResourcesProvider resourcesProvider) {
        super(activity, R.style.TransparentDialog);
        this.insets = Insets.NONE;
        this.clipTop = 0.0f;
        this.clipBottom = 0.0f;
        this.taskOptionsViewMaxWidth = -1.0f;
        this.messageOptionsViewMaxWidth = -1.0f;
        final int i = 0;
        this.dismissing = false;
        this.resourcesProvider = resourcesProvider;
        ?? r1 = new FrameLayout(this, activity) {
            public final TodoItemMenu this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                ChatMessageCell chatMessageCell;
                switch (i) {
                    case 0:
                        TodoItemMenu todoItemMenu = this.this$0;
                        if (todoItemMenu.openProgress <= 0.0f || todoItemMenu.blurBitmapPaint == null) {
                            canvas2 = canvas;
                        } else {
                            todoItemMenu.blurMatrix.reset();
                            float width = getWidth() / todoItemMenu.blurBitmap.getWidth();
                            todoItemMenu.blurMatrix.postScale(width, width);
                            todoItemMenu.blurBitmapShader.setLocalMatrix(todoItemMenu.blurMatrix);
                            todoItemMenu.blurBitmapPaint.setAlpha((int) (todoItemMenu.openProgress * 255.0f));
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), todoItemMenu.blurBitmapPaint);
                        }
                        if (todoItemMenu.setTaskInvisible && (chatMessageCell = todoItemMenu.cell) != null) {
                            chatMessageCell.doNotDrawTaskId = todoItemMenu.taskId;
                            chatMessageCell.invalidate();
                            todoItemMenu.setTaskInvisible = false;
                        }
                        super.dispatchDraw(canvas2);
                        break;
                    default:
                        super.dispatchDraw(canvas);
                        break;
                }
            }

            @Override
            public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
                switch (i) {
                    case 0:
                        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                            return super.dispatchKeyEventPreIme(keyEvent);
                        }
                        this.this$0.dismiss(true);
                        return true;
                    default:
                        return super.dispatchKeyEventPreIme(keyEvent);
                }
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                switch (i) {
                    case 1:
                        TodoItemMenu todoItemMenu = this.this$0;
                        if (view != todoItemMenu.myCell && view != todoItemMenu.myTaskCell) {
                            return super.drawChild(canvas, view, j);
                        }
                        canvas.save();
                        canvas.clipRect(0.0f, AndroidUtilities.lerp(todoItemMenu.clipTop, 0.0f, todoItemMenu.openProgress), getWidth(), AndroidUtilities.lerp(todoItemMenu.clipBottom, getHeight(), todoItemMenu.openProgress));
                        boolean zDrawChild = super.drawChild(canvas, view, j);
                        canvas.restore();
                        return zDrawChild;
                    default:
                        return super.drawChild(canvas, view, j);
                }
            }

            @Override
            public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                switch (i) {
                    case 0:
                        super.onLayout(z, i2, i3, i4, i5);
                        this.this$0.setupTranslation();
                        break;
                    default:
                        super.onLayout(z, i2, i3, i4, i5);
                        break;
                }
            }

            @Override
            public void onMeasure(int i2, int i3) {
                ViewGroup viewGroup;
                ReactionsContainerLayout reactionsContainerLayout;
                float f;
                switch (i) {
                    case 2:
                        int size = View.MeasureSpec.getSize(i2);
                        int size2 = View.MeasureSpec.getSize(i3);
                        TodoItemMenu todoItemMenu = this.this$0;
                        todoItemMenu.updateTranslation();
                        for (int i4 = 0; i4 < getChildCount(); i4++) {
                            View childAt = getChildAt(i4);
                            ViewGroup viewGroup2 = todoItemMenu.messageOptionsView;
                            if (childAt == viewGroup2) {
                                float f2 = todoItemMenu.messageOptionsViewMaxWidth;
                                if (f2 > 0.0f) {
                                    viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                } else {
                                    viewGroup = todoItemMenu.taskOptionsView;
                                    if (childAt == viewGroup) {
                                        f = todoItemMenu.taskOptionsViewMaxWidth;
                                        if (f > 0.0f) {
                                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        } else {
                                            reactionsContainerLayout = todoItemMenu.reactionsView;
                                            if (childAt == reactionsContainerLayout) {
                                                childAt.measure(View.MeasureSpec.makeMeasureSpec(reactionsContainerLayout.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                            } else {
                                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                            }
                                        }
                                    } else {
                                        reactionsContainerLayout = todoItemMenu.reactionsView;
                                        if (childAt == reactionsContainerLayout) {
                                            childAt.measure(View.MeasureSpec.makeMeasureSpec(reactionsContainerLayout.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        } else {
                                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        }
                                    }
                                }
                            } else {
                                viewGroup = todoItemMenu.taskOptionsView;
                                if (childAt == viewGroup) {
                                    f = todoItemMenu.taskOptionsViewMaxWidth;
                                    if (f > 0.0f) {
                                        viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                    } else {
                                        reactionsContainerLayout = todoItemMenu.reactionsView;
                                        if (childAt == reactionsContainerLayout) {
                                            childAt.measure(View.MeasureSpec.makeMeasureSpec(reactionsContainerLayout.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        } else {
                                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        }
                                    }
                                } else {
                                    reactionsContainerLayout = todoItemMenu.reactionsView;
                                    if (childAt == reactionsContainerLayout) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(reactionsContainerLayout.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                    }
                                }
                            }
                        }
                        setMeasuredDimension(size, size2);
                        break;
                    default:
                        super.onMeasure(i2, i3);
                        break;
                }
            }

            @Override
            public void onSizeChanged(int i2, int i3, int i4, int i5) {
                switch (i) {
                    case 0:
                        super.onSizeChanged(i2, i3, i4, i5);
                        TodoItemMenu todoItemMenu = this.this$0;
                        Blur3Utils.checkBitmapSourceMatrixScale(todoItemMenu.iBlur3SourceBitmap, todoItemMenu.windowView);
                        todoItemMenu.iBlur3Factory.invalidateAllLinkedViews();
                        break;
                    default:
                        super.onSizeChanged(i2, i3, i4, i5);
                        break;
                }
            }
        };
        this.windowView = r1;
        r1.setOnClickListener(new TodoItemMenu$$ExternalSyntheticLambda13(this, i));
        BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = new BlurredBackgroundSourceBitmap();
        this.iBlur3SourceBitmap = blurredBackgroundSourceBitmap;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceBitmap);
        this.iBlur3Factory = blurredBackgroundDrawableViewFactory;
        blurredBackgroundDrawableViewFactory.viewPositionWatcher = new ViewPositionWatcher(r1);
        blurredBackgroundDrawableViewFactory.parent = r1;
        final int i2 = 1;
        ?? r2 = new FrameLayout(this, activity) {
            public final TodoItemMenu this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                ChatMessageCell chatMessageCell;
                switch (i2) {
                    case 0:
                        TodoItemMenu todoItemMenu = this.this$0;
                        if (todoItemMenu.openProgress <= 0.0f || todoItemMenu.blurBitmapPaint == null) {
                            canvas2 = canvas;
                        } else {
                            todoItemMenu.blurMatrix.reset();
                            float width = getWidth() / todoItemMenu.blurBitmap.getWidth();
                            todoItemMenu.blurMatrix.postScale(width, width);
                            todoItemMenu.blurBitmapShader.setLocalMatrix(todoItemMenu.blurMatrix);
                            todoItemMenu.blurBitmapPaint.setAlpha((int) (todoItemMenu.openProgress * 255.0f));
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), todoItemMenu.blurBitmapPaint);
                        }
                        if (todoItemMenu.setTaskInvisible && (chatMessageCell = todoItemMenu.cell) != null) {
                            chatMessageCell.doNotDrawTaskId = todoItemMenu.taskId;
                            chatMessageCell.invalidate();
                            todoItemMenu.setTaskInvisible = false;
                        }
                        super.dispatchDraw(canvas2);
                        break;
                    default:
                        super.dispatchDraw(canvas);
                        break;
                }
            }

            @Override
            public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
                switch (i2) {
                    case 0:
                        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                            return super.dispatchKeyEventPreIme(keyEvent);
                        }
                        this.this$0.dismiss(true);
                        return true;
                    default:
                        return super.dispatchKeyEventPreIme(keyEvent);
                }
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                switch (i2) {
                    case 1:
                        TodoItemMenu todoItemMenu = this.this$0;
                        if (view != todoItemMenu.myCell && view != todoItemMenu.myTaskCell) {
                            return super.drawChild(canvas, view, j);
                        }
                        canvas.save();
                        canvas.clipRect(0.0f, AndroidUtilities.lerp(todoItemMenu.clipTop, 0.0f, todoItemMenu.openProgress), getWidth(), AndroidUtilities.lerp(todoItemMenu.clipBottom, getHeight(), todoItemMenu.openProgress));
                        boolean zDrawChild = super.drawChild(canvas, view, j);
                        canvas.restore();
                        return zDrawChild;
                    default:
                        return super.drawChild(canvas, view, j);
                }
            }

            @Override
            public void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                switch (i2) {
                    case 0:
                        super.onLayout(z, i3, i4, i5, i6);
                        this.this$0.setupTranslation();
                        break;
                    default:
                        super.onLayout(z, i3, i4, i5, i6);
                        break;
                }
            }

            @Override
            public void onMeasure(int i3, int i4) {
                ViewGroup viewGroup;
                ReactionsContainerLayout reactionsContainerLayout;
                float f;
                switch (i2) {
                    case 2:
                        int size = View.MeasureSpec.getSize(i3);
                        int size2 = View.MeasureSpec.getSize(i4);
                        TodoItemMenu todoItemMenu = this.this$0;
                        todoItemMenu.updateTranslation();
                        for (int i5 = 0; i5 < getChildCount(); i5++) {
                            View childAt = getChildAt(i5);
                            ViewGroup viewGroup2 = todoItemMenu.messageOptionsView;
                            if (childAt == viewGroup2) {
                                float f2 = todoItemMenu.messageOptionsViewMaxWidth;
                                if (f2 > 0.0f) {
                                    viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                } else {
                                    viewGroup = todoItemMenu.taskOptionsView;
                                    if (childAt == viewGroup) {
                                        f = todoItemMenu.taskOptionsViewMaxWidth;
                                        if (f > 0.0f) {
                                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        } else {
                                            reactionsContainerLayout = todoItemMenu.reactionsView;
                                            if (childAt == reactionsContainerLayout) {
                                                childAt.measure(View.MeasureSpec.makeMeasureSpec(reactionsContainerLayout.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                            } else {
                                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                            }
                                        }
                                    } else {
                                        reactionsContainerLayout = todoItemMenu.reactionsView;
                                        if (childAt == reactionsContainerLayout) {
                                            childAt.measure(View.MeasureSpec.makeMeasureSpec(reactionsContainerLayout.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        } else {
                                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        }
                                    }
                                }
                            } else {
                                viewGroup = todoItemMenu.taskOptionsView;
                                if (childAt == viewGroup) {
                                    f = todoItemMenu.taskOptionsViewMaxWidth;
                                    if (f > 0.0f) {
                                        viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                    } else {
                                        reactionsContainerLayout = todoItemMenu.reactionsView;
                                        if (childAt == reactionsContainerLayout) {
                                            childAt.measure(View.MeasureSpec.makeMeasureSpec(reactionsContainerLayout.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        } else {
                                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        }
                                    }
                                } else {
                                    reactionsContainerLayout = todoItemMenu.reactionsView;
                                    if (childAt == reactionsContainerLayout) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(reactionsContainerLayout.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                    }
                                }
                            }
                        }
                        setMeasuredDimension(size, size2);
                        break;
                    default:
                        super.onMeasure(i3, i4);
                        break;
                }
            }

            @Override
            public void onSizeChanged(int i3, int i4, int i5, int i6) {
                switch (i2) {
                    case 0:
                        super.onSizeChanged(i3, i4, i5, i6);
                        TodoItemMenu todoItemMenu = this.this$0;
                        Blur3Utils.checkBitmapSourceMatrixScale(todoItemMenu.iBlur3SourceBitmap, todoItemMenu.windowView);
                        todoItemMenu.iBlur3Factory.invalidateAllLinkedViews();
                        break;
                    default:
                        super.onSizeChanged(i3, i4, i5, i6);
                        break;
                }
            }
        };
        this.containerView = r2;
        r2.setClipToPadding(false);
        r1.addView(r2, LayoutHelper.createFrame(-1, -1, 119));
        PollItemMenu.AnonymousClass3 anonymousClass3 = new PollItemMenu.AnonymousClass3(this, activity, 7);
        this.viewPager = anonymousClass3;
        anonymousClass3.setAdapter(new PollItemMenu.AnonymousClass4(this, activity, 4));
        r2.addView(anonymousClass3, LayoutHelper.createFrame(-1, -1, 119));
        final int i3 = 2;
        ?? r8 = new FrameLayout(this, activity) {
            public final TodoItemMenu this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                ChatMessageCell chatMessageCell;
                switch (i3) {
                    case 0:
                        TodoItemMenu todoItemMenu = this.this$0;
                        if (todoItemMenu.openProgress <= 0.0f || todoItemMenu.blurBitmapPaint == null) {
                            canvas2 = canvas;
                        } else {
                            todoItemMenu.blurMatrix.reset();
                            float width = getWidth() / todoItemMenu.blurBitmap.getWidth();
                            todoItemMenu.blurMatrix.postScale(width, width);
                            todoItemMenu.blurBitmapShader.setLocalMatrix(todoItemMenu.blurMatrix);
                            todoItemMenu.blurBitmapPaint.setAlpha((int) (todoItemMenu.openProgress * 255.0f));
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), todoItemMenu.blurBitmapPaint);
                        }
                        if (todoItemMenu.setTaskInvisible && (chatMessageCell = todoItemMenu.cell) != null) {
                            chatMessageCell.doNotDrawTaskId = todoItemMenu.taskId;
                            chatMessageCell.invalidate();
                            todoItemMenu.setTaskInvisible = false;
                        }
                        super.dispatchDraw(canvas2);
                        break;
                    default:
                        super.dispatchDraw(canvas);
                        break;
                }
            }

            @Override
            public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
                switch (i3) {
                    case 0:
                        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                            return super.dispatchKeyEventPreIme(keyEvent);
                        }
                        this.this$0.dismiss(true);
                        return true;
                    default:
                        return super.dispatchKeyEventPreIme(keyEvent);
                }
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                switch (i3) {
                    case 1:
                        TodoItemMenu todoItemMenu = this.this$0;
                        if (view != todoItemMenu.myCell && view != todoItemMenu.myTaskCell) {
                            return super.drawChild(canvas, view, j);
                        }
                        canvas.save();
                        canvas.clipRect(0.0f, AndroidUtilities.lerp(todoItemMenu.clipTop, 0.0f, todoItemMenu.openProgress), getWidth(), AndroidUtilities.lerp(todoItemMenu.clipBottom, getHeight(), todoItemMenu.openProgress));
                        boolean zDrawChild = super.drawChild(canvas, view, j);
                        canvas.restore();
                        return zDrawChild;
                    default:
                        return super.drawChild(canvas, view, j);
                }
            }

            @Override
            public void onLayout(boolean z, int i4, int i5, int i6, int i7) {
                switch (i3) {
                    case 0:
                        super.onLayout(z, i4, i5, i6, i7);
                        this.this$0.setupTranslation();
                        break;
                    default:
                        super.onLayout(z, i4, i5, i6, i7);
                        break;
                }
            }

            @Override
            public void onMeasure(int i4, int i5) {
                ViewGroup viewGroup;
                ReactionsContainerLayout reactionsContainerLayout;
                float f;
                switch (i3) {
                    case 2:
                        int size = View.MeasureSpec.getSize(i4);
                        int size2 = View.MeasureSpec.getSize(i5);
                        TodoItemMenu todoItemMenu = this.this$0;
                        todoItemMenu.updateTranslation();
                        for (int i6 = 0; i6 < getChildCount(); i6++) {
                            View childAt = getChildAt(i6);
                            ViewGroup viewGroup2 = todoItemMenu.messageOptionsView;
                            if (childAt == viewGroup2) {
                                float f2 = todoItemMenu.messageOptionsViewMaxWidth;
                                if (f2 > 0.0f) {
                                    viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                } else {
                                    viewGroup = todoItemMenu.taskOptionsView;
                                    if (childAt == viewGroup) {
                                        f = todoItemMenu.taskOptionsViewMaxWidth;
                                        if (f > 0.0f) {
                                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        } else {
                                            reactionsContainerLayout = todoItemMenu.reactionsView;
                                            if (childAt == reactionsContainerLayout) {
                                                childAt.measure(View.MeasureSpec.makeMeasureSpec(reactionsContainerLayout.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                            } else {
                                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                            }
                                        }
                                    } else {
                                        reactionsContainerLayout = todoItemMenu.reactionsView;
                                        if (childAt == reactionsContainerLayout) {
                                            childAt.measure(View.MeasureSpec.makeMeasureSpec(reactionsContainerLayout.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        } else {
                                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        }
                                    }
                                }
                            } else {
                                viewGroup = todoItemMenu.taskOptionsView;
                                if (childAt == viewGroup) {
                                    f = todoItemMenu.taskOptionsViewMaxWidth;
                                    if (f > 0.0f) {
                                        viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                    } else {
                                        reactionsContainerLayout = todoItemMenu.reactionsView;
                                        if (childAt == reactionsContainerLayout) {
                                            childAt.measure(View.MeasureSpec.makeMeasureSpec(reactionsContainerLayout.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        } else {
                                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                        }
                                    }
                                } else {
                                    reactionsContainerLayout = todoItemMenu.reactionsView;
                                    if (childAt == reactionsContainerLayout) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(reactionsContainerLayout.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                                    }
                                }
                            }
                        }
                        setMeasuredDimension(size, size2);
                        break;
                    default:
                        super.onMeasure(i4, i5);
                        break;
                }
            }

            @Override
            public void onSizeChanged(int i4, int i5, int i6, int i7) {
                switch (i3) {
                    case 0:
                        super.onSizeChanged(i4, i5, i6, i7);
                        TodoItemMenu todoItemMenu = this.this$0;
                        Blur3Utils.checkBitmapSourceMatrixScale(todoItemMenu.iBlur3SourceBitmap, todoItemMenu.windowView);
                        todoItemMenu.iBlur3Factory.invalidateAllLinkedViews();
                        break;
                    default:
                        super.onSizeChanged(i4, i5, i6, i7);
                        break;
                }
            }
        };
        this.menuContainer = r8;
        r2.addView(r8, LayoutHelper.createFrame(-1, -1, 119));
        MessagePreviewView.TabsView tabsView = new MessagePreviewView.TabsView(activity, resourcesProvider);
        this.tabsView = tabsView;
        String string = LocaleController.getString(R.string.TodoMenuTabTask);
        ArrayList arrayList = tabsView.tabs;
        arrayList.add(new MessagePreviewView.TabsView.Tab(0, string));
        arrayList.add(new MessagePreviewView.TabsView.Tab(1, LocaleController.getString(R.string.TodoMenuTabList)));
        r2.addView(tabsView, LayoutHelper.createFrame(-1, 66, 80));
        tabsView.setOnTabClick(new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass3, 23));
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(tabsView, null, false);
        blurredBackgroundDrawableCreate.setColorProvider(BlurredBackgroundProviderImpl.scrimMenuBackground(resourcesProvider));
        blurredBackgroundDrawableCreate.boundProps.hasPadding = true;
        blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(8.0f));
        blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(16.0f));
        tabsView.setBackground(blurredBackgroundDrawableCreate);
        TextView textView = new TextView(activity);
        this.hintTextView = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(tabsView.getColor());
        zzkg.m(R.string.TodoMenuHint, textView, 17);
        r2.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        PollItemMenu.AnonymousClass6 anonymousClass6 = new PollItemMenu.AnonymousClass6(this, 10);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(r1, anonymousClass6);
    }

    public final void animateOpenTo(TodoItemMenu$$ExternalSyntheticLambda5 todoItemMenu$$ExternalSyntheticLambda5, boolean z) {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator valueAnimator = this.openAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.open2Animator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        setupTranslation();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.openProgress, z ? 1.0f : 0.0f);
        this.openAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final TodoItemMenu f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i2) {
                    case 0:
                        TodoItemMenu todoItemMenu = this.f$0;
                        todoItemMenu.getClass();
                        todoItemMenu.openProgress = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        todoItemMenu.windowView.invalidate();
                        todoItemMenu.containerView.invalidate();
                        todoItemMenu.updateTranslation();
                        break;
                    default:
                        TodoItemMenu todoItemMenu2 = this.f$0;
                        todoItemMenu2.getClass();
                        todoItemMenu2.openProgress2 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.openAnimator.addListener(new ChatActivity.AnonymousClass63(this, z, todoItemMenu$$ExternalSyntheticLambda5, 13));
        long j = !z ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.openAnimator;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        valueAnimator3.setInterpolator(cubicBezierInterpolator);
        this.openAnimator.setDuration(j);
        this.openAnimator.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.openProgress2, z ? 1.0f : 0.0f);
        this.open2Animator = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final TodoItemMenu f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                switch (i) {
                    case 0:
                        TodoItemMenu todoItemMenu = this.f$0;
                        todoItemMenu.getClass();
                        todoItemMenu.openProgress = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                        todoItemMenu.windowView.invalidate();
                        todoItemMenu.containerView.invalidate();
                        todoItemMenu.updateTranslation();
                        break;
                    default:
                        TodoItemMenu todoItemMenu2 = this.f$0;
                        todoItemMenu2.getClass();
                        todoItemMenu2.openProgress2 = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.open2Animator.addListener(new AnonymousClass15(i2, this, z));
        this.open2Animator.setDuration((long) (j * 1.5f));
        this.open2Animator.setInterpolator(cubicBezierInterpolator);
        this.open2Animator.start();
    }

    @Override
    public final void dismiss() {
        dismiss(true);
    }

    public final void lambda$dismiss$14() {
        super.dismiss();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        AnonymousClass1 anonymousClass1 = this.windowView;
        setContentView(anonymousClass1, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = i | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        anonymousClass1.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(anonymousClass1, !Theme.currentTheme.isDark());
    }

    public final void setupTranslation() {
        if (this.hasTranslation) {
            return;
        }
        AnonymousClass1 anonymousClass1 = this.windowView;
        if (anonymousClass1.getWidth() <= 0) {
            return;
        }
        ChatMessageCell chatMessageCell = this.cell;
        if (chatMessageCell != null) {
            int[] iArr = new int[2];
            chatMessageCell.getLocationOnScreen(iArr);
            int i = iArr[0];
            Insets insets = this.insets;
            this.tx = i - insets.left;
            float f = iArr[1] - insets.top;
            this.ty = f;
            if (!this.hasDestTranslation) {
                this.hasDestTranslation = true;
                this.dty1 = f;
                if (this.messageOptionsView != null) {
                    float height = f + this.cell.getHeight() + this.messageOptionsView.getHeight();
                    int height2 = anonymousClass1.getHeight();
                    Insets insets2 = this.insets;
                    if (height > ((height2 - insets2.top) - insets2.bottom) - AndroidUtilities.dp(66.0f)) {
                        int height3 = anonymousClass1.getHeight();
                        Insets insets3 = this.insets;
                        this.dty1 = ((((height3 - insets3.top) - insets3.bottom) - AndroidUtilities.dp(66.0f)) - this.cell.getHeight()) - this.messageOptionsView.getHeight();
                    }
                }
                int todoIndex = getTodoIndex(this.taskId);
                getPollButtonTop(todoIndex);
                float pollButtonBottom = getPollButtonBottom(todoIndex);
                float f2 = this.ty;
                this.dty2 = f2;
                int i2 = (int) pollButtonBottom;
                float f3 = i2;
                float f4 = f2 + f3;
                int height4 = anonymousClass1.getHeight();
                Insets insets4 = this.insets;
                int iDp = ((height4 - insets4.top) - insets4.bottom) - AndroidUtilities.dp(78.0f);
                TextView textView = this.hintTextView;
                if (f4 > iDp - textView.getHeight()) {
                    int height5 = anonymousClass1.getHeight();
                    Insets insets5 = this.insets;
                    this.dty2 = ((((height5 - insets5.top) - insets5.bottom) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i2;
                }
                ViewGroup viewGroup = this.taskOptionsView;
                if (viewGroup != null) {
                    float height6 = this.dty2 + f3 + viewGroup.getHeight();
                    int height7 = anonymousClass1.getHeight();
                    Insets insets6 = this.insets;
                    if (height6 > (((height7 - insets6.top) - insets6.bottom) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                        int height8 = anonymousClass1.getHeight();
                        Insets insets7 = this.insets;
                        this.dty2 = (((((height8 - insets7.top) - insets7.bottom) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i2) - this.taskOptionsView.getHeight();
                    }
                }
            }
            updateTranslation();
        } else {
            this.ty = 0.0f;
            this.tx = 0.0f;
        }
        this.hasTranslation = true;
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            ScrimOptions.makeGlobalBlurBitmaps(new TodoItemMenu$$ExternalSyntheticLambda17(this, 0));
            this.setTaskInvisible = true;
            animateOpenTo(null, true);
        }
    }

    public final void updateTranslation() {
        PollItemMenu.AnonymousClass3 anonymousClass3 = this.viewPager;
        float positionAnimated = anonymousClass3.getPositionAnimated();
        float fLerp = AndroidUtilities.lerp(0, -anonymousClass3.getWidth(), positionAnimated);
        float fLerp2 = AndroidUtilities.lerp(anonymousClass3.getWidth(), 0, positionAnimated);
        if (this.hasTranslation) {
            ViewGroup viewGroup = this.messageOptionsView;
            if (viewGroup instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) viewGroup;
                float f = this.ty;
                this.dty1 = f;
                if (viewGroup != null) {
                    float height = f + this.cell.getHeight() + actionBarPopupWindowLayout.getVisibleHeight();
                    AnonymousClass1 anonymousClass1 = this.windowView;
                    int height2 = anonymousClass1.getHeight();
                    Insets insets = this.insets;
                    if (height > ((height2 - insets.top) - insets.bottom) - AndroidUtilities.dp(66.0f)) {
                        int height3 = anonymousClass1.getHeight();
                        Insets insets2 = this.insets;
                        this.dty1 = ((((height3 - insets2.top) - insets2.bottom) - AndroidUtilities.dp(66.0f)) - this.cell.getHeight()) - actionBarPopupWindowLayout.getVisibleHeight();
                    }
                }
            }
        }
        setTranslationX(AndroidUtilities.lerp(this.tx, 0.0f, this.dismissingWithAlpha ? 1.0f : this.openProgress) + fLerp2);
        setTranslationY(AndroidUtilities.lerp(this.ty, this.dty1, this.dismissingWithAlpha ? 1.0f : this.openProgress));
        ViewGroup viewGroup2 = this.messageOptionsView;
        AnonymousClass1 anonymousClass2 = this.menuContainer;
        if (viewGroup2 != null) {
            if (this.isOut) {
                viewGroup2.setTranslationX(((getPollButtonsLeft() + ((fLerp2 + 0.0f) + getLeft())) - AndroidUtilities.dp(8.0f)) - this.messageOptionsView.getLeft());
            } else {
                viewGroup2.setTranslationX((((fLerp2 + 0.0f) + (needDrawAvatar() ? AndroidUtilities.dp(48.0f) : 0)) + getLeft()) - this.messageOptionsView.getLeft());
            }
            this.messageOptionsViewMaxWidth = anonymousClass2.getMeasuredWidth() - (this.messageOptionsView.getX() - fLerp2);
            this.messageOptionsView.setTranslationY(((getY() + getHeight()) - this.messageOptionsView.getTop()) - anonymousClass2.getTop());
            this.messageOptionsView.setAlpha(this.openProgress);
            float fLerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.openProgress);
            this.messageOptionsView.setScaleX(fLerp3);
            this.messageOptionsView.setScaleY(fLerp3);
        }
        setTranslationX(AndroidUtilities.lerp(this.tx, 0.0f, this.dismissingWithAlpha ? 1.0f : this.openProgress) + fLerp);
        setTranslationY(AndroidUtilities.lerp(this.ty, this.dty2, this.dismissingWithAlpha ? 1.0f : this.openProgress));
        if (this.taskOptionsView != null) {
            int todoIndex = getTodoIndex(this.taskId);
            getPollButtonTop(todoIndex);
            float pollButtonBottom = getPollButtonBottom(todoIndex);
            if (this.isOut) {
                this.taskOptionsView.setTranslationX(((getPollButtonsLeft() + ((fLerp + 0.0f) + getLeft())) - AndroidUtilities.dp(8.0f)) - this.taskOptionsView.getLeft());
            } else {
                this.taskOptionsView.setTranslationX((((fLerp + 0.0f) + (needDrawAvatar() ? AndroidUtilities.dp(48.0f) : 0)) + getLeft()) - this.taskOptionsView.getLeft());
            }
            this.taskOptionsViewMaxWidth = anonymousClass2.getMeasuredWidth() - (this.taskOptionsView.getX() - fLerp2);
            this.taskOptionsView.setTranslationY(((getY() + ((int) pollButtonBottom)) - this.taskOptionsView.getTop()) - anonymousClass2.getTop());
            this.taskOptionsView.setAlpha(this.openProgress);
            float fLerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.openProgress);
            this.taskOptionsView.setScaleX(fLerp4);
            this.taskOptionsView.setScaleY(fLerp4);
        }
        if (this.dismissingWithAlpha) {
            setAlpha(this.openProgress);
            setAlpha(this.openProgress);
        }
        if (this.reactionsView != null) {
            float fMax = fLerp2 + Math.max(0.0f, ((getBoundsLeft() + getBoundsRight()) / 2.0f) - (this.reactionsView.getWidth() * 0.8f));
            this.reactionsView.setTranslationX(fMax);
            this.reactionsView.setTranslationY(Math.max(0.0f, ((getY() - this.reactionsView.getHeight()) + AndroidUtilities.dp(22.0f)) - anonymousClass2.getTop()));
            this.reactionsView.setAlpha(this.openProgress);
            View windowView = this.reactionsView.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(fMax);
                windowView.setAlpha(this.openProgress);
            }
        }
        TextView textView = this.hintTextView;
        textView.setTranslationX(fLerp);
        textView.setAlpha(this.openProgress);
        MessagePreviewView.TabsView tabsView = this.tabsView;
        tabsView.setSelectedTab(positionAnimated);
        tabsView.setAlpha(this.openProgress);
    }

    public final void dismiss(boolean z) {
        ChatMessageCell chatMessageCell;
        ReactionsContainerLayout reactionsContainerLayout;
        if (z && (reactionsContainerLayout = this.reactionsView) != null && reactionsContainerLayout.getReactionsWindow() != null && !this.reactionsView.getReactionsWindow().dismissed) {
            CustomEmojiReactionsWindow customEmojiReactionsWindow = this.reactionsView.reactionsWindow;
            if (customEmojiReactionsWindow != null) {
                customEmojiReactionsWindow.dismiss();
                return;
            }
            return;
        }
        if (this.dismissing) {
            return;
        }
        this.dismissing = true;
        this.hasTranslation = false;
        PollItemMenu.AnonymousClass3 anonymousClass3 = this.viewPager;
        anonymousClass3.cancelTouches();
        boolean z2 = anonymousClass3.getCurrentPosition() == 1;
        if (z && z2) {
            ChatMessageCell chatMessageCell2 = this.cell;
            if (chatMessageCell2 != null) {
                chatMessageCell2.setVisibility(4);
                this.cell.invalidate();
            }
        } else if (!z && (chatMessageCell = this.cell) != null) {
            chatMessageCell.setVisibility(0);
            ChatMessageCell chatMessageCell3 = this.cell;
            chatMessageCell3.doNotDrawTaskId = -1;
            chatMessageCell3.invalidate();
        }
        this.dismissingWithAlpha = !z;
        setupTranslation();
        animateOpenTo(new TodoItemMenu$$ExternalSyntheticLambda5(0, this, z2), false);
        invalidate();
    }
}
