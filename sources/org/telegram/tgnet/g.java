package org.telegram.tgnet;

import android.graphics.drawable.Drawable;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.nc;
import org.telegram.messenger.r20;
public final class g implements OnSuccessListener, OnFailureListener, nc {
    public final int f19978a;
    public final long f19979b;
    public final int f19980c;
    public final Object d;

    public g(int i10, int i11, long j10, r20 r20Var) {
        this.f19978a = i10;
        this.d = r20Var;
        this.f19980c = i11;
        this.f19979b = j10;
    }

    @Override
    public void onFailure(Exception exc) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$26(this.f19978a, this.f19979b, this.f19980c, (String) this.d, exc);
    }

    @Override
    public void onSuccess(Object obj) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$25(this.f19978a, this.f19979b, this.f19980c, (String) this.d, (IntegrityTokenResponse) obj);
    }

    @Override
    public void q(org.telegram.messenger.ImageReceiver r6, boolean r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.g.q(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    public g(int i10, long j10, String str, int i11) {
        this.f19978a = i10;
        this.f19979b = j10;
        this.f19980c = i11;
        this.d = str;
    }

    @Override
    public void j(ImageReceiver imageReceiver) {
    }

    @Override
    public void s(int i10, Drawable drawable) {
    }
}
