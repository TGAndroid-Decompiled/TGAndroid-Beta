package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.content.FileProvider;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.zzcl;
import com.google.android.gms.internal.mlkit_vision_common.zzlf;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.CreateBotAlert;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.URLSpanNoUnderline;

public final class LinkManager$$ExternalSyntheticLambda12 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public LinkManager$$ExternalSyntheticLambda12(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    private final void run$org$telegram$ui$LoginActivity$LoginPayView$$ExternalSyntheticLambda12() {
        String str;
        LoginActivity.LoginPayView loginPayView = (LoginActivity.LoginPayView) this.f$0;
        String str2 = (String) this.f$1;
        String str3 = (String) this.f$2;
        String str4 = (String) this.f$3;
        loginPayView.getClass();
        try {
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            Locale locale = Locale.US;
            String str5 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            if (TextUtils.isEmpty(str2)) {
                intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
            } else {
                intent.putExtra("android.intent.extra.EMAIL", new String[]{str2});
            }
            if (TextUtils.isEmpty(str3)) {
                intent.putExtra("android.intent.extra.SUBJECT", "Android Registration/Login Billing Issue #billing_issue");
            } else {
                intent.putExtra("android.intent.extra.SUBJECT", str3);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Technical Details (PLEASE DO NOT EDIT OR REMOVE)\n");
            sb.append("Device: ");
            sb.append(Build.MANUFACTURER);
            sb.append(" ");
            sb.append(Build.MODEL);
            sb.append("\n");
            sb.append("OS version: SDK ");
            int i = Build.VERSION.SDK_INT;
            sb.append(i);
            sb.append("\n");
            sb.append("Locale: ");
            sb.append(Locale.getDefault());
            sb.append("\n");
            sb.append("\n");
            sb.append("Target Phone: +");
            sb.append(str4);
            sb.append("\n");
            sb.append("\n");
            try {
                if (i >= 22) {
                    SubscriptionManager subscriptionManagerFrom = SubscriptionManager.from(loginPayView.getContext());
                    List completeActiveSubscriptionInfoList = i >= 30 ? subscriptionManagerFrom.getCompleteActiveSubscriptionInfoList() : null;
                    if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i >= 28) {
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
                                String str6 = "SIM" + subscriptionInfoM.getSimSlotIndex();
                                sb.append(str6);
                                sb.append(".Phone: ");
                                sb.append(number);
                                sb.append("\n");
                                sb.append(str6);
                                sb.append(".MCC: ");
                                sb.append(subscriptionInfoM.getMcc());
                                sb.append("\n");
                                sb.append(str6);
                                sb.append(".MNC: ");
                                sb.append(subscriptionInfoM.getMnc());
                                sb.append("\n");
                                sb.append(str6);
                                sb.append(".Carrier: ");
                                sb.append(TextUtils.isEmpty(subscriptionInfoM.getCarrierName()) ? "unknown" : subscriptionInfoM.getCarrierName());
                                sb.append("\n\n");
                            }
                        }
                    }
                } else {
                    try {
                        String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
                        if (!TextUtils.isEmpty(line1Number)) {
                            sb.append("SIM0.Phone: ");
                            sb.append(line1Number);
                            sb.append("\n");
                            sb.append("SIM0.MCC: unknown\n");
                            sb.append("SIM0.MNC: unknown\n");
                            sb.append("SIM0.Carrier: unknown\n\n");
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            } catch (Exception e2) {
                FileLog.e(e2);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) loginPayView.getContext().getSystemService(TelephonyManager.class);
                    SignalStrength signalStrength = telephonyManager.getSignalStrength();
                    if (signalStrength != null) {
                        sb.append("Signal: ");
                        sb.append(signalStrength.getLevel());
                        sb.append("/4\n");
                    } else {
                        sb.append("Signal: unknown\n");
                    }
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
            } else {
                sb.append("Signal: unknown\n");
            }
            sb.append("Wi-Fi: ");
            sb.append(AndroidUtilities.isWifiEnabled(loginPayView.getContext()));
            sb.append("\n");
            sb.append("Airplane Mode: ");
            sb.append(AndroidUtilities.isInAirplaneMode(loginPayView.getContext()));
            sb.append("\n");
            sb.append("\n");
            sb.append("App: ");
            sb.append(BuildVars.APP_ID);
            sb.append("\n");
            int i2 = packageInfo.versionCode % 10;
            if (i2 == 1 || i2 == 2) {
                str = "store";
            } else if (ApplicationLoader.isStandaloneBuild()) {
                str = "direct";
            } else if (ApplicationLoader.isBetaBuild()) {
                str = "beta";
            } else {
                str = ApplicationLoader.isHuaweiStoreBuild() ? "huawei" : "universal";
            }
            sb.append("App version: ");
            sb.append(str5);
            sb.append(" ");
            sb.append(str);
            sb.append("\n");
            sb.append("\n");
            sb.append("Issue: ");
            sb.append("billing_issue");
            sb.append("\n");
            if (!TextUtils.isEmpty(loginPayView.lastError)) {
                sb.append("Error: ");
                sb.append(loginPayView.lastError);
                sb.append("\n");
            }
            sb.append("\n\n================================================\n");
            sb.append("WRITE YOUR COMMENT HERE:\n");
            sb.append("\n");
            sb.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb.toString());
            loginPayView.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
        }
    }

    private final void run$org$telegram$ui$ProfileActivity$$ExternalSyntheticLambda122() {
        Uri uriFromFile;
        try {
            ((AlertDialog) this.f$0).dismiss();
        } catch (Exception unused) {
        }
        boolean z = ((boolean[]) this.f$1)[0];
        Activity activity = (Activity) this.f$2;
        if (!z) {
            if (activity != null) {
                Toast.makeText(activity, LocaleController.getString(R.string.ErrorOccurred), 0).show();
                return;
            }
            return;
        }
        int i = Build.VERSION.SDK_INT;
        File file = (File) this.f$3;
        if (i >= 24) {
            uriFromFile = FileProvider.getUriForFile(activity, ApplicationLoader.getApplicationId() + ".provider", file);
        } else {
            uriFromFile = Uri.fromFile(file);
        }
        Intent intent = new Intent("android.intent.action.SEND");
        if (i >= 24) {
            intent.addFlags(1);
        }
        intent.setType("message/rfc822");
        intent.putExtra("android.intent.extra.EMAIL", "");
        intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + LocaleController.getInstance().getFormatterStats().format(System.currentTimeMillis()));
        intent.putExtra("android.intent.extra.STREAM", uriFromFile);
        if (activity != null) {
            try {
                activity.startActivityForResult(Intent.createChooser(intent, "Select email application."), 500);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final void run() {
        boolean z;
        String str;
        String string;
        int iIndexOf;
        AlertDialog.Builder builder;
        int i;
        long peerDialogId;
        String forcedFirstName;
        TLRPC.Chat chat;
        long j;
        String string2;
        TLRPC.InputPeer inputPeer;
        PaymentFormActivity.PaymentFormCallback paymentFormCallback;
        PaymentFormActivity.PaymentFormCallback paymentFormCallback2;
        int i2 = 11;
        int i3 = 10;
        String string3 = null;
        int i4 = 0;
        int i5 = 1;
        Object obj = this.f$3;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                LinkManager linkManager = (LinkManager) obj4;
                linkManager.getClass();
                BaseFragment baseFragment = (BaseFragment) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                CreateBotAlert.show(baseFragment.getContext(), linkManager.currentAccount, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new OAuthSheet$$ExternalSyntheticLambda13(14, linkManager, userArr), baseFragment.getResourceProvider(), LinkManager.getBulletinFactory());
                break;
            case 1:
                ((GroupCallActivity) obj4).lambda$new$21((HashSet) obj3, (ChatObject.Call) obj2, (String) obj);
                break;
            case 2:
                TLObject tLObject = (TLObject) obj4;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int i6 = 0;
                    while (true) {
                        ArrayList arrayList = (ArrayList) obj3;
                        if (i6 < Math.min(arrayList.size(), vector.objects.size())) {
                            if (vector.objects.get(i6) instanceof TL_account.requirementToContactPremium) {
                                ((ArrayList) obj2).add(Long.valueOf(((TLRPC.User) arrayList.get(i6)).id));
                            }
                            i6++;
                        }
                    }
                }
                ((ChatActivity$$ExternalSyntheticLambda218) obj).run();
                break;
            case 3:
                GroupCallActivity.AvatarUpdaterDelegate avatarUpdaterDelegate = (GroupCallActivity.AvatarUpdaterDelegate) obj4;
                ImageLocation imageLocation = avatarUpdaterDelegate.uploadingImageLocation;
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                if (imageLocation != null) {
                    GroupCallActivity.AnonymousClass30 anonymousClass30 = groupCallActivity.avatarsViewPager;
                    anonymousClass30.uploadingImageLocation = imageLocation;
                    anonymousClass30.currentUploadingImageLocation = null;
                    anonymousClass30.curreantUploadingThumbLocation = null;
                    avatarUpdaterDelegate.uploadingImageLocation = null;
                }
                if (((TLRPC.TL_error) obj3) == null) {
                    MessagesController messagesController = groupCallActivity.accountInstance.getMessagesController();
                    AccountInstance accountInstance = groupCallActivity.accountInstance;
                    TLRPC.User user = messagesController.getUser(Long.valueOf(accountInstance.getUserConfig().getClientUserId()));
                    if (user == null) {
                        user = accountInstance.getUserConfig().getCurrentUser();
                        if (user != null) {
                            accountInstance.getMessagesController().putUser(user, false);
                        }
                    } else {
                        accountInstance.getUserConfig().setCurrentUser(user);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) ((TLObject) obj2);
                    ArrayList<TLRPC.PhotoSize> arrayList2 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList2, 150);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList2, 800);
                    TLRPC.VideoSize videoSize = tL_photos_photo.photo.video_sizes.isEmpty() ? null : tL_photos_photo.photo.video_sizes.get(0);
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    user.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize == null || avatarUpdaterDelegate.avatar == null) {
                        z = true;
                    } else {
                        FileLoader.getInstance(((BottomSheet) groupCallActivity).currentAccount).getPathToAttach(avatarUpdaterDelegate.avatar, true).renameTo(FileLoader.getInstance(((BottomSheet) groupCallActivity).currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb = new StringBuilder();
                        sb.append(avatarUpdaterDelegate.avatar.volume_id);
                        sb.append("_");
                        String strM = SurfaceContainer$$ExternalSyntheticOutline0.m(avatarUpdaterDelegate.avatar.local_id, "@50_50", sb);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(closestPhotoSizeWithSize.location.volume_id);
                        sb2.append("_");
                        String strM2 = SurfaceContainer$$ExternalSyntheticOutline0.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2);
                        z = true;
                        ImageLoader.getInstance().replaceImageInCache(strM, strM2, ImageLocation.getForUser(((BottomSheet) groupCallActivity).currentAccount, user, 1), false);
                    }
                    if (closestPhotoSizeWithSize2 != null && avatarUpdaterDelegate.avatarBig != null) {
                        FileLoader.getInstance(((BottomSheet) groupCallActivity).currentAccount).getPathToAttach(avatarUpdaterDelegate.avatarBig, z).renameTo(FileLoader.getInstance(((BottomSheet) groupCallActivity).currentAccount).getPathToAttach(closestPhotoSizeWithSize2, z));
                    }
                    if (videoSize != null && (str = (String) obj) != null) {
                        new File(str).renameTo(FileLoader.getInstance(((BottomSheet) groupCallActivity).currentAccount).getPathToAttach(videoSize, "mp4", z));
                    }
                    accountInstance.getMessagesController().getDialogPhotos(user.id).reset();
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(user);
                    accountInstance.getMessagesStorage().putUsersAndChats(arrayList3, null, false, true);
                    TLRPC.User user2 = accountInstance.getMessagesController().getUser(Long.valueOf(avatarUpdaterDelegate.peerId));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user2, 0);
                    ImageLocation forUser2 = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user2, 1);
                    if (ImageLocation.getForLocal(avatarUpdaterDelegate.avatarBig) == null) {
                        forUser2 = ImageLocation.getForLocal(avatarUpdaterDelegate.avatar);
                    }
                    GroupCallActivity.AnonymousClass30 anonymousClass31 = groupCallActivity.avatarsViewPager;
                    anonymousClass31.setCreateThumbFromParent(false);
                    anonymousClass31.initIfEmpty(null, forUser, forUser2, true);
                    avatarUpdaterDelegate.avatar = null;
                    avatarUpdaterDelegate.avatarBig = null;
                    AndroidUtilities.updateVisibleRows(groupCallActivity.listView);
                    avatarUpdaterDelegate.updateAvatarUploadingProgress(1.0f);
                }
                groupCallActivity.accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                AccountInstance accountInstance2 = groupCallActivity.accountInstance;
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                accountInstance2.getUserConfig().saveConfig(true);
                break;
            case 4:
                ((GroupCreateFinalActivity) obj4).lambda$onFragmentCreate$0((ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                break;
            case 5:
                GroupStickersActivity.SearchAdapter searchAdapter = (GroupStickersActivity.SearchAdapter) obj4;
                searchAdapter.searchEntries = (ArrayList) obj3;
                searchAdapter.localSearchEntries = (ArrayList) obj2;
                searchAdapter.notifyDataSetChanged();
                GroupStickersActivity groupStickersActivity = GroupStickersActivity.this;
                groupStickersActivity.emptyView.title.setVisibility(8);
                groupStickersActivity.emptyView.subtitle.setText(LocaleController.formatString(R.string.ChooseStickerNoResultsFound, (String) obj));
                groupStickersActivity.emptyView.showProgress(false, true);
                break;
            case 6:
                LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13 = (LaunchActivity$$ExternalSyntheticLambda13) obj3;
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                launchActivity.getClass();
                try {
                    launchActivity$$ExternalSyntheticLambda13.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TLObject tLObject2 = (TLObject) obj2;
                if (!(tLObject2 instanceof TLRPC.TL_langPackLanguage)) {
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                    if (tL_error != null) {
                        if (!"LANG_CODE_NOT_SUPPORTED".equals(tL_error.text)) {
                            StringBuilder sb3 = new StringBuilder();
                            zzlf.m(R.string.ErrorOccurred, "\n", sb3);
                            sb3.append(tL_error.text);
                            launchActivity.showAlertDialog(AlertsCreator.createSimpleAlert(launchActivity, null, sb3.toString()));
                        } else {
                            launchActivity.showAlertDialog(AlertsCreator.createSimpleAlert(launchActivity, null, LocaleController.getString(R.string.LanguageUnsupportedError)));
                        }
                    }
                } else {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject2;
                    Pattern pattern = AlertsCreator.URL_PATTERN;
                    if (tL_langPackLanguage == null) {
                        builder = null;
                    } else {
                        tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                        tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                        String str2 = tL_langPackLanguage.base_lang_code;
                        if (str2 != null) {
                            tL_langPackLanguage.base_lang_code = str2.replace('-', '_').toLowerCase();
                        }
                        final AlertDialog.Builder builder2 = new AlertDialog.Builder(launchActivity, 0, null);
                        boolean zEquals = LocaleController.getInstance().getCurrentLocaleInfo().shortName.equals(tL_langPackLanguage.lang_code);
                        AlertDialog alertDialog = builder2.alertDialog;
                        if (zEquals) {
                            alertDialog.title = LocaleController.getString(R.string.Language);
                            string = LocaleController.formatString("LanguageSame", R.string.LanguageSame, tL_langPackLanguage.name);
                            builder2.setNegativeButton(LocaleController.getString(R.string.OK), null);
                            builder2.setNeutralButton(LocaleController.getString(R.string.SETTINGS), new LaunchActivity$$ExternalSyntheticLambda14(launchActivity, i5));
                        } else if (tL_langPackLanguage.strings_count == 0) {
                            alertDialog.title = LocaleController.getString(R.string.LanguageUnknownTitle);
                            string = LocaleController.formatString("LanguageUnknownCustomAlert", R.string.LanguageUnknownCustomAlert, tL_langPackLanguage.name);
                            builder2.setNegativeButton(LocaleController.getString(R.string.OK), null);
                        } else {
                            alertDialog.title = LocaleController.getString(R.string.LanguageTitle);
                            string = tL_langPackLanguage.official ? LocaleController.formatString("LanguageAlert", R.string.LanguageAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f))) : LocaleController.formatString("LanguageCustomAlert", R.string.LanguageCustomAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                            builder2.setPositiveButton(LocaleController.getString(R.string.Change), new ChatActivity$$ExternalSyntheticLambda189(13, tL_langPackLanguage, launchActivity));
                            builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(string));
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) spannableStringBuilder, '[');
                        if (iIndexOf2 != -1) {
                            int i7 = iIndexOf2 + 1;
                            iIndexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, ']', i7);
                            if (iIndexOf != -1) {
                                spannableStringBuilder.delete(iIndexOf, iIndexOf + 1);
                                spannableStringBuilder.delete(iIndexOf2, i7);
                            }
                        } else {
                            iIndexOf = -1;
                        }
                        if (iIndexOf2 != -1 && iIndexOf != -1) {
                            spannableStringBuilder.setSpan(new URLSpanNoUnderline(tL_langPackLanguage.translations_url) {
                                public final AlertDialog.Builder val$builder;

                                public AnonymousClass1(String str3) {
                                    super(str3, null);
                                    builder = builder2;
                                }

                                @Override
                                public final void onClick(View view) {
                                    builder.alertDialog.dismissRunnable.run();
                                    super.onClick(view);
                                }
                            }, iIndexOf2, iIndexOf - 1, 33);
                        }
                        TextView textView = new TextView(launchActivity);
                        textView.setText(spannableStringBuilder);
                        textView.setTextSize(1, 16.0f);
                        textView.setLinkTextColor(Theme.getColor(null, Theme.key_dialogTextLink, false));
                        textView.setHighlightColor(Theme.getColor(null, Theme.key_dialogLinkSelection, false));
                        textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
                        textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
                        builder2.setView(textView);
                        builder = builder2;
                    }
                    launchActivity.showAlertDialog(builder);
                }
                break;
            case 7:
                AlertDialog alertDialog2 = (AlertDialog) obj4;
                Pattern pattern2 = LaunchActivity.PREFIX_T_ME_PATTERN;
                try {
                    alertDialog2.dismiss();
                    break;
                } catch (Exception unused) {
                }
                if (!(((TLObject) obj3) instanceof TLRPC.TL_authorization)) {
                    AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda13(24, (ActionIntroActivity) obj2, (TLRPC.TL_error) obj));
                }
                break;
            case 8:
                ((LinkManager.AnonymousClass1) obj4).lambda$onCallUsersSelected$2((TLObject) obj3, (HashSet) obj2, (TLRPC.TL_error) obj);
                break;
            case 9:
                OutlineTextContainerView.animateSpring(((OutlineTextContainerView) obj4).errorSpring, 0.0f);
                ((View) obj3).setTag(R.id.timeout_callback, null);
                EditText editText = (EditText) obj2;
                if (editText != null) {
                    editText.post(new LinkManager$$ExternalSyntheticLambda2(5, editText, (LoginActivity.AnonymousClass7) obj));
                }
                break;
            case 10:
                LoginActivity.LoginActivityNewPasswordView loginActivityNewPasswordView = (LoginActivity.LoginActivityNewPasswordView) obj4;
                loginActivityNewPasswordView.getClass();
                String str3 = (String) obj3;
                byte[] stringBytes = str3 != null ? AndroidUtilities.getStringBytes(str3) : null;
                LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda6 loginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda6 = new LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda6(loginActivityNewPasswordView, str3, (String) obj2, i4);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = loginActivityNewPasswordView.currentPassword.new_algo;
                if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
                    TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                    tL_error2.text = "PASSWORD_HASH_INVALID";
                    loginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda6.run(null, tL_error2);
                } else {
                    TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                    if (str3 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error3 = new TLRPC.TL_error();
                            tL_error3.text = "ALGO_INVALID";
                            loginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda6.run(null, tL_error3);
                        }
                    }
                    ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_recoverPassword, loginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda6, 10);
                }
                break;
            case 11:
                LoginActivity.LoginActivityRecoverView loginActivityRecoverView = (LoginActivity.LoginActivityRecoverView) obj4;
                LoginActivity loginActivity = LoginActivity.this;
                loginActivity.needHideProgress(false, true);
                loginActivityRecoverView.nextPressed = false;
                if (!(((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                    TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                    if (tL_error4 == null || tL_error4.text.startsWith("CODE_INVALID")) {
                        loginActivityRecoverView.onPasscodeError$3(true);
                    } else if (!tL_error4.text.startsWith("FLOOD_WAIT")) {
                        loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error4.text);
                    } else {
                        int iIntValue = Utilities.parseInt((CharSequence) tL_error4.text).intValue();
                        loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                    }
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", (String) obj2);
                    bundle.putString("password", loginActivityRecoverView.passwordString);
                    loginActivity.setPage(9, true, bundle, false);
                }
                break;
            case 12:
                LoginActivity.LoginActivitySmsView loginActivitySmsView = (LoginActivity.LoginActivitySmsView) obj4;
                loginActivitySmsView.nextPressed = false;
                LoginActivity loginActivity2 = LoginActivity.this;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                if (tL_error5 == null) {
                    Bundle bundle2 = (Bundle) obj2;
                    loginActivitySmsView.nextCodeParams = bundle2;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) ((TLObject) obj);
                    loginActivitySmsView.nextCodeAuth = tL_auth_sentCode;
                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                        loginActivitySmsView.nextType = 17;
                    } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                        loginActivitySmsView.nextType = 16;
                    }
                    loginActivity2.fillNextCodeParams(bundle2, tL_auth_sentCode, true);
                } else {
                    String str4 = tL_error5.text;
                    if (str4 != null) {
                        if (str4.contains("PHONE_NUMBER_INVALID")) {
                            loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (tL_error5.text.contains("PHONE_CODE_EMPTY") || tL_error5.text.contains("PHONE_CODE_INVALID")) {
                            loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error5.text.contains("PHONE_CODE_EXPIRED")) {
                            loginActivitySmsView.onBackPressed(true);
                            loginActivity2.setPage(0, true, null, true);
                            loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                        } else if (tL_error5.text.startsWith("FLOOD_WAIT")) {
                            loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                        } else if (tL_error5.code != -1000) {
                            String string4 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb4 = new StringBuilder();
                            zzlf.m(R.string.ErrorOccurred, "\n", sb4);
                            sb4.append(tL_error5.text);
                            loginActivity2.needShowAlert(string4, sb4.toString());
                        }
                    }
                }
                loginActivitySmsView.tryHideProgress(false);
                break;
            case 13:
                run$org$telegram$ui$LoginActivity$LoginPayView$$ExternalSyntheticLambda12();
                break;
            case 14:
                LoginActivity loginActivity3 = LoginActivity.this;
                loginActivity3.paid = true;
                ProductDetails productDetails = (ProductDetails) obj3;
                PollItemMenu$$ExternalSyntheticLambda14 pollItemMenu$$ExternalSyntheticLambda14 = (PollItemMenu$$ExternalSyntheticLambda14) obj2;
                BillingController.getInstance().addResultListener(productDetails.zzc, new ChatActivity$$ExternalSyntheticLambda211(pollItemMenu$$ExternalSyntheticLambda14, 8));
                BillingController.getInstance().setOnCanceled(new LoginActivity$LoginPayView$$ExternalSyntheticLambda2(pollItemMenu$$ExternalSyntheticLambda14, 1));
                BillingController billingController = BillingController.getInstance();
                Activity parentActivity = loginActivity3.getParentActivity();
                AccountInstance accountInstance3 = AccountInstance.getInstance(((BaseFragment) loginActivity3).currentAccount);
                zzcl zzclVar = new zzcl((char) 0, 16);
                zzclVar.setProductDetails(productDetails);
                billingController.launchBillingFlow(parentActivity, accountInstance3, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(zzclVar.build()));
                break;
            case 15:
                LoginActivity.PhoneView phoneView = (LoginActivity.PhoneView) obj4;
                phoneView.nextPressed = false;
                LoginActivity loginActivity4 = LoginActivity.this;
                loginActivity4.showDoneButton(false, true);
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj3;
                if (tL_error6 != null) {
                    loginActivity4.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error6.text);
                } else {
                    TL_account.Password password = (TL_account.Password) ((TLObject) obj2);
                    if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, true)) {
                        AlertsCreator.showUpdateAppAlert(loginActivity4.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                    } else {
                        Bundle bundle3 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle3.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                        bundle3.putString("phoneFormated", (String) obj);
                        loginActivity4.setPage(6, true, bundle3, false);
                    }
                }
                break;
            case 16:
                MessageStatisticActivity.ListAdapter.AnonymousClass1 anonymousClass1 = (MessageStatisticActivity.ListAdapter.AnonymousClass1) obj4;
                MessageStatisticActivity messageStatisticActivity = MessageStatisticActivity.this;
                ChartData chartData = (ChartData) obj3;
                if (chartData != null) {
                    messageStatisticActivity.childDataCache.put((String) obj2, chartData);
                }
                if (chartData != null) {
                    StatisticActivity.ZoomCancelable zoomCancelable = (StatisticActivity.ZoomCancelable) obj;
                    if (!zoomCancelable.canceled && (i = zoomCancelable.adapterPosition) >= 0) {
                        View viewFindViewByPosition = messageStatisticActivity.layoutManager.findViewByPosition(i);
                        if (viewFindViewByPosition instanceof StatisticActivity.BaseChartCell) {
                            anonymousClass1.data.childChartData = chartData;
                            StatisticActivity.BaseChartCell baseChartCell = (StatisticActivity.BaseChartCell) viewFindViewByPosition;
                            baseChartCell.chartView.legendSignatureView.showProgress(false, false);
                            baseChartCell.zoomChart(false);
                        }
                    }
                }
                anonymousClass1.zoomCanceled();
                break;
            case 17:
                NotificationsCustomSettingsActivity.SearchAdapter searchAdapter2 = (NotificationsCustomSettingsActivity.SearchAdapter) obj4;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = NotificationsCustomSettingsActivity.this;
                if (notificationsCustomSettingsActivity.searching) {
                    searchAdapter2.searchRunnable = null;
                    searchAdapter2.searchResult = (ArrayList) obj3;
                    searchAdapter2.searchResultNames = (ArrayList) obj2;
                    SearchAdapterHelper searchAdapterHelper = searchAdapter2.searchAdapterHelper;
                    searchAdapterHelper.mergeResults((ArrayList) obj, null);
                    if (notificationsCustomSettingsActivity.searching && !searchAdapterHelper.isSearchInProgress()) {
                        notificationsCustomSettingsActivity.emptyView.showTextView();
                    }
                    searchAdapter2.mObservable.notifyChanged();
                    break;
                }
                break;
            case 18:
                PaymentFormActivity paymentFormActivity = (PaymentFormActivity) obj4;
                paymentFormActivity.paymentStatusSent = true;
                paymentFormActivity.invoiceStatus = 1;
                paymentFormActivity.onCheckoutSuccess((INavigationLayout) obj3, (Activity) obj2);
                TLRPC.InputInvoice inputInvoice = paymentFormActivity.invoiceInput;
                boolean z2 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                boolean z3 = z2 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                boolean z4 = z2 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                if (!z2 && (paymentFormCallback2 = paymentFormActivity.paymentFormCallback) != null) {
                    paymentFormCallback2.onInvoiceStatusChanged(paymentFormActivity.invoiceStatus);
                }
                paymentFormActivity.goToNextStep();
                if (z2 && (paymentFormCallback = paymentFormActivity.paymentFormCallback) != null) {
                    paymentFormCallback.onInvoiceStatusChanged(paymentFormActivity.invoiceStatus);
                }
                TLRPC.InputInvoice inputInvoice2 = paymentFormActivity.invoiceInput;
                if (inputInvoice2 instanceof TLRPC.TL_inputInvoiceStars) {
                    TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose = ((TLRPC.TL_inputInvoiceStars) inputInvoice2).purpose;
                    if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) {
                        TLRPC.InputUser inputUser = ((TLRPC.TL_inputStorePaymentStarsGift) inputStorePaymentPurpose).user_id;
                        if (inputUser != null) {
                            peerDialogId = inputUser.user_id;
                        } else {
                            peerDialogId = 0;
                        }
                    } else if (!(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) || (inputPeer = ((TLRPC.TL_inputStorePaymentStarsGiveaway) inputStorePaymentPurpose).boost_peer) == null) {
                        peerDialogId = 0;
                    } else {
                        peerDialogId = DialogObject.getPeerDialogId(inputPeer);
                    }
                } else {
                    peerDialogId = 0;
                }
                if (peerDialogId > 0) {
                    forcedFirstName = UserObject.getForcedFirstName(paymentFormActivity.getMessagesController().getUser(Long.valueOf(peerDialogId)));
                } else {
                    forcedFirstName = "";
                    if (peerDialogId < 0 && (chat = paymentFormActivity.getMessagesController().getChat(Long.valueOf(-peerDialogId))) != null) {
                        forcedFirstName = chat.title;
                    }
                }
                TLRPC.InputInvoice inputInvoice3 = paymentFormActivity.invoiceInput;
                if (inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) {
                    TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose2 = ((TLRPC.TL_inputInvoiceStars) inputInvoice3).purpose;
                    if (inputStorePaymentPurpose2 instanceof TLRPC.TL_inputStorePaymentStarsGift) {
                        j = ((TLRPC.TL_inputStorePaymentStarsGift) inputStorePaymentPurpose2).stars;
                    } else if (inputStorePaymentPurpose2 instanceof TLRPC.TL_inputStorePaymentStarsTopup) {
                        j = ((TLRPC.TL_inputStorePaymentStarsTopup) inputStorePaymentPurpose2).stars;
                    } else if (inputStorePaymentPurpose2 instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) {
                        j = ((TLRPC.TL_inputStorePaymentStarsGiveaway) inputStorePaymentPurpose2).stars;
                    } else {
                        j = 0;
                    }
                } else {
                    j = 0;
                }
                int i8 = z2 ? (z3 || z4) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                if (z2) {
                    string3 = LocaleController.getString(z4 ? R.string.StarsGiveawaySentPopup : z3 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired);
                }
                String str5 = string3;
                if (!z2) {
                    string2 = LocaleController.formatString(R.string.PaymentInfoHint, paymentFormActivity.totalPrice[0], paymentFormActivity.currentItemName);
                } else if (z4) {
                    string2 = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) j);
                } else {
                    string2 = LocaleController.formatPluralStringComma(z3 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) j, forcedFirstName);
                }
                SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(string2);
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    BulletinFactory bulletinFactoryOf = BulletinFactory.of(safeLastFragment);
                    Bulletin bulletinCreateSimpleBulletin = (peerDialogId == 0 || str5 == null || z4) ? str5 != null ? bulletinFactoryOf.createSimpleBulletin(str5, spannableStringBuilderReplaceTags, i8) : bulletinFactoryOf.createSimpleBulletinWithIconSize(i8, 36, spannableStringBuilderReplaceTags) : bulletinFactoryOf.createSimpleBulletin(i8, str5, spannableStringBuilderReplaceTags, LocaleController.getString(R.string.ViewInChat), new PaymentFormActivity$$ExternalSyntheticLambda66(peerDialogId, i5));
                    bulletinCreateSimpleBulletin.hideAfterBottomSheet = false;
                    bulletinCreateSimpleBulletin.duration = 5000;
                    PassportActivity$$ExternalSyntheticLambda55 passportActivity$$ExternalSyntheticLambda55 = new PassportActivity$$ExternalSyntheticLambda55(paymentFormActivity, bulletinCreateSimpleBulletin, z3, (TLRPC.Message) obj, 4);
                    Bulletin.Layout layout = bulletinCreateSimpleBulletin.layout;
                    if (layout != null) {
                        layout.setOnClickListener(passportActivity$$ExternalSyntheticLambda55);
                    }
                    bulletinCreateSimpleBulletin.show(z4);
                    break;
                }
                break;
            case 19:
                ((PaymentFormActivity) obj4).lambda$checkPassword$70((TLObject) obj3, (TLRPC.TL_error) obj2, (TL_account.getTmpPassword) obj);
                break;
            case 20:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                ImageView imageView = photoViewer.textureImageView;
                if (imageView != null) {
                    imageView.setImageBitmap((Bitmap) obj3);
                    photoViewer.textureImageView.setVisibility(0);
                    SurfaceView surfaceView = photoViewer.videoSurfaceView;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    boolean[] zArr = (boolean[]) obj2;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        ((PhotoViewer$$ExternalSyntheticLambda103) obj).run();
                    }
                }
                break;
            case 21:
                String str6 = (String) obj;
                PhotoViewer photoViewer2 = (PhotoViewer) obj4;
                photoViewer2.getClass();
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(((MediaController.PhotoEntry) obj3).path);
                if (bitmapDecodeFile == null) {
                    AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda16(photoViewer2, i3));
                } else {
                    int[] iArr = new int[11];
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                    AnimatedFileNative.getVideoInfo(photoEntry.path, iArr, 0L);
                    int iMax = Math.max(iArr[1], photoEntry.width);
                    int iMax2 = Math.max(iArr[2], photoEntry.height);
                    if ((iArr[8] / 90) % 2 == 1) {
                        iMax2 = iMax;
                        iMax = iMax2;
                    }
                    float f = iMax;
                    float f2 = iMax2;
                    float fMax = Math.max(bitmapDecodeFile.getWidth() / f, bitmapDecodeFile.getHeight() / f2);
                    int i9 = (int) (f * fMax);
                    int i10 = (int) (f2 * fMax);
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i9, i10, config);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint(3);
                    canvas.translate(bitmapCreateBitmap.getWidth() / 2, bitmapCreateBitmap.getHeight() / 2);
                    float fMax2 = Math.max(bitmapCreateBitmap.getWidth() / bitmapDecodeFile.getWidth(), bitmapCreateBitmap.getHeight() / bitmapDecodeFile.getHeight());
                    canvas.scale(fMax2, fMax2);
                    canvas.drawBitmap(bitmapDecodeFile, (-bitmapDecodeFile.getWidth()) / 2, (-bitmapDecodeFile.getHeight()) / 2, paint);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(str6));
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                        fileOutputStream.close();
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), config);
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                        canvas2.translate(bitmapCreateBitmap2.getWidth() / 2.0f, bitmapCreateBitmap2.getHeight() / 2.0f);
                        float fMax3 = Math.max(bitmapCreateBitmap2.getWidth() / bitmapCreateBitmap.getWidth(), bitmapCreateBitmap2.getHeight() / bitmapCreateBitmap.getHeight());
                        canvas2.scale(fMax3, fMax3);
                        canvas2.drawBitmap(bitmapCreateBitmap, (-bitmapCreateBitmap.getWidth()) / 2.0f, (-bitmapCreateBitmap.getHeight()) / 2.0f, paint);
                        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda12(photoViewer2, photoEntry, str6, bitmapCreateBitmap2, 22));
                    } catch (Exception e2) {
                        FileLog.e(e2);
                        AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda16(photoViewer2, i2));
                        return;
                    }
                }
                break;
            case 22:
                PhotoViewer photoViewer3 = (PhotoViewer) obj4;
                photoViewer3.getClass();
                MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) obj3;
                if (photoEntry2.coverPath != null) {
                    try {
                        new File(photoEntry2.coverPath).delete();
                    } catch (Exception e3) {
                        FileLog.e(e3);
                    }
                }
                photoEntry2.coverSavedPosition = -1L;
                photoEntry2.coverPath = (String) obj2;
                photoEntry2.coverPhoto = null;
                photoEntry2.coverPhotoParentObject = null;
                photoViewer3.coverEditor.button.setLoading(false);
                PhotoViewer.PhotoViewerProvider photoViewerProvider = photoViewer3.placeProvider;
                if (photoViewerProvider != null) {
                    photoViewerProvider.updatePhotoAtIndex(photoViewer3.currentIndex);
                }
                PhotoViewer.AnonymousClass28 anonymousClass28 = photoViewer3.editCoverButton;
                if (anonymousClass28 != null) {
                    anonymousClass28.setImage((Bitmap) obj);
                }
                photoViewer3.switchToEditMode(0);
                CheckBox checkBox = photoViewer3.checkImageView;
                if (!checkBox.isChecked) {
                    checkBox.callOnClick();
                }
                break;
            case 23:
                PhotoViewer.AnonymousClass16 anonymousClass16 = (PhotoViewer.AnonymousClass16) obj4;
                anonymousClass16.getClass();
                TLObject tLObject3 = (TLObject) obj3;
                if (tLObject3 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject3;
                    PhotoViewer photoViewer4 = PhotoViewer.this;
                    MessagesController.getInstance(photoViewer4.currentAccount).putUsers(tL_photos_photo2.users, false);
                    UserConfig userConfig = (UserConfig) obj2;
                    TLRPC.User user3 = MessagesController.getInstance(photoViewer4.currentAccount).getUser(Long.valueOf(userConfig.clientUserId));
                    if (tL_photos_photo2.photo instanceof TLRPC.TL_photo) {
                        ArrayList arrayList4 = photoViewer4.avatarsArr;
                        int iIndexOf3 = arrayList4.indexOf((TLRPC.Photo) obj);
                        if (iIndexOf3 >= 0) {
                            arrayList4.set(iIndexOf3, tL_photos_photo2.photo);
                        }
                        if (user3 != null) {
                            user3.photo.photo_id = tL_photos_photo2.photo.id;
                            userConfig.setCurrentUser(user3);
                            userConfig.saveConfig(true);
                        }
                    }
                }
                break;
            case 24:
                ((PostSuggestionsEditActivity) obj4).lambda$processDone$2((TLRPC.TL_error) obj3, (TLObject) obj2, (TL_stars.updatePaidMessagesPrice) obj);
                break;
            case 25:
                ((PrivacyControlActivity) obj4).lambda$applyCurrentPrivacySettings$14((TLRPC.TL_error) obj3, (TLObject) obj2, (boolean[]) obj);
                break;
            case 26:
                AlertDialog alertDialog3 = (AlertDialog) obj3;
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj4;
                privacySettingsActivity.getClass();
                try {
                    alertDialog3.dismiss();
                } catch (Exception e4) {
                    FileLog.e(e4);
                }
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.deleteAccountUpdate = true;
                    privacySettingsActivity.getContactsController().setDeleteAccountTTL(((TL_account.setAccountTTL) obj).ttl.days);
                    privacySettingsActivity.listAdapter.mObservable.notifyChanged();
                }
                break;
            case 27:
                run$org$telegram$ui$ProfileActivity$$ExternalSyntheticLambda122();
                break;
            case 28:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                profileActivity.getClass();
                if (!(((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                    BulletinFactory.of(profileActivity).showForError(false, (TLRPC.TL_error) obj2);
                }
                if (profileActivity.botPermissionEmojiStatusReqId == ((int[]) obj)[0]) {
                    profileActivity.botPermissionEmojiStatusReqId = 0;
                }
                break;
            default:
                ProfileActivity profileActivity2 = (ProfileActivity) obj4;
                profileActivity2.getClass();
                TLObject tLObject4 = (TLObject) obj3;
                if (!(tLObject4 instanceof TL_fragment.TL_collectibleInfo)) {
                    BulletinFactory.showError((TLRPC.TL_error) obj);
                } else {
                    FragmentUsernameBottomSheet.open(profileActivity2.getParentActivity(), 0, ((TLRPC.TL_username) obj2).username, profileActivity2.userId != 0 ? profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.userId)) : profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.chatId)), (TL_fragment.TL_collectibleInfo) tLObject4, profileActivity2.resourcesProvider);
                }
                break;
        }
    }
}
