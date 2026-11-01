package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
public final class oe1 implements OnFailureListener {
    public final int f40146a;
    public final vh.d f40147b;

    public oe1(vh.d dVar, int i10) {
        this.f40146a = i10;
        this.f40147b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f40146a) {
            case 0:
                org.telegram.messenger.f8.d("wear-auth: /answer send failed: " + exc.getMessage());
                this.f40147b.setLoading(false);
                return;
            default:
                org.telegram.messenger.f8.d("wear-auth: /token send failed: " + exc.getMessage());
                this.f40147b.setLoading(false);
                return;
        }
    }
}
