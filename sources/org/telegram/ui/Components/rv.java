package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public abstract class rv implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList f28066a;
    public ArrayList f28067b;
    public ArrayList[] f28068c;
    public final int d;
    public boolean e = false;
    public final uv f28069f;

    public rv(int i10, ArrayList arrayList, uv uvVar) {
        this.f28069f = uvVar;
        this.d = i10;
        this.f28066a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i11;
        ArrayList<Long> arrayList;
        if (i10 >= 0) {
            ArrayList[] arrayListArr = this.f28068c;
            if (i10 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i10] = new ArrayList();
                    for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i12);
                        if (document == null) {
                            this.f28068c[i10].add(null);
                        } else {
                            ?? obj = new Object();
                            long j3 = document.f18341id;
                            for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i13).documents) == null || !arrayList.contains(Long.valueOf(j3))); i13++) {
                            }
                            obj.f28076a = tL_messages_stickerSet;
                            obj.f28077b = document.f18341id;
                            this.f28068c[i10].add(obj);
                            if (this.f28069f.H) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i11 = 10;
                                } else {
                                    i11 = 16;
                                }
                                if (this.f28068c[i10].size() >= i11) {
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
                    this.f28068c[i10].add(null);
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
            for (int i12 = 0; i12 < this.f28067b.size(); i12++) {
                if (this.f28067b.get(i12) == null) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(this.d).getStickerSet((TLRPC.InputStickerSet) this.f28066a.get(i12), true);
                    if (this.f28067b.size() == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        uv uvVar = this.f28069f;
                        uvVar.dismiss();
                        Context context = uvVar.getContext();
                        org.telegram.ui.ActionBar.m2 m2Var = uvVar.f28912c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f28066a.get(i12);
                        org.telegram.ui.ActionBar.m2 m2Var2 = uvVar.f28912c;
                        if (m2Var2 instanceof org.telegram.ui.wn) {
                            jkVar = ((org.telegram.ui.wn) m2Var2).Y;
                        } else {
                            jkVar = null;
                        }
                        org.telegram.ui.jk jkVar2 = jkVar;
                        d6Var = ((org.telegram.ui.ActionBar.e3) uvVar).resourcesProvider;
                        new gy0(context, m2Var, inputStickerSet, null, jkVar2, d6Var).show();
                        return;
                    }
                    this.f28067b.set(i12, stickerSet2);
                    if (stickerSet2 != null) {
                        a(i12, stickerSet2);
                    }
                }
            }
            uv uvVar2 = ((ev) this).h;
            uvVar2.a0();
            ci.v vVar = uvVar2.h;
            if (vVar != null && vVar.getAdapter() != null) {
                vVar.getAdapter().l();
            }
        }
    }
}
