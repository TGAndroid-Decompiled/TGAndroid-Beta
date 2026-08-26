package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.opengl.Matrix;
import androidx.recyclerview.widget.DiffUtil;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.audioinfo.mp3.ID3v1Genre$EnumUnboxingLocalUtility;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StarAppsSheet;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.ProfileActivity$9$$ExternalSyntheticLambda1;
import org.telegram.ui.Stars.BalanceCloud;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.ExplainStarsSheet;
import org.telegram.ui.Stars.GiftOfferSheet;
import org.telegram.ui.Stars.MessageSuggestionOfferSheet;
import org.telegram.ui.Stars.SellGiftEnterPriceSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$TopView$$ExternalSyntheticLambda4;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda0;

public final class ProfileActivity$9$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public ProfileActivity$9$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        int i;
        char c;
        boolean z;
        int i2;
        int i3 = 0;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ProfileActivity.AnonymousClass9 anonymousClass9 = (ProfileActivity.AnonymousClass9) obj;
                anonymousClass9.onTabProgress(anonymousClass9.getTabProgress());
                break;
            case 1:
                ((ProfileActivity.PagerIndicatorView) obj).updateAvatarItemsInternal();
                break;
            case 2:
                ((ProfileBirthdayEffect) obj).start();
                break;
            case 3:
                ProfileBirthdayEffect.BirthdayEffectFetcher birthdayEffectFetcher = (ProfileBirthdayEffect.BirthdayEffectFetcher) obj;
                birthdayEffectFetcher.loadedAssets.add(birthdayEffectFetcher.interactionAsset);
                birthdayEffectFetcher.checkWhenLoaded();
                break;
            case 4:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                break;
            case 5:
                ((StoriesController.StoriesCollections) obj).sendOrder();
                break;
            case 6:
                ProxySettingsActivity proxySettingsActivity = (ProxySettingsActivity) obj;
                AndroidUtilities.hideKeyboard(proxySettingsActivity.inputFieldsContainer.findFocus());
                while (i3 < proxySettingsActivity.pasteFields.length) {
                    int i4 = proxySettingsActivity.pasteType;
                    if (i4 != 0 || i3 == 4) {
                        i = 1;
                        if (i4 != 1 || i3 == 2 || i3 == 3) {
                            proxySettingsActivity.inputFields[i3].setText((CharSequence) null);
                        }
                    } else {
                        i = 1;
                    }
                    i3 += i;
                }
                break;
            case 7:
                ((RightSlidingDialogContainer) obj).invalidate();
                break;
            case 8:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.exceptionsDialogs.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.type, saveToGallerySettingsActivity.exceptionsDialogs);
                saveToGallerySettingsActivity.updateRows$28();
                break;
            case 9:
                SearchAdsInfoBottomSheet searchAdsInfoBottomSheet = (SearchAdsInfoBottomSheet) obj;
                searchAdsInfoBottomSheet.lambda$showGiftOfferSheet$15();
                Browser.openUrl(searchAdsInfoBottomSheet.getContext(), LocaleController.getString(R.string.PromoteUrl));
                break;
            case 10:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((QrActivity.AnonymousClass4) obj).this$0;
                Runnable runnable = secretMediaViewer.photoAnimationEndRunnable;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.photoAnimationEndRunnable = null;
                }
                break;
            case 11:
                SecretVoicePlayer secretVoicePlayer = (SecretVoicePlayer) ((PhotoViewer.AnonymousClass18) obj).this$0;
                secretVoicePlayer.renderedFirstFrame = true;
                secretVoicePlayer.myCell.invalidate();
                break;
            case 12:
                ((NotificationCenter) obj).runDelayedNotifications();
                break;
            case 13:
                AndroidUtilities.updateViewShow(((SelectAnimatedEmojiDialog.SearchBox) obj).clear, true);
                break;
            case 14:
                UniversalAdapter universalAdapter = ((SelectChatUserSheet) obj).adapter;
                if (universalAdapter != null) {
                    universalAdapter.update(true);
                }
                break;
            case 15:
                ((SelectChatUserSheet.AnonymousClass2) obj).updateSearch();
                break;
            case 16:
                ((SessionsActivity) obj).lambda$createView$3$6$2();
                break;
            case 17:
                BalanceCloud balanceCloud = (BalanceCloud) obj;
                balanceCloud.getClass();
                new StarsIntroActivity.StarsOptionsSheet(balanceCloud.getContext(), balanceCloud.resourcesProvider).show();
                break;
            case 18:
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
            case 19:
                new StarAppsSheet(((ExplainStarsSheet) obj).getContext()).show();
                break;
            case 20:
                AndroidUtilities.showKeyboard(((GiftOfferSheet) obj).starsCountEditField);
                break;
            case 21:
                AndroidUtilities.showKeyboard(((MessageSuggestionOfferSheet) obj).starsCountEditField);
                break;
            case 22:
                AndroidUtilities.showKeyboard(((SellGiftEnterPriceSheet) obj).starsCountEditField);
                break;
            case 23:
                StarGiftSheet.CraftTopView craftTopView = (StarGiftSheet.CraftTopView) obj;
                craftTopView.crafting = false;
                craftTopView.failed = false;
                craftTopView.setup(craftTopView.currentAccount, craftTopView.giftId, craftTopView.document, craftTopView.collectionTitle);
                break;
            case 24:
                ((StarGiftSheet.CraftTopView.ButtonBackground) obj).invalidateSelf();
                break;
            case 25:
                StarGiftSheet.CraftTopView.Cube3D cube3D = (StarGiftSheet.CraftTopView.Cube3D) obj;
                StarGiftSheet.CraftTopView.Cube3D.AnimSequence animSequence = cube3D.sequence;
                if (animSequence == null) {
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
                        while (i3 < 6) {
                            Matrix.multiplyMV(cube3D.transformedNormal, 0, cube3D.rotationMatrix, 0, cube3D.faceNormals[i3], 0);
                            cube3D.faceDepths[i3] = cube3D.transformedNormal[c];
                            i3++;
                        }
                        Arrays.sort(cube3D.drawOrder, new TableModel$$ExternalSyntheticLambda0(cube3D, 10));
                        cube3D.invalidate();
                    }
                    if (cube3D.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(cube3D.updateRunnable, 16L);
                    }
                    break;
                } else if (animSequence.cancelled || (i2 = animSequence.currentIndex) == 0) {
                    c = 2;
                } else {
                    boolean z2 = animSequence.waitingForPull;
                    StarGiftSheet.CraftTopView.Cube3D cube3D2 = animSequence.cube;
                    if (z2) {
                        cube3D2.applyPhysics();
                    } else {
                        int iOrdinal = ID3v1Genre$EnumUnboxingLocalUtility.ordinal(((StarGiftSheet.CraftTopView.Cube3D.AnimSequence.Cmd) animSequence.commands.get(i2 - 1)).type);
                        if (iOrdinal == 1 || iOrdinal == 2) {
                            c = 2;
                            cube3D2.applyPhysics();
                            int i5 = animSequence.framesRemaining - 1;
                            animSequence.framesRemaining = i5;
                            if (i5 <= 0) {
                                animSequence.executeNext();
                            }
                        } else if (iOrdinal == 3) {
                            float fPow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (animSequence.framesRemaining / animSequence.totalFrames)), 3.0d));
                            float f = 1.0f - fPow;
                            float fAbs = Math.abs(animSequence.startVx * f);
                            float[] fArr = animSequence.startMatrix;
                            if (fAbs > 1.0E-4f || Math.abs(animSequence.startVy * f) > 1.0E-4f) {
                                float[] fArr2 = new float[16];
                                c = 2;
                                float f2 = animSequence.startVx * f * 0.96f;
                                cube3D2.getClass();
                                StarGiftSheet.CraftTopView.Cube3D.axisAngleToMatrix(1.0f, 0.0f, f2, fArr2);
                                StarGiftSheet.CraftTopView.Cube3D.multiplyMatrix(fArr2, fArr, fArr);
                                StarGiftSheet.CraftTopView.Cube3D.axisAngleToMatrix(0.0f, 1.0f, animSequence.startVy * f * 0.96f, fArr2);
                                StarGiftSheet.CraftTopView.Cube3D.multiplyMatrix(fArr2, fArr, fArr);
                            } else {
                                c = 2;
                            }
                            float[] fArr3 = animSequence.targetMatrix;
                            float[] fArr4 = cube3D2.rotationMatrix;
                            for (int i6 = 0; i6 < 16; i6++) {
                                float f3 = fArr[i6];
                                fArr4[i6] = DiffUtil.m(fArr3[i6], f3, fPow, f3);
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
                            int i7 = animSequence.framesRemaining - 1;
                            animSequence.framesRemaining = i7;
                            if (i7 <= 0) {
                                System.arraycopy(animSequence.targetMatrix, 0, cube3D2.rotationMatrix, 0, 16);
                                cube3D2.vx = 0.0f;
                                cube3D2.vy = 0.0f;
                                animSequence.executeNext();
                            }
                        }
                    }
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
                        i3++;
                    }
                    Arrays.sort(cube3D.drawOrder, new TableModel$$ExternalSyntheticLambda0(cube3D, 10));
                    cube3D.invalidate();
                }
                if (cube3D.isAttachedToWindow()) {
                    AndroidUtilities.runOnUIThread(cube3D.updateRunnable, 16L);
                }
                break;
            case 26:
                ((StarGiftSheet.CraftTopView.ProgressView) obj).invalidate();
                break;
            case 27:
                ((StarGiftSheet.CraftTopView.SwitchGradientDrawable) obj).invalidateSelf();
                break;
            case 28:
                final StarGiftSheet.TopView topView = (StarGiftSheet.TopView) obj;
                int i8 = 2 - topView.toggled;
                BackupImageView[] backupImageViewArr = topView.imageView;
                boolean zHasImageLoaded = backupImageViewArr[i8].getImageReceiver().hasImageLoaded();
                ProfileActivity$9$$ExternalSyntheticLambda1 profileActivity$9$$ExternalSyntheticLambda1 = topView.checkToRotateRunnable;
                if (!zHasImageLoaded) {
                    AndroidUtilities.cancelRunOnUIThread(profileActivity$9$$ExternalSyntheticLambda1);
                    AndroidUtilities.runOnUIThread(profileActivity$9$$ExternalSyntheticLambda1, 150L);
                    break;
                } else {
                    StarGiftSheet.PageTransition pageTransition = topView.currentPage;
                    if (pageTransition != null && pageTransition.to == 1 && topView.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(profileActivity$9$$ExternalSyntheticLambda1);
                        ValueAnimator valueAnimator = topView.rotationAnimator;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            topView.rotationAnimator = null;
                        }
                        int i9 = 1 - topView.toggled;
                        topView.toggled = i9;
                        RLottieDrawable lottieAnimation = backupImageViewArr[2 - i9].getImageReceiver().getLottieAnimation();
                        RLottieDrawable lottieAnimation2 = backupImageViewArr[topView.toggled + 1].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.setProgress(lottieAnimation.getProgress(), false);
                        }
                        topView.models.next();
                        int i10 = topView.toggled + 1;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) topView.backdrops.next();
                        topView.backdrop[i10] = stargiftattributebackdrop;
                        topView.setBackdropPaint(i10, stargiftattributebackdrop);
                        topView.setPattern(1, (TL_stars.starGiftAttributePattern) topView.patterns.next(), true);
                        topView.animateSwitch();
                        float f10 = topView.toggled;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f - f10, f10);
                        topView.rotationAnimator = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.addUpdateListener(new StarGiftSheet$TopView$$ExternalSyntheticLambda4(topView, 2));
                        topView.rotationAnimator.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public final void onAnimationEnd(Animator animator) {
                                TopView topView2 = TopView.this;
                                topView2.toggleBackdrop = topView2.toggled;
                                topView2.onSwitchPage(topView2.currentPage);
                                int i11 = 2 - topView2.toggled;
                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) topView2.models.next;
                                TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = topView2.imageViewAttributes;
                                stargiftattributemodelArr[i11] = stargiftattributemodel;
                                StarsIntroActivity.setGiftImage(topView2.imageView[i11].getImageReceiver(), stargiftattributemodelArr[2 - topView2.toggled].document, 160);
                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) topView2.patterns.next;
                                if (stargiftattributepattern != null) {
                                    AnimatedEmojiDrawable animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
                                    animatedEmojiDrawableMake.preloading = true;
                                    animatedEmojiDrawableMake.updateAttachState();
                                }
                                ProfileActivity$9$$ExternalSyntheticLambda1 profileActivity$9$$ExternalSyntheticLambda2 = topView2.checkToRotateRunnable;
                                AndroidUtilities.cancelRunOnUIThread(profileActivity$9$$ExternalSyntheticLambda2);
                                AndroidUtilities.runOnUIThread(profileActivity$9$$ExternalSyntheticLambda2, 2500L);
                            }
                        });
                        topView.rotationAnimator.setDuration(320L);
                        topView.rotationAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                        topView.rotationAnimator.start();
                        break;
                    }
                }
                break;
            default:
                ((GLIconTextureView) obj).setPaused(true);
                break;
        }
    }
}
