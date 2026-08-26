package org.telegram.ui;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.GroupCallPip;
import org.telegram.ui.Components.StickersAlert;

public final class LaunchActivity$$ExternalSyntheticLambda20 implements Runnable {
    public final int $r8$classId;
    public final LaunchActivity f$0;

    public LaunchActivity$$ExternalSyntheticLambda20(LaunchActivity launchActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = launchActivity;
    }

    @Override
    public final void run() {
        BaseFragment baseFragment;
        switch (this.$r8$classId) {
            case 0:
                LaunchActivity launchActivity = this.f$0;
                if (launchActivity.isNavigationBarColorFrozen) {
                    launchActivity.isNavigationBarColorFrozen = false;
                    launchActivity.checkSystemBarColors(false, false, true);
                }
                break;
            case 1:
                LaunchActivity launchActivity2 = this.f$0;
                launchActivity2.getClass();
                Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(launchActivity2, null);
                lottieLayout.setAnimation(R.raw.email_check_inbox, 32, 32, new String[0]);
                lottieLayout.textView.setText(launchActivity2.getString(R.string.YourLoginEmailChangedSuccess));
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                if (lastFragment != null) {
                    Bulletin.make(lastFragment, lottieLayout, 1500).show();
                    try {
                        lastFragment.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 2:
                this.f$0.checkSystemBarColors(false, true, false);
                if (LaunchActivity.getLastFragment() != null && LaunchActivity.getLastFragment().getLastStoryViewer() != null) {
                    LaunchActivity.getLastFragment().getLastStoryViewer().updatePlayingMode();
                    break;
                }
                break;
            case 3:
                LaunchActivity launchActivity3 = this.f$0;
                if (!launchActivity3.actionBarLayout.getFragmentStack().isEmpty()) {
                    launchActivity3.actionBarLayout.getFragmentStack().get(0).showDialog(new StickersAlert(launchActivity3, launchActivity3.importingStickersSoftware, launchActivity3.importingStickers, launchActivity3.importingStickersEmoji));
                }
                break;
            case 4:
                LaunchActivity launchActivity4 = this.f$0;
                launchActivity4.getClass();
                GroupCallPip.forceRemoved = false;
                GroupCallPip.updateVisibility(launchActivity4);
                break;
            case 5:
                LaunchActivity launchActivity5 = this.f$0;
                if (!launchActivity5.checkFreeDiscSpaceShown) {
                    try {
                        AlertDialog alertDialogCreateFreeSpaceDialog = AlertsCreator.createFreeSpaceDialog(launchActivity5);
                        alertDialogCreateFreeSpaceDialog.setOnDismissListener(new LaunchActivity$$ExternalSyntheticLambda11(launchActivity5, 2));
                        launchActivity5.checkFreeDiscSpaceShown = true;
                        alertDialogCreateFreeSpaceDialog.show();
                    } catch (Throwable unused2) {
                        return;
                    }
                    break;
                }
                break;
            case 6:
                LaunchActivity launchActivity6 = this.f$0;
                if (launchActivity6.loadingTheme != null) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), SurfaceContainer$$ExternalSyntheticOutline0.m(new StringBuilder("remote"), launchActivity6.loadingTheme.id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity6.loadingTheme;
                    Theme.ThemeInfo themeInfoApplyThemeFile = Theme.applyThemeFile(file, tL_theme.title, tL_theme, true);
                    if (themeInfoApplyThemeFile != null) {
                        launchActivity6.presentFragment(new ThemePreviewActivity(themeInfoApplyThemeFile, true, 0, false, false));
                    }
                    launchActivity6.onThemeLoadFinish();
                    break;
                }
                break;
            case 7:
                LaunchActivity launchActivity7 = this.f$0;
                launchActivity7.getClass();
                launchActivity7.presentFragment(new LiteModeSettingsActivity());
                break;
            case 8:
                this.f$0.tlErrorAlertDialog = null;
                break;
            case 9:
                this.f$0.memoryLeakErrorAlertDialog = null;
                break;
            default:
                LaunchActivity launchActivity8 = this.f$0;
                launchActivity8.getClass();
                if (AndroidUtilities.isTablet()) {
                    ArrayList arrayList = launchActivity8.layerFragmentsStack;
                    if (arrayList.isEmpty()) {
                        baseFragment = null;
                    } else {
                        baseFragment = (BaseFragment) zziq.m(1, arrayList);
                    }
                } else {
                    ArrayList arrayList2 = launchActivity8.mainFragmentsStack;
                    if (arrayList2.isEmpty()) {
                        baseFragment = null;
                    } else {
                        baseFragment = (BaseFragment) zziq.m(1, arrayList2);
                    }
                }
                if (!(baseFragment instanceof ProxyListActivity) && !(baseFragment instanceof ProxySettingsActivity)) {
                    launchActivity8.presentFragment(new ProxyListActivity());
                    break;
                }
                break;
        }
    }
}
