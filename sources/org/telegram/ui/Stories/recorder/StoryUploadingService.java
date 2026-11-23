package org.telegram.ui.Stories.recorder;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import e0.i0;
import e0.q;
import org.telegram.messenger.a8;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.s2;
import org.telegram.messenger.t0;
import org.telegram.messenger.ys;
public class StoryUploadingService extends Service implements gs {
    public q f43872a;
    public String f43873b;
    public float f43874c;
    public int d = -1;

    public StoryUploadingService() {
        ls.e().b(this, ls.E5);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        boolean z10 = false;
        if (i7 == ls.D5) {
            String str2 = this.f43873b;
            if (str2 != null && str2.equals((String) objArr[0])) {
                float floatValue = ((Float) objArr[1]).floatValue();
                this.f43874c = floatValue;
                q qVar = this.f43872a;
                int round = Math.round(floatValue * 100.0f);
                if (this.f43874c <= 0.0f) {
                    z10 = true;
                }
                qVar.f10288n = 100;
                qVar.f10289o = round;
                qVar.f10290p = z10;
                try {
                    new i0(t0.f26931b).e(null, 33, this.f43872a.b());
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
        } else if (i7 == ls.E5 && (str = this.f43873b) != null && str.equals((String) objArr[0])) {
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
        new i0(t0.f26931b).b(33, null);
        ls.e().n(this, ls.E5);
        ls.f(this.d).n(this, ls.D5);
        if (s2.f26730a) {
            a8.b("upload story destroy");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i7, int i10) {
        int i11 = ls.D5;
        this.f43873b = intent.getStringExtra("path");
        int i12 = this.d;
        int intExtra = intent.getIntExtra("currentAccount", k10.f24968t0);
        this.d = intExtra;
        if (!k10.r(intExtra)) {
            stopSelf();
            return 2;
        }
        if (i12 != this.d) {
            if (i12 != -1) {
                ls.f(i12).n(this, i11);
            }
            int i13 = this.d;
            if (i13 != -1) {
                ls.f(i13).b(this, i11);
            }
        }
        if (this.f43873b == null) {
            stopSelf();
            return 2;
        }
        if (s2.f26730a) {
            a8.b("start upload story");
        }
        if (this.f43872a == null) {
            ys.i();
            q qVar = new q(t0.f26931b, null);
            this.f43872a = qVar;
            qVar.F.icon = 17301640;
            qVar.F.when = System.currentTimeMillis();
            q qVar2 = this.f43872a;
            qVar2.f10298y = ys.f28168k0;
            qVar2.g(hd.N0(2131689472, null));
            this.f43872a.p(hd.N0(2131744208, null));
            this.f43872a.f(hd.N0(2131744208, null));
        }
        this.f43874c = 0.0f;
        q qVar3 = this.f43872a;
        int round = Math.round(0.0f);
        qVar3.f10288n = 100;
        qVar3.f10289o = round;
        qVar3.f10290p = false;
        try {
            startForeground(33, this.f43872a.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        try {
            new i0(t0.f26931b).e(null, 33, this.f43872a.b());
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
