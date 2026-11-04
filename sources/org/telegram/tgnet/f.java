package org.telegram.tgnet;

import android.graphics.drawable.Drawable;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ec;
import org.telegram.messenger.u10;
public final class f implements OnSuccessListener, OnFailureListener, ec {
    public final int f27184a;
    public final long f27185b;
    public final int f27186c;
    public final Object d;

    public f(int i3, int i10, long j10, u10 u10Var) {
        this.f27184a = i3;
        this.d = u10Var;
        this.f27186c = i10;
        this.f27185b = j10;
    }

    @Override
    public void l0(org.telegram.messenger.ImageReceiver r6, boolean r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.f.l0(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    @Override
    public void onFailure(Exception exc) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$26(this.f27184a, this.f27185b, this.f27186c, (String) this.d, exc);
    }

    @Override
    public void onSuccess(Object obj) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$25(this.f27184a, this.f27185b, this.f27186c, (String) this.d, (IntegrityTokenResponse) obj);
    }

    public f(int i3, long j10, String str, int i10) {
        this.f27184a = i3;
        this.f27185b = j10;
        this.f27186c = i10;
        this.d = str;
    }

    @Override
    public void D(ImageReceiver imageReceiver) {
    }

    @Override
    public void F0(int i3, Drawable drawable) {
    }
}
