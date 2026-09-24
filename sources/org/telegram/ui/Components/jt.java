package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public abstract class jt implements NotificationCenter.NotificationCenterDelegate {
    public static ht L;
    public boolean E;
    public boolean G;
    public boolean I;
    public int J;
    public final int K;
    public boolean f25476a;
    public Bitmap f25477b;
    public Canvas f25478c;
    public Bitmap d;
    public Canvas e;
    public boolean f25479f;
    public int f25480n;
    public boolean f25481r;
    public int v;
    public int f25483w;
    public int f25484x;
    public final DispatchQueue f25485y;
    public int h = 1;
    public final Paint f25482s = new Paint(1);
    public final gt F = new gt(this, 0);
    public final gt H = new gt(this, 1);

    public jt() {
        if (L == null) {
            ?? obj = new Object();
            obj.f24840b = new DispatchQueue[2];
            L = obj;
        }
        ht htVar = L;
        int i10 = htVar.f24839a + 1;
        htVar.f24839a = i10;
        if (i10 > 1) {
            htVar.f24839a = 0;
        }
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) htVar.f24840b;
        int i11 = htVar.f24839a;
        DispatchQueue dispatchQueue = dispatchQueueArr[i11];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + htVar.f24839a);
            dispatchQueueArr[i11] = dispatchQueue;
        }
        this.f25485y = dispatchQueue;
        this.K = L.f24839a;
    }

    public void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        if (this.E) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i10, i11, org.telegram.ui.ActionBar.h6.Jl);
                return;
            }
            return;
        }
        this.f25483w = i11;
        this.f25484x = i10;
        if (this.G) {
            this.G = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.e;
            this.d = this.f25477b;
            this.e = this.f25478c;
            this.f25477b = bitmap;
            this.f25478c = canvas2;
        }
        Bitmap bitmap2 = this.d;
        if (bitmap2 == null || this.I) {
            this.I = false;
            if (bitmap2 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.d);
                AndroidUtilities.recycleBitmaps(arrayList);
                this.d = null;
            }
            int i12 = this.f25483w + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.f25484x) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f25484x, i12, Bitmap.Config.ARGB_8888);
                this.e = new Canvas(this.d);
            }
            this.e.save();
            this.e.translate(0.0f, 0);
            d(this.e, f7);
            this.e.restore();
        }
        if (!this.f25479f && !this.f25481r) {
            this.f25479f = true;
            i(j3);
            this.J = this.v;
            this.f25485y.postRunnable(this.F);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f25482s;
            paint.setAlpha((int) (f7 * 255.0f));
            canvas.save();
            canvas.translate(0.0f, -0);
            b(canvas, bitmap4, paint);
            canvas.restore();
        }
    }

    public void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    public abstract void c(Canvas canvas);

    public abstract void d(Canvas canvas, float f7);

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.stopAllHeavyOperations) {
            Integer num = (Integer) objArr[0];
            if (this.h < num.intValue()) {
                if (num.intValue() != 512 || SharedConfig.getDevicePerformanceClass() < 2) {
                    int intValue = num.intValue() | this.f25480n;
                    this.f25480n = intValue;
                    if (intValue != 0 && !this.f25481r) {
                        this.f25481r = true;
                    }
                }
            }
        } else if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i12 = this.f25480n) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.f25480n = i13;
                if (i13 == 0 && this.f25481r) {
                    this.f25481r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f25476a) {
            return;
        }
        this.f25476a = true;
        this.E = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        this.f25480n = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.f25481r) {
            this.f25481r = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void f() {
        if (!this.f25476a) {
            return;
        }
        if (!this.f25479f) {
            j();
        }
        this.f25476a = false;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public abstract void g();

    public abstract void i(long j3);

    public final void j() {
        ArrayList arrayList = new ArrayList();
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            arrayList.add(bitmap);
        }
        Bitmap bitmap2 = this.f25477b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f25477b = null;
        this.f25478c = null;
        this.e = null;
        AndroidUtilities.recycleBitmaps(arrayList);
    }

    public final void k() {
        this.I = true;
        this.v++;
        if (this.d != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.d);
            this.d = null;
            AndroidUtilities.recycleBitmaps(arrayList);
        }
    }

    public final void l(int i10) {
        this.h = 7;
        if (this.f25476a) {
            this.f25480n = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        }
    }

    public void h() {
    }
}
