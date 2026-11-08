package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class yp implements Runnable {
    public final int f26709a;
    public final yr f26710b;
    public final ArrayList f26711c;
    public final ArrayList d;

    public yp(yr yrVar, ArrayList arrayList, ArrayList arrayList2, int i7) {
        this.f26709a = i7;
        this.f26710b = yrVar;
        this.f26711c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f26709a) {
            case 0:
                ArrayList arrayList = this.f26711c;
                ArrayList arrayList2 = this.d;
                yr yrVar = this.f26710b;
                yrVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = yrVar.f26721b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                        int size = arrayList.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindInteger(1, ((Integer) arrayList2.get(i7)).intValue());
                            sQLitePreparedStatement.bindLong(2, ((Long) arrayList.get(i7)).longValue());
                            sQLitePreparedStatement.step();
                        }
                        sQLitePreparedStatement.dispose();
                        return;
                    } catch (Exception e10) {
                        yrVar.o(e10, true);
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th2;
                }
            default:
                yr yrVar2 = this.f26710b;
                yrVar2.getClass();
                ArrayList arrayList3 = this.f26711c;
                if (!arrayList3.isEmpty()) {
                    yrVar2.getMessagesController().Y3(arrayList3, true);
                }
                ArrayList arrayList4 = this.d;
                if (!arrayList4.isEmpty()) {
                    yrVar2.getMessagesController().S3(arrayList4, true);
                    return;
                }
                return;
        }
    }
}
