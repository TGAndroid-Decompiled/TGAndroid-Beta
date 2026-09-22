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
    public boolean f24878a;
    public Bitmap f24879b;
    public Canvas f24880c;
    public Bitmap d;
    public Canvas e;
    public boolean f24881f;
    public int f24882n;
    public boolean f24883r;
    public int v;
    public int f24885w;
    public int f24886x;
    public final DispatchQueue f24887y;
    public int h = 1;
    public final Paint f24884s = new Paint(1);
    public final ft F = new ft(this, 0);
    public final ft H = new ft(this, 1);

    public ht() {
        if (L == null) {
            ?? obj = new Object();
            obj.f24618b = new DispatchQueue[2];
            L = obj;
        }
        gt gtVar = L;
        int i10 = gtVar.f24617a + 1;
        gtVar.f24617a = i10;
        if (i10 > 1) {
            gtVar.f24617a = 0;
        }
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) gtVar.f24618b;
        int i11 = gtVar.f24617a;
        DispatchQueue dispatchQueue = dispatchQueueArr[i11];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + gtVar.f24617a);
            dispatchQueueArr[i11] = dispatchQueue;
        }
        this.f24887y = dispatchQueue;
        this.K = L.f24617a;
    }

    public void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        if (this.E) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i10, i11, org.telegram.ui.ActionBar.j6.Jl);
                return;
            }
            return;
        }
        this.f24885w = i11;
        this.f24886x = i10;
        if (this.G) {
            this.G = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.e;
            this.d = this.f24879b;
            this.e = this.f24880c;
            this.f24879b = bitmap;
            this.f24880c = canvas2;
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
            int i12 = this.f24885w + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.f24886x) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f24886x, i12, Bitmap.Config.ARGB_8888);
                this.e = new Canvas(this.d);
            }
            this.e.save();
            this.e.translate(0.0f, 0);
            d(this.e, f7);
            this.e.restore();
        }
        if (!this.f24881f && !this.f24883r) {
            this.f24881f = true;
            i(j3);
            this.J = this.v;
            this.f24887y.postRunnable(this.F);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f24884s;
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
                    int intValue = num.intValue() | this.f24882n;
                    this.f24882n = intValue;
                    if (intValue != 0 && !this.f24883r) {
                        this.f24883r = true;
                    }
                }
            }
        } else if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i12 = this.f24882n) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.f24882n = i13;
                if (i13 == 0 && this.f24883r) {
                    this.f24883r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f24878a) {
            return;
        }
        this.f24878a = true;
        this.E = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        this.f24882n = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.f24883r) {
            this.f24883r = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void f() {
        if (!this.f24878a) {
            return;
        }
        if (!this.f24881f) {
            j();
        }
        this.f24878a = false;
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
        Bitmap bitmap2 = this.f24879b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f24879b = null;
        this.f24880c = null;
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
        if (this.f24878a) {
            this.f24882n = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        }
    }

    public void h() {
    }
}
