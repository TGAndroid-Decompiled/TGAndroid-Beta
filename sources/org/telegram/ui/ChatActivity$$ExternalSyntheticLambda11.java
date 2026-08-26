package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.text.Layout;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import org.commonmark.internal.InlineParserImpl;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.Bulletin$2$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.ChatReplyContainer$Layout;
import org.telegram.ui.Components.ChecksHintView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.InstantCameraView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.chat.buttons.ChatActivityBlurredRoundPageDownButton;
import org.telegram.ui.Components.chat.layouts.ChatActivitySideControlsButtonsLayout;
import org.telegram.ui.Stories.recorder.HintView2;

public final class ChatActivity$$ExternalSyntheticLambda11 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda11(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final void run() {
        float timeY;
        ChatActivity.AnonymousClass39 anonymousClass39;
        ChatMessageCell chatMessageCell;
        MessageObject messageObject;
        int i = 3;
        ChatMessageCell chatMessageCell2 = null;
        int i2 = 2;
        int i3 = 0;
        char c = 1;
        final ChatActivity chatActivity = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                chatActivity.getClass();
                FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, -2, 87);
                layoutParamsCreateFrame.bottomMargin = chatActivity.chatActivityEnterView.getMeasuredHeight();
                chatActivity.contentView.addView(chatActivity.groupEmojiPackHint, layoutParamsCreateFrame);
                chatActivity.groupEmojiPackHint.setTranslationY(-AndroidUtilities.navigationBarHeight);
                chatActivity.groupEmojiPackHint.setJointPx(0.0f, chatActivity.chatActivityEnterView.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                chatActivity.groupEmojiPackHint.show();
                break;
            case 1:
                chatActivity.chatInviteRunnable = null;
                if (chatActivity.getParentActivity() != null) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(chatActivity.getParentActivity(), 0, chatActivity.themeDelegate);
                    boolean zIsChannel = ChatObject.isChannel(chatActivity.currentChat);
                    AlertDialog alertDialog = builder.alertDialog;
                    if (!zIsChannel || chatActivity.currentChat.megagroup) {
                        alertDialog.message = LocaleController.getString(R.string.JoinByPeekGroupText);
                        alertDialog.title = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    } else {
                        alertDialog.message = LocaleController.getString(R.string.JoinByPeekChannelText);
                        alertDialog.title = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    }
                    builder.setPositiveButton(LocaleController.getString(R.string.JoinByPeekJoin), new ChatActivity$$ExternalSyntheticLambda50(chatActivity, 1));
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new ChatActivity$$ExternalSyntheticLambda50(chatActivity, i2));
                    chatActivity.showDialog(alertDialog);
                    break;
                }
                break;
            case 2:
                chatActivity.checkSavedMessagesHint();
                break;
            case 3:
                if (!chatActivity.shownConversionDateTimeToast && chatActivity.isFullyVisible && chatActivity.chatListView.mIsAttached && chatActivity.getParentActivity() != null) {
                    int[] iArr = new int[2];
                    for (int childCount = chatActivity.chatListView.getChildCount() - 1; childCount >= 0; childCount--) {
                        View childAt = chatActivity.chatListView.getChildAt(childCount);
                        if (childAt instanceof ChatMessageCell) {
                            ChatMessageCell chatMessageCell3 = (ChatMessageCell) childAt;
                            if (chatMessageCell3.getMessageObject() != null && chatMessageCell3.getMessageObject().messageOwner != null && chatMessageCell3.getMessageObject().messageOwner.video_processing_pending) {
                                if (chatMessageCell3.getCurrentPosition() == null) {
                                    chatMessageCell3.getLocationInWindow(iArr);
                                    timeY = chatMessageCell3.getTimeY() + iArr[1];
                                    if (timeY >= AndroidUtilities.dp(240.0f) && timeY <= (AndroidUtilities.displaySize.y - AndroidUtilities.dp(25.0f)) - AndroidUtilities.navigationBarHeight) {
                                        chatMessageCell2 = chatMessageCell3;
                                        if (chatMessageCell2 != null) {
                                            chatActivity.shownConversionDateTimeToast = true;
                                            ?? r3 = new HintView2(chatActivity.getParentActivity()) {
                                                public AnonymousClass94(Activity activity) {
                                                    super(activity, 3);
                                                }

                                                @Override
                                                public final void onLayout(boolean z, int i4, int i5, int i6, int i7) {
                                                    super.onLayout(z, i4, i5, i6, i7);
                                                    setTranslationY(((-getTop()) - AndroidUtilities.dp(120.0f)) + ChatActivity.this.videoConversionTimeHintY);
                                                }
                                            };
                                            r3.setMultilineText(true);
                                            r3.textLayoutAlignment = Layout.Alignment.ALIGN_CENTER;
                                            r3.duration = 3500L;
                                            r3.hideByTouch = true;
                                            r3.useScale = true;
                                            r3.textMaxWidth = AndroidUtilities.dp(150.0f);
                                            r3.setRounding(8.0f);
                                            chatActivity.videoConversionTimeHint = r3;
                                            r3.setText(LocaleController.getString(R.string.VideoConversionTimeInfo));
                                            chatActivity.contentView.addView(chatActivity.videoConversionTimeHint, LayoutHelper.createFrame(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                                            chatMessageCell2.getLocationInWindow(iArr);
                                            chatActivity.videoConversionTimeHintY = chatMessageCell2.getTimeY() + iArr[1];
                                            ChatActivity.AnonymousClass94 anonymousClass94 = chatActivity.videoConversionTimeHint;
                                            anonymousClass94.setTranslationY(((-anonymousClass94.getTop()) - AndroidUtilities.dp(120.0f)) + chatActivity.videoConversionTimeHintY);
                                            chatActivity.videoConversionTimeHint.setJointPx(0.0f, (chatMessageCell2.timeWidth / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + chatMessageCell2.timeX);
                                            chatActivity.videoConversionTimeHint.show();
                                        } else {
                                            AndroidUtilities.cancelRunOnUIThread(new ChatActivity$$ExternalSyntheticLambda11(chatActivity, i));
                                            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda11(chatActivity, i), 2000L);
                                        }
                                        break;
                                    }
                                } else if (chatMessageCell3.getMessageObject() != null && (chatMessageCell3.getCurrentPosition().flags & 8) != 0) {
                                    if ((chatMessageCell3.getCurrentPosition().flags & (chatMessageCell3.getMessageObject().isOutOwner() ? 1 : 2)) != 0) {
                                        chatMessageCell3.getLocationInWindow(iArr);
                                        timeY = chatMessageCell3.getTimeY() + iArr[1];
                                        if (timeY >= AndroidUtilities.dp(240.0f)) {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                    if (chatMessageCell2 != null) {
                        chatActivity.shownConversionDateTimeToast = true;
                        ?? r4 = new HintView2(chatActivity.getParentActivity()) {
                            public AnonymousClass94(Activity activity) {
                                super(activity, 3);
                            }

                            @Override
                            public final void onLayout(boolean z, int i4, int i5, int i6, int i7) {
                                super.onLayout(z, i4, i5, i6, i7);
                                setTranslationY(((-getTop()) - AndroidUtilities.dp(120.0f)) + ChatActivity.this.videoConversionTimeHintY);
                            }
                        };
                        r4.setMultilineText(true);
                        r4.textLayoutAlignment = Layout.Alignment.ALIGN_CENTER;
                        r4.duration = 3500L;
                        r4.hideByTouch = true;
                        r4.useScale = true;
                        r4.textMaxWidth = AndroidUtilities.dp(150.0f);
                        r4.setRounding(8.0f);
                        chatActivity.videoConversionTimeHint = r4;
                        r4.setText(LocaleController.getString(R.string.VideoConversionTimeInfo));
                        chatActivity.contentView.addView(chatActivity.videoConversionTimeHint, LayoutHelper.createFrame(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                        chatMessageCell2.getLocationInWindow(iArr);
                        chatActivity.videoConversionTimeHintY = chatMessageCell2.getTimeY() + iArr[1];
                        ChatActivity.AnonymousClass94 anonymousClass95 = chatActivity.videoConversionTimeHint;
                        anonymousClass95.setTranslationY(((-anonymousClass95.getTop()) - AndroidUtilities.dp(120.0f)) + chatActivity.videoConversionTimeHintY);
                        chatActivity.videoConversionTimeHint.setJointPx(0.0f, (chatMessageCell2.timeWidth / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + chatMessageCell2.timeX);
                        chatActivity.videoConversionTimeHint.show();
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(new ChatActivity$$ExternalSyntheticLambda11(chatActivity, i));
                        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda11(chatActivity, i), 2000L);
                    }
                    break;
                }
                break;
            case 4:
                chatActivity.getClass();
                if (!BaseFragment.hasSheets(chatActivity) && (anonymousClass39 = chatActivity.chatActivityEnterView) != null) {
                    anonymousClass39.setFieldFocused(true);
                    chatActivity.chatActivityEnterView.openKeyboard();
                    break;
                }
                break;
            case 5:
                chatActivity.invalidateChatListViewTopPadding();
                AndroidUtilities.forEachViews((RecyclerView) chatActivity.chatListView, (Consumer) new ChatActivity$$ExternalSyntheticLambda93(chatActivity, i2));
                chatActivity.checkUi_topPanelLayoutWidth();
                ChatActivity.AnonymousClass29 anonymousClass29 = chatActivity.floatingDateView;
                if (anonymousClass29 != null) {
                    anonymousClass29.setTranslationX(chatActivity.getSideMenuWidth() / 2.0f);
                }
                ChatActivity.AnonymousClass28 anonymousClass28 = chatActivity.floatingTopicSeparator;
                if (anonymousClass28 != null) {
                    anonymousClass28.setTranslationX(chatActivity.getSideMenuWidth() / 2.0f);
                }
                FrameLayout frameLayout = chatActivity.emptyViewContainer;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(chatActivity.getSideMenuWidth() / 2.0f);
                }
                chatActivity.checkInsets();
                chatActivity.checkUi_topFade();
                break;
            case 6:
                TopicCreateFragment topicCreateFragmentCreate = TopicCreateFragment.create(-chatActivity.dialog_id, 0L);
                topicCreateFragmentCreate.openInChatActivity = chatActivity;
                chatActivity.presentFragment(topicCreateFragmentCreate);
                break;
            case 7:
                ChatActivitySideControlsButtonsLayout chatActivitySideControlsButtonsLayout = chatActivity.sideControlsButtonsLayout;
                InlineParserImpl.DelimiterData[] delimiterDataArr = chatActivitySideControlsButtonsLayout.pendingStates;
                if (delimiterDataArr[1] == null) {
                    delimiterDataArr[1] = new InlineParserImpl.DelimiterData(3);
                }
                delimiterDataArr[1].canClose = true;
                ChatActivity.AnonymousClass117 anonymousClass117 = chatActivitySideControlsButtonsLayout.buttonHolders[1];
                if (anonymousClass117 != null) {
                    ((ChatActivityBlurredRoundPageDownButton) anonymousClass117.val$primaryMessage).buttonView.showLoading(true, true);
                }
                break;
            case 8:
                int childCount2 = chatActivity.chatListView.getChildCount();
                while (i3 < childCount2) {
                    View childAt2 = chatActivity.chatListView.getChildAt(i3);
                    if (childAt2 instanceof ChatMessageCell) {
                        ChatMessageCell chatMessageCell4 = (ChatMessageCell) childAt2;
                        if (chatMessageCell4.getMessageObject().type == 4) {
                            chatMessageCell4.forceResetMessageObject();
                        }
                    }
                    i3++;
                }
                break;
            case 9:
                chatActivity.pinnedProgressIsShowing = true;
                chatActivity.updatePinnedListButton(true);
                break;
            case 10:
                ChatActivity.AnonymousClass58 anonymousClass58 = chatActivity.tagSelector;
                if (anonymousClass58 != null) {
                    anonymousClass58.requestLayout();
                }
                break;
            case 11:
                AndroidUtilities.forEachViews((RecyclerView) chatActivity.chatListView, (Consumer) new ChatActivity$$ExternalSyntheticLambda151(4));
                ChatActivity.ChatActivityAdapter chatActivityAdapter = chatActivity.chatAdapter;
                if (chatActivityAdapter != null) {
                    chatActivityAdapter.notifyDataSetChanged(true);
                }
                break;
            case 12:
                TLRPC.UserFull userFull = chatActivity.userInfo;
                chatActivity.setChatThemeEmoticon(userFull != null ? userFull.theme : null);
                break;
            case 13:
                chatActivity.lambda$showGigagroupConvertAlert$201();
                break;
            case 14:
                AndroidUtilities.forEachViews((RecyclerView) chatActivity.chatListView, (Consumer) new ChatActivity$$ExternalSyntheticLambda151(i3));
                ChatActivity.ChatActivityAdapter chatActivityAdapter2 = chatActivity.chatAdapter;
                if (chatActivityAdapter2 != null) {
                    chatActivityAdapter2.notifyDataSetChanged(false);
                }
                break;
            case 15:
                chatActivity.showBottomOverlayProgress(false, true);
                break;
            case 16:
                chatActivity.updateMessagesVisiblePart$1();
                break;
            case 17:
                chatActivity.toggleMute(true);
                break;
            case 18:
                chatActivity.checkSavedMessagesTagHint();
                break;
            case 19:
                chatActivity.chatActivityEnterView.openKeyboard();
                break;
            case 20:
                chatActivity.closeInstantCameraAnimation = null;
                ChatActivity.AnonymousClass62 anonymousClass62 = chatActivity.instantCameraView;
                if (anonymousClass62 != null) {
                    InstantCameraView.InstantViewCameraContainer cameraContainer = anonymousClass62.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<InstantCameraView.InstantViewCameraContainer, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<InstantCameraView.InstantViewCameraContainer, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<InstantCameraView.InstantViewCameraContainer, Float>) property, 0.0f), ObjectAnimator.ofFloat(chatActivity.instantCameraView.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(chatActivity.instantCameraView.getPaint(), AnimationProperties.PAINT_ALPHA, 0), ObjectAnimator.ofFloat(chatActivity.instantCameraView.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new ChatActivity.AnonymousClass65(chatActivity, 1));
                    animatorSet.start();
                    break;
                }
                break;
            case 21:
                ChatActivity chatActivity2 = this.f$0;
                int i4 = chatActivity2.nextScrollToMessageId;
                if (i4 != 0) {
                    chatActivity2.scrollToMessageId(i4, chatActivity2.nextScrollFromMessageId, chatActivity2.nextScrollSelect, chatActivity2.nextScrollLoadIndex, chatActivity2.nextScrollForce, chatActivity2.nextScrollForcePinnedMessageId);
                    chatActivity2.nextScrollToMessageId = 0;
                }
                break;
            case 22:
                if (!chatActivity.scrollingChatListView && chatActivity.chatListView != null && chatActivity.getParentActivity() != null && chatActivity.fragmentView != null) {
                    ChecksHintView checksHintView = chatActivity.checksHintView;
                    if (checksHintView == null || checksHintView.getTag() == null) {
                        if (chatActivity.checksHintView == null) {
                            ChatActivity.ChatActivityFragmentView chatActivityFragmentView = chatActivity.contentView;
                            int iIndexOfChild = chatActivityFragmentView.indexOfChild(chatActivity.chatInputViewsContainer);
                            if (iIndexOfChild != -1) {
                                ChecksHintView checksHintView2 = new ChecksHintView(chatActivity.getParentActivity(), chatActivity.themeDelegate);
                                chatActivity.checksHintView = checksHintView2;
                                chatActivityFragmentView.addView(checksHintView2, iIndexOfChild + 1, LayoutHelper.createFrame(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                chatActivity.checksHintView.setAlpha(0.0f);
                                chatActivity.checksHintView.setVisibility(4);
                            }
                        }
                        int childCount3 = chatActivity.chatListView.getChildCount();
                        int i5 = 0;
                        while (i5 < childCount3) {
                            View childAt3 = chatActivity.chatListView.getChildAt(i5);
                            if ((childAt3 instanceof ChatMessageCell) && (messageObject = (chatMessageCell = (ChatMessageCell) childAt3).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                ChecksHintView checksHintView3 = chatActivity.checksHintView;
                                Bulletin$2$$ExternalSyntheticLambda1 bulletin$2$$ExternalSyntheticLambda1 = checksHintView3.hideRunnable;
                                if (bulletin$2$$ExternalSyntheticLambda1 != null) {
                                    AndroidUtilities.cancelRunOnUIThread(bulletin$2$$ExternalSyntheticLambda1);
                                    checksHintView3.hideRunnable = null;
                                }
                                int[] iArr2 = new int[2];
                                chatMessageCell.getLocationInWindow(iArr2);
                                int i6 = iArr2[c];
                                ((View) checksHintView3.getParent()).getLocationInWindow(iArr2);
                                int i7 = i6 - iArr2[1];
                                View view = (View) chatMessageCell.getParent();
                                checksHintView3.measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                                if (i7 > AndroidUtilities.dp(10.0f) + checksHintView3.getMeasuredHeight()) {
                                    int iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(chatMessageCell.getChecksY(), 6.0f, i7);
                                    int iDp = AndroidUtilities.dp(5.0f) + chatMessageCell.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = iM - checksHintView3.getMeasuredHeight();
                                    checksHintView3.translationY = measuredHeight;
                                    checksHintView3.setTranslationY(measuredHeight);
                                    int left = chatMessageCell.getLeft() + iDp;
                                    int iDp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - checksHintView3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        checksHintView3.setTranslationX(measuredWidth2);
                                        iDp2 += measuredWidth2;
                                    } else {
                                        checksHintView3.setTranslationX(0.0f);
                                    }
                                    int left2 = (chatMessageCell.getLeft() + iDp) - iDp2;
                                    ImageView imageView = checksHintView3.arrowImageView;
                                    float measuredWidth3 = left2 - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(measuredWidth3);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (measuredWidth3 < AndroidUtilities.dp(10.0f)) {
                                            float fDp = measuredWidth3 - AndroidUtilities.dp(10.0f);
                                            checksHintView3.setTranslationX(checksHintView3.getTranslationX() + fDp);
                                            imageView.setTranslationX(measuredWidth3 - fDp);
                                        }
                                    } else if (measuredWidth3 > checksHintView3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth4 = (measuredWidth3 - checksHintView3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        checksHintView3.setTranslationX(measuredWidth4);
                                        imageView.setTranslationX(measuredWidth3 - measuredWidth4);
                                    } else if (measuredWidth3 < AndroidUtilities.dp(10.0f)) {
                                        float fDp2 = measuredWidth3 - AndroidUtilities.dp(10.0f);
                                        checksHintView3.setTranslationX(checksHintView3.getTranslationX() + fDp2);
                                        imageView.setTranslationX(measuredWidth3 - fDp2);
                                    }
                                    checksHintView3.setPivotX(measuredWidth3);
                                    checksHintView3.setPivotY(checksHintView3.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = checksHintView3.animatorSet;
                                    if (animatorSet2 != null) {
                                        animatorSet2.cancel();
                                        checksHintView3.animatorSet = null;
                                    }
                                    checksHintView3.setTag(1);
                                    checksHintView3.setVisibility(0);
                                    AnimatorSet animatorSet3 = new AnimatorSet();
                                    checksHintView3.animatorSet = animatorSet3;
                                    animatorSet3.playTogether(ObjectAnimator.ofFloat(checksHintView3, (Property<ChecksHintView, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(checksHintView3, (Property<ChecksHintView, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(checksHintView3, (Property<ChecksHintView, Float>) View.SCALE_Y, 0.0f, 1.0f));
                                    checksHintView3.animatorSet.addListener(new ChecksHintView.AnonymousClass1(checksHintView3, 0));
                                    checksHintView3.animatorSet.setDuration(180L);
                                    checksHintView3.animatorSet.start();
                                    while (i3 < 2) {
                                        checksHintView3.textView[i3].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(CubicBezierInterpolator.EASE_IN).setStartDelay((i3 == 0 ? 132 : 500) + 140).setDuration(100L).setListener(new ArticleViewer.AnonymousClass3(checksHintView3, i3, 4)).start();
                                        i3++;
                                    }
                                    chatActivity.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
                                    break;
                                }
                            }
                            i5++;
                            c = 1;
                        }
                    }
                    break;
                }
                break;
            case 23:
                chatActivity.lambda$firstLoadMessages$18();
                break;
            case 24:
                ChatActivity.AnonymousClass39 anonymousClass310 = chatActivity.chatActivityEnterView;
                if (anonymousClass310 != null && chatActivity.fieldPanelShown != 5) {
                    anonymousClass310.openKeyboard();
                    break;
                }
                break;
            case 25:
                ChatReplyContainer$Layout chatReplyContainer$Layout = ((ChatReplyContainer$Layout[]) chatActivity.replyLayout.this$0)[0];
                SimpleTextView simpleTextView = chatReplyContainer$Layout.obj;
                SimpleTextView simpleTextView2 = chatReplyContainer$Layout.objHint;
                chatActivity.showTapForForwardingOptionsHit = !chatActivity.showTapForForwardingOptionsHit;
                simpleTextView.setPivotX(0.0f);
                simpleTextView2.setPivotX(0.0f);
                if (chatActivity.showTapForForwardingOptionsHit) {
                    simpleTextView.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    simpleTextView2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    simpleTextView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    simpleTextView2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(chatActivity.tapForForwardingOptionsHitRunnable, 6000L);
                break;
            case 26:
                chatActivity.openVideoEditor(null, chatActivity.startVideoEdit);
                chatActivity.startVideoEdit = null;
                break;
            case 27:
                chatActivity.closeMenu(true);
                break;
            case 28:
                chatActivity.closeMenu(true);
                break;
            default:
                chatActivity.getNotificationCenter().onAnimationFinish(chatActivity.transitionAnimationIndex);
                break;
        }
    }
}
