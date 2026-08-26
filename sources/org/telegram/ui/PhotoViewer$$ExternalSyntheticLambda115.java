package org.telegram.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.regex.Pattern;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ringtone.RingtoneDataStore;
import org.telegram.messenger.ringtone.RingtoneUploader;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.ManageChatUserCell;
import org.telegram.ui.Cells.PhotoPickerAlbumsCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.BatteryDrawable;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.FilterGLThread;
import org.telegram.ui.Components.FilterShaders;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.VideoEditTextureView;

public final class PhotoViewer$$ExternalSyntheticLambda115 implements AlertDialog.OnButtonClickListener, OnApplyWindowInsetsListener, RecyclerListView.OnItemClickListenerExtended, CountrySelectActivity.CountrySelectActivityDelegate, FactorAnimator.Target, RecyclerListView.OnItemLongClickListener, MultiLayoutTypingAnimator.Renderer, SearchAdapterHelper.SearchAdapterHelperDelegate, Utilities.Callback5, PhotoPickerAlbumsCell.PhotoPickerAlbumsCellDelegate, VideoEditTextureView.VideoEditTextureViewDelegate, ActionBarPopupWindow.onSizeChangedListener, Utilities.Callback2Return, ManageChatUserCell.ManageChatUserCellDelegate, LanguageDetector.ExceptionCallback, RequestTimeDelegate {
    public final int $r8$classId;
    public final Object f$0;

    public PhotoViewer$$ExternalSyntheticLambda115(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    private final void onDoubleTap$org$telegram$ui$LiteModeSettingsActivity$$ExternalSyntheticLambda1(View view, float f, float f2) {
    }

    private final void onDoubleTap$org$telegram$ui$LogoutActivity$$ExternalSyntheticLambda0(View view, float f, float f2) {
    }

    @Override
    public boolean canApplySearchResults(int i) {
        return true;
    }

    @Override
    public void didSelectCountry(CountrySelectActivity.Country country) {
        LoginActivity.PhoneView phoneView = (LoginActivity.PhoneView) this.f$0;
        phoneView.ignoreOnTextChange = true;
        String str = country.code;
        phoneView.codeField.setText(str);
        phoneView.setCountryHint(str, country);
        phoneView.currentCountry = country;
        phoneView.countryState = 0;
        phoneView.ignoreOnTextChange = false;
        MessagesController.getGlobalMainSettings().edit().putString("phone_code_last_matched_" + country.code, country.shortname).apply();
        AndroidUtilities.runOnUIThread(new LoginActivity$PhoneView$$ExternalSyntheticLambda6(phoneView, 3), 300L);
        LoginActivity.PhoneView.AnonymousClass3 anonymousClass3 = phoneView.phoneField;
        anonymousClass3.requestFocus();
        anonymousClass3.setSelection(anonymousClass3.length());
    }

    @Override
    public void draw(Canvas canvas) {
        ((Layout) this.f$0).draw(canvas);
    }

    @Override
    public LongSparseArray getExcludeCallParticipants() {
        return null;
    }

    @Override
    public void getExcludeUsers() {
    }

    @Override
    public boolean hasDoubleTap(View view) {
        switch (this.$r8$classId) {
        }
        return false;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        switch (this.$r8$classId) {
            case 2:
                ((LaunchActivity.AnonymousClass10) this.f$0).lambda$new$0(windowInsetsCompat);
                return windowInsetsCompat;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f$0;
                Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
                premiumPreviewFragment.insets = defaultWindowInsets;
                premiumPreviewFragment.listView.setPadding(0, defaultWindowInsets.top, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.insets.bottom);
                RecyclerListView recyclerListView = premiumPreviewFragment.listView;
                Insets insets = premiumPreviewFragment.insets;
                AndroidUtilities.setViewLayoutMargins(recyclerListView, insets.left, 0, insets.right, 0);
                PremiumPreviewFragment.BackgroundView backgroundView = premiumPreviewFragment.backgroundView;
                Insets insets2 = premiumPreviewFragment.insets;
                backgroundView.setPadding(insets2.left, 0, insets2.right, 0);
                FrameLayout frameLayout = premiumPreviewFragment.buttonContainer;
                if (frameLayout != null) {
                    int i = premiumPreviewFragment.insets.left;
                    int iDp = AndroidUtilities.dp(14.0f);
                    Insets insets3 = premiumPreviewFragment.insets;
                    frameLayout.setPadding(i, iDp, insets3.right, insets3.bottom);
                }
                return WindowInsetsCompat.CONSUMED;
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) throws Throwable {
        NotificationsSoundActivity.Tone tone;
        int i2;
        RingtoneUploader ringtoneUploader;
        int i3 = 1;
        switch (this.$r8$classId) {
            case 1:
                Pattern pattern = LaunchActivity.PREFIX_T_ME_PATTERN;
                AndroidUtilities.addToClipboard((StringBuilder) this.f$0);
                break;
            case 4:
                LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView = (LoginActivity.LoginActivityEmailCodeView) this.f$0;
                loginActivityEmailCodeView.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("phone", loginActivityEmailCodeView.phone);
                bundle.putString("ephone", loginActivityEmailCodeView.emailPhone);
                bundle.putString("phoneFormated", loginActivityEmailCodeView.requestPhone);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = loginActivityEmailCodeView.requestPhone;
                tL_auth_resetLoginEmail.phone_code_hash = loginActivityEmailCodeView.phoneHash;
                LoginActivity.this.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda10(loginActivityEmailCodeView, bundle, tL_auth_resetLoginEmail, i3), 10);
                break;
            case 5:
                LoginActivity.LoginActivityPasswordView loginActivityPasswordView = (LoginActivity.LoginActivityPasswordView) this.f$0;
                LoginActivity.this.tryResetAccount(loginActivityPasswordView.requestPhone, loginActivityPasswordView.phoneHash, loginActivityPasswordView.phoneCode);
                break;
            case 6:
                LoginActivity.LoginActivityResetWaitView loginActivityResetWaitView = (LoginActivity.LoginActivityResetWaitView) this.f$0;
                LoginActivity loginActivity = LoginActivity.this;
                loginActivity.needShowProgress(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(deleteaccount, new LinkManager$$ExternalSyntheticLambda3(loginActivityResetWaitView, 14), 10);
                break;
            case 13:
                ((ChatActivity$$ExternalSyntheticLambda241) this.f$0).run();
                break;
            case 15:
                NotificationsSoundActivity.AnonymousClass1 anonymousClass1 = (NotificationsSoundActivity.AnonymousClass1) this.f$0;
                ArrayList arrayList = new ArrayList();
                int i4 = 0;
                while (true) {
                    NotificationsSoundActivity notificationsSoundActivity = NotificationsSoundActivity.this;
                    SparseArray sparseArray = notificationsSoundActivity.selectedTones;
                    if (i4 >= sparseArray.size()) {
                        notificationsSoundActivity.getMediaDataController().ringtoneDataStore.saveTones();
                        for (int i5 = 0; i5 < arrayList.size(); i5++) {
                            TLRPC.Document document = (TLRPC.Document) arrayList.get(i5);
                            TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            saveringtone.id = tL_inputDocument;
                            tL_inputDocument.id = document.id;
                            tL_inputDocument.access_hash = document.access_hash;
                            byte[] bArr = document.file_reference;
                            tL_inputDocument.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputDocument.file_reference = new byte[0];
                            }
                            saveringtone.unsave = true;
                            notificationsSoundActivity.getConnectionsManager().sendRequest(saveringtone, new PassportActivity$$ExternalSyntheticLambda1(i3));
                        }
                        NotificationsSoundActivity.access$200(notificationsSoundActivity);
                        notificationsSoundActivity.updateRows$10();
                        notificationsSoundActivity.adapter.mObservable.notifyChanged();
                        alertDialog.dismiss();
                    } else {
                        NotificationsSoundActivity.Tone tone2 = (NotificationsSoundActivity.Tone) sparseArray.valueAt(i4);
                        TLRPC.Document document2 = tone2.document;
                        if (document2 != null) {
                            arrayList.add(document2);
                            RingtoneDataStore ringtoneDataStore = notificationsSoundActivity.getMediaDataController().ringtoneDataStore;
                            TLRPC.Document document3 = tone2.document;
                            if (document3 == null) {
                                ringtoneDataStore.getClass();
                            } else {
                                if (!ringtoneDataStore.loaded) {
                                    ringtoneDataStore.loadFromPrefs(true);
                                    ringtoneDataStore.loaded = true;
                                }
                                int i6 = 0;
                                while (true) {
                                    ArrayList arrayList2 = ringtoneDataStore.userRingtones;
                                    if (i6 < arrayList2.size()) {
                                        if (((RingtoneDataStore.CachedTone) arrayList2.get(i6)).document == null || ((RingtoneDataStore.CachedTone) arrayList2.get(i6)).document.id != document3.id) {
                                            i6++;
                                        } else {
                                            arrayList2.remove(i6);
                                        }
                                    }
                                }
                            }
                        }
                        if (tone2.uri == null || (ringtoneUploader = notificationsSoundActivity.getMediaDataController().ringtoneUploaderHashMap.get(tone2.uri)) == null) {
                            tone = null;
                            i2 = 0;
                        } else {
                            ringtoneUploader.canceled = true;
                            int i7 = ringtoneUploader.currentAccount;
                            NotificationCenter.getInstance(i7).removeObserver(ringtoneUploader, NotificationCenter.fileUploaded);
                            NotificationCenter.getInstance(i7).removeObserver(ringtoneUploader, NotificationCenter.fileUploadFailed);
                            FileLoader fileLoader = FileLoader.getInstance(i7);
                            String str = ringtoneUploader.filePath;
                            i2 = 0;
                            fileLoader.cancelFileUpload(str, false);
                            tone = null;
                            MediaDataController.getInstance(i7).onRingtoneUploaded(str, null, true);
                        }
                        if (tone2 == notificationsSoundActivity.selectedTone) {
                            notificationsSoundActivity.startSelectedTone = tone;
                            notificationsSoundActivity.selectedTone = (NotificationsSoundActivity.Tone) notificationsSoundActivity.systemTones.get(i2);
                            notificationsSoundActivity.selectedToneChanged = true;
                        }
                        notificationsSoundActivity.serverTones.remove(tone2);
                        notificationsSoundActivity.uploadingTones.remove(tone2);
                        i4++;
                    }
                    break;
                }
                break;
            case 16:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f$0;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.listView.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = passcodeActivity.listView.getChildAt(i8);
                    if (childAt instanceof TextSettingsCell) {
                        ((TextSettingsCell) childAt).setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText7, false));
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                        passcodeActivity.finishFragment();
                    }
                    break;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                passcodeActivity.finishFragment();
                break;
            case 19:
                PhotoViewer photoViewer = PhotoViewer.this;
                try {
                    AndroidUtilities.openForView(photoViewer.currentMessageObject, photoViewer.parentActivity, photoViewer.resourcesProvider, true);
                    photoViewer.closePhoto(false, false);
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 20:
                ((PollCreateActivity) this.f$0).lambda$checkDiscard$2(alertDialog, i);
                break;
            case 21:
                PollCreateActivity.this.emojiView.clearRecentEmoji();
                break;
            case 23:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f$0;
                popupNotificationActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                } catch (Exception e2) {
                    FileLog.e(e2);
                    return;
                }
                break;
            default:
                ((ProfileActivity$$ExternalSyntheticLambda114) this.f$0).run(1);
                break;
        }
    }

    @Override
    public void onDataSetChanged(int i) {
        NotificationsCustomSettingsActivity.SearchAdapter searchAdapter = (NotificationsCustomSettingsActivity.SearchAdapter) this.f$0;
        if (searchAdapter.searchRunnable == null && !searchAdapter.searchAdapterHelper.isSearchInProgress()) {
            NotificationsCustomSettingsActivity.this.emptyView.showTextView();
        }
        searchAdapter.notifyDataSetChanged();
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
        int i = this.$r8$classId;
    }

    @Override
    public void onEGLThreadAvailable(FilterGLThread filterGLThread) {
        filterGLThread.setFilterGLThreadDelegate(new FilterShaders.AnonymousClass1((MediaController.SavedFilterState) this.f$0));
    }

    @Override
    public void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        MainTabsLayout mainTabsLayout = (MainTabsLayout) this.f$0;
        mainTabsLayout.getClass();
        mainTabsLayout.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f));
        mainTabsLayout.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f));
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        switch (this.$r8$classId) {
            case 3:
                LiteModeSettingsActivity liteModeSettingsActivity = (LiteModeSettingsActivity) this.f$0;
                if (view != null && i >= 0) {
                    ArrayList arrayList = liteModeSettingsActivity.items;
                    if (i < arrayList.size()) {
                        LiteModeSettingsActivity.Item item = (LiteModeSettingsActivity.Item) arrayList.get(i);
                        int i2 = item.viewType;
                        if (i2 == 3 || i2 == 4) {
                            byte b = 0;
                            if (!LiteMode.isPowerSaverApplied()) {
                                int i3 = item.viewType;
                                int i4 = item.flags;
                                if (i3 == 3 && Integer.bitCount(i4) > 1 && (!LocaleController.isRTL ? f < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f > AndroidUtilities.dp(75.0f))) {
                                    if (i4 != 3) {
                                        b = i4 == 28700 ? (byte) 1 : i4 == liteModeSettingsActivity.FLAGS_CHAT ? (byte) 2 : (byte) -1;
                                    }
                                    if (b != -1) {
                                        boolean[] zArr = liteModeSettingsActivity.expanded;
                                        zArr[b] = !zArr[b];
                                        liteModeSettingsActivity.updateValues();
                                        liteModeSettingsActivity.updateItems$2();
                                    }
                                }
                                LiteMode.toggleFlag(i4, !LiteMode.isEnabledSetting(i4));
                                liteModeSettingsActivity.updateValues();
                            } else {
                                liteModeSettingsActivity.restrictBulletin = BulletinFactory.of(liteModeSettingsActivity).createSimpleBulletin(new BatteryDrawable(0.1f, Theme.getColor(null, Theme.key_dialogSwipeRemove, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).show();
                            }
                            break;
                        } else if (i2 == 5 && item.type == 1) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            boolean z = globalMainSettings.getBoolean("view_animations", true);
                            SharedPreferences.Editor editorEdit = globalMainSettings.edit();
                            boolean z2 = !z;
                            editorEdit.putBoolean("view_animations", z2);
                            SharedConfig.setAnimationsEnabled(z2);
                            editorEdit.commit();
                            ((TextCell) view).setChecked(z2);
                            break;
                        }
                    }
                }
                break;
            default:
                ((LogoutActivity) this.f$0).lambda$createView$0$1(i);
                break;
        }
    }

    @Override
    public boolean onOptionsButtonCheck(ManageChatUserCell manageChatUserCell, boolean z) {
        PrivacyUsersActivity.ListAdapter listAdapter = (PrivacyUsersActivity.ListAdapter) this.f$0;
        if (!z) {
            return true;
        }
        listAdapter.this$0.showUnblockAlert((Long) manageChatUserCell.getTag(), manageChatUserCell);
        return true;
    }

    @Override
    public void onSetHashtags(ArrayList arrayList) {
    }

    @Override
    public void onSizeChanged() {
        ((PollItemMenu) this.f$0).updateTranslation();
    }

    @Override
    public void mo1067run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        ((PasskeysActivity) this.f$0).onItemClick$7((UItem) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity.ListAdapter listAdapter = (PrivacyControlActivity.ListAdapter) this.f$0;
        listAdapter.getClass();
        if (((Integer) obj).intValue() != 0) {
            return LocaleController.formatNumber(num.intValue(), ',');
        }
        PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
        if (privacyControlActivity.getUserConfig().isPremium()) {
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        if (privacyControlActivity.lockSpan == null) {
            SpannableString spannableString = new SpannableString("l");
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_mini_lock3);
            coloredImageSpan.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
            spannableString.setSpan(coloredImageSpan, 0, 1, 33);
            privacyControlActivity.lockSpan = spannableString;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) privacyControlActivity.lockSpan);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
        return spannableStringBuilder;
    }

    @Override
    public void run(long j) {
        AndroidUtilities.runOnUIThread(new ProxyListActivity$$ExternalSyntheticLambda6((SharedConfig.ProxyInfo) this.f$0, j, 0));
    }

    @Override
    public void run(Exception exc) {
        FileLog.e("mlkit: failed to detect language in selection", exc);
        ((ArticleViewer$$ExternalSyntheticLambda70) this.f$0).run();
    }

    @Override
    public boolean onItemClick(int i, View view) {
        switch (this.$r8$classId) {
            case 10:
                final MessageStatisticActivity messageStatisticActivity = (MessageStatisticActivity) this.f$0;
                if (i >= messageStatisticActivity.startRow && i < messageStatisticActivity.endRow) {
                    try {
                        view.performHapticFeedback(0, 2);
                        break;
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) messageStatisticActivity.messages.get(i - messageStatisticActivity.startRow);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean zIsUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog.Builder builder = new AlertDialog.Builder(messageStatisticActivity.getParentActivity(), 0, messageStatisticActivity.getResourceProvider());
                    if (messageObject.isStory()) {
                        arrayList.add(LocaleController.getString(zIsUserDialog ? R.string.OpenProfile : R.string.OpenChannel2));
                        arrayList3.add(Integer.valueOf(zIsUserDialog ? R.drawable.msg_openprofile : R.drawable.msg_channel));
                    } else {
                        arrayList.add(LocaleController.getString(R.string.ViewMessage));
                        arrayList3.add(Integer.valueOf(R.drawable.msg_msgbubble3));
                    }
                    arrayList2.add(0);
                    CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    int[] intArray = AndroidUtilities.toIntArray(arrayList3);
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            BaseFragment baseFragment = messageStatisticActivity;
                            baseFragment.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean zIsStory = messageObject2.isStory();
                            boolean z = zIsUserDialog;
                            long j = dialogId;
                            if (zIsStory) {
                                baseFragment.presentFragment(z ? ProfileActivity.of(j) : ChatActivity.of(j));
                                return;
                            }
                            Bundle bundle = new Bundle();
                            if (z) {
                                bundle.putLong("user_id", j);
                            } else {
                                bundle.putLong("chat_id", -j);
                            }
                            bundle.putInt("message_id", messageObject2.getId());
                            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                            if (baseFragment.getMessagesController().checkCanOpenChat(bundle, baseFragment)) {
                                baseFragment.presentFragment(new ChatActivity(bundle));
                            }
                        }
                    };
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.items = charSequenceArr;
                    alertDialog.itemIcons = intArray;
                    alertDialog.onClickListener = onClickListener;
                    messageStatisticActivity.showDialog(alertDialog);
                }
                break;
            default:
                ((NotificationsSoundActivity) this.f$0).lambda$createView$2$1(view);
                break;
        }
        return false;
    }
}
