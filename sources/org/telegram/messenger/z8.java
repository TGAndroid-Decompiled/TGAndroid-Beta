package org.telegram.messenger;

import android.util.SparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
public final class z8 implements Runnable {
    public final int f19489a;
    public final d9 f19490b;

    public z8(d9 d9Var, int i10) {
        this.f19489a = i10;
        this.f19490b = d9Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f19489a) {
            case 0:
                d9 d9Var = this.f19490b;
                d9Var.L = w0.f19025b.getSharedPreferences("uploadinfo", 0);
                d9Var.f15200i = w0.p();
                if (v2.f18448a) {
                    f8.b("start upload on slow network = " + d9Var.f15200i);
                }
                if (d9Var.f15200i) {
                    i10 = 1;
                } else {
                    i10 = 8;
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    d9Var.d();
                }
                d9Var.e();
                return;
            case 1:
                d9 d9Var2 = this.f19490b;
                SparseIntArray sparseIntArray = d9Var2.f15207p;
                for (int i12 = 0; i12 < sparseIntArray.size(); i12++) {
                    ConnectionsManager.getInstance(d9Var2.f15195a).cancelRequest(sparseIntArray.valueAt(i12), true);
                }
                return;
            case 2:
                this.f19490b.f15208q.clear();
                return;
            default:
                this.f19490b.e();
                return;
        }
    }
}
