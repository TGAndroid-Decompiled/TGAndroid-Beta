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
public final class gg0 implements RequestDelegate {
    public final int f34614a;
    public final mg0 f34615b;

    public gg0(mg0 mg0Var, int i10) {
        this.f34614a = i10;
        this.f34615b = mg0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f34614a) {
            case 0:
                final mg0 mg0Var = this.f34615b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        st stVar;
                        switch (r4) {
                            case 0:
                                mg0 mg0Var2 = mg0Var;
                                qj0 qj0Var = mg0Var2.f36293a;
                                HashMap hashMap = mg0Var2.D;
                                ArrayList arrayList = mg0Var2.B;
                                HashMap hashMap2 = mg0Var2.C;
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
                                                obj.f38435a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f38436b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f38435a = str2;
                                                }
                                                obj.f38437c = tL_help_countryCode.country_code;
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
                                    ng0 ng0Var = mg0Var2.S;
                                    if (ng0Var.C == 2) {
                                        i10 = ((org.telegram.ui.ActionBar.p2) ng0Var).currentAccount;
                                        String d = se.b.d(UserConfig.getInstance(i10).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i13 = 4; i13 >= 1; i13--) {
                                                    String substring = d.substring(0, i13);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    st stVar2 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                stVar = (st) yh.k(1, list2);
                                                                int size = arrayList.size();
                                                                int i14 = 0;
                                                                while (true) {
                                                                    if (i14 < size) {
                                                                        Object obj2 = arrayList.get(i14);
                                                                        i14++;
                                                                        st stVar3 = (st) obj2;
                                                                        if (Objects.equals(stVar3.d, string)) {
                                                                            stVar = stVar3;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                stVar = (st) yh.k(1, list2);
                                                            }
                                                            stVar2 = stVar;
                                                        } else {
                                                            stVar2 = (st) list2.get(0);
                                                        }
                                                    }
                                                    if (stVar2 != null) {
                                                        qj0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                qj0Var.setText(d.substring(0, 1));
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
                                mg0 mg0Var3 = mg0Var;
                                mg0Var3.H = false;
                                ng0 ng0Var2 = mg0Var3.S;
                                ng0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.z4.x0(ng0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    ng0Var2.u1(6, true, bundle, false);
                                    return;
                                }
                                ng0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final mg0 mg0Var2 = this.f34615b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        st stVar;
                        switch (r4) {
                            case 0:
                                mg0 mg0Var22 = mg0Var2;
                                qj0 qj0Var = mg0Var22.f36293a;
                                HashMap hashMap = mg0Var22.D;
                                ArrayList arrayList = mg0Var22.B;
                                HashMap hashMap2 = mg0Var22.C;
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
                                                obj.f38435a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f38436b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f38435a = str2;
                                                }
                                                obj.f38437c = tL_help_countryCode.country_code;
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
                                    ng0 ng0Var = mg0Var22.S;
                                    if (ng0Var.C == 2) {
                                        i10 = ((org.telegram.ui.ActionBar.p2) ng0Var).currentAccount;
                                        String d = se.b.d(UserConfig.getInstance(i10).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i13 = 4; i13 >= 1; i13--) {
                                                    String substring = d.substring(0, i13);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    st stVar2 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                stVar = (st) yh.k(1, list2);
                                                                int size = arrayList.size();
                                                                int i14 = 0;
                                                                while (true) {
                                                                    if (i14 < size) {
                                                                        Object obj2 = arrayList.get(i14);
                                                                        i14++;
                                                                        st stVar3 = (st) obj2;
                                                                        if (Objects.equals(stVar3.d, string)) {
                                                                            stVar = stVar3;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                stVar = (st) yh.k(1, list2);
                                                            }
                                                            stVar2 = stVar;
                                                        } else {
                                                            stVar2 = (st) list2.get(0);
                                                        }
                                                    }
                                                    if (stVar2 != null) {
                                                        qj0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                qj0Var.setText(d.substring(0, 1));
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
                                mg0 mg0Var3 = mg0Var2;
                                mg0Var3.H = false;
                                ng0 ng0Var2 = mg0Var3.S;
                                ng0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.z4.x0(ng0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    ng0Var2.u1(6, true, bundle, false);
                                    return;
                                }
                                ng0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
