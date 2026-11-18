package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class zu implements org.telegram.messenger.fs {
    public final ArrayList f42945a;
    public ArrayList f42946b;
    public ArrayList[] f42947c;
    public final int d;
    public boolean f42948e = false;
    public final bv f42949f;

    public zu(int i7, ArrayList arrayList, bv bvVar) {
        this.f42949f = bvVar;
        this.d = i7;
        this.f42945a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i7, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10;
        ArrayList<Long> arrayList;
        if (i7 >= 0) {
            ArrayList[] arrayListArr = this.f42947c;
            if (i7 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i7] = new ArrayList();
                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
                        if (document == null) {
                            this.f42947c[i7].add(null);
                        } else {
                            ?? obj = new Object();
                            long j3 = document.f28411id;
                            for (int i12 = 0; i12 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i12).documents) == null || !arrayList.contains(Long.valueOf(j3))); i12++) {
                            }
                            obj.f42198a = tL_messages_stickerSet;
                            obj.f42199b = document.f28411id;
                            this.f42947c[i7].add(obj);
                            if (this.f42949f.C1) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i10 = 10;
                                } else {
                                    i10 = 16;
                                }
                                if (this.f42947c[i7].size() >= i10) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    return;
                }
                arrayListArr[i7] = new ArrayList(12);
                for (int i13 = 0; i13 < 12; i13++) {
                    this.f42947c[i7].add(null);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.rj rjVar;
        if (i7 == org.telegram.messenger.ks.B0) {
            for (int i11 = 0; i11 < this.f42946b.size(); i11++) {
                if (this.f42946b.get(i11) == null) {
                    TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ri.d0(this.d).o0((TLRPC.InputStickerSet) this.f42945a.get(i11), true);
                    if (this.f42946b.size() == 1 && o02 != null && (stickerSet = o02.set) != null && !stickerSet.emojis) {
                        bv bvVar = this.f42949f;
                        bvVar.dismiss();
                        Context context = bvVar.getContext();
                        org.telegram.ui.ActionBar.h2 h2Var = bvVar.n1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f42945a.get(i11);
                        org.telegram.ui.ActionBar.h2 h2Var2 = bvVar.n1;
                        if (h2Var2 instanceof org.telegram.ui.bn) {
                            rjVar = ((org.telegram.ui.bn) h2Var2).f45932a0;
                        } else {
                            rjVar = null;
                        }
                        new iw0(context, h2Var, inputStickerSet, null, rjVar, bvVar.J0).show();
                        return;
                    }
                    this.f42946b.set(i11, o02);
                    if (o02 != null) {
                        a(i11, o02);
                    }
                }
            }
            bv bvVar2 = ((nu) this).h;
            bvVar2.O0();
            hi.w wVar = bvVar2.f33788r1;
            if (wVar != null && wVar.getAdapter() != null) {
                wVar.getAdapter().f();
            }
        }
    }
}
