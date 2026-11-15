package org.telegram.ui.Stories.recorder;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import e0.i0;
import e0.q;
import org.telegram.messenger.a8;
import org.telegram.messenger.at;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
public class StoryUploadingService extends Service implements is {
    public q f43381a;
    public String f43382b;
    public float f43383c;
    public int d = -1;

    public StoryUploadingService() {
        ns.e().b(this, ns.B5);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        boolean z10 = false;
        if (i7 == ns.A5) {
            String str2 = this.f43382b;
            if (str2 != null && str2.equals((String) objArr[0])) {
                float floatValue = ((Float) objArr[1]).floatValue();
                this.f43383c = floatValue;
                q qVar = this.f43381a;
                int round = Math.round(floatValue * 100.0f);
                if (this.f43383c <= 0.0f) {
                    z10 = true;
                }
                qVar.f9941n = 100;
                qVar.f9942o = round;
                qVar.f9943p = z10;
                try {
                    new i0(t0.f26600b).e(null, 33, this.f43381a.b());
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
        } else if (i7 == ns.B5 && (str = this.f43382b) != null && str.equals((String) objArr[0])) {
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
        new i0(t0.f26600b).b(33, null);
        ns.e().n(this, ns.B5);
        ns.f(this.d).n(this, ns.A5);
        if (r2.f26198a) {
            a8.b("upload story destroy");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i7, int i10) {
        int i11 = ns.A5;
        this.f43382b = intent.getStringExtra("path");
        int i12 = this.d;
        int intExtra = intent.getIntExtra("currentAccount", m10.f24934t0);
        this.d = intExtra;
        if (!m10.r(intExtra)) {
            stopSelf();
            return 2;
        }
        if (i12 != this.d) {
            if (i12 != -1) {
                ns.f(i12).n(this, i11);
            }
            int i13 = this.d;
            if (i13 != -1) {
                ns.f(i13).b(this, i11);
            }
        }
        if (this.f43382b == null) {
            stopSelf();
            return 2;
        }
        if (r2.f26198a) {
            a8.b("start upload story");
        }
        if (this.f43381a == null) {
            at.i();
            q qVar = new q(t0.f26600b, null);
            this.f43381a = qVar;
            qVar.F.icon = 17301640;
            qVar.F.when = System.currentTimeMillis();
            q qVar2 = this.f43381a;
            qVar2.f9951y = at.f22557k0;
            qVar2.g(hd.M0(2131689472, null));
            this.f43381a.p(hd.M0(2131744451, null));
            this.f43381a.f(hd.M0(2131744451, null));
        }
        this.f43383c = 0.0f;
        q qVar3 = this.f43381a;
        int round = Math.round(0.0f);
        qVar3.f9941n = 100;
        qVar3.f9942o = round;
        qVar3.f9943p = false;
        try {
            startForeground(33, this.f43381a.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        try {
            new i0(t0.f26600b).e(null, 33, this.f43381a.b());
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
