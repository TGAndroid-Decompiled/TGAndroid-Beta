package org.telegram.ui.Stories.recorder;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import e0.i0;
import e0.q;
import org.telegram.messenger.a8;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.s2;
import org.telegram.messenger.t0;
import org.telegram.messenger.xs;
public class StoryUploadingService extends Service implements fs {
    public q f43827a;
    public String f43828b;
    public float f43829c;
    public int d = -1;

    public StoryUploadingService() {
        ks.e().b(this, ks.D5);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        boolean z10 = false;
        if (i7 == ks.C5) {
            String str2 = this.f43828b;
            if (str2 != null && str2.equals((String) objArr[0])) {
                float floatValue = ((Float) objArr[1]).floatValue();
                this.f43829c = floatValue;
                q qVar = this.f43827a;
                int round = Math.round(floatValue * 100.0f);
                if (this.f43829c <= 0.0f) {
                    z10 = true;
                }
                qVar.f10259n = 100;
                qVar.f10260o = round;
                qVar.f10261p = z10;
                try {
                    new i0(t0.f26915b).e(null, 33, this.f43827a.b());
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
        } else if (i7 == ks.D5 && (str = this.f43828b) != null && str.equals((String) objArr[0])) {
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
        new i0(t0.f26915b).b(33, null);
        ks.e().n(this, ks.D5);
        ks.f(this.d).n(this, ks.C5);
        if (s2.f26723a) {
            a8.b("upload story destroy");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i7, int i10) {
        int i11 = ks.C5;
        this.f43828b = intent.getStringExtra("path");
        int i12 = this.d;
        int intExtra = intent.getIntExtra("currentAccount", j10.f24773t0);
        this.d = intExtra;
        if (!j10.r(intExtra)) {
            stopSelf();
            return 2;
        }
        if (i12 != this.d) {
            if (i12 != -1) {
                ks.f(i12).n(this, i11);
            }
            int i13 = this.d;
            if (i13 != -1) {
                ks.f(i13).b(this, i11);
            }
        }
        if (this.f43828b == null) {
            stopSelf();
            return 2;
        }
        if (s2.f26723a) {
            a8.b("start upload story");
        }
        if (this.f43827a == null) {
            xs.i();
            q qVar = new q(t0.f26915b, null);
            this.f43827a = qVar;
            qVar.F.icon = 17301640;
            qVar.F.when = System.currentTimeMillis();
            q qVar2 = this.f43827a;
            qVar2.f10269y = xs.f27958k0;
            qVar2.g(gd.M0(2131689472, null));
            this.f43827a.p(gd.M0(2131744216, null));
            this.f43827a.f(gd.M0(2131744216, null));
        }
        this.f43829c = 0.0f;
        q qVar3 = this.f43827a;
        int round = Math.round(0.0f);
        qVar3.f10259n = 100;
        qVar3.f10260o = round;
        qVar3.f10261p = false;
        try {
            startForeground(33, this.f43827a.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        try {
            new i0(t0.f26915b).e(null, 33, this.f43827a.b());
        } catch (Throwable th3) {
            a8.g(th3, true);
        }
        return 2;
    }

    public final void onTimeout(int i7, int i10) {
        a8.b("StoryUploadingService timeout, type = " + i10);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
