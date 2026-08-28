package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public abstract class av implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList f26908a;
    public ArrayList f26909b;
    public ArrayList[] f26910c;
    public final int d;
    public boolean f26911e = false;
    public final dv f26912f;

    public av(int i9, ArrayList arrayList, dv dvVar) {
        this.f26912f = dvVar;
        this.d = i9;
        this.f26908a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i9, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10;
        ArrayList<Long> arrayList;
        if (i9 >= 0) {
            ArrayList[] arrayListArr = this.f26910c;
            if (i9 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i9] = new ArrayList();
                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
                        if (document == null) {
                            this.f26910c[i9].add(null);
                        } else {
                            ?? obj = new Object();
                            long j10 = document.f22386id;
                            for (int i12 = 0; i12 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i12).documents) == null || !arrayList.contains(Long.valueOf(j10))); i12++) {
                            }
                            obj.f27299a = tL_messages_stickerSet;
                            obj.f27300b = document.f22386id;
                            this.f26910c[i9].add(obj);
                            if (this.f26912f.D) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i10 = 10;
                                } else {
                                    i10 = 16;
                                }
                                if (this.f26910c[i9].size() >= i10) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    return;
                }
                arrayListArr[i9] = new ArrayList(12);
                for (int i13 = 0; i13 < 12; i13++) {
                    this.f26910c[i9].add(null);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.ak akVar;
        org.telegram.ui.ActionBar.b6 b6Var;
        if (i9 == NotificationCenter.groupStickersDidLoad) {
            for (int i11 = 0; i11 < this.f26909b.size(); i11++) {
                if (this.f26909b.get(i11) == null) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(this.d).getStickerSet((TLRPC.InputStickerSet) this.f26908a.get(i11), true);
                    if (this.f26909b.size() == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        dv dvVar = this.f26912f;
                        dvVar.dismiss();
                        Context context = dvVar.getContext();
                        org.telegram.ui.ActionBar.o2 o2Var = dvVar.f27815c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f26908a.get(i11);
                        org.telegram.ui.ActionBar.o2 o2Var2 = dvVar.f27815c;
                        if (o2Var2 instanceof org.telegram.ui.qn) {
                            akVar = ((org.telegram.ui.qn) o2Var2).U;
                        } else {
                            akVar = null;
                        }
                        org.telegram.ui.ak akVar2 = akVar;
                        b6Var = ((org.telegram.ui.ActionBar.f3) dvVar).resourcesProvider;
                        new cx0(context, o2Var, inputStickerSet, null, akVar2, b6Var).show();
                        return;
                    }
                    this.f26909b.set(i11, stickerSet2);
                    if (stickerSet2 != null) {
                        a(i11, stickerSet2);
                    }
                }
            }
            dv dvVar2 = ((nu) this).h;
            dvVar2.Z();
            kh.w wVar = dvVar2.h;
            if (wVar != null && wVar.getAdapter() != null) {
                wVar.getAdapter().l();
            }
        }
    }
}
