package org.telegram.ui.Stories.recorder;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import org.telegram.messenger.a;
public class StoryUploadingService extends Service implements fn7 {
    public wn7 a;
    public String b;
    public float c;
    public int d = -1;

    public StoryUploadingService() {
        jn7.e().a(this, jn7.E5);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        boolean z = false;
        if (i == jn7.D5) {
            String str2 = this.b;
            if (str2 != null && str2.equals((String) objArr[0])) {
                float floatValue = ((Float) objArr[1]).floatValue();
                this.c = floatValue;
                wn7 wn7Var = this.a;
                int round = Math.round(floatValue * 100.0f);
                if (this.c <= 0.0f) {
                    z = true;
                }
                wn7Var.n = (byte) 100;
                wn7Var.o = round;
                wn7Var.p = z;
                try {
                    new oo7(a.b).e(null, 33, this.a.b());
                } catch (Throwable th) {
                    cc4.g(th, true);
                }
            }
        } else if (i == jn7.E5 && (str = this.b) != null && str.equals((String) objArr[0])) {
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
        new oo7(a.b).b(33, null);
        jn7.e().n(this, jn7.E5);
        jn7.f(this.d).n(this, jn7.D5);
        if (f11.a) {
            cc4.b("upload story destroy");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3 = jn7.D5;
        this.b = intent.getStringExtra("path");
        int i4 = this.d;
        int intExtra = intent.getIntExtra("currentAccount", yac.t0);
        this.d = intExtra;
        if (!yac.q(intExtra)) {
            stopSelf();
            return 2;
        }
        if (i4 != this.d) {
            if (i4 != -1) {
                jn7.f(i4).n(this, i3);
            }
            int i5 = this.d;
            if (i5 != -1) {
                jn7.f(i5).a(this, i3);
            }
        }
        if (this.b == null) {
            stopSelf();
            return 2;
        }
        if (f11.a) {
            cc4.b("start upload story");
        }
        if (this.a == null) {
            ip7.c();
            wn7 wn7Var = new wn7(a.b, null);
            this.a = wn7Var;
            wn7Var.F.icon = 17301640;
            wn7Var.F.when = System.currentTimeMillis();
            wn7 wn7Var2 = this.a;
            wn7Var2.y = ip7.k0;
            wn7Var2.e(ob6.M0(2131689472, null));
            this.a.k(ob6.M0(2131744105, null));
            this.a.d(ob6.M0(2131744105, null));
        }
        this.c = 0.0f;
        wn7 wn7Var3 = this.a;
        wn7Var3.n = (byte) 100;
        wn7Var3.o = 0;
        wn7Var3.p = false;
        try {
            startForeground(33, wn7Var3.b());
        } catch (Throwable th) {
            cc4.g(th, true);
        }
        try {
            new oo7(a.b).e(null, 33, this.a.b());
        } catch (Throwable th2) {
            cc4.g(th2, true);
        }
        return 2;
    }

    public final void onTimeout(int i, int i2) {
        cc4.b("StoryUploadingService timeout, type = " + i2);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
