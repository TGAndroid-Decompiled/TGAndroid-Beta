package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class t6 {
    public final CountDownLatch f35578a = new CountDownLatch(1);
    public int f35579b;
    public byte[] f35580c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f35578a.getCount() == 0) {
            return;
        }
        this.f35580c = bArr;
        this.d = hostException;
        this.f35578a.countDown();
    }
}
