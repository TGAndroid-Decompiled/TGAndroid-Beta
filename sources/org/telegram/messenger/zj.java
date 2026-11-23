package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zj implements Runnable {
    public final int f28306a;
    public final int f28307b;
    public final Object f28308c;
    public final Object d;
    public final Object f28309e;
    public final Object f28310f;

    public zj(Object obj, Object obj2, int i7, Object obj3, Object obj4, int i10) {
        this.f28306a = i10;
        this.f28308c = obj;
        this.d = obj2;
        this.f28307b = i7;
        this.f28309e = obj3;
        this.f28310f = obj4;
    }

    private final void a() {
        TLRPC.MessageMedia messageMedia;
        ur urVar = (ur) this.f28308c;
        String str = (String) this.d;
        TLObject tLObject = (TLObject) this.f28309e;
        int i7 = this.f28307b;
        String str2 = (String) this.f28310f;
        urVar.getClass();
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
                        sQLitePreparedStatement = urVar.f27216b.executeFast("REPLACE INTO sent_files_v2 VALUES(?, ?, ?, ?)");
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

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zj.run():void");
    }

    public zj(Object obj, Object obj2, Object obj3, Object obj4, int i7, int i10) {
        this.f28306a = i10;
        this.f28308c = obj;
        this.d = obj2;
        this.f28309e = obj3;
        this.f28310f = obj4;
        this.f28307b = i7;
    }

    public zj(c1 c1Var, Serializable serializable, Object obj, int i7, Serializable serializable2, int i10) {
        this.f28306a = i10;
        this.f28308c = c1Var;
        this.d = serializable;
        this.f28309e = obj;
        this.f28307b = i7;
        this.f28310f = serializable2;
    }

    public zj(rz rzVar, int i7, ArrayList arrayList, a0.h hVar, a0.h hVar2) {
        this.f28306a = 6;
        this.f28308c = rzVar;
        this.f28307b = i7;
        this.d = arrayList;
        this.f28309e = hVar;
        this.f28310f = hVar2;
    }
}
