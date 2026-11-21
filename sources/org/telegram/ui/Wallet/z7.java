package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class z7 {
    public final CountDownLatch f45396a = new CountDownLatch(1);
    public int f45397b;
    public byte[] f45398c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f45396a.getCount() == 0) {
            return;
        }
        this.f45398c = bArr;
        this.d = hostException;
        this.f45396a.countDown();
    }
}
