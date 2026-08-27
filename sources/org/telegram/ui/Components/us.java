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

public abstract class us implements NotificationCenter.NotificationCenterDelegate {
    public static ts H;
    public boolean A;
    public boolean C;
    public boolean E;
    public int F;
    public final int G;

    public boolean f33197a;

    public Bitmap f33198b;

    public Canvas f33199c;
    public Bitmap d;

    public Canvas f33200e;

    public boolean f33201f;

    public int f33202n;

    public boolean f33203r;
    public int v;

    public int f33205w;

    public int f33206x;

    public final DispatchQueue f33207y;
    public int h = 1;

    public final Paint f33204s = new Paint(1);
    public final ss B = new ss(this, 0);
    public final ss D = new ss(this, 1);

    public us() {
        if (H == null) {
            ts tsVar = new ts();
            tsVar.f32871b = new DispatchQueue[2];
            H = tsVar;
        }
        ts tsVar2 = H;
        int i10 = tsVar2.f32870a + 1;
        tsVar2.f32870a = i10;
        if (i10 > 1) {
            tsVar2.f32870a = 0;
        }
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) tsVar2.f32871b;
        int i11 = tsVar2.f32870a;
        DispatchQueue dispatchQueue = dispatchQueueArr[i11];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + tsVar2.f32870a);
            dispatchQueueArr[i11] = dispatchQueue;
        }
        this.f33207y = dispatchQueue;
        this.G = H.f32870a;
    }

    public void a(Canvas canvas, long j10, int i10, int i11, float f10) {
        if (this.A) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i10, i11, org.telegram.ui.ActionBar.g6.Jl);
                return;
            }
            return;
        }
        this.f33205w = i11;
        this.f33206x = i10;
        if (this.C) {
            this.C = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.f33200e;
            this.d = this.f33198b;
            this.f33200e = this.f33199c;
            this.f33198b = bitmap;
            this.f33199c = canvas2;
        }
        Bitmap bitmap2 = this.d;
        if (bitmap2 == null || this.E) {
            this.E = false;
            if (bitmap2 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.d);
                AndroidUtilities.recycleBitmaps(arrayList);
                this.d = null;
            }
            int i12 = this.f33205w + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.f33206x) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f33206x, i12, Bitmap.Config.ARGB_8888);
                this.f33200e = new Canvas(this.d);
            }
            this.f33200e.save();
            this.f33200e.translate(0.0f, 0);
            d(this.f33200e, f10);
            this.f33200e.restore();
        }
        if (!this.f33201f && !this.f33203r) {
            this.f33201f = true;
            i(j10);
            this.F = this.v;
            this.f33207y.postRunnable(this.B);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f33204s;
            paint.setAlpha((int) (f10 * 255.0f));
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

    public abstract void d(Canvas canvas, float f10);

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.stopAllHeavyOperations) {
            Integer num = (Integer) objArr[0];
            if (this.h < num.intValue()) {
                if (num.intValue() != 512 || SharedConfig.getDevicePerformanceClass() < 2) {
                    int iIntValue = num.intValue() | this.f33202n;
                    this.f33202n = iIntValue;
                    if (iIntValue == 0 || this.f33203r) {
                        return;
                    }
                    this.f33203r = true;
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.h >= num2.intValue() || (i12 = this.f33202n) == 0) {
                return;
            }
            int i13 = (~num2.intValue()) & i12;
            this.f33202n = i13;
            if (i13 == 0 && this.f33203r) {
                this.f33203r = false;
            }
        }
    }

    public final void e() {
        if (this.f33197a) {
            return;
        }
        this.f33197a = true;
        this.A = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        this.f33202n = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.f33203r) {
            this.f33203r = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void f() {
        if (this.f33197a) {
            if (!this.f33201f) {
                j();
            }
            this.f33197a = false;
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.stopAllHeavyOperations);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.startAllHeavyOperations);
        }
    }

    public abstract void g();

    public abstract void i(long j10);

    public final void j() {
        ArrayList arrayList = new ArrayList();
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            arrayList.add(bitmap);
        }
        Bitmap bitmap2 = this.f33198b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f33198b = null;
        this.f33199c = null;
        this.f33200e = null;
        AndroidUtilities.recycleBitmaps(arrayList);
    }

    public final void k() {
        this.E = true;
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
        if (this.f33197a) {
            this.f33202n = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        }
    }

    public void h() {
    }
}
