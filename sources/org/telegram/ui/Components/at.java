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
public abstract class at implements NotificationCenter.NotificationCenterDelegate {
    public static zs H;
    public boolean A;
    public boolean C;
    public boolean E;
    public int F;
    public final int G;
    public boolean f26867a;
    public Bitmap f26868b;
    public Canvas f26869c;
    public Bitmap d;
    public Canvas f26870e;
    public boolean f26871f;
    public int f26872n;
    public boolean f26873r;
    public int v;
    public int f26875w;
    public int f26876x;
    public final DispatchQueue f26877y;
    public int h = 1;
    public final Paint f26874s = new Paint(1);
    public final ys B = new ys(this, 0);
    public final ys D = new ys(this, 1);

    public at() {
        if (H == null) {
            ?? obj = new Object();
            obj.f35410b = new DispatchQueue[2];
            H = obj;
        }
        zs zsVar = H;
        int i10 = zsVar.f35409a + 1;
        zsVar.f35409a = i10;
        if (i10 > 1) {
            zsVar.f35409a = 0;
        }
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) zsVar.f35410b;
        int i11 = zsVar.f35409a;
        DispatchQueue dispatchQueue = dispatchQueueArr[i11];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + zsVar.f35409a);
            dispatchQueueArr[i11] = dispatchQueue;
        }
        this.f26877y = dispatchQueue;
        this.G = H.f35409a;
    }

    public void a(Canvas canvas, long j10, int i10, int i11, float f9) {
        if (this.A) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i10, i11, org.telegram.ui.ActionBar.g6.Jl);
                return;
            }
            return;
        }
        this.f26875w = i11;
        this.f26876x = i10;
        if (this.C) {
            this.C = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.f26870e;
            this.d = this.f26868b;
            this.f26870e = this.f26869c;
            this.f26868b = bitmap;
            this.f26869c = canvas2;
        }
        Bitmap bitmap2 = this.d;
        if (bitmap2 == null || this.E) {
            this.E = false;
            if (bitmap2 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.d);
                AndroidUtilities.recycleBitmaps(arrayList);
                this.d = null;
            }
            int i12 = this.f26875w + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.f26876x) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f26876x, i12, Bitmap.Config.ARGB_8888);
                this.f26870e = new Canvas(this.d);
            }
            this.f26870e.save();
            this.f26870e.translate(0.0f, 0);
            d(this.f26870e, f9);
            this.f26870e.restore();
        }
        if (!this.f26871f && !this.f26873r) {
            this.f26871f = true;
            i(j10);
            this.F = this.v;
            this.f26877y.postRunnable(this.B);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f26874s;
            paint.setAlpha((int) (f9 * 255.0f));
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

    public abstract void d(Canvas canvas, float f9);

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.stopAllHeavyOperations) {
            Integer num = (Integer) objArr[0];
            if (this.h < num.intValue()) {
                if (num.intValue() != 512 || SharedConfig.getDevicePerformanceClass() < 2) {
                    int intValue = num.intValue() | this.f26872n;
                    this.f26872n = intValue;
                    if (intValue != 0 && !this.f26873r) {
                        this.f26873r = true;
                    }
                }
            }
        } else if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i12 = this.f26872n) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.f26872n = i13;
                if (i13 == 0 && this.f26873r) {
                    this.f26873r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f26867a) {
            return;
        }
        this.f26867a = true;
        this.A = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        this.f26872n = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.f26873r) {
            this.f26873r = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void f() {
        if (!this.f26867a) {
            return;
        }
        if (!this.f26871f) {
            j();
        }
        this.f26867a = false;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public abstract void g();

    public abstract void i(long j10);

    public final void j() {
        ArrayList arrayList = new ArrayList();
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            arrayList.add(bitmap);
        }
        Bitmap bitmap2 = this.f26868b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f26868b = null;
        this.f26869c = null;
        this.f26870e = null;
        AndroidUtilities.recycleBitmaps(arrayList);
    }

    public final void k() {
        this.E = true;
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
        if (this.f26867a) {
            this.f26872n = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        }
    }

    public void h() {
    }
}
