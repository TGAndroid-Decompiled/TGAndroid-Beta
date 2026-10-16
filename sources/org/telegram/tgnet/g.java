package org.telegram.tgnet;

import android.graphics.drawable.Drawable;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.l5;
public final class g implements OnSuccessListener, OnFailureListener, ImageReceiver.ImageReceiverDelegate {
    public final int f19097a;
    public final long f19098b;
    public final int f19099c;
    public final Object d;

    public g(int i10, int i11, long j10, Utilities.Callback callback) {
        this.f19097a = i10;
        this.d = callback;
        this.f19099c = i11;
        this.f19098b = j10;
    }

    @Override
    public void didSetImage(org.telegram.messenger.ImageReceiver r2, boolean r3, boolean r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.g.didSetImage(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        l5.a(this, i10, str, drawable);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        l5.b(this, imageReceiver);
    }

    @Override
    public void onFailure(Exception exc) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$26(this.f19097a, this.f19098b, this.f19099c, (String) this.d, exc);
    }

    @Override
    public void onSuccess(Object obj) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$25(this.f19097a, this.f19098b, this.f19099c, (String) this.d, (IntegrityTokenResponse) obj);
    }

    public g(int i10, long j10, String str, int i11) {
        this.f19097a = i10;
        this.f19098b = j10;
        this.f19099c = i11;
        this.d = str;
    }
}
