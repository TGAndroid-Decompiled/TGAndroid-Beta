package org.telegram.ui.Stories.recorder;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import e0.k0;
import e0.r;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.ot;
import org.telegram.messenger.us;
import org.telegram.messenger.v2;
import org.telegram.messenger.w0;
import org.telegram.messenger.zs;
public class StoryUploadingService extends Service implements us {
    public r f34084a;
    public String f34085b;
    public float f34086c;
    public int d = -1;

    public StoryUploadingService() {
        zs.e().b(this, zs.B5);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        boolean z10 = false;
        if (i10 == zs.A5) {
            String str2 = this.f34085b;
            if (str2 != null && str2.equals((String) objArr[0])) {
                float floatValue = ((Float) objArr[1]).floatValue();
                this.f34086c = floatValue;
                r rVar = this.f34084a;
                int round = Math.round(floatValue * 100.0f);
                if (this.f34086c <= 0.0f) {
                    z10 = true;
                }
                rVar.f6067n = 100;
                rVar.f6068o = round;
                rVar.f6069p = z10;
                try {
                    new k0(w0.f19025b).e(null, 33, this.f34084a.b());
                } catch (Throwable th2) {
                    f8.g(th2, true);
                }
            }
        } else if (i10 == zs.B5 && (str = this.f34085b) != null && str.equals((String) objArr[0])) {
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
        new k0(w0.f19025b).b(33, null);
        zs.e().n(this, zs.B5);
        zs.f(this.d).n(this, zs.A5);
        if (v2.f18448a) {
            f8.b("upload story destroy");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i10, int i11) {
        int i12 = zs.A5;
        this.f34085b = intent.getStringExtra("path");
        int i13 = this.d;
        int intExtra = intent.getIntExtra("currentAccount", d20.f15147s0);
        this.d = intExtra;
        if (!d20.r(intExtra)) {
            stopSelf();
            return 2;
        }
        if (i13 != this.d) {
            if (i13 != -1) {
                zs.f(i13).n(this, i12);
            }
            int i14 = this.d;
            if (i14 != -1) {
                zs.f(i14).b(this, i12);
            }
        }
        if (this.f34085b == null) {
            stopSelf();
            return 2;
        }
        if (v2.f18448a) {
            f8.b("start upload story");
        }
        if (this.f34084a == null) {
            ot.i();
            r rVar = new r(w0.f19025b, null);
            this.f34084a = rVar;
            rVar.F.icon = 17301640;
            rVar.F.when = System.currentTimeMillis();
            r rVar2 = this.f34084a;
            rVar2.f6077y = ot.f17303j0;
            rVar2.g(cd.L0(2131689472, null));
            this.f34084a.p(cd.L0(2131744477, null));
            this.f34084a.f(cd.L0(2131744477, null));
        }
        this.f34086c = 0.0f;
        r rVar3 = this.f34084a;
        int round = Math.round(0.0f);
        rVar3.f6067n = 100;
        rVar3.f6068o = round;
        rVar3.f6069p = false;
        try {
            startForeground(33, this.f34084a.b());
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
        try {
            new k0(w0.f19025b).e(null, 33, this.f34084a.b());
        } catch (Throwable th3) {
            f8.g(th3, true);
        }
        return 2;
    }

    public final void onTimeout(int i10, int i11) {
        f8.b("StoryUploadingService timeout, type = " + i11);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
