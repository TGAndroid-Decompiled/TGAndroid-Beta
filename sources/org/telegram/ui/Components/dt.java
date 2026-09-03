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
public abstract class dt implements NotificationCenter.NotificationCenterDelegate {
    public static ct I;
    public boolean B;
    public boolean D;
    public boolean F;
    public int G;
    public final int H;
    public boolean f24375a;
    public Bitmap f24376b;
    public Canvas f24377c;
    public Bitmap d;
    public Canvas e;
    public boolean f24378f;
    public int f24379n;
    public boolean f24380r;
    public int v;
    public int f24382w;
    public int f24383x;
    public final DispatchQueue f24384y;
    public int h = 1;
    public final Paint f24381s = new Paint(1);
    public final bt C = new bt(this, 0);
    public final bt E = new bt(this, 1);

    public dt() {
        if (I == null) {
            ?? obj = new Object();
            obj.f24029b = new DispatchQueue[2];
            I = obj;
        }
        ct ctVar = I;
        int i10 = ctVar.f24028a + 1;
        ctVar.f24028a = i10;
        if (i10 > 1) {
            ctVar.f24028a = 0;
        }
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) ctVar.f24029b;
        int i11 = ctVar.f24028a;
        DispatchQueue dispatchQueue = dispatchQueueArr[i11];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + ctVar.f24028a);
            dispatchQueueArr[i11] = dispatchQueue;
        }
        this.f24384y = dispatchQueue;
        this.H = I.f24028a;
    }

    public void a(Canvas canvas, long j10, int i10, int i11, float f10) {
        if (this.B) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i10, i11, org.telegram.ui.ActionBar.j6.Jl);
                return;
            }
            return;
        }
        this.f24382w = i11;
        this.f24383x = i10;
        if (this.D) {
            this.D = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.e;
            this.d = this.f24376b;
            this.e = this.f24377c;
            this.f24376b = bitmap;
            this.f24377c = canvas2;
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
            int i12 = this.f24382w + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.f24383x) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f24383x, i12, Bitmap.Config.ARGB_8888);
                this.e = new Canvas(this.d);
            }
            this.e.save();
            this.e.translate(0.0f, 0);
            d(this.e, f10);
            this.e.restore();
        }
        if (!this.f24378f && !this.f24380r) {
            this.f24378f = true;
            i(j10);
            this.G = this.v;
            this.f24384y.postRunnable(this.C);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f24381s;
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
                    int intValue = num.intValue() | this.f24379n;
                    this.f24379n = intValue;
                    if (intValue != 0 && !this.f24380r) {
                        this.f24380r = true;
                    }
                }
            }
        } else if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i12 = this.f24379n) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.f24379n = i13;
                if (i13 == 0 && this.f24380r) {
                    this.f24380r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f24375a) {
            return;
        }
        this.f24375a = true;
        this.B = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        this.f24379n = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.f24380r) {
            this.f24380r = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void f() {
        if (!this.f24375a) {
            return;
        }
        if (!this.f24378f) {
            j();
        }
        this.f24375a = false;
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
        Bitmap bitmap2 = this.f24376b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f24376b = null;
        this.f24377c = null;
        this.e = null;
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
        if (this.f24375a) {
            this.f24379n = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        }
    }

    public void h() {
    }
}
