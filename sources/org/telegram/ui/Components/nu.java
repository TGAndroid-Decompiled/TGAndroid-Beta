package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class nu implements org.telegram.messenger.cs {
    public final ArrayList f36621a;
    public ArrayList f36622b;
    public ArrayList[] f36623c;
    public final int d;
    public boolean f36624e = false;
    public final pu f36625f;

    public nu(int i3, ArrayList arrayList, pu puVar) {
        this.f36625f = puVar;
        this.d = i3;
        this.f36621a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i3, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10;
        ArrayList<Long> arrayList;
        if (i3 >= 0) {
            ArrayList[] arrayListArr = this.f36623c;
            if (i3 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i3] = new ArrayList();
                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
                        if (document == null) {
                            this.f36623c[i3].add(null);
                        } else {
                            ?? obj = new Object();
                            long j10 = document.f27007id;
                            for (int i12 = 0; i12 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i12).documents) == null || !arrayList.contains(Long.valueOf(j10))); i12++) {
                            }
                            obj.f35497a = tL_messages_stickerSet;
                            obj.f35498b = document.f27007id;
                            this.f36623c[i3].add(obj);
                            if (this.f36625f.f37254z1) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i10 = 10;
                                } else {
                                    i10 = 16;
                                }
                                if (this.f36623c[i3].size() >= i10) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    return;
                }
                arrayListArr[i3] = new ArrayList(12);
                for (int i13 = 0; i13 < 12; i13++) {
                    this.f36623c[i3].add(null);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.mj mjVar;
        if (i3 == org.telegram.messenger.hs.B0) {
            for (int i11 = 0; i11 < this.f36622b.size(); i11++) {
                if (this.f36622b.get(i11) == null) {
                    TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.li.b0(this.d).m0((TLRPC.InputStickerSet) this.f36621a.get(i11), true);
                    if (this.f36622b.size() == 1 && m0 != null && (stickerSet = m0.set) != null && !stickerSet.emojis) {
                        pu puVar = this.f36625f;
                        puVar.dismiss();
                        Context context = puVar.getContext();
                        org.telegram.ui.ActionBar.d2 d2Var = puVar.k1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f36621a.get(i11);
                        org.telegram.ui.ActionBar.d2 d2Var2 = puVar.k1;
                        if (d2Var2 instanceof org.telegram.ui.wm) {
                            mjVar = ((org.telegram.ui.wm) d2Var2).f51237a0;
                        } else {
                            mjVar = null;
                        }
                        new xv0(context, d2Var, inputStickerSet, null, mjVar, puVar.J0).show();
                        return;
                    }
                    this.f36622b.set(i11, m0);
                    if (m0 != null) {
                        a(i11, m0);
                    }
                }
            }
            pu puVar2 = ((bu) this).h;
            puVar2.N0();
            gi.v vVar = puVar2.f37243o1;
            if (vVar != null && vVar.getAdapter() != null) {
                vVar.getAdapter().f();
            }
        }
    }
}
