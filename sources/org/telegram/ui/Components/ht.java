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
    public boolean f24790a;
    public Bitmap f24791b;
    public Canvas f24792c;
    public Bitmap d;
    public Canvas e;
    public boolean f24793f;
    public int f24794n;
    public boolean f24795r;
    public int v;
    public int f24797w;
    public int f24798x;
    public final DispatchQueue f24799y;
    public int h = 1;
    public final Paint f24796s = new Paint(1);
    public final ft F = new ft(this, 0);
    public final ft H = new ft(this, 1);

    public ht() {
        if (L == null) {
            ?? obj = new Object();
            obj.f24455b = new DispatchQueue[2];
            L = obj;
        }
        gt gtVar = L;
        int i10 = gtVar.f24454a + 1;
        gtVar.f24454a = i10;
        if (i10 > 1) {
            gtVar.f24454a = 0;
        }
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) gtVar.f24455b;
        int i11 = gtVar.f24454a;
        DispatchQueue dispatchQueue = dispatchQueueArr[i11];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + gtVar.f24454a);
            dispatchQueueArr[i11] = dispatchQueue;
        }
        this.f24799y = dispatchQueue;
        this.K = L.f24454a;
    }

    public void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        if (this.E) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i10, i11, org.telegram.ui.ActionBar.i6.Jl);
                return;
            }
            return;
        }
        this.f24797w = i11;
        this.f24798x = i10;
        if (this.G) {
            this.G = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.e;
            this.d = this.f24791b;
            this.e = this.f24792c;
            this.f24791b = bitmap;
            this.f24792c = canvas2;
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
            int i12 = this.f24797w + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.f24798x) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f24798x, i12, Bitmap.Config.ARGB_8888);
                this.e = new Canvas(this.d);
            }
            this.e.save();
            this.e.translate(0.0f, 0);
            d(this.e, f7);
            this.e.restore();
        }
        if (!this.f24793f && !this.f24795r) {
            this.f24793f = true;
            i(j3);
            this.J = this.v;
            this.f24799y.postRunnable(this.F);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f24796s;
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
                    int intValue = num.intValue() | this.f24794n;
                    this.f24794n = intValue;
                    if (intValue != 0 && !this.f24795r) {
                        this.f24795r = true;
                    }
                }
            }
        } else if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i12 = this.f24794n) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.f24794n = i13;
                if (i13 == 0 && this.f24795r) {
                    this.f24795r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f24790a) {
            return;
        }
        this.f24790a = true;
        this.E = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        this.f24794n = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.f24795r) {
            this.f24795r = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void f() {
        if (!this.f24790a) {
            return;
        }
        if (!this.f24793f) {
            j();
        }
        this.f24790a = false;
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
        Bitmap bitmap2 = this.f24791b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f24791b = null;
        this.f24792c = null;
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
        if (this.f24790a) {
            this.f24794n = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        }
    }

    public void h() {
    }
}
