package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.text.Spanned;
import android.util.StateSet;
import android.view.View;
import com.google.zxing.BinaryBitmap;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda71;
import org.telegram.ui.CacheControlActivity;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.DialogCacheBottomSheet;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda17;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;

public final class SeekBarView$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public SeekBarView$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.$r8$classId) {
            case 0:
                ((SeekBarView) this.f$0).getClass();
                break;
            case 1:
                BaseFragment baseFragment = CustomEmojiReactionsWindow.this.baseFragment;
                if (baseFragment instanceof ChatActivity) {
                    baseFragment.showDialog(new PremiumFeatureBottomSheet(baseFragment, 11, false));
                } else {
                    BaseFragment lastFragment = LaunchActivity.getLastFragment();
                    if (lastFragment != null) {
                        lastFragment.showDialog(new PremiumFeatureBottomSheet(baseFragment, 11, false));
                    }
                }
                break;
            case 2:
                ReactionsContainerLayout reactionsContainerLayout = (ReactionsContainerLayout) this.f$0;
                reactionsContainerLayout.reactionsWindow = null;
                reactionsContainerLayout.invalidateLoopViews();
                ReactionsContainerLayout.ReactionsContainerDelegate reactionsContainerDelegate = reactionsContainerLayout.delegate;
                if (reactionsContainerDelegate != null) {
                    reactionsContainerDelegate.onEmojiWindowDismissed();
                }
                break;
            case 3:
                ((ReactionsContainerLayout.ReactionHolderView.AnonymousClass2) this.f$0).this$1.enterImageView.setVisibility(4);
                break;
            case 4:
                RecordedAudioPlayerView recordedAudioPlayerView = (RecordedAudioPlayerView) this.f$0;
                VideoPlayer videoPlayer = recordedAudioPlayerView.player;
                if (videoPlayer != null) {
                    boolean zIsPlaying = videoPlayer.isPlaying();
                    float currentPosition = recordedAudioPlayerView.player.getCurrentPosition() / recordedAudioPlayerView.player.getDuration();
                    float f = recordedAudioPlayerView.left;
                    if (currentPosition < f) {
                        VideoPlayer videoPlayer2 = recordedAudioPlayerView.player;
                        videoPlayer2.seekTo((long) (f * videoPlayer2.getDuration()), false);
                    } else if (currentPosition > recordedAudioPlayerView.right) {
                        recordedAudioPlayerView.setPlaying(false);
                        zIsPlaying = false;
                    }
                    if (zIsPlaying) {
                        AndroidUtilities.runOnUIThread(recordedAudioPlayerView.progressUpdate, 16L);
                    }
                }
                recordedAudioPlayerView.invalidate();
                break;
            case 5:
                RecyclerListView recyclerListView = (RecyclerListView) this.f$0;
                recyclerListView.removeHighlighSelectionRunnable = null;
                recyclerListView.pendingHighlightPosition = null;
                BaseCell.RippleDrawableSafe rippleDrawableSafe = recyclerListView.selectorDrawable;
                if (rippleDrawableSafe != null) {
                    Drawable current = rippleDrawableSafe.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                BaseCell.RippleDrawableSafe rippleDrawableSafe2 = recyclerListView.selectorDrawable;
                if (rippleDrawableSafe2 != null && rippleDrawableSafe2.isStateful()) {
                    recyclerListView.selectorDrawable.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 6:
                SearchDownloadsContainer searchDownloadsContainer = (SearchDownloadsContainer) this.f$0;
                ArrayList<MessageObject> arrayList3 = new ArrayList<>();
                ArrayList<MessageObject> arrayList4 = new ArrayList<>();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                int i = searchDownloadsContainer.currentAccount;
                FileLoader.getInstance(i).getCurrentLoadingFiles(arrayList3);
                FileLoader.getInstance(i).getRecentLoadingFiles(arrayList4);
                for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                    if (FileLoader.getInstance(i).getPathToMessage(arrayList3.get(i2).messageOwner).exists()) {
                        arrayList5.add(arrayList3.get(i2));
                    }
                }
                for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                    if (!FileLoader.getInstance(i).getPathToMessage(arrayList4.get(i3).messageOwner).exists()) {
                        arrayList6.add(arrayList4.get(i3));
                    }
                }
                AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda1(searchDownloadsContainer, arrayList5, arrayList6, 24));
                break;
            case 7:
                ((SearchStateDrawable) this.f$0).invalidateSelf();
                break;
            case 8:
                ((SearchTagsList) this.f$0).premiumLayout.setVisibility(8);
                break;
            case 9:
                ((DialogsActivity.AnonymousClass47) this.f$0).invalidateBlur();
                break;
            case 10:
                ((SearchViewPager) this.f$0).invalidateBlur();
                break;
            case 11:
                ChatMessageCell chatMessageCell = ((SeekBarWaveform) this.f$0).parentView;
                if (chatMessageCell != null) {
                    chatMessageCell.invalidate();
                }
                break;
            case 12:
                SeekSpeedDrawable seekSpeedDrawable = (SeekSpeedDrawable) this.f$0;
                seekSpeedDrawable.showHint = false;
                seekSpeedDrawable.invalidate.run();
                break;
            case 13:
                ((ShareAlert) ((ArticleViewer.AnonymousClass16) this.f$0).this$0).updateSelectedCount(1);
                break;
            case 14:
                ((ShareTopView.Layout) this.f$0).setVisibility(8);
                break;
            case 15:
                ShareTopView shareTopView = (ShareTopView) this.f$0;
                int i4 = shareTopView.currentMode;
                ShareTopView.Layout[] layoutArr = shareTopView.layouts;
                if (i4 != 1) {
                    for (ShareTopView.Layout layout : layoutArr) {
                        layout.obj.setAlpha(1.0f);
                        SimpleTextView simpleTextView = layout.obj;
                        simpleTextView.setScaleX(1.0f);
                        simpleTextView.setScaleY(1.0f);
                        layout.objHint.setAlpha(0.0f);
                    }
                    shareTopView.showingHint = false;
                    AndroidUtilities.runOnUIThread(shareTopView.hintRunnable, 4000L);
                } else {
                    shareTopView.showingHint = !shareTopView.showingHint;
                    for (ShareTopView.Layout layout2 : layoutArr) {
                        layout2.obj.setPivotX(0.0f);
                        SimpleTextView simpleTextView2 = layout2.objHint;
                        simpleTextView2.setPivotX(0.0f);
                        boolean z = shareTopView.showingHint;
                        SimpleTextView simpleTextView3 = layout2.obj;
                        if (z) {
                            simpleTextView3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            simpleTextView2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            simpleTextView3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            simpleTextView2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                    }
                    AndroidUtilities.runOnUIThread(shareTopView.hintRunnable, 4000L);
                }
                break;
            case 16:
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                if (sharedMediaLayout.isActionModeShowed) {
                    sharedMediaLayout.showActionMode$1(false);
                }
                break;
            case 17:
                SharedMediaLayout.this.switchToCurrentSelectedMode(false);
                break;
            case 18:
                BaseFragment baseFragment2 = SharedMediaLayout.this.profileActivity;
                if (baseFragment2 != null) {
                    baseFragment2.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                }
                break;
            case 19:
                ((SeekBarView$$ExternalSyntheticLambda1) this.f$0).run();
                break;
            case 20:
                SharedMediaLayout.SavedDialogsAdapter savedDialogsAdapter = (SharedMediaLayout.SavedDialogsAdapter) this.f$0;
                if (savedDialogsAdapter.orderChanged) {
                    int i5 = 0;
                    savedDialogsAdapter.orderChanged = false;
                    ArrayList<Long> arrayList7 = new ArrayList<>();
                    while (true) {
                        ArrayList arrayList8 = savedDialogsAdapter.dialogs;
                        if (i5 >= arrayList8.size()) {
                            SharedMediaLayout.this.profileActivity.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList7);
                        } else {
                            if (((SavedMessagesController.SavedDialog) arrayList8.get(i5)).pinned) {
                                arrayList7.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList8.get(i5)).dialogId));
                            }
                            i5++;
                        }
                        break;
                    }
                }
                break;
            case 21:
                ((SharedMediaLayout.SavedMessagesSearchAdapter) this.f$0).sendRequest();
                break;
            case 22:
                ((SizeNotifierFrameLayout) this.f$0).updateBlurContent();
                break;
            case 23:
                ((SmoothScroller) this.f$0).getClass();
                break;
            case 24:
                StickerCategoriesListView.CategoryButton categoryButton = (StickerCategoriesListView.CategoryButton) this.f$0;
                if (!categoryButton.loaded) {
                    categoryButton.loadProgress = 0.0f;
                }
                break;
            case 25:
                BinaryBitmap binaryBitmap = ((DialogCacheBottomSheet.AnonymousClass2) ((StorageDiagramView) this.f$0)).val$delegate;
                ((CacheControlActivity) binaryBitmap.matrix).bottomSheet.lambda$showGiftOfferSheet$15();
                Bundle bundle = new Bundle();
                long j = ((CacheControlActivity.DialogFileEntities) binaryBitmap.binarizer).dialogId;
                if (j > 0) {
                    bundle.putLong("user_id", j);
                } else {
                    bundle.putLong("chat_id", -j);
                }
                ((CacheControlActivity) binaryBitmap.matrix).presentFragment(new ProfileActivity(bundle, null));
                break;
            case 26:
                SuggestEmojiView suggestEmojiView = (SuggestEmojiView) this.f$0;
                suggestEmojiView.updateRunnable = null;
                SuggestEmojiView.AnchorViewDelegate anchorViewDelegate = suggestEmojiView.enterView;
                if (anchorViewDelegate == null || anchorViewDelegate.getEditField() == null || suggestEmojiView.enterView.getFieldText() == null) {
                    suggestEmojiView.show = false;
                    suggestEmojiView.forceClose = true;
                    SuggestEmojiView.AnonymousClass2 anonymousClass2 = suggestEmojiView.containerView;
                    if (anonymousClass2 != null) {
                        anonymousClass2.invalidate();
                    }
                } else {
                    int selectionStart = suggestEmojiView.enterView.getEditField().getSelectionStart();
                    int selectionEnd = suggestEmojiView.enterView.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        suggestEmojiView.show = false;
                        SuggestEmojiView.AnonymousClass2 anonymousClass3 = suggestEmojiView.containerView;
                        if (anonymousClass3 != null) {
                            anonymousClass3.invalidate();
                        }
                    } else {
                        CharSequence fieldText = suggestEmojiView.enterView.getFieldText();
                        boolean z2 = fieldText instanceof Spanned;
                        Emoji.EmojiSpan[] emojiSpanArr = z2 ? (Emoji.EmojiSpan[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, Emoji.EmojiSpan.class) : null;
                        int i6 = suggestEmojiView.currentAccount;
                        if (emojiSpanArr == null || emojiSpanArr.length <= 0 || !SharedConfig.suggestAnimatedEmoji || !UserConfig.getInstance(i6).isPremium()) {
                            AnimatedEmojiSpan[] animatedEmojiSpanArr = z2 ? (AnimatedEmojiSpan[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, AnimatedEmojiSpan.class) : null;
                            if ((animatedEmojiSpanArr == null || animatedEmojiSpanArr.length == 0) && selectionEnd < 52) {
                                suggestEmojiView.show = true;
                                suggestEmojiView.createListView$1();
                                suggestEmojiView.arrowToSpan = null;
                                String strSubstring = fieldText.toString().substring(0, selectionEnd);
                                if (strSubstring != null) {
                                    String str = suggestEmojiView.lastQuery;
                                    if (str == null || suggestEmojiView.lastQueryType != 1 || !str.equals(strSubstring) || suggestEmojiView.clear || (arrayList = suggestEmojiView.keywordResults) == null || arrayList.isEmpty()) {
                                        int i7 = suggestEmojiView.lastQueryId + 1;
                                        suggestEmojiView.lastQueryId = i7;
                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                        if (suggestEmojiView.lastLang == null || Math.abs(jCurrentTimeMillis - suggestEmojiView.lastLangChangedTime) > 360) {
                                            suggestEmojiView.lastLangChangedTime = jCurrentTimeMillis;
                                            currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                        } else {
                                            suggestEmojiView.lastLangChangedTime = jCurrentTimeMillis;
                                            currentKeyboardLanguage = suggestEmojiView.lastLang;
                                        }
                                        String[] strArr = suggestEmojiView.lastLang;
                                        if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                            MediaDataController.getInstance(i6).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                        }
                                        suggestEmojiView.lastLang = currentKeyboardLanguage;
                                        Runnable runnable = suggestEmojiView.searchRunnable;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                            suggestEmojiView.searchRunnable = null;
                                        }
                                        suggestEmojiView.searchRunnable = new ArticleViewer$$ExternalSyntheticLambda71(suggestEmojiView, currentKeyboardLanguage, strSubstring, i7, 27);
                                        ArrayList arrayList9 = suggestEmojiView.keywordResults;
                                        if (arrayList9 == null || arrayList9.isEmpty()) {
                                            AndroidUtilities.runOnUIThread(suggestEmojiView.searchRunnable, 600L);
                                        } else {
                                            suggestEmojiView.searchRunnable.run();
                                        }
                                    } else {
                                        suggestEmojiView.forceClose = false;
                                        suggestEmojiView.createListView$1();
                                        suggestEmojiView.containerView.setVisibility(0);
                                        suggestEmojiView.lastSpanY = AndroidUtilities.dp(10.0f);
                                        suggestEmojiView.containerView.invalidate();
                                    }
                                }
                                SuggestEmojiView.AnonymousClass2 anonymousClass4 = suggestEmojiView.containerView;
                                if (anonymousClass4 != null) {
                                    anonymousClass4.invalidate();
                                }
                            }
                        } else {
                            Emoji.EmojiSpan emojiSpan = emojiSpanArr[emojiSpanArr.length - 1];
                            if (emojiSpan != null) {
                                Spanned spanned = (Spanned) fieldText;
                                int spanStart = spanned.getSpanStart(emojiSpan);
                                int spanEnd = spanned.getSpanEnd(emojiSpan);
                                if (selectionStart == spanEnd) {
                                    String strSubstring2 = fieldText.toString().substring(spanStart, spanEnd);
                                    suggestEmojiView.show = true;
                                    suggestEmojiView.createListView$1();
                                    suggestEmojiView.arrowToSpan = emojiSpan;
                                    suggestEmojiView.arrowToEnd = null;
                                    suggestEmojiView.arrowToStart = null;
                                    if (strSubstring2 != null) {
                                        String str2 = suggestEmojiView.lastQuery;
                                        if (str2 == null || suggestEmojiView.lastQueryType != 2 || !str2.equals(strSubstring2) || suggestEmojiView.clear || (arrayList2 = suggestEmojiView.keywordResults) == null || arrayList2.isEmpty()) {
                                            int i8 = suggestEmojiView.lastQueryId + 1;
                                            suggestEmojiView.lastQueryId = i8;
                                            Runnable runnable2 = suggestEmojiView.searchRunnable;
                                            if (runnable2 != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable2);
                                            }
                                            suggestEmojiView.searchRunnable = new PollItemMenu$$ExternalSyntheticLambda17(suggestEmojiView, strSubstring2, i8, 12);
                                            ArrayList arrayList10 = suggestEmojiView.keywordResults;
                                            if (arrayList10 == null || arrayList10.isEmpty()) {
                                                AndroidUtilities.runOnUIThread(suggestEmojiView.searchRunnable, 600L);
                                            } else {
                                                suggestEmojiView.searchRunnable.run();
                                            }
                                        } else {
                                            suggestEmojiView.forceClose = false;
                                            suggestEmojiView.createListView$1();
                                            SuggestEmojiView.AnonymousClass2 anonymousClass5 = suggestEmojiView.containerView;
                                            if (anonymousClass5 != null) {
                                                anonymousClass5.setVisibility(0);
                                                suggestEmojiView.containerView.invalidate();
                                            }
                                        }
                                    }
                                    SuggestEmojiView.AnonymousClass2 anonymousClass6 = suggestEmojiView.containerView;
                                    if (anonymousClass6 != null) {
                                        anonymousClass6.invalidate();
                                    }
                                }
                            }
                        }
                        Runnable runnable3 = suggestEmojiView.searchRunnable;
                        if (runnable3 != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable3);
                            suggestEmojiView.searchRunnable = null;
                        }
                        suggestEmojiView.show = false;
                        SuggestEmojiView.AnonymousClass2 anonymousClass7 = suggestEmojiView.containerView;
                        if (anonymousClass7 != null) {
                            anonymousClass7.invalidate();
                        }
                    }
                }
                break;
            case 27:
                SwipeGestureSettingsView swipeGestureSettingsView = (SwipeGestureSettingsView) this.f$0;
                swipeGestureSettingsView.swapIconRunnable = null;
                swipeGestureSettingsView.swapIcons();
                break;
            case 28:
                ((TextSelectionHint) this.f$0).hideInternal();
                break;
            default:
                int i9 = 0;
                while (true) {
                    ArrayList arrayList11 = ((ThanosEffect.DrawingThread.Animation) this.f$0).views;
                    if (i9 < arrayList11.size()) {
                        ((View) arrayList11.get(i9)).setVisibility(8);
                        if (arrayList11.get(i9) instanceof ChatMessageCell) {
                            ((ChatMessageCell) arrayList11.get(i9)).setCheckBoxVisible(false, false);
                            ((ChatMessageCell) arrayList11.get(i9)).setChecked(false, false, false);
                        }
                        i9++;
                    }
                    break;
                }
                break;
        }
    }
}
