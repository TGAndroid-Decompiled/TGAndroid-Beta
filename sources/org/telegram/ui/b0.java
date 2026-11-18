package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class b0 implements Runnable {
    public final int f45701a;
    public final Object f45702b;
    public final int f45703c;
    public final Object d;

    public b0(int i7, Object obj, Object obj2, int i10) {
        this.f45701a = i10;
        this.f45703c = i7;
        this.f45702b = obj;
        this.d = obj2;
    }

    private final void a() {
        int i7 = this.f45703c;
        TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) this.f45702b;
        Integer num = (Integer) this.d;
        try {
            SQLiteDatabase sQLiteDatabase = org.telegram.messenger.tr.a0(i7).f27054b;
            if (sQLiteDatabase != null) {
                if (tL_messages_emojiGroups == null) {
                    sQLiteDatabase.executeFast("DELETE FROM emoji_groups WHERE type = " + num).stepThis().dispose();
                    return;
                }
                SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO emoji_groups VALUES(?, ?)");
                executeFast.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_emojiGroups.getObjectSize());
                tL_messages_emojiGroups.serializeToStream(nativeByteBuffer);
                executeFast.bindInteger(1, num.intValue());
                executeFast.bindByteBuffer(2, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
                executeFast.dispose();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    private final void b() {
        org.telegram.ui.Components.yw0 yw0Var = (org.telegram.ui.Components.yw0) this.f45702b;
        String str = (String) this.d;
        ArrayList arrayList = new ArrayList(1);
        ?? obj = new Object();
        obj.f25927a = str;
        obj.f25928b = null;
        arrayList.add(obj);
        org.telegram.messenger.ri.d0(yw0Var.f42643a).Q(arrayList, 15, false, false, new org.telegram.ui.Components.kp0(yw0Var, this.f45703c, str, arrayList));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b0.run():void");
    }

    public b0(Object obj, int i7, Object obj2, int i10) {
        this.f45701a = i10;
        this.f45702b = obj;
        this.f45703c = i7;
        this.d = obj2;
    }

    public b0(Object obj, Object obj2, int i7, int i10) {
        this.f45701a = i10;
        this.f45702b = obj;
        this.d = obj2;
        this.f45703c = i7;
    }

    public b0(String str, int i7, org.telegram.ui.ActionBar.x2[] x2VarArr) {
        this.f45701a = 4;
        this.d = str;
        this.f45703c = i7;
        this.f45702b = x2VarArr;
    }

    public b0(e4 e4Var, int i7, int[] iArr, int[] iArr2) {
        this.f45701a = 3;
        this.f45702b = e4Var;
        this.f45703c = i7;
        this.d = iArr2;
    }
}
