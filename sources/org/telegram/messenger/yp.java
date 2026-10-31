package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class yp implements Runnable {
    public final int f19419a;
    public final hs f19420b;
    public final int f19421c;

    public yp(hs hsVar, int i10, int i11) {
        this.f19419a = i11;
        this.f19420b = hsVar;
        this.f19421c = i10;
    }

    @Override
    public final void run() {
        SQLiteCursor queryFinalized;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10 = this.f19419a;
        SQLiteCursor sQLiteCursor = null;
        int i11 = this.f19421c;
        hs hsVar = this.f19420b;
        switch (i10) {
            case 0:
                vp messagesController = hsVar.getMessagesController();
                d20 userConfig = messagesController.getUserConfig();
                int i12 = this.f19421c;
                if (userConfig.g(i12)[0] == 2147483647L) {
                    if (i12 == 1) {
                        messagesController.f18824k0 = false;
                        messagesController.D();
                        return;
                    }
                    messagesController.f4(i12);
                    return;
                }
                messagesController.S2(i12, 0, 10, false, new bl(messagesController, i12, 2));
                return;
            case 1:
                hsVar.getDownloadController().t(i11);
                return;
            case 2:
                hsVar.getClass();
                try {
                    hsVar.f15940b.executeFast("DELETE FROM shortcut_widget WHERE id = " + i11).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    hsVar.o(e, true);
                    return;
                }
            case 3:
                hs hsVar2 = this.f19420b;
                try {
                    try {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        a0.h hVar = new a0.h();
                        if (i11 >= 0) {
                            queryFinalized = hsVar2.f15940b.queryFinalized(String.format(Locale.US, "SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0 AND folder_id = %1$d", Integer.valueOf(i11)), new Object[0]);
                        } else {
                            queryFinalized = hsVar2.f15940b.queryFinalized("SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0", new Object[0]);
                        }
                        while (queryFinalized.next()) {
                            try {
                                long longValue = queryFinalized.longValue(0);
                                if (!o5.D(longValue)) {
                                    ?? obj = new Object();
                                    obj.f15303a = queryFinalized.intValue(1);
                                    obj.f15305c = queryFinalized.intValue(2);
                                    obj.f15304b = queryFinalized.intValue(3);
                                    hVar.k(obj, longValue);
                                    if (!o5.C(longValue)) {
                                        if (o5.z(longValue)) {
                                            long j10 = -longValue;
                                            if (!arrayList2.contains(Long.valueOf(j10))) {
                                                arrayList2.add(Long.valueOf(j10));
                                            }
                                        } else if (!arrayList.contains(Long.valueOf(longValue))) {
                                            arrayList.add(Long.valueOf(longValue));
                                        }
                                    } else {
                                        int i13 = (int) (longValue & 4294967295L);
                                        if (!arrayList3.contains(Integer.valueOf(i13))) {
                                            arrayList3.add(Integer.valueOf(i13));
                                        }
                                    }
                                }
                            } catch (Exception e7) {
                                e = e7;
                                sQLiteCursor = queryFinalized;
                                hsVar2.o(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteCursor = queryFinalized;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        }
                        queryFinalized.dispose();
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        if (!arrayList3.isEmpty()) {
                            hsVar2.V(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        }
                        if (!arrayList.isEmpty()) {
                            hsVar2.n0(arrayList, arrayList4, false);
                        }
                        if (!arrayList2.isEmpty()) {
                            hsVar2.Q(TextUtils.join(",", arrayList2), arrayList5);
                        }
                        i0.g3(new cn(hsVar2, arrayList4, arrayList5, arrayList6, hVar, 13));
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e10) {
                    e = e10;
                }
            case 4:
                hsVar.l(i11);
                return;
            case 5:
                try {
                    if (i11 == 0) {
                        hsVar.f15940b.executeFast("DELETE FROM download_queue WHERE 1").stepThis().dispose();
                    } else {
                        SQLiteDatabase sQLiteDatabase = hsVar.f15940b;
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM download_queue WHERE type = " + i11).stepThis().dispose();
                    }
                    return;
                } catch (Exception e11) {
                    hsVar.o(e11, true);
                    return;
                }
            default:
                try {
                    try {
                        ArrayList arrayList7 = new ArrayList();
                        SQLiteDatabase sQLiteDatabase2 = hsVar.f15940b;
                        Locale locale2 = Locale.US;
                        SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT uid, type, data, parent FROM download_queue WHERE type = " + i11 + " ORDER BY date DESC LIMIT 3", new Object[0]);
                        while (queryFinalized2.next()) {
                            try {
                                ?? obj2 = new Object();
                                obj2.f14914b = queryFinalized2.intValue(1);
                                obj2.f14915c = queryFinalized2.longValue(0);
                                obj2.f14916f = queryFinalized2.stringValue(3);
                                NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(2);
                                if (byteBufferValue != null) {
                                    TLRPC.MessageMedia TLdeserialize = TLRPC.MessageMedia.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    byteBufferValue.reuse();
                                    TLRPC.Document document = TLdeserialize.document;
                                    if (document != null) {
                                        obj2.f14913a = document;
                                        if (!jj.K4(document)) {
                                            if (!jj.Q4(TLdeserialize.document)) {
                                                if (jj.i4(TLdeserialize.document)) {
                                                }
                                                z12 = false;
                                                obj2.d = z12;
                                            }
                                        }
                                        int i14 = TLdeserialize.ttl_seconds;
                                        if ((i14 > 0 && i14 <= 60) || i14 == Integer.MAX_VALUE) {
                                            z12 = true;
                                            obj2.d = z12;
                                        }
                                        z12 = false;
                                        obj2.d = z12;
                                    } else {
                                        TLRPC.Photo photo = TLdeserialize.photo;
                                        if (photo != null) {
                                            obj2.f14913a = photo;
                                            int i15 = TLdeserialize.ttl_seconds;
                                            if ((i15 > 0 && i15 <= 60) || i15 == Integer.MAX_VALUE) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            obj2.d = z10;
                                        }
                                    }
                                    if ((TLdeserialize.flags & Integer.MIN_VALUE) != 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    obj2.e = z11;
                                }
                                arrayList7.add(obj2);
                            } catch (Exception e12) {
                                e = e12;
                                sQLiteCursor = queryFinalized2;
                                hsVar.o(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                sQLiteCursor = queryFinalized2;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        }
                        queryFinalized2.dispose();
                        i0.g3(new zp(hsVar, i11, arrayList7, 3));
                        return;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Exception e13) {
                    e = e13;
                }
        }
    }
}
