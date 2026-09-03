package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public abstract class iv implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList f25774a;
    public ArrayList f25775b;
    public ArrayList[] f25776c;
    public final int d;
    public boolean e = false;
    public final lv f25777f;

    public iv(int i10, ArrayList arrayList, lv lvVar) {
        this.f25777f = lvVar;
        this.d = i10;
        this.f25774a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i11;
        ArrayList<Long> arrayList;
        if (i10 >= 0) {
            ArrayList[] arrayListArr = this.f25776c;
            if (i10 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i10] = new ArrayList();
                    for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i12);
                        if (document == null) {
                            this.f25776c[i10].add(null);
                        } else {
                            ?? obj = new Object();
                            long j10 = document.f19165id;
                            for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i13).documents) == null || !arrayList.contains(Long.valueOf(j10))); i13++) {
                            }
                            obj.f27394a = tL_messages_stickerSet;
                            obj.f27395b = document.f19165id;
                            this.f25776c[i10].add(obj);
                            if (this.f25777f.E) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i11 = 10;
                                } else {
                                    i11 = 16;
                                }
                                if (this.f25776c[i10].size() >= i11) {
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
                    this.f25776c[i10].add(null);
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
            for (int i12 = 0; i12 < this.f25775b.size(); i12++) {
                if (this.f25775b.get(i12) == null) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(this.d).getStickerSet((TLRPC.InputStickerSet) this.f25774a.get(i12), true);
                    if (this.f25775b.size() == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        lv lvVar = this.f25777f;
                        lvVar.dismiss();
                        Context context = lvVar.getContext();
                        org.telegram.ui.ActionBar.p2 p2Var = lvVar.f26879c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f25774a.get(i12);
                        org.telegram.ui.ActionBar.p2 p2Var2 = lvVar.f26879c;
                        if (p2Var2 instanceof org.telegram.ui.zn) {
                            lkVar = ((org.telegram.ui.zn) p2Var2).V;
                        } else {
                            lkVar = null;
                        }
                        org.telegram.ui.lk lkVar2 = lkVar;
                        f6Var = ((org.telegram.ui.ActionBar.g3) lvVar).resourcesProvider;
                        new xx0(context, p2Var, inputStickerSet, null, lkVar2, f6Var).show();
                        return;
                    }
                    this.f25775b.set(i12, stickerSet2);
                    if (stickerSet2 != null) {
                        a(i12, stickerSet2);
                    }
                }
            }
            lv lvVar2 = ((vu) this).h;
            lvVar2.a0();
            org.telegram.ui.m3 m3Var = lvVar2.h;
            if (m3Var != null && m3Var.getAdapter() != null) {
                m3Var.getAdapter().l();
            }
        }
    }
}
