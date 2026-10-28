package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
public final class ag0 implements RequestDelegate {
    public final int f37773a;
    public final hg0 f37774b;

    public ag0(hg0 hg0Var, int i10) {
        this.f37773a = i10;
        this.f37774b = hg0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f37773a) {
            case 0:
                final hg0 hg0Var = this.f37774b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        lt ltVar;
                        switch (r4) {
                            case 0:
                                hg0 hg0Var2 = hg0Var;
                                oj0 oj0Var = hg0Var2.f39881a;
                                HashMap hashMap = hg0Var2.I;
                                ArrayList arrayList = hg0Var2.G;
                                HashMap hashMap2 = hg0Var2.H;
                                if (tL_error == null) {
                                    arrayList.clear();
                                    hashMap2.clear();
                                    hashMap.clear();
                                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                                    for (int i11 = 0; i11 < tL_help_countriesList.countries.size(); i11++) {
                                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i11);
                                        for (int i12 = 0; i12 < tL_help_country.country_codes.size(); i12++) {
                                            TLRPC.TL_help_countryCode tL_help_countryCode = tL_help_country.country_codes.get(i12);
                                            if (tL_help_countryCode != null) {
                                                ?? obj = new Object();
                                                String str = tL_help_country.name;
                                                obj.f41258a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f41259b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f41258a = str2;
                                                }
                                                obj.f41260c = tL_help_countryCode.country_code;
                                                obj.d = tL_help_country.iso2;
                                                arrayList.add(obj);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(obj);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    ig0 ig0Var = hg0Var2.f39882a0;
                                    if (ig0Var.F == 2) {
                                        i10 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
                                        String d = kf.b.d(UserConfig.getInstance(i10).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i13 = 4; i13 >= 1; i13--) {
                                                    String substring = d.substring(0, i13);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    lt ltVar2 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                ltVar = (lt) org.telegram.ui.Components.b10.h(1, list2);
                                                                int size = arrayList.size();
                                                                int i14 = 0;
                                                                while (true) {
                                                                    if (i14 < size) {
                                                                        Object obj2 = arrayList.get(i14);
                                                                        i14++;
                                                                        lt ltVar3 = (lt) obj2;
                                                                        if (Objects.equals(ltVar3.d, string)) {
                                                                            ltVar = ltVar3;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                ltVar = (lt) org.telegram.ui.Components.b10.h(1, list2);
                                                            }
                                                            ltVar2 = ltVar;
                                                        } else {
                                                            ltVar2 = (lt) list2.get(0);
                                                        }
                                                    }
                                                    if (ltVar2 != null) {
                                                        oj0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                oj0Var.setText(d.substring(0, 1));
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                hg0 hg0Var3 = hg0Var;
                                hg0Var3.M = false;
                                ig0 ig0Var2 = hg0Var3.f39882a0;
                                ig0Var2.A1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.j0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(ig0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    ig0Var2.z1(6, true, bundle, false);
                                    return;
                                }
                                ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final hg0 hg0Var2 = this.f37774b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        lt ltVar;
                        switch (r4) {
                            case 0:
                                hg0 hg0Var22 = hg0Var2;
                                oj0 oj0Var = hg0Var22.f39881a;
                                HashMap hashMap = hg0Var22.I;
                                ArrayList arrayList = hg0Var22.G;
                                HashMap hashMap2 = hg0Var22.H;
                                if (tL_error == null) {
                                    arrayList.clear();
                                    hashMap2.clear();
                                    hashMap.clear();
                                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                                    for (int i11 = 0; i11 < tL_help_countriesList.countries.size(); i11++) {
                                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i11);
                                        for (int i12 = 0; i12 < tL_help_country.country_codes.size(); i12++) {
                                            TLRPC.TL_help_countryCode tL_help_countryCode = tL_help_country.country_codes.get(i12);
                                            if (tL_help_countryCode != null) {
                                                ?? obj = new Object();
                                                String str = tL_help_country.name;
                                                obj.f41258a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f41259b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f41258a = str2;
                                                }
                                                obj.f41260c = tL_help_countryCode.country_code;
                                                obj.d = tL_help_country.iso2;
                                                arrayList.add(obj);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(obj);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    ig0 ig0Var = hg0Var22.f39882a0;
                                    if (ig0Var.F == 2) {
                                        i10 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
                                        String d = kf.b.d(UserConfig.getInstance(i10).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i13 = 4; i13 >= 1; i13--) {
                                                    String substring = d.substring(0, i13);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    lt ltVar2 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                ltVar = (lt) org.telegram.ui.Components.b10.h(1, list2);
                                                                int size = arrayList.size();
                                                                int i14 = 0;
                                                                while (true) {
                                                                    if (i14 < size) {
                                                                        Object obj2 = arrayList.get(i14);
                                                                        i14++;
                                                                        lt ltVar3 = (lt) obj2;
                                                                        if (Objects.equals(ltVar3.d, string)) {
                                                                            ltVar = ltVar3;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                ltVar = (lt) org.telegram.ui.Components.b10.h(1, list2);
                                                            }
                                                            ltVar2 = ltVar;
                                                        } else {
                                                            ltVar2 = (lt) list2.get(0);
                                                        }
                                                    }
                                                    if (ltVar2 != null) {
                                                        oj0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                oj0Var.setText(d.substring(0, 1));
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                hg0 hg0Var3 = hg0Var2;
                                hg0Var3.M = false;
                                ig0 ig0Var2 = hg0Var3.f39882a0;
                                ig0Var2.A1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.j0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(ig0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    ig0Var2.z1(6, true, bundle, false);
                                    return;
                                }
                                ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
