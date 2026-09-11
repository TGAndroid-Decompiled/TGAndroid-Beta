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
public abstract class gt implements NotificationCenter.NotificationCenterDelegate {
    public static ft L;
    public boolean E;
    public boolean G;
    public boolean I;
    public int J;
    public final int K;
    public boolean f26499a;
    public Bitmap f26500b;
    public Canvas f26501c;
    public Bitmap d;
    public Canvas f26502e;
    public boolean f26503f;
    public int f26504n;
    public boolean f26505r;
    public int v;
    public int f26507w;
    public int f26508x;
    public final DispatchQueue f26509y;
    public int h = 1;
    public final Paint f26506s = new Paint(1);
    public final et F = new et(this, 0);
    public final et H = new et(this, 1);

    public gt() {
        if (L == null) {
            ?? obj = new Object();
            obj.f26182b = new DispatchQueue[2];
            L = obj;
        }
        ft ftVar = L;
        int i10 = ftVar.f26181a + 1;
        ftVar.f26181a = i10;
        if (i10 > 1) {
            ftVar.f26181a = 0;
        }
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) ftVar.f26182b;
        int i11 = ftVar.f26181a;
        DispatchQueue dispatchQueue = dispatchQueueArr[i11];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + ftVar.f26181a);
            dispatchQueueArr[i11] = dispatchQueue;
        }
        this.f26509y = dispatchQueue;
        this.K = L.f26181a;
    }

    public void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        if (this.E) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i10, i11, org.telegram.ui.ActionBar.j6.Jl);
                return;
            }
            return;
        }
        this.f26507w = i11;
        this.f26508x = i10;
        if (this.G) {
            this.G = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.f26502e;
            this.d = this.f26500b;
            this.f26502e = this.f26501c;
            this.f26500b = bitmap;
            this.f26501c = canvas2;
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
            int i12 = this.f26507w + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.f26508x) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f26508x, i12, Bitmap.Config.ARGB_8888);
                this.f26502e = new Canvas(this.d);
            }
            this.f26502e.save();
            this.f26502e.translate(0.0f, 0);
            d(this.f26502e, f7);
            this.f26502e.restore();
        }
        if (!this.f26503f && !this.f26505r) {
            this.f26503f = true;
            i(j3);
            this.J = this.v;
            this.f26509y.postRunnable(this.F);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f26506s;
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
                    int intValue = num.intValue() | this.f26504n;
                    this.f26504n = intValue;
                    if (intValue != 0 && !this.f26505r) {
                        this.f26505r = true;
                    }
                }
            }
        } else if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i12 = this.f26504n) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.f26504n = i13;
                if (i13 == 0 && this.f26505r) {
                    this.f26505r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f26499a) {
            return;
        }
        this.f26499a = true;
        this.E = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        this.f26504n = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.f26505r) {
            this.f26505r = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void f() {
        if (!this.f26499a) {
            return;
        }
        if (!this.f26503f) {
            j();
        }
        this.f26499a = false;
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
        Bitmap bitmap2 = this.f26500b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f26500b = null;
        this.f26501c = null;
        this.f26502e = null;
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
        if (this.f26499a) {
            this.f26504n = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        }
    }

    public void h() {
    }
}
