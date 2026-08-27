package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

public abstract class zu implements NotificationCenter.NotificationCenterDelegate {

    public final ArrayList f35359a;

    public ArrayList f35360b;

    public ArrayList[] f35361c;
    public final int d;

    public boolean f35362e = false;

    public final cv f35363f;

    public zu(int i10, ArrayList arrayList, cv cvVar) {
        this.f35363f = cvVar;
        this.d = i10;
        this.f35359a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        ArrayList<Long> arrayList;
        if (i10 >= 0) {
            ArrayList[] arrayListArr = this.f35361c;
            if (i10 >= arrayListArr.length) {
                return;
            }
            if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents == null) {
                arrayListArr[i10] = new ArrayList(12);
                for (int i11 = 0; i11 < 12; i11++) {
                    this.f35361c[i10].add(null);
                }
                return;
            }
            arrayListArr[i10] = new ArrayList();
            for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                TLRPC.Document document = tL_messages_stickerSet.documents.get(i12);
                if (document == null) {
                    this.f35361c[i10].add(null);
                } else {
                    bx bxVar = new bx();
                    long j10 = document.f22386id;
                    for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i13).documents) == null || !arrayList.contains(Long.valueOf(j10))); i13++) {
                    }
                    bxVar.f27221a = tL_messages_stickerSet;
                    bxVar.f27222b = document.f22386id;
                    this.f35361c[i10].add(bxVar);
                    if (this.f35363f.D) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (this.f35361c[i10].size() >= ((stickerSet == null || stickerSet.emojis) ? 16 : 10)) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            for (int i12 = 0; i12 < this.f35360b.size(); i12++) {
                if (this.f35360b.get(i12) == null) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(this.d).getStickerSet((TLRPC.InputStickerSet) this.f35359a.get(i12), true);
                    if (this.f35360b.size() == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        cv cvVar = this.f35363f;
                        cvVar.dismiss();
                        Context context = cvVar.getContext();
                        org.telegram.ui.ActionBar.n2 n2Var = cvVar.f27548c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f35359a.get(i12);
                        org.telegram.ui.ActionBar.n2 n2Var2 = cvVar.f27548c;
                        new ex0(context, n2Var, inputStickerSet, null, n2Var2 instanceof org.telegram.ui.rn ? ((org.telegram.ui.rn) n2Var2).U : null, ((org.telegram.ui.ActionBar.e3) cvVar).resourcesProvider).show();
                        return;
                    }
                    this.f35360b.set(i12, stickerSet2);
                    if (stickerSet2 != null) {
                        a(i12, stickerSet2);
                    }
                }
            }
            cv cvVar2 = ((mu) this).h;
            cvVar2.a0();
            lh.w wVar = cvVar2.h;
            if (wVar == null || wVar.getAdapter() == null) {
                return;
            }
            wVar.getAdapter().l();
        }
    }
}
