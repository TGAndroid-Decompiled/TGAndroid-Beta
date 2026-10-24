package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class di1 implements OnFailureListener {
    public final int f36633a;
    public final ei.d f36634b;

    public di1(ei.d dVar, int i10) {
        this.f36633a = i10;
        this.f36634b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f36633a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f36634b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f36634b.setLoading(false);
                return;
        }
    }
}
