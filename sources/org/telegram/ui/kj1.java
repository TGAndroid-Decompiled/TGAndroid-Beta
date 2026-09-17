package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class kj1 implements OnFailureListener {
    public final int f38109a;
    public final di.d f38110b;

    public kj1(di.d dVar, int i10) {
        this.f38109a = i10;
        this.f38110b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f38109a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f38110b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f38110b.setLoading(false);
                return;
        }
    }
}
