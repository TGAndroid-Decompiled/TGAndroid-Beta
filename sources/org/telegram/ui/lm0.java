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
public final class lm0 implements RequestDelegate {
    public final xm0 f35374a;
    public final String f35375b;
    public final TL_account.saveSecureValue f35376c;
    public final TLRPC.TL_secureRequiredType d;
    public final TLRPC.TL_secureRequiredType e;
    public final ArrayList f35377f;
    public final SecureDocument f35378g;
    public final SecureDocument h;
    public final SecureDocument f35379i;
    public final ArrayList f35380j;
    public final String f35381k;
    public final String f35382l;
    public final Runnable f35383m;
    public final mm0 f35384n;
    public final TLRPC.TL_inputSecureValue f35385o;
    public final mm0 f35386p;

    public lm0(mm0 mm0Var, xm0 xm0Var, String str, TL_account.saveSecureValue savesecurevalue, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, SecureDocument secureDocument, SecureDocument secureDocument2, SecureDocument secureDocument3, ArrayList arrayList2, String str2, String str3, Runnable runnable, mm0 mm0Var2, TLRPC.TL_inputSecureValue tL_inputSecureValue) {
        this.f35386p = mm0Var;
        this.f35374a = xm0Var;
        this.f35375b = str;
        this.f35376c = savesecurevalue;
        this.d = tL_secureRequiredType;
        this.e = tL_secureRequiredType2;
        this.f35377f = arrayList;
        this.f35378g = secureDocument;
        this.h = secureDocument2;
        this.f35379i = secureDocument3;
        this.f35380j = arrayList2;
        this.f35381k = str2;
        this.f35382l = str3;
        this.f35383m = runnable;
        this.f35384n = mm0Var2;
        this.f35385o = tL_inputSecureValue;
    }

    public final void a(final TLRPC.TL_error tL_error, final TLRPC.TL_secureValue tL_secureValue, final TLRPC.TL_secureValue tL_secureValue2) {
        mm0 mm0Var = this.f35386p;
        final boolean z10 = mm0Var.f35726b;
        final int i10 = mm0Var.f35727c;
        final xm0 xm0Var = this.f35374a;
        final String str = this.f35375b;
        final TL_account.saveSecureValue savesecurevalue = this.f35376c;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType = this.d;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.e;
        final ArrayList arrayList = this.f35377f;
        final SecureDocument secureDocument = this.f35378g;
        final SecureDocument secureDocument2 = this.h;
        final SecureDocument secureDocument3 = this.f35379i;
        final ArrayList arrayList2 = this.f35380j;
        final String str2 = this.f35381k;
        final String str3 = this.f35382l;
        final Runnable runnable = this.f35383m;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                jn0 jn0Var;
                TLRPC.TL_secureRequiredType tL_secureRequiredType3;
                int i11;
                mm0 mm0Var2 = lm0.this.f35386p;
                jn0 jn0Var2 = mm0Var2.d;
                TLRPC.TL_error tL_error2 = tL_error;
                String str4 = str;
                if (tL_error2 != null) {
                    xm0 xm0Var2 = xm0Var;
                    if (xm0Var2 != null) {
                        xm0Var2.c(tL_error2.text, str4);
                    }
                    i11 = ((org.telegram.ui.ActionBar.o2) jn0Var2).currentAccount;
                    org.telegram.ui.Components.e5.f0(i11, tL_error2, jn0Var2, savesecurevalue, str4);
                    return;
                }
                boolean z11 = z10;
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType2;
                if (z11) {
                    if (tL_secureRequiredType4 != null) {
                        jn0Var2.H1(tL_secureRequiredType4);
                    } else {
                        jn0Var2.H1(tL_secureRequiredType5);
                    }
                } else {
                    jn0Var2.H1(tL_secureRequiredType5);
                    jn0Var2.H1(tL_secureRequiredType4);
                }
                TLRPC.TL_secureValue tL_secureValue3 = tL_secureValue;
                if (tL_secureValue3 != null) {
                    jn0Var2.f34822y.values.add(tL_secureValue3);
                }
                TLRPC.TL_secureValue tL_secureValue4 = tL_secureValue2;
                if (tL_secureValue4 != null) {
                    jn0Var2.f34822y.values.add(tL_secureValue4);
                }
                ArrayList arrayList3 = arrayList;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        SecureDocument secureDocument4 = (SecureDocument) arrayList3.get(i12);
                        if (secureDocument4.inputFile != null) {
                            int size2 = tL_secureValue3.files.size();
                            int i13 = 0;
                            while (i13 < size2) {
                                TLRPC.SecureFile secureFile = tL_secureValue3.files.get(i13);
                                if (secureFile instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) secureFile;
                                    jn0Var = jn0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                    if (Utilities.arraysEquals(secureDocument4.fileSecret, 0, tL_secureFile.secret, 0)) {
                                        mm0.a(mm0Var2, secureDocument4, tL_secureFile);
                                        break;
                                    }
                                } else {
                                    jn0Var = jn0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                }
                                i13++;
                                jn0Var2 = jn0Var;
                                tL_secureRequiredType5 = tL_secureRequiredType3;
                            }
                        }
                        jn0Var = jn0Var2;
                        tL_secureRequiredType3 = tL_secureRequiredType5;
                        i12++;
                        jn0Var2 = jn0Var;
                        tL_secureRequiredType5 = tL_secureRequiredType3;
                    }
                }
                jn0 jn0Var3 = jn0Var2;
                TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType5;
                SecureDocument secureDocument5 = secureDocument;
                if (secureDocument5 != null && secureDocument5.inputFile != null) {
                    TLRPC.SecureFile secureFile2 = tL_secureValue3.selfie;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile2;
                        if (Utilities.arraysEquals(secureDocument5.fileSecret, 0, tL_secureFile2.secret, 0)) {
                            mm0.a(mm0Var2, secureDocument5, tL_secureFile2);
                        }
                    }
                }
                SecureDocument secureDocument6 = secureDocument2;
                if (secureDocument6 != null && secureDocument6.inputFile != null) {
                    TLRPC.SecureFile secureFile3 = tL_secureValue3.front_side;
                    if (secureFile3 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile3;
                        if (Utilities.arraysEquals(secureDocument6.fileSecret, 0, tL_secureFile3.secret, 0)) {
                            mm0.a(mm0Var2, secureDocument6, tL_secureFile3);
                        }
                    }
                }
                SecureDocument secureDocument7 = secureDocument3;
                if (secureDocument7 != null && secureDocument7.inputFile != null) {
                    TLRPC.SecureFile secureFile4 = tL_secureValue3.reverse_side;
                    if (secureFile4 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile4;
                        if (Utilities.arraysEquals(secureDocument7.fileSecret, 0, tL_secureFile4.secret, 0)) {
                            mm0.a(mm0Var2, secureDocument7, tL_secureFile4);
                        }
                    }
                }
                ArrayList arrayList4 = arrayList2;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    int size3 = arrayList4.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        SecureDocument secureDocument8 = (SecureDocument) arrayList4.get(i14);
                        if (secureDocument8.inputFile != null) {
                            int size4 = tL_secureValue3.translation.size();
                            for (int i15 = 0; i15 < size4; i15++) {
                                TLRPC.SecureFile secureFile5 = tL_secureValue3.translation.get(i15);
                                if (secureFile5 instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) secureFile5;
                                    if (Utilities.arraysEquals(secureDocument8.fileSecret, 0, tL_secureFile5.secret, 0)) {
                                        mm0.a(mm0Var2, secureDocument8, tL_secureFile5);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                jn0Var3.L1(tL_secureRequiredType6, str4, str2, tL_secureRequiredType4, str3, z11, i10);
                runnable.run();
            }
        });
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        lm0 lm0Var;
        TLRPC.TL_inputSecureValue tL_inputSecureValue;
        int i10;
        int i11;
        jn0 jn0Var = this.f35386p.d;
        if (tL_error != null) {
            boolean equals = tL_error.text.equals("EMAIL_VERIFICATION_NEEDED");
            String str = this.f35375b;
            if (equals) {
                TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                sendverifyemailcode.email = str;
                i11 = ((org.telegram.ui.ActionBar.o2) jn0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(sendverifyemailcode, new ci.gd(this, this.f35375b, this.e, this.f35384n, this.f35374a, 10));
                return;
            }
            lm0Var = this;
            if (tL_error.text.equals("PHONE_VERIFICATION_NEEDED")) {
                AndroidUtilities.runOnUIThread(new mf0(lm0Var.f35374a, tL_error, str, 11));
                return;
            }
        } else {
            lm0Var = this;
        }
        if (tL_error == null && (tL_inputSecureValue = lm0Var.f35385o) != null) {
            TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
            savesecurevalue.value = tL_inputSecureValue;
            savesecurevalue.secure_secret_id = jn0Var.f34772b1;
            i10 = ((org.telegram.ui.ActionBar.o2) jn0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(savesecurevalue, new yb0(7, this, (TLRPC.TL_secureValue) tLObject));
            return;
        }
        a(tL_error, (TLRPC.TL_secureValue) tLObject, null);
    }
}
