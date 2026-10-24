package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public abstract class vv implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList f32049a;
    public ArrayList f32050b;
    public ArrayList[] f32051c;
    public final int d;
    public boolean e = false;
    public final yv f32052f;

    public vv(int i10, ArrayList arrayList, yv yvVar) {
        this.f32052f = yvVar;
        this.d = i10;
        this.f32049a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i11;
        ArrayList<Long> arrayList;
        if (i10 >= 0) {
            ArrayList[] arrayListArr = this.f32051c;
            if (i10 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i10] = new ArrayList();
                    for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i12);
                        if (document == null) {
                            this.f32051c[i10].add(null);
                        } else {
                            ?? obj = new Object();
                            long j10 = document.f20350id;
                            for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i13).documents) == null || !arrayList.contains(Long.valueOf(j10))); i13++) {
                            }
                            obj.f31235a = tL_messages_stickerSet;
                            obj.f31236b = document.f20350id;
                            this.f32051c[i10].add(obj);
                            if (this.f32052f.H) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i11 = 10;
                                } else {
                                    i11 = 16;
                                }
                                if (this.f32051c[i10].size() >= i11) {
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
                    this.f32051c[i10].add(null);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.gk gkVar;
        org.telegram.ui.ActionBar.g6 g6Var;
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            for (int i12 = 0; i12 < this.f32050b.size(); i12++) {
                if (this.f32050b.get(i12) == null) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(this.d).getStickerSet((TLRPC.InputStickerSet) this.f32049a.get(i12), true);
                    if (this.f32050b.size() == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        yv yvVar = this.f32052f;
                        yvVar.dismiss();
                        Context context = yvVar.getContext();
                        org.telegram.ui.ActionBar.o2 o2Var = yvVar.f33049c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f32049a.get(i12);
                        org.telegram.ui.ActionBar.o2 o2Var2 = yvVar.f33049c;
                        if (o2Var2 instanceof org.telegram.ui.sn) {
                            gkVar = ((org.telegram.ui.sn) o2Var2).Y;
                        } else {
                            gkVar = null;
                        }
                        org.telegram.ui.gk gkVar2 = gkVar;
                        g6Var = ((org.telegram.ui.ActionBar.h3) yvVar).resourcesProvider;
                        new sy0(context, o2Var, inputStickerSet, null, gkVar2, g6Var).show();
                        return;
                    }
                    this.f32050b.set(i12, stickerSet2);
                    if (stickerSet2 != null) {
                        a(i12, stickerSet2);
                    }
                }
            }
            yv yvVar2 = ((hv) this).h;
            yvVar2.k0();
            ei.v vVar = yvVar2.h;
            if (vVar != null && vVar.getAdapter() != null) {
                vVar.getAdapter().l();
            }
        }
    }
}
