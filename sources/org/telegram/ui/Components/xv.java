package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public abstract class xv implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList f32460a;
    public ArrayList f32461b;
    public ArrayList[] f32462c;
    public final int d;
    public boolean e = false;
    public final aw f32463f;

    public xv(int i10, ArrayList arrayList, aw awVar) {
        this.f32463f = awVar;
        this.d = i10;
        this.f32460a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i11;
        ArrayList<Long> arrayList;
        if (i10 >= 0) {
            ArrayList[] arrayListArr = this.f32462c;
            if (i10 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i10] = new ArrayList();
                    for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i12);
                        if (document == null) {
                            this.f32462c[i10].add(null);
                        } else {
                            ?? obj = new Object();
                            long j10 = document.f20281id;
                            for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i13).documents) == null || !arrayList.contains(Long.valueOf(j10))); i13++) {
                            }
                            obj.f32222a = tL_messages_stickerSet;
                            obj.f32223b = document.f20281id;
                            this.f32462c[i10].add(obj);
                            if (this.f32463f.H) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i11 = 10;
                                } else {
                                    i11 = 16;
                                }
                                if (this.f32462c[i10].size() >= i11) {
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
                    this.f32462c[i10].add(null);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.fk fkVar;
        org.telegram.ui.ActionBar.d6 d6Var;
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            for (int i12 = 0; i12 < this.f32461b.size(); i12++) {
                if (this.f32461b.get(i12) == null) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(this.d).getStickerSet((TLRPC.InputStickerSet) this.f32460a.get(i12), true);
                    if (this.f32461b.size() == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        aw awVar = this.f32463f;
                        awVar.dismiss();
                        Context context = awVar.getContext();
                        org.telegram.ui.ActionBar.n2 n2Var = awVar.f24715c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f32460a.get(i12);
                        org.telegram.ui.ActionBar.n2 n2Var2 = awVar.f24715c;
                        if (n2Var2 instanceof org.telegram.ui.qn) {
                            fkVar = ((org.telegram.ui.qn) n2Var2).Y;
                        } else {
                            fkVar = null;
                        }
                        org.telegram.ui.fk fkVar2 = fkVar;
                        d6Var = ((org.telegram.ui.ActionBar.f3) awVar).resourcesProvider;
                        new py0(context, n2Var, inputStickerSet, null, fkVar2, d6Var).show();
                        return;
                    }
                    this.f32461b.set(i12, stickerSet2);
                    if (stickerSet2 != null) {
                        a(i12, stickerSet2);
                    }
                }
            }
            aw awVar2 = ((jv) this).h;
            awVar2.b0();
            ei.v vVar = awVar2.h;
            if (vVar != null && vVar.getAdapter() != null) {
                vVar.getAdapter().l();
            }
        }
    }
}
