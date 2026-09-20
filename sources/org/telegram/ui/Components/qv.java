package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public abstract class qv implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList f27669a;
    public ArrayList f27670b;
    public ArrayList[] f27671c;
    public final int d;
    public boolean e = false;
    public final tv f27672f;

    public qv(int i10, ArrayList arrayList, tv tvVar) {
        this.f27672f = tvVar;
        this.d = i10;
        this.f27669a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i11;
        ArrayList<Long> arrayList;
        if (i10 >= 0) {
            ArrayList[] arrayListArr = this.f27671c;
            if (i10 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i10] = new ArrayList();
                    for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i12);
                        if (document == null) {
                            this.f27671c[i10].add(null);
                        } else {
                            ?? obj = new Object();
                            long j3 = document.f18334id;
                            for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i13).documents) == null || !arrayList.contains(Long.valueOf(j3))); i13++) {
                            }
                            obj.f27455a = tL_messages_stickerSet;
                            obj.f27456b = document.f18334id;
                            this.f27671c[i10].add(obj);
                            if (this.f27672f.H) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i11 = 10;
                                } else {
                                    i11 = 16;
                                }
                                if (this.f27671c[i10].size() >= i11) {
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
                    this.f27671c[i10].add(null);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.lk lkVar;
        org.telegram.ui.ActionBar.f6 f6Var;
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            for (int i12 = 0; i12 < this.f27670b.size(); i12++) {
                if (this.f27670b.get(i12) == null) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(this.d).getStickerSet((TLRPC.InputStickerSet) this.f27669a.get(i12), true);
                    if (this.f27670b.size() == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        tv tvVar = this.f27672f;
                        tvVar.dismiss();
                        Context context = tvVar.getContext();
                        org.telegram.ui.ActionBar.n2 n2Var = tvVar.f28451c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f27669a.get(i12);
                        org.telegram.ui.ActionBar.n2 n2Var2 = tvVar.f28451c;
                        if (n2Var2 instanceof org.telegram.ui.zn) {
                            lkVar = ((org.telegram.ui.zn) n2Var2).Y;
                        } else {
                            lkVar = null;
                        }
                        org.telegram.ui.lk lkVar2 = lkVar;
                        f6Var = ((org.telegram.ui.ActionBar.f3) tvVar).resourcesProvider;
                        new gy0(context, n2Var, inputStickerSet, null, lkVar2, f6Var).show();
                        return;
                    }
                    this.f27670b.set(i12, stickerSet2);
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
