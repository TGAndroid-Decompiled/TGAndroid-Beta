package org.telegram.ui;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class pk0 implements bl0 {
    public final TLRPC.SecureValueType f40680a;
    public final boolean f40681b;
    public final int f40682c;
    public final ll0 d;

    public pk0(ll0 ll0Var, TLRPC.SecureValueType secureValueType, boolean z10, int i10) {
        this.d = ll0Var;
        this.f40680a = secureValueType;
        this.f40681b = z10;
        this.f40682c = i10;
    }

    public static void a(pk0 pk0Var, org.telegram.messenger.pw pwVar, TLRPC.TL_secureFile tL_secureFile) {
        pk0Var.getClass();
        org.telegram.messenger.b8.G(org.telegram.messenger.d20.f15147s0);
        File I = org.telegram.messenger.b8.I(pwVar);
        org.telegram.messenger.b8.G(org.telegram.messenger.d20.f15147s0);
        File I2 = org.telegram.messenger.b8.I(tL_secureFile);
        I.renameTo(I2);
        org.telegram.messenger.hc.D().S(pwVar.f17489b.dc_id + "_" + pwVar.f17489b.f19930id, tL_secureFile.dc_id + "_" + tL_secureFile.f19930id, null);
    }

    public static TLRPC.InputSecureFile b(org.telegram.messenger.pw pwVar) {
        if (pwVar.d != null) {
            TLRPC.TL_inputSecureFileUploaded tL_inputSecureFileUploaded = new TLRPC.TL_inputSecureFileUploaded();
            TLRPC.TL_inputFile tL_inputFile = pwVar.d;
            tL_inputSecureFileUploaded.f19861id = tL_inputFile.f19807id;
            tL_inputSecureFileUploaded.parts = tL_inputFile.parts;
            tL_inputSecureFileUploaded.md5_checksum = tL_inputFile.md5_checksum;
            tL_inputSecureFileUploaded.file_hash = pwVar.f17491f;
            tL_inputSecureFileUploaded.secret = pwVar.e;
            return tL_inputSecureFileUploaded;
        }
        TLRPC.TL_inputSecureFile tL_inputSecureFile = new TLRPC.TL_inputSecureFile();
        TLRPC.TL_secureFile tL_secureFile = pwVar.f17489b;
        tL_inputSecureFile.f19860id = tL_secureFile.f19930id;
        tL_inputSecureFile.access_hash = tL_secureFile.access_hash;
        return tL_inputSecureFile;
    }

    public final void c(TLRPC.TL_secureRequiredType tL_secureRequiredType, String str, String str2, TLRPC.TL_secureRequiredType tL_secureRequiredType2, String str3, ArrayList arrayList, org.telegram.messenger.pw pwVar, ArrayList arrayList2, org.telegram.messenger.pw pwVar2, org.telegram.messenger.pw pwVar3, Runnable runnable, m4.c cVar) {
        TLRPC.TL_inputSecureValue tL_inputSecureValue;
        TLRPC.TL_securePlainPhone tL_securePlainPhone;
        TLRPC.TL_inputSecureValue tL_inputSecureValue2;
        int i10;
        boolean isEmpty = TextUtils.isEmpty(str2);
        ll0 ll0Var = this.d;
        if (!isEmpty) {
            tL_inputSecureValue = new TLRPC.TL_inputSecureValue();
            tL_inputSecureValue.type = tL_secureRequiredType.type;
            tL_inputSecureValue.flags |= 1;
            bh.d n12 = ll0Var.n1(org.telegram.messenger.i0.h1(str2));
            TLRPC.TL_secureData tL_secureData = new TLRPC.TL_secureData();
            tL_inputSecureValue.data = tL_secureData;
            tL_secureData.data = (byte[]) n12.f2779c;
            tL_secureData.data_hash = (byte[]) n12.d;
            tL_secureData.secret = (byte[]) n12.f2777a;
        } else if (!TextUtils.isEmpty(str)) {
            TLRPC.SecureValueType secureValueType = this.f40680a;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
                TLRPC.TL_securePlainEmail tL_securePlainEmail = new TLRPC.TL_securePlainEmail();
                tL_securePlainEmail.email = str;
                tL_securePlainPhone = tL_securePlainEmail;
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
                TLRPC.TL_securePlainPhone tL_securePlainPhone2 = new TLRPC.TL_securePlainPhone();
                tL_securePlainPhone2.phone = str;
                tL_securePlainPhone = tL_securePlainPhone2;
            } else {
                return;
            }
            TLRPC.TL_inputSecureValue tL_inputSecureValue3 = new TLRPC.TL_inputSecureValue();
            tL_inputSecureValue3.type = tL_secureRequiredType.type;
            tL_inputSecureValue3.flags |= 32;
            tL_inputSecureValue3.plain_data = tL_securePlainPhone;
            tL_inputSecureValue = tL_inputSecureValue3;
        } else {
            tL_inputSecureValue = null;
        }
        boolean z10 = this.f40681b;
        if (!z10 && tL_inputSecureValue == null) {
            if (cVar != null) {
                cVar.d(null, null);
                return;
            }
            return;
        }
        if (tL_secureRequiredType2 != null) {
            TLRPC.TL_inputSecureValue tL_inputSecureValue4 = new TLRPC.TL_inputSecureValue();
            tL_inputSecureValue4.type = tL_secureRequiredType2.type;
            if (!TextUtils.isEmpty(str3)) {
                tL_inputSecureValue4.flags |= 1;
                bh.d n13 = ll0Var.n1(org.telegram.messenger.i0.h1(str3));
                TLRPC.TL_secureData tL_secureData2 = new TLRPC.TL_secureData();
                tL_inputSecureValue4.data = tL_secureData2;
                tL_secureData2.data = (byte[]) n13.f2779c;
                tL_secureData2.data_hash = (byte[]) n13.d;
                tL_secureData2.secret = (byte[]) n13.f2777a;
            }
            if (pwVar2 != null) {
                tL_inputSecureValue4.front_side = b(pwVar2);
                tL_inputSecureValue4.flags |= 2;
            }
            if (pwVar3 != null) {
                tL_inputSecureValue4.reverse_side = b(pwVar3);
                tL_inputSecureValue4.flags |= 4;
            }
            if (pwVar != null) {
                tL_inputSecureValue4.selfie = b(pwVar);
                tL_inputSecureValue4.flags |= 8;
            }
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                tL_inputSecureValue4.flags |= 64;
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    tL_inputSecureValue4.translation.add(b((org.telegram.messenger.pw) arrayList2.get(i11)));
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                tL_inputSecureValue4.flags |= 16;
                int size2 = arrayList.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    tL_inputSecureValue4.files.add(b((org.telegram.messenger.pw) arrayList.get(i12)));
                }
            }
            if (z10) {
                tL_inputSecureValue = tL_inputSecureValue4;
            } else {
                tL_inputSecureValue2 = tL_inputSecureValue4;
                TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
                savesecurevalue.value = tL_inputSecureValue;
                savesecurevalue.secure_secret_id = ll0Var.f39262b1;
                i10 = ((org.telegram.ui.ActionBar.k2) ll0Var).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(savesecurevalue, new ok0(this, cVar, str, savesecurevalue, tL_secureRequiredType2, tL_secureRequiredType, arrayList, pwVar, pwVar2, pwVar3, arrayList2, str2, str3, runnable, this, tL_inputSecureValue2));
            }
        }
        tL_inputSecureValue2 = null;
        TL_account.saveSecureValue savesecurevalue2 = new TL_account.saveSecureValue();
        savesecurevalue2.value = tL_inputSecureValue;
        savesecurevalue2.secure_secret_id = ll0Var.f39262b1;
        i10 = ((org.telegram.ui.ActionBar.k2) ll0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(savesecurevalue2, new ok0(this, cVar, str, savesecurevalue2, tL_secureRequiredType2, tL_secureRequiredType, arrayList, pwVar, pwVar2, pwVar3, arrayList2, str2, str3, runnable, this, tL_inputSecureValue2));
    }
}
