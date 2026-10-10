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
public abstract class zt implements NotificationCenter.NotificationCenterDelegate {
    public static yt L;
    public boolean E;
    public boolean G;
    public boolean I;
    public int J;
    public final int K;
    public boolean f33665a;
    public Bitmap f33666b;
    public Canvas f33667c;
    public Bitmap d;
    public Canvas f33668e;
    public boolean f33669f;
    public int f33670n;
    public boolean f33671r;
    public int v;
    public int f33673w;
    public int f33674x;
    public final DispatchQueue f33675y;
    public int h = 1;
    public final Paint f33672s = new Paint(1);
    public final xt F = new xt(this, 0);
    public final xt H = new xt(this, 1);

    public zt() {
        if (L == null) {
            ?? obj = new Object();
            obj.f33403b = new DispatchQueue[2];
            L = obj;
        }
        yt ytVar = L;
        int i10 = ytVar.f33402a + 1;
        ytVar.f33402a = i10;
        if (i10 > 1) {
            ytVar.f33402a = 0;
        }
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) ytVar.f33403b;
        int i11 = ytVar.f33402a;
        DispatchQueue dispatchQueue = dispatchQueueArr[i11];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + ytVar.f33402a);
            dispatchQueueArr[i11] = dispatchQueue;
        }
        this.f33675y = dispatchQueue;
        this.K = L.f33402a;
    }

    public void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        if (this.E) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i10, i11, org.telegram.ui.ActionBar.i6.Ml);
                return;
            }
            return;
        }
        this.f33673w = i11;
        this.f33674x = i10;
        if (this.G) {
            this.G = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.f33668e;
            this.d = this.f33666b;
            this.f33668e = this.f33667c;
            this.f33666b = bitmap;
            this.f33667c = canvas2;
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
            int i12 = this.f33673w + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.f33674x) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f33674x, i12, Bitmap.Config.ARGB_8888);
                this.f33668e = new Canvas(this.d);
            }
            this.f33668e.save();
            this.f33668e.translate(0.0f, 0);
            d(this.f33668e, f7);
            this.f33668e.restore();
        }
        if (!this.f33669f && !this.f33671r) {
            this.f33669f = true;
            i(j3);
            this.J = this.v;
            this.f33675y.postRunnable(this.F);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f33672s;
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
                    int intValue = num.intValue() | this.f33670n;
                    this.f33670n = intValue;
                    if (intValue != 0 && !this.f33671r) {
                        this.f33671r = true;
                    }
                }
            }
        } else if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i12 = this.f33670n) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.f33670n = i13;
                if (i13 == 0 && this.f33671r) {
                    this.f33671r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f33665a) {
            return;
        }
        this.f33665a = true;
        this.E = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        this.f33670n = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.f33671r) {
            this.f33671r = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void f() {
        if (!this.f33665a) {
            return;
        }
        if (!this.f33669f) {
            j();
        }
        this.f33665a = false;
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
        Bitmap bitmap2 = this.f33666b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f33666b = null;
        this.f33667c = null;
        this.f33668e = null;
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
        if (this.f33665a) {
            this.f33670n = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        }
    }

    public void h() {
    }
}
