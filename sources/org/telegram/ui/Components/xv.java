package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public abstract class xv implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList f34855a;
    public ArrayList f34856b;
    public ArrayList[] f34857c;
    public final int d;
    public boolean e = false;
    public final aw f34858f;

    public xv(int i10, ArrayList arrayList, aw awVar) {
        this.f34858f = awVar;
        this.d = i10;
        this.f34855a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i11;
        ArrayList<Long> arrayList;
        if (i10 >= 0) {
            ArrayList[] arrayListArr = this.f34857c;
            if (i10 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i10] = new ArrayList();
                    for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i12);
                        if (document == null) {
                            this.f34857c[i10].add(null);
                        } else {
                            ?? obj = new Object();
                            long j10 = document.f22034id;
                            for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i13).documents) == null || !arrayList.contains(Long.valueOf(j10))); i13++) {
                            }
                            obj.f34385a = tL_messages_stickerSet;
                            obj.f34386b = document.f22034id;
                            this.f34857c[i10].add(obj);
                            if (this.f34858f.H) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i11 = 10;
                                } else {
                                    i11 = 16;
                                }
                                if (this.f34857c[i10].size() >= i11) {
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
                    this.f34857c[i10].add(null);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.jk jkVar;
        org.telegram.ui.ActionBar.u6 u6Var;
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            for (int i12 = 0; i12 < this.f34856b.size(); i12++) {
                if (this.f34856b.get(i12) == null) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(this.d).getStickerSet((TLRPC.InputStickerSet) this.f34855a.get(i12), true);
                    if (this.f34856b.size() == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        aw awVar = this.f34858f;
                        awVar.dismiss();
                        Context context = awVar.getContext();
                        org.telegram.ui.ActionBar.r2 r2Var = awVar.f26674c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f34855a.get(i12);
                        org.telegram.ui.ActionBar.r2 r2Var2 = awVar.f26674c;
                        if (r2Var2 instanceof org.telegram.ui.wn) {
                            jkVar = ((org.telegram.ui.wn) r2Var2).Y;
                        } else {
                            jkVar = null;
                        }
                        org.telegram.ui.jk jkVar2 = jkVar;
                        u6Var = ((org.telegram.ui.ActionBar.k3) awVar).resourcesProvider;
                        new dz0(context, r2Var, inputStickerSet, null, jkVar2, u6Var).show();
                        return;
                    }
                    this.f34856b.set(i12, stickerSet2);
                    if (stickerSet2 != null) {
                        a(i12, stickerSet2);
                    }
                }
            }
            aw awVar2 = ((kv) this).h;
            awVar2.k0();
            fi.v vVar = awVar2.h;
            if (vVar != null && vVar.getAdapter() != null) {
                vVar.getAdapter().l();
            }
        }
    }
}
