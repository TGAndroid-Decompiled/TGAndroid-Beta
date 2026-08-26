package org.telegram.ui;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;

public final class PassportActivity$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final int $r8$classId;
    public final PassportActivity f$0;

    public PassportActivity$$ExternalSyntheticLambda2(PassportActivity passportActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = passportActivity;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                PassportActivity passportActivity = this.f$0;
                passportActivity.useCurrentValue = true;
                passportActivity.doneItem.callOnClick();
                passportActivity.useCurrentValue = false;
                break;
            case 1:
                PassportActivity passportActivity2 = this.f$0;
                passportActivity2.useCurrentValue = true;
                passportActivity2.doneItem.callOnClick();
                passportActivity2.useCurrentValue = false;
                break;
            case 2:
                PassportActivity passportActivity3 = this.f$0;
                passportActivity3.uploadingFileType = 2;
                passportActivity3.openAttachMenu$1();
                break;
            case 3:
                this.f$0.createDocumentDeleteAlert();
                break;
            case 4:
                PassportActivity passportActivity4 = this.f$0;
                passportActivity4.uploadingFileType = 3;
                passportActivity4.openAttachMenu$1();
                break;
            case 5:
                PassportActivity passportActivity5 = this.f$0;
                passportActivity5.uploadingFileType = 1;
                passportActivity5.openAttachMenu$1();
                break;
            case 6:
                PassportActivity passportActivity6 = this.f$0;
                passportActivity6.uploadingFileType = 4;
                passportActivity6.openAttachMenu$1();
                break;
            case 7:
                int i = Build.VERSION.SDK_INT;
                final PassportActivity passportActivity7 = this.f$0;
                if (i < 23) {
                    passportActivity7.getClass();
                } else if (passportActivity7.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    passportActivity7.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                }
                CameraScanActivity cameraScanActivity = new CameraScanActivity(0);
                cameraScanActivity.delegate = new CameraScanActivity.CameraScanActivityDelegate() {
                    @Override
                    public final void didFindMrzInfo(MrzRecognizer.Result result) {
                        boolean zIsEmpty = TextUtils.isEmpty(result.firstName);
                        PassportActivity passportActivity8 = PassportActivity.this;
                        if (!zIsEmpty) {
                            passportActivity8.inputFields[0].setText(result.firstName);
                        }
                        if (!TextUtils.isEmpty(result.middleName)) {
                            passportActivity8.inputFields[1].setText(result.middleName);
                        }
                        if (!TextUtils.isEmpty(result.lastName)) {
                            passportActivity8.inputFields[2].setText(result.lastName);
                        }
                        int i2 = result.gender;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                passportActivity8.currentGender = "male";
                                passportActivity8.inputFields[4].setText(LocaleController.getString(R.string.PassportMale));
                            } else if (i2 == 2) {
                                passportActivity8.currentGender = "female";
                                passportActivity8.inputFields[4].setText(LocaleController.getString(R.string.PassportFemale));
                            }
                        }
                        if (!TextUtils.isEmpty(result.nationality)) {
                            String str = result.nationality;
                            passportActivity8.currentCitizeship = str;
                            String str2 = (String) passportActivity8.languageMap.get(str);
                            if (str2 != null) {
                                passportActivity8.inputFields[5].setText(str2);
                            }
                        }
                        if (!TextUtils.isEmpty(result.issuingCountry)) {
                            String str3 = result.issuingCountry;
                            passportActivity8.currentResidence = str3;
                            String str4 = (String) passportActivity8.languageMap.get(str3);
                            if (str4 != null) {
                                passportActivity8.inputFields[6].setText(str4);
                            }
                        }
                        int i3 = result.birthDay;
                        if (i3 <= 0 || result.birthMonth <= 0 || result.birthYear <= 0) {
                            return;
                        }
                        passportActivity8.inputFields[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i3), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                    }

                    @Override
                    public final void didFindQr(String str) {
                    }

                    @Override
                    public final String getSubtitleText() {
                        return null;
                    }

                    @Override
                    public final void onDismiss() {
                    }

                    @Override
                    public final boolean processQr(String str, CameraScanActivity$$ExternalSyntheticLambda0 cameraScanActivity$$ExternalSyntheticLambda0) {
                        return false;
                    }
                };
                passportActivity7.presentFragment(cameraScanActivity);
                break;
            case 8:
                PassportActivity passportActivity8 = this.f$0;
                passportActivity8.uploadingFileType = 0;
                passportActivity8.openAttachMenu$1();
                break;
            case 9:
                PassportActivity passportActivity9 = this.f$0;
                passportActivity9.uploadingFileType = 4;
                passportActivity9.openAttachMenu$1();
                break;
            case 10:
                this.f$0.createDocumentDeleteAlert();
                break;
            case 11:
                this.f$0.lambda$createPasswordInterface$6();
                break;
            case 12:
                this.f$0.lambda$createPasswordInterface$12();
                break;
            case 13:
                this.f$0.openAddDocumentAlert();
                break;
            case 14:
                PassportActivity passportActivity10 = this.f$0;
                AlertDialog.Builder builder = new AlertDialog.Builder(passportActivity10.getParentActivity(), 0, null);
                String string = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                alertDialog.message = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                builder.setPositiveButton(LocaleController.getString(R.string.Delete), new PassportActivity$$ExternalSyntheticLambda7(passportActivity10, 5));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                passportActivity10.showDialog(alertDialog);
                TextView textView = (TextView) alertDialog.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                }
                break;
            case 15:
                this.f$0.openAddDocumentAlert();
                break;
            default:
                this.f$0.lambda$createRequestInterface$16();
                break;
        }
    }
}
