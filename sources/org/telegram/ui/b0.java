package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class b0 implements Runnable {
    public final int f45737a;
    public final Object f45738b;
    public final int f45739c;
    public final Object d;

    public b0(int i7, Object obj, Object obj2, int i10) {
        this.f45737a = i10;
        this.f45739c = i7;
        this.f45738b = obj;
        this.d = obj2;
    }

    private final void a() {
        int i7 = this.f45739c;
        TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) this.f45738b;
        Integer num = (Integer) this.d;
        try {
            SQLiteDatabase sQLiteDatabase = org.telegram.messenger.tr.a0(i7).f27082b;
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
        org.telegram.ui.Components.ax0 ax0Var = (org.telegram.ui.Components.ax0) this.f45738b;
        String str = (String) this.d;
        ArrayList arrayList = new ArrayList(1);
        ?? obj = new Object();
        obj.f25955a = str;
        obj.f25956b = null;
        arrayList.add(obj);
        org.telegram.messenger.ri.d0(ax0Var.f33639a).Q(arrayList, 15, false, false, new org.telegram.ui.Components.mp0(ax0Var, this.f45739c, str, arrayList));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b0.run():void");
    }

    public b0(Object obj, int i7, Object obj2, int i10) {
        this.f45737a = i10;
        this.f45738b = obj;
        this.f45739c = i7;
        this.d = obj2;
    }

    public b0(Object obj, Object obj2, int i7, int i10) {
        this.f45737a = i10;
        this.f45738b = obj;
        this.d = obj2;
        this.f45739c = i7;
    }

    public b0(String str, int i7, org.telegram.ui.ActionBar.w2[] w2VarArr) {
        this.f45737a = 4;
        this.d = str;
        this.f45739c = i7;
        this.f45738b = w2VarArr;
    }

    public b0(e4 e4Var, int i7, int[] iArr, int[] iArr2) {
        this.f45737a = 3;
        this.f45738b = e4Var;
        this.f45739c = i7;
        this.d = iArr2;
    }
}
