package org.telegram.ui.Stories.recorder;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import e0.j0;
import e0.q;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.us;
public class StoryUploadingService extends Service implements cs {
    public q f42038a;
    public String f42039b;
    public float f42040c;
    public int d = -1;

    public StoryUploadingService() {
        hs.e().b(this, hs.B5);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        String str;
        boolean z10 = false;
        if (i3 == hs.A5) {
            String str2 = this.f42039b;
            if (str2 != null && str2.equals((String) objArr[0])) {
                float floatValue = ((Float) objArr[1]).floatValue();
                this.f42040c = floatValue;
                q qVar = this.f42038a;
                int round = Math.round(floatValue * 100.0f);
                if (this.f42040c <= 0.0f) {
                    z10 = true;
                }
                qVar.f9289n = 100;
                qVar.f9290o = round;
                qVar.f9291p = z10;
                try {
                    new j0(t0.f25457b).e(null, 33, this.f42038a.b());
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
        } else if (i3 == hs.B5 && (str = this.f42039b) != null && str.equals((String) objArr[0])) {
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
        new j0(t0.f25457b).b(33, null);
        hs.e().n(this, hs.B5);
        hs.f(this.d).n(this, hs.A5);
        if (r2.f25040a) {
            a8.b("upload story destroy");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i3, int i10) {
        int i11 = hs.A5;
        this.f42039b = intent.getStringExtra("path");
        int i12 = this.d;
        int intExtra = intent.getIntExtra("currentAccount", h10.f22829t0);
        this.d = intExtra;
        if (!h10.r(intExtra)) {
            stopSelf();
            return 2;
        }
        if (i12 != this.d) {
            if (i12 != -1) {
                hs.f(i12).n(this, i11);
            }
            int i13 = this.d;
            if (i13 != -1) {
                hs.f(i13).b(this, i11);
            }
        }
        if (this.f42039b == null) {
            stopSelf();
            return 2;
        }
        if (r2.f25040a) {
            a8.b("start upload story");
        }
        if (this.f42038a == null) {
            us.i();
            q qVar = new q(t0.f25457b, null);
            this.f42038a = qVar;
            qVar.F.icon = 17301640;
            qVar.F.when = System.currentTimeMillis();
            q qVar2 = this.f42038a;
            qVar2.f9299y = us.f25747k0;
            qVar2.g(bd.M0(2131689472, null));
            this.f42038a.p(bd.M0(2131744461, null));
            this.f42038a.f(bd.M0(2131744461, null));
        }
        this.f42040c = 0.0f;
        q qVar3 = this.f42038a;
        int round = Math.round(0.0f);
        qVar3.f9289n = 100;
        qVar3.f9290o = round;
        qVar3.f9291p = false;
        try {
            startForeground(33, this.f42038a.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        try {
            new j0(t0.f25457b).e(null, 33, this.f42038a.b());
        } catch (Throwable th3) {
            a8.g(th3, true);
        }
        return 2;
    }

    public final void onTimeout(int i3, int i10) {
        a8.b("StoryUploadingService timeout, type = " + i10);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
