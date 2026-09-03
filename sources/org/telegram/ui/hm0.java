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
public final class hm0 implements RequestDelegate {
    public final tm0 f34693a;
    public final String f34694b;
    public final TL_account.saveSecureValue f34695c;
    public final TLRPC.TL_secureRequiredType d;
    public final TLRPC.TL_secureRequiredType e;
    public final ArrayList f34696f;
    public final SecureDocument f34697g;
    public final SecureDocument h;
    public final SecureDocument f34698i;
    public final ArrayList f34699j;
    public final String f34700k;
    public final String f34701l;
    public final Runnable f34702m;
    public final im0 f34703n;
    public final TLRPC.TL_inputSecureValue f34704o;
    public final im0 f34705p;

    public hm0(im0 im0Var, tm0 tm0Var, String str, TL_account.saveSecureValue savesecurevalue, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, SecureDocument secureDocument, SecureDocument secureDocument2, SecureDocument secureDocument3, ArrayList arrayList2, String str2, String str3, Runnable runnable, im0 im0Var2, TLRPC.TL_inputSecureValue tL_inputSecureValue) {
        this.f34705p = im0Var;
        this.f34693a = tm0Var;
        this.f34694b = str;
        this.f34695c = savesecurevalue;
        this.d = tL_secureRequiredType;
        this.e = tL_secureRequiredType2;
        this.f34696f = arrayList;
        this.f34697g = secureDocument;
        this.h = secureDocument2;
        this.f34698i = secureDocument3;
        this.f34699j = arrayList2;
        this.f34700k = str2;
        this.f34701l = str3;
        this.f34702m = runnable;
        this.f34703n = im0Var2;
        this.f34704o = tL_inputSecureValue;
    }

    public final void a(final TLRPC.TL_error tL_error, final TLRPC.TL_secureValue tL_secureValue, final TLRPC.TL_secureValue tL_secureValue2) {
        im0 im0Var = this.f34705p;
        final boolean z4 = im0Var.f35000b;
        final int i10 = im0Var.f35001c;
        final tm0 tm0Var = this.f34693a;
        final String str = this.f34694b;
        final TL_account.saveSecureValue savesecurevalue = this.f34695c;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType = this.d;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.e;
        final ArrayList arrayList = this.f34696f;
        final SecureDocument secureDocument = this.f34697g;
        final SecureDocument secureDocument2 = this.h;
        final SecureDocument secureDocument3 = this.f34698i;
        final ArrayList arrayList2 = this.f34699j;
        final String str2 = this.f34700k;
        final String str3 = this.f34701l;
        final Runnable runnable = this.f34702m;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                fn0 fn0Var;
                TLRPC.TL_secureRequiredType tL_secureRequiredType3;
                int i11;
                im0 im0Var2 = hm0.this.f34705p;
                fn0 fn0Var2 = im0Var2.d;
                TLRPC.TL_error tL_error2 = tL_error;
                String str4 = str;
                if (tL_error2 != null) {
                    tm0 tm0Var2 = tm0Var;
                    if (tm0Var2 != null) {
                        tm0Var2.D(tL_error2.text, str4);
                    }
                    i11 = ((org.telegram.ui.ActionBar.p2) fn0Var2).currentAccount;
                    org.telegram.ui.Components.z4.f0(i11, tL_error2, fn0Var2, savesecurevalue, str4);
                    return;
                }
                boolean z10 = z4;
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType2;
                if (z10) {
                    if (tL_secureRequiredType4 != null) {
                        fn0Var2.H1(tL_secureRequiredType4);
                    } else {
                        fn0Var2.H1(tL_secureRequiredType5);
                    }
                } else {
                    fn0Var2.H1(tL_secureRequiredType5);
                    fn0Var2.H1(tL_secureRequiredType4);
                }
                TLRPC.TL_secureValue tL_secureValue3 = tL_secureValue;
                if (tL_secureValue3 != null) {
                    fn0Var2.f34165y.values.add(tL_secureValue3);
                }
                TLRPC.TL_secureValue tL_secureValue4 = tL_secureValue2;
                if (tL_secureValue4 != null) {
                    fn0Var2.f34165y.values.add(tL_secureValue4);
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
                                    fn0Var = fn0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                    if (Utilities.arraysEquals(secureDocument4.fileSecret, 0, tL_secureFile.secret, 0)) {
                                        im0.a(im0Var2, secureDocument4, tL_secureFile);
                                        break;
                                    }
                                } else {
                                    fn0Var = fn0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                }
                                i13++;
                                fn0Var2 = fn0Var;
                                tL_secureRequiredType5 = tL_secureRequiredType3;
                            }
                        }
                        fn0Var = fn0Var2;
                        tL_secureRequiredType3 = tL_secureRequiredType5;
                        i12++;
                        fn0Var2 = fn0Var;
                        tL_secureRequiredType5 = tL_secureRequiredType3;
                    }
                }
                fn0 fn0Var3 = fn0Var2;
                TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType5;
                SecureDocument secureDocument5 = secureDocument;
                if (secureDocument5 != null && secureDocument5.inputFile != null) {
                    TLRPC.SecureFile secureFile2 = tL_secureValue3.selfie;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile2;
                        if (Utilities.arraysEquals(secureDocument5.fileSecret, 0, tL_secureFile2.secret, 0)) {
                            im0.a(im0Var2, secureDocument5, tL_secureFile2);
                        }
                    }
                }
                SecureDocument secureDocument6 = secureDocument2;
                if (secureDocument6 != null && secureDocument6.inputFile != null) {
                    TLRPC.SecureFile secureFile3 = tL_secureValue3.front_side;
                    if (secureFile3 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile3;
                        if (Utilities.arraysEquals(secureDocument6.fileSecret, 0, tL_secureFile3.secret, 0)) {
                            im0.a(im0Var2, secureDocument6, tL_secureFile3);
                        }
                    }
                }
                SecureDocument secureDocument7 = secureDocument3;
                if (secureDocument7 != null && secureDocument7.inputFile != null) {
                    TLRPC.SecureFile secureFile4 = tL_secureValue3.reverse_side;
                    if (secureFile4 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile4;
                        if (Utilities.arraysEquals(secureDocument7.fileSecret, 0, tL_secureFile4.secret, 0)) {
                            im0.a(im0Var2, secureDocument7, tL_secureFile4);
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
                                        im0.a(im0Var2, secureDocument8, tL_secureFile5);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                fn0Var3.L1(tL_secureRequiredType6, str4, str2, tL_secureRequiredType4, str3, z10, i10);
                runnable.run();
            }
        });
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        hm0 hm0Var;
        TLRPC.TL_inputSecureValue tL_inputSecureValue;
        int i10;
        int i11;
        fn0 fn0Var = this.f34705p.d;
        if (tL_error != null) {
            boolean equals = tL_error.text.equals("EMAIL_VERIFICATION_NEEDED");
            String str = this.f34694b;
            if (equals) {
                TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                sendverifyemailcode.email = str;
                i11 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(sendverifyemailcode, new gg.e0(this, this.f34694b, this.e, this.f34703n, this.f34693a, 12));
                return;
            }
            hm0Var = this;
            if (tL_error.text.equals("PHONE_VERIFICATION_NEEDED")) {
                AndroidUtilities.runOnUIThread(new jf0(hm0Var.f34693a, tL_error, str, 11));
                return;
            }
        } else {
            hm0Var = this;
        }
        if (tL_error == null && (tL_inputSecureValue = hm0Var.f34704o) != null) {
            TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
            savesecurevalue.value = tL_inputSecureValue;
            savesecurevalue.secure_secret_id = fn0Var.Y0;
            i10 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(savesecurevalue, new ub0(7, this, (TLRPC.TL_secureValue) tLObject));
            return;
        }
        a(tL_error, (TLRPC.TL_secureValue) tLObject, null);
    }
}
