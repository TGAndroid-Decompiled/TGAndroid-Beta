package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.exoplayer2.RendererCapabilities;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.AlertsCreator;

public final class LoginActivity$PhoneView$$ExternalSyntheticLambda26 implements RequestDelegate {
    public final int $r8$classId;
    public final LoginActivity.PhoneView f$0;

    public LoginActivity$PhoneView$$ExternalSyntheticLambda26(LoginActivity.PhoneView phoneView, int i) {
        this.$r8$classId = i;
        this.f$0 = phoneView;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                final LoginActivity.PhoneView phoneView = this.f$0;
                phoneView.getClass();
                final int i = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                TLRPC.TL_error tL_error2 = tL_error;
                                LoginActivity.PhoneView phoneView2 = phoneView;
                                if (tL_error2 != null) {
                                    phoneView2.getClass();
                                } else {
                                    ArrayList arrayList = phoneView2.countriesArray;
                                    arrayList.clear();
                                    HashMap map = phoneView2.codesMap;
                                    map.clear();
                                    HashMap map2 = phoneView2.phoneFormatMap;
                                    map2.clear();
                                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                                    for (int i2 = 0; i2 < tL_help_countriesList.countries.size(); i2++) {
                                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i2);
                                        for (int i3 = 0; i3 < tL_help_country.country_codes.size(); i3++) {
                                            TLRPC.TL_help_countryCode tL_help_countryCode = tL_help_country.country_codes.get(i3);
                                            if (tL_help_countryCode != null) {
                                                CountrySelectActivity.Country country = new CountrySelectActivity.Country();
                                                String str = tL_help_country.name;
                                                country.name = str;
                                                String str2 = tL_help_country.default_name;
                                                country.defaultName = str2;
                                                if (str == null && str2 != null) {
                                                    country.name = str2;
                                                }
                                                country.code = tL_help_countryCode.country_code;
                                                country.shortname = tL_help_country.iso2;
                                                arrayList.add(country);
                                                List list = (List) map.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    map.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(country);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    map2.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    LoginActivity loginActivity = LoginActivity.this;
                                    if (loginActivity.activityMode == 2) {
                                        String strStripExceptNumbers = PhoneFormat.stripExceptNumbers(UserConfig.getInstance(((BaseFragment) loginActivity).currentAccount).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(strStripExceptNumbers)) {
                                            int i4 = 4;
                                            if (strStripExceptNumbers.length() > 4) {
                                                while (true) {
                                                    NewContactBottomSheet.AnonymousClass3 anonymousClass3 = phoneView2.codeField;
                                                    if (i4 < 1) {
                                                        anonymousClass3.setText(strStripExceptNumbers.substring(0, 1));
                                                    } else {
                                                        String strSubstring = strStripExceptNumbers.substring(0, i4);
                                                        List list2 = (List) map.get(strSubstring);
                                                        CountrySelectActivity.Country country2 = null;
                                                        if (list2 != null) {
                                                            if (list2.size() > 1) {
                                                                String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + strSubstring, null);
                                                                if (string != null) {
                                                                    CountrySelectActivity.Country country3 = (CountrySelectActivity.Country) RendererCapabilities.CC.m(1, list2);
                                                                    int size = arrayList.size();
                                                                    int i5 = 0;
                                                                    while (true) {
                                                                        if (i5 < size) {
                                                                            Object obj = arrayList.get(i5);
                                                                            i5++;
                                                                            CountrySelectActivity.Country country4 = (CountrySelectActivity.Country) obj;
                                                                            if (Objects.equals(country4.shortname, string)) {
                                                                                country2 = country4;
                                                                            }
                                                                        } else {
                                                                            country2 = country3;
                                                                        }
                                                                    }
                                                                } else {
                                                                    country2 = (CountrySelectActivity.Country) RendererCapabilities.CC.m(1, list2);
                                                                }
                                                            } else {
                                                                country2 = (CountrySelectActivity.Country) list2.get(0);
                                                            }
                                                        }
                                                        if (country2 != null) {
                                                            anonymousClass3.setText(strSubstring);
                                                        } else {
                                                            i4--;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                LoginActivity.PhoneView phoneView3 = phoneView;
                                phoneView3.nextPressed = false;
                                LoginActivity loginActivity2 = LoginActivity.this;
                                loginActivity2.showDoneButton(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (TwoStepVerificationActivity.canHandleCurrentPassword(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        loginActivity2.setPage(6, true, bundle, false);
                                    } else {
                                        AlertsCreator.showUpdateAppAlert(loginActivity2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                    }
                                } else {
                                    loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final LoginActivity.PhoneView phoneView2 = this.f$0;
                phoneView2.getClass();
                final int i2 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                TLRPC.TL_error tL_error2 = tL_error;
                                LoginActivity.PhoneView phoneView3 = phoneView2;
                                if (tL_error2 != null) {
                                    phoneView3.getClass();
                                } else {
                                    ArrayList arrayList = phoneView3.countriesArray;
                                    arrayList.clear();
                                    HashMap map = phoneView3.codesMap;
                                    map.clear();
                                    HashMap map2 = phoneView3.phoneFormatMap;
                                    map2.clear();
                                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                                    for (int i3 = 0; i3 < tL_help_countriesList.countries.size(); i3++) {
                                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i3);
                                        for (int i4 = 0; i4 < tL_help_country.country_codes.size(); i4++) {
                                            TLRPC.TL_help_countryCode tL_help_countryCode = tL_help_country.country_codes.get(i4);
                                            if (tL_help_countryCode != null) {
                                                CountrySelectActivity.Country country = new CountrySelectActivity.Country();
                                                String str = tL_help_country.name;
                                                country.name = str;
                                                String str2 = tL_help_country.default_name;
                                                country.defaultName = str2;
                                                if (str == null && str2 != null) {
                                                    country.name = str2;
                                                }
                                                country.code = tL_help_countryCode.country_code;
                                                country.shortname = tL_help_country.iso2;
                                                arrayList.add(country);
                                                List list = (List) map.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    map.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(country);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    map2.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    LoginActivity loginActivity = LoginActivity.this;
                                    if (loginActivity.activityMode == 2) {
                                        String strStripExceptNumbers = PhoneFormat.stripExceptNumbers(UserConfig.getInstance(((BaseFragment) loginActivity).currentAccount).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(strStripExceptNumbers)) {
                                            int i5 = 4;
                                            if (strStripExceptNumbers.length() > 4) {
                                                while (true) {
                                                    NewContactBottomSheet.AnonymousClass3 anonymousClass3 = phoneView3.codeField;
                                                    if (i5 < 1) {
                                                        anonymousClass3.setText(strStripExceptNumbers.substring(0, 1));
                                                    } else {
                                                        String strSubstring = strStripExceptNumbers.substring(0, i5);
                                                        List list2 = (List) map.get(strSubstring);
                                                        CountrySelectActivity.Country country2 = null;
                                                        if (list2 != null) {
                                                            if (list2.size() > 1) {
                                                                String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + strSubstring, null);
                                                                if (string != null) {
                                                                    CountrySelectActivity.Country country3 = (CountrySelectActivity.Country) RendererCapabilities.CC.m(1, list2);
                                                                    int size = arrayList.size();
                                                                    int i6 = 0;
                                                                    while (true) {
                                                                        if (i6 < size) {
                                                                            Object obj = arrayList.get(i6);
                                                                            i6++;
                                                                            CountrySelectActivity.Country country4 = (CountrySelectActivity.Country) obj;
                                                                            if (Objects.equals(country4.shortname, string)) {
                                                                                country2 = country4;
                                                                            }
                                                                        } else {
                                                                            country2 = country3;
                                                                        }
                                                                    }
                                                                } else {
                                                                    country2 = (CountrySelectActivity.Country) RendererCapabilities.CC.m(1, list2);
                                                                }
                                                            } else {
                                                                country2 = (CountrySelectActivity.Country) list2.get(0);
                                                            }
                                                        }
                                                        if (country2 != null) {
                                                            anonymousClass3.setText(strSubstring);
                                                        } else {
                                                            i5--;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                LoginActivity.PhoneView phoneView4 = phoneView2;
                                phoneView4.nextPressed = false;
                                LoginActivity loginActivity2 = LoginActivity.this;
                                loginActivity2.showDoneButton(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (TwoStepVerificationActivity.canHandleCurrentPassword(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        loginActivity2.setPage(6, true, bundle, false);
                                    } else {
                                        AlertsCreator.showUpdateAppAlert(loginActivity2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                    }
                                } else {
                                    loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
