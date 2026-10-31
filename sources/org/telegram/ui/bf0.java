package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class bf0 implements RequestDelegate {
    public final int f36246a;
    public final gf0 f36247b;

    public bf0(gf0 gf0Var, int i10) {
        this.f36246a = i10;
        this.f36247b = gf0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f36246a) {
            case 0:
                final gf0 gf0Var = this.f36247b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        nt ntVar;
                        int i11 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        gf0 gf0Var2 = gf0Var;
                        switch (i11) {
                            case 0:
                                ef0 ef0Var = gf0Var2.f37533a;
                                HashMap hashMap = gf0Var2.I;
                                ArrayList arrayList = gf0Var2.G;
                                HashMap hashMap2 = gf0Var2.H;
                                if (tL_error2 == null) {
                                    arrayList.clear();
                                    hashMap2.clear();
                                    hashMap.clear();
                                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject2;
                                    for (int i12 = 0; i12 < tL_help_countriesList.countries.size(); i12++) {
                                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i12);
                                        for (int i13 = 0; i13 < tL_help_country.country_codes.size(); i13++) {
                                            TLRPC.TL_help_countryCode tL_help_countryCode = tL_help_country.country_codes.get(i13);
                                            if (tL_help_countryCode != null) {
                                                ?? obj = new Object();
                                                String str = tL_help_country.name;
                                                obj.f40047a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f40048b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f40047a = str2;
                                                }
                                                obj.f40049c = tL_help_countryCode.country_code;
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
                                    hf0 hf0Var = gf0Var2.f37534a0;
                                    if (hf0Var.F == 2) {
                                        i10 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                                        String d = af.b.d(org.telegram.messenger.d20.i(i10).d(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        ntVar = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = org.telegram.messenger.vp.d1().getString("phone_code_last_matched_" + substring, null);
                                                        if (string != null) {
                                                            ntVar = (nt) sc.e.g(1, list2);
                                                            int size = arrayList.size();
                                                            int i15 = 0;
                                                            while (true) {
                                                                if (i15 < size) {
                                                                    Object obj2 = arrayList.get(i15);
                                                                    i15++;
                                                                    nt ntVar2 = (nt) obj2;
                                                                    if (Objects.equals(ntVar2.d, string)) {
                                                                        ntVar = ntVar2;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            ntVar = (nt) sc.e.g(1, list2);
                                                        }
                                                    } else {
                                                        ntVar = (nt) list2.get(0);
                                                    }
                                                    if (ntVar != null) {
                                                        ef0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                ef0Var.setText(d.substring(0, 1));
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
                                gf0Var2.M = false;
                                hf0 hf0Var2 = gf0Var2.f37534a0;
                                hf0Var2.D1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.m0(password, true)) {
                                        org.telegram.ui.Components.s4.w0(hf0Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                    hf0Var2.C1(6, true, bundle, false);
                                    return;
                                }
                                hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final gf0 gf0Var2 = this.f36247b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        nt ntVar;
                        int i11 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        gf0 gf0Var22 = gf0Var2;
                        switch (i11) {
                            case 0:
                                ef0 ef0Var = gf0Var22.f37533a;
                                HashMap hashMap = gf0Var22.I;
                                ArrayList arrayList = gf0Var22.G;
                                HashMap hashMap2 = gf0Var22.H;
                                if (tL_error2 == null) {
                                    arrayList.clear();
                                    hashMap2.clear();
                                    hashMap.clear();
                                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject2;
                                    for (int i12 = 0; i12 < tL_help_countriesList.countries.size(); i12++) {
                                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i12);
                                        for (int i13 = 0; i13 < tL_help_country.country_codes.size(); i13++) {
                                            TLRPC.TL_help_countryCode tL_help_countryCode = tL_help_country.country_codes.get(i13);
                                            if (tL_help_countryCode != null) {
                                                ?? obj = new Object();
                                                String str = tL_help_country.name;
                                                obj.f40047a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f40048b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f40047a = str2;
                                                }
                                                obj.f40049c = tL_help_countryCode.country_code;
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
                                    hf0 hf0Var = gf0Var22.f37534a0;
                                    if (hf0Var.F == 2) {
                                        i10 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                                        String d = af.b.d(org.telegram.messenger.d20.i(i10).d(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        ntVar = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = org.telegram.messenger.vp.d1().getString("phone_code_last_matched_" + substring, null);
                                                        if (string != null) {
                                                            ntVar = (nt) sc.e.g(1, list2);
                                                            int size = arrayList.size();
                                                            int i15 = 0;
                                                            while (true) {
                                                                if (i15 < size) {
                                                                    Object obj2 = arrayList.get(i15);
                                                                    i15++;
                                                                    nt ntVar2 = (nt) obj2;
                                                                    if (Objects.equals(ntVar2.d, string)) {
                                                                        ntVar = ntVar2;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            ntVar = (nt) sc.e.g(1, list2);
                                                        }
                                                    } else {
                                                        ntVar = (nt) list2.get(0);
                                                    }
                                                    if (ntVar != null) {
                                                        ef0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                ef0Var.setText(d.substring(0, 1));
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
                                gf0Var22.M = false;
                                hf0 hf0Var2 = gf0Var22.f37534a0;
                                hf0Var2.D1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.m0(password, true)) {
                                        org.telegram.ui.Components.s4.w0(hf0Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                    hf0Var2.C1(6, true, bundle, false);
                                    return;
                                }
                                hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
