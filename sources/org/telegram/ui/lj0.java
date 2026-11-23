package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class lj0 implements RequestDelegate {
    public final wj0 f49627a;
    public final String f49628b;
    public final TL_account.saveSecureValue f49629c;
    public final TLRPC.TL_secureRequiredType d;
    public final TLRPC.TL_secureRequiredType f49630e;
    public final ArrayList f49631f;
    public final org.telegram.messenger.zv f49632g;
    public final org.telegram.messenger.zv h;
    public final org.telegram.messenger.zv f49633i;
    public final ArrayList f49634j;
    public final String f49635k;
    public final String f49636l;
    public final Runnable f49637m;
    public final mj0 f49638n;
    public final TLRPC.TL_inputSecureValue f49639o;
    public final mj0 f49640p;

    public lj0(mj0 mj0Var, wj0 wj0Var, String str, TL_account.saveSecureValue savesecurevalue, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, org.telegram.messenger.zv zvVar, org.telegram.messenger.zv zvVar2, org.telegram.messenger.zv zvVar3, ArrayList arrayList2, String str2, String str3, Runnable runnable, mj0 mj0Var2, TLRPC.TL_inputSecureValue tL_inputSecureValue) {
        this.f49640p = mj0Var;
        this.f49627a = wj0Var;
        this.f49628b = str;
        this.f49629c = savesecurevalue;
        this.d = tL_secureRequiredType;
        this.f49630e = tL_secureRequiredType2;
        this.f49631f = arrayList;
        this.f49632g = zvVar;
        this.h = zvVar2;
        this.f49633i = zvVar3;
        this.f49634j = arrayList2;
        this.f49635k = str2;
        this.f49636l = str3;
        this.f49637m = runnable;
        this.f49638n = mj0Var2;
        this.f49639o = tL_inputSecureValue;
    }

    public final void a(final TLRPC.TL_error tL_error, final TLRPC.TL_secureValue tL_secureValue, final TLRPC.TL_secureValue tL_secureValue2) {
        mj0 mj0Var = this.f49640p;
        final boolean z10 = mj0Var.f49890b;
        final int i7 = mj0Var.f49891c;
        final wj0 wj0Var = this.f49627a;
        final String str = this.f49628b;
        final TL_account.saveSecureValue savesecurevalue = this.f49629c;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType = this.d;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.f49630e;
        final ArrayList arrayList = this.f49631f;
        final org.telegram.messenger.zv zvVar = this.f49632g;
        final org.telegram.messenger.zv zvVar2 = this.h;
        final org.telegram.messenger.zv zvVar3 = this.f49633i;
        final ArrayList arrayList2 = this.f49634j;
        final String str2 = this.f49635k;
        final String str3 = this.f49636l;
        final Runnable runnable = this.f49637m;
        org.telegram.messenger.g0.g3(new Runnable() {
            @Override
            public final void run() {
                hk0 hk0Var;
                TLRPC.TL_secureRequiredType tL_secureRequiredType3;
                int i10;
                mj0 mj0Var2 = lj0.this.f49640p;
                hk0 hk0Var2 = mj0Var2.d;
                TLRPC.TL_error tL_error2 = tL_error;
                String str4 = str;
                int i11 = 0;
                if (tL_error2 != null) {
                    wj0 wj0Var2 = wj0Var;
                    if (wj0Var2 != null) {
                        wj0Var2.d(tL_error2.text, str4);
                    }
                    i10 = ((org.telegram.ui.ActionBar.g2) hk0Var2).currentAccount;
                    org.telegram.ui.Components.c5.c0(i10, tL_error2, hk0Var2, savesecurevalue, str4);
                    return;
                }
                boolean z11 = z10;
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType2;
                if (z11) {
                    if (tL_secureRequiredType4 != null) {
                        hk0Var2.L1(tL_secureRequiredType4);
                    } else {
                        hk0Var2.L1(tL_secureRequiredType5);
                    }
                } else {
                    hk0Var2.L1(tL_secureRequiredType5);
                    hk0Var2.L1(tL_secureRequiredType4);
                }
                TLRPC.TL_secureValue tL_secureValue3 = tL_secureValue;
                if (tL_secureValue3 != null) {
                    hk0Var2.E.values.add(tL_secureValue3);
                }
                TLRPC.TL_secureValue tL_secureValue4 = tL_secureValue2;
                if (tL_secureValue4 != null) {
                    hk0Var2.E.values.add(tL_secureValue4);
                }
                ArrayList arrayList3 = arrayList;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        org.telegram.messenger.zv zvVar4 = (org.telegram.messenger.zv) arrayList3.get(i12);
                        if (zvVar4.d != null) {
                            int size2 = tL_secureValue3.files.size();
                            int i13 = i11;
                            while (i13 < size2) {
                                TLRPC.SecureFile secureFile = tL_secureValue3.files.get(i13);
                                if (secureFile instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) secureFile;
                                    hk0Var = hk0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                    if (Utilities.d(zvVar4.f28386e, tL_secureFile.secret, 0)) {
                                        mj0.a(mj0Var2, zvVar4, tL_secureFile);
                                        break;
                                    }
                                } else {
                                    hk0Var = hk0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                }
                                i13++;
                                hk0Var2 = hk0Var;
                                tL_secureRequiredType5 = tL_secureRequiredType3;
                            }
                        }
                        hk0Var = hk0Var2;
                        tL_secureRequiredType3 = tL_secureRequiredType5;
                        i12++;
                        hk0Var2 = hk0Var;
                        tL_secureRequiredType5 = tL_secureRequiredType3;
                        i11 = 0;
                    }
                }
                hk0 hk0Var3 = hk0Var2;
                TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType5;
                org.telegram.messenger.zv zvVar5 = zvVar;
                if (zvVar5 != null && zvVar5.d != null) {
                    TLRPC.SecureFile secureFile2 = tL_secureValue3.selfie;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile2;
                        if (Utilities.d(zvVar5.f28386e, tL_secureFile2.secret, 0)) {
                            mj0.a(mj0Var2, zvVar5, tL_secureFile2);
                        }
                    }
                }
                org.telegram.messenger.zv zvVar6 = zvVar2;
                if (zvVar6 != null && zvVar6.d != null) {
                    TLRPC.SecureFile secureFile3 = tL_secureValue3.front_side;
                    if (secureFile3 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile3;
                        if (Utilities.d(zvVar6.f28386e, tL_secureFile3.secret, 0)) {
                            mj0.a(mj0Var2, zvVar6, tL_secureFile3);
                        }
                    }
                }
                org.telegram.messenger.zv zvVar7 = zvVar3;
                if (zvVar7 != null && zvVar7.d != null) {
                    TLRPC.SecureFile secureFile4 = tL_secureValue3.reverse_side;
                    if (secureFile4 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile4;
                        if (Utilities.d(zvVar7.f28386e, tL_secureFile4.secret, 0)) {
                            mj0.a(mj0Var2, zvVar7, tL_secureFile4);
                        }
                    }
                }
                ArrayList arrayList4 = arrayList2;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    int size3 = arrayList4.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        org.telegram.messenger.zv zvVar8 = (org.telegram.messenger.zv) arrayList4.get(i14);
                        if (zvVar8.d != null) {
                            int size4 = tL_secureValue3.translation.size();
                            for (int i15 = 0; i15 < size4; i15++) {
                                TLRPC.SecureFile secureFile5 = tL_secureValue3.translation.get(i15);
                                if (secureFile5 instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) secureFile5;
                                    if (Utilities.d(zvVar8.f28386e, tL_secureFile5.secret, 0)) {
                                        mj0.a(mj0Var2, zvVar8, tL_secureFile5);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                hk0Var3.P1(tL_secureRequiredType6, str4, str2, tL_secureRequiredType4, str3, z11, i7);
                runnable.run();
            }
        });
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        lj0 lj0Var;
        TLRPC.TL_inputSecureValue tL_inputSecureValue;
        int i7;
        int i10;
        hk0 hk0Var = this.f49640p.d;
        if (tL_error != null) {
            boolean equals = tL_error.text.equals("EMAIL_VERIFICATION_NEEDED");
            String str = this.f49628b;
            if (equals) {
                TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                sendverifyemailcode.email = str;
                i10 = ((org.telegram.ui.ActionBar.g2) hk0Var).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new di.m7(this, this.f49628b, this.f49630e, this.f49638n, this.f49627a, 11));
                return;
            }
            lj0Var = this;
            if (tL_error.text.equals("PHONE_VERIFICATION_NEEDED")) {
                org.telegram.messenger.g0.g3(new mc0(lj0Var.f49627a, tL_error, str, 13));
                return;
            }
        } else {
            lj0Var = this;
        }
        if (tL_error == null && (tL_inputSecureValue = lj0Var.f49639o) != null) {
            TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
            savesecurevalue.value = tL_inputSecureValue;
            savesecurevalue.secure_secret_id = hk0Var.f48424c1;
            i7 = ((org.telegram.ui.ActionBar.g2) hk0Var).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(savesecurevalue, new e00(15, this, (TLRPC.TL_secureValue) tLObject));
            return;
        }
        a(tL_error, (TLRPC.TL_secureValue) tLObject, null);
    }
}
