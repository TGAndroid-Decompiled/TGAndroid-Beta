package org.telegram.ui.Components;

import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jp implements Runnable {
    public final int f28155a;
    public final Object f28156b;
    public final Object f28157c;
    public final Object d;

    public jp(Object obj, Object obj2, Object obj3, int i10) {
        this.f28155a = i10;
        this.f28156b = obj;
        this.f28157c = obj2;
        this.d = obj3;
    }

    private final void a() {
        xx0.w((xx0) this.f28156b, (ArrayList) this.f28157c, (Boolean) this.d);
    }

    private final void b() {
        xx0.D((xx0) this.f28156b, (TLRPC.TL_error) this.d, (TLObject) this.f28157c);
    }

    private final void c() {
        xx0.F((xx0) this.f28156b, (String) this.f28157c, (TextView) this.d);
    }

    private final void e() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jp.e():void");
    }

    private final void f() {
        int i10;
        int i11;
        c51 c51Var = (c51) this.f28156b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.f28157c;
        SparseArray sparseArray = c51Var.f25775f;
        ArrayList arrayList = c51Var.f25774e;
        ArrayList arrayList2 = c51Var.f25776n;
        SparseArray sparseArray2 = c51Var.d;
        c51Var.f25777r = false;
        if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_featuredStickers)) {
            ArrayList<TLRPC.StickerSetCovered> arrayList3 = ((TLRPC.TL_messages_featuredStickers) tLObject).sets;
            if (arrayList3.size() < 40) {
                c51Var.f25778s = true;
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList2.isEmpty()) {
                    int i12 = c51Var.f25779w;
                    c51Var.f25779w = i12 + 1;
                    sparseArray2.put(i12, -1);
                }
                arrayList2.addAll(arrayList3);
                int size = arrayList.size();
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    TLRPC.StickerSetCovered stickerSetCovered = arrayList3.get(i13);
                    if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                        arrayList.add(stickerSetCovered);
                        sparseArray.put(c51Var.f25779w, stickerSetCovered);
                        int i14 = c51Var.f25779w;
                        c51Var.f25779w = i14 + 1;
                        int i15 = size + 1;
                        sparseArray2.put(i14, Integer.valueOf(size));
                        if (!stickerSetCovered.covers.isEmpty()) {
                            i10 = (int) Math.ceil(stickerSetCovered.covers.size() / c51Var.v);
                            for (int i16 = 0; i16 < stickerSetCovered.covers.size(); i16++) {
                                sparseArray2.put(c51Var.f25779w + i16, stickerSetCovered.covers.get(i16));
                            }
                        } else {
                            sparseArray2.put(c51Var.f25779w, stickerSetCovered.cover);
                            i10 = 1;
                        }
                        int i17 = 0;
                        while (true) {
                            i11 = c51Var.v * i10;
                            if (i17 >= i11) {
                                break;
                            }
                            sparseArray.put(c51Var.f25779w + i17, stickerSetCovered);
                            i17++;
                        }
                        c51Var.f25779w = i11 + c51Var.f25779w;
                        size = i15;
                    }
                }
                c51Var.l();
                return;
            }
            return;
        }
        c51Var.f25778s = true;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jp.run():void");
    }

    public jp(Object obj, Object obj2, TLObject tLObject, int i10) {
        this.f28155a = i10;
        this.f28156b = obj;
        this.d = obj2;
        this.f28157c = tLObject;
    }

    public jp(fe0 fe0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z4) {
        this.f28155a = 11;
        this.f28156b = fe0Var;
        this.d = tL_error;
        this.f28157c = tLObject;
    }
}
