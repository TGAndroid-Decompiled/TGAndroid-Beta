package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class mk0 implements RequestDelegate {
    public final xk0 f39551a;
    public final String f39552b;
    public final TL_account.saveSecureValue f39553c;
    public final TLRPC.TL_secureRequiredType d;
    public final TLRPC.TL_secureRequiredType e;
    public final ArrayList f39554f;
    public final org.telegram.messenger.qw f39555g;
    public final org.telegram.messenger.qw h;
    public final org.telegram.messenger.qw f39556i;
    public final ArrayList f39557j;
    public final String f39558k;
    public final String f39559l;
    public final Runnable f39560m;
    public final nk0 f39561n;
    public final TLRPC.TL_inputSecureValue f39562o;
    public final nk0 f39563p;

    public mk0(nk0 nk0Var, xk0 xk0Var, String str, TL_account.saveSecureValue savesecurevalue, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, org.telegram.messenger.qw qwVar, org.telegram.messenger.qw qwVar2, org.telegram.messenger.qw qwVar3, ArrayList arrayList2, String str2, String str3, Runnable runnable, nk0 nk0Var2, TLRPC.TL_inputSecureValue tL_inputSecureValue) {
        this.f39563p = nk0Var;
        this.f39551a = xk0Var;
        this.f39552b = str;
        this.f39553c = savesecurevalue;
        this.d = tL_secureRequiredType;
        this.e = tL_secureRequiredType2;
        this.f39554f = arrayList;
        this.f39555g = qwVar;
        this.h = qwVar2;
        this.f39556i = qwVar3;
        this.f39557j = arrayList2;
        this.f39558k = str2;
        this.f39559l = str3;
        this.f39560m = runnable;
        this.f39561n = nk0Var2;
        this.f39562o = tL_inputSecureValue;
    }

    public final void a(final TLRPC.TL_error tL_error, final TLRPC.TL_secureValue tL_secureValue, final TLRPC.TL_secureValue tL_secureValue2) {
        nk0 nk0Var = this.f39563p;
        final boolean z10 = nk0Var.f39922b;
        final int i10 = nk0Var.f39923c;
        final xk0 xk0Var = this.f39551a;
        final String str = this.f39552b;
        final TL_account.saveSecureValue savesecurevalue = this.f39553c;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType = this.d;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.e;
        final ArrayList arrayList = this.f39554f;
        final org.telegram.messenger.qw qwVar = this.f39555g;
        final org.telegram.messenger.qw qwVar2 = this.h;
        final org.telegram.messenger.qw qwVar3 = this.f39556i;
        final ArrayList arrayList2 = this.f39557j;
        final String str2 = this.f39558k;
        final String str3 = this.f39559l;
        final Runnable runnable = this.f39560m;
        org.telegram.messenger.i0.g3(new Runnable() {
            @Override
            public final void run() {
                jl0 jl0Var;
                TLRPC.TL_secureRequiredType tL_secureRequiredType3;
                int i11;
                nk0 nk0Var2 = mk0.this.f39563p;
                jl0 jl0Var2 = nk0Var2.d;
                TLRPC.TL_error tL_error2 = tL_error;
                String str4 = str;
                int i12 = 0;
                if (tL_error2 != null) {
                    xk0 xk0Var2 = xk0Var;
                    if (xk0Var2 != null) {
                        xk0Var2.d(tL_error2.text, str4);
                    }
                    i11 = ((org.telegram.ui.ActionBar.k2) jl0Var2).currentAccount;
                    org.telegram.ui.Components.s4.e0(i11, tL_error2, jl0Var2, savesecurevalue, str4);
                    return;
                }
                boolean z11 = z10;
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType2;
                if (z11) {
                    if (tL_secureRequiredType4 != null) {
                        jl0Var2.L1(tL_secureRequiredType4);
                    } else {
                        jl0Var2.L1(tL_secureRequiredType5);
                    }
                } else {
                    jl0Var2.L1(tL_secureRequiredType5);
                    jl0Var2.L1(tL_secureRequiredType4);
                }
                TLRPC.TL_secureValue tL_secureValue3 = tL_secureValue;
                if (tL_secureValue3 != null) {
                    jl0Var2.D.values.add(tL_secureValue3);
                }
                TLRPC.TL_secureValue tL_secureValue4 = tL_secureValue2;
                if (tL_secureValue4 != null) {
                    jl0Var2.D.values.add(tL_secureValue4);
                }
                ArrayList arrayList3 = arrayList;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size) {
                        org.telegram.messenger.qw qwVar4 = (org.telegram.messenger.qw) arrayList3.get(i13);
                        if (qwVar4.d != null) {
                            int size2 = tL_secureValue3.files.size();
                            int i14 = i12;
                            while (i14 < size2) {
                                TLRPC.SecureFile secureFile = tL_secureValue3.files.get(i14);
                                if (secureFile instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) secureFile;
                                    jl0Var = jl0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                    if (Utilities.d(qwVar4.e, tL_secureFile.secret, 0)) {
                                        nk0.a(nk0Var2, qwVar4, tL_secureFile);
                                        break;
                                    }
                                } else {
                                    jl0Var = jl0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                }
                                i14++;
                                jl0Var2 = jl0Var;
                                tL_secureRequiredType5 = tL_secureRequiredType3;
                            }
                        }
                        jl0Var = jl0Var2;
                        tL_secureRequiredType3 = tL_secureRequiredType5;
                        i13++;
                        jl0Var2 = jl0Var;
                        tL_secureRequiredType5 = tL_secureRequiredType3;
                        i12 = 0;
                    }
                }
                jl0 jl0Var3 = jl0Var2;
                TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType5;
                org.telegram.messenger.qw qwVar5 = qwVar;
                if (qwVar5 != null && qwVar5.d != null) {
                    TLRPC.SecureFile secureFile2 = tL_secureValue3.selfie;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile2;
                        if (Utilities.d(qwVar5.e, tL_secureFile2.secret, 0)) {
                            nk0.a(nk0Var2, qwVar5, tL_secureFile2);
                        }
                    }
                }
                org.telegram.messenger.qw qwVar6 = qwVar2;
                if (qwVar6 != null && qwVar6.d != null) {
                    TLRPC.SecureFile secureFile3 = tL_secureValue3.front_side;
                    if (secureFile3 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile3;
                        if (Utilities.d(qwVar6.e, tL_secureFile3.secret, 0)) {
                            nk0.a(nk0Var2, qwVar6, tL_secureFile3);
                        }
                    }
                }
                org.telegram.messenger.qw qwVar7 = qwVar3;
                if (qwVar7 != null && qwVar7.d != null) {
                    TLRPC.SecureFile secureFile4 = tL_secureValue3.reverse_side;
                    if (secureFile4 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile4;
                        if (Utilities.d(qwVar7.e, tL_secureFile4.secret, 0)) {
                            nk0.a(nk0Var2, qwVar7, tL_secureFile4);
                        }
                    }
                }
                ArrayList arrayList4 = arrayList2;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    int size3 = arrayList4.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        org.telegram.messenger.qw qwVar8 = (org.telegram.messenger.qw) arrayList4.get(i15);
                        if (qwVar8.d != null) {
                            int size4 = tL_secureValue3.translation.size();
                            for (int i16 = 0; i16 < size4; i16++) {
                                TLRPC.SecureFile secureFile5 = tL_secureValue3.translation.get(i16);
                                if (secureFile5 instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) secureFile5;
                                    if (Utilities.d(qwVar8.e, tL_secureFile5.secret, 0)) {
                                        nk0.a(nk0Var2, qwVar8, tL_secureFile5);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                jl0Var3.P1(tL_secureRequiredType6, str4, str2, tL_secureRequiredType4, str3, z11, i10);
                runnable.run();
            }
        });
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        mk0 mk0Var;
        TLRPC.TL_inputSecureValue tL_inputSecureValue;
        int i10;
        int i11;
        jl0 jl0Var = this.f39563p.d;
        if (tL_error != null) {
            boolean equals = tL_error.text.equals("EMAIL_VERIFICATION_NEEDED");
            String str = this.f39552b;
            if (equals) {
                TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                sendverifyemailcode.email = str;
                i11 = ((org.telegram.ui.ActionBar.k2) jl0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(sendverifyemailcode, new mg.z(this, this.f39552b, this.e, this.f39561n, this.f39551a, 11));
                return;
            }
            mk0Var = this;
            if (tL_error.text.equals("PHONE_VERIFICATION_NEEDED")) {
                org.telegram.messenger.i0.g3(new pd0(mk0Var.f39551a, tL_error, str, false, 14));
                return;
            }
        } else {
            mk0Var = this;
        }
        if (tL_error == null && (tL_inputSecureValue = mk0Var.f39562o) != null) {
            TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
            savesecurevalue.value = tL_inputSecureValue;
            savesecurevalue.secure_secret_id = jl0Var.f38414b1;
            i10 = ((org.telegram.ui.ActionBar.k2) jl0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(savesecurevalue, new org.telegram.ui.Components.t20(27, this, (TLRPC.TL_secureValue) tLObject));
            return;
        }
        a(tL_error, (TLRPC.TL_secureValue) tLObject, null);
    }
}
