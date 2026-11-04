package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
public final class oc1 implements OnFailureListener {
    public final int f48268a;
    public final gi.d f48269b;

    public oc1(gi.d dVar, int i3) {
        this.f48268a = i3;
        this.f48269b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f48268a) {
            case 0:
                org.telegram.messenger.a8.d("wear-auth: /answer send failed: " + exc.getMessage());
                this.f48269b.setLoading(false);
                return;
            default:
                org.telegram.messenger.a8.d("wear-auth: /token send failed: " + exc.getMessage());
                this.f48269b.setLoading(false);
                return;
        }
    }
}
