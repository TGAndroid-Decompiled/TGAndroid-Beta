package org.telegram.ui.Stories.recorder;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import e0.k0;
import e0.r;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.pt;
import org.telegram.messenger.v2;
import org.telegram.messenger.vs;
import org.telegram.messenger.w0;
public class StoryUploadingService extends Service implements vs {
    public r f34091a;
    public String f34092b;
    public float f34093c;
    public int d = -1;

    public StoryUploadingService() {
        at.e().b(this, at.B5);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        boolean z10 = false;
        if (i10 == at.A5) {
            String str2 = this.f34092b;
            if (str2 != null && str2.equals((String) objArr[0])) {
                float floatValue = ((Float) objArr[1]).floatValue();
                this.f34093c = floatValue;
                r rVar = this.f34091a;
                int round = Math.round(floatValue * 100.0f);
                if (this.f34093c <= 0.0f) {
                    z10 = true;
                }
                rVar.f6067n = 100;
                rVar.f6068o = round;
                rVar.f6069p = z10;
                try {
                    new k0(w0.f18945b).e(null, 33, this.f34091a.b());
                } catch (Throwable th2) {
                    f8.g(th2, true);
                }
            }
        } else if (i10 == at.B5 && (str = this.f34092b) != null && str.equals((String) objArr[0])) {
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
        new k0(w0.f18945b).b(33, null);
        at.e().n(this, at.B5);
        at.f(this.d).n(this, at.A5);
        if (v2.f18578a) {
            f8.b("upload story destroy");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i10, int i11) {
        int i12 = at.A5;
        this.f34092b = intent.getStringExtra("path");
        int i13 = this.d;
        int intExtra = intent.getIntExtra("currentAccount", e20.f15506s0);
        this.d = intExtra;
        if (!e20.r(intExtra)) {
            stopSelf();
            return 2;
        }
        if (i13 != this.d) {
            if (i13 != -1) {
                at.f(i13).n(this, i12);
            }
            int i14 = this.d;
            if (i14 != -1) {
                at.f(i14).b(this, i12);
            }
        }
        if (this.f34092b == null) {
            stopSelf();
            return 2;
        }
        if (v2.f18578a) {
            f8.b("start upload story");
        }
        if (this.f34091a == null) {
            pt.i();
            r rVar = new r(w0.f18945b, null);
            this.f34091a = rVar;
            rVar.F.icon = 17301640;
            rVar.F.when = System.currentTimeMillis();
            r rVar2 = this.f34091a;
            rVar2.f6077y = pt.f17636j0;
            rVar2.g(dd.L0(2131689472, null));
            this.f34091a.p(dd.L0(2131744477, null));
            this.f34091a.f(dd.L0(2131744477, null));
        }
        this.f34093c = 0.0f;
        r rVar3 = this.f34091a;
        int round = Math.round(0.0f);
        rVar3.f6067n = 100;
        rVar3.f6068o = round;
        rVar3.f6069p = false;
        try {
            startForeground(33, this.f34091a.b());
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
        try {
            new k0(w0.f18945b).e(null, 33, this.f34091a.b());
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
