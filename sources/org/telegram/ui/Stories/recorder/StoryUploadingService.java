package org.telegram.ui.Stories.recorder;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import e0.i0;
import e0.q;
import org.telegram.messenger.a8;
import org.telegram.messenger.dt;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
public class StoryUploadingService extends Service implements ls {
    public q f42005a;
    public String f42006b;
    public float f42007c;
    public int d = -1;

    public StoryUploadingService() {
        qs.e().b(this, qs.B5);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        boolean z9 = false;
        if (i7 == qs.A5) {
            String str2 = this.f42006b;
            if (str2 != null && str2.equals((String) objArr[0])) {
                float floatValue = ((Float) objArr[1]).floatValue();
                this.f42007c = floatValue;
                q qVar = this.f42005a;
                int round = Math.round(floatValue * 100.0f);
                if (this.f42007c <= 0.0f) {
                    z9 = true;
                }
                qVar.f10105n = 100;
                qVar.f10106o = round;
                qVar.f10107p = z9;
                try {
                    new i0(t0.f25555b).e(null, 33, this.f42005a.b());
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
        } else if (i7 == qs.B5 && (str = this.f42006b) != null && str.equals((String) objArr[0])) {
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
        new i0(t0.f25555b).b(33, null);
        qs.e().n(this, qs.B5);
        qs.f(this.d).n(this, qs.A5);
        if (r2.f25191a) {
            a8.b("upload story destroy");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i7, int i10) {
        int i11 = qs.A5;
        this.f42006b = intent.getStringExtra("path");
        int i12 = this.d;
        int intExtra = intent.getIntExtra("currentAccount", p10.f24459s0);
        this.d = intExtra;
        if (!p10.r(intExtra)) {
            stopSelf();
            return 2;
        }
        if (i12 != this.d) {
            if (i12 != -1) {
                qs.f(i12).n(this, i11);
            }
            int i13 = this.d;
            if (i13 != -1) {
                qs.f(i13).b(this, i11);
            }
        }
        if (this.f42006b == null) {
            stopSelf();
            return 2;
        }
        if (r2.f25191a) {
            a8.b("start upload story");
        }
        if (this.f42005a == null) {
            dt.i();
            q qVar = new q(t0.f25555b, null);
            this.f42005a = qVar;
            qVar.F.icon = 17301640;
            qVar.F.when = System.currentTimeMillis();
            q qVar2 = this.f42005a;
            qVar2.f10115y = dt.f22050j0;
            qVar2.g(hd.M0(2131689472, null));
            this.f42005a.p(hd.M0(2131744452, null));
            this.f42005a.f(hd.M0(2131744452, null));
        }
        this.f42007c = 0.0f;
        q qVar3 = this.f42005a;
        int round = Math.round(0.0f);
        qVar3.f10105n = 100;
        qVar3.f10106o = round;
        qVar3.f10107p = false;
        try {
            startForeground(33, this.f42005a.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        try {
            new i0(t0.f25555b).e(null, 33, this.f42005a.b());
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
