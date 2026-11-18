package org.telegram.tgnet;

import android.graphics.drawable.Drawable;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.jc;
import org.telegram.messenger.x10;
public final class f implements OnSuccessListener, OnFailureListener, jc {
    public final int f28588a;
    public final long f28589b;
    public final int f28590c;
    public final Object d;

    public f(int i7, int i10, long j3, x10 x10Var) {
        this.f28588a = i7;
        this.d = x10Var;
        this.f28590c = i10;
        this.f28589b = j3;
    }

    @Override
    public void m0(org.telegram.messenger.ImageReceiver r6, boolean r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.f.m0(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    @Override
    public void onFailure(Exception exc) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$26(this.f28588a, this.f28589b, this.f28590c, (String) this.d, exc);
    }

    @Override
    public void onSuccess(Object obj) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$25(this.f28588a, this.f28589b, this.f28590c, (String) this.d, (IntegrityTokenResponse) obj);
    }

    public f(int i7, long j3, String str, int i10) {
        this.f28588a = i7;
        this.f28589b = j3;
        this.f28590c = i10;
        this.d = str;
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
    }

    @Override
    public void G0(int i7, Drawable drawable) {
    }
}
