package org.telegram.tgnet;

import android.graphics.drawable.Drawable;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.jc;
import org.telegram.messenger.w10;
public final class f implements OnSuccessListener, OnFailureListener, jc {
    public final int f28675a;
    public final long f28676b;
    public final int f28677c;
    public final Object d;

    public f(int i7, int i10, long j3, w10 w10Var) {
        this.f28675a = i7;
        this.d = w10Var;
        this.f28677c = i10;
        this.f28676b = j3;
    }

    @Override
    public void onFailure(Exception exc) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$26(this.f28675a, this.f28676b, this.f28677c, (String) this.d, exc);
    }

    @Override
    public void onSuccess(Object obj) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$25(this.f28675a, this.f28676b, this.f28677c, (String) this.d, (IntegrityTokenResponse) obj);
    }

    @Override
    public void y(org.telegram.messenger.ImageReceiver r6, boolean r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.f.y(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    public f(int i7, long j3, String str, int i10) {
        this.f28675a = i7;
        this.f28676b = j3;
        this.f28677c = i10;
        this.d = str;
    }

    @Override
    public void r(ImageReceiver imageReceiver) {
    }

    @Override
    public void J(int i7, Drawable drawable) {
    }
}
