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
public final class hg0 implements RequestDelegate {
    public final int f37376a;
    public final ng0 f37377b;

    public hg0(ng0 ng0Var, int i10) {
        this.f37376a = i10;
        this.f37377b = ng0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f37376a) {
            case 0:
                final ng0 ng0Var = this.f37377b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        tt ttVar;
                        switch (r4) {
                            case 0:
                                ng0 ng0Var2 = ng0Var;
                                rj0 rj0Var = ng0Var2.f39343a;
                                HashMap hashMap = ng0Var2.D;
                                ArrayList arrayList = ng0Var2.B;
                                HashMap hashMap2 = ng0Var2.C;
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
                                                obj.f41631a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f41632b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f41631a = str2;
                                                }
                                                obj.f41633c = tL_help_countryCode.country_code;
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
                                    og0 og0Var = ng0Var2.S;
                                    if (og0Var.C == 2) {
                                        i10 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
                                        String d = se.b.d(UserConfig.getInstance(i10).getClientPhone(), false);
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
                                                                ttVar = (tt) yh.j(1, list2);
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
                                                                ttVar = (tt) yh.j(1, list2);
                                                            }
                                                            ttVar2 = ttVar;
                                                        } else {
                                                            ttVar2 = (tt) list2.get(0);
                                                        }
                                                    }
                                                    if (ttVar2 != null) {
                                                        rj0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                rj0Var.setText(d.substring(0, 1));
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
                                ng0 ng0Var3 = ng0Var;
                                ng0Var3.H = false;
                                og0 og0Var2 = ng0Var3.S;
                                og0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.z4.x0(og0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    og0Var2.u1(6, true, bundle, false);
                                    return;
                                }
                                og0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final ng0 ng0Var2 = this.f37377b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        tt ttVar;
                        switch (r4) {
                            case 0:
                                ng0 ng0Var22 = ng0Var2;
                                rj0 rj0Var = ng0Var22.f39343a;
                                HashMap hashMap = ng0Var22.D;
                                ArrayList arrayList = ng0Var22.B;
                                HashMap hashMap2 = ng0Var22.C;
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
                                                obj.f41631a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f41632b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f41631a = str2;
                                                }
                                                obj.f41633c = tL_help_countryCode.country_code;
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
                                    og0 og0Var = ng0Var22.S;
                                    if (og0Var.C == 2) {
                                        i10 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
                                        String d = se.b.d(UserConfig.getInstance(i10).getClientPhone(), false);
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
                                                                ttVar = (tt) yh.j(1, list2);
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
                                                                ttVar = (tt) yh.j(1, list2);
                                                            }
                                                            ttVar2 = ttVar;
                                                        } else {
                                                            ttVar2 = (tt) list2.get(0);
                                                        }
                                                    }
                                                    if (ttVar2 != null) {
                                                        rj0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                rj0Var.setText(d.substring(0, 1));
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
                                ng0 ng0Var3 = ng0Var2;
                                ng0Var3.H = false;
                                og0 og0Var2 = ng0Var3.S;
                                og0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.z4.x0(og0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    og0Var2.u1(6, true, bundle, false);
                                    return;
                                }
                                og0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
