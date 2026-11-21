package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
public final class zq implements Runnable {
    public final int f28370a;
    public final tr f28371b;
    public final long f28372c;
    public final nr d;

    public zq(tr trVar, long j3, nr nrVar, int i7) {
        this.f28370a = i7;
        this.f28371b = trVar;
        this.f28372c = j3;
        this.d = nrVar;
    }

    @Override
    public final void run() {
        int i7 = this.f28370a;
        SQLiteCursor sQLiteCursor = null;
        final nr nrVar = this.d;
        long j3 = this.f28372c;
        tr trVar = this.f28371b;
        final int i10 = 0;
        try {
            switch (i7) {
                case 0:
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabase = trVar.f27082b;
                            Locale locale = Locale.US;
                            sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT COUNT(mid) FROM messages_v2 WHERE uid = " + j3, new Object[0]);
                            if (sQLiteCursor.next()) {
                                i10 = sQLiteCursor.intValue(0);
                            }
                            sQLiteCursor.dispose();
                            g0.g3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            nrVar.a(i10);
                                            return;
                                        default:
                                            nrVar.a(i10);
                                            return;
                                    }
                                }
                            });
                        } catch (Exception e10) {
                            trVar.o(e10, true);
                            if (sQLiteCursor == null) {
                                return;
                            }
                        }
                        sQLiteCursor.dispose();
                        return;
                    } finally {
                    }
                default:
                    try {
                        final int i11 = -1;
                        if (trVar.K.f(j3) == null) {
                            sQLiteCursor = trVar.f27082b.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j3));
                            if (sQLiteCursor.next()) {
                                i11 = sQLiteCursor.intValue(0);
                            }
                            sQLiteCursor.dispose();
                        }
                        g0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        nrVar.a(i11);
                                        return;
                                    default:
                                        nrVar.a(i11);
                                        return;
                                }
                            }
                        });
                        if (sQLiteCursor == null) {
                            return;
                        }
                    } catch (Exception e11) {
                        trVar.o(e11, true);
                        if (sQLiteCursor == null) {
                            return;
                        }
                    }
                    sQLiteCursor.dispose();
                    return;
            }
        } finally {
        }
    }
}
