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
public abstract class st implements NotificationCenter.NotificationCenterDelegate {
    public static rt L;
    public boolean E;
    public boolean G;
    public boolean I;
    public int J;
    public final int K;
    public boolean f32667a;
    public Bitmap f32668b;
    public Canvas f32669c;
    public Bitmap d;
    public Canvas e;
    public boolean f32670f;
    public int f32671n;
    public boolean f32672r;
    public int v;
    public int f32674w;
    public int f32675x;
    public final DispatchQueue f32676y;
    public int h = 1;
    public final Paint f32673s = new Paint(1);
    public final qt F = new qt(this, 0);
    public final qt H = new qt(this, 1);

    public st() {
        if (L == null) {
            ?? obj = new Object();
            obj.f32322b = new DispatchQueue[2];
            L = obj;
        }
        rt rtVar = L;
        int i10 = rtVar.f32321a + 1;
        rtVar.f32321a = i10;
        if (i10 > 1) {
            rtVar.f32321a = 0;
        }
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) rtVar.f32322b;
        int i11 = rtVar.f32321a;
        DispatchQueue dispatchQueue = dispatchQueueArr[i11];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + rtVar.f32321a);
            dispatchQueueArr[i11] = dispatchQueue;
        }
        this.f32676y = dispatchQueue;
        this.K = L.f32321a;
    }

    public void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        if (this.E) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i10, i11, org.telegram.ui.ActionBar.y6.Ol);
                return;
            }
            return;
        }
        this.f32674w = i11;
        this.f32675x = i10;
        if (this.G) {
            this.G = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.e;
            this.d = this.f32668b;
            this.e = this.f32669c;
            this.f32668b = bitmap;
            this.f32669c = canvas2;
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
            int i12 = this.f32674w + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.f32675x) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f32675x, i12, Bitmap.Config.ARGB_8888);
                this.e = new Canvas(this.d);
            }
            this.e.save();
            this.e.translate(0.0f, 0);
            d(this.e, f7);
            this.e.restore();
        }
        if (!this.f32670f && !this.f32672r) {
            this.f32670f = true;
            i(j10);
            this.J = this.v;
            this.f32676y.postRunnable(this.F);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f32673s;
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
                    int intValue = num.intValue() | this.f32671n;
                    this.f32671n = intValue;
                    if (intValue != 0 && !this.f32672r) {
                        this.f32672r = true;
                    }
                }
            }
        } else if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i12 = this.f32671n) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.f32671n = i13;
                if (i13 == 0 && this.f32672r) {
                    this.f32672r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f32667a) {
            return;
        }
        this.f32667a = true;
        this.E = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        this.f32671n = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.f32672r) {
            this.f32672r = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void f() {
        if (!this.f32667a) {
            return;
        }
        if (!this.f32670f) {
            j();
        }
        this.f32667a = false;
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
        Bitmap bitmap2 = this.f32668b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f32668b = null;
        this.f32669c = null;
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
        if (this.f32667a) {
            this.f32671n = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        }
    }

    public void h() {
    }
}
