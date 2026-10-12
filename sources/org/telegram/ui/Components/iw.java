package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public abstract class iw implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList f27287a;
    public ArrayList f27288b;
    public ArrayList[] f27289c;
    public final int d;
    public boolean f27290e = false;
    public final lw f27291f;

    public iw(int i10, ArrayList arrayList, lw lwVar) {
        this.f27291f = lwVar;
        this.d = i10;
        this.f27287a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i11;
        ArrayList<Long> arrayList;
        if (i10 >= 0) {
            ArrayList[] arrayListArr = this.f27289c;
            if (i10 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i10] = new ArrayList();
                    for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i12);
                        if (document == null) {
                            this.f27289c[i10].add(null);
                        } else {
                            ?? obj = new Object();
                            long j3 = document.f19809id;
                            for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i13).documents) == null || !arrayList.contains(Long.valueOf(j3))); i13++) {
                            }
                            obj.f27303a = tL_messages_stickerSet;
                            obj.f27304b = document.f19809id;
                            this.f27289c[i10].add(obj);
                            if (this.f27291f.H) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i11 = 10;
                                } else {
                                    i11 = 16;
                                }
                                if (this.f27289c[i10].size() >= i11) {
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
                    this.f27289c[i10].add(null);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.sk skVar;
        org.telegram.ui.ActionBar.c6 c6Var;
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            for (int i12 = 0; i12 < this.f27288b.size(); i12++) {
                if (this.f27288b.get(i12) == null) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(this.d).getStickerSet((TLRPC.InputStickerSet) this.f27287a.get(i12), true);
                    if (this.f27288b.size() == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        lw lwVar = this.f27291f;
                        lwVar.dismiss();
                        Context context = lwVar.getContext();
                        org.telegram.ui.ActionBar.m2 m2Var = lwVar.f28288c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f27287a.get(i12);
                        org.telegram.ui.ActionBar.m2 m2Var2 = lwVar.f28288c;
                        if (m2Var2 instanceof org.telegram.ui.eo) {
                            skVar = ((org.telegram.ui.eo) m2Var2).Y;
                        } else {
                            skVar = null;
                        }
                        org.telegram.ui.sk skVar2 = skVar;
                        c6Var = ((org.telegram.ui.ActionBar.e3) lwVar).resourcesProvider;
                        new dz0(context, m2Var, inputStickerSet, null, skVar2, c6Var).show();
                        return;
                    }
                    this.f27288b.set(i12, stickerSet2);
                    if (stickerSet2 != null) {
                        a(i12, stickerSet2);
                    }
                }
            }
            lw lwVar2 = ((vv) this).h;
            lwVar2.b0();
            ci.v vVar = lwVar2.h;
            if (vVar != null && vVar.getAdapter() != null) {
                vVar.getAdapter().l();
            }
        }
    }
}
