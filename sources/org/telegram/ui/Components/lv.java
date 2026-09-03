package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public abstract class lv implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList f28882a;
    public ArrayList f28883b;
    public ArrayList[] f28884c;
    public final int d;
    public boolean f28885e = false;
    public final ov f28886f;

    public lv(int i10, ArrayList arrayList, ov ovVar) {
        this.f28886f = ovVar;
        this.d = i10;
        this.f28882a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i11;
        ArrayList<Long> arrayList;
        if (i10 >= 0) {
            ArrayList[] arrayListArr = this.f28884c;
            if (i10 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i10] = new ArrayList();
                    for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i12);
                        if (document == null) {
                            this.f28884c[i10].add(null);
                        } else {
                            ?? obj = new Object();
                            long j10 = document.f20851id;
                            for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i13).documents) == null || !arrayList.contains(Long.valueOf(j10))); i13++) {
                            }
                            obj.f30227a = tL_messages_stickerSet;
                            obj.f30228b = document.f20851id;
                            this.f28884c[i10].add(obj);
                            if (this.f28886f.E) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i11 = 10;
                                } else {
                                    i11 = 16;
                                }
                                if (this.f28884c[i10].size() >= i11) {
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
                    this.f28884c[i10].add(null);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.jk jkVar;
        org.telegram.ui.ActionBar.g6 g6Var;
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            for (int i12 = 0; i12 < this.f28883b.size(); i12++) {
                if (this.f28883b.get(i12) == null) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(this.d).getStickerSet((TLRPC.InputStickerSet) this.f28882a.get(i12), true);
                    if (this.f28883b.size() == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        ov ovVar = this.f28886f;
                        ovVar.dismiss();
                        Context context = ovVar.getContext();
                        org.telegram.ui.ActionBar.p2 p2Var = ovVar.f29899c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f28882a.get(i12);
                        org.telegram.ui.ActionBar.p2 p2Var2 = ovVar.f29899c;
                        if (p2Var2 instanceof org.telegram.ui.xn) {
                            jkVar = ((org.telegram.ui.xn) p2Var2).V;
                        } else {
                            jkVar = null;
                        }
                        org.telegram.ui.jk jkVar2 = jkVar;
                        g6Var = ((org.telegram.ui.ActionBar.h3) ovVar).resourcesProvider;
                        new xx0(context, p2Var, inputStickerSet, null, jkVar2, g6Var).show();
                        return;
                    }
                    this.f28883b.set(i12, stickerSet2);
                    if (stickerSet2 != null) {
                        a(i12, stickerSet2);
                    }
                }
            }
            ov ovVar2 = ((yu) this).h;
            ovVar2.a0();
            org.telegram.ui.k3 k3Var = ovVar2.h;
            if (k3Var != null && k3Var.getAdapter() != null) {
                k3Var.getAdapter().l();
            }
        }
    }
}
