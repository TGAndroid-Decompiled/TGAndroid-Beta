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
public final class og0 implements RequestDelegate {
    public final int f40573a;
    public final ug0 f40574b;

    public og0(ug0 ug0Var, int i10) {
        this.f40573a = i10;
        this.f40574b = ug0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f40573a) {
            case 0:
                final ug0 ug0Var = this.f40574b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        tt ttVar;
                        switch (r4) {
                            case 0:
                                ug0 ug0Var2 = ug0Var;
                                ak0 ak0Var = ug0Var2.f42586a;
                                HashMap hashMap = ug0Var2.G;
                                ArrayList arrayList = ug0Var2.E;
                                HashMap hashMap2 = ug0Var2.F;
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
                                                obj.f42293a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f42294b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f42293a = str2;
                                                }
                                                obj.f42295c = tL_help_countryCode.country_code;
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
                                    vg0 vg0Var = ug0Var2.V;
                                    if (vg0Var.F == 2) {
                                        i10 = ((org.telegram.ui.ActionBar.m2) vg0Var).currentAccount;
                                        String d = hf.b.d(UserConfig.getInstance(i10).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i13 = 4; i13 >= 1; i13--) {
                                                    String substring = d.substring(0, i13);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    tt ttVar2 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                ttVar = (tt) sc.v.h(1, list2);
                                                                int size = arrayList.size();
                                                                int i14 = 0;
                                                                while (true) {
                                                                    if (i14 < size) {
                                                                        Object obj2 = arrayList.get(i14);
                                                                        i14++;
                                                                        tt ttVar3 = (tt) obj2;
                                                                        if (Objects.equals(ttVar3.d, string)) {
                                                                            ttVar = ttVar3;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                ttVar = (tt) sc.v.h(1, list2);
                                                            }
                                                            ttVar2 = ttVar;
                                                        } else {
                                                            ttVar2 = (tt) list2.get(0);
                                                        }
                                                    }
                                                    if (ttVar2 != null) {
                                                        ak0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                ak0Var.setText(d.substring(0, 1));
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
                                ug0 ug0Var3 = ug0Var;
                                ug0Var3.K = false;
                                vg0 vg0Var2 = ug0Var3.V;
                                vg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(vg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    vg0Var2.u1(6, true, bundle, false);
                                    return;
                                }
                                vg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final ug0 ug0Var2 = this.f40574b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        tt ttVar;
                        switch (r4) {
                            case 0:
                                ug0 ug0Var22 = ug0Var2;
                                ak0 ak0Var = ug0Var22.f42586a;
                                HashMap hashMap = ug0Var22.G;
                                ArrayList arrayList = ug0Var22.E;
                                HashMap hashMap2 = ug0Var22.F;
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
                                                obj.f42293a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f42294b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f42293a = str2;
                                                }
                                                obj.f42295c = tL_help_countryCode.country_code;
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
                                    vg0 vg0Var = ug0Var22.V;
                                    if (vg0Var.F == 2) {
                                        i10 = ((org.telegram.ui.ActionBar.m2) vg0Var).currentAccount;
                                        String d = hf.b.d(UserConfig.getInstance(i10).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i13 = 4; i13 >= 1; i13--) {
                                                    String substring = d.substring(0, i13);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    tt ttVar2 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                ttVar = (tt) sc.v.h(1, list2);
                                                                int size = arrayList.size();
                                                                int i14 = 0;
                                                                while (true) {
                                                                    if (i14 < size) {
                                                                        Object obj2 = arrayList.get(i14);
                                                                        i14++;
                                                                        tt ttVar3 = (tt) obj2;
                                                                        if (Objects.equals(ttVar3.d, string)) {
                                                                            ttVar = ttVar3;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                ttVar = (tt) sc.v.h(1, list2);
                                                            }
                                                            ttVar2 = ttVar;
                                                        } else {
                                                            ttVar2 = (tt) list2.get(0);
                                                        }
                                                    }
                                                    if (ttVar2 != null) {
                                                        ak0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                ak0Var.setText(d.substring(0, 1));
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
                                ug0 ug0Var3 = ug0Var2;
                                ug0Var3.K = false;
                                vg0 vg0Var2 = ug0Var3.V;
                                vg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(vg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    vg0Var2.u1(6, true, bundle, false);
                                    return;
                                }
                                vg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
