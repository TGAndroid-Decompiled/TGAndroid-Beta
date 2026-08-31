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
    public boolean f27284a;
    public Bitmap f27285b;
    public Canvas f27286c;
    public Bitmap d;
    public Canvas f27287e;
    public boolean f27288f;
    public int f27289n;
    public boolean f27290r;
    public int v;
    public int f27292w;
    public int f27293x;
    public final DispatchQueue f27294y;
    public int h = 1;
    public final Paint f27291s = new Paint(1);
    public final et C = new et(this, 0);
    public final et E = new et(this, 1);

    public gt() {
        if (I == null) {
            ?? obj = new Object();
            obj.f27000b = new DispatchQueue[2];
            I = obj;
        }
        ft ftVar = I;
        int i10 = ftVar.f26999a + 1;
        ftVar.f26999a = i10;
        if (i10 > 1) {
            ftVar.f26999a = 0;
        }
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) ftVar.f27000b;
        int i11 = ftVar.f26999a;
        DispatchQueue dispatchQueue = dispatchQueueArr[i11];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + ftVar.f26999a);
            dispatchQueueArr[i11] = dispatchQueue;
        }
        this.f27294y = dispatchQueue;
        this.H = I.f26999a;
    }

    public void a(Canvas canvas, long j10, int i10, int i11, float f10) {
        if (this.B) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i10, i11, org.telegram.ui.ActionBar.k6.Jl);
                return;
            }
            return;
        }
        this.f27292w = i11;
        this.f27293x = i10;
        if (this.D) {
            this.D = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.f27287e;
            this.d = this.f27285b;
            this.f27287e = this.f27286c;
            this.f27285b = bitmap;
            this.f27286c = canvas2;
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
            int i12 = this.f27292w + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i12 && this.d.getWidth() == this.f27293x) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.f27293x, i12, Bitmap.Config.ARGB_8888);
                this.f27287e = new Canvas(this.d);
            }
            this.f27287e.save();
            this.f27287e.translate(0.0f, 0);
            d(this.f27287e, f10);
            this.f27287e.restore();
        }
        if (!this.f27288f && !this.f27290r) {
            this.f27288f = true;
            i(j10);
            this.G = this.v;
            this.f27294y.postRunnable(this.C);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.f27291s;
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
                    int intValue = num.intValue() | this.f27289n;
                    this.f27289n = intValue;
                    if (intValue != 0 && !this.f27290r) {
                        this.f27290r = true;
                    }
                }
            }
        } else if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i12 = this.f27289n) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.f27289n = i13;
                if (i13 == 0 && this.f27290r) {
                    this.f27290r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.f27284a) {
            return;
        }
        this.f27284a = true;
        this.B = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        this.f27289n = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.f27290r) {
            this.f27290r = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void f() {
        if (!this.f27284a) {
            return;
        }
        if (!this.f27288f) {
            j();
        }
        this.f27284a = false;
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
        Bitmap bitmap2 = this.f27285b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.f27285b = null;
        this.f27286c = null;
        this.f27287e = null;
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
        if (this.f27284a) {
            this.f27289n = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        }
    }

    public void h() {
    }
}
