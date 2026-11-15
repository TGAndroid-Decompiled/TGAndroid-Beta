package org.telegram.messenger;

import org.telegram.SQLite.SQLitePreparedStatement;
public final class zg implements Runnable {
    public final si f27924a;
    public final long f27925b;
    public final int f27926c;
    public final double d;

    public zg(si siVar, long j3, int i7, double d) {
        this.f27924a = siVar;
        this.f27925b = j3;
        this.f27926c = i7;
        this.d = d;
    }

    @Override
    public final void run() {
        si siVar = this.f27924a;
        long j3 = this.f27925b;
        int i7 = this.f27926c;
        double d = this.d;
        try {
            SQLitePreparedStatement executeFast = siVar.getMessagesStorage().f27222b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j3);
            executeFast.bindInteger(2, i7);
            executeFast.bindDouble(3, d);
            executeFast.bindInteger(4, ((int) System.currentTimeMillis()) / 1000);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
