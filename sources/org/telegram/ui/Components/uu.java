package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class uu implements org.telegram.messenger.is {
    public final ArrayList f40160a;
    public ArrayList f40161b;
    public ArrayList[] f40162c;
    public final int d;
    public boolean f40163e = false;
    public final wu f40164f;

    public uu(int i7, ArrayList arrayList, wu wuVar) {
        this.f40164f = wuVar;
        this.d = i7;
        this.f40160a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i7, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10;
        ArrayList<Long> arrayList;
        if (i7 >= 0) {
            ArrayList[] arrayListArr = this.f40162c;
            if (i7 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i7] = new ArrayList();
                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
                        if (document == null) {
                            this.f40162c[i7].add(null);
                        } else {
                            ?? obj = new Object();
                            long j3 = document.f28057id;
                            for (int i12 = 0; i12 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i12).documents) == null || !arrayList.contains(Long.valueOf(j3))); i12++) {
                            }
                            obj.f39067a = tL_messages_stickerSet;
                            obj.f39068b = document.f28057id;
                            this.f40162c[i7].add(obj);
                            if (this.f40164f.C1) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i10 = 10;
                                } else {
                                    i10 = 16;
                                }
                                if (this.f40162c[i7].size() >= i10) {
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
                    this.f40162c[i7].add(null);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.qj qjVar;
        if (i7 == org.telegram.messenger.ns.B0) {
            for (int i11 = 0; i11 < this.f40161b.size(); i11++) {
                if (this.f40161b.get(i11) == null) {
                    TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.si.b0(this.d).m0((TLRPC.InputStickerSet) this.f40160a.get(i11), true);
                    if (this.f40161b.size() == 1 && m0 != null && (stickerSet = m0.set) != null && !stickerSet.emojis) {
                        wu wuVar = this.f40164f;
                        wuVar.dismiss();
                        Context context = wuVar.getContext();
                        org.telegram.ui.ActionBar.e2 e2Var = wuVar.n1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f40160a.get(i11);
                        org.telegram.ui.ActionBar.e2 e2Var2 = wuVar.n1;
                        if (e2Var2 instanceof org.telegram.ui.an) {
                            qjVar = ((org.telegram.ui.an) e2Var2).f45117a0;
                        } else {
                            qjVar = null;
                        }
                        new bw0(context, e2Var, inputStickerSet, null, qjVar, wuVar.J0).show();
                        return;
                    }
                    this.f40161b.set(i11, m0);
                    if (m0 != null) {
                        a(i11, m0);
                    }
                }
            }
            wu wuVar2 = ((iu) this).h;
            wuVar2.N0();
            hi.v vVar = wuVar2.f41453r1;
            if (vVar != null && vVar.getAdapter() != null) {
                vVar.getAdapter().f();
            }
        }
    }
}
