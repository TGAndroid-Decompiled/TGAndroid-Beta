package org.telegram.ui;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class gj0 implements sj0 {
    public final TLRPC.SecureValueType f45989a;
    public final boolean f45990b;
    public final int f45991c;
    public final bk0 d;

    public gj0(bk0 bk0Var, TLRPC.SecureValueType secureValueType, boolean z9, int i7) {
        this.d = bk0Var;
        this.f45989a = secureValueType;
        this.f45990b = z9;
        this.f45991c = i7;
    }

    public static void a(gj0 gj0Var, org.telegram.messenger.ew ewVar, TLRPC.TL_secureFile tL_secureFile) {
        gj0Var.getClass();
        org.telegram.messenger.w7.G(org.telegram.messenger.p10.f24459s0);
        File I = org.telegram.messenger.w7.I(ewVar);
        org.telegram.messenger.w7.G(org.telegram.messenger.p10.f24459s0);
        File I2 = org.telegram.messenger.w7.I(tL_secureFile);
        I.renameTo(I2);
        org.telegram.messenger.gc.D().S(ewVar.f22259b.dc_id + "_" + ewVar.f22259b.f27089id, tL_secureFile.dc_id + "_" + tL_secureFile.f27089id, null);
    }

    public static TLRPC.InputSecureFile b(org.telegram.messenger.ew ewVar) {
        if (ewVar.d != null) {
            TLRPC.TL_inputSecureFileUploaded tL_inputSecureFileUploaded = new TLRPC.TL_inputSecureFileUploaded();
            TLRPC.TL_inputFile tL_inputFile = ewVar.d;
            tL_inputSecureFileUploaded.f27020id = tL_inputFile.f26966id;
            tL_inputSecureFileUploaded.parts = tL_inputFile.parts;
            tL_inputSecureFileUploaded.md5_checksum = tL_inputFile.md5_checksum;
            tL_inputSecureFileUploaded.file_hash = ewVar.f22262f;
            tL_inputSecureFileUploaded.secret = ewVar.f22261e;
            return tL_inputSecureFileUploaded;
        }
        TLRPC.TL_inputSecureFile tL_inputSecureFile = new TLRPC.TL_inputSecureFile();
        TLRPC.TL_secureFile tL_secureFile = ewVar.f22259b;
        tL_inputSecureFile.f27019id = tL_secureFile.f27089id;
        tL_inputSecureFile.access_hash = tL_secureFile.access_hash;
        return tL_inputSecureFile;
    }

    public final void c(TLRPC.TL_secureRequiredType tL_secureRequiredType, String str, String str2, TLRPC.TL_secureRequiredType tL_secureRequiredType2, String str3, ArrayList arrayList, org.telegram.messenger.ew ewVar, ArrayList arrayList2, org.telegram.messenger.ew ewVar2, org.telegram.messenger.ew ewVar3, Runnable runnable, m4.d0 d0Var) {
        TLRPC.TL_inputSecureValue tL_inputSecureValue;
        TLRPC.TL_securePlainPhone tL_securePlainPhone;
        TLRPC.TL_inputSecureValue tL_inputSecureValue2;
        int i7;
        boolean isEmpty = TextUtils.isEmpty(str2);
        bk0 bk0Var = this.d;
        if (!isEmpty) {
            tL_inputSecureValue = new TLRPC.TL_inputSecureValue();
            tL_inputSecureValue.type = tL_secureRequiredType.type;
            tL_inputSecureValue.flags |= 1;
            a8.r7 o12 = bk0Var.o1(org.telegram.messenger.g0.h1(str2));
            TLRPC.TL_secureData tL_secureData = new TLRPC.TL_secureData();
            tL_inputSecureValue.data = tL_secureData;
            tL_secureData.data = (byte[]) o12.d;
            tL_secureData.data_hash = (byte[]) o12.f616e;
            tL_secureData.secret = (byte[]) o12.f614b;
        } else if (!TextUtils.isEmpty(str)) {
            TLRPC.SecureValueType secureValueType = this.f45989a;
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
        boolean z9 = this.f45990b;
        if (!z9 && tL_inputSecureValue == null) {
            if (d0Var != null) {
                d0Var.a(null, null);
                return;
            }
            return;
        }
        if (tL_secureRequiredType2 != null) {
            TLRPC.TL_inputSecureValue tL_inputSecureValue4 = new TLRPC.TL_inputSecureValue();
            tL_inputSecureValue4.type = tL_secureRequiredType2.type;
            if (!TextUtils.isEmpty(str3)) {
                tL_inputSecureValue4.flags |= 1;
                a8.r7 o13 = bk0Var.o1(org.telegram.messenger.g0.h1(str3));
                TLRPC.TL_secureData tL_secureData2 = new TLRPC.TL_secureData();
                tL_inputSecureValue4.data = tL_secureData2;
                tL_secureData2.data = (byte[]) o13.d;
                tL_secureData2.data_hash = (byte[]) o13.f616e;
                tL_secureData2.secret = (byte[]) o13.f614b;
            }
            if (ewVar2 != null) {
                tL_inputSecureValue4.front_side = b(ewVar2);
                tL_inputSecureValue4.flags |= 2;
            }
            if (ewVar3 != null) {
                tL_inputSecureValue4.reverse_side = b(ewVar3);
                tL_inputSecureValue4.flags |= 4;
            }
            if (ewVar != null) {
                tL_inputSecureValue4.selfie = b(ewVar);
                tL_inputSecureValue4.flags |= 8;
            }
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                tL_inputSecureValue4.flags |= 64;
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    tL_inputSecureValue4.translation.add(b((org.telegram.messenger.ew) arrayList2.get(i10)));
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                tL_inputSecureValue4.flags |= 16;
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    tL_inputSecureValue4.files.add(b((org.telegram.messenger.ew) arrayList.get(i11)));
                }
            }
            if (z9) {
                tL_inputSecureValue = tL_inputSecureValue4;
            } else {
                tL_inputSecureValue2 = tL_inputSecureValue4;
                TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
                savesecurevalue.value = tL_inputSecureValue;
                savesecurevalue.secure_secret_id = bk0Var.f44349b1;
                i7 = ((org.telegram.ui.ActionBar.f2) bk0Var).currentAccount;
                ConnectionsManager.getInstance(i7).sendRequest(savesecurevalue, new fj0(this, d0Var, str, savesecurevalue, tL_secureRequiredType2, tL_secureRequiredType, arrayList, ewVar, ewVar2, ewVar3, arrayList2, str2, str3, runnable, this, tL_inputSecureValue2));
            }
        }
        tL_inputSecureValue2 = null;
        TL_account.saveSecureValue savesecurevalue2 = new TL_account.saveSecureValue();
        savesecurevalue2.value = tL_inputSecureValue;
        savesecurevalue2.secure_secret_id = bk0Var.f44349b1;
        i7 = ((org.telegram.ui.ActionBar.f2) bk0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(savesecurevalue2, new fj0(this, d0Var, str, savesecurevalue2, tL_secureRequiredType2, tL_secureRequiredType, arrayList, ewVar, ewVar2, ewVar3, arrayList2, str2, str3, runnable, this, tL_inputSecureValue2));
    }
}
