package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public abstract class ov implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList f29217a;
    public ArrayList f29218b;
    public ArrayList[] f29219c;
    public final int d;
    public boolean f29220e = false;
    public final rv f29221f;

    public ov(int i10, ArrayList arrayList, rv rvVar) {
        this.f29221f = rvVar;
        this.d = i10;
        this.f29217a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i11;
        ArrayList<Long> arrayList;
        if (i10 >= 0) {
            ArrayList[] arrayListArr = this.f29219c;
            if (i10 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i10] = new ArrayList();
                    for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i12);
                        if (document == null) {
                            this.f29219c[i10].add(null);
                        } else {
                            ?? obj = new Object();
                            long j3 = document.f19902id;
                            for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i13).documents) == null || !arrayList.contains(Long.valueOf(j3))); i13++) {
                            }
                            obj.f29536a = tL_messages_stickerSet;
                            obj.f29537b = document.f19902id;
                            this.f29219c[i10].add(obj);
                            if (this.f29221f.H) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i11 = 10;
                                } else {
                                    i11 = 16;
                                }
                                if (this.f29219c[i10].size() >= i11) {
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
                    this.f29219c[i10].add(null);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.mk mkVar;
        org.telegram.ui.ActionBar.f6 f6Var;
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            for (int i12 = 0; i12 < this.f29218b.size(); i12++) {
                if (this.f29218b.get(i12) == null) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(this.d).getStickerSet((TLRPC.InputStickerSet) this.f29217a.get(i12), true);
                    if (this.f29218b.size() == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        rv rvVar = this.f29221f;
                        rvVar.dismiss();
                        Context context = rvVar.getContext();
                        org.telegram.ui.ActionBar.n2 n2Var = rvVar.f30121c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f29217a.get(i12);
                        org.telegram.ui.ActionBar.n2 n2Var2 = rvVar.f30121c;
                        if (n2Var2 instanceof org.telegram.ui.co) {
                            mkVar = ((org.telegram.ui.co) n2Var2).Y;
                        } else {
                            mkVar = null;
                        }
                        org.telegram.ui.mk mkVar2 = mkVar;
                        f6Var = ((org.telegram.ui.ActionBar.f3) rvVar).resourcesProvider;
                        new ux0(context, n2Var, inputStickerSet, null, mkVar2, f6Var).show();
                        return;
                    }
                    this.f29218b.set(i12, stickerSet2);
                    if (stickerSet2 != null) {
                        a(i12, stickerSet2);
                    }
                }
            }
            rv rvVar2 = ((bv) this).h;
            rvVar2.a0();
            di.v vVar = rvVar2.h;
            if (vVar != null && vVar.getAdapter() != null) {
                vVar.getAdapter().l();
            }
        }
    }
}
