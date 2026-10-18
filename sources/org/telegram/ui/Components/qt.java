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
    public boolean f29738a;
    public Bitmap f29739b;
    public Canvas f29740c;
    public Bitmap d;
    public Canvas e;
    public boolean f29741f;
    public int f29742n;
    public boolean f29743r;
    public int v;
    public int f29745w;
    public int f29746x;
    public final DispatchQueue f29747y;
    public int h = 1;
    public final Paint f29744s = new Paint(1);
    public final ot F = new ot(this, 0);
    public final ot H = new ot(this, 1);

    public qt() {
        if (L == null) {
            ?? obj = new Object();
            obj.f29436b = new DispatchQueue[2];
            L = obj;
        }
        pt ptVar = L;
        int i10 = ptVar.f29435a + 1;
        ptVar.f29435a = i10;
        if (i10 > 1) {
            ptVar.f29435a = 0;
        }
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) ptVar.f29436b;
        int i11 = ptVar.f29435a;
        DispatchQueue dispatchQueue = dispatchQueueArr[i11];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + ptVar.f29435a);
            dispatchQueueArr[i11] = dispatchQueue;
        }
        this.f29747y = dispatchQueue;
        this.K = L.f29435a;
    }

    public void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        if (this.E) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i10, i11, org.telegram.ui.ActionBar.h6.Ml);
                return;
            }
            return;
        }
        this.f29745w = i11;
        this.f29746x = i10;
        if (this.G) {
            this.G = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.e;
            this.d = this.f29739b;
            this.e = this.f29740c;
            this.f29739b = bitmap;
            this.f29740c = canvas2;
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
            int i12 = this.f29745w + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.f29746x) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f29746x, i12, Bitmap.Config.ARGB_8888);
                this.e = new Canvas(this.d);
            }
            this.e.save();
            this.e.translate(0.0f, 0);
            d(this.e, f7);
            this.e.restore();
        }
        if (!this.f29741f && !this.f29743r) {
            this.f29741f = true;
            i(j10);
            this.J = this.v;
            this.f29747y.postRunnable(this.F);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f29744s;
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
                    int intValue = num.intValue() | this.f29742n;
                    this.f29742n = intValue;
                    if (intValue != 0 && !this.f29743r) {
                        this.f29743r = true;
                    }
                }
            }
        } else if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i12 = this.f29742n) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.f29742n = i13;
                if (i13 == 0 && this.f29743r) {
                    this.f29743r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f29738a) {
            return;
        }
        this.f29738a = true;
        this.E = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        this.f29742n = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.f29743r) {
            this.f29743r = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void f() {
        if (!this.f29738a) {
            return;
        }
        if (!this.f29741f) {
            j();
        }
        this.f29738a = false;
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
        Bitmap bitmap2 = this.f29739b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f29739b = null;
        this.f29740c = null;
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
        if (this.f29738a) {
            this.f29742n = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        }
    }

    public void h() {
    }
}
