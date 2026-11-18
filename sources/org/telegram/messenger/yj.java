package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yj implements Runnable {
    public final int f28148a;
    public final int f28149b;
    public final Object f28150c;
    public final Object d;
    public final Object f28151e;
    public final Object f28152f;

    public yj(Object obj, Object obj2, int i7, Object obj3, Object obj4, int i10) {
        this.f28148a = i10;
        this.f28150c = obj;
        this.d = obj2;
        this.f28149b = i7;
        this.f28151e = obj3;
        this.f28152f = obj4;
    }

    private final void a() {
        TLRPC.MessageMedia messageMedia;
        tr trVar = (tr) this.f28150c;
        String str = (String) this.d;
        TLObject tLObject = (TLObject) this.f28151e;
        int i7 = this.f28149b;
        String str2 = (String) this.f28152f;
        trVar.getClass();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                String a10 = Utilities.a(str);
                if (a10 != null) {
                    if (tLObject instanceof TLRPC.Photo) {
                        messageMedia = new TLRPC.TL_messageMediaPhoto();
                        messageMedia.photo = (TLRPC.Photo) tLObject;
                        messageMedia.flags |= 1;
                    } else if (tLObject instanceof TLRPC.Document) {
                        messageMedia = new TLRPC.TL_messageMediaDocument();
                        messageMedia.document = (TLRPC.Document) tLObject;
                        messageMedia.flags |= 1;
                    } else {
                        messageMedia = null;
                    }
                    if (messageMedia != null) {
                        sQLitePreparedStatement = trVar.f27056b.executeFast("REPLACE INTO sent_files_v2 VALUES(?, ?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageMedia.getObjectSize());
                        messageMedia.serializeToStream(nativeByteBuffer);
                        sQLitePreparedStatement.bindString(1, a10);
                        sQLitePreparedStatement.bindInteger(2, i7);
                        sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer);
                        sQLitePreparedStatement.bindString(4, str2);
                        sQLitePreparedStatement.step();
                        nativeByteBuffer.reuse();
                    } else {
                        return;
                    }
                }
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            } catch (Exception e10) {
                trVar.o(e10, true);
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

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yj.run():void");
    }

    public yj(Object obj, Object obj2, Object obj3, Object obj4, int i7, int i10) {
        this.f28148a = i10;
        this.f28150c = obj;
        this.d = obj2;
        this.f28151e = obj3;
        this.f28152f = obj4;
        this.f28149b = i7;
    }

    public yj(c1 c1Var, Serializable serializable, Object obj, int i7, Serializable serializable2, int i10) {
        this.f28148a = i10;
        this.f28150c = c1Var;
        this.d = serializable;
        this.f28151e = obj;
        this.f28149b = i7;
        this.f28152f = serializable2;
    }

    public yj(qz qzVar, int i7, ArrayList arrayList, a0.h hVar, a0.h hVar2) {
        this.f28148a = 6;
        this.f28150c = qzVar;
        this.f28149b = i7;
        this.d = arrayList;
        this.f28151e = hVar;
        this.f28152f = hVar2;
    }
}
