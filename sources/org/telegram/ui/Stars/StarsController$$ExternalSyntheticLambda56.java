package org.telegram.ui.Stars;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_stars;

public final class StarsController$$ExternalSyntheticLambda56 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage f$0;
    public final ArrayList f$1;
    public final int f$2;
    public final long f$3;

    public StarsController$$ExternalSyntheticLambda56(int i, int i2, long j, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.$r8$classId = i2;
        this.f$0 = messagesStorage;
        this.f$2 = i;
        this.f$1 = arrayList;
        this.f$3 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                long j = this.f$3;
                SQLiteDatabase database = this.f$0.getDatabase();
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
                try {
                    try {
                        database.executeFast("DELETE FROM star_gifts2").stepThis().dispose();
                        ArrayList arrayList = this.f$1;
                        if (arrayList != null) {
                            sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO star_gifts2 VALUES(?, ?, ?, ?, ?)");
                            for (int i = 0; i < arrayList.size(); i++) {
                                TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i);
                                sQLitePreparedStatementExecuteFast.requery();
                                sQLitePreparedStatementExecuteFast.bindLong(1, starGift.id);
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(starGift.getObjectSize());
                                starGift.serializeToStream(nativeByteBuffer);
                                sQLitePreparedStatementExecuteFast.bindByteBuffer(2, nativeByteBuffer);
                                sQLitePreparedStatementExecuteFast.bindLong(3, this.f$2);
                                sQLitePreparedStatementExecuteFast.bindLong(4, j);
                                sQLitePreparedStatementExecuteFast.bindInteger(5, i);
                                sQLitePreparedStatementExecuteFast.step();
                                nativeByteBuffer.reuse();
                            }
                        }
                        if (sQLitePreparedStatementExecuteFast != null) {
                            return;
                        } else {
                            return;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        if (sQLitePreparedStatementExecuteFast != null) {
                            return;
                        } else {
                            return;
                        }
                    }
                } finally {
                    if (sQLitePreparedStatementExecuteFast != null) {
                        sQLitePreparedStatementExecuteFast.dispose();
                    }
                }
            case 1:
                this.f$0.lambda$loadPendingTasks$27(this.f$2, this.f$1, this.f$3);
                return;
            default:
                this.f$0.lambda$loadPendingTasks$28(this.f$2, this.f$1, this.f$3);
                return;
        }
    }

    public StarsController$$ExternalSyntheticLambda56(MessagesStorage messagesStorage, long j, ArrayList arrayList, int i) {
        this.$r8$classId = 0;
        this.f$0 = messagesStorage;
        this.f$1 = arrayList;
        this.f$2 = i;
        this.f$3 = j;
    }
}
