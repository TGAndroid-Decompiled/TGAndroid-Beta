package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public abstract class gv implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList f28999a;
    public ArrayList f29000b;
    public ArrayList[] f29001c;
    public final int d;
    public boolean f29002e = false;
    public final jv f29003f;

    public gv(int i10, ArrayList arrayList, jv jvVar) {
        this.f29003f = jvVar;
        this.d = i10;
        this.f28999a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i11;
        ArrayList<Long> arrayList;
        if (i10 >= 0) {
            ArrayList[] arrayListArr = this.f29001c;
            if (i10 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i10] = new ArrayList();
                    for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i12);
                        if (document == null) {
                            this.f29001c[i10].add(null);
                        } else {
                            ?? obj = new Object();
                            long j10 = document.f22398id;
                            for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i13).documents) == null || !arrayList.contains(Long.valueOf(j10))); i13++) {
                            }
                            obj.f29492a = tL_messages_stickerSet;
                            obj.f29493b = document.f22398id;
                            this.f29001c[i10].add(obj);
                            if (this.f29003f.D) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i11 = 10;
                                } else {
                                    i11 = 16;
                                }
                                if (this.f29001c[i10].size() >= i11) {
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
                    this.f29001c[i10].add(null);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.dk dkVar;
        org.telegram.ui.ActionBar.c6 c6Var;
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            for (int i12 = 0; i12 < this.f29000b.size(); i12++) {
                if (this.f29000b.get(i12) == null) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(this.d).getStickerSet((TLRPC.InputStickerSet) this.f28999a.get(i12), true);
                    if (this.f29000b.size() == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        jv jvVar = this.f29003f;
                        jvVar.dismiss();
                        Context context = jvVar.getContext();
                        org.telegram.ui.ActionBar.o2 o2Var = jvVar.f29824c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f28999a.get(i12);
                        org.telegram.ui.ActionBar.o2 o2Var2 = jvVar.f29824c;
                        if (o2Var2 instanceof org.telegram.ui.tn) {
                            dkVar = ((org.telegram.ui.tn) o2Var2).U;
                        } else {
                            dkVar = null;
                        }
                        org.telegram.ui.dk dkVar2 = dkVar;
                        c6Var = ((org.telegram.ui.ActionBar.f3) jvVar).resourcesProvider;
                        new nx0(context, o2Var, inputStickerSet, null, dkVar2, c6Var).show();
                        return;
                    }
                    this.f29000b.set(i12, stickerSet2);
                    if (stickerSet2 != null) {
                        a(i12, stickerSet2);
                    }
                }
            }
            jv jvVar2 = ((tu) this).h;
            jvVar2.a0();
            nh.v vVar = jvVar2.h;
            if (vVar != null && vVar.getAdapter() != null) {
                vVar.getAdapter().l();
            }
        }
    }
}
