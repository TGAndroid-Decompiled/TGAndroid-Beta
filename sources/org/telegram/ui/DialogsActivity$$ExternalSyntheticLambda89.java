package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.clearcut.zze;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ContactsLoadingObserver;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.SharingLocationsAlert;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Gifts.AuctionBidSheet;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.LocationActivity.AnonymousClass8;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class DialogsActivity$$ExternalSyntheticLambda89 implements RecyclerListView.OnItemClickListenerExtended, AlertDialog.OnButtonClickListener, StarGiftSheet.BoughtGiftCallback, Utilities.Callback5, DialogsActivity.DialogsActivityDelegate, ContactsLoadingObserver.Callback, SharingLocationsAlert.SharingLocationsAlertDelegate, ImageReceiver.ImageReceiverDelegate, RecyclerListView.OnItemLongClickListener, OnCompleteListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public DialogsActivity$$ExternalSyntheticLambda89(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    private final void onDoubleTap$org$telegram$ui$DialogsActivity$$ExternalSyntheticLambda9(View view, float f, float f2) {
    }

    private final void onDoubleTap$org$telegram$ui$FiltersSetupActivity$$ExternalSyntheticLambda0(View view, float f, float f2) {
    }

    private final void onDoubleTap$org$telegram$ui$Gifts$ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda5(View view, float f, float f2) {
    }

    private final void onDoubleTap$org$telegram$ui$NotificationsCustomSettingsActivity$$ExternalSyntheticLambda0(View view, float f, float f2) {
    }

    @Override
    public boolean canSelectStories() {
        return false;
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        KeepMediaPopupView keepMediaPopupView = (KeepMediaPopupView) this.f$1;
        keepMediaPopupView.getClass();
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            ArrayList arrayList2 = keepMediaPopupView.exceptions;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i3)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i3++;
            keepMediaException = keepMediaException2;
        }
        keepMediaPopupView.cacheByChatsController.saveKeepMediaExceptions(keepMediaPopupView.currentType, keepMediaPopupView.exceptions);
        Bundle bundle = new Bundle();
        bundle.putInt("type", keepMediaPopupView.currentType);
        final DialogsActivity dialogsActivity2 = (DialogsActivity) this.f$0;
        CacheChatsExceptionsFragment cacheChatsExceptionsFragment = new CacheChatsExceptionsFragment(bundle) {
            public final DialogsActivity val$activity;

            public AnonymousClass1(Bundle bundle2) {
                super(bundle2);
                dialogsActivity = dialogsActivity2;
            }

            @Override
            public final void onTransitionAnimationEnd(boolean z3, boolean z4) {
                super.onTransitionAnimationEnd(z3, z4);
                if (!z3 || z4) {
                    return;
                }
                dialogsActivity.removeSelfFromStack();
            }
        };
        cacheChatsExceptionsFragment.exceptionsDialogs = keepMediaPopupView.exceptions;
        cacheChatsExceptionsFragment.updateRows$24();
        keepMediaPopupView.parentFragment.presentFragment(cacheChatsExceptionsFragment);
        AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda13(19, cacheChatsExceptionsFragment, keepMediaException), 150L);
        return true;
    }

    @Override
    public void didSelectLocation(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.f$0;
        launchActivity.getClass();
        int i = sharingLocationInfo.messageObject.currentAccount;
        int[] iArr = (int[]) this.f$1;
        iArr[0] = i;
        launchActivity.switchToAccount(i);
        LocationActivity locationActivity = new LocationActivity(2);
        MessageObject messageObject = sharingLocationInfo.messageObject;
        locationActivity.messageObject = messageObject;
        locationActivity.dialogId = messageObject.getDialogId();
        locationActivity.delegate = new LaunchActivity$$ExternalSyntheticLambda112(iArr, sharingLocationInfo.messageObject.getDialogId(), 0);
        launchActivity.presentFragment(locationActivity);
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        Bitmap bitmapCreateUserBitmap;
        LocationActivity locationActivity = (LocationActivity) this.f$0;
        locationActivity.getClass();
        if (!z || z2) {
            return;
        }
        LocationActivity.LiveLocation liveLocation = (LocationActivity.LiveLocation) this.f$1;
        if (liveLocation.marker == null || (bitmapCreateUserBitmap = locationActivity.createUserBitmap(liveLocation)) == null) {
            return;
        }
        liveLocation.marker.setIcon(bitmapCreateUserBitmap);
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public boolean hasDoubleTap(View view) {
        switch (this.$r8$classId) {
            case 1:
                break;
            case 3:
                break;
            case 9:
                break;
        }
        return false;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public void onBoughtGift(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, boolean z) {
        ProfileGiftsContainer.Page page = (ProfileGiftsContainer.Page) this.f$0;
        page.list.gifts.remove((TL_stars.SavedStarGift) this.f$1);
        page.update(true);
        int i = page.currentAccount;
        long clientUserId = UserConfig.getInstance(i).getClientUserId();
        SharedMediaLayout.AnonymousClass13 anonymousClass13 = page.parent;
        if (j == clientUserId) {
            BulletinFactory bulletinFactoryOf = BulletinFactory.of(anonymousClass13.fragment);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i2 = R.string.BoughtResoldGiftText;
            StringBuilder sb = new StringBuilder();
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            Bulletin bulletinCreateSimpleBulletin = bulletinFactoryOf.createSimpleBulletin(document, string, LocaleController.formatString(i2, BillingController$$ExternalSyntheticOutline0.m(tL_starGiftUnique.num, ',', sb)));
            bulletinCreateSimpleBulletin.hideAfterBottomSheet = false;
            bulletinCreateSimpleBulletin.show();
        } else {
            Bulletin bulletinCreateSimpleBulletin2 = BulletinFactory.of(anonymousClass13.fragment).createSimpleBulletin(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i, j)));
            bulletinCreateSimpleBulletin2.hideAfterBottomSheet = false;
            bulletinCreateSimpleBulletin2.show();
        }
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null) {
            launchActivity.fireworksOverlay.start(true);
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        ConferenceCall conferenceCall;
        String str;
        switch (this.$r8$classId) {
            case 2:
                DialogsActivity.AnonymousClass11 anonymousClass11 = (DialogsActivity.AnonymousClass11) this.f$0;
                anonymousClass11.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) this.f$1;
                tL_messages_updateDialogFilter.id = dialogFilter.id;
                DialogsActivity dialogsActivity = DialogsActivity.this;
                dialogsActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                dialogsActivity.getMessagesController().removeFilter(dialogFilter);
                dialogsActivity.getMessagesStorage().deleteDialogFilter(dialogFilter);
                break;
            case 4:
                FiltersSetupActivity.ListAdapter listAdapter = (FiltersSetupActivity.ListAdapter) this.f$0;
                FiltersSetupActivity filtersSetupActivity = FiltersSetupActivity.this;
                AlertDialog alertDialog2 = null;
                if (filtersSetupActivity.getParentActivity() != null) {
                    AlertDialog alertDialog3 = new AlertDialog(filtersSetupActivity.getParentActivity(), 3, null);
                    alertDialog3.canCacnel = false;
                    alertDialog3.show();
                    alertDialog2 = alertDialog3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) this.f$1;
                tL_messages_updateDialogFilter2.id = dialogFilter2.id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new BoostsActivity$$ExternalSyntheticLambda7(listAdapter, alertDialog2, dialogFilter2, 28));
                break;
            case 5:
                AuctionBidSheet auctionBidSheet = (AuctionBidSheet) this.f$0;
                auctionBidSheet.getClass();
                AuctionBidSheet.AnonymousClass4 anonymousClass4 = (AuctionBidSheet.AnonymousClass4) this.f$1;
                try {
                    int i2 = Integer.parseInt(anonymousClass4.getText().toString().trim());
                    auctionBidSheet.sendBid(i2);
                    auctionBidSheet.slider.setValue(i2);
                    alertDialog.dismiss();
                } catch (Throwable th) {
                    AndroidUtilities.shakeView(anonymousClass4);
                    FileLog.e(th);
                    return;
                }
                break;
            case 6:
                ProfileGiftsContainer.AnonymousClass5 anonymousClass5 = (ProfileGiftsContainer.AnonymousClass5) this.f$0;
                String string = anonymousClass5.getText().toString();
                if (string.length() <= 0 || string.length() > 12) {
                    AndroidUtilities.shakeView(anonymousClass5);
                } else {
                    ((Utilities.Callback) this.f$1).run(string);
                    alertDialog.dismiss();
                }
                break;
            case 10:
                GroupCallActivity groupCallActivity = (GroupCallActivity) this.f$0;
                boolean zIsConference = groupCallActivity.isConference();
                TLObject tLObject = (TLObject) this.f$1;
                if (!zIsConference) {
                    boolean z = tLObject instanceof TLRPC.User;
                    AccountInstance accountInstance = groupCallActivity.accountInstance;
                    if (z) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(groupCallActivity.getChatId(), user);
                        groupCallActivity.getUndoView().showWithAction(0L, 32, user, (Object) null, (Runnable) null, (Runnable) null);
                    } else {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(groupCallActivity.getChatId(), (TLRPC.User) null, chat, false, false);
                        groupCallActivity.getUndoView().showWithAction(0L, 32, chat, (Object) null, (Runnable) null, (Runnable) null);
                    }
                    break;
                } else {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user2 = (TLRPC.User) tLObject;
                        conferenceCall.kick(user2.id);
                        groupCallActivity.call.addKickedUser(user2.id);
                        groupCallActivity.getUndoView().showWithAction(0L, 102, user2, (Object) null, (Runnable) null, (Runnable) null);
                        break;
                    }
                }
                break;
            case 11:
                GroupCreateActivity groupCreateActivity = (GroupCreateActivity) this.f$0;
                groupCreateActivity.delegate2.needAddBot((TLRPC.User) this.f$1);
                if (groupCreateActivity.searchField.editText.length() > 0) {
                    groupCreateActivity.searchField.editText.setText((CharSequence) null);
                }
                break;
            case 12:
                GroupCreateActivity groupCreateActivity2 = (GroupCreateActivity) this.f$0;
                groupCreateActivity2.getClass();
                CheckBoxCell checkBoxCell = ((CheckBoxCell[]) this.f$1)[0];
                int i3 = (checkBoxCell == null || !checkBoxCell.isChecked()) ? 0 : 100;
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < groupCreateActivity2.selectedContacts.size(); i4++) {
                    arrayList.add(groupCreateActivity2.getMessagesController().getUser(Long.valueOf(groupCreateActivity2.selectedContacts.keyAt(i4))));
                }
                GroupCreateActivity.ContactsAddActivityDelegate contactsAddActivityDelegate = groupCreateActivity2.delegate2;
                if (contactsAddActivityDelegate != null) {
                    contactsAddActivityDelegate.didSelectUsers(i3, arrayList);
                }
                groupCreateActivity2.finishFragment();
                break;
            case 14:
                ((LanguageSelectActivity) this.f$0).lambda$createView$5((LocaleController.LocaleInfo) this.f$1);
                break;
            case 15:
                ((LaunchActivity) this.f$0).presentFragment((LoginActivity) this.f$1);
                break;
            case 16:
                LaunchActivity launchActivity = (LaunchActivity) this.f$0;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) this.f$1)[0], true, false, launchActivity.currentAccount);
                ActionBarLayout actionBarLayout = launchActivity.layersActionBarLayout;
                if (actionBarLayout != null) {
                    actionBarLayout.rebuildAllFragmentViews(true, true);
                } else {
                    launchActivity.actionBarLayout.rebuildAllFragmentViews(true, true);
                }
                break;
            case 24:
                LoginActivity.LoginActivityNewPasswordView loginActivityNewPasswordView = (LoginActivity.LoginActivityNewPasswordView) this.f$0;
                loginActivityNewPasswordView.getClass();
                LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) ((TLObject) this.f$1), false);
                break;
            case 25:
                LoginActivity.LoginActivityPasswordView loginActivityPasswordView = (LoginActivity.LoginActivityPasswordView) this.f$0;
                loginActivityPasswordView.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) this.f$1).email_pattern);
                bundle.putString("password", loginActivityPasswordView.passwordString);
                bundle.putString("requestPhone", loginActivityPasswordView.requestPhone);
                bundle.putString("phoneHash", loginActivityPasswordView.phoneHash);
                bundle.putString("phoneCode", loginActivityPasswordView.phoneCode);
                LoginActivity.this.setPage(7, true, bundle, false);
                break;
            case 27:
                LoginActivity.LoginActivitySmsView loginActivitySmsView = (LoginActivity.LoginActivitySmsView) this.f$0;
                Context context = (Context) this.f$1;
                loginActivitySmsView.getClass();
                try {
                    PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                    Locale locale = Locale.US;
                    String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:"));
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                    StringBuilder sb = new StringBuilder();
                    sb.append(loginActivitySmsView.emailPhone);
                    sb.append(" Android Registration/Login Issue ");
                    sb.append(str2);
                    sb.append(LoginActivity.this.paid ? " #paidauth" : "");
                    intent.putExtra("android.intent.extra.SUBJECT", sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Technical Details (PLEASE DO NOT EDIT OR REMOVE)\n");
                    sb2.append("Device: ");
                    sb2.append(Build.MANUFACTURER);
                    sb2.append(" ");
                    sb2.append(Build.MODEL);
                    sb2.append("\n");
                    sb2.append("OS version: SDK ");
                    int i5 = Build.VERSION.SDK_INT;
                    sb2.append(i5);
                    sb2.append("\n");
                    sb2.append("Locale: ");
                    sb2.append(Locale.getDefault());
                    sb2.append("\n");
                    sb2.append("\n");
                    sb2.append("Target Phone: +");
                    sb2.append(loginActivitySmsView.requestPhone);
                    sb2.append("\n");
                    sb2.append("\n");
                    try {
                        if (i5 < 22) {
                            try {
                                String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
                                if (!TextUtils.isEmpty(line1Number)) {
                                    sb2.append("SIM0.Phone: ");
                                    sb2.append(line1Number);
                                    sb2.append("\n");
                                    sb2.append("SIM0.MCC: unknown\n");
                                    sb2.append("SIM0.MNC: unknown\n");
                                    sb2.append("SIM0.Carrier: unknown\n\n");
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            break;
                        } else {
                            SubscriptionManager subscriptionManagerFrom = SubscriptionManager.from(loginActivitySmsView.getContext());
                            List completeActiveSubscriptionInfoList = i5 >= 30 ? subscriptionManagerFrom.getCompleteActiveSubscriptionInfoList() : null;
                            if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i5 >= 28) {
                                completeActiveSubscriptionInfoList = subscriptionManagerFrom.getAccessibleSubscriptionInfoList();
                            }
                            if (completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) {
                                completeActiveSubscriptionInfoList = subscriptionManagerFrom.getActiveSubscriptionInfoList();
                            }
                            if (completeActiveSubscriptionInfoList != null) {
                                Iterator it = completeActiveSubscriptionInfoList.iterator();
                                while (it.hasNext()) {
                                    SubscriptionInfo subscriptionInfoM = LoginActivity$$ExternalSyntheticApiModelOutline2.m(it.next());
                                    String number = subscriptionInfoM.getNumber();
                                    if (!TextUtils.isEmpty(number)) {
                                        String str3 = "SIM" + subscriptionInfoM.getSimSlotIndex();
                                        sb2.append(str3);
                                        sb2.append(".Phone: ");
                                        sb2.append(number);
                                        sb2.append("\n");
                                        sb2.append(str3);
                                        sb2.append(".MCC: ");
                                        sb2.append(subscriptionInfoM.getMcc());
                                        sb2.append("\n");
                                        sb2.append(str3);
                                        sb2.append(".MNC: ");
                                        sb2.append(subscriptionInfoM.getMnc());
                                        sb2.append("\n");
                                        sb2.append(str3);
                                        sb2.append(".Carrier: ");
                                        sb2.append(TextUtils.isEmpty(subscriptionInfoM.getCarrierName()) ? "unknown" : subscriptionInfoM.getCarrierName());
                                        sb2.append("\n\n");
                                    }
                                }
                            }
                        }
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        try {
                            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(TelephonyManager.class);
                            SignalStrength signalStrength = telephonyManager.getSignalStrength();
                            if (signalStrength != null) {
                                sb2.append("Signal: ");
                                sb2.append(signalStrength.getLevel());
                                sb2.append("/4\n");
                            } else {
                                sb2.append("Signal: unknown\n");
                            }
                        } catch (Exception e3) {
                            FileLog.e(e3);
                        }
                    } else {
                        sb2.append("Signal: unknown\n");
                    }
                    sb2.append("Wi-Fi: ");
                    sb2.append(AndroidUtilities.isWifiEnabled(context));
                    sb2.append("\n");
                    sb2.append("Airplane Mode: ");
                    sb2.append(AndroidUtilities.isInAirplaneMode(context));
                    sb2.append("\n");
                    sb2.append("\n");
                    sb2.append("App: ");
                    sb2.append(BuildVars.APP_ID);
                    sb2.append("\n");
                    int i6 = packageInfo.versionCode % 10;
                    if (i6 == 1 || i6 == 2) {
                        str = "store";
                    } else if (ApplicationLoader.isStandaloneBuild()) {
                        str = "direct";
                    } else if (ApplicationLoader.isBetaBuild()) {
                        str = "beta";
                    } else {
                        str = ApplicationLoader.isHuaweiStoreBuild() ? "huawei" : "universal";
                    }
                    sb2.append("App version: ");
                    sb2.append(str2);
                    sb2.append(" ");
                    sb2.append(str);
                    sb2.append("\n");
                    sb2.append("\n");
                    sb2.append("Issue: ");
                    sb2.append(LoginActivity.this.paid ? "no_otp" : "no_otp_paid");
                    sb2.append("\n");
                    if (!TextUtils.isEmpty(loginActivitySmsView.lastError)) {
                        sb2.append("Error: ");
                        sb2.append(loginActivitySmsView.lastError);
                        sb2.append("\n");
                    }
                    sb2.append("\n\n================================================\n");
                    sb2.append("WRITE YOUR COMMENT HERE:\n");
                    sb2.append("\n");
                    sb2.append("\n");
                    intent.putExtra("android.intent.extra.TEXT", sb2.toString());
                    loginActivitySmsView.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                } catch (Exception unused) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
                    return;
                }
                break;
            default:
                PassportActivity passportActivity = (PassportActivity) this.f$0;
                if (!passportActivity.documentOnly) {
                    passportActivity.currentValues.clear();
                }
                passportActivity.currentDocumentValues.clear();
                PassportActivity.AnonymousClass20 anonymousClass20 = (PassportActivity.AnonymousClass20) passportActivity.delegate;
                PassportActivity.this.deleteValueInternal(passportActivity.currentType, passportActivity.currentDocumentsType, passportActivity.availableDocumentTypes, ((boolean[]) this.f$1)[0], null, null, anonymousClass20.val$documentOnly);
                passportActivity.finishFragment();
                break;
        }
    }

    @Override
    public void onComplete(Task task) {
        switch (this.$r8$classId) {
            case 23:
                LoginActivity loginActivity = LoginActivity.this;
                if (loginActivity.getParentActivity() != null) {
                    loginActivity.getParentActivity().startActivityForResult(((zze) this.f$1).getSignInIntent(), 200);
                    break;
                }
                break;
            default:
                LoginActivity loginActivity2 = LoginActivity.this;
                if (loginActivity2.getParentActivity() != null && !loginActivity2.getParentActivity().isFinishing()) {
                    loginActivity2.getParentActivity().startActivityForResult(((zze) this.f$1).getSignInIntent(), 200);
                    break;
                }
                break;
        }
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
        int i = this.$r8$classId;
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        switch (this.$r8$classId) {
            case 1:
                ((DialogsActivity) this.f$0).lambda$createView$16((DialogsActivity.ViewPage) this.f$1, view, i);
                break;
            case 3:
                ((FiltersSetupActivity) this.f$0).lambda$createView$4((Context) this.f$1, view, i);
                break;
            case 9:
                ((ResaleGiftsFragment.SelectGiftSheet) this.f$0).lambda$new$22((ResaleGiftsFragment.SelectGiftSheet.State) this.f$1, i);
                break;
            default:
                ((NotificationsCustomSettingsActivity) this.f$0).lambda$createView$17((Context) this.f$1, view, i, f, f2);
                break;
        }
    }

    @Override
    public void onResult(boolean z) throws Throwable {
        ((LaunchActivity) this.f$0).handleIntent((Intent) this.f$1, true, false, false, null, true, false);
    }

    @Override
    public void mo1067run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ProfileGiftsContainer.UnpinSheet unpinSheet = (ProfileGiftsContainer.UnpinSheet) this.f$0;
        unpinSheet.getClass();
        long j = ((TL_stars.SavedStarGift) ((UItem) obj).object).gift.id;
        if (unpinSheet.selectedGift == j) {
            unpinSheet.selectedGift = 0L;
        } else {
            unpinSheet.selectedGift = j;
        }
        ((ButtonWithCounterView) this.f$1).setEnabled(unpinSheet.selectedGift != 0);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof PeerColorActivity.GiftCell) {
                    PeerColorActivity.GiftCell giftCell = (PeerColorActivity.GiftCell) childAt;
                    giftCell.setSelected(unpinSheet.selectedGift == giftCell.getGiftId(), true);
                }
            }
        }
    }

    public DialogsActivity$$ExternalSyntheticLambda89(KeepMediaPopupView keepMediaPopupView, DialogsActivity dialogsActivity) {
        this.$r8$classId = 13;
        this.f$1 = keepMediaPopupView;
        this.f$0 = dialogsActivity;
    }

    @Override
    public boolean onItemClick(int i, View view) {
        LocationActivity locationActivity = (LocationActivity) this.f$0;
        if (locationActivity.locationType == 2) {
            Object item = locationActivity.adapter.getItem(i);
            if (item instanceof LocationActivity.LiveLocation) {
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout((Context) this.f$1);
                ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, locationActivity.getParentActivity(), locationActivity.getResourceProvider(), true, true);
                actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(200.0f));
                actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                actionBarMenuSubItem.setOnClickListener(new IntroActivity$$ExternalSyntheticLambda1(22, locationActivity, (LocationActivity.LiveLocation) item));
                actionBarPopupWindowLayout.linearLayout.addView(actionBarMenuSubItem);
                LocationActivity.AnonymousClass8 anonymousClass8 = locationActivity.new AnonymousClass8(actionBarPopupWindowLayout);
                locationActivity.popupWindow = anonymousClass8;
                anonymousClass8.setOutsideTouchable(true);
                locationActivity.popupWindow.setClippingEnabled(true);
                locationActivity.popupWindow.setInputMethodMode(2);
                locationActivity.popupWindow.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                locationActivity.popupWindow.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                locationActivity.popupWindow.dimBehind(0.2f);
                return true;
            }
        }
        return false;
    }
}
