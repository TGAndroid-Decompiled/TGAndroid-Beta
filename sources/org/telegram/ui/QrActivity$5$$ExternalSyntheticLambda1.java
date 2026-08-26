package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import java.util.regex.Pattern;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Premium.VideoScreenPreview;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.TextPaintImageReceiverSpan;
import org.telegram.ui.Components.ThanosEffect;
import org.telegram.ui.Components.TopicsTabsView;
import org.telegram.ui.Components.voip.VoIPPiPView;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.StealthModeAlert;

public final class QrActivity$5$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;

    public QrActivity$5$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void run() {
        BulletinFactory bulletinFactoryOf;
        switch (this.$r8$classId) {
            case 0:
                BulletinFactory bulletinFactoryGlobal = BulletinFactory.global();
                String string = LocaleController.getString(R.string.ScanQrCode);
                String string2 = LocaleController.getString(R.string.ErrorOccurred);
                bulletinFactoryGlobal.getClass();
                Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(bulletinFactoryGlobal.getContext(), bulletinFactoryGlobal.resourcesProvider);
                twoLineLottieLayout.hideImage();
                twoLineLottieLayout.titleTextView.setText(string);
                twoLineLottieLayout.subtitleTextView.setText(string2);
                bulletinFactoryGlobal.create(twoLineLottieLayout, 5000).show();
                break;
            case 1:
                float[] fArr = VideoScreenPreview.speedScaleVideoTimestamps;
                break;
            case 2:
                UserSelectorBottomSheet.open(0, null);
                break;
            case 3:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 4:
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                if (lastFragment != null) {
                    BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                    bottomSheetParams.transitionFromLeft = true;
                    lastFragment.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), bottomSheetParams);
                }
                break;
            case 5:
                int i = TextPaintImageReceiverSpan.$r8$clinit;
                break;
            case 6:
                SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                ThanosEffect.nothanos = Boolean.TRUE;
                editorEdit.putBoolean("nothanos", true).apply();
                break;
            case 7:
                SharedPreferences.Editor editorEdit2 = MessagesController.getGlobalMainSettings().edit();
                ThanosEffect.nothanos = Boolean.TRUE;
                editorEdit2.putBoolean("nothanos", true).apply();
                break;
            case 8:
                int i2 = TopicsTabsView.$r8$clinit;
                break;
            case 9:
                SavedMessagesController.openSavedMessages();
                break;
            case 10:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                break;
            case 11:
                VoIPPiPView.finish();
                break;
            case 12:
                StealthModeAlert.showStealthModeEnabledBulletin();
                break;
            case 13:
                BaseFragment lastFragment2 = LaunchActivity.getLastFragment();
                if (lastFragment2 != null) {
                    BaseFragment.BottomSheetParams bottomSheetParams2 = new BaseFragment.BottomSheetParams();
                    bottomSheetParams2.transitionFromLeft = true;
                    lastFragment2.showAsSheet(new PremiumPreviewFragment(0, "gifts"), bottomSheetParams2);
                    break;
                }
                break;
            case 14:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 15:
                GroupCallActivity groupCallActivity = GroupCallActivity.groupCallInstance;
                if (groupCallActivity != null) {
                    groupCallActivity.show();
                }
                break;
            case 16:
                Pattern pattern = LaunchActivity.PREFIX_T_ME_PATTERN;
                break;
            case 17:
                Pattern pattern2 = LaunchActivity.PREFIX_T_ME_PATTERN;
                break;
            case 18:
                Pattern pattern3 = LaunchActivity.PREFIX_T_ME_PATTERN;
                ApplicationLoader.mainInterfacePausedStageQueue = false;
                ApplicationLoader.mainInterfacePausedStageQueueTime = System.currentTimeMillis();
                break;
            case 19:
                CallReceiver.checkLastReceivedCall();
                break;
            case 20:
                CallReceiver.checkLastReceivedCall();
                break;
            case 21:
                BulletinFactory bulletinFactoryGlobal2 = BulletinFactory.global();
                String string3 = LocaleController.getString(R.string.ScanQrCode);
                String string4 = LocaleController.getString(R.string.ErrorOccurred);
                bulletinFactoryGlobal2.getClass();
                Bulletin.TwoLineLottieLayout twoLineLottieLayout2 = new Bulletin.TwoLineLottieLayout(bulletinFactoryGlobal2.getContext(), bulletinFactoryGlobal2.resourcesProvider);
                twoLineLottieLayout2.hideImage();
                twoLineLottieLayout2.titleTextView.setText(string3);
                twoLineLottieLayout2.subtitleTextView.setText(string4);
                bulletinFactoryGlobal2.create(twoLineLottieLayout2, 5000).show();
                break;
            case 22:
                BulletinFactory bulletinFactoryGlobal3 = BulletinFactory.global();
                String string5 = LocaleController.getString(R.string.ScanQrCode);
                String string6 = LocaleController.getString(R.string.ErrorOccurred);
                bulletinFactoryGlobal3.getClass();
                Bulletin.TwoLineLottieLayout twoLineLottieLayout3 = new Bulletin.TwoLineLottieLayout(bulletinFactoryGlobal3.getContext(), bulletinFactoryGlobal3.resourcesProvider);
                twoLineLottieLayout3.hideImage();
                twoLineLottieLayout3.titleTextView.setText(string5);
                twoLineLottieLayout3.subtitleTextView.setText(string6);
                bulletinFactoryGlobal3.create(twoLineLottieLayout3, 5000).show();
                break;
            case 23:
                Drawable[] drawableArr = PhotoViewer.progressDrawables;
                break;
            case 24:
                BulletinFactory bulletinFactoryGlobal4 = BulletinFactory.global();
                String string7 = LocaleController.getString(R.string.ScanQrCode);
                String string8 = LocaleController.getString(R.string.ErrorOccurred);
                bulletinFactoryGlobal4.getClass();
                Bulletin.TwoLineLottieLayout twoLineLottieLayout4 = new Bulletin.TwoLineLottieLayout(bulletinFactoryGlobal4.getContext(), bulletinFactoryGlobal4.resourcesProvider);
                twoLineLottieLayout4.hideImage();
                twoLineLottieLayout4.titleTextView.setText(string7);
                twoLineLottieLayout4.subtitleTextView.setText(string8);
                bulletinFactoryGlobal4.create(twoLineLottieLayout4, 5000).show();
                break;
            case 25:
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null && (bulletinFactoryOf = BulletinFactory.of(safeLastFragment)) != null) {
                    Bulletin bulletinCreateSimpleBulletin = bulletinFactoryOf.createSimpleBulletin(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                    bulletinCreateSimpleBulletin.duration = 5000;
                    bulletinCreateSimpleBulletin.show();
                }
                break;
            case 26:
                int i3 = StakedDiceSheet.$r8$clinit;
                break;
            case 27:
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                break;
            case 28:
                StarsController[][] starsControllerArr = StarsController.Instance;
                break;
            default:
                BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment2 != null) {
                    safeLastFragment2.presentFragment(new StarsIntroActivity());
                    break;
                }
                break;
        }
    }

    public QrActivity$5$$ExternalSyntheticLambda1(TLRPC.TL_error tL_error) {
        this.$r8$classId = 17;
    }
}
