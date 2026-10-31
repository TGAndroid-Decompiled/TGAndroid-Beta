package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
public final class qe1 implements OnFailureListener {
    public final int f40970a;
    public final vh.d f40971b;

    public qe1(vh.d dVar, int i10) {
        this.f40970a = i10;
        this.f40971b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f40970a) {
            case 0:
                org.telegram.messenger.f8.d("wear-auth: /answer send failed: " + exc.getMessage());
                this.f40971b.setLoading(false);
                return;
            default:
                org.telegram.messenger.f8.d("wear-auth: /token send failed: " + exc.getMessage());
                this.f40971b.setLoading(false);
                return;
        }
    }
}
