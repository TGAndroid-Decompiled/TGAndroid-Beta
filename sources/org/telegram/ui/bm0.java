package org.telegram.ui;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class bm0 implements om0 {

    public final TLRPC.SecureValueType f36852a;

    public final boolean f36853b;

    public final int f36854c;
    public final xm0 d;

    public bm0(xm0 xm0Var, TLRPC.SecureValueType secureValueType, boolean z10, int i10) {
        this.d = xm0Var;
        this.f36852a = secureValueType;
        this.f36853b = z10;
        this.f36854c = i10;
    }

    public static void a(bm0 bm0Var, SecureDocument secureDocument, TLRPC.TL_secureFile tL_secureFile) {
        bm0Var.getClass();
        File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(secureDocument);
        String str = secureDocument.secureFile.dc_id + "_" + secureDocument.secureFile.f22515id;
        File pathToAttach2 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_secureFile);
        String str2 = tL_secureFile.dc_id + "_" + tL_secureFile.f22515id;
        pathToAttach.renameTo(pathToAttach2);
        ImageLoader.getInstance().replaceImageInCache(str, str2, null, false);
    }

    public static TLRPC.InputSecureFile b(SecureDocument secureDocument) {
        if (secureDocument.inputFile == null) {
            TLRPC.TL_inputSecureFile tL_inputSecureFile = new TLRPC.TL_inputSecureFile();
            TLRPC.TL_secureFile tL_secureFile = secureDocument.secureFile;
            tL_inputSecureFile.f22447id = tL_secureFile.f22515id;
            tL_inputSecureFile.access_hash = tL_secureFile.access_hash;
            return tL_inputSecureFile;
        }
        TLRPC.TL_inputSecureFileUploaded tL_inputSecureFileUploaded = new TLRPC.TL_inputSecureFileUploaded();
        TLRPC.TL_inputFile tL_inputFile = secureDocument.inputFile;
        tL_inputSecureFileUploaded.f22448id = tL_inputFile.f22394id;
        tL_inputSecureFileUploaded.parts = tL_inputFile.parts;
        tL_inputSecureFileUploaded.md5_checksum = tL_inputFile.md5_checksum;
        tL_inputSecureFileUploaded.file_hash = secureDocument.fileHash;
        tL_inputSecureFileUploaded.secret = secureDocument.fileSecret;
        return tL_inputSecureFileUploaded;
    }

    public final void c(TLRPC.TL_secureRequiredType tL_secureRequiredType, String str, String str2, TLRPC.TL_secureRequiredType tL_secureRequiredType2, String str3, ArrayList arrayList, SecureDocument secureDocument, ArrayList arrayList2, SecureDocument secureDocument2, SecureDocument secureDocument3, Runnable runnable, i6 i6Var) {
        TLRPC.TL_inputSecureValue tL_inputSecureValue;
        TLRPC.SecurePlainData securePlainData;
        TLRPC.TL_inputSecureValue tL_inputSecureValue2;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        xm0 xm0Var = this.d;
        if (!zIsEmpty) {
            tL_inputSecureValue = new TLRPC.TL_inputSecureValue();
            tL_inputSecureValue.type = tL_secureRequiredType.type;
            tL_inputSecureValue.flags |= 1;
            af.h hVarK1 = xm0Var.k1(AndroidUtilities.getStringBytes(str2));
            TLRPC.TL_secureData tL_secureData = new TLRPC.TL_secureData();
            tL_inputSecureValue.data = tL_secureData;
            tL_secureData.data = (byte[]) hVarK1.f276c;
            tL_secureData.data_hash = (byte[]) hVarK1.d;
            tL_secureData.secret = (byte[]) hVarK1.f274a;
        } else if (TextUtils.isEmpty(str)) {
            tL_inputSecureValue = null;
        } else {
            TLRPC.SecureValueType secureValueType = this.f36852a;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
                TLRPC.TL_securePlainEmail tL_securePlainEmail = new TLRPC.TL_securePlainEmail();
                tL_securePlainEmail.email = str;
                securePlainData = tL_securePlainEmail;
            } else {
                if (!(secureValueType instanceof TLRPC.TL_secureValueTypePhone)) {
                    return;
                }
                TLRPC.TL_securePlainPhone tL_securePlainPhone = new TLRPC.TL_securePlainPhone();
                tL_securePlainPhone.phone = str;
                securePlainData = tL_securePlainPhone;
            }
            TLRPC.TL_inputSecureValue tL_inputSecureValue3 = new TLRPC.TL_inputSecureValue();
            tL_inputSecureValue3.type = tL_secureRequiredType.type;
            tL_inputSecureValue3.flags |= 32;
            tL_inputSecureValue3.plain_data = securePlainData;
            tL_inputSecureValue = tL_inputSecureValue3;
        }
        boolean z10 = this.f36853b;
        if (!z10 && tL_inputSecureValue == null) {
            if (i6Var != null) {
                i6Var.S(null, null);
                return;
            }
            return;
        }
        if (tL_secureRequiredType2 != null) {
            TLRPC.TL_inputSecureValue tL_inputSecureValue4 = new TLRPC.TL_inputSecureValue();
            tL_inputSecureValue4.type = tL_secureRequiredType2.type;
            if (!TextUtils.isEmpty(str3)) {
                tL_inputSecureValue4.flags |= 1;
                af.h hVarK2 = xm0Var.k1(AndroidUtilities.getStringBytes(str3));
                TLRPC.TL_secureData tL_secureData2 = new TLRPC.TL_secureData();
                tL_inputSecureValue4.data = tL_secureData2;
                tL_secureData2.data = (byte[]) hVarK2.f276c;
                tL_secureData2.data_hash = (byte[]) hVarK2.d;
                tL_secureData2.secret = (byte[]) hVarK2.f274a;
            }
            if (secureDocument2 != null) {
                tL_inputSecureValue4.front_side = b(secureDocument2);
                tL_inputSecureValue4.flags |= 2;
            }
            if (secureDocument3 != null) {
                tL_inputSecureValue4.reverse_side = b(secureDocument3);
                tL_inputSecureValue4.flags |= 4;
            }
            if (secureDocument != null) {
                tL_inputSecureValue4.selfie = b(secureDocument);
                tL_inputSecureValue4.flags |= 8;
            }
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                tL_inputSecureValue4.flags |= 64;
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    tL_inputSecureValue4.translation.add(b((SecureDocument) arrayList2.get(i10)));
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                tL_inputSecureValue4.flags |= 16;
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    tL_inputSecureValue4.files.add(b((SecureDocument) arrayList.get(i11)));
                }
            }
            if (z10) {
                tL_inputSecureValue = tL_inputSecureValue4;
                tL_inputSecureValue2 = null;
            } else {
                tL_inputSecureValue2 = tL_inputSecureValue4;
            }
        } else {
            tL_inputSecureValue2 = null;
        }
        TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
        savesecurevalue.value = tL_inputSecureValue;
        savesecurevalue.secure_secret_id = xm0Var.X0;
        ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount).sendRequest(savesecurevalue, new am0(this, i6Var, str, savesecurevalue, tL_secureRequiredType2, tL_secureRequiredType, arrayList, secureDocument, secureDocument2, secureDocument3, arrayList2, str2, str3, runnable, this, tL_inputSecureValue2));
    }
}
