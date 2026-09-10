package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public abstract class tv implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList f27495a;
    public ArrayList f27496b;
    public ArrayList[] f27497c;
    public final int d;
    public boolean e = false;
    public final wv f27498f;

    public tv(int i10, ArrayList arrayList, wv wvVar) {
        this.f27498f = wvVar;
        this.d = i10;
        this.f27495a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i11;
        ArrayList<Long> arrayList;
        if (i10 >= 0) {
            ArrayList[] arrayListArr = this.f27497c;
            if (i10 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i10] = new ArrayList();
                    for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i12);
                        if (document == null) {
                            this.f27497c[i10].add(null);
                        } else {
                            ?? obj = new Object();
                            long j3 = document.f17201id;
                            for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i13).documents) == null || !arrayList.contains(Long.valueOf(j3))); i13++) {
                            }
                            obj.f27757a = tL_messages_stickerSet;
                            obj.f27758b = document.f17201id;
                            this.f27497c[i10].add(obj);
                            if (this.f27498f.H) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i11 = 10;
                                } else {
                                    i11 = 16;
                                }
                                if (this.f27497c[i10].size() >= i11) {
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
                    this.f27497c[i10].add(null);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.ok okVar;
        org.telegram.ui.ActionBar.f6 f6Var;
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            for (int i12 = 0; i12 < this.f27496b.size(); i12++) {
                if (this.f27496b.get(i12) == null) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(this.d).getStickerSet((TLRPC.InputStickerSet) this.f27495a.get(i12), true);
                    if (this.f27496b.size() == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        wv wvVar = this.f27498f;
                        wvVar.dismiss();
                        Context context = wvVar.getContext();
                        org.telegram.ui.ActionBar.p2 p2Var = wvVar.f28842c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f27495a.get(i12);
                        org.telegram.ui.ActionBar.p2 p2Var2 = wvVar.f28842c;
                        if (p2Var2 instanceof org.telegram.ui.eo) {
                            okVar = ((org.telegram.ui.eo) p2Var2).Y;
                        } else {
                            okVar = null;
                        }
                        org.telegram.ui.ok okVar2 = okVar;
                        f6Var = ((org.telegram.ui.ActionBar.h3) wvVar).resourcesProvider;
                        new hy0(context, p2Var, inputStickerSet, null, okVar2, f6Var).show();
                        return;
                    }
                    this.f27496b.set(i12, stickerSet2);
                    if (stickerSet2 != null) {
                        a(i12, stickerSet2);
                    }
                }
            }
            wv wvVar2 = ((gv) this).h;
            wvVar2.a0();
            bi.z zVar = wvVar2.h;
            if (zVar != null && zVar.getAdapter() != null) {
                zVar.getAdapter().l();
            }
        }
    }
}
