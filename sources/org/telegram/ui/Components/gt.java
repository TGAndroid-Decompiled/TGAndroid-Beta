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
    public boolean f26500a;
    public Bitmap f26501b;
    public Canvas f26502c;
    public Bitmap d;
    public Canvas f26503e;
    public boolean f26504f;
    public int f26505n;
    public boolean f26506r;
    public int v;
    public int f26508w;
    public int f26509x;
    public final DispatchQueue f26510y;
    public int h = 1;
    public final Paint f26507s = new Paint(1);
    public final et F = new et(this, 0);
    public final et H = new et(this, 1);

    public gt() {
        if (L == null) {
            ?? obj = new Object();
            obj.f26183b = new DispatchQueue[2];
            L = obj;
        }
        ft ftVar = L;
        int i10 = ftVar.f26182a + 1;
        ftVar.f26182a = i10;
        if (i10 > 1) {
            ftVar.f26182a = 0;
        }
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) ftVar.f26183b;
        int i11 = ftVar.f26182a;
        DispatchQueue dispatchQueue = dispatchQueueArr[i11];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + ftVar.f26182a);
            dispatchQueueArr[i11] = dispatchQueue;
        }
        this.f26510y = dispatchQueue;
        this.K = L.f26182a;
    }

    public void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        if (this.E) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i10, i11, org.telegram.ui.ActionBar.j6.Jl);
                return;
            }
            return;
        }
        this.f26508w = i11;
        this.f26509x = i10;
        if (this.G) {
            this.G = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.f26503e;
            this.d = this.f26501b;
            this.f26503e = this.f26502c;
            this.f26501b = bitmap;
            this.f26502c = canvas2;
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
            int i12 = this.f26508w + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.f26509x) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f26509x, i12, Bitmap.Config.ARGB_8888);
                this.f26503e = new Canvas(this.d);
            }
            this.f26503e.save();
            this.f26503e.translate(0.0f, 0);
            d(this.f26503e, f7);
            this.f26503e.restore();
        }
        if (!this.f26504f && !this.f26506r) {
            this.f26504f = true;
            i(j3);
            this.J = this.v;
            this.f26510y.postRunnable(this.F);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f26507s;
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
                    int intValue = num.intValue() | this.f26505n;
                    this.f26505n = intValue;
                    if (intValue != 0 && !this.f26506r) {
                        this.f26506r = true;
                    }
                }
            }
        } else if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i12 = this.f26505n) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.f26505n = i13;
                if (i13 == 0 && this.f26506r) {
                    this.f26506r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f26500a) {
            return;
        }
        this.f26500a = true;
        this.E = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        this.f26505n = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.f26506r) {
            this.f26506r = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void f() {
        if (!this.f26500a) {
            return;
        }
        if (!this.f26504f) {
            j();
        }
        this.f26500a = false;
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
        Bitmap bitmap2 = this.f26501b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f26501b = null;
        this.f26502c = null;
        this.f26503e = null;
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
        if (this.f26500a) {
            this.f26505n = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        }
    }

    public void h() {
    }
}
