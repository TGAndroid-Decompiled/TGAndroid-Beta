package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.ThemeSetUrlActivity;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda42;

public final class ImageUpdater$$ExternalSyntheticLambda3 implements DialogInterface.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public ImageUpdater$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) throws Throwable {
        BaseFragment baseFragment;
        int i2 = 24;
        Object obj = this.f$2;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ImageUpdater imageUpdater = (ImageUpdater) obj3;
                imageUpdater.getClass();
                int iIntValue = ((Integer) ((ArrayList) obj2).get(i)).intValue();
                if (iIntValue == 0) {
                    imageUpdater.openCamera();
                } else if (iIntValue == 1) {
                    imageUpdater.openGallery();
                } else if (iIntValue == 2) {
                    imageUpdater.openSearch();
                } else if (iIntValue == 3) {
                    ((Runnable) obj).run();
                } else if (iIntValue == 4 && (baseFragment = imageUpdater.parentFragment) != null && baseFragment.getParentActivity() != null) {
                    try {
                        int i3 = Build.VERSION.SDK_INT;
                        if (i3 >= 23 && imageUpdater.parentFragment.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                            imageUpdater.parentFragment.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                        } else {
                            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                            File fileGenerateVideoPath = AndroidUtilities.generateVideoPath();
                            if (fileGenerateVideoPath != null) {
                                if (i3 >= 24) {
                                    intent.putExtra("output", FileProvider.getUriForFile(imageUpdater.parentFragment.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", fileGenerateVideoPath));
                                    intent.addFlags(2);
                                    intent.addFlags(1);
                                } else {
                                    intent.putExtra("output", Uri.fromFile(fileGenerateVideoPath));
                                }
                                intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                                intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                                intent.putExtra("android.intent.extra.durationLimit", 10);
                                imageUpdater.currentPicturePath = fileGenerateVideoPath.getAbsolutePath();
                            }
                            imageUpdater.parentFragment.startActivityForResult(intent, 15);
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            default:
                ThemeActivity.ListAdapter listAdapter = (ThemeActivity.ListAdapter) obj3;
                ThemeActivity themeActivity = ThemeActivity.this;
                if (themeActivity.getParentActivity() != null) {
                    Theme.ThemeAccent themeAccent = (Theme.ThemeAccent) obj2;
                    if (i == 0) {
                        AlertsCreator.createThemeCreateDialog(themeActivity, i == 1 ? 2 : 1, themeAccent.parentTheme, themeAccent);
                        break;
                    } else if (i == 1) {
                        if (themeAccent.info != null) {
                            String str = "https://" + themeActivity.getMessagesController().linkPrefix + "/addtheme/" + themeAccent.info.slug;
                            themeActivity.showDialog(new ShareAlert(themeActivity.getParentActivity(), str, str, null));
                        } else {
                            themeActivity.getMessagesController().saveThemeToServer(themeAccent.parentTheme, themeAccent);
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, themeAccent.parentTheme, themeAccent);
                        }
                        break;
                    } else if (i == 2) {
                        themeActivity.presentFragment(new ThemeSetUrlActivity(themeAccent.parentTheme, themeAccent, false));
                        break;
                    } else if (i == 3 && themeActivity.getParentActivity() != null) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(themeActivity.getParentActivity(), 0, null);
                        String string = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.title = string;
                        alertDialog.message = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                        builder.setPositiveButton(LocaleController.getString("Delete", R.string.Delete), new VoIPFragment$$ExternalSyntheticLambda42(listAdapter, (ThemeActivity.ThemeAccentsListAdapter) obj, themeAccent, i2));
                        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                        themeActivity.showDialog(alertDialog);
                        TextView textView = (TextView) alertDialog.getButton(-1);
                        if (textView != null) {
                            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                        }
                        break;
                    }
                }
                break;
        }
    }
}
