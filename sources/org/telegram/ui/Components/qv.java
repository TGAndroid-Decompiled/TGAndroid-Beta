package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public abstract class qv implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList f27463a;
    public ArrayList f27464b;
    public ArrayList[] f27465c;
    public final int d;
    public boolean e = false;
    public final tv f27466f;

    public qv(int i10, ArrayList arrayList, tv tvVar) {
        this.f27466f = tvVar;
        this.d = i10;
        this.f27463a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i11;
        ArrayList<Long> arrayList;
        if (i10 >= 0) {
            ArrayList[] arrayListArr = this.f27465c;
            if (i10 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i10] = new ArrayList();
                    for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i12);
                        if (document == null) {
                            this.f27465c[i10].add(null);
                        } else {
                            ?? obj = new Object();
                            long j3 = document.f18089id;
                            for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i13).documents) == null || !arrayList.contains(Long.valueOf(j3))); i13++) {
                            }
                            obj.f27173a = tL_messages_stickerSet;
                            obj.f27174b = document.f18089id;
                            this.f27465c[i10].add(obj);
                            if (this.f27466f.H) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i11 = 10;
                                } else {
                                    i11 = 16;
                                }
                                if (this.f27465c[i10].size() >= i11) {
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
                    this.f27465c[i10].add(null);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.jk jkVar;
        org.telegram.ui.ActionBar.d6 d6Var;
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            for (int i12 = 0; i12 < this.f27464b.size(); i12++) {
                if (this.f27464b.get(i12) == null) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(this.d).getStickerSet((TLRPC.InputStickerSet) this.f27463a.get(i12), true);
                    if (this.f27464b.size() == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        tv tvVar = this.f27466f;
                        tvVar.dismiss();
                        Context context = tvVar.getContext();
                        org.telegram.ui.ActionBar.n2 n2Var = tvVar.f28305c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f27463a.get(i12);
                        org.telegram.ui.ActionBar.n2 n2Var2 = tvVar.f28305c;
                        if (n2Var2 instanceof org.telegram.ui.xn) {
                            jkVar = ((org.telegram.ui.xn) n2Var2).Y;
                        } else {
                            jkVar = null;
                        }
                        org.telegram.ui.jk jkVar2 = jkVar;
                        d6Var = ((org.telegram.ui.ActionBar.f3) tvVar).resourcesProvider;
                        new ux0(context, n2Var, inputStickerSet, null, jkVar2, d6Var).show();
                        return;
                    }
                    this.f27464b.set(i12, stickerSet2);
                    if (stickerSet2 != null) {
                        a(i12, stickerSet2);
                    }
                }
            }
            tv tvVar2 = ((dv) this).h;
            tvVar2.a0();
            ci.v vVar = tvVar2.h;
            if (vVar != null && vVar.getAdapter() != null) {
                vVar.getAdapter().l();
            }
        }
    }
}
