package org.telegram.tgnet;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.i5;

public final class f implements OnSuccessListener, OnFailureListener, ImageReceiver.ImageReceiverDelegate {

    public final int f22560a;

    public final long f22561b;

    public final int f22562c;
    public final Object d;

    public f(int i10, int i11, long j10, Utilities.Callback callback) {
        this.f22560a = i10;
        this.d = callback;
        this.f22562c = i11;
        this.f22561b = j10;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        List list;
        Utilities.Callback callback = (Utilities.Callback) this.d;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        ImageReceiver.BitmapHolder drawableSafe = imageReceiver.getDrawableSafe();
        if (!z10 || bitmapSafe == null) {
            return;
        }
        if (drawableSafe != null) {
            Drawable drawable = drawableSafe.drawable;
            if (drawable instanceof mf.b) {
                list = ((mf.b) drawable).f18039a;
            } else {
                list = null;
            }
        } else {
            list = null;
        }
        Bitmap bitmap = bitmapSafe.bitmap;
        if (bitmap == null) {
            Drawable drawable2 = bitmapSafe.drawable;
            if (drawable2 instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable2).getBitmap();
            }
        }
        mf.a aVar = new mf.a(bitmap, this.f22560a, list);
        if (callback != null) {
            callback.run(aVar);
        }
        ChatThemeController.getInstance(this.f22562c).saveWallpaperBitmap(aVar, this.f22561b);
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
        ConnectionsManager.lambda$onIntegrityCheckClassic$26(this.f22560a, this.f22561b, this.f22562c, (String) this.d, exc);
    }

    @Override
    public void onSuccess(Object obj) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$25(this.f22560a, this.f22561b, this.f22562c, (String) this.d, (IntegrityTokenResponse) obj);
    }

    public f(int i10, long j10, String str, int i11) {
        this.f22560a = i10;
        this.f22561b = j10;
        this.f22562c = i11;
        this.d = str;
    }
}
