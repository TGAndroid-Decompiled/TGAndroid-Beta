package org.telegram.messenger;

import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yj implements Runnable {
    public final int f26591a;
    public final Object f26592b;
    public final long f26593c;
    public final int d;
    public final Object f26594e;

    public yj(int i3, int i10, long j10, Object obj, Object obj2) {
        this.f26591a = i10;
        this.f26592b = obj;
        this.f26594e = obj2;
        this.f26593c = j10;
        this.d = i3;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yj.a():void");
    }

    private final void b() {
        oz ozVar = (oz) this.f26592b;
        qr qrVar = (qr) this.f26594e;
        long j10 = this.f26593c;
        int i3 = this.d;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabase = qrVar.f24936b;
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j10 + " AND mid > 0 AND type = 4 ORDER BY date DESC, mid DESC", new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    TLdeserialize.readAttachPath(byteBufferValue, h10.i(i3).f22848n);
                    byteBufferValue.reuse();
                    if (zi.L3(TLdeserialize)) {
                        TLdeserialize.f27022id = queryFinalized.intValue(1);
                        TLdeserialize.dialog_id = j10;
                        zi ziVar = new zi(i3, TLdeserialize, false, true);
                        arrayList.add(ziVar);
                        arrayList2.add(new MediaSessionCompat$QueueItem(null, new MediaDescriptionCompat(j10 + "_" + arrayList.size(), ziVar.z1(true), ziVar.x1(true), null, null, null, null, null), arrayList2.size()));
                    }
                }
            }
            queryFinalized.dispose();
            Collections.reverse(arrayList);
            Collections.reverse(arrayList2);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        g0.h3(new z1(ozVar, i3, j10, arrayList, arrayList2, 6));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yj.run():void");
    }

    public yj(c1 c1Var, long j10, int i3, Object obj, int i10) {
        this.f26591a = i10;
        this.f26592b = c1Var;
        this.f26593c = j10;
        this.d = i3;
        this.f26594e = obj;
    }

    public yj(c1 c1Var, long j10, TLObject tLObject, int i3, int i10) {
        this.f26591a = i10;
        this.f26592b = c1Var;
        this.f26593c = j10;
        this.f26594e = tLObject;
        this.d = i3;
    }

    public yj(qr qrVar, int i3, long j10, TLObject tLObject, int i10) {
        this.f26591a = i10;
        this.f26592b = qrVar;
        this.d = i3;
        this.f26593c = j10;
        this.f26594e = tLObject;
    }
}
