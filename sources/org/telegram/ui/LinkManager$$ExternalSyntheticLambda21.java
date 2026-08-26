package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.exoplayer2.RendererCapabilities;
import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$DialogFilter$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.PassportActivity.PhoneConfirmationView.AnonymousClass5;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class LinkManager$$ExternalSyntheticLambda21 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public LinkManager$$ExternalSyntheticLambda21(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    private final void run$org$telegram$ui$PassportActivity$8$$ExternalSyntheticLambda15() {
        PassportActivity.AnonymousClass8 anonymousClass8 = (PassportActivity.AnonymousClass8) this.f$0;
        anonymousClass8.getClass();
        SecureRandom secureRandom = Utilities.random;
        PassportActivity passportActivity = PassportActivity.this;
        secureRandom.setSeed(passportActivity.currentPassword.secure_random);
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        TL_account.Password password = passportActivity.currentPassword;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = SRPHelper.startCheck((byte[]) this.f$1, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        }
        updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
        byte[] randomSecret = PassportActivity.getRandomSecret();
        passportActivity.secureSecret = randomSecret;
        passportActivity.secureSecretId = Utilities.bytesToLong(Utilities.computeSHA256(randomSecret));
        TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = passportActivity.currentPassword.new_secure_algo;
        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
            byte[] bArrComputePBKDF2 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes((String) this.f$2), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
            passportActivity.saltedPassword = bArrComputePBKDF2;
            byte[] bArr = new byte[32];
            System.arraycopy(bArrComputePBKDF2, 0, bArr, 0, 32);
            byte[] bArr2 = new byte[16];
            System.arraycopy(passportActivity.saltedPassword, 32, bArr2, 0, 16);
            byte[] bArr3 = passportActivity.secureSecret;
            Utilities.aesCbcEncryptionByteArraySafe(bArr3, bArr, bArr2, 0, bArr3.length, 0, 1);
            updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
            TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
            tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
            tL_secureSecretSettings.secure_secret = passportActivity.secureSecret;
            tL_secureSecretSettings.secure_secret_id = passportActivity.secureSecretId;
            passwordinputsettings.flags |= 4;
        }
        ConnectionsManager.getInstance(((BaseFragment) passportActivity).currentAccount).sendRequest(updatepasswordsettings, new PassportActivity$8$$ExternalSyntheticLambda0(anonymousClass8, 0));
    }

    @Override
    public final void run() {
        int i;
        TLRPC.UserFull userFull;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        boolean z2;
        int i6;
        CodeFieldContainer codeFieldContainer;
        CodeNumberField[] codeNumberFieldArr;
        int i7;
        int i8;
        boolean z3;
        int i9;
        BaseFragment baseFragment;
        ArrayList arrayList;
        CountrySelectActivity.Country country;
        Object obj;
        char c;
        int i10;
        String[] strArr;
        TLRPC.User user;
        String str;
        String translitString;
        String str2;
        char c2;
        int i11;
        String str3;
        String str4;
        char c3;
        String str5;
        TLRPC.User user2;
        int i12;
        int i13;
        int i14;
        EditTextBoldCursor[] editTextBoldCursorArr;
        int i15;
        int i16 = 6;
        int i17 = 3;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                LinkManager linkManager = (LinkManager) obj4;
                linkManager.done();
                TLObject tLObject = (TLObject) obj3;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    if (TwoStepVerificationActivity.canHandleCurrentPassword(password, false)) {
                        i = 1;
                    } else {
                        i = 1;
                        AlertsCreator.showUpdateAppAlert(linkManager.activity, LocaleController.getString(R.string.UpdateAppAlert), true);
                    }
                    LinkManager$$ExternalSyntheticLambda7 linkManager$$ExternalSyntheticLambda7 = new LinkManager$$ExternalSyntheticLambda7(linkManager, (String) obj2, i);
                    if (!password.has_password) {
                        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        twoStepVerificationSetupActivity.openedSettings = linkManager$$ExternalSyntheticLambda7;
                        linkManager.presentFragment(twoStepVerificationSetupActivity, false);
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.currentPassword = password;
                        twoStepVerificationActivity.passwordEntered = false;
                        linkManager.presentFragment(twoStepVerificationActivity, false);
                        linkManager$$ExternalSyntheticLambda7.run();
                    }
                    break;
                }
                break;
            case 1:
                LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13 = (LaunchActivity$$ExternalSyntheticLambda13) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                launchActivity.getClass();
                try {
                    launchActivity$$ExternalSyntheticLambda13.run();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        AlertsCreator.showUpdateAppAlert(launchActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        launchActivity.showAlertDialog(AlertsCreator.createSimpleAlert(launchActivity, null, LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error.text));
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 2:
                LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda14 = (LaunchActivity$$ExternalSyntheticLambda13) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj4;
                launchActivity2.getClass();
                try {
                    launchActivity$$ExternalSyntheticLambda14.run();
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                TLObject tLObject2 = (TLObject) obj3;
                if (tLObject2 instanceof TLRPC.TL_help_deepLinkInfo) {
                    TLRPC.TL_help_deepLinkInfo tL_help_deepLinkInfo = (TLRPC.TL_help_deepLinkInfo) tLObject2;
                    AlertsCreator.showUpdateAppAlert(launchActivity2, tL_help_deepLinkInfo.message, tL_help_deepLinkInfo.update_app);
                }
                break;
            case 3:
                Theme.ThemeInfo themeInfo = (Theme.ThemeInfo) obj3;
                themeInfo.createBackground((File) obj2, themeInfo.pathToWallpaper);
                AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda20((LaunchActivity) obj4, i16));
                break;
            case 4:
                LaunchActivity launchActivity3 = (LaunchActivity) obj4;
                launchActivity3.getClass();
                TLObject tLObject3 = (TLObject) obj3;
                if (!(tLObject3 instanceof TLRPC.TL_wallPaper)) {
                    launchActivity3.onThemeLoadFinish();
                } else {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject3;
                    Theme.ThemeInfo themeInfo2 = (Theme.ThemeInfo) obj2;
                    launchActivity3.loadingThemeInfo = themeInfo2;
                    launchActivity3.loadingThemeWallpaperName = FileLoader.getAttachFileName(tL_wallPaper.document);
                    launchActivity3.loadingThemeWallpaper = tL_wallPaper;
                    FileLoader.getInstance(themeInfo2.account).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                }
                break;
            case 5:
                LaunchActivity launchActivity4 = (LaunchActivity) obj4;
                launchActivity4.getClass();
                int[] iArr = (int[]) obj3;
                int i18 = iArr[0] - 1;
                iArr[0] = i18;
                if (i18 == 0) {
                    NotificationCenter.getInstance(launchActivity4.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    launchActivity4.openStories((long[]) obj2, false);
                }
                break;
            case 6:
                LinkManager.AnonymousClass1 anonymousClass1 = (LinkManager.AnonymousClass1) obj4;
                anonymousClass1.getClass();
                TLObject tLObject4 = (TLObject) obj3;
                if (tLObject4 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject4;
                    anonymousClass1.getMessagesController().putUsers(tL_users_userFull.users, false);
                    anonymousClass1.getMessagesController().putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                VoIPHelper.startCall((TLRPC.User) obj2, false, userFull != null && userFull.video_calls_available, anonymousClass1.getParentActivity(), userFull, anonymousClass1.getAccountInstance());
                break;
            case 7:
                LocationActivity locationActivity = (LocationActivity) obj4;
                locationActivity.getClass();
                ImageView imageView = new ImageView(locationActivity.getParentActivity());
                imageView.setImageBitmap((Bitmap) obj3);
                GLSurfaceView gLSurfaceView = (GLSurfaceView) obj2;
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda21(locationActivity, viewGroup, gLSurfaceView, 8), 100L);
                break;
            case 8:
                ViewGroup viewGroup2 = (ViewGroup) obj3;
                GLSurfaceView gLSurfaceView2 = (GLSurfaceView) obj2;
                LocationActivity locationActivity2 = (LocationActivity) obj4;
                locationActivity2.getClass();
                try {
                    viewGroup2.removeView(gLSurfaceView2);
                } catch (Exception e4) {
                    FileLog.e(e4);
                }
                locationActivity2.hasScreenshot = true;
                locationActivity2.finishFragment();
                break;
            case 9:
                AlertDialog[] alertDialogArr = (AlertDialog[]) obj3;
                LocationActivity locationActivity3 = (LocationActivity) obj4;
                locationActivity3.getClass();
                try {
                    alertDialogArr[0].dismiss();
                    break;
                } catch (Throwable unused) {
                }
                alertDialogArr[0] = null;
                locationActivity3.delegate.didSelectLocation((TLRPC.TL_messageMediaVenue) obj2, 4, true, 0, 0L);
                locationActivity3.finishFragment();
                break;
            case 10:
                LoginActivity loginActivity = (LoginActivity) obj4;
                loginActivity.getClass();
                loginActivity.fillNextCodeParams((Bundle) obj2, (TLRPC.auth_SentCode) ((TLObject) obj3), true);
                break;
            case 11:
                LoginActivity.AnonymousClass7 anonymousClass7 = (LoginActivity.AnonymousClass7) obj4;
                anonymousClass7.getClass();
                EditText editText = (EditText) obj3;
                editText.removeTextChangedListener(anonymousClass7);
                AtomicReference atomicReference = (AtomicReference) obj2;
                editText.removeCallbacks((Runnable) atomicReference.get());
                ((Runnable) atomicReference.get()).run();
                break;
            case 12:
                LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView = (LoginActivity.LoginActivityEmailCodeView) obj4;
                loginActivityEmailCodeView.getClass();
                TLObject tLObject5 = (TLObject) obj3;
                boolean z4 = tLObject5 instanceof TL_account.TL_emailVerified;
                LoginActivity loginActivity2 = LoginActivity.this;
                if (z4 && loginActivity2.activityMode == 3) {
                    loginActivity2.finishFragment();
                    loginActivity2.emailChangeFinishCallback.run();
                } else if (tLObject5 instanceof TL_account.TL_emailVerifiedLogin) {
                    loginActivity2.fillNextCodeParams((Bundle) obj2, ((TL_account.TL_emailVerifiedLogin) tLObject5).sent_code, true);
                } else if (tLObject5 instanceof TLRPC.TL_auth_authorization) {
                    loginActivity2.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject5, false);
                }
                break;
            case 13:
                LoginActivity.LoginActivityRegisterView loginActivityRegisterView = (LoginActivity.LoginActivityRegisterView) obj4;
                loginActivityRegisterView.nextPressed = false;
                TLObject tLObject6 = (TLObject) obj3;
                boolean z5 = tLObject6 instanceof TLRPC.TL_auth_authorization;
                LoginActivity loginActivity3 = LoginActivity.this;
                if (!z5) {
                    loginActivity3.needHideProgress(false, true);
                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                    if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                        loginActivity3.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                        loginActivity3.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                    } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                        loginActivityRegisterView.onBackPressed(true);
                        loginActivity3.setPage(0, true, null, true);
                        loginActivity3.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                    } else if (tL_error2.text.contains("FIRSTNAME_INVALID")) {
                        loginActivity3.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidFirstName", R.string.InvalidFirstName));
                    } else if (!tL_error2.text.contains("LASTNAME_INVALID")) {
                        loginActivity3.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    } else {
                        loginActivity3.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidLastName", R.string.InvalidLastName));
                    }
                } else {
                    loginActivityRegisterView.privacyView.animate().alpha(0.0f).setDuration(150L).setStartDelay(0L).setInterpolator(AndroidUtilities.accelerateInterpolator).start();
                    loginActivity3.showDoneButton(false, true);
                    loginActivityRegisterView.postDelayed(new LinkManager$$ExternalSyntheticLambda2(9, loginActivityRegisterView, tLObject6), 150L);
                }
                break;
            case 14:
                LoginActivity.LoginActivityRegisterView loginActivityRegisterView2 = (LoginActivity.LoginActivityRegisterView) obj4;
                loginActivityRegisterView2.getClass();
                TLRPC.FileLocation fileLocation = ((TLRPC.PhotoSize) obj3).location;
                loginActivityRegisterView2.avatar = fileLocation;
                loginActivityRegisterView2.avatarBig = ((TLRPC.PhotoSize) obj2).location;
                loginActivityRegisterView2.avatarImage.setImage(ImageLocation.getForLocal(fileLocation), "50_50", loginActivityRegisterView2.avatarDrawable, null);
                break;
            case 15:
                LoginActivity.LoginActivitySmsView loginActivitySmsView = (LoginActivity.LoginActivitySmsView) obj4;
                loginActivitySmsView.tryHideProgress(false);
                loginActivitySmsView.nextPressed = false;
                LoginActivity loginActivity4 = LoginActivity.this;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                if (tL_error3 != null) {
                    loginActivitySmsView.lastError = tL_error3.text;
                    int i19 = loginActivitySmsView.currentType;
                    if (i19 == 3) {
                        int i20 = loginActivitySmsView.nextType;
                        if (i20 != 4) {
                            i2 = 2;
                            if (i20 == 2 || i20 == 17 || i20 == 16) {
                            }
                            if (i19 == 15) {
                                NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
                                z = true;
                            } else if (i19 == 2) {
                                z = true;
                                AndroidUtilities.setWaitingForSms(true);
                                NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
                            } else {
                                z = true;
                                if (i19 == 3) {
                                    AndroidUtilities.setWaitingForCall(true);
                                    NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveCall);
                                }
                            }
                            loginActivitySmsView.waitingForEvent = z;
                            if (i19 != 3) {
                                AlertsCreator.processError(((BaseFragment) loginActivity4).currentAccount, tL_error3, loginActivity4, (TL_account.confirmPhone) obj2, new Object[0]);
                            }
                            if (!tL_error3.text.contains("PHONE_CODE_EMPTY") || tL_error3.text.contains("PHONE_CODE_INVALID")) {
                                loginActivitySmsView.shakeWrongCode();
                            } else if (tL_error3.text.contains("PHONE_CODE_EXPIRED")) {
                                loginActivitySmsView.onBackPressed(true);
                                loginActivity4.setPage(0, true, null, true);
                            }
                        }
                        loginActivitySmsView.createTimer();
                        if (i19 == 15) {
                            NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
                            z = true;
                        } else if (i19 == 2) {
                            z = true;
                            AndroidUtilities.setWaitingForSms(true);
                            NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
                        } else {
                            z = true;
                            if (i19 == 3) {
                                AndroidUtilities.setWaitingForCall(true);
                                NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveCall);
                            }
                        }
                        loginActivitySmsView.waitingForEvent = z;
                        if (i19 != 3) {
                            AlertsCreator.processError(((BaseFragment) loginActivity4).currentAccount, tL_error3, loginActivity4, (TL_account.confirmPhone) obj2, new Object[0]);
                        }
                        if (!tL_error3.text.contains("PHONE_CODE_EMPTY")) {
                        }
                        loginActivitySmsView.shakeWrongCode();
                    } else {
                        i2 = 2;
                    }
                    if (i19 == i2) {
                        int i21 = loginActivitySmsView.nextType;
                        i3 = 4;
                        if (i21 == 4 || i21 == 3) {
                            loginActivitySmsView.createTimer();
                        }
                        if (i19 == 15) {
                            NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
                            z = true;
                        } else if (i19 == 2) {
                            z = true;
                            AndroidUtilities.setWaitingForSms(true);
                            NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
                        } else {
                            z = true;
                            if (i19 == 3) {
                                AndroidUtilities.setWaitingForCall(true);
                                NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveCall);
                            }
                        }
                        loginActivitySmsView.waitingForEvent = z;
                        if (i19 != 3) {
                            AlertsCreator.processError(((BaseFragment) loginActivity4).currentAccount, tL_error3, loginActivity4, (TL_account.confirmPhone) obj2, new Object[0]);
                        }
                        if (!tL_error3.text.contains("PHONE_CODE_EMPTY")) {
                        }
                        loginActivitySmsView.shakeWrongCode();
                    } else {
                        i3 = 4;
                    }
                    if (i19 == i3 && ((i4 = loginActivitySmsView.nextType) == i2 || i4 == 17 || i4 == 16)) {
                        loginActivitySmsView.createTimer();
                    }
                    if (i19 == 15) {
                        NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
                        z = true;
                    } else if (i19 == 2) {
                        z = true;
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
                    } else {
                        z = true;
                        if (i19 == 3) {
                            AndroidUtilities.setWaitingForCall(true);
                            NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveCall);
                        }
                    }
                    loginActivitySmsView.waitingForEvent = z;
                    if (i19 != 3) {
                        AlertsCreator.processError(((BaseFragment) loginActivity4).currentAccount, tL_error3, loginActivity4, (TL_account.confirmPhone) obj2, new Object[0]);
                    }
                    if (!tL_error3.text.contains("PHONE_CODE_EMPTY")) {
                    }
                    loginActivitySmsView.shakeWrongCode();
                    break;
                } else {
                    Activity parentActivity = loginActivity4.getParentActivity();
                    if (parentActivity != null) {
                        loginActivitySmsView.animateSuccess(new LinkManager$$ExternalSyntheticLambda2(12, loginActivitySmsView, parentActivity));
                        break;
                    }
                }
                break;
            case 16:
                LoginActivity.LoginActivitySmsView loginActivitySmsView2 = (LoginActivity.LoginActivitySmsView) obj4;
                loginActivitySmsView2.tryHideProgress(false);
                loginActivitySmsView2.nextPressed = false;
                LoginActivity loginActivity5 = LoginActivity.this;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                int i22 = loginActivitySmsView2.currentType;
                if (tL_error4 != null) {
                    loginActivitySmsView2.lastError = tL_error4.text;
                    loginActivitySmsView2.nextPressed = false;
                    loginActivity5.showDoneButton(false, true);
                    if (i22 == 3) {
                        int i23 = loginActivitySmsView2.nextType;
                        if (i23 != 4) {
                            i5 = 2;
                            if (i23 == 2 || i23 == 17 || i23 == 16) {
                            }
                            if (i22 == 15) {
                                NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView2, NotificationCenter.didReceiveSmsCode);
                                z2 = true;
                            } else if (i22 == 2) {
                                z2 = true;
                                AndroidUtilities.setWaitingForSms(true);
                                NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView2, NotificationCenter.didReceiveSmsCode);
                            } else {
                                z2 = true;
                                if (i22 == 3) {
                                    AndroidUtilities.setWaitingForCall(true);
                                    NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView2, NotificationCenter.didReceiveCall);
                                }
                            }
                            loginActivitySmsView2.waitingForEvent = z2;
                            if (i22 != 3) {
                                if (!tL_error4.text.contains("PHONE_NUMBER_INVALID")) {
                                    loginActivity5.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                } else if (!tL_error4.text.contains("PHONE_CODE_EMPTY") || tL_error4.text.contains("PHONE_CODE_INVALID")) {
                                    loginActivitySmsView2.shakeWrongCode();
                                    break;
                                } else if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                                    loginActivitySmsView2.onBackPressed(true);
                                    loginActivity5.setPage(0, true, null, true);
                                    loginActivity5.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                } else if (tL_error4.text.startsWith("FLOOD_WAIT")) {
                                    loginActivity5.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                } else {
                                    loginActivity5.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error4.text);
                                }
                                i6 = 0;
                                while (true) {
                                    codeFieldContainer = loginActivitySmsView2.codeFieldContainer;
                                    codeNumberFieldArr = codeFieldContainer.codeField;
                                    if (i6 < codeNumberFieldArr.length) {
                                        codeFieldContainer.isFocusSuppressed = false;
                                        codeNumberFieldArr[0].requestFocus();
                                    } else {
                                        codeNumberFieldArr[i6].setText("");
                                        i6++;
                                    }
                                }
                            }
                        }
                        loginActivitySmsView2.createTimer();
                        if (i22 == 15) {
                            NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView2, NotificationCenter.didReceiveSmsCode);
                            z2 = true;
                        } else if (i22 == 2) {
                            z2 = true;
                            AndroidUtilities.setWaitingForSms(true);
                            NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView2, NotificationCenter.didReceiveSmsCode);
                        } else {
                            z2 = true;
                            if (i22 == 3) {
                                AndroidUtilities.setWaitingForCall(true);
                                NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView2, NotificationCenter.didReceiveCall);
                            }
                        }
                        loginActivitySmsView2.waitingForEvent = z2;
                        if (i22 != 3) {
                            if (!tL_error4.text.contains("PHONE_NUMBER_INVALID")) {
                                if (tL_error4.text.contains("PHONE_CODE_EMPTY")) {
                                }
                                loginActivitySmsView2.shakeWrongCode();
                            } else {
                                loginActivity5.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                            }
                            i6 = 0;
                            while (true) {
                                codeFieldContainer = loginActivitySmsView2.codeFieldContainer;
                                codeNumberFieldArr = codeFieldContainer.codeField;
                                if (i6 < codeNumberFieldArr.length) {
                                    codeFieldContainer.isFocusSuppressed = false;
                                    codeNumberFieldArr[0].requestFocus();
                                } else {
                                    codeNumberFieldArr[i6].setText("");
                                    i6++;
                                }
                            }
                        }
                    } else {
                        i5 = 2;
                    }
                    if (i22 == i5) {
                        int i24 = loginActivitySmsView2.nextType;
                        i7 = 4;
                        if (i24 == 4 || i24 == 3) {
                            loginActivitySmsView2.createTimer();
                        }
                        if (i22 == 15) {
                            NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView2, NotificationCenter.didReceiveSmsCode);
                            z2 = true;
                        } else if (i22 == 2) {
                            z2 = true;
                            AndroidUtilities.setWaitingForSms(true);
                            NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView2, NotificationCenter.didReceiveSmsCode);
                        } else {
                            z2 = true;
                            if (i22 == 3) {
                                AndroidUtilities.setWaitingForCall(true);
                                NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView2, NotificationCenter.didReceiveCall);
                            }
                        }
                        loginActivitySmsView2.waitingForEvent = z2;
                        if (i22 != 3) {
                            if (!tL_error4.text.contains("PHONE_NUMBER_INVALID")) {
                                if (tL_error4.text.contains("PHONE_CODE_EMPTY")) {
                                }
                                loginActivitySmsView2.shakeWrongCode();
                            } else {
                                loginActivity5.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                            }
                            i6 = 0;
                            while (true) {
                                codeFieldContainer = loginActivitySmsView2.codeFieldContainer;
                                codeNumberFieldArr = codeFieldContainer.codeField;
                                if (i6 < codeNumberFieldArr.length) {
                                    codeFieldContainer.isFocusSuppressed = false;
                                    codeNumberFieldArr[0].requestFocus();
                                } else {
                                    codeNumberFieldArr[i6].setText("");
                                    i6++;
                                }
                            }
                        }
                    } else {
                        i7 = 4;
                    }
                    if (i22 == i7 && ((i8 = loginActivitySmsView2.nextType) == i5 || i8 == 17 || i8 == 16)) {
                        loginActivitySmsView2.createTimer();
                    }
                    if (i22 == 15) {
                        NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView2, NotificationCenter.didReceiveSmsCode);
                        z2 = true;
                    } else if (i22 == 2) {
                        z2 = true;
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView2, NotificationCenter.didReceiveSmsCode);
                    } else {
                        z2 = true;
                        if (i22 == 3) {
                            AndroidUtilities.setWaitingForCall(true);
                            NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView2, NotificationCenter.didReceiveCall);
                        }
                    }
                    loginActivitySmsView2.waitingForEvent = z2;
                    if (i22 != 3) {
                        if (!tL_error4.text.contains("PHONE_NUMBER_INVALID")) {
                            if (tL_error4.text.contains("PHONE_CODE_EMPTY")) {
                            }
                            loginActivitySmsView2.shakeWrongCode();
                        } else {
                            loginActivity5.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                        }
                        i6 = 0;
                        while (true) {
                            codeFieldContainer = loginActivitySmsView2.codeFieldContainer;
                            codeNumberFieldArr = codeFieldContainer.codeField;
                            if (i6 < codeNumberFieldArr.length) {
                                codeFieldContainer.isFocusSuppressed = false;
                                codeNumberFieldArr[0].requestFocus();
                            } else {
                                codeNumberFieldArr[i6].setText("");
                                i6++;
                            }
                        }
                    }
                } else {
                    TLRPC.User user3 = (TLRPC.User) ((TLObject) obj3);
                    loginActivitySmsView2.destroyTimer();
                    loginActivitySmsView2.destroyCodeTimer();
                    UserConfig.getInstance(((BaseFragment) loginActivity5).currentAccount).setCurrentUser(user3);
                    UserConfig.getInstance(((BaseFragment) loginActivity5).currentAccount).saveConfig(true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user3);
                    MessagesStorage.getInstance(((BaseFragment) loginActivity5).currentAccount).putUsersAndChats(arrayList2, null, true, true);
                    MessagesController.getInstance(((BaseFragment) loginActivity5).currentAccount).putUser(user3, false);
                    NotificationCenter.getInstance(((BaseFragment) loginActivity5).currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                    loginActivity5.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                    if (i22 == 3) {
                        AndroidUtilities.endIncomingCall();
                    }
                    loginActivitySmsView2.animateSuccess(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8(loginActivitySmsView2, 4));
                }
                break;
            case 17:
                LoginActivity.LoginActivitySmsView loginActivitySmsView3 = (LoginActivity.LoginActivitySmsView) obj4;
                Bundle bundle = (Bundle) obj2;
                loginActivitySmsView3.nextCodeParams = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) ((TLObject) obj3);
                loginActivitySmsView3.nextCodeAuth = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    loginActivitySmsView3.nextType = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    loginActivitySmsView3.nextType = 16;
                }
                LoginActivity.this.fillNextCodeParams(bundle, tL_auth_sentCode, true);
                break;
            case 18:
                LoginActivity.LoginPayView loginPayView = (LoginActivity.LoginPayView) obj4;
                loginPayView.pollingRequestId = -1;
                TLObject tLObject7 = (TLObject) obj3;
                boolean z6 = tLObject7 instanceof TLRPC.auth_SentCode;
                ButtonWithCounterView buttonWithCounterView = loginPayView.button;
                LoginActivity loginActivity6 = LoginActivity.this;
                if (!z6) {
                    TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                    if (tL_error5 != null) {
                        String str6 = tL_error5.text;
                        if (str6 != null && str6.startsWith("FLOOD_WAIT_")) {
                            AndroidUtilities.runOnUIThread(new LoginActivity$LoginPayView$$ExternalSyntheticLambda4(loginPayView, i17), Integer.parseInt(tL_error5.text.substring(11)) * 1000);
                        } else {
                            String str7 = tL_error5.text;
                            if (str7 != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(str7)) {
                                loginActivity6.setPage(0, true, null, true);
                                loginActivity6.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else {
                                loginPayView.lastError = tL_error5.text;
                                loginPayView.polling = false;
                                buttonWithCounterView.setLoading(false);
                                new BulletinFactory(loginActivity6.slideViewsContainer, null).createSimpleBulletinWithIconSize(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, tL_error5.text));
                            }
                        }
                    }
                } else {
                    loginPayView.polling = false;
                    buttonWithCounterView.setLoading(false);
                    INavigationLayout parentLayout = loginActivity6.getParentLayout();
                    if (parentLayout != null) {
                        ActionBarLayout actionBarLayout = (ActionBarLayout) parentLayout;
                        if (actionBarLayout.getFragmentStack() == null) {
                            z3 = true;
                        } else {
                            List<BaseFragment> fragmentStack = actionBarLayout.getFragmentStack();
                            if (fragmentStack.isEmpty()) {
                                baseFragment = null;
                                i9 = 1;
                            } else {
                                i9 = 1;
                                baseFragment = (BaseFragment) RendererCapabilities.CC.m(1, fragmentStack);
                            }
                            ArrayList arrayList3 = new ArrayList(fragmentStack);
                            int size = arrayList3.size();
                            int i25 = 0;
                            while (i25 < size) {
                                Object obj5 = arrayList3.get(i25);
                                i25 += i9;
                                BaseFragment baseFragment2 = (BaseFragment) obj5;
                                if ((baseFragment2 instanceof PaymentFormActivity) && baseFragment2 != baseFragment) {
                                    baseFragment2.removeSelfFromStack();
                                }
                                i9 = 1;
                            }
                            if (baseFragment instanceof PaymentFormActivity) {
                                z3 = true;
                                ((ActionBarLayout) parentLayout).closeLastFragment(true, false);
                            } else {
                                z3 = true;
                            }
                        }
                    } else {
                        z3 = true;
                    }
                    loginActivity6.fillNextCodeParams(loginPayView.params, (TLRPC.auth_SentCode) tLObject7, z3);
                }
                break;
            case 19:
                LoginActivity loginActivity7 = LoginActivity.this;
                loginActivity7.paid = true;
                LoginActivity loginActivity8 = (LoginActivity) LaunchActivity.findFragment();
                if (loginActivity8 == null) {
                    loginActivity8 = new LoginActivity(((BaseFragment) loginActivity7).currentAccount);
                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    if (safeLastFragment != null) {
                        safeLastFragment.presentFragment(loginActivity8);
                    }
                }
                String str8 = ((TLRPC.TL_inputStorePaymentAuthCode) obj3).phone_number;
                TLRPC.auth_SentCode auth_sentcode = ((TL_update.TL_updateSentPhoneCode) obj2).sent_code;
                loginActivity8.paid = true;
                Bundle bundle2 = new Bundle();
                bundle2.putString("phone", "+" + str8);
                bundle2.putString("ephone", "+" + str8);
                bundle2.putString("phoneFormated", str8);
                loginActivity8.fillNextCodeParams(bundle2, auth_sentcode, true);
                break;
            case 20:
                LoginActivity.PhoneView phoneView = (LoginActivity.PhoneView) obj4;
                phoneView.getClass();
                TLObject tLObject8 = (TLObject) obj3;
                if (tLObject8 != null) {
                    TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject8;
                    NewContactBottomSheet.AnonymousClass3 anonymousClass3 = phoneView.codeField;
                    if (anonymousClass3.length() == 0) {
                        String upperCase = tL_nearestDc.country.toUpperCase();
                        if (((String) ((HashMap) obj2).get(upperCase)) != null && (arrayList = phoneView.countriesArray) != null) {
                            int i26 = 0;
                            while (true) {
                                if (i26 >= arrayList.size()) {
                                    country = null;
                                } else if (arrayList.get(i26) == null || !((CountrySelectActivity.Country) arrayList.get(i26)).name.equals(upperCase)) {
                                    i26++;
                                } else {
                                    country = (CountrySelectActivity.Country) arrayList.get(i26);
                                }
                            }
                            if (country != null) {
                                anonymousClass3.setText(country.code);
                                phoneView.countryState = 0;
                            }
                            break;
                        }
                    }
                }
                break;
            case 21:
                ManageLinksActivity manageLinksActivity = (ManageLinksActivity) obj4;
                if (((TLRPC.TL_error) obj3) != null) {
                    manageLinksActivity.getClass();
                } else {
                    int i27 = 0;
                    while (true) {
                        ManageLinksActivity.AnonymousClass6 anonymousClass6 = manageLinksActivity.linkEditActivityCallback;
                        if (i27 < ManageLinksActivity.this.revokedInvites.size()) {
                            ManageLinksActivity manageLinksActivity2 = ManageLinksActivity.this;
                            if (((TLRPC.TL_chatInviteExported) manageLinksActivity2.revokedInvites.get(i27)).link.equals(((TLRPC.TL_chatInviteExported) obj2).link)) {
                                ManageLinksActivity.DiffCallback diffCallbackSaveListState = manageLinksActivity2.saveListState();
                                manageLinksActivity2.revokedInvites.remove(i27);
                                manageLinksActivity2.updateRecyclerViewAnimated(diffCallbackSaveListState);
                            } else {
                                i27++;
                            }
                        }
                    }
                }
                break;
            case 22:
                ((NewContactBottomSheet) obj4).lambda$updatedPhone$18((TLRPC.TL_contact) obj3, (OAuthSheet$$ExternalSyntheticLambda13) obj2);
                break;
            case 23:
                ((NewContactBottomSheet) obj4).lambda$updatedPhone$19((TLObject) obj3, (OAuthSheet$$ExternalSyntheticLambda13) obj2);
                break;
            case 24:
                NotificationsCustomSettingsActivity.SearchAdapter searchAdapter = (NotificationsCustomSettingsActivity.SearchAdapter) obj4;
                searchAdapter.getClass();
                String lowerCase = ((String) obj2).trim().toLowerCase();
                if (lowerCase.length() != 0) {
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString2) || translitString2.length() == 0) {
                        translitString2 = null;
                    }
                    int i28 = (translitString2 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i28];
                    strArr2[0] = lowerCase;
                    if (translitString2 != null) {
                        strArr2[1] = translitString2;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    String[] strArr3 = new String[2];
                    int i29 = 0;
                    while (true) {
                        ArrayList arrayList7 = (ArrayList) obj3;
                        if (i29 >= arrayList7.size()) {
                            AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda12(searchAdapter, arrayList5, arrayList6, arrayList4, 17));
                        } else {
                            NotificationsSettingsActivity.NotificationException notificationException = (NotificationsSettingsActivity.NotificationException) arrayList7.get(i29);
                            boolean zIsEncryptedDialog = DialogObject.isEncryptedDialog(notificationException.did);
                            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = NotificationsCustomSettingsActivity.this;
                            if (zIsEncryptedDialog) {
                                obj = obj3;
                                c = 0;
                                TLRPC.EncryptedChat encryptedChatM = MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(notificationsCustomSettingsActivity.getMessagesController(), notificationException.did);
                                if (encryptedChatM != null && (user2 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(encryptedChatM.user_id))) != null) {
                                    strArr3[0] = ContactsController.formatName(user2.first_name, user2.last_name);
                                    strArr3[1] = UserObject.getPublicUsername(user2);
                                }
                            } else {
                                obj = obj3;
                                c = 0;
                                if (DialogObject.isUserDialog(notificationException.did)) {
                                    TLRPC.User user4 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(notificationException.did));
                                    if (user4 != null && !user4.deleted) {
                                        strArr3[0] = ContactsController.formatName(user4.first_name, user4.last_name);
                                        strArr3[1] = UserObject.getPublicUsername(user4);
                                        user = user4;
                                        str = strArr3[c];
                                        strArr3[c] = str.toLowerCase();
                                        translitString = LocaleController.getInstance().getTranslitString(strArr3[c]);
                                        str2 = strArr3[c];
                                        if (str2 != null && str2.equals(translitString)) {
                                            translitString = null;
                                        }
                                        c2 = 0;
                                        i11 = 0;
                                        while (true) {
                                            if (i11 < i28) {
                                                str3 = strArr2[i11];
                                                i10 = i28;
                                                str4 = strArr3[c];
                                                strArr = strArr2;
                                                if (!(str4 == null && (str4.startsWith(str3) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str3, strArr3[c]))) && (translitString == null || !(translitString.startsWith(str3) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str3, translitString)))) {
                                                    c3 = 1;
                                                    str5 = strArr3[1];
                                                    if (str5 != null && str5.startsWith(str3)) {
                                                        c2 = 2;
                                                    }
                                                } else {
                                                    c3 = 1;
                                                    c2 = 1;
                                                }
                                                if (c2 != 0) {
                                                    if (c2 == c3) {
                                                        arrayList6.add(AndroidUtilities.generateSearchName(str, null, str3));
                                                    } else {
                                                        arrayList6.add(AndroidUtilities.generateSearchName("@" + strArr3[c3], null, "@" + str3));
                                                    }
                                                    arrayList5.add(notificationException);
                                                    if (user != null) {
                                                        arrayList4.add(user);
                                                    }
                                                } else {
                                                    i11++;
                                                    i28 = i10;
                                                    strArr2 = strArr;
                                                }
                                            }
                                        }
                                    }
                                    i29++;
                                    obj3 = obj;
                                    i28 = i10;
                                    strArr2 = strArr;
                                } else {
                                    TLRPC.Chat chat = notificationsCustomSettingsActivity.getMessagesController().getChat(Long.valueOf(-notificationException.did));
                                    if (chat != null) {
                                        if (!chat.left && !chat.kicked && chat.migrated_to == null) {
                                            strArr3[0] = chat.title;
                                            strArr3[1] = ChatObject.getPublicUsername(chat);
                                            user = chat;
                                        }
                                        i29++;
                                        obj3 = obj;
                                        i28 = i10;
                                        strArr2 = strArr;
                                    }
                                    str = strArr3[c];
                                    strArr3[c] = str.toLowerCase();
                                    translitString = LocaleController.getInstance().getTranslitString(strArr3[c]);
                                    str2 = strArr3[c];
                                    if (str2 != null) {
                                        translitString = null;
                                    }
                                    c2 = 0;
                                    i11 = 0;
                                    while (true) {
                                        if (i11 < i28) {
                                            str3 = strArr2[i11];
                                            i10 = i28;
                                            str4 = strArr3[c];
                                            strArr = strArr2;
                                            if (str4 == null) {
                                                c3 = 1;
                                                str5 = strArr3[1];
                                                if (str5 != null) {
                                                    c2 = 2;
                                                }
                                            } else {
                                                c3 = 1;
                                                str5 = strArr3[1];
                                                if (str5 != null) {
                                                    c2 = 2;
                                                }
                                            }
                                            if (c2 != 0) {
                                                if (c2 == c3) {
                                                    arrayList6.add(AndroidUtilities.generateSearchName(str, null, str3));
                                                } else {
                                                    arrayList6.add(AndroidUtilities.generateSearchName("@" + strArr3[c3], null, "@" + str3));
                                                }
                                                arrayList5.add(notificationException);
                                                if (user != null) {
                                                    arrayList4.add(user);
                                                }
                                            } else {
                                                i11++;
                                                i28 = i10;
                                                strArr2 = strArr;
                                            }
                                        }
                                    }
                                    i29++;
                                    obj3 = obj;
                                    i28 = i10;
                                    strArr2 = strArr;
                                }
                                i10 = i28;
                                strArr = strArr2;
                                i29++;
                                obj3 = obj;
                                i28 = i10;
                                strArr2 = strArr;
                            }
                            user = null;
                            str = strArr3[c];
                            strArr3[c] = str.toLowerCase();
                            translitString = LocaleController.getInstance().getTranslitString(strArr3[c]);
                            str2 = strArr3[c];
                            if (str2 != null) {
                                translitString = null;
                            }
                            c2 = 0;
                            i11 = 0;
                            while (true) {
                                if (i11 < i28) {
                                    str3 = strArr2[i11];
                                    i10 = i28;
                                    str4 = strArr3[c];
                                    strArr = strArr2;
                                    if (str4 == null) {
                                        c3 = 1;
                                        str5 = strArr3[1];
                                        if (str5 != null) {
                                            c2 = 2;
                                        }
                                    } else {
                                        c3 = 1;
                                        str5 = strArr3[1];
                                        if (str5 != null) {
                                            c2 = 2;
                                        }
                                    }
                                    if (c2 != 0) {
                                        if (c2 == c3) {
                                            arrayList6.add(AndroidUtilities.generateSearchName(str, null, str3));
                                        } else {
                                            arrayList6.add(AndroidUtilities.generateSearchName("@" + strArr3[c3], null, "@" + str3));
                                        }
                                        arrayList5.add(notificationException);
                                        if (user != null) {
                                            arrayList4.add(user);
                                        }
                                    } else {
                                        i11++;
                                        i28 = i10;
                                        strArr2 = strArr;
                                    }
                                } else {
                                    i10 = i28;
                                    strArr = strArr2;
                                }
                            }
                            i29++;
                            obj3 = obj;
                            i28 = i10;
                            strArr2 = strArr;
                        }
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda12(searchAdapter, new ArrayList(), new ArrayList(), new ArrayList(), 17));
                }
                break;
            case 25:
                ((NotificationsSettingsActivity) obj4).lambda$loadExceptions$2((ArrayList) obj3, (OAuthSheet$$ExternalSyntheticLambda2) obj2);
                break;
            case 26:
                PassportActivity passportActivity = (PassportActivity) obj4;
                passportActivity.needHideProgress();
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                if (tL_error6 == null) {
                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) ((TLObject) obj3);
                    AlertDialog.Builder builder = new AlertDialog.Builder(passportActivity.getParentActivity(), 0, null);
                    String string = LocaleController.formatString("RestoreEmailSent", R.string.RestoreEmailSent, tL_auth_passwordRecovery.email_pattern);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.message = string;
                    alertDialog.title = LocaleController.getString(R.string.RestoreEmailSentTitle);
                    builder.setPositiveButton(LocaleController.getString(R.string.OK), new SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10(i17, passportActivity, tL_auth_passwordRecovery));
                    Dialog dialogShowDialog = passportActivity.showDialog(alertDialog);
                    if (dialogShowDialog != null) {
                        dialogShowDialog.setCanceledOnTouchOutside(false);
                        dialogShowDialog.setCancelable(false);
                    }
                } else if (!tL_error6.text.startsWith("FLOOD_WAIT")) {
                    passportActivity.showAlertWithText(LocaleController.getString(R.string.AppName), tL_error6.text);
                } else {
                    int iIntValue = Utilities.parseInt((CharSequence) tL_error6.text).intValue();
                    passportActivity.showAlertWithText(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                }
                break;
            case 27:
                ((PhotoViewer.AnonymousClass14) obj4).onError(((TLRPC.TL_error) obj3).text, (String) obj2);
                break;
            case 28:
                run$org$telegram$ui$PassportActivity$8$$ExternalSyntheticLambda15();
                break;
            default:
                PassportActivity.PhoneConfirmationView phoneConfirmationView = (PassportActivity.PhoneConfirmationView) obj4;
                PassportActivity passportActivity2 = PassportActivity.this;
                passportActivity2.needHideProgress();
                phoneConfirmationView.nextPressed = false;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj3;
                if (tL_error7 != null) {
                    phoneConfirmationView.lastError = tL_error7.text;
                    int i30 = phoneConfirmationView.verificationType;
                    if (i30 == 3) {
                        int i31 = phoneConfirmationView.nextType;
                        i12 = 4;
                        if (i31 != 4) {
                            i13 = 2;
                            if (i31 != 2) {
                            }
                            if (i30 == i13) {
                                AndroidUtilities.setWaitingForSms(true);
                                NotificationCenter.getGlobalInstance().addObserver(phoneConfirmationView, NotificationCenter.didReceiveSmsCode);
                            } else if (i30 == 3) {
                                AndroidUtilities.setWaitingForCall(true);
                                NotificationCenter.getGlobalInstance().addObserver(phoneConfirmationView, NotificationCenter.didReceiveCall);
                            }
                            phoneConfirmationView.waitingForEvent = true;
                            if (i30 != 3) {
                                AlertsCreator.processError(((BaseFragment) passportActivity2).currentAccount, tL_error7, passportActivity2, (TL_account.verifyPhone) obj2, new Object[0]);
                            }
                            passportActivity2.showEditDoneProgress$2(true, false);
                            if (!tL_error7.text.contains("PHONE_CODE_EMPTY") || tL_error7.text.contains("PHONE_CODE_INVALID")) {
                                i14 = 0;
                                while (true) {
                                    editTextBoldCursorArr = phoneConfirmationView.codeField;
                                    if (i14 >= editTextBoldCursorArr.length) {
                                        editTextBoldCursorArr[0].requestFocus();
                                    } else {
                                        editTextBoldCursorArr[i14].setText("");
                                        i14++;
                                    }
                                }
                            } else if (tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                                phoneConfirmationView.onBackPressed(true);
                                passportActivity2.setPage(0, true, null);
                            }
                        }
                        if (phoneConfirmationView.timeTimer == null) {
                            Timer timer = new Timer();
                            phoneConfirmationView.timeTimer = timer;
                            timer.schedule(phoneConfirmationView.new AnonymousClass5(), 0L, 1000L);
                        }
                        i13 = 2;
                        if (i30 == i13) {
                            AndroidUtilities.setWaitingForSms(true);
                            NotificationCenter.getGlobalInstance().addObserver(phoneConfirmationView, NotificationCenter.didReceiveSmsCode);
                        } else if (i30 == 3) {
                            AndroidUtilities.setWaitingForCall(true);
                            NotificationCenter.getGlobalInstance().addObserver(phoneConfirmationView, NotificationCenter.didReceiveCall);
                        }
                        phoneConfirmationView.waitingForEvent = true;
                        if (i30 != 3) {
                            AlertsCreator.processError(((BaseFragment) passportActivity2).currentAccount, tL_error7, passportActivity2, (TL_account.verifyPhone) obj2, new Object[0]);
                        }
                        passportActivity2.showEditDoneProgress$2(true, false);
                        if (!tL_error7.text.contains("PHONE_CODE_EMPTY")) {
                        }
                        i14 = 0;
                        while (true) {
                            editTextBoldCursorArr = phoneConfirmationView.codeField;
                            if (i14 >= editTextBoldCursorArr.length) {
                                editTextBoldCursorArr[0].requestFocus();
                            } else {
                                editTextBoldCursorArr[i14].setText("");
                                i14++;
                            }
                        }
                    } else {
                        i12 = 4;
                        i13 = 2;
                    }
                    if ((i30 == i13 && ((i15 = phoneConfirmationView.nextType) == i12 || i15 == 3)) || (i30 == i12 && phoneConfirmationView.nextType == i13)) {
                        if (phoneConfirmationView.timeTimer == null) {
                            Timer timer2 = new Timer();
                            phoneConfirmationView.timeTimer = timer2;
                            timer2.schedule(phoneConfirmationView.new AnonymousClass5(), 0L, 1000L);
                        }
                        i13 = 2;
                    }
                    if (i30 == i13) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(phoneConfirmationView, NotificationCenter.didReceiveSmsCode);
                    } else if (i30 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(phoneConfirmationView, NotificationCenter.didReceiveCall);
                    }
                    phoneConfirmationView.waitingForEvent = true;
                    if (i30 != 3) {
                        AlertsCreator.processError(((BaseFragment) passportActivity2).currentAccount, tL_error7, passportActivity2, (TL_account.verifyPhone) obj2, new Object[0]);
                    }
                    passportActivity2.showEditDoneProgress$2(true, false);
                    if (!tL_error7.text.contains("PHONE_CODE_EMPTY")) {
                    }
                    i14 = 0;
                    while (true) {
                        editTextBoldCursorArr = phoneConfirmationView.codeField;
                        if (i14 >= editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[0].requestFocus();
                        } else {
                            editTextBoldCursorArr[i14].setText("");
                            i14++;
                        }
                    }
                } else {
                    phoneConfirmationView.destroyTimer$1();
                    phoneConfirmationView.destroyCodeTimer$1();
                    ((PassportActivity.AnonymousClass20) passportActivity2.delegate).saveValue(passportActivity2.currentType, (String) passportActivity2.currentValues.get("phone"), null, null, null, null, null, null, null, null, new PassportActivity$$ExternalSyntheticLambda14(passportActivity2, i16), null);
                }
                break;
        }
    }

    public LinkManager$$ExternalSyntheticLambda21(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = obj3;
    }
}
