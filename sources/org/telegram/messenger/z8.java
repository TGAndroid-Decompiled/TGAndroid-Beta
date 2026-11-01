package org.telegram.messenger;

import android.util.SparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
public final class z8 implements Runnable {
    public final int f19674a;
    public final d9 f19675b;

    public z8(d9 d9Var, int i10) {
        this.f19674a = i10;
        this.f19675b = d9Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f19674a) {
            case 0:
                d9 d9Var = this.f19675b;
                d9Var.L = w0.f18945b.getSharedPreferences("uploadinfo", 0);
                d9Var.f15315i = w0.p();
                if (v2.f18578a) {
                    f8.b("start upload on slow network = " + d9Var.f15315i);
                }
                if (d9Var.f15315i) {
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
                d9 d9Var2 = this.f19675b;
                SparseIntArray sparseIntArray = d9Var2.f15322p;
                for (int i12 = 0; i12 < sparseIntArray.size(); i12++) {
                    ConnectionsManager.getInstance(d9Var2.f15310a).cancelRequest(sparseIntArray.valueAt(i12), true);
                }
                return;
            case 2:
                this.f19675b.f15323q.clear();
                return;
            default:
                this.f19675b.e();
                return;
        }
    }
}
