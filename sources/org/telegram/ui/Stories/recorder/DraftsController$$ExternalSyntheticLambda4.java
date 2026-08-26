package org.telegram.ui.Stories.recorder;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.NativeByteBuffer;

public final class DraftsController$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage f$0;
    public final DraftsController.StoryDraft f$1;

    public DraftsController$$ExternalSyntheticLambda4(MessagesStorage messagesStorage, DraftsController.StoryDraft storyDraft, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesStorage;
        this.f$1 = storyDraft;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                MessagesStorage messagesStorage = this.f$0;
                DraftsController.StoryDraft storyDraft = this.f$1;
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
                try {
                    try {
                        SQLiteDatabase database = messagesStorage.getDatabase();
                        if (database == null) {
                            return;
                        }
                        sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO story_drafts VALUES (?, ?, ?, ?)");
                        sQLitePreparedStatementExecuteFast.requery();
                        storyDraft.getClass();
                        int i = 1;
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(true);
                        storyDraft.toStream(nativeByteBuffer);
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(nativeByteBuffer.length());
                        storyDraft.toStream(nativeByteBuffer2);
                        sQLitePreparedStatementExecuteFast.bindLong(1, storyDraft.id);
                        sQLitePreparedStatementExecuteFast.bindLong(2, storyDraft.date);
                        sQLitePreparedStatementExecuteFast.bindByteBuffer(3, nativeByteBuffer2);
                        if (!storyDraft.isEdit) {
                            i = storyDraft.isError ? 2 : 0;
                        }
                        sQLitePreparedStatementExecuteFast.bindInteger(4, i);
                        sQLitePreparedStatementExecuteFast.step();
                        nativeByteBuffer2.reuse();
                        sQLitePreparedStatementExecuteFast.dispose();
                        sQLitePreparedStatementExecuteFast.dispose();
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        if (sQLitePreparedStatementExecuteFast != null) {
                            sQLitePreparedStatementExecuteFast.dispose();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th) {
                    if (sQLitePreparedStatementExecuteFast != null) {
                        sQLitePreparedStatementExecuteFast.dispose();
                    }
                    throw th;
                }
                if (sQLitePreparedStatementExecuteFast != null) {
                    sQLitePreparedStatementExecuteFast.dispose();
                }
                throw th;
            default:
                MessagesStorage messagesStorage2 = this.f$0;
                DraftsController.StoryDraft storyDraft2 = this.f$1;
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = null;
                try {
                    try {
                        SQLiteDatabase database2 = messagesStorage2.getDatabase();
                        if (database2 == null) {
                            return;
                        }
                        sQLitePreparedStatementExecuteFast2 = database2.executeFast("INSERT INTO story_drafts VALUES (?, ?, ?, ?)");
                        sQLitePreparedStatementExecuteFast2.requery();
                        storyDraft2.getClass();
                        int i2 = 1;
                        NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(true);
                        storyDraft2.toStream(nativeByteBuffer3);
                        NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(nativeByteBuffer3.length());
                        storyDraft2.toStream(nativeByteBuffer4);
                        sQLitePreparedStatementExecuteFast2.bindLong(1, storyDraft2.id);
                        sQLitePreparedStatementExecuteFast2.bindLong(2, storyDraft2.date);
                        sQLitePreparedStatementExecuteFast2.bindByteBuffer(3, nativeByteBuffer4);
                        if (!storyDraft2.isEdit) {
                            i2 = storyDraft2.isError ? 2 : 0;
                        }
                        sQLitePreparedStatementExecuteFast2.bindInteger(4, i2);
                        sQLitePreparedStatementExecuteFast2.step();
                        nativeByteBuffer4.reuse();
                        sQLitePreparedStatementExecuteFast2.dispose();
                        sQLitePreparedStatementExecuteFast2.dispose();
                        return;
                    } catch (Exception e2) {
                        FileLog.e(e2);
                        if (sQLitePreparedStatementExecuteFast2 != null) {
                            sQLitePreparedStatementExecuteFast2.dispose();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th2) {
                    if (sQLitePreparedStatementExecuteFast2 != null) {
                        sQLitePreparedStatementExecuteFast2.dispose();
                    }
                    throw th2;
                }
                if (sQLitePreparedStatementExecuteFast2 != null) {
                    sQLitePreparedStatementExecuteFast2.dispose();
                }
                throw th2;
        }
    }
}
