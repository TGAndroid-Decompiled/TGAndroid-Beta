package org.telegram.messenger;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.File;
import java.io.RandomAccessFile;
public final class zb extends AsyncTask {
    public final String f19677a;
    public final File f19678b;
    public final String f19679c;
    public int d;
    public RandomAccessFile e = null;
    public boolean f19680f = true;
    public long f19681g;
    public final int h;
    public final ic f19682i;

    public zb(ic icVar, String str, File file, String str2, int i10) {
        this.f19682i = icVar;
        this.f19677a = str;
        this.f19678b = file;
        this.f19679c = str2;
        this.h = i10;
    }

    public final void a(long j10, long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j10 != j11) {
            long j12 = this.f19681g;
            if (j12 != 0 && j12 >= elapsedRealtime - 100) {
                return;
            }
        }
        this.f19681g = elapsedRealtime;
        Utilities.d.c(new yb(this, j10, j11, 0));
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zb.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.f19682i.U(this, 2);
    }

    @Override
    public final void onPostExecute(Object obj) {
        int i10;
        if (((Boolean) obj).booleanValue()) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        this.f19682i.U(this, i10);
    }
}
