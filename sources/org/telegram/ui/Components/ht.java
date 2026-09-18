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
public abstract class ht implements NotificationCenter.NotificationCenterDelegate {
    public static gt L;
    public boolean E;
    public boolean G;
    public boolean I;
    public int J;
    public final int K;
    public boolean f24731a;
    public Bitmap f24732b;
    public Canvas f24733c;
    public Bitmap d;
    public Canvas e;
    public boolean f24734f;
    public int f24735n;
    public boolean f24736r;
    public int v;
    public int f24738w;
    public int f24739x;
    public final DispatchQueue f24740y;
    public int h = 1;
    public final Paint f24737s = new Paint(1);
    public final ft F = new ft(this, 0);
    public final ft H = new ft(this, 1);

    public ht() {
        if (L == null) {
            ?? obj = new Object();
            obj.f24399b = new DispatchQueue[2];
            L = obj;
        }
        gt gtVar = L;
        int i10 = gtVar.f24398a + 1;
        gtVar.f24398a = i10;
        if (i10 > 1) {
            gtVar.f24398a = 0;
        }
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) gtVar.f24399b;
        int i11 = gtVar.f24398a;
        DispatchQueue dispatchQueue = dispatchQueueArr[i11];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + gtVar.f24398a);
            dispatchQueueArr[i11] = dispatchQueue;
        }
        this.f24740y = dispatchQueue;
        this.K = L.f24398a;
    }

    public void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        if (this.E) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i10, i11, org.telegram.ui.ActionBar.j6.Jl);
                return;
            }
            return;
        }
        this.f24738w = i11;
        this.f24739x = i10;
        if (this.G) {
            this.G = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.e;
            this.d = this.f24732b;
            this.e = this.f24733c;
            this.f24732b = bitmap;
            this.f24733c = canvas2;
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
            int i12 = this.f24738w + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.f24739x) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f24739x, i12, Bitmap.Config.ARGB_8888);
                this.e = new Canvas(this.d);
            }
            this.e.save();
            this.e.translate(0.0f, 0);
            d(this.e, f7);
            this.e.restore();
        }
        if (!this.f24734f && !this.f24736r) {
            this.f24734f = true;
            i(j3);
            this.J = this.v;
            this.f24740y.postRunnable(this.F);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f24737s;
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
                    int intValue = num.intValue() | this.f24735n;
                    this.f24735n = intValue;
                    if (intValue != 0 && !this.f24736r) {
                        this.f24736r = true;
                    }
                }
            }
        } else if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i12 = this.f24735n) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.f24735n = i13;
                if (i13 == 0 && this.f24736r) {
                    this.f24736r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f24731a) {
            return;
        }
        this.f24731a = true;
        this.E = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        this.f24735n = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.f24736r) {
            this.f24736r = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void f() {
        if (!this.f24731a) {
            return;
        }
        if (!this.f24734f) {
            j();
        }
        this.f24731a = false;
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
        Bitmap bitmap2 = this.f24732b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f24732b = null;
        this.f24733c = null;
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
        if (this.f24731a) {
            this.f24735n = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        }
    }

    public void h() {
    }
}
