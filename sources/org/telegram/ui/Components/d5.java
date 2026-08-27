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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

public final class d5 implements Runnable {

    public final int f27648a;

    public final g5 f27649b;

    public final ArrayList f27650c;

    public d5(g5 g5Var, ArrayList arrayList, int i10) {
        this.f27648a = i10;
        this.f27649b = g5Var;
        this.f27650c = arrayList;
    }

    @Override
    public final void run() {
        NativeByteBuffer nativeByteBuffer;
        switch (this.f27648a) {
            case 0:
                ArrayList arrayList = this.f27650c;
                g5 g5Var = this.f27649b;
                int i10 = g5Var.f28534e;
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
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
                                if (documentTLdeserialize != null && documentTLdeserialize.f22386id != 0) {
                                    arrayList2.add(documentTLdeserialize);
                                    hashSet.remove(Long.valueOf(documentTLdeserialize.f22386id));
                                }
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                            if (nativeByteBufferByteBufferValue != null) {
                                nativeByteBufferByteBufferValue.reuse();
                            }
                            break;
                        }
                        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                            g5Var.d(arrayList2);
                            if (!hashSet.isEmpty()) {
                                ArrayList<Long> arrayList3 = new ArrayList<>(hashSet);
                                TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                                tL_messages_getCustomEmojiDocuments.document_id = arrayList3;
                                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.gg(7, g5Var, arrayList3));
                            }
                        } else {
                            NotificationCenter.getInstance(i10).doOnIdle(new e5(g5Var, arrayList2, hashSet, 0));
                        }
                        sQLiteCursorQueryFinalized.dispose();
                    } catch (SQLiteException e10) {
                        messagesStorage.checkSQLException(e10);
                        return;
                    }
                    break;
                }
                break;
            default:
                ArrayList arrayList4 = this.f27650c;
                try {
                    SQLitePreparedStatement sQLitePreparedStatementExecuteFast = MessagesStorage.getInstance(this.f27649b.f28534e).getDatabase().executeFast("REPLACE INTO animated_emoji VALUES(?, ?)");
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        if (arrayList4.get(i11) instanceof TLRPC.Document) {
                            TLRPC.Document document = (TLRPC.Document) arrayList4.get(i11);
                            NativeByteBuffer nativeByteBuffer2 = null;
                            try {
                                nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                                try {
                                    document.serializeToStream(nativeByteBuffer);
                                    sQLitePreparedStatementExecuteFast.requery();
                                    sQLitePreparedStatementExecuteFast.bindLong(1, document.f22386id);
                                    sQLitePreparedStatementExecuteFast.bindByteBuffer(2, nativeByteBuffer);
                                    sQLitePreparedStatementExecuteFast.step();
                                } catch (Exception e11) {
                                    e = e11;
                                    nativeByteBuffer2 = nativeByteBuffer;
                                    e.printStackTrace();
                                    nativeByteBuffer = nativeByteBuffer2;
                                }
                            } catch (Exception e12) {
                                e = e12;
                            }
                            if (nativeByteBuffer != null) {
                                nativeByteBuffer.reuse();
                            }
                            break;
                        }
                    }
                    sQLitePreparedStatementExecuteFast.dispose();
                } catch (SQLiteException e13) {
                    FileLog.e(e13);
                }
                break;
        }
    }
}
