package org.telegram.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.PeerStoriesView$38$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.Stories.StoryViewer;

public final class PassportActivity$$ExternalSyntheticLambda55 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final boolean f$3;

    public PassportActivity$$ExternalSyntheticLambda55(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = z;
        this.f$2 = obj3;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        ActionBarPopupWindow actionBarPopupWindow;
        switch (this.$r8$classId) {
            case 0:
                final PassportActivity passportActivity = (PassportActivity) this.f$0;
                final ArrayList arrayList = (ArrayList) this.f$1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            tL_secureRequiredType = (TLRPC.TL_secureRequiredType) arrayList.get(i);
                            if (passportActivity.getValueByType(tL_secureRequiredType, false) == null && size != 1) {
                                i++;
                            }
                        } else {
                            tL_secureRequiredType = null;
                        }
                    }
                } else {
                    tL_secureRequiredType = null;
                }
                final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) this.f$2;
                TLRPC.SecureValueType secureValueType = tL_secureRequiredType2.type;
                boolean z = secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails;
                final boolean z2 = this.f$3;
                if (!z && !(secureValueType instanceof TLRPC.TL_secureValueTypeAddress)) {
                    boolean z3 = secureValueType instanceof TLRPC.TL_secureValueTypePhone;
                    if ((z3 || (secureValueType instanceof TLRPC.TL_secureValueTypeEmail)) && passportActivity.getValueByType(tL_secureRequiredType2, false) != null) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(passportActivity.getParentActivity(), 0, null);
                        builder.setPositiveButton(LocaleController.getString(R.string.OK), new LoginActivity$$ExternalSyntheticLambda31(passportActivity, tL_secureRequiredType2, z2, 12));
                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                        String string = LocaleController.getString(R.string.AppName);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.title = string;
                        alertDialog.message = LocaleController.getString(z3 ? R.string.PassportDeletePhoneAlert : R.string.PassportDeleteEmailAlert);
                        passportActivity.showDialog(alertDialog);
                    }
                } else if (tL_secureRequiredType == null && arrayList != null && !arrayList.isEmpty()) {
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(passportActivity.getParentActivity(), 0, null);
                    builder2.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
                    TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType2.type;
                    boolean z4 = secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails;
                    AlertDialog alertDialog2 = builder2.alertDialog;
                    if (z4) {
                        alertDialog2.title = LocaleController.getString(R.string.PassportIdentityDocument);
                    } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                        alertDialog2.title = LocaleController.getString(R.string.PassportAddress);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        TLRPC.SecureValueType secureValueType3 = ((TLRPC.TL_secureRequiredType) arrayList.get(i2)).type;
                        if (secureValueType3 instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                            arrayList2.add(LocaleController.getString(R.string.PassportAddLicence));
                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassport) {
                            arrayList2.add(LocaleController.getString(R.string.PassportAddPassport));
                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                            arrayList2.add(LocaleController.getString(R.string.PassportAddInternalPassport));
                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                            arrayList2.add(LocaleController.getString(R.string.PassportAddCard));
                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                            arrayList2.add(LocaleController.getString(R.string.PassportAddBill));
                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                            arrayList2.add(LocaleController.getString(R.string.PassportAddBank));
                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                            arrayList2.add(LocaleController.getString(R.string.PassportAddAgreement));
                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                            arrayList2.add(LocaleController.getString(R.string.PassportAddTemporaryRegistration));
                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                            arrayList2.add(LocaleController.getString(R.string.PassportAddPassportRegistration));
                        }
                    }
                    builder2.setItems((CharSequence[]) arrayList2.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            PassportActivity passportActivity2 = passportActivity;
                            passportActivity2.getClass();
                            ArrayList arrayList3 = arrayList;
                            passportActivity2.openTypeActivity(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList3.get(i3), arrayList3, z2);
                        }
                    });
                    passportActivity.showDialog(alertDialog2);
                }
                passportActivity.openTypeActivity(tL_secureRequiredType2, tL_secureRequiredType, arrayList, z2);
                break;
            case 1:
                PremiumFeatureBottomSheet premiumFeatureBottomSheet = (PremiumFeatureBottomSheet) this.f$0;
                premiumFeatureBottomSheet.getClass();
                BaseFragment baseFragment = (BaseFragment) this.f$1;
                if (baseFragment instanceof ChatActivity) {
                    ChatActivity chatActivity = (ChatActivity) baseFragment;
                    chatActivity.closeMenu(true);
                    ChatActivity.AnonymousClass78 anonymousClass78 = chatActivity.chatAttachAlert;
                    if (anonymousClass78 != null) {
                        anonymousClass78.dismiss(true);
                    }
                }
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                int i3 = 0;
                while (i3 < 2) {
                    BaseFragment baseFragment2 = i3 == 0 ? baseFragment : lastFragment;
                    if (baseFragment2 != null && baseFragment2.getLastStoryViewer() != null) {
                        StoryViewer lastStoryViewer = baseFragment2.getLastStoryViewer();
                        Dialog dialog = lastStoryViewer.currentDialog;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        BaseFragment.AttachedSheet attachedSheet = lastStoryViewer.currentSheet;
                        if (attachedSheet != null) {
                            attachedSheet.lambda$showGiftOfferSheet$15();
                        }
                        PeerStoriesView currentPeerView = lastStoryViewer.getCurrentPeerView();
                        if (currentPeerView != null) {
                            ReactionsContainerLayout reactionsContainerLayout = currentPeerView.reactionsContainerLayout;
                            if (reactionsContainerLayout != null && reactionsContainerLayout.getReactionsWindow() != null) {
                                currentPeerView.reactionsContainerLayout.getReactionsWindow().dismiss();
                            }
                            PeerStoriesView.AnonymousClass27 anonymousClass27 = currentPeerView.shareAlert;
                            if (anonymousClass27 != null) {
                                anonymousClass27.lambda$showGiftOfferSheet$15();
                            }
                            currentPeerView.needEnterText();
                        }
                    }
                    if (baseFragment2 != null && baseFragment2.getVisibleDialog() != null) {
                        baseFragment2.getVisibleDialog().dismiss();
                    }
                    i3++;
                }
                boolean z5 = this.f$3;
                PremiumPreviewFragment.PremiumFeatureData premiumFeatureData = (PremiumPreviewFragment.PremiumFeatureData) this.f$2;
                if (z5 || premiumFeatureBottomSheet.forceAbout) {
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, PremiumPreviewFragment.featureTypeToServerString(premiumFeatureData.type));
                    if (baseFragment instanceof ThemePreviewActivity) {
                        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                        bottomSheetParams.transitionFromLeft = true;
                        baseFragment.showAsSheet(premiumPreviewFragment, bottomSheetParams);
                    } else if (baseFragment != null) {
                        baseFragment.presentFragment(premiumPreviewFragment);
                    } else {
                        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                        if (safeLastFragment != null) {
                            safeLastFragment.presentFragment(premiumPreviewFragment);
                        }
                    }
                } else {
                    PremiumPreviewFragment.buyPremium(baseFragment, premiumFeatureBottomSheet.selectedTier, PremiumPreviewFragment.featureTypeToServerString(premiumFeatureData.type), null);
                }
                premiumFeatureBottomSheet.lambda$showGiftOfferSheet$15();
                break;
            case 2:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f$0;
                dataSettingsActivity.getClass();
                String str = SharedConfig.storageCacheDir;
                String str2 = (String) this.f$1;
                if (!TextUtils.equals(str, str2)) {
                    AlertDialog.Builder builder3 = (AlertDialog.Builder) this.f$2;
                    if (this.f$3) {
                        SharedConfig.storageCacheDir = str2;
                        SharedConfig.saveConfig();
                        SharedConfig.readOnlyStorageDirAlertShowed = false;
                        dataSettingsActivity.rebind$1(dataSettingsActivity.storageNumRow);
                        ImageLoader.getInstance().checkMediaPaths(new DataSettingsActivity$$ExternalSyntheticLambda1(dataSettingsActivity, 2));
                        builder3.alertDialog.dismissRunnable.run();
                    } else {
                        AlertDialog.Builder builder4 = new AlertDialog.Builder(dataSettingsActivity.getParentActivity(), 0, null);
                        String string2 = LocaleController.getString(R.string.DecreaseSpeed);
                        AlertDialog alertDialog3 = builder4.alertDialog;
                        alertDialog3.title = string2;
                        alertDialog3.message = LocaleController.getString(R.string.SdCardAlert);
                        builder4.setPositiveButton(LocaleController.getString(R.string.Proceed), new VoIPFragment$$ExternalSyntheticLambda42(dataSettingsActivity, str2, builder3, 9));
                        ArticleViewer.IBlock.CC.m(R.string.Back, builder4, (AlertDialog.OnButtonClickListener) null);
                    }
                }
                break;
            case 3:
                ((PaymentFormActivity) this.f$0).lambda$sendData$59((Bulletin) this.f$1, this.f$3, (TLRPC.Message[]) this.f$2);
                break;
            case 4:
                ((PaymentFormActivity) this.f$0).lambda$sendData$64((Bulletin) this.f$1, this.f$3, (TLRPC.Message) this.f$2);
                break;
            default:
                PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) this.f$0;
                anonymousClass8.getClass();
                ArrayList arrayList3 = new ArrayList();
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f$1;
                arrayList3.add(storyItem);
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = anonymousClass8.this$0;
                StoriesController storiesController = MessagesController.getInstance(anonymousClass1.currentAccount).getStoriesController();
                long j = anonymousClass1.dialogId;
                DarkThemeResourceProvider darkThemeResourceProvider = (DarkThemeResourceProvider) this.f$2;
                boolean z6 = this.f$3;
                storiesController.updateStoriesPinned(j, arrayList3, z6, new PeerStoriesView$38$$ExternalSyntheticLambda1(anonymousClass8, storyItem, z6, darkThemeResourceProvider));
                PeerStoriesView.AnonymousClass8 anonymousClass9 = anonymousClass1.popupMenu;
                if (anonymousClass9 != null && (actionBarPopupWindow = anonymousClass9.popupWindow) != null) {
                    actionBarPopupWindow.dismiss(true);
                    break;
                }
                break;
        }
    }

    public PassportActivity$$ExternalSyntheticLambda55(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, PassportActivity passportActivity, boolean z) {
        this.$r8$classId = 0;
        this.f$0 = passportActivity;
        this.f$1 = arrayList;
        this.f$2 = tL_secureRequiredType;
        this.f$3 = z;
    }
}
