package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.community.CommunityEditActivity;

public final class DialogsActivity$$ExternalSyntheticLambda14 implements Runnable {
    public final int $r8$classId;
    public final DialogsActivity f$0;

    public DialogsActivity$$ExternalSyntheticLambda14(DialogsActivity dialogsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsActivity;
    }

    @Override
    public final void run() {
        boolean zEquals;
        Theme.ThemeInfo themeInfo;
        ActionBarMenuItem actionBarMenuItem;
        BulletinFactory bulletinFactoryOf;
        DialogsActivity$$ExternalSyntheticLambda14 dialogsActivity$$ExternalSyntheticLambda14;
        int i;
        String string;
        TopicsFragment topicsFragment = null;
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$21$2();
                break;
            case 1:
                Bulletin bulletin = Bulletin.visibleBulletin;
                if (bulletin != null) {
                    bulletin.hide();
                }
                this.f$0.presentFragment(new SessionsActivity(0));
                break;
            case 2:
                this.f$0.viewPages[0].dialogsAdapter.notifyDataSetChanged();
                break;
            case 3:
                DialogsActivity dialogsActivity = this.f$0;
                dialogsActivity.getClass();
                if (LaunchActivity.getLastFragment() != null) {
                    dialogsActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                }
                break;
            case 4:
                DialogsActivity dialogsActivity2 = this.f$0;
                UndoView undoView = dialogsActivity2.getUndoView();
                if (undoView != null) {
                    undoView.showWithAction(0L, 15, (Object) null, (Object) null, (Runnable) null, new DialogsActivity$$ExternalSyntheticLambda14(dialogsActivity2, 27));
                }
                break;
            case 5:
                DialogsActivity dialogsActivity3 = this.f$0;
                dialogsActivity3.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j <= 604800000) {
                    j = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j).putLong("cache_hint_period", j).apply();
                dialogsActivity3.updateDialogsHint();
                break;
            case 6:
                this.f$0.lambda$openSetAvatar$155();
                break;
            case 7:
                DialogsActivity dialogsActivity4 = this.f$0;
                dialogsActivity4.getClass();
                dialogsActivity4.presentFragment(new UserInfoActivity());
                break;
            case 8:
                DialogsActivity dialogsActivity5 = this.f$0;
                dialogsActivity5.setDialogsListFrozen(false, true);
                if (dialogsActivity5.viewPages != null) {
                    int i2 = 0;
                    while (true) {
                        DialogsActivity.ViewPage[] viewPageArr = dialogsActivity5.viewPages;
                        if (i2 < viewPageArr.length) {
                            if (viewPageArr[i2].getVisibility() == 0) {
                                DialogsActivity.ViewPage viewPage = dialogsActivity5.viewPages[i2];
                                if (!viewPage.dialogsAdapter.dialogsListFrozen) {
                                    viewPage.updateList(false);
                                }
                            }
                            i2++;
                        }
                        break;
                    }
                }
                break;
            case 9:
                DialogsActivity dialogsActivity6 = this.f$0;
                dialogsActivity6.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", dialogsActivity6.communityId);
                dialogsActivity6.presentFragment(new CommunityEditActivity(bundle));
                break;
            case 10:
                DialogsActivity dialogsActivity7 = this.f$0;
                dialogsActivity7.getClass();
                dialogsActivity7.presentFragment(new SettingsActivity(null));
                break;
            case 11:
                DialogsActivity dialogsActivity8 = this.f$0;
                if (!dialogsActivity8.community.collapsed_in_dialogs) {
                    dialogsActivity8.getMessagesController().toggleCommunityCollapsedInDialogs(dialogsActivity8.communityId, true);
                    dialogsActivity8.finishFragment();
                }
                break;
            case 12:
                DialogsActivity dialogsActivity9 = this.f$0;
                if (dialogsActivity9.community.collapsed_in_dialogs) {
                    dialogsActivity9.getMessagesController().toggleCommunityCollapsedInDialogs(dialogsActivity9.communityId, false);
                    dialogsActivity9.finishFragment();
                }
                break;
            case 13:
                DialogsActivity dialogsActivity10 = this.f$0;
                dialogsActivity10.getClass();
                dialogsActivity10.presentFragment(new ArchiveSettingsActivity());
                break;
            case 14:
                this.f$0.showArchiveHelp();
                break;
            case 15:
                DialogsActivity dialogsActivity11 = this.f$0;
                dialogsActivity11.getClass();
                if (!DialogsActivity.switchingTheme) {
                    DialogsActivity.switchingTheme = true;
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string2 = sharedPreferences.getString("lastDayTheme", "Blue");
                    HashMap map = Theme.themesDict;
                    if (((Theme.ThemeInfo) map.get(string2)) == null || ((Theme.ThemeInfo) map.get(string2)).isDark()) {
                        string2 = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string3 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (((Theme.ThemeInfo) map.get(string3)) == null || !((Theme.ThemeInfo) map.get(string3)).isDark()) {
                        string3 = "Dark Blue";
                    }
                    Theme.ThemeInfo themeInfo2 = Theme.currentTheme;
                    if (string2.equals(string3)) {
                        if (themeInfo2.isDark() || string2.equals("Dark Blue") || string2.equals("Night")) {
                            str2 = string3;
                        }
                        zEquals = str.equals(themeInfo2.getKey());
                        if (zEquals) {
                            themeInfo = (Theme.ThemeInfo) map.get(str2);
                        } else {
                            themeInfo = (Theme.ThemeInfo) map.get(str);
                        }
                        actionBarMenuItem = dialogsActivity11.optionsItem;
                        if (actionBarMenuItem != null) {
                            int[] iArr = {(dialogsActivity11.optionsItem.getIconView().getMeasuredWidth() / 2) + i, (dialogsActivity11.optionsItem.getIconView().getMeasuredHeight() / 2) + i};
                            actionBarMenuItem.getLocationInWindow(iArr);
                            int i3 = iArr[0];
                            int i4 = iArr[1];
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, themeInfo, Boolean.FALSE, iArr, -1, Boolean.valueOf(zEquals), null, null, null, Boolean.TRUE);
                        }
                        bulletinFactoryOf = BulletinFactory.of(dialogsActivity11);
                        dialogsActivity$$ExternalSyntheticLambda14 = new DialogsActivity$$ExternalSyntheticLambda14(dialogsActivity11, 28);
                        i = Theme.selectedAutoNightType;
                        if (i != 0) {
                            if (bulletinFactoryOf != null) {
                                try {
                                    int i5 = R.raw.auto_night_off;
                                    if (i == 3) {
                                        string = LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff);
                                    } else {
                                        string = LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff);
                                    }
                                    bulletinFactoryOf.createSimpleBulletin(i5, string, LocaleController.getString("Settings", R.string.Settings), 5000, false, dialogsActivity$$ExternalSyntheticLambda14).show();
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            Theme.selectedAutoNightType = 0;
                            Theme.saveAutoNightThemeConfig();
                            Theme.cancelAutoNightThemeCallbacks();
                        }
                    } else {
                        str2 = string3;
                    }
                    str = string2;
                    zEquals = str.equals(themeInfo2.getKey());
                    if (zEquals) {
                        themeInfo = (Theme.ThemeInfo) map.get(str2);
                    } else {
                        themeInfo = (Theme.ThemeInfo) map.get(str);
                    }
                    actionBarMenuItem = dialogsActivity11.optionsItem;
                    if (actionBarMenuItem != null) {
                        int[] iArr2 = {(dialogsActivity11.optionsItem.getIconView().getMeasuredWidth() / 2) + i3, (dialogsActivity11.optionsItem.getIconView().getMeasuredHeight() / 2) + i4};
                        actionBarMenuItem.getLocationInWindow(iArr2);
                        int i6 = iArr2[0];
                        int i7 = iArr2[1];
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, themeInfo, Boolean.FALSE, iArr2, -1, Boolean.valueOf(zEquals), null, null, null, Boolean.TRUE);
                    }
                    bulletinFactoryOf = BulletinFactory.of(dialogsActivity11);
                    dialogsActivity$$ExternalSyntheticLambda14 = new DialogsActivity$$ExternalSyntheticLambda14(dialogsActivity11, 28);
                    i = Theme.selectedAutoNightType;
                    if (i != 0) {
                        if (bulletinFactoryOf != null) {
                            int i8 = R.raw.auto_night_off;
                            if (i == 3) {
                                string = LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff);
                            } else {
                                string = LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff);
                            }
                            bulletinFactoryOf.createSimpleBulletin(i8, string, LocaleController.getString("Settings", R.string.Settings), 5000, false, dialogsActivity$$ExternalSyntheticLambda14).show();
                        }
                        Theme.selectedAutoNightType = 0;
                        Theme.saveAutoNightThemeConfig();
                        Theme.cancelAutoNightThemeCallbacks();
                    }
                    break;
                }
                break;
            case 16:
                DialogsActivity dialogsActivity12 = this.f$0;
                dialogsActivity12.getClass();
                dialogsActivity12.presentFragment(new GroupCreateActivity(new Bundle()));
                break;
            case 17:
                this.f$0.lambda$showItemOptions$167();
                break;
            case 18:
                this.f$0.blur3_InvalidateBlur$4();
                break;
            case 19:
                this.f$0.lambda$updateDialogsHint$57();
                break;
            case 20:
                this.f$0.updateDialogsHint();
                break;
            case 21:
                DialogsActivity dialogsActivity13 = this.f$0;
                dialogsActivity13.getClass();
                BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                bottomSheetParams.transitionFromLeft = true;
                dialogsActivity13.showAsSheet(new PrivacyControlActivity(11, false), bottomSheetParams);
                break;
            case 22:
                this.f$0.fragmentView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                break;
            case 23:
                this.f$0.lambda$updateDialogsHint$55();
                break;
            case 24:
                DialogsActivity dialogsActivity14 = this.f$0;
                dialogsActivity14.viewPages[0].listView.requestLayout();
                DialogsActivity.AnonymousClass27 anonymousClass27 = dialogsActivity14.rightSlidingDialogContainer;
                if (anonymousClass27 != null && (anonymousClass27.getFragment() instanceof TopicsFragment)) {
                    topicsFragment = (TopicsFragment) dialogsActivity14.rightSlidingDialogContainer.getFragment();
                }
                if (topicsFragment != null) {
                    topicsFragment.checkUi_listViewPadding$5();
                }
                dialogsActivity14.checkUi_searchPagesPaddings(false);
                dialogsActivity14.updateContextViewPosition();
                DialogsActivity.AnonymousClass47 anonymousClass47 = dialogsActivity14.searchViewPager;
                if (anonymousClass47 != null) {
                    anonymousClass47.invalidate();
                }
                break;
            case 25:
                this.f$0.setDialogsListFrozen(false, true);
                break;
            case 26:
                DialogsActivity dialogsActivity15 = this.f$0;
                dialogsActivity15.getClass();
                dialogsActivity15.presentFragment(new ArchiveSettingsActivity());
                break;
            case 27:
                DialogsActivity dialogsActivity16 = this.f$0;
                dialogsActivity16.getClass();
                dialogsActivity16.presentFragment(new FiltersSetupActivity());
                break;
            case 28:
                DialogsActivity dialogsActivity17 = this.f$0;
                dialogsActivity17.getClass();
                dialogsActivity17.presentFragment(new ThemeActivity(1));
                break;
            default:
                DialogsActivity dialogsActivity18 = this.f$0;
                dialogsActivity18.getMessagesStorage().clearLocalDatabase();
                Toast.makeText(dialogsActivity18.getParentActivity(), LocaleController.getString(R.string.DebugClearLocalDatabaseSuccess), 0).show();
                break;
        }
    }
}
