package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ok0 implements RequestDelegate {
    public final zk0 f40284a;
    public final String f40285b;
    public final TL_account.saveSecureValue f40286c;
    public final TLRPC.TL_secureRequiredType d;
    public final TLRPC.TL_secureRequiredType e;
    public final ArrayList f40287f;
    public final org.telegram.messenger.pw f40288g;
    public final org.telegram.messenger.pw h;
    public final org.telegram.messenger.pw f40289i;
    public final ArrayList f40290j;
    public final String f40291k;
    public final String f40292l;
    public final Runnable f40293m;
    public final pk0 f40294n;
    public final TLRPC.TL_inputSecureValue f40295o;
    public final pk0 f40296p;

    public ok0(pk0 pk0Var, zk0 zk0Var, String str, TL_account.saveSecureValue savesecurevalue, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, org.telegram.messenger.pw pwVar, org.telegram.messenger.pw pwVar2, org.telegram.messenger.pw pwVar3, ArrayList arrayList2, String str2, String str3, Runnable runnable, pk0 pk0Var2, TLRPC.TL_inputSecureValue tL_inputSecureValue) {
        this.f40296p = pk0Var;
        this.f40284a = zk0Var;
        this.f40285b = str;
        this.f40286c = savesecurevalue;
        this.d = tL_secureRequiredType;
        this.e = tL_secureRequiredType2;
        this.f40287f = arrayList;
        this.f40288g = pwVar;
        this.h = pwVar2;
        this.f40289i = pwVar3;
        this.f40290j = arrayList2;
        this.f40291k = str2;
        this.f40292l = str3;
        this.f40293m = runnable;
        this.f40294n = pk0Var2;
        this.f40295o = tL_inputSecureValue;
    }

    public final void a(final TLRPC.TL_error tL_error, final TLRPC.TL_secureValue tL_secureValue, final TLRPC.TL_secureValue tL_secureValue2) {
        pk0 pk0Var = this.f40296p;
        final boolean z10 = pk0Var.f40681b;
        final int i10 = pk0Var.f40682c;
        final zk0 zk0Var = this.f40284a;
        final String str = this.f40285b;
        final TL_account.saveSecureValue savesecurevalue = this.f40286c;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType = this.d;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.e;
        final ArrayList arrayList = this.f40287f;
        final org.telegram.messenger.pw pwVar = this.f40288g;
        final org.telegram.messenger.pw pwVar2 = this.h;
        final org.telegram.messenger.pw pwVar3 = this.f40289i;
        final ArrayList arrayList2 = this.f40290j;
        final String str2 = this.f40291k;
        final String str3 = this.f40292l;
        final Runnable runnable = this.f40293m;
        org.telegram.messenger.i0.g3(new Runnable() {
            @Override
            public final void run() {
                ll0 ll0Var;
                TLRPC.TL_secureRequiredType tL_secureRequiredType3;
                int i11;
                pk0 pk0Var2 = ok0.this.f40296p;
                ll0 ll0Var2 = pk0Var2.d;
                TLRPC.TL_error tL_error2 = tL_error;
                String str4 = str;
                int i12 = 0;
                if (tL_error2 != null) {
                    zk0 zk0Var2 = zk0Var;
                    if (zk0Var2 != null) {
                        zk0Var2.d(tL_error2.text, str4);
                    }
                    i11 = ((org.telegram.ui.ActionBar.k2) ll0Var2).currentAccount;
                    org.telegram.ui.Components.s4.e0(i11, tL_error2, ll0Var2, savesecurevalue, str4);
                    return;
                }
                boolean z11 = z10;
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType2;
                if (z11) {
                    if (tL_secureRequiredType4 != null) {
                        ll0Var2.K1(tL_secureRequiredType4);
                    } else {
                        ll0Var2.K1(tL_secureRequiredType5);
                    }
                } else {
                    ll0Var2.K1(tL_secureRequiredType5);
                    ll0Var2.K1(tL_secureRequiredType4);
                }
                TLRPC.TL_secureValue tL_secureValue3 = tL_secureValue;
                if (tL_secureValue3 != null) {
                    ll0Var2.D.values.add(tL_secureValue3);
                }
                TLRPC.TL_secureValue tL_secureValue4 = tL_secureValue2;
                if (tL_secureValue4 != null) {
                    ll0Var2.D.values.add(tL_secureValue4);
                }
                ArrayList arrayList3 = arrayList;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size) {
                        org.telegram.messenger.pw pwVar4 = (org.telegram.messenger.pw) arrayList3.get(i13);
                        if (pwVar4.d != null) {
                            int size2 = tL_secureValue3.files.size();
                            int i14 = i12;
                            while (i14 < size2) {
                                TLRPC.SecureFile secureFile = tL_secureValue3.files.get(i14);
                                if (secureFile instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) secureFile;
                                    ll0Var = ll0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                    if (Utilities.d(pwVar4.e, tL_secureFile.secret, 0)) {
                                        pk0.a(pk0Var2, pwVar4, tL_secureFile);
                                        break;
                                    }
                                } else {
                                    ll0Var = ll0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                }
                                i14++;
                                ll0Var2 = ll0Var;
                                tL_secureRequiredType5 = tL_secureRequiredType3;
                            }
                        }
                        ll0Var = ll0Var2;
                        tL_secureRequiredType3 = tL_secureRequiredType5;
                        i13++;
                        ll0Var2 = ll0Var;
                        tL_secureRequiredType5 = tL_secureRequiredType3;
                        i12 = 0;
                    }
                }
                ll0 ll0Var3 = ll0Var2;
                TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType5;
                org.telegram.messenger.pw pwVar5 = pwVar;
                if (pwVar5 != null && pwVar5.d != null) {
                    TLRPC.SecureFile secureFile2 = tL_secureValue3.selfie;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile2;
                        if (Utilities.d(pwVar5.e, tL_secureFile2.secret, 0)) {
                            pk0.a(pk0Var2, pwVar5, tL_secureFile2);
                        }
                    }
                }
                org.telegram.messenger.pw pwVar6 = pwVar2;
                if (pwVar6 != null && pwVar6.d != null) {
                    TLRPC.SecureFile secureFile3 = tL_secureValue3.front_side;
                    if (secureFile3 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile3;
                        if (Utilities.d(pwVar6.e, tL_secureFile3.secret, 0)) {
                            pk0.a(pk0Var2, pwVar6, tL_secureFile3);
                        }
                    }
                }
                org.telegram.messenger.pw pwVar7 = pwVar3;
                if (pwVar7 != null && pwVar7.d != null) {
                    TLRPC.SecureFile secureFile4 = tL_secureValue3.reverse_side;
                    if (secureFile4 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile4;
                        if (Utilities.d(pwVar7.e, tL_secureFile4.secret, 0)) {
                            pk0.a(pk0Var2, pwVar7, tL_secureFile4);
                        }
                    }
                }
                ArrayList arrayList4 = arrayList2;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    int size3 = arrayList4.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        org.telegram.messenger.pw pwVar8 = (org.telegram.messenger.pw) arrayList4.get(i15);
                        if (pwVar8.d != null) {
                            int size4 = tL_secureValue3.translation.size();
                            for (int i16 = 0; i16 < size4; i16++) {
                                TLRPC.SecureFile secureFile5 = tL_secureValue3.translation.get(i16);
                                if (secureFile5 instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) secureFile5;
                                    if (Utilities.d(pwVar8.e, tL_secureFile5.secret, 0)) {
                                        pk0.a(pk0Var2, pwVar8, tL_secureFile5);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                ll0Var3.O1(tL_secureRequiredType6, str4, str2, tL_secureRequiredType4, str3, z11, i10);
                runnable.run();
            }
        });
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ok0 ok0Var;
        TLRPC.TL_inputSecureValue tL_inputSecureValue;
        int i10;
        int i11;
        ll0 ll0Var = this.f40296p.d;
        if (tL_error != null) {
            boolean equals = tL_error.text.equals("EMAIL_VERIFICATION_NEEDED");
            String str = this.f40285b;
            if (equals) {
                TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                sendverifyemailcode.email = str;
                i11 = ((org.telegram.ui.ActionBar.k2) ll0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(sendverifyemailcode, new mg.z(this, this.f40285b, this.e, this.f40294n, this.f40284a, 11));
                return;
            }
            ok0Var = this;
            if (tL_error.text.equals("PHONE_VERIFICATION_NEEDED")) {
                org.telegram.messenger.i0.g3(new qd0(ok0Var.f40284a, tL_error, str, false, 14));
                return;
            }
        } else {
            ok0Var = this;
        }
        if (tL_error == null && (tL_inputSecureValue = ok0Var.f40295o) != null) {
            TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
            savesecurevalue.value = tL_inputSecureValue;
            savesecurevalue.secure_secret_id = ll0Var.f39262b1;
            i10 = ((org.telegram.ui.ActionBar.k2) ll0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(savesecurevalue, new org.telegram.ui.Components.t20(27, this, (TLRPC.TL_secureValue) tLObject));
            return;
        }
        a(tL_error, (TLRPC.TL_secureValue) tLObject, null);
    }
}
