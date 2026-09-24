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
public final class jg0 implements RequestDelegate {
    public final int f34786a;
    public final pg0 f34787b;

    public jg0(pg0 pg0Var, int i10) {
        this.f34786a = i10;
        this.f34787b = pg0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f34786a) {
            case 0:
                final pg0 pg0Var = this.f34787b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        qt qtVar;
                        switch (r4) {
                            case 0:
                                pg0 pg0Var2 = pg0Var;
                                uj0 uj0Var = pg0Var2.f36509a;
                                HashMap hashMap = pg0Var2.G;
                                ArrayList arrayList = pg0Var2.E;
                                HashMap hashMap2 = pg0Var2.F;
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
                                                obj.f36969a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f36970b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f36969a = str2;
                                                }
                                                obj.f36971c = tL_help_countryCode.country_code;
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
                                    qg0 qg0Var = pg0Var2.V;
                                    if (qg0Var.F == 2) {
                                        i10 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
                                        String d = gf.b.d(UserConfig.getInstance(i10).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i13 = 4; i13 >= 1; i13--) {
                                                    String substring = d.substring(0, i13);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    qt qtVar2 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                qtVar = (qt) org.telegram.ui.Cells.c1.i(1, list2);
                                                                int size = arrayList.size();
                                                                int i14 = 0;
                                                                while (true) {
                                                                    if (i14 < size) {
                                                                        Object obj2 = arrayList.get(i14);
                                                                        i14++;
                                                                        qt qtVar3 = (qt) obj2;
                                                                        if (Objects.equals(qtVar3.d, string)) {
                                                                            qtVar = qtVar3;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                qtVar = (qt) org.telegram.ui.Cells.c1.i(1, list2);
                                                            }
                                                            qtVar2 = qtVar;
                                                        } else {
                                                            qtVar2 = (qt) list2.get(0);
                                                        }
                                                    }
                                                    if (qtVar2 != null) {
                                                        uj0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                uj0Var.setText(d.substring(0, 1));
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
                                pg0 pg0Var3 = pg0Var;
                                pg0Var3.K = false;
                                qg0 qg0Var2 = pg0Var3.V;
                                qg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.e5.x0(qg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    qg0Var2.u1(6, true, bundle, false);
                                    return;
                                }
                                qg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final pg0 pg0Var2 = this.f34787b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        qt qtVar;
                        switch (r4) {
                            case 0:
                                pg0 pg0Var22 = pg0Var2;
                                uj0 uj0Var = pg0Var22.f36509a;
                                HashMap hashMap = pg0Var22.G;
                                ArrayList arrayList = pg0Var22.E;
                                HashMap hashMap2 = pg0Var22.F;
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
                                                obj.f36969a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f36970b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f36969a = str2;
                                                }
                                                obj.f36971c = tL_help_countryCode.country_code;
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
                                    qg0 qg0Var = pg0Var22.V;
                                    if (qg0Var.F == 2) {
                                        i10 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
                                        String d = gf.b.d(UserConfig.getInstance(i10).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i13 = 4; i13 >= 1; i13--) {
                                                    String substring = d.substring(0, i13);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    qt qtVar2 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                qtVar = (qt) org.telegram.ui.Cells.c1.i(1, list2);
                                                                int size = arrayList.size();
                                                                int i14 = 0;
                                                                while (true) {
                                                                    if (i14 < size) {
                                                                        Object obj2 = arrayList.get(i14);
                                                                        i14++;
                                                                        qt qtVar3 = (qt) obj2;
                                                                        if (Objects.equals(qtVar3.d, string)) {
                                                                            qtVar = qtVar3;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                qtVar = (qt) org.telegram.ui.Cells.c1.i(1, list2);
                                                            }
                                                            qtVar2 = qtVar;
                                                        } else {
                                                            qtVar2 = (qt) list2.get(0);
                                                        }
                                                    }
                                                    if (qtVar2 != null) {
                                                        uj0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                uj0Var.setText(d.substring(0, 1));
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
                                pg0 pg0Var3 = pg0Var2;
                                pg0Var3.K = false;
                                qg0 qg0Var2 = pg0Var3.V;
                                qg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.e5.x0(qg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    qg0Var2.u1(6, true, bundle, false);
                                    return;
                                }
                                qg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
