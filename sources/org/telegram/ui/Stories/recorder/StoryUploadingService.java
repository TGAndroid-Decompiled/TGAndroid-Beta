package org.telegram.ui.Stories.recorder;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import org.telegram.messenger.a;
public class StoryUploadingService extends Service implements gk7 {
    public xk7 a;
    public String b;
    public float c;
    public int d = -1;

    public StoryUploadingService() {
        kk7.e().a(this, kk7.D5);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        boolean z = false;
        if (i == kk7.C5) {
            String str2 = this.b;
            if (str2 != null && str2.equals((String) objArr[0])) {
                float floatValue = ((Float) objArr[1]).floatValue();
                this.c = floatValue;
                xk7 xk7Var = this.a;
                int round = Math.round(floatValue * 100.0f);
                if (this.c <= 0.0f) {
                    z = true;
                }
                xk7Var.n = (byte) 100;
                xk7Var.o = round;
                xk7Var.p = z;
                try {
                    new pl7(a.b).e(null, 33, this.a.b());
                } catch (Throwable th) {
                    fa4.g(th, true);
                }
            }
        } else if (i == kk7.D5 && (str = this.b) != null && str.equals((String) objArr[0])) {
            stopSelf();
        }
    }

    @Override
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        try {
            stopForeground(true);
        } catch (Exception unused) {
        }
        new pl7(a.b).b(33, null);
        kk7.e().n(this, kk7.D5);
        kk7.f(this.d).n(this, kk7.C5);
        if (w01.a) {
            fa4.b("upload story destroy");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3 = kk7.C5;
        this.b = intent.getStringExtra("path");
        int i4 = this.d;
        int intExtra = intent.getIntExtra("currentAccount", y6c.t0);
        this.d = intExtra;
        if (!y6c.q(intExtra)) {
            stopSelf();
            return 2;
        }
        if (i4 != this.d) {
            if (i4 != -1) {
                kk7.f(i4).n(this, i3);
            }
            int i5 = this.d;
            if (i5 != -1) {
                kk7.f(i5).a(this, i3);
            }
        }
        if (this.b == null) {
            stopSelf();
            return 2;
        }
        if (w01.a) {
            fa4.b("start upload story");
        }
        if (this.a == null) {
            im7.c();
            xk7 xk7Var = new xk7(a.b, null);
            this.a = xk7Var;
            xk7Var.F.icon = 17301640;
            xk7Var.F.when = System.currentTimeMillis();
            xk7 xk7Var2 = this.a;
            xk7Var2.y = im7.k0;
            xk7Var2.e(k96.M0(2131689472, null));
            this.a.k(k96.M0(2131744211, null));
            this.a.d(k96.M0(2131744211, null));
        }
        this.c = 0.0f;
        xk7 xk7Var3 = this.a;
        xk7Var3.n = (byte) 100;
        xk7Var3.o = 0;
        xk7Var3.p = false;
        try {
            startForeground(33, xk7Var3.b());
        } catch (Throwable th) {
            fa4.g(th, true);
        }
        try {
            new pl7(a.b).e(null, 33, this.a.b());
        } catch (Throwable th2) {
            fa4.g(th2, true);
        }
        return 2;
    }

    public final void onTimeout(int i, int i2) {
        fa4.b("StoryUploadingService timeout, type = " + i2);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
