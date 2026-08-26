package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import androidx.collection.LongSparseArray;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.zzcl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ButtonSpan;
import org.telegram.ui.Components.JoinGroupAlert$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.Premium.boosts.BoostRepository$$ExternalSyntheticLambda45;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda11;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda7;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class UserInfoActivity$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;
    public final Object f$7;

    public UserInfoActivity$$ExternalSyntheticLambda7(MessagesStorage messagesStorage, LongSparseArray longSparseArray, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, HashMap map) {
        this.$r8$classId = 2;
        this.f$0 = messagesStorage;
        this.f$1 = longSparseArray;
        this.f$7 = arrayList;
        this.f$2 = arrayList2;
        this.f$5 = arrayList3;
        this.f$3 = arrayList4;
        this.f$4 = arrayList5;
        this.f$6 = map;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((UserInfoActivity) this.f$0).lambda$processDone$6((TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (TL_account.TL_birthday) this.f$3, (TLRPC.UserFull) this.f$4, (TLObject) this.f$5, (int[]) this.f$6, (ArrayList) this.f$7);
                break;
            case 1:
                AndroidUtilities.lambda$showProxyAlert$21((boolean[]) this.f$0, (ButtonSpan.TextViewButtons[]) this.f$1, (String) this.f$2, (String) this.f$5, (String) this.f$3, (String) this.f$4, (String) this.f$6, (Activity) this.f$7);
                break;
            case 2:
                ((MessagesStorage) this.f$0).lambda$loadUnreadMessages$76((LongSparseArray) this.f$1, (ArrayList) this.f$7, (ArrayList) this.f$2, (ArrayList) this.f$5, (ArrayList) this.f$3, (ArrayList) this.f$4, (HashMap) this.f$6);
                break;
            case 3:
                BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13 boostViaGiftsBottomSheet$$ExternalSyntheticLambda13 = (BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) this.f$0;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$1;
                if (tL_error != null) {
                    boostViaGiftsBottomSheet$$ExternalSyntheticLambda13.run(tL_error);
                } else if (((TLObject) this.f$2) != null) {
                    BillingController billingController = BillingController.getInstance();
                    List list = (List) this.f$5;
                    billingController.addResultListener(((ProductDetails) list.get(0)).zzc, new AvatarPreviewer$Layout$$ExternalSyntheticLambda2(2, (BillingResult) this.f$3, (BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) this.f$4));
                    BillingController.getInstance().setOnCanceled(new BoostRepository$$ExternalSyntheticLambda45(boostViaGiftsBottomSheet$$ExternalSyntheticLambda13, 0));
                    BillingController billingController2 = BillingController.getInstance();
                    Activity parentActivity = ((BaseFragment) this.f$6).getParentActivity();
                    AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                    zzcl zzclVar = new zzcl((char) 0, 16);
                    zzclVar.setProductDetails((ProductDetails) list.get(0));
                    billingController2.launchBillingFlow(parentActivity, accountInstance, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f$7, Collections.singletonList(zzclVar.build()));
                }
                break;
            case 4:
                Utilities.Callback callback = (Utilities.Callback) this.f$0;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f$1;
                if (tL_error2 != null) {
                    callback.run(tL_error2);
                } else if (((TLObject) this.f$2) != null) {
                    BillingController billingController3 = BillingController.getInstance();
                    List list2 = (List) this.f$5;
                    billingController3.addResultListener(((ProductDetails) list2.get(0)).zzc, new AvatarPreviewer$Layout$$ExternalSyntheticLambda2(1, (BillingResult) this.f$3, (Utilities.Callback) this.f$4));
                    BillingController.getInstance().setOnCanceled(new CacheControlActivity$$ExternalSyntheticLambda3(1, callback));
                    BillingController billingController4 = BillingController.getInstance();
                    Activity parentActivity2 = ((BaseFragment) this.f$6).getParentActivity();
                    AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    zzcl zzclVar2 = new zzcl((char) 0, 16);
                    zzclVar2.setProductDetails((ProductDetails) list2.get(0));
                    billingController4.launchBillingFlow(parentActivity2, accountInstance2, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f$7, Collections.singletonList(zzclVar2.build()));
                }
                break;
            case 5:
                TLObject tLObject = (TLObject) this.f$2;
                boolean z = tLObject instanceof TLRPC.TL_boolTrue;
                OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda18 = (OAuthSheet$$ExternalSyntheticLambda18) this.f$3;
                if (z) {
                    BillingController.getInstance().addResultListener(((ProductDetails) this.f$0).zzc, new AvatarPreviewer$Layout$$ExternalSyntheticLambda2(4, (BillingResult) this.f$5, oAuthSheet$$ExternalSyntheticLambda18));
                    BillingController.getInstance().setOnCanceled(new StarsController$$ExternalSyntheticLambda7(oAuthSheet$$ExternalSyntheticLambda18, 3));
                    BillingController billingController5 = BillingController.getInstance();
                    AccountInstance accountInstance3 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    zzcl zzclVar3 = new zzcl((char) 0, 16);
                    zzclVar3.setProductDetails((ProductDetails) ((List) this.f$7).get(0));
                    billingController5.launchBillingFlow((Activity) this.f$4, accountInstance3, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f$6, Collections.singletonList(zzclVar3.build()));
                } else if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                    Boolean bool = Boolean.FALSE;
                    TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f$1;
                    oAuthSheet$$ExternalSyntheticLambda18.run(bool, tL_error3 != null ? tL_error3.text : "SERVER_ERROR");
                } else {
                    oAuthSheet$$ExternalSyntheticLambda18.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                }
                break;
            case 6:
                TLObject tLObject2 = (TLObject) this.f$2;
                boolean z2 = tLObject2 instanceof TLRPC.TL_boolTrue;
                JoinGroupAlert$$ExternalSyntheticLambda3 joinGroupAlert$$ExternalSyntheticLambda3 = (JoinGroupAlert$$ExternalSyntheticLambda3) this.f$3;
                if (z2) {
                    BillingController.getInstance().addResultListener(((ProductDetails) this.f$0).zzc, new AvatarPreviewer$Layout$$ExternalSyntheticLambda2(3, (BillingResult) this.f$5, joinGroupAlert$$ExternalSyntheticLambda3));
                    BillingController.getInstance().setOnCanceled(new StarsController$$ExternalSyntheticLambda11(joinGroupAlert$$ExternalSyntheticLambda3, 0));
                    BillingController billingController6 = BillingController.getInstance();
                    AccountInstance accountInstance4 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    zzcl zzclVar4 = new zzcl((char) 0, 16);
                    zzclVar4.setProductDetails((ProductDetails) ((List) this.f$7).get(0));
                    billingController6.launchBillingFlow((Activity) this.f$4, accountInstance4, (TLRPC.TL_inputStorePaymentStarsGift) this.f$6, Collections.singletonList(zzclVar4.build()));
                } else if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                    Boolean bool2 = Boolean.FALSE;
                    TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f$1;
                    joinGroupAlert$$ExternalSyntheticLambda3.run(bool2, tL_error4 != null ? tL_error4.text : "SERVER_ERROR");
                } else {
                    joinGroupAlert$$ExternalSyntheticLambda3.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                }
                break;
            default:
                final String[] strArr = (String[]) this.f$0;
                boolean zIsEmpty = TextUtils.isEmpty(strArr[0].trim());
                final HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.f$1;
                final ButtonWithCounterView buttonWithCounterView = (ButtonWithCounterView) this.f$2;
                if (!zIsEmpty) {
                    final boolean[] zArr = (boolean[]) this.f$5;
                    final boolean z3 = zArr[0];
                    final String str = strArr[0];
                    final ImageView imageView = (ImageView) this.f$4;
                    final int[] iArr = (int[]) this.f$6;
                    final Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$7;
                    ((TodoItemMenu$$ExternalSyntheticLambda17) this.f$3).run(str, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            Bitmap bitmap = (Bitmap) obj;
                            Boolean bool3 = (Boolean) obj2;
                            if (TextUtils.equals(str, strArr[0])) {
                                boolean zBooleanValue = bool3.booleanValue();
                                ImageView imageView2 = imageView;
                                Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                                if (zBooleanValue) {
                                    imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_text_RedBold, resourcesProvider2), PorterDuff.Mode.SRC_IN));
                                    if (!z3) {
                                        int[] iArr2 = iArr;
                                        int i = -iArr2[0];
                                        iArr2[0] = i;
                                        AndroidUtilities.shakeViewSpring(imageView2, i);
                                    }
                                } else {
                                    imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider2), PorterDuff.Mode.SRC_IN));
                                }
                                if (bitmap != null) {
                                    imageView2.setImageBitmap(bitmap);
                                }
                                buttonWithCounterView.setEnabled(!bool3.booleanValue());
                                horizontalScrollView.setVisibility(bitmap != null ? 0 : 8);
                                zArr[0] = bool3.booleanValue();
                            }
                        }
                    });
                } else {
                    horizontalScrollView.setVisibility(8);
                    buttonWithCounterView.setEnabled(false);
                }
                break;
        }
    }

    public UserInfoActivity$$ExternalSyntheticLambda7(TLObject tLObject, ProductDetails productDetails, BillingResult billingResult, Utilities.Callback2 callback2, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, TLRPC.TL_error tL_error, int i) {
        this.$r8$classId = i;
        this.f$2 = tLObject;
        this.f$0 = productDetails;
        this.f$5 = billingResult;
        this.f$3 = callback2;
        this.f$4 = activity;
        this.f$6 = inputStorePaymentPurpose;
        this.f$7 = list;
        this.f$1 = tL_error;
    }

    public UserInfoActivity$$ExternalSyntheticLambda7(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, List list, BillingResult billingResult, Utilities.Callback callback2, BaseFragment baseFragment, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i) {
        this.$r8$classId = i;
        this.f$1 = tL_error;
        this.f$0 = callback;
        this.f$2 = tLObject;
        this.f$5 = list;
        this.f$3 = billingResult;
        this.f$4 = callback2;
        this.f$6 = baseFragment;
        this.f$7 = inputStorePaymentPurpose;
    }

    public UserInfoActivity$$ExternalSyntheticLambda7(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.$r8$classId = 0;
        this.f$0 = userInfoActivity;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
        this.f$3 = tL_birthday;
        this.f$4 = userFull;
        this.f$5 = tLObject2;
        this.f$6 = iArr;
        this.f$7 = arrayList;
    }

    public UserInfoActivity$$ExternalSyntheticLambda7(String[] strArr, HorizontalScrollView horizontalScrollView, ButtonWithCounterView buttonWithCounterView, boolean[] zArr, TodoItemMenu$$ExternalSyntheticLambda17 todoItemMenu$$ExternalSyntheticLambda17, ImageView imageView, Theme.ResourcesProvider resourcesProvider, int[] iArr) {
        this.$r8$classId = 7;
        this.f$0 = strArr;
        this.f$1 = horizontalScrollView;
        this.f$2 = buttonWithCounterView;
        this.f$5 = zArr;
        this.f$3 = todoItemMenu$$ExternalSyntheticLambda17;
        this.f$4 = imageView;
        this.f$7 = resourcesProvider;
        this.f$6 = iArr;
    }

    public UserInfoActivity$$ExternalSyntheticLambda7(boolean[] zArr, ButtonSpan.TextViewButtons[] textViewButtonsArr, String str, String str2, String str3, String str4, String str5, Activity activity) {
        this.$r8$classId = 1;
        this.f$0 = zArr;
        this.f$1 = textViewButtonsArr;
        this.f$2 = str;
        this.f$5 = str2;
        this.f$3 = str3;
        this.f$4 = str4;
        this.f$6 = str5;
        this.f$7 = activity;
    }
}
