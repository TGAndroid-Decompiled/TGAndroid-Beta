package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.widget.ImageView;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.framework.media.zzq;
import com.google.common.base.Splitter;
import com.stripe.android.Stripe;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.browser.Browser;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.PaddedListAdapter;
import org.telegram.ui.Components.Paint.Painting;
import org.telegram.ui.Components.Paint.RenderView;
import org.telegram.ui.Components.Paint.Shape;
import org.telegram.ui.Components.Paint.ShapeDetector;
import org.telegram.ui.Components.Paint.UndoStore;
import org.telegram.ui.ComposeDrawable$$ExternalSyntheticLambda0;
import org.telegram.ui.DialogsActivity;

public final class HintView$1$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public HintView$1$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        PaddedListAdapter paddedListAdapter;
        float fDp;
        int i;
        float fMax;
        SpringAnimation springAnimation;
        Integer numValueOf = null;
        int i2 = 0;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((HintView.AnonymousClass1) obj).this$0.hide(true);
                break;
            case 1:
                Browser.openUrl(EmbedBottomSheet.this.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 2:
                EmbedBottomSheet embedBottomSheet = EmbedBottomSheet.this;
                embedBottomSheet.progressBar.setVisibility(4);
                embedBottomSheet.progressBarBlackBackground.setVisibility(4);
                ImageView imageView = embedBottomSheet.pipButton;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 3:
                ((EmojiPacksAlert.EmojiPackHeader) obj).toggle(true, true);
                break;
            case 4:
                ((EmojiView.SearchRunnable) obj).loadNext();
                break;
            case 5:
                EmojiView.AnonymousClass3 anonymousClass3 = (EmojiView.AnonymousClass3) obj;
                if (anonymousClass3.chatActivityEnterView.getEmojiView() != null) {
                    EmojiView emojiView = anonymousClass3.chatActivityEnterView.getEmojiView();
                    if (!emojiView.emojiSmoothScrolling) {
                        try {
                            int i3 = emojiView.emojiAdapter.sectionToPosition.get(EmojiData.dataColored.length);
                            if (i3 > 0) {
                                emojiView.emojiGridView.stopScroll();
                                emojiView.updateEmojiTabsPosition(i3);
                                emojiView.scrollEmojisToPosition(i3, AndroidUtilities.dp(-9.0f));
                                emojiView.checkEmojiTabY(null, 0);
                            }
                        } catch (Exception unused) {
                            return;
                        }
                        break;
                    }
                }
                break;
            case 6:
                EmojiView.EmojiPackHeader emojiPackHeader = (EmojiView.EmojiPackHeader) obj;
                emojiPackHeader.pack.installed = true;
                emojiPackHeader.updateState$1(true);
                break;
            case 7:
                AndroidUtilities.updateViewShow(((EmojiView.SearchField) obj).clear, true);
                break;
            case 8:
                EmojiView.StickersSearchGridAdapter.AnonymousClass1 anonymousClass1 = (EmojiView.StickersSearchGridAdapter.AnonymousClass1) obj;
                EmojiView.StickersSearchGridAdapter stickersSearchGridAdapter = EmojiView.StickersSearchGridAdapter.this;
                if (stickersSearchGridAdapter.emojiSearchId == anonymousClass1.lastId) {
                    ArrayList arrayList = anonymousClass1.emojiArrays;
                    ArrayList arrayList2 = anonymousClass1.emojiStickersArray;
                    arrayList.remove(arrayList2);
                    stickersSearchGridAdapter.localPacks = anonymousClass1.localPacks;
                    stickersSearchGridAdapter.localPacksByShortName = anonymousClass1.localPacksByShortName;
                    stickersSearchGridAdapter.localPacksByName = anonymousClass1.localPacksByName;
                    stickersSearchGridAdapter.emojiStickers = anonymousClass1.emojiStickers;
                    stickersSearchGridAdapter.emojiArrays = arrayList;
                    stickersSearchGridAdapter.foundEmojiPacks = anonymousClass1.foundEmojiPacks;
                    stickersSearchGridAdapter.globalSearchArray = new ArrayList(arrayList2);
                    EmojiView.this.stickersSearchField.showProgress$1(false);
                    RecyclerView.Adapter adapter = EmojiView.this.stickersGridView.getAdapter();
                    EmojiView emojiView2 = EmojiView.this;
                    EmojiView.StickersSearchGridAdapter stickersSearchGridAdapter2 = emojiView2.stickersSearchGridAdapter;
                    if (adapter != stickersSearchGridAdapter2) {
                        emojiView2.stickersGridView.setAdapter(stickersSearchGridAdapter2);
                    }
                    stickersSearchGridAdapter.notifyDataSetChanged();
                    break;
                }
                break;
            case 9:
                FilterTabsView.TouchHelperCallback touchHelperCallback = (FilterTabsView.TouchHelperCallback) obj;
                touchHelperCallback.getClass();
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    int i4 = 0;
                    while (true) {
                        DialogsActivity.AnonymousClass10 anonymousClass10 = touchHelperCallback.this$0;
                        ArrayList arrayList3 = anonymousClass10.tabs;
                        if (i4 < arrayList3.size()) {
                            if (((FilterTabsView.Tab) arrayList3.get(i4)).isDefault && i4 != 0) {
                                FilterTabsView.ListAdapter listAdapter = anonymousClass10.adapter;
                                int size = listAdapter.this$0.tabs.size();
                                if (i4 >= 0 && i4 < size) {
                                    ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                    DialogsActivity.AnonymousClass10 anonymousClass11 = listAdapter.this$0;
                                    SparseIntArray sparseIntArray = anonymousClass11.positionToStableId;
                                    int i5 = sparseIntArray.get(i4);
                                    ArrayList arrayList4 = anonymousClass11.tabs;
                                    int i6 = ((FilterTabsView.Tab) arrayList4.get(i4)).id;
                                    for (int i7 = i4 - 1; i7 >= 0; i7--) {
                                        sparseIntArray.put(i7 + 1, sparseIntArray.get(i7));
                                    }
                                    MessagesController.DialogFilter dialogFilterRemove = dialogFilters.remove(i4);
                                    dialogFilterRemove.order = 0;
                                    dialogFilters.add(0, dialogFilterRemove);
                                    sparseIntArray.put(0, i5);
                                    arrayList4.add(0, (FilterTabsView.Tab) arrayList4.remove(i4));
                                    ((FilterTabsView.Tab) arrayList4.get(0)).id = i6;
                                    for (int i8 = 0; i8 <= i4; i8++) {
                                        ((FilterTabsView.Tab) arrayList4.get(i8)).id = i8;
                                        dialogFilters.get(i8).order = i8;
                                    }
                                    int i9 = 0;
                                    while (i9 <= i4) {
                                        if (anonymousClass11.currentPosition == i9) {
                                            int i10 = i9 == i4 ? 0 : i9 + 1;
                                            anonymousClass11.selectedTabId = i10;
                                            anonymousClass11.currentPosition = i10;
                                        }
                                        if (anonymousClass11.previousPosition == i9) {
                                            int i11 = i9 == i4 ? 0 : i9 + 1;
                                            anonymousClass11.previousId = i11;
                                            anonymousClass11.previousPosition = i11;
                                        }
                                        i9++;
                                    }
                                    listAdapter.mObservable.notifyItemMoved(i4, 0);
                                    FilterTabsView.FilterTabsViewDelegate filterTabsViewDelegate = anonymousClass11.delegate;
                                    int i12 = ((FilterTabsView.Tab) arrayList4.get(i4)).id;
                                    DialogsActivity.AnonymousClass11 anonymousClass12 = (DialogsActivity.AnonymousClass11) filterTabsViewDelegate;
                                    int i13 = 0;
                                    while (true) {
                                        DialogsActivity.ViewPage[] viewPageArr = DialogsActivity.this.viewPages;
                                        if (i13 < viewPageArr.length) {
                                            DialogsActivity.ViewPage viewPage = viewPageArr[i13];
                                            int i14 = viewPage.selectedType;
                                            if (i14 == i12) {
                                                viewPage.selectedType = i6;
                                            } else if (i14 == i6) {
                                                viewPage.selectedType = i12;
                                            }
                                            i13++;
                                        } else {
                                            anonymousClass11.updateTabsWidths();
                                            anonymousClass11.orderChanged = true;
                                            anonymousClass11.listView.setItemAnimator(anonymousClass11.itemAnimator);
                                        }
                                    }
                                }
                                anonymousClass10.listView.scrollToPosition(0);
                                DialogsActivity dialogsActivity = DialogsActivity.this;
                                if (!dialogsActivity.getMessagesController().premiumFeaturesBlocked()) {
                                    try {
                                        anonymousClass10.performHapticFeedback(3, 1);
                                        break;
                                    } catch (Exception unused2) {
                                    }
                                    Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of(dialogsActivity).createSimpleBulletin(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new ComposeDrawable$$ExternalSyntheticLambda0(anonymousClass10, 13));
                                    bulletinCreateSimpleBulletin.show(true);
                                    dialogsActivity.topBulletin = bulletinCreateSimpleBulletin;
                                }
                            } else {
                                i4++;
                            }
                        }
                        break;
                    }
                }
                break;
            case 10:
                FireworksOverlay fireworksOverlay = (FireworksOverlay) obj;
                if (!fireworksOverlay.started) {
                    fireworksOverlay.setLayerType(0, null);
                }
                break;
            case 11:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (Theme.ThemeInfo) obj, Boolean.TRUE, null, -1);
                break;
            case 12:
                ((GroupCallPip) obj).updateAvatars$1(true);
                break;
            case 13:
                HashtagsSearchAdapter hashtagsSearchAdapter = (HashtagsSearchAdapter) obj;
                hashtagsSearchAdapter.getClass();
                DialogsActivity.AnonymousClass47 anonymousClass47 = ((SearchViewPager.AnonymousClass16) hashtagsSearchAdapter).this$0;
                if (!anonymousClass47.hashtagSearchListView.canScrollVertically(-1)) {
                    LinearLayoutManager linearLayoutManager = anonymousClass47.hashtagSearchLayoutManager;
                    linearLayoutManager.scrollToPositionWithOffset(0, 0, linearLayoutManager.mShouldReverseLayout);
                    break;
                }
                break;
            case 14:
                ((HintView.AnonymousClass1) obj).this$0.hide(true);
                break;
            case 15:
                ImportingAlert importingAlert = (ImportingAlert) obj;
                if (importingAlert.completed) {
                    RLottieImageView rLottieImageView = importingAlert.imageView;
                    rLottieImageView.getAnimatedDrawable().setAutoRepeat(0);
                    rLottieImageView.setAnimation(importingAlert.completedDrawable);
                    rLottieImageView.playAnimation();
                }
                break;
            case 16:
                InstantCameraView instantCameraView = (InstantCameraView) ((zzq) obj).zza;
                try {
                    VideoPlayer videoPlayer = instantCameraView.videoPlayer;
                    if (videoPlayer != null && (videoEditedInfo = instantCameraView.videoEditedInfo) != null) {
                        if (videoEditedInfo.endTime > 0) {
                            long currentPosition = videoPlayer.getCurrentPosition();
                            VideoEditedInfo videoEditedInfo2 = instantCameraView.videoEditedInfo;
                            if (currentPosition >= videoEditedInfo2.endTime) {
                                VideoPlayer videoPlayer2 = instantCameraView.videoPlayer;
                                long j = videoEditedInfo2.startTime;
                                videoPlayer2.seekTo(j > 0 ? j : 0L);
                            }
                        }
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 17:
                MarqueeTextView marqueeTextView = (MarqueeTextView) obj;
                if (marqueeTextView.needMarquee) {
                    marqueeTextView.marqueeIsStarted = true;
                    marqueeTextView.marqueeIsPending = false;
                    marqueeTextView.scrollX = 0.0f;
                    marqueeTextView.lastFrameTime = SystemClock.uptimeMillis();
                    marqueeTextView.invalidate();
                }
                break;
            case 18:
                MediaActivity mediaActivity = (MediaActivity) obj;
                Activity parentActivity = mediaActivity.getParentActivity();
                Activity parentActivity2 = mediaActivity.getParentActivity();
                DispatchQueue dispatchQueue = ShapeDetector.queue;
                boolean z = parentActivity2.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false);
                SharedPreferences.Editor editorEdit = parentActivity.getSharedPreferences("shapedetector_conf", 0).edit();
                if (z) {
                    editorEdit.clear();
                } else {
                    editorEdit.putBoolean("learning", true);
                }
                editorEdit.apply();
                break;
            case 19:
                final MentionsContainerView mentionsContainerView = (MentionsContainerView) obj;
                boolean z2 = mentionsContainerView.shown;
                boolean z3 = !z2;
                MentionsContainerView.MentionsListView mentionsListView = mentionsContainerView.listView;
                if (mentionsListView == null || (paddedListAdapter = mentionsContainerView.paddedAdapter) == null) {
                    mentionsContainerView.scrollRangeUpdateTries = 0;
                } else if (mentionsContainerView.listViewHiding && (springAnimation = mentionsContainerView.listViewTranslationAnimator) != null && springAnimation.mRunning && !z2) {
                    mentionsContainerView.scrollRangeUpdateTries = 0;
                } else {
                    boolean zIsReversed = mentionsContainerView.isReversed();
                    if (z2) {
                        int iComputeVerticalScrollRange = mentionsListView.computeVerticalScrollRange();
                        float f = (iComputeVerticalScrollRange - paddedListAdapter.lastPadding) + mentionsContainerView.containerPadding;
                        if (iComputeVerticalScrollRange <= 0 && mentionsContainerView.adapter.getItemCountInternal() > 0 && (i = mentionsContainerView.scrollRangeUpdateTries) < 3) {
                            mentionsContainerView.scrollRangeUpdateTries = i + 1;
                            mentionsContainerView.updateVisibility(true);
                        } else {
                            fDp = f;
                        }
                    } else {
                        fDp = (-mentionsContainerView.containerPadding) - AndroidUtilities.dp(6.0f);
                    }
                    mentionsContainerView.scrollRangeUpdateTries = 0;
                    if (zIsReversed) {
                        fMax = -Math.max(0.0f, mentionsContainerView.listViewPadding - fDp);
                    } else {
                        float f2 = mentionsContainerView.listViewPadding;
                        fMax = Math.max(0.0f, f2 - fDp) + (-f2);
                    }
                    if (!z2 && !zIsReversed) {
                        fMax += mentionsListView.computeVerticalScrollOffset();
                    }
                    final float f3 = fMax;
                    SpringAnimation springAnimation2 = mentionsContainerView.listViewTranslationAnimator;
                    if (springAnimation2 != null) {
                        springAnimation2.cancel();
                    }
                    mentionsContainerView.listViewHiding = z3;
                    final float translationY = mentionsListView.getTranslationY();
                    final float f4 = mentionsContainerView.hideT;
                    final float f5 = !z2 ? 1.0f : 0.0f;
                    if (translationY == f3) {
                        mentionsContainerView.listViewTranslationAnimator = null;
                        numValueOf = Integer.valueOf(!z2 ? 8 : 0);
                        if (mentionsContainerView.switchLayoutManagerOnEnd && !z2) {
                            mentionsContainerView.switchLayoutManagerOnEnd = false;
                            mentionsListView.setLayoutManager(mentionsContainerView.getNeededLayoutManager());
                            mentionsContainerView.shown = true;
                            mentionsContainerView.updateVisibility(true);
                        }
                    } else {
                        SpringAnimation springAnimation3 = new SpringAnimation(new FloatValueHolder(translationY));
                        SpringForce springForce = new SpringForce(f3);
                        springForce.setDampingRatio(1.0f);
                        springForce.setStiffness(550.0f);
                        springAnimation3.mSpring = springForce;
                        mentionsContainerView.listViewTranslationAnimator = springAnimation3;
                        springAnimation3.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f6, float f7) {
                                MentionsContainerView mentionsContainerView2 = mentionsContainerView;
                                mentionsContainerView2.listView.setTranslationY(f6);
                                mentionsContainerView2.onAnimationScroll();
                                float f8 = translationY;
                                mentionsContainerView2.hideT = AndroidUtilities.lerp(f4, f5, (f6 - f8) / (f3 - f8));
                            }
                        });
                        if (!z2) {
                            mentionsContainerView.listViewTranslationAnimator.addEndListener(new MentionsContainerView$$ExternalSyntheticLambda3(mentionsContainerView, z3, i2));
                        }
                        mentionsContainerView.listViewTranslationAnimator.addEndListener(new MentionsContainerView$$ExternalSyntheticLambda4());
                        mentionsContainerView.listViewTranslationAnimator.start();
                    }
                    if (numValueOf != null && mentionsContainerView.getVisibility() != numValueOf.intValue()) {
                        mentionsContainerView.setVisibility(numValueOf.intValue());
                        break;
                    }
                }
                break;
            case 20:
                MessagePreviewView.Page.this.adapter.mObservable.notifyChanged();
                break;
            case 21:
                ((MessagePrivateSeenView) obj).request();
                break;
            case 22:
                ((MotionBackgroundDrawable) obj).updateAnimation();
                break;
            case 23:
                ((MotionPhotoDrawable) obj).invalidateSelf();
                break;
            case 24:
                ((MuteDrawable) obj).invalidateSelf();
                break;
            case 25:
                ((PagerSlidingTabStrip) obj).notifyDataSetChanged();
                break;
            case 26:
                Stripe.AnonymousClass1 anonymousClass2 = ((Painting.AnonymousClass1) obj).this$0.delegate;
                if (anonymousClass2 != null) {
                    anonymousClass2.contentChanged();
                }
                break;
            case 27:
                Painting painting = ((Painting.AnonymousClass1) obj).this$0;
                if (painting.helperShape == null) {
                    painting.helperApplyAnimator = null;
                } else {
                    int currentColor = painting.renderView.getCurrentColor();
                    painting.paintStrokeInternal(painting.activePath, false, false);
                    Splitter splitterCommitPathInternal = painting.commitPathInternal(painting.activePath, currentColor, new RectF(painting.activeStrokeBounds));
                    painting.clearStrokeInternal();
                    Shape shape = painting.helperShape;
                    RectF rectF = new RectF();
                    painting.activeStrokeBounds = rectF;
                    shape.getBounds(rectF);
                    painting.restoreSliceInternal(painting.commitShapeInternal(shape, currentColor, new RectF(painting.activeStrokeBounds)), false);
                    painting.restoreSliceInternal(splitterCommitPathInternal, false);
                    painting.commitShapeInternal(shape, currentColor, null);
                    painting.helperShape = null;
                    painting.helperApplyAlpha = 0.0f;
                    painting.helperApplyAnimator = null;
                }
                break;
            case 28:
                RenderView.this.delegate.onFirstDraw();
                break;
            default:
                UndoStore.UndoStoreDelegate undoStoreDelegate = ((UndoStore) obj).delegate;
                if (undoStoreDelegate != null) {
                    undoStoreDelegate.historyChanged();
                }
                break;
        }
    }
}
