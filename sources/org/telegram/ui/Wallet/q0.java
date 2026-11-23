package org.telegram.ui.Wallet;

import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
public final class q0 {
    public final String f44903a;
    public final long f44904b;
    public final byte[] f44905c;
    public final byte[] d;
    public final int f44906e;
    public q0 f44907f;
    public List f44908g;
    public TL_wallet.WalletOnchainGiftAction h;
    public TL_stars.StarGift f44909i;

    public q0(String str, long j3, byte[] bArr, byte[] bArr2, int i7) {
        this.f44903a = str;
        this.f44904b = j3;
        this.f44905c = bArr;
        this.d = bArr2;
        this.f44906e = i7;
    }

    public static q0 a(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty() && arrayList.size() <= 255) {
            if (arrayList.size() == 1) {
                return b((TL_stars.TL_payments_starGiftOnchainOfferTxMessage) arrayList.get(0));
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            long j3 = 0;
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                q0 b10 = b((TL_stars.TL_payments_starGiftOnchainOfferTxMessage) obj);
                arrayList2.add(b10);
                j3 += b10.f44904b;
            }
            q0 q0Var = (q0) arrayList2.get(0);
            q0 q0Var2 = new q0(q0Var.f44903a, j3, q0Var.f44905c, q0Var.d, q0Var.f44906e);
            q0Var2.f44908g = DesugarCollections.unmodifiableList(arrayList2);
            return q0Var2;
        }
        throw new IllegalArgumentException("Invalid prepared message count");
    }

    public static q0 b(TL_stars.TL_payments_starGiftOnchainOfferTxMessage tL_payments_starGiftOnchainOfferTxMessage) {
        byte[] bArr;
        ca.q qVar;
        int i7;
        int i10;
        int[] iArr;
        TL_stars.TL_payments_starGiftOnchainOfferTxInitState tL_payments_starGiftOnchainOfferTxInitState = tL_payments_starGiftOnchainOfferTxMessage.init_state;
        ca.q qVar2 = null;
        if (tL_payments_starGiftOnchainOfferTxInitState != null) {
            byte[] bArr2 = tL_payments_starGiftOnchainOfferTxInitState.code;
            byte[] bArr3 = tL_payments_starGiftOnchainOfferTxInitState.data;
            if (bArr2 != null && bArr2.length > 0) {
                qVar = c8.bb.b(bArr2);
            } else {
                qVar = null;
            }
            if (bArr3 != null && bArr3.length > 0) {
                qVar2 = c8.bb.b(bArr3);
            }
            ArrayList arrayList = new ArrayList();
            ?? obj = new Object();
            arrayList.add(obj);
            ArrayList arrayList2 = new ArrayList();
            if (qVar != null) {
                arrayList2.add(Integer.valueOf(c8.bb.a(arrayList, qVar)));
            }
            if (qVar2 != null) {
                arrayList2.add(Integer.valueOf(c8.bb.a(arrayList, qVar2)));
            }
            if (qVar != null) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            if (qVar2 != null) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            obj.f45422c = new byte[]{(byte) (((i10 | i7) << 3) | 4)};
            obj.d = new int[arrayList2.size()];
            int i11 = 0;
            while (true) {
                iArr = obj.d;
                if (i11 >= iArr.length) {
                    break;
                }
                iArr[i11] = ((Integer) arrayList2.get(i11)).intValue();
                i11++;
            }
            obj.f45420a = iArr.length;
            obj.f45421b = 1;
            int size = arrayList.size();
            int i12 = 1;
            while (i12 < 4 && (size >>> (i12 * 8)) != 0) {
                i12++;
            }
            int size2 = arrayList.size();
            int i13 = 0;
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList.get(i14);
                i14++;
                y3 y3Var = (y3) obj2;
                i13 += (y3Var.d.length * i12) + y3Var.f45422c.length + 2;
            }
            int i15 = 1;
            while (i15 < 4 && (i13 >>> (i15 * 8)) != 0) {
                i15++;
            }
            int max = Math.max(1, i15);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            c8.bb.d(byteArrayOutputStream, -1242653582, 4);
            byteArrayOutputStream.write(i12 | 64);
            byteArrayOutputStream.write(max);
            c8.bb.d(byteArrayOutputStream, arrayList.size(), i12);
            c8.bb.d(byteArrayOutputStream, 1, i12);
            c8.bb.d(byteArrayOutputStream, 0, i12);
            c8.bb.d(byteArrayOutputStream, i13, max);
            c8.bb.d(byteArrayOutputStream, 0, i12);
            int size3 = arrayList.size();
            int i16 = 0;
            while (i16 < size3) {
                Object obj3 = arrayList.get(i16);
                i16++;
                y3 y3Var2 = (y3) obj3;
                byteArrayOutputStream.write(y3Var2.f45420a);
                byteArrayOutputStream.write(y3Var2.f45421b);
                byte[] bArr4 = y3Var2.f45422c;
                byteArrayOutputStream.write(bArr4, 0, bArr4.length);
                for (int i17 : y3Var2.d) {
                    c8.bb.d(byteArrayOutputStream, i17, i12);
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (c8.bb.f4496a == null) {
                int[] iArr2 = new int[256];
                for (int i18 = 0; i18 < 256; i18++) {
                    int i19 = i18;
                    for (int i20 = 0; i20 < 8; i20++) {
                        int i21 = i19 & 1;
                        i19 >>>= 1;
                        if (i21 != 0) {
                            i19 ^= -2097792136;
                        }
                    }
                    iArr2[i18] = i19;
                }
                c8.bb.f4496a = iArr2;
            }
            int i22 = -1;
            for (byte b10 : byteArray) {
                i22 = (i22 >>> 8) ^ c8.bb.f4496a[(b10 ^ i22) & 255];
            }
            int i23 = ~i22;
            byte[] bArr5 = new byte[byteArray.length + 4];
            System.arraycopy(byteArray, 0, bArr5, 0, byteArray.length);
            bArr5[byteArray.length] = (byte) i23;
            bArr5[byteArray.length + 1] = (byte) (i23 >>> 8);
            bArr5[byteArray.length + 2] = (byte) (i23 >>> 16);
            bArr5[byteArray.length + 3] = (byte) (i23 >>> 24);
            bArr = bArr5;
        } else {
            bArr = null;
        }
        return new q0(tL_payments_starGiftOnchainOfferTxMessage.destination, tL_payments_starGiftOnchainOfferTxMessage.value, tL_payments_starGiftOnchainOfferTxMessage.body, bArr, tL_payments_starGiftOnchainOfferTxMessage.mode);
    }
}
