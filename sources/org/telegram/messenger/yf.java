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
    public final int f26634a;
    public final boolean f26635b;
    public final Object f26636c;
    public final Object d;

    public yf(Object obj, Object obj2, boolean z9, int i7) {
        this.f26634a = i7;
        this.f26636c = obj;
        this.d = obj2;
        this.f26635b = z9;
    }

    private final void a() {
        y8 y8Var;
        w7 w7Var = (w7) this.f26636c;
        boolean z9 = this.f26635b;
        String str = (String) this.d;
        if (!z9) {
            y8Var = (y8) w7Var.h.get(str);
        } else {
            y8Var = (y8) w7Var.f26257n.get(str);
        }
        w7Var.f26262y.remove(str);
        if (y8Var != null) {
            w7Var.f26257n.remove(str);
            w7Var.f26255e.remove(y8Var);
            w7Var.f26256f.remove(y8Var);
            if (y8Var.f26592m != 3) {
                y8Var.f26592m = 2;
                Utilities.d.c(new u8(y8Var, 1));
                String str2 = y8Var.f26591l;
                if (str2 == null) {
                    Set set = z0.f26769a;
                } else {
                    z0.f26769a.remove(str2);
                }
                y8Var.f26594o.a();
                y8Var.b();
            }
        }
    }

    private final void b() {
        gc gcVar = (gc) this.f26636c;
        ImageReceiver imageReceiver = (ImageReceiver) this.d;
        int i7 = 0;
        while (true) {
            int i10 = 3;
            if (i7 < 3) {
                if (i7 <= 0 || this.f26635b) {
                    if (i7 == 0) {
                        i10 = 1;
                    } else if (i7 == 1) {
                        i10 = 0;
                    }
                    int G = imageReceiver.G(i10);
                    if (G != 0) {
                        if (i7 == 0) {
                            HashMap hashMap = gcVar.f22618l;
                            SparseArray sparseArray = gcVar.f22619m;
                            String str = (String) sparseArray.get(G);
                            if (str != null) {
                                ec ecVar = (ec) hashMap.get(str);
                                if (ecVar != null) {
                                    ArrayList arrayList = ecVar.f22172c;
                                    int indexOf = arrayList.indexOf(imageReceiver);
                                    if (indexOf >= 0) {
                                        arrayList.remove(indexOf);
                                        ecVar.d.remove(indexOf);
                                    }
                                    if (arrayList.isEmpty()) {
                                        hashMap.remove(str);
                                    }
                                }
                                sparseArray.remove(G);
                            }
                        }
                        ub ubVar = (ub) gcVar.f22617k.get(G);
                        if (ubVar != null) {
                            ubVar.b(imageReceiver);
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
        m.f3 f3Var = (m.f3) this.f26636c;
        ByteBuffer byteBuffer = (ByteBuffer) this.d;
        MediaController mediaController = (MediaController) f3Var.f19102b;
        while (byteBuffer.hasRemaining()) {
            int remaining = byteBuffer.remaining();
            ByteBuffer byteBuffer2 = mediaController.f21304y1;
            if (remaining > byteBuffer2.remaining()) {
                i7 = byteBuffer.limit();
                byteBuffer.limit(byteBuffer.position() + byteBuffer2.remaining());
            } else {
                i7 = -1;
            }
            byteBuffer2.put(byteBuffer);
            int position2 = byteBuffer2.position();
            int limit = byteBuffer2.limit();
            boolean z9 = this.f26635b;
            if (position2 == limit || z9) {
                if (!z9) {
                    position = byteBuffer2.limit();
                } else {
                    position = byteBuffer.position();
                }
                writeFrame = mediaController.writeFrame(byteBuffer2, position);
                if (writeFrame != 0) {
                    byteBuffer2.rewind();
                    mediaController.f21273k1 += (byteBuffer2.limit() / 2) / (mediaController.A1 / 1000);
                    mediaController.l1++;
                } else {
                    a8.d("writing frame failed");
                }
            }
            if (i7 != -1) {
                byteBuffer.limit(i7);
            }
        }
        mediaController.M1.c(new y4(24, f3Var, byteBuffer));
    }

    private final void d() {
        SQLiteCursor queryFinalized;
        TLRPC.Message message;
        NativeByteBuffer byteBufferValue;
        ui uiVar = (ui) this.f26636c;
        xr xrVar = (xr) this.d;
        try {
            if (xrVar.f26506b != 0) {
                SQLiteDatabase sQLiteDatabase = uiVar.getMessagesStorage().f26690b;
                Locale locale = Locale.US;
                long j3 = xrVar.f26505a;
                long j10 = xrVar.f26506b;
                queryFinalized = sQLiteDatabase.queryFinalized("SELECT info FROM bot_keyboard_topics WHERE uid = " + j3 + " AND tid = " + j10, new Object[0]);
            } else {
                SQLiteDatabase sQLiteDatabase2 = uiVar.getMessagesStorage().f26690b;
                Locale locale2 = Locale.US;
                long j11 = xrVar.f26505a;
                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT info FROM bot_keyboard WHERE uid = " + j11, new Object[0]);
            }
            if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                message = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                byteBufferValue.reuse();
            } else {
                message = null;
            }
            queryFinalized.dispose();
            if (message == null && !this.f26635b) {
                return;
            }
            g0.h3(new qg(uiVar, message, xrVar));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    private final void f() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yf.f():void");
    }

    private final void g() {
        yr yrVar = (yr) this.f26636c;
        yrVar.x1((vo) this.d, this.f26635b);
        yrVar.j(false);
        g0.h3(new qq(yrVar, 17));
    }

    private final void h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yf.h():void");
    }

    private final void i() {
        int i7;
        yr yrVar = (yr) this.f26636c;
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.d;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = yrVar.f26690b.executeFast("UPDATE enc_chats SET seq_in = ?, seq_out = ?, use_count = ?, in_seq_no = ?, mtproto_seq = ? WHERE uid = ?");
                sQLitePreparedStatement.bindInteger(1, encryptedChat.seq_in);
                sQLitePreparedStatement.bindInteger(2, encryptedChat.seq_out);
                sQLitePreparedStatement.bindInteger(3, (encryptedChat.key_use_count_in << 16) | encryptedChat.key_use_count_out);
                sQLitePreparedStatement.bindInteger(4, encryptedChat.in_seq_no);
                sQLitePreparedStatement.bindInteger(5, encryptedChat.mtproto_seq);
                sQLitePreparedStatement.bindInteger(6, encryptedChat.f26960id);
                sQLitePreparedStatement.step();
                if (this.f26635b && (i7 = encryptedChat.in_seq_no) != 0) {
                    long j3 = (int) (encryptedChat.f26960id & 4294967295L);
                    SQLiteDatabase sQLiteDatabase = yrVar.f26690b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM messages_v2 WHERE mid IN (SELECT m.mid FROM messages_v2 as m LEFT JOIN messages_seq as s ON m.mid = s.mid WHERE m.uid = " + j3 + " AND m.date = 0 AND m.mid < 0 AND s.seq_out <= " + i7 + ") AND uid = " + j3).stepThis().dispose();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                yrVar.o(e10, true);
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

    public yf(Object obj, boolean z9, Object obj2, int i7) {
        this.f26634a = i7;
        this.f26636c = obj;
        this.f26635b = z9;
        this.d = obj2;
    }
}
