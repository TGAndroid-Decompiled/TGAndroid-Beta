package org.telegram.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.core.content.FileProvider;
import com.google.android.gms.internal.mlkit_language_id_common.zzjj;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.WallpaperUpdater;

public final class DialogsActivity$$ExternalSyntheticLambda124 implements DialogInterface.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public DialogsActivity$$ExternalSyntheticLambda124(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) throws Throwable {
        DialogCell dialogCell;
        switch (this.$r8$classId) {
            case 0:
                DialogsActivity dialogsActivity = (DialogsActivity) this.f$0;
                if (i == 0) {
                    dialogsActivity.getMessagesStorage().readAllDialogs(1);
                } else if (i != 1) {
                    dialogsActivity.getClass();
                } else if (dialogsActivity.viewPages != null) {
                    int i2 = 0;
                    while (true) {
                        DialogsActivity.ViewPage[] viewPageArr = dialogsActivity.viewPages;
                        if (i2 < viewPageArr.length) {
                            DialogsActivity.ViewPage viewPage = viewPageArr[i2];
                            if (viewPage.dialogsType == 0 && viewPage.getVisibility() == 0) {
                                DialogsActivity.DialogsRecyclerView dialogsRecyclerView = dialogsActivity.viewPages[i2].listView;
                                int i3 = 0;
                                while (true) {
                                    if (i3 < dialogsRecyclerView.getChildCount()) {
                                        View childAt = dialogsRecyclerView.getChildAt(i3);
                                        if (childAt instanceof DialogCell) {
                                            dialogCell = (DialogCell) childAt;
                                            if (dialogCell.isFolderCell()) {
                                            }
                                        }
                                        i3++;
                                    } else {
                                        dialogCell = null;
                                    }
                                }
                                DialogsActivity.DialogsRecyclerView dialogsRecyclerView2 = dialogsActivity.viewPages[i2].listView;
                                int i4 = DialogsActivity.DialogsRecyclerView.$r8$clinit;
                                dialogsRecyclerView2.toggleArchiveHidden(true, dialogCell);
                            }
                            i2++;
                        }
                    }
                }
                break;
            case 1:
                WallpaperUpdater wallpaperUpdater = (WallpaperUpdater) this.f$0;
                wallpaperUpdater.getClass();
                try {
                    if (i == 0) {
                        try {
                            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                            File fileGeneratePicturePath = AndroidUtilities.generatePicturePath();
                            Activity activity = wallpaperUpdater.parentActivity;
                            if (fileGeneratePicturePath != null) {
                                if (Build.VERSION.SDK_INT >= 24) {
                                    intent.putExtra("output", FileProvider.getUriForFile(activity, ApplicationLoader.getApplicationId() + ".provider", fileGeneratePicturePath));
                                    intent.addFlags(2);
                                    intent.addFlags(1);
                                } else {
                                    intent.putExtra("output", Uri.fromFile(fileGeneratePicturePath));
                                }
                                wallpaperUpdater.currentPicturePath = fileGeneratePicturePath.getAbsolutePath();
                            }
                            activity.startActivityForResult(intent, 10);
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    } else if (i != 1) {
                        WallpaperUpdater.WallpaperUpdaterDelegate wallpaperUpdaterDelegate = wallpaperUpdater.delegate;
                        if (i == 2) {
                            wallpaperUpdaterDelegate.needOpenColorPicker();
                        } else if (i == 3) {
                            wallpaperUpdaterDelegate.didSelectWallpaper(null, null, false);
                        }
                    } else {
                        wallpaperUpdater.openGallery();
                    }
                } catch (Exception e2) {
                    FileLog.e(e2);
                    return;
                }
                break;
            case 2:
                LoginActivity.PhoneView phoneView = (LoginActivity.PhoneView) this.f$0;
                if (i != 0) {
                    ProfileActivity.sendLogs(LoginActivity.this.getParentActivity(), false);
                } else {
                    phoneView.getClass();
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    BulletinFactory.of(LoginActivity.this).createSimpleBulletinWithIconSize(R.raw.chats_infotip, 36, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").show();
                    if (BuildVars.LOGS_ENABLED) {
                        zzjj.m(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                        try {
                            FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                        } catch (Exception e3) {
                            FileLog.e(e3);
                            return;
                        }
                    }
                }
                break;
            case 3:
                PassportActivity passportActivity = (PassportActivity) this.f$0;
                if (i == 0) {
                    passportActivity.currentGender = "male";
                    passportActivity.inputFields[4].setText(LocaleController.getString(R.string.PassportMale));
                } else if (i != 1) {
                    passportActivity.getClass();
                } else {
                    passportActivity.currentGender = "female";
                    passportActivity.inputFields[4].setText(LocaleController.getString(R.string.PassportFemale));
                }
                break;
            default:
                ((SettingsActivity) this.f$0).lambda$openDebugMenu$21(i);
                break;
        }
    }
}
