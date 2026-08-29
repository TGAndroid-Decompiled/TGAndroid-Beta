package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class di1 implements OnFailureListener {
    public final int f37546a;
    public final nh.d f37547b;

    public di1(nh.d dVar, int i10) {
        this.f37546a = i10;
        this.f37547b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f37546a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f37547b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f37547b.setLoading(false);
                return;
        }
    }
}
