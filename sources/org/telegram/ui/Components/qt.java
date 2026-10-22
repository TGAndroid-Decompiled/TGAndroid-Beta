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
public abstract class qt implements NotificationCenter.NotificationCenterDelegate {
    public static pt L;
    public boolean E;
    public boolean G;
    public boolean I;
    public int J;
    public final int K;
    public boolean f29700a;
    public Bitmap f29701b;
    public Canvas f29702c;
    public Bitmap d;
    public Canvas e;
    public boolean f29703f;
    public int f29704n;
    public boolean f29705r;
    public int v;
    public int f29707w;
    public int f29708x;
    public final DispatchQueue f29709y;
    public int h = 1;
    public final Paint f29706s = new Paint(1);
    public final ot F = new ot(this, 0);
    public final ot H = new ot(this, 1);

    public qt() {
        if (L == null) {
            ?? obj = new Object();
            obj.f29394b = new DispatchQueue[2];
            L = obj;
        }
        pt ptVar = L;
        int i10 = ptVar.f29393a + 1;
        ptVar.f29393a = i10;
        if (i10 > 1) {
            ptVar.f29393a = 0;
        }
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) ptVar.f29394b;
        int i11 = ptVar.f29393a;
        DispatchQueue dispatchQueue = dispatchQueueArr[i11];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + ptVar.f29393a);
            dispatchQueueArr[i11] = dispatchQueue;
        }
        this.f29709y = dispatchQueue;
        this.K = L.f29393a;
    }

    public void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        if (this.E) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i10, i11, org.telegram.ui.ActionBar.h6.Ml);
                return;
            }
            return;
        }
        this.f29707w = i11;
        this.f29708x = i10;
        if (this.G) {
            this.G = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.e;
            this.d = this.f29701b;
            this.e = this.f29702c;
            this.f29701b = bitmap;
            this.f29702c = canvas2;
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
            int i12 = this.f29707w + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.f29708x) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f29708x, i12, Bitmap.Config.ARGB_8888);
                this.e = new Canvas(this.d);
            }
            this.e.save();
            this.e.translate(0.0f, 0);
            d(this.e, f7);
            this.e.restore();
        }
        if (!this.f29703f && !this.f29705r) {
            this.f29703f = true;
            i(j10);
            this.J = this.v;
            this.f29709y.postRunnable(this.F);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f29706s;
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
                    int intValue = num.intValue() | this.f29704n;
                    this.f29704n = intValue;
                    if (intValue != 0 && !this.f29705r) {
                        this.f29705r = true;
                    }
                }
            }
        } else if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i12 = this.f29704n) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.f29704n = i13;
                if (i13 == 0 && this.f29705r) {
                    this.f29705r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f29700a) {
            return;
        }
        this.f29700a = true;
        this.E = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        this.f29704n = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.f29705r) {
            this.f29705r = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void f() {
        if (!this.f29700a) {
            return;
        }
        if (!this.f29703f) {
            j();
        }
        this.f29700a = false;
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
        Bitmap bitmap2 = this.f29701b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f29701b = null;
        this.f29702c = null;
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
        if (this.f29700a) {
            this.f29704n = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        }
    }

    public void h() {
    }
}
