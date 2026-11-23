package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class z7 {
    public final CountDownLatch f45400a = new CountDownLatch(1);
    public int f45401b;
    public byte[] f45402c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f45400a.getCount() == 0) {
            return;
        }
        this.f45402c = bArr;
        this.d = hostException;
        this.f45400a.countDown();
    }
}
