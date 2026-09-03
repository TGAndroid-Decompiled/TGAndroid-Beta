package org.telegram.tgnet;

import android.graphics.drawable.Drawable;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.j5;
public final class f implements OnSuccessListener, OnFailureListener, ImageReceiver.ImageReceiverDelegate {
    public final int f21025a;
    public final long f21026b;
    public final int f21027c;
    public final Object d;

    public f(int i10, int i11, long j10, Utilities.Callback callback) {
        this.f21025a = i10;
        this.d = callback;
        this.f21027c = i11;
        this.f21026b = j10;
    }

    @Override
    public void didSetImage(org.telegram.messenger.ImageReceiver r2, boolean r3, boolean r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.f.didSetImage(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        j5.a(this, i10, str, drawable);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        j5.b(this, imageReceiver);
    }

    @Override
    public void onFailure(Exception exc) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$26(this.f21025a, this.f21026b, this.f21027c, (String) this.d, exc);
    }

    @Override
    public void onSuccess(Object obj) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$25(this.f21025a, this.f21026b, this.f21027c, (String) this.d, (IntegrityTokenResponse) obj);
    }

    public f(int i10, long j10, String str, int i11) {
        this.f21025a = i10;
        this.f21026b = j10;
        this.f21027c = i11;
        this.d = str;
    }
}
