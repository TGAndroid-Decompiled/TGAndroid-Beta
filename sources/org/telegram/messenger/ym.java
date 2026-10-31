package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ym implements Runnable {
    public final int f19407a;
    public final f1 f19408b;
    public final long f19409c;
    public final Object d;
    public final Object e;
    public final Object f19410f;

    public ym(f1 f1Var, Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f19407a = i10;
        this.f19408b = f1Var;
        this.d = obj;
        this.f19409c = j10;
        this.e = obj2;
        this.f19410f = obj3;
    }

    private final void a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        t10 t10Var = (t10) this.f19408b;
        o10 o10Var = (o10) this.d;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f19410f;
        long j10 = this.f19409c;
        synchronized (t10Var) {
            arrayList = o10Var.f17214b;
            arrayList2 = o10Var.f17215c;
        }
        if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
            ArrayList<TL_iv.RichMessage> arrayList3 = ((TLRPC.TL_messages_translatedRichMessage) tLObject).result;
            int min = Math.min(arrayList2.size(), arrayList3.size());
            for (int i10 = 0; i10 < min; i10++) {
                ((l20) arrayList2.get(i10)).a((Integer) arrayList.get(i10), arrayList3.get(i10), o10Var.d);
            }
        } else if (tL_error != null && "TO_LANG_INVALID".equals(tL_error.text)) {
            t10Var.K(j10, false);
            zs.e().k(zs.P4, 1, cd.L0(2131743971, null));
        } else {
            if (tL_error != null && "QUOTA_EXCEEDED".equals(tL_error.text)) {
                zs.e().k(zs.P4, 1, cd.L0(2131743972, null));
            }
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                ((l20) arrayList2.get(i11)).a((Integer) arrayList.get(i11), null, o10Var.d);
            }
        }
        synchronized (t10Var) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                try {
                    t10Var.f17991x.remove(arrayList.get(i12));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ym.run():void");
    }

    public ym(f1 f1Var, Object obj, Object obj2, TLObject tLObject, long j10, int i10) {
        this.f19407a = i10;
        this.f19408b = f1Var;
        this.d = obj;
        this.e = obj2;
        this.f19410f = tLObject;
        this.f19409c = j10;
    }
}
