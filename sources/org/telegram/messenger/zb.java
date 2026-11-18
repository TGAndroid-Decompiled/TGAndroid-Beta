package org.telegram.messenger;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
public final class zb extends AsyncTask {
    public static final int f28277i = 0;
    public final sb f28278a;
    public RandomAccessFile f28279b;
    public long f28280c;
    public long d;
    public boolean f28281e;
    public final String f28282f;
    public HttpURLConnection f28283g;
    public final ec h;

    public zb(ec ecVar, sb sbVar, long j3) {
        this.h = ecVar;
        this.f28281e = true;
        this.f28278a = sbVar;
        this.f28280c = j3;
    }

    public final void a(long j3, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j3 != j10) {
            long j11 = this.d;
            if (j11 != 0 && j11 >= elapsedRealtime - 100) {
                return;
            }
        }
        this.d = elapsedRealtime;
        Utilities.d.c(new yb(this, j3, j10, 0));
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zb.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.h.f23695s.d(new wb(this, 0), this.f28278a.f26764a);
        Utilities.d.c(new wb(this, 1));
    }

    @Override
    public final void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue() && this.f28281e) {
            ec ecVar = this.h;
            ecVar.f23695s.c(new gb(ecVar, this.f28278a.f26767e, 4));
        } else {
            ec ecVar2 = this.h;
            sb sbVar = this.f28278a;
            ecVar2.f23695s.c(new dg(ecVar2, sbVar.f26767e, 0, sbVar.f26777p, 5));
        }
        Utilities.d.c(new xb(this, bool, 0));
        this.h.f23695s.d(new wb(this, 2), this.f28278a.f26764a);
    }

    public zb(ec ecVar, sb sbVar, String str) {
        this.h = ecVar;
        this.f28281e = true;
        this.f28278a = sbVar;
        this.f28280c = 0;
        this.f28282f = str;
    }
}
