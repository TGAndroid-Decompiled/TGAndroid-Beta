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

public final class am0 implements RequestDelegate {

    public final mm0 f36563a;

    public final String f36564b;

    public final TL_account.saveSecureValue f36565c;
    public final TLRPC.TL_secureRequiredType d;

    public final TLRPC.TL_secureRequiredType f36566e;

    public final ArrayList f36567f;

    public final SecureDocument f36568g;
    public final SecureDocument h;

    public final SecureDocument f36569i;

    public final ArrayList f36570j;

    public final String f36571k;

    public final String f36572l;

    public final Runnable f36573m;

    public final bm0 f36574n;

    public final TLRPC.TL_inputSecureValue f36575o;

    public final bm0 f36576p;

    public am0(bm0 bm0Var, mm0 mm0Var, String str, TL_account.saveSecureValue savesecurevalue, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, SecureDocument secureDocument, SecureDocument secureDocument2, SecureDocument secureDocument3, ArrayList arrayList2, String str2, String str3, Runnable runnable, bm0 bm0Var2, TLRPC.TL_inputSecureValue tL_inputSecureValue) {
        this.f36576p = bm0Var;
        this.f36563a = mm0Var;
        this.f36564b = str;
        this.f36565c = savesecurevalue;
        this.d = tL_secureRequiredType;
        this.f36566e = tL_secureRequiredType2;
        this.f36567f = arrayList;
        this.f36568g = secureDocument;
        this.h = secureDocument2;
        this.f36569i = secureDocument3;
        this.f36570j = arrayList2;
        this.f36571k = str2;
        this.f36572l = str3;
        this.f36573m = runnable;
        this.f36574n = bm0Var2;
        this.f36575o = tL_inputSecureValue;
    }

    public final void a(final TLRPC.TL_error tL_error, final TLRPC.TL_secureValue tL_secureValue, final TLRPC.TL_secureValue tL_secureValue2) {
        bm0 bm0Var = this.f36576p;
        final boolean z10 = bm0Var.f36853b;
        final int i10 = bm0Var.f36854c;
        final mm0 mm0Var = this.f36563a;
        final String str = this.f36564b;
        final TL_account.saveSecureValue savesecurevalue = this.f36565c;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType = this.d;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.f36566e;
        final ArrayList arrayList = this.f36567f;
        final SecureDocument secureDocument = this.f36568g;
        final SecureDocument secureDocument2 = this.h;
        final SecureDocument secureDocument3 = this.f36569i;
        final ArrayList arrayList2 = this.f36570j;
        final String str2 = this.f36571k;
        final String str3 = this.f36572l;
        final Runnable runnable = this.f36573m;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                xm0 xm0Var;
                TLRPC.TL_secureRequiredType tL_secureRequiredType3;
                bm0 bm0Var2 = this.f45199a.f36576p;
                xm0 xm0Var2 = bm0Var2.d;
                TLRPC.TL_error tL_error2 = tL_error;
                String str4 = str;
                if (tL_error2 != null) {
                    mm0 mm0Var2 = mm0Var;
                    if (mm0Var2 != null) {
                        mm0Var2.S(tL_error2.text, str4);
                    }
                    org.telegram.ui.Components.y4.f0(((org.telegram.ui.ActionBar.n2) xm0Var2).currentAccount, tL_error2, xm0Var2, savesecurevalue, str4);
                    return;
                }
                boolean z11 = z10;
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType2;
                if (!z11) {
                    xm0Var2.H1(tL_secureRequiredType5);
                    xm0Var2.H1(tL_secureRequiredType4);
                } else if (tL_secureRequiredType4 != null) {
                    xm0Var2.H1(tL_secureRequiredType4);
                } else {
                    xm0Var2.H1(tL_secureRequiredType5);
                }
                TLRPC.TL_secureValue tL_secureValue3 = tL_secureValue;
                if (tL_secureValue3 != null) {
                    xm0Var2.f44535y.values.add(tL_secureValue3);
                }
                TLRPC.TL_secureValue tL_secureValue4 = tL_secureValue2;
                if (tL_secureValue4 != null) {
                    xm0Var2.f44535y.values.add(tL_secureValue4);
                }
                ArrayList arrayList3 = arrayList;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        SecureDocument secureDocument4 = (SecureDocument) arrayList3.get(i11);
                        if (secureDocument4.inputFile == null) {
                            xm0Var = xm0Var2;
                            tL_secureRequiredType3 = tL_secureRequiredType5;
                            break;
                            break;
                        }
                        int size2 = tL_secureValue3.files.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size2) {
                                xm0Var = xm0Var2;
                                tL_secureRequiredType3 = tL_secureRequiredType5;
                                break;
                            }
                            TLRPC.SecureFile secureFile = tL_secureValue3.files.get(i12);
                            if (secureFile instanceof TLRPC.TL_secureFile) {
                                TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) secureFile;
                                xm0Var = xm0Var2;
                                tL_secureRequiredType3 = tL_secureRequiredType5;
                                if (Utilities.arraysEquals(secureDocument4.fileSecret, 0, tL_secureFile.secret, 0)) {
                                    bm0.a(bm0Var2, secureDocument4, tL_secureFile);
                                    break;
                                }
                            } else {
                                xm0Var = xm0Var2;
                                tL_secureRequiredType3 = tL_secureRequiredType5;
                            }
                            i12++;
                            xm0Var2 = xm0Var;
                            tL_secureRequiredType5 = tL_secureRequiredType3;
                        }
                        i11++;
                        xm0Var2 = xm0Var;
                        tL_secureRequiredType5 = tL_secureRequiredType3;
                    }
                }
                xm0 xm0Var3 = xm0Var2;
                TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType5;
                SecureDocument secureDocument5 = secureDocument;
                if (secureDocument5 != null && secureDocument5.inputFile != null) {
                    TLRPC.SecureFile secureFile2 = tL_secureValue3.selfie;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile2;
                        if (Utilities.arraysEquals(secureDocument5.fileSecret, 0, tL_secureFile2.secret, 0)) {
                            bm0.a(bm0Var2, secureDocument5, tL_secureFile2);
                        }
                    }
                }
                SecureDocument secureDocument6 = secureDocument2;
                if (secureDocument6 != null && secureDocument6.inputFile != null) {
                    TLRPC.SecureFile secureFile3 = tL_secureValue3.front_side;
                    if (secureFile3 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile3;
                        if (Utilities.arraysEquals(secureDocument6.fileSecret, 0, tL_secureFile3.secret, 0)) {
                            bm0.a(bm0Var2, secureDocument6, tL_secureFile3);
                        }
                    }
                }
                SecureDocument secureDocument7 = secureDocument3;
                if (secureDocument7 != null && secureDocument7.inputFile != null) {
                    TLRPC.SecureFile secureFile4 = tL_secureValue3.reverse_side;
                    if (secureFile4 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile4;
                        if (Utilities.arraysEquals(secureDocument7.fileSecret, 0, tL_secureFile4.secret, 0)) {
                            bm0.a(bm0Var2, secureDocument7, tL_secureFile4);
                        }
                    }
                }
                ArrayList arrayList4 = arrayList2;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    int size3 = arrayList4.size();
                    for (int i13 = 0; i13 < size3; i13++) {
                        SecureDocument secureDocument8 = (SecureDocument) arrayList4.get(i13);
                        if (secureDocument8.inputFile == null) {
                            break;
                            break;
                        }
                        int size4 = tL_secureValue3.translation.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size4) {
                                break;
                            }
                            TLRPC.SecureFile secureFile5 = tL_secureValue3.translation.get(i14);
                            if (secureFile5 instanceof TLRPC.TL_secureFile) {
                                TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) secureFile5;
                                if (Utilities.arraysEquals(secureDocument8.fileSecret, 0, tL_secureFile5.secret, 0)) {
                                    bm0.a(bm0Var2, secureDocument8, tL_secureFile5);
                                    break;
                                }
                            }
                            i14++;
                        }
                    }
                }
                xm0Var3.L1(tL_secureRequiredType6, str4, str2, tL_secureRequiredType4, str3, z11, i10);
                runnable.run();
            }
        });
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        am0 am0Var;
        TLRPC.TL_inputSecureValue tL_inputSecureValue;
        xm0 xm0Var = this.f36576p.d;
        if (tL_error != null) {
            boolean zEquals = tL_error.text.equals("EMAIL_VERIFICATION_NEEDED");
            String str = this.f36564b;
            if (zEquals) {
                TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                sendverifyemailcode.email = str;
                ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount).sendRequest(sendverifyemailcode, new cg.e0(this, this.f36564b, this.f36566e, this.f36574n, this.f36563a, 13));
                return;
            }
            am0Var = this;
            if (tL_error.text.equals("PHONE_VERIFICATION_NEEDED")) {
                AndroidUtilities.runOnUIThread(new bf0(am0Var.f36563a, tL_error, str, 11));
                return;
            }
        } else {
            am0Var = this;
        }
        if (tL_error != null || (tL_inputSecureValue = am0Var.f36575o) == null) {
            a(tL_error, (TLRPC.TL_secureValue) tLObject, null);
            return;
        }
        TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
        savesecurevalue.value = tL_inputSecureValue;
        savesecurevalue.secure_secret_id = xm0Var.X0;
        ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount).sendRequest(savesecurevalue, new v80(11, this, (TLRPC.TL_secureValue) tLObject));
    }
}
