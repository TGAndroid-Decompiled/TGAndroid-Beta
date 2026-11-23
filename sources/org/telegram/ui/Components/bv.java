package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class bv implements org.telegram.messenger.gs {
    public final ArrayList f33890a;
    public ArrayList f33891b;
    public ArrayList[] f33892c;
    public final int d;
    public boolean f33893e = false;
    public final dv f33894f;

    public bv(int i7, ArrayList arrayList, dv dvVar) {
        this.f33894f = dvVar;
        this.d = i7;
        this.f33890a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i7, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10;
        ArrayList<Long> arrayList;
        if (i7 >= 0) {
            ArrayList[] arrayListArr = this.f33892c;
            if (i7 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i7] = new ArrayList();
                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
                        if (document == null) {
                            this.f33892c[i7].add(null);
                        } else {
                            ?? obj = new Object();
                            long j3 = document.f28404id;
                            for (int i12 = 0; i12 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i12).documents) == null || !arrayList.contains(Long.valueOf(j3))); i12++) {
                            }
                            obj.f42962a = tL_messages_stickerSet;
                            obj.f42963b = document.f28404id;
                            this.f33892c[i7].add(obj);
                            if (this.f33894f.C1) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i10 = 10;
                                } else {
                                    i10 = 16;
                                }
                                if (this.f33892c[i7].size() >= i10) {
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
                    this.f33892c[i7].add(null);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.rj rjVar;
        if (i7 == org.telegram.messenger.ls.B0) {
            for (int i11 = 0; i11 < this.f33891b.size(); i11++) {
                if (this.f33891b.get(i11) == null) {
                    TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.si.d0(this.d).o0((TLRPC.InputStickerSet) this.f33890a.get(i11), true);
                    if (this.f33891b.size() == 1 && o02 != null && (stickerSet = o02.set) != null && !stickerSet.emojis) {
                        dv dvVar = this.f33894f;
                        dvVar.dismiss();
                        Context context = dvVar.getContext();
                        org.telegram.ui.ActionBar.g2 g2Var = dvVar.n1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f33890a.get(i11);
                        org.telegram.ui.ActionBar.g2 g2Var2 = dvVar.n1;
                        if (g2Var2 instanceof org.telegram.ui.bn) {
                            rjVar = ((org.telegram.ui.bn) g2Var2).f45903a0;
                        } else {
                            rjVar = null;
                        }
                        new kw0(context, g2Var, inputStickerSet, null, rjVar, dvVar.J0).show();
                        return;
                    }
                    this.f33891b.set(i11, o02);
                    if (o02 != null) {
                        a(i11, o02);
                    }
                }
            }
            dv dvVar2 = ((pu) this).h;
            dvVar2.O0();
            hi.v vVar = dvVar2.f34573r1;
            if (vVar != null && vVar.getAdapter() != null) {
                vVar.getAdapter().f();
            }
        }
    }
}
