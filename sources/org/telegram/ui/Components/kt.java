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
public abstract class kt implements NotificationCenter.NotificationCenterDelegate {
    public static jt L;
    public boolean E;
    public boolean G;
    public boolean I;
    public int J;
    public final int K;
    public boolean f25815a;
    public Bitmap f25816b;
    public Canvas f25817c;
    public Bitmap d;
    public Canvas e;
    public boolean f25818f;
    public int f25819n;
    public boolean f25820r;
    public int v;
    public int f25822w;
    public int f25823x;
    public final DispatchQueue f25824y;
    public int h = 1;
    public final Paint f25821s = new Paint(1);
    public final ht F = new ht(this, 0);
    public final ht H = new ht(this, 1);

    public kt() {
        if (L == null) {
            ?? obj = new Object();
            obj.f25516b = new DispatchQueue[2];
            L = obj;
        }
        jt jtVar = L;
        int i10 = jtVar.f25515a + 1;
        jtVar.f25515a = i10;
        if (i10 > 1) {
            jtVar.f25515a = 0;
        }
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) jtVar.f25516b;
        int i11 = jtVar.f25515a;
        DispatchQueue dispatchQueue = dispatchQueueArr[i11];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + jtVar.f25515a);
            dispatchQueueArr[i11] = dispatchQueue;
        }
        this.f25824y = dispatchQueue;
        this.K = L.f25515a;
    }

    public void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        if (this.E) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i10, i11, org.telegram.ui.ActionBar.h6.Jl);
                return;
            }
            return;
        }
        this.f25822w = i11;
        this.f25823x = i10;
        if (this.G) {
            this.G = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.e;
            this.d = this.f25816b;
            this.e = this.f25817c;
            this.f25816b = bitmap;
            this.f25817c = canvas2;
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
            int i12 = this.f25822w + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.f25823x) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f25823x, i12, Bitmap.Config.ARGB_8888);
                this.e = new Canvas(this.d);
            }
            this.e.save();
            this.e.translate(0.0f, 0);
            d(this.e, f7);
            this.e.restore();
        }
        if (!this.f25818f && !this.f25820r) {
            this.f25818f = true;
            i(j3);
            this.J = this.v;
            this.f25824y.postRunnable(this.F);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f25821s;
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
                    int intValue = num.intValue() | this.f25819n;
                    this.f25819n = intValue;
                    if (intValue != 0 && !this.f25820r) {
                        this.f25820r = true;
                    }
                }
            }
        } else if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i12 = this.f25819n) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.f25819n = i13;
                if (i13 == 0 && this.f25820r) {
                    this.f25820r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f25815a) {
            return;
        }
        this.f25815a = true;
        this.E = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        this.f25819n = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.f25820r) {
            this.f25820r = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void f() {
        if (!this.f25815a) {
            return;
        }
        if (!this.f25818f) {
            j();
        }
        this.f25815a = false;
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
        Bitmap bitmap2 = this.f25816b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f25816b = null;
        this.f25817c = null;
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
        if (this.f25815a) {
            this.f25819n = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        }
    }

    public void h() {
    }
}
