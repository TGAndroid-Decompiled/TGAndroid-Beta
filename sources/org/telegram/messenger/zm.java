package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class zm implements Runnable {
    public final int f19735a;
    public final f1 f19736b;
    public final long f19737c;
    public final Object d;
    public final Object e;
    public final Object f19738f;

    public zm(f1 f1Var, Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f19735a = i10;
        this.f19736b = f1Var;
        this.d = obj;
        this.f19737c = j10;
        this.e = obj2;
        this.f19738f = obj3;
    }

    private final void a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        u10 u10Var = (u10) this.f19736b;
        p10 p10Var = (p10) this.d;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f19738f;
        long j10 = this.f19737c;
        synchronized (u10Var) {
            arrayList = p10Var.f17551b;
            arrayList2 = p10Var.f17552c;
        }
        if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
            ArrayList<TL_iv.RichMessage> arrayList3 = ((TLRPC.TL_messages_translatedRichMessage) tLObject).result;
            int min = Math.min(arrayList2.size(), arrayList3.size());
            for (int i10 = 0; i10 < min; i10++) {
                ((m20) arrayList2.get(i10)).a((Integer) arrayList.get(i10), arrayList3.get(i10), p10Var.d);
            }
        } else if (tL_error != null && "TO_LANG_INVALID".equals(tL_error.text)) {
            u10Var.K(j10, false);
            at.e().k(at.P4, 1, dd.L0(2131743971, null));
        } else {
            if (tL_error != null && "QUOTA_EXCEEDED".equals(tL_error.text)) {
                at.e().k(at.P4, 1, dd.L0(2131743972, null));
            }
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                ((m20) arrayList2.get(i11)).a((Integer) arrayList.get(i11), null, p10Var.d);
            }
        }
        synchronized (u10Var) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                try {
                    u10Var.f18357x.remove(arrayList.get(i12));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zm.run():void");
    }

    public zm(f1 f1Var, Object obj, Object obj2, TLObject tLObject, long j10, int i10) {
        this.f19735a = i10;
        this.f19736b = f1Var;
        this.d = obj;
        this.e = obj2;
        this.f19738f = tLObject;
        this.f19737c = j10;
    }
}
