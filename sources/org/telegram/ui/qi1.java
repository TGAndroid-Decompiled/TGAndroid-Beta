package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class qi1 implements OnFailureListener {
    public final int f37762a;
    public final ph.d f37763b;

    public qi1(ph.d dVar, int i10) {
        this.f37762a = i10;
        this.f37763b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f37762a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f37763b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f37763b.setLoading(false);
                return;
        }
    }
}
