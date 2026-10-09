package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class pm0 implements RequestDelegate {
    public final bn0 f40831a;
    public final String f40832b;
    public final TL_account.saveSecureValue f40833c;
    public final TLRPC.TL_secureRequiredType d;
    public final TLRPC.TL_secureRequiredType f40834e;
    public final ArrayList f40835f;
    public final SecureDocument f40836g;
    public final SecureDocument h;
    public final SecureDocument f40837i;
    public final ArrayList f40838j;
    public final String f40839k;
    public final String f40840l;
    public final Runnable f40841m;
    public final qm0 f40842n;
    public final TLRPC.TL_inputSecureValue f40843o;
    public final qm0 f40844p;

    public pm0(qm0 qm0Var, bn0 bn0Var, String str, TL_account.saveSecureValue savesecurevalue, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, SecureDocument secureDocument, SecureDocument secureDocument2, SecureDocument secureDocument3, ArrayList arrayList2, String str2, String str3, Runnable runnable, qm0 qm0Var2, TLRPC.TL_inputSecureValue tL_inputSecureValue) {
        this.f40844p = qm0Var;
        this.f40831a = bn0Var;
        this.f40832b = str;
        this.f40833c = savesecurevalue;
        this.d = tL_secureRequiredType;
        this.f40834e = tL_secureRequiredType2;
        this.f40835f = arrayList;
        this.f40836g = secureDocument;
        this.h = secureDocument2;
        this.f40837i = secureDocument3;
        this.f40838j = arrayList2;
        this.f40839k = str2;
        this.f40840l = str3;
        this.f40841m = runnable;
        this.f40842n = qm0Var2;
        this.f40843o = tL_inputSecureValue;
    }

    public final void a(final TLRPC.TL_error tL_error, final TLRPC.TL_secureValue tL_secureValue, final TLRPC.TL_secureValue tL_secureValue2) {
        qm0 qm0Var = this.f40844p;
        final boolean z10 = qm0Var.f41150b;
        final int i10 = qm0Var.f41151c;
        final bn0 bn0Var = this.f40831a;
        final String str = this.f40832b;
        final TL_account.saveSecureValue savesecurevalue = this.f40833c;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType = this.d;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.f40834e;
        final ArrayList arrayList = this.f40835f;
        final SecureDocument secureDocument = this.f40836g;
        final SecureDocument secureDocument2 = this.h;
        final SecureDocument secureDocument3 = this.f40837i;
        final ArrayList arrayList2 = this.f40838j;
        final String str2 = this.f40839k;
        final String str3 = this.f40840l;
        final Runnable runnable = this.f40841m;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                nn0 nn0Var;
                TLRPC.TL_secureRequiredType tL_secureRequiredType3;
                int i11;
                qm0 qm0Var2 = pm0.this.f40844p;
                nn0 nn0Var2 = qm0Var2.d;
                TLRPC.TL_error tL_error2 = tL_error;
                String str4 = str;
                int i12 = 0;
                if (tL_error2 != null) {
                    bn0 bn0Var2 = bn0Var;
                    if (bn0Var2 != null) {
                        bn0Var2.c(tL_error2.text, str4);
                    }
                    i11 = ((org.telegram.ui.ActionBar.n2) nn0Var2).currentAccount;
                    org.telegram.ui.Components.g5.e0(i11, tL_error2, nn0Var2, savesecurevalue, str4);
                    return;
                }
                boolean z11 = z10;
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType2;
                if (z11) {
                    if (tL_secureRequiredType4 != null) {
                        nn0Var2.G1(tL_secureRequiredType4);
                    } else {
                        nn0Var2.G1(tL_secureRequiredType5);
                    }
                } else {
                    nn0Var2.G1(tL_secureRequiredType5);
                    nn0Var2.G1(tL_secureRequiredType4);
                }
                TLRPC.TL_secureValue tL_secureValue3 = tL_secureValue;
                if (tL_secureValue3 != null) {
                    nn0Var2.f40296y.values.add(tL_secureValue3);
                }
                TLRPC.TL_secureValue tL_secureValue4 = tL_secureValue2;
                if (tL_secureValue4 != null) {
                    nn0Var2.f40296y.values.add(tL_secureValue4);
                }
                ArrayList arrayList3 = arrayList;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size) {
                        SecureDocument secureDocument4 = (SecureDocument) arrayList3.get(i13);
                        if (secureDocument4.inputFile != null) {
                            int size2 = tL_secureValue3.files.size();
                            int i14 = i12;
                            while (i14 < size2) {
                                TLRPC.SecureFile secureFile = tL_secureValue3.files.get(i14);
                                if (secureFile instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) secureFile;
                                    nn0Var = nn0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                    if (Utilities.arraysEquals(secureDocument4.fileSecret, 0, tL_secureFile.secret, 0)) {
                                        qm0.a(qm0Var2, secureDocument4, tL_secureFile);
                                        break;
                                    }
                                } else {
                                    nn0Var = nn0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                }
                                i14++;
                                nn0Var2 = nn0Var;
                                tL_secureRequiredType5 = tL_secureRequiredType3;
                            }
                        }
                        nn0Var = nn0Var2;
                        tL_secureRequiredType3 = tL_secureRequiredType5;
                        i13++;
                        nn0Var2 = nn0Var;
                        tL_secureRequiredType5 = tL_secureRequiredType3;
                        i12 = 0;
                    }
                }
                nn0 nn0Var3 = nn0Var2;
                TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType5;
                SecureDocument secureDocument5 = secureDocument;
                if (secureDocument5 != null && secureDocument5.inputFile != null) {
                    TLRPC.SecureFile secureFile2 = tL_secureValue3.selfie;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile2;
                        if (Utilities.arraysEquals(secureDocument5.fileSecret, 0, tL_secureFile2.secret, 0)) {
                            qm0.a(qm0Var2, secureDocument5, tL_secureFile2);
                        }
                    }
                }
                SecureDocument secureDocument6 = secureDocument2;
                if (secureDocument6 != null && secureDocument6.inputFile != null) {
                    TLRPC.SecureFile secureFile3 = tL_secureValue3.front_side;
                    if (secureFile3 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile3;
                        if (Utilities.arraysEquals(secureDocument6.fileSecret, 0, tL_secureFile3.secret, 0)) {
                            qm0.a(qm0Var2, secureDocument6, tL_secureFile3);
                        }
                    }
                }
                SecureDocument secureDocument7 = secureDocument3;
                if (secureDocument7 != null && secureDocument7.inputFile != null) {
                    TLRPC.SecureFile secureFile4 = tL_secureValue3.reverse_side;
                    if (secureFile4 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile4;
                        if (Utilities.arraysEquals(secureDocument7.fileSecret, 0, tL_secureFile4.secret, 0)) {
                            qm0.a(qm0Var2, secureDocument7, tL_secureFile4);
                        }
                    }
                }
                ArrayList arrayList4 = arrayList2;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    int size3 = arrayList4.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        SecureDocument secureDocument8 = (SecureDocument) arrayList4.get(i15);
                        if (secureDocument8.inputFile != null) {
                            int size4 = tL_secureValue3.translation.size();
                            for (int i16 = 0; i16 < size4; i16++) {
                                TLRPC.SecureFile secureFile5 = tL_secureValue3.translation.get(i16);
                                if (secureFile5 instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) secureFile5;
                                    if (Utilities.arraysEquals(secureDocument8.fileSecret, 0, tL_secureFile5.secret, 0)) {
                                        qm0.a(qm0Var2, secureDocument8, tL_secureFile5);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                nn0Var3.K1(tL_secureRequiredType6, str4, str2, tL_secureRequiredType4, str3, z11, i10);
                runnable.run();
            }
        });
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        pm0 pm0Var;
        TLRPC.TL_inputSecureValue tL_inputSecureValue;
        int i10;
        int i11;
        nn0 nn0Var = this.f40844p.d;
        if (tL_error != null) {
            boolean equals = tL_error.text.equals("EMAIL_VERIFICATION_NEEDED");
            String str = this.f40832b;
            if (equals) {
                TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                sendverifyemailcode.email = str;
                i11 = ((org.telegram.ui.ActionBar.n2) nn0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(sendverifyemailcode, new ci.hd(this, this.f40832b, this.f40834e, this.f40842n, this.f40831a, 10));
                return;
            }
            pm0Var = this;
            if (tL_error.text.equals("PHONE_VERIFICATION_NEEDED")) {
                AndroidUtilities.runOnUIThread(new of0(pm0Var.f40831a, tL_error, str, 11));
                return;
            }
        } else {
            pm0Var = this;
        }
        if (tL_error == null && (tL_inputSecureValue = pm0Var.f40843o) != null) {
            TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
            savesecurevalue.value = tL_inputSecureValue;
            savesecurevalue.secure_secret_id = nn0Var.f40245b1;
            i10 = ((org.telegram.ui.ActionBar.n2) nn0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(savesecurevalue, new ac0(7, this, (TLRPC.TL_secureValue) tLObject));
            return;
        }
        a(tL_error, (TLRPC.TL_secureValue) tLObject, null);
    }
}
