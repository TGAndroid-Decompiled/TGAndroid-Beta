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
public final class bm0 implements RequestDelegate {
    public final nm0 f36097a;
    public final String f36098b;
    public final TL_account.saveSecureValue f36099c;
    public final TLRPC.TL_secureRequiredType d;
    public final TLRPC.TL_secureRequiredType e;
    public final ArrayList f36100f;
    public final SecureDocument f36101g;
    public final SecureDocument h;
    public final SecureDocument f36102i;
    public final ArrayList f36103j;
    public final String f36104k;
    public final String f36105l;
    public final Runnable f36106m;
    public final cm0 f36107n;
    public final TLRPC.TL_inputSecureValue f36108o;
    public final cm0 f36109p;

    public bm0(cm0 cm0Var, nm0 nm0Var, String str, TL_account.saveSecureValue savesecurevalue, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, SecureDocument secureDocument, SecureDocument secureDocument2, SecureDocument secureDocument3, ArrayList arrayList2, String str2, String str3, Runnable runnable, cm0 cm0Var2, TLRPC.TL_inputSecureValue tL_inputSecureValue) {
        this.f36109p = cm0Var;
        this.f36097a = nm0Var;
        this.f36098b = str;
        this.f36099c = savesecurevalue;
        this.d = tL_secureRequiredType;
        this.e = tL_secureRequiredType2;
        this.f36100f = arrayList;
        this.f36101g = secureDocument;
        this.h = secureDocument2;
        this.f36102i = secureDocument3;
        this.f36103j = arrayList2;
        this.f36104k = str2;
        this.f36105l = str3;
        this.f36106m = runnable;
        this.f36107n = cm0Var2;
        this.f36108o = tL_inputSecureValue;
    }

    public final void a(final TLRPC.TL_error tL_error, final TLRPC.TL_secureValue tL_secureValue, final TLRPC.TL_secureValue tL_secureValue2) {
        cm0 cm0Var = this.f36109p;
        final boolean z10 = cm0Var.f36372b;
        final int i10 = cm0Var.f36373c;
        final nm0 nm0Var = this.f36097a;
        final String str = this.f36098b;
        final TL_account.saveSecureValue savesecurevalue = this.f36099c;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType = this.d;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.e;
        final ArrayList arrayList = this.f36100f;
        final SecureDocument secureDocument = this.f36101g;
        final SecureDocument secureDocument2 = this.h;
        final SecureDocument secureDocument3 = this.f36102i;
        final ArrayList arrayList2 = this.f36103j;
        final String str2 = this.f36104k;
        final String str3 = this.f36105l;
        final Runnable runnable = this.f36106m;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                zm0 zm0Var;
                TLRPC.TL_secureRequiredType tL_secureRequiredType3;
                int i11;
                cm0 cm0Var2 = bm0.this.f36109p;
                zm0 zm0Var2 = cm0Var2.d;
                TLRPC.TL_error tL_error2 = tL_error;
                String str4 = str;
                int i12 = 0;
                if (tL_error2 != null) {
                    nm0 nm0Var2 = nm0Var;
                    if (nm0Var2 != null) {
                        nm0Var2.a(tL_error2.text, str4);
                    }
                    i11 = ((org.telegram.ui.ActionBar.o2) zm0Var2).currentAccount;
                    org.telegram.ui.Components.d5.e0(i11, tL_error2, zm0Var2, savesecurevalue, str4);
                    return;
                }
                boolean z11 = z10;
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType2;
                if (z11) {
                    if (tL_secureRequiredType4 != null) {
                        zm0Var2.G1(tL_secureRequiredType4);
                    } else {
                        zm0Var2.G1(tL_secureRequiredType5);
                    }
                } else {
                    zm0Var2.G1(tL_secureRequiredType5);
                    zm0Var2.G1(tL_secureRequiredType4);
                }
                TLRPC.TL_secureValue tL_secureValue3 = tL_secureValue;
                if (tL_secureValue3 != null) {
                    zm0Var2.f44179y.values.add(tL_secureValue3);
                }
                TLRPC.TL_secureValue tL_secureValue4 = tL_secureValue2;
                if (tL_secureValue4 != null) {
                    zm0Var2.f44179y.values.add(tL_secureValue4);
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
                                    zm0Var = zm0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                    if (Utilities.arraysEquals(secureDocument4.fileSecret, 0, tL_secureFile.secret, 0)) {
                                        cm0.a(cm0Var2, secureDocument4, tL_secureFile);
                                        break;
                                    }
                                } else {
                                    zm0Var = zm0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                }
                                i14++;
                                zm0Var2 = zm0Var;
                                tL_secureRequiredType5 = tL_secureRequiredType3;
                            }
                        }
                        zm0Var = zm0Var2;
                        tL_secureRequiredType3 = tL_secureRequiredType5;
                        i13++;
                        zm0Var2 = zm0Var;
                        tL_secureRequiredType5 = tL_secureRequiredType3;
                        i12 = 0;
                    }
                }
                zm0 zm0Var3 = zm0Var2;
                TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType5;
                SecureDocument secureDocument5 = secureDocument;
                if (secureDocument5 != null && secureDocument5.inputFile != null) {
                    TLRPC.SecureFile secureFile2 = tL_secureValue3.selfie;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile2;
                        if (Utilities.arraysEquals(secureDocument5.fileSecret, 0, tL_secureFile2.secret, 0)) {
                            cm0.a(cm0Var2, secureDocument5, tL_secureFile2);
                        }
                    }
                }
                SecureDocument secureDocument6 = secureDocument2;
                if (secureDocument6 != null && secureDocument6.inputFile != null) {
                    TLRPC.SecureFile secureFile3 = tL_secureValue3.front_side;
                    if (secureFile3 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile3;
                        if (Utilities.arraysEquals(secureDocument6.fileSecret, 0, tL_secureFile3.secret, 0)) {
                            cm0.a(cm0Var2, secureDocument6, tL_secureFile3);
                        }
                    }
                }
                SecureDocument secureDocument7 = secureDocument3;
                if (secureDocument7 != null && secureDocument7.inputFile != null) {
                    TLRPC.SecureFile secureFile4 = tL_secureValue3.reverse_side;
                    if (secureFile4 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile4;
                        if (Utilities.arraysEquals(secureDocument7.fileSecret, 0, tL_secureFile4.secret, 0)) {
                            cm0.a(cm0Var2, secureDocument7, tL_secureFile4);
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
                                        cm0.a(cm0Var2, secureDocument8, tL_secureFile5);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                zm0Var3.K1(tL_secureRequiredType6, str4, str2, tL_secureRequiredType4, str3, z11, i10);
                runnable.run();
            }
        });
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        bm0 bm0Var;
        TLRPC.TL_inputSecureValue tL_inputSecureValue;
        int i10;
        int i11;
        zm0 zm0Var = this.f36109p.d;
        if (tL_error != null) {
            boolean equals = tL_error.text.equals("EMAIL_VERIFICATION_NEEDED");
            String str = this.f36098b;
            if (equals) {
                TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                sendverifyemailcode.email = str;
                i11 = ((org.telegram.ui.ActionBar.o2) zm0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(sendverifyemailcode, new ai.s9(this, this.f36098b, this.e, this.f36107n, this.f36097a, 11));
                return;
            }
            bm0Var = this;
            if (tL_error.text.equals("PHONE_VERIFICATION_NEEDED")) {
                AndroidUtilities.runOnUIThread(new qe0(bm0Var.f36097a, tL_error, str, 13));
                return;
            }
        } else {
            bm0Var = this;
        }
        if (tL_error == null && (tL_inputSecureValue = bm0Var.f36108o) != null) {
            TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
            savesecurevalue.value = tL_inputSecureValue;
            savesecurevalue.secure_secret_id = zm0Var.f44129b1;
            i10 = ((org.telegram.ui.ActionBar.o2) zm0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(savesecurevalue, new a50(14, this, (TLRPC.TL_secureValue) tLObject));
            return;
        }
        a(tL_error, (TLRPC.TL_secureValue) tLObject, null);
    }
}
