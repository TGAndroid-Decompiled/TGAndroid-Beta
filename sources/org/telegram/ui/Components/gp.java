package org.telegram.ui.Components;

import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gp implements Runnable {
    public final int f25215a;
    public final Object f25216b;
    public final Object f25217c;
    public final Object d;

    public gp(Object obj, Object obj2, Object obj3, int i10) {
        this.f25215a = i10;
        this.f25216b = obj;
        this.f25217c = obj2;
        this.d = obj3;
    }

    private final void a() {
        xx0.w((xx0) this.f25216b, (ArrayList) this.f25217c, (Boolean) this.d);
    }

    private final void b() {
        xx0.D((xx0) this.f25216b, (TLRPC.TL_error) this.d, (TLObject) this.f25217c);
    }

    private final void c() {
        xx0.F((xx0) this.f25216b, (String) this.f25217c, (TextView) this.d);
    }

    private final void e() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gp.e():void");
    }

    private final void f() {
        int i10;
        int i11;
        d51 d51Var = (d51) this.f25216b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.f25217c;
        SparseArray sparseArray = d51Var.f24173f;
        ArrayList arrayList = d51Var.e;
        ArrayList arrayList2 = d51Var.f24174n;
        SparseArray sparseArray2 = d51Var.d;
        d51Var.f24175r = false;
        if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_featuredStickers)) {
            ArrayList<TLRPC.StickerSetCovered> arrayList3 = ((TLRPC.TL_messages_featuredStickers) tLObject).sets;
            if (arrayList3.size() < 40) {
                d51Var.f24176s = true;
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList2.isEmpty()) {
                    int i12 = d51Var.f24177w;
                    d51Var.f24177w = i12 + 1;
                    sparseArray2.put(i12, -1);
                }
                arrayList2.addAll(arrayList3);
                int size = arrayList.size();
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    TLRPC.StickerSetCovered stickerSetCovered = arrayList3.get(i13);
                    if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                        arrayList.add(stickerSetCovered);
                        sparseArray.put(d51Var.f24177w, stickerSetCovered);
                        int i14 = d51Var.f24177w;
                        d51Var.f24177w = i14 + 1;
                        int i15 = size + 1;
                        sparseArray2.put(i14, Integer.valueOf(size));
                        if (!stickerSetCovered.covers.isEmpty()) {
                            i10 = (int) Math.ceil(stickerSetCovered.covers.size() / d51Var.v);
                            for (int i16 = 0; i16 < stickerSetCovered.covers.size(); i16++) {
                                sparseArray2.put(d51Var.f24177w + i16, stickerSetCovered.covers.get(i16));
                            }
                        } else {
                            sparseArray2.put(d51Var.f24177w, stickerSetCovered.cover);
                            i10 = 1;
                        }
                        int i17 = 0;
                        while (true) {
                            i11 = d51Var.v * i10;
                            if (i17 >= i11) {
                                break;
                            }
                            sparseArray.put(d51Var.f24177w + i17, stickerSetCovered);
                            i17++;
                        }
                        d51Var.f24177w = i11 + d51Var.f24177w;
                        size = i15;
                    }
                }
                d51Var.l();
                return;
            }
            return;
        }
        d51Var.f24176s = true;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gp.run():void");
    }

    public gp(Object obj, Object obj2, TLObject tLObject, int i10) {
        this.f25215a = i10;
        this.f25216b = obj;
        this.d = obj2;
        this.f25217c = tLObject;
    }

    public gp(ee0 ee0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z4) {
        this.f25215a = 11;
        this.f25216b = ee0Var;
        this.d = tL_error;
        this.f25217c = tLObject;
    }
}
