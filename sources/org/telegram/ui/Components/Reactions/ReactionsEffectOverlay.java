package org.telegram.ui.Components.Reactions;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.internal.mlkit_language_id_common.zzjd;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline1;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.video.TextureRenderer$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.conference.message.GroupCallMessageCell;
import org.telegram.ui.SelectAnimatedEmojiDialog;

public final class ReactionsEffectOverlay {
    public static ReactionsEffectOverlay currentOverlay;
    public static ReactionsEffectOverlay currentShortOverlay;
    public static long lastHapticTime;
    public static int uniqPrefix;
    public float animateInProgress;
    public float animateOutProgress;
    public final int animationType;
    public final ViewGroup cell;
    public final FrameLayout container;
    public float dismissProgress;
    public boolean dismissed;
    public final AnimationView effectImageView;
    public final AnimationView emojiImageView;
    public final AnimationView emojiStaticImageView;
    public final long groupId;
    public final ReactionsContainerLayout.ReactionHolderView holderView;
    public boolean isFinished;
    public boolean isStories;
    public float lastDrawnToX;
    public float lastDrawnToY;
    public final int messageId;
    public final ReactionsEffectOverlay nextReactionOverlay;
    public final ReactionsLayoutInBubble.VisibleReaction reaction;
    public long startTime;
    public boolean started;
    public boolean useWindow;
    public boolean wasScrolled;
    public WindowManager windowManager;
    public final AnonymousClass1 windowView;
    public final int[] loc = new int[2];
    public final ArrayList avatars = new ArrayList();

    public final class AnonymousClass1 extends FrameLayout {
        public final int val$animationType;
        public final ViewGroup val$cell;
        public final ChatActivity val$chatActivity;
        public final int val$emojiSize;
        public final BaseFragment val$fragment;
        public final boolean val$fromHolder;
        public final float val$fromScale;
        public final float val$fromX;
        public final float val$fromY;
        public final boolean val$isStories;
        public final MessageObject val$messageObject;
        public final ReactionsLayoutInBubble.VisibleReaction val$visibleReaction;

        public AnonymousClass1(Context context, BaseFragment baseFragment, ViewGroup viewGroup, boolean z, MessageObject messageObject, ChatActivity chatActivity, int i, int i2, boolean z2, float f, float f2, float f3, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
            super(context);
            this.val$fragment = baseFragment;
            this.val$cell = viewGroup;
            this.val$isStories = z;
            this.val$messageObject = messageObject;
            this.val$chatActivity = chatActivity;
            this.val$emojiSize = i;
            this.val$animationType = i2;
            this.val$fromHolder = z2;
            this.val$fromScale = f;
            this.val$fromX = f2;
            this.val$fromY = f3;
            this.val$visibleReaction = visibleReaction;
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            View childAt;
            int iDp;
            float f;
            float measuredWidth;
            float measuredHeight;
            float f2;
            float interpolation;
            float interpolation2;
            float f3;
            float f4;
            int i;
            ReactionsEffectOverlay reactionsEffectOverlay;
            float f5;
            float f6;
            AnimationView animationView;
            RLottieDrawable lottieAnimation;
            int i2;
            AvatarParticle avatarParticle;
            float f7;
            float f8;
            float f9;
            float f10;
            float fM;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            ReactionsEffectOverlay reactionsEffectOverlay2;
            float f17;
            int i3;
            float f18;
            ReactionsEffectOverlay reactionsEffectOverlay3;
            int i4;
            ViewGroup viewGroup;
            ViewGroup viewGroup2;
            ViewGroup viewGroup3;
            ReactionsEffectOverlay reactionsEffectOverlay4;
            AnimationView animationView2;
            AnimationView animationView3;
            float f19;
            ReactionsLayoutInBubble.ReactionButton reactionButton;
            int paddingTop;
            ChatActivity chatActivity;
            MessageObject messageObject;
            ReactionsEffectOverlay reactionsEffectOverlay5 = ReactionsEffectOverlay.this;
            if (reactionsEffectOverlay5.dismissed) {
                float f20 = reactionsEffectOverlay5.dismissProgress;
                if (f20 != 1.0f) {
                    float f21 = f20 + 0.10666667f;
                    reactionsEffectOverlay5.dismissProgress = f21;
                    if (f21 > 1.0f) {
                        reactionsEffectOverlay5.dismissProgress = 1.0f;
                        final int i5 = 0;
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run() {
                                switch (i5) {
                                    case 0:
                                        ReactionsEffectOverlay.this.removeCurrentView();
                                        break;
                                    default:
                                        ReactionsEffectOverlay.this.removeCurrentView();
                                        break;
                                }
                            }
                        });
                    }
                }
                float f22 = ReactionsEffectOverlay.this.dismissProgress;
                if (f22 != 1.0f) {
                    setAlpha(1.0f - f22);
                    super.dispatchDraw(canvas);
                }
                invalidate();
                return;
            }
            if (!reactionsEffectOverlay5.started) {
                invalidate();
                return;
            }
            ReactionsContainerLayout.ReactionHolderView reactionHolderView = reactionsEffectOverlay5.holderView;
            if (reactionHolderView != null) {
                reactionHolderView.enterImageView.setAlpha(0.0f);
                ReactionsEffectOverlay.this.holderView.pressedBackupImageView.setAlpha(0.0f);
            }
            BaseFragment baseFragment = this.val$fragment;
            if (baseFragment instanceof ChatActivity) {
                ChatActivity chatActivity2 = (ChatActivity) baseFragment;
                int i6 = ReactionsEffectOverlay.this.messageId;
                ChatActivity.AnonymousClass21 anonymousClass21 = chatActivity2.chatListView;
                if (anonymousClass21 != null) {
                    int childCount = anonymousClass21.getChildCount();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= childCount) {
                            childAt = null;
                            break;
                        }
                        childAt = chatActivity2.chatListView.getChildAt(i7);
                        if (childAt instanceof ChatMessageCell) {
                            messageObject = ((ChatMessageCell) childAt).getMessageObject();
                        } else {
                            if (childAt instanceof ChatActionCell) {
                                messageObject = ((ChatActionCell) childAt).getMessageObject();
                            } else {
                                continue;
                            }
                            i7++;
                        }
                        if (messageObject != null && messageObject.getId() == i6) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                } else {
                    childAt = null;
                    break;
                }
            } else {
                childAt = this.val$cell;
            }
            if (this.val$isStories) {
                iDp = AndroidUtilities.dp(SharedConfig.deviceIsHigh() ? 120.0f : 50.0f);
            } else {
                MessageObject messageObject2 = this.val$messageObject;
                iDp = (messageObject2 == null || !messageObject2.shouldDrawReactionsInLayout()) ? AndroidUtilities.dp(14.0f) : AndroidUtilities.dp(20.0f);
            }
            float f23 = iDp;
            if (childAt != null) {
                childAt.getLocationInWindow(ReactionsEffectOverlay.this.loc);
                ReactionsEffectOverlay reactionsEffectOverlay6 = ReactionsEffectOverlay.this;
                int[] iArr = reactionsEffectOverlay6.loc;
                measuredWidth = iArr[0];
                measuredHeight = iArr[1];
                if (childAt instanceof ChatMessageCell) {
                    ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                    f = 0.10666667f;
                    reactionButton = chatMessageCell.reactionsLayoutInBubble.getReactionButton(reactionsEffectOverlay6.reaction);
                    if (chatMessageCell.drawPinnedBottom && !chatMessageCell.shouldDrawTimeOnMedia()) {
                        measuredHeight += AndroidUtilities.dp(2.0f);
                    }
                    paddingTop = chatMessageCell.getPaddingTop();
                } else {
                    f = 0.10666667f;
                    if (childAt instanceof ChatActionCell) {
                        reactionButton = ((ChatActionCell) childAt).reactionsLayoutInBubble.getReactionButton(reactionsEffectOverlay6.reaction);
                        paddingTop = childAt.getPaddingTop();
                    } else {
                        if (childAt instanceof GroupCallMessageCell) {
                            measuredWidth += ((GroupCallMessageCell) childAt).getReactionCenterX();
                            measuredHeight += childAt.getMeasuredHeight() / 2.0f;
                        }
                        reactionButton = null;
                    }
                    if (reactionButton != null) {
                        Rect rect = reactionButton.drawingImageRect;
                        measuredWidth += rect.left;
                        measuredHeight += rect.top;
                    }
                    chatActivity = this.val$chatActivity;
                    if (chatActivity != null) {
                        measuredHeight += chatActivity.drawingChatListViewYoffset;
                    }
                    ReactionsEffectOverlay reactionsEffectOverlay7 = ReactionsEffectOverlay.this;
                    reactionsEffectOverlay7.lastDrawnToX = measuredWidth;
                    reactionsEffectOverlay7.lastDrawnToY = measuredHeight;
                }
                measuredHeight += paddingTop;
                if (reactionButton != null) {
                    Rect rect2 = reactionButton.drawingImageRect;
                    measuredWidth += rect2.left;
                    measuredHeight += rect2.top;
                }
                chatActivity = this.val$chatActivity;
                if (chatActivity != null) {
                    measuredHeight += chatActivity.drawingChatListViewYoffset;
                }
                ReactionsEffectOverlay reactionsEffectOverlay8 = ReactionsEffectOverlay.this;
                reactionsEffectOverlay8.lastDrawnToX = measuredWidth;
                reactionsEffectOverlay8.lastDrawnToY = measuredHeight;
            } else {
                f = 0.10666667f;
                if (this.val$isStories) {
                    float f24 = f23 / 2.0f;
                    measuredWidth = (getMeasuredWidth() / 2.0f) - f24;
                    measuredHeight = (getMeasuredHeight() / 2.0f) - f24;
                } else {
                    ReactionsEffectOverlay reactionsEffectOverlay9 = ReactionsEffectOverlay.this;
                    measuredWidth = reactionsEffectOverlay9.lastDrawnToX;
                    measuredHeight = reactionsEffectOverlay9.lastDrawnToY;
                }
            }
            BaseFragment baseFragment2 = this.val$fragment;
            if (baseFragment2 != null && baseFragment2.getParentActivity() != null && this.val$fragment.getFragmentView() != null && this.val$fragment.getFragmentView().getParent() != null && this.val$fragment.getFragmentView().getVisibility() == 0 && this.val$fragment.getFragmentView() != null) {
                this.val$fragment.getFragmentView().getLocationOnScreen(ReactionsEffectOverlay.this.loc);
                setAlpha(((View) this.val$fragment.getFragmentView().getParent()).getAlpha());
            } else if (!this.val$isStories && !(childAt instanceof GroupCallMessageCell)) {
                return;
            }
            float f25 = (childAt instanceof GroupCallMessageCell ? this.val$emojiSize : this.val$emojiSize - f23) / 2.0f;
            float measuredWidth2 = measuredWidth - f25;
            float f26 = measuredHeight - f25;
            if (this.val$isStories && this.val$animationType == 0) {
                measuredWidth2 += AndroidUtilities.dp(40.0f);
            }
            if (this.val$animationType != 1 && !this.val$isStories) {
                int i8 = ReactionsEffectOverlay.this.loc[0];
                float f27 = i8;
                if (measuredWidth2 < f27) {
                    measuredWidth2 = f27;
                }
                if (this.val$emojiSize + measuredWidth2 > getMeasuredWidth() + i8) {
                    measuredWidth2 = (getMeasuredWidth() + ReactionsEffectOverlay.this.loc[0]) - this.val$emojiSize;
                }
            }
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            float interpolation3 = cubicBezierInterpolator.getInterpolation(ReactionsEffectOverlay.this.animateOutProgress);
            if (this.val$animationType == 2) {
                interpolation = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(interpolation3);
                interpolation2 = cubicBezierInterpolator.getInterpolation(interpolation3);
                f2 = 2.0f;
            } else if (this.val$fromHolder) {
                f2 = 2.0f;
                interpolation = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(ReactionsEffectOverlay.this.animateInProgress);
                interpolation2 = cubicBezierInterpolator.getInterpolation(ReactionsEffectOverlay.this.animateInProgress);
            } else {
                f2 = 2.0f;
                interpolation = ReactionsEffectOverlay.this.animateInProgress;
                interpolation2 = interpolation;
            }
            float f28 = 1.0f - interpolation;
            float f29 = (this.val$fromScale * f28) + interpolation;
            float f30 = f23 / this.val$emojiSize;
            if (this.val$animationType == 1) {
                f29 = 1.0f;
            } else {
                measuredWidth2 = (measuredWidth2 * interpolation) + (this.val$fromX * f28);
                f26 = (f26 * interpolation2) + ((1.0f - interpolation2) * this.val$fromY);
            }
            ReactionsEffectOverlay.this.effectImageView.setTranslationX(measuredWidth2);
            ReactionsEffectOverlay.this.effectImageView.setTranslationY(f26);
            float f31 = 1.0f - interpolation3;
            ReactionsEffectOverlay.this.effectImageView.setAlpha(f31);
            ReactionsEffectOverlay.this.effectImageView.setScaleX(f29);
            ReactionsEffectOverlay.this.effectImageView.setScaleY(f29);
            int i9 = this.val$animationType;
            if (i9 != 2) {
                if (interpolation3 != 0.0f) {
                    f29 = (f29 * f31) + (f30 * interpolation3);
                    measuredWidth2 = (measuredWidth2 * f31) + (measuredWidth * interpolation3);
                    f3 = f26 * f31;
                    f4 = measuredHeight * interpolation3;
                }
                if (i9 != 1) {
                    if (this.val$isStories) {
                        ReactionsEffectOverlay.this.emojiStaticImageView.setAlpha(1.0f);
                    } else {
                        AnimationView animationView4 = ReactionsEffectOverlay.this.emojiStaticImageView;
                        if (interpolation3 > 0.7f) {
                            f19 = (interpolation3 - 0.7f) / 0.3f;
                        } else {
                            f19 = 0.0f;
                        }
                        animationView4.setAlpha(f19);
                    }
                }
                if (this.val$animationType == 0 && this.val$isStories) {
                    ReactionsEffectOverlay.this.emojiImageView.setAlpha(f31);
                }
                ReactionsEffectOverlay.this.container.setTranslationX(measuredWidth2);
                ReactionsEffectOverlay.this.container.setTranslationY(f26);
                ReactionsEffectOverlay.this.container.setScaleX(f29);
                ReactionsEffectOverlay.this.container.setScaleY(f29);
                super.dispatchDraw(canvas);
                i = this.val$animationType;
                if (i != 1 || ReactionsEffectOverlay.this.emojiImageView.wasPlaying) {
                    reactionsEffectOverlay = ReactionsEffectOverlay.this;
                    f5 = reactionsEffectOverlay.animateInProgress;
                    if (f5 != 1.0f) {
                        if (this.val$fromHolder) {
                            reactionsEffectOverlay.animateInProgress = f5 + 0.045714285f;
                        } else {
                            reactionsEffectOverlay.animateInProgress = f5 + 0.07272727f;
                        }
                        if (reactionsEffectOverlay.animateInProgress > 1.0f) {
                            reactionsEffectOverlay.animateInProgress = 1.0f;
                        }
                    }
                }
                if (i != 2) {
                    reactionsEffectOverlay4 = ReactionsEffectOverlay.this;
                    if (reactionsEffectOverlay4.wasScrolled || i != 0) {
                        if (i != 1) {
                            animationView3 = reactionsEffectOverlay4.emojiImageView;
                            if (!animationView3.wasPlaying && animationView3.getImageReceiver().getLottieAnimation() != null && !ReactionsEffectOverlay.this.emojiImageView.getImageReceiver().getLottieAnimation().isRunning) {
                                f6 = 0.7f;
                            }
                            reactionsEffectOverlay2 = ReactionsEffectOverlay.this;
                            f17 = reactionsEffectOverlay2.animateOutProgress;
                            if (f17 != 1.0f) {
                                i3 = this.val$animationType;
                                if (i3 == 1) {
                                    reactionsEffectOverlay2.animateOutProgress = 1.0f;
                                } else {
                                    if (i3 == 2) {
                                        f18 = 350.0f;
                                    } else {
                                        f18 = 220.0f;
                                    }
                                    reactionsEffectOverlay2.animateOutProgress = (16.0f / f18) + f17;
                                }
                                if (reactionsEffectOverlay2.animateOutProgress > f6) {
                                    if (this.val$isStories || i3 != 2) {
                                        ReactionsEffectOverlay.startShortAnimation();
                                    } else if (!reactionsEffectOverlay2.isFinished) {
                                        reactionsEffectOverlay2.isFinished = true;
                                        try {
                                            performHapticFeedback(0);
                                        } catch (Exception unused) {
                                        }
                                        ((ViewGroup) getParent()).addView(ReactionsEffectOverlay.this.nextReactionOverlay.windowView);
                                        ReactionsEffectOverlay reactionsEffectOverlay10 = ReactionsEffectOverlay.this.nextReactionOverlay;
                                        reactionsEffectOverlay10.isStories = true;
                                        reactionsEffectOverlay10.started = true;
                                        reactionsEffectOverlay10.startTime = System.currentTimeMillis();
                                        ReactionsEffectOverlay.this.nextReactionOverlay.windowView.setTag(R.id.parent_tag, 1);
                                        animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(1000L).setDuration(150L).setListener(new ItemOptions.AnonymousClass3(this, 25));
                                    }
                                }
                                reactionsEffectOverlay3 = ReactionsEffectOverlay.this;
                                if (reactionsEffectOverlay3.animateOutProgress >= 1.0f) {
                                    i4 = this.val$animationType;
                                    if (i4 != 0 || i4 == 2) {
                                        viewGroup = this.val$cell;
                                        if (viewGroup instanceof ChatMessageCell) {
                                            ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                        } else if (viewGroup instanceof ChatActionCell) {
                                            ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                        }
                                    }
                                    ReactionsEffectOverlay.this.animateOutProgress = 1.0f;
                                    if (this.val$animationType == 1) {
                                        ReactionsEffectOverlay.currentShortOverlay = null;
                                    } else {
                                        ReactionsEffectOverlay.currentOverlay = null;
                                    }
                                    viewGroup2 = this.val$cell;
                                    if (viewGroup2 != null) {
                                        viewGroup2.invalidate();
                                        viewGroup3 = this.val$cell;
                                        if ((viewGroup3 instanceof ChatMessageCell) && ((ChatMessageCell) viewGroup3).getCurrentMessagesGroup() != null && this.val$cell.getParent() != null) {
                                            ((View) this.val$cell.getParent()).invalidate();
                                        }
                                    }
                                    if (this.val$isStories || this.val$animationType != 2) {
                                        final int i10 = 1;
                                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                                            public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                            {
                                                this.f$0 = this;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (i10) {
                                                    case 0:
                                                        ReactionsEffectOverlay.this.removeCurrentView();
                                                        break;
                                                    default:
                                                        ReactionsEffectOverlay.this.removeCurrentView();
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                        }
                        if (this.val$visibleReaction.documentId != 0) {
                            f6 = 0.7f;
                            if (System.currentTimeMillis() - ReactionsEffectOverlay.this.startTime > 2000) {
                                reactionsEffectOverlay2 = ReactionsEffectOverlay.this;
                                f17 = reactionsEffectOverlay2.animateOutProgress;
                                if (f17 != 1.0f) {
                                    i3 = this.val$animationType;
                                    if (i3 == 1) {
                                        reactionsEffectOverlay2.animateOutProgress = 1.0f;
                                    } else {
                                        if (i3 == 2) {
                                            f18 = 350.0f;
                                        } else {
                                            f18 = 220.0f;
                                        }
                                        reactionsEffectOverlay2.animateOutProgress = (16.0f / f18) + f17;
                                    }
                                    if (reactionsEffectOverlay2.animateOutProgress > f6) {
                                        if (this.val$isStories) {
                                            ReactionsEffectOverlay.startShortAnimation();
                                        } else {
                                            ReactionsEffectOverlay.startShortAnimation();
                                        }
                                    }
                                    reactionsEffectOverlay3 = ReactionsEffectOverlay.this;
                                    if (reactionsEffectOverlay3.animateOutProgress >= 1.0f) {
                                        i4 = this.val$animationType;
                                        if (i4 != 0) {
                                            viewGroup = this.val$cell;
                                            if (viewGroup instanceof ChatMessageCell) {
                                                ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                            } else if (viewGroup instanceof ChatActionCell) {
                                                ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                            }
                                        } else {
                                            viewGroup = this.val$cell;
                                            if (viewGroup instanceof ChatMessageCell) {
                                                ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                            } else if (viewGroup instanceof ChatActionCell) {
                                                ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                            }
                                        }
                                        ReactionsEffectOverlay.this.animateOutProgress = 1.0f;
                                        if (this.val$animationType == 1) {
                                            ReactionsEffectOverlay.currentShortOverlay = null;
                                        } else {
                                            ReactionsEffectOverlay.currentOverlay = null;
                                        }
                                        viewGroup2 = this.val$cell;
                                        if (viewGroup2 != null) {
                                            viewGroup2.invalidate();
                                            viewGroup3 = this.val$cell;
                                            if (viewGroup3 instanceof ChatMessageCell) {
                                                ((View) this.val$cell.getParent()).invalidate();
                                            }
                                        }
                                        if (this.val$isStories) {
                                            final int i11 = 1;
                                            AndroidUtilities.runOnUIThread(new Runnable(this) {
                                                public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                                {
                                                    this.f$0 = this;
                                                }

                                                @Override
                                                public final void run() {
                                                    switch (i11) {
                                                        case 0:
                                                            ReactionsEffectOverlay.this.removeCurrentView();
                                                            break;
                                                        default:
                                                            ReactionsEffectOverlay.this.removeCurrentView();
                                                            break;
                                                    }
                                                }
                                            });
                                        } else {
                                            final int i12 = 1;
                                            AndroidUtilities.runOnUIThread(new Runnable(this) {
                                                public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                                {
                                                    this.f$0 = this;
                                                }

                                                @Override
                                                public final void run() {
                                                    switch (i12) {
                                                        case 0:
                                                            ReactionsEffectOverlay.this.removeCurrentView();
                                                            break;
                                                        default:
                                                            ReactionsEffectOverlay.this.removeCurrentView();
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                }
                            }
                        } else {
                            f6 = 0.7f;
                        }
                        if (this.val$animationType == 1) {
                            animationView2 = ReactionsEffectOverlay.this.effectImageView;
                            if (!animationView2.wasPlaying && animationView2.getImageReceiver().getLottieAnimation() != null && !ReactionsEffectOverlay.this.effectImageView.getImageReceiver().getLottieAnimation().isRunning) {
                                reactionsEffectOverlay2 = ReactionsEffectOverlay.this;
                                f17 = reactionsEffectOverlay2.animateOutProgress;
                                if (f17 != 1.0f) {
                                    i3 = this.val$animationType;
                                    if (i3 == 1) {
                                        reactionsEffectOverlay2.animateOutProgress = 1.0f;
                                    } else {
                                        if (i3 == 2) {
                                            f18 = 350.0f;
                                        } else {
                                            f18 = 220.0f;
                                        }
                                        reactionsEffectOverlay2.animateOutProgress = (16.0f / f18) + f17;
                                    }
                                    if (reactionsEffectOverlay2.animateOutProgress > f6) {
                                        if (this.val$isStories) {
                                            ReactionsEffectOverlay.startShortAnimation();
                                        } else {
                                            ReactionsEffectOverlay.startShortAnimation();
                                        }
                                    }
                                    reactionsEffectOverlay3 = ReactionsEffectOverlay.this;
                                    if (reactionsEffectOverlay3.animateOutProgress >= 1.0f) {
                                        i4 = this.val$animationType;
                                        if (i4 != 0) {
                                            viewGroup = this.val$cell;
                                            if (viewGroup instanceof ChatMessageCell) {
                                                ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                            } else if (viewGroup instanceof ChatActionCell) {
                                                ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                            }
                                        } else {
                                            viewGroup = this.val$cell;
                                            if (viewGroup instanceof ChatMessageCell) {
                                                ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                            } else if (viewGroup instanceof ChatActionCell) {
                                                ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                            }
                                        }
                                        ReactionsEffectOverlay.this.animateOutProgress = 1.0f;
                                        if (this.val$animationType == 1) {
                                            ReactionsEffectOverlay.currentShortOverlay = null;
                                        } else {
                                            ReactionsEffectOverlay.currentOverlay = null;
                                        }
                                        viewGroup2 = this.val$cell;
                                        if (viewGroup2 != null) {
                                            viewGroup2.invalidate();
                                            viewGroup3 = this.val$cell;
                                            if (viewGroup3 instanceof ChatMessageCell) {
                                                ((View) this.val$cell.getParent()).invalidate();
                                            }
                                        }
                                        if (this.val$isStories) {
                                            final int i13 = 1;
                                            AndroidUtilities.runOnUIThread(new Runnable(this) {
                                                public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                                {
                                                    this.f$0 = this;
                                                }

                                                @Override
                                                public final void run() {
                                                    switch (i13) {
                                                        case 0:
                                                            ReactionsEffectOverlay.this.removeCurrentView();
                                                            break;
                                                        default:
                                                            ReactionsEffectOverlay.this.removeCurrentView();
                                                            break;
                                                    }
                                                }
                                            });
                                        } else {
                                            final int i14 = 1;
                                            AndroidUtilities.runOnUIThread(new Runnable(this) {
                                                public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                                {
                                                    this.f$0 = this;
                                                }

                                                @Override
                                                public final void run() {
                                                    switch (i14) {
                                                        case 0:
                                                            ReactionsEffectOverlay.this.removeCurrentView();
                                                            break;
                                                        default:
                                                            ReactionsEffectOverlay.this.removeCurrentView();
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                }
                            } else if (this.val$visibleReaction.documentId != 0 && System.currentTimeMillis() - ReactionsEffectOverlay.this.startTime > 2000) {
                                reactionsEffectOverlay2 = ReactionsEffectOverlay.this;
                                f17 = reactionsEffectOverlay2.animateOutProgress;
                                if (f17 != 1.0f) {
                                    i3 = this.val$animationType;
                                    if (i3 == 1) {
                                        reactionsEffectOverlay2.animateOutProgress = 1.0f;
                                    } else {
                                        if (i3 == 2) {
                                            f18 = 350.0f;
                                        } else {
                                            f18 = 220.0f;
                                        }
                                        reactionsEffectOverlay2.animateOutProgress = (16.0f / f18) + f17;
                                    }
                                    if (reactionsEffectOverlay2.animateOutProgress > f6) {
                                        if (this.val$isStories) {
                                            ReactionsEffectOverlay.startShortAnimation();
                                        } else {
                                            ReactionsEffectOverlay.startShortAnimation();
                                        }
                                    }
                                    reactionsEffectOverlay3 = ReactionsEffectOverlay.this;
                                    if (reactionsEffectOverlay3.animateOutProgress >= 1.0f) {
                                        i4 = this.val$animationType;
                                        if (i4 != 0) {
                                            viewGroup = this.val$cell;
                                            if (viewGroup instanceof ChatMessageCell) {
                                                ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                            } else if (viewGroup instanceof ChatActionCell) {
                                                ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                            }
                                        } else {
                                            viewGroup = this.val$cell;
                                            if (viewGroup instanceof ChatMessageCell) {
                                                ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                            } else if (viewGroup instanceof ChatActionCell) {
                                                ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                            }
                                        }
                                        ReactionsEffectOverlay.this.animateOutProgress = 1.0f;
                                        if (this.val$animationType == 1) {
                                            ReactionsEffectOverlay.currentShortOverlay = null;
                                        } else {
                                            ReactionsEffectOverlay.currentOverlay = null;
                                        }
                                        viewGroup2 = this.val$cell;
                                        if (viewGroup2 != null) {
                                            viewGroup2.invalidate();
                                            viewGroup3 = this.val$cell;
                                            if (viewGroup3 instanceof ChatMessageCell) {
                                                ((View) this.val$cell.getParent()).invalidate();
                                            }
                                        }
                                        if (this.val$isStories) {
                                            final int i15 = 1;
                                            AndroidUtilities.runOnUIThread(new Runnable(this) {
                                                public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                                {
                                                    this.f$0 = this;
                                                }

                                                @Override
                                                public final void run() {
                                                    switch (i15) {
                                                        case 0:
                                                            ReactionsEffectOverlay.this.removeCurrentView();
                                                            break;
                                                        default:
                                                            ReactionsEffectOverlay.this.removeCurrentView();
                                                            break;
                                                    }
                                                }
                                            });
                                        } else {
                                            final int i16 = 1;
                                            AndroidUtilities.runOnUIThread(new Runnable(this) {
                                                public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                                {
                                                    this.f$0 = this;
                                                }

                                                @Override
                                                public final void run() {
                                                    switch (i16) {
                                                        case 0:
                                                            ReactionsEffectOverlay.this.removeCurrentView();
                                                            break;
                                                        default:
                                                            ReactionsEffectOverlay.this.removeCurrentView();
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                }
                            }
                        } else if (this.val$visibleReaction.documentId != 0) {
                            reactionsEffectOverlay2 = ReactionsEffectOverlay.this;
                            f17 = reactionsEffectOverlay2.animateOutProgress;
                            if (f17 != 1.0f) {
                                i3 = this.val$animationType;
                                if (i3 == 1) {
                                    reactionsEffectOverlay2.animateOutProgress = 1.0f;
                                } else {
                                    if (i3 == 2) {
                                        f18 = 350.0f;
                                    } else {
                                        f18 = 220.0f;
                                    }
                                    reactionsEffectOverlay2.animateOutProgress = (16.0f / f18) + f17;
                                }
                                if (reactionsEffectOverlay2.animateOutProgress > f6) {
                                    if (this.val$isStories) {
                                        ReactionsEffectOverlay.startShortAnimation();
                                    } else {
                                        ReactionsEffectOverlay.startShortAnimation();
                                    }
                                }
                                reactionsEffectOverlay3 = ReactionsEffectOverlay.this;
                                if (reactionsEffectOverlay3.animateOutProgress >= 1.0f) {
                                    i4 = this.val$animationType;
                                    if (i4 != 0) {
                                        viewGroup = this.val$cell;
                                        if (viewGroup instanceof ChatMessageCell) {
                                            ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                        } else if (viewGroup instanceof ChatActionCell) {
                                            ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                        }
                                    } else {
                                        viewGroup = this.val$cell;
                                        if (viewGroup instanceof ChatMessageCell) {
                                            ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                        } else if (viewGroup instanceof ChatActionCell) {
                                            ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                        }
                                    }
                                    ReactionsEffectOverlay.this.animateOutProgress = 1.0f;
                                    if (this.val$animationType == 1) {
                                        ReactionsEffectOverlay.currentShortOverlay = null;
                                    } else {
                                        ReactionsEffectOverlay.currentOverlay = null;
                                    }
                                    viewGroup2 = this.val$cell;
                                    if (viewGroup2 != null) {
                                        viewGroup2.invalidate();
                                        viewGroup3 = this.val$cell;
                                        if (viewGroup3 instanceof ChatMessageCell) {
                                            ((View) this.val$cell.getParent()).invalidate();
                                        }
                                    }
                                    if (this.val$isStories) {
                                        final int i17 = 1;
                                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                                            public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                            {
                                                this.f$0 = this;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (i17) {
                                                    case 0:
                                                        ReactionsEffectOverlay.this.removeCurrentView();
                                                        break;
                                                    default:
                                                        ReactionsEffectOverlay.this.removeCurrentView();
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        final int i18 = 1;
                                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                                            public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                            {
                                                this.f$0 = this;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (i18) {
                                                    case 0:
                                                        ReactionsEffectOverlay.this.removeCurrentView();
                                                        break;
                                                    default:
                                                        ReactionsEffectOverlay.this.removeCurrentView();
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                        }
                    } else {
                        f6 = 0.7f;
                        reactionsEffectOverlay2 = ReactionsEffectOverlay.this;
                        f17 = reactionsEffectOverlay2.animateOutProgress;
                        if (f17 != 1.0f) {
                            i3 = this.val$animationType;
                            if (i3 == 1) {
                                reactionsEffectOverlay2.animateOutProgress = 1.0f;
                            } else {
                                if (i3 == 2) {
                                    f18 = 350.0f;
                                } else {
                                    f18 = 220.0f;
                                }
                                reactionsEffectOverlay2.animateOutProgress = (16.0f / f18) + f17;
                            }
                            if (reactionsEffectOverlay2.animateOutProgress > f6) {
                                if (this.val$isStories) {
                                    ReactionsEffectOverlay.startShortAnimation();
                                } else {
                                    ReactionsEffectOverlay.startShortAnimation();
                                }
                            }
                            reactionsEffectOverlay3 = ReactionsEffectOverlay.this;
                            if (reactionsEffectOverlay3.animateOutProgress >= 1.0f) {
                                i4 = this.val$animationType;
                                if (i4 != 0) {
                                    viewGroup = this.val$cell;
                                    if (viewGroup instanceof ChatMessageCell) {
                                        ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                    } else if (viewGroup instanceof ChatActionCell) {
                                        ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                    }
                                } else {
                                    viewGroup = this.val$cell;
                                    if (viewGroup instanceof ChatMessageCell) {
                                        ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                    } else if (viewGroup instanceof ChatActionCell) {
                                        ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                    }
                                }
                                ReactionsEffectOverlay.this.animateOutProgress = 1.0f;
                                if (this.val$animationType == 1) {
                                    ReactionsEffectOverlay.currentShortOverlay = null;
                                } else {
                                    ReactionsEffectOverlay.currentOverlay = null;
                                }
                                viewGroup2 = this.val$cell;
                                if (viewGroup2 != null) {
                                    viewGroup2.invalidate();
                                    viewGroup3 = this.val$cell;
                                    if (viewGroup3 instanceof ChatMessageCell) {
                                        ((View) this.val$cell.getParent()).invalidate();
                                    }
                                }
                                if (this.val$isStories) {
                                    final int i19 = 1;
                                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                                        public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                        {
                                            this.f$0 = this;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (i19) {
                                                case 0:
                                                    ReactionsEffectOverlay.this.removeCurrentView();
                                                    break;
                                                default:
                                                    ReactionsEffectOverlay.this.removeCurrentView();
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    final int i110 = 1;
                                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                                        public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                        {
                                            this.f$0 = this;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (i110) {
                                                case 0:
                                                    ReactionsEffectOverlay.this.removeCurrentView();
                                                    break;
                                                default:
                                                    ReactionsEffectOverlay.this.removeCurrentView();
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    }
                } else {
                    f6 = 0.7f;
                    reactionsEffectOverlay2 = ReactionsEffectOverlay.this;
                    f17 = reactionsEffectOverlay2.animateOutProgress;
                    if (f17 != 1.0f) {
                        i3 = this.val$animationType;
                        if (i3 == 1) {
                            reactionsEffectOverlay2.animateOutProgress = 1.0f;
                        } else {
                            if (i3 == 2) {
                                f18 = 350.0f;
                            } else {
                                f18 = 220.0f;
                            }
                            reactionsEffectOverlay2.animateOutProgress = (16.0f / f18) + f17;
                        }
                        if (reactionsEffectOverlay2.animateOutProgress > f6) {
                            if (this.val$isStories) {
                                ReactionsEffectOverlay.startShortAnimation();
                            } else {
                                ReactionsEffectOverlay.startShortAnimation();
                            }
                        }
                        reactionsEffectOverlay3 = ReactionsEffectOverlay.this;
                        if (reactionsEffectOverlay3.animateOutProgress >= 1.0f) {
                            i4 = this.val$animationType;
                            if (i4 != 0) {
                                viewGroup = this.val$cell;
                                if (viewGroup instanceof ChatMessageCell) {
                                    ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                } else if (viewGroup instanceof ChatActionCell) {
                                    ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                }
                            } else {
                                viewGroup = this.val$cell;
                                if (viewGroup instanceof ChatMessageCell) {
                                    ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                } else if (viewGroup instanceof ChatActionCell) {
                                    ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                }
                            }
                            ReactionsEffectOverlay.this.animateOutProgress = 1.0f;
                            if (this.val$animationType == 1) {
                                ReactionsEffectOverlay.currentShortOverlay = null;
                            } else {
                                ReactionsEffectOverlay.currentOverlay = null;
                            }
                            viewGroup2 = this.val$cell;
                            if (viewGroup2 != null) {
                                viewGroup2.invalidate();
                                viewGroup3 = this.val$cell;
                                if (viewGroup3 instanceof ChatMessageCell) {
                                    ((View) this.val$cell.getParent()).invalidate();
                                }
                            }
                            if (this.val$isStories) {
                                final int i111 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable(this) {
                                    public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (i111) {
                                            case 0:
                                                ReactionsEffectOverlay.this.removeCurrentView();
                                                break;
                                            default:
                                                ReactionsEffectOverlay.this.removeCurrentView();
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i112 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable(this) {
                                    public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (i112) {
                                            case 0:
                                                ReactionsEffectOverlay.this.removeCurrentView();
                                                break;
                                            default:
                                                ReactionsEffectOverlay.this.removeCurrentView();
                                                break;
                                        }
                                    }
                                });
                            }
                        }
                    }
                }
                if (!ReactionsEffectOverlay.this.avatars.isEmpty()) {
                    animationView = ReactionsEffectOverlay.this.effectImageView;
                    if (animationView.wasPlaying) {
                        lottieAnimation = animationView.getImageReceiver().getLottieAnimation();
                        i2 = 0;
                        while (i2 < ReactionsEffectOverlay.this.avatars.size()) {
                            avatarParticle = (AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2);
                            f7 = avatarParticle.progress;
                            if (lottieAnimation == null && lottieAnimation.isRunning) {
                                float duration = ReactionsEffectOverlay.this.effectImageView.getImageReceiver().getLottieAnimation().getDuration();
                                if (((int) TextureRenderer$$ExternalSyntheticOutline0.m(ReactionsEffectOverlay.this.effectImageView.getImageReceiver().getLottieAnimation().currentFrame, ReactionsEffectOverlay.this.effectImageView.getImageReceiver().getLottieAnimation().metaData[0], duration, duration)) < avatarParticle.leftTime) {
                                    f8 = avatarParticle.outProgress;
                                    if (f8 != 1.0f) {
                                        f9 = f8 + f;
                                        avatarParticle.outProgress = f9;
                                        if (f9 > 1.0f) {
                                            avatarParticle.outProgress = 1.0f;
                                            ReactionsEffectOverlay.this.avatars.remove(i2);
                                            i2--;
                                        } else {
                                            if (f7 < 0.5f) {
                                                fM = f7 / 0.5f;
                                                f10 = 1.0f;
                                            } else {
                                                f10 = 1.0f;
                                                fM = ImageReceiver$$ExternalSyntheticOutline1.m(f7, 0.5f, 0.5f, 1.0f);
                                            }
                                            float f32 = (f10 - f7) * 0.5f;
                                            float f33 = (avatarParticle.toX * f7) + f32;
                                            float f34 = ((avatarParticle.toY * f7) + f32) - (avatarParticle.jumpY * fM);
                                            float f35 = (1.0f - avatarParticle.outProgress) * avatarParticle.randomScale * f7;
                                            float scaleX = (ReactionsEffectOverlay.this.effectImageView.getScaleX() * ReactionsEffectOverlay.this.effectImageView.getWidth() * f33) + ReactionsEffectOverlay.this.effectImageView.getX();
                                            float scaleY = (ReactionsEffectOverlay.this.effectImageView.getScaleY() * ReactionsEffectOverlay.this.effectImageView.getHeight() * f34) + ReactionsEffectOverlay.this.effectImageView.getY();
                                            int iDp2 = AndroidUtilities.dp(16.0f);
                                            float f36 = iDp2;
                                            float f37 = f36 / f2;
                                            ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.setImageCoords(scaleX - f37, scaleY - f37, f36, f36);
                                            ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.setRoundRadius(iDp2 >> 1);
                                            canvas.save();
                                            canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                            canvas.scale(f35, f35, scaleX, scaleY);
                                            canvas.rotate(avatarParticle.currentRotation, scaleX, scaleY);
                                            ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.draw(canvas);
                                            canvas.restore();
                                            f11 = avatarParticle.progress;
                                            if (f11 < 1.0f) {
                                                f16 = f11 + 0.045714285f;
                                                avatarParticle.progress = f16;
                                                if (f16 > 1.0f) {
                                                    avatarParticle.progress = 1.0f;
                                                }
                                            }
                                            if (f7 >= 1.0f) {
                                                avatarParticle.globalTranslationY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(20.0f), 16.0f, 500.0f, avatarParticle.globalTranslationY);
                                            }
                                            if (avatarParticle.incrementRotation) {
                                                float f38 = avatarParticle.currentRotation;
                                                f14 = avatarParticle.randomRotation;
                                                f15 = (f14 / 250.0f) + f38;
                                                avatarParticle.currentRotation = f15;
                                                if (f15 > f14) {
                                                    avatarParticle.incrementRotation = false;
                                                }
                                            } else {
                                                float f39 = avatarParticle.currentRotation;
                                                f12 = avatarParticle.randomRotation;
                                                f13 = f39 - (f12 / 250.0f);
                                                avatarParticle.currentRotation = f13;
                                                if (f13 < (-f12)) {
                                                    avatarParticle.incrementRotation = true;
                                                }
                                            }
                                        }
                                    } else {
                                        if (f7 < 0.5f) {
                                            fM = f7 / 0.5f;
                                            f10 = 1.0f;
                                        } else {
                                            f10 = 1.0f;
                                            fM = ImageReceiver$$ExternalSyntheticOutline1.m(f7, 0.5f, 0.5f, 1.0f);
                                        }
                                        float f310 = (f10 - f7) * 0.5f;
                                        float f311 = (avatarParticle.toX * f7) + f310;
                                        float f312 = ((avatarParticle.toY * f7) + f310) - (avatarParticle.jumpY * fM);
                                        float f313 = (1.0f - avatarParticle.outProgress) * avatarParticle.randomScale * f7;
                                        float scaleX2 = (ReactionsEffectOverlay.this.effectImageView.getScaleX() * ReactionsEffectOverlay.this.effectImageView.getWidth() * f311) + ReactionsEffectOverlay.this.effectImageView.getX();
                                        float scaleY2 = (ReactionsEffectOverlay.this.effectImageView.getScaleY() * ReactionsEffectOverlay.this.effectImageView.getHeight() * f312) + ReactionsEffectOverlay.this.effectImageView.getY();
                                        int iDp3 = AndroidUtilities.dp(16.0f);
                                        float f314 = iDp3;
                                        float f315 = f314 / f2;
                                        ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.setImageCoords(scaleX2 - f315, scaleY2 - f315, f314, f314);
                                        ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.setRoundRadius(iDp3 >> 1);
                                        canvas.save();
                                        canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                        canvas.scale(f313, f313, scaleX2, scaleY2);
                                        canvas.rotate(avatarParticle.currentRotation, scaleX2, scaleY2);
                                        ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.draw(canvas);
                                        canvas.restore();
                                        f11 = avatarParticle.progress;
                                        if (f11 < 1.0f) {
                                            f16 = f11 + 0.045714285f;
                                            avatarParticle.progress = f16;
                                            if (f16 > 1.0f) {
                                                avatarParticle.progress = 1.0f;
                                            }
                                        }
                                        if (f7 >= 1.0f) {
                                            avatarParticle.globalTranslationY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(20.0f), 16.0f, 500.0f, avatarParticle.globalTranslationY);
                                        }
                                        if (avatarParticle.incrementRotation) {
                                            float f316 = avatarParticle.currentRotation;
                                            f14 = avatarParticle.randomRotation;
                                            f15 = (f14 / 250.0f) + f316;
                                            avatarParticle.currentRotation = f15;
                                            if (f15 > f14) {
                                                avatarParticle.incrementRotation = false;
                                            }
                                        } else {
                                            float f317 = avatarParticle.currentRotation;
                                            f12 = avatarParticle.randomRotation;
                                            f13 = f317 - (f12 / 250.0f);
                                            avatarParticle.currentRotation = f13;
                                            if (f13 < (-f12)) {
                                                avatarParticle.incrementRotation = true;
                                            }
                                        }
                                    }
                                } else {
                                    if (f7 < 0.5f) {
                                        fM = f7 / 0.5f;
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 1.0f;
                                        fM = ImageReceiver$$ExternalSyntheticOutline1.m(f7, 0.5f, 0.5f, 1.0f);
                                    }
                                    float f318 = (f10 - f7) * 0.5f;
                                    float f319 = (avatarParticle.toX * f7) + f318;
                                    float f3110 = ((avatarParticle.toY * f7) + f318) - (avatarParticle.jumpY * fM);
                                    float f3111 = (1.0f - avatarParticle.outProgress) * avatarParticle.randomScale * f7;
                                    float scaleX3 = (ReactionsEffectOverlay.this.effectImageView.getScaleX() * ReactionsEffectOverlay.this.effectImageView.getWidth() * f319) + ReactionsEffectOverlay.this.effectImageView.getX();
                                    float scaleY3 = (ReactionsEffectOverlay.this.effectImageView.getScaleY() * ReactionsEffectOverlay.this.effectImageView.getHeight() * f3110) + ReactionsEffectOverlay.this.effectImageView.getY();
                                    int iDp4 = AndroidUtilities.dp(16.0f);
                                    float f3112 = iDp4;
                                    float f3113 = f3112 / f2;
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.setImageCoords(scaleX3 - f3113, scaleY3 - f3113, f3112, f3112);
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.setRoundRadius(iDp4 >> 1);
                                    canvas.save();
                                    canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                    canvas.scale(f3111, f3111, scaleX3, scaleY3);
                                    canvas.rotate(avatarParticle.currentRotation, scaleX3, scaleY3);
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.draw(canvas);
                                    canvas.restore();
                                    f11 = avatarParticle.progress;
                                    if (f11 < 1.0f) {
                                        f16 = f11 + 0.045714285f;
                                        avatarParticle.progress = f16;
                                        if (f16 > 1.0f) {
                                            avatarParticle.progress = 1.0f;
                                        }
                                    }
                                    if (f7 >= 1.0f) {
                                        avatarParticle.globalTranslationY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(20.0f), 16.0f, 500.0f, avatarParticle.globalTranslationY);
                                    }
                                    if (avatarParticle.incrementRotation) {
                                        float f3114 = avatarParticle.currentRotation;
                                        f14 = avatarParticle.randomRotation;
                                        f15 = (f14 / 250.0f) + f3114;
                                        avatarParticle.currentRotation = f15;
                                        if (f15 > f14) {
                                            avatarParticle.incrementRotation = false;
                                        }
                                    } else {
                                        float f3115 = avatarParticle.currentRotation;
                                        f12 = avatarParticle.randomRotation;
                                        f13 = f3115 - (f12 / 250.0f);
                                        avatarParticle.currentRotation = f13;
                                        if (f13 < (-f12)) {
                                            avatarParticle.incrementRotation = true;
                                        }
                                    }
                                }
                            } else {
                                f8 = avatarParticle.outProgress;
                                if (f8 != 1.0f) {
                                    f9 = f8 + f;
                                    avatarParticle.outProgress = f9;
                                    if (f9 > 1.0f) {
                                        avatarParticle.outProgress = 1.0f;
                                        ReactionsEffectOverlay.this.avatars.remove(i2);
                                        i2--;
                                    } else {
                                        if (f7 < 0.5f) {
                                            fM = f7 / 0.5f;
                                            f10 = 1.0f;
                                        } else {
                                            f10 = 1.0f;
                                            fM = ImageReceiver$$ExternalSyntheticOutline1.m(f7, 0.5f, 0.5f, 1.0f);
                                        }
                                        float f3116 = (f10 - f7) * 0.5f;
                                        float f3117 = (avatarParticle.toX * f7) + f3116;
                                        float f3118 = ((avatarParticle.toY * f7) + f3116) - (avatarParticle.jumpY * fM);
                                        float f3119 = (1.0f - avatarParticle.outProgress) * avatarParticle.randomScale * f7;
                                        float scaleX4 = (ReactionsEffectOverlay.this.effectImageView.getScaleX() * ReactionsEffectOverlay.this.effectImageView.getWidth() * f3117) + ReactionsEffectOverlay.this.effectImageView.getX();
                                        float scaleY4 = (ReactionsEffectOverlay.this.effectImageView.getScaleY() * ReactionsEffectOverlay.this.effectImageView.getHeight() * f3118) + ReactionsEffectOverlay.this.effectImageView.getY();
                                        int iDp5 = AndroidUtilities.dp(16.0f);
                                        float f31110 = iDp5;
                                        float f31111 = f31110 / f2;
                                        ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.setImageCoords(scaleX4 - f31111, scaleY4 - f31111, f31110, f31110);
                                        ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.setRoundRadius(iDp5 >> 1);
                                        canvas.save();
                                        canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                        canvas.scale(f3119, f3119, scaleX4, scaleY4);
                                        canvas.rotate(avatarParticle.currentRotation, scaleX4, scaleY4);
                                        ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.draw(canvas);
                                        canvas.restore();
                                        f11 = avatarParticle.progress;
                                        if (f11 < 1.0f) {
                                            f16 = f11 + 0.045714285f;
                                            avatarParticle.progress = f16;
                                            if (f16 > 1.0f) {
                                                avatarParticle.progress = 1.0f;
                                            }
                                        }
                                        if (f7 >= 1.0f) {
                                            avatarParticle.globalTranslationY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(20.0f), 16.0f, 500.0f, avatarParticle.globalTranslationY);
                                        }
                                        if (avatarParticle.incrementRotation) {
                                            float f31112 = avatarParticle.currentRotation;
                                            f14 = avatarParticle.randomRotation;
                                            f15 = (f14 / 250.0f) + f31112;
                                            avatarParticle.currentRotation = f15;
                                            if (f15 > f14) {
                                                avatarParticle.incrementRotation = false;
                                            }
                                        } else {
                                            float f31113 = avatarParticle.currentRotation;
                                            f12 = avatarParticle.randomRotation;
                                            f13 = f31113 - (f12 / 250.0f);
                                            avatarParticle.currentRotation = f13;
                                            if (f13 < (-f12)) {
                                                avatarParticle.incrementRotation = true;
                                            }
                                        }
                                    }
                                } else {
                                    if (f7 < 0.5f) {
                                        fM = f7 / 0.5f;
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 1.0f;
                                        fM = ImageReceiver$$ExternalSyntheticOutline1.m(f7, 0.5f, 0.5f, 1.0f);
                                    }
                                    float f31114 = (f10 - f7) * 0.5f;
                                    float f31115 = (avatarParticle.toX * f7) + f31114;
                                    float f31116 = ((avatarParticle.toY * f7) + f31114) - (avatarParticle.jumpY * fM);
                                    float f31117 = (1.0f - avatarParticle.outProgress) * avatarParticle.randomScale * f7;
                                    float scaleX5 = (ReactionsEffectOverlay.this.effectImageView.getScaleX() * ReactionsEffectOverlay.this.effectImageView.getWidth() * f31115) + ReactionsEffectOverlay.this.effectImageView.getX();
                                    float scaleY5 = (ReactionsEffectOverlay.this.effectImageView.getScaleY() * ReactionsEffectOverlay.this.effectImageView.getHeight() * f31116) + ReactionsEffectOverlay.this.effectImageView.getY();
                                    int iDp6 = AndroidUtilities.dp(16.0f);
                                    float f31118 = iDp6;
                                    float f31119 = f31118 / f2;
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.setImageCoords(scaleX5 - f31119, scaleY5 - f31119, f31118, f31118);
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.setRoundRadius(iDp6 >> 1);
                                    canvas.save();
                                    canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                    canvas.scale(f31117, f31117, scaleX5, scaleY5);
                                    canvas.rotate(avatarParticle.currentRotation, scaleX5, scaleY5);
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.draw(canvas);
                                    canvas.restore();
                                    f11 = avatarParticle.progress;
                                    if (f11 < 1.0f) {
                                        f16 = f11 + 0.045714285f;
                                        avatarParticle.progress = f16;
                                        if (f16 > 1.0f) {
                                            avatarParticle.progress = 1.0f;
                                        }
                                    }
                                    if (f7 >= 1.0f) {
                                        avatarParticle.globalTranslationY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(20.0f), 16.0f, 500.0f, avatarParticle.globalTranslationY);
                                    }
                                    if (avatarParticle.incrementRotation) {
                                        float f311110 = avatarParticle.currentRotation;
                                        f14 = avatarParticle.randomRotation;
                                        f15 = (f14 / 250.0f) + f311110;
                                        avatarParticle.currentRotation = f15;
                                        if (f15 > f14) {
                                            avatarParticle.incrementRotation = false;
                                        }
                                    } else {
                                        float f311111 = avatarParticle.currentRotation;
                                        f12 = avatarParticle.randomRotation;
                                        f13 = f311111 - (f12 / 250.0f);
                                        avatarParticle.currentRotation = f13;
                                        if (f13 < (-f12)) {
                                            avatarParticle.incrementRotation = true;
                                        }
                                    }
                                }
                            }
                            i2++;
                        }
                    }
                }
                invalidate();
            }
            f29 = (this.val$fromScale * f28) + (f30 * interpolation);
            measuredWidth2 = (measuredWidth * interpolation) + (this.val$fromX * f28);
            f3 = (1.0f - interpolation2) * this.val$fromY;
            f4 = measuredHeight * interpolation2;
            f26 = f3 + f4;
            if (i9 != 1) {
                if (this.val$isStories) {
                    AnimationView animationView5 = ReactionsEffectOverlay.this.emojiStaticImageView;
                    if (interpolation3 > 0.7f) {
                        f19 = (interpolation3 - 0.7f) / 0.3f;
                    } else {
                        f19 = 0.0f;
                    }
                    animationView5.setAlpha(f19);
                } else {
                    ReactionsEffectOverlay.this.emojiStaticImageView.setAlpha(1.0f);
                }
            }
            if (this.val$animationType == 0) {
                ReactionsEffectOverlay.this.emojiImageView.setAlpha(f31);
            }
            ReactionsEffectOverlay.this.container.setTranslationX(measuredWidth2);
            ReactionsEffectOverlay.this.container.setTranslationY(f26);
            ReactionsEffectOverlay.this.container.setScaleX(f29);
            ReactionsEffectOverlay.this.container.setScaleY(f29);
            super.dispatchDraw(canvas);
            i = this.val$animationType;
            if (i != 1) {
                reactionsEffectOverlay = ReactionsEffectOverlay.this;
                f5 = reactionsEffectOverlay.animateInProgress;
                if (f5 != 1.0f) {
                    if (this.val$fromHolder) {
                        reactionsEffectOverlay.animateInProgress = f5 + 0.045714285f;
                    } else {
                        reactionsEffectOverlay.animateInProgress = f5 + 0.07272727f;
                    }
                    if (reactionsEffectOverlay.animateInProgress > 1.0f) {
                        reactionsEffectOverlay.animateInProgress = 1.0f;
                    }
                }
            } else {
                reactionsEffectOverlay = ReactionsEffectOverlay.this;
                f5 = reactionsEffectOverlay.animateInProgress;
                if (f5 != 1.0f) {
                    if (this.val$fromHolder) {
                        reactionsEffectOverlay.animateInProgress = f5 + 0.045714285f;
                    } else {
                        reactionsEffectOverlay.animateInProgress = f5 + 0.07272727f;
                    }
                    if (reactionsEffectOverlay.animateInProgress > 1.0f) {
                        reactionsEffectOverlay.animateInProgress = 1.0f;
                    }
                }
            }
            if (i != 2) {
                reactionsEffectOverlay4 = ReactionsEffectOverlay.this;
                if (reactionsEffectOverlay4.wasScrolled) {
                    if (i != 1) {
                        animationView3 = reactionsEffectOverlay4.emojiImageView;
                        if (!animationView3.wasPlaying) {
                        }
                    }
                    if (this.val$visibleReaction.documentId != 0) {
                        f6 = 0.7f;
                        if (System.currentTimeMillis() - ReactionsEffectOverlay.this.startTime > 2000) {
                            reactionsEffectOverlay2 = ReactionsEffectOverlay.this;
                            f17 = reactionsEffectOverlay2.animateOutProgress;
                            if (f17 != 1.0f) {
                                i3 = this.val$animationType;
                                if (i3 == 1) {
                                    reactionsEffectOverlay2.animateOutProgress = 1.0f;
                                } else {
                                    if (i3 == 2) {
                                        f18 = 350.0f;
                                    } else {
                                        f18 = 220.0f;
                                    }
                                    reactionsEffectOverlay2.animateOutProgress = (16.0f / f18) + f17;
                                }
                                if (reactionsEffectOverlay2.animateOutProgress > f6) {
                                    if (this.val$isStories) {
                                        ReactionsEffectOverlay.startShortAnimation();
                                    } else {
                                        ReactionsEffectOverlay.startShortAnimation();
                                    }
                                }
                                reactionsEffectOverlay3 = ReactionsEffectOverlay.this;
                                if (reactionsEffectOverlay3.animateOutProgress >= 1.0f) {
                                    i4 = this.val$animationType;
                                    if (i4 != 0) {
                                        viewGroup = this.val$cell;
                                        if (viewGroup instanceof ChatMessageCell) {
                                            ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                        } else if (viewGroup instanceof ChatActionCell) {
                                            ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                        }
                                    } else {
                                        viewGroup = this.val$cell;
                                        if (viewGroup instanceof ChatMessageCell) {
                                            ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                        } else if (viewGroup instanceof ChatActionCell) {
                                            ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                        }
                                    }
                                    ReactionsEffectOverlay.this.animateOutProgress = 1.0f;
                                    if (this.val$animationType == 1) {
                                        ReactionsEffectOverlay.currentShortOverlay = null;
                                    } else {
                                        ReactionsEffectOverlay.currentOverlay = null;
                                    }
                                    viewGroup2 = this.val$cell;
                                    if (viewGroup2 != null) {
                                        viewGroup2.invalidate();
                                        viewGroup3 = this.val$cell;
                                        if (viewGroup3 instanceof ChatMessageCell) {
                                            ((View) this.val$cell.getParent()).invalidate();
                                        }
                                    }
                                    if (this.val$isStories) {
                                        final int i113 = 1;
                                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                                            public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                            {
                                                this.f$0 = this;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (i113) {
                                                    case 0:
                                                        ReactionsEffectOverlay.this.removeCurrentView();
                                                        break;
                                                    default:
                                                        ReactionsEffectOverlay.this.removeCurrentView();
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        final int i114 = 1;
                                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                                            public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                            {
                                                this.f$0 = this;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (i114) {
                                                    case 0:
                                                        ReactionsEffectOverlay.this.removeCurrentView();
                                                        break;
                                                    default:
                                                        ReactionsEffectOverlay.this.removeCurrentView();
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                        }
                    } else {
                        f6 = 0.7f;
                    }
                    if (this.val$animationType == 1) {
                        animationView2 = ReactionsEffectOverlay.this.effectImageView;
                        if (!animationView2.wasPlaying) {
                            if (this.val$visibleReaction.documentId != 0) {
                                reactionsEffectOverlay2 = ReactionsEffectOverlay.this;
                                f17 = reactionsEffectOverlay2.animateOutProgress;
                                if (f17 != 1.0f) {
                                    i3 = this.val$animationType;
                                    if (i3 == 1) {
                                        reactionsEffectOverlay2.animateOutProgress = 1.0f;
                                    } else {
                                        if (i3 == 2) {
                                            f18 = 350.0f;
                                        } else {
                                            f18 = 220.0f;
                                        }
                                        reactionsEffectOverlay2.animateOutProgress = (16.0f / f18) + f17;
                                    }
                                    if (reactionsEffectOverlay2.animateOutProgress > f6) {
                                        if (this.val$isStories) {
                                            ReactionsEffectOverlay.startShortAnimation();
                                        } else {
                                            ReactionsEffectOverlay.startShortAnimation();
                                        }
                                    }
                                    reactionsEffectOverlay3 = ReactionsEffectOverlay.this;
                                    if (reactionsEffectOverlay3.animateOutProgress >= 1.0f) {
                                        i4 = this.val$animationType;
                                        if (i4 != 0) {
                                            viewGroup = this.val$cell;
                                            if (viewGroup instanceof ChatMessageCell) {
                                                ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                            } else if (viewGroup instanceof ChatActionCell) {
                                                ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                            }
                                        } else {
                                            viewGroup = this.val$cell;
                                            if (viewGroup instanceof ChatMessageCell) {
                                                ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                            } else if (viewGroup instanceof ChatActionCell) {
                                                ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                            }
                                        }
                                        ReactionsEffectOverlay.this.animateOutProgress = 1.0f;
                                        if (this.val$animationType == 1) {
                                            ReactionsEffectOverlay.currentShortOverlay = null;
                                        } else {
                                            ReactionsEffectOverlay.currentOverlay = null;
                                        }
                                        viewGroup2 = this.val$cell;
                                        if (viewGroup2 != null) {
                                            viewGroup2.invalidate();
                                            viewGroup3 = this.val$cell;
                                            if (viewGroup3 instanceof ChatMessageCell) {
                                                ((View) this.val$cell.getParent()).invalidate();
                                            }
                                        }
                                        if (this.val$isStories) {
                                            final int i115 = 1;
                                            AndroidUtilities.runOnUIThread(new Runnable(this) {
                                                public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                                {
                                                    this.f$0 = this;
                                                }

                                                @Override
                                                public final void run() {
                                                    switch (i115) {
                                                        case 0:
                                                            ReactionsEffectOverlay.this.removeCurrentView();
                                                            break;
                                                        default:
                                                            ReactionsEffectOverlay.this.removeCurrentView();
                                                            break;
                                                    }
                                                }
                                            });
                                        } else {
                                            final int i116 = 1;
                                            AndroidUtilities.runOnUIThread(new Runnable(this) {
                                                public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                                {
                                                    this.f$0 = this;
                                                }

                                                @Override
                                                public final void run() {
                                                    switch (i116) {
                                                        case 0:
                                                            ReactionsEffectOverlay.this.removeCurrentView();
                                                            break;
                                                        default:
                                                            ReactionsEffectOverlay.this.removeCurrentView();
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                }
                            }
                        } else if (this.val$visibleReaction.documentId != 0) {
                            reactionsEffectOverlay2 = ReactionsEffectOverlay.this;
                            f17 = reactionsEffectOverlay2.animateOutProgress;
                            if (f17 != 1.0f) {
                                i3 = this.val$animationType;
                                if (i3 == 1) {
                                    reactionsEffectOverlay2.animateOutProgress = 1.0f;
                                } else {
                                    if (i3 == 2) {
                                        f18 = 350.0f;
                                    } else {
                                        f18 = 220.0f;
                                    }
                                    reactionsEffectOverlay2.animateOutProgress = (16.0f / f18) + f17;
                                }
                                if (reactionsEffectOverlay2.animateOutProgress > f6) {
                                    if (this.val$isStories) {
                                        ReactionsEffectOverlay.startShortAnimation();
                                    } else {
                                        ReactionsEffectOverlay.startShortAnimation();
                                    }
                                }
                                reactionsEffectOverlay3 = ReactionsEffectOverlay.this;
                                if (reactionsEffectOverlay3.animateOutProgress >= 1.0f) {
                                    i4 = this.val$animationType;
                                    if (i4 != 0) {
                                        viewGroup = this.val$cell;
                                        if (viewGroup instanceof ChatMessageCell) {
                                            ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                        } else if (viewGroup instanceof ChatActionCell) {
                                            ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                        }
                                    } else {
                                        viewGroup = this.val$cell;
                                        if (viewGroup instanceof ChatMessageCell) {
                                            ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                        } else if (viewGroup instanceof ChatActionCell) {
                                            ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                        }
                                    }
                                    ReactionsEffectOverlay.this.animateOutProgress = 1.0f;
                                    if (this.val$animationType == 1) {
                                        ReactionsEffectOverlay.currentShortOverlay = null;
                                    } else {
                                        ReactionsEffectOverlay.currentOverlay = null;
                                    }
                                    viewGroup2 = this.val$cell;
                                    if (viewGroup2 != null) {
                                        viewGroup2.invalidate();
                                        viewGroup3 = this.val$cell;
                                        if (viewGroup3 instanceof ChatMessageCell) {
                                            ((View) this.val$cell.getParent()).invalidate();
                                        }
                                    }
                                    if (this.val$isStories) {
                                        final int i117 = 1;
                                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                                            public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                            {
                                                this.f$0 = this;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (i117) {
                                                    case 0:
                                                        ReactionsEffectOverlay.this.removeCurrentView();
                                                        break;
                                                    default:
                                                        ReactionsEffectOverlay.this.removeCurrentView();
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        final int i118 = 1;
                                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                                            public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                            {
                                                this.f$0 = this;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (i118) {
                                                    case 0:
                                                        ReactionsEffectOverlay.this.removeCurrentView();
                                                        break;
                                                    default:
                                                        ReactionsEffectOverlay.this.removeCurrentView();
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                        }
                    } else if (this.val$visibleReaction.documentId != 0) {
                        reactionsEffectOverlay2 = ReactionsEffectOverlay.this;
                        f17 = reactionsEffectOverlay2.animateOutProgress;
                        if (f17 != 1.0f) {
                            i3 = this.val$animationType;
                            if (i3 == 1) {
                                reactionsEffectOverlay2.animateOutProgress = 1.0f;
                            } else {
                                if (i3 == 2) {
                                    f18 = 350.0f;
                                } else {
                                    f18 = 220.0f;
                                }
                                reactionsEffectOverlay2.animateOutProgress = (16.0f / f18) + f17;
                            }
                            if (reactionsEffectOverlay2.animateOutProgress > f6) {
                                if (this.val$isStories) {
                                    ReactionsEffectOverlay.startShortAnimation();
                                } else {
                                    ReactionsEffectOverlay.startShortAnimation();
                                }
                            }
                            reactionsEffectOverlay3 = ReactionsEffectOverlay.this;
                            if (reactionsEffectOverlay3.animateOutProgress >= 1.0f) {
                                i4 = this.val$animationType;
                                if (i4 != 0) {
                                    viewGroup = this.val$cell;
                                    if (viewGroup instanceof ChatMessageCell) {
                                        ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                    } else if (viewGroup instanceof ChatActionCell) {
                                        ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                    }
                                } else {
                                    viewGroup = this.val$cell;
                                    if (viewGroup instanceof ChatMessageCell) {
                                        ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                    } else if (viewGroup instanceof ChatActionCell) {
                                        ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                    }
                                }
                                ReactionsEffectOverlay.this.animateOutProgress = 1.0f;
                                if (this.val$animationType == 1) {
                                    ReactionsEffectOverlay.currentShortOverlay = null;
                                } else {
                                    ReactionsEffectOverlay.currentOverlay = null;
                                }
                                viewGroup2 = this.val$cell;
                                if (viewGroup2 != null) {
                                    viewGroup2.invalidate();
                                    viewGroup3 = this.val$cell;
                                    if (viewGroup3 instanceof ChatMessageCell) {
                                        ((View) this.val$cell.getParent()).invalidate();
                                    }
                                }
                                if (this.val$isStories) {
                                    final int i119 = 1;
                                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                                        public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                        {
                                            this.f$0 = this;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (i119) {
                                                case 0:
                                                    ReactionsEffectOverlay.this.removeCurrentView();
                                                    break;
                                                default:
                                                    ReactionsEffectOverlay.this.removeCurrentView();
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    final int i1110 = 1;
                                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                                        public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                        {
                                            this.f$0 = this;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (i1110) {
                                                case 0:
                                                    ReactionsEffectOverlay.this.removeCurrentView();
                                                    break;
                                                default:
                                                    ReactionsEffectOverlay.this.removeCurrentView();
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    }
                } else {
                    if (i != 1) {
                        animationView3 = reactionsEffectOverlay4.emojiImageView;
                        if (!animationView3.wasPlaying) {
                        }
                    }
                    if (this.val$visibleReaction.documentId != 0) {
                        f6 = 0.7f;
                        if (System.currentTimeMillis() - ReactionsEffectOverlay.this.startTime > 2000) {
                            reactionsEffectOverlay2 = ReactionsEffectOverlay.this;
                            f17 = reactionsEffectOverlay2.animateOutProgress;
                            if (f17 != 1.0f) {
                                i3 = this.val$animationType;
                                if (i3 == 1) {
                                    reactionsEffectOverlay2.animateOutProgress = 1.0f;
                                } else {
                                    if (i3 == 2) {
                                        f18 = 350.0f;
                                    } else {
                                        f18 = 220.0f;
                                    }
                                    reactionsEffectOverlay2.animateOutProgress = (16.0f / f18) + f17;
                                }
                                if (reactionsEffectOverlay2.animateOutProgress > f6) {
                                    if (this.val$isStories) {
                                        ReactionsEffectOverlay.startShortAnimation();
                                    } else {
                                        ReactionsEffectOverlay.startShortAnimation();
                                    }
                                }
                                reactionsEffectOverlay3 = ReactionsEffectOverlay.this;
                                if (reactionsEffectOverlay3.animateOutProgress >= 1.0f) {
                                    i4 = this.val$animationType;
                                    if (i4 != 0) {
                                        viewGroup = this.val$cell;
                                        if (viewGroup instanceof ChatMessageCell) {
                                            ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                        } else if (viewGroup instanceof ChatActionCell) {
                                            ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                        }
                                    } else {
                                        viewGroup = this.val$cell;
                                        if (viewGroup instanceof ChatMessageCell) {
                                            ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                        } else if (viewGroup instanceof ChatActionCell) {
                                            ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                        }
                                    }
                                    ReactionsEffectOverlay.this.animateOutProgress = 1.0f;
                                    if (this.val$animationType == 1) {
                                        ReactionsEffectOverlay.currentShortOverlay = null;
                                    } else {
                                        ReactionsEffectOverlay.currentOverlay = null;
                                    }
                                    viewGroup2 = this.val$cell;
                                    if (viewGroup2 != null) {
                                        viewGroup2.invalidate();
                                        viewGroup3 = this.val$cell;
                                        if (viewGroup3 instanceof ChatMessageCell) {
                                            ((View) this.val$cell.getParent()).invalidate();
                                        }
                                    }
                                    if (this.val$isStories) {
                                        final int i1111 = 1;
                                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                                            public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                            {
                                                this.f$0 = this;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (i1111) {
                                                    case 0:
                                                        ReactionsEffectOverlay.this.removeCurrentView();
                                                        break;
                                                    default:
                                                        ReactionsEffectOverlay.this.removeCurrentView();
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        final int i1112 = 1;
                                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                                            public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                            {
                                                this.f$0 = this;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (i1112) {
                                                    case 0:
                                                        ReactionsEffectOverlay.this.removeCurrentView();
                                                        break;
                                                    default:
                                                        ReactionsEffectOverlay.this.removeCurrentView();
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                        }
                    } else {
                        f6 = 0.7f;
                    }
                    if (this.val$animationType == 1) {
                        animationView2 = ReactionsEffectOverlay.this.effectImageView;
                        if (!animationView2.wasPlaying) {
                            if (this.val$visibleReaction.documentId != 0) {
                                reactionsEffectOverlay2 = ReactionsEffectOverlay.this;
                                f17 = reactionsEffectOverlay2.animateOutProgress;
                                if (f17 != 1.0f) {
                                    i3 = this.val$animationType;
                                    if (i3 == 1) {
                                        reactionsEffectOverlay2.animateOutProgress = 1.0f;
                                    } else {
                                        if (i3 == 2) {
                                            f18 = 350.0f;
                                        } else {
                                            f18 = 220.0f;
                                        }
                                        reactionsEffectOverlay2.animateOutProgress = (16.0f / f18) + f17;
                                    }
                                    if (reactionsEffectOverlay2.animateOutProgress > f6) {
                                        if (this.val$isStories) {
                                            ReactionsEffectOverlay.startShortAnimation();
                                        } else {
                                            ReactionsEffectOverlay.startShortAnimation();
                                        }
                                    }
                                    reactionsEffectOverlay3 = ReactionsEffectOverlay.this;
                                    if (reactionsEffectOverlay3.animateOutProgress >= 1.0f) {
                                        i4 = this.val$animationType;
                                        if (i4 != 0) {
                                            viewGroup = this.val$cell;
                                            if (viewGroup instanceof ChatMessageCell) {
                                                ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                            } else if (viewGroup instanceof ChatActionCell) {
                                                ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                            }
                                        } else {
                                            viewGroup = this.val$cell;
                                            if (viewGroup instanceof ChatMessageCell) {
                                                ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                            } else if (viewGroup instanceof ChatActionCell) {
                                                ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                            }
                                        }
                                        ReactionsEffectOverlay.this.animateOutProgress = 1.0f;
                                        if (this.val$animationType == 1) {
                                            ReactionsEffectOverlay.currentShortOverlay = null;
                                        } else {
                                            ReactionsEffectOverlay.currentOverlay = null;
                                        }
                                        viewGroup2 = this.val$cell;
                                        if (viewGroup2 != null) {
                                            viewGroup2.invalidate();
                                            viewGroup3 = this.val$cell;
                                            if (viewGroup3 instanceof ChatMessageCell) {
                                                ((View) this.val$cell.getParent()).invalidate();
                                            }
                                        }
                                        if (this.val$isStories) {
                                            final int i1113 = 1;
                                            AndroidUtilities.runOnUIThread(new Runnable(this) {
                                                public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                                {
                                                    this.f$0 = this;
                                                }

                                                @Override
                                                public final void run() {
                                                    switch (i1113) {
                                                        case 0:
                                                            ReactionsEffectOverlay.this.removeCurrentView();
                                                            break;
                                                        default:
                                                            ReactionsEffectOverlay.this.removeCurrentView();
                                                            break;
                                                    }
                                                }
                                            });
                                        } else {
                                            final int i1114 = 1;
                                            AndroidUtilities.runOnUIThread(new Runnable(this) {
                                                public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                                {
                                                    this.f$0 = this;
                                                }

                                                @Override
                                                public final void run() {
                                                    switch (i1114) {
                                                        case 0:
                                                            ReactionsEffectOverlay.this.removeCurrentView();
                                                            break;
                                                        default:
                                                            ReactionsEffectOverlay.this.removeCurrentView();
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                }
                            }
                        } else if (this.val$visibleReaction.documentId != 0) {
                            reactionsEffectOverlay2 = ReactionsEffectOverlay.this;
                            f17 = reactionsEffectOverlay2.animateOutProgress;
                            if (f17 != 1.0f) {
                                i3 = this.val$animationType;
                                if (i3 == 1) {
                                    reactionsEffectOverlay2.animateOutProgress = 1.0f;
                                } else {
                                    if (i3 == 2) {
                                        f18 = 350.0f;
                                    } else {
                                        f18 = 220.0f;
                                    }
                                    reactionsEffectOverlay2.animateOutProgress = (16.0f / f18) + f17;
                                }
                                if (reactionsEffectOverlay2.animateOutProgress > f6) {
                                    if (this.val$isStories) {
                                        ReactionsEffectOverlay.startShortAnimation();
                                    } else {
                                        ReactionsEffectOverlay.startShortAnimation();
                                    }
                                }
                                reactionsEffectOverlay3 = ReactionsEffectOverlay.this;
                                if (reactionsEffectOverlay3.animateOutProgress >= 1.0f) {
                                    i4 = this.val$animationType;
                                    if (i4 != 0) {
                                        viewGroup = this.val$cell;
                                        if (viewGroup instanceof ChatMessageCell) {
                                            ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                        } else if (viewGroup instanceof ChatActionCell) {
                                            ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                        }
                                    } else {
                                        viewGroup = this.val$cell;
                                        if (viewGroup instanceof ChatMessageCell) {
                                            ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                        } else if (viewGroup instanceof ChatActionCell) {
                                            ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                        }
                                    }
                                    ReactionsEffectOverlay.this.animateOutProgress = 1.0f;
                                    if (this.val$animationType == 1) {
                                        ReactionsEffectOverlay.currentShortOverlay = null;
                                    } else {
                                        ReactionsEffectOverlay.currentOverlay = null;
                                    }
                                    viewGroup2 = this.val$cell;
                                    if (viewGroup2 != null) {
                                        viewGroup2.invalidate();
                                        viewGroup3 = this.val$cell;
                                        if (viewGroup3 instanceof ChatMessageCell) {
                                            ((View) this.val$cell.getParent()).invalidate();
                                        }
                                    }
                                    if (this.val$isStories) {
                                        final int i1115 = 1;
                                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                                            public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                            {
                                                this.f$0 = this;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (i1115) {
                                                    case 0:
                                                        ReactionsEffectOverlay.this.removeCurrentView();
                                                        break;
                                                    default:
                                                        ReactionsEffectOverlay.this.removeCurrentView();
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        final int i1116 = 1;
                                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                                            public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                            {
                                                this.f$0 = this;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (i1116) {
                                                    case 0:
                                                        ReactionsEffectOverlay.this.removeCurrentView();
                                                        break;
                                                    default:
                                                        ReactionsEffectOverlay.this.removeCurrentView();
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                        }
                    } else if (this.val$visibleReaction.documentId != 0) {
                        reactionsEffectOverlay2 = ReactionsEffectOverlay.this;
                        f17 = reactionsEffectOverlay2.animateOutProgress;
                        if (f17 != 1.0f) {
                            i3 = this.val$animationType;
                            if (i3 == 1) {
                                reactionsEffectOverlay2.animateOutProgress = 1.0f;
                            } else {
                                if (i3 == 2) {
                                    f18 = 350.0f;
                                } else {
                                    f18 = 220.0f;
                                }
                                reactionsEffectOverlay2.animateOutProgress = (16.0f / f18) + f17;
                            }
                            if (reactionsEffectOverlay2.animateOutProgress > f6) {
                                if (this.val$isStories) {
                                    ReactionsEffectOverlay.startShortAnimation();
                                } else {
                                    ReactionsEffectOverlay.startShortAnimation();
                                }
                            }
                            reactionsEffectOverlay3 = ReactionsEffectOverlay.this;
                            if (reactionsEffectOverlay3.animateOutProgress >= 1.0f) {
                                i4 = this.val$animationType;
                                if (i4 != 0) {
                                    viewGroup = this.val$cell;
                                    if (viewGroup instanceof ChatMessageCell) {
                                        ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                    } else if (viewGroup instanceof ChatActionCell) {
                                        ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                    }
                                } else {
                                    viewGroup = this.val$cell;
                                    if (viewGroup instanceof ChatMessageCell) {
                                        ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                    } else if (viewGroup instanceof ChatActionCell) {
                                        ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                    }
                                }
                                ReactionsEffectOverlay.this.animateOutProgress = 1.0f;
                                if (this.val$animationType == 1) {
                                    ReactionsEffectOverlay.currentShortOverlay = null;
                                } else {
                                    ReactionsEffectOverlay.currentOverlay = null;
                                }
                                viewGroup2 = this.val$cell;
                                if (viewGroup2 != null) {
                                    viewGroup2.invalidate();
                                    viewGroup3 = this.val$cell;
                                    if (viewGroup3 instanceof ChatMessageCell) {
                                        ((View) this.val$cell.getParent()).invalidate();
                                    }
                                }
                                if (this.val$isStories) {
                                    final int i1117 = 1;
                                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                                        public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                        {
                                            this.f$0 = this;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (i1117) {
                                                case 0:
                                                    ReactionsEffectOverlay.this.removeCurrentView();
                                                    break;
                                                default:
                                                    ReactionsEffectOverlay.this.removeCurrentView();
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    final int i1118 = 1;
                                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                                        public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                        {
                                            this.f$0 = this;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (i1118) {
                                                case 0:
                                                    ReactionsEffectOverlay.this.removeCurrentView();
                                                    break;
                                                default:
                                                    ReactionsEffectOverlay.this.removeCurrentView();
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    }
                }
            } else {
                f6 = 0.7f;
                reactionsEffectOverlay2 = ReactionsEffectOverlay.this;
                f17 = reactionsEffectOverlay2.animateOutProgress;
                if (f17 != 1.0f) {
                    i3 = this.val$animationType;
                    if (i3 == 1) {
                        reactionsEffectOverlay2.animateOutProgress = 1.0f;
                    } else {
                        if (i3 == 2) {
                            f18 = 350.0f;
                        } else {
                            f18 = 220.0f;
                        }
                        reactionsEffectOverlay2.animateOutProgress = (16.0f / f18) + f17;
                    }
                    if (reactionsEffectOverlay2.animateOutProgress > f6) {
                        if (this.val$isStories) {
                            ReactionsEffectOverlay.startShortAnimation();
                        } else {
                            ReactionsEffectOverlay.startShortAnimation();
                        }
                    }
                    reactionsEffectOverlay3 = ReactionsEffectOverlay.this;
                    if (reactionsEffectOverlay3.animateOutProgress >= 1.0f) {
                        i4 = this.val$animationType;
                        if (i4 != 0) {
                            viewGroup = this.val$cell;
                            if (viewGroup instanceof ChatMessageCell) {
                                ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                            } else if (viewGroup instanceof ChatActionCell) {
                                ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                            }
                        } else {
                            viewGroup = this.val$cell;
                            if (viewGroup instanceof ChatMessageCell) {
                                ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                            } else if (viewGroup instanceof ChatActionCell) {
                                ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                            }
                        }
                        ReactionsEffectOverlay.this.animateOutProgress = 1.0f;
                        if (this.val$animationType == 1) {
                            ReactionsEffectOverlay.currentShortOverlay = null;
                        } else {
                            ReactionsEffectOverlay.currentOverlay = null;
                        }
                        viewGroup2 = this.val$cell;
                        if (viewGroup2 != null) {
                            viewGroup2.invalidate();
                            viewGroup3 = this.val$cell;
                            if (viewGroup3 instanceof ChatMessageCell) {
                                ((View) this.val$cell.getParent()).invalidate();
                            }
                        }
                        if (this.val$isStories) {
                            final int i1119 = 1;
                            AndroidUtilities.runOnUIThread(new Runnable(this) {
                                public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                {
                                    this.f$0 = this;
                                }

                                @Override
                                public final void run() {
                                    switch (i1119) {
                                        case 0:
                                            ReactionsEffectOverlay.this.removeCurrentView();
                                            break;
                                        default:
                                            ReactionsEffectOverlay.this.removeCurrentView();
                                            break;
                                    }
                                }
                            });
                        } else {
                            final int i11110 = 1;
                            AndroidUtilities.runOnUIThread(new Runnable(this) {
                                public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                                {
                                    this.f$0 = this;
                                }

                                @Override
                                public final void run() {
                                    switch (i11110) {
                                        case 0:
                                            ReactionsEffectOverlay.this.removeCurrentView();
                                            break;
                                        default:
                                            ReactionsEffectOverlay.this.removeCurrentView();
                                            break;
                                    }
                                }
                            });
                        }
                    }
                }
            }
            if (!ReactionsEffectOverlay.this.avatars.isEmpty()) {
                animationView = ReactionsEffectOverlay.this.effectImageView;
                if (animationView.wasPlaying) {
                    lottieAnimation = animationView.getImageReceiver().getLottieAnimation();
                    i2 = 0;
                    while (i2 < ReactionsEffectOverlay.this.avatars.size()) {
                        avatarParticle = (AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2);
                        f7 = avatarParticle.progress;
                        if (lottieAnimation == null) {
                            f8 = avatarParticle.outProgress;
                            if (f8 != 1.0f) {
                                f9 = f8 + f;
                                avatarParticle.outProgress = f9;
                                if (f9 > 1.0f) {
                                    avatarParticle.outProgress = 1.0f;
                                    ReactionsEffectOverlay.this.avatars.remove(i2);
                                    i2--;
                                } else {
                                    if (f7 < 0.5f) {
                                        fM = f7 / 0.5f;
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 1.0f;
                                        fM = ImageReceiver$$ExternalSyntheticOutline1.m(f7, 0.5f, 0.5f, 1.0f);
                                    }
                                    float f311112 = (f10 - f7) * 0.5f;
                                    float f311113 = (avatarParticle.toX * f7) + f311112;
                                    float f311114 = ((avatarParticle.toY * f7) + f311112) - (avatarParticle.jumpY * fM);
                                    float f311115 = (1.0f - avatarParticle.outProgress) * avatarParticle.randomScale * f7;
                                    float scaleX6 = (ReactionsEffectOverlay.this.effectImageView.getScaleX() * ReactionsEffectOverlay.this.effectImageView.getWidth() * f311113) + ReactionsEffectOverlay.this.effectImageView.getX();
                                    float scaleY6 = (ReactionsEffectOverlay.this.effectImageView.getScaleY() * ReactionsEffectOverlay.this.effectImageView.getHeight() * f311114) + ReactionsEffectOverlay.this.effectImageView.getY();
                                    int iDp7 = AndroidUtilities.dp(16.0f);
                                    float f311116 = iDp7;
                                    float f311117 = f311116 / f2;
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.setImageCoords(scaleX6 - f311117, scaleY6 - f311117, f311116, f311116);
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.setRoundRadius(iDp7 >> 1);
                                    canvas.save();
                                    canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                    canvas.scale(f311115, f311115, scaleX6, scaleY6);
                                    canvas.rotate(avatarParticle.currentRotation, scaleX6, scaleY6);
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.draw(canvas);
                                    canvas.restore();
                                    f11 = avatarParticle.progress;
                                    if (f11 < 1.0f) {
                                        f16 = f11 + 0.045714285f;
                                        avatarParticle.progress = f16;
                                        if (f16 > 1.0f) {
                                            avatarParticle.progress = 1.0f;
                                        }
                                    }
                                    if (f7 >= 1.0f) {
                                        avatarParticle.globalTranslationY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(20.0f), 16.0f, 500.0f, avatarParticle.globalTranslationY);
                                    }
                                    if (avatarParticle.incrementRotation) {
                                        float f311118 = avatarParticle.currentRotation;
                                        f14 = avatarParticle.randomRotation;
                                        f15 = (f14 / 250.0f) + f311118;
                                        avatarParticle.currentRotation = f15;
                                        if (f15 > f14) {
                                            avatarParticle.incrementRotation = false;
                                        }
                                    } else {
                                        float f311119 = avatarParticle.currentRotation;
                                        f12 = avatarParticle.randomRotation;
                                        f13 = f311119 - (f12 / 250.0f);
                                        avatarParticle.currentRotation = f13;
                                        if (f13 < (-f12)) {
                                            avatarParticle.incrementRotation = true;
                                        }
                                    }
                                }
                            } else {
                                if (f7 < 0.5f) {
                                    fM = f7 / 0.5f;
                                    f10 = 1.0f;
                                } else {
                                    f10 = 1.0f;
                                    fM = ImageReceiver$$ExternalSyntheticOutline1.m(f7, 0.5f, 0.5f, 1.0f);
                                }
                                float f3111110 = (f10 - f7) * 0.5f;
                                float f3111111 = (avatarParticle.toX * f7) + f3111110;
                                float f3111112 = ((avatarParticle.toY * f7) + f3111110) - (avatarParticle.jumpY * fM);
                                float f3111113 = (1.0f - avatarParticle.outProgress) * avatarParticle.randomScale * f7;
                                float scaleX7 = (ReactionsEffectOverlay.this.effectImageView.getScaleX() * ReactionsEffectOverlay.this.effectImageView.getWidth() * f3111111) + ReactionsEffectOverlay.this.effectImageView.getX();
                                float scaleY7 = (ReactionsEffectOverlay.this.effectImageView.getScaleY() * ReactionsEffectOverlay.this.effectImageView.getHeight() * f3111112) + ReactionsEffectOverlay.this.effectImageView.getY();
                                int iDp8 = AndroidUtilities.dp(16.0f);
                                float f3111114 = iDp8;
                                float f3111115 = f3111114 / f2;
                                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.setImageCoords(scaleX7 - f3111115, scaleY7 - f3111115, f3111114, f3111114);
                                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.setRoundRadius(iDp8 >> 1);
                                canvas.save();
                                canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                canvas.scale(f3111113, f3111113, scaleX7, scaleY7);
                                canvas.rotate(avatarParticle.currentRotation, scaleX7, scaleY7);
                                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.draw(canvas);
                                canvas.restore();
                                f11 = avatarParticle.progress;
                                if (f11 < 1.0f) {
                                    f16 = f11 + 0.045714285f;
                                    avatarParticle.progress = f16;
                                    if (f16 > 1.0f) {
                                        avatarParticle.progress = 1.0f;
                                    }
                                }
                                if (f7 >= 1.0f) {
                                    avatarParticle.globalTranslationY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(20.0f), 16.0f, 500.0f, avatarParticle.globalTranslationY);
                                }
                                if (avatarParticle.incrementRotation) {
                                    float f3111116 = avatarParticle.currentRotation;
                                    f14 = avatarParticle.randomRotation;
                                    f15 = (f14 / 250.0f) + f3111116;
                                    avatarParticle.currentRotation = f15;
                                    if (f15 > f14) {
                                        avatarParticle.incrementRotation = false;
                                    }
                                } else {
                                    float f3111117 = avatarParticle.currentRotation;
                                    f12 = avatarParticle.randomRotation;
                                    f13 = f3111117 - (f12 / 250.0f);
                                    avatarParticle.currentRotation = f13;
                                    if (f13 < (-f12)) {
                                        avatarParticle.incrementRotation = true;
                                    }
                                }
                            }
                        } else {
                            f8 = avatarParticle.outProgress;
                            if (f8 != 1.0f) {
                                f9 = f8 + f;
                                avatarParticle.outProgress = f9;
                                if (f9 > 1.0f) {
                                    avatarParticle.outProgress = 1.0f;
                                    ReactionsEffectOverlay.this.avatars.remove(i2);
                                    i2--;
                                } else {
                                    if (f7 < 0.5f) {
                                        fM = f7 / 0.5f;
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 1.0f;
                                        fM = ImageReceiver$$ExternalSyntheticOutline1.m(f7, 0.5f, 0.5f, 1.0f);
                                    }
                                    float f3111118 = (f10 - f7) * 0.5f;
                                    float f3111119 = (avatarParticle.toX * f7) + f3111118;
                                    float f31111110 = ((avatarParticle.toY * f7) + f3111118) - (avatarParticle.jumpY * fM);
                                    float f31111111 = (1.0f - avatarParticle.outProgress) * avatarParticle.randomScale * f7;
                                    float scaleX8 = (ReactionsEffectOverlay.this.effectImageView.getScaleX() * ReactionsEffectOverlay.this.effectImageView.getWidth() * f3111119) + ReactionsEffectOverlay.this.effectImageView.getX();
                                    float scaleY8 = (ReactionsEffectOverlay.this.effectImageView.getScaleY() * ReactionsEffectOverlay.this.effectImageView.getHeight() * f31111110) + ReactionsEffectOverlay.this.effectImageView.getY();
                                    int iDp9 = AndroidUtilities.dp(16.0f);
                                    float f31111112 = iDp9;
                                    float f31111113 = f31111112 / f2;
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.setImageCoords(scaleX8 - f31111113, scaleY8 - f31111113, f31111112, f31111112);
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.setRoundRadius(iDp9 >> 1);
                                    canvas.save();
                                    canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                    canvas.scale(f31111111, f31111111, scaleX8, scaleY8);
                                    canvas.rotate(avatarParticle.currentRotation, scaleX8, scaleY8);
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.draw(canvas);
                                    canvas.restore();
                                    f11 = avatarParticle.progress;
                                    if (f11 < 1.0f) {
                                        f16 = f11 + 0.045714285f;
                                        avatarParticle.progress = f16;
                                        if (f16 > 1.0f) {
                                            avatarParticle.progress = 1.0f;
                                        }
                                    }
                                    if (f7 >= 1.0f) {
                                        avatarParticle.globalTranslationY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(20.0f), 16.0f, 500.0f, avatarParticle.globalTranslationY);
                                    }
                                    if (avatarParticle.incrementRotation) {
                                        float f31111114 = avatarParticle.currentRotation;
                                        f14 = avatarParticle.randomRotation;
                                        f15 = (f14 / 250.0f) + f31111114;
                                        avatarParticle.currentRotation = f15;
                                        if (f15 > f14) {
                                            avatarParticle.incrementRotation = false;
                                        }
                                    } else {
                                        float f31111115 = avatarParticle.currentRotation;
                                        f12 = avatarParticle.randomRotation;
                                        f13 = f31111115 - (f12 / 250.0f);
                                        avatarParticle.currentRotation = f13;
                                        if (f13 < (-f12)) {
                                            avatarParticle.incrementRotation = true;
                                        }
                                    }
                                }
                            } else {
                                if (f7 < 0.5f) {
                                    fM = f7 / 0.5f;
                                    f10 = 1.0f;
                                } else {
                                    f10 = 1.0f;
                                    fM = ImageReceiver$$ExternalSyntheticOutline1.m(f7, 0.5f, 0.5f, 1.0f);
                                }
                                float f31111116 = (f10 - f7) * 0.5f;
                                float f31111117 = (avatarParticle.toX * f7) + f31111116;
                                float f31111118 = ((avatarParticle.toY * f7) + f31111116) - (avatarParticle.jumpY * fM);
                                float f31111119 = (1.0f - avatarParticle.outProgress) * avatarParticle.randomScale * f7;
                                float scaleX9 = (ReactionsEffectOverlay.this.effectImageView.getScaleX() * ReactionsEffectOverlay.this.effectImageView.getWidth() * f31111117) + ReactionsEffectOverlay.this.effectImageView.getX();
                                float scaleY9 = (ReactionsEffectOverlay.this.effectImageView.getScaleY() * ReactionsEffectOverlay.this.effectImageView.getHeight() * f31111118) + ReactionsEffectOverlay.this.effectImageView.getY();
                                int iDp10 = AndroidUtilities.dp(16.0f);
                                float f311111110 = iDp10;
                                float f311111111 = f311111110 / f2;
                                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.setImageCoords(scaleX9 - f311111111, scaleY9 - f311111111, f311111110, f311111110);
                                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.setRoundRadius(iDp10 >> 1);
                                canvas.save();
                                canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                canvas.scale(f31111119, f31111119, scaleX9, scaleY9);
                                canvas.rotate(avatarParticle.currentRotation, scaleX9, scaleY9);
                                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i2)).imageReceiver.draw(canvas);
                                canvas.restore();
                                f11 = avatarParticle.progress;
                                if (f11 < 1.0f) {
                                    f16 = f11 + 0.045714285f;
                                    avatarParticle.progress = f16;
                                    if (f16 > 1.0f) {
                                        avatarParticle.progress = 1.0f;
                                    }
                                }
                                if (f7 >= 1.0f) {
                                    avatarParticle.globalTranslationY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(20.0f), 16.0f, 500.0f, avatarParticle.globalTranslationY);
                                }
                                if (avatarParticle.incrementRotation) {
                                    float f311111112 = avatarParticle.currentRotation;
                                    f14 = avatarParticle.randomRotation;
                                    f15 = (f14 / 250.0f) + f311111112;
                                    avatarParticle.currentRotation = f15;
                                    if (f15 > f14) {
                                        avatarParticle.incrementRotation = false;
                                    }
                                } else {
                                    float f311111113 = avatarParticle.currentRotation;
                                    f12 = avatarParticle.randomRotation;
                                    f13 = f311111113 - (f12 / 250.0f);
                                    avatarParticle.currentRotation = f13;
                                    if (f13 < (-f12)) {
                                        avatarParticle.incrementRotation = true;
                                    }
                                }
                            }
                        }
                        i2++;
                    }
                }
            }
            invalidate();
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            int i = 0;
            while (true) {
                ReactionsEffectOverlay reactionsEffectOverlay = ReactionsEffectOverlay.this;
                if (i >= reactionsEffectOverlay.avatars.size()) {
                    return;
                }
                ((AvatarParticle) reactionsEffectOverlay.avatars.get(i)).imageReceiver.onAttachedToWindow();
                i++;
            }
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            int i = 0;
            while (true) {
                ReactionsEffectOverlay reactionsEffectOverlay = ReactionsEffectOverlay.this;
                if (i >= reactionsEffectOverlay.avatars.size()) {
                    return;
                }
                ((AvatarParticle) reactionsEffectOverlay.avatars.get(i)).imageReceiver.onDetachedFromWindow();
                i++;
            }
        }
    }

    public final class AnimationView extends BackupImageView {
        public AnimatedEmojiDrawable animatedEmojiDrawable;
        public boolean attached;
        public AnimatedEmojiEffect emojiEffect;
        public boolean wasPlaying;

        public AnimationView(Context context) {
            super(context);
            getImageReceiver().setFileLoadingPriority(3);
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.attached = true;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.addView(this);
            }
            AnimatedEmojiEffect animatedEmojiEffect = this.emojiEffect;
            if (animatedEmojiEffect != null) {
                animatedEmojiEffect.setView(this);
            }
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.attached = false;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.removeView(this);
            }
            AnimatedEmojiEffect animatedEmojiEffect = this.emojiEffect;
            if (animatedEmojiEffect != null) {
                animatedEmojiEffect.removeView(this);
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.animatedEmojiDrawable.setAlpha(255);
                this.animatedEmojiDrawable.draw(canvas);
                this.wasPlaying = true;
                return;
            }
            AnimatedEmojiEffect animatedEmojiEffect = this.emojiEffect;
            if (animatedEmojiEffect != null) {
                animatedEmojiEffect.bounds.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                ImageReceiver imageReceiver = animatedEmojiEffect.effectImageReceiver;
                if (imageReceiver != null) {
                    imageReceiver.setImageCoords(animatedEmojiEffect.bounds);
                }
                this.emojiEffect.draw(canvas);
                this.wasPlaying = true;
                return;
            }
            if (getImageReceiver().getLottieAnimation() != null && getImageReceiver().getLottieAnimation().isRunning) {
                this.wasPlaying = true;
            }
            if (!this.wasPlaying && getImageReceiver().getLottieAnimation() != null && !getImageReceiver().getLottieAnimation().isRunning) {
                ReactionsEffectOverlay reactionsEffectOverlay = ReactionsEffectOverlay.this;
                if (reactionsEffectOverlay.animationType != 2 || reactionsEffectOverlay.isStories) {
                    getImageReceiver().getLottieAnimation().setCurrentFrame(0, false, false);
                    getImageReceiver().getLottieAnimation().start();
                } else {
                    getImageReceiver().getLottieAnimation().setCurrentFrame(getImageReceiver().getLottieAnimation().metaData[0] - 1, false, false);
                }
            }
            super.onDraw(canvas);
        }
    }

    public final class AvatarParticle {
        public float currentRotation;
        public float globalTranslationY;
        public ImageReceiver imageReceiver;
        public boolean incrementRotation;
        public float jumpY;
        public int leftTime;
        public float outProgress;
        public float progress;
        public float randomRotation;
        public float randomScale;
        public float toX;
        public float toY;
    }

    public ReactionsEffectOverlay(Context context, BaseFragment baseFragment, ReactionsContainerLayout reactionsContainerLayout, ViewGroup viewGroup, View view, float f, float f2, ReactionsLayoutInBubble.VisibleReaction visibleReaction, int i, int i2, boolean z) {
        MessageObject messageObject;
        Context context2;
        View view2;
        ReactionsContainerLayout reactionsContainerLayout2;
        int i3;
        ViewGroup viewGroup2;
        BaseFragment baseFragment2;
        ChatActivity chatActivity;
        float f3;
        float imageX;
        float imageY;
        float f4;
        float f5;
        int i4;
        float imageHeight;
        float x;
        float y;
        int iRound;
        int iDp;
        float f6;
        float fDp;
        float f7;
        int i5;
        int i6;
        FrameLayout frameLayout;
        AnonymousClass1 anonymousClass1;
        MessageObject messageObject2;
        AnimationView animationView;
        AnimationView animationView2;
        AnimationView animationView3;
        TLRPC.TL_availableReaction tL_availableReaction;
        int i7;
        AnimatedEmojiDrawable animatedEmojiDrawable;
        AnimationView animationView4;
        MessageObject messageObject3;
        int color;
        boolean z2;
        ?? r10;
        int i8;
        Theme.ResourcesProvider resourceProvider;
        AnimatedEmojiDrawable animatedEmojiDrawable2;
        int i9;
        int i10;
        int i11;
        TLRPC.Document document;
        ?? r11;
        float f8;
        ChatActivity chatActivity2;
        AvatarParticle avatarParticle;
        float f9;
        float f10;
        int i12;
        float f11;
        float f12;
        float f13;
        float fM;
        float fM2;
        float f14;
        int i13;
        float f15;
        TLRPC.TL_messageReactions tL_messageReactions;
        this.holderView = null;
        this.isStories = z;
        boolean z3 = viewGroup instanceof ChatMessageCell;
        if (z3) {
            messageObject = ((ChatMessageCell) viewGroup).getMessageObject();
            this.messageId = messageObject.getId();
            this.groupId = messageObject.getGroupId();
        } else if (viewGroup instanceof ChatActionCell) {
            messageObject = ((ChatActionCell) viewGroup).getMessageObject();
            this.messageId = messageObject.getId();
            this.groupId = 0L;
        } else {
            this.messageId = 0;
            this.groupId = 0L;
            messageObject = null;
        }
        this.reaction = visibleReaction;
        this.animationType = i2;
        this.cell = viewGroup;
        ReactionsLayoutInBubble.ReactionButton reactionButton = z3 ? ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.getReactionButton(visibleReaction) : viewGroup instanceof ChatActionCell ? ((ChatActionCell) viewGroup).reactionsLayoutInBubble.getReactionButton(visibleReaction) : null;
        if (z && i2 == 2) {
            view2 = view;
            reactionsContainerLayout2 = reactionsContainerLayout;
            viewGroup2 = viewGroup;
            baseFragment2 = baseFragment;
            ReactionsEffectOverlay reactionsEffectOverlay = new ReactionsEffectOverlay(context, baseFragment2, reactionsContainerLayout2, viewGroup2, view2, f, f2, visibleReaction, i, 1, true);
            context2 = context;
            i3 = i;
            this.nextReactionOverlay = reactionsEffectOverlay;
            currentShortOverlay = reactionsEffectOverlay;
        } else {
            context2 = context;
            view2 = view;
            reactionsContainerLayout2 = reactionsContainerLayout;
            i3 = i;
            viewGroup2 = viewGroup;
            baseFragment2 = baseFragment;
        }
        ChatActivity chatActivity3 = baseFragment2 instanceof ChatActivity ? (ChatActivity) baseFragment2 : null;
        if (reactionsContainerLayout2 != null) {
            int i14 = 0;
            while (true) {
                ChatActivity.AnonymousClass34 anonymousClass34 = reactionsContainerLayout2.recyclerListView;
                if (i14 >= anonymousClass34.getChildCount()) {
                    break;
                }
                if ((anonymousClass34.getChildAt(i14) instanceof ReactionsContainerLayout.ReactionHolderView) && ((ReactionsContainerLayout.ReactionHolderView) anonymousClass34.getChildAt(i14)).currentReaction.equals(this.reaction)) {
                    this.holderView = (ReactionsContainerLayout.ReactionHolderView) anonymousClass34.getChildAt(i14);
                    break;
                }
                i14++;
            }
        }
        if (i2 == 1) {
            Random random = new Random();
            ArrayList<TLRPC.MessagePeerReaction> arrayList = (messageObject == 0 || (tL_messageReactions = messageObject.messageOwner.reactions) == null) ? null : tL_messageReactions.recent_reactions;
            if (arrayList == null || chatActivity3 == null || chatActivity3.getDialogId() >= r5) {
                chatActivity = chatActivity3;
                f3 = 0.0f;
            } else {
                f3 = 0.0f;
                int i15 = 0;
                while (i15 < arrayList.size()) {
                    if (this.reaction.equals(arrayList.get(i15).reaction) && arrayList.get(i15).unread) {
                        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        chatActivity2 = chatActivity3;
                        long peerId = MessageObject.getPeerId(arrayList.get(i15).peer_id);
                        if (peerId < 0) {
                            TLRPC.Chat chat = MessagesController.getInstance(i3).getChat(Long.valueOf(-peerId));
                            if (chat != null) {
                                avatarDrawable.setInfo(i3, chat);
                                imageReceiver.setForUserOrChat(chat, avatarDrawable);
                                avatarParticle = new AvatarParticle();
                                avatarParticle.imageReceiver = imageReceiver;
                                avatarParticle.jumpY = zzjd.m(Math.abs(random.nextInt() % 100), 100.0f, 0.1f, 0.3f);
                                avatarParticle.randomScale = zzjd.m(Math.abs(random.nextInt() % 100), 100.0f, 0.4f, 0.8f);
                                avatarParticle.randomRotation = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                avatarParticle.leftTime = (int) zzjd.m(Math.abs(random.nextInt() % 100), 100.0f, 200.0f, 400.0f);
                                f9 = 0.6f;
                                f10 = 0.2f;
                                if (this.avatars.isEmpty()) {
                                    avatarParticle.toX = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(Math.abs(random.nextInt() % 100), 0.6f, 100.0f, 0.2f);
                                    avatarParticle.toY = (Math.abs(random.nextInt() % 100) * 0.4f) / 100.0f;
                                } else {
                                    i12 = 0;
                                    f11 = 0.0f;
                                    f12 = 0.0f;
                                    f13 = 0.0f;
                                    while (i12 < 10) {
                                        fM = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(Math.abs(random.nextInt() % 100), f9, 100.0f, f10);
                                        int i16 = i12;
                                        fM2 = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(Math.abs(random.nextInt() % 100), 0.4f, 100.0f, f10);
                                        f14 = 2.1474836E9f;
                                        for (i13 = 0; i13 < this.avatars.size(); i13++) {
                                            float f16 = ((AvatarParticle) this.avatars.get(i13)).toX - fM;
                                            float f17 = ((AvatarParticle) this.avatars.get(i13)).toY - fM2;
                                            f15 = (f17 * f17) + (f16 * f16);
                                            if (f15 < f14) {
                                                f14 = f15;
                                            }
                                        }
                                        if (f14 > f13) {
                                            f11 = fM;
                                            f12 = fM2;
                                            f13 = f14;
                                        }
                                        i12 = i16 + 1;
                                        f9 = 0.6f;
                                        f10 = 0.2f;
                                    }
                                    avatarParticle.toX = f11;
                                    avatarParticle.toY = f12;
                                }
                                this.avatars.add(avatarParticle);
                            }
                        } else {
                            TLRPC.User user = MessagesController.getInstance(i3).getUser(Long.valueOf(peerId));
                            if (user != null) {
                                avatarDrawable.setInfo(i3, user);
                                imageReceiver.setForUserOrChat(user, avatarDrawable);
                                avatarParticle = new AvatarParticle();
                                avatarParticle.imageReceiver = imageReceiver;
                                avatarParticle.jumpY = zzjd.m(Math.abs(random.nextInt() % 100), 100.0f, 0.1f, 0.3f);
                                avatarParticle.randomScale = zzjd.m(Math.abs(random.nextInt() % 100), 100.0f, 0.4f, 0.8f);
                                avatarParticle.randomRotation = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                avatarParticle.leftTime = (int) zzjd.m(Math.abs(random.nextInt() % 100), 100.0f, 200.0f, 400.0f);
                                f9 = 0.6f;
                                f10 = 0.2f;
                                if (this.avatars.isEmpty()) {
                                    avatarParticle.toX = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(Math.abs(random.nextInt() % 100), 0.6f, 100.0f, 0.2f);
                                    avatarParticle.toY = (Math.abs(random.nextInt() % 100) * 0.4f) / 100.0f;
                                } else {
                                    i12 = 0;
                                    f11 = 0.0f;
                                    f12 = 0.0f;
                                    f13 = 0.0f;
                                    while (i12 < 10) {
                                        fM = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(Math.abs(random.nextInt() % 100), f9, 100.0f, f10);
                                        int i17 = i12;
                                        fM2 = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(Math.abs(random.nextInt() % 100), 0.4f, 100.0f, f10);
                                        f14 = 2.1474836E9f;
                                        while (i13 < this.avatars.size()) {
                                            float f18 = ((AvatarParticle) this.avatars.get(i13)).toX - fM;
                                            float f19 = ((AvatarParticle) this.avatars.get(i13)).toY - fM2;
                                            f15 = (f19 * f19) + (f18 * f18);
                                            if (f15 < f14) {
                                                f14 = f15;
                                            }
                                        }
                                        if (f14 > f13) {
                                            f11 = fM;
                                            f12 = fM2;
                                            f13 = f14;
                                        }
                                        i12 = i17 + 1;
                                        f9 = 0.6f;
                                        f10 = 0.2f;
                                    }
                                    avatarParticle.toX = f11;
                                    avatarParticle.toY = f12;
                                }
                                this.avatars.add(avatarParticle);
                            }
                        }
                    } else {
                        chatActivity2 = chatActivity3;
                    }
                    i15++;
                    i3 = i;
                    chatActivity3 = chatActivity2;
                }
                chatActivity = chatActivity3;
            }
        } else {
            chatActivity = chatActivity3;
            f3 = 0.0f;
        }
        ReactionsContainerLayout.ReactionHolderView reactionHolderView = this.holderView;
        boolean z4 = (reactionHolderView == null && (f == f3 || f2 == f3)) ? false : true;
        if (view2 == null) {
            if (reactionHolderView != null) {
                reactionHolderView.getLocationOnScreen(this.loc);
                x = this.holderView.loopImageView.getX() + this.loc[0];
                y = this.loc[1] + this.holderView.loopImageView.getY();
                imageHeight = this.holderView.getScaleX() * this.holderView.loopImageView.getWidth();
            } else {
                if (reactionButton != 0) {
                    viewGroup2.getLocationInWindow(this.loc);
                    float f20 = this.loc[0];
                    ImageReceiver imageReceiver2 = reactionButton.imageReceiver;
                    imageX = f20 + (imageReceiver2 == null ? 0.0f : imageReceiver2.getImageX());
                    imageY = this.loc[1] + (imageReceiver2 == null ? 0.0f : imageReceiver2.getImageY());
                    if (imageReceiver2 != null) {
                        imageHeight = imageReceiver2.getImageHeight();
                        f5 = imageX;
                        f4 = imageY;
                        i4 = 2;
                    }
                } else {
                    if (viewGroup2 != null) {
                        ((View) viewGroup2.getParent()).getLocationInWindow(this.loc);
                        int[] iArr = this.loc;
                        float f21 = iArr[0] + f;
                        f4 = iArr[1] + f2 + (viewGroup2 instanceof ChatMessageCell ? ((ChatMessageCell) viewGroup2).starsPriceTopPadding : 0);
                        f5 = f21;
                    } else {
                        imageX = f;
                        imageY = f2;
                    }
                    i4 = 2;
                    imageHeight = 0.0f;
                }
                f5 = imageX;
                f4 = imageY;
                i4 = 2;
                imageHeight = 0.0f;
            }
            if (i2 == i4) {
                if (z || !SharedConfig.deviceIsHigh()) {
                    f8 = 34.0f;
                } else {
                    f8 = 60.0f;
                }
                int iDp2 = AndroidUtilities.dp(f8);
                iRound = (int) ((iDp2 * 2.0f) / AndroidUtilities.density);
                iDp = iDp2;
            } else if (i2 == 1) {
                int iDp3 = AndroidUtilities.dp(350.0f);
                Point point = AndroidUtilities.displaySize;
                int iRound2 = Math.round(Math.min(iDp3, Math.min(point.x, point.y)) * 0.8f);
                int iDp4 = AndroidUtilities.dp(350.0f);
                Point point2 = AndroidUtilities.displaySize;
                iRound = (int) (Math.round(Math.min(iDp4, Math.min(point2.x, point2.y)) * 0.7f) / AndroidUtilities.density);
                iDp = iRound2;
            } else if (z) {
                if (SharedConfig.deviceIsHigh()) {
                    f6 = 240.0f;
                } else {
                    f6 = 140.0f;
                }
                iDp = AndroidUtilities.dp(f6);
                if (SharedConfig.deviceIsHigh()) {
                    fDp = AndroidUtilities.dp(80.0f) * 2.0f;
                    f7 = AndroidUtilities.density;
                } else {
                    fDp = AndroidUtilities.dp(40.0f) * 2.0f;
                    f7 = AndroidUtilities.density;
                }
                iRound = (int) (fDp / f7);
            } else {
                int iDp5 = AndroidUtilities.dp(80.0f);
                iRound = (int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density);
                iDp = iDp5;
            }
            int i18 = iDp;
            i5 = i18 >> 1;
            i6 = iRound >> 1;
            float f22 = imageHeight / i5;
            this.animateInProgress = 0.0f;
            this.animateOutProgress = 0.0f;
            frameLayout = new FrameLayout(context2);
            this.container = frameLayout;
            int i19 = iRound;
            ViewGroup viewGroup3 = viewGroup2;
            messageObject2 = messageObject;
            anonymousClass1 = new AnonymousClass1(context2, baseFragment, viewGroup3, z, messageObject2, chatActivity, i5, i2, z4, f22, f5, f4, visibleReaction);
            this.windowView = anonymousClass1;
            animationView = new AnimationView(context2);
            this.effectImageView = animationView;
            animationView2 = new AnimationView(context2);
            this.emojiImageView = animationView2;
            animationView3 = new AnimationView(context2);
            this.emojiStaticImageView = animationView3;
            if (visibleReaction.emojicon != null) {
                tL_availableReaction = MediaDataController.getInstance(i).getReactionsMap().get(this.reaction.emojicon);
            } else {
                tL_availableReaction = null;
            }
            if (tL_availableReaction != null && visibleReaction.documentId == r5) {
                this.dismissed = true;
                return;
            }
            if (tL_availableReaction != null) {
                if (i2 == 0) {
                    i7 = i;
                    if (i2 == 2) {
                        animationView4 = animationView3;
                        messageObject3 = messageObject2;
                        animatedEmojiDrawable = new AnimatedEmojiDrawable(2, i7, visibleReaction.documentId);
                        animatedEmojiDrawable.removeView(animationView2);
                        animationView2.animatedEmojiDrawable = animatedEmojiDrawable;
                        if (animationView2.attached) {
                            animatedEmojiDrawable.addView(animationView2);
                        }
                    }
                    if (i2 != 0 || i2 == 1) {
                        AnimatedEmojiDrawable animatedEmojiDrawable3 = new AnimatedEmojiDrawable(2, i7, visibleReaction.documentId);
                        if (messageObject3 != null) {
                            if (messageObject3.shouldDrawWithoutBackground()) {
                                if (messageObject3.isOutOwner()) {
                                    i8 = Theme.key_chat_outReactionButtonBackground;
                                } else {
                                    i8 = Theme.key_chat_inReactionButtonBackground;
                                }
                            } else if (messageObject3.isOutOwner()) {
                                i8 = Theme.key_chat_outReactionButtonTextSelected;
                            } else {
                                i8 = Theme.key_chat_inReactionButtonTextSelected;
                            }
                            if (baseFragment != null) {
                                resourceProvider = baseFragment.getResourceProvider();
                            } else {
                                resourceProvider = null;
                            }
                            color = Theme.getColor(i8, resourceProvider);
                        } else {
                            color = -1;
                        }
                        animatedEmojiDrawable3.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                        if (i2 == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        animationView.emojiEffect = new AnimatedEmojiEffect(animatedEmojiDrawable3, UserConfig.selectedAccount, z2, !z2);
                        r10 = 0;
                        anonymousClass1.setClipChildren(false);
                    }
                    animationView2.getImageReceiver().setAutoRepeat(r10);
                    animationView2.getImageReceiver().setAllowStartAnimation(r10);
                    if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                        if (i2 == 2) {
                            animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().metaData[r10] - 1, r10, r10);
                        } else {
                            animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(r10, r10, r10);
                            animationView2.getImageReceiver().getLottieAnimation().start();
                        }
                    }
                    i9 = i18 - i5;
                    i10 = i9 >> 1;
                    i9 = i2 == 1 ? i10 : i9;
                    frameLayout.addView(animationView2);
                    animationView2.getLayoutParams().width = i5;
                    animationView2.getLayoutParams().height = i5;
                    ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i10;
                    ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i9;
                    if (i2 != 1 && !z) {
                        if (tL_availableReaction != null) {
                            animationView4.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                        }
                        frameLayout.addView(animationView4);
                        animationView4.getLayoutParams().width = i5;
                        animationView4.getLayoutParams().height = i5;
                        ((FrameLayout.LayoutParams) animationView4.getLayoutParams()).topMargin = i10;
                        ((FrameLayout.LayoutParams) animationView4.getLayoutParams()).leftMargin = i9;
                    }
                    anonymousClass1.addView(frameLayout);
                    frameLayout.getLayoutParams().width = i18;
                    frameLayout.getLayoutParams().height = i18;
                    int i20 = -i10;
                    ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i20;
                    int i21 = -i9;
                    ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i21;
                    anonymousClass1.addView(animationView);
                    animationView.getLayoutParams().width = i18;
                    animationView.getLayoutParams().height = i18;
                    animationView.getLayoutParams().width = i18;
                    animationView.getLayoutParams().height = i18;
                    ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i20;
                    ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i21;
                    frameLayout.setPivotX(i9);
                    frameLayout.setPivotY(i10);
                }
                i7 = i;
                animatedEmojiDrawable2 = new AnimatedEmojiDrawable(1, i7, visibleReaction.documentId);
                animatedEmojiDrawable2.removeView(animationView2);
                animationView2.animatedEmojiDrawable = animatedEmojiDrawable2;
                if (animationView2.attached) {
                    animatedEmojiDrawable2.addView(animationView2);
                }
                animationView4 = animationView3;
                messageObject3 = messageObject2;
                if (i2 != 0) {
                }
                AnimatedEmojiDrawable animatedEmojiDrawable4 = new AnimatedEmojiDrawable(2, i7, visibleReaction.documentId);
                if (messageObject3 != null) {
                    if (messageObject3.shouldDrawWithoutBackground()) {
                        if (messageObject3.isOutOwner()) {
                            i8 = Theme.key_chat_outReactionButtonBackground;
                        } else {
                            i8 = Theme.key_chat_inReactionButtonBackground;
                        }
                    } else if (messageObject3.isOutOwner()) {
                        i8 = Theme.key_chat_outReactionButtonTextSelected;
                    } else {
                        i8 = Theme.key_chat_inReactionButtonTextSelected;
                    }
                    if (baseFragment != null) {
                        resourceProvider = baseFragment.getResourceProvider();
                    } else {
                        resourceProvider = null;
                    }
                    color = Theme.getColor(i8, resourceProvider);
                } else {
                    color = -1;
                }
                animatedEmojiDrawable4.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                if (i2 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                animationView.emojiEffect = new AnimatedEmojiEffect(animatedEmojiDrawable4, UserConfig.selectedAccount, z2, !z2);
                r10 = 0;
                anonymousClass1.setClipChildren(false);
                animationView2.getImageReceiver().setAutoRepeat(r10);
                animationView2.getImageReceiver().setAllowStartAnimation(r10);
                if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                    if (i2 == 2) {
                        animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().metaData[r10] - 1, r10, r10);
                    } else {
                        animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(r10, r10, r10);
                        animationView2.getImageReceiver().getLottieAnimation().start();
                    }
                }
                i9 = i18 - i5;
                i10 = i9 >> 1;
                if (i2 == 1) {
                }
                frameLayout.addView(animationView2);
                animationView2.getLayoutParams().width = i5;
                animationView2.getLayoutParams().height = i5;
                ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i10;
                ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i9;
                if (i2 != 1) {
                    if (tL_availableReaction != null) {
                        animationView4.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                    }
                    frameLayout.addView(animationView4);
                    animationView4.getLayoutParams().width = i5;
                    animationView4.getLayoutParams().height = i5;
                    ((FrameLayout.LayoutParams) animationView4.getLayoutParams()).topMargin = i10;
                    ((FrameLayout.LayoutParams) animationView4.getLayoutParams()).leftMargin = i9;
                }
                anonymousClass1.addView(frameLayout);
                frameLayout.getLayoutParams().width = i18;
                frameLayout.getLayoutParams().height = i18;
                int i22 = -i10;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i22;
                int i23 = -i9;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i23;
                anonymousClass1.addView(animationView);
                animationView.getLayoutParams().width = i18;
                animationView.getLayoutParams().height = i18;
                animationView.getLayoutParams().width = i18;
                animationView.getLayoutParams().height = i18;
                ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i22;
                ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i23;
                frameLayout.setPivotX(i9);
                frameLayout.setPivotY(i10);
            }
            i11 = 2;
            if (i2 != 2) {
                if ((i2 != 1 && LiteMode.isEnabled(4112)) || i2 == 0) {
                    TLRPC.Document document2 = i2 == 1 ? tL_availableReaction.around_animation : tL_availableReaction.effect_animation;
                    String filterForAroundAnimation = i2 == 1 ? getFilterForAroundAnimation() : DiffUtil.m(i19, i19, "_");
                    ImageReceiver imageReceiver3 = animationView.getImageReceiver();
                    StringBuilder sb = new StringBuilder();
                    int i24 = uniqPrefix;
                    uniqPrefix = i24 + 1;
                    sb.append(i24);
                    sb.append("_");
                    sb.append(this.messageId);
                    sb.append("_");
                    imageReceiver3.setUniqKeyPrefix(sb.toString());
                    animationView.setImage(ImageLocation.getForDocument(document2), filterForAroundAnimation, null, null, null, null, 0, null);
                    r11 = 0;
                    animationView.getImageReceiver().setAutoRepeat(0);
                    animationView.getImageReceiver().setAllowStartAnimation(false);
                }
                if (animationView.getImageReceiver().getLottieAnimation() != null) {
                    animationView.getImageReceiver().getLottieAnimation().setCurrentFrame(r11, r11, r11);
                    animationView.getImageReceiver().getLottieAnimation().start();
                }
                i11 = 2;
            }
            if (i2 == i11) {
                if (z) {
                    document = tL_availableReaction.select_animation;
                } else {
                    document = tL_availableReaction.appear_animation;
                }
                ImageReceiver imageReceiver4 = animationView2.getImageReceiver();
                StringBuilder sb2 = new StringBuilder();
                int i25 = uniqPrefix;
                uniqPrefix = i25 + 1;
                sb2.append(i25);
                sb2.append("_");
                sb2.append(this.messageId);
                sb2.append("_");
                imageReceiver4.setUniqKeyPrefix(sb2.toString());
                animationView2.setImage(ImageLocation.getForDocument(document), DiffUtil.m(i6, i6, "_"), null, null, null, null, 0, null);
            } else if (i2 == 0) {
                TLRPC.Document document3 = tL_availableReaction.activate_animation;
                ImageReceiver imageReceiver5 = animationView2.getImageReceiver();
                StringBuilder sb3 = new StringBuilder();
                int i26 = uniqPrefix;
                uniqPrefix = i26 + 1;
                sb3.append(i26);
                sb3.append("_");
                sb3.append(this.messageId);
                sb3.append("_");
                imageReceiver5.setUniqKeyPrefix(sb3.toString());
                animationView2.setImage(ImageLocation.getForDocument(document3), DiffUtil.m(i6, i6, "_"), null, null, null, null, 0, null);
            }
            animationView4 = animationView3;
            r10 = 0;
            animationView2.getImageReceiver().setAutoRepeat(r10);
            animationView2.getImageReceiver().setAllowStartAnimation(r10);
            if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                if (i2 == 2) {
                    animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().metaData[r10] - 1, r10, r10);
                } else {
                    animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(r10, r10, r10);
                    animationView2.getImageReceiver().getLottieAnimation().start();
                }
            }
            i9 = i18 - i5;
            i10 = i9 >> 1;
            if (i2 == 1) {
            }
            frameLayout.addView(animationView2);
            animationView2.getLayoutParams().width = i5;
            animationView2.getLayoutParams().height = i5;
            ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i10;
            ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i9;
            if (i2 != 1) {
                if (tL_availableReaction != null) {
                    animationView4.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                }
                frameLayout.addView(animationView4);
                animationView4.getLayoutParams().width = i5;
                animationView4.getLayoutParams().height = i5;
                ((FrameLayout.LayoutParams) animationView4.getLayoutParams()).topMargin = i10;
                ((FrameLayout.LayoutParams) animationView4.getLayoutParams()).leftMargin = i9;
            }
            anonymousClass1.addView(frameLayout);
            frameLayout.getLayoutParams().width = i18;
            frameLayout.getLayoutParams().height = i18;
            int i27 = -i10;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i27;
            int i28 = -i9;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i28;
            anonymousClass1.addView(animationView);
            animationView.getLayoutParams().width = i18;
            animationView.getLayoutParams().height = i18;
            animationView.getLayoutParams().width = i18;
            animationView.getLayoutParams().height = i18;
            ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i27;
            ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i28;
            frameLayout.setPivotX(i9);
            frameLayout.setPivotY(i10);
        }
        view2.getLocationOnScreen(this.loc);
        int[] iArr2 = this.loc;
        x = iArr2[0];
        y = iArr2[1];
        imageHeight = view2.getScaleX() * view2.getWidth();
        if (view2 instanceof SelectAnimatedEmojiDialog.ImageViewEmoji) {
            float f23 = ((SelectAnimatedEmojiDialog.ImageViewEmoji) view2).bigReactionSelectedProgress;
            if (f23 > f3) {
                imageHeight = view2.getWidth() * ((f23 * 2.0f) + 1.0f);
                x = ImageReceiver$$ExternalSyntheticOutline1.m(imageHeight, view2.getWidth(), 2.0f, x);
                y -= imageHeight - view2.getWidth();
            }
        }
        f4 = y;
        f5 = x;
        i4 = 2;
        if (i2 == i4) {
            if (z) {
                f8 = 34.0f;
            } else {
                f8 = 34.0f;
            }
            int iDp6 = AndroidUtilities.dp(f8);
            iRound = (int) ((iDp6 * 2.0f) / AndroidUtilities.density);
            iDp = iDp6;
        } else if (i2 == 1) {
            int iDp7 = AndroidUtilities.dp(350.0f);
            Point point3 = AndroidUtilities.displaySize;
            int iRound3 = Math.round(Math.min(iDp7, Math.min(point3.x, point3.y)) * 0.8f);
            int iDp8 = AndroidUtilities.dp(350.0f);
            Point point4 = AndroidUtilities.displaySize;
            iRound = (int) (Math.round(Math.min(iDp8, Math.min(point4.x, point4.y)) * 0.7f) / AndroidUtilities.density);
            iDp = iRound3;
        } else if (z) {
            if (SharedConfig.deviceIsHigh()) {
                f6 = 240.0f;
            } else {
                f6 = 140.0f;
            }
            iDp = AndroidUtilities.dp(f6);
            if (SharedConfig.deviceIsHigh()) {
                fDp = AndroidUtilities.dp(80.0f) * 2.0f;
                f7 = AndroidUtilities.density;
            } else {
                fDp = AndroidUtilities.dp(40.0f) * 2.0f;
                f7 = AndroidUtilities.density;
            }
            iRound = (int) (fDp / f7);
        } else {
            int iDp9 = AndroidUtilities.dp(80.0f);
            iRound = (int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density);
            iDp = iDp9;
        }
        int i110 = iDp;
        i5 = i110 >> 1;
        i6 = iRound >> 1;
        float f24 = imageHeight / i5;
        this.animateInProgress = 0.0f;
        this.animateOutProgress = 0.0f;
        frameLayout = new FrameLayout(context2);
        this.container = frameLayout;
        int i111 = iRound;
        ViewGroup viewGroup4 = viewGroup2;
        messageObject2 = messageObject;
        anonymousClass1 = new AnonymousClass1(context2, baseFragment, viewGroup4, z, messageObject2, chatActivity, i5, i2, z4, f24, f5, f4, visibleReaction);
        this.windowView = anonymousClass1;
        animationView = new AnimationView(context2);
        this.effectImageView = animationView;
        animationView2 = new AnimationView(context2);
        this.emojiImageView = animationView2;
        animationView3 = new AnimationView(context2);
        this.emojiStaticImageView = animationView3;
        if (visibleReaction.emojicon != null) {
            tL_availableReaction = MediaDataController.getInstance(i).getReactionsMap().get(this.reaction.emojicon);
        } else {
            tL_availableReaction = null;
        }
        if (tL_availableReaction != null) {
        }
        if (tL_availableReaction != null) {
            if (i2 == 0) {
                i7 = i;
                if (i2 == 2) {
                    animationView4 = animationView3;
                    messageObject3 = messageObject2;
                    animatedEmojiDrawable = new AnimatedEmojiDrawable(2, i7, visibleReaction.documentId);
                    animatedEmojiDrawable.removeView(animationView2);
                    animationView2.animatedEmojiDrawable = animatedEmojiDrawable;
                    if (animationView2.attached) {
                        animatedEmojiDrawable.addView(animationView2);
                    }
                }
                if (i2 != 0) {
                }
                AnimatedEmojiDrawable animatedEmojiDrawable5 = new AnimatedEmojiDrawable(2, i7, visibleReaction.documentId);
                if (messageObject3 != null) {
                    if (messageObject3.shouldDrawWithoutBackground()) {
                        if (messageObject3.isOutOwner()) {
                            i8 = Theme.key_chat_outReactionButtonBackground;
                        } else {
                            i8 = Theme.key_chat_inReactionButtonBackground;
                        }
                    } else if (messageObject3.isOutOwner()) {
                        i8 = Theme.key_chat_outReactionButtonTextSelected;
                    } else {
                        i8 = Theme.key_chat_inReactionButtonTextSelected;
                    }
                    if (baseFragment != null) {
                        resourceProvider = baseFragment.getResourceProvider();
                    } else {
                        resourceProvider = null;
                    }
                    color = Theme.getColor(i8, resourceProvider);
                } else {
                    color = -1;
                }
                animatedEmojiDrawable5.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                if (i2 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                animationView.emojiEffect = new AnimatedEmojiEffect(animatedEmojiDrawable5, UserConfig.selectedAccount, z2, !z2);
                r10 = 0;
                anonymousClass1.setClipChildren(false);
                animationView2.getImageReceiver().setAutoRepeat(r10);
                animationView2.getImageReceiver().setAllowStartAnimation(r10);
                if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                    if (i2 == 2) {
                        animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().metaData[r10] - 1, r10, r10);
                    } else {
                        animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(r10, r10, r10);
                        animationView2.getImageReceiver().getLottieAnimation().start();
                    }
                }
                i9 = i110 - i5;
                i10 = i9 >> 1;
                if (i2 == 1) {
                }
                frameLayout.addView(animationView2);
                animationView2.getLayoutParams().width = i5;
                animationView2.getLayoutParams().height = i5;
                ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i10;
                ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i9;
                if (i2 != 1) {
                    if (tL_availableReaction != null) {
                        animationView4.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                    }
                    frameLayout.addView(animationView4);
                    animationView4.getLayoutParams().width = i5;
                    animationView4.getLayoutParams().height = i5;
                    ((FrameLayout.LayoutParams) animationView4.getLayoutParams()).topMargin = i10;
                    ((FrameLayout.LayoutParams) animationView4.getLayoutParams()).leftMargin = i9;
                }
                anonymousClass1.addView(frameLayout);
                frameLayout.getLayoutParams().width = i110;
                frameLayout.getLayoutParams().height = i110;
                int i29 = -i10;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i29;
                int i210 = -i9;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i210;
                anonymousClass1.addView(animationView);
                animationView.getLayoutParams().width = i110;
                animationView.getLayoutParams().height = i110;
                animationView.getLayoutParams().width = i110;
                animationView.getLayoutParams().height = i110;
                ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i29;
                ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i210;
                frameLayout.setPivotX(i9);
                frameLayout.setPivotY(i10);
            }
            i7 = i;
            animatedEmojiDrawable2 = new AnimatedEmojiDrawable(1, i7, visibleReaction.documentId);
            animatedEmojiDrawable2.removeView(animationView2);
            animationView2.animatedEmojiDrawable = animatedEmojiDrawable2;
            if (animationView2.attached) {
                animatedEmojiDrawable2.addView(animationView2);
            }
            animationView4 = animationView3;
            messageObject3 = messageObject2;
            if (i2 != 0) {
            }
            AnimatedEmojiDrawable animatedEmojiDrawable6 = new AnimatedEmojiDrawable(2, i7, visibleReaction.documentId);
            if (messageObject3 != null) {
                if (messageObject3.shouldDrawWithoutBackground()) {
                    if (messageObject3.isOutOwner()) {
                        i8 = Theme.key_chat_outReactionButtonBackground;
                    } else {
                        i8 = Theme.key_chat_inReactionButtonBackground;
                    }
                } else if (messageObject3.isOutOwner()) {
                    i8 = Theme.key_chat_outReactionButtonTextSelected;
                } else {
                    i8 = Theme.key_chat_inReactionButtonTextSelected;
                }
                if (baseFragment != null) {
                    resourceProvider = baseFragment.getResourceProvider();
                } else {
                    resourceProvider = null;
                }
                color = Theme.getColor(i8, resourceProvider);
            } else {
                color = -1;
            }
            animatedEmojiDrawable6.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            if (i2 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            animationView.emojiEffect = new AnimatedEmojiEffect(animatedEmojiDrawable6, UserConfig.selectedAccount, z2, !z2);
            r10 = 0;
            anonymousClass1.setClipChildren(false);
            animationView2.getImageReceiver().setAutoRepeat(r10);
            animationView2.getImageReceiver().setAllowStartAnimation(r10);
            if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                if (i2 == 2) {
                    animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().metaData[r10] - 1, r10, r10);
                } else {
                    animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(r10, r10, r10);
                    animationView2.getImageReceiver().getLottieAnimation().start();
                }
            }
            i9 = i110 - i5;
            i10 = i9 >> 1;
            if (i2 == 1) {
            }
            frameLayout.addView(animationView2);
            animationView2.getLayoutParams().width = i5;
            animationView2.getLayoutParams().height = i5;
            ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i10;
            ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i9;
            if (i2 != 1) {
                if (tL_availableReaction != null) {
                    animationView4.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                }
                frameLayout.addView(animationView4);
                animationView4.getLayoutParams().width = i5;
                animationView4.getLayoutParams().height = i5;
                ((FrameLayout.LayoutParams) animationView4.getLayoutParams()).topMargin = i10;
                ((FrameLayout.LayoutParams) animationView4.getLayoutParams()).leftMargin = i9;
            }
            anonymousClass1.addView(frameLayout);
            frameLayout.getLayoutParams().width = i110;
            frameLayout.getLayoutParams().height = i110;
            int i211 = -i10;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i211;
            int i212 = -i9;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i212;
            anonymousClass1.addView(animationView);
            animationView.getLayoutParams().width = i110;
            animationView.getLayoutParams().height = i110;
            animationView.getLayoutParams().width = i110;
            animationView.getLayoutParams().height = i110;
            ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i211;
            ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i212;
            frameLayout.setPivotX(i9);
            frameLayout.setPivotY(i10);
        }
        i11 = 2;
        if (i2 != 2) {
            r11 = i2 != 1 ? 0 : 0;
            if (animationView.getImageReceiver().getLottieAnimation() != null) {
                animationView.getImageReceiver().getLottieAnimation().setCurrentFrame(r11, r11, r11);
                animationView.getImageReceiver().getLottieAnimation().start();
            }
            i11 = 2;
        }
        if (i2 == i11) {
            if (z) {
                document = tL_availableReaction.select_animation;
            } else {
                document = tL_availableReaction.appear_animation;
            }
            ImageReceiver imageReceiver6 = animationView2.getImageReceiver();
            StringBuilder sb4 = new StringBuilder();
            int i213 = uniqPrefix;
            uniqPrefix = i213 + 1;
            sb4.append(i213);
            sb4.append("_");
            sb4.append(this.messageId);
            sb4.append("_");
            imageReceiver6.setUniqKeyPrefix(sb4.toString());
            animationView2.setImage(ImageLocation.getForDocument(document), DiffUtil.m(i6, i6, "_"), null, null, null, null, 0, null);
        } else if (i2 == 0) {
            TLRPC.Document document4 = tL_availableReaction.activate_animation;
            ImageReceiver imageReceiver7 = animationView2.getImageReceiver();
            StringBuilder sb5 = new StringBuilder();
            int i214 = uniqPrefix;
            uniqPrefix = i214 + 1;
            sb5.append(i214);
            sb5.append("_");
            sb5.append(this.messageId);
            sb5.append("_");
            imageReceiver7.setUniqKeyPrefix(sb5.toString());
            animationView2.setImage(ImageLocation.getForDocument(document4), DiffUtil.m(i6, i6, "_"), null, null, null, null, 0, null);
        }
        animationView4 = animationView3;
        r10 = 0;
        animationView2.getImageReceiver().setAutoRepeat(r10);
        animationView2.getImageReceiver().setAllowStartAnimation(r10);
        if (animationView2.getImageReceiver().getLottieAnimation() != null) {
            if (i2 == 2) {
                animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().metaData[r10] - 1, r10, r10);
            } else {
                animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(r10, r10, r10);
                animationView2.getImageReceiver().getLottieAnimation().start();
            }
        }
        i9 = i110 - i5;
        i10 = i9 >> 1;
        if (i2 == 1) {
        }
        frameLayout.addView(animationView2);
        animationView2.getLayoutParams().width = i5;
        animationView2.getLayoutParams().height = i5;
        ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i10;
        ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i9;
        if (i2 != 1) {
            if (tL_availableReaction != null) {
                animationView4.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
            }
            frameLayout.addView(animationView4);
            animationView4.getLayoutParams().width = i5;
            animationView4.getLayoutParams().height = i5;
            ((FrameLayout.LayoutParams) animationView4.getLayoutParams()).topMargin = i10;
            ((FrameLayout.LayoutParams) animationView4.getLayoutParams()).leftMargin = i9;
        }
        anonymousClass1.addView(frameLayout);
        frameLayout.getLayoutParams().width = i110;
        frameLayout.getLayoutParams().height = i110;
        int i215 = -i10;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i215;
        int i216 = -i9;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i216;
        anonymousClass1.addView(animationView);
        animationView.getLayoutParams().width = i110;
        animationView.getLayoutParams().height = i110;
        animationView.getLayoutParams().width = i110;
        animationView.getLayoutParams().height = i110;
        ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i215;
        ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i216;
        frameLayout.setPivotX(i9);
        frameLayout.setPivotY(i10);
    }

    public static String getFilterForAroundAnimation() {
        StringBuilder sb = new StringBuilder();
        sb.append((int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density));
        sb.append("_");
        return SurfaceContainer$$ExternalSyntheticOutline0.m((int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density), "_nolimit_pcache", sb);
    }

    public static void removeCurrent(boolean z) {
        int i = 0;
        while (i < 2) {
            ReactionsEffectOverlay reactionsEffectOverlay = i == 0 ? currentOverlay : currentShortOverlay;
            if (reactionsEffectOverlay != null) {
                if (z) {
                    reactionsEffectOverlay.removeCurrentView();
                } else {
                    reactionsEffectOverlay.dismissed = true;
                }
            }
            i++;
        }
        currentShortOverlay = null;
        currentOverlay = null;
    }

    public static void show(BaseFragment baseFragment, ReactionsContainerLayout reactionsContainerLayout, BaseCell baseCell, View view, float f, float f2, ReactionsLayoutInBubble.VisibleReaction visibleReaction, int i, int i2) {
        boolean z;
        ActionBarPopupWindow actionBarPopupWindow;
        if (baseCell == null || visibleReaction == null || baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            if (i2 == 2 || i2 == 0) {
                show(baseFragment, null, baseCell, view, 0.0f, 0.0f, visibleReaction, i, 1);
            }
            ReactionsEffectOverlay reactionsEffectOverlay = new ReactionsEffectOverlay(baseFragment.getParentActivity(), baseFragment, reactionsContainerLayout, baseCell, view, f, f2, visibleReaction, i, i2, false);
            if (i2 == 1) {
                currentShortOverlay = reactionsEffectOverlay;
            } else {
                currentOverlay = reactionsEffectOverlay;
            }
            if (baseFragment instanceof ChatActivity) {
                z = (i2 == 0 || i2 == 2) && (actionBarPopupWindow = ((ChatActivity) baseFragment).scrimPopupWindow) != null && actionBarPopupWindow.isShowing();
            }
            reactionsEffectOverlay.useWindow = z;
            AnonymousClass1 anonymousClass1 = reactionsEffectOverlay.windowView;
            if (z) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.height = -1;
                layoutParams.width = -1;
                layoutParams.type = 1000;
                layoutParams.flags = 65816;
                layoutParams.format = -3;
                WindowManager windowManager = baseFragment.getParentActivity().getWindowManager();
                reactionsEffectOverlay.windowManager = windowManager;
                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, anonymousClass1, layoutParams);
                reactionsEffectOverlay.windowManager.addView(anonymousClass1, layoutParams);
            } else {
                ((FrameLayout) baseFragment.getParentActivity().getWindow().getDecorView()).addView(anonymousClass1);
            }
            baseCell.invalidate();
            if (!(baseCell instanceof ChatMessageCell) || ((ChatMessageCell) baseCell).getCurrentMessagesGroup() == null || baseCell.getParent() == null) {
                return;
            }
            ((View) baseCell.getParent()).invalidate();
        }
    }

    public static void startAnimation() {
        ReactionsEffectOverlay reactionsEffectOverlay = currentOverlay;
        if (reactionsEffectOverlay != null) {
            reactionsEffectOverlay.started = true;
            reactionsEffectOverlay.startTime = System.currentTimeMillis();
            if (currentOverlay.animationType != 0 || System.currentTimeMillis() - lastHapticTime <= 200) {
                return;
            }
            lastHapticTime = System.currentTimeMillis();
            currentOverlay.cell.performHapticFeedback(3);
            return;
        }
        startShortAnimation();
        ReactionsEffectOverlay reactionsEffectOverlay2 = currentShortOverlay;
        if (reactionsEffectOverlay2 != null) {
            ViewGroup viewGroup = reactionsEffectOverlay2.cell;
            boolean z = viewGroup instanceof ChatMessageCell;
            ReactionsLayoutInBubble.VisibleReaction visibleReaction = reactionsEffectOverlay2.reaction;
            if (z) {
                ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(visibleReaction);
            } else if (viewGroup instanceof ChatActionCell) {
                ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(visibleReaction);
            }
        }
    }

    public static void startShortAnimation() {
        ReactionsEffectOverlay reactionsEffectOverlay = currentShortOverlay;
        if (reactionsEffectOverlay == null || reactionsEffectOverlay.started) {
            return;
        }
        reactionsEffectOverlay.started = true;
        reactionsEffectOverlay.startTime = System.currentTimeMillis();
        if (currentShortOverlay.animationType != 1 || System.currentTimeMillis() - lastHapticTime <= 200) {
            return;
        }
        lastHapticTime = System.currentTimeMillis();
        ViewGroup viewGroup = currentShortOverlay.cell;
        if (viewGroup != null) {
            viewGroup.performHapticFeedback(3);
        }
    }

    public final void removeCurrentView() {
        try {
            boolean z = this.useWindow;
            AnonymousClass1 anonymousClass1 = this.windowView;
            if (z) {
                this.windowManager.removeView(anonymousClass1);
            } else {
                AndroidUtilities.removeFromParent(anonymousClass1);
            }
        } catch (Exception unused) {
        }
    }
}
