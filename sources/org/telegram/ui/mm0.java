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
public final class mm0 implements RequestDelegate {
    public final ym0 f38662a;
    public final String f38663b;
    public final TL_account.saveSecureValue f38664c;
    public final TLRPC.TL_secureRequiredType d;
    public final TLRPC.TL_secureRequiredType f38665e;
    public final ArrayList f38666f;
    public final SecureDocument f38667g;
    public final SecureDocument h;
    public final SecureDocument f38668i;
    public final ArrayList f38669j;
    public final String f38670k;
    public final String f38671l;
    public final Runnable f38672m;
    public final nm0 f38673n;
    public final TLRPC.TL_inputSecureValue f38674o;
    public final nm0 f38675p;

    public mm0(nm0 nm0Var, ym0 ym0Var, String str, TL_account.saveSecureValue savesecurevalue, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, SecureDocument secureDocument, SecureDocument secureDocument2, SecureDocument secureDocument3, ArrayList arrayList2, String str2, String str3, Runnable runnable, nm0 nm0Var2, TLRPC.TL_inputSecureValue tL_inputSecureValue) {
        this.f38675p = nm0Var;
        this.f38662a = ym0Var;
        this.f38663b = str;
        this.f38664c = savesecurevalue;
        this.d = tL_secureRequiredType;
        this.f38665e = tL_secureRequiredType2;
        this.f38666f = arrayList;
        this.f38667g = secureDocument;
        this.h = secureDocument2;
        this.f38668i = secureDocument3;
        this.f38669j = arrayList2;
        this.f38670k = str2;
        this.f38671l = str3;
        this.f38672m = runnable;
        this.f38673n = nm0Var2;
        this.f38674o = tL_inputSecureValue;
    }

    public final void a(final TLRPC.TL_error tL_error, final TLRPC.TL_secureValue tL_secureValue, final TLRPC.TL_secureValue tL_secureValue2) {
        nm0 nm0Var = this.f38675p;
        final boolean z10 = nm0Var.f39006b;
        final int i10 = nm0Var.f39007c;
        final ym0 ym0Var = this.f38662a;
        final String str = this.f38663b;
        final TL_account.saveSecureValue savesecurevalue = this.f38664c;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType = this.d;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.f38665e;
        final ArrayList arrayList = this.f38666f;
        final SecureDocument secureDocument = this.f38667g;
        final SecureDocument secureDocument2 = this.h;
        final SecureDocument secureDocument3 = this.f38668i;
        final ArrayList arrayList2 = this.f38669j;
        final String str2 = this.f38670k;
        final String str3 = this.f38671l;
        final Runnable runnable = this.f38672m;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                kn0 kn0Var;
                TLRPC.TL_secureRequiredType tL_secureRequiredType3;
                int i11;
                nm0 nm0Var2 = mm0.this.f38675p;
                kn0 kn0Var2 = nm0Var2.d;
                TLRPC.TL_error tL_error2 = tL_error;
                String str4 = str;
                if (tL_error2 != null) {
                    ym0 ym0Var2 = ym0Var;
                    if (ym0Var2 != null) {
                        ym0Var2.c(tL_error2.text, str4);
                    }
                    i11 = ((org.telegram.ui.ActionBar.n2) kn0Var2).currentAccount;
                    org.telegram.ui.Components.e5.f0(i11, tL_error2, kn0Var2, savesecurevalue, str4);
                    return;
                }
                boolean z11 = z10;
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType2;
                if (z11) {
                    if (tL_secureRequiredType4 != null) {
                        kn0Var2.H1(tL_secureRequiredType4);
                    } else {
                        kn0Var2.H1(tL_secureRequiredType5);
                    }
                } else {
                    kn0Var2.H1(tL_secureRequiredType5);
                    kn0Var2.H1(tL_secureRequiredType4);
                }
                TLRPC.TL_secureValue tL_secureValue3 = tL_secureValue;
                if (tL_secureValue3 != null) {
                    kn0Var2.f38133y.values.add(tL_secureValue3);
                }
                TLRPC.TL_secureValue tL_secureValue4 = tL_secureValue2;
                if (tL_secureValue4 != null) {
                    kn0Var2.f38133y.values.add(tL_secureValue4);
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
                                    kn0Var = kn0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                    if (Utilities.arraysEquals(secureDocument4.fileSecret, 0, tL_secureFile.secret, 0)) {
                                        nm0.a(nm0Var2, secureDocument4, tL_secureFile);
                                        break;
                                    }
                                } else {
                                    kn0Var = kn0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                }
                                i13++;
                                kn0Var2 = kn0Var;
                                tL_secureRequiredType5 = tL_secureRequiredType3;
                            }
                        }
                        kn0Var = kn0Var2;
                        tL_secureRequiredType3 = tL_secureRequiredType5;
                        i12++;
                        kn0Var2 = kn0Var;
                        tL_secureRequiredType5 = tL_secureRequiredType3;
                    }
                }
                kn0 kn0Var3 = kn0Var2;
                TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType5;
                SecureDocument secureDocument5 = secureDocument;
                if (secureDocument5 != null && secureDocument5.inputFile != null) {
                    TLRPC.SecureFile secureFile2 = tL_secureValue3.selfie;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile2;
                        if (Utilities.arraysEquals(secureDocument5.fileSecret, 0, tL_secureFile2.secret, 0)) {
                            nm0.a(nm0Var2, secureDocument5, tL_secureFile2);
                        }
                    }
                }
                SecureDocument secureDocument6 = secureDocument2;
                if (secureDocument6 != null && secureDocument6.inputFile != null) {
                    TLRPC.SecureFile secureFile3 = tL_secureValue3.front_side;
                    if (secureFile3 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile3;
                        if (Utilities.arraysEquals(secureDocument6.fileSecret, 0, tL_secureFile3.secret, 0)) {
                            nm0.a(nm0Var2, secureDocument6, tL_secureFile3);
                        }
                    }
                }
                SecureDocument secureDocument7 = secureDocument3;
                if (secureDocument7 != null && secureDocument7.inputFile != null) {
                    TLRPC.SecureFile secureFile4 = tL_secureValue3.reverse_side;
                    if (secureFile4 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile4;
                        if (Utilities.arraysEquals(secureDocument7.fileSecret, 0, tL_secureFile4.secret, 0)) {
                            nm0.a(nm0Var2, secureDocument7, tL_secureFile4);
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
                                        nm0.a(nm0Var2, secureDocument8, tL_secureFile5);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                kn0Var3.L1(tL_secureRequiredType6, str4, str2, tL_secureRequiredType4, str3, z11, i10);
                runnable.run();
            }
        });
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        mm0 mm0Var;
        TLRPC.TL_inputSecureValue tL_inputSecureValue;
        int i10;
        int i11;
        kn0 kn0Var = this.f38675p.d;
        if (tL_error != null) {
            boolean equals = tL_error.text.equals("EMAIL_VERIFICATION_NEEDED");
            String str = this.f38663b;
            if (equals) {
                TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                sendverifyemailcode.email = str;
                i11 = ((org.telegram.ui.ActionBar.n2) kn0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(sendverifyemailcode, new ci.gd(this, this.f38663b, this.f38665e, this.f38673n, this.f38662a, 10));
                return;
            }
            mm0Var = this;
            if (tL_error.text.equals("PHONE_VERIFICATION_NEEDED")) {
                AndroidUtilities.runOnUIThread(new nf0(mm0Var.f38662a, tL_error, str, 11));
                return;
            }
        } else {
            mm0Var = this;
        }
        if (tL_error == null && (tL_inputSecureValue = mm0Var.f38674o) != null) {
            TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
            savesecurevalue.value = tL_inputSecureValue;
            savesecurevalue.secure_secret_id = kn0Var.f38082b1;
            i10 = ((org.telegram.ui.ActionBar.n2) kn0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(savesecurevalue, new zb0(7, this, (TLRPC.TL_secureValue) tLObject));
            return;
        }
        a(tL_error, (TLRPC.TL_secureValue) tLObject, null);
    }
}
