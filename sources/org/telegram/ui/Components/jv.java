package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public abstract class jv implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList f26048a;
    public ArrayList f26049b;
    public ArrayList[] f26050c;
    public final int d;
    public boolean e = false;
    public final mv f26051f;

    public jv(int i10, ArrayList arrayList, mv mvVar) {
        this.f26051f = mvVar;
        this.d = i10;
        this.f26048a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i11;
        ArrayList<Long> arrayList;
        if (i10 >= 0) {
            ArrayList[] arrayListArr = this.f26050c;
            if (i10 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i10] = new ArrayList();
                    for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i12);
                        if (document == null) {
                            this.f26050c[i10].add(null);
                        } else {
                            ?? obj = new Object();
                            long j10 = document.f19190id;
                            for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i13).documents) == null || !arrayList.contains(Long.valueOf(j10))); i13++) {
                            }
                            obj.f27390a = tL_messages_stickerSet;
                            obj.f27391b = document.f19190id;
                            this.f26050c[i10].add(obj);
                            if (this.f26051f.E) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i11 = 10;
                                } else {
                                    i11 = 16;
                                }
                                if (this.f26050c[i10].size() >= i11) {
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
                    this.f26050c[i10].add(null);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.jk jkVar;
        org.telegram.ui.ActionBar.f6 f6Var;
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            for (int i12 = 0; i12 < this.f26049b.size(); i12++) {
                if (this.f26049b.get(i12) == null) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(this.d).getStickerSet((TLRPC.InputStickerSet) this.f26048a.get(i12), true);
                    if (this.f26049b.size() == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        mv mvVar = this.f26051f;
                        mvVar.dismiss();
                        Context context = mvVar.getContext();
                        org.telegram.ui.ActionBar.p2 p2Var = mvVar.f27124c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f26048a.get(i12);
                        org.telegram.ui.ActionBar.p2 p2Var2 = mvVar.f27124c;
                        if (p2Var2 instanceof org.telegram.ui.xn) {
                            jkVar = ((org.telegram.ui.xn) p2Var2).V;
                        } else {
                            jkVar = null;
                        }
                        org.telegram.ui.jk jkVar2 = jkVar;
                        f6Var = ((org.telegram.ui.ActionBar.g3) mvVar).resourcesProvider;
                        new xx0(context, p2Var, inputStickerSet, null, jkVar2, f6Var).show();
                        return;
                    }
                    this.f26049b.set(i12, stickerSet2);
                    if (stickerSet2 != null) {
                        a(i12, stickerSet2);
                    }
                }
            }
            mv mvVar2 = ((wu) this).h;
            mvVar2.a0();
            org.telegram.ui.k3 k3Var = mvVar2.h;
            if (k3Var != null && k3Var.getAdapter() != null) {
                k3Var.getAdapter().l();
            }
        }
    }
}
