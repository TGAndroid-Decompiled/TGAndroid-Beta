package org.telegram.ui.Stories.recorder;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import org.telegram.messenger.a;
public class StoryUploadingService extends Service implements jm7 {
    public an7 a;
    public String b;
    public float c;
    public int d = -1;

    public StoryUploadingService() {
        nm7.e().a(this, nm7.F5);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        boolean z = false;
        if (i == nm7.E5) {
            String str2 = this.b;
            if (str2 != null && str2.equals((String) objArr[0])) {
                float floatValue = ((Float) objArr[1]).floatValue();
                this.c = floatValue;
                an7 an7Var = this.a;
                int round = Math.round(floatValue * 100.0f);
                if (this.c <= 0.0f) {
                    z = true;
                }
                an7Var.n = (byte) 100;
                an7Var.o = round;
                an7Var.p = z;
                try {
                    new sn7(a.b).e(null, 33, this.a.b());
                } catch (Throwable th) {
                    fc4.g(th, true);
                }
            }
        } else if (i == nm7.F5 && (str = this.b) != null && str.equals((String) objArr[0])) {
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
        new sn7(a.b).b(33, null);
        nm7.e().n(this, nm7.F5);
        nm7.f(this.d).n(this, nm7.E5);
        if (e21.a) {
            fc4.b("upload story destroy");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3 = nm7.E5;
        this.b = intent.getStringExtra("path");
        int i4 = this.d;
        int intExtra = intent.getIntExtra("currentAccount", z8c.t0);
        this.d = intExtra;
        if (!z8c.q(intExtra)) {
            stopSelf();
            return 2;
        }
        if (i4 != this.d) {
            if (i4 != -1) {
                nm7.f(i4).n(this, i3);
            }
            int i5 = this.d;
            if (i5 != -1) {
                nm7.f(i5).a(this, i3);
            }
        }
        if (this.b == null) {
            stopSelf();
            return 2;
        }
        if (e21.a) {
            fc4.b("start upload story");
        }
        if (this.a == null) {
            lo7.c();
            an7 an7Var = new an7(a.b, null);
            this.a = an7Var;
            an7Var.F.icon = 17301640;
            an7Var.F.when = System.currentTimeMillis();
            an7 an7Var2 = this.a;
            an7Var2.y = lo7.k0;
            an7Var2.e(jb6.M0(2131689472, null));
            this.a.k(jb6.M0(2131744137, null));
            this.a.d(jb6.M0(2131744137, null));
        }
        this.c = 0.0f;
        an7 an7Var3 = this.a;
        an7Var3.n = (byte) 100;
        an7Var3.o = 0;
        an7Var3.p = false;
        try {
            startForeground(33, an7Var3.b());
        } catch (Throwable th) {
            fc4.g(th, true);
        }
        try {
            new sn7(a.b).e(null, 33, this.a.b());
        } catch (Throwable th2) {
            fc4.g(th2, true);
        }
        return 2;
    }

    public final void onTimeout(int i, int i2) {
        fc4.b("StoryUploadingService timeout, type = " + i2);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
