package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ij0 implements RequestDelegate {
    public final tj0 f48054a;
    public final String f48055b;
    public final TL_account.saveSecureValue f48056c;
    public final TLRPC.TL_secureRequiredType d;
    public final TLRPC.TL_secureRequiredType f48057e;
    public final ArrayList f48058f;
    public final org.telegram.messenger.cw f48059g;
    public final org.telegram.messenger.cw h;
    public final org.telegram.messenger.cw f48060i;
    public final ArrayList f48061j;
    public final String f48062k;
    public final String f48063l;
    public final Runnable f48064m;
    public final jj0 f48065n;
    public final TLRPC.TL_inputSecureValue f48066o;
    public final jj0 f48067p;

    public ij0(jj0 jj0Var, tj0 tj0Var, String str, TL_account.saveSecureValue savesecurevalue, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, org.telegram.messenger.cw cwVar, org.telegram.messenger.cw cwVar2, org.telegram.messenger.cw cwVar3, ArrayList arrayList2, String str2, String str3, Runnable runnable, jj0 jj0Var2, TLRPC.TL_inputSecureValue tL_inputSecureValue) {
        this.f48067p = jj0Var;
        this.f48054a = tj0Var;
        this.f48055b = str;
        this.f48056c = savesecurevalue;
        this.d = tL_secureRequiredType;
        this.f48057e = tL_secureRequiredType2;
        this.f48058f = arrayList;
        this.f48059g = cwVar;
        this.h = cwVar2;
        this.f48060i = cwVar3;
        this.f48061j = arrayList2;
        this.f48062k = str2;
        this.f48063l = str3;
        this.f48064m = runnable;
        this.f48065n = jj0Var2;
        this.f48066o = tL_inputSecureValue;
    }

    public final void a(final TLRPC.TL_error tL_error, final TLRPC.TL_secureValue tL_secureValue, final TLRPC.TL_secureValue tL_secureValue2) {
        jj0 jj0Var = this.f48067p;
        final boolean z10 = jj0Var.f48354b;
        final int i7 = jj0Var.f48355c;
        final tj0 tj0Var = this.f48054a;
        final String str = this.f48055b;
        final TL_account.saveSecureValue savesecurevalue = this.f48056c;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType = this.d;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.f48057e;
        final ArrayList arrayList = this.f48058f;
        final org.telegram.messenger.cw cwVar = this.f48059g;
        final org.telegram.messenger.cw cwVar2 = this.h;
        final org.telegram.messenger.cw cwVar3 = this.f48060i;
        final ArrayList arrayList2 = this.f48061j;
        final String str2 = this.f48062k;
        final String str3 = this.f48063l;
        final Runnable runnable = this.f48064m;
        org.telegram.messenger.g0.h3(new Runnable() {
            @Override
            public final void run() {
                ek0 ek0Var;
                TLRPC.TL_secureRequiredType tL_secureRequiredType3;
                int i10;
                jj0 jj0Var2 = ij0.this.f48067p;
                ek0 ek0Var2 = jj0Var2.d;
                TLRPC.TL_error tL_error2 = tL_error;
                String str4 = str;
                int i11 = 0;
                if (tL_error2 != null) {
                    tj0 tj0Var2 = tj0Var;
                    if (tj0Var2 != null) {
                        tj0Var2.d(tL_error2.text, str4);
                    }
                    i10 = ((org.telegram.ui.ActionBar.e2) ek0Var2).currentAccount;
                    org.telegram.ui.Components.t4.c0(i10, tL_error2, ek0Var2, savesecurevalue, str4);
                    return;
                }
                boolean z11 = z10;
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType2;
                if (z11) {
                    if (tL_secureRequiredType4 != null) {
                        ek0Var2.L1(tL_secureRequiredType4);
                    } else {
                        ek0Var2.L1(tL_secureRequiredType5);
                    }
                } else {
                    ek0Var2.L1(tL_secureRequiredType5);
                    ek0Var2.L1(tL_secureRequiredType4);
                }
                TLRPC.TL_secureValue tL_secureValue3 = tL_secureValue;
                if (tL_secureValue3 != null) {
                    ek0Var2.E.values.add(tL_secureValue3);
                }
                TLRPC.TL_secureValue tL_secureValue4 = tL_secureValue2;
                if (tL_secureValue4 != null) {
                    ek0Var2.E.values.add(tL_secureValue4);
                }
                ArrayList arrayList3 = arrayList;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        org.telegram.messenger.cw cwVar4 = (org.telegram.messenger.cw) arrayList3.get(i12);
                        if (cwVar4.d != null) {
                            int size2 = tL_secureValue3.files.size();
                            int i13 = i11;
                            while (i13 < size2) {
                                TLRPC.SecureFile secureFile = tL_secureValue3.files.get(i13);
                                if (secureFile instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) secureFile;
                                    ek0Var = ek0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                    if (Utilities.d(cwVar4.f22961e, tL_secureFile.secret, 0)) {
                                        jj0.a(jj0Var2, cwVar4, tL_secureFile);
                                        break;
                                    }
                                } else {
                                    ek0Var = ek0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                }
                                i13++;
                                ek0Var2 = ek0Var;
                                tL_secureRequiredType5 = tL_secureRequiredType3;
                            }
                        }
                        ek0Var = ek0Var2;
                        tL_secureRequiredType3 = tL_secureRequiredType5;
                        i12++;
                        ek0Var2 = ek0Var;
                        tL_secureRequiredType5 = tL_secureRequiredType3;
                        i11 = 0;
                    }
                }
                ek0 ek0Var3 = ek0Var2;
                TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType5;
                org.telegram.messenger.cw cwVar5 = cwVar;
                if (cwVar5 != null && cwVar5.d != null) {
                    TLRPC.SecureFile secureFile2 = tL_secureValue3.selfie;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile2;
                        if (Utilities.d(cwVar5.f22961e, tL_secureFile2.secret, 0)) {
                            jj0.a(jj0Var2, cwVar5, tL_secureFile2);
                        }
                    }
                }
                org.telegram.messenger.cw cwVar6 = cwVar2;
                if (cwVar6 != null && cwVar6.d != null) {
                    TLRPC.SecureFile secureFile3 = tL_secureValue3.front_side;
                    if (secureFile3 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile3;
                        if (Utilities.d(cwVar6.f22961e, tL_secureFile3.secret, 0)) {
                            jj0.a(jj0Var2, cwVar6, tL_secureFile3);
                        }
                    }
                }
                org.telegram.messenger.cw cwVar7 = cwVar3;
                if (cwVar7 != null && cwVar7.d != null) {
                    TLRPC.SecureFile secureFile4 = tL_secureValue3.reverse_side;
                    if (secureFile4 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile4;
                        if (Utilities.d(cwVar7.f22961e, tL_secureFile4.secret, 0)) {
                            jj0.a(jj0Var2, cwVar7, tL_secureFile4);
                        }
                    }
                }
                ArrayList arrayList4 = arrayList2;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    int size3 = arrayList4.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        org.telegram.messenger.cw cwVar8 = (org.telegram.messenger.cw) arrayList4.get(i14);
                        if (cwVar8.d != null) {
                            int size4 = tL_secureValue3.translation.size();
                            for (int i15 = 0; i15 < size4; i15++) {
                                TLRPC.SecureFile secureFile5 = tL_secureValue3.translation.get(i15);
                                if (secureFile5 instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) secureFile5;
                                    if (Utilities.d(cwVar8.f22961e, tL_secureFile5.secret, 0)) {
                                        jj0.a(jj0Var2, cwVar8, tL_secureFile5);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                ek0Var3.P1(tL_secureRequiredType6, str4, str2, tL_secureRequiredType4, str3, z11, i7);
                runnable.run();
            }
        });
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ij0 ij0Var;
        TLRPC.TL_inputSecureValue tL_inputSecureValue;
        int i7;
        int i10;
        ek0 ek0Var = this.f48067p.d;
        if (tL_error != null) {
            boolean equals = tL_error.text.equals("EMAIL_VERIFICATION_NEEDED");
            String str = this.f48055b;
            if (equals) {
                TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                sendverifyemailcode.email = str;
                i10 = ((org.telegram.ui.ActionBar.e2) ek0Var).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new di.k7(this, this.f48055b, this.f48057e, this.f48065n, this.f48054a, 11));
                return;
            }
            ij0Var = this;
            if (tL_error.text.equals("PHONE_VERIFICATION_NEEDED")) {
                org.telegram.messenger.g0.h3(new lc0(ij0Var.f48054a, tL_error, str, 13));
                return;
            }
        } else {
            ij0Var = this;
        }
        if (tL_error == null && (tL_inputSecureValue = ij0Var.f48066o) != null) {
            TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
            savesecurevalue.value = tL_inputSecureValue;
            savesecurevalue.secure_secret_id = ek0Var.f46800c1;
            i7 = ((org.telegram.ui.ActionBar.e2) ek0Var).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(savesecurevalue, new b00(15, this, (TLRPC.TL_secureValue) tLObject));
            return;
        }
        a(tL_error, (TLRPC.TL_secureValue) tLObject, null);
    }
}
