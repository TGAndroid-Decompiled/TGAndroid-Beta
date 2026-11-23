package org.telegram.messenger;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class yf implements Runnable {
    public final int f28081a;
    public final boolean f28082b;
    public final Object f28083c;
    public final Object d;

    public yf(Object obj, Object obj2, boolean z10, int i7) {
        this.f28081a = i7;
        this.f28083c = obj;
        this.d = obj2;
        this.f28082b = z10;
    }

    private final void a() {
        y8 y8Var;
        w7 w7Var = (w7) this.f28083c;
        boolean z10 = this.f28082b;
        String str = (String) this.d;
        if (!z10) {
            y8Var = (y8) w7Var.h.get(str);
        } else {
            y8Var = (y8) w7Var.f27698n.get(str);
        }
        w7Var.f27703y.remove(str);
        if (y8Var != null) {
            w7Var.f27698n.remove(str);
            w7Var.f27696e.remove(y8Var);
            w7Var.f27697f.remove(y8Var);
            if (y8Var.f28029m != 3) {
                y8Var.f28029m = 2;
                Utilities.d.c(new u8(y8Var, 1));
                String str2 = y8Var.f28028l;
                if (str2 == null) {
                    Set set = z0.f28275a;
                } else {
                    z0.f28275a.remove(str2);
                }
                y8Var.f28031o.a();
                y8Var.b();
            }
        }
    }

    private final void b() {
        fc fcVar = (fc) this.f28083c;
        ImageReceiver imageReceiver = (ImageReceiver) this.d;
        int i7 = 0;
        while (true) {
            int i10 = 3;
            if (i7 < 3) {
                if (i7 <= 0 || this.f28082b) {
                    if (i7 == 0) {
                        i10 = 1;
                    } else if (i7 == 1) {
                        i10 = 0;
                    }
                    int G = imageReceiver.G(i10);
                    if (G != 0) {
                        if (i7 == 0) {
                            HashMap hashMap = fcVar.f23894l;
                            SparseArray sparseArray = fcVar.f23895m;
                            String str = (String) sparseArray.get(G);
                            if (str != null) {
                                dc dcVar = (dc) hashMap.get(str);
                                if (dcVar != null) {
                                    ArrayList arrayList = dcVar.f23527c;
                                    int indexOf = arrayList.indexOf(imageReceiver);
                                    if (indexOf >= 0) {
                                        arrayList.remove(indexOf);
                                        dcVar.d.remove(indexOf);
                                    }
                                    if (arrayList.isEmpty()) {
                                        hashMap.remove(str);
                                    }
                                }
                                sparseArray.remove(G);
                            }
                        }
                        tb tbVar = (tb) fcVar.f23893k.get(G);
                        if (tbVar != null) {
                            tbVar.b(imageReceiver);
                        }
                    }
                    i7++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final void c() {
        int i7;
        int position;
        int writeFrame;
        j6.o oVar = (j6.o) this.f28083c;
        ByteBuffer byteBuffer = (ByteBuffer) this.d;
        MediaController mediaController = (MediaController) oVar.f17296b;
        while (byteBuffer.hasRemaining()) {
            int remaining = byteBuffer.remaining();
            ByteBuffer byteBuffer2 = mediaController.f22783z1;
            if (remaining > byteBuffer2.remaining()) {
                i7 = byteBuffer.limit();
                byteBuffer.limit(byteBuffer.position() + byteBuffer2.remaining());
            } else {
                i7 = -1;
            }
            byteBuffer2.put(byteBuffer);
            int position2 = byteBuffer2.position();
            int limit = byteBuffer2.limit();
            boolean z10 = this.f28082b;
            if (position2 == limit || z10) {
                if (!z10) {
                    position = byteBuffer2.limit();
                } else {
                    position = byteBuffer.position();
                }
                writeFrame = mediaController.writeFrame(byteBuffer2, position);
                if (writeFrame != 0) {
                    byteBuffer2.rewind();
                    mediaController.l1 += (byteBuffer2.limit() / 2) / (mediaController.B1 / 1000);
                    mediaController.f22752m1++;
                } else {
                    a8.d("writing frame failed");
                }
            }
            if (i7 != -1) {
                byteBuffer.limit(i7);
            }
        }
        mediaController.N1.c(new z4(24, oVar, byteBuffer));
    }

    private final void d() {
        SQLiteCursor queryFinalized;
        TLRPC.Message message;
        NativeByteBuffer byteBufferValue;
        si siVar = (si) this.f28083c;
        tr trVar = (tr) this.d;
        try {
            if (trVar.f27074b != 0) {
                SQLiteDatabase sQLiteDatabase = siVar.getMessagesStorage().f27252b;
                Locale locale = Locale.US;
                long j3 = trVar.f27073a;
                long j10 = trVar.f27074b;
                queryFinalized = sQLiteDatabase.queryFinalized("SELECT info FROM bot_keyboard_topics WHERE uid = " + j3 + " AND tid = " + j10, new Object[0]);
            } else {
                SQLiteDatabase sQLiteDatabase2 = siVar.getMessagesStorage().f27252b;
                Locale locale2 = Locale.US;
                long j11 = trVar.f27073a;
                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT info FROM bot_keyboard WHERE uid = " + j11, new Object[0]);
            }
            if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                message = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                byteBufferValue.reuse();
            } else {
                message = null;
            }
            queryFinalized.dispose();
            if (message == null && !this.f28082b) {
                return;
            }
            g0.g3(new pg(siVar, message, trVar));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    private final void f() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yf.f():void");
    }

    private final void g() {
        ur urVar = (ur) this.f28083c;
        urVar.x1((so) this.d, this.f28082b);
        urVar.j(false);
        g0.g3(new qq(urVar, 15));
    }

    private final void h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yf.h():void");
    }

    private final void i() {
        int i7;
        ur urVar = (ur) this.f28083c;
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.d;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = urVar.f27252b.executeFast("UPDATE enc_chats SET seq_in = ?, seq_out = ?, use_count = ?, in_seq_no = ?, mtproto_seq = ? WHERE uid = ?");
                sQLitePreparedStatement.bindInteger(1, encryptedChat.seq_in);
                sQLitePreparedStatement.bindInteger(2, encryptedChat.seq_out);
                sQLitePreparedStatement.bindInteger(3, (encryptedChat.key_use_count_in << 16) | encryptedChat.key_use_count_out);
                sQLitePreparedStatement.bindInteger(4, encryptedChat.in_seq_no);
                sQLitePreparedStatement.bindInteger(5, encryptedChat.mtproto_seq);
                sQLitePreparedStatement.bindInteger(6, encryptedChat.f28442id);
                sQLitePreparedStatement.step();
                if (this.f28082b && (i7 = encryptedChat.in_seq_no) != 0) {
                    long j3 = (int) (encryptedChat.f28442id & 4294967295L);
                    SQLiteDatabase sQLiteDatabase = urVar.f27252b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM messages_v2 WHERE mid IN (SELECT m.mid FROM messages_v2 as m LEFT JOIN messages_seq as s ON m.mid = s.mid WHERE m.uid = " + j3 + " AND m.date = 0 AND m.mid < 0 AND s.seq_out <= " + i7 + ") AND uid = " + j3).stepThis().dispose();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                urVar.o(e10, true);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th2) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th2;
        }
    }

    private final void j() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yf.j():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yf.run():void");
    }

    public yf(Object obj, boolean z10, Object obj2, int i7) {
        this.f28081a = i7;
        this.f28083c = obj;
        this.f28082b = z10;
        this.d = obj2;
    }
}
