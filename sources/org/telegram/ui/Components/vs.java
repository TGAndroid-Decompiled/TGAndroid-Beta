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
public abstract class vs implements NotificationCenter.NotificationCenterDelegate {
    public static us H;
    public boolean A;
    public boolean C;
    public boolean E;
    public int F;
    public final int G;
    public boolean f33986a;
    public Bitmap f33987b;
    public Canvas f33988c;
    public Bitmap d;
    public Canvas f33989e;
    public boolean f33990f;
    public int f33991n;
    public boolean f33992r;
    public int v;
    public int f33994w;
    public int f33995x;
    public final DispatchQueue f33996y;
    public int h = 1;
    public final Paint f33993s = new Paint(1);
    public final ts B = new ts(this, 0);
    public final ts D = new ts(this, 1);

    public vs() {
        if (H == null) {
            ?? obj = new Object();
            obj.f33117b = new DispatchQueue[2];
            H = obj;
        }
        us usVar = H;
        int i9 = usVar.f33116a + 1;
        usVar.f33116a = i9;
        if (i9 > 1) {
            usVar.f33116a = 0;
        }
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) usVar.f33117b;
        int i10 = usVar.f33116a;
        DispatchQueue dispatchQueue = dispatchQueueArr[i10];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + usVar.f33116a);
            dispatchQueueArr[i10] = dispatchQueue;
        }
        this.f33996y = dispatchQueue;
        this.G = H.f33116a;
    }

    public void a(Canvas canvas, long j10, int i9, int i10, float f10) {
        if (this.A) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i9, i10, org.telegram.ui.ActionBar.f6.Jl);
                return;
            }
            return;
        }
        this.f33994w = i10;
        this.f33995x = i9;
        if (this.C) {
            this.C = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.f33989e;
            this.d = this.f33987b;
            this.f33989e = this.f33988c;
            this.f33987b = bitmap;
            this.f33988c = canvas2;
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
            int i11 = this.f33994w + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i11 && this.d.getWidth() == this.f33995x) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f33995x, i11, Bitmap.Config.ARGB_8888);
                this.f33989e = new Canvas(this.d);
            }
            this.f33989e.save();
            this.f33989e.translate(0.0f, 0);
            d(this.f33989e, f10);
            this.f33989e.restore();
        }
        if (!this.f33990f && !this.f33992r) {
            this.f33990f = true;
            i(j10);
            this.F = this.v;
            this.f33996y.postRunnable(this.B);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f33993s;
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
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11;
        if (i9 == NotificationCenter.stopAllHeavyOperations) {
            Integer num = (Integer) objArr[0];
            if (this.h < num.intValue()) {
                if (num.intValue() != 512 || SharedConfig.getDevicePerformanceClass() < 2) {
                    int intValue = num.intValue() | this.f33991n;
                    this.f33991n = intValue;
                    if (intValue != 0 && !this.f33992r) {
                        this.f33992r = true;
                    }
                }
            }
        } else if (i9 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i11 = this.f33991n) != 0) {
                int i12 = (~num2.intValue()) & i11;
                this.f33991n = i12;
                if (i12 == 0 && this.f33992r) {
                    this.f33992r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f33986a) {
            return;
        }
        this.f33986a = true;
        this.A = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        this.f33991n = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.f33992r) {
            this.f33992r = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void f() {
        if (!this.f33986a) {
            return;
        }
        if (!this.f33990f) {
            j();
        }
        this.f33986a = false;
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
        Bitmap bitmap2 = this.f33987b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f33987b = null;
        this.f33988c = null;
        this.f33989e = null;
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

    public final void l(int i9) {
        this.h = 7;
        if (this.f33986a) {
            this.f33991n = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        }
    }

    public void h() {
    }
}
