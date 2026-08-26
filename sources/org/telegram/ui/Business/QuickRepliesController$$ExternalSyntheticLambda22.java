package org.telegram.ui.Business;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_account;

public final class QuickRepliesController$$ExternalSyntheticLambda22 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage f$0;
    public final ArrayList f$1;

    public QuickRepliesController$$ExternalSyntheticLambda22(int i, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.$r8$classId = i;
        this.f$0 = messagesStorage;
        this.f$1 = arrayList;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                MessagesStorage messagesStorage = this.f$0;
                ArrayList arrayList = this.f$1;
                try {
                    messagesStorage.getDatabase().executeFast("DELETE FROM quick_replies_messages WHERE topic_id IN (" + TextUtils.join(", ", arrayList) + ")").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                MessagesStorage messagesStorage2 = this.f$0;
                ArrayList arrayList2 = this.f$1;
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
                try {
                    SQLiteDatabase database = messagesStorage2.getDatabase();
                    database.executeFast("DELETE FROM business_links").stepThis().dispose();
                    sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO business_links VALUES(?, ?)");
                    for (int i = 0; i < arrayList2.size(); i++) {
                        TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList2.get(i);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_businessChatLink.getObjectSize());
                        tL_businessChatLink.serializeToStream(nativeByteBuffer);
                        sQLitePreparedStatementExecuteFast.requery();
                        sQLitePreparedStatementExecuteFast.bindByteBuffer(1, nativeByteBuffer);
                        sQLitePreparedStatementExecuteFast.bindInteger(2, i);
                        sQLitePreparedStatementExecuteFast.step();
                    }
                    if (sQLitePreparedStatementExecuteFast != null) {
                        return;
                    } else {
                        return;
                    }
                } catch (Exception e2) {
                    FileLog.e(e2);
                    if (sQLitePreparedStatementExecuteFast != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (sQLitePreparedStatementExecuteFast != null) {
                        sQLitePreparedStatementExecuteFast.dispose();
                    }
                }
            default:
                MessagesStorage messagesStorage3 = this.f$0;
                ArrayList arrayList3 = this.f$1;
                try {
                    SQLiteDatabase database2 = messagesStorage3.getDatabase();
                    if (database2 == null) {
                        return;
                    }
                    database2.executeFast("DELETE FROM story_drafts WHERE id IN (" + TextUtils.join(", ", arrayList3) + ")").stepThis().dispose();
                    return;
                } catch (Exception e3) {
                    FileLog.e(e3);
                    return;
                }
        }
    }
}
