package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class b7 {
    public final CountDownLatch f34048a = new CountDownLatch(1);
    public int f34049b;
    public byte[] f34050c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f34048a.getCount() == 0) {
            return;
        }
        this.f34050c = bArr;
        this.d = hostException;
        this.f34048a.countDown();
    }
}
