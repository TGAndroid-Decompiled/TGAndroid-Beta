package org.telegram.messenger;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.File;
import java.io.RandomAccessFile;
public final class yb extends AsyncTask {
    public final String f19349a;
    public final File f19350b;
    public final String f19351c;
    public int d;
    public RandomAccessFile e = null;
    public boolean f19352f = true;
    public long f19353g;
    public final int h;
    public final hc f19354i;

    public yb(hc hcVar, String str, File file, String str2, int i10) {
        this.f19354i = hcVar;
        this.f19349a = str;
        this.f19350b = file;
        this.f19351c = str2;
        this.h = i10;
    }

    public final void a(long j10, long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j10 != j11) {
            long j12 = this.f19353g;
            if (j12 != 0 && j12 >= elapsedRealtime - 100) {
                return;
            }
        }
        this.f19353g = elapsedRealtime;
        Utilities.d.c(new xb(this, j10, j11, 0));
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yb.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.f19354i.U(this, 2);
    }

    @Override
    public final void onPostExecute(Object obj) {
        int i10;
        if (((Boolean) obj).booleanValue()) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        this.f19354i.U(this, i10);
    }
}
