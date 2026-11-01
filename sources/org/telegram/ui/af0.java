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
public final class af0 implements RequestDelegate {
    public final int f35775a;
    public final ff0 f35776b;

    public af0(ff0 ff0Var, int i10) {
        this.f35775a = i10;
        this.f35776b = ff0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f35775a) {
            case 0:
                final ff0 ff0Var = this.f35776b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        mt mtVar;
                        int i11 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ff0 ff0Var2 = ff0Var;
                        switch (i11) {
                            case 0:
                                df0 df0Var = ff0Var2.f37123a;
                                HashMap hashMap = ff0Var2.I;
                                ArrayList arrayList = ff0Var2.G;
                                HashMap hashMap2 = ff0Var2.H;
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
                                                obj.f39611a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f39612b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f39611a = str2;
                                                }
                                                obj.f39613c = tL_help_countryCode.country_code;
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
                                    gf0 gf0Var = ff0Var2.f37124a0;
                                    if (gf0Var.F == 2) {
                                        i10 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
                                        String d = af.b.d(org.telegram.messenger.e20.i(i10).d(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        mtVar = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = org.telegram.messenger.wp.d1().getString("phone_code_last_matched_" + substring, null);
                                                        if (string != null) {
                                                            mtVar = (mt) sc.e.g(1, list2);
                                                            int size = arrayList.size();
                                                            int i15 = 0;
                                                            while (true) {
                                                                if (i15 < size) {
                                                                    Object obj2 = arrayList.get(i15);
                                                                    i15++;
                                                                    mt mtVar2 = (mt) obj2;
                                                                    if (Objects.equals(mtVar2.d, string)) {
                                                                        mtVar = mtVar2;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            mtVar = (mt) sc.e.g(1, list2);
                                                        }
                                                    } else {
                                                        mtVar = (mt) list2.get(0);
                                                    }
                                                    if (mtVar != null) {
                                                        df0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                df0Var.setText(d.substring(0, 1));
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
                                ff0Var2.M = false;
                                gf0 gf0Var2 = ff0Var2.f37124a0;
                                gf0Var2.E1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.s4.w0(gf0Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131743846, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                    gf0Var2.D1(6, true, bundle, false);
                                    return;
                                }
                                gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final ff0 ff0Var2 = this.f35776b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        mt mtVar;
                        int i11 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ff0 ff0Var22 = ff0Var2;
                        switch (i11) {
                            case 0:
                                df0 df0Var = ff0Var22.f37123a;
                                HashMap hashMap = ff0Var22.I;
                                ArrayList arrayList = ff0Var22.G;
                                HashMap hashMap2 = ff0Var22.H;
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
                                                obj.f39611a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f39612b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f39611a = str2;
                                                }
                                                obj.f39613c = tL_help_countryCode.country_code;
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
                                    gf0 gf0Var = ff0Var22.f37124a0;
                                    if (gf0Var.F == 2) {
                                        i10 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
                                        String d = af.b.d(org.telegram.messenger.e20.i(i10).d(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        mtVar = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = org.telegram.messenger.wp.d1().getString("phone_code_last_matched_" + substring, null);
                                                        if (string != null) {
                                                            mtVar = (mt) sc.e.g(1, list2);
                                                            int size = arrayList.size();
                                                            int i15 = 0;
                                                            while (true) {
                                                                if (i15 < size) {
                                                                    Object obj2 = arrayList.get(i15);
                                                                    i15++;
                                                                    mt mtVar2 = (mt) obj2;
                                                                    if (Objects.equals(mtVar2.d, string)) {
                                                                        mtVar = mtVar2;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            mtVar = (mt) sc.e.g(1, list2);
                                                        }
                                                    } else {
                                                        mtVar = (mt) list2.get(0);
                                                    }
                                                    if (mtVar != null) {
                                                        df0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                df0Var.setText(d.substring(0, 1));
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
                                ff0Var22.M = false;
                                gf0 gf0Var2 = ff0Var22.f37124a0;
                                gf0Var2.E1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.s4.w0(gf0Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131743846, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                    gf0Var2.D1(6, true, bundle, false);
                                    return;
                                }
                                gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
