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
public abstract class lt implements NotificationCenter.NotificationCenterDelegate {
    public static kt L;
    public boolean E;
    public boolean G;
    public boolean I;
    public int J;
    public final int K;
    public boolean f28423a;
    public Bitmap f28424b;
    public Canvas f28425c;
    public Bitmap d;
    public Canvas f28426e;
    public boolean f28427f;
    public int f28428n;
    public boolean f28429r;
    public int v;
    public int f28431w;
    public int f28432x;
    public final DispatchQueue f28433y;
    public int h = 1;
    public final Paint f28430s = new Paint(1);
    public final jt F = new jt(this, 0);
    public final jt H = new jt(this, 1);

    public lt() {
        if (L == null) {
            ?? obj = new Object();
            obj.f28199b = new DispatchQueue[2];
            L = obj;
        }
        kt ktVar = L;
        int i10 = ktVar.f28198a + 1;
        ktVar.f28198a = i10;
        if (i10 > 1) {
            ktVar.f28198a = 0;
        }
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) ktVar.f28199b;
        int i11 = ktVar.f28198a;
        DispatchQueue dispatchQueue = dispatchQueueArr[i11];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + ktVar.f28198a);
            dispatchQueueArr[i11] = dispatchQueue;
        }
        this.f28433y = dispatchQueue;
        this.K = L.f28198a;
    }

    public void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        if (this.E) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i10, i11, org.telegram.ui.ActionBar.i6.Kl);
                return;
            }
            return;
        }
        this.f28431w = i11;
        this.f28432x = i10;
        if (this.G) {
            this.G = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.f28426e;
            this.d = this.f28424b;
            this.f28426e = this.f28425c;
            this.f28424b = bitmap;
            this.f28425c = canvas2;
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
            int i12 = this.f28431w + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.f28432x) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f28432x, i12, Bitmap.Config.ARGB_8888);
                this.f28426e = new Canvas(this.d);
            }
            this.f28426e.save();
            this.f28426e.translate(0.0f, 0);
            d(this.f28426e, f7);
            this.f28426e.restore();
        }
        if (!this.f28427f && !this.f28429r) {
            this.f28427f = true;
            i(j3);
            this.J = this.v;
            this.f28433y.postRunnable(this.F);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f28430s;
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
                    int intValue = num.intValue() | this.f28428n;
                    this.f28428n = intValue;
                    if (intValue != 0 && !this.f28429r) {
                        this.f28429r = true;
                    }
                }
            }
        } else if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i12 = this.f28428n) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.f28428n = i13;
                if (i13 == 0 && this.f28429r) {
                    this.f28429r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f28423a) {
            return;
        }
        this.f28423a = true;
        this.E = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        this.f28428n = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.f28429r) {
            this.f28429r = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void f() {
        if (!this.f28423a) {
            return;
        }
        if (!this.f28427f) {
            j();
        }
        this.f28423a = false;
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
        Bitmap bitmap2 = this.f28424b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f28424b = null;
        this.f28425c = null;
        this.f28426e = null;
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
        if (this.f28423a) {
            this.f28428n = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        }
    }

    public void h() {
    }
}
