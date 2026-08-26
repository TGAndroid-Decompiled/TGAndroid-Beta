package org.telegram.ui;

import android.os.Looper;
import com.google.android.gms.cast.framework.media.zzq;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.Intro;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Stars.StarsReactionsSheet;

public final class IntroActivity$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public IntroActivity$$ExternalSyntheticLambda6(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        IntroActivity.EGLThread eGLThread;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                IntroActivity introActivity = (IntroActivity) obj;
                IntroActivity.EGLThread eGLThread2 = introActivity.eglThread;
                int i = R.drawable.intro_powerful_mask;
                int i2 = Theme.key_windowBackgroundWhite;
                int color = Theme.getColor(null, i2, false);
                int i3 = IntroActivity.EGLThread.$r8$clinit;
                eGLThread2.loadTexture(i, 17, color, true);
                int[] iArr = introActivity.eglThread.textures;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                IntroActivity.EGLThread eGLThread3 = introActivity.eglThread;
                eGLThread3.loadTexture(eGLThread3.telegramMaskProvider, 23, true);
                int[] iArr2 = introActivity.eglThread.textures;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(Theme.getColor(null, i2, false));
                break;
            case 1:
                GiftSheet.StarsBackground starsBackground = (GiftSheet.StarsBackground) obj;
                StarsReactionsSheet.Particles particles = starsBackground.particles;
                if (particles != null) {
                    particles.process();
                    starsBackground.invalidateSelf();
                }
                break;
            case 2:
                ((ProfileGiftsContainer) obj).updateTabsY();
                break;
            case 3:
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                groupCallActivity.wasNotInLayoutFullscreen = null;
                groupCallActivity.updateMuteButton(groupCallActivity.muteButtonState, true);
                break;
            case 4:
                GroupCallActivity.AvatarUpdaterDelegate avatarUpdaterDelegate = (GroupCallActivity.AvatarUpdaterDelegate) obj;
                ImageLocation imageLocation = avatarUpdaterDelegate.uploadingImageLocation;
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                if (imageLocation != null) {
                    GroupCallActivity.AnonymousClass30 anonymousClass30 = groupCallActivity2.avatarsViewPager;
                    anonymousClass30.uploadingImageLocation = imageLocation;
                    anonymousClass30.currentUploadingImageLocation = null;
                    anonymousClass30.curreantUploadingThumbLocation = null;
                    avatarUpdaterDelegate.uploadingImageLocation = null;
                }
                TLRPC.Chat chat = groupCallActivity2.accountInstance.getMessagesController().getChat(Long.valueOf(-avatarUpdaterDelegate.peerId));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(avatarUpdaterDelegate.avatarBig) == null) {
                    forChat2 = ImageLocation.getForLocal(avatarUpdaterDelegate.avatar);
                }
                GroupCallActivity.AnonymousClass30 anonymousClass31 = groupCallActivity2.avatarsViewPager;
                anonymousClass31.setCreateThumbFromParent(false);
                anonymousClass31.initIfEmpty(null, forChat, forChat2, true);
                avatarUpdaterDelegate.avatar = null;
                avatarUpdaterDelegate.avatarBig = null;
                AndroidUtilities.updateVisibleRows(groupCallActivity2.listView);
                avatarUpdaterDelegate.updateAvatarUploadingProgress(1.0f);
                break;
            case 5:
                QrActivity.AnonymousClass2 anonymousClass2 = ((GroupCallActivity.CallEncryptionCellDrawable) obj).parentView;
                if (anonymousClass2 != null) {
                    anonymousClass2.invalidate();
                }
                break;
            case 6:
                GroupCreateFinalActivity groupCreateFinalActivity = (GroupCreateFinalActivity) obj;
                groupCreateFinalActivity.avatar = null;
                groupCreateFinalActivity.avatarBig = null;
                groupCreateFinalActivity.inputPhoto = null;
                groupCreateFinalActivity.inputVideo = null;
                groupCreateFinalActivity.inputVideoPath = null;
                groupCreateFinalActivity.inputEmojiMarkup = null;
                groupCreateFinalActivity.videoTimestamp = 0.0d;
                groupCreateFinalActivity.showAvatarProgress$3(false, true);
                groupCreateFinalActivity.avatarImage.setImage(null, null, groupCreateFinalActivity.avatarDrawable, null);
                groupCreateFinalActivity.avatarEditor.setAnimation(groupCreateFinalActivity.cameraDrawable);
                groupCreateFinalActivity.cameraDrawable.setCurrentFrame(0, true, false);
                break;
            case 7:
                FactCheckController$$ExternalSyntheticOutline0.m(R.string.GroupsEmojiPackUpdated, BulletinFactory.of(GroupStickersActivity.this), R.raw.done, 36);
                break;
            case 8:
                PhotoViewer.AnonymousClass8 anonymousClass8 = (PhotoViewer.AnonymousClass8) obj;
                anonymousClass8.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                IntroActivity introActivity2 = (IntroActivity) anonymousClass8.this$0;
                float f = (jCurrentTimeMillis - introActivity2.currentDate) / 1000.0f;
                Intro.setPage(introActivity2.currentViewPagerPage);
                Intro.setDate(f);
                Intro.onDrawFrame(0);
                IntroActivity.EGLThread eGLThread4 = introActivity2.eglThread;
                if (eGLThread4 != null && eGLThread4.isAlive() && (eGLDisplay = (eGLThread = introActivity2.eglThread).eglDisplay) != null && (eGLSurface = eGLThread.eglSurface) != null) {
                    try {
                        eGLThread.egl10.eglSwapBuffers(eGLDisplay, eGLSurface);
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
            case 9:
                IntroActivity.AnonymousClass5 anonymousClass5 = (IntroActivity.AnonymousClass5) obj;
                anonymousClass5.getClass();
                LoginActivity loginActivity = new LoginActivity();
                IntroActivity introActivity3 = IntroActivity.this;
                introActivity3.presentFragment(loginActivity, true);
                introActivity3.destroyed = true;
                break;
            case 10:
                ((IntroActivity.EGLThread) obj).finish();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    looperMyLooper.quit();
                }
                break;
            case 11:
                ((Browser.Progress) obj).end();
                break;
            case 12:
                LaunchActivity.this.termsOfServiceView.setVisibility(8);
                break;
            case 13:
                ((LaunchActivity.AnonymousClass3) obj).getClass();
                break;
            case 14:
                ((LinkManager.AnonymousClass2) obj).performShare();
                break;
            case 15:
                LocationActivity.NestedFrameLayout nestedFrameLayout = (LocationActivity.NestedFrameLayout) obj;
                nestedFrameLayout.getClass();
                try {
                    RecyclerListView currentListView = LocationActivity.this.sharedMediaLayout.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().notifyDataSetChanged();
                        break;
                    }
                } catch (Throwable unused2) {
                    return;
                }
                break;
            case 16:
                EditTextBoldCursor[] editTextBoldCursorArr = ((LoginActivity.LoginActivityNewPasswordView) obj).codeField;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                }
                break;
            case 17:
                LoginActivity.LoginActivityPasswordView loginActivityPasswordView = (LoginActivity.LoginActivityPasswordView) obj;
                EditTextBoldCursor editTextBoldCursor2 = loginActivityPasswordView.codeField;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    LoginActivity loginActivity2 = LoginActivity.this;
                    int i4 = LoginActivity.SHOW_DELAY;
                    if (!loginActivity2.isCustomKeyboardVisible()) {
                        AndroidUtilities.showKeyboard(editTextBoldCursor2);
                    }
                    RLottieImageView rLottieImageView = loginActivityPasswordView.lockImageView;
                    rLottieImageView.getAnimatedDrawable().setCurrentFrame(0, false, false);
                    rLottieImageView.playAnimation();
                }
                break;
            case 18:
                ((RLottieImageView) obj).playAnimation();
                break;
            case 19:
                ((LoginActivity.LoginActivityPhraseView) ((UsersSelectActivity.AnonymousClass4) obj).this$0).getClass();
                break;
            case 20:
                LoginActivity.LoginActivityPhraseView.AnonymousClass4 anonymousClass4 = (LoginActivity.LoginActivityPhraseView.AnonymousClass4) obj;
                anonymousClass4.getClass();
                double dCurrentTimeMillis = System.currentTimeMillis();
                LoginActivity.LoginActivityPhraseView loginActivityPhraseView = LoginActivity.LoginActivityPhraseView.this;
                double d = dCurrentTimeMillis - loginActivityPhraseView.lastCurrentTime;
                loginActivityPhraseView.lastCurrentTime = dCurrentTimeMillis;
                int i5 = (int) (((double) loginActivityPhraseView.time) - d);
                loginActivityPhraseView.time = i5;
                LoginActivity.LoginActivitySmsView.AnonymousClass3 anonymousClass3 = loginActivityPhraseView.timeText;
                if (i5 < 1000) {
                    loginActivityPhraseView.destroyTimer$2();
                    int i6 = loginActivityPhraseView.nextType;
                    if (i6 == 3 || i6 == 4 || i6 == 2 || i6 == 11) {
                        anonymousClass3.setTextSize(1, 15.0f);
                        int i7 = loginActivityPhraseView.nextType;
                        if (i7 == 4) {
                            anonymousClass3.setText(LocaleController.getString(R.string.RequestCallButton));
                        } else if (i7 == 15) {
                            anonymousClass3.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                        } else if (i7 == 11 || i7 == 3) {
                            anonymousClass3.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            anonymousClass3.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                        }
                        int i8 = Theme.key_chats_actionBackground;
                        anonymousClass3.setTextColor(Theme.getColor(null, i8, false));
                        anonymousClass3.setTag(R.id.color_key_tag, Integer.valueOf(i8));
                    }
                } else {
                    int i9 = i5 / 1000;
                    int i10 = i9 / 60;
                    int i11 = i9 - (i10 * 60);
                    anonymousClass3.setTextSize(1, 13.0f);
                    int i12 = loginActivityPhraseView.nextType;
                    if (i12 == 4 || i12 == 3 || i12 == 11) {
                        anonymousClass3.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i10), Integer.valueOf(i11)));
                    } else if (i12 == 2) {
                        anonymousClass3.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i10), Integer.valueOf(i11)));
                    }
                }
                break;
            case 21:
                double dCurrentTimeMillis2 = System.currentTimeMillis();
                LoginActivity.LoginActivitySmsView loginActivitySmsView = (LoginActivity.LoginActivitySmsView) ((zzq) obj).zza;
                double d2 = dCurrentTimeMillis2 - loginActivitySmsView.lastCodeTime;
                loginActivitySmsView.lastCodeTime = dCurrentTimeMillis2;
                int i13 = (int) (((double) loginActivitySmsView.codeTime) - d2);
                loginActivitySmsView.codeTime = i13;
                if (i13 <= 1000) {
                    loginActivitySmsView.setProblemTextVisible(true);
                    loginActivitySmsView.timeText.setVisibility(8);
                    LoginActivity.LoginActivitySmsView.AnonymousClass3 anonymousClass6 = loginActivitySmsView.problemText;
                    if (anonymousClass6 != null) {
                        anonymousClass6.setVisibility(0);
                    }
                    loginActivitySmsView.destroyCodeTimer();
                }
                break;
            case 22:
                double dCurrentTimeMillis3 = System.currentTimeMillis();
                LoginActivity.LoginActivitySmsView loginActivitySmsView2 = LoginActivity.LoginActivitySmsView.this;
                double d3 = dCurrentTimeMillis3 - loginActivitySmsView2.lastCurrentTime;
                loginActivitySmsView2.lastCurrentTime = dCurrentTimeMillis3;
                int i14 = (int) (((double) loginActivitySmsView2.time) - d3);
                loginActivitySmsView2.time = i14;
                LoginActivity.LoginActivitySmsView.AnonymousClass3 anonymousClass7 = loginActivitySmsView2.timeText;
                if (i14 < 1000) {
                    loginActivitySmsView2.destroyTimer();
                    int i15 = loginActivitySmsView2.nextType;
                    if (i15 == 3 || i15 == 4 || i15 == 2 || i15 == 17 || i15 == 16 || i15 == 11) {
                        if (i15 == 4) {
                            anonymousClass7.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                        } else if (i15 == 11 || i15 == 3) {
                            anonymousClass7.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            anonymousClass7.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                        }
                        int i16 = Theme.key_chats_actionBackground;
                        anonymousClass7.setTextColor(Theme.getColor(null, i16, false));
                        anonymousClass7.setTag(R.id.color_key_tag, Integer.valueOf(i16));
                    }
                } else {
                    int i17 = i14 / 1000;
                    int i18 = i17 / 60;
                    int i19 = i17 - (i18 * 60);
                    int i20 = loginActivitySmsView2.nextType;
                    if (i20 == 4 || i20 == 3 || i20 == 11) {
                        anonymousClass7.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i18), Integer.valueOf(i19)));
                    } else if (loginActivitySmsView2.currentType == 2 && (i20 == 2 || i20 == 17 || i20 == 16)) {
                        anonymousClass7.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i18), Integer.valueOf(i19)));
                    } else if (i20 == 2 || i20 == 17 || i20 == 16) {
                        anonymousClass7.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i18), Integer.valueOf(i19)));
                    }
                }
                break;
            case 23:
                ((LinkManager$$ExternalSyntheticLambda12) obj).run();
                break;
            case 24:
                ((MainTabsLayout) obj).lambda$new$0$1();
                break;
            case 25:
                ((MessageEnterTransitionContainer) obj).setVisibility(8);
                break;
            case 26:
                AndroidUtilities.showKeyboard(((NewContactBottomSheet) ((PollItemMenu.AnonymousClass6) obj).this$0).phoneField);
                break;
            case 27:
                ((NotificationsSettingsActivity) obj).lambda$createView$4$1$2();
                break;
            case 28:
                ((PasscodeActivity) ((PasscodeActivity.AnonymousClass8) obj).this$0).processNext();
                break;
            default:
                ((PasskeysActivity) obj).lambda$fillItems$0$2();
                break;
        }
    }
}
