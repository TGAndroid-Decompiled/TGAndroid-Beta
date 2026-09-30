package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public abstract class sv implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList f28373a;
    public ArrayList f28374b;
    public ArrayList[] f28375c;
    public final int d;
    public boolean e = false;
    public final vv f28376f;

    public sv(int i10, ArrayList arrayList, vv vvVar) {
        this.f28376f = vvVar;
        this.d = i10;
        this.f28373a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i11;
        ArrayList<Long> arrayList;
        if (i10 >= 0) {
            ArrayList[] arrayListArr = this.f28375c;
            if (i10 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i10] = new ArrayList();
                    for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i12);
                        if (document == null) {
                            this.f28375c[i10].add(null);
                        } else {
                            ?? obj = new Object();
                            long j3 = document.f18343id;
                            for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i13).documents) == null || !arrayList.contains(Long.valueOf(j3))); i13++) {
                            }
                            obj.f28062a = tL_messages_stickerSet;
                            obj.f28063b = document.f18343id;
                            this.f28375c[i10].add(obj);
                            if (this.f28376f.H) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i11 = 10;
                                } else {
                                    i11 = 16;
                                }
                                if (this.f28375c[i10].size() >= i11) {
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
                    this.f28375c[i10].add(null);
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
            for (int i12 = 0; i12 < this.f28374b.size(); i12++) {
                if (this.f28374b.get(i12) == null) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(this.d).getStickerSet((TLRPC.InputStickerSet) this.f28373a.get(i12), true);
                    if (this.f28374b.size() == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        vv vvVar = this.f28376f;
                        vvVar.dismiss();
                        Context context = vvVar.getContext();
                        org.telegram.ui.ActionBar.m2 m2Var = vvVar.f29735c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f28373a.get(i12);
                        org.telegram.ui.ActionBar.m2 m2Var2 = vvVar.f29735c;
                        if (m2Var2 instanceof org.telegram.ui.wn) {
                            jkVar = ((org.telegram.ui.wn) m2Var2).Y;
                        } else {
                            jkVar = null;
                        }
                        org.telegram.ui.jk jkVar2 = jkVar;
                        d6Var = ((org.telegram.ui.ActionBar.e3) vvVar).resourcesProvider;
                        new hy0(context, m2Var, inputStickerSet, null, jkVar2, d6Var).show();
                        return;
                    }
                    this.f28374b.set(i12, stickerSet2);
                    if (stickerSet2 != null) {
                        a(i12, stickerSet2);
                    }
                }
            }
            vv vvVar2 = ((fv) this).h;
            vvVar2.a0();
            ci.v vVar = vvVar2.h;
            if (vVar != null && vVar.getAdapter() != null) {
                vVar.getAdapter().l();
            }
        }
    }
}
