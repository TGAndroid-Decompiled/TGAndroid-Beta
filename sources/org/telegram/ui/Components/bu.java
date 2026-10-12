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
public abstract class bu implements NotificationCenter.NotificationCenterDelegate {
    public static au L;
    public boolean E;
    public boolean G;
    public boolean I;
    public int J;
    public final int K;
    public boolean f24734a;
    public Bitmap f24735b;
    public Canvas f24736c;
    public Bitmap d;
    public Canvas f24737e;
    public boolean f24738f;
    public int f24739n;
    public boolean f24740r;
    public int v;
    public int f24742w;
    public int f24743x;
    public final DispatchQueue f24744y;
    public int h = 1;
    public final Paint f24741s = new Paint(1);
    public final zt F = new zt(this, 0);
    public final zt H = new zt(this, 1);

    public bu() {
        if (L == null) {
            ?? obj = new Object();
            obj.f24478b = new DispatchQueue[2];
            L = obj;
        }
        au auVar = L;
        int i10 = auVar.f24477a + 1;
        auVar.f24477a = i10;
        if (i10 > 1) {
            auVar.f24477a = 0;
        }
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) auVar.f24478b;
        int i11 = auVar.f24477a;
        DispatchQueue dispatchQueue = dispatchQueueArr[i11];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + auVar.f24477a);
            dispatchQueueArr[i11] = dispatchQueue;
        }
        this.f24744y = dispatchQueue;
        this.K = L.f24477a;
    }

    public void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        if (this.E) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i10, i11, org.telegram.ui.ActionBar.h6.Ml);
                return;
            }
            return;
        }
        this.f24742w = i11;
        this.f24743x = i10;
        if (this.G) {
            this.G = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.f24737e;
            this.d = this.f24735b;
            this.f24737e = this.f24736c;
            this.f24735b = bitmap;
            this.f24736c = canvas2;
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
            int i12 = this.f24742w + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.f24743x) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f24743x, i12, Bitmap.Config.ARGB_8888);
                this.f24737e = new Canvas(this.d);
            }
            this.f24737e.save();
            this.f24737e.translate(0.0f, 0);
            d(this.f24737e, f7);
            this.f24737e.restore();
        }
        if (!this.f24738f && !this.f24740r) {
            this.f24738f = true;
            i(j3);
            this.J = this.v;
            this.f24744y.postRunnable(this.F);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f24741s;
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
                    int intValue = num.intValue() | this.f24739n;
                    this.f24739n = intValue;
                    if (intValue != 0 && !this.f24740r) {
                        this.f24740r = true;
                    }
                }
            }
        } else if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i12 = this.f24739n) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.f24739n = i13;
                if (i13 == 0 && this.f24740r) {
                    this.f24740r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f24734a) {
            return;
        }
        this.f24734a = true;
        this.E = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        this.f24739n = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.f24740r) {
            this.f24740r = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void f() {
        if (!this.f24734a) {
            return;
        }
        if (!this.f24738f) {
            j();
        }
        this.f24734a = false;
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
        Bitmap bitmap2 = this.f24735b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f24735b = null;
        this.f24736c = null;
        this.f24737e = null;
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
        if (this.f24734a) {
            this.f24739n = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        }
    }

    public void h() {
    }
}
