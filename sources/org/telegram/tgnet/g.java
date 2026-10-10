package org.telegram.tgnet;

import android.graphics.drawable.Drawable;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.i5;
public final class g implements OnSuccessListener, OnFailureListener, ImageReceiver.ImageReceiverDelegate {
    public final int f20225a;
    public final long f20226b;
    public final int f20227c;
    public final Object d;

    public g(int i10, int i11, long j3, Utilities.Callback callback) {
        this.f20225a = i10;
        this.d = callback;
        this.f20227c = i11;
        this.f20226b = j3;
    }

    @Override
    public void didSetImage(org.telegram.messenger.ImageReceiver r2, boolean r3, boolean r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.g.didSetImage(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        i5.a(this, i10, str, drawable);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        i5.b(this, imageReceiver);
    }

    @Override
    public void onFailure(Exception exc) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$26(this.f20225a, this.f20226b, this.f20227c, (String) this.d, exc);
    }

    @Override
    public void onSuccess(Object obj) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$25(this.f20225a, this.f20226b, this.f20227c, (String) this.d, (IntegrityTokenResponse) obj);
    }

    public g(int i10, long j3, String str, int i11) {
        this.f20225a = i10;
        this.f20226b = j3;
        this.f20227c = i11;
        this.d = str;
    }
}
