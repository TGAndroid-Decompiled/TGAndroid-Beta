package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class cj0 implements RequestDelegate {
    public final nj0 f44364a;
    public final String f44365b;
    public final TL_account.saveSecureValue f44366c;
    public final TLRPC.TL_secureRequiredType d;
    public final TLRPC.TL_secureRequiredType f44367e;
    public final ArrayList f44368f;
    public final org.telegram.messenger.wv f44369g;
    public final org.telegram.messenger.wv h;
    public final org.telegram.messenger.wv f44370i;
    public final ArrayList f44371j;
    public final String f44372k;
    public final String f44373l;
    public final Runnable f44374m;
    public final dj0 f44375n;
    public final TLRPC.TL_inputSecureValue f44376o;
    public final dj0 f44377p;

    public cj0(dj0 dj0Var, nj0 nj0Var, String str, TL_account.saveSecureValue savesecurevalue, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, org.telegram.messenger.wv wvVar, org.telegram.messenger.wv wvVar2, org.telegram.messenger.wv wvVar3, ArrayList arrayList2, String str2, String str3, Runnable runnable, dj0 dj0Var2, TLRPC.TL_inputSecureValue tL_inputSecureValue) {
        this.f44377p = dj0Var;
        this.f44364a = nj0Var;
        this.f44365b = str;
        this.f44366c = savesecurevalue;
        this.d = tL_secureRequiredType;
        this.f44367e = tL_secureRequiredType2;
        this.f44368f = arrayList;
        this.f44369g = wvVar;
        this.h = wvVar2;
        this.f44370i = wvVar3;
        this.f44371j = arrayList2;
        this.f44372k = str2;
        this.f44373l = str3;
        this.f44374m = runnable;
        this.f44375n = dj0Var2;
        this.f44376o = tL_inputSecureValue;
    }

    public final void a(final TLRPC.TL_error tL_error, final TLRPC.TL_secureValue tL_secureValue, final TLRPC.TL_secureValue tL_secureValue2) {
        dj0 dj0Var = this.f44377p;
        final boolean z10 = dj0Var.f44723b;
        final int i3 = dj0Var.f44724c;
        final nj0 nj0Var = this.f44364a;
        final String str = this.f44365b;
        final TL_account.saveSecureValue savesecurevalue = this.f44366c;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType = this.d;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.f44367e;
        final ArrayList arrayList = this.f44368f;
        final org.telegram.messenger.wv wvVar = this.f44369g;
        final org.telegram.messenger.wv wvVar2 = this.h;
        final org.telegram.messenger.wv wvVar3 = this.f44370i;
        final ArrayList arrayList2 = this.f44371j;
        final String str2 = this.f44372k;
        final String str3 = this.f44373l;
        final Runnable runnable = this.f44374m;
        org.telegram.messenger.g0.h3(new Runnable() {
            @Override
            public final void run() {
                yj0 yj0Var;
                TLRPC.TL_secureRequiredType tL_secureRequiredType3;
                int i10;
                dj0 dj0Var2 = cj0.this.f44377p;
                yj0 yj0Var2 = dj0Var2.d;
                TLRPC.TL_error tL_error2 = tL_error;
                String str4 = str;
                int i11 = 0;
                if (tL_error2 != null) {
                    nj0 nj0Var2 = nj0Var;
                    if (nj0Var2 != null) {
                        nj0Var2.f(tL_error2.text, str4);
                    }
                    i10 = ((org.telegram.ui.ActionBar.d2) yj0Var2).currentAccount;
                    org.telegram.ui.Components.t4.e0(i10, tL_error2, yj0Var2, savesecurevalue, str4);
                    return;
                }
                boolean z11 = z10;
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType2;
                if (z11) {
                    if (tL_secureRequiredType4 != null) {
                        yj0Var2.L1(tL_secureRequiredType4);
                    } else {
                        yj0Var2.L1(tL_secureRequiredType5);
                    }
                } else {
                    yj0Var2.L1(tL_secureRequiredType5);
                    yj0Var2.L1(tL_secureRequiredType4);
                }
                TLRPC.TL_secureValue tL_secureValue3 = tL_secureValue;
                if (tL_secureValue3 != null) {
                    yj0Var2.E.values.add(tL_secureValue3);
                }
                TLRPC.TL_secureValue tL_secureValue4 = tL_secureValue2;
                if (tL_secureValue4 != null) {
                    yj0Var2.E.values.add(tL_secureValue4);
                }
                ArrayList arrayList3 = arrayList;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        org.telegram.messenger.wv wvVar4 = (org.telegram.messenger.wv) arrayList3.get(i12);
                        if (wvVar4.d != null) {
                            int size2 = tL_secureValue3.files.size();
                            int i13 = i11;
                            while (i13 < size2) {
                                TLRPC.SecureFile secureFile = tL_secureValue3.files.get(i13);
                                if (secureFile instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) secureFile;
                                    yj0Var = yj0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                    if (Utilities.d(wvVar4.f26265e, tL_secureFile.secret, 0)) {
                                        dj0.a(dj0Var2, wvVar4, tL_secureFile);
                                        break;
                                    }
                                } else {
                                    yj0Var = yj0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                }
                                i13++;
                                yj0Var2 = yj0Var;
                                tL_secureRequiredType5 = tL_secureRequiredType3;
                            }
                        }
                        yj0Var = yj0Var2;
                        tL_secureRequiredType3 = tL_secureRequiredType5;
                        i12++;
                        yj0Var2 = yj0Var;
                        tL_secureRequiredType5 = tL_secureRequiredType3;
                        i11 = 0;
                    }
                }
                yj0 yj0Var3 = yj0Var2;
                TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType5;
                org.telegram.messenger.wv wvVar5 = wvVar;
                if (wvVar5 != null && wvVar5.d != null) {
                    TLRPC.SecureFile secureFile2 = tL_secureValue3.selfie;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile2;
                        if (Utilities.d(wvVar5.f26265e, tL_secureFile2.secret, 0)) {
                            dj0.a(dj0Var2, wvVar5, tL_secureFile2);
                        }
                    }
                }
                org.telegram.messenger.wv wvVar6 = wvVar2;
                if (wvVar6 != null && wvVar6.d != null) {
                    TLRPC.SecureFile secureFile3 = tL_secureValue3.front_side;
                    if (secureFile3 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile3;
                        if (Utilities.d(wvVar6.f26265e, tL_secureFile3.secret, 0)) {
                            dj0.a(dj0Var2, wvVar6, tL_secureFile3);
                        }
                    }
                }
                org.telegram.messenger.wv wvVar7 = wvVar3;
                if (wvVar7 != null && wvVar7.d != null) {
                    TLRPC.SecureFile secureFile4 = tL_secureValue3.reverse_side;
                    if (secureFile4 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile4;
                        if (Utilities.d(wvVar7.f26265e, tL_secureFile4.secret, 0)) {
                            dj0.a(dj0Var2, wvVar7, tL_secureFile4);
                        }
                    }
                }
                ArrayList arrayList4 = arrayList2;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    int size3 = arrayList4.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        org.telegram.messenger.wv wvVar8 = (org.telegram.messenger.wv) arrayList4.get(i14);
                        if (wvVar8.d != null) {
                            int size4 = tL_secureValue3.translation.size();
                            for (int i15 = 0; i15 < size4; i15++) {
                                TLRPC.SecureFile secureFile5 = tL_secureValue3.translation.get(i15);
                                if (secureFile5 instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) secureFile5;
                                    if (Utilities.d(wvVar8.f26265e, tL_secureFile5.secret, 0)) {
                                        dj0.a(dj0Var2, wvVar8, tL_secureFile5);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                yj0Var3.P1(tL_secureRequiredType6, str4, str2, tL_secureRequiredType4, str3, z11, i3);
                runnable.run();
            }
        });
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        cj0 cj0Var;
        TLRPC.TL_inputSecureValue tL_inputSecureValue;
        int i3;
        int i10;
        yj0 yj0Var = this.f44377p.d;
        if (tL_error != null) {
            boolean equals = tL_error.text.equals("EMAIL_VERIFICATION_NEEDED");
            String str = this.f44365b;
            if (equals) {
                TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                sendverifyemailcode.email = str;
                i10 = ((org.telegram.ui.ActionBar.d2) yj0Var).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new ci.s7(this, this.f44365b, this.f44367e, this.f44375n, this.f44364a, 11));
                return;
            }
            cj0Var = this;
            if (tL_error.text.equals("PHONE_VERIFICATION_NEEDED")) {
                org.telegram.messenger.g0.h3(new hc0(cj0Var.f44364a, tL_error, str, false, 14));
                return;
            }
        } else {
            cj0Var = this;
        }
        if (tL_error == null && (tL_inputSecureValue = cj0Var.f44376o) != null) {
            TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
            savesecurevalue.value = tL_inputSecureValue;
            savesecurevalue.secure_secret_id = yj0Var.f52292c1;
            i3 = ((org.telegram.ui.ActionBar.d2) yj0Var).currentAccount;
            ConnectionsManager.getInstance(i3).sendRequest(savesecurevalue, new xy(16, this, (TLRPC.TL_secureValue) tLObject));
            return;
        }
        a(tL_error, (TLRPC.TL_secureValue) tLObject, null);
    }
}
