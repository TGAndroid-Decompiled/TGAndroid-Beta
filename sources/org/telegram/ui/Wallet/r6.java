package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class r6 {
    public final CountDownLatch f33656a = new CountDownLatch(1);
    public int f33657b;
    public byte[] f33658c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f33656a.getCount() == 0) {
            return;
        }
        this.f33658c = bArr;
        this.d = hostException;
        this.f33656a.countDown();
    }
}
