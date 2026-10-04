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
    public boolean f28417a;
    public Bitmap f28418b;
    public Canvas f28419c;
    public Bitmap d;
    public Canvas f28420e;
    public boolean f28421f;
    public int f28422n;
    public boolean f28423r;
    public int v;
    public int f28425w;
    public int f28426x;
    public final DispatchQueue f28427y;
    public int h = 1;
    public final Paint f28424s = new Paint(1);
    public final jt F = new jt(this, 0);
    public final jt H = new jt(this, 1);

    public lt() {
        if (L == null) {
            ?? obj = new Object();
            obj.f28193b = new DispatchQueue[2];
            L = obj;
        }
        kt ktVar = L;
        int i10 = ktVar.f28192a + 1;
        ktVar.f28192a = i10;
        if (i10 > 1) {
            ktVar.f28192a = 0;
        }
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) ktVar.f28193b;
        int i11 = ktVar.f28192a;
        DispatchQueue dispatchQueue = dispatchQueueArr[i11];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + ktVar.f28192a);
            dispatchQueueArr[i11] = dispatchQueue;
        }
        this.f28427y = dispatchQueue;
        this.K = L.f28192a;
    }

    public void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        if (this.E) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i10, i11, org.telegram.ui.ActionBar.i6.Kl);
                return;
            }
            return;
        }
        this.f28425w = i11;
        this.f28426x = i10;
        if (this.G) {
            this.G = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.f28420e;
            this.d = this.f28418b;
            this.f28420e = this.f28419c;
            this.f28418b = bitmap;
            this.f28419c = canvas2;
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
            int i12 = this.f28425w + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.f28426x) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f28426x, i12, Bitmap.Config.ARGB_8888);
                this.f28420e = new Canvas(this.d);
            }
            this.f28420e.save();
            this.f28420e.translate(0.0f, 0);
            d(this.f28420e, f7);
            this.f28420e.restore();
        }
        if (!this.f28421f && !this.f28423r) {
            this.f28421f = true;
            i(j3);
            this.J = this.v;
            this.f28427y.postRunnable(this.F);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f28424s;
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
                    int intValue = num.intValue() | this.f28422n;
                    this.f28422n = intValue;
                    if (intValue != 0 && !this.f28423r) {
                        this.f28423r = true;
                    }
                }
            }
        } else if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i12 = this.f28422n) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.f28422n = i13;
                if (i13 == 0 && this.f28423r) {
                    this.f28423r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f28417a) {
            return;
        }
        this.f28417a = true;
        this.E = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        this.f28422n = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.f28423r) {
            this.f28423r = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void f() {
        if (!this.f28417a) {
            return;
        }
        if (!this.f28421f) {
            j();
        }
        this.f28417a = false;
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
        Bitmap bitmap2 = this.f28418b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f28418b = null;
        this.f28419c = null;
        this.f28420e = null;
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
        if (this.f28417a) {
            this.f28422n = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        }
    }

    public void h() {
    }
}
