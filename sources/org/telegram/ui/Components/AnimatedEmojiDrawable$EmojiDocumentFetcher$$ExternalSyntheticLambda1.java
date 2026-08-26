package org.telegram.ui.Components;

import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

public final class AnimatedEmojiDrawable$EmojiDocumentFetcher$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final AnimatedEmojiDrawable.EmojiDocumentFetcher f$0;
    public final ArrayList f$1;

    public AnimatedEmojiDrawable$EmojiDocumentFetcher$$ExternalSyntheticLambda1(AnimatedEmojiDrawable.EmojiDocumentFetcher emojiDocumentFetcher, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = emojiDocumentFetcher;
        this.f$1 = arrayList;
    }

    @Override
    public final void run() {
        NativeByteBuffer nativeByteBuffer;
        switch (this.$r8$classId) {
            case 0:
                ArrayList arrayList = this.f$1;
                AnimatedEmojiDrawable.EmojiDocumentFetcher emojiDocumentFetcher = this.f$0;
                int i = emojiDocumentFetcher.currentAccount;
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i);
                SQLiteDatabase database = messagesStorage.getDatabase();
                if (database != null) {
                    try {
                        String strJoin = TextUtils.join(",", arrayList);
                        Locale locale = Locale.US;
                        SQLiteCursor sQLiteCursorQueryFinalized = database.queryFinalized("SELECT data FROM animated_emoji WHERE document_id IN (" + strJoin + ")", new Object[0]);
                        ArrayList arrayList2 = new ArrayList();
                        HashSet hashSet = new HashSet(arrayList);
                        while (sQLiteCursorQueryFinalized.next()) {
                            NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                            try {
                                TLRPC.Document documentTLdeserialize = TLRPC.Document.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(true), true);
                                if (documentTLdeserialize != null && documentTLdeserialize.id != 0) {
                                    arrayList2.add(documentTLdeserialize);
                                    hashSet.remove(Long.valueOf(documentTLdeserialize.id));
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            if (nativeByteBufferByteBufferValue != null) {
                                nativeByteBufferByteBufferValue.reuse();
                            }
                            break;
                        }
                        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                            emojiDocumentFetcher.processDocuments(arrayList2);
                            if (!hashSet.isEmpty()) {
                                emojiDocumentFetcher.loadFromServer(new ArrayList(hashSet));
                            }
                        } else {
                            NotificationCenter.getInstance(i).doOnIdle(new AnimatedEmojiDrawable$EmojiDocumentFetcher$$ExternalSyntheticLambda2(emojiDocumentFetcher, arrayList2, hashSet, 0));
                        }
                        sQLiteCursorQueryFinalized.dispose();
                    } catch (SQLiteException e2) {
                        messagesStorage.checkSQLException(e2);
                        return;
                    }
                    break;
                }
                break;
            default:
                ArrayList arrayList3 = this.f$1;
                try {
                    SQLitePreparedStatement sQLitePreparedStatementExecuteFast = MessagesStorage.getInstance(this.f$0.currentAccount).getDatabase().executeFast("REPLACE INTO animated_emoji VALUES(?, ?)");
                    for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                        if (arrayList3.get(i2) instanceof TLRPC.Document) {
                            TLRPC.Document document = (TLRPC.Document) arrayList3.get(i2);
                            try {
                                nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                                try {
                                    document.serializeToStream(nativeByteBuffer);
                                    sQLitePreparedStatementExecuteFast.requery();
                                    sQLitePreparedStatementExecuteFast.bindLong(1, document.id);
                                    sQLitePreparedStatementExecuteFast.bindByteBuffer(2, nativeByteBuffer);
                                    sQLitePreparedStatementExecuteFast.step();
                                } catch (Exception e3) {
                                    e = e3;
                                    e.printStackTrace();
                                }
                            } catch (Exception e4) {
                                e = e4;
                                nativeByteBuffer = null;
                            }
                            if (nativeByteBuffer != null) {
                                nativeByteBuffer.reuse();
                            }
                            break;
                        }
                    }
                    sQLitePreparedStatementExecuteFast.dispose();
                } catch (SQLiteException e5) {
                    FileLog.e(e5);
                }
                break;
        }
    }
}
