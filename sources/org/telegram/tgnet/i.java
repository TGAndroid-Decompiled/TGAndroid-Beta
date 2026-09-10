package org.telegram.tgnet;

import android.graphics.drawable.Drawable;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.m5;
public final class i implements OnSuccessListener, OnFailureListener, ImageReceiver.ImageReceiverDelegate {
    public final int f17382a;
    public final long f17383b;
    public final int f17384c;
    public final Object d;

    public i(int i10, int i11, long j3, Utilities.Callback callback) {
        this.f17382a = i10;
        this.d = callback;
        this.f17384c = i11;
        this.f17383b = j3;
    }

    @Override
    public void didSetImage(org.telegram.messenger.ImageReceiver r2, boolean r3, boolean r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.i.didSetImage(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        m5.a(this, i10, str, drawable);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        m5.b(this, imageReceiver);
    }

    @Override
    public void onFailure(Exception exc) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$26(this.f17382a, this.f17383b, this.f17384c, (String) this.d, exc);
    }

    @Override
    public void onSuccess(Object obj) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$25(this.f17382a, this.f17383b, this.f17384c, (String) this.d, (IntegrityTokenResponse) obj);
    }

    public i(int i10, long j3, String str, int i11) {
        this.f17382a = i10;
        this.f17383b = j3;
        this.f17384c = i11;
        this.d = str;
    }
}
