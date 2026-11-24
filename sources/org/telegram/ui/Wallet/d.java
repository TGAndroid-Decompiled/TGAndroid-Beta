package org.telegram.ui.Wallet;

import org.telegram.ui.Wallet.WalletEngine2;
public final class d implements Runnable {
    public final byte a;
    public final Object b;
    public final String c;
    public final Object d;
    public final Object e;

    public d(WalletEngine2.SendCallbacks sendCallbacks, WalletEngine2.SendPhase sendPhase, String str, String str2) {
        this.a = (byte) 2;
        this.b = sendCallbacks;
        this.d = sendPhase;
        this.c = str;
        this.e = str2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object obj = this.e;
        String str = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((WalletEngine2) obj3).lambda$prepareRotateKey$37((nac) obj2, (WalletEngine2.PreparedRotation) obj, str);
                return;
            case 1:
                ((WalletEngine2) obj3).lambda$rotateKey$55((WalletEngine2.RotationCallbacks) obj2, (byte[]) obj, str);
                return;
            default:
                ((WalletEngine2.SendCallbacks) obj3).lambda$dispatch$0((WalletEngine2.SendPhase) obj2, str, (String) obj);
                return;
        }
    }

    public d(WalletEngine2 walletEngine2, Object obj, Object obj2, String str, byte b) {
        this.a = b;
        this.b = walletEngine2;
        this.d = obj;
        this.e = obj2;
        this.c = str;
    }
}
