package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class cv implements org.telegram.messenger.fs {
    public final ArrayList f34309a;
    public ArrayList f34310b;
    public ArrayList[] f34311c;
    public final int d;
    public boolean f34312e = false;
    public final ev f34313f;

    public cv(int i7, ArrayList arrayList, ev evVar) {
        this.f34313f = evVar;
        this.d = i7;
        this.f34309a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i7, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10;
        ArrayList<Long> arrayList;
        if (i7 >= 0) {
            ArrayList[] arrayListArr = this.f34311c;
            if (i7 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i7] = new ArrayList();
                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
                        if (document == null) {
                            this.f34311c[i7].add(null);
                        } else {
                            ?? obj = new Object();
                            long j3 = document.f28437id;
                            for (int i12 = 0; i12 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i12).documents) == null || !arrayList.contains(Long.valueOf(j3))); i12++) {
                            }
                            obj.f42993a = tL_messages_stickerSet;
                            obj.f42994b = document.f28437id;
                            this.f34311c[i7].add(obj);
                            if (this.f34313f.C1) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i10 = 10;
                                } else {
                                    i10 = 16;
                                }
                                if (this.f34311c[i7].size() >= i10) {
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
                    this.f34311c[i7].add(null);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.rj rjVar;
        if (i7 == org.telegram.messenger.ks.B0) {
            for (int i11 = 0; i11 < this.f34310b.size(); i11++) {
                if (this.f34310b.get(i11) == null) {
                    TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ri.d0(this.d).o0((TLRPC.InputStickerSet) this.f34309a.get(i11), true);
                    if (this.f34310b.size() == 1 && o02 != null && (stickerSet = o02.set) != null && !stickerSet.emojis) {
                        ev evVar = this.f34313f;
                        evVar.dismiss();
                        Context context = evVar.getContext();
                        org.telegram.ui.ActionBar.g2 g2Var = evVar.n1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f34309a.get(i11);
                        org.telegram.ui.ActionBar.g2 g2Var2 = evVar.n1;
                        if (g2Var2 instanceof org.telegram.ui.bn) {
                            rjVar = ((org.telegram.ui.bn) g2Var2).f45946a0;
                        } else {
                            rjVar = null;
                        }
                        new kw0(context, g2Var, inputStickerSet, null, rjVar, evVar.J0).show();
                        return;
                    }
                    this.f34310b.set(i11, o02);
                    if (o02 != null) {
                        a(i11, o02);
                    }
                }
            }
            ev evVar2 = ((qu) this).h;
            evVar2.O0();
            hi.x xVar = evVar2.f34996r1;
            if (xVar != null && xVar.getAdapter() != null) {
                xVar.getAdapter().f();
            }
        }
    }
}
