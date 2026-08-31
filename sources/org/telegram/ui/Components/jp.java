package org.telegram.ui.Components;

import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jp implements Runnable {
    public final int f28175a;
    public final Object f28176b;
    public final Object f28177c;
    public final Object d;

    public jp(Object obj, Object obj2, Object obj3, int i10) {
        this.f28175a = i10;
        this.f28176b = obj;
        this.f28177c = obj2;
        this.d = obj3;
    }

    private final void a() {
        yx0.w((yx0) this.f28176b, (ArrayList) this.f28177c, (Boolean) this.d);
    }

    private final void b() {
        yx0.D((yx0) this.f28176b, (TLRPC.TL_error) this.d, (TLObject) this.f28177c);
    }

    private final void c() {
        yx0.F((yx0) this.f28176b, (String) this.f28177c, (TextView) this.d);
    }

    private final void e() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jp.e():void");
    }

    private final void f() {
        int i10;
        int i11;
        e51 e51Var = (e51) this.f28176b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.f28177c;
        SparseArray sparseArray = e51Var.f26438f;
        ArrayList arrayList = e51Var.f26437e;
        ArrayList arrayList2 = e51Var.f26439n;
        SparseArray sparseArray2 = e51Var.d;
        e51Var.f26440r = false;
        if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_featuredStickers)) {
            ArrayList<TLRPC.StickerSetCovered> arrayList3 = ((TLRPC.TL_messages_featuredStickers) tLObject).sets;
            if (arrayList3.size() < 40) {
                e51Var.f26441s = true;
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList2.isEmpty()) {
                    int i12 = e51Var.f26442w;
                    e51Var.f26442w = i12 + 1;
                    sparseArray2.put(i12, -1);
                }
                arrayList2.addAll(arrayList3);
                int size = arrayList.size();
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    TLRPC.StickerSetCovered stickerSetCovered = arrayList3.get(i13);
                    if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                        arrayList.add(stickerSetCovered);
                        sparseArray.put(e51Var.f26442w, stickerSetCovered);
                        int i14 = e51Var.f26442w;
                        e51Var.f26442w = i14 + 1;
                        int i15 = size + 1;
                        sparseArray2.put(i14, Integer.valueOf(size));
                        if (!stickerSetCovered.covers.isEmpty()) {
                            i10 = (int) Math.ceil(stickerSetCovered.covers.size() / e51Var.v);
                            for (int i16 = 0; i16 < stickerSetCovered.covers.size(); i16++) {
                                sparseArray2.put(e51Var.f26442w + i16, stickerSetCovered.covers.get(i16));
                            }
                        } else {
                            sparseArray2.put(e51Var.f26442w, stickerSetCovered.cover);
                            i10 = 1;
                        }
                        int i17 = 0;
                        while (true) {
                            i11 = e51Var.v * i10;
                            if (i17 >= i11) {
                                break;
                            }
                            sparseArray.put(e51Var.f26442w + i17, stickerSetCovered);
                            i17++;
                        }
                        e51Var.f26442w = i11 + e51Var.f26442w;
                        size = i15;
                    }
                }
                e51Var.l();
                return;
            }
            return;
        }
        e51Var.f26441s = true;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jp.run():void");
    }

    public jp(Object obj, Object obj2, TLObject tLObject, int i10) {
        this.f28175a = i10;
        this.f28176b = obj;
        this.d = obj2;
        this.f28177c = tLObject;
    }

    public jp(fe0 fe0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z4) {
        this.f28175a = 11;
        this.f28176b = fe0Var;
        this.d = tL_error;
        this.f28177c = tLObject;
    }
}
