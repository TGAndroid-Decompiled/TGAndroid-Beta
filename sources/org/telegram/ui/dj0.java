package org.telegram.ui;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class dj0 implements pj0 {
    public final TLRPC.SecureValueType f44722a;
    public final boolean f44723b;
    public final int f44724c;
    public final yj0 d;

    public dj0(yj0 yj0Var, TLRPC.SecureValueType secureValueType, boolean z10, int i3) {
        this.d = yj0Var;
        this.f44722a = secureValueType;
        this.f44723b = z10;
        this.f44724c = i3;
    }

    public static void a(dj0 dj0Var, org.telegram.messenger.wv wvVar, TLRPC.TL_secureFile tL_secureFile) {
        dj0Var.getClass();
        org.telegram.messenger.w7.G(org.telegram.messenger.h10.f22829t0);
        File I = org.telegram.messenger.w7.I(wvVar);
        org.telegram.messenger.w7.G(org.telegram.messenger.h10.f22829t0);
        File I2 = org.telegram.messenger.w7.I(tL_secureFile);
        I.renameTo(I2);
        org.telegram.messenger.zb.D().S(wvVar.f26263b.dc_id + "_" + wvVar.f26263b.f27138id, tL_secureFile.dc_id + "_" + tL_secureFile.f27138id, null);
    }

    public static TLRPC.InputSecureFile b(org.telegram.messenger.wv wvVar) {
        if (wvVar.d != null) {
            TLRPC.TL_inputSecureFileUploaded tL_inputSecureFileUploaded = new TLRPC.TL_inputSecureFileUploaded();
            TLRPC.TL_inputFile tL_inputFile = wvVar.d;
            tL_inputSecureFileUploaded.f27069id = tL_inputFile.f27015id;
            tL_inputSecureFileUploaded.parts = tL_inputFile.parts;
            tL_inputSecureFileUploaded.md5_checksum = tL_inputFile.md5_checksum;
            tL_inputSecureFileUploaded.file_hash = wvVar.f26266f;
            tL_inputSecureFileUploaded.secret = wvVar.f26265e;
            return tL_inputSecureFileUploaded;
        }
        TLRPC.TL_inputSecureFile tL_inputSecureFile = new TLRPC.TL_inputSecureFile();
        TLRPC.TL_secureFile tL_secureFile = wvVar.f26263b;
        tL_inputSecureFile.f27068id = tL_secureFile.f27138id;
        tL_inputSecureFile.access_hash = tL_secureFile.access_hash;
        return tL_inputSecureFile;
    }

    public final void c(TLRPC.TL_secureRequiredType tL_secureRequiredType, String str, String str2, TLRPC.TL_secureRequiredType tL_secureRequiredType2, String str3, ArrayList arrayList, org.telegram.messenger.wv wvVar, ArrayList arrayList2, org.telegram.messenger.wv wvVar2, org.telegram.messenger.wv wvVar3, Runnable runnable, m2.t tVar) {
        TLRPC.TL_inputSecureValue tL_inputSecureValue;
        TLRPC.TL_securePlainPhone tL_securePlainPhone;
        TLRPC.TL_inputSecureValue tL_inputSecureValue2;
        int i3;
        boolean isEmpty = TextUtils.isEmpty(str2);
        yj0 yj0Var = this.d;
        if (!isEmpty) {
            tL_inputSecureValue = new TLRPC.TL_inputSecureValue();
            tL_inputSecureValue.type = tL_secureRequiredType.type;
            tL_inputSecureValue.flags |= 1;
            b8.ke o12 = yj0Var.o1(org.telegram.messenger.g0.h1(str2));
            TLRPC.TL_secureData tL_secureData = new TLRPC.TL_secureData();
            tL_inputSecureValue.data = tL_secureData;
            tL_secureData.data = (byte[]) o12.d;
            tL_secureData.data_hash = (byte[]) o12.f2718e;
            tL_secureData.secret = (byte[]) o12.f2716b;
        } else if (!TextUtils.isEmpty(str)) {
            TLRPC.SecureValueType secureValueType = this.f44722a;
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
        boolean z10 = this.f44723b;
        if (!z10 && tL_inputSecureValue == null) {
            if (tVar != null) {
                tVar.f(null, null);
                return;
            }
            return;
        }
        if (tL_secureRequiredType2 != null) {
            TLRPC.TL_inputSecureValue tL_inputSecureValue4 = new TLRPC.TL_inputSecureValue();
            tL_inputSecureValue4.type = tL_secureRequiredType2.type;
            if (!TextUtils.isEmpty(str3)) {
                tL_inputSecureValue4.flags |= 1;
                b8.ke o13 = yj0Var.o1(org.telegram.messenger.g0.h1(str3));
                TLRPC.TL_secureData tL_secureData2 = new TLRPC.TL_secureData();
                tL_inputSecureValue4.data = tL_secureData2;
                tL_secureData2.data = (byte[]) o13.d;
                tL_secureData2.data_hash = (byte[]) o13.f2718e;
                tL_secureData2.secret = (byte[]) o13.f2716b;
            }
            if (wvVar2 != null) {
                tL_inputSecureValue4.front_side = b(wvVar2);
                tL_inputSecureValue4.flags |= 2;
            }
            if (wvVar3 != null) {
                tL_inputSecureValue4.reverse_side = b(wvVar3);
                tL_inputSecureValue4.flags |= 4;
            }
            if (wvVar != null) {
                tL_inputSecureValue4.selfie = b(wvVar);
                tL_inputSecureValue4.flags |= 8;
            }
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                tL_inputSecureValue4.flags |= 64;
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    tL_inputSecureValue4.translation.add(b((org.telegram.messenger.wv) arrayList2.get(i10)));
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                tL_inputSecureValue4.flags |= 16;
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    tL_inputSecureValue4.files.add(b((org.telegram.messenger.wv) arrayList.get(i11)));
                }
            }
            if (z10) {
                tL_inputSecureValue = tL_inputSecureValue4;
            } else {
                tL_inputSecureValue2 = tL_inputSecureValue4;
                TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
                savesecurevalue.value = tL_inputSecureValue;
                savesecurevalue.secure_secret_id = yj0Var.f52292c1;
                i3 = ((org.telegram.ui.ActionBar.d2) yj0Var).currentAccount;
                ConnectionsManager.getInstance(i3).sendRequest(savesecurevalue, new cj0(this, tVar, str, savesecurevalue, tL_secureRequiredType2, tL_secureRequiredType, arrayList, wvVar, wvVar2, wvVar3, arrayList2, str2, str3, runnable, this, tL_inputSecureValue2));
            }
        }
        tL_inputSecureValue2 = null;
        TL_account.saveSecureValue savesecurevalue2 = new TL_account.saveSecureValue();
        savesecurevalue2.value = tL_inputSecureValue;
        savesecurevalue2.secure_secret_id = yj0Var.f52292c1;
        i3 = ((org.telegram.ui.ActionBar.d2) yj0Var).currentAccount;
        ConnectionsManager.getInstance(i3).sendRequest(savesecurevalue2, new cj0(this, tVar, str, savesecurevalue2, tL_secureRequiredType2, tL_secureRequiredType, arrayList, wvVar, wvVar2, wvVar3, arrayList2, str2, str3, runnable, this, tL_inputSecureValue2));
    }
}
