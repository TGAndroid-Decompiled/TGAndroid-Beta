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
public abstract class yt implements NotificationCenter.NotificationCenterDelegate {
    public static xt L;
    public boolean E;
    public boolean G;
    public boolean I;
    public int J;
    public final int K;
    public boolean f33342a;
    public Bitmap f33343b;
    public Canvas f33344c;
    public Bitmap d;
    public Canvas f33345e;
    public boolean f33346f;
    public int f33347n;
    public boolean f33348r;
    public int v;
    public int f33350w;
    public int f33351x;
    public final DispatchQueue f33352y;
    public int h = 1;
    public final Paint f33349s = new Paint(1);
    public final wt F = new wt(this, 0);
    public final wt H = new wt(this, 1);

    public yt() {
        if (L == null) {
            ?? obj = new Object();
            obj.f33005b = new DispatchQueue[2];
            L = obj;
        }
        xt xtVar = L;
        int i10 = xtVar.f33004a + 1;
        xtVar.f33004a = i10;
        if (i10 > 1) {
            xtVar.f33004a = 0;
        }
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) xtVar.f33005b;
        int i11 = xtVar.f33004a;
        DispatchQueue dispatchQueue = dispatchQueueArr[i11];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + xtVar.f33004a);
            dispatchQueueArr[i11] = dispatchQueue;
        }
        this.f33352y = dispatchQueue;
        this.K = L.f33004a;
    }

    public void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        if (this.E) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i10, i11, org.telegram.ui.ActionBar.i6.Ml);
                return;
            }
            return;
        }
        this.f33350w = i11;
        this.f33351x = i10;
        if (this.G) {
            this.G = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.f33345e;
            this.d = this.f33343b;
            this.f33345e = this.f33344c;
            this.f33343b = bitmap;
            this.f33344c = canvas2;
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
            int i12 = this.f33350w + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.f33351x) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f33351x, i12, Bitmap.Config.ARGB_8888);
                this.f33345e = new Canvas(this.d);
            }
            this.f33345e.save();
            this.f33345e.translate(0.0f, 0);
            d(this.f33345e, f7);
            this.f33345e.restore();
        }
        if (!this.f33346f && !this.f33348r) {
            this.f33346f = true;
            i(j3);
            this.J = this.v;
            this.f33352y.postRunnable(this.F);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f33349s;
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
                    int intValue = num.intValue() | this.f33347n;
                    this.f33347n = intValue;
                    if (intValue != 0 && !this.f33348r) {
                        this.f33348r = true;
                    }
                }
            }
        } else if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i12 = this.f33347n) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.f33347n = i13;
                if (i13 == 0 && this.f33348r) {
                    this.f33348r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f33342a) {
            return;
        }
        this.f33342a = true;
        this.E = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        this.f33347n = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.f33348r) {
            this.f33348r = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void f() {
        if (!this.f33342a) {
            return;
        }
        if (!this.f33346f) {
            j();
        }
        this.f33342a = false;
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
        Bitmap bitmap2 = this.f33343b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f33343b = null;
        this.f33344c = null;
        this.f33345e = null;
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
        if (this.f33342a) {
            this.f33347n = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        }
    }

    public void h() {
    }
}
