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
    public boolean f24748a;
    public Bitmap f24749b;
    public Canvas f24750c;
    public Bitmap d;
    public Canvas e;
    public boolean f24751f;
    public int f24752n;
    public boolean f24753r;
    public int v;
    public int f24755w;
    public int f24756x;
    public final DispatchQueue f24757y;
    public int h = 1;
    public final Paint f24754s = new Paint(1);
    public final ft F = new ft(this, 0);
    public final ft H = new ft(this, 1);

    public ht() {
        if (L == null) {
            ?? obj = new Object();
            obj.f24453b = new DispatchQueue[2];
            L = obj;
        }
        gt gtVar = L;
        int i10 = gtVar.f24452a + 1;
        gtVar.f24452a = i10;
        if (i10 > 1) {
            gtVar.f24452a = 0;
        }
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) gtVar.f24453b;
        int i11 = gtVar.f24452a;
        DispatchQueue dispatchQueue = dispatchQueueArr[i11];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + gtVar.f24452a);
            dispatchQueueArr[i11] = dispatchQueue;
        }
        this.f24757y = dispatchQueue;
        this.K = L.f24452a;
    }

    public void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        if (this.E) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i10, i11, org.telegram.ui.ActionBar.j6.Jl);
                return;
            }
            return;
        }
        this.f24755w = i11;
        this.f24756x = i10;
        if (this.G) {
            this.G = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.e;
            this.d = this.f24749b;
            this.e = this.f24750c;
            this.f24749b = bitmap;
            this.f24750c = canvas2;
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
            int i12 = this.f24755w + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.f24756x) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f24756x, i12, Bitmap.Config.ARGB_8888);
                this.e = new Canvas(this.d);
            }
            this.e.save();
            this.e.translate(0.0f, 0);
            d(this.e, f7);
            this.e.restore();
        }
        if (!this.f24751f && !this.f24753r) {
            this.f24751f = true;
            i(j3);
            this.J = this.v;
            this.f24757y.postRunnable(this.F);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f24754s;
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
                    int intValue = num.intValue() | this.f24752n;
                    this.f24752n = intValue;
                    if (intValue != 0 && !this.f24753r) {
                        this.f24753r = true;
                    }
                }
            }
        } else if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i12 = this.f24752n) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.f24752n = i13;
                if (i13 == 0 && this.f24753r) {
                    this.f24753r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f24748a) {
            return;
        }
        this.f24748a = true;
        this.E = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        this.f24752n = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.f24753r) {
            this.f24753r = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void f() {
        if (!this.f24748a) {
            return;
        }
        if (!this.f24751f) {
            j();
        }
        this.f24748a = false;
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
        Bitmap bitmap2 = this.f24749b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f24749b = null;
        this.f24750c = null;
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
        if (this.f24748a) {
            this.f24752n = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        }
    }

    public void h() {
    }
}
