package org.telegram.tgnet;

import android.graphics.drawable.Drawable;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.kc;
import org.telegram.messenger.z10;
public final class f implements OnSuccessListener, OnFailureListener, kc {
    public final int f28234a;
    public final long f28235b;
    public final int f28236c;
    public final Object d;

    public f(int i7, int i10, long j3, z10 z10Var) {
        this.f28234a = i7;
        this.d = z10Var;
        this.f28236c = i10;
        this.f28235b = j3;
    }

    @Override
    public void I(org.telegram.messenger.ImageReceiver r6, boolean r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.f.I(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    @Override
    public void onFailure(Exception exc) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$26(this.f28234a, this.f28235b, this.f28236c, (String) this.d, exc);
    }

    @Override
    public void onSuccess(Object obj) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$25(this.f28234a, this.f28235b, this.f28236c, (String) this.d, (IntegrityTokenResponse) obj);
    }

    public f(int i7, long j3, String str, int i10) {
        this.f28234a = i7;
        this.f28235b = j3;
        this.f28236c = i10;
        this.d = str;
    }

    @Override
    public void A(ImageReceiver imageReceiver) {
    }

    @Override
    public void O(int i7, Drawable drawable) {
    }
}
