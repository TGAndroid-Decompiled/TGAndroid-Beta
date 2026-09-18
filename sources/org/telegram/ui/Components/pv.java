package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public abstract class pv implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList f27326a;
    public ArrayList f27327b;
    public ArrayList[] f27328c;
    public final int d;
    public boolean e = false;
    public final sv f27329f;

    public pv(int i10, ArrayList arrayList, sv svVar) {
        this.f27329f = svVar;
        this.d = i10;
        this.f27326a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i11;
        ArrayList<Long> arrayList;
        if (i10 >= 0) {
            ArrayList[] arrayListArr = this.f27328c;
            if (i10 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i10] = new ArrayList();
                    for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i12);
                        if (document == null) {
                            this.f27328c[i10].add(null);
                        } else {
                            ?? obj = new Object();
                            long j3 = document.f18302id;
                            for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i13).documents) == null || !arrayList.contains(Long.valueOf(j3))); i13++) {
                            }
                            obj.f27333a = tL_messages_stickerSet;
                            obj.f27334b = document.f18302id;
                            this.f27328c[i10].add(obj);
                            if (this.f27329f.H) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i11 = 10;
                                } else {
                                    i11 = 16;
                                }
                                if (this.f27328c[i10].size() >= i11) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    return;
                }
                arrayListArr[i10] = new ArrayList(12);
                for (int i14 = 0; i14 < 12; i14++) {
                    this.f27328c[i10].add(null);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.lk lkVar;
        org.telegram.ui.ActionBar.e6 e6Var;
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            for (int i12 = 0; i12 < this.f27327b.size(); i12++) {
                if (this.f27327b.get(i12) == null) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(this.d).getStickerSet((TLRPC.InputStickerSet) this.f27326a.get(i12), true);
                    if (this.f27327b.size() == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        sv svVar = this.f27329f;
                        svVar.dismiss();
                        Context context = svVar.getContext();
                        org.telegram.ui.ActionBar.n2 n2Var = svVar.f28232c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f27326a.get(i12);
                        org.telegram.ui.ActionBar.n2 n2Var2 = svVar.f28232c;
                        if (n2Var2 instanceof org.telegram.ui.zn) {
                            lkVar = ((org.telegram.ui.zn) n2Var2).Y;
                        } else {
                            lkVar = null;
                        }
                        org.telegram.ui.lk lkVar2 = lkVar;
                        e6Var = ((org.telegram.ui.ActionBar.f3) svVar).resourcesProvider;
                        new hy0(context, n2Var, inputStickerSet, null, lkVar2, e6Var).show();
                        return;
                    }
                    this.f27327b.set(i12, stickerSet2);
                    if (stickerSet2 != null) {
                        a(i12, stickerSet2);
                    }
                }
            }
            sv svVar2 = ((cv) this).h;
            svVar2.a0();
            ci.v vVar = svVar2.h;
            if (vVar != null && vVar.getAdapter() != null) {
                vVar.getAdapter().l();
            }
        }
    }
}
