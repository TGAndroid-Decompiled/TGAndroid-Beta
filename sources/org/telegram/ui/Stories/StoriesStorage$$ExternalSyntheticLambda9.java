package org.telegram.ui.Stories;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MessagesStorage;

public final class StoriesStorage$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final StoriesStorage f$0;
    public final long f$1;
    public final int f$2;

    public StoriesStorage$$ExternalSyntheticLambda9(StoriesStorage storiesStorage, long j, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = storiesStorage;
        this.f$1 = j;
        this.f$2 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                long j = this.f$1;
                int i = this.f$2;
                MessagesStorage messagesStorage = this.f$0.storage;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    Locale locale = Locale.US;
                    database.executeFast("REPLACE INTO stories_counter VALUES(" + j + ", 0, " + i + ")").stepThis().dispose();
                } catch (Throwable th) {
                    messagesStorage.checkSQLException(th);
                    return;
                }
                break;
            default:
                long j2 = this.f$1;
                int i2 = this.f$2;
                MessagesStorage messagesStorage2 = this.f$0.storage;
                SQLiteDatabase database2 = messagesStorage2.getDatabase();
                try {
                    Locale locale2 = Locale.US;
                    database2.executeFast("DELETE FROM stories WHERE dialog_id = " + j2 + " AND story_id = " + i2).stepThis().dispose();
                } catch (Throwable th2) {
                    messagesStorage2.checkSQLException(th2);
                }
                break;
        }
    }
}
