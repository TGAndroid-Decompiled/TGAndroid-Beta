package org.telegram.tgnet;

import android.graphics.drawable.Drawable;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g5;
public final class f implements OnSuccessListener, OnFailureListener, ImageReceiver.ImageReceiverDelegate {
    public final int f22560a;
    public final long f22561b;
    public final int f22562c;
    public final Object d;

    public f(int i9, int i10, long j10, Utilities.Callback callback) {
        this.f22560a = i9;
        this.d = callback;
        this.f22562c = i10;
        this.f22561b = j10;
    }

    @Override
    public void didSetImage(org.telegram.messenger.ImageReceiver r2, boolean r3, boolean r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.f.didSetImage(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    @Override
    public void didSetImageBitmap(int i9, String str, Drawable drawable) {
        g5.a(this, i9, str, drawable);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        g5.b(this, imageReceiver);
    }

    @Override
    public void onFailure(Exception exc) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$26(this.f22560a, this.f22561b, this.f22562c, (String) this.d, exc);
    }

    @Override
    public void onSuccess(Object obj) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$25(this.f22560a, this.f22561b, this.f22562c, (String) this.d, (IntegrityTokenResponse) obj);
    }

    public f(int i9, long j10, String str, int i10) {
        this.f22560a = i9;
        this.f22561b = j10;
        this.f22562c = i10;
        this.d = str;
    }
}
