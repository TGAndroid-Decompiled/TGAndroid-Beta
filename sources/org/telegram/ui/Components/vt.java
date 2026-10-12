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
public abstract class vt implements NotificationCenter.NotificationCenterDelegate {
    public static ut L;
    public boolean E;
    public boolean G;
    public boolean I;
    public int J;
    public final int K;
    public boolean f30638a;
    public Bitmap f30639b;
    public Canvas f30640c;
    public Bitmap d;
    public Canvas e;
    public boolean f30641f;
    public int f30642n;
    public boolean f30643r;
    public int v;
    public int f30645w;
    public int f30646x;
    public final DispatchQueue f30647y;
    public int h = 1;
    public final Paint f30644s = new Paint(1);
    public final tt F = new tt(this, 0);
    public final tt H = new tt(this, 1);

    public vt() {
        if (L == null) {
            ?? obj = new Object();
            obj.f29768b = new DispatchQueue[2];
            L = obj;
        }
        ut utVar = L;
        int i10 = utVar.f29767a + 1;
        utVar.f29767a = i10;
        if (i10 > 1) {
            utVar.f29767a = 0;
        }
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) utVar.f29768b;
        int i11 = utVar.f29767a;
        DispatchQueue dispatchQueue = dispatchQueueArr[i11];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + utVar.f29767a);
            dispatchQueueArr[i11] = dispatchQueue;
        }
        this.f30647y = dispatchQueue;
        this.K = L.f29767a;
    }

    public void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        if (this.E) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i10, i11, org.telegram.ui.ActionBar.g6.Ml);
                return;
            }
            return;
        }
        this.f30645w = i11;
        this.f30646x = i10;
        if (this.G) {
            this.G = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.e;
            this.d = this.f30639b;
            this.e = this.f30640c;
            this.f30639b = bitmap;
            this.f30640c = canvas2;
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
            int i12 = this.f30645w + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.f30646x) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f30646x, i12, Bitmap.Config.ARGB_8888);
                this.e = new Canvas(this.d);
            }
            this.e.save();
            this.e.translate(0.0f, 0);
            d(this.e, f7);
            this.e.restore();
        }
        if (!this.f30641f && !this.f30643r) {
            this.f30641f = true;
            i(j10);
            this.J = this.v;
            this.f30647y.postRunnable(this.F);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f30644s;
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
                    int intValue = num.intValue() | this.f30642n;
                    this.f30642n = intValue;
                    if (intValue != 0 && !this.f30643r) {
                        this.f30643r = true;
                    }
                }
            }
        } else if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i12 = this.f30642n) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.f30642n = i13;
                if (i13 == 0 && this.f30643r) {
                    this.f30643r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f30638a) {
            return;
        }
        this.f30638a = true;
        this.E = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        this.f30642n = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.f30643r) {
            this.f30643r = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void f() {
        if (!this.f30638a) {
            return;
        }
        if (!this.f30641f) {
            j();
        }
        this.f30638a = false;
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
        Bitmap bitmap2 = this.f30639b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f30639b = null;
        this.f30640c = null;
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
        if (this.f30638a) {
            this.f30642n = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        }
    }

    public void h() {
    }
}
