package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class cj1 implements OnFailureListener {
    public final int f35498a;
    public final ci.d f35499b;

    public cj1(ci.d dVar, int i10) {
        this.f35498a = i10;
        this.f35499b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f35498a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f35499b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f35499b.setLoading(false);
                return;
        }
    }
}
