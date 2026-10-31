package org.telegram.messenger;

import org.telegram.SQLite.SQLitePreparedStatement;
public final class zg implements Runnable {
    public final ui f19535a;
    public final long f19536b;
    public final int f19537c;
    public final double d;

    public zg(ui uiVar, long j10, int i10, double d) {
        this.f19535a = uiVar;
        this.f19536b = j10;
        this.f19537c = i10;
        this.d = d;
    }

    @Override
    public final void run() {
        ui uiVar = this.f19535a;
        long j10 = this.f19536b;
        int i10 = this.f19537c;
        double d = this.d;
        try {
            SQLitePreparedStatement executeFast = uiVar.getMessagesStorage().f15940b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j10);
            executeFast.bindInteger(2, i10);
            executeFast.bindDouble(3, d);
            executeFast.bindInteger(4, ((int) System.currentTimeMillis()) / 1000);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
