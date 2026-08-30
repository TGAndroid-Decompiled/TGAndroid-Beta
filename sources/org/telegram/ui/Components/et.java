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
public abstract class et implements NotificationCenter.NotificationCenterDelegate {
    public static dt I;
    public boolean B;
    public boolean D;
    public boolean F;
    public int G;
    public final int H;
    public boolean f24665a;
    public Bitmap f24666b;
    public Canvas f24667c;
    public Bitmap d;
    public Canvas e;
    public boolean f24668f;
    public int f24669n;
    public boolean f24670r;
    public int v;
    public int f24672w;
    public int f24673x;
    public final DispatchQueue f24674y;
    public int h = 1;
    public final Paint f24671s = new Paint(1);
    public final ct C = new ct(this, 0);
    public final ct E = new ct(this, 1);

    public et() {
        if (I == null) {
            ?? obj = new Object();
            obj.f24365b = new DispatchQueue[2];
            I = obj;
        }
        dt dtVar = I;
        int i10 = dtVar.f24364a + 1;
        dtVar.f24364a = i10;
        if (i10 > 1) {
            dtVar.f24364a = 0;
        }
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) dtVar.f24365b;
        int i11 = dtVar.f24364a;
        DispatchQueue dispatchQueue = dispatchQueueArr[i11];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + dtVar.f24364a);
            dispatchQueueArr[i11] = dispatchQueue;
        }
        this.f24674y = dispatchQueue;
        this.H = I.f24364a;
    }

    public void a(Canvas canvas, long j10, int i10, int i11, float f10) {
        if (this.B) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i10, i11, org.telegram.ui.ActionBar.j6.Jl);
                return;
            }
            return;
        }
        this.f24672w = i11;
        this.f24673x = i10;
        if (this.D) {
            this.D = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.e;
            this.d = this.f24666b;
            this.e = this.f24667c;
            this.f24666b = bitmap;
            this.f24667c = canvas2;
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
            int i12 = this.f24672w + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.f24673x) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f24673x, i12, Bitmap.Config.ARGB_8888);
                this.e = new Canvas(this.d);
            }
            this.e.save();
            this.e.translate(0.0f, 0);
            d(this.e, f10);
            this.e.restore();
        }
        if (!this.f24668f && !this.f24670r) {
            this.f24668f = true;
            i(j10);
            this.G = this.v;
            this.f24674y.postRunnable(this.C);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f24671s;
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
                    int intValue = num.intValue() | this.f24669n;
                    this.f24669n = intValue;
                    if (intValue != 0 && !this.f24670r) {
                        this.f24670r = true;
                    }
                }
            }
        } else if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i12 = this.f24669n) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.f24669n = i13;
                if (i13 == 0 && this.f24670r) {
                    this.f24670r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f24665a) {
            return;
        }
        this.f24665a = true;
        this.B = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        this.f24669n = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.f24670r) {
            this.f24670r = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void f() {
        if (!this.f24665a) {
            return;
        }
        if (!this.f24668f) {
            j();
        }
        this.f24665a = false;
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
        Bitmap bitmap2 = this.f24666b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f24666b = null;
        this.f24667c = null;
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
        if (this.f24665a) {
            this.f24669n = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        }
    }

    public void h() {
    }
}
