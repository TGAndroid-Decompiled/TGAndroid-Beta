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
    public static ft I;
    public boolean B;
    public boolean D;
    public boolean F;
    public int G;
    public final int H;
    public boolean f27267a;
    public Bitmap f27268b;
    public Canvas f27269c;
    public Bitmap d;
    public Canvas f27270e;
    public boolean f27271f;
    public int f27272n;
    public boolean f27273r;
    public int v;
    public int f27275w;
    public int f27276x;
    public final DispatchQueue f27277y;
    public int h = 1;
    public final Paint f27274s = new Paint(1);
    public final et C = new et(this, 0);
    public final et E = new et(this, 1);

    public gt() {
        if (I == null) {
            ?? obj = new Object();
            obj.f26996b = new DispatchQueue[2];
            I = obj;
        }
        ft ftVar = I;
        int i10 = ftVar.f26995a + 1;
        ftVar.f26995a = i10;
        if (i10 > 1) {
            ftVar.f26995a = 0;
        }
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) ftVar.f26996b;
        int i11 = ftVar.f26995a;
        DispatchQueue dispatchQueue = dispatchQueueArr[i11];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + ftVar.f26995a);
            dispatchQueueArr[i11] = dispatchQueue;
        }
        this.f27277y = dispatchQueue;
        this.H = I.f26995a;
    }

    public void a(Canvas canvas, long j10, int i10, int i11, float f10) {
        if (this.B) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i10, i11, org.telegram.ui.ActionBar.k6.Jl);
                return;
            }
            return;
        }
        this.f27275w = i11;
        this.f27276x = i10;
        if (this.D) {
            this.D = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.f27270e;
            this.d = this.f27268b;
            this.f27270e = this.f27269c;
            this.f27268b = bitmap;
            this.f27269c = canvas2;
        }
        Bitmap bitmap2 = this.d;
        if (bitmap2 == null || this.F) {
            this.F = false;
            if (bitmap2 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.d);
                AndroidUtilities.recycleBitmaps(arrayList);
                this.d = null;
            }
            int i12 = this.f27275w + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.f27276x) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f27276x, i12, Bitmap.Config.ARGB_8888);
                this.f27270e = new Canvas(this.d);
            }
            this.f27270e.save();
            this.f27270e.translate(0.0f, 0);
            d(this.f27270e, f10);
            this.f27270e.restore();
        }
        if (!this.f27271f && !this.f27273r) {
            this.f27271f = true;
            i(j10);
            this.G = this.v;
            this.f27277y.postRunnable(this.C);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f27274s;
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
                    int intValue = num.intValue() | this.f27272n;
                    this.f27272n = intValue;
                    if (intValue != 0 && !this.f27273r) {
                        this.f27273r = true;
                    }
                }
            }
        } else if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i12 = this.f27272n) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.f27272n = i13;
                if (i13 == 0 && this.f27273r) {
                    this.f27273r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f27267a) {
            return;
        }
        this.f27267a = true;
        this.B = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        this.f27272n = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.f27273r) {
            this.f27273r = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void f() {
        if (!this.f27267a) {
            return;
        }
        if (!this.f27271f) {
            j();
        }
        this.f27267a = false;
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
        Bitmap bitmap2 = this.f27268b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f27268b = null;
        this.f27269c = null;
        this.f27270e = null;
        AndroidUtilities.recycleBitmaps(arrayList);
    }

    public final void k() {
        this.F = true;
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
        if (this.f27267a) {
            this.f27272n = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        }
    }

    public void h() {
    }
}
