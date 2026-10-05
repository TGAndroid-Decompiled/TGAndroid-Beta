package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class aj1 implements OnFailureListener {
    public final int f34892a;
    public final ci.d f34893b;

    public aj1(ci.d dVar, int i10) {
        this.f34892a = i10;
        this.f34893b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f34892a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f34893b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f34893b.setLoading(false);
                return;
        }
    }
}
