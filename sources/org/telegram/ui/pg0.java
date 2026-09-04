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
public final class pg0 implements RequestDelegate {
    public final int f39507a;
    public final vg0 f39508b;

    public pg0(vg0 vg0Var, int i10) {
        this.f39507a = i10;
        this.f39508b = vg0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f39507a) {
            case 0:
                final vg0 vg0Var = this.f39508b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        vt vtVar;
                        switch (r4) {
                            case 0:
                                vg0 vg0Var2 = vg0Var;
                                ck0 ck0Var = vg0Var2.f41536a;
                                HashMap hashMap = vg0Var2.G;
                                ArrayList arrayList = vg0Var2.E;
                                HashMap hashMap2 = vg0Var2.F;
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
                                                obj.f41693a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f41694b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f41693a = str2;
                                                }
                                                obj.f41695c = tL_help_countryCode.country_code;
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
                                    wg0 wg0Var = vg0Var2.V;
                                    if (wg0Var.F == 2) {
                                        i10 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
                                        String d = gf.b.d(UserConfig.getInstance(i10).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i13 = 4; i13 >= 1; i13--) {
                                                    String substring = d.substring(0, i13);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    vt vtVar2 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                vtVar = (vt) org.telegram.ui.Cells.p6.g(1, list2);
                                                                int size = arrayList.size();
                                                                int i14 = 0;
                                                                while (true) {
                                                                    if (i14 < size) {
                                                                        Object obj2 = arrayList.get(i14);
                                                                        i14++;
                                                                        vt vtVar3 = (vt) obj2;
                                                                        if (Objects.equals(vtVar3.d, string)) {
                                                                            vtVar = vtVar3;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                vtVar = (vt) org.telegram.ui.Cells.p6.g(1, list2);
                                                            }
                                                            vtVar2 = vtVar;
                                                        } else {
                                                            vtVar2 = (vt) list2.get(0);
                                                        }
                                                    }
                                                    if (vtVar2 != null) {
                                                        ck0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                ck0Var.setText(d.substring(0, 1));
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
                                vg0 vg0Var3 = vg0Var;
                                vg0Var3.K = false;
                                wg0 wg0Var2 = vg0Var3.V;
                                wg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.e5.x0(wg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    wg0Var2.u1(6, true, bundle, false);
                                    return;
                                }
                                wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final vg0 vg0Var2 = this.f39508b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        vt vtVar;
                        switch (r4) {
                            case 0:
                                vg0 vg0Var22 = vg0Var2;
                                ck0 ck0Var = vg0Var22.f41536a;
                                HashMap hashMap = vg0Var22.G;
                                ArrayList arrayList = vg0Var22.E;
                                HashMap hashMap2 = vg0Var22.F;
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
                                                obj.f41693a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f41694b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f41693a = str2;
                                                }
                                                obj.f41695c = tL_help_countryCode.country_code;
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
                                    wg0 wg0Var = vg0Var22.V;
                                    if (wg0Var.F == 2) {
                                        i10 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
                                        String d = gf.b.d(UserConfig.getInstance(i10).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i13 = 4; i13 >= 1; i13--) {
                                                    String substring = d.substring(0, i13);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    vt vtVar2 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                vtVar = (vt) org.telegram.ui.Cells.p6.g(1, list2);
                                                                int size = arrayList.size();
                                                                int i14 = 0;
                                                                while (true) {
                                                                    if (i14 < size) {
                                                                        Object obj2 = arrayList.get(i14);
                                                                        i14++;
                                                                        vt vtVar3 = (vt) obj2;
                                                                        if (Objects.equals(vtVar3.d, string)) {
                                                                            vtVar = vtVar3;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                vtVar = (vt) org.telegram.ui.Cells.p6.g(1, list2);
                                                            }
                                                            vtVar2 = vtVar;
                                                        } else {
                                                            vtVar2 = (vt) list2.get(0);
                                                        }
                                                    }
                                                    if (vtVar2 != null) {
                                                        ck0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                ck0Var.setText(d.substring(0, 1));
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
                                vg0 vg0Var3 = vg0Var2;
                                vg0Var3.K = false;
                                wg0 wg0Var2 = vg0Var3.V;
                                wg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.e5.x0(wg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    wg0Var2.u1(6, true, bundle, false);
                                    return;
                                }
                                wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
