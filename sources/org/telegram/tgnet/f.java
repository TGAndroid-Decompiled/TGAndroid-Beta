package org.telegram.tgnet;

import android.graphics.drawable.Drawable;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.c20;
import org.telegram.messenger.lc;
public final class f implements OnSuccessListener, OnFailureListener, lc {
    public final int f27139a;
    public final long f27140b;
    public final int f27141c;
    public final Object d;

    public f(int i7, int i10, long j3, c20 c20Var) {
        this.f27139a = i7;
        this.d = c20Var;
        this.f27141c = i10;
        this.f27140b = j3;
    }

    @Override
    public void f0(org.telegram.messenger.ImageReceiver r6, boolean r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.f.f0(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    @Override
    public void onFailure(Exception exc) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$26(this.f27139a, this.f27140b, this.f27141c, (String) this.d, exc);
    }

    @Override
    public void onSuccess(Object obj) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$25(this.f27139a, this.f27140b, this.f27141c, (String) this.d, (IntegrityTokenResponse) obj);
    }

    public f(int i7, long j3, String str, int i10) {
        this.f27139a = i7;
        this.f27140b = j3;
        this.f27141c = i10;
        this.d = str;
    }

    @Override
    public void O(ImageReceiver imageReceiver) {
    }

    @Override
    public void t0(int i7, Drawable drawable) {
    }
}
