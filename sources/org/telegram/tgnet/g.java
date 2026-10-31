package org.telegram.tgnet;

import android.graphics.drawable.Drawable;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.mc;
import org.telegram.messenger.q20;
public final class g implements OnSuccessListener, OnFailureListener, mc {
    public final int f19977a;
    public final long f19978b;
    public final int f19979c;
    public final Object d;

    public g(int i10, int i11, long j10, q20 q20Var) {
        this.f19977a = i10;
        this.d = q20Var;
        this.f19979c = i11;
        this.f19978b = j10;
    }

    @Override
    public void o(org.telegram.messenger.ImageReceiver r6, boolean r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.g.o(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    @Override
    public void onFailure(Exception exc) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$26(this.f19977a, this.f19978b, this.f19979c, (String) this.d, exc);
    }

    @Override
    public void onSuccess(Object obj) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$25(this.f19977a, this.f19978b, this.f19979c, (String) this.d, (IntegrityTokenResponse) obj);
    }

    public g(int i10, long j10, String str, int i11) {
        this.f19977a = i10;
        this.f19978b = j10;
        this.f19979c = i11;
        this.d = str;
    }

    @Override
    public void j(ImageReceiver imageReceiver) {
    }

    @Override
    public void q(int i10, Drawable drawable) {
    }
}
