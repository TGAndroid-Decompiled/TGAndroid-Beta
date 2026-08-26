package org.telegram.ui.Stars;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.opengl.Matrix;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.audioinfo.mp3.ID3v1Genre$EnumUnboxingLocalUtility;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StarAppsSheet;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.HighlightMessageSheet;
import org.telegram.ui.Stories.LiveCommentsView;
import org.telegram.ui.Stories.LivePlayer;
import org.telegram.ui.Stories.LiveStoryPipOverlay;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.SelfStoryViewsPage;
import org.telegram.ui.Stories.StealthModeAlert;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda0;

public final class BalanceCloud$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public BalanceCloud$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        StarGiftSheet.CraftTopView.Cube3D cube3D;
        char c;
        boolean z;
        int i;
        int i2 = 6;
        long j = 0;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                BalanceCloud balanceCloud = (BalanceCloud) obj;
                balanceCloud.getClass();
                new StarsIntroActivity.StarsOptionsSheet(balanceCloud.getContext(), balanceCloud.resourcesProvider).show();
                break;
            case 1:
                BotStarsActivity.NestedFrameLayout nestedFrameLayout = (BotStarsActivity.NestedFrameLayout) obj;
                nestedFrameLayout.getClass();
                try {
                    RecyclerListView currentListView = BotStarsActivity.this.transactionsLayout.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().notifyDataSetChanged();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 2:
                new StarAppsSheet(((ExplainStarsSheet) obj).getContext()).show();
                break;
            case 3:
                AndroidUtilities.showKeyboard(((GiftOfferSheet) obj).starsCountEditField);
                break;
            case 4:
                AndroidUtilities.showKeyboard(((MessageSuggestionOfferSheet) obj).starsCountEditField);
                break;
            case 5:
                AndroidUtilities.showKeyboard(((SellGiftEnterPriceSheet) obj).starsCountEditField);
                break;
            case 6:
                StarGiftSheet.CraftTopView craftTopView = (StarGiftSheet.CraftTopView) obj;
                craftTopView.crafting = false;
                craftTopView.failed = false;
                craftTopView.setup(craftTopView.currentAccount, craftTopView.giftId, craftTopView.document, craftTopView.collectionTitle);
                break;
            case 7:
                ((StarGiftSheet.CraftTopView.ButtonBackground) obj).invalidateSelf();
                break;
            case 8:
                StarGiftSheet.CraftTopView.Cube3D cube3D2 = (StarGiftSheet.CraftTopView.Cube3D) obj;
                StarGiftSheet.CraftTopView.Cube3D.AnimSequence animSequence = cube3D2.sequence;
                if (animSequence == null) {
                    cube3D = cube3D2;
                    c = 2;
                    if (Math.abs(cube3D.vx) > 1.0E-4f || Math.abs(cube3D.vy) > 1.0E-4f) {
                        cube3D.applyPhysics();
                    } else {
                        z = false;
                    }
                    if (cube3D.pulling != null) {
                        z = true;
                    }
                    if (z) {
                        for (int i3 = 0; i3 < 6; i3++) {
                            Matrix.multiplyMV(cube3D.transformedNormal, 0, cube3D.rotationMatrix, 0, cube3D.faceNormals[i3], 0);
                            cube3D.faceDepths[i3] = cube3D.transformedNormal[c];
                        }
                        Arrays.sort(cube3D.drawOrder, new TableModel$$ExternalSyntheticLambda0(cube3D, 5));
                        cube3D.invalidate();
                    }
                    if (cube3D.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(cube3D.updateRunnable, 16L);
                    }
                    break;
                } else if (animSequence.cancelled || (i = animSequence.currentIndex) == 0) {
                    cube3D = cube3D2;
                    c = 2;
                } else {
                    boolean z2 = animSequence.waitingForPull;
                    StarGiftSheet.CraftTopView.Cube3D cube3D3 = animSequence.cube;
                    if (z2) {
                        cube3D3.applyPhysics();
                    } else {
                        int iOrdinal = ID3v1Genre$EnumUnboxingLocalUtility.ordinal(((StarGiftSheet.CraftTopView.Cube3D.AnimSequence.Cmd) animSequence.commands.get(i - 1)).type);
                        if (iOrdinal == 1 || iOrdinal == 2) {
                            cube3D = cube3D2;
                            c = 2;
                            cube3D3.applyPhysics();
                            int i4 = animSequence.framesRemaining - 1;
                            animSequence.framesRemaining = i4;
                            if (i4 <= 0) {
                                animSequence.executeNext();
                            }
                        } else if (iOrdinal == 3) {
                            cube3D = cube3D2;
                            float fPow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (animSequence.framesRemaining / animSequence.totalFrames)), 3.0d));
                            float f = 1.0f - fPow;
                            float fAbs = Math.abs(animSequence.startVx * f);
                            float[] fArr = animSequence.startMatrix;
                            if (fAbs > 1.0E-4f || Math.abs(animSequence.startVy * f) > 1.0E-4f) {
                                float[] fArr2 = new float[16];
                                c = 2;
                                float f2 = animSequence.startVx * f * 0.96f;
                                cube3D3.getClass();
                                StarGiftSheet.CraftTopView.Cube3D.axisAngleToMatrix(1.0f, 0.0f, f2, fArr2);
                                StarGiftSheet.CraftTopView.Cube3D.multiplyMatrix(fArr2, fArr, fArr);
                                StarGiftSheet.CraftTopView.Cube3D.axisAngleToMatrix(0.0f, 1.0f, animSequence.startVy * f * 0.96f, fArr2);
                                StarGiftSheet.CraftTopView.Cube3D.multiplyMatrix(fArr2, fArr, fArr);
                            } else {
                                c = 2;
                            }
                            float[] fArr3 = animSequence.targetMatrix;
                            float[] fArr4 = cube3D3.rotationMatrix;
                            for (int i5 = 0; i5 < 16; i5++) {
                                float f3 = fArr[i5];
                                fArr4[i5] = DiffUtil.m(fArr3[i5], f3, fPow, f3);
                            }
                            float f4 = fArr4[0];
                            float f5 = fArr4[1];
                            float f6 = fArr4[c];
                            float[] fArr5 = new float[3];
                            fArr5[0] = f4;
                            fArr5[1] = f5;
                            fArr5[c] = f6;
                            float f7 = fArr4[4];
                            float f8 = fArr4[5];
                            float f9 = fArr4[6];
                            float[] fArr6 = new float[3];
                            fArr6[0] = f7;
                            fArr6[1] = f8;
                            fArr6[c] = f9;
                            float[] fArr7 = new float[3];
                            StarGiftSheet.CraftTopView.Cube3D.normalize(fArr5);
                            StarGiftSheet.CraftTopView.Cube3D.cross(fArr5, fArr6, fArr7);
                            StarGiftSheet.CraftTopView.Cube3D.normalize(fArr7);
                            StarGiftSheet.CraftTopView.Cube3D.cross(fArr7, fArr5, fArr6);
                            fArr4[0] = fArr5[0];
                            fArr4[1] = fArr5[1];
                            fArr4[c] = fArr5[c];
                            fArr4[4] = fArr6[0];
                            fArr4[5] = fArr6[1];
                            fArr4[6] = fArr6[c];
                            fArr4[8] = fArr7[0];
                            fArr4[9] = fArr7[1];
                            fArr4[10] = fArr7[c];
                            int i6 = animSequence.framesRemaining - 1;
                            animSequence.framesRemaining = i6;
                            if (i6 <= 0) {
                                System.arraycopy(animSequence.targetMatrix, 0, cube3D3.rotationMatrix, 0, 16);
                                cube3D3.vx = 0.0f;
                                cube3D3.vy = 0.0f;
                                animSequence.executeNext();
                            }
                        }
                    }
                    cube3D = cube3D2;
                    c = 2;
                }
                z = true;
                if (cube3D.pulling != null) {
                    z = true;
                }
                if (z) {
                    while (i3 < 6) {
                        Matrix.multiplyMV(cube3D.transformedNormal, 0, cube3D.rotationMatrix, 0, cube3D.faceNormals[i3], 0);
                        cube3D.faceDepths[i3] = cube3D.transformedNormal[c];
                    }
                    Arrays.sort(cube3D.drawOrder, new TableModel$$ExternalSyntheticLambda0(cube3D, 5));
                    cube3D.invalidate();
                }
                if (cube3D.isAttachedToWindow()) {
                    AndroidUtilities.runOnUIThread(cube3D.updateRunnable, 16L);
                }
                break;
            case 9:
                ((StarGiftSheet.CraftTopView.ProgressView) obj).invalidate();
                break;
            case 10:
                ((StarGiftSheet.CraftTopView.SwitchGradientDrawable) obj).invalidateSelf();
                break;
            case 11:
                final StarGiftSheet.TopView topView = (StarGiftSheet.TopView) obj;
                int i7 = 2 - topView.toggled;
                BackupImageView[] backupImageViewArr = topView.imageView;
                boolean zHasImageLoaded = backupImageViewArr[i7].getImageReceiver().hasImageLoaded();
                BalanceCloud$$ExternalSyntheticLambda1 balanceCloud$$ExternalSyntheticLambda1 = topView.checkToRotateRunnable;
                if (!zHasImageLoaded) {
                    AndroidUtilities.cancelRunOnUIThread(balanceCloud$$ExternalSyntheticLambda1);
                    AndroidUtilities.runOnUIThread(balanceCloud$$ExternalSyntheticLambda1, 150L);
                    break;
                } else {
                    StarGiftSheet.PageTransition pageTransition = topView.currentPage;
                    if (pageTransition != null && pageTransition.to == 1 && topView.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(balanceCloud$$ExternalSyntheticLambda1);
                        ValueAnimator valueAnimator = topView.rotationAnimator;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            topView.rotationAnimator = null;
                        }
                        int i8 = 1 - topView.toggled;
                        topView.toggled = i8;
                        RLottieDrawable lottieAnimation = backupImageViewArr[2 - i8].getImageReceiver().getLottieAnimation();
                        RLottieDrawable lottieAnimation2 = backupImageViewArr[topView.toggled + 1].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.setProgress(lottieAnimation.getProgress(), false);
                        }
                        topView.models.next();
                        int i9 = topView.toggled + 1;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) topView.backdrops.next();
                        topView.backdrop[i9] = stargiftattributebackdrop;
                        topView.setBackdropPaint(i9, stargiftattributebackdrop);
                        topView.setPattern(1, (TL_stars.starGiftAttributePattern) topView.patterns.next(), true);
                        topView.animateSwitch();
                        float f10 = topView.toggled;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f - f10, f10);
                        topView.rotationAnimator = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.addUpdateListener(new StarGiftSheet$TopView$$ExternalSyntheticLambda4(topView, 2));
                        topView.rotationAnimator.addListener(new AnimatorListenerAdapter() {
                            public AnonymousClass7() {
                            }

                            @Override
                            public final void onAnimationEnd(Animator animator) {
                                TopView topView2 = TopView.this;
                                topView2.toggleBackdrop = topView2.toggled;
                                topView2.onSwitchPage(topView2.currentPage);
                                int i10 = 2 - topView2.toggled;
                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) topView2.models.next;
                                TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = topView2.imageViewAttributes;
                                stargiftattributemodelArr[i10] = stargiftattributemodel;
                                StarsIntroActivity.setGiftImage(topView2.imageView[i10].getImageReceiver(), stargiftattributemodelArr[2 - topView2.toggled].document, 160);
                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) topView2.patterns.next;
                                if (stargiftattributepattern != null) {
                                    AnimatedEmojiDrawable.make(UserConfig.selectedAccount, 7, stargiftattributepattern.document).preload();
                                }
                                BalanceCloud$$ExternalSyntheticLambda1 balanceCloud$$ExternalSyntheticLambda2 = topView2.checkToRotateRunnable;
                                AndroidUtilities.cancelRunOnUIThread(balanceCloud$$ExternalSyntheticLambda2);
                                AndroidUtilities.runOnUIThread(balanceCloud$$ExternalSyntheticLambda2, 2500L);
                            }
                        });
                        topView.rotationAnimator.setDuration(320L);
                        topView.rotationAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                        topView.rotationAnimator.start();
                        break;
                    }
                }
                break;
            case 12:
                ((GLIconTextureView) obj).setPaused(true);
                break;
            case 13:
                AndroidUtilities.showKeyboard((EditTextBoldCursor) obj);
                break;
            case 14:
                ((SellGiftEnterPriceSheet[]) obj)[0].lambda$showGiftOfferSheet$15();
                break;
            case 15:
                StarsIntroActivity.NestedFrameLayout nestedFrameLayout2 = (StarsIntroActivity.NestedFrameLayout) obj;
                nestedFrameLayout2.getClass();
                try {
                    RecyclerListView currentListView2 = StarsIntroActivity.this.transactionsLayout.getCurrentListView();
                    if (currentListView2 != null && currentListView2.getAdapter() != null) {
                        currentListView2.getAdapter().notifyDataSetChanged();
                        break;
                    }
                } catch (Throwable unused2) {
                    return;
                }
                break;
            case 16:
                Browser.openUrl(((StarsIntroActivity.StarsNeededSheet) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 17:
                Browser.openUrl(((StarsIntroActivity.StarsOptionsSheet) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 18:
                DialogStoriesCell dialogStoriesCell = DialogStoriesCell.this;
                if (dialogStoriesCell.textAnimator != null) {
                    dialogStoriesCell.textAnimator.start();
                }
                dialogStoriesCell.animationRunnable = null;
                break;
            case 19:
                LiveCommentsView liveCommentsView = (LiveCommentsView) obj;
                BalanceCloud$$ExternalSyntheticLambda1 balanceCloud$$ExternalSyntheticLambda2 = liveCommentsView.removeTopSendersRunnable;
                if (balanceCloud$$ExternalSyntheticLambda2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(balanceCloud$$ExternalSyntheticLambda2);
                    liveCommentsView.removeTopSendersRunnable = null;
                }
                int currentTime = ConnectionsManager.getInstance(liveCommentsView.currentAccount).getCurrentTime();
                ArrayList arrayList = liveCommentsView.topMessages;
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    LiveCommentsView.TopSender topSender = (LiveCommentsView.TopSender) arrayList.get(size);
                    ArrayList arrayList2 = topSender.messages;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size2) {
                            arrayList.remove(size);
                        }
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        LiveCommentsView.Message message = (LiveCommentsView.Message) obj2;
                        long j2 = j;
                        long j3 = message.stars;
                        if (j3 <= j2 || currentTime - message.date > HighlightMessageSheet.getTierOption(topSender.currentAccount, (int) j3, 0)) {
                            j = 0;
                        }
                        break;
                        break;
                    }
                    size--;
                    j = 0;
                }
                Collections.sort(arrayList, new TableModel$$ExternalSyntheticLambda0(liveCommentsView, i2));
                liveCommentsView.topAdapter.update(true);
                liveCommentsView.updateTopMessages(true);
                liveCommentsView.scheduleRemovingTopSenders();
                break;
            case 20:
                LivePlayer.this.setEmptyStream(false);
                break;
            case 21:
                LivePlayer livePlayer = LivePlayer.this;
                NotificationCenter.getInstance(livePlayer.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(livePlayer.getCallId()));
                break;
            case 22:
                LiveStoryPipOverlay liveStoryPipOverlay = (LiveStoryPipOverlay) obj;
                liveStoryPipOverlay.isShowingControls = false;
                liveStoryPipOverlay.toggleControls$1(false);
                liveStoryPipOverlay.postedDismissControls = false;
                break;
            case 23:
                LiveStoryPipOverlay liveStoryPipOverlay2 = (LiveStoryPipOverlay) ((LiveStoryPipOverlay.AnonymousClass3) obj).this$0;
                liveStoryPipOverlay2.contentFrameLayout.invalidate();
                if (!liveStoryPipOverlay2.contentFrameLayout.isInLayout()) {
                    liveStoryPipOverlay2.contentFrameLayout.requestLayout();
                    liveStoryPipOverlay2.contentView.requestLayout();
                    liveStoryPipOverlay2.textureView.requestLayout();
                    break;
                }
                break;
            case 24:
                PeerStoriesView.this.openChat();
                break;
            case 25:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = ((PeerStoriesView.AnonymousClass4) obj).this$0;
                PeerStoriesView.Delegate delegate = ((PeerStoriesView) anonymousClass1).delegate;
                if (delegate != null) {
                    if (anonymousClass1.isUploading || anonymousClass1.isEditing || anonymousClass1.isFailed) {
                        if (anonymousClass1.currentStory.isVideo) {
                            anonymousClass1.playerSharedScope.player.loopBack();
                        } else {
                            anonymousClass1.currentImageTime = 0L;
                        }
                        break;
                    } else {
                        StoryViewer storyViewer = StoryViewer.this;
                        if (!storyViewer.storiesViewPager.getCurrentPeerView().switchToNext(true) && !storyViewer.storiesViewPager.switchToNext(true)) {
                            storyViewer.close(true);
                            break;
                        }
                    }
                }
                break;
            case 26:
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) obj;
                if (actionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindowLayout.getSwipeBack().closeForeground();
                }
                break;
            case 27:
                ((StoryPrivacyBottomSheet) obj).lambda$showGiftOfferSheet$15();
                break;
            case 28:
                SelfStoryViewsPage.ListAdapter listAdapter = (SelfStoryViewsPage.ListAdapter) obj;
                listAdapter.getClass();
                new PremiumFeatureBottomSheet(listAdapter.this$0.storyViewer.fragment, 14, false).show();
                break;
            default:
                StealthModeAlert stealthModeAlert = (StealthModeAlert) obj;
                if (stealthModeAlert.isShowing()) {
                    stealthModeAlert.updateButton$1(true);
                }
                break;
        }
    }
}
