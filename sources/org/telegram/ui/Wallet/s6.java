package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class s6 {
    public final CountDownLatch f35485a = new CountDownLatch(1);
    public int f35486b;
    public byte[] f35487c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f35485a.getCount() == 0) {
            return;
        }
        this.f35487c = bArr;
        this.d = hostException;
        this.f35485a.countDown();
    }
}
