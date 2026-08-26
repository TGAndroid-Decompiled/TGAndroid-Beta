package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.widget.EditText;
import android.widget.Toast;
import j$.util.Comparator$CC;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline0;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.UserObject$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.TranslateButton$$ExternalSyntheticLambda3;
import org.telegram.ui.Stars.StarGiftPreviewSheet$$ExternalSyntheticLambda5;

public final class LinkManager$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public LinkManager$$ExternalSyntheticLambda2(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        ArrayList<TLRPC.EncryptedChat> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        ArrayList<TLRPC.User> arrayList3;
        int size;
        int i;
        int size2;
        int i2;
        int size3;
        int i3;
        int size4;
        int i4;
        TLRPC.User user;
        TLRPC.Chat chat;
        NotificationsSettingsActivity.NotificationException notificationException;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i5;
        int i6;
        int i7 = 10;
        int i8 = 7;
        int i9 = 2;
        switch (this.$r8$classId) {
            case 0:
                ((FiltersSetupActivity) this.f$1).createFolder(((LinkManager) this.f$0).activity.getActionBarLayout());
                break;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) this.f$0;
                launchActivity.actionBarLayout.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity.layersActionBarLayout;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity.layersActionBarLayout.getView().getVisibility() == 0) {
                        launchActivity.layersActionBarLayout.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity.rightActionBarLayout;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity.rightActionBarLayout.getView().setVisibility(4);
                    }
                }
                ComposeDrawable$$ExternalSyntheticLambda0 composeDrawable$$ExternalSyntheticLambda0 = (ComposeDrawable$$ExternalSyntheticLambda0) this.f$1;
                if (composeDrawable$$ExternalSyntheticLambda0 != null) {
                    composeDrawable$$ExternalSyntheticLambda0.run();
                }
                break;
            case 2:
                LinkManager linkManager = (LinkManager) this.f$0;
                linkManager.done();
                TLObject tLObject = (TLObject) this.f$1;
                if (tLObject != null) {
                    linkManager.activity.openEmailSettings((TL_account.Password) tLObject);
                }
                break;
            case 3:
                LocationActivity locationActivity = (LocationActivity) this.f$0;
                locationActivity.getClass();
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f$1;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, byteBufferAllocateDirect);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, false);
                    bitmapCreateBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda21(locationActivity, bitmapCreateBitmap2, gLSurfaceView, i8));
                    break;
                }
                break;
            case 4:
                LocationActivity locationActivity2 = (LocationActivity) this.f$0;
                locationActivity2.proximityButton.setImageResource(R.drawable.msg_location_alert2);
                locationActivity2.createCircle(((LocationController.SharingLocationInfo) this.f$1).proximityMeters);
                locationActivity2.canUndo = false;
                break;
            case 5:
                ((EditText) this.f$0).removeTextChangedListener((LoginActivity.AnonymousClass7) this.f$1);
                break;
            case 6:
                int i10 = 0;
                while (true) {
                    PasscodeActivity.AnonymousClass8 anonymousClass8 = ((LoginActivity.LoginActivityEmailCodeView) this.f$0).codeFieldContainer;
                    CodeNumberField[] codeNumberFieldArr = anonymousClass8.codeField;
                    if (i10 >= codeNumberFieldArr.length) {
                        ((Runnable) this.f$1).run();
                        anonymousClass8.isFocusSuppressed = false;
                    } else {
                        codeNumberFieldArr[i10].animateSuccessProgress(0.0f);
                        i10++;
                    }
                    break;
                }
                break;
            case 7:
                LoginActivity.LoginActivityPasswordView loginActivityPasswordView = (LoginActivity.LoginActivityPasswordView) this.f$0;
                LoginActivity loginActivity = LoginActivity.this;
                loginActivity.needHideProgress(false, false);
                AndroidUtilities.hideKeyboard(loginActivityPasswordView.codeField);
                loginActivity.onAuthSuccess((TLRPC.TL_auth_authorization) ((TLObject) this.f$1), false);
                break;
            case 8:
                LoginActivity.LoginActivityPasswordView loginActivityPasswordView2 = (LoginActivity.LoginActivityPasswordView) this.f$0;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = loginActivityPasswordView2.currentPassword.current_algo;
                boolean z = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] x = z ? SRPHelper.getX(AndroidUtilities.getStringBytes((String) this.f$1), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda5 loginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda5 = new LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda5(loginActivityPasswordView2, i9);
                if (z) {
                    TL_account.Password password = loginActivityPasswordView2.currentPassword;
                    TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRPStartCheck = SRPHelper.startCheck(x, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (tL_inputCheckPasswordSRPStartCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        loginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda5.run(null, tL_error);
                    } else {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = tL_inputCheckPasswordSRPStartCheck;
                        ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_checkPassword, loginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda5, 10);
                    }
                }
                break;
            case 9:
                LoginActivity.LoginActivityRegisterView loginActivityRegisterView = (LoginActivity.LoginActivityRegisterView) this.f$0;
                TLObject tLObject2 = (TLObject) this.f$1;
                LoginActivity.this.needHideProgress(false, false);
                AndroidUtilities.hideKeyboard(LoginActivity.this.fragmentView.findFocus());
                LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject2, true);
                TLRPC.FileLocation fileLocation = loginActivityRegisterView.avatarBig;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new LinkManager$$ExternalSyntheticLambda2(i7, loginActivityRegisterView, fileLocation));
                }
                break;
            case 10:
                MessagesController.getInstance(((BaseFragment) LoginActivity.this).currentAccount).uploadAndApplyUserAvatar((TLRPC.FileLocation) this.f$1);
                break;
            case 11:
                LoginActivity.LoginActivityResetWaitView loginActivityResetWaitView = (LoginActivity.LoginActivityResetWaitView) this.f$0;
                LoginActivity loginActivity2 = LoginActivity.this;
                loginActivity2.needHideProgress(false, true);
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f$1;
                if (tL_error2 == null) {
                    if (loginActivityResetWaitView.requestPhone == null || loginActivityResetWaitView.phoneHash == null || loginActivityResetWaitView.phoneCode == null) {
                        loginActivity2.setPage(0, true, null, true);
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putString("phoneFormated", loginActivityResetWaitView.requestPhone);
                        bundle.putString("phoneHash", loginActivityResetWaitView.phoneHash);
                        bundle.putString("code", loginActivityResetWaitView.phoneCode);
                        loginActivity2.setPage(5, true, bundle, false);
                    }
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                } else {
                    loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                }
                break;
            case 12:
                LoginActivity.LoginActivitySmsView loginActivitySmsView = (LoginActivity.LoginActivitySmsView) this.f$0;
                loginActivitySmsView.getClass();
                AlertDialog.Builder builder = new AlertDialog.Builder((Activity) this.f$1, 0, null);
                String string = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                alertDialog.message = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, UserObject$$ExternalSyntheticOutline0.m(new StringBuilder("+"), loginActivitySmsView.phone, PhoneFormat.getInstance()));
                builder.setPositiveButton(LocaleController.getString(R.string.Close), null);
                alertDialog.setOnDismissListener(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda45(loginActivitySmsView, 0));
                builder.show();
                break;
            case 13:
                LoginActivity.LoginActivitySmsView loginActivitySmsView2 = (LoginActivity.LoginActivitySmsView) this.f$0;
                loginActivitySmsView2.getClass();
                loginActivitySmsView2.lastError = ((TLRPC.TL_error) this.f$1).text;
                break;
            case 14:
                LoginActivity.LoginActivitySmsView loginActivitySmsView3 = (LoginActivity.LoginActivitySmsView) this.f$0;
                loginActivitySmsView3.getClass();
                LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) ((TLObject) this.f$1), false);
                break;
            case 15:
                int i11 = 0;
                while (true) {
                    CodeFieldContainer codeFieldContainer = ((LoginActivity.LoginActivitySmsView) this.f$0).codeFieldContainer;
                    CodeNumberField[] codeNumberFieldArr2 = codeFieldContainer.codeField;
                    if (i11 >= codeNumberFieldArr2.length) {
                        ((Runnable) this.f$1).run();
                        codeFieldContainer.isFocusSuppressed = false;
                    } else {
                        codeNumberFieldArr2[i11].animateSuccessProgress(0.0f);
                        i11++;
                    }
                    break;
                }
                break;
            case 16:
                ((PollItemMenu$$ExternalSyntheticLambda14) this.f$0).run((String) this.f$1);
                break;
            case 17:
                LoginActivity.PhoneView phoneView = (LoginActivity.PhoneView) this.f$0;
                phoneView.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                boolean z2 = globalMainSettings.getBoolean("firstloginshow", true);
                LoginActivity loginActivity3 = LoginActivity.this;
                if (z2 || loginActivity3.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(loginActivity3.getParentActivity(), 0, null);
                    builder2.setTopAnimation(R.raw.incoming_calls, 46, Theme.getColor(null, Theme.key_dialogTopBackground, false), null);
                    builder2.setPositiveButton(LocaleController.getString("Continue", R.string.Continue), null);
                    String string2 = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
                    AlertDialog alertDialog2 = builder2.alertDialog;
                    alertDialog2.message = string2;
                    loginActivity3.permissionsShowDialog = loginActivity3.showDialog(alertDialog2, true, null);
                    loginActivity3.needRequestPermissions = true;
                } else {
                    loginActivity3.getParentActivity().requestPermissions((String[]) ((ArrayList) this.f$1).toArray(new String[0]), 7);
                }
                break;
            case 18:
                ManageLinksActivity manageLinksActivity = (ManageLinksActivity) this.f$0;
                manageLinksActivity.deletingRevokedLinks = false;
                if (((TLRPC.TL_error) this.f$1) == null) {
                    ManageLinksActivity.DiffCallback diffCallbackSaveListState = manageLinksActivity.saveListState();
                    manageLinksActivity.revokedInvites.clear();
                    manageLinksActivity.updateRecyclerViewAnimated(diffCallbackSaveListState);
                }
                break;
            case 19:
                ManageLinksActivity manageLinksActivity2 = ManageLinksActivity.this;
                ManageLinksActivity.DiffCallback diffCallbackSaveListState2 = manageLinksActivity2.saveListState();
                manageLinksActivity2.invites.add(0, (TLRPC.TL_chatInviteExported) ((TLObject) this.f$1));
                TLRPC.ChatFull chatFull = manageLinksActivity2.info;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    manageLinksActivity2.getMessagesStorage().saveChatLinksCount(manageLinksActivity2.currentChatId, manageLinksActivity2.info.invitesCount);
                }
                manageLinksActivity2.updateRecyclerViewAnimated(diffCallbackSaveListState2);
                break;
            case 20:
                MessageStatisticActivity messageStatisticActivity = (MessageStatisticActivity) this.f$0;
                if (messageStatisticActivity.getParentActivity() != null) {
                    Toast.makeText(messageStatisticActivity.getParentActivity(), ((TL_stats.TL_statsGraphError) this.f$1).error, 1).show();
                }
                break;
            case 21:
                NewContactBottomSheet newContactBottomSheet = (NewContactBottomSheet) this.f$0;
                newContactBottomSheet.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + ((String) this.f$1)));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                newContactBottomSheet.getContext().startActivity(intent);
                break;
            case 22:
                ((NewContactBottomSheet) this.f$0).lambda$showGiftOfferSheet$15();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    safeLastFragment.presentFragment(ProfileActivity.of(((TLRPC.User) this.f$1).id));
                }
                break;
            case 23:
                ((OAuthSheet$$ExternalSyntheticLambda13) this.f$0).run((TLRPC.User) this.f$1);
                break;
            case 24:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f$0;
                notificationsCustomSettingsActivity.getClass();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                LongSparseArray longSparseArray = new LongSparseArray();
                ArrayList<Long> arrayList12 = new ArrayList<>();
                ArrayList arrayList13 = new ArrayList();
                ArrayList arrayList14 = new ArrayList();
                ArrayList<TLRPC.User> arrayList15 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList16 = new ArrayList<>();
                ArrayList<TLRPC.EncryptedChat> arrayList17 = new ArrayList<>();
                long j = notificationsCustomSettingsActivity.getUserConfig().clientUserId;
                SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
                Map<String, ?> all = notificationsSettings.getAll();
                Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, ?> next = it.next();
                    it = it;
                    String key = next.getKey();
                    notificationsCustomSettingsActivity = notificationsCustomSettingsActivity;
                    if (key.startsWith("notify2_")) {
                        ArrayList<TLRPC.Chat> arrayList18 = arrayList16;
                        String strReplace = key.replace("notify2_", "");
                        Long l = Utilities.parseLong(strReplace);
                        ArrayList arrayList19 = arrayList9;
                        ArrayList arrayList20 = arrayList10;
                        long jLongValue = l.longValue();
                        if (jLongValue == 0 || jLongValue == j) {
                            arrayList9 = arrayList19;
                            arrayList16 = arrayList18;
                            arrayList10 = arrayList20;
                        } else {
                            NotificationsSettingsActivity.NotificationException notificationException2 = new NotificationsSettingsActivity.NotificationException();
                            notificationException2.did = jLongValue;
                            ArrayList<TLRPC.User> arrayList21 = arrayList15;
                            notificationException2.hasCustom = NotificationsController$$ExternalSyntheticOutline0.m("custom_", jLongValue, notificationsSettings, false);
                            int iIntValue = ((Integer) next.getValue()).intValue();
                            notificationException2.notify = iIntValue;
                            if (iIntValue != 0) {
                                Integer num = (Integer) all.get("notifyuntil_" + strReplace);
                                if (num != null) {
                                    notificationException2.muteUntil = num.intValue();
                                }
                            }
                            if (DialogObject.isEncryptedDialog(jLongValue)) {
                                int encryptedChatId = DialogObject.getEncryptedChatId(jLongValue);
                                TLRPC.EncryptedChat encryptedChat = notificationsCustomSettingsActivity.getMessagesController().getEncryptedChat(Integer.valueOf(encryptedChatId));
                                if (encryptedChat == null) {
                                    arrayList14.add(Integer.valueOf(encryptedChatId));
                                    longSparseArray.put(jLongValue, notificationException2);
                                } else {
                                    TLRPC.User user2 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                                    if (user2 == null) {
                                        arrayList12.add(Long.valueOf(encryptedChat.user_id));
                                        longSparseArray.put(encryptedChat.user_id, notificationException2);
                                    } else if (!user2.deleted) {
                                    }
                                }
                                arrayList7.add(notificationException2);
                            } else {
                                if (DialogObject.isUserDialog(jLongValue)) {
                                    TLRPC.User user3 = notificationsCustomSettingsActivity.getMessagesController().getUser(l);
                                    if (user3 == null) {
                                        arrayList12.add(l);
                                        longSparseArray.put(jLongValue, notificationException2);
                                    } else if (!user3.deleted) {
                                    }
                                    arrayList7.add(notificationException2);
                                } else {
                                    SharedPreferences sharedPreferences = notificationsSettings;
                                    long j2 = -jLongValue;
                                    TLRPC.Chat chat2 = notificationsCustomSettingsActivity.getMessagesController().getChat(Long.valueOf(j2));
                                    if (chat2 == null) {
                                        arrayList13.add(Long.valueOf(j2));
                                        longSparseArray.put(jLongValue, notificationException2);
                                    } else if (!chat2.left && !chat2.kicked && chat2.migrated_to == null) {
                                        if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                                            arrayList8.add(notificationException2);
                                        } else {
                                            arrayList11.add(notificationException2);
                                        }
                                    }
                                    notificationsSettings = sharedPreferences;
                                }
                                arrayList16 = arrayList18;
                                arrayList10 = arrayList20;
                                arrayList9 = arrayList19;
                                arrayList15 = arrayList21;
                            }
                            arrayList16 = arrayList18;
                            arrayList10 = arrayList20;
                            arrayList9 = arrayList19;
                            arrayList15 = arrayList21;
                        }
                    }
                }
                ArrayList<TLRPC.User> arrayList22 = arrayList15;
                ArrayList arrayList23 = arrayList9;
                ArrayList arrayList24 = arrayList10;
                ArrayList<TLRPC.Chat> arrayList25 = arrayList16;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity;
                HashSet hashSet = new HashSet();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key2 = entry.getKey();
                    if (key2.startsWith("stories_")) {
                        try {
                            Long l2 = Utilities.parseLong(key2.substring(8));
                            long jLongValue2 = l2.longValue();
                            if (jLongValue2 != 0 && jLongValue2 != j) {
                                NotificationsSettingsActivity.NotificationException notificationException3 = new NotificationsSettingsActivity.NotificationException();
                                notificationException3.did = jLongValue2;
                                notificationException3.story = true;
                                notificationException3.notify = ((Boolean) entry.getValue()).booleanValue() ? 0 : Integer.MAX_VALUE;
                                if (DialogObject.isUserDialog(jLongValue2)) {
                                    TLRPC.User user4 = notificationsCustomSettingsActivity2.getMessagesController().getUser(l2);
                                    if (user4 == null) {
                                        try {
                                            arrayList12.add(l2);
                                            longSparseArray.put(jLongValue2, notificationException3);
                                        } catch (Exception unused) {
                                            arrayList6 = arrayList23;
                                        }
                                        break;
                                    } else if (user4.deleted) {
                                    }
                                    arrayList6 = arrayList23;
                                    try {
                                        arrayList6.add(notificationException3);
                                        hashSet.add(l2);
                                        break;
                                    } catch (Exception unused2) {
                                    }
                                    arrayList23 = arrayList6;
                                }
                            }
                        } catch (Exception unused3) {
                            arrayList6 = arrayList23;
                        }
                    }
                }
                ArrayList arrayList26 = arrayList23;
                ArrayList arrayList27 = (ArrayList) this.f$1;
                if (arrayList27 != null) {
                    Collections.sort(arrayList27, Comparator$CC.comparingDouble(new StarGiftPreviewSheet$$ExternalSyntheticLambda5(3)));
                    int iMax = Math.max(0, arrayList27.size() - 6);
                    while (iMax < arrayList27.size()) {
                        long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_topPeer) arrayList27.get(iMax)).peer);
                        if (hashSet.contains(Long.valueOf(peerDialogId))) {
                            arrayList4 = arrayList27;
                        } else {
                            NotificationsSettingsActivity.NotificationException notificationException4 = new NotificationsSettingsActivity.NotificationException();
                            notificationException4.did = peerDialogId;
                            notificationException4.story = true;
                            arrayList4 = arrayList27;
                            notificationException4.notify = 0;
                            notificationException4.auto = true;
                            if (DialogObject.isUserDialog(peerDialogId)) {
                                TLRPC.User user5 = notificationsCustomSettingsActivity2.getMessagesController().getUser(Long.valueOf(peerDialogId));
                                if (user5 == null) {
                                    arrayList12.add(Long.valueOf(peerDialogId));
                                    longSparseArray.put(peerDialogId, notificationException4);
                                } else if (user5.deleted) {
                                }
                                arrayList5 = arrayList24;
                                arrayList5.add(0, notificationException4);
                                hashSet.add(Long.valueOf(peerDialogId));
                            }
                            iMax++;
                            arrayList24 = arrayList5;
                            arrayList27 = arrayList4;
                        }
                        arrayList5 = arrayList24;
                        iMax++;
                        arrayList24 = arrayList5;
                        arrayList27 = arrayList4;
                    }
                }
                ArrayList arrayList28 = arrayList24;
                if (longSparseArray.size() != 0) {
                    try {
                        if (arrayList14.isEmpty()) {
                            arrayList = arrayList17;
                        } else {
                            arrayList = arrayList17;
                            try {
                                notificationsCustomSettingsActivity2.getMessagesStorage().getEncryptedChatsInternal(TextUtils.join(",", arrayList14), arrayList, arrayList12);
                            } catch (Exception e) {
                                e = e;
                                arrayList2 = arrayList25;
                                arrayList3 = arrayList22;
                                FileLog.e(e);
                                size = arrayList2.size();
                                for (i = 0; i < size; i++) {
                                    chat = arrayList2.get(i);
                                    if (!chat.left) {
                                        notificationException = (NotificationsSettingsActivity.NotificationException) longSparseArray.get(-chat.id);
                                        longSparseArray.remove(-chat.id);
                                        if (notificationException != null) {
                                            if (ChatObject.isChannel(chat)) {
                                                arrayList8.add(notificationException);
                                            } else {
                                                arrayList8.add(notificationException);
                                            }
                                        }
                                    }
                                }
                                size2 = arrayList3.size();
                                for (i2 = 0; i2 < size2; i2++) {
                                    user = arrayList3.get(i2);
                                    if (!user.deleted) {
                                        longSparseArray.remove(user.id);
                                    }
                                }
                                size3 = arrayList.size();
                                for (i3 = 0; i3 < size3; i3++) {
                                    longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList.get(i3).id));
                                }
                                size4 = longSparseArray.size();
                                for (i4 = 0; i4 < size4; i4++) {
                                    if (DialogObject.isChatDialog(longSparseArray.keyAt(i4))) {
                                        arrayList8.remove(longSparseArray.valueAt(i4));
                                        arrayList11.remove(longSparseArray.valueAt(i4));
                                    } else {
                                        arrayList7.remove(longSparseArray.valueAt(i4));
                                    }
                                }
                                AndroidUtilities.runOnUIThread(new TranslateButton$$ExternalSyntheticLambda3(notificationsCustomSettingsActivity2, arrayList3, arrayList2, arrayList, arrayList7, arrayList8, arrayList26, arrayList28, arrayList11));
                                return;
                            }
                        }
                        if (arrayList12.isEmpty()) {
                            arrayList3 = arrayList22;
                        } else {
                            try {
                                arrayList3 = arrayList22;
                                try {
                                    notificationsCustomSettingsActivity2.getMessagesStorage().getUsersInternal(arrayList12, arrayList3);
                                } catch (Exception e2) {
                                    e = e2;
                                    arrayList2 = arrayList25;
                                    FileLog.e(e);
                                    size = arrayList2.size();
                                    while (i < size) {
                                        chat = arrayList2.get(i);
                                        if (!chat.left) {
                                            notificationException = (NotificationsSettingsActivity.NotificationException) longSparseArray.get(-chat.id);
                                            longSparseArray.remove(-chat.id);
                                            if (notificationException != null) {
                                                if (ChatObject.isChannel(chat)) {
                                                    arrayList8.add(notificationException);
                                                } else {
                                                    arrayList8.add(notificationException);
                                                }
                                            }
                                        }
                                    }
                                    size2 = arrayList3.size();
                                    while (i2 < size2) {
                                        user = arrayList3.get(i2);
                                        if (!user.deleted) {
                                            longSparseArray.remove(user.id);
                                        }
                                    }
                                    size3 = arrayList.size();
                                    while (i3 < size3) {
                                        longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList.get(i3).id));
                                    }
                                    size4 = longSparseArray.size();
                                    while (i4 < size4) {
                                        if (DialogObject.isChatDialog(longSparseArray.keyAt(i4))) {
                                            arrayList8.remove(longSparseArray.valueAt(i4));
                                            arrayList11.remove(longSparseArray.valueAt(i4));
                                        } else {
                                            arrayList7.remove(longSparseArray.valueAt(i4));
                                        }
                                    }
                                    AndroidUtilities.runOnUIThread(new TranslateButton$$ExternalSyntheticLambda3(notificationsCustomSettingsActivity2, arrayList3, arrayList2, arrayList, arrayList7, arrayList8, arrayList26, arrayList28, arrayList11));
                                    return;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                arrayList3 = arrayList22;
                                arrayList2 = arrayList25;
                                FileLog.e(e);
                                size = arrayList2.size();
                                while (i < size) {
                                    chat = arrayList2.get(i);
                                    if (!chat.left) {
                                        notificationException = (NotificationsSettingsActivity.NotificationException) longSparseArray.get(-chat.id);
                                        longSparseArray.remove(-chat.id);
                                        if (notificationException != null) {
                                            if (ChatObject.isChannel(chat)) {
                                                arrayList8.add(notificationException);
                                            } else {
                                                arrayList8.add(notificationException);
                                            }
                                        }
                                    }
                                }
                                size2 = arrayList3.size();
                                while (i2 < size2) {
                                    user = arrayList3.get(i2);
                                    if (!user.deleted) {
                                        longSparseArray.remove(user.id);
                                    }
                                }
                                size3 = arrayList.size();
                                while (i3 < size3) {
                                    longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList.get(i3).id));
                                }
                                size4 = longSparseArray.size();
                                while (i4 < size4) {
                                    if (DialogObject.isChatDialog(longSparseArray.keyAt(i4))) {
                                        arrayList8.remove(longSparseArray.valueAt(i4));
                                        arrayList11.remove(longSparseArray.valueAt(i4));
                                    } else {
                                        arrayList7.remove(longSparseArray.valueAt(i4));
                                    }
                                }
                                AndroidUtilities.runOnUIThread(new TranslateButton$$ExternalSyntheticLambda3(notificationsCustomSettingsActivity2, arrayList3, arrayList2, arrayList, arrayList7, arrayList8, arrayList26, arrayList28, arrayList11));
                                return;
                            }
                        }
                        if (arrayList13.isEmpty()) {
                            arrayList2 = arrayList25;
                        } else {
                            arrayList2 = arrayList25;
                            try {
                                notificationsCustomSettingsActivity2.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList13), arrayList2);
                            } catch (Exception e4) {
                                e = e4;
                                FileLog.e(e);
                            }
                        }
                    } catch (Exception e5) {
                        e = e5;
                        arrayList = arrayList17;
                    }
                    size = arrayList2.size();
                    while (i < size) {
                        chat = arrayList2.get(i);
                        if (!chat.left && !chat.kicked && chat.migrated_to == null) {
                            notificationException = (NotificationsSettingsActivity.NotificationException) longSparseArray.get(-chat.id);
                            longSparseArray.remove(-chat.id);
                            if (notificationException != null) {
                                if (ChatObject.isChannel(chat) || chat.megagroup) {
                                    arrayList8.add(notificationException);
                                } else {
                                    arrayList11.add(notificationException);
                                }
                            }
                        }
                    }
                    size2 = arrayList3.size();
                    while (i2 < size2) {
                        user = arrayList3.get(i2);
                        if (!user.deleted) {
                            longSparseArray.remove(user.id);
                        }
                    }
                    size3 = arrayList.size();
                    while (i3 < size3) {
                        longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList.get(i3).id));
                    }
                    size4 = longSparseArray.size();
                    while (i4 < size4) {
                        if (DialogObject.isChatDialog(longSparseArray.keyAt(i4))) {
                            arrayList8.remove(longSparseArray.valueAt(i4));
                            arrayList11.remove(longSparseArray.valueAt(i4));
                        } else {
                            arrayList7.remove(longSparseArray.valueAt(i4));
                        }
                    }
                } else {
                    arrayList = arrayList17;
                    arrayList2 = arrayList25;
                    arrayList3 = arrayList22;
                }
                AndroidUtilities.runOnUIThread(new TranslateButton$$ExternalSyntheticLambda3(notificationsCustomSettingsActivity2, arrayList3, arrayList2, arrayList, arrayList7, arrayList8, arrayList26, arrayList28, arrayList11));
                break;
            case 25:
                for (CodeNumberField codeNumberField : ((PasscodeActivity) this.f$0).codeFieldContainer.codeField) {
                    codeNumberField.animateSuccessProgress(0.0f);
                }
                ((Runnable) this.f$1).run();
                break;
            case 26:
                PasscodeActivity passcodeActivity = PasscodeActivity.this;
                String string3 = LocaleController.getString(passcodeActivity.currentPasswordType == 0 ? R.string.PasscodeSwitchToPassword : R.string.PasscodeSwitchToPIN);
                ActionBarMenuSubItem actionBarMenuSubItem = (ActionBarMenuSubItem) this.f$1;
                actionBarMenuSubItem.setText(string3);
                actionBarMenuSubItem.setIcon(passcodeActivity.currentPasswordType == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity.showKeyboard$1();
                if (passcodeActivity.isPinCode()) {
                    passcodeActivity.passwordEditText.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.passwordButton, true, 0.1f, false);
                }
                break;
            case 27:
                ((PasskeysActivity) this.f$0).added((TL_account.Passkey) this.f$1);
                break;
            case 28:
                PassportActivity passportActivity = (PassportActivity) this.f$0;
                passportActivity.getClass();
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.f$1;
                int i12 = result.type;
                if (i12 == 2) {
                    if (!(passportActivity.currentDocumentsType.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size5 = passportActivity.availableDocumentTypes.size();
                        for (int i13 = 0; i13 < size5; i13++) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) passportActivity.availableDocumentTypes.get(i13);
                            if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                passportActivity.currentDocumentsType = tL_secureRequiredType;
                                passportActivity.updateInterfaceStringsForDocumentType();
                            }
                        }
                    }
                } else if (i12 == 1) {
                    if (!(passportActivity.currentDocumentsType.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size6 = passportActivity.availableDocumentTypes.size();
                        for (int i14 = 0; i14 < size6; i14++) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) passportActivity.availableDocumentTypes.get(i14);
                            if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                passportActivity.currentDocumentsType = tL_secureRequiredType2;
                                passportActivity.updateInterfaceStringsForDocumentType();
                            }
                        }
                    }
                } else if (i12 == 3) {
                    if (!(passportActivity.currentDocumentsType.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size7 = passportActivity.availableDocumentTypes.size();
                        for (int i15 = 0; i15 < size7; i15++) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) passportActivity.availableDocumentTypes.get(i15);
                            if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                passportActivity.currentDocumentsType = tL_secureRequiredType3;
                                passportActivity.updateInterfaceStringsForDocumentType();
                            }
                        }
                    }
                } else if (i12 == 4 && !(passportActivity.currentDocumentsType.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size8 = passportActivity.availableDocumentTypes.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) passportActivity.availableDocumentTypes.get(i16);
                        if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                            passportActivity.currentDocumentsType = tL_secureRequiredType4;
                            passportActivity.updateInterfaceStringsForDocumentType();
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    passportActivity.inputFields[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    passportActivity.inputFields[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    passportActivity.inputFields[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    passportActivity.inputFields[7].setText(result.number);
                }
                int i17 = result.gender;
                if (i17 != 0) {
                    if (i17 == 1) {
                        passportActivity.currentGender = "male";
                        passportActivity.inputFields[4].setText(LocaleController.getString(R.string.PassportMale));
                    } else if (i17 == 2) {
                        passportActivity.currentGender = "female";
                        passportActivity.inputFields[4].setText(LocaleController.getString(R.string.PassportFemale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str = result.nationality;
                    passportActivity.currentCitizeship = str;
                    String str2 = (String) passportActivity.languageMap.get(str);
                    if (str2 != null) {
                        passportActivity.inputFields[5].setText(str2);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str3 = result.issuingCountry;
                    passportActivity.currentResidence = str3;
                    String str4 = (String) passportActivity.languageMap.get(str3);
                    if (str4 != null) {
                        passportActivity.inputFields[6].setText(str4);
                    }
                }
                int i18 = result.birthDay;
                if (i18 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    passportActivity.inputFields[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i18), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i19 = result.expiryDay;
                int[] iArr = passportActivity.currentExpireDate;
                if (i19 <= 0 || (i5 = result.expiryMonth) <= 0 || (i6 = result.expiryYear) <= 0) {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    passportActivity.inputFields[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                } else {
                    iArr[0] = i6;
                    iArr[1] = i5;
                    iArr[2] = i19;
                    passportActivity.inputFields[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i19), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                }
                break;
            default:
                PassportActivity passportActivity2 = (PassportActivity) this.f$0;
                passportActivity2.getClass();
                TLObject tLObject3 = (TLObject) this.f$1;
                if (tLObject3 != null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    passportActivity2.currentPassword = password2;
                    if (TwoStepVerificationActivity.canHandleCurrentPassword(password2, false)) {
                        TwoStepVerificationActivity.initPasswordNewAlgo(passportActivity2.currentPassword);
                        passportActivity2.updatePasswordInterface();
                        if (passportActivity2.inputFieldContainers[0].getVisibility() == 0) {
                            passportActivity2.inputFields[0].requestFocus();
                            AndroidUtilities.showKeyboard(passportActivity2.inputFields[0]);
                        }
                        if (passportActivity2.usingSavedPassword == 1) {
                            passportActivity2.onPasswordDone(true);
                        }
                    } else {
                        AlertsCreator.showUpdateAppAlert(passportActivity2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    }
                }
                break;
        }
    }
}
