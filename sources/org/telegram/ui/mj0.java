package org.telegram.ui;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class mj0 implements yj0 {
    public final TLRPC.SecureValueType f49844a;
    public final boolean f49845b;
    public final int f49846c;
    public final hk0 d;

    public mj0(hk0 hk0Var, TLRPC.SecureValueType secureValueType, boolean z10, int i7) {
        this.d = hk0Var;
        this.f49844a = secureValueType;
        this.f49845b = z10;
        this.f49846c = i7;
    }

    public static void a(mj0 mj0Var, org.telegram.messenger.yv yvVar, TLRPC.TL_secureFile tL_secureFile) {
        mj0Var.getClass();
        org.telegram.messenger.w7.G(org.telegram.messenger.j10.f24770t0);
        File I = org.telegram.messenger.w7.I(yvVar);
        org.telegram.messenger.w7.G(org.telegram.messenger.j10.f24770t0);
        File I2 = org.telegram.messenger.w7.I(tL_secureFile);
        I.renameTo(I2);
        org.telegram.messenger.ec.D().S(yvVar.f28188b.dc_id + "_" + yvVar.f28188b.f28540id, tL_secureFile.dc_id + "_" + tL_secureFile.f28540id, null);
    }

    public static TLRPC.InputSecureFile b(org.telegram.messenger.yv yvVar) {
        if (yvVar.d != null) {
            TLRPC.TL_inputSecureFileUploaded tL_inputSecureFileUploaded = new TLRPC.TL_inputSecureFileUploaded();
            TLRPC.TL_inputFile tL_inputFile = yvVar.d;
            tL_inputSecureFileUploaded.f28471id = tL_inputFile.f28417id;
            tL_inputSecureFileUploaded.parts = tL_inputFile.parts;
            tL_inputSecureFileUploaded.md5_checksum = tL_inputFile.md5_checksum;
            tL_inputSecureFileUploaded.file_hash = yvVar.f28191f;
            tL_inputSecureFileUploaded.secret = yvVar.f28190e;
            return tL_inputSecureFileUploaded;
        }
        TLRPC.TL_inputSecureFile tL_inputSecureFile = new TLRPC.TL_inputSecureFile();
        TLRPC.TL_secureFile tL_secureFile = yvVar.f28188b;
        tL_inputSecureFile.f28470id = tL_secureFile.f28540id;
        tL_inputSecureFile.access_hash = tL_secureFile.access_hash;
        return tL_inputSecureFile;
    }

    public final void c(TLRPC.TL_secureRequiredType tL_secureRequiredType, String str, String str2, TLRPC.TL_secureRequiredType tL_secureRequiredType2, String str3, ArrayList arrayList, org.telegram.messenger.yv yvVar, ArrayList arrayList2, org.telegram.messenger.yv yvVar2, org.telegram.messenger.yv yvVar3, Runnable runnable, k8.a aVar) {
        TLRPC.TL_inputSecureValue tL_inputSecureValue;
        TLRPC.TL_securePlainPhone tL_securePlainPhone;
        TLRPC.TL_inputSecureValue tL_inputSecureValue2;
        int i7;
        boolean isEmpty = TextUtils.isEmpty(str2);
        hk0 hk0Var = this.d;
        if (!isEmpty) {
            tL_inputSecureValue = new TLRPC.TL_inputSecureValue();
            tL_inputSecureValue.type = tL_secureRequiredType.type;
            tL_inputSecureValue.flags |= 1;
            a8.r7 o12 = hk0Var.o1(org.telegram.messenger.g0.h1(str2));
            TLRPC.TL_secureData tL_secureData = new TLRPC.TL_secureData();
            tL_inputSecureValue.data = tL_secureData;
            tL_secureData.data = (byte[]) o12.d;
            tL_secureData.data_hash = (byte[]) o12.f619e;
            tL_secureData.secret = (byte[]) o12.f617b;
        } else if (!TextUtils.isEmpty(str)) {
            TLRPC.SecureValueType secureValueType = this.f49844a;
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
        boolean z10 = this.f49845b;
        if (!z10 && tL_inputSecureValue == null) {
            if (aVar != null) {
                aVar.d(null, null);
                return;
            }
            return;
        }
        if (tL_secureRequiredType2 != null) {
            TLRPC.TL_inputSecureValue tL_inputSecureValue4 = new TLRPC.TL_inputSecureValue();
            tL_inputSecureValue4.type = tL_secureRequiredType2.type;
            if (!TextUtils.isEmpty(str3)) {
                tL_inputSecureValue4.flags |= 1;
                a8.r7 o13 = hk0Var.o1(org.telegram.messenger.g0.h1(str3));
                TLRPC.TL_secureData tL_secureData2 = new TLRPC.TL_secureData();
                tL_inputSecureValue4.data = tL_secureData2;
                tL_secureData2.data = (byte[]) o13.d;
                tL_secureData2.data_hash = (byte[]) o13.f619e;
                tL_secureData2.secret = (byte[]) o13.f617b;
            }
            if (yvVar2 != null) {
                tL_inputSecureValue4.front_side = b(yvVar2);
                tL_inputSecureValue4.flags |= 2;
            }
            if (yvVar3 != null) {
                tL_inputSecureValue4.reverse_side = b(yvVar3);
                tL_inputSecureValue4.flags |= 4;
            }
            if (yvVar != null) {
                tL_inputSecureValue4.selfie = b(yvVar);
                tL_inputSecureValue4.flags |= 8;
            }
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                tL_inputSecureValue4.flags |= 64;
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    tL_inputSecureValue4.translation.add(b((org.telegram.messenger.yv) arrayList2.get(i10)));
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                tL_inputSecureValue4.flags |= 16;
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    tL_inputSecureValue4.files.add(b((org.telegram.messenger.yv) arrayList.get(i11)));
                }
            }
            if (z10) {
                tL_inputSecureValue = tL_inputSecureValue4;
            } else {
                tL_inputSecureValue2 = tL_inputSecureValue4;
                TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
                savesecurevalue.value = tL_inputSecureValue;
                savesecurevalue.secure_secret_id = hk0Var.f48377c1;
                i7 = ((org.telegram.ui.ActionBar.h2) hk0Var).currentAccount;
                ConnectionsManager.getInstance(i7).sendRequest(savesecurevalue, new lj0(this, aVar, str, savesecurevalue, tL_secureRequiredType2, tL_secureRequiredType, arrayList, yvVar, yvVar2, yvVar3, arrayList2, str2, str3, runnable, this, tL_inputSecureValue2));
            }
        }
        tL_inputSecureValue2 = null;
        TL_account.saveSecureValue savesecurevalue2 = new TL_account.saveSecureValue();
        savesecurevalue2.value = tL_inputSecureValue;
        savesecurevalue2.secure_secret_id = hk0Var.f48377c1;
        i7 = ((org.telegram.ui.ActionBar.h2) hk0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(savesecurevalue2, new lj0(this, aVar, str, savesecurevalue2, tL_secureRequiredType2, tL_secureRequiredType, arrayList, yvVar, yvVar2, yvVar3, arrayList2, str2, str3, runnable, this, tL_inputSecureValue2));
    }
}
