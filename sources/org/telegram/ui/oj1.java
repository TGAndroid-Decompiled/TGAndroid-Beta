package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class oj1 implements OnFailureListener {
    public final int f35505a;
    public final bi.d f35506b;

    public oj1(bi.d dVar, int i10) {
        this.f35505a = i10;
        this.f35506b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f35505a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f35506b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f35506b.setLoading(false);
                return;
        }
    }
}
